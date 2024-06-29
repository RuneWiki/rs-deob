import java.awt.Component;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pi")
public class class296 {

    @OriginalMember(owner = "client!pi", name = "e", descriptor = "F")
    public static float field4731 = 0.0F;

    @OriginalMember(owner = "client!pi", name = "g", descriptor = "I")
    public static int field4733 = 0;

    @OriginalMember(owner = "client!pi", name = "c", descriptor = "C")
    public static char field4729;

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "I")
    public static int field4727;

    @OriginalMember(owner = "client!pi", name = "b", descriptor = "I")
    public static int field4728;

    @OriginalMember(owner = "client!pi", name = "d", descriptor = "I")
    public static int field4730;

    @OriginalMember(owner = "client!pi", name = "f", descriptor = "I")
    public static int field4732;

    @OriginalMember(owner = "client!pi", name = "h", descriptor = "I")
    public static int field4734;

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(III)I")
    public static final int method1994(int arg0, int arg1, int arg2) {
        class182 var3 = (class182) class38.field464.method1064(arg1, (long) arg0);
        field4730++;
        if (var3 == null) {
            return 0;
        } else if (arg2 == -1) {
            return 0;
        } else {
            int var4 = 0;
            for (int var5 = 0; var5 < var3.field2866.length; var5++) {
                if (var3.field2864[var5] == arg2) {
                    var4 += var3.field2866[var5];
                }
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(BLjava/awt/Component;)V")
    public static final void method1995(byte arg0, Component arg1) {
        field4727++;
        if (arg0 != -66) {
            return;
        }
        Method var2 = class239.field3849;
        if (var2 != null) {
            try {
                var2.invoke(arg1, Boolean.FALSE);
            } catch (Throwable var3) {
            }
        }
        arg1.addKeyListener(class205.field3214);
        arg1.addFocusListener(class205.field3214);
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(B)V")
    public static final void method1996(byte arg0) {
        field4728++;
        int var1 = 0;
        for (int var2 = 0; var2 < 104; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                if (class29.method148(var1, class184.field2892, 9568256, var2, true, var3)) {
                    var1++;
                }
                if (var1 >= 512) {
                    return;
                }
            }
        }
        if (arg0 < 105) {
            method1995((byte) 7, (Component) null);
        }
    }
}
