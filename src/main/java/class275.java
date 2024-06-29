import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wd")
public class class275 extends class233 {

    @OriginalMember(owner = "client!wd", name = "F", descriptor = "Leq;")
    public static class213 field3864 = new class213(16);

    @OriginalMember(owner = "client!wd", name = "K", descriptor = "Lmu;")
    public static class303 field3868 = new class303(100, -1);

    @OriginalMember(owner = "client!wd", name = "B", descriptor = "I")
    public static int field3860;

    @OriginalMember(owner = "client!wd", name = "C", descriptor = "I")
    public static int field3861;

    @OriginalMember(owner = "client!wd", name = "D", descriptor = "I")
    public static int field3862;

    @OriginalMember(owner = "client!wd", name = "E", descriptor = "I")
    public static int field3863;

    @OriginalMember(owner = "client!wd", name = "G", descriptor = "I")
    public static int field3865;

    @OriginalMember(owner = "client!wd", name = "J", descriptor = "I")
    public static int field3867;

    @OriginalMember(owner = "client!wd", name = "M", descriptor = "I")
    public static int field3870;

    @OriginalMember(owner = "client!wd", name = "H", descriptor = "[B")
    private byte[] field3866;

    @OriginalMember(owner = "client!wd", name = "L", descriptor = "[I")
    public static int[] field3869;

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(BLcea;)V")
    public static final void method1811(byte arg0, class215 arg1) {
        field3860++;
        int var2 = arg1.method1530(-128);
        class61.field1216 = new class361[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            class61.field1216[var3] = new class361();
            class61.field1216[var3].field5191 = arg1.method1530(-124);
            class61.field1216[var3].field5197 = arg1.method1519(-13487);
        }
        class380.field5522 = arg1.method1530(-127);
        class123.field2120 = arg1.method1530(-119);
        class399.field5900 = arg1.method1530(-122);
        class349.field4876 = new class420[class123.field2120 + 1 - class380.field5522];
        for (int var4 = 0; var4 < class399.field5900; var4++) {
            int var5 = arg1.method1530(-126);
            class420 var6 = class349.field4876[var5] = new class420();
            var6.field2405 = arg1.method1535(255);
            var6.field2402 = arg1.method1533((byte) -126);
            var6.field6066 = class380.field5522 + var5;
            var6.field6067 = arg1.method1519(-13487);
            var6.field6074 = arg1.method1519(-13487);
        }
        class311.field4335 = arg1.method1533((byte) -126);
        class637.field8754 = true;
        if (arg0 > -110) {
            method1811((byte) -34, null);
        }
    }

    @OriginalMember(owner = "client!wd", name = "e", descriptor = "(I)V")
    public static void method1812(int arg0) {
        if (arg0 < 51) {
            method1812(-85);
        }
        field3868 = null;
        field3869 = null;
        field3864 = null;
    }

    @OriginalMember(owner = "client!wd", name = "<init>", descriptor = "()V")
    public class275() {
        super(12, 5, 16, 2, 2, 0.45F);
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(IBII)[B")
    public final byte[] method1813(int arg0, byte arg1, int arg2, int arg3) {
        this.field3866 = new byte[arg0 * 2 * arg3 * arg2];
        int var5 = -82 % ((arg1 - 70) / 37);
        field3863++;
        this.method2236(arg0, arg3, 0, arg2);
        return this.field3866;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(BIB)V")
    public final void method722(byte arg0, int arg1, byte arg2) {
        field3867++;
        byte var4 = (byte) (((arg2 & 0xFF) >> 1) + 127);
        int var5 = arg1 * 2;
        int var10001 = var5;
        int var6 = var5 + 1;
        this.field3866[var10001] = var4;
        this.field3866[var6] = var4;
        if (arg0 <= 79) {
            method1816(-29, -37, 73, null, true, (byte) -64, 2, -112, 50, null, -65, null, -92, 30, -5);
        }
    }

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
    public static final String method1814(String arg0, int arg1) {
        field3862++;
        if (arg1 != 23034) {
            field3864 = null;
        }
        int var2 = arg0.length();
        int var3 = 0;
        for (int var4 = 0; var4 < var2; var4++) {
            char var8 = arg0.charAt(var4);
            if (var8 == '<' || var8 == '>') {
                var3 += 3;
            }
        }
        StringBuffer var5 = new StringBuffer(var2 + var3);
        for (int var6 = 0; var6 < var2; var6++) {
            char var7 = arg0.charAt(var6);
            if (var7 == '<') {
                var5.append("<lt>");
            } else if (var7 == '>') {
                var5.append("<gt>");
            } else {
                var5.append(var7);
            }
        }
        return var5.toString();
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(Lvl;Lvl;B)V")
    public static final void method1815(class13 arg0, class13 arg1, byte arg2) {
        if (arg0.field238 != null) {
            arg0.method115(true);
        }
        field3865++;
        arg0.field238 = arg1;
        arg0.field241 = arg1.field241;
        if (arg2 != 63) {
            field3870 = 110;
        }
        arg0.field238.field241 = arg0;
        arg0.field241.field238 = arg0;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(III[IZBIII[IILfe;III)I")
    public static final int method1816(int arg0, int arg1, int arg2, int[] arg3, boolean arg4, byte arg5, int arg6, int arg7, int arg8, int[] arg9, int arg10, class570 arg11, int arg12, int arg13, int arg14) {
        for (int var15 = 0; var15 < 128; var15++) {
            for (int var35 = 0; var35 < 128; var35++) {
                class184.field2786[var15][var35] = 0;
                class426.field6133[var15][var35] = 99999999;
            }
        }
        field3861++;
        boolean var16;
        if (arg1 == 1) {
            var16 = class311.method2026(arg0, arg10, arg8, arg14, arg13, arg12, arg11, arg6, arg2, arg7, 1109655552);
        } else if (arg1 == 2) {
            var16 = class245.method1682(arg6, -125, arg10, arg11, arg0, arg8, arg12, arg2, arg13, arg7, arg14);
        } else {
            var16 = class510.method2989(arg12, arg14, -73, arg8, arg2, arg0, arg7, arg13, arg1, arg11, arg6, arg10);
        }
        int var17 = arg7 - 64;
        int var18 = arg8 - 64;
        int var19 = class443.field6294;
        int var20 = class375.field5309;
        if (!var16) {
            if (!arg4) {
                return -1;
            }
            int var21 = Integer.MAX_VALUE;
            int var22 = Integer.MAX_VALUE;
            byte var23 = 10;
            for (int var24 = arg0 - var23; var24 <= arg0 + var23; var24++) {
                for (int var25 = arg10 - var23; var25 <= (arg10 + var23); var25++) {
                    int var26 = var24 - var17;
                    int var27 = var25 - var18;
                    if (var26 >= 0 && var27 >= 0 && var26 < 128 && var27 < 128 && class426.field6133[var26][var27] < 100) {
                        int var28 = 0;
                        if (var24 < arg0) {
                            var28 = arg0 - var24;
                        } else if (arg12 + arg0 - 1 < var24) {
                            var28 = var24 + 1 - (arg0 + arg12);
                        }
                        int var29 = 0;
                        if (var25 < arg10) {
                            var29 = arg10 - var25;
                        } else if (var25 > (arg10 + arg2 - 1)) {
                            var29 = -arg2 - arg10 - (-1 - var25);
                        }
                        int var30 = var28 * var28 + var29 * var29;
                        if (var21 > var30 || var21 == var30 && var22 > class426.field6133[var26][var27]) {
                            var21 = var30;
                            var19 = var24;
                            var22 = class426.field6133[var26][var27];
                            var20 = var25;
                        }
                    }
                }
            }
            if (var21 == Integer.MAX_VALUE) {
                return -1;
            }
        }
        if (arg7 == var19 && arg8 == var20) {
            return 0;
        }
        byte var31 = 0;
        if (arg5 != 120) {
            field3868 = null;
        }
        class641.field8811[var31] = var19;
        int var37 = var31 + 1;
        class201.field2919[var31] = var20;
        int var32;
        int var33 = var32 = class184.field2786[var19 - var17][var20 - var18];
        while (arg7 != var19 || arg8 != var20) {
            if (var32 != var33) {
                class641.field8811[var37] = var19;
                var32 = var33;
                class201.field2919[var37++] = var20;
            }
            if ((var33 & 0x2) != 0) {
                var19++;
            } else if ((var33 & 0x8) != 0) {
                var19--;
            }
            if ((var33 & 0x1) != 0) {
                var20++;
            } else if ((var33 & 0x4) != 0) {
                var20--;
            }
            var33 = class184.field2786[var19 - var17][var20 - var18];
        }
        int var34 = 0;
        while ((var37--) > 0) {
            arg9[var34] = class641.field8811[var37];
            arg3[var34++] = class201.field2919[var37];
            if (arg9.length <= var34) {
                break;
            }
        }
        return var34;
    }
}
