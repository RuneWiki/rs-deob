import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nh")
public abstract class class525 {

    @OriginalMember(owner = "client!nh", name = "e", descriptor = "Z")
    public boolean field7741 = false;

    @OriginalMember(owner = "client!nh", name = "g", descriptor = "I")
    public int field7743 = 2;

    @OriginalMember(owner = "client!nh", name = "o", descriptor = "I")
    public int field7751 = 2;

    @OriginalMember(owner = "client!nh", name = "j", descriptor = "I")
    public int field7746 = 3;

    @OriginalMember(owner = "client!nh", name = "h", descriptor = "Z")
    public boolean field7744 = true;

    @OriginalMember(owner = "client!nh", name = "r", descriptor = "Z")
    public boolean field7754 = false;

    @OriginalMember(owner = "client!nh", name = "s", descriptor = "Z")
    public boolean field7755 = false;

    @OriginalMember(owner = "client!nh", name = "A", descriptor = "Z")
    public boolean field7763 = true;

    @OriginalMember(owner = "client!nh", name = "t", descriptor = "I")
    public int field7756 = 0;

    @OriginalMember(owner = "client!nh", name = "u", descriptor = "I")
    public int field7757 = 0;

    @OriginalMember(owner = "client!nh", name = "i", descriptor = "Z")
    public boolean field7745 = true;

    @OriginalMember(owner = "client!nh", name = "x", descriptor = "I")
    public int field7760 = 0;

    @OriginalMember(owner = "client!nh", name = "F", descriptor = "I")
    public int field7768 = 0;

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "I")
    public int field7737 = 1;

    @OriginalMember(owner = "client!nh", name = "y", descriptor = "I")
    public int field7761 = 2;

    @OriginalMember(owner = "client!nh", name = "D", descriptor = "Z")
    public boolean field7766 = true;

    @OriginalMember(owner = "client!nh", name = "C", descriptor = "Z")
    public boolean field7765 = true;

    @OriginalMember(owner = "client!nh", name = "w", descriptor = "I")
    public int field7759 = 0;

    @OriginalMember(owner = "client!nh", name = "G", descriptor = "Z")
    public boolean field7769 = true;

    @OriginalMember(owner = "client!nh", name = "J", descriptor = "I")
    public int field7772 = 127;

    @OriginalMember(owner = "client!nh", name = "E", descriptor = "I")
    public int field7767 = 127;

    @OriginalMember(owner = "client!nh", name = "p", descriptor = "I")
    public int field7752 = 2;

    @OriginalMember(owner = "client!nh", name = "m", descriptor = "Z")
    public boolean field7749 = true;

    @OriginalMember(owner = "client!nh", name = "N", descriptor = "I")
    public int field7775 = 255;

    @OriginalMember(owner = "client!nh", name = "v", descriptor = "Z")
    public boolean field7758 = true;

    @OriginalMember(owner = "client!nh", name = "z", descriptor = "I")
    public int field7762 = 0;

    @OriginalMember(owner = "client!nh", name = "B", descriptor = "Z")
    public boolean field7764 = true;

    @OriginalMember(owner = "client!nh", name = "K", descriptor = "Z")
    public boolean field7773 = true;

    @OriginalMember(owner = "client!nh", name = "n", descriptor = "Z")
    public boolean field7750 = true;

    @OriginalMember(owner = "client!nh", name = "P", descriptor = "I")
    public int field7777 = 0;

    @OriginalMember(owner = "client!nh", name = "Q", descriptor = "Z")
    public boolean field7778 = true;

    @OriginalMember(owner = "client!nh", name = "d", descriptor = "Lff;")
    public static class9 field7740 = new class9(86, 14);

    @OriginalMember(owner = "client!nh", name = "I", descriptor = "Lff;")
    public static class9 field7771 = new class9(68, 4);

    @OriginalMember(owner = "client!nh", name = "R", descriptor = "I")
    public static int field7779 = 0;

    @OriginalMember(owner = "client!nh", name = "S", descriptor = "I")
    public static int field7780 = 0;

    @OriginalMember(owner = "client!nh", name = "c", descriptor = "I")
    public static int field7739;

    @OriginalMember(owner = "client!nh", name = "f", descriptor = "I")
    public static int field7742;

    @OriginalMember(owner = "client!nh", name = "l", descriptor = "I")
    public static int field7748;

    @OriginalMember(owner = "client!nh", name = "q", descriptor = "I")
    public static int field7753;

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "Z")
    public boolean field7738;

    @OriginalMember(owner = "client!nh", name = "k", descriptor = "Z")
    public boolean field7747;

    @OriginalMember(owner = "client!nh", name = "L", descriptor = "Z")
    public boolean field7774;

    @OriginalMember(owner = "client!nh", name = "H", descriptor = "[I")
    public static int[] field7770;

    @OriginalMember(owner = "client!nh", name = "O", descriptor = "[I")
    public static int[] field7776;

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(IB)Z", line = 9)
    public final boolean method3086(int arg0, byte arg1) {
        if (arg1 != 60) {
            this.field7778 = true;
        }
        field7739++;
        return arg0 == 1 || arg0 == 3 ? this.field7774 : this.field7747;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(III)V", line = 28)
    public final void method3087(int arg0, int arg1, int arg2) {
        field7742++;
        if (arg2 == 1 || arg2 == 3) {
            this.field7751 = arg0;
        } else {
            this.field7762 = arg0;
        }
        if (arg1 != 2) {
            this.method3088(-74, true, 91);
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(IZI)V", line = 44)
    public final void method3088(int arg0, boolean arg1, int arg2) {
        field7753++;
        if (arg2 == 1 || arg2 == 3) {
            this.field7774 = arg1;
        } else {
            this.field7747 = arg1;
        }
        if (arg0 > -32) {
            this.method3086(-47, (byte) -22);
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(BI)I", line = 88)
    public final int method3089(byte arg0, int arg1) {
        field7748++;
        if (arg0 <= 93) {
            this.method3086(9, (byte) 58);
        }
        return arg1 == 1 || arg1 == 3 ? this.field7751 : this.field7762;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(Z)V", line = 168)
    public static void method3090(boolean arg0) {
        if (arg0) {
            field7771 = null;
            field7770 = null;
            field7776 = null;
            field7740 = null;
        }
    }
}
