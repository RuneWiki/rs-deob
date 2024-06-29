import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pi")
public class class261 {

    @OriginalMember(owner = "client!pi", name = "h", descriptor = "I")
    public static int field4613 = 0;

    @OriginalMember(owner = "client!pi", name = "e", descriptor = "Z")
    public static boolean field4610 = true;

    @OriginalMember(owner = "client!pi", name = "d", descriptor = "Lsg;")
    public static class30 field4609 = class167.method1221((byte) 33, "Lade Konfiguration )2 ");

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "Llk;")
    public static class232 field4606 = new class232(20);

    @OriginalMember(owner = "client!pi", name = "j", descriptor = "Lsg;")
    public static class30 field4615 = class167.method1221((byte) 33, "<br>(X100(U(Y");

    @OriginalMember(owner = "client!pi", name = "l", descriptor = "Lsg;")
    public static class30 field4617 = class167.method1221((byte) 33, "k");

    @OriginalMember(owner = "client!pi", name = "k", descriptor = "Lsg;")
    public static class30 field4616 = class167.method1221((byte) 33, ":duelstake:");

    @OriginalMember(owner = "client!pi", name = "b", descriptor = "I")
    public static int field4607;

    @OriginalMember(owner = "client!pi", name = "c", descriptor = "I")
    public static int field4608;

    @OriginalMember(owner = "client!pi", name = "f", descriptor = "I")
    public static int field4611;

    @OriginalMember(owner = "client!pi", name = "g", descriptor = "I")
    public static int field4612;

    @OriginalMember(owner = "client!pi", name = "i", descriptor = "Ljava/awt/Frame;")
    public static Frame field4614;

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(I)I")
    public static final int method1803(int arg0) {
        field4608++;
        int var1 = -18 % ((arg0 - 70) / 44);
        return 2;
    }

    @OriginalMember(owner = "client!pi", name = "b", descriptor = "(I)Lsg;")
    public static final class30 method1804(int arg0) {
        class30 var1 = class176.field3272;
        if (class148.field2832 != 0) {
            var1 = class253.field4467;
        }
        field4607++;
        class30 var2 = class55.field1203;
        int var3 = -122 / ((76 - arg0) / 36);
        if (class219.field3963 != null) {
            var2 = class160.method1188(new class30[] { client.field3782, class219.field3963 }, 0);
        }
        return class160.method1188(new class30[] { class64.field1418, var1, class259.field4582, class73.method675(117, class220.field3971), class112.field2226, class73.method675(-40, class197.field3563), var2, class33.field834 }, 0);
    }

    @OriginalMember(owner = "client!pi", name = "c", descriptor = "(I)V")
    public static final void method1805(int arg0) {
        field4612++;
        if (class107.field2152 > 0) {
            class41.method428(31531);
        } else {
            class106.field2130 = class175.field3261;
            class175.field3261 = null;
            class253.method1764((byte) -85, arg0);
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(II)I")
    public static final int method1806(int arg0, int arg1) {
        field4611++;
        if (class175.field3261 != null) {
            class175.field3261.method1516(-94);
            class175.field3261 = null;
        }
        int var2 = 53 / ((arg1 + 36) / 33);
        class114.field2266++;
        if (class114.field2266 > 4) {
            class114.field2266 = 0;
            class120.field2353 = 0;
            return arg0;
        }
        class120.field2353 = 0;
        if (class90.field1823 == class54.field1196) {
            class54.field1196 = class146.field2791;
        } else {
            class54.field1196 = class90.field1823;
        }
        return -1;
    }

    @OriginalMember(owner = "client!pi", name = "d", descriptor = "(I)V")
    public static void method1807(int arg0) {
        field4615 = null;
        field4606 = null;
        field4609 = null;
        field4614 = null;
        field4617 = null;
        if (arg0 != 1) {
            field4614 = null;
        }
        field4616 = null;
    }
}
