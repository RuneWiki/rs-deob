import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sh")
public class class304 extends class60 {

    @OriginalMember(owner = "client!sh", name = "s", descriptor = "I")
    public int field4844;

    @OriginalMember(owner = "client!sh", name = "q", descriptor = "Lgd;")
    public static class325 field4842 = new class325(64);

    @OriginalMember(owner = "client!sh", name = "u", descriptor = "Z")
    public static boolean field4846 = false;

    @OriginalMember(owner = "client!sh", name = "v", descriptor = "[I")
    public static int[] field4847 = new int[500];

    @OriginalMember(owner = "client!sh", name = "t", descriptor = "F")
    public static float field4845;

    @OriginalMember(owner = "client!sh", name = "n", descriptor = "I")
    public static int field4839;

    @OriginalMember(owner = "client!sh", name = "o", descriptor = "I")
    public static int field4840;

    @OriginalMember(owner = "client!sh", name = "p", descriptor = "I")
    public static int field4841;

    @OriginalMember(owner = "client!sh", name = "r", descriptor = "I")
    public static int field4843;

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(BI)Ltm;", line = 5)
    public static final class77 method2159(byte arg0, int arg1) {
        field4843++;
        class77 var2 = (class77) class218.field3410.method1183((long) arg1, (byte) -104);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class111.field1809.method967(arg1, 0, arg0 ^ 0xFFFF00A1);
        if (var3 == null) {
            return null;
        }
        class77 var4 = new class77();
        class1 var5 = new class1(var3);
        var5.field48 = var5.field34.length - 2;
        if (arg0 != -95) {
            method2162(-72, -14, -64, 75, (byte[]) null, (class53[]) null, -4, -119, 77, true, 9);
        }
        int var6 = var5.method56(arg0 ^ 0xFFFFB33D);
        int var7 = var5.field34.length - var6 - 2 - 12;
        var5.field48 = var7;
        int var8 = var5.method33(false);
        var4.field1198 = var5.method56(19612);
        var4.field1200 = var5.method56(19612);
        var4.field1202 = var5.method56(19612);
        var4.field1201 = var5.method56(19612);
        int var9 = var5.method15((byte) 82);
        if (var9 > 0) {
            var4.field1206 = new class3[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                int var11 = var5.method56(19612);
                class3 var12 = new class3(class319.method2255(1, var11));
                var4.field1206[var10] = var12;
                while (var11-- > 0) {
                    int var13 = var5.method33(false);
                    int var14 = var5.method33(false);
                    var12.method75(new class304(var14), arg0 + 94, (long) var13);
                }
            }
        }
        var5.field48 = 0;
        int var15 = 0;
        var4.field1195 = var5.method50((byte) -76);
        var4.field1207 = new String[var8];
        var4.field1199 = new int[var8];
        var4.field1203 = new int[var8];
        while (var5.field48 < var7) {
            int var16 = var5.method56(19612);
            if (var16 == 3) {
                var4.field1207[var15] = var5.method53(32).intern();
            } else if (var16 >= 100 || var16 == 21 || var16 == 38 || var16 == 39) {
                var4.field1203[var15] = var5.method15((byte) 61);
            } else {
                var4.field1203[var15] = var5.method33(false);
            }
            var4.field1199[var15++] = var16;
        }
        class218.field3410.method1182((byte) -116, (long) arg1, var4);
        return var4;
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(I)V", line = 96)
    public static void method2160(int arg0) {
        field4847 = null;
        field4842 = null;
        if (arg0 != -4980) {
            method2161((byte) 118);
        }
    }

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "(B)I", line = 111)
    public static final int method2161(byte arg0) {
        field4841++;
        class123.field1997 = 0;
        if (arg0 > -52) {
            method2160(112);
        }
        return class64.method513(100);
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(IIII[B[Lmf;IIIZI)V", line = 130)
    public static final void method2162(int arg0, int arg1, int arg2, int arg3, byte[] arg4, class53[] arg5, int arg6, int arg7, int arg8, boolean arg9, int arg10) {
        field4840++;
        if (arg8 != 25199) {
            field4842 = (class325) null;
        }
        int var11 = -1;
        class1 var12 = new class1(arg4);
        while (true) {
            int var13 = var12.method1((byte) 20);
            if (var13 == 0) {
                return;
            }
            var11 += var13;
            int var14 = 0;
            while (true) {
                int var15 = var12.method63(127);
                if (var15 == 0) {
                    break;
                }
                var14 += var15 - 1;
                int var16 = var14 & 0x3F;
                int var17 = (var14 & 0xFE2) >> 6;
                int var18 = var14 >> 12;
                int var19 = var12.method15((byte) 86);
                int var20 = var19 >> 2;
                int var21 = var19 & 0x3;
                if (arg3 == var18 && arg1 <= var17 && arg1 + 8 > var17 && var16 >= arg2 && var16 < arg2 + 8) {
                    class101 var22 = class288.method2025(var11, -1);
                    int var23 = arg7 + class106.method847((byte) 98, var22.field1626, var17 & 0x7, var21, arg6, var22.field1623, var16 & 0x7);
                    int var24 = class204.method1463(var16 & 0x7, var22.field1626, arg8 - 25200, var21, arg6, var17 & 0x7, var22.field1623) + arg10;
                    if (var23 > 0 && var24 > 0 && var23 < 103 && var24 < 103) {
                        class53 var25 = null;
                        if (!arg9) {
                            int var26 = arg0;
                            if ((class332.field5184[1][var23][var24] & 0x2) == 2) {
                                var26 = arg0 - 1;
                            }
                            if (var26 >= 0) {
                                var25 = arg5[var26];
                            }
                        }
                        class95.method776(var11, arg6 + var21 & 0x3, arg8 ^ 0x6217, arg0, arg9, arg0, var25, !arg9, var20, var23, var24);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!sh", name = "<init>", descriptor = "()V", line = 214)
    public class304() {
    }

    @OriginalMember(owner = "client!sh", name = "<init>", descriptor = "(I)V", line = 216)
    public class304(int arg0) {
        this.field4844 = arg0;
    }
}
