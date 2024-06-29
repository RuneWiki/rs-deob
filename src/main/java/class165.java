import java.awt.Component;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ra")
public class class165 extends class197 {

    @OriginalMember(owner = "client!ra", name = "Q", descriptor = "I")
    private int field2785 = 0;

    @OriginalMember(owner = "client!ra", name = "X", descriptor = "I")
    private int field2792 = 81;

    @OriginalMember(owner = "client!ra", name = "O", descriptor = "I")
    private int field2783 = 1024;

    @OriginalMember(owner = "client!ra", name = "db", descriptor = "I")
    private int field2798 = 4;

    @OriginalMember(owner = "client!ra", name = "T", descriptor = "I")
    private int field2788 = 8;

    @OriginalMember(owner = "client!ra", name = "gb", descriptor = "I")
    private int field2801 = 1024;

    @OriginalMember(owner = "client!ra", name = "mb", descriptor = "I")
    private int field2807 = 204;

    @OriginalMember(owner = "client!ra", name = "nb", descriptor = "I")
    private int field2808 = 409;

    @OriginalMember(owner = "client!ra", name = "Z", descriptor = "Loh;")
    public static class258 field2794 = class153.method1046("W-=hlen Sie eine Option", 97);

    @OriginalMember(owner = "client!ra", name = "M", descriptor = "Lmi;")
    public static class12 field2781 = new class12();

    @OriginalMember(owner = "client!ra", name = "ib", descriptor = "Loh;")
    public static class258 field2803 = class153.method1046("titlebg", 122);

    @OriginalMember(owner = "client!ra", name = "pb", descriptor = "I")
    public static int field2810 = 0;

    @OriginalMember(owner = "client!ra", name = "P", descriptor = "I")
    public static int field2784;

    @OriginalMember(owner = "client!ra", name = "U", descriptor = "I")
    public static int field2789;

    @OriginalMember(owner = "client!ra", name = "W", descriptor = "I")
    public static int field2791;

    @OriginalMember(owner = "client!ra", name = "Y", descriptor = "I")
    public static int field2793;

    @OriginalMember(owner = "client!ra", name = "ab", descriptor = "I")
    private int field2795;

    @OriginalMember(owner = "client!ra", name = "bb", descriptor = "I")
    public static int field2796;

    @OriginalMember(owner = "client!ra", name = "cb", descriptor = "I")
    public static int field2797;

    @OriginalMember(owner = "client!ra", name = "eb", descriptor = "I")
    private int field2799;

    @OriginalMember(owner = "client!ra", name = "fb", descriptor = "I")
    public static int field2800;

    @OriginalMember(owner = "client!ra", name = "hb", descriptor = "I")
    public static int field2802;

    @OriginalMember(owner = "client!ra", name = "jb", descriptor = "I")
    private int field2804;

    @OriginalMember(owner = "client!ra", name = "kb", descriptor = "I")
    public static int field2805;

    @OriginalMember(owner = "client!ra", name = "lb", descriptor = "I")
    public static int field2806;

    @OriginalMember(owner = "client!ra", name = "ob", descriptor = "I")
    public static int field2809;

    @OriginalMember(owner = "client!ra", name = "S", descriptor = "Lke;")
    public static class116 field2787;

    @OriginalMember(owner = "client!ra", name = "V", descriptor = "[I")
    private int[] field2790;

    @OriginalMember(owner = "client!ra", name = "N", descriptor = "[[I")
    private int[][] field2782;

    @OriginalMember(owner = "client!ra", name = "R", descriptor = "[[I")
    private int[][] field2786;

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(BLs;)V", line = 9)
    public static final void method1099(byte arg0, class171 arg1) {
        if (class207.field3568 == arg1.field3021) {
            class238.field4151[arg1.field2927] = true;
        }
        field2805++;
        if (arg0 <= 124) {
            field2787 = (class116) null;
        }
    }

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "(I)V", line = 31)
    private final void method1100(int arg0) {
        field2806++;
        Random var2 = new Random((long) this.field2788);
        this.field2804 = this.field2792 / 2;
        this.field2799 = 4096 / this.field2788;
        int var3 = this.field2799 / 2;
        this.field2782 = new int[this.field2788][this.field2798 + 1];
        this.field2795 = 4096 / this.field2798;
        this.field2786 = new int[this.field2788][this.field2798];
        int var4 = this.field2795 / 2;
        this.field2790 = new int[this.field2788 + 1];
        this.field2790[0] = 0;
        int var5 = -63 / ((-arg0 - 6) / 38);
        for (int var6 = 0; var6 < this.field2788; var6++) {
            if (var6 > 0) {
                int var7 = this.field2799;
                int var8 = (class285.method1996(1, var2, 4096) - 2048) * this.field2807 >> 12;
                int var9 = (var3 * var8 >> 12) + var7;
                this.field2790[var6] = this.field2790[var6 - 1] + var9;
            }
            this.field2782[var6][0] = 0;
            for (int var10 = 0; var10 < this.field2798; var10++) {
                if (var10 > 0) {
                    int var11 = this.field2795;
                    int var12 = (class285.method1996(1, var2, 4096) - 2048) * this.field2808 >> 12;
                    int var13 = (var4 * var12 >> 12) + var11;
                    this.field2782[var6][var10] = this.field2782[var6][var10 - 1] + var13;
                }
                this.field2786[var6][var10] = this.field2783 > 0 ? 4096 - class285.method1996(1, var2, this.field2783) : 4096;
            }
            this.field2782[var6][this.field2798] = 4096;
        }
        this.field2790[this.field2788] = 4096;
    }

    @OriginalMember(owner = "client!ra", name = "<init>", descriptor = "()V", line = 385)
    public class165() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(I)V", line = 116)
    public final void method223(int arg0) {
        if (arg0 != 11135) {
            this.field2804 = 46;
        }
        field2796++;
        this.method1100(37);
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(ILjava/awt/Component;)V", line = 133)
    public static final void method1101(int arg0, Component arg1) {
        arg1.addMouseListener(class299.field5112);
        int var2 = -105 % ((38 - arg0) / 52);
        arg1.addMouseMotionListener(class299.field5112);
        arg1.addFocusListener(class299.field5112);
        field2791++;
    }

    @OriginalMember(owner = "client!ra", name = "g", descriptor = "(B)V", line = 151)
    public static void method1102(byte arg0) {
        field2803 = null;
        if (arg0 > -116) {
            field2787 = (class116) null;
        }
        field2794 = null;
        field2781 = null;
        field2787 = null;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(II)[I", line = 167)
    public final int[] method96(int arg0, int arg1) {
        field2809++;
        if (arg0 != -16221) {
            method1103((byte) -19, (byte[]) null, -119, -21);
        }
        int[] var3 = this.field3456.method2104(arg1, 0);
        if (this.field3456.field5115) {
            int var4 = 0;
            int var5;
            for (var5 = class268.field4670[arg1] + this.field2785; var5 < 0; var5 += 4096) {
            }
            while (var5 > 4096) {
                var5 -= 4096;
            }
            while (var4 < this.field2788 && this.field2790[var4] <= var5) {
                var4++;
            }
            int var6 = this.field2790[var4];
            boolean var7 = (var4 & 0x1) == 0;
            int var8 = var4 - 1;
            int var9 = this.field2790[var4 - 1];
            if (var5 > (var9 + this.field2804) && var5 < (var6 - this.field2804)) {
                for (int var10 = 0; var10 < class190.field3362; var10++) {
                    int var11 = var7 ? this.field2801 : -this.field2801;
                    int var12;
                    for (var12 = (this.field2795 * var11 >> 12) + class166.field2822[var10]; var12 < 0; var12 += 4096) {
                    }
                    while (var12 > 4096) {
                        var12 -= 4096;
                    }
                    int var13;
                    for (var13 = 0; var13 < this.field2798 && this.field2782[var8][var13] <= var12; var13++) {
                    }
                    int var14 = this.field2782[var8][var13];
                    int var15 = var13 - 1;
                    int var16 = this.field2782[var8][var15];
                    if (this.field2804 + var16 < var12 && var12 < (var14 - this.field2804)) {
                        var3[var10] = this.field2786[var8][var15];
                    } else {
                        var3[var10] = 0;
                    }
                }
            } else {
                class275.method1931(var3, 0, class190.field3362, 0);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(ILva;I)V", line = 269)
    public final void method98(int arg0, class235 arg1, int arg2) {
        if (arg0 != 7955) {
            field2803 = (class258) null;
        }
        field2802++;
        if (arg2 == 0) {
            this.field2798 = arg1.method1589(95);
        } else if (arg2 == 1) {
            this.field2788 = arg1.method1589(arg0 ^ 0x1F7D);
        } else if (arg2 == 2) {
            this.field2808 = arg1.method1615(76);
        } else if (arg2 == 3) {
            this.field2807 = arg1.method1615(81);
        } else if (arg2 == 4) {
            this.field2801 = arg1.method1615(-124);
        } else if (arg2 == 5) {
            this.field2785 = arg1.method1615(56);
        } else if (arg2 == 6) {
            this.field2792 = arg1.method1615(-21);
        } else if (arg2 == 7) {
            this.field2783 = arg1.method1615(arg0 ^ 0x1F1F);
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(B[BII)I", line = 363)
    public static final int method1103(byte arg0, byte[] arg1, int arg2, int arg3) {
        field2793++;
        int var4 = -1;
        for (int var5 = arg2; var5 < arg3; var5++) {
            var4 = class73.field1280[(arg1[var5] ^ var4) & 0xFF] ^ var4 >>> 8;
        }
        int var6 = ~var4;
        return arg0 == -113 ? var6 : -63;
    }
}
