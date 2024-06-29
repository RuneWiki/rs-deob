import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!de")
public class class375 extends class395 {

    @OriginalMember(owner = "client!de", name = "Nb", descriptor = "[I")
    private int[] field5604;

    @OriginalMember(owner = "client!de", name = "kc", descriptor = "I")
    private int field5627;

    @OriginalMember(owner = "client!de", name = "B", descriptor = "I")
    private int field5540;

    @OriginalMember(owner = "client!de", name = "Pb", descriptor = "I")
    private int field5606;

    @OriginalMember(owner = "client!de", name = "N", descriptor = "[I")
    private int[] field5552;

    @OriginalMember(owner = "client!de", name = "Lc", descriptor = "[I")
    private int[] field5654;

    @OriginalMember(owner = "client!de", name = "u", descriptor = "I")
    private int field5533;

    @OriginalMember(owner = "client!de", name = "qb", descriptor = "[S")
    private short[] field5581;

    @OriginalMember(owner = "client!de", name = "ob", descriptor = "[I")
    private int[] field5579;

    @OriginalMember(owner = "client!de", name = "Ec", descriptor = "I")
    private int field5647;

    @OriginalMember(owner = "client!de", name = "hc", descriptor = "[Lil;")
    private class586[] field5624;

    @OriginalMember(owner = "client!de", name = "ub", descriptor = "[Lrca;")
    private class30[] field5585;

    @OriginalMember(owner = "client!de", name = "xc", descriptor = "I")
    private int field5640;

    @OriginalMember(owner = "client!de", name = "jb", descriptor = "[Lmga;")
    private class339[] field5574;

    @OriginalMember(owner = "client!de", name = "rc", descriptor = "[Lnga;")
    private class240[] field5634;

    @OriginalMember(owner = "client!de", name = "kb", descriptor = "[S")
    private short[] field5575;

    @OriginalMember(owner = "client!de", name = "mb", descriptor = "[S")
    private short[] field5577;

    @OriginalMember(owner = "client!de", name = "yb", descriptor = "[S")
    private short[] field5589;

    @OriginalMember(owner = "client!de", name = "G", descriptor = "[S")
    private short[] field5545;

    @OriginalMember(owner = "client!de", name = "yc", descriptor = "[S")
    private short[] field5641;

    @OriginalMember(owner = "client!de", name = "zc", descriptor = "[B")
    private byte[] field5642;

    @OriginalMember(owner = "client!de", name = "Sb", descriptor = "S")
    private short field5609;

    @OriginalMember(owner = "client!de", name = "ec", descriptor = "[F")
    private float[] field5621;

    @OriginalMember(owner = "client!de", name = "F", descriptor = "[S")
    private short[] field5544;

    @OriginalMember(owner = "client!de", name = "Dc", descriptor = "[B")
    private byte[] field5646;

    @OriginalMember(owner = "client!de", name = "Gc", descriptor = "[S")
    private short[] field5649;

    @OriginalMember(owner = "client!de", name = "Bb", descriptor = "[S")
    private short[] field5592;

    @OriginalMember(owner = "client!de", name = "mc", descriptor = "[F")
    private float[] field5629;

    @OriginalMember(owner = "client!de", name = "Eb", descriptor = "[S")
    private short[] field5595;

    @OriginalMember(owner = "client!de", name = "s", descriptor = "[S")
    private short[] field5531;

    @OriginalMember(owner = "client!de", name = "Mb", descriptor = "[S")
    private short[] field5603;

    @OriginalMember(owner = "client!de", name = "lb", descriptor = "[S")
    private short[] field5576;

    @OriginalMember(owner = "client!de", name = "Cb", descriptor = "S")
    private short field5593;

    @OriginalMember(owner = "client!de", name = "Jb", descriptor = "[I")
    private int[] field5600;

    @OriginalMember(owner = "client!de", name = "D", descriptor = "[I")
    private int[] field5542;

    @OriginalMember(owner = "client!de", name = "I", descriptor = "[I")
    private int[] field5547;

    @OriginalMember(owner = "client!de", name = "y", descriptor = "I")
    private int field5537;

    @OriginalMember(owner = "client!de", name = "Ob", descriptor = "I")
    private int field5605;

    @OriginalMember(owner = "client!de", name = "fc", descriptor = "[[I")
    private int[][] field5622;

    @OriginalMember(owner = "client!de", name = "Mc", descriptor = "[[I")
    private int[][] field5655;

    @OriginalMember(owner = "client!de", name = "Q", descriptor = "[[I")
    private int[][] field5555;

    @OriginalMember(owner = "client!de", name = "Kb", descriptor = "Z")
    private boolean field5601;

    @OriginalMember(owner = "client!de", name = "vb", descriptor = "Z")
    private boolean field5586;

    @OriginalMember(owner = "client!de", name = "nb", descriptor = "Z")
    private boolean field5578;

    @OriginalMember(owner = "client!de", name = "dc", descriptor = "Z")
    private boolean field5620;

    @OriginalMember(owner = "client!de", name = "Wb", descriptor = "Lum;")
    private class528 field5613;

    @OriginalMember(owner = "client!de", name = "zb", descriptor = "Lep;")
    private class446 field5590;

    @OriginalMember(owner = "client!de", name = "Hb", descriptor = "Lep;")
    private class446 field5598;

    @OriginalMember(owner = "client!de", name = "db", descriptor = "Lep;")
    private class446 field5568;

    @OriginalMember(owner = "client!de", name = "qc", descriptor = "Lep;")
    private class446 field5633;

    @OriginalMember(owner = "client!de", name = "z", descriptor = "Lok;")
    private class229 field5538;

    @OriginalMember(owner = "client!de", name = "oc", descriptor = "I")
    public static int field5631 = 100;

    @OriginalMember(owner = "client!de", name = "E", descriptor = "Liba;")
    public static class211 field5543 = new class211(31, 16);

    @OriginalMember(owner = "client!de", name = "Pc", descriptor = "Ljava/lang/String;")
    public static String field5658 = null;

    @OriginalMember(owner = "client!de", name = "Sc", descriptor = "[F")
    public static float[] field5661 = new float[16];

    @OriginalMember(owner = "client!de", name = "q", descriptor = "I")
    public static int field5529;

    @OriginalMember(owner = "client!de", name = "r", descriptor = "I")
    public static int field5530;

    @OriginalMember(owner = "client!de", name = "t", descriptor = "I")
    private int field5532;

    @OriginalMember(owner = "client!de", name = "v", descriptor = "I")
    public static int field5534;

    @OriginalMember(owner = "client!de", name = "w", descriptor = "I")
    public static int field5535;

    @OriginalMember(owner = "client!de", name = "x", descriptor = "I")
    public static int field5536;

    @OriginalMember(owner = "client!de", name = "A", descriptor = "I")
    public static int field5539;

    @OriginalMember(owner = "client!de", name = "C", descriptor = "I")
    public static int field5541;

    @OriginalMember(owner = "client!de", name = "H", descriptor = "I")
    public static int field5546;

    @OriginalMember(owner = "client!de", name = "J", descriptor = "I")
    public static int field5548;

    @OriginalMember(owner = "client!de", name = "K", descriptor = "I")
    public static int field5549;

    @OriginalMember(owner = "client!de", name = "L", descriptor = "I")
    public static int field5550;

    @OriginalMember(owner = "client!de", name = "M", descriptor = "I")
    public static int field5551;

    @OriginalMember(owner = "client!de", name = "O", descriptor = "I")
    public static int field5553;

    @OriginalMember(owner = "client!de", name = "P", descriptor = "I")
    public static int field5554;

    @OriginalMember(owner = "client!de", name = "R", descriptor = "I")
    public static int field5556;

    @OriginalMember(owner = "client!de", name = "S", descriptor = "I")
    public static int field5557;

    @OriginalMember(owner = "client!de", name = "U", descriptor = "I")
    private int field5559;

    @OriginalMember(owner = "client!de", name = "V", descriptor = "I")
    public static int field5560;

    @OriginalMember(owner = "client!de", name = "W", descriptor = "I")
    public static int field5561;

    @OriginalMember(owner = "client!de", name = "X", descriptor = "I")
    public static int field5562;

    @OriginalMember(owner = "client!de", name = "Y", descriptor = "I")
    public static int field5563;

    @OriginalMember(owner = "client!de", name = "Z", descriptor = "I")
    public static int field5564;

    @OriginalMember(owner = "client!de", name = "ab", descriptor = "I")
    public static int field5565;

    @OriginalMember(owner = "client!de", name = "bb", descriptor = "I")
    public static int field5566;

    @OriginalMember(owner = "client!de", name = "cb", descriptor = "I")
    public static int field5567;

    @OriginalMember(owner = "client!de", name = "eb", descriptor = "I")
    public static int field5569;

    @OriginalMember(owner = "client!de", name = "fb", descriptor = "I")
    public static int field5570;

    @OriginalMember(owner = "client!de", name = "gb", descriptor = "I")
    public static int field5571;

    @OriginalMember(owner = "client!de", name = "hb", descriptor = "I")
    private int field5572;

    @OriginalMember(owner = "client!de", name = "ib", descriptor = "I")
    public static int field5573;

    @OriginalMember(owner = "client!de", name = "pb", descriptor = "I")
    public static int field5580;

    @OriginalMember(owner = "client!de", name = "rb", descriptor = "I")
    public static int field5582;

    @OriginalMember(owner = "client!de", name = "sb", descriptor = "I")
    public static int field5583;

    @OriginalMember(owner = "client!de", name = "tb", descriptor = "I")
    public static int field5584;

    @OriginalMember(owner = "client!de", name = "wb", descriptor = "I")
    public static int field5587;

    @OriginalMember(owner = "client!de", name = "xb", descriptor = "I")
    public static int field5588;

    @OriginalMember(owner = "client!de", name = "Ab", descriptor = "I")
    public static int field5591;

    @OriginalMember(owner = "client!de", name = "Db", descriptor = "I")
    public static int field5594;

    @OriginalMember(owner = "client!de", name = "Fb", descriptor = "I")
    public static int field5596;

    @OriginalMember(owner = "client!de", name = "Gb", descriptor = "I")
    public static int field5597;

    @OriginalMember(owner = "client!de", name = "Ib", descriptor = "I")
    public static int field5599;

    @OriginalMember(owner = "client!de", name = "Lb", descriptor = "I")
    public static int field5602;

    @OriginalMember(owner = "client!de", name = "Qb", descriptor = "I")
    public static int field5607;

    @OriginalMember(owner = "client!de", name = "Rb", descriptor = "I")
    private int field5608;

    @OriginalMember(owner = "client!de", name = "Tb", descriptor = "I")
    private int field5610;

    @OriginalMember(owner = "client!de", name = "Ub", descriptor = "I")
    public static int field5611;

    @OriginalMember(owner = "client!de", name = "Vb", descriptor = "I")
    public static int field5612;

    @OriginalMember(owner = "client!de", name = "Xb", descriptor = "I")
    public static int field5614;

    @OriginalMember(owner = "client!de", name = "Yb", descriptor = "I")
    public static int field5615;

    @OriginalMember(owner = "client!de", name = "Zb", descriptor = "I")
    private int field5616;

    @OriginalMember(owner = "client!de", name = "ac", descriptor = "I")
    public static int field5617;

    @OriginalMember(owner = "client!de", name = "bc", descriptor = "I")
    public static int field5618;

    @OriginalMember(owner = "client!de", name = "cc", descriptor = "I")
    public static int field5619;

    @OriginalMember(owner = "client!de", name = "gc", descriptor = "I")
    public static int field5623;

    @OriginalMember(owner = "client!de", name = "ic", descriptor = "I")
    public static int field5625;

    @OriginalMember(owner = "client!de", name = "jc", descriptor = "I")
    public static int field5626;

    @OriginalMember(owner = "client!de", name = "lc", descriptor = "I")
    public static int field5628;

    @OriginalMember(owner = "client!de", name = "nc", descriptor = "I")
    public static int field5630;

    @OriginalMember(owner = "client!de", name = "pc", descriptor = "I")
    public static int field5632;

    @OriginalMember(owner = "client!de", name = "sc", descriptor = "I")
    public static int field5635;

    @OriginalMember(owner = "client!de", name = "tc", descriptor = "I")
    private int field5636;

    @OriginalMember(owner = "client!de", name = "uc", descriptor = "I")
    public static int field5637;

    @OriginalMember(owner = "client!de", name = "vc", descriptor = "I")
    public static int field5638;

    @OriginalMember(owner = "client!de", name = "wc", descriptor = "I")
    public static int field5639;

    @OriginalMember(owner = "client!de", name = "Ac", descriptor = "I")
    public static int field5643;

    @OriginalMember(owner = "client!de", name = "Bc", descriptor = "I")
    public static int field5644;

    @OriginalMember(owner = "client!de", name = "Cc", descriptor = "I")
    public static int field5645;

    @OriginalMember(owner = "client!de", name = "Fc", descriptor = "I")
    public static int field5648;

    @OriginalMember(owner = "client!de", name = "Hc", descriptor = "I")
    public static int field5650;

    @OriginalMember(owner = "client!de", name = "Ic", descriptor = "I")
    public static int field5651;

    @OriginalMember(owner = "client!de", name = "Jc", descriptor = "I")
    public static int field5652;

    @OriginalMember(owner = "client!de", name = "Kc", descriptor = "I")
    public static int field5653;

    @OriginalMember(owner = "client!de", name = "Nc", descriptor = "I")
    public static int field5656;

    @OriginalMember(owner = "client!de", name = "Oc", descriptor = "I")
    public static int field5657;

    @OriginalMember(owner = "client!de", name = "Qc", descriptor = "I")
    public static int field5659;

    @OriginalMember(owner = "client!de", name = "Rc", descriptor = "I")
    public static int field5660;

    @OriginalMember(owner = "client!de", name = "Tc", descriptor = "I")
    private int field5662;

    @OriginalMember(owner = "client!de", name = "T", descriptor = "Lag;")
    private class410 field5558;

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(IILq;Z)Z", line = 4)
    public final boolean method1026(int arg0, int arg1, class151 arg2, boolean arg3) {
        field5594++;
        return this.method2313(-1, arg2, arg3, arg0, (byte) 119, arg1);
    }

    @OriginalMember(owner = "client!de", name = "T", descriptor = "(I)V", line = 12)
    public final void method1050(int arg0) {
        field5623++;
        this.field5593 = (short) arg0;
        this.method2305(127);
    }

    @OriginalMember(owner = "client!de", name = "e", descriptor = "()[Lrca;", line = 23)
    public final class30[] method1057() {
        field5635++;
        return this.field5585;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(Lq;)V", line = 36)
    public final void method1032(class151 arg0) {
        field5607++;
        class300 var2 = (class300) arg0;
        if (this.field5585 != null) {
            for (int var3 = 0; var3 < this.field5585.length; var3++) {
                class30 var4 = this.field5585[var3];
                class30 var5 = var4;
                if (var4.field511 != null) {
                    var5 = var4.field511;
                }
                var5.field512 = (int) ((float) this.field5552[var4.field509] * var2.field4439 + (float) this.field5654[var4.field509] * var2.field4418 + (float) this.field5579[var4.field509] * var2.field4438 + var2.field4434);
                var5.field517 = (int) ((float) this.field5552[var4.field509] * var2.field4414 + (float) this.field5654[var4.field509] * var2.field4415 + (float) this.field5579[var4.field509] * var2.field4431 + var2.field4401);
                var5.field524 = (int) ((float) this.field5552[var4.field509] * var2.field4432 + (float) this.field5654[var4.field509] * var2.field4404 + (float) this.field5579[var4.field509] * var2.field4436 + var2.field4402);
                var5.field525 = (int) ((float) this.field5552[var4.field515] * var2.field4439 + (float) this.field5654[var4.field515] * var2.field4418 + (float) this.field5579[var4.field515] * var2.field4438 + var2.field4434);
                var5.field522 = (int) ((float) this.field5552[var4.field515] * var2.field4414 + (float) this.field5654[var4.field515] * var2.field4415 + (float) this.field5579[var4.field515] * var2.field4431 + var2.field4401);
                var5.field523 = (int) ((float) this.field5552[var4.field515] * var2.field4432 + (float) this.field5654[var4.field515] * var2.field4404 + (float) this.field5579[var4.field515] * var2.field4436 + var2.field4402);
                var5.field510 = (int) ((float) this.field5552[var4.field520] * var2.field4439 + (float) this.field5654[var4.field520] * var2.field4418 + (float) this.field5579[var4.field520] * var2.field4438 + var2.field4434);
                var5.field505 = (int) ((float) this.field5552[var4.field520] * var2.field4414 + (float) this.field5654[var4.field520] * var2.field4415 + (float) this.field5579[var4.field520] * var2.field4431 + var2.field4401);
                var5.field519 = (int) ((float) this.field5552[var4.field520] * var2.field4432 + (float) this.field5654[var4.field520] * var2.field4404 + (float) this.field5579[var4.field520] * var2.field4436 + var2.field4402);
            }
        }
        if (this.field5624 == null) {
            return;
        }
        for (int var6 = 0; var6 < this.field5624.length; var6++) {
            class586 var7 = this.field5624[var6];
            class586 var8 = var7;
            if (var7.field8499 != null) {
                var8 = var7.field8499;
            }
            if (var7.field8502 == null) {
                var7.field8502 = var2.method888();
            } else {
                var7.field8502.method887(var2);
            }
            var8.field8505 = (int) ((float) this.field5552[var7.field8503] * var2.field4439 + (float) this.field5654[var7.field8503] * var2.field4418 + (float) this.field5579[var7.field8503] * var2.field4438 + var2.field4434);
            var8.field8508 = (int) ((float) this.field5552[var7.field8503] * var2.field4414 + (float) this.field5654[var7.field8503] * var2.field4415 + (float) this.field5579[var7.field8503] * var2.field4431 + var2.field4401);
            var8.field8506 = (int) ((float) this.field5552[var7.field8503] * var2.field4432 + (float) this.field5654[var7.field8503] * var2.field4404 + (float) this.field5579[var7.field8503] * var2.field4436 + var2.field4402);
        }
    }

    @OriginalMember(owner = "client!de", name = "c", descriptor = "(I)V", line = 102)
    private final void method2305(int arg0) {
        if (arg0 == 127) {
            if (this.field5568 != null) {
                this.field5568.field6481 = false;
            }
            field5536++;
        }
    }

    @OriginalMember(owner = "client!de", name = "<init>", descriptor = "(Lum;Lak;IIII)V", line = 116)
    public class375(class528 arg0, class677 arg1, int arg2, int arg3, int arg4, int arg5) {
        this(arg0, arg2, arg5, true, false);
        class615 var7 = arg0.field1491;
        this.field5604 = new int[arg1.field9578 + 1];
        int[] var8 = new int[arg1.field9548];
        for (int var9 = 0; var9 < arg1.field9548; var9++) {
            if ((arg1.field9562 == null || arg1.field9562[var9] != 2) && (arg1.field9566 == null || arg1.field9566[var9] == -1 || !var7.method955(-1330, arg1.field9566[var9] & 0xFFFF).field6590)) {
                var8[this.field5627++] = var9;
                this.field5604[arg1.field9583[var9]]++;
                this.field5604[arg1.field9549[var9]]++;
                this.field5604[arg1.field9538[var9]]++;
            }
        }
        this.field5540 = this.field5627;
        long[] var10 = new long[this.field5627];
        boolean var11 = (this.field5606 & 0x100) != 0;
        for (int var12 = 0; var12 < this.field5627; var12++) {
            int var185 = var8[var12];
            class457 var186 = null;
            int var187 = 0;
            byte var188 = 0;
            byte var189 = 0;
            byte var190 = 0;
            if (arg1.field9553 != null) {
                boolean var191 = false;
                for (int var192 = 0; var192 < arg1.field9553.length; var192++) {
                    class484 var193 = arg1.field9553[var192];
                    if (var193.field6900 == var185) {
                        class512 var194 = class342.method2119(var193.field6903, (byte) -117);
                        if (var194.field7218) {
                            var191 = true;
                        }
                        if (var194.field7211 != -1) {
                            class457 var195 = var7.method955(-1330, var194.field7211);
                            if (var195.field6594) {
                                this.field5601 = true;
                            }
                        }
                    }
                }
                if (var191) {
                    var10[var12] = Long.MAX_VALUE;
                    this.field5540--;
                    continue;
                }
            }
            short var196 = -1;
            if (arg1.field9566 != null) {
                var196 = arg1.field9566[var185];
                if (var196 != -1) {
                    var186 = var7.method955(-1330, var196 & 0xFFFF);
                    var190 = var186.field6599;
                    var189 = var186.field6600;
                }
            }
            boolean var197 = arg1.field9582 != null && arg1.field9582[var185] != 0 || var186 != null && var186.field6594 | !var186.field6602;
            if ((var11 || var197) && arg1.field9585 != null) {
                var187 += arg1.field9585[var185] << 17;
            }
            if (var197) {
                var187 += 65536;
            }
            int var198 = (var189 & 0xFF << 8) + var187;
            int var199 = (var196 & 0xFFFF << 16) + var188;
            int var200 = (var190 & 0xFF) + var198;
            int var201 = (var12 & 0xFFFF) + var199;
            var10[var12] = ((long) var200 << 32) + (long) var201;
            this.field5601 |= var197;
        }
        class700.method3929(var8, var10, 8845);
        this.field5552 = arg1.field9558;
        this.field5654 = arg1.field9547;
        this.field5533 = arg1.field9578;
        this.field5581 = arg1.field9574;
        this.field5579 = arg1.field9554;
        this.field5647 = arg1.field9581;
        this.field5624 = arg1.field9552;
        this.field5585 = arg1.field9576;
        class24[] var13 = new class24[this.field5533];
        if (arg1.field9553 != null) {
            this.field5640 = arg1.field9553.length;
            this.field5574 = new class339[this.field5640];
            this.field5634 = new class240[this.field5640];
            for (int var14 = 0; var14 < this.field5640; var14++) {
                class484 var15 = arg1.field9553[var14];
                class512 var16 = class342.method2119(var15.field6903, (byte) -127);
                int var17 = -1;
                for (int var18 = 0; var18 < this.field5627; var18++) {
                    if (var8[var18] == var15.field6900) {
                        var17 = var18;
                        break;
                    }
                }
                if (var17 == -1) {
                    throw new RuntimeException();
                }
                int var19 = class391.field5908[arg1.field9564[var15.field6900] & 0xFFFF] & 0xFFFFFF;
                int var20 = var19 | 255 - (arg1.field9582 == null ? 0 : arg1.field9582[var15.field6900]) << 24;
                this.field5574[var14] = new class339(var17, arg1.field9583[var15.field6900], arg1.field9549[var15.field6900], arg1.field9538[var15.field6900], var16.field7215, var16.field7208, var16.field7211, var16.field7216, var16.field7219, var16.field7218, var16.field7220, var15.field6904);
                this.field5634[var14] = new class240(var20);
            }
        }
        int var21 = this.field5627 * 3;
        this.field5575 = new short[this.field5627];
        this.field5577 = new short[var21];
        this.field5589 = new short[var21];
        if (arg1.field9567 != null) {
            this.field5545 = new short[this.field5627];
        }
        this.field5641 = new short[this.field5627];
        this.field5642 = new byte[this.field5627];
        this.field5609 = (short) arg4;
        this.field5621 = new float[var21];
        this.field5544 = new short[var21];
        this.field5646 = new byte[var21];
        this.field5649 = new short[var21];
        this.field5592 = new short[this.field5627];
        class259.field3358 = new long[var21];
        this.field5629 = new float[var21];
        this.field5595 = new short[this.field5627];
        this.field5531 = new short[var21];
        this.field5603 = new short[this.field5627];
        this.field5576 = new short[var21];
        this.field5593 = (short) arg3;
        int var22 = 0;
        for (int var23 = 0; var23 < arg1.field9578; var23++) {
            int var184 = this.field5604[var23];
            this.field5604[var23] = var22;
            var13[var23] = new class24();
            var22 += var184;
        }
        this.field5604[arg1.field9578] = var22;
        int[] var24 = null;
        int[] var25 = null;
        int[] var26 = null;
        float[][] var27 = null;
        if (arg1.field9543 != null) {
            int var28 = arg1.field9551;
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
            var27 = new float[var28][];
            var24 = new int[var28];
            var25 = new int[var28];
            for (int var36 = 0; var36 < this.field5627; var36++) {
                int var43 = var8[var36];
                if (arg1.field9543[var43] != -1) {
                    int var44 = arg1.field9543[var43] & 0xFF;
                    for (int var45 = 0; var45 < 3; var45++) {
                        short var46;
                        if (var45 == 0) {
                            var46 = arg1.field9583[var43];
                        } else if (var45 == 1) {
                            var46 = arg1.field9549[var43];
                        } else {
                            var46 = arg1.field9538[var43];
                        }
                        int var47 = arg1.field9554[var46];
                        int var48 = arg1.field9547[var46];
                        int var49 = arg1.field9558[var46];
                        if (var47 < var29[var44]) {
                            var29[var44] = var47;
                        }
                        if (var30[var44] < var47) {
                            var30[var44] = var47;
                        }
                        if (var48 < var31[var44]) {
                            var31[var44] = var48;
                        }
                        if (var48 > var32[var44]) {
                            var32[var44] = var48;
                        }
                        if (var49 < var33[var44]) {
                            var33[var44] = var49;
                        }
                        if (var49 > var34[var44]) {
                            var34[var44] = var49;
                        }
                    }
                }
            }
            var26 = new int[var28];
            for (int var37 = 0; var37 < var28; var37++) {
                byte var38 = arg1.field9555[var37];
                if (var38 > 0) {
                    var24[var37] = (var29[var37] + var30[var37]) / 2;
                    var25[var37] = (var31[var37] + var32[var37]) / 2;
                    var26[var37] = (var33[var37] + var34[var37]) / 2;
                    float var40;
                    float var41;
                    float var42;
                    if (var38 == 1) {
                        int var39 = arg1.field9590[var37];
                        var40 = 64.0F / (float) arg1.field9573[var37];
                        if (var39 == 0) {
                            var41 = 1.0F;
                            var42 = 1.0F;
                        } else if (var39 > 0) {
                            var41 = (float) var39 / 1024.0F;
                            var42 = 1.0F;
                        } else {
                            var41 = 1.0F;
                            var42 = (float) (-var39) / 1024.0F;
                        }
                    } else if (var38 == 2) {
                        var42 = 64.0F / (float) arg1.field9590[var37];
                        var41 = 64.0F / (float) arg1.field9568[var37];
                        var40 = 64.0F / (float) arg1.field9573[var37];
                    } else {
                        var40 = (float) arg1.field9573[var37] / 1024.0F;
                        var42 = (float) arg1.field9590[var37] / 1024.0F;
                        var41 = (float) arg1.field9568[var37] / 1024.0F;
                    }
                    var27[var37] = class157.method1122(var41, var42, (byte) -123, arg1.field9571[var37], var40, arg1.field9540[var37], arg1.field9588[var37], class425.method2563(255, arg1.field9550[var37]));
                }
            }
        }
        class109[] var50 = new class109[arg1.field9548];
        for (int var51 = 0; var51 < arg1.field9548; var51++) {
            short var163 = arg1.field9583[var51];
            short var164 = arg1.field9549[var51];
            short var165 = arg1.field9538[var51];
            int var166 = this.field5579[var164] - this.field5579[var163];
            int var167 = this.field5654[var164] - this.field5654[var163];
            int var168 = this.field5552[var164] - this.field5552[var163];
            int var169 = this.field5579[var165] - this.field5579[var163];
            int var170 = this.field5654[var165] - this.field5654[var163];
            int var171 = this.field5552[var165] - this.field5552[var163];
            int var172 = var167 * var171 - var168 * var170;
            int var173 = var168 * var169 - (var166 * var171);
            int var174 = var166 * var170 - var167 * var169;
            while (var172 > 8192 || var173 > 8192 || var174 > 8192 || var172 < -8192 || var173 < -8192 || var174 < -8192) {
                var174 >>= 0x1;
                var173 >>= 0x1;
                var172 >>= 0x1;
            }
            int var175 = (int) Math.sqrt((double) (var173 * var173 + (var172 * var172 + (var174 * var174))));
            if (var175 <= 0) {
                var175 = 1;
            }
            int var176 = var174 * 256 / var175;
            int var177 = var172 * 256 / var175;
            int var178 = var173 * 256 / var175;
            byte var179 = arg1.field9562 == null ? 0 : arg1.field9562[var51];
            if (var179 == 0) {
                class24 var181 = var13[var163];
                var181.field450 += var178;
                var181.field449 += var177;
                var181.field446 += var176;
                var181.field447++;
                class24 var182 = var13[var164];
                var182.field449 += var177;
                var182.field450 += var178;
                var182.field446 += var176;
                var182.field447++;
                class24 var183 = var13[var165];
                var183.field447++;
                var183.field449 += var177;
                var183.field446 += var176;
                var183.field450 += var178;
            } else if (var179 == 1) {
                class109 var180 = var50[var51] = new class109();
                var180.field1622 = var176;
                var180.field1619 = var178;
                var180.field1620 = var177;
            }
        }
        for (int var52 = 0; var52 < this.field5627; var52++) {
            int var73 = var8[var52];
            int var74 = arg1.field9564[var73] & 0xFFFF;
            short var75;
            if (arg1.field9566 == null) {
                var75 = -1;
            } else {
                var75 = arg1.field9566[var73];
            }
            int var76;
            if (arg1.field9543 == null) {
                var76 = -1;
            } else {
                var76 = arg1.field9543[var73];
            }
            int var77;
            if (arg1.field9582 == null) {
                var77 = 0;
            } else {
                var77 = arg1.field9582[var73] & 0xFF;
            }
            float var78 = 0.0F;
            float var79 = 0.0F;
            float var80 = 0.0F;
            float var81 = 0.0F;
            float var82 = 0.0F;
            float var83 = 0.0F;
            byte var84 = 0;
            byte var85 = 0;
            int var86 = 0;
            if (var75 != -1) {
                if (var76 == -1) {
                    var85 = 2;
                    var81 = 1.0F;
                    var84 = 1;
                    var83 = 0.0F;
                    var78 = 0.0F;
                    var82 = 0.0F;
                    var80 = 1.0F;
                    var79 = 1.0F;
                } else {
                    var76 &= 0xFF;
                    byte var87 = arg1.field9555[var76];
                    if (var87 == 0) {
                        short var116 = arg1.field9583[var73];
                        short var117 = arg1.field9549[var73];
                        short var118 = arg1.field9538[var73];
                        short var119 = arg1.field9540[var76];
                        short var120 = arg1.field9571[var76];
                        short var121 = arg1.field9588[var76];
                        float var122 = (float) arg1.field9554[var119];
                        float var123 = (float) arg1.field9547[var119];
                        float var124 = (float) arg1.field9558[var119];
                        float var125 = (float) arg1.field9554[var120] - var122;
                        float var126 = (float) arg1.field9547[var120] - var123;
                        float var127 = (float) arg1.field9558[var120] - var124;
                        float var128 = (float) arg1.field9554[var121] - var122;
                        float var129 = (float) arg1.field9547[var121] - var123;
                        float var130 = (float) arg1.field9558[var121] - var124;
                        float var131 = (float) arg1.field9554[var116] - var122;
                        float var132 = (float) arg1.field9547[var116] - var123;
                        float var133 = (float) arg1.field9558[var116] - var124;
                        float var134 = (float) arg1.field9554[var117] - var122;
                        float var135 = (float) arg1.field9547[var117] - var123;
                        float var136 = (float) arg1.field9558[var117] - var124;
                        float var137 = (float) arg1.field9554[var118] - var122;
                        float var138 = (float) arg1.field9547[var118] - var123;
                        float var139 = (float) arg1.field9558[var118] - var124;
                        float var140 = var126 * var130 - (var127 * var129);
                        float var141 = var127 * var128 - var125 * var130;
                        float var142 = var125 * var129 - var126 * var128;
                        float var143 = var129 * var142 - (var130 * var141);
                        float var144 = var130 * var140 - var128 * var142;
                        float var145 = var128 * var141 - var129 * var140;
                        float var146 = 1.0F / (var127 * var145 + var125 * var143 + var126 * var144);
                        var80 = (var136 * var145 + var134 * var143 + var135 * var144) * var146;
                        var82 = (var139 * var145 + var137 * var143 + var138 * var144) * var146;
                        var78 = (var133 * var145 + var131 * var143 + var132 * var144) * var146;
                        float var147 = var127 * var140 - var125 * var142;
                        float var148 = var126 * var142 - (var127 * var141);
                        float var149 = var125 * var141 - (var126 * var140);
                        float var150 = 1.0F / (var130 * var149 + var128 * var148 + var129 * var147);
                        var79 = (var133 * var149 + var131 * var148 + var132 * var147) * var150;
                        var83 = (var139 * var149 + var137 * var148 + var138 * var147) * var150;
                        var81 = (var136 * var149 + var134 * var148 + var135 * var147) * var150;
                    } else {
                        short var88 = arg1.field9583[var73];
                        short var89 = arg1.field9549[var73];
                        short var90 = arg1.field9538[var73];
                        int var91 = var24[var76];
                        int var92 = var25[var76];
                        int var93 = var26[var76];
                        float[] var94 = var27[var76];
                        byte var95 = arg1.field9536[var76];
                        float var96 = (float) arg1.field9575[var76] / 256.0F;
                        if (var87 == 1) {
                            float var114 = (float) arg1.field9568[var76] / 1024.0F;
                            class157.method1123(var94, arg1.field9554[var88], arg1.field9558[var88], var91, var96, var114, var93, var95, var92, arg1.field9547[var88], (byte) -47);
                            var79 = class496.field7028;
                            var78 = class143.field2067;
                            class157.method1123(var94, arg1.field9554[var89], arg1.field9558[var89], var91, var96, var114, var93, var95, var92, arg1.field9547[var89], (byte) 110);
                            var80 = class143.field2067;
                            var81 = class496.field7028;
                            class157.method1123(var94, arg1.field9554[var90], arg1.field9558[var90], var91, var96, var114, var93, var95, var92, arg1.field9547[var90], (byte) 126);
                            var83 = class496.field7028;
                            var82 = class143.field2067;
                            float var115 = var114 / 2.0F;
                            if ((var95 & 0x1) == 0) {
                                if ((var115 < var82 - var78)) {
                                    var85 = 1;
                                    var82 -= var114;
                                } else if (var115 < var78 - var82) {
                                    var85 = 2;
                                    var82 += var114;
                                }
                                if (var80 - var78 > var115) {
                                    var80 -= var114;
                                    var84 = 1;
                                } else if (var115 < var78 - var80) {
                                    var84 = 2;
                                    var80 += var114;
                                }
                            } else {
                                if (var81 - var79 > var115) {
                                    var84 = 1;
                                    var81 -= var114;
                                } else if (var115 < var79 - var81) {
                                    var84 = 2;
                                    var81 += var114;
                                }
                                if (var115 < var83 - var79) {
                                    var85 = 1;
                                    var83 -= var114;
                                } else if (var115 < var79 - var83) {
                                    var85 = 2;
                                    var83 += var114;
                                }
                            }
                        } else if (var87 == 2) {
                            float var97 = (float) arg1.field9539[var76] / 256.0F;
                            float var98 = (float) arg1.field9559[var76] / 256.0F;
                            int var99 = arg1.field9554[var89] - arg1.field9554[var88];
                            int var100 = arg1.field9547[var89] - arg1.field9547[var88];
                            int var101 = arg1.field9558[var89] - arg1.field9558[var88];
                            int var102 = arg1.field9554[var90] - arg1.field9554[var88];
                            int var103 = arg1.field9547[var90] - arg1.field9547[var88];
                            int var104 = arg1.field9558[var90] - arg1.field9558[var88];
                            int var105 = var100 * var104 - var101 * var103;
                            int var106 = var101 * var102 - (var99 * var104);
                            int var107 = var99 * var103 - (var100 * var102);
                            float var108 = 64.0F / (float) arg1.field9590[var76];
                            float var109 = 64.0F / (float) arg1.field9573[var76];
                            float var110 = 64.0F / (float) arg1.field9568[var76];
                            float var111 = (var94[2] * (float) var107 + var94[1] * (float) var106 + var94[0] * (float) var105) / var108;
                            float var112 = (var94[5] * (float) var107 + var94[3] * (float) var105 + var94[4] * (float) var106) / var109;
                            float var113 = (var94[8] * (float) var107 + var94[7] * (float) var106 + var94[6] * (float) var105) / var110;
                            var86 = class705.method3945(var112, (byte) -52, var111, var113);
                            class392.method2426(var97, var95, arg1.field9554[var88], arg1.field9547[var88], var91, var93, var96, arg1.field9558[var88], var98, var94, var86, 71, var92);
                            var78 = class620.field8980;
                            var79 = class295.field4353;
                            class392.method2426(var97, var95, arg1.field9554[var89], arg1.field9547[var89], var91, var93, var96, arg1.field9558[var89], var98, var94, var86, 61, var92);
                            var80 = class620.field8980;
                            var81 = class295.field4353;
                            class392.method2426(var97, var95, arg1.field9554[var90], arg1.field9547[var90], var91, var93, var96, arg1.field9558[var90], var98, var94, var86, 107, var92);
                            var83 = class295.field4353;
                            var82 = class620.field8980;
                        } else if (var87 == 3) {
                            class486.method2777(var91, var92, var93, arg1.field9558[var88], var96, arg1.field9547[var88], arg1.field9554[var88], var95, var94, 3);
                            var78 = class268.field3513;
                            var79 = class481.field6883;
                            class486.method2777(var91, var92, var93, arg1.field9558[var89], var96, arg1.field9547[var89], arg1.field9554[var89], var95, var94, 3);
                            var80 = class268.field3513;
                            var81 = class481.field6883;
                            class486.method2777(var91, var92, var93, arg1.field9558[var90], var96, arg1.field9547[var90], arg1.field9554[var90], var95, var94, 3);
                            var82 = class268.field3513;
                            var83 = class481.field6883;
                            if ((var95 & 0x1) == 0) {
                                if ((var82 - var78 > 0.5F)) {
                                    var82--;
                                    var85 = 1;
                                } else if (var78 - var82 > 0.5F) {
                                    var82++;
                                    var85 = 2;
                                }
                                if (var80 - var78 > 0.5F) {
                                    var84 = 1;
                                    var80--;
                                } else if (var78 - var80 > 0.5F) {
                                    var80++;
                                    var84 = 2;
                                }
                            } else {
                                if (var83 - var79 > 0.5F) {
                                    var85 = 1;
                                    var83--;
                                } else if (var79 - var83 > 0.5F) {
                                    var83++;
                                    var85 = 2;
                                }
                                if (var81 - var79 > 0.5F) {
                                    var84 = 1;
                                    var81--;
                                } else if (var79 - var81 > 0.5F) {
                                    var81++;
                                    var84 = 2;
                                }
                            }
                        }
                    }
                }
            }
            byte var151;
            if (arg1.field9562 == null) {
                var151 = 0;
            } else {
                var151 = arg1.field9562[var73];
            }
            if (var151 == 0) {
                long var155 = ((long) (var74 << 8) + (long) var77 + (long) (var86 << 24) << 32) + (long) (var76 << 2);
                short var157 = arg1.field9583[var73];
                short var158 = arg1.field9549[var73];
                short var159 = arg1.field9538[var73];
                class24 var160 = var13[var157];
                this.field5603[var52] = this.method2322(var78, var160.field450, arg1, var160.field446, var52, var160.field449, var155, var157, -17, var160.field447, var79);
                class24 var161 = var13[var158];
                this.field5575[var52] = this.method2322(var80, var161.field450, arg1, var161.field446, var52, var161.field449, (long) var84 + var155, var158, -105, var161.field447, var81);
                class24 var162 = var13[var159];
                this.field5595[var52] = this.method2322(var82, var162.field450, arg1, var162.field446, var52, var162.field449, (long) var85 + var155, var159, -118, var162.field447, var83);
            } else if (var151 == 1) {
                class109 var152 = var50[var73];
                long var153 = (long) ((var152.field1622 + 256 << 22) + (var152.field1620 > 0 ? 1024 : 2048) + (var76 << 2) + (var152.field1619 + 256 << 12)) + ((long) (var86 << 24) + ((long) var77) + (long) (var74 << 8) << 32);
                this.field5603[var52] = this.method2322(var78, var152.field1619, arg1, var152.field1622, var52, var152.field1620, var153, arg1.field9583[var73], -21, 0, var79);
                this.field5575[var52] = this.method2322(var80, var152.field1619, arg1, var152.field1622, var52, var152.field1620, (long) var84 + var153, arg1.field9549[var73], -37, 0, var81);
                this.field5595[var52] = this.method2322(var82, var152.field1619, arg1, var152.field1622, var52, var152.field1620, (long) var85 + var153, arg1.field9538[var73], -80, 0, var83);
            }
            if (arg1.field9566 == null) {
                this.field5641[var52] = -1;
            } else {
                this.field5641[var52] = arg1.field9566[var73];
            }
            if (arg1.field9582 != null) {
                this.field5642[var52] = arg1.field9582[var73];
            }
            if (arg1.field9567 != null) {
                this.field5545[var52] = arg1.field9567[var73];
            }
            this.field5592[var52] = arg1.field9564[var73];
        }
        if (this.field5540 > 0) {
            int var53 = 1;
            short var54 = this.field5641[0];
            for (int var55 = 0; var55 < this.field5540; var55++) {
                short var65 = this.field5641[var55];
                if (var54 != var65) {
                    var54 = var65;
                    var53++;
                }
            }
            this.field5600 = new int[var53];
            this.field5542 = new int[var53];
            this.field5547 = new int[var53 + 1];
            this.field5547[0] = 0;
            int var56 = this.field5537;
            short var57 = 0;
            short var58 = this.field5641[0];
            int var59 = 0;
            for (int var60 = 0; var60 < this.field5540; var60++) {
                short var61 = this.field5641[var60];
                if (var58 != var61) {
                    this.field5542[var59] = var56;
                    this.field5600[var59] = var57 + 1 - var56;
                    var59++;
                    this.field5547[var59] = var60;
                    var56 = this.field5537;
                    var57 = 0;
                    var58 = var61;
                }
                short var62 = this.field5603[var60];
                if (var57 < var62) {
                    var57 = var62;
                }
                if (var56 > var62) {
                    var56 = var62;
                }
                short var63 = this.field5575[var60];
                if (var63 > var57) {
                    var57 = var63;
                }
                if (var56 > var63) {
                    var56 = var63;
                }
                short var64 = this.field5595[var60];
                if (var57 < var64) {
                    var57 = var64;
                }
                if (var56 > var64) {
                    var56 = var64;
                }
            }
            this.field5542[var59] = var56;
            this.field5600[var59] = var57 + 1 - var56;
            var59++;
            this.field5547[var59] = this.field5540;
        }
        class259.field3358 = null;
        this.field5589 = class343.method2130(this.field5589, (byte) 118, this.field5537);
        this.field5577 = class343.method2130(this.field5577, (byte) 110, this.field5537);
        this.field5649 = class343.method2130(this.field5649, (byte) 112, this.field5537);
        this.field5544 = class343.method2130(this.field5544, (byte) 113, this.field5537);
        this.field5576 = class343.method2130(this.field5576, (byte) 113, this.field5537);
        this.field5646 = class460.method2680(this.field5646, this.field5537, (byte) -70);
        this.field5629 = class592.method3370(this.field5629, 0, this.field5537);
        this.field5621 = class592.method3370(this.field5621, 0, this.field5537);
        if (arg1.field9557 != null && class115.method857(15547, this.field5605, arg2)) {
            this.field5622 = arg1.method3805((byte) 31, false);
        }
        if (arg1.field9553 != null && class217.method1373((byte) -69, this.field5605, arg2)) {
            this.field5655 = arg1.method3798(256);
        }
        if (arg1.field9561 != null && class216.method1369(384, this.field5605, arg2)) {
            int var66 = 0;
            int[] var67 = new int[256];
            for (int var68 = 0; var68 < this.field5627; var68++) {
                int var72 = arg1.field9561[var8[var68]];
                if (var72 >= 0) {
                    int var10002 = var67[var72]++;
                    if (var66 < var72) {
                        var66 = var72;
                    }
                }
            }
            this.field5555 = new int[var66 + 1][];
            for (int var69 = 0; var69 <= var66; var69++) {
                this.field5555[var69] = new int[var67[var69]];
                var67[var69] = 0;
            }
            for (int var70 = 0; var70 < this.field5627; var70++) {
                int var71 = arg1.field9561[var8[var70]];
                if (var71 >= 0) {
                    this.field5555[var71][var67[var71]++] = var70;
                }
            }
        }
    }

    @OriginalMember(owner = "client!de", name = "J", descriptor = "()I", line = 1169)
    public final int method1007() {
        field5546++;
        if (!this.field5578) {
            this.method2315((byte) 116);
        }
        return this.field5572;
    }

    @OriginalMember(owner = "client!de", name = "d", descriptor = "(I)V", line = 1185)
    private final void method2306(int arg0) {
        field5619++;
        if (this.field5540 == 0) {
            return;
        }
        if (this.method2317((byte) 109) && this.method2321(-1452408722)) {
            this.field5613.method754(this.field5590.field6484, 0, 27910);
            this.field5613.method754(this.field5568.field6484, 1, 27910);
            this.field5613.method754(this.field5598.field6484, 2, 27910);
            boolean var2;
            if ((this.field5605 & 0x37) == 0) {
                var2 = false;
                this.field5613.method2994(0, false);
                this.field5613.method811(this.field5613.field7799, (byte) -105);
            } else {
                var2 = true;
                this.field5613.method2994(0, true);
                this.field5613.method754(this.field5633.field6484, 3, 27910);
                this.field5613.method811(this.field5613.field7791, (byte) -35);
            }
            for (int var3 = 0; var3 < this.field5542.length; var3++) {
                int var4 = this.field5547[var3];
                int var5 = this.field5547[var3 + 1];
                int var6 = this.field5641[var4] & 0xFFFF;
                if (var6 == 65535) {
                    var6 = -1;
                }
                this.field5613.method3058(true, var6, (byte) -127, var2);
                this.field5613.method756(var4 * 3, this.field5600[var3], arg0 - 9954, class433.field6280, var5 - var4, this.field5538.field3038, this.field5542[var3]);
            }
        }
        if (arg0 != 21851) {
            this.method1034(116, -57, 106, -33);
        }
        this.method2314(arg0 ^ 0xFFFFAAFF);
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(IILq;ZI)Z", line = 1246)
    public final boolean method1022(int arg0, int arg1, class151 arg2, boolean arg3, int arg4) {
        field5553++;
        return this.method2313(arg4, arg2, arg3, arg0, (byte) 124, arg1);
    }

    @OriginalMember(owner = "client!de", name = "K", descriptor = "()I", line = 1254)
    public final int method1041() {
        if (!this.field5578) {
            this.method2315((byte) 117);
        }
        field5565++;
        return this.field5608;
    }

    @OriginalMember(owner = "client!de", name = "<init>", descriptor = "(Lum;IIZZ)V", line = 6660)
    public class375(class528 arg0, int arg1, int arg2, boolean arg3, boolean arg4) {
        this.field5537 = 0;
        this.field5533 = 0;
        this.field5586 = true;
        this.field5540 = 0;
        this.field5578 = false;
        this.field5601 = false;
        this.field5627 = 0;
        this.field5647 = 0;
        this.field5620 = false;
        this.field5620 = arg4;
        this.field5613 = arg0;
        this.field5605 = arg2;
        this.field5606 = arg1;
        if (arg3 || class65.method392(this.field5606, 2048, this.field5605)) {
            this.field5590 = new class446(class334.method2047(this.field5605, this.field5606, 0));
        }
        if (arg3 || class162.method1149(this.field5605, this.field5606, 85)) {
            this.field5598 = new class446(class438.method2601(this.field5606, 21, this.field5605));
        }
        if (arg3 || class620.method3570(-1, this.field5606, this.field5605)) {
            this.field5568 = new class446(class115.method855(this.field5605, this.field5606, -1148));
        }
        if (arg3 || class623.method3589(this.field5606, this.field5605, (byte) 80)) {
            this.field5633 = new class446(class403.method2487(0, this.field5605, this.field5606));
        }
        if (arg3 || class317.method1970(-1, this.field5605, this.field5606)) {
            this.field5538 = new class229(class673.method3781(-2231, this.field5606, this.field5605));
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(ILsw;)V", line = 1274)
    private final void method2307(int arg0, class392 arg1) {
        if (class236.field3102.length < this.field5537) {
            class550.field8100 = new int[this.field5537];
            class236.field3102 = new int[this.field5537];
        }
        field5651++;
        if (arg0 != -6) {
            this.field5641 = null;
        }
        for (int var3 = 0; var3 < this.field5533; var3++) {
            int var14 = (this.field5579[var3] - (this.field5654[var3] * this.field5613.field7748 >> 8) >> this.field5613.field7767) - arg1.field5928;
            int var15 = (this.field5552[var3] - (this.field5654[var3] * this.field5613.field7722 >> 8) >> this.field5613.field7767) - arg1.field5919;
            int var16 = this.field5604[var3];
            int var17 = this.field5604[var3 + 1];
            for (int var18 = var16; var18 < var17; var18++) {
                int var19 = this.field5531[var18] - 1;
                if (var19 == -1) {
                    break;
                }
                class236.field3102[var19] = var14;
                class550.field8100[var19] = var15;
            }
        }
        for (int var4 = 0; var4 < this.field5540; var4++) {
            if (this.field5642 == null || this.field5642[var4] <= 128) {
                short var5 = this.field5603[var4];
                short var6 = this.field5575[var4];
                short var7 = this.field5595[var4];
                int var8 = class236.field3102[var5];
                int var9 = class236.field3102[var6];
                int var10 = class236.field3102[var7];
                int var11 = class550.field8100[var5];
                int var12 = class550.field8100[var6];
                int var13 = class550.field8100[var7];
                if (((var8 - var9) * (var12 - var13) - (var10 - var9) * (var12 - var11)) > 0) {
                    arg1.method2427(var11, var9, var10, -21853, var8, var13, var12);
                }
            }
        }
    }

    @OriginalMember(owner = "client!de", name = "ba", descriptor = "(IILi;Li;III)V", line = 1358)
    public final void method1014(int arg0, int arg1, class682 arg2, class682 arg3, int arg4, int arg5, int arg6) {
        field5656++;
        if (!this.field5578) {
            this.method2315((byte) 120);
        }
        int var8 = this.field5616 + arg4;
        int var9 = this.field5532 + arg4;
        int var10 = this.field5610 + arg6;
        int var11 = arg6 + this.field5662;
        if (arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5 && var8 < 0 || arg2.field9628 <= arg2.field9629 + var9 >> arg2.field9623 || var10 < 0 || arg2.field9629 + var11 >> arg2.field9623 >= arg2.field9630) {
            return;
        }
        if (arg0 == 4 || arg0 == 5) {
            if (arg3 == null) {
                return;
            }
            if (var8 < 0 || arg3.field9628 <= (arg3.field9629 + var9 >> arg3.field9623) || var10 < 0 || var11 + arg3.field9629 >> arg3.field9623 >= arg3.field9630) {
                return;
            }
        } else {
            int var12 = var8 >> arg2.field9623;
            int var13 = var9 + arg2.field9629 - 1 >> arg2.field9623;
            int var14 = var10 >> arg2.field9623;
            int var15 = var11 + arg2.field9629 - 1 >> arg2.field9623;
            if (arg2.method3822(var14, var12, 0) == arg5 && arg2.method3822(var14, var13, 0) == arg5 && arg5 == arg2.method3822(var15, var12, 0) && arg2.method3822(var15, var13, 0) == arg5) {
                return;
            }
        }
        if (arg0 == 1) {
            for (int var32 = 0; var32 < this.field5533; var32++) {
                this.field5654[var32] = (this.field5654[var32] + arg2.method3824(this.field5579[var32] + arg4, 127, this.field5552[var32] + arg6)) - arg5;
            }
        } else if (arg0 == 2) {
            int var29 = this.field5572;
            if (var29 == 0) {
                return;
            }
            for (int var30 = 0; var30 < this.field5533; var30++) {
                int var31 = (this.field5654[var30] << 16) / var29;
                if (arg1 > var31) {
                    this.field5654[var30] += (arg2.method3824(this.field5579[var30] + arg4, 116, this.field5552[var30] + arg6) - arg5) * (arg1 - var31) / arg1;
                }
            }
        } else if (arg0 == 3) {
            int var25 = (arg1 & 0xFF) * 4;
            int var26 = ((arg1 & 0xFFF4) >> 8) * 4;
            int var27 = arg1 >> 16 & 0xFF << 6;
            int var28 = (arg1 >> 24 & 0xFF) << 6;
            if ((arg4 - (var25 >> 1)) < 0 || arg4 + (var25 >> 1) + arg2.field9629 >= arg2.field9628 << arg2.field9623 || arg6 - (var26 >> 1) < 0 || ((var26 >> 1) + arg6 + arg2.field9629) >= (arg2.field9630 << arg2.field9623)) {
                return;
            }
            this.method2454(arg6, var25, var27, arg4, var28, (byte) -55, arg5, arg2, var26);
        } else if (arg0 == 4) {
            int var16 = this.field5636 - this.field5572;
            for (int var17 = 0; var17 < this.field5533; var17++) {
                this.field5654[var17] = this.field5654[var17] + arg3.method3824(this.field5579[var17] + arg4, 125, this.field5552[var17] + arg6) - (arg5 - var16);
            }
        } else if (arg0 == 5) {
            int var18 = this.field5636 - this.field5572;
            for (int var19 = 0; var19 < this.field5533; var19++) {
                int var20 = this.field5579[var19] + arg4;
                int var21 = this.field5552[var19] + arg6;
                int var22 = arg2.method3824(var20, 126, var21);
                int var23 = arg3.method3824(var20, 111, var21);
                int var24 = var22 - arg1 - var23;
                this.field5654[var19] = ((this.field5654[var19] << 8) / var18 * var24 >> 8) + var22 - arg5;
            }
        }
        this.method2327(-1);
        this.field5578 = false;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(ZZLde;Lde;ZI)Lda;", line = 1510)
    private final class395 method2308(boolean arg0, boolean arg1, class375 arg2, class375 arg3, boolean arg4, int arg5) {
        arg3.field5605 = this.field5605;
        arg3.field5533 = this.field5533;
        arg3.field5593 = this.field5593;
        arg3.field5606 = arg5;
        arg3.field5647 = this.field5647;
        arg3.field5537 = this.field5537;
        field5571++;
        if (arg0) {
            return null;
        }
        if ((arg5 & 0x100) == 0) {
            arg3.field5601 = this.field5601;
        } else {
            arg3.field5601 = true;
        }
        arg3.field5540 = this.field5540;
        arg3.field5627 = this.field5627;
        arg3.field5640 = this.field5640;
        arg3.field5609 = this.field5609;
        boolean var7 = class454.method2663(arg5, this.field5605, (byte) -107);
        boolean var8 = class78.method450(this.field5605, -23951, arg5);
        boolean var9 = class172.method1194(arg5, (byte) -120, this.field5605);
        boolean var10 = var9 | var7 | var8;
        if (var10) {
            if (!var7) {
                arg3.field5579 = this.field5579;
            } else if (arg2.field5579 == null || this.field5647 > arg2.field5579.length) {
                arg3.field5579 = arg2.field5579 = new int[this.field5647];
            } else {
                arg3.field5579 = arg2.field5579;
            }
            if (!var8) {
                arg3.field5654 = this.field5654;
            } else if (arg2.field5654 == null || arg2.field5654.length < this.field5647) {
                arg3.field5654 = arg2.field5654 = new int[this.field5647];
            } else {
                arg3.field5654 = arg2.field5654;
            }
            if (!var9) {
                arg3.field5552 = this.field5552;
            } else if (arg2.field5552 == null || arg2.field5552.length < this.field5647) {
                arg3.field5552 = arg2.field5552 = new int[this.field5647];
            } else {
                arg3.field5552 = arg2.field5552;
            }
            for (int var11 = 0; var11 < this.field5647; var11++) {
                if (var7) {
                    arg3.field5579[var11] = this.field5579[var11];
                }
                if (var8) {
                    arg3.field5654[var11] = this.field5654[var11];
                }
                if (var9) {
                    arg3.field5552[var11] = this.field5552[var11];
                }
            }
        } else {
            arg3.field5579 = this.field5579;
            arg3.field5552 = this.field5552;
            arg3.field5654 = this.field5654;
        }
        if (class334.method2047(this.field5605, arg5, 0)) {
            arg3.field5590 = arg2.field5590;
            arg3.field5590.field6485 = true;
            arg3.field5590.field6484 = this.field5590.field6484;
            arg3.field5590.field6481 = this.field5590.field6481;
        } else if (class65.method392(arg5, 2048, this.field5605)) {
            arg3.field5590 = this.field5590;
        } else {
            arg3.field5590 = null;
        }
        if (class574.method3304(arg5, 111, this.field5605)) {
            if (arg2.field5592 == null || arg2.field5592.length < this.field5627) {
                arg3.field5592 = arg2.field5592 = new short[this.field5627];
            } else {
                arg3.field5592 = arg2.field5592;
            }
            for (int var12 = 0; var12 < this.field5627; var12++) {
                arg3.field5592[var12] = this.field5592[var12];
            }
        } else {
            arg3.field5592 = this.field5592;
        }
        if (class211.method1337(this.field5605, arg5, 16500)) {
            if (arg2.field5642 == null || this.field5627 > arg2.field5642.length) {
                arg3.field5642 = arg2.field5642 = new byte[this.field5627];
            } else {
                arg3.field5642 = arg2.field5642;
            }
            for (int var13 = 0; var13 < this.field5627; var13++) {
                arg3.field5642[var13] = this.field5642[var13];
            }
        } else {
            arg3.field5642 = this.field5642;
        }
        if (class115.method855(this.field5605, arg5, -1148)) {
            arg3.field5568 = arg2.field5568;
            arg3.field5568.field6481 = this.field5568.field6481;
            arg3.field5568.field6485 = true;
            arg3.field5568.field6484 = this.field5568.field6484;
        } else if (class620.method3570(-1, arg5, this.field5605)) {
            arg3.field5568 = this.field5568;
        } else {
            arg3.field5568 = null;
        }
        if (class48.method290(this.field5605, 11615, arg5)) {
            if (arg2.field5649 == null || this.field5537 > arg2.field5649.length) {
                int var14 = this.field5537;
                arg3.field5544 = arg2.field5544 = new short[var14];
                arg3.field5576 = arg2.field5576 = new short[var14];
                arg3.field5649 = arg2.field5649 = new short[var14];
            } else {
                arg3.field5576 = arg2.field5576;
                arg3.field5544 = arg2.field5544;
                arg3.field5649 = arg2.field5649;
            }
            if (this.field5558 == null) {
                arg3.field5558 = null;
                for (int var15 = 0; var15 < this.field5537; var15++) {
                    arg3.field5649[var15] = this.field5649[var15];
                    arg3.field5544[var15] = this.field5544[var15];
                    arg3.field5576[var15] = this.field5576[var15];
                }
            } else {
                if (arg2.field5558 == null) {
                    arg2.field5558 = new class410();
                }
                class410 var16 = arg3.field5558 = arg2.field5558;
                if (var16.field6108 == null || var16.field6108.length < this.field5537) {
                    int var17 = this.field5537;
                    var16.field6108 = new short[var17];
                    var16.field6101 = new byte[var17];
                    var16.field6106 = new short[var17];
                    var16.field6104 = new short[var17];
                }
                for (int var18 = 0; var18 < this.field5537; var18++) {
                    arg3.field5649[var18] = this.field5649[var18];
                    arg3.field5544[var18] = this.field5544[var18];
                    arg3.field5576[var18] = this.field5576[var18];
                    var16.field6108[var18] = this.field5558.field6108[var18];
                    var16.field6104[var18] = this.field5558.field6104[var18];
                    var16.field6106[var18] = this.field5558.field6106[var18];
                    var16.field6101[var18] = this.field5558.field6101[var18];
                }
            }
            arg3.field5646 = this.field5646;
        } else {
            arg3.field5576 = this.field5576;
            arg3.field5649 = this.field5649;
            arg3.field5544 = this.field5544;
            arg3.field5558 = this.field5558;
            arg3.field5646 = this.field5646;
        }
        if (class403.method2487(0, this.field5605, arg5)) {
            arg3.field5633 = arg2.field5633;
            arg3.field5633.field6481 = this.field5633.field6481;
            arg3.field5633.field6485 = true;
            arg3.field5633.field6484 = this.field5633.field6484;
        } else if (class623.method3589(arg5, this.field5605, (byte) 80)) {
            arg3.field5633 = this.field5633;
        } else {
            arg3.field5633 = null;
        }
        if (class373.method2298(arg5, 16383, this.field5605)) {
            if (arg2.field5629 == null || arg2.field5629.length < this.field5627) {
                int var19 = this.field5537;
                arg3.field5629 = arg2.field5629 = new float[var19];
                arg3.field5621 = arg2.field5621 = new float[var19];
            } else {
                arg3.field5629 = arg2.field5629;
                arg3.field5621 = arg2.field5621;
            }
            for (int var20 = 0; var20 < this.field5537; var20++) {
                arg3.field5629[var20] = this.field5629[var20];
                arg3.field5621[var20] = this.field5621[var20];
            }
        } else {
            arg3.field5629 = this.field5629;
            arg3.field5621 = this.field5621;
        }
        if (class438.method2601(arg5, 121, this.field5605)) {
            arg3.field5598 = arg2.field5598;
            arg3.field5598.field6481 = this.field5598.field6481;
            arg3.field5598.field6485 = true;
            arg3.field5598.field6484 = this.field5598.field6484;
        } else if (class162.method1149(this.field5605, arg5, 95)) {
            arg3.field5598 = this.field5598;
        } else {
            arg3.field5598 = null;
        }
        if (class505.method2876(arg5, 4, this.field5605)) {
            if (arg2.field5603 == null || this.field5627 > arg2.field5603.length) {
                int var21 = this.field5627;
                arg3.field5603 = arg2.field5603 = new short[var21];
                arg3.field5575 = arg2.field5575 = new short[var21];
                arg3.field5595 = arg2.field5595 = new short[var21];
            } else {
                arg3.field5595 = arg2.field5595;
                arg3.field5603 = arg2.field5603;
                arg3.field5575 = arg2.field5575;
            }
            for (int var22 = 0; var22 < this.field5627; var22++) {
                arg3.field5603[var22] = this.field5603[var22];
                arg3.field5575[var22] = this.field5575[var22];
                arg3.field5595[var22] = this.field5595[var22];
            }
        } else {
            arg3.field5603 = this.field5603;
            arg3.field5575 = this.field5575;
            arg3.field5595 = this.field5595;
        }
        if (class673.method3781(-2231, arg5, this.field5605)) {
            arg3.field5538 = arg2.field5538;
            arg3.field5538.field3045 = true;
            arg3.field5538.field3033 = this.field5538.field3033;
            arg3.field5538.field3038 = this.field5538.field3038;
        } else if (class317.method1970(-1, this.field5605, arg5)) {
            arg3.field5538 = this.field5538;
        } else {
            arg3.field5538 = null;
        }
        if (class301.method1895(this.field5605, arg5, (byte) -53)) {
            if (arg2.field5641 == null || arg2.field5641.length < this.field5627) {
                int var23 = this.field5627;
                arg3.field5641 = arg2.field5641 = new short[var23];
            } else {
                arg3.field5641 = arg2.field5641;
            }
            for (int var24 = 0; var24 < this.field5627; var24++) {
                arg3.field5641[var24] = this.field5641[var24];
            }
        } else {
            arg3.field5641 = this.field5641;
        }
        if (!class232.method1439(this.field5605, (byte) -125, arg5)) {
            arg3.field5634 = this.field5634;
        } else if (arg2.field5634 == null || this.field5640 > arg2.field5634.length) {
            int var26 = this.field5640;
            arg3.field5634 = arg2.field5634 = new class240[var26];
            for (int var27 = 0; var27 < this.field5640; var27++) {
                arg3.field5634[var27] = this.field5634[var27].method1476(520);
            }
        } else {
            arg3.field5634 = arg2.field5634;
            for (int var25 = 0; var25 < this.field5640; var25++) {
                arg3.field5634[var25].method1477(this.field5634[var25], 55);
            }
        }
        arg3.field5622 = this.field5622;
        arg3.field5542 = this.field5542;
        arg3.field5574 = this.field5574;
        arg3.field5545 = this.field5545;
        arg3.field5655 = this.field5655;
        arg3.field5585 = this.field5585;
        arg3.field5589 = this.field5589;
        arg3.field5624 = this.field5624;
        arg3.field5581 = this.field5581;
        arg3.field5577 = this.field5577;
        arg3.field5531 = this.field5531;
        if (this.field5578) {
            arg3.field5610 = this.field5610;
            arg3.field5578 = true;
            arg3.field5608 = this.field5608;
            arg3.field5559 = this.field5559;
            arg3.field5532 = this.field5532;
            arg3.field5636 = this.field5636;
            arg3.field5616 = this.field5616;
            arg3.field5572 = this.field5572;
            arg3.field5662 = this.field5662;
        } else {
            arg3.field5578 = false;
        }
        arg3.field5604 = this.field5604;
        arg3.field5555 = this.field5555;
        arg3.field5547 = this.field5547;
        arg3.field5600 = this.field5600;
        return arg3;
    }

    @OriginalMember(owner = "client!de", name = "S", descriptor = "(Lha;)Lha;", line = 1971)
    public final class425 method1031(class425 arg0) {
        field5588++;
        if (this.field5537 == 0) {
            return null;
        }
        if (!this.field5578) {
            this.method2315((byte) 127);
        }
        int var2;
        int var3;
        if (this.field5613.field7748 <= 0) {
            var2 = this.field5616 - (this.field5613.field7748 * this.field5572 >> 8) >> this.field5613.field7767;
            var3 = this.field5532 - (this.field5613.field7748 * this.field5636 >> 8) >> this.field5613.field7767;
        } else {
            var2 = this.field5616 - (this.field5613.field7748 * this.field5636 >> 8) >> this.field5613.field7767;
            var3 = this.field5532 - (this.field5613.field7748 * this.field5572 >> 8) >> this.field5613.field7767;
        }
        int var4;
        int var5;
        if (this.field5613.field7722 <= 0) {
            var4 = this.field5610 - (this.field5613.field7722 * this.field5572 >> 8) >> this.field5613.field7767;
            var5 = this.field5662 - (this.field5613.field7722 * this.field5636 >> 8) >> this.field5613.field7767;
        } else {
            var4 = this.field5610 - (this.field5613.field7722 * this.field5636 >> 8) >> this.field5613.field7767;
            var5 = this.field5662 - (this.field5613.field7722 * this.field5572 >> 8) >> this.field5613.field7767;
        }
        int var6 = var3 + 1 - var2;
        int var7 = var5 + 1 - var4;
        class392 var8 = (class392) arg0;
        class392 var9;
        if (var8 != null && var8.method2428(var7, var6, (byte) -17)) {
            var9 = var8;
            var8.method2432((byte) 0);
        } else {
            var9 = new class392(this.field5613, var6, var7);
        }
        var9.method2425(var5, -83, var2, var3, var4);
        this.method2307(-6, var9);
        return var9;
    }

    @OriginalMember(owner = "client!de", name = "na", descriptor = "()I", line = 2033)
    public final int method1029() {
        field5652++;
        return this.field5609;
    }

    @OriginalMember(owner = "client!de", name = "PA", descriptor = "()I", line = 2041)
    public final int method1027() {
        field5597++;
        return this.field5606;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(BIZ)Lda;", line = 2053)
    public final class395 method1038(byte arg0, int arg1, boolean arg2) {
        field5529++;
        class375 var4;
        class375 var5;
        if (arg0 == 1) {
            var4 = this.field5613.field7783;
            var5 = this.field5613.field7795;
        } else if (arg0 == 2) {
            var4 = this.field5613.field7794;
            var5 = this.field5613.field7789;
        } else if (arg0 == 3) {
            var5 = this.field5613.field7793;
            var4 = this.field5613.field7784;
        } else if (arg0 == 4) {
            var4 = this.field5613.field7796;
            var5 = this.field5613.field7785;
        } else if (arg0 == 5) {
            var5 = this.field5613.field7790;
            var4 = this.field5613.field7787;
        } else {
            var4 = var5 = new class375(this.field5613, 0, 0, true, false);
        }
        return this.method2308(false, arg2, var5, var4, arg0 != 0, arg1);
    }

    @OriginalMember(owner = "client!de", name = "e", descriptor = "(I)V", line = 2110)
    public static void method2309(int arg0) {
        field5543 = null;
        field5661 = null;
        if (arg0 == -5032) {
            field5658 = null;
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(Lq;Lqh;II)V", line = 2122)
    public final void method1030(class151 arg0, class67 arg1, int arg2, int arg3) {
        field5632++;
        if (this.field5537 == 0) {
            return;
        }
        class300 var5 = this.field5613.field7676;
        if (!this.field5578) {
            this.method2315((byte) 124);
        }
        class300 var6 = (class300) arg0;
        class235.field3095 = var5.field4432 * var6.field4404 + var5.field4436 * var6.field4418 + var5.field4404 * var6.field4415;
        class92.field1398 = var5.field4432 * var6.field4402 + var5.field4436 * var6.field4434 + var5.field4404 * var6.field4401 + var5.field4402;
        float var7 = (float) this.field5572 * class235.field3095 + class92.field1398;
        float var8 = (float) this.field5636 * class235.field3095 + class92.field1398;
        float var9;
        float var10;
        if (var8 < var7) {
            var9 = var8 - (float) this.field5608;
            var10 = (float) this.field5608 + var7;
        } else {
            var10 = (float) this.field5608 + var8;
            var9 = (float) (-this.field5608) + var7;
        }
        if ((var9 >= this.field5613.field7695) || ((float) this.field5613.field7738 >= var10)) {
            return;
        }
        class441.field6410 = var5.field4439 * var6.field4402 + var5.field4438 * var6.field4434 + var5.field4418 * var6.field4401 + var5.field4434;
        class668.field9448 = var5.field4439 * var6.field4404 + var5.field4438 * var6.field4418 + var5.field4418 * var6.field4415;
        float var11 = (float) this.field5572 * class668.field9448 + class441.field6410;
        float var12 = (float) this.field5636 * class668.field9448 + class441.field6410;
        float var13;
        float var14;
        if ((var11 > var12)) {
            var13 = ((float) (-this.field5608) + var12) * (float) this.field5613.field7686;
            var14 = ((float) this.field5608 + var11) * (float) this.field5613.field7686;
        } else {
            var13 = ((float) (-this.field5608) + var11) * (float) this.field5613.field7686;
            var14 = ((float) this.field5608 + var12) * (float) this.field5613.field7686;
        }
        if ((var13 / (float) arg2 >= this.field5613.field7760) || (var14 / (float) arg2 <= this.field5613.field7691)) {
            return;
        }
        class56.field884 = var5.field4414 * var6.field4402 + var5.field4431 * var6.field4434 + var5.field4415 * var6.field4401 + var5.field4401;
        class112.field1708 = var5.field4414 * var6.field4404 + var5.field4431 * var6.field4418 + var5.field4415 * var6.field4415;
        float var15 = (float) this.field5572 * class112.field1708 + class56.field884;
        float var16 = (float) this.field5636 * class112.field1708 + class56.field884;
        float var17;
        float var18;
        if ((var16 < var15)) {
            var17 = ((float) this.field5608 + var15) * (float) this.field5613.field7697;
            var18 = ((float) (-this.field5608) + var16) * (float) this.field5613.field7697;
        } else {
            var17 = ((float) this.field5608 + var16) * (float) this.field5613.field7697;
            var18 = ((float) (-this.field5608) + var15) * (float) this.field5613.field7697;
        }
        if ((var18 / (float) arg2 >= this.field5613.field7703) || (this.field5613.field7720 >= var17 / (float) arg2)) {
            return;
        }
        if (arg1 != null || this.field5574 != null) {
            class252.field3300 = var5.field4414 * var6.field4436 + var5.field4431 * var6.field4438 + var5.field4415 * var6.field4431;
            class41.field612 = var5.field4439 * var6.field4432 + var5.field4438 * var6.field4439 + var5.field4418 * var6.field4414;
            class406.field6071 = var5.field4432 * var6.field4432 + var5.field4436 * var6.field4439 + var5.field4404 * var6.field4414;
            class483.field6896 = var5.field4432 * var6.field4436 + var5.field4436 * var6.field4438 + var5.field4404 * var6.field4431;
            class77.field1252 = var5.field4414 * var6.field4432 + var5.field4431 * var6.field4439 + var5.field4415 * var6.field4414;
            class397.field6002 = var5.field4439 * var6.field4436 + var5.field4438 * var6.field4438 + var5.field4418 * var6.field4431;
        }
        if (arg1 != null) {
            int var19 = this.field5616 + this.field5532 >> 1;
            int var20 = this.field5610 + this.field5662 >> 1;
            int var21 = (int) ((float) var20 * class41.field612 + (float) this.field5572 * class668.field9448 + (float) var19 * class397.field6002 + class441.field6410);
            int var22 = (int) ((float) var20 * class77.field1252 + (float) this.field5572 * class112.field1708 + (float) var19 * class252.field3300 + class56.field884);
            int var23 = (int) ((float) var20 * class406.field6071 + (float) this.field5572 * class235.field3095 + (float) var19 * class483.field6896 + class92.field1398);
            int var24 = (int) ((float) var20 * class41.field612 + (float) this.field5636 * class668.field9448 + (float) var19 * class397.field6002 + class441.field6410);
            int var25 = (int) ((float) var20 * class77.field1252 + (float) this.field5636 * class112.field1708 + (float) var19 * class252.field3300 + class56.field884);
            arg1.field1056 = this.field5613.field7686 * var24 / arg2 + this.field5613.field7763;
            int var26 = (int) ((float) var20 * class406.field6071 + (float) this.field5636 * class235.field3095 + (float) var19 * class483.field6896 + class92.field1398);
            arg1.field1055 = this.field5613.field7697 * var22 / arg2 + this.field5613.field7757;
            arg1.field1058 = this.field5613.field7697 * var25 / arg2 + this.field5613.field7757;
            arg1.field1059 = this.field5613.field7763 + (this.field5613.field7686 * var21 / arg2);
            if (this.field5613.field7738 <= var23 || var26 >= this.field5613.field7738) {
                arg1.field1057 = true;
                arg1.field1060 = (this.field5608 + var21) * this.field5613.field7686 / arg2 + this.field5613.field7763 - arg1.field1059;
            }
        }
        this.field5613.method3036((byte) 5, (float) arg2);
        this.field5613.method3042((byte) -127);
        this.field5613.method3006(115, var6);
        this.method2306(21851);
        this.method2324(false);
    }

    @OriginalMember(owner = "client!de", name = "SA", descriptor = "(I)V", line = 2265)
    public final void method1017(int arg0) {
        field5582++;
        if (this.field5590 != null) {
            this.field5590.field6485 = class334.method2047(this.field5605, arg0, 0);
        }
        if (this.field5598 != null) {
            this.field5598.field6485 = class438.method2601(arg0, 45, this.field5605);
        }
        if (this.field5568 != null) {
            this.field5568.field6485 = class115.method855(this.field5605, arg0, -1148);
        }
        if (this.field5633 != null) {
            this.field5633.field6485 = class403.method2487(0, this.field5605, arg0);
        }
        this.field5606 = arg0;
        if (this.field5558 != null && (this.field5606 & 0x10000) == 0) {
            this.field5576 = this.field5558.field6106;
            this.field5646 = this.field5558.field6101;
            this.field5649 = this.field5558.field6108;
            this.field5544 = this.field5558.field6104;
            this.field5558 = null;
        }
        this.field5586 = true;
        this.method2314(-118);
    }

    @OriginalMember(owner = "client!de", name = "b", descriptor = "()V", line = 2300)
    public final void method1016() {
        field5561++;
        if (this.field5537 > 0 && this.field5540 > 0) {
            this.method2317((byte) 100);
            this.method2321(-1452408722);
            this.method2314(-89);
        }
    }

    @OriginalMember(owner = "client!de", name = "l", descriptor = "()I", line = 2314)
    public final int method1009() {
        field5535++;
        if (!this.field5578) {
            this.method2315((byte) 116);
        }
        return this.field5532;
    }

    @OriginalMember(owner = "client!de", name = "TA", descriptor = "()I", line = 2332)
    public final int method1015() {
        field5557++;
        return this.field5593;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(Lq;Lqh;I)V", line = 2340)
    public final void method1054(class151 arg0, class67 arg1, int arg2) {
        field5580++;
        if (this.field5537 == 0) {
            return;
        }
        class300 var4 = this.field5613.field7676;
        class300 var5 = (class300) arg0;
        if (!this.field5578) {
            this.method2315((byte) 125);
        }
        class92.field1398 = var4.field4432 * var5.field4402 + var4.field4436 * var5.field4434 + var4.field4404 * var5.field4401 + var4.field4402;
        class235.field3095 = var4.field4432 * var5.field4404 + var4.field4436 * var5.field4418 + var4.field4404 * var5.field4415;
        float var6 = (float) this.field5572 * class235.field3095 + class92.field1398;
        float var7 = (float) this.field5636 * class235.field3095 + class92.field1398;
        float var8;
        float var9;
        if (var6 > var7) {
            var8 = var7 - (float) this.field5608;
            var9 = (float) this.field5608 + var6;
        } else {
            var9 = (float) this.field5608 + var7;
            var8 = var6 - (float) this.field5608;
        }
        if ((this.field5613.field7689 <= var8) || (var9 <= (float) this.field5613.field7738)) {
            return;
        }
        class668.field9448 = var4.field4439 * var5.field4404 + var4.field4438 * var5.field4418 + var4.field4418 * var5.field4415;
        class441.field6410 = var4.field4439 * var5.field4402 + var4.field4438 * var5.field4434 + var4.field4418 * var5.field4401 + var4.field4434;
        float var10 = (float) this.field5572 * class668.field9448 + class441.field6410;
        float var11 = (float) this.field5636 * class668.field9448 + class441.field6410;
        float var12;
        float var13;
        if ((var10 > var11)) {
            var12 = (var11 - (float) this.field5608) * (float) this.field5613.field7686;
            var13 = ((float) this.field5608 + var10) * (float) this.field5613.field7686;
        } else {
            var12 = ((float) (-this.field5608) + var10) * (float) this.field5613.field7686;
            var13 = ((float) this.field5608 + var11) * (float) this.field5613.field7686;
        }
        if ((var12 / var9 >= this.field5613.field7760) || (this.field5613.field7691 >= var13 / var9)) {
            return;
        }
        class56.field884 = var4.field4414 * var5.field4402 + var4.field4431 * var5.field4434 + var4.field4415 * var5.field4401 + var4.field4401;
        class112.field1708 = var4.field4414 * var5.field4404 + var4.field4431 * var5.field4418 + var4.field4415 * var5.field4415;
        float var14 = (float) this.field5572 * class112.field1708 + class56.field884;
        float var15 = (float) this.field5636 * class112.field1708 + class56.field884;
        float var16;
        float var17;
        if ((var14 > var15)) {
            var16 = ((float) this.field5608 + var14) * (float) this.field5613.field7697;
            var17 = ((float) (-this.field5608) + var15) * (float) this.field5613.field7697;
        } else {
            var16 = ((float) this.field5608 + var15) * (float) this.field5613.field7697;
            var17 = ((float) (-this.field5608) + var14) * (float) this.field5613.field7697;
        }
        if ((var17 / var9 >= this.field5613.field7703) || (var16 / var9 <= this.field5613.field7720)) {
            return;
        }
        if (arg1 != null || this.field5574 != null) {
            class77.field1252 = var4.field4414 * var5.field4432 + var4.field4431 * var5.field4439 + var4.field4415 * var5.field4414;
            class397.field6002 = var4.field4439 * var5.field4436 + var4.field4438 * var5.field4438 + var4.field4418 * var5.field4431;
            class252.field3300 = var4.field4414 * var5.field4436 + var4.field4431 * var5.field4438 + var4.field4415 * var5.field4431;
            class406.field6071 = var4.field4432 * var5.field4432 + var4.field4436 * var5.field4439 + var4.field4404 * var5.field4414;
            class483.field6896 = var4.field4432 * var5.field4436 + var4.field4436 * var5.field4438 + var4.field4404 * var5.field4431;
            class41.field612 = var4.field4439 * var5.field4432 + var4.field4438 * var5.field4439 + var4.field4418 * var5.field4414;
        }
        if (arg1 != null) {
            boolean var18 = false;
            boolean var19 = true;
            int var20 = this.field5616 + this.field5532 >> 1;
            int var21 = this.field5662 + this.field5610 >> 1;
            int var22 = (int) ((float) var21 * class41.field612 + (float) this.field5572 * class668.field9448 + (float) var20 * class397.field6002 + class441.field6410);
            int var23 = (int) ((float) var21 * class77.field1252 + (float) this.field5572 * class112.field1708 + (float) var20 * class252.field3300 + class56.field884);
            int var24 = (int) ((float) var21 * class406.field6071 + (float) this.field5572 * class235.field3095 + (float) var20 * class483.field6896 + class92.field1398);
            if (this.field5613.field7738 > var24) {
                var18 = true;
            } else {
                arg1.field1055 = this.field5613.field7697 * var23 / var24 + this.field5613.field7757;
                arg1.field1059 = this.field5613.field7686 * var22 / var24 + this.field5613.field7763;
            }
            int var25 = (int) ((float) var21 * class41.field612 + (float) this.field5636 * class668.field9448 + (float) var20 * class397.field6002 + class441.field6410);
            int var26 = (int) ((float) var21 * class77.field1252 + (float) this.field5636 * class112.field1708 + (float) var20 * class252.field3300 + class56.field884);
            int var27 = (int) ((float) var21 * class406.field6071 + (float) this.field5636 * class235.field3095 + (float) var20 * class483.field6896 + class92.field1398);
            if (this.field5613.field7738 <= var27) {
                arg1.field1058 = this.field5613.field7697 * var26 / var27 + this.field5613.field7757;
                arg1.field1056 = this.field5613.field7686 * var25 / var27 + this.field5613.field7763;
            } else {
                var18 = true;
            }
            if (var18) {
                if (var24 < this.field5613.field7738 && var27 < this.field5613.field7738) {
                    var19 = false;
                } else if (this.field5613.field7738 > var24) {
                    int var28 = (var27 - this.field5613.field7738 << 16) / (var27 - var24);
                    int var29 = ((var25 - var22) * var28 >> 16) + var25;
                    int var30 = ((var26 - var23) * var28 >> 16) + var26;
                    arg1.field1059 = this.field5613.field7686 * var29 / this.field5613.field7738 + this.field5613.field7763;
                    arg1.field1055 = this.field5613.field7697 * var30 / this.field5613.field7738 + this.field5613.field7757;
                } else if (var27 < this.field5613.field7738) {
                    int var31 = (var24 - this.field5613.field7738 << 16) / (var24 - var27);
                    int var32 = ((var22 - var25) * var31 >> 16) + var22;
                    int var33 = var23 + ((var23 - var26) * var31 >> 16);
                    arg1.field1059 = this.field5613.field7686 * var32 / this.field5613.field7738 + this.field5613.field7763;
                    arg1.field1055 = this.field5613.field7697 * var33 / this.field5613.field7738 + this.field5613.field7757;
                }
            }
            if (var19) {
                if (var27 >= var24) {
                    arg1.field1060 = (this.field5608 + var25) * this.field5613.field7686 / var27 + this.field5613.field7763 - arg1.field1056;
                } else {
                    arg1.field1060 = (this.field5608 + var22) * this.field5613.field7686 / var24 + this.field5613.field7763 - arg1.field1059;
                }
                arg1.field1057 = true;
            }
        }
        this.field5613.method2993(8);
        this.field5613.method3006(34, var5);
        this.method2306(21851);
        this.method2324(false);
    }

    @OriginalMember(owner = "client!de", name = "fa", descriptor = "(I)V", line = 2541)
    public final void method1037(int arg0) {
        field5644++;
        int var2 = class271.field3549[arg0];
        int var3 = class271.field3544[arg0];
        for (int var4 = 0; var4 < this.field5533; var4++) {
            int var7 = this.field5579[var4] * var3 + this.field5552[var4] * var2 >> 14;
            this.field5552[var4] = this.field5552[var4] * var3 - (this.field5579[var4] * var2) >> 14;
            this.field5579[var4] = var7;
        }
        for (int var5 = 0; var5 < this.field5537; var5++) {
            int var6 = this.field5649[var5] * var3 + this.field5576[var5] * var2 >> 14;
            this.field5576[var5] = (short) (this.field5576[var5] * var3 - (this.field5649[var5] * var2) >> 14);
            this.field5649[var5] = (short) var6;
        }
        this.method2327(-1);
        this.method2326(false);
        this.field5578 = false;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(IBIIIIIII)Z", line = 2582)
    private final boolean method2310(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field5602++;
        if (arg2 < arg6 && arg0 > arg2 && arg2 < arg8) {
            return false;
        }
        if (arg1 != -13) {
            this.method1042(47);
        }
        if (arg6 < arg2 && arg2 > arg0 && arg8 < arg2) {
            return false;
        } else if (arg5 > arg3 && arg3 < arg7 && arg3 < arg4) {
            return false;
        } else {
            return arg3 <= arg5 || arg3 <= arg7 || arg4 >= arg3;
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(ILuca;ILjava/lang/String;)Llk;", line = 2608)
    public static final class569 method2311(int arg0, class287 arg1, int arg2, String arg3) {
        field5618++;
        int var4 = OpenGL.glGenProgramARB();
        OpenGL.glBindProgramARB(arg0, var4);
        if (arg2 >= -18) {
            field5661 = null;
        }
        OpenGL.glProgramStringARB(arg0, 34933, arg3);
        OpenGL.glGetIntegerv(34379, class296.field4368, 0);
        if (class296.field4368[0] == -1) {
            OpenGL.glBindProgramARB(arg0, 0);
            return new class569(arg1, arg0, var4);
        } else {
            OpenGL.glBindProgramARB(arg0, 0);
            return null;
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(IIILuca;II)Lei;", line = 2633)
    public static final class506 method2312(int arg0, int arg1, int arg2, class287 arg3, int arg4, int arg5) {
        field5630++;
        if (arg4 != 0) {
            return null;
        } else if (!arg3.field4144 && (!class346.method2145(-1, arg2) || !class346.method2145(-1, arg0))) {
            return arg3.field4132 ? new class506(arg3, 34037, arg1, arg5, arg2, arg0, true) : new class506(arg3, arg1, arg5, arg2, arg0, class240.method1478(-28325, arg2), class240.method1478(-28325, arg0), true);
        } else {
            return new class506(arg3, 3553, arg1, arg5, arg2, arg0, true);
        }
    }

    @OriginalMember(owner = "client!de", name = "c", descriptor = "()V", line = 2652)
    public final void method1051() {
        field5639++;
    }

    @OriginalMember(owner = "client!de", name = "R", descriptor = "(III)V", line = 2662)
    public final void method1033(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field5533; var4++) {
            if (arg0 != 128) {
                this.field5579[var4] = this.field5579[var4] * arg0 >> 7;
            }
            if (arg1 != 128) {
                this.field5654[var4] = this.field5654[var4] * arg1 >> 7;
            }
            if (arg2 != 128) {
                this.field5552[var4] = this.field5552[var4] * arg2 >> 7;
            }
        }
        field5614++;
        this.method2327(-1);
        this.field5578 = false;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(ILq;ZIBI)Z", line = 2699)
    private final boolean method2313(int arg0, class151 arg1, boolean arg2, int arg3, byte arg4, int arg5) {
        field5551++;
        if (arg4 < 105) {
            return true;
        }
        class300 var7 = (class300) arg1;
        class300 var8 = this.field5613.field7676;
        float var9 = var7.field4402 * var8.field4439 + var7.field4434 * var8.field4438 + var7.field4401 * var8.field4418 + var8.field4434;
        float var10 = var7.field4402 * var8.field4414 + var7.field4434 * var8.field4431 + var7.field4401 * var8.field4415 + var8.field4401;
        class77.field1252 = var7.field4432 * var8.field4414 + var7.field4439 * var8.field4431 + var7.field4414 * var8.field4415;
        class252.field3300 = var7.field4436 * var8.field4414 + var7.field4438 * var8.field4431 + var7.field4431 * var8.field4415;
        class406.field6071 = var7.field4432 * var8.field4432 + var7.field4439 * var8.field4436 + var7.field4414 * var8.field4404;
        class397.field6002 = var7.field4436 * var8.field4439 + var7.field4438 * var8.field4438 + var7.field4431 * var8.field4418;
        float var11 = var7.field4402 * var8.field4432 + var7.field4434 * var8.field4436 + var7.field4401 * var8.field4404 + var8.field4402;
        class112.field1708 = var7.field4404 * var8.field4414 + var7.field4418 * var8.field4431 + var7.field4415 * var8.field4415;
        class235.field3095 = var7.field4404 * var8.field4432 + var7.field4418 * var8.field4436 + var7.field4415 * var8.field4404;
        class41.field612 = var7.field4432 * var8.field4439 + var7.field4439 * var8.field4438 + var7.field4414 * var8.field4418;
        class483.field6896 = var7.field4436 * var8.field4432 + var7.field4438 * var8.field4436 + var7.field4431 * var8.field4404;
        class668.field9448 = var7.field4404 * var8.field4439 + var7.field4418 * var8.field4438 + var7.field4415 * var8.field4418;
        boolean var12 = false;
        float var13 = Float.MAX_VALUE;
        float var14 = -3.4028235E38F;
        float var15 = Float.MAX_VALUE;
        float var16 = -3.4028235E38F;
        int var17 = this.field5613.field7686;
        int var18 = this.field5613.field7697;
        if (!this.field5578) {
            this.method2315((byte) 120);
        }
        class520.field7292[0] = this.field5616;
        class74.field1162[0] = this.field5572;
        class520.field7292[1] = this.field5532;
        class270.field3539[0] = this.field5610;
        class74.field1162[1] = this.field5572;
        class270.field3539[1] = this.field5610;
        class520.field7292[2] = this.field5616;
        class74.field1162[2] = this.field5636;
        class270.field3539[2] = this.field5610;
        class520.field7292[3] = this.field5532;
        class74.field1162[3] = this.field5636;
        class270.field3539[3] = this.field5610;
        class520.field7292[4] = this.field5616;
        class74.field1162[4] = this.field5572;
        class520.field7292[5] = this.field5532;
        class270.field3539[4] = this.field5662;
        class74.field1162[5] = this.field5572;
        class520.field7292[6] = this.field5616;
        class270.field3539[5] = this.field5662;
        class74.field1162[6] = this.field5636;
        class270.field3539[6] = this.field5662;
        class520.field7292[7] = this.field5532;
        class74.field1162[7] = this.field5636;
        class270.field3539[7] = this.field5662;
        for (int var19 = 0; var19 < 8; var19++) {
            float var38 = (float) class270.field3539[var19];
            float var39 = (float) class520.field7292[var19];
            float var40 = (float) class74.field1162[var19];
            float var41 = class406.field6071 * var38 + class483.field6896 * var39 + class235.field3095 * var40 + var11;
            float var42 = class41.field612 * var38 + class668.field9448 * var40 + class397.field6002 * var39 + var9;
            float var43 = class77.field1252 * var38 + class252.field3300 * var39 + class112.field1708 * var40 + var10;
            if ((float) this.field5613.field7738 <= var41) {
                if (arg0 > 0) {
                    var41 = arg0;
                }
                float var44 = (float) var17 * var42 / var41 + (float) this.field5613.field7763;
                if (var44 < var13) {
                    var13 = var44;
                }
                if (var14 < var44) {
                    var14 = var44;
                }
                float var45 = (float) var18 * var43 / var41 + (float) this.field5613.field7757;
                if (var45 < var15) {
                    var15 = var45;
                }
                if (var16 < var45) {
                    var16 = var45;
                }
                var12 = true;
            }
        }
        if (var12 && var13 < (float) arg3 && var14 > (float) arg3 && (float) arg5 > var15 && var16 > (float) arg5) {
            if (arg2) {
                return true;
            }
            if (this.field5537 > class236.field3102.length) {
                class236.field3102 = new int[this.field5537];
                class550.field8100 = new int[this.field5537];
            }
            for (int var20 = 0; var20 < this.field5533; var20++) {
                float var22 = (float) this.field5579[var20];
                float var23 = (float) this.field5654[var20];
                float var24 = (float) this.field5552[var20];
                float var25 = class77.field1252 * var24 + class252.field3300 * var22 + class112.field1708 * var23 + var10;
                float var26 = class41.field612 * var24 + class668.field9448 * var23 + class397.field6002 * var22 + var9;
                float var27 = class406.field6071 * var24 + class483.field6896 * var22 + class235.field3095 * var23 + var11;
                if ((var27 >= (float) this.field5613.field7738)) {
                    if (arg0 > 0) {
                        var27 = arg0;
                    }
                    int var32 = (int) ((float) var17 * var26 / var27 + (float) this.field5613.field7763);
                    int var33 = (int) ((float) var18 * var25 / var27 + (float) this.field5613.field7757);
                    int var34 = this.field5604[var20];
                    int var35 = this.field5604[var20 + 1];
                    for (int var36 = var34; var36 < var35; var36++) {
                        int var37 = this.field5531[var36] - 1;
                        if (var37 == -1) {
                            break;
                        }
                        class236.field3102[var37] = var32;
                        class550.field8100[var37] = var33;
                    }
                } else {
                    int var28 = this.field5604[var20];
                    int var29 = this.field5604[var20 + 1];
                    for (int var30 = var28; var30 < var29; var30++) {
                        int var31 = this.field5531[var30] - 1;
                        if (var31 == -1) {
                            break;
                        }
                        class236.field3102[this.field5531[var30] - 1] = -999999;
                    }
                }
            }
            for (int var21 = 0; var21 < this.field5627; var21++) {
                if (class236.field3102[this.field5603[var21]] != -999999 && class236.field3102[this.field5575[var21]] != -999999 && class236.field3102[this.field5595[var21]] != -999999 && this.method2310(class550.field8100[this.field5575[var21]], (byte) -13, arg5, arg3, class236.field3102[this.field5595[var21]], class236.field3102[this.field5603[var21]], class550.field8100[this.field5603[var21]], class236.field3102[this.field5575[var21]], class550.field8100[this.field5595[var21]])) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!de", name = "H", descriptor = "()I", line = 2918)
    public final int method1011() {
        if (!this.field5578) {
            this.method2315((byte) 122);
        }
        field5596++;
        return this.field5636;
    }

    @OriginalMember(owner = "client!de", name = "ga", descriptor = "(I)V", line = 2930)
    public final void method1010(int arg0) {
        this.field5609 = (short) arg0;
        field5653++;
        this.method2327(-1);
        this.method2326(false);
    }

    @OriginalMember(owner = "client!de", name = "f", descriptor = "(I)V", line = 2946)
    private final void method2314(int arg0) {
        if (arg0 > -63) {
            this.method1008();
        }
        field5566++;
        if (!this.field5586) {
            return;
        }
        this.field5586 = false;
        if (this.field5585 == null && this.field5624 == null && this.field5574 == null) {
            if (this.field5579 != null && !class442.method2615((byte) -82, this.field5605, this.field5606)) {
                if (this.field5590 == null || this.field5590.method2641(73)) {
                    if (!this.field5578) {
                        this.method2315((byte) 121);
                    }
                    this.field5579 = null;
                } else {
                    this.field5586 = true;
                }
            }
            if (this.field5654 != null && !class85.method480(this.field5606, this.field5605, false)) {
                if (this.field5590 == null || this.field5590.method2641(19)) {
                    if (!this.field5578) {
                        this.method2315((byte) 122);
                    }
                    this.field5654 = null;
                } else {
                    this.field5586 = true;
                }
            }
            if (this.field5552 != null && !class38.method221(this.field5605, 27700, this.field5606)) {
                if (this.field5590 == null || this.field5590.method2641(123)) {
                    if (!this.field5578) {
                        this.method2315((byte) 122);
                    }
                    this.field5552 = null;
                } else {
                    this.field5586 = true;
                }
            }
        }
        if (this.field5531 != null && this.field5579 == null && this.field5654 == null && this.field5552 == null) {
            this.field5604 = null;
            this.field5531 = null;
        }
        if (this.field5646 != null && !class631.method3625((byte) 16, this.field5606, this.field5605)) {
            label202: {
                label201: {
                    boolean var10000;
                    if ((this.field5605 & 0x37) == 0) {
                        if (this.field5568 == null || this.field5568.method2641(74)) {
                            break label201;
                        }
                        var10000 = false;
                    } else {
                        if (this.field5633 == null || this.field5633.method2641(107)) {
                            break label201;
                        }
                        var10000 = false;
                    }
                    if (!var10000) {
                        this.field5586 = true;
                        break label202;
                    }
                }
                this.field5649 = this.field5544 = this.field5576 = null;
                this.field5646 = null;
            }
        }
        if (this.field5592 != null && !class399.method2477(this.field5606, this.field5605, (byte) 87)) {
            if (this.field5568 == null || this.field5568.method2641(101)) {
                this.field5592 = null;
            } else {
                this.field5586 = true;
            }
        }
        if (this.field5642 != null && !class460.method2683(this.field5605, this.field5606, 262144)) {
            if (this.field5568 == null || this.field5568.method2641(42)) {
                this.field5642 = null;
            } else {
                this.field5586 = true;
            }
        }
        if (this.field5629 != null && !class660.method3715(this.field5606, this.field5605, (byte) -124)) {
            if (this.field5598 == null || this.field5598.method2641(97)) {
                this.field5629 = this.field5621 = null;
            } else {
                this.field5586 = true;
            }
        }
        if (this.field5641 != null && !class306.method1920(this.field5605, 5, this.field5606)) {
            if (this.field5568 == null || this.field5568.method2641(118)) {
                this.field5641 = null;
            } else {
                this.field5586 = true;
            }
        }
        if (this.field5603 != null && !class542.method3184(this.field5606, -1, this.field5605)) {
            if ((this.field5538 == null || this.field5538.method1430((byte) 108)) && (this.field5568 == null || this.field5568.method2641(94))) {
                this.field5603 = this.field5575 = this.field5595 = null;
            } else {
                this.field5586 = true;
            }
        }
        if (this.field5589 != null) {
            if (this.field5590 == null || this.field5590.method2641(55)) {
                this.field5589 = null;
            } else {
                this.field5586 = true;
            }
        }
        if (this.field5577 != null) {
            if (this.field5568 == null || this.field5568.method2641(60)) {
                this.field5577 = null;
            } else {
                this.field5586 = true;
            }
        }
        if (this.field5555 != null && !class216.method1369(384, this.field5605, this.field5606)) {
            this.field5555 = null;
            this.field5545 = null;
        }
        if (this.field5622 != null && !class115.method857(15547, this.field5605, this.field5606)) {
            this.field5622 = null;
            this.field5581 = null;
        }
        if (this.field5655 != null && !class217.method1373((byte) -69, this.field5605, this.field5606)) {
            this.field5655 = null;
        }
        if (this.field5547 != null && (this.field5606 & 0x800) == 0 && (this.field5606 & 0x40000) == 0) {
            this.field5600 = null;
            this.field5542 = null;
            this.field5547 = null;
        }
    }

    @OriginalMember(owner = "client!de", name = "b", descriptor = "(B)V", line = 3124)
    private final void method2315(byte arg0) {
        field5548++;
        int var2 = 32767;
        int var3 = 32767;
        int var4 = 32767;
        int var5 = -32768;
        int var6 = -32768;
        int var7 = -32768;
        int var8 = 0;
        int var9 = 0;
        if (arg0 < 112) {
            return;
        }
        for (int var10 = 0; var10 < this.field5533; var10++) {
            int var11 = this.field5579[var10];
            int var12 = this.field5654[var10];
            if (var11 < var2) {
                var2 = var11;
            }
            if (var11 > var5) {
                var5 = var11;
            }
            int var13 = this.field5552[var10];
            if (var12 < var3) {
                var3 = var12;
            }
            if (var6 < var12) {
                var6 = var12;
            }
            if (var13 < var4) {
                var4 = var13;
            }
            if (var7 < var13) {
                var7 = var13;
            }
            int var14 = var11 * var11 + (var13 * var13);
            if (var8 < var14) {
                var8 = var14;
            }
            int var15 = var12 * var12 + (var11 * var11 + (var13 * var13));
            if (var9 < var15) {
                var9 = var15;
            }
        }
        this.field5610 = var4;
        this.field5616 = var2;
        this.field5662 = var7;
        this.field5572 = var3;
        this.field5532 = var5;
        this.field5636 = var6;
        this.field5608 = (int) (Math.sqrt((double) var8) + 0.99D);
        this.field5559 = (int) (Math.sqrt((double) var9) + 0.99D);
        this.field5578 = true;
    }

    @OriginalMember(owner = "client!de", name = "L", descriptor = "()V", line = 3207)
    public final void method1040() {
        for (int var1 = 0; var1 < this.field5647; var1++) {
            this.field5579[var1] = this.field5579[var1] + 7 >> 4;
            this.field5654[var1] = this.field5654[var1] + 7 >> 4;
            this.field5552[var1] = this.field5552[var1] + 7 >> 4;
        }
        field5530++;
        this.method2327(-1);
        this.field5578 = false;
    }

    @OriginalMember(owner = "client!de", name = "c", descriptor = "(B)V", line = 3227)
    public static final void method2316(byte arg0) {
        if (class528.field7602 < 1024.0F) {
            class528.field7602 = 1024.0F;
        }
        field5564++;
        if (class528.field7602 > 3072.0F) {
            class528.field7602 = 3072.0F;
        }
        while (class311.field4589 >= 16384.0F) {
            class311.field4589 -= 16384.0F;
        }
        while (class311.field4589 < 0.0F) {
            class311.field4589 += 16384.0F;
        }
        int var1 = class677.field9587 >> 9;
        if (arg0 <= 9) {
            field5631 = -66;
        }
        int var2 = class502.field7101 >> 9;
        int var3 = class504.method2870((byte) -121, class502.field7101, class677.field9587, class49.field779);
        int var4 = 0;
        if (var1 > 3 && var2 > 3 && class72.field1144 - 4 > var1 && class668.field9444 - 4 > var2) {
            for (int var5 = var1 - 4; var5 <= var1 + 4; var5++) {
                for (int var6 = var2 - 4; var6 <= var2 + 4; var6++) {
                    int var7 = class49.field779;
                    if (var7 < 3 && class125.method898(-65, var5, var6)) {
                        var7++;
                    }
                    int var8 = 0;
                    if (class619.field8968.field9743 != null && class619.field8968.field9743[var7] != null) {
                        var8 = (class619.field8968.field9743[var7][var5][var6] & 0xFF) * 8;
                    }
                    if (class178.field2480 != null && class178.field2480[var7] != null) {
                        int var9 = var3 + var8 - class178.field2480[var7].method3822(var6, var5, 0);
                        if (var4 < var9) {
                            var4 = var9;
                        }
                    }
                }
            }
        }
        int var10 = (var4 >> 2) * 1536;
        if (var10 > 786432) {
            var10 = 786432;
        }
        if (var10 < 262144) {
            var10 = 262144;
        }
        if (var10 > class265.field3474) {
            class265.field3474 += (var10 - class265.field3474) / 24;
        } else if (var10 < class265.field3474) {
            class265.field3474 += (var10 - class265.field3474) / 80;
            return;
        }
    }

    @OriginalMember(owner = "client!de", name = "DA", descriptor = "(SS)V", line = 3314)
    public final void method1045(short arg0, short arg1) {
        field5554++;
        class615 var3 = this.field5613.field1491;
        for (int var4 = 0; var4 < this.field5627; var4++) {
            if (this.field5641[var4] == arg0) {
                this.field5641[var4] = arg1;
            }
        }
        byte var5 = 0;
        byte var6 = 0;
        if (arg0 != -1) {
            class457 var7 = var3.method955(-1330, arg0 & 0xFFFF);
            var5 = var7.field6603;
            var6 = var7.field6611;
        }
        byte var8 = 0;
        byte var9 = 0;
        if (arg1 != -1) {
            class457 var10 = var3.method955(-1330, arg1 & 0xFFFF);
            var8 = var10.field6603;
            var9 = var10.field6611;
        }
        if (!var6 != var9 | var5 != var8) {
            return;
        }
        if (this.field5574 != null) {
            for (int var11 = 0; var11 < this.field5640; var11++) {
                class339 var12 = this.field5574[var11];
                class240 var13 = this.field5634[var11];
                var13.field3163 = var13.field3163 & 0xFF000000 | class391.field5908[this.field5592[var12.field4923] & 0xFFFF] & 0xFFFFFF;
            }
        }
        this.method2305(127);
    }

    @OriginalMember(owner = "client!de", name = "d", descriptor = "(B)Z", line = 3382)
    private final boolean method2317(byte arg0) {
        field5534++;
        boolean var2 = !this.field5568.field6481;
        boolean var3 = (this.field5605 & 0x37) != 0 && !this.field5633.field6481;
        boolean var4 = !this.field5590.field6481;
        boolean var5 = !this.field5598.field6481;
        if (arg0 <= 82) {
            this.method1034(24, -19, -128, -3);
        }
        if (!var4 && !var2 && !var3 && !var5) {
            return true;
        }
        boolean var6 = true;
        if (var4) {
            if (this.field5590.field6486 == null) {
                this.field5590.field6486 = this.field5613.method806(10, this.field5620);
            }
            class184 var7 = this.field5590.field6486;
            var7.method1229(this.field5537 * 12, 12, 29812);
            Buffer var8 = var7.method1231(true, 3696);
            if (var8 == null) {
                var6 = false;
            } else {
                this.field5613.field7588.copyPositions(this.field5579, this.field5654, this.field5552, this.field5589, 0, 12, this.field5537, var8.getAddress());
                if (var7.method1230(-110)) {
                    this.field5590.field6484 = var7;
                    this.field5590.field6481 = true;
                } else {
                    var6 = false;
                }
            }
        }
        if (var2) {
            if (this.field5568.field6486 == null) {
                this.field5568.field6486 = this.field5613.method806(10, this.field5620);
            }
            class184 var9 = this.field5568.field6486;
            var9.method1229(this.field5537 * 4, 4, 29812);
            Buffer var10 = var9.method1231(true, 3696);
            if (var10 == null) {
                var6 = false;
            } else {
                if ((this.field5605 & 0x37) == 0) {
                    short[] var11;
                    short[] var12;
                    short[] var13;
                    byte[] var14;
                    if (this.field5558 == null) {
                        var11 = this.field5649;
                        var13 = this.field5544;
                        var12 = this.field5576;
                        var14 = this.field5646;
                    } else {
                        var11 = this.field5558.field6108;
                        var12 = this.field5558.field6106;
                        var13 = this.field5558.field6104;
                        var14 = this.field5558.field6101;
                    }
                    this.field5613.field7588.copyLighting(this.field5592, this.field5642, this.field5641, var11, var13, var12, var14, this.field5593, this.field5609, this.field5577, 0, 4, this.field5537, var10.getAddress());
                } else {
                    this.field5613.field7588.copyColours(this.field5592, this.field5642, this.field5641, this.field5593, this.field5577, 0, 4, this.field5537, var10.getAddress());
                }
                if (var9.method1230(-127)) {
                    this.field5568.field6481 = true;
                    this.field5568.field6484 = var9;
                } else {
                    var6 = false;
                }
            }
        }
        if (var3) {
            if (this.field5633.field6486 == null) {
                this.field5633.field6486 = this.field5613.method806(10, this.field5620);
            }
            class184 var15 = this.field5633.field6486;
            var15.method1229(this.field5537 * 12, 12, 29812);
            Buffer var16 = var15.method1231(true, 3696);
            if (var16 == null) {
                var6 = false;
            } else {
                byte[] var17;
                short[] var18;
                short[] var19;
                short[] var20;
                if (this.field5558 == null) {
                    var17 = this.field5646;
                    var18 = this.field5544;
                    var19 = this.field5649;
                    var20 = this.field5576;
                } else {
                    var17 = this.field5558.field6101;
                    var18 = this.field5558.field6104;
                    var19 = this.field5558.field6108;
                    var20 = this.field5558.field6106;
                }
                this.field5613.field7588.copyNormals(var19, var18, var20, var17, 3.0F / (float) this.field5609, 3.0F / (float) (this.field5609 / 2 + this.field5609), 0, 12, this.field5537, var16.getAddress());
                if (var15.method1230(-81)) {
                    this.field5633.field6484 = var15;
                    this.field5633.field6481 = true;
                } else {
                    var6 = false;
                }
            }
        }
        if (var5) {
            if (this.field5598.field6486 == null) {
                this.field5598.field6486 = this.field5613.method806(10, this.field5620);
            }
            class184 var21 = this.field5598.field6486;
            var21.method1229(this.field5537 * 8, 8, 29812);
            Buffer var22 = var21.method1231(true, 3696);
            if (var22 == null) {
                var6 = false;
            } else {
                this.field5613.field7588.copyTexCoords(this.field5629, this.field5621, 0, 8, this.field5537, var22.getAddress());
                if (var21.method1230(-86)) {
                    this.field5598.field6484 = var21;
                    this.field5598.field6481 = true;
                } else {
                    var6 = false;
                }
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!de", name = "KA", descriptor = "()I", line = 3576)
    public final int method1012() {
        field5628++;
        if (!this.field5578) {
            this.method2315((byte) 118);
        }
        return this.field5616;
    }

    @OriginalMember(owner = "client!de", name = "FA", descriptor = "()V", line = 3589)
    public final void method1025() {
        for (int var1 = 0; var1 < this.field5533; var1++) {
            this.field5552[var1] = -this.field5552[var1];
        }
        field5563++;
        for (int var2 = 0; var2 < this.field5537; var2++) {
            this.field5576[var2] = (short) (-this.field5576[var2]);
        }
        for (int var3 = 0; var3 < this.field5627; var3++) {
            short var4 = this.field5603[var3];
            this.field5603[var3] = this.field5595[var3];
            this.field5595[var3] = var4;
        }
        this.method2327(-1);
        this.method2326(false);
        this.method2320(256);
        this.field5578 = false;
    }

    @OriginalMember(owner = "client!de", name = "d", descriptor = "(SS)V", line = 3628)
    public final void method1052(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field5627; var3++) {
            if (this.field5592[var3] == arg0) {
                this.field5592[var3] = arg1;
            }
        }
        field5591++;
        if (this.field5574 != null) {
            for (int var4 = 0; var4 < this.field5640; var4++) {
                class339 var5 = this.field5574[var4];
                class240 var6 = this.field5634[var4];
                var6.field3163 = class391.field5908[this.field5592[var5.field4923] & 0xFFFF] & 0xFFFFFF | var6.field3163 & 0xFF000000;
            }
        }
        this.method2305(127);
    }

    @OriginalMember(owner = "client!de", name = "f", descriptor = "()V", line = 3668)
    public final void method1028() {
        field5573++;
    }

    @OriginalMember(owner = "client!de", name = "RA", descriptor = "()I", line = 3677)
    public final int method1018() {
        field5612++;
        if (!this.field5578) {
            this.method2315((byte) 121);
        }
        return this.field5559;
    }

    @OriginalMember(owner = "client!de", name = "F", descriptor = "()Z", line = 3696)
    public final boolean method1023() {
        field5549++;
        if (this.field5622 == null) {
            return false;
        }
        for (int var1 = 0; var1 < this.field5647; var1++) {
            this.field5579[var1] <<= 0x4;
            this.field5654[var1] <<= 0x4;
            this.field5552[var1] <<= 0x4;
        }
        class342.field5067 = 0;
        class71.field1112 = 0;
        class309.field4565 = 0;
        return true;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(IIII)V", line = 3727)
    public final void method1047(int arg0, int arg1, int arg2, int arg3) {
        for (int var5 = 0; var5 < this.field5627; var5++) {
            int var9 = this.field5592[var5] & 0xFFFF;
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
            this.field5592[var5] = (short) class151.method1076(class151.method1076(var11 << 7, var10 << 10), var12);
        }
        field5648++;
        if (this.field5574 != null) {
            for (int var6 = 0; var6 < this.field5640; var6++) {
                class339 var7 = this.field5574[var6];
                class240 var8 = this.field5634[var6];
                var8.field3163 = class391.field5908[this.field5592[var7.field4923] & 0xFFFF] & 0xFFFFFF | var8.field3163 & 0xFF000000;
            }
        }
        this.method2305(127);
    }

    @OriginalMember(owner = "client!de", name = "e", descriptor = "(B)V", line = 3783)
    public final void method2318(byte arg0) {
        if (arg0 < 44) {
            return;
        }
        field5539++;
        if (this.field5590 != null) {
            this.field5590.method2639(true);
        }
        if (this.field5598 != null) {
            this.field5598.method2639(true);
        }
        if (this.field5568 != null) {
            this.field5568.method2639(true);
        }
        if (this.field5633 != null) {
            this.field5633.method2639(true);
        }
        if (this.field5538 != null) {
            this.field5538.method1426((byte) 101);
        }
    }

    @OriginalMember(owner = "client!de", name = "za", descriptor = "()I", line = 3818)
    public final int method1039() {
        field5645++;
        if (!this.field5578) {
            this.method2315((byte) 113);
        }
        return this.field5662;
    }

    @OriginalMember(owner = "client!de", name = "M", descriptor = "(I)V", line = 3839)
    public final void method1042(int arg0) {
        field5584++;
        int var2 = class271.field3549[arg0];
        int var3 = class271.field3544[arg0];
        for (int var4 = 0; var4 < this.field5533; var4++) {
            int var5 = this.field5579[var4] * var3 + this.field5552[var4] * var2 >> 14;
            this.field5552[var4] = this.field5552[var4] * var3 - this.field5579[var4] * var2 >> 14;
            this.field5579[var4] = var5;
        }
        this.method2327(-1);
        this.field5578 = false;
    }

    @OriginalMember(owner = "client!de", name = "g", descriptor = "(I)V", line = 3866)
    public static final void method2319(int arg0) {
        if (class629.field9108 >= 0) {
            long var1 = class60.method371(false);
            class629.field9108 = (int) ((long) class629.field9108 - (var1 - class157.field2238));
            if (class629.field9108 > 0) {
                int var3 = (class629.field9108 << 8) / class230.field3050;
                int var4 = 255 - var3;
                float var5 = (float) var3 / 255.0F;
                class19.field378 = ((class365.field5357 & 0xFF00) * var3 + ((class540.field7911.field6526 & 0xFF00) * var4) & 0xFF0000) + ((class365.field5357 & 0xFF00FF) * var3 + (class540.field7911.field6526 & 0xFF00FF) * var4 & 0xFF00FF00) >>> 8;
                float var6 = 1.0F - var5;
                class477.field6832 = (class540.field7911.field6533 - class379.field5707) * var6 + class379.field5707;
                class158.field2242 = (class540.field7911.field6530 - class305.field4521) * var6 + class305.field4521;
                class221.field2938 = class680.field9610 * var3 + class540.field7911.field6520 * var4 >> 8;
                class129.field1858 = (class540.field7911.field6516 - class541.field8025) * var6 + class541.field8025;
                class629.field9109 = (class540.field7911.field6521 - class162.field2297) * var6 + class162.field2297;
                class508.field7178 = (class540.field7911.field6534 - class187.field2530) * var6 + class187.field2530;
                class45.field684 = ((class229.field3044 & 0xFF00) * var3 + (class540.field7911.field6517 & 0xFF00) * var4 & 0xFF0000) + ((class229.field3044 & 0xFF00FF) * var3 + (class540.field7911.field6517 & 0xFF00FF) * var4 & 0xFF00FF00) >>> 8;
                class644.field9279 = (class540.field7911.field6524 - class313.field4590) * var6 + class313.field4590;
                if (class319.field4628 != class540.field7911.field6522) {
                    class274.field3590 = class170.field2401.method707(class319.field4628, class540.field7911.field6522, var6, class274.field3590);
                }
            } else {
                class629.field9109 = class540.field7911.field6521;
                class274.field3590 = class540.field7911.field6522;
                class19.field378 = class540.field7911.field6526;
                class45.field684 = class540.field7911.field6517;
                class508.field7178 = class540.field7911.field6534;
                class629.field9108 = -1;
                class129.field1858 = class540.field7911.field6516;
                class221.field2938 = class540.field7911.field6520;
                class158.field2242 = class540.field7911.field6530;
                class644.field9279 = class540.field7911.field6524;
                class477.field6832 = class540.field7911.field6533;
            }
            class157.field2238 = var1;
        }
        if (arg0 != 5) {
            field5657 = 2;
        }
        field5599++;
    }

    @OriginalMember(owner = "client!de", name = "h", descriptor = "(I)V", line = 3925)
    private final void method2320(int arg0) {
        if (this.field5538 != null) {
            this.field5538.field3033 = false;
        }
        if (arg0 == 256) {
            field5617++;
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(I[IIIIIZ)V", line = 3943)
    public final void method1046(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        field5570++;
        int var8 = arg1.length;
        if (arg0 == 0) {
            int var9 = arg3 << 4;
            int var10 = arg2 << 4;
            int var11 = arg4 << 4;
            class71.field1112 = 0;
            int var12 = 0;
            class309.field4565 = 0;
            class342.field5067 = 0;
            for (int var13 = 0; var13 < var8; var13++) {
                int var14 = arg1[var13];
                if (var14 < this.field5622.length) {
                    int[] var15 = this.field5622[var14];
                    for (int var16 = 0; var16 < var15.length; var16++) {
                        int var17 = var15[var16];
                        class342.field5067 += this.field5579[var17];
                        class71.field1112 += this.field5654[var17];
                        class309.field4565 += this.field5552[var17];
                        var12++;
                    }
                }
            }
            if (var12 <= 0) {
                class342.field5067 = var10;
                class309.field4565 = var11;
                class71.field1112 = var9;
            } else {
                class309.field4565 = class309.field4565 / var12 + var11;
                class342.field5067 = class342.field5067 / var12 + var10;
                class71.field1112 = class71.field1112 / var12 + var9;
            }
        } else if (arg0 == 1) {
            int var18 = arg2 << 4;
            int var19 = arg4 << 4;
            int var20 = arg3 << 4;
            for (int var21 = 0; var21 < var8; var21++) {
                int var22 = arg1[var21];
                if (this.field5622.length > var22) {
                    int[] var23 = this.field5622[var22];
                    for (int var24 = 0; var24 < var23.length; var24++) {
                        int var25 = var23[var24];
                        this.field5579[var25] += var18;
                        this.field5654[var25] += var20;
                        this.field5552[var25] += var19;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var26 = 0; var26 < var8; var26++) {
                int var45 = arg1[var26];
                if (var45 < this.field5622.length) {
                    int[] var46 = this.field5622[var45];
                    if ((arg5 & 0x1) == 0) {
                        for (int var58 = 0; var58 < var46.length; var58++) {
                            int var59 = var46[var58];
                            this.field5579[var59] -= class342.field5067;
                            this.field5654[var59] -= class71.field1112;
                            this.field5552[var59] -= class309.field4565;
                            if (arg4 != 0) {
                                int var60 = class271.field3549[arg4];
                                int var61 = class271.field3544[arg4];
                                int var62 = this.field5654[var59] * var60 + this.field5579[var59] * var61 + 16383 >> 14;
                                this.field5654[var59] = this.field5654[var59] * var61 + 16383 - (this.field5579[var59] * var60) >> 14;
                                this.field5579[var59] = var62;
                            }
                            if (arg2 != 0) {
                                int var63 = class271.field3549[arg2];
                                int var64 = class271.field3544[arg2];
                                int var65 = this.field5654[var59] * var64 + 16383 - (this.field5552[var59] * var63) >> 14;
                                this.field5552[var59] = this.field5654[var59] * var63 + this.field5552[var59] * var64 + 16383 >> 14;
                                this.field5654[var59] = var65;
                            }
                            if (arg3 != 0) {
                                int var66 = class271.field3549[arg3];
                                int var67 = class271.field3544[arg3];
                                int var68 = this.field5552[var59] * var66 + this.field5579[var59] * var67 + 16383 >> 14;
                                this.field5552[var59] = this.field5552[var59] * var67 + (16383 - (this.field5579[var59] * var66)) >> 14;
                                this.field5579[var59] = var68;
                            }
                            this.field5579[var59] += class342.field5067;
                            this.field5654[var59] += class71.field1112;
                            this.field5552[var59] += class309.field4565;
                        }
                    } else {
                        for (int var47 = 0; var47 < var46.length; var47++) {
                            int var48 = var46[var47];
                            this.field5579[var48] -= class342.field5067;
                            this.field5654[var48] -= class71.field1112;
                            this.field5552[var48] -= class309.field4565;
                            if (arg2 != 0) {
                                int var49 = class271.field3549[arg2];
                                int var50 = class271.field3544[arg2];
                                int var51 = this.field5654[var48] * var50 + 16383 - (this.field5552[var48] * var49) >> 14;
                                this.field5552[var48] = this.field5654[var48] * var49 + this.field5552[var48] * var50 + 16383 >> 14;
                                this.field5654[var48] = var51;
                            }
                            if (arg4 != 0) {
                                int var52 = class271.field3549[arg4];
                                int var53 = class271.field3544[arg4];
                                int var54 = this.field5654[var48] * var52 + this.field5579[var48] * var53 + 16383 >> 14;
                                this.field5654[var48] = this.field5654[var48] * var53 + 16383 - (this.field5579[var48] * var52) >> 14;
                                this.field5579[var48] = var54;
                            }
                            if (arg3 != 0) {
                                int var55 = class271.field3549[arg3];
                                int var56 = class271.field3544[arg3];
                                int var57 = this.field5552[var48] * var55 + (this.field5579[var48] * var56) + 16383 >> 14;
                                this.field5552[var48] = this.field5552[var48] * var56 + 16383 - (this.field5579[var48] * var55) >> 14;
                                this.field5579[var48] = var57;
                            }
                            this.field5579[var48] += class342.field5067;
                            this.field5654[var48] += class71.field1112;
                            this.field5552[var48] += class309.field4565;
                        }
                    }
                }
            }
            if (arg6) {
                for (int var27 = 0; var27 < var8; var27++) {
                    int var28 = arg1[var27];
                    if (this.field5622.length > var28) {
                        int[] var29 = this.field5622[var28];
                        for (int var30 = 0; var30 < var29.length; var30++) {
                            int var31 = var29[var30];
                            int var32 = this.field5604[var31];
                            int var33 = this.field5604[var31 + 1];
                            for (int var34 = var32; var34 < var33; var34++) {
                                int var35 = this.field5531[var34] - 1;
                                if (var35 == -1) {
                                    break;
                                }
                                if (arg4 != 0) {
                                    int var36 = class271.field3549[arg4];
                                    int var37 = class271.field3544[arg4];
                                    int var38 = this.field5649[var35] * var37 + this.field5544[var35] * var36 + 16383 >> 14;
                                    this.field5544[var35] = (short) (this.field5544[var35] * var37 + 16383 - (this.field5649[var35] * var36) >> 14);
                                    this.field5649[var35] = (short) var38;
                                }
                                if (arg2 != 0) {
                                    int var39 = class271.field3549[arg2];
                                    int var40 = class271.field3544[arg2];
                                    int var41 = this.field5544[var35] * var40 + 16383 - this.field5576[var35] * var39 >> 14;
                                    this.field5576[var35] = (short) (this.field5576[var35] * var40 + this.field5544[var35] * var39 + 16383 >> 14);
                                    this.field5544[var35] = (short) var41;
                                }
                                if (arg3 != 0) {
                                    int var42 = class271.field3549[arg3];
                                    int var43 = class271.field3544[arg3];
                                    int var44 = this.field5576[var35] * var42 + (this.field5649[var35] * var43) + 16383 >> 14;
                                    this.field5576[var35] = (short) (this.field5576[var35] * var43 + 16383 - (this.field5649[var35] * var42) >> 14);
                                    this.field5649[var35] = (short) var44;
                                }
                            }
                        }
                    }
                }
                this.method2326(false);
            }
        } else if (arg0 == 3) {
            for (int var69 = 0; var69 < var8; var69++) {
                int var70 = arg1[var69];
                if (this.field5622.length > var70) {
                    int[] var71 = this.field5622[var70];
                    for (int var72 = 0; var72 < var71.length; var72++) {
                        int var73 = var71[var72];
                        this.field5579[var73] -= class342.field5067;
                        this.field5654[var73] -= class71.field1112;
                        this.field5552[var73] -= class309.field4565;
                        this.field5579[var73] = this.field5579[var73] * arg2 >> 7;
                        this.field5654[var73] = this.field5654[var73] * arg3 >> 7;
                        this.field5552[var73] = this.field5552[var73] * arg4 >> 7;
                        this.field5579[var73] += class342.field5067;
                        this.field5654[var73] += class71.field1112;
                        this.field5552[var73] += class309.field4565;
                    }
                }
            }
        } else if (arg0 == 5) {
            if (this.field5555 != null) {
                boolean var74 = false;
                for (int var75 = 0; var75 < var8; var75++) {
                    int var79 = arg1[var75];
                    if (var79 < this.field5555.length) {
                        int[] var80 = this.field5555[var79];
                        for (int var81 = 0; var81 < var80.length; var81++) {
                            int var82 = var80[var81];
                            int var83 = (this.field5642[var82] & 0xFF) + (arg2 * 8);
                            if (var83 < 0) {
                                var83 = 0;
                            } else if (var83 > 255) {
                                var83 = 255;
                            }
                            this.field5642[var82] = (byte) var83;
                        }
                        var74 |= var80.length > 0;
                    }
                }
                if (var74) {
                    if (this.field5574 != null) {
                        for (int var76 = 0; var76 < this.field5640; var76++) {
                            class339 var77 = this.field5574[var76];
                            class240 var78 = this.field5634[var76];
                            var78.field3163 = 255 - (this.field5642[var77.field4923] & 0xFF) << 24 | var78.field3163 & 0xFFFFFF;
                        }
                    }
                    this.method2305(127);
                }
            }
        } else if (arg0 == 7) {
            if (this.field5555 != null) {
                boolean var84 = false;
                for (int var85 = 0; var85 < var8; var85++) {
                    int var89 = arg1[var85];
                    if (var89 < this.field5555.length) {
                        int[] var90 = this.field5555[var89];
                        for (int var91 = 0; var91 < var90.length; var91++) {
                            int var92 = var90[var91];
                            int var93 = this.field5592[var92] & 0xFFFF;
                            int var94 = var93 >> 10 & 0x3F;
                            int var95 = var93 >> 7 & 0x7;
                            int var96 = arg3 / 4 + var95;
                            int var97 = arg2 + var94 & 0x3F;
                            int var98 = var93 & 0x7F;
                            if (var96 < 0) {
                                var96 = 0;
                            } else if (var96 > 7) {
                                var96 = 7;
                            }
                            int var99 = arg4 + var98;
                            if (var99 < 0) {
                                var99 = 0;
                            } else if (var99 > 127) {
                                var99 = 127;
                            }
                            this.field5592[var92] = (short) class151.method1076(class151.method1076(var97 << 10, var96 << 7), var99);
                        }
                        var84 |= var90.length > 0;
                    }
                }
                if (var84) {
                    if (this.field5574 != null) {
                        for (int var86 = 0; var86 < this.field5640; var86++) {
                            class339 var87 = this.field5574[var86];
                            class240 var88 = this.field5634[var86];
                            var88.field3163 = var88.field3163 & 0xFF000000 | class391.field5908[this.field5592[var87.field4923] & 0xFFFF] & 0xFFFFFF;
                        }
                    }
                    this.method2305(127);
                }
            }
        } else if (arg0 == 8) {
            if (this.field5655 != null) {
                for (int var100 = 0; var100 < var8; var100++) {
                    int var101 = arg1[var100];
                    if (var101 < this.field5655.length) {
                        int[] var102 = this.field5655[var101];
                        for (int var103 = 0; var103 < var102.length; var103++) {
                            class240 var104 = this.field5634[var102[var103]];
                            var104.field3168 += arg2;
                            var104.field3157 += arg3;
                        }
                    }
                }
            }
        } else if (arg0 == 10) {
            if (this.field5655 != null) {
                for (int var105 = 0; var105 < var8; var105++) {
                    int var106 = arg1[var105];
                    if (this.field5655.length > var106) {
                        int[] var107 = this.field5655[var106];
                        for (int var108 = 0; var108 < var107.length; var108++) {
                            class240 var109 = this.field5634[var107[var108]];
                            var109.field3161 = var109.field3161 * arg3 >> 7;
                            var109.field3159 = var109.field3159 * arg2 >> 7;
                        }
                    }
                }
            }
        } else if (arg0 == 9 && this.field5655 != null) {
            for (int var110 = 0; var110 < var8; var110++) {
                int var111 = arg1[var110];
                if (var111 < this.field5655.length) {
                    int[] var112 = this.field5655[var111];
                    for (int var113 = 0; var113 < var112.length; var113++) {
                        class240 var114 = this.field5634[var112[var113]];
                        var114.field3169 = var114.field3169 + arg2 & 0x3FFF;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!de", name = "i", descriptor = "(I)Z", line = 4603)
    private final boolean method2321(int arg0) {
        field5625++;
        if (this.field5538.field3033) {
            return true;
        }
        if (this.field5538.field3039 == null) {
            this.field5538.field3039 = this.field5613.method800(this.field5620, -25475);
        }
        if (arg0 != -1452408722) {
            return true;
        }
        class532 var2 = this.field5538.field3039;
        var2.method984(this.field5540 * 6, arg0 ^ 0xA96E0011);
        Buffer var3 = var2.method985((byte) 76, true);
        if (var3 != null) {
            Stream var4 = this.field5613.method3038(-10641, var3);
            if (Stream.method2077()) {
                for (int var5 = 0; var5 < this.field5540; var5++) {
                    var4.method2083(this.field5603[var5]);
                    var4.method2083(this.field5575[var5]);
                    var4.method2083(this.field5595[var5]);
                }
            } else {
                for (int var6 = 0; var6 < this.field5540; var6++) {
                    var4.method2080(this.field5603[var6]);
                    var4.method2080(this.field5575[var6]);
                    var4.method2080(this.field5595[var6]);
                }
            }
            var4.method2084();
            if (var2.method986(true)) {
                this.field5538.field3033 = true;
                this.field5538.field3038 = var2;
                this.field5586 = true;
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(FILak;IIIJIIIF)S", line = 4670)
    private final short method2322(float arg0, int arg1, class677 arg2, int arg3, int arg4, int arg5, long arg6, int arg7, int arg8, int arg9, float arg10) {
        field5637++;
        int var13 = this.field5604[arg7];
        int var14 = this.field5604[arg7 + 1];
        int var15 = 0;
        for (int var16 = var13; var16 < var14; var16++) {
            short var17 = this.field5531[var16];
            if (var17 == 0) {
                var15 = var16;
                break;
            }
            if (class259.field3358[var16] == arg6) {
                return (short) (var17 - 1);
            }
        }
        this.field5531[var15] = (short) (this.field5537 + 1);
        class259.field3358[var15] = arg6;
        this.field5577[this.field5537] = (short) arg4;
        this.field5589[this.field5537] = (short) arg7;
        this.field5649[this.field5537] = (short) arg5;
        if (arg8 >= -14) {
            this.field5654 = null;
        }
        this.field5544[this.field5537] = (short) arg1;
        this.field5576[this.field5537] = (short) arg3;
        this.field5646[this.field5537] = (byte) arg9;
        this.field5629[this.field5537] = arg0;
        this.field5621[this.field5537] = arg10;
        return (short) (this.field5537++);
    }

    @OriginalMember(owner = "client!de", name = "OA", descriptor = "()I", line = 4725)
    public final int method1053() {
        field5567++;
        if (!this.field5578) {
            this.method2315((byte) 127);
        }
        return this.field5610;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(Lda;IIIZ)V", line = 4737)
    public final void method1055(class395 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field5638++;
        class375 var6 = (class375) arg0;
        if (this.field5627 == 0 || var6.field5627 == 0) {
            return;
        }
        int var7 = var6.field5533;
        int[] var8 = var6.field5579;
        int[] var9 = var6.field5654;
        int[] var10 = var6.field5552;
        short[] var11 = var6.field5649;
        short[] var12 = var6.field5544;
        short[] var13 = var6.field5576;
        byte[] var14 = var6.field5646;
        short[] var15;
        byte[] var16;
        short[] var17;
        short[] var18;
        if (this.field5558 == null) {
            var15 = null;
            var16 = null;
            var17 = null;
            var18 = null;
        } else {
            var15 = this.field5558.field6106;
            var17 = this.field5558.field6104;
            var18 = this.field5558.field6108;
            var16 = this.field5558.field6101;
        }
        short[] var19;
        byte[] var20;
        short[] var21;
        short[] var22;
        if (var6.field5558 == null) {
            var19 = null;
            var20 = null;
            var21 = null;
            var22 = null;
        } else {
            var20 = var6.field5558.field6101;
            var21 = var6.field5558.field6106;
            var19 = var6.field5558.field6104;
            var22 = var6.field5558.field6108;
        }
        int[] var23 = var6.field5604;
        short[] var24 = var6.field5531;
        if (!var6.field5578) {
            var6.method2315((byte) 122);
        }
        int var25 = var6.field5572;
        int var26 = var6.field5636;
        int var27 = var6.field5616;
        int var28 = var6.field5532;
        int var29 = var6.field5610;
        int var30 = var6.field5662;
        for (int var31 = 0; var31 < this.field5533; var31++) {
            int var32 = this.field5654[var31] - arg2;
            if (var32 >= var25 && var26 >= var32) {
                int var33 = this.field5579[var31] - arg1;
                if (var33 >= var27 && var33 <= var28) {
                    int var34 = this.field5552[var31] - arg3;
                    if (var29 <= var34 && var34 <= var30) {
                        int var35 = -1;
                        int var36 = this.field5604[var31];
                        int var37 = this.field5604[var31 + 1];
                        for (int var38 = var36; var38 < var37; var38++) {
                            var35 = this.field5531[var38] - 1;
                            if (var35 == -1 || this.field5646[var35] != 0) {
                                break;
                            }
                        }
                        if (var35 != -1) {
                            for (int var39 = 0; var39 < var7; var39++) {
                                if (var8[var39] == var33 && var10[var39] == var34 && var9[var39] == var32) {
                                    int var40 = -1;
                                    int var41 = var23[var39];
                                    int var42 = var23[var39 + 1];
                                    for (int var43 = var41; var43 < var42; var43++) {
                                        var40 = var24[var43] - 1;
                                        if (var40 == -1 || var14[var40] != 0) {
                                            break;
                                        }
                                    }
                                    if (var40 != -1) {
                                        if (var18 == null) {
                                            this.field5558 = new class410();
                                            var18 = this.field5558.field6108 = class476.method2736(-93, this.field5649);
                                            var17 = this.field5558.field6104 = class476.method2736(-74, this.field5544);
                                            var15 = this.field5558.field6106 = class476.method2736(-67, this.field5576);
                                            var16 = this.field5558.field6101 = class487.method2783(true, this.field5646);
                                        }
                                        if (var22 == null) {
                                            class410 var44 = var6.field5558 = new class410();
                                            var22 = var44.field6108 = class476.method2736(-88, var11);
                                            var19 = var44.field6104 = class476.method2736(-127, var12);
                                            var21 = var44.field6106 = class476.method2736(-79, var13);
                                            var20 = var44.field6101 = class487.method2783(true, var14);
                                        }
                                        short var45 = this.field5649[var35];
                                        short var46 = this.field5544[var35];
                                        short var47 = this.field5576[var35];
                                        int var48 = var23[var39 + 1];
                                        byte var49 = this.field5646[var35];
                                        int var50 = var23[var39];
                                        for (int var51 = var50; var51 < var48; var51++) {
                                            int var52 = var24[var51] - 1;
                                            if (var52 == -1) {
                                                break;
                                            }
                                            if (var20[var52] != 0) {
                                                var22[var52] += var45;
                                                var19[var52] += var46;
                                                var21[var52] += var47;
                                                var20[var52] += var49;
                                            }
                                        }
                                        short var53 = var11[var40];
                                        int var54 = this.field5604[var31];
                                        short var55 = var12[var40];
                                        byte var56 = var14[var40];
                                        short var57 = var13[var40];
                                        int var58 = this.field5604[var31 + 1];
                                        for (int var59 = var54; var59 < var58; var59++) {
                                            int var60 = this.field5531[var59] - 1;
                                            if (var60 == -1) {
                                                break;
                                            }
                                            if (var16[var60] != 0) {
                                                var18[var60] += var53;
                                                var17[var60] += var55;
                                                var15[var60] += var57;
                                                var16[var60] += var56;
                                            }
                                        }
                                        var6.method2326(false);
                                        this.method2326(false);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(Lq;IZ)V", line = 4996)
    public final void method1043(class151 arg0, int arg1, boolean arg2) {
        field5643++;
        if (this.field5581 == null) {
            return;
        }
        int[] var4 = new int[3];
        for (int var5 = 0; var5 < this.field5533; var5++) {
            if ((arg1 & this.field5581[var5]) != 0) {
                if (arg2) {
                    arg0.method885(this.field5579[var5], this.field5654[var5], this.field5552[var5], var4);
                } else {
                    arg0.method892(this.field5579[var5], this.field5654[var5], this.field5552[var5], var4);
                }
                this.field5579[var5] = var4[0];
                this.field5654[var5] = var4[1];
                this.field5552[var5] = var4[2];
            }
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "()Z", line = 5029)
    public final boolean method1008() {
        field5562++;
        if (this.field5641 == null) {
            return true;
        }
        for (int var1 = 0; var1 < this.field5641.length; var1++) {
            if (this.field5641[var1] != -1 && !this.field5613.field1491.method956(this.field5641[var1], 15925)) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!de", name = "W", descriptor = "(I)V", line = 5055)
    public final void method1044(int arg0) {
        field5556++;
        int var2 = class271.field3549[arg0];
        int var3 = class271.field3544[arg0];
        for (int var4 = 0; var4 < this.field5533; var4++) {
            int var5 = this.field5654[var4] * var2 + this.field5579[var4] * var3 >> 14;
            this.field5654[var4] = this.field5654[var4] * var3 - (this.field5579[var4] * var2) >> 14;
            this.field5579[var4] = var5;
        }
        this.method2327(-1);
        this.field5578 = false;
    }

    @OriginalMember(owner = "client!de", name = "LA", descriptor = "()Z", line = 5091)
    public final boolean method1024() {
        field5615++;
        return this.field5601;
    }

    @OriginalMember(owner = "client!de", name = "d", descriptor = "()[Lil;", line = 5099)
    public final class586[] method1058() {
        field5569++;
        return this.field5624;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(IBIIIIII)V", line = 5109)
    public static final void method2323(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field5583++;
        int var8 = class79.method461((byte) 92, class148.field2106, arg0, class323.field4704);
        int var9 = class79.method461((byte) 47, class148.field2106, arg5, class323.field4704);
        int var10 = class79.method461((byte) 101, field5631, arg3, class175.field2455);
        int var11 = class79.method461((byte) 44, field5631, arg7, class175.field2455);
        int var12 = class79.method461((byte) 111, class148.field2106, arg0 + arg4, class323.field4704);
        int var13 = class79.method461((byte) 123, class148.field2106, arg5 - arg4, class323.field4704);
        for (int var14 = var8; var14 < var12; var14++) {
            class41.method235(var10, class565.field8253[var14], 0, var11, arg6);
        }
        for (int var15 = var9; var15 > var13; var15--) {
            class41.method235(var10, class565.field8253[var15], 0, var11, arg6);
        }
        int var16 = class79.method461((byte) 41, field5631, arg3 + arg4, class175.field2455);
        int var17 = class79.method461((byte) 50, field5631, arg7 - arg4, class175.field2455);
        if (arg1 != 9) {
            method2309(-54);
        }
        for (int var18 = var12; var18 <= var13; var18++) {
            int[] var19 = class565.field8253[var18];
            class41.method235(var10, var19, 0, var16, arg6);
            class41.method235(var16, var19, 0, var17, arg2);
            class41.method235(var17, var19, 0, var11, arg6);
        }
    }

    @OriginalMember(owner = "client!de", name = "WA", descriptor = "(IIII)V", line = 5163)
    public final void method1034(int arg0, int arg1, int arg2, int arg3) {
        field5560++;
        if (arg0 == 0) {
            class309.field4565 = 0;
            int var5 = 0;
            class71.field1112 = 0;
            class342.field5067 = 0;
            for (int var6 = 0; var6 < this.field5533; var6++) {
                class342.field5067 += this.field5579[var6];
                class71.field1112 += this.field5654[var6];
                class309.field4565 += this.field5552[var6];
                var5++;
            }
            if (var5 <= 0) {
                class71.field1112 = arg2;
                class342.field5067 = arg1;
                class309.field4565 = arg3;
            } else {
                class309.field4565 = class309.field4565 / var5 + arg3;
                class71.field1112 = class71.field1112 / var5 + arg2;
                class342.field5067 = class342.field5067 / var5 + arg1;
            }
        } else if (arg0 == 1) {
            for (int var7 = 0; var7 < this.field5533; var7++) {
                this.field5579[var7] += arg1;
                this.field5654[var7] += arg2;
                this.field5552[var7] += arg3;
            }
        } else if (arg0 == 2) {
            for (int var8 = 0; var8 < this.field5533; var8++) {
                this.field5579[var8] -= class342.field5067;
                this.field5654[var8] -= class71.field1112;
                this.field5552[var8] -= class309.field4565;
                if (arg3 != 0) {
                    int var9 = class271.field3549[arg3];
                    int var10 = class271.field3544[arg3];
                    int var11 = this.field5654[var8] * var9 + this.field5579[var8] * var10 + 16383 >> 14;
                    this.field5654[var8] = this.field5654[var8] * var10 + 16383 - (this.field5579[var8] * var9) >> 14;
                    this.field5579[var8] = var11;
                }
                if (arg1 != 0) {
                    int var12 = class271.field3549[arg1];
                    int var13 = class271.field3544[arg1];
                    int var14 = this.field5654[var8] * var13 + 16383 - (this.field5552[var8] * var12) >> 14;
                    this.field5552[var8] = this.field5654[var8] * var12 + this.field5552[var8] * var13 + 16383 >> 14;
                    this.field5654[var8] = var14;
                }
                if (arg2 != 0) {
                    int var15 = class271.field3549[arg2];
                    int var16 = class271.field3544[arg2];
                    int var17 = this.field5579[var8] * var16 + (this.field5552[var8] * var15 + 16383) >> 14;
                    this.field5552[var8] = this.field5552[var8] * var16 + 16383 - this.field5579[var8] * var15 >> 14;
                    this.field5579[var8] = var17;
                }
                this.field5579[var8] += class342.field5067;
                this.field5654[var8] += class71.field1112;
                this.field5552[var8] += class309.field4565;
            }
        } else if (arg0 == 3) {
            for (int var18 = 0; var18 < this.field5533; var18++) {
                this.field5579[var18] -= class342.field5067;
                this.field5654[var18] -= class71.field1112;
                this.field5552[var18] -= class309.field4565;
                this.field5579[var18] = this.field5579[var18] * arg1 / 128;
                this.field5654[var18] = this.field5654[var18] * arg2 / 128;
                this.field5552[var18] = this.field5552[var18] * arg3 / 128;
                this.field5579[var18] += class342.field5067;
                this.field5654[var18] += class71.field1112;
                this.field5552[var18] += class309.field4565;
            }
        } else if (arg0 == 5) {
            for (int var19 = 0; var19 < this.field5627; var19++) {
                int var23 = (this.field5642[var19] & 0xFF) + arg1 * 8;
                if (var23 < 0) {
                    var23 = 0;
                } else if (var23 > 255) {
                    var23 = 255;
                }
                this.field5642[var19] = (byte) var23;
            }
            if (this.field5574 != null) {
                for (int var20 = 0; var20 < this.field5640; var20++) {
                    class339 var21 = this.field5574[var20];
                    class240 var22 = this.field5634[var20];
                    var22.field3163 = var22.field3163 & 0xFFFFFF | 255 - (this.field5642[var21.field4923] & 0xFF) << 24;
                }
            }
            this.method2305(127);
        } else if (arg0 == 7) {
            for (int var24 = 0; var24 < this.field5627; var24++) {
                int var28 = this.field5592[var24] & 0xFFFF;
                int var29 = var28 >> 10 & 0x3F;
                int var30 = var28 >> 7 & 0x7;
                int var31 = var28 & 0x7F;
                int var32 = arg2 / 4 + var30;
                int var33 = arg1 + var29 & 0x3F;
                int var34 = arg3 + var31;
                if (var32 < 0) {
                    var32 = 0;
                } else if (var32 > 7) {
                    var32 = 7;
                }
                if (var34 < 0) {
                    var34 = 0;
                } else if (var34 > 127) {
                    var34 = 127;
                }
                this.field5592[var24] = (short) class151.method1076(var34, class151.method1076(var32 << 7, var33 << 10));
            }
            if (this.field5574 != null) {
                for (int var25 = 0; var25 < this.field5640; var25++) {
                    class339 var26 = this.field5574[var25];
                    class240 var27 = this.field5634[var25];
                    var27.field3163 = class391.field5908[this.field5592[var26.field4923] & 0xFFFF] & 0xFFFFFF | var27.field3163 & 0xFF000000;
                }
            }
            this.method2305(127);
        } else if (arg0 == 8) {
            for (int var35 = 0; var35 < this.field5640; var35++) {
                class240 var36 = this.field5634[var35];
                var36.field3157 += arg2;
                var36.field3168 += arg1;
            }
        } else if (arg0 == 10) {
            for (int var37 = 0; var37 < this.field5640; var37++) {
                class240 var38 = this.field5634[var37];
                var38.field3159 = var38.field3159 * arg1 >> 7;
                var38.field3161 = var38.field3161 * arg2 >> 7;
            }
        } else if (arg0 == 9) {
            for (int var39 = 0; var39 < this.field5640; var39++) {
                class240 var40 = this.field5634[var39];
                var40.field3169 = var40.field3169 + arg1 & 0x3FFF;
            }
        }
    }

    @OriginalMember(owner = "client!de", name = "oa", descriptor = "(III)V", line = 5462)
    public final void method1019(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field5533; var4++) {
            if (arg0 != 0) {
                this.field5579[var4] += arg0;
            }
            if (arg1 != 0) {
                this.field5654[var4] += arg1;
            }
            if (arg2 != 0) {
                this.field5552[var4] += arg2;
            }
        }
        field5541++;
        this.method2327(-1);
        this.field5578 = false;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(Z)V", line = 5495)
    private final void method2324(boolean arg0) {
        if (this.field5574 != null) {
            this.field5613.method636(!this.field5601);
            this.field5613.method2994(0, false);
            this.field5613.method3025(class475.field6812, -1, 1);
            this.field5613.method3019(1, 0, class475.field6812);
            for (int var2 = 0; var2 < this.field5640; var2++) {
                class339 var3 = this.field5574[var2];
                class240 var4 = this.field5634[var2];
                if (!var3.field4920 || !this.field5613.method705()) {
                    float var5 = (float) (this.field5579[var3.field4918] + this.field5579[var3.field4924] + this.field5579[var3.field4929]) * 0.3333333F;
                    float var6 = (float) (this.field5654[var3.field4918] + this.field5654[var3.field4924] + this.field5654[var3.field4929]) * 0.3333333F;
                    float var7 = (float) (this.field5552[var3.field4929] + this.field5552[var3.field4918] + this.field5552[var3.field4924]) * 0.3333333F;
                    float var8 = class41.field612 * var7 + class668.field9448 * var6 + class397.field6002 * var5 + class441.field6410;
                    float var9 = class77.field1252 * var7 + class252.field3300 * var5 + class112.field1708 * var6 + class56.field884;
                    float var10 = class406.field6071 * var7 + class483.field6896 * var5 + class235.field3095 * var6 + class92.field1398;
                    class300 var11 = this.field5613.method3014(-11433);
                    var11.method1869(var4.field3169, (float) var4.field3168 + var8, 0, var3.field4925 * var4.field3161 >> 7, (float) var4.field3157 + var9, var10 - (float) var3.field4917, var3.field4927 * var4.field3159 >> 7);
                    var11.method1883(0, this.field5613.field7678);
                    this.field5613.method2989((byte) -18);
                    int var12 = var4.field3163;
                    this.field5613.method3058(false, var3.field4921, (byte) -128, false);
                    this.field5613.method3068(123, var3.field4922);
                    this.field5613.method3028(var12, arg0);
                    this.field5613.method2995((byte) 114);
                }
            }
            this.field5613.method3019(1, 0, class11.field273);
            this.field5613.method3025(class11.field273, -1, 1);
            this.field5613.method636(true);
        }
        if (arg0) {
            method2325(81, -67, 76, 40, -68, -116, -38, 57, -20);
        }
        field5611++;
    }

    @OriginalMember(owner = "client!de", name = "MA", descriptor = "(I)V", line = 5565)
    public final void method1048(int arg0) {
        field5626++;
        int var2 = class271.field3549[arg0];
        int var3 = class271.field3544[arg0];
        for (int var4 = 0; var4 < this.field5533; var4++) {
            int var5 = this.field5654[var4] * var3 - (this.field5552[var4] * var2) >> 14;
            this.field5552[var4] = this.field5654[var4] * var2 + this.field5552[var4] * var3 >> 14;
            this.field5654[var4] = var5;
        }
        this.method2327(-1);
        this.field5578 = false;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(IIIIIIIII)V", line = 5592)
    public static final void method2325(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field5650++;
        int var9 = -72 % ((66 - arg8) / 37);
        class281.method1669(0, arg5, arg3, arg6, arg1, arg7, -513, arg0, arg2, arg4);
    }

    @OriginalMember(owner = "client!de", name = "B", descriptor = "(I[IIIIZI[I)V", line = 5604)
    public final void method1049(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7) {
        field5587++;
        int var9 = arg1.length;
        if (arg0 == 0) {
            int var10 = arg3 << 4;
            int var11 = arg2 << 4;
            int var12 = arg4 << 4;
            class342.field5067 = 0;
            class309.field4565 = 0;
            int var13 = 0;
            class71.field1112 = 0;
            for (int var14 = 0; var14 < var9; var14++) {
                int var15 = arg1[var14];
                if (this.field5622.length > var15) {
                    int[] var16 = this.field5622[var15];
                    for (int var17 = 0; var17 < var16.length; var17++) {
                        int var18 = var16[var17];
                        if (this.field5581 == null || (this.field5581[var18] & arg6) != 0) {
                            class342.field5067 += this.field5579[var18];
                            class71.field1112 += this.field5654[var18];
                            class309.field4565 += this.field5552[var18];
                            var13++;
                        }
                    }
                }
            }
            if (var13 > 0) {
                class342.field5067 = class342.field5067 / var13 + var11;
                class309.field4565 = class309.field4565 / var13 + var12;
                class138.field2013 = true;
                class71.field1112 = class71.field1112 / var13 + var10;
            } else {
                class71.field1112 = var10;
                class342.field5067 = var11;
                class309.field4565 = var12;
            }
        } else if (arg0 == 1) {
            if (arg7 != null) {
                int var19 = arg7[0] * arg2 + 8192 - (-(arg7[1] * arg3) + -(arg7[2] * arg4)) >> 14;
                int var20 = arg7[4] * arg3 + arg7[3] * arg2 - (-(arg7[5] * arg4) - 8192) >> 14;
                int var21 = arg7[7] * arg3 + arg7[6] * arg2 + (arg7[8] * arg4) + 8192 >> 14;
                arg2 = var19;
                arg3 = var20;
                arg4 = var21;
            }
            int var22 = arg2 << 4;
            int var23 = arg4 << 4;
            int var24 = arg3 << 4;
            for (int var25 = 0; var25 < var9; var25++) {
                int var26 = arg1[var25];
                if (var26 < this.field5622.length) {
                    int[] var27 = this.field5622[var26];
                    for (int var28 = 0; var28 < var27.length; var28++) {
                        int var29 = var27[var28];
                        if (this.field5581 == null || (this.field5581[var29] & arg6) != 0) {
                            this.field5579[var29] += var22;
                            this.field5654[var29] += var24;
                            this.field5552[var29] += var23;
                        }
                    }
                }
            }
        } else if (arg0 == 2) {
            if (arg7 == null) {
                for (int var30 = 0; var30 < var9; var30++) {
                    int var49 = arg1[var30];
                    if (var49 < this.field5622.length) {
                        int[] var50 = this.field5622[var49];
                        for (int var51 = 0; var51 < var50.length; var51++) {
                            int var52 = var50[var51];
                            if (this.field5581 == null || (this.field5581[var52] & arg6) != 0) {
                                this.field5579[var52] -= class342.field5067;
                                this.field5654[var52] -= class71.field1112;
                                this.field5552[var52] -= class309.field4565;
                                if (arg4 != 0) {
                                    int var53 = class271.field3549[arg4];
                                    int var54 = class271.field3544[arg4];
                                    int var55 = this.field5654[var52] * var53 + (this.field5579[var52] * var54) + 16383 >> 14;
                                    this.field5654[var52] = this.field5654[var52] * var54 + 16383 - (this.field5579[var52] * var53) >> 14;
                                    this.field5579[var52] = var55;
                                }
                                if (arg2 != 0) {
                                    int var56 = class271.field3549[arg2];
                                    int var57 = class271.field3544[arg2];
                                    int var58 = this.field5654[var52] * var57 + 16383 - (this.field5552[var52] * var56) >> 14;
                                    this.field5552[var52] = this.field5654[var52] * var56 + this.field5552[var52] * var57 + 16383 >> 14;
                                    this.field5654[var52] = var58;
                                }
                                if (arg3 != 0) {
                                    int var59 = class271.field3549[arg3];
                                    int var60 = class271.field3544[arg3];
                                    int var61 = this.field5552[var52] * var59 + this.field5579[var52] * var60 + 16383 >> 14;
                                    this.field5552[var52] = this.field5552[var52] * var60 + 16383 - this.field5579[var52] * var59 >> 14;
                                    this.field5579[var52] = var61;
                                }
                                this.field5579[var52] += class342.field5067;
                                this.field5654[var52] += class71.field1112;
                                this.field5552[var52] += class309.field4565;
                            }
                        }
                    }
                }
                if (arg5) {
                    for (int var31 = 0; var31 < var9; var31++) {
                        int var32 = arg1[var31];
                        if (this.field5622.length > var32) {
                            int[] var33 = this.field5622[var32];
                            for (int var34 = 0; var34 < var33.length; var34++) {
                                int var35 = var33[var34];
                                if (this.field5581 == null || (arg6 & this.field5581[var35]) != 0) {
                                    int var36 = this.field5604[var35];
                                    int var37 = this.field5604[var35 + 1];
                                    for (int var38 = var36; var38 < var37; var38++) {
                                        int var39 = this.field5531[var38] - 1;
                                        if (var39 == -1) {
                                            break;
                                        }
                                        if (arg4 != 0) {
                                            int var40 = class271.field3549[arg4];
                                            int var41 = class271.field3544[arg4];
                                            int var42 = this.field5544[var39] * var40 + (this.field5649[var39] * var41) + 16383 >> 14;
                                            this.field5544[var39] = (short) (this.field5544[var39] * var41 + 16383 - (this.field5649[var39] * var40) >> 14);
                                            this.field5649[var39] = (short) var42;
                                        }
                                        if (arg2 != 0) {
                                            int var43 = class271.field3549[arg2];
                                            int var44 = class271.field3544[arg2];
                                            int var45 = this.field5544[var39] * var44 + 16383 - (this.field5576[var39] * var43) >> 14;
                                            this.field5576[var39] = (short) (this.field5576[var39] * var44 + this.field5544[var39] * var43 + 16383 >> 14);
                                            this.field5544[var39] = (short) var45;
                                        }
                                        if (arg3 != 0) {
                                            int var46 = class271.field3549[arg3];
                                            int var47 = class271.field3544[arg3];
                                            int var48 = this.field5649[var39] * var47 + this.field5576[var39] * var46 + 16383 >> 14;
                                            this.field5576[var39] = (short) (this.field5576[var39] * var47 + 16383 - (this.field5649[var39] * var46) >> 14);
                                            this.field5649[var39] = (short) var48;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    this.method2326(false);
                    return;
                }
            } else {
                int var62 = arg7[9] << 4;
                int var63 = arg7[10] << 4;
                int var64 = arg7[11] << 4;
                int var65 = arg7[12] << 4;
                int var66 = arg7[13] << 4;
                int var67 = arg7[14] << 4;
                if (class138.field2013) {
                    int var68 = arg7[0] * class342.field5067 + (arg7[3] * class71.field1112 + (arg7[6] * class309.field4565)) + 8192 >> 14;
                    int var69 = arg7[7] * class309.field4565 + arg7[1] * class342.field5067 + arg7[4] * class71.field1112 + 8192 >> 14;
                    int var70 = arg7[8] * class309.field4565 + arg7[2] * class342.field5067 + (arg7[5] * class71.field1112 - -8192) >> 14;
                    int var71 = var66 + var69;
                    int var72 = var65 + var68;
                    class71.field1112 = var71;
                    int var73 = var67 + var70;
                    class342.field5067 = var72;
                    class309.field4565 = var73;
                    class138.field2013 = false;
                }
                int[] var74 = new int[9];
                int var75 = class271.field3544[arg2];
                int var76 = class271.field3549[arg2];
                int var77 = class271.field3544[arg3];
                int var78 = class271.field3549[arg3];
                int var79 = class271.field3544[arg4];
                int var80 = class271.field3549[arg4];
                int var81 = var76 * var79 + 8192 >> 14;
                int var82 = var76 * var80 + 8192 >> 14;
                var74[4] = var75 * var79 + 8192 >> 14;
                var74[2] = var75 * var78 + 8192 >> 14;
                var74[1] = var78 * var81 + -var77 * var80 + 8192 >> 14;
                var74[6] = -var78 * var79 + (var77 * var82) + 8192 >> 14;
                var74[0] = var77 * var79 + var78 * var82 + 8192 >> 14;
                var74[3] = var75 * var80 + 8192 >> 14;
                var74[8] = var75 * var77 + 8192 >> 14;
                var74[7] = var77 * var81 + var78 * var80 + 8192 >> 14;
                var74[5] = -var76;
                int var83 = var74[0] * -class342.field5067 + (var74[1] * -class71.field1112) + var74[2] * -class309.field4565 + 8192 >> 14;
                int var84 = var74[5] * -class309.field4565 + var74[3] * -class342.field5067 + var74[4] * -class71.field1112 + 8192 >> 14;
                int var85 = var74[8] * -class309.field4565 + (var74[6] * -class342.field5067 + (var74[7] * -class71.field1112)) + 8192 >> 14;
                int var86 = class342.field5067 + var83;
                int var87 = class71.field1112 + var84;
                int var88 = class309.field4565 + var85;
                int[] var89 = new int[9];
                for (int var90 = 0; var90 < 3; var90++) {
                    for (int var119 = 0; var119 < 3; var119++) {
                        int var120 = 0;
                        for (int var121 = 0; var121 < 3; var121++) {
                            var120 += var74[var90 * 3 + var121] * arg7[var119 * 3 + var121];
                        }
                        var89[var90 * 3 + var119] = var120 + 8192 >> 14;
                    }
                }
                int var91 = var74[2] * var67 + var74[1] * var66 + var74[0] * var65 + 8192 >> 14;
                int var92 = var74[4] * var66 + var74[3] * var65 + var74[5] * var67 + 8192 >> 14;
                int var93 = var86 + var91;
                int var94 = var87 + var92;
                int var95 = var74[8] * var67 + var74[7] * var66 + var74[6] * var65 + 8192 >> 14;
                int var96 = var88 + var95;
                int[] var97 = new int[9];
                for (int var98 = 0; var98 < 3; var98++) {
                    for (int var116 = 0; var116 < 3; var116++) {
                        int var117 = 0;
                        for (int var118 = 0; var118 < 3; var118++) {
                            var117 += arg7[var98 * 3 + var118] * var89[var118 * 3 + var116];
                        }
                        var97[var98 * 3 + var116] = var117 + 8192 >> 14;
                    }
                }
                int var99 = arg7[1] * var94 + (arg7[0] * var93 + (arg7[2] * var96)) + 8192 >> 14;
                int var100 = arg7[5] * var96 + arg7[4] * var94 + arg7[3] * var93 + 8192 >> 14;
                int var101 = arg7[8] * var96 + arg7[6] * var93 + (arg7[7] * var94) + 8192 >> 14;
                int var102 = var62 + var99;
                int var103 = var63 + var100;
                int var104 = var64 + var101;
                for (int var105 = 0; var105 < var9; var105++) {
                    int var106 = arg1[var105];
                    if (var106 < this.field5622.length) {
                        int[] var107 = this.field5622[var106];
                        for (int var108 = 0; var108 < var107.length; var108++) {
                            int var109 = var107[var108];
                            if (this.field5581 == null || (this.field5581[var109] & arg6) != 0) {
                                int var110 = this.field5579[var109] * var97[0] + this.field5654[var109] * var97[1] + this.field5552[var109] * var97[2] + 8192 >> 14;
                                int var111 = this.field5579[var109] * var97[3] + this.field5654[var109] * var97[4] + this.field5552[var109] * var97[5] + 8192 >> 14;
                                int var112 = var103 + var111;
                                int var113 = var102 + var110;
                                int var114 = this.field5552[var109] * var97[8] + this.field5654[var109] * var97[7] + this.field5579[var109] * var97[6] + 8192 >> 14;
                                this.field5579[var109] = var113;
                                int var115 = var104 + var114;
                                this.field5654[var109] = var112;
                                this.field5552[var109] = var115;
                            }
                        }
                    }
                }
            }
        } else if (arg0 == 3) {
            if (arg7 == null) {
                for (int var172 = 0; var172 < var9; var172++) {
                    int var173 = arg1[var172];
                    if (this.field5622.length > var173) {
                        int[] var174 = this.field5622[var173];
                        for (int var175 = 0; var175 < var174.length; var175++) {
                            int var176 = var174[var175];
                            if (this.field5581 == null || (this.field5581[var176] & arg6) != 0) {
                                this.field5579[var176] -= class342.field5067;
                                this.field5654[var176] -= class71.field1112;
                                this.field5552[var176] -= class309.field4565;
                                this.field5579[var176] = this.field5579[var176] * arg2 >> 7;
                                this.field5654[var176] = this.field5654[var176] * arg3 >> 7;
                                this.field5552[var176] = this.field5552[var176] * arg4 >> 7;
                                this.field5579[var176] += class342.field5067;
                                this.field5654[var176] += class71.field1112;
                                this.field5552[var176] += class309.field4565;
                            }
                        }
                    }
                }
            } else {
                int var122 = arg7[9] << 4;
                int var123 = arg7[10] << 4;
                int var124 = arg7[11] << 4;
                int var125 = arg7[12] << 4;
                int var126 = arg7[13] << 4;
                int var127 = arg7[14] << 4;
                if (class138.field2013) {
                    int var128 = arg7[6] * class309.field4565 + arg7[3] * class71.field1112 + arg7[0] * class342.field5067 + 8192 >> 14;
                    int var129 = arg7[7] * class309.field4565 + arg7[1] * class342.field5067 + (arg7[4] * class71.field1112) + 8192 >> 14;
                    int var130 = var125 + var128;
                    int var131 = arg7[2] * class342.field5067 + arg7[5] * class71.field1112 + arg7[8] * class309.field4565 + 8192 >> 14;
                    int var132 = var126 + var129;
                    class342.field5067 = var130;
                    class71.field1112 = var132;
                    int var133 = var127 + var131;
                    class138.field2013 = false;
                    class309.field4565 = var133;
                }
                int var134 = arg2 << 15 >> 7;
                int var135 = arg3 << 15 >> 7;
                int var136 = arg4 << 15 >> 7;
                int var137 = -class342.field5067 * var134 + 8192 >> 14;
                int var138 = -class71.field1112 * var135 + 8192 >> 14;
                int var139 = -class309.field4565 * var136 + 8192 >> 14;
                int var140 = class342.field5067 + var137;
                int var141 = class71.field1112 + var138;
                int var142 = var139 + class309.field4565;
                int[] var143 = new int[] { arg7[0] * var134 + 8192 >> 14, arg7[3] * var134 + 8192 >> 14, arg7[6] * var134 + 8192 >> 14, arg7[1] * var135 + 8192 >> 14, arg7[4] * var135 + 8192 >> 14, arg7[7] * var135 + 8192 >> 14, arg7[2] * var136 + 8192 >> 14, arg7[5] * var136 + 8192 >> 14, arg7[8] * var136 + 8192 >> 14 };
                int var144 = var125 * var134 + 8192 >> 14;
                int var145 = var126 * var135 + 8192 >> 14;
                int var146 = var141 + var145;
                int var147 = var127 * var136 + 8192 >> 14;
                int var148 = var140 + var144;
                int var149 = var142 + var147;
                int[] var150 = new int[9];
                for (int var151 = 0; var151 < 3; var151++) {
                    for (int var169 = 0; var169 < 3; var169++) {
                        int var170 = 0;
                        for (int var171 = 0; var171 < 3; var171++) {
                            var170 += var143[var169 + (var171 * 3)] * arg7[var151 * 3 + var171];
                        }
                        var150[var151 * 3 + var169] = var170 + 8192 >> 14;
                    }
                }
                int var152 = arg7[2] * var149 + arg7[0] * var148 + arg7[1] * var146 + 8192 >> 14;
                int var153 = arg7[5] * var149 + arg7[4] * var146 + arg7[3] * var148 + 8192 >> 14;
                int var154 = var123 + var153;
                int var155 = var122 + var152;
                int var156 = arg7[8] * var149 + arg7[6] * var148 + arg7[7] * var146 + 8192 >> 14;
                int var157 = var124 + var156;
                for (int var158 = 0; var158 < var9; var158++) {
                    int var159 = arg1[var158];
                    if (this.field5622.length > var159) {
                        int[] var160 = this.field5622[var159];
                        for (int var161 = 0; var161 < var160.length; var161++) {
                            int var162 = var160[var161];
                            if (this.field5581 == null || (this.field5581[var162] & arg6) != 0) {
                                int var163 = this.field5654[var162] * var150[1] + this.field5579[var162] * var150[0] + this.field5552[var162] * var150[2] + 8192 >> 14;
                                int var164 = this.field5552[var162] * var150[5] + (this.field5579[var162] * var150[3] + (this.field5654[var162] * var150[4])) + 8192 >> 14;
                                int var165 = this.field5579[var162] * var150[6] + this.field5552[var162] * var150[8] + (this.field5654[var162] * var150[7]) + 8192 >> 14;
                                int var166 = var154 + var164;
                                int var167 = var155 + var163;
                                int var168 = var157 + var165;
                                this.field5579[var162] = var167;
                                this.field5654[var162] = var166;
                                this.field5552[var162] = var168;
                            }
                        }
                    }
                }
            }
        } else if (arg0 == 5) {
            if (this.field5555 != null) {
                boolean var177 = false;
                for (int var178 = 0; var178 < var9; var178++) {
                    int var182 = arg1[var178];
                    if (this.field5555.length > var182) {
                        int[] var183 = this.field5555[var182];
                        for (int var184 = 0; var184 < var183.length; var184++) {
                            int var185 = var183[var184];
                            if (this.field5545 == null || (this.field5545[var185] & arg6) != 0) {
                                int var186 = (this.field5642[var185] & 0xFF) + arg2 * 8;
                                if (var186 < 0) {
                                    var186 = 0;
                                } else if (var186 > 255) {
                                    var186 = 255;
                                }
                                this.field5642[var185] = (byte) var186;
                            }
                        }
                        var177 |= var183.length > 0;
                    }
                }
                if (var177) {
                    if (this.field5574 != null) {
                        for (int var179 = 0; var179 < this.field5640; var179++) {
                            class339 var180 = this.field5574[var179];
                            class240 var181 = this.field5634[var179];
                            var181.field3163 = var181.field3163 & 0xFFFFFF | 255 - (this.field5642[var180.field4923] & 0xFF) << 24;
                        }
                    }
                    this.method2305(127);
                }
            }
        } else if (arg0 == 7) {
            if (this.field5555 != null) {
                boolean var187 = false;
                for (int var188 = 0; var188 < var9; var188++) {
                    int var192 = arg1[var188];
                    if (var192 < this.field5555.length) {
                        int[] var193 = this.field5555[var192];
                        for (int var194 = 0; var194 < var193.length; var194++) {
                            int var195 = var193[var194];
                            if (this.field5545 == null || (arg6 & this.field5545[var195]) != 0) {
                                int var196 = this.field5592[var195] & 0xFFFF;
                                int var197 = (var196 & 0xFC07) >> 10;
                                int var198 = var196 >> 7 & 0x7;
                                int var199 = arg3 / 4 + var198;
                                int var200 = arg2 + var197 & 0x3F;
                                int var201 = var196 & 0x7F;
                                int var202 = arg4 + var201;
                                if (var199 < 0) {
                                    var199 = 0;
                                } else if (var199 > 7) {
                                    var199 = 7;
                                }
                                if (var202 < 0) {
                                    var202 = 0;
                                } else if (var202 > 127) {
                                    var202 = 127;
                                }
                                this.field5592[var195] = (short) class151.method1076(var202, class151.method1076(var200 << 10, var199 << 7));
                            }
                        }
                        var187 |= var193.length > 0;
                    }
                }
                if (var187) {
                    if (this.field5574 != null) {
                        for (int var189 = 0; var189 < this.field5640; var189++) {
                            class339 var190 = this.field5574[var189];
                            class240 var191 = this.field5634[var189];
                            var191.field3163 = class391.field5908[this.field5592[var190.field4923] & 0xFFFF] & 0xFFFFFF | var191.field3163 & 0xFF000000;
                        }
                    }
                    this.method2305(127);
                }
            }
        } else if (arg0 == 8) {
            if (this.field5655 != null) {
                for (int var203 = 0; var203 < var9; var203++) {
                    int var204 = arg1[var203];
                    if (this.field5655.length > var204) {
                        int[] var205 = this.field5655[var204];
                        for (int var206 = 0; var206 < var205.length; var206++) {
                            class240 var207 = this.field5634[var205[var206]];
                            var207.field3157 += arg3;
                            var207.field3168 += arg2;
                        }
                    }
                }
            }
        } else if (arg0 == 10) {
            if (this.field5655 != null) {
                for (int var208 = 0; var208 < var9; var208++) {
                    int var209 = arg1[var208];
                    if (var209 < this.field5655.length) {
                        int[] var210 = this.field5655[var209];
                        for (int var211 = 0; var211 < var210.length; var211++) {
                            class240 var212 = this.field5634[var210[var211]];
                            var212.field3161 = var212.field3161 * arg3 >> 7;
                            var212.field3159 = var212.field3159 * arg2 >> 7;
                        }
                    }
                }
            }
        } else if (arg0 == 9 && this.field5655 != null) {
            for (int var213 = 0; var213 < var9; var213++) {
                int var214 = arg1[var213];
                if (var214 < this.field5655.length) {
                    int[] var215 = this.field5655[var214];
                    for (int var216 = 0; var216 < var215.length; var216++) {
                        class240 var217 = this.field5634[var215[var216]];
                        var217.field3169 = var217.field3169 + arg2 & 0x3FFF;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!de", name = "b", descriptor = "(Z)V", line = 6596)
    private final void method2326(boolean arg0) {
        field5550++;
        if ((this.field5605 & 0x37) == 0) {
            if (this.field5568 != null) {
                this.field5568.field6481 = false;
            }
        } else if (this.field5633 != null) {
            this.field5633.field6481 = false;
        }
        if (arg0) {
            this.method1052((short) 31, (short) 79);
        }
    }

    @OriginalMember(owner = "client!de", name = "j", descriptor = "(I)V", line = 6643)
    private final void method2327(int arg0) {
        if (arg0 == -1) {
            if (this.field5590 != null) {
                this.field5590.field6481 = false;
            }
            field5660++;
        }
    }
}
