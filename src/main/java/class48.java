import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dm")
public class class48 extends class55 {

    @OriginalMember(owner = "client!dm", name = "Ec", descriptor = "[I")
    private int[] field851;

    @OriginalMember(owner = "client!dm", name = "H", descriptor = "I")
    private int field750;

    @OriginalMember(owner = "client!dm", name = "J", descriptor = "I")
    private int field752;

    @OriginalMember(owner = "client!dm", name = "qb", descriptor = "I")
    private int field785;

    @OriginalMember(owner = "client!dm", name = "Mb", descriptor = "I")
    private int field807;

    @OriginalMember(owner = "client!dm", name = "Hb", descriptor = "[I")
    private int[] field802;

    @OriginalMember(owner = "client!dm", name = "I", descriptor = "[I")
    private int[] field751;

    @OriginalMember(owner = "client!dm", name = "Kb", descriptor = "[I")
    private int[] field805;

    @OriginalMember(owner = "client!dm", name = "E", descriptor = "[S")
    private short[] field747;

    @OriginalMember(owner = "client!dm", name = "lb", descriptor = "I")
    private int field780;

    @OriginalMember(owner = "client!dm", name = "Jc", descriptor = "[Llea;")
    private class568[] field856;

    @OriginalMember(owner = "client!dm", name = "q", descriptor = "[Lin;")
    private class77[] field733;

    @OriginalMember(owner = "client!dm", name = "B", descriptor = "I")
    private int field744;

    @OriginalMember(owner = "client!dm", name = "nc", descriptor = "[Lsr;")
    private class226[] field834;

    @OriginalMember(owner = "client!dm", name = "y", descriptor = "[Lnc;")
    private class23[] field741;

    @OriginalMember(owner = "client!dm", name = "Ob", descriptor = "[S")
    private short[] field809;

    @OriginalMember(owner = "client!dm", name = "Xb", descriptor = "[S")
    private short[] field818;

    @OriginalMember(owner = "client!dm", name = "w", descriptor = "[S")
    private short[] field739;

    @OriginalMember(owner = "client!dm", name = "zb", descriptor = "[F")
    private float[] field794;

    @OriginalMember(owner = "client!dm", name = "gc", descriptor = "[S")
    private short[] field827;

    @OriginalMember(owner = "client!dm", name = "cb", descriptor = "[S")
    private short[] field771;

    @OriginalMember(owner = "client!dm", name = "Gc", descriptor = "[S")
    private short[] field853;

    @OriginalMember(owner = "client!dm", name = "U", descriptor = "[S")
    private short[] field763;

    @OriginalMember(owner = "client!dm", name = "pc", descriptor = "S")
    private short field836;

    @OriginalMember(owner = "client!dm", name = "ab", descriptor = "[S")
    private short[] field769;

    @OriginalMember(owner = "client!dm", name = "Yb", descriptor = "[B")
    private byte[] field819;

    @OriginalMember(owner = "client!dm", name = "dc", descriptor = "[S")
    private short[] field824;

    @OriginalMember(owner = "client!dm", name = "Tb", descriptor = "[B")
    private byte[] field814;

    @OriginalMember(owner = "client!dm", name = "hb", descriptor = "[S")
    private short[] field776;

    @OriginalMember(owner = "client!dm", name = "G", descriptor = "[S")
    private short[] field749;

    @OriginalMember(owner = "client!dm", name = "F", descriptor = "S")
    private short field748;

    @OriginalMember(owner = "client!dm", name = "jc", descriptor = "[F")
    private float[] field830;

    @OriginalMember(owner = "client!dm", name = "u", descriptor = "[S")
    private short[] field737;

    @OriginalMember(owner = "client!dm", name = "vc", descriptor = "[I")
    private int[] field842;

    @OriginalMember(owner = "client!dm", name = "Ic", descriptor = "[I")
    private int[] field855;

    @OriginalMember(owner = "client!dm", name = "ob", descriptor = "[I")
    private int[] field783;

    @OriginalMember(owner = "client!dm", name = "Jb", descriptor = "I")
    private int field804;

    @OriginalMember(owner = "client!dm", name = "wb", descriptor = "I")
    private int field791;

    @OriginalMember(owner = "client!dm", name = "ac", descriptor = "[[I")
    private int[][] field821;

    @OriginalMember(owner = "client!dm", name = "x", descriptor = "[[I")
    private int[][] field740;

    @OriginalMember(owner = "client!dm", name = "ic", descriptor = "[[I")
    private int[][] field829;

    @OriginalMember(owner = "client!dm", name = "Gb", descriptor = "Z")
    private boolean field801;

    @OriginalMember(owner = "client!dm", name = "kc", descriptor = "Z")
    private boolean field831;

    @OriginalMember(owner = "client!dm", name = "qc", descriptor = "Z")
    private boolean field837;

    @OriginalMember(owner = "client!dm", name = "Dc", descriptor = "Z")
    private boolean field850;

    @OriginalMember(owner = "client!dm", name = "K", descriptor = "Lhea;")
    private class387 field753;

    @OriginalMember(owner = "client!dm", name = "D", descriptor = "Lgk;")
    private class438 field746;

    @OriginalMember(owner = "client!dm", name = "xb", descriptor = "Lgk;")
    private class438 field792;

    @OriginalMember(owner = "client!dm", name = "tc", descriptor = "Lgk;")
    private class438 field840;

    @OriginalMember(owner = "client!dm", name = "fc", descriptor = "Lgk;")
    private class438 field826;

    @OriginalMember(owner = "client!dm", name = "kb", descriptor = "Lk;")
    private class524 field779;

    @OriginalMember(owner = "client!dm", name = "Wb", descriptor = "I")
    public static int field817 = 0;

    @OriginalMember(owner = "client!dm", name = "sc", descriptor = "Z")
    public static boolean field839 = false;

    @OriginalMember(owner = "client!dm", name = "r", descriptor = "I")
    public static int field734;

    @OriginalMember(owner = "client!dm", name = "s", descriptor = "I")
    public static int field735;

    @OriginalMember(owner = "client!dm", name = "t", descriptor = "I")
    public static int field736;

    @OriginalMember(owner = "client!dm", name = "v", descriptor = "I")
    public static int field738;

    @OriginalMember(owner = "client!dm", name = "z", descriptor = "I")
    private int field742;

    @OriginalMember(owner = "client!dm", name = "A", descriptor = "I")
    public static int field743;

    @OriginalMember(owner = "client!dm", name = "C", descriptor = "I")
    public static int field745;

    @OriginalMember(owner = "client!dm", name = "L", descriptor = "I")
    public static int field754;

    @OriginalMember(owner = "client!dm", name = "M", descriptor = "I")
    private int field755;

    @OriginalMember(owner = "client!dm", name = "N", descriptor = "I")
    public static int field756;

    @OriginalMember(owner = "client!dm", name = "O", descriptor = "I")
    private int field757;

    @OriginalMember(owner = "client!dm", name = "P", descriptor = "I")
    public static int field758;

    @OriginalMember(owner = "client!dm", name = "Q", descriptor = "I")
    public static int field759;

    @OriginalMember(owner = "client!dm", name = "R", descriptor = "I")
    public static int field760;

    @OriginalMember(owner = "client!dm", name = "S", descriptor = "I")
    public static int field761;

    @OriginalMember(owner = "client!dm", name = "T", descriptor = "I")
    public static int field762;

    @OriginalMember(owner = "client!dm", name = "V", descriptor = "I")
    public static int field764;

    @OriginalMember(owner = "client!dm", name = "W", descriptor = "I")
    public static int field765;

    @OriginalMember(owner = "client!dm", name = "X", descriptor = "I")
    public static int field766;

    @OriginalMember(owner = "client!dm", name = "Y", descriptor = "I")
    public static int field767;

    @OriginalMember(owner = "client!dm", name = "Z", descriptor = "I")
    public static int field768;

    @OriginalMember(owner = "client!dm", name = "bb", descriptor = "I")
    public static int field770;

    @OriginalMember(owner = "client!dm", name = "db", descriptor = "I")
    public static int field772;

    @OriginalMember(owner = "client!dm", name = "eb", descriptor = "I")
    public static int field773;

    @OriginalMember(owner = "client!dm", name = "fb", descriptor = "I")
    public static int field774;

    @OriginalMember(owner = "client!dm", name = "gb", descriptor = "I")
    public static int field775;

    @OriginalMember(owner = "client!dm", name = "ib", descriptor = "I")
    private int field777;

    @OriginalMember(owner = "client!dm", name = "jb", descriptor = "I")
    public static int field778;

    @OriginalMember(owner = "client!dm", name = "nb", descriptor = "I")
    public static int field782;

    @OriginalMember(owner = "client!dm", name = "pb", descriptor = "I")
    public static int field784;

    @OriginalMember(owner = "client!dm", name = "rb", descriptor = "I")
    public static int field786;

    @OriginalMember(owner = "client!dm", name = "sb", descriptor = "I")
    public static int field787;

    @OriginalMember(owner = "client!dm", name = "tb", descriptor = "I")
    public static int field788;

    @OriginalMember(owner = "client!dm", name = "ub", descriptor = "I")
    public static int field789;

    @OriginalMember(owner = "client!dm", name = "vb", descriptor = "I")
    private int field790;

    @OriginalMember(owner = "client!dm", name = "yb", descriptor = "I")
    public static int field793;

    @OriginalMember(owner = "client!dm", name = "Ab", descriptor = "I")
    public static int field795;

    @OriginalMember(owner = "client!dm", name = "Bb", descriptor = "I")
    public static int field796;

    @OriginalMember(owner = "client!dm", name = "Cb", descriptor = "I")
    public static int field797;

    @OriginalMember(owner = "client!dm", name = "Db", descriptor = "I")
    public static int field798;

    @OriginalMember(owner = "client!dm", name = "Eb", descriptor = "I")
    public static int field799;

    @OriginalMember(owner = "client!dm", name = "Fb", descriptor = "I")
    public static int field800;

    @OriginalMember(owner = "client!dm", name = "Ib", descriptor = "I")
    public static int field803;

    @OriginalMember(owner = "client!dm", name = "Lb", descriptor = "I")
    public static int field806;

    @OriginalMember(owner = "client!dm", name = "Nb", descriptor = "I")
    public static int field808;

    @OriginalMember(owner = "client!dm", name = "Pb", descriptor = "I")
    public static int field810;

    @OriginalMember(owner = "client!dm", name = "Qb", descriptor = "I")
    public static int field811;

    @OriginalMember(owner = "client!dm", name = "Rb", descriptor = "I")
    public static int field812;

    @OriginalMember(owner = "client!dm", name = "Sb", descriptor = "I")
    public static int field813;

    @OriginalMember(owner = "client!dm", name = "Ub", descriptor = "I")
    public static int field815;

    @OriginalMember(owner = "client!dm", name = "Vb", descriptor = "I")
    public static int field816;

    @OriginalMember(owner = "client!dm", name = "Zb", descriptor = "I")
    public static int field820;

    @OriginalMember(owner = "client!dm", name = "bc", descriptor = "I")
    public static int field822;

    @OriginalMember(owner = "client!dm", name = "cc", descriptor = "I")
    public static int field823;

    @OriginalMember(owner = "client!dm", name = "ec", descriptor = "I")
    public static int field825;

    @OriginalMember(owner = "client!dm", name = "hc", descriptor = "I")
    public static int field828;

    @OriginalMember(owner = "client!dm", name = "lc", descriptor = "I")
    public static int field832;

    @OriginalMember(owner = "client!dm", name = "mc", descriptor = "I")
    public static int field833;

    @OriginalMember(owner = "client!dm", name = "oc", descriptor = "I")
    public static int field835;

    @OriginalMember(owner = "client!dm", name = "rc", descriptor = "I")
    private int field838;

    @OriginalMember(owner = "client!dm", name = "uc", descriptor = "I")
    public static int field841;

    @OriginalMember(owner = "client!dm", name = "wc", descriptor = "I")
    public static int field843;

    @OriginalMember(owner = "client!dm", name = "xc", descriptor = "I")
    private int field844;

    @OriginalMember(owner = "client!dm", name = "yc", descriptor = "I")
    public static int field845;

    @OriginalMember(owner = "client!dm", name = "zc", descriptor = "I")
    public static int field846;

    @OriginalMember(owner = "client!dm", name = "Ac", descriptor = "I")
    public static int field847;

    @OriginalMember(owner = "client!dm", name = "Bc", descriptor = "I")
    public static int field848;

    @OriginalMember(owner = "client!dm", name = "Cc", descriptor = "I")
    public static int field849;

    @OriginalMember(owner = "client!dm", name = "Fc", descriptor = "I")
    private int field852;

    @OriginalMember(owner = "client!dm", name = "Hc", descriptor = "I")
    public static int field854;

    @OriginalMember(owner = "client!dm", name = "mb", descriptor = "Llc;")
    private class599 field781;

    @OriginalMember(owner = "client!dm", name = "b", descriptor = "()[Lin;")
    public final class77[] method487() {
        field795++;
        return this.field733;
    }

    @OriginalMember(owner = "client!dm", name = "J", descriptor = "()I")
    public final int method488() {
        field825++;
        if (!this.field837) {
            this.method520(-1);
        }
        return this.field790;
    }

    @OriginalMember(owner = "client!dm", name = "b", descriptor = "(B)Z")
    private final boolean method489(byte arg0) {
        field758++;
        if (this.field779.field7399) {
            return true;
        }
        if (this.field779.field7400 == null) {
            this.field779.field7400 = this.field753.method1863((byte) 103, this.field850);
        }
        class241 var2 = this.field779.field7400;
        if (arg0 >= -4) {
            method493((byte) -122, 97, 99);
        }
        var2.method1(19, this.field752 * 6);
        Buffer var3 = var2.method5(true, 114);
        if (var3 != null) {
            Stream var4 = this.field753.method2381(0, var3);
            if (Stream.method3483()) {
                for (int var6 = 0; var6 < this.field752; var6++) {
                    var4.method3475(this.field818[var6]);
                    var4.method3475(this.field771[var6]);
                    var4.method3475(this.field824[var6]);
                }
            } else {
                for (int var5 = 0; var5 < this.field752; var5++) {
                    var4.method3472(this.field818[var5]);
                    var4.method3472(this.field771[var5]);
                    var4.method3472(this.field824[var5]);
                }
            }
            var4.method3471();
            if (var2.method2(109)) {
                this.field779.field7399 = true;
                this.field831 = true;
                this.field779.field7401 = var2;
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(I)V")
    public final void method490(int arg0) {
        field784++;
        if (this.field746 != null) {
            this.field746.method2603(false);
        }
        if (this.field792 != null) {
            this.field792.method2603(false);
        }
        if (this.field840 != null) {
            this.field840.method2603(false);
        }
        if (this.field826 != null) {
            this.field826.method2603(false);
        }
        if (this.field779 != null) {
            this.field779.method3014(true);
        }
        if (arg0 != 0) {
            method491(24, -64, 8);
        }
    }

    @OriginalMember(owner = "client!dm", name = "b", descriptor = "(III)Lfv;")
    public static final class106 method491(int arg0, int arg1, int arg2) {
        class40 var3 = class153.field2210[arg0][arg1][arg2];
        return var3 == null ? null : var3.field671;
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(IILq;ZI)Z")
    public final boolean method492(int arg0, int arg1, class391 arg2, boolean arg3, int arg4) {
        field786++;
        return this.method498(arg1, arg0, arg2, (byte) 127, arg3, arg4);
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(BII)V")
    public static final void method493(byte arg0, int arg1, int arg2) {
        if (class683.field9630 == 1) {
            class224.method1481(class75.field1309, arg2, arg1, false);
        } else if (class683.field9630 == 2) {
            class622.method3458((byte) -110, arg1, arg2);
        }
        field806++;
        class683.field9630 = 0;
        class75.field1309 = null;
        if (arg0 != -120) {
            method491(98, 98, -54);
        }
    }

    @OriginalMember(owner = "client!dm", name = "W", descriptor = "(I)V")
    public final void method494(int arg0) {
        field787++;
        int var2 = class189.field2719[arg0];
        int var3 = class189.field2721[arg0];
        for (int var4 = 0; var4 < this.field780; var4++) {
            int var5 = this.field802[var4] * var2 + (this.field751[var4] * var3) >> 14;
            this.field802[var4] = this.field802[var4] * var3 - (this.field751[var4] * var2) >> 14;
            this.field751[var4] = var5;
        }
        this.method543(true);
        this.field837 = false;
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(Lq;Lkd;II)V")
    public final void method495(class391 arg0, class253 arg1, int arg2, int arg3) {
        field797++;
        if (this.field804 == 0) {
            return;
        }
        class21 var5 = this.field753.field5630;
        if (!this.field837) {
            this.method520(-1);
        }
        class21 var6 = (class21) arg0;
        class247.field3829 = var5.field272 * var6.field243 + var5.field246 * var6.field247 + var5.field243 * var6.field291;
        class491.field6984 = var5.field272 * var6.field257 + var5.field246 * var6.field245 + var5.field243 * var6.field293 + var5.field257;
        float var7 = (float) this.field790 * class247.field3829 + class491.field6984;
        float var8 = (float) this.field838 * class247.field3829 + class491.field6984;
        float var9;
        float var10;
        if ((var7 > var8)) {
            var10 = (float) this.field852 + var7;
            var9 = var8 - (float) this.field852;
        } else {
            var9 = var7 - (float) this.field852;
            var10 = (float) this.field852 + var8;
        }
        if ((this.field753.field5727 <= var9) || ((float) this.field753.field5724 >= var10)) {
            return;
        }
        class647.field9093 = var5.field256 * var6.field257 + var5.field259 * var6.field245 + var5.field247 * var6.field293 + var5.field245;
        class57.field1100 = var5.field256 * var6.field243 + var5.field259 * var6.field247 + var5.field247 * var6.field291;
        float var11 = (float) this.field790 * class57.field1100 + class647.field9093;
        float var12 = (float) this.field838 * class57.field1100 + class647.field9093;
        float var13;
        float var14;
        if ((var12 < var11)) {
            var14 = ((float) this.field852 + var11) * (float) this.field753.field5638;
            var13 = ((float) (-this.field852) + var12) * (float) this.field753.field5638;
        } else {
            var13 = (var11 - (float) this.field852) * (float) this.field753.field5638;
            var14 = ((float) this.field852 + var12) * (float) this.field753.field5638;
        }
        if ((this.field753.field5645 <= var13 / (float) arg2) || (var14 / (float) arg2 <= this.field753.field5640)) {
            return;
        }
        class481.field6820 = var5.field289 * var6.field243 + var5.field291 * var6.field291 + var5.field271 * var6.field247;
        class640.field9038 = var5.field289 * var6.field257 + var5.field291 * var6.field293 + var5.field271 * var6.field245 + var5.field293;
        float var15 = (float) this.field790 * class481.field6820 + class640.field9038;
        float var16 = (float) this.field838 * class481.field6820 + class640.field9038;
        float var17;
        float var18;
        if ((var16 < var15)) {
            var18 = ((float) this.field852 + var15) * (float) this.field753.field5734;
            var17 = ((float) (-this.field852) + var16) * (float) this.field753.field5734;
        } else {
            var17 = (var15 - (float) this.field852) * (float) this.field753.field5734;
            var18 = ((float) this.field852 + var16) * (float) this.field753.field5734;
        }
        if ((var17 / (float) arg2 >= this.field753.field5683) || (var18 / (float) arg2 <= this.field753.field5714)) {
            return;
        }
        if (arg1 != null || this.field741 != null) {
            class363.field5186 = var5.field289 * var6.field272 + var5.field291 * var6.field289 + var5.field271 * var6.field256;
            class615.field8583 = var5.field289 * var6.field246 + var5.field291 * var6.field271 + var5.field271 * var6.field259;
            class586.field8210 = var5.field256 * var6.field246 + var5.field259 * var6.field259 + var5.field247 * var6.field271;
            class408.field5963 = var5.field272 * var6.field246 + var5.field246 * var6.field259 + var5.field243 * var6.field271;
            class315.field4668 = var5.field256 * var6.field272 + var5.field259 * var6.field256 + var5.field247 * var6.field289;
            class140.field2072 = var5.field272 * var6.field272 + var5.field246 * var6.field256 + var5.field243 * var6.field289;
        }
        if (arg1 != null) {
            int var19 = this.field757 + this.field742 >> 1;
            int var20 = this.field844 + this.field755 >> 1;
            int var21 = (int) ((float) var20 * class315.field4668 + (float) this.field790 * class57.field1100 + (float) var19 * class586.field8210 + class647.field9093);
            int var22 = (int) ((float) var20 * class363.field5186 + (float) this.field790 * class481.field6820 + (float) var19 * class615.field8583 + class640.field9038);
            int var23 = (int) ((float) var20 * class140.field2072 + (float) this.field790 * class247.field3829 + (float) var19 * class408.field5963 + class491.field6984);
            int var24 = (int) ((float) var20 * class315.field4668 + (float) this.field838 * class57.field1100 + (float) var19 * class586.field8210 + class647.field9093);
            int var25 = (int) ((float) var20 * class363.field5186 + (float) this.field838 * class481.field6820 + (float) var19 * class615.field8583 + class640.field9038);
            arg1.field3893 = this.field753.field5734 * var22 / arg2 + this.field753.field5686;
            arg1.field3895 = this.field753.field5734 * var25 / arg2 + this.field753.field5686;
            arg1.field3897 = this.field753.field5638 * var24 / arg2 + this.field753.field5684;
            int var26 = (int) ((float) var20 * class140.field2072 + (float) this.field838 * class247.field3829 + (float) var19 * class408.field5963 + class491.field6984);
            arg1.field3894 = this.field753.field5638 * var21 / arg2 + this.field753.field5684;
            if (this.field753.field5724 <= var23 || this.field753.field5724 <= var26) {
                arg1.field3896 = true;
                arg1.field3892 = (this.field852 + var21) * this.field753.field5638 / arg2 + this.field753.field5684 - arg1.field3894;
            }
        }
        this.field753.method2334((float) arg2, 118);
        this.field753.method2310((byte) -105);
        this.field753.method2371(var6, true);
        this.method515(-1);
        this.method537((byte) 124);
    }

    @OriginalMember(owner = "client!dm", name = "ga", descriptor = "(I)V")
    public final void method496(int arg0) {
        field762++;
        this.field748 = (short) arg0;
        this.method543(true);
        this.method521(55);
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(IIII)V")
    public final void method497(int arg0, int arg1, int arg2, int arg3) {
        field772++;
        for (int var5 = 0; var5 < this.field750; var5++) {
            int var9 = this.field763[var5] & 0xFFFF;
            int var10 = (var9 & 0xFF52) >> 10;
            int var11 = var9 >> 7 & 0x7;
            if (arg1 != -1) {
                var11 += (arg1 - var11) * arg3 >> 7;
            }
            int var12 = var9 & 0x7F;
            if (arg0 != -1) {
                var10 -= -((arg0 - var10) * arg3 >> 7);
            }
            if (arg2 != -1) {
                var12 += (arg2 - var12) * arg3 >> 7;
            }
            this.field763[var5] = (short) class486.method2826(var12, class486.method2826(var10 << 10, var11 << 7));
        }
        if (this.field741 != null) {
            for (int var6 = 0; var6 < this.field744; var6++) {
                class23 var7 = this.field741[var6];
                class226 var8 = this.field834[var6];
                var8.field3170 = var8.field3170 & 0xFF000000 | class437.field6386[this.field763[var7.field305] & 0xFFFF] & 0xFFFFFF;
            }
        }
        this.method526(-7);
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(IILq;BZI)Z")
    private final boolean method498(int arg0, int arg1, class391 arg2, byte arg3, boolean arg4, int arg5) {
        field743++;
        class21 var7 = (class21) arg2;
        class21 var8 = this.field753.field5630;
        float var9 = var7.field257 * var8.field256 + var7.field293 * var8.field247 + var7.field245 * var8.field259 + var8.field245;
        float var10 = var7.field257 * var8.field289 + var7.field293 * var8.field291 + var7.field245 * var8.field271 + var8.field293;
        class586.field8210 = var7.field246 * var8.field256 + var7.field271 * var8.field247 + var7.field259 * var8.field259;
        class363.field5186 = var7.field272 * var8.field289 + var7.field289 * var8.field291 + var7.field256 * var8.field271;
        class315.field4668 = var7.field272 * var8.field256 + var7.field289 * var8.field247 + var7.field256 * var8.field259;
        class57.field1100 = var7.field243 * var8.field256 + var7.field291 * var8.field247 + var7.field247 * var8.field259;
        class140.field2072 = var7.field272 * var8.field272 + var7.field289 * var8.field243 + var7.field256 * var8.field246;
        class615.field8583 = var7.field246 * var8.field289 + var7.field271 * var8.field291 + var7.field259 * var8.field271;
        class481.field6820 = var7.field243 * var8.field289 + var7.field291 * var8.field291 + var7.field247 * var8.field271;
        class247.field3829 = var7.field243 * var8.field272 + var7.field291 * var8.field243 + var7.field247 * var8.field246;
        class408.field5963 = var7.field246 * var8.field272 + var7.field271 * var8.field243 + var7.field259 * var8.field246;
        float var11 = var7.field257 * var8.field272 + var7.field293 * var8.field243 + var7.field245 * var8.field246 + var8.field257;
        boolean var12 = false;
        float var13 = Float.MAX_VALUE;
        float var14 = -3.4028235E38F;
        float var15 = Float.MAX_VALUE;
        float var16 = -3.4028235E38F;
        int var17 = this.field753.field5638;
        int var18 = this.field753.field5734;
        if (!this.field837) {
            this.method520(-1);
        }
        class217.field3041[0] = this.field757;
        class502.field7112[0] = this.field790;
        class217.field3041[1] = this.field742;
        class566.field7974[0] = this.field755;
        class502.field7112[1] = this.field790;
        class566.field7974[1] = this.field755;
        class217.field3041[2] = this.field757;
        class502.field7112[2] = this.field838;
        class217.field3041[3] = this.field742;
        class566.field7974[2] = this.field755;
        class502.field7112[3] = this.field838;
        class217.field3041[4] = this.field757;
        class566.field7974[3] = this.field755;
        int var19 = 35 % ((arg3 - 91) / 35);
        class502.field7112[4] = this.field790;
        class217.field3041[5] = this.field742;
        class566.field7974[4] = this.field844;
        class502.field7112[5] = this.field790;
        class566.field7974[5] = this.field844;
        class217.field3041[6] = this.field757;
        class502.field7112[6] = this.field838;
        class217.field3041[7] = this.field742;
        class566.field7974[6] = this.field844;
        class502.field7112[7] = this.field838;
        class566.field7974[7] = this.field844;
        for (int var20 = 0; var20 < 8; var20++) {
            float var39 = (float) class217.field3041[var20];
            float var40 = (float) class566.field7974[var20];
            float var41 = (float) class502.field7112[var20];
            float var42 = class363.field5186 * var40 + class615.field8583 * var39 + class481.field6820 * var41 + var10;
            float var43 = class315.field4668 * var40 + class586.field8210 * var39 + class57.field1100 * var41 + var9;
            float var44 = class140.field2072 * var40 + class408.field5963 * var39 + class247.field3829 * var41 + var11;
            if ((float) this.field753.field5724 <= var44) {
                if (arg5 > 0) {
                    var44 = arg5;
                }
                float var45 = (float) var17 * var43 / var44 + (float) this.field753.field5684;
                if (var45 < var13) {
                    var13 = var45;
                }
                float var46 = (float) var18 * var42 / var44 + (float) this.field753.field5686;
                if (var14 < var45) {
                    var14 = var45;
                }
                if (var46 < var15) {
                    var15 = var46;
                }
                if (var46 > var16) {
                    var16 = var46;
                }
                var12 = true;
            }
        }
        if (var12 && (float) arg1 > var13 && (float) arg1 < var14 && var15 < (float) arg0 && (float) arg0 < var16) {
            if (arg4) {
                return true;
            }
            if (this.field804 > class290.field4301.length) {
                class290.field4301 = new int[this.field804];
                class377.field5369 = new int[this.field804];
            }
            for (int var21 = 0; var21 < this.field780; var21++) {
                float var23 = (float) this.field805[var21];
                float var24 = (float) this.field802[var21];
                float var25 = (float) this.field751[var21];
                float var26 = class315.field4668 * var23 + class586.field8210 * var25 + class57.field1100 * var24 + var9;
                float var27 = class363.field5186 * var23 + class615.field8583 * var25 + class481.field6820 * var24 + var10;
                float var28 = class140.field2072 * var23 + class408.field5963 * var25 + class247.field3829 * var24 + var11;
                if (var28 >= (float) this.field753.field5724) {
                    if (arg5 > 0) {
                        var28 = arg5;
                    }
                    int var29 = (int) ((float) var17 * var26 / var28 + (float) this.field753.field5684);
                    int var30 = (int) ((float) var18 * var27 / var28 + (float) this.field753.field5686);
                    int var31 = this.field851[var21];
                    int var32 = this.field851[var21 + 1];
                    for (int var33 = var31; var33 < var32; var33++) {
                        int var34 = this.field827[var33] - 1;
                        if (var34 == -1) {
                            break;
                        }
                        class290.field4301[var34] = var29;
                        class377.field5369[var34] = var30;
                    }
                } else {
                    int var35 = this.field851[var21];
                    int var36 = this.field851[var21 + 1];
                    for (int var37 = var35; var37 < var36; var37++) {
                        int var38 = this.field827[var37] - 1;
                        if (var38 == -1) {
                            break;
                        }
                        class290.field4301[this.field827[var37] - 1] = -999999;
                    }
                }
            }
            for (int var22 = 0; var22 < this.field750; var22++) {
                if (class290.field4301[this.field818[var22]] != -999999 && class290.field4301[this.field771[var22]] != -999999 && class290.field4301[this.field824[var22]] != -999999 && this.method541(class290.field4301[this.field771[var22]], class290.field4301[this.field818[var22]], class377.field5369[this.field771[var22]], arg0, class290.field4301[this.field824[var22]], class377.field5369[this.field818[var22]], false, class377.field5369[this.field824[var22]], arg1)) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!dm", name = "R", descriptor = "(III)V")
    public final void method499(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field780; var4++) {
            if (arg0 != 128) {
                this.field751[var4] = this.field751[var4] * arg0 >> 7;
            }
            if (arg1 != 128) {
                this.field802[var4] = this.field802[var4] * arg1 >> 7;
            }
            if (arg2 != 128) {
                this.field805[var4] = this.field805[var4] * arg2 >> 7;
            }
        }
        field766++;
        this.method543(true);
        this.field837 = false;
    }

    @OriginalMember(owner = "client!dm", name = "d", descriptor = "(SS)V")
    public final void method500(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field750; var3++) {
            if (this.field763[var3] == arg0) {
                this.field763[var3] = arg1;
            }
        }
        field770++;
        if (this.field741 != null) {
            for (int var4 = 0; var4 < this.field744; var4++) {
                class23 var5 = this.field741[var4];
                class226 var6 = this.field834[var4];
                var6.field3170 = class437.field6386[this.field763[var5.field305] & 0xFFFF] & 0xFFFFFF | var6.field3170 & 0xFF000000;
            }
        }
        this.method526(-7);
    }

    @OriginalMember(owner = "client!dm", name = "c", descriptor = "()[Llea;")
    public final class568[] method501() {
        field774++;
        return this.field856;
    }

    @OriginalMember(owner = "client!dm", name = "FA", descriptor = "()V")
    public final void method502() {
        for (int var1 = 0; var1 < this.field780; var1++) {
            this.field805[var1] = -this.field805[var1];
        }
        field745++;
        for (int var2 = 0; var2 < this.field804; var2++) {
            this.field809[var2] = (short) (-this.field809[var2]);
        }
        for (int var3 = 0; var3 < this.field750; var3++) {
            short var4 = this.field818[var3];
            this.field818[var3] = this.field824[var3];
            this.field824[var3] = var4;
        }
        this.method543(true);
        this.method521(55);
        this.method508(-121);
        this.field837 = false;
    }

    @OriginalMember(owner = "client!dm", name = "TA", descriptor = "()I")
    public final int method503() {
        field736++;
        return this.field836;
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(I[IIIIIZ)V")
    public final void method504(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        field754++;
        int var8 = arg1.length;
        if (arg0 == 0) {
            int var9 = arg2 << 4;
            int var10 = arg3 << 4;
            int var11 = arg4 << 4;
            int var12 = 0;
            class674.field9528 = 0;
            class553.field7843 = 0;
            class256.field3924 = 0;
            for (int var13 = 0; var13 < var8; var13++) {
                int var14 = arg1[var13];
                if (var14 < this.field821.length) {
                    int[] var15 = this.field821[var14];
                    for (int var16 = 0; var16 < var15.length; var16++) {
                        int var17 = var15[var16];
                        class674.field9528 += this.field751[var17];
                        class553.field7843 += this.field802[var17];
                        var12++;
                        class256.field3924 += this.field805[var17];
                    }
                }
            }
            if (var12 > 0) {
                class674.field9528 = class674.field9528 / var12 + var9;
                class256.field3924 = class256.field3924 / var12 + var11;
                class553.field7843 = class553.field7843 / var12 + var10;
            } else {
                class256.field3924 = var11;
                class674.field9528 = var9;
                class553.field7843 = var10;
            }
        } else if (arg0 == 1) {
            int var18 = arg4 << 4;
            int var19 = arg2 << 4;
            int var20 = arg3 << 4;
            for (int var21 = 0; var21 < var8; var21++) {
                int var22 = arg1[var21];
                if (var22 < this.field821.length) {
                    int[] var23 = this.field821[var22];
                    for (int var24 = 0; var24 < var23.length; var24++) {
                        int var25 = var23[var24];
                        this.field751[var25] += var19;
                        this.field802[var25] += var20;
                        this.field805[var25] += var18;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var26 = 0; var26 < var8; var26++) {
                int var45 = arg1[var26];
                if (this.field821.length > var45) {
                    int[] var46 = this.field821[var45];
                    if ((arg5 & 0x1) == 0) {
                        for (int var58 = 0; var58 < var46.length; var58++) {
                            int var59 = var46[var58];
                            this.field751[var59] -= class674.field9528;
                            this.field802[var59] -= class553.field7843;
                            this.field805[var59] -= class256.field3924;
                            if (arg4 != 0) {
                                int var60 = class189.field2719[arg4];
                                int var61 = class189.field2721[arg4];
                                int var62 = this.field751[var59] * var61 + (this.field802[var59] * var60 + 16383) >> 14;
                                this.field802[var59] = this.field802[var59] * var61 + 16383 - (this.field751[var59] * var60) >> 14;
                                this.field751[var59] = var62;
                            }
                            if (arg2 != 0) {
                                int var63 = class189.field2719[arg2];
                                int var64 = class189.field2721[arg2];
                                int var65 = this.field802[var59] * var64 + 16383 - (this.field805[var59] * var63) >> 14;
                                this.field805[var59] = this.field802[var59] * var63 + (this.field805[var59] * var64) + 16383 >> 14;
                                this.field802[var59] = var65;
                            }
                            if (arg3 != 0) {
                                int var66 = class189.field2719[arg3];
                                int var67 = class189.field2721[arg3];
                                int var68 = this.field805[var59] * var66 + this.field751[var59] * var67 + 16383 >> 14;
                                this.field805[var59] = this.field805[var59] * var67 + 16383 - this.field751[var59] * var66 >> 14;
                                this.field751[var59] = var68;
                            }
                            this.field751[var59] += class674.field9528;
                            this.field802[var59] += class553.field7843;
                            this.field805[var59] += class256.field3924;
                        }
                    } else {
                        for (int var47 = 0; var47 < var46.length; var47++) {
                            int var48 = var46[var47];
                            this.field751[var48] -= class674.field9528;
                            this.field802[var48] -= class553.field7843;
                            this.field805[var48] -= class256.field3924;
                            if (arg2 != 0) {
                                int var49 = class189.field2719[arg2];
                                int var50 = class189.field2721[arg2];
                                int var51 = this.field802[var48] * var50 + 16383 - this.field805[var48] * var49 >> 14;
                                this.field805[var48] = this.field802[var48] * var49 + this.field805[var48] * var50 + 16383 >> 14;
                                this.field802[var48] = var51;
                            }
                            if (arg4 != 0) {
                                int var52 = class189.field2719[arg4];
                                int var53 = class189.field2721[arg4];
                                int var54 = this.field802[var48] * var52 + this.field751[var48] * var53 + 16383 >> 14;
                                this.field802[var48] = this.field802[var48] * var53 + 16383 - (this.field751[var48] * var52) >> 14;
                                this.field751[var48] = var54;
                            }
                            if (arg3 != 0) {
                                int var55 = class189.field2719[arg3];
                                int var56 = class189.field2721[arg3];
                                int var57 = this.field805[var48] * var55 + (this.field751[var48] * var56) + 16383 >> 14;
                                this.field805[var48] = this.field805[var48] * var56 + 16383 - this.field751[var48] * var55 >> 14;
                                this.field751[var48] = var57;
                            }
                            this.field751[var48] += class674.field9528;
                            this.field802[var48] += class553.field7843;
                            this.field805[var48] += class256.field3924;
                        }
                    }
                }
            }
            if (arg6) {
                for (int var27 = 0; var27 < var8; var27++) {
                    int var28 = arg1[var27];
                    if (var28 < this.field821.length) {
                        int[] var29 = this.field821[var28];
                        for (int var30 = 0; var30 < var29.length; var30++) {
                            int var31 = var29[var30];
                            int var32 = this.field851[var31];
                            int var33 = this.field851[var31 + 1];
                            for (int var34 = var32; var34 < var33; var34++) {
                                int var35 = this.field827[var34] - 1;
                                if (var35 == -1) {
                                    break;
                                }
                                if (arg4 != 0) {
                                    int var36 = class189.field2719[arg4];
                                    int var37 = class189.field2721[arg4];
                                    int var38 = this.field776[var35] * var36 + this.field749[var35] * var37 + 16383 >> 14;
                                    this.field776[var35] = (short) (this.field776[var35] * var37 + 16383 - (this.field749[var35] * var36) >> 14);
                                    this.field749[var35] = (short) var38;
                                }
                                if (arg2 != 0) {
                                    int var39 = class189.field2719[arg2];
                                    int var40 = class189.field2721[arg2];
                                    int var41 = this.field776[var35] * var40 + 16383 - (this.field809[var35] * var39) >> 14;
                                    this.field809[var35] = (short) (this.field809[var35] * var40 + this.field776[var35] * var39 + 16383 >> 14);
                                    this.field776[var35] = (short) var41;
                                }
                                if (arg3 != 0) {
                                    int var42 = class189.field2719[arg3];
                                    int var43 = class189.field2721[arg3];
                                    int var44 = this.field809[var35] * var42 + (this.field749[var35] * var43) + 16383 >> 14;
                                    this.field809[var35] = (short) (this.field809[var35] * var43 + 16383 - (this.field749[var35] * var42) >> 14);
                                    this.field749[var35] = (short) var44;
                                }
                            }
                        }
                    }
                }
                this.method521(55);
            }
        } else if (arg0 == 3) {
            for (int var69 = 0; var69 < var8; var69++) {
                int var70 = arg1[var69];
                if (var70 < this.field821.length) {
                    int[] var71 = this.field821[var70];
                    for (int var72 = 0; var72 < var71.length; var72++) {
                        int var73 = var71[var72];
                        this.field751[var73] -= class674.field9528;
                        this.field802[var73] -= class553.field7843;
                        this.field805[var73] -= class256.field3924;
                        this.field751[var73] = this.field751[var73] * arg2 >> 7;
                        this.field802[var73] = this.field802[var73] * arg3 >> 7;
                        this.field805[var73] = this.field805[var73] * arg4 >> 7;
                        this.field751[var73] += class674.field9528;
                        this.field802[var73] += class553.field7843;
                        this.field805[var73] += class256.field3924;
                    }
                }
            }
        } else if (arg0 == 5) {
            if (this.field829 != null) {
                boolean var74 = false;
                for (int var75 = 0; var75 < var8; var75++) {
                    int var79 = arg1[var75];
                    if (this.field829.length > var79) {
                        int[] var80 = this.field829[var79];
                        for (int var81 = 0; var81 < var80.length; var81++) {
                            int var82 = var80[var81];
                            int var83 = (this.field819[var82] & 0xFF) + (arg2 * 8);
                            if (var83 < 0) {
                                var83 = 0;
                            } else if (var83 > 255) {
                                var83 = 255;
                            }
                            this.field819[var82] = (byte) var83;
                        }
                        var74 |= var80.length > 0;
                    }
                }
                if (var74) {
                    if (this.field741 != null) {
                        for (int var76 = 0; var76 < this.field744; var76++) {
                            class23 var77 = this.field741[var76];
                            class226 var78 = this.field834[var76];
                            var78.field3170 = var78.field3170 & 0xFFFFFF | 255 - (this.field819[var77.field305] & 0xFF) << 24;
                        }
                    }
                    this.method526(-7);
                }
            }
        } else if (arg0 == 7) {
            if (this.field829 != null) {
                boolean var84 = false;
                for (int var85 = 0; var85 < var8; var85++) {
                    int var89 = arg1[var85];
                    if (var89 < this.field829.length) {
                        int[] var90 = this.field829[var89];
                        for (int var91 = 0; var91 < var90.length; var91++) {
                            int var92 = var90[var91];
                            int var93 = this.field763[var92] & 0xFFFF;
                            int var94 = (var93 & 0xFF55) >> 10;
                            int var95 = var93 >> 7 & 0x7;
                            int var96 = arg2 + var94 & 0x3F;
                            int var97 = arg3 / 4 + var95;
                            int var98 = var93 & 0x7F;
                            int var99 = arg4 + var98;
                            if (var97 < 0) {
                                var97 = 0;
                            } else if (var97 > 7) {
                                var97 = 7;
                            }
                            if (var99 < 0) {
                                var99 = 0;
                            } else if (var99 > 127) {
                                var99 = 127;
                            }
                            this.field763[var92] = (short) class486.method2826(class486.method2826(var96 << 10, var97 << 7), var99);
                        }
                        var84 |= var90.length > 0;
                    }
                }
                if (var84) {
                    if (this.field741 != null) {
                        for (int var86 = 0; var86 < this.field744; var86++) {
                            class23 var87 = this.field741[var86];
                            class226 var88 = this.field834[var86];
                            var88.field3170 = class437.field6386[this.field763[var87.field305] & 0xFFFF] & 0xFFFFFF | var88.field3170 & 0xFF000000;
                        }
                    }
                    this.method526(-7);
                }
            }
        } else if (arg0 == 8) {
            if (this.field740 != null) {
                for (int var100 = 0; var100 < var8; var100++) {
                    int var101 = arg1[var100];
                    if (this.field740.length > var101) {
                        int[] var102 = this.field740[var101];
                        for (int var103 = 0; var103 < var102.length; var103++) {
                            class226 var104 = this.field834[var102[var103]];
                            var104.field3173 += arg3;
                            var104.field3171 += arg2;
                        }
                    }
                }
            }
        } else if (arg0 == 10) {
            if (this.field740 != null) {
                for (int var105 = 0; var105 < var8; var105++) {
                    int var106 = arg1[var105];
                    if (var106 < this.field740.length) {
                        int[] var107 = this.field740[var106];
                        for (int var108 = 0; var108 < var107.length; var108++) {
                            class226 var109 = this.field834[var107[var108]];
                            var109.field3176 = var109.field3176 * arg3 >> 7;
                            var109.field3179 = var109.field3179 * arg2 >> 7;
                        }
                    }
                }
            }
        } else if (arg0 == 9 && this.field740 != null) {
            for (int var110 = 0; var110 < var8; var110++) {
                int var111 = arg1[var110];
                if (this.field740.length > var111) {
                    int[] var112 = this.field740[var111];
                    for (int var113 = 0; var113 < var112.length; var113++) {
                        class226 var114 = this.field834[var112[var113]];
                        var114.field3172 = var114.field3172 + arg2 & 0x3FFF;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(ZZLdm;IZLdm;)Lda;")
    private final class55 method505(boolean arg0, boolean arg1, class48 arg2, int arg3, boolean arg4, class48 arg5) {
        arg5.field804 = this.field804;
        arg5.field791 = this.field791;
        arg5.field750 = this.field750;
        arg5.field836 = this.field836;
        arg5.field752 = this.field752;
        arg5.field785 = arg3;
        if ((arg3 & 0x100) == 0) {
            arg5.field801 = this.field801;
        } else {
            arg5.field801 = true;
        }
        arg5.field780 = this.field780;
        arg5.field748 = this.field748;
        arg5.field807 = this.field807;
        field799++;
        arg5.field744 = this.field744;
        boolean var7 = class683.method3779(this.field791, 118, arg3);
        boolean var8 = class185.method1237(this.field791, arg3, 1027);
        if (!arg0) {
            this.method487();
        }
        boolean var9 = class633.method3530(arg3, (byte) 108, this.field791);
        boolean var10 = var7 | var8 | var9;
        if (var10) {
            if (!var7) {
                arg5.field751 = this.field751;
            } else if (arg2.field751 == null || arg2.field751.length < this.field807) {
                arg5.field751 = arg2.field751 = new int[this.field807];
            } else {
                arg5.field751 = arg2.field751;
            }
            if (!var8) {
                arg5.field802 = this.field802;
            } else if (arg2.field802 == null || arg2.field802.length < this.field807) {
                arg5.field802 = arg2.field802 = new int[this.field807];
            } else {
                arg5.field802 = arg2.field802;
            }
            if (!var9) {
                arg5.field805 = this.field805;
            } else if (arg2.field805 == null || this.field807 > arg2.field805.length) {
                arg5.field805 = arg2.field805 = new int[this.field807];
            } else {
                arg5.field805 = arg2.field805;
            }
            for (int var11 = 0; var11 < this.field807; var11++) {
                if (var7) {
                    arg5.field751[var11] = this.field751[var11];
                }
                if (var8) {
                    arg5.field802[var11] = this.field802[var11];
                }
                if (var9) {
                    arg5.field805[var11] = this.field805[var11];
                }
            }
        } else {
            arg5.field751 = this.field751;
            arg5.field802 = this.field802;
            arg5.field805 = this.field805;
        }
        if (class309.method1966(arg3, -8614, this.field791)) {
            arg5.field746 = arg2.field746;
            arg5.field746.field6396 = this.field746.field6396;
            arg5.field746.field6397 = this.field746.field6397;
            arg5.field746.field6394 = true;
        } else if (class203.method1352(this.field791, arg3, 0)) {
            arg5.field746 = this.field746;
        } else {
            arg5.field746 = null;
        }
        if (class156.method1088(arg3, -17, this.field791)) {
            if (arg2.field763 == null || arg2.field763.length < this.field750) {
                arg5.field763 = arg2.field763 = new short[this.field750];
            } else {
                arg5.field763 = arg2.field763;
            }
            for (int var12 = 0; var12 < this.field750; var12++) {
                arg5.field763[var12] = this.field763[var12];
            }
        } else {
            arg5.field763 = this.field763;
        }
        if (class23.method279(false, arg3, this.field791)) {
            if (arg2.field819 == null || this.field750 > arg2.field819.length) {
                arg5.field819 = arg2.field819 = new byte[this.field750];
            } else {
                arg5.field819 = arg2.field819;
            }
            for (int var13 = 0; var13 < this.field750; var13++) {
                arg5.field819[var13] = this.field819[var13];
            }
        } else {
            arg5.field819 = this.field819;
        }
        if (class328.method2064(this.field791, arg3, 128)) {
            arg5.field840 = arg2.field840;
            arg5.field840.field6397 = this.field840.field6397;
            arg5.field840.field6394 = true;
            arg5.field840.field6396 = this.field840.field6396;
        } else if (class85.method746(arg3, 69, this.field791)) {
            arg5.field840 = this.field840;
        } else {
            arg5.field840 = null;
        }
        if (class272.method1797(544, this.field791, arg3)) {
            if (arg2.field749 == null || this.field804 > arg2.field749.length) {
                int var14 = this.field804;
                arg5.field749 = arg2.field749 = new short[var14];
                arg5.field776 = arg2.field776 = new short[var14];
                arg5.field809 = arg2.field809 = new short[var14];
            } else {
                arg5.field749 = arg2.field749;
                arg5.field809 = arg2.field809;
                arg5.field776 = arg2.field776;
            }
            if (this.field781 == null) {
                arg5.field781 = null;
                for (int var18 = 0; var18 < this.field804; var18++) {
                    arg5.field749[var18] = this.field749[var18];
                    arg5.field776[var18] = this.field776[var18];
                    arg5.field809[var18] = this.field809[var18];
                }
            } else {
                if (arg2.field781 == null) {
                    arg2.field781 = new class599();
                }
                class599 var15 = arg5.field781 = arg2.field781;
                if (var15.field8470 == null || var15.field8470.length < this.field804) {
                    int var16 = this.field804;
                    var15.field8466 = new short[var16];
                    var15.field8470 = new short[var16];
                    var15.field8468 = new short[var16];
                    var15.field8473 = new byte[var16];
                }
                for (int var17 = 0; var17 < this.field804; var17++) {
                    arg5.field749[var17] = this.field749[var17];
                    arg5.field776[var17] = this.field776[var17];
                    arg5.field809[var17] = this.field809[var17];
                    var15.field8470[var17] = this.field781.field8470[var17];
                    var15.field8468[var17] = this.field781.field8468[var17];
                    var15.field8466[var17] = this.field781.field8466[var17];
                    var15.field8473[var17] = this.field781.field8473[var17];
                }
            }
            arg5.field814 = this.field814;
        } else {
            arg5.field809 = this.field809;
            arg5.field776 = this.field776;
            arg5.field814 = this.field814;
            arg5.field781 = this.field781;
            arg5.field749 = this.field749;
        }
        if (class399.method2443(this.field791, arg3, 118)) {
            arg5.field826 = arg2.field826;
            arg5.field826.field6394 = true;
            arg5.field826.field6396 = this.field826.field6396;
            arg5.field826.field6397 = this.field826.field6397;
        } else if (class321.method2006(this.field791, (byte) 44, arg3)) {
            arg5.field826 = this.field826;
        } else {
            arg5.field826 = null;
        }
        if (class158.method1102(this.field791, (byte) -94, arg3)) {
            if (arg2.field794 == null || arg2.field794.length < this.field750) {
                int var19 = this.field804;
                arg5.field794 = arg2.field794 = new float[var19];
                arg5.field830 = arg2.field830 = new float[var19];
            } else {
                arg5.field830 = arg2.field830;
                arg5.field794 = arg2.field794;
            }
            for (int var20 = 0; var20 < this.field804; var20++) {
                arg5.field794[var20] = this.field794[var20];
                arg5.field830[var20] = this.field830[var20];
            }
        } else {
            arg5.field794 = this.field794;
            arg5.field830 = this.field830;
        }
        if (class575.method3258(-5, this.field791, arg3)) {
            arg5.field792 = arg2.field792;
            arg5.field792.field6396 = this.field792.field6396;
            arg5.field792.field6397 = this.field792.field6397;
            arg5.field792.field6394 = true;
        } else if (class513.method2937(arg3, this.field791, -1)) {
            arg5.field792 = this.field792;
        } else {
            arg5.field792 = null;
        }
        if (class104.method834((byte) 87, this.field791, arg3)) {
            if (arg2.field818 == null || arg2.field818.length < this.field750) {
                int var21 = this.field750;
                arg5.field771 = arg2.field771 = new short[var21];
                arg5.field818 = arg2.field818 = new short[var21];
                arg5.field824 = arg2.field824 = new short[var21];
            } else {
                arg5.field824 = arg2.field824;
                arg5.field771 = arg2.field771;
                arg5.field818 = arg2.field818;
            }
            for (int var22 = 0; var22 < this.field750; var22++) {
                arg5.field818[var22] = this.field818[var22];
                arg5.field771[var22] = this.field771[var22];
                arg5.field824[var22] = this.field824[var22];
            }
        } else {
            arg5.field771 = this.field771;
            arg5.field818 = this.field818;
            arg5.field824 = this.field824;
        }
        if (class138.method1001((byte) 119, arg3, this.field791)) {
            arg5.field779 = arg2.field779;
            arg5.field779.field7401 = this.field779.field7401;
            arg5.field779.field7399 = this.field779.field7399;
            arg5.field779.field7398 = true;
        } else if (class547.method3093(this.field791, arg3, 0)) {
            arg5.field779 = this.field779;
        } else {
            arg5.field779 = null;
        }
        if (class553.method3136((byte) 103, arg3, this.field791)) {
            if (arg2.field769 == null || arg2.field769.length < this.field750) {
                int var23 = this.field750;
                arg5.field769 = arg2.field769 = new short[var23];
            } else {
                arg5.field769 = arg2.field769;
            }
            for (int var24 = 0; var24 < this.field750; var24++) {
                arg5.field769[var24] = this.field769[var24];
            }
        } else {
            arg5.field769 = this.field769;
        }
        if (!class89.method768(this.field791, false, arg3)) {
            arg5.field834 = this.field834;
        } else if (arg2.field834 == null || arg2.field834.length < this.field744) {
            int var26 = this.field744;
            arg5.field834 = arg2.field834 = new class226[var26];
            for (int var27 = 0; var27 < this.field744; var27++) {
                arg5.field834[var27] = this.field834[var27].method1487((byte) 4);
            }
        } else {
            arg5.field834 = arg2.field834;
            for (int var25 = 0; var25 < this.field744; var25++) {
                arg5.field834[var25].method1490(-6016, this.field834[var25]);
            }
        }
        arg5.field829 = this.field829;
        arg5.field842 = this.field842;
        arg5.field853 = this.field853;
        arg5.field741 = this.field741;
        arg5.field737 = this.field737;
        arg5.field851 = this.field851;
        arg5.field827 = this.field827;
        arg5.field855 = this.field855;
        if (this.field837) {
            arg5.field755 = this.field755;
            arg5.field837 = true;
            arg5.field838 = this.field838;
            arg5.field852 = this.field852;
            arg5.field757 = this.field757;
            arg5.field844 = this.field844;
            arg5.field742 = this.field742;
            arg5.field777 = this.field777;
            arg5.field790 = this.field790;
        } else {
            arg5.field837 = false;
        }
        arg5.field747 = this.field747;
        arg5.field783 = this.field783;
        arg5.field856 = this.field856;
        arg5.field821 = this.field821;
        arg5.field739 = this.field739;
        arg5.field733 = this.field733;
        arg5.field740 = this.field740;
        return arg5;
    }

    @OriginalMember(owner = "client!dm", name = "F", descriptor = "()Z")
    public final boolean method506() {
        field811++;
        if (this.field821 == null) {
            return false;
        }
        for (int var1 = 0; var1 < this.field807; var1++) {
            this.field751[var1] <<= 0x4;
            this.field802[var1] <<= 0x4;
            this.field805[var1] <<= 0x4;
        }
        class553.field7843 = 0;
        class674.field9528 = 0;
        class256.field3924 = 0;
        return true;
    }

    @OriginalMember(owner = "client!dm", name = "K", descriptor = "()I")
    public final int method507() {
        field789++;
        if (!this.field837) {
            this.method520(-1);
        }
        return this.field852;
    }

    @OriginalMember(owner = "client!dm", name = "b", descriptor = "(I)V")
    private final void method508(int arg0) {
        if (this.field779 != null) {
            this.field779.field7399 = false;
        }
        if (arg0 >= -2) {
            this.field742 = -92;
        }
        field854++;
    }

    @OriginalMember(owner = "client!dm", name = "f", descriptor = "()Z")
    public final boolean method509() {
        field835++;
        if (this.field769 == null) {
            return true;
        }
        for (int var1 = 0; var1 < this.field769.length; var1++) {
            if (this.field769[var1] != -1 && !this.field753.field2384.method1383(this.field769[var1], 78)) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!dm", name = "na", descriptor = "()I")
    public final int method510() {
        field822++;
        return this.field748;
    }

    @OriginalMember(owner = "client!dm", name = "d", descriptor = "()V")
    public final void method511() {
        field847++;
    }

    @OriginalMember(owner = "client!dm", name = "KA", descriptor = "()I")
    public final int method512() {
        field800++;
        if (!this.field837) {
            this.method520(-1);
        }
        return this.field757;
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(Lq;Lkd;I)V")
    public final void method513(class391 arg0, class253 arg1, int arg2) {
        field816++;
        if (this.field804 == 0) {
            return;
        }
        class21 var4 = this.field753.field5630;
        class21 var5 = (class21) arg0;
        if (!this.field837) {
            this.method520(-1);
        }
        class491.field6984 = var4.field272 * var5.field257 + var4.field246 * var5.field245 + var4.field243 * var5.field293 + var4.field257;
        class247.field3829 = var4.field272 * var5.field243 + var4.field246 * var5.field247 + var4.field243 * var5.field291;
        float var6 = (float) this.field790 * class247.field3829 + class491.field6984;
        float var7 = (float) this.field838 * class247.field3829 + class491.field6984;
        float var8;
        float var9;
        if (var6 > var7) {
            var8 = (float) this.field852 + var6;
            var9 = var7 - (float) this.field852;
        } else {
            var9 = (float) (-this.field852) + var6;
            var8 = (float) this.field852 + var7;
        }
        if ((this.field753.field5732 <= var9) || ((float) this.field753.field5724 >= var8)) {
            return;
        }
        class57.field1100 = var4.field256 * var5.field243 + var4.field259 * var5.field247 + var4.field247 * var5.field291;
        class647.field9093 = var4.field256 * var5.field257 + var4.field259 * var5.field245 + var4.field247 * var5.field293 + var4.field245;
        float var10 = (float) this.field790 * class57.field1100 + class647.field9093;
        float var11 = (float) this.field838 * class57.field1100 + class647.field9093;
        float var12;
        float var13;
        if (var11 < var10) {
            var12 = ((float) this.field852 + var10) * (float) this.field753.field5638;
            var13 = ((float) (-this.field852) + var11) * (float) this.field753.field5638;
        } else {
            var13 = ((float) (-this.field852) + var10) * (float) this.field753.field5638;
            var12 = ((float) this.field852 + var11) * (float) this.field753.field5638;
        }
        if ((var13 / var8 >= this.field753.field5645) || (this.field753.field5640 >= var12 / var8)) {
            return;
        }
        class481.field6820 = var4.field289 * var5.field243 + var4.field291 * var5.field291 + var4.field271 * var5.field247;
        class640.field9038 = var4.field289 * var5.field257 + var4.field291 * var5.field293 + var4.field271 * var5.field245 + var4.field293;
        float var14 = (float) this.field790 * class481.field6820 + class640.field9038;
        float var15 = (float) this.field838 * class481.field6820 + class640.field9038;
        float var16;
        float var17;
        if ((var15 < var14)) {
            var16 = (var15 - (float) this.field852) * (float) this.field753.field5734;
            var17 = ((float) this.field852 + var14) * (float) this.field753.field5734;
        } else {
            var16 = (var14 - (float) this.field852) * (float) this.field753.field5734;
            var17 = ((float) this.field852 + var15) * (float) this.field753.field5734;
        }
        if ((var16 / var8 >= this.field753.field5683) || (this.field753.field5714 >= var17 / var8)) {
            return;
        }
        if (arg1 != null || this.field741 != null) {
            class140.field2072 = var4.field272 * var5.field272 + var4.field246 * var5.field256 + var4.field243 * var5.field289;
            class408.field5963 = var4.field272 * var5.field246 + var4.field246 * var5.field259 + var4.field243 * var5.field271;
            class363.field5186 = var4.field289 * var5.field272 + var4.field291 * var5.field289 + var4.field271 * var5.field256;
            class615.field8583 = var4.field289 * var5.field246 + var4.field291 * var5.field271 + var4.field271 * var5.field259;
            class586.field8210 = var4.field256 * var5.field246 + var4.field259 * var5.field259 + var4.field247 * var5.field271;
            class315.field4668 = var4.field256 * var5.field272 + var4.field259 * var5.field256 + var4.field247 * var5.field289;
        }
        if (arg1 != null) {
            boolean var18 = false;
            boolean var19 = true;
            int var20 = this.field757 + this.field742 >> 1;
            int var21 = this.field844 + this.field755 >> 1;
            int var22 = (int) ((float) var21 * class315.field4668 + (float) this.field790 * class57.field1100 + (float) var20 * class586.field8210 + class647.field9093);
            int var23 = (int) ((float) var21 * class363.field5186 + (float) this.field790 * class481.field6820 + (float) var20 * class615.field8583 + class640.field9038);
            int var24 = (int) ((float) var21 * class140.field2072 + (float) this.field790 * class247.field3829 + (float) var20 * class408.field5963 + class491.field6984);
            if (var24 >= this.field753.field5724) {
                arg1.field3894 = this.field753.field5638 * var22 / var24 + this.field753.field5684;
                arg1.field3893 = this.field753.field5734 * var23 / var24 + this.field753.field5686;
            } else {
                var18 = true;
            }
            int var25 = (int) ((float) var21 * class315.field4668 + (float) this.field838 * class57.field1100 + (float) var20 * class586.field8210 + class647.field9093);
            int var26 = (int) ((float) var21 * class363.field5186 + (float) this.field838 * class481.field6820 + (float) var20 * class615.field8583 + class640.field9038);
            int var27 = (int) ((float) var21 * class140.field2072 + (float) this.field838 * class247.field3829 + (float) var20 * class408.field5963 + class491.field6984);
            if (var27 < this.field753.field5724) {
                var18 = true;
            } else {
                arg1.field3897 = this.field753.field5684 + (this.field753.field5638 * var25 / var27);
                arg1.field3895 = this.field753.field5734 * var26 / var27 + this.field753.field5686;
            }
            if (var18) {
                if (var24 < this.field753.field5724 && this.field753.field5724 > var27) {
                    var19 = false;
                } else if (this.field753.field5724 > var24) {
                    int var28 = (var27 - this.field753.field5724 << 16) / (var27 - var24);
                    int var29 = ((var25 - var22) * var28 >> 16) + var25;
                    int var30 = var26 + ((var26 - var23) * var28 >> 16);
                    arg1.field3894 = this.field753.field5638 * var29 / this.field753.field5724 + this.field753.field5684;
                    arg1.field3893 = this.field753.field5686 + (this.field753.field5734 * var30 / this.field753.field5724);
                } else if (this.field753.field5724 > var27) {
                    int var31 = (var24 - this.field753.field5724 << 16) / (var24 - var27);
                    int var32 = ((var22 - var25) * var31 >> 16) + var22;
                    int var33 = ((var23 - var26) * var31 >> 16) + var23;
                    arg1.field3894 = this.field753.field5638 * var32 / this.field753.field5724 + this.field753.field5684;
                    arg1.field3893 = this.field753.field5734 * var33 / this.field753.field5724 + this.field753.field5686;
                }
            }
            if (var19) {
                if (var24 > var27) {
                    arg1.field3892 = this.field753.field5684 + ((this.field852 + var22) * this.field753.field5638 / var24) - arg1.field3894;
                } else {
                    arg1.field3892 = (var25 + this.field852) * this.field753.field5638 / var27 + this.field753.field5684 - arg1.field3897;
                }
                arg1.field3896 = true;
            }
        }
        this.field753.method2341(-29576);
        this.field753.method2371(var5, true);
        this.method515(-1);
        this.method537((byte) 106);
    }

    @OriginalMember(owner = "client!dm", name = "L", descriptor = "()V")
    public final void method514() {
        field833++;
        for (int var1 = 0; var1 < this.field807; var1++) {
            this.field751[var1] = this.field751[var1] + 7 >> 4;
            this.field802[var1] = this.field802[var1] + 7 >> 4;
            this.field805[var1] = this.field805[var1] + 7 >> 4;
        }
        this.method543(true);
        this.field837 = false;
    }

    @OriginalMember(owner = "client!dm", name = "<init>", descriptor = "(Lhea;Llm;IIII)V")
    public class48(class387 arg0, class461 arg1, int arg2, int arg3, int arg4, int arg5) {
        this(arg0, arg2, arg5, true, false);
        class209 var7 = arg0.field2384;
        int[] var8 = new int[arg1.field6632];
        this.field851 = new int[arg1.field6592 + 1];
        for (int var9 = 0; var9 < arg1.field6632; var9++) {
            if ((arg1.field6593 == null || arg1.field6593[var9] != 2) && (arg1.field6620 == null || arg1.field6620[var9] == -1 || !var7.method1386(arg1.field6620[var9] & 0xFFFF, -6514).field2299)) {
                var8[this.field750++] = var9;
                this.field851[arg1.field6627[var9]]++;
                this.field851[arg1.field6639[var9]]++;
                this.field851[arg1.field6596[var9]]++;
            }
        }
        this.field752 = this.field750;
        long[] var10 = new long[this.field750];
        boolean var11 = (this.field785 & 0x100) != 0;
        label507: for (int var12 = 0; var12 < this.field750; var12++) {
            int var185 = var8[var12];
            class159 var186 = null;
            int var187 = 0;
            byte var188 = 0;
            byte var189 = 0;
            byte var190 = 0;
            if (arg1.field6613 != null) {
                for (int var191 = 0; var191 < arg1.field6613.length; var191++) {
                    class692 var192 = arg1.field6613[var191];
                    if (var192.field9732 == var185) {
                        class298 var193 = class252.method1687((byte) -102, var192.field9726);
                        if (var193.field4449) {
                            var10[var12] = Long.MAX_VALUE;
                            this.field752--;
                            continue label507;
                        }
                    }
                }
            }
            short var194 = -1;
            if (arg1.field6620 != null) {
                var194 = arg1.field6620[var185];
                if (var194 != -1) {
                    var186 = var7.method1386(var194 & 0xFFFF, -6514);
                    var190 = var186.field2291;
                    var189 = var186.field2300;
                }
            }
            boolean var195 = arg1.field6607 != null && arg1.field6607[var185] != 0 || var186 != null && !var186.field2289 | var186.field2295;
            if ((var11 || var195) && arg1.field6601 != null) {
                var187 += arg1.field6601[var185] << 17;
            }
            if (var195) {
                var187 += 65536;
            }
            int var196 = ((var189 & 0xFF) << 8) + var187;
            int var197 = (var190 & 0xFF) + var196;
            int var198 = ((var194 & 0xFFFF) << 16) + var188;
            int var199 = (var12 & 0xFFFF) + var198;
            var10[var12] = ((long) var197 << 32) + ((long) var199);
            this.field801 |= var195;
        }
        class238.method1622(var8, -25697, var10);
        this.field807 = arg1.field6598;
        this.field802 = arg1.field6621;
        this.field751 = arg1.field6617;
        this.field805 = arg1.field6608;
        this.field747 = arg1.field6611;
        this.field780 = arg1.field6592;
        class276[] var13 = new class276[this.field780];
        this.field856 = arg1.field6616;
        this.field733 = arg1.field6634;
        if (arg1.field6613 != null) {
            this.field744 = arg1.field6613.length;
            this.field834 = new class226[this.field744];
            this.field741 = new class23[this.field744];
            for (int var14 = 0; var14 < this.field744; var14++) {
                class692 var15 = arg1.field6613[var14];
                class298 var16 = class252.method1687((byte) -110, var15.field9726);
                int var17 = -1;
                for (int var18 = 0; var18 < this.field750; var18++) {
                    if (var8[var18] == var15.field9732) {
                        var17 = var18;
                        break;
                    }
                }
                if (var17 == -1) {
                    throw new RuntimeException();
                }
                int var19 = class437.field6386[arg1.field6614[var15.field9732] & 0xFFFF] & 0xFFFFFF;
                int var20 = var19 | 255 - (arg1.field6607 == null ? 0 : arg1.field6607[var15.field9732]) << 24;
                this.field741[var14] = new class23(var17, arg1.field6627[var15.field9732], arg1.field6639[var15.field9732], arg1.field6596[var15.field9732], var16.field4457, var16.field4454, var16.field4458, var16.field4459, var16.field4450, var16.field4449, var16.field4451, var15.field9730);
                this.field834[var14] = new class226(var20);
            }
        }
        int var21 = this.field750 * 3;
        this.field809 = new short[var21];
        this.field818 = new short[this.field750];
        this.field739 = new short[var21];
        this.field794 = new float[var21];
        this.field827 = new short[var21];
        this.field771 = new short[this.field750];
        this.field853 = new short[var21];
        this.field763 = new short[this.field750];
        this.field836 = (short) arg3;
        this.field769 = new short[this.field750];
        this.field819 = new byte[this.field750];
        this.field824 = new short[this.field750];
        this.field814 = new byte[var21];
        this.field776 = new short[var21];
        this.field749 = new short[var21];
        this.field748 = (short) arg4;
        this.field830 = new float[var21];
        class385.field5421 = new long[var21];
        if (arg1.field6629 != null) {
            this.field737 = new short[this.field750];
        }
        int var22 = 0;
        for (int var23 = 0; var23 < arg1.field6592; var23++) {
            int var184 = this.field851[var23];
            this.field851[var23] = var22;
            var22 += var184;
            var13[var23] = new class276();
        }
        this.field851[arg1.field6592] = var22;
        int[] var24 = null;
        int[] var25 = null;
        int[] var26 = null;
        float[][] var27 = null;
        if (arg1.field6594 != null) {
            int var28 = arg1.field6600;
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
            for (int var36 = 0; var36 < this.field750; var36++) {
                int var43 = var8[var36];
                if (arg1.field6594[var43] != -1) {
                    int var44 = arg1.field6594[var43] & 0xFF;
                    for (int var45 = 0; var45 < 3; var45++) {
                        short var46;
                        if (var45 == 0) {
                            var46 = arg1.field6627[var43];
                        } else if (var45 == 1) {
                            var46 = arg1.field6639[var43];
                        } else {
                            var46 = arg1.field6596[var43];
                        }
                        int var47 = arg1.field6617[var46];
                        int var48 = arg1.field6621[var46];
                        int var49 = arg1.field6608[var46];
                        if (var29[var44] > var47) {
                            var29[var44] = var47;
                        }
                        if (var47 > var30[var44]) {
                            var30[var44] = var47;
                        }
                        if (var31[var44] > var48) {
                            var31[var44] = var48;
                        }
                        if (var48 > var32[var44]) {
                            var32[var44] = var48;
                        }
                        if (var33[var44] > var49) {
                            var33[var44] = var49;
                        }
                        if (var49 > var34[var44]) {
                            var34[var44] = var49;
                        }
                    }
                }
            }
            var25 = new int[var28];
            var27 = new float[var28][];
            var24 = new int[var28];
            var26 = new int[var28];
            for (int var37 = 0; var37 < var28; var37++) {
                byte var38 = arg1.field6618[var37];
                if (var38 > 0) {
                    var24[var37] = (var29[var37] + var30[var37]) / 2;
                    var25[var37] = (var31[var37] + var32[var37]) / 2;
                    var26[var37] = (var33[var37] + var34[var37]) / 2;
                    float var40;
                    float var41;
                    float var42;
                    if (var38 == 1) {
                        int var39 = arg1.field6595[var37];
                        var40 = 64.0F / (float) arg1.field6606[var37];
                        if (var39 == 0) {
                            var41 = 1.0F;
                            var42 = 1.0F;
                        } else if (var39 <= 0) {
                            var42 = (float) (-var39) / 1024.0F;
                            var41 = 1.0F;
                        } else {
                            var41 = (float) var39 / 1024.0F;
                            var42 = 1.0F;
                        }
                    } else if (var38 == 2) {
                        var40 = 64.0F / (float) arg1.field6606[var37];
                        var41 = 64.0F / (float) arg1.field6643[var37];
                        var42 = 64.0F / (float) arg1.field6595[var37];
                    } else {
                        var40 = (float) arg1.field6606[var37] / 1024.0F;
                        var41 = (float) arg1.field6643[var37] / 1024.0F;
                        var42 = (float) arg1.field6595[var37] / 1024.0F;
                    }
                    var27[var37] = class390.method2404(var41, arg1.field6633[var37], arg1.field6636[var37], var42, 2, arg1.field6603[var37], var40, class689.method3797(arg1.field6599[var37], 255));
                }
            }
        }
        class372[] var50 = new class372[arg1.field6632];
        for (int var51 = 0; var51 < arg1.field6632; var51++) {
            short var163 = arg1.field6627[var51];
            short var164 = arg1.field6639[var51];
            short var165 = arg1.field6596[var51];
            int var166 = this.field751[var164] - this.field751[var163];
            int var167 = this.field802[var164] - this.field802[var163];
            int var168 = this.field805[var164] - this.field805[var163];
            int var169 = this.field751[var165] - this.field751[var163];
            int var170 = this.field802[var165] - this.field802[var163];
            int var171 = this.field805[var165] - this.field805[var163];
            int var172 = var167 * var171 - (var168 * var170);
            int var173 = var168 * var169 - (var166 * var171);
            int var174;
            for (var174 = var166 * var170 - var167 * var169; var172 > 8192 || var173 > 8192 || var174 > 8192 || var172 < -8192 || var173 < -8192 || var174 < -8192; var174 >>= 0x1) {
                var173 >>= 0x1;
                var172 >>= 0x1;
            }
            int var175 = (int) Math.sqrt((double) (var173 * var173 + (var172 * var172 + (var174 * var174))));
            if (var175 <= 0) {
                var175 = 1;
            }
            int var176 = var172 * 256 / var175;
            int var177 = var173 * 256 / var175;
            int var178 = var174 * 256 / var175;
            byte var179 = arg1.field6593 == null ? 0 : arg1.field6593[var51];
            if (var179 == 0) {
                class276 var181 = var13[var163];
                var181.field4186++;
                var181.field4183 += var177;
                var181.field4184 += var178;
                var181.field4185 += var176;
                class276 var182 = var13[var164];
                var182.field4183 += var177;
                var182.field4185 += var176;
                var182.field4186++;
                var182.field4184 += var178;
                class276 var183 = var13[var165];
                var183.field4184 += var178;
                var183.field4185 += var176;
                var183.field4183 += var177;
                var183.field4186++;
            } else if (var179 == 1) {
                class372 var180 = var50[var51] = new class372();
                var180.field5314 = var176;
                var180.field5309 = var178;
                var180.field5307 = var177;
            }
        }
        for (int var52 = 0; var52 < this.field750; var52++) {
            int var73 = var8[var52];
            int var74 = arg1.field6614[var73] & 0xFFFF;
            short var75;
            if (arg1.field6620 == null) {
                var75 = -1;
            } else {
                var75 = arg1.field6620[var73];
            }
            int var76;
            if (arg1.field6594 == null) {
                var76 = -1;
            } else {
                var76 = arg1.field6594[var73];
            }
            int var77;
            if (arg1.field6607 == null) {
                var77 = 0;
            } else {
                var77 = arg1.field6607[var73] & 0xFF;
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
                    var84 = 1;
                    var83 = 0.0F;
                    var81 = 1.0F;
                    var79 = 1.0F;
                    var80 = 1.0F;
                    var78 = 0.0F;
                    var82 = 0.0F;
                    var85 = 2;
                } else {
                    var76 &= 0xFF;
                    byte var87 = arg1.field6618[var76];
                    if (var87 == 0) {
                        short var88 = arg1.field6627[var73];
                        short var89 = arg1.field6639[var73];
                        short var90 = arg1.field6596[var73];
                        short var91 = arg1.field6603[var76];
                        short var92 = arg1.field6636[var76];
                        short var93 = arg1.field6633[var76];
                        float var94 = (float) arg1.field6617[var91];
                        float var95 = (float) arg1.field6621[var91];
                        float var96 = (float) arg1.field6608[var91];
                        float var97 = (float) arg1.field6617[var92] - var94;
                        float var98 = (float) arg1.field6621[var92] - var95;
                        float var99 = (float) arg1.field6608[var92] - var96;
                        float var100 = (float) arg1.field6617[var93] - var94;
                        float var101 = (float) arg1.field6621[var93] - var95;
                        float var102 = (float) arg1.field6608[var93] - var96;
                        float var103 = (float) arg1.field6617[var88] - var94;
                        float var104 = (float) arg1.field6621[var88] - var95;
                        float var105 = (float) arg1.field6608[var88] - var96;
                        float var106 = (float) arg1.field6617[var89] - var94;
                        float var107 = (float) arg1.field6621[var89] - var95;
                        float var108 = (float) arg1.field6608[var89] - var96;
                        float var109 = (float) arg1.field6617[var90] - var94;
                        float var110 = (float) arg1.field6621[var90] - var95;
                        float var111 = (float) arg1.field6608[var90] - var96;
                        float var112 = var98 * var102 - var99 * var101;
                        float var113 = var99 * var100 - (var97 * var102);
                        float var114 = var97 * var101 - var98 * var100;
                        float var115 = var101 * var114 - var102 * var113;
                        float var116 = var102 * var112 - (var100 * var114);
                        float var117 = var100 * var113 - (var101 * var112);
                        float var118 = 1.0F / (var99 * var117 + var97 * var115 + var98 * var116);
                        var80 = (var108 * var117 + var106 * var115 + var107 * var116) * var118;
                        var82 = (var111 * var117 + var109 * var115 + var110 * var116) * var118;
                        var78 = (var105 * var117 + var103 * var115 + var104 * var116) * var118;
                        float var119 = var97 * var113 - (var98 * var112);
                        float var120 = var98 * var114 - var99 * var113;
                        float var121 = var99 * var112 - (var97 * var114);
                        float var122 = 1.0F / (var102 * var119 + var100 * var120 + var101 * var121);
                        var83 = (var111 * var119 + var109 * var120 + var110 * var121) * var122;
                        var81 = (var108 * var119 + var106 * var120 + var107 * var121) * var122;
                        var79 = (var105 * var119 + var103 * var120 + var104 * var121) * var122;
                    } else {
                        short var123 = arg1.field6627[var73];
                        short var124 = arg1.field6639[var73];
                        short var125 = arg1.field6596[var73];
                        int var126 = var24[var76];
                        int var127 = var25[var76];
                        int var128 = var26[var76];
                        float[] var129 = var27[var76];
                        byte var130 = arg1.field6631[var76];
                        float var131 = (float) arg1.field6609[var76] / 256.0F;
                        if (var87 == 1) {
                            float var132 = (float) arg1.field6643[var76] / 1024.0F;
                            class51.method576(var128, arg1.field6608[var123], 5, var130, var132, var127, arg1.field6617[var123], var126, var129, arg1.field6621[var123], var131);
                            var79 = class202.field2857;
                            var78 = class366.field5234;
                            class51.method576(var128, arg1.field6608[var124], 5, var130, var132, var127, arg1.field6617[var124], var126, var129, arg1.field6621[var124], var131);
                            var81 = class202.field2857;
                            var80 = class366.field5234;
                            class51.method576(var128, arg1.field6608[var125], 5, var130, var132, var127, arg1.field6617[var125], var126, var129, arg1.field6621[var125], var131);
                            var82 = class366.field5234;
                            var83 = class202.field2857;
                            float var133 = var132 / 2.0F;
                            if ((var130 & 0x1) == 0) {
                                if (var82 - var78 > var133) {
                                    var82 -= var132;
                                    var85 = 1;
                                } else if (var133 < var78 - var82) {
                                    var82 += var132;
                                    var85 = 2;
                                }
                                if ((var133 < var80 - var78)) {
                                    var80 -= var132;
                                    var84 = 1;
                                } else if (var78 - var80 > var133) {
                                    var80 += var132;
                                    var84 = 2;
                                }
                            } else {
                                if (var83 - var79 > var133) {
                                    var83 -= var132;
                                    var85 = 1;
                                } else if (var133 < var79 - var83) {
                                    var83 += var132;
                                    var85 = 2;
                                }
                                if (var81 - var79 > var133) {
                                    var81 -= var132;
                                    var84 = 1;
                                } else if (var133 < var79 - var81) {
                                    var81 += var132;
                                    var84 = 2;
                                }
                            }
                        } else if (var87 == 2) {
                            float var134 = (float) arg1.field6602[var76] / 256.0F;
                            float var135 = (float) arg1.field6630[var76] / 256.0F;
                            int var136 = arg1.field6617[var124] - arg1.field6617[var123];
                            int var137 = arg1.field6621[var124] - arg1.field6621[var123];
                            int var138 = arg1.field6608[var124] - arg1.field6608[var123];
                            int var139 = arg1.field6617[var125] - arg1.field6617[var123];
                            int var140 = arg1.field6621[var125] - arg1.field6621[var123];
                            int var141 = arg1.field6608[var125] - arg1.field6608[var123];
                            int var142 = var137 * var141 - (var138 * var140);
                            int var143 = var138 * var139 - (var136 * var141);
                            int var144 = var136 * var140 - var137 * var139;
                            float var145 = 64.0F / (float) arg1.field6595[var76];
                            float var146 = 64.0F / (float) arg1.field6606[var76];
                            float var147 = 64.0F / (float) arg1.field6643[var76];
                            float var148 = (var129[2] * (float) var144 + var129[0] * (float) var142 + var129[1] * (float) var143) / var145;
                            float var149 = (var129[5] * (float) var144 + var129[4] * (float) var143 + var129[3] * (float) var142) / var146;
                            float var150 = (var129[8] * (float) var144 + var129[6] * (float) var142 + var129[7] * (float) var143) / var147;
                            var86 = class224.method1478(var150, var149, (byte) 62, var148);
                            class205.method1361(var127, var134, var135, var128, var126, var86, 3, arg1.field6617[var123], var130, var131, arg1.field6608[var123], var129, arg1.field6621[var123]);
                            var78 = class64.field1208;
                            var79 = class503.field7114;
                            class205.method1361(var127, var134, var135, var128, var126, var86, 3, arg1.field6617[var124], var130, var131, arg1.field6608[var124], var129, arg1.field6621[var124]);
                            var81 = class503.field7114;
                            var80 = class64.field1208;
                            class205.method1361(var127, var134, var135, var128, var126, var86, 3, arg1.field6617[var125], var130, var131, arg1.field6608[var125], var129, arg1.field6621[var125]);
                            var82 = class64.field1208;
                            var83 = class503.field7114;
                        } else if (var87 == 3) {
                            class410.method2476(var126, var131, arg1.field6617[var123], var130, arg1.field6608[var123], var127, var128, 5, arg1.field6621[var123], var129);
                            var79 = class254.field3899;
                            var78 = class473.field6757;
                            class410.method2476(var126, var131, arg1.field6617[var124], var130, arg1.field6608[var124], var127, var128, 5, arg1.field6621[var124], var129);
                            var81 = class254.field3899;
                            var80 = class473.field6757;
                            class410.method2476(var126, var131, arg1.field6617[var125], var130, arg1.field6608[var125], var127, var128, 5, arg1.field6621[var125], var129);
                            var83 = class254.field3899;
                            var82 = class473.field6757;
                            if ((var130 & 0x1) == 0) {
                                if ((var80 - var78 > 0.5F)) {
                                    var84 = 1;
                                    var80--;
                                } else if (var78 - var80 > 0.5F) {
                                    var80++;
                                    var84 = 2;
                                }
                                if (var82 - var78 > 0.5F) {
                                    var85 = 1;
                                    var82--;
                                } else if (var78 - var82 > 0.5F) {
                                    var82++;
                                    var85 = 2;
                                }
                            } else {
                                if ((var81 - var79 > 0.5F)) {
                                    var84 = 1;
                                    var81--;
                                } else if (var79 - var81 > 0.5F) {
                                    var81++;
                                    var84 = 2;
                                }
                                if ((var83 - var79 > 0.5F)) {
                                    var83--;
                                    var85 = 1;
                                } else if (var79 - var83 > 0.5F) {
                                    var85 = 2;
                                    var83++;
                                }
                            }
                        }
                    }
                }
            }
            byte var151;
            if (arg1.field6593 == null) {
                var151 = 0;
            } else {
                var151 = arg1.field6593[var73];
            }
            if (var151 == 0) {
                long var152 = ((long) (var86 << 24) + ((long) (var74 << 8)) + (long) var77 << 32) + (long) (var76 << 2);
                short var154 = arg1.field6627[var73];
                short var155 = arg1.field6639[var73];
                short var156 = arg1.field6596[var73];
                class276 var157 = var13[var154];
                this.field818[var52] = this.method547(var157.field4186, var157.field4184, var154, var152, var157.field4185, arg1, var79, var78, var52, 0, var157.field4183);
                class276 var158 = var13[var155];
                this.field771[var52] = this.method547(var158.field4186, var158.field4184, var155, (long) var84 + var152, var158.field4185, arg1, var81, var80, var52, 0, var158.field4183);
                class276 var159 = var13[var156];
                this.field824[var52] = this.method547(var159.field4186, var159.field4184, var156, (long) var85 + var152, var159.field4185, arg1, var83, var82, var52, 0, var159.field4183);
            } else if (var151 == 1) {
                class372 var160 = var50[var73];
                long var161 = ((long) (var74 << 8) + (long) (var86 << 24) + ((long) var77) << 32) + (long) ((var160.field5309 + 256 << 22) + (var160.field5307 + 256 << 12) + ((var76 << 2) - -(var160.field5314 > 0 ? 1024 : 2048)));
                this.field818[var52] = this.method547(0, var160.field5309, arg1.field6627[var73], var161, var160.field5314, arg1, var79, var78, var52, 0, var160.field5307);
                this.field771[var52] = this.method547(0, var160.field5309, arg1.field6639[var73], (long) var84 + var161, var160.field5314, arg1, var81, var80, var52, 0, var160.field5307);
                this.field824[var52] = this.method547(0, var160.field5309, arg1.field6596[var73], (long) var85 + var161, var160.field5314, arg1, var83, var82, var52, 0, var160.field5307);
            }
            if (arg1.field6620 == null) {
                this.field769[var52] = -1;
            } else {
                this.field769[var52] = arg1.field6620[var73];
            }
            if (arg1.field6607 != null) {
                this.field819[var52] = arg1.field6607[var73];
            }
            if (arg1.field6629 != null) {
                this.field737[var52] = arg1.field6629[var73];
            }
            this.field763[var52] = arg1.field6614[var73];
        }
        if (this.field752 > 0) {
            int var53 = 1;
            short var54 = this.field769[0];
            for (int var55 = 0; var55 < this.field752; var55++) {
                short var65 = this.field769[var55];
                if (var54 != var65) {
                    var53++;
                    var54 = var65;
                }
            }
            this.field842 = new int[var53];
            this.field855 = new int[var53];
            this.field783 = new int[var53 + 1];
            this.field783[0] = 0;
            int var56 = this.field804;
            short var57 = 0;
            int var58 = 0;
            short var59 = this.field769[0];
            for (int var60 = 0; var60 < this.field752; var60++) {
                short var61 = this.field769[var60];
                if (var59 != var61) {
                    this.field842[var58] = var56;
                    this.field855[var58] = var57 + 1 - var56;
                    var58++;
                    this.field783[var58] = var60;
                    var57 = 0;
                    var59 = var61;
                    var56 = this.field804;
                }
                short var62 = this.field818[var60];
                if (var56 > var62) {
                    var56 = var62;
                }
                if (var62 > var57) {
                    var57 = var62;
                }
                short var63 = this.field771[var60];
                if (var56 > var63) {
                    var56 = var63;
                }
                if (var63 > var57) {
                    var57 = var63;
                }
                short var64 = this.field824[var60];
                if (var64 > var57) {
                    var57 = var64;
                }
                if (var64 < var56) {
                    var56 = var64;
                }
            }
            this.field842[var58] = var56;
            this.field855[var58] = var57 + 1 - var56;
            var58++;
            this.field783[var58] = this.field752;
        }
        class385.field5421 = null;
        this.field739 = class50.method571(this.field804, this.field739, true);
        this.field853 = class50.method571(this.field804, this.field853, true);
        this.field749 = class50.method571(this.field804, this.field749, true);
        this.field776 = class50.method571(this.field804, this.field776, true);
        this.field809 = class50.method571(this.field804, this.field809, true);
        this.field814 = class42.method464(this.field814, this.field804, 124);
        this.field794 = class109.method858((byte) 2, this.field794, this.field804);
        this.field830 = class109.method858((byte) 2, this.field830, this.field804);
        if (arg1.field6619 != null && class179.method1214(arg2, this.field791, 117)) {
            this.field821 = arg1.method2717(-110, false);
        }
        if (arg1.field6613 != null && class360.method2197(false, arg2, this.field791)) {
            this.field740 = arg1.method2718(0);
        }
        if (arg1.field6625 != null && class499.method2889((byte) 108, this.field791, arg2)) {
            int var66 = 0;
            int[] var67 = new int[256];
            for (int var68 = 0; var68 < this.field750; var68++) {
                int var72 = arg1.field6625[var8[var68]];
                if (var72 >= 0) {
                    if (var72 > var66) {
                        var66 = var72;
                    }
                    int var10002 = var67[var72]++;
                }
            }
            this.field829 = new int[var66 + 1][];
            for (int var69 = 0; var69 <= var66; var69++) {
                this.field829[var69] = new int[var67[var69]];
                var67[var69] = 0;
            }
            for (int var70 = 0; var70 < this.field750; var70++) {
                int var71 = arg1.field6625[var8[var70]];
                if (var71 >= 0) {
                    this.field829[var71][var67[var71]++] = var70;
                }
            }
        }
    }

    @OriginalMember(owner = "client!dm", name = "c", descriptor = "(I)V")
    private final void method515(int arg0) {
        field759++;
        if (~this.field752 == arg0) {
            return;
        }
        if (this.method518(false) && this.method489((byte) -68)) {
            this.field753.method1865(0, arg0 - 26557, this.field746.field6396);
            this.field753.method1865(1, -26558, this.field840.field6396);
            this.field753.method1865(2, -26558, this.field792.field6396);
            boolean var2;
            if ((this.field791 & 0x37) == 0) {
                this.field753.method2318((byte) -24, false);
                var2 = false;
                this.field753.method1883(arg0 - 99, this.field753.field5744);
            } else {
                this.field753.method2318((byte) -24, true);
                var2 = true;
                this.field753.method1865(3, -26558, this.field826.field6396);
                this.field753.method1883(-110, this.field753.field5740);
            }
            for (int var3 = 0; var3 < this.field842.length; var3++) {
                int var4 = this.field783[var3];
                int var5 = this.field783[var3 + 1];
                int var6 = this.field769[var4] & 0xFFFF;
                if (var6 == 65535) {
                    var6 = -1;
                }
                this.field753.method2389(var2, true, var6, false);
                this.field753.method1874(class80.field1355, var5 - var4, this.field842[var3], true, this.field779.field7401, this.field855[var3], var4 * 3);
            }
        }
        this.method528(-14309);
    }

    @OriginalMember(owner = "client!dm", name = "WA", descriptor = "(IIII)V")
    public final void method516(int arg0, int arg1, int arg2, int arg3) {
        field849++;
        if (arg0 == 0) {
            int var5 = 0;
            class256.field3924 = 0;
            class553.field7843 = 0;
            class674.field9528 = 0;
            for (int var6 = 0; var6 < this.field780; var6++) {
                class674.field9528 += this.field751[var6];
                class553.field7843 += this.field802[var6];
                class256.field3924 += this.field805[var6];
                var5++;
            }
            if (var5 <= 0) {
                class674.field9528 = arg1;
                class553.field7843 = arg2;
                class256.field3924 = arg3;
            } else {
                class674.field9528 = class674.field9528 / var5 + arg1;
                class553.field7843 = class553.field7843 / var5 + arg2;
                class256.field3924 = class256.field3924 / var5 + arg3;
            }
        } else if (arg0 == 1) {
            for (int var7 = 0; var7 < this.field780; var7++) {
                this.field751[var7] += arg1;
                this.field802[var7] += arg2;
                this.field805[var7] += arg3;
            }
        } else if (arg0 == 2) {
            for (int var8 = 0; var8 < this.field780; var8++) {
                this.field751[var8] -= class674.field9528;
                this.field802[var8] -= class553.field7843;
                this.field805[var8] -= class256.field3924;
                if (arg3 != 0) {
                    int var9 = class189.field2719[arg3];
                    int var10 = class189.field2721[arg3];
                    int var11 = this.field802[var8] * var9 + this.field751[var8] * var10 + 16383 >> 14;
                    this.field802[var8] = this.field802[var8] * var10 + 16383 - this.field751[var8] * var9 >> 14;
                    this.field751[var8] = var11;
                }
                if (arg1 != 0) {
                    int var12 = class189.field2719[arg1];
                    int var13 = class189.field2721[arg1];
                    int var14 = this.field802[var8] * var13 + 16383 - (this.field805[var8] * var12) >> 14;
                    this.field805[var8] = this.field805[var8] * var13 + this.field802[var8] * var12 + 16383 >> 14;
                    this.field802[var8] = var14;
                }
                if (arg2 != 0) {
                    int var15 = class189.field2719[arg2];
                    int var16 = class189.field2721[arg2];
                    int var17 = this.field751[var8] * var16 + this.field805[var8] * var15 + 16383 >> 14;
                    this.field805[var8] = this.field805[var8] * var16 + 16383 - (this.field751[var8] * var15) >> 14;
                    this.field751[var8] = var17;
                }
                this.field751[var8] += class674.field9528;
                this.field802[var8] += class553.field7843;
                this.field805[var8] += class256.field3924;
            }
        } else if (arg0 == 3) {
            for (int var18 = 0; var18 < this.field780; var18++) {
                this.field751[var18] -= class674.field9528;
                this.field802[var18] -= class553.field7843;
                this.field805[var18] -= class256.field3924;
                this.field751[var18] = this.field751[var18] * arg1 / 128;
                this.field802[var18] = this.field802[var18] * arg2 / 128;
                this.field805[var18] = this.field805[var18] * arg3 / 128;
                this.field751[var18] += class674.field9528;
                this.field802[var18] += class553.field7843;
                this.field805[var18] += class256.field3924;
            }
        } else if (arg0 == 5) {
            for (int var19 = 0; var19 < this.field750; var19++) {
                int var23 = (this.field819[var19] & 0xFF) + arg1 * 8;
                if (var23 < 0) {
                    var23 = 0;
                } else if (var23 > 255) {
                    var23 = 255;
                }
                this.field819[var19] = (byte) var23;
            }
            if (this.field741 != null) {
                for (int var20 = 0; var20 < this.field744; var20++) {
                    class23 var21 = this.field741[var20];
                    class226 var22 = this.field834[var20];
                    var22.field3170 = 255 - (this.field819[var21.field305] & 0xFF) << 24 | var22.field3170 & 0xFFFFFF;
                }
            }
            this.method526(-7);
        } else if (arg0 == 7) {
            for (int var24 = 0; var24 < this.field750; var24++) {
                int var28 = this.field763[var24] & 0xFFFF;
                int var29 = (var28 & 0xFD91) >> 10;
                int var30 = (var28 & 0x3D1) >> 7;
                int var31 = var28 & 0x7F;
                int var32 = arg2 / 4 + var30;
                int var33 = arg1 + var29 & 0x3F;
                if (var32 < 0) {
                    var32 = 0;
                } else if (var32 > 7) {
                    var32 = 7;
                }
                int var34 = arg3 + var31;
                if (var34 < 0) {
                    var34 = 0;
                } else if (var34 > 127) {
                    var34 = 127;
                }
                this.field763[var24] = (short) class486.method2826(class486.method2826(var32 << 7, var33 << 10), var34);
            }
            if (this.field741 != null) {
                for (int var25 = 0; var25 < this.field744; var25++) {
                    class23 var26 = this.field741[var25];
                    class226 var27 = this.field834[var25];
                    var27.field3170 = var27.field3170 & 0xFF000000 | class437.field6386[this.field763[var26.field305] & 0xFFFF] & 0xFFFFFF;
                }
            }
            this.method526(-7);
        } else if (arg0 == 8) {
            for (int var35 = 0; var35 < this.field744; var35++) {
                class226 var36 = this.field834[var35];
                var36.field3173 += arg2;
                var36.field3171 += arg1;
            }
        } else if (arg0 == 10) {
            for (int var37 = 0; var37 < this.field744; var37++) {
                class226 var38 = this.field834[var37];
                var38.field3179 = var38.field3179 * arg1 >> 7;
                var38.field3176 = var38.field3176 * arg2 >> 7;
            }
        } else if (arg0 == 9) {
            for (int var39 = 0; var39 < this.field744; var39++) {
                class226 var40 = this.field834[var39];
                var40.field3172 = var40.field3172 + arg1 & 0x3FFF;
            }
        }
    }

    @OriginalMember(owner = "client!dm", name = "PA", descriptor = "()I")
    public final int method517() {
        field841++;
        return this.field785;
    }

    @OriginalMember(owner = "client!dm", name = "b", descriptor = "(Z)Z")
    private final boolean method518(boolean arg0) {
        field815++;
        boolean var2 = !this.field840.field6397;
        if (arg0) {
            this.field838 = 27;
        }
        boolean var3 = (this.field791 & 0x37) != 0 && !this.field826.field6397;
        boolean var4 = !this.field746.field6397;
        boolean var5 = !this.field792.field6397;
        if (!var4 && !var2 && !var3 && !var5) {
            return true;
        }
        boolean var6 = true;
        if (var4) {
            if (this.field746.field6393 == null) {
                this.field746.field6393 = this.field753.method1901(-21710, this.field850);
            }
            class613 var7 = this.field746.field6393;
            var7.method993(this.field804 * 12, -6696, 12);
            Buffer var8 = var7.method995(true, 1614);
            if (var8 == null) {
                var6 = false;
            } else {
                this.field753.field5583.copyPositions(this.field751, this.field802, this.field805, this.field739, 0, 12, this.field804, var8.getAddress());
                if (var7.method992((byte) -96)) {
                    this.field746.field6397 = true;
                    this.field746.field6396 = var7;
                } else {
                    var6 = false;
                }
            }
        }
        if (var2) {
            if (this.field840.field6393 == null) {
                this.field840.field6393 = this.field753.method1901(-21710, this.field850);
            }
            class613 var9 = this.field840.field6393;
            var9.method993(this.field804 * 4, -6696, 4);
            Buffer var10 = var9.method995(true, 1614);
            if (var10 == null) {
                var6 = false;
            } else {
                if ((this.field791 & 0x37) == 0) {
                    short[] var11;
                    byte[] var12;
                    short[] var13;
                    short[] var14;
                    if (this.field781 == null) {
                        var12 = this.field814;
                        var14 = this.field776;
                        var11 = this.field809;
                        var13 = this.field749;
                    } else {
                        var11 = this.field781.field8466;
                        var12 = this.field781.field8473;
                        var13 = this.field781.field8470;
                        var14 = this.field781.field8468;
                    }
                    this.field753.field5583.copyLighting(this.field763, this.field819, this.field769, var13, var14, var11, var12, this.field836, this.field748, this.field853, 0, 4, this.field804, var10.getAddress());
                } else {
                    this.field753.field5583.copyColours(this.field763, this.field819, this.field769, this.field836, this.field853, 0, 4, this.field804, var10.getAddress());
                }
                if (var9.method992((byte) -94)) {
                    this.field840.field6397 = true;
                    this.field840.field6396 = var9;
                } else {
                    var6 = false;
                }
            }
        }
        if (var3) {
            if (this.field826.field6393 == null) {
                this.field826.field6393 = this.field753.method1901(-21710, this.field850);
            }
            class613 var15 = this.field826.field6393;
            var15.method993(this.field804 * 12, -6696, 12);
            Buffer var16 = var15.method995(true, 1614);
            if (var16 == null) {
                var6 = false;
            } else {
                short[] var17;
                short[] var18;
                byte[] var19;
                short[] var20;
                if (this.field781 == null) {
                    var19 = this.field814;
                    var20 = this.field749;
                    var18 = this.field809;
                    var17 = this.field776;
                } else {
                    var17 = this.field781.field8468;
                    var18 = this.field781.field8466;
                    var19 = this.field781.field8473;
                    var20 = this.field781.field8470;
                }
                this.field753.field5583.copyNormals(var20, var17, var18, var19, 3.0F / (float) this.field748, 3.0F / (float) (this.field748 / 2 + this.field748), 0, 12, this.field804, var16.getAddress());
                if (var15.method992((byte) -59)) {
                    this.field826.field6396 = var15;
                    this.field826.field6397 = true;
                } else {
                    var6 = false;
                }
            }
        }
        if (var5) {
            if (this.field792.field6393 == null) {
                this.field792.field6393 = this.field753.method1901(-21710, this.field850);
            }
            class613 var21 = this.field792.field6393;
            var21.method993(this.field804 * 8, -6696, 8);
            Buffer var22 = var21.method995(true, 1614);
            if (var22 == null) {
                var6 = false;
            } else {
                this.field753.field5583.copyTexCoords(this.field794, this.field830, 0, 8, this.field804, var22.getAddress());
                if (var21.method992((byte) -125)) {
                    this.field792.field6397 = true;
                    this.field792.field6396 = var21;
                } else {
                    var6 = false;
                }
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!dm", name = "S", descriptor = "(Lha;)Lha;")
    public final class54 method519(class54 arg0) {
        field778++;
        if (this.field804 == 0) {
            return null;
        }
        if (!this.field837) {
            this.method520(-1);
        }
        int var2;
        int var3;
        if (this.field753.field5642 <= 0) {
            var2 = this.field757 - (this.field753.field5642 * this.field790 >> 8) >> this.field753.field5682;
            var3 = this.field742 - (this.field753.field5642 * this.field838 >> 8) >> this.field753.field5682;
        } else {
            var2 = this.field757 - (this.field753.field5642 * this.field838 >> 8) >> this.field753.field5682;
            var3 = this.field742 - (this.field753.field5642 * this.field790 >> 8) >> this.field753.field5682;
        }
        int var4;
        int var5;
        if (this.field753.field5689 > 0) {
            var4 = this.field755 - (this.field753.field5689 * this.field838 >> 8) >> this.field753.field5682;
            var5 = this.field844 - (this.field753.field5689 * this.field790 >> 8) >> this.field753.field5682;
        } else {
            var4 = this.field755 - (this.field753.field5689 * this.field790 >> 8) >> this.field753.field5682;
            var5 = this.field844 - (this.field753.field5689 * this.field838 >> 8) >> this.field753.field5682;
        }
        int var6 = var3 - (var2 - 1);
        int var7 = var5 + 1 - var4;
        class348 var8 = (class348) arg0;
        class348 var9;
        if (var8 != null && var8.method2151(var7, var6, -103)) {
            var9 = var8;
            var8.method2152((byte) -101);
        } else {
            var9 = new class348(this.field753, var6, var7);
        }
        var9.method2147(var4, var2, -119, var3, var5);
        this.method542(false, var9);
        return var9;
    }

    @OriginalMember(owner = "client!dm", name = "d", descriptor = "(I)V")
    private final void method520(int arg0) {
        field832++;
        int var2 = 32767;
        int var3 = 32767;
        int var4 = 32767;
        int var5 = -32768;
        int var6 = -32768;
        int var7 = -32768;
        int var8 = 0;
        if (arg0 != -1) {
            this.method523(-12, -8, null, null, -64, 84, -66);
        }
        int var9 = 0;
        for (int var10 = 0; var10 < this.field780; var10++) {
            int var11 = this.field751[var10];
            int var12 = this.field802[var10];
            if (var2 > var11) {
                var2 = var11;
            }
            if (var6 < var12) {
                var6 = var12;
            }
            if (var3 > var12) {
                var3 = var12;
            }
            if (var11 > var5) {
                var5 = var11;
            }
            int var13 = this.field805[var10];
            if (var13 > var7) {
                var7 = var13;
            }
            if (var4 > var13) {
                var4 = var13;
            }
            int var14 = var11 * var11 + (var13 * var13);
            if (var14 > var8) {
                var8 = var14;
            }
            int var15 = var12 * var12 + var11 * var11 + var13 * var13;
            if (var15 > var9) {
                var9 = var15;
            }
        }
        this.field838 = var6;
        this.field757 = var2;
        this.field844 = var7;
        this.field755 = var4;
        this.field790 = var3;
        this.field742 = var5;
        this.field852 = (int) (Math.sqrt((double) var8) + 0.99D);
        this.field777 = (int) (Math.sqrt((double) var9) + 0.99D);
        this.field837 = true;
    }

    @OriginalMember(owner = "client!dm", name = "e", descriptor = "(I)V")
    private final void method521(int arg0) {
        if ((arg0 & this.field791) == 0) {
            if (this.field840 != null) {
                this.field840.field6397 = false;
            }
        } else if (this.field826 != null) {
            this.field826.field6397 = false;
        }
        field773++;
    }

    @OriginalMember(owner = "client!dm", name = "MA", descriptor = "(I)V")
    public final void method522(int arg0) {
        field798++;
        int var2 = class189.field2719[arg0];
        int var3 = class189.field2721[arg0];
        for (int var4 = 0; var4 < this.field780; var4++) {
            int var5 = this.field802[var4] * var3 - this.field805[var4] * var2 >> 14;
            this.field805[var4] = this.field802[var4] * var2 + (this.field805[var4] * var3) >> 14;
            this.field802[var4] = var5;
        }
        this.method543(true);
        this.field837 = false;
    }

    @OriginalMember(owner = "client!dm", name = "ba", descriptor = "(IILi;Li;III)V")
    public final void method523(int arg0, int arg1, class37 arg2, class37 arg3, int arg4, int arg5, int arg6) {
        field845++;
        if (!this.field837) {
            this.method520(-1);
        }
        int var8 = this.field757 + arg4;
        int var9 = this.field742 + arg4;
        int var10 = this.field755 + arg6;
        int var11 = arg6 + this.field844;
        if (arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5 && var8 < 0 || arg2.field631 <= (arg2.field629 + var9 >> arg2.field625) || var10 < 0 || arg2.field632 <= (arg2.field629 + var11 >> arg2.field625)) {
            return;
        }
        if (arg0 == 4 || arg0 == 5) {
            if (arg3 == null) {
                return;
            }
            if (var8 < 0 || arg3.field631 <= (arg3.field629 + var9 >> arg3.field625) || var10 < 0 || arg3.field632 <= arg3.field629 + var11 >> arg3.field625) {
                return;
            }
        } else {
            int var12 = var8 >> arg2.field625;
            int var13 = arg2.field629 + var9 - 1 >> arg2.field625;
            int var14 = var10 >> arg2.field625;
            int var15 = arg2.field629 + var11 - 1 >> arg2.field625;
            if (arg5 == arg2.method432(var12, false, var14) && arg5 == arg2.method432(var13, false, var14) && arg5 == arg2.method432(var12, false, var15) && arg5 == arg2.method432(var13, false, var15)) {
                return;
            }
        }
        if (arg0 == 1) {
            for (int var16 = 0; var16 < this.field780; var16++) {
                this.field802[var16] = (this.field802[var16] + arg2.method442(this.field751[var16] + arg4, true, this.field805[var16] + arg6)) - arg5;
            }
        } else if (arg0 == 2) {
            int var17 = this.field790;
            if (var17 == 0) {
                return;
            }
            for (int var18 = 0; var18 < this.field780; var18++) {
                int var19 = (this.field802[var18] << 16) / var17;
                if (var19 < arg1) {
                    this.field802[var18] += (arg2.method442(this.field751[var18] + arg4, true, this.field805[var18] + arg6) - arg5) * (arg1 - var19) / arg1;
                }
            }
        } else if (arg0 == 3) {
            int var29 = (arg1 & 0xFF) * 4;
            int var30 = ((arg1 & 0xFF56) >> 8) * 4;
            int var31 = (arg1 >> 16 & 0xFF) << 6;
            int var32 = (arg1 >> 24 & 0xFF) << 6;
            if (arg4 - (var29 >> 1) < 0 || ((var29 >> 1) + arg2.field629 + arg4) >= (arg2.field631 << arg2.field625) || (arg6 - (var30 >> 1)) < 0 || (arg2.field632 << arg2.field625) <= ((var30 >> 1) + arg6 + arg2.field629)) {
                return;
            }
            this.method601(var29, var30, false, var31, arg4, arg5, arg2, var32, arg6);
        } else if (arg0 == 4) {
            int var27 = this.field838 - this.field790;
            for (int var28 = 0; var28 < this.field780; var28++) {
                this.field802[var28] = this.field802[var28] + var27 + arg3.method442(this.field751[var28] + arg4, true, this.field805[var28] + arg6) - arg5;
            }
        } else if (arg0 == 5) {
            int var20 = this.field838 - this.field790;
            for (int var21 = 0; var21 < this.field780; var21++) {
                int var22 = this.field751[var21] + arg4;
                int var23 = this.field805[var21] + arg6;
                int var24 = arg2.method442(var22, true, var23);
                int var25 = arg3.method442(var22, true, var23);
                int var26 = var24 - arg1 - var25;
                this.field802[var21] = ((this.field802[var21] << 8) / var20 * var26 >> 8) + var24 - arg5;
            }
        }
        this.method543(true);
        this.field837 = false;
    }

    @OriginalMember(owner = "client!dm", name = "za", descriptor = "()I")
    public final int method524() {
        if (!this.field837) {
            this.method520(-1);
        }
        field823++;
        return this.field844;
    }

    @OriginalMember(owner = "client!dm", name = "RA", descriptor = "()I")
    public final int method525() {
        if (!this.field837) {
            this.method520(-1);
        }
        field765++;
        return this.field777;
    }

    @OriginalMember(owner = "client!dm", name = "f", descriptor = "(I)V")
    private final void method526(int arg0) {
        field764++;
        if (this.field840 != null) {
            this.field840.field6397 = false;
        }
        if (arg0 != -7) {
            this.method524();
        }
    }

    @OriginalMember(owner = "client!dm", name = "DA", descriptor = "(SS)V")
    public final void method527(short arg0, short arg1) {
        field775++;
        class209 var3 = this.field753.field2384;
        for (int var4 = 0; var4 < this.field750; var4++) {
            if (this.field769[var4] == arg0) {
                this.field769[var4] = arg1;
            }
        }
        byte var5 = 0;
        byte var6 = 0;
        if (arg0 != -1) {
            class159 var7 = var3.method1386(arg0 & 0xFFFF, -6514);
            var5 = var7.field2292;
            var6 = var7.field2297;
        }
        byte var8 = 0;
        byte var9 = 0;
        if (arg1 != -1) {
            class159 var10 = var3.method1386(arg1 & 0xFFFF, -6514);
            var8 = var10.field2292;
            var9 = var10.field2297;
        }
        if (!var6 != var9 | var5 != var8) {
            return;
        }
        if (this.field741 != null) {
            for (int var11 = 0; var11 < this.field744; var11++) {
                class23 var12 = this.field741[var11];
                class226 var13 = this.field834[var11];
                var13.field3170 = class437.field6386[this.field763[var12.field305] & 0xFFFF] & 0xFFFFFF | var13.field3170 & 0xFF000000;
            }
        }
        this.method526(-7);
    }

    @OriginalMember(owner = "client!dm", name = "g", descriptor = "(I)V")
    private final void method528(int arg0) {
        field813++;
        if (!this.field831) {
            return;
        }
        this.field831 = false;
        if (this.field856 == null && this.field733 == null && this.field741 == null) {
            if (this.field751 != null && !class499.method2887(458752, this.field791, this.field785)) {
                if (this.field746 == null || this.field746.method2602(2)) {
                    if (!this.field837) {
                        this.method520(arg0 ^ 0x37E4);
                    }
                    this.field751 = null;
                } else {
                    this.field831 = true;
                }
            }
            if (this.field802 != null && !class70.method683(this.field791, true, this.field785)) {
                if (this.field746 == null || this.field746.method2602(2)) {
                    if (!this.field837) {
                        this.method520(-1);
                    }
                    this.field802 = null;
                } else {
                    this.field831 = true;
                }
            }
            if (this.field805 != null && !class210.method1390(this.field791, this.field785, -96)) {
                if (this.field746 == null || this.field746.method2602(2)) {
                    if (!this.field837) {
                        this.method520(arg0 ^ 0x37E4);
                    }
                    this.field805 = null;
                } else {
                    this.field831 = true;
                }
            }
        }
        if (this.field827 != null && this.field751 == null && this.field802 == null && this.field805 == null) {
            this.field851 = null;
            this.field827 = null;
        }
        if (this.field814 != null && !class623.method3460(this.field785, this.field791, (byte) -128)) {
            label204: {
                label203: {
                    boolean var10000;
                    if ((this.field791 & 0x37) == 0) {
                        if (this.field840 == null || this.field840.method2602(2)) {
                            break label203;
                        }
                        var10000 = false;
                    } else {
                        if (this.field826 == null || this.field826.method2602(2)) {
                            break label203;
                        }
                        var10000 = false;
                    }
                    if (!var10000) {
                        this.field831 = true;
                        break label204;
                    }
                }
                this.field814 = null;
                this.field749 = this.field776 = this.field809 = null;
            }
        }
        if (this.field763 != null && !class272.method1795(this.field785, (byte) 112, this.field791)) {
            if (this.field840 == null || this.field840.method2602(2)) {
                this.field763 = null;
            } else {
                this.field831 = true;
            }
        }
        if (this.field819 != null && !class452.method2675((byte) -115, this.field791, this.field785)) {
            if (this.field840 == null || this.field840.method2602(2)) {
                this.field819 = null;
            } else {
                this.field831 = true;
            }
        }
        if (this.field794 != null && !class503.method2896(this.field785, this.field791, -76)) {
            if (this.field792 == null || this.field792.method2602(2)) {
                this.field794 = this.field830 = null;
            } else {
                this.field831 = true;
            }
        }
        if (this.field769 != null && !class33.method372(this.field785, this.field791, -67)) {
            if (this.field840 == null || this.field840.method2602(2)) {
                this.field769 = null;
            } else {
                this.field831 = true;
            }
        }
        if (this.field818 != null && !class244.method1652(this.field785, 76, this.field791)) {
            if ((this.field779 == null || this.field779.method3013(false)) && (this.field840 == null || this.field840.method2602(arg0 + 14311))) {
                this.field818 = this.field771 = this.field824 = null;
            } else {
                this.field831 = true;
            }
        }
        if (this.field739 != null) {
            if (this.field746 == null || this.field746.method2602(2)) {
                this.field739 = null;
            } else {
                this.field831 = true;
            }
        }
        if (this.field853 != null) {
            if (this.field840 == null || this.field840.method2602(2)) {
                this.field853 = null;
            } else {
                this.field831 = true;
            }
        }
        if (this.field829 != null && !class499.method2889((byte) 125, this.field791, this.field785)) {
            this.field737 = null;
            this.field829 = null;
        }
        if (this.field821 != null && !class179.method1214(this.field785, this.field791, 114)) {
            this.field747 = null;
            this.field821 = null;
        }
        if (this.field740 != null && !class360.method2197(false, this.field785, this.field791)) {
            this.field740 = null;
        }
        if (this.field783 != null && (this.field785 & 0x800) == 0 && (this.field785 & 0x40000) == 0) {
            this.field783 = null;
            this.field855 = null;
            this.field842 = null;
        }
        if (arg0 != -14309) {
            this.method510();
        }
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(IILq;Z)Z")
    public final boolean method529(int arg0, int arg1, class391 arg2, boolean arg3) {
        field820++;
        return this.method498(arg1, arg0, arg2, (byte) -23, arg3, -1);
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "()V")
    public final void method530() {
        field734++;
        if (this.field804 > 0 && this.field752 > 0) {
            this.method518(false);
            this.method489((byte) -27);
            this.method528(-14309);
        }
    }

    @OriginalMember(owner = "client!dm", name = "OA", descriptor = "()I")
    public final int method531() {
        if (!this.field837) {
            this.method520(-1);
        }
        field738++;
        return this.field755;
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(BIZ)Lda;")
    public final class55 method532(byte arg0, int arg1, boolean arg2) {
        field808++;
        class48 var4;
        class48 var5;
        if (arg0 == 1) {
            var4 = this.field753.field5749;
            var5 = this.field753.field5747;
        } else if (arg0 == 2) {
            var5 = this.field753.field5746;
            var4 = this.field753.field5739;
        } else if (arg0 == 3) {
            var5 = this.field753.field5737;
            var4 = this.field753.field5748;
        } else if (arg0 == 4) {
            var4 = this.field753.field5751;
            var5 = this.field753.field5752;
        } else if (arg0 == 5) {
            var4 = this.field753.field5755;
            var5 = this.field753.field5741;
        } else {
            var5 = var4 = new class48(this.field753, 0, 0, true, false);
        }
        return this.method505(true, arg0 != 0, var4, arg1, arg2, var5);
    }

    @OriginalMember(owner = "client!dm", name = "T", descriptor = "(I)V")
    public final void method533(int arg0) {
        field843++;
        this.field836 = (short) arg0;
        this.method526(-7);
    }

    @OriginalMember(owner = "client!dm", name = "H", descriptor = "()I")
    public final int method534() {
        field848++;
        if (!this.field837) {
            this.method520(-1);
        }
        return this.field838;
    }

    @OriginalMember(owner = "client!dm", name = "e", descriptor = "()V")
    public final void method535() {
        field768++;
    }

    @OriginalMember(owner = "client!dm", name = "SA", descriptor = "(I)V")
    public final void method536(int arg0) {
        field788++;
        if (this.field746 != null) {
            this.field746.field6394 = class309.method1966(arg0, -8614, this.field791);
        }
        if (this.field792 != null) {
            this.field792.field6394 = class575.method3258(-5, this.field791, arg0);
        }
        if (this.field840 != null) {
            this.field840.field6394 = class328.method2064(this.field791, arg0, 128);
        }
        if (this.field826 != null) {
            this.field826.field6394 = class399.method2443(this.field791, arg0, 112);
        }
        this.field785 = arg0;
        this.field831 = true;
        if (this.field781 != null && (this.field785 & 0x10000) == 0) {
            this.field749 = this.field781.field8470;
            this.field809 = this.field781.field8466;
            this.field776 = this.field781.field8468;
            this.field814 = this.field781.field8473;
            this.field781 = null;
        }
        this.method528(-14309);
    }

    @OriginalMember(owner = "client!dm", name = "c", descriptor = "(B)V")
    private final void method537(byte arg0) {
        if (this.field741 != null) {
            this.field753.method178(false);
            this.field753.method2318((byte) -24, false);
            this.field753.method2324(1, class124.field1869, 1);
            this.field753.method2360(1, class124.field1869, 1);
            for (int var2 = 0; var2 < this.field744; var2++) {
                class23 var3 = this.field741[var2];
                class226 var4 = this.field834[var2];
                if (!var3.field322 || !this.field753.method127()) {
                    float var5 = (float) (this.field751[var3.field307] + this.field751[var3.field304] + this.field751[var3.field302]) * 0.3333333F;
                    float var6 = (float) (this.field802[var3.field304] + this.field802[var3.field302] + this.field802[var3.field307]) * 0.3333333F;
                    float var7 = (float) (this.field805[var3.field304] + this.field805[var3.field307] + this.field805[var3.field302]) * 0.3333333F;
                    float var8 = class315.field4668 * var7 + class586.field8210 * var5 + class57.field1100 * var6 + class647.field9093;
                    float var9 = class363.field5186 * var7 + class615.field8583 * var5 + class481.field6820 * var6 + class640.field9038;
                    float var10 = class140.field2072 * var7 + class408.field5963 * var5 + class247.field3829 * var6 + class491.field6984;
                    class21 var11 = this.field753.method2336(false);
                    var11.method267((float) var4.field3173 + var9, var3.field311 * var4.field3179 >> 7, var10 - (float) var3.field309, var4.field3172, var3.field303 * var4.field3176 >> 7, 0, (float) var4.field3171 + var8);
                    var11.method269((byte) -36, this.field753.field5631);
                    this.field753.method2340(false);
                    int var12 = var4.field3170;
                    this.field753.method2389(false, false, var3.field320, false);
                    this.field753.method2326(true, var3.field315);
                    this.field753.method2321(var12, 24);
                    this.field753.method2311((byte) -127);
                }
            }
            this.field753.method2360(1, class319.field4696, 1);
            this.field753.method2324(1, class319.field4696, 1);
            this.field753.method178(true);
        }
        field810++;
        if (arg0 <= 101) {
            this.field752 = 74;
        }
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(Lq;)V")
    public final void method538(class391 arg0) {
        field735++;
        class21 var2 = (class21) arg0;
        if (this.field856 != null) {
            for (int var3 = 0; var3 < this.field856.length; var3++) {
                class568 var4 = this.field856[var3];
                class568 var5 = var4;
                if (var4.field7989 != null) {
                    var5 = var4.field7989;
                }
                var5.field7983 = (int) ((float) this.field805[var4.field7999] * var2.field256 + (float) this.field802[var4.field7999] * var2.field247 + (float) this.field751[var4.field7999] * var2.field259 + var2.field245);
                var5.field8002 = (int) ((float) this.field805[var4.field7999] * var2.field289 + (float) this.field802[var4.field7999] * var2.field291 + (float) this.field751[var4.field7999] * var2.field271 + var2.field293);
                var5.field7994 = (int) ((float) this.field805[var4.field7999] * var2.field272 + (float) this.field802[var4.field7999] * var2.field243 + (float) this.field751[var4.field7999] * var2.field246 + var2.field257);
                var5.field7993 = (int) ((float) this.field805[var4.field8000] * var2.field256 + (float) this.field802[var4.field8000] * var2.field247 + (float) this.field751[var4.field8000] * var2.field259 + var2.field245);
                var5.field7991 = (int) ((float) this.field805[var4.field8000] * var2.field289 + (float) this.field802[var4.field8000] * var2.field291 + (float) this.field751[var4.field8000] * var2.field271 + var2.field293);
                var5.field7992 = (int) ((float) this.field805[var4.field8000] * var2.field272 + (float) this.field802[var4.field8000] * var2.field243 + (float) this.field751[var4.field8000] * var2.field246 + var2.field257);
                var5.field8004 = (int) ((float) this.field805[var4.field8001] * var2.field256 + (float) this.field802[var4.field8001] * var2.field247 + (float) this.field751[var4.field8001] * var2.field259 + var2.field245);
                var5.field7996 = (int) ((float) this.field805[var4.field8001] * var2.field289 + (float) this.field802[var4.field8001] * var2.field291 + (float) this.field751[var4.field8001] * var2.field271 + var2.field293);
                var5.field8003 = (int) ((float) this.field805[var4.field8001] * var2.field272 + (float) this.field802[var4.field8001] * var2.field243 + (float) this.field751[var4.field8001] * var2.field246 + var2.field257);
            }
        }
        if (this.field733 == null) {
            return;
        }
        for (int var6 = 0; var6 < this.field733.length; var6++) {
            class77 var7 = this.field733[var6];
            class77 var8 = var7;
            if (var7.field1323 != null) {
                var8 = var7.field1323;
            }
            if (var7.field1332 == null) {
                var7.field1332 = var2.method251();
            } else {
                var7.field1332.method274(var2);
            }
            var8.field1327 = (int) ((float) this.field805[var7.field1333] * var2.field256 + (float) this.field802[var7.field1333] * var2.field247 + (float) this.field751[var7.field1333] * var2.field259 + var2.field245);
            var8.field1330 = (int) ((float) this.field805[var7.field1333] * var2.field289 + (float) this.field802[var7.field1333] * var2.field291 + (float) this.field751[var7.field1333] * var2.field271 + var2.field293);
            var8.field1334 = (int) ((float) this.field805[var7.field1333] * var2.field272 + (float) this.field802[var7.field1333] * var2.field243 + (float) this.field751[var7.field1333] * var2.field246 + var2.field257);
        }
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(Lda;IIIZ)V")
    public final void method539(class55 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field756++;
        class48 var6 = (class48) arg0;
        if (this.field750 == 0 || var6.field750 == 0) {
            return;
        }
        int var7 = var6.field780;
        int[] var8 = var6.field751;
        int[] var9 = var6.field802;
        int[] var10 = var6.field805;
        short[] var11 = var6.field749;
        short[] var12 = var6.field776;
        short[] var13 = var6.field809;
        byte[] var14 = var6.field814;
        short[] var15;
        short[] var16;
        byte[] var17;
        short[] var18;
        if (this.field781 == null) {
            var15 = null;
            var16 = null;
            var17 = null;
            var18 = null;
        } else {
            var15 = this.field781.field8468;
            var16 = this.field781.field8470;
            var17 = this.field781.field8473;
            var18 = this.field781.field8466;
        }
        short[] var19;
        short[] var20;
        short[] var21;
        byte[] var22;
        if (var6.field781 == null) {
            var21 = null;
            var22 = null;
            var19 = null;
            var20 = null;
        } else {
            var19 = var6.field781.field8468;
            var20 = var6.field781.field8470;
            var21 = var6.field781.field8466;
            var22 = var6.field781.field8473;
        }
        int[] var23 = var6.field851;
        short[] var24 = var6.field827;
        if (!var6.field837) {
            var6.method520(-1);
        }
        int var25 = var6.field790;
        int var26 = var6.field838;
        int var27 = var6.field757;
        int var28 = var6.field742;
        int var29 = var6.field755;
        int var30 = var6.field844;
        for (int var31 = 0; var31 < this.field780; var31++) {
            int var32 = this.field802[var31] - arg2;
            if (var32 >= var25 && var26 >= var32) {
                int var33 = this.field751[var31] - arg1;
                if (var33 >= var27 && var33 <= var28) {
                    int var34 = this.field805[var31] - arg3;
                    if (var29 <= var34 && var30 >= var34) {
                        int var35 = -1;
                        int var36 = this.field851[var31];
                        int var37 = this.field851[var31 + 1];
                        for (int var38 = var36; var38 < var37; var38++) {
                            var35 = this.field827[var38] - 1;
                            if (var35 == -1 || this.field814[var35] != 0) {
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
                                            this.field781 = new class599();
                                            var16 = this.field781.field8470 = class224.method1482((byte) 47, this.field749);
                                            var15 = this.field781.field8468 = class224.method1482((byte) 47, this.field776);
                                            var18 = this.field781.field8466 = class224.method1482((byte) 47, this.field809);
                                            var17 = this.field781.field8473 = class153.method1074(this.field814, -101);
                                        }
                                        if (var20 == null) {
                                            class599 var44 = var6.field781 = new class599();
                                            var20 = var44.field8470 = class224.method1482((byte) 47, var11);
                                            var19 = var44.field8468 = class224.method1482((byte) 47, var12);
                                            var21 = var44.field8466 = class224.method1482((byte) 47, var13);
                                            var22 = var44.field8473 = class153.method1074(var14, -81);
                                        }
                                        short var45 = this.field749[var35];
                                        short var46 = this.field776[var35];
                                        short var47 = this.field809[var35];
                                        int var48 = var23[var39];
                                        int var49 = var23[var39 + 1];
                                        byte var50 = this.field814[var35];
                                        for (int var51 = var48; var51 < var49; var51++) {
                                            int var52 = var24[var51] - 1;
                                            if (var52 == -1) {
                                                break;
                                            }
                                            if (var22[var52] != 0) {
                                                var20[var52] += var45;
                                                var19[var52] += var46;
                                                var21[var52] += var47;
                                                var22[var52] += var50;
                                            }
                                        }
                                        short var53 = var11[var42];
                                        short var54 = var12[var42];
                                        int var55 = this.field851[var31 + 1];
                                        short var56 = var13[var42];
                                        byte var57 = var14[var42];
                                        int var58 = this.field851[var31];
                                        for (int var59 = var58; var59 < var55; var59++) {
                                            int var60 = this.field827[var59] - 1;
                                            if (var60 == -1) {
                                                break;
                                            }
                                            if (var17[var60] != 0) {
                                                var16[var60] += var53;
                                                var15[var60] += var54;
                                                var18[var60] += var56;
                                                var17[var60] += var57;
                                            }
                                        }
                                        var6.method521(55);
                                        this.method521(55);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!dm", name = "M", descriptor = "(I)V")
    public final void method540(int arg0) {
        field782++;
        int var2 = class189.field2719[arg0];
        int var3 = class189.field2721[arg0];
        for (int var4 = 0; var4 < this.field780; var4++) {
            int var5 = this.field805[var4] * var2 + this.field751[var4] * var3 >> 14;
            this.field805[var4] = this.field805[var4] * var3 - (this.field751[var4] * var2) >> 14;
            this.field751[var4] = var5;
        }
        this.method543(true);
        this.field837 = false;
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(IIIIIIZII)Z")
    private final boolean method541(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8) {
        field803++;
        if (arg6) {
            this.field853 = null;
        }
        if (arg3 < arg5 && arg2 > arg3 && arg7 > arg3) {
            return false;
        } else if (arg3 > arg5 && arg2 < arg3 && arg7 < arg3) {
            return false;
        } else if (arg8 < arg1 && arg8 < arg0 && arg4 > arg8) {
            return false;
        } else {
            return arg8 <= arg1 || arg0 >= arg8 || arg8 <= arg4;
        }
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(ZLuj;)V")
    private final void method542(boolean arg0, class348 arg1) {
        field760++;
        if (this.field804 > class290.field4301.length) {
            class290.field4301 = new int[this.field804];
            class377.field5369 = new int[this.field804];
        }
        int var3 = 0;
        if (arg0) {
            this.method518(true);
        }
        while (this.field780 > var3) {
            int var14 = (this.field751[var3] - (this.field802[var3] * this.field753.field5642 >> 8) >> this.field753.field5682) - arg1.field5045;
            int var15 = (this.field805[var3] - (this.field802[var3] * this.field753.field5689 >> 8) >> this.field753.field5682) - arg1.field5049;
            int var16 = this.field851[var3];
            int var17 = this.field851[var3 + 1];
            for (int var18 = var16; var18 < var17; var18++) {
                int var19 = this.field827[var18] - 1;
                if (var19 == -1) {
                    break;
                }
                class290.field4301[var19] = var14;
                class377.field5369[var19] = var15;
            }
            var3++;
        }
        for (int var4 = 0; var4 < this.field752; var4++) {
            if (this.field819 == null || this.field819[var4] <= 128) {
                short var5 = this.field818[var4];
                short var6 = this.field771[var4];
                short var7 = this.field824[var4];
                int var8 = class290.field4301[var5];
                int var9 = class290.field4301[var6];
                int var10 = class290.field4301[var7];
                int var11 = class377.field5369[var5];
                int var12 = class377.field5369[var6];
                int var13 = class377.field5369[var7];
                if (((var8 - var9) * (var12 - var13) - ((var10 - var9) * (var12 - var11))) > 0) {
                    arg1.method2150(108, var10, var8, var12, var9, var13, var11);
                }
            }
        }
    }

    @OriginalMember(owner = "client!dm", name = "c", descriptor = "(Z)V")
    private final void method543(boolean arg0) {
        if (arg0) {
            if (this.field746 != null) {
                this.field746.field6397 = false;
            }
            field761++;
        }
    }

    @OriginalMember(owner = "client!dm", name = "l", descriptor = "()I")
    public final int method544() {
        field793++;
        if (!this.field837) {
            this.method520(-1);
        }
        return this.field742;
    }

    @OriginalMember(owner = "client!dm", name = "LA", descriptor = "()Z")
    public final boolean method545() {
        field828++;
        return this.field801;
    }

    @OriginalMember(owner = "client!dm", name = "fa", descriptor = "(I)V")
    public final void method546(int arg0) {
        field796++;
        int var2 = class189.field2719[arg0];
        int var3 = class189.field2721[arg0];
        for (int var4 = 0; var4 < this.field780; var4++) {
            int var7 = this.field805[var4] * var2 + (this.field751[var4] * var3) >> 14;
            this.field805[var4] = this.field805[var4] * var3 - (this.field751[var4] * var2) >> 14;
            this.field751[var4] = var7;
        }
        for (int var5 = 0; var5 < this.field804; var5++) {
            int var6 = this.field809[var5] * var2 + this.field749[var5] * var3 >> 14;
            this.field809[var5] = (short) (this.field809[var5] * var3 - (this.field749[var5] * var2) >> 14);
            this.field749[var5] = (short) var6;
        }
        this.method543(true);
        this.method521(55);
        this.field837 = false;
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(IIIJILlm;FFIII)S")
    private final short method547(int arg0, int arg1, int arg2, long arg3, int arg4, class461 arg5, float arg6, float arg7, int arg8, int arg9, int arg10) {
        field767++;
        int var13 = this.field851[arg2];
        int var14 = this.field851[arg2 + 1];
        int var15 = arg9;
        for (int var16 = var13; var16 < var14; var16++) {
            short var17 = this.field827[var16];
            if (var17 == 0) {
                var15 = var16;
                break;
            }
            if (class385.field5421[var16] == arg3) {
                return (short) (var17 - 1);
            }
        }
        this.field827[var15] = (short) (this.field804 + 1);
        class385.field5421[var15] = arg3;
        this.field853[this.field804] = (short) arg8;
        this.field739[this.field804] = (short) arg2;
        this.field749[this.field804] = (short) arg4;
        this.field776[this.field804] = (short) arg10;
        this.field809[this.field804] = (short) arg1;
        this.field814[this.field804] = (byte) arg0;
        this.field794[this.field804] = arg7;
        this.field830[this.field804] = arg6;
        return (short) (this.field804++);
    }

    @OriginalMember(owner = "client!dm", name = "oa", descriptor = "(III)V")
    public final void method548(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field780; var4++) {
            if (arg0 != 0) {
                this.field751[var4] += arg0;
            }
            if (arg1 != 0) {
                this.field802[var4] += arg1;
            }
            if (arg2 != 0) {
                this.field805[var4] += arg2;
            }
        }
        field846++;
        this.method543(true);
        this.field837 = false;
    }

    @OriginalMember(owner = "client!dm", name = "B", descriptor = "(I[IIIIZI[I)V")
    public final void method549(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7) {
        field812++;
        int var9 = arg1.length;
        if (arg0 == 0) {
            int var10 = arg3 << 4;
            int var11 = arg2 << 4;
            int var12 = arg4 << 4;
            class553.field7843 = 0;
            class256.field3924 = 0;
            int var13 = 0;
            class674.field9528 = 0;
            for (int var14 = 0; var14 < var9; var14++) {
                int var15 = arg1[var14];
                if (var15 < this.field821.length) {
                    int[] var16 = this.field821[var15];
                    for (int var17 = 0; var17 < var16.length; var17++) {
                        int var18 = var16[var17];
                        if (this.field747 == null || (this.field747[var18] & arg6) != 0) {
                            class674.field9528 += this.field751[var18];
                            class553.field7843 += this.field802[var18];
                            class256.field3924 += this.field805[var18];
                            var13++;
                        }
                    }
                }
            }
            if (var13 > 0) {
                class674.field9528 = class674.field9528 / var13 + var11;
                class553.field7843 = class553.field7843 / var13 + var10;
                class657.field9211 = true;
                class256.field3924 = class256.field3924 / var13 + var12;
            } else {
                class674.field9528 = var11;
                class256.field3924 = var12;
                class553.field7843 = var10;
            }
        } else if (arg0 == 1) {
            if (arg7 != null) {
                int var19 = arg7[2] * arg4 + arg7[0] * arg2 + arg7[1] * arg3 + 8192 >> 14;
                int var20 = arg7[5] * arg4 + arg7[3] * arg2 + (arg7[4] * arg3) + 8192 >> 14;
                int var21 = arg7[8] * arg4 + arg7[7] * arg3 + arg7[6] * arg2 + 8192 >> 14;
                arg2 = var19;
                arg3 = var20;
                arg4 = var21;
            }
            int var22 = arg4 << 4;
            int var23 = arg2 << 4;
            int var24 = arg3 << 4;
            for (int var25 = 0; var25 < var9; var25++) {
                int var26 = arg1[var25];
                if (var26 < this.field821.length) {
                    int[] var27 = this.field821[var26];
                    for (int var28 = 0; var28 < var27.length; var28++) {
                        int var29 = var27[var28];
                        if (this.field747 == null || (arg6 & this.field747[var29]) != 0) {
                            this.field751[var29] += var23;
                            this.field802[var29] += var24;
                            this.field805[var29] += var22;
                        }
                    }
                }
            }
        } else if (arg0 == 2) {
            if (arg7 == null) {
                for (int var30 = 0; var30 < var9; var30++) {
                    int var49 = arg1[var30];
                    if (this.field821.length > var49) {
                        int[] var50 = this.field821[var49];
                        for (int var51 = 0; var51 < var50.length; var51++) {
                            int var52 = var50[var51];
                            if (this.field747 == null || (this.field747[var52] & arg6) != 0) {
                                this.field751[var52] -= class674.field9528;
                                this.field802[var52] -= class553.field7843;
                                this.field805[var52] -= class256.field3924;
                                if (arg4 != 0) {
                                    int var53 = class189.field2719[arg4];
                                    int var54 = class189.field2721[arg4];
                                    int var55 = this.field802[var52] * var53 + this.field751[var52] * var54 + 16383 >> 14;
                                    this.field802[var52] = this.field802[var52] * var54 + 16383 - this.field751[var52] * var53 >> 14;
                                    this.field751[var52] = var55;
                                }
                                if (arg2 != 0) {
                                    int var56 = class189.field2719[arg2];
                                    int var57 = class189.field2721[arg2];
                                    int var58 = this.field802[var52] * var57 + 16383 - (this.field805[var52] * var56) >> 14;
                                    this.field805[var52] = this.field802[var52] * var56 + this.field805[var52] * var57 + 16383 >> 14;
                                    this.field802[var52] = var58;
                                }
                                if (arg3 != 0) {
                                    int var59 = class189.field2719[arg3];
                                    int var60 = class189.field2721[arg3];
                                    int var61 = this.field805[var52] * var59 + this.field751[var52] * var60 + 16383 >> 14;
                                    this.field805[var52] = this.field805[var52] * var60 + 16383 - (this.field751[var52] * var59) >> 14;
                                    this.field751[var52] = var61;
                                }
                                this.field751[var52] += class674.field9528;
                                this.field802[var52] += class553.field7843;
                                this.field805[var52] += class256.field3924;
                            }
                        }
                    }
                }
                if (arg5) {
                    for (int var31 = 0; var31 < var9; var31++) {
                        int var32 = arg1[var31];
                        if (this.field821.length > var32) {
                            int[] var33 = this.field821[var32];
                            for (int var34 = 0; var34 < var33.length; var34++) {
                                int var35 = var33[var34];
                                if (this.field747 == null || (arg6 & this.field747[var35]) != 0) {
                                    int var36 = this.field851[var35];
                                    int var37 = this.field851[var35 + 1];
                                    for (int var38 = var36; var38 < var37; var38++) {
                                        int var39 = this.field827[var38] - 1;
                                        if (var39 == -1) {
                                            break;
                                        }
                                        if (arg4 != 0) {
                                            int var40 = class189.field2719[arg4];
                                            int var41 = class189.field2721[arg4];
                                            int var42 = this.field776[var39] * var40 + this.field749[var39] * var41 + 16383 >> 14;
                                            this.field776[var39] = (short) (this.field776[var39] * var41 + 16383 - (this.field749[var39] * var40) >> 14);
                                            this.field749[var39] = (short) var42;
                                        }
                                        if (arg2 != 0) {
                                            int var43 = class189.field2719[arg2];
                                            int var44 = class189.field2721[arg2];
                                            int var45 = this.field776[var39] * var44 + 16383 - (this.field809[var39] * var43) >> 14;
                                            this.field809[var39] = (short) (this.field776[var39] * var43 + this.field809[var39] * var44 + 16383 >> 14);
                                            this.field776[var39] = (short) var45;
                                        }
                                        if (arg3 != 0) {
                                            int var46 = class189.field2719[arg3];
                                            int var47 = class189.field2721[arg3];
                                            int var48 = this.field749[var39] * var47 + (this.field809[var39] * var46 + 16383) >> 14;
                                            this.field809[var39] = (short) (this.field809[var39] * var47 + 16383 - (this.field749[var39] * var46) >> 14);
                                            this.field749[var39] = (short) var48;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    this.method521(55);
                    return;
                }
            } else {
                int var62 = arg7[9] << 4;
                int var63 = arg7[10] << 4;
                int var64 = arg7[11] << 4;
                int var65 = arg7[12] << 4;
                int var66 = arg7[13] << 4;
                int var67 = arg7[14] << 4;
                if (class657.field9211) {
                    int var68 = arg7[0] * class674.field9528 + (arg7[3] * class553.field7843) - (-(arg7[6] * class256.field3924) - 8192) >> 14;
                    int var69 = arg7[4] * class553.field7843 + (arg7[1] * class674.field9528 + (arg7[7] * class256.field3924)) + 8192 >> 14;
                    int var70 = arg7[8] * class256.field3924 + arg7[5] * class553.field7843 + arg7[2] * class674.field9528 + 8192 >> 14;
                    int var71 = var65 + var68;
                    int var72 = var66 + var69;
                    int var73 = var67 + var70;
                    class674.field9528 = var71;
                    class553.field7843 = var72;
                    class657.field9211 = false;
                    class256.field3924 = var73;
                }
                int[] var74 = new int[9];
                int var75 = class189.field2721[arg2];
                int var76 = class189.field2719[arg2];
                int var77 = class189.field2721[arg3];
                int var78 = class189.field2719[arg3];
                int var79 = class189.field2721[arg4];
                int var80 = class189.field2719[arg4];
                int var81 = var76 * var79 + 8192 >> 14;
                int var82 = var76 * var80 + 8192 >> 14;
                var74[1] = -var77 * var80 + var78 * var81 + 8192 >> 14;
                var74[8] = var75 * var77 + 8192 >> 14;
                var74[5] = -var76;
                var74[7] = var78 * var80 + var77 * var81 + 8192 >> 14;
                var74[2] = var75 * var78 + 8192 >> 14;
                var74[4] = var75 * var79 + 8192 >> 14;
                var74[6] = -var78 * var79 + (var77 * var82) + 8192 >> 14;
                var74[0] = var77 * var79 + var78 * var82 + 8192 >> 14;
                var74[3] = var75 * var80 + 8192 >> 14;
                int var83 = var74[2] * -class256.field3924 + var74[1] * -class553.field7843 + var74[0] * -class674.field9528 + 8192 >> 14;
                int var84 = var74[5] * -class256.field3924 + var74[4] * -class553.field7843 + var74[3] * -class674.field9528 + 8192 >> 14;
                int var85 = var74[8] * -class256.field3924 + var74[7] * -class553.field7843 + (var74[6] * -class674.field9528 - -8192) >> 14;
                int var86 = class674.field9528 + var83;
                int var87 = class553.field7843 + var84;
                int var88 = class256.field3924 + var85;
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
                int var91 = var74[2] * var67 + var74[0] * var65 - (-(var74[1] * var66) + -8192) >> 14;
                int var92 = var74[5] * var67 + (var74[3] * var65 + (var74[4] * var66)) + 8192 >> 14;
                int var93 = var74[8] * var67 + var74[6] * var65 + var74[7] * var66 + 8192 >> 14;
                int var94 = var87 + var92;
                int var95 = var86 + var91;
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
                int var99 = arg7[2] * var96 + (arg7[0] * var95 + arg7[1] * var94 + 8192) >> 14;
                int var100 = arg7[4] * var94 + arg7[3] * var95 + arg7[5] * var96 + 8192 >> 14;
                int var101 = var62 + var99;
                int var102 = arg7[8] * var96 + (arg7[6] * var95 + (arg7[7] * var94) + 8192) >> 14;
                int var103 = var63 + var100;
                int var104 = var64 + var102;
                for (int var105 = 0; var105 < var9; var105++) {
                    int var106 = arg1[var105];
                    if (this.field821.length > var106) {
                        int[] var107 = this.field821[var106];
                        for (int var108 = 0; var108 < var107.length; var108++) {
                            int var109 = var107[var108];
                            if (this.field747 == null || (arg6 & this.field747[var109]) != 0) {
                                int var110 = this.field805[var109] * var97[2] + this.field802[var109] * var97[1] + this.field751[var109] * var97[0] + 8192 >> 14;
                                int var111 = this.field805[var109] * var97[5] + this.field802[var109] * var97[4] + this.field751[var109] * var97[3] + 8192 >> 14;
                                int var112 = this.field805[var109] * var97[8] + this.field751[var109] * var97[6] + (this.field802[var109] * var97[7]) + 8192 >> 14;
                                int var113 = var101 + var110;
                                int var114 = var103 + var111;
                                int var115 = var104 + var112;
                                this.field751[var109] = var113;
                                this.field802[var109] = var114;
                                this.field805[var109] = var115;
                            }
                        }
                    }
                }
            }
        } else if (arg0 == 3) {
            if (arg7 == null) {
                for (int var172 = 0; var172 < var9; var172++) {
                    int var173 = arg1[var172];
                    if (this.field821.length > var173) {
                        int[] var174 = this.field821[var173];
                        for (int var175 = 0; var175 < var174.length; var175++) {
                            int var176 = var174[var175];
                            if (this.field747 == null || (arg6 & this.field747[var176]) != 0) {
                                this.field751[var176] -= class674.field9528;
                                this.field802[var176] -= class553.field7843;
                                this.field805[var176] -= class256.field3924;
                                this.field751[var176] = this.field751[var176] * arg2 >> 7;
                                this.field802[var176] = this.field802[var176] * arg3 >> 7;
                                this.field805[var176] = this.field805[var176] * arg4 >> 7;
                                this.field751[var176] += class674.field9528;
                                this.field802[var176] += class553.field7843;
                                this.field805[var176] += class256.field3924;
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
                if (class657.field9211) {
                    int var128 = arg7[0] * class674.field9528 + 8192 - (-(arg7[3] * class553.field7843) - (arg7[6] * class256.field3924)) >> 14;
                    int var129 = arg7[1] * class674.field9528 + 8192 - (-(arg7[4] * class553.field7843) - arg7[7] * class256.field3924) >> 14;
                    int var130 = arg7[8] * class256.field3924 + arg7[2] * class674.field9528 - (-(arg7[5] * class553.field7843) - 8192) >> 14;
                    int var131 = var125 + var128;
                    int var132 = var126 + var129;
                    int var133 = var127 + var130;
                    class674.field9528 = var131;
                    class553.field7843 = var132;
                    class657.field9211 = false;
                    class256.field3924 = var133;
                }
                int var134 = arg2 << 15 >> 7;
                int var135 = arg3 << 15 >> 7;
                int var136 = arg4 << 15 >> 7;
                int var137 = -class674.field9528 * var134 + 8192 >> 14;
                int var138 = -class553.field7843 * var135 + 8192 >> 14;
                int var139 = -class256.field3924 * var136 + 8192 >> 14;
                int var140 = class674.field9528 + var137;
                int var141 = class553.field7843 + var138;
                int var142 = class256.field3924 + var139;
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
                            var170 += arg7[var151 * 3 + var171] * var143[var171 * 3 + var169];
                        }
                        var150[var151 * 3 + var169] = var170 + 8192 >> 14;
                    }
                }
                int var152 = arg7[0] * var148 + arg7[2] * var149 + arg7[1] * var146 + 8192 >> 14;
                int var153 = arg7[4] * var146 + arg7[3] * var148 + (arg7[5] * var149) + 8192 >> 14;
                int var154 = var122 + var152;
                int var155 = var123 + var153;
                int var156 = arg7[6] * var148 + arg7[8] * var149 + (arg7[7] * var146) + 8192 >> 14;
                int var157 = var124 + var156;
                for (int var158 = 0; var158 < var9; var158++) {
                    int var159 = arg1[var158];
                    if (this.field821.length > var159) {
                        int[] var160 = this.field821[var159];
                        for (int var161 = 0; var161 < var160.length; var161++) {
                            int var162 = var160[var161];
                            if (this.field747 == null || (this.field747[var162] & arg6) != 0) {
                                int var163 = this.field751[var162] * var150[0] + this.field805[var162] * var150[2] + (this.field802[var162] * var150[1]) + 8192 >> 14;
                                int var164 = this.field751[var162] * var150[3] + this.field802[var162] * var150[4] + (this.field805[var162] * var150[5]) + 8192 >> 14;
                                int var165 = this.field751[var162] * var150[6] + this.field805[var162] * var150[8] + this.field802[var162] * var150[7] + 8192 >> 14;
                                int var166 = var154 + var163;
                                int var167 = var155 + var164;
                                int var168 = var157 + var165;
                                this.field751[var162] = var166;
                                this.field802[var162] = var167;
                                this.field805[var162] = var168;
                            }
                        }
                    }
                }
            }
        } else if (arg0 == 5) {
            if (this.field829 != null) {
                boolean var177 = false;
                for (int var178 = 0; var178 < var9; var178++) {
                    int var182 = arg1[var178];
                    if (var182 < this.field829.length) {
                        int[] var183 = this.field829[var182];
                        for (int var184 = 0; var184 < var183.length; var184++) {
                            int var185 = var183[var184];
                            if (this.field737 == null || (this.field737[var185] & arg6) != 0) {
                                int var186 = (this.field819[var185] & 0xFF) + arg2 * 8;
                                if (var186 < 0) {
                                    var186 = 0;
                                } else if (var186 > 255) {
                                    var186 = 255;
                                }
                                this.field819[var185] = (byte) var186;
                            }
                        }
                        var177 |= var183.length > 0;
                    }
                }
                if (var177) {
                    if (this.field741 != null) {
                        for (int var179 = 0; var179 < this.field744; var179++) {
                            class23 var180 = this.field741[var179];
                            class226 var181 = this.field834[var179];
                            var181.field3170 = var181.field3170 & 0xFFFFFF | 255 - (this.field819[var180.field305] & 0xFF) << 24;
                        }
                    }
                    this.method526(-7);
                }
            }
        } else if (arg0 == 7) {
            if (this.field829 != null) {
                boolean var187 = false;
                for (int var188 = 0; var188 < var9; var188++) {
                    int var192 = arg1[var188];
                    if (var192 < this.field829.length) {
                        int[] var193 = this.field829[var192];
                        for (int var194 = 0; var194 < var193.length; var194++) {
                            int var195 = var193[var194];
                            if (this.field737 == null || (this.field737[var195] & arg6) != 0) {
                                int var196 = this.field763[var195] & 0xFFFF;
                                int var197 = var196 >> 10 & 0x3F;
                                int var198 = (var196 & 0x3B4) >> 7;
                                int var199 = var196 & 0x7F;
                                int var200 = var197 + arg2 & 0x3F;
                                int var201 = arg3 / 4 + var198;
                                if (var201 < 0) {
                                    var201 = 0;
                                } else if (var201 > 7) {
                                    var201 = 7;
                                }
                                int var202 = arg4 + var199;
                                if (var202 < 0) {
                                    var202 = 0;
                                } else if (var202 > 127) {
                                    var202 = 127;
                                }
                                this.field763[var195] = (short) class486.method2826(class486.method2826(var201 << 7, var200 << 10), var202);
                            }
                        }
                        var187 |= var193.length > 0;
                    }
                }
                if (var187) {
                    if (this.field741 != null) {
                        for (int var189 = 0; var189 < this.field744; var189++) {
                            class23 var190 = this.field741[var189];
                            class226 var191 = this.field834[var189];
                            var191.field3170 = var191.field3170 & 0xFF000000 | class437.field6386[this.field763[var190.field305] & 0xFFFF] & 0xFFFFFF;
                        }
                    }
                    this.method526(-7);
                }
            }
        } else if (arg0 == 8) {
            if (this.field740 != null) {
                for (int var203 = 0; var203 < var9; var203++) {
                    int var204 = arg1[var203];
                    if (var204 < this.field740.length) {
                        int[] var205 = this.field740[var204];
                        for (int var206 = 0; var206 < var205.length; var206++) {
                            class226 var207 = this.field834[var205[var206]];
                            var207.field3173 += arg3;
                            var207.field3171 += arg2;
                        }
                    }
                }
            }
        } else if (arg0 == 10) {
            if (this.field740 != null) {
                for (int var208 = 0; var208 < var9; var208++) {
                    int var209 = arg1[var208];
                    if (var209 < this.field740.length) {
                        int[] var210 = this.field740[var209];
                        for (int var211 = 0; var211 < var210.length; var211++) {
                            class226 var212 = this.field834[var210[var211]];
                            var212.field3176 = var212.field3176 * arg3 >> 7;
                            var212.field3179 = var212.field3179 * arg2 >> 7;
                        }
                    }
                }
            }
        } else if (arg0 == 9 && this.field740 != null) {
            for (int var213 = 0; var213 < var9; var213++) {
                int var214 = arg1[var213];
                if (var214 < this.field740.length) {
                    int[] var215 = this.field740[var214];
                    for (int var216 = 0; var216 < var215.length; var216++) {
                        class226 var217 = this.field834[var215[var216]];
                        var217.field3172 = var217.field3172 + arg2 & 0x3FFF;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!dm", name = "<init>", descriptor = "(Lhea;IIZZ)V")
    public class48(class387 arg0, int arg1, int arg2, boolean arg3, boolean arg4) {
        this.field750 = 0;
        this.field752 = 0;
        this.field780 = 0;
        this.field831 = true;
        this.field801 = false;
        this.field804 = 0;
        this.field807 = 0;
        this.field837 = false;
        this.field850 = false;
        this.field791 = arg2;
        this.field753 = arg0;
        this.field785 = arg1;
        this.field850 = arg4;
        if (arg3 || class203.method1352(this.field791, this.field785, 0)) {
            this.field746 = new class438(class309.method1966(this.field785, -8614, this.field791));
        }
        if (arg3 || class513.method2937(this.field785, this.field791, -1)) {
            this.field792 = new class438(class575.method3258(-5, this.field791, this.field785));
        }
        if (arg3 || class85.method746(this.field785, 80, this.field791)) {
            this.field840 = new class438(class328.method2064(this.field791, this.field785, 128));
        }
        if (arg3 || class321.method2006(this.field791, (byte) 44, this.field785)) {
            this.field826 = new class438(class399.method2443(this.field791, this.field785, 124));
        }
        if (arg3 || class547.method3093(this.field791, this.field785, 0)) {
            this.field779 = new class524(class138.method1001((byte) 85, this.field785, this.field791));
        }
    }
}
