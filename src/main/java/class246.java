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

@OriginalClass("client!ua")
public class class246 extends class144 {

    @OriginalMember(owner = "client!ua", name = "I", descriptor = "I")
    private int field3571 = 1;

    @OriginalMember(owner = "client!ua", name = "R", descriptor = "I")
    private int field3579 = 1;

    @OriginalMember(owner = "client!ua", name = "L", descriptor = "I")
    private int field3573 = 204;

    @OriginalMember(owner = "client!ua", name = "M", descriptor = "[[S")
    public static short[][] field3574 = new short[][] { { 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898 }, { 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10347, 10582, 10429, 10407, 10359, 8414, 9540, 10456, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898 }, { 4300, 3294, 3303, 3264, 4506, 4382, 4387, 5293, 7622, 7384, 8412, 7496, 86, 123, 111, 99, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 13766, 13745, 13726, 13890, 13743, 13852, 17602, 18605, 21660, 24000, 24997, 24088, 27972, 25903, 26904, 27193, 27175, 27156, 30020, 28975, 29976, 12482, 13485, 10392, 10692, 10669, 10776, 6717, 6695, 7830, 6971, 6951, 5910, 3389, 3369, 3356, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898, 10, 30, 50, 70, 90, 110, 310, 684, 704, 556, 940, 960, 6454, 6952, 6972, 2358, 2732, 2752, 10550, 10924, 10944, 10310, 10556, 10576, 14646, 15020, 15040, 19766, 20140, 20160, -29386, -29012, -28992, 31030, 31276, 31296, -24266, -23892, -23872, -19146, -18772, -18752, -14026, -13652, -13632, -6858, -6484, -6464, 522, 542, 6794, 6814, 11018, 11038, 14986, 15006, 21130, 21150, -28918, -28898, -22006, -21986, -12918, -12898 } };

    @OriginalMember(owner = "client!ua", name = "J", descriptor = "I")
    public static int field3572 = 0;

    @OriginalMember(owner = "client!ua", name = "U", descriptor = "Ljava/lang/String;")
    public static String field3582 = "M";

    @OriginalMember(owner = "client!ua", name = "Q", descriptor = "Lc;")
    public static class284 field3578 = new class284(16);

    @OriginalMember(owner = "client!ua", name = "N", descriptor = "I")
    public static int field3575;

    @OriginalMember(owner = "client!ua", name = "O", descriptor = "I")
    public static int field3576;

    @OriginalMember(owner = "client!ua", name = "P", descriptor = "I")
    public static int field3577;

    @OriginalMember(owner = "client!ua", name = "T", descriptor = "I")
    public static int field3581;

    @OriginalMember(owner = "client!ua", name = "V", descriptor = "I")
    public static int field3583;

    @OriginalMember(owner = "client!ua", name = "W", descriptor = "I")
    public static int field3584;

    @OriginalMember(owner = "client!ua", name = "X", descriptor = "I")
    public static int field3585;

    @OriginalMember(owner = "client!ua", name = "S", descriptor = "Lwe;")
    public static class82 field3580;

    @OriginalMember(owner = "client!ua", name = "g", descriptor = "(I)V")
    public static void method1587(int arg0) {
        field3574 = null;
        field3578 = null;
        field3582 = null;
        if (arg0 != 522) {
            field3572 = 54;
        }
        field3580 = null;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(IILpj;)V")
    public static final void method1588(int arg0, int arg1, class98 arg2) {
        ++field3576;
        if (arg1 != -23326) {
            field3580 = null;
        }
        while (true) {
            class255 var3 = (class255) class270.field3946.method1532(-97);
            if (var3 == null) {
                return;
            }
            boolean var4 = false;
            for (int var5 = 0; var3.field3671 > var5; ++var5) {
                if (var3.field3673[var5] != null) {
                    if (var3.field3673[var5].field960 == 2) {
                        var3.field3670[var5] = -5;
                    }
                    if (~var3.field3673[var5].field960 == -1) {
                        var4 = true;
                    }
                }
                if (var3.field3677[var5] != null) {
                    if (var3.field3677[var5].field960 == 2) {
                        var3.field3670[var5] = -6;
                    }
                    if (var3.field3677[var5].field960 == 0) {
                        var4 = true;
                    }
                }
            }
            if (var4) {
                return;
            }
            arg2.method592(arg0, false);
            arg2.method1373(0, arg1 ^ 28093);
            int var6 = arg2.field3021;
            arg2.method1410(var3.field3676, (byte) -41);
            for (int var7 = 0; var3.field3671 > var7; ++var7) {
                if (~var3.field3670[var7] != -1) {
                    arg2.method1373(var3.field3670[var7], -13985);
                } else {
                    try {
                        int var8 = var3.field3678[var7];
                        if (~var8 == -1) {
                            Field var9 = (Field) var3.field3673[var7].field958;
                            int var10 = var9.getInt((Object) null);
                            arg2.method1373(0, -13985);
                            arg2.method1410(var10, (byte) 119);
                        } else if (~var8 == -2) {
                            Field var11 = (Field) var3.field3673[var7].field958;
                            var11.setInt((Object) null, var3.field3669[var7]);
                            arg2.method1373(0, -13985);
                        } else if (var8 == 2) {
                            Field var12 = (Field) var3.field3673[var7].field958;
                            int var13 = var12.getModifiers();
                            arg2.method1373(0, -13985);
                            arg2.method1410(var13, (byte) -127);
                        }
                        if (var8 != 3) {
                            if (~var8 == -5) {
                                Method var14 = (Method) var3.field3677[var7].field958;
                                int var15 = var14.getModifiers();
                                arg2.method1373(0, arg1 ^ 28093);
                                arg2.method1410(var15, (byte) 71);
                            }
                        } else {
                            byte[][] var16 = var3.field3675[var7];
                            Method var17 = (Method) var3.field3677[var7].field958;
                            Object[] var18 = new Object[var16.length];
                            for (int var19 = 0; ~var19 > ~var16.length; ++var19) {
                                ObjectInputStream var20 = new ObjectInputStream(new ByteArrayInputStream(var16[var19]));
                                var18[var19] = var20.readObject();
                            }
                            Object var21 = var17.invoke((Object) null, var18);
                            if (var21 == null) {
                                arg2.method1373(0, -13985);
                            } else if (var21 instanceof Number) {
                                arg2.method1373(1, -13985);
                                arg2.method1379(-80, ((Number) var21).longValue());
                            } else if (var21 instanceof String) {
                                arg2.method1373(2, -13985);
                                arg2.method1353((String) var21, (byte) -115);
                            } else {
                                arg2.method1373(4, arg1 ^ 28093);
                            }
                        }
                    } catch (ClassNotFoundException var22) {
                        arg2.method1373(-10, -13985);
                    } catch (InvalidClassException var23) {
                        arg2.method1373(-11, -13985);
                    } catch (StreamCorruptedException var24) {
                        arg2.method1373(-12, arg1 ^ 28093);
                    } catch (OptionalDataException var25) {
                        arg2.method1373(-13, arg1 ^ 28093);
                    } catch (IllegalAccessException var26) {
                        arg2.method1373(-14, -13985);
                    } catch (IllegalArgumentException var27) {
                        arg2.method1373(-15, -13985);
                    } catch (InvocationTargetException var28) {
                        arg2.method1373(-16, arg1 ^ 28093);
                    } catch (SecurityException var29) {
                        arg2.method1373(-17, -13985);
                    } catch (IOException var30) {
                        arg2.method1373(-18, arg1 + 9341);
                    } catch (NullPointerException var31) {
                        arg2.method1373(-19, arg1 + 9341);
                    } catch (Exception var32) {
                        arg2.method1373(-20, arg1 + 9341);
                    } catch (Throwable var33) {
                        arg2.method1373(-21, -13985);
                    }
                }
            }
            arg2.method1375(11618, var6);
            arg2.method1371(arg1 ^ 23364, arg2.field3021 - var6);
            var3.method1935(111);
        }
    }

    @OriginalMember(owner = "client!ua", name = "h", descriptor = "(I)V")
    public static final void method1589(int arg0) {
        ++field3584;
        if (class202.field2866 != -1 && class32.field381 != -1) {
            int var1 = ((-class5.field70 + class133.field1942) * class216.field3013 >> 16) + class5.field70;
            class216.field3013 += var1;
            if (arg0 != -2) {
                method1589(109);
            }
            float[] var2 = new float[3];
            if (class216.field3013 >= 65535) {
                class216.field3013 = 65535;
                if (!class27.field321) {
                    class30.field364 = true;
                } else {
                    class30.field364 = false;
                }
                class27.field321 = true;
            } else {
                class27.field321 = false;
                class30.field364 = false;
            }
            int var3 = class158.field2290 * 2;
            float var4 = (float) class216.field3013 / 65535.0F;
            for (int var5 = 0; ~var5 > -4; ++var5) {
                int var21 = class36.field419[class202.field2866][var3][var5] * 3;
                int var22 = class36.field419[class202.field2866][var3 + 1][var5] * 3;
                int var23 = class36.field419[class202.field2866][var3][var5];
                int var24 = (class36.field419[class202.field2866][var3 + 2][var5] + -class36.field419[class202.field2866][var3 - -3][var5] + class36.field419[class202.field2866][var3 + 2][var5]) * 3;
                int var25 = var22 - var21;
                int var26 = -var24 + var22 + -var23 + class36.field419[class202.field2866][var3 + 2][var5];
                int var27 = var21 + var24 + -(var22 * 2);
                var2[var5] = (((float) var26 * var4 + (float) var27) * var4 + (float) var25) * var4 + (float) var23;
            }
            class245.field3560 = (int) var2[0] + -(class110.field1473 * 128);
            float[] var6 = new float[3];
            class225.field3172 = (int) var2[1] * -1;
            class204.field2902 = (int) var2[2] + -(class166.field2383 * 128);
            int var7 = class79.field940 * 2;
            for (int var8 = 0; ~var8 > -4; ++var8) {
                int var14 = class36.field419[class32.field381][var7][var8] * 3;
                int var15 = class36.field419[class32.field381][var7 + 1][var8] * 3;
                int var16 = class36.field419[class32.field381][var7][var8];
                int var17 = (class36.field419[class32.field381][var7 - -2][var8] - (class36.field419[class32.field381][var7 + 3][var8] + -class36.field419[class32.field381][var7 + 2][var8])) * 3;
                int var18 = -var14 + var15;
                int var19 = -(var15 * 2) + var14 + var17;
                int var20 = class36.field419[class32.field381][var7 - -2][var8] + -var16 + var15 - var17;
                var6[var8] = (((float) var20 * var4 + (float) var19) * var4 + (float) var18) * var4 + (float) var16;
            }
            float var9 = var6[0] + -var2[0];
            float var10 = (var6[1] - var2[1]) * -1.0F;
            float var11 = var6[2] + -var2[2];
            double var12 = Math.sqrt((double) (var9 * var9 + var11 * var11));
            class80.field954 = (float) Math.atan2((double) var10, var12);
            class251.field3625 = -((float) Math.atan2((double) var9, (double) var11));
            class280.field4246 = 2047 & (int) ((double) class80.field954 * 325.949D);
            class138.field2010 = (int) ((double) class251.field3625 * 325.949D) & 2047;
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(IIIIZII)V")
    public static final void method1590(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6) {
        if (!arg4) {
            method1589(117);
        }
        if (class177.field2514 <= -arg0 + arg2 && ~class279.field4238 <= ~(arg0 + arg2) && ~class286.field4431 >= ~(arg3 - arg0) && class230.field3302 >= arg0 + arg3) {
            class49.method301(arg1, arg5, arg0, arg2, arg6, -26845, arg3);
        } else {
            class167.method1098(arg1, arg6, (byte) 26, arg2, arg0, arg3, arg5);
        }
        ++field3581;
    }

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "(II)[I")
    public final int[] method12(int arg0, int arg1) {
        if (arg1 != 255) {
            return null;
        } else {
            ++field3585;
            int[] var3 = super.field2069.method425(true, arg0);
            if (super.field2069.field820) {
                for (int var4 = 0; ~class104.field1411 < ~var4; ++var4) {
                    int var5 = class143.field2045[arg0];
                    int var6 = class87.field1178[var4];
                    int var7 = var6 % (4096 / this.field3579) * this.field3579;
                    int var8 = this.field3571 * var5 >> 12;
                    int var9 = var5 % (4096 / this.field3571) * this.field3571;
                    int var10 = this.field3579 * var6 >> 12;
                    if (var9 < this.field3573) {
                        for (var10 -= var8; var10 < 0; var10 += 4) {
                        }
                        while (var10 > 3) {
                            var10 -= 4;
                        }
                        if (var10 != 1) {
                            var3[var4] = 0;
                            continue;
                        }
                        if (~var7 > ~this.field3573) {
                            var3[var4] = 0;
                            continue;
                        }
                    }
                    if (~var7 > ~this.field3573) {
                        int var11;
                        for (var11 = var10 - var8; var11 < 0; var11 += 4) {
                        }
                        while (var11 > 3) {
                            var11 -= 4;
                        }
                        if (var11 > 0) {
                            var3[var4] = 0;
                            continue;
                        }
                    }
                    var3[var4] = 4096;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!ua", name = "<init>", descriptor = "()V")
    public class246() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(ILqi;I)V")
    public final void method9(int arg0, class216 arg1, int arg2) {
        if (~arg0 != -1) {
            if (arg0 != 1) {
                if (~arg0 == -3) {
                    this.field3573 = arg1.method1380(true);
                }
            } else {
                this.field3571 = arg1.method1407(111);
            }
        } else {
            this.field3579 = arg1.method1407(126);
        }
        if (arg2 != 20630) {
            field3578 = null;
        }
        ++field3577;
    }
}
