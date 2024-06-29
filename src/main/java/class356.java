import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uj")
public class class356 {

    @OriginalMember(owner = "client!uj", name = "g", descriptor = "Z")
    private boolean field4584 = false;

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "[Ljava/lang/String;")
    private String[] field4578 = new String[0];

    @OriginalMember(owner = "client!uj", name = "f", descriptor = "I")
    private int field4583 = -1;

    @OriginalMember(owner = "client!uj", name = "e", descriptor = "I")
    private int field4582;

    @OriginalMember(owner = "client!uj", name = "j", descriptor = "[I")
    public static int[] field4587 = new int[25];

    @OriginalMember(owner = "client!uj", name = "h", descriptor = "Lcga;")
    public static class449 field4585 = new class449(59, -1);

    @OriginalMember(owner = "client!uj", name = "n", descriptor = "I")
    public static int field4591 = 0;

    @OriginalMember(owner = "client!uj", name = "m", descriptor = "I")
    public static int field4590 = 0;

    @OriginalMember(owner = "client!uj", name = "o", descriptor = "Luc;")
    public static class27 field4592 = new class27(13, 6);

    @OriginalMember(owner = "client!uj", name = "r", descriptor = "I")
    public static int field4595 = 0;

    @OriginalMember(owner = "client!uj", name = "q", descriptor = "[[I")
    public static int[][] field4594 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 3, 5, 6, 4 }, { 0, 1, 4, 5 }, { 4, 6, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 1, 2, 4, 6, 7 }, { 4, 7, 6, 0 }, { 0, 8, 6, 1, 9, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 3, 7, 10, 10, 6, 6 }, { 2, 4, 6, 0 } };

    @OriginalMember(owner = "client!uj", name = "p", descriptor = "Lcga;")
    public static class449 field4593 = new class449(18, 8);

    @OriginalMember(owner = "client!uj", name = "b", descriptor = "I")
    public static int field4579;

    @OriginalMember(owner = "client!uj", name = "c", descriptor = "I")
    public static int field4580;

    @OriginalMember(owner = "client!uj", name = "d", descriptor = "I")
    public static int field4581;

    @OriginalMember(owner = "client!uj", name = "i", descriptor = "I")
    public static int field4586;

    @OriginalMember(owner = "client!uj", name = "k", descriptor = "I")
    public static int field4588;

    @OriginalMember(owner = "client!uj", name = "l", descriptor = "I")
    public static int field4589;

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(ILjava/lang/String;)V", line = 5)
    public final void method2031(int arg0, String arg1) {
        if (arg0 > -74) {
            this.method2035(-125);
        }
        this.method2034(arg1, this.field4583 + 1, 2);
        field4579++;
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(II)I", line = 18)
    private final int method2032(int arg0, int arg1) {
        field4580++;
        int var3 = this.field4578.length;
        while (var3 <= arg0) {
            if (!this.field4584) {
                var3 += this.field4582;
            } else if (var3 == 0) {
                var3 = 1;
            } else {
                var3 = this.field4582 * var3;
            }
        }
        if (arg1 != -1) {
            this.method2035(16);
        }
        return var3;
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(B)V", line = 46)
    public static void method2033(byte arg0) {
        field4592 = null;
        field4587 = null;
        field4594 = null;
        field4593 = null;
        field4585 = null;
        if (arg0 <= 85) {
            field4591 = -110;
        }
    }

    @OriginalMember(owner = "client!uj", name = "toString", descriptor = "()Ljava/lang/String;", line = 65)
    public final String toString() {
        field4589++;
        StringBuffer var1 = new StringBuffer();
        var1.append("[");
        for (int var2 = 0; var2 < this.field4583; var2++) {
            if (var2 != 0) {
                var1.append(", ");
            }
            var1.append(this.field4578[var2]);
        }
        var1.append("]");
        return var1.toString();
    }

    @OriginalMember(owner = "client!uj", name = "<init>", descriptor = "(IZ)V", line = 150)
    public class356(int arg0, boolean arg1) {
        this.field4582 = arg0;
        this.field4584 = arg1;
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(Ljava/lang/String;II)V", line = 113)
    private final void method2034(String arg0, int arg1, int arg2) {
        field4586++;
        if (this.field4583 < arg1) {
            this.field4583 = arg1;
        }
        if (this.field4578.length <= arg1) {
            this.method2036(arg1, (byte) 64);
        }
        if (arg2 != 2) {
            this.method2035(88);
        }
        this.field4578[arg1] = arg0;
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(I)[Ljava/lang/String;", line = 133)
    public final String[] method2035(int arg0) {
        field4581++;
        if (arg0 == 6) {
            String[] var2 = new String[this.field4583 + 1];
            class70.method553(this.field4578, 0, var2, 0, this.field4583 + 1);
            return var2;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(IB)V", line = 165)
    private final void method2036(int arg0, byte arg1) {
        field4588++;
        if (arg1 >= 34) {
            String[] var3 = new String[this.method2032(arg0, -1)];
            class70.method553(this.field4578, 0, var3, 0, this.field4578.length);
            this.field4578 = var3;
        }
    }
}
