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

@OriginalClass("client!ur")
public class class291 {

    @OriginalMember(owner = "client!ur", name = "c", descriptor = "I")
    public int field3927 = -1;

    @OriginalMember(owner = "client!ur", name = "k", descriptor = "Z")
    public static boolean field3935 = false;

    @OriginalMember(owner = "client!ur", name = "e", descriptor = "Lhi;")
    public static class45 field3929 = new class45(61, -1);

    @OriginalMember(owner = "client!ur", name = "v", descriptor = "[Ljava/lang/String;")
    public static String[] field3946 = new String[] { "en", "de", "fr", "pt", "nl" };

    @OriginalMember(owner = "client!ur", name = "x", descriptor = "I")
    public static int field3948 = 0;

    @OriginalMember(owner = "client!ur", name = "z", descriptor = "I")
    public static int field3950 = 0;

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "I")
    public static int field3925;

    @OriginalMember(owner = "client!ur", name = "b", descriptor = "I")
    public static int field3926;

    @OriginalMember(owner = "client!ur", name = "d", descriptor = "I")
    public static int field3928;

    @OriginalMember(owner = "client!ur", name = "f", descriptor = "I")
    public static int field3930;

    @OriginalMember(owner = "client!ur", name = "h", descriptor = "I")
    private int field3932;

    @OriginalMember(owner = "client!ur", name = "j", descriptor = "I")
    public static int field3934;

    @OriginalMember(owner = "client!ur", name = "l", descriptor = "I")
    public static int field3936;

    @OriginalMember(owner = "client!ur", name = "m", descriptor = "I")
    public static int field3937;

    @OriginalMember(owner = "client!ur", name = "n", descriptor = "I")
    public static int field3938;

    @OriginalMember(owner = "client!ur", name = "o", descriptor = "I")
    public static int field3939;

    @OriginalMember(owner = "client!ur", name = "q", descriptor = "I")
    public static int field3941;

    @OriginalMember(owner = "client!ur", name = "r", descriptor = "I")
    public static int field3942;

    @OriginalMember(owner = "client!ur", name = "w", descriptor = "I")
    public static int field3947;

    @OriginalMember(owner = "client!ur", name = "g", descriptor = "J")
    private long field3931;

    @OriginalMember(owner = "client!ur", name = "u", descriptor = "J")
    private long field3945;

    @OriginalMember(owner = "client!ur", name = "i", descriptor = "Z")
    public boolean field3933;

    @OriginalMember(owner = "client!ur", name = "s", descriptor = "[I")
    public int[] field3943;

    @OriginalMember(owner = "client!ur", name = "t", descriptor = "[I")
    private int[] field3944;

    @OriginalMember(owner = "client!ur", name = "y", descriptor = "[Lo;")
    public static class359[] field3949;

    @OriginalMember(owner = "client!ur", name = "p", descriptor = "[[I")
    private int[][] field3940;

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(I)V", line = 6)
    public static void method1679(int arg0) {
        field3949 = null;
        int var1 = -56 / ((-arg0 - 19) / 43);
        field3929 = null;
        field3946 = null;
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(ZI)I", line = 17)
    public static final int method1680(boolean arg0, int arg1) {
        field3942++;
        int var2 = (arg1 * arg1 >> 12) * arg1 >> 12;
        if (arg0) {
            int var3 = arg1 * 6 - 61440;
            int var4 = (arg1 * var3 >> 12) + 40960;
            return var2 * var4 >> 12;
        } else {
            return -128;
        }
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(ILjp;Lcw;BLec;Lza;Lwc;Lmt;IIILwn;)Le;", line = 35)
    public final class285 method1681(int arg0, class55 arg1, class390 arg2, byte arg3, class109 arg4, class295 arg5, class372 arg6, class518 arg7, int arg8, int arg9, int arg10, class175 arg11) {
        field3926++;
        if (this.field3927 != -1) {
            return arg6.method2222((byte) 59, this.field3927).method653(-112, arg9, arg4, arg1, arg10, arg0, arg8, arg11, arg5);
        }
        int var13 = arg8;
        if (arg1 != null) {
            boolean var14 = false;
            boolean var15 = false;
            boolean var16 = false;
            boolean var17 = false;
            boolean var18 = true;
            boolean var19 = true;
            Object var20 = null;
            Object var21 = null;
            var13 = arg8 | 0x20;
            int var22 = arg1.field796[arg9];
            int var23 = var22 >>> 16;
            int var24 = var22 & 0xFFFF;
            class420 var25 = arg4.method827(var23, (byte) 77);
            if (var25 != null) {
                var15 |= var25.method2484(var24, -525275000);
                var14 |= var25.method2481(var24, -127);
                var17 |= var25.method2485((byte) -75, var24);
                var16 |= arg1.field794;
            }
            if ((arg1.field798 || class434.field6286) && arg0 != -1 && arg1.field796.length > arg0) {
                int var26 = arg1.field796[arg0];
                int var27 = var26 >>> 16;
                int var28 = var26 & 0xFFFF;
                class420 var29 = var23 == var27 ? var25 : arg4.method827(var27, (byte) -122);
                if (var29 != null) {
                    var15 |= var29.method2484(var28, -525275000);
                    var14 |= var29.method2481(var28, -40);
                    var17 |= var29.method2485((byte) 117, var28);
                }
            }
            if (var15) {
                var13 |= 0x80;
            }
            if (var14) {
                var13 |= 0x100;
            }
            if (var16) {
                var13 |= 0x200;
            }
            if (var17) {
                var13 |= 0x400;
            }
        }
        class473 var30 = client.field7546;
        class285 var31;
        synchronized (client.field7546) {
            var31 = (class285) client.field7546.method2767(this.field3945, 0);
        }
        if (arg3 != 7) {
            this.method1686(null, -32, null, 120, 90, false);
        }
        if (var31 == null || arg5.method459(var31.method671(), var13) != 0) {
            if (var31 != null) {
                var13 = arg5.method525(var13, var31.method671());
            }
            boolean var33 = false;
            for (int var34 = 0; var34 < 12; var34++) {
                int var35 = this.field3944[var34];
                if ((var35 & 0x40000000) == 0) {
                    if ((var35 & Integer.MIN_VALUE) != 0 && !arg2.method2316(var35 & 0x3FFFFFFF, true).method1904((byte) 14)) {
                        var33 = true;
                    }
                } else if (!arg7.method3089(var35 & 0x3FFFFFFF, 126).method1724(this.field3933, (byte) 108)) {
                    var33 = true;
                }
            }
            if (var33) {
                return null;
            }
            class496[] var36 = new class496[12];
            int var37 = 0;
            for (int var38 = 0; var38 < 12; var38++) {
                int var39 = this.field3944[var38];
                if ((var39 & 0x40000000) != 0) {
                    class496 var41 = arg7.method3089(var39 & 0x3FFFFFFF, arg3 ^ 0xFFFFFF92).method1739(this.field3933, false);
                    if (var41 != null) {
                        var36[var37++] = var41;
                    }
                } else if ((var39 & Integer.MIN_VALUE) != 0) {
                    class496 var40 = arg2.method2316(var39 & 0x3FFFFFFF, true).method1895((byte) -61);
                    if (var40 != null) {
                        var36[var37++] = var40;
                    }
                }
            }
            int var42 = var13 | 0x4000;
            class496 var43 = new class496(var36, var37);
            var31 = arg5.method501(var43, var42, class229.field3218, 64, 768);
            for (int var44 = 0; var44 < 5; var44++) {
                if (class74.field1050[var44].length > this.field3943[var44]) {
                    var31.method667(class176.field2651[var44], class74.field1050[var44][this.field3943[var44]]);
                }
                if (class4.field68[var44].length > this.field3943[var44]) {
                    var31.method667(class533.field7846[var44], class4.field68[var44][this.field3943[var44]]);
                }
            }
            var31.method711(var13);
            class473 var45 = client.field7546;
            synchronized (client.field7546) {
                client.field7546.method2777(-1025, var31, this.field3945);
            }
        }
        if (arg1 == null) {
            return var31;
        } else {
            var31.method697((byte) 4, var13, true);
            return arg1.method364(arg9, arg8, arg10, 24949, arg0, var31);
        }
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(Lcw;III)V", line = 230)
    public final void method1682(class390 arg0, int arg1, int arg2, int arg3) {
        field3928++;
        int var5 = client.field7563[arg3];
        if (this.field3944[var5] != 0 && arg0.method2316(arg1, true) != null) {
            this.field3944[var5] = class219.method1367(arg1, arg2);
            this.method1687(-85);
        }
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(IILnf;)V", line = 247)
    public static final void method1683(int arg0, int arg1, class28 arg2) {
        field3936++;
        if (arg0 != -14) {
            return;
        }
        while (true) {
            class140 var3 = (class140) class71.field1020.method3137(0);
            if (var3 == null) {
                return;
            }
            boolean var4 = false;
            for (int var5 = 0; var5 < var3.field2087; var5++) {
                if (var3.field2096[var5] != null) {
                    if (var3.field2096[var5].field6699 == 2) {
                        var3.field2089[var5] = -5;
                    }
                    if (var3.field2096[var5].field6699 == 0) {
                        var4 = true;
                    }
                }
                if (var3.field2100[var5] != null) {
                    if (var3.field2100[var5].field6699 == 2) {
                        var3.field2089[var5] = -6;
                    }
                    if (var3.field2100[var5].field6699 == 0) {
                        var4 = true;
                    }
                }
            }
            if (var4) {
                return;
            }
            arg2.method190(arg1, arg0 ^ 0x4C05);
            arg2.method1891(false, 0);
            int var6 = arg2.field4360;
            arg2.method1858(var3.field2097, (byte) -41);
            for (int var7 = 0; var7 < var3.field2087; var7++) {
                if (var3.field2089[var7] == 0) {
                    try {
                        int var8 = var3.field2093[var7];
                        if (var8 == 0) {
                            Field var9 = (Field) var3.field2096[var7].field6695;
                            int var10 = var9.getInt(null);
                            arg2.method1891(false, 0);
                            arg2.method1858(var10, (byte) -118);
                        } else if (var8 == 1) {
                            Field var13 = (Field) var3.field2096[var7].field6695;
                            var13.setInt(null, var3.field2092[var7]);
                            arg2.method1891(false, 0);
                        } else if (var8 == 2) {
                            Field var11 = (Field) var3.field2096[var7].field6695;
                            int var12 = var11.getModifiers();
                            arg2.method1891(false, 0);
                            arg2.method1858(var12, (byte) -70);
                        }
                        if (var8 == 3) {
                            Method var16 = (Method) var3.field2100[var7].field6695;
                            byte[][] var17 = var3.field2090[var7];
                            Object[] var18 = new Object[var17.length];
                            for (int var19 = 0; var19 < var17.length; var19++) {
                                ObjectInputStream var20 = new ObjectInputStream(new ByteArrayInputStream(var17[var19]));
                                var18[var19] = var20.readObject();
                            }
                            Object var21 = var16.invoke(null, var18);
                            if (var21 == null) {
                                arg2.method1891(false, 0);
                            } else if ((var21 instanceof Number)) {
                                arg2.method1891(false, 1);
                                arg2.method1859((byte) -118, ((Number) var21).longValue());
                            } else if ((var21 instanceof String)) {
                                arg2.method1891(false, 2);
                                arg2.method1879(32767, (String) var21);
                            } else {
                                arg2.method1891(false, 4);
                            }
                        } else if (var8 == 4) {
                            Method var14 = (Method) var3.field2100[var7].field6695;
                            int var15 = var14.getModifiers();
                            arg2.method1891(false, 0);
                            arg2.method1858(var15, (byte) -128);
                        }
                    } catch (ClassNotFoundException var22) {
                        arg2.method1891(false, -10);
                    } catch (InvalidClassException var23) {
                        arg2.method1891(false, -11);
                    } catch (StreamCorruptedException var24) {
                        arg2.method1891(false, -12);
                    } catch (OptionalDataException var25) {
                        arg2.method1891(false, -13);
                    } catch (IllegalAccessException var26) {
                        arg2.method1891(false, -14);
                    } catch (IllegalArgumentException var27) {
                        arg2.method1891(false, -15);
                    } catch (InvocationTargetException var28) {
                        arg2.method1891(false, -16);
                    } catch (SecurityException var29) {
                        arg2.method1891(false, -17);
                    } catch (IOException var30) {
                        arg2.method1891(false, -18);
                    } catch (NullPointerException var31) {
                        arg2.method1891(false, -19);
                    } catch (Exception var32) {
                        arg2.method1891(false, -20);
                    } catch (Throwable var33) {
                        arg2.method1891(false, -21);
                    }
                } else {
                    arg2.method1891(false, var3.field2089[var7]);
                }
            }
            arg2.method1868(var6, (byte) -54);
            arg2.method1851(arg2.field4360 - var6, 0);
            var3.method2791((byte) 112);
        }
    }

    @OriginalMember(owner = "client!ur", name = "b", descriptor = "(ZI)V", line = 442)
    public final void method1684(boolean arg0, int arg1) {
        this.field3933 = arg0;
        field3939++;
        if (arg1 != -1) {
            this.method1690(-109, 40, 8);
        }
        this.method1687(-92);
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(IIILza;Lec;IIIILjp;BLcw;)Le;", line = 461)
    public final class285 method1685(int arg0, int arg1, int arg2, class295 arg3, class109 arg4, int arg5, int arg6, int arg7, int arg8, class55 arg9, byte arg10, class390 arg11) {
        field3934++;
        if (arg10 != -10) {
            field3950 = -74;
        }
        int var13 = arg8;
        if (arg9 != null) {
            boolean var14 = false;
            boolean var15 = false;
            boolean var16 = false;
            boolean var17 = false;
            boolean var18 = true;
            boolean var19 = true;
            Object var20 = null;
            var13 = arg8 | 0x20;
            int var21 = arg9.field796[arg5];
            Object var22 = null;
            int var23 = var21 >>> 16;
            int var24 = var21 & 0xFFFF;
            class420 var25 = arg4.method827(var23, (byte) 60);
            if (var25 != null) {
                var15 |= var25.method2484(var24, arg10 - 525274990);
                var14 |= var25.method2481(var24, 99);
                var17 |= var25.method2485((byte) 123, var24);
                var16 |= arg9.field794;
            }
            if ((arg9.field798 || class434.field6286) && arg7 != -1 && arg7 < arg9.field796.length) {
                int var26 = arg9.field796[arg7];
                int var27 = var26 >>> 16;
                int var28 = var26 & 0xFFFF;
                class420 var29;
                if (var23 == var27) {
                    var29 = var25;
                } else {
                    var29 = arg4.method827(var28 >>> 16, (byte) -123);
                }
                if (var29 != null) {
                    var15 |= var29.method2484(var28, -525275000);
                    var14 |= var29.method2481(var28, -128);
                    var17 |= var29.method2485((byte) 124, var28);
                }
            }
            if (var15) {
                var13 |= 0x80;
            }
            if (var14) {
                var13 |= 0x100;
            }
            if (var16) {
                var13 |= 0x200;
            }
            if (var17) {
                var13 |= 0x400;
            }
        }
        long var30 = (long) arg6 << 32 | (long) (arg1 << 16) | (long) arg0;
        class473 var32 = client.field7546;
        class285 var33;
        synchronized (client.field7546) {
            var33 = (class285) client.field7546.method2767(var30, 0);
        }
        if (var33 == null || arg3.method459(var33.method671(), var13) != 0) {
            if (var33 != null) {
                var13 = arg3.method525(var13, var33.method671());
            }
            class496[] var35 = new class496[3];
            int var36 = 0;
            if (!arg11.method2316(arg0, true).method1904((byte) 122) || !arg11.method2316(arg1, true).method1904((byte) -42) || !arg11.method2316(arg6, true).method1904((byte) -2)) {
                return null;
            }
            class496 var37 = arg11.method2316(arg0, true).method1895((byte) -61);
            if (var37 != null) {
                var35[var36++] = var37;
            }
            class496 var38 = arg11.method2316(arg1, true).method1895((byte) -61);
            if (var38 != null) {
                var35[var36++] = var38;
            }
            class496 var39 = arg11.method2316(arg6, true).method1895((byte) -61);
            if (var39 != null) {
                var35[var36++] = var39;
            }
            class496 var40 = new class496(var35, var36);
            int var41 = var13 | 0x4000;
            var33 = arg3.method501(var40, var41, class229.field3218, 64, 768);
            for (int var42 = 0; var42 < 5; var42++) {
                if (this.field3943[var42] < class74.field1050[var42].length) {
                    var33.method667(class176.field2651[var42], class74.field1050[var42][this.field3943[var42]]);
                }
                if (class4.field68[var42].length > this.field3943[var42]) {
                    var33.method667(class533.field7846[var42], class4.field68[var42][this.field3943[var42]]);
                }
            }
            var33.method711(var13);
            class473 var43 = client.field7546;
            synchronized (client.field7546) {
                client.field7546.method2777(arg10 - 1015, var33, var30);
            }
        }
        if (arg9 == null) {
            return var33;
        } else {
            class285 var44 = var33.method697((byte) 4, var13, true);
            return arg9.method364(arg5, arg8, arg2, 24949, arg7, var44);
        }
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "([II[IIIZ)V", line = 612)
    public final void method1686(int[] arg0, int arg1, int[] arg2, int arg3, int arg4, boolean arg5) {
        this.field3944 = arg0;
        if (this.field3932 != arg1) {
            this.field3940 = null;
            this.field3932 = arg1;
        }
        this.field3943 = arg2;
        this.field3933 = arg5;
        this.field3927 = arg3;
        field3930++;
        this.method1687(120);
        int var7 = 73 % ((48 - arg4) / 38);
    }

    @OriginalMember(owner = "client!ur", name = "b", descriptor = "(I)V", line = 634)
    private final void method1687(int arg0) {
        field3947++;
        long[] var2 = class403.field5763;
        this.field3945 = -1L;
        this.field3945 = this.field3945 >>> 8 ^ var2[(int) ((this.field3945 ^ (long) (this.field3932 >> 8)) & 0xFFL)];
        this.field3945 = this.field3945 >>> 8 ^ var2[(int) ((this.field3945 ^ (long) this.field3932) & 0xFFL)];
        int var3 = -81 % ((-arg0 - 22) / 62);
        for (int var4 = 0; var4 < 12; var4++) {
            this.field3945 = var2[(int) (((long) (this.field3944[var4] >> 24) ^ this.field3945) & 0xFFL)] ^ this.field3945 >>> 8;
            this.field3945 = var2[(int) ((this.field3945 ^ (long) (this.field3944[var4] >> 16)) & 0xFFL)] ^ this.field3945 >>> 8;
            this.field3945 = var2[(int) (((long) (this.field3944[var4] >> 8) ^ this.field3945) & 0xFFL)] ^ this.field3945 >>> 8;
            this.field3945 = var2[(int) (((long) this.field3944[var4] ^ this.field3945) & 0xFFL)] ^ this.field3945 >>> 8;
        }
        for (int var5 = 0; var5 < 5; var5++) {
            this.field3945 = var2[(int) (((long) this.field3943[var5] ^ this.field3945) & 0xFFL)] ^ this.field3945 >>> 8;
        }
        this.field3945 = this.field3945 >>> 8 ^ var2[(int) (((long) (this.field3933 ? 1 : 0) ^ this.field3945) & 0xFFL)];
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(Lcw;IIILjp;ILjp;Lwn;[Lpp;ILls;Lwc;ZIILec;Lza;Lmt;I)Le;", line = 671)
    public final class285 method1688(class390 arg0, int arg1, int arg2, int arg3, class55 arg4, int arg5, class55 arg6, class175 arg7, class384[] arg8, int arg9, class338 arg10, class372 arg11, boolean arg12, int arg13, int arg14, class109 arg15, class295 arg16, class518 arg17, int arg18) {
        field3925++;
        if (this.field3927 != -1) {
            return arg11.method2222((byte) -119, this.field3927).method648((byte) -60, arg4, arg10, arg13, arg9, arg7, arg5, arg15, arg1, arg6, arg8, arg18, arg16, arg14, arg2);
        }
        int var20 = arg2;
        long var21 = this.field3945;
        int[] var23 = this.field3944;
        if (arg6 != null && (arg6.field808 >= 0 || arg6.field810 >= 0)) {
            var23 = new int[12];
            for (int var24 = 0; var24 < 12; var24++) {
                var23[var24] = this.field3944[var24];
            }
            if (arg6.field808 >= 0) {
                if (arg6.field808 == 65535) {
                    var21 ^= 0xFFFFFFFF00000000L;
                    var23[5] = 0;
                } else {
                    var23[5] = class219.method1367(1073741824, arg6.field808);
                    var21 ^= (long) var23[5] << 32;
                }
            }
            if (arg6.field810 >= 0) {
                if (arg6.field810 == 65535) {
                    var23[3] = 0;
                    var21 ^= 0xFFFFFFFFL;
                } else {
                    var23[3] = class219.method1367(arg6.field810, 1073741824);
                    var21 ^= var23[3];
                }
            }
        }
        boolean var25 = false;
        boolean var26 = false;
        boolean var27 = false;
        boolean var28 = arg6 != null || arg4 != null;
        int var29 = arg8 == null ? 0 : arg8.length;
        for (int var30 = 0; var30 < var29; var30++) {
            class257.field3496[var30] = null;
            if (arg8[var30] != null) {
                class55 var31 = arg15.method831(arg8[var30].field5512, (byte) 54);
                if (var31.field796 != null) {
                    class411.field5859[var30] = var31;
                    var28 = true;
                    int var32 = arg8[var30].field5516;
                    int var33 = arg8[var30].field5506;
                    int var34 = var31.field796[var32];
                    class257.field3496[var30] = arg15.method827(var34 >>> 16, (byte) -127);
                    int var35 = var34 & 0xFFFF;
                    class525.field7669[var30] = var35;
                    if (class257.field3496[var30] != null) {
                        var26 |= class257.field3496[var30].method2484(var35, arg3 ^ 0x1F4F0F73);
                        var25 |= class257.field3496[var30].method2481(var35, arg3 ^ 0x7B);
                        var27 |= class257.field3496[var30].method2485((byte) 124, var35);
                    }
                    if ((var31.field798 || class434.field6286) && var33 != -1 && var33 < var31.field796.length) {
                        class455.field6647[var30] = var31.field788[var32];
                        class154.field2382[var30] = arg8[var30].field5514;
                        int var36 = var31.field796[var33];
                        class484.field6973[var30] = arg15.method827(var36 >>> 16, (byte) 17);
                        int var37 = var36 & 0xFFFF;
                        class467.field6751[var30] = var37;
                        if (class484.field6973[var30] != null) {
                            var26 |= class484.field6973[var30].method2484(var37, -525275000);
                            var25 |= class484.field6973[var30].method2481(var37, -126);
                            var27 |= class484.field6973[var30].method2485((byte) -109, var37);
                        }
                    } else {
                        class455.field6647[var30] = 0;
                        class154.field2382[var30] = 0;
                        class484.field6973[var30] = null;
                        class467.field6751[var30] = -1;
                    }
                }
            }
        }
        int var38 = -1;
        int var39 = -1;
        int var40 = 0;
        class420 var41 = null;
        class420 var42 = null;
        int var43 = -1;
        int var44 = -1;
        int var45 = 0;
        class420 var46 = null;
        class420 var47 = null;
        if (var28) {
            var20 = arg2 | 0x20;
            if (arg6 != null) {
                int var48 = arg6.field796[arg18];
                int var49 = var48 >>> 16;
                var41 = arg15.method827(var49, (byte) -126);
                var38 = var48 & 0xFFFF;
                if (var41 != null) {
                    var26 |= var41.method2484(var38, -525275000);
                    var25 |= var41.method2481(var38, -127);
                    var27 |= var41.method2485((byte) -90, var38);
                }
                if ((arg6.field798 || class434.field6286) && arg9 != -1 && arg9 < arg6.field796.length) {
                    int var50 = arg6.field796[arg9];
                    var40 = arg6.field788[arg18];
                    int var51 = var50 >>> 16;
                    var39 = var50 & 0xFFFF;
                    var42 = var49 == var51 ? var41 : arg15.method827(var51, (byte) 53);
                    if (var42 != null) {
                        var26 |= var42.method2484(var39, -525275000);
                        var25 |= var42.method2481(var39, arg3 - 121);
                        var27 |= var42.method2485((byte) 124, var39);
                    }
                }
            }
            if (arg4 != null) {
                int var52 = arg4.field796[arg14];
                int var53 = var52 >>> 16;
                var43 = var52 & 0xFFFF;
                var46 = arg15.method827(var53, (byte) 25);
                if (var46 != null) {
                    var26 |= var46.method2484(var43, -525275000);
                    var25 |= var46.method2481(var43, -20);
                    var27 |= var46.method2485((byte) 113, var43);
                }
                if ((arg4.field798 || class434.field6286) && arg13 != -1 && arg4.field796.length > arg13) {
                    int var54 = arg4.field796[arg13];
                    var45 = arg4.field788[arg14];
                    int var55 = var54 >>> 16;
                    var44 = var54 & 0xFFFF;
                    var47 = var53 == var55 ? var46 : arg15.method827(var55, (byte) 19);
                    if (var47 != null) {
                        var26 |= var47.method2484(var44, -525275000);
                        var25 |= var47.method2481(var44, 52);
                        var27 |= var47.method2485((byte) -89, var44);
                    }
                }
            }
            if (var26) {
                var20 |= 0x80;
            }
            if (var25) {
                var20 |= 0x100;
            }
            if (var27) {
                var20 |= 0x400;
            }
        }
        if (arg3 != -5) {
            method1683(-77, -70, null);
        }
        class473 var56 = class134.field2044;
        class285 var57;
        synchronized (class134.field2044) {
            var57 = (class285) class134.field2044.method2767(var21, 0);
        }
        class495 var58 = null;
        if (this.field3932 != -1) {
            var58 = arg10.method2058(arg3 ^ 0x78, this.field3932);
        }
        if (var57 == null || arg16.method459(var57.method671(), var20) != 0 || var58 != null && var58.field7197 != null && this.field3940 == null) {
            if (var57 != null) {
                var20 = arg16.method525(var20, var57.method671());
            }
            boolean var60 = false;
            for (int var61 = 0; var61 < 12; var61++) {
                int var62 = var23[var61];
                if ((var62 & 0x40000000) == 0) {
                    if ((var62 & Integer.MIN_VALUE) != 0 && !arg0.method2316(var62 & 0x3FFFFFFF, true).method1897(-127)) {
                        var60 = true;
                    }
                } else if (!arg17.method3089(var62 & 0x3FFFFFFF, 117).method1737(this.field3933, true)) {
                    var60 = true;
                }
            }
            if (var60) {
                if (this.field3931 != -1L) {
                    class473 var63 = class134.field2044;
                    synchronized (class134.field2044) {
                        var57 = (class285) class134.field2044.method2767(this.field3931, 0);
                    }
                }
                if (var57 == null || arg16.method459(var57.method671(), var20) != 0 || var58 != null && var58.field7197 != null && this.field3940 == null) {
                    return null;
                }
            } else {
                class496[] var64 = new class496[12];
                for (int var65 = 0; var65 < 12; var65++) {
                    int var66 = var23[var65];
                    if ((var66 & 0x40000000) != 0) {
                        class496 var67 = arg17.method3089(var66 & 0x3FFFFFFF, arg3 + 118).method1725(54, this.field3933);
                        if (var67 != null) {
                            var64[var65] = var67;
                        }
                    } else if ((Integer.MIN_VALUE & var66) != 0) {
                        class496 var68 = arg0.method2316(var66 & 0x3FFFFFFF, true).method1900(true);
                        if (var68 != null) {
                            var64[var65] = var68;
                        }
                    }
                }
                if (var58 != null && var58.field7197 != null) {
                    for (int var69 = 0; var69 < var58.field7197.length; var69++) {
                        if (var58.field7197[var69] != null && var64[var69] != null) {
                            int var70 = var58.field7197[var69][0];
                            int var71 = var58.field7197[var69][1];
                            int var72 = var58.field7197[var69][2];
                            int var73 = var58.field7197[var69][3] << 3;
                            int var74 = var58.field7197[var69][4] << 3;
                            int var75 = var58.field7197[var69][5] << 3;
                            if (this.field3940 == null) {
                                this.field3940 = new int[var58.field7197.length][];
                            }
                            if (this.field3940[var69] == null) {
                                int[] var76 = this.field3940[var69] = new int[15];
                                if (var73 == 0 && var74 == 0 && var75 == 0) {
                                    var76[12] = -var70;
                                    var76[13] = -var71;
                                    var76[0] = var76[4] = var76[8] = 32768;
                                    var76[14] = -var72;
                                } else {
                                    int var77 = class51.field731[var73];
                                    int var78 = class51.field743[var73];
                                    int var79 = class51.field731[var74];
                                    int var80 = class51.field743[var74];
                                    int var81 = class51.field731[var75];
                                    int var82 = class51.field743[var75];
                                    int var83 = var78 * var81 + 16384 >> 15;
                                    int var84 = var78 * var82 + 16384 >> 15;
                                    var76[2] = var77 * var80 + 16384 >> 15;
                                    var76[4] = var77 * var81 + 16384 >> 15;
                                    var76[3] = var77 * var82 + 16384 >> 15;
                                    var76[7] = -var80 * -var82 + var79 * var83 + 16384 >> 15;
                                    var76[5] = -var78;
                                    var76[6] = -var80 * var81 + var79 * var84 + 16384 >> 15;
                                    var76[1] = var80 * var83 + (-var82 * var79 + 16384) >> 15;
                                    var76[0] = var79 * var81 + var80 * var84 + 16384 >> 15;
                                    var76[8] = var77 * var79 + 16384 >> 15;
                                    var76[13] = var76[4] * -var71 + (var76[1] * -var70 + (var76[7] * -var72)) + 16384 >> 15;
                                    var76[14] = var76[8] * -var72 + (var76[2] * -var70 + (var76[5] * -var71)) + 16384 >> 15;
                                    var76[12] = var76[3] * -var71 + (var76[0] * -var70 - (-(var76[6] * -var72) - 16384)) >> 15;
                                }
                                var76[11] = var72;
                                var76[9] = var70;
                                var76[10] = var71;
                            }
                            if (var73 != 0 || var74 != 0 || var75 != 0) {
                                var64[var69].method2947(var73, (byte) -64, var75, var74);
                            }
                            if (var70 != 0 || var71 != 0 || var72 != 0) {
                                var64[var69].method2940(var70, var72, var71, arg3 - 3004);
                            }
                        }
                    }
                }
                class496 var85 = new class496(var64, var64.length);
                int var86 = var20 | 0x4000;
                var57 = arg16.method501(var85, var86, class229.field3218, 64, 850);
                for (int var87 = 0; var87 < 5; var87++) {
                    if (class74.field1050[var87].length > this.field3943[var87]) {
                        var57.method667(class176.field2651[var87], class74.field1050[var87][this.field3943[var87]]);
                    }
                    if (this.field3943[var87] < class4.field68[var87].length) {
                        var57.method667(class533.field7846[var87], class4.field68[var87][this.field3943[var87]]);
                    }
                }
                if (arg12) {
                    var57.method711(var20);
                    class473 var88 = class134.field2044;
                    synchronized (class134.field2044) {
                        class134.field2044.method2777(arg3 ^ 0x404, var57, var21);
                    }
                    this.field3931 = var21;
                }
            }
        }
        class285 var89 = var57.method697((byte) 4, var20, true);
        if (!var28) {
            return var89;
        }
        int var90 = 0;
        int var91 = 1;
        while (var90 < var29) {
            if (class257.field3496[var90] != null) {
                var89.method1634(false, class455.field6647[var90], this.field3940 == null ? null : this.field3940[var90], class154.field2382[var90] - 1, class467.field6751[var90], 0, class484.field6973[var90], var91, -115, class257.field3496[var90], class525.field7669[var90]);
            }
            var90++;
            var91 <<= 0x1;
        }
        if (var41 != null && var46 != null) {
            var89.method1640(false, (byte) 85, arg6.field791, var43, var40, arg1 - 1, var46, var47, arg5 - 1, var38, var42, var39, var45, var41, var44);
        } else if (var41 != null) {
            var89.method1641(var42, arg1 - 1, var39, 0, var41, (byte) 91, var40, var38, false);
        } else if (var46 != null) {
            var89.method1641(var47, arg5 - 1, var44, 0, var46, (byte) 85, var45, var43, false);
        }
        for (int var92 = 0; var92 < var29; var92++) {
            class257.field3496[var92] = null;
            class484.field6973[var92] = null;
            class411.field5859[var92] = null;
        }
        return var89;
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(III)V", line = 1201)
    public static final void method1689(int arg0, int arg1, int arg2) {
        class532 var3 = class103.field1632[arg0][arg1][arg2];
        if (var3 == null) {
            return;
        }
        if (var3.field7830 != null) {
            var3.field7830 = null;
        }
        if (var3.field7822 != null) {
            var3.field7822 = null;
        }
    }

    @OriginalMember(owner = "client!ur", name = "b", descriptor = "(III)V", line = 1214)
    public final void method1690(int arg0, int arg1, int arg2) {
        field3941++;
        this.field3943[arg2] = arg1;
        if (arg0 != -6710) {
            this.method1688(null, -101, 6, -28, null, -15, null, null, null, -28, null, null, false, 24, 72, null, null, null, -48);
        }
        this.method1687(arg0 ^ 0x1A42);
    }
}
