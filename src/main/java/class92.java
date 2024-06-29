import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.OptionalDataException;
import java.io.StreamCorruptedException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ti")
public class class92 {

    @OriginalMember(owner = "client!ti", name = "t", descriptor = "I")
    private int field1455;

    @OriginalMember(owner = "client!ti", name = "o", descriptor = "[[I")
    private int[][] field1450;

    @OriginalMember(owner = "client!ti", name = "q", descriptor = "I")
    private int field1452;

    @OriginalMember(owner = "client!ti", name = "b", descriptor = "Lqe;")
    private static class168 field1437 = class66.method448("Your friend list is full)3 Max of 100 for free users)1 and 200 for members)3", -121);

    @OriginalMember(owner = "client!ti", name = "j", descriptor = "Lqe;")
    public static class168 field1445 = field1437;

    @OriginalMember(owner = "client!ti", name = "i", descriptor = "Lqe;")
    public static class168 field1444 = class66.method448(")1 ", 46);

    @OriginalMember(owner = "client!ti", name = "n", descriptor = "Lqe;")
    public static class168 field1449 = class66.method448("sl_arrows", 82);

    @OriginalMember(owner = "client!ti", name = "r", descriptor = "Lqe;")
    public static class168 field1453 = class66.method448("labels)3dat", 24);

    @OriginalMember(owner = "client!ti", name = "p", descriptor = "Lqe;")
    public static class168 field1451 = class66.method448(")1", 77);

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "Lqe;")
    public static class168 field1436 = class66.method448("rect_debug=", -115);

    @OriginalMember(owner = "client!ti", name = "f", descriptor = "[I")
    public static int[] field1441 = new int[2000];

    @OriginalMember(owner = "client!ti", name = "h", descriptor = "Ljava/util/Calendar;")
    public static Calendar field1443 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

    @OriginalMember(owner = "client!ti", name = "u", descriptor = "Z")
    public static boolean field1456 = false;

    @OriginalMember(owner = "client!ti", name = "x", descriptor = "I")
    public static int field1459 = 0;

    @OriginalMember(owner = "client!ti", name = "c", descriptor = "I")
    public static int field1438;

    @OriginalMember(owner = "client!ti", name = "d", descriptor = "I")
    public static int field1439;

    @OriginalMember(owner = "client!ti", name = "g", descriptor = "I")
    public static int field1442;

    @OriginalMember(owner = "client!ti", name = "k", descriptor = "I")
    public static int field1446;

    @OriginalMember(owner = "client!ti", name = "l", descriptor = "I")
    public static int field1447;

    @OriginalMember(owner = "client!ti", name = "s", descriptor = "I")
    public static int field1454;

    @OriginalMember(owner = "client!ti", name = "w", descriptor = "I")
    public static int field1458;

    @OriginalMember(owner = "client!ti", name = "v", descriptor = "[I")
    public static int[] field1457;

    @OriginalMember(owner = "client!ti", name = "e", descriptor = "[Luj;")
    public static class158[] field1440;

    @OriginalMember(owner = "client!ti", name = "m", descriptor = "[[[Ldf;")
    public static class177[][][] field1448;

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(BI)I")
    public final int method608(byte arg0, int arg1) {
        if (this.field1450 != null) {
            arg1 = (int) ((long) this.field1455 * (long) arg1 / (long) this.field1452) + 6;
        }
        field1446++;
        return arg0 == -47 ? arg1 : 71;
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(Z)V")
    public static final void method609(boolean arg0) {
        if (!arg0) {
            field1440 = null;
        }
        for (int var1 = 0; var1 < 5; var1++) {
            class138.field2432[var1] = false;
        }
        class31.field379 = 1;
        class168.field2879 = -1;
        class62.field856 = -1;
        field1454++;
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(Loe;I)V")
    public static final void method610(class256 arg0, int arg1) {
        field1447++;
        class177.field3118 = class89.method591(class96.field1518, arg0, (byte) 103);
        class29.field358 = new int[arg1];
        for (int var2 = 0; var2 < 3; var2++) {
            float var4 = (float) (class64.field879[var2] >> 16 & 0xFF);
            float var5 = (float) (class64.field879[var2] >> 8 & 0xFF);
            int var6 = class64.field879[var2 + 1] >> 8 & 0xFF;
            int var7 = class64.field879[var2 + 1] >> 16 & 0xFF;
            float var8 = ((float) var6 - var5) / 64.0F;
            int var9 = class64.field879[var2 + 1] & 0xFF;
            float var10 = (float) (class64.field879[var2] & 0xFF);
            float var11 = ((float) var7 - var4) / 64.0F;
            float var12 = ((float) var9 - var10) / 64.0F;
            for (int var13 = 0; var13 < 64; var13++) {
                class29.field358[var2 * 64 + var13] = class102.method675(class102.method675((int) var5 << 8, (int) var4 << 16), (int) var10);
                var4 += var11;
                var5 += var8;
                var10 += var12;
            }
        }
        for (int var3 = 192; var3 < 255; var3++) {
            class29.field358[var3] = class64.field879[3];
        }
        class245.field4255 = new int[32768];
        class233.field3963 = new int[32768];
        class14.method52(null, 127);
        class197.field3415 = new int[32768];
        class212.field3667 = new int[32768];
        class179.field3158 = new class15(128, 254);
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(I)V")
    public static void method611(int arg0) {
        if (arg0 != 1) {
            method610(null, -16);
        }
        field1453 = null;
        field1448 = null;
        field1440 = null;
        field1449 = null;
        field1445 = null;
        field1436 = null;
        field1451 = null;
        field1444 = null;
        field1437 = null;
        field1441 = null;
        field1443 = null;
        field1457 = null;
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(IILl;)V")
    public static final void method612(int arg0, int arg1, class101 arg2) {
        field1439++;
        if (arg1 != -7) {
            method612(-108, 50, null);
        }
        while (true) {
            class143 var3 = (class143) class74.field1124.method315(arg1 - 31587);
            if (var3 == null) {
                return;
            }
            boolean var4 = false;
            for (int var5 = 0; var5 < var3.field2511; var5++) {
                if (var3.field2523[var5] != null) {
                    if (var3.field2523[var5].field57 == 2) {
                        var3.field2519[var5] = -5;
                    }
                    if (var3.field2523[var5].field57 == 0) {
                        var4 = true;
                    }
                }
                if (var3.field2507[var5] != null) {
                    if (var3.field2507[var5].field57 == 2) {
                        var3.field2519[var5] = -6;
                    }
                    if (var3.field2507[var5].field57 == 0) {
                        var4 = true;
                    }
                }
            }
            if (var4) {
                return;
            }
            arg2.method672(arg0, 238);
            arg2.method768(0, 7295);
            int var6 = arg2.field1821;
            arg2.method770(var3.field2510, (byte) -10);
            for (int var7 = 0; var7 < var3.field2511; var7++) {
                if (var3.field2519[var7] == 0) {
                    try {
                        int var8 = var3.field2508[var7];
                        if (var8 == 0) {
                            Field var9 = (Field) var3.field2523[var7].field59;
                            int var10 = var9.getInt(null);
                            arg2.method768(0, arg1 ^ 0xFFFFE386);
                            arg2.method770(var10, (byte) -10);
                        } else if (var8 == 1) {
                            Field var11 = (Field) var3.field2523[var7].field59;
                            var11.setInt(null, var3.field2518[var7]);
                            arg2.method768(0, 7295);
                        } else if (var8 == 2) {
                            Field var12 = (Field) var3.field2523[var7].field59;
                            int var13 = var12.getModifiers();
                            arg2.method768(0, 7295);
                            arg2.method770(var13, (byte) -10);
                        }
                        if (var8 == 3) {
                            Method var14 = (Method) var3.field2507[var7].field59;
                            byte[][] var15 = var3.field2512[var7];
                            Object[] var16 = new Object[var15.length];
                            for (int var17 = 0; var17 < var15.length; var17++) {
                                ObjectInputStream var18 = new ObjectInputStream(new ByteArrayInputStream(var15[var17]));
                                var16[var17] = var18.readObject();
                            }
                            Object var19 = var14.invoke(null, var16);
                            if (var19 == null) {
                                arg2.method768(0, 7295);
                            } else if (var19 instanceof Number) {
                                arg2.method768(1, 7295);
                                arg2.method739(((Number) var19).longValue(), -23147);
                            } else if (var19 instanceof class168) {
                                arg2.method768(2, 7295);
                                arg2.method721((class168) var19, true);
                            } else {
                                arg2.method768(4, arg1 + 7302);
                            }
                        } else if (var8 == 4) {
                            Method var20 = (Method) var3.field2507[var7].field59;
                            int var21 = var20.getModifiers();
                            arg2.method768(0, arg1 ^ 0xFFFFE386);
                            arg2.method770(var21, (byte) -10);
                        }
                    } catch (ClassNotFoundException var22) {
                        arg2.method768(-10, 7295);
                    } catch (InvalidClassException var23) {
                        arg2.method768(-11, 7295);
                    } catch (StreamCorruptedException var24) {
                        arg2.method768(-12, 7295);
                    } catch (OptionalDataException var25) {
                        arg2.method768(-13, 7295);
                    } catch (IllegalAccessException var26) {
                        arg2.method768(-14, 7295);
                    } catch (IllegalArgumentException var27) {
                        arg2.method768(-15, arg1 ^ -7290);
                    } catch (InvocationTargetException var28) {
                        arg2.method768(-16, 7295);
                    } catch (SecurityException var29) {
                        arg2.method768(-17, arg1 + 7302);
                    } catch (IOException var30) {
                        arg2.method768(-18, 7295);
                    } catch (NullPointerException var31) {
                        arg2.method768(-19, 7295);
                    } catch (Exception var32) {
                        arg2.method768(-20, 7295);
                    } catch (Throwable var33) {
                        arg2.method768(-21, 7295);
                    }
                } else {
                    arg2.method768(var3.field2519[var7], arg1 + 7302);
                }
            }
            arg2.method777(var6, (byte) -60);
            arg2.method729(arg2.field1821 - var6, -109);
            var3.method1234(17216);
        }
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(II)I")
    public final int method613(int arg0, int arg1) {
        if (arg0 <= 87) {
            return -94;
        }
        field1438++;
        if (this.field1450 != null) {
            arg1 = (int) ((long) this.field1455 * (long) arg1 / (long) this.field1452);
        }
        return arg1;
    }

    @OriginalMember(owner = "client!ti", name = "<init>", descriptor = "(II)V")
    public class92(int arg0, int arg1) {
        if (arg0 != arg1) {
            int var3 = class245.method1611((byte) -47, arg1, arg0);
            int var4 = arg1 / var3;
            this.field1455 = var4;
            int var5 = arg0 / var3;
            this.field1450 = new int[var5][14];
            this.field1452 = var5;
            for (int var6 = 0; var6 < var5; var6++) {
                int[] var7 = this.field1450[var6];
                double var8 = (double) var6 / (double) var5 + 6.0D;
                int var10 = (int) Math.floor(var8 + 1.0D - 7.0D);
                double var11 = (double) var4 / (double) var5;
                if (var10 < 0) {
                    var10 = 0;
                }
                int var13 = (int) Math.ceil(var8 + 7.0D);
                if (var13 > 14) {
                    var13 = 14;
                }
                while (var10 < var13) {
                    double var14 = ((double) var10 - var8) * 3.141592653589793D;
                    double var16 = var11;
                    if (var14 < -1.0E-4D || var14 > 1.0E-4D) {
                        var16 = var11 * (Math.sin(var14) / var14);
                    }
                    double var18 = var16 * (Math.cos(((double) var10 - var8) * 0.2243994752564138D) * 0.46D + 0.54D);
                    var7[var10] = (int) Math.floor(var18 * 65536.0D + 0.5D);
                    var10++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "([BI)[B")
    public final byte[] method614(byte[] arg0, int arg1) {
        if (arg1 < 50) {
            field1457 = null;
        }
        field1442++;
        if (this.field1450 != null) {
            int var3 = 0;
            int var4 = 0;
            int var5 = (int) ((long) arg0.length * (long) this.field1455 / (long) this.field1452) + 14;
            int[] var6 = new int[var5];
            for (int var7 = 0; var7 < arg0.length; var7++) {
                byte var10 = arg0[var7];
                int[] var11 = this.field1450[var4];
                for (int var12 = 0; var12 < 14; var12++) {
                    var6[var3 + var12] += var11[var12] * var10;
                }
                int var13 = this.field1455 + var4;
                int var14 = var13 / this.field1452;
                var4 = var13 - this.field1452 * var14;
                var3 += var14;
            }
            arg0 = new byte[var5];
            for (int var8 = 0; var8 < var5; var8++) {
                int var9 = var6[var8] + 32768 >> 16;
                if (var9 < -128) {
                    arg0[var8] = -128;
                } else if (var9 > 127) {
                    arg0[var8] = 127;
                } else {
                    arg0[var8] = (byte) var9;
                }
            }
        }
        return arg0;
    }
}
