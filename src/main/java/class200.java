import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lia")
public class class200 {

    @OriginalMember(owner = "client!lia", name = "k", descriptor = "[Ljava/lang/String;")
    private String[] field2782 = new String[0];

    @OriginalMember(owner = "client!lia", name = "h", descriptor = "I")
    private int field2779 = -1;

    @OriginalMember(owner = "client!lia", name = "a", descriptor = "Z")
    private boolean field2772 = false;

    @OriginalMember(owner = "client!lia", name = "f", descriptor = "I")
    private int field2777;

    @OriginalMember(owner = "client!lia", name = "b", descriptor = "[I")
    public static int[] field2773 = new int[3];

    @OriginalMember(owner = "client!lia", name = "c", descriptor = "I")
    public static int field2774;

    @OriginalMember(owner = "client!lia", name = "d", descriptor = "I")
    public static int field2775;

    @OriginalMember(owner = "client!lia", name = "e", descriptor = "I")
    public static int field2776;

    @OriginalMember(owner = "client!lia", name = "g", descriptor = "I")
    public static int field2778;

    @OriginalMember(owner = "client!lia", name = "i", descriptor = "I")
    public static int field2780;

    @OriginalMember(owner = "client!lia", name = "j", descriptor = "I")
    public static int field2781;

    @OriginalMember(owner = "client!lia", name = "l", descriptor = "Lho;")
    public static class222 field2783;

    @OriginalMember(owner = "client!lia", name = "a", descriptor = "(BI)V")
    private final void method1365(byte arg0, int arg1) {
        field2780++;
        if (arg0 >= -17) {
            this.field2782 = null;
        }
        String[] var3 = new String[this.method1368((byte) 54, arg1)];
        class642.method3474(this.field2782, 0, var3, 0, this.field2782.length);
        this.field2782 = var3;
    }

    @OriginalMember(owner = "client!lia", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field2778++;
        StringBuffer var1 = new StringBuffer();
        var1.append("[");
        for (int var2 = 0; var2 < this.field2779; var2++) {
            if (var2 != 0) {
                var1.append(", ");
            }
            var1.append(this.field2782[var2]);
        }
        var1.append("]");
        return var1.toString();
    }

    @OriginalMember(owner = "client!lia", name = "a", descriptor = "(BLjava/lang/String;)V")
    public final void method1366(byte arg0, String arg1) {
        if (arg0 != -47) {
            this.method1368((byte) -128, -31);
        }
        field2781++;
        this.method1367(this.field2779 + 1, arg1, 117);
    }

    @OriginalMember(owner = "client!lia", name = "a", descriptor = "(ILjava/lang/String;I)V")
    private final void method1367(int arg0, String arg1, int arg2) {
        if (arg2 <= 104) {
            this.toString();
        }
        if (this.field2779 < arg0) {
            this.field2779 = arg0;
        }
        field2775++;
        if (arg0 >= this.field2782.length) {
            this.method1365((byte) -94, arg0);
        }
        this.field2782[arg0] = arg1;
    }

    @OriginalMember(owner = "client!lia", name = "b", descriptor = "(BI)I")
    private final int method1368(byte arg0, int arg1) {
        if (arg0 != 54) {
            this.method1367(5, null, -39);
        }
        field2774++;
        int var3 = this.field2782.length;
        while (var3 <= arg1) {
            if (!this.field2772) {
                var3 += this.field2777;
            } else if (var3 == 0) {
                var3 = 1;
            } else {
                var3 = this.field2777 * var3;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!lia", name = "a", descriptor = "(I)V")
    public static void method1369(int arg0) {
        if (arg0 == 0) {
            field2783 = null;
            field2773 = null;
        }
    }

    @OriginalMember(owner = "client!lia", name = "b", descriptor = "(I)[Ljava/lang/String;")
    public final String[] method1370(int arg0) {
        field2776++;
        if (arg0 == 3) {
            String[] var2 = new String[this.field2779 + 1];
            class642.method3474(this.field2782, 0, var2, 0, this.field2779 + 1);
            return var2;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!lia", name = "<init>", descriptor = "(IZ)V")
    public class200(int arg0, boolean arg1) {
        this.field2772 = arg1;
        this.field2777 = arg0;
    }
}
