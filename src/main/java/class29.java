import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ed")
public class class29 extends class6 {

    @OriginalMember(owner = "client!ed", name = "Hb", descriptor = "Z")
    private boolean field775 = false;

    @OriginalMember(owner = "client!ed", name = "Xb", descriptor = "I")
    private int field791 = 0;

    @OriginalMember(owner = "client!ed", name = "Ub", descriptor = "I")
    private int field788 = 0;

    @OriginalMember(owner = "client!ed", name = "Qb", descriptor = "I")
    private int field784;

    @OriginalMember(owner = "client!ed", name = "Vb", descriptor = "I")
    public int field789;

    @OriginalMember(owner = "client!ed", name = "Cb", descriptor = "I")
    public int field770;

    @OriginalMember(owner = "client!ed", name = "cc", descriptor = "I")
    private int field796;

    @OriginalMember(owner = "client!ed", name = "Rb", descriptor = "I")
    private int field785;

    @OriginalMember(owner = "client!ed", name = "ec", descriptor = "I")
    private int field798;

    @OriginalMember(owner = "client!ed", name = "dc", descriptor = "I")
    private int field797;

    @OriginalMember(owner = "client!ed", name = "ub", descriptor = "I")
    public int field762;

    @OriginalMember(owner = "client!ed", name = "Jb", descriptor = "I")
    private int field777;

    @OriginalMember(owner = "client!ed", name = "Kb", descriptor = "I")
    public int field778;

    @OriginalMember(owner = "client!ed", name = "Zb", descriptor = "I")
    public int field793;

    @OriginalMember(owner = "client!ed", name = "rb", descriptor = "Laa;")
    private class1 field759;

    @OriginalMember(owner = "client!ed", name = "sb", descriptor = "Lke;")
    public static class65 field760 = class1.method17("Lade Freunde)2Liste)3)3)3", -115);

    @OriginalMember(owner = "client!ed", name = "qb", descriptor = "Lke;")
    private static class65 field758 = class1.method17("Walk here", -116);

    @OriginalMember(owner = "client!ed", name = "Nb", descriptor = "Lke;")
    public static class65 field781 = class1.method17("Weiter", -116);

    @OriginalMember(owner = "client!ed", name = "Pb", descriptor = "[Lke;")
    public static class65[] field783 = new class65[500];

    @OriginalMember(owner = "client!ed", name = "yb", descriptor = "Lke;")
    public static class65 field766 = field758;

    @OriginalMember(owner = "client!ed", name = "wb", descriptor = "Lke;")
    private static class65 field764 = class1.method17("Loaded sprites", -119);

    @OriginalMember(owner = "client!ed", name = "Sb", descriptor = "Lke;")
    private static class65 field786 = class1.method17("Login limit exceeded)3", -121);

    @OriginalMember(owner = "client!ed", name = "Mb", descriptor = "Lke;")
    public static class65 field780 = field764;

    @OriginalMember(owner = "client!ed", name = "Lb", descriptor = "Lke;")
    public static class65 field779 = field786;

    @OriginalMember(owner = "client!ed", name = "Wb", descriptor = "Lke;")
    private static class65 field790 = class1.method17("white:", -125);

    @OriginalMember(owner = "client!ed", name = "bc", descriptor = "Lke;")
    public static class65 field795 = field790;

    @OriginalMember(owner = "client!ed", name = "tb", descriptor = "D")
    private double field761;

    @OriginalMember(owner = "client!ed", name = "Ab", descriptor = "D")
    private double field768;

    @OriginalMember(owner = "client!ed", name = "Bb", descriptor = "D")
    private double field769;

    @OriginalMember(owner = "client!ed", name = "Eb", descriptor = "D")
    public double field772;

    @OriginalMember(owner = "client!ed", name = "Fb", descriptor = "D")
    private double field773;

    @OriginalMember(owner = "client!ed", name = "Gb", descriptor = "D")
    private double field774;

    @OriginalMember(owner = "client!ed", name = "Ib", descriptor = "D")
    public double field776;

    @OriginalMember(owner = "client!ed", name = "Tb", descriptor = "D")
    public double field787;

    @OriginalMember(owner = "client!ed", name = "ob", descriptor = "I")
    public static int field756;

    @OriginalMember(owner = "client!ed", name = "pb", descriptor = "I")
    public static int field757;

    @OriginalMember(owner = "client!ed", name = "vb", descriptor = "I")
    public static int field763;

    @OriginalMember(owner = "client!ed", name = "xb", descriptor = "I")
    public static int field765;

    @OriginalMember(owner = "client!ed", name = "zb", descriptor = "I")
    public int field767;

    @OriginalMember(owner = "client!ed", name = "Db", descriptor = "I")
    private int field771;

    @OriginalMember(owner = "client!ed", name = "ac", descriptor = "I")
    public static int field794;

    @OriginalMember(owner = "client!ed", name = "Yb", descriptor = "Luc;")
    public static class119 field792;

    @OriginalMember(owner = "client!ed", name = "Ob", descriptor = "Lkb;")
    public static class61 field782;

    @OriginalMember(owner = "client!ed", name = "g", descriptor = "(I)Lga;", line = 20)
    public final class37 method45(int arg0) {
        field765++;
        class79 var2 = class5.method36(this.field784, -125);
        class37 var3 = var2.method696((byte) 75, this.field791);
        int var4 = 47 % ((-arg0 - 6) / 52);
        if (var3 == null) {
            return null;
        } else {
            var3.method280(this.field771);
            return var3;
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(Ljava/awt/Component;I)V", line = 47)
    public static final void method239(Component arg0, int arg1) {
        field757++;
        if (arg1 != 21151) {
            method243(false);
        }
        arg0.addMouseListener(class130.field3157);
        arg0.addMouseMotionListener(class130.field3157);
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(IZIII)V", line = 59)
    public final void method240(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        if (!this.field775) {
            double var6 = (double) (arg3 - this.field785);
            double var8 = (double) (arg0 - this.field798);
            double var10 = Math.sqrt(var6 * var6 + var8 * var8);
            this.field776 = (double) this.field777 * var8 / var10 + (double) this.field798;
            this.field772 = this.field796;
            this.field787 = (double) this.field777 * var6 / var10 + (double) this.field785;
        }
        field794++;
        double var12 = (double) (this.field789 + 1 - arg2);
        if (arg1) {
            this.field797 = -25;
        }
        this.field773 = ((double) arg0 - this.field776) / var12;
        this.field769 = ((double) arg3 - this.field787) / var12;
        this.field774 = Math.sqrt(this.field773 * this.field773 + this.field769 * this.field769);
        if (!this.field775) {
            this.field761 = -this.field774 * Math.tan((double) this.field797 * 0.02454369D);
        }
        this.field768 = ((double) arg4 - this.field772 - this.field761 * var12) * 2.0D / (var12 * var12);
    }

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "(IB)V", line = 114)
    public final void method241(int arg0, byte arg1) {
        this.field775 = true;
        this.field772 += this.field768 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field761;
        this.field776 += (double) arg0 * this.field773;
        field763++;
        this.field761 += (double) arg0 * this.field768;
        this.field787 += (double) arg0 * this.field769;
        if (arg1 != 101) {
            return;
        }
        this.field767 = (int) (Math.atan2(this.field769, this.field773) * 325.949D) + 1024 & 0x7FF;
        this.field771 = (int) (Math.atan2(this.field761, this.field774) * 325.949D) & 0x7FF;
        if (this.field759 == null) {
            return;
        }
        this.field788 += arg0;
        while (this.field759.field24[this.field791] < this.field788) {
            this.field788 -= this.field759.field24[this.field791];
            this.field791++;
            if (this.field791 >= this.field759.field21.length) {
                this.field791 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!ed", name = "f", descriptor = "(B)V", line = 149)
    public static final void method242(byte arg0) {
        try {
            Graphics var1 = class10.field210.getGraphics();
            int var2 = 92 % ((arg0 + 43) / 58);
            class64.field1668.method790(17, 357, var1, -73);
        } catch (Exception var3) {
            class10.field210.repaint();
        }
        field756++;
    }

    @OriginalMember(owner = "client!ed", name = "<init>", descriptor = "(IIIIIIIIIII)V", line = 248)
    public class29(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field784 = arg0;
        this.field789 = arg6;
        this.field770 = arg10;
        this.field796 = arg4;
        this.field785 = arg2;
        this.field798 = arg3;
        this.field797 = arg7;
        this.field762 = arg1;
        this.field777 = arg8;
        this.field778 = arg5;
        this.field793 = arg9;
        this.field775 = false;
        int var12 = class5.method36(this.field784, -128).field2110;
        if (var12 == -1) {
            this.field759 = null;
        } else {
            this.field759 = class80.method702(120, var12);
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(Z)V", line = 168)
    public static void method243(boolean arg0) {
        field790 = null;
        field758 = null;
        field792 = null;
        if (arg0) {
            method242((byte) -67);
        }
        field766 = null;
        field783 = null;
        field782 = null;
        field786 = null;
        field781 = null;
        field779 = null;
        field760 = null;
        field780 = null;
        field764 = null;
        field795 = null;
    }
}
