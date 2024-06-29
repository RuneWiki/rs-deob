import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oia")
public class class94 {

    @OriginalMember(owner = "client!oia", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field1376 = new String[] { method915(method914("\u0012*UQ[U")), method915(method914("\u0012*UQZU")), method915(method914("\u00136X\u0013")), method915(method914("\u0006m\u001aQe")), method915(method914(".+U\u001b}\u000fcW\u0010u\r*X\u001a8\u001b\"]\u0013}\u0019y")), method915(method914("\u0012*UQYU")) };

    @OriginalMember(owner = "client!oia", name = "f", descriptor = "[I")
    public static int[] field1371 = new int[25];

    @OriginalMember(owner = "client!oia", name = "g", descriptor = "I")
    public static int field1370 = 0;

    @OriginalMember(owner = "client!oia", name = "a", descriptor = "I")
    public static int field1367;

    @OriginalMember(owner = "client!oia", name = "b", descriptor = "I")
    public static int field1369;

    @OriginalMember(owner = "client!oia", name = "e", descriptor = "I")
    public int field1372;

    @OriginalMember(owner = "client!oia", name = "i", descriptor = "I")
    public int field1374;

    @OriginalMember(owner = "client!oia", name = "j", descriptor = "I")
    public int field1375;

    @OriginalMember(owner = "client!oia", name = "d", descriptor = "Lhk;")
    public static class107 field1366;

    @OriginalMember(owner = "client!oia", name = "h", descriptor = "Z")
    public boolean field1368;

    @OriginalMember(owner = "client!oia", name = "c", descriptor = "Z")
    public boolean field1373;

    @OriginalMember(owner = "client!oia", name = "a", descriptor = "(I)V")
    public static void method911(int arg0) {
        try {
            field1371 = null;
            field1366 = null;
            int var1 = 93 % ((-arg0 - 20) / 59);
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field1376[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!oia", name = "a", descriptor = "([BIILtia;)Ltaa;")
    public static final class431 method912(byte[] arg0, int arg1, int arg2, class278 arg3) {
        try {
            field1367++;
            if (arg0 == null || arg0.length == 0) {
                return null;
            }
            long var4 = OpenGL.glCreateShaderObjectARB(arg2);
            OpenGL.glShaderSourceRawARB(var4, arg0);
            OpenGL.glCompileShaderARB(var4);
            OpenGL.glGetObjectParameterivARB(var4, 35713, class716.field10361, 0);
            if (arg1 != 1) {
                method912(null, 59, -14, null);
            }
            if (class716.field10361[0] == 0) {
                if (class716.field10361[0] == 0) {
                    System.out.println(field1376[4]);
                }
                OpenGL.glGetObjectParameterivARB(var4, 35716, class716.field10361, 1);
                if (class716.field10361[1] > 1) {
                    byte[] var6 = new byte[class716.field10361[1]];
                    OpenGL.glGetInfoLogARB(var4, class716.field10361[1], class716.field10361, 0, var6, 0);
                    System.out.println(new String(var6));
                }
                if (class716.field10361[0] == 0) {
                    OpenGL.glDeleteObjectARB(var4);
                    return null;
                }
            }
            return new class431(arg3, var4, arg2);
        } catch (RuntimeException var8) {
            throw class590.method4333(var8, field1376[5] + (arg0 == null ? field1376[2] : field1376[3]) + ',' + arg1 + ',' + arg2 + ',' + (arg3 == null ? field1376[2] : field1376[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!oia", name = "a", descriptor = "(Lmj;IIILha;IIILaa;)V")
    public static final void method913(class683 arg0, int arg1, int arg2, int arg3, class63 arg4, int arg5, int arg6, int arg7, class514 arg8) {
        try {
            field1369++;
            if (arg7 != -3877) {
                method912(null, 15, 52, null);
            }
            class209 var9 = class362.field5915.method2325(arg7 + 3875, arg6);
            if (var9 != null && var9.field3275 && var9.method1884(class398.field6315, false)) {
                if (var9.field3276 != null) {
                    int[] var10 = new int[var9.field3276.length];
                    for (int var11 = 0; var11 < (var10.length / 2); var11++) {
                        int var12;
                        if (class401.field6334 == 4) {
                            var12 = (int) class29.field293 & 0x3FFF;
                        } else {
                            var12 = (int) class29.field293 + class126.field1819 & 0x3FFF;
                        }
                        int var13 = class763.field11199[var12];
                        int var14 = class763.field11200[var12];
                        if (class401.field6334 != 4) {
                            var14 = var14 * 256 / (class85.field1275 + 256);
                            var13 = var13 * 256 / (class85.field1275 + 256);
                        }
                        var10[var11 * 2] = ((var9.field3276[var11 * 2] * 4 + arg2) * var14 + (var9.field3276[var11 * 2 + 1] * 4 + arg5) * var13 >> 14) + arg0.field9797 / 2 + arg1;
                        var10[var11 * 2 + 1] = arg0.field9777 / 2 + arg3 - ((var9.field3276[var11 * 2 + 1] * 4 + arg5) * var14 - (var9.field3276[var11 * 2] * 4 + arg2) * var13 >> 14);
                    }
                    class733.method5321(arg4, var10, var9.field3298, arg0.field9845, arg0.field9862);
                    if (var9.field3291 > 0) {
                        for (int var15 = 0; var15 < (var10.length / 2 - 1); var15++) {
                            int var16 = var10[var15 * 2];
                            int var17 = var10[var15 * 2 + 1];
                            int var18 = var10[var15 * 2 + 2];
                            int var19 = var10[(var15 + 1) * 2 + 1];
                            if (var18 < var16) {
                                int var20 = var16;
                                int var21 = var17;
                                var16 = var18;
                                var18 = var20;
                                var17 = var19;
                                var19 = var21;
                            } else if (var16 == var18 && var17 > var19) {
                                int var22 = var17;
                                var17 = var19;
                                var19 = var22;
                            }
                            arg4.method261(var16, var17, var18, var19, var9.field3283[var9.field3294[var15] & 0xFF], 1, arg8, arg1, arg3, var9.field3291, var9.field3287, var9.field3281);
                        }
                        int var23 = var10[var10.length - 2];
                        int var24 = var10[var10.length - 1];
                        int var25 = var10[0];
                        int var26 = var10[1];
                        if (var25 < var23) {
                            int var28 = var23;
                            int var29 = var24;
                            var23 = var25;
                            var24 = var26;
                            var25 = var28;
                            var26 = var29;
                        } else if (var23 == var25 && var24 > var26) {
                            int var27 = var24;
                            var24 = var26;
                            var26 = var27;
                        }
                        arg4.method261(var23, var24, var25, var26, var9.field3283[var9.field3294[var9.field3294.length - 1] & 0xFF], 1, arg8, arg1, arg3, var9.field3291, var9.field3287, var9.field3281);
                    } else {
                        for (int var30 = 0; var30 < var10.length / 2 - 1; var30++) {
                            arg4.method205(var10[var30 * 2], var10[var30 * 2 + 1], var10[var30 * 2 + 2], var10[(var30 + 1) * 2 + 1], var9.field3283[var9.field3294[var30] & 0xFF], 1, arg8, arg1, arg3);
                        }
                        arg4.method205(var10[var10.length - 2], var10[var10.length - 1], var10[0], var10[1], var9.field3283[var9.field3294[var9.field3294.length - 1] & 0xFF], 1, arg8, arg1, arg3);
                    }
                }
                class107 var31 = null;
                if (var9.field3279 != -1) {
                    var31 = var9.method1890(false, 0, arg4);
                    if (var31 != null) {
                        class610.method4449(var31, arg5, arg1, arg3, 4, arg8, arg0, arg2);
                    }
                }
                if (var9.field3282 != null) {
                    int var32 = 0;
                    if (var31 != null) {
                        var32 = var31.method13();
                    }
                    class64 var33 = class355.field5718;
                    class49 var34 = class693.field9978;
                    if (var9.field3297 == 1) {
                        var34 = class64.field877;
                        var33 = class213.field3367;
                    }
                    if (var9.field3297 == 2) {
                        var33 = class461.field7108;
                        var34 = client.field5163;
                    }
                    class647.method4716(arg8, arg3, var32, arg0, var9.field3271, arg1, arg5, var9.field3282, var34, arg2, var33, false);
                    return;
                }
            }
        } catch (RuntimeException var36) {
            throw class590.method4333(var36, field1376[1] + (arg0 == null ? field1376[2] : field1376[3]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 == null ? field1376[2] : field1376[3]) + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + (arg8 == null ? field1376[2] : field1376[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!oia", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method914(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x18);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!oia", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method915(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 125;
                    break;
                case 1:
                    var10005 = 67;
                    break;
                case 2:
                    var10005 = 52;
                    break;
                case 3:
                    var10005 = 127;
                    break;
                default:
                    var10005 = 24;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
