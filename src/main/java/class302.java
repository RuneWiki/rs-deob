import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!b")
public class class302 extends class702 {

    @OriginalMember(owner = "client!b", name = "a", descriptor = "I")
    private int field4476 = 0;

    @OriginalMember(owner = "client!b", name = "f", descriptor = "I")
    private int field4481 = 0;

    @OriginalMember(owner = "client!b", name = "i", descriptor = "Z")
    private boolean field4484 = false;

    @OriginalMember(owner = "client!b", name = "r", descriptor = "I")
    private int field4493 = 0;

    @OriginalMember(owner = "client!b", name = "w", descriptor = "I")
    private int field4498 = 0;

    @OriginalMember(owner = "client!b", name = "C", descriptor = "I")
    private int field4504;

    @OriginalMember(owner = "client!b", name = "b", descriptor = "I")
    private int field4477;

    @OriginalMember(owner = "client!b", name = "v", descriptor = "Lhea;")
    private class387 field4497;

    @OriginalMember(owner = "client!b", name = "d", descriptor = "Loi;")
    private class65 field4479;

    @OriginalMember(owner = "client!b", name = "c", descriptor = "Z")
    private boolean field4478;

    @OriginalMember(owner = "client!b", name = "t", descriptor = "Z")
    private boolean field4495;

    @OriginalMember(owner = "client!b", name = "k", descriptor = "Z")
    private boolean field4486;

    @OriginalMember(owner = "client!b", name = "A", descriptor = "Z")
    private boolean field4502;

    @OriginalMember(owner = "client!b", name = "s", descriptor = "Lwba;")
    public static class46 field4494 = new class46();

    @OriginalMember(owner = "client!b", name = "E", descriptor = "Lnea;")
    public static class664 field4506 = new class664(87, 6);

    @OriginalMember(owner = "client!b", name = "e", descriptor = "I")
    public static int field4480;

    @OriginalMember(owner = "client!b", name = "g", descriptor = "I")
    public static int field4482;

    @OriginalMember(owner = "client!b", name = "h", descriptor = "I")
    public static int field4483;

    @OriginalMember(owner = "client!b", name = "j", descriptor = "I")
    public static int field4485;

    @OriginalMember(owner = "client!b", name = "l", descriptor = "I")
    public static int field4487;

    @OriginalMember(owner = "client!b", name = "m", descriptor = "I")
    public static int field4488;

    @OriginalMember(owner = "client!b", name = "n", descriptor = "I")
    public static int field4489;

    @OriginalMember(owner = "client!b", name = "o", descriptor = "I")
    public static int field4490;

    @OriginalMember(owner = "client!b", name = "p", descriptor = "I")
    public static int field4491;

    @OriginalMember(owner = "client!b", name = "q", descriptor = "I")
    public static int field4492;

    @OriginalMember(owner = "client!b", name = "u", descriptor = "I")
    public static int field4496;

    @OriginalMember(owner = "client!b", name = "x", descriptor = "I")
    public static int field4499;

    @OriginalMember(owner = "client!b", name = "y", descriptor = "I")
    public static int field4500;

    @OriginalMember(owner = "client!b", name = "z", descriptor = "I")
    public static int field4501;

    @OriginalMember(owner = "client!b", name = "B", descriptor = "I")
    public static int field4503;

    @OriginalMember(owner = "client!b", name = "D", descriptor = "I")
    public static int field4505;

    @OriginalMember(owner = "client!b", name = "F", descriptor = "I")
    public static int field4507;

    @OriginalMember(owner = "client!b", name = "G", descriptor = "I")
    public static int field4508;

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(FFFFFFILua;II)V", line = 3)
    public final void method930(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, class617 arg7, int arg8, int arg9) {
        field4501++;
        class21 var11 = this.field4497.method2336(false);
        class21 var12 = this.field4497.method2327(true);
        class602 var13 = (class602) arg7;
        class65 var14 = var13.field8508;
        this.field4479.method54(this.field4478 || this.field4495 || (arg6 & 0x1) == 0 ? class630.field8812 : class69.field1245, -26149);
        this.field4497.method2386((byte) 86);
        this.field4497.method2337(false, this.field4479);
        this.field4497.method2326(true, 1);
        this.field4497.method2308(-1, 1);
        if (this.field4484) {
            float var15 = (float) this.field4477 / (float) this.method931();
            float var16 = (float) this.field4504 / (float) this.method936();
            var11.method263((arg4 - arg0) * var16, (byte) 46, (arg2 - arg0) * var15, (arg3 - arg1) * var15, (arg5 - arg1) * var16, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F);
            var11.method265(((float) this.field4498 + arg1) * var16, 0.0F, 87, ((float) this.field4493 + arg0) * var15);
        } else {
            var11.method263(arg4 - arg0, (byte) 46, arg2 - arg0, arg3 - arg1, arg5 - arg1, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F);
            var11.method265(arg1, 0.0F, 107, arg0);
        }
        var12.method242(1.0F, this.field4479.method666(true, (float) this.field4504), this.field4479.method661((float) this.field4477, 103), (byte) 115);
        this.field4497.method2356(0, class266.field4017);
        this.field4497.method2351(0, 1);
        this.field4497.method2337(false, var14);
        this.field4497.method2339(class190.field2740, -32540, class153.field2209);
        this.field4497.method2324(0, class319.field4696, 1);
        class21 var17 = this.field4497.method2327(true);
        var17.method274(var11);
        var17.method270(-arg8, -arg9, 0);
        var17.method246(var14.method666(true, 1.0F), var14.method661(1.0F, -122), 1.0F, 6652);
        this.field4497.method2356(0, class266.field4017);
        this.field4497.method2340(false);
        this.field4497.method2311((byte) -127);
        this.field4497.method2358(-1);
        this.field4497.method2324(0, class61.field1155, 1);
        this.field4497.method2339(class153.field2209, -32540, class153.field2209);
        this.field4497.method2337(false, null);
        this.field4497.method2351(0, 0);
        this.field4497.method2358(-1);
    }

    @OriginalMember(owner = "client!b", name = "DA", descriptor = "(IIIIIII)V", line = 59)
    public final void method926(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field4496++;
        class21 var8 = this.field4497.method2336(false);
        class21 var9 = this.field4497.method2327(true);
        this.field4479.method54(class630.field8812, -26149);
        this.field4497.method2386((byte) 86);
        this.field4497.method2337(false, this.field4479);
        this.field4497.method2326(true, arg6);
        this.field4497.method2308(-1, arg4);
        this.field4497.method2324(1, class124.field1869, 1);
        this.field4497.method2360(1, class124.field1869, 1);
        this.field4497.method2321(arg5, 24);
        boolean var10 = this.field4502 && this.field4498 == 0 && this.field4481 == 0;
        boolean var11 = this.field4486 && this.field4493 == 0 && this.field4476 == 0;
        if ((var10 & var11)) {
            var9.method242(1.0F, this.field4479.method666(true, (float) arg3), this.field4479.method661((float) arg2, 125), (byte) -112);
            var8.method242(0.0F, (float) arg3, (float) arg2, (byte) 97);
            var8.method270(arg0, arg1, 0);
            this.field4497.method2356(0, class266.field4017);
            this.field4497.method2340(false);
            this.field4497.method2311((byte) -128);
        } else if (var11) {
            int var12 = arg1 + arg3;
            int var13 = this.method936();
            var9.method242(1.0F, this.field4479.method666(true, (float) this.field4504), this.field4479.method661((float) arg2, 119), (byte) 119);
            this.field4497.method2356(0, class266.field4017);
            int var14 = this.field4498 + arg1;
            for (int var15 = this.field4504 + var14; var15 <= var12; var15 += var13) {
                var8.method242(0.0F, (float) this.field4504, (float) arg2, (byte) -56);
                var8.method270(arg0, var14, 0);
                this.field4497.method2340(false);
                var14 += var13;
                this.field4497.method2311((byte) -127);
            }
            if (var14 < var12) {
                int var16 = var12 - var14;
                var9.method242(1.0F, this.field4479.method666(true, (float) var16), this.field4479.method661((float) arg2, 74), (byte) -97);
                this.field4497.method2356(0, class266.field4017);
                var8.method242(0.0F, (float) var16, (float) arg2, (byte) -85);
                var8.method270(arg0, var14, 0);
                this.field4497.method2340(false);
                this.field4497.method2311((byte) -128);
            }
        } else if (var10) {
            int var30 = arg0 + arg2;
            int var31 = this.method931();
            var9.method242(1.0F, this.field4479.method666(true, (float) arg3), this.field4479.method661((float) this.field4477, 89), (byte) 99);
            this.field4497.method2356(0, class266.field4017);
            int var32 = this.field4493 + arg0;
            int var33 = this.field4477 + var32;
            while (var30 >= var33) {
                var8.method242(0.0F, (float) arg3, (float) this.field4477, (byte) 126);
                var8.method270(var32, arg1, 0);
                this.field4497.method2340(false);
                var33 += var31;
                var32 += var31;
                this.field4497.method2311((byte) -127);
            }
            if (var32 < var30) {
                int var34 = var30 - var32;
                var9.method242(1.0F, this.field4479.method666(true, (float) arg3), this.field4479.method661((float) var34, -87), (byte) 111);
                this.field4497.method2356(0, class266.field4017);
                var8.method242(0.0F, (float) arg3, (float) var34, (byte) -69);
                var8.method270(var32, arg1, 0);
                this.field4497.method2340(false);
                this.field4497.method2311((byte) -127);
            }
        } else {
            int var17 = arg1 + arg3;
            int var18 = arg0 + arg2;
            int var19 = this.method931();
            int var20 = this.method936();
            int var21 = this.field4498 + arg1;
            int var22 = this.field4504 + var21;
            while (var22 <= var17) {
                var9.method242(1.0F, this.field4479.method666(true, (float) this.field4504), this.field4479.method661((float) this.field4477, 107), (byte) 102);
                this.field4497.method2356(0, class266.field4017);
                int var27 = arg0 + this.field4493;
                int var28 = this.field4477 + var27;
                while (var18 >= var28) {
                    var8.method242(0.0F, (float) this.field4504, (float) this.field4477, (byte) -93);
                    var8.method270(var27, var21, 0);
                    this.field4497.method2340(false);
                    var28 += var19;
                    var27 += var19;
                    this.field4497.method2311((byte) -127);
                }
                if (var18 > var27) {
                    int var29 = var18 - var27;
                    var9.method242(1.0F, this.field4479.method666(true, (float) this.field4504), this.field4479.method661((float) var29, -91), (byte) 115);
                    this.field4497.method2356(0, class266.field4017);
                    var8.method242(0.0F, (float) this.field4504, (float) var29, (byte) 112);
                    var8.method270(var27, var21, 0);
                    this.field4497.method2340(false);
                    this.field4497.method2311((byte) -128);
                }
                var22 += var20;
                var21 += var20;
            }
            if (var17 > var21) {
                int var23 = var17 - var21;
                var9.method242(1.0F, this.field4479.method666(true, (float) var23), this.field4479.method661((float) this.field4477, -83), (byte) -63);
                this.field4497.method2356(0, class266.field4017);
                int var24 = this.field4493 + arg0;
                for (int var25 = this.field4477 + var24; var25 <= var18; var25 += var19) {
                    var8.method242(0.0F, (float) var23, (float) this.field4477, (byte) -101);
                    var8.method270(var24, var21, 0);
                    this.field4497.method2340(false);
                    var24 += var19;
                    this.field4497.method2311((byte) -128);
                }
                if (var24 < var18) {
                    int var26 = var18 - var24;
                    var9.method242(1.0F, this.field4479.method666(true, (float) var23), this.field4479.method661((float) var26, 49), (byte) 115);
                    this.field4497.method2356(0, class266.field4017);
                    var8.method242(0.0F, (float) var23, (float) var26, (byte) -116);
                    var8.method270(var24, var21, 0);
                    this.field4497.method2340(false);
                    this.field4497.method2311((byte) -127);
                }
            }
        }
        this.field4497.method2358(-1);
        this.field4497.method2324(1, class319.field4696, 1);
        this.field4497.method2360(1, class319.field4696, 1);
    }

    @OriginalMember(owner = "client!b", name = "ca", descriptor = "()I", line = 269)
    public final int method936() {
        field4500++;
        return this.field4504 + this.field4481 + this.field4498;
    }

    @OriginalMember(owner = "client!b", name = "u", descriptor = "()I", line = 282)
    public final int method939() {
        field4503++;
        return this.field4504;
    }

    @OriginalMember(owner = "client!b", name = "<init>", descriptor = "(Lhea;IIZ)V", line = 632)
    public class302(class387 arg0, int arg1, int arg2, boolean arg3) {
        this.field4504 = arg2;
        this.field4477 = arg1;
        this.field4497 = arg0;
        this.field4479 = arg0.method1899(arg2, class218.field3050, arg3 ? class75.field1306 : class502.field7105, arg1, (byte) -127);
        this.field4479.method663((byte) -102, true, true);
        this.field4478 = this.field4479.method665(false) != arg1;
        this.field4495 = this.field4479.method668(31607) != arg2;
        this.field4486 = !this.field4478 && this.field4479.method662(false);
        this.field4502 = !this.field4495 && this.field4479.method662(false);
    }

    @OriginalMember(owner = "client!b", name = "<init>", descriptor = "(Lhea;II[III)V", line = 647)
    public class302(class387 arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5) {
        this.field4477 = arg1;
        this.field4504 = arg2;
        this.field4497 = arg0;
        this.field4479 = arg0.method1869(52, arg4, false, arg3, arg1, arg2, arg5);
        this.field4479.method663((byte) -102, true, true);
        this.field4478 = arg1 != this.field4479.method665(false);
        this.field4495 = this.field4479.method668(31607) != arg2;
        this.field4486 = !this.field4478 && this.field4479.method662(false);
        this.field4502 = !this.field4495 && this.field4479.method662(false);
    }

    @OriginalMember(owner = "client!b", name = "YA", descriptor = "(IIIIIIII)V", line = 295)
    public final void method937(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field4488++;
        class21 var9 = this.field4497.method2336(false);
        class21 var10 = this.field4497.method2327(true);
        this.field4479.method54(this.field4478 || this.field4495 || (arg7 & 0x1) == 0 ? class630.field8812 : class69.field1245, -26149);
        this.field4497.method2386((byte) 86);
        this.field4497.method2337(false, this.field4479);
        this.field4497.method2326(true, arg6);
        this.field4497.method2308(-1, arg4);
        this.field4497.method2324(1, class124.field1869, 1);
        this.field4497.method2360(1, class124.field1869, 1);
        this.field4497.method2321(arg5, 24);
        var10.method242(1.0F, this.field4479.method666(true, (float) this.field4504), this.field4479.method661((float) this.field4477, -105), (byte) -118);
        if (this.field4484) {
            arg2 = this.field4477 * arg2 / this.method931();
            arg3 = this.field4504 * arg3 / this.method936();
            arg1 += this.field4498 * arg3 / this.field4504;
            arg0 += this.field4493 * arg2 / this.field4477;
        }
        var9.method242(0.0F, (float) arg3, (float) arg2, (byte) -64);
        var9.method270(arg0, arg1, 0);
        this.field4497.method2356(0, class266.field4017);
        this.field4497.method2340(false);
        this.field4497.method2311((byte) -128);
        this.field4497.method2358(-1);
        this.field4497.method2324(1, class319.field4696, 1);
        this.field4497.method2360(1, class319.field4696, 1);
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(BI[BLhp;)Lwq;", line = 334)
    public static final class151 method1935(byte arg0, int arg1, byte[] arg2, class296 arg3) {
        field4487++;
        if (arg2 == null) {
            return null;
        }
        int var4 = OpenGL.glGenProgramARB();
        OpenGL.glBindProgramARB(arg1, var4);
        OpenGL.glProgramRawARB(arg1, 34933, arg2);
        if (arg0 != 116) {
            method1936(53, 27, -116);
        }
        OpenGL.glGetIntegerv(34379, class89.field1484, 0);
        if (class89.field1484[0] == -1) {
            OpenGL.glBindProgramARB(arg1, 0);
            return new class151(arg3, arg1, var4);
        } else {
            OpenGL.glBindProgramARB(arg1, 0);
            return null;
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(IILua;II)V", line = 370)
    public final void method933(int arg0, int arg1, class617 arg2, int arg3, int arg4) {
        field4480++;
        class602 var6 = (class602) arg2;
        int var7 = this.field4493 + arg0;
        class65 var8 = var6.field8508;
        int var9 = this.field4498 + arg1;
        this.field4479.method54(class630.field8812, -26149);
        this.field4497.method2386((byte) 86);
        this.field4497.method2337(false, this.field4479);
        this.field4497.method2326(true, 1);
        this.field4497.method2308(-1, 1);
        class21 var10 = this.field4497.method2336(false);
        var10.method242(0.0F, (float) this.field4504, (float) this.field4477, (byte) -58);
        var10.method270(var7, var9, 0);
        this.field4497.method2340(false);
        class21 var11 = this.field4497.method2327(true);
        var11.method242(1.0F, this.field4479.method666(true, (float) this.field4504), this.field4479.method661((float) this.field4477, -116), (byte) -71);
        this.field4497.method2356(0, class266.field4017);
        this.field4497.method2351(0, 1);
        this.field4497.method2337(false, var8);
        this.field4497.method2339(class190.field2740, -32540, class153.field2209);
        this.field4497.method2324(0, class319.field4696, 1);
        class21 var12 = this.field4497.method2327(true);
        var12.method242(1.0F, var8.method666(true, (float) this.field4504), var8.method661((float) this.field4477, -114), (byte) 79);
        var12.method265(var8.method666(true, (float) (var9 - arg4)), 0.0F, 114, var8.method661((float) (var7 - arg3), 56));
        this.field4497.method2356(0, class266.field4017);
        this.field4497.method2311((byte) -127);
        this.field4497.method2358(-1);
        this.field4497.method2324(0, class61.field1155, 1);
        this.field4497.method2339(class153.field2209, -32540, class153.field2209);
        this.field4497.method2337(false, null);
        this.field4497.method2351(0, 0);
        this.field4497.method2358(-1);
    }

    @OriginalMember(owner = "client!b", name = "xa", descriptor = "(III)V", line = 415)
    public final void method934(int arg0, int arg1, int arg2) {
        field4482++;
    }

    @OriginalMember(owner = "client!b", name = "V", descriptor = "(IIIII)V", line = 424)
    public final void method929(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field4491++;
        class21 var6 = this.field4497.method2336(false);
        class21 var7 = this.field4497.method2327(true);
        int var8 = this.field4498 + arg1;
        int var9 = this.field4493 + arg0;
        this.field4479.method54(class630.field8812, -26149);
        this.field4497.method2386((byte) 86);
        this.field4497.method2337(false, this.field4479);
        this.field4497.method2326(true, arg4);
        this.field4497.method2308(-1, arg2);
        this.field4497.method2324(1, class124.field1869, 1);
        this.field4497.method2360(1, class124.field1869, 1);
        this.field4497.method2321(arg3, 24);
        var6.method242(0.0F, (float) this.field4504, (float) this.field4477, (byte) -76);
        var6.method270(var9, var8, 0);
        var7.method242(1.0F, this.field4479.method666(true, (float) this.field4504), this.field4479.method661((float) this.field4477, 122), (byte) 119);
        this.field4497.method2356(0, class266.field4017);
        this.field4497.method2340(false);
        this.field4497.method2311((byte) -128);
        this.field4497.method2358(-1);
        this.field4497.method2324(1, class319.field4696, 1);
        this.field4497.method2360(1, class319.field4696, 1);
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(III)Z", line = 454)
    public static final boolean method1936(int arg0, int arg1, int arg2) {
        field4505++;
        if (arg2 != 0) {
            method1935((byte) 0, -66, null, null);
        }
        return (arg1 & 0x800) != 0;
    }

    @OriginalMember(owner = "client!b", name = "A", descriptor = "()I", line = 467)
    public final int method931() {
        field4499++;
        return this.field4477 - (-this.field4493 - this.field4476);
    }

    @OriginalMember(owner = "client!b", name = "qa", descriptor = "(FFFFFFIIII)V", line = 475)
    public final void method940(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8, int arg9) {
        field4485++;
        class21 var11 = this.field4497.method2336(false);
        class21 var12 = this.field4497.method2327(true);
        this.field4479.method54(this.field4478 || this.field4495 || (arg9 & 0x1) == 0 ? class630.field8812 : class69.field1245, -26149);
        this.field4497.method2386((byte) 86);
        this.field4497.method2337(false, this.field4479);
        this.field4497.method2326(true, arg8);
        this.field4497.method2308(-1, arg6);
        this.field4497.method2324(1, class124.field1869, 1);
        this.field4497.method2360(1, class124.field1869, 1);
        this.field4497.method2321(arg7, 24);
        if (this.field4484) {
            float var13 = (float) this.method931();
            float var14 = (float) this.method936();
            float var15 = (arg2 - arg0) / var13;
            float var16 = (arg3 - arg1) / var13;
            float var17 = (arg4 - arg0) / var14;
            float var18 = (arg5 - arg1) / var14;
            float var19 = (float) this.field4498 * var17;
            float var20 = (float) this.field4498 * var18;
            float var21 = (float) this.field4493 * var15;
            float var22 = (float) this.field4493 * var16;
            float var23 = (float) this.field4476 * -var15;
            float var24 = (float) this.field4476 * -var16;
            float var25 = (float) this.field4481 * -var17;
            arg3 = arg3 + var24 + var20;
            arg0 = arg0 + var21 + var19;
            arg4 = arg4 + var21 + var25;
            arg1 = arg1 + var22 + var20;
            float var26 = (float) this.field4481 * -var18;
            arg2 = arg2 + var23 + var19;
            arg5 = arg5 + var22 + var26;
        }
        var11.method263(arg4 - arg0, (byte) 46, arg2 - arg0, -arg1 + arg3, arg5 - arg1, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F);
        var11.method265(arg1, 0.0F, 93, arg0);
        var12.method242(1.0F, this.field4479.method666(true, (float) this.field4504), this.field4479.method661((float) this.field4477, -92), (byte) -119);
        this.field4497.method2356(0, class266.field4017);
        this.field4497.method2340(false);
        this.field4497.method2311((byte) -127);
        this.field4497.method2358(-1);
        this.field4497.method2324(1, class319.field4696, 1);
        this.field4497.method2360(1, class319.field4696, 1);
    }

    @OriginalMember(owner = "client!b", name = "da", descriptor = "(IIIIII)V", line = 542)
    public final void method942(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field4483++;
        int[] var7 = this.field4497.method193(arg4, arg5, arg2, arg3);
        if (var7 != null) {
            for (int var8 = 0; var8 < var7.length; var8++) {
                var7[var8] = class486.method2826(var7[var8], -16777216);
            }
            this.method1937(arg0, arg1, arg2, arg3, var7, 0, arg2);
        }
    }

    @OriginalMember(owner = "client!b", name = "E", descriptor = "()I", line = 570)
    public final int method927() {
        field4508++;
        return this.field4477;
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(IIII[III)V", line = 590)
    private final void method1937(int arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5, int arg6) {
        this.field4479.method667(arg2, (byte) -64, arg0, arg5, arg6, arg4, arg1, arg3);
        field4507++;
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(B)V", line = 598)
    public static void method1938(byte arg0) {
        field4506 = null;
        field4494 = null;
        if (arg0 <= 100) {
            field4492 = 94;
        }
    }

    @OriginalMember(owner = "client!b", name = "Q", descriptor = "(IIII)V", line = 610)
    public final void method935(int arg0, int arg1, int arg2, int arg3) {
        field4489++;
        this.field4498 = arg1;
        this.field4476 = arg2;
        this.field4481 = arg3;
        this.field4493 = arg0;
        this.field4484 = this.field4493 != 0 || this.field4498 != 0 || this.field4476 != 0 || this.field4481 != 0;
    }
}
