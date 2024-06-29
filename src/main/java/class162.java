import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.OptionalDataException;
import java.io.StreamCorruptedException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!re")
public class class162 extends class106 {

    @OriginalMember(owner = "client!re", name = "W", descriptor = "I")
    public int field3279 = 99;

    @OriginalMember(owner = "client!re", name = "S", descriptor = "I")
    public int field3275 = 5;

    @OriginalMember(owner = "client!re", name = "O", descriptor = "I")
    public int field3271 = -1;

    @OriginalMember(owner = "client!re", name = "cb", descriptor = "I")
    public int field3285 = -1;

    @OriginalMember(owner = "client!re", name = "bb", descriptor = "Z")
    public boolean field3284 = false;

    @OriginalMember(owner = "client!re", name = "db", descriptor = "I")
    public int field3286 = -1;

    @OriginalMember(owner = "client!re", name = "eb", descriptor = "I")
    public int field3287 = -1;

    @OriginalMember(owner = "client!re", name = "mb", descriptor = "I")
    public int field3295 = -1;

    @OriginalMember(owner = "client!re", name = "H", descriptor = "I")
    public int field3265 = 2;

    @OriginalMember(owner = "client!re", name = "X", descriptor = "Lrf;")
    private static class163 field3280 = class53.method392(-89, "Please try again)3");

    @OriginalMember(owner = "client!re", name = "L", descriptor = "Lrf;")
    public static class163 field3268 = class53.method392(44, " ");

    @OriginalMember(owner = "client!re", name = "kb", descriptor = "I")
    public static int field3293 = 0;

    @OriginalMember(owner = "client!re", name = "ab", descriptor = "Lrf;")
    public static class163 field3283 = class53.method392(68, "Benutzername: ");

    @OriginalMember(owner = "client!re", name = "ib", descriptor = "I")
    public static int field3291 = 0;

    @OriginalMember(owner = "client!re", name = "U", descriptor = "Lrf;")
    public static class163 field3277 = field3280;

    @OriginalMember(owner = "client!re", name = "G", descriptor = "Lfc;")
    public static class54 field3264 = new class54(64);

    @OriginalMember(owner = "client!re", name = "K", descriptor = "I")
    public static int field3267;

    @OriginalMember(owner = "client!re", name = "M", descriptor = "I")
    public static int field3269;

    @OriginalMember(owner = "client!re", name = "N", descriptor = "I")
    public static int field3270;

    @OriginalMember(owner = "client!re", name = "Q", descriptor = "I")
    public static int field3273;

    @OriginalMember(owner = "client!re", name = "V", descriptor = "I")
    public static int field3278;

    @OriginalMember(owner = "client!re", name = "Y", descriptor = "I")
    public static int field3281;

    @OriginalMember(owner = "client!re", name = "Z", descriptor = "I")
    public static int field3282;

    @OriginalMember(owner = "client!re", name = "fb", descriptor = "I")
    public static int field3288;

    @OriginalMember(owner = "client!re", name = "gb", descriptor = "I")
    public static int field3289;

    @OriginalMember(owner = "client!re", name = "hb", descriptor = "I")
    public static int field3290;

    @OriginalMember(owner = "client!re", name = "lb", descriptor = "I")
    public static int field3294;

    @OriginalMember(owner = "client!re", name = "F", descriptor = "[I")
    public int[] field3263;

    @OriginalMember(owner = "client!re", name = "J", descriptor = "[I")
    public static int[] field3266;

    @OriginalMember(owner = "client!re", name = "P", descriptor = "[I")
    private int[] field3272;

    @OriginalMember(owner = "client!re", name = "R", descriptor = "[I")
    private int[] field3274;

    @OriginalMember(owner = "client!re", name = "T", descriptor = "[I")
    public int[] field3276;

    @OriginalMember(owner = "client!re", name = "jb", descriptor = "[I")
    public int[] field3292;

    @OriginalMember(owner = "client!re", name = "b", descriptor = "(II)Z")
    public static final boolean method1010(int arg0, int arg1) {
        field3294++;
        if (arg0 >= 97 && arg0 <= 122) {
            return true;
        }
        if (arg1 != -1) {
            field3266 = null;
        }
        if (arg0 >= 65 && arg0 <= 90) {
            return true;
        } else {
            return arg0 >= 48 && arg0 <= 57;
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(BLje;I)Lje;")
    public final class91 method1011(byte arg0, class91 arg1, int arg2) {
        int var4 = this.field3263[arg2];
        field3267++;
        class86 var5 = class194.method1297(var4 >> 16, 1);
        if (arg0 >= -10) {
            method1010(41, 16);
        }
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg1.method176(true);
        } else {
            class91 var7 = arg1.method176(!var5.method605(var6, 4));
            var7.method186(var5, var6);
            return var7;
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(BILfa;)V")
    private final void method1012(byte arg0, int arg1, class52 arg2) {
        if (arg1 == 1) {
            int var11 = arg2.method390((byte) 103);
            this.field3292 = new int[var11];
            for (int var12 = 0; var12 < var11; var12++) {
                this.field3292[var12] = arg2.method390((byte) 116);
            }
            this.field3263 = new int[var11];
            for (int var13 = 0; var13 < var11; var13++) {
                this.field3263[var13] = arg2.method390((byte) 119);
            }
            for (int var14 = 0; var14 < var11; var14++) {
                this.field3263[var14] += arg2.method390((byte) 89) << 16;
            }
        } else if (arg1 == 2) {
            this.field3287 = arg2.method390((byte) 115);
        } else if (arg1 == 3) {
            int var4 = arg2.method344(255);
            this.field3272 = new int[var4 + 1];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field3272[var5] = arg2.method344(255);
            }
            this.field3272[var4] = 9999999;
        } else if (arg1 == 4) {
            this.field3284 = true;
        } else if (arg1 == 5) {
            this.field3275 = arg2.method344(255);
        } else if (arg1 == 6) {
            this.field3286 = arg2.method390((byte) 107);
        } else if (arg1 == 7) {
            this.field3285 = arg2.method390((byte) 104);
        } else if (arg1 == 8) {
            this.field3279 = arg2.method344(arg0 ^ 0xF0);
        } else if (arg1 == 9) {
            this.field3295 = arg2.method344(255);
        } else if (arg1 == 10) {
            this.field3271 = arg2.method344(255);
        } else if (arg1 == 11) {
            this.field3265 = arg2.method344(255);
        } else if (arg1 == 12) {
            int var6 = arg2.method344(255);
            this.field3274 = new int[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field3274[var7] = arg2.method390((byte) 115);
            }
            for (int var8 = 0; var8 < var6; var8++) {
                this.field3274[var8] += arg2.method390((byte) 102) << 16;
            }
        } else if (arg1 == 13) {
            int var9 = arg2.method344(255);
            this.field3276 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field3276[var10] = arg2.method340(false);
            }
        }
        field3273++;
        if (arg0 != 15) {
            this.field3286 = 28;
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(Lje;IBI)Lje;")
    public final class91 method1013(class91 arg0, int arg1, byte arg2, int arg3) {
        field3269++;
        int var5 = this.field3263[arg1];
        class86 var6 = class194.method1297(var5 >> 16, 1);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg0.method179(true);
        }
        int var8 = arg3 & 0x3;
        class91 var9 = arg0.method179(!var6.method605(var7, arg2 ^ 0x3A));
        if (var8 == 1) {
            var9.method637();
        } else if (var8 == 2) {
            var9.method640();
        } else if (var8 == 3) {
            var9.method636();
        }
        if (arg2 != 62) {
            this.field3263 = null;
        }
        var9.method186(var6, var7);
        if (var8 == 1) {
            var9.method636();
        } else if (var8 == 2) {
            var9.method640();
        } else if (var8 == 3) {
            var9.method637();
        }
        return var9;
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(BLre;Lje;II)Lje;")
    public final class91 method1014(byte arg0, class162 arg1, class91 arg2, int arg3, int arg4) {
        field3270++;
        int var6 = this.field3263[arg4];
        class86 var7 = class194.method1297(var6 >> 16, 1);
        int var8 = var6 & 0xFFFF;
        if (arg0 > -4) {
            return null;
        } else if (var7 == null) {
            return arg1.method1019(arg3, -125, arg2);
        } else {
            int var9 = arg1.field3263[arg3];
            class86 var10 = class194.method1297(var9 >> 16, 1);
            int var11 = var9 & 0xFFFF;
            if (var10 == null) {
                class91 var12 = arg2.method179(!var7.method605(var8, 4));
                var12.method186(var7, var8);
                return var12;
            } else {
                class91 var13 = arg2.method179(!var7.method605(var8, 4) & !var10.method605(var11, 4));
                var13.method175(var7, var8, var10, var11, this.field3272);
                return var13;
            }
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(Lfa;Z)V")
    public final void method1015(class52 arg0, boolean arg1) {
        if (!arg1) {
            this.method1021(null, -43, 63);
        }
        field3282++;
        while (true) {
            int var3 = arg0.method344(255);
            if (var3 == 0) {
                return;
            }
            this.method1012((byte) 15, var3, arg0);
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(Lf;BI)V")
    public static final void method1016(class51 arg0, byte arg1, int arg2) {
        field3288++;
        if (arg1 > -87) {
            method1017(null, 75, 35);
        }
        while (true) {
            class116 var3 = (class116) class172.field3490.method46(127);
            if (var3 == null) {
                return;
            }
            boolean var4 = false;
            for (int var5 = 0; var5 < var3.field2458; var5++) {
                if (var3.field2462[var5] != null) {
                    if (var3.field2462[var5].field855 == 2) {
                        var3.field2470[var5] = -5;
                    }
                    if (var3.field2462[var5].field855 == 0) {
                        var4 = true;
                    }
                }
                if (var3.field2459[var5] != null) {
                    if (var3.field2459[var5].field855 == 2) {
                        var3.field2470[var5] = -6;
                    }
                    if (var3.field2459[var5].field855 == 0) {
                        var4 = true;
                    }
                }
            }
            if (var4) {
                return;
            }
            arg0.method326(104, arg2);
            arg0.method370(0, (byte) 123);
            int var6 = arg0.field1033;
            arg0.method369(var3.field2460, (byte) -114);
            for (int var7 = 0; var7 < var3.field2458; var7++) {
                if (var3.field2470[var7] == 0) {
                    try {
                        int var8 = var3.field2469[var7];
                        if (var8 == 0) {
                            Field var12 = (Field) var3.field2462[var7].field854;
                            int var13 = var12.getInt(null);
                            arg0.method370(0, (byte) 123);
                            arg0.method369(var13, (byte) -122);
                        } else if (var8 == 1) {
                            Field var9 = (Field) var3.field2462[var7].field854;
                            var9.setInt(null, var3.field2453[var7]);
                            arg0.method370(0, (byte) 123);
                        } else if (var8 == 2) {
                            Field var10 = (Field) var3.field2462[var7].field854;
                            int var11 = var10.getModifiers();
                            arg0.method370(0, (byte) 123);
                            arg0.method369(var11, (byte) -126);
                        }
                        if (var8 == 3) {
                            Method var16 = (Method) var3.field2459[var7].field854;
                            byte[][] var17 = var3.field2461[var7];
                            Object[] var18 = new Object[var17.length];
                            for (int var19 = 0; var19 < var17.length; var19++) {
                                ObjectInputStream var20 = new ObjectInputStream(new ByteArrayInputStream(var17[var19]));
                                var18[var19] = var20.readObject();
                            }
                            Object var21 = var16.invoke(null, var18);
                            if (var21 == null) {
                                arg0.method370(0, (byte) 123);
                            } else if (var21 instanceof Number) {
                                arg0.method370(1, (byte) 123);
                                arg0.method373((byte) -52, ((Number) var21).longValue());
                            } else if (var21 instanceof class163) {
                                arg0.method370(2, (byte) 123);
                                arg0.method342(true, (class163) var21);
                            } else {
                                arg0.method370(4, (byte) 123);
                            }
                        } else if (var8 == 4) {
                            Method var14 = (Method) var3.field2459[var7].field854;
                            int var15 = var14.getModifiers();
                            arg0.method370(0, (byte) 123);
                            arg0.method369(var15, (byte) -123);
                        }
                    } catch (ClassNotFoundException var22) {
                        arg0.method370(-10, (byte) 123);
                    } catch (InvalidClassException var23) {
                        arg0.method370(-11, (byte) 123);
                    } catch (StreamCorruptedException var24) {
                        arg0.method370(-12, (byte) 123);
                    } catch (OptionalDataException var25) {
                        arg0.method370(-13, (byte) 123);
                    } catch (IllegalAccessException var26) {
                        arg0.method370(-14, (byte) 123);
                    } catch (IllegalArgumentException var27) {
                        arg0.method370(-15, (byte) 123);
                    } catch (InvocationTargetException var28) {
                        arg0.method370(-16, (byte) 123);
                    } catch (SecurityException var29) {
                        arg0.method370(-17, (byte) 123);
                    } catch (IOException var30) {
                        arg0.method370(-18, (byte) 123);
                    } catch (NullPointerException var31) {
                        arg0.method370(-19, (byte) 123);
                    } catch (Exception var32) {
                        arg0.method370(-20, (byte) 123);
                    } catch (Throwable var33) {
                        arg0.method370(-21, (byte) 123);
                    }
                } else {
                    arg0.method370(var3.field2470[var7], (byte) 123);
                }
            }
            arg0.method356((byte) 56, var6);
            arg0.method359(arg0.field1033 - var6, 65280);
            var3.method630(24);
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(Lig;II)I")
    public static final int method1017(class84 arg0, int arg1, int arg2) {
        field3281++;
        if (arg0.field1754 == null || arg0.field1754.length <= arg2) {
            return -2;
        }
        try {
            int[] var3 = arg0.field1754[arg2];
            int var4 = 0;
            if (arg1 <= 106) {
                method1010(101, 37);
            }
            int var5 = 0;
            byte var6 = 0;
            while (true) {
                int var7 = var3[var5++];
                byte var8 = 0;
                int var9 = 0;
                if (var7 == 0) {
                    return var4;
                }
                if (var7 == 15) {
                    var8 = 1;
                }
                if (var7 == 1) {
                    var9 = class92.field2003[var3[var5++]];
                }
                if (var7 == 2) {
                    var9 = class186.field3711[var3[var5++]];
                }
                if (var7 == 16) {
                    var8 = 2;
                }
                if (var7 == 3) {
                    var9 = class11.field227[var3[var5++]];
                }
                if (var7 == 4) {
                    int var10 = var3[var5++] << 16;
                    int var11 = var10 + var3[var5++];
                    class84 var12 = class138.method907(var11, false);
                    int var13 = var3[var5++];
                    if (var13 != -1 && (!class97.method669(-98, var13).field37 || class143.field2955)) {
                        for (int var14 = 0; var14 < var12.field1750.length; var14++) {
                            if (var13 + 1 == var12.field1750[var14]) {
                                var9 += var12.field1766[var14];
                            }
                        }
                    }
                }
                if (var7 == 17) {
                    var8 = 3;
                }
                if (var7 == 5) {
                    var9 = class143.field2940[var3[var5++]];
                }
                if (var7 == 6) {
                    var9 = class26.field474[class186.field3711[var3[var5++]] - 1];
                }
                if (var7 == 7) {
                    var9 = class143.field2940[var3[var5++]] * 100 / 46875;
                }
                if (var7 == 8) {
                    var9 = class56.field1136.field753;
                }
                if (var7 == 9) {
                    for (int var15 = 0; var15 < 25; var15++) {
                        if (class121.field2551[var15]) {
                            var9 += class186.field3711[var15];
                        }
                    }
                }
                if (var7 == 10) {
                    int var16 = var3[var5++] << 16;
                    int var17 = var16 + var3[var5++];
                    class84 var18 = class138.method907(var17, false);
                    int var19 = var3[var5++];
                    if (var19 != -1 && (!class97.method669(-119, var19).field37 || class143.field2955)) {
                        for (int var20 = 0; var20 < var18.field1750.length; var20++) {
                            if (var19 + 1 == var18.field1750[var20]) {
                                var9 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var7 == 11) {
                    var9 = class58.field1171;
                }
                if (var7 == 12) {
                    var9 = class38.field791;
                }
                if (var7 == 13) {
                    int var21 = class143.field2940[var3[var5++]];
                    int var22 = var3[var5++];
                    var9 = (0x1 << var22 & var21) == 0 ? 0 : 1;
                }
                if (var7 == 14) {
                    int var23 = var3[var5++];
                    var9 = class86.method609(var23, 25331);
                }
                if (var7 == 18) {
                    var9 = (class56.field1136.field716 >> 7) + class172.field3493;
                }
                if (var7 == 19) {
                    var9 = (class56.field1136.field679 >> 7) + class69.field1470;
                }
                if (var7 == 20) {
                    var9 = var3[var5++];
                }
                if (var8 == 0) {
                    if (var6 == 0) {
                        var4 += var9;
                    }
                    if (var6 == 1) {
                        var4 -= var9;
                    }
                    if (var6 == 2 && var9 != 0) {
                        var4 /= var9;
                    }
                    if (var6 == 3) {
                        var4 *= var9;
                    }
                    var6 = 0;
                } else {
                    var6 = var8;
                }
            }
        } catch (Exception var24) {
            return -1;
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(Z)V")
    public final void method1018(boolean arg0) {
        if (!arg0) {
            method1017(null, -100, 13);
        }
        if (this.field3271 == -1) {
            if (this.field3272 == null) {
                this.field3271 = 0;
            } else {
                this.field3271 = 2;
            }
        }
        field3278++;
        if (this.field3295 != -1) {
            return;
        }
        if (this.field3272 == null) {
            this.field3295 = 0;
        } else {
            this.field3295 = 2;
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(IILje;)Lje;")
    public final class91 method1019(int arg0, int arg1, class91 arg2) {
        field3290++;
        int var4 = this.field3263[arg0];
        class86 var5 = class194.method1297(var4 >> 16, 1);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg2.method179(true);
        } else if (arg1 >= -120) {
            return null;
        } else {
            class91 var7 = arg2.method179(!var5.method605(var6, 4));
            var7.method186(var5, var6);
            return var7;
        }
    }

    @OriginalMember(owner = "client!re", name = "f", descriptor = "(I)V")
    public static void method1020(int arg0) {
        if (arg0 != 12) {
            return;
        }
        field3277 = null;
        field3268 = null;
        field3280 = null;
        field3264 = null;
        field3266 = null;
        field3283 = null;
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(Lje;II)Lje;")
    public final class91 method1021(class91 arg0, int arg1, int arg2) {
        field3289++;
        int var4 = this.field3263[arg2];
        class86 var5 = class194.method1297(var4 >> 16, 1);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method179(true);
        }
        class86 var7 = null;
        int var8 = 0;
        if (this.field3274 != null && this.field3274.length > arg2) {
            int var9 = this.field3274[arg2];
            var7 = class194.method1297(var9 >> 16, 1);
            var8 = var9 & 0xFFFF;
        }
        if (var7 == null || var8 == 65535) {
            class91 var11 = arg0.method179(!var5.method605(var6, 4));
            var11.method186(var5, var6);
            return var11;
        }
        class91 var10 = arg0.method179(!var5.method605(var6, 4) & !var7.method605(var8, 4));
        if (arg1 != 828867248) {
            this.field3271 = 96;
        }
        var10.method186(var5, var6);
        var10.method186(var7, var8);
        return var10;
    }
}
