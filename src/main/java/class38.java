import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vba")
public class class38 {

    @OriginalMember(owner = "client!vba", name = "a", descriptor = "I")
    private int field564 = -1;

    @OriginalMember(owner = "client!vba", name = "j", descriptor = "I")
    private int field573 = 0;

    @OriginalMember(owner = "client!vba", name = "h", descriptor = "Lgj;")
    private class593 field571 = new class593();

    @OriginalMember(owner = "client!vba", name = "p", descriptor = "Z")
    public boolean field579 = false;

    @OriginalMember(owner = "client!vba", name = "o", descriptor = "I")
    private int field578;

    @OriginalMember(owner = "client!vba", name = "m", descriptor = "I")
    private int field576;

    @OriginalMember(owner = "client!vba", name = "i", descriptor = "[Llh;")
    private class492[] field572;

    @OriginalMember(owner = "client!vba", name = "c", descriptor = "[[I")
    private int[][] field566;

    @OriginalMember(owner = "client!vba", name = "b", descriptor = "[I")
    public static int[] field565 = new int[8];

    @OriginalMember(owner = "client!vba", name = "k", descriptor = "[J")
    public static long[] field574 = new long[32];

    @OriginalMember(owner = "client!vba", name = "l", descriptor = "F")
    public static float field575;

    @OriginalMember(owner = "client!vba", name = "d", descriptor = "I")
    public static int field567;

    @OriginalMember(owner = "client!vba", name = "e", descriptor = "I")
    public static int field568;

    @OriginalMember(owner = "client!vba", name = "f", descriptor = "I")
    public static int field569;

    @OriginalMember(owner = "client!vba", name = "n", descriptor = "I")
    public static int field577;

    @OriginalMember(owner = "client!vba", name = "g", descriptor = "Lsba;")
    public static class204 field570;

    @OriginalMember(owner = "client!vba", name = "a", descriptor = "(B)[[I", line = 4)
    public final int[][] method294(byte arg0) {
        field567++;
        if (this.field578 != this.field576) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        if (arg0 < 63) {
            this.field573 = 98;
        }
        for (int var2 = 0; var2 < this.field578; var2++) {
            this.field572[var2] = class679.field9576;
        }
        return this.field566;
    }

    @OriginalMember(owner = "client!vba", name = "b", descriptor = "(B)V", line = 27)
    public final void method295(byte arg0) {
        for (int var2 = 0; var2 < this.field578; var2++) {
            this.field566[var2] = null;
        }
        field577++;
        this.field572 = null;
        if (arg0 != -119) {
            this.method298(31, 81);
        }
        this.field566 = null;
        this.field571.method3255((byte) -80);
        this.field571 = null;
    }

    @OriginalMember(owner = "client!vba", name = "c", descriptor = "(B)V", line = 48)
    public static void method296(byte arg0) {
        field565 = null;
        field570 = null;
        field574 = null;
        if (arg0 != 63) {
            field570 = null;
        }
    }

    @OriginalMember(owner = "client!vba", name = "a", descriptor = "([II[Ljava/lang/Object;)V", line = 62)
    public static final void method297(int[] arg0, int arg1, Object[] arg2) {
        class127.method975(arg0, false, 0, arg0.length - 1, arg2);
        if (arg1 == -32153) {
            field569++;
        }
    }

    @OriginalMember(owner = "client!vba", name = "<init>", descriptor = "(III)V", line = 170)
    public class38(int arg0, int arg1, int arg2) {
        this.field578 = arg0;
        this.field576 = arg1;
        this.field572 = new class492[this.field576];
        this.field566 = new int[this.field578][arg2];
    }

    @OriginalMember(owner = "client!vba", name = "a", descriptor = "(II)[I", line = 102)
    public final int[] method298(int arg0, int arg1) {
        field568++;
        int var3 = 80 / ((arg1 + 71) / 41);
        if (this.field578 == this.field576) {
            this.field579 = this.field572[arg0] == null;
            this.field572[arg0] = class679.field9576;
            return this.field566[arg0];
        } else if (this.field578 == 1) {
            this.field579 = this.field564 != arg0;
            this.field564 = arg0;
            return this.field566[0];
        } else {
            class492 var4 = this.field572[arg0];
            if (var4 == null) {
                this.field579 = true;
                if (this.field578 > this.field573) {
                    var4 = new class492(arg0, this.field573);
                    this.field573++;
                } else {
                    class492 var5 = (class492) this.field571.method3264((byte) 72);
                    var4 = new class492(arg0, var5.field6630);
                    this.field572[var5.field6631] = null;
                    var5.method2797(104);
                }
                this.field572[arg0] = var4;
            } else {
                this.field579 = false;
            }
            this.field571.method3258(var4, 0);
            return this.field566[var4.field6630];
        }
    }
}
