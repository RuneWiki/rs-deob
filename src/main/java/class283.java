import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jh")
public class class283 extends class177 {

    @OriginalMember(owner = "client!jh", name = "j", descriptor = "Z")
    public static boolean field5003 = true;

    @OriginalMember(owner = "client!jh", name = "i", descriptor = "I")
    public static int field5002 = 0;

    @OriginalMember(owner = "client!jh", name = "q", descriptor = "I")
    public static int field5010 = 0;

    @OriginalMember(owner = "client!jh", name = "r", descriptor = "I")
    public static int field5011 = 0;

    @OriginalMember(owner = "client!jh", name = "m", descriptor = "I")
    public static int field5006;

    @OriginalMember(owner = "client!jh", name = "n", descriptor = "I")
    public static int field5007;

    @OriginalMember(owner = "client!jh", name = "o", descriptor = "I")
    public static int field5008;

    @OriginalMember(owner = "client!jh", name = "p", descriptor = "I")
    public static int field5009;

    @OriginalMember(owner = "client!jh", name = "k", descriptor = "Lgh;")
    public static class24 field5004;

    @OriginalMember(owner = "client!jh", name = "l", descriptor = "[I")
    public static int[] field5005;

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(BII)V")
    public static final void method1942(byte arg0, int arg1, int arg2) {
        field5009++;
        class216 var3 = class139.method972(arg2, false, 5);
        var3.method1459(true);
        if (arg0 == -119) {
            var3.field3809 = arg1;
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(B)V")
    public static void method1943(byte arg0) {
        field5004 = null;
        if (arg0 <= -106) {
            field5005 = null;
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(BZ)V")
    public static final void method1944(byte arg0, boolean arg1) {
        field5008++;
        int var2 = -7 / ((arg0 - 10) / 42);
        byte[][] var3 = class82.field1502;
        byte var4 = 4;
        for (int var5 = 0; var5 < var4; var5++) {
            class279.method1923(64);
            for (int var6 = 0; var6 < 13; var6++) {
                for (int var7 = 0; var7 < 13; var7++) {
                    int var8 = class184.field3319[var5][var6][var7];
                    if (var8 != -1) {
                        int var9 = var8 >> 24 & 0x3;
                        if (!arg1 || var9 == 0) {
                            int var10 = (var8 & 0x7) >> 1;
                            int var11 = (var8 & 0xFFF648) >> 14;
                            int var12 = var8 >> 3 & 0x7FF;
                            int var13 = (var11 / 8 << 8) + var12 / 8;
                            for (int var14 = 0; var14 < class267.field4761.length; var14++) {
                                if (class267.field4761[var14] == var13 && var3[var14] != null) {
                                    class217.method1466(var6 * 8, (var11 & 0x7) * 8, class228.field3989, (byte) -125, var10, var9, var3[var14], var7 * 8, arg1, var5, (var12 & 0x7) * 8);
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
