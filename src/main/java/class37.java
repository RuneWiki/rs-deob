import jaclib.memory.Stream;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wv")
public class class37 extends class495 {

    @OriginalMember(owner = "client!wv", name = "L", descriptor = "Z")
    private boolean field534 = false;

    @OriginalMember(owner = "client!wv", name = "mb", descriptor = "Z")
    private boolean field561 = true;

    @OriginalMember(owner = "client!wv", name = "cb", descriptor = "I")
    private int field551 = 0;

    @OriginalMember(owner = "client!wv", name = "Jb", descriptor = "Z")
    private boolean field584 = false;

    @OriginalMember(owner = "client!wv", name = "t", descriptor = "I")
    private int field516 = 0;

    @OriginalMember(owner = "client!wv", name = "bc", descriptor = "I")
    private int field602 = 0;

    @OriginalMember(owner = "client!wv", name = "lb", descriptor = "I")
    private int field560 = 0;

    @OriginalMember(owner = "client!wv", name = "Lb", descriptor = "Z")
    private boolean field586 = false;

    @OriginalMember(owner = "client!wv", name = "Hb", descriptor = "I")
    private int field582 = 0;

    @OriginalMember(owner = "client!wv", name = "Dc", descriptor = "Lkv;")
    private class280 field630;

    @OriginalMember(owner = "client!wv", name = "ec", descriptor = "Lkb;")
    private class717 field605;

    @OriginalMember(owner = "client!wv", name = "rb", descriptor = "Lkb;")
    private class717 field566;

    @OriginalMember(owner = "client!wv", name = "Yb", descriptor = "Lkb;")
    private class717 field599;

    @OriginalMember(owner = "client!wv", name = "Ac", descriptor = "Lkb;")
    private class717 field627;

    @OriginalMember(owner = "client!wv", name = "qc", descriptor = "Lsd;")
    private class102 field617;

    @OriginalMember(owner = "client!wv", name = "cc", descriptor = "I")
    private int field603;

    @OriginalMember(owner = "client!wv", name = "w", descriptor = "I")
    private int field519;

    @OriginalMember(owner = "client!wv", name = "tc", descriptor = "[I")
    private int[] field620;

    @OriginalMember(owner = "client!wv", name = "eb", descriptor = "[I")
    private int[] field553;

    @OriginalMember(owner = "client!wv", name = "Eb", descriptor = "[S")
    private short[] field579;

    @OriginalMember(owner = "client!wv", name = "Fb", descriptor = "[I")
    private int[] field580;

    @OriginalMember(owner = "client!wv", name = "K", descriptor = "[I")
    private int[] field533;

    @OriginalMember(owner = "client!wv", name = "wc", descriptor = "[Lrf;")
    private class92[] field623;

    @OriginalMember(owner = "client!wv", name = "r", descriptor = "[Lnha;")
    private class338[] field514;

    @OriginalMember(owner = "client!wv", name = "yb", descriptor = "I")
    private int field573;

    @OriginalMember(owner = "client!wv", name = "x", descriptor = "[Lav;")
    private class664[] field520;

    @OriginalMember(owner = "client!wv", name = "qb", descriptor = "[Lhba;")
    private class10[] field565;

    @OriginalMember(owner = "client!wv", name = "Nb", descriptor = "[S")
    private short[] field588;

    @OriginalMember(owner = "client!wv", name = "Ob", descriptor = "[S")
    private short[] field589;

    @OriginalMember(owner = "client!wv", name = "kb", descriptor = "[S")
    private short[] field559;

    @OriginalMember(owner = "client!wv", name = "T", descriptor = "[F")
    private float[] field542;

    @OriginalMember(owner = "client!wv", name = "sb", descriptor = "[S")
    private short[] field567;

    @OriginalMember(owner = "client!wv", name = "zc", descriptor = "[S")
    private short[] field626;

    @OriginalMember(owner = "client!wv", name = "B", descriptor = "S")
    private short field524;

    @OriginalMember(owner = "client!wv", name = "mc", descriptor = "[B")
    private byte[] field613;

    @OriginalMember(owner = "client!wv", name = "O", descriptor = "S")
    private short field537;

    @OriginalMember(owner = "client!wv", name = "xb", descriptor = "[B")
    private byte[] field572;

    @OriginalMember(owner = "client!wv", name = "nc", descriptor = "[S")
    private short[] field614;

    @OriginalMember(owner = "client!wv", name = "vb", descriptor = "[S")
    private short[] field570;

    @OriginalMember(owner = "client!wv", name = "ib", descriptor = "[S")
    private short[] field557;

    @OriginalMember(owner = "client!wv", name = "y", descriptor = "[S")
    private short[] field521;

    @OriginalMember(owner = "client!wv", name = "Gb", descriptor = "[S")
    private short[] field581;

    @OriginalMember(owner = "client!wv", name = "E", descriptor = "[F")
    private float[] field527;

    @OriginalMember(owner = "client!wv", name = "D", descriptor = "[I")
    private int[] field526;

    @OriginalMember(owner = "client!wv", name = "V", descriptor = "[[I")
    private int[][] field544;

    @OriginalMember(owner = "client!wv", name = "Bb", descriptor = "[[I")
    private int[][] field576;

    @OriginalMember(owner = "client!wv", name = "Qb", descriptor = "[[I")
    private int[][] field591;

    @OriginalMember(owner = "client!wv", name = "pb", descriptor = "I")
    public static int field564 = 0;

    @OriginalMember(owner = "client!wv", name = "Z", descriptor = "B")
    private byte field548;

    @OriginalMember(owner = "client!wv", name = "Wb", descriptor = "F")
    private static float field597;

    @OriginalMember(owner = "client!wv", name = "l", descriptor = "I")
    public static int field508;

    @OriginalMember(owner = "client!wv", name = "m", descriptor = "I")
    public static int field509;

    @OriginalMember(owner = "client!wv", name = "n", descriptor = "I")
    public static int field510;

    @OriginalMember(owner = "client!wv", name = "q", descriptor = "I")
    public static int field513;

    @OriginalMember(owner = "client!wv", name = "s", descriptor = "I")
    public static int field515;

    @OriginalMember(owner = "client!wv", name = "u", descriptor = "I")
    public static int field517;

    @OriginalMember(owner = "client!wv", name = "v", descriptor = "I")
    public static int field518;

    @OriginalMember(owner = "client!wv", name = "z", descriptor = "I")
    public static int field522;

    @OriginalMember(owner = "client!wv", name = "A", descriptor = "I")
    public static int field523;

    @OriginalMember(owner = "client!wv", name = "C", descriptor = "I")
    public static int field525;

    @OriginalMember(owner = "client!wv", name = "F", descriptor = "I")
    public static int field528;

    @OriginalMember(owner = "client!wv", name = "G", descriptor = "I")
    public static int field529;

    @OriginalMember(owner = "client!wv", name = "H", descriptor = "I")
    public static int field530;

    @OriginalMember(owner = "client!wv", name = "I", descriptor = "I")
    public static int field531;

    @OriginalMember(owner = "client!wv", name = "J", descriptor = "I")
    public static int field532;

    @OriginalMember(owner = "client!wv", name = "M", descriptor = "I")
    public static int field535;

    @OriginalMember(owner = "client!wv", name = "N", descriptor = "I")
    public static int field536;

    @OriginalMember(owner = "client!wv", name = "P", descriptor = "I")
    public static int field538;

    @OriginalMember(owner = "client!wv", name = "Q", descriptor = "I")
    public static int field539;

    @OriginalMember(owner = "client!wv", name = "R", descriptor = "I")
    public static int field540;

    @OriginalMember(owner = "client!wv", name = "U", descriptor = "I")
    public static int field543;

    @OriginalMember(owner = "client!wv", name = "W", descriptor = "I")
    public static int field545;

    @OriginalMember(owner = "client!wv", name = "X", descriptor = "I")
    public static int field546;

    @OriginalMember(owner = "client!wv", name = "Y", descriptor = "I")
    public static int field547;

    @OriginalMember(owner = "client!wv", name = "ab", descriptor = "I")
    public static int field549;

    @OriginalMember(owner = "client!wv", name = "bb", descriptor = "I")
    public static int field550;

    @OriginalMember(owner = "client!wv", name = "db", descriptor = "I")
    public static int field552;

    @OriginalMember(owner = "client!wv", name = "fb", descriptor = "I")
    public static int field554;

    @OriginalMember(owner = "client!wv", name = "gb", descriptor = "I")
    public static int field555;

    @OriginalMember(owner = "client!wv", name = "hb", descriptor = "I")
    public static int field556;

    @OriginalMember(owner = "client!wv", name = "jb", descriptor = "I")
    public static int field558;

    @OriginalMember(owner = "client!wv", name = "nb", descriptor = "I")
    public static int field562;

    @OriginalMember(owner = "client!wv", name = "ob", descriptor = "I")
    public static int field563;

    @OriginalMember(owner = "client!wv", name = "wb", descriptor = "I")
    public static int field571;

    @OriginalMember(owner = "client!wv", name = "zb", descriptor = "I")
    public static int field574;

    @OriginalMember(owner = "client!wv", name = "Cb", descriptor = "I")
    public static int field577;

    @OriginalMember(owner = "client!wv", name = "Db", descriptor = "I")
    public static int field578;

    @OriginalMember(owner = "client!wv", name = "Kb", descriptor = "I")
    public static int field585;

    @OriginalMember(owner = "client!wv", name = "Mb", descriptor = "I")
    public static int field587;

    @OriginalMember(owner = "client!wv", name = "Pb", descriptor = "I")
    public static int field590;

    @OriginalMember(owner = "client!wv", name = "Rb", descriptor = "I")
    public static int field592;

    @OriginalMember(owner = "client!wv", name = "Sb", descriptor = "I")
    public static int field593;

    @OriginalMember(owner = "client!wv", name = "Tb", descriptor = "I")
    public static int field594;

    @OriginalMember(owner = "client!wv", name = "Ub", descriptor = "I")
    public static int field595;

    @OriginalMember(owner = "client!wv", name = "Vb", descriptor = "I")
    public static int field596;

    @OriginalMember(owner = "client!wv", name = "Xb", descriptor = "I")
    public static int field598;

    @OriginalMember(owner = "client!wv", name = "Zb", descriptor = "I")
    public static int field600;

    @OriginalMember(owner = "client!wv", name = "ac", descriptor = "I")
    public static int field601;

    @OriginalMember(owner = "client!wv", name = "fc", descriptor = "I")
    public static int field606;

    @OriginalMember(owner = "client!wv", name = "hc", descriptor = "I")
    public static int field608;

    @OriginalMember(owner = "client!wv", name = "ic", descriptor = "I")
    public static int field609;

    @OriginalMember(owner = "client!wv", name = "jc", descriptor = "I")
    public static int field610;

    @OriginalMember(owner = "client!wv", name = "kc", descriptor = "I")
    public static int field611;

    @OriginalMember(owner = "client!wv", name = "lc", descriptor = "I")
    public static int field612;

    @OriginalMember(owner = "client!wv", name = "oc", descriptor = "I")
    public static int field615;

    @OriginalMember(owner = "client!wv", name = "pc", descriptor = "I")
    public static int field616;

    @OriginalMember(owner = "client!wv", name = "rc", descriptor = "I")
    public static int field618;

    @OriginalMember(owner = "client!wv", name = "sc", descriptor = "I")
    public static int field619;

    @OriginalMember(owner = "client!wv", name = "vc", descriptor = "I")
    public static int field622;

    @OriginalMember(owner = "client!wv", name = "xc", descriptor = "I")
    public static int field624;

    @OriginalMember(owner = "client!wv", name = "yc", descriptor = "I")
    public static int field625;

    @OriginalMember(owner = "client!wv", name = "Cc", descriptor = "I")
    public static int field629;

    @OriginalMember(owner = "client!wv", name = "uc", descriptor = "Lmda;")
    private class274 field621;

    @OriginalMember(owner = "client!wv", name = "o", descriptor = "Lvt;")
    private class317 field511;

    @OriginalMember(owner = "client!wv", name = "Ab", descriptor = "Lic;")
    private class726 field575;

    @OriginalMember(owner = "client!wv", name = "p", descriptor = "S")
    private short field512;

    @OriginalMember(owner = "client!wv", name = "S", descriptor = "S")
    private short field541;

    @OriginalMember(owner = "client!wv", name = "tb", descriptor = "S")
    private short field568;

    @OriginalMember(owner = "client!wv", name = "ub", descriptor = "S")
    private short field569;

    @OriginalMember(owner = "client!wv", name = "Ib", descriptor = "S")
    private short field583;

    @OriginalMember(owner = "client!wv", name = "dc", descriptor = "S")
    private short field604;

    @OriginalMember(owner = "client!wv", name = "gc", descriptor = "S")
    private short field607;

    @OriginalMember(owner = "client!wv", name = "Bc", descriptor = "S")
    private short field628;

    @OriginalMember(owner = "client!wv", name = "s", descriptor = "(I)V", line = 13)
    public final void method85(int arg0) {
        this.field603 = arg0;
        field606++;
        if (this.field511 != null && (this.field603 & 0x10000) == 0) {
            this.field572 = this.field511.field4717;
            this.field570 = this.field511.field4715;
            this.field588 = this.field511.field4716;
            this.field626 = this.field511.field4719;
            this.field511 = null;
        }
        this.field561 = true;
        this.method271(110);
    }

    @OriginalMember(owner = "client!wv", name = "VA", descriptor = "(I)V", line = 35)
    public final void method59(int arg0) {
        field530++;
        int var2 = class601.field8476[arg0];
        int var3 = class601.field8473[arg0];
        for (int var4 = 0; var4 < this.field516; var4++) {
            int var5 = this.field580[var4] * var2 + this.field533[var4] * var3 >> 14;
            this.field580[var4] = this.field580[var4] * var3 - (this.field533[var4] * var2) >> 14;
            this.field533[var4] = var5;
        }
        this.field534 = false;
        if (this.field605 != null) {
            this.field605.field10091 = null;
        }
    }

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(Leh;)V", line = 66)
    public final void method63(class378 arg0) {
        field546++;
        class712 var2 = (class712) arg0;
        if (this.field514 != null) {
            for (int var3 = 0; var3 < this.field514.length; var3++) {
                class338 var4 = this.field514[var3];
                class338 var5 = var4;
                if (var4.field5011 != null) {
                    var5 = var4.field5011;
                }
                var5.field5019 = (int) ((float) this.field553[var4.field5021] * var2.field10043 + (float) this.field580[var4.field5021] * var2.field10018 + (float) this.field533[var4.field5021] * var2.field10031 + var2.field10041);
                var5.field5025 = (int) ((float) this.field553[var4.field5021] * var2.field10024 + (float) this.field580[var4.field5021] * var2.field10039 + (float) this.field533[var4.field5021] * var2.field10023 + var2.field10042);
                var5.field5022 = (int) ((float) this.field553[var4.field5021] * var2.field10044 + (float) this.field580[var4.field5021] * var2.field10032 + (float) this.field533[var4.field5021] * var2.field10030 + var2.field10037);
                var5.field5012 = (int) ((float) this.field553[var4.field5017] * var2.field10043 + (float) this.field580[var4.field5017] * var2.field10018 + (float) this.field533[var4.field5017] * var2.field10031 + var2.field10041);
                var5.field5010 = (int) ((float) this.field553[var4.field5017] * var2.field10024 + (float) this.field580[var4.field5017] * var2.field10039 + (float) this.field533[var4.field5017] * var2.field10023 + var2.field10042);
                var5.field5008 = (int) ((float) this.field553[var4.field5017] * var2.field10044 + (float) this.field580[var4.field5017] * var2.field10032 + (float) this.field533[var4.field5017] * var2.field10030 + var2.field10037);
                var5.field5005 = (int) ((float) this.field553[var4.field5018] * var2.field10043 + (float) this.field580[var4.field5018] * var2.field10018 + (float) this.field533[var4.field5018] * var2.field10031 + var2.field10041);
                var5.field5009 = (int) ((float) this.field553[var4.field5018] * var2.field10024 + (float) this.field580[var4.field5018] * var2.field10039 + (float) this.field533[var4.field5018] * var2.field10023 + var2.field10042);
                var5.field5014 = (int) ((float) this.field553[var4.field5018] * var2.field10044 + (float) this.field580[var4.field5018] * var2.field10032 + (float) this.field533[var4.field5018] * var2.field10030 + var2.field10037);
            }
        }
        if (this.field623 == null) {
            return;
        }
        for (int var6 = 0; var6 < this.field623.length; var6++) {
            class92 var7 = this.field623[var6];
            class92 var8 = var7;
            if (var7.field1201 != null) {
                var8 = var7.field1201;
            }
            if (var7.field1199 == null) {
                var7.field1199 = var2.method1951();
            } else {
                var7.field1199.method1950(var2);
            }
            var8.field1203 = (int) ((float) this.field553[var7.field1196] * var2.field10043 + (float) this.field580[var7.field1196] * var2.field10018 + (float) this.field533[var7.field1196] * var2.field10031 + var2.field10041);
            var8.field1205 = (int) ((float) this.field553[var7.field1196] * var2.field10024 + (float) this.field580[var7.field1196] * var2.field10039 + (float) this.field533[var7.field1196] * var2.field10023 + var2.field10042);
            var8.field1202 = (int) ((float) this.field553[var7.field1196] * var2.field10044 + (float) this.field580[var7.field1196] * var2.field10032 + (float) this.field533[var7.field1196] * var2.field10030 + var2.field10037);
        }
    }

    @OriginalMember(owner = "client!wv", name = "fa", descriptor = "()I", line = 138)
    public final int method75() {
        if (!this.field534) {
            this.method262((byte) -127);
        }
        field619++;
        return this.field541;
    }

    @OriginalMember(owner = "client!wv", name = "b", descriptor = "()V", line = 153)
    public final void method58() {
        field529++;
    }

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(ZI)V", line = 162)
    private final void method259(boolean arg0, int arg1) {
        field513++;
        if (this.field630.field4231.field1556.length >= (this.field602 * 6)) {
            this.field630.field4231.field1521 = 0;
        } else {
            this.field630.field4231 = new class186((this.field602 + 100) * 6);
        }
        class186 var3 = this.field630.field4231;
        if (this.field630.field4230) {
            for (int var4 = 0; var4 < this.field602; var4++) {
                var3.method860(this.field567[var4], (byte) 124);
                var3.method860(this.field614[var4], (byte) 123);
                var3.method860(this.field581[var4], (byte) 123);
            }
        } else {
            for (int var5 = 0; var5 < this.field602; var5++) {
                var3.method868(this.field567[var5], 849257384);
                var3.method868(this.field614[var5], 849257384);
                var3.method868(this.field581[var5], 849257384);
            }
        }
        if (var3.field1521 == 0 || arg1 != 5) {
            return;
        }
        if (arg0) {
            if (this.field621 == null) {
                this.field621 = this.field630.method1838(5123, false, var3.field1556, true, var3.field1521);
            } else {
                this.field621.method1776((byte) -74, var3.field1521, 5123, var3.field1556);
            }
            this.field617.field1285 = this.field621;
        } else {
            this.field617.field1285 = this.field630.method1838(5123, false, var3.field1556, false, var3.field1521);
        }
        if (!arg0) {
            this.field561 = true;
        }
    }

    @OriginalMember(owner = "client!wv", name = "NA", descriptor = "()Z", line = 227)
    public final boolean method112() {
        field596++;
        if (this.field544 == null) {
            return false;
        }
        for (int var1 = 0; var1 < this.field582; var1++) {
            this.field533[var1] <<= 0x4;
            this.field580[var1] <<= 0x4;
            this.field553[var1] <<= 0x4;
        }
        class79.field1048 = 0;
        class752.field10427 = 0;
        class146.field1867 = 0;
        return true;
    }

    @OriginalMember(owner = "client!wv", name = "EA", descriptor = "()I", line = 258)
    public final int method65() {
        field558++;
        if (!this.field534) {
            this.method262((byte) -127);
        }
        return this.field569;
    }

    @OriginalMember(owner = "client!wv", name = "wa", descriptor = "()V", line = 270)
    public final void method62() {
        field616++;
        for (int var1 = 0; var1 < this.field582; var1++) {
            this.field533[var1] = this.field533[var1] + 7 >> 4;
            this.field580[var1] = this.field580[var1] + 7 >> 4;
            this.field553[var1] = this.field553[var1] + 7 >> 4;
        }
        if (this.field605 != null) {
            this.field605.field10091 = null;
        }
        this.field534 = false;
    }

    @OriginalMember(owner = "client!wv", name = "G", descriptor = "()I", line = 293)
    public final int method115() {
        field578++;
        if (!this.field534) {
            this.method262((byte) -127);
        }
        return this.field628;
    }

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(IIII)V", line = 307)
    public final void method106(int arg0, int arg1, int arg2, int arg3) {
        for (int var5 = 0; var5 < this.field551; var5++) {
            int var9 = this.field521[var5] & 0xFFFF;
            int var10 = var9 >> 10 & 0x3F;
            int var11 = var9 >> 7 & 0x7;
            if (arg0 != -1) {
                var10 += (arg0 - var10) * arg3 >> 7;
            }
            int var12 = var9 & 0x7F;
            if (arg1 != -1) {
                var11 += (arg1 - var11) * arg3 >> 7;
            }
            if (arg2 != -1) {
                var12 -= -((arg2 - var12) * arg3 >> 7);
            }
            this.field521[var5] = (short) class281.method1904(var12, class281.method1904(var10 << 10, var11 << 7));
        }
        field532++;
        if (this.field520 != null) {
            for (int var6 = 0; var6 < this.field573; var6++) {
                class664 var7 = this.field520[var6];
                class10 var8 = this.field565[var6];
                var8.field221 = var8.field221 & 0xFF000000 | class444.field6323[this.field521[var7.field9320] & 0xFFFF] & 0xFFFFFF;
            }
        }
        if (this.field627 != null) {
            this.field627.field10091 = null;
        }
    }

    @OriginalMember(owner = "client!wv", name = "<init>", descriptor = "(Lkv;)V", line = 5788)
    public class37(class280 arg0) {
        this.field630 = arg0;
        this.field605 = new class717(null, 5126, 3, 0);
        this.field566 = new class717(null, 5126, 2, 0);
        this.field599 = new class717(null, 5126, 3, 0);
        this.field627 = new class717(null, 5121, 4, 0);
        this.field617 = new class102();
    }

    @OriginalMember(owner = "client!wv", name = "<init>", descriptor = "(Lkv;Lhm;IIII)V", line = 5800)
    public class37(class280 arg0, class229 arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field603 = arg2;
        this.field519 = arg5;
        this.field630 = arg0;
        if (class310.method2031(2048, arg5, arg2)) {
            this.field605 = new class717(null, 5126, 3, 0);
        }
        if (class76.method591(arg5, arg2, (byte) 47)) {
            this.field566 = new class717(null, 5126, 2, 0);
        }
        if (class713.method4034(8, arg5, arg2)) {
            this.field599 = new class717(null, 5126, 3, 0);
        }
        if (class229.method1596(-82, arg2, arg5)) {
            this.field627 = new class717(null, 5121, 4, 0);
        }
        if (class493.method2882(-1, arg5, arg2)) {
            this.field617 = new class102();
        }
        class159 var7 = arg0.field883;
        this.field620 = new int[arg1.field3311 + 1];
        int[] var8 = new int[arg1.field3310];
        for (int var9 = 0; var9 < arg1.field3310; var9++) {
            if (arg1.field3317 == null || arg1.field3317[var9] != 2) {
                if (arg1.field3330 != null && arg1.field3330[var9] != -1) {
                    class181 var173 = var7.method1263(arg1.field3330[var9] & 0xFFFF, (byte) 127);
                    if (((this.field519 & 0x40) == 0 || !var173.field2744) && var173.field2738) {
                        continue;
                    }
                }
                var8[this.field551++] = var9;
                this.field620[arg1.field3322[var9]]++;
                this.field620[arg1.field3329[var9]]++;
                this.field620[arg1.field3282[var9]]++;
            }
        }
        this.field602 = this.field551;
        long[] var10 = new long[this.field551];
        boolean var11 = (this.field603 & 0x100) != 0;
        for (int var12 = 0; var12 < this.field551; var12++) {
            int var156 = var8[var12];
            class181 var157 = null;
            int var158 = 0;
            byte var159 = 0;
            byte var160 = 0;
            byte var161 = 0;
            if (arg1.field3279 != null) {
                boolean var162 = false;
                for (int var163 = 0; var163 < arg1.field3279.length; var163++) {
                    class297 var164 = arg1.field3279[var163];
                    if (var164.field4468 == var156) {
                        class399 var165 = class275.method1779((byte) -116, var164.field4473);
                        if (var165.field5671) {
                            var162 = true;
                        }
                        if (var165.field5674 != -1) {
                            class181 var166 = var7.method1263(var165.field5674, (byte) 113);
                            if (var166.field2751 == 2) {
                                this.field586 = true;
                            }
                        }
                    }
                }
                if (var162) {
                    var10[var12] = Long.MAX_VALUE;
                    this.field602--;
                    continue;
                }
            }
            short var167 = -1;
            if (arg1.field3330 != null) {
                var167 = arg1.field3330[var156];
                if (var167 != -1) {
                    var157 = var7.method1263(var167 & 0xFFFF, (byte) 127);
                    if ((this.field519 & 0x40) != 0 && var157.field2744) {
                        var157 = null;
                        var167 = -1;
                    } else {
                        if (var157.field2740 != 0 || var157.field2736 != 0) {
                            this.field584 = true;
                        }
                        var161 = var157.field2737;
                        var160 = var157.field2745;
                    }
                }
            }
            boolean var168 = arg1.field3296 != null && arg1.field3296[var156] != 0 || var157 != null && var157.field2751 != 0;
            if ((var11 || var168) && arg1.field3306 != null) {
                var158 += arg1.field3306[var156] << 17;
            }
            if (var168) {
                var158 += 65536;
            }
            int var169 = (var160 & 0xFF << 8) + var158;
            int var170 = (var161 & 0xFF) + var169;
            int var171 = (var167 & 0xFFFF << 16) + var159;
            int var172 = (var12 & 0xFFFF) + var171;
            var10[var12] = ((long) var170 << 32) + ((long) var172);
            this.field586 |= var168;
            this.field584 |= var157 != null && (var157.field2740 != 0 || var157.field2736 != 0);
        }
        class504.method2938(var8, var10, (byte) 40);
        this.field553 = arg1.field3287;
        this.field579 = arg1.field3289;
        this.field580 = arg1.field3328;
        this.field516 = arg1.field3311;
        this.field582 = arg1.field3313;
        this.field533 = arg1.field3320;
        this.field623 = arg1.field3327;
        this.field514 = arg1.field3316;
        class714[] var13 = new class714[this.field516];
        if (arg1.field3279 != null) {
            this.field573 = arg1.field3279.length;
            this.field520 = new class664[this.field573];
            this.field565 = new class10[this.field573];
            for (int var14 = 0; var14 < this.field573; var14++) {
                class297 var15 = arg1.field3279[var14];
                class399 var16 = class275.method1779((byte) -122, var15.field4473);
                int var17 = -1;
                for (int var18 = 0; var18 < this.field551; var18++) {
                    if (var8[var18] == var15.field4468) {
                        var17 = var18;
                        break;
                    }
                }
                if (var17 == -1) {
                    throw new RuntimeException();
                }
                int var19 = class444.field6323[arg1.field3321[var15.field4468] & 0xFFFF] & 0xFFFFFF;
                int var20 = var19 | 255 - (arg1.field3296 == null ? 0 : arg1.field3296[var15.field4468]) << 24;
                this.field520[var14] = new class664(var17, arg1.field3322[var15.field4468], arg1.field3329[var15.field4468], arg1.field3282[var15.field4468], var16.field5666, var16.field5660, var16.field5674, var16.field5667, var16.field5675, var16.field5671, var16.field5665, var15.field4471);
                this.field565[var14] = new class10(var20);
            }
        }
        int var21 = this.field551 * 3;
        this.field588 = new short[var21];
        if (arg1.field3278 != null) {
            this.field589 = new short[this.field551];
        }
        this.field559 = new short[this.field551];
        class687.field9740 = new long[var21];
        this.field542 = new float[var21];
        this.field567 = new short[this.field551];
        this.field626 = new short[var21];
        this.field524 = (short) arg4;
        this.field613 = new byte[this.field551];
        this.field537 = (short) arg3;
        this.field572 = new byte[var21];
        this.field614 = new short[this.field551];
        this.field570 = new short[var21];
        this.field557 = new short[var21];
        this.field521 = new short[this.field551];
        this.field581 = new short[this.field551];
        this.field527 = new float[var21];
        int var22 = 0;
        for (int var23 = 0; var23 < arg1.field3311; var23++) {
            int var155 = this.field620[var23];
            this.field620[var23] = var22;
            var22 += var155;
            var13[var23] = new class714();
        }
        this.field620[arg1.field3311] = var22;
        class619 var24 = class182.method1360(-4, this.field551, var8, arg1);
        class483[] var25 = new class483[arg1.field3310];
        for (int var26 = 0; var26 < arg1.field3310; var26++) {
            short var134 = arg1.field3322[var26];
            short var135 = arg1.field3329[var26];
            short var136 = arg1.field3282[var26];
            int var137 = this.field533[var135] - this.field533[var134];
            int var138 = this.field580[var135] - this.field580[var134];
            int var139 = this.field553[var135] - this.field553[var134];
            int var140 = this.field533[var136] - this.field533[var134];
            int var141 = this.field580[var136] - this.field580[var134];
            int var142 = this.field553[var136] - this.field553[var134];
            int var143 = var138 * var142 - (var139 * var141);
            int var144 = var139 * var140 - (var137 * var142);
            int var145;
            for (var145 = var137 * var141 - (var138 * var140); var143 > 8192 || var144 > 8192 || var145 > 8192 || var143 < -8192 || var144 < -8192 || var145 < -8192; var145 >>= 0x1) {
                var144 >>= 0x1;
                var143 >>= 0x1;
            }
            int var146 = (int) Math.sqrt((double) (var143 * var143 + var144 * var144 + var145 * var145));
            if (var146 <= 0) {
                var146 = 1;
            }
            int var147 = var143 * 256 / var146;
            int var148 = var144 * 256 / var146;
            int var149 = var145 * 256 / var146;
            byte var150 = arg1.field3317 == null ? 0 : arg1.field3317[var26];
            if (var150 == 0) {
                class714 var152 = var13[var134];
                var152.field10075 += var148;
                var152.field10074 += var147;
                var152.field10072 += var149;
                var152.field10076++;
                class714 var153 = var13[var135];
                var153.field10072 += var149;
                var153.field10075 += var148;
                var153.field10074 += var147;
                var153.field10076++;
                class714 var154 = var13[var136];
                var154.field10074 += var147;
                var154.field10076++;
                var154.field10072 += var149;
                var154.field10075 += var148;
            } else if (var150 == 1) {
                class483 var151 = var25[var26] = new class483();
                var151.field6858 = var148;
                var151.field6855 = var149;
                var151.field6859 = var147;
            }
        }
        for (int var27 = 0; var27 < this.field551; var27++) {
            int var43 = var8[var27];
            int var44 = arg1.field3321[var43] & 0xFFFF;
            int var45;
            if (arg1.field3309 == null) {
                var45 = -1;
            } else {
                var45 = arg1.field3309[var43];
            }
            int var46;
            if (arg1.field3296 == null) {
                var46 = 0;
            } else {
                var46 = arg1.field3296[var43] & 0xFF;
            }
            short var47 = arg1.field3330 == null ? -1 : arg1.field3330[var43];
            if (var47 != -1 && (this.field519 & 0x40) != 0) {
                class181 var48 = var7.method1263(var47 & 0xFFFF, (byte) 123);
                if (var48.field2744) {
                    var47 = -1;
                }
            }
            float var49 = 0.0F;
            float var50 = 0.0F;
            float var51 = 0.0F;
            float var52 = 0.0F;
            float var53 = 0.0F;
            float var54 = 0.0F;
            byte var55 = 0;
            byte var56 = 0;
            int var57 = 0;
            if (var47 != -1) {
                if (var45 == -1) {
                    var54 = 0.0F;
                    var55 = 1;
                    var52 = 1.0F;
                    var50 = 1.0F;
                    var51 = 1.0F;
                    var49 = 0.0F;
                    var53 = 0.0F;
                    var56 = 2;
                } else {
                    var45 &= 0xFF;
                    byte var58 = arg1.field3294[var45];
                    if (var58 == 0) {
                        short var59 = arg1.field3322[var43];
                        short var60 = arg1.field3329[var43];
                        short var61 = arg1.field3282[var43];
                        short var62 = arg1.field3280[var45];
                        short var63 = arg1.field3290[var45];
                        short var64 = arg1.field3312[var45];
                        float var65 = (float) arg1.field3320[var62];
                        float var66 = (float) arg1.field3328[var62];
                        float var67 = (float) arg1.field3287[var62];
                        float var68 = (float) arg1.field3320[var63] - var65;
                        float var69 = (float) arg1.field3328[var63] - var66;
                        float var70 = (float) arg1.field3287[var63] - var67;
                        float var71 = (float) arg1.field3320[var64] - var65;
                        float var72 = (float) arg1.field3328[var64] - var66;
                        float var73 = (float) arg1.field3287[var64] - var67;
                        float var74 = (float) arg1.field3320[var59] - var65;
                        float var75 = (float) arg1.field3328[var59] - var66;
                        float var76 = (float) arg1.field3287[var59] - var67;
                        float var77 = (float) arg1.field3320[var60] - var65;
                        float var78 = (float) arg1.field3328[var60] - var66;
                        float var79 = (float) arg1.field3287[var60] - var67;
                        float var80 = (float) arg1.field3320[var61] - var65;
                        float var81 = (float) arg1.field3328[var61] - var66;
                        float var82 = (float) arg1.field3287[var61] - var67;
                        float var83 = var69 * var73 - (var70 * var72);
                        float var84 = var70 * var71 - (var68 * var73);
                        float var85 = var68 * var72 - var69 * var71;
                        float var86 = var72 * var85 - var73 * var84;
                        float var87 = var73 * var83 - (var71 * var85);
                        float var88 = var71 * var84 - (var72 * var83);
                        float var89 = 1.0F / (var70 * var88 + var68 * var86 + var69 * var87);
                        var49 = (var76 * var88 + var74 * var86 + var75 * var87) * var89;
                        var53 = (var82 * var88 + var80 * var86 + var81 * var87) * var89;
                        var51 = (var79 * var88 + var77 * var86 + var78 * var87) * var89;
                        float var90 = var69 * var85 - (var70 * var84);
                        float var91 = var68 * var84 - var69 * var83;
                        float var92 = var70 * var83 - (var68 * var85);
                        float var93 = 1.0F / (var73 * var91 + var71 * var90 + var72 * var92);
                        var50 = (var76 * var91 + var74 * var90 + var75 * var92) * var93;
                        var54 = (var82 * var91 + var80 * var90 + var81 * var92) * var93;
                        var52 = (var79 * var91 + var77 * var90 + var78 * var92) * var93;
                    } else {
                        short var94 = arg1.field3322[var43];
                        short var95 = arg1.field3329[var43];
                        short var96 = arg1.field3282[var43];
                        int var97 = var24.field8716[var45];
                        int var98 = var24.field8723[var45];
                        int var99 = var24.field8725[var45];
                        float[] var100 = var24.field8719[var45];
                        byte var101 = arg1.field3283[var45];
                        float var102 = (float) arg1.field3281[var45] / 256.0F;
                        if (var58 == 1) {
                            float var103 = (float) arg1.field3291[var45] / 1024.0F;
                            class77.method595(var103, var101, arg1.field3328[var94], arg1.field3287[var94], var98, var100, arg1.field3320[var94], var102, 0, var97, class333.field4977, var99);
                            var50 = class333.field4977[1];
                            var49 = class333.field4977[0];
                            class77.method595(var103, var101, arg1.field3328[var95], arg1.field3287[var95], var98, var100, arg1.field3320[var95], var102, 0, var97, class333.field4977, var99);
                            var52 = class333.field4977[1];
                            var51 = class333.field4977[0];
                            class77.method595(var103, var101, arg1.field3328[var96], arg1.field3287[var96], var98, var100, arg1.field3320[var96], var102, 0, var97, class333.field4977, var99);
                            var54 = class333.field4977[1];
                            var53 = class333.field4977[0];
                            float var104 = var103 / 2.0F;
                            if ((var101 & 0x1) == 0) {
                                if ((var51 - var49 > var104)) {
                                    var51 -= var103;
                                    var55 = 1;
                                } else if (var104 < var49 - var51) {
                                    var55 = 2;
                                    var51 += var103;
                                }
                                if (var53 - var49 > var104) {
                                    var56 = 1;
                                    var53 -= var103;
                                } else if (var49 - var53 > var104) {
                                    var56 = 2;
                                    var53 += var103;
                                }
                            } else {
                                if ((var54 - var50 > var104)) {
                                    var54 -= var103;
                                    var56 = 1;
                                } else if (var50 - var54 > var104) {
                                    var56 = 2;
                                    var54 += var103;
                                }
                                if ((var52 - var50 > var104)) {
                                    var55 = 1;
                                    var52 -= var103;
                                } else if (var104 < var50 - var52) {
                                    var52 += var103;
                                    var55 = 2;
                                }
                            }
                        } else if (var58 == 2) {
                            float var105 = (float) arg1.field3323[var45] / 256.0F;
                            float var106 = (float) arg1.field3276[var45] / 256.0F;
                            int var107 = arg1.field3320[var95] - arg1.field3320[var94];
                            int var108 = arg1.field3328[var95] - arg1.field3328[var94];
                            int var109 = arg1.field3287[var95] - arg1.field3287[var94];
                            int var110 = arg1.field3320[var96] - arg1.field3320[var94];
                            int var111 = arg1.field3328[var96] - arg1.field3328[var94];
                            int var112 = arg1.field3287[var96] - arg1.field3287[var94];
                            int var113 = var108 * var112 - (var109 * var111);
                            int var114 = var109 * var110 - (var107 * var112);
                            int var115 = var107 * var111 - (var108 * var110);
                            float var116 = 64.0F / (float) arg1.field3325[var45];
                            float var117 = 64.0F / (float) arg1.field3326[var45];
                            float var118 = 64.0F / (float) arg1.field3291[var45];
                            float var119 = (var100[2] * (float) var115 + var100[1] * (float) var114 + var100[0] * (float) var113) / var116;
                            float var120 = (var100[5] * (float) var115 + var100[4] * (float) var114 + var100[3] * (float) var113) / var117;
                            float var121 = (var100[8] * (float) var115 + var100[7] * (float) var114 + var100[6] * (float) var113) / var118;
                            var57 = class45.method306(var121, -78, var120, var119);
                            class485.method2835(var99, class333.field4977, var106, var101, var98, var57, var105, var102, var100, arg1.field3320[var94], arg1.field3328[var94], arg1.field3287[var94], var97, 74);
                            var49 = class333.field4977[0];
                            var50 = class333.field4977[1];
                            class485.method2835(var99, class333.field4977, var106, var101, var98, var57, var105, var102, var100, arg1.field3320[var95], arg1.field3328[var95], arg1.field3287[var95], var97, 98);
                            var51 = class333.field4977[0];
                            var52 = class333.field4977[1];
                            class485.method2835(var99, class333.field4977, var106, var101, var98, var57, var105, var102, var100, arg1.field3320[var96], arg1.field3328[var96], arg1.field3287[var96], var97, 73);
                            var53 = class333.field4977[0];
                            var54 = class333.field4977[1];
                        } else if (var58 == 3) {
                            class222.method1532(var98, var102, class333.field4977, arg1.field3320[var94], var99, arg1.field3287[var94], var97, false, arg1.field3328[var94], var100, var101);
                            var50 = class333.field4977[1];
                            var49 = class333.field4977[0];
                            class222.method1532(var98, var102, class333.field4977, arg1.field3320[var95], var99, arg1.field3287[var95], var97, false, arg1.field3328[var95], var100, var101);
                            var52 = class333.field4977[1];
                            var51 = class333.field4977[0];
                            class222.method1532(var98, var102, class333.field4977, arg1.field3320[var96], var99, arg1.field3287[var96], var97, false, arg1.field3328[var96], var100, var101);
                            var54 = class333.field4977[1];
                            var53 = class333.field4977[0];
                            if ((var101 & 0x1) == 0) {
                                if (var53 - var49 > 0.5F) {
                                    var56 = 1;
                                    var53--;
                                } else if (var49 - var53 > 0.5F) {
                                    var53++;
                                    var56 = 2;
                                }
                                if ((var51 - var49 > 0.5F)) {
                                    var51--;
                                    var55 = 1;
                                } else if (var49 - var51 > 0.5F) {
                                    var51++;
                                    var55 = 2;
                                }
                            } else {
                                if (var54 - var50 > 0.5F) {
                                    var54--;
                                    var56 = 1;
                                } else if (var50 - var54 > 0.5F) {
                                    var54++;
                                    var56 = 2;
                                }
                                if ((var52 - var50 > 0.5F)) {
                                    var52--;
                                    var55 = 1;
                                } else if (var50 - var52 > 0.5F) {
                                    var55 = 2;
                                    var52++;
                                }
                            }
                        }
                    }
                }
            }
            byte var122;
            if (arg1.field3317 == null) {
                var122 = 0;
            } else {
                var122 = arg1.field3317[var43];
            }
            if (var122 == 0) {
                long var123 = (long) (var45 << 2) + ((long) (var44 << 8) + (long) (var57 << 24) + (long) var46 << 32);
                short var125 = arg1.field3322[var43];
                short var126 = arg1.field3329[var43];
                short var127 = arg1.field3282[var43];
                class714 var128 = var13[var125];
                this.field567[var27] = this.method263(var49, var125, var128.field10076, var128.field10072, -27771, var128.field10075, var128.field10074, arg1, var123, var50);
                class714 var129 = var13[var126];
                this.field614[var27] = this.method263(var51, var126, var129.field10076, var129.field10072, -27771, var129.field10075, var129.field10074, arg1, (long) var55 + var123, var52);
                class714 var130 = var13[var127];
                this.field581[var27] = this.method263(var53, var127, var130.field10076, var130.field10072, -27771, var130.field10075, var130.field10074, arg1, (long) var56 + var123, var54);
            } else if (var122 == 1) {
                class483 var131 = var25[var43];
                long var132 = ((long) (var44 << 8) + (long) var46 + (long) (var57 << 24) << 32) + (long) ((var131.field6859 > 0 ? 1024 : 2048) + (var45 << 2) - (-(var131.field6858 + 256 << 12) - (var131.field6855 + 256 << 22)));
                this.field567[var27] = this.method263(var49, arg1.field3322[var43], 0, var131.field6855, -27771, var131.field6858, var131.field6859, arg1, var132, var50);
                this.field614[var27] = this.method263(var51, arg1.field3329[var43], 0, var131.field6855, -27771, var131.field6858, var131.field6859, arg1, (long) var55 + var132, var52);
                this.field581[var27] = this.method263(var53, arg1.field3282[var43], 0, var131.field6855, -27771, var131.field6858, var131.field6859, arg1, (long) var56 + var132, var54);
            }
            if (arg1.field3296 != null) {
                this.field613[var27] = arg1.field3296[var43];
            }
            if (arg1.field3278 != null) {
                this.field589[var27] = arg1.field3278[var43];
            }
            this.field521[var27] = arg1.field3321[var43];
            this.field559[var27] = var47;
        }
        int var28 = 0;
        short var29 = -10000;
        for (int var30 = 0; var30 < this.field602; var30++) {
            short var42 = this.field559[var30];
            if (var29 != var42) {
                var28++;
                var29 = var42;
            }
        }
        this.field526 = new int[var28 + 1];
        short var31 = -10000;
        int var32 = 0;
        for (int var33 = 0; var33 < this.field602; var33++) {
            short var41 = this.field559[var33];
            if (var31 != var41) {
                var31 = var41;
                this.field526[var32++] = var33;
            }
        }
        this.field526[var32] = this.field602;
        class687.field9740 = null;
        this.field626 = class176.method1321(this.field560, -55, this.field626);
        this.field588 = class176.method1321(this.field560, -13, this.field588);
        this.field570 = class176.method1321(this.field560, -107, this.field570);
        this.field572 = class268.method1756(this.field560, true, this.field572);
        this.field527 = class757.method4186(this.field560, 62, this.field527);
        this.field542 = class757.method4186(this.field560, 100, this.field542);
        if (arg1.field3304 != null && class52.method345(arg2, 32, this.field519)) {
            this.field544 = arg1.method1589(false, -25450);
        }
        if (arg1.field3279 != null && class375.method2324(0, arg2, this.field519)) {
            this.field576 = arg1.method1587((byte) 113);
        }
        if (arg1.field3301 != null && class787.method4312(this.field519, arg2, -117)) {
            int var34 = 0;
            int[] var35 = new int[256];
            for (int var36 = 0; var36 < this.field551; var36++) {
                int var40 = arg1.field3301[var8[var36]];
                if (var40 >= 0) {
                    int var10002 = var35[var40]++;
                    if (var40 > var34) {
                        var34 = var40;
                    }
                }
            }
            this.field591 = new int[var34 + 1][];
            for (int var37 = 0; var37 <= var34; var37++) {
                this.field591[var37] = new int[var35[var37]];
                var35[var37] = 0;
            }
            for (int var38 = 0; var38 < this.field551; var38++) {
                int var39 = arg1.field3301[var8[var38]];
                if (var39 >= 0) {
                    this.field591[var39][var35[var39]++] = var38;
                }
            }
        }
    }

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(IILeh;ZI)Z", line = 380)
    public final boolean method83(int arg0, int arg1, class378 arg2, boolean arg3, int arg4) {
        field601++;
        return this.method269(arg4, arg0, arg1, -1, (byte) 117, arg2, arg3);
    }

    @OriginalMember(owner = "client!wv", name = "d", descriptor = "()V", line = 391)
    public final void method76() {
        field609++;
        if (this.field560 <= 0 || this.field602 <= 0) {
            return;
        }
        this.method264(false, 0);
        if ((this.field548 & 0x10) == 0 && this.field617.field1285 == null) {
            this.method259(false, 5);
        }
        this.method271(78);
    }

    @OriginalMember(owner = "client!wv", name = "ia", descriptor = "(SS)V", line = 409)
    public final void method111(short arg0, short arg1) {
        field562++;
        for (int var3 = 0; var3 < this.field551; var3++) {
            if (this.field521[var3] == arg0) {
                this.field521[var3] = arg1;
            }
        }
        if (this.field520 != null) {
            for (int var4 = 0; var4 < this.field573; var4++) {
                class664 var5 = this.field520[var4];
                class10 var6 = this.field565[var4];
                var6.field221 = class444.field6323[this.field521[var5.field9320] & 0xFFFF] & 0xFFFFFF | var6.field221 & 0xFF000000;
            }
        }
        if (this.field627 != null) {
            this.field627.field10091 = null;
        }
    }

    @OriginalMember(owner = "client!wv", name = "ma", descriptor = "()I", line = 452)
    public final int method67() {
        if (!this.field534) {
            this.method262((byte) -127);
        }
        field574++;
        return this.field512;
    }

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(IIIIIIIII)Z", line = 465)
    private final boolean method260(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field550++;
        if (arg3 >= -36) {
            this.method99();
        }
        if (arg0 > arg6 && arg8 > arg6 && arg7 > arg6) {
            return false;
        } else if (arg0 < arg6 && arg8 < arg6 && arg6 > arg7) {
            return false;
        } else if (arg4 > arg1 && arg5 > arg1 && arg1 < arg2) {
            return false;
        } else {
            return arg1 <= arg4 || arg1 <= arg5 || arg1 <= arg2;
        }
    }

    @OriginalMember(owner = "client!wv", name = "P", descriptor = "(IIII)V", line = 494)
    public final void method69(int arg0, int arg1, int arg2, int arg3) {
        field508++;
        if (arg0 == 0) {
            class146.field1867 = 0;
            class79.field1048 = 0;
            class752.field10427 = 0;
            int var5 = 0;
            for (int var6 = 0; var6 < this.field516; var6++) {
                class146.field1867 += this.field533[var6];
                class79.field1048 += this.field580[var6];
                class752.field10427 += this.field553[var6];
                var5++;
            }
            if (var5 > 0) {
                class146.field1867 = class146.field1867 / var5 + arg1;
                class752.field10427 = class752.field10427 / var5 + arg3;
                class79.field1048 = class79.field1048 / var5 + arg2;
            } else {
                class752.field10427 = arg3;
                class79.field1048 = arg2;
                class146.field1867 = arg1;
            }
        } else if (arg0 == 1) {
            for (int var7 = 0; var7 < this.field516; var7++) {
                this.field533[var7] += arg1;
                this.field580[var7] += arg2;
                this.field553[var7] += arg3;
            }
        } else if (arg0 == 2) {
            for (int var8 = 0; var8 < this.field516; var8++) {
                this.field533[var8] -= class146.field1867;
                this.field580[var8] -= class79.field1048;
                this.field553[var8] -= class752.field10427;
                if (arg3 != 0) {
                    int var9 = class601.field8476[arg3];
                    int var10 = class601.field8473[arg3];
                    int var11 = this.field580[var8] * var9 + (this.field533[var8] * var10) + 16383 >> 14;
                    this.field580[var8] = this.field580[var8] * var10 + 16383 - (this.field533[var8] * var9) >> 14;
                    this.field533[var8] = var11;
                }
                if (arg1 != 0) {
                    int var12 = class601.field8476[arg1];
                    int var13 = class601.field8473[arg1];
                    int var14 = this.field580[var8] * var13 + 16383 - (this.field553[var8] * var12) >> 14;
                    this.field553[var8] = this.field580[var8] * var12 + this.field553[var8] * var13 + 16383 >> 14;
                    this.field580[var8] = var14;
                }
                if (arg2 != 0) {
                    int var15 = class601.field8476[arg2];
                    int var16 = class601.field8473[arg2];
                    int var17 = this.field553[var8] * var15 + (this.field533[var8] * var16) + 16383 >> 14;
                    this.field553[var8] = this.field553[var8] * var16 + 16383 - (this.field533[var8] * var15) >> 14;
                    this.field533[var8] = var17;
                }
                this.field533[var8] += class146.field1867;
                this.field580[var8] += class79.field1048;
                this.field553[var8] += class752.field10427;
            }
        } else if (arg0 == 3) {
            for (int var18 = 0; var18 < this.field516; var18++) {
                this.field533[var18] -= class146.field1867;
                this.field580[var18] -= class79.field1048;
                this.field553[var18] -= class752.field10427;
                this.field533[var18] = this.field533[var18] * arg1 / 128;
                this.field580[var18] = this.field580[var18] * arg2 / 128;
                this.field553[var18] = this.field553[var18] * arg3 / 128;
                this.field533[var18] += class146.field1867;
                this.field580[var18] += class79.field1048;
                this.field553[var18] += class752.field10427;
            }
        } else if (arg0 == 5) {
            for (int var19 = 0; var19 < this.field551; var19++) {
                int var23 = (this.field613[var19] & 0xFF) + arg1 * 8;
                if (var23 < 0) {
                    var23 = 0;
                } else if (var23 > 255) {
                    var23 = 255;
                }
                this.field613[var19] = (byte) var23;
            }
            if (this.field627 != null) {
                this.field627.field10091 = null;
            }
            if (this.field520 != null) {
                for (int var20 = 0; var20 < this.field573; var20++) {
                    class664 var21 = this.field520[var20];
                    class10 var22 = this.field565[var20];
                    var22.field221 = var22.field221 & 0xFFFFFF | 255 - (this.field613[var21.field9320] & 0xFF) << 24;
                }
            }
        } else if (arg0 == 7) {
            for (int var24 = 0; var24 < this.field551; var24++) {
                int var28 = this.field521[var24] & 0xFFFF;
                int var29 = var28 >> 10 & 0x3F;
                int var30 = var28 >> 7 & 0x7;
                int var31 = var28 & 0x7F;
                int var32 = arg2 / 4 + var30;
                int var33 = var29 + arg1 & 0x3F;
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
                this.field521[var24] = (short) class281.method1904(class281.method1904(var33 << 10, var32 << 7), var34);
            }
            if (this.field627 != null) {
                this.field627.field10091 = null;
            }
            if (this.field520 != null) {
                for (int var25 = 0; var25 < this.field573; var25++) {
                    class664 var26 = this.field520[var25];
                    class10 var27 = this.field565[var25];
                    var27.field221 = var27.field221 & 0xFF000000 | class444.field6323[this.field521[var26.field9320] & 0xFFFF] & 0xFFFFFF;
                }
            }
        } else if (arg0 == 8) {
            for (int var35 = 0; var35 < this.field573; var35++) {
                class10 var36 = this.field565[var35];
                var36.field222 += arg2;
                var36.field220 += arg1;
            }
        } else if (arg0 == 10) {
            for (int var37 = 0; var37 < this.field573; var37++) {
                class10 var38 = this.field565[var37];
                var38.field219 = var38.field219 * arg2 >> 7;
                var38.field227 = var38.field227 * arg1 >> 7;
            }
        } else if (arg0 == 9) {
            for (int var39 = 0; var39 < this.field573; var39++) {
                class10 var40 = this.field565[var39];
                var40.field224 = var40.field224 + arg1 & 0x3FFF;
            }
        }
    }

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "()[Lnha;", line = 799)
    public final class338[] method54() {
        field625++;
        return this.field514;
    }

    @OriginalMember(owner = "client!wv", name = "RA", descriptor = "()I", line = 814)
    public final int method79() {
        if (!this.field534) {
            this.method262((byte) -127);
        }
        field525++;
        return this.field568;
    }

    @OriginalMember(owner = "client!wv", name = "LA", descriptor = "(I)V", line = 825)
    public final void method104(int arg0) {
        field549++;
        this.field524 = (short) arg0;
        if (this.field627 != null) {
            this.field627.field10091 = null;
        }
        if (this.field599 != null) {
            this.field599.field10091 = null;
        }
    }

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(I[IIIIIZ)V", line = 843)
    public final void method64(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        field624++;
        int var8 = arg1.length;
        if (arg0 == 0) {
            int var9 = arg4 << 4;
            int var10 = arg2 << 4;
            int var11 = arg3 << 4;
            class146.field1867 = 0;
            class79.field1048 = 0;
            int var12 = 0;
            class752.field10427 = 0;
            for (int var13 = 0; var13 < var8; var13++) {
                int var14 = arg1[var13];
                if (this.field544.length > var14) {
                    int[] var15 = this.field544[var14];
                    for (int var16 = 0; var16 < var15.length; var16++) {
                        int var17 = var15[var16];
                        class146.field1867 += this.field533[var17];
                        class79.field1048 += this.field580[var17];
                        class752.field10427 += this.field553[var17];
                        var12++;
                    }
                }
            }
            if (var12 > 0) {
                class752.field10427 = class752.field10427 / var12 + var9;
                class79.field1048 = class79.field1048 / var12 + var11;
                class146.field1867 = class146.field1867 / var12 + var10;
            } else {
                class146.field1867 = var10;
                class752.field10427 = var9;
                class79.field1048 = var11;
            }
        } else if (arg0 == 1) {
            int var18 = arg2 << 4;
            int var19 = arg3 << 4;
            int var20 = arg4 << 4;
            for (int var21 = 0; var21 < var8; var21++) {
                int var22 = arg1[var21];
                if (this.field544.length > var22) {
                    int[] var23 = this.field544[var22];
                    for (int var24 = 0; var24 < var23.length; var24++) {
                        int var25 = var23[var24];
                        this.field533[var25] += var18;
                        this.field580[var25] += var19;
                        this.field553[var25] += var20;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var26 = 0; var26 < var8; var26++) {
                int var45 = arg1[var26];
                if (var45 < this.field544.length) {
                    int[] var46 = this.field544[var45];
                    if ((arg5 & 0x1) == 0) {
                        for (int var47 = 0; var47 < var46.length; var47++) {
                            int var48 = var46[var47];
                            this.field533[var48] -= class146.field1867;
                            this.field580[var48] -= class79.field1048;
                            this.field553[var48] -= class752.field10427;
                            if (arg4 != 0) {
                                int var49 = class601.field8476[arg4];
                                int var50 = class601.field8473[arg4];
                                int var51 = this.field580[var48] * var49 + this.field533[var48] * var50 + 16383 >> 14;
                                this.field580[var48] = this.field580[var48] * var50 + 16383 - (this.field533[var48] * var49) >> 14;
                                this.field533[var48] = var51;
                            }
                            if (arg2 != 0) {
                                int var52 = class601.field8476[arg2];
                                int var53 = class601.field8473[arg2];
                                int var54 = this.field580[var48] * var53 + 16383 - (this.field553[var48] * var52) >> 14;
                                this.field553[var48] = this.field580[var48] * var52 + (this.field553[var48] * var53) + 16383 >> 14;
                                this.field580[var48] = var54;
                            }
                            if (arg3 != 0) {
                                int var55 = class601.field8476[arg3];
                                int var56 = class601.field8473[arg3];
                                int var57 = this.field553[var48] * var55 + (this.field533[var48] * var56) + 16383 >> 14;
                                this.field553[var48] = this.field553[var48] * var56 + 16383 - (this.field533[var48] * var55) >> 14;
                                this.field533[var48] = var57;
                            }
                            this.field533[var48] += class146.field1867;
                            this.field580[var48] += class79.field1048;
                            this.field553[var48] += class752.field10427;
                        }
                    } else {
                        for (int var58 = 0; var58 < var46.length; var58++) {
                            int var59 = var46[var58];
                            this.field533[var59] -= class146.field1867;
                            this.field580[var59] -= class79.field1048;
                            this.field553[var59] -= class752.field10427;
                            if (arg2 != 0) {
                                int var60 = class601.field8476[arg2];
                                int var61 = class601.field8473[arg2];
                                int var62 = this.field580[var59] * var61 - (this.field553[var59] * var60 - 16383) >> 14;
                                this.field553[var59] = this.field553[var59] * var61 + (this.field580[var59] * var60 + 16383) >> 14;
                                this.field580[var59] = var62;
                            }
                            if (arg4 != 0) {
                                int var63 = class601.field8476[arg4];
                                int var64 = class601.field8473[arg4];
                                int var65 = this.field580[var59] * var63 + (this.field533[var59] * var64) + 16383 >> 14;
                                this.field580[var59] = this.field580[var59] * var64 + 16383 - this.field533[var59] * var63 >> 14;
                                this.field533[var59] = var65;
                            }
                            if (arg3 != 0) {
                                int var66 = class601.field8476[arg3];
                                int var67 = class601.field8473[arg3];
                                int var68 = this.field533[var59] * var67 + this.field553[var59] * var66 + 16383 >> 14;
                                this.field553[var59] = this.field553[var59] * var67 + 16383 - (this.field533[var59] * var66) >> 14;
                                this.field533[var59] = var68;
                            }
                            this.field533[var59] += class146.field1867;
                            this.field580[var59] += class79.field1048;
                            this.field553[var59] += class752.field10427;
                        }
                    }
                }
            }
            if (arg6) {
                for (int var27 = 0; var27 < var8; var27++) {
                    int var28 = arg1[var27];
                    if (this.field544.length > var28) {
                        int[] var29 = this.field544[var28];
                        for (int var30 = 0; var30 < var29.length; var30++) {
                            int var31 = var29[var30];
                            int var32 = this.field620[var31];
                            int var33 = this.field620[var31 + 1];
                            for (int var34 = var32; var34 < var33; var34++) {
                                int var35 = this.field557[var34] - 1;
                                if (var35 == -1) {
                                    break;
                                }
                                if (arg4 != 0) {
                                    int var36 = class601.field8476[arg4];
                                    int var37 = class601.field8473[arg4];
                                    int var38 = this.field588[var35] * var36 + this.field626[var35] * var37 + 16383 >> 14;
                                    this.field588[var35] = (short) (this.field588[var35] * var37 + 16383 - (this.field626[var35] * var36) >> 14);
                                    this.field626[var35] = (short) var38;
                                }
                                if (arg2 != 0) {
                                    int var39 = class601.field8476[arg2];
                                    int var40 = class601.field8473[arg2];
                                    int var41 = this.field588[var35] * var40 + 16383 - (this.field570[var35] * var39) >> 14;
                                    this.field570[var35] = (short) (this.field570[var35] * var40 + this.field588[var35] * var39 + 16383 >> 14);
                                    this.field588[var35] = (short) var41;
                                }
                                if (arg3 != 0) {
                                    int var42 = class601.field8476[arg3];
                                    int var43 = class601.field8473[arg3];
                                    int var44 = this.field570[var35] * var42 + this.field626[var35] * var43 + 16383 >> 14;
                                    this.field570[var35] = (short) (this.field570[var35] * var43 + 16383 - (this.field626[var35] * var42) >> 14);
                                    this.field626[var35] = (short) var44;
                                }
                            }
                        }
                    }
                }
                if (this.field599 == null && this.field627 != null) {
                    this.field627.field10091 = null;
                }
                if (this.field599 != null) {
                    this.field599.field10091 = null;
                }
            }
        } else if (arg0 == 3) {
            for (int var69 = 0; var69 < var8; var69++) {
                int var70 = arg1[var69];
                if (var70 < this.field544.length) {
                    int[] var71 = this.field544[var70];
                    for (int var72 = 0; var72 < var71.length; var72++) {
                        int var73 = var71[var72];
                        this.field533[var73] -= class146.field1867;
                        this.field580[var73] -= class79.field1048;
                        this.field553[var73] -= class752.field10427;
                        this.field533[var73] = this.field533[var73] * arg2 >> 7;
                        this.field580[var73] = this.field580[var73] * arg3 >> 7;
                        this.field553[var73] = this.field553[var73] * arg4 >> 7;
                        this.field533[var73] += class146.field1867;
                        this.field580[var73] += class79.field1048;
                        this.field553[var73] += class752.field10427;
                    }
                }
            }
        } else if (arg0 == 5) {
            if (this.field591 != null) {
                for (int var74 = 0; var74 < var8; var74++) {
                    int var78 = arg1[var74];
                    if (var78 < this.field591.length) {
                        int[] var79 = this.field591[var78];
                        for (int var80 = 0; var80 < var79.length; var80++) {
                            int var81 = var79[var80];
                            int var82 = (this.field613[var81] & 0xFF) + arg2 * 8;
                            if (var82 < 0) {
                                var82 = 0;
                            } else if (var82 > 255) {
                                var82 = 255;
                            }
                            this.field613[var81] = (byte) var82;
                        }
                        if (var79.length > 0 && this.field627 != null) {
                            this.field627.field10091 = null;
                        }
                    }
                }
                if (this.field520 != null) {
                    for (int var75 = 0; var75 < this.field573; var75++) {
                        class664 var76 = this.field520[var75];
                        class10 var77 = this.field565[var75];
                        var77.field221 = var77.field221 & 0xFFFFFF | 255 - (this.field613[var76.field9320] & 0xFF) << 24;
                    }
                }
            }
        } else if (arg0 == 7) {
            if (this.field591 != null) {
                for (int var83 = 0; var83 < var8; var83++) {
                    int var87 = arg1[var83];
                    if (this.field591.length > var87) {
                        int[] var88 = this.field591[var87];
                        for (int var89 = 0; var89 < var88.length; var89++) {
                            int var90 = var88[var89];
                            int var91 = this.field521[var90] & 0xFFFF;
                            int var92 = var91 >> 10 & 0x3F;
                            int var93 = (var91 & 0x3EF) >> 7;
                            int var94 = arg2 + var92 & 0x3F;
                            int var95 = arg3 / 4 + var93;
                            int var96 = var91 & 0x7F;
                            if (var95 < 0) {
                                var95 = 0;
                            } else if (var95 > 7) {
                                var95 = 7;
                            }
                            int var97 = arg4 + var96;
                            if (var97 < 0) {
                                var97 = 0;
                            } else if (var97 > 127) {
                                var97 = 127;
                            }
                            this.field521[var90] = (short) class281.method1904(class281.method1904(var94 << 10, var95 << 7), var97);
                        }
                        if (var88.length > 0 && this.field627 != null) {
                            this.field627.field10091 = null;
                        }
                    }
                }
                if (this.field520 != null) {
                    for (int var84 = 0; var84 < this.field573; var84++) {
                        class664 var85 = this.field520[var84];
                        class10 var86 = this.field565[var84];
                        var86.field221 = class444.field6323[this.field521[var85.field9320] & 0xFFFF] & 0xFFFFFF | var86.field221 & 0xFF000000;
                    }
                }
            }
        } else if (arg0 == 8) {
            if (this.field576 != null) {
                for (int var98 = 0; var98 < var8; var98++) {
                    int var99 = arg1[var98];
                    if (this.field576.length > var99) {
                        int[] var100 = this.field576[var99];
                        for (int var101 = 0; var101 < var100.length; var101++) {
                            class10 var102 = this.field565[var100[var101]];
                            var102.field220 += arg2;
                            var102.field222 += arg3;
                        }
                    }
                }
            }
        } else if (arg0 == 10) {
            if (this.field576 != null) {
                for (int var103 = 0; var103 < var8; var103++) {
                    int var104 = arg1[var103];
                    if (var104 < this.field576.length) {
                        int[] var105 = this.field576[var104];
                        for (int var106 = 0; var106 < var105.length; var106++) {
                            class10 var107 = this.field565[var105[var106]];
                            var107.field227 = var107.field227 * arg2 >> 7;
                            var107.field219 = var107.field219 * arg3 >> 7;
                        }
                    }
                }
            }
        } else if (arg0 == 9 && this.field576 != null) {
            for (int var108 = 0; var108 < var8; var108++) {
                int var109 = arg1[var108];
                if (var109 < this.field576.length) {
                    int[] var110 = this.field576[var109];
                    for (int var111 = 0; var111 < var110.length; var111++) {
                        class10 var112 = this.field565[var110[var111]];
                        var112.field224 = var112.field224 + arg2 & 0x3FFF;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(IBSIB)I", line = 1498)
    private final int method261(int arg0, byte arg1, short arg2, int arg3, byte arg4) {
        field515++;
        int var6 = class444.field6323[class573.method3325(arg0, arg3, -122)];
        if (arg2 != -1) {
            class181 var7 = this.field630.field883.method1263(arg2 & 0xFFFF, (byte) 114);
            int var8 = var7.field2748 & 0xFF;
            if (var8 != 0) {
                int var9;
                if (arg0 < 0) {
                    var9 = 0;
                } else if (arg0 > 127) {
                    var9 = 16777215;
                } else {
                    var9 = arg0 * 131586;
                }
                if (var8 == 256) {
                    var6 = var9;
                } else {
                    int var11 = 256 - var8;
                    var6 = ((var6 & 0xFF00) * var11 + (var9 & 0xFF00) * var8 & 0xFF0000) + ((var6 & 0xFF00FF) * var11 + (var9 & 0xFF00FF) * var8 & 0xFF00FF00) >> 8;
                }
            }
            int var12 = var7.field2739 & 0xFF;
            if (var12 != 0) {
                var12 += 256;
                int var13 = (var6 >> 16 & 0xFF) * var12;
                if (var13 > 65535) {
                    var13 = 65535;
                }
                int var14 = ((var6 & 0xFF00) >> 8) * var12;
                if (var14 > 65535) {
                    var14 = 65535;
                }
                int var15 = (var6 & 0xFF) * var12;
                if (var15 > 65535) {
                    var15 = 65535;
                }
                var6 = (var13 << 8 & 0xFF0096) + (var14 & 0xFF00) + (var15 >> 8);
            }
        }
        int var16 = 21 / ((arg4 + 15) / 59);
        return 255 - ((arg1 & 0xFF) - (var6 << 8));
    }

    @OriginalMember(owner = "client!wv", name = "F", descriptor = "()Z", line = 1570)
    public final boolean method88() {
        field608++;
        return this.field586;
    }

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(I)V", line = 1580)
    public final void method72(int arg0) {
        field610++;
        int var2 = class601.field8476[arg0];
        int var3 = class601.field8473[arg0];
        for (int var4 = 0; var4 < this.field516; var4++) {
            int var5 = this.field553[var4] * var2 + this.field533[var4] * var3 >> 14;
            this.field553[var4] = this.field553[var4] * var3 - (this.field533[var4] * var2) >> 14;
            this.field533[var4] = var5;
        }
        this.field534 = false;
        if (this.field605 != null) {
            this.field605.field10091 = null;
        }
    }

    @OriginalMember(owner = "client!wv", name = "O", descriptor = "(III)V", line = 1620)
    public final void method98(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field516; var4++) {
            if (arg0 != 128) {
                this.field533[var4] = this.field533[var4] * arg0 >> 7;
            }
            if (arg1 != 128) {
                this.field580[var4] = this.field580[var4] * arg1 >> 7;
            }
            if (arg2 != 128) {
                this.field553[var4] = this.field553[var4] * arg2 >> 7;
            }
        }
        field555++;
        if (this.field605 != null) {
            this.field605.field10091 = null;
        }
        this.field534 = false;
    }

    @OriginalMember(owner = "client!wv", name = "da", descriptor = "()I", line = 1652)
    public final int method60() {
        field552++;
        return this.field524;
    }

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(Leh;IZ)V", line = 1663)
    public final void method110(class378 arg0, int arg1, boolean arg2) {
        field554++;
        if (this.field579 == null) {
            return;
        }
        int[] var4 = new int[3];
        for (int var5 = 0; var5 < this.field516; var5++) {
            if ((arg1 & this.field579[var5]) != 0) {
                if (arg2) {
                    arg0.method1961(this.field533[var5], this.field580[var5], this.field553[var5], var4);
                } else {
                    arg0.method1968(this.field533[var5], this.field580[var5], this.field553[var5], var4);
                }
                this.field533[var5] = var4[0];
                this.field580[var5] = var4[1];
                this.field553[var5] = var4[2];
            }
        }
    }

    @OriginalMember(owner = "client!wv", name = "p", descriptor = "(IILs;Ls;III)V", line = 1695)
    public final void method102(int arg0, int arg1, class292 arg2, class292 arg3, int arg4, int arg5, int arg6) {
        if (!this.field534) {
            this.method262((byte) -127);
        }
        field571++;
        int var8 = arg4 + this.field607;
        int var9 = arg4 + this.field568;
        int var10 = arg6 + this.field604;
        int var11 = arg6 + this.field628;
        if (arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5 && var8 < 0 || arg2.field4419 + var9 >> arg2.field4428 >= arg2.field4420 || var10 < 0 || arg2.field4425 <= arg2.field4419 + var11 >> arg2.field4428) {
            return;
        }
        if (arg0 == 4 || arg0 == 5) {
            if (arg3 == null) {
                return;
            }
            if (var8 < 0 || arg3.field4420 <= arg3.field4419 + var9 >> arg3.field4428 || var10 < 0 || (arg3.field4419 + var11 >> arg3.field4428) >= arg3.field4425) {
                return;
            }
        } else {
            int var12 = var8 >> arg2.field4428;
            int var13 = arg2.field4419 + var9 - 1 >> arg2.field4428;
            int var14 = var10 >> arg2.field4428;
            int var15 = -(-arg2.field4419 - var11) - 1 >> arg2.field4428;
            if (arg2.method1976(var12, -1, var14) == arg5 && arg2.method1976(var13, -1, var14) == arg5 && arg5 == arg2.method1976(var12, -1, var15) && arg5 == arg2.method1976(var13, -1, var15)) {
                return;
            }
        }
        if (arg0 == 1) {
            for (int var16 = 0; var16 < this.field516; var16++) {
                this.field580[var16] = this.field580[var16] + arg2.method1977((byte) 117, this.field533[var16] - -arg4, this.field553[var16] + arg6) - arg5;
            }
        } else if (arg0 == 2) {
            short var17 = this.field541;
            if (var17 == 0) {
                return;
            }
            for (int var18 = 0; var18 < this.field516; var18++) {
                int var19 = (this.field580[var18] << 16) / var17;
                if (arg1 > var19) {
                    this.field580[var18] += (arg2.method1977((byte) 117, this.field533[var18] + arg4, this.field553[var18] + arg6) - arg5) * (arg1 - var19) / arg1;
                }
            }
        } else if (arg0 == 3) {
            int var20 = (arg1 & 0xFF) * 4;
            int var21 = ((arg1 & 0xFF1B) >> 8) * 4;
            int var22 = arg1 >> 16 & 0xFF << 6;
            int var23 = arg1 >> 24 & 0xFF << 6;
            if ((arg4 - (var20 >> 1)) < 0 || (arg4 - (-(var20 >> 1) - arg2.field4419)) >= (arg2.field4420 << arg2.field4428) || arg6 - (var21 >> 1) < 0 || (var21 >> 1) + arg6 + arg2.field4419 >= arg2.field4425 << arg2.field4428) {
                return;
            }
            this.method2891(var22, var23, var20, arg6, 2, arg2, arg5, var21, arg4);
        } else if (arg0 == 4) {
            int var31 = this.field569 - this.field541;
            for (int var32 = 0; var32 < this.field516; var32++) {
                this.field580[var32] = this.field580[var32] + arg3.method1977((byte) 124, this.field533[var32] + arg4, this.field553[var32] + arg6) + var31 - arg5;
            }
        } else if (arg0 == 5) {
            int var24 = this.field569 - this.field541;
            for (int var25 = 0; var25 < this.field516; var25++) {
                int var26 = this.field533[var25] + arg4;
                int var27 = this.field553[var25] + arg6;
                int var28 = arg2.method1977((byte) -20, var26, var27);
                int var29 = arg3.method1977((byte) 127, var26, var27);
                int var30 = var28 - var29 - arg1;
                this.field580[var25] = ((this.field580[var25] << 8) / var24 * var30 >> 8) + var28 - arg5;
            }
        }
        this.field534 = false;
        if (this.field605 != null) {
            this.field605.field10091 = null;
        }
    }

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(BIZ)Lka;", line = 1852)
    public final class495 method81(byte arg0, int arg1, boolean arg2) {
        field618++;
        class37 var4;
        class37 var5;
        if (arg0 == 1) {
            var4 = this.field630.field4303;
            var5 = this.field630.field4208;
        } else if (arg0 == 2) {
            var4 = this.field630.field4277;
            var5 = this.field630.field4281;
        } else if (arg0 == 3) {
            var4 = this.field630.field4259;
            var5 = this.field630.field4275;
        } else if (arg0 == 4) {
            var4 = this.field630.field4270;
            var5 = this.field630.field4306;
        } else if (arg0 == 5) {
            var5 = this.field630.field4280;
            var4 = this.field630.field4302;
        } else {
            var5 = var4 = new class37(this.field630);
        }
        return this.method266((byte) -126, var4, arg2, arg1, var5, arg0 != 0);
    }

    @OriginalMember(owner = "client!wv", name = "V", descriptor = "()I", line = 1900)
    public final int method97() {
        field615++;
        if (!this.field534) {
            this.method262((byte) -127);
        }
        return this.field607;
    }

    @OriginalMember(owner = "client!wv", name = "v", descriptor = "()V", line = 1913)
    public final void method117() {
        for (int var1 = 0; var1 < this.field516; var1++) {
            this.field553[var1] = -this.field553[var1];
        }
        field590++;
        for (int var2 = 0; var2 < this.field560; var2++) {
            this.field570[var2] = (short) (-this.field570[var2]);
        }
        for (int var3 = 0; var3 < this.field551; var3++) {
            short var4 = this.field567[var3];
            this.field567[var3] = this.field581[var3];
            this.field581[var3] = var4;
        }
        if (this.field599 == null && this.field627 != null) {
            this.field627.field10091 = null;
        }
        if (this.field599 != null) {
            this.field599.field10091 = null;
        }
        if (this.field605 != null) {
            this.field605.field10091 = null;
        }
        this.field534 = false;
        if (this.field617 != null) {
            this.field617.field1285 = null;
        }
    }

    @OriginalMember(owner = "client!wv", name = "ba", descriptor = "(Lr;)Lr;", line = 1966)
    public final class192 method86(class192 arg0) {
        field592++;
        if (this.field560 == 0) {
            return null;
        }
        if (!this.field534) {
            this.method262((byte) -127);
        }
        int var2;
        int var3;
        if (this.field630.field4299 <= 0) {
            var2 = this.field607 - (this.field630.field4299 * this.field541 >> 8) >> this.field630.field4165;
            var3 = this.field568 - (this.field630.field4299 * this.field569 >> 8) >> this.field630.field4165;
        } else {
            var2 = this.field607 - (this.field630.field4299 * this.field569 >> 8) >> this.field630.field4165;
            var3 = this.field568 - (this.field630.field4299 * this.field541 >> 8) >> this.field630.field4165;
        }
        int var4;
        int var5;
        if (this.field630.field4229 > 0) {
            var4 = this.field604 - (this.field630.field4229 * this.field569 >> 8) >> this.field630.field4165;
            var5 = this.field628 - (this.field630.field4229 * this.field541 >> 8) >> this.field630.field4165;
        } else {
            var4 = this.field604 - (this.field630.field4229 * this.field541 >> 8) >> this.field630.field4165;
            var5 = this.field628 - (this.field630.field4229 * this.field569 >> 8) >> this.field630.field4165;
        }
        int var6 = var3 + 1 - var2;
        int var7 = var5 + 1 - var4;
        class519 var8 = (class519) arg0;
        class519 var9;
        if (var8 != null && var8.method3020(var6, 0, var7)) {
            var9 = var8;
            var8.method3021(-95);
        } else {
            var9 = new class519(this.field630, var6, var7);
        }
        var9.method3024((byte) -89, var3, var5, var2, var4);
        this.method270(var9, -24784);
        return var9;
    }

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(B)V", line = 2029)
    private final void method262(byte arg0) {
        field598++;
        int var2 = 32767;
        if (arg0 != -127) {
            field597 = -0.41602796F;
        }
        int var3 = 32767;
        int var4 = 32767;
        int var5 = -32768;
        int var6 = -32768;
        int var7 = -32768;
        int var8 = 0;
        int var9 = 0;
        for (int var10 = 0; var10 < this.field516; var10++) {
            int var11 = this.field533[var10];
            int var12 = this.field580[var10];
            int var13 = this.field553[var10];
            if (var11 > var5) {
                var5 = var11;
            }
            if (var12 < var3) {
                var3 = var12;
            }
            if (var12 > var6) {
                var6 = var12;
            }
            if (var2 > var11) {
                var2 = var11;
            }
            if (var7 < var13) {
                var7 = var13;
            }
            if (var13 < var4) {
                var4 = var13;
            }
            int var14 = var11 * var11 + var13 * var13;
            if (var8 < var14) {
                var8 = var14;
            }
            int var15 = var12 * var12 + var11 * var11 + var13 * var13;
            if (var15 > var9) {
                var9 = var15;
            }
        }
        this.field569 = (short) var6;
        this.field607 = (short) var2;
        this.field628 = (short) var7;
        this.field568 = (short) var5;
        this.field604 = (short) var4;
        this.field541 = (short) var3;
        this.field583 = (short) ((int) (Math.sqrt((double) var8) + 0.99D));
        this.field512 = (short) ((int) (Math.sqrt((double) var9) + 0.99D));
        this.field534 = true;
    }

    @OriginalMember(owner = "client!wv", name = "I", descriptor = "(I[IIIIZI[I)V", line = 2107)
    public final void method66(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7) {
        field509++;
        int var9 = arg1.length;
        if (arg0 == 0) {
            int var10 = arg3 << 4;
            int var11 = arg4 << 4;
            int var12 = arg2 << 4;
            int var13 = 0;
            class79.field1048 = 0;
            class146.field1867 = 0;
            class752.field10427 = 0;
            for (int var14 = 0; var14 < var9; var14++) {
                int var15 = arg1[var14];
                if (this.field544.length > var15) {
                    int[] var16 = this.field544[var15];
                    for (int var17 = 0; var17 < var16.length; var17++) {
                        int var18 = var16[var17];
                        if (this.field579 == null || (this.field579[var18] & arg6) != 0) {
                            class146.field1867 += this.field533[var18];
                            class79.field1048 += this.field580[var18];
                            class752.field10427 += this.field553[var18];
                            var13++;
                        }
                    }
                }
            }
            if (var13 > 0) {
                class572.field8100 = true;
                class752.field10427 = class752.field10427 / var13 + var11;
                class146.field1867 = class146.field1867 / var13 + var12;
                class79.field1048 = class79.field1048 / var13 + var10;
            } else {
                class752.field10427 = var11;
                class146.field1867 = var12;
                class79.field1048 = var10;
            }
        } else if (arg0 == 1) {
            if (arg7 != null) {
                int var19 = arg7[2] * arg4 + arg7[0] * arg2 + arg7[1] * arg3 + 8192 >> 14;
                int var20 = arg7[5] * arg4 + arg7[4] * arg3 + arg7[3] * arg2 + 8192 >> 14;
                int var21 = arg7[8] * arg4 + arg7[7] * arg3 + arg7[6] * arg2 + 8192 >> 14;
                arg4 = var21;
                arg3 = var20;
                arg2 = var19;
            }
            int var22 = arg2 << 4;
            int var23 = arg3 << 4;
            int var24 = arg4 << 4;
            for (int var25 = 0; var25 < var9; var25++) {
                int var26 = arg1[var25];
                if (var26 < this.field544.length) {
                    int[] var27 = this.field544[var26];
                    for (int var28 = 0; var28 < var27.length; var28++) {
                        int var29 = var27[var28];
                        if (this.field579 == null || (arg6 & this.field579[var29]) != 0) {
                            this.field533[var29] += var22;
                            this.field580[var29] += var23;
                            this.field553[var29] += var24;
                        }
                    }
                }
            }
        } else if (arg0 == 2) {
            if (arg7 == null) {
                for (int var90 = 0; var90 < var9; var90++) {
                    int var109 = arg1[var90];
                    if (var109 < this.field544.length) {
                        int[] var110 = this.field544[var109];
                        for (int var111 = 0; var111 < var110.length; var111++) {
                            int var112 = var110[var111];
                            if (this.field579 == null || (this.field579[var112] & arg6) != 0) {
                                this.field533[var112] -= class146.field1867;
                                this.field580[var112] -= class79.field1048;
                                this.field553[var112] -= class752.field10427;
                                if (arg4 != 0) {
                                    int var113 = class601.field8476[arg4];
                                    int var114 = class601.field8473[arg4];
                                    int var115 = this.field580[var112] * var113 + this.field533[var112] * var114 + 16383 >> 14;
                                    this.field580[var112] = this.field580[var112] * var114 + 16383 - this.field533[var112] * var113 >> 14;
                                    this.field533[var112] = var115;
                                }
                                if (arg2 != 0) {
                                    int var116 = class601.field8476[arg2];
                                    int var117 = class601.field8473[arg2];
                                    int var118 = this.field580[var112] * var117 + 16383 - (this.field553[var112] * var116) >> 14;
                                    this.field553[var112] = this.field580[var112] * var116 + this.field553[var112] * var117 + 16383 >> 14;
                                    this.field580[var112] = var118;
                                }
                                if (arg3 != 0) {
                                    int var119 = class601.field8476[arg3];
                                    int var120 = class601.field8473[arg3];
                                    int var121 = this.field553[var112] * var119 + (this.field533[var112] * var120) + 16383 >> 14;
                                    this.field553[var112] = this.field553[var112] * var120 + 16383 - (this.field533[var112] * var119) >> 14;
                                    this.field533[var112] = var121;
                                }
                                this.field533[var112] += class146.field1867;
                                this.field580[var112] += class79.field1048;
                                this.field553[var112] += class752.field10427;
                            }
                        }
                    }
                }
                if (arg5) {
                    for (int var91 = 0; var91 < var9; var91++) {
                        int var92 = arg1[var91];
                        if (this.field544.length > var92) {
                            int[] var93 = this.field544[var92];
                            for (int var94 = 0; var94 < var93.length; var94++) {
                                int var95 = var93[var94];
                                if (this.field579 == null || (arg6 & this.field579[var95]) != 0) {
                                    int var96 = this.field620[var95];
                                    int var97 = this.field620[var95 + 1];
                                    for (int var98 = var96; var98 < var97; var98++) {
                                        int var99 = this.field557[var98] - 1;
                                        if (var99 == -1) {
                                            break;
                                        }
                                        if (arg4 != 0) {
                                            int var100 = class601.field8476[arg4];
                                            int var101 = class601.field8473[arg4];
                                            int var102 = this.field588[var99] * var100 + (this.field626[var99] * var101) + 16383 >> 14;
                                            this.field588[var99] = (short) (this.field588[var99] * var101 + 16383 - (this.field626[var99] * var100) >> 14);
                                            this.field626[var99] = (short) var102;
                                        }
                                        if (arg2 != 0) {
                                            int var103 = class601.field8476[arg2];
                                            int var104 = class601.field8473[arg2];
                                            int var105 = this.field588[var99] * var104 + 16383 - (this.field570[var99] * var103) >> 14;
                                            this.field570[var99] = (short) (this.field570[var99] * var104 + (this.field588[var99] * var103 + 16383) >> 14);
                                            this.field588[var99] = (short) var105;
                                        }
                                        if (arg3 != 0) {
                                            int var106 = class601.field8476[arg3];
                                            int var107 = class601.field8473[arg3];
                                            int var108 = this.field570[var99] * var106 + this.field626[var99] * var107 + 16383 >> 14;
                                            this.field570[var99] = (short) (this.field570[var99] * var107 + 16383 - (this.field626[var99] * var106) >> 14);
                                            this.field626[var99] = (short) var108;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (this.field599 == null && this.field627 != null) {
                        this.field627.field10091 = null;
                    }
                    if (this.field599 != null) {
                        this.field599.field10091 = null;
                    }
                }
            } else {
                int var30 = arg7[9] << 4;
                int var31 = arg7[10] << 4;
                int var32 = arg7[11] << 4;
                int var33 = arg7[12] << 4;
                int var34 = arg7[13] << 4;
                int var35 = arg7[14] << 4;
                if (class572.field8100) {
                    int var36 = arg7[0] * class146.field1867 + (arg7[3] * class79.field1048) + arg7[6] * class752.field10427 + 8192 >> 14;
                    int var37 = arg7[4] * class79.field1048 + arg7[1] * class146.field1867 + (arg7[7] * class752.field10427) + 8192 >> 14;
                    int var38 = var33 + var36;
                    int var39 = var34 + var37;
                    int var40 = arg7[2] * class146.field1867 + (arg7[8] * class752.field10427) + arg7[5] * class79.field1048 + 8192 >> 14;
                    class146.field1867 = var38;
                    int var41 = var35 + var40;
                    class79.field1048 = var39;
                    class572.field8100 = false;
                    class752.field10427 = var41;
                }
                int[] var42 = new int[9];
                int var43 = class601.field8473[arg2];
                int var44 = class601.field8476[arg2];
                int var45 = class601.field8473[arg3];
                int var46 = class601.field8476[arg3];
                int var47 = class601.field8473[arg4];
                int var48 = class601.field8476[arg4];
                int var49 = var44 * var47 + 8192 >> 14;
                int var50 = var44 * var48 + 8192 >> 14;
                var42[6] = -var46 * var47 + var45 * var50 + 8192 >> 14;
                var42[7] = var45 * var49 + var46 * var48 + 8192 >> 14;
                var42[2] = var43 * var46 + 8192 >> 14;
                var42[0] = var46 * var50 + var45 * var47 + 8192 >> 14;
                var42[8] = var43 * var45 + 8192 >> 14;
                var42[5] = -var44;
                var42[1] = -var45 * var48 + var46 * var49 + 8192 >> 14;
                var42[3] = var43 * var48 + 8192 >> 14;
                var42[4] = var43 * var47 + 8192 >> 14;
                int var51 = var42[0] * -class146.field1867 + var42[2] * -class752.field10427 + var42[1] * -class79.field1048 + 8192 >> 14;
                int var52 = var42[3] * -class146.field1867 + (var42[4] * -class79.field1048) + var42[5] * -class752.field10427 + 8192 >> 14;
                int var53 = var42[7] * -class79.field1048 + var42[6] * -class146.field1867 + (var42[8] * -class752.field10427) + 8192 >> 14;
                int var54 = class146.field1867 + var51;
                int var55 = class79.field1048 + var52;
                int var56 = class752.field10427 + var53;
                int[] var57 = new int[9];
                for (int var58 = 0; var58 < 3; var58++) {
                    for (int var87 = 0; var87 < 3; var87++) {
                        int var88 = 0;
                        for (int var89 = 0; var89 < 3; var89++) {
                            var88 += var42[var58 * 3 + var89] * arg7[var87 * 3 + var89];
                        }
                        var57[var58 * 3 + var87] = var88 + 8192 >> 14;
                    }
                }
                int var59 = var42[2] * var35 + var42[0] * var33 + (var42[1] * var34) + 8192 >> 14;
                int var60 = var42[5] * var35 + var42[3] * var33 + (var42[4] * var34) + 8192 >> 14;
                int var61 = var55 + var60;
                int var62 = var54 + var59;
                int var63 = var42[6] * var33 + (var42[7] * var34 + var42[8] * var35 + 8192) >> 14;
                int var64 = var56 + var63;
                int[] var65 = new int[9];
                for (int var66 = 0; var66 < 3; var66++) {
                    for (int var84 = 0; var84 < 3; var84++) {
                        int var85 = 0;
                        for (int var86 = 0; var86 < 3; var86++) {
                            var85 += arg7[var66 * 3 + var86] * var57[var86 * 3 + var84];
                        }
                        var65[var66 * 3 + var84] = var85 + 8192 >> 14;
                    }
                }
                int var67 = arg7[1] * var61 + arg7[0] * var62 + arg7[2] * var64 + 8192 >> 14;
                int var68 = arg7[4] * var61 + arg7[3] * var62 + (arg7[5] * var64) + 8192 >> 14;
                int var69 = var31 + var68;
                int var70 = var30 + var67;
                int var71 = arg7[8] * var64 + arg7[6] * var62 + arg7[7] * var61 + 8192 >> 14;
                int var72 = var32 + var71;
                for (int var73 = 0; var73 < var9; var73++) {
                    int var74 = arg1[var73];
                    if (this.field544.length > var74) {
                        int[] var75 = this.field544[var74];
                        for (int var76 = 0; var76 < var75.length; var76++) {
                            int var77 = var75[var76];
                            if (this.field579 == null || (this.field579[var77] & arg6) != 0) {
                                int var78 = this.field580[var77] * var65[1] + this.field553[var77] * var65[2] + this.field533[var77] * var65[0] + 8192 >> 14;
                                int var79 = this.field553[var77] * var65[5] + this.field580[var77] * var65[4] + this.field533[var77] * var65[3] + 8192 >> 14;
                                int var80 = var69 + var79;
                                int var81 = this.field553[var77] * var65[8] + this.field580[var77] * var65[7] + this.field533[var77] * var65[6] + 8192 >> 14;
                                int var82 = var70 + var78;
                                this.field533[var77] = var82;
                                int var83 = var72 + var81;
                                this.field580[var77] = var80;
                                this.field553[var77] = var83;
                            }
                        }
                    }
                }
            }
        } else if (arg0 == 3) {
            if (arg7 == null) {
                for (int var122 = 0; var122 < var9; var122++) {
                    int var123 = arg1[var122];
                    if (this.field544.length > var123) {
                        int[] var124 = this.field544[var123];
                        for (int var125 = 0; var125 < var124.length; var125++) {
                            int var126 = var124[var125];
                            if (this.field579 == null || (arg6 & this.field579[var126]) != 0) {
                                this.field533[var126] -= class146.field1867;
                                this.field580[var126] -= class79.field1048;
                                this.field553[var126] -= class752.field10427;
                                this.field533[var126] = this.field533[var126] * arg2 >> 7;
                                this.field580[var126] = this.field580[var126] * arg3 >> 7;
                                this.field553[var126] = this.field553[var126] * arg4 >> 7;
                                this.field533[var126] += class146.field1867;
                                this.field580[var126] += class79.field1048;
                                this.field553[var126] += class752.field10427;
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
                if (class572.field8100) {
                    int var133 = arg7[6] * class752.field10427 + arg7[3] * class79.field1048 + arg7[0] * class146.field1867 + 8192 >> 14;
                    int var134 = arg7[1] * class146.field1867 - (-(arg7[4] * class79.field1048) - (arg7[7] * class752.field10427 + 8192)) >> 14;
                    int var135 = var130 + var133;
                    int var136 = var131 + var134;
                    int var137 = arg7[5] * class79.field1048 + arg7[2] * class146.field1867 + arg7[8] * class752.field10427 + 8192 >> 14;
                    class146.field1867 = var135;
                    int var138 = var132 + var137;
                    class79.field1048 = var136;
                    class572.field8100 = false;
                    class752.field10427 = var138;
                }
                int var139 = arg2 << 15 >> 7;
                int var140 = arg3 << 15 >> 7;
                int var141 = arg4 << 15 >> 7;
                int var142 = -class146.field1867 * var139 + 8192 >> 14;
                int var143 = -class79.field1048 * var140 + 8192 >> 14;
                int var144 = -class752.field10427 * var141 + 8192 >> 14;
                int var145 = class146.field1867 + var142;
                int var146 = class79.field1048 + var143;
                int var147 = class752.field10427 + var144;
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
                int var157 = arg7[1] * var152 + (arg7[0] * var153 + (arg7[2] * var154)) + 8192 >> 14;
                int var158 = arg7[5] * var154 + arg7[3] * var153 + (arg7[4] * var152) + 8192 >> 14;
                int var159 = var128 + var158;
                int var160 = arg7[8] * var154 + (arg7[6] * var153 + (arg7[7] * var152)) + 8192 >> 14;
                int var161 = var127 + var157;
                int var162 = var129 + var160;
                for (int var163 = 0; var163 < var9; var163++) {
                    int var164 = arg1[var163];
                    if (this.field544.length > var164) {
                        int[] var165 = this.field544[var164];
                        for (int var166 = 0; var166 < var165.length; var166++) {
                            int var167 = var165[var166];
                            if (this.field579 == null || (this.field579[var167] & arg6) != 0) {
                                int var168 = this.field553[var167] * var155[2] + this.field580[var167] * var155[1] + this.field533[var167] * var155[0] + 8192 >> 14;
                                int var169 = this.field580[var167] * var155[4] + this.field533[var167] * var155[3] + this.field553[var167] * var155[5] + 8192 >> 14;
                                int var170 = var161 + var168;
                                int var171 = this.field580[var167] * var155[7] + this.field533[var167] * var155[6] + this.field553[var167] * var155[8] + 8192 >> 14;
                                int var172 = var159 + var169;
                                int var173 = var162 + var171;
                                this.field533[var167] = var170;
                                this.field580[var167] = var172;
                                this.field553[var167] = var173;
                            }
                        }
                    }
                }
            }
        } else if (arg0 == 5) {
            if (this.field591 != null) {
                for (int var177 = 0; var177 < var9; var177++) {
                    int var181 = arg1[var177];
                    if (var181 < this.field591.length) {
                        int[] var182 = this.field591[var181];
                        for (int var183 = 0; var183 < var182.length; var183++) {
                            int var184 = var182[var183];
                            if (this.field589 == null || (this.field589[var184] & arg6) != 0) {
                                int var185 = (this.field613[var184] & 0xFF) + (arg2 * 8);
                                if (var185 < 0) {
                                    var185 = 0;
                                } else if (var185 > 255) {
                                    var185 = 255;
                                }
                                this.field613[var184] = (byte) var185;
                                if (this.field627 != null) {
                                    this.field627.field10091 = null;
                                }
                            }
                        }
                    }
                }
                if (this.field520 != null) {
                    for (int var178 = 0; var178 < this.field573; var178++) {
                        class664 var179 = this.field520[var178];
                        class10 var180 = this.field565[var178];
                        var180.field221 = var180.field221 & 0xFFFFFF | 255 - (this.field613[var179.field9320] & 0xFF) << 24;
                    }
                }
            }
        } else if (arg0 == 7) {
            if (this.field591 != null) {
                for (int var186 = 0; var186 < var9; var186++) {
                    int var190 = arg1[var186];
                    if (this.field591.length > var190) {
                        int[] var191 = this.field591[var190];
                        for (int var192 = 0; var192 < var191.length; var192++) {
                            int var193 = var191[var192];
                            if (this.field589 == null || (this.field589[var193] & arg6) != 0) {
                                int var194 = this.field521[var193] & 0xFFFF;
                                int var195 = (var194 & 0xFC5A) >> 10;
                                int var196 = var194 >> 7 & 0x7;
                                int var197 = var194 & 0x7F;
                                int var198 = arg2 + var195 & 0x3F;
                                int var199 = arg3 / 4 + var196;
                                if (var199 < 0) {
                                    var199 = 0;
                                } else if (var199 > 7) {
                                    var199 = 7;
                                }
                                int var200 = arg4 + var197;
                                if (var200 < 0) {
                                    var200 = 0;
                                } else if (var200 > 127) {
                                    var200 = 127;
                                }
                                this.field521[var193] = (short) class281.method1904(class281.method1904(var198 << 10, var199 << 7), var200);
                                if (this.field627 != null) {
                                    this.field627.field10091 = null;
                                }
                            }
                        }
                    }
                }
                if (this.field520 != null) {
                    for (int var187 = 0; var187 < this.field573; var187++) {
                        class664 var188 = this.field520[var187];
                        class10 var189 = this.field565[var187];
                        var189.field221 = var189.field221 & 0xFF000000 | class444.field6323[this.field521[var188.field9320] & 0xFFFF] & 0xFFFFFF;
                    }
                }
            }
        } else if (arg0 == 8) {
            if (this.field576 != null) {
                for (int var201 = 0; var201 < var9; var201++) {
                    int var202 = arg1[var201];
                    if (this.field576.length > var202) {
                        int[] var203 = this.field576[var202];
                        for (int var204 = 0; var204 < var203.length; var204++) {
                            class10 var205 = this.field565[var203[var204]];
                            var205.field220 += arg2;
                            var205.field222 += arg3;
                        }
                    }
                }
            }
        } else if (arg0 == 10) {
            if (this.field576 != null) {
                for (int var206 = 0; var206 < var9; var206++) {
                    int var207 = arg1[var206];
                    if (var207 < this.field576.length) {
                        int[] var208 = this.field576[var207];
                        for (int var209 = 0; var209 < var208.length; var209++) {
                            class10 var210 = this.field565[var208[var209]];
                            var210.field219 = var210.field219 * arg3 >> 7;
                            var210.field227 = var210.field227 * arg2 >> 7;
                        }
                    }
                }
            }
        } else if (arg0 == 9 && this.field576 != null) {
            for (int var211 = 0; var211 < var9; var211++) {
                int var212 = arg1[var211];
                if (this.field576.length > var212) {
                    int[] var213 = this.field576[var212];
                    for (int var214 = 0; var214 < var213.length; var214++) {
                        class10 var215 = this.field565[var213[var214]];
                        var215.field224 = var215.field224 + arg2 & 0x3FFF;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!wv", name = "r", descriptor = "()Z", line = 3090)
    public final boolean method68() {
        field587++;
        return this.field584;
    }

    @OriginalMember(owner = "client!wv", name = "WA", descriptor = "()I", line = 3098)
    public final int method92() {
        field522++;
        return this.field537;
    }

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(FIIIIIILhm;JF)S", line = 3107)
    private final short method263(float arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class229 arg7, long arg8, float arg9) {
        field540++;
        int var12 = this.field620[arg1];
        int var13 = this.field620[arg1 + 1];
        int var14 = 0;
        for (int var15 = var12; var15 < var13; var15++) {
            short var16 = this.field557[var15];
            if (var16 == 0) {
                var14 = var15;
                break;
            }
            if (class687.field9740[var15] == arg8) {
                return (short) (var16 - 1);
            }
        }
        this.field557[var14] = (short) (this.field560 + 1);
        class687.field9740[var14] = arg8;
        this.field626[this.field560] = (short) arg6;
        this.field588[this.field560] = (short) arg5;
        this.field570[this.field560] = (short) arg3;
        this.field572[this.field560] = (byte) arg2;
        this.field527[this.field560] = arg0;
        if (arg4 == -27771) {
            this.field542[this.field560] = arg9;
            return (short) (this.field560++);
        } else {
            return -39;
        }
    }

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(IILeh;ZII)Z", line = 3161)
    public final boolean method84(int arg0, int arg1, class378 arg2, boolean arg3, int arg4, int arg5) {
        field611++;
        return this.method269(arg4, arg0, arg1, arg5, (byte) 98, arg2, arg3);
    }

    @OriginalMember(owner = "client!wv", name = "b", descriptor = "(ZI)V", line = 3169)
    private final void method264(boolean arg0, int arg1) {
        field629++;
        boolean var3 = this.field627 != null && this.field627.field10091 == null;
        boolean var4 = this.field599 != null && this.field599.field10091 == null;
        if (arg1 != 0) {
            this.method260(20, 99, 22, 43, -118, 98, -99, -40, -12);
        }
        boolean var5 = this.field605 != null && this.field605.field10091 == null;
        boolean var6 = this.field566 != null && this.field566.field10091 == null;
        if (arg0) {
            var5 &= (this.field548 & 0x1) != 0;
            var6 &= (this.field548 & 0x8) != 0;
            var3 &= (this.field548 & 0x2) != 0;
            var4 &= (this.field548 & 0x4) != 0;
        }
        byte var7 = 0;
        byte var8 = 0;
        byte var9 = 0;
        byte var10 = 0;
        byte var11 = 0;
        if (var5) {
            var8 = var7;
            var7 = (byte) (var7 + 12);
        }
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
        if (this.field630.field4231.field1556.length >= (this.field560 * var7)) {
            this.field630.field4231.field1521 = 0;
        } else {
            this.field630.field4231 = new class186((this.field560 + 100) * var7);
        }
        class186 var12 = this.field630.field4231;
        if (var5) {
            if (this.field630.field4230) {
                for (int var13 = 0; var13 < this.field516; var13++) {
                    int var14 = Stream.floatToRawIntBits((float) this.field533[var13]);
                    int var15 = Stream.floatToRawIntBits((float) this.field580[var13]);
                    int var16 = Stream.floatToRawIntBits((float) this.field553[var13]);
                    int var17 = this.field620[var13];
                    int var18 = this.field620[var13 + 1];
                    for (int var19 = var17; var19 < var18; var19++) {
                        int var20 = this.field557[var19] - 1;
                        if (var20 == -1) {
                            break;
                        }
                        var12.field1521 = var7 * var20;
                        var12.method879((byte) 102, var14);
                        var12.method879((byte) 72, var15);
                        var12.method879((byte) -69, var16);
                    }
                }
            } else {
                for (int var21 = 0; var21 < this.field516; var21++) {
                    int var22 = Stream.floatToRawIntBits((float) this.field533[var21]);
                    int var23 = Stream.floatToRawIntBits((float) this.field580[var21]);
                    int var24 = Stream.floatToRawIntBits((float) this.field553[var21]);
                    int var25 = this.field620[var21];
                    int var26 = this.field620[var21 + 1];
                    for (int var27 = var25; var27 < var26; var27++) {
                        int var28 = this.field557[var27] - 1;
                        if (var28 == -1) {
                            break;
                        }
                        var12.field1521 = var7 * var28;
                        var12.method884(var22, 112);
                        var12.method884(var23, -81);
                        var12.method884(var24, arg1 ^ 0xFFFFFFF8);
                    }
                }
            }
        }
        if (var3) {
            if (this.field599 == null) {
                short[] var31;
                byte[] var32;
                short[] var33;
                short[] var34;
                if (this.field511 == null) {
                    var31 = this.field626;
                    var32 = this.field572;
                    var33 = this.field588;
                    var34 = this.field570;
                } else {
                    var32 = this.field511.field4717;
                    var31 = this.field511.field4719;
                    var33 = this.field511.field4716;
                    var34 = this.field511.field4715;
                }
                float var35 = this.field630.field4260[0];
                float var36 = this.field630.field4260[1];
                float var37 = this.field630.field4260[2];
                float var38 = this.field630.field4248;
                float var39 = this.field630.field4209 * 768.0F / (float) this.field524;
                float var40 = this.field630.field4253 * 768.0F / (float) this.field524;
                for (int var41 = 0; var41 < this.field551; var41++) {
                    int var42 = this.method261(this.field537, this.field613[var41], this.field559[var41], this.field521[var41], (byte) 65);
                    float var43 = (float) (var42 >> 16 & 0xFF) * this.field630.field4220;
                    float var44 = (float) ((var42 & 0xFFD5) >> 8) * this.field630.field4203;
                    float var45 = (float) (var42 >>> 24) * this.field630.field4232;
                    short var46 = this.field567[var41];
                    short var47 = (short) var32[var46];
                    float var48;
                    if (var47 == 0) {
                        var48 = ((float) var34[var46] * var37 + (float) var31[var46] * var35 + (float) var33[var46] * var36) * 0.0026041667F;
                    } else {
                        var48 = ((float) var34[var46] * var37 + (float) var31[var46] * var35 + (float) var33[var46] * var36) / (float) (var47 * 256);
                    }
                    float var49 = var38 + var48 * ((var48 < 0.0F) ? var40 : var39);
                    int var50 = (int) (var45 * var49);
                    int var51 = (int) (var43 * var49);
                    if (var50 < 0) {
                        var50 = 0;
                    } else if (var50 > 255) {
                        var50 = 255;
                    }
                    int var52 = (int) (var44 * var49);
                    if (var51 < 0) {
                        var51 = 0;
                    } else if (var51 > 255) {
                        var51 = 255;
                    }
                    var12.field1521 = var7 * var46 + var9;
                    if (var52 < 0) {
                        var52 = 0;
                    } else if (var52 > 255) {
                        var52 = 255;
                    }
                    var12.method851((byte) -2, var50);
                    var12.method851((byte) -2, var51);
                    var12.method851((byte) -2, var52);
                    var12.method851((byte) -2, 255 - (this.field613[var41] & 0xFF));
                    short var53 = this.field614[var41];
                    short var54 = (short) var32[var53];
                    float var55;
                    if (var54 == 0) {
                        var55 = ((float) var34[var53] * var37 + (float) var31[var53] * var35 + (float) var33[var53] * var36) * 0.0026041667F;
                    } else {
                        var55 = ((float) var34[var53] * var37 + (float) var31[var53] * var35 + (float) var33[var53] * var36) / (float) (var54 * 256);
                    }
                    float var56 = var38 + var55 * (var55 < 0.0F ? var40 : var39);
                    int var57 = (int) (var45 * var56);
                    int var58 = (int) (var43 * var56);
                    if (var57 < 0) {
                        var57 = 0;
                    } else if (var57 > 255) {
                        var57 = 255;
                    }
                    if (var58 < 0) {
                        var58 = 0;
                    } else if (var58 > 255) {
                        var58 = 255;
                    }
                    int var59 = (int) (var44 * var56);
                    var12.field1521 = var9 + (var7 * var53);
                    if (var59 < 0) {
                        var59 = 0;
                    } else if (var59 > 255) {
                        var59 = 255;
                    }
                    var12.method851((byte) -2, var57);
                    var12.method851((byte) -2, var58);
                    var12.method851((byte) -2, var59);
                    var12.method851((byte) -2, 255 - (this.field613[var41] & 0xFF));
                    short var60 = this.field581[var41];
                    short var61 = (short) var32[var60];
                    float var62;
                    if (var61 == 0) {
                        var62 = ((float) var34[var60] * var37 + (float) var31[var60] * var35 + (float) var33[var60] * var36) * 0.0026041667F;
                    } else {
                        var62 = ((float) var34[var60] * var37 + (float) var31[var60] * var35 + (float) var33[var60] * var36) / (float) (var61 * 256);
                    }
                    float var63 = var38 + ((var62 < 0.0F) ? var40 : var39) * var62;
                    int var64 = (int) (var45 * var63);
                    int var65 = (int) (var43 * var63);
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
                    if (var66 < 0) {
                        var66 = 0;
                    } else if (var66 > 255) {
                        var66 = 255;
                    }
                    var12.field1521 = var7 * var60 + var9;
                    var12.method851((byte) -2, var64);
                    var12.method851((byte) -2, var65);
                    var12.method851((byte) -2, var66);
                    var12.method851((byte) -2, 255 - (this.field613[var41] & 0xFF));
                }
            } else {
                for (int var29 = 0; var29 < this.field551; var29++) {
                    int var30 = this.method261(this.field537, this.field613[var29], this.field559[var29], this.field521[var29], (byte) 94);
                    var12.field1521 = var9 + (this.field567[var29] * var7);
                    var12.method879((byte) -101, var30);
                    var12.field1521 = this.field614[var29] * var7 + var9;
                    var12.method879((byte) 83, var30);
                    var12.field1521 = this.field581[var29] * var7 + var9;
                    var12.method879((byte) 94, var30);
                }
            }
        }
        if (var4) {
            short[] var67;
            short[] var68;
            short[] var69;
            byte[] var70;
            if (this.field511 == null) {
                var69 = this.field588;
                var68 = this.field570;
                var67 = this.field626;
                var70 = this.field572;
            } else {
                var67 = this.field511.field4719;
                var68 = this.field511.field4715;
                var69 = this.field511.field4716;
                var70 = this.field511.field4717;
            }
            float var71 = 3.0F / (float) this.field524;
            float var72 = 3.0F / (float) (this.field524 / 2 + this.field524);
            var12.field1521 = var10;
            if (this.field630.field4230) {
                for (int var76 = 0; var76 < this.field560; var76++) {
                    int var77 = var70[var76] & 0xFF;
                    if (var77 == 0) {
                        var12.method1383((byte) -113, (float) var67[var76] * var72);
                        var12.method1383((byte) -122, (float) var69[var76] * var72);
                        var12.method1383((byte) 125, (float) var68[var76] * var72);
                    } else {
                        float var78 = var71 / (float) var77;
                        var12.method1383((byte) -114, (float) var67[var76] * var78);
                        var12.method1383((byte) -127, (float) var69[var76] * var78);
                        var12.method1383((byte) -123, (float) var68[var76] * var78);
                    }
                    var12.field1521 += var7 - 12;
                }
            } else {
                for (int var73 = 0; var73 < this.field560; var73++) {
                    int var74 = var70[var73] & 0xFF;
                    if (var74 == 0) {
                        var12.method1381((float) var67[var73] * var72, 3);
                        var12.method1381((float) var69[var73] * var72, arg1 ^ 0x3);
                        var12.method1381((float) var68[var73] * var72, arg1 ^ 0x3);
                    } else {
                        float var75 = var71 / (float) var74;
                        var12.method1381((float) var67[var73] * var75, 3);
                        var12.method1381((float) var69[var73] * var75, 3);
                        var12.method1381((float) var68[var73] * var75, 3);
                    }
                    var12.field1521 += var7 - 12;
                }
            }
        }
        if (var6) {
            var12.field1521 = var11;
            if (this.field630.field4230) {
                for (int var80 = 0; var80 < this.field560; var80++) {
                    var12.method1383((byte) 33, this.field527[var80]);
                    var12.method1383((byte) 75, this.field542[var80]);
                    var12.field1521 += var7 - 8;
                }
            } else {
                for (int var79 = 0; var79 < this.field560; var79++) {
                    var12.method1381(this.field527[var79], 3);
                    var12.method1381(this.field542[var79], arg1 + 3);
                    var12.field1521 += var7 - 8;
                }
            }
        }
        var12.field1521 = this.field560 * var7;
        class726 var81;
        if (arg0) {
            if (this.field575 == null) {
                this.field575 = this.field630.method1881(var12.field1521, var12.field1556, 12486, var7, true);
            } else {
                this.field575.method3073(var12.field1556, var12.field1521, var7, 109);
            }
            var81 = this.field575;
            this.field548 = 0;
        } else {
            var81 = this.field630.method1881(var12.field1521, var12.field1556, 12486, var7, false);
            this.field561 = true;
        }
        if (var5) {
            this.field605.field10091 = var81;
            this.field605.field10089 = var8;
        }
        if (var6) {
            this.field566.field10089 = var11;
            this.field566.field10091 = var81;
        }
        if (var3) {
            this.field627.field10089 = var9;
            this.field627.field10091 = var81;
        }
        if (var4) {
            this.field599.field10091 = var81;
            this.field599.field10089 = var10;
        }
    }

    @OriginalMember(owner = "client!wv", name = "aa", descriptor = "(SS)V", line = 3690)
    public final void method61(short arg0, short arg1) {
        field622++;
        class159 var3 = this.field630.field883;
        for (int var4 = 0; var4 < this.field551; var4++) {
            if (this.field559[var4] == arg0) {
                this.field559[var4] = arg1;
            }
        }
        byte var5 = 0;
        byte var6 = 0;
        if (arg0 != -1) {
            class181 var7 = var3.method1263(arg0 & 0xFFFF, (byte) 122);
            var5 = var7.field2748;
            var6 = var7.field2739;
        }
        byte var8 = 0;
        byte var9 = 0;
        if (arg1 != -1) {
            class181 var10 = var3.method1263(arg1 & 0xFFFF, (byte) 115);
            var8 = var10.field2748;
            if (var10.field2740 != 0 || var10.field2736 != 0) {
                this.field584 = true;
            }
            var9 = var10.field2739;
        }
        if (!var6 != var9 | var5 != var8) {
            return;
        }
        if (this.field520 != null) {
            for (int var11 = 0; var11 < this.field573; var11++) {
                class664 var12 = this.field520[var11];
                class10 var13 = this.field565[var11];
                var13.field221 = var13.field221 & 0xFF000000 | class444.field6323[this.field521[var12.field9320] & 0xFFFF] & 0xFFFFFF;
            }
        }
        if (this.field627 != null) {
            this.field627.field10091 = null;
            return;
        }
    }

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(Lka;IIIZ)V", line = 3771)
    public final void method71(class495 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field545++;
        class37 var6 = (class37) arg0;
        if (this.field551 == 0 || var6.field551 == 0) {
            return;
        }
        int var7 = var6.field516;
        int[] var8 = var6.field533;
        int[] var9 = var6.field580;
        int[] var10 = var6.field553;
        short[] var11 = var6.field626;
        short[] var12 = var6.field588;
        short[] var13 = var6.field570;
        byte[] var14 = var6.field572;
        short[] var15;
        short[] var16;
        byte[] var17;
        short[] var18;
        if (this.field511 == null) {
            var15 = null;
            var16 = null;
            var17 = null;
            var18 = null;
        } else {
            var15 = this.field511.field4719;
            var17 = this.field511.field4717;
            var18 = this.field511.field4716;
            var16 = this.field511.field4715;
        }
        short[] var19;
        byte[] var20;
        short[] var21;
        short[] var22;
        if (var6.field511 == null) {
            var19 = null;
            var20 = null;
            var21 = null;
            var22 = null;
        } else {
            var21 = var6.field511.field4719;
            var19 = var6.field511.field4715;
            var20 = var6.field511.field4717;
            var22 = var6.field511.field4716;
        }
        int[] var23 = var6.field620;
        short[] var24 = var6.field557;
        if (!var6.field534) {
            var6.method262((byte) -127);
        }
        short var25 = var6.field541;
        short var26 = var6.field569;
        short var27 = var6.field607;
        short var28 = var6.field568;
        short var29 = var6.field604;
        short var30 = var6.field628;
        for (int var31 = 0; var31 < this.field516; var31++) {
            int var32 = this.field580[var31] - arg2;
            if (var32 >= var25 && var26 >= var32) {
                int var33 = this.field533[var31] - arg1;
                if (var27 <= var33 && var33 <= var28) {
                    int var34 = this.field553[var31] - arg3;
                    if (var34 >= var29 && var30 >= var34) {
                        int var35 = -1;
                        int var36 = this.field620[var31];
                        int var37 = this.field620[var31 + 1];
                        for (int var38 = var36; var38 < var37; var38++) {
                            var35 = this.field557[var38] - 1;
                            if (var35 == -1 || this.field572[var35] != 0) {
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
                                        if (var15 == null) {
                                            this.field511 = new class317();
                                            var15 = this.field511.field4719 = class92.method657(this.field626, (byte) -114);
                                            var18 = this.field511.field4716 = class92.method657(this.field588, (byte) 115);
                                            var16 = this.field511.field4715 = class92.method657(this.field570, (byte) -128);
                                            var17 = this.field511.field4717 = class298.method1992(0, this.field572);
                                        }
                                        if (var21 == null) {
                                            class317 var44 = var6.field511 = new class317();
                                            var21 = var44.field4719 = class92.method657(var11, (byte) 124);
                                            var22 = var44.field4716 = class92.method657(var12, (byte) -120);
                                            var19 = var44.field4715 = class92.method657(var13, (byte) 74);
                                            var20 = var44.field4717 = class298.method1992(0, var14);
                                        }
                                        short var45 = this.field626[var35];
                                        short var46 = this.field588[var35];
                                        short var47 = this.field570[var35];
                                        byte var48 = this.field572[var35];
                                        int var49 = var23[var39 + 1];
                                        int var50 = var23[var39];
                                        for (int var51 = var50; var51 < var49; var51++) {
                                            int var52 = var24[var51] - 1;
                                            if (var52 == -1) {
                                                break;
                                            }
                                            if (var20[var52] != 0) {
                                                var21[var52] += var45;
                                                var22[var52] += var46;
                                                var19[var52] += var47;
                                                var20[var52] += var48;
                                            }
                                        }
                                        int var53 = this.field620[var31];
                                        byte var54 = var14[var41];
                                        short var55 = var12[var41];
                                        short var56 = var13[var41];
                                        int var57 = this.field620[var31 + 1];
                                        short var58 = var11[var41];
                                        for (int var59 = var53; var59 < var57; var59++) {
                                            int var60 = this.field557[var59] - 1;
                                            if (var60 == -1) {
                                                break;
                                            }
                                            if (var17[var60] != 0) {
                                                var15[var60] += var58;
                                                var18[var60] += var55;
                                                var16[var60] += var56;
                                                var17[var60] += var54;
                                            }
                                        }
                                        if (this.field599 == null && this.field627 != null) {
                                            this.field627.field10091 = null;
                                        }
                                        if (this.field599 != null) {
                                            this.field599.field10091 = null;
                                        }
                                        if (var6.field599 == null && var6.field627 != null) {
                                            var6.field627.field10091 = null;
                                        }
                                        if (var6.field599 != null) {
                                            var6.field599.field10091 = null;
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

    @OriginalMember(owner = "client!wv", name = "c", descriptor = "(I)V", line = 4035)
    private final void method265(int arg0) {
        if (this.field520 != null) {
            class712 var2 = this.field630.field4162;
            this.field630.method1894(-113);
            this.field630.method408(!this.field586);
            this.field630.method1888(false, (byte) 10);
            this.field630.method1865(this.field630.field4222, 32888, this.field630.field4282, null, null);
            for (int var3 = 0; var3 < this.field573; var3++) {
                class664 var4 = this.field520[var3];
                class10 var5 = this.field565[var3];
                if (!var4.field9324 || !this.field630.method448()) {
                    float var6 = (float) (this.field533[var4.field9325] + this.field533[var4.field9318] + this.field533[var4.field9312]) * 0.3333333F;
                    float var7 = (float) (this.field580[var4.field9325] + this.field580[var4.field9318] + this.field580[var4.field9312]) * 0.3333333F;
                    float var8 = (float) (this.field553[var4.field9325] + this.field553[var4.field9312] + this.field553[var4.field9318]) * 0.3333333F;
                    float var9 = class228.field3253 * var8 + class500.field7089 * var7 + class491.field6974 * var6 + class103.field1289;
                    float var10 = field597 * var8 + class223.field3205 * var7 + class18.field295 * var6 + class568.field8032;
                    float var11 = class471.field6719 * var8 + class730.field10208 * var7 + class673.field9444 * var6 + class134.field1745;
                    float var12 = (float) (1.0D / Math.sqrt((double) (var11 * var11 + var9 * var9 + var10 * var10))) * (float) var4.field9323;
                    var2.method4030((byte) -13, var11 * var12 - var11, var4.field9313 * var5.field219 >> 7, var5.field224, var4.field9322 * var5.field227 >> 7, (float) var5.field220 + var9 - (var9 * var12), var10 * var12 + ((float) var5.field222 - var10));
                    this.field630.method1850(21, var2);
                    int var13 = var5.field221;
                    OpenGL.glColor4ub((byte) (var13 >> 16), (byte) (var13 >> 8), (byte) var13, (byte) (var13 >> 24));
                    this.field630.method1873((byte) 23, var4.field9317);
                    this.field630.method1817(var4.field9315, arg0 - 1348147062);
                    this.field630.method1856(0, true, 7, 4);
                }
            }
            this.field630.method408(true);
            this.field630.method1872(1);
        }
        field543++;
        if (arg0 != 1348147064) {
            this.method113();
        }
    }

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(Leh;Lsp;II)V", line = 4097)
    public final void method91(class378 arg0, class660 arg1, int arg2, int arg3) {
        field577++;
        if (this.field560 == 0) {
            return;
        }
        class712 var5 = this.field630.field4192;
        if (!this.field534) {
            this.method262((byte) -127);
        }
        class712 var6 = (class712) arg0;
        class134.field1745 = var5.field10044 * var6.field10037 + var5.field10032 * var6.field10042 + var5.field10030 * var6.field10041 + var5.field10037;
        class730.field10208 = var5.field10044 * var6.field10032 + var5.field10032 * var6.field10039 + var5.field10030 * var6.field10018;
        float var7 = (float) this.field541 * class730.field10208 + class134.field1745;
        float var8 = (float) this.field569 * class730.field10208 + class134.field1745;
        float var9;
        float var10;
        if (var8 < var7) {
            var9 = (float) (-this.field583) + var8;
            var10 = (float) this.field583 + var7;
        } else {
            var9 = (float) (-this.field583) + var7;
            var10 = (float) this.field583 + var8;
        }
        if ((this.field630.field4241 <= var9) || (var10 <= (float) this.field630.field4227)) {
            return;
        }
        class103.field1289 = var5.field10043 * var6.field10037 + var5.field10031 * var6.field10041 + var5.field10018 * var6.field10042 + var5.field10041;
        class500.field7089 = var5.field10043 * var6.field10032 + var5.field10031 * var6.field10018 + var5.field10018 * var6.field10039;
        float var11 = (float) this.field541 * class500.field7089 + class103.field1289;
        float var12 = (float) this.field569 * class500.field7089 + class103.field1289;
        float var13;
        float var14;
        if ((var12 < var11)) {
            var13 = ((float) this.field583 + var11) * (float) this.field630.field4278;
            var14 = (var12 - (float) this.field583) * (float) this.field630.field4278;
        } else {
            var13 = ((float) this.field583 + var12) * (float) this.field630.field4278;
            var14 = (var11 - (float) this.field583) * (float) this.field630.field4278;
        }
        if ((this.field630.field4274 <= var14 / (float) arg2) || (this.field630.field4265 >= var13 / (float) arg2)) {
            return;
        }
        class568.field8032 = var5.field10024 * var6.field10037 + var5.field10039 * var6.field10042 + var5.field10023 * var6.field10041 + var5.field10042;
        class223.field3205 = var5.field10024 * var6.field10032 + var5.field10039 * var6.field10039 + var5.field10023 * var6.field10018;
        float var15 = (float) this.field541 * class223.field3205 + class568.field8032;
        float var16 = (float) this.field569 * class223.field3205 + class568.field8032;
        float var17;
        float var18;
        if (var16 < var15) {
            var17 = ((float) (-this.field583) + var16) * (float) this.field630.field4204;
            var18 = ((float) this.field583 + var15) * (float) this.field630.field4204;
        } else {
            var18 = ((float) this.field583 + var16) * (float) this.field630.field4204;
            var17 = (var15 - (float) this.field583) * (float) this.field630.field4204;
        }
        if ((var17 / (float) arg2 >= this.field630.field4295) || (var18 / (float) arg2 <= this.field630.field4239)) {
            return;
        }
        if (arg1 != null || this.field520 != null) {
            class471.field6719 = var5.field10044 * var6.field10044 + var5.field10032 * var6.field10024 + var5.field10030 * var6.field10043;
            class673.field9444 = var5.field10044 * var6.field10030 + var5.field10032 * var6.field10023 + var5.field10030 * var6.field10031;
            class228.field3253 = var5.field10043 * var6.field10044 + var5.field10031 * var6.field10043 + var5.field10018 * var6.field10024;
            field597 = var5.field10024 * var6.field10044 + var5.field10039 * var6.field10024 + var5.field10023 * var6.field10043;
            class491.field6974 = var5.field10043 * var6.field10030 + var5.field10031 * var6.field10031 + var5.field10018 * var6.field10023;
            class18.field295 = var5.field10024 * var6.field10030 + var5.field10039 * var6.field10023 + var5.field10023 * var6.field10031;
        }
        if (arg1 != null) {
            int var19 = this.field607 + this.field568 >> 1;
            int var20 = this.field628 + this.field604 >> 1;
            int var21 = (int) ((float) var20 * class228.field3253 + (float) this.field541 * class500.field7089 + (float) var19 * class491.field6974 + class103.field1289);
            int var22 = (int) ((float) var20 * field597 + (float) this.field541 * class223.field3205 + (float) var19 * class18.field295 + class568.field8032);
            int var23 = (int) ((float) var20 * class471.field6719 + (float) this.field541 * class730.field10208 + (float) var19 * class673.field9444 + class134.field1745);
            int var24 = (int) ((float) var20 * class228.field3253 + (float) this.field569 * class500.field7089 + (float) var19 * class491.field6974 + class103.field1289);
            int var25 = (int) ((float) var20 * field597 + (float) this.field569 * class223.field3205 + (float) var19 * class18.field295 + class568.field8032);
            arg1.field9281 = this.field630.field4311 + (this.field630.field4204 * var22 / arg2);
            arg1.field9278 = this.field630.field4278 * var24 / arg2 + this.field630.field4293;
            arg1.field9280 = this.field630.field4278 * var21 / arg2 + this.field630.field4293;
            arg1.field9277 = this.field630.field4204 * var25 / arg2 + this.field630.field4311;
            int var26 = (int) ((float) var20 * class471.field6719 + (float) this.field569 * class730.field10208 + (float) var19 * class673.field9444 + class134.field1745);
            if (this.field630.field4227 <= var23 || this.field630.field4227 <= var26) {
                arg1.field9279 = true;
                arg1.field9276 = this.field630.field4293 + ((var21 - -this.field583) * this.field630.field4278 / arg2) - arg1.field9280;
            }
        }
        this.field630.method1895((float) arg2, (byte) -41);
        this.field630.method1900(-1);
        this.field630.method1854(var6, 0);
        this.method267((byte) 56);
        this.field630.method1872(1);
        this.method265(1348147064);
    }

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(BLwv;ZILwv;Z)Lka;", line = 4248)
    private final class495 method266(byte arg0, class37 arg1, boolean arg2, int arg3, class37 arg4, boolean arg5) {
        if ((arg3 & 0x100) == 0) {
            arg4.field586 = this.field586;
        } else {
            arg4.field586 = true;
        }
        arg4.field582 = this.field582;
        arg4.field519 = this.field519;
        arg4.field524 = this.field524;
        field594++;
        arg4.field516 = this.field516;
        arg4.field537 = this.field537;
        arg4.field573 = this.field573;
        arg4.field548 = 0;
        arg4.field584 = this.field584;
        arg4.field560 = this.field560;
        arg4.field603 = arg3;
        arg4.field602 = this.field602;
        arg4.field551 = this.field551;
        boolean var7 = class148.method1024(-88, this.field519, arg3);
        boolean var8 = class359.method2253(arg3, this.field519, false);
        boolean var9 = class581.method3382(this.field519, arg3, (byte) 19);
        boolean var10 = var7 | var8 | var9;
        if (var10) {
            if (!var7) {
                arg4.field533 = this.field533;
            } else if (arg1.field533 == null || this.field582 > arg1.field533.length) {
                arg4.field533 = arg1.field533 = new int[this.field582];
            } else {
                arg4.field533 = arg1.field533;
            }
            if (!var8) {
                arg4.field580 = this.field580;
            } else if (arg1.field580 == null || arg1.field580.length < this.field582) {
                arg4.field580 = arg1.field580 = new int[this.field582];
            } else {
                arg4.field580 = arg1.field580;
            }
            if (!var9) {
                arg4.field553 = this.field553;
            } else if (arg1.field553 == null || this.field582 > arg1.field553.length) {
                arg4.field553 = arg1.field553 = new int[this.field582];
            } else {
                arg4.field553 = arg1.field553;
            }
            for (int var11 = 0; var11 < this.field582; var11++) {
                if (var7) {
                    arg4.field533[var11] = this.field533[var11];
                }
                if (var8) {
                    arg4.field580[var11] = this.field580[var11];
                }
                if (var9) {
                    arg4.field553[var11] = this.field553[var11];
                }
            }
        } else {
            arg4.field553 = this.field553;
            arg4.field533 = this.field533;
            arg4.field580 = this.field580;
        }
        if (class222.method1542((byte) -100, this.field519, arg3)) {
            arg4.field605 = arg1.field605;
            if (arg5) {
                arg4.field548 = (byte) (arg4.field548 | 0x1);
            }
            arg4.field605.field10091 = this.field605.field10091;
            arg4.field605.field10089 = this.field605.field10089;
        } else if (class310.method2031(2048, this.field519, arg3)) {
            arg4.field605 = this.field605;
        } else {
            arg4.field605 = null;
        }
        if (class162.method1273(this.field519, -5913, arg3)) {
            if (arg1.field521 == null || this.field551 > arg1.field521.length) {
                arg4.field521 = arg1.field521 = new short[this.field551];
            } else {
                arg4.field521 = arg1.field521;
            }
            for (int var12 = 0; var12 < this.field551; var12++) {
                arg4.field521[var12] = this.field521[var12];
            }
        } else {
            arg4.field521 = this.field521;
        }
        if (class530.method3081(arg3, (byte) -117, this.field519)) {
            if (arg1.field613 == null || this.field551 > arg1.field613.length) {
                arg4.field613 = arg1.field613 = new byte[this.field551];
            } else {
                arg4.field613 = arg1.field613;
            }
            for (int var13 = 0; var13 < this.field551; var13++) {
                arg4.field613[var13] = this.field613[var13];
            }
        } else {
            arg4.field613 = this.field613;
        }
        if (class339.method2177(arg3, this.field519, false)) {
            if (arg5) {
                arg4.field548 = (byte) (arg4.field548 | 0x2);
            }
            arg4.field627 = arg1.field627;
            arg4.field627.field10091 = this.field627.field10091;
            arg4.field627.field10089 = this.field627.field10089;
        } else if (class229.method1596(-96, arg3, this.field519)) {
            arg4.field627 = this.field627;
        } else {
            arg4.field627 = null;
        }
        if (class627.method3590(-96, this.field519, arg3)) {
            if (arg1.field626 == null || arg1.field626.length < this.field560) {
                int var14 = this.field560;
                arg4.field570 = arg1.field570 = new short[var14];
                arg4.field588 = arg1.field588 = new short[var14];
                arg4.field626 = arg1.field626 = new short[var14];
            } else {
                arg4.field626 = arg1.field626;
                arg4.field588 = arg1.field588;
                arg4.field570 = arg1.field570;
            }
            if (this.field511 == null) {
                for (int var18 = 0; var18 < this.field560; var18++) {
                    arg4.field626[var18] = this.field626[var18];
                    arg4.field588[var18] = this.field588[var18];
                    arg4.field570[var18] = this.field570[var18];
                }
            } else {
                if (arg1.field511 == null) {
                    arg1.field511 = new class317();
                }
                class317 var15 = arg4.field511 = arg1.field511;
                if (var15.field4719 == null || this.field560 > var15.field4719.length) {
                    int var16 = this.field560;
                    var15.field4717 = new byte[var16];
                    var15.field4715 = new short[var16];
                    var15.field4719 = new short[var16];
                    var15.field4716 = new short[var16];
                }
                for (int var17 = 0; var17 < this.field560; var17++) {
                    arg4.field626[var17] = this.field626[var17];
                    arg4.field588[var17] = this.field588[var17];
                    arg4.field570[var17] = this.field570[var17];
                    var15.field4719[var17] = this.field511.field4719[var17];
                    var15.field4716[var17] = this.field511.field4716[var17];
                    var15.field4715[var17] = this.field511.field4715[var17];
                    var15.field4717[var17] = this.field511.field4717[var17];
                }
            }
            arg4.field572 = this.field572;
        } else {
            arg4.field588 = this.field588;
            arg4.field511 = this.field511;
            arg4.field626 = this.field626;
            arg4.field572 = this.field572;
            arg4.field570 = this.field570;
        }
        if (class581.method3381(124, arg3, this.field519)) {
            arg4.field599 = arg1.field599;
            if (arg5) {
                arg4.field548 = (byte) (arg4.field548 | 0x4);
            }
            arg4.field599.field10091 = this.field599.field10091;
            arg4.field599.field10089 = this.field599.field10089;
        } else if (class713.method4034(123, this.field519, arg3)) {
            arg4.field599 = this.field599;
        } else {
            arg4.field599 = null;
        }
        if (class324.method2109(false, arg3, this.field519)) {
            if (arg1.field527 == null || this.field551 > arg1.field527.length) {
                int var19 = this.field560;
                arg4.field542 = arg1.field542 = new float[var19];
                arg4.field527 = arg1.field527 = new float[var19];
            } else {
                arg4.field527 = arg1.field527;
                arg4.field542 = arg1.field542;
            }
            for (int var20 = 0; var20 < this.field560; var20++) {
                arg4.field527[var20] = this.field527[var20];
                arg4.field542[var20] = this.field542[var20];
            }
        } else {
            arg4.field542 = this.field542;
            arg4.field527 = this.field527;
        }
        if (class205.method1480(arg3, this.field519, (byte) -58)) {
            arg4.field566 = arg1.field566;
            if (arg5) {
                arg4.field548 = (byte) (arg4.field548 | 0x8);
            }
            arg4.field566.field10089 = this.field566.field10089;
            arg4.field566.field10091 = this.field566.field10091;
        } else if (class76.method591(this.field519, arg3, (byte) 47)) {
            arg4.field566 = this.field566;
        } else {
            arg4.field566 = null;
        }
        if (class195.method1421(arg3, this.field519, -104)) {
            if (arg1.field567 == null || this.field551 > arg1.field567.length) {
                int var21 = this.field551;
                arg4.field614 = arg1.field614 = new short[var21];
                arg4.field567 = arg1.field567 = new short[var21];
                arg4.field581 = arg1.field581 = new short[var21];
            } else {
                arg4.field614 = arg1.field614;
                arg4.field581 = arg1.field581;
                arg4.field567 = arg1.field567;
            }
            for (int var22 = 0; var22 < this.field551; var22++) {
                arg4.field567[var22] = this.field567[var22];
                arg4.field614[var22] = this.field614[var22];
                arg4.field581[var22] = this.field581[var22];
            }
        } else {
            arg4.field567 = this.field567;
            arg4.field581 = this.field581;
            arg4.field614 = this.field614;
        }
        if (class73.method576(arg3, this.field519, -98)) {
            if (arg5) {
                arg4.field548 = (byte) (arg4.field548 | 0x10);
            }
            arg4.field617 = arg1.field617;
            arg4.field617.field1285 = this.field617.field1285;
        } else if (class493.method2882(-1, this.field519, arg3)) {
            arg4.field617 = this.field617;
        } else {
            arg4.field617 = null;
        }
        if (class345.method2193(this.field519, arg3, (byte) -99)) {
            if (arg1.field559 == null || this.field551 > arg1.field559.length) {
                int var23 = this.field551;
                arg4.field559 = arg1.field559 = new short[var23];
            } else {
                arg4.field559 = arg1.field559;
            }
            for (int var24 = 0; var24 < this.field551; var24++) {
                arg4.field559[var24] = this.field559[var24];
            }
        } else {
            arg4.field559 = this.field559;
        }
        if (!class450.method2713(arg3, this.field519, (byte) 88)) {
            arg4.field565 = this.field565;
        } else if (arg1.field565 == null || this.field573 > arg1.field565.length) {
            int var26 = this.field573;
            arg4.field565 = arg1.field565 = new class10[var26];
            for (int var27 = 0; var27 < this.field573; var27++) {
                arg4.field565[var27] = this.field565[var27].method119(77);
            }
        } else {
            arg4.field565 = arg1.field565;
            for (int var25 = 0; var25 < this.field573; var25++) {
                arg4.field565[var25].method120(false, this.field565[var25]);
            }
        }
        arg4.field589 = this.field589;
        if (this.field534) {
            arg4.field569 = this.field569;
            arg4.field541 = this.field541;
            arg4.field628 = this.field628;
            arg4.field568 = this.field568;
            arg4.field604 = this.field604;
            arg4.field583 = this.field583;
            arg4.field512 = this.field512;
            arg4.field607 = this.field607;
            arg4.field534 = true;
        } else {
            arg4.field534 = false;
        }
        arg4.field591 = this.field591;
        arg4.field526 = this.field526;
        if (arg0 >= -69) {
            return null;
        }
        arg4.field514 = this.field514;
        arg4.field623 = this.field623;
        arg4.field576 = this.field576;
        arg4.field520 = this.field520;
        arg4.field544 = this.field544;
        arg4.field620 = this.field620;
        arg4.field579 = this.field579;
        arg4.field557 = this.field557;
        return arg4;
    }

    @OriginalMember(owner = "client!wv", name = "FA", descriptor = "(I)V", line = 4716)
    public final void method114(int arg0) {
        field539++;
        int var2 = class601.field8476[arg0];
        int var3 = class601.field8473[arg0];
        for (int var4 = 0; var4 < this.field516; var4++) {
            int var5 = this.field580[var4] * var3 - this.field553[var4] * var2 >> 14;
            this.field553[var4] = this.field580[var4] * var2 + this.field553[var4] * var3 >> 14;
            this.field580[var4] = var5;
        }
        if (this.field605 != null) {
            this.field605.field10091 = null;
        }
        this.field534 = false;
    }

    @OriginalMember(owner = "client!wv", name = "b", descriptor = "(B)V", line = 4748)
    private final void method267(byte arg0) {
        field595++;
        if (this.field602 == 0) {
            return;
        }
        if (this.field548 != 0) {
            this.method264(true, 0);
        }
        this.method264(false, 0);
        if (this.field617 != null) {
            if (this.field617.field1285 == null) {
                this.method259((this.field548 & 0x10) != 0, 5);
            }
            if (this.field617.field1285 != null) {
                this.field630.method1888(this.field599 != null, (byte) -116);
                this.field630.method1865(this.field605, 32888, this.field566, this.field627, this.field599);
                int var2 = this.field526.length - 1;
                for (int var3 = 0; var3 < var2; var3++) {
                    int var4 = this.field526[var3];
                    int var5 = this.field526[var3 + 1];
                    int var6 = this.field559[var4] & 0xFFFF;
                    if (var6 == 65535) {
                        var6 = -1;
                    }
                    this.field630.method1867(this.field599 != null, var6, 2066881232);
                    this.field630.method1899(this.field617.field1285, -83, 4, (var5 - var4) * 3, var4 * 3);
                }
            }
        }
        this.method271(102);
        if (arg0 != 56) {
            this.method66(-2, null, -31, 118, 52, true, 95, null);
        }
    }

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(Leh;Lsp;I)V", line = 4805)
    public final void method108(class378 arg0, class660 arg1, int arg2) {
        field547++;
        if (this.field560 == 0) {
            return;
        }
        class712 var4 = this.field630.field4192;
        if (!this.field534) {
            this.method262((byte) -127);
        }
        class712 var5 = (class712) arg0;
        class730.field10208 = var4.field10044 * var5.field10032 + var4.field10032 * var5.field10039 + var4.field10030 * var5.field10018;
        class134.field1745 = var4.field10044 * var5.field10037 + var4.field10032 * var5.field10042 + var4.field10030 * var5.field10041 + var4.field10037;
        float var6 = (float) this.field541 * class730.field10208 + class134.field1745;
        float var7 = (float) this.field569 * class730.field10208 + class134.field1745;
        float var8;
        float var9;
        if ((var6 > var7)) {
            var9 = var7 - (float) this.field583;
            var8 = (float) this.field583 + var6;
        } else {
            var8 = (float) this.field583 + var7;
            var9 = var6 - (float) this.field583;
        }
        if ((var9 >= this.field630.field4251) || (var8 <= (float) this.field630.field4227)) {
            return;
        }
        class103.field1289 = var4.field10043 * var5.field10037 + var4.field10031 * var5.field10041 + var4.field10018 * var5.field10042 + var4.field10041;
        class500.field7089 = var4.field10043 * var5.field10032 + var4.field10031 * var5.field10018 + var4.field10018 * var5.field10039;
        float var10 = (float) this.field541 * class500.field7089 + class103.field1289;
        float var11 = (float) this.field569 * class500.field7089 + class103.field1289;
        float var12;
        float var13;
        if ((var10 > var11)) {
            var12 = (var11 - (float) this.field583) * (float) this.field630.field4278;
            var13 = ((float) this.field583 + var10) * (float) this.field630.field4278;
        } else {
            var12 = (var10 - (float) this.field583) * (float) this.field630.field4278;
            var13 = ((float) this.field583 + var11) * (float) this.field630.field4278;
        }
        if ((var12 / var8 >= this.field630.field4274) || (this.field630.field4265 >= var13 / var8)) {
            return;
        }
        class223.field3205 = var4.field10024 * var5.field10032 + var4.field10039 * var5.field10039 + var4.field10023 * var5.field10018;
        class568.field8032 = var4.field10024 * var5.field10037 + var4.field10039 * var5.field10042 + var4.field10023 * var5.field10041 + var4.field10042;
        float var14 = (float) this.field541 * class223.field3205 + class568.field8032;
        float var15 = (float) this.field569 * class223.field3205 + class568.field8032;
        float var16;
        float var17;
        if (var15 < var14) {
            var16 = ((float) this.field583 + var14) * (float) this.field630.field4204;
            var17 = (var15 - (float) this.field583) * (float) this.field630.field4204;
        } else {
            var16 = ((float) this.field583 + var15) * (float) this.field630.field4204;
            var17 = (var14 - (float) this.field583) * (float) this.field630.field4204;
        }
        if ((this.field630.field4295 <= var17 / var8) || (this.field630.field4239 >= var16 / var8)) {
            return;
        }
        if (arg1 != null || this.field520 != null) {
            field597 = var4.field10024 * var5.field10044 + var4.field10039 * var5.field10024 + var4.field10023 * var5.field10043;
            class491.field6974 = var4.field10043 * var5.field10030 + var4.field10031 * var5.field10031 + var4.field10018 * var5.field10023;
            class673.field9444 = var4.field10044 * var5.field10030 + var4.field10032 * var5.field10023 + var4.field10030 * var5.field10031;
            class18.field295 = var4.field10024 * var5.field10030 + var4.field10039 * var5.field10023 + var4.field10023 * var5.field10031;
            class471.field6719 = var4.field10044 * var5.field10044 + var4.field10032 * var5.field10024 + var4.field10030 * var5.field10043;
            class228.field3253 = var4.field10043 * var5.field10044 + var4.field10031 * var5.field10043 + var4.field10018 * var5.field10024;
        }
        if (arg1 != null) {
            boolean var18 = false;
            boolean var19 = true;
            int var20 = this.field607 + this.field568 >> 1;
            int var21 = this.field604 + this.field628 >> 1;
            int var22 = (int) ((float) var21 * class228.field3253 + (float) this.field541 * class500.field7089 + (float) var20 * class491.field6974 + class103.field1289);
            int var23 = (int) ((float) var21 * field597 + (float) this.field541 * class223.field3205 + (float) var20 * class18.field295 + class568.field8032);
            int var24 = (int) ((float) var21 * class471.field6719 + (float) this.field541 * class730.field10208 + (float) var20 * class673.field9444 + class134.field1745);
            if (this.field630.field4227 > var24) {
                var18 = true;
            } else {
                arg1.field9280 = this.field630.field4293 + (this.field630.field4278 * var22 / var24);
                arg1.field9281 = this.field630.field4204 * var23 / var24 + this.field630.field4311;
            }
            int var25 = (int) ((float) var21 * class228.field3253 + (float) this.field569 * class500.field7089 + (float) var20 * class491.field6974 + class103.field1289);
            int var26 = (int) ((float) var21 * field597 + (float) this.field569 * class223.field3205 + (float) var20 * class18.field295 + class568.field8032);
            int var27 = (int) ((float) var21 * class471.field6719 + (float) this.field569 * class730.field10208 + (float) var20 * class673.field9444 + class134.field1745);
            if (this.field630.field4227 <= var27) {
                arg1.field9278 = this.field630.field4278 * var25 / var27 + this.field630.field4293;
                arg1.field9277 = this.field630.field4204 * var26 / var27 + this.field630.field4311;
            } else {
                var18 = true;
            }
            if (var18) {
                if (this.field630.field4227 > var24 && this.field630.field4227 > var27) {
                    var19 = false;
                } else if (this.field630.field4227 > var24) {
                    int var31 = (var27 - this.field630.field4227 << 16) / (var27 - var24);
                    int var32 = ((var25 - var22) * var31 >> 16) + var25;
                    arg1.field9280 = this.field630.field4293 + (this.field630.field4278 * var32 / this.field630.field4227);
                    int var33 = ((var26 - var23) * var31 >> 16) + var26;
                    arg1.field9281 = this.field630.field4204 * var33 / this.field630.field4227 + this.field630.field4311;
                } else if (var27 < this.field630.field4227) {
                    int var28 = (var24 - this.field630.field4227 << 16) / (var24 - var27);
                    int var29 = ((var22 - var25) * var28 >> 16) + var22;
                    int var30 = ((var23 - var26) * var28 >> 16) + var23;
                    arg1.field9280 = this.field630.field4278 * var29 / this.field630.field4227 + this.field630.field4293;
                    arg1.field9281 = this.field630.field4311 + (this.field630.field4204 * var30 / this.field630.field4227);
                }
            }
            if (var19) {
                if (var27 >= var24) {
                    arg1.field9276 = (this.field583 + var25) * this.field630.field4278 / var27 + this.field630.field4293 - arg1.field9278;
                } else {
                    arg1.field9276 = (this.field583 + var22) * this.field630.field4278 / var24 + this.field630.field4293 - arg1.field9280;
                }
                arg1.field9279 = true;
            }
        }
        this.field630.method1827((byte) 28);
        this.field630.method1854(var5, 0);
        this.method267((byte) 56);
        this.field630.method1872(1);
        this.method265(1348147064);
    }

    @OriginalMember(owner = "client!wv", name = "k", descriptor = "(I)V", line = 5005)
    public final void method55(int arg0) {
        field585++;
        int var2 = class601.field8476[arg0];
        int var3 = class601.field8473[arg0];
        for (int var4 = 0; var4 < this.field516; var4++) {
            int var7 = this.field553[var4] * var2 + this.field533[var4] * var3 >> 14;
            this.field553[var4] = this.field553[var4] * var3 - (this.field533[var4] * var2) >> 14;
            this.field533[var4] = var7;
        }
        for (int var5 = 0; var5 < this.field560; var5++) {
            int var6 = this.field626[var5] * var3 + this.field570[var5] * var2 >> 14;
            this.field570[var5] = (short) (this.field570[var5] * var3 - (this.field626[var5] * var2) >> 14);
            this.field626[var5] = (short) var6;
        }
        if (this.field599 == null && this.field627 != null) {
            this.field627.field10091 = null;
        }
        if (this.field599 != null) {
            this.field599.field10091 = null;
        }
        if (this.field605 != null) {
            this.field605.field10091 = null;
        }
        this.field534 = false;
    }

    @OriginalMember(owner = "client!wv", name = "H", descriptor = "(III)V", line = 5053)
    public final void method70(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field516; var4++) {
            if (arg0 != 0) {
                this.field533[var4] += arg0;
            }
            if (arg1 != 0) {
                this.field580[var4] += arg1;
            }
            if (arg2 != 0) {
                this.field553[var4] += arg2;
            }
        }
        field600++;
        this.field534 = false;
        if (this.field605 != null) {
            this.field605.field10091 = null;
        }
    }

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "([BB)V", line = 5086)
    public static final void method268(byte[] arg0, byte arg1) {
        if (arg1 > -100) {
            return;
        }
        field536++;
        class120 var2 = new class120(arg0);
        while (true) {
            while (true) {
                int var3 = var2.method842(2384);
                if (var3 == 0) {
                    return;
                }
                if (var3 == 1) {
                    int[] var4 = class113.field1432 = new int[6];
                    var4[0] = var2.method898((byte) -110);
                    var4[1] = var2.method898((byte) -126);
                    var4[2] = var2.method898((byte) -112);
                    var4[3] = var2.method898((byte) -114);
                    var4[4] = var2.method898((byte) -77);
                    var4[5] = var2.method898((byte) -90);
                } else if (var3 == 4) {
                    int var7 = var2.method842(2384);
                    class302.field4523 = new int[var7];
                    for (int var8 = 0; var8 < var7; var8++) {
                        class302.field4523[var8] = var2.method898((byte) -120);
                        if (class302.field4523[var8] == 65535) {
                            class302.field4523[var8] = -1;
                        }
                    }
                } else if (var3 == 5) {
                    int var5 = var2.method842(2384);
                    class260.field3654 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        class260.field3654[var6] = var2.method898((byte) -79);
                        if (class260.field3654[var6] == 65535) {
                            class260.field3654[var6] = -1;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(IIIIBLeh;Z)Z", line = 5161)
    private final boolean method269(int arg0, int arg1, int arg2, int arg3, byte arg4, class378 arg5, boolean arg6) {
        field563++;
        class712 var8 = (class712) arg5;
        class712 var9 = this.field630.field4192;
        float var10 = var8.field10037 * var9.field10043 + var8.field10042 * var9.field10018 + var8.field10041 * var9.field10031 + var9.field10041;
        float var11 = var8.field10037 * var9.field10024 + var8.field10042 * var9.field10039 + var8.field10041 * var9.field10023 + var9.field10042;
        class471.field6719 = var8.field10044 * var9.field10044 + var8.field10043 * var9.field10030 + var8.field10024 * var9.field10032;
        class673.field9444 = var8.field10030 * var9.field10044 + var8.field10031 * var9.field10030 + var8.field10023 * var9.field10032;
        class500.field7089 = var8.field10032 * var9.field10043 + var8.field10039 * var9.field10018 + var8.field10018 * var9.field10031;
        float var12 = var8.field10037 * var9.field10044 + var8.field10042 * var9.field10032 + var8.field10041 * var9.field10030 + var9.field10037;
        class730.field10208 = var8.field10032 * var9.field10044 + var8.field10039 * var9.field10032 + var8.field10018 * var9.field10030;
        class18.field295 = var8.field10030 * var9.field10024 + var8.field10031 * var9.field10023 + var8.field10023 * var9.field10039;
        class223.field3205 = var8.field10032 * var9.field10024 + var8.field10039 * var9.field10039 + var8.field10018 * var9.field10023;
        field597 = var8.field10044 * var9.field10024 + var8.field10043 * var9.field10023 + var8.field10024 * var9.field10039;
        class491.field6974 = var8.field10030 * var9.field10043 + var8.field10031 * var9.field10031 + var8.field10023 * var9.field10018;
        class228.field3253 = var8.field10044 * var9.field10043 + var8.field10043 * var9.field10031 + var8.field10024 * var9.field10018;
        boolean var13 = false;
        float var14 = Float.MAX_VALUE;
        float var15 = -3.4028235E38F;
        float var16 = Float.MAX_VALUE;
        float var17 = -3.4028235E38F;
        int var18 = this.field630.field4278;
        int var19 = this.field630.field4204;
        if (!this.field534) {
            this.method262((byte) -127);
        }
        int var20 = this.field568 - this.field607 >> 1;
        int var21 = this.field569 - this.field541 >> 1;
        int var22 = this.field628 - this.field604 >> 1;
        int var23 = -66 / ((-arg4 - 51) / 55);
        int var24 = this.field607 + var20;
        int var25 = this.field541 + var21;
        int var26 = this.field604 + var22;
        int var27 = var24 - (var20 << arg0);
        int var28 = var25 - (var21 << arg0);
        int var29 = var26 - (var22 << arg0);
        int var30 = var24 + (var20 << arg0);
        int var31 = (var21 << arg0) + var25;
        class433.field6172[0] = var27;
        int var32 = (var22 << arg0) + var26;
        class216.field3095[0] = var28;
        class433.field6172[1] = var30;
        class275.field3827[0] = var29;
        class216.field3095[1] = var28;
        class275.field3827[1] = var29;
        class433.field6172[2] = var27;
        class216.field3095[2] = var31;
        class433.field6172[3] = var30;
        class275.field3827[2] = var29;
        class216.field3095[3] = var31;
        class275.field3827[3] = var29;
        class433.field6172[4] = var27;
        class216.field3095[4] = var28;
        class275.field3827[4] = var32;
        class433.field6172[5] = var30;
        class216.field3095[5] = var28;
        class275.field3827[5] = var32;
        class433.field6172[6] = var27;
        class216.field3095[6] = var31;
        class433.field6172[7] = var30;
        class275.field3827[6] = var32;
        class216.field3095[7] = var31;
        class275.field3827[7] = var32;
        for (int var33 = 0; var33 < 8; var33++) {
            float var54 = (float) class433.field6172[var33];
            float var55 = (float) class275.field3827[var33];
            float var56 = (float) class216.field3095[var33];
            float var57 = class471.field6719 * var55 + class730.field10208 * var56 + class673.field9444 * var54 + var12;
            float var58 = field597 * var55 + class223.field3205 * var56 + class18.field295 * var54 + var11;
            float var59 = class228.field3253 * var55 + class500.field7089 * var56 + class491.field6974 * var54 + var10;
            if ((float) this.field630.field4227 <= var57) {
                if (arg3 > 0) {
                    var57 = arg3;
                }
                float var60 = (float) var18 * var59 / var57 + (float) this.field630.field4293;
                if (var14 > var60) {
                    var14 = var60;
                }
                float var61 = (float) var19 * var58 / var57 + (float) this.field630.field4311;
                if (var15 < var60) {
                    var15 = var60;
                }
                if (var61 < var16) {
                    var16 = var61;
                }
                if (var61 > var17) {
                    var17 = var61;
                }
                var13 = true;
            }
        }
        if (var13 && var14 < (float) arg1 && (float) arg1 < var15 && (float) arg2 > var16 && var17 > (float) arg2) {
            if (arg6) {
                return true;
            }
            if (this.field630.field4315.length < this.field560) {
                this.field630.field4317 = new int[this.field560];
                this.field630.field4315 = new int[this.field560];
            }
            int[] var34 = this.field630.field4315;
            int[] var35 = this.field630.field4317;
            for (int var36 = 0; var36 < this.field516; var36++) {
                float var38 = (float) this.field553[var36];
                float var39 = (float) this.field533[var36];
                float var40 = (float) this.field580[var36];
                float var41 = class471.field6719 * var38 + class730.field10208 * var40 + class673.field9444 * var39 + var12;
                float var42 = class228.field3253 * var38 + class500.field7089 * var40 + class491.field6974 * var39 + var10;
                float var43 = field597 * var38 + class223.field3205 * var40 + class18.field295 * var39 + var11;
                if ((float) this.field630.field4227 <= var41) {
                    if (arg3 > 0) {
                        var41 = arg3;
                    }
                    int var44 = (int) ((float) var18 * var42 / var41 + (float) this.field630.field4293);
                    int var45 = (int) ((float) var19 * var43 / var41 + (float) this.field630.field4311);
                    int var46 = this.field620[var36];
                    int var47 = this.field620[var36 + 1];
                    for (int var48 = var46; var48 < var47; var48++) {
                        int var49 = this.field557[var48] - 1;
                        if (var49 == -1) {
                            break;
                        }
                        var34[var49] = var44;
                        var35[var49] = var45;
                    }
                } else {
                    int var50 = this.field620[var36];
                    int var51 = this.field620[var36 + 1];
                    for (int var52 = var50; var52 < var51; var52++) {
                        int var53 = this.field557[var52] - 1;
                        if (var53 == -1) {
                            break;
                        }
                        var34[this.field557[var52] - 1] = -999999;
                    }
                }
            }
            for (int var37 = 0; var37 < this.field551; var37++) {
                if (var34[this.field567[var37]] != -999999 && var34[this.field614[var37]] != -999999 && var34[this.field581[var37]] != -999999 && this.method260(var35[this.field567[var37]], arg1, var34[this.field581[var37]], -58, var34[this.field567[var37]], var34[this.field614[var37]], arg2, var35[this.field581[var37]], var35[this.field614[var37]])) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!wv", name = "c", descriptor = "()Z", line = 5420)
    public final boolean method99() {
        field531++;
        if (this.field559 == null) {
            return true;
        }
        for (int var1 = 0; var1 < this.field559.length; var1++) {
            if (this.field559[var1] != -1 && !this.field630.field883.method1262(this.field559[var1], (byte) 62)) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!wv", name = "e", descriptor = "()V", line = 5445)
    public final void method109() {
        field517++;
    }

    @OriginalMember(owner = "client!wv", name = "f", descriptor = "()[Lrf;", line = 5454)
    public final class92[] method116() {
        field518++;
        return this.field623;
    }

    @OriginalMember(owner = "client!wv", name = "HA", descriptor = "()I", line = 5468)
    public final int method80() {
        if (!this.field534) {
            this.method262((byte) -127);
        }
        field612++;
        return this.field604;
    }

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(Lmi;I)V", line = 5488)
    private final void method270(class519 arg0, int arg1) {
        if (this.field630.field4315.length < this.field560) {
            this.field630.field4315 = new int[this.field560];
            this.field630.field4317 = new int[this.field560];
        }
        field510++;
        int[] var3 = this.field630.field4315;
        int[] var4 = this.field630.field4317;
        if (arg1 != -24784) {
            this.method66(102, null, 11, -73, 80, true, -126, null);
        }
        for (int var5 = 0; var5 < this.field516; var5++) {
            int var16 = (this.field533[var5] - (this.field580[var5] * this.field630.field4299 >> 8) >> this.field630.field4165) - arg0.field7421;
            int var17 = (this.field553[var5] - (this.field580[var5] * this.field630.field4229 >> 8) >> this.field630.field4165) - arg0.field7412;
            int var18 = this.field620[var5];
            int var19 = this.field620[var5 + 1];
            for (int var20 = var18; var20 < var19; var20++) {
                int var21 = this.field557[var20] - 1;
                if (var21 == -1) {
                    break;
                }
                var3[var21] = var16;
                var4[var21] = var17;
            }
        }
        for (int var6 = 0; var6 < this.field602; var6++) {
            if (this.field613 == null || this.field613[var6] <= 128) {
                short var7 = this.field567[var6];
                short var8 = this.field614[var6];
                short var9 = this.field581[var6];
                int var10 = var3[var7];
                int var11 = var3[var8];
                int var12 = var3[var9];
                int var13 = var4[var7];
                int var14 = var4[var8];
                int var15 = var4[var9];
                if (((var10 - var11) * (var14 - var15) - ((var12 - var11) * (var14 - var13))) > 0) {
                    arg0.method3018(var10, arg1 ^ 0xFFFF9F30, var15, var12, var13, var11, var14);
                }
            }
        }
    }

    @OriginalMember(owner = "client!wv", name = "d", descriptor = "(I)V", line = 5585)
    private final void method271(int arg0) {
        field535++;
        if (!this.field561) {
            return;
        }
        this.field561 = false;
        if (this.field514 == null && this.field623 == null && this.field520 == null) {
            if (this.field533 != null && !class91.method654(this.field519, 29047, this.field603)) {
                if (this.field605 != null && this.field605.field10091 == null) {
                    this.field561 = true;
                } else {
                    if (!this.field534) {
                        this.method262((byte) -127);
                    }
                    this.field533 = null;
                }
            }
            if (this.field580 != null && !class91.method648(this.field603, this.field519, 124)) {
                if (this.field605 != null && this.field605.field10091 == null) {
                    this.field561 = true;
                } else {
                    if (!this.field534) {
                        this.method262((byte) -127);
                    }
                    this.field580 = null;
                }
            }
            if (this.field553 != null && !class745.method4160(this.field519, (byte) -17, this.field603)) {
                if (this.field605 != null && this.field605.field10091 == null) {
                    this.field561 = true;
                } else {
                    if (!this.field534) {
                        this.method262((byte) -127);
                    }
                    this.field553 = null;
                }
            }
        }
        if (this.field557 != null && this.field533 == null && this.field580 == null && this.field553 == null) {
            this.field557 = null;
            this.field620 = null;
        }
        if (this.field572 != null && !class516.method3009(0, this.field519, this.field603)) {
            if (this.field599 == null) {
                if (this.field627 != null && this.field627.field10091 == null) {
                    this.field561 = true;
                } else {
                    this.field572 = null;
                    this.field626 = this.field588 = this.field570 = null;
                }
            } else if (this.field599.field10091 == null) {
                this.field561 = true;
            } else {
                this.field626 = this.field588 = this.field570 = null;
                this.field572 = null;
            }
        }
        if (this.field521 != null && !class780.method4283(this.field603, (byte) -127, this.field519)) {
            if (this.field627 != null && this.field627.field10091 == null) {
                this.field561 = true;
            } else {
                this.field521 = null;
            }
        }
        if (this.field613 != null && !class171.method1301((byte) 73, this.field603, this.field519)) {
            if (this.field627 != null && this.field627.field10091 == null) {
                this.field561 = true;
            } else {
                this.field613 = null;
            }
        }
        if (this.field527 != null && !class292.method1974(this.field519, true, this.field603)) {
            if (this.field566 != null && this.field566.field10091 == null) {
                this.field561 = true;
            } else {
                this.field527 = this.field542 = null;
            }
        }
        if (this.field559 != null && !class504.method2936(this.field603, (byte) -114, this.field519)) {
            if (this.field627 != null && this.field627.field10091 == null) {
                this.field561 = true;
            } else {
                this.field559 = null;
            }
        }
        if (this.field567 != null && !class641.method3646(this.field519, 4, this.field603)) {
            if ((this.field617 == null || this.field617.field1285 != null) && (this.field627 == null || this.field627.field10091 != null)) {
                this.field567 = this.field614 = this.field581 = null;
            } else {
                this.field561 = true;
            }
        }
        if (this.field591 != null && !class787.method4312(this.field519, this.field603, 89)) {
            this.field589 = null;
            this.field591 = null;
        }
        if (this.field544 != null && !class52.method345(this.field603, 32, this.field519)) {
            this.field544 = null;
            this.field579 = null;
        }
        if (this.field576 != null && !class375.method2324(0, this.field603, this.field519)) {
            this.field576 = null;
        }
        if (this.field526 != null && (this.field603 & 0x800) == 0 && (this.field603 & 0x40000) == 0) {
            this.field526 = null;
        }
        if (arg0 < 76) {
            this.field537 = -54;
        }
    }

    @OriginalMember(owner = "client!wv", name = "C", descriptor = "(I)V", line = 5762)
    public final void method101(int arg0) {
        this.field537 = (short) arg0;
        field538++;
        if (this.field627 != null) {
            this.field627.field10091 = null;
        }
    }

    @OriginalMember(owner = "client!wv", name = "na", descriptor = "()I", line = 5777)
    public final int method94() {
        field528++;
        if (!this.field534) {
            this.method262((byte) -127);
        }
        return this.field583;
    }

    @OriginalMember(owner = "client!wv", name = "ua", descriptor = "()I", line = 6679)
    public final int method113() {
        field593++;
        return this.field603;
    }
}
