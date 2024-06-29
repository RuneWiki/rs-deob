import jaclib.memory.Buffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vn")
public abstract class class426 {

    @OriginalMember(owner = "client!vn", name = "m", descriptor = "I")
    private int field6165;

    @OriginalMember(owner = "client!vn", name = "b", descriptor = "I")
    private int field6154;

    @OriginalMember(owner = "client!vn", name = "e", descriptor = "Lkw;")
    public class346 field6157;

    @OriginalMember(owner = "client!vn", name = "n", descriptor = "Z")
    private boolean field6166;

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "I")
    public int field6153;

    @OriginalMember(owner = "client!vn", name = "g", descriptor = "[I")
    public static int[] field6159 = new int[14];

    @OriginalMember(owner = "client!vn", name = "d", descriptor = "I")
    public static int field6156;

    @OriginalMember(owner = "client!vn", name = "h", descriptor = "I")
    public static int field6160;

    @OriginalMember(owner = "client!vn", name = "i", descriptor = "I")
    public static int field6161;

    @OriginalMember(owner = "client!vn", name = "j", descriptor = "I")
    public static int field6162;

    @OriginalMember(owner = "client!vn", name = "k", descriptor = "I")
    public static int field6163;

    @OriginalMember(owner = "client!vn", name = "f", descriptor = "Ljk;")
    public static class183 field6158;

    @OriginalMember(owner = "client!vn", name = "l", descriptor = "Lqt;")
    public static class502 field6164;

    @OriginalMember(owner = "client!vn", name = "c", descriptor = "[I")
    public static int[] field6155;

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(FFFI)F")
    public static final float method2646(float arg0, float arg1, float arg2, int arg3) {
        if (arg3 < 56) {
            return 0.8547657F;
        } else {
            field6156++;
            return (arg1 - arg2) * arg0 + arg2;
        }
    }

    @OriginalMember(owner = "client!vn", name = "d", descriptor = "(I)V")
    public static void method2647(int arg0) {
        field6159 = null;
        field6164 = null;
        if (arg0 != 3282) {
            method2647(-44);
        }
        field6158 = null;
        field6155 = null;
    }

    @OriginalMember(owner = "client!vn", name = "e", descriptor = "(I)V")
    public abstract void method1109(int arg0);

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(IIIIZ)V")
    public static final void method2648(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field6161++;
        if (arg2 != -1070116028) {
            method2648(19, 91, 85, 69, true);
        }
        if (!arg4 && class401.field5750 == arg3 && class109.field1560 == arg0 && class717.field10118 == class687.field9758 || class243.field3580.field8002.method2026(false) == 1) {
            return;
        }
        class401.field5750 = arg3;
        class717.field10118 = class687.field9758;
        class109.field1560 = arg0;
        if (class243.field3580.field8002.method2026(false) == 1) {
            class717.field10118 = 0;
        }
        class79.method649(-19704, arg1);
        class343.method2105(class79.field1140, class211.field3164, class208.field3141, (byte) -14, true, class608.field8632.method3543(-24350, class45.field748));
        int var5 = class41.field693;
        class41.field693 = (class401.field5750 - (class184.field2546 >> 4)) * 8;
        int var6 = class71.field1085;
        class71.field1085 = (class109.field1560 - (class240.field3555 >> 4)) * 8;
        client.field6413 = class664.method3788(class401.field5750 * 8, class109.field1560 * 8);
        class506.field7353 = null;
        int var7 = class41.field693 - var5;
        int var8 = class71.field1085 - var6;
        if (arg1 == 11) {
            for (int var17 = 0; var17 < class551.field8042; var17++) {
                class63 var30 = class414.field5889[var17];
                if (var30 != null) {
                    class571 var31 = var30.field1004;
                    for (int var32 = 0; var32 < 10; var32++) {
                        var31.field4646[var32] -= var7;
                        var31.field4645[var32] -= var8;
                    }
                    var31.field3916 -= var8 * 512;
                    var31.field3923 -= var7 * 512;
                }
            }
        } else {
            class619.field8816 = 0;
            boolean var9 = false;
            int var10 = class184.field2546 * 512 - 512;
            int var11 = class240.field3555 * 512 - 512;
            for (int var12 = 0; var12 < class551.field8042; var12++) {
                class63 var13 = class414.field5889[var12];
                if (var13 != null) {
                    class571 var14 = var13.field1004;
                    var14.field3923 -= var7 * 512;
                    var14.field3916 -= var8 * 512;
                    if (var14.field3923 >= 0 && var10 >= var14.field3923 && var14.field3916 >= 0 && var14.field3916 <= var11) {
                        boolean var15 = true;
                        for (int var16 = 0; var16 < 10; var16++) {
                            var14.field4646[var16] -= var7;
                            var14.field4645[var16] -= var8;
                            if (var14.field4646[var16] < 0 || var14.field4646[var16] >= class184.field2546 || var14.field4645[var16] < 0 || var14.field4645[var16] >= class240.field3555) {
                                var15 = false;
                            }
                        }
                        if (var15) {
                            class545.field7927[class619.field8816++] = var14.field4592;
                        } else {
                            var14.method3395(null, 0);
                            var13.method2656((byte) 120);
                            var9 = true;
                        }
                    } else {
                        var14.method3395(null, 0);
                        var13.method2656((byte) 121);
                        var9 = true;
                    }
                }
            }
            if (var9) {
                class551.field8042 = class389.field5608.method4019(arg2 + 1070116035);
                class389.field5608.method4017(class414.field5889, arg2 + 1070116148);
            }
        }
        for (int var18 = 0; var18 < 2048; var18++) {
            class639 var28 = class536.field7796[var18];
            if (var28 != null) {
                for (int var29 = 0; var29 < 10; var29++) {
                    var28.field4646[var29] -= var7;
                    var28.field4645[var29] -= var8;
                }
                var28.field3923 -= var7 * 512;
                var28.field3916 -= var8 * 512;
            }
        }
        class504[] var19 = class99.field1437;
        for (int var20 = 0; var20 < var19.length; var20++) {
            class504 var27 = var19[var20];
            if (var27 != null) {
                var27.field7335 -= var7 * 512;
                var27.field7323 -= var8 * 512;
            }
        }
        for (class279 var21 = (class279) class154.field2233.method3565(arg2 ^ 0xC0375323); var21 != null; var21 = (class279) class154.field2233.method3561((byte) 64)) {
            var21.field3901 -= var8;
            var21.field3906 -= var7;
            if (class445.field6361 != 4 && (var21.field3906 < 0 || var21.field3901 < 0 || class184.field2546 <= var21.field3906 || class240.field3555 <= var21.field3901)) {
                var21.method2656((byte) 127);
            }
        }
        if (class445.field6361 != 4) {
            for (class340 var22 = (class340) class591.field8409.method4023((byte) -26); var22 != null; var22 = (class340) class591.field8409.method4021((byte) 80)) {
                int var23 = (int) (var22.field6188 & 0x3FFFL);
                int var24 = var23 - class41.field693;
                int var25 = (int) (var22.field6188 >> 14 & 0x3FFFL);
                int var26 = var25 - class71.field1085;
                if (var24 < 0 || var26 < 0 || class184.field2546 <= var24 || var26 >= class240.field3555) {
                    var22.method2656((byte) 127);
                }
            }
        }
        if (class545.field7931 != 0) {
            class455.field6488 -= var8;
            class545.field7931 -= var7;
        }
        class91.method707(50);
        if (arg1 != 11) {
            class136.field1875 -= var8;
            class518.field7473 -= var7 * 512;
            class572.field8256 -= var7;
            class123.field1698 -= var8 * 512;
            class559.field8124 -= var7;
            class80.field1148 -= var8;
            if (Math.abs(var7) > class184.field2546 || Math.abs(var8) > class240.field3555) {
                class728.method4065(-1386);
            }
        } else if (class165.field2351 == 4) {
            class646.field9302 -= var7 * 512;
            class472.field6697 -= var7 * 512;
            class537.field7811 -= var8 * 512;
            class658.field9426 -= var8 * 512;
        } else {
            class616.field8773 = -1;
            class539.field7824 = -1;
            class165.field2351 = 1;
        }
        class696.method3917(0);
        class40.method423((byte) 102);
        class23.field214.method3553(0);
        class627.field8893.method3553(0);
        class562.field8147.method1525((byte) -104);
        class377.method2337(-103);
    }

    @OriginalMember(owner = "client!vn", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        field6160++;
        this.field6157.method2166(120, this.field6165, this.field6153);
        super.finalize();
    }

    @OriginalMember(owner = "client!vn", name = "f", descriptor = "(I)V")
    public static final void method2649(int arg0) {
        if (arg0 != -856408925) {
            method2648(22, 1, 105, -73, false);
        }
        field6162++;
        int var1 = class559.field8124 * 512 + 256;
        int var2 = class136.field1875 * 512 + 256;
        int var3 = class530.method3211(var2, 2, var1, class687.field9758) - class674.field9597;
        if (class697.field9856 < 100) {
            if (class518.field7473 < var1) {
                class518.field7473 += (var1 - class518.field7473) * class697.field9856 / 1000 + class389.field5611;
                if (class518.field7473 > var1) {
                    class518.field7473 = var1;
                }
            }
            if (class564.field8174 < var3) {
                class564.field8174 += (var3 - class564.field8174) * class697.field9856 / 1000 + class389.field5611;
                if (var3 < class564.field8174) {
                    class564.field8174 = var3;
                }
            }
            if (var1 < class518.field7473) {
                class518.field7473 -= (class518.field7473 - var1) * class697.field9856 / 1000 + class389.field5611;
                if (var1 > class518.field7473) {
                    class518.field7473 = var1;
                }
            }
            if (var3 < class564.field8174) {
                class564.field8174 -= (class564.field8174 - var3) * class697.field9856 / 1000 + class389.field5611;
                if (var3 > class564.field8174) {
                    class564.field8174 = var3;
                }
            }
            if (var2 > class123.field1698) {
                class123.field1698 += class389.field5611 + ((var2 - class123.field1698) * class697.field9856 / 1000);
                if (class123.field1698 > var2) {
                    class123.field1698 = var2;
                }
            }
            if (class123.field1698 > var2) {
                class123.field1698 -= (class123.field1698 - var2) * class697.field9856 / 1000 + class389.field5611;
                if (var2 > class123.field1698) {
                    class123.field1698 = var2;
                }
            }
        } else {
            class123.field1698 = class136.field1875 * 512 + 256;
            class518.field7473 = class559.field8124 * 512 + 256;
            class564.field8174 = class530.method3211(class123.field1698, 2, class518.field7473, class687.field9758) - class674.field9597;
        }
        int var4 = class80.field1148 * 512 + 256;
        int var5 = class572.field8256 * 512 + 256;
        int var6 = class530.method3211(var4, 2, var5, class687.field9758) - class647.field9332;
        int var7 = var5 - class518.field7473;
        int var8 = var6 - class564.field8174;
        int var9 = var4 - class123.field1698;
        int var10 = (int) Math.sqrt((double) (var7 * var7 + var9 * var9));
        int var11 = (int) (Math.atan2((double) var8, (double) var10) * 2607.5945876176133D) & 0x3FFF;
        int var12 = (int) (Math.atan2((double) var7, (double) var9) * -2607.5945876176133D) & 0x3FFF;
        if (var11 < 1024) {
            var11 = 1024;
        }
        if (var11 > 3072) {
            var11 = 3072;
        }
        if (class279.field3904 < var11) {
            class279.field3904 += (var11 - class279.field3904 >> 3) * class749.field10449 / 1000 + class405.field5770 << 3;
            if (var11 < class279.field3904) {
                class279.field3904 = var11;
            }
        }
        if (var11 < class279.field3904) {
            class279.field3904 -= (class279.field3904 - var11 >> 3) * class749.field10449 / 1000 + class405.field5770 << 3;
            if (class279.field3904 < var11) {
                class279.field3904 = var11;
            }
        }
        int var13 = var12 - class179.field2487;
        if (var13 > 8192) {
            var13 -= 16384;
        }
        if (var13 < -8192) {
            var13 += 16384;
        }
        int var14 = var13 >> 3;
        if (var14 > 0) {
            class179.field2487 += class405.field5770 + (class749.field10449 * var14 / 1000) << 3;
            class179.field2487 &= 0x3FFF;
        }
        if (var14 < 0) {
            class179.field2487 -= class405.field5770 + (-var14 * class749.field10449 / 1000) << 3;
            class179.field2487 &= 0x3FFF;
        }
        int var15 = var12 - class179.field2487;
        if (var15 > 8192) {
            var15 -= 16384;
        }
        if (var15 < -8192) {
            var15 += 16384;
        }
        if (var15 < 0 && var14 > 0 || var15 > 0 && var14 < 0) {
            class179.field2487 = var12;
        }
        class487.field7021 = 0;
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "([BII)V")
    public final void method2650(byte[] arg0, int arg1, int arg2) {
        this.method1109(arg2 ^ 0xFFFF9F8B);
        field6163++;
        if (arg2 != 24637) {
            method2648(-65, -7, 63, 7, true);
        }
        if (this.field6165 >= arg1) {
            OpenGL.glBufferSubDataARBub(this.field6154, 0, arg1, arg0, 0);
        } else {
            OpenGL.glBufferDataARBub(this.field6154, arg1, arg0, 0, this.field6166 ? 35040 : 35044);
            this.field6157.field4985 += arg1 - this.field6165;
            this.field6165 = arg1;
        }
    }

    @OriginalMember(owner = "client!vn", name = "<init>", descriptor = "(Lkw;I[BIZ)V")
    public class426(class346 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        this.field6165 = arg3;
        this.field6154 = arg1;
        this.field6157 = arg0;
        this.field6166 = arg4;
        OpenGL.glGenBuffersARB(1, class741.field10338, 0);
        this.field6153 = class741.field10338[0];
        this.method1109(-94);
        OpenGL.glBufferDataARBub(arg1, this.field6165, arg2, 0, this.field6166 ? 35040 : 35044);
        this.field6157.field4985 += this.field6165;
    }

    @OriginalMember(owner = "client!vn", name = "<init>", descriptor = "(Lkw;ILjaclib/memory/Buffer;IZ)V")
    public class426(class346 arg0, int arg1, Buffer arg2, int arg3, boolean arg4) {
        this.field6154 = arg1;
        this.field6165 = arg3;
        this.field6166 = arg4;
        this.field6157 = arg0;
        OpenGL.glGenBuffersARB(1, class741.field10338, 0);
        this.field6153 = class741.field10338[0];
        this.method1109(-113);
        OpenGL.glBufferDataARBa(arg1, this.field6165, arg2.getAddress(), this.field6166 ? 35040 : 35044);
        this.field6157.field4985 += this.field6165;
    }
}
