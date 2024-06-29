import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nd")
public class class505 extends class30 {

    @OriginalMember(owner = "client!nd", name = "F", descriptor = "I")
    private int field6929 = -1;

    @OriginalMember(owner = "client!nd", name = "z", descriptor = "I")
    private int field6923;

    @OriginalMember(owner = "client!nd", name = "A", descriptor = "I")
    public static int field6924;

    @OriginalMember(owner = "client!nd", name = "B", descriptor = "I")
    public static int field6925;

    @OriginalMember(owner = "client!nd", name = "C", descriptor = "I")
    private int field6926;

    @OriginalMember(owner = "client!nd", name = "D", descriptor = "I")
    public static int field6927;

    @OriginalMember(owner = "client!nd", name = "E", descriptor = "I")
    public static int field6928;

    @OriginalMember(owner = "client!nd", name = "I", descriptor = "I")
    public static int field6931;

    @OriginalMember(owner = "client!nd", name = "J", descriptor = "I")
    public static int field6932;

    @OriginalMember(owner = "client!nd", name = "H", descriptor = "[I")
    private int[] field6930;

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "(I)V")
    public final void method290(int arg0) {
        super.method290(26);
        if (arg0 <= 19) {
            this.method290(72);
        }
        ++field6924;
        this.field6930 = null;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(IB)[[I")
    public final int[][] method30(int arg0, byte arg1) {
        ++field6931;
        int[][] var3 = super.field377.method3683(arg0, (byte) -84);
        if (arg1 != 7) {
            return null;
        } else {
            if (super.field377.field9085) {
                int var4 = this.field6923 * (~class148.field2197 == ~this.field6926 ? arg0 : this.field6926 * arg0 / class148.field2197);
                int[] var5 = var3[0];
                int[] var6 = var3[1];
                int[] var7 = var3[2];
                if (~class31.field399 == ~this.field6923) {
                    for (int var8 = 0; var8 < class31.field399; ++var8) {
                        int var9 = this.field6930[var4++];
                        var7[var8] = class136.method950(var9 << 4, 4080);
                        var6[var8] = class136.method950(4080, var9 >> 4);
                        var5[var8] = class136.method950(var9, 16711680) >> 12;
                    }
                } else {
                    for (int var10 = 0; var10 < class31.field399; ++var10) {
                        int var11 = this.field6923 * var10 / class31.field399;
                        int var12 = this.field6930[var4 + var11];
                        var7[var10] = class136.method950(var12 << 4, 4080);
                        var6[var10] = class136.method950(var12, 65280) >> 4;
                        var5[var10] = class136.method950(4080, var12 >> 12);
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(ZII)V")
    public final void method293(boolean arg0, int arg1, int arg2) {
        ++field6932;
        super.method293(arg0, arg1, arg2);
        if (~this.field6929 <= -1 && class400.field5606 != null) {
            int var4 = class400.field5606.method1365(-17951, this.field6929).field9795 ? 64 : 128;
            this.field6930 = class400.field5606.method1366(false, this.field6929, var4, 1.0F, var4, (byte) -73);
            this.field6926 = var4;
            this.field6923 = var4;
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(I)I")
    public final int method289(int arg0) {
        ++field6927;
        if (arg0 != 0) {
            this.method290(105);
        }
        return this.field6929;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(BILac;)V")
    public final void method27(byte arg0, int arg1, class501 arg2) {
        ++field6925;
        if (arg0 >= 100) {
            if (~arg1 == -1) {
                this.field6929 = arg2.method2845(-1);
            }
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(Lor;IIIIIIIIIILma;)V")
    public static final void method2887(class594 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class12 arg11) {
        class442.field6129 = arg6;
        class476.field6555 = arg9;
        ++field6928;
        class596.field8333 = null;
        class689.field9815 = arg5;
        class96.field1343 = arg8;
        class213.field2982 = arg0;
        class700.field9921 = null;
        class254.field3459 = arg1;
        class182.field2637 = arg10;
        class109.field1508 = arg2;
        if (arg3 <= -27) {
            class565.field7758 = arg7;
            class635.field8782 = arg11;
            class683.field9759 = arg4;
            class307.field4241 = null;
            class76.method588(false);
            class339.field4541 = true;
        }
    }

    @OriginalMember(owner = "client!nd", name = "<init>", descriptor = "()V")
    public class505() {
        super(0, false);
    }
}
