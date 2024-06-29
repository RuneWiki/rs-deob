import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mi")
public class class463 {

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "Ldc;")
    private class5 field6259;

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "I")
    public int field6258;

    @OriginalMember(owner = "client!mi", name = "f", descriptor = "F")
    public static float field6263 = 1024.0F;

    @OriginalMember(owner = "client!mi", name = "c", descriptor = "I")
    public static int field6260;

    @OriginalMember(owner = "client!mi", name = "d", descriptor = "I")
    public static int field6261;

    @OriginalMember(owner = "client!mi", name = "e", descriptor = "I")
    public static int field6262;

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(Z)V", line = 3)
    public static final void method2623(boolean arg0) {
        class98.field1479.method3314(false);
        field6260++;
        class139.field2246.method1274(-6022);
        class133.field2174.method529(23587);
        class470.field6288.method1264(-111);
        class239.field3369.method279(27580);
        class193.field2826.method1041(-74);
        class636.field8570.method237((byte) 35);
        class120.field2028.method3722(!arg0);
        class392.field5167.method607(!arg0);
        class597.field7937.method2932(126);
        class674.field9537.method2320(20);
        class457.field6215.method1598(81);
        class521.field6960.method1490(1);
        class156.field2470.method926(false);
        if (!arg0) {
            field6263 = 0.66893166F;
        }
        class282.field4001.method3058(113);
        class152.field2405.method1008((byte) -124);
        class328.field4518.method2138(27892);
        class428.field5877.method2601(-116);
        class397.field5279.method3245(33);
        class410.field5535.method723(72);
        class705.method3890(-24703);
        class209.method1344(-1);
        class265.method1622(arg0);
        class27.method230(-101);
        class676.method3783((byte) -126);
        class24.field400.method3748(6);
        class190.field2793.method3748(6);
        class237.field3350.method3748(6);
        class431.field5902.method3748(6);
        class544.field7214.method3748(6);
    }

    @OriginalMember(owner = "client!mi", name = "<init>", descriptor = "(Ldc;II)V", line = 50)
    public class463(class5 arg0, int arg1, int arg2) {
        this.field6259 = arg0;
        this.field6258 = arg2;
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(ZLgba;)V", line = 62)
    public static final void method2624(boolean arg0, class625 arg1) {
        field6262++;
        if (!arg0 && class546.field7285 == arg1.field8283) {
            class511.field6834[arg1.field8280] = true;
        }
    }

    @OriginalMember(owner = "client!mi", name = "finalize", descriptor = "()V", line = 78)
    protected final void finalize() throws Throwable {
        this.field6259.method79(-120, this.field6258);
        field6261++;
        super.finalize();
    }
}
