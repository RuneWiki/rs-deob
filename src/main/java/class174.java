import java.awt.Component;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uf")
public class class174 {

    @OriginalMember(owner = "client!uf", name = "e", descriptor = "Lgd;")
    public static class74 field3069 = new class74(16);

    @OriginalMember(owner = "client!uf", name = "h", descriptor = "I")
    public static int field3072 = 0;

    @OriginalMember(owner = "client!uf", name = "j", descriptor = "I")
    public static int field3074 = 0;

    @OriginalMember(owner = "client!uf", name = "l", descriptor = "Loa;")
    public static class99 field3076 = class221.method1463(2844, "<col=00ff80>");

    @OriginalMember(owner = "client!uf", name = "k", descriptor = "Loa;")
    public static class99 field3075 = class221.method1463(2844, "::replacecanvas");

    @OriginalMember(owner = "client!uf", name = "m", descriptor = "Loa;")
    public static class99 field3077 = class221.method1463(2844, "K");

    @OriginalMember(owner = "client!uf", name = "g", descriptor = "[I")
    public static int[] field3071 = new int[2];

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "I")
    public static int field3065;

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "I")
    public static int field3066;

    @OriginalMember(owner = "client!uf", name = "c", descriptor = "I")
    public static int field3067;

    @OriginalMember(owner = "client!uf", name = "d", descriptor = "I")
    public static int field3068;

    @OriginalMember(owner = "client!uf", name = "f", descriptor = "I")
    public static int field3070;

    @OriginalMember(owner = "client!uf", name = "i", descriptor = "[Loa;")
    public static class99[] field3073;

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(ZZ)V")
    public static final void method1165(boolean arg0, boolean arg1) {
        field3067++;
        if (arg1 == class9.field77) {
            return;
        }
        class9.field77 = arg1;
        class281.method1856(126);
        if (!arg0) {
            field3071 = null;
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(IZI)Loa;")
    public static final class99 method1166(int arg0, boolean arg1, int arg2) {
        field3070++;
        if (arg1) {
            return null;
        }
        int var3 = arg0 - arg2;
        if (var3 < -9) {
            return class129.field2255;
        } else if (var3 < -6) {
            return class278.field4883;
        } else if (var3 < -3) {
            return class291.field5127;
        } else if (var3 < 0) {
            return class56.field928;
        } else if (var3 > 9) {
            return class12.field106;
        } else if (var3 > 6) {
            return class138.field2428;
        } else if (var3 > 3) {
            return class272.field4802;
        } else if (var3 > 0) {
            return class207.field3580;
        } else {
            return class145.field2547;
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(I)V")
    public static final void method1167(int arg0) {
        class58.field981 = arg0;
        for (int var1 = 0; var1 < class253.field4372; var1++) {
            for (int var2 = 0; var2 < class172.field3051; var2++) {
                if (class128.field2236[arg0][var1][var2] == null) {
                    class128.field2236[arg0][var1][var2] = new class216(arg0, var1, var2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "([BB)Z")
    public static final boolean method1168(byte[] arg0, byte arg1) {
        field3065++;
        class261 var2 = new class261(arg0);
        int var3 = var2.method1693((byte) 78);
        if (var3 != 1) {
            return false;
        }
        int var4 = -56 / ((-arg1 - 75) / 41);
        boolean var5 = var2.method1693((byte) 22) == 1;
        if (var5) {
            class193.method1308(var2, 116);
        }
        class13.method85(var2, false);
        return true;
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    public static final void method1169(Component arg0, int arg1) {
        field3066++;
        Method var2 = class87.field1514;
        if (var2 != null) {
            try {
                var2.invoke(arg0, Boolean.FALSE);
            } catch (Throwable var3) {
            }
        }
        arg0.addKeyListener(class252.field4358);
        if (arg1 != 4188) {
            field3072 = -70;
        }
        arg0.addFocusListener(class252.field4358);
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(Z)V")
    public static void method1170(boolean arg0) {
        field3077 = null;
        field3075 = null;
        field3076 = null;
        field3069 = null;
        field3073 = null;
        if (!arg0) {
            field3071 = null;
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(B)Z")
    public static final boolean method1171(byte arg0) {
        if (arg0 > -110) {
            method1171((byte) 94);
        }
        field3068++;
        class290 var1 = class252.field4358;
        synchronized (class252.field4358) {
            if (class20.field227 == class149.field2629) {
                return false;
            } else {
                class47.field792 = class248.field4289[class149.field2629];
                class110.field1971 = class240.field4156[class149.field2629];
                class149.field2629 = class149.field2629 + 1 & 0x7F;
                return true;
            }
        }
    }
}
