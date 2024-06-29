import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vk")
public class class170 extends class112 {

    @OriginalMember(owner = "client!vk", name = "S", descriptor = "I")
    private int field2665 = -1;

    @OriginalMember(owner = "client!vk", name = "R", descriptor = "[[Z")
    public static boolean[][] field2664 = new boolean[][] { new boolean[0], { true, false, true }, { true, false, false, true }, { false, false, true, true }, { true, true, false }, { false, true, true }, { true, false, false, true }, { false, false, false, true, true }, { false, true, true }, { true, false, true, true, true }, { false, true, true, true, true }, { false, true, true, true, true, false } };

    @OriginalMember(owner = "client!vk", name = "Z", descriptor = "Lwm;")
    public static class152 field2672 = class157.method1048("Lade)3)3)3", 94);

    @OriginalMember(owner = "client!vk", name = "bb", descriptor = "I")
    public static int field2674 = 0;

    @OriginalMember(owner = "client!vk", name = "V", descriptor = "Lwm;")
    private static class152 field2668 = class157.method1048("white:", 93);

    @OriginalMember(owner = "client!vk", name = "ab", descriptor = "Lwm;")
    public static class152 field2673 = field2668;

    @OriginalMember(owner = "client!vk", name = "Q", descriptor = "Lwm;")
    public static class152 field2663 = field2668;

    @OriginalMember(owner = "client!vk", name = "K", descriptor = "I")
    public static int field2659;

    @OriginalMember(owner = "client!vk", name = "M", descriptor = "I")
    public int field2661;

    @OriginalMember(owner = "client!vk", name = "O", descriptor = "I")
    public static int field2662;

    @OriginalMember(owner = "client!vk", name = "T", descriptor = "I")
    public static int field2666;

    @OriginalMember(owner = "client!vk", name = "U", descriptor = "I")
    public static int field2667;

    @OriginalMember(owner = "client!vk", name = "X", descriptor = "I")
    public int field2670;

    @OriginalMember(owner = "client!vk", name = "Y", descriptor = "I")
    public static int field2671;

    @OriginalMember(owner = "client!vk", name = "cb", descriptor = "I")
    public static int field2675;

    @OriginalMember(owner = "client!vk", name = "db", descriptor = "I")
    public static int field2676;

    @OriginalMember(owner = "client!vk", name = "L", descriptor = "Lef;")
    public static class322 field2660;

    @OriginalMember(owner = "client!vk", name = "W", descriptor = "[I")
    public int[] field2669;

    @OriginalMember(owner = "client!vk", name = "eb", descriptor = "[I")
    public static int[] field2677;

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(IZ)[[I", line = 5)
    public int[][] method55(int arg0, boolean arg1) {
        field2662++;
        if (arg1) {
            return (int[][]) ((int[][]) null);
        }
        int[][] var3 = this.field1594.method656((byte) -99, arg0);
        if (this.field1594.field1402 && this.method1117(-46)) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            int var7 = (class268.field4526 == this.field2661 ? arg0 : this.field2661 * arg0 / class268.field4526) * this.field2670;
            if (class58.field889 == this.field2670) {
                for (int var8 = 0; var8 < class58.field889; var8++) {
                    int var9 = this.field2669[var7++];
                    var6[var8] = class34.method251(255, var9) << 4;
                    var5[var8] = class34.method251(4080, var9 >> 4);
                    var4[var8] = class34.method251(var9, 16711680) >> 12;
                }
            } else {
                for (int var10 = 0; var10 < class58.field889; var10++) {
                    int var11 = this.field2670 * var10 / class58.field889;
                    int var12 = this.field2669[var7 + var11];
                    var6[var10] = class34.method251(255, var12) << 4;
                    var5[var10] = class34.method251(var12, 65280) >> 4;
                    var4[var10] = class34.method251(var12, 16711680) >> 12;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(IILhi;)V", line = 76)
    public final void method52(int arg0, int arg1, class291 arg2) {
        if (arg1 == 0) {
            this.field2665 = arg2.method2021((byte) 74);
        }
        if (arg0 != 31164) {
            field2668 = (class152) null;
        }
        field2659++;
    }

    @OriginalMember(owner = "client!vk", name = "h", descriptor = "(I)Z", line = 91)
    public final boolean method1117(int arg0) {
        field2671++;
        int var2 = -10 / ((82 - arg0) / 42);
        if (this.field2669 != null) {
            return true;
        } else if (this.field2665 < 0) {
            return false;
        } else {
            class109 var3 = class202.field3263 >= 0 ? class307.method2137(class252.field4347, (byte) -103, class202.field3263, this.field2665) : class311.method2160(this.field2665, class252.field4347, 0);
            var3.method736();
            this.field2670 = var3.field3281;
            this.field2661 = var3.field3284;
            this.field2669 = var3.field1552;
            return true;
        }
    }

    @OriginalMember(owner = "client!vk", name = "f", descriptor = "(I)V", line = 127)
    public final void method754(int arg0) {
        field2666++;
        super.method754(arg0);
        this.field2669 = null;
    }

    @OriginalMember(owner = "client!vk", name = "d", descriptor = "(I)I", line = 139)
    public final int method752(int arg0) {
        field2676++;
        if (arg0 >= -112) {
            field2668 = (class152) null;
        }
        return this.field2665;
    }

    @OriginalMember(owner = "client!vk", name = "<init>", descriptor = "()V", line = 246)
    public class170() {
        super(0, false);
    }

    @OriginalMember(owner = "client!vk", name = "c", descriptor = "(IBI)V", line = 166)
    public static final void method1118(int arg0, byte arg1, int arg2) {
        int var3 = arg2;
        field2667++;
        arg2--;
        int var4 = class160.field2552[arg2];
        if (var3 > 25) {
            var3 = 25;
        }
        int var5 = class258.field4430[arg2];
        if (arg0 == 0) {
            class323.field5641++;
            class245.field4102.method1065(212, 124);
            class245.field4102.method1980(false, var3 - (-var3 - 3));
        }
        if (arg0 == 1) {
            class245.field4102.method1065(167, 124);
            class245.field4102.method1980(false, var3 + var3 + 14 + 3);
            class232.field3805++;
        }
        if (arg0 == 2) {
            class304.field5235++;
            class245.field4102.method1065(152, -46);
            class245.field4102.method1980(false, var3 + var3 + 3);
        }
        class245.field4102.method1999(class216.field3515[82] ? 1 : 0, -450437624);
        class84.field1166 = class160.field2552[0];
        class278.field4762 = class258.field4430[0];
        for (int var6 = 1; var6 < var3; var6++) {
            arg2--;
            class245.field4102.method1965((byte) 126, class160.field2552[arg2] - var4);
            class245.field4102.method1965((byte) 126, class258.field4430[arg2] - var5);
        }
        if (arg1 < 120) {
            field2668 = (class152) null;
        }
        class245.field4102.method1963((byte) -78, class199.field3226 + var5);
        class245.field4102.method2018(class272.field4670 + var4, 128);
    }

    @OriginalMember(owner = "client!vk", name = "c", descriptor = "(B)V", line = 226)
    public static void method1119(byte arg0) {
        field2677 = null;
        field2663 = null;
        field2668 = null;
        field2660 = null;
        field2673 = null;
        int var1 = -107 / ((10 - arg0) / 49);
        field2672 = null;
        field2664 = (boolean[][]) null;
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(Lah;Lah;I)V", line = 251)
    public static final void method1120(class205 arg0, class205 arg1, int arg2) {
        class227.field3697 = arg0;
        class313.field5421 = arg1;
        field2675++;
        if (arg2 != 0) {
            method1119((byte) -26);
        }
    }
}
