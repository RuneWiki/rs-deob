import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jd")
public class class102 {

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "Li;")
    public static class88 field1846 = class208.method1425(105, "");

    @OriginalMember(owner = "client!jd", name = "e", descriptor = "Li;")
    public static class88 field1850 = class208.method1425(105, "(U4");

    @OriginalMember(owner = "client!jd", name = "i", descriptor = "Li;")
    private static class88 field1854 = class208.method1425(105, "Press (Wrecover a locked account(W on front page)3");

    @OriginalMember(owner = "client!jd", name = "c", descriptor = "Li;")
    public static class88 field1848 = field1854;

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "I")
    public static int field1847;

    @OriginalMember(owner = "client!jd", name = "d", descriptor = "I")
    public static int field1849;

    @OriginalMember(owner = "client!jd", name = "f", descriptor = "I")
    public static int field1851;

    @OriginalMember(owner = "client!jd", name = "g", descriptor = "I")
    public static int field1852;

    @OriginalMember(owner = "client!jd", name = "j", descriptor = "I")
    public static int field1855;

    @OriginalMember(owner = "client!jd", name = "h", descriptor = "[I")
    public static int[] field1853;

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(I)V")
    public static void method708(int arg0) {
        if (arg0 != -5482) {
            field1854 = null;
        }
        field1846 = null;
        field1854 = null;
        field1848 = null;
        field1853 = null;
        field1850 = null;
    }

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "(I)Z")
    public static final boolean method709(int arg0) {
        if (arg0 != 100) {
            field1846 = null;
        }
        field1847++;
        return class122.field2232 == 0 ? class31.field503.method1201(22643) : true;
    }

    @OriginalMember(owner = "client!jd", name = "c", descriptor = "(I)I")
    public static final int method710(int arg0) {
        field1849++;
        if (class150.field2917 == 3.0D) {
            return 37;
        } else if (class150.field2917 == 4.0D) {
            return 50;
        } else {
            if (arg0 != 0) {
                field1846 = null;
            }
            return class150.field2917 == 6.0D ? 75 : 100;
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(BI)[B")
    public static final synchronized byte[] method711(byte arg0, int arg1) {
        field1855++;
        if (arg0 > -88) {
            return null;
        } else if (arg1 == 100 && class17.field265 > 0) {
            byte[] var2 = class220.field4157[--class17.field265];
            class220.field4157[class17.field265] = null;
            return var2;
        } else if (arg1 == 5000 && class142.field2619 > 0) {
            byte[] var3 = class138.field2562[--class142.field2619];
            class138.field2562[class142.field2619] = null;
            return var3;
        } else if (arg1 == 30000 && class157.field3037 > 0) {
            byte[] var4 = class126.field2354[--class157.field3037];
            class126.field2354[class157.field3037] = null;
            return var4;
        } else {
            return new byte[arg1];
        }
    }
}
