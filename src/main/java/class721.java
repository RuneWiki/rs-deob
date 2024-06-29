import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!el")
public class class721 extends class34 {

    @OriginalMember(owner = "client!el", name = "c", descriptor = "I")
    private int field10100 = 0;

    @OriginalMember(owner = "client!el", name = "n", descriptor = "Z")
    private boolean field10111 = false;

    @OriginalMember(owner = "client!el", name = "q", descriptor = "I")
    private int field10114 = 0;

    @OriginalMember(owner = "client!el", name = "w", descriptor = "I")
    private int field10120 = 0;

    @OriginalMember(owner = "client!el", name = "H", descriptor = "I")
    private int field10130 = 0;

    @OriginalMember(owner = "client!el", name = "E", descriptor = "Lpj;")
    private class38 field10127;

    @OriginalMember(owner = "client!el", name = "i", descriptor = "I")
    private int field10106;

    @OriginalMember(owner = "client!el", name = "p", descriptor = "I")
    private int field10113;

    @OriginalMember(owner = "client!el", name = "C", descriptor = "Lrm;")
    private class90 field10125;

    @OriginalMember(owner = "client!el", name = "A", descriptor = "Z")
    private boolean field10124;

    @OriginalMember(owner = "client!el", name = "F", descriptor = "Z")
    private boolean field10128;

    @OriginalMember(owner = "client!el", name = "h", descriptor = "Z")
    private boolean field10105;

    @OriginalMember(owner = "client!el", name = "s", descriptor = "Z")
    private boolean field10116;

    @OriginalMember(owner = "client!el", name = "x", descriptor = "I")
    public static int field10121 = 0;

    @OriginalMember(owner = "client!el", name = "j", descriptor = "I")
    public static int field10107 = 0;

    @OriginalMember(owner = "client!el", name = "a", descriptor = "I")
    public static int field10098;

    @OriginalMember(owner = "client!el", name = "b", descriptor = "I")
    public static int field10099;

    @OriginalMember(owner = "client!el", name = "d", descriptor = "I")
    public static int field10101;

    @OriginalMember(owner = "client!el", name = "e", descriptor = "I")
    public static int field10102;

    @OriginalMember(owner = "client!el", name = "f", descriptor = "I")
    public static int field10103;

    @OriginalMember(owner = "client!el", name = "g", descriptor = "I")
    public static int field10104;

    @OriginalMember(owner = "client!el", name = "k", descriptor = "I")
    public static int field10108;

    @OriginalMember(owner = "client!el", name = "l", descriptor = "I")
    public static int field10109;

    @OriginalMember(owner = "client!el", name = "m", descriptor = "I")
    public static int field10110;

    @OriginalMember(owner = "client!el", name = "o", descriptor = "I")
    public static int field10112;

    @OriginalMember(owner = "client!el", name = "r", descriptor = "I")
    public static int field10115;

    @OriginalMember(owner = "client!el", name = "t", descriptor = "I")
    public static int field10117;

    @OriginalMember(owner = "client!el", name = "u", descriptor = "I")
    public static int field10118;

    @OriginalMember(owner = "client!el", name = "v", descriptor = "I")
    public static int field10119;

    @OriginalMember(owner = "client!el", name = "y", descriptor = "I")
    public static int field10122;

    @OriginalMember(owner = "client!el", name = "z", descriptor = "I")
    public static int field10123;

    @OriginalMember(owner = "client!el", name = "D", descriptor = "I")
    public static int field10126;

    @OriginalMember(owner = "client!el", name = "G", descriptor = "I")
    public static int field10129;

    @OriginalMember(owner = "client!el", name = "I", descriptor = "I")
    public static int field10131;

    @OriginalMember(owner = "client!el", name = "a", descriptor = "([I)V", line = 3)
    public final void method186(int[] arg0) {
        arg0[0] = this.field10130;
        arg0[3] = this.field10114;
        field10119++;
        arg0[2] = this.field10120;
        arg0[1] = this.field10100;
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(III)V", line = 14)
    public final void method51(int arg0, int arg1, int arg2) {
        field10099++;
        int[] var4 = this.field10127.method1262(arg0, arg1, this.field10106, this.field10113);
        int[] var5 = new int[this.field10113 * this.field10106];
        this.field10125.method595(this.field10106, (byte) 26, 0, 0, var5, this.field10113, 0);
        if (arg2 == 0) {
            for (int var15 = 0; var15 < this.field10113; var15++) {
                int var16 = this.field10106 * var15;
                for (int var17 = 0; var17 < this.field10106; var17++) {
                    var5[var16 + var17] = class112.method903(class636.method3603(var4[var16 + var17], -419495936) << 8, class636.method3603(var5[var16 + var17], 16777215));
                }
            }
        } else if (arg2 == 1) {
            for (int var6 = 0; var6 < this.field10113; var6++) {
                int var7 = this.field10106 * var6;
                for (int var8 = 0; var8 < this.field10106; var8++) {
                    var5[var7 + var8] = class112.method903(class636.method3603(16777215, var5[var7 + var8]), class636.method3603(-16738984, var4[var7 + var8] << 16));
                }
            }
        } else if (arg2 == 2) {
            for (int var9 = 0; var9 < this.field10113; var9++) {
                int var10 = this.field10106 * var9;
                for (int var11 = 0; var11 < this.field10106; var11++) {
                    var5[var10 + var11] = class112.method903(class636.method3603(16777215, var5[var10 + var11]), class636.method3603(var4[var10 + var11], 281564927) << 24);
                }
            }
        } else if (arg2 == 3) {
            for (int var12 = 0; var12 < this.field10113; var12++) {
                int var13 = this.field10106 * var12;
                for (int var14 = 0; var14 < this.field10106; var14++) {
                    var5[var13 + var14] = class112.method903(var4[var13 + var14] == 0 ? 0 : -16777216, class636.method3603(16777215, var5[var13 + var14]));
                }
            }
        }
        this.method3974(0, 0, this.field10106, this.field10113, var5, 0, this.field10106);
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(IIII[III)V", line = 124)
    private final void method3974(int arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5, int arg6) {
        field10104++;
        this.field10125.method587(arg6, arg4, arg5, arg2, 17432, arg3, arg0, arg1);
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(IIIIII)V", line = 133)
    public final void method47(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field10122++;
        int[] var7 = this.field10127.method1262(arg4, arg5, arg2, arg3);
        if (var7 != null) {
            for (int var8 = 0; var8 < var7.length; var8++) {
                var7[var8] = class112.method903(var7[var8], -16777216);
            }
            this.method3974(arg0, arg1, arg2, arg3, var7, 0, arg2);
        }
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(FFFFFFILaa;II)V", line = 162)
    public final void method180(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, class570 arg7, int arg8, int arg9) {
        field10103++;
        class341 var11 = this.field10127.method431((byte) 49);
        class341 var12 = this.field10127.method269(1);
        class281 var13 = (class281) arg7;
        class90 var14 = var13.field4364;
        this.field10125.method204(this.field10124 || this.field10128 || (arg6 & 0x1) == 0 ? class70.field1080 : class397.field5910, -50);
        this.field10127.method256(true);
        this.field10127.method215(8, this.field10125);
        this.field10127.method314(1, (byte) 21);
        this.field10127.method405(1, (byte) 121);
        if (this.field10111) {
            float var15 = (float) this.field10106 / (float) this.method177();
            float var16 = (float) this.field10113 / (float) this.method184();
            var11.method2199((arg3 - arg1) * var15, 0.0F, (arg2 - arg0) * var15, 0.0F, 0.0F, 1.0F, (arg4 - arg0) * var16, (arg5 - arg1) * var16, true, 0.0F);
            var11.method2190((byte) 51, ((float) this.field10100 + arg1) * var16, 0.0F, ((float) this.field10130 + arg0) * var15);
        } else {
            var11.method2199(arg3 - arg1, 0.0F, arg2 - arg0, 0.0F, 0.0F, 1.0F, arg4 - arg0, -arg1 + arg5, true, 0.0F);
            var11.method2190((byte) 51, arg1, 0.0F, arg0);
        }
        var12.method2179(this.field10125.method591(90, (float) this.field10113), 1.0F, true, this.field10125.method590(45, (float) this.field10106));
        this.field10127.method342((byte) -123, class673.field9518);
        this.field10127.method411(1, (byte) -81);
        this.field10127.method215(8, var14);
        this.field10127.method365(class750.field10454, class333.field4884, (byte) -122);
        this.field10127.method321(class493.field7145, 0, (byte) -95);
        class341 var17 = this.field10127.method269(1);
        var17.method673(var11);
        var17.method671(-arg8, -arg9, 0);
        var17.method2197(var14.method591(93, 1.0F), var14.method590(46, 1.0F), 1.0F, 113);
        this.field10127.method342((byte) -125, class673.field9518);
        this.field10127.method309((byte) -115);
        this.field10127.method233(false);
        this.field10127.method250(-106);
        this.field10127.method321(class388.field5817, 0, (byte) -95);
        this.field10127.method365(class333.field4884, class333.field4884, (byte) -122);
        this.field10127.method215(8, null);
        this.field10127.method411(0, (byte) -84);
        this.field10127.method250(-127);
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(ILjava/util/Random;Z)I", line = 221)
    public static final int method3975(int arg0, Random arg1, boolean arg2) {
        field10129++;
        if (arg0 <= 0) {
            throw new IllegalArgumentException();
        } else if (class668.method3743((byte) -124, arg0)) {
            return (int) ((long) arg0 * ((long) arg1.nextInt() & 0xFFFFFFFFL) >> 32);
        } else {
            if (arg2) {
                field10107 = 84;
            }
            int var3 = Integer.MIN_VALUE - (int) (4294967296L % (long) arg0);
            int var4;
            do {
                var4 = arg1.nextInt();
            } while (var4 >= var3);
            return class590.method3390(arg0, 31019, var4);
        }
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(IIIIIIII)V", line = 250)
    public final void method49(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field10115++;
        class341 var9 = this.field10127.method431((byte) 122);
        class341 var10 = this.field10127.method269(1);
        this.field10125.method204(this.field10124 || this.field10128 || (arg7 & 0x1) == 0 ? class70.field1080 : class397.field5910, 52);
        this.field10127.method256(true);
        this.field10127.method215(8, this.field10125);
        this.field10127.method314(arg6, (byte) 21);
        this.field10127.method405(arg4, (byte) 121);
        this.field10127.method321(class327.field4819, 1, (byte) -95);
        this.field10127.method227(1, class327.field4819, 70);
        this.field10127.method228(2, arg5);
        var10.method2179(this.field10125.method591(94, (float) this.field10113), 1.0F, true, this.field10125.method590(28, (float) this.field10106));
        if (this.field10111) {
            arg2 = this.field10106 * arg2 / this.method177();
            arg3 = this.field10113 * arg3 / this.method184();
            arg1 += this.field10100 * arg3 / this.field10113;
            arg0 += this.field10130 * arg2 / this.field10106;
        }
        var9.method2179((float) arg3, 0.0F, true, (float) arg2);
        var9.method671(arg0, arg1, 0);
        this.field10127.method342((byte) -1, class673.field9518);
        this.field10127.method309((byte) 112);
        this.field10127.method233(false);
        this.field10127.method250(21);
        this.field10127.method321(class493.field7145, 1, (byte) -95);
        this.field10127.method227(1, class493.field7145, 70);
    }

    @OriginalMember(owner = "client!el", name = "<init>", descriptor = "(Lpj;IIZ)V", line = 719)
    public class721(class38 arg0, int arg1, int arg2, boolean arg3) {
        this.field10127 = arg0;
        this.field10106 = arg1;
        this.field10113 = arg2;
        this.field10125 = arg0.method417(arg3 ? class238.field3830 : class121.field1864, 3, arg1, class121.field1859, arg2);
        this.field10125.method597(-126, true, true);
        this.field10124 = this.field10125.method593(true) != arg1;
        this.field10128 = arg2 != this.field10125.method588((byte) 21);
        this.field10105 = !this.field10124 && this.field10125.method589((byte) -120);
        this.field10116 = !this.field10128 && this.field10125.method589((byte) -114);
    }

    @OriginalMember(owner = "client!el", name = "<init>", descriptor = "(Lpj;II[III)V", line = 746)
    public class721(class38 arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5) {
        this.field10106 = arg1;
        this.field10127 = arg0;
        this.field10113 = arg2;
        this.field10125 = arg0.method407(arg5, arg2, arg4, arg3, arg1, 126, false);
        this.field10125.method597(-126, true, true);
        this.field10124 = arg1 != this.field10125.method593(true);
        this.field10128 = arg2 != this.field10125.method588((byte) 21);
        this.field10105 = !this.field10124 && this.field10125.method589((byte) -114);
        this.field10116 = !this.field10128 && this.field10125.method589((byte) -119);
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(IIII)V", line = 294)
    public final void method185(int arg0, int arg1, int arg2, int arg3) {
        this.field10120 = arg2;
        this.field10100 = arg1;
        this.field10114 = arg3;
        this.field10130 = arg0;
        field10098++;
        this.field10111 = this.field10130 != 0 || this.field10100 != 0 || this.field10120 != 0 || this.field10114 != 0;
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "()I", line = 306)
    public final int method175() {
        field10108++;
        return this.field10106;
    }

    @OriginalMember(owner = "client!el", name = "d", descriptor = "()I", line = 317)
    public final int method184() {
        field10117++;
        return this.field10113 + this.field10100 + this.field10114;
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(IIIIIII)V", line = 327)
    public final void method181(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field10126++;
        class341 var8 = this.field10127.method431((byte) -117);
        class341 var9 = this.field10127.method269(1);
        this.field10125.method204(class70.field1080, -79);
        this.field10127.method256(true);
        this.field10127.method215(8, this.field10125);
        this.field10127.method314(arg6, (byte) 21);
        this.field10127.method405(arg4, (byte) 121);
        this.field10127.method321(class327.field4819, 1, (byte) -95);
        this.field10127.method227(1, class327.field4819, 70);
        this.field10127.method228(2, arg5);
        boolean var10 = this.field10116 && this.field10100 == 0 && this.field10114 == 0;
        boolean var11 = this.field10105 && this.field10130 == 0 && this.field10120 == 0;
        if (var10 & var11) {
            var9.method2179(this.field10125.method591(-79, (float) arg3), 1.0F, true, this.field10125.method590(55, (float) arg2));
            var8.method2179((float) arg3, 0.0F, true, (float) arg2);
            var8.method671(arg0, arg1, 0);
            this.field10127.method342((byte) -121, class673.field9518);
            this.field10127.method309((byte) -67);
            this.field10127.method233(false);
        } else if (var11) {
            int var30 = arg1 + arg3;
            int var31 = this.method184();
            var9.method2179(this.field10125.method591(99, (float) this.field10113), 1.0F, true, this.field10125.method590(13, (float) arg2));
            this.field10127.method342((byte) -122, class673.field9518);
            int var32 = this.field10100 + arg1;
            for (int var33 = var32 + this.field10113; var33 <= var30; var33 += var31) {
                var8.method2179((float) this.field10113, 0.0F, true, (float) arg2);
                var8.method671(arg0, var32, 0);
                this.field10127.method309((byte) 111);
                this.field10127.method233(false);
                var32 += var31;
            }
            if (var30 > var32) {
                int var34 = var30 - var32;
                var9.method2179(this.field10125.method591(-9, (float) var34), 1.0F, true, this.field10125.method590(89, (float) arg2));
                this.field10127.method342((byte) -127, class673.field9518);
                var8.method2179((float) var34, 0.0F, true, (float) arg2);
                var8.method671(arg0, var32, 0);
                this.field10127.method309((byte) 126);
                this.field10127.method233(false);
            }
        } else if (var10) {
            int var12 = arg0 + arg2;
            int var13 = this.method177();
            var9.method2179(this.field10125.method591(-21, (float) arg3), 1.0F, true, this.field10125.method590(38, (float) this.field10106));
            this.field10127.method342((byte) 11, class673.field9518);
            int var14 = this.field10130 + arg0;
            int var15 = this.field10106 + var14;
            while (var15 <= var12) {
                var8.method2179((float) arg3, 0.0F, true, (float) this.field10106);
                var8.method671(var14, arg1, 0);
                this.field10127.method309((byte) 108);
                this.field10127.method233(false);
                var15 += var13;
                var14 += var13;
            }
            if (var14 < var12) {
                int var16 = var12 - var14;
                var9.method2179(this.field10125.method591(86, (float) arg3), 1.0F, true, this.field10125.method590(83, (float) var16));
                this.field10127.method342((byte) -128, class673.field9518);
                var8.method2179((float) arg3, 0.0F, true, (float) var16);
                var8.method671(var14, arg1, 0);
                this.field10127.method309((byte) -113);
                this.field10127.method233(false);
            }
        } else {
            int var17 = arg1 + arg3;
            int var18 = arg0 + arg2;
            int var19 = this.method177();
            int var20 = this.method184();
            int var21 = this.field10100 + arg1;
            int var22 = this.field10113 + var21;
            while (var22 <= var17) {
                var9.method2179(this.field10125.method591(90, (float) this.field10113), 1.0F, true, this.field10125.method590(100, (float) this.field10106));
                this.field10127.method342((byte) 30, class673.field9518);
                int var27 = this.field10130 + arg0;
                for (int var28 = this.field10106 + var27; var28 <= var18; var28 += var19) {
                    var8.method2179((float) this.field10113, 0.0F, true, (float) this.field10106);
                    var8.method671(var27, var21, 0);
                    this.field10127.method309((byte) -84);
                    var27 += var19;
                    this.field10127.method233(false);
                }
                if (var27 < var18) {
                    int var29 = var18 - var27;
                    var9.method2179(this.field10125.method591(118, (float) this.field10113), 1.0F, true, this.field10125.method590(118, (float) var29));
                    this.field10127.method342((byte) -127, class673.field9518);
                    var8.method2179((float) this.field10113, 0.0F, true, (float) var29);
                    var8.method671(var27, var21, 0);
                    this.field10127.method309((byte) 104);
                    this.field10127.method233(false);
                }
                var22 += var20;
                var21 += var20;
            }
            if (var21 < var17) {
                int var23 = var17 - var21;
                var9.method2179(this.field10125.method591(94, (float) var23), 1.0F, true, this.field10125.method590(40, (float) this.field10106));
                this.field10127.method342((byte) 82, class673.field9518);
                int var24 = this.field10130 + arg0;
                for (int var25 = this.field10106 + var24; var25 <= var18; var25 += var19) {
                    var8.method2179((float) var23, 0.0F, true, (float) this.field10106);
                    var8.method671(var24, var21, 0);
                    this.field10127.method309((byte) -104);
                    this.field10127.method233(false);
                    var24 += var19;
                }
                if (var18 > var24) {
                    int var26 = var18 - var24;
                    var9.method2179(this.field10125.method591(-102, (float) var23), 1.0F, true, this.field10125.method590(25, (float) var26));
                    this.field10127.method342((byte) 5, class673.field9518);
                    var8.method2179((float) var23, 0.0F, true, (float) var26);
                    var8.method671(var24, var21, 0);
                    this.field10127.method309((byte) 107);
                    this.field10127.method233(false);
                }
            }
        }
        this.field10127.method250(112);
        this.field10127.method321(class493.field7145, 1, (byte) -95);
        this.field10127.method227(1, class493.field7145, 70);
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(IILaa;II)V", line = 533)
    public final void method52(int arg0, int arg1, class570 arg2, int arg3, int arg4) {
        field10101++;
        class281 var6 = (class281) arg2;
        int var7 = this.field10130 + arg0;
        class90 var8 = var6.field4364;
        int var9 = this.field10100 + arg1;
        this.field10125.method204(class70.field1080, 97);
        this.field10127.method256(true);
        this.field10127.method215(8, this.field10125);
        this.field10127.method314(1, (byte) 21);
        this.field10127.method405(1, (byte) 121);
        class341 var10 = this.field10127.method431((byte) -105);
        var10.method2179((float) this.field10113, 0.0F, true, (float) this.field10106);
        var10.method671(var7, var9, 0);
        this.field10127.method309((byte) 92);
        class341 var11 = this.field10127.method269(1);
        var11.method2179(this.field10125.method591(-22, (float) this.field10113), 1.0F, true, this.field10125.method590(59, (float) this.field10106));
        this.field10127.method342((byte) -127, class673.field9518);
        this.field10127.method411(1, (byte) -89);
        this.field10127.method215(8, var8);
        this.field10127.method365(class750.field10454, class333.field4884, (byte) -122);
        this.field10127.method321(class493.field7145, 0, (byte) -95);
        class341 var12 = this.field10127.method269(1);
        var12.method2179(var8.method591(106, (float) this.field10113), 1.0F, true, var8.method590(25, (float) this.field10106));
        var12.method2190((byte) 51, var8.method591(-11, (float) (var9 - arg4)), 0.0F, var8.method590(93, (float) (var7 - arg3)));
        this.field10127.method342((byte) 66, class673.field9518);
        this.field10127.method233(false);
        this.field10127.method250(71);
        this.field10127.method321(class388.field5817, 0, (byte) -95);
        this.field10127.method365(class333.field4884, class333.field4884, (byte) -122);
        this.field10127.method215(8, null);
        this.field10127.method411(0, (byte) -90);
        this.field10127.method250(88);
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(IIIII)V", line = 583)
    public final void method48(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field10123++;
        class341 var6 = this.field10127.method431((byte) 95);
        class341 var7 = this.field10127.method269(1);
        int var8 = this.field10130 + arg0;
        int var9 = this.field10100 + arg1;
        this.field10125.method204(class70.field1080, -108);
        this.field10127.method256(true);
        this.field10127.method215(8, this.field10125);
        this.field10127.method314(arg4, (byte) 21);
        this.field10127.method405(arg2, (byte) 121);
        this.field10127.method321(class327.field4819, 1, (byte) -95);
        this.field10127.method227(1, class327.field4819, 70);
        this.field10127.method228(2, arg3);
        var6.method2179((float) this.field10113, 0.0F, true, (float) this.field10106);
        var6.method671(var8, var9, 0);
        var7.method2179(this.field10125.method591(94, (float) this.field10113), 1.0F, true, this.field10125.method590(41, (float) this.field10106));
        this.field10127.method342((byte) 78, class673.field9518);
        this.field10127.method309((byte) -36);
        this.field10127.method233(false);
        this.field10127.method250(123);
        this.field10127.method321(class493.field7145, 1, (byte) -95);
        this.field10127.method227(1, class493.field7145, 70);
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(FFFFFFIIII)V", line = 622)
    public final void method173(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8, int arg9) {
        field10131++;
        class341 var11 = this.field10127.method431((byte) -102);
        class341 var12 = this.field10127.method269(1);
        this.field10125.method204(this.field10124 || this.field10128 || (arg9 & 0x1) == 0 ? class70.field1080 : class397.field5910, -61);
        this.field10127.method256(true);
        this.field10127.method215(8, this.field10125);
        this.field10127.method314(arg8, (byte) 21);
        this.field10127.method405(arg6, (byte) 121);
        this.field10127.method321(class327.field4819, 1, (byte) -95);
        this.field10127.method227(1, class327.field4819, 70);
        this.field10127.method228(2, arg7);
        if (this.field10111) {
            float var13 = (float) this.method177();
            float var14 = (float) this.method184();
            float var15 = (arg2 - arg0) / var13;
            float var16 = (arg3 - arg1) / var13;
            float var17 = (arg4 - arg0) / var14;
            float var18 = (arg5 - arg1) / var14;
            float var19 = (float) this.field10100 * var17;
            float var20 = (float) this.field10100 * var18;
            float var21 = (float) this.field10130 * var15;
            float var22 = (float) this.field10130 * var16;
            float var23 = (float) this.field10120 * -var15;
            float var24 = (float) this.field10120 * -var16;
            float var25 = (float) this.field10114 * -var17;
            arg0 = arg0 + var21 + var19;
            arg2 = arg2 + var23 + var19;
            arg1 = arg1 + var22 + var20;
            float var26 = (float) this.field10114 * -var18;
            arg3 = arg3 + var24 + var20;
            arg4 = arg4 + var21 + var25;
            arg5 = arg5 + var22 + var26;
        }
        var11.method2199(arg3 - arg1, 0.0F, arg2 - arg0, 0.0F, 0.0F, 1.0F, arg4 - arg0, arg5 - arg1, true, 0.0F);
        var11.method2190((byte) 51, arg1, 0.0F, arg0);
        var12.method2179(this.field10125.method591(11, (float) this.field10113), 1.0F, true, this.field10125.method590(90, (float) this.field10106));
        this.field10127.method342((byte) -8, class673.field9518);
        this.field10127.method309((byte) 108);
        this.field10127.method233(false);
        this.field10127.method250(42);
        this.field10127.method321(class493.field7145, 1, (byte) -95);
        this.field10127.method227(1, class493.field7145, 70);
    }

    @OriginalMember(owner = "client!el", name = "c", descriptor = "()I", line = 689)
    public final int method179() {
        field10112++;
        return this.field10113;
    }

    @OriginalMember(owner = "client!el", name = "b", descriptor = "()I", line = 698)
    public final int method177() {
        field10102++;
        return this.field10130 + this.field10106 + this.field10120;
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(IBI)Z", line = 735)
    public static final boolean method3976(int arg0, byte arg1, int arg2) {
        if (arg1 == 52) {
            field10110++;
            return (arg0 & 0x100) != 0;
        } else {
            return true;
        }
    }
}
