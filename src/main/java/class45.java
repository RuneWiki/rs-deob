import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ef")
public class class45 extends class200 {

    @OriginalMember(owner = "client!ef", name = "l", descriptor = "Lqe;")
    public static class168 field585 = class66.method448("Versteckt", 98);

    @OriginalMember(owner = "client!ef", name = "k", descriptor = "I")
    public static int field584;

    @OriginalMember(owner = "client!ef", name = "o", descriptor = "I")
    public static int field588;

    @OriginalMember(owner = "client!ef", name = "p", descriptor = "I")
    public static int field589;

    @OriginalMember(owner = "client!ef", name = "n", descriptor = "Lgf;")
    public static class173 field587;

    @OriginalMember(owner = "client!ef", name = "j", descriptor = "Z")
    public static boolean field583;

    @OriginalMember(owner = "client!ef", name = "m", descriptor = "[Lgd;")
    public static class65[] field586;

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(II)Lqe;")
    public static final class168 method296(int arg0, int arg1) {
        field589++;
        if (arg1 < arg0) {
            return class50.method347(arg0 ^ 0x186A2, new class168[] { class55.field765, class128.method867((byte) 102, arg1), class95.field1491 });
        } else if (arg1 < 10000000) {
            return class50.method347(2, new class168[] { class172.field2990, class128.method867((byte) 89, arg1 / 1000), class93.field1475, class95.field1491 });
        } else {
            return class50.method347(arg0 - 99998, new class168[] { class133.field2329, class128.method867((byte) 119, arg1 / 1000000), class116.field1900, class95.field1491 });
        }
    }

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "(I)V")
    public static void method297(int arg0) {
        if (arg0 != 127) {
            field583 = true;
        }
        field587 = null;
        field586 = null;
        field585 = null;
    }

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "(II)I")
    public static int method298(int arg0, int arg1) {
        return arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!ef", name = "c", descriptor = "(I)Z")
    public static final boolean method299(int arg0) {
        field584++;
        if (arg0 != 19061) {
            field583 = true;
        }
        class234 var1 = class165.field2816;
        synchronized (class165.field2816) {
            if (class6.field73 == class221.field3798) {
                return false;
            } else {
                class124.field2046 = class112.field1814[class221.field3798];
                class78.field1182 = class253.field4380[class221.field3798];
                class221.field3798 = class221.field3798 + 1 & 0x7F;
                return true;
            }
        }
    }
}
