import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kf")
public class class267 extends class101 {

    @OriginalMember(owner = "client!kf", name = "q", descriptor = "[I")
    public static int[] field3936 = new int[32];

    @OriginalMember(owner = "client!kf", name = "o", descriptor = "[I")
    public static int[] field3934 = new int[500];

    @OriginalMember(owner = "client!kf", name = "n", descriptor = "I")
    public int field3933;

    @OriginalMember(owner = "client!kf", name = "p", descriptor = "I")
    public static int field3935;

    @OriginalMember(owner = "client!kf", name = "u", descriptor = "I")
    public int field3940;

    @OriginalMember(owner = "client!kf", name = "v", descriptor = "I")
    public static int field3941;

    @OriginalMember(owner = "client!kf", name = "w", descriptor = "I")
    public static int field3942;

    @OriginalMember(owner = "client!kf", name = "t", descriptor = "Lvr;")
    public static class147 field3939;

    @OriginalMember(owner = "client!kf", name = "s", descriptor = "Lgaa;")
    public class315 field3938;

    @OriginalMember(owner = "client!kf", name = "r", descriptor = "Lmga;")
    public class739 field3937;

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(B)V", line = 10)
    public final void method1743(byte arg0) {
        field3935++;
        if (arg0 <= 54) {
            method1746(103);
        }
        if (class700.field9831 < class350.field5139.length) {
            class350.field5139[class700.field9831++] = this;
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(IIII)Z", line = 31)
    public static final boolean method1744(int arg0, int arg1, int arg2, int arg3) {
        field3942++;
        if (!class522.field7164 || !class791.field10882) {
            return false;
        } else if (class592.field7964 < 100) {
            return false;
        } else {
            int var4 = class719.field10030[arg2][arg0][arg1];
            if (-class423.field6044 == var4) {
                return false;
            } else if (class423.field6044 == var4) {
                return true;
            } else if (arg3 != 19322) {
                return true;
            } else if (class538.field7317 == class528.field7227) {
                return false;
            } else {
                int var5 = arg0 << class26.field388;
                int var6 = arg1 << class26.field388;
                if (class462.method2736(class528.field7227[arg2].method1880(arg0, false, arg1), var5 + 1, class528.field7227[arg2].method1880(arg0, false, arg1 + 1), class48.field722 + var5 - 1, var5 + 1, var6 + 1, 1, class528.field7227[arg2].method1880(arg0 + 1, false, arg1 + 1), class48.field722 + var6 - 1, var6 - 1 + class48.field722) && class462.method2736(class528.field7227[arg2].method1880(arg0, false, arg1), class48.field722 + var5 - 1, class528.field7227[arg2].method1880(arg0 + 1, false, arg1 - -1), var5 - (1 - class48.field722), var5 + 1, var6 + 1, 1, class528.field7227[arg2].method1880(arg0 + 1, false, arg1), var6 + 1, class48.field722 + var6 - 1)) {
                    class20.field296++;
                    class719.field10030[arg2][arg0][arg1] = class423.field6044;
                    return true;
                } else {
                    class719.field10030[arg2][arg0][arg1] = -class423.field6044;
                    return false;
                }
            }
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "([Lvr;I)V", line = 80)
    public static final void method1745(class147[] arg0, int arg1) {
        field3941++;
        class24.field382 = arg0.length;
        class688.field9677 = new class147[class24.field382 + 10];
        class630.field8819 = new int[class24.field382 + 10];
        class278.method1799(arg0, 0, class688.field9677, 0, class24.field382);
        if (arg1 != 1) {
            field3934 = null;
        }
        for (int var2 = 0; var2 < class24.field382; var2++) {
            class630.field8819[var2] = class688.field9677[var2].method1106();
        }
        for (int var3 = class24.field382; var3 < class688.field9677.length; var3++) {
            class630.field8819[var3] = 12;
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(I)V", line = 111)
    public static void method1746(int arg0) {
        field3934 = null;
        field3936 = null;
        field3939 = null;
        if (arg0 != 1) {
            method1744(-111, 101, -26, -114);
        }
    }
}
