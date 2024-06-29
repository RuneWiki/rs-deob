import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jf")
public class class103 implements Runnable {

    @OriginalMember(owner = "client!jf", name = "k", descriptor = "Z")
    public boolean field1916 = true;

    @OriginalMember(owner = "client!jf", name = "l", descriptor = "Ljava/lang/Object;")
    public Object field1917 = new Object();

    @OriginalMember(owner = "client!jf", name = "q", descriptor = "I")
    public int field1922 = 0;

    @OriginalMember(owner = "client!jf", name = "r", descriptor = "[I")
    public int[] field1923 = new int[500];

    @OriginalMember(owner = "client!jf", name = "p", descriptor = "[I")
    public int[] field1921 = new int[500];

    @OriginalMember(owner = "client!jf", name = "c", descriptor = "Lvd;")
    public static class222 field1908 = class212.method1357(" )2> <col=ffff00>", 10731);

    @OriginalMember(owner = "client!jf", name = "f", descriptor = "I")
    public static int field1911 = 0;

    @OriginalMember(owner = "client!jf", name = "e", descriptor = "I")
    public static int field1910 = 0;

    @OriginalMember(owner = "client!jf", name = "j", descriptor = "I")
    public static int field1915 = 0;

    @OriginalMember(owner = "client!jf", name = "i", descriptor = "Lvd;")
    public static class222 field1914 = class212.method1357("", 10731);

    @OriginalMember(owner = "client!jf", name = "g", descriptor = "Lvd;")
    public static class222 field1912 = class212.method1357("Bitte versuchen Sie es erneut)3", 10731);

    @OriginalMember(owner = "client!jf", name = "o", descriptor = "Lvd;")
    public static class222 field1920 = class212.method1357("hint_headicons", 10731);

    @OriginalMember(owner = "client!jf", name = "n", descriptor = "Lvd;")
    public static class222 field1919 = class212.method1357("title_mute", 10731);

    @OriginalMember(owner = "client!jf", name = "h", descriptor = "Lvd;")
    public static class222 field1913 = class212.method1357("mapflag", 10731);

    @OriginalMember(owner = "client!jf", name = "s", descriptor = "Lvd;")
    private static class222 field1924 = class212.method1357("New User", 10731);

    @OriginalMember(owner = "client!jf", name = "d", descriptor = "Lvd;")
    public static class222 field1909 = field1924;

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "I")
    public static int field1906;

    @OriginalMember(owner = "client!jf", name = "m", descriptor = "I")
    public static int field1918;

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "Lme;")
    public static class133 field1907;

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(IBIIIZLab;)V")
    public static final void method637(int arg0, byte arg1, int arg2, int arg3, int arg4, boolean arg5, class3 arg6) {
        class174.field3270 = arg2;
        class108.field1995 = arg5;
        class40.field884 = arg6;
        class59.field1099 = 1;
        if (arg1 > -31) {
            method637(-64, (byte) -100, 18, 124, 94, true, null);
        }
        field1918++;
        class87.field1652 = arg4;
        class174.field3277 = arg0;
        class46.field941 = arg3;
    }

    @OriginalMember(owner = "client!jf", name = "run", descriptor = "()V")
    public final void run() {
        while (this.field1916) {
            Object var1 = this.field1917;
            synchronized (this.field1917) {
                if (this.field1922 < 500) {
                    this.field1921[this.field1922] = class94.field1769;
                    this.field1923[this.field1922] = class137.field2651;
                    this.field1922++;
                }
            }
            class225.method1471(50L, -23364);
        }
        field1906++;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(I)V")
    public static void method638(int arg0) {
        field1913 = null;
        field1912 = null;
        field1920 = null;
        field1914 = null;
        field1919 = null;
        field1924 = null;
        field1908 = null;
        field1907 = null;
        if (arg0 != 16006) {
            method638(94);
        }
        field1909 = null;
    }
}
