import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gi")
public class class705 {

    @OriginalMember(owner = "client!gi", name = "f", descriptor = "I")
    private int field9925 = 0;

    @OriginalMember(owner = "client!gi", name = "h", descriptor = "I")
    private int field9927 = 1;

    @OriginalMember(owner = "client!gi", name = "n", descriptor = "I")
    private int field9933 = 1;

    @OriginalMember(owner = "client!gi", name = "b", descriptor = "I")
    private int field9921 = 0;

    @OriginalMember(owner = "client!gi", name = "t", descriptor = "Lga;")
    private class420 field9939 = new class420();

    @OriginalMember(owner = "client!gi", name = "y", descriptor = "I")
    private int field9944 = -1;

    @OriginalMember(owner = "client!gi", name = "A", descriptor = "Z")
    private boolean field9946 = true;

    @OriginalMember(owner = "client!gi", name = "D", descriptor = "Z")
    private boolean field9949 = true;

    @OriginalMember(owner = "client!gi", name = "G", descriptor = "I")
    private int field9952 = 0;

    @OriginalMember(owner = "client!gi", name = "C", descriptor = "Z")
    private boolean field9948 = true;

    @OriginalMember(owner = "client!gi", name = "E", descriptor = "[Lho;")
    private class158[] field9950 = new class158[2];

    @OriginalMember(owner = "client!gi", name = "z", descriptor = "Z")
    private boolean field9945 = true;

    @OriginalMember(owner = "client!gi", name = "B", descriptor = "Z")
    private boolean field9947 = false;

    @OriginalMember(owner = "client!gi", name = "k", descriptor = "Lkv;")
    private class280 field9930;

    @OriginalMember(owner = "client!gi", name = "g", descriptor = "Lsca;")
    private class50 field9926;

    @OriginalMember(owner = "client!gi", name = "r", descriptor = "Lsca;")
    private class50 field9937;

    @OriginalMember(owner = "client!gi", name = "w", descriptor = "Lsca;")
    private class50 field9942;

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "[Ljava/lang/String;")
    public static String[] field9920 = new String[100];

    @OriginalMember(owner = "client!gi", name = "m", descriptor = "[I")
    public static int[] field9932 = new int[13];

    @OriginalMember(owner = "client!gi", name = "c", descriptor = "I")
    public static int field9922;

    @OriginalMember(owner = "client!gi", name = "d", descriptor = "I")
    public static int field9923;

    @OriginalMember(owner = "client!gi", name = "e", descriptor = "I")
    public static int field9924;

    @OriginalMember(owner = "client!gi", name = "i", descriptor = "I")
    public static int field9928;

    @OriginalMember(owner = "client!gi", name = "j", descriptor = "I")
    public static int field9929;

    @OriginalMember(owner = "client!gi", name = "l", descriptor = "I")
    public static int field9931;

    @OriginalMember(owner = "client!gi", name = "o", descriptor = "I")
    public static int field9934;

    @OriginalMember(owner = "client!gi", name = "p", descriptor = "I")
    public static int field9935;

    @OriginalMember(owner = "client!gi", name = "s", descriptor = "I")
    public static int field9938;

    @OriginalMember(owner = "client!gi", name = "v", descriptor = "I")
    public static int field9941;

    @OriginalMember(owner = "client!gi", name = "x", descriptor = "I")
    public static int field9943;

    @OriginalMember(owner = "client!gi", name = "F", descriptor = "Lho;")
    private class158 field9951;

    @OriginalMember(owner = "client!gi", name = "u", descriptor = "Lcb;")
    public static class544 field9940;

    @OriginalMember(owner = "client!gi", name = "H", descriptor = "Lgba;")
    private class694 field9953;

    @OriginalMember(owner = "client!gi", name = "I", descriptor = "Lgba;")
    private class694 field9954;

    @OriginalMember(owner = "client!gi", name = "q", descriptor = "Z")
    private boolean field9936;

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(I)V", line = 3)
    public final void method3988(int arg0) {
        field9934++;
        if (!this.field9936) {
            return;
        }
        if (this.field9942 != null) {
            this.field9930.method1863(this.field9942, -1);
            int var2 = 16384;
            this.field9930.method1884(115, this.field9926);
            this.field9942.method338(false, 0);
            this.field9926.method333(0, 0);
            if (this.field9947) {
                var2 |= 0x100;
            }
            OpenGL.glBlitFramebufferEXT(0, 0, this.field9927, this.field9933, 0, 0, this.field9927, this.field9933, var2, 9728);
            this.field9930.method1886(this.field9942, true);
            this.field9930.method1818(0, this.field9926);
        }
        this.field9930.method1864((byte) -117);
        this.field9930.method1817(0, 2);
        this.field9930.method1889(false, 1);
        this.field9930.method463();
        int var3 = 0;
        int var4 = 1;
        if (arg0 > -40) {
            this.method3997(10);
        }
        class531 var6;
        for (class531 var5 = (class531) this.field9939.method2508((byte) 124); var5 != null; var5 = var6) {
            var6 = (class531) this.field9939.method2505((byte) -55);
            int var7 = var5.method3084(-90);
            for (int var8 = 0; var8 < var7; var8++) {
                var5.method967(false, var8, this.field9951, this.field9950[var3]);
                if (var6 == null && var7 - 1 == var8) {
                    this.field9930.method1861(this.field9926, (byte) 94);
                    this.field9930.method1841(-105, 0, 0);
                    OpenGL.glBegin(7);
                    OpenGL.glTexCoord2f(0.0F, (float) this.field9933);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
                    OpenGL.glVertex2i(this.field9925, this.field9921);
                    OpenGL.glTexCoord2f(0.0F, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                    OpenGL.glVertex2i(this.field9925, this.field9921 + this.field9933);
                    OpenGL.glTexCoord2f((float) this.field9927, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
                    OpenGL.glVertex2i(this.field9927 + this.field9925, this.field9933 + this.field9921);
                    OpenGL.glTexCoord2f((float) this.field9927, (float) this.field9933);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
                    OpenGL.glVertex2i(this.field9927 + this.field9925, this.field9921);
                    OpenGL.glEnd();
                } else {
                    this.field9926.method333(-(-var4), 0);
                    OpenGL.glBegin(7);
                    OpenGL.glTexCoord2f(0.0F, (float) this.field9933);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
                    OpenGL.glVertex2i(0, 0);
                    OpenGL.glTexCoord2f(0.0F, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
                    OpenGL.glVertex2i(0, this.field9933);
                    OpenGL.glTexCoord2f((float) this.field9927, 0.0F);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
                    OpenGL.glVertex2i(this.field9927, this.field9933);
                    OpenGL.glTexCoord2f((float) this.field9927, (float) this.field9933);
                    OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
                    OpenGL.glVertex2i(this.field9927, 0);
                    OpenGL.glEnd();
                }
                var5.method959(var8, (byte) -106);
                var3 = var3 + 1 & 0x1;
                var4 = var4 + 1 & 0x1;
            }
        }
        this.field9936 = false;
    }

    @OriginalMember(owner = "client!gi", name = "b", descriptor = "(I)V", line = 107)
    public static final void method3989(int arg0) {
        if (arg0 != 6402) {
            field9920 = null;
        }
        for (class312 var1 = (class312) class551.field7826.method2508((byte) -119); var1 != null; var1 = (class312) class551.field7826.method2505((byte) -55)) {
            if (class637.method3628((byte) 2, var1.field4640)) {
                class415.method2489(var1, (byte) -128);
            }
        }
        field9941++;
    }

    @OriginalMember(owner = "client!gi", name = "c", descriptor = "(I)V", line = 132)
    private final void method3990(int arg0) {
        field9928++;
        boolean var2 = false;
        int var3 = 0;
        int var4 = 0;
        for (class531 var5 = (class531) this.field9939.method2508((byte) -96); var5 != null; var5 = (class531) this.field9939.method2505((byte) -55)) {
            int var9 = var5.method964((byte) 122);
            var4 += var5.method3084(-86);
            if (var3 < var9) {
                var3 = var9;
            }
            var2 |= var5.method3083((byte) 18);
        }
        int var6;
        if (var3 == 2) {
            var6 = 34836;
        } else if (var3 == 1) {
            var6 = 34842;
        } else {
            var6 = 6408;
        }
        if (this.field9944 != var6) {
            this.field9944 = var6;
            this.field9948 = true;
        }
        int var7 = this.field9952 > 2 ? 2 : this.field9952;
        if (arg0 != -23036) {
            method3996(-33, 62, 30, null, 69, -50);
        }
        int var8 = var4 > 2 ? 2 : var4;
        if (var7 != var8) {
            this.field9946 = this.field9948 = true;
        }
        if (var2 != this.field9947) {
            this.field9947 = var2;
            this.field9945 = true;
        }
        this.field9952 = var4;
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(Lek;B)Z", line = 196)
    public final boolean method3991(class531 arg0, byte arg1) {
        field9935++;
        if (this.field9937 != null) {
            if (arg0.method961((byte) 127) || arg0.method965(false)) {
                this.field9939.method2510(arg0, false);
                this.method3990(-23036);
                if (this.method3993(127)) {
                    if (this.field9927 != -1 && this.field9933 != -1) {
                        arg0.method963(this.field9927, (byte) 55, this.field9933);
                    }
                    arg0.field7526 = true;
                    return true;
                }
            }
            this.method3995(arg0, false);
        }
        return arg1 == -88 ? false : false;
    }

    @OriginalMember(owner = "client!gi", name = "d", descriptor = "(I)Z", line = 231)
    public final boolean method3992(int arg0) {
        field9923++;
        if (arg0 != 26919) {
            this.method3995(null, true);
        }
        return this.field9937 != null;
    }

    @OriginalMember(owner = "client!gi", name = "<init>", descriptor = "(Lkv;)V", line = 635)
    public class705(class280 arg0) {
        this.field9930 = arg0;
        if (this.field9930.field4285 && this.field9930.field4291) {
            this.field9937 = this.field9926 = new class50(this.field9930);
            if (this.field9930.field4153 > 1 && this.field9930.field4283 && this.field9930.field4284) {
                this.field9937 = this.field9942 = new class50(this.field9930);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!gi", name = "e", descriptor = "(I)Z", line = 252)
    private final boolean method3993(int arg0) {
        field9922++;
        if (this.field9945) {
            if (this.field9954 != null) {
                this.field9954.method3912(-64);
                this.field9954 = null;
            }
            if (this.field9951 != null) {
                this.field9951.method3465(false);
                this.field9951 = null;
            }
            if (this.field9942 != null) {
                this.field9954 = new class694(this.field9930, 6402, this.field9927, this.field9933, this.field9930.field4153);
            }
            if (this.field9947) {
                this.field9951 = new class158(this.field9930, 34037, 6402, this.field9927, this.field9933);
            } else if (this.field9954 == null) {
                this.field9954 = new class694(this.field9930, 6402, this.field9927, this.field9933);
            }
            this.field9945 = false;
            this.field9946 = true;
            this.field9949 = true;
        }
        if (this.field9948) {
            if (this.field9953 != null) {
                this.field9953.method3912(-76);
                this.field9953 = null;
            }
            if (this.field9950[0] != null) {
                this.field9950[0].method3465(false);
                this.field9950[0] = null;
            }
            if (this.field9950[1] != null) {
                this.field9950[1].method3465(false);
                this.field9950[1] = null;
            }
            if (this.field9942 != null) {
                this.field9953 = new class694(this.field9930, this.field9944, this.field9927, this.field9933, this.field9930.field4153);
            }
            this.field9950[0] = new class158(this.field9930, 34037, this.field9944, this.field9927, this.field9933);
            this.field9950[1] = this.field9952 <= 1 ? null : new class158(this.field9930, 34037, this.field9944, this.field9927, this.field9933);
            this.field9948 = false;
            this.field9949 = true;
            this.field9946 = true;
        }
        if (this.field9946) {
            if (this.field9942 == null) {
                this.field9930.method1882(this.field9926, false);
                this.field9926.method332(0, (byte) 111);
                this.field9926.method332(1, (byte) 102);
                this.field9926.method332(8, (byte) 111);
                this.field9926.method337(this.field9950[0], 0, 0);
                if (this.field9952 > 1) {
                    this.field9926.method337(this.field9950[1], 0, 1);
                }
                if (this.field9947) {
                    this.field9926.method337(this.field9951, 0, 8);
                } else {
                    this.field9926.method339(8, this.field9954, false);
                }
                this.field9930.method1861(this.field9926, (byte) 94);
            } else {
                this.field9930.method1882(this.field9926, false);
                this.field9926.method332(0, (byte) 86);
                this.field9926.method332(1, (byte) 101);
                this.field9926.method332(8, (byte) 102);
                this.field9926.method337(this.field9950[0], 0, 0);
                if (this.field9952 > 1) {
                    this.field9926.method337(this.field9950[1], 0, 1);
                }
                if (this.field9947) {
                    this.field9926.method337(this.field9951, 0, 8);
                }
                this.field9930.method1861(this.field9926, (byte) 94);
                this.field9930.method1882(this.field9942, false);
                this.field9942.method332(0, (byte) 100);
                this.field9942.method332(8, (byte) 108);
                this.field9942.method339(0, this.field9953, false);
                this.field9942.method339(8, this.field9954, false);
                this.field9930.method1861(this.field9942, (byte) 94);
            }
            this.field9949 = true;
            this.field9946 = false;
        }
        if (this.field9949) {
            this.field9930.method1882(this.field9937, false);
            this.field9949 = !this.field9937.method336((byte) -74);
            this.field9930.method1861(this.field9937, (byte) 94);
        }
        int var2 = -46 % ((64 - arg0) / 62);
        return !this.field9949;
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(IIBII)Z", line = 385)
    public final boolean method3994(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        field9924++;
        if (this.field9937 == null || this.field9939.method2513((byte) 88)) {
            return false;
        }
        if (this.field9927 != arg3 || this.field9933 != arg4) {
            this.field9927 = arg3;
            this.field9933 = arg4;
            for (class540 var6 = this.field9939.method2508((byte) -74); var6 != this.field9939.field5911; var6 = var6.field7578) {
                ((class531) var6).method963(this.field9927, (byte) 55, this.field9933);
            }
            this.field9946 = true;
            this.field9948 = true;
            this.field9945 = true;
        }
        if (!this.method3993(127)) {
            if (arg2 >= -54) {
                this.field9925 = 47;
            }
            return false;
        }
        this.field9925 = arg0;
        this.field9921 = arg1;
        this.field9936 = true;
        this.field9930.method1882(this.field9937, false);
        this.field9937.method333(0, 0);
        this.field9930.method1841(126, -this.field9925, this.field9933 + this.field9921 - this.field9930.field4070);
        return true;
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(Lek;Z)V", line = 433)
    public final void method3995(class531 arg0, boolean arg1) {
        arg0.field7526 = arg1;
        field9929++;
        arg0.method958((byte) 51);
        arg0.method3117((byte) -94);
        this.method3990(-23036);
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(III[BII)Z", line = 459)
    public static final boolean method3996(int arg0, int arg1, int arg2, byte[] arg3, int arg4, int arg5) {
        field9943++;
        boolean var6 = true;
        class120 var7 = new class120(arg3);
        if (arg0 != 1) {
            field9940 = null;
        }
        int var8 = -1;
        label60: while (true) {
            int var9 = var7.method863(-27847);
            if (var9 == 0) {
                return var6;
            }
            var8 += var9;
            int var10 = 0;
            boolean var11 = false;
            while (true) {
                while (!var11) {
                    int var13 = var7.method890((byte) -59);
                    if (var13 == 0) {
                        continue label60;
                    }
                    var10 += var13 - 1;
                    int var14 = var10 & 0x3F;
                    int var15 = var10 >> 6 & 0x3F;
                    int var16 = var7.method842(arg0 + 2383) >> 2;
                    int var17 = arg1 + var15;
                    int var18 = var14 + arg2;
                    if (var17 > 0 && var18 > 0 && arg5 - 1 > var17 && var18 < arg4 - 1) {
                        class322 var19 = class496.field7061.method319(-128, var8);
                        if (var16 != 22 || class145.field1852.field8993.method1387((byte) -122) != 0 || var19.field4761 != 0 || var19.field4757 == 1 || var19.field4770) {
                            if (!var19.method2097(arg0 - 10133)) {
                                var6 = false;
                                class696.field9826++;
                            }
                            var11 = true;
                        }
                    }
                }
                int var12 = var7.method890((byte) -59);
                if (var12 == 0) {
                    break;
                }
                var7.method842(2384);
            }
        }
    }

    @OriginalMember(owner = "client!gi", name = "f", descriptor = "(I)V", line = 550)
    public final void method3997(int arg0) {
        this.field9953 = null;
        if (arg0 >= -97) {
            this.method3995(null, true);
        }
        this.field9937 = this.field9942 = this.field9926 = null;
        this.field9951 = null;
        this.field9954 = null;
        this.field9950 = null;
        field9938++;
        if (!this.field9939.method2513((byte) 88)) {
            for (class540 var2 = this.field9939.method2508((byte) 125); var2 != this.field9939.field5911; var2 = var2.field7578) {
                ((class531) var2).method958((byte) 27);
            }
        }
        this.field9927 = this.field9933 = 1;
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(B)V", line = 584)
    public static void method3998(byte arg0) {
        field9920 = null;
        field9940 = null;
        field9932 = null;
        if (arg0 != 20) {
            method3998((byte) 21);
        }
    }
}
