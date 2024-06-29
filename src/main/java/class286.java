import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eg")
public abstract class class286 extends class86 {

    @OriginalMember(owner = "client!eg", name = "K", descriptor = "[Leg;")
    public class286[] field4880;

    @OriginalMember(owner = "client!eg", name = "G", descriptor = "Z")
    public boolean field4876;

    @OriginalMember(owner = "client!eg", name = "B", descriptor = "Z")
    public static boolean field4871 = true;

    @OriginalMember(owner = "client!eg", name = "A", descriptor = "Z")
    public static boolean field4870 = false;

    @OriginalMember(owner = "client!eg", name = "H", descriptor = "F")
    public static float field4877;

    @OriginalMember(owner = "client!eg", name = "u", descriptor = "I")
    public static int field4864;

    @OriginalMember(owner = "client!eg", name = "v", descriptor = "I")
    public static int field4865;

    @OriginalMember(owner = "client!eg", name = "w", descriptor = "I")
    public static int field4866;

    @OriginalMember(owner = "client!eg", name = "x", descriptor = "I")
    public static int field4867;

    @OriginalMember(owner = "client!eg", name = "y", descriptor = "I")
    public static int field4868;

    @OriginalMember(owner = "client!eg", name = "z", descriptor = "I")
    public int field4869;

    @OriginalMember(owner = "client!eg", name = "C", descriptor = "I")
    public static int field4872;

    @OriginalMember(owner = "client!eg", name = "D", descriptor = "I")
    public static int field4873;

    @OriginalMember(owner = "client!eg", name = "E", descriptor = "I")
    public static int field4874;

    @OriginalMember(owner = "client!eg", name = "F", descriptor = "I")
    public static int field4875;

    @OriginalMember(owner = "client!eg", name = "J", descriptor = "I")
    public static int field4879;

    @OriginalMember(owner = "client!eg", name = "L", descriptor = "I")
    public static int field4881;

    @OriginalMember(owner = "client!eg", name = "M", descriptor = "I")
    public static int field4882;

    @OriginalMember(owner = "client!eg", name = "I", descriptor = "Ldf;")
    public class153 field4878;

    @OriginalMember(owner = "client!eg", name = "t", descriptor = "Lmd;")
    public class237 field4863;

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(III)V", line = 9)
    public final void method1962(int arg0, int arg1, int arg2) {
        field4864++;
        int var4 = ~this.field4869 == arg0 ? arg2 : this.field4869;
        if (this.field4876) {
            this.field4863 = new class237(var4, arg2, arg1);
        } else {
            this.field4878 = new class153(var4, arg2, arg1);
        }
    }

    @OriginalMember(owner = "client!eg", name = "b", descriptor = "(III)[I", line = 40)
    public final int[] method1963(int arg0, int arg1, int arg2) {
        if (arg2 != -1) {
            this.method1962(-118, 53, -94);
        }
        field4872++;
        return this.field4880[arg1].field4876 ? this.field4880[arg1].method14(-104, arg0) : this.field4880[arg1].method16(arg0, (byte) -19)[0];
    }

    @OriginalMember(owner = "client!eg", name = "d", descriptor = "(I)I", line = 63)
    public int method537(int arg0) {
        field4881++;
        return arg0 == -24963 ? -1 : 71;
    }

    @OriginalMember(owner = "client!eg", name = "e", descriptor = "(I)V", line = 92)
    public void method276(int arg0) {
        field4875++;
        if (arg0 != 3) {
            this.field4876 = true;
        }
    }

    @OriginalMember(owner = "client!eg", name = "f", descriptor = "(I)V", line = 110)
    public void method536(int arg0) {
        if (arg0 >= -55) {
            field4871 = false;
        }
        field4873++;
        if (this.field4876) {
            this.field4863.method1584(true);
            this.field4863 = null;
        } else {
            this.field4878.method946(true);
            this.field4878 = null;
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(IB)[[I", line = 141)
    public int[][] method16(int arg0, byte arg1) {
        if (arg1 == -19) {
            field4868++;
            throw new IllegalStateException("This operation does not have a colour output");
        } else {
            return (int[][]) ((int[][]) null);
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(II)[I", line = 152)
    public int[] method14(int arg0, int arg1) {
        if (arg0 > -52) {
            this.field4878 = (class153) null;
        }
        field4865++;
        throw new IllegalStateException("This operation does not have a monochrome output");
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(IIZ)[[I", line = 163)
    public final int[][] method1964(int arg0, int arg1, boolean arg2) {
        if (arg2) {
            return (int[][]) ((int[][]) null);
        }
        field4866++;
        if (this.field4880[arg1].field4876) {
            int[] var4 = this.field4880[arg1].method14(-97, arg0);
            return new int[][] { var4, var4, var4 };
        } else {
            return this.field4880[arg1].method16(arg0, (byte) -19);
        }
    }

    @OriginalMember(owner = "client!eg", name = "<init>", descriptor = "(IZ)V", line = 200)
    public class286(int arg0, boolean arg1) {
        this.field4880 = new class286[arg0];
        this.field4876 = arg1;
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(Z)I", line = 220)
    public static final int method1965(boolean arg0) {
        field4882++;
        return arg0 ? class237.field3963 : 72;
    }

    @OriginalMember(owner = "client!eg", name = "g", descriptor = "(I)I", line = 237)
    public int method1222(int arg0) {
        field4874++;
        if (arg0 >= -98) {
            this.field4863 = (class237) null;
        }
        return -1;
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(Lfe;ZI)V", line = 259)
    public void method19(class229 arg0, boolean arg1, int arg2) {
        field4867++;
        if (arg1) {
            this.method14(-38, 101);
        }
    }
}
