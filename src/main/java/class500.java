import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ac")
public class class500 extends class665 {

    @OriginalMember(owner = "client!ac", name = "n", descriptor = "Ljava/lang/String;")
    public String field7083;

    @OriginalMember(owner = "client!ac", name = "m", descriptor = "I")
    public static int field7082 = 0;

    @OriginalMember(owner = "client!ac", name = "q", descriptor = "I")
    public static int field7086 = 0;

    @OriginalMember(owner = "client!ac", name = "k", descriptor = "Lrw;")
    public static class703 field7080 = new class703(6, 1);

    @OriginalMember(owner = "client!ac", name = "l", descriptor = "I")
    public static int field7081;

    @OriginalMember(owner = "client!ac", name = "o", descriptor = "I")
    public static int field7084;

    @OriginalMember(owner = "client!ac", name = "p", descriptor = "I")
    public static int field7085;

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(B)[Lrca;")
    public static final class418[] method2890(byte arg0) {
        field7085++;
        int var1 = -84 % ((-arg0 - 22) / 40);
        return new class418[] { class401.field5904, class134.field1976, class103.field1617 };
    }

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "(B)V")
    public static void method2891(byte arg0) {
        int var1 = -24 % ((-arg0 - 87) / 33);
        field7080 = null;
    }

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "(Z)V")
    public static final void method2892(boolean arg0) {
        class182.method1230(-58, class287.field4270.field3716, 22050, 2);
        field7084++;
        class520.field7333 = new class34();
        if (arg0) {
            field7086 = 121;
        }
        class520.field7333.method404(9, 128, 128);
        class574.field8072 = class50.method573(0, 0, class31.field486, 22050, class368.field5267);
        class574.field8072.method2014(-88, class520.field7333);
        class462.method2725((byte) -106, class102.field1606, class424.field6162, class199.field2813, class520.field7333);
        class697.field9858 = class50.method573(0, 1, class31.field486, 2048, class368.field5267);
        class627.field8780 = new class335();
        class697.field9858.method2014(57, class627.field8780);
        class37.field630 = new class578(22050, class465.field6683);
        class150.field2178 = class652.field9171.method2980(-9104, "scape main");
    }

    @OriginalMember(owner = "client!ac", name = "<init>", descriptor = "()V")
    public class500() {
    }

    @OriginalMember(owner = "client!ac", name = "<init>", descriptor = "(Ljava/lang/String;)V")
    public class500(String arg0) {
        this.field7083 = arg0;
    }
}
