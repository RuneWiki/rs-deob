import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lh")
public class class349 extends class403 implements class113 {

    @OriginalMember(owner = "client!lh", name = "p", descriptor = "Let;")
    public class403 field5048;

    @OriginalMember(owner = "client!lh", name = "u", descriptor = "Z")
    public static boolean field5053 = false;

    @OriginalMember(owner = "client!lh", name = "r", descriptor = "[I")
    public static int[] field5050 = new int[1];

    @OriginalMember(owner = "client!lh", name = "m", descriptor = "I")
    public static int field5045;

    @OriginalMember(owner = "client!lh", name = "n", descriptor = "I")
    public static int field5046;

    @OriginalMember(owner = "client!lh", name = "o", descriptor = "I")
    public static int field5047;

    @OriginalMember(owner = "client!lh", name = "q", descriptor = "I")
    public static int field5049;

    @OriginalMember(owner = "client!lh", name = "s", descriptor = "I")
    public static int field5051;

    @OriginalMember(owner = "client!lh", name = "t", descriptor = "I")
    public static int field5052;

    @OriginalMember(owner = "client!lh", name = "v", descriptor = "I")
    public static int field5054;

    @OriginalMember(owner = "client!lh", name = "w", descriptor = "I")
    public static int field5055;

    @OriginalMember(owner = "client!lh", name = "x", descriptor = "I")
    public static int field5056;

    @OriginalMember(owner = "client!lh", name = "y", descriptor = "I")
    public static int field5057;

    @OriginalMember(owner = "client!lh", name = "z", descriptor = "I")
    public static int field5058;

    @OriginalMember(owner = "client!lh", name = "A", descriptor = "I")
    public static int field5059;

    @OriginalMember(owner = "client!lh", name = "B", descriptor = "I")
    public static int field5060;

    @OriginalMember(owner = "client!lh", name = "C", descriptor = "I")
    public static int field5061;

    @OriginalMember(owner = "client!lh", name = "D", descriptor = "I")
    public static int field5062;

    @OriginalMember(owner = "client!lh", name = "<init>", descriptor = "(IIIIILet;)V")
    public class349(int arg0, int arg1, int arg2, int arg3, int arg4, class403 arg5) {
        super(arg2, arg3, arg4, class201.method1242(false, arg0, arg1));
        this.field5048 = arg5;
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(BLeq;)V")
    public final void method372(byte arg0, class134 arg1) {
        if (arg0 > -49) {
            this.field5048 = null;
        }
        field5051++;
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(B)I")
    public final int method369(byte arg0) {
        if (arg0 < 24) {
            field5053 = true;
        }
        field5060++;
        return 0;
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(IIILbp;IZLeq;)V")
    public final void method719(int arg0, int arg1, int arg2, class250 arg3, int arg4, boolean arg5, class134 arg6) {
        if (arg2 != -1) {
            field5053 = true;
        }
        field5047++;
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(Z)Z")
    public final boolean method371(boolean arg0) {
        if (arg0) {
            this.method362((byte) -92);
        }
        field5045++;
        return false;
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(ILeq;Z)Lva;")
    public final class327 method367(int arg0, class134 arg1, boolean arg2) {
        if (arg2) {
            field5055++;
            return null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(Leq;Z)V")
    public final void method360(class134 arg0, boolean arg1) {
        field5061++;
        if (!arg1) {
            this.method361(null, 125);
        }
    }

    @OriginalMember(owner = "client!lh", name = "b", descriptor = "(I)V")
    public final void method368(int arg0) {
        if (arg0 != 5894) {
            method2118((byte) -89);
        }
        field5059++;
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(ILeq;BI)Z")
    public final boolean method365(int arg0, class134 arg1, byte arg2, int arg3) {
        field5052++;
        int var5 = 3 % ((arg2 + 23) / 38);
        return false;
    }

    @OriginalMember(owner = "client!lh", name = "b", descriptor = "(Leq;Z)Lgl;")
    public final class408 method364(class134 arg0, boolean arg1) {
        if (arg1) {
            return null;
        } else {
            field5062++;
            return null;
        }
    }

    @OriginalMember(owner = "client!lh", name = "c", descriptor = "(B)V")
    public static void method2118(byte arg0) {
        if (arg0 == -9) {
            field5050 = null;
        }
    }

    @OriginalMember(owner = "client!lh", name = "c", descriptor = "(I)V")
    public final void method722(int arg0) {
        if (arg0 != 0) {
            this.method359(127);
        }
        field5054++;
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(Leq;I)V")
    public final void method361(class134 arg0, int arg1) {
        if (arg1 != -1) {
            this.method719(-64, 114, -5, null, 76, true, null);
        }
        field5058++;
    }

    @OriginalMember(owner = "client!lh", name = "b", descriptor = "(B)I")
    public final int method362(byte arg0) {
        field5046++;
        if (arg0 != -72) {
            this.method371(false);
        }
        return 0;
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(I)I")
    public final int method359(int arg0) {
        field5049++;
        if (arg0 != 13228) {
            this.method364(null, true);
        }
        return 0;
    }

    @OriginalMember(owner = "client!lh", name = "f", descriptor = "(I)V")
    public static final void method2119(int arg0) {
        class312.method1869(70);
        field5056++;
        class350.method2124(arg0, 22050, -63, class118.field1533.field6884);
        class121.field1587 = class423.method2524(2541, 0, 22050, class498.field7590, class86.field1182);
        class121.field1587.method1712(class289.field4142, arg0 + 37);
        class342.field4970 = class423.method2524(2541, 1, 2048, class498.field7590, class86.field1182);
        class342.field4970.method1712(class375.field5607, arg0 - 104);
    }

    @OriginalMember(owner = "client!lh", name = "d", descriptor = "(I)Z")
    public final boolean method723(int arg0) {
        if (arg0 == 17774) {
            field5057++;
            return false;
        } else {
            return true;
        }
    }
}
