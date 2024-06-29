import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fj")
public class class241 extends class256 {

    @OriginalMember(owner = "client!fj", name = "Cc", descriptor = "I")
    public int field3416 = 0;

    @OriginalMember(owner = "client!fj", name = "Ac", descriptor = "I")
    public int field3414 = 0;

    @OriginalMember(owner = "client!fj", name = "Kc", descriptor = "I")
    public int field3424 = -1;

    @OriginalMember(owner = "client!fj", name = "xc", descriptor = "I")
    public int field3411 = -1;

    @OriginalMember(owner = "client!fj", name = "vc", descriptor = "I")
    public int field3409 = -1;

    @OriginalMember(owner = "client!fj", name = "Tc", descriptor = "I")
    public int field3433 = 0;

    @OriginalMember(owner = "client!fj", name = "Xc", descriptor = "I")
    public int field3437 = -1;

    @OriginalMember(owner = "client!fj", name = "Wc", descriptor = "I")
    public int field3436 = 255;

    @OriginalMember(owner = "client!fj", name = "zc", descriptor = "I")
    public int field3413 = 0;

    @OriginalMember(owner = "client!fj", name = "ed", descriptor = "B")
    private byte field3444 = 0;

    @OriginalMember(owner = "client!fj", name = "dd", descriptor = "I")
    public int field3443 = -1;

    @OriginalMember(owner = "client!fj", name = "gd", descriptor = "Z")
    public boolean field3446 = false;

    @OriginalMember(owner = "client!fj", name = "ad", descriptor = "I")
    public int field3440 = -1;

    @OriginalMember(owner = "client!fj", name = "fd", descriptor = "I")
    public int field3445 = 0;

    @OriginalMember(owner = "client!fj", name = "Rc", descriptor = "I")
    public int field3431 = -1;

    @OriginalMember(owner = "client!fj", name = "wc", descriptor = "Ljava/lang/String;")
    public static String field3410 = "glow2:";

    @OriginalMember(owner = "client!fj", name = "Bc", descriptor = "Ljava/lang/String;")
    public static String field3415 = "Take";

    @OriginalMember(owner = "client!fj", name = "yc", descriptor = "I")
    public static int field3412;

    @OriginalMember(owner = "client!fj", name = "Dc", descriptor = "I")
    public static int field3417;

    @OriginalMember(owner = "client!fj", name = "Ec", descriptor = "I")
    public static int field3418;

    @OriginalMember(owner = "client!fj", name = "Gc", descriptor = "I")
    public static int field3420;

    @OriginalMember(owner = "client!fj", name = "Hc", descriptor = "I")
    public static int field3421;

    @OriginalMember(owner = "client!fj", name = "Jc", descriptor = "I")
    public static int field3423;

    @OriginalMember(owner = "client!fj", name = "Lc", descriptor = "I")
    public static int field3425;

    @OriginalMember(owner = "client!fj", name = "Mc", descriptor = "I")
    public static int field3426;

    @OriginalMember(owner = "client!fj", name = "Nc", descriptor = "I")
    public static int field3427;

    @OriginalMember(owner = "client!fj", name = "Oc", descriptor = "I")
    public static int field3428;

    @OriginalMember(owner = "client!fj", name = "Pc", descriptor = "I")
    public static int field3429;

    @OriginalMember(owner = "client!fj", name = "Qc", descriptor = "I")
    public static int field3430;

    @OriginalMember(owner = "client!fj", name = "Sc", descriptor = "I")
    public static int field3432;

    @OriginalMember(owner = "client!fj", name = "Uc", descriptor = "I")
    public static int field3434;

    @OriginalMember(owner = "client!fj", name = "Vc", descriptor = "I")
    public static int field3435;

    @OriginalMember(owner = "client!fj", name = "bd", descriptor = "I")
    public static int field3441;

    @OriginalMember(owner = "client!fj", name = "cd", descriptor = "I")
    public static int field3442;

    @OriginalMember(owner = "client!fj", name = "Yc", descriptor = "Lpn;")
    public static class170 field3438;

    @OriginalMember(owner = "client!fj", name = "Ic", descriptor = "Llb;")
    public class64 field3422;

    @OriginalMember(owner = "client!fj", name = "Zc", descriptor = "Ljava/lang/String;")
    public String field3439;

    @OriginalMember(owner = "client!fj", name = "Fc", descriptor = "[[Lin;")
    public static class344[][] field3419;

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(Lcg;I)V", line = 11)
    public final void method1644(class316 arg0, int arg1) {
        arg0.field4777 = 0;
        int var3 = arg0.method2219(arg1 ^ 0xFFFFCE56);
        int var4 = var3 & 0x1;
        field3427++;
        boolean var5 = (var3 & 0x4) != 0;
        int var6 = -1;
        if (arg1 != -29162) {
            method1649(35, (byte) 90, 41, -20, 29);
        }
        int var7 = super.method1653(-1);
        int[] var8 = new int[12];
        this.method1756((var3 >> 3 & 0x7) + 1, (byte) 66);
        this.field3444 = (byte) ((var3 & 0xF3) >> 6);
        this.field3745 += (this.method1653(arg1 + 29161) - var7) * 64;
        this.field3679 += (this.method1653(-1) - var7) * 64;
        this.field3411 = arg0.method2192(3);
        this.field3431 = arg0.method2192(3);
        this.field3445 = 0;
        for (int var9 = 0; var9 < 12; var9++) {
            int var10 = arg0.method2219(arg1 + 45610);
            if (var10 == 0) {
                var8[var9] = 0;
            } else {
                int var11 = arg0.method2219(arg1 + 45610);
                int var12 = (var10 << 8) + var11;
                if (var9 == 0 && var12 == 65535) {
                    var6 = arg0.method2220((byte) 115);
                    this.field3445 = arg0.method2219(16448);
                    break;
                }
                if (var12 < 32768) {
                    var8[var9] = class190.method1334(var12 - 256, Integer.MIN_VALUE);
                } else {
                    int var13 = class217.field3099[var12 - 32768];
                    var8[var9] = class190.method1334(1073741824, var13);
                    int var14 = class115.method854((byte) -116, var13).field2795;
                    if (var14 != 0) {
                        this.field3445 = var14;
                    }
                }
            }
        }
        int[] var15 = new int[5];
        for (int var16 = 0; var16 < 5; var16++) {
            int var17 = arg0.method2219(16448);
            if (var17 < 0 || var17 >= class194.field2694[var16].length) {
                var17 = 0;
            }
            var15[var16] = var17;
        }
        this.field3738 = arg0.method2220((byte) 54);
        long var18 = arg0.method2175(false);
        this.field3439 = class256.method1746(var18, 0);
        this.field3416 = arg0.method2219(16448);
        if (var5) {
            this.field3413 = arg0.method2220((byte) 93);
            this.field3437 = -1;
            this.field3433 = this.field3416;
        } else {
            this.field3413 = 0;
            this.field3433 = arg0.method2219(arg1 ^ 0xFFFFCE56);
            this.field3437 = arg0.method2219(16448);
            if (this.field3437 == 255) {
                this.field3437 = -1;
            }
        }
        int var20 = this.field3414;
        this.field3414 = arg0.method2219(arg1 ^ 0xFFFFCE56);
        if (this.field3414 == 0) {
            class157.method1137(true, this);
        } else {
            int var21 = this.field3440;
            int var22 = this.field3443;
            int var23 = this.field3424;
            int var24 = this.field3409;
            int var25 = this.field3436;
            this.field3443 = arg0.method2220((byte) 46);
            this.field3440 = arg0.method2220((byte) 117);
            this.field3424 = arg0.method2220((byte) 61);
            this.field3409 = arg0.method2220((byte) 96);
            this.field3436 = arg0.method2219(16448);
            if (this.field3414 != var20 || this.field3443 != var22 || this.field3440 != var21 || this.field3424 != var23 || this.field3409 != var24 || this.field3436 != var25) {
                class209.method1470(this, 0);
            }
        }
        if (this.field3422 == null) {
            this.field3422 = new class64();
        }
        int var26 = this.field3422.field849;
        this.field3422.method436(var6, arg1 ^ 0xFFFF800C, var15, var8, this.field3738, var4 == 1);
        if (var6 != var26) {
            this.field3745 = this.field3706[0] * 128 + this.method1653(-1) * 64;
            this.field3679 = this.field3768[0] * 128 + this.method1653(arg1 + 29161) * 64;
        }
        if (this.field3720 != null) {
            this.field3720.method1801();
        }
    }

    @OriginalMember(owner = "client!fj", name = "finalize", descriptor = "()V", line = 173)
    protected final void finalize() {
        field3442++;
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(IIZI)V", line = 184)
    public final void method1645(int arg0, int arg1, boolean arg2, int arg3) {
        if (arg3 < -7) {
            super.method1757(true, this.method1653(-1), arg1, arg2, arg0);
            field3417++;
        }
    }

    @OriginalMember(owner = "client!fj", name = "c", descriptor = "(I)I", line = 198)
    public final int method1646(int arg0) {
        if (arg0 <= 87) {
            this.field3436 = -56;
        }
        field3425++;
        return this.field3738;
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(ILw;Lw;)V", line = 209)
    public static final void method1647(int arg0, class36 arg1, class36 arg2) {
        if (arg2.field415 != null) {
            arg2.method206(-1);
        }
        if (arg0 != 0) {
            method1651(-96, true, -36, (class125) null, -88, -83);
        }
        arg2.field415 = arg1;
        arg2.field413 = arg1.field413;
        field3434++;
        arg2.field415.field413 = arg2;
        arg2.field413.field415 = arg2;
    }

    @OriginalMember(owner = "client!fj", name = "h", descriptor = "(I)V", line = 227)
    public static void method1648(int arg0) {
        field3419 = (class344[][]) null;
        field3415 = null;
        if (arg0 == 0) {
            field3410 = null;
            field3438 = null;
        }
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(IBIII)V", line = 240)
    public static final void method1649(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        field3430++;
        class113 var5 = (class113) class255.field3648.method111(24, (long) arg3);
        if (var5 == null) {
            var5 = new class113();
            class255.field3648.method120((long) arg3, var5, -22851);
        }
        if (var5.field1541.length <= arg2) {
            int[] var6 = new int[arg2 + 1];
            int[] var7 = new int[arg2 + 1];
            for (int var8 = 0; var8 < var5.field1541.length; var8++) {
                var6[var8] = var5.field1541[var8];
                var7[var8] = var5.field1546[var8];
            }
            for (int var9 = var5.field1541.length; var9 < arg2; var9++) {
                var6[var9] = -1;
                var7[var9] = 0;
            }
            var5.field1541 = var6;
            var5.field1546 = var7;
        }
        var5.field1541[arg2] = arg4;
        if (arg1 == 114) {
            var5.field1546[arg2] = arg0;
        }
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(IILsa;IIIIILq;IIIIIII)V", line = 294)
    private final void method1650(int arg0, int arg1, class265 arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class345 arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15) {
        field3426++;
        int var17 = arg1 * arg1 + arg7 * arg7;
        if (var17 < 16 || arg3 < var17) {
            return;
        }
        int var18 = (int) (Math.atan2((double) arg1, (double) arg7) * 325.949D) & 0x7FF;
        if (arg5 != 32) {
            this.method1645(116, -43, false, 122);
        }
        class345 var19 = class294.method2007(this.field3761, 16, this.field3745, this.field3679, arg13, arg8, var18);
        if (var19 == null) {
            return;
        }
        if (!class67.field908) {
            var19.method108(0, arg11, arg6, arg10, arg0, arg15, arg14, arg4, -1L, arg9, arg2);
            return;
        }
        float var20 = class67.method470();
        float var21 = class67.method485();
        class67.method475();
        class67.method491(var20, var21 - 150.0F);
        var19.method108(0, arg11, arg6, arg10, arg0, arg15, arg14, arg4, -1L, arg9, arg2);
        class67.method482();
        class67.method491(var20, var21);
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(IZILom;II)V", line = 336)
    public static final void method1651(int arg0, boolean arg1, int arg2, class125 arg3, int arg4, int arg5) {
        int var6 = -126 % ((arg5 - 18) / 57);
        field3418++;
        if (class48.field591 >= 50 || arg3 == null || arg3.field1716 == null || arg3.field1716.length <= arg0 || arg3.field1716[arg0] == null) {
            return;
        }
        int var7 = arg3.field1716[arg0][0];
        int var8 = var7 >> 8;
        int var9 = (var7 & 0xF3) >> 5;
        if (arg3.field1716[arg0].length > 1) {
            int var10 = (int) ((double) arg3.field1716[arg0].length * Math.random());
            if (var10 > 0) {
                var8 = arg3.field1716[arg0][var10];
            }
        }
        int var11 = var7 & 0x1F;
        if (var11 == 0) {
            if (arg1) {
                class336.method2330(var8, (byte) -90, 255, 0, var9);
            }
        } else if (class224.field3233 != 0) {
            class309.field4660[class48.field591] = var8;
            class316.field4764[class48.field591] = var9;
            int var12 = (arg2 - 64) / 128;
            class125.field1699[class48.field591] = 0;
            class290.field4339[class48.field591] = null;
            int var13 = (arg4 - 64) / 128;
            class185.field2547[class48.field591] = 255;
            class211.field3058[class48.field591] = (var12 << 16) + (var13 << 8) + var11;
            class48.field591++;
        }
    }

    @OriginalMember(owner = "client!fj", name = "c", descriptor = "(B)Z", line = 394)
    public final boolean method1652(byte arg0) {
        field3435++;
        if (this.field3422 == null) {
            return false;
        } else {
            return arg0 == -50;
        }
    }

    @OriginalMember(owner = "client!fj", name = "e", descriptor = "(I)I", line = 412)
    public final int method1653(int arg0) {
        if (arg0 != -1) {
            this.method1656(-111);
        }
        field3429++;
        return this.field3422 == null || this.field3422.field849 == -1 ? super.method1653(arg0) : class327.method2285(this.field3422.field849, true).field2424;
    }

    @OriginalMember(owner = "client!fj", name = "b", descriptor = "(IB)V", line = 433)
    public static final void method1654(int arg0, byte arg1) {
        field3428++;
        if (arg0 == -1 || !class269.method1854((byte) -126, arg0)) {
            return;
        }
        if (arg1 > -17) {
            method1651(-44, true, 28, (class125) null, 48, 43);
        }
        class344[] var2 = field3419[arg0];
        for (int var3 = 0; var3 < var2.length; var3++) {
            class344 var4 = var2[var3];
            if (var4.field5279 != null) {
                class171 var5 = new class171();
                var5.field2333 = var4.field5279;
                var5.field2341 = var4;
                class45.method285(2000000, var5, 127);
            }
        }
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(IIIII)V", line = 487)
    public final void method100(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3423++;
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "()I", line = 494)
    public final int method105() {
        field3432++;
        return this.field3766;
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(BLwa;)V", line = 514)
    public static final void method1655(byte arg0, class80 arg1) {
        field3441++;
        class297.field4401 = 3;
        class151.method1102((byte) -127, true);
        class70.field953 = true;
        class218.field3118 = true;
        class253.field3625 = 0;
        class72.field1000 = true;
        class314.field4736 = true;
        class183.field2517 = true;
        class83.field1199 = 255;
        class99.field1354 = true;
        class216.field3091 = 2;
        class119.field1610 = true;
        class185.field2558 = true;
        class61.field810 = 0;
        class287.field4256 = true;
        class224.field3233 = 127;
        class135.field1866 = 0;
        class45.field553 = 127;
        class120 var2 = null;
        class342.field5117 = true;
        class239.field3394 = 0;
        class131.field1793 = true;
        if (class78.field1137 < 96) {
            class265.method1802(0);
        } else {
            class265.method1802(2);
        }
        class334.field5045 = false;
        class204.field2911 = false;
        class296.field4389 = true;
        class162.field2230 = 0;
        class96.field1297 = 0;
        class98.field1340 = false;
        int var3 = 6 / ((7 - arg0) / 62);
        class269.field3999 = 0;
        try {
            class285 var4 = arg1.method630(-125, "runescape");
            while (var4.field4241 == 0) {
                class186.method1304(10, 1L);
            }
            if (var4.field4241 == 1) {
                var2 = (class120) var4.field4244;
                int var5 = 0;
                byte[] var6 = new byte[(int) var2.method872(0)];
                while (var6.length > var5) {
                    int var7 = var2.method874(var6.length - var5, var5, var6, (byte) -128);
                    if (var7 == -1) {
                        throw new IOException("EOF");
                    }
                    var5 += var7;
                }
                class54.method375(new class316(var6), true);
            }
        } catch (Exception var11) {
        }
        try {
            if (var2 != null) {
                var2.method870(0);
            }
        } catch (Exception var10) {
        }
    }

    @OriginalMember(owner = "client!fj", name = "i", descriptor = "(I)Ljava/lang/String;", line = 610)
    public final String method1656(int arg0) {
        field3421++;
        if (arg0 != -1) {
            field3419 = (class344[][]) ((class344[][]) null);
        }
        String var2 = this.field3439;
        if (class31.field382 != null) {
            var2 = class31.field382[this.field3444] + var2;
        }
        if (class21.field268 != null) {
            var2 = var2 + class21.field268[this.field3444];
        }
        return var2;
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(IIIIIIIIJILsa;)V", line = 632)
    public final void method108(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class265 arg10) {
        field3412++;
        if (this.field3422 == null) {
            return;
        }
        class125 var13 = this.field3668 != -1 && this.field3762 == 0 ? class52.method361(true, this.field3668) : null;
        class125 var14 = this.field3719 == -1 || this.field3446 || this.field3719 == this.method1753(-1).field2665 && var13 != null ? null : class52.method361(true, this.field3719);
        class345 var15 = this.field3422.method430(this.field3688, var13, this.field3674, this.field3725, this.field3724, this.field3689, var14, this.field3682, true, this.field3684, (byte) 52);
        int var16 = class99.method718(-53);
        if (class67.field908 && class78.field1137 < 96 && var16 > 50) {
            class196.method1389(38);
        }
        if (class44.field530 != 0 && var16 < 50) {
            int var17 = 50 - var16;
            while (var17 > class181.field2477) {
                class85.field1235[class181.field2477] = new byte[102400];
                class181.field2477++;
            }
            while (var17 < class181.field2477) {
                class181.field2477--;
                class85.field1235[class181.field2477] = null;
            }
        }
        if (var15 == null) {
            return;
        }
        this.field3766 = var15.method105();
        if (class342.field5117 && (this.field3422.field849 == -1 || class327.method2285(this.field3422.field849, true).field2441)) {
            class345 var18 = class278.method1930(160, var15, this.field3679, 240, this.field3761, this.field3745, var14 == null ? this.field3684 : this.field3689, 0, 128, this.field3698, 0, 1, arg0, var14 == null ? var13 : var14);
            if (class67.field908) {
                float var19 = class67.method470();
                float var20 = class67.method485();
                class67.method475();
                class67.method491(var19, var20 - 150.0F);
                var18.method108(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L, arg9, (class265) null);
                class67.method482();
                class67.method491(var19, var20);
            } else {
                var18.method108(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L, arg9, (class265) null);
            }
        }
        if (class173.field2356 == this) {
            for (int var21 = class294.field4367.length - 1; var21 >= 0; var21--) {
                class324 var22 = class294.field4367[var21];
                if (var22 != null && var22.field4919 != -1) {
                    if (var22.field4910 == 1 && var22.field4906 >= 0 && class42.field484.length > var22.field4906) {
                        class329 var23 = class42.field484[var22.field4906];
                        if (var23 != null) {
                            int var24 = var23.field3745 / 32 - (class173.field2356.field3745 / 32);
                            int var25 = var23.field3679 / 32 - (class173.field2356.field3679 / 32);
                            this.method1650(arg4, var24, (class265) null, 360000, arg7, 32, arg2, var25, var15, arg9, arg3, arg1, arg0, var22.field4919, arg6, arg5);
                        }
                    }
                    if (var22.field4910 == 2) {
                        int var26 = (var22.field4914 - class132.field1809) * 4 + 2 - (class173.field2356.field3745 / 32);
                        int var27 = (var22.field4923 - class296.field4394) * 4 + 2 - (class173.field2356.field3679 / 32);
                        int var28 = var22.field4905 * 4;
                        int var29 = var28 * var28;
                        this.method1650(arg4, var26, (class265) null, var29, arg7, 32, arg2, var27, var15, arg9, arg3, arg1, arg0, var22.field4919, arg6, arg5);
                    }
                    if (var22.field4910 == 10 && var22.field4906 >= 0 && var22.field4906 < class169.field2306.length) {
                        class241 var30 = class169.field2306[var22.field4906];
                        if (var30 != null) {
                            int var31 = var30.field3745 / 32 - (class173.field2356.field3745 / 32);
                            int var32 = var30.field3679 / 32 - (class173.field2356.field3679 / 32);
                            this.method1650(arg4, var31, (class265) null, 360000, arg7, 32, arg2, var32, var15, arg9, arg3, arg1, arg0, var22.field4919, arg6, arg5);
                        }
                    }
                }
            }
        }
        this.method1755((byte) -35, var15);
        this.method1749(arg0, var15, -31609);
        class345 var33 = null;
        if (!this.field3446 && this.field3715 != -1 && this.field3737 != -1) {
            class309 var34 = class336.method2329(-89, this.field3715);
            var33 = var34.method2122(this.field3737, -84, this.field3713, this.field3718);
            if (var33 != null) {
                var33.method334(0, -this.field3692, 0);
                if (var34.field4675) {
                    if (class7.field65 != 0) {
                        var33.method344(class7.field65);
                    }
                    if (class249.field3575 != 0) {
                        var33.method337(class249.field3575);
                    }
                    if (class181.field2433 != 0) {
                        var33.method334(0, class181.field2433, 0);
                    }
                }
            }
        }
        class345 var35 = null;
        if (!this.field3446 && this.field3717 != null) {
            if (this.field3748 <= class329.field4966) {
                this.field3717 = null;
            }
            if (this.field3691 <= class329.field4966 && class329.field4966 < this.field3748) {
                if ((this.field3717 instanceof class301)) {
                    var35 = (class345) ((class301) this.field3717).method2048(false);
                } else {
                    var35 = (class345) this.field3717;
                }
                var35.method334(this.field3673 - this.field3745, -this.field3761 + this.field3767, this.field3712 - this.field3679);
                if (this.field3666 == 512) {
                    var35.method315();
                } else if (this.field3666 == 1024) {
                    var35.method348();
                } else if (this.field3666 == 1536) {
                    var35.method324();
                }
            }
        }
        if (class67.field908) {
            var15.field5357 = true;
            var15.method108(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field3720);
            if (var33 != null) {
                var33.field5357 = true;
                var33.method108(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field3720);
            }
        } else {
            if (var33 != null) {
                var15 = ((class50) var15).method331(var33);
            }
            if (var35 != null) {
                var15 = ((class50) var15).method331(var35);
            }
            var15.field5357 = true;
            var15.method108(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field3720);
        }
        if (var35 == null) {
            return;
        }
        if (this.field3666 == 512) {
            var35.method324();
        } else if (this.field3666 == 1024) {
            var35.method348();
        } else if (this.field3666 == 1536) {
            var35.method315();
        }
        var35.method334(this.field3745 - this.field3673, -this.field3767 + this.field3761, this.field3679 - this.field3712);
    }
}
