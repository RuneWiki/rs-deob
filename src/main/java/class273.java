import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ef")
public class class273 extends class259 {

    @OriginalMember(owner = "client!ef", name = "U", descriptor = "I")
    private int field4776 = 409;

    @OriginalMember(owner = "client!ef", name = "Y", descriptor = "I")
    private int field4779 = 4096;

    @OriginalMember(owner = "client!ef", name = "lb", descriptor = "[I")
    private int[] field4792 = new int[3];

    @OriginalMember(owner = "client!ef", name = "bb", descriptor = "I")
    private int field4782 = 4096;

    @OriginalMember(owner = "client!ef", name = "cb", descriptor = "I")
    private int field4783 = 4096;

    @OriginalMember(owner = "client!ef", name = "T", descriptor = "Lsg;")
    private static class30 field4775 = class167.method1221((byte) 33, "Your friend list is full)3 Max of 100 for free users)1 and 200 for members)3");

    @OriginalMember(owner = "client!ef", name = "X", descriptor = "Lsg;")
    public static class30 field4778 = class167.method1221((byte) 33, " ");

    @OriginalMember(owner = "client!ef", name = "Z", descriptor = "Lsg;")
    private static class30 field4780 = class167.method1221((byte) 33, "Loading sprites )2 ");

    @OriginalMember(owner = "client!ef", name = "hb", descriptor = "Lsg;")
    public static class30 field4788 = field4780;

    @OriginalMember(owner = "client!ef", name = "mb", descriptor = "I")
    public static int field4793 = 0;

    @OriginalMember(owner = "client!ef", name = "db", descriptor = "Lsg;")
    public static class30 field4784 = field4775;

    @OriginalMember(owner = "client!ef", name = "fb", descriptor = "Lsg;")
    public static class30 field4786 = class167.method1221((byte) 33, "p12_full");

    @OriginalMember(owner = "client!ef", name = "S", descriptor = "I")
    public static int field4774;

    @OriginalMember(owner = "client!ef", name = "ab", descriptor = "I")
    public static int field4781;

    @OriginalMember(owner = "client!ef", name = "eb", descriptor = "I")
    public static int field4785;

    @OriginalMember(owner = "client!ef", name = "gb", descriptor = "I")
    public static int field4787;

    @OriginalMember(owner = "client!ef", name = "kb", descriptor = "I")
    public static int field4791;

    @OriginalMember(owner = "client!ef", name = "ob", descriptor = "I")
    public static int field4795;

    @OriginalMember(owner = "client!ef", name = "pb", descriptor = "I")
    public static int field4796;

    @OriginalMember(owner = "client!ef", name = "V", descriptor = "Lmc;")
    public static class151 field4777;

    @OriginalMember(owner = "client!ef", name = "ib", descriptor = "Lmc;")
    public static class151 field4789;

    @OriginalMember(owner = "client!ef", name = "nb", descriptor = "Lmc;")
    public static class151 field4794;

    @OriginalMember(owner = "client!ef", name = "jb", descriptor = "[Lsg;")
    public static class30[] field4790;

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(IILaa;)V")
    public final void method4(int arg0, int arg1, class8 arg2) {
        if (arg1 != -1586849108) {
            field4784 = null;
        }
        if (arg0 != 0) {
            if (~arg0 != -2) {
                if (~arg0 != -3) {
                    if (~arg0 != -4) {
                        if (arg0 == 4) {
                            int var5 = arg2.method60(23888);
                            this.field4792[1] = class68.method612(65280, var5) >> 4;
                            this.field4792[0] = class68.method612(var5, 16711680) << 4;
                            this.field4792[2] = class68.method612(var5 >> 12, 0);
                        }
                    } else {
                        this.field4779 = arg2.method65((byte) 116);
                    }
                } else {
                    this.field4782 = arg2.method65((byte) 124);
                }
            } else {
                this.field4783 = arg2.method65((byte) 117);
            }
        } else {
            this.field4776 = arg2.method65((byte) 110);
        }
        ++field4796;
    }

    @OriginalMember(owner = "client!ef", name = "<init>", descriptor = "()V")
    public class273() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ef", name = "i", descriptor = "(I)V")
    public static void method1862(int arg0) {
        field4788 = null;
        field4784 = null;
        field4780 = null;
        if (arg0 != 1) {
            method1862(49);
        }
        field4775 = null;
        field4786 = null;
        field4777 = null;
        field4778 = null;
        field4789 = null;
        field4790 = null;
        field4794 = null;
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(ILjava/awt/Color;Lsg;ZI)V")
    public static final void method1863(int arg0, Color arg1, class30 arg2, boolean arg3, int arg4) {
        try {
            Graphics var5 = class224.field4021.getGraphics();
            if (class16.field332 == null) {
                class16.field332 = new Font("Helvetica", 1, 13);
                class3.field53 = class224.field4021.getFontMetrics(class16.field332);
            }
            if (arg3) {
                var5.setColor(Color.black);
                var5.fillRect(0, 0, class15.field324, class238.field4238);
            }
            if (arg1 == null) {
                arg1 = new Color(140, 17, 17);
            }
            try {
                if (class58.field1263 == null) {
                    class58.field1263 = class224.field4021.createImage(304, 34);
                }
                Graphics var6 = class58.field1263.getGraphics();
                var6.setColor(arg1);
                var6.drawRect(0, 0, 303, 33);
                var6.fillRect(2, 2, arg0 * 3, 30);
                var6.setColor(Color.black);
                var6.drawRect(1, 1, 301, 31);
                var6.fillRect(arg0 * 3 + 2, 2, 300 - arg0 * 3, 30);
                var6.setFont(class16.field332);
                var6.setColor(Color.white);
                arg2.method295((304 - arg2.method254((byte) 84, class3.field53)) / 2, (byte) -122, 22, var6);
                var5.drawImage(class58.field1263, class15.field324 / 2 + -152, class238.field4238 / 2 + -18, (ImageObserver) null);
            } catch (Exception var9) {
                int var7 = class238.field4238 / 2 + -18;
                int var8 = class15.field324 / 2 + -152;
                var5.setColor(arg1);
                var5.drawRect(var8, var7, 303, 33);
                var5.fillRect(var8 + 2, var7 - -2, arg0 * 3, 30);
                var5.setColor(Color.black);
                var5.drawRect(var8 - -1, var7 - -1, 301, 31);
                var5.fillRect(arg0 * 3 + 2 + var8, var7 - -2, -(arg0 * 3) + 300, 30);
                var5.setFont(class16.field332);
                var5.setColor(Color.white);
                arg2.method295(var8 + (304 - arg2.method254((byte) 85, class3.field53)) / 2, (byte) -126, var7 + 22, var5);
            }
            if (class29.field544 != null) {
                var5.setFont(class16.field332);
                var5.setColor(Color.white);
                class29.field544.method295(class15.field324 / 2 - class29.field544.method254((byte) 95, class3.field53) / 2, (byte) -118, class238.field4238 / 2 + -26, var5);
            }
            if (arg4 != 3334) {
                field4780 = null;
            }
        } catch (Exception var10) {
            class224.field4021.repaint();
        }
        ++field4791;
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(BI)[[I")
    public final int[][] method3(byte arg0, int arg1) {
        ++field4787;
        int[][] var3 = super.field4568.method241(-90, arg1);
        int var4 = -78 % ((-48 - arg0) / 42);
        if (super.field4568.field564) {
            int[][] var5 = this.method1795(arg1, 2, 0);
            int[] var6 = var5[0];
            int[] var7 = var5[1];
            int[] var8 = var5[2];
            int[] var9 = var3[1];
            int[] var10 = var3[0];
            int[] var11 = var3[2];
            for (int var12 = 0; var12 < class223.field3999; ++var12) {
                int var13 = var6[var12];
                int var14 = var13 - this.field4792[0];
                if (var14 < 0) {
                    var14 = -var14;
                }
                if (~var14 < ~this.field4776) {
                    var10[var12] = var13;
                    var9[var12] = var7[var12];
                    var11[var12] = var8[var12];
                } else {
                    int var15 = var7[var12];
                    int var16 = var15 - this.field4792[1];
                    if (~var16 > -1) {
                        var16 = -var16;
                    }
                    if (this.field4776 < var16) {
                        var10[var12] = var13;
                        var9[var12] = var15;
                        var11[var12] = var8[var12];
                    } else {
                        int var17 = var8[var12];
                        int var18 = -this.field4792[2] + var17;
                        if (~var18 > -1) {
                            var18 = -var18;
                        }
                        if (this.field4776 < var18) {
                            var10[var12] = var13;
                            var9[var12] = var15;
                            var11[var12] = var17;
                        } else {
                            var10[var12] = this.field4779 * var13 >> 12;
                            var9[var12] = this.field4782 * var15 >> 12;
                            var11[var12] = this.field4783 * var17 >> 12;
                        }
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ef", name = "j", descriptor = "(I)V")
    public static final void method1864(int arg0) {
        ++field4781;
        class262.field4629.method1174((byte) 33);
        class46.field1062.method534(arg0 + -145);
        if (arg0 == 30) {
            class227.field4054.method534(-87);
        }
    }
}
