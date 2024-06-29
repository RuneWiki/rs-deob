import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ka")
public class class70 {

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "Lv;")
    public static class146 field1627 = class159.method1226((byte) -37, "jlv");

    @OriginalMember(owner = "client!ka", name = "f", descriptor = "Lv;")
    public static class146 field1632 = class159.method1226((byte) -37, "VOLL");

    @OriginalMember(owner = "client!ka", name = "c", descriptor = "[I")
    public static int[] field1629 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client!ka", name = "e", descriptor = "Lv;")
    public static class146 field1631 = class159.method1226((byte) -37, "Bitte laden Sie die Seite neu)3");

    @OriginalMember(owner = "client!ka", name = "i", descriptor = "[I")
    public static int[] field1635 = new int[256];

    @OriginalMember(owner = "client!ka", name = "g", descriptor = "I")
    public static int field1633 = 0;

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "I")
    public static int field1628;

    @OriginalMember(owner = "client!ka", name = "d", descriptor = "I")
    public static int field1630;

    @OriginalMember(owner = "client!ka", name = "h", descriptor = "I")
    public static int field1634;

    @OriginalMember(owner = "client!ka", name = "j", descriptor = "I")
    public static int field1636;

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(I)I")
    public static final int method502(int arg0) {
        if (arg0 == 765) {
            field1630++;
            int var1 = class79.method612(class148.field3428, class126.field2920, class143.field3266, false);
            return var1 - class116.field2698 >= 800 || (class74.field1772[class148.field3428][class126.field2920 >> 7][class143.field3266 >> 7] & 0x4) == 0 ? 3 : class148.field3428;
        } else {
            return 122;
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Z)V")
    public static void method503(boolean arg0) {
        field1627 = null;
        field1632 = null;
        field1629 = null;
        field1635 = null;
        if (arg0) {
            field1631 = null;
        }
    }

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "(I)V")
    public static final void method504(int arg0) {
        if (!class38.field842) {
            class13.field208 = 1;
            class115.field2671[0] = 1002;
            class137.field3113[0] = class140.field3210;
            class74.field1720[0] = class158.field3633;
        }
        field1634++;
        if (class6.field136 != -1) {
            class101.method837(arg0 - 16679677, class6.field136);
        }
        for (int var1 = 0; var1 < class92.field2203; var1++) {
            if (class83.field2013[var1]) {
                class157.field3627[var1] = true;
            }
            class26.field567[var1] = class83.field2013[var1];
            class83.field2013[var1] = false;
        }
        class41.field931 = class94.field2229;
        class157.field3617 = null;
        class38.field864 = -1;
        class3.field79 = -1;
        if (class6.field136 != -1) {
            class92.field2203 = 0;
            class54.method367(0, 0, class6.field136, 0, -1, 503, (byte) 127, 765, 0);
        }
        class56.method376();
        class95.method758(false);
        if (arg0 != 16711680) {
            field1635 = null;
        }
        if (class38.field842) {
            class98.method801(arg0 - 16711766);
        } else if (class38.field864 != -1) {
            class57.method397((byte) -105, class38.field864, class3.field79);
        }
        if (class17.field264 == 3) {
            for (int var2 = 0; var2 < class92.field2203; var2++) {
                if (class26.field567[var2]) {
                    class56.method384(class49.field1131[var2], class151.field3479[var2], class159.field3647[var2], class35.field812[var2], 16711935, 128);
                } else if (class157.field3627[var2]) {
                    class56.method384(class49.field1131[var2], class151.field3479[var2], class159.field3647[var2], class35.field812[var2], 16711680, 128);
                }
            }
        }
        class49.method343(class148.field3428, class1.field16, class116.field2696.field757, (byte) 11, class116.field2696.field790);
        class1.field16 = 0;
    }

    @OriginalMember(owner = "client!ka", name = "c", descriptor = "(I)V")
    public static final void method505(int arg0) {
        field1636++;
        for (int var1 = -1; var1 < class126.field2925; var1++) {
            int var5;
            if (var1 == -1) {
                var5 = 2047;
            } else {
                var5 = class136.field3080[var1];
            }
            class67 var6 = class125.field2902[var5];
            if (var6 != null && var6.field741 > 0) {
                var6.field741--;
                if (var6.field741 == 0) {
                    var6.field762 = null;
                }
            }
        }
        for (int var2 = arg0; var2 < class91.field2171; var2++) {
            int var3 = class57.field1271[var2];
            class38 var4 = class34.field735[var3];
            if (var4 != null && var4.field741 > 0) {
                var4.field741--;
                if (var4.field741 == 0) {
                    var4.field762 = null;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIII)I")
    public static final int method506(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 > 179) {
            arg0 /= 2;
        }
        if (arg1 != 5508) {
            return -126;
        }
        if (arg2 > 192) {
            arg0 /= 2;
        }
        field1628++;
        if (arg2 > 217) {
            arg0 /= 2;
        }
        if (arg2 > 243) {
            arg0 /= 2;
        }
        return arg2 / 2 + (arg0 / 32 << 7) + (arg3 / 4 << 10);
    }
}
