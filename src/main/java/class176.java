import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public class class176 {

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "Lia;")
    private class27 field2194;

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "I")
    public int field2195;

    @OriginalMember(owner = "client!ne", name = "f", descriptor = "[I")
    public static int[] field2198 = new int[13];

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "I")
    public static int field2193;

    @OriginalMember(owner = "client!ne", name = "e", descriptor = "I")
    public static int field2197;

    @OriginalMember(owner = "client!ne", name = "g", descriptor = "I")
    public static int field2199;

    @OriginalMember(owner = "client!ne", name = "d", descriptor = "[[I")
    public static int[][] field2196;

    @OriginalMember(owner = "client!ne", name = "finalize", descriptor = "()V", line = 4)
    protected final void finalize() throws Throwable {
        this.field2194.method215(29126, this.field2195);
        field2197++;
        super.finalize();
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(IIIZI)V", line = 14)
    public static final void method1185(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        if (arg2 >= class165.field2061 && arg2 <= class99.field1309) {
            int var5 = class650.method3574(class641.field8924, class265.field3552, arg0, 123);
            int var6 = class650.method3574(class641.field8924, class265.field3552, arg4, 127);
            class31.method257(arg1, var6, -1, var5, arg2);
        }
        field2193++;
        if (!arg3) {
            method1187(true);
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(IB)V", line = 42)
    public static final void method1186(int arg0, byte arg1) {
        class513.field6721 = -1;
        class414.field5328 = 3;
        class273.field3599 = 100;
        class215.field2773 = arg0;
        if (arg1 != -115) {
            method1185(62, -8, 42, false, 88);
        }
        field2199++;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(Z)V", line = 57)
    public static void method1187(boolean arg0) {
        field2198 = null;
        field2196 = null;
        if (arg0) {
            method1185(-67, -9, -37, true, 21);
        }
    }

    @OriginalMember(owner = "client!ne", name = "<init>", descriptor = "(Lia;II)V", line = 68)
    public class176(class27 arg0, int arg1, int arg2) {
        this.field2194 = arg0;
        this.field2195 = arg2;
    }
}
