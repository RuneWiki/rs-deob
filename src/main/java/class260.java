import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mb")
public class class260 {

    @OriginalMember(owner = "client!mb", name = "e", descriptor = "Z")
    public static boolean field3508 = false;

    @OriginalMember(owner = "client!mb", name = "g", descriptor = "I")
    public static int field3510 = 0;

    @OriginalMember(owner = "client!mb", name = "d", descriptor = "Z")
    public static boolean field3507 = true;

    @OriginalMember(owner = "client!mb", name = "f", descriptor = "Lfi;")
    public static class166 field3509 = new class166();

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "I")
    public static int field3504;

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "I")
    public static int field3505;

    @OriginalMember(owner = "client!mb", name = "c", descriptor = "I")
    public int field3506;

    @OriginalMember(owner = "client!mb", name = "h", descriptor = "Lrk;")
    public static class427 field3511;

    @OriginalMember(owner = "client!mb", name = "i", descriptor = "Ljava/lang/String;")
    public String field3512;

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(II)I", line = 5)
    public static int method1678(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(Z)V", line = 21)
    public static void method1679(boolean arg0) {
        if (arg0) {
            field3508 = true;
        }
        field3511 = null;
        field3509 = null;
    }

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "(Z)V", line = 38)
    public static final void method1680(boolean arg0) {
        class410 var1 = class68.field1018;
        synchronized (class68.field1018) {
            class68.field1018.method2533(0);
        }
        if (!arg0) {
            method1679(false);
        }
        field3504++;
        class410 var2 = class388.field5462;
        synchronized (class388.field5462) {
            class388.field5462.method2533(0);
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(BLjava/lang/Object;Z)[B", line = 58)
    public static final byte[] method1681(byte arg0, Object arg1, boolean arg2) {
        if (arg0 < 45) {
            return null;
        }
        field3505++;
        if (arg1 == null) {
            return null;
        } else if (arg1 instanceof byte[]) {
            byte[] var3 = (byte[]) arg1;
            return arg2 ? class331.method2106(var3, 0) : var3;
        } else if (arg1 instanceof class114) {
            class114 var4 = (class114) arg1;
            return var4.method880((byte) -109);
        } else {
            throw new IllegalArgumentException();
        }
    }
}
