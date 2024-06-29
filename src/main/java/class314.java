import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jg")
public class class314 {

    @OriginalMember(owner = "client!jg", name = "i", descriptor = "Z")
    public boolean field4318;

    @OriginalMember(owner = "client!jg", name = "g", descriptor = "I")
    public static int field4316 = 0;

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "Lqw;")
    public static class71 field4310 = new class71(11, 14);

    @OriginalMember(owner = "client!jg", name = "d", descriptor = "I")
    public static int field4313;

    @OriginalMember(owner = "client!jg", name = "f", descriptor = "I")
    public static int field4315;

    @OriginalMember(owner = "client!jg", name = "h", descriptor = "I")
    public static int field4317;

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "Lft;")
    public class4 field4311;

    @OriginalMember(owner = "client!jg", name = "c", descriptor = "Lft;")
    public class4 field4312;

    @OriginalMember(owner = "client!jg", name = "e", descriptor = "Z")
    public boolean field4314;

    @OriginalMember(owner = "client!jg", name = "j", descriptor = "Z")
    public static boolean field4319;

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(B)Z", line = 10)
    public final boolean method1871(byte arg0) {
        int var2 = -37 % ((34 - arg0) / 36);
        field4313++;
        return this.field4314 && !this.field4318;
    }

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "(B)V", line = 21)
    public final void method1872(byte arg0) {
        field4317++;
        if (arg0 < 50) {
            this.field4318 = true;
        }
        if (this.field4311 != null) {
            this.field4311.method24((byte) -93);
        }
        this.field4314 = false;
    }

    @OriginalMember(owner = "client!jg", name = "c", descriptor = "(B)V", line = 36)
    public static void method1873(byte arg0) {
        if (arg0 >= -101) {
            method1873((byte) 42);
        }
        field4310 = null;
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(Z)V", line = 49)
    public static final void method1874(boolean arg0) {
        field4315++;
        for (int var1 = 0; var1 < class477.field6362.length; var1++) {
            for (int var2 = 0; var2 < class477.field6362[0].length; var2++) {
                for (int var3 = 0; var3 < class477.field6362[0][0].length; var3++) {
                    class477.field6362[var1][var2][var3] = 0;
                }
            }
        }
        if (!arg0) {
            method1874(false);
        }
    }

    @OriginalMember(owner = "client!jg", name = "<init>", descriptor = "(Z)V", line = 85)
    public class314(boolean arg0) {
        this.field4318 = arg0;
    }
}
