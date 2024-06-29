import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ua")
public class class116 extends class252 {

    @OriginalMember(owner = "client!ua", name = "o", descriptor = "Z")
    public static boolean field1762 = false;

    @OriginalMember(owner = "client!ua", name = "u", descriptor = "I")
    public static int field1768 = 0;

    @OriginalMember(owner = "client!ua", name = "s", descriptor = "I")
    public static int field1766 = -1;

    @OriginalMember(owner = "client!ua", name = "q", descriptor = "Ljava/lang/String;")
    public static String field1764 = "K";

    @OriginalMember(owner = "client!ua", name = "x", descriptor = "I")
    public static int field1771 = 0;

    @OriginalMember(owner = "client!ua", name = "w", descriptor = "I")
    public static int field1770 = 0;

    @OriginalMember(owner = "client!ua", name = "p", descriptor = "I")
    public static int field1763;

    @OriginalMember(owner = "client!ua", name = "t", descriptor = "I")
    public static int field1767;

    @OriginalMember(owner = "client!ua", name = "y", descriptor = "I")
    public static int field1772;

    @OriginalMember(owner = "client!ua", name = "z", descriptor = "I")
    public static int field1773;

    @OriginalMember(owner = "client!ua", name = "v", descriptor = "Lrf;")
    public static class289 field1769;

    @OriginalMember(owner = "client!ua", name = "r", descriptor = "Lpf;")
    public static class294 field1765;

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(IZ)Lpk;")
    public static final class102 method745(int arg0, boolean arg1) {
        field1767++;
        class102 var2 = (class102) class250.field3799.method1777((long) arg0, (byte) 112);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class155.field2330.method1973(1, 4, arg0);
        class102 var4 = new class102();
        if (var3 != null) {
            var4.method658(new class248(var3), 65535, arg0);
        }
        if (arg1) {
            return null;
        } else {
            class250.field3799.method1784((long) arg0, var4, 0);
            return var4;
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(Z)V")
    public static void method746(boolean arg0) {
        field1765 = null;
        field1764 = null;
        field1769 = null;
        if (arg0) {
            method746(false);
        }
    }

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "(I)V")
    public static final void method747(int arg0) {
        class210.field3158.method1775(arg0 ^ 0x6A0A);
        if (arg0 == 1) {
            class71.field1127.method1775(arg0 + 27146);
            field1772++;
        }
    }
}
