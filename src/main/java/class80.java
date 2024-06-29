import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public class class80 {

    @OriginalMember(owner = "client!hc", name = "e", descriptor = "Lkh;")
    public static class117 field1504 = class224.method1450((byte) -46, "Texturen geladen)3");

    @OriginalMember(owner = "client!hc", name = "d", descriptor = "Z")
    public static boolean field1503 = false;

    @OriginalMember(owner = "client!hc", name = "i", descriptor = "[Lfc;")
    public static class59[] field1508 = new class59[50];

    @OriginalMember(owner = "client!hc", name = "f", descriptor = "I")
    public static int field1505 = 0;

    @OriginalMember(owner = "client!hc", name = "j", descriptor = "Lkh;")
    public static class117 field1509 = null;

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "I")
    public static int field1500;

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "I")
    public static int field1501;

    @OriginalMember(owner = "client!hc", name = "c", descriptor = "I")
    public static int field1502;

    @OriginalMember(owner = "client!hc", name = "h", descriptor = "I")
    public static int field1507;

    @OriginalMember(owner = "client!hc", name = "k", descriptor = "[I")
    public static int[] field1510;

    @OriginalMember(owner = "client!hc", name = "g", descriptor = "[Lr;")
    public static class186[] field1506;

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(B)V")
    public static final void method551(byte arg0) {
        field1507++;
        int var1 = class18.field511.method396(8, (byte) -9);
        if (var1 < class229.field4121) {
            for (int var2 = var1; var2 < class229.field4121; var2++) {
                class137.field2483[class66.field1265++] = class139.field2539[var2];
            }
        }
        if (class229.field4121 < var1) {
            throw new RuntimeException("gppov1");
        }
        class229.field4121 = 0;
        int var3 = 0;
        if (arg0 >= -30) {
            field1508 = null;
        }
        while (var1 > var3) {
            int var4 = class139.field2539[var3];
            class56 var5 = class43.field950[var4];
            int var6 = class18.field511.method396(1, (byte) -9);
            if (var6 == 0) {
                class139.field2539[class229.field4121++] = var4;
                var5.field4226 = class44.field966;
            } else {
                int var7 = class18.field511.method396(2, (byte) -9);
                if (var7 == 0) {
                    class139.field2539[class229.field4121++] = var4;
                    var5.field4226 = class44.field966;
                    class203.field3679[class215.field3914++] = var4;
                } else if (var7 == 1) {
                    class139.field2539[class229.field4121++] = var4;
                    var5.field4226 = class44.field966;
                    int var8 = class18.field511.method396(3, (byte) -9);
                    var5.method1509(false, var8, (byte) -75);
                    int var9 = class18.field511.method396(1, (byte) -9);
                    if (var9 == 1) {
                        class203.field3679[class215.field3914++] = var4;
                    }
                } else if (var7 == 2) {
                    class139.field2539[class229.field4121++] = var4;
                    var5.field4226 = class44.field966;
                    int var10 = class18.field511.method396(3, (byte) -9);
                    var5.method1509(true, var10, (byte) -23);
                    int var11 = class18.field511.method396(3, (byte) -9);
                    var5.method1509(true, var11, (byte) -110);
                    int var12 = class18.field511.method396(1, (byte) -9);
                    if (var12 == 1) {
                        class203.field3679[class215.field3914++] = var4;
                    }
                } else if (var7 == 3) {
                    class137.field2483[class66.field1265++] = var4;
                }
            }
            var3++;
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(ZLjava/awt/Component;)V")
    public static final void method552(boolean arg0, Component arg1) {
        field1500++;
        arg1.removeMouseListener(class199.field3581);
        arg1.removeMouseMotionListener(class199.field3581);
        if (!arg0) {
            field1508 = null;
        }
        arg1.removeFocusListener(class199.field3581);
        class11.field379 = 0;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(I)V")
    public static void method553(int arg0) {
        field1508 = null;
        field1510 = null;
        field1506 = null;
        if (arg0 != -7042) {
            field1508 = null;
        }
        field1504 = null;
        field1509 = null;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(II)V")
    public static final void method554(int arg0, int arg1) {
        if (~class209.field3751 == arg1) {
            class39.field897.method1567(arg0, arg1 + 13096);
        } else {
            class176.field3183 = arg0;
        }
        field1502++;
    }
}
