import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gl")
public class class627 extends class461 {

    @OriginalMember(owner = "client!gl", name = "P", descriptor = "[[B")
    private byte[][] field8777 = new byte[10][];

    @OriginalMember(owner = "client!gl", name = "O", descriptor = "Ljp;")
    private class376 field8776 = new class376(null);

    @OriginalMember(owner = "client!gl", name = "S", descriptor = "Ljp;")
    private class376 field8780 = new class376(null);

    @OriginalMember(owner = "client!gl", name = "R", descriptor = "Laj;")
    private class333 field8779;

    @OriginalMember(owner = "client!gl", name = "N", descriptor = "I")
    private int field8775;

    @OriginalMember(owner = "client!gl", name = "L", descriptor = "[Z")
    public static boolean[] field8773 = new boolean[100];

    @OriginalMember(owner = "client!gl", name = "F", descriptor = "I")
    public static int field8768;

    @OriginalMember(owner = "client!gl", name = "H", descriptor = "I")
    public static int field8770;

    @OriginalMember(owner = "client!gl", name = "I", descriptor = "I")
    public static int field8771;

    @OriginalMember(owner = "client!gl", name = "K", descriptor = "I")
    private int field8772;

    @OriginalMember(owner = "client!gl", name = "Q", descriptor = "I")
    public static int field8778;

    @OriginalMember(owner = "client!gl", name = "M", descriptor = "Lclient;")
    public static client field8774;

    @OriginalMember(owner = "client!gl", name = "G", descriptor = "[I")
    private int[] field8769;

    @OriginalMember(owner = "client!gl", name = "c", descriptor = "(B)V", line = 6)
    public final void method3528(byte arg0) {
        field8768++;
        if (this.field8769 == null) {
            return;
        }
        if (arg0 != -118) {
            this.field8772 = -18;
        }
        for (int var2 = 0; var2 < 10; var2++) {
            if (this.field8769.length <= this.field8772 + var2) {
                return;
            }
            if (this.field8777[var2] == null && this.field8779.method2120(arg0 - 5123, 0, this.field8769[this.field8772 + var2])) {
                this.field8777[var2] = this.field8779.method2095(0, this.field8769[this.field8772 + var2], 1);
            }
        }
    }

    @OriginalMember(owner = "client!gl", name = "<init>", descriptor = "(ILaj;I)V", line = 38)
    public class627(int arg0, class333 arg1, int arg2) {
        super(arg0);
        this.field8779 = arg1;
        this.field8775 = arg2;
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "([BB)I", line = 50)
    public final int method2724(byte[] arg0, byte arg1) throws IOException {
        field8778++;
        if (this.field8769 == null) {
            if (!this.field8779.method2120(-5241, 0, this.field8775)) {
                return 0;
            }
            byte[] var3 = this.field8779.method2095(0, this.field8775, 1);
            if (var3 == null) {
                throw new IllegalStateException("");
            }
            this.field8780.field5459 = 0;
            this.field8780.field5518 = var3;
            int var4 = var3.length >> 1;
            this.field8769 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field8769[var5] = this.field8780.method2359(-1);
            }
        }
        if (this.field8769.length <= this.field8772) {
            return -1;
        }
        this.method3528((byte) -118);
        if (arg1 >= -3) {
            this.field8777 = null;
        }
        this.field8780.field5518 = arg0;
        this.field8780.field5459 = 0;
        do {
            if (this.field8780.field5459 >= this.field8780.field5518.length) {
                this.field8780.field5518 = null;
                return arg0.length;
            }
            if (this.field8776.field5518 == null) {
                if (this.field8777[0] == null) {
                    this.field8780.field5518 = null;
                    return this.field8780.field5459;
                }
                this.field8776.field5518 = this.field8777[0];
            }
            int var6 = this.field8780.field5518.length - this.field8780.field5459;
            int var7 = this.field8776.field5518.length - this.field8776.field5459;
            if (var6 < var7) {
                this.field8776.method2389(this.field8780.field5459, 689125352, var6, this.field8780.field5518);
                this.field8780.field5518 = null;
                return arg0.length;
            }
            this.field8780.method2403(this.field8776.field5518, var7, 128, this.field8776.field5459);
            this.field8776.field5518 = null;
            this.field8776.field5459 = 0;
            this.field8772++;
            for (int var8 = 0; var8 < 9; var8++) {
                this.field8777[var8] = this.field8777[var8 + 1];
            }
            this.field8777[9] = null;
        } while (this.field8769.length > this.field8772);
        this.field8780.field5518 = null;
        return this.field8780.field5459;
    }

    @OriginalMember(owner = "client!gl", name = "j", descriptor = "(I)V", line = 145)
    public static final void method3529(int arg0) {
        if (class730.field10124.field984 && class245.field3315.field1148 != -1) {
            class57.method408(class245.field3315.field1141, class245.field3315.field1148, false);
        }
        field8771++;
        if (arg0 < 28) {
            field8773 = null;
        }
    }

    @OriginalMember(owner = "client!gl", name = "k", descriptor = "(I)V", line = 159)
    public static void method3530(int arg0) {
        int var1 = 41 / ((64 - arg0) / 33);
        field8774 = null;
        field8773 = null;
    }

    @OriginalMember(owner = "client!gl", name = "l", descriptor = "(I)V", line = 172)
    public static final void method3531(int arg0) {
        if (class458.field6355 == 3) {
            class300.method1901(4, 2);
        } else if (class458.field6355 == 7) {
            class300.method1901(8, 2);
        } else if (class458.field6355 == 10) {
            class300.method1901(11, 2);
        }
        field8770++;
        if (arg0 >= -6) {
            method3529(-11);
        }
    }
}
