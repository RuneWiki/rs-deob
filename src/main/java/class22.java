import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qo")
public class class22 extends class481 {

    @OriginalMember(owner = "client!qo", name = "d", descriptor = "I")
    private int field389 = 0;

    @OriginalMember(owner = "client!qo", name = "r", descriptor = "I")
    private int field403 = 0;

    @OriginalMember(owner = "client!qo", name = "q", descriptor = "I")
    private int field402 = 0;

    @OriginalMember(owner = "client!qo", name = "v", descriptor = "I")
    private int field407 = 0;

    @OriginalMember(owner = "client!qo", name = "t", descriptor = "Z")
    private boolean field405 = false;

    @OriginalMember(owner = "client!qo", name = "G", descriptor = "Lij;")
    private class424 field418;

    @OriginalMember(owner = "client!qo", name = "o", descriptor = "I")
    private int field400;

    @OriginalMember(owner = "client!qo", name = "u", descriptor = "I")
    private int field406;

    @OriginalMember(owner = "client!qo", name = "e", descriptor = "Lwk;")
    private class145 field390;

    @OriginalMember(owner = "client!qo", name = "C", descriptor = "Z")
    private boolean field414;

    @OriginalMember(owner = "client!qo", name = "x", descriptor = "Z")
    private boolean field409;

    @OriginalMember(owner = "client!qo", name = "k", descriptor = "Z")
    private boolean field396;

    @OriginalMember(owner = "client!qo", name = "z", descriptor = "Z")
    private boolean field411;

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "I")
    public static int field386;

    @OriginalMember(owner = "client!qo", name = "b", descriptor = "I")
    public static int field387;

    @OriginalMember(owner = "client!qo", name = "c", descriptor = "I")
    public static int field388;

    @OriginalMember(owner = "client!qo", name = "f", descriptor = "I")
    public static int field391;

    @OriginalMember(owner = "client!qo", name = "g", descriptor = "I")
    public static int field392;

    @OriginalMember(owner = "client!qo", name = "h", descriptor = "I")
    public static int field393;

    @OriginalMember(owner = "client!qo", name = "i", descriptor = "I")
    public static int field394;

    @OriginalMember(owner = "client!qo", name = "j", descriptor = "I")
    public static int field395;

    @OriginalMember(owner = "client!qo", name = "l", descriptor = "I")
    public static int field397;

    @OriginalMember(owner = "client!qo", name = "m", descriptor = "I")
    public static int field398;

    @OriginalMember(owner = "client!qo", name = "n", descriptor = "I")
    public static int field399;

    @OriginalMember(owner = "client!qo", name = "p", descriptor = "I")
    public static int field401;

    @OriginalMember(owner = "client!qo", name = "s", descriptor = "I")
    public static int field404;

    @OriginalMember(owner = "client!qo", name = "w", descriptor = "I")
    public static int field408;

    @OriginalMember(owner = "client!qo", name = "y", descriptor = "I")
    public static int field410;

    @OriginalMember(owner = "client!qo", name = "A", descriptor = "I")
    public static int field412;

    @OriginalMember(owner = "client!qo", name = "B", descriptor = "I")
    public static int field413;

    @OriginalMember(owner = "client!qo", name = "E", descriptor = "I")
    public static int field416;

    @OriginalMember(owner = "client!qo", name = "F", descriptor = "I")
    public static int field417;

    @OriginalMember(owner = "client!qo", name = "D", descriptor = "[I")
    public static int[] field415;

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(IIII[III)V", line = 7)
    private final void method137(int arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5, int arg6) {
        this.field390.method812(arg0, arg6, arg5, arg1, arg4, arg2, arg3, -25782);
        field386++;
    }

    @OriginalMember(owner = "client!qo", name = "b", descriptor = "(IIIIIII)V", line = 16)
    public final void method138(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field417++;
        class477 var8 = this.field418.method2372(true);
        class477 var9 = this.field418.method2364((byte) -127);
        this.field390.method694(-21167, class291.field3813);
        this.field418.method2392(78);
        this.field418.method2396(22357, this.field390);
        this.field418.method2440(arg6, (byte) -63);
        this.field418.method2379(arg4, -15829);
        this.field418.method2394(class21.field383, (byte) 103, 1);
        this.field418.method2422(class21.field383, 1, (byte) -10);
        this.field418.method2382(arg5, -4068);
        boolean var10 = this.field411 && this.field403 == 0 && this.field402 == 0;
        boolean var11 = this.field396 && this.field389 == 0 && this.field407 == 0;
        if ((var10 & var11)) {
            var9.method2747(-16363, this.field390.method814(20275, (float) arg2), this.field390.method808((float) arg3, 9347), 1.0F);
            var8.method2747(-16363, (float) arg2, (float) arg3, 0.0F);
            var8.method600(arg0, arg1, 0);
            this.field418.method2384(2, class1.field2);
            this.field418.method2430(1);
            this.field418.method2437(2);
        } else if (var11) {
            int var30 = arg1 + arg3;
            int var31 = this.method149();
            var9.method2747(-16363, this.field390.method814(20275, (float) arg2), this.field390.method808((float) this.field406, 9347), 1.0F);
            this.field418.method2384(2, class1.field2);
            int var32 = arg1 + this.field403;
            int var33 = this.field406 + var32;
            while (var33 <= var30) {
                var8.method2747(-16363, (float) arg2, (float) this.field406, 0.0F);
                var8.method600(arg0, var32, 0);
                this.field418.method2430(1);
                var32 += var31;
                var33 += var31;
                this.field418.method2437(2);
            }
            if (var30 > var32) {
                int var34 = var30 - var32;
                var9.method2747(-16363, this.field390.method814(20275, (float) arg2), this.field390.method808((float) var34, 9347), 1.0F);
                this.field418.method2384(2, class1.field2);
                var8.method2747(-16363, (float) arg2, (float) var34, 0.0F);
                var8.method600(arg0, var32, 0);
                this.field418.method2430(1);
                this.field418.method2437(2);
            }
        } else if (var10) {
            int var25 = arg0 + arg2;
            int var26 = this.method142();
            var9.method2747(-16363, this.field390.method814(20275, (float) this.field400), this.field390.method808((float) arg3, 9347), 1.0F);
            this.field418.method2384(2, class1.field2);
            int var27 = this.field389 + arg0;
            for (int var28 = this.field400 + var27; var28 <= var25; var28 += var26) {
                var8.method2747(-16363, (float) this.field400, (float) arg3, 0.0F);
                var8.method600(var27, arg1, 0);
                this.field418.method2430(1);
                var27 += var26;
                this.field418.method2437(2);
            }
            if (var25 > var27) {
                int var29 = var25 - var27;
                var9.method2747(-16363, this.field390.method814(20275, (float) var29), this.field390.method808((float) arg3, 9347), 1.0F);
                this.field418.method2384(2, class1.field2);
                var8.method2747(-16363, (float) var29, (float) arg3, 0.0F);
                var8.method600(var27, arg1, 0);
                this.field418.method2430(1);
                this.field418.method2437(2);
            }
        } else {
            int var12 = arg1 + arg3;
            int var13 = arg0 + arg2;
            int var14 = this.method142();
            int var15 = this.method149();
            int var16 = this.field403 + arg1;
            for (int var17 = var16 + this.field406; var17 <= var12; var17 += var15) {
                var9.method2747(-16363, this.field390.method814(20275, (float) this.field400), this.field390.method808((float) this.field406, 9347), 1.0F);
                this.field418.method2384(2, class1.field2);
                int var22 = this.field389 + arg0;
                for (int var23 = var22 + this.field400; var23 <= var13; var23 += var14) {
                    var8.method2747(-16363, (float) this.field400, (float) this.field406, 0.0F);
                    var8.method600(var22, var16, 0);
                    this.field418.method2430(1);
                    var22 += var14;
                    this.field418.method2437(2);
                }
                if (var22 < var13) {
                    int var24 = var13 - var22;
                    var9.method2747(-16363, this.field390.method814(20275, (float) var24), this.field390.method808((float) this.field406, 9347), 1.0F);
                    this.field418.method2384(2, class1.field2);
                    var8.method2747(-16363, (float) var24, (float) this.field406, 0.0F);
                    var8.method600(var22, var16, 0);
                    this.field418.method2430(1);
                    this.field418.method2437(2);
                }
                var16 += var15;
            }
            if (var16 < var12) {
                int var18 = var12 - var16;
                var9.method2747(-16363, this.field390.method814(20275, (float) this.field400), this.field390.method808((float) var18, 9347), 1.0F);
                this.field418.method2384(2, class1.field2);
                int var19 = this.field389 + arg0;
                int var20 = this.field400 + var19;
                while (var20 <= var13) {
                    var8.method2747(-16363, (float) this.field400, (float) var18, 0.0F);
                    var8.method600(var19, var16, 0);
                    this.field418.method2430(1);
                    var20 += var14;
                    this.field418.method2437(2);
                    var19 += var14;
                }
                if (var13 > var19) {
                    int var21 = var13 - var19;
                    var9.method2747(-16363, this.field390.method814(20275, (float) var21), this.field390.method808((float) var18, 9347), 1.0F);
                    this.field418.method2384(2, class1.field2);
                    var8.method2747(-16363, (float) var21, (float) var18, 0.0F);
                    var8.method600(var19, var16, 0);
                    this.field418.method2430(1);
                    this.field418.method2437(2);
                }
            }
        }
        this.field418.method2418(11032);
        this.field418.method2394(class84.field1162, (byte) 101, 1);
        this.field418.method2422(class84.field1162, 1, (byte) -10);
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(Lsl;Ljava/lang/String;I)I", line = 220)
    public static final int method139(class461 arg0, String arg1, int arg2) {
        if (arg2 != 28108) {
            method153(5, null);
        }
        field397++;
        int var3 = arg0.field6193;
        byte[] var4 = class692.method3881(-119, arg1);
        arg0.method2618(var4.length, (byte) 22);
        arg0.field6193 += class43.field636.method3248(0, (byte) -67, var4.length, var4, arg0.field6180, arg0.field6193);
        return arg0.field6193 - var3;
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(IILaa;II)V", line = 241)
    public final void method140(int arg0, int arg1, class489 arg2, int arg3, int arg4) {
        field401++;
        class96 var6 = (class96) arg2;
        int var7 = this.field403 + arg1;
        class145 var8 = var6.field1335;
        int var9 = this.field389 + arg0;
        this.field390.method694(-21167, class291.field3813);
        this.field418.method2392(75);
        this.field418.method2396(22357, this.field390);
        this.field418.method2440(1, (byte) -102);
        this.field418.method2379(1, -15829);
        class477 var10 = this.field418.method2372(true);
        var10.method2747(-16363, (float) this.field400, (float) this.field406, 0.0F);
        var10.method600(var9, var7, 0);
        this.field418.method2430(1);
        class477 var11 = this.field418.method2364((byte) -127);
        var11.method2747(-16363, this.field390.method814(20275, (float) this.field400), this.field390.method808((float) this.field406, 9347), 1.0F);
        this.field418.method2384(2, class1.field2);
        this.field418.method2393(1, (byte) -99);
        this.field418.method2396(22357, var8);
        this.field418.method2397(class476.field6418, class405.field5120, (byte) -79);
        this.field418.method2394(class84.field1162, (byte) 103, 0);
        class477 var12 = this.field418.method2364((byte) -127);
        var12.method2747(-16363, var8.method814(20275, (float) this.field400), var8.method808((float) this.field406, 9347), 1.0F);
        var12.method2732(0.0F, 14751, var8.method814(20275, (float) (var9 - arg3)), var8.method808((float) (var7 - arg4), 9347));
        this.field418.method2384(2, class1.field2);
        this.field418.method2437(2);
        this.field418.method2418(11032);
        this.field418.method2394(class447.field5937, (byte) 81, 0);
        this.field418.method2397(class405.field5120, class405.field5120, (byte) 101);
        this.field418.method2396(22357, null);
        this.field418.method2393(0, (byte) -114);
        this.field418.method2418(11032);
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(IIB)Z", line = 287)
    public static final boolean method141(int arg0, int arg1, byte arg2) {
        if (arg2 != -28) {
            method156((byte) -27);
        }
        field395++;
        return (arg0 & 0x100) != 0;
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "()I", line = 300)
    public final int method142() {
        field410++;
        return this.field407 + this.field400 + this.field389;
    }

    @OriginalMember(owner = "client!qo", name = "c", descriptor = "()I", line = 310)
    public final int method143() {
        field387++;
        return this.field400;
    }

    @OriginalMember(owner = "client!qo", name = "b", descriptor = "()I", line = 318)
    public final int method144() {
        field391++;
        return this.field406;
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(III)V", line = 329)
    public final void method145(int arg0, int arg1, int arg2) {
        field388++;
        int[] var4 = this.field418.method465(arg0, arg1, this.field400, this.field406);
        int[] var5 = new int[this.field406 * this.field400];
        this.field390.method807(this.field400, 0, var5, 0, this.field406, 19229, 0);
        if (arg2 == 0) {
            for (int var15 = 0; var15 < this.field406; var15++) {
                int var16 = this.field400 * var15;
                for (int var17 = 0; var17 < this.field400; var17++) {
                    var5[var16 + var17] = class683.method3840(class702.method3949(var4[var16 + var17], -1342242816) << 8, class702.method3949(16777215, var5[var16 + var17]));
                }
            }
        } else if (arg2 == 1) {
            for (int var6 = 0; var6 < this.field406; var6++) {
                int var7 = this.field400 * var6;
                for (int var8 = 0; var8 < this.field400; var8++) {
                    var5[var7 + var8] = class683.method3840(class702.method3949(16777215, var5[var7 + var8]), class702.method3949(var4[var7 + var8] << 16, -16772346));
                }
            }
        } else if (arg2 == 2) {
            for (int var9 = 0; var9 < this.field406; var9++) {
                int var10 = this.field400 * var9;
                for (int var11 = 0; var11 < this.field400; var11++) {
                    var5[var10 + var11] = class683.method3840(class702.method3949(var5[var10 + var11], 16777215), class702.method3949(var4[var10 + var11] << 24, -4435786));
                }
            }
        } else if (arg2 == 3) {
            for (int var12 = 0; var12 < this.field406; var12++) {
                int var13 = this.field400 * var12;
                for (int var14 = 0; var14 < this.field400; var14++) {
                    var5[var13 + var14] = class683.method3840(class702.method3949(var5[var13 + var14], 16777215), var4[var13 + var14] == 0 ? 0 : -16777216);
                }
            }
        }
        this.method137(0, 0, this.field400, this.field406, var5, 0, this.field400);
    }

    @OriginalMember(owner = "client!qo", name = "<init>", descriptor = "(Lij;IIZ)V", line = 805)
    public class22(class424 arg0, int arg1, int arg2, boolean arg3) {
        this.field418 = arg0;
        this.field400 = arg1;
        this.field406 = arg2;
        this.field390 = arg0.method2012(class285.field3589, arg2, arg1, (byte) -105, arg3 ? class269.field3396 : class654.field9096);
        this.field390.method813((byte) 60, true, true);
        this.field414 = arg1 != this.field390.method815(11283);
        this.field409 = this.field390.method806(119) != arg2;
        this.field396 = !this.field414 && this.field390.method803(-68);
        this.field411 = !this.field409 && this.field390.method803(-85);
    }

    @OriginalMember(owner = "client!qo", name = "<init>", descriptor = "(Lij;II[III)V", line = 820)
    public class22(class424 arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5) {
        this.field406 = arg2;
        this.field418 = arg0;
        this.field400 = arg1;
        this.field390 = arg0.method2010(false, arg3, arg5, (byte) 0, arg1, arg2, arg4);
        this.field390.method813((byte) -49, true, true);
        this.field414 = this.field390.method815(11283) != arg1;
        this.field409 = this.field390.method806(126) != arg2;
        this.field396 = !this.field414 && this.field390.method803(-82);
        this.field411 = !this.field409 && this.field390.method803(-41);
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(FFFFFFILaa;II)V", line = 442)
    public final void method146(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, class489 arg7, int arg8, int arg9) {
        field394++;
        class477 var11 = this.field418.method2372(true);
        class477 var12 = this.field418.method2364((byte) -127);
        class96 var13 = (class96) arg7;
        class145 var14 = var13.field1335;
        this.field390.method694(-21167, this.field414 || this.field409 || ~(arg6 & 0x1) == -1 ? class291.field3813 : class223.field2980);
        this.field418.method2392(54);
        this.field418.method2396(22357, this.field390);
        this.field418.method2440(1, (byte) -92);
        this.field418.method2379(1, -15829);
        if (this.field405) {
            float var15 = (float) this.field400 / (float) this.method142();
            float var16 = (float) this.field406 / (float) this.method149();
            var11.method2733((arg3 - arg1) * var15, 0.0F, (arg4 - arg0) * var16, 0.0F, 29945, 0.0F, (arg5 - arg1) * var16, 0.0F, 1.0F, (arg2 - arg0) * var15);
            var11.method2732(0.0F, 14751, ((float) this.field389 + arg0) * var15, ((float) this.field403 + arg1) * var16);
        } else {
            var11.method2733(arg3 - arg1, 0.0F, arg4 - arg0, 0.0F, 29945, 0.0F, arg5 - arg1, 0.0F, 1.0F, arg2 - arg0);
            var11.method2732(0.0F, 14751, arg0, arg1);
        }
        var12.method2747(-16363, this.field390.method814(20275, (float) this.field400), this.field390.method808((float) this.field406, 9347), 1.0F);
        this.field418.method2384(2, class1.field2);
        this.field418.method2393(1, (byte) 74);
        this.field418.method2396(22357, var14);
        this.field418.method2397(class476.field6418, class405.field5120, (byte) 102);
        this.field418.method2394(class84.field1162, (byte) 59, 0);
        class477 var17 = this.field418.method2364((byte) -127);
        var17.method604(var11);
        var17.method600(-arg8, -arg9, 0);
        var17.method2738(var14.method814(20275, 1.0F), 1.0F, -14019, var14.method808(1.0F, 9347));
        this.field418.method2384(2, class1.field2);
        this.field418.method2430(1);
        this.field418.method2437(2);
        this.field418.method2418(11032);
        this.field418.method2394(class447.field5937, (byte) 119, 0);
        this.field418.method2397(class405.field5120, class405.field5120, (byte) -127);
        this.field418.method2396(22357, null);
        this.field418.method2393(0, (byte) -103);
        this.field418.method2418(11032);
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(IIII)V", line = 498)
    public final void method147(int arg0, int arg1, int arg2, int arg3) {
        this.field402 = arg3;
        this.field403 = arg1;
        field392++;
        this.field389 = arg0;
        this.field407 = arg2;
        this.field405 = this.field389 != 0 || this.field403 != 0 || this.field407 != 0 || this.field402 != 0;
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(IIIII)V", line = 511)
    public final void method148(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field398++;
        class477 var6 = this.field418.method2372(true);
        class477 var7 = this.field418.method2364((byte) -127);
        int var8 = this.field389 + arg0;
        int var9 = this.field403 + arg1;
        this.field390.method694(-21167, class291.field3813);
        this.field418.method2392(54);
        this.field418.method2396(22357, this.field390);
        this.field418.method2440(arg4, (byte) -83);
        this.field418.method2379(arg2, -15829);
        this.field418.method2394(class21.field383, (byte) 116, 1);
        this.field418.method2422(class21.field383, 1, (byte) -10);
        this.field418.method2382(arg3, -4068);
        var6.method2747(-16363, (float) this.field400, (float) this.field406, 0.0F);
        var6.method600(var8, var9, 0);
        var7.method2747(-16363, this.field390.method814(20275, (float) this.field400), this.field390.method808((float) this.field406, 9347), 1.0F);
        this.field418.method2384(2, class1.field2);
        this.field418.method2430(1);
        this.field418.method2437(2);
        this.field418.method2418(11032);
        this.field418.method2394(class84.field1162, (byte) 83, 1);
        this.field418.method2422(class84.field1162, 1, (byte) -10);
    }

    @OriginalMember(owner = "client!qo", name = "d", descriptor = "()I", line = 544)
    public final int method149() {
        field412++;
        return this.field403 + this.field402 + this.field406;
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(FFFFFFIIII)V", line = 556)
    public final void method150(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8, int arg9) {
        field408++;
        class477 var11 = this.field418.method2372(true);
        class477 var12 = this.field418.method2364((byte) -127);
        this.field390.method694(-21167, this.field414 || this.field409 || ~(arg9 & 0x1) == -1 ? class291.field3813 : class223.field2980);
        this.field418.method2392(100);
        this.field418.method2396(22357, this.field390);
        this.field418.method2440(arg8, (byte) -67);
        this.field418.method2379(arg6, -15829);
        this.field418.method2394(class21.field383, (byte) 97, 1);
        this.field418.method2422(class21.field383, 1, (byte) -10);
        this.field418.method2382(arg7, -4068);
        if (this.field405) {
            float var13 = (float) this.method142();
            float var14 = (float) this.method149();
            float var15 = (arg2 - arg0) / var13;
            float var16 = (arg3 - arg1) / var13;
            float var17 = (arg4 - arg0) / var14;
            float var18 = (arg5 - arg1) / var14;
            float var19 = (float) this.field403 * var17;
            float var20 = (float) this.field403 * var18;
            float var21 = (float) this.field389 * var15;
            float var22 = (float) this.field389 * var16;
            float var23 = (float) this.field407 * -var15;
            float var24 = (float) this.field407 * -var16;
            float var25 = (float) this.field402 * -var17;
            arg0 = arg0 + var21 + var19;
            arg1 = arg1 + var22 + var20;
            arg2 = arg2 + var23 + var19;
            arg4 = arg4 + var21 + var25;
            float var26 = (float) this.field402 * -var18;
            arg3 = arg3 + var24 + var20;
            arg5 = arg5 + var22 + var26;
        }
        var11.method2733(arg3 - arg1, 0.0F, arg4 - arg0, 0.0F, 29945, 0.0F, arg5 - arg1, 0.0F, 1.0F, arg2 - arg0);
        var11.method2732(0.0F, 14751, arg0, arg1);
        var12.method2747(-16363, this.field390.method814(20275, (float) this.field400), this.field390.method808((float) this.field406, 9347), 1.0F);
        this.field418.method2384(2, class1.field2);
        this.field418.method2430(1);
        this.field418.method2437(2);
        this.field418.method2418(11032);
        this.field418.method2394(class84.field1162, (byte) 114, 1);
        this.field418.method2422(class84.field1162, 1, (byte) -10);
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(IIIIIIII)V", line = 625)
    public final void method151(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field404++;
        class477 var9 = this.field418.method2372(true);
        class477 var10 = this.field418.method2364((byte) -127);
        this.field390.method694(-21167, this.field414 || this.field409 || (arg7 & 0x1) == 0 ? class291.field3813 : class223.field2980);
        this.field418.method2392(90);
        this.field418.method2396(22357, this.field390);
        this.field418.method2440(arg6, (byte) -66);
        this.field418.method2379(arg4, -15829);
        this.field418.method2394(class21.field383, (byte) 97, 1);
        this.field418.method2422(class21.field383, 1, (byte) -10);
        this.field418.method2382(arg5, -4068);
        var10.method2747(-16363, this.field390.method814(20275, (float) this.field400), this.field390.method808((float) this.field406, 9347), 1.0F);
        if (this.field405) {
            arg2 = this.field400 * arg2 / this.method142();
            arg3 = this.field406 * arg3 / this.method149();
            arg1 += this.field403 * arg3 / this.field406;
            arg0 += this.field389 * arg2 / this.field400;
        }
        var9.method2747(-16363, (float) arg2, (float) arg3, 0.0F);
        var9.method600(arg0, arg1, 0);
        this.field418.method2384(2, class1.field2);
        this.field418.method2430(1);
        this.field418.method2437(2);
        this.field418.method2418(11032);
        this.field418.method2394(class84.field1162, (byte) 85, 1);
        this.field418.method2422(class84.field1162, 1, (byte) -10);
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "([I)V", line = 663)
    public final void method152(int[] arg0) {
        arg0[2] = this.field407;
        arg0[1] = this.field403;
        arg0[3] = this.field402;
        arg0[0] = this.field389;
        field393++;
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(ILjava/lang/String;)V", line = 675)
    public static final void method153(int arg0, String arg1) {
        field413++;
        if (arg1 == null) {
            return;
        }
        if (arg1.startsWith("*")) {
            arg1 = arg1.substring(1);
        }
        String var2 = class286.method1701(-1, arg1);
        if (var2 == null) {
            return;
        }
        for (int var3 = arg0; var3 < class600.field8359; var3++) {
            String var4 = class207.field2748[var3];
            if (var4.startsWith("*")) {
                var4 = var4.substring(1);
            }
            String var5 = class286.method1701(arg0 - 1, var4);
            if (var5 != null && var5.equals(var2)) {
                class600.field8359--;
                for (int var6 = var3; var6 < class600.field8359; var6++) {
                    class207.field2748[var6] = class207.field2748[var6 + 1];
                    class726.field10124[var6] = class726.field10124[var6 + 1];
                    class698.field9713[var6] = class698.field9713[var6 + 1];
                    class524.field7328[var6] = class524.field7328[var6 + 1];
                    class61.field851[var6] = class61.field851[var6 + 1];
                    class512.field7202[var6] = class512.field7202[var6 + 1];
                }
                class42.field624 = class676.field9444;
                class320.field4134++;
                class589 var7 = class514.method2994(-29488, class760.field10605, class75.field1062);
                var7.field8251.method2578(class747.method4155(-1, arg1), -1221492240);
                var7.field8251.method2597(arg1, (byte) 98);
                class737.method4107(var7, 7);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(IIIIII)V", line = 739)
    public final void method154(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field399++;
        int[] var7 = this.field418.method465(arg4, arg5, arg2, arg3);
        if (var7 != null) {
            for (int var8 = 0; var8 < var7.length; var8++) {
                var7[var8] = class683.method3840(var7[var8], -16777216);
            }
            this.method137(arg0, arg1, arg2, arg3, var7, 0, arg2);
        }
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(Ljava/lang/String;IILbi;)Ljq;", line = 761)
    public static final class514 method155(String arg0, int arg1, int arg2, class483 arg3) {
        field416++;
        int var4 = OpenGL.glGenProgramARB();
        OpenGL.glBindProgramARB(arg2, var4);
        OpenGL.glProgramStringARB(arg2, 34933, arg0);
        OpenGL.glGetIntegerv(34379, class68.field965, 0);
        if (class68.field965[0] != -1) {
            OpenGL.glBindProgramARB(arg2, 0);
            return null;
        }
        OpenGL.glBindProgramARB(arg2, 0);
        if (arg1 != 6672) {
            field415 = null;
        }
        return new class514(arg3, arg2, var4);
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(B)V", line = 786)
    public static void method156(byte arg0) {
        field415 = null;
        if (arg0 >= -93) {
            method156((byte) -81);
        }
    }
}
