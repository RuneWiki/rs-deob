import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ae")
public class class160 extends class196 {

    @OriginalMember(owner = "client!ae", name = "S", descriptor = "I")
    private int field2620 = 3216;

    @OriginalMember(owner = "client!ae", name = "ab", descriptor = "I")
    private int field2628 = 4096;

    @OriginalMember(owner = "client!ae", name = "U", descriptor = "[I")
    private int[] field2622 = new int[3];

    @OriginalMember(owner = "client!ae", name = "eb", descriptor = "I")
    private int field2632 = 3216;

    @OriginalMember(owner = "client!ae", name = "Q", descriptor = "Ldf;")
    public static class51 field2618 = class46.method233("(U0a )2 in: ", 100);

    @OriginalMember(owner = "client!ae", name = "W", descriptor = "Ldf;")
    public static class51 field2624 = class46.method233("welle2:", 100);

    @OriginalMember(owner = "client!ae", name = "T", descriptor = "Z")
    public static boolean field2621 = false;

    @OriginalMember(owner = "client!ae", name = "Y", descriptor = "[[[B")
    public static byte[][][] field2626 = new byte[4][104][104];

    @OriginalMember(owner = "client!ae", name = "R", descriptor = "I")
    public static int field2619;

    @OriginalMember(owner = "client!ae", name = "V", descriptor = "I")
    public static int field2623;

    @OriginalMember(owner = "client!ae", name = "X", descriptor = "I")
    public static int field2625;

    @OriginalMember(owner = "client!ae", name = "Z", descriptor = "I")
    public static int field2627;

    @OriginalMember(owner = "client!ae", name = "db", descriptor = "I")
    public static int field2631;

    @OriginalMember(owner = "client!ae", name = "fb", descriptor = "I")
    public static int field2633;

    @OriginalMember(owner = "client!ae", name = "bb", descriptor = "Lu;")
    public static class111 field2629;

    @OriginalMember(owner = "client!ae", name = "cb", descriptor = "Lja;")
    public static class55 field2630;

    @OriginalMember(owner = "client!ae", name = "c", descriptor = "(II)[I")
    public final int[] method45(int arg0, int arg1) {
        if (arg1 != 10565) {
            return null;
        } else {
            ++field2623;
            int[] var3 = super.field3274.method1476(true, arg0);
            if (super.field3274.field3741) {
                int var4 = class170.field2785 * this.field2628 >> 12;
                int[] var5 = this.method1390(arg0 - 1 & class214.field3717, 0, -110);
                int[] var6 = this.method1390(arg0, 0, arg1 ^ -10508);
                int[] var7 = this.method1390(arg0 + 1 & class214.field3717, 0, -87);
                for (int var8 = 0; class49.field767 > var8; ++var8) {
                    int var9 = (var6[var8 + -1 & class135.field2245] + -var6[class135.field2245 & var8 + 1]) * var4 >> 12;
                    int var10 = var9 >> 4;
                    int var11 = (var7[var8] - var5[var8]) * var4 >> 12;
                    int var12 = var11 >> 4;
                    if (var10 < 0) {
                        var10 = -var10;
                    }
                    if (var10 > 255) {
                        var10 = 255;
                    }
                    if (~var12 > -1) {
                        var12 = -var12;
                    }
                    if (var12 > 255) {
                        var12 = 255;
                    }
                    int var13 = 255 & class16.field239[((var12 + 1) * var12 >> 1) + var10];
                    int var14 = var13 * 4096 >> 8;
                    int var15 = this.field2622[2] * var14 >> 12;
                    int var16 = var9 * var13 >> 8;
                    int var17 = this.field2622[0] * var16 >> 12;
                    int var18 = var11 * var13 >> 8;
                    int var19 = this.field2622[1] * var18 >> 12;
                    var3[var8] = var15 + var19 + var17;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!ae", name = "e", descriptor = "(B)V")
    private final void method1135(byte arg0) {
        if (arg0 >= 67) {
            ++field2619;
            double var2 = Math.cos((double) ((float) this.field2620 / 4096.0F));
            this.field2622[0] = (int) (var2 * Math.sin((double) ((float) this.field2632 / 4096.0F)) * 4096.0D);
            this.field2622[1] = (int) (4096.0D * Math.cos((double) ((float) this.field2632 / 4096.0F)) * var2);
            this.field2622[2] = (int) (4096.0D * Math.sin((double) ((float) this.field2620 / 4096.0F)));
            int var4 = this.field2622[2] * this.field2622[2] >> 12;
            int var5 = this.field2622[1] * this.field2622[1] >> 12;
            int var6 = this.field2622[0] * this.field2622[0] >> 12;
            int var7 = (int) (4096.0D * Math.sqrt((double) (var6 - (-var5 - var4) >> 12)));
            if (var7 != 0) {
                this.field2622[0] = (this.field2622[0] << 12) / var7;
                this.field2622[2] = (this.field2622[2] << 12) / var7;
                this.field2622[1] = (this.field2622[1] << 12) / var7;
            }
        }
    }

    @OriginalMember(owner = "client!ae", name = "f", descriptor = "(I)V")
    public static final void method1136(int arg0) {
        class92.field1520 = arg0;
        for (int var1 = 0; var1 < class48.field758; ++var1) {
            for (int var2 = 0; var2 < class192.field3229; ++var2) {
                if (class27.field395[arg0][var1][var2] == null) {
                    class27.field395[arg0][var1][var2] = new class97(arg0, var1, var2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(ILlb;B)V")
    public final void method44(int arg0, class121 arg1, byte arg2) {
        if (arg0 != 0) {
            if (arg0 != 1) {
                if (~arg0 == -3) {
                    this.field2620 = arg1.method876(false);
                }
            } else {
                this.field2632 = arg1.method876(false);
            }
        } else {
            this.field2628 = arg1.method876(false);
        }
        ++field2627;
        if (arg2 != 82) {
            this.method1135((byte) 74);
        }
    }

    @OriginalMember(owner = "client!ae", name = "f", descriptor = "(B)V")
    public static final void method1137(byte arg0) {
        class262.field4574 = null;
        ++field2631;
        class87.field1457 = null;
        class111.field1877 = null;
        class222.field3873 = null;
        class93.field1546 = null;
        class172.field2817 = null;
        class45.field716 = null;
        class214.field3709 = null;
        class79.field1266 = null;
        class202.field3379 = null;
        class172.field2808 = null;
        class74.field1182 = 0;
        class114.field1920.method1708(2);
        class233.field4054 = null;
        class184.field3047 = null;
        class259.field4530 = null;
        class80.field1315 = null;
        class147.field2467 = null;
        class13.field199 = null;
        class70.field1126 = null;
        if (arg0 < 6) {
            field2618 = null;
        }
        class31.field457 = null;
        class49.field786 = null;
        class121.field2051 = null;
    }

    @OriginalMember(owner = "client!ae", name = "c", descriptor = "(B)V")
    public final void method73(byte arg0) {
        ++field2625;
        this.method1135((byte) 84);
        int var2 = 88 / ((43 - arg0) / 41);
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(ZZZ)I")
    public static final int method1138(boolean arg0, boolean arg1, boolean arg2) {
        ++field2633;
        if (!arg1) {
            method1138(true, true, false);
        }
        int var3 = 0;
        if (arg0) {
            var3 += class195.field3270 + class146.field2439;
        }
        if (arg2) {
            var3 += class182.field2999 + class131.field2194;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ae", name = "<init>", descriptor = "()V")
    public class160() {
        super(1, true);
    }

    @OriginalMember(owner = "client!ae", name = "g", descriptor = "(B)V")
    public static void method1139(byte arg0) {
        field2629 = null;
        field2624 = null;
        field2626 = null;
        if (arg0 <= 112) {
            field2618 = null;
        }
        field2630 = null;
        field2618 = null;
    }
}
