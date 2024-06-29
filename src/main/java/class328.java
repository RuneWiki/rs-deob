import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qe")
public abstract class class328 {

    @OriginalMember(owner = "client!qe", name = "g", descriptor = "I")
    public int field4482;

    @OriginalMember(owner = "client!qe", name = "k", descriptor = "I")
    public int field4486;

    @OriginalMember(owner = "client!qe", name = "l", descriptor = "I")
    public int field4487;

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "I")
    public static int field4476 = 0;

    @OriginalMember(owner = "client!qe", name = "c", descriptor = "[Lgi;")
    public static class477[] field4478 = new class477[30];

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "I")
    public static int field4477;

    @OriginalMember(owner = "client!qe", name = "d", descriptor = "I")
    public static int field4479;

    @OriginalMember(owner = "client!qe", name = "h", descriptor = "I")
    public static int field4483;

    @OriginalMember(owner = "client!qe", name = "j", descriptor = "I")
    public static int field4485;

    @OriginalMember(owner = "client!qe", name = "f", descriptor = "Ljk;")
    public static class446 field4481;

    @OriginalMember(owner = "client!qe", name = "e", descriptor = "Lkn;")
    public static class519 field4480;

    @OriginalMember(owner = "client!qe", name = "i", descriptor = "[I")
    public static int[] field4484;

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(II)V", line = 4)
    public static final void method1901(int arg0, int arg1) {
        class193.field2756 = 100;
        class346.field4955 = -1;
        class294.field4050 = arg0;
        class222.field3167 = 3;
        field4479++;
        if (arg1 <= 94) {
            field4476 = -103;
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(III)I", line = 24)
    public static final int method1902(int arg0, int arg1, int arg2) {
        if (arg2 != -22662) {
            field4478 = null;
        }
        field4477++;
        if (arg0 < arg1) {
            int var3 = arg0;
            arg0 = arg1;
            arg1 = var3;
        }
        while (arg1 != 0) {
            int var4 = arg0 % arg1;
            arg0 = arg1;
            arg1 = var4;
        }
        return arg0;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(Z)V", line = 63)
    public static void method1903(boolean arg0) {
        field4481 = null;
        field4484 = null;
        if (arg0) {
            field4478 = null;
        }
        field4478 = null;
        field4480 = null;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(I)V", line = 77)
    public static final void method1904(int arg0) {
        class48.field570 = false;
        if (arg0 == 0) {
            field4483++;
            class52.field635 = null;
            class361.method2180(true);
        }
    }

    @OriginalMember(owner = "client!qe", name = "<init>", descriptor = "(III)V", line = 91)
    public class328(int arg0, int arg1, int arg2) {
        this.field4482 = arg2;
        this.field4486 = arg0;
        this.field4487 = arg1;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(IZI)V")
    public abstract void method5(int arg0, boolean arg1, int arg2);

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "(III)V")
    public abstract void method4(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!qe", name = "c", descriptor = "(III)V")
    public abstract void method3(int arg0, int arg1, int arg2);
}
