import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!to")
public class class5 {

    @OriginalMember(owner = "client!to", name = "d", descriptor = "[B")
    private byte[] field62;

    @OriginalMember(owner = "client!to", name = "c", descriptor = "[I")
    private int[] field61;

    @OriginalMember(owner = "client!to", name = "g", descriptor = "[I")
    private int[] field65;

    @OriginalMember(owner = "client!to", name = "b", descriptor = "Z")
    public static boolean field60 = false;

    @OriginalMember(owner = "client!to", name = "e", descriptor = "Ljava/lang/String;")
    public static String field63 = "Face here";

    @OriginalMember(owner = "client!to", name = "a", descriptor = "[I")
    public static int[] field59 = new int[128];

    @OriginalMember(owner = "client!to", name = "m", descriptor = "[I")
    public static int[] field71 = new int[50];

    @OriginalMember(owner = "client!to", name = "f", descriptor = "I")
    public static int field64;

    @OriginalMember(owner = "client!to", name = "h", descriptor = "I")
    public static int field66;

    @OriginalMember(owner = "client!to", name = "i", descriptor = "I")
    public static int field67;

    @OriginalMember(owner = "client!to", name = "j", descriptor = "I")
    public static int field68;

    @OriginalMember(owner = "client!to", name = "k", descriptor = "I")
    public static int field69;

    @OriginalMember(owner = "client!to", name = "l", descriptor = "I")
    public static int field70;

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(Ljava/lang/String;B)V", line = 9)
    public static final void method40(String arg0, byte arg1) {
        field64++;
        if (class121.field1804 >= 2) {
            if (arg0.equalsIgnoreCase("::gc")) {
                class44.method336((byte) -87);
                for (int var2 = 0; var2 < 10; var2++) {
                    System.gc();
                }
                Runtime var3 = Runtime.getRuntime();
                int var4 = (int) ((var3.totalMemory() - var3.freeMemory()) / 1024L);
                class147.method1047(false, "mem=" + var4 + "k", (String) null, 0);
            }
            if (arg0.equalsIgnoreCase("::mm")) {
                class44.method336((byte) -78);
                for (int var5 = 0; var5 < 10; var5++) {
                    System.gc();
                }
                Runtime var6 = Runtime.getRuntime();
                int var7 = (int) ((var6.totalMemory() - var6.freeMemory()) / 1024L);
                class147.method1047(false, "Memory before cleanup=" + var7 + "k", (String) null, 0);
                class169.method1171(false);
                class44.method336((byte) -10);
                for (int var8 = 0; var8 < 10; var8++) {
                    System.gc();
                }
                int var9 = (int) ((var6.totalMemory() - var6.freeMemory()) / 1024L);
                class147.method1047(false, "Memory after cleanup=" + var9 + "k", (String) null, 0);
            }
            if (arg0.equalsIgnoreCase("::pcachesize")) {
                class147.method1047(false, "Number of player models in cache:" + class204.method1392(false), (String) null, 0);
            }
            if (class245.field3886 && arg0.equalsIgnoreCase("::cardmem")) {
                System.out.println("oncard_geometry:" + class173.field2701);
                System.out.println("oncard_2d:" + class173.field2705);
                System.out.println("oncard_texture:" + class173.field2704);
            }
            if (arg0.equalsIgnoreCase("::clientdrop")) {
                class84.method554(100);
            }
            if (arg0.equalsIgnoreCase("::clientjs5drop")) {
                class267.field4400.method2080(4);
            }
            if (arg0.equalsIgnoreCase("::serverjs5drop")) {
                class267.field4400.method2072(112);
            }
            if (arg0.equalsIgnoreCase("::breakcon")) {
                class96.field1382.method1959((byte) 72);
                class346.field5545.method672(99);
                class267.field4400.method2070(-65);
            }
            if (arg0.equalsIgnoreCase("::replacecanvas")) {
                class8.field101 = true;
            }
            if (arg0.equalsIgnoreCase("::rebuild")) {
                class310.method2165(5, 25);
            }
            if (arg0.equalsIgnoreCase("::fpson")) {
                class126.field1902 = true;
            }
            if (arg0.equalsIgnoreCase("::fpsoff")) {
                class126.field1902 = false;
            }
            if (arg0.equalsIgnoreCase("::wm0")) {
                class124.method801(-1, false, 0, -1, 0);
            }
            if (arg0.equalsIgnoreCase("::wm1")) {
                class124.method801(-1, false, 0, -1, 1);
            }
            if (arg0.equalsIgnoreCase("::wm2")) {
                class124.method801(-1, false, 0, -1, 2);
            }
            if (arg0.equalsIgnoreCase("::wm3")) {
                class124.method801(768, false, 0, 1024, 3);
            }
            if (arg0.startsWith("::setba")) {
                class31.field478 = class233.method1608(false, arg0.substring(8));
                class292.method2064(true, class96.field1382);
                class81.field1187 = false;
            }
            if (arg0.startsWith("::setparticles")) {
                class145.method1035(class233.method1608(false, arg0.substring(15)));
                class292.method2064(true, class96.field1382);
                class81.field1187 = false;
            }
            if (arg0.startsWith("::fps ") && class290.field4818 != 0) {
                class41.method326(540359664, class233.method1608(false, arg0.substring(6)));
            }
            if (arg0.equalsIgnoreCase("::errortest")) {
                throw new RuntimeException();
            }
            if (arg0.startsWith("::rect_debug")) {
                class166.field2616 = class233.method1608(false, arg0.substring(12).trim());
                class147.method1047(false, "rect_debug=" + class166.field2616, (String) null, 0);
            }
            if (arg0.equalsIgnoreCase("::qa_op_test")) {
                class172.field2693 = true;
            }
            if (arg0.startsWith("::hdr") && class245.field3886 && !class91.method599(!class309.method2158(), -13678)) {
                class147.method1047(false, "Failed to enable hdr", (String) null, 0);
            }
            if (arg0.equalsIgnoreCase("::tween")) {
                if (class241.field3780) {
                    class241.field3780 = false;
                    class147.method1047(false, "Forced tweening disabled.", (String) null, 0);
                } else {
                    class241.field3780 = true;
                    class147.method1047(false, "Forced tweening ENABLED!", (String) null, 0);
                }
            }
            if (arg0.equalsIgnoreCase("::shiftclick")) {
                if (class148.field2397) {
                    System.out.println("Shift-click disabled.");
                    class148.field2397 = false;
                } else {
                    System.out.println("Shift-click ENABLED!");
                    class148.field2397 = true;
                }
            }
            if (arg0.equalsIgnoreCase("::getcgcoord")) {
                class147.method1047(false, "x:" + (class329.field5388.field4796 >> 7) + " z:" + (class329.field5388.field4783 >> 7) + " groundh:" + class101.field1457[class120.field1779][class329.field5388.field4796 >> 7][class329.field5388.field4783 >> 7], (String) null, 0);
            }
            if (arg0.equalsIgnoreCase("::getheight")) {
                class147.method1047(false, "Height: " + class101.field1457[class120.field1779][class329.field5388.field4796 >> 7][class329.field5388.field4783 >> 7], (String) null, 0);
            }
        }
        class195.field2992.method250(21066, 0);
        class195.field2992.method2193(arg0.length() - 1, false);
        int var10 = 65 % ((arg1 - 47) / 33);
        class215.field3317++;
        class195.field2992.method2223(0, arg0.substring(2));
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(BI[BII[B)I", line = 241)
    public final int method41(byte arg0, int arg1, byte[] arg2, int arg3, int arg4, byte[] arg5) {
        int var7 = arg1 + arg3;
        int var8 = 0;
        if (arg0 != -61) {
            method44(7, -102);
        }
        field68++;
        int var9 = arg4 << 3;
        while (var7 > arg1) {
            int var10 = arg2[arg1] & 0xFF;
            byte var11 = this.field62[var10];
            int var12 = this.field65[var10];
            if (var11 == 0) {
                throw new RuntimeException("No codeword for data value " + var10);
            }
            int var13 = var9 >> 3;
            int var14 = var9 & 0x7;
            var9 += var11;
            int var15 = var8 & -var14 >> 31;
            int var16 = (var11 + var14 - 1 >> 3) + var13;
            int var17 = var14 + 24;
            arg5[var13] = (byte) (var8 = class167.method1160(var15, var12 >>> var17));
            if (var13 < var16) {
                var13++;
                var14 = var17 - 8;
                arg5[var13] = (byte) (var8 = var12 >>> var14);
                if (var16 > var13) {
                    var13++;
                    var14 -= 8;
                    arg5[var13] = (byte) (var8 = var12 >>> var14);
                    if (var13 < var16) {
                        var14 -= 8;
                        var13++;
                        arg5[var13] = (byte) (var8 = var12 >>> var14);
                        if (var13 < var16) {
                            var13++;
                            var14 -= 8;
                            arg5[var13] = (byte) (var8 = var12 << -var14);
                        }
                    }
                }
            }
            arg1++;
        }
        return (var9 + 7 >> 3) - arg4;
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "([BBIII[B)I", line = 317)
    public final int method42(byte[] arg0, byte arg1, int arg2, int arg3, int arg4, byte[] arg5) {
        if (arg1 < 53) {
            return 17;
        }
        field67++;
        if (arg4 == 0) {
            return 0;
        }
        int var7 = arg3 + arg4;
        int var8 = 0;
        int var9 = arg2;
        while (true) {
            byte var10 = arg0[var9];
            if (var10 < 0) {
                var8 = this.field61[var8];
            } else {
                var8++;
            }
            int var11;
            if ((var11 = this.field61[var8]) < 0) {
                arg5[arg3++] = (byte) (~var11);
                if (arg3 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x40) == 0) {
                var8++;
            } else {
                var8 = this.field61[var8];
            }
            int var12;
            if ((var12 = this.field61[var8]) < 0) {
                arg5[arg3++] = (byte) (~var12);
                if (var7 <= arg3) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x20) == 0) {
                var8++;
            } else {
                var8 = this.field61[var8];
            }
            int var13;
            if ((var13 = this.field61[var8]) < 0) {
                arg5[arg3++] = (byte) (~var13);
                if (arg3 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x10) == 0) {
                var8++;
            } else {
                var8 = this.field61[var8];
            }
            int var14;
            if ((var14 = this.field61[var8]) < 0) {
                arg5[arg3++] = (byte) (~var14);
                if (var7 <= arg3) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x8) == 0) {
                var8++;
            } else {
                var8 = this.field61[var8];
            }
            int var15;
            if ((var15 = this.field61[var8]) < 0) {
                arg5[arg3++] = (byte) (~var15);
                if (var7 <= arg3) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x4) == 0) {
                var8++;
            } else {
                var8 = this.field61[var8];
            }
            int var16;
            if ((var16 = this.field61[var8]) < 0) {
                arg5[arg3++] = (byte) (~var16);
                if (var7 <= arg3) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x2) == 0) {
                var8++;
            } else {
                var8 = this.field61[var8];
            }
            int var17;
            if ((var17 = this.field61[var8]) < 0) {
                arg5[arg3++] = (byte) (~var17);
                if (var7 <= arg3) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x1) == 0) {
                var8++;
            } else {
                var8 = this.field61[var8];
            }
            int var18;
            if ((var18 = this.field61[var8]) < 0) {
                arg5[arg3++] = (byte) (~var18);
                if (var7 <= arg3) {
                    break;
                }
                var8 = 0;
            }
            var9++;
        }
        return var9 + 1 - arg2;
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(B)V", line = 465)
    public static void method43(byte arg0) {
        field63 = null;
        field59 = null;
        field71 = null;
        if (arg0 != 120) {
            method40((String) null, (byte) -64);
        }
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(II)I", line = 479)
    public static final int method44(int arg0, int arg1) {
        field66++;
        double var2 = (double) ((arg0 & 0xFF5C74) >> 16) / 256.0D;
        double var4 = (double) (arg0 & arg1) / 256.0D;
        double var6 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
        double var8 = var2;
        double var10 = var2;
        if (var2 < var6) {
            var10 = var6;
        }
        if (var6 < var2) {
            var8 = var6;
        }
        double var12 = 0.0D;
        if (var4 < var8) {
            var8 = var4;
        }
        double var14 = 0.0D;
        if (var4 > var10) {
            var10 = var4;
        }
        double var16 = (var8 + var10) / 2.0D;
        if (var8 != var10) {
            if (var2 == var10) {
                var12 = (var6 - var4) / (var10 - var8);
            } else if (var6 == var10) {
                var12 = (var4 - var2) / (var10 - var8) + 2.0D;
            } else if (var4 == var10) {
                var12 = (var2 - var6) / (var10 - var8) + 4.0D;
            }
            if (var16 < 0.5D) {
                var14 = (var10 - var8) / (var8 + var10);
            }
            if (var16 >= 0.5D) {
                var14 = (var10 - var8) / (2.0D - var10 - var8);
            }
        }
        double var18 = var12 / 6.0D;
        int var20 = (int) (var14 * 256.0D);
        int var21 = (int) (var18 * 256.0D);
        int var22 = (int) (var16 * 256.0D);
        if (var22 < 0) {
            var22 = 0;
        } else if (var22 > 255) {
            var22 = 255;
        }
        if (var20 < 0) {
            var20 = 0;
        } else if (var20 > 255) {
            var20 = 255;
        }
        if (var22 > 243) {
            var20 >>= 0x4;
        } else if (var22 > 217) {
            var20 >>= 0x3;
        } else if (var22 > 192) {
            var20 >>= 0x2;
        } else if (var22 > 179) {
            var20 >>= 0x1;
        }
        return (var22 >> 1) + (var20 >> 5 << 7) + (var21 >> 2 << 10);
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(IIIII)V", line = 579)
    public static final void method45(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class179.field2785 = -1;
        class32.field488 = -1;
        field69++;
        int var5 = arg4;
        float var6 = (float) class88.field1262 / (float) class88.field1263;
        int var7 = 123 / ((arg3 - 89) / 35);
        int var8 = arg2;
        if (var6 < 1.0F) {
            var8 = (int) ((float) arg4 * var6);
        } else {
            var5 = (int) ((float) arg2 / var6);
        }
        int var9 = arg1 - (arg2 - var8) / 2;
        int var10 = arg0 - (arg4 - var5) / 2;
        class236.field3735 = class88.field1263 * var10 / var5;
        class125.field1873 = class88.field1262 * var9 / var8;
        class300.method2110(true);
    }

    @OriginalMember(owner = "client!to", name = "<init>", descriptor = "([B)V", line = 609)
    public class5(byte[] arg0) {
        int var2 = 0;
        int var3 = arg0.length;
        this.field62 = arg0;
        this.field61 = new int[8];
        int[] var4 = new int[33];
        this.field65 = new int[var3];
        for (int var5 = 0; var5 < var3; var5++) {
            byte var6 = arg0[var5];
            if (var6 != 0) {
                int var7 = 0x1 << 32 - var6;
                int var8 = var4[var6];
                this.field65[var5] = var8;
                int var12;
                if ((var7 & var8) == 0) {
                    for (int var9 = var6 - 1; var9 >= 1; var9--) {
                        int var10 = var4[var9];
                        if (var8 != var10) {
                            break;
                        }
                        int var11 = 0x1 << 32 - var9;
                        if ((var11 & var10) != 0) {
                            var4[var9] = var4[var9 - 1];
                            break;
                        }
                        var4[var9] = class167.method1160(var11, var10);
                    }
                    var12 = var7 | var8;
                } else {
                    var12 = var4[var6 - 1];
                }
                var4[var6] = var12;
                for (int var13 = var6 + 1; var13 <= 32; var13++) {
                    if (var4[var13] == var8) {
                        var4[var13] = var12;
                    }
                }
                int var14 = 0;
                for (int var15 = 0; var15 < var6; var15++) {
                    int var16 = Integer.MIN_VALUE >>> var15;
                    if ((var8 & var16) == 0) {
                        var14++;
                    } else {
                        if (this.field61[var14] == 0) {
                            this.field61[var14] = var2;
                        }
                        var14 = this.field61[var14];
                    }
                    if (var14 >= this.field61.length) {
                        int[] var17 = new int[this.field61.length * 2];
                        for (int var18 = 0; var18 < this.field61.length; var18++) {
                            var17[var18] = this.field61[var18];
                        }
                        this.field61 = var17;
                    }
                    int var19 = var16 >>> 1;
                }
                if (var2 <= var14) {
                    var2 = var14 + 1;
                }
                this.field61[var14] = ~var5;
            }
        }
    }
}
