import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!e")
public class class159 extends class241 {

    @OriginalMember(owner = "client!e", name = "tc", descriptor = "I")
    public int field2476 = -1;

    @OriginalMember(owner = "client!e", name = "wc", descriptor = "I")
    private int field2479 = 0;

    @OriginalMember(owner = "client!e", name = "uc", descriptor = "I")
    public int field2477 = 0;

    @OriginalMember(owner = "client!e", name = "yc", descriptor = "I")
    public int field2481 = 0;

    @OriginalMember(owner = "client!e", name = "Fc", descriptor = "I")
    public int field2488 = 0;

    @OriginalMember(owner = "client!e", name = "Cc", descriptor = "I")
    public int field2485 = -1;

    @OriginalMember(owner = "client!e", name = "qc", descriptor = "I")
    public int field2473 = -1;

    @OriginalMember(owner = "client!e", name = "Pc", descriptor = "I")
    public int field2498 = 0;

    @OriginalMember(owner = "client!e", name = "Hc", descriptor = "I")
    public int field2490 = -1;

    @OriginalMember(owner = "client!e", name = "Sc", descriptor = "I")
    public int field2501 = -1;

    @OriginalMember(owner = "client!e", name = "Oc", descriptor = "Z")
    public boolean field2497 = false;

    @OriginalMember(owner = "client!e", name = "Xc", descriptor = "I")
    public int field2506 = 0;

    @OriginalMember(owner = "client!e", name = "Vc", descriptor = "I")
    public int field2504 = -1;

    @OriginalMember(owner = "client!e", name = "Wc", descriptor = "I")
    public int field2505 = -1;

    @OriginalMember(owner = "client!e", name = "xc", descriptor = "[I")
    public static int[] field2480 = new int[2];

    @OriginalMember(owner = "client!e", name = "vc", descriptor = "Lna;")
    public static class26 field2478 = class69.method505("Gestionnaire de saisie charg-B", (byte) -117);

    @OriginalMember(owner = "client!e", name = "pc", descriptor = "[I")
    public static int[] field2472 = new int[4];

    @OriginalMember(owner = "client!e", name = "Ac", descriptor = "Lna;")
    public static class26 field2483 = class69.method505("Forced tweening ENABLED(Q", (byte) -118);

    @OriginalMember(owner = "client!e", name = "Dc", descriptor = "Lna;")
    public static class26 field2486 = class69.method505("_labels", (byte) -121);

    @OriginalMember(owner = "client!e", name = "sc", descriptor = "[I")
    public static int[] field2475 = new int[100];

    @OriginalMember(owner = "client!e", name = "Tc", descriptor = "Lna;")
    public static class26 field2502 = class69.method505("www)2wtqa", (byte) -125);

    @OriginalMember(owner = "client!e", name = "rc", descriptor = "B")
    public static byte field2474;

    @OriginalMember(owner = "client!e", name = "zc", descriptor = "I")
    public static int field2482;

    @OriginalMember(owner = "client!e", name = "Ec", descriptor = "I")
    public static int field2487;

    @OriginalMember(owner = "client!e", name = "Gc", descriptor = "I")
    public static int field2489;

    @OriginalMember(owner = "client!e", name = "Ic", descriptor = "I")
    public static int field2491;

    @OriginalMember(owner = "client!e", name = "Jc", descriptor = "I")
    public static int field2492;

    @OriginalMember(owner = "client!e", name = "Kc", descriptor = "I")
    public static int field2493;

    @OriginalMember(owner = "client!e", name = "Lc", descriptor = "I")
    public static int field2494;

    @OriginalMember(owner = "client!e", name = "Nc", descriptor = "I")
    public static int field2496;

    @OriginalMember(owner = "client!e", name = "Qc", descriptor = "I")
    public static int field2499;

    @OriginalMember(owner = "client!e", name = "Rc", descriptor = "I")
    public static int field2500;

    @OriginalMember(owner = "client!e", name = "Uc", descriptor = "I")
    public static int field2503;

    @OriginalMember(owner = "client!e", name = "Bc", descriptor = "Lhh;")
    public class209 field2484;

    @OriginalMember(owner = "client!e", name = "Mc", descriptor = "Lna;")
    public class26 field2495;

    @OriginalMember(owner = "client!e", name = "c", descriptor = "(B)I", line = 5)
    public final int method1078(byte arg0) {
        field2496++;
        if (this.field2484 == null || this.field2484.field3238 == -1) {
            if (arg0 != 114) {
                this.method1082((byte) -22);
            }
            return super.method1078((byte) 114);
        } else {
            return class96.method720(this.field2484.field3238, arg0 + 26998).field2894;
        }
    }

    @OriginalMember(owner = "client!e", name = "b", descriptor = "(I)I", line = 35)
    public final int method1079(int arg0) {
        if (arg0 != -1) {
            this.finalize();
        }
        field2493++;
        return this.field3900;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(ILwa;)V", line = 46)
    public final void method1080(int arg0, class82 arg1) {
        arg1.field1301 = 0;
        field2487++;
        int var3 = -63 / ((36 - arg0) / 48);
        int var4 = arg1.method642((byte) -105);
        int var5 = -1;
        int var6 = var4 & 0x1;
        boolean var7 = (var4 & 0x4) != 0;
        int var8 = super.method1078((byte) 114);
        int[] var9 = new int[12];
        this.method1665((var4 >> 3 & 0x7) + 1, 2);
        this.field2479 = var4 >> 6 & 0x3;
        this.field3962 += (this.method1078((byte) 114) - var8) * 64;
        this.field3972 += (this.method1078((byte) 114) - var8) * 64;
        this.field2504 = arg1.method599(false);
        this.field2476 = arg1.method599(false);
        this.field2477 = 0;
        for (int var10 = 0; var10 < 12; var10++) {
            int var11 = arg1.method642((byte) -29);
            if (var11 == 0) {
                var9[var10] = 0;
            } else {
                int var12 = arg1.method642((byte) -109);
                int var13 = (var11 << 8) + var12;
                if (var10 == 0 && var13 == 65535) {
                    var5 = arg1.method576(1);
                    this.field2477 = arg1.method642((byte) -24);
                    break;
                }
                if (var13 >= 32768) {
                    int var14 = class196.field3039[var13 - 32768];
                    var9[var10] = class240.method1652(1073741824, var14);
                    int var15 = class45.method341(var14, (byte) 119).field3437;
                    if (var15 != 0) {
                        this.field2477 = var15;
                    }
                } else {
                    var9[var10] = class240.method1652(var13 - 256, Integer.MIN_VALUE);
                }
            }
        }
        int[] var16 = new int[5];
        for (int var17 = 0; var17 < 5; var17++) {
            int var18 = arg1.method642((byte) -94);
            if (var18 < 0 || var18 >= class316.field5408[var17].length) {
                var18 = 0;
            }
            var16[var17] = var18;
        }
        this.field3900 = arg1.method576(1);
        long var19 = arg1.method595(-99);
        this.field2495 = class153.method1042(-29664, var19).method176((byte) -50);
        this.field2481 = arg1.method642((byte) -41);
        if (var7) {
            this.field2506 = arg1.method576(1);
            this.field2488 = this.field2481;
            this.field2501 = -1;
        } else {
            this.field2506 = 0;
            this.field2488 = arg1.method642((byte) -119);
            this.field2501 = arg1.method642((byte) -116);
            if (this.field2501 == 255) {
                this.field2501 = -1;
            }
        }
        int var21 = this.field2498;
        this.field2498 = arg1.method642((byte) -87);
        if (this.field2498 == 0) {
            class104.method746(this, 8);
        } else {
            int var22 = this.field2490;
            int var23 = this.field2485;
            int var24 = this.field2505;
            int var25 = this.field2473;
            this.field2473 = arg1.method576(1);
            this.field2490 = arg1.method576(1);
            this.field2485 = arg1.method576(1);
            this.field2505 = arg1.method576(1);
            if (this.field2498 != var21 || this.field2473 != var25 || this.field2490 != var22 || this.field2485 != var23 || this.field2505 != var24) {
                class96.method716(this, -110);
            }
        }
        if (this.field2484 == null) {
            this.field2484 = new class209();
        }
        int var26 = this.field2484.field3238;
        this.field2484.method1399(var16, var5, var6 == 1, 0, var9, this.field3900);
        if (var5 != var26) {
            this.field3962 = this.field3904[0] * 128 + this.method1078((byte) 114) * 64;
            this.field3972 = this.field3890[0] * 128 + (this.method1078((byte) 114) * 64);
        }
        if (this.field3941 != null) {
            this.field3941.method128();
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(IIIIIIIIJILga;)V", line = 213)
    public final void method676(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class19 arg10) {
        field2499++;
        if (this.field2484 == null) {
            return;
        }
        class249 var13 = this.field3908 != -1 && this.field3971 == 0 ? client.method1731(this.field3908, (byte) -20) : null;
        class249 var14 = this.field3901 == -1 || this.field2497 || this.field3901 == this.method1656(false).field3751 && var13 != null ? null : client.method1731(this.field3901, (byte) -20);
        class311 var15 = this.field2484.method1403(this.field3950, this.field3913, var14, var13, this.field3942, this.field3930, -120, this.field3895, true, this.field3976, this.field3956);
        int var16 = class97.method727((byte) 123);
        if (class255.field4184 && class293.field4880 < 96 && var16 > 50) {
            class327.method2281(1);
        }
        if (class72.field1106 != 0 && var16 < 50) {
            int var17 = 50 - var16;
            while (class95.field1556 < var17) {
                class202.field3141[class95.field1556] = new byte[102400];
                class95.field1556++;
            }
            while (class95.field1556 > var17) {
                class95.field1556--;
                class202.field3141[class95.field1556] = null;
            }
        }
        if (var15 == null) {
            return;
        }
        this.field3963 = var15.method679();
        if (class319.field5471 && (this.field2484.field3238 == -1 || class96.method720(this.field2484.field3238, 27112).field2898)) {
            class311 var18 = class109.method769(160, this.field3951, var14 == null ? var13 : var14, this.field3962, 0, this.field3972, 0, 1, var15, arg0, var14 == null ? this.field3976 : this.field3956, this.field3975, 240, (byte) -49);
            if (class255.field4184) {
                float var19 = class255.method1792();
                float var20 = class255.method1779();
                class255.method1791();
                class255.method1765(var19, var20 - 150.0F);
                var18.method676(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L, arg9, (class19) null);
                class255.method1770();
                class255.method1765(var19, var20);
            } else {
                var18.method676(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L, arg9, (class19) null);
            }
        }
        if (class13.field221 == this) {
            for (int var21 = class122.field1901.length - 1; var21 >= 0; var21--) {
                class145 var22 = class122.field1901[var21];
                if (var22 != null && var22.field2207 != -1) {
                    if (var22.field2213 == 1 && var22.field2212 >= 0 && class185.field2877.length > var22.field2212) {
                        class324 var23 = class185.field2877[var22.field2212];
                        if (var23 != null) {
                            int var24 = var23.field3962 / 32 - class13.field221.field3962 / 32;
                            int var25 = var23.field3972 / 32 - (class13.field221.field3972 / 32);
                            this.method1081((class19) null, var25, var15, var24, arg5, arg9, 2047, arg0, arg7, arg4, arg3, arg1, var22.field2207, arg2, arg6);
                        }
                    }
                    if (var22.field2213 == 2) {
                        int var26 = (var22.field2208 - class12.field157) * 4 + 2 - (class13.field221.field3962 / 32);
                        int var27 = (var22.field2199 - class165.field2568) * 4 + 2 - class13.field221.field3972 / 32;
                        this.method1081((class19) null, var27, var15, var26, arg5, arg9, 2047, arg0, arg7, arg4, arg3, arg1, var22.field2207, arg2, arg6);
                    }
                    if (var22.field2213 == 10 && var22.field2212 >= 0 && class268.field4427.length > var22.field2212) {
                        class159 var28 = class268.field4427[var22.field2212];
                        if (var28 != null) {
                            int var29 = var28.field3962 / 32 - (class13.field221.field3962 / 32);
                            int var30 = var28.field3972 / 32 - (class13.field221.field3972 / 32);
                            this.method1081((class19) null, var30, var15, var29, arg5, arg9, 2047, arg0, arg7, arg4, arg3, arg1, var22.field2207, arg2, arg6);
                        }
                    }
                }
            }
        }
        this.method1661(var15, (byte) -103);
        this.method1659((byte) 110, var15, arg0);
        class311 var31 = null;
        if (!this.field2497 && this.field3986 != -1 && this.field3945 != -1) {
            class300 var32 = class236.method1582((byte) 42, this.field3986);
            var31 = var32.method2114(this.field3969, (byte) -30, this.field3945, this.field3896);
            if (var31 != null) {
                var31.method1601(0, -this.field3939, 0);
                if (var32.field5161) {
                    if (class20.field277 != 0) {
                        var31.method1644(class20.field277);
                    }
                    if (class33.field561 != 0) {
                        var31.method1597(class33.field561);
                    }
                    if (class245.field4023 != 0) {
                        var31.method1601(0, class245.field4023, 0);
                    }
                }
            }
        }
        class311 var33 = null;
        if (!this.field2497 && this.field3933 != null) {
            if (class229.field3626 >= this.field3915) {
                this.field3933 = null;
            }
            if (this.field3935 <= class229.field3626 && this.field3915 > class229.field3626) {
                if ((this.field3933 instanceof class109)) {
                    var33 = (class311) ((class109) this.field3933).method775(3);
                } else {
                    var33 = (class311) this.field3933;
                }
                var33.method1601(this.field3919 - this.field3962, -this.field3975 + this.field3955, this.field3977 - this.field3972);
                if (this.field3946 == 512) {
                    var33.method1647();
                } else if (this.field3946 == 1024) {
                    var33.method1616();
                } else if (this.field3946 == 1536) {
                    var33.method1633();
                }
            }
        }
        if (class255.field4184) {
            var15.field5333 = true;
            var15.method676(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field3941);
            if (var31 != null) {
                var31.field5333 = true;
                var31.method676(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field3941);
            }
        } else {
            if (var31 != null) {
                var15 = ((class270) var15).method1917(var31);
            }
            if (var33 != null) {
                var15 = ((class270) var15).method1917(var33);
            }
            var15.field5333 = true;
            var15.method676(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field3941);
        }
        if (var33 == null) {
            return;
        }
        if (this.field3946 == 512) {
            var33.method1633();
        } else if (this.field3946 == 1024) {
            var33.method1616();
        } else if (this.field3946 == 1536) {
            var33.method1647();
        }
        var33.method1601(this.field3962 - this.field3919, -this.field3955 + this.field3975, this.field3972 - this.field3977);
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(Lga;ILak;IIIIIIIIIIII)V", line = 460)
    private final void method1081(class19 arg0, int arg1, class311 arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14) {
        field2492++;
        int var16 = arg3 * arg3 + (arg1 * arg1);
        if (var16 < 16 || var16 > 360000) {
            return;
        }
        int var17 = (int) (Math.atan2((double) arg3, (double) arg1) * 325.949D) & arg6;
        class311 var18 = class244.method1686(true, var17, this.field3972, arg12, this.field3962, arg2, this.field3975);
        if (var18 == null) {
            return;
        }
        if (!class255.field4184) {
            var18.method676(0, arg11, arg13, arg10, arg9, arg4, arg14, arg8, -1L, arg5, arg0);
            return;
        }
        float var19 = class255.method1792();
        float var20 = class255.method1779();
        class255.method1791();
        class255.method1765(var19, var20 - 150.0F);
        var18.method676(0, arg11, arg13, arg10, arg9, arg4, arg14, arg8, -1L, arg5, arg0);
        class255.method1770();
        class255.method1765(var19, var20);
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(B)Z", line = 496)
    public final boolean method1082(byte arg0) {
        if (arg0 != 17) {
            field2475 = (int[]) null;
        }
        field2482++;
        return this.field2484 != null;
    }

    @OriginalMember(owner = "client!e", name = "e", descriptor = "(I)Lna;", line = 524)
    public final class26 method1083(int arg0) {
        class26 var2 = this.field2495;
        if (arg0 != 0) {
            this.method676(-63, 126, 58, -9, -74, -119, -45, -114, -62L, -76, (class19) null);
        }
        field2494++;
        if (class214.field3330 != null) {
            var2 = class236.method1587(new class26[] { class214.field3330[this.field2479], var2 }, (byte) -92);
        }
        if (class262.field4280 != null) {
            var2 = class236.method1587(new class26[] { var2, class262.field4280[this.field2479] }, (byte) -128);
        }
        return var2;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(IIIII)V", line = 549)
    public final void method675(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2491++;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(BIZI)V", line = 566)
    public final void method1084(byte arg0, int arg1, boolean arg2, int arg3) {
        super.method1657(arg0 - 128, this.method1078((byte) 114), arg1, arg3, arg2);
        if (arg0 != 126) {
            field2486 = (class26) null;
        }
        field2503++;
    }

    @OriginalMember(owner = "client!e", name = "finalize", descriptor = "()V", line = 586)
    protected final void finalize() {
        field2500++;
    }

    @OriginalMember(owner = "client!e", name = "d", descriptor = "(B)V", line = 598)
    public static void method1085(byte arg0) {
        field2502 = null;
        field2478 = null;
        field2472 = null;
        field2483 = null;
        field2480 = null;
        if (arg0 <= 116) {
            method1085((byte) -48);
        }
        field2475 = null;
        field2486 = null;
    }

    @OriginalMember(owner = "client!e", name = "b", descriptor = "()I", line = 645)
    public final int method679() {
        field2489++;
        return this.field3963;
    }
}
