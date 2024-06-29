import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mb")
public class class168 {

    @OriginalMember(owner = "client!mb", name = "h", descriptor = "Z")
    public boolean field2627 = true;

    @OriginalMember(owner = "client!mb", name = "f", descriptor = "I")
    public int field2625;

    @OriginalMember(owner = "client!mb", name = "g", descriptor = "I")
    public int field2626;

    @OriginalMember(owner = "client!mb", name = "d", descriptor = "I")
    public int field2623;

    @OriginalMember(owner = "client!mb", name = "i", descriptor = "I")
    public int field2628;

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "I")
    public int field2621;

    @OriginalMember(owner = "client!mb", name = "j", descriptor = "I")
    public int field2629;

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "[[I")
    public static int[][] field2620 = new int[5][5000];

    @OriginalMember(owner = "client!mb", name = "c", descriptor = "I")
    public static int field2622;

    @OriginalMember(owner = "client!mb", name = "e", descriptor = "I")
    public static int field2624;

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(I)V")
    public static void method1112(int arg0) {
        field2620 = null;
        if (arg0 != 13876) {
            method1114((class254) null, 71, -10, (byte) -65, -51, 95, 9, 12);
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(IIBIIIII)V")
    public static final void method1113(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field2624++;
        if (arg2 != 100) {
            field2620 = null;
        }
        int var8 = arg1 + arg3;
        int var9 = arg5 - arg1;
        int var10 = arg0 + arg1;
        int var11 = arg7 - arg1;
        for (int var12 = arg3; var12 < var8; var12++) {
            class71.method451(arg6, true, arg7, arg0, class130.field2005[var12]);
        }
        for (int var13 = arg5; var13 > var9; var13--) {
            class71.method451(arg6, true, arg7, arg0, class130.field2005[var13]);
        }
        for (int var14 = var8; var14 <= var9; var14++) {
            int[] var15 = class130.field2005[var14];
            class71.method451(arg6, true, var10, arg0, var15);
            class71.method451(arg4, true, var11, var10, var15);
            class71.method451(arg6, true, arg7, var11, var15);
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(Lkk;IIBIIII)V")
    public static final void method1114(class254 arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg3 >= -118) {
            field2620 = null;
        }
        int var8 = arg1 * arg1 + arg5 * arg5;
        field2622++;
        if (arg4 < var8) {
            return;
        }
        int var9 = Math.min(arg0.field4085 / 2, arg0.field4152 / 2);
        if (var8 <= (var9 * var9)) {
            class121.method787(arg1, class197.field3126[arg2], arg0, arg6, arg5, arg7, -1);
            return;
        }
        var9 -= 10;
        int var10;
        if (class92.field1402 == 4) {
            var10 = (int) class202.field3253 & 0x7FF;
        } else {
            var10 = (int) class202.field3253 + class262.field4330 & 0x7FF;
        }
        int var11 = class172.field2669[var10];
        int var12 = class172.field2658[var10];
        if (class92.field1402 != 4) {
            var11 = var11 * 256 / (class265.field4365 + 256);
            var12 = var12 * 256 / (class265.field4365 + 256);
        }
        int var13 = arg5 * var12 - (arg1 * var11) >> 16;
        int var14 = arg5 * var11 + (arg1 * var12) >> 16;
        double var15 = Math.atan2((double) var14, (double) var13);
        int var17 = (int) (Math.sin(var15) * (double) var9);
        int var18 = (int) (Math.cos(var15) * (double) var9);
        ((class38) class236.field3746[arg2]).method254(arg7 + (arg0.field4085 / 2) - (-var17 + 10), arg0.field4152 / 2 + -var18 + arg6 + -10, 20, 20, 15, 15, var15, 256);
    }

    @OriginalMember(owner = "client!mb", name = "<init>", descriptor = "(IIIIIIZ)V")
    public class168(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        this.field2625 = arg5;
        this.field2626 = arg2;
        this.field2623 = arg0;
        this.field2627 = arg6;
        this.field2628 = arg3;
        this.field2621 = arg4;
        this.field2629 = arg1;
    }
}
