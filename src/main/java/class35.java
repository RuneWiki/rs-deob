import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dd")
public class class35 extends class186 {

    @OriginalMember(owner = "client!dd", name = "Z", descriptor = "I")
    private int field799 = 0;

    @OriginalMember(owner = "client!dd", name = "jb", descriptor = "I")
    private int field809 = 0;

    @OriginalMember(owner = "client!dd", name = "nb", descriptor = "Z")
    private boolean field813 = false;

    @OriginalMember(owner = "client!dd", name = "V", descriptor = "I")
    public int field795;

    @OriginalMember(owner = "client!dd", name = "bb", descriptor = "I")
    private int field801;

    @OriginalMember(owner = "client!dd", name = "db", descriptor = "I")
    public int field803;

    @OriginalMember(owner = "client!dd", name = "ob", descriptor = "I")
    private int field814;

    @OriginalMember(owner = "client!dd", name = "U", descriptor = "I")
    private int field794;

    @OriginalMember(owner = "client!dd", name = "tb", descriptor = "I")
    public int field819;

    @OriginalMember(owner = "client!dd", name = "W", descriptor = "I")
    private int field796;

    @OriginalMember(owner = "client!dd", name = "cb", descriptor = "I")
    private int field802;

    @OriginalMember(owner = "client!dd", name = "lb", descriptor = "I")
    private int field811;

    @OriginalMember(owner = "client!dd", name = "rb", descriptor = "I")
    public int field817;

    @OriginalMember(owner = "client!dd", name = "hb", descriptor = "I")
    public int field807;

    @OriginalMember(owner = "client!dd", name = "mb", descriptor = "Lca;")
    private class22 field812;

    @OriginalMember(owner = "client!dd", name = "eb", descriptor = "Z")
    public static boolean field804 = false;

    @OriginalMember(owner = "client!dd", name = "T", descriptor = "Loe;")
    public static class139 field793 = new class139(64);

    @OriginalMember(owner = "client!dd", name = "pb", descriptor = "Ljd;")
    private static class92 field815 = class202.method1325((byte) 90, "No reply from loginserver)3");

    @OriginalMember(owner = "client!dd", name = "sb", descriptor = "Ljd;")
    public static class92 field818 = field815;

    @OriginalMember(owner = "client!dd", name = "P", descriptor = "D")
    private double field789;

    @OriginalMember(owner = "client!dd", name = "R", descriptor = "D")
    public double field791;

    @OriginalMember(owner = "client!dd", name = "S", descriptor = "D")
    public double field792;

    @OriginalMember(owner = "client!dd", name = "X", descriptor = "D")
    private double field797;

    @OriginalMember(owner = "client!dd", name = "Y", descriptor = "D")
    private double field798;

    @OriginalMember(owner = "client!dd", name = "ab", descriptor = "D")
    public double field800;

    @OriginalMember(owner = "client!dd", name = "fb", descriptor = "D")
    private double field805;

    @OriginalMember(owner = "client!dd", name = "ib", descriptor = "D")
    private double field808;

    @OriginalMember(owner = "client!dd", name = "O", descriptor = "I")
    private int field788;

    @OriginalMember(owner = "client!dd", name = "Q", descriptor = "I")
    public static int field790;

    @OriginalMember(owner = "client!dd", name = "gb", descriptor = "I")
    public static int field806;

    @OriginalMember(owner = "client!dd", name = "kb", descriptor = "I")
    public static int field810;

    @OriginalMember(owner = "client!dd", name = "qb", descriptor = "I")
    public int field816;

    @OriginalMember(owner = "client!dd", name = "f", descriptor = "(I)Ldg;")
    public final class38 method221(int arg0) {
        field810++;
        if (arg0 > -51) {
            return null;
        }
        class64 var2 = class102.method702((byte) -98, this.field814);
        class38 var3 = var2.method383(this.field809, 127);
        if (var3 == null) {
            return null;
        } else {
            var3.method243(this.field788);
            return var3;
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(II)V")
    public final void method225(int arg0, int arg1) {
        this.field800 += (double) arg1 * this.field797;
        this.field792 += (double) arg1 * this.field808;
        this.field813 = true;
        this.field791 += this.field789 * 0.5D * (double) arg1 * (double) arg1 + (double) arg1 * this.field805;
        this.field805 += (double) arg1 * this.field789;
        this.field816 = (int) (Math.atan2(this.field797, this.field808) * 325.949D) + 1024 & 0x7FF;
        this.field788 = (int) (Math.atan2(this.field805, this.field798) * 325.949D) & 0x7FF;
        field790++;
        if (arg0 != 0) {
            method226((byte) -45);
        }
        if (this.field812 == null) {
            return;
        }
        this.field799 += arg1;
        while (true) {
            do {
                do {
                    if (this.field799 <= this.field812.field515[this.field809]) {
                        return;
                    }
                    this.field799 -= this.field812.field515[this.field809];
                    this.field809++;
                } while (this.field812.field530.length > this.field809);
                this.field809 -= this.field812.field529;
            } while (this.field809 >= 0 && this.field809 < this.field812.field530.length);
            this.field809 = 0;
        }
    }

    @OriginalMember(owner = "client!dd", name = "e", descriptor = "(B)V")
    public static void method226(byte arg0) {
        field818 = null;
        field793 = null;
        if (arg0 < 91) {
            field793 = null;
        }
        field815 = null;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(IIIIB)V")
    public final void method227(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        field806++;
        if (arg4 <= 89) {
            return;
        }
        if (!this.field813) {
            double var6 = (double) (arg0 - this.field796);
            double var8 = (double) (arg3 - this.field811);
            double var10 = Math.sqrt(var6 * var6 + var8 * var8);
            this.field792 = (double) this.field802 * var8 / var10 + (double) this.field811;
            this.field791 = this.field794;
            this.field800 = (double) this.field802 * var6 / var10 + (double) this.field796;
        }
        double var12 = (double) (this.field803 + 1 - arg2);
        this.field808 = ((double) arg3 - this.field792) / var12;
        this.field797 = ((double) arg0 - this.field800) / var12;
        this.field798 = Math.sqrt(this.field808 * this.field808 + this.field797 * this.field797);
        if (!this.field813) {
            this.field805 = -this.field798 * Math.tan((double) this.field801 * 0.02454369D);
        }
        this.field789 = ((double) arg1 - this.field791 - this.field805 * var12) * 2.0D / (var12 * var12);
    }

    @OriginalMember(owner = "client!dd", name = "<init>", descriptor = "(IIIIIIIIIII)V")
    public class35(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field795 = arg9;
        this.field801 = arg7;
        this.field803 = arg6;
        this.field814 = arg0;
        this.field794 = arg4;
        this.field819 = arg5;
        this.field796 = arg2;
        this.field813 = false;
        this.field802 = arg8;
        this.field811 = arg3;
        this.field817 = arg10;
        this.field807 = arg1;
        int var12 = class102.method702((byte) -98, this.field814).field1295;
        if (var12 == -1) {
            this.field812 = null;
        } else {
            this.field812 = class153.method978(var12, -100);
        }
    }
}
