import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vj")
public class class153 extends class206 {

    @OriginalMember(owner = "client!vj", name = "r", descriptor = "[J")
    private long[] field2787 = new long[10];

    @OriginalMember(owner = "client!vj", name = "w", descriptor = "I")
    private int field2792 = 1;

    @OriginalMember(owner = "client!vj", name = "v", descriptor = "I")
    private int field2791 = 256;

    @OriginalMember(owner = "client!vj", name = "u", descriptor = "I")
    private int field2790 = 0;

    @OriginalMember(owner = "client!vj", name = "s", descriptor = "J")
    private long field2788 = class164.method1183((byte) 80);

    @OriginalMember(owner = "client!vj", name = "t", descriptor = "I")
    public static int field2789 = 3353893;

    @OriginalMember(owner = "client!vj", name = "y", descriptor = "Lvf;")
    public static class48 field2794 = new class48();

    @OriginalMember(owner = "client!vj", name = "H", descriptor = "I")
    public static int field2803 = 0;

    @OriginalMember(owner = "client!vj", name = "I", descriptor = "Z")
    public static boolean field2804 = false;

    @OriginalMember(owner = "client!vj", name = "x", descriptor = "I")
    public static int field2793;

    @OriginalMember(owner = "client!vj", name = "z", descriptor = "I")
    public static int field2795;

    @OriginalMember(owner = "client!vj", name = "A", descriptor = "I")
    public static int field2796;

    @OriginalMember(owner = "client!vj", name = "B", descriptor = "I")
    private int field2797;

    @OriginalMember(owner = "client!vj", name = "C", descriptor = "I")
    public static int field2798;

    @OriginalMember(owner = "client!vj", name = "D", descriptor = "I")
    public static int field2799;

    @OriginalMember(owner = "client!vj", name = "E", descriptor = "I")
    public static int field2800;

    @OriginalMember(owner = "client!vj", name = "G", descriptor = "I")
    public static int field2802;

    @OriginalMember(owner = "client!vj", name = "F", descriptor = "[Lve;")
    public static class174[] field2801;

    @OriginalMember(owner = "client!vj", name = "b", descriptor = "(I)V")
    public static final void method1117(int arg0) {
        class164.field2952.method1554((byte) -109);
        if (arg0 == 300) {
            field2793++;
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(IIB)I")
    public final int method12(int arg0, int arg1, byte arg2) {
        field2795++;
        int var4 = this.field2791;
        int var5 = this.field2792;
        this.field2791 = 300;
        this.field2792 = 1;
        this.field2788 = class164.method1183((byte) 80);
        if (this.field2787[this.field2797] == 0L) {
            this.field2792 = var5;
            this.field2791 = var4;
        } else if (this.field2787[this.field2797] < this.field2788) {
            this.field2791 = (int) ((long) (arg1 * 2560) / (this.field2788 - this.field2787[this.field2797]));
        }
        if (this.field2791 < 25) {
            this.field2791 = 25;
        }
        if (this.field2791 > 256) {
            this.field2791 = 256;
            this.field2792 = (int) ((long) arg1 - ((this.field2788 - this.field2787[this.field2797]) / 10L));
        }
        if (arg1 < this.field2792) {
            this.field2792 = arg1;
        }
        this.field2787[this.field2797] = this.field2788;
        this.field2797 = (this.field2797 + 1) % 10;
        if (arg2 >= -79) {
            return -30;
        }
        if (this.field2792 > 1) {
            for (int var6 = 0; var6 < 10; var6++) {
                if (this.field2787[var6] != 0L) {
                    this.field2787[var6] += (long) this.field2792;
                }
            }
        }
        int var7 = 0;
        if (this.field2792 < arg0) {
            this.field2792 = arg0;
        }
        class234.method1603((long) this.field2792, -114);
        while (this.field2790 < 256) {
            var7++;
            this.field2790 += this.field2791;
        }
        this.field2790 &= 0xFF;
        return var7;
    }

    @OriginalMember(owner = "client!vj", name = "c", descriptor = "(I)V")
    public static void method1118(int arg0) {
        field2801 = null;
        field2794 = null;
        if (arg0 <= 113) {
            field2802 = -79;
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(B)V")
    public final void method13(byte arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            this.field2787[var2] = 0L;
        }
        int var3 = -42 / ((-arg0 - 28) / 61);
        field2800++;
    }

    @OriginalMember(owner = "client!vj", name = "b", descriptor = "(II)Lsb;")
    public static final class98 method1119(int arg0, int arg1) {
        field2799++;
        int var2 = -89 / ((arg0 - 16) / 53);
        class98 var3 = new class98();
        var3.field1733 = new byte[arg1];
        var3.field1694 = 0;
        return var3;
    }

    @OriginalMember(owner = "client!vj", name = "<init>", descriptor = "()V")
    public class153() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field2787[var1] = this.field2788;
        }
    }
}
