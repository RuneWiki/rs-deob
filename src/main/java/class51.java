import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pj")
public class class51 {

    @OriginalMember(owner = "client!pj", name = "h", descriptor = "I")
    private int field794;

    @OriginalMember(owner = "client!pj", name = "e", descriptor = "[Lf;")
    private class291[] field791;

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "Leg;")
    public static class37 field787 = class174.method1167(")4a=", -99);

    @OriginalMember(owner = "client!pj", name = "d", descriptor = "I")
    public static int field790 = 3353893;

    @OriginalMember(owner = "client!pj", name = "l", descriptor = "I")
    public static int field798 = 0;

    @OriginalMember(owner = "client!pj", name = "m", descriptor = "Leg;")
    public static class37 field799 = class174.method1167("scape main", -114);

    @OriginalMember(owner = "client!pj", name = "p", descriptor = "Leg;")
    public static class37 field802 = class174.method1167("Hidden)2", -16);

    @OriginalMember(owner = "client!pj", name = "j", descriptor = "Leg;")
    public static class37 field796 = class174.method1167("Nehmen", -120);

    @OriginalMember(owner = "client!pj", name = "s", descriptor = "Leg;")
    public static class37 field805 = class174.method1167("(Z", 107);

    @OriginalMember(owner = "client!pj", name = "b", descriptor = "I")
    public static int field788;

    @OriginalMember(owner = "client!pj", name = "c", descriptor = "I")
    public static int field789;

    @OriginalMember(owner = "client!pj", name = "f", descriptor = "I")
    public static int field792;

    @OriginalMember(owner = "client!pj", name = "g", descriptor = "I")
    public static int field793;

    @OriginalMember(owner = "client!pj", name = "i", descriptor = "I")
    public static int field795;

    @OriginalMember(owner = "client!pj", name = "n", descriptor = "I")
    public static int field800;

    @OriginalMember(owner = "client!pj", name = "q", descriptor = "I")
    public static int field803;

    @OriginalMember(owner = "client!pj", name = "r", descriptor = "I")
    public static int field804;

    @OriginalMember(owner = "client!pj", name = "k", descriptor = "J")
    private long field797;

    @OriginalMember(owner = "client!pj", name = "o", descriptor = "Lf;")
    private class291 field801;

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(JLf;I)V")
    public final void method328(long arg0, class291 arg1, int arg2) {
        field804++;
        if (arg1.field5124 != null) {
            arg1.method1953(91923);
        }
        class291 var5 = this.field791[(int) (arg0 & (long) (this.field794 - 1))];
        arg1.field5129 = var5;
        if (arg2 != 1371) {
            field796 = null;
        }
        arg1.field5125 = arg0;
        arg1.field5124 = var5.field5124;
        arg1.field5124.field5129 = arg1;
        arg1.field5129.field5124 = arg1;
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(I)I")
    public static final int method329(int arg0) {
        field788++;
        if ((double) class19.field252 == 3.0D) {
            return 37;
        } else if ((double) class19.field252 == 4.0D) {
            return 50;
        } else {
            if (arg0 != 37) {
                method330(117, -10, 44);
            }
            return (double) class19.field252 == 6.0D ? 75 : 100;
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(III)Z")
    public static final boolean method330(int arg0, int arg1, int arg2) {
        int var3 = class44.field684[arg0][arg1][arg2];
        if (-class214.field3693 == var3) {
            return false;
        } else if (class214.field3693 == var3) {
            return true;
        } else {
            int var4 = arg1 << 7;
            int var5 = arg2 << 7;
            if (class113.method808(var4 + 1, class218.field3754[arg0][arg1][arg2], var5 + 1) && class113.method808(var4 + 128 - 1, class218.field3754[arg0][arg1 + 1][arg2], var5 + 1) && class113.method808(var4 + 128 - 1, class218.field3754[arg0][arg1 + 1][arg2 + 1], var5 + 128 - 1) && class113.method808(var4 + 1, class218.field3754[arg0][arg1][arg2 + 1], var5 + 128 - 1)) {
                class44.field684[arg0][arg1][arg2] = class214.field3693;
                return true;
            } else {
                class44.field684[arg0][arg1][arg2] = -class214.field3693;
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(Leg;II)V")
    public static final void method331(class37 arg0, int arg1, int arg2) {
        if (arg2 != -12562) {
            return;
        }
        class123.field2058++;
        class273.field4778.method1697(96, 100);
        class273.field4778.method1256(arg0.method217((byte) -102), (byte) 84);
        class273.field4778.method1281(arg1, -113);
        field793++;
    }

    @OriginalMember(owner = "client!pj", name = "b", descriptor = "(I)Lf;")
    public final class291 method332(int arg0) {
        field803++;
        if (arg0 >= -100) {
            method331((class37) null, 34, 118);
        }
        if (this.field801 == null) {
            return null;
        }
        class291 var2 = this.field791[(int) ((long) (this.field794 - 1) & this.field797)];
        while (this.field801 != var2) {
            if (this.field801.field5125 == this.field797) {
                class291 var3 = this.field801;
                this.field801 = this.field801.field5129;
                return var3;
            }
            this.field801 = this.field801.field5129;
        }
        this.field801 = null;
        return null;
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(BJ)Lf;")
    public final class291 method333(byte arg0, long arg1) {
        this.field797 = arg1;
        if (arg0 != 32) {
            field798 = -84;
        }
        class291 var4 = this.field791[(int) (arg1 & (long) (this.field794 - 1))];
        this.field801 = var4.field5129;
        field792++;
        while (this.field801 != var4) {
            if (this.field801.field5125 == arg1) {
                class291 var5 = this.field801;
                this.field801 = this.field801.field5129;
                return var5;
            }
            this.field801 = this.field801.field5129;
        }
        this.field801 = null;
        return null;
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(Ljl;ILjl;)I")
    public static final int method334(class101 arg0, int arg1, class101 arg2) {
        field795++;
        int var3 = 0;
        if (arg2.method658(class169.field2824, (byte) 72)) {
            var3++;
        }
        if (arg1 > -2) {
            method329(-56);
        }
        if (arg2.method658(class226.field3876, (byte) 83)) {
            var3++;
        }
        if (arg2.method658(class1.field1, (byte) 58)) {
            var3++;
        }
        if (arg0.method658(class169.field2824, (byte) 81)) {
            var3++;
        }
        if (arg0.method658(class226.field3876, (byte) 83)) {
            var3++;
        }
        if (arg0.method658(class1.field1, (byte) 121)) {
            var3++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!pj", name = "<init>", descriptor = "(I)V")
    public class51(int arg0) {
        this.field794 = arg0;
        this.field791 = new class291[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class291 var3 = this.field791[var2] = new class291();
            var3.field5124 = var3;
            var3.field5129 = var3;
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(Z)V")
    public static void method335(boolean arg0) {
        field799 = null;
        field787 = null;
        field805 = null;
        field802 = null;
        field796 = null;
        if (!arg0) {
            method334((class101) null, -56, (class101) null);
        }
    }
}
