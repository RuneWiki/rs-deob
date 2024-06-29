import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sb")
public class class90 extends class259 {

    @OriginalMember(owner = "client!sb", name = "T", descriptor = "I")
    private int field1808 = 4096;

    @OriginalMember(owner = "client!sb", name = "X", descriptor = "[I")
    private int[] field1812 = new int[3];

    @OriginalMember(owner = "client!sb", name = "fb", descriptor = "I")
    private int field1820 = 3216;

    @OriginalMember(owner = "client!sb", name = "U", descriptor = "I")
    private int field1809 = 3216;

    @OriginalMember(owner = "client!sb", name = "S", descriptor = "[I")
    public static int[] field1807 = new int[200];

    @OriginalMember(owner = "client!sb", name = "db", descriptor = "I")
    public static int field1818 = 0;

    @OriginalMember(owner = "client!sb", name = "bb", descriptor = "I")
    public static int field1816 = 0;

    @OriginalMember(owner = "client!sb", name = "W", descriptor = "Llk;")
    public static class232 field1811 = new class232(4);

    @OriginalMember(owner = "client!sb", name = "jb", descriptor = "Lsg;")
    private static class30 field1824 = class167.method1221((byte) 33, "Loading fonts )2 ");

    @OriginalMember(owner = "client!sb", name = "mb", descriptor = "Lsg;")
    public static class30 field1827 = class167.method1221((byte) 33, "(Udns");

    @OriginalMember(owner = "client!sb", name = "lb", descriptor = "Lsg;")
    public static class30 field1826 = field1824;

    @OriginalMember(owner = "client!sb", name = "hb", descriptor = "[[B")
    public static byte[][] field1822 = new byte[50][];

    @OriginalMember(owner = "client!sb", name = "V", descriptor = "I")
    public static int field1810;

    @OriginalMember(owner = "client!sb", name = "Y", descriptor = "I")
    public static int field1813;

    @OriginalMember(owner = "client!sb", name = "Z", descriptor = "I")
    public static int field1814;

    @OriginalMember(owner = "client!sb", name = "ab", descriptor = "I")
    public static int field1815;

    @OriginalMember(owner = "client!sb", name = "cb", descriptor = "I")
    public static int field1817;

    @OriginalMember(owner = "client!sb", name = "eb", descriptor = "I")
    public static int field1819;

    @OriginalMember(owner = "client!sb", name = "gb", descriptor = "I")
    public static int field1821;

    @OriginalMember(owner = "client!sb", name = "ib", descriptor = "I")
    public static int field1823;

    @OriginalMember(owner = "client!sb", name = "kb", descriptor = "Lmc;")
    public static class151 field1825;

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(Lmc;B)V")
    public static final void method736(class151 arg0, byte arg1) {
        ++field1819;
        class268.field4720 = class216.method1581(class116.field2288, -4333, arg0);
        class106.field2134 = new int[256];
        for (int var2 = 0; var2 < 3; ++var2) {
            float var4 = (float) ((16711680 & class132.field2603[var2]) >> 16);
            int var5 = 255 & class132.field2603[var2 + 1] >> 16;
            float var6 = (float) ((class132.field2603[var2] & 65280) >> 8);
            float var7 = ((float) var5 - var4) / 64.0F;
            int var8 = (class132.field2603[var2 - -1] & 65280) >> 8;
            float var9 = (float) (class132.field2603[var2] & 255);
            int var10 = 255 & class132.field2603[var2 + 1];
            float var11 = ((float) var8 + -var6) / 64.0F;
            float var12 = ((float) var10 + -var9) / 64.0F;
            for (int var13 = 0; ~var13 > -65; ++var13) {
                class106.field2134[var2 * 64 + var13] = class182.method1314((int) var9, class182.method1314((int) var6 << 8, (int) var4 << 16));
                var9 += var12;
                var6 += var11;
                var4 += var7;
            }
        }
        if (arg1 != -71) {
            method739(true);
        }
        for (int var3 = 192; ~var3 > -256; ++var3) {
            class106.field2134[var3] = class132.field2603[3];
        }
        class262.field4637 = new int[32768];
        class241.field4271 = new int[32768];
        class225.method1612(arg1 ^ -72, (class192) null);
        class131.field2588 = new int[32768];
        class17.field346 = new int[32768];
        class120.field2338 = new class152(128, 254);
    }

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "(B)V")
    public static void method737(byte arg0) {
        field1822 = null;
        int var1 = 8 / ((37 - arg0) / 61);
        field1824 = null;
        field1811 = null;
        field1807 = null;
        field1827 = null;
        field1825 = null;
        field1826 = null;
    }

    @OriginalMember(owner = "client!sb", name = "f", descriptor = "(I)V")
    public final void method11(int arg0) {
        if (arg0 < 11) {
            this.field1812 = null;
        }
        this.method738(1454806956);
        ++field1817;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(IILaa;)V")
    public final void method4(int arg0, int arg1, class8 arg2) {
        if (~arg0 != -1) {
            if (~arg0 != -2) {
                if (arg0 == 2) {
                    this.field1809 = arg2.method65((byte) 121);
                }
            } else {
                this.field1820 = arg2.method65((byte) 119);
            }
        } else {
            this.field1808 = arg2.method65((byte) 107);
        }
        ++field1810;
        if (arg1 != -1586849108) {
            this.method11(-42);
        }
    }

    @OriginalMember(owner = "client!sb", name = "i", descriptor = "(I)V")
    private final void method738(int arg0) {
        ++field1815;
        double var2 = Math.cos((double) ((float) this.field1809 / 4096.0F));
        if (arg0 != 1454806956) {
            field1826 = null;
        }
        this.field1812[0] = (int) (Math.sin((double) ((float) this.field1820 / 4096.0F)) * var2 * 4096.0D);
        this.field1812[1] = (int) (var2 * Math.cos((double) ((float) this.field1820 / 4096.0F)) * 4096.0D);
        this.field1812[2] = (int) (Math.sin((double) ((float) this.field1809 / 4096.0F)) * 4096.0D);
        int var4 = this.field1812[1] * this.field1812[1] >> 12;
        int var5 = this.field1812[0] * this.field1812[0] >> 12;
        int var6 = this.field1812[2] * this.field1812[2] >> 12;
        int var7 = (int) (Math.sqrt((double) (var4 - -var6 + var5 >> 12)) * 4096.0D);
        if (~var7 != -1) {
            this.field1812[0] = (this.field1812[0] << 12) / var7;
            this.field1812[2] = (this.field1812[2] << 12) / var7;
            this.field1812[1] = (this.field1812[1] << 12) / var7;
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(IZ)[I")
    public final int[] method17(int arg0, boolean arg1) {
        ++field1814;
        if (arg1) {
            this.method17(-98, true);
        }
        int[] var3 = super.field4581.method1841(18, arg0);
        if (super.field4581.field4729) {
            int var4 = class108.field2183 * this.field1808 >> 12;
            int[] var5 = this.method1799(0, arg0 + -1 & class263.field4649, 122);
            int[] var6 = this.method1799(0, arg0, 118);
            int[] var7 = this.method1799(0, arg0 + 1 & class263.field4649, 126);
            for (int var8 = 0; ~class223.field3999 < ~var8; ++var8) {
                int var9 = (var7[var8] + -var5[var8]) * var4 >> 12;
                int var10 = (var6[class52.field1174 & var8 + -1] + -var6[var8 + 1 & class52.field1174]) * var4 >> 12;
                int var11 = var9 >> 4;
                if (var11 < 0) {
                    var11 = -var11;
                }
                if (var11 > 255) {
                    var11 = 255;
                }
                int var12 = var10 >> 4;
                if (var12 < 0) {
                    var12 = -var12;
                }
                if (var12 > 255) {
                    var12 = 255;
                }
                int var13 = 255 & class143.field2757[((var11 + 1) * var11 >> 1) + var12];
                int var14 = var9 * var13 >> 8;
                int var15 = var10 * var13 >> 8;
                int var16 = var13 * 4096 >> 8;
                int var17 = this.field1812[1] * var14 >> 12;
                int var18 = this.field1812[0] * var15 >> 12;
                int var19 = this.field1812[2] * var16 >> 12;
                var3[var8] = var17 + var18 + var19;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!sb", name = "<init>", descriptor = "()V")
    public class90() {
        super(1, true);
    }

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "(Z)V")
    public static final void method739(boolean arg0) {
        int[] var1 = new int[class189.field3442];
        ++field1813;
        if (!arg0) {
            int var2 = 0;
            for (int var3 = 0; class189.field3442 > var3; ++var3) {
                class168 var5 = class201.method1425(51, var3);
                if (var5.field3102 >= 0 || ~var5.field3143 <= -1) {
                    var1[var2++] = var3;
                }
            }
            class59.field1288 = new int[var2];
            for (int var4 = 0; ~var4 > ~var2; ++var4) {
                class59.field1288[var4] = var1[var4];
            }
        }
    }
}
