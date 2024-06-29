import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wb")
public class class156 extends class17 {

    @OriginalMember(owner = "client!wb", name = "tb", descriptor = "I")
    private int field2818 = 3216;

    @OriginalMember(owner = "client!wb", name = "jb", descriptor = "I")
    private int field2808 = 3216;

    @OriginalMember(owner = "client!wb", name = "bb", descriptor = "I")
    private int field2800 = 4096;

    @OriginalMember(owner = "client!wb", name = "vb", descriptor = "[I")
    private int[] field2820 = new int[3];

    @OriginalMember(owner = "client!wb", name = "ab", descriptor = "Lsf;")
    private static class108 field2799 = class140.method973(255, "Loading textures )2 ");

    @OriginalMember(owner = "client!wb", name = "db", descriptor = "Lsf;")
    public static class108 field2802 = class140.method973(255, "_labels");

    @OriginalMember(owner = "client!wb", name = "eb", descriptor = "Lsf;")
    private static class108 field2803 = class140.method973(255, "Loading)3)3)3");

    @OriginalMember(owner = "client!wb", name = "cb", descriptor = "Lsf;")
    public static class108 field2801 = class140.method973(255, "p12_full");

    @OriginalMember(owner = "client!wb", name = "kb", descriptor = "I")
    public static int field2809 = 0;

    @OriginalMember(owner = "client!wb", name = "qb", descriptor = "Lsf;")
    public static class108 field2815 = field2803;

    @OriginalMember(owner = "client!wb", name = "mb", descriptor = "Lsf;")
    public static class108 field2811 = field2799;

    @OriginalMember(owner = "client!wb", name = "gb", descriptor = "I")
    public static int field2805 = 0;

    @OriginalMember(owner = "client!wb", name = "wb", descriptor = "I")
    public static int field2821 = 0;

    @OriginalMember(owner = "client!wb", name = "fb", descriptor = "I")
    public static int field2804;

    @OriginalMember(owner = "client!wb", name = "lb", descriptor = "I")
    public static int field2810;

    @OriginalMember(owner = "client!wb", name = "nb", descriptor = "I")
    public static int field2812;

    @OriginalMember(owner = "client!wb", name = "ob", descriptor = "I")
    public static int field2813;

    @OriginalMember(owner = "client!wb", name = "pb", descriptor = "I")
    public static int field2814;

    @OriginalMember(owner = "client!wb", name = "rb", descriptor = "I")
    public static int field2816;

    @OriginalMember(owner = "client!wb", name = "sb", descriptor = "I")
    public static int field2817;

    @OriginalMember(owner = "client!wb", name = "ub", descriptor = "I")
    public static int field2819;

    @OriginalMember(owner = "client!wb", name = "ib", descriptor = "Lvd;")
    public static class135 field2807;

    @OriginalMember(owner = "client!wb", name = "hb", descriptor = "[B")
    public static byte[] field2806;

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(BLrm;I)V", line = 5)
    public final void method114(byte arg0, class249 arg1, int arg2) {
        if (arg0 != -114) {
            return;
        }
        if (arg2 == 0) {
            this.field2800 = arg1.method1712(-1);
        } else if (arg2 == 1) {
            this.field2808 = arg1.method1712(-1);
        } else if (arg2 == 2) {
            this.field2818 = arg1.method1712(-1);
        }
        field2819++;
    }

    @OriginalMember(owner = "client!wb", name = "c", descriptor = "(B)V", line = 50)
    public static final void method1087(byte arg0) {
        field2816++;
        if (arg0 < 7) {
            field2815 = (class108) null;
        }
        for (class299 var1 = (class299) class273.field4794.method13(0); var1 != null; var1 = (class299) class273.field4794.method15((byte) 47)) {
            if (var1.field5210) {
                var1.method2110(127);
            }
        }
        for (class299 var2 = (class299) class277.field4856.method13(0); var2 != null; var2 = (class299) class277.field4856.method15((byte) 47)) {
            if (var2.field5210) {
                var2.method2110(9);
            }
        }
    }

    @OriginalMember(owner = "client!wb", name = "h", descriptor = "(I)V", line = 83)
    public static void method1088(int arg0) {
        field2801 = null;
        field2803 = null;
        field2799 = null;
        field2806 = null;
        field2807 = null;
        if (arg0 == 31913) {
            field2815 = null;
            field2811 = null;
            field2802 = null;
        }
    }

    @OriginalMember(owner = "client!wb", name = "d", descriptor = "(II)[I", line = 101)
    public final int[] method120(int arg0, int arg1) {
        if (arg0 > -95) {
            method1087((byte) 20);
        }
        field2817++;
        int[] var3 = this.field217.method1698(127, arg1);
        if (this.field217.field4295) {
            int var4 = class261.field4599 * this.field2800 >> 12;
            int[] var5 = this.method124(103, 0, arg1 - 1 & class219.field3899);
            int[] var6 = this.method124(88, 0, arg1);
            int[] var7 = this.method124(49, 0, class219.field3899 & arg1 + 1);
            for (int var8 = 0; var8 < class116.field2008; var8++) {
                int var9 = (var7[var8] - var5[var8]) * var4 >> 12;
                int var10 = var9 >> 4;
                if (var10 < 0) {
                    var10 = -var10;
                }
                if (var10 > 255) {
                    var10 = 255;
                }
                int var11 = (var6[var8 - 1 & class249.field4327] - var6[class249.field4327 & var8 + 1]) * var4 >> 12;
                int var12 = var11 >> 4;
                if (var12 < 0) {
                    var12 = -var12;
                }
                if (var12 > 255) {
                    var12 = 255;
                }
                int var13 = class103.field1796[((var10 + 1) * var10 >> 1) + var12] & 0xFF;
                int var14 = var13 * 4096 >> 8;
                int var15 = var9 * var13 >> 8;
                int var16 = this.field2820[2] * var14 >> 12;
                int var17 = var11 * var13 >> 8;
                int var18 = this.field2820[1] * var15 >> 12;
                int var19 = this.field2820[0] * var17 >> 12;
                var3[var8] = var18 + var19 + var16;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!wb", name = "i", descriptor = "(I)V", line = 181)
    private final void method1089(int arg0) {
        field2813++;
        double var2 = Math.cos((double) ((float) this.field2818 / 4096.0F));
        this.field2820[0] = (int) (Math.sin((double) ((float) this.field2808 / 4096.0F)) * 4096.0D * var2);
        this.field2820[1] = (int) (var2 * 4096.0D * Math.cos((double) ((float) this.field2808 / 4096.0F)));
        this.field2820[2] = (int) (Math.sin((double) ((float) this.field2818 / 4096.0F)) * 4096.0D);
        if (arg0 != 5519) {
            method1088(101);
        }
        int var4 = this.field2820[0] * this.field2820[0] >> 12;
        int var5 = this.field2820[1] * this.field2820[1] >> 12;
        int var6 = this.field2820[2] * this.field2820[2] >> 12;
        int var7 = (int) (Math.sqrt((double) (var4 + var5 + var6 >> 12)) * 4096.0D);
        if (var7 != 0) {
            this.field2820[0] = (this.field2820[0] << 12) / var7;
            this.field2820[2] = (this.field2820[2] << 12) / var7;
            this.field2820[1] = (this.field2820[1] << 12) / var7;
        }
    }

    @OriginalMember(owner = "client!wb", name = "<init>", descriptor = "()V", line = 214)
    public class156() {
        super(1, true);
    }

    @OriginalMember(owner = "client!wb", name = "c", descriptor = "(Z)Lwf;", line = 219)
    public static final class59 method1090(boolean arg0) {
        field2810++;
        if (arg0) {
            method1090(true);
        }
        class59 var1;
        if (class231.field4051) {
            var1 = new class188(class95.field1519, class197.field3560, class154.field2775[0], class88.field1383[0], class155.field2780[0], class273.field4795[0], class94.field1512[0], class321.field5494);
        } else {
            var1 = new class257(class95.field1519, class197.field3560, class154.field2775[0], class88.field1383[0], class155.field2780[0], class273.field4795[0], class94.field1512[0], class321.field5494);
        }
        class15.method100(1);
        return var1;
    }

    @OriginalMember(owner = "client!wb", name = "j", descriptor = "(I)V", line = 241)
    public static final void method1091(int arg0) {
        class256.field4471.method1427(83, arg0);
        field2804++;
        class199.field3588++;
        for (class158 var1 = (class158) class191.field3456.method1672(0); var1 != null; var1 = (class158) class191.field3456.method1678(-124)) {
            if (var1.field2848 == 0) {
                class285.method2042(22, var1, true);
            }
        }
        if (class175.field3197 != null) {
            class195.method1388(-82, class175.field3197);
            class175.field3197 = null;
        }
    }

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "(Z)V", line = 276)
    public final void method116(boolean arg0) {
        if (!arg0) {
            method1092((byte) -8, 18);
        }
        field2812++;
        this.method1089(5519);
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(BI)I", line = 303)
    public static final int method1092(byte arg0, int arg1) {
        if (arg0 < 110) {
            field2807 = (class135) null;
        }
        field2814++;
        double var2 = (double) (arg1 >> 16 & 0xFF) / 256.0D;
        double var4 = var2;
        double var6 = (double) (arg1 & 0xFF) / 256.0D;
        double var8 = var2;
        double var10 = 0.0D;
        double var12 = (double) ((arg1 & 0xFF55) >> 8) / 256.0D;
        if (var2 < var12) {
            var8 = var12;
        }
        if (var8 < var6) {
            var8 = var6;
        }
        if (var2 > var12) {
            var4 = var12;
        }
        double var14 = 0.0D;
        if (var6 < var4) {
            var4 = var6;
        }
        double var16 = (var4 + var8) / 2.0D;
        int var18 = (int) (var16 * 256.0D);
        if (var4 != var8) {
            if (var16 < 0.5D) {
                var14 = (var8 - var4) / (var4 + var8);
            }
            if (var2 == var8) {
                var10 = (var12 - var6) / (var8 - var4);
            } else if (var8 == var12) {
                var10 = (var6 - var2) / (var8 - var4) + 2.0D;
            } else if (var6 == var8) {
                var10 = (var2 - var12) / (var8 - var4) + 4.0D;
            }
            if (var16 >= 0.5D) {
                var14 = (var8 - var4) / (2.0D - var8 - var4);
            }
        }
        double var19 = var10 / 6.0D;
        if (var18 < 0) {
            var18 = 0;
        } else if (var18 > 255) {
            var18 = 255;
        }
        int var21 = (int) (var19 * 256.0D);
        int var22 = (int) (var14 * 256.0D);
        if (var22 < 0) {
            var22 = 0;
        } else if (var22 > 255) {
            var22 = 255;
        }
        if (var18 > 243) {
            var22 >>= 0x4;
        } else if (var18 > 217) {
            var22 >>= 0x3;
        } else if (var18 > 192) {
            var22 >>= 0x2;
        } else if (var18 > 179) {
            var22 >>= 0x1;
        }
        return (var18 >> 1) + (var21 >> 2 << 10) + (var22 >> 5 << 7);
    }
}
