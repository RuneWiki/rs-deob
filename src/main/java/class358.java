import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!un")
public class class358 extends class52 {

    @OriginalMember(owner = "client!un", name = "e", descriptor = "I")
    private int field4698 = 0;

    @OriginalMember(owner = "client!un", name = "i", descriptor = "I")
    private int field4702 = 0;

    @OriginalMember(owner = "client!un", name = "p", descriptor = "I")
    private int field4709 = 0;

    @OriginalMember(owner = "client!un", name = "k", descriptor = "I")
    private int field4704 = 0;

    @OriginalMember(owner = "client!un", name = "u", descriptor = "Z")
    private boolean field4714 = false;

    @OriginalMember(owner = "client!un", name = "B", descriptor = "I")
    private int field4721;

    @OriginalMember(owner = "client!un", name = "t", descriptor = "Lbda;")
    private class428 field4713;

    @OriginalMember(owner = "client!un", name = "w", descriptor = "I")
    private int field4716;

    @OriginalMember(owner = "client!un", name = "q", descriptor = "Leea;")
    private class112 field4710;

    @OriginalMember(owner = "client!un", name = "z", descriptor = "Z")
    private boolean field4719;

    @OriginalMember(owner = "client!un", name = "c", descriptor = "Z")
    private boolean field4696;

    @OriginalMember(owner = "client!un", name = "v", descriptor = "Z")
    private boolean field4715;

    @OriginalMember(owner = "client!un", name = "m", descriptor = "Z")
    private boolean field4706;

    @OriginalMember(owner = "client!un", name = "n", descriptor = "Lvj;")
    public static class373 field4707 = new class373(84, 28);

    @OriginalMember(owner = "client!un", name = "a", descriptor = "I")
    public static int field4694;

    @OriginalMember(owner = "client!un", name = "b", descriptor = "I")
    public static int field4695;

    @OriginalMember(owner = "client!un", name = "d", descriptor = "I")
    public static int field4697;

    @OriginalMember(owner = "client!un", name = "f", descriptor = "I")
    public static int field4699;

    @OriginalMember(owner = "client!un", name = "g", descriptor = "I")
    public static int field4700;

    @OriginalMember(owner = "client!un", name = "h", descriptor = "I")
    public static int field4701;

    @OriginalMember(owner = "client!un", name = "j", descriptor = "I")
    public static int field4703;

    @OriginalMember(owner = "client!un", name = "l", descriptor = "I")
    public static int field4705;

    @OriginalMember(owner = "client!un", name = "o", descriptor = "I")
    public static int field4708;

    @OriginalMember(owner = "client!un", name = "r", descriptor = "I")
    public static int field4711;

    @OriginalMember(owner = "client!un", name = "s", descriptor = "I")
    public static int field4712;

    @OriginalMember(owner = "client!un", name = "y", descriptor = "I")
    public static int field4718;

    @OriginalMember(owner = "client!un", name = "A", descriptor = "I")
    public static int field4720;

    @OriginalMember(owner = "client!un", name = "C", descriptor = "I")
    public static int field4722;

    @OriginalMember(owner = "client!un", name = "D", descriptor = "I")
    public static int field4723;

    @OriginalMember(owner = "client!un", name = "E", descriptor = "I")
    public static int field4724;

    @OriginalMember(owner = "client!un", name = "F", descriptor = "I")
    public static int field4725;

    @OriginalMember(owner = "client!un", name = "x", descriptor = "[[B")
    public static byte[][] field4717;

    @OriginalMember(owner = "client!un", name = "KA", descriptor = "(IIII)V", line = 4)
    public final void method297(int arg0, int arg1, int arg2, int arg3) {
        this.field4698 = arg3;
        this.field4702 = arg2;
        this.field4704 = arg0;
        field4701++;
        this.field4709 = arg1;
        this.field4714 = this.field4704 != 0 || this.field4709 != 0 || this.field4702 != 0 || this.field4698 != 0;
    }

    @OriginalMember(owner = "client!un", name = "DA", descriptor = "(IIIII)V", line = 18)
    public final void method3(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field4718++;
        class335 var6 = this.field4713.method2471((byte) 125);
        class335 var7 = this.field4713.method2479((byte) 89);
        int var8 = this.field4704 + arg0;
        int var9 = this.field4709 + arg1;
        this.field4710.method1272(13027, class116.field1453);
        this.field4713.method2416((byte) 109);
        this.field4713.method2459(83, this.field4710);
        this.field4713.method2405(arg4, -18001);
        this.field4713.method2437(arg2, -3);
        this.field4713.method2435(1, 83, class264.field3445);
        this.field4713.method2465(class264.field3445, -14787, 1);
        this.field4713.method2434(-16, arg3);
        var6.method1878((float) this.field4721, (byte) -75, 0.0F, (float) this.field4716);
        var6.method655(var8, var9, 0);
        var7.method1878(this.field4710.method646((float) this.field4721, false), (byte) -52, 1.0F, this.field4710.method652((byte) -127, (float) this.field4716));
        this.field4713.method2431((byte) -79, class187.field2256);
        this.field4713.method2457((byte) 115);
        this.field4713.method2427((byte) -21);
        this.field4713.method2447(true);
        this.field4713.method2435(1, 123, class99.field1226);
        this.field4713.method2465(class99.field1226, -14787, 1);
    }

    @OriginalMember(owner = "client!un", name = "i", descriptor = "(IIIIIII)V", line = 48)
    public final void method296(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field4708++;
        class335 var8 = this.field4713.method2471((byte) 123);
        class335 var9 = this.field4713.method2479((byte) -100);
        this.field4710.method1272(13027, class116.field1453);
        this.field4713.method2416((byte) -112);
        this.field4713.method2459(116, this.field4710);
        this.field4713.method2405(arg6, -18001);
        this.field4713.method2437(arg4, -3);
        this.field4713.method2435(1, 22, class264.field3445);
        this.field4713.method2465(class264.field3445, -14787, 1);
        this.field4713.method2434(-99, arg5);
        boolean var10 = this.field4706 && this.field4709 == 0 && this.field4698 == 0;
        boolean var11 = this.field4715 && this.field4704 == 0 && this.field4702 == 0;
        if (var10 & var11) {
            var9.method1878(this.field4710.method646((float) arg3, false), (byte) -127, 1.0F, this.field4710.method652((byte) -127, (float) arg2));
            var8.method1878((float) arg3, (byte) -62, 0.0F, (float) arg2);
            var8.method655(arg0, arg1, 0);
            this.field4713.method2431((byte) -128, class187.field2256);
            this.field4713.method2457((byte) -125);
            this.field4713.method2427((byte) -9);
        } else if (var11) {
            int var12 = arg1 + arg3;
            int var13 = this.method286();
            var9.method1878(this.field4710.method646((float) this.field4721, false), (byte) -20, 1.0F, this.field4710.method652((byte) -128, (float) arg2));
            this.field4713.method2431((byte) -127, class187.field2256);
            int var14 = this.field4709 + arg1;
            for (int var15 = var14 + this.field4721; var15 <= var12; var15 += var13) {
                var8.method1878((float) this.field4721, (byte) -66, 0.0F, (float) arg2);
                var8.method655(arg0, var14, 0);
                this.field4713.method2457((byte) -95);
                var14 += var13;
                this.field4713.method2427((byte) -16);
            }
            if (var14 < var12) {
                int var16 = var12 - var14;
                var9.method1878(this.field4710.method646((float) var16, false), (byte) -69, 1.0F, this.field4710.method652((byte) -128, (float) arg2));
                this.field4713.method2431((byte) -80, class187.field2256);
                var8.method1878((float) var16, (byte) -57, 0.0F, (float) arg2);
                var8.method655(arg0, var14, 0);
                this.field4713.method2457((byte) 100);
                this.field4713.method2427((byte) -102);
            }
        } else if (var10) {
            int var17 = arg0 + arg2;
            int var18 = this.method292();
            var9.method1878(this.field4710.method646((float) arg3, false), (byte) -40, 1.0F, this.field4710.method652((byte) -128, (float) this.field4716));
            this.field4713.method2431((byte) -71, class187.field2256);
            int var19 = this.field4704 + arg0;
            int var20 = var19 + this.field4716;
            while (var17 >= var20) {
                var8.method1878((float) arg3, (byte) -19, 0.0F, (float) this.field4716);
                var8.method655(var19, arg1, 0);
                this.field4713.method2457((byte) -113);
                this.field4713.method2427((byte) -102);
                var20 += var18;
                var19 += var18;
            }
            if (var19 < var17) {
                int var21 = var17 - var19;
                var9.method1878(this.field4710.method646((float) arg3, false), (byte) -33, 1.0F, this.field4710.method652((byte) -127, (float) var21));
                this.field4713.method2431((byte) -122, class187.field2256);
                var8.method1878((float) arg3, (byte) -18, 0.0F, (float) var21);
                var8.method655(var19, arg1, 0);
                this.field4713.method2457((byte) 102);
                this.field4713.method2427((byte) -125);
            }
        } else {
            int var22 = arg1 + arg3;
            int var23 = arg0 + arg2;
            int var24 = this.method292();
            int var25 = this.method286();
            int var26 = this.field4709 + arg1;
            for (int var27 = this.field4721 + var26; var27 <= var22; var27 += var25) {
                var9.method1878(this.field4710.method646((float) this.field4721, false), (byte) -105, 1.0F, this.field4710.method652((byte) -128, (float) this.field4716));
                this.field4713.method2431((byte) -101, class187.field2256);
                int var32 = this.field4704 + arg0;
                int var33 = var32 + this.field4716;
                while (var33 <= var23) {
                    var8.method1878((float) this.field4721, (byte) -79, 0.0F, (float) this.field4716);
                    var8.method655(var32, var26, 0);
                    this.field4713.method2457((byte) -40);
                    var32 += var24;
                    var33 += var24;
                    this.field4713.method2427((byte) -112);
                }
                if (var23 > var32) {
                    int var34 = var23 - var32;
                    var9.method1878(this.field4710.method646((float) this.field4721, false), (byte) -40, 1.0F, this.field4710.method652((byte) -128, (float) var34));
                    this.field4713.method2431((byte) -88, class187.field2256);
                    var8.method1878((float) this.field4721, (byte) -21, 0.0F, (float) var34);
                    var8.method655(var32, var26, 0);
                    this.field4713.method2457((byte) -121);
                    this.field4713.method2427((byte) -61);
                }
                var26 += var25;
            }
            if (var26 < var22) {
                int var28 = var22 - var26;
                var9.method1878(this.field4710.method646((float) var28, false), (byte) -81, 1.0F, this.field4710.method652((byte) -127, (float) this.field4716));
                this.field4713.method2431((byte) -70, class187.field2256);
                int var29 = arg0 + this.field4704;
                for (int var30 = this.field4716 + var29; var30 <= var23; var30 += var24) {
                    var8.method1878((float) var28, (byte) -52, 0.0F, (float) this.field4716);
                    var8.method655(var29, var26, 0);
                    this.field4713.method2457((byte) 103);
                    this.field4713.method2427((byte) -11);
                    var29 += var24;
                }
                if (var29 < var23) {
                    int var31 = var23 - var29;
                    var9.method1878(this.field4710.method646((float) var28, false), (byte) -76, 1.0F, this.field4710.method652((byte) -127, (float) var31));
                    this.field4713.method2431((byte) -91, class187.field2256);
                    var8.method1878((float) var28, (byte) -32, 0.0F, (float) var31);
                    var8.method655(var29, var26, 0);
                    this.field4713.method2457((byte) 108);
                    this.field4713.method2427((byte) -9);
                }
            }
        }
        this.field4713.method2447(true);
        this.field4713.method2435(1, 92, class99.field1226);
        this.field4713.method2465(class99.field1226, -14787, 1);
    }

    @OriginalMember(owner = "client!un", name = "ma", descriptor = "()I", line = 255)
    public final int method286() {
        field4697++;
        return this.field4721 + this.field4698 + this.field4709;
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(III)Z", line = 265)
    public static final boolean method2012(int arg0, int arg1, int arg2) {
        if (arg0 != 1) {
            field4717 = null;
        }
        field4699++;
        return (arg2 & 0x800) != 0;
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(I)V", line = 276)
    public static void method2013(int arg0) {
        field4707 = null;
        if (arg0 != 0) {
            field4707 = null;
        }
        field4717 = null;
    }

    @OriginalMember(owner = "client!un", name = "<init>", descriptor = "(Lbda;IIZ)V", line = 657)
    public class358(class428 arg0, int arg1, int arg2, boolean arg3) {
        this.field4721 = arg2;
        this.field4713 = arg0;
        this.field4716 = arg1;
        this.field4710 = arg0.method1839(arg2, arg1, arg3 ? class10.field80 : class147.field1765, true, class160.field1932);
        this.field4719 = arg1 != this.field4710.method649((byte) -115);
        this.field4696 = arg2 != this.field4710.method648((byte) -118);
        this.field4715 = !this.field4719 && this.field4710.method653(11267);
        this.field4706 = !this.field4696 && this.field4710.method653(11267);
    }

    @OriginalMember(owner = "client!un", name = "<init>", descriptor = "(Lbda;II[III)V", line = 671)
    public class358(class428 arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5) {
        this.field4721 = arg2;
        this.field4713 = arg0;
        this.field4716 = arg1;
        this.field4710 = arg0.method1794(0, false, arg2, arg3, arg5, arg1, arg4);
        this.field4719 = this.field4710.method649((byte) -120) != arg1;
        this.field4696 = arg2 != this.field4710.method648((byte) -118);
        this.field4715 = !this.field4719 && this.field4710.method653(11267);
        this.field4706 = !this.field4696 && this.field4710.method653(11267);
    }

    @OriginalMember(owner = "client!un", name = "P", descriptor = "(IIIIII)V", line = 293)
    public final void method4(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field4705++;
        int[] var7 = this.field4713.method1111(arg4, arg5, arg2, arg3);
        if (var7 != null) {
            for (int var8 = 0; var8 < var7.length; var8++) {
                var7[var8] = class42.method223(var7[var8], -16777216);
            }
            this.method2016(arg0, arg1, arg2, arg3, var7, 0, arg2);
        }
    }

    @OriginalMember(owner = "client!un", name = "BA", descriptor = "(III)V", line = 319)
    public final void method5(int arg0, int arg1, int arg2) {
        field4720++;
    }

    @OriginalMember(owner = "client!un", name = "EA", descriptor = "()I", line = 326)
    public final int method292() {
        field4723++;
        return this.field4704 + this.field4702 + this.field4716;
    }

    @OriginalMember(owner = "client!un", name = "CA", descriptor = "(FFFFFFIII)V", line = 340)
    public final void method285(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8) {
        field4711++;
        class335 var10 = this.field4713.method2471((byte) 127);
        class335 var11 = this.field4713.method2479((byte) 107);
        this.field4710.method1272(13027, this.field4719 || this.field4696 ? class116.field1453 : class178.field2158);
        this.field4713.method2416((byte) -110);
        this.field4713.method2459(106, this.field4710);
        this.field4713.method2405(arg8, -18001);
        this.field4713.method2437(arg6, -3);
        this.field4713.method2435(1, 102, class264.field3445);
        this.field4713.method2465(class264.field3445, -14787, 1);
        this.field4713.method2434(-67, arg7);
        if (this.field4714) {
            float var12 = (float) this.method292();
            float var13 = (float) this.method286();
            float var14 = (arg2 - arg0) / var12;
            float var15 = (arg3 - arg1) / var12;
            float var16 = (arg4 - arg0) / var13;
            float var17 = (arg5 - arg1) / var13;
            float var18 = (float) this.field4709 * var16;
            float var19 = (float) this.field4709 * var17;
            float var20 = (float) this.field4704 * var14;
            float var21 = (float) this.field4704 * var15;
            float var22 = (float) this.field4702 * -var14;
            float var23 = (float) this.field4702 * -var15;
            float var24 = (float) this.field4698 * -var16;
            arg4 = arg4 + var20 + var24;
            arg3 = arg3 + var23 + var19;
            arg2 = arg2 + var22 + var18;
            arg1 = arg1 + var21 + var19;
            arg0 = arg0 + var20 + var18;
            float var25 = (float) this.field4698 * -var17;
            arg5 = arg5 + var21 + var25;
        }
        var10.method1887(0.0F, arg5 - arg1, (byte) 8, arg2 - arg0, 0.0F, arg4 - arg0, 1.0F, 0.0F, arg3 - arg1, 0.0F);
        var10.method1881((byte) 3, arg0, 0.0F, arg1);
        var11.method1878(this.field4710.method646((float) this.field4721, false), (byte) -84, 1.0F, this.field4710.method652((byte) -128, (float) this.field4716));
        this.field4713.method2431((byte) -67, class187.field2256);
        this.field4713.method2457((byte) 114);
        this.field4713.method2427((byte) -45);
        this.field4713.method2447(true);
        this.field4713.method2435(1, 75, class99.field1226);
        this.field4713.method2465(class99.field1226, -14787, 1);
    }

    @OriginalMember(owner = "client!un", name = "ra", descriptor = "(IIIIIII)V", line = 407)
    public final void method6(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field4695++;
        class335 var8 = this.field4713.method2471((byte) 123);
        class335 var9 = this.field4713.method2479((byte) -119);
        this.field4710.method1272(13027, this.field4719 || this.field4696 ? class116.field1453 : class178.field2158);
        this.field4713.method2416((byte) 52);
        this.field4713.method2459(81, this.field4710);
        this.field4713.method2405(arg6, -18001);
        this.field4713.method2437(arg4, -3);
        this.field4713.method2435(1, 103, class264.field3445);
        this.field4713.method2465(class264.field3445, -14787, 1);
        this.field4713.method2434(-72, arg5);
        var9.method1878(this.field4710.method646((float) this.field4721, false), (byte) -122, 1.0F, this.field4710.method652((byte) -128, (float) this.field4716));
        if (this.field4714) {
            arg2 = this.field4716 * arg2 / this.method292();
            arg3 = this.field4721 * arg3 / this.method286();
            arg0 += this.field4704 * arg2 / this.field4716;
            arg1 += this.field4709 * arg3 / this.field4721;
        }
        var8.method1878((float) arg3, (byte) -22, 0.0F, (float) arg2);
        var8.method655(arg0, arg1, 0);
        this.field4713.method2431((byte) -78, class187.field2256);
        this.field4713.method2457((byte) 120);
        this.field4713.method2427((byte) -120);
        this.field4713.method2447(true);
        this.field4713.method2435(1, 97, class99.field1226);
        this.field4713.method2465(class99.field1226, -14787, 1);
    }

    @OriginalMember(owner = "client!un", name = "c", descriptor = "()I", line = 449)
    public final int method291() {
        field4703++;
        return this.field4716;
    }

    @OriginalMember(owner = "client!un", name = "la", descriptor = "()I", line = 460)
    public final int method290() {
        field4712++;
        return this.field4721;
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(IB)Z", line = 468)
    public static final boolean method2014(int arg0, byte arg1) {
        field4694++;
        if (arg1 != -6) {
            method2013(-69);
        }
        return arg0 == 0 || arg0 == 1;
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(IIIFIBI[FII)V", line = 483)
    public static final void method2015(int arg0, int arg1, int arg2, float arg3, int arg4, byte arg5, int arg6, float[] arg7, int arg8, int arg9) {
        int var10 = arg6 - arg2;
        field4700++;
        int var11 = 100 % ((arg5 - 68) / 53);
        int var12 = arg4 - arg1;
        int var13 = arg9 - arg8;
        float var14 = arg7[2] * (float) var12 + arg7[0] * (float) var10 + arg7[1] * (float) var13;
        float var15 = arg7[5] * (float) var12 + arg7[4] * (float) var13 + arg7[3] * (float) var10;
        float var16 = arg7[8] * (float) var12 + arg7[6] * (float) var10 + arg7[7] * (float) var13;
        float var17 = (float) Math.sqrt((double) (var16 * var16 + var14 * var14 + var15 * var15));
        float var18 = (float) Math.atan2((double) var14, (double) var16) / 6.2831855F + 0.5F;
        float var19 = arg3 + (float) Math.asin((double) (var15 / var17)) / 3.1415927F + 0.5F;
        if (arg0 == 1) {
            float var21 = var18;
            var18 = -var19;
            var19 = var21;
        } else if (arg0 == 2) {
            var18 = -var18;
            var19 = -var19;
        } else if (arg0 == 3) {
            float var20 = var18;
            var18 = var19;
            var19 = -var20;
        }
        class614.field8904 = var19;
        class290.field3769 = var18;
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(IIII[III)V", line = 541)
    private final void method2016(int arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5, int arg6) {
        this.field4710.method651(arg4, arg5, arg2, arg0, arg6, 5826, arg3, arg1);
        field4725++;
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(FFFFFFLpa;II)V", line = 554)
    public final void method298(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class309 arg6, int arg7, int arg8) {
        field4722++;
        class335 var10 = this.field4713.method2471((byte) 120);
        class335 var11 = this.field4713.method2479((byte) -92);
        class204 var12 = (class204) arg6;
        class112 var13 = var12.field2441;
        this.field4710.method1272(13027, class178.field2158);
        this.field4713.method2416((byte) 94);
        this.field4713.method2459(105, this.field4710);
        this.field4713.method2405(1, -18001);
        this.field4713.method2437(1, -3);
        if (this.field4714) {
            float var14 = (float) this.field4716 / (float) this.method292();
            float var15 = (float) this.field4721 / (float) this.method286();
            var10.method1887(0.0F, (arg5 - arg1) * var15, (byte) 8, (arg2 - arg0) * var14, 0.0F, (arg4 - arg0) * var15, 1.0F, 0.0F, (arg3 - arg1) * var14, 0.0F);
            var10.method1881((byte) 3, ((float) this.field4704 + arg0) * var14, 0.0F, ((float) this.field4709 + arg1) * var15);
        } else {
            var10.method1887(0.0F, arg5 - arg1, (byte) 8, arg2 - arg0, 0.0F, arg4 - arg0, 1.0F, 0.0F, arg3 - arg1, 0.0F);
            var10.method1881((byte) 3, arg0, 0.0F, arg1);
        }
        var11.method1878(this.field4710.method646((float) this.field4721, false), (byte) -20, 1.0F, this.field4710.method652((byte) -128, (float) this.field4716));
        this.field4713.method2431((byte) -99, class187.field2256);
        this.field4713.method2472(true, 1);
        this.field4713.method2459(86, var13);
        this.field4713.method2429(class564.field8287, class2.field7, 20);
        this.field4713.method2435(0, 63, class99.field1226);
        class335 var16 = this.field4713.method2479((byte) -11);
        var16.method676(var10);
        var16.method655(-arg7, -arg8, 0);
        var16.method1889(1.0F, var13.method646(1.0F, false), 4425, var13.method652((byte) -128, 1.0F));
        this.field4713.method2431((byte) -103, class187.field2256);
        this.field4713.method2457((byte) 102);
        this.field4713.method2427((byte) -57);
        this.field4713.method2447(true);
        this.field4713.method2435(0, 122, class289.field3751);
        this.field4713.method2429(class564.field8287, class564.field8287, 82);
        this.field4713.method2459(105, null);
        this.field4713.method2472(true, 0);
        this.field4713.method2447(true);
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(IILpa;II)V", line = 609)
    public final void method7(int arg0, int arg1, class309 arg2, int arg3, int arg4) {
        field4724++;
        class204 var6 = (class204) arg2;
        int var7 = this.field4704 + arg0;
        class112 var8 = var6.field2441;
        int var9 = this.field4709 + arg1;
        this.field4710.method1272(13027, class116.field1453);
        this.field4713.method2416((byte) 76);
        this.field4713.method2459(93, this.field4710);
        this.field4713.method2405(1, -18001);
        this.field4713.method2437(1, -3);
        class335 var10 = this.field4713.method2471((byte) 121);
        var10.method1878((float) this.field4721, (byte) -48, 0.0F, (float) this.field4716);
        var10.method655(var7, var9, 0);
        this.field4713.method2457((byte) -65);
        class335 var11 = this.field4713.method2479((byte) -97);
        var11.method1878(this.field4710.method646((float) this.field4721, false), (byte) -54, 1.0F, this.field4710.method652((byte) -128, (float) this.field4716));
        this.field4713.method2431((byte) -88, class187.field2256);
        this.field4713.method2472(true, 1);
        this.field4713.method2459(76, var8);
        this.field4713.method2429(class564.field8287, class2.field7, 22);
        this.field4713.method2435(0, 76, class99.field1226);
        class335 var12 = this.field4713.method2479((byte) -47);
        var12.method1878(var8.method646((float) this.field4721, false), (byte) -106, 1.0F, var8.method652((byte) -127, (float) this.field4716));
        var12.method1881((byte) 3, var8.method652((byte) -128, (float) (var7 - arg3)), 0.0F, var8.method646((float) (var9 - arg4), false));
        this.field4713.method2431((byte) -78, class187.field2256);
        this.field4713.method2427((byte) -39);
        this.field4713.method2447(true);
        this.field4713.method2435(0, 40, class289.field3751);
        this.field4713.method2429(class564.field8287, class564.field8287, 85);
        this.field4713.method2459(109, null);
        this.field4713.method2472(true, 0);
        this.field4713.method2447(true);
    }
}
