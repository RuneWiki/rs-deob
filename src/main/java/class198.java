import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ni")
public class class198 {

    @OriginalMember(owner = "client!ni", name = "f", descriptor = "[Lbj;")
    private class88[] field3142;

    @OriginalMember(owner = "client!ni", name = "e", descriptor = "I")
    public static int field3141 = 0;

    @OriginalMember(owner = "client!ni", name = "g", descriptor = "[I")
    public static int[] field3143 = new int[] { 4, 4, 1, 2, 6, 4, 2, 48, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "[I")
    public static int[] field3137 = new int[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

    @OriginalMember(owner = "client!ni", name = "b", descriptor = "I")
    public static int field3138;

    @OriginalMember(owner = "client!ni", name = "d", descriptor = "I")
    public static int field3140;

    @OriginalMember(owner = "client!ni", name = "c", descriptor = "[[[B")
    public static byte[][][] field3139;

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(I)V")
    public static void method1381(int arg0) {
        field3137 = null;
        field3143 = null;
        if (arg0 != 0) {
            method1381(77);
        }
        field3139 = null;
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;B)V")
    public static final void method1382(String arg0, int arg1, String arg2, byte arg3) {
        class170.field2697 = arg1;
        class293.field4648 = arg2;
        class247.field4080 = arg0;
        field3140++;
        if (class247.field4080.equals("") || class293.field4648.equals("")) {
            class50.field650 = 3;
        } else if (class115.field1638 == -1) {
            class235.field3883 = 0;
            class35.field448 = 1;
            class14.field184 = 0;
            if (arg3 != 70) {
                method1383(-115, false);
            }
            class50.field650 = -3;
            class96 var4 = new class96(128);
            var4.method580((byte) 107, 10);
            var4.method574((int) (Math.random() * 9.9999999E7D), arg3 - 71);
            var4.method590(class185.method1296((byte) -103, class247.field4080), 1027669520);
            var4.method574((int) (Math.random() * 9.9999999E7D), -1);
            var4.method566((byte) -81, class293.field4648);
            var4.method574((int) (Math.random() * 9.9999999E7D), -1);
            var4.method589((byte) 86, class127.field2033, class178.field2823);
            class4.field57.field1228 = 0;
            class4.field57.method580((byte) 92, 24);
            class4.field57.method580((byte) 63, var4.field1228 + 2);
            class4.field57.method572(true, 537);
            class4.field57.method547((byte) -79, var4.field1228, var4.field1218, 0);
        } else {
            class56.method319((byte) -93);
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(IZ)V")
    public static final void method1383(int arg0, boolean arg1) {
        field3138++;
        byte[][] var2 = class121.field1713;
        byte var3 = 4;
        int[] var4 = null;
        int var5 = 0;
        if (arg0 != 99999999) {
            field3143 = null;
        }
        while (var3 > var5) {
            class51.method294((byte) -127);
            for (int var6 = 0; var6 < 13; var6++) {
                for (int var7 = 0; var7 < 13; var7++) {
                    boolean var8 = false;
                    int var9 = class67.field843[var5][var6][var7];
                    if (var9 != -1) {
                        int var10 = var9 >> 24 & 0x3;
                        if (!arg1 || var10 == 0) {
                            int var11 = var9 >> 1 & 0x3;
                            int var12 = (var9 & 0xFFE74F) >> 14;
                            int var13 = (var9 & 0x3FF9) >> 3;
                            int var14 = (var12 / 8 << 8) + var13 / 8;
                            for (int var15 = 0; var15 < class86.field1056.length; var15++) {
                                if (class86.field1056[var15] == var14 && var2[var15] != null) {
                                    int[] var16 = class244.method1697(var6 * 8, var11, arg1, class187.field2975, var10, var12, var5, var13, var2[var15], 8, var7 * 8);
                                    var8 = true;
                                    if (var4 == null && var16 != null) {
                                        var4 = var16;
                                    }
                                    break;
                                }
                            }
                        }
                    }
                    if (!var8) {
                        class4.method22(-1, 8, var7 * 8, var6 * 8, var5, 8);
                    }
                }
            }
            var5++;
        }
        if (var4 == null) {
            class242.field3989 = -1;
            return;
        }
        class157.field2526 = var4[4];
        class242.field3989 = var4[0];
        class281.field4454 = var4[2];
        class117.field1658 = var4[1];
        class141.field2243 = var4[3];
    }

    @OriginalMember(owner = "client!ni", name = "<init>", descriptor = "(I)V")
    public class198(int arg0) {
        this.field3142 = new class88[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class88 var3 = this.field3142[var2] = new class88();
            var3.field1078 = var3;
            var3.field1083 = var3;
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(IIIIIIII)Z")
    public static final boolean method1384(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg1 < arg2 && arg1 < arg3 && arg1 < arg4) {
            return false;
        } else if (arg1 > arg2 && arg1 > arg3 && arg1 > arg4) {
            return false;
        } else if (arg0 < arg5 && arg0 < arg6 && arg0 < arg7) {
            return false;
        } else if (arg0 > arg5 && arg0 > arg6 && arg0 > arg7) {
            return false;
        } else {
            int var8 = (arg1 - arg2) * (arg6 - arg5) - (arg0 - arg5) * (arg3 - arg2);
            int var9 = (arg1 - arg4) * (arg5 - arg7) - (arg0 - arg7) * (arg2 - arg4);
            int var10 = (arg1 - arg3) * (arg7 - arg6) - (arg0 - arg6) * (arg4 - arg3);
            return var8 * var10 > 0 && var9 * var10 > 0;
        }
    }
}
