import java.awt.Color;
import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!en")
public class class251 {

    @OriginalMember(owner = "client!en", name = "h", descriptor = "I")
    public static int field3506 = 0;

    @OriginalMember(owner = "client!en", name = "g", descriptor = "[I")
    public static int[] field3505 = new int[250];

    @OriginalMember(owner = "client!en", name = "d", descriptor = "Z")
    public static boolean field3502 = false;

    @OriginalMember(owner = "client!en", name = "i", descriptor = "I")
    public static int field3507 = -2;

    @OriginalMember(owner = "client!en", name = "f", descriptor = "I")
    public static int field3504 = -1;

    @OriginalMember(owner = "client!en", name = "a", descriptor = "I")
    public static int field3499;

    @OriginalMember(owner = "client!en", name = "b", descriptor = "I")
    public static int field3500;

    @OriginalMember(owner = "client!en", name = "c", descriptor = "I")
    public static int field3501;

    @OriginalMember(owner = "client!en", name = "e", descriptor = "I")
    public static int field3503;

    @OriginalMember(owner = "client!en", name = "j", descriptor = "Lij;")
    public static class316 field3508;

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(B)V")
    public static final void method1616(byte arg0) {
        class146.field2122.method1476(-18020);
        field3500++;
        class116.field1759.method29(true);
        if (class218.field3064 != null) {
            class218.field3064.method1397(class104.field1447, (byte) 57);
        }
        class352.field4737.method2512((byte) -128);
        if (arg0 != 41) {
            method1620((byte) -106);
        }
        class104.field1447.setBackground(Color.black);
        class345.field4668 = -1;
        class146.field2122 = class29.method280(class104.field1447, (byte) 100);
        class116.field1759 = class20.method119(true, -127, class104.field1447);
        if (class218.field3064 != null) {
            class218.field3064.method1395(arg0 ^ 0xA9, class104.field1447);
        }
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(II)I")
    public static final int method1617(int arg0, int arg1) {
        field3503++;
        int var2 = -58 % ((arg1 + 76) / 37);
        return arg0 == 16711935 ? -1 : class116.method870(arg0, true);
    }

    @OriginalMember(owner = "client!en", name = "b", descriptor = "(II)V")
    public static final void method1618(int arg0, int arg1) {
        field3501++;
        class26 var2 = class217.method1445(true, arg1, 6);
        var2.method164(12);
        if (arg0 != 2) {
            method1617(-68, 120);
        }
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(I)V")
    public static void method1619(int arg0) {
        field3505 = null;
        field3508 = null;
        if (arg0 != 96) {
            method1619(-53);
        }
    }

    @OriginalMember(owner = "client!en", name = "b", descriptor = "(B)V")
    public static final void method1620(byte arg0) {
        field3499++;
        if (class261.field3604 != null) {
            return;
        }
        Container var1;
        if (class323.field4392 == null) {
            var1 = class122.field1839.field1086;
        } else {
            var1 = class323.field4392;
        }
        class72.field1041 = var1.getSize().width;
        class350.field4718 = var1.getSize().height;
        if (class323.field4392 == var1) {
            Insets var2 = class323.field4392.getInsets();
            class72.field1041 -= var2.left + var2.right;
            class350.field4718 -= var2.top + var2.bottom;
        }
        if (class111.method846(-12334) == 1) {
            class13.field116 = 0;
            class373.field5174 = 765;
            class193.field2798 = (class72.field1041 - 765) / 2;
            class396.field5493 = 503;
        } else if (class409.field5703 < 96 && class22.field284 == 0) {
            int var3 = class72.field1041 <= 1024 ? class72.field1041 : 1024;
            class373.field5174 = var3;
            class193.field2798 = (class72.field1041 - var3) / 2;
            int var4 = class350.field4718 > 768 ? 768 : class350.field4718;
            class396.field5493 = var4;
            class13.field116 = 0;
        } else {
            class193.field2798 = 0;
            class13.field116 = 0;
            class373.field5174 = class72.field1041;
            class396.field5493 = class350.field4718;
        }
        if (class314.field4259 != 0) {
            boolean var10000;
            if (class373.field5174 < 1024 && class396.field5493 < 768) {
                var10000 = true;
            } else {
                var10000 = false;
            }
        }
        class104.field1447.setSize(class373.field5174, class396.field5493);
        if (class354.field4765 != null) {
            class354.field4765.method266();
        }
        if (class323.field4392 == var1) {
            Insets var5 = class323.field4392.getInsets();
            class104.field1447.setLocation(class193.field2798 + var5.left, var5.top - -class13.field116);
        } else {
            class104.field1447.setLocation(class193.field2798, class13.field116);
        }
        if (class350.field4712 != -1) {
            class183.method1277((byte) 96, true);
        }
        class72.method566((byte) -125);
        if (arg0 >= -102) {
            field3508 = null;
        }
    }
}
