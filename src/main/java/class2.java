import java.awt.Component;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!aa")
public class class2 {

    @OriginalMember(owner = "mapview!aa", name = "c", descriptor = "Lea;")
    public static class10 field10 = class3.method8("Saw Mill", 122);

    @OriginalMember(owner = "mapview!aa", name = "a", descriptor = "Lea;")
    public static class10 field8 = class3.method8("Food Shop", -85);

    @OriginalMember(owner = "mapview!aa", name = "d", descriptor = "Lea;")
    public static class10 field11 = class3.method8("Herbalist", -9);

    @OriginalMember(owner = "mapview!aa", name = "b", descriptor = "I")
    public static int field9 = 0;

    @OriginalMember(owner = "mapview!aa", name = "e", descriptor = "Lea;")
    public static class10 field12 = class3.method8("download", -75);

    @OriginalMember(owner = "mapview!aa", name = "f", descriptor = "Lea;")
    public static class10 field13 = class3.method8("Hair Dressers", -42);

    @OriginalMember(owner = "mapview!aa", name = "a", descriptor = "(BLjava/awt/Component;)V", line = 12)
    public static final void method5(byte arg0, Component arg1) {
        Method var2 = class12.field109;
        if (arg0 != 37) {
            return;
        }
        if (var2 != null) {
            try {
                var2.invoke(arg1, Boolean.FALSE);
            } catch (Throwable var4) {
            }
        }
        arg1.addKeyListener(class8.field61);
        arg1.addFocusListener(class8.field61);
    }

    @OriginalMember(owner = "mapview!aa", name = "a", descriptor = "(Z)I", line = 43)
    public static final int method6(boolean arg0) {
        if (arg0) {
            return class7.field60 == null ? 0 : class7.field60[class22.field238];
        } else {
            return -78;
        }
    }

    @OriginalMember(owner = "mapview!aa", name = "a", descriptor = "(B)V", line = 57)
    public static void method7(byte arg0) {
        field11 = null;
        field10 = null;
        field13 = null;
        field8 = null;
        field12 = null;
        if (arg0 < 54) {
            field11 = null;
        }
    }
}
