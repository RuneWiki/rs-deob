import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ac")
public class class226 extends class152 {

    @OriginalMember(owner = "client!ac", name = "X", descriptor = "I")
    private int field3803;

    @OriginalMember(owner = "client!ac", name = "S", descriptor = "I")
    public static int field3798 = 0;

    @OriginalMember(owner = "client!ac", name = "cb", descriptor = "Lce;")
    public static class126 field3808 = class206.method1445(-7923, ")2");

    @OriginalMember(owner = "client!ac", name = "T", descriptor = "Lce;")
    public static class126 field3799 = class206.method1445(-7923, "headicons_prayer");

    @OriginalMember(owner = "client!ac", name = "Y", descriptor = "I")
    public static int field3804 = 0;

    @OriginalMember(owner = "client!ac", name = "W", descriptor = "Lce;")
    private static class126 field3802 = class206.method1445(-7923, "rating: ");

    @OriginalMember(owner = "client!ac", name = "U", descriptor = "Lce;")
    public static class126 field3800 = field3802;

    @OriginalMember(owner = "client!ac", name = "gb", descriptor = "Lce;")
    private static class126 field3812 = class206.method1445(-7923, " has logged out)3");

    @OriginalMember(owner = "client!ac", name = "hb", descriptor = "I")
    public static int field3813 = 0;

    @OriginalMember(owner = "client!ac", name = "ib", descriptor = "I")
    public static int field3814 = 0;

    @OriginalMember(owner = "client!ac", name = "fb", descriptor = "[I")
    public static int[] field3811 = new int[64];

    @OriginalMember(owner = "client!ac", name = "bb", descriptor = "Lce;")
    public static class126 field3807 = field3812;

    @OriginalMember(owner = "client!ac", name = "R", descriptor = "I")
    public static int field3797;

    @OriginalMember(owner = "client!ac", name = "V", descriptor = "I")
    public static int field3801;

    @OriginalMember(owner = "client!ac", name = "Z", descriptor = "I")
    public static int field3805;

    @OriginalMember(owner = "client!ac", name = "ab", descriptor = "I")
    public static int field3806;

    @OriginalMember(owner = "client!ac", name = "db", descriptor = "I")
    public static int field3809;

    @OriginalMember(owner = "client!ac", name = "eb", descriptor = "I")
    public static int field3810;

    @OriginalMember(owner = "client!ac", name = "jb", descriptor = "I")
    public static int field3815;

    @OriginalMember(owner = "client!ac", name = "<init>", descriptor = "()V", line = 13)
    public class226() {
        this(4096);
    }

    @OriginalMember(owner = "client!ac", name = "f", descriptor = "(I)V", line = 17)
    public static final void method1540(int arg0) {
        class254.field4264.method1178(-118);
        field3815++;
        if (arg0 <= -66) {
            class197.field3369.method1178(-107);
            class223.field3763.method1178(-89);
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(IILbb;)V", line = 35)
    public final void method5(int arg0, int arg1, class134 arg2) {
        field3801++;
        if (arg0 == 8 && arg1 == 0) {
            this.field3803 = (arg2.method948(-125) << 12) / 255;
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(ZI)[I", line = 61)
    public final int[] method6(boolean arg0, int arg1) {
        field3797++;
        int[] var3 = this.field2776.method1799((byte) 107, arg1);
        if (!arg0) {
            method1543(-66, 125L);
        }
        if (this.field2776.field4516) {
            class230.method1565(var3, 0, class244.field4133, this.field3803);
        }
        return var3;
    }

    @OriginalMember(owner = "client!ac", name = "g", descriptor = "(I)V", line = 86)
    public static void method1541(int arg0) {
        field3802 = null;
        field3799 = null;
        if (arg0 != -3560) {
            return;
        }
        field3812 = null;
        field3811 = null;
        field3800 = null;
        field3808 = null;
        field3807 = null;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(JI)V", line = 115)
    public static final void method1542(long arg0, int arg1) {
        class103.field1645.field2299 = 0;
        field3810++;
        class103.field1645.method933(-3, 211);
        class103.field1645.method962(-118, arg0);
        class224.field3788 = 0;
        class209.field3596 = 0;
        if (arg1 >= 108) {
            class267.field4522 = 1;
            class287.field4773 = -3;
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(IJ)V", line = 132)
    public static final void method1543(int arg0, long arg1) {
        field3806++;
        if (arg1 == 0L) {
            return;
        }
        for (int var3 = 0; var3 < class14.field197; var3++) {
            if (class64.field1088[var3] == arg1) {
                class14.field197--;
                for (int var4 = var3; var4 < class14.field197; var4++) {
                    class298.field4953[var4] = class298.field4953[var4 + 1];
                    class262.field4381[var4] = class262.field4381[var4 + 1];
                    class87.field1372[var4] = class87.field1372[var4 + 1];
                    class64.field1088[var4] = class64.field1088[var4 + 1];
                    class200.field3404[var4] = class200.field3404[var4 + 1];
                    class132.field2265[var4] = class132.field2265[var4 + 1];
                }
                class78.field1269++;
                class130.field2227 = class50.field777;
                class103.field1645.method1238(21, 95);
                class103.field1645.method962(-122, arg1);
                break;
            }
        }
        if (arg0 <= 18) {
            field3809 = 41;
        }
    }

    @OriginalMember(owner = "client!ac", name = "<init>", descriptor = "(I)V", line = 210)
    private class226(int arg0) {
        super(0, true);
        this.field3803 = 4096;
        this.field3803 = arg0;
    }
}
