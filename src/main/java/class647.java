import jaclib.memory.Stream;
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

@OriginalClass("client!mka")
public class class647 extends class176 {

    @OriginalMember(owner = "client!mka", name = "Sb", descriptor = "[Ljava/lang/String;")
    private static final String[] field9285 = new String[] { method4718(method4717(">/Yv3{")), method4718(method4717("=1T4")), method4718(method4717("(j\u0016v\f")), method4718(method4717(">/Yv4{")), method4718(method4717(">/Yv;{")), method4718(method4717(">/Yv0{")), method4718(method4717(">/Yv6{")), method4718(method4717(">/Yv9{")), method4718(method4717(">/Yv5{")), method4718(method4717(">/Yv8{")), method4718(method4717("~i\u0006x")), method4718(method4717(">/Yv2{")) };

    @OriginalMember(owner = "client!mka", name = "Ob", descriptor = "Llt;")
    public static class706 field9282 = new class706(13, 3);

    @OriginalMember(owner = "client!mka", name = "Ib", descriptor = "Z")
    public static boolean field9284 = false;

    @OriginalMember(owner = "client!mka", name = "Mb", descriptor = "I")
    public static int field9274;

    @OriginalMember(owner = "client!mka", name = "Kb", descriptor = "I")
    public static int field9275;

    @OriginalMember(owner = "client!mka", name = "Qb", descriptor = "I")
    public static int field9276;

    @OriginalMember(owner = "client!mka", name = "Jb", descriptor = "I")
    public static int field9277;

    @OriginalMember(owner = "client!mka", name = "Nb", descriptor = "I")
    public static int field9278;

    @OriginalMember(owner = "client!mka", name = "Hb", descriptor = "I")
    public static int field9279;

    @OriginalMember(owner = "client!mka", name = "Lb", descriptor = "I")
    public static int field9280;

    @OriginalMember(owner = "client!mka", name = "Rb", descriptor = "I")
    public static int field9281;

    @OriginalMember(owner = "client!mka", name = "Pb", descriptor = "[I")
    public static int[] field9283;

    @OriginalMember(owner = "client!mka", name = "s", descriptor = "(II)I", line = 4)
    public static final int method4707(int arg0, int arg1) {
        return class192.field3020 != null ? class192.field3020[arg0][arg1] & 16777215 : 0;
    }

    @OriginalMember(owner = "client!mka", name = "a", descriptor = "(FZ)V", line = 9)
    public final void method4708(float arg0, boolean arg1) {
        try {
            if (!arg1) {
                method4713(26);
            }
            ++field9275;
            int var3 = Stream.floatToRawIntBits(arg0);
            super.field2805[super.field2799++] = (byte) (var3 >> 24);
            super.field2805[super.field2799++] = (byte) (var3 >> 16);
            super.field2805[super.field2799++] = (byte) (var3 >> 8);
            super.field2805[super.field2799++] = (byte) var3;
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field9285[4] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!mka", name = "x", descriptor = "(I)V", line = 25)
    public static void method4709(int arg0) {
        try {
            field9282 = null;
            field9283 = null;
            if (arg0 != 256) {
                field9284 = true;
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field9285[8] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!mka", name = "a", descriptor = "(IF)V", line = 36)
    public final void method4710(int arg0, float arg1) {
        try {
            ++field9280;
            int var3 = Stream.floatToRawIntBits(arg1);
            if (arg0 == -1597413832) {
                super.field2805[super.field2799++] = (byte) var3;
                super.field2805[super.field2799++] = (byte) (var3 >> 8);
                super.field2805[super.field2799++] = (byte) (var3 >> 16);
                super.field2805[super.field2799++] = (byte) (var3 >> 24);
            }
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field9285[3] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!mka", name = "<init>", descriptor = "(I)V", line = 54)
    public class647(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!mka", name = "a", descriptor = "(BII)Z", line = 57)
    public static final boolean method4711(byte arg0, int arg1, int arg2) {
        try {
            ++field9281;
            if (arg0 != -76) {
                field9284 = false;
            }
            return ~(arg2 & 544) == -545 | ~(24 & arg2) != -1;
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field9285[7] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!mka", name = "a", descriptor = "(ILwq;)V", line = 72)
    public static final void method4712(int arg0, class176 arg1) {
        try {
            ++field9277;
            byte[] var2 = new byte[24];
            if (arg0 == 24359) {
                if (class437.field6833 != null) {
                    try {
                        class437.field6833.method1724(arg0 ^ 32612, 0L);
                        class437.field6833.method1722(var2, arg0 + -12130);
                        int var3;
                        for (var3 = 0; ~var3 > -25 && var2[var3] == 0; ++var3) {
                        }
                        if (~var3 <= -25) {
                            throw new IOException();
                        }
                    } catch (Exception var6) {
                        for (int var4 = 0; var4 < 24; ++var4) {
                            var2[var4] = -1;
                        }
                    }
                }
                arg1.method1667(0, 24, arg0 ^ 24331, var2);
            }
        } catch (RuntimeException var7) {
            throw class590.method4333(var7, field9285[5] + arg0 + ',' + (arg1 != null ? field9285[2] : field9285[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!mka", name = "y", descriptor = "(I)Z", line = 117)
    public static final boolean method4713(int arg0) {
        try {
            ++field9276;
            class303 var1 = (class303) class140.field1953.method3228(11);
            if (var1 == null) {
                return false;
            } else {
                if (arg0 != -1) {
                    field9282 = null;
                }
                for (int var2 = 0; var2 < var1.field4888; ++var2) {
                    if (var1.field4886[var2] != null && ~var1.field4886[var2].field3402 == -1) {
                        return false;
                    }
                    if (var1.field4884[var2] != null && ~var1.field4884[var2].field3402 == -1) {
                        return false;
                    }
                }
                return true;
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field9285[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!mka", name = "a", descriptor = "(ZI)V", line = 156)
    public static final void method4714(boolean arg0, int arg1) {
        try {
            ++field9274;
            if (class54.field683.length() != arg1) {
                class6.method42(true, field9285[10] + class54.field683);
                class164.method1543(arg1 ^ 5, false, arg0, class54.field683);
                if (!arg0) {
                    class54.field683 = "";
                    class635.field9120 = 0;
                }
                class453.field7006 = 0;
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field9285[9] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!mka", name = "a", descriptor = "(ILrv;)V", line = 178)
    public static final void method4715(int arg0, class117 arg1) {
        try {
            ++field9278;
            class303 var2 = (class303) class140.field1953.method3228(11);
            if (var2 != null) {
                boolean var3 = false;
                for (int var4 = 0; var2.field4888 > var4; ++var4) {
                    if (var2.field4886[var4] != null) {
                        if (var2.field4886[var4].field3402 == 2) {
                            var2.field4885[var4] = -5;
                        }
                        if (~var2.field4886[var4].field3402 == -1) {
                            var3 = true;
                        }
                    }
                    if (var2.field4884[var4] != null) {
                        if (~var2.field4884[var4].field3402 == -3) {
                            var2.field4885[var4] = -6;
                        }
                        if (~var2.field4884[var4].field3402 == -1) {
                            var3 = true;
                        }
                    }
                }
                if (!var3) {
                    int var5 = arg1.field2799;
                    int var6 = -34 / ((arg0 - 51) / 63);
                    arg1.method1641((byte) -108, var2.field4883);
                    for (int var7 = 0; ~var7 > ~var2.field4888; ++var7) {
                        if (~var2.field4885[var7] != -1) {
                            arg1.method1678(var2.field4885[var7], 65280);
                        } else {
                            try {
                                int var8 = var2.field4878[var7];
                                if (var8 != 0) {
                                    if (~var8 != -2) {
                                        if (var8 == 2) {
                                            Field var9 = (Field) var2.field4886[var7].field3407;
                                            int var10 = var9.getModifiers();
                                            arg1.method1678(0, 65280);
                                            arg1.method1641((byte) -108, var10);
                                        }
                                    } else {
                                        Field var11 = (Field) var2.field4886[var7].field3407;
                                        var11.setInt((Object) null, var2.field4879[var7]);
                                        arg1.method1678(0, 65280);
                                    }
                                } else {
                                    Field var12 = (Field) var2.field4886[var7].field3407;
                                    int var13 = var12.getInt((Object) null);
                                    arg1.method1678(0, 65280);
                                    arg1.method1641((byte) -108, var13);
                                }
                                if (~var8 != -4) {
                                    if (var8 == 4) {
                                        Method var14 = (Method) var2.field4884[var7].field3407;
                                        int var15 = var14.getModifiers();
                                        arg1.method1678(0, 65280);
                                        arg1.method1641((byte) -108, var15);
                                    }
                                } else {
                                    Method var16 = (Method) var2.field4884[var7].field3407;
                                    byte[][] var17 = var2.field4881[var7];
                                    Object[] var18 = new Object[var17.length];
                                    for (int var19 = 0; ~var19 > ~var17.length; ++var19) {
                                        ObjectInputStream var20 = new ObjectInputStream(new ByteArrayInputStream(var17[var19]));
                                        var18[var19] = var20.readObject();
                                    }
                                    Object var21 = var16.invoke((Object) null, var18);
                                    if (var21 == null) {
                                        arg1.method1678(0, 65280);
                                    } else if (var21 instanceof Number) {
                                        arg1.method1678(1, 65280);
                                        arg1.method1683(((Number) var21).longValue(), -26);
                                    } else if (!(var21 instanceof String)) {
                                        arg1.method1678(4, 65280);
                                    } else {
                                        arg1.method1678(2, 65280);
                                        arg1.method1681((String) var21, 23137);
                                    }
                                }
                            } catch (ClassNotFoundException var23) {
                                arg1.method1678(-10, 65280);
                            } catch (InvalidClassException var24) {
                                arg1.method1678(-11, 65280);
                            } catch (StreamCorruptedException var25) {
                                arg1.method1678(-12, 65280);
                            } catch (OptionalDataException var26) {
                                arg1.method1678(-13, 65280);
                            } catch (IllegalAccessException var27) {
                                arg1.method1678(-14, 65280);
                            } catch (IllegalArgumentException var28) {
                                arg1.method1678(-15, 65280);
                            } catch (InvocationTargetException var29) {
                                arg1.method1678(-16, 65280);
                            } catch (SecurityException var30) {
                                arg1.method1678(-17, 65280);
                            } catch (IOException var31) {
                                arg1.method1678(-18, 65280);
                            } catch (NullPointerException var32) {
                                arg1.method1678(-19, 65280);
                            } catch (Exception var33) {
                                arg1.method1678(-20, 65280);
                            } catch (Throwable var34) {
                                arg1.method1678(-21, 65280);
                            }
                        }
                    }
                    arg1.method1653(var5, 31132);
                    var2.method4173(-1);
                }
            }
        } catch (RuntimeException var35) {
            throw class590.method4333(var35, field9285[11] + arg0 + ',' + (arg1 != null ? field9285[2] : field9285[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!mka", name = "a", descriptor = "(Laa;IILmj;IIILjava/lang/String;Lkaa;ILda;Z)V", line = 362)
    public static final void method4716(class514 arg0, int arg1, int arg2, class683 arg3, int arg4, int arg5, int arg6, String arg7, class49 arg8, int arg9, class64 arg10, boolean arg11) {
        try {
            ++field9279;
            int var12;
            if (~class401.field6334 != -5) {
                var12 = 16383 & (int) class29.field293 - -class126.field1819;
            } else {
                var12 = (int) class29.field293 & 16383;
            }
            int var13 = Math.max(arg3.field9797 / 2, arg3.field9777 / 2) + 10;
            int var14 = arg6 * arg6 + arg9 * arg9;
            if (var13 * var13 >= var14) {
                if (!arg11) {
                    int var15 = class763.field11199[var12];
                    int var16 = class763.field11200[var12];
                    if (class401.field6334 != 4) {
                        var16 = var16 * 256 / (class85.field1275 - -256);
                        var15 = var15 * 256 / (class85.field1275 + 256);
                    }
                    int var17 = arg6 * var15 + arg9 * var16 >> 14;
                    int var18 = arg6 * var16 + -(arg9 * var15) >> 14;
                    int var19 = arg8.method504(arg7, 100, -8055, (class107[]) null);
                    int var20 = var17 - var19 / 2;
                    int var21 = arg8.method505(arg7, -1, (class107[]) null, 100, 0);
                    if (var20 >= -arg3.field9797 && ~arg3.field9797 <= ~var20 && -arg3.field9777 <= var18 && ~var18 >= ~arg3.field9777) {
                        arg10.method681((byte) -126, arg0, 1, arg5, arg7, 50, var19, arg4, var20 - -(arg3.field9797 / 2) + arg5, (class107[]) null, arg1, 0, 0, (int[]) null, 0, arg3.field9777 / 2 + arg1 - arg2 + -var18 + -var21);
                    }
                }
            }
        } catch (RuntimeException var23) {
            throw class590.method4333(var23, field9285[0] + (arg0 != null ? field9285[2] : field9285[1]) + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field9285[2] : field9285[1]) + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + (arg7 != null ? field9285[2] : field9285[1]) + ',' + (arg8 != null ? field9285[2] : field9285[1]) + ',' + arg9 + ',' + (arg10 != null ? field9285[2] : field9285[1]) + ',' + arg11 + ')');
        }
    }

    @OriginalMember(owner = "client!mka", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4717(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 113);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!mka", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4718(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 83;
                    break;
                case 1:
                    var10005 = 68;
                    break;
                case 2:
                    var10005 = 56;
                    break;
                case 3:
                    var10005 = 88;
                    break;
                default:
                    var10005 = 113;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
