import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!te")
public class class490 {

    @OriginalMember(owner = "client!te", name = "i", descriptor = "Lag;")
    private class469 field6788;

    @OriginalMember(owner = "client!te", name = "g", descriptor = "J")
    public long field6786;

    @OriginalMember(owner = "client!te", name = "a", descriptor = "[[[I")
    public static int[][][] field6780 = new int[2][][];

    @OriginalMember(owner = "client!te", name = "b", descriptor = "[I")
    public static int[] field6781 = new int[32];

    @OriginalMember(owner = "client!te", name = "d", descriptor = "[I")
    public static int[] field6783 = new int[120];

    @OriginalMember(owner = "client!te", name = "c", descriptor = "I")
    public static int field6782;

    @OriginalMember(owner = "client!te", name = "e", descriptor = "I")
    public static int field6784;

    @OriginalMember(owner = "client!te", name = "f", descriptor = "I")
    public static int field6785;

    @OriginalMember(owner = "client!te", name = "h", descriptor = "I")
    public static int field6787;

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 120; var1++) {
            int var2 = var1 + 1;
            int var3 = (int) ((double) var2 + Math.pow(2.0D, (double) var2 / 7.0D) * 300.0D);
            var0 += var3;
            field6783[var1] = var0 / 4;
        }
    }

    @OriginalMember(owner = "client!te", name = "finalize", descriptor = "()V", line = 6)
    protected final void finalize() throws Throwable {
        this.field6788.method2640(this.field6786, 6);
        field6782++;
        super.finalize();
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(III)V", line = 22)
    public static final void method2806(int arg0, int arg1, int arg2) {
        field6787++;
        class256 var3 = class592.method3279((byte) -123, 1, arg0);
        var3.method1549(arg1 ^ 0xFFFF8795);
        var3.field3358 = arg2;
        if (arg1 != 1347) {
            field6780 = null;
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(I)V", line = 40)
    public static void method2807(int arg0) {
        field6783 = null;
        field6780 = null;
        field6781 = null;
        if (arg0 != 4) {
            field6783 = null;
        }
    }

    @OriginalMember(owner = "client!te", name = "<init>", descriptor = "(Lag;J[Lvk;)V", line = 77)
    public class490(class469 arg0, long arg1, class451[] arg2) {
        this.field6788 = arg0;
        this.field6786 = arg1;
    }
}
