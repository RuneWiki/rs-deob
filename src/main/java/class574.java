import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!he")
public class class574 {

    @OriginalMember(owner = "client!he", name = "d", descriptor = "Lom;")
    private class642 field8157;

    @OriginalMember(owner = "client!he", name = "b", descriptor = "I")
    public int field8155;

    @OriginalMember(owner = "client!he", name = "e", descriptor = "Ltm;")
    public static class334 field8158 = new class334(3, -1);

    @OriginalMember(owner = "client!he", name = "a", descriptor = "I")
    public static int field8154;

    @OriginalMember(owner = "client!he", name = "c", descriptor = "I")
    public static int field8156;

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(I)V", line = 5)
    public static void method3333(int arg0) {
        field8158 = null;
        int var1 = -6 % ((4 - arg0) / 52);
    }

    @OriginalMember(owner = "client!he", name = "finalize", descriptor = "()V", line = 17)
    protected final void finalize() throws Throwable {
        this.field8157.method3629(this.field8155, 14068);
        field8156++;
        super.finalize();
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(IIIIB)V", line = 26)
    public static final void method3334(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        int var5 = -52 / ((arg4 - 5) / 63);
        if (arg0 - arg1 >= class184.field3102 && class657.field9347 >= (arg0 + arg1) && class76.field1126 <= (arg3 - arg1) && arg1 + arg3 <= class461.field6699) {
            class207.method1514(arg0, arg1, arg2, arg3, -13628);
        } else {
            class173.method1364(arg2, (byte) 96, arg3, arg0, arg1);
        }
        field8154++;
    }

    @OriginalMember(owner = "client!he", name = "<init>", descriptor = "(Lom;II)V", line = 42)
    public class574(class642 arg0, int arg1, int arg2) {
        this.field8157 = arg0;
        this.field8155 = arg2;
    }
}
