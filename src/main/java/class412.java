import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!op")
public class class412 {

    @OriginalMember(owner = "client!op", name = "d", descriptor = "I")
    public int field5870 = 128;

    @OriginalMember(owner = "client!op", name = "c", descriptor = "I")
    public int field5869 = 128;

    @OriginalMember(owner = "client!op", name = "f", descriptor = "I")
    public int field5872;

    @OriginalMember(owner = "client!op", name = "b", descriptor = "I")
    public int field5868;

    @OriginalMember(owner = "client!op", name = "a", descriptor = "I")
    public int field5867;

    @OriginalMember(owner = "client!op", name = "i", descriptor = "I")
    public int field5875;

    @OriginalMember(owner = "client!op", name = "e", descriptor = "Lak;")
    public static class498 field5871 = new class498();

    @OriginalMember(owner = "client!op", name = "g", descriptor = "I")
    public static int field5873;

    @OriginalMember(owner = "client!op", name = "h", descriptor = "I")
    public static int field5874;

    @OriginalMember(owner = "client!op", name = "j", descriptor = "I")
    public static int field5876;

    @OriginalMember(owner = "client!op", name = "k", descriptor = "I")
    public static int field5877;

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(I)V")
    public static final void method2490(int arg0) {
        class348 var1 = class675.field9603;
        synchronized (class675.field9603) {
            class675.field9603.method2220(false);
        }
        field5874++;
        class348 var2 = class201.field2992;
        synchronized (class201.field2992) {
            class201.field2992.method2220(false);
        }
        if (arg0 != 128) {
            method2492(-96);
        }
    }

    @OriginalMember(owner = "client!op", name = "b", descriptor = "(I)Lop;")
    public final class412 method2491(int arg0) {
        if (arg0 >= -99) {
            method2490(8);
        }
        field5876++;
        return new class412(this.field5872, this.field5869, this.field5870, this.field5875, this.field5868, this.field5867);
    }

    @OriginalMember(owner = "client!op", name = "c", descriptor = "(I)V")
    public static void method2492(int arg0) {
        field5871 = null;
        if (arg0 != -5808) {
            field5877 = 124;
        }
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(ILop;)V")
    public final void method2493(int arg0, class412 arg1) {
        this.field5868 = arg1.field5868;
        this.field5867 = arg1.field5867;
        if (arg0 != 128) {
            this.method2491(34);
        }
        this.field5872 = arg1.field5872;
        this.field5870 = arg1.field5870;
        this.field5869 = arg1.field5869;
        field5873++;
        this.field5875 = arg1.field5875;
    }

    @OriginalMember(owner = "client!op", name = "<init>", descriptor = "(I)V")
    public class412(int arg0) {
        this.field5872 = arg0;
    }

    @OriginalMember(owner = "client!op", name = "<init>", descriptor = "(IIIIII)V")
    private class412(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field5869 = arg1;
        this.field5872 = arg0;
        this.field5868 = arg4;
        this.field5867 = arg5;
        this.field5875 = arg3;
        this.field5870 = arg2;
    }
}
