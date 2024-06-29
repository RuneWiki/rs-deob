import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ui")
public class class289 {

    @OriginalMember(owner = "client!ui", name = "h", descriptor = "Z")
    public boolean field4690 = true;

    @OriginalMember(owner = "client!ui", name = "e", descriptor = "I")
    public int field4687;

    @OriginalMember(owner = "client!ui", name = "k", descriptor = "I")
    public int field4693;

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "I")
    public int field4683;

    @OriginalMember(owner = "client!ui", name = "c", descriptor = "I")
    public int field4685;

    @OriginalMember(owner = "client!ui", name = "f", descriptor = "I")
    public int field4688;

    @OriginalMember(owner = "client!ui", name = "l", descriptor = "I")
    public int field4694;

    @OriginalMember(owner = "client!ui", name = "i", descriptor = "Lok;")
    public static class41 field4691 = class137.method956("Nehmen", 45);

    @OriginalMember(owner = "client!ui", name = "j", descriptor = "Lak;")
    public static class20 field4692 = new class20(50);

    @OriginalMember(owner = "client!ui", name = "o", descriptor = "I")
    public static int field4697 = 0;

    @OriginalMember(owner = "client!ui", name = "r", descriptor = "Lok;")
    private static class41 field4700 = class137.method956(" is already on your ignore list)3", 45);

    @OriginalMember(owner = "client!ui", name = "q", descriptor = "Lok;")
    public static class41 field4699 = field4700;

    @OriginalMember(owner = "client!ui", name = "s", descriptor = "I")
    public static int field4701 = -1;

    @OriginalMember(owner = "client!ui", name = "p", descriptor = "Lok;")
    private static class41 field4698 = class137.method956("Your ignore list is full)3 Max of 100 users)3", 45);

    @OriginalMember(owner = "client!ui", name = "n", descriptor = "Lok;")
    public static class41 field4696 = field4698;

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "I")
    public static int field4684;

    @OriginalMember(owner = "client!ui", name = "d", descriptor = "I")
    public static int field4686;

    @OriginalMember(owner = "client!ui", name = "g", descriptor = "I")
    public static int field4689;

    @OriginalMember(owner = "client!ui", name = "m", descriptor = "Lwb;")
    public static class82 field4695;

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "([II)[I", line = 22)
    public static final int[] method2014(int[] arg0, int arg1) {
        if (arg1 != 2669) {
            field4697 = -64;
        }
        field4684++;
        if (arg0 == null) {
            return null;
        } else {
            int[] var2 = new int[arg0.length];
            class21.method146(arg0, 0, var2, 0, arg0.length);
            return var2;
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(Lmh;III)[Lka;", line = 41)
    public static final class279[] method2015(class65 arg0, int arg1, int arg2, int arg3) {
        if (arg2 == 21192) {
            field4689++;
            return class10.method40(arg1, true, arg3, arg0) ? class278.method1967(30) : null;
        } else {
            return (class279[]) null;
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(I)V", line = 67)
    public static void method2016(int arg0) {
        field4698 = null;
        field4692 = null;
        field4696 = null;
        field4699 = null;
        if (arg0 >= -95) {
            field4697 = 110;
        }
        field4691 = null;
        field4695 = null;
        field4700 = null;
    }

    @OriginalMember(owner = "client!ui", name = "<init>", descriptor = "(IIIIIIZ)V", line = 111)
    public class289(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        this.field4687 = arg2;
        this.field4693 = arg5;
        this.field4683 = arg4;
        this.field4685 = arg1;
        this.field4688 = arg0;
        this.field4694 = arg3;
        this.field4690 = arg6;
    }
}
