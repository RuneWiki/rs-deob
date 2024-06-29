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

@OriginalClass("client!us")
public class class233 extends class478 {

    @OriginalMember(owner = "client!us", name = "R", descriptor = "I")
    private int field3290 = -1;

    @OriginalMember(owner = "client!us", name = "I", descriptor = "I")
    private int field3282 = 0;

    @OriginalMember(owner = "client!us", name = "db", descriptor = "I")
    private int field3302 = 0;

    @OriginalMember(owner = "client!us", name = "gb", descriptor = "Z")
    public boolean field3305 = false;

    @OriginalMember(owner = "client!us", name = "Z", descriptor = "I")
    private int field3298 = -32768;

    @OriginalMember(owner = "client!us", name = "fb", descriptor = "I")
    public int field3304;

    @OriginalMember(owner = "client!us", name = "ab", descriptor = "I")
    private int field3299;

    @OriginalMember(owner = "client!us", name = "Q", descriptor = "Lqg;")
    private class372 field3289;

    @OriginalMember(owner = "client!us", name = "M", descriptor = "[I")
    public static int[] field3285 = new int[50];

    @OriginalMember(owner = "client!us", name = "H", descriptor = "[S")
    public static short[] field3281 = new short[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

    @OriginalMember(owner = "client!us", name = "K", descriptor = "[I")
    public static int[] field3284 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client!us", name = "P", descriptor = "Lsq;")
    public static class454 field3288 = new class454(512);

    @OriginalMember(owner = "client!us", name = "F", descriptor = "I")
    public static int field3279;

    @OriginalMember(owner = "client!us", name = "G", descriptor = "I")
    public static int field3280;

    @OriginalMember(owner = "client!us", name = "J", descriptor = "I")
    public static int field3283;

    @OriginalMember(owner = "client!us", name = "N", descriptor = "I")
    public static int field3286;

    @OriginalMember(owner = "client!us", name = "O", descriptor = "I")
    public static int field3287;

    @OriginalMember(owner = "client!us", name = "S", descriptor = "I")
    public static int field3291;

    @OriginalMember(owner = "client!us", name = "T", descriptor = "I")
    public static int field3292;

    @OriginalMember(owner = "client!us", name = "V", descriptor = "I")
    public static int field3294;

    @OriginalMember(owner = "client!us", name = "W", descriptor = "I")
    public static int field3295;

    @OriginalMember(owner = "client!us", name = "X", descriptor = "I")
    public static int field3296;

    @OriginalMember(owner = "client!us", name = "Y", descriptor = "I")
    public static int field3297;

    @OriginalMember(owner = "client!us", name = "bb", descriptor = "I")
    public static int field3300;

    @OriginalMember(owner = "client!us", name = "cb", descriptor = "I")
    public static int field3301;

    @OriginalMember(owner = "client!us", name = "eb", descriptor = "I")
    public static int field3303;

    @OriginalMember(owner = "client!us", name = "hb", descriptor = "I")
    public static int field3306;

    @OriginalMember(owner = "client!us", name = "jb", descriptor = "I")
    public static int field3308;

    @OriginalMember(owner = "client!us", name = "ib", descriptor = "Lms;")
    public static class363 field3307;

    @OriginalMember(owner = "client!us", name = "U", descriptor = "Lm;")
    private class83 field3293;

    @OriginalMember(owner = "client!us", name = "finalize", descriptor = "()V", line = 3)
    protected final void finalize() {
        if (this.field3293 != null) {
            this.field3293.method573();
        }
        ++field3291;
    }

    @OriginalMember(owner = "client!us", name = "c", descriptor = "(Lkm;I)V", line = 19)
    public final void method197(class487 arg0, int arg1) {
        ++field3294;
        class232 var3 = this.method1471(arg0, 0, -28487);
        if (var3 != null) {
            this.method1467(7051, var3, arg0);
        }
        int var4 = 120 / ((64 - arg1) / 59);
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(B)V", line = 33)
    public final void method202(byte arg0) {
        if (arg0 < 42) {
            field3307 = null;
        }
        ++field3301;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(Lpf;II)V", line = 45)
    public static final void method1464(class133 arg0, int arg1, int arg2) {
        if (arg1 <= 18) {
            method1466((byte) -11);
        }
        ++field3279;
        while (true) {
            class325 var3 = (class325) class290.field3988.method1544(-119);
            if (var3 == null) {
                return;
            }
            boolean var4 = false;
            for (int var5 = 0; ~var5 > ~var3.field4474; ++var5) {
                if (var3.field4471[var5] != null) {
                    if (var3.field4471[var5].field5789 == 2) {
                        var3.field4479[var5] = -5;
                    }
                    if (~var3.field4471[var5].field5789 == -1) {
                        var4 = true;
                    }
                }
                if (var3.field4463[var5] != null) {
                    if (var3.field4463[var5].field5789 == 2) {
                        var3.field4479[var5] = -6;
                    }
                    if (var3.field4463[var5].field5789 == 0) {
                        var4 = true;
                    }
                }
            }
            if (var4) {
                return;
            }
            arg0.method797(arg2, (byte) 111);
            arg0.method2470((byte) -74, 0);
            int var6 = arg0.field5830;
            arg0.method2481(var3.field4467, true);
            for (int var7 = 0; ~var7 > ~var3.field4474; ++var7) {
                if (~var3.field4479[var7] != -1) {
                    arg0.method2470((byte) -74, var3.field4479[var7]);
                } else {
                    try {
                        int var8 = var3.field4475[var7];
                        if (~var8 == -1) {
                            Field var9 = (Field) var3.field4471[var7].field5791;
                            int var10 = var9.getInt((Object) null);
                            arg0.method2470((byte) -74, 0);
                            arg0.method2481(var10, true);
                        } else if (var8 != 1) {
                            if (~var8 == -3) {
                                Field var11 = (Field) var3.field4471[var7].field5791;
                                int var12 = var11.getModifiers();
                                arg0.method2470((byte) -74, 0);
                                arg0.method2481(var12, true);
                            }
                        } else {
                            Field var13 = (Field) var3.field4471[var7].field5791;
                            var13.setInt((Object) null, var3.field4466[var7]);
                            arg0.method2470((byte) -74, 0);
                        }
                        if (~var8 != -4) {
                            if (var8 == 4) {
                                Method var14 = (Method) var3.field4463[var7].field5791;
                                int var15 = var14.getModifiers();
                                arg0.method2470((byte) -74, 0);
                                arg0.method2481(var15, true);
                            }
                        } else {
                            Method var16 = (Method) var3.field4463[var7].field5791;
                            byte[][] var17 = var3.field4465[var7];
                            Object[] var18 = new Object[var17.length];
                            for (int var19 = 0; ~var17.length < ~var19; ++var19) {
                                ObjectInputStream var20 = new ObjectInputStream(new ByteArrayInputStream(var17[var19]));
                                var18[var19] = var20.readObject();
                            }
                            Object var21 = var16.invoke((Object) null, var18);
                            if (var21 == null) {
                                arg0.method2470((byte) -74, 0);
                            } else if (!(var21 instanceof Number)) {
                                if (var21 instanceof String) {
                                    arg0.method2470((byte) -74, 2);
                                    arg0.method2493((byte) 124, (String) var21);
                                } else {
                                    arg0.method2470((byte) -74, 4);
                                }
                            } else {
                                arg0.method2470((byte) -74, 1);
                                arg0.method2471(26505, ((Number) var21).longValue());
                            }
                        }
                    } catch (ClassNotFoundException var22) {
                        arg0.method2470((byte) -74, -10);
                    } catch (InvalidClassException var23) {
                        arg0.method2470((byte) -74, -11);
                    } catch (StreamCorruptedException var24) {
                        arg0.method2470((byte) -74, -12);
                    } catch (OptionalDataException var25) {
                        arg0.method2470((byte) -74, -13);
                    } catch (IllegalAccessException var26) {
                        arg0.method2470((byte) -74, -14);
                    } catch (IllegalArgumentException var27) {
                        arg0.method2470((byte) -74, -15);
                    } catch (InvocationTargetException var28) {
                        arg0.method2470((byte) -74, -16);
                    } catch (SecurityException var29) {
                        arg0.method2470((byte) -74, -17);
                    } catch (IOException var30) {
                        arg0.method2470((byte) -74, -18);
                    } catch (NullPointerException var31) {
                        arg0.method2470((byte) -74, -19);
                    } catch (Exception var32) {
                        arg0.method2470((byte) -74, -20);
                    } catch (Throwable var33) {
                        arg0.method2470((byte) -74, -21);
                    }
                }
            }
            arg0.method2505((byte) 90, var6);
            arg0.method2504(-var6 + arg0.field5830, 1);
            var3.method1182(28818);
        }
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(Lkm;BII)Z", line = 236)
    public final boolean method199(class487 arg0, byte arg1, int arg2, int arg3) {
        if (arg1 <= 123) {
            field3288 = null;
        }
        ++field3287;
        return false;
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(I)V", line = 247)
    public final void method1465(int arg0) {
        if (arg0 < 29) {
            this.method1471((class487) null, -104, 17);
        }
        ++field3306;
        if (this.field3293 != null) {
            this.field3293.method573();
        }
    }

    @OriginalMember(owner = "client!us", name = "<init>", descriptor = "(IIIIIIIIIII)V", line = 360)
    public class233(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        super(arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, false, (byte) 0);
        this.field3304 = arg1 + arg2;
        this.field3299 = arg0;
        int var12 = class163.field2348.method548(this.field3299, (byte) 74).field4391;
        if (var12 != -1) {
            this.field3305 = false;
            this.field3289 = class31.field505.method950(true, var12);
        } else {
            this.field3305 = true;
        }
        if (this.field3304 == arg2) {
            class272.method1706(super.field6766, this.field3289, false, (byte) 31, super.field6765, super.field6746, this.field3302);
        }
    }

    @OriginalMember(owner = "client!us", name = "e", descriptor = "(I)Z", line = 273)
    public final boolean method195(int arg0) {
        if (arg0 < 91) {
            return false;
        } else {
            ++field3303;
            return false;
        }
    }

    @OriginalMember(owner = "client!us", name = "d", descriptor = "(B)V", line = 287)
    public static void method1466(byte arg0) {
        field3284 = null;
        field3281 = null;
        int var1 = 41 / ((88 - arg0) / 38);
        field3288 = null;
        field3285 = null;
        field3307 = null;
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(ILab;Lkm;)V", line = 304)
    private final void method1467(int arg0, class232 arg1, class487 arg2) {
        ++field3300;
        class356[] var4 = arg1.method40();
        class309[] var5 = arg1.method25();
        if (arg0 != 7051) {
            method1466((byte) -32);
        }
        if ((this.field3293 == null || this.field3293.field1241) && (var4 != null || var5 != null)) {
            this.field3293 = new class83(class356.field4972);
        }
        if (this.field3293 != null) {
            this.field3293.method576(arg2, (long) class356.field4972, var4, var5, false);
            this.field3293.method572(super.field6766, super.field6753, super.field6751, super.field6747, super.field6749);
        }
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(IZ)V", line = 330)
    public final void method1468(int arg0, boolean arg1) {
        ++field3297;
        if (!this.field3305) {
            if (arg1) {
                method1470(-99);
            }
            this.field3282 += arg0;
            while (~this.field3282 < ~this.field3289.field5283[this.field3302]) {
                this.field3282 -= this.field3289.field5283[this.field3302];
                ++this.field3302;
                if (this.field3302 >= this.field3289.field5278.length) {
                    this.field3305 = true;
                    break;
                }
            }
            if (!this.field3305) {
                class272.method1706(super.field6766, this.field3289, false, (byte) 31, super.field6765, super.field6746, this.field3302);
            }
        }
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(ILkm;IZILkj;B)V", line = 384)
    public final void method198(int arg0, class487 arg1, int arg2, boolean arg3, int arg4, class280 arg5, byte arg6) {
        if (arg6 != 59) {
            this.method1468(61, false);
        }
        ++field3295;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(IILjava/lang/String;II)V", line = 395)
    public static final void method1469(int arg0, int arg1, String arg2, int arg3, int arg4) {
        ++field3283;
        class363 var5 = class485.method2840(arg1, arg3, (byte) 21);
        if (var5 != null) {
            if (var5.field5197 != null) {
                class32 var6 = new class32();
                var6.field508 = arg2;
                var6.field518 = var5.field5197;
                var6.field517 = var5;
                var6.field519 = arg0;
                class212.method1331(var6);
            }
            if (arg4 == 26233) {
                boolean var7 = true;
                if (var5.field5080 != 0) {
                    var7 = class198.method1261(var5, -1);
                }
                if (var7) {
                    if (client.method2321(var5).method470(arg0 + -1, 3021)) {
                        if (~arg0 == -2) {
                            ++class6.field117;
                            class131.method793(class372.field5257, -89);
                            class87.method605(arg1, arg3, var5.field5195, -18066);
                        }
                        if (arg0 == 2) {
                            class131.method793(class162.field2321, -56);
                            ++class222.field3124;
                            class87.method605(arg1, arg3, var5.field5195, arg4 + -44299);
                        }
                        if (~arg0 == -4) {
                            class131.method793(class64.field974, 92);
                            ++class210.field2961;
                            class87.method605(arg1, arg3, var5.field5195, -18066);
                        }
                        if (arg0 == 4) {
                            class131.method793(class421.field5797, 62);
                            ++class19.field306;
                            class87.method605(arg1, arg3, var5.field5195, -18066);
                        }
                        if (arg0 == 5) {
                            class131.method793(class196.field2800, arg4 ^ -26185);
                            ++class455.field6283;
                            class87.method605(arg1, arg3, var5.field5195, -18066);
                        }
                        if (arg0 == 6) {
                            ++class372.field5274;
                            class131.method793(class161.field2308, arg4 ^ -26129);
                            class87.method605(arg1, arg3, var5.field5195, arg4 ^ -8425);
                        }
                        if (arg0 == 7) {
                            class131.method793(class82.field1235, -58);
                            ++class79.field1192;
                            class87.method605(arg1, arg3, var5.field5195, -18066);
                        }
                        if (arg0 == 8) {
                            ++class159.field2288;
                            class131.method793(class152.field2181, -31);
                            class87.method605(arg1, arg3, var5.field5195, arg4 + -44299);
                        }
                        if (arg0 == 9) {
                            class131.method793(class454.field6265, -80);
                            ++class205.field2937;
                            class87.method605(arg1, arg3, var5.field5195, -18066);
                        }
                        if (~arg0 == -11) {
                            ++class216.field3061;
                            class131.method793(class277.field3840, -51);
                            class87.method605(arg1, arg3, var5.field5195, -18066);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!us", name = "b", descriptor = "(I)V", line = 516)
    public static final void method1470(int arg0) {
        class131.method793(class355.field4950, 116);
        ++field3286;
        ++class106.field1523;
        class366.field5214.method2470((byte) -74, class18.method156((byte) -114));
        if (arg0 != 1) {
            field3288 = null;
        }
        class366.field5214.method2462(class67.field987, (byte) -123);
        class366.field5214.method2462(class371.field5248, (byte) -123);
        class366.field5214.method2470((byte) -74, class211.field2977);
    }

    @OriginalMember(owner = "client!us", name = "c", descriptor = "(B)I", line = 539)
    public final int method205(byte arg0) {
        ++field3292;
        return arg0 != 114 ? -2 : this.field3298;
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(Lkm;II)Lab;", line = 550)
    private final class232 method1471(class487 arg0, int arg1, int arg2) {
        if (arg2 != -28487) {
            return null;
        } else {
            ++field3280;
            class321 var4 = class163.field2348.method548(this.field3299, (byte) 94);
            return !this.field3305 ? var4.method1931(false, class31.field505, arg0, arg1, this.field3302, this.field3290, this.field3282) : var4.method1931(false, class31.field505, arg0, arg1, -1, -1, 0);
        }
    }

    @OriginalMember(owner = "client!us", name = "d", descriptor = "(Lkm;I)Lto;", line = 566)
    public final class370 method193(class487 arg0, int arg1) {
        ++field3296;
        class232 var3 = this.method1471(arg0, 1024, -28487);
        if (var3 == null) {
            return null;
        } else {
            if (arg1 >= -6) {
                field3284 = null;
            }
            class250 var4 = arg0.method1105();
            var4.method1382(super.field6765, super.field6755, super.field6746);
            if (this.field3293 == null) {
                var3.method41(var4, (class219) null, 0);
            } else {
                class473 var5 = this.field3293.method567();
                arg0.method1063(var3, var5, var4, (class219) null, 0);
            }
            this.field3298 = var3.method55();
            this.method1467(7051, var3, arg0);
            return null;
        }
    }
}
