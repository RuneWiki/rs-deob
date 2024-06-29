import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tg")
public abstract class class189 {

    @OriginalMember(owner = "client!tg", name = "d", descriptor = "I")
    public static int field3257 = 0;

    @OriginalMember(owner = "client!tg", name = "e", descriptor = "[Lbb;")
    public static class225[] field3258 = new class225[50];

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "Ljava/lang/Object;")
    public static Object field3254 = new Object();

    @OriginalMember(owner = "client!tg", name = "b", descriptor = "I")
    public static int field3255;

    @OriginalMember(owner = "client!tg", name = "g", descriptor = "I")
    public static int field3260;

    @OriginalMember(owner = "client!tg", name = "h", descriptor = "I")
    public static int field3261;

    @OriginalMember(owner = "client!tg", name = "i", descriptor = "I")
    public static int field3262;

    @OriginalMember(owner = "client!tg", name = "c", descriptor = "Lti;")
    public static class128 field3256;

    @OriginalMember(owner = "client!tg", name = "f", descriptor = "[Lia;")
    public static class257[] field3259;

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "()V")
    public static final void method1271() {
        for (int var0 = 0; var0 < class253.field4356; var0++) {
            class154 var1 = class198.field3388[var0];
            class50.method390(var1);
            class198.field3388[var0] = null;
        }
        class253.field4356 = 0;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(Z)I")
    public abstract int method103(boolean arg0);

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(BLjava/awt/Component;)V")
    public abstract void method104(byte arg0, Component arg1);

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    public abstract void method105(Component arg0, int arg1);

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(III)I")
    public static final int method1272(int arg0, int arg1, int arg2) {
        field3260++;
        int var3 = class15.method156(arg2 + 91923, 4, true, arg1 + 45365) + (-(-(class15.method156(arg2 + 37821, 2, true, arg1 + 10294) - 128 >> 1) - (class15.method156(arg2, 1, true, arg1) - 128 >> 2)) - 128);
        if (arg0 < 30) {
            method1273((class178) null, -10);
        }
        int var4 = (int) ((double) var3 * 0.3D) + 35;
        if (var4 < 10) {
            var4 = 10;
        } else if (var4 > 60) {
            var4 = 60;
        }
        return var4;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(Lmb;I)V")
    public static final void method1273(class178 arg0, int arg1) {
        class238.field4070 = arg0;
        if (arg1 >= 47) {
            class251.field4319 = class238.field4070.method1220((byte) -63, 16);
            field3255++;
        }
    }

    @OriginalMember(owner = "client!tg", name = "b", descriptor = "(Z)V")
    public static final void method1274(boolean arg0) {
        class162.field2841++;
        field3262++;
        class205.field3524.method908(arg0, 85);
        for (class157 var1 = (class157) class136.field2426.method427((byte) 58); var1 != null; var1 = (class157) class136.field2426.method428(false)) {
            if (var1.field2744 == 0) {
                class201.method1350(true, 2097151, var1);
            }
        }
        if (class73.field1421 != null) {
            class257.method1718(false, class73.field1421);
            class73.field1421 = null;
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(I)V")
    public static void method1275(int arg0) {
        if (arg0 <= 92) {
            field3257 = -104;
        }
        field3256 = null;
        field3258 = null;
        field3254 = null;
        field3259 = null;
    }
}
