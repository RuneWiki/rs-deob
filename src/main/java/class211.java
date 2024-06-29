import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vi")
public class class211 {

    @OriginalMember(owner = "client!vi", name = "c", descriptor = "Lbd;")
    private class27 field3358 = null;

    @OriginalMember(owner = "client!vi", name = "b", descriptor = "I")
    private int field3357 = 65000;

    @OriginalMember(owner = "client!vi", name = "n", descriptor = "Lbd;")
    private class27 field3369 = null;

    @OriginalMember(owner = "client!vi", name = "r", descriptor = "I")
    private int field3373;

    @OriginalMember(owner = "client!vi", name = "h", descriptor = "I")
    public static int field3363 = -1;

    @OriginalMember(owner = "client!vi", name = "f", descriptor = "I")
    public static int field3361 = 0;

    @OriginalMember(owner = "client!vi", name = "k", descriptor = "Lma;")
    private static class5 field3366 = class12.method119("Members object", (byte) 108);

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "Leb;")
    public static class253 field3356 = null;

    @OriginalMember(owner = "client!vi", name = "g", descriptor = "Lma;")
    public static class5 field3362 = field3366;

    @OriginalMember(owner = "client!vi", name = "o", descriptor = "Lma;")
    public static class5 field3370 = class12.method119(")4a=", (byte) 96);

    @OriginalMember(owner = "client!vi", name = "m", descriptor = "Lma;")
    public static class5 field3368 = class12.method119("scrollen:", (byte) 105);

    @OriginalMember(owner = "client!vi", name = "d", descriptor = "I")
    public static int field3359;

    @OriginalMember(owner = "client!vi", name = "e", descriptor = "I")
    public static int field3360;

    @OriginalMember(owner = "client!vi", name = "i", descriptor = "I")
    public static int field3364;

    @OriginalMember(owner = "client!vi", name = "j", descriptor = "I")
    public static int field3365;

    @OriginalMember(owner = "client!vi", name = "l", descriptor = "I")
    public static int field3367;

    @OriginalMember(owner = "client!vi", name = "p", descriptor = "I")
    public static int field3371;

    @OriginalMember(owner = "client!vi", name = "q", descriptor = "I")
    public static int field3372;

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(ILwi;IZIIIII)V", line = 12)
    public static final void method1397(int arg0, class185 arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        int var9 = arg6 & 0x3;
        field3364++;
        int var10;
        int var11;
        if (var9 == 1 || var9 == 3) {
            var10 = arg1.field2840;
            var11 = arg1.field2859;
        } else {
            var10 = arg1.field2859;
            var11 = arg1.field2840;
        }
        int var12;
        int var13;
        if ((arg4 + var11) <= 104) {
            var12 = arg4 + (var11 + 1 >> 1);
            var13 = (var11 >> 1) + arg4;
        } else {
            var13 = arg4;
            var12 = arg4 + 1;
        }
        int var14;
        int var15;
        if ((arg2 + var10) <= 104) {
            var14 = (var10 + 1 >> 1) + arg2;
            var15 = (var10 >> 1) + arg2;
        } else {
            var14 = arg2 + 1;
            var15 = arg2;
        }
        int var16 = (arg4 << 7) + (var11 << 6);
        int var17 = (arg2 << 7) + (var10 << 6);
        int[][] var18 = class208.field3304[arg5];
        int var19 = 0;
        int var20 = var18[var13][var14] + var18[var13][var15] + var18[var12][var14] + var18[var12][var15] >> 2;
        if (arg5 != 0) {
            int[][] var21 = class208.field3304[0];
            var19 = var20 - (var21[var12][var15] + var21[var13][var15] - (-var21[var12][var14] + -var21[var13][var14]) >> 2);
        }
        int[][] var22 = (int[][]) null;
        if (arg5 < 3) {
            var22 = class208.field3304[arg5 + 1];
        }
        class286 var23 = arg1.method1214(var22, arg6, (byte) 85, var17, arg8, arg3, false, var16, (class178) null, var20, var18);
        class134.method881(var23.field4825, var16 - arg7, var19, var17 - arg0);
    }

    @OriginalMember(owner = "client!vi", name = "toString", descriptor = "()Ljava/lang/String;", line = 91)
    public final String toString() {
        field3371++;
        return "Cache:" + this.field3373;
    }

    @OriginalMember(owner = "client!vi", name = "<init>", descriptor = "(ILbd;Lbd;I)V", line = 676)
    public class211(int arg0, class27 arg1, class27 arg2, int arg3) {
        this.field3358 = arg2;
        this.field3357 = arg3;
        this.field3369 = arg1;
        this.field3373 = arg0;
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(I)V", line = 109)
    public static void method1398(int arg0) {
        field3368 = null;
        field3370 = null;
        int var1 = -92 / ((arg0 + 50) / 46);
        field3366 = null;
        field3362 = null;
        field3356 = null;
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(II)[B", line = 128)
    public final byte[] method1399(int arg0, int arg1) {
        field3360++;
        class27 var3 = this.field3369;
        synchronized (this.field3369) {
            try {
                Object var10000;
                if (((long) (arg1 * 6 + 6)) > this.field3358.method200(10440)) {
                    var10000 = null;
                    return (byte[]) var10000;
                }
                this.field3358.method198((byte) 29, (long) (arg1 * 6));
                int var4 = 82 % ((arg0 - 73) / 52);
                this.field3358.method201(0, 107, class297.field4996, 6);
                int var5 = (class297.field4996[2] & 0xFF) + (class297.field4996[0] & 0xFF << 16) + (class297.field4996[1] & 0xFF << 8);
                int var6 = ((class297.field4996[3] & 0xFF) << 16) + (((class297.field4996[4] & 0xFF) << 8) + (class297.field4996[5] & 0xFF));
                if (var5 < 0 || this.field3357 < var5) {
                    var10000 = null;
                    return (byte[]) var10000;
                } else if (var6 <= 0 || this.field3369.method200(10440) / 520L < (long) var6) {
                    var10000 = null;
                    return (byte[]) var10000;
                } else {
                    int var7 = 0;
                    int var8 = 0;
                    byte[] var9 = new byte[var5];
                    while (var5 > var8) {
                        if (var6 == 0) {
                            var10000 = null;
                            return (byte[]) var10000;
                        }
                        this.field3369.method198((byte) 107, (long) (var6 * 520));
                        int var10 = var5 - var8;
                        if (var10 > 512) {
                            var10 = 512;
                        }
                        this.field3369.method201(0, -121, class297.field4996, var10 + 8);
                        int var11 = ((class297.field4996[4] & 0xFF) << 16) - (-(class297.field4996[5] & 0xFF << 8) - (class297.field4996[6] & 0xFF));
                        int var12 = class297.field4996[7] & 0xFF;
                        int var13 = (class297.field4996[0] & 0xFF << 8) + (class297.field4996[1] & 0xFF);
                        int var14 = ((class297.field4996[2] & 0xFF) << 8) + (class297.field4996[3] & 0xFF);
                        if (arg1 != var13 || var7 != var14 || this.field3373 != var12) {
                            var10000 = null;
                            return (byte[]) var10000;
                        }
                        if (var11 < 0 || this.field3369.method200(10440) / 520L < (long) var11) {
                            var10000 = null;
                            return (byte[]) var10000;
                        }
                        var7++;
                        var6 = var11;
                        for (int var15 = 0; var15 < var10; var15++) {
                            var9[var8++] = class297.field4996[var15 + 8];
                        }
                    }
                    byte[] var20 = var9;
                    return var20;
                }
            } catch (IOException var18) {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!vi", name = "b", descriptor = "(I)Z", line = 209)
    public static final boolean method1400(int arg0) {
        if (arg0 != 256) {
            field3365 = -16;
        }
        field3367++;
        long var1 = class212.method1404((byte) -107);
        int var3 = (int) (var1 - class303.field5111);
        if (var3 > 200) {
            var3 = 200;
        }
        class284.field4809 += var3;
        class303.field5111 = var1;
        if (class136.field2015 == 0 && class116.field1734 == 0 && class206.field3281 == 0 && class267.field4587 == 0) {
            return true;
        } else if (class115.field1713 == null) {
            return false;
        } else {
            try {
                if (class284.field4809 > 30000) {
                    throw new IOException();
                }
                while (class116.field1734 < 20 && class267.field4587 > 0) {
                    class136 var4 = (class136) class268.field4622.method1379(true);
                    class221 var5 = new class221(4);
                    var5.method1542(-124, 1);
                    var5.method1496((int) var4.field5004, 96);
                    class115.field1713.method1185(-22036, 4, var5.field3617, 0);
                    class274.field4679.method1376(var4.field5004, -1, var4);
                    class267.field4587--;
                    class116.field1734++;
                }
                while (class136.field2015 < 20 && class206.field3281 > 0) {
                    class136 var6 = (class136) class216.field3414.method781(arg0 - 257);
                    class221 var7 = new class221(4);
                    var7.method1542(arg0 ^ 0xFFFFFE83, 0);
                    var7.method1496((int) var6.field5004, 70);
                    class115.field1713.method1185(arg0 - 22292, 4, var7.field3617, 0);
                    var6.method1828(-99);
                    class24.field422.method1376(var6.field5004, arg0 - 257, var6);
                    class136.field2015++;
                    class206.field3281--;
                }
                for (int var8 = 0; var8 < 100; var8++) {
                    int var9 = class115.field1713.method1180(false);
                    if (var9 < 0) {
                        throw new IOException();
                    }
                    if (var9 == 0) {
                        break;
                    }
                    class284.field4809 = 0;
                    byte var10 = 0;
                    if (class241.field4009 == null) {
                        var10 = 8;
                    } else if (class151.field2187 == 0) {
                        var10 = 1;
                    }
                    if (var10 > 0) {
                        int var11 = var10 - class210.field3338.field3610;
                        if (var9 < var11) {
                            var11 = var9;
                        }
                        class115.field1713.method1183(var11, class210.field3338.field3610, arg0 - 15181, class210.field3338.field3617);
                        if (class201.field3191 != 0) {
                            for (int var12 = 0; var12 < var11; var12++) {
                                class210.field3338.field3617[class210.field3338.field3610 + var12] = (byte) class259.method1798(class210.field3338.field3617[class210.field3338.field3610 + var12], class201.field3191);
                            }
                        }
                        class210.field3338.field3610 += var11;
                        if (var10 > class210.field3338.field3610) {
                            break;
                        }
                        if (class241.field4009 == null) {
                            class210.field3338.field3610 = 0;
                            int var13 = class210.field3338.method1509(true);
                            int var14 = class210.field3338.method1524((byte) 85);
                            int var15 = class210.field3338.method1509(true);
                            int var16 = class210.field3338.method1517((byte) -125);
                            long var17 = (long) ((var13 << 16) + var14);
                            class136 var19 = (class136) class274.field4679.method1372(false, var17);
                            class78.field1211 = true;
                            if (var19 == null) {
                                var19 = (class136) class24.field422.method1372(false, var17);
                                class78.field1211 = false;
                            }
                            if (var19 == null) {
                                throw new IOException();
                            }
                            class241.field4009 = var19;
                            int var20 = var15 == 0 ? 5 : 9;
                            class99.field1482 = new class221(var16 + var20 + class241.field4009.field2009);
                            class99.field1482.method1542(arg0 ^ 0xFFFFFE8E, var15);
                            class99.field1482.method1513(var16, false);
                            class151.field2187 = 8;
                            class210.field3338.field3610 = 0;
                        } else if (class151.field2187 == 0) {
                            if (class210.field3338.field3617[0] == -1) {
                                class151.field2187 = 1;
                                class210.field3338.field3610 = 0;
                            } else {
                                class241.field4009 = null;
                            }
                        }
                    } else {
                        int var21 = class99.field1482.field3617.length - class241.field4009.field2009;
                        int var22 = 512 - class151.field2187;
                        if (var22 > var21 - class99.field1482.field3610) {
                            var22 = var21 - class99.field1482.field3610;
                        }
                        if (var22 > var9) {
                            var22 = var9;
                        }
                        class115.field1713.method1183(var22, class99.field1482.field3610, -14925, class99.field1482.field3617);
                        if (class201.field3191 != 0) {
                            for (int var23 = 0; var23 < var22; var23++) {
                                class99.field1482.field3617[class99.field1482.field3610 + var23] = (byte) class259.method1798(class99.field1482.field3617[class99.field1482.field3610 + var23], class201.field3191);
                            }
                        }
                        class99.field1482.field3610 += var22;
                        class151.field2187 += var22;
                        if (class99.field1482.field3610 == var21) {
                            if (class241.field4009.field5004 == 16711935L) {
                                class244.field4045 = class99.field1482;
                                for (int var26 = 0; var26 < 256; var26++) {
                                    class158 var27 = class275.field4697[var26];
                                    if (var27 != null) {
                                        class244.field4045.field3610 = var26 * 8 + 5;
                                        int var28 = class244.field4045.method1517((byte) -115);
                                        int var29 = class244.field4045.method1517((byte) -114);
                                        var27.method1011(var29, 2, var28);
                                    }
                                }
                            } else {
                                class104.field1549.reset();
                                class104.field1549.update(class99.field1482.field3617, 0, var21);
                                int var24 = (int) class104.field1549.getValue();
                                if (class241.field4009.field2019 != var24) {
                                    try {
                                        class115.field1713.method1184(false);
                                    } catch (Exception var33) {
                                    }
                                    class201.field3191 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
                                    class115.field1713 = null;
                                    class216.field3458++;
                                    return false;
                                }
                                class242.field4038 = 0;
                                class216.field3458 = 0;
                                class241.field4009.field2013.method1016(class78.field1211, (int) (class241.field4009.field5004 & 0xFFFFL), (class241.field4009.field5004 & 0xFF0000L) == 16711680L, arg0 + 9620, class99.field1482.field3617);
                            }
                            class241.field4009.method1997(-27381);
                            class241.field4009 = null;
                            class151.field2187 = 0;
                            class99.field1482 = null;
                            if (class78.field1211) {
                                class116.field1734--;
                            } else {
                                class136.field2015--;
                            }
                        } else {
                            if (class151.field2187 != 512) {
                                break;
                            }
                            class151.field2187 = 0;
                        }
                    }
                }
                return true;
            } catch (IOException var34) {
                try {
                    class115.field1713.method1184(false);
                } catch (Exception var32) {
                }
                class115.field1713 = null;
                class242.field4038++;
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(I[BIZ)Z", line = 506)
    public final boolean method1401(int arg0, byte[] arg1, int arg2, boolean arg3) {
        field3372++;
        class27 var5 = this.field3369;
        synchronized (this.field3369) {
            if (arg2 < 0 || this.field3357 < arg2) {
                throw new IllegalArgumentException();
            } else if (arg3) {
                return true;
            } else {
                boolean var6 = this.method1402(arg0, (byte) 2, arg1, arg2, true);
                if (!var6) {
                    var6 = this.method1402(arg0, (byte) 2, arg1, arg2, false);
                }
                return var6;
            }
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(IB[BIZ)Z", line = 548)
    private final boolean method1402(int arg0, byte arg1, byte[] arg2, int arg3, boolean arg4) {
        field3359++;
        class27 var6 = this.field3369;
        synchronized (this.field3369) {
            try {
                int var7;
                boolean var10000;
                if (arg4) {
                    if (this.field3358.method200(10440) < (long) (arg0 * 6 + 6)) {
                        var10000 = false;
                        return var10000;
                    }
                    this.field3358.method198((byte) -128, (long) (arg0 * 6));
                    this.field3358.method201(0, 59, class297.field4996, 6);
                    var7 = (class297.field4996[3] & 0xFF << 16) + ((class297.field4996[4] & 0xFF) << 8) + (class297.field4996[5] & 0xFF);
                    if (var7 <= 0 || (long) var7 > this.field3369.method200(10440) / 520L) {
                        var10000 = false;
                        return var10000;
                    }
                } else {
                    var7 = (int) ((this.field3369.method200(10440) + 519L) / 520L);
                    if (var7 == 0) {
                        var7 = 1;
                    }
                }
                class297.field4996[0] = (byte) (arg3 >> 16);
                if (arg1 != 2) {
                    var10000 = true;
                    return var10000;
                }
                class297.field4996[1] = (byte) (arg3 >> 8);
                class297.field4996[4] = (byte) (var7 >> 8);
                class297.field4996[5] = (byte) var7;
                class297.field4996[2] = (byte) arg3;
                int var8 = 0;
                class297.field4996[3] = (byte) (var7 >> 16);
                this.field3358.method198((byte) -106, (long) (arg0 * 6));
                int var9 = 0;
                this.field3358.method197(class297.field4996, 0, 6, -1);
                while (true) {
                    if (var8 < arg3) {
                        label141: {
                            int var10 = 0;
                            if (arg4) {
                                this.field3369.method198((byte) -112, (long) (var7 * 520));
                                try {
                                    this.field3369.method201(0, -104, class297.field4996, 8);
                                } catch (EOFException var18) {
                                    break label141;
                                }
                                var10 = (class297.field4996[4] & 0xFF << 16) + (class297.field4996[6] & 0xFF) + (class297.field4996[5] & 0xFF << 8);
                                int var12 = (class297.field4996[0] & 0xFF << 8) + (class297.field4996[1] & 0xFF);
                                int var13 = class297.field4996[7] & 0xFF;
                                int var14 = (class297.field4996[2] & 0xFF << 8) + (class297.field4996[3] & 0xFF);
                                if (arg0 != var12 || var9 != var14 || this.field3373 != var13) {
                                    var10000 = false;
                                    return var10000;
                                }
                                if (var10 < 0 || ((long) var10) > (this.field3369.method200(arg1 ^ 0x28CA) / 520L)) {
                                    var10000 = false;
                                    return var10000;
                                }
                            }
                            int var15 = arg3 - var8;
                            if (var10 == 0) {
                                var10 = (int) ((this.field3369.method200(10440) + 519L) / 520L);
                                if (var10 == 0) {
                                    var10++;
                                }
                                arg4 = false;
                                if (var7 == var10) {
                                    var10++;
                                }
                            }
                            class297.field4996[3] = (byte) var9;
                            if ((arg3 - var8) <= 512) {
                                var10 = 0;
                            }
                            class297.field4996[5] = (byte) (var10 >> 8);
                            if (var15 > 512) {
                                var15 = 512;
                            }
                            class297.field4996[1] = (byte) arg0;
                            class297.field4996[4] = (byte) (var10 >> 16);
                            class297.field4996[6] = (byte) var10;
                            class297.field4996[0] = (byte) (arg0 >> 8);
                            class297.field4996[7] = (byte) this.field3373;
                            class297.field4996[2] = (byte) (var9 >> 8);
                            this.field3369.method198((byte) 103, (long) (var7 * 520));
                            var9++;
                            var7 = var10;
                            this.field3369.method197(class297.field4996, 0, 8, -1);
                            this.field3369.method197(arg2, var8, var15, -1);
                            var8 += var15;
                            continue;
                        }
                    }
                    var10000 = true;
                    return var10000;
                }
            } catch (IOException var19) {
                return false;
            }
        }
    }
}
