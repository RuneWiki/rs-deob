import java.io.File;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nh")
public class class753 extends class515 {

    @OriginalMember(owner = "client!nh", name = "n", descriptor = "I")
    private int field10492 = 0;

    @OriginalMember(owner = "client!nh", name = "j", descriptor = "Z")
    private boolean field10488 = false;

    @OriginalMember(owner = "client!nh", name = "t", descriptor = "I")
    private int field10498 = 0;

    @OriginalMember(owner = "client!nh", name = "y", descriptor = "I")
    private int field10503 = 0;

    @OriginalMember(owner = "client!nh", name = "r", descriptor = "I")
    private int field10496 = 0;

    @OriginalMember(owner = "client!nh", name = "o", descriptor = "Lch;")
    private class38 field10493;

    @OriginalMember(owner = "client!nh", name = "m", descriptor = "I")
    private int field10491;

    @OriginalMember(owner = "client!nh", name = "u", descriptor = "I")
    private int field10499;

    @OriginalMember(owner = "client!nh", name = "z", descriptor = "Lug;")
    private class60 field10504;

    @OriginalMember(owner = "client!nh", name = "d", descriptor = "Z")
    private boolean field10482;

    @OriginalMember(owner = "client!nh", name = "C", descriptor = "Z")
    private boolean field10507;

    @OriginalMember(owner = "client!nh", name = "e", descriptor = "Z")
    private boolean field10483;

    @OriginalMember(owner = "client!nh", name = "f", descriptor = "Z")
    private boolean field10484;

    @OriginalMember(owner = "client!nh", name = "x", descriptor = "Llc;")
    public static class435 field10502 = new class435(59, 4);

    @OriginalMember(owner = "client!nh", name = "A", descriptor = "Z")
    public static boolean field10505 = false;

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "I")
    public static int field10479;

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "I")
    public static int field10480;

    @OriginalMember(owner = "client!nh", name = "c", descriptor = "I")
    public static int field10481;

    @OriginalMember(owner = "client!nh", name = "g", descriptor = "I")
    public static int field10485;

    @OriginalMember(owner = "client!nh", name = "h", descriptor = "I")
    public static int field10486;

    @OriginalMember(owner = "client!nh", name = "i", descriptor = "I")
    public static int field10487;

    @OriginalMember(owner = "client!nh", name = "k", descriptor = "I")
    public static int field10489;

    @OriginalMember(owner = "client!nh", name = "l", descriptor = "I")
    public static int field10490;

    @OriginalMember(owner = "client!nh", name = "p", descriptor = "I")
    public static int field10494;

    @OriginalMember(owner = "client!nh", name = "q", descriptor = "I")
    public static int field10495;

    @OriginalMember(owner = "client!nh", name = "s", descriptor = "I")
    public static int field10497;

    @OriginalMember(owner = "client!nh", name = "v", descriptor = "I")
    public static int field10500;

    @OriginalMember(owner = "client!nh", name = "w", descriptor = "I")
    public static int field10501;

    @OriginalMember(owner = "client!nh", name = "B", descriptor = "I")
    public static int field10506;

    @OriginalMember(owner = "client!nh", name = "D", descriptor = "I")
    public static int field10508;

    @OriginalMember(owner = "client!nh", name = "E", descriptor = "I")
    public static int field10509;

    @OriginalMember(owner = "client!nh", name = "F", descriptor = "I")
    public static int field10510;

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "()I", line = 4)
    public final int method780() {
        field10489++;
        return this.field10499 + this.field10496 + this.field10492;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(IIIII)V", line = 14)
    public final void method789(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field10479++;
        class417 var6 = this.field10493.method345(0);
        class417 var7 = this.field10493.method381((byte) 42);
        int var8 = this.field10492 + arg1;
        int var9 = this.field10498 + arg0;
        this.field10504.method616(false, class435.field6224);
        this.field10493.method259((byte) -93);
        this.field10493.method264(this.field10504, -2);
        this.field10493.method355(arg4, (byte) -27);
        this.field10493.method411(17024, arg2);
        this.field10493.method230(class231.field3462, 1, 98);
        this.field10493.method242((byte) -124, class231.field3462, 1);
        this.field10493.method213(arg3, 3);
        var6.method2522((float) this.field10499, 0.0F, 126, (float) this.field10491);
        var6.method849(var9, var8, 0);
        var7.method2522(this.field10504.method567((float) this.field10499, 17714), 1.0F, 127, this.field10504.method561((byte) 97, (float) this.field10491));
        this.field10493.method238(127, class549.field7982);
        this.field10493.method384((byte) 19);
        this.field10493.method337((byte) 18);
        this.field10493.method389((byte) -2);
        this.field10493.method230(class401.field5746, 1, 81);
        this.field10493.method242((byte) -123, class401.field5746, 1);
    }

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "(III)I", line = 44)
    public static final int method4190(int arg0, int arg1, int arg2) {
        if (arg2 > -97) {
            return -35;
        } else {
            field10485++;
            int var3 = arg1 >>> 31;
            return (arg1 + var3) / arg0 - var3;
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(III)V", line = 58)
    public final void method808(int arg0, int arg1, int arg2) {
        field10490++;
        int[] var4 = this.field10493.method1226(arg0, arg1, this.field10491, this.field10499);
        int[] var5 = new int[this.field10499 * this.field10491];
        this.field10504.method564(var5, this.field10491, this.field10499, 104, 0, 0, 0);
        if (arg2 == 0) {
            for (int var15 = 0; var15 < this.field10499; var15++) {
                int var16 = this.field10491 * var15;
                for (int var17 = 0; var17 < this.field10491; var17++) {
                    var5[var16 + var17] = class430.method2658(class368.method2314(-16777162, var4[var16 + var17] << 8), class368.method2314(var5[var16 + var17], 16777215));
                }
            }
        } else if (arg2 == 1) {
            for (int var12 = 0; var12 < this.field10499; var12++) {
                int var13 = this.field10491 * var12;
                for (int var14 = 0; var14 < this.field10491; var14++) {
                    var5[var13 + var14] = class430.method2658(class368.method2314(551616256, var4[var13 + var14]) << 16, class368.method2314(var5[var13 + var14], 16777215));
                }
            }
        } else if (arg2 == 2) {
            for (int var9 = 0; var9 < this.field10499; var9++) {
                int var10 = this.field10491 * var9;
                for (int var11 = 0; var11 < this.field10491; var11++) {
                    var5[var10 + var11] = class430.method2658(class368.method2314(-12673969, var4[var10 + var11] << 24), class368.method2314(var5[var10 + var11], 16777215));
                }
            }
        } else if (arg2 == 3) {
            for (int var6 = 0; var6 < this.field10499; var6++) {
                int var7 = this.field10491 * var6;
                for (int var8 = 0; var8 < this.field10491; var8++) {
                    var5[var7 + var8] = class430.method2658(var4[var7 + var8] == 0 ? 0 : -16777216, class368.method2314(var5[var7 + var8], 16777215));
                }
            }
        }
        this.method4192(0, 0, this.field10491, this.field10499, var5, 0, this.field10491);
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(FFFFFFILaa;II)V", line = 169)
    public final void method782(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, class569 arg7, int arg8, int arg9) {
        field10510++;
        class417 var11 = this.field10493.method345(0);
        class417 var12 = this.field10493.method381((byte) 42);
        class628 var13 = (class628) arg7;
        class60 var14 = var13.field8902;
        this.field10504.method616(false, this.field10482 || this.field10507 || (arg6 & 0x1) == 0 ? class435.field6224 : class23.field215);
        this.field10493.method259((byte) -93);
        this.field10493.method264(this.field10504, -2);
        this.field10493.method355(1, (byte) -30);
        this.field10493.method411(17024, 1);
        if (this.field10488) {
            float var15 = (float) this.field10491 / (float) this.method784();
            float var16 = (float) this.field10499 / (float) this.method780();
            var11.method2518(1.0F, (arg4 - arg0) * var16, (arg5 - arg1) * var16, (arg3 - arg1) * var15, 0.0F, 0.0F, -101, 0.0F, (arg2 - arg0) * var15, 0.0F);
            var11.method2538(((float) this.field10498 + arg0) * var15, ((float) this.field10492 + arg1) * var16, 0.0F, 17831);
        } else {
            var11.method2518(1.0F, arg4 - arg0, -arg1 + arg5, arg3 - arg1, 0.0F, 0.0F, -120, 0.0F, arg2 - arg0, 0.0F);
            var11.method2538(arg0, arg1, 0.0F, 17831);
        }
        var12.method2522(this.field10504.method567((float) this.field10499, 17714), 1.0F, 123, this.field10504.method561((byte) 70, (float) this.field10491));
        this.field10493.method238(126, class549.field7982);
        this.field10493.method208(8, 1);
        this.field10493.method264(var14, -2);
        this.field10493.method386((byte) -125, class281.field3934, class567.field8198);
        this.field10493.method230(class401.field5746, 0, 43);
        class417 var17 = this.field10493.method381((byte) 42);
        var17.method841(var11);
        var17.method849(-arg8, -arg9, 0);
        var17.method2537((byte) -106, var14.method561((byte) -48, 1.0F), 1.0F, var14.method567(1.0F, 17714));
        this.field10493.method238(109, class549.field7982);
        this.field10493.method384((byte) 19);
        this.field10493.method337((byte) 18);
        this.field10493.method389((byte) -2);
        this.field10493.method230(class234.field3509, 0, 54);
        this.field10493.method386((byte) -118, class281.field3934, class281.field3934);
        this.field10493.method264(null, -2);
        this.field10493.method208(8, 0);
        this.field10493.method389((byte) -2);
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(Ljava/lang/String;ILjava/io/File;)V", line = 225)
    public static final void method4191(String arg0, int arg1, File arg2) {
        class622.field8851.put(arg0, arg2);
        field10495++;
        if (arg1 != 0) {
            method4191(null, -14, null);
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "()I", line = 245)
    public final int method777() {
        field10487++;
        return this.field10491;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(IIII[III)V", line = 253)
    private final void method4192(int arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5, int arg6) {
        this.field10504.method562(arg4, arg2, arg6, arg1, (byte) 109, arg3, arg5, arg0);
        field10494++;
    }

    @OriginalMember(owner = "client!nh", name = "<init>", descriptor = "(Lch;IIZ)V", line = 712)
    public class753(class38 arg0, int arg1, int arg2, boolean arg3) {
        this.field10493 = arg0;
        this.field10491 = arg1;
        this.field10499 = arg2;
        this.field10504 = arg0.method329(arg1, arg2, (byte) -91, class674.field9590, arg3 ? class482.field6922 : class456.field6496);
        this.field10504.method560(true, 16609, true);
        this.field10482 = this.field10504.method568(22505) != arg1;
        this.field10507 = this.field10504.method563((byte) -113) != arg2;
        this.field10483 = !this.field10482 && this.field10504.method566((byte) 97);
        this.field10484 = !this.field10507 && this.field10504.method566((byte) 40);
    }

    @OriginalMember(owner = "client!nh", name = "<init>", descriptor = "(Lch;II[III)V", line = 727)
    public class753(class38 arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5) {
        this.field10499 = arg2;
        this.field10491 = arg1;
        this.field10493 = arg0;
        this.field10504 = arg0.method290(arg4, arg5, false, arg1, arg3, 10, arg2);
        this.field10504.method560(true, 16609, true);
        this.field10482 = this.field10504.method568(22505) != arg1;
        this.field10507 = this.field10504.method563((byte) -10) != arg2;
        this.field10483 = !this.field10482 && this.field10504.method566((byte) 49);
        this.field10484 = !this.field10507 && this.field10504.method566((byte) 84);
    }

    @OriginalMember(owner = "client!nh", name = "d", descriptor = "()I", line = 268)
    public final int method787() {
        field10497++;
        return this.field10499;
    }

    @OriginalMember(owner = "client!nh", name = "c", descriptor = "()I", line = 277)
    public final int method784() {
        field10509++;
        return this.field10503 + this.field10491 + this.field10498;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(IIIIII)V", line = 286)
    public final void method807(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field10508++;
        int[] var7 = this.field10493.method1226(arg4, arg5, arg2, arg3);
        if (var7 != null) {
            for (int var8 = 0; var8 < var7.length; var8++) {
                var7[var8] = class430.method2658(var7[var8], -16777216);
            }
            this.method4192(arg0, arg1, arg2, arg3, var7, 0, arg2);
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(FFFFFFIIII)V", line = 321)
    public final void method779(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8, int arg9) {
        field10481++;
        class417 var11 = this.field10493.method345(0);
        class417 var12 = this.field10493.method381((byte) 42);
        this.field10504.method616(false, this.field10482 || this.field10507 || (arg9 & 0x1) == 0 ? class435.field6224 : class23.field215);
        this.field10493.method259((byte) -93);
        this.field10493.method264(this.field10504, -2);
        this.field10493.method355(arg8, (byte) -31);
        this.field10493.method411(17024, arg6);
        this.field10493.method230(class231.field3462, 1, 58);
        this.field10493.method242((byte) -122, class231.field3462, 1);
        this.field10493.method213(arg7, 3);
        if (this.field10488) {
            float var13 = (float) this.method784();
            float var14 = (float) this.method780();
            float var15 = (arg2 - arg0) / var13;
            float var16 = (arg3 - arg1) / var13;
            float var17 = (arg4 - arg0) / var14;
            float var18 = (arg5 - arg1) / var14;
            float var19 = (float) this.field10492 * var17;
            float var20 = (float) this.field10492 * var18;
            float var21 = (float) this.field10498 * var15;
            float var22 = (float) this.field10498 * var16;
            float var23 = (float) this.field10503 * -var15;
            float var24 = (float) this.field10503 * -var16;
            float var25 = (float) this.field10496 * -var17;
            arg1 = arg1 + var22 + var20;
            arg3 = arg3 + var24 + var20;
            arg2 = arg2 + var23 + var19;
            float var26 = (float) this.field10496 * -var18;
            arg0 = arg0 + var21 + var19;
            arg4 = arg4 + var21 + var25;
            arg5 = arg5 + var22 + var26;
        }
        var11.method2518(1.0F, arg4 - arg0, arg5 - arg1, arg3 - arg1, 0.0F, 0.0F, -113, 0.0F, arg2 - arg0, 0.0F);
        var11.method2538(arg0, arg1, 0.0F, 17831);
        var12.method2522(this.field10504.method567((float) this.field10499, 17714), 1.0F, 127, this.field10504.method561((byte) -123, (float) this.field10491));
        this.field10493.method238(119, class549.field7982);
        this.field10493.method384((byte) 19);
        this.field10493.method337((byte) 18);
        this.field10493.method389((byte) -2);
        this.field10493.method230(class401.field5746, 1, 40);
        this.field10493.method242((byte) -126, class401.field5746, 1);
    }

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "(IIIIIII)V", line = 388)
    public final void method775(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field10501++;
        class417 var8 = this.field10493.method345(0);
        class417 var9 = this.field10493.method381((byte) 42);
        this.field10504.method616(false, class435.field6224);
        this.field10493.method259((byte) -93);
        this.field10493.method264(this.field10504, -2);
        this.field10493.method355(arg6, (byte) -120);
        this.field10493.method411(17024, arg4);
        this.field10493.method230(class231.field3462, 1, 77);
        this.field10493.method242((byte) -122, class231.field3462, 1);
        this.field10493.method213(arg5, 3);
        boolean var10 = this.field10484 && this.field10492 == 0 && this.field10496 == 0;
        boolean var11 = this.field10483 && this.field10498 == 0 && this.field10503 == 0;
        if (var11 & var10) {
            var9.method2522(this.field10504.method567((float) arg3, 17714), 1.0F, 123, this.field10504.method561((byte) -109, (float) arg2));
            var8.method2522((float) arg3, 0.0F, 127, (float) arg2);
            var8.method849(arg0, arg1, 0);
            this.field10493.method238(118, class549.field7982);
            this.field10493.method384((byte) 19);
            this.field10493.method337((byte) 18);
        } else if (var11) {
            int var12 = arg1 + arg3;
            int var13 = this.method780();
            var9.method2522(this.field10504.method567((float) this.field10499, 17714), 1.0F, 123, this.field10504.method561((byte) -50, (float) arg2));
            this.field10493.method238(118, class549.field7982);
            int var14 = arg1 + this.field10492;
            for (int var15 = this.field10499 + var14; var15 <= var12; var15 += var13) {
                var8.method2522((float) this.field10499, 0.0F, 127, (float) arg2);
                var8.method849(arg0, var14, 0);
                this.field10493.method384((byte) 19);
                var14 += var13;
                this.field10493.method337((byte) 18);
            }
            if (var14 < var12) {
                int var16 = var12 - var14;
                var9.method2522(this.field10504.method567((float) var16, 17714), 1.0F, 127, this.field10504.method561((byte) 78, (float) arg2));
                this.field10493.method238(110, class549.field7982);
                var8.method2522((float) var16, 0.0F, 123, (float) arg2);
                var8.method849(arg0, var14, 0);
                this.field10493.method384((byte) 19);
                this.field10493.method337((byte) 18);
            }
        } else if (var10) {
            int var30 = arg0 + arg2;
            int var31 = this.method784();
            var9.method2522(this.field10504.method567((float) arg3, 17714), 1.0F, 124, this.field10504.method561((byte) -109, (float) this.field10491));
            this.field10493.method238(122, class549.field7982);
            int var32 = this.field10498 + arg0;
            for (int var33 = var32 + this.field10491; var33 <= var30; var33 += var31) {
                var8.method2522((float) arg3, 0.0F, 124, (float) this.field10491);
                var8.method849(var32, arg1, 0);
                this.field10493.method384((byte) 19);
                this.field10493.method337((byte) 18);
                var32 += var31;
            }
            if (var32 < var30) {
                int var34 = var30 - var32;
                var9.method2522(this.field10504.method567((float) arg3, 17714), 1.0F, 124, this.field10504.method561((byte) -98, (float) var34));
                this.field10493.method238(120, class549.field7982);
                var8.method2522((float) arg3, 0.0F, 126, (float) var34);
                var8.method849(var32, arg1, 0);
                this.field10493.method384((byte) 19);
                this.field10493.method337((byte) 18);
            }
        } else {
            int var17 = arg1 + arg3;
            int var18 = arg0 + arg2;
            int var19 = this.method784();
            int var20 = this.method780();
            int var21 = this.field10492 + arg1;
            for (int var22 = this.field10499 + var21; var22 <= var17; var22 += var20) {
                var9.method2522(this.field10504.method567((float) this.field10499, 17714), 1.0F, 126, this.field10504.method561((byte) -66, (float) this.field10491));
                this.field10493.method238(118, class549.field7982);
                int var27 = arg0 + this.field10498;
                for (int var28 = var27 + this.field10491; var28 <= var18; var28 += var19) {
                    var8.method2522((float) this.field10499, 0.0F, 127, (float) this.field10491);
                    var8.method849(var27, var21, 0);
                    this.field10493.method384((byte) 19);
                    var27 += var19;
                    this.field10493.method337((byte) 18);
                }
                if (var18 > var27) {
                    int var29 = var18 - var27;
                    var9.method2522(this.field10504.method567((float) this.field10499, 17714), 1.0F, 126, this.field10504.method561((byte) -104, (float) var29));
                    this.field10493.method238(112, class549.field7982);
                    var8.method2522((float) this.field10499, 0.0F, 126, (float) var29);
                    var8.method849(var27, var21, 0);
                    this.field10493.method384((byte) 19);
                    this.field10493.method337((byte) 18);
                }
                var21 += var20;
            }
            if (var21 < var17) {
                int var23 = var17 - var21;
                var9.method2522(this.field10504.method567((float) var23, 17714), 1.0F, 124, this.field10504.method561((byte) -127, (float) this.field10491));
                this.field10493.method238(120, class549.field7982);
                int var24 = arg0 + this.field10498;
                for (int var25 = this.field10491 + var24; var25 <= var18; var25 += var19) {
                    var8.method2522((float) var23, 0.0F, 125, (float) this.field10491);
                    var8.method849(var24, var21, 0);
                    this.field10493.method384((byte) 19);
                    this.field10493.method337((byte) 18);
                    var24 += var19;
                }
                if (var24 < var18) {
                    int var26 = var18 - var24;
                    var9.method2522(this.field10504.method567((float) var23, 17714), 1.0F, 125, this.field10504.method561((byte) -99, (float) var26));
                    this.field10493.method238(106, class549.field7982);
                    var8.method2522((float) var23, 0.0F, 125, (float) var26);
                    var8.method849(var24, var21, 0);
                    this.field10493.method384((byte) 19);
                    this.field10493.method337((byte) 18);
                }
            }
        }
        this.field10493.method389((byte) -2);
        this.field10493.method230(class401.field5746, 1, 42);
        this.field10493.method242((byte) -124, class401.field5746, 1);
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(IILaa;II)V", line = 592)
    public final void method781(int arg0, int arg1, class569 arg2, int arg3, int arg4) {
        field10486++;
        class628 var6 = (class628) arg2;
        int var7 = this.field10498 + arg0;
        int var8 = this.field10492 + arg1;
        class60 var9 = var6.field8902;
        this.field10504.method616(false, class435.field6224);
        this.field10493.method259((byte) -93);
        this.field10493.method264(this.field10504, -2);
        this.field10493.method355(1, (byte) -46);
        this.field10493.method411(17024, 1);
        class417 var10 = this.field10493.method345(0);
        var10.method2522((float) this.field10499, 0.0F, 124, (float) this.field10491);
        var10.method849(var7, var8, 0);
        this.field10493.method384((byte) 19);
        class417 var11 = this.field10493.method381((byte) 42);
        var11.method2522(this.field10504.method567((float) this.field10499, 17714), 1.0F, 126, this.field10504.method561((byte) 91, (float) this.field10491));
        this.field10493.method238(112, class549.field7982);
        this.field10493.method208(8, 1);
        this.field10493.method264(var9, -2);
        this.field10493.method386((byte) -116, class281.field3934, class567.field8198);
        this.field10493.method230(class401.field5746, 0, 56);
        class417 var12 = this.field10493.method381((byte) 42);
        var12.method2522(var9.method567((float) this.field10499, 17714), 1.0F, 124, var9.method561((byte) 69, (float) this.field10491));
        var12.method2538(var9.method561((byte) 80, (float) (var7 - arg3)), var9.method567((float) (var8 - arg4), 17714), 0.0F, 17831);
        this.field10493.method238(121, class549.field7982);
        this.field10493.method337((byte) 18);
        this.field10493.method389((byte) -2);
        this.field10493.method230(class234.field3509, 0, 80);
        this.field10493.method386((byte) 64, class281.field3934, class281.field3934);
        this.field10493.method264(null, -2);
        this.field10493.method208(8, 0);
        this.field10493.method389((byte) -2);
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(Z)V", line = 638)
    public static void method4193(boolean arg0) {
        if (!arg0) {
            field10506 = -115;
        }
        field10502 = null;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(IIIIIIII)V", line = 653)
    public final void method788(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field10500++;
        class417 var9 = this.field10493.method345(0);
        class417 var10 = this.field10493.method381((byte) 42);
        this.field10504.method616(false, this.field10482 || this.field10507 || (arg7 & 0x1) == 0 ? class435.field6224 : class23.field215);
        this.field10493.method259((byte) -93);
        this.field10493.method264(this.field10504, -2);
        this.field10493.method355(arg6, (byte) -48);
        this.field10493.method411(17024, arg4);
        this.field10493.method230(class231.field3462, 1, 99);
        this.field10493.method242((byte) -111, class231.field3462, 1);
        this.field10493.method213(arg5, 3);
        var10.method2522(this.field10504.method567((float) this.field10499, 17714), 1.0F, 124, this.field10504.method561((byte) 126, (float) this.field10491));
        if (this.field10488) {
            arg2 = this.field10491 * arg2 / this.method784();
            arg3 = this.field10499 * arg3 / this.method780();
            arg1 += this.field10492 * arg3 / this.field10499;
            arg0 += this.field10498 * arg2 / this.field10491;
        }
        var9.method2522((float) arg3, 0.0F, 126, (float) arg2);
        var9.method849(arg0, arg1, 0);
        this.field10493.method238(113, class549.field7982);
        this.field10493.method384((byte) 19);
        this.field10493.method337((byte) 18);
        this.field10493.method389((byte) -2);
        this.field10493.method230(class401.field5746, 1, 90);
        this.field10493.method242((byte) -126, class401.field5746, 1);
    }

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "(IIII)V", line = 697)
    public final void method783(int arg0, int arg1, int arg2, int arg3) {
        this.field10498 = arg0;
        this.field10496 = arg3;
        this.field10492 = arg1;
        field10480++;
        this.field10503 = arg2;
        this.field10488 = this.field10498 != 0 || this.field10492 != 0 || this.field10503 != 0 || this.field10496 != 0;
    }
}
