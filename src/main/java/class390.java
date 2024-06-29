import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pp")
public class class390 {

    @OriginalMember(owner = "client!pp", name = "c", descriptor = "I")
    public int field5448;

    @OriginalMember(owner = "client!pp", name = "g", descriptor = "Loea;")
    private class594 field5452;

    @OriginalMember(owner = "client!pp", name = "e", descriptor = "F")
    public static float field5450 = 0.0F;

    @OriginalMember(owner = "client!pp", name = "f", descriptor = "I")
    public static int field5451 = 0;

    @OriginalMember(owner = "client!pp", name = "b", descriptor = "I")
    public static int field5447;

    @OriginalMember(owner = "client!pp", name = "d", descriptor = "I")
    public static int field5449;

    @OriginalMember(owner = "client!pp", name = "j", descriptor = "Lvk;")
    public static class367 field5455;

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "Z")
    public static boolean field5446;

    @OriginalMember(owner = "client!pp", name = "h", descriptor = "[I")
    public static int[] field5453;

    @OriginalMember(owner = "client!pp", name = "i", descriptor = "[[[Lmf;")
    public static class416[][][] field5454;

    @OriginalMember(owner = "client!pp", name = "finalize", descriptor = "()V", line = 16)
    protected final void finalize() throws Throwable {
        field5449++;
        this.field5452.method3426(this.field5448, (byte) 125);
        super.finalize();
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(IIIIIII)V", line = 26)
    public static final void method2434(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg3 != ~class471.field6781.field6690.method3134(27669) && arg4 != 0 && class570.field8115 < 50 && arg1 != -1) {
            class719.field10073[class570.field8115++] = new class710((byte) 1, arg1, arg4, arg2, arg0, arg6, arg5, null);
        }
        field5447++;
    }

    @OriginalMember(owner = "client!pp", name = "<init>", descriptor = "(Loea;II)V", line = 44)
    public class390(class594 arg0, int arg1, int arg2) {
        this.field5448 = arg2;
        this.field5452 = arg0;
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(I)V", line = 55)
    public static void method2435(int arg0) {
        field5453 = null;
        if (arg0 != 0) {
            field5446 = true;
        }
        field5455 = null;
        field5454 = null;
    }
}
