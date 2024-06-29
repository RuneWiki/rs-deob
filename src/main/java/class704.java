import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!waa")
public class class704 {

    @OriginalMember(owner = "client!waa", name = "g", descriptor = "I")
    private int field9761 = 0;

    @OriginalMember(owner = "client!waa", name = "n", descriptor = "I")
    private int field9768 = -1;

    @OriginalMember(owner = "client!waa", name = "k", descriptor = "Lro;")
    private class2 field9765 = new class2();

    @OriginalMember(owner = "client!waa", name = "o", descriptor = "Z")
    public boolean field9769 = false;

    @OriginalMember(owner = "client!waa", name = "j", descriptor = "I")
    private int field9764;

    @OriginalMember(owner = "client!waa", name = "h", descriptor = "I")
    private int field9762;

    @OriginalMember(owner = "client!waa", name = "a", descriptor = "[[[I")
    private int[][][] field9755;

    @OriginalMember(owner = "client!waa", name = "d", descriptor = "[Lbo;")
    private class731[] field9758;

    @OriginalMember(owner = "client!waa", name = "i", descriptor = "Lhda;")
    public static class752 field9763 = new class752(69, 4);

    @OriginalMember(owner = "client!waa", name = "l", descriptor = "I")
    public static int field9766 = 0;

    @OriginalMember(owner = "client!waa", name = "b", descriptor = "I")
    public static int field9756;

    @OriginalMember(owner = "client!waa", name = "c", descriptor = "I")
    public static int field9757;

    @OriginalMember(owner = "client!waa", name = "e", descriptor = "I")
    public static int field9759;

    @OriginalMember(owner = "client!waa", name = "f", descriptor = "I")
    public static int field9760;

    @OriginalMember(owner = "client!waa", name = "m", descriptor = "I")
    public static int field9767;

    @OriginalMember(owner = "client!waa", name = "p", descriptor = "I")
    public static int field9770;

    @OriginalMember(owner = "client!waa", name = "a", descriptor = "(I)V", line = 3)
    public static void method3959(int arg0) {
        field9763 = null;
        if (arg0 < 113) {
            method3959(-100);
        }
    }

    @OriginalMember(owner = "client!waa", name = "b", descriptor = "(I)[[[I", line = 15)
    public final int[][][] method3960(int arg0) {
        field9757++;
        if (this.field9764 != this.field9762) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        if (arg0 != -23295) {
            this.method3963(90, 110);
        }
        for (int var2 = 0; var2 < this.field9762; var2++) {
            this.field9758[var2] = class77.field935;
        }
        return this.field9755;
    }

    @OriginalMember(owner = "client!waa", name = "c", descriptor = "(I)V", line = 37)
    public final void method3961(int arg0) {
        field9760++;
        for (int var2 = 0; var2 < this.field9762; var2++) {
            this.field9755[var2][0] = null;
            this.field9755[var2][1] = null;
            this.field9755[var2][2] = null;
            this.field9755[var2] = null;
        }
        this.field9755 = null;
        if (arg0 != -6948) {
            this.method3963(18, 45);
        }
        this.field9758 = null;
        this.field9765.method23(10);
        this.field9765 = null;
    }

    @OriginalMember(owner = "client!waa", name = "d", descriptor = "(I)V", line = 78)
    public static final void method3962(int arg0) {
        if (arg0 != 0) {
            return;
        }
        field9756++;
        if (class349.field4916 != null) {
            class349.field4916.method487(100);
            class282.field3995 = null;
            class349.field4916 = null;
        }
    }

    @OriginalMember(owner = "client!waa", name = "<init>", descriptor = "(III)V", line = 182)
    public class704(int arg0, int arg1, int arg2) {
        this.field9764 = arg1;
        this.field9762 = arg0;
        this.field9755 = new int[this.field9762][3][arg2];
        this.field9758 = new class731[this.field9764];
    }

    @OriginalMember(owner = "client!waa", name = "a", descriptor = "(II)[[I", line = 101)
    public final int[][] method3963(int arg0, int arg1) {
        if (arg0 != 1) {
            this.method3963(-32, 90);
        }
        field9759++;
        if (this.field9764 == this.field9762) {
            this.field9769 = this.field9758[arg1] == null;
            this.field9758[arg1] = class77.field935;
            return this.field9755[arg1];
        } else if (this.field9762 == 1) {
            this.field9769 = this.field9768 != arg1;
            this.field9768 = arg1;
            return this.field9755[0];
        } else {
            class731 var3 = this.field9758[arg1];
            if (var3 == null) {
                this.field9769 = true;
                if (this.field9762 <= this.field9761) {
                    class731 var4 = (class731) this.field9765.method12(0);
                    var3 = new class731(arg1, var4.field10135);
                    this.field9758[var4.field10138] = null;
                    var4.method3564(true);
                } else {
                    var3 = new class731(arg1, this.field9761);
                    this.field9761++;
                }
                this.field9758[arg1] = var3;
            } else {
                this.field9769 = false;
            }
            this.field9765.method13(var3, arg0 ^ 0x250);
            return this.field9755[var3.field10135];
        }
    }
}
