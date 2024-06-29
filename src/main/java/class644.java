import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gl")
public class class644 {

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "Ljava/util/Hashtable;")
    public static Hashtable field9022 = new Hashtable();

    @OriginalMember(owner = "client!gl", name = "b", descriptor = "I")
    public static int field9023;

    @OriginalMember(owner = "client!gl", name = "c", descriptor = "I")
    public static int field9024;

    @OriginalMember(owner = "client!gl", name = "d", descriptor = "I")
    public static int field9025;

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(I)V")
    public static void method3689(int arg0) {
        int var1 = -21 % ((arg0 - 25) / 62);
        field9022 = null;
    }

    @OriginalMember(owner = "client!gl", name = "b", descriptor = "(I)V")
    public static final void method3690(int arg0) {
        field9024++;
        class373.method2319(-1, 255, 14351);
        if (arg0 <= 90) {
            field9022 = null;
        }
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(Z)I")
    public static final int method3691(boolean arg0) {
        field9025++;
        if (arg0) {
            method3691(true);
        }
        return class166.field2118 == 1 ? class327.field4604 : class68.field754;
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(ILqf;Z)V")
    public static final void method3692(int arg0, class783 arg1, boolean arg2) {
        field9023++;
        if (class546.field7591) {
            arg0 = 0;
            class546.field7591 = false;
        }
        if (!arg2) {
            field9022 = null;
        }
        if (class223.field3172 != null && class223.field3172.method4303(84, arg1)) {
            return;
        }
        class223.field3172 = arg1;
        class475.field6593 = class683.method3903((byte) 4);
        class122.field1614 = arg0;
        class77.field863 = arg0;
        if (class77.field863 == 0) {
            class2.method8(-16711936);
            return;
        }
        class304.field4415 = class181.field2289;
        class695.field9698 = class742.field10229;
        class104.field1197 = class554.field7677;
        class540.field7469 = class172.field2186;
        class294.field4310 = class311.field4472;
        class462.field6463 = class254.field3763;
        class165.field2110 = class531.field7310;
        class497.field6822 = class56.field664;
        class434.field6021 = class268.field3886;
        class735.field10131 = class339.field4916;
    }
}
