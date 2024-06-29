import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lk")
public class class263 {

    @OriginalMember(owner = "client!lk", name = "i", descriptor = "I")
    private int field4552 = 0;

    @OriginalMember(owner = "client!lk", name = "h", descriptor = "I")
    private int field4551 = 0;

    @OriginalMember(owner = "client!lk", name = "k", descriptor = "I")
    private int field4554 = 128;

    @OriginalMember(owner = "client!lk", name = "g", descriptor = "I")
    public int field4550 = -1;

    @OriginalMember(owner = "client!lk", name = "n", descriptor = "I")
    private int field4557 = 128;

    @OriginalMember(owner = "client!lk", name = "r", descriptor = "I")
    private int field4561 = 0;

    @OriginalMember(owner = "client!lk", name = "t", descriptor = "Z")
    public boolean field4563 = false;

    @OriginalMember(owner = "client!lk", name = "c", descriptor = "Ldj;")
    public static class310 field4546 = new class310();

    @OriginalMember(owner = "client!lk", name = "o", descriptor = "[I")
    public static int[] field4558 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @OriginalMember(owner = "client!lk", name = "u", descriptor = "Lwa;")
    public static class75 field4564 = class66.method560("blinken2:", false);

    @OriginalMember(owner = "client!lk", name = "x", descriptor = "[I")
    public static int[] field4567 = new int[4096];

    @OriginalMember(owner = "client!lk", name = "C", descriptor = "Lwa;")
    private static class75 field4572 = class66.method560("http:)4)4advert)3runescape)3com)4banner)3ws?size=729", false);

    @OriginalMember(owner = "client!lk", name = "q", descriptor = "Lwa;")
    public static class75 field4560 = class66.method560("W-=hlen Sie eine Option", false);

    @OriginalMember(owner = "client!lk", name = "p", descriptor = "Lwa;")
    public static class75 field4559 = field4572;

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "I")
    public static int field4544;

    @OriginalMember(owner = "client!lk", name = "b", descriptor = "I")
    public static int field4545;

    @OriginalMember(owner = "client!lk", name = "e", descriptor = "I")
    public static int field4548;

    @OriginalMember(owner = "client!lk", name = "f", descriptor = "I")
    public static int field4549;

    @OriginalMember(owner = "client!lk", name = "j", descriptor = "I")
    public static int field4553;

    @OriginalMember(owner = "client!lk", name = "m", descriptor = "I")
    public static int field4556;

    @OriginalMember(owner = "client!lk", name = "s", descriptor = "I")
    public static int field4562;

    @OriginalMember(owner = "client!lk", name = "w", descriptor = "I")
    private int field4566;

    @OriginalMember(owner = "client!lk", name = "y", descriptor = "I")
    public static int field4568;

    @OriginalMember(owner = "client!lk", name = "z", descriptor = "I")
    public int field4569;

    @OriginalMember(owner = "client!lk", name = "B", descriptor = "I")
    public static int field4571;

    @OriginalMember(owner = "client!lk", name = "d", descriptor = "[S")
    private short[] field4547;

    @OriginalMember(owner = "client!lk", name = "l", descriptor = "[S")
    private short[] field4555;

    @OriginalMember(owner = "client!lk", name = "v", descriptor = "[S")
    private short[] field4565;

    @OriginalMember(owner = "client!lk", name = "A", descriptor = "[S")
    private short[] field4570;

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(IJ)Lwa;", line = 5)
    public static final class75 method1877(int arg0, long arg1) {
        if (arg0 <= 1) {
            field4571 = -25;
        }
        field4549++;
        return class282.method1997(arg1, false, true, 10);
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(Lja;IBLcl;)V", line = 25)
    public static final void method1878(class60 arg0, int arg1, byte arg2, class124 arg3) {
        class150 var4 = new class150();
        var4.field2577 = arg0.method501(0);
        if (arg2 != -94) {
            return;
        }
        field4553++;
        var4.field2585 = arg0.method505(arg2 + 349);
        var4.field2572 = new int[var4.field2577];
        var4.field2579 = new class77[var4.field2577];
        var4.field2575 = new int[var4.field2577];
        var4.field2582 = new byte[var4.field2577][][];
        var4.field2581 = new class77[var4.field2577];
        var4.field2571 = new int[var4.field2577];
        for (int var5 = 0; var5 < var4.field2577; var5++) {
            try {
                int var6 = arg0.method501(0);
                if (var6 == 0 || var6 == 1 || var6 == 2) {
                    String var17 = new String(arg0.method532(arg2 + 93).method659(false));
                    int var18 = 0;
                    String var19 = new String(arg0.method532(arg2 ^ 0x5D).method659(false));
                    if (var6 == 1) {
                        var18 = arg0.method505(255);
                    }
                    var4.field2571[var5] = var6;
                    var4.field2572[var5] = var18;
                    var4.field2581[var5] = arg3.method944(var19, false, class233.method1699((byte) -122, var17));
                } else if (var6 == 3 || var6 == 4) {
                    String var7 = new String(arg0.method532(-1).method659(false));
                    String var8 = new String(arg0.method532(-1).method659(false));
                    int var9 = arg0.method501(0);
                    String[] var10 = new String[var9];
                    for (int var11 = 0; var11 < var9; var11++) {
                        var10[var11] = new String(arg0.method532(-1).method659(false));
                    }
                    byte[][] var12 = new byte[var9][];
                    if (var6 == 3) {
                        for (int var13 = 0; var13 < var9; var13++) {
                            int var14 = arg0.method505(255);
                            var12[var13] = new byte[var14];
                            arg0.method512(var14, 73, var12[var13], 0);
                        }
                    }
                    var4.field2571[var5] = var6;
                    Class[] var15 = new Class[var9];
                    for (int var16 = 0; var16 < var9; var16++) {
                        var15[var16] = class233.method1699((byte) -84, var10[var16]);
                    }
                    var4.field2579[var5] = arg3.method945(class233.method1699((byte) -128, var7), var8, var15, arg2 + 119);
                    var4.field2582[var5] = var12;
                }
            } catch (ClassNotFoundException var25) {
                var4.field2575[var5] = -1;
            } catch (SecurityException var26) {
                var4.field2575[var5] = -2;
            } catch (NullPointerException var27) {
                var4.field2575[var5] = -3;
            } catch (Exception var28) {
                var4.field2575[var5] = -4;
            } catch (Throwable var29) {
                var4.field2575[var5] = -5;
            }
        }
        class191.field3183.method1251(var4, -121);
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(IBLja;)V", line = 144)
    private final void method1879(int arg0, byte arg1, class60 arg2) {
        if (arg0 == 1) {
            this.field4566 = arg2.method485((byte) -2);
        } else if (arg0 == 2) {
            this.field4550 = arg2.method485((byte) -2);
        } else if (arg0 == 4) {
            this.field4554 = arg2.method485((byte) -2);
        } else if (arg0 == 5) {
            this.field4557 = arg2.method485((byte) -2);
        } else if (arg0 == 6) {
            this.field4561 = arg2.method485((byte) -2);
        } else if (arg0 == 7) {
            this.field4551 = arg2.method501(0);
        } else if (arg0 == 8) {
            this.field4552 = arg2.method501(0);
        } else if (arg0 == 9) {
            this.field4563 = true;
        } else if (arg0 == 40) {
            int var6 = arg2.method501(0);
            this.field4547 = new short[var6];
            this.field4555 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field4547[var7] = (short) arg2.method485((byte) -2);
                this.field4555[var7] = (short) arg2.method485((byte) -2);
            }
        } else if (arg0 == 41) {
            int var4 = arg2.method501(0);
            this.field4570 = new short[var4];
            this.field4565 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field4570[var5] = (short) arg2.method485((byte) -2);
                this.field4565[var5] = (short) arg2.method485((byte) -2);
            }
        }
        int var8 = 86 % ((arg1 - 24) / 45);
        field4545++;
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(IILre;IILbh;I)V", line = 227)
    public static final void method1880(int arg0, int arg1, class262 arg2, int arg3, int arg4, class258 arg5, int arg6) {
        field4548++;
        if (arg5 == null) {
            return;
        }
        int var7 = class290.field4981 + class249.field4191 & 0x7FF;
        int var8 = Math.max(arg2.field4531 / 2, arg2.field4517 / 2) + 10;
        int var9 = arg4 * arg4 + arg6 * arg6;
        if (var8 * var8 < var9) {
            return;
        }
        int var10 = class21.field288[var7];
        int var11 = class21.field286[var7];
        int var12 = var10 * 256 / (class14.field191 + 256);
        int var13 = var11 * 256 / (class14.field191 + 256);
        int var14 = arg4 * var12 + arg6 * var13 >> 16;
        int var15 = arg4 * var13 - (arg6 * var12) >> 16;
        if (arg1 != 1926111120) {
            method1880(-4, 16, (class262) null, -27, -67, (class258) null, 54);
        }
        ((class277) arg5).method1964(arg3 + (arg2.field4531 / 2) + var14 - arg5.field4325 / 2, arg2.field4517 / 2 + (arg0 - (arg5.field4335 / 2 + var15)), (class277) arg2.method1868(false, false));
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(IB)Lcc;", line = 269)
    public final class234 method1881(int arg0, byte arg1) {
        field4562++;
        class234 var3 = (class234) class210.field3591.method1193((long) this.field4569, arg1 + 24);
        if (var3 == null) {
            class146 var4 = class146.method1127(class155.field2657, this.field4566, 0);
            if (var4 == null) {
                return null;
            }
            if (this.field4547 != null) {
                for (int var5 = 0; var5 < this.field4547.length; var5++) {
                    var4.method1117(this.field4547[var5], this.field4555[var5]);
                }
            }
            if (this.field4570 != null) {
                for (int var6 = 0; var6 < this.field4570.length; var6++) {
                    var4.method1124(this.field4570[var6], this.field4565[var6]);
                }
            }
            var3 = var4.method1114(this.field4551 + 64, 850 - -this.field4552, -30, -50, -30);
            class210.field3591.method1194(var3, (long) this.field4569, false);
        }
        class234 var7;
        if (this.field4550 == -1 || arg0 == -1) {
            var7 = var3.method451(true, true);
        } else {
            var7 = class302.method2082(this.field4550, 125).method187(arg0, var3, -109);
        }
        if (this.field4554 != 128 || this.field4557 != 128) {
            var7.method455(this.field4554, this.field4557, this.field4554);
        }
        if (this.field4561 != 0) {
            if (this.field4561 == 90) {
                var7.method442();
            }
            if (this.field4561 == 180) {
                var7.method413();
            }
            if (this.field4561 == 270) {
                var7.method454();
            }
        }
        if (arg1 != -56) {
            method1883(-90);
        }
        return var7;
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(Lwa;Z)Z", line = 357)
    public static final boolean method1882(class75 arg0, boolean arg1) {
        field4544++;
        if (arg0 == null) {
            return false;
        } else if (arg1) {
            return false;
        } else {
            for (int var2 = 0; var2 < class40.field628; var2++) {
                if (arg0.method614(class106.field1779[var2], -66)) {
                    return true;
                }
            }
            if (arg0.method614(class279.field4831.field1561, -66)) {
                return true;
            } else {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(I)V", line = 392)
    public static void method1883(int arg0) {
        field4564 = null;
        field4559 = null;
        if (arg0 >= -54) {
            field4560 = (class75) null;
        }
        field4567 = null;
        field4558 = null;
        field4572 = null;
        field4546 = null;
        field4560 = null;
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(Lja;Z)V", line = 429)
    public final void method1884(class60 arg0, boolean arg1) {
        field4556++;
        while (true) {
            int var3 = arg0.method501(0);
            if (var3 == 0) {
                if (!arg1) {
                    field4571 = -8;
                }
                return;
            }
            this.method1879(var3, (byte) -39, arg0);
        }
    }
}
