import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!co")
public abstract class class271 extends class108 {

    @OriginalMember(owner = "client!co", name = "p", descriptor = "Luq;")
    public class313 field3451;

    @OriginalMember(owner = "client!co", name = "j", descriptor = "I")
    public static int field3445 = 1401;

    @OriginalMember(owner = "client!co", name = "k", descriptor = "I")
    public static int field3446;

    @OriginalMember(owner = "client!co", name = "l", descriptor = "I")
    public static int field3447;

    @OriginalMember(owner = "client!co", name = "n", descriptor = "I")
    public static int field3449;

    @OriginalMember(owner = "client!co", name = "o", descriptor = "I")
    public static int field3450;

    @OriginalMember(owner = "client!co", name = "m", descriptor = "Z")
    public boolean field3448;

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(I)V")
    public abstract void method1655(int arg0);

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(IIII)V")
    public static final void method1656(int arg0, int arg1, int arg2, int arg3) {
        class563 var4 = class199.field2605[arg0][arg1][arg2];
        if (var4 == null) {
            return;
        }
        class486 var5 = var4.field7885;
        class486 var6 = var4.field7889;
        if (var5 != null) {
            var5.field6786 = var5.field6786 * arg3 / (0x10 << class400.field5480 - 7);
            var5.field6777 = var5.field6777 * arg3 / (0x10 << class400.field5480 - 7);
        }
        if (var6 != null) {
            var6.field6786 = var6.field6786 * arg3 / (0x10 << class400.field5480 - 7);
            var6.field6777 = var6.field6777 * arg3 / (0x10 << class400.field5480 - 7);
        }
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(II)V")
    public abstract void method1657(int arg0, int arg1);

    @OriginalMember(owner = "client!co", name = "b", descriptor = "(I)Z")
    public final boolean method1658(int arg0) {
        if (arg0 == 7) {
            field3446++;
            return this.field3448;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(B)I")
    public final int method1659(byte arg0) {
        if (arg0 == -126) {
            field3450++;
            return 1;
        } else {
            return 12;
        }
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(III)V")
    public abstract void method1660(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!co", name = "c", descriptor = "(I)I")
    public int method1661(int arg0) {
        if (arg0 != -17472) {
            this.method1658(-118);
        }
        field3449++;
        return 0;
    }

    @OriginalMember(owner = "client!co", name = "g", descriptor = "(I)Z")
    public abstract boolean method1662(int arg0);

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(ILku;Lku;I)V")
    public abstract void method1663(int arg0, class495 arg1, class495 arg2, int arg3);

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(Z)Z")
    public abstract boolean method1664(boolean arg0);

    @OriginalMember(owner = "client!co", name = "<init>", descriptor = "(Luq;)V")
    public class271(class313 arg0) {
        this.field3451 = arg0;
    }

    @OriginalMember(owner = "client!co", name = "h", descriptor = "(I)Z")
    public final boolean method1665(int arg0) {
        if (arg0 <= 80) {
            this.field3448 = true;
        }
        field3447++;
        return false;
    }
}
