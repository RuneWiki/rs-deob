import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!ha")
public class class14 {

    @OriginalMember(owner = "mapview!ha", name = "b", descriptor = "I")
    public static int field139 = 0;

    @OriginalMember(owner = "mapview!ha", name = "e", descriptor = "Lv;")
    public static class40 field142 = class24.method170("Fishing Shop", (byte) -101);

    @OriginalMember(owner = "mapview!ha", name = "c", descriptor = "I")
    public static volatile int field140 = 0;

    @OriginalMember(owner = "mapview!ha", name = "g", descriptor = "I")
    public static int field144 = 0;

    @OriginalMember(owner = "mapview!ha", name = "h", descriptor = "I")
    public static int field145 = 50;

    @OriginalMember(owner = "mapview!ha", name = "f", descriptor = "I")
    public static int field143 = 0;

    @OriginalMember(owner = "mapview!ha", name = "a", descriptor = "I")
    public static int field138;

    @OriginalMember(owner = "mapview!ha", name = "d", descriptor = "I")
    public static int field141;

    @OriginalMember(owner = "mapview!ha", name = "a", descriptor = "(B)V", line = 9)
    public static void method75(byte arg0) {
        field142 = null;
        int var1 = 48 % ((arg0 + 39) / 55);
    }

    @OriginalMember(owner = "mapview!ha", name = "b", descriptor = "(B)V", line = 29)
    public static final void method76(byte arg0) {
        if (arg0 != -1) {
            field145 = 66;
        }
        class31 var1 = class23.field261;
        synchronized (class23.field261) {
            class18.field197 = class8.field102;
            class24.field367 = class37.field485;
            class12.field120 = class8.field100;
            class20.field217 = field140;
            class34.field452 = class6.field85;
            class20.field219 = class8.field101;
            field140 = 0;
        }
    }

    @OriginalMember(owner = "mapview!ha", name = "a", descriptor = "(Ljava/awt/Component;B)V", line = 59)
    public static final void method77(Component arg0, byte arg1) {
        arg0.removeKeyListener(class1.field8);
        arg0.removeFocusListener(class1.field8);
        class15.field150 = -1;
        if (arg1 != 95) {
            field145 = 17;
        }
    }

    @OriginalMember(owner = "mapview!ha", name = "a", descriptor = "(I)J", line = 79)
    public static final synchronized long method78(int arg0) {
        long var1 = System.currentTimeMillis();
        if (arg0 != 0) {
            field140 = 16;
        }
        if (var1 < class8.field106) {
            class39.field508 += class8.field106 - var1;
        }
        class8.field106 = var1;
        return class39.field508 + var1;
    }
}
