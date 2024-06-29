import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fh")
public class class298 {

    @OriginalMember(owner = "client!fh", name = "c", descriptor = "Z")
    public static boolean field4584 = false;

    @OriginalMember(owner = "client!fh", name = "h", descriptor = "Z")
    public static boolean field4589 = false;

    @OriginalMember(owner = "client!fh", name = "e", descriptor = "Lec;")
    public static class99 field4586 = new class99(64);

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "I")
    public static int field4582;

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "I")
    public static int field4583;

    @OriginalMember(owner = "client!fh", name = "d", descriptor = "I")
    public static int field4585;

    @OriginalMember(owner = "client!fh", name = "f", descriptor = "I")
    public static int field4587;

    @OriginalMember(owner = "client!fh", name = "g", descriptor = "I")
    public static int field4588;

    @OriginalMember(owner = "client!fh", name = "i", descriptor = "I")
    public static int field4590;

    @OriginalMember(owner = "client!fh", name = "j", descriptor = "I")
    public static int field4591;

    @OriginalMember(owner = "client!fh", name = "k", descriptor = "I")
    public static int field4592;

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(Z)V", line = 4)
    public static void method2052(boolean arg0) {
        field4586 = null;
        if (!arg0) {
            field4591 = -94;
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(B)V", line = 25)
    public static final void method2053(byte arg0) {
        field4592++;
        Container var1;
        if (class170.field2747 != null) {
            var1 = class170.field2747;
        } else if (class254.field3878 == null) {
            var1 = class330.field5074.field95;
        } else {
            var1 = class254.field3878;
        }
        class312.field4843 = var1.getSize().width;
        class242.field3687 = var1.getSize().height;
        if (class254.field3878 == var1) {
            Insets var2 = class254.field3878.getInsets();
            class242.field3687 -= var2.top + var2.bottom;
            class312.field4843 -= var2.left + var2.right;
        }
        if (class63.method431(arg0 ^ 0xFFFFFFCF) >= 2) {
            class176.field2818 = 0;
            class215.field3300 = class242.field3687;
            class135.field2052 = 0;
            class151.field2281 = class312.field4843;
        } else {
            class151.field2281 = 765;
            class176.field2818 = (class312.field4843 - 765) / 2;
            class135.field2052 = 0;
            class215.field3300 = 503;
        }
        if (class73.field1058) {
            class73.method555(class151.field2281, class215.field3300);
        }
        class102.field1480.setSize(class151.field2281, class215.field3300);
        if (class254.field3878 == var1) {
            Insets var3 = class254.field3878.getInsets();
            class102.field1480.setLocation(class176.field2818 + var3.left, var3.top - -class135.field2052);
        } else {
            class102.field1480.setLocation(class176.field2818, class135.field2052);
        }
        if (class28.field334 != -1) {
            class265.method1860((byte) -82, true);
        }
        if (arg0 == -50) {
            class206.method1489(arg0 + 25884);
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(IBII)I", line = 97)
    public static final int method2054(int arg0, byte arg1, int arg2, int arg3) {
        if (arg1 != 78) {
            method2055(84, (char) 65450);
        }
        field4590++;
        if (arg3 > 243) {
            arg2 >>= 0x4;
        } else if (arg3 > 217) {
            arg2 >>= 0x3;
        } else if (arg3 > 192) {
            arg2 >>= 0x2;
        } else if (arg3 > 179) {
            arg2 >>= 0x1;
        }
        return (arg2 >> 5 << 7) + (arg0 >> 2 << 10) + (arg3 >> 1);
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(IC)C", line = 123)
    public static final char method2055(int arg0, char arg1) {
        field4587++;
        if (arg1 == 'Æ') {
            return 'E';
        } else if (arg1 == 'æ') {
            return 'e';
        } else if (arg1 == 'ß') {
            return 's';
        } else {
            if (arg0 != -14300) {
                field4586 = (class99) null;
            }
            if (arg1 == 'Œ') {
                return 'E';
            } else {
                return (char) (arg1 == 'œ' ? 'e' : '\u0000');
            }
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(III)I", line = 159)
    public static final int method2056(int arg0, int arg1, int arg2) {
        if (arg1 != 0) {
            method2052(true);
        }
        class130 var3 = (class130) class29.field355.method1716(-1, (long) arg2);
        field4585++;
        if (var3 == null) {
            return 0;
        } else if (arg0 >= 0 && var3.field1998.length > arg0) {
            return var3.field1998[arg0];
        } else {
            return 0;
        }
    }
}
