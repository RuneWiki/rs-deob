import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lg")
public class class12 extends class270 {

    @OriginalMember(owner = "client!lg", name = "ab", descriptor = "S")
    public static short field106 = 320;

    @OriginalMember(owner = "client!lg", name = "bb", descriptor = "Lmh;")
    private static class62 field107 = class201.method1405(true, "flash2:");

    @OriginalMember(owner = "client!lg", name = "cb", descriptor = "Lmh;")
    public static class62 field108 = field107;

    @OriginalMember(owner = "client!lg", name = "S", descriptor = "Lmh;")
    public static class62 field98 = class201.method1405(true, "; version=1; path=)4; domain=");

    @OriginalMember(owner = "client!lg", name = "Y", descriptor = "Lmh;")
    public static class62 field104 = class201.method1405(true, " steht bereits auf Ihrer Ignorieren)2Liste(Q");

    @OriginalMember(owner = "client!lg", name = "db", descriptor = "Lmh;")
    public static class62 field109 = class201.method1405(true, "Clientscript error in: ");

    @OriginalMember(owner = "client!lg", name = "X", descriptor = "Lmh;")
    public static class62 field103 = field107;

    @OriginalMember(owner = "client!lg", name = "U", descriptor = "I")
    public static int field100;

    @OriginalMember(owner = "client!lg", name = "V", descriptor = "I")
    public static int field101;

    @OriginalMember(owner = "client!lg", name = "W", descriptor = "I")
    public static int field102;

    @OriginalMember(owner = "client!lg", name = "Z", descriptor = "I")
    public static int field105;

    @OriginalMember(owner = "client!lg", name = "eb", descriptor = "I")
    public static int field110;

    @OriginalMember(owner = "client!lg", name = "T", descriptor = "I")
    public static int field99;

    @OriginalMember(owner = "client!lg", name = "<init>", descriptor = "()V", line = 3)
    public class12() {
        super(0, true);
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(BLgi;)V", line = 7)
    public static final void method47(byte arg0, class285 arg1) {
        field110++;
        class202 var2 = null;
        try {
            class147 var3 = arg1.method1951(-7135, "runescape");
            while (var3.field2322 == 0) {
                class99.method792(-1, 1L);
            }
            if (var3.field2322 == 1) {
                var2 = (class202) var3.field2323;
                class92 var4 = class115.method897(100);
                var2.method1417(1, var4.field1495, 0, var4.field1476);
            }
        } catch (Exception var8) {
        }
        if (arg0 >= -75) {
            return;
        }
        try {
            if (var2 != null) {
                var2.method1414(0);
            }
        } catch (Exception var7) {
        }
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(IBIIIILtd;)V", line = 44)
    public static final void method48(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, class222 arg6) {
        class27.method168(arg3, arg6.field3814, arg0, arg2, arg5, true, arg6.field3821, arg4);
        field105++;
        int var7 = 40 % ((arg1 - 53) / 54);
    }

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "(IBI)I", line = 55)
    private final int method49(int arg0, byte arg1, int arg2) {
        field99++;
        if (arg1 > -7) {
            method47((byte) -24, (class285) null);
        }
        int var4 = arg2 * 57 + arg0;
        int var5 = var4 ^ var4 << 1;
        return 4096 - (((var5 * 15731 * var5 + 789221) * var5 + 1376312589 & Integer.MAX_VALUE) / 262144);
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(II)[I", line = 70)
    public final int[] method6(int arg0, int arg1) {
        if (arg0 != 18693) {
            method47((byte) -63, (class285) null);
        }
        field101++;
        int[] var3 = this.field4573.method919(arg1, arg0 ^ 0x2CDD);
        if (this.field4573.field1984) {
            int var4 = class166.field2702[arg1];
            for (int var5 = 0; var5 < class109.field1770; var5++) {
                var3[var5] = this.method49(class283.field4840[var5], (byte) -23, var4) % 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!lg", name = "c", descriptor = "(I)Lwj;", line = 119)
    public static final class135 method50(int arg0) {
        field102++;
        int var1 = class184.field2940[arg0] * class15.field132[0];
        byte[] var2 = class42.field645[0];
        int[] var3 = new int[var1];
        for (int var4 = 0; var4 < var1; var4++) {
            var3[var4] = class235.field4048[class234.method1648(var2[var4], 255)];
        }
        class257 var5 = new class257(class41.field626, class189.field3005, class183.field2931[0], class113.field1878[0], class15.field132[0], class184.field2940[0], var3);
        class135.method1020(-111);
        return var5;
    }

    @OriginalMember(owner = "client!lg", name = "d", descriptor = "(I)V", line = 170)
    public static void method51(int arg0) {
        field98 = null;
        field103 = null;
        int var1 = 116 % ((-arg0 - 11) / 40);
        field108 = null;
        field104 = null;
        field107 = null;
        field109 = null;
    }
}
