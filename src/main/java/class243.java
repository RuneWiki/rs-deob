import java.awt.Component;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mk")
public class class243 {

    @OriginalMember(owner = "client!mk", name = "d", descriptor = "Lsg;")
    private static class30 field4342 = class167.method1221((byte) 33, "Please wait )2 attempting to reestablish)3");

    @OriginalMember(owner = "client!mk", name = "i", descriptor = "Lsg;")
    public static class30 field4347 = class167.method1221((byte) 33, "sch-Utteln:");

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "Lsg;")
    public static class30 field4339 = field4342;

    @OriginalMember(owner = "client!mk", name = "h", descriptor = "Lsg;")
    public static class30 field4346 = class167.method1221((byte) 33, "titlebg");

    @OriginalMember(owner = "client!mk", name = "j", descriptor = "I")
    public static int field4348 = 0;

    @OriginalMember(owner = "client!mk", name = "k", descriptor = "Llk;")
    public static class232 field4349 = new class232(260);

    @OriginalMember(owner = "client!mk", name = "b", descriptor = "I")
    public static int field4340;

    @OriginalMember(owner = "client!mk", name = "e", descriptor = "I")
    public static int field4343;

    @OriginalMember(owner = "client!mk", name = "f", descriptor = "I")
    public static int field4344;

    @OriginalMember(owner = "client!mk", name = "g", descriptor = "I")
    public static int field4345;

    @OriginalMember(owner = "client!mk", name = "l", descriptor = "I")
    public static int field4350;

    @OriginalMember(owner = "client!mk", name = "c", descriptor = "[Lbj;")
    public static class44[] field4341;

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(Ldl;IIII)V")
    public static final void method1715(class31 arg0, int arg1, int arg2, int arg3, int arg4) {
        if (class219.field3957 < 3) {
            ((class152) class268.field4715).method1132(arg4, arg3, arg0.field728, arg0.field670, class268.field4715.field1049 / 2, class268.field4715.field1043 / 2, class110.field2202, 256, arg0.field697, arg0.field760);
        } else {
            class188.method1362(arg4, arg3, 0, arg0.field697, arg0.field760);
        }
        field4344++;
        class210.field3769[arg1] = true;
        if (arg2 != 2) {
            field4343 = -52;
        }
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    public static final void method1716(Component arg0, int arg1) {
        field4345++;
        Method var2 = class66.field1464;
        if (var2 != null) {
            try {
                var2.invoke(arg0, Boolean.FALSE);
            } catch (Throwable var3) {
            }
        }
        arg0.addKeyListener(class81.field1737);
        arg0.addFocusListener(class81.field1737);
        if (arg1 != 256) {
            field4343 = -126;
        }
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(Z)V")
    public static void method1717(boolean arg0) {
        field4339 = null;
        field4342 = null;
        field4346 = null;
        field4347 = null;
        if (!arg0) {
            method1716((Component) null, -29);
        }
        field4349 = null;
        field4341 = null;
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(ZII)V")
    public static final void method1718(boolean arg0, int arg1, int arg2) {
        field4340++;
        class254.field4477[arg2] = arg1;
        class277 var3 = (class277) class176.field3268.method1168(-3, (long) arg2);
        if (!arg0) {
            method1715((class31) null, 75, -50, 71, 78);
        }
        if (var3 == null) {
            class277 var4 = new class277(4611686018427387905L);
            class176.field3268.method1164((byte) 92, (long) arg2, var4);
        } else if (var3.field4824 != 4611686018427387905L) {
            var3.field4824 = class111.method874(30351) + 500L | 0x4000000000000000L;
            return;
        }
    }
}
