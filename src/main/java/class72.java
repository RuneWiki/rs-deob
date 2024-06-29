import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ci")
public abstract class class72 extends class216 {

    @OriginalMember(owner = "client!ci", name = "H", descriptor = "I")
    public static int field1145 = 0;

    @OriginalMember(owner = "client!ci", name = "I", descriptor = "I")
    public static int field1146 = 0;

    @OriginalMember(owner = "client!ci", name = "E", descriptor = "Lbd;")
    public static class162 field1143 = class17.method142(0, "Schlie-8en");

    @OriginalMember(owner = "client!ci", name = "N", descriptor = "[[I")
    public static int[][] field1150 = new int[104][104];

    @OriginalMember(owner = "client!ci", name = "G", descriptor = "[I")
    public static int[] field1144 = new int[] { 1, 0, 0, 0, 1, 0, 2, 1, 1, 1, 0 };

    @OriginalMember(owner = "client!ci", name = "J", descriptor = "I")
    public static int field1147;

    @OriginalMember(owner = "client!ci", name = "L", descriptor = "I")
    public static int field1148;

    @OriginalMember(owner = "client!ci", name = "O", descriptor = "I")
    public static int field1151;

    @OriginalMember(owner = "client!ci", name = "P", descriptor = "I")
    public static int field1152;

    @OriginalMember(owner = "client!ci", name = "Q", descriptor = "I")
    public static int field1153;

    @OriginalMember(owner = "client!ci", name = "R", descriptor = "I")
    public static int field1154;

    @OriginalMember(owner = "client!ci", name = "M", descriptor = "[S")
    public static short[] field1149;

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(Lbd;IZ)V", line = 4)
    public static final void method520(class162 arg0, int arg1, boolean arg2) {
        field1152++;
        if (arg2) {
            if (class117.field2159 && class173.field2991) {
                try {
                    class37.method283(true, client.field1903.field469, "openjs", new Object[] { arg0.method1276(true, class171.field2961.getCodeBase()).toString() });
                    return;
                } catch (Throwable var9) {
                }
            }
            try {
                class171.field2961.getAppletContext().showDocument(arg0.method1276(true, class171.field2961.getCodeBase()), "_blank");
            } catch (Exception var8) {
            }
        } else {
            try {
                class171.field2961.getAppletContext().showDocument(arg0.method1276(true, class171.field2961.getCodeBase()), "_top");
            } catch (Exception var7) {
            }
        }
        int var6 = -118 % ((arg1 + 42) / 47);
    }

    @OriginalMember(owner = "client!ci", name = "b", descriptor = "(II)I", line = 49)
    public static final int method521(int arg0, int arg1) {
        field1154++;
        return arg0 == 28071 ? arg1 >>> 10 : 37;
    }

    @OriginalMember(owner = "client!ci", name = "c", descriptor = "(I)V", line = 92)
    public static void method523(int arg0) {
        field1143 = null;
        field1144 = null;
        field1150 = (int[][]) null;
        if (arg0 != 0) {
            method524((int[]) null, 54);
        }
        field1149 = null;
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "([II)[I", line = 109)
    public static final int[] method524(int[] arg0, int arg1) {
        field1148++;
        if (arg0 == null) {
            return null;
        }
        if (arg1 != -30180) {
            field1145 = -13;
        }
        int[] var2 = new int[arg0.length];
        class161.method1237(arg0, 0, var2, 0, arg0.length);
        return var2;
    }

    @OriginalMember(owner = "client!ci", name = "b", descriptor = "(I)Z")
    public abstract boolean method522(int arg0);

    @OriginalMember(owner = "client!ci", name = "c", descriptor = "(Z)Ljava/lang/Object;")
    public abstract Object method525(boolean arg0);
}
