import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!si")
public class class474 {

    @OriginalMember(owner = "client!si", name = "c", descriptor = "I")
    private int field6634 = 0;

    @OriginalMember(owner = "client!si", name = "f", descriptor = "I")
    private int field6637 = -1;

    @OriginalMember(owner = "client!si", name = "d", descriptor = "Lsm;")
    private class249 field6635 = new class249();

    @OriginalMember(owner = "client!si", name = "m", descriptor = "Z")
    public boolean field6644 = false;

    @OriginalMember(owner = "client!si", name = "l", descriptor = "I")
    private int field6643;

    @OriginalMember(owner = "client!si", name = "a", descriptor = "I")
    private int field6632;

    @OriginalMember(owner = "client!si", name = "g", descriptor = "[Lno;")
    private class5[] field6638;

    @OriginalMember(owner = "client!si", name = "b", descriptor = "[[[I")
    private int[][][] field6633;

    @OriginalMember(owner = "client!si", name = "j", descriptor = "J")
    public static volatile long field6641 = 0L;

    @OriginalMember(owner = "client!si", name = "e", descriptor = "I")
    public static int field6636;

    @OriginalMember(owner = "client!si", name = "h", descriptor = "I")
    public static int field6639;

    @OriginalMember(owner = "client!si", name = "i", descriptor = "I")
    public static int field6640;

    @OriginalMember(owner = "client!si", name = "k", descriptor = "I")
    public static int field6642;

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(B)V", line = 9)
    public final void method2778(byte arg0) {
        for (int var2 = 0; var2 < this.field6643; var2++) {
            this.field6633[var2][0] = null;
            this.field6633[var2][1] = null;
            this.field6633[var2][2] = null;
            this.field6633[var2] = null;
        }
        field6639++;
        this.field6633 = null;
        this.field6638 = null;
        this.field6635.method1552((byte) 117);
        this.field6635 = null;
        if (arg0 != 97) {
            this.method2779((byte) 10);
        }
    }

    @OriginalMember(owner = "client!si", name = "<init>", descriptor = "(III)V", line = 149)
    public class474(int arg0, int arg1, int arg2) {
        this.field6643 = arg0;
        this.field6632 = arg1;
        this.field6638 = new class5[this.field6632];
        this.field6633 = new int[this.field6643][3][arg2];
    }

    @OriginalMember(owner = "client!si", name = "b", descriptor = "(B)[[[I", line = 38)
    public final int[][][] method2779(byte arg0) {
        field6636++;
        if (this.field6643 != this.field6632) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        int var2 = -56 % ((11 - arg0) / 52);
        for (int var3 = 0; var3 < this.field6643; var3++) {
            this.field6638[var3] = class18.field301;
        }
        return this.field6633;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(ZI)[[I", line = 71)
    public final int[][] method2780(boolean arg0, int arg1) {
        field6640++;
        if (arg0) {
            return null;
        } else if (this.field6643 == this.field6632) {
            this.field6644 = this.field6638[arg1] == null;
            this.field6638[arg1] = class18.field301;
            return this.field6633[arg1];
        } else if (this.field6643 == 1) {
            this.field6644 = this.field6637 != arg1;
            this.field6637 = arg1;
            return this.field6633[0];
        } else {
            class5 var3 = this.field6638[arg1];
            if (var3 == null) {
                this.field6644 = true;
                if (this.field6634 >= this.field6643) {
                    class5 var4 = (class5) this.field6635.method1545(-98);
                    var3 = new class5(arg1, var4.field104);
                    this.field6638[var4.field106] = null;
                    var4.method1182(28818);
                } else {
                    var3 = new class5(arg1, this.field6634);
                    this.field6634++;
                }
                this.field6638[arg1] = var3;
            } else {
                this.field6644 = false;
            }
            this.field6635.method1541((byte) -36, var3);
            return this.field6633[var3.field104];
        }
    }
}
