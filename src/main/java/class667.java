import jagex3.jagmisc.jagmisc;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nk")
public class class667 {

    @OriginalMember(owner = "client!nk", name = "c", descriptor = "I")
    private int field9410 = 0;

    @OriginalMember(owner = "client!nk", name = "r", descriptor = "I")
    private int field9425 = 1;

    @OriginalMember(owner = "client!nk", name = "n", descriptor = "I")
    private int field9421 = 0;

    @OriginalMember(owner = "client!nk", name = "t", descriptor = "I")
    private int field9427 = 1;

    @OriginalMember(owner = "client!nk", name = "j", descriptor = "Lwba;")
    private class46 field9417 = new class46();

    @OriginalMember(owner = "client!nk", name = "y", descriptor = "Z")
    private boolean field9432 = true;

    @OriginalMember(owner = "client!nk", name = "B", descriptor = "Z")
    private boolean field9435 = true;

    @OriginalMember(owner = "client!nk", name = "A", descriptor = "[Lwn;")
    private class673[] field9434 = new class673[2];

    @OriginalMember(owner = "client!nk", name = "w", descriptor = "Z")
    private boolean field9430 = true;

    @OriginalMember(owner = "client!nk", name = "x", descriptor = "Z")
    private boolean field9431 = false;

    @OriginalMember(owner = "client!nk", name = "F", descriptor = "I")
    private int field9439 = -1;

    @OriginalMember(owner = "client!nk", name = "G", descriptor = "I")
    private int field9440 = 0;

    @OriginalMember(owner = "client!nk", name = "D", descriptor = "Z")
    private boolean field9437 = true;

    @OriginalMember(owner = "client!nk", name = "f", descriptor = "Lok;")
    private class228 field9413;

    @OriginalMember(owner = "client!nk", name = "b", descriptor = "Lfaa;")
    private class139 field9409;

    @OriginalMember(owner = "client!nk", name = "d", descriptor = "Lfaa;")
    private class139 field9411;

    @OriginalMember(owner = "client!nk", name = "g", descriptor = "Lfaa;")
    private class139 field9414;

    @OriginalMember(owner = "client!nk", name = "e", descriptor = "Lsn;")
    public static class583 field9412 = new class583("WTWIP", 3);

    @OriginalMember(owner = "client!nk", name = "s", descriptor = "[[I")
    public static int[][] field9426 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 3, 5, 6, 4 }, { 0, 1, 4, 5 }, { 4, 6, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 1, 2, 4, 6, 7 }, { 4, 7, 6, 0 }, { 0, 8, 6, 1, 9, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 3, 7, 10, 10, 6, 6 }, { 2, 4, 6, 0 } };

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "I")
    public static int field9408;

    @OriginalMember(owner = "client!nk", name = "h", descriptor = "I")
    public static int field9415;

    @OriginalMember(owner = "client!nk", name = "i", descriptor = "I")
    public static int field9416;

    @OriginalMember(owner = "client!nk", name = "k", descriptor = "I")
    public static int field9418;

    @OriginalMember(owner = "client!nk", name = "l", descriptor = "I")
    public static int field9419;

    @OriginalMember(owner = "client!nk", name = "m", descriptor = "I")
    public static int field9420;

    @OriginalMember(owner = "client!nk", name = "o", descriptor = "I")
    public static int field9422;

    @OriginalMember(owner = "client!nk", name = "p", descriptor = "I")
    public static int field9423;

    @OriginalMember(owner = "client!nk", name = "q", descriptor = "I")
    public static int field9424;

    @OriginalMember(owner = "client!nk", name = "v", descriptor = "I")
    public static int field9429;

    @OriginalMember(owner = "client!nk", name = "C", descriptor = "Leaa;")
    private class462 field9436;

    @OriginalMember(owner = "client!nk", name = "E", descriptor = "Leaa;")
    private class462 field9438;

    @OriginalMember(owner = "client!nk", name = "z", descriptor = "Lwn;")
    private class673 field9433;

    @OriginalMember(owner = "client!nk", name = "u", descriptor = "Z")
    private boolean field9428;

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(I)V", line = 10)
    private final void method3688(int arg0) {
        field9422++;
        boolean var2 = false;
        int var3 = 0;
        int var4 = 0;
        for (class164 var5 = (class164) this.field9417.method472((byte) -81); var5 != null; var5 = (class164) this.field9417.method482(126)) {
            int var10 = var5.method1128(false);
            var4 += var5.method1137(-5255);
            if (var3 < var10) {
                var3 = var10;
            }
            var2 |= var5.method1134(-5544);
        }
        int var6;
        if (var3 == 2) {
            var6 = 34836;
        } else if (var3 == 1) {
            var6 = 34842;
        } else {
            var6 = 6408;
        }
        if (this.field9439 != var6) {
            this.field9437 = true;
            this.field9439 = var6;
        }
        int var7 = -115 % ((23 - arg0) / 43);
        int var8 = this.field9440 > 2 ? 2 : this.field9440;
        int var9 = var4 > 2 ? 2 : var4;
        this.field9440 = var4;
        if (var8 != var9) {
            this.field9432 = this.field9437 = true;
        }
        if (this.field9431 != var2) {
            this.field9431 = var2;
            this.field9430 = true;
        }
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(B)Z", line = 73)
    public final boolean method3689(byte arg0) {
        if (arg0 >= -53) {
            this.field9436 = null;
        }
        field9423++;
        return this.field9411 != null;
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(IIIII)Z", line = 87)
    public final boolean method3690(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field9429++;
        if (this.field9411 == null || this.field9417.method481((byte) -57)) {
            return false;
        }
        if (this.field9427 != arg1 || this.field9425 != arg4) {
            this.field9427 = arg1;
            this.field9425 = arg4;
            for (class665 var6 = this.field9417.method472((byte) -62); var6 != this.field9417.field716; var6 = var6.field9382) {
                ((class164) var6).method1131((byte) -95, this.field9425, this.field9427);
            }
            this.field9437 = true;
            this.field9430 = true;
            this.field9432 = true;
        }
        if (!this.method3698(arg2 ^ arg2)) {
            return false;
        }
        this.field9410 = arg3;
        this.field9421 = arg0;
        this.field9428 = true;
        this.field9413.method1578(0, this.field9411);
        this.field9411.method1009(0, -1);
        this.field9413.method1518(this.field9425 - (this.field9413.field3332 - this.field9421), -this.field9410, (byte) 96);
        return true;
    }

    @OriginalMember(owner = "client!nk", name = "b", descriptor = "(B)V", line = 130)
    public final void method3691(byte arg0) {
        field9419++;
        if (!this.field9428) {
            return;
        }
        if (this.field9414 != null) {
            int var2 = 16384;
            this.field9413.method1572(2903, this.field9414);
            this.field9413.method1498(this.field9409, 17741);
            this.field9414.method1012(0, (byte) -32);
            this.field9409.method1009(0, arg0 + 76);
            if (this.field9431) {
                var2 |= 0x100;
            }
            OpenGL.glBlitFramebufferEXT(0, 0, this.field9427, this.field9425, 0, 0, this.field9427, this.field9425, var2, 9728);
            this.field9413.method1547(this.field9414, true);
            this.field9413.method1502(-1, this.field9409);
        }
        this.field9413.method1494(94);
        this.field9413.method1536(0, 0);
        this.field9413.method1497(1, (byte) -29);
        this.field9413.method152();
        int var3 = 0;
        int var4 = 1;
        class164 var5 = (class164) this.field9417.method472((byte) -123);
        if (arg0 != -77) {
            this.method3698(42);
        }
        while (var5 != null) {
            class164 var6 = (class164) this.field9417.method482(-93);
            int var7 = var5.method1137(-5255);
            for (int var8 = 0; var8 < var7; var8++) {
                var5.method1130(var8, this.field9434[var3], -1390, this.field9433);
                if (var6 == null && var7 - 1 == var8) {
                    this.field9413.method1565(-13986, this.field9409);
                    this.field9413.method1518(0, 0, (byte) 109);
                    OpenGL.glBegin(7);
                    OpenGL.glTexCoord2f(0.0F, (float) this.field9425);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
                    OpenGL.glVertex2i(this.field9410, this.field9421);
                    OpenGL.glTexCoord2f(0.0F, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                    OpenGL.glVertex2i(this.field9410, this.field9425 + this.field9421);
                    OpenGL.glTexCoord2f((float) this.field9427, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
                    OpenGL.glVertex2i(this.field9427 + this.field9410, this.field9425 + this.field9421);
                    OpenGL.glTexCoord2f((float) this.field9427, (float) this.field9425);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
                    OpenGL.glVertex2i(this.field9410 + this.field9427, this.field9421);
                    OpenGL.glEnd();
                } else {
                    this.field9409.method1009(var4, -1);
                    OpenGL.glBegin(7);
                    OpenGL.glTexCoord2f(0.0F, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                    OpenGL.glVertex2i(0, 0);
                    OpenGL.glTexCoord2f(0.0F, (float) this.field9425);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
                    OpenGL.glVertex2i(0, this.field9425);
                    OpenGL.glTexCoord2f((float) this.field9427, (float) this.field9425);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
                    OpenGL.glVertex2i(this.field9427, this.field9425);
                    OpenGL.glTexCoord2f((float) this.field9427, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
                    OpenGL.glVertex2i(this.field9427, 0);
                    OpenGL.glEnd();
                }
                var3 = var3 + 1 & 0x1;
                var4 = var4 + 1 & 0x1;
                var5.method1127(var8, arg0 + 78);
            }
            var5 = var6;
        }
        this.field9428 = false;
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(Lgf;IZ)V", line = 234)
    public static final void method3692(class248 arg0, int arg1, boolean arg2) {
        if (class367.field5244) {
            arg1 = 0;
            class367.field5244 = false;
        }
        field9420++;
        if (class368.field5271 == null || !class368.field5271.method1671(117, arg0)) {
            class368.field5271 = arg0;
            class580.field8174 = class490.method2840(true);
            class32.field501 = arg1;
            class107.field1646 = arg1;
            if (class107.field1646 == 0) {
                class540.method3071(126);
            } else {
                class420.field6111 = class572.field8049;
                class415.field6021 = class139.field2041;
                class517.field7293 = class421.field6140;
                class590.field8271 = class487.field6927;
                class227.field3185 = class637.field9005;
                class430.field6298 = class393.field5823;
                class647.field9088 = class356.field5110;
                class152.field2201 = class207.field2908;
                class44.field703 = class267.field4033;
                class599.field8476 = class73.field1298;
            }
        }
        if (arg2) {
            method3692(null, -82, false);
        }
    }

    @OriginalMember(owner = "client!nk", name = "c", descriptor = "(B)V", line = 277)
    public final void method3693(byte arg0) {
        this.field9438 = null;
        this.field9411 = this.field9414 = this.field9409 = null;
        int var2 = -81 % (-arg0 / 58);
        this.field9434 = null;
        this.field9433 = null;
        field9408++;
        this.field9436 = null;
        if (!this.field9417.method481((byte) -57)) {
            for (class665 var3 = this.field9417.method472((byte) -45); var3 != this.field9417.field716; var3 = var3.field9382) {
                ((class164) var3).method1129((byte) -115);
            }
        }
        this.field9427 = this.field9425 = 1;
    }

    @OriginalMember(owner = "client!nk", name = "d", descriptor = "(B)V", line = 306)
    public static void method3694(byte arg0) {
        if (arg0 < 0) {
            field9426 = null;
            field9412 = null;
        }
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(Lcw;I)Z", line = 317)
    public final boolean method3695(class164 arg0, int arg1) {
        field9418++;
        if (arg1 != 0) {
            this.method3691((byte) -63);
        }
        if (this.field9411 != null) {
            if (arg0.method1132(256) || arg0.method1126((byte) 127)) {
                this.field9417.method474(arg0, 6);
                this.method3688(106);
                if (this.method3698(0)) {
                    if (this.field9427 != -1 && this.field9425 != -1) {
                        arg0.method1131((byte) -95, this.field9425, this.field9427);
                    }
                    arg0.field2353 = true;
                    return true;
                }
            }
            this.method3696((byte) -114, arg0);
        }
        return false;
    }

    @OriginalMember(owner = "client!nk", name = "<init>", descriptor = "(Lok;)V", line = 1005)
    public class667(class228 arg0) {
        this.field9413 = arg0;
        if (this.field9413.field3515 && this.field9413.field3471) {
            this.field9411 = this.field9409 = new class139(this.field9413);
            if (this.field9413.field3394 > 1 && this.field9413.field3541 && this.field9413.field3546) {
                this.field9411 = this.field9414 = new class139(this.field9413);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(BLcw;)V", line = 368)
    public final void method3696(byte arg0, class164 arg1) {
        arg1.field2353 = false;
        if (arg0 > -97) {
            this.method3695(null, 58);
        }
        field9415++;
        arg1.method1129((byte) -96);
        arg1.method3678(-1);
        this.method3688(94);
    }

    @OriginalMember(owner = "client!nk", name = "b", descriptor = "(I)I", line = 383)
    public static final int method3697(int arg0) {
        if (!class287.field4270.field3692) {
            for (int var1 = 0; var1 < class32.field502; var1++) {
                if (class231.field3603[var1].method923(8348) == 's' || class231.field3603[var1].method923(8348) == 'S') {
                    class287.field4270.field3692 = true;
                    break;
                }
            }
        }
        field9424++;
        if (class572.field8054 == class229.field3559) {
            Runtime var2 = Runtime.getRuntime();
            int var3 = (int) ((var2.totalMemory() - var2.freeMemory()) / 1024L);
            long var4 = class490.method2840(true);
            if (class319.field4697 == 0L) {
                class319.field4697 = var4;
            }
            if (var3 > 16384 && var4 - class319.field4697 < 5000L) {
                if (var4 - class491.field6987 > 1000L) {
                    System.gc();
                    class491.field6987 = var4;
                }
                return 0;
            }
        }
        if (class572.field8054 == class229.field3572) {
            if (class235.field3641 == null) {
                class235.field3641 = new class187(class622.field8693, class434.field6344, class634.field8975, class15.field159);
            }
            if (!class235.field3641.method1262(7)) {
                return 0;
            }
            class366.method2219(null, 0, arg0 + 7495);
            class27.field399 = !class638.method3553(11);
            class619.field8645 = class297.method1920(class27.field399 ? 34 : 32, 1000000, 1, false);
            class336.field4964 = class297.method1920(33, 1000000, 1, false);
            class81.field1363 = class297.method1920(13, 1000000, 1, false);
        }
        if (class572.field8054 == class229.field3573) {
            class336.field4964.method3004(arg0 ^ 0xFFFFFF9B);
            int var6 = class174.field2480[33].method816(arg0 + 356);
            int var7 = var6 + class174.field2480[class27.field399 ? 34 : 32].method816(arg0 + 356);
            int var8 = var7 + class174.field2480[13].method816(255);
            int var9 = var8 + class336.field4964.method2990(77);
            if (var9 != 400) {
                return var9 / 4;
            }
            class148.field2163 = class619.field8645.method2979(121);
            class262.field3976 = class336.field4964.method2979(124);
            class305.method1945(arg0 - 11799, class619.field8645);
            int var10 = class287.field4270.field3703;
            class386.field5433 = new class443(class586.field8208, class512.field7203, class336.field4964);
            int[] var11 = class386.field5433.method2631((byte) 119, var10);
            class270 var12 = new class270(class619.field8645, class81.field1363);
            if (var11.length > 0) {
                class666.field9407 = new class211[var11.length];
                for (int var13 = 0; var13 < class666.field9407.length; var13++) {
                    class666.field9407[var13] = new class374(class386.field5433.method2626(83, var11[var13]), var12);
                }
            }
        }
        if (class572.field8054 == class229.field3574) {
            class448.method2666(class595.method3368((byte) 38), class81.field1363, 6406, class619.field8645);
        }
        if (class572.field8054 == class229.field3575) {
            int var14 = class180.method1219(5100);
            int var15 = class411.method2480(55);
            if (var14 < var15) {
                return var14 * 100 / var15;
            }
        }
        if (class572.field8054 == class229.field3576) {
            if (class666.field9407 != null && class666.field9407.length > 0) {
                if (class666.field9407[0].method701(127) < 100) {
                    return 0;
                }
                if (class666.field9407.length > 1 && class386.field5433.method2630(-106) && class666.field9407[1].method701(arg0 + 218) < 100) {
                    return 0;
                }
            }
            class136.method990(class282.field4228, (byte) -99);
            class658.method3624(class282.field4228, 2);
            class112.method868(1, (byte) 112);
        }
        if (arg0 != -101) {
            method3697(-68);
        }
        if (class572.field8054 == class229.field3577) {
            for (int var16 = 0; var16 < 4; var16++) {
                class423.field6155[var16] = class531.method3029(121, class232.field3611, class199.field2812);
            }
        }
        if (class572.field8054 == class229.field3578) {
            class703.field9909 = class297.method1920(8, 1000000, 1, false);
            class163.field2332 = class297.method1920(0, arg0 + 1000101, 1, false);
            class676.field9563 = class297.method1920(1, 1000000, 1, false);
            class94.field1498 = class297.method1920(2, 1000000, 1, false);
            class695.field9786 = class297.method1920(3, 1000000, 1, false);
            class199.field2813 = class297.method1920(4, 1000000, 1, false);
            class334.field4954 = class297.method1920(5, 1000000, 1, true);
            class652.field9171 = class297.method1920(6, 1000000, 1, true);
            class81.field1362 = class297.method1920(7, 1000000, 1, false);
            class309.field4580 = class297.method1920(9, 1000000, 1, false);
            class580.field8170 = class297.method1920(10, 1000000, 1, false);
            class540.field7559 = class297.method1920(11, 1000000, 1, false);
            class518.field7311 = class297.method1920(12, arg0 + 1000101, 1, false);
            class424.field6162 = class297.method1920(14, 1000000, 1, false);
            class102.field1606 = class297.method1920(15, 1000000, 1, false);
            class656.field9196 = class297.method1920(16, 1000000, 1, false);
            class206.field2904 = class297.method1920(17, 1000000, 1, false);
            class149.field2168 = class297.method1920(18, arg0 ^ 0xFFF0BDDB, 1, false);
            class386.field5439 = class297.method1920(19, 1000000, 1, false);
            class316.field4675 = class297.method1920(20, 1000000, 1, false);
            class264.field4005 = class297.method1920(21, 1000000, 1, false);
            class27.field395 = class297.method1920(22, 1000000, 1, false);
            class75.field1310 = class297.method1920(23, 1000000, 1, true);
            class651.field9121 = class297.method1920(24, arg0 ^ 0xFFF0BDDB, 1, false);
            class462.field6660 = class297.method1920(25, 1000000, 1, false);
            class544.field7656 = class297.method1920(26, 1000000, 1, true);
            class23.field318 = class297.method1920(27, 1000000, 1, false);
            class656.field9201 = class297.method1920(28, 1000000, 1, true);
            class677.field9579 = class297.method1920(29, 1000000, 1, false);
            class563.field7933 = class297.method1920(30, 1000000, 1, true);
            class231.field3600 = class297.method1920(31, arg0 ^ 0xFFF0BDDB, 1, true);
        }
        if (class572.field8054 == class229.field3579) {
            int var17 = 0;
            for (int var18 = 0; var18 < 35; var18++) {
                if (class174.field2480[var18] != null) {
                    var17 += class174.field2480[var18].method816(255) * class664.field9371[var18] / 100;
                }
            }
            if (var17 != 100) {
                if (class37.field626 < 0) {
                    class37.field626 = var17;
                }
                return (var17 - class37.field626) * 100 / (100 - class37.field626);
            }
            class59.method634(126, class703.field9909);
            class448.method2666(class595.method3368((byte) 2), class81.field1363, arg0 ^ 0xFFFFE69D, class703.field9909);
        }
        if (class572.field8054 == class229.field3580) {
            class500.method2892(false);
            class112.method868(2, (byte) 107);
        }
        if (class572.field8054 == class229.field3581) {
            class210.method1388(class563.field7933, class368.field5267, 2574);
        }
        if (class572.field8054 == class229.field3582) {
            int var19 = class391.method2406(arg0 + 102);
            if (var19 < 100) {
                return var19;
            }
            class539.method3063((byte) 29, class656.field9201.method2994(1, (byte) 93));
            class215.method1428((byte) -80, class656.field9201.method2994(3, (byte) 93));
        }
        if (class572.field8054 == class229.field3583) {
            if (class487.field6928 != -1 && !class81.field1362.method2991(class487.field6928, 0, (byte) 111)) {
                return 99;
            }
            class373.field5324 = new class321(class544.field7656, class309.field4580, class703.field9909);
            class329.field4869 = new class638(class586.field8208, class512.field7203, class94.field1498);
            class339.field4991 = new class62(class586.field8208, class512.field7203, class94.field1498);
            class287.field4278 = new class200(class586.field8208, class512.field7203, class94.field1498, class703.field9909);
            class666.field9402 = new class50(class586.field8208, class512.field7203, class206.field2904);
            class52.field1041 = new class435(class586.field8208, class512.field7203, class94.field1498);
            class483.field6869 = new class316(class586.field8208, class512.field7203, class94.field1498);
            class145.field2120 = new class290(class586.field8208, class512.field7203, class94.field1498, class81.field1362);
            class78.field1347 = new class141(class586.field8208, class512.field7203, class94.field1498);
            class472.field6748 = new class277(class586.field8208, class512.field7203, class94.field1498);
            class101.field1572 = new class442(class586.field8208, class512.field7203, true, class656.field9196, class81.field1362);
            class255.field3916 = new class100(class586.field8208, class512.field7203, class94.field1498, class703.field9909);
            class27.field401 = new class539(class586.field8208, class512.field7203, class94.field1498, class703.field9909);
            class393.field5824 = new class33(class586.field8208, class512.field7203, true, class149.field2168, class81.field1362);
            class41.field682 = new class367(class586.field8208, class512.field7203, true, class329.field4869, class386.field5439, class81.field1362);
            class325.field4802 = new class112(class586.field8208, class512.field7203, class94.field1498);
            class188.field2708 = new class344(class586.field8208, class512.field7203, class316.field4675, class163.field2332, class676.field9563);
            class226.field3182 = new class552(class586.field8208, class512.field7203, class94.field1498);
            class177.field2526 = new class409(class586.field8208, class512.field7203, class94.field1498);
            class86.field1411 = new class223(class586.field8208, class512.field7203, class264.field4005, class81.field1362);
            class61.field1165 = new class518(class586.field8208, class512.field7203, class94.field1498);
            class441.field6429 = new class575(class586.field8208, class512.field7203, class94.field1498);
            class278.field4204 = new class59(class586.field8208, class512.field7203, class94.field1498);
            class31.field493 = new class53(class586.field8208, class512.field7203, class27.field395);
            class692.field9733 = new class553(class586.field8208, class512.field7203, class94.field1498);
            class232.method1597(class703.field9909, class81.field1362, arg0 - 923303121, class81.field1363, class695.field9786);
            class651.method3601(class677.field9579, false);
            class600.field8483 = new class685(class512.field7203, class651.field9121, class462.field6660);
            class452.field6508 = new class32(class512.field7203, class651.field9121, class462.field6660, new class530());
            class142.method1022(-27264);
            class101.field1572.method2623((byte) -45, !class287.field4270.method2747(126, class328.field4859));
            class61.field1163 = new class263();
            class496.method2869(arg0 + 224);
            class348.method2149(23252, class23.field318);
            class54.method593(611, class81.field1362, class373.field5324);
            class371 var20 = new class371(class580.field8170.method3009("", "huffman", 0));
            class204.method1357(arg0 - 4314, var20);
            try {
                jagmisc.init();
            } catch (Throwable var29) {
            }
            class458.field6557 = class20.method233(arg0 ^ 0xFFFFF38C);
        }
        if (class572.field8054 == class229.field3585) {
            int var21 = class391.method2408(0, class703.field9909) + class64.method657(true, 4071);
            int var22 = class178.method1211((byte) -48) + class411.method2480(31);
            if (var22 > var21) {
                return var21 * 100 / var22;
            }
        }
        if (class572.field8054 == class229.field3586) {
            class25.method289(class75.field1310, class52.field1041, class483.field6869, class101.field1572, class255.field3916, class27.field401, class61.field1163);
        }
        if (class572.field8054 == class229.field3587) {
            class119.field1807 = new String[class441.field6429.field8087];
            class524.field7403 = new int[class278.field4204.field1136];
            class591.field8281 = new boolean[class278.field4204.field1136];
            for (int var23 = 0; var23 < class278.field4204.field1136; var23++) {
                if (class278.field4204.method636((byte) -122, var23).field6485 == 0) {
                    class591.field8281[var23] = true;
                    class390.field5782++;
                }
                class524.field7403[var23] = -1;
            }
            class117.method906(2);
            class309.field4581 = class695.field9786.method2980(-9104, "loginscreen");
            class319.field4701 = class695.field9786.method2980(arg0 - 9003, "lobbyscreen");
            class334.field4954.method3000(true, false, (byte) 114);
            class652.field9171.method3000(true, true, (byte) 54);
            class703.field9909.method3000(true, true, (byte) 125);
            class81.field1363.method3000(true, true, (byte) 45);
            class580.field8170.method3000(true, true, (byte) 67);
            class695.field9786.method3000(true, true, (byte) 96);
            class514.field7270 = true;
            class94.field1498.field7369 = 2;
            class206.field2904.field7369 = 2;
            class656.field9196.field7369 = 2;
            class149.field2168.field7369 = 2;
            class386.field5439.field7369 = 2;
            class316.field4675.field7369 = 2;
            class264.field4005.field7369 = 2;
        }
        if (class572.field8054 == class229.field3588) {
            if (!class312.method1978(false, class309.field4581)) {
                return 0;
            }
            for (int var24 = 0; var24 < class181.field2558[class309.field4581].length; var24++) {
                class49 var25 = class181.field2558[class309.field4581][var24];
                if (var25.field980 == 5 && var25.field908 != -1) {
                    var25.method556(arg0 ^ 0xFFFFFFD3, class282.field4228);
                }
            }
        }
        if (class572.field8054 == class229.field3589) {
            for (int var26 = 0; var26 < class181.field2558[class309.field4581].length; var26++) {
                class49 var27 = class181.field2558[class309.field4581][var26];
                if (var27.field980 == 5 && var27.field908 != -1 && var27.method556(34, class282.field4228) == null && class334.field4952) {
                    return 0;
                }
            }
        }
        if (class572.field8054 == class229.field3590) {
            class300.method1934(true, (byte) -60);
        }
        if (class572.field8054 == class229.field3591) {
            class27.field400.method3384(true);
            try {
                class162.field2317.join();
            } catch (InterruptedException var28) {
                return 0;
            }
            class162.field2317 = null;
            class27.field400 = null;
            class619.field8645 = null;
            class666.field9407 = null;
            class386.field5433 = null;
            class336.field4964 = null;
            class32.method359(arg0 + 190);
            class88.field1482 = class287.field4270.field3692;
            class287.field4270.field3692 = true;
            class287.field4270.method2753(false, class368.field5267);
            if (class88.field1482) {
                class33.method363(-30052, 0);
            } else {
                class33.method363(arg0 ^ 0x7507, class287.field4270.field3722);
            }
            class134.method983(class287.field4270.field3718, -1, false, -1, false);
            class136.method990(class282.field4228, (byte) 121);
            class658.method3624(class282.field4228, 2);
            class699.method3898(true, class703.field9909, class282.field4228);
            class267.method1747(1, class258.field3939);
        }
        return class349.method2154(118);
    }

    @OriginalMember(owner = "client!nk", name = "c", descriptor = "(I)Z", line = 828)
    private final boolean method3698(int arg0) {
        field9416++;
        if (this.field9430) {
            if (this.field9438 != null) {
                this.field9438.method2727((byte) -103);
                this.field9438 = null;
            }
            if (this.field9433 != null) {
                this.field9433.method3616(2867);
                this.field9433 = null;
            }
            if (this.field9414 != null) {
                this.field9438 = new class462(this.field9413, 6402, this.field9427, this.field9425, this.field9413.field3394);
            }
            if (this.field9431) {
                this.field9433 = new class673(this.field9413, 34037, 6402, this.field9427, this.field9425);
            } else if (this.field9438 == null) {
                this.field9438 = new class462(this.field9413, 6402, this.field9427, this.field9425);
            }
            this.field9435 = true;
            this.field9432 = true;
            this.field9430 = false;
        }
        if (this.field9437) {
            if (this.field9436 != null) {
                this.field9436.method2727((byte) -118);
                this.field9436 = null;
            }
            if (this.field9434[0] != null) {
                this.field9434[0].method3616(2867);
                this.field9434[0] = null;
            }
            if (this.field9434[1] != null) {
                this.field9434[1].method3616(2867);
                this.field9434[1] = null;
            }
            if (this.field9414 != null) {
                this.field9436 = new class462(this.field9413, this.field9439, this.field9427, this.field9425, this.field9413.field3394);
            }
            this.field9434[0] = new class673(this.field9413, 34037, this.field9439, this.field9427, this.field9425);
            this.field9434[1] = this.field9440 > 1 ? new class673(this.field9413, 34037, this.field9439, this.field9427, this.field9425) : null;
            this.field9435 = true;
            this.field9432 = true;
            this.field9437 = false;
        }
        if (arg0 != 0) {
            return false;
        }
        if (this.field9432) {
            if (this.field9414 == null) {
                this.field9413.method1578(arg0, this.field9409);
                this.field9409.method1003(0, -96);
                this.field9409.method1003(1, -103);
                this.field9409.method1003(8, arg0 ^ 0xFFFFFF9C);
                this.field9409.method1011(this.field9434[0], 0, (byte) -74);
                if (this.field9440 > 1) {
                    this.field9409.method1011(this.field9434[1], 1, (byte) -74);
                }
                if (this.field9431) {
                    this.field9409.method1011(this.field9433, 8, (byte) -74);
                } else {
                    this.field9409.method1014(8, -5253, this.field9438);
                }
                this.field9413.method1565(-13986, this.field9409);
            } else {
                this.field9413.method1578(arg0, this.field9409);
                this.field9409.method1003(0, -122);
                this.field9409.method1003(1, arg0 - 121);
                this.field9409.method1003(8, -98);
                this.field9409.method1011(this.field9434[0], 0, (byte) -74);
                if (this.field9440 > 1) {
                    this.field9409.method1011(this.field9434[1], 1, (byte) -74);
                }
                if (this.field9431) {
                    this.field9409.method1011(this.field9433, 8, (byte) -74);
                }
                this.field9413.method1565(-13986, this.field9409);
                this.field9413.method1578(0, this.field9414);
                this.field9414.method1003(0, -126);
                this.field9414.method1003(8, -108);
                this.field9414.method1014(0, arg0 - 5253, this.field9436);
                this.field9414.method1014(8, -5253, this.field9438);
                this.field9413.method1565(arg0 - 13986, this.field9414);
            }
            this.field9435 = true;
            this.field9432 = false;
        }
        if (this.field9435) {
            this.field9413.method1578(0, this.field9411);
            this.field9435 = !this.field9411.method1005(arg0 - 112);
            this.field9413.method1565(arg0 - 13986, this.field9411);
        }
        return !this.field9435;
    }
}
