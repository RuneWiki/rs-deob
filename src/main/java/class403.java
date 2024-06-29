import jaclib.memory.Stream;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jc")
public class class403 extends class352 {

    @OriginalMember(owner = "client!jc", name = "C", descriptor = "I")
    private int field5616 = 0;

    @OriginalMember(owner = "client!jc", name = "xb", descriptor = "Z")
    private boolean field5663 = true;

    @OriginalMember(owner = "client!jc", name = "Fb", descriptor = "I")
    private int field5671 = 0;

    @OriginalMember(owner = "client!jc", name = "Lb", descriptor = "Z")
    private boolean field5677 = false;

    @OriginalMember(owner = "client!jc", name = "jc", descriptor = "I")
    private int field5701 = 0;

    @OriginalMember(owner = "client!jc", name = "Bb", descriptor = "I")
    private int field5667 = 0;

    @OriginalMember(owner = "client!jc", name = "hc", descriptor = "I")
    private int field5699 = 0;

    @OriginalMember(owner = "client!jc", name = "wb", descriptor = "Len;")
    private class289 field5662;

    @OriginalMember(owner = "client!jc", name = "ub", descriptor = "Lkca;")
    private class74 field5660;

    @OriginalMember(owner = "client!jc", name = "A", descriptor = "Lkca;")
    private class74 field5614;

    @OriginalMember(owner = "client!jc", name = "q", descriptor = "Lkca;")
    private class74 field5604;

    @OriginalMember(owner = "client!jc", name = "dc", descriptor = "Lkca;")
    private class74 field5695;

    @OriginalMember(owner = "client!jc", name = "J", descriptor = "Lre;")
    private class551 field5623;

    @OriginalMember(owner = "client!jc", name = "Sb", descriptor = "I")
    private int field5684;

    @OriginalMember(owner = "client!jc", name = "ac", descriptor = "I")
    private int field5692;

    @OriginalMember(owner = "client!jc", name = "nb", descriptor = "[I")
    private int[] field5653;

    @OriginalMember(owner = "client!jc", name = "Db", descriptor = "[S")
    private short[] field5669;

    @OriginalMember(owner = "client!jc", name = "cc", descriptor = "[I")
    private int[] field5694;

    @OriginalMember(owner = "client!jc", name = "rb", descriptor = "[I")
    private int[] field5657;

    @OriginalMember(owner = "client!jc", name = "Ab", descriptor = "[I")
    private int[] field5666;

    @OriginalMember(owner = "client!jc", name = "qb", descriptor = "[Lbh;")
    private class34[] field5656;

    @OriginalMember(owner = "client!jc", name = "bc", descriptor = "[Lvp;")
    private class171[] field5693;

    @OriginalMember(owner = "client!jc", name = "z", descriptor = "I")
    private int field5613;

    @OriginalMember(owner = "client!jc", name = "kb", descriptor = "[Lsh;")
    private class62[] field5650;

    @OriginalMember(owner = "client!jc", name = "hb", descriptor = "[Lep;")
    private class384[] field5647;

    @OriginalMember(owner = "client!jc", name = "p", descriptor = "[F")
    private float[] field5603;

    @OriginalMember(owner = "client!jc", name = "ab", descriptor = "[B")
    private byte[] field5640;

    @OriginalMember(owner = "client!jc", name = "tb", descriptor = "[S")
    private short[] field5659;

    @OriginalMember(owner = "client!jc", name = "fb", descriptor = "[S")
    private short[] field5645;

    @OriginalMember(owner = "client!jc", name = "mc", descriptor = "[S")
    private short[] field5704;

    @OriginalMember(owner = "client!jc", name = "Ob", descriptor = "[S")
    private short[] field5680;

    @OriginalMember(owner = "client!jc", name = "S", descriptor = "[F")
    private float[] field5632;

    @OriginalMember(owner = "client!jc", name = "P", descriptor = "[S")
    private short[] field5629;

    @OriginalMember(owner = "client!jc", name = "zb", descriptor = "[S")
    private short[] field5665;

    @OriginalMember(owner = "client!jc", name = "Z", descriptor = "S")
    private short field5639;

    @OriginalMember(owner = "client!jc", name = "yb", descriptor = "[S")
    private short[] field5664;

    @OriginalMember(owner = "client!jc", name = "kc", descriptor = "S")
    private short field5702;

    @OriginalMember(owner = "client!jc", name = "W", descriptor = "[B")
    private byte[] field5636;

    @OriginalMember(owner = "client!jc", name = "M", descriptor = "[S")
    private short[] field5626;

    @OriginalMember(owner = "client!jc", name = "vb", descriptor = "[S")
    private short[] field5661;

    @OriginalMember(owner = "client!jc", name = "Kb", descriptor = "[S")
    private short[] field5676;

    @OriginalMember(owner = "client!jc", name = "gb", descriptor = "[I")
    private int[] field5646;

    @OriginalMember(owner = "client!jc", name = "D", descriptor = "[[I")
    private int[][] field5617;

    @OriginalMember(owner = "client!jc", name = "U", descriptor = "[[I")
    private int[][] field5634;

    @OriginalMember(owner = "client!jc", name = "Pb", descriptor = "[[I")
    private int[][] field5681;

    @OriginalMember(owner = "client!jc", name = "Jb", descriptor = "[I")
    public static int[] field5675 = new int[64];

    @OriginalMember(owner = "client!jc", name = "Cb", descriptor = "B")
    private byte field5668;

    @OriginalMember(owner = "client!jc", name = "l", descriptor = "I")
    public static int field5599;

    @OriginalMember(owner = "client!jc", name = "m", descriptor = "I")
    public static int field5600;

    @OriginalMember(owner = "client!jc", name = "n", descriptor = "I")
    public static int field5601;

    @OriginalMember(owner = "client!jc", name = "o", descriptor = "I")
    public static int field5602;

    @OriginalMember(owner = "client!jc", name = "r", descriptor = "I")
    public static int field5605;

    @OriginalMember(owner = "client!jc", name = "s", descriptor = "I")
    public static int field5606;

    @OriginalMember(owner = "client!jc", name = "t", descriptor = "I")
    public static int field5607;

    @OriginalMember(owner = "client!jc", name = "u", descriptor = "I")
    public static int field5608;

    @OriginalMember(owner = "client!jc", name = "v", descriptor = "I")
    public static int field5609;

    @OriginalMember(owner = "client!jc", name = "w", descriptor = "I")
    public static int field5610;

    @OriginalMember(owner = "client!jc", name = "x", descriptor = "I")
    public static int field5611;

    @OriginalMember(owner = "client!jc", name = "y", descriptor = "I")
    public static int field5612;

    @OriginalMember(owner = "client!jc", name = "B", descriptor = "I")
    public static int field5615;

    @OriginalMember(owner = "client!jc", name = "E", descriptor = "I")
    public static int field5618;

    @OriginalMember(owner = "client!jc", name = "F", descriptor = "I")
    public static int field5619;

    @OriginalMember(owner = "client!jc", name = "G", descriptor = "I")
    public static int field5620;

    @OriginalMember(owner = "client!jc", name = "H", descriptor = "I")
    public static int field5621;

    @OriginalMember(owner = "client!jc", name = "I", descriptor = "I")
    public static int field5622;

    @OriginalMember(owner = "client!jc", name = "K", descriptor = "I")
    public static int field5624;

    @OriginalMember(owner = "client!jc", name = "L", descriptor = "I")
    public static int field5625;

    @OriginalMember(owner = "client!jc", name = "Q", descriptor = "I")
    public static int field5630;

    @OriginalMember(owner = "client!jc", name = "R", descriptor = "I")
    public static int field5631;

    @OriginalMember(owner = "client!jc", name = "T", descriptor = "I")
    public static int field5633;

    @OriginalMember(owner = "client!jc", name = "V", descriptor = "I")
    public static int field5635;

    @OriginalMember(owner = "client!jc", name = "X", descriptor = "I")
    public static int field5637;

    @OriginalMember(owner = "client!jc", name = "Y", descriptor = "I")
    public static int field5638;

    @OriginalMember(owner = "client!jc", name = "cb", descriptor = "I")
    public static int field5642;

    @OriginalMember(owner = "client!jc", name = "db", descriptor = "I")
    public static int field5643;

    @OriginalMember(owner = "client!jc", name = "ib", descriptor = "I")
    public static int field5648;

    @OriginalMember(owner = "client!jc", name = "jb", descriptor = "I")
    public static int field5649;

    @OriginalMember(owner = "client!jc", name = "lb", descriptor = "I")
    public static int field5651;

    @OriginalMember(owner = "client!jc", name = "ob", descriptor = "I")
    public static int field5654;

    @OriginalMember(owner = "client!jc", name = "pb", descriptor = "I")
    public static int field5655;

    @OriginalMember(owner = "client!jc", name = "sb", descriptor = "I")
    public static int field5658;

    @OriginalMember(owner = "client!jc", name = "Eb", descriptor = "I")
    public static int field5670;

    @OriginalMember(owner = "client!jc", name = "Gb", descriptor = "I")
    public static int field5672;

    @OriginalMember(owner = "client!jc", name = "Hb", descriptor = "I")
    public static int field5673;

    @OriginalMember(owner = "client!jc", name = "Mb", descriptor = "I")
    public static int field5678;

    @OriginalMember(owner = "client!jc", name = "Nb", descriptor = "I")
    public static int field5679;

    @OriginalMember(owner = "client!jc", name = "Qb", descriptor = "I")
    public static int field5682;

    @OriginalMember(owner = "client!jc", name = "Rb", descriptor = "I")
    public static int field5683;

    @OriginalMember(owner = "client!jc", name = "Tb", descriptor = "I")
    public static int field5685;

    @OriginalMember(owner = "client!jc", name = "Ub", descriptor = "I")
    public static int field5686;

    @OriginalMember(owner = "client!jc", name = "Wb", descriptor = "I")
    public static int field5688;

    @OriginalMember(owner = "client!jc", name = "Xb", descriptor = "I")
    public static int field5689;

    @OriginalMember(owner = "client!jc", name = "Yb", descriptor = "I")
    public static int field5690;

    @OriginalMember(owner = "client!jc", name = "Zb", descriptor = "I")
    public static int field5691;

    @OriginalMember(owner = "client!jc", name = "ec", descriptor = "I")
    public static int field5696;

    @OriginalMember(owner = "client!jc", name = "gc", descriptor = "I")
    public static int field5698;

    @OriginalMember(owner = "client!jc", name = "ic", descriptor = "I")
    public static int field5700;

    @OriginalMember(owner = "client!jc", name = "nc", descriptor = "I")
    public static int field5705;

    @OriginalMember(owner = "client!jc", name = "oc", descriptor = "I")
    public static int field5706;

    @OriginalMember(owner = "client!jc", name = "qc", descriptor = "I")
    public static int field5708;

    @OriginalMember(owner = "client!jc", name = "rc", descriptor = "I")
    public static int field5709;

    @OriginalMember(owner = "client!jc", name = "Vb", descriptor = "Lcea;")
    private class195 field5687;

    @OriginalMember(owner = "client!jc", name = "lc", descriptor = "Lqa;")
    private class224 field5703;

    @OriginalMember(owner = "client!jc", name = "mb", descriptor = "Lpn;")
    private class682 field5652;

    @OriginalMember(owner = "client!jc", name = "N", descriptor = "S")
    private short field5627;

    @OriginalMember(owner = "client!jc", name = "O", descriptor = "S")
    private short field5628;

    @OriginalMember(owner = "client!jc", name = "bb", descriptor = "S")
    private short field5641;

    @OriginalMember(owner = "client!jc", name = "eb", descriptor = "S")
    private short field5644;

    @OriginalMember(owner = "client!jc", name = "Ib", descriptor = "S")
    private short field5674;

    @OriginalMember(owner = "client!jc", name = "fc", descriptor = "S")
    private short field5697;

    @OriginalMember(owner = "client!jc", name = "pc", descriptor = "S")
    private short field5707;

    @OriginalMember(owner = "client!jc", name = "c", descriptor = "()V", line = 3)
    public final void method228() {
        field5688++;
        if (this.field5616 <= 0 || this.field5671 <= 0) {
            return;
        }
        this.method2296(false, false);
        if ((this.field5668 & 0x10) == 0 && this.field5623.field7454 == null) {
            this.method2297(false, 6);
        }
        this.method2299(false);
    }

    @OriginalMember(owner = "client!jc", name = "v", descriptor = "(I)V", line = 19)
    public final void method223(int arg0) {
        field5606++;
        int var2 = class675.field9542[arg0];
        int var3 = class675.field9541[arg0];
        for (int var4 = 0; var4 < this.field5699; var4++) {
            int var5 = this.field5694[var4] * var2 + this.field5666[var4] * var3 >> 14;
            this.field5694[var4] = this.field5694[var4] * var3 - (this.field5666[var4] * var2) >> 14;
            this.field5666[var4] = var5;
        }
        this.field5677 = false;
        if (this.field5660 != null) {
            this.field5660.field1021 = null;
        }
    }

    @OriginalMember(owner = "client!jc", name = "F", descriptor = "()I", line = 49)
    public final int method234() {
        field5670++;
        return this.field5639;
    }

    @OriginalMember(owner = "client!jc", name = "va", descriptor = "(I)V", line = 58)
    public final void method208(int arg0) {
        field5619++;
        this.field5639 = (short) arg0;
        if (this.field5695 != null) {
            this.field5695.field1021 = null;
        }
        if (this.field5604 != null) {
            this.field5604.field1021 = null;
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(Lq;)V", line = 83)
    public final void method211(class391 arg0) {
        field5691++;
        class524 var2 = (class524) arg0;
        if (this.field5656 != null) {
            for (int var3 = 0; var3 < this.field5656.length; var3++) {
                class34 var4 = this.field5656[var3];
                class34 var5 = var4;
                if (var4.field413 != null) {
                    var5 = var4.field413;
                }
                var5.field396 = (int) ((float) this.field5657[var4.field395] * var2.field7151 + (float) this.field5694[var4.field395] * var2.field7127 + (float) this.field5666[var4.field395] * var2.field7134 + var2.field7128);
                var5.field412 = (int) ((float) this.field5657[var4.field395] * var2.field7133 + (float) this.field5694[var4.field395] * var2.field7145 + (float) this.field5666[var4.field395] * var2.field7138 + var2.field7153);
                var5.field410 = (int) ((float) this.field5657[var4.field395] * var2.field7155 + (float) this.field5694[var4.field395] * var2.field7152 + (float) this.field5666[var4.field395] * var2.field7126 + var2.field7141);
                var5.field397 = (int) ((float) this.field5657[var4.field403] * var2.field7151 + (float) this.field5694[var4.field403] * var2.field7127 + (float) this.field5666[var4.field403] * var2.field7134 + var2.field7128);
                var5.field405 = (int) ((float) this.field5657[var4.field403] * var2.field7133 + (float) this.field5694[var4.field403] * var2.field7145 + (float) this.field5666[var4.field403] * var2.field7138 + var2.field7153);
                var5.field406 = (int) ((float) this.field5657[var4.field403] * var2.field7155 + (float) this.field5694[var4.field403] * var2.field7152 + (float) this.field5666[var4.field403] * var2.field7126 + var2.field7141);
                var5.field398 = (int) ((float) this.field5657[var4.field401] * var2.field7151 + (float) this.field5694[var4.field401] * var2.field7127 + (float) this.field5666[var4.field401] * var2.field7134 + var2.field7128);
                var5.field400 = (int) ((float) this.field5657[var4.field401] * var2.field7133 + (float) this.field5694[var4.field401] * var2.field7145 + (float) this.field5666[var4.field401] * var2.field7138 + var2.field7153);
                var5.field407 = (int) ((float) this.field5657[var4.field401] * var2.field7155 + (float) this.field5694[var4.field401] * var2.field7152 + (float) this.field5666[var4.field401] * var2.field7126 + var2.field7141);
            }
        }
        if (this.field5693 == null) {
            return;
        }
        for (int var6 = 0; var6 < this.field5693.length; var6++) {
            class171 var7 = this.field5693[var6];
            class171 var8 = var7;
            if (var7.field2561 != null) {
                var8 = var7.field2561;
            }
            if (var7.field2559 == null) {
                var7.field2559 = var2.method1295();
            } else {
                var7.field2559.method1298(var2);
            }
            var8.field2565 = (int) ((float) this.field5657[var7.field2569] * var2.field7151 + (float) this.field5694[var7.field2569] * var2.field7127 + (float) this.field5666[var7.field2569] * var2.field7134 + var2.field7128);
            var8.field2562 = (int) ((float) this.field5657[var7.field2569] * var2.field7133 + (float) this.field5694[var7.field2569] * var2.field7145 + (float) this.field5666[var7.field2569] * var2.field7138 + var2.field7153);
            var8.field2564 = (int) ((float) this.field5657[var7.field2569] * var2.field7155 + (float) this.field5694[var7.field2569] * var2.field7152 + (float) this.field5666[var7.field2569] * var2.field7126 + var2.field7141);
        }
    }

    @OriginalMember(owner = "client!jc", name = "D", descriptor = "(I)V", line = 158)
    public final void method238(int arg0) {
        this.field5702 = (short) arg0;
        field5605++;
        if (this.field5695 != null) {
            this.field5695.field1021 = null;
        }
    }

    @OriginalMember(owner = "client!jc", name = "UA", descriptor = "(SS)V", line = 172)
    public final void method213(short arg0, short arg1) {
        field5600++;
        for (int var3 = 0; var3 < this.field5701; var3++) {
            if (this.field5626[var3] == arg0) {
                this.field5626[var3] = arg1;
            }
        }
        if (this.field5647 != null) {
            for (int var4 = 0; var4 < this.field5613; var4++) {
                class384 var5 = this.field5647[var4];
                class62 var6 = this.field5650[var4];
                var6.field824 = class35.field433[this.field5626[var5.field5376] & 0xFFFF] & 0xFFFFFF | var6.field824 & 0xFF000000;
            }
        }
        if (this.field5695 != null) {
            this.field5695.field1021 = null;
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(IILq;Z)Z", line = 215)
    public final boolean method237(int arg0, int arg1, class391 arg2, boolean arg3) {
        field5618++;
        class524 var5 = (class524) arg2;
        class524 var6 = this.field5662.field4303;
        float var7 = var5.field7141 * var6.field7151 + var5.field7153 * var6.field7127 + var5.field7128 * var6.field7134 + var6.field7128;
        float var8 = var5.field7141 * var6.field7133 + var5.field7153 * var6.field7145 + var5.field7128 * var6.field7138 + var6.field7153;
        class681.field9595 = var5.field7126 * var6.field7133 + var5.field7138 * var6.field7145 + var5.field7134 * var6.field7138;
        class623.field8694 = var5.field7152 * var6.field7151 + var5.field7145 * var6.field7127 + var5.field7127 * var6.field7134;
        class124.field1727 = var5.field7155 * var6.field7151 + var5.field7151 * var6.field7134 + var5.field7133 * var6.field7127;
        class144.field2138 = var5.field7155 * var6.field7133 + var5.field7151 * var6.field7138 + var5.field7133 * var6.field7145;
        class691.field9708 = var5.field7152 * var6.field7133 + var5.field7145 * var6.field7145 + var5.field7127 * var6.field7138;
        class604.field8395 = var5.field7126 * var6.field7151 + var5.field7138 * var6.field7127 + var5.field7134 * var6.field7134;
        class165.field2511 = var5.field7155 * var6.field7155 + var5.field7151 * var6.field7126 + var5.field7133 * var6.field7152;
        class437.field6170 = var5.field7152 * var6.field7155 + var5.field7145 * var6.field7152 + var5.field7127 * var6.field7126;
        class396.field5506 = var5.field7126 * var6.field7155 + var5.field7138 * var6.field7152 + var5.field7134 * var6.field7126;
        float var9 = var5.field7141 * var6.field7155 + var5.field7153 * var6.field7152 + var5.field7128 * var6.field7126 + var6.field7141;
        boolean var10 = false;
        float var11 = Float.MAX_VALUE;
        float var12 = -3.4028235E38F;
        float var13 = Float.MAX_VALUE;
        float var14 = -3.4028235E38F;
        int var15 = this.field5662.field4318;
        int var16 = this.field5662.field4330;
        if (!this.field5677) {
            this.method2301(1);
        }
        class293.field4402[0] = this.field5627;
        class170.field2554[0] = this.field5641;
        class190.field2807[0] = this.field5644;
        class293.field4402[1] = this.field5697;
        class170.field2554[1] = this.field5641;
        class190.field2807[1] = this.field5644;
        class293.field4402[2] = this.field5627;
        class170.field2554[2] = this.field5628;
        class190.field2807[2] = this.field5644;
        class293.field4402[3] = this.field5697;
        class170.field2554[3] = this.field5628;
        class293.field4402[4] = this.field5627;
        class190.field2807[3] = this.field5644;
        class170.field2554[4] = this.field5641;
        class190.field2807[4] = this.field5674;
        class293.field4402[5] = this.field5697;
        class170.field2554[5] = this.field5641;
        class293.field4402[6] = this.field5627;
        class190.field2807[5] = this.field5674;
        class170.field2554[6] = this.field5628;
        class190.field2807[6] = this.field5674;
        class293.field4402[7] = this.field5697;
        class170.field2554[7] = this.field5628;
        class190.field2807[7] = this.field5674;
        for (int var17 = 0; var17 < 8; var17++) {
            float var38 = (float) class190.field2807[var17];
            float var39 = (float) class170.field2554[var17];
            float var40 = (float) class293.field4402[var17];
            float var41 = class165.field2511 * var38 + class437.field6170 * var39 + class396.field5506 * var40 + var9;
            float var42 = class144.field2138 * var38 + class691.field9708 * var39 + class681.field9595 * var40 + var8;
            float var43 = class124.field1727 * var38 + class623.field8694 * var39 + class604.field8395 * var40 + var7;
            if (var41 >= (float) this.field5662.field4354) {
                float var44 = (float) var15 * var43 / var41 + (float) this.field5662.field4337;
                if (var44 < var11) {
                    var11 = var44;
                }
                float var45 = (float) var16 * var42 / var41 + (float) this.field5662.field4269;
                if (var44 > var12) {
                    var12 = var44;
                }
                if (var14 < var45) {
                    var14 = var45;
                }
                var10 = true;
                if (var45 < var13) {
                    var13 = var45;
                }
            }
        }
        if (var10 && (float) arg0 > var11 && (float) arg0 < var12 && var13 < (float) arg1 && (float) arg1 < var14) {
            if (arg3) {
                return true;
            }
            if (this.field5616 > this.field5662.field4368.length) {
                this.field5662.field4366 = new int[this.field5616];
                this.field5662.field4368 = new int[this.field5616];
            }
            int[] var18 = this.field5662.field4368;
            int[] var19 = this.field5662.field4366;
            for (int var20 = 0; var20 < this.field5699; var20++) {
                float var22 = (float) this.field5666[var20];
                float var23 = (float) this.field5657[var20];
                float var24 = (float) this.field5694[var20];
                float var25 = class144.field2138 * var23 + class691.field9708 * var24 + class681.field9595 * var22 + var8;
                float var26 = class124.field1727 * var23 + class623.field8694 * var24 + class604.field8395 * var22 + var7;
                float var27 = class165.field2511 * var23 + class437.field6170 * var24 + class396.field5506 * var22 + var9;
                if (var27 >= (float) this.field5662.field4354) {
                    int var28 = (int) ((float) var15 * var26 / var27 + (float) this.field5662.field4337);
                    int var29 = (int) ((float) var16 * var25 / var27 + (float) this.field5662.field4269);
                    int var30 = this.field5653[var20];
                    int var31 = this.field5653[var20 + 1];
                    for (int var32 = var30; var32 < var31; var32++) {
                        int var33 = this.field5665[var32] - 1;
                        if (var33 == -1) {
                            break;
                        }
                        var18[var33] = var28;
                        var19[var33] = var29;
                    }
                } else {
                    int var34 = this.field5653[var20];
                    int var35 = this.field5653[var20 + 1];
                    for (int var36 = var34; var36 < var35; var36++) {
                        int var37 = this.field5665[var36] - 1;
                        if (var37 == -1) {
                            break;
                        }
                        var18[this.field5665[var36] - 1] = -999999;
                    }
                }
            }
            for (int var21 = 0; var21 < this.field5701; var21++) {
                if (var18[this.field5664[var21]] != -999999 && var18[this.field5680[var21]] != -999999 && var18[this.field5676[var21]] != -999999 && this.method2305(var19[this.field5664[var21]], var18[this.field5664[var21]], var18[this.field5680[var21]], 102, var19[this.field5676[var21]], var18[this.field5676[var21]], arg0, var19[this.field5680[var21]], arg1)) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(ZZ)V", line = 427)
    private final void method2296(boolean arg0, boolean arg1) {
        field5624++;
        boolean var3 = this.field5695 != null && this.field5695.field1021 == null;
        boolean var4 = this.field5604 != null && this.field5604.field1021 == null;
        boolean var5 = this.field5660 != null && this.field5660.field1021 == null;
        boolean var6 = this.field5614 != null && this.field5614.field1021 == null;
        if (arg1) {
            var4 &= (this.field5668 & 0x4) != 0;
            var5 &= (this.field5668 & 0x1) != 0;
            var6 &= (this.field5668 & 0x8) != 0;
            var3 &= (this.field5668 & 0x2) != 0;
        }
        byte var7 = 0;
        if (arg0) {
            this.field5664 = null;
        }
        byte var8 = 0;
        byte var9 = 0;
        byte var10 = 0;
        if (var5) {
            var8 = var7;
            var7 = (byte) (var7 + 12);
        }
        byte var11 = 0;
        if (var3) {
            var9 = var7;
            var7 = (byte) (var7 + 4);
        }
        if (var4) {
            var10 = var7;
            var7 = (byte) (var7 + 12);
        }
        if (var6) {
            var11 = var7;
            var7 = (byte) (var7 + 8);
        }
        if (var7 == 0) {
            return;
        }
        if (this.field5662.field4289.field1316.length >= this.field5616 * var7) {
            this.field5662.field4289.field1301 = 0;
        } else {
            this.field5662.field4289 = new class57((this.field5616 + 100) * var7);
        }
        class57 var12 = this.field5662.field4289;
        if (var5) {
            if (this.field5662.field4362) {
                for (int var13 = 0; var13 < this.field5699; var13++) {
                    int var14 = Stream.floatToRawIntBits((float) this.field5666[var13]);
                    int var15 = Stream.floatToRawIntBits((float) this.field5694[var13]);
                    int var16 = Stream.floatToRawIntBits((float) this.field5657[var13]);
                    int var17 = this.field5653[var13];
                    int var18 = this.field5653[var13 + 1];
                    for (int var19 = var17; var19 < var18; var19++) {
                        int var20 = this.field5665[var19] - 1;
                        if (var20 == -1) {
                            break;
                        }
                        var12.field1301 = var7 * var20;
                        var12.method741(var14, (byte) 27);
                        var12.method741(var15, (byte) 27);
                        var12.method741(var16, (byte) 27);
                    }
                }
            } else {
                for (int var21 = 0; var21 < this.field5699; var21++) {
                    int var22 = Stream.floatToRawIntBits((float) this.field5666[var21]);
                    int var23 = Stream.floatToRawIntBits((float) this.field5694[var21]);
                    int var24 = Stream.floatToRawIntBits((float) this.field5657[var21]);
                    int var25 = this.field5653[var21];
                    int var26 = this.field5653[var21 + 1];
                    for (int var27 = var25; var27 < var26; var27++) {
                        int var28 = this.field5665[var27] - 1;
                        if (var28 == -1) {
                            break;
                        }
                        var12.field1301 = var7 * var28;
                        var12.method745(var22, -103);
                        var12.method745(var23, -95);
                        var12.method745(var24, -102);
                    }
                }
            }
        }
        if (var3) {
            if (this.field5604 == null) {
                short[] var31;
                short[] var32;
                byte[] var33;
                short[] var34;
                if (this.field5687 == null) {
                    var31 = this.field5704;
                    var32 = this.field5659;
                    var33 = this.field5640;
                    var34 = this.field5661;
                } else {
                    var31 = this.field5687.field2885;
                    var32 = this.field5687.field2882;
                    var34 = this.field5687.field2884;
                    var33 = this.field5687.field2886;
                }
                float var35 = this.field5662.field4360[0];
                float var36 = this.field5662.field4360[1];
                float var37 = this.field5662.field4360[2];
                float var38 = this.field5662.field4320;
                float var39 = this.field5662.field4310 * 768.0F / (float) this.field5639;
                float var40 = this.field5662.field4262 * 768.0F / (float) this.field5639;
                for (int var41 = 0; var41 < this.field5701; var41++) {
                    int var42 = this.method2300(this.field5626[var41], (byte) -109, this.field5702, this.field5636[var41], this.field5645[var41]);
                    short var43 = this.field5664[var41];
                    float var44 = (float) ((var42 & 0xFF1D) >> 8) * this.field5662.field4275;
                    float var45 = (float) ((var42 & 0xFF673F) >> 16) * this.field5662.field4265;
                    float var46 = (float) (var42 >>> 24) * this.field5662.field4323;
                    short var47 = (short) var33[var43];
                    float var48;
                    if (var47 == 0) {
                        var48 = ((float) var31[var43] * var37 + (float) var32[var43] * var36 + (float) var34[var43] * var35) * 0.0026041667F;
                    } else {
                        var48 = ((float) var31[var43] * var37 + (float) var32[var43] * var36 + (float) var34[var43] * var35) / (float) (var47 * 256);
                    }
                    float var49 = var48 * ((var48 < 0.0F) ? var40 : var39) + var38;
                    int var50 = (int) (var46 * var49);
                    if (var50 < 0) {
                        var50 = 0;
                    } else if (var50 > 255) {
                        var50 = 255;
                    }
                    int var51 = (int) (var45 * var49);
                    int var52 = (int) (var44 * var49);
                    if (var51 < 0) {
                        var51 = 0;
                    } else if (var51 > 255) {
                        var51 = 255;
                    }
                    var12.field1301 = var9 + (var7 * var43);
                    if (var52 < 0) {
                        var52 = 0;
                    } else if (var52 > 255) {
                        var52 = 255;
                    }
                    var12.method746((byte) -116, var50);
                    var12.method746((byte) -110, var51);
                    var12.method746((byte) -127, var52);
                    var12.method746((byte) -109, 255 - (this.field5636[var41] & 0xFF));
                    short var53 = this.field5680[var41];
                    short var54 = (short) var33[var53];
                    float var55;
                    if (var54 == 0) {
                        var55 = ((float) var31[var53] * var37 + (float) var32[var53] * var36 + (float) var34[var53] * var35) * 0.0026041667F;
                    } else {
                        var55 = ((float) var31[var53] * var37 + (float) var32[var53] * var36 + (float) var34[var53] * var35) / (float) (var54 * 256);
                    }
                    float var56 = var38 + var55 * ((var55 < 0.0F) ? var40 : var39);
                    int var57 = (int) (var46 * var56);
                    if (var57 < 0) {
                        var57 = 0;
                    } else if (var57 > 255) {
                        var57 = 255;
                    }
                    int var58 = (int) (var45 * var56);
                    if (var58 < 0) {
                        var58 = 0;
                    } else if (var58 > 255) {
                        var58 = 255;
                    }
                    int var59 = (int) (var44 * var56);
                    var12.field1301 = var9 + (var7 * var53);
                    if (var59 < 0) {
                        var59 = 0;
                    } else if (var59 > 255) {
                        var59 = 255;
                    }
                    var12.method746((byte) -128, var57);
                    var12.method746((byte) -116, var58);
                    var12.method746((byte) -104, var59);
                    var12.method746((byte) -86, 255 - (this.field5636[var41] & 0xFF));
                    short var60 = this.field5676[var41];
                    short var61 = (short) var33[var60];
                    float var62;
                    if (var61 == 0) {
                        var62 = ((float) var31[var60] * var37 + (float) var32[var60] * var36 + (float) var34[var60] * var35) * 0.0026041667F;
                    } else {
                        var62 = ((float) var31[var60] * var37 + (float) var32[var60] * var36 + (float) var34[var60] * var35) / (float) (var61 * 256);
                    }
                    float var63 = var38 + var62 * (var62 < 0.0F ? var40 : var39);
                    int var64 = (int) (var46 * var63);
                    int var65 = (int) (var45 * var63);
                    if (var64 < 0) {
                        var64 = 0;
                    } else if (var64 > 255) {
                        var64 = 255;
                    }
                    if (var65 < 0) {
                        var65 = 0;
                    } else if (var65 > 255) {
                        var65 = 255;
                    }
                    int var66 = (int) (var44 * var63);
                    var12.field1301 = var7 * var60 + var9;
                    if (var66 < 0) {
                        var66 = 0;
                    } else if (var66 > 255) {
                        var66 = 255;
                    }
                    var12.method746((byte) -111, var64);
                    var12.method746((byte) -93, var65);
                    var12.method746((byte) -98, var66);
                    var12.method746((byte) -93, 255 - (this.field5636[var41] & 0xFF));
                }
            } else {
                for (int var29 = 0; var29 < this.field5701; var29++) {
                    int var30 = this.method2300(this.field5626[var29], (byte) -120, this.field5702, this.field5636[var29], this.field5645[var29]);
                    var12.field1301 = this.field5664[var29] * var7 + var9;
                    var12.method741(var30, (byte) 27);
                    var12.field1301 = var9 + (this.field5680[var29] * var7);
                    var12.method741(var30, (byte) 27);
                    var12.field1301 = this.field5676[var29] * var7 + var9;
                    var12.method741(var30, (byte) 27);
                }
            }
        }
        if (var4) {
            short[] var67;
            short[] var68;
            byte[] var69;
            short[] var70;
            if (this.field5687 == null) {
                var69 = this.field5640;
                var67 = this.field5659;
                var70 = this.field5704;
                var68 = this.field5661;
            } else {
                var67 = this.field5687.field2882;
                var68 = this.field5687.field2884;
                var69 = this.field5687.field2886;
                var70 = this.field5687.field2885;
            }
            float var71 = 3.0F / (float) this.field5639;
            float var72 = 3.0F / (float) (this.field5639 + (this.field5639 / 2));
            var12.field1301 = var10;
            if (this.field5662.field4362) {
                for (int var73 = 0; var73 < this.field5616; var73++) {
                    int var74 = var69[var73] & 0xFF;
                    if (var74 == 0) {
                        var12.method503((byte) 30, (float) var68[var73] * var72);
                        var12.method503((byte) 30, (float) var67[var73] * var72);
                        var12.method503((byte) 30, (float) var70[var73] * var72);
                    } else {
                        float var75 = var71 / (float) var74;
                        var12.method503((byte) 30, (float) var68[var73] * var75);
                        var12.method503((byte) 30, (float) var67[var73] * var75);
                        var12.method503((byte) 30, (float) var70[var73] * var75);
                    }
                    var12.field1301 += var7 - 12;
                }
            } else {
                for (int var76 = 0; var76 < this.field5616; var76++) {
                    int var77 = var69[var76] & 0xFF;
                    if (var77 == 0) {
                        var12.method501((float) var68[var76] * var72, 126);
                        var12.method501((float) var67[var76] * var72, 126);
                        var12.method501((float) var70[var76] * var72, 127);
                    } else {
                        float var78 = var71 / (float) var77;
                        var12.method501((float) var68[var76] * var78, 124);
                        var12.method501((float) var67[var76] * var78, 126);
                        var12.method501((float) var70[var76] * var78, 124);
                    }
                    var12.field1301 += var7 - 12;
                }
            }
        }
        if (var6) {
            var12.field1301 = var11;
            if (this.field5662.field4362) {
                for (int var80 = 0; var80 < this.field5616; var80++) {
                    var12.method503((byte) 30, this.field5603[var80]);
                    var12.method503((byte) 30, this.field5632[var80]);
                    var12.field1301 += var7 - 8;
                }
            } else {
                for (int var79 = 0; var79 < this.field5616; var79++) {
                    var12.method501(this.field5603[var79], 118);
                    var12.method501(this.field5632[var79], 126);
                    var12.field1301 += var7 - 8;
                }
            }
        }
        var12.field1301 = this.field5616 * var7;
        class682 var81;
        if (arg1) {
            if (this.field5652 == null) {
                this.field5652 = this.field5662.method1786(var12.field1316, true, var7, (byte) -107, var12.field1301);
            } else {
                this.field5652.method2001(-82, var7, var12.field1316, var12.field1301);
            }
            this.field5668 = 0;
            var81 = this.field5652;
        } else {
            var81 = this.field5662.method1786(var12.field1316, false, var7, (byte) -101, var12.field1301);
            this.field5663 = true;
        }
        if (var5) {
            this.field5660.field1022 = var8;
            this.field5660.field1021 = var81;
        }
        if (var6) {
            this.field5614.field1022 = var11;
            this.field5614.field1021 = var81;
        }
        if (var3) {
            this.field5695.field1021 = var81;
            this.field5695.field1022 = var9;
        }
        if (var4) {
            this.field5604.field1022 = var10;
            this.field5604.field1021 = var81;
        }
    }

    @OriginalMember(owner = "client!jc", name = "Z", descriptor = "(Lw;)Lw;", line = 949)
    public final class271 method201(class271 arg0) {
        field5700++;
        if (this.field5616 == 0) {
            return null;
        }
        if (!this.field5677) {
            this.method2301(1);
        }
        int var2;
        int var3;
        if (this.field5662.field4357 <= 0) {
            var2 = this.field5627 - (this.field5662.field4357 * this.field5641 >> 8) >> this.field5662.field4219;
            var3 = this.field5697 - (this.field5662.field4357 * this.field5628 >> 8) >> this.field5662.field4219;
        } else {
            var2 = this.field5627 - (this.field5662.field4357 * this.field5628 >> 8) >> this.field5662.field4219;
            var3 = this.field5697 - (this.field5662.field4357 * this.field5641 >> 8) >> this.field5662.field4219;
        }
        int var4;
        int var5;
        if (this.field5662.field4248 <= 0) {
            var4 = this.field5644 - (this.field5662.field4248 * this.field5641 >> 8) >> this.field5662.field4219;
            var5 = this.field5674 - (this.field5662.field4248 * this.field5628 >> 8) >> this.field5662.field4219;
        } else {
            var4 = this.field5644 - (this.field5662.field4248 * this.field5628 >> 8) >> this.field5662.field4219;
            var5 = this.field5674 - (this.field5662.field4248 * this.field5641 >> 8) >> this.field5662.field4219;
        }
        int var6 = var3 + 1 - var2;
        int var7 = var5 + 1 - var4;
        class341 var8 = (class341) arg0;
        class341 var9;
        if (var8 != null && var8.method2042(var7, var6, 0)) {
            var9 = var8;
            var8.method2039((byte) 0);
        } else {
            var9 = new class341(this.field5662, var6, var7);
        }
        var9.method2043(var3, var5, (byte) -66, var2, var4);
        this.method2310((byte) 101, var9);
        return var9;
    }

    @OriginalMember(owner = "client!jc", name = "d", descriptor = "()[Lvp;", line = 1019)
    public final class171[] method206() {
        field5622++;
        return this.field5693;
    }

    @OriginalMember(owner = "client!jc", name = "M", descriptor = "()I", line = 1027)
    public final int method229() {
        if (!this.field5677) {
            this.method2301(1);
        }
        field5679++;
        return this.field5697;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(ZI)V", line = 1038)
    private final void method2297(boolean arg0, int arg1) {
        field5621++;
        if (this.field5671 * arg1 > this.field5662.field4289.field1316.length) {
            this.field5662.field4289 = new class57((this.field5671 + 100) * 6);
        } else {
            this.field5662.field4289.field1301 = 0;
        }
        class57 var3 = this.field5662.field4289;
        if (this.field5662.field4362) {
            for (int var5 = 0; var5 < this.field5671; var5++) {
                var3.method731(arg1 - 2045573054, this.field5664[var5]);
                var3.method731(-2045573048, this.field5680[var5]);
                var3.method731(-2045573048, this.field5676[var5]);
            }
        } else {
            for (int var4 = 0; var4 < this.field5671; var4++) {
                var3.method720(arg1 - 2, this.field5664[var4]);
                var3.method720(4, this.field5680[var4]);
                var3.method720(4, this.field5676[var4]);
            }
        }
        if (var3.field1301 == 0) {
            return;
        }
        if (arg0) {
            if (this.field5703 == null) {
                this.field5703 = this.field5662.method1743(var3.field1316, -103, var3.field1301, true, 5123);
            } else {
                this.field5703.method968(var3.field1301, var3.field1316, -1842, 5123);
            }
            this.field5623.field7454 = this.field5703;
        } else {
            this.field5623.field7454 = this.field5662.method1743(var3.field1316, -67, var3.field1301, false, 5123);
        }
        if (!arg0) {
            this.field5663 = true;
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(Z)V", line = 1100)
    private final void method2298(boolean arg0) {
        if (this.field5647 != null) {
            class524 var2 = this.field5662.field4217;
            float var3 = this.field5662.method1802();
            float var4 = this.field5662.method1818();
            this.field5662.method1770((byte) 25);
            this.field5662.method387(false);
            this.field5662.method1777(false, -106);
            this.field5662.method1744(this.field5662.field4315, (byte) -118, this.field5662.field4284, null, null);
            for (int var5 = 0; var5 < this.field5613; var5++) {
                class384 var6 = this.field5647[var5];
                class62 var7 = this.field5650[var5];
                if (!var6.field5382 || !this.field5662.method308()) {
                    float var8 = (float) (this.field5666[var6.field5372] + this.field5666[var6.field5378] + this.field5666[var6.field5374]) * 0.3333333F;
                    float var9 = (float) (this.field5694[var6.field5374] + this.field5694[var6.field5372] + this.field5694[var6.field5378]) * 0.3333333F;
                    float var10 = (float) (this.field5657[var6.field5374] + this.field5657[var6.field5372] + this.field5657[var6.field5378]) * 0.3333333F;
                    float var11 = class124.field1727 * var10 + class623.field8694 * var9 + class604.field8395 * var8 + class535.field7277;
                    float var12 = class144.field2138 * var10 + class691.field9708 * var9 + class681.field9595 * var8 + class230.field3285;
                    float var13 = class165.field2511 * var10 + class437.field6170 * var9 + class396.field5506 * var8 + class614.field8508;
                    var2.method2904((float) var7.field825 - var12, var7.field827, var6.field5375 * var7.field829 >> 7, 1, (float) var7.field828 + var11, -var13, var6.field5381 * var7.field822 >> 7);
                    this.field5662.method1773(var2, (byte) -109);
                    this.field5662.method462(var4, var3 - ((float) var6.field5380 * 1.5F));
                    int var14 = var7.field824;
                    OpenGL.glColor4ub((byte) (var14 >> 16), (byte) (var14 >> 8), (byte) var14, (byte) (var14 >> 24));
                    this.field5662.method1789((byte) -51, var6.field5377);
                    this.field5662.method1768(var6.field5373, -100);
                    this.field5662.method1759(0, 7, 0, 4);
                }
            }
            this.field5662.method462(var4, var3);
            this.field5662.method387(true);
            this.field5662.method1753((byte) 90);
        }
        field5615++;
        if (!arg0) {
            this.field5695 = null;
        }
    }

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "(Z)V", line = 1168)
    private final void method2299(boolean arg0) {
        field5685++;
        if (!this.field5663) {
            return;
        }
        this.field5663 = arg0;
        if (this.field5656 == null && this.field5693 == null && this.field5647 == null) {
            if (this.field5666 != null && !class150.method1056(this.field5692, this.field5684, arg0)) {
                if (this.field5660 != null && this.field5660.field1021 == null) {
                    this.field5663 = true;
                } else {
                    if (!this.field5677) {
                        this.method2301(1);
                    }
                    this.field5666 = null;
                }
            }
            if (this.field5694 != null && !class113.method845(this.field5684, -28460, this.field5692)) {
                if (this.field5660 != null && this.field5660.field1021 == null) {
                    this.field5663 = true;
                } else {
                    if (!this.field5677) {
                        this.method2301(1);
                    }
                    this.field5694 = null;
                }
            }
            if (this.field5657 != null && !class85.method652(this.field5684, this.field5692, 5545)) {
                if (this.field5660 != null && this.field5660.field1021 == null) {
                    this.field5663 = true;
                } else {
                    if (!this.field5677) {
                        this.method2301(1);
                    }
                    this.field5657 = null;
                }
            }
        }
        if (this.field5665 != null && this.field5666 == null && this.field5694 == null && this.field5657 == null) {
            this.field5665 = null;
            this.field5653 = null;
        }
        if (this.field5640 != null && !class634.method3523((byte) 114, this.field5692, this.field5684)) {
            if (this.field5604 == null) {
                if (this.field5695 != null && this.field5695.field1021 == null) {
                    this.field5663 = true;
                } else {
                    this.field5640 = null;
                    this.field5661 = this.field5659 = this.field5704 = null;
                }
            } else if (this.field5604.field1021 == null) {
                this.field5663 = true;
            } else {
                this.field5661 = this.field5659 = this.field5704 = null;
                this.field5640 = null;
            }
        }
        if (this.field5626 != null && !class688.method3788(this.field5684, -19244, this.field5692)) {
            if (this.field5695 != null && this.field5695.field1021 == null) {
                this.field5663 = true;
            } else {
                this.field5626 = null;
            }
        }
        if (this.field5636 != null && !class82.method643(this.field5692, this.field5684, 67)) {
            if (this.field5695 != null && this.field5695.field1021 == null) {
                this.field5663 = true;
            } else {
                this.field5636 = null;
            }
        }
        if (this.field5603 != null && !class410.method2343(this.field5692, this.field5684, (byte) -106)) {
            if (this.field5614 != null && this.field5614.field1021 == null) {
                this.field5663 = true;
            } else {
                this.field5603 = this.field5632 = null;
            }
        }
        if (this.field5645 != null && !class194.method1303((byte) -128, this.field5692, this.field5684)) {
            if (this.field5695 != null && this.field5695.field1021 == null) {
                this.field5663 = true;
            } else {
                this.field5645 = null;
            }
        }
        if (this.field5664 != null && !class27.method125((byte) -118, this.field5692, this.field5684)) {
            if ((this.field5623 == null || this.field5623.field7454 != null) && (this.field5695 == null || this.field5695.field1021 != null)) {
                this.field5664 = this.field5680 = this.field5676 = null;
            } else {
                this.field5663 = true;
            }
        }
        if (this.field5681 != null && !class487.method2741(121, this.field5692, this.field5684)) {
            this.field5629 = null;
            this.field5681 = null;
        }
        if (this.field5617 != null && !class316.method1934(this.field5692, this.field5684, false)) {
            this.field5669 = null;
            this.field5617 = null;
        }
        if (this.field5634 != null && !class539.method2969(this.field5692, this.field5684, 1024)) {
            this.field5634 = null;
        }
        if (this.field5646 != null && (this.field5684 & 0x800) == 0 && (this.field5684 & 0x40000) == 0) {
            this.field5646 = null;
        }
    }

    @OriginalMember(owner = "client!jc", name = "AA", descriptor = "(I)V", line = 1342)
    public final void method233(int arg0) {
        field5698++;
        int var2 = class675.field9542[arg0];
        int var3 = class675.field9541[arg0];
        for (int var4 = 0; var4 < this.field5699; var4++) {
            int var5 = this.field5694[var4] * var3 - (this.field5657[var4] * var2) >> 14;
            this.field5657[var4] = this.field5694[var4] * var2 + (this.field5657[var4] * var3) >> 14;
            this.field5694[var4] = var5;
        }
        if (this.field5660 != null) {
            this.field5660.field1021 = null;
        }
        this.field5677 = false;
    }

    @OriginalMember(owner = "client!jc", name = "E", descriptor = "(I[IIIIIZ)V", line = 1372)
    public final void method202(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        field5709++;
        int var8 = arg1.length;
        if (arg0 == 0) {
            int var9 = arg3 << 4;
            int var10 = arg4 << 4;
            int var11 = arg2 << 4;
            int var12 = 0;
            class630.field8795 = 0;
            class408.field5776 = 0;
            class128.field1767 = 0;
            for (int var13 = 0; var13 < var8; var13++) {
                int var14 = arg1[var13];
                if (this.field5617.length > var14) {
                    int[] var15 = this.field5617[var14];
                    for (int var16 = 0; var16 < var15.length; var16++) {
                        int var17 = var15[var16];
                        class128.field1767 += this.field5666[var17];
                        class630.field8795 += this.field5694[var17];
                        class408.field5776 += this.field5657[var17];
                        var12++;
                    }
                }
            }
            if (var12 <= 0) {
                class630.field8795 = var9;
                class128.field1767 = var11;
                class408.field5776 = var10;
            } else {
                class630.field8795 = class630.field8795 / var12 + var9;
                class408.field5776 = class408.field5776 / var12 + var10;
                class128.field1767 = class128.field1767 / var12 + var11;
            }
        } else if (arg0 == 1) {
            int var18 = arg3 << 4;
            int var19 = arg4 << 4;
            int var20 = arg2 << 4;
            for (int var21 = 0; var21 < var8; var21++) {
                int var22 = arg1[var21];
                if (this.field5617.length > var22) {
                    int[] var23 = this.field5617[var22];
                    for (int var24 = 0; var24 < var23.length; var24++) {
                        int var25 = var23[var24];
                        this.field5666[var25] += var20;
                        this.field5694[var25] += var18;
                        this.field5657[var25] += var19;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var26 = 0; var26 < var8; var26++) {
                int var45 = arg1[var26];
                if (var45 < this.field5617.length) {
                    int[] var46 = this.field5617[var45];
                    if ((arg5 & 0x1) == 0) {
                        for (int var58 = 0; var58 < var46.length; var58++) {
                            int var59 = var46[var58];
                            this.field5666[var59] -= class128.field1767;
                            this.field5694[var59] -= class630.field8795;
                            this.field5657[var59] -= class408.field5776;
                            if (arg4 != 0) {
                                int var60 = class675.field9542[arg4];
                                int var61 = class675.field9541[arg4];
                                int var62 = this.field5694[var59] * var60 + (this.field5666[var59] * var61) + 16383 >> 14;
                                this.field5694[var59] = this.field5694[var59] * var61 + 16383 - (this.field5666[var59] * var60) >> 14;
                                this.field5666[var59] = var62;
                            }
                            if (arg2 != 0) {
                                int var63 = class675.field9542[arg2];
                                int var64 = class675.field9541[arg2];
                                int var65 = this.field5694[var59] * var64 + 16383 - (this.field5657[var59] * var63) >> 14;
                                this.field5657[var59] = this.field5694[var59] * var63 + this.field5657[var59] * var64 + 16383 >> 14;
                                this.field5694[var59] = var65;
                            }
                            if (arg3 != 0) {
                                int var66 = class675.field9542[arg3];
                                int var67 = class675.field9541[arg3];
                                int var68 = this.field5666[var59] * var67 + this.field5657[var59] * var66 + 16383 >> 14;
                                this.field5657[var59] = this.field5657[var59] * var67 + 16383 - this.field5666[var59] * var66 >> 14;
                                this.field5666[var59] = var68;
                            }
                            this.field5666[var59] += class128.field1767;
                            this.field5694[var59] += class630.field8795;
                            this.field5657[var59] += class408.field5776;
                        }
                    } else {
                        for (int var47 = 0; var47 < var46.length; var47++) {
                            int var48 = var46[var47];
                            this.field5666[var48] -= class128.field1767;
                            this.field5694[var48] -= class630.field8795;
                            this.field5657[var48] -= class408.field5776;
                            if (arg2 != 0) {
                                int var49 = class675.field9542[arg2];
                                int var50 = class675.field9541[arg2];
                                int var51 = this.field5694[var48] * var50 - (this.field5657[var48] * var49 - 16383) >> 14;
                                this.field5657[var48] = this.field5657[var48] * var50 + (this.field5694[var48] * var49 + 16383) >> 14;
                                this.field5694[var48] = var51;
                            }
                            if (arg4 != 0) {
                                int var52 = class675.field9542[arg4];
                                int var53 = class675.field9541[arg4];
                                int var54 = this.field5694[var48] * var52 + this.field5666[var48] * var53 + 16383 >> 14;
                                this.field5694[var48] = this.field5694[var48] * var53 + 16383 - (this.field5666[var48] * var52) >> 14;
                                this.field5666[var48] = var54;
                            }
                            if (arg3 != 0) {
                                int var55 = class675.field9542[arg3];
                                int var56 = class675.field9541[arg3];
                                int var57 = this.field5666[var48] * var56 + (this.field5657[var48] * var55 + 16383) >> 14;
                                this.field5657[var48] = this.field5657[var48] * var56 + 16383 - this.field5666[var48] * var55 >> 14;
                                this.field5666[var48] = var57;
                            }
                            this.field5666[var48] += class128.field1767;
                            this.field5694[var48] += class630.field8795;
                            this.field5657[var48] += class408.field5776;
                        }
                    }
                }
            }
            if (arg6) {
                for (int var27 = 0; var27 < var8; var27++) {
                    int var28 = arg1[var27];
                    if (var28 < this.field5617.length) {
                        int[] var29 = this.field5617[var28];
                        for (int var30 = 0; var30 < var29.length; var30++) {
                            int var31 = var29[var30];
                            int var32 = this.field5653[var31];
                            int var33 = this.field5653[var31 + 1];
                            for (int var34 = var32; var34 < var33; var34++) {
                                int var35 = this.field5665[var34] - 1;
                                if (var35 == -1) {
                                    break;
                                }
                                if (arg4 != 0) {
                                    int var36 = class675.field9542[arg4];
                                    int var37 = class675.field9541[arg4];
                                    int var38 = this.field5661[var35] * var37 + this.field5659[var35] * var36 + 16383 >> 14;
                                    this.field5659[var35] = (short) (this.field5659[var35] * var37 + 16383 - (this.field5661[var35] * var36) >> 14);
                                    this.field5661[var35] = (short) var38;
                                }
                                if (arg2 != 0) {
                                    int var39 = class675.field9542[arg2];
                                    int var40 = class675.field9541[arg2];
                                    int var41 = this.field5659[var35] * var40 + 16383 - (this.field5704[var35] * var39) >> 14;
                                    this.field5704[var35] = (short) (this.field5704[var35] * var40 + this.field5659[var35] * var39 + 16383 >> 14);
                                    this.field5659[var35] = (short) var41;
                                }
                                if (arg3 != 0) {
                                    int var42 = class675.field9542[arg3];
                                    int var43 = class675.field9541[arg3];
                                    int var44 = this.field5704[var35] * var42 + (this.field5661[var35] * var43) + 16383 >> 14;
                                    this.field5704[var35] = (short) (this.field5704[var35] * var43 + 16383 - (this.field5661[var35] * var42) >> 14);
                                    this.field5661[var35] = (short) var44;
                                }
                            }
                        }
                    }
                }
                if (this.field5604 == null && this.field5695 != null) {
                    this.field5695.field1021 = null;
                }
                if (this.field5604 != null) {
                    this.field5604.field1021 = null;
                }
            }
        } else if (arg0 == 3) {
            for (int var69 = 0; var69 < var8; var69++) {
                int var70 = arg1[var69];
                if (this.field5617.length > var70) {
                    int[] var71 = this.field5617[var70];
                    for (int var72 = 0; var72 < var71.length; var72++) {
                        int var73 = var71[var72];
                        this.field5666[var73] -= class128.field1767;
                        this.field5694[var73] -= class630.field8795;
                        this.field5657[var73] -= class408.field5776;
                        this.field5666[var73] = this.field5666[var73] * arg2 >> 7;
                        this.field5694[var73] = this.field5694[var73] * arg3 >> 7;
                        this.field5657[var73] = this.field5657[var73] * arg4 >> 7;
                        this.field5666[var73] += class128.field1767;
                        this.field5694[var73] += class630.field8795;
                        this.field5657[var73] += class408.field5776;
                    }
                }
            }
        } else if (arg0 == 5) {
            if (this.field5681 != null) {
                for (int var74 = 0; var74 < var8; var74++) {
                    int var78 = arg1[var74];
                    if (this.field5681.length > var78) {
                        int[] var79 = this.field5681[var78];
                        for (int var80 = 0; var80 < var79.length; var80++) {
                            int var81 = var79[var80];
                            int var82 = (this.field5636[var81] & 0xFF) + arg2 * 8;
                            if (var82 < 0) {
                                var82 = 0;
                            } else if (var82 > 255) {
                                var82 = 255;
                            }
                            this.field5636[var81] = (byte) var82;
                        }
                        if (var79.length > 0 && this.field5695 != null) {
                            this.field5695.field1021 = null;
                        }
                    }
                }
                if (this.field5647 != null) {
                    for (int var75 = 0; var75 < this.field5613; var75++) {
                        class384 var76 = this.field5647[var75];
                        class62 var77 = this.field5650[var75];
                        var77.field824 = var77.field824 & 0xFFFFFF | 255 - (this.field5636[var76.field5376] & 0xFF) << 24;
                    }
                }
            }
        } else if (arg0 == 7) {
            if (this.field5681 != null) {
                for (int var83 = 0; var83 < var8; var83++) {
                    int var87 = arg1[var83];
                    if (this.field5681.length > var87) {
                        int[] var88 = this.field5681[var87];
                        for (int var89 = 0; var89 < var88.length; var89++) {
                            int var90 = var88[var89];
                            int var91 = this.field5626[var90] & 0xFFFF;
                            int var92 = (var91 & 0xFE20) >> 10;
                            int var93 = var91 >> 7 & 0x7;
                            int var94 = arg3 / 4 + var93;
                            int var95 = arg2 + var92 & 0x3F;
                            int var96 = var91 & 0x7F;
                            int var97 = arg4 + var96;
                            if (var94 < 0) {
                                var94 = 0;
                            } else if (var94 > 7) {
                                var94 = 7;
                            }
                            if (var97 < 0) {
                                var97 = 0;
                            } else if (var97 > 127) {
                                var97 = 127;
                            }
                            this.field5626[var90] = (short) class266.method1624(class266.method1624(var94 << 7, var95 << 10), var97);
                        }
                        if (var88.length > 0 && this.field5695 != null) {
                            this.field5695.field1021 = null;
                        }
                    }
                }
                if (this.field5647 != null) {
                    for (int var84 = 0; var84 < this.field5613; var84++) {
                        class384 var85 = this.field5647[var84];
                        class62 var86 = this.field5650[var84];
                        var86.field824 = class35.field433[this.field5626[var85.field5376] & 0xFFFF] & 0xFFFFFF | var86.field824 & 0xFF000000;
                    }
                }
            }
        } else if (arg0 == 8) {
            if (this.field5634 != null) {
                for (int var98 = 0; var98 < var8; var98++) {
                    int var99 = arg1[var98];
                    if (this.field5634.length > var99) {
                        int[] var100 = this.field5634[var99];
                        for (int var101 = 0; var101 < var100.length; var101++) {
                            class62 var102 = this.field5650[var100[var101]];
                            var102.field825 += arg3;
                            var102.field828 += arg2;
                        }
                    }
                }
            }
        } else if (arg0 == 10) {
            if (this.field5634 != null) {
                for (int var103 = 0; var103 < var8; var103++) {
                    int var104 = arg1[var103];
                    if (this.field5634.length > var104) {
                        int[] var105 = this.field5634[var104];
                        for (int var106 = 0; var106 < var105.length; var106++) {
                            class62 var107 = this.field5650[var105[var106]];
                            var107.field829 = var107.field829 * arg3 >> 7;
                            var107.field822 = var107.field822 * arg2 >> 7;
                        }
                    }
                }
            }
        } else if (arg0 == 9 && this.field5634 != null) {
            for (int var108 = 0; var108 < var8; var108++) {
                int var109 = arg1[var108];
                if (var109 < this.field5634.length) {
                    int[] var110 = this.field5634[var109];
                    for (int var111 = 0; var111 < var110.length; var111++) {
                        class62 var112 = this.field5650[var110[var111]];
                        var112.field827 = var112.field827 + arg2 & 0x3FFF;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(IBIBS)I", line = 2025)
    private final int method2300(int arg0, byte arg1, int arg2, byte arg3, short arg4) {
        field5651++;
        int var6 = class35.field433[class292.method1830(arg0, arg2, 126)];
        if (arg1 > -87) {
            this.field5671 = 90;
        }
        if (arg4 != -1) {
            class269 var7 = this.field5662.field9050.method588(-26679, arg4 & 0xFFFF);
            int var8 = var7.field3820 & 0xFF;
            if (var8 != 0) {
                int var9;
                if (arg2 < 0) {
                    var9 = 0;
                } else if (arg2 > 127) {
                    var9 = 16777215;
                } else {
                    var9 = arg2 * 131586;
                }
                if (var8 == 256) {
                    var6 = var9;
                } else {
                    int var11 = 256 - var8;
                    var6 = ((var9 & 0xFF00FF) * var8 + ((var6 & 0xFF00FF) * var11) & 0xFF00FF00) + ((var6 & 0xFF00) * var11 + (var9 & 0xFF00) * var8 & 0xFF0000) >> 8;
                }
            }
            int var12 = var7.field3810 & 0xFF;
            if (var12 != 0) {
                var12 += 256;
                int var13 = ((var6 & 0xFF0000) >> 16) * var12;
                if (var13 > 65535) {
                    var13 = 65535;
                }
                int var14 = (var6 >> 8 & 0xFF) * var12;
                if (var14 > 65535) {
                    var14 = 65535;
                }
                int var15 = (var6 & 0xFF) * var12;
                if (var15 > 65535) {
                    var15 = 65535;
                }
                var6 = (var15 >> 8) + (var13 << 8 & 0xFF0030) + (var14 & 0xFF00);
            }
        }
        return 255 - ((arg3 & 0xFF) - (var6 << 8));
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(Lq;Lrc;II)V", line = 2098)
    public final void method199(class391 arg0, class494 arg1, int arg2, int arg3) {
        field5607++;
        if (this.field5616 == 0) {
            return;
        }
        class524 var5 = this.field5662.field4303;
        class524 var6 = (class524) arg0;
        if (!this.field5677) {
            this.method2301(1);
        }
        class614.field8508 = var5.field7155 * var6.field7141 + var5.field7152 * var6.field7153 + var5.field7126 * var6.field7128 + var5.field7141;
        class437.field6170 = var5.field7155 * var6.field7152 + var5.field7152 * var6.field7145 + var5.field7126 * var6.field7127;
        float var7 = (float) this.field5641 * class437.field6170 + class614.field8508;
        float var8 = (float) this.field5628 * class437.field6170 + class614.field8508;
        float var9;
        float var10;
        if (var8 < var7) {
            var9 = (float) this.field5707 + var7;
            var10 = var8 - (float) this.field5707;
        } else {
            var9 = (float) this.field5707 + var8;
            var10 = (float) (-this.field5707) + var7;
        }
        if ((this.field5662.field4329 <= var10) || (var9 <= (float) this.field5662.field4354)) {
            return;
        }
        class535.field7277 = var5.field7151 * var6.field7141 + var5.field7134 * var6.field7128 + var5.field7127 * var6.field7153 + var5.field7128;
        class623.field8694 = var5.field7151 * var6.field7152 + var5.field7134 * var6.field7127 + var5.field7127 * var6.field7145;
        float var11 = (float) this.field5641 * class623.field8694 + class535.field7277;
        float var12 = (float) this.field5628 * class623.field8694 + class535.field7277;
        float var13;
        float var14;
        if ((var11 > var12)) {
            var13 = ((float) this.field5707 + var11) * (float) this.field5662.field4318;
            var14 = ((float) (-this.field5707) + var12) * (float) this.field5662.field4318;
        } else {
            var13 = ((float) this.field5707 + var12) * (float) this.field5662.field4318;
            var14 = (var11 - (float) this.field5707) * (float) this.field5662.field4318;
        }
        if ((this.field5662.field4272 <= var14 / (float) arg2) || (var13 / (float) arg2 <= this.field5662.field4352)) {
            return;
        }
        class230.field3285 = var5.field7133 * var6.field7141 + var5.field7145 * var6.field7153 + var5.field7138 * var6.field7128 + var5.field7153;
        class691.field9708 = var5.field7133 * var6.field7152 + var5.field7145 * var6.field7145 + var5.field7138 * var6.field7127;
        float var15 = (float) this.field5641 * class691.field9708 + class230.field3285;
        float var16 = (float) this.field5628 * class691.field9708 + class230.field3285;
        float var17;
        float var18;
        if (var15 > var16) {
            var17 = ((float) (-this.field5707) + var16) * (float) this.field5662.field4330;
            var18 = ((float) this.field5707 + var15) * (float) this.field5662.field4330;
        } else {
            var18 = ((float) this.field5707 + var16) * (float) this.field5662.field4330;
            var17 = (var15 - (float) this.field5707) * (float) this.field5662.field4330;
        }
        if ((this.field5662.field4274 <= var17 / (float) arg2) || (var18 / (float) arg2 <= this.field5662.field4322)) {
            return;
        }
        if (arg1 != null || this.field5647 != null) {
            class681.field9595 = var5.field7133 * var6.field7126 + var5.field7145 * var6.field7138 + var5.field7138 * var6.field7134;
            class165.field2511 = var5.field7155 * var6.field7155 + var5.field7152 * var6.field7133 + var5.field7126 * var6.field7151;
            class144.field2138 = var5.field7133 * var6.field7155 + var5.field7145 * var6.field7133 + var5.field7138 * var6.field7151;
            class396.field5506 = var5.field7155 * var6.field7126 + var5.field7152 * var6.field7138 + var5.field7126 * var6.field7134;
            class604.field8395 = var5.field7151 * var6.field7126 + var5.field7134 * var6.field7134 + var5.field7127 * var6.field7138;
            class124.field1727 = var5.field7151 * var6.field7155 + var5.field7134 * var6.field7151 + var5.field7127 * var6.field7133;
        }
        if (arg1 != null) {
            int var19 = this.field5697 + this.field5627 >> 1;
            int var20 = this.field5674 + this.field5644 >> 1;
            int var21 = (int) ((float) var20 * class124.field1727 + (float) this.field5641 * class623.field8694 + (float) var19 * class604.field8395 + class535.field7277);
            int var22 = (int) ((float) var20 * class144.field2138 + (float) this.field5641 * class691.field9708 + (float) var19 * class681.field9595 + class230.field3285);
            int var23 = (int) ((float) var20 * class165.field2511 + (float) this.field5641 * class437.field6170 + (float) var19 * class396.field5506 + class614.field8508);
            int var24 = (int) ((float) var20 * class124.field1727 + (float) this.field5628 * class623.field8694 + (float) var19 * class604.field8395 + class535.field7277);
            int var25 = (int) ((float) var20 * class144.field2138 + (float) this.field5628 * class691.field9708 + (float) var19 * class681.field9595 + class230.field3285);
            arg1.field6811 = this.field5662.field4318 * var24 / arg2 + this.field5662.field4337;
            arg1.field6812 = this.field5662.field4330 * var25 / arg2 + this.field5662.field4269;
            arg1.field6810 = this.field5662.field4318 * var21 / arg2 + this.field5662.field4337;
            int var26 = (int) ((float) var20 * class165.field2511 + (float) this.field5628 * class437.field6170 + (float) var19 * class396.field5506 + class614.field8508);
            arg1.field6809 = this.field5662.field4269 + (this.field5662.field4330 * var22 / arg2);
            if (this.field5662.field4354 > var23 && this.field5662.field4354 > var26) {
                arg1.field6807 = (var21 + this.field5707) * this.field5662.field4318 / arg2 + this.field5662.field4337 - arg1.field6810;
                arg1.field6808 = true;
            }
        }
        this.field5662.method1790((byte) -3, (float) arg2);
        this.field5662.method1763(8960);
        this.field5662.method1787(var6, false);
        this.method2309(92);
        this.field5662.method1753((byte) 90);
        this.method2298(true);
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(I)V", line = 2250)
    private final void method2301(int arg0) {
        field5648++;
        int var2 = 32767;
        if (arg0 != 1) {
            this.field5703 = null;
        }
        int var3 = 32767;
        int var4 = 32767;
        int var5 = -32768;
        int var6 = -32768;
        int var7 = -32768;
        int var8 = 0;
        int var9 = 0;
        for (int var10 = 0; var10 < this.field5699; var10++) {
            int var11 = this.field5666[var10];
            int var12 = this.field5694[var10];
            if (var3 > var12) {
                var3 = var12;
            }
            if (var11 > var5) {
                var5 = var11;
            }
            if (var12 > var6) {
                var6 = var12;
            }
            if (var11 < var2) {
                var2 = var11;
            }
            int var13 = this.field5657[var10];
            if (var13 < var4) {
                var4 = var13;
            }
            if (var13 > var7) {
                var7 = var13;
            }
            int var14 = var11 * var11 + (var13 * var13);
            if (var14 > var8) {
                var8 = var14;
            }
            int var15 = var13 * var13 + var11 * var11 + var12 * var12;
            if (var9 < var15) {
                var9 = var15;
            }
        }
        this.field5697 = (short) var5;
        this.field5628 = (short) var6;
        this.field5674 = (short) var7;
        this.field5641 = (short) var3;
        this.field5627 = (short) var2;
        this.field5644 = (short) var4;
        this.field5707 = (short) ((int) (Math.sqrt((double) var8) + 0.99D));
        Math.sqrt((double) var9);
        this.field5677 = true;
    }

    @OriginalMember(owner = "client!jc", name = "EA", descriptor = "()I", line = 2336)
    public final int method239() {
        if (!this.field5677) {
            this.method2301(1);
        }
        field5708++;
        return this.field5628;
    }

    @OriginalMember(owner = "client!jc", name = "Y", descriptor = "()V", line = 2347)
    public final void method232() {
        field5610++;
        for (int var1 = 0; var1 < this.field5667; var1++) {
            this.field5666[var1] = this.field5666[var1] + 7 >> 4;
            this.field5694[var1] = this.field5694[var1] + 7 >> 4;
            this.field5657[var1] = this.field5657[var1] + 7 >> 4;
        }
        this.field5677 = false;
        if (this.field5660 != null) {
            this.field5660.field1021 = null;
        }
    }

    @OriginalMember(owner = "client!jc", name = "<init>", descriptor = "(Len;)V", line = 5602)
    public class403(class289 arg0) {
        this.field5662 = arg0;
        this.field5660 = new class74(null, 5126, 3, 0);
        this.field5614 = new class74(null, 5126, 2, 0);
        this.field5604 = new class74(null, 5126, 3, 0);
        this.field5695 = new class74(null, 5121, 4, 0);
        this.field5623 = new class551();
    }

    @OriginalMember(owner = "client!jc", name = "<init>", descriptor = "(Len;Lhn;IIII)V", line = 5702)
    public class403(class289 arg0, class661 arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field5662 = arg0;
        this.field5684 = arg2;
        this.field5692 = arg5;
        if (class265.method1616(arg2, 127, arg5)) {
            this.field5660 = new class74(null, 5126, 3, 0);
        }
        if (class85.method655(arg5, 28238, arg2)) {
            this.field5614 = new class74(null, 5126, 2, 0);
        }
        if (class602.method3339(arg5, 55, arg2)) {
            this.field5604 = new class74(null, 5126, 3, 0);
        }
        if (class67.method545(true, arg5, arg2)) {
            this.field5695 = new class74(null, 5121, 4, 0);
        }
        if (class395.method2251((byte) -63, arg2, arg5)) {
            this.field5623 = new class551();
        }
        class489 var7 = arg0.field9050;
        int[] var8 = new int[arg1.field9285];
        this.field5653 = new int[arg1.field9318 + 1];
        for (int var9 = 0; var9 < arg1.field9285; var9++) {
            if ((arg1.field9294 == null || arg1.field9294[var9] != 2) && (arg1.field9316 == null || arg1.field9316[var9] == -1 || !var7.method588(-26679, arg1.field9316[var9] & 0xFFFF).field3825)) {
                var8[this.field5701++] = var9;
                this.field5653[arg1.field9286[var9]]++;
                this.field5653[arg1.field9297[var9]]++;
                this.field5653[arg1.field9333[var9]]++;
            }
        }
        this.field5671 = this.field5701;
        long[] var10 = new long[this.field5701];
        boolean var11 = (this.field5684 & 0x100) != 0;
        label499: for (int var12 = 0; var12 < this.field5701; var12++) {
            int var180 = var8[var12];
            class269 var181 = null;
            int var182 = 0;
            byte var183 = 0;
            byte var184 = 0;
            byte var185 = 0;
            if (arg1.field9328 != null) {
                for (int var186 = 0; var186 < arg1.field9328.length; var186++) {
                    class643 var187 = arg1.field9328[var186];
                    if (var187.field9141 == var180) {
                        class97 var188 = class538.method2965(var187.field9140, 3);
                        if (var188.field1328) {
                            var10[var12] = Long.MAX_VALUE;
                            this.field5671--;
                            continue label499;
                        }
                    }
                }
            }
            short var189 = -1;
            if (arg1.field9316 != null) {
                var189 = arg1.field9316[var180];
                if (var189 != -1) {
                    var181 = var7.method588(-26679, var189 & 0xFFFF);
                    var185 = var181.field3814;
                    var184 = var181.field3803;
                }
            }
            boolean var190 = arg1.field9317 != null && arg1.field9317[var180] != 0 || var181 != null && !var181.field3805 | var181.field3813;
            if ((var11 || var190) && arg1.field9322 != null) {
                var182 += arg1.field9322[var180] << 17;
            }
            if (var190) {
                var182 += 65536;
            }
            int var191 = ((var184 & 0xFF) << 8) + var182;
            int var192 = (var185 & 0xFF) + var191;
            int var193 = ((var189 & 0xFFFF) << 16) + var183;
            int var194 = (var12 & 0xFFFF) + var193;
            var10[var12] = ((long) var192 << 32) + (long) var194;
        }
        class549.method3021(var8, 78, var10);
        this.field5699 = arg1.field9318;
        this.field5667 = arg1.field9291;
        this.field5669 = arg1.field9287;
        this.field5694 = arg1.field9299;
        this.field5657 = arg1.field9329;
        this.field5666 = arg1.field9280;
        class138[] var13 = new class138[this.field5699];
        this.field5656 = arg1.field9301;
        this.field5693 = arg1.field9292;
        if (arg1.field9328 != null) {
            this.field5613 = arg1.field9328.length;
            this.field5650 = new class62[this.field5613];
            this.field5647 = new class384[this.field5613];
            for (int var14 = 0; var14 < this.field5613; var14++) {
                class643 var15 = arg1.field9328[var14];
                class97 var16 = class538.method2965(var15.field9140, 3);
                int var17 = -1;
                for (int var18 = 0; var18 < this.field5701; var18++) {
                    if (var8[var18] == var15.field9141) {
                        var17 = var18;
                        break;
                    }
                }
                if (var17 == -1) {
                    throw new RuntimeException();
                }
                int var19 = class35.field433[arg1.field9281[var15.field9141] & 0xFFFF] & 0xFFFFFF;
                int var20 = var19 | 255 - (arg1.field9317 == null ? 0 : arg1.field9317[var15.field9141]) << 24;
                this.field5647[var14] = new class384(var17, arg1.field9286[var15.field9141], arg1.field9297[var15.field9141], arg1.field9333[var15.field9141], var16.field1330, var16.field1320, var16.field1331, var16.field1324, var16.field1323, var16.field1328, var16.field1329, var15.field9142);
                this.field5650[var14] = new class62(var20);
            }
        }
        int var21 = this.field5701 * 3;
        this.field5603 = new float[var21];
        this.field5640 = new byte[var21];
        this.field5659 = new short[var21];
        this.field5645 = new short[this.field5701];
        this.field5704 = new short[var21];
        this.field5680 = new short[this.field5701];
        this.field5632 = new float[var21];
        if (arg1.field9331 != null) {
            this.field5629 = new short[this.field5701];
        }
        this.field5665 = new short[var21];
        this.field5639 = (short) arg4;
        this.field5664 = new short[this.field5701];
        this.field5702 = (short) arg3;
        this.field5636 = new byte[this.field5701];
        this.field5626 = new short[this.field5701];
        class421.field5953 = new long[var21];
        this.field5661 = new short[var21];
        this.field5676 = new short[this.field5701];
        int var22 = 0;
        for (int var23 = 0; var23 < arg1.field9318; var23++) {
            int var179 = this.field5653[var23];
            this.field5653[var23] = var22;
            var22 += var179;
            var13[var23] = new class138();
        }
        this.field5653[arg1.field9318] = var22;
        int[] var24 = null;
        int[] var25 = null;
        int[] var26 = null;
        float[][] var27 = null;
        if (arg1.field9312 != null) {
            int var28 = arg1.field9302;
            int[] var29 = new int[var28];
            int[] var30 = new int[var28];
            int[] var31 = new int[var28];
            int[] var32 = new int[var28];
            int[] var33 = new int[var28];
            int[] var34 = new int[var28];
            for (int var35 = 0; var35 < var28; var35++) {
                var29[var35] = Integer.MAX_VALUE;
                var30[var35] = -2147483647;
                var31[var35] = Integer.MAX_VALUE;
                var32[var35] = -2147483647;
                var33[var35] = Integer.MAX_VALUE;
                var34[var35] = -2147483647;
            }
            for (int var36 = 0; var36 < this.field5701; var36++) {
                int var43 = var8[var36];
                if (arg1.field9312[var43] != -1) {
                    int var44 = arg1.field9312[var43] & 0xFF;
                    for (int var45 = 0; var45 < 3; var45++) {
                        short var46;
                        if (var45 == 0) {
                            var46 = arg1.field9286[var43];
                        } else if (var45 == 1) {
                            var46 = arg1.field9297[var43];
                        } else {
                            var46 = arg1.field9333[var43];
                        }
                        int var47 = arg1.field9280[var46];
                        int var48 = arg1.field9299[var46];
                        int var49 = arg1.field9329[var46];
                        if (var29[var44] > var47) {
                            var29[var44] = var47;
                        }
                        if (var47 > var30[var44]) {
                            var30[var44] = var47;
                        }
                        if (var48 < var31[var44]) {
                            var31[var44] = var48;
                        }
                        if (var32[var44] < var48) {
                            var32[var44] = var48;
                        }
                        if (var49 < var33[var44]) {
                            var33[var44] = var49;
                        }
                        if (var34[var44] < var49) {
                            var34[var44] = var49;
                        }
                    }
                }
            }
            var24 = new int[var28];
            var27 = new float[var28][];
            var26 = new int[var28];
            var25 = new int[var28];
            for (int var37 = 0; var37 < var28; var37++) {
                byte var38 = arg1.field9283[var37];
                if (var38 > 0) {
                    var24[var37] = (var29[var37] + var30[var37]) / 2;
                    var25[var37] = (var31[var37] + var32[var37]) / 2;
                    var26[var37] = (var33[var37] + var34[var37]) / 2;
                    float var39;
                    float var40;
                    float var41;
                    if (var38 == 1) {
                        int var42 = arg1.field9307[var37];
                        if (var42 == 0) {
                            var41 = 1.0F;
                            var39 = 1.0F;
                        } else if (var42 > 0) {
                            var39 = 1.0F;
                            var41 = (float) var42 / 1024.0F;
                        } else {
                            var39 = (float) (-var42) / 1024.0F;
                            var41 = 1.0F;
                        }
                        var40 = 64.0F / (float) arg1.field9282[var37];
                    } else if (var38 == 2) {
                        var39 = 64.0F / (float) arg1.field9307[var37];
                        var40 = 64.0F / (float) arg1.field9282[var37];
                        var41 = 64.0F / (float) arg1.field9314[var37];
                    } else {
                        var40 = (float) arg1.field9282[var37] / 1024.0F;
                        var39 = (float) arg1.field9307[var37] / 1024.0F;
                        var41 = (float) arg1.field9314[var37] / 1024.0F;
                    }
                    var27[var37] = class531.method2941(var39, class249.method1537(arg1.field9327[var37], 255), var41, -81, var40, arg1.field9293[var37], arg1.field9305[var37], arg1.field9308[var37]);
                }
            }
        }
        class274[] var50 = new class274[arg1.field9285];
        for (int var51 = 0; var51 < arg1.field9285; var51++) {
            short var158 = arg1.field9286[var51];
            short var159 = arg1.field9297[var51];
            short var160 = arg1.field9333[var51];
            int var161 = this.field5666[var159] - this.field5666[var158];
            int var162 = this.field5694[var159] - this.field5694[var158];
            int var163 = this.field5657[var159] - this.field5657[var158];
            int var164 = this.field5666[var160] - this.field5666[var158];
            int var165 = this.field5694[var160] - this.field5694[var158];
            int var166 = this.field5657[var160] - this.field5657[var158];
            int var167 = var162 * var166 - (var163 * var165);
            int var168 = var163 * var164 - (var161 * var166);
            int var169;
            for (var169 = var161 * var165 - var162 * var164; var167 > 8192 || var168 > 8192 || var169 > 8192 || var167 < -8192 || var168 < -8192 || var169 < -8192; var169 >>= 0x1) {
                var167 >>= 0x1;
                var168 >>= 0x1;
            }
            int var170 = (int) Math.sqrt((double) (var169 * var169 + var167 * var167 + var168 * var168));
            if (var170 <= 0) {
                var170 = 1;
            }
            int var171 = var168 * 256 / var170;
            int var172 = var169 * 256 / var170;
            int var173 = var167 * 256 / var170;
            byte var174 = arg1.field9294 == null ? 0 : arg1.field9294[var51];
            if (var174 == 0) {
                class138 var175 = var13[var158];
                var175.field1936 += var173;
                var175.field1940 += var172;
                var175.field1937++;
                var175.field1934 += var171;
                class138 var176 = var13[var159];
                var176.field1934 += var171;
                var176.field1937++;
                var176.field1940 += var172;
                var176.field1936 += var173;
                class138 var177 = var13[var160];
                var177.field1936 += var173;
                var177.field1937++;
                var177.field1934 += var171;
                var177.field1940 += var172;
            } else if (var174 == 1) {
                class274 var178 = var50[var51] = new class274();
                var178.field3867 = var173;
                var178.field3861 = var172;
                var178.field3864 = var171;
            }
        }
        for (int var52 = 0; var52 < this.field5701; var52++) {
            int var68 = var8[var52];
            int var69 = arg1.field9281[var68] & 0xFFFF;
            short var70;
            if (arg1.field9316 == null) {
                var70 = -1;
            } else {
                var70 = arg1.field9316[var68];
            }
            int var71;
            if (arg1.field9312 == null) {
                var71 = -1;
            } else {
                var71 = arg1.field9312[var68];
            }
            int var72;
            if (arg1.field9317 == null) {
                var72 = 0;
            } else {
                var72 = arg1.field9317[var68] & 0xFF;
            }
            float var73 = 0.0F;
            float var74 = 0.0F;
            float var75 = 0.0F;
            float var76 = 0.0F;
            float var77 = 0.0F;
            float var78 = 0.0F;
            byte var79 = 0;
            byte var80 = 0;
            int var81 = 0;
            if (var70 != -1) {
                if (var71 == -1) {
                    var79 = 1;
                    var75 = 1.0F;
                    var74 = 1.0F;
                    var73 = 0.0F;
                    var77 = 0.0F;
                    var76 = 1.0F;
                    var80 = 2;
                    var78 = 0.0F;
                } else {
                    var71 &= 0xFF;
                    byte var82 = arg1.field9283[var71];
                    if (var82 == 0) {
                        short var83 = arg1.field9286[var68];
                        short var84 = arg1.field9297[var68];
                        short var85 = arg1.field9333[var68];
                        short var86 = arg1.field9305[var71];
                        short var87 = arg1.field9308[var71];
                        short var88 = arg1.field9293[var71];
                        float var89 = (float) arg1.field9280[var86];
                        float var90 = (float) arg1.field9299[var86];
                        float var91 = (float) arg1.field9329[var86];
                        float var92 = (float) arg1.field9280[var87] - var89;
                        float var93 = (float) arg1.field9299[var87] - var90;
                        float var94 = (float) arg1.field9329[var87] - var91;
                        float var95 = (float) arg1.field9280[var88] - var89;
                        float var96 = (float) arg1.field9299[var88] - var90;
                        float var97 = (float) arg1.field9329[var88] - var91;
                        float var98 = (float) arg1.field9280[var83] - var89;
                        float var99 = (float) arg1.field9299[var83] - var90;
                        float var100 = (float) arg1.field9329[var83] - var91;
                        float var101 = (float) arg1.field9280[var84] - var89;
                        float var102 = (float) arg1.field9299[var84] - var90;
                        float var103 = (float) arg1.field9329[var84] - var91;
                        float var104 = (float) arg1.field9280[var85] - var89;
                        float var105 = (float) arg1.field9299[var85] - var90;
                        float var106 = (float) arg1.field9329[var85] - var91;
                        float var107 = var93 * var97 - (var94 * var96);
                        float var108 = var94 * var95 - var92 * var97;
                        float var109 = var92 * var96 - var93 * var95;
                        float var110 = var96 * var109 - (var97 * var108);
                        float var111 = var97 * var107 - var95 * var109;
                        float var112 = var95 * var108 - var96 * var107;
                        float var113 = 1.0F / (var94 * var112 + var92 * var110 + var93 * var111);
                        var75 = (var103 * var112 + var101 * var110 + var102 * var111) * var113;
                        var73 = (var100 * var112 + var98 * var110 + var99 * var111) * var113;
                        var77 = (var106 * var112 + var104 * var110 + var105 * var111) * var113;
                        float var114 = var92 * var108 - (var93 * var107);
                        float var115 = var93 * var109 - (var94 * var108);
                        float var116 = var94 * var107 - (var92 * var109);
                        float var117 = 1.0F / (var97 * var114 + var95 * var115 + var96 * var116);
                        var76 = (var103 * var114 + var101 * var115 + var102 * var116) * var117;
                        var78 = (var106 * var114 + var104 * var115 + var105 * var116) * var117;
                        var74 = (var100 * var114 + var98 * var115 + var99 * var116) * var117;
                    } else {
                        short var118 = arg1.field9286[var68];
                        short var119 = arg1.field9297[var68];
                        short var120 = arg1.field9333[var68];
                        int var121 = var24[var71];
                        int var122 = var25[var71];
                        int var123 = var26[var71];
                        float[] var124 = var27[var71];
                        byte var125 = arg1.field9324[var71];
                        float var126 = (float) arg1.field9320[var71] / 256.0F;
                        if (var82 == 1) {
                            float var127 = (float) arg1.field9314[var71] / 1024.0F;
                            class536.method2961(arg1.field9329[var118], arg1.field9299[var118], var125, var121, var127, var122, 6, arg1.field9280[var118], var124, var123, var126);
                            var73 = class76.field1050;
                            var74 = class159.field2385;
                            class536.method2961(arg1.field9329[var119], arg1.field9299[var119], var125, var121, var127, var122, 6, arg1.field9280[var119], var124, var123, var126);
                            var75 = class76.field1050;
                            var76 = class159.field2385;
                            class536.method2961(arg1.field9329[var120], arg1.field9299[var120], var125, var121, var127, var122, 6, arg1.field9280[var120], var124, var123, var126);
                            var78 = class159.field2385;
                            var77 = class76.field1050;
                            float var128 = var127 / 2.0F;
                            if ((var125 & 0x1) == 0) {
                                if (var75 - var73 > var128) {
                                    var79 = 1;
                                    var75 -= var127;
                                } else if (var73 - var75 > var128) {
                                    var79 = 2;
                                    var75 += var127;
                                }
                                if ((var77 - var73 > var128)) {
                                    var80 = 1;
                                    var77 -= var127;
                                } else if (var128 < var73 - var77) {
                                    var77 += var127;
                                    var80 = 2;
                                }
                            } else {
                                if ((var128 < var76 - var74)) {
                                    var79 = 1;
                                    var76 -= var127;
                                } else if (var128 < var74 - var76) {
                                    var76 += var127;
                                    var79 = 2;
                                }
                                if (var128 < var78 - var74) {
                                    var78 -= var127;
                                    var80 = 1;
                                } else if (var128 < var74 - var78) {
                                    var80 = 2;
                                    var78 += var127;
                                }
                            }
                        } else if (var82 == 2) {
                            float var129 = (float) arg1.field9319[var71] / 256.0F;
                            float var130 = (float) arg1.field9311[var71] / 256.0F;
                            int var131 = arg1.field9280[var119] - arg1.field9280[var118];
                            int var132 = arg1.field9299[var119] - arg1.field9299[var118];
                            int var133 = arg1.field9329[var119] - arg1.field9329[var118];
                            int var134 = arg1.field9280[var120] - arg1.field9280[var118];
                            int var135 = arg1.field9299[var120] - arg1.field9299[var118];
                            int var136 = arg1.field9329[var120] - arg1.field9329[var118];
                            int var137 = var132 * var136 - var133 * var135;
                            int var138 = var133 * var134 - (var131 * var136);
                            int var139 = var131 * var135 - (var132 * var134);
                            float var140 = 64.0F / (float) arg1.field9307[var71];
                            float var141 = 64.0F / (float) arg1.field9282[var71];
                            float var142 = 64.0F / (float) arg1.field9314[var71];
                            float var143 = (var124[2] * (float) var139 + var124[1] * (float) var138 + var124[0] * (float) var137) / var140;
                            float var144 = (var124[5] * (float) var139 + var124[4] * (float) var138 + var124[3] * (float) var137) / var141;
                            float var145 = (var124[8] * (float) var139 + var124[7] * (float) var138 + var124[6] * (float) var137) / var142;
                            var81 = class190.method1261((byte) 109, var143, var144, var145);
                            class288.method1733(var121, var81, var126, var123, var124, var125, arg1.field9280[var118], false, var130, arg1.field9299[var118], var122, var129, arg1.field9329[var118]);
                            var73 = class387.field5438;
                            var74 = class60.field819;
                            class288.method1733(var121, var81, var126, var123, var124, var125, arg1.field9280[var119], false, var130, arg1.field9299[var119], var122, var129, arg1.field9329[var119]);
                            var75 = class387.field5438;
                            var76 = class60.field819;
                            class288.method1733(var121, var81, var126, var123, var124, var125, arg1.field9280[var120], false, var130, arg1.field9299[var120], var122, var129, arg1.field9329[var120]);
                            var77 = class387.field5438;
                            var78 = class60.field819;
                        } else if (var82 == 3) {
                            class574.method3154(arg1.field9329[var118], var126, var121, var124, var123, arg1.field9299[var118], var125, -22113, var122, arg1.field9280[var118]);
                            var74 = class199.field2934;
                            var73 = class324.field4792;
                            class574.method3154(arg1.field9329[var119], var126, var121, var124, var123, arg1.field9299[var119], var125, -22113, var122, arg1.field9280[var119]);
                            var75 = class324.field4792;
                            var76 = class199.field2934;
                            class574.method3154(arg1.field9329[var120], var126, var121, var124, var123, arg1.field9299[var120], var125, -22113, var122, arg1.field9280[var120]);
                            var78 = class199.field2934;
                            var77 = class324.field4792;
                            if ((var125 & 0x1) == 0) {
                                if ((var75 - var73 > 0.5F)) {
                                    var79 = 1;
                                    var75--;
                                } else if (var73 - var75 > 0.5F) {
                                    var79 = 2;
                                    var75++;
                                }
                                if ((var77 - var73 > 0.5F)) {
                                    var80 = 1;
                                    var77--;
                                } else if (var73 - var77 > 0.5F) {
                                    var80 = 2;
                                    var77++;
                                }
                            } else {
                                if (var78 - var74 > 0.5F) {
                                    var78--;
                                    var80 = 1;
                                } else if (var74 - var78 > 0.5F) {
                                    var80 = 2;
                                    var78++;
                                }
                                if ((var76 - var74 > 0.5F)) {
                                    var79 = 1;
                                    var76--;
                                } else if (var74 - var76 > 0.5F) {
                                    var76++;
                                    var79 = 2;
                                }
                            }
                        }
                    }
                }
            }
            byte var146;
            if (arg1.field9294 == null) {
                var146 = 0;
            } else {
                var146 = arg1.field9294[var68];
            }
            if (var146 == 0) {
                long var147 = ((long) (var81 << 24) + (long) var72 + ((long) (var69 << 8)) << 32) + (long) (var71 << 2);
                short var149 = arg1.field9286[var68];
                short var150 = arg1.field9297[var68];
                short var151 = arg1.field9333[var68];
                class138 var152 = var13[var149];
                this.field5664[var52] = this.method2304(var74, var152.field1940, var152.field1937, var147, var152.field1934, 77, var73, var149, var152.field1936, arg1);
                class138 var153 = var13[var150];
                this.field5680[var52] = this.method2304(var76, var153.field1940, var153.field1937, (long) var79 + var147, var153.field1934, 124, var75, var150, var153.field1936, arg1);
                class138 var154 = var13[var151];
                this.field5676[var52] = this.method2304(var78, var154.field1940, var154.field1937, (long) var80 + var147, var154.field1934, 67, var77, var151, var154.field1936, arg1);
            } else if (var146 == 1) {
                class274 var155 = var50[var68];
                long var156 = ((long) (var81 << 24) + ((long) var72) + (long) (var69 << 8) << 32) + (long) ((var155.field3861 + 256 << 22) + (var71 << 2) + (var155.field3867 <= 0 ? 2048 : 1024) + (var155.field3864 + 256 << 12));
                this.field5664[var52] = this.method2304(var74, var155.field3861, 0, var156, var155.field3864, 62, var73, arg1.field9286[var68], var155.field3867, arg1);
                this.field5680[var52] = this.method2304(var76, var155.field3861, 0, (long) var79 + var156, var155.field3864, 77, var75, arg1.field9297[var68], var155.field3867, arg1);
                this.field5676[var52] = this.method2304(var78, var155.field3861, 0, (long) var80 + var156, var155.field3864, 120, var77, arg1.field9333[var68], var155.field3867, arg1);
            }
            if (arg1.field9316 == null) {
                this.field5645[var52] = -1;
            } else {
                this.field5645[var52] = arg1.field9316[var68];
            }
            if (arg1.field9317 != null) {
                this.field5636[var52] = arg1.field9317[var68];
            }
            if (arg1.field9331 != null) {
                this.field5629[var52] = arg1.field9331[var68];
            }
            this.field5626[var52] = arg1.field9281[var68];
        }
        int var53 = 0;
        short var54 = -10000;
        for (int var55 = 0; var55 < this.field5671; var55++) {
            short var67 = this.field5645[var55];
            if (var54 != var67) {
                var53++;
                var54 = var67;
            }
        }
        this.field5646 = new int[var53 + 1];
        short var56 = -10000;
        int var57 = 0;
        for (int var58 = 0; var58 < this.field5671; var58++) {
            short var66 = this.field5645[var58];
            if (var56 != var66) {
                var56 = var66;
                this.field5646[var57++] = var58;
            }
        }
        this.field5646[var57] = this.field5671;
        class421.field5953 = null;
        this.field5661 = class513.method2852(this.field5616, true, this.field5661);
        this.field5659 = class513.method2852(this.field5616, true, this.field5659);
        this.field5704 = class513.method2852(this.field5616, true, this.field5704);
        this.field5640 = class42.method195(this.field5640, this.field5616, -7470);
        this.field5603 = class20.method101(this.field5603, 0, this.field5616);
        this.field5632 = class20.method101(this.field5632, 0, this.field5616);
        if (arg1.field9300 != null && class316.method1934(this.field5692, arg2, false)) {
            this.field5617 = arg1.method3664((byte) 101, false);
        }
        if (arg1.field9328 != null && class539.method2969(this.field5692, arg2, 1024)) {
            this.field5634 = arg1.method3665(-119);
        }
        if (arg1.field9303 != null && class487.method2741(67, this.field5692, arg2)) {
            int var59 = 0;
            int[] var60 = new int[256];
            for (int var61 = 0; var61 < this.field5701; var61++) {
                int var65 = arg1.field9303[var8[var61]];
                if (var65 >= 0) {
                    int var10002 = var60[var65]++;
                    if (var59 < var65) {
                        var59 = var65;
                    }
                }
            }
            this.field5681 = new int[var59 + 1][];
            for (int var62 = 0; var62 <= var59; var62++) {
                this.field5681[var62] = new int[var60[var62]];
                var60[var62] = 0;
            }
            for (int var63 = 0; var63 < this.field5701; var63++) {
                int var64 = arg1.field9303[var8[var63]];
                if (var64 >= 0) {
                    this.field5681[var64][var60[var64]++] = var63;
                }
            }
        }
    }

    @OriginalMember(owner = "client!jc", name = "DA", descriptor = "()I", line = 2372)
    public final int method220() {
        field5637++;
        if (!this.field5677) {
            this.method2301(1);
        }
        return this.field5641;
    }

    @OriginalMember(owner = "client!jc", name = "ua", descriptor = "(IIII)V", line = 2384)
    public final void method240(int arg0, int arg1, int arg2, int arg3) {
        field5673++;
        if (arg0 == 0) {
            class630.field8795 = 0;
            class408.field5776 = 0;
            int var5 = 0;
            class128.field1767 = 0;
            for (int var6 = 0; var6 < this.field5699; var6++) {
                class128.field1767 += this.field5666[var6];
                class630.field8795 += this.field5694[var6];
                var5++;
                class408.field5776 += this.field5657[var6];
            }
            if (var5 <= 0) {
                class128.field1767 = arg1;
                class630.field8795 = arg2;
                class408.field5776 = arg3;
            } else {
                class630.field8795 = class630.field8795 / var5 + arg2;
                class408.field5776 = class408.field5776 / var5 + arg3;
                class128.field1767 = class128.field1767 / var5 + arg1;
            }
        } else if (arg0 == 1) {
            for (int var7 = 0; var7 < this.field5699; var7++) {
                this.field5666[var7] += arg1;
                this.field5694[var7] += arg2;
                this.field5657[var7] += arg3;
            }
        } else if (arg0 == 2) {
            for (int var8 = 0; var8 < this.field5699; var8++) {
                this.field5666[var8] -= class128.field1767;
                this.field5694[var8] -= class630.field8795;
                this.field5657[var8] -= class408.field5776;
                if (arg3 != 0) {
                    int var9 = class675.field9542[arg3];
                    int var10 = class675.field9541[arg3];
                    int var11 = this.field5666[var8] * var10 + this.field5694[var8] * var9 + 16383 >> 14;
                    this.field5694[var8] = this.field5694[var8] * var10 + 16383 - (this.field5666[var8] * var9) >> 14;
                    this.field5666[var8] = var11;
                }
                if (arg1 != 0) {
                    int var12 = class675.field9542[arg1];
                    int var13 = class675.field9541[arg1];
                    int var14 = this.field5694[var8] * var13 + 16383 - (this.field5657[var8] * var12) >> 14;
                    this.field5657[var8] = this.field5694[var8] * var12 + this.field5657[var8] * var13 + 16383 >> 14;
                    this.field5694[var8] = var14;
                }
                if (arg2 != 0) {
                    int var15 = class675.field9542[arg2];
                    int var16 = class675.field9541[arg2];
                    int var17 = this.field5657[var8] * var15 + this.field5666[var8] * var16 + 16383 >> 14;
                    this.field5657[var8] = this.field5657[var8] * var16 + 16383 - (this.field5666[var8] * var15) >> 14;
                    this.field5666[var8] = var17;
                }
                this.field5666[var8] += class128.field1767;
                this.field5694[var8] += class630.field8795;
                this.field5657[var8] += class408.field5776;
            }
        } else if (arg0 == 3) {
            for (int var18 = 0; var18 < this.field5699; var18++) {
                this.field5666[var18] -= class128.field1767;
                this.field5694[var18] -= class630.field8795;
                this.field5657[var18] -= class408.field5776;
                this.field5666[var18] = this.field5666[var18] * arg1 / 128;
                this.field5694[var18] = this.field5694[var18] * arg2 / 128;
                this.field5657[var18] = this.field5657[var18] * arg3 / 128;
                this.field5666[var18] += class128.field1767;
                this.field5694[var18] += class630.field8795;
                this.field5657[var18] += class408.field5776;
            }
        } else if (arg0 == 5) {
            for (int var19 = 0; var19 < this.field5701; var19++) {
                int var23 = (this.field5636[var19] & 0xFF) + arg1 * 8;
                if (var23 < 0) {
                    var23 = 0;
                } else if (var23 > 255) {
                    var23 = 255;
                }
                this.field5636[var19] = (byte) var23;
            }
            if (this.field5695 != null) {
                this.field5695.field1021 = null;
            }
            if (this.field5647 != null) {
                for (int var20 = 0; var20 < this.field5613; var20++) {
                    class384 var21 = this.field5647[var20];
                    class62 var22 = this.field5650[var20];
                    var22.field824 = 255 - (this.field5636[var21.field5376] & 0xFF) << 24 | var22.field824 & 0xFFFFFF;
                }
            }
        } else if (arg0 == 7) {
            for (int var24 = 0; var24 < this.field5701; var24++) {
                int var28 = this.field5626[var24] & 0xFFFF;
                int var29 = var28 >> 10 & 0x3F;
                int var30 = var28 >> 7 & 0x7;
                int var31 = var29 + arg1 & 0x3F;
                int var32 = var28 & 0x7F;
                int var33 = arg2 / 4 + var30;
                if (var33 < 0) {
                    var33 = 0;
                } else if (var33 > 7) {
                    var33 = 7;
                }
                int var34 = arg3 + var32;
                if (var34 < 0) {
                    var34 = 0;
                } else if (var34 > 127) {
                    var34 = 127;
                }
                this.field5626[var24] = (short) class266.method1624(var34, class266.method1624(var31 << 10, var33 << 7));
            }
            if (this.field5695 != null) {
                this.field5695.field1021 = null;
            }
            if (this.field5647 != null) {
                for (int var25 = 0; var25 < this.field5613; var25++) {
                    class384 var26 = this.field5647[var25];
                    class62 var27 = this.field5650[var25];
                    var27.field824 = class35.field433[this.field5626[var26.field5376] & 0xFFFF] & 0xFFFFFF | var27.field824 & 0xFF000000;
                }
            }
        } else if (arg0 == 8) {
            for (int var35 = 0; var35 < this.field5613; var35++) {
                class62 var36 = this.field5650[var35];
                var36.field828 += arg1;
                var36.field825 += arg2;
            }
        } else if (arg0 == 10) {
            for (int var37 = 0; var37 < this.field5613; var37++) {
                class62 var38 = this.field5650[var37];
                var38.field829 = var38.field829 * arg2 >> 7;
                var38.field822 = var38.field822 * arg1 >> 7;
            }
        } else if (arg0 == 9) {
            for (int var39 = 0; var39 < this.field5613; var39++) {
                class62 var40 = this.field5650[var39];
                var40.field827 = var40.field827 + arg1 & 0x3FFF;
            }
        }
    }

    @OriginalMember(owner = "client!jc", name = "ka", descriptor = "(SS)V", line = 2690)
    public final void method204(short arg0, short arg1) {
        field5672++;
        class489 var3 = this.field5662.field9050;
        for (int var4 = 0; var4 < this.field5701; var4++) {
            if (this.field5645[var4] == arg0) {
                this.field5645[var4] = arg1;
            }
        }
        byte var5 = 0;
        byte var6 = 0;
        if (arg0 != -1) {
            class269 var7 = var3.method588(-26679, arg0 & 0xFFFF);
            var6 = var7.field3810;
            var5 = var7.field3820;
        }
        byte var8 = 0;
        byte var9 = 0;
        if (arg1 != -1) {
            class269 var10 = var3.method588(-26679, arg1 & 0xFFFF);
            var9 = var10.field3810;
            var8 = var10.field3820;
        }
        if (!var5 != var8 | var6 != var9) {
            return;
        }
        if (this.field5647 != null) {
            for (int var11 = 0; var11 < this.field5613; var11++) {
                class384 var12 = this.field5647[var11];
                class62 var13 = this.field5650[var11];
                var13.field824 = var13.field824 & 0xFF000000 | class35.field433[this.field5626[var12.field5376] & 0xFFFF] & 0xFFFFFF;
            }
        }
        if (this.field5695 != null) {
            this.field5695.field1021 = null;
            return;
        }
    }

    @OriginalMember(owner = "client!jc", name = "LA", descriptor = "()I", line = 2761)
    public final int method219() {
        if (!this.field5677) {
            this.method2301(1);
        }
        field5601++;
        return this.field5644;
    }

    @OriginalMember(owner = "client!jc", name = "ha", descriptor = "()I", line = 2775)
    public final int method214() {
        field5705++;
        if (!this.field5677) {
            this.method2301(1);
        }
        return this.field5627;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(IZIILac;Lba;)V", line = 2789)
    public static final void method2302(int arg0, boolean arg1, int arg2, int arg3, class496 arg4, class352 arg5) {
        field5630++;
        if (arg5 != null) {
            arg4.method2773(arg5.method229(), arg5.method196(), arg3, arg2, arg5.method220(), arg5.method214(), arg5.method219(), arg0, (byte) 100, arg5.method198(), arg5.method239());
            if (arg1) {
                method2307(-68, -82, null, 17, true, (byte) -126, 56, null);
            }
        }
    }

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "()Z", line = 2811)
    public final boolean method209() {
        field5683++;
        if (this.field5645 == null) {
            return true;
        }
        for (int var1 = 0; var1 < this.field5645.length; var1++) {
            if (this.field5645[var1] != -1 && !this.field5662.field9050.method590(this.field5645[var1], (byte) -50)) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!jc", name = "K", descriptor = "()I", line = 2835)
    public final int method198() {
        field5611++;
        if (!this.field5677) {
            this.method2301(1);
        }
        return this.field5674;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(BIZ)Lba;", line = 2847)
    public final class352 method235(byte arg0, int arg1, boolean arg2) {
        field5633++;
        class403 var4;
        class403 var5;
        if (arg0 == 1) {
            var4 = this.field5662.field4278;
            var5 = this.field5662.field4305;
        } else if (arg0 == 2) {
            var5 = this.field5662.field4288;
            var4 = this.field5662.field4277;
        } else if (arg0 == 3) {
            var5 = this.field5662.field4298;
            var4 = this.field5662.field4256;
        } else if (arg0 == 4) {
            var4 = this.field5662.field4312;
            var5 = this.field5662.field4307;
        } else if (arg0 == 5) {
            var4 = this.field5662.field4249;
            var5 = this.field5662.field4291;
        } else {
            var4 = var5 = new class403(this.field5662);
        }
        return this.method2306(arg1, arg0 != 0, var5, (byte) 127, arg2, var4);
    }

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "(I)V", line = 2896)
    public static void method2303(int arg0) {
        if (arg0 >= -125) {
            field5675 = null;
        }
        field5675 = null;
    }

    @OriginalMember(owner = "client!jc", name = "ZA", descriptor = "()I", line = 2907)
    public final int method196() {
        field5696++;
        if (!this.field5677) {
            this.method2301(1);
        }
        return this.field5707;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(FIIJIIFIILhn;)S", line = 2921)
    private final short method2304(float arg0, int arg1, int arg2, long arg3, int arg4, int arg5, float arg6, int arg7, int arg8, class661 arg9) {
        field5638++;
        int var12 = this.field5653[arg7];
        int var13 = this.field5653[arg7 + 1];
        int var14 = 0;
        if (arg5 < 26) {
            this.method205(null, null, -98);
        }
        for (int var15 = var12; var15 < var13; var15++) {
            short var16 = this.field5665[var15];
            if (var16 == 0) {
                var14 = var15;
                break;
            }
            if (class421.field5953[var15] == arg3) {
                return (short) (var16 - 1);
            }
        }
        this.field5665[var14] = (short) (this.field5616 + 1);
        class421.field5953[var14] = arg3;
        this.field5661[this.field5616] = (short) arg8;
        this.field5659[this.field5616] = (short) arg4;
        this.field5704[this.field5616] = (short) arg1;
        this.field5640[this.field5616] = (byte) arg2;
        this.field5603[this.field5616] = arg6;
        this.field5632[this.field5616] = arg0;
        return (short) (this.field5616++);
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(Lba;IIIZ)V", line = 2971)
    public final void method230(class352 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field5654++;
        class403 var6 = (class403) arg0;
        if (this.field5701 == 0 || var6.field5701 == 0) {
            return;
        }
        int var7 = var6.field5699;
        int[] var8 = var6.field5666;
        int[] var9 = var6.field5694;
        int[] var10 = var6.field5657;
        short[] var11 = var6.field5661;
        short[] var12 = var6.field5659;
        short[] var13 = var6.field5704;
        byte[] var14 = var6.field5640;
        short[] var15;
        short[] var16;
        byte[] var17;
        short[] var18;
        if (this.field5687 == null) {
            var15 = null;
            var16 = null;
            var17 = null;
            var18 = null;
        } else {
            var16 = this.field5687.field2885;
            var18 = this.field5687.field2884;
            var15 = this.field5687.field2882;
            var17 = this.field5687.field2886;
        }
        short[] var19;
        short[] var20;
        byte[] var21;
        short[] var22;
        if (var6.field5687 == null) {
            var22 = null;
            var19 = null;
            var21 = null;
            var20 = null;
        } else {
            var19 = var6.field5687.field2882;
            var20 = var6.field5687.field2884;
            var21 = var6.field5687.field2886;
            var22 = var6.field5687.field2885;
        }
        int[] var23 = var6.field5653;
        short[] var24 = var6.field5665;
        if (!var6.field5677) {
            var6.method2301(1);
        }
        short var25 = var6.field5641;
        short var26 = var6.field5628;
        short var27 = var6.field5627;
        short var28 = var6.field5697;
        short var29 = var6.field5644;
        short var30 = var6.field5674;
        for (int var31 = 0; var31 < this.field5699; var31++) {
            int var32 = this.field5694[var31] - arg2;
            if (var25 <= var32 && var26 >= var32) {
                int var33 = this.field5666[var31] - arg1;
                if (var27 <= var33 && var28 >= var33) {
                    int var34 = this.field5657[var31] - arg3;
                    if (var34 >= var29 && var30 >= var34) {
                        int var35 = -1;
                        int var36 = this.field5653[var31];
                        int var37 = this.field5653[var31 + 1];
                        for (int var38 = var36; var38 < var37; var38++) {
                            var35 = this.field5665[var38] - 1;
                            if (var35 == -1 || this.field5640[var35] != 0) {
                                break;
                            }
                        }
                        if (var35 != -1) {
                            for (int var39 = 0; var39 < var7; var39++) {
                                if (var8[var39] == var33 && var10[var39] == var34 && var9[var39] == var32) {
                                    int var40 = var23[var39];
                                    int var41 = -1;
                                    int var42 = var23[var39 + 1];
                                    for (int var43 = var40; var43 < var42; var43++) {
                                        var41 = var24[var43] - 1;
                                        if (var41 == -1 || var14[var41] != 0) {
                                            break;
                                        }
                                    }
                                    if (var41 != -1) {
                                        if (var18 == null) {
                                            this.field5687 = new class195();
                                            var18 = this.field5687.field2884 = class154.method1084((byte) -27, this.field5661);
                                            var15 = this.field5687.field2882 = class154.method1084((byte) -27, this.field5659);
                                            var16 = this.field5687.field2885 = class154.method1084((byte) -27, this.field5704);
                                            var17 = this.field5687.field2886 = class310.method1907(this.field5640, false);
                                        }
                                        if (var20 == null) {
                                            class195 var44 = var6.field5687 = new class195();
                                            var20 = var44.field2884 = class154.method1084((byte) -27, var11);
                                            var19 = var44.field2882 = class154.method1084((byte) -27, var12);
                                            var22 = var44.field2885 = class154.method1084((byte) -27, var13);
                                            var21 = var44.field2886 = class310.method1907(var14, false);
                                        }
                                        short var45 = this.field5661[var35];
                                        short var46 = this.field5659[var35];
                                        short var47 = this.field5704[var35];
                                        byte var48 = this.field5640[var35];
                                        int var49 = var23[var39];
                                        int var50 = var23[var39 + 1];
                                        for (int var51 = var49; var51 < var50; var51++) {
                                            int var52 = var24[var51] - 1;
                                            if (var52 == -1) {
                                                break;
                                            }
                                            if (var21[var52] != 0) {
                                                var20[var52] += var45;
                                                var19[var52] += var46;
                                                var22[var52] += var47;
                                                var21[var52] += var48;
                                            }
                                        }
                                        int var53 = this.field5653[var31];
                                        byte var54 = var14[var41];
                                        short var55 = var13[var41];
                                        short var56 = var12[var41];
                                        short var57 = var11[var41];
                                        int var58 = this.field5653[var31 + 1];
                                        for (int var59 = var53; var59 < var58; var59++) {
                                            int var60 = this.field5665[var59] - 1;
                                            if (var60 == -1) {
                                                break;
                                            }
                                            if (var17[var60] != 0) {
                                                var18[var60] += var57;
                                                var15[var60] += var56;
                                                var16[var60] += var55;
                                                var17[var60] += var54;
                                            }
                                        }
                                        if (this.field5604 == null && this.field5695 != null) {
                                            this.field5695.field1021 = null;
                                        }
                                        if (this.field5604 != null) {
                                            this.field5604.field1021 = null;
                                        }
                                        if (var6.field5604 == null && var6.field5695 != null) {
                                            var6.field5695.field1021 = null;
                                        }
                                        if (var6.field5604 != null) {
                                            var6.field5604.field1021 = null;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!jc", name = "Q", descriptor = "()Z", line = 3234)
    public final boolean method210() {
        field5625++;
        if (this.field5617 == null) {
            return false;
        }
        for (int var1 = 0; var1 < this.field5667; var1++) {
            this.field5666[var1] <<= 0x4;
            this.field5694[var1] <<= 0x4;
            this.field5657[var1] <<= 0x4;
        }
        class630.field8795 = 0;
        class128.field1767 = 0;
        class408.field5776 = 0;
        return true;
    }

    @OriginalMember(owner = "client!jc", name = "da", descriptor = "(I[IIIIZI[I)V", line = 3261)
    public final void method207(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7) {
        field5690++;
        int var9 = arg1.length;
        if (arg0 == 0) {
            int var10 = arg3 << 4;
            int var11 = arg2 << 4;
            int var12 = arg4 << 4;
            int var13 = 0;
            class128.field1767 = 0;
            class630.field8795 = 0;
            class408.field5776 = 0;
            for (int var14 = 0; var14 < var9; var14++) {
                int var15 = arg1[var14];
                if (var15 < this.field5617.length) {
                    int[] var16 = this.field5617[var15];
                    for (int var17 = 0; var17 < var16.length; var17++) {
                        int var18 = var16[var17];
                        if (this.field5669 == null || (this.field5669[var18] & arg6) != 0) {
                            class128.field1767 += this.field5666[var18];
                            class630.field8795 += this.field5694[var18];
                            var13++;
                            class408.field5776 += this.field5657[var18];
                        }
                    }
                }
            }
            if (var13 <= 0) {
                class408.field5776 = var12;
                class630.field8795 = var10;
                class128.field1767 = var11;
            } else {
                class408.field5776 = class408.field5776 / var13 + var12;
                class630.field8795 = class630.field8795 / var13 + var10;
                class128.field1767 = class128.field1767 / var13 + var11;
                class47.field706 = true;
            }
        } else if (arg0 == 1) {
            if (arg7 != null) {
                int var19 = arg7[0] * arg2 + arg7[2] * arg4 + (arg7[1] * arg3) + 8192 >> 14;
                int var20 = arg7[3] * arg2 + arg7[5] * arg4 + arg7[4] * arg3 + 8192 >> 14;
                int var21 = arg7[8] * arg4 + arg7[7] * arg3 + arg7[6] * arg2 + 8192 >> 14;
                arg3 = var20;
                arg2 = var19;
                arg4 = var21;
            }
            int var22 = arg2 << 4;
            int var23 = arg4 << 4;
            int var24 = arg3 << 4;
            for (int var25 = 0; var25 < var9; var25++) {
                int var26 = arg1[var25];
                if (var26 < this.field5617.length) {
                    int[] var27 = this.field5617[var26];
                    for (int var28 = 0; var28 < var27.length; var28++) {
                        int var29 = var27[var28];
                        if (this.field5669 == null || (arg6 & this.field5669[var29]) != 0) {
                            this.field5666[var29] += var22;
                            this.field5694[var29] += var24;
                            this.field5657[var29] += var23;
                        }
                    }
                }
            }
        } else if (arg0 == 2) {
            if (arg7 == null) {
                for (int var90 = 0; var90 < var9; var90++) {
                    int var109 = arg1[var90];
                    if (this.field5617.length > var109) {
                        int[] var110 = this.field5617[var109];
                        for (int var111 = 0; var111 < var110.length; var111++) {
                            int var112 = var110[var111];
                            if (this.field5669 == null || (this.field5669[var112] & arg6) != 0) {
                                this.field5666[var112] -= class128.field1767;
                                this.field5694[var112] -= class630.field8795;
                                this.field5657[var112] -= class408.field5776;
                                if (arg4 != 0) {
                                    int var113 = class675.field9542[arg4];
                                    int var114 = class675.field9541[arg4];
                                    int var115 = this.field5694[var112] * var113 + (this.field5666[var112] * var114) + 16383 >> 14;
                                    this.field5694[var112] = this.field5694[var112] * var114 + (16383 - (this.field5666[var112] * var113)) >> 14;
                                    this.field5666[var112] = var115;
                                }
                                if (arg2 != 0) {
                                    int var116 = class675.field9542[arg2];
                                    int var117 = class675.field9541[arg2];
                                    int var118 = this.field5694[var112] * var117 + 16383 - (this.field5657[var112] * var116) >> 14;
                                    this.field5657[var112] = this.field5694[var112] * var116 + this.field5657[var112] * var117 + 16383 >> 14;
                                    this.field5694[var112] = var118;
                                }
                                if (arg3 != 0) {
                                    int var119 = class675.field9542[arg3];
                                    int var120 = class675.field9541[arg3];
                                    int var121 = this.field5657[var112] * var119 - (-(this.field5666[var112] * var120) - 16383) >> 14;
                                    this.field5657[var112] = this.field5657[var112] * var120 + 16383 - (this.field5666[var112] * var119) >> 14;
                                    this.field5666[var112] = var121;
                                }
                                this.field5666[var112] += class128.field1767;
                                this.field5694[var112] += class630.field8795;
                                this.field5657[var112] += class408.field5776;
                            }
                        }
                    }
                }
                if (arg5) {
                    for (int var91 = 0; var91 < var9; var91++) {
                        int var92 = arg1[var91];
                        if (var92 < this.field5617.length) {
                            int[] var93 = this.field5617[var92];
                            for (int var94 = 0; var94 < var93.length; var94++) {
                                int var95 = var93[var94];
                                if (this.field5669 == null || (arg6 & this.field5669[var95]) != 0) {
                                    int var96 = this.field5653[var95];
                                    int var97 = this.field5653[var95 + 1];
                                    for (int var98 = var96; var98 < var97; var98++) {
                                        int var99 = this.field5665[var98] - 1;
                                        if (var99 == -1) {
                                            break;
                                        }
                                        if (arg4 != 0) {
                                            int var100 = class675.field9542[arg4];
                                            int var101 = class675.field9541[arg4];
                                            int var102 = this.field5661[var99] * var101 + (this.field5659[var99] * var100 + 16383) >> 14;
                                            this.field5659[var99] = (short) (this.field5659[var99] * var101 + 16383 - (this.field5661[var99] * var100) >> 14);
                                            this.field5661[var99] = (short) var102;
                                        }
                                        if (arg2 != 0) {
                                            int var103 = class675.field9542[arg2];
                                            int var104 = class675.field9541[arg2];
                                            int var105 = this.field5659[var99] * var104 + 16383 - (this.field5704[var99] * var103) >> 14;
                                            this.field5704[var99] = (short) (this.field5704[var99] * var104 + this.field5659[var99] * var103 + 16383 >> 14);
                                            this.field5659[var99] = (short) var105;
                                        }
                                        if (arg3 != 0) {
                                            int var106 = class675.field9542[arg3];
                                            int var107 = class675.field9541[arg3];
                                            int var108 = this.field5704[var99] * var106 - (-(this.field5661[var99] * var107) - 16383) >> 14;
                                            this.field5704[var99] = (short) (this.field5704[var99] * var107 + 16383 - (this.field5661[var99] * var106) >> 14);
                                            this.field5661[var99] = (short) var108;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (this.field5604 == null && this.field5695 != null) {
                        this.field5695.field1021 = null;
                    }
                    if (this.field5604 != null) {
                        this.field5604.field1021 = null;
                    }
                }
            } else {
                int var30 = arg7[9] << 4;
                int var31 = arg7[10] << 4;
                int var32 = arg7[11] << 4;
                int var33 = arg7[12] << 4;
                int var34 = arg7[13] << 4;
                int var35 = arg7[14] << 4;
                if (class47.field706) {
                    int var36 = arg7[0] * class128.field1767 + (arg7[3] * class630.field8795) + arg7[6] * class408.field5776 + 8192 >> 14;
                    int var37 = arg7[1] * class128.field1767 + arg7[7] * class408.field5776 + arg7[4] * class630.field8795 + 8192 >> 14;
                    int var38 = var33 + var36;
                    int var39 = var34 + var37;
                    int var40 = arg7[8] * class408.field5776 + arg7[5] * class630.field8795 + arg7[2] * class128.field1767 + 8192 >> 14;
                    class128.field1767 = var38;
                    class630.field8795 = var39;
                    int var41 = var35 + var40;
                    class408.field5776 = var41;
                    class47.field706 = false;
                }
                int[] var42 = new int[9];
                int var43 = class675.field9541[arg2];
                int var44 = class675.field9542[arg2];
                int var45 = class675.field9541[arg3];
                int var46 = class675.field9542[arg3];
                int var47 = class675.field9541[arg4];
                int var48 = class675.field9542[arg4];
                int var49 = var44 * var47 + 8192 >> 14;
                int var50 = var44 * var48 + 8192 >> 14;
                var42[4] = var43 * var47 + 8192 >> 14;
                var42[6] = -var46 * var47 + var45 * var50 + 8192 >> 14;
                var42[2] = var43 * var46 + 8192 >> 14;
                var42[0] = var45 * var47 + var46 * var50 + 8192 >> 14;
                var42[3] = var43 * var48 + 8192 >> 14;
                var42[5] = -var44;
                var42[8] = var43 * var45 + 8192 >> 14;
                var42[1] = var46 * var49 + (-var45 * var48 + 8192) >> 14;
                var42[7] = var46 * var48 + (var45 * var49 + 8192) >> 14;
                int var51 = var42[0] * -class128.field1767 + (var42[1] * -class630.field8795) + (var42[2] * -class408.field5776 - -8192) >> 14;
                int var52 = var42[3] * -class128.field1767 + (var42[4] * -class630.field8795) + (var42[5] * -class408.field5776) + 8192 >> 14;
                int var53 = var42[8] * -class408.field5776 + var42[6] * -class128.field1767 + var42[7] * -class630.field8795 + 8192 >> 14;
                int var54 = class128.field1767 + var51;
                int var55 = var52 + class630.field8795;
                int var56 = var53 + class408.field5776;
                int[] var57 = new int[9];
                for (int var58 = 0; var58 < 3; var58++) {
                    for (int var87 = 0; var87 < 3; var87++) {
                        int var88 = 0;
                        for (int var89 = 0; var89 < 3; var89++) {
                            var88 += arg7[var87 * 3 + var89] * var42[var58 * 3 + var89];
                        }
                        var57[var58 * 3 + var87] = var88 + 8192 >> 14;
                    }
                }
                int var59 = var42[1] * var34 + var42[2] * var35 + var42[0] * var33 + 8192 >> 14;
                int var60 = var42[3] * var33 + var42[4] * var34 + var42[5] * var35 + 8192 >> 14;
                int var61 = var55 + var60;
                int var62 = var42[7] * var34 + (var42[6] * var33 + (var42[8] * var35) + 8192) >> 14;
                int var63 = var54 + var59;
                int var64 = var56 + var62;
                int[] var65 = new int[9];
                for (int var66 = 0; var66 < 3; var66++) {
                    for (int var84 = 0; var84 < 3; var84++) {
                        int var85 = 0;
                        for (int var86 = 0; var86 < 3; var86++) {
                            var85 += arg7[var66 * 3 + var86] * var57[var84 + (var86 * 3)];
                        }
                        var65[var66 * 3 + var84] = var85 + 8192 >> 14;
                    }
                }
                int var67 = arg7[2] * var64 + arg7[1] * var61 + arg7[0] * var63 + 8192 >> 14;
                int var68 = arg7[3] * var63 + (arg7[4] * var61) + arg7[5] * var64 + 8192 >> 14;
                int var69 = arg7[6] * var63 + (arg7[7] * var61 + (arg7[8] * var64) + 8192) >> 14;
                int var70 = var30 + var67;
                int var71 = var31 + var68;
                int var72 = var32 + var69;
                for (int var73 = 0; var73 < var9; var73++) {
                    int var74 = arg1[var73];
                    if (var74 < this.field5617.length) {
                        int[] var75 = this.field5617[var74];
                        for (int var76 = 0; var76 < var75.length; var76++) {
                            int var77 = var75[var76];
                            if (this.field5669 == null || (this.field5669[var77] & arg6) != 0) {
                                int var78 = this.field5694[var77] * var65[1] + this.field5657[var77] * var65[2] + this.field5666[var77] * var65[0] + 8192 >> 14;
                                int var79 = this.field5666[var77] * var65[3] + 8192 - (-(this.field5694[var77] * var65[4]) - this.field5657[var77] * var65[5]) >> 14;
                                int var80 = var71 + var79;
                                int var81 = var70 + var78;
                                int var82 = this.field5694[var77] * var65[7] + this.field5666[var77] * var65[6] + this.field5657[var77] * var65[8] + 8192 >> 14;
                                int var83 = var72 + var82;
                                this.field5666[var77] = var81;
                                this.field5694[var77] = var80;
                                this.field5657[var77] = var83;
                            }
                        }
                    }
                }
            }
        } else if (arg0 == 3) {
            if (arg7 == null) {
                for (int var122 = 0; var122 < var9; var122++) {
                    int var123 = arg1[var122];
                    if (var123 < this.field5617.length) {
                        int[] var124 = this.field5617[var123];
                        for (int var125 = 0; var125 < var124.length; var125++) {
                            int var126 = var124[var125];
                            if (this.field5669 == null || (this.field5669[var126] & arg6) != 0) {
                                this.field5666[var126] -= class128.field1767;
                                this.field5694[var126] -= class630.field8795;
                                this.field5657[var126] -= class408.field5776;
                                this.field5666[var126] = this.field5666[var126] * arg2 >> 7;
                                this.field5694[var126] = this.field5694[var126] * arg3 >> 7;
                                this.field5657[var126] = this.field5657[var126] * arg4 >> 7;
                                this.field5666[var126] += class128.field1767;
                                this.field5694[var126] += class630.field8795;
                                this.field5657[var126] += class408.field5776;
                            }
                        }
                    }
                }
            } else {
                int var127 = arg7[9] << 4;
                int var128 = arg7[10] << 4;
                int var129 = arg7[11] << 4;
                int var130 = arg7[12] << 4;
                int var131 = arg7[13] << 4;
                int var132 = arg7[14] << 4;
                if (class47.field706) {
                    int var133 = arg7[0] * class128.field1767 + 8192 - (-(arg7[3] * class630.field8795) - arg7[6] * class408.field5776) >> 14;
                    int var134 = arg7[7] * class408.field5776 + arg7[4] * class630.field8795 + arg7[1] * class128.field1767 + 8192 >> 14;
                    int var135 = arg7[2] * class128.field1767 + arg7[5] * class630.field8795 - (-(arg7[8] * class408.field5776) + -8192) >> 14;
                    int var136 = var130 + var133;
                    int var137 = var131 + var134;
                    class630.field8795 = var137;
                    int var138 = var132 + var135;
                    class128.field1767 = var136;
                    class47.field706 = false;
                    class408.field5776 = var138;
                }
                int var139 = arg2 << 15 >> 7;
                int var140 = arg3 << 15 >> 7;
                int var141 = arg4 << 15 >> 7;
                int var142 = -class128.field1767 * var139 + 8192 >> 14;
                int var143 = -class630.field8795 * var140 + 8192 >> 14;
                int var144 = -class408.field5776 * var141 + 8192 >> 14;
                int var145 = class128.field1767 + var142;
                int var146 = class630.field8795 + var143;
                int var147 = class408.field5776 + var144;
                int[] var148 = new int[] { arg7[0] * var139 + 8192 >> 14, arg7[3] * var139 + 8192 >> 14, arg7[6] * var139 + 8192 >> 14, arg7[1] * var140 + 8192 >> 14, arg7[4] * var140 + 8192 >> 14, arg7[7] * var140 + 8192 >> 14, arg7[2] * var141 + 8192 >> 14, arg7[5] * var141 + 8192 >> 14, arg7[8] * var141 + 8192 >> 14 };
                int var149 = var130 * var139 + 8192 >> 14;
                int var150 = var131 * var140 + 8192 >> 14;
                int var151 = var145 + var149;
                int var152 = var146 + var150;
                int var153 = var132 * var141 + 8192 >> 14;
                int var154 = var147 + var153;
                int[] var155 = new int[9];
                for (int var156 = 0; var156 < 3; var156++) {
                    for (int var174 = 0; var174 < 3; var174++) {
                        int var175 = 0;
                        for (int var176 = 0; var176 < 3; var176++) {
                            var175 += var148[var174 + (var176 * 3)] * arg7[var156 * 3 + var176];
                        }
                        var155[var156 * 3 + var174] = var175 + 8192 >> 14;
                    }
                }
                int var157 = arg7[0] * var151 + (arg7[2] * var154) + arg7[1] * var152 + 8192 >> 14;
                int var158 = arg7[3] * var151 + arg7[5] * var154 + arg7[4] * var152 + 8192 >> 14;
                int var159 = arg7[8] * var154 + arg7[7] * var152 + arg7[6] * var151 + 8192 >> 14;
                int var160 = var128 + var158;
                int var161 = var127 + var157;
                int var162 = var129 + var159;
                for (int var163 = 0; var163 < var9; var163++) {
                    int var164 = arg1[var163];
                    if (this.field5617.length > var164) {
                        int[] var165 = this.field5617[var164];
                        for (int var166 = 0; var166 < var165.length; var166++) {
                            int var167 = var165[var166];
                            if (this.field5669 == null || (this.field5669[var167] & arg6) != 0) {
                                int var168 = this.field5657[var167] * var155[2] + this.field5694[var167] * var155[1] + this.field5666[var167] * var155[0] + 8192 >> 14;
                                int var169 = this.field5694[var167] * var155[4] + this.field5666[var167] * var155[3] + (this.field5657[var167] * var155[5]) + 8192 >> 14;
                                int var170 = var160 + var169;
                                int var171 = this.field5657[var167] * var155[8] + this.field5694[var167] * var155[7] + this.field5666[var167] * var155[6] + 8192 >> 14;
                                int var172 = var161 + var168;
                                this.field5666[var167] = var172;
                                int var173 = var162 + var171;
                                this.field5694[var167] = var170;
                                this.field5657[var167] = var173;
                            }
                        }
                    }
                }
            }
        } else if (arg0 == 5) {
            if (this.field5681 != null) {
                for (int var177 = 0; var177 < var9; var177++) {
                    int var181 = arg1[var177];
                    if (this.field5681.length > var181) {
                        int[] var182 = this.field5681[var181];
                        for (int var183 = 0; var183 < var182.length; var183++) {
                            int var184 = var182[var183];
                            if (this.field5629 == null || (this.field5629[var184] & arg6) != 0) {
                                int var185 = (this.field5636[var184] & 0xFF) + arg2 * 8;
                                if (var185 < 0) {
                                    var185 = 0;
                                } else if (var185 > 255) {
                                    var185 = 255;
                                }
                                this.field5636[var184] = (byte) var185;
                                if (this.field5695 != null) {
                                    this.field5695.field1021 = null;
                                }
                            }
                        }
                    }
                }
                if (this.field5647 != null) {
                    for (int var178 = 0; var178 < this.field5613; var178++) {
                        class384 var179 = this.field5647[var178];
                        class62 var180 = this.field5650[var178];
                        var180.field824 = var180.field824 & 0xFFFFFF | 255 - (this.field5636[var179.field5376] & 0xFF) << 24;
                    }
                }
            }
        } else if (arg0 == 7) {
            if (this.field5681 != null) {
                for (int var186 = 0; var186 < var9; var186++) {
                    int var190 = arg1[var186];
                    if (this.field5681.length > var190) {
                        int[] var191 = this.field5681[var190];
                        for (int var192 = 0; var192 < var191.length; var192++) {
                            int var193 = var191[var192];
                            if (this.field5629 == null || (this.field5629[var193] & arg6) != 0) {
                                int var194 = this.field5626[var193] & 0xFFFF;
                                int var195 = (var194 & 0xFEC4) >> 10;
                                int var196 = var194 >> 7 & 0x7;
                                int var197 = arg2 + var195 & 0x3F;
                                int var198 = var194 & 0x7F;
                                int var199 = arg3 / 4 + var196;
                                if (var199 < 0) {
                                    var199 = 0;
                                } else if (var199 > 7) {
                                    var199 = 7;
                                }
                                int var200 = arg4 + var198;
                                if (var200 < 0) {
                                    var200 = 0;
                                } else if (var200 > 127) {
                                    var200 = 127;
                                }
                                this.field5626[var193] = (short) class266.method1624(class266.method1624(var199 << 7, var197 << 10), var200);
                                if (this.field5695 != null) {
                                    this.field5695.field1021 = null;
                                }
                            }
                        }
                    }
                }
                if (this.field5647 != null) {
                    for (int var187 = 0; var187 < this.field5613; var187++) {
                        class384 var188 = this.field5647[var187];
                        class62 var189 = this.field5650[var187];
                        var189.field824 = class35.field433[this.field5626[var188.field5376] & 0xFFFF] & 0xFFFFFF | var189.field824 & 0xFF000000;
                    }
                }
            }
        } else if (arg0 == 8) {
            if (this.field5634 != null) {
                for (int var201 = 0; var201 < var9; var201++) {
                    int var202 = arg1[var201];
                    if (this.field5634.length > var202) {
                        int[] var203 = this.field5634[var202];
                        for (int var204 = 0; var204 < var203.length; var204++) {
                            class62 var205 = this.field5650[var203[var204]];
                            var205.field825 += arg3;
                            var205.field828 += arg2;
                        }
                    }
                }
            }
        } else if (arg0 == 10) {
            if (this.field5634 != null) {
                for (int var206 = 0; var206 < var9; var206++) {
                    int var207 = arg1[var206];
                    if (this.field5634.length > var207) {
                        int[] var208 = this.field5634[var207];
                        for (int var209 = 0; var209 < var208.length; var209++) {
                            class62 var210 = this.field5650[var208[var209]];
                            var210.field829 = var210.field829 * arg3 >> 7;
                            var210.field822 = var210.field822 * arg2 >> 7;
                        }
                    }
                }
            }
        } else if (arg0 == 9 && this.field5634 != null) {
            for (int var211 = 0; var211 < var9; var211++) {
                int var212 = arg1[var211];
                if (this.field5634.length > var212) {
                    int[] var213 = this.field5634[var212];
                    for (int var214 = 0; var214 < var213.length; var214++) {
                        class62 var215 = this.field5650[var213[var214]];
                        var215.field827 = var215.field827 + arg2 & 0x3FFF;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIIIIIIII)Z", line = 4240)
    private final boolean method2305(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field5706++;
        if (arg8 < arg0 && arg7 > arg8 && arg4 > arg8) {
            return false;
        } else if (arg0 < arg8 && arg8 > arg7 && arg8 > arg4) {
            return false;
        } else {
            if (arg3 <= 39) {
                this.field5702 = -114;
            }
            if (arg1 > arg6 && arg2 > arg6 && arg6 < arg5) {
                return false;
            } else {
                return arg6 <= arg1 || arg2 >= arg6 || arg5 >= arg6;
            }
        }
    }

    @OriginalMember(owner = "client!jc", name = "P", descriptor = "()V", line = 4265)
    public final void method193() {
        field5658++;
        for (int var1 = 0; var1 < this.field5699; var1++) {
            this.field5657[var1] = -this.field5657[var1];
        }
        for (int var2 = 0; var2 < this.field5616; var2++) {
            this.field5704[var2] = (short) (-this.field5704[var2]);
        }
        for (int var3 = 0; var3 < this.field5701; var3++) {
            short var4 = this.field5664[var3];
            this.field5664[var3] = this.field5676[var3];
            this.field5676[var3] = var4;
        }
        if (this.field5604 == null && this.field5695 != null) {
            this.field5695.field1021 = null;
        }
        if (this.field5604 != null) {
            this.field5604.field1021 = null;
        }
        if (this.field5623 != null) {
            this.field5623.field7454 = null;
        }
        if (this.field5660 != null) {
            this.field5660.field1021 = null;
        }
        this.field5677 = false;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(IZLjc;BZLjc;)Lba;", line = 4319)
    private final class352 method2306(int arg0, boolean arg1, class403 arg2, byte arg3, boolean arg4, class403 arg5) {
        arg5.field5668 = 0;
        arg5.field5701 = this.field5701;
        arg5.field5671 = this.field5671;
        arg5.field5699 = this.field5699;
        arg5.field5684 = arg0;
        arg5.field5667 = this.field5667;
        arg5.field5702 = this.field5702;
        arg5.field5692 = this.field5692;
        arg5.field5639 = this.field5639;
        field5655++;
        arg5.field5613 = this.field5613;
        arg5.field5616 = this.field5616;
        boolean var7 = class354.method2100(arg0, -1, this.field5692);
        boolean var8 = class469.method2670(this.field5692, (byte) -86, arg0);
        boolean var9 = class612.method3377(arg0, this.field5692, 111);
        boolean var10 = var8 | var7 | var9;
        if (var10) {
            if (!var7) {
                arg5.field5666 = this.field5666;
            } else if (arg2.field5666 == null || this.field5667 > arg2.field5666.length) {
                arg5.field5666 = arg2.field5666 = new int[this.field5667];
            } else {
                arg5.field5666 = arg2.field5666;
            }
            if (!var8) {
                arg5.field5694 = this.field5694;
            } else if (arg2.field5694 == null || this.field5667 > arg2.field5694.length) {
                arg5.field5694 = arg2.field5694 = new int[this.field5667];
            } else {
                arg5.field5694 = arg2.field5694;
            }
            if (!var9) {
                arg5.field5657 = this.field5657;
            } else if (arg2.field5657 == null || arg2.field5657.length < this.field5667) {
                arg5.field5657 = arg2.field5657 = new int[this.field5667];
            } else {
                arg5.field5657 = arg2.field5657;
            }
            for (int var11 = 0; var11 < this.field5667; var11++) {
                if (var7) {
                    arg5.field5666[var11] = this.field5666[var11];
                }
                if (var8) {
                    arg5.field5694[var11] = this.field5694[var11];
                }
                if (var9) {
                    arg5.field5657[var11] = this.field5657[var11];
                }
            }
        } else {
            arg5.field5694 = this.field5694;
            arg5.field5666 = this.field5666;
            arg5.field5657 = this.field5657;
        }
        if (class513.method2846(arg0, this.field5692, (byte) 102)) {
            if (arg1) {
                arg5.field5668 = (byte) (arg5.field5668 | 0x1);
            }
            arg5.field5660 = arg2.field5660;
            arg5.field5660.field1021 = this.field5660.field1021;
            arg5.field5660.field1022 = this.field5660.field1022;
        } else if (class265.method1616(arg0, 118, this.field5692)) {
            arg5.field5660 = this.field5660;
        } else {
            arg5.field5660 = null;
        }
        if (class45.method250(540800, this.field5692, arg0)) {
            if (arg2.field5626 == null || arg2.field5626.length < this.field5701) {
                arg5.field5626 = arg2.field5626 = new short[this.field5701];
            } else {
                arg5.field5626 = arg2.field5626;
            }
            for (int var12 = 0; var12 < this.field5701; var12++) {
                arg5.field5626[var12] = this.field5626[var12];
            }
        } else {
            arg5.field5626 = this.field5626;
        }
        if (class627.method3488(this.field5692, arg0, (byte) 94)) {
            if (arg2.field5636 == null || arg2.field5636.length < this.field5701) {
                arg5.field5636 = arg2.field5636 = new byte[this.field5701];
            } else {
                arg5.field5636 = arg2.field5636;
            }
            for (int var13 = 0; var13 < this.field5701; var13++) {
                arg5.field5636[var13] = this.field5636[var13];
            }
        } else {
            arg5.field5636 = this.field5636;
        }
        if (class298.method1859(this.field5692, 19308, arg0)) {
            if (arg1) {
                arg5.field5668 = (byte) (arg5.field5668 | 0x2);
            }
            arg5.field5695 = arg2.field5695;
            arg5.field5695.field1021 = this.field5695.field1021;
            arg5.field5695.field1022 = this.field5695.field1022;
        } else if (class67.method545(true, this.field5692, arg0)) {
            arg5.field5695 = this.field5695;
        } else {
            arg5.field5695 = null;
        }
        if (class233.method1473(-110, arg0, this.field5692)) {
            if (arg2.field5661 == null || this.field5616 > arg2.field5661.length) {
                int var14 = this.field5616;
                arg5.field5704 = arg2.field5704 = new short[var14];
                arg5.field5659 = arg2.field5659 = new short[var14];
                arg5.field5661 = arg2.field5661 = new short[var14];
            } else {
                arg5.field5661 = arg2.field5661;
                arg5.field5704 = arg2.field5704;
                arg5.field5659 = arg2.field5659;
            }
            if (this.field5687 == null) {
                for (int var18 = 0; var18 < this.field5616; var18++) {
                    arg5.field5661[var18] = this.field5661[var18];
                    arg5.field5659[var18] = this.field5659[var18];
                    arg5.field5704[var18] = this.field5704[var18];
                }
            } else {
                if (arg2.field5687 == null) {
                    arg2.field5687 = new class195();
                }
                class195 var15 = arg5.field5687 = arg2.field5687;
                if (var15.field2884 == null || var15.field2884.length < this.field5616) {
                    int var16 = this.field5616;
                    var15.field2886 = new byte[var16];
                    var15.field2885 = new short[var16];
                    var15.field2884 = new short[var16];
                    var15.field2882 = new short[var16];
                }
                for (int var17 = 0; var17 < this.field5616; var17++) {
                    arg5.field5661[var17] = this.field5661[var17];
                    arg5.field5659[var17] = this.field5659[var17];
                    arg5.field5704[var17] = this.field5704[var17];
                    var15.field2884[var17] = this.field5687.field2884[var17];
                    var15.field2882[var17] = this.field5687.field2882[var17];
                    var15.field2885[var17] = this.field5687.field2885[var17];
                    var15.field2886[var17] = this.field5687.field2886[var17];
                }
            }
            arg5.field5640 = this.field5640;
        } else {
            arg5.field5661 = this.field5661;
            arg5.field5659 = this.field5659;
            arg5.field5704 = this.field5704;
            arg5.field5640 = this.field5640;
            arg5.field5687 = this.field5687;
        }
        if (class662.method3670(arg0, this.field5692, (byte) 94)) {
            arg5.field5604 = arg2.field5604;
            if (arg1) {
                arg5.field5668 = (byte) (arg5.field5668 | 0x4);
            }
            arg5.field5604.field1021 = this.field5604.field1021;
            arg5.field5604.field1022 = this.field5604.field1022;
        } else if (class602.method3339(this.field5692, 55, arg0)) {
            arg5.field5604 = this.field5604;
        } else {
            arg5.field5604 = null;
        }
        if (class186.method1243(1, arg0, this.field5692)) {
            if (arg2.field5603 == null || this.field5701 > arg2.field5603.length) {
                int var19 = this.field5616;
                arg5.field5603 = arg2.field5603 = new float[var19];
                arg5.field5632 = arg2.field5632 = new float[var19];
            } else {
                arg5.field5632 = arg2.field5632;
                arg5.field5603 = arg2.field5603;
            }
            for (int var20 = 0; var20 < this.field5616; var20++) {
                arg5.field5603[var20] = this.field5603[var20];
                arg5.field5632[var20] = this.field5632[var20];
            }
        } else {
            arg5.field5632 = this.field5632;
            arg5.field5603 = this.field5603;
        }
        if (class638.method3561(this.field5692, (byte) 86, arg0)) {
            arg5.field5614 = arg2.field5614;
            if (arg1) {
                arg5.field5668 = (byte) (arg5.field5668 | 0x8);
            }
            arg5.field5614.field1022 = this.field5614.field1022;
            arg5.field5614.field1021 = this.field5614.field1021;
        } else if (class85.method655(this.field5692, 28238, arg0)) {
            arg5.field5614 = this.field5614;
        } else {
            arg5.field5614 = null;
        }
        if (class683.method3767(arg0, this.field5692, (byte) 103)) {
            if (arg2.field5664 == null || arg2.field5664.length < this.field5701) {
                int var21 = this.field5701;
                arg5.field5664 = arg2.field5664 = new short[var21];
                arg5.field5676 = arg2.field5676 = new short[var21];
                arg5.field5680 = arg2.field5680 = new short[var21];
            } else {
                arg5.field5680 = arg2.field5680;
                arg5.field5664 = arg2.field5664;
                arg5.field5676 = arg2.field5676;
            }
            for (int var22 = 0; var22 < this.field5701; var22++) {
                arg5.field5664[var22] = this.field5664[var22];
                arg5.field5680[var22] = this.field5680[var22];
                arg5.field5676[var22] = this.field5676[var22];
            }
        } else {
            arg5.field5664 = this.field5664;
            arg5.field5680 = this.field5680;
            arg5.field5676 = this.field5676;
        }
        if (class92.method684(-1, arg0, this.field5692)) {
            if (arg1) {
                arg5.field5668 = (byte) (arg5.field5668 | 0x10);
            }
            arg5.field5623 = arg2.field5623;
            arg5.field5623.field7454 = this.field5623.field7454;
        } else if (class395.method2251((byte) -63, arg0, this.field5692)) {
            arg5.field5623 = this.field5623;
        } else {
            arg5.field5623 = null;
        }
        if (class385.method2214(true, this.field5692, arg0)) {
            if (arg2.field5645 == null || arg2.field5645.length < this.field5701) {
                int var23 = this.field5701;
                arg5.field5645 = arg2.field5645 = new short[var23];
            } else {
                arg5.field5645 = arg2.field5645;
            }
            for (int var24 = 0; var24 < this.field5701; var24++) {
                arg5.field5645[var24] = this.field5645[var24];
            }
        } else {
            arg5.field5645 = this.field5645;
        }
        if (!class231.method1464(arg0, (byte) -52, this.field5692)) {
            arg5.field5650 = this.field5650;
        } else if (arg2.field5650 == null || this.field5613 > arg2.field5650.length) {
            int var26 = this.field5613;
            arg5.field5650 = arg2.field5650 = new class62[var26];
            for (int var27 = 0; var27 < this.field5613; var27++) {
                arg5.field5650[var27] = this.field5650[var27].method509(-18142);
            }
        } else {
            arg5.field5650 = arg2.field5650;
            for (int var25 = 0; var25 < this.field5613; var25++) {
                arg5.field5650[var25].method512(this.field5650[var25], -18728);
            }
        }
        arg5.field5681 = this.field5681;
        arg5.field5646 = this.field5646;
        arg5.field5656 = this.field5656;
        arg5.field5647 = this.field5647;
        arg5.field5693 = this.field5693;
        if (arg3 <= 123) {
            this.field5657 = null;
        }
        if (this.field5677) {
            arg5.field5674 = this.field5674;
            arg5.field5707 = this.field5707;
            arg5.field5627 = this.field5627;
            arg5.field5677 = true;
            arg5.field5628 = this.field5628;
            arg5.field5641 = this.field5641;
            arg5.field5644 = this.field5644;
            arg5.field5697 = this.field5697;
        } else {
            arg5.field5677 = false;
        }
        arg5.field5665 = this.field5665;
        arg5.field5617 = this.field5617;
        arg5.field5653 = this.field5653;
        arg5.field5669 = this.field5669;
        arg5.field5629 = this.field5629;
        arg5.field5634 = this.field5634;
        return arg5;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(II[BIZBILen;)Lan;", line = 4783)
    public static final class22 method2307(int arg0, int arg1, byte[] arg2, int arg3, boolean arg4, byte arg5, int arg6, class289 arg7) {
        field5689++;
        if (arg5 != -97) {
            method2308(true, null, -8, false);
        }
        if (!arg7.field4292 && (!class17.method89(arg1, arg5 ^ 0xE1B361F1) || !class17.method89(arg6, 508337774))) {
            return arg7.field4335 ? new class22(arg7, 34037, arg3, arg1, arg6, arg4, arg2, arg0) : new class22(arg7, arg3, arg1, arg6, class350.method2082(-78, arg1), class350.method2082(-114, arg6), arg2, arg0);
        } else {
            return new class22(arg7, 3553, arg3, arg1, arg6, arg4, arg2, arg0);
        }
    }

    @OriginalMember(owner = "client!jc", name = "u", descriptor = "()I", line = 4803)
    public final int method227() {
        field5686++;
        return this.field5702;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(ZLjava/lang/String;IZ)I", line = 4821)
    public static final int method2308(boolean arg0, String arg1, int arg2, boolean arg3) {
        field5609++;
        if (arg2 < 2 || arg2 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg2);
        }
        boolean var4 = false;
        boolean var5 = false;
        if (!arg3) {
            method2303(-64);
        }
        int var6 = 0;
        int var7 = arg1.length();
        for (int var8 = 0; var8 < var7; var8++) {
            char var9 = arg1.charAt(var8);
            if (var8 == 0) {
                if (var9 == '-') {
                    var4 = true;
                    continue;
                }
                if (var9 == '+' && arg0) {
                    continue;
                }
            }
            int var11;
            if (var9 >= '0' && var9 <= '9') {
                var11 = var9 - '0';
            } else if (var9 >= 'A' && var9 <= 'Z') {
                var11 = var9 - '7';
            } else if (var9 >= 'a' && var9 <= 'z') {
                var11 = var9 - 'W';
            } else {
                throw new NumberFormatException();
            }
            if (var11 >= arg2) {
                throw new NumberFormatException();
            }
            if (var4) {
                var11 = -var11;
            }
            int var10 = arg2 * var6 + var11;
            if ((var10 / arg2) != var6) {
                throw new NumberFormatException();
            }
            var5 = true;
            var6 = var10;
        }
        if (!var5) {
            throw new NumberFormatException();
        }
        return var6;
    }

    @OriginalMember(owner = "client!jc", name = "V", descriptor = "(I)V", line = 4902)
    public final void method188(int arg0) {
        field5635++;
        int var2 = class675.field9542[arg0];
        int var3 = class675.field9541[arg0];
        for (int var4 = 0; var4 < this.field5699; var4++) {
            int var7 = this.field5666[var4] * var3 + this.field5657[var4] * var2 >> 14;
            this.field5657[var4] = this.field5657[var4] * var3 - (this.field5666[var4] * var2) >> 14;
            this.field5666[var4] = var7;
        }
        for (int var5 = 0; var5 < this.field5616; var5++) {
            int var6 = this.field5704[var5] * var2 + (this.field5661[var5] * var3) >> 14;
            this.field5704[var5] = (short) (this.field5704[var5] * var3 - (this.field5661[var5] * var2) >> 14);
            this.field5661[var5] = (short) var6;
        }
        if (this.field5604 == null && this.field5695 != null) {
            this.field5695.field1021 = null;
        }
        if (this.field5604 != null) {
            this.field5604.field1021 = null;
        }
        if (this.field5660 != null) {
            this.field5660.field1021 = null;
        }
        this.field5677 = false;
    }

    @OriginalMember(owner = "client!jc", name = "ia", descriptor = "(I)V", line = 4950)
    public final void method216(int arg0) {
        this.field5684 = arg0;
        field5678++;
        if (this.field5687 != null && (this.field5684 & 0x10000) == 0) {
            this.field5640 = this.field5687.field2886;
            this.field5704 = this.field5687.field2885;
            this.field5661 = this.field5687.field2884;
            this.field5659 = this.field5687.field2882;
            this.field5687 = null;
        }
        this.field5663 = true;
        this.method2299(false);
    }

    @OriginalMember(owner = "client!jc", name = "c", descriptor = "(I)V", line = 4972)
    private final void method2309(int arg0) {
        field5631++;
        if (this.field5671 == 0) {
            return;
        }
        if (this.field5668 != 0) {
            this.method2296(false, true);
        }
        if (arg0 < 80) {
            this.method196();
        }
        this.method2296(false, false);
        if (this.field5623 != null) {
            if (this.field5623.field7454 == null) {
                this.method2297((this.field5668 & 0x10) != 0, 6);
            }
            if (this.field5623.field7454 != null) {
                this.field5662.method1777(this.field5604 != null, 104);
                this.field5662.method1744(this.field5660, (byte) -110, this.field5614, this.field5695, this.field5604);
                int var2 = this.field5646.length - 1;
                for (int var3 = 0; var3 < var2; var3++) {
                    int var4 = this.field5646[var3];
                    int var5 = this.field5646[var3 + 1];
                    int var6 = this.field5645[var4] & 0xFFFF;
                    if (var6 == 65535) {
                        var6 = -1;
                    }
                    this.field5662.method1760(false, this.field5604 != null, var6);
                    this.field5662.method1822((var5 - var4) * 3, this.field5623.field7454, var4 * 3, (byte) 63, 4);
                }
            }
        }
        this.method2299(false);
    }

    @OriginalMember(owner = "client!jc", name = "OA", descriptor = "(IILd;Ld;III)V", line = 5031)
    public final void method187(int arg0, int arg1, class136 arg2, class136 arg3, int arg4, int arg5, int arg6) {
        field5643++;
        if (!this.field5677) {
            this.method2301(1);
        }
        int var8 = this.field5627 + arg4;
        int var9 = this.field5697 + arg4;
        int var10 = this.field5644 + arg6;
        int var11 = this.field5674 + arg6;
        if (arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5 && var8 < 0 || (arg2.field1919 + var9 >> arg2.field1921) >= arg2.field1918 || var10 < 0 || (arg2.field1919 + var11 >> arg2.field1921) >= arg2.field1916) {
            return;
        }
        if (arg0 == 4 || arg0 == 5) {
            if (arg3 == null) {
                return;
            }
            if (var8 < 0 || arg3.field1919 + var9 >> arg3.field1921 >= arg3.field1918 || var10 < 0 || var11 + arg3.field1919 >> arg3.field1921 >= arg3.field1916) {
                return;
            }
        } else {
            int var12 = var8 >> arg2.field1921;
            int var13 = arg2.field1919 + var9 - 1 >> arg2.field1921;
            int var14 = var10 >> arg2.field1921;
            int var15 = arg2.field1919 + var11 - 1 >> arg2.field1921;
            if (arg2.method273(var12, var14) == arg5 && arg5 == arg2.method273(var13, var14) && arg5 == arg2.method273(var12, var15) && arg5 == arg2.method273(var13, var15)) {
                return;
            }
        }
        if (arg0 == 1) {
            for (int var32 = 0; var32 < this.field5699; var32++) {
                this.field5694[var32] = this.field5694[var32] + arg2.method267(this.field5666[var32] + arg4, this.field5657[var32] - -arg6) - arg5;
            }
        } else if (arg0 == 2) {
            short var16 = this.field5641;
            if (var16 == 0) {
                return;
            }
            for (int var17 = 0; var17 < this.field5699; var17++) {
                int var18 = (this.field5694[var17] << 16) / var16;
                if (var18 < arg1) {
                    this.field5694[var17] += (arg1 - var18) * (arg2.method267(this.field5666[var17] + arg4, this.field5657[var17] + arg6) - arg5) / arg1;
                }
            }
        } else if (arg0 == 3) {
            int var28 = (arg1 & 0xFF) * 4;
            int var29 = ((arg1 & 0xFF6A) >> 8) * 4;
            int var30 = arg1 >> 16 & 0xFF << 6;
            int var31 = arg1 >> 24 & 0xFF << 6;
            if (arg4 - (var28 >> 1) < 0 || (arg2.field1918 << arg2.field1921) <= ((var28 >> 1) + arg4 + arg2.field1919) || arg6 - (var29 >> 1) < 0 || (arg2.field1916 << arg2.field1921) <= ((var29 >> 1) + arg2.field1919 + arg6)) {
                return;
            }
            this.method2091(arg4, arg5, var30, arg6, var31, var29, -52, var28, arg2);
        } else if (arg0 == 4) {
            int var19 = this.field5628 - this.field5641;
            for (int var20 = 0; var20 < this.field5699; var20++) {
                this.field5694[var20] -= -arg3.method267(this.field5666[var20] + arg4, this.field5657[var20] + arg6) - (var19 - arg5);
            }
        } else if (arg0 == 5) {
            int var21 = this.field5628 - this.field5641;
            for (int var22 = 0; var22 < this.field5699; var22++) {
                int var23 = this.field5666[var22] + arg4;
                int var24 = this.field5657[var22] + arg6;
                int var25 = arg2.method267(var23, var24);
                int var26 = arg3.method267(var23, var24);
                int var27 = var25 - var26 - arg1;
                this.field5694[var22] = ((this.field5694[var22] << 8) / var21 * var27 >> 8) - (arg5 - var25);
            }
        }
        this.field5677 = false;
        if (this.field5660 != null) {
            this.field5660.field1021 = null;
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIII)V", line = 5193)
    public final void method186(int arg0, int arg1, int arg2, int arg3) {
        field5620++;
        for (int var5 = 0; var5 < this.field5701; var5++) {
            int var9 = this.field5626[var5] & 0xFFFF;
            int var10 = var9 >> 10 & 0x3F;
            int var11 = var9 >> 7 & 0x7;
            if (arg1 != -1) {
                var11 += (arg1 - var11) * arg3 >> 7;
            }
            int var12 = var9 & 0x7F;
            if (arg0 != -1) {
                var10 += (arg0 - var10) * arg3 >> 7;
            }
            if (arg2 != -1) {
                var12 += (arg2 - var12) * arg3 >> 7;
            }
            this.field5626[var5] = (short) class266.method1624(var12, class266.method1624(var10 << 10, var11 << 7));
        }
        if (this.field5647 != null) {
            for (int var6 = 0; var6 < this.field5613; var6++) {
                class384 var7 = this.field5647[var6];
                class62 var8 = this.field5650[var6];
                var8.field824 = class35.field433[this.field5626[var7.field5376] & 0xFFFF] & 0xFFFFFF | var8.field824 & 0xFF000000;
            }
        }
        if (this.field5695 != null) {
            this.field5695.field1021 = null;
        }
    }

    @OriginalMember(owner = "client!jc", name = "I", descriptor = "(I)V", line = 5254)
    public final void method225(int arg0) {
        field5682++;
        int var2 = class675.field9542[arg0];
        int var3 = class675.field9541[arg0];
        for (int var4 = 0; var4 < this.field5699; var4++) {
            int var5 = this.field5666[var4] * var3 + this.field5657[var4] * var2 >> 14;
            this.field5657[var4] = this.field5657[var4] * var3 - (this.field5666[var4] * var2) >> 14;
            this.field5666[var4] = var5;
        }
        if (this.field5660 != null) {
            this.field5660.field1021 = null;
        }
        this.field5677 = false;
    }

    @OriginalMember(owner = "client!jc", name = "l", descriptor = "(III)V", line = 5310)
    public final void method217(int arg0, int arg1, int arg2) {
        field5649++;
        for (int var4 = 0; var4 < this.field5699; var4++) {
            if (arg0 != 128) {
                this.field5666[var4] = this.field5666[var4] * arg0 >> 7;
            }
            if (arg1 != 128) {
                this.field5694[var4] = this.field5694[var4] * arg1 >> 7;
            }
            if (arg2 != 128) {
                this.field5657[var4] = this.field5657[var4] * arg2 >> 7;
            }
        }
        this.field5677 = false;
        if (this.field5660 != null) {
            this.field5660.field1021 = null;
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(Lq;Lrc;I)V", line = 5345)
    public final void method205(class391 arg0, class494 arg1, int arg2) {
        field5612++;
        if (this.field5616 == 0) {
            return;
        }
        class524 var4 = this.field5662.field4303;
        if (!this.field5677) {
            this.method2301(1);
        }
        class524 var5 = (class524) arg0;
        class614.field8508 = var4.field7155 * var5.field7141 + var4.field7152 * var5.field7153 + var4.field7126 * var5.field7128 + var4.field7141;
        class437.field6170 = var4.field7155 * var5.field7152 + var4.field7152 * var5.field7145 + var4.field7126 * var5.field7127;
        float var6 = (float) this.field5641 * class437.field6170 + class614.field8508;
        float var7 = (float) this.field5628 * class437.field6170 + class614.field8508;
        float var8;
        float var9;
        if ((var7 < var6)) {
            var9 = (float) this.field5707 + var6;
            var8 = (float) (-this.field5707) + var7;
        } else {
            var8 = (float) (-this.field5707) + var6;
            var9 = (float) this.field5707 + var7;
        }
        if ((var8 >= this.field5662.field4328) || (var9 <= (float) this.field5662.field4354)) {
            return;
        }
        class535.field7277 = var4.field7151 * var5.field7141 + var4.field7134 * var5.field7128 + var4.field7127 * var5.field7153 + var4.field7128;
        class623.field8694 = var4.field7151 * var5.field7152 + var4.field7134 * var5.field7127 + var4.field7127 * var5.field7145;
        float var10 = (float) this.field5641 * class623.field8694 + class535.field7277;
        float var11 = (float) this.field5628 * class623.field8694 + class535.field7277;
        float var12;
        float var13;
        if ((var11 < var10)) {
            var12 = ((float) this.field5707 + var10) * (float) this.field5662.field4318;
            var13 = (var11 - (float) this.field5707) * (float) this.field5662.field4318;
        } else {
            var12 = ((float) this.field5707 + var11) * (float) this.field5662.field4318;
            var13 = ((float) (-this.field5707) + var10) * (float) this.field5662.field4318;
        }
        if ((this.field5662.field4272 <= var13 / var9) || (this.field5662.field4352 >= var12 / var9)) {
            return;
        }
        class691.field9708 = var4.field7133 * var5.field7152 + var4.field7145 * var5.field7145 + var4.field7138 * var5.field7127;
        class230.field3285 = var4.field7133 * var5.field7141 + var4.field7145 * var5.field7153 + var4.field7138 * var5.field7128 + var4.field7153;
        float var14 = (float) this.field5641 * class691.field9708 + class230.field3285;
        float var15 = (float) this.field5628 * class691.field9708 + class230.field3285;
        float var16;
        float var17;
        if ((var14 > var15)) {
            var17 = ((float) this.field5707 + var14) * (float) this.field5662.field4330;
            var16 = ((float) (-this.field5707) + var15) * (float) this.field5662.field4330;
        } else {
            var16 = ((float) (-this.field5707) + var14) * (float) this.field5662.field4330;
            var17 = ((float) this.field5707 + var15) * (float) this.field5662.field4330;
        }
        if ((this.field5662.field4274 <= var16 / var9) || (this.field5662.field4322 >= var17 / var9)) {
            return;
        }
        if (arg1 != null || this.field5647 != null) {
            class165.field2511 = var4.field7155 * var5.field7155 + var4.field7152 * var5.field7133 + var4.field7126 * var5.field7151;
            class604.field8395 = var4.field7151 * var5.field7126 + var4.field7134 * var5.field7134 + var4.field7127 * var5.field7138;
            class396.field5506 = var4.field7155 * var5.field7126 + var4.field7152 * var5.field7138 + var4.field7126 * var5.field7134;
            class681.field9595 = var4.field7133 * var5.field7126 + var4.field7145 * var5.field7138 + var4.field7138 * var5.field7134;
            class144.field2138 = var4.field7133 * var5.field7155 + var4.field7145 * var5.field7133 + var4.field7138 * var5.field7151;
            class124.field1727 = var4.field7151 * var5.field7155 + var4.field7134 * var5.field7151 + var4.field7127 * var5.field7133;
        }
        if (arg1 != null) {
            boolean var18 = false;
            boolean var19 = true;
            int var20 = this.field5627 + this.field5697 >> 1;
            int var21 = this.field5674 + this.field5644 >> 1;
            int var22 = (int) ((float) var21 * class124.field1727 + (float) this.field5641 * class623.field8694 + (float) var20 * class604.field8395 + class535.field7277);
            int var23 = (int) ((float) var21 * class144.field2138 + (float) this.field5641 * class691.field9708 + (float) var20 * class681.field9595 + class230.field3285);
            int var24 = (int) ((float) var21 * class165.field2511 + (float) this.field5641 * class437.field6170 + (float) var20 * class396.field5506 + class614.field8508);
            if (this.field5662.field4354 > var24) {
                var18 = true;
            } else {
                arg1.field6809 = this.field5662.field4330 * var23 / var24 + this.field5662.field4269;
                arg1.field6810 = this.field5662.field4318 * var22 / var24 + this.field5662.field4337;
            }
            int var25 = (int) ((float) var21 * class124.field1727 + (float) this.field5628 * class623.field8694 + (float) var20 * class604.field8395 + class535.field7277);
            int var26 = (int) ((float) var21 * class144.field2138 + (float) this.field5628 * class691.field9708 + (float) var20 * class681.field9595 + class230.field3285);
            int var27 = (int) ((float) var21 * class165.field2511 + (float) this.field5628 * class437.field6170 + (float) var20 * class396.field5506 + class614.field8508);
            if (this.field5662.field4354 > var27) {
                var18 = true;
            } else {
                arg1.field6812 = this.field5662.field4330 * var26 / var27 + this.field5662.field4269;
                arg1.field6811 = this.field5662.field4337 + (this.field5662.field4318 * var25 / var27);
            }
            if (var18) {
                if (this.field5662.field4354 > var24 && this.field5662.field4354 > var27) {
                    var19 = false;
                } else if (var24 < this.field5662.field4354) {
                    int var28 = (var27 - this.field5662.field4354 << 16) / (var27 - var24);
                    int var29 = ((var25 - var22) * var28 >> 16) + var25;
                    arg1.field6810 = this.field5662.field4337 + (this.field5662.field4318 * var29 / this.field5662.field4354);
                    int var30 = var26 + ((var26 - var23) * var28 >> 16);
                    arg1.field6809 = this.field5662.field4330 * var30 / this.field5662.field4354 + this.field5662.field4269;
                } else if (this.field5662.field4354 > var27) {
                    int var31 = (var24 - this.field5662.field4354 << 16) / (var24 - var27);
                    int var32 = ((var22 - var25) * var31 >> 16) + var22;
                    arg1.field6810 = this.field5662.field4318 * var32 / this.field5662.field4354 + this.field5662.field4337;
                    int var33 = var23 + ((var23 - var26) * var31 >> 16);
                    arg1.field6809 = this.field5662.field4330 * var33 / this.field5662.field4354 + this.field5662.field4269;
                }
            }
            if (var19) {
                arg1.field6808 = true;
                if (var27 >= var24) {
                    arg1.field6807 = this.field5662.field4337 + ((var25 + this.field5707) * this.field5662.field4318 / var27) - arg1.field6811;
                } else {
                    arg1.field6807 = (this.field5707 + var22) * this.field5662.field4318 / var24 + this.field5662.field4337 - arg1.field6810;
                }
            }
        }
        this.field5662.method1800(false);
        this.field5662.method1787(var5, false);
        this.method2309(103);
        this.field5662.method1753((byte) 90);
        this.method2298(true);
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "()[Lbh;", line = 5546)
    public final class34[] method221() {
        field5608++;
        return this.field5656;
    }

    @OriginalMember(owner = "client!jc", name = "h", descriptor = "()I", line = 5557)
    public final int method189() {
        field5599++;
        return this.field5684;
    }

    @OriginalMember(owner = "client!jc", name = "m", descriptor = "(III)V", line = 5571)
    public final void method224(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field5699; var4++) {
            if (arg0 != 0) {
                this.field5666[var4] += arg0;
            }
            if (arg1 != 0) {
                this.field5694[var4] += arg1;
            }
            if (arg2 != 0) {
                this.field5657[var4] += arg2;
            }
        }
        field5642++;
        if (this.field5660 != null) {
            this.field5660.field1021 = null;
        }
        this.field5677 = false;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(BLmv;)V", line = 5615)
    private final void method2310(byte arg0, class341 arg1) {
        field5602++;
        if (this.field5616 > this.field5662.field4368.length) {
            this.field5662.field4368 = new int[this.field5616];
            this.field5662.field4366 = new int[this.field5616];
        }
        int[] var3 = this.field5662.field4368;
        int[] var4 = this.field5662.field4366;
        for (int var5 = 0; var5 < this.field5699; var5++) {
            int var16 = (this.field5666[var5] - (this.field5694[var5] * this.field5662.field4357 >> 8) >> this.field5662.field4219) - arg1.field4955;
            int var17 = (this.field5657[var5] - (this.field5694[var5] * this.field5662.field4248 >> 8) >> this.field5662.field4219) - arg1.field4948;
            int var18 = this.field5653[var5];
            int var19 = this.field5653[var5 + 1];
            for (int var20 = var18; var20 < var19; var20++) {
                int var21 = this.field5665[var20] - 1;
                if (var21 == -1) {
                    break;
                }
                var3[var21] = var16;
                var4[var21] = var17;
            }
        }
        for (int var6 = 0; var6 < this.field5671; var6++) {
            if (this.field5636 == null || this.field5636[var6] <= 128) {
                short var7 = this.field5664[var6];
                short var8 = this.field5680[var6];
                short var9 = this.field5676[var6];
                int var10 = var3[var7];
                int var11 = var3[var8];
                int var12 = var3[var9];
                int var13 = var4[var7];
                int var14 = var4[var8];
                int var15 = var4[var9];
                if ((var14 - var15) * (var10 - var11) - (var14 - var13) * (var12 - var11) > 0) {
                    arg1.method2041(var12, var15, (byte) -20, var11, var14, var13, var10);
                }
            }
        }
        if (arg0 != 101) {
            this.field5668 = -44;
        }
    }
}
