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

@OriginalClass("client!is")
public class class528 extends class127 {

    @OriginalMember(owner = "client!is", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field7674 = new String[] { method3992(method3991("\u0003d=sY")), method3992(method3991("\u00119=\u001e\f")), method3992(method3991("\u0003d=uY")), method3992(method3991("\u0004b\u007f\\")), method3992(method3991("\u0003d=tY")), method3992(method3991("\u0003d=rY")), method3992(method3991("\u0003d=qY")) };

    @OriginalMember(owner = "client!is", name = "g", descriptor = "[F")
    public static float[] field7671 = new float[4];

    @OriginalMember(owner = "client!is", name = "i", descriptor = "I")
    public static int field7667;

    @OriginalMember(owner = "client!is", name = "h", descriptor = "I")
    public static int field7668;

    @OriginalMember(owner = "client!is", name = "f", descriptor = "I")
    public static int field7669;

    @OriginalMember(owner = "client!is", name = "j", descriptor = "I")
    public static int field7673;

    @OriginalMember(owner = "client!is", name = "l", descriptor = "Lsg;")
    public static class417 field7670;

    @OriginalMember(owner = "client!is", name = "k", descriptor = "Lda;")
    public static class67 field7672;

    @OriginalMember(owner = "client!is", name = "b", descriptor = "(II)V", line = 3)
    public static final void method3986(int arg0, int arg1) {
        try {
            field7669++;
            if (arg0 != -1) {
                method3987(19);
            }
            class313 var2 = class196.method1670((long) arg1, 9, 106);
            var2.method2635(true);
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field7674[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(I)V", line = 24)
    public static void method3987(int arg0) {
        try {
            if (arg0 != -16) {
                method3986(-78, -70);
            }
            field7672 = null;
            field7670 = null;
            field7671 = null;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field7674[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(ILha;IIIII)Lka;", line = 39)
    public static final class497 method3988(int arg0, class66 arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        try {
            if (arg2 != 16785) {
                method3988(-22, null, 115, -90, -89, -78, 119);
            }
            field7667++;
            long var7 = (long) arg5;
            class497 var9 = (class497) class618.field9078.method1558((byte) 96, var7);
            short var10 = 2055;
            if (var9 == null) {
                class137 var11 = class772.method5596(0, 25329, class589.field8661, arg5);
                if (var11 == null) {
                    return null;
                }
                if (var11.field1627 < 13) {
                    var11.method1163(2, arg2 ^ 0xFFFFBA7E);
                }
                var9 = arg1.method552(var11, var10, class274.field4144, 64, 768);
                class618.field9078.method1556(var7, var9, 1);
            }
            class497 var12 = var9.method332((byte) 2, var10, true);
            if (arg3 != 0) {
                var12.method312(arg3);
            }
            if (arg0 != 0) {
                var12.method325(arg0);
            }
            if (arg6 != 0) {
                var12.method344(arg6);
            }
            if (arg4 != 0) {
                var12.method298(0, arg4, 0);
            }
            return var12;
        } catch (RuntimeException var14) {
            throw class759.method5498(var14, field7674[5] + arg0 + ',' + (arg1 == null ? field7674[3] : field7674[1]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
        }
    }

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(ILub;)V", line = 89)
    public static final void method3989(int arg0, class22 arg1) {
        try {
            field7673++;
            class132 var2 = (class132) class598.field8804.method3863((byte) 64);
            if (var2 != null) {
                boolean var3 = false;
                for (int var4 = 0; var4 < var2.field1547; var4++) {
                    if (var2.field1540[var4] != null) {
                        if (var2.field1540[var4].field503 == 2) {
                            var2.field1545[var4] = -5;
                        }
                        if (var2.field1540[var4].field503 == 0) {
                            var3 = true;
                        }
                    }
                    if (var2.field1538[var4] != null) {
                        if (var2.field1538[var4].field503 == 2) {
                            var2.field1545[var4] = -6;
                        }
                        if (var2.field1538[var4].field503 == 0) {
                            var3 = true;
                        }
                    }
                }
                if (!var3) {
                    int var5 = arg1.field2201;
                    arg1.method1412(true, var2.field1544);
                    for (int var6 = arg0; var6 < var2.field1547; var6++) {
                        if (var2.field1545[var6] == 0) {
                            try {
                                int var7 = var2.field1542[var6];
                                if (var7 == 0) {
                                    Field var8 = (Field) var2.field1540[var6].field499;
                                    int var9 = var8.getInt(null);
                                    arg1.method1428((byte) -24, 0);
                                    arg1.method1412(true, var9);
                                } else if (var7 == 1) {
                                    Field var12 = (Field) var2.field1540[var6].field499;
                                    var12.setInt(null, var2.field1541[var6]);
                                    arg1.method1428((byte) -24, 0);
                                } else if (var7 == 2) {
                                    Field var10 = (Field) var2.field1540[var6].field499;
                                    int var11 = var10.getModifiers();
                                    arg1.method1428((byte) -24, 0);
                                    arg1.method1412(true, var11);
                                }
                                if (var7 == 3) {
                                    Method var15 = (Method) var2.field1538[var6].field499;
                                    byte[][] var16 = var2.field1549[var6];
                                    Object[] var17 = new Object[var16.length];
                                    for (int var18 = 0; var18 < var16.length; var18++) {
                                        ObjectInputStream var19 = new ObjectInputStream(new ByteArrayInputStream(var16[var18]));
                                        var17[var18] = var19.readObject();
                                    }
                                    Object var20 = var15.invoke(null, var17);
                                    if (var20 == null) {
                                        arg1.method1428((byte) -24, 0);
                                    } else if ((var20 instanceof Number)) {
                                        arg1.method1428((byte) -24, 1);
                                        arg1.method1443(((Number) var20).longValue(), 255);
                                    } else if ((var20 instanceof String)) {
                                        arg1.method1428((byte) -24, 2);
                                        arg1.method1464((String) var20, 255);
                                    } else {
                                        arg1.method1428((byte) -24, 4);
                                    }
                                } else if (var7 == 4) {
                                    Method var13 = (Method) var2.field1538[var6].field499;
                                    int var14 = var13.getModifiers();
                                    arg1.method1428((byte) -24, 0);
                                    arg1.method1412(true, var14);
                                }
                            } catch (ClassNotFoundException var22) {
                                arg1.method1428((byte) -24, -10);
                            } catch (InvalidClassException var23) {
                                arg1.method1428((byte) -24, -11);
                            } catch (StreamCorruptedException var24) {
                                arg1.method1428((byte) -24, -12);
                            } catch (OptionalDataException var25) {
                                arg1.method1428((byte) -24, -13);
                            } catch (IllegalAccessException var26) {
                                arg1.method1428((byte) -24, -14);
                            } catch (IllegalArgumentException var27) {
                                arg1.method1428((byte) -24, -15);
                            } catch (InvocationTargetException var28) {
                                arg1.method1428((byte) -24, -16);
                            } catch (SecurityException var29) {
                                arg1.method1428((byte) -24, -17);
                            } catch (IOException var30) {
                                arg1.method1428((byte) -24, -18);
                            } catch (NullPointerException var31) {
                                arg1.method1428((byte) -24, -19);
                            } catch (Exception var32) {
                                arg1.method1428((byte) -24, -20);
                            } catch (Throwable var33) {
                                arg1.method1428((byte) -24, -21);
                            }
                        } else {
                            arg1.method1428((byte) -24, var2.field1545[var6]);
                        }
                    }
                    arg1.method1411(false, var5);
                    var2.method1824(1);
                }
            }
        } catch (RuntimeException var34) {
            throw class759.method5498(var34, field7674[2] + arg0 + ',' + (arg1 == null ? field7674[3] : field7674[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!is", name = "a", descriptor = "(IIILhs;ILka;IIIILha;III)Lka;", line = 275)
    public static final class497 method3990(int arg0, int arg1, int arg2, class344 arg3, int arg4, class497 arg5, int arg6, int arg7, int arg8, int arg9, class66 arg10, int arg11, int arg12, int arg13) {
        try {
            field7668++;
            if (arg5 == null) {
                return null;
            }
            int var14 = 2055;
            if (arg3 != null) {
                int var15 = var14 | arg3.method2847(arg13 - 1149679514, -1, arg1, false);
                var14 = var15 & 0xFFFFFDFF;
            }
            long var16 = ((long) arg6 << 32) + (long) ((arg2 << 24) + (arg9 << 16) + arg4) + ((long) arg12 << 48);
            class178 var18 = class245.field3750;
            class497 var19;
            synchronized (class245.field3750) {
                var19 = (class497) class245.field3750.method1558((byte) 96, var16);
                if (arg13 != -19478) {
                    field7671 = null;
                }
            }
            if (var19 == null || arg10.method509(var19.method330(), var14) != 0) {
                if (var19 != null) {
                    var14 = arg10.method499(var14, var19.method330());
                }
                byte var20;
                if (arg4 == 1) {
                    var20 = 9;
                } else if (arg4 == 2) {
                    var20 = 12;
                } else if (arg4 == 3) {
                    var20 = 15;
                } else if (arg4 == 4) {
                    var20 = 18;
                } else {
                    var20 = 21;
                }
                byte var21 = 3;
                int[] var22 = new int[] { 64, 96, 128 };
                class137 var23 = new class137((var20 * var21) + 1, var20 * var21 * 2 + -var20, 0);
                int var24 = var23.method1166(0, (byte) -44, 0, 0);
                int[][] var25 = new int[var21][var20];
                for (int var26 = 0; var26 < var21; var26++) {
                    int var27 = var22[var26];
                    int var28 = var22[var26];
                    for (int var29 = 0; var29 < var20; var29++) {
                        int var30 = (var29 << 14) / var20;
                        int var31 = class298.field4704[var30] * var27 >> 14;
                        int var32 = class298.field4703[var30] * var28 >> 14;
                        var25[var26][var29] = var23.method1166(0, (byte) -78, var32, var31);
                    }
                }
                for (int var33 = 0; var33 < var21; var33++) {
                    int var34 = (var33 * 256 + 128) / var21;
                    int var35 = 256 - var34;
                    byte var36 = (byte) (arg2 * var34 + arg9 * var35 >> 8);
                    short var37 = (short) (((arg6 & 0xFC00) * var35 + (arg12 & 0xFC00) * var34 & 0xFC0000) + ((arg6 & 0x7F) * var35 + (arg12 & 0x7F) * var34 & 0x7F00) + ((arg6 & 0x380) * var35 + (arg12 & 0x380) * var34 & 0x38000) >> 8);
                    for (int var38 = 0; var38 < var20; var38++) {
                        if (var33 == 0) {
                            var23.method1171((byte) 106, var36, (byte) -1, (byte) 1, var37, var24, (short) -1, var25[0][var38], var25[0][(var38 + 1) % var20]);
                        } else {
                            var23.method1171((byte) 84, var36, (byte) -1, (byte) 1, var37, var25[var33 - 1][var38], (short) -1, var25[var33][(var38 + 1) % var20], var25[var33 - 1][(var38 + 1) % var20]);
                            var23.method1171((byte) 79, var36, (byte) -1, (byte) 1, var37, var25[var33 - 1][var38], (short) -1, var25[var33][var38], var25[var33][(var38 + 1) % var20]);
                        }
                    }
                }
                var19 = arg10.method552(var23, var14, class106.field1229, 64, 768);
                class178 var39 = class245.field3750;
                synchronized (class245.field3750) {
                    class245.field3750.method1556(var16, var19, 1);
                }
            }
            int var40 = arg5.method335();
            int var41 = arg5.method341();
            int var42 = arg5.method340();
            int var43 = arg5.method336();
            class87 var44 = null;
            if (arg3 != null) {
                int var50 = arg3.field5366[arg1];
                var44 = class272.field4122.method2243(var50 >> 16, arg13 ^ 0xFFFFB3AA);
                arg1 = var50 & 0xFFFF;
            }
            class497 var45;
            if (var44 == null) {
                var45 = var19.method332((byte) 3, var14, true);
                var45.method338(var41 - var40 >> 1, 128, var43 - var42 >> 1);
                var45.method298(var40 + var41 >> 1, 0, var42 + var43 >> 1);
            } else {
                var45 = var19.method332((byte) 3, var14, true);
                var45.method338(var41 - var40 >> 1, 128, var43 - var42 >> 1);
                var45.method298(var40 + var41 >> 1, 0, var42 + var43 >> 1);
                var45.method3757(arg1, false, var44);
            }
            if (arg8 != 0) {
                var45.method325(arg8);
            }
            if (arg11 != 0) {
                var45.method344(arg11);
            }
            if (arg7 != 0) {
                var45.method298(0, arg7, 0);
            }
            return var45;
        } catch (RuntimeException var49) {
            throw class759.method5498(var49, field7674[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 == null ? field7674[3] : field7674[1]) + ',' + arg4 + ',' + (arg5 == null ? field7674[3] : field7674[1]) + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + (arg10 == null ? field7674[3] : field7674[1]) + ',' + arg11 + ',' + arg12 + ',' + arg13 + ')');
        }
    }

    @OriginalMember(owner = "client!is", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3991(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x71);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!is", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3992(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 106;
                    break;
                case 1:
                    var10005 = 23;
                    break;
                case 2:
                    var10005 = 19;
                    break;
                case 3:
                    var10005 = 48;
                    break;
                default:
                    var10005 = 113;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
