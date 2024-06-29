import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gb")
public abstract class class63 {

    @OriginalMember(owner = "client!gb", name = "c", descriptor = "Ljd;")
    public static class92 field1282 = class202.method1325((byte) 90, "Bitte laden Sie die Seite neu)3");

    @OriginalMember(owner = "client!gb", name = "g", descriptor = "Ljd;")
    public static class92 field1286 = class202.method1325((byte) 90, ")1");

    @OriginalMember(owner = "client!gb", name = "f", descriptor = "Ljd;")
    public static class92 field1285 = class202.method1325((byte) 90, "Verbindung konnte nicht hergestellt werden)3");

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "Ljd;")
    public static class92 field1281 = class202.method1325((byte) 90, "p11_full");

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "I")
    public static int field1280;

    @OriginalMember(owner = "client!gb", name = "d", descriptor = "I")
    public static int field1283;

    @OriginalMember(owner = "client!gb", name = "e", descriptor = "I")
    public static int field1284;

    @OriginalMember(owner = "client!gb", name = "h", descriptor = "I")
    public static int field1287;

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(I)V")
    public static final void method376(int arg0) {
        field1287++;
        if (!class72.field1524) {
            class3.field182 = 1;
            class92.field1815[0] = class102.field2098;
            class13.field383[0] = 1003;
            class189.field3604[0] = class3.field189;
        }
        if (class197.field3836 != -1) {
            class188.method1212(class197.field3836, 75);
        }
        for (int var1 = 0; var1 < class66.field1346; var1++) {
            if (class55.field1143[var1]) {
                class42.field942[var1] = true;
            }
            class174.field3364[var1] = class55.field1143[var1];
            class55.field1143[var1] = false;
        }
        if (arg0 != -16725) {
            method382(35);
        }
        class198.field3878 = -1;
        class137.field2748 = -1;
        class156.field3098 = class158.field3150;
        class159.field3163 = null;
        if (class197.field3836 != -1) {
            class66.field1346 = 0;
            class92.method641(0, (byte) 6, 503, class197.field3836, 765, 0, 0, 0, -1);
        }
        class163.method1037();
        class212.method1378(102);
        if (class72.field1524) {
            class84.method562(arg0 + 16852);
        } else if (class137.field2748 != -1) {
            class31.method206(-1, class137.field2748, class198.field3878);
        }
        if (class142.field2832 == 3) {
            for (int var2 = 0; var2 < class66.field1346; var2++) {
                if (class174.field3364[var2]) {
                    class163.method1039(class135.field2703[var2], class190.field3653[var2], class74.field1564[var2], class206.field3963[var2], 16711935, 128);
                } else if (class42.field942[var2]) {
                    class163.method1039(class135.field2703[var2], class190.field3653[var2], class74.field1564[var2], class206.field3963[var2], 16711680, 128);
                }
            }
        }
        class129.method852(class81.field1639, class76.field1588, class15.field423.field208, (byte) 10, class15.field423.field246);
        class76.field1588 = 0;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(Ljava/awt/Component;B)V")
    public abstract void method377(Component arg0, byte arg1);

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "(I)I")
    public abstract int method378(int arg0);

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(ILjava/awt/Component;)V")
    public abstract void method379(int arg0, Component arg1);

    @OriginalMember(owner = "client!gb", name = "c", descriptor = "(I)V")
    public static void method380(int arg0) {
        if (arg0 == 9506) {
            field1285 = null;
            field1282 = null;
            field1281 = null;
            field1286 = null;
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(Lnh;Z)V")
    public static final void method381(class133 arg0, boolean arg1) {
        class36.field831 = arg0;
        if (!arg1) {
            method382(54);
        }
        field1283++;
        class12.field368 = class36.field831.method886(117, 16);
    }

    @OriginalMember(owner = "client!gb", name = "d", descriptor = "(I)Lsc;")
    public static final class173 method382(int arg0) {
        if (arg0 != 14700) {
            field1286 = null;
        }
        class173 var1 = new class173();
        var1.field3354 = class119.field2419[0];
        field1284++;
        var1.field3351 = class39.field876[0];
        var1.field3352 = class153.field3029;
        var1.field3358 = class123.field2503;
        var1.field3355 = class153.field3039[0];
        var1.field3356 = class147.field2917;
        var1.field3353 = class14.field401[0];
        var1.field3357 = class61.field1275[0];
        class146.method955(true);
        return var1;
    }
}
