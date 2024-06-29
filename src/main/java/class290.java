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

@OriginalClass("client!wg")
public class class290 {

    @OriginalMember(owner = "client!wg", name = "c", descriptor = "J")
    public long field4550 = 0L;

    @OriginalMember(owner = "client!wg", name = "f", descriptor = "[[I")
    public static int[][] field4553 = new int[5][5000];

    @OriginalMember(owner = "client!wg", name = "n", descriptor = "Lta;")
    public static class197 field4561 = new class197(30);

    @OriginalMember(owner = "client!wg", name = "s", descriptor = "I")
    public static int field4566 = 0;

    @OriginalMember(owner = "client!wg", name = "u", descriptor = "[I")
    public static int[] field4568 = new int[32];

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "I")
    public int field4548;

    @OriginalMember(owner = "client!wg", name = "d", descriptor = "I")
    public int field4551;

    @OriginalMember(owner = "client!wg", name = "e", descriptor = "I")
    public int field4552;

    @OriginalMember(owner = "client!wg", name = "g", descriptor = "I")
    public static int field4554;

    @OriginalMember(owner = "client!wg", name = "h", descriptor = "I")
    public static int field4555;

    @OriginalMember(owner = "client!wg", name = "i", descriptor = "I")
    public int field4556;

    @OriginalMember(owner = "client!wg", name = "j", descriptor = "I")
    public int field4557;

    @OriginalMember(owner = "client!wg", name = "k", descriptor = "I")
    public static int field4558;

    @OriginalMember(owner = "client!wg", name = "l", descriptor = "I")
    public int field4559;

    @OriginalMember(owner = "client!wg", name = "m", descriptor = "I")
    public static int field4560;

    @OriginalMember(owner = "client!wg", name = "o", descriptor = "I")
    public static int field4562;

    @OriginalMember(owner = "client!wg", name = "q", descriptor = "I")
    public int field4564;

    @OriginalMember(owner = "client!wg", name = "r", descriptor = "I")
    public static int field4565;

    @OriginalMember(owner = "client!wg", name = "v", descriptor = "I")
    public static int field4569;

    @OriginalMember(owner = "client!wg", name = "t", descriptor = "Lvd;")
    public static class134 field4567;

    @OriginalMember(owner = "client!wg", name = "b", descriptor = "Lgd;")
    public class310 field4549;

    @OriginalMember(owner = "client!wg", name = "p", descriptor = "Lgd;")
    public class310 field4563;

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(Z)V", line = 4)
    public static void method2047(boolean arg0) {
        field4567 = null;
        field4568 = null;
        if (arg0) {
            field4566 = 106;
        }
        field4553 = (int[][]) null;
        field4561 = null;
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(ZLoa;)V", line = 22)
    public static final void method2048(boolean arg0, class288 arg1) {
        field4554++;
        int var2 = arg1.field4521 - class312.field4852;
        int var3 = arg1.field4467 * 128 + arg1.method929(12) * 64;
        int var4 = arg1.field4452 * 128 + (arg1.method929(12) * 64);
        arg1.field4495 = 0;
        if (arg1.field4445 == 0) {
            arg1.field4497 = 1024;
        }
        arg1.field4507 += (var3 - arg1.field4507) / var2;
        if (arg1.field4445 == 1) {
            arg1.field4497 = 1536;
        }
        arg1.field4496 += (var4 - arg1.field4496) / var2;
        if (arg1.field4445 == 2) {
            arg1.field4497 = 0;
        }
        if (arg1.field4445 == 3) {
            arg1.field4497 = 512;
        }
        if (!arg0) {
            method2047(true);
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(ILek;I)I", line = 66)
    public static final int method2049(int arg0, class184 arg1, int arg2) {
        field4558++;
        if (arg1.field2821 == null || arg2 >= arg1.field2821.length) {
            return -2;
        }
        try {
            int[] var3 = arg1.field2821[arg2];
            if (arg0 != -10320) {
                method2051(16);
            }
            int var4 = 0;
            int var5 = 0;
            byte var6 = 0;
            while (true) {
                int var7 = var3[var5++];
                int var8 = 0;
                byte var9 = 0;
                if (var7 == 0) {
                    return var4;
                }
                if (var7 == 15) {
                    var9 = 1;
                }
                if (var7 == 1) {
                    var8 = class49.field755[var3[var5++]];
                }
                if (var7 == 16) {
                    var9 = 2;
                }
                if (var7 == 17) {
                    var9 = 3;
                }
                if (var7 == 2) {
                    var8 = class118.field1859[var3[var5++]];
                }
                if (var7 == 3) {
                    var8 = class76.field1076[var3[var5++]];
                }
                if (var7 == 4) {
                    int var10 = var3[var5++] << 16;
                    int var11 = var10 + var3[var5++];
                    class184 var12 = class100.method781((byte) 48, var11);
                    int var13 = var3[var5++];
                    if (var13 != -1 && (!class225.method1603(var13, 0).field4200 || class43.field674)) {
                        for (int var14 = 0; var14 < var12.field2903.length; var14++) {
                            if ((var13 + 1) == var12.field2903[var14]) {
                                var8 += var12.field2856[var14];
                            }
                        }
                    }
                }
                if (var7 == 5) {
                    var8 = class199.field3158[var3[var5++]];
                }
                if (var7 == 6) {
                    var8 = class257.field3835[class118.field1859[var3[var5++]] - 1];
                }
                if (var7 == 7) {
                    var8 = class199.field3158[var3[var5++]] * 100 / 46875;
                }
                if (var7 == 8) {
                    var8 = class235.field3602.field1910;
                }
                if (var7 == 9) {
                    for (int var15 = 0; var15 < 25; var15++) {
                        if (class181.field2717[var15]) {
                            var8 += class118.field1859[var15];
                        }
                    }
                }
                if (var7 == 10) {
                    int var16 = var3[var5++] << 16;
                    int var17 = var16 + var3[var5++];
                    class184 var18 = class100.method781((byte) 48, var17);
                    int var19 = var3[var5++];
                    if (var19 != -1 && (!class225.method1603(var19, 0).field4200 || class43.field674)) {
                        for (int var20 = 0; var20 < var18.field2903.length; var20++) {
                            if ((var19 + 1) == var18.field2903[var20]) {
                                var8 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var7 == 11) {
                    var8 = class271.field4092;
                }
                if (var7 == 12) {
                    var8 = class75.field1061;
                }
                if (var7 == 13) {
                    int var21 = class199.field3158[var3[var5++]];
                    int var22 = var3[var5++];
                    var8 = (var21 & 0x1 << var22) == 0 ? 0 : 1;
                }
                if (var7 == 14) {
                    int var23 = var3[var5++];
                    var8 = class304.method2124((byte) 106, var23);
                }
                if (var7 == 18) {
                    var8 = (class235.field3602.field4507 >> 7) + class302.field4735;
                }
                if (var7 == 19) {
                    var8 = (class235.field3602.field4496 >> 7) + class110.field1744;
                }
                if (var7 == 20) {
                    var8 = var3[var5++];
                }
                if (var9 == 0) {
                    if (var6 == 0) {
                        var4 += var8;
                    }
                    if (var6 == 1) {
                        var4 -= var8;
                    }
                    if (var6 == 2 && var8 != 0) {
                        var4 /= var8;
                    }
                    if (var6 == 3) {
                        var4 *= var8;
                    }
                    var6 = 0;
                } else {
                    var6 = var9;
                }
            }
        } catch (Exception var25) {
            return -1;
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(ILtb;Ltb;BZ)I", line = 276)
    public static final int method2050(int arg0, class220 arg1, class220 arg2, byte arg3, boolean arg4) {
        field4560++;
        if (arg0 == 1) {
            int var5 = arg1.field3466;
            int var6 = arg2.field3466;
            if (!arg4) {
                if (var5 == -1) {
                    var5 = 2001;
                }
                if (var6 == -1) {
                    var6 = 2001;
                }
            }
            return var6 - var5;
        } else if (arg0 == 2) {
            return class108.method835(109, arg2.method1571(arg3 ^ 0x44).field1116, class98.field1452, arg1.method1571(arg3 - 242).field1116);
        } else {
            if (arg3 != 120) {
                field4566 = -123;
            }
            if (arg0 == 3) {
                if (arg2.field3450.equals("-")) {
                    if (arg1.field3450.equals("-")) {
                        return 0;
                    } else if (arg4) {
                        return -1;
                    } else {
                        return 1;
                    }
                } else if (arg1.field3450.equals("-")) {
                    return arg4 ? 1 : -1;
                } else {
                    return class108.method835(arg3 ^ 0x2B, arg2.field3450, class98.field1452, arg1.field3450);
                }
            } else if (arg0 == 4) {
                return arg2.method1589(-9100) ? (arg1.method1589(-9100) ? 0 : 1) : (arg1.method1589(-9100) ? -1 : 0);
            } else if (arg0 == 5) {
                return arg2.method1583(9162) ? (arg1.method1583(9162) ? 0 : 1) : (arg1.method1583(9162) ? -1 : 0);
            } else if (arg0 == 6) {
                return arg2.method1588(arg3 - 207) ? (arg1.method1588(~arg3) ? 0 : 1) : (arg1.method1588(-62) ? -1 : 0);
            } else if (arg0 == 7) {
                return arg2.method1587(arg3 - 207) ? (arg1.method1587(-41) ? 0 : 1) : (arg1.method1587(-97) ? -1 : 0);
            } else {
                return arg2.field3456 - arg1.field3456;
            }
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(I)V", line = 347)
    public static final void method2051(int arg0) {
        class98.field1456++;
        field4562++;
        class159.field2372.method59(arg0, (byte) 73);
        class159.field2372.method262((byte) 81, class76.method613((byte) 119));
        class159.field2372.method263(class125.field1972, (byte) 123);
        class159.field2372.method263(class210.field3314, (byte) 110);
        class159.field2372.method262((byte) 81, class117.field1834);
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(II[Lek;)V", line = 368)
    public static final void method2052(int arg0, int arg1, class184[] arg2) {
        for (int var3 = 0; var3 < arg2.length; var3++) {
            class184 var4 = arg2[var3];
            if (var4 != null && var4.field2974 == arg1 && (!var4.field2802 || !client.method1767(var4))) {
                if (var4.field2945 == 0) {
                    if (!var4.field2802 && client.method1767(var4) && class322.field5012 != var4) {
                        continue;
                    }
                    method2052(arg0, var4.field2806, arg2);
                    if (var4.field2946 != null) {
                        method2052(1, var4.field2806, var4.field2946);
                    }
                    class111 var5 = (class111) client.field3794.method203(arg0 ^ 0x6AF, (long) var4.field2806);
                    if (var5 != null) {
                        class302.method2117(var5.field1750, (byte) 127);
                    }
                }
                if (var4.field2945 == 6) {
                    if (var4.field2950 != -1 || var4.field2810 != -1) {
                        boolean var6 = class105.method811(true, var4);
                        int var7;
                        if (var6) {
                            var7 = var4.field2810;
                        } else {
                            var7 = var4.field2950;
                        }
                        if (var7 != -1) {
                            class162 var8 = class173.method1259((byte) 119, var7);
                            if (var8 != null) {
                                var4.field2892 += class88.field1297;
                                while (var4.field2892 > var8.field2423[var4.field2925]) {
                                    var4.field2892 -= var8.field2423[var4.field2925];
                                    var4.field2925++;
                                    if (var8.field2401.length <= var4.field2925) {
                                        var4.field2925 -= var8.field2407;
                                        if (var4.field2925 < 0 || var8.field2401.length <= var4.field2925) {
                                            var4.field2925 = 0;
                                        }
                                    }
                                    var4.field2905 = var4.field2925 + 1;
                                    if (var4.field2905 >= var8.field2401.length) {
                                        var4.field2905 -= var8.field2407;
                                        if (var4.field2905 < 0 || var4.field2905 >= var8.field2401.length) {
                                            var4.field2905 = -1;
                                        }
                                    }
                                    class133.method1007(var4, arg0 + 58);
                                }
                            }
                        }
                    }
                    if (var4.field2866 != 0 && !var4.field2802) {
                        int var9 = var4.field2866 << 16 >> 16;
                        int var10 = class88.field1297 * var9;
                        var4.field2878 = var4.field2878 + var10 & 0x7FF;
                        int var11 = var4.field2866 >> 16;
                        int var12 = class88.field1297 * var11;
                        var4.field2941 = var4.field2941 + var12 & 0x7FF;
                        class133.method1007(var4, 125);
                    }
                }
            }
        }
        if (arg0 != 1) {
            field4568 = (int[]) null;
        }
        field4555++;
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(ILgk;I)V", line = 493)
    public static final void method2053(int arg0, class7 arg1, int arg2) {
        if (arg0 != -21) {
            return;
        }
        field4565++;
        while (true) {
            class282 var3 = (class282) class16.field182.method986(false);
            if (var3 == null) {
                return;
            }
            boolean var4 = false;
            for (int var5 = 0; var5 < var3.field4356; var5++) {
                if (var3.field4363[var5] != null) {
                    if (var3.field4363[var5].field3585 == 2) {
                        var3.field4358[var5] = -5;
                    }
                    if (var3.field4363[var5].field3585 == 0) {
                        var4 = true;
                    }
                }
                if (var3.field4366[var5] != null) {
                    if (var3.field4366[var5].field3585 == 2) {
                        var3.field4358[var5] = -6;
                    }
                    if (var3.field4366[var5].field3585 == 0) {
                        var4 = true;
                    }
                }
            }
            if (var4) {
                return;
            }
            arg1.method59(arg2, (byte) 73);
            arg1.method262((byte) 81, 0);
            int var6 = arg1.field455;
            arg1.method259(arg0 ^ 0x3B4E, var3.field4353);
            for (int var7 = 0; var7 < var3.field4356; var7++) {
                if (var3.field4358[var7] == 0) {
                    try {
                        int var8 = var3.field4362[var7];
                        if (var8 == 0) {
                            Field var9 = (Field) var3.field4363[var7].field3590;
                            int var10 = var9.getInt((Object) null);
                            arg1.method262((byte) 81, 0);
                            arg1.method259(-15195, var10);
                        } else if (var8 == 1) {
                            Field var11 = (Field) var3.field4363[var7].field3590;
                            var11.setInt((Object) null, var3.field4365[var7]);
                            arg1.method262((byte) 81, 0);
                        } else if (var8 == 2) {
                            Field var12 = (Field) var3.field4363[var7].field3590;
                            int var13 = var12.getModifiers();
                            arg1.method262((byte) 81, 0);
                            arg1.method259(-15195, var13);
                        }
                        if (var8 == 3) {
                            Method var16 = (Method) var3.field4366[var7].field3590;
                            byte[][] var17 = var3.field4359[var7];
                            Object[] var18 = new Object[var17.length];
                            for (int var19 = 0; var19 < var17.length; var19++) {
                                ObjectInputStream var20 = new ObjectInputStream(new ByteArrayInputStream(var17[var19]));
                                var18[var19] = var20.readObject();
                            }
                            Object var21 = var16.invoke((Object) null, var18);
                            if (var21 == null) {
                                arg1.method262((byte) 81, 0);
                            } else if (var21 instanceof Number) {
                                arg1.method262((byte) 81, 1);
                                arg1.method261(1523335144, ((Number) var21).longValue());
                            } else if ((var21 instanceof String)) {
                                arg1.method262((byte) 81, 2);
                                arg1.method277((String) var21, arg0 ^ 0xFFFFED4E);
                            } else {
                                arg1.method262((byte) 81, 4);
                            }
                        } else if (var8 == 4) {
                            Method var14 = (Method) var3.field4366[var7].field3590;
                            int var15 = var14.getModifiers();
                            arg1.method262((byte) 81, 0);
                            arg1.method259(-15195, var15);
                        }
                    } catch (ClassNotFoundException var34) {
                        arg1.method262((byte) 81, -10);
                    } catch (InvalidClassException var35) {
                        arg1.method262((byte) 81, -11);
                    } catch (StreamCorruptedException var36) {
                        arg1.method262((byte) 81, -12);
                    } catch (OptionalDataException var37) {
                        arg1.method262((byte) 81, -13);
                    } catch (IllegalAccessException var38) {
                        arg1.method262((byte) 81, -14);
                    } catch (IllegalArgumentException var39) {
                        arg1.method262((byte) 81, -15);
                    } catch (InvocationTargetException var40) {
                        arg1.method262((byte) 81, -16);
                    } catch (SecurityException var41) {
                        arg1.method262((byte) 81, -17);
                    } catch (IOException var42) {
                        arg1.method262((byte) 81, -18);
                    } catch (NullPointerException var43) {
                        arg1.method262((byte) 81, -19);
                    } catch (Exception var44) {
                        arg1.method262((byte) 81, -20);
                    } catch (Throwable var45) {
                        arg1.method262((byte) 81, -21);
                    }
                } else {
                    arg1.method262((byte) 81, var3.field4358[var7]);
                }
            }
            arg1.method247(var6, -52);
            arg1.method284(arg1.field455 - var6, false);
            var3.method1554((byte) -61);
        }
    }
}
