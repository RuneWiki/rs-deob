import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jn")
public class class86 extends class467 {

    @OriginalMember(owner = "client!jn", name = "s", descriptor = "[I")
    public static int[] field1174 = new int[1];

    @OriginalMember(owner = "client!jn", name = "q", descriptor = "I")
    public static int field1172 = 1;

    @OriginalMember(owner = "client!jn", name = "o", descriptor = "Lsi;")
    public static class512 field1170 = new class512(1, 3);

    @OriginalMember(owner = "client!jn", name = "n", descriptor = "I")
    public static int field1169;

    @OriginalMember(owner = "client!jn", name = "p", descriptor = "I")
    public static int field1171;

    @OriginalMember(owner = "client!jn", name = "t", descriptor = "I")
    public static int field1175;

    @OriginalMember(owner = "client!jn", name = "w", descriptor = "I")
    public static int field1178;

    @OriginalMember(owner = "client!jn", name = "x", descriptor = "I")
    public static int field1179;

    @OriginalMember(owner = "client!jn", name = "r", descriptor = "J")
    public long field1173;

    @OriginalMember(owner = "client!jn", name = "u", descriptor = "Lns;")
    public static class438 field1176;

    @OriginalMember(owner = "client!jn", name = "v", descriptor = "Ljn;")
    public class86 field1177;

    @OriginalMember(owner = "client!jn", name = "y", descriptor = "Ljn;")
    public class86 field1180;

    @OriginalMember(owner = "client!jn", name = "c", descriptor = "(Z)V", line = 10)
    public static void method555(boolean arg0) {
        field1176 = null;
        if (arg0) {
            method555(true);
        }
        field1170 = null;
        field1174 = null;
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(Lns;I)V", line = 23)
    public static final void method556(class438 arg0, int arg1) {
        field1179++;
        class290.field4307 = arg0;
        if (arg1 != 3) {
            method556(null, 85);
        }
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(IIIIIII)V", line = 34)
    public static final void method557(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg5 != 14748) {
            method559(90, null);
        }
        class187[] var7 = class463.field6771;
        for (int var8 = 0; var8 < var7.length; var8++) {
            class187 var9 = var7[var8];
            if (var9 != null && var9.field2631 == 2) {
                class461.method2763(arg4, var9.field2628, arg2 >> 1, -161, arg0 >> 1, var9.field2630, var9.field2624, var9.field2622 * 2, arg1);
                if (class470.field6872[0] > -1 && (class405.field6116 % 20) < 10) {
                    class483.field7036[var9.field2629].method1332(arg6 + class470.field6872[0] - 12, arg3 + -28 + class470.field6872[1]);
                }
            }
        }
        field1169++;
    }

    @OriginalMember(owner = "client!jn", name = "b", descriptor = "(I)Z", line = 65)
    public final boolean method558(int arg0) {
        field1171++;
        if (arg0 == -28) {
            return this.field1180 != null;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(ILjb;)Z", line = 80)
    public static final boolean method559(int arg0, class499 arg1) {
        field1178++;
        if (class397.field6036 == arg1.field7369) {
            class432.field6405 = 250;
            return true;
        } else {
            if (arg0 != 1) {
                method556(null, -15);
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!jn", name = "b", descriptor = "(B)V", line = 106)
    public final void method560(byte arg0) {
        field1175++;
        if (this.field1180 == null) {
            return;
        }
        this.field1180.field1177 = this.field1177;
        this.field1177.field1180 = this.field1180;
        this.field1180 = null;
        this.field1177 = null;
        int var2 = -107 % ((arg0 - 10) / 39);
    }
}
