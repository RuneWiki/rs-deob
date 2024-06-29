import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uh")
public class class16 extends class115 {

    @OriginalMember(owner = "client!uh", name = "Q", descriptor = "[[I")
    public static int[][] field137 = new int[][] { { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 }, { 12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3 }, { 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 }, { 3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12 } };

    @OriginalMember(owner = "client!uh", name = "U", descriptor = "Lqe;")
    private static class168 field141 = class66.method448("RuneScape is loading )2 please wait)3)3)3", 72);

    @OriginalMember(owner = "client!uh", name = "T", descriptor = "Lqe;")
    public static class168 field140 = field141;

    @OriginalMember(owner = "client!uh", name = "R", descriptor = "I")
    public static int field138;

    @OriginalMember(owner = "client!uh", name = "S", descriptor = "I")
    public static int field139;

    @OriginalMember(owner = "client!uh", name = "V", descriptor = "I")
    public static int field142;

    @OriginalMember(owner = "client!uh", name = "W", descriptor = "I")
    public static int field143;

    @OriginalMember(owner = "client!uh", name = "X", descriptor = "I")
    public static int field144;

    @OriginalMember(owner = "client!uh", name = "Y", descriptor = "I")
    public static int field145;

    @OriginalMember(owner = "client!uh", name = "i", descriptor = "(I)V")
    public static void method81(int arg0) {
        field137 = null;
        field141 = null;
        if (arg0 != -32522) {
            field140 = null;
        }
        field140 = null;
    }

    @OriginalMember(owner = "client!uh", name = "j", descriptor = "(I)I")
    public static final int method82(int arg0) {
        ++field138;
        class137.field2426 = class36.field444;
        class4.method25(false, 127);
        class200.method1278((byte) 89);
        if (arg0 >= -32) {
            method84((byte) 108);
        }
        class126.method860((byte) -92, class137.field2426);
        class7.field85 = new class121();
        class7.field85.field190 = 3000;
        class7.field85.field166 = 3000;
        class92.method610(class152.field2645, 256);
        return 10;
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(IIIIII)V")
    public static final void method83(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field142;
        int var6 = class97.method639(arg4, (byte) 12, class222.field3811, class196.field3402);
        if (arg1 != 0) {
            method84((byte) -5);
        }
        int var7 = class97.method639(arg0, (byte) 12, class222.field3811, class196.field3402);
        int var8 = class97.method639(arg3, (byte) 12, class174.field3055, class249.field4314);
        int var9 = class97.method639(arg2, (byte) 12, class174.field3055, class249.field4314);
        for (int var10 = var6; var7 >= var10; ++var10) {
            class232.method1501(arg5, var8, (byte) -108, class241.field4117[var10], var9);
        }
    }

    @OriginalMember(owner = "client!uh", name = "<init>", descriptor = "()V")
    public class16() {
        super(1, true);
    }

    @OriginalMember(owner = "client!uh", name = "c", descriptor = "(B)V")
    public static final void method84(byte arg0) {
        ++field145;
        class148.field2575.method1497((byte) 65);
        if (arg0 > -74) {
            method84((byte) -61);
        }
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(IB)[I")
    public final int[] method5(int arg0, byte arg1) {
        ++field139;
        int[] var3 = super.field1872.method182((byte) -85, arg0);
        if (arg1 <= 37) {
            field140 = null;
        }
        if (super.field1872.field341) {
            int[][] var4 = this.method789(0, (byte) -124, arg0);
            int[] var5 = var4[0];
            int[] var6 = var4[2];
            int[] var7 = var4[1];
            for (int var8 = 0; var8 < class130.field2297; ++var8) {
                var3[var8] = (var5[var8] - -var6[var8] + var7[var8]) / 3;
            }
        }
        return var3;
    }
}
