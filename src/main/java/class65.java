import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hk")
public class class65 {

    @OriginalMember(owner = "client!hk", name = "c", descriptor = "Ltl;")
    public static class59 field997 = class85.method639("um", 9588);

    @OriginalMember(owner = "client!hk", name = "d", descriptor = "Lma;")
    public static class263 field998 = null;

    @OriginalMember(owner = "client!hk", name = "g", descriptor = "Ltl;")
    public static class59 field1001 = class85.method639("Fertigkeit: ", 9588);

    @OriginalMember(owner = "client!hk", name = "f", descriptor = "I")
    public static int field1000;

    @OriginalMember(owner = "client!hk", name = "b", descriptor = "I")
    public static int field996;

    @OriginalMember(owner = "client!hk", name = "e", descriptor = "J")
    public static long field999;

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "Loj;")
    public static class260 field995;

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(I)V", line = 9)
    public static void method539(int arg0) {
        field998 = null;
        if (arg0 <= -83) {
            field997 = null;
            field995 = null;
            field1001 = null;
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(IB)Lpi;", line = 29)
    public static final class139 method540(int arg0, byte arg1) {
        field1000++;
        class139 var2 = (class139) class190.field3182.method1483((byte) -74, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class179.field2937.method2042(16, arg0, (byte) -121);
        if (arg1 != 123) {
            field1001 = (class59) null;
        }
        class139 var4 = new class139();
        if (var3 != null) {
            var4.method1012(0, new class170(var3));
        }
        class190.field3182.method1488((long) arg0, var4, 25838);
        return var4;
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(ZZ)V", line = 84)
    public static final void method541(boolean arg0, boolean arg1) {
        if (!arg1) {
            field1001 = (class59) null;
        }
        field996++;
        byte var2;
        byte[][] var3;
        if (class55.field815 && arg0) {
            var2 = 1;
            var3 = class230.field3784;
        } else {
            var2 = 4;
            var3 = class123.field2035;
        }
        for (int var4 = 0; var4 < var2; var4++) {
            class269.method1881((byte) -1);
            for (int var5 = 0; var5 < 13; var5++) {
                for (int var6 = 0; var6 < 13; var6++) {
                    int var7 = class119.field1970[var4][var5][var6];
                    if (var7 != -1) {
                        int var8 = var7 >> 24 & 0x3;
                        if (!arg0 || var8 == 0) {
                            int var9 = var7 >> 1 & 0x3;
                            int var10 = var7 >> 14 & 0x3FF;
                            int var11 = (var7 & 0x3FFC) >> 3;
                            int var12 = (var10 / 8 << 8) + (var11 / 8);
                            for (int var13 = 0; var13 < class260.field4348.length; var13++) {
                                if (class260.field4348[var13] == var12 && var3[var13] != null) {
                                    class172.method1269(var3[var13], (var10 & 0x7) * 8, var4, arg0, (var11 & 0x7) * 8, (byte) 77, var8, class41.field612, var5 * 8, var9, var6 * 8);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
