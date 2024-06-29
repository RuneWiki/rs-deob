import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ou")
public class class432 {

    @OriginalMember(owner = "client!ou", name = "g", descriptor = "I")
    public int field6398 = 128;

    @OriginalMember(owner = "client!ou", name = "d", descriptor = "I")
    public int field6395 = 128;

    @OriginalMember(owner = "client!ou", name = "j", descriptor = "I")
    public int field6401;

    @OriginalMember(owner = "client!ou", name = "c", descriptor = "I")
    public int field6394;

    @OriginalMember(owner = "client!ou", name = "h", descriptor = "I")
    public int field6399;

    @OriginalMember(owner = "client!ou", name = "e", descriptor = "I")
    public int field6396;

    @OriginalMember(owner = "client!ou", name = "k", descriptor = "Z")
    public static boolean field6402 = false;

    @OriginalMember(owner = "client!ou", name = "l", descriptor = "Lqu;")
    public static class65 field6403 = new class65(11, 0, 1, 2);

    @OriginalMember(owner = "client!ou", name = "m", descriptor = "Z")
    public static boolean field6404 = true;

    @OriginalMember(owner = "client!ou", name = "n", descriptor = "[I")
    public static int[] field6405 = new int[5];

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "I")
    public static int field6392;

    @OriginalMember(owner = "client!ou", name = "b", descriptor = "I")
    public static int field6393;

    @OriginalMember(owner = "client!ou", name = "f", descriptor = "I")
    public static int field6397;

    @OriginalMember(owner = "client!ou", name = "i", descriptor = "I")
    public static int field6400;

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(IBII)I", line = 6)
    public static final int method2679(int arg0, byte arg1, int arg2, int arg3) {
        field6392++;
        if (arg1 >= -101) {
            field6405 = null;
        }
        if ((class476.field6873[arg3][arg2][arg0] & 0x8) == 0) {
            return arg3 <= 0 || (class476.field6873[1][arg2][arg0] & 0x2) == 0 ? arg3 : arg3 - 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(I)V", line = 28)
    public static void method2680(int arg0) {
        field6405 = null;
        field6403 = null;
        if (arg0 != 26484) {
            field6404 = false;
        }
    }

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(Lou;I)V", line = 42)
    public final void method2681(class432 arg0, int arg1) {
        this.field6398 = arg0.field6398;
        this.field6396 = arg0.field6396;
        int var3 = 60 % ((47 - arg1) / 43);
        this.field6401 = arg0.field6401;
        this.field6399 = arg0.field6399;
        field6400++;
        this.field6394 = arg0.field6394;
        this.field6395 = arg0.field6395;
    }

    @OriginalMember(owner = "client!ou", name = "a", descriptor = "(Z)Lou;", line = 58)
    public final class432 method2682(boolean arg0) {
        field6397++;
        return arg0 ? new class432(this.field6401, this.field6398, this.field6395, this.field6394, this.field6396, this.field6399) : null;
    }

    @OriginalMember(owner = "client!ou", name = "b", descriptor = "(I)V", line = 71)
    public static final void method2683(int arg0) {
        field6393++;
        class371.field5530.method2588(-121);
        int var1 = 40 / ((arg0 + 15) / 50);
    }

    @OriginalMember(owner = "client!ou", name = "<init>", descriptor = "(I)V", line = 97)
    public class432(int arg0) {
        this.field6401 = arg0;
    }

    @OriginalMember(owner = "client!ou", name = "<init>", descriptor = "(IIIIII)V", line = 104)
    private class432(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field6394 = arg3;
        this.field6401 = arg0;
        this.field6399 = arg5;
        this.field6395 = arg2;
        this.field6396 = arg4;
        this.field6398 = arg1;
    }
}
