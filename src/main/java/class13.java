import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vl")
public class class13 extends class55 {

    @OriginalMember(owner = "client!vl", name = "Mb", descriptor = "[I")
    private int[] field669;

    @OriginalMember(owner = "client!vl", name = "E", descriptor = "I")
    private int field609;

    @OriginalMember(owner = "client!vl", name = "yc", descriptor = "I")
    private int field707;

    @OriginalMember(owner = "client!vl", name = "bb", descriptor = "I")
    private int field632;

    @OriginalMember(owner = "client!vl", name = "zb", descriptor = "I")
    private int field656;

    @OriginalMember(owner = "client!vl", name = "Fb", descriptor = "I")
    private int field662;

    @OriginalMember(owner = "client!vl", name = "cc", descriptor = "[I")
    private int[] field685;

    @OriginalMember(owner = "client!vl", name = "V", descriptor = "[S")
    private short[] field626;

    @OriginalMember(owner = "client!vl", name = "bc", descriptor = "[I")
    private int[] field684;

    @OriginalMember(owner = "client!vl", name = "Xb", descriptor = "[I")
    private int[] field680;

    @OriginalMember(owner = "client!vl", name = "yb", descriptor = "[Laq;")
    private class146[] field655;

    @OriginalMember(owner = "client!vl", name = "Kb", descriptor = "[Ltk;")
    private class317[] field667;

    @OriginalMember(owner = "client!vl", name = "q", descriptor = "I")
    private int field595;

    @OriginalMember(owner = "client!vl", name = "P", descriptor = "[Lov;")
    private class172[] field620;

    @OriginalMember(owner = "client!vl", name = "dc", descriptor = "[Lsi;")
    private class521[] field686;

    @OriginalMember(owner = "client!vl", name = "ob", descriptor = "[S")
    private short[] field645;

    @OriginalMember(owner = "client!vl", name = "vc", descriptor = "[S")
    private short[] field704;

    @OriginalMember(owner = "client!vl", name = "cb", descriptor = "[S")
    private short[] field633;

    @OriginalMember(owner = "client!vl", name = "N", descriptor = "S")
    private short field618;

    @OriginalMember(owner = "client!vl", name = "C", descriptor = "[S")
    private short[] field607;

    @OriginalMember(owner = "client!vl", name = "S", descriptor = "[S")
    private short[] field623;

    @OriginalMember(owner = "client!vl", name = "Bc", descriptor = "[S")
    private short[] field710;

    @OriginalMember(owner = "client!vl", name = "Ib", descriptor = "[S")
    private short[] field665;

    @OriginalMember(owner = "client!vl", name = "lc", descriptor = "[S")
    private short[] field694;

    @OriginalMember(owner = "client!vl", name = "U", descriptor = "S")
    private short field625;

    @OriginalMember(owner = "client!vl", name = "Y", descriptor = "[S")
    private short[] field629;

    @OriginalMember(owner = "client!vl", name = "Dc", descriptor = "[B")
    private byte[] field712;

    @OriginalMember(owner = "client!vl", name = "nb", descriptor = "[S")
    private short[] field644;

    @OriginalMember(owner = "client!vl", name = "I", descriptor = "[F")
    private float[] field613;

    @OriginalMember(owner = "client!vl", name = "Lc", descriptor = "[F")
    private float[] field720;

    @OriginalMember(owner = "client!vl", name = "O", descriptor = "[S")
    private short[] field619;

    @OriginalMember(owner = "client!vl", name = "pb", descriptor = "[S")
    private short[] field646;

    @OriginalMember(owner = "client!vl", name = "W", descriptor = "[B")
    private byte[] field627;

    @OriginalMember(owner = "client!vl", name = "r", descriptor = "[I")
    private int[] field596;

    @OriginalMember(owner = "client!vl", name = "Sb", descriptor = "[I")
    private int[] field675;

    @OriginalMember(owner = "client!vl", name = "Q", descriptor = "[I")
    private int[] field621;

    @OriginalMember(owner = "client!vl", name = "Pb", descriptor = "I")
    private int field672;

    @OriginalMember(owner = "client!vl", name = "Zb", descriptor = "I")
    private int field682;

    @OriginalMember(owner = "client!vl", name = "Ac", descriptor = "[[I")
    private int[][] field709;

    @OriginalMember(owner = "client!vl", name = "G", descriptor = "[[I")
    private int[][] field611;

    @OriginalMember(owner = "client!vl", name = "tb", descriptor = "[[I")
    private int[][] field650;

    @OriginalMember(owner = "client!vl", name = "Lb", descriptor = "Z")
    private boolean field668;

    @OriginalMember(owner = "client!vl", name = "vb", descriptor = "Z")
    private boolean field652;

    @OriginalMember(owner = "client!vl", name = "rb", descriptor = "Z")
    private boolean field648;

    @OriginalMember(owner = "client!vl", name = "Vb", descriptor = "Z")
    private boolean field678;

    @OriginalMember(owner = "client!vl", name = "ab", descriptor = "Lcf;")
    private class562 field631;

    @OriginalMember(owner = "client!vl", name = "xb", descriptor = "Lde;")
    private class494 field654;

    @OriginalMember(owner = "client!vl", name = "kb", descriptor = "Lde;")
    private class494 field641;

    @OriginalMember(owner = "client!vl", name = "wb", descriptor = "Lde;")
    private class494 field653;

    @OriginalMember(owner = "client!vl", name = "tc", descriptor = "Lde;")
    private class494 field702;

    @OriginalMember(owner = "client!vl", name = "pc", descriptor = "Ljea;")
    private class419 field698;

    @OriginalMember(owner = "client!vl", name = "Db", descriptor = "[F")
    public static float[] field660 = new float[16384];

    @OriginalMember(owner = "client!vl", name = "Jc", descriptor = "[F")
    public static float[] field718 = new float[16384];

    @OriginalMember(owner = "client!vl", name = "s", descriptor = "I")
    public static int field597;

    @OriginalMember(owner = "client!vl", name = "t", descriptor = "I")
    public static int field598;

    @OriginalMember(owner = "client!vl", name = "u", descriptor = "I")
    public static int field599;

    @OriginalMember(owner = "client!vl", name = "v", descriptor = "I")
    public static int field600;

    @OriginalMember(owner = "client!vl", name = "w", descriptor = "I")
    public static int field601;

    @OriginalMember(owner = "client!vl", name = "x", descriptor = "I")
    public static int field602;

    @OriginalMember(owner = "client!vl", name = "y", descriptor = "I")
    public static int field603;

    @OriginalMember(owner = "client!vl", name = "z", descriptor = "I")
    public static int field604;

    @OriginalMember(owner = "client!vl", name = "A", descriptor = "I")
    public static int field605;

    @OriginalMember(owner = "client!vl", name = "B", descriptor = "I")
    public static int field606;

    @OriginalMember(owner = "client!vl", name = "D", descriptor = "I")
    private int field608;

    @OriginalMember(owner = "client!vl", name = "F", descriptor = "I")
    public static int field610;

    @OriginalMember(owner = "client!vl", name = "H", descriptor = "I")
    public static int field612;

    @OriginalMember(owner = "client!vl", name = "J", descriptor = "I")
    private int field614;

    @OriginalMember(owner = "client!vl", name = "K", descriptor = "I")
    public static int field615;

    @OriginalMember(owner = "client!vl", name = "L", descriptor = "I")
    public static int field616;

    @OriginalMember(owner = "client!vl", name = "M", descriptor = "I")
    public static int field617;

    @OriginalMember(owner = "client!vl", name = "R", descriptor = "I")
    private int field622;

    @OriginalMember(owner = "client!vl", name = "T", descriptor = "I")
    private int field624;

    @OriginalMember(owner = "client!vl", name = "X", descriptor = "I")
    public static int field628;

    @OriginalMember(owner = "client!vl", name = "Z", descriptor = "I")
    public static int field630;

    @OriginalMember(owner = "client!vl", name = "db", descriptor = "I")
    public static int field634;

    @OriginalMember(owner = "client!vl", name = "eb", descriptor = "I")
    public static int field635;

    @OriginalMember(owner = "client!vl", name = "fb", descriptor = "I")
    public static int field636;

    @OriginalMember(owner = "client!vl", name = "gb", descriptor = "I")
    public static int field637;

    @OriginalMember(owner = "client!vl", name = "hb", descriptor = "I")
    public static int field638;

    @OriginalMember(owner = "client!vl", name = "ib", descriptor = "I")
    public static int field639;

    @OriginalMember(owner = "client!vl", name = "jb", descriptor = "I")
    public static int field640;

    @OriginalMember(owner = "client!vl", name = "lb", descriptor = "I")
    public static int field642;

    @OriginalMember(owner = "client!vl", name = "mb", descriptor = "I")
    public static int field643;

    @OriginalMember(owner = "client!vl", name = "qb", descriptor = "I")
    public static int field647;

    @OriginalMember(owner = "client!vl", name = "sb", descriptor = "I")
    public static int field649;

    @OriginalMember(owner = "client!vl", name = "ub", descriptor = "I")
    public static int field651;

    @OriginalMember(owner = "client!vl", name = "Ab", descriptor = "I")
    public static int field657;

    @OriginalMember(owner = "client!vl", name = "Bb", descriptor = "I")
    public static int field658;

    @OriginalMember(owner = "client!vl", name = "Cb", descriptor = "I")
    public static int field659;

    @OriginalMember(owner = "client!vl", name = "Eb", descriptor = "I")
    public static int field661;

    @OriginalMember(owner = "client!vl", name = "Gb", descriptor = "I")
    public static int field663;

    @OriginalMember(owner = "client!vl", name = "Hb", descriptor = "I")
    public static int field664;

    @OriginalMember(owner = "client!vl", name = "Jb", descriptor = "I")
    public static int field666;

    @OriginalMember(owner = "client!vl", name = "Ob", descriptor = "I")
    public static int field671;

    @OriginalMember(owner = "client!vl", name = "Qb", descriptor = "I")
    public static int field673;

    @OriginalMember(owner = "client!vl", name = "Rb", descriptor = "I")
    public static int field674;

    @OriginalMember(owner = "client!vl", name = "Tb", descriptor = "I")
    public static int field676;

    @OriginalMember(owner = "client!vl", name = "Ub", descriptor = "I")
    public static int field677;

    @OriginalMember(owner = "client!vl", name = "Wb", descriptor = "I")
    public static int field679;

    @OriginalMember(owner = "client!vl", name = "Yb", descriptor = "I")
    public static int field681;

    @OriginalMember(owner = "client!vl", name = "ac", descriptor = "I")
    public static int field683;

    @OriginalMember(owner = "client!vl", name = "ec", descriptor = "I")
    public static int field687;

    @OriginalMember(owner = "client!vl", name = "fc", descriptor = "I")
    public static int field688;

    @OriginalMember(owner = "client!vl", name = "gc", descriptor = "I")
    public static int field689;

    @OriginalMember(owner = "client!vl", name = "hc", descriptor = "I")
    public static int field690;

    @OriginalMember(owner = "client!vl", name = "ic", descriptor = "I")
    public static int field691;

    @OriginalMember(owner = "client!vl", name = "jc", descriptor = "I")
    public static int field692;

    @OriginalMember(owner = "client!vl", name = "kc", descriptor = "I")
    public static int field693;

    @OriginalMember(owner = "client!vl", name = "mc", descriptor = "I")
    private int field695;

    @OriginalMember(owner = "client!vl", name = "nc", descriptor = "I")
    public static int field696;

    @OriginalMember(owner = "client!vl", name = "oc", descriptor = "I")
    public static int field697;

    @OriginalMember(owner = "client!vl", name = "qc", descriptor = "I")
    public static int field699;

    @OriginalMember(owner = "client!vl", name = "rc", descriptor = "I")
    public static int field700;

    @OriginalMember(owner = "client!vl", name = "sc", descriptor = "I")
    private int field701;

    @OriginalMember(owner = "client!vl", name = "uc", descriptor = "I")
    public static int field703;

    @OriginalMember(owner = "client!vl", name = "wc", descriptor = "I")
    public static int field705;

    @OriginalMember(owner = "client!vl", name = "xc", descriptor = "I")
    public static int field706;

    @OriginalMember(owner = "client!vl", name = "zc", descriptor = "I")
    public static int field708;

    @OriginalMember(owner = "client!vl", name = "Cc", descriptor = "I")
    public static int field711;

    @OriginalMember(owner = "client!vl", name = "Ec", descriptor = "I")
    public static int field713;

    @OriginalMember(owner = "client!vl", name = "Fc", descriptor = "I")
    public static int field714;

    @OriginalMember(owner = "client!vl", name = "Gc", descriptor = "I")
    public static int field715;

    @OriginalMember(owner = "client!vl", name = "Hc", descriptor = "I")
    public static int field716;

    @OriginalMember(owner = "client!vl", name = "Ic", descriptor = "I")
    private int field717;

    @OriginalMember(owner = "client!vl", name = "Kc", descriptor = "I")
    private int field719;

    @OriginalMember(owner = "client!vl", name = "Nc", descriptor = "Lom;")
    public static class344 field722;

    @OriginalMember(owner = "client!vl", name = "Mc", descriptor = "Lln;")
    public static class349 field721;

    @OriginalMember(owner = "client!vl", name = "Nb", descriptor = "Llp;")
    private class361 field670;

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(CILjava/lang/String;)I")
    public static final int method306(char arg0, int arg1, String arg2) {
        field674++;
        if (arg1 != 30656) {
            return -80;
        }
        int var3 = 0;
        int var4 = arg2.length();
        for (int var5 = 0; var5 < var4; var5++) {
            if (arg0 == arg2.charAt(var5)) {
                var3++;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(Lgk;B)V")
    private final void method307(class443 arg0, byte arg1) {
        if (class635.field9130.length < this.field672) {
            class635.field9130 = new int[this.field672];
            class266.field3949 = new int[this.field672];
        }
        field638++;
        int var3 = 0;
        if (arg1 != 29) {
            return;
        }
        while (var3 < this.field662) {
            int var14 = (this.field684[var3] - (this.field685[var3] * this.field631.field8128 >> 8) >> this.field631.field8144) - arg0.field6375;
            int var15 = (this.field680[var3] - (this.field685[var3] * this.field631.field8127 >> 8) >> this.field631.field8144) - arg0.field6381;
            int var16 = this.field669[var3];
            int var17 = this.field669[var3 + 1];
            for (int var18 = var16; var18 < var17; var18++) {
                int var19 = this.field633[var18] - 1;
                if (var19 == -1) {
                    break;
                }
                class635.field9130[var19] = var14;
                class266.field3949[var19] = var15;
            }
            var3++;
        }
        for (int var4 = 0; var4 < this.field707; var4++) {
            if (this.field712 == null || this.field712[var4] <= 128) {
                short var5 = this.field710[var4];
                short var6 = this.field644[var4];
                short var7 = this.field704[var4];
                int var8 = class635.field9130[var5];
                int var9 = class635.field9130[var6];
                int var10 = class635.field9130[var7];
                int var11 = class266.field3949[var5];
                int var12 = class266.field3949[var6];
                int var13 = class266.field3949[var7];
                if ((var8 - var9) * (var12 - var13) - (var10 - var9) * (var12 - var11) > 0) {
                    arg0.method2669(var8, var9, var11, false, var13, var12, var10);
                }
            }
        }
    }

    @OriginalMember(owner = "client!vl", name = "ga", descriptor = "(I)V")
    public final void method308(int arg0) {
        field681++;
        this.field625 = (short) arg0;
        this.method355(12823);
        this.method309((byte) 111);
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(B)V")
    private final void method309(byte arg0) {
        field617++;
        if ((this.field682 & 0x37) == 0) {
            if (this.field653 != null) {
                this.field653.field7057 = false;
            }
        } else if (this.field702 != null) {
            this.field702.field7057 = false;
        }
        if (arg0 != 111) {
            this.method352();
        }
    }

    @OriginalMember(owner = "client!vl", name = "T", descriptor = "(I)V")
    public final void method310(int arg0) {
        field715++;
        this.field618 = (short) arg0;
        this.method360((byte) -86);
    }

    @OriginalMember(owner = "client!vl", name = "S", descriptor = "(Lha;)Lha;")
    public final class54 method311(class54 arg0) {
        field716++;
        if (this.field672 == 0) {
            return null;
        }
        if (!this.field652) {
            this.method335((byte) 112);
        }
        int var2;
        int var3;
        if (this.field631.field8128 <= 0) {
            var2 = this.field622 - (this.field631.field8128 * this.field717 >> 8) >> this.field631.field8144;
            var3 = this.field614 - (this.field631.field8128 * this.field701 >> 8) >> this.field631.field8144;
        } else {
            var2 = this.field622 - (this.field631.field8128 * this.field701 >> 8) >> this.field631.field8144;
            var3 = this.field614 - (this.field631.field8128 * this.field717 >> 8) >> this.field631.field8144;
        }
        int var4;
        int var5;
        if (this.field631.field8127 > 0) {
            var4 = this.field719 - (this.field631.field8127 * this.field701 >> 8) >> this.field631.field8144;
            var5 = this.field608 - (this.field631.field8127 * this.field717 >> 8) >> this.field631.field8144;
        } else {
            var4 = this.field719 - (this.field631.field8127 * this.field717 >> 8) >> this.field631.field8144;
            var5 = this.field608 - (this.field631.field8127 * this.field701 >> 8) >> this.field631.field8144;
        }
        int var6 = var3 + 1 - var2;
        int var7 = var5 + 1 - var4;
        class443 var8 = (class443) arg0;
        class443 var9;
        if (var8 != null && var8.method2667((byte) 16, var6, var7)) {
            var9 = var8;
            var8.method2668(-73);
        } else {
            var9 = new class443(this.field631, var6, var7);
        }
        var9.method2665(var4, var5, var2, var3, true);
        this.method307(var9, (byte) 29);
        return var9;
    }

    @OriginalMember(owner = "client!vl", name = "c", descriptor = "()V")
    public final void method312() {
        field658++;
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(Lq;)V")
    public final void method313(class396 arg0) {
        field703++;
        class391 var2 = (class391) arg0;
        if (this.field667 != null) {
            for (int var3 = 0; var3 < this.field667.length; var3++) {
                class317 var4 = this.field667[var3];
                class317 var5 = var4;
                if (var4.field4665 != null) {
                    var5 = var4.field4665;
                }
                var5.field4679 = (int) ((float) this.field680[var4.field4667] * var2.field5733 + (float) this.field685[var4.field4667] * var2.field5703 + (float) this.field684[var4.field4667] * var2.field5721 + var2.field5713);
                var5.field4670 = (int) ((float) this.field680[var4.field4667] * var2.field5707 + (float) this.field685[var4.field4667] * var2.field5701 + (float) this.field684[var4.field4667] * var2.field5711 + var2.field5705);
                var5.field4664 = (int) ((float) this.field680[var4.field4667] * var2.field5737 + (float) this.field685[var4.field4667] * var2.field5735 + (float) this.field684[var4.field4667] * var2.field5723 + var2.field5706);
                var5.field4673 = (int) ((float) this.field680[var4.field4675] * var2.field5733 + (float) this.field685[var4.field4675] * var2.field5703 + (float) this.field684[var4.field4675] * var2.field5721 + var2.field5713);
                var5.field4666 = (int) ((float) this.field680[var4.field4675] * var2.field5707 + (float) this.field685[var4.field4675] * var2.field5701 + (float) this.field684[var4.field4675] * var2.field5711 + var2.field5705);
                var5.field4682 = (int) ((float) this.field680[var4.field4675] * var2.field5737 + (float) this.field685[var4.field4675] * var2.field5735 + (float) this.field684[var4.field4675] * var2.field5723 + var2.field5706);
                var5.field4660 = (int) ((float) this.field680[var4.field4678] * var2.field5733 + (float) this.field685[var4.field4678] * var2.field5703 + (float) this.field684[var4.field4678] * var2.field5721 + var2.field5713);
                var5.field4680 = (int) ((float) this.field680[var4.field4678] * var2.field5707 + (float) this.field685[var4.field4678] * var2.field5701 + (float) this.field684[var4.field4678] * var2.field5711 + var2.field5705);
                var5.field4676 = (int) ((float) this.field680[var4.field4678] * var2.field5737 + (float) this.field685[var4.field4678] * var2.field5735 + (float) this.field684[var4.field4678] * var2.field5723 + var2.field5706);
            }
        }
        if (this.field655 == null) {
            return;
        }
        for (int var6 = 0; var6 < this.field655.length; var6++) {
            class146 var7 = this.field655[var6];
            class146 var8 = var7;
            if (var7.field2536 != null) {
                var8 = var7.field2536;
            }
            if (var7.field2537 == null) {
                var7.field2537 = var2.method904();
            } else {
                var7.field2537.method896(var2);
            }
            var8.field2544 = (int) ((float) this.field680[var7.field2543] * var2.field5733 + (float) this.field685[var7.field2543] * var2.field5703 + (float) this.field684[var7.field2543] * var2.field5721 + var2.field5713);
            var8.field2529 = (int) ((float) this.field680[var7.field2543] * var2.field5707 + (float) this.field685[var7.field2543] * var2.field5701 + (float) this.field684[var7.field2543] * var2.field5711 + var2.field5705);
            var8.field2533 = (int) ((float) this.field680[var7.field2543] * var2.field5737 + (float) this.field685[var7.field2543] * var2.field5735 + (float) this.field684[var7.field2543] * var2.field5723 + var2.field5706);
        }
    }

    @OriginalMember(owner = "client!vl", name = "e", descriptor = "()V")
    public final void method314() {
        field666++;
        if (this.field672 > 0 && this.field707 > 0) {
            this.method347((byte) 58);
            this.method323((byte) -128);
            this.method339(126);
        }
    }

    @OriginalMember(owner = "client!vl", name = "J", descriptor = "()I")
    public final int method315() {
        if (!this.field652) {
            this.method335((byte) 123);
        }
        field651++;
        return this.field717;
    }

    @OriginalMember(owner = "client!vl", name = "B", descriptor = "(I[IIIIZI[I)V")
    public final void method316(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7) {
        field649++;
        int var9 = arg1.length;
        if (arg0 == 0) {
            int var10 = arg2 << 4;
            int var11 = arg4 << 4;
            int var12 = arg3 << 4;
            class14.field741 = 0;
            class98.field1757 = 0;
            int var13 = 0;
            class686.field9721 = 0;
            for (int var14 = 0; var14 < var9; var14++) {
                int var15 = arg1[var14];
                if (var15 < this.field709.length) {
                    int[] var16 = this.field709[var15];
                    for (int var17 = 0; var17 < var16.length; var17++) {
                        int var18 = var16[var17];
                        if (this.field626 == null || (arg6 & this.field626[var18]) != 0) {
                            class14.field741 += this.field684[var18];
                            class686.field9721 += this.field685[var18];
                            class98.field1757 += this.field680[var18];
                            var13++;
                        }
                    }
                }
            }
            if (var13 <= 0) {
                class98.field1757 = var11;
                class14.field741 = var10;
                class686.field9721 = var12;
            } else {
                class14.field741 = class14.field741 / var13 + var10;
                class385.field5657 = true;
                class686.field9721 = class686.field9721 / var13 + var12;
                class98.field1757 = class98.field1757 / var13 + var11;
            }
        } else if (arg0 == 1) {
            if (arg7 != null) {
                int var19 = arg7[0] * arg2 + (arg7[1] * arg3 + (arg7[2] * arg4)) + 8192 >> 14;
                int var20 = arg7[4] * arg3 + arg7[5] * arg4 + arg7[3] * arg2 + 8192 >> 14;
                int var21 = arg7[6] * arg2 + 8192 - (-(arg7[7] * arg3) - arg7[8] * arg4) >> 14;
                arg3 = var20;
                arg2 = var19;
                arg4 = var21;
            }
            int var22 = arg4 << 4;
            int var23 = arg3 << 4;
            int var24 = arg2 << 4;
            for (int var25 = 0; var25 < var9; var25++) {
                int var26 = arg1[var25];
                if (var26 < this.field709.length) {
                    int[] var27 = this.field709[var26];
                    for (int var28 = 0; var28 < var27.length; var28++) {
                        int var29 = var27[var28];
                        if (this.field626 == null || (this.field626[var29] & arg6) != 0) {
                            this.field684[var29] += var24;
                            this.field685[var29] += var23;
                            this.field680[var29] += var22;
                        }
                    }
                }
            }
        } else if (arg0 == 2) {
            if (arg7 == null) {
                for (int var30 = 0; var30 < var9; var30++) {
                    int var49 = arg1[var30];
                    if (var49 < this.field709.length) {
                        int[] var50 = this.field709[var49];
                        for (int var51 = 0; var51 < var50.length; var51++) {
                            int var52 = var50[var51];
                            if (this.field626 == null || (this.field626[var52] & arg6) != 0) {
                                this.field684[var52] -= class14.field741;
                                this.field685[var52] -= class686.field9721;
                                this.field680[var52] -= class98.field1757;
                                if (arg4 != 0) {
                                    int var53 = class509.field7210[arg4];
                                    int var54 = class509.field7220[arg4];
                                    int var55 = this.field685[var52] * var53 + this.field684[var52] * var54 + 16383 >> 14;
                                    this.field685[var52] = this.field685[var52] * var54 - (this.field684[var52] * var53 - 16383) >> 14;
                                    this.field684[var52] = var55;
                                }
                                if (arg2 != 0) {
                                    int var56 = class509.field7210[arg2];
                                    int var57 = class509.field7220[arg2];
                                    int var58 = this.field685[var52] * var57 + 16383 - this.field680[var52] * var56 >> 14;
                                    this.field680[var52] = this.field685[var52] * var56 + this.field680[var52] * var57 + 16383 >> 14;
                                    this.field685[var52] = var58;
                                }
                                if (arg3 != 0) {
                                    int var59 = class509.field7210[arg3];
                                    int var60 = class509.field7220[arg3];
                                    int var61 = this.field680[var52] * var59 + this.field684[var52] * var60 + 16383 >> 14;
                                    this.field680[var52] = this.field680[var52] * var60 + 16383 - (this.field684[var52] * var59) >> 14;
                                    this.field684[var52] = var61;
                                }
                                this.field684[var52] += class14.field741;
                                this.field685[var52] += class686.field9721;
                                this.field680[var52] += class98.field1757;
                            }
                        }
                    }
                }
                if (arg5) {
                    for (int var31 = 0; var31 < var9; var31++) {
                        int var32 = arg1[var31];
                        if (this.field709.length > var32) {
                            int[] var33 = this.field709[var32];
                            for (int var34 = 0; var34 < var33.length; var34++) {
                                int var35 = var33[var34];
                                if (this.field626 == null || (this.field626[var35] & arg6) != 0) {
                                    int var36 = this.field669[var35];
                                    int var37 = this.field669[var35 + 1];
                                    for (int var38 = var36; var38 < var37; var38++) {
                                        int var39 = this.field633[var38] - 1;
                                        if (var39 == -1) {
                                            break;
                                        }
                                        if (arg4 != 0) {
                                            int var40 = class509.field7210[arg4];
                                            int var41 = class509.field7220[arg4];
                                            int var42 = this.field665[var39] * var40 + (this.field629[var39] * var41) + 16383 >> 14;
                                            this.field665[var39] = (short) (this.field665[var39] * var41 + 16383 - (this.field629[var39] * var40) >> 14);
                                            this.field629[var39] = (short) var42;
                                        }
                                        if (arg2 != 0) {
                                            int var43 = class509.field7210[arg2];
                                            int var44 = class509.field7220[arg2];
                                            int var45 = this.field665[var39] * var44 + 16383 - this.field623[var39] * var43 >> 14;
                                            this.field623[var39] = (short) (this.field665[var39] * var43 + this.field623[var39] * var44 + 16383 >> 14);
                                            this.field665[var39] = (short) var45;
                                        }
                                        if (arg3 != 0) {
                                            int var46 = class509.field7210[arg3];
                                            int var47 = class509.field7220[arg3];
                                            int var48 = this.field629[var39] * var47 + this.field623[var39] * var46 + 16383 >> 14;
                                            this.field623[var39] = (short) (this.field623[var39] * var47 + 16383 - (this.field629[var39] * var46) >> 14);
                                            this.field629[var39] = (short) var48;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    this.method309((byte) 111);
                    return;
                }
            } else {
                int var62 = arg7[9] << 4;
                int var63 = arg7[10] << 4;
                int var64 = arg7[11] << 4;
                int var65 = arg7[12] << 4;
                int var66 = arg7[13] << 4;
                int var67 = arg7[14] << 4;
                if (class385.field5657) {
                    int var68 = arg7[0] * class14.field741 + arg7[6] * class98.field1757 + arg7[3] * class686.field9721 + 8192 >> 14;
                    int var69 = arg7[4] * class686.field9721 + arg7[1] * class14.field741 + (arg7[7] * class98.field1757) + 8192 >> 14;
                    int var70 = arg7[5] * class686.field9721 + arg7[8] * class98.field1757 + arg7[2] * class14.field741 + 8192 >> 14;
                    int var71 = var66 + var69;
                    int var72 = var65 + var68;
                    class686.field9721 = var71;
                    class14.field741 = var72;
                    int var73 = var67 + var70;
                    class385.field5657 = false;
                    class98.field1757 = var73;
                }
                int[] var74 = new int[9];
                int var75 = class509.field7220[arg2];
                int var76 = class509.field7210[arg2];
                int var77 = class509.field7220[arg3];
                int var78 = class509.field7210[arg3];
                int var79 = class509.field7220[arg4];
                int var80 = class509.field7210[arg4];
                int var81 = var76 * var79 + 8192 >> 14;
                int var82 = var76 * var80 + 8192 >> 14;
                var74[3] = var75 * var80 + 8192 >> 14;
                var74[7] = var77 * var81 + var78 * var80 + 8192 >> 14;
                var74[4] = var75 * var79 + 8192 >> 14;
                var74[5] = -var76;
                var74[8] = var75 * var77 + 8192 >> 14;
                var74[1] = -var77 * var80 + var78 * var81 + 8192 >> 14;
                var74[2] = var75 * var78 + 8192 >> 14;
                var74[0] = var78 * var82 + var77 * var79 + 8192 >> 14;
                var74[6] = -var78 * var79 + var77 * var82 + 8192 >> 14;
                int var83 = var74[2] * -class98.field1757 + var74[1] * -class686.field9721 + var74[0] * -class14.field741 + 8192 >> 14;
                int var84 = var74[3] * -class14.field741 + var74[5] * -class98.field1757 + var74[4] * -class686.field9721 + 8192 >> 14;
                int var85 = var74[6] * -class14.field741 + (var74[7] * -class686.field9721) - (-(var74[8] * -class98.field1757) + -8192) >> 14;
                int var86 = class14.field741 + var83;
                int var87 = class686.field9721 + var84;
                int var88 = class98.field1757 + var85;
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
                int var91 = var74[0] * var65 + (var74[1] * var66) + var74[2] * var67 + 8192 >> 14;
                int var92 = var74[3] * var65 + (var74[4] * var66) + (var74[5] * var67) + 8192 >> 14;
                int var93 = var74[7] * var66 + var74[6] * var65 + var74[8] * var67 + 8192 >> 14;
                int var94 = var86 + var91;
                int var95 = var87 + var92;
                int var96 = var88 + var93;
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
                int var99 = arg7[2] * var96 + (arg7[0] * var94 + (arg7[1] * var95)) + 8192 >> 14;
                int var100 = arg7[3] * var94 + arg7[5] * var96 + arg7[4] * var95 + 8192 >> 14;
                int var101 = arg7[7] * var95 + (arg7[6] * var94 - (-(arg7[8] * var96) - 8192)) >> 14;
                int var102 = var62 + var99;
                int var103 = var63 + var100;
                int var104 = var64 + var101;
                for (int var105 = 0; var105 < var9; var105++) {
                    int var106 = arg1[var105];
                    if (var106 < this.field709.length) {
                        int[] var107 = this.field709[var106];
                        for (int var108 = 0; var108 < var107.length; var108++) {
                            int var109 = var107[var108];
                            if (this.field626 == null || (this.field626[var109] & arg6) != 0) {
                                int var110 = this.field680[var109] * var97[2] + (this.field684[var109] * var97[0] + (this.field685[var109] * var97[1])) + 8192 >> 14;
                                int var111 = this.field680[var109] * var97[5] + this.field685[var109] * var97[4] + this.field684[var109] * var97[3] + 8192 >> 14;
                                int var112 = var103 + var111;
                                int var113 = var102 + var110;
                                int var114 = this.field680[var109] * var97[8] + this.field685[var109] * var97[7] + this.field684[var109] * var97[6] + 8192 >> 14;
                                int var115 = var104 + var114;
                                this.field684[var109] = var113;
                                this.field685[var109] = var112;
                                this.field680[var109] = var115;
                            }
                        }
                    }
                }
            }
        } else if (arg0 == 3) {
            if (arg7 == null) {
                for (int var122 = 0; var122 < var9; var122++) {
                    int var123 = arg1[var122];
                    if (this.field709.length > var123) {
                        int[] var124 = this.field709[var123];
                        for (int var125 = 0; var125 < var124.length; var125++) {
                            int var126 = var124[var125];
                            if (this.field626 == null || (arg6 & this.field626[var126]) != 0) {
                                this.field684[var126] -= class14.field741;
                                this.field685[var126] -= class686.field9721;
                                this.field680[var126] -= class98.field1757;
                                this.field684[var126] = this.field684[var126] * arg2 >> 7;
                                this.field685[var126] = this.field685[var126] * arg3 >> 7;
                                this.field680[var126] = this.field680[var126] * arg4 >> 7;
                                this.field684[var126] += class14.field741;
                                this.field685[var126] += class686.field9721;
                                this.field680[var126] += class98.field1757;
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
                if (class385.field5657) {
                    int var133 = arg7[6] * class98.field1757 + arg7[3] * class686.field9721 + arg7[0] * class14.field741 + 8192 >> 14;
                    int var134 = arg7[1] * class14.field741 + (arg7[4] * class686.field9721 + (arg7[7] * class98.field1757)) + 8192 >> 14;
                    int var135 = var130 + var133;
                    int var136 = arg7[2] * class14.field741 + (arg7[5] * class686.field9721) + (arg7[8] * class98.field1757) + 8192 >> 14;
                    int var137 = var131 + var134;
                    int var138 = var132 + var136;
                    class686.field9721 = var137;
                    class14.field741 = var135;
                    class98.field1757 = var138;
                    class385.field5657 = false;
                }
                int var139 = arg2 << 15 >> 7;
                int var140 = arg3 << 15 >> 7;
                int var141 = arg4 << 15 >> 7;
                int var142 = -class14.field741 * var139 + 8192 >> 14;
                int var143 = -class686.field9721 * var140 + 8192 >> 14;
                int var144 = -class98.field1757 * var141 + 8192 >> 14;
                int var145 = class14.field741 + var142;
                int var146 = var143 + class686.field9721;
                int var147 = class98.field1757 + var144;
                int[] var148 = new int[] { arg7[0] * var139 + 8192 >> 14, arg7[3] * var139 + 8192 >> 14, arg7[6] * var139 + 8192 >> 14, arg7[1] * var140 + 8192 >> 14, arg7[4] * var140 + 8192 >> 14, arg7[7] * var140 + 8192 >> 14, arg7[2] * var141 + 8192 >> 14, arg7[5] * var141 + 8192 >> 14, arg7[8] * var141 + 8192 >> 14 };
                int var149 = var130 * var139 + 8192 >> 14;
                int var150 = var131 * var140 + 8192 >> 14;
                int var151 = var132 * var141 + 8192 >> 14;
                int var152 = var146 + var150;
                int var153 = var145 + var149;
                int var154 = var147 + var151;
                int[] var155 = new int[9];
                for (int var156 = 0; var156 < 3; var156++) {
                    for (int var174 = 0; var174 < 3; var174++) {
                        int var175 = 0;
                        for (int var176 = 0; var176 < 3; var176++) {
                            var175 += arg7[var156 * 3 + var176] * var148[var176 * 3 + var174];
                        }
                        var155[var156 * 3 + var174] = var175 + 8192 >> 14;
                    }
                }
                int var157 = arg7[0] * var153 - (-(arg7[1] * var152) - arg7[2] * var154 - 8192) >> 14;
                int var158 = arg7[5] * var154 + arg7[3] * var153 + arg7[4] * var152 + 8192 >> 14;
                int var159 = var127 + var157;
                int var160 = var128 + var158;
                int var161 = arg7[7] * var152 + arg7[6] * var153 + arg7[8] * var154 + 8192 >> 14;
                int var162 = var129 + var161;
                for (int var163 = 0; var163 < var9; var163++) {
                    int var164 = arg1[var163];
                    if (var164 < this.field709.length) {
                        int[] var165 = this.field709[var164];
                        for (int var166 = 0; var166 < var165.length; var166++) {
                            int var167 = var165[var166];
                            if (this.field626 == null || (arg6 & this.field626[var167]) != 0) {
                                int var168 = this.field685[var167] * var155[1] + (this.field684[var167] * var155[0] + (this.field680[var167] * var155[2])) + 8192 >> 14;
                                int var169 = this.field684[var167] * var155[3] + this.field685[var167] * var155[4] + this.field680[var167] * var155[5] + 8192 >> 14;
                                int var170 = var159 + var168;
                                int var171 = this.field680[var167] * var155[8] + (this.field684[var167] * var155[6] + (this.field685[var167] * var155[7])) + 8192 >> 14;
                                int var172 = var160 + var169;
                                int var173 = var162 + var171;
                                this.field684[var167] = var170;
                                this.field685[var167] = var172;
                                this.field680[var167] = var173;
                            }
                        }
                    }
                }
            }
        } else if (arg0 == 5) {
            if (this.field650 != null) {
                boolean var177 = false;
                for (int var178 = 0; var178 < var9; var178++) {
                    int var182 = arg1[var178];
                    if (var182 < this.field650.length) {
                        int[] var183 = this.field650[var182];
                        for (int var184 = 0; var184 < var183.length; var184++) {
                            int var185 = var183[var184];
                            if (this.field646 == null || (arg6 & this.field646[var185]) != 0) {
                                int var186 = (this.field712[var185] & 0xFF) + (arg2 * 8);
                                if (var186 < 0) {
                                    var186 = 0;
                                } else if (var186 > 255) {
                                    var186 = 255;
                                }
                                this.field712[var185] = (byte) var186;
                            }
                        }
                        var177 |= var183.length > 0;
                    }
                }
                if (var177) {
                    if (this.field686 != null) {
                        for (int var179 = 0; var179 < this.field595; var179++) {
                            class521 var180 = this.field686[var179];
                            class172 var181 = this.field620[var179];
                            var181.field2844 = var181.field2844 & 0xFFFFFF | 255 - (this.field712[var180.field7375] & 0xFF) << 24;
                        }
                    }
                    this.method360((byte) -86);
                }
            }
        } else if (arg0 == 7) {
            if (this.field650 != null) {
                boolean var187 = false;
                for (int var188 = 0; var188 < var9; var188++) {
                    int var192 = arg1[var188];
                    if (this.field650.length > var192) {
                        int[] var193 = this.field650[var192];
                        for (int var194 = 0; var194 < var193.length; var194++) {
                            int var195 = var193[var194];
                            if (this.field646 == null || (this.field646[var195] & arg6) != 0) {
                                int var196 = this.field619[var195] & 0xFFFF;
                                int var197 = var196 >> 10 & 0x3F;
                                int var198 = (var196 & 0x394) >> 7;
                                int var199 = var197 + arg2 & 0x3F;
                                int var200 = var196 & 0x7F;
                                int var201 = arg3 / 4 + var198;
                                int var202 = arg4 + var200;
                                if (var201 < 0) {
                                    var201 = 0;
                                } else if (var201 > 7) {
                                    var201 = 7;
                                }
                                if (var202 < 0) {
                                    var202 = 0;
                                } else if (var202 > 127) {
                                    var202 = 127;
                                }
                                this.field619[var195] = (short) class2.method189(class2.method189(var199 << 10, var201 << 7), var202);
                            }
                        }
                        var187 |= var193.length > 0;
                    }
                }
                if (var187) {
                    if (this.field686 != null) {
                        for (int var189 = 0; var189 < this.field595; var189++) {
                            class521 var190 = this.field686[var189];
                            class172 var191 = this.field620[var189];
                            var191.field2844 = var191.field2844 & 0xFF000000 | class492.field7038[this.field619[var190.field7375] & 0xFFFF] & 0xFFFFFF;
                        }
                    }
                    this.method360((byte) -86);
                }
            }
        } else if (arg0 == 8) {
            if (this.field611 != null) {
                for (int var203 = 0; var203 < var9; var203++) {
                    int var204 = arg1[var203];
                    if (var204 < this.field611.length) {
                        int[] var205 = this.field611[var204];
                        for (int var206 = 0; var206 < var205.length; var206++) {
                            class172 var207 = this.field620[var205[var206]];
                            var207.field2841 += arg2;
                            var207.field2846 += arg3;
                        }
                    }
                }
            }
        } else if (arg0 == 10) {
            if (this.field611 != null) {
                for (int var208 = 0; var208 < var9; var208++) {
                    int var209 = arg1[var208];
                    if (var209 < this.field611.length) {
                        int[] var210 = this.field611[var209];
                        for (int var211 = 0; var211 < var210.length; var211++) {
                            class172 var212 = this.field620[var210[var211]];
                            var212.field2840 = var212.field2840 * arg3 >> 7;
                            var212.field2842 = var212.field2842 * arg2 >> 7;
                        }
                    }
                }
            }
        } else if (arg0 == 9 && this.field611 != null) {
            for (int var213 = 0; var213 < var9; var213++) {
                int var214 = arg1[var213];
                if (this.field611.length > var214) {
                    int[] var215 = this.field611[var214];
                    for (int var216 = 0; var216 < var215.length; var216++) {
                        class172 var217 = this.field620[var215[var216]];
                        var217.field2847 = var217.field2847 + arg2 & 0x3FFF;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(Lq;Lql;II)V")
    public final void method317(class396 arg0, class684 arg1, int arg2, int arg3) {
        field671++;
        if (this.field672 == 0) {
            return;
        }
        class391 var5 = this.field631.field8100;
        class391 var6 = (class391) arg0;
        if (!this.field652) {
            this.method335((byte) 22);
        }
        class544.field7589 = var5.field5737 * var6.field5706 + var5.field5735 * var6.field5705 + var5.field5723 * var6.field5713 + var5.field5706;
        class640.field9205 = var5.field5737 * var6.field5735 + var5.field5735 * var6.field5701 + var5.field5723 * var6.field5703;
        float var7 = (float) this.field717 * class640.field9205 + class544.field7589;
        float var8 = (float) this.field701 * class640.field9205 + class544.field7589;
        float var9;
        float var10;
        if ((var7 > var8)) {
            var9 = (float) this.field624 + var7;
            var10 = var8 - (float) this.field624;
        } else {
            var9 = (float) this.field624 + var8;
            var10 = var7 - (float) this.field624;
        }
        if ((var10 >= this.field631.field8124) || (var9 <= (float) this.field631.field8135)) {
            return;
        }
        class704.field9914 = var5.field5733 * var6.field5735 + var5.field5721 * var6.field5703 + var5.field5703 * var6.field5701;
        class36.field1032 = var5.field5733 * var6.field5706 + var5.field5721 * var6.field5713 + var5.field5703 * var6.field5705 + var5.field5713;
        float var11 = (float) this.field717 * class704.field9914 + class36.field1032;
        float var12 = (float) this.field701 * class704.field9914 + class36.field1032;
        float var13;
        float var14;
        if ((var12 < var11)) {
            var13 = ((float) this.field624 + var11) * (float) this.field631.field8200;
            var14 = ((float) (-this.field624) + var12) * (float) this.field631.field8200;
        } else {
            var13 = ((float) this.field624 + var12) * (float) this.field631.field8200;
            var14 = (var11 - (float) this.field624) * (float) this.field631.field8200;
        }
        if ((var14 / (float) arg2 >= this.field631.field8126) || (var13 / (float) arg2 <= this.field631.field8163)) {
            return;
        }
        class293.field4399 = var5.field5707 * var6.field5735 + var5.field5711 * var6.field5703 + var5.field5701 * var6.field5701;
        class317.field4659 = var5.field5707 * var6.field5706 + var5.field5711 * var6.field5713 + var5.field5701 * var6.field5705 + var5.field5705;
        float var15 = (float) this.field717 * class293.field4399 + class317.field4659;
        float var16 = (float) this.field701 * class293.field4399 + class317.field4659;
        float var17;
        float var18;
        if (var16 < var15) {
            var17 = ((float) (-this.field624) + var16) * (float) this.field631.field8140;
            var18 = ((float) this.field624 + var15) * (float) this.field631.field8140;
        } else {
            var18 = ((float) this.field624 + var16) * (float) this.field631.field8140;
            var17 = (var15 - (float) this.field624) * (float) this.field631.field8140;
        }
        if ((this.field631.field8141 <= var17 / (float) arg2) || (var18 / (float) arg2 <= this.field631.field8191)) {
            return;
        }
        if (arg1 != null || this.field686 != null) {
            class198.field3087 = var5.field5737 * var6.field5723 + var5.field5735 * var6.field5711 + var5.field5723 * var6.field5721;
            class530.field7444 = var5.field5707 * var6.field5723 + var5.field5711 * var6.field5721 + var5.field5701 * var6.field5711;
            class417.field6026 = var5.field5733 * var6.field5737 + var5.field5721 * var6.field5733 + var5.field5703 * var6.field5707;
            class487.field6984 = var5.field5733 * var6.field5723 + var5.field5721 * var6.field5721 + var5.field5703 * var6.field5711;
            class47.field1135 = var5.field5707 * var6.field5737 + var5.field5711 * var6.field5733 + var5.field5701 * var6.field5707;
            class200.field3103 = var5.field5737 * var6.field5737 + var5.field5735 * var6.field5707 + var5.field5723 * var6.field5733;
        }
        if (arg1 != null) {
            int var19 = this.field622 + this.field614 >> 1;
            int var20 = this.field719 + this.field608 >> 1;
            int var21 = (int) ((float) var20 * class417.field6026 + (float) this.field717 * class704.field9914 + (float) var19 * class487.field6984 + class36.field1032);
            int var22 = (int) ((float) var20 * class47.field1135 + (float) this.field717 * class293.field4399 + (float) var19 * class530.field7444 + class317.field4659);
            int var23 = (int) ((float) var20 * class200.field3103 + (float) this.field717 * class640.field9205 + (float) var19 * class198.field3087 + class544.field7589);
            int var24 = (int) ((float) var20 * class417.field6026 + (float) this.field701 * class704.field9914 + (float) var19 * class487.field6984 + class36.field1032);
            int var25 = (int) ((float) var20 * class47.field1135 + (float) this.field701 * class293.field4399 + (float) var19 * class530.field7444 + class317.field4659);
            arg1.field9710 = this.field631.field8140 * var22 / arg2 + this.field631.field8151;
            arg1.field9708 = this.field631.field8140 * var25 / arg2 + this.field631.field8151;
            arg1.field9705 = this.field631.field8202 + (this.field631.field8200 * var21 / arg2);
            arg1.field9706 = this.field631.field8202 + (this.field631.field8200 * var24 / arg2);
            int var26 = (int) ((float) var20 * class200.field3103 + (float) this.field701 * class640.field9205 + (float) var19 * class198.field3087 + class544.field7589);
            if (this.field631.field8135 <= var23 || var26 >= this.field631.field8135) {
                arg1.field9709 = (var21 + this.field624) * this.field631.field8200 / arg2 + this.field631.field8202 - arg1.field9705;
                arg1.field9707 = true;
            }
        }
        this.field631.method3213((float) arg2, 82);
        this.field631.method3229((byte) 20);
        this.field631.method3212(var6, 0);
        this.method345(4);
        this.method333(2);
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(IILq;ZI)Z")
    public final boolean method318(int arg0, int arg1, class396 arg2, boolean arg3, int arg4) {
        field630++;
        return this.method367(arg2, arg4, arg0, arg1, (byte) -52, arg3);
    }

    @OriginalMember(owner = "client!vl", name = "b", descriptor = "()V")
    public final void method319() {
        field603++;
    }

    @OriginalMember(owner = "client!vl", name = "ba", descriptor = "(IILi;Li;III)V")
    public final void method320(int arg0, int arg1, class37 arg2, class37 arg3, int arg4, int arg5, int arg6) {
        field693++;
        if (!this.field652) {
            this.method335((byte) -52);
        }
        int var8 = this.field622 + arg4;
        int var9 = arg4 + this.field614;
        int var10 = this.field719 + arg6;
        int var11 = arg6 + this.field608;
        if (arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5 && var8 < 0 || arg2.field1041 <= arg2.field1040 + var9 >> arg2.field1038 || var10 < 0 || arg2.field1043 <= (arg2.field1040 + var11 >> arg2.field1038)) {
            return;
        }
        if (arg0 == 4 || arg0 == 5) {
            if (arg3 == null) {
                return;
            }
            if (var8 < 0 || arg3.field1040 + var9 >> arg3.field1038 >= arg3.field1041 || var10 < 0 || arg3.field1043 <= (arg3.field1040 + var11 >> arg3.field1038)) {
                return;
            }
        } else {
            int var12 = var8 >> arg2.field1038;
            int var13 = var9 + arg2.field1040 - 1 >> arg2.field1038;
            int var14 = var10 >> arg2.field1038;
            int var15 = -(-arg2.field1040 - var11) - 1 >> arg2.field1038;
            if (arg5 == arg2.method551(var12, var14, (byte) -106) && arg5 == arg2.method551(var13, var14, (byte) -101) && arg5 == arg2.method551(var12, var15, (byte) -109) && arg5 == arg2.method551(var13, var15, (byte) -96)) {
                return;
            }
        }
        if (arg0 == 1) {
            for (int var16 = 0; var16 < this.field662; var16++) {
                this.field685[var16] = this.field685[var16] + arg2.method552(1, this.field684[var16] + arg4, this.field680[var16] + arg6) - arg5;
            }
        } else if (arg0 == 2) {
            int var30 = this.field717;
            if (var30 == 0) {
                return;
            }
            for (int var31 = 0; var31 < this.field662; var31++) {
                int var32 = (this.field685[var31] << 16) / var30;
                if (var32 < arg1) {
                    this.field685[var31] += (arg1 - var32) * (arg2.method552(1, this.field684[var31] + arg4, this.field680[var31] + arg6) - arg5) / arg1;
                }
            }
        } else if (arg0 == 3) {
            int var26 = (arg1 & 0xFF) * 4;
            int var27 = ((arg1 & 0xFF4F) >> 8) * 4;
            int var28 = (arg1 >> 16 & 0xFF) << 6;
            int var29 = arg1 >> 24 & 0xFF << 6;
            if (arg4 - (var26 >> 1) < 0 || ((var26 >> 1) + arg4 + arg2.field1040) >= (arg2.field1041 << arg2.field1038) || (arg6 - (var27 >> 1)) < 0 || ((var27 >> 1) + arg2.field1040 + arg6) >= (arg2.field1043 << arg2.field1038)) {
                return;
            }
            this.method645(arg5, var28, var29, var27, var26, arg2, arg6, 0, arg4);
        } else if (arg0 == 4) {
            int var24 = this.field701 - this.field717;
            for (int var25 = 0; var25 < this.field662; var25++) {
                this.field685[var25] = this.field685[var25] + arg3.method552(1, this.field684[var25] + arg4, this.field680[var25] + arg6) + var24 - arg5;
            }
        } else if (arg0 == 5) {
            int var17 = this.field701 - this.field717;
            for (int var18 = 0; var18 < this.field662; var18++) {
                int var19 = this.field684[var18] + arg4;
                int var20 = this.field680[var18] + arg6;
                int var21 = arg2.method552(1, var19, var20);
                int var22 = arg3.method552(1, var19, var20);
                int var23 = var21 - var22 - arg1;
                this.field685[var18] = ((this.field685[var18] << 8) / var17 * var23 >> 8) + (var21 - arg5);
            }
        }
        this.method355(12823);
        this.field652 = false;
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(IIZIIIIII)Z")
    private final boolean method321(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field657++;
        if (arg7 > arg0 && arg0 < arg3 && arg0 < arg6) {
            return false;
        } else if (arg7 < arg0 && arg3 < arg0 && arg0 > arg6) {
            return false;
        } else {
            if (!arg2) {
                this.field654 = null;
            }
            if (arg5 < arg8 && arg5 < arg1 && arg4 > arg5) {
                return false;
            } else {
                return arg8 >= arg5 || arg1 >= arg5 || arg5 <= arg4;
            }
        }
    }

    @OriginalMember(owner = "client!vl", name = "b", descriptor = "(B)V")
    private final void method322(byte arg0) {
        if (this.field698 != null) {
            this.field698.field6036 = false;
        }
        if (arg0 == -34) {
            field597++;
        }
    }

    @OriginalMember(owner = "client!vl", name = "c", descriptor = "(B)Z")
    private final boolean method323(byte arg0) {
        field711++;
        if (this.field698.field6036) {
            return true;
        }
        if (this.field698.field6043 == null) {
            this.field698.field6043 = this.field631.method2876(this.field648, 3);
        }
        class595 var2 = this.field698.field6043;
        var2.method380(this.field707 * 6, (byte) -17);
        if (arg0 >= -92) {
            return false;
        }
        Buffer var3 = var2.method1188(false, true);
        if (var3 != null) {
            Stream var4 = this.field631.method3219(var3, 1009);
            if (Stream.method3580()) {
                for (int var5 = 0; var5 < this.field707; var5++) {
                    var4.method3575(this.field710[var5]);
                    var4.method3575(this.field644[var5]);
                    var4.method3575(this.field704[var5]);
                }
            } else {
                for (int var6 = 0; var6 < this.field707; var6++) {
                    var4.method3583(this.field710[var6]);
                    var4.method3583(this.field644[var6]);
                    var4.method3583(this.field704[var6]);
                }
            }
            var4.method3576();
            if (var2.method1185(true)) {
                this.field678 = true;
                this.field698.field6036 = true;
                this.field698.field6039 = var2;
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(IIII)V")
    public final void method324(int arg0, int arg1, int arg2, int arg3) {
        for (int var5 = 0; var5 < this.field609; var5++) {
            int var9 = this.field619[var5] & 0xFFFF;
            int var10 = (var9 & 0xFEF5) >> 10;
            int var11 = var9 >> 7 & 0x7;
            if (arg0 != -1) {
                var10 += (arg0 - var10) * arg3 >> 7;
            }
            if (arg1 != -1) {
                var11 += (arg1 - var11) * arg3 >> 7;
            }
            int var12 = var9 & 0x7F;
            if (arg2 != -1) {
                var12 -= -((arg2 - var12) * arg3 >> 7);
            }
            this.field619[var5] = (short) class2.method189(class2.method189(var10 << 10, var11 << 7), var12);
        }
        field601++;
        if (this.field686 != null) {
            for (int var6 = 0; var6 < this.field595; var6++) {
                class521 var7 = this.field686[var6];
                class172 var8 = this.field620[var6];
                var8.field2844 = class492.field7038[this.field619[var7.field7375] & 0xFFFF] & 0xFFFFFF | var8.field2844 & 0xFF000000;
            }
        }
        this.method360((byte) -86);
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(I[IIIIIZ)V")
    public final void method325(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        field612++;
        int var8 = arg1.length;
        if (arg0 == 0) {
            int var9 = arg2 << 4;
            int var10 = arg4 << 4;
            int var11 = arg3 << 4;
            class98.field1757 = 0;
            int var12 = 0;
            class686.field9721 = 0;
            class14.field741 = 0;
            for (int var13 = 0; var13 < var8; var13++) {
                int var14 = arg1[var13];
                if (this.field709.length > var14) {
                    int[] var15 = this.field709[var14];
                    for (int var16 = 0; var16 < var15.length; var16++) {
                        int var17 = var15[var16];
                        class14.field741 += this.field684[var17];
                        class686.field9721 += this.field685[var17];
                        var12++;
                        class98.field1757 += this.field680[var17];
                    }
                }
            }
            if (var12 > 0) {
                class14.field741 = class14.field741 / var12 + var9;
                class686.field9721 = class686.field9721 / var12 + var11;
                class98.field1757 = class98.field1757 / var12 + var10;
            } else {
                class14.field741 = var9;
                class98.field1757 = var10;
                class686.field9721 = var11;
            }
        } else if (arg0 == 1) {
            int var18 = arg3 << 4;
            int var19 = arg4 << 4;
            int var20 = arg2 << 4;
            for (int var21 = 0; var21 < var8; var21++) {
                int var22 = arg1[var21];
                if (this.field709.length > var22) {
                    int[] var23 = this.field709[var22];
                    for (int var24 = 0; var24 < var23.length; var24++) {
                        int var25 = var23[var24];
                        this.field684[var25] += var20;
                        this.field685[var25] += var18;
                        this.field680[var25] += var19;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var26 = 0; var26 < var8; var26++) {
                int var45 = arg1[var26];
                if (var45 < this.field709.length) {
                    int[] var46 = this.field709[var45];
                    if ((arg5 & 0x1) == 0) {
                        for (int var47 = 0; var47 < var46.length; var47++) {
                            int var48 = var46[var47];
                            this.field684[var48] -= class14.field741;
                            this.field685[var48] -= class686.field9721;
                            this.field680[var48] -= class98.field1757;
                            if (arg4 != 0) {
                                int var49 = class509.field7210[arg4];
                                int var50 = class509.field7220[arg4];
                                int var51 = this.field685[var48] * var49 + this.field684[var48] * var50 + 16383 >> 14;
                                this.field685[var48] = this.field685[var48] * var50 + 16383 - (this.field684[var48] * var49) >> 14;
                                this.field684[var48] = var51;
                            }
                            if (arg2 != 0) {
                                int var52 = class509.field7210[arg2];
                                int var53 = class509.field7220[arg2];
                                int var54 = this.field685[var48] * var53 + 16383 - this.field680[var48] * var52 >> 14;
                                this.field680[var48] = this.field685[var48] * var52 - (-(this.field680[var48] * var53) - 16383) >> 14;
                                this.field685[var48] = var54;
                            }
                            if (arg3 != 0) {
                                int var55 = class509.field7210[arg3];
                                int var56 = class509.field7220[arg3];
                                int var57 = this.field680[var48] * var55 + (this.field684[var48] * var56) + 16383 >> 14;
                                this.field680[var48] = this.field680[var48] * var56 + 16383 - this.field684[var48] * var55 >> 14;
                                this.field684[var48] = var57;
                            }
                            this.field684[var48] += class14.field741;
                            this.field685[var48] += class686.field9721;
                            this.field680[var48] += class98.field1757;
                        }
                    } else {
                        for (int var58 = 0; var58 < var46.length; var58++) {
                            int var59 = var46[var58];
                            this.field684[var59] -= class14.field741;
                            this.field685[var59] -= class686.field9721;
                            this.field680[var59] -= class98.field1757;
                            if (arg2 != 0) {
                                int var60 = class509.field7210[arg2];
                                int var61 = class509.field7220[arg2];
                                int var62 = this.field685[var59] * var61 + (16383 - (this.field680[var59] * var60)) >> 14;
                                this.field680[var59] = this.field685[var59] * var60 + this.field680[var59] * var61 + 16383 >> 14;
                                this.field685[var59] = var62;
                            }
                            if (arg4 != 0) {
                                int var63 = class509.field7210[arg4];
                                int var64 = class509.field7220[arg4];
                                int var65 = this.field685[var59] * var63 + this.field684[var59] * var64 + 16383 >> 14;
                                this.field685[var59] = this.field685[var59] * var64 + 16383 - (this.field684[var59] * var63) >> 14;
                                this.field684[var59] = var65;
                            }
                            if (arg3 != 0) {
                                int var66 = class509.field7210[arg3];
                                int var67 = class509.field7220[arg3];
                                int var68 = this.field684[var59] * var67 + this.field680[var59] * var66 + 16383 >> 14;
                                this.field680[var59] = this.field680[var59] * var67 + 16383 - (this.field684[var59] * var66) >> 14;
                                this.field684[var59] = var68;
                            }
                            this.field684[var59] += class14.field741;
                            this.field685[var59] += class686.field9721;
                            this.field680[var59] += class98.field1757;
                        }
                    }
                }
            }
            if (arg6) {
                for (int var27 = 0; var27 < var8; var27++) {
                    int var28 = arg1[var27];
                    if (this.field709.length > var28) {
                        int[] var29 = this.field709[var28];
                        for (int var30 = 0; var30 < var29.length; var30++) {
                            int var31 = var29[var30];
                            int var32 = this.field669[var31];
                            int var33 = this.field669[var31 + 1];
                            for (int var34 = var32; var34 < var33; var34++) {
                                int var35 = this.field633[var34] - 1;
                                if (var35 == -1) {
                                    break;
                                }
                                if (arg4 != 0) {
                                    int var36 = class509.field7210[arg4];
                                    int var37 = class509.field7220[arg4];
                                    int var38 = this.field665[var35] * var36 + this.field629[var35] * var37 + 16383 >> 14;
                                    this.field665[var35] = (short) (this.field665[var35] * var37 + 16383 - (this.field629[var35] * var36) >> 14);
                                    this.field629[var35] = (short) var38;
                                }
                                if (arg2 != 0) {
                                    int var39 = class509.field7210[arg2];
                                    int var40 = class509.field7220[arg2];
                                    int var41 = this.field665[var35] * var40 + 16383 - (this.field623[var35] * var39) >> 14;
                                    this.field623[var35] = (short) (this.field623[var35] * var40 + this.field665[var35] * var39 + 16383 >> 14);
                                    this.field665[var35] = (short) var41;
                                }
                                if (arg3 != 0) {
                                    int var42 = class509.field7210[arg3];
                                    int var43 = class509.field7220[arg3];
                                    int var44 = this.field629[var35] * var43 + (this.field623[var35] * var42 + 16383) >> 14;
                                    this.field623[var35] = (short) (this.field623[var35] * var43 + 16383 - (this.field629[var35] * var42) >> 14);
                                    this.field629[var35] = (short) var44;
                                }
                            }
                        }
                    }
                }
                this.method309((byte) 111);
            }
        } else if (arg0 == 3) {
            for (int var69 = 0; var69 < var8; var69++) {
                int var70 = arg1[var69];
                if (this.field709.length > var70) {
                    int[] var71 = this.field709[var70];
                    for (int var72 = 0; var72 < var71.length; var72++) {
                        int var73 = var71[var72];
                        this.field684[var73] -= class14.field741;
                        this.field685[var73] -= class686.field9721;
                        this.field680[var73] -= class98.field1757;
                        this.field684[var73] = this.field684[var73] * arg2 >> 7;
                        this.field685[var73] = this.field685[var73] * arg3 >> 7;
                        this.field680[var73] = this.field680[var73] * arg4 >> 7;
                        this.field684[var73] += class14.field741;
                        this.field685[var73] += class686.field9721;
                        this.field680[var73] += class98.field1757;
                    }
                }
            }
        } else if (arg0 == 5) {
            if (this.field650 != null) {
                boolean var74 = false;
                for (int var75 = 0; var75 < var8; var75++) {
                    int var79 = arg1[var75];
                    if (var79 < this.field650.length) {
                        int[] var80 = this.field650[var79];
                        for (int var81 = 0; var81 < var80.length; var81++) {
                            int var82 = var80[var81];
                            int var83 = (this.field712[var82] & 0xFF) + (arg2 * 8);
                            if (var83 < 0) {
                                var83 = 0;
                            } else if (var83 > 255) {
                                var83 = 255;
                            }
                            this.field712[var82] = (byte) var83;
                        }
                        var74 |= var80.length > 0;
                    }
                }
                if (var74) {
                    if (this.field686 != null) {
                        for (int var76 = 0; var76 < this.field595; var76++) {
                            class521 var77 = this.field686[var76];
                            class172 var78 = this.field620[var76];
                            var78.field2844 = 255 - (this.field712[var77.field7375] & 0xFF) << 24 | var78.field2844 & 0xFFFFFF;
                        }
                    }
                    this.method360((byte) -86);
                }
            }
        } else if (arg0 == 7) {
            if (this.field650 != null) {
                boolean var84 = false;
                for (int var85 = 0; var85 < var8; var85++) {
                    int var89 = arg1[var85];
                    if (this.field650.length > var89) {
                        int[] var90 = this.field650[var89];
                        for (int var91 = 0; var91 < var90.length; var91++) {
                            int var92 = var90[var91];
                            int var93 = this.field619[var92] & 0xFFFF;
                            int var94 = (var93 & 0xFD0A) >> 10;
                            int var95 = var93 >> 7 & 0x7;
                            int var96 = arg2 + var94 & 0x3F;
                            int var97 = var93 & 0x7F;
                            int var98 = arg3 / 4 + var95;
                            if (var98 < 0) {
                                var98 = 0;
                            } else if (var98 > 7) {
                                var98 = 7;
                            }
                            int var99 = arg4 + var97;
                            if (var99 < 0) {
                                var99 = 0;
                            } else if (var99 > 127) {
                                var99 = 127;
                            }
                            this.field619[var92] = (short) class2.method189(var99, class2.method189(var98 << 7, var96 << 10));
                        }
                        var84 |= var90.length > 0;
                    }
                }
                if (var84) {
                    if (this.field686 != null) {
                        for (int var86 = 0; var86 < this.field595; var86++) {
                            class521 var87 = this.field686[var86];
                            class172 var88 = this.field620[var86];
                            var88.field2844 = class492.field7038[this.field619[var87.field7375] & 0xFFFF] & 0xFFFFFF | var88.field2844 & 0xFF000000;
                        }
                    }
                    this.method360((byte) -86);
                }
            }
        } else if (arg0 == 8) {
            if (this.field611 != null) {
                for (int var100 = 0; var100 < var8; var100++) {
                    int var101 = arg1[var100];
                    if (var101 < this.field611.length) {
                        int[] var102 = this.field611[var101];
                        for (int var103 = 0; var103 < var102.length; var103++) {
                            class172 var104 = this.field620[var102[var103]];
                            var104.field2841 += arg2;
                            var104.field2846 += arg3;
                        }
                    }
                }
            }
        } else if (arg0 == 10) {
            if (this.field611 != null) {
                for (int var105 = 0; var105 < var8; var105++) {
                    int var106 = arg1[var105];
                    if (this.field611.length > var106) {
                        int[] var107 = this.field611[var106];
                        for (int var108 = 0; var108 < var107.length; var108++) {
                            class172 var109 = this.field620[var107[var108]];
                            var109.field2840 = var109.field2840 * arg3 >> 7;
                            var109.field2842 = var109.field2842 * arg2 >> 7;
                        }
                    }
                }
            }
        } else if (arg0 == 9 && this.field611 != null) {
            for (int var110 = 0; var110 < var8; var110++) {
                int var111 = arg1[var110];
                if (var111 < this.field611.length) {
                    int[] var112 = this.field611[var111];
                    for (int var113 = 0; var113 < var112.length; var113++) {
                        class172 var114 = this.field620[var112[var113]];
                        var114.field2847 = var114.field2847 + arg2 & 0x3FFF;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(Lda;IIIZ)V")
    public final void method326(class55 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field643++;
        class13 var6 = (class13) arg0;
        if (this.field609 == 0 || var6.field609 == 0) {
            return;
        }
        int var7 = var6.field662;
        int[] var8 = var6.field684;
        int[] var9 = var6.field685;
        int[] var10 = var6.field680;
        short[] var11 = var6.field629;
        short[] var12 = var6.field665;
        short[] var13 = var6.field623;
        byte[] var14 = var6.field627;
        short[] var15;
        short[] var16;
        byte[] var17;
        short[] var18;
        if (this.field670 == null) {
            var15 = null;
            var16 = null;
            var17 = null;
            var18 = null;
        } else {
            var15 = this.field670.field5366;
            var16 = this.field670.field5369;
            var18 = this.field670.field5367;
            var17 = this.field670.field5365;
        }
        byte[] var19;
        short[] var20;
        short[] var21;
        short[] var22;
        if (var6.field670 == null) {
            var19 = null;
            var20 = null;
            var21 = null;
            var22 = null;
        } else {
            var21 = var6.field670.field5366;
            var22 = var6.field670.field5367;
            var19 = var6.field670.field5365;
            var20 = var6.field670.field5369;
        }
        int[] var23 = var6.field669;
        short[] var24 = var6.field633;
        if (!var6.field652) {
            var6.method335((byte) 114);
        }
        int var25 = var6.field717;
        int var26 = var6.field701;
        int var27 = var6.field622;
        int var28 = var6.field614;
        int var29 = var6.field719;
        int var30 = var6.field608;
        for (int var31 = 0; var31 < this.field662; var31++) {
            int var32 = this.field685[var31] - arg2;
            if (var32 >= var25 && var32 <= var26) {
                int var33 = this.field684[var31] - arg1;
                if (var27 <= var33 && var28 >= var33) {
                    int var34 = this.field680[var31] - arg3;
                    if (var34 >= var29 && var30 >= var34) {
                        int var35 = -1;
                        int var36 = this.field669[var31];
                        int var37 = this.field669[var31 + 1];
                        for (int var38 = var36; var38 < var37; var38++) {
                            var35 = this.field633[var38] - 1;
                            if (var35 == -1 || this.field627[var35] != 0) {
                                break;
                            }
                        }
                        if (var35 != -1) {
                            for (int var39 = 0; var39 < var7; var39++) {
                                if (var8[var39] == var33 && var10[var39] == var34 && var9[var39] == var32) {
                                    int var40 = var23[var39];
                                    int var41 = var23[var39 + 1];
                                    int var42 = -1;
                                    for (int var43 = var40; var43 < var41; var43++) {
                                        var42 = var24[var43] - 1;
                                        if (var42 == -1 || var14[var42] != 0) {
                                            break;
                                        }
                                    }
                                    if (var42 != -1) {
                                        if (var16 == null) {
                                            this.field670 = new class361();
                                            var16 = this.field670.field5369 = class150.method1186(-4, this.field629);
                                            var18 = this.field670.field5367 = class150.method1186(-4, this.field665);
                                            var15 = this.field670.field5366 = class150.method1186(-4, this.field623);
                                            var17 = this.field670.field5365 = class275.method1800(this.field627, (byte) -85);
                                        }
                                        if (var20 == null) {
                                            class361 var44 = var6.field670 = new class361();
                                            var20 = var44.field5369 = class150.method1186(-4, var11);
                                            var22 = var44.field5367 = class150.method1186(-4, var12);
                                            var21 = var44.field5366 = class150.method1186(-4, var13);
                                            var19 = var44.field5365 = class275.method1800(var14, (byte) -52);
                                        }
                                        short var45 = this.field629[var35];
                                        short var46 = this.field665[var35];
                                        short var47 = this.field623[var35];
                                        byte var48 = this.field627[var35];
                                        int var49 = var23[var39 + 1];
                                        int var50 = var23[var39];
                                        for (int var51 = var50; var51 < var49; var51++) {
                                            int var52 = var24[var51] - 1;
                                            if (var52 == -1) {
                                                break;
                                            }
                                            if (var19[var52] != 0) {
                                                var20[var52] += var45;
                                                var22[var52] += var46;
                                                var21[var52] += var47;
                                                var19[var52] += var48;
                                            }
                                        }
                                        short var53 = var12[var42];
                                        byte var54 = var14[var42];
                                        short var55 = var13[var42];
                                        short var56 = var11[var42];
                                        int var57 = this.field669[var31 + 1];
                                        int var58 = this.field669[var31];
                                        for (int var59 = var58; var59 < var57; var59++) {
                                            int var60 = this.field633[var59] - 1;
                                            if (var60 == -1) {
                                                break;
                                            }
                                            if (var17[var60] != 0) {
                                                var16[var60] += var56;
                                                var18[var60] += var53;
                                                var15[var60] += var55;
                                                var17[var60] += var54;
                                            }
                                        }
                                        var6.method309((byte) 111);
                                        this.method309((byte) 111);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!vl", name = "za", descriptor = "()I")
    public final int method327() {
        field628++;
        if (!this.field652) {
            this.method335((byte) -79);
        }
        return this.field608;
    }

    @OriginalMember(owner = "client!vl", name = "OA", descriptor = "()I")
    public final int method328() {
        if (!this.field652) {
            this.method335((byte) -40);
        }
        field610++;
        return this.field719;
    }

    @OriginalMember(owner = "client!vl", name = "TA", descriptor = "()I")
    public final int method329() {
        field673++;
        return this.field618;
    }

    @OriginalMember(owner = "client!vl", name = "l", descriptor = "()I")
    public final int method330() {
        field634++;
        if (!this.field652) {
            this.method335((byte) 123);
        }
        return this.field614;
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(IZI)I")
    public static final int method331(int arg0, boolean arg1, int arg2) {
        field688++;
        int var3 = (arg2 & 0x7F) * arg0 >> 7;
        if (arg1) {
            field718 = null;
        }
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return (arg2 & 0xFF80) + var3;
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(ZIZLvl;BLvl;)Lda;")
    private final class55 method332(boolean arg0, int arg1, boolean arg2, class13 arg3, byte arg4, class13 arg5) {
        arg5.field595 = this.field595;
        arg5.field656 = this.field656;
        arg5.field632 = arg1;
        arg5.field707 = this.field707;
        if ((arg1 & 0x100) == 0) {
            arg5.field668 = this.field668;
        } else {
            arg5.field668 = true;
        }
        arg5.field609 = this.field609;
        arg5.field662 = this.field662;
        arg5.field618 = this.field618;
        arg5.field625 = this.field625;
        arg5.field682 = this.field682;
        field679++;
        arg5.field672 = this.field672;
        if (arg4 < 112) {
            field721 = null;
        }
        boolean var7 = class678.method3814((byte) 107, arg1, this.field682);
        boolean var8 = class581.method3335((byte) 76, this.field682, arg1);
        boolean var9 = class32.method512((byte) -68, this.field682, arg1);
        boolean var10 = var9 | var8 | var7;
        if (var10) {
            if (!var7) {
                arg5.field684 = this.field684;
            } else if (arg3.field684 == null || arg3.field684.length < this.field656) {
                arg5.field684 = arg3.field684 = new int[this.field656];
            } else {
                arg5.field684 = arg3.field684;
            }
            if (!var8) {
                arg5.field685 = this.field685;
            } else if (arg3.field685 == null || this.field656 > arg3.field685.length) {
                arg5.field685 = arg3.field685 = new int[this.field656];
            } else {
                arg5.field685 = arg3.field685;
            }
            if (!var9) {
                arg5.field680 = this.field680;
            } else if (arg3.field680 == null || this.field656 > arg3.field680.length) {
                arg5.field680 = arg3.field680 = new int[this.field656];
            } else {
                arg5.field680 = arg3.field680;
            }
            for (int var11 = 0; var11 < this.field656; var11++) {
                if (var7) {
                    arg5.field684[var11] = this.field684[var11];
                }
                if (var8) {
                    arg5.field685[var11] = this.field685[var11];
                }
                if (var9) {
                    arg5.field680[var11] = this.field680[var11];
                }
            }
        } else {
            arg5.field684 = this.field684;
            arg5.field685 = this.field685;
            arg5.field680 = this.field680;
        }
        if (class102.method954(this.field682, 7325, arg1)) {
            arg5.field654 = arg3.field654;
            arg5.field654.field7057 = this.field654.field7057;
            arg5.field654.field7053 = true;
            arg5.field654.field7060 = this.field654.field7060;
        } else if (class376.method2363((byte) -118, this.field682, arg1)) {
            arg5.field654 = this.field654;
        } else {
            arg5.field654 = null;
        }
        if (class310.method2028((byte) 12, arg1, this.field682)) {
            if (arg3.field619 == null || arg3.field619.length < this.field609) {
                arg5.field619 = arg3.field619 = new short[this.field609];
            } else {
                arg5.field619 = arg3.field619;
            }
            for (int var12 = 0; var12 < this.field609; var12++) {
                arg5.field619[var12] = this.field619[var12];
            }
        } else {
            arg5.field619 = this.field619;
        }
        if (class167.method1269(arg1, this.field682, (byte) -89)) {
            if (arg3.field712 == null || arg3.field712.length < this.field609) {
                arg5.field712 = arg3.field712 = new byte[this.field609];
            } else {
                arg5.field712 = arg3.field712;
            }
            for (int var13 = 0; var13 < this.field609; var13++) {
                arg5.field712[var13] = this.field712[var13];
            }
        } else {
            arg5.field712 = this.field712;
        }
        if (class357.method2289((byte) 21, this.field682, arg1)) {
            arg5.field653 = arg3.field653;
            arg5.field653.field7060 = this.field653.field7060;
            arg5.field653.field7053 = true;
            arg5.field653.field7057 = this.field653.field7057;
        } else if (class617.method3535(70, arg1, this.field682)) {
            arg5.field653 = this.field653;
        } else {
            arg5.field653 = null;
        }
        if (class457.method2742(arg1, -116, this.field682)) {
            if (arg3.field629 == null || this.field672 > arg3.field629.length) {
                int var14 = this.field672;
                arg5.field623 = arg3.field623 = new short[var14];
                arg5.field629 = arg3.field629 = new short[var14];
                arg5.field665 = arg3.field665 = new short[var14];
            } else {
                arg5.field665 = arg3.field665;
                arg5.field629 = arg3.field629;
                arg5.field623 = arg3.field623;
            }
            if (this.field670 == null) {
                arg5.field670 = null;
                for (int var15 = 0; var15 < this.field672; var15++) {
                    arg5.field629[var15] = this.field629[var15];
                    arg5.field665[var15] = this.field665[var15];
                    arg5.field623[var15] = this.field623[var15];
                }
            } else {
                if (arg3.field670 == null) {
                    arg3.field670 = new class361();
                }
                class361 var16 = arg5.field670 = arg3.field670;
                if (var16.field5369 == null || this.field672 > var16.field5369.length) {
                    int var17 = this.field672;
                    var16.field5367 = new short[var17];
                    var16.field5365 = new byte[var17];
                    var16.field5366 = new short[var17];
                    var16.field5369 = new short[var17];
                }
                for (int var18 = 0; var18 < this.field672; var18++) {
                    arg5.field629[var18] = this.field629[var18];
                    arg5.field665[var18] = this.field665[var18];
                    arg5.field623[var18] = this.field623[var18];
                    var16.field5369[var18] = this.field670.field5369[var18];
                    var16.field5367[var18] = this.field670.field5367[var18];
                    var16.field5366[var18] = this.field670.field5366[var18];
                    var16.field5365[var18] = this.field670.field5365[var18];
                }
            }
            arg5.field627 = this.field627;
        } else {
            arg5.field629 = this.field629;
            arg5.field665 = this.field665;
            arg5.field627 = this.field627;
            arg5.field623 = this.field623;
            arg5.field670 = this.field670;
        }
        if (class25.method487(false, this.field682, arg1)) {
            arg5.field702 = arg3.field702;
            arg5.field702.field7057 = this.field702.field7057;
            arg5.field702.field7060 = this.field702.field7060;
            arg5.field702.field7053 = true;
        } else if (class420.method2546((byte) 112, arg1, this.field682)) {
            arg5.field702 = this.field702;
        } else {
            arg5.field702 = null;
        }
        if (class88.method866((byte) 5, this.field682, arg1)) {
            if (arg3.field720 == null || this.field609 > arg3.field720.length) {
                int var19 = this.field672;
                arg5.field613 = arg3.field613 = new float[var19];
                arg5.field720 = arg3.field720 = new float[var19];
            } else {
                arg5.field613 = arg3.field613;
                arg5.field720 = arg3.field720;
            }
            for (int var20 = 0; var20 < this.field672; var20++) {
                arg5.field720[var20] = this.field720[var20];
                arg5.field613[var20] = this.field613[var20];
            }
        } else {
            arg5.field613 = this.field613;
            arg5.field720 = this.field720;
        }
        if (class112.method1008((byte) -52, arg1, this.field682)) {
            arg5.field641 = arg3.field641;
            arg5.field641.field7053 = true;
            arg5.field641.field7057 = this.field641.field7057;
            arg5.field641.field7060 = this.field641.field7060;
        } else if (class651.method3717(arg1, -127, this.field682)) {
            arg5.field641 = this.field641;
        } else {
            arg5.field641 = null;
        }
        if (class381.method2373(this.field682, arg1, 3164)) {
            if (arg3.field710 == null || this.field609 > arg3.field710.length) {
                int var21 = this.field609;
                arg5.field644 = arg3.field644 = new short[var21];
                arg5.field704 = arg3.field704 = new short[var21];
                arg5.field710 = arg3.field710 = new short[var21];
            } else {
                arg5.field704 = arg3.field704;
                arg5.field644 = arg3.field644;
                arg5.field710 = arg3.field710;
            }
            for (int var22 = 0; var22 < this.field609; var22++) {
                arg5.field710[var22] = this.field710[var22];
                arg5.field644[var22] = this.field644[var22];
                arg5.field704[var22] = this.field704[var22];
            }
        } else {
            arg5.field644 = this.field644;
            arg5.field710 = this.field710;
            arg5.field704 = this.field704;
        }
        if (class292.method1950(this.field682, 7492, arg1)) {
            arg5.field698 = arg3.field698;
            arg5.field698.field6045 = true;
            arg5.field698.field6036 = this.field698.field6036;
            arg5.field698.field6039 = this.field698.field6039;
        } else if (class103.method958(this.field682, arg1, 101)) {
            arg5.field698 = this.field698;
        } else {
            arg5.field698 = null;
        }
        if (class398.method2449((byte) -33, this.field682, arg1)) {
            if (arg3.field607 == null || arg3.field607.length < this.field609) {
                int var23 = this.field609;
                arg5.field607 = arg3.field607 = new short[var23];
            } else {
                arg5.field607 = arg3.field607;
            }
            for (int var24 = 0; var24 < this.field609; var24++) {
                arg5.field607[var24] = this.field607[var24];
            }
        } else {
            arg5.field607 = this.field607;
        }
        if (!class96.method913(-95, arg1, this.field682)) {
            arg5.field620 = this.field620;
        } else if (arg3.field620 == null || this.field595 > arg3.field620.length) {
            int var26 = this.field595;
            arg5.field620 = arg3.field620 = new class172[var26];
            for (int var27 = 0; var27 < this.field595; var27++) {
                arg5.field620[var27] = this.field620[var27].method1292(102);
            }
        } else {
            arg5.field620 = arg3.field620;
            for (int var25 = 0; var25 < this.field595; var25++) {
                arg5.field620[var25].method1295(this.field620[var25], 1);
            }
        }
        if (this.field652) {
            arg5.field624 = this.field624;
            arg5.field614 = this.field614;
            arg5.field695 = this.field695;
            arg5.field622 = this.field622;
            arg5.field719 = this.field719;
            arg5.field608 = this.field608;
            arg5.field652 = true;
            arg5.field717 = this.field717;
            arg5.field701 = this.field701;
        } else {
            arg5.field652 = false;
        }
        arg5.field709 = this.field709;
        arg5.field655 = this.field655;
        arg5.field626 = this.field626;
        arg5.field596 = this.field596;
        arg5.field675 = this.field675;
        arg5.field669 = this.field669;
        arg5.field650 = this.field650;
        arg5.field633 = this.field633;
        arg5.field646 = this.field646;
        arg5.field611 = this.field611;
        arg5.field694 = this.field694;
        arg5.field667 = this.field667;
        arg5.field686 = this.field686;
        arg5.field645 = this.field645;
        arg5.field621 = this.field621;
        return arg5;
    }

    @OriginalMember(owner = "client!vl", name = "b", descriptor = "(I)V")
    private final void method333(int arg0) {
        field605++;
        if (this.field686 != null) {
            this.field631.method81(false);
            this.field631.method3268(false, (byte) 115);
            this.field631.method3231(1, class370.field5487, (byte) -63);
            this.field631.method3224(1, (byte) -80, class370.field5487);
            for (int var2 = 0; var2 < this.field595; var2++) {
                class521 var3 = this.field686[var2];
                class172 var4 = this.field620[var2];
                if (!var3.field7379 || !this.field631.method162()) {
                    float var5 = (float) (this.field684[var3.field7376] - (-this.field684[var3.field7372] - this.field684[var3.field7371])) * 0.3333333F;
                    float var6 = (float) (this.field685[var3.field7376] + this.field685[var3.field7371] + this.field685[var3.field7372]) * 0.3333333F;
                    float var7 = (float) (this.field680[var3.field7376] + this.field680[var3.field7371] + this.field680[var3.field7372]) * 0.3333333F;
                    float var8 = class417.field6026 * var7 + class704.field9914 * var6 + class487.field6984 * var5 + class36.field1032;
                    float var9 = class47.field1135 * var7 + class530.field7444 * var5 + class293.field4399 * var6 + class317.field4659;
                    float var10 = class200.field3103 * var7 + class640.field9205 * var6 + class198.field3087 * var5 + class544.field7589;
                    class391 var11 = this.field631.method3190((byte) 63);
                    var11.method2423(var4.field2847, (float) var4.field2846 + var9, var3.field7383 * var4.field2840 >> 7, (float) (-var3.field7370) + var10, (byte) 63, var3.field7377 * var4.field2842 >> 7, (float) var4.field2841 + var8);
                    var11.method2414(arg0 ^ 0x75, this.field631.field8101);
                    this.field631.method3260((byte) -118);
                    int var12 = var4.field2844;
                    this.field631.method3222(var3.field7382, (byte) -102, false, false);
                    this.field631.method3248(-3, var3.field7380);
                    this.field631.method3242((byte) -73, var12);
                    this.field631.method3218((byte) -64);
                }
            }
            this.field631.method3224(1, (byte) -80, class661.field9521);
            this.field631.method3231(1, class661.field9521, (byte) -44);
            this.field631.method81(true);
        }
        if (arg0 != 2) {
            method306('\u0002', -6, null);
        }
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(Lq;Lql;I)V")
    public final void method334(class396 arg0, class684 arg1, int arg2) {
        field683++;
        if (this.field672 == 0) {
            return;
        }
        class391 var4 = this.field631.field8100;
        class391 var5 = (class391) arg0;
        if (!this.field652) {
            this.method335((byte) 119);
        }
        class544.field7589 = var4.field5737 * var5.field5706 + var4.field5735 * var5.field5705 + var4.field5723 * var5.field5713 + var4.field5706;
        class640.field9205 = var4.field5737 * var5.field5735 + var4.field5735 * var5.field5701 + var4.field5723 * var5.field5703;
        float var6 = (float) this.field717 * class640.field9205 + class544.field7589;
        float var7 = (float) this.field701 * class640.field9205 + class544.field7589;
        float var8;
        float var9;
        if (var7 < var6) {
            var8 = (float) this.field624 + var6;
            var9 = (float) (-this.field624) + var7;
        } else {
            var8 = (float) this.field624 + var7;
            var9 = var6 - (float) this.field624;
        }
        if ((this.field631.field8160 <= var9) || (var8 <= (float) this.field631.field8135)) {
            return;
        }
        class36.field1032 = var4.field5733 * var5.field5706 + var4.field5721 * var5.field5713 + var4.field5703 * var5.field5705 + var4.field5713;
        class704.field9914 = var4.field5733 * var5.field5735 + var4.field5721 * var5.field5703 + var4.field5703 * var5.field5701;
        float var10 = (float) this.field717 * class704.field9914 + class36.field1032;
        float var11 = (float) this.field701 * class704.field9914 + class36.field1032;
        float var12;
        float var13;
        if (var10 > var11) {
            var12 = ((float) this.field624 + var10) * (float) this.field631.field8200;
            var13 = (var11 - (float) this.field624) * (float) this.field631.field8200;
        } else {
            var13 = ((float) (-this.field624) + var10) * (float) this.field631.field8200;
            var12 = ((float) this.field624 + var11) * (float) this.field631.field8200;
        }
        if ((var13 / var8 >= this.field631.field8126) || (this.field631.field8163 >= var12 / var8)) {
            return;
        }
        class293.field4399 = var4.field5707 * var5.field5735 + var4.field5711 * var5.field5703 + var4.field5701 * var5.field5701;
        class317.field4659 = var4.field5707 * var5.field5706 + var4.field5711 * var5.field5713 + var4.field5701 * var5.field5705 + var4.field5705;
        float var14 = (float) this.field717 * class293.field4399 + class317.field4659;
        float var15 = (float) this.field701 * class293.field4399 + class317.field4659;
        float var16;
        float var17;
        if ((var14 > var15)) {
            var17 = ((float) this.field624 + var14) * (float) this.field631.field8140;
            var16 = (var15 - (float) this.field624) * (float) this.field631.field8140;
        } else {
            var16 = ((float) (-this.field624) + var14) * (float) this.field631.field8140;
            var17 = ((float) this.field624 + var15) * (float) this.field631.field8140;
        }
        if ((var16 / var8 >= this.field631.field8141) || (this.field631.field8191 >= var17 / var8)) {
            return;
        }
        if (arg1 != null || this.field686 != null) {
            class200.field3103 = var4.field5737 * var5.field5737 + var4.field5735 * var5.field5707 + var4.field5723 * var5.field5733;
            class530.field7444 = var4.field5707 * var5.field5723 + var4.field5711 * var5.field5721 + var4.field5701 * var5.field5711;
            class47.field1135 = var4.field5707 * var5.field5737 + var4.field5711 * var5.field5733 + var4.field5701 * var5.field5707;
            class198.field3087 = var4.field5737 * var5.field5723 + var4.field5735 * var5.field5711 + var4.field5723 * var5.field5721;
            class487.field6984 = var4.field5733 * var5.field5723 + var4.field5721 * var5.field5721 + var4.field5703 * var5.field5711;
            class417.field6026 = var4.field5733 * var5.field5737 + var4.field5721 * var5.field5733 + var4.field5703 * var5.field5707;
        }
        if (arg1 != null) {
            boolean var18 = false;
            boolean var19 = true;
            int var20 = this.field622 + this.field614 >> 1;
            int var21 = this.field719 + this.field608 >> 1;
            int var22 = (int) ((float) var21 * class417.field6026 + (float) this.field717 * class704.field9914 + (float) var20 * class487.field6984 + class36.field1032);
            int var23 = (int) ((float) var21 * class47.field1135 + (float) this.field717 * class293.field4399 + (float) var20 * class530.field7444 + class317.field4659);
            int var24 = (int) ((float) var21 * class200.field3103 + (float) this.field717 * class640.field9205 + (float) var20 * class198.field3087 + class544.field7589);
            if (this.field631.field8135 > var24) {
                var18 = true;
            } else {
                arg1.field9705 = this.field631.field8200 * var22 / var24 + this.field631.field8202;
                arg1.field9710 = this.field631.field8140 * var23 / var24 + this.field631.field8151;
            }
            int var25 = (int) ((float) var21 * class417.field6026 + (float) this.field701 * class704.field9914 + (float) var20 * class487.field6984 + class36.field1032);
            int var26 = (int) ((float) var21 * class47.field1135 + (float) this.field701 * class293.field4399 + (float) var20 * class530.field7444 + class317.field4659);
            int var27 = (int) ((float) var21 * class200.field3103 + (float) this.field701 * class640.field9205 + (float) var20 * class198.field3087 + class544.field7589);
            if (this.field631.field8135 > var27) {
                var18 = true;
            } else {
                arg1.field9708 = this.field631.field8151 + (this.field631.field8140 * var26 / var27);
                arg1.field9706 = this.field631.field8202 + (this.field631.field8200 * var25 / var27);
            }
            if (var18) {
                if (var24 < this.field631.field8135 && var27 < this.field631.field8135) {
                    var19 = false;
                } else if (this.field631.field8135 > var24) {
                    int var31 = (var27 - this.field631.field8135 << 16) / (var27 - var24);
                    int var32 = var25 + ((var25 - var22) * var31 >> 16);
                    arg1.field9705 = this.field631.field8202 + (this.field631.field8200 * var32 / this.field631.field8135);
                    int var33 = var26 + ((var26 - var23) * var31 >> 16);
                    arg1.field9710 = this.field631.field8151 + (this.field631.field8140 * var33 / this.field631.field8135);
                } else if (this.field631.field8135 > var27) {
                    int var28 = (var24 - this.field631.field8135 << 16) / (var24 - var27);
                    int var29 = ((var22 - var25) * var28 >> 16) + var22;
                    int var30 = var23 + ((var23 - var26) * var28 >> 16);
                    arg1.field9705 = this.field631.field8200 * var29 / this.field631.field8135 + this.field631.field8202;
                    arg1.field9710 = this.field631.field8140 * var30 / this.field631.field8135 + this.field631.field8151;
                }
            }
            if (var19) {
                arg1.field9707 = true;
                if (var24 <= var27) {
                    arg1.field9709 = (this.field624 + var25) * this.field631.field8200 / var27 + this.field631.field8202 - arg1.field9706;
                } else {
                    arg1.field9709 = (this.field624 + var22) * this.field631.field8200 / var24 + this.field631.field8202 - arg1.field9705;
                }
            }
        }
        this.field631.method3204(-9);
        this.field631.method3212(var5, 0);
        this.method345(4);
        this.method333(2);
    }

    @OriginalMember(owner = "client!vl", name = "d", descriptor = "(B)V")
    private final void method335(byte arg0) {
        field659++;
        int var2 = 32767;
        int var3 = 32767;
        int var4 = 32767;
        int var5 = -32768;
        int var6 = -32768;
        int var7 = -32768;
        int var8 = 0;
        int var9 = 0;
        for (int var10 = 0; var10 < this.field662; var10++) {
            int var12 = this.field684[var10];
            int var13 = this.field685[var10];
            if (var12 < var2) {
                var2 = var12;
            }
            int var14 = this.field680[var10];
            if (var13 > var6) {
                var6 = var13;
            }
            if (var12 > var5) {
                var5 = var12;
            }
            if (var3 > var13) {
                var3 = var13;
            }
            if (var14 > var7) {
                var7 = var14;
            }
            if (var14 < var4) {
                var4 = var14;
            }
            int var15 = var12 * var12 + var14 * var14;
            if (var8 < var15) {
                var8 = var15;
            }
            int var16 = var13 * var13 + var12 * var12 + var14 * var14;
            if (var16 > var9) {
                var9 = var16;
            }
        }
        this.field701 = var6;
        this.field608 = var7;
        this.field719 = var4;
        this.field614 = var5;
        this.field622 = var2;
        this.field717 = var3;
        this.field624 = (int) (Math.sqrt((double) var8) + 0.99D);
        this.field695 = (int) (Math.sqrt((double) var9) + 0.99D);
        this.field652 = true;
        int var11 = 105 / ((66 - arg0) / 41);
    }

    @OriginalMember(owner = "client!vl", name = "L", descriptor = "()V")
    public final void method336() {
        field708++;
        for (int var1 = 0; var1 < this.field656; var1++) {
            this.field684[var1] = this.field684[var1] + 7 >> 4;
            this.field685[var1] = this.field685[var1] + 7 >> 4;
            this.field680[var1] = this.field680[var1] + 7 >> 4;
        }
        this.method355(12823);
        this.field652 = false;
    }

    @OriginalMember(owner = "client!vl", name = "oa", descriptor = "(III)V")
    public final void method337(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field662; var4++) {
            if (arg0 != 0) {
                this.field684[var4] += arg0;
            }
            if (arg1 != 0) {
                this.field685[var4] += arg1;
            }
            if (arg2 != 0) {
                this.field680[var4] += arg2;
            }
        }
        field604++;
        this.method355(12823);
        this.field652 = false;
    }

    @OriginalMember(owner = "client!vl", name = "f", descriptor = "()Z")
    public final boolean method338() {
        field706++;
        if (this.field607 == null) {
            return true;
        }
        for (int var1 = 0; var1 < this.field607.length; var1++) {
            if (this.field607[var1] != -1 && !this.field631.field2768.method1499(this.field607[var1], -24052)) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!vl", name = "c", descriptor = "(I)V")
    private final void method339(int arg0) {
        field598++;
        if (!this.field678) {
            return;
        }
        this.field678 = false;
        if (this.field667 == null && this.field655 == null && this.field686 == null) {
            if (this.field684 != null && !class565.method3273(this.field682, this.field632, false)) {
                if (this.field654 == null || this.field654.method2961(false)) {
                    if (!this.field652) {
                        this.method335((byte) 121);
                    }
                    this.field684 = null;
                } else {
                    this.field678 = true;
                }
            }
            if (this.field685 != null && !class297.method1976(this.field682, this.field632, -98)) {
                if (this.field654 == null || this.field654.method2961(false)) {
                    if (!this.field652) {
                        this.method335((byte) 110);
                    }
                    this.field685 = null;
                } else {
                    this.field678 = true;
                }
            }
            if (this.field680 != null && !class318.method2048(this.field632, this.field682, 0)) {
                if (this.field654 == null || this.field654.method2961(false)) {
                    if (!this.field652) {
                        this.method335((byte) -126);
                    }
                    this.field680 = null;
                } else {
                    this.field678 = true;
                }
            }
        }
        if (this.field633 != null && this.field684 == null && this.field685 == null && this.field680 == null) {
            this.field669 = null;
            this.field633 = null;
        }
        if (this.field627 != null && !class117.method1029(0, this.field682, this.field632)) {
            label202: {
                label201: {
                    boolean var10000;
                    if ((this.field682 & 0x37) == 0) {
                        if (this.field653 == null || this.field653.method2961(false)) {
                            break label201;
                        }
                        var10000 = false;
                    } else {
                        if (this.field702 == null || this.field702.method2961(false)) {
                            break label201;
                        }
                        var10000 = false;
                    }
                    if (!var10000) {
                        this.field678 = true;
                        break label202;
                    }
                }
                this.field627 = null;
                this.field629 = this.field665 = this.field623 = null;
            }
        }
        if (this.field619 != null && !class121.method1049((byte) 105, this.field632, this.field682)) {
            if (this.field653 == null || this.field653.method2961(false)) {
                this.field619 = null;
            } else {
                this.field678 = true;
            }
        }
        if (this.field712 != null && !class255.method1696(this.field632, this.field682, (byte) -116)) {
            if (this.field653 == null || this.field653.method2961(false)) {
                this.field712 = null;
            } else {
                this.field678 = true;
            }
        }
        if (this.field720 != null && !class370.method2345((byte) -22, this.field682, this.field632)) {
            if (this.field641 == null || this.field641.method2961(false)) {
                this.field720 = this.field613 = null;
            } else {
                this.field678 = true;
            }
        }
        if (this.field607 != null && !class19.method437(true, this.field682, this.field632)) {
            if (this.field653 == null || this.field653.method2961(false)) {
                this.field607 = null;
            } else {
                this.field678 = true;
            }
        }
        if (arg0 <= 93) {
            return;
        }
        if (this.field710 != null && !class115.method1019(this.field632, this.field682, (byte) 109)) {
            if ((this.field698 == null || this.field698.method2544(false)) && (this.field653 == null || this.field653.method2961(false))) {
                this.field710 = this.field644 = this.field704 = null;
            } else {
                this.field678 = true;
            }
        }
        if (this.field645 != null) {
            if (this.field654 == null || this.field654.method2961(false)) {
                this.field645 = null;
            } else {
                this.field678 = true;
            }
        }
        if (this.field694 != null) {
            if (this.field653 == null || this.field653.method2961(false)) {
                this.field694 = null;
            } else {
                this.field678 = true;
            }
        }
        if (this.field650 != null && !class71.method787(this.field632, this.field682, (byte) 121)) {
            this.field646 = null;
            this.field650 = null;
        }
        if (this.field709 != null && !class446.method2683(this.field632, -6769, this.field682)) {
            this.field626 = null;
            this.field709 = null;
        }
        if (this.field611 != null && !class294.method1960(this.field682, false, this.field632)) {
            this.field611 = null;
        }
        if (this.field596 != null && (this.field632 & 0x800) == 0 && (this.field632 & 0x40000) == 0) {
            this.field621 = null;
            this.field596 = null;
            this.field675 = null;
        }
    }

    @OriginalMember(owner = "client!vl", name = "FA", descriptor = "()V")
    public final void method340() {
        for (int var1 = 0; var1 < this.field662; var1++) {
            this.field680[var1] = -this.field680[var1];
        }
        field639++;
        for (int var2 = 0; var2 < this.field672; var2++) {
            this.field623[var2] = (short) (-this.field623[var2]);
        }
        for (int var3 = 0; var3 < this.field609; var3++) {
            short var4 = this.field710[var3];
            this.field710[var3] = this.field704[var3];
            this.field704[var3] = var4;
        }
        this.method355(12823);
        this.method309((byte) 111);
        this.method322((byte) -34);
        this.field652 = false;
    }

    @OriginalMember(owner = "client!vl", name = "F", descriptor = "()Z")
    public final boolean method341() {
        field714++;
        if (this.field709 == null) {
            return false;
        }
        for (int var1 = 0; var1 < this.field656; var1++) {
            this.field684[var1] <<= 0x4;
            this.field685[var1] <<= 0x4;
            this.field680[var1] <<= 0x4;
        }
        class98.field1757 = 0;
        class686.field9721 = 0;
        class14.field741 = 0;
        return true;
    }

    @OriginalMember(owner = "client!vl", name = "na", descriptor = "()I")
    public final int method342() {
        field690++;
        return this.field625;
    }

    @OriginalMember(owner = "client!vl", name = "H", descriptor = "()I")
    public final int method343() {
        if (!this.field652) {
            this.method335((byte) 107);
        }
        field661++;
        return this.field701;
    }

    @OriginalMember(owner = "client!vl", name = "fa", descriptor = "(I)V")
    public final void method344(int arg0) {
        field705++;
        int var2 = class509.field7210[arg0];
        int var3 = class509.field7220[arg0];
        for (int var4 = 0; var4 < this.field662; var4++) {
            int var7 = this.field680[var4] * var2 + (this.field684[var4] * var3) >> 14;
            this.field680[var4] = this.field680[var4] * var3 - (this.field684[var4] * var2) >> 14;
            this.field684[var4] = var7;
        }
        for (int var5 = 0; var5 < this.field672; var5++) {
            int var6 = this.field629[var5] * var3 + this.field623[var5] * var2 >> 14;
            this.field623[var5] = (short) (this.field623[var5] * var3 - (this.field629[var5] * var2) >> 14);
            this.field629[var5] = (short) var6;
        }
        this.method355(12823);
        this.method309((byte) 111);
        this.field652 = false;
    }

    @OriginalMember(owner = "client!vl", name = "d", descriptor = "(I)V")
    private final void method345(int arg0) {
        field600++;
        if (this.field707 == 0) {
            return;
        }
        if (this.method347((byte) 58) && this.method323((byte) -125)) {
            this.field631.method2873(1, 0, this.field654.field7060);
            this.field631.method2873(arg0 ^ 0x5, 1, this.field653.field7060);
            this.field631.method2873(1, 2, this.field641.field7060);
            boolean var2;
            if ((this.field682 & 0x37) == 0) {
                var2 = false;
                this.field631.method3268(false, (byte) 115);
                this.field631.method2862(arg0 ^ 0x3477, this.field631.field8213);
            } else {
                this.field631.method3268(true, (byte) 115);
                var2 = true;
                this.field631.method2873(1, 3, this.field702.field7060);
                this.field631.method2862(13427, this.field631.field8220);
            }
            for (int var3 = 0; var3 < this.field675.length; var3++) {
                int var4 = this.field596[var3];
                int var5 = this.field596[var3 + 1];
                int var6 = this.field607[var4] & 0xFFFF;
                if (var6 == 65535) {
                    var6 = -1;
                }
                this.field631.method3222(var6, (byte) -114, true, var2);
                this.field631.method2872(class634.field9107, this.field675[var3], -103, this.field621[var3], var4 * 3, var5 - var4, this.field698.field6039);
            }
        }
        if (arg0 != 4) {
            this.field719 = -84;
        }
        this.method339(97);
    }

    @OriginalMember(owner = "client!vl", name = "R", descriptor = "(III)V")
    public final void method346(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field662; var4++) {
            if (arg0 != 128) {
                this.field684[var4] = this.field684[var4] * arg0 >> 7;
            }
            if (arg1 != 128) {
                this.field685[var4] = this.field685[var4] * arg1 >> 7;
            }
            if (arg2 != 128) {
                this.field680[var4] = this.field680[var4] * arg2 >> 7;
            }
        }
        field677++;
        this.method355(12823);
        this.field652 = false;
    }

    @OriginalMember(owner = "client!vl", name = "e", descriptor = "(B)Z")
    private final boolean method347(byte arg0) {
        field692++;
        boolean var2 = !this.field653.field7057;
        boolean var3 = (this.field682 & 0x37) != 0 && !this.field702.field7057;
        boolean var4 = !this.field654.field7057;
        boolean var5 = !this.field641.field7057;
        if (!var4 && !var2 && !var3 && !var5) {
            return true;
        }
        boolean var6 = true;
        if (var4) {
            if (this.field654.field7052 == null) {
                this.field654.field7052 = this.field631.method2851(true, this.field648);
            }
            class378 var7 = this.field654.field7052;
            var7.method2164(12, 3573, this.field672 * 12);
            Buffer var8 = var7.method2167(-1926, true);
            if (var8 == null) {
                var6 = false;
            } else {
                this.field631.field7915.copyPositions(this.field684, this.field685, this.field680, this.field645, 0, 12, this.field672, var8.getAddress());
                if (var7.method2169((byte) -113)) {
                    this.field654.field7057 = true;
                    this.field654.field7060 = var7;
                } else {
                    var6 = false;
                }
            }
        }
        if (var2) {
            if (this.field653.field7052 == null) {
                this.field653.field7052 = this.field631.method2851(true, this.field648);
            }
            class378 var9 = this.field653.field7052;
            var9.method2164(4, 3573, this.field672 * 4);
            Buffer var10 = var9.method2167(-1926, true);
            if (var10 == null) {
                var6 = false;
            } else {
                if ((this.field682 & 0x37) == 0) {
                    short[] var11;
                    short[] var12;
                    byte[] var13;
                    short[] var14;
                    if (this.field670 == null) {
                        var12 = this.field629;
                        var11 = this.field623;
                        var13 = this.field627;
                        var14 = this.field665;
                    } else {
                        var11 = this.field670.field5366;
                        var12 = this.field670.field5369;
                        var13 = this.field670.field5365;
                        var14 = this.field670.field5367;
                    }
                    this.field631.field7915.copyLighting(this.field619, this.field712, this.field607, var12, var14, var11, var13, this.field618, this.field625, this.field694, 0, 4, this.field672, var10.getAddress());
                } else {
                    this.field631.field7915.copyColours(this.field619, this.field712, this.field607, this.field618, this.field694, 0, 4, this.field672, var10.getAddress());
                }
                if (var9.method2169((byte) 87)) {
                    this.field653.field7057 = true;
                    this.field653.field7060 = var9;
                } else {
                    var6 = false;
                }
            }
        }
        if (arg0 != 58) {
            return false;
        }
        if (var3) {
            if (this.field702.field7052 == null) {
                this.field702.field7052 = this.field631.method2851(true, this.field648);
            }
            class378 var15 = this.field702.field7052;
            var15.method2164(12, arg0 + 3515, this.field672 * 12);
            Buffer var16 = var15.method2167(-1926, true);
            if (var16 == null) {
                var6 = false;
            } else {
                byte[] var17;
                short[] var18;
                short[] var19;
                short[] var20;
                if (this.field670 == null) {
                    var17 = this.field627;
                    var18 = this.field665;
                    var19 = this.field623;
                    var20 = this.field629;
                } else {
                    var20 = this.field670.field5369;
                    var17 = this.field670.field5365;
                    var19 = this.field670.field5366;
                    var18 = this.field670.field5367;
                }
                this.field631.field7915.copyNormals(var20, var18, var19, var17, 3.0F / (float) this.field625, 3.0F / (float) (this.field625 / 2 + this.field625), 0, 12, this.field672, var16.getAddress());
                if (var15.method2169((byte) -115)) {
                    this.field702.field7060 = var15;
                    this.field702.field7057 = true;
                } else {
                    var6 = false;
                }
            }
        }
        if (var5) {
            if (this.field641.field7052 == null) {
                this.field641.field7052 = this.field631.method2851(true, this.field648);
            }
            class378 var21 = this.field641.field7052;
            var21.method2164(8, arg0 ^ 0xDCF, this.field672 * 8);
            Buffer var22 = var21.method2167(-1926, true);
            if (var22 == null) {
                var6 = false;
            } else {
                this.field631.field7915.copyTexCoords(this.field720, this.field613, 0, 8, this.field672, var22.getAddress());
                if (var21.method2169((byte) -102)) {
                    this.field641.field7057 = true;
                    this.field641.field7060 = var21;
                } else {
                    var6 = false;
                }
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!vl", name = "d", descriptor = "()[Laq;")
    public final class146[] method348() {
        field606++;
        return this.field655;
    }

    @OriginalMember(owner = "client!vl", name = "M", descriptor = "(I)V")
    public final void method349(int arg0) {
        field599++;
        int var2 = class509.field7210[arg0];
        int var3 = class509.field7220[arg0];
        for (int var4 = 0; var4 < this.field662; var4++) {
            int var5 = this.field684[var4] * var3 + this.field680[var4] * var2 >> 14;
            this.field680[var4] = this.field680[var4] * var3 - (this.field684[var4] * var2) >> 14;
            this.field684[var4] = var5;
        }
        this.method355(12823);
        this.field652 = false;
    }

    @OriginalMember(owner = "client!vl", name = "WA", descriptor = "(IIII)V")
    public final void method350(int arg0, int arg1, int arg2, int arg3) {
        field696++;
        if (arg0 == 0) {
            class14.field741 = 0;
            class686.field9721 = 0;
            class98.field1757 = 0;
            int var5 = 0;
            for (int var6 = 0; var6 < this.field662; var6++) {
                class14.field741 += this.field684[var6];
                class686.field9721 += this.field685[var6];
                class98.field1757 += this.field680[var6];
                var5++;
            }
            if (var5 <= 0) {
                class14.field741 = arg1;
                class686.field9721 = arg2;
                class98.field1757 = arg3;
            } else {
                class98.field1757 = class98.field1757 / var5 + arg3;
                class686.field9721 = class686.field9721 / var5 + arg2;
                class14.field741 = class14.field741 / var5 + arg1;
            }
        } else if (arg0 == 1) {
            for (int var7 = 0; var7 < this.field662; var7++) {
                this.field684[var7] += arg1;
                this.field685[var7] += arg2;
                this.field680[var7] += arg3;
            }
        } else if (arg0 == 2) {
            for (int var8 = 0; var8 < this.field662; var8++) {
                this.field684[var8] -= class14.field741;
                this.field685[var8] -= class686.field9721;
                this.field680[var8] -= class98.field1757;
                if (arg3 != 0) {
                    int var9 = class509.field7210[arg3];
                    int var10 = class509.field7220[arg3];
                    int var11 = this.field685[var8] * var9 + this.field684[var8] * var10 + 16383 >> 14;
                    this.field685[var8] = this.field685[var8] * var10 + 16383 - (this.field684[var8] * var9) >> 14;
                    this.field684[var8] = var11;
                }
                if (arg1 != 0) {
                    int var12 = class509.field7210[arg1];
                    int var13 = class509.field7220[arg1];
                    int var14 = this.field685[var8] * var13 + 16383 - this.field680[var8] * var12 >> 14;
                    this.field680[var8] = this.field685[var8] * var12 + this.field680[var8] * var13 + 16383 >> 14;
                    this.field685[var8] = var14;
                }
                if (arg2 != 0) {
                    int var15 = class509.field7210[arg2];
                    int var16 = class509.field7220[arg2];
                    int var17 = this.field680[var8] * var15 - (-(this.field684[var8] * var16) - 16383) >> 14;
                    this.field680[var8] = this.field680[var8] * var16 + 16383 - this.field684[var8] * var15 >> 14;
                    this.field684[var8] = var17;
                }
                this.field684[var8] += class14.field741;
                this.field685[var8] += class686.field9721;
                this.field680[var8] += class98.field1757;
            }
        } else if (arg0 == 3) {
            for (int var18 = 0; var18 < this.field662; var18++) {
                this.field684[var18] -= class14.field741;
                this.field685[var18] -= class686.field9721;
                this.field680[var18] -= class98.field1757;
                this.field684[var18] = this.field684[var18] * arg1 / 128;
                this.field685[var18] = this.field685[var18] * arg2 / 128;
                this.field680[var18] = this.field680[var18] * arg3 / 128;
                this.field684[var18] += class14.field741;
                this.field685[var18] += class686.field9721;
                this.field680[var18] += class98.field1757;
            }
        } else if (arg0 == 5) {
            for (int var19 = 0; var19 < this.field609; var19++) {
                int var23 = (this.field712[var19] & 0xFF) + arg1 * 8;
                if (var23 < 0) {
                    var23 = 0;
                } else if (var23 > 255) {
                    var23 = 255;
                }
                this.field712[var19] = (byte) var23;
            }
            if (this.field686 != null) {
                for (int var20 = 0; var20 < this.field595; var20++) {
                    class521 var21 = this.field686[var20];
                    class172 var22 = this.field620[var20];
                    var22.field2844 = 255 - (this.field712[var21.field7375] & 0xFF) << 24 | var22.field2844 & 0xFFFFFF;
                }
            }
            this.method360((byte) -86);
        } else if (arg0 == 7) {
            for (int var24 = 0; var24 < this.field609; var24++) {
                int var28 = this.field619[var24] & 0xFFFF;
                int var29 = (var28 & 0xFC58) >> 10;
                int var30 = (var28 & 0x3AB) >> 7;
                int var31 = arg1 + var29 & 0x3F;
                int var32 = arg2 / 4 + var30;
                int var33 = var28 & 0x7F;
                int var34 = arg3 + var33;
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
                this.field619[var24] = (short) class2.method189(var34, class2.method189(var32 << 7, var31 << 10));
            }
            if (this.field686 != null) {
                for (int var25 = 0; var25 < this.field595; var25++) {
                    class521 var26 = this.field686[var25];
                    class172 var27 = this.field620[var25];
                    var27.field2844 = class492.field7038[this.field619[var26.field7375] & 0xFFFF] & 0xFFFFFF | var27.field2844 & 0xFF000000;
                }
            }
            this.method360((byte) -86);
        } else if (arg0 == 8) {
            for (int var35 = 0; var35 < this.field595; var35++) {
                class172 var36 = this.field620[var35];
                var36.field2841 += arg1;
                var36.field2846 += arg2;
            }
        } else if (arg0 == 10) {
            for (int var37 = 0; var37 < this.field595; var37++) {
                class172 var38 = this.field620[var37];
                var38.field2842 = var38.field2842 * arg1 >> 7;
                var38.field2840 = var38.field2840 * arg2 >> 7;
            }
        } else if (arg0 == 9) {
            for (int var39 = 0; var39 < this.field595; var39++) {
                class172 var40 = this.field620[var39];
                var40.field2847 = var40.field2847 + arg1 & 0x3FFF;
            }
        }
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(IIIFFIIIILnda;J)S")
    private final short method351(int arg0, int arg1, int arg2, float arg3, float arg4, int arg5, int arg6, int arg7, int arg8, class519 arg9, long arg10) {
        field691++;
        int var13 = this.field669[arg5];
        int var14 = this.field669[arg5 + 1];
        int var15 = 0;
        for (int var16 = var13; var16 < var14; var16++) {
            short var17 = this.field633[var16];
            if (var17 == 0) {
                var15 = var16;
                break;
            }
            if (class631.field9086[var16] == arg10) {
                return (short) (var17 - 1);
            }
        }
        this.field633[var15] = (short) (this.field672 - arg6);
        class631.field9086[var15] = arg10;
        this.field694[this.field672] = (short) arg0;
        this.field645[this.field672] = (short) arg5;
        this.field629[this.field672] = (short) arg7;
        this.field665[this.field672] = (short) arg8;
        this.field623[this.field672] = (short) arg1;
        this.field627[this.field672] = (byte) arg2;
        this.field720[this.field672] = arg3;
        this.field613[this.field672] = arg4;
        return (short) (this.field672++);
    }

    @OriginalMember(owner = "client!vl", name = "PA", descriptor = "()I")
    public final int method352() {
        field699++;
        return this.field632;
    }

    @OriginalMember(owner = "client!vl", name = "e", descriptor = "(I)V")
    public final void method353(int arg0) {
        if (this.field654 != null) {
            this.field654.method2962((byte) 66);
        }
        if (arg0 != 2) {
            this.method311(null);
        }
        field689++;
        if (this.field641 != null) {
            this.field641.method2962((byte) 87);
        }
        if (this.field653 != null) {
            this.field653.method2962((byte) 76);
        }
        if (this.field702 != null) {
            this.field702.method2962((byte) 66);
        }
        if (this.field698 != null) {
            this.field698.method2545(-128);
        }
    }

    @OriginalMember(owner = "client!vl", name = "K", descriptor = "()I")
    public final int method354() {
        if (!this.field652) {
            this.method335((byte) 126);
        }
        field636++;
        return this.field624;
    }

    @OriginalMember(owner = "client!vl", name = "f", descriptor = "(I)V")
    private final void method355(int arg0) {
        field647++;
        if (arg0 != 12823) {
            this.method354();
        }
        if (this.field654 != null) {
            this.field654.field7057 = false;
        }
    }

    @OriginalMember(owner = "client!vl", name = "MA", descriptor = "(I)V")
    public final void method356(int arg0) {
        field663++;
        int var2 = class509.field7210[arg0];
        int var3 = class509.field7220[arg0];
        for (int var4 = 0; var4 < this.field662; var4++) {
            int var5 = this.field685[var4] * var3 - (this.field680[var4] * var2) >> 14;
            this.field680[var4] = this.field685[var4] * var2 + this.field680[var4] * var3 >> 14;
            this.field685[var4] = var5;
        }
        this.method355(12823);
        this.field652 = false;
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(BIZ)Lda;")
    public final class55 method357(byte arg0, int arg1, boolean arg2) {
        field664++;
        class13 var4;
        class13 var5;
        if (arg0 == 1) {
            var4 = this.field631.field8225;
            var5 = this.field631.field8216;
        } else if (arg0 == 2) {
            var5 = this.field631.field8206;
            var4 = this.field631.field8209;
        } else if (arg0 == 3) {
            var4 = this.field631.field8214;
            var5 = this.field631.field8222;
        } else if (arg0 == 4) {
            var5 = this.field631.field8219;
            var4 = this.field631.field8210;
        } else if (arg0 == 5) {
            var5 = this.field631.field8208;
            var4 = this.field631.field8221;
        } else {
            var5 = var4 = new class13(this.field631, 0, 0, true, false);
        }
        return this.method332(arg2, arg1, arg0 != 0, var4, (byte) 121, var5);
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(IILq;Z)Z")
    public final boolean method358(int arg0, int arg1, class396 arg2, boolean arg3) {
        field602++;
        return this.method367(arg2, -1, arg0, arg1, (byte) -52, arg3);
    }

    @OriginalMember(owner = "client!vl", name = "f", descriptor = "(B)V")
    public static void method359(byte arg0) {
        field722 = null;
        field660 = null;
        field721 = null;
        if (arg0 > 70) {
            field718 = null;
        }
    }

    @OriginalMember(owner = "client!vl", name = "g", descriptor = "(B)V")
    private final void method360(byte arg0) {
        if (arg0 == -86) {
            field615++;
            if (this.field653 != null) {
                this.field653.field7057 = false;
            }
        }
    }

    @OriginalMember(owner = "client!vl", name = "SA", descriptor = "(I)V")
    public final void method361(int arg0) {
        field676++;
        if (this.field654 != null) {
            this.field654.field7053 = class102.method954(this.field682, 7325, arg0);
        }
        if (this.field641 != null) {
            this.field641.field7053 = class112.method1008((byte) -52, arg0, this.field682);
        }
        if (this.field653 != null) {
            this.field653.field7053 = class357.method2289((byte) 21, this.field682, arg0);
        }
        if (this.field702 != null) {
            this.field702.field7053 = class25.method487(false, this.field682, arg0);
        }
        this.field632 = arg0;
        this.field678 = true;
        if (this.field670 != null && (this.field632 & 0x10000) == 0) {
            this.field665 = this.field670.field5367;
            this.field627 = this.field670.field5365;
            this.field629 = this.field670.field5369;
            this.field623 = this.field670.field5366;
            this.field670 = null;
        }
        this.method339(125);
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "()[Ltk;")
    public final class317[] method362() {
        field640++;
        return this.field667;
    }

    @OriginalMember(owner = "client!vl", name = "LA", descriptor = "()Z")
    public final boolean method363() {
        field700++;
        return this.field668;
    }

    @OriginalMember(owner = "client!vl", name = "DA", descriptor = "(SS)V")
    public final void method364(short arg0, short arg1) {
        field637++;
        class214 var3 = this.field631.field2768;
        for (int var4 = 0; var4 < this.field609; var4++) {
            if (this.field607[var4] == arg0) {
                this.field607[var4] = arg1;
            }
        }
        byte var5 = 0;
        byte var6 = 0;
        if (arg0 != -1) {
            class699 var7 = var3.method1500(arg0 & 0xFFFF, -108);
            var6 = var7.field9838;
            var5 = var7.field9843;
        }
        byte var8 = 0;
        byte var9 = 0;
        if (arg1 != -1) {
            class699 var10 = var3.method1500(arg1 & 0xFFFF, -91);
            var8 = var10.field9843;
            var9 = var10.field9838;
        }
        if (!var6 != var9 | var5 != var8) {
            return;
        }
        if (this.field686 != null) {
            for (int var11 = 0; var11 < this.field595; var11++) {
                class521 var12 = this.field686[var11];
                class172 var13 = this.field620[var11];
                var13.field2844 = var13.field2844 & 0xFF000000 | class492.field7038[this.field619[var12.field7375] & 0xFFFF] & 0xFFFFFF;
            }
        }
        this.method360((byte) -86);
    }

    @OriginalMember(owner = "client!vl", name = "<init>", descriptor = "(Lcf;Lnda;IIII)V")
    public class13(class562 arg0, class519 arg1, int arg2, int arg3, int arg4, int arg5) {
        this(arg0, arg2, arg5, true, false);
        class214 var7 = arg0.field2768;
        int[] var8 = new int[arg1.field7317];
        this.field669 = new int[arg1.field7325 + 1];
        for (int var9 = 0; var9 < arg1.field7317; var9++) {
            if ((arg1.field7321 == null || arg1.field7321[var9] != 2) && (arg1.field7347 == null || arg1.field7347[var9] == -1 || !var7.method1500(arg1.field7347[var9] & 0xFFFF, -60).field9839)) {
                var8[this.field609++] = var9;
                this.field669[arg1.field7314[var9]]++;
                this.field669[arg1.field7318[var9]]++;
                this.field669[arg1.field7324[var9]]++;
            }
        }
        this.field707 = this.field609;
        long[] var10 = new long[this.field609];
        boolean var11 = (this.field632 & 0x100) != 0;
        label507: for (int var12 = 0; var12 < this.field609; var12++) {
            int var185 = var8[var12];
            class699 var186 = null;
            int var187 = 0;
            byte var188 = 0;
            byte var189 = 0;
            byte var190 = 0;
            if (arg1.field7333 != null) {
                for (int var191 = 0; var191 < arg1.field7333.length; var191++) {
                    class638 var192 = arg1.field7333[var191];
                    if (var192.field9194 == var185) {
                        class535 var193 = class572.method3291(var192.field9192, (byte) 80);
                        if (var193.field7493) {
                            var10[var12] = Long.MAX_VALUE;
                            this.field707--;
                            continue label507;
                        }
                    }
                }
            }
            short var194 = -1;
            if (arg1.field7347 != null) {
                var194 = arg1.field7347[var185];
                if (var194 != -1) {
                    var186 = var7.method1500(var194 & 0xFFFF, -44);
                    var189 = var186.field9829;
                    var190 = var186.field9849;
                }
            }
            boolean var195 = arg1.field7351 != null && arg1.field7351[var185] != 0 || var186 != null && !var186.field9846 | var186.field9840;
            if ((var11 || var195) && arg1.field7326 != null) {
                var187 += arg1.field7326[var185] << 17;
            }
            if (var195) {
                var187 += 65536;
            }
            int var196 = ((var189 & 0xFF) << 8) + var187;
            int var197 = (var190 & 0xFF) + var196;
            int var198 = ((var194 & 0xFFFF) << 16) + var188;
            int var199 = (var12 & 0xFFFF) + var198;
            var10[var12] = ((long) var197 << 32) + (long) var199;
            this.field668 |= var195;
        }
        class446.method2682(var8, var10, false);
        this.field656 = arg1.field7361;
        this.field662 = arg1.field7325;
        this.field685 = arg1.field7334;
        this.field626 = arg1.field7335;
        this.field684 = arg1.field7346;
        this.field680 = arg1.field7319;
        this.field655 = arg1.field7352;
        class687[] var13 = new class687[this.field662];
        this.field667 = arg1.field7331;
        if (arg1.field7333 != null) {
            this.field595 = arg1.field7333.length;
            this.field620 = new class172[this.field595];
            this.field686 = new class521[this.field595];
            for (int var14 = 0; var14 < this.field595; var14++) {
                class638 var15 = arg1.field7333[var14];
                class535 var16 = class572.method3291(var15.field9192, (byte) 75);
                int var17 = -1;
                for (int var18 = 0; var18 < this.field609; var18++) {
                    if (var8[var18] == var15.field9194) {
                        var17 = var18;
                        break;
                    }
                }
                if (var17 == -1) {
                    throw new RuntimeException();
                }
                int var19 = class492.field7038[arg1.field7344[var15.field9194] & 0xFFFF] & 0xFFFFFF;
                int var20 = var19 | 255 - (arg1.field7351 == null ? 0 : arg1.field7351[var15.field9194]) << 24;
                this.field686[var14] = new class521(var17, arg1.field7314[var15.field9194], arg1.field7318[var15.field9194], arg1.field7324[var15.field9194], var16.field7503, var16.field7499, var16.field7492, var16.field7501, var16.field7500, var16.field7493, var16.field7496, var15.field9188);
                this.field620[var14] = new class172(var20);
            }
        }
        int var21 = this.field609 * 3;
        this.field645 = new short[var21];
        class631.field9086 = new long[var21];
        this.field704 = new short[this.field609];
        this.field633 = new short[var21];
        this.field618 = (short) arg3;
        this.field607 = new short[this.field609];
        this.field623 = new short[var21];
        this.field710 = new short[this.field609];
        this.field665 = new short[var21];
        this.field694 = new short[var21];
        this.field625 = (short) arg4;
        this.field629 = new short[var21];
        this.field712 = new byte[this.field609];
        this.field644 = new short[this.field609];
        this.field613 = new float[var21];
        this.field720 = new float[var21];
        this.field619 = new short[this.field609];
        if (arg1.field7337 != null) {
            this.field646 = new short[this.field609];
        }
        this.field627 = new byte[var21];
        int var22 = 0;
        for (int var23 = 0; var23 < arg1.field7325; var23++) {
            int var184 = this.field669[var23];
            this.field669[var23] = var22;
            var22 += var184;
            var13[var23] = new class687();
        }
        this.field669[arg1.field7325] = var22;
        int[] var24 = null;
        int[] var25 = null;
        int[] var26 = null;
        float[][] var27 = null;
        if (arg1.field7339 != null) {
            int var28 = arg1.field7353;
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
            var24 = new int[var28];
            for (int var36 = 0; var36 < this.field609; var36++) {
                int var43 = var8[var36];
                if (arg1.field7339[var43] != -1) {
                    int var44 = arg1.field7339[var43] & 0xFF;
                    for (int var45 = 0; var45 < 3; var45++) {
                        short var46;
                        if (var45 == 0) {
                            var46 = arg1.field7314[var43];
                        } else if (var45 == 1) {
                            var46 = arg1.field7318[var43];
                        } else {
                            var46 = arg1.field7324[var43];
                        }
                        int var47 = arg1.field7346[var46];
                        int var48 = arg1.field7334[var46];
                        int var49 = arg1.field7319[var46];
                        if (var47 < var29[var44]) {
                            var29[var44] = var47;
                        }
                        if (var47 > var30[var44]) {
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
            var27 = new float[var28][];
            var25 = new int[var28];
            for (int var37 = 0; var37 < var28; var37++) {
                byte var38 = arg1.field7320[var37];
                if (var38 > 0) {
                    var24[var37] = (var29[var37] + var30[var37]) / 2;
                    var25[var37] = (var31[var37] + var32[var37]) / 2;
                    var26[var37] = (var33[var37] + var34[var37]) / 2;
                    float var40;
                    float var41;
                    float var42;
                    if (var38 == 1) {
                        int var39 = arg1.field7345[var37];
                        var40 = 64.0F / (float) arg1.field7359[var37];
                        if (var39 == 0) {
                            var41 = 1.0F;
                            var42 = 1.0F;
                        } else if (var39 <= 0) {
                            var41 = (float) (-var39) / 1024.0F;
                            var42 = 1.0F;
                        } else {
                            var42 = (float) var39 / 1024.0F;
                            var41 = 1.0F;
                        }
                    } else if (var38 == 2) {
                        var41 = 64.0F / (float) arg1.field7345[var37];
                        var42 = 64.0F / (float) arg1.field7332[var37];
                        var40 = 64.0F / (float) arg1.field7359[var37];
                    } else {
                        var42 = (float) arg1.field7332[var37] / 1024.0F;
                        var41 = (float) arg1.field7345[var37] / 1024.0F;
                        var40 = (float) arg1.field7359[var37] / 1024.0F;
                    }
                    var27[var37] = class704.method3934(var42, arg1.field7356[var37], arg1.field7330[var37], var40, class481.method2919(255, arg1.field7362[var37]), arg1.field7355[var37], var41, 8);
                }
            }
        }
        class481[] var50 = new class481[arg1.field7317];
        for (int var51 = 0; var51 < arg1.field7317; var51++) {
            short var163 = arg1.field7314[var51];
            short var164 = arg1.field7318[var51];
            short var165 = arg1.field7324[var51];
            int var166 = this.field684[var164] - this.field684[var163];
            int var167 = this.field685[var164] - this.field685[var163];
            int var168 = this.field680[var164] - this.field680[var163];
            int var169 = this.field684[var165] - this.field684[var163];
            int var170 = this.field685[var165] - this.field685[var163];
            int var171 = this.field680[var165] - this.field680[var163];
            int var172 = var167 * var171 - (var168 * var170);
            int var173 = var168 * var169 - (var166 * var171);
            int var174;
            for (var174 = var166 * var170 - (var167 * var169); var172 > 8192 || var173 > 8192 || var174 > 8192 || var172 < -8192 || var173 < -8192 || var174 < -8192; var174 >>= 0x1) {
                var173 >>= 0x1;
                var172 >>= 0x1;
            }
            int var175 = (int) Math.sqrt((double) (var173 * var173 + (var172 * var172 + (var174 * var174))));
            if (var175 <= 0) {
                var175 = 1;
            }
            int var176 = var173 * 256 / var175;
            int var177 = var172 * 256 / var175;
            int var178 = var174 * 256 / var175;
            byte var179 = arg1.field7321 == null ? 0 : arg1.field7321[var51];
            if (var179 == 0) {
                class687 var181 = var13[var163];
                var181.field9728 += var176;
                var181.field9727 += var177;
                var181.field9726 += var178;
                var181.field9729++;
                class687 var182 = var13[var164];
                var182.field9727 += var177;
                var182.field9729++;
                var182.field9726 += var178;
                var182.field9728 += var176;
                class687 var183 = var13[var165];
                var183.field9729++;
                var183.field9726 += var178;
                var183.field9727 += var177;
                var183.field9728 += var176;
            } else if (var179 == 1) {
                class481 var180 = var50[var51] = new class481();
                var180.field6906 = var178;
                var180.field6905 = var177;
                var180.field6913 = var176;
            }
        }
        for (int var52 = 0; var52 < this.field609; var52++) {
            int var73 = var8[var52];
            int var74 = arg1.field7344[var73] & 0xFFFF;
            short var75;
            if (arg1.field7347 == null) {
                var75 = -1;
            } else {
                var75 = arg1.field7347[var73];
            }
            int var76;
            if (arg1.field7339 == null) {
                var76 = -1;
            } else {
                var76 = arg1.field7339[var73];
            }
            int var77;
            if (arg1.field7351 == null) {
                var77 = 0;
            } else {
                var77 = arg1.field7351[var73] & 0xFF;
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
                    var81 = 1.0F;
                    var80 = 1.0F;
                    var78 = 0.0F;
                    var83 = 0.0F;
                    var79 = 1.0F;
                    var82 = 0.0F;
                    var84 = 1;
                    var85 = 2;
                } else {
                    var76 &= 0xFF;
                    byte var87 = arg1.field7320[var76];
                    if (var87 == 0) {
                        short var88 = arg1.field7314[var73];
                        short var89 = arg1.field7318[var73];
                        short var90 = arg1.field7324[var73];
                        short var91 = arg1.field7356[var76];
                        short var92 = arg1.field7330[var76];
                        short var93 = arg1.field7355[var76];
                        float var94 = (float) arg1.field7346[var91];
                        float var95 = (float) arg1.field7334[var91];
                        float var96 = (float) arg1.field7319[var91];
                        float var97 = (float) arg1.field7346[var92] - var94;
                        float var98 = (float) arg1.field7334[var92] - var95;
                        float var99 = (float) arg1.field7319[var92] - var96;
                        float var100 = (float) arg1.field7346[var93] - var94;
                        float var101 = (float) arg1.field7334[var93] - var95;
                        float var102 = (float) arg1.field7319[var93] - var96;
                        float var103 = (float) arg1.field7346[var88] - var94;
                        float var104 = (float) arg1.field7334[var88] - var95;
                        float var105 = (float) arg1.field7319[var88] - var96;
                        float var106 = (float) arg1.field7346[var89] - var94;
                        float var107 = (float) arg1.field7334[var89] - var95;
                        float var108 = (float) arg1.field7319[var89] - var96;
                        float var109 = (float) arg1.field7346[var90] - var94;
                        float var110 = (float) arg1.field7334[var90] - var95;
                        float var111 = (float) arg1.field7319[var90] - var96;
                        float var112 = var98 * var102 - (var99 * var101);
                        float var113 = var99 * var100 - var97 * var102;
                        float var114 = var97 * var101 - var98 * var100;
                        float var115 = var101 * var114 - var102 * var113;
                        float var116 = var102 * var112 - (var100 * var114);
                        float var117 = var100 * var113 - (var101 * var112);
                        float var118 = 1.0F / (var99 * var117 + var97 * var115 + var98 * var116);
                        var80 = (var108 * var117 + var106 * var115 + var107 * var116) * var118;
                        var82 = (var111 * var117 + var109 * var115 + var110 * var116) * var118;
                        var78 = (var105 * var117 + var103 * var115 + var104 * var116) * var118;
                        float var119 = var98 * var114 - (var99 * var113);
                        float var120 = var97 * var113 - var98 * var112;
                        float var121 = var99 * var112 - (var97 * var114);
                        float var122 = 1.0F / (var102 * var120 + var100 * var119 + var101 * var121);
                        var79 = (var105 * var120 + var103 * var119 + var104 * var121) * var122;
                        var83 = (var111 * var120 + var109 * var119 + var110 * var121) * var122;
                        var81 = (var108 * var120 + var106 * var119 + var107 * var121) * var122;
                    } else {
                        short var123 = arg1.field7314[var73];
                        short var124 = arg1.field7318[var73];
                        short var125 = arg1.field7324[var73];
                        int var126 = var24[var76];
                        int var127 = var25[var76];
                        int var128 = var26[var76];
                        float[] var129 = var27[var76];
                        byte var130 = arg1.field7315[var76];
                        float var131 = (float) arg1.field7338[var76] / 256.0F;
                        if (var87 == 1) {
                            float var149 = (float) arg1.field7332[var76] / 1024.0F;
                            class431.method2624(var128, var131, var127, var126, arg1.field7319[var123], var129, arg1.field7346[var123], var149, arg1.field7334[var123], 2, var130);
                            var79 = class544.field7587;
                            var78 = class608.field8860;
                            class431.method2624(var128, var131, var127, var126, arg1.field7319[var124], var129, arg1.field7346[var124], var149, arg1.field7334[var124], 2, var130);
                            var81 = class544.field7587;
                            var80 = class608.field8860;
                            class431.method2624(var128, var131, var127, var126, arg1.field7319[var125], var129, arg1.field7346[var125], var149, arg1.field7334[var125], 2, var130);
                            var82 = class608.field8860;
                            var83 = class544.field7587;
                            float var150 = var149 / 2.0F;
                            if ((var130 & 0x1) == 0) {
                                if ((var150 < var82 - var78)) {
                                    var85 = 1;
                                    var82 -= var149;
                                } else if (var150 < var78 - var82) {
                                    var85 = 2;
                                    var82 += var149;
                                }
                                if (var150 < var80 - var78) {
                                    var80 -= var149;
                                    var84 = 1;
                                } else if (var150 < var78 - var80) {
                                    var84 = 2;
                                    var80 += var149;
                                }
                            } else {
                                if (var83 - var79 > var150) {
                                    var83 -= var149;
                                    var85 = 1;
                                } else if (var79 - var83 > var150) {
                                    var83 += var149;
                                    var85 = 2;
                                }
                                if (var81 - var79 > var150) {
                                    var84 = 1;
                                    var81 -= var149;
                                } else if (var79 - var81 > var150) {
                                    var84 = 2;
                                    var81 += var149;
                                }
                            }
                        } else if (var87 == 2) {
                            float var132 = (float) arg1.field7328[var76] / 256.0F;
                            float var133 = (float) arg1.field7316[var76] / 256.0F;
                            int var134 = arg1.field7346[var124] - arg1.field7346[var123];
                            int var135 = arg1.field7334[var124] - arg1.field7334[var123];
                            int var136 = arg1.field7319[var124] - arg1.field7319[var123];
                            int var137 = arg1.field7346[var125] - arg1.field7346[var123];
                            int var138 = arg1.field7334[var125] - arg1.field7334[var123];
                            int var139 = arg1.field7319[var125] - arg1.field7319[var123];
                            int var140 = var135 * var139 - (var136 * var138);
                            int var141 = var136 * var137 - (var134 * var139);
                            int var142 = var134 * var138 - var135 * var137;
                            float var143 = 64.0F / (float) arg1.field7345[var76];
                            float var144 = 64.0F / (float) arg1.field7359[var76];
                            float var145 = 64.0F / (float) arg1.field7332[var76];
                            float var146 = (var129[2] * (float) var142 + var129[1] * (float) var141 + var129[0] * (float) var140) / var143;
                            float var147 = (var129[5] * (float) var142 + var129[3] * (float) var140 + var129[4] * (float) var141) / var144;
                            float var148 = (var129[8] * (float) var142 + var129[7] * (float) var141 + var129[6] * (float) var140) / var145;
                            var86 = class50.method618(var147, 2, var148, var146);
                            class673.method3793(var129, var86, var128, var126, var131, var127, var132, 122, arg1.field7346[var123], var130, arg1.field7319[var123], var133, arg1.field7334[var123]);
                            var79 = class397.field5785;
                            var78 = class469.field6640;
                            class673.method3793(var129, var86, var128, var126, var131, var127, var132, -95, arg1.field7346[var124], var130, arg1.field7319[var124], var133, arg1.field7334[var124]);
                            var81 = class397.field5785;
                            var80 = class469.field6640;
                            class673.method3793(var129, var86, var128, var126, var131, var127, var132, -51, arg1.field7346[var125], var130, arg1.field7319[var125], var133, arg1.field7334[var125]);
                            var83 = class397.field5785;
                            var82 = class469.field6640;
                        } else if (var87 == 3) {
                            class97.method922(var127, arg1.field7334[var123], var126, var129, var131, var130, arg1.field7346[var123], arg1.field7319[var123], 0, var128);
                            var78 = class371.field5507;
                            var79 = class259.field3805;
                            class97.method922(var127, arg1.field7334[var124], var126, var129, var131, var130, arg1.field7346[var124], arg1.field7319[var124], 0, var128);
                            var81 = class259.field3805;
                            var80 = class371.field5507;
                            class97.method922(var127, arg1.field7334[var125], var126, var129, var131, var130, arg1.field7346[var125], arg1.field7319[var125], 0, var128);
                            var83 = class259.field3805;
                            var82 = class371.field5507;
                            if ((var130 & 0x1) == 0) {
                                if ((var82 - var78 > 0.5F)) {
                                    var85 = 1;
                                    var82--;
                                } else if (var78 - var82 > 0.5F) {
                                    var85 = 2;
                                    var82++;
                                }
                                if ((var80 - var78 > 0.5F)) {
                                    var84 = 1;
                                    var80--;
                                } else if (var78 - var80 > 0.5F) {
                                    var84 = 2;
                                    var80++;
                                }
                            } else {
                                if ((var83 - var79 > 0.5F)) {
                                    var83--;
                                    var85 = 1;
                                } else if (var79 - var83 > 0.5F) {
                                    var83++;
                                    var85 = 2;
                                }
                                if ((var81 - var79 > 0.5F)) {
                                    var81--;
                                    var84 = 1;
                                } else if (var79 - var81 > 0.5F) {
                                    var84 = 2;
                                    var81++;
                                }
                            }
                        }
                    }
                }
            }
            byte var151;
            if (arg1.field7321 == null) {
                var151 = 0;
            } else {
                var151 = arg1.field7321[var73];
            }
            if (var151 == 0) {
                long var155 = ((long) (var74 << 8) + (long) var77 + (long) (var86 << 24) << 32) + (long) (var76 << 2);
                short var157 = arg1.field7314[var73];
                short var158 = arg1.field7318[var73];
                short var159 = arg1.field7324[var73];
                class687 var160 = var13[var157];
                this.field710[var52] = this.method351(var52, var160.field9726, var160.field9729, var78, var79, var157, -1, var160.field9727, var160.field9728, arg1, var155);
                class687 var161 = var13[var158];
                this.field644[var52] = this.method351(var52, var161.field9726, var161.field9729, var80, var81, var158, -1, var161.field9727, var161.field9728, arg1, (long) var84 + var155);
                class687 var162 = var13[var159];
                this.field704[var52] = this.method351(var52, var162.field9726, var162.field9729, var82, var83, var159, -1, var162.field9727, var162.field9728, arg1, (long) var85 + var155);
            } else if (var151 == 1) {
                class481 var152 = var50[var73];
                long var153 = (long) ((var152.field6913 + 256 << 12) + (var76 << 2) + (var152.field6905 > 0 ? 1024 : 2048) + (var152.field6906 + 256 << 22)) + ((long) (var86 << 24) + (long) var77 + ((long) (var74 << 8)) << 32);
                this.field710[var52] = this.method351(var52, var152.field6906, 0, var78, var79, arg1.field7314[var73], -1, var152.field6905, var152.field6913, arg1, var153);
                this.field644[var52] = this.method351(var52, var152.field6906, 0, var80, var81, arg1.field7318[var73], -1, var152.field6905, var152.field6913, arg1, (long) var84 + var153);
                this.field704[var52] = this.method351(var52, var152.field6906, 0, var82, var83, arg1.field7324[var73], -1, var152.field6905, var152.field6913, arg1, (long) var85 + var153);
            }
            if (arg1.field7347 == null) {
                this.field607[var52] = -1;
            } else {
                this.field607[var52] = arg1.field7347[var73];
            }
            if (arg1.field7351 != null) {
                this.field712[var52] = arg1.field7351[var73];
            }
            if (arg1.field7337 != null) {
                this.field646[var52] = arg1.field7337[var73];
            }
            this.field619[var52] = arg1.field7344[var73];
        }
        if (this.field707 > 0) {
            int var53 = 1;
            short var54 = this.field607[0];
            for (int var55 = 0; var55 < this.field707; var55++) {
                short var65 = this.field607[var55];
                if (var54 != var65) {
                    var53++;
                    var54 = var65;
                }
            }
            this.field596 = new int[var53 + 1];
            this.field675 = new int[var53];
            this.field621 = new int[var53];
            this.field596[0] = 0;
            int var56 = this.field672;
            short var57 = 0;
            short var58 = this.field607[0];
            int var59 = 0;
            for (int var60 = 0; var60 < this.field707; var60++) {
                short var61 = this.field607[var60];
                if (var58 != var61) {
                    this.field675[var59] = var56;
                    this.field621[var59] = var57 + 1 - var56;
                    var59++;
                    this.field596[var59] = var60;
                    var58 = var61;
                    var56 = this.field672;
                    var57 = 0;
                }
                short var62 = this.field710[var60];
                if (var57 < var62) {
                    var57 = var62;
                }
                if (var62 < var56) {
                    var56 = var62;
                }
                short var63 = this.field644[var60];
                if (var57 < var63) {
                    var57 = var63;
                }
                if (var63 < var56) {
                    var56 = var63;
                }
                short var64 = this.field704[var60];
                if (var57 < var64) {
                    var57 = var64;
                }
                if (var64 < var56) {
                    var56 = var64;
                }
            }
            this.field675[var59] = var56;
            this.field621[var59] = var57 + 1 - var56;
            var59++;
            this.field596[var59] = this.field707;
        }
        class631.field9086 = null;
        this.field645 = class485.method2928((byte) 88, this.field645, this.field672);
        this.field694 = class485.method2928((byte) 88, this.field694, this.field672);
        this.field629 = class485.method2928((byte) 88, this.field629, this.field672);
        this.field665 = class485.method2928((byte) 88, this.field665, this.field672);
        this.field623 = class485.method2928((byte) 88, this.field623, this.field672);
        this.field627 = class14.method372(this.field627, this.field672, (byte) 124);
        this.field720 = class70.method785(this.field720, this.field672, -25709);
        this.field613 = class70.method785(this.field613, this.field672, -25709);
        if (arg1.field7360 != null && class446.method2683(arg2, -6769, this.field682)) {
            this.field709 = arg1.method3048((byte) -82, false);
        }
        if (arg1.field7333 != null && class294.method1960(this.field682, false, arg2)) {
            this.field611 = arg1.method3058((byte) -42);
        }
        if (arg1.field7336 != null && class71.method787(arg2, this.field682, (byte) 121)) {
            int var66 = 0;
            int[] var67 = new int[256];
            for (int var68 = 0; var68 < this.field609; var68++) {
                int var72 = arg1.field7336[var8[var68]];
                if (var72 >= 0) {
                    if (var66 < var72) {
                        var66 = var72;
                    }
                    int var10002 = var67[var72]++;
                }
            }
            this.field650 = new int[var66 + 1][];
            for (int var69 = 0; var69 <= var66; var69++) {
                this.field650[var69] = new int[var67[var69]];
                var67[var69] = 0;
            }
            for (int var70 = 0; var70 < this.field609; var70++) {
                int var71 = arg1.field7336[var8[var70]];
                if (var71 >= 0) {
                    this.field650[var71][var67[var71]++] = var70;
                }
            }
        }
    }

    @OriginalMember(owner = "client!vl", name = "d", descriptor = "(SS)V")
    public final void method365(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field609; var3++) {
            if (this.field619[var3] == arg0) {
                this.field619[var3] = arg1;
            }
        }
        field635++;
        if (this.field686 != null) {
            for (int var4 = 0; var4 < this.field595; var4++) {
                class521 var5 = this.field686[var4];
                class172 var6 = this.field620[var4];
                var6.field2844 = var6.field2844 & 0xFF000000 | class492.field7038[this.field619[var5.field7375] & 0xFFFF] & 0xFFFFFF;
            }
        }
        this.method360((byte) -86);
    }

    @OriginalMember(owner = "client!vl", name = "W", descriptor = "(I)V")
    public final void method366(int arg0) {
        field713++;
        int var2 = class509.field7210[arg0];
        int var3 = class509.field7220[arg0];
        for (int var4 = 0; var4 < this.field662; var4++) {
            int var5 = this.field685[var4] * var2 + this.field684[var4] * var3 >> 14;
            this.field685[var4] = this.field685[var4] * var3 - (this.field684[var4] * var2) >> 14;
            this.field684[var4] = var5;
        }
        this.method355(12823);
        this.field652 = false;
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(Lq;IIIBZ)Z")
    private final boolean method367(class396 arg0, int arg1, int arg2, int arg3, byte arg4, boolean arg5) {
        field687++;
        class391 var7 = (class391) arg0;
        class391 var8 = this.field631.field8100;
        float var9 = var7.field5706 * var8.field5733 + var7.field5713 * var8.field5721 + var7.field5705 * var8.field5703 + var8.field5713;
        float var10 = var7.field5706 * var8.field5707 + var7.field5713 * var8.field5711 + var7.field5705 * var8.field5701 + var8.field5705;
        class487.field6984 = var7.field5723 * var8.field5733 + var7.field5721 * var8.field5721 + var7.field5711 * var8.field5703;
        class530.field7444 = var7.field5723 * var8.field5707 + var7.field5721 * var8.field5711 + var7.field5711 * var8.field5701;
        class200.field3103 = var7.field5737 * var8.field5737 + var7.field5733 * var8.field5723 + var7.field5707 * var8.field5735;
        class640.field9205 = var7.field5735 * var8.field5737 + var7.field5703 * var8.field5723 + var7.field5701 * var8.field5735;
        class704.field9914 = var7.field5735 * var8.field5733 + var7.field5703 * var8.field5721 + var7.field5701 * var8.field5703;
        float var11 = var7.field5706 * var8.field5737 + var7.field5713 * var8.field5723 + var7.field5705 * var8.field5735 + var8.field5706;
        class198.field3087 = var7.field5723 * var8.field5737 + var7.field5721 * var8.field5723 + var7.field5711 * var8.field5735;
        class417.field6026 = var7.field5737 * var8.field5733 + var7.field5733 * var8.field5721 + var7.field5707 * var8.field5703;
        class47.field1135 = var7.field5737 * var8.field5707 + var7.field5733 * var8.field5711 + var7.field5707 * var8.field5701;
        class293.field4399 = var7.field5735 * var8.field5707 + var7.field5703 * var8.field5711 + var7.field5701 * var8.field5701;
        boolean var12 = false;
        float var13 = Float.MAX_VALUE;
        float var14 = -3.4028235E38F;
        float var15 = Float.MAX_VALUE;
        float var16 = -3.4028235E38F;
        int var17 = this.field631.field8200;
        int var18 = this.field631.field8140;
        if (!this.field652) {
            this.method335((byte) 115);
        }
        class365.field5416[0] = this.field622;
        class669.field9564[0] = this.field717;
        class365.field5416[1] = this.field614;
        class249.field3736[0] = this.field719;
        class669.field9564[1] = this.field717;
        class249.field3736[1] = this.field719;
        class365.field5416[2] = this.field622;
        class669.field9564[2] = this.field701;
        class249.field3736[2] = this.field719;
        class365.field5416[3] = this.field614;
        class669.field9564[3] = this.field701;
        class365.field5416[4] = this.field622;
        if (arg4 != -52) {
            this.method355(126);
        }
        class249.field3736[3] = this.field719;
        class669.field9564[4] = this.field717;
        class249.field3736[4] = this.field608;
        class365.field5416[5] = this.field614;
        class669.field9564[5] = this.field717;
        class249.field3736[5] = this.field608;
        class365.field5416[6] = this.field622;
        class669.field9564[6] = this.field701;
        class249.field3736[6] = this.field608;
        class365.field5416[7] = this.field614;
        class669.field9564[7] = this.field701;
        class249.field3736[7] = this.field608;
        for (int var19 = 0; var19 < 8; var19++) {
            float var38 = (float) class365.field5416[var19];
            float var39 = (float) class669.field9564[var19];
            float var40 = (float) class249.field3736[var19];
            float var41 = class417.field6026 * var40 + class704.field9914 * var39 + class487.field6984 * var38 + var9;
            float var42 = class47.field1135 * var40 + class530.field7444 * var38 + class293.field4399 * var39 + var10;
            float var43 = class200.field3103 * var40 + class640.field9205 * var39 + class198.field3087 * var38 + var11;
            if (var43 >= (float) this.field631.field8135) {
                if (arg1 > 0) {
                    var43 = arg1;
                }
                float var44 = (float) var17 * var41 / var43 + (float) this.field631.field8202;
                if (var44 > var14) {
                    var14 = var44;
                }
                float var45 = (float) var18 * var42 / var43 + (float) this.field631.field8151;
                if (var44 < var13) {
                    var13 = var44;
                }
                var12 = true;
                if (var45 < var15) {
                    var15 = var45;
                }
                if (var45 > var16) {
                    var16 = var45;
                }
            }
        }
        if (var12 && var13 < (float) arg2 && var14 > (float) arg2 && (float) arg3 > var15 && var16 > (float) arg3) {
            if (arg5) {
                return true;
            }
            if (class635.field9130.length < this.field672) {
                class635.field9130 = new int[this.field672];
                class266.field3949 = new int[this.field672];
            }
            for (int var20 = 0; var20 < this.field662; var20++) {
                float var22 = (float) this.field685[var20];
                float var23 = (float) this.field680[var20];
                float var24 = (float) this.field684[var20];
                float var25 = class47.field1135 * var23 + class530.field7444 * var24 + class293.field4399 * var22 + var10;
                float var26 = class417.field6026 * var23 + class704.field9914 * var22 + class487.field6984 * var24 + var9;
                float var27 = class200.field3103 * var23 + class640.field9205 * var22 + class198.field3087 * var24 + var11;
                if ((float) this.field631.field8135 <= var27) {
                    if (arg1 > 0) {
                        var27 = arg1;
                    }
                    int var28 = (int) ((float) var17 * var26 / var27 + (float) this.field631.field8202);
                    int var29 = (int) ((float) var18 * var25 / var27 + (float) this.field631.field8151);
                    int var30 = this.field669[var20];
                    int var31 = this.field669[var20 + 1];
                    for (int var32 = var30; var32 < var31; var32++) {
                        int var33 = this.field633[var32] - 1;
                        if (var33 == -1) {
                            break;
                        }
                        class635.field9130[var33] = var28;
                        class266.field3949[var33] = var29;
                    }
                } else {
                    int var34 = this.field669[var20];
                    int var35 = this.field669[var20 + 1];
                    for (int var36 = var34; var36 < var35; var36++) {
                        int var37 = this.field633[var36] - 1;
                        if (var37 == -1) {
                            break;
                        }
                        class635.field9130[this.field633[var36] - 1] = -999999;
                    }
                }
            }
            for (int var21 = 0; var21 < this.field609; var21++) {
                if (class635.field9130[this.field710[var21]] != -999999 && class635.field9130[this.field644[var21]] != -999999 && class635.field9130[this.field704[var21]] != -999999 && this.method321(arg3, class635.field9130[this.field644[var21]], true, class266.field3949[this.field644[var21]], class635.field9130[this.field704[var21]], arg2, class266.field3949[this.field704[var21]], class266.field3949[this.field710[var21]], class635.field9130[this.field710[var21]])) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!vl", name = "RA", descriptor = "()I")
    public final int method368() {
        field616++;
        if (!this.field652) {
            this.method335((byte) 122);
        }
        return this.field695;
    }

    @OriginalMember(owner = "client!vl", name = "KA", descriptor = "()I")
    public final int method369() {
        if (!this.field652) {
            this.method335((byte) -107);
        }
        field642++;
        return this.field622;
    }

    @OriginalMember(owner = "client!vl", name = "<init>", descriptor = "(Lcf;IIZZ)V")
    public class13(class562 arg0, int arg1, int arg2, boolean arg3, boolean arg4) {
        this.field652 = false;
        this.field656 = 0;
        this.field648 = false;
        this.field609 = 0;
        this.field678 = true;
        this.field662 = 0;
        this.field668 = false;
        this.field672 = 0;
        this.field707 = 0;
        this.field632 = arg1;
        this.field682 = arg2;
        this.field648 = arg4;
        this.field631 = arg0;
        if (arg3 || class376.method2363((byte) -75, this.field682, this.field632)) {
            this.field654 = new class494(class102.method954(this.field682, 7325, this.field632));
        }
        if (arg3 || class651.method3717(this.field632, -114, this.field682)) {
            this.field641 = new class494(class112.method1008((byte) -52, this.field632, this.field682));
        }
        if (arg3 || class617.method3535(70, this.field632, this.field682)) {
            this.field653 = new class494(class357.method2289((byte) 21, this.field682, this.field632));
        }
        if (arg3 || class420.method2546((byte) 40, this.field632, this.field682)) {
            this.field702 = new class494(class25.method487(false, this.field682, this.field632));
        }
        if (arg3 || class103.method958(this.field682, this.field632, 55)) {
            this.field698 = new class419(class292.method1950(this.field682, 7492, this.field632));
        }
    }

    static {
        double var0 = 3.834951969714103E-4D;
        for (int var2 = 0; var2 < 16384; var2++) {
            field660[var2] = (float) Math.sin((double) var2 * var0);
            field718[var2] = (float) Math.cos((double) var2 * var0);
        }
    }
}
