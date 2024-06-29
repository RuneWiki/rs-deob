import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jr")
public class class134 extends class178 implements class492 {

    @OriginalMember(owner = "client!jr", name = "A", descriptor = "[I")
    public static int[] field1905 = new int[5];

    @OriginalMember(owner = "client!jr", name = "F", descriptor = "Lsga;")
    public static class651 field1909 = new class651();

    @OriginalMember(owner = "client!jr", name = "B", descriptor = "I")
    public static int field1906;

    @OriginalMember(owner = "client!jr", name = "C", descriptor = "I")
    public static int field1907;

    @OriginalMember(owner = "client!jr", name = "D", descriptor = "I")
    public static int field1908;

    @OriginalMember(owner = "client!jr", name = "G", descriptor = "I")
    public static int field1910;

    @OriginalMember(owner = "client!jr", name = "H", descriptor = "I")
    public static int field1911;

    @OriginalMember(owner = "client!jr", name = "<init>", descriptor = "(Lhj;IZ[[I)V")
    public class134(class47 arg0, int arg1, boolean arg2, int[][] arg3) {
        super(arg0, 34067, class623.field8394, class38.field472, arg1 * arg1 * 6, arg2);
        super.field2431.method1458(399403340, this);
        if (!arg2) {
            for (int var5 = 0; var5 < 6; ++var5) {
                OpenGL.glTexImage2Di(var5 + 34069, 0, this.method1122(127), arg1, arg1, 0, class71.method547(super.field2442, -8807), super.field2431.field716, arg3[var5], 0);
            }
        } else {
            for (int var6 = 0; var6 < 6; ++var6) {
                this.method1123(true, arg1, arg1, var6 + 34069, arg3[var6]);
            }
        }
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(II)I")
    public static int method848(int arg0, int arg1) {
        return arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(Ljava/lang/String;I)Z")
    public static final boolean method849(String arg0, int arg1) {
        if (arg1 != 0) {
            return true;
        } else {
            ++field1907;
            return class328.method2098(arg0, (byte) -128, true, 10);
        }
    }

    @OriginalMember(owner = "client!jr", name = "b", descriptor = "(II)I")
    public static final int method850(int arg0, int arg1) {
        ++field1910;
        return arg1 != 200 ? 47 : arg0 & 255;
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(III)Luda;")
    public static final class441 method851(int arg0, int arg1, int arg2) {
        class262 var3 = class137.field1948[arg0][arg1][arg2];
        return var3 != null && var3.field3844 != null ? var3.field3844 : null;
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(I)V")
    public static void method852(int arg0) {
        if (arg0 < 30) {
            method852(17);
        }
        field1909 = null;
        field1905 = null;
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(ZI)I")
    public static final int method853(boolean arg0, int arg1) {
        ++field1906;
        int var2 = (arg1 >>> 1 & 1431655765) + (1431655765 & arg1);
        if (!arg0) {
            method849((String) null, -128);
        }
        int var3 = (-214748365 & var2 >>> 2) + (var2 & 858993459);
        int var4 = 252645135 & (var3 >>> 4) + var3;
        int var5 = (var4 >>> 8) + var4;
        int var6 = (var5 >>> 16) + var5;
        return var6 & 255;
    }
}
