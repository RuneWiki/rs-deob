import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mia")
public class class63 {

    @OriginalMember(owner = "client!mia", name = "k", descriptor = "Z")
    private boolean field883 = false;

    @OriginalMember(owner = "client!mia", name = "l", descriptor = "I")
    private int field884 = -1;

    @OriginalMember(owner = "client!mia", name = "n", descriptor = "[Ljava/lang/String;")
    private String[] field886 = new String[0];

    @OriginalMember(owner = "client!mia", name = "d", descriptor = "I")
    private int field876;

    @OriginalMember(owner = "client!mia", name = "g", descriptor = "I")
    public static int field879 = 0;

    @OriginalMember(owner = "client!mia", name = "a", descriptor = "I")
    public static int field873;

    @OriginalMember(owner = "client!mia", name = "b", descriptor = "I")
    public static int field874;

    @OriginalMember(owner = "client!mia", name = "c", descriptor = "I")
    public static int field875;

    @OriginalMember(owner = "client!mia", name = "e", descriptor = "I")
    public static int field877;

    @OriginalMember(owner = "client!mia", name = "f", descriptor = "I")
    public static int field878;

    @OriginalMember(owner = "client!mia", name = "h", descriptor = "I")
    public static int field880;

    @OriginalMember(owner = "client!mia", name = "i", descriptor = "I")
    public static int field881;

    @OriginalMember(owner = "client!mia", name = "j", descriptor = "I")
    public static int field882;

    @OriginalMember(owner = "client!mia", name = "m", descriptor = "I")
    public static int field885;

    @OriginalMember(owner = "client!mia", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field882++;
        StringBuffer var1 = new StringBuffer();
        var1.append("[");
        for (int var2 = 0; var2 < this.field884; var2++) {
            if (var2 != 0) {
                var1.append(", ");
            }
            var1.append(this.field886[var2]);
        }
        var1.append("]");
        return var1.toString();
    }

    @OriginalMember(owner = "client!mia", name = "a", descriptor = "(ILjava/lang/String;)V")
    public final void method575(int arg0, String arg1) {
        field880++;
        this.method576(91, arg1, this.field884 + arg0);
    }

    @OriginalMember(owner = "client!mia", name = "a", descriptor = "(ILjava/lang/String;I)V")
    private final void method576(int arg0, String arg1, int arg2) {
        if (arg2 > this.field884) {
            this.field884 = arg2;
        }
        field885++;
        int var4 = -31 / ((-arg0 - 72) / 46);
        if (arg2 >= this.field886.length) {
            this.method580(13285, arg2);
        }
        this.field886[arg2] = arg1;
    }

    @OriginalMember(owner = "client!mia", name = "a", descriptor = "(I)I")
    public static final int method577(int arg0) {
        if (arg0 == 28756) {
            field874++;
            return 16;
        } else {
            return 103;
        }
    }

    @OriginalMember(owner = "client!mia", name = "a", descriptor = "(II)I")
    private final int method578(int arg0, int arg1) {
        field878++;
        if (arg0 != 547) {
            return -96;
        }
        int var3 = this.field886.length;
        while (var3 <= arg1) {
            if (!this.field883) {
                var3 += this.field876;
            } else if (var3 == 0) {
                var3 = 1;
            } else {
                var3 = this.field876 * var3;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!mia", name = "a", descriptor = "(III)Z")
    public static final boolean method579(int arg0, int arg1, int arg2) {
        field877++;
        return arg0 == -23611 ? class539.method3093(arg2, 41, arg1) & class257.method1561(arg2, arg1, 81) : false;
    }

    @OriginalMember(owner = "client!mia", name = "b", descriptor = "(II)V")
    private final void method580(int arg0, int arg1) {
        field875++;
        String[] var3 = new String[this.method578(547, arg1)];
        if (arg0 != 13285) {
            method577(-82);
        }
        class135.method993(this.field886, 0, var3, 0, this.field886.length);
        this.field886 = var3;
    }

    @OriginalMember(owner = "client!mia", name = "a", descriptor = "(B)[Ljava/lang/String;")
    public final String[] method581(byte arg0) {
        field873++;
        if (arg0 != -41) {
            this.method581((byte) -58);
        }
        String[] var2 = new String[this.field884 + 1];
        class135.method993(this.field886, 0, var2, 0, this.field884 + 1);
        return var2;
    }

    @OriginalMember(owner = "client!mia", name = "<init>", descriptor = "(IZ)V")
    public class63(int arg0, boolean arg1) {
        this.field883 = arg1;
        this.field876 = arg0;
    }
}
