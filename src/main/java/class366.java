import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fo")
public class class366 {

    @OriginalMember(owner = "client!fo", name = "c", descriptor = "Lqv;")
    public static class316 field5300 = new class316(48, 7);

    @OriginalMember(owner = "client!fo", name = "b", descriptor = "I")
    public static int field5299;

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "Laa;")
    public static class343 field5298;

    @OriginalMember(owner = "client!fo", name = "d", descriptor = "Lul;")
    public static class411 field5301;

    @OriginalMember(owner = "client!fo", name = "e", descriptor = "[Lis;")
    public static class354[] field5302;

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(IIIII)V", line = 12)
    public static final void method2249(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field5299++;
        float var5 = (float) class382.field5485 / (float) class382.field5470;
        int var6 = arg3;
        if (arg0 != -23643) {
            method2249(-36, 123, -28, -112, -17);
        }
        int var7 = arg1;
        if ((var5 < 1.0F)) {
            var7 = (int) ((float) arg3 * var5);
        } else {
            var6 = (int) ((float) arg1 / var5);
        }
        int var8 = arg4 - (arg1 - var7) / 2;
        int var9 = arg2 - (arg3 - var6) / 2;
        class70.field1149 = class382.field5470 * var9 / var6;
        class388.field5514 = class382.field5485 - (class382.field5485 * var8 / var7);
        class94.field1501 = -1;
        class473.field6895 = -1;
        class521.method3091((byte) 70);
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(I)V", line = 42)
    public static void method2250(int arg0) {
        field5302 = null;
        field5298 = null;
        field5300 = null;
        field5301 = null;
        if (arg0 != 48) {
            method2250(-17);
        }
    }
}
