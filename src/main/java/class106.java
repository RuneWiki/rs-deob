import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!af")
public class class106 extends class264 {

    @OriginalMember(owner = "client!af", name = "v", descriptor = "Ljava/lang/String;")
    public String field1430;

    @OriginalMember(owner = "client!af", name = "s", descriptor = "Z")
    public static boolean field1427 = false;

    @OriginalMember(owner = "client!af", name = "t", descriptor = "Llf;")
    public static class350 field1428 = null;

    @OriginalMember(owner = "client!af", name = "x", descriptor = "Ldq;")
    public static class90 field1432 = new class90(16);

    @OriginalMember(owner = "client!af", name = "y", descriptor = "[I")
    public static int[] field1433 = new int[13];

    @OriginalMember(owner = "client!af", name = "A", descriptor = "[I")
    public static int[] field1435 = new int[] { 2, 2, 4, 2, 1, 8, 4, 1, 4, 4, 2, 1, 1, 1, 4, 1 };

    @OriginalMember(owner = "client!af", name = "p", descriptor = "I")
    public static int field1424;

    @OriginalMember(owner = "client!af", name = "q", descriptor = "I")
    public static int field1425;

    @OriginalMember(owner = "client!af", name = "r", descriptor = "I")
    public static int field1426;

    @OriginalMember(owner = "client!af", name = "u", descriptor = "I")
    public static int field1429;

    @OriginalMember(owner = "client!af", name = "w", descriptor = "I")
    public static int field1431;

    @OriginalMember(owner = "client!af", name = "z", descriptor = "Lpl;")
    public static class459 field1434;

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(II)V")
    public static final void method757(int arg0, int arg1) {
        if (arg1 < ~arg0 || arg0 > 2) {
            arg0 = 0;
        }
        field1429++;
        class202.field2855 = arg0;
    }

    @OriginalMember(owner = "client!af", name = "d", descriptor = "(I)V")
    public static final void method758(int arg0) {
        field1425++;
        if (arg0 > 9) {
            class160.field2138.method2307(-72);
        }
    }

    @OriginalMember(owner = "client!af", name = "b", descriptor = "(II)V")
    public static final void method759(int arg0, int arg1) {
        if (arg0 >= -125) {
            return;
        }
        class363 var2 = class227.field3408;
        synchronized (class227.field3408) {
            class227.field3408.method2300(arg1, true);
        }
        field1426++;
    }

    @OriginalMember(owner = "client!af", name = "e", descriptor = "(I)V")
    public static void method760(int arg0) {
        field1433 = null;
        field1434 = null;
        field1428 = null;
        field1432 = null;
        field1435 = null;
        if (arg0 != 4) {
            field1431 = 34;
        }
    }

    @OriginalMember(owner = "client!af", name = "<init>", descriptor = "()V")
    public class106() {
    }

    @OriginalMember(owner = "client!af", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
    public class106(String arg0, int arg1) {
        this.field1430 = arg0;
    }
}
