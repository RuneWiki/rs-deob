import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ie")
public class class6 implements class233 {

    @OriginalMember(owner = "client!ie", name = "c", descriptor = "I")
    public int field57;

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "[I")
    public static int[] field56 = new int[4];

    @OriginalMember(owner = "client!ie", name = "g", descriptor = "Lkg;")
    public static class275 field61 = new class275(94, -2);

    @OriginalMember(owner = "client!ie", name = "h", descriptor = "Lkg;")
    public static class275 field62 = new class275(17, -1);

    @OriginalMember(owner = "client!ie", name = "i", descriptor = "Lkg;")
    public static class275 field63 = new class275(32, 10);

    @OriginalMember(owner = "client!ie", name = "j", descriptor = "[I")
    public static int[] field64 = new int[500];

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "I")
    public static int field55;

    @OriginalMember(owner = "client!ie", name = "d", descriptor = "I")
    public static int field58;

    @OriginalMember(owner = "client!ie", name = "e", descriptor = "I")
    public static int field59;

    @OriginalMember(owner = "client!ie", name = "f", descriptor = "I")
    public static int field60;

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(I)Lhm;", line = 6)
    public final class223 method29(int arg0) {
        if (arg0 != -200) {
            field61 = null;
        }
        field58++;
        return class160.field2194;
    }

    @OriginalMember(owner = "client!ie", name = "<init>", descriptor = "(I)V", line = 18)
    public class6(int arg0) {
        this.field57 = arg0;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(II)V", line = 32)
    public static final void method30(int arg0, int arg1) {
        class534 var2 = class26.field470;
        synchronized (class26.field470) {
            if (arg1 != -20020) {
                field61 = null;
            }
            class26.field470.method3070(arg0, 123);
        }
        field59++;
    }

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "(I)V", line = 46)
    public static void method31(int arg0) {
        field63 = null;
        if (arg0 == 100) {
            field61 = null;
            field62 = null;
            field56 = null;
            field64 = null;
        }
    }

    @OriginalMember(owner = "client!ie", name = "c", descriptor = "(I)V", line = 60)
    public static final void method32(int arg0) {
        if (class400.field5095 == null) {
            class400.field5095 = class306.method1845((byte) 32);
            class607.field8439 = class400.field5095[0];
            class250.field3212 = class446.method2525(arg0 ^ 0x1F5);
        }
        field55++;
        if (class14.field273 == null) {
            class97.method780(false);
        }
        class306 var1 = class607.field8439;
        int var2 = class190.method1275((byte) 116);
        if (class607.field8439 == var1) {
            class416.field5307 = class607.field8439.field4007.method2547(-81, class243.field3143);
            if (class607.field8439.field4017) {
                class309.field4073 = (class607.field8439.field4009 - class607.field8439.field4012) * var2 / 100 + class607.field8439.field4012;
            }
            if (class607.field8439.field4013) {
                class416.field5307 = class416.field5307 + class309.field4073 + "%";
            }
        } else if (class607.field8439 == class306.field4037) {
            class14.field273 = null;
            class571.method3275(arg0 ^ 0x6B44, 3);
        } else {
            class416.field5307 = var1.field4014.method2547(-57, class243.field3143);
            class309.field4073 = var1.field4009;
            if (class607.field8439.field4013) {
                class416.field5307 = class416.field5307 + var1.field4009 + "%";
            }
            if (class607.field8439.field4017 || var1.field4017) {
                class250.field3212 = class446.method2525(500);
            }
        }
        if (class14.field273 != null) {
            class14.field273.method1085(class250.field3212, class607.field8439, class309.field4073, class416.field5307, 9577);
            if (class699.field9728 != null) {
                for (int var3 = class623.field8570 + 1; var3 < class699.field9728.length; var3++) {
                    if (class699.field9728[var3].method1939(arg0 + 126) >= 100 && var3 - 1 == class623.field8570 && class27.field484 >= 1 && class14.field273.method1084(true)) {
                        try {
                            class699.field9728[var3].method1938(-128);
                        } catch (Exception var4) {
                            class699.field9728 = null;
                            break;
                        }
                        class14.field273.method1087(class699.field9728[var3], false);
                        class623.field8570++;
                        if (class623.field8570 >= class699.field9728.length - 1 && class699.field9728.length > 1) {
                            class623.field8570 = class654.field9099.method3191(65) ? 0 : -1;
                        }
                    }
                }
            }
        }
        if (arg0 != 1) {
            method30(75, 31);
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(Lsl;I)Lth;", line = 163)
    public static final class598 method33(class461 arg0, int arg1) {
        field60++;
        class598 var2 = new class598();
        var2.field8341 = arg0.method2566(arg1);
        var2.field8342 = class609.field8450.method227(11041, var2.field8341);
        return var2;
    }
}
