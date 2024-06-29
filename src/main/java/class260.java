import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ik")
public class class260 extends class34 {

    @OriginalMember(owner = "client!ik", name = "r", descriptor = "I")
    public int field4687;

    @OriginalMember(owner = "client!ik", name = "s", descriptor = "I")
    public int field4688;

    @OriginalMember(owner = "client!ik", name = "t", descriptor = "Z")
    public static boolean field4689 = false;

    @OriginalMember(owner = "client!ik", name = "n", descriptor = "I")
    public static int field4683;

    @OriginalMember(owner = "client!ik", name = "o", descriptor = "I")
    public static int field4684;

    @OriginalMember(owner = "client!ik", name = "p", descriptor = "I")
    public static int field4685;

    @OriginalMember(owner = "client!ik", name = "q", descriptor = "I")
    public static int field4686;

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(ILsj;)V")
    public static final void method1801(int arg0, class49 arg1) {
        field4685++;
        class110.field2220 = arg1.method364(-1, class172.field3151);
        if (arg0 >= -44) {
            field4686 = 36;
        }
        class72.field1355 = arg1.method364(-1, class21.field403);
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "([IJIB)Lcc;")
    public static final class209 method1802(int[] arg0, long arg1, int arg2, byte arg3) {
        if (arg3 != 119) {
            field4686 = 28;
        }
        field4684++;
        if (class173.field3156 != null) {
            class209 var5 = class173.field3156.method341(arg0, arg1, arg3 ^ 0xFFFFFFC7, arg2);
            if (var5 != null) {
                return var5;
            }
        }
        return arg2 == 5 ? class56.method437(arg1, (byte) 15).method1459((byte) -59) : class150.method1043(arg1, 10);
    }

    @OriginalMember(owner = "client!ik", name = "<init>", descriptor = "(II)V")
    public class260(int arg0, int arg1) {
        this.field4687 = arg0;
        this.field4688 = arg1;
    }
}
