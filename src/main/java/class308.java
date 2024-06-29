import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gd")
public class class308 {

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "I")
    public static int field5283 = 0;

    @OriginalMember(owner = "client!gd", name = "e", descriptor = "[Luh;")
    public static class276[] field5287 = new class276[6];

    @OriginalMember(owner = "client!gd", name = "d", descriptor = "Lwm;")
    public static class152 field5286 = class157.method1048("Chargement de l(W-Bcran)2titre )2 ", 96);

    @OriginalMember(owner = "client!gd", name = "g", descriptor = "[Lg;")
    public static class160[] field5289 = new class160[50];

    @OriginalMember(owner = "client!gd", name = "c", descriptor = "Lne;")
    public static class235 field5285 = new class235(64);

    @OriginalMember(owner = "client!gd", name = "i", descriptor = "I")
    public static int field5291 = 0;

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "I")
    public static int field5284;

    @OriginalMember(owner = "client!gd", name = "f", descriptor = "I")
    public static int field5288;

    @OriginalMember(owner = "client!gd", name = "h", descriptor = "I")
    public static int field5290;

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(B)V", line = 4)
    public static final void method2142(byte arg0) {
        if (class169.field2638 != null) {
            class28.method229(-128, class169.field2638);
            class169.field2638 = null;
        }
        field5284++;
        if (arg0 <= 33) {
            method2144((Component) null, 98);
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(I)V", line = 23)
    public static void method2143(int arg0) {
        if (arg0 != 6) {
            field5283 = -85;
        }
        field5286 = null;
        field5285 = null;
        field5289 = null;
        field5287 = null;
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(Ljava/awt/Component;I)V", line = 51)
    public static final void method2144(Component arg0, int arg1) {
        if (arg1 != 12988) {
            return;
        }
        field5290++;
        arg0.removeMouseListener(class91.field1268);
        arg0.removeMouseMotionListener(class91.field1268);
        arg0.removeFocusListener(class91.field1268);
        class85.field1198 = 0;
    }

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "(I)V", line = 86)
    public static final void method2145(int arg0) {
        field5288++;
        int[] var1 = new int[class176.field2841];
        int var2 = arg0;
        for (int var3 = 0; var3 < class176.field2841; var3++) {
            class312 var4 = class189.method1253((byte) 70, var3);
            if (var4.field5344 >= 0 || var4.field5398 >= 0) {
                var1[var2++] = var3;
            }
        }
        class283.field4821 = new int[var2];
        for (int var5 = 0; var5 < var2; var5++) {
            class283.field4821[var5] = var1[var5];
        }
    }
}
