import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ib")
public class class3 {

    @OriginalMember(owner = "client!ib", name = "c", descriptor = "[I")
    public static int[] field37 = new int[100];

    @OriginalMember(owner = "client!ib", name = "e", descriptor = "Z")
    public static boolean field39 = true;

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "I")
    public static int field36;

    @OriginalMember(owner = "client!ib", name = "d", descriptor = "I")
    public static int field38;

    @OriginalMember(owner = "client!ib", name = "g", descriptor = "I")
    public static int field41;

    @OriginalMember(owner = "client!ib", name = "h", descriptor = "I")
    public static int field42;

    @OriginalMember(owner = "client!ib", name = "i", descriptor = "I")
    public static int field43;

    @OriginalMember(owner = "client!ib", name = "f", descriptor = "[I")
    public static int[] field40;

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "[S")
    public static short[] field35;

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(I)V")
    public static void method14(int arg0) {
        field40 = null;
        field37 = null;
        field35 = null;
        if (arg0 != -4287) {
            field37 = null;
        }
    }

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "(I)V")
    public static final void method15(int arg0) {
        if (arg0 != 0) {
            method18(-46, -70);
        }
        class72.field857.method67((byte) -117);
        field41++;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(ZI)V")
    public static final void method16(boolean arg0, int arg1) {
        field43++;
        class94 var2 = (class94) class224.field3161.method1895((long) arg1, -110);
        if (var2 == null) {
            return;
        }
        for (int var3 = 0; var3 < var2.field1260.length; var3++) {
            var2.field1260[var3] = -1;
            var2.field1255[var3] = 0;
        }
        if (!arg0) {
            field37 = null;
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(IZI)V")
    public static final void method17(int arg0, boolean arg1, int arg2) {
        field38++;
        if (!arg1) {
            class66 var3 = class6.method34(6, !arg1, arg0);
            var3.method408(0);
            var3.field784 = arg2;
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(II)Lmh;")
    public static final class59 method18(int arg0, int arg1) {
        field42++;
        class59 var2 = (class59) class136.field1976.method1567((long) arg1, 8);
        if (arg0 != 14551) {
            method15(51);
        }
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class141.field2032.method1861(arg1, 26, arg0 ^ 0x38D6);
        class59 var4 = new class59();
        if (var3 != null) {
            var4.method367(new class216(var3), 0);
        }
        class136.field1976.method1568((byte) -74, var4, (long) arg1);
        return var4;
    }
}
