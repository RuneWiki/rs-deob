import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ob")
public class class90 {

    @OriginalMember(owner = "client!ob", name = "c", descriptor = "Lcn;")
    public static class37 field1275 = new class37(16);

    @OriginalMember(owner = "client!ob", name = "g", descriptor = "I")
    public static int field1279 = 0;

    @OriginalMember(owner = "client!ob", name = "f", descriptor = "[I")
    public static int[] field1278 = new int[500];

    @OriginalMember(owner = "client!ob", name = "h", descriptor = "[Lon;")
    public static class148[] field1280 = new class148[29];

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "I")
    public static int field1273;

    @OriginalMember(owner = "client!ob", name = "e", descriptor = "I")
    public static int field1277;

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "Lrn;")
    public static class18 field1274;

    @OriginalMember(owner = "client!ob", name = "d", descriptor = "Z")
    public static boolean field1276;

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(I)V", line = 5)
    public static void method805(int arg0) {
        field1280 = null;
        int var1 = 72 % ((arg0 - 48) / 59);
        field1274 = null;
        field1278 = null;
        field1275 = null;
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(II)V", line = 19)
    public static final void method806(int arg0, int arg1) {
        field1273++;
        class348.field5530 = arg0;
        class36.field544 = -1;
        class36.field544 = arg1;
        class71.method679((byte) -34);
    }
}
