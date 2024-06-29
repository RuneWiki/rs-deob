import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public class class127 {

    @OriginalMember(owner = "client!ab", name = "c", descriptor = "I")
    public static int field2244 = 0;

    @OriginalMember(owner = "client!ab", name = "h", descriptor = "Llc;")
    public static class143 field2249 = class66.method374("Veuillez patienter )2 tentative de r-Btablissement)3", -1);

    @OriginalMember(owner = "client!ab", name = "i", descriptor = "Llc;")
    public static class143 field2250 = class66.method374("Lade Wordpack )2 ", -1);

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "I")
    public static int field2242;

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "I")
    public static int field2243;

    @OriginalMember(owner = "client!ab", name = "d", descriptor = "I")
    public static int field2245;

    @OriginalMember(owner = "client!ab", name = "e", descriptor = "I")
    public static int field2246;

    @OriginalMember(owner = "client!ab", name = "j", descriptor = "I")
    public static int field2251;

    @OriginalMember(owner = "client!ab", name = "g", descriptor = "[Lek;")
    public static class160[] field2248;

    @OriginalMember(owner = "client!ab", name = "f", descriptor = "[Lvg;")
    public static class230[] field2247;

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(I)V")
    public static final void method769(int arg0) {
        Container var1;
        if (class23.field384 != null) {
            var1 = class23.field384;
        } else if (class8.field155 == null) {
            var1 = class4.field62.field1469;
        } else {
            var1 = class8.field155;
        }
        field2251++;
        class159.field2883 = var1.getSize().width;
        class217.field3979 = var1.getSize().height;
        if (class8.field155 == var1) {
            Insets var2 = class8.field155.getInsets();
            class217.field3979 -= var2.top + var2.bottom;
            class159.field2883 -= var2.right + var2.left;
        }
        if (class69.method399(69) >= arg0) {
            class269.field4820 = class217.field3979;
            class10.field222 = class159.field2883;
            class257.field4620 = 0;
            class141.field2459 = 0;
        } else {
            class269.field4820 = 503;
            class257.field4620 = 0;
            class141.field2459 = (class159.field2883 - 765) / 2;
            class10.field222 = 765;
        }
        class155.field2792.setSize(class10.field222, class269.field4820);
        if (class8.field155 == var1) {
            Insets var3 = class8.field155.getInsets();
            class155.field2792.setLocation(class141.field2459 + var3.left, class257.field4620 + var3.top);
        } else {
            class155.field2792.setLocation(class141.field2459, class257.field4620);
        }
        if (class7.field138 != -1) {
            class136.method816(true, true);
        }
        class163.method1073((byte) -3);
    }

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "(I)V")
    public static void method770(int arg0) {
        field2247 = null;
        if (arg0 == 2) {
            field2249 = null;
            field2248 = null;
            field2250 = null;
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(Z)V")
    public static final void method771(boolean arg0) {
        class39.field680.method823(arg0);
        field2242++;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(IIIZI)V")
    public static final void method772(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        class273.field4864 = 0L;
        field2246++;
        boolean var5 = false;
        if (arg4 != 10979) {
            method769(41);
        }
        int var6 = class69.method399(87);
        if (arg1 <= 0 != var6 <= 0) {
            var5 = true;
        }
        if (arg1 == 3 || var6 == 3) {
            arg3 = true;
        }
        if (class81.field1482.startsWith("mac") && arg1 > 0) {
            arg3 = true;
        }
        if (arg3 && arg1 > 0) {
            var5 = true;
        }
        class115.method697(var5, arg0, var6, 10905, arg1, arg2, arg3);
    }
}
