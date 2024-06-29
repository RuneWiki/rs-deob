import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kd")
public class class410 extends class3 {

    @OriginalMember(owner = "client!kd", name = "C", descriptor = "I")
    private int field5814 = 0;

    @OriginalMember(owner = "client!kd", name = "H", descriptor = "Lew;")
    private class270 field5819 = new class270(16);

    @OriginalMember(owner = "client!kd", name = "K", descriptor = "I")
    private int field5822 = 0;

    @OriginalMember(owner = "client!kd", name = "O", descriptor = "Lmg;")
    private class530 field5826 = new class530();

    @OriginalMember(owner = "client!kd", name = "P", descriptor = "J")
    private long field5827 = 0L;

    @OriginalMember(owner = "client!kd", name = "n", descriptor = "Lro;")
    private class126 field5799;

    @OriginalMember(owner = "client!kd", name = "I", descriptor = "I")
    private int field5820;

    @OriginalMember(owner = "client!kd", name = "N", descriptor = "Z")
    private boolean field5825;

    @OriginalMember(owner = "client!kd", name = "M", descriptor = "Lmg;")
    private class530 field5824;

    @OriginalMember(owner = "client!kd", name = "Q", descriptor = "Z")
    private boolean field5828;

    @OriginalMember(owner = "client!kd", name = "k", descriptor = "Lro;")
    private class126 field5796;

    @OriginalMember(owner = "client!kd", name = "J", descriptor = "Lep;")
    private class310 field5821;

    @OriginalMember(owner = "client!kd", name = "v", descriptor = "I")
    private int field5807;

    @OriginalMember(owner = "client!kd", name = "G", descriptor = "I")
    private int field5818;

    @OriginalMember(owner = "client!kd", name = "j", descriptor = "Lgd;")
    private class196 field5795;

    @OriginalMember(owner = "client!kd", name = "m", descriptor = "Ltk;")
    private class302 field5798;

    @OriginalMember(owner = "client!kd", name = "F", descriptor = "[[I")
    public static int[][] field5817 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 3, 5, 3 }, { 6, 0, 2, 4 }, { 2, 5, 6, 1 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 7, 1, 2, 4, 6 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 1, 1, 3, 3 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 3, 7, 0, 4, 3 }, { 0, 2, 4, 6 } };

    @OriginalMember(owner = "client!kd", name = "h", descriptor = "I")
    public static int field5793;

    @OriginalMember(owner = "client!kd", name = "i", descriptor = "I")
    public static int field5794;

    @OriginalMember(owner = "client!kd", name = "l", descriptor = "I")
    public static int field5797;

    @OriginalMember(owner = "client!kd", name = "o", descriptor = "I")
    public static int field5800;

    @OriginalMember(owner = "client!kd", name = "p", descriptor = "I")
    public static int field5801;

    @OriginalMember(owner = "client!kd", name = "q", descriptor = "I")
    public static int field5802;

    @OriginalMember(owner = "client!kd", name = "r", descriptor = "I")
    public static int field5803;

    @OriginalMember(owner = "client!kd", name = "s", descriptor = "I")
    public static int field5804;

    @OriginalMember(owner = "client!kd", name = "t", descriptor = "I")
    public static int field5805;

    @OriginalMember(owner = "client!kd", name = "w", descriptor = "I")
    public static int field5808;

    @OriginalMember(owner = "client!kd", name = "y", descriptor = "I")
    public static int field5810;

    @OriginalMember(owner = "client!kd", name = "z", descriptor = "I")
    public static int field5811;

    @OriginalMember(owner = "client!kd", name = "A", descriptor = "I")
    public static int field5812;

    @OriginalMember(owner = "client!kd", name = "B", descriptor = "I")
    public static int field5813;

    @OriginalMember(owner = "client!kd", name = "D", descriptor = "I")
    public static int field5815;

    @OriginalMember(owner = "client!kd", name = "E", descriptor = "I")
    public static int field5816;

    @OriginalMember(owner = "client!kd", name = "x", descriptor = "Llf;")
    private class513 field5809;

    @OriginalMember(owner = "client!kd", name = "L", descriptor = "Z")
    private boolean field5823;

    @OriginalMember(owner = "client!kd", name = "u", descriptor = "[B")
    private byte[] field5806;

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(ILl;Lza;)V", line = 7)
    public static final void method2401(int arg0, class127 arg1, class295 arg2) {
        field5811++;
        if (class472.field6807 == null) {
            return;
        }
        if (class1.field16 < 10) {
            if (!class472.field6802.method2491(class472.field6807.field6708, 255)) {
                class1.field16 = class315.field4271.method2494(class472.field6807.field6708, 19857) / 10;
                return;
            }
            class195.method1278(0);
            class1.field16 = 10;
        }
        if (class1.field16 == 10) {
            class472.field6838 = class472.field6807.field6701 >> 6 << 6;
            class472.field6835 = class472.field6807.field6717 >> 6 << 6;
            class472.field6833 = (class472.field6807.field6712 >> 6 << 6) + (64 - class472.field6835);
            class472.field6821 = (class472.field6807.field6721 >> 6 << 6) + 64 - class472.field6838;
            int[] var3 = new int[3];
            int var4 = -1;
            int var5 = -1;
            if (class472.field6807.method2697(class81.field1158.field6279, (class81.field1158.field6284 >> 7) + class110.field1775, -83, class399.field5727 + (class81.field1158.field6287 >> 7), var3)) {
                var4 = var3[1] - class472.field6838;
                var5 = var3[2] - class472.field6835;
            }
            if (!class502.field7347 && var4 >= 0 && class472.field6821 > var4 && var5 >= 0 && var5 < class472.field6833) {
                int var6 = var4 + (int) (Math.random() * 10.0D) - 5;
                int var7 = var5 + (int) (Math.random() * 10.0D) - 5;
                class336.field4899 = var6;
                class321.field4414 = var7;
            } else if (class346.field4984 == -1 || class124.field1915 == -1) {
                class472.field6807.method2695(class472.field6807.field6719 >> 14 & 0x3FFF, var3, (byte) -55, class472.field6807.field6719 & 0x3FFF);
                class321.field4414 = var3[2] - class472.field6835;
                class336.field4899 = var3[1] - class472.field6838;
            } else {
                class472.field6807.method2695(class346.field4984, var3, (byte) -84, class124.field1915);
                class502.field7347 = false;
                if (var3 != null) {
                    class321.field4414 = var3[2] - class472.field6835;
                    class336.field4899 = var3[1] - class472.field6838;
                }
                class124.field1915 = -1;
                class346.field4984 = -1;
            }
            if (class472.field6807.field6716 == 37) {
                class472.field6812 = 3.0F;
                class472.field6810 = 3.0F;
            } else if (class472.field6807.field6716 == 50) {
                class472.field6812 = 4.0F;
                class472.field6810 = 4.0F;
            } else if (class472.field6807.field6716 == 75) {
                class472.field6812 = 6.0F;
                class472.field6810 = 6.0F;
            } else if (class472.field6807.field6716 == 100) {
                class472.field6812 = 8.0F;
                class472.field6810 = 8.0F;
            } else if (class472.field6807.field6716 == 200) {
                class472.field6812 = 16.0F;
                class472.field6810 = 16.0F;
            } else {
                class472.field6812 = 8.0F;
                class472.field6810 = 8.0F;
            }
            class472.field6809 = (int) class472.field6812 >> 1;
            class472.field6815 = class95.method770(class472.field6809, false);
            class409.method2400((byte) 2);
            class472.method2753();
            class377.field5430 = new class530();
            class472.field6817 += (int) (Math.random() * 5.0D) - 2;
            if (class472.field6817 < -8) {
                class472.field6817 = -8;
            }
            if (class472.field6817 > 8) {
                class472.field6817 = 8;
            }
            class472.field6818 += (int) (Math.random() * 5.0D) - 2;
            if (class472.field6818 < -16) {
                class472.field6818 = -16;
            }
            if (class472.field6818 > 16) {
                class472.field6818 = 16;
            }
            class472.method2760(arg1, class472.field6817 >> 2 << 10, class472.field6818 >> 1);
            class472.field6803.method1654(256, true, 1024);
            class472.field6805.method1499(256, 256, 73);
            class472.field6808.method606(500, 4096);
            class296.field3994.method1315(0, 256);
            class1.field16 = 20;
        } else if (class1.field16 == 20) {
            class315.method1816((byte) 81, true);
            class472.method2743(arg2, class472.field6817, class472.field6818);
            class1.field16 = 60;
            class315.method1816((byte) -123, true);
            class441.method2607(0);
        } else if (arg0 > 79) {
            if (class1.field16 == 60) {
                if (class472.field6802.method2510(class472.field6807.field6708 + "_staticelements", 11)) {
                    if (!class472.field6802.method2491(class472.field6807.field6708 + "_staticelements", 255)) {
                        return;
                    }
                    class472.field6814 = class145.method1009(false, class65.field938, class472.field6807.field6708 + "_staticelements", class472.field6802);
                } else {
                    class472.field6814 = new class431(0);
                }
                class472.method2763();
                class1.field16 = 70;
                class315.method1816((byte) -30, true);
                class441.method2607(0);
            } else if (class1.field16 == 70) {
                class414.field5894 = new class155(arg2, 11, true, class415.field6025);
                class1.field16 = 73;
                class315.method1816((byte) -70, true);
                class441.method2607(0);
            } else if (class1.field16 == 73) {
                class54.field780 = new class155(arg2, 12, true, class415.field6025);
                class1.field16 = 76;
                class315.method1816((byte) -84, true);
                class441.method2607(0);
            } else if (class1.field16 == 76) {
                class28.field405 = new class155(arg2, 14, true, class415.field6025);
                class1.field16 = 79;
                class315.method1816((byte) 110, true);
                class441.method2607(0);
            } else if (class1.field16 == 79) {
                class490.field7080 = new class155(arg2, 17, true, class415.field6025);
                class1.field16 = 82;
                class315.method1816((byte) 84, true);
                class441.method2607(0);
            } else if (class1.field16 == 82) {
                class390.field5634 = new class155(arg2, 19, true, class415.field6025);
                class1.field16 = 85;
                class315.method1816((byte) -60, true);
                class441.method2607(0);
            } else if (class1.field16 == 85) {
                class187.field2761 = new class155(arg2, 22, true, class415.field6025);
                class1.field16 = 88;
                class315.method1816((byte) -58, true);
                class441.method2607(0);
            } else if (class1.field16 == 88) {
                class411.field5831 = new class155(arg2, 26, true, class415.field6025);
                class1.field16 = 91;
                class315.method1816((byte) -92, true);
                class441.method2607(0);
            } else {
                class77.field1090 = new class155(arg2, 30, true, class415.field6025);
                class1.field16 = 100;
                class315.method1816((byte) -59, true);
                class441.method2607(0);
                System.gc();
            }
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(IB)V", line = 244)
    public final void method19(int arg0, byte arg1) {
        field5797++;
        if (this.field5799 == null) {
            return;
        }
        if (arg1 <= 61) {
            this.field5806 = null;
        }
        for (class476 var3 = this.field5826.method3137(0); var3 != null; var3 = this.field5826.method3132(0)) {
            if ((long) arg0 == var3.field6883) {
                return;
            }
        }
        class476 var4 = new class476();
        var4.field6883 = arg0;
        this.field5826.method3139(0, var4);
    }

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "(B)V", line = 273)
    public final void method2402(byte arg0) {
        field5800++;
        if (this.field5799 == null) {
            return;
        }
        this.field5823 = true;
        if (this.field5824 == null) {
            this.field5824 = new class530();
        }
        int var2 = -12 % ((arg0 - 22) / 63);
    }

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "(II)I", line = 291)
    public final int method24(int arg0, int arg1) {
        field5793++;
        class302 var3 = (class302) this.field5819.method1592((byte) -25, (long) arg1);
        int var4 = 96 % ((-arg0 - 73) / 39);
        return var3 == null ? 0 : var3.method1720((byte) -48);
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(Lsv;Z)V", line = 310)
    public static final void method2403(class319 arg0, boolean arg1) {
        field5815++;
        if (arg0.field4336.length - arg0.field4360 < 1 || arg1) {
            return;
        }
        int var2 = arg0.method1869(-78);
        if (var2 < 0 || var2 > 1 || arg0.field4336.length - arg0.field4360 < 2) {
            return;
        }
        int var3 = arg0.method1844(-113);
        if ((var3 * 6) > (arg0.field4336.length - arg0.field4360)) {
            return;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            int var5 = arg0.method1844(-109);
            int var6 = arg0.method1863(-1);
            if (class451.field6614.length > var5 && class308.field4189[var5] && (class32.field493.method2479(var5, (byte) 10).field951 != '1' || var6 >= -1 && var6 <= 1)) {
                class451.field6614[var5] = var6;
            }
        }
    }

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "(I)I", line = 357)
    public final int method2404(int arg0) {
        field5801++;
        if (this.field5809 == null) {
            return 0;
        } else if (this.field5825) {
            if (arg0 != -31419) {
                this.method2406(-117, 120, 68);
            }
            class476 var2 = this.field5824.method3137(0);
            return var2 == null ? 0 : (int) var2.field6883;
        } else {
            return this.field5809.field7511;
        }
    }

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "(IB)[B", line = 382)
    public final byte[] method22(int arg0, byte arg1) {
        field5803++;
        class302 var3 = this.method2406(20977, arg0, 0);
        int var4 = 92 / ((-arg1 - 36) / 42);
        if (var3 == null) {
            return null;
        } else {
            byte[] var5 = var3.method1716(255);
            var3.method2791((byte) 112);
            return var5;
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(ILjava/lang/String;)I", line = 401)
    public static final int method2405(int arg0, String arg1) {
        field5816++;
        int var2 = -108 % ((arg0 + 71) / 46);
        return class374.method2241(10, true, arg1, true);
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(III)Ltk;", line = 411)
    private final class302 method2406(int arg0, int arg1, int arg2) {
        field5813++;
        class302 var4 = (class302) this.field5819.method1592((byte) -25, (long) arg1);
        if (var4 != null && arg2 == 0 && !var4.field4125 && var4.field4123) {
            var4.method2791((byte) 112);
            var4 = null;
        }
        if (var4 == null) {
            if (arg2 == 0) {
                if (this.field5799 == null || this.field5806[arg1] == -1) {
                    if (this.field5795.method1292(true)) {
                        return null;
                    }
                    var4 = this.field5795.method1291((byte) 2, this.field5820, arg1, true, 120);
                } else {
                    var4 = this.field5821.method1792(arg0 ^ 0xFFFFAE41, arg1, this.field5799);
                }
            } else if (arg2 == 1) {
                if (this.field5799 == null) {
                    throw new RuntimeException();
                }
                var4 = this.field5821.method1790(1120, this.field5799, arg1);
            } else if (arg2 == 2) {
                if (this.field5799 == null) {
                    throw new RuntimeException();
                }
                if (this.field5806[arg1] != -1) {
                    throw new RuntimeException();
                }
                if (this.field5795.method1280((byte) 123)) {
                    return null;
                }
                var4 = this.field5795.method1291((byte) 2, this.field5820, arg1, false, -85);
            } else {
                throw new RuntimeException();
            }
            this.field5819.method1586(var4, (long) arg1, arg0 - 20976);
        }
        if (var4.field4123) {
            return null;
        }
        byte[] var5 = var4.method1716(arg0 ^ 0x510E);
        if (arg0 != 20977) {
            this.method24(-75, 64);
        }
        if (!var4 instanceof class342) {
            try {
                if (var5 == null || var5.length <= 2) {
                    throw new RuntimeException();
                }
                class382.field5482.reset();
                class382.field5482.update(var5, 0, var5.length - 2);
                int var9 = (int) class382.field5482.getValue();
                if (this.field5809.field7517[arg1] != var9) {
                    throw new RuntimeException();
                }
                this.field5795.field2887 = 0;
                this.field5795.field2888 = 0;
            } catch (RuntimeException var12) {
                this.field5795.method1294(1);
                var4.method2791((byte) 112);
                if (var4.field4125 && !this.field5795.method1292(true)) {
                    class296 var10 = this.field5795.method1291((byte) 2, this.field5820, arg1, true, 106);
                    this.field5819.method1586(var10, (long) arg1, 1);
                }
                return null;
            }
            var5[var5.length - 2] = (byte) (this.field5809.field7513[arg1] >>> 8);
            var5[var5.length - 1] = (byte) this.field5809.field7513[arg1];
            if (this.field5799 != null) {
                this.field5821.method1789(arg1, this.field5799, var5, (byte) 94);
                if (this.field5806[arg1] != 1) {
                    this.field5814++;
                    this.field5806[arg1] = 1;
                }
            }
            if (!var4.field4125) {
                var4.method2791((byte) 112);
            }
            return var4;
        }
        try {
            if (var5 == null || var5.length <= 2) {
                throw new RuntimeException();
            }
            class382.field5482.reset();
            class382.field5482.update(var5, 0, var5.length - 2);
            int var6 = (int) class382.field5482.getValue();
            if (this.field5809.field7517[arg1] != var6) {
                throw new RuntimeException();
            }
            int var7 = ((var5[var5.length - 2] & 0xFF) << 8) + (var5[var5.length - 1] & 0xFF);
            if ((this.field5809.field7513[arg1] & 0xFFFF) != var7) {
                throw new RuntimeException();
            }
            if (this.field5806[arg1] != 1) {
                this.field5814++;
                this.field5806[arg1] = 1;
            }
            if (!var4.field4125) {
                var4.method2791((byte) 112);
            }
            return var4;
        } catch (Exception var11) {
            this.field5806[arg1] = -1;
            var4.method2791((byte) 112);
            if (var4.field4125 && !this.field5795.method1292(true)) {
                class296 var8 = this.field5795.method1291((byte) 2, this.field5820, arg1, true, 87);
                this.field5819.method1586(var8, (long) arg1, 1);
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!kd", name = "c", descriptor = "(I)V", line = 625)
    public final void method2407(int arg0) {
        field5810++;
        if (arg0 <= 12) {
            this.method24(54, -54);
        }
        if (this.field5824 != null) {
            if (this.method20((byte) -45) == null) {
                return;
            }
            if (this.field5825) {
                boolean var2 = true;
                for (class476 var3 = this.field5824.method3137(0); var3 != null; var3 = this.field5824.method3132(0)) {
                    int var5 = (int) var3.field6883;
                    if (this.field5806[var5] == 0) {
                        this.method2406(20977, var5, 1);
                    }
                    if (this.field5806[var5] == 0) {
                        var2 = false;
                    } else {
                        var3.method2791((byte) 112);
                    }
                }
                while (this.field5822 < this.field5809.field7507.length) {
                    if (this.field5809.field7507[this.field5822] == 0) {
                        this.field5822++;
                    } else {
                        if (this.field5821.field4221 >= 250) {
                            var2 = false;
                            break;
                        }
                        if (this.field5806[this.field5822] == 0) {
                            this.method2406(20977, this.field5822, 1);
                        }
                        if (this.field5806[this.field5822] == 0) {
                            class476 var4 = new class476();
                            var4.field6883 = this.field5822;
                            var2 = false;
                            this.field5824.method3139(0, var4);
                        }
                        this.field5822++;
                    }
                }
                if (var2) {
                    this.field5825 = false;
                    this.field5822 = 0;
                }
            } else if (this.field5823) {
                boolean var6 = true;
                for (class476 var7 = this.field5824.method3137(0); var7 != null; var7 = this.field5824.method3132(0)) {
                    int var9 = (int) var7.field6883;
                    if (this.field5806[var9] != 1) {
                        this.method2406(20977, var9, 2);
                    }
                    if (this.field5806[var9] == 1) {
                        var7.method2791((byte) 112);
                    } else {
                        var6 = false;
                    }
                }
                while (this.field5809.field7507.length > this.field5822) {
                    if (this.field5809.field7507[this.field5822] == 0) {
                        this.field5822++;
                    } else {
                        if (this.field5795.method1280((byte) 123)) {
                            var6 = false;
                            break;
                        }
                        if (this.field5806[this.field5822] != 1) {
                            this.method2406(20977, this.field5822, 2);
                        }
                        if (this.field5806[this.field5822] != 1) {
                            class476 var8 = new class476();
                            var8.field6883 = this.field5822;
                            var6 = false;
                            this.field5824.method3139(0, var8);
                        }
                        this.field5822++;
                    }
                }
                if (var6) {
                    this.field5822 = 0;
                    this.field5823 = false;
                }
            } else {
                this.field5824 = null;
            }
        }
        if (!this.field5828 || this.field5827 > class254.method1522((byte) -51)) {
            return;
        }
        for (class302 var10 = (class302) this.field5819.method1588(73); var10 != null; var10 = (class302) this.field5819.method1582(-107)) {
            if (!var10.field4123) {
                if (var10.field4120) {
                    if (!var10.field4125) {
                        throw new RuntimeException();
                    }
                    var10.method2791((byte) 112);
                } else {
                    var10.field4120 = true;
                }
            }
        }
        this.field5827 = class254.method1522((byte) -51) + 1000L;
    }

    @OriginalMember(owner = "client!kd", name = "c", descriptor = "(B)I", line = 802)
    public final int method2408(byte arg0) {
        if (arg0 >= -12) {
            return 39;
        }
        field5812++;
        if (this.method20((byte) 41) == null) {
            return this.field5798 == null ? 0 : this.field5798.method1720((byte) -48);
        } else {
            return 100;
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(B)Llf;", line = 824)
    public final class513 method20(byte arg0) {
        field5802++;
        int var2 = 119 % ((2 - arg0) / 36);
        if (this.field5809 != null) {
            return this.field5809;
        }
        if (this.field5798 == null) {
            if (this.field5795.method1292(true)) {
                return null;
            }
            this.field5798 = this.field5795.method1291((byte) 0, 255, this.field5820, true, -105);
        }
        if (this.field5798.field4123) {
            return null;
        }
        byte[] var3 = this.field5798.method1716(255);
        if (this.field5798 instanceof class342) {
            try {
                if (var3 == null) {
                    throw new RuntimeException();
                }
                this.field5809 = new class513(var3, this.field5807);
                if (this.field5809.field7518 != this.field5818) {
                    throw new RuntimeException();
                }
            } catch (RuntimeException var4) {
                this.field5809 = null;
                if (this.field5795.method1292(true)) {
                    this.field5798 = null;
                } else {
                    this.field5798 = this.field5795.method1291((byte) 0, 255, this.field5820, true, -105);
                }
                return null;
            }
        } else {
            try {
                if (var3 == null) {
                    throw new RuntimeException();
                }
                this.field5809 = new class513(var3, this.field5807);
            } catch (RuntimeException var5) {
                this.field5795.method1294(1);
                this.field5809 = null;
                if (this.field5795.method1292(true)) {
                    this.field5798 = null;
                } else {
                    this.field5798 = this.field5795.method1291((byte) 0, 255, this.field5820, true, 116);
                }
                return null;
            }
            if (this.field5796 != null) {
                this.field5821.method1789(this.field5820, this.field5796, var3, (byte) 94);
            }
        }
        if (this.field5799 != null) {
            this.field5814 = 0;
            this.field5806 = new byte[this.field5809.field7512];
        }
        this.field5798 = null;
        return this.field5809;
    }

    @OriginalMember(owner = "client!kd", name = "d", descriptor = "(I)I", line = 922)
    public final int method2409(int arg0) {
        if (arg0 < 126) {
            return 14;
        } else {
            field5805++;
            return this.field5809 == null ? 0 : this.field5809.field7511;
        }
    }

    @OriginalMember(owner = "client!kd", name = "e", descriptor = "(I)I", line = 940)
    public final int method2410(int arg0) {
        field5794++;
        return arg0 == 0 ? this.field5814 : -44;
    }

    @OriginalMember(owner = "client!kd", name = "d", descriptor = "(B)V", line = 951)
    public final void method2411(byte arg0) {
        field5808++;
        if (arg0 < 35) {
            method2401(73, null, null);
        }
        if (this.field5824 == null || this.method20((byte) -60) == null) {
            return;
        }
        for (class476 var2 = this.field5826.method3137(0); var2 != null; var2 = this.field5826.method3132(0)) {
            int var3 = (int) var2.field6883;
            if (var3 < 0 || var3 >= this.field5809.field7512 || this.field5809.field7507[var3] == 0) {
                var2.method2791((byte) 112);
            } else {
                if (this.field5806[var3] == 0) {
                    this.method2406(20977, var3, 1);
                }
                if (this.field5806[var3] == -1) {
                    this.method2406(20977, var3, 2);
                }
                if (this.field5806[var3] == 1) {
                    var2.method2791((byte) 112);
                }
            }
        }
    }

    @OriginalMember(owner = "client!kd", name = "e", descriptor = "(B)V", line = 997)
    public static void method2412(byte arg0) {
        if (arg0 > 51) {
            field5817 = null;
        }
    }

    @OriginalMember(owner = "client!kd", name = "<init>", descriptor = "(ILro;Lro;Lgd;Lep;IIZ)V", line = 1041)
    public class410(int arg0, class126 arg1, class126 arg2, class196 arg3, class310 arg4, int arg5, int arg6, boolean arg7) {
        this.field5799 = arg1;
        this.field5820 = arg0;
        if (this.field5799 == null) {
            this.field5825 = false;
        } else {
            this.field5825 = true;
            this.field5824 = new class530();
        }
        this.field5828 = arg7;
        this.field5796 = arg2;
        this.field5821 = arg4;
        this.field5807 = arg5;
        this.field5818 = arg6;
        this.field5795 = arg3;
        if (this.field5796 != null) {
            this.field5798 = this.field5821.method1792(106, this.field5820, this.field5796);
        }
    }
}
