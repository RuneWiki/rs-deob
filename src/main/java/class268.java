import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ee")
public class class268 extends class226 {

    @OriginalMember(owner = "client!ee", name = "A", descriptor = "[J")
    private long[] field4761 = new long[10];

    @OriginalMember(owner = "client!ee", name = "v", descriptor = "I")
    private int field4756 = 0;

    @OriginalMember(owner = "client!ee", name = "y", descriptor = "I")
    private int field4759 = 256;

    @OriginalMember(owner = "client!ee", name = "o", descriptor = "I")
    private int field4749 = 1;

    @OriginalMember(owner = "client!ee", name = "t", descriptor = "J")
    private long field4754 = class201.method1419(5);

    @OriginalMember(owner = "client!ee", name = "w", descriptor = "[I")
    public static int[] field4757 = new int[] { 0, 0, 5, 0, 0, 0, 4, 0, 0, 0, 0, -2, 0, 10, 0, 0, 5, 0, 1, 0, 0, 2, 0, 0, 0, 0, 6, 0, 4, 0, 0, 0, 0, 0, 0, 3, 0, 0, 0, -1, 2, 0, 20, 0, 0, -1, 9, 0, 0, 0, 0, 2, 0, 0, 0, 2, 2, 5, 0, 0, -2, -1, 15, 7, 0, 0, 0, -2, 0, -1, 3, 7, -2, 0, 0, 10, 0, -1, 0, -2, -2, 0, 0, 0, 0, 0, -1, 4, 0, 0, 0, 6, 0, 14, 0, -1, 1, 0, 5, 8, 0, 0, -2, 6, 0, -2, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 6, 0, -1, 0, 7, 0, 0, 0, 0, 0, 8, 0, 0, 0, 0, 0, 0, -1, 10, 0, 0, 12, 0, 0, 0, 0, 0, 2, 0, 0, 0, 3, 0, 0, 0, 14, -2, 10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, -2, -1, 6, 0, 0, 0, 0, 0, 0, 6, 0, 0, -2, 0, 0, 3, 1, 0, -1, 0, 0, 0, 0, 0, 0, 8, 0, 6, 0, 8, -2, 0, 0, 0, 4, 0, 15, 0, 0, 9, 6, -1, 0, 0, 0, 0, 1, 0, 5, 0, 0, 0, 8, 6, 0, 0, 4, 0, 7, 5, 0, 0, 24, 8, 5, 3, 12, 0, 0, 10, 0, 0, 0, -1, 1, 0, 0, 0, 0, 2, 0, 6, -2 };

    @OriginalMember(owner = "client!ee", name = "q", descriptor = "I")
    public static int field4751 = 5063219;

    @OriginalMember(owner = "client!ee", name = "p", descriptor = "[I")
    public static int[] field4750 = new int[200];

    @OriginalMember(owner = "client!ee", name = "x", descriptor = "I")
    public static int field4758 = 0;

    @OriginalMember(owner = "client!ee", name = "z", descriptor = "I")
    public static int field4760 = 0;

    @OriginalMember(owner = "client!ee", name = "r", descriptor = "I")
    public static int field4752;

    @OriginalMember(owner = "client!ee", name = "s", descriptor = "I")
    public static int field4753;

    @OriginalMember(owner = "client!ee", name = "u", descriptor = "I")
    public static int field4755;

    @OriginalMember(owner = "client!ee", name = "B", descriptor = "I")
    public static int field4762;

    @OriginalMember(owner = "client!ee", name = "D", descriptor = "I")
    private int field4764;

    @OriginalMember(owner = "client!ee", name = "C", descriptor = "[[[I")
    public static int[][][] field4763;

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(IIIIBII)V")
    public static final void method1845(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6) {
        field4755++;
        int var7 = arg0 + arg2;
        int var8 = arg1 - arg0;
        int var9 = arg5 + arg0;
        int var10 = arg6 - arg0;
        for (int var11 = arg2; var11 < var7; var11++) {
            class182.method1311(arg3, arg6, true, class66.field1254[var11], arg5);
        }
        for (int var12 = arg1; var12 > var8; var12--) {
            class182.method1311(arg3, arg6, true, class66.field1254[var12], arg5);
        }
        int var13 = 111 % ((13 - arg4) / 58);
        for (int var14 = var7; var14 <= var8; var14++) {
            int[] var15 = class66.field1254[var14];
            class182.method1311(arg3, var9, true, var15, arg5);
            class182.method1311(arg3, arg6, true, var15, var10);
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(II)V")
    public static final void method1846(int arg0, int arg1) {
        if (~arg1 == arg0 && !class110.field1978) {
            class7.method72(-94);
        } else if (arg1 != -1 && (class106.field1927 != arg1 || !class238.method1672(119)) && class16.field365 != 0 && !class110.field1978) {
            class230.method1607(0, -63, 2, class16.field365, arg1, class197.field3528, false);
        }
        field4762++;
        class106.field1927 = arg1;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(I)V")
    public final void method1557(int arg0) {
        field4753++;
        if (arg0 >= 53) {
            for (int var2 = 0; var2 < 10; var2++) {
                this.field4761[var2] = 0L;
            }
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(IIB)I")
    public final int method1561(int arg0, int arg1, byte arg2) {
        field4752++;
        int var4 = this.field4759;
        if (arg2 <= 119) {
            method1847(-68);
        }
        this.field4759 = 300;
        int var5 = this.field4749;
        this.field4749 = 1;
        this.field4754 = class201.method1419(5);
        if (this.field4761[this.field4764] == 0L) {
            this.field4749 = var5;
            this.field4759 = var4;
        } else if (this.field4754 > this.field4761[this.field4764]) {
            this.field4759 = (int) ((long) (arg1 * 2560) / (this.field4754 - this.field4761[this.field4764]));
        }
        if (this.field4759 < 25) {
            this.field4759 = 25;
        }
        if (this.field4759 > 256) {
            this.field4759 = 256;
            this.field4749 = (int) ((long) arg1 - ((this.field4754 - this.field4761[this.field4764]) / 10L));
        }
        if (arg1 < this.field4749) {
            this.field4749 = arg1;
        }
        this.field4761[this.field4764] = this.field4754;
        this.field4764 = (this.field4764 + 1) % 10;
        if (this.field4749 > 1) {
            for (int var6 = 0; var6 < 10; var6++) {
                if (this.field4761[var6] != 0L) {
                    this.field4761[var6] += (long) this.field4749;
                }
            }
        }
        if (arg0 > this.field4749) {
            this.field4749 = arg0;
        }
        class52.method417((byte) -115, (long) this.field4749);
        int var7 = 0;
        while (this.field4756 < 256) {
            this.field4756 += this.field4759;
            var7++;
        }
        this.field4756 &= 0xFF;
        return var7;
    }

    @OriginalMember(owner = "client!ee", name = "c", descriptor = "(I)V")
    public static void method1847(int arg0) {
        if (arg0 == 4) {
            field4763 = null;
            field4757 = null;
            field4750 = null;
        }
    }

    @OriginalMember(owner = "client!ee", name = "<init>", descriptor = "()V")
    public class268() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field4761[var1] = this.field4754;
        }
    }
}
