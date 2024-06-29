import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cg")
public class class71 extends class7 {

    @OriginalMember(owner = "client!cg", name = "D", descriptor = "I")
    public int field884 = 1;

    @OriginalMember(owner = "client!cg", name = "x", descriptor = "I")
    public static int field878 = -1;

    @OriginalMember(owner = "client!cg", name = "A", descriptor = "C")
    public char field881;

    @OriginalMember(owner = "client!cg", name = "w", descriptor = "I")
    public static int field877;

    @OriginalMember(owner = "client!cg", name = "y", descriptor = "I")
    public static int field879;

    @OriginalMember(owner = "client!cg", name = "z", descriptor = "I")
    public static int field880;

    @OriginalMember(owner = "client!cg", name = "B", descriptor = "I")
    public static int field882;

    @OriginalMember(owner = "client!cg", name = "C", descriptor = "I")
    public static int field883;

    @OriginalMember(owner = "client!cg", name = "v", descriptor = "[I")
    public static int[] field876;

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(ILjg;I)V", line = 5)
    private final void method442(int arg0, class186 arg1, int arg2) {
        field877++;
        if (arg0 != 0) {
            field878 = -76;
        }
        if (arg2 == 1) {
            this.field881 = class394.method2488(-1206145460, arg1.method1327((byte) -122));
        } else if (arg2 == 2) {
            this.field884 = 0;
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(IIIIFZIII)[[I", line = 27)
    public static final int[][] method443(int arg0, int arg1, int arg2, int arg3, float arg4, boolean arg5, int arg6, int arg7, int arg8) {
        field879++;
        int[][] var9 = new int[arg2][arg8];
        if (arg3 != 1) {
            method443(105, 112, -86, 63, -0.5735901F, true, -79, 120, 48);
        }
        class358 var10 = new class358();
        var10.field5483 = arg5;
        var10.field5484 = (int) (arg4 * 4096.0F);
        var10.field5473 = arg6;
        var10.field5474 = arg0;
        var10.field5468 = arg1;
        var10.method111((byte) 98);
        class299.method2017((byte) 47, arg8, arg2);
        for (int var11 = 0; var11 < arg2; var11++) {
            var10.method2336(19643, var11, var9[var11]);
        }
        return var9;
    }

    @OriginalMember(owner = "client!cg", name = "f", descriptor = "(I)V", line = 63)
    public static final void method444(int arg0) {
        if (arg0 != 4389) {
            method444(-55);
        }
        field883++;
        class52 var1 = class8.field102;
        synchronized (class8.field102) {
            class8.field102.method336(89);
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(BLjg;)V", line = 82)
    public final void method445(byte arg0, class186 arg1) {
        field880++;
        while (true) {
            int var3 = arg1.method1322(false);
            if (var3 == 0) {
                int var4 = -71 / ((-arg0 - 77) / 45);
                return;
            }
            this.method442(0, arg1, var3);
        }
    }

    @OriginalMember(owner = "client!cg", name = "g", descriptor = "(I)V", line = 103)
    public static void method446(int arg0) {
        if (arg0 != 0) {
            method444(-21);
        }
        field876 = null;
    }
}
