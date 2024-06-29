import java.awt.event.KeyEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!l")
public class class20 {

    @OriginalMember(owner = "mapview!l", name = "a", descriptor = "Z")
    public static boolean field212 = true;

    @OriginalMember(owner = "mapview!l", name = "c", descriptor = "Lv;")
    public static class40 field214 = class24.method170("Archery Shop", (byte) -116);

    @OriginalMember(owner = "mapview!l", name = "d", descriptor = "Lv;")
    public static class40 field215 = class24.method170("mapscene", (byte) -96);

    @OriginalMember(owner = "mapview!l", name = "f", descriptor = "I")
    public static int field217 = 0;

    @OriginalMember(owner = "mapview!l", name = "e", descriptor = "Lua;")
    public static class39 field216 = new class39();

    @OriginalMember(owner = "mapview!l", name = "g", descriptor = "Lv;")
    public static class40 field218 = class24.method170("Jewellery", (byte) 82);

    @OriginalMember(owner = "mapview!l", name = "h", descriptor = "I")
    public static int field219 = 0;

    @OriginalMember(owner = "mapview!l", name = "b", descriptor = "I")
    public static int field213;

    @OriginalMember(owner = "mapview!l", name = "a", descriptor = "(ILjava/awt/event/KeyEvent;)I", line = 7)
    public static final int method117(int arg0, KeyEvent arg1) {
        if (arg0 != -257) {
            method119(true);
        }
        int var2 = arg1.getKeyChar();
        if (var2 == 8364) {
            return 128;
        } else {
            if (var2 <= 0 || var2 >= 256) {
                var2 = -1;
            }
            return var2;
        }
    }

    @OriginalMember(owner = "mapview!l", name = "a", descriptor = "(B)V", line = 32)
    public static final void method118(byte arg0) {
        if (class1.field8 != null) {
            class7 var1 = class1.field8;
            synchronized (class1.field8) {
                class1.field8 = null;
            }
        }
        if (arg0 != -70) {
            field212 = false;
        }
    }

    @OriginalMember(owner = "mapview!l", name = "a", descriptor = "(Z)V", line = 59)
    public static final void method119(boolean arg0) {
        if (arg0) {
            method118((byte) 80);
        }
        class7 var1 = class1.field8;
        synchronized (class1.field8) {
            class34.field453 = class25.field376;
            if (class15.field150 >= 0) {
                while (class15.field150 != class14.field144) {
                    int var2 = class8.field108[class14.field144];
                    class14.field144 = class14.field144 + 1 & 0x7F;
                    if (var2 >= 0) {
                        class36.field474[var2] = true;
                    } else {
                        class36.field474[~var2] = false;
                    }
                }
            } else {
                for (int var3 = 0; var3 < 112; var3++) {
                    class36.field474[var3] = false;
                }
                class15.field150 = class14.field144;
            }
            class25.field376 = class14.field139;
        }
    }

    @OriginalMember(owner = "mapview!l", name = "a", descriptor = "(I)V", line = 116)
    public static void method120(int arg0) {
        field214 = null;
        field215 = null;
        field218 = null;
        if (arg0 == -10888) {
            field216 = null;
        }
    }

    @OriginalMember(owner = "mapview!l", name = "b", descriptor = "(I)B", line = 143)
    public static final byte method121(int arg0) {
        if (arg0 != -113) {
            field212 = true;
        }
        return class41.field531 == null ? 0 : class41.field531[field213];
    }
}
