import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ml")
public class class385 {

    @OriginalMember(owner = "client!ml", name = "i", descriptor = "I")
    public int field5373 = 128;

    @OriginalMember(owner = "client!ml", name = "s", descriptor = "I")
    public int field5383 = 128;

    @OriginalMember(owner = "client!ml", name = "e", descriptor = "I")
    public int field5369;

    @OriginalMember(owner = "client!ml", name = "h", descriptor = "I")
    public int field5372;

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "I")
    public int field5365;

    @OriginalMember(owner = "client!ml", name = "d", descriptor = "I")
    public int field5368;

    @OriginalMember(owner = "client!ml", name = "p", descriptor = "S")
    public static short field5380 = 256;

    @OriginalMember(owner = "client!ml", name = "o", descriptor = "Lqe;")
    public static class465 field5379 = new class465(109, 0);

    @OriginalMember(owner = "client!ml", name = "b", descriptor = "I")
    public int field5366;

    @OriginalMember(owner = "client!ml", name = "c", descriptor = "I")
    public int field5367;

    @OriginalMember(owner = "client!ml", name = "f", descriptor = "I")
    public int field5370;

    @OriginalMember(owner = "client!ml", name = "g", descriptor = "I")
    public static int field5371;

    @OriginalMember(owner = "client!ml", name = "j", descriptor = "I")
    public int field5374;

    @OriginalMember(owner = "client!ml", name = "k", descriptor = "I")
    public int field5375;

    @OriginalMember(owner = "client!ml", name = "l", descriptor = "I")
    public static int field5376;

    @OriginalMember(owner = "client!ml", name = "n", descriptor = "I")
    public static int field5378;

    @OriginalMember(owner = "client!ml", name = "r", descriptor = "I")
    public static int field5382;

    @OriginalMember(owner = "client!ml", name = "q", descriptor = "Lsfa;")
    public static class693 field5381;

    @OriginalMember(owner = "client!ml", name = "t", descriptor = "[I")
    public static int[] field5384;

    @OriginalMember(owner = "client!ml", name = "m", descriptor = "[J")
    public static long[] field5377;

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(Lml;B)V")
    public final void method2407(class385 arg0, byte arg1) {
        this.field5365 = arg0.field5365;
        this.field5369 = arg0.field5369;
        this.field5383 = arg0.field5383;
        this.field5372 = arg0.field5372;
        this.field5368 = arg0.field5368;
        field5376++;
        this.field5373 = arg0.field5373;
        if (arg1 <= 44) {
            this.field5368 = 42;
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(B)Lml;")
    public final class385 method2408(byte arg0) {
        field5371++;
        int var2 = 82 % ((arg0 - 42) / 32);
        return new class385(this.field5369, this.field5383, this.field5373, this.field5372, this.field5368, this.field5365);
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(Z)V")
    public static final void method2409(boolean arg0) {
        if (arg0) {
            field5379 = null;
        }
        field5378++;
        if (!class592.field8314) {
            class592.field8314 = true;
            class674.field9471 = true;
            class390.field5450 += (24.0F - class390.field5450) / 2.0F;
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(I)V")
    public static void method2410(int arg0) {
        if (arg0 != 109) {
            method2410(62);
        }
        field5377 = null;
        field5384 = null;
        field5381 = null;
        field5379 = null;
    }

    @OriginalMember(owner = "client!ml", name = "<init>", descriptor = "(I)V")
    public class385(int arg0) {
        this.field5369 = arg0;
    }

    @OriginalMember(owner = "client!ml", name = "<init>", descriptor = "(IIIIII)V")
    private class385(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field5373 = arg2;
        this.field5383 = arg1;
        this.field5372 = arg3;
        this.field5365 = arg5;
        this.field5369 = arg0;
        this.field5368 = arg4;
    }
}
