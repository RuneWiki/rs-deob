import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!ra")
public class class34 {

    @OriginalMember(owner = "mapview!ra", name = "b", descriptor = "Lea;")
    public static class10 field455 = class3.method8("Chainmail Shop", -114);

    @OriginalMember(owner = "mapview!ra", name = "c", descriptor = "Lea;")
    public static class10 field456 = class3.method8("Sandpit", 126);

    @OriginalMember(owner = "mapview!ra", name = "f", descriptor = "J")
    public static volatile long field459 = 0L;

    @OriginalMember(owner = "mapview!ra", name = "d", descriptor = "[I")
    public static int[] field457 = new int[256];

    @OriginalMember(owner = "mapview!ra", name = "a", descriptor = "Lfa;")
    public static class12 field454;

    @OriginalMember(owner = "mapview!ra", name = "e", descriptor = "Z")
    public static boolean field458;

    @OriginalMember(owner = "mapview!ra", name = "a", descriptor = "(Z)V", line = 20)
    public static void method230(boolean arg0) {
        field457 = null;
        field456 = null;
        field455 = null;
        field454 = null;
        if (!arg0) {
            field458 = true;
        }
    }

    @OriginalMember(owner = "mapview!ra", name = "a", descriptor = "(BLjava/awt/Component;)V", line = 34)
    public static final void method231(byte arg0, Component arg1) {
        if (arg0 == -79) {
            arg1.removeMouseListener(class22.field234);
            arg1.removeMouseMotionListener(class22.field234);
            arg1.removeFocusListener(class22.field234);
            class33.field445 = 0;
        }
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            int var1 = var0;
            for (int var2 = 0; var2 < 8; var2++) {
                if ((var1 & 0x1) == 1) {
                    var1 = var1 >>> 1 ^ 0xEDB88320;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field457[var0] = var1;
        }
    }

    @OriginalMember(owner = "mapview!ra", name = "a", descriptor = "(B)V", line = 77)
    public static final void method232(byte arg0) {
        if (++class31.field427 >= 64) {
            class17.field185++;
            class31.field427 = 0;
            if (class17.field185 < class6.field48 >> 6) {
                class35.method239(true);
            }
        }
        int var1 = 36 % ((arg0 - 75) / 35);
        class22.field238 = (class31.field427 << 6) + class25.field388;
    }
}
