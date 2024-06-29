import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!me")
public class class229 extends class86 {

    @OriginalMember(owner = "client!me", name = "q", descriptor = "I")
    public int field3580;

    @OriginalMember(owner = "client!me", name = "r", descriptor = "Lek;")
    public static class166 field3581 = class133.method932((byte) -83);

    @OriginalMember(owner = "client!me", name = "t", descriptor = "Ljava/lang/String;")
    public static String field3583 = "Loading world list data";

    @OriginalMember(owner = "client!me", name = "o", descriptor = "I")
    public static int field3578;

    @OriginalMember(owner = "client!me", name = "p", descriptor = "I")
    public static int field3579;

    @OriginalMember(owner = "client!me", name = "s", descriptor = "I")
    public static int field3582;

    @OriginalMember(owner = "client!me", name = "u", descriptor = "I")
    public static int field3584;

    @OriginalMember(owner = "client!me", name = "v", descriptor = "I")
    public static int field3585;

    @OriginalMember(owner = "client!me", name = "b", descriptor = "(Z)V")
    public static final void method1517(boolean arg0) {
        class64.field1025 = arg0;
        class79.field1329 = 0;
        class220.field3450 = 0;
        class71.field1126 = 0;
        class292.field4607.field588 = 0;
        field3582++;
        class265.field4222 = -1;
        class86.field1415 = -1;
        class146.field2259 = -1;
        class32.field524 = -1;
        class108.field1725 = 0;
        class119.field1837 = 0;
        class239.field3692.field588 = 0;
        class177.field2656 = 0;
        for (int var1 = 0; var1 < class41.field675.length; var1++) {
            if (class41.field675[var1] != null) {
                class41.field675[var1].field4140 = -1;
            }
        }
        for (int var2 = 0; var2 < class72.field1144.length; var2++) {
            if (class72.field1144[var2] != null) {
                class72.field1144[var2].field4140 = -1;
            }
        }
        class212.method1419(511);
        class6.field111 = 1;
        class77.method609(10, 30);
        for (int var3 = 0; var3 < 100; var3++) {
            class37.field632[var3] = true;
        }
        class293.method1967(161);
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(Lag;ZI)Ljava/lang/String;")
    public static final String method1518(class188 arg0, boolean arg1, int arg2) {
        field3578++;
        if (!client.method1063(arg0).method1468(arg2, -31322) && arg0.field2832 == null) {
            return null;
        } else if (arg0.field3001 == null || arg2 >= arg0.field3001.length || arg0.field3001[arg2] == null || arg0.field3001[arg2].trim().length() == 0) {
            return class102.field1626 ? "Hidden-" + arg2 : null;
        } else {
            if (!arg1) {
                field3584 = 11;
            }
            return arg0.field3001[arg2];
        }
    }

    @OriginalMember(owner = "client!me", name = "c", descriptor = "(I)V")
    public static void method1519(int arg0) {
        field3581 = null;
        if (arg0 == -24068) {
            field3583 = null;
        }
    }

    @OriginalMember(owner = "client!me", name = "<init>", descriptor = "()V")
    public class229() {
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(II)V")
    public static final void method1520(int arg0, int arg1) {
        class92.field1465.method1778(arg0, -45);
        field3579++;
        int var2 = -25 / ((21 - arg1) / 60);
    }

    @OriginalMember(owner = "client!me", name = "<init>", descriptor = "(I)V")
    public class229(int arg0) {
        this.field3580 = arg0;
    }
}
