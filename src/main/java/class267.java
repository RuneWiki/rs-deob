import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!e")
public class class267 extends class35 {

    @OriginalMember(owner = "client!e", name = "p", descriptor = "I")
    public int field3963;

    @OriginalMember(owner = "client!e", name = "n", descriptor = "I")
    public int field3961;

    @OriginalMember(owner = "client!e", name = "l", descriptor = "I")
    public static int field3959 = 0;

    @OriginalMember(owner = "client!e", name = "o", descriptor = "I")
    public static int field3962;

    @OriginalMember(owner = "client!e", name = "m", descriptor = "Lis;")
    public static class1 field3960;

    @OriginalMember(owner = "client!e", name = "d", descriptor = "(I)V")
    public static void method1744(int arg0) {
        field3960 = null;
        if (arg0 != 30) {
            field3960 = null;
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(II)V")
    public static final void method1745(int arg0, int arg1) {
        if (arg1 >= -12) {
            return;
        }
        field3962++;
        class263.method1734((byte) -110);
        class3.method21(-124);
        class144.method983(true, arg0, -106);
        class85.method690(class138.field1976, class388.field5716, true, class425.field6075);
        class129.method900(class425.field6075, class138.field1976, 0);
        class14.method135(class186.field2816, -120);
        class262.method1723(-1);
        class456.method2706((byte) 114);
        if (class316.field4752 == 10) {
            class197.method1345(-48, false);
        } else if (class316.field4752 == 30) {
            class144.method987((byte) 29, 25);
        } else if (class316.field4752 == 5) {
            class338.method2069(class425.field6075, class138.field1976, 31784);
        }
    }

    @OriginalMember(owner = "client!e", name = "<init>", descriptor = "(II)V")
    public class267(int arg0, int arg1) {
        this.field3963 = arg0;
        this.field3961 = arg1;
    }
}
