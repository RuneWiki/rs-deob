import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wf")
public class class205 extends class119 {

    @OriginalMember(owner = "client!wf", name = "r", descriptor = "I")
    public int field3975;

    @OriginalMember(owner = "client!wf", name = "y", descriptor = "I")
    public int field3982;

    @OriginalMember(owner = "client!wf", name = "s", descriptor = "I")
    public static int field3976 = 0;

    @OriginalMember(owner = "client!wf", name = "v", descriptor = "Lai;")
    private static class10 field3979 = class44.method278("yellow:", 98);

    @OriginalMember(owner = "client!wf", name = "D", descriptor = "Lai;")
    private static class10 field3987 = class44.method278("Starting game engine)3)3)3", 99);

    @OriginalMember(owner = "client!wf", name = "H", descriptor = "Lai;")
    public static class10 field3991 = class44.method278("-5berpr-Ufen Sie Ihr Mitteilungsfach)3", -84);

    @OriginalMember(owner = "client!wf", name = "F", descriptor = "I")
    public static int field3989 = 0;

    @OriginalMember(owner = "client!wf", name = "w", descriptor = "Lai;")
    private static class10 field3980 = class44.method278("FULL", 123);

    @OriginalMember(owner = "client!wf", name = "p", descriptor = "Lai;")
    public static class10 field3973 = field3980;

    @OriginalMember(owner = "client!wf", name = "t", descriptor = "Lai;")
    public static class10 field3977 = field3979;

    @OriginalMember(owner = "client!wf", name = "B", descriptor = "Lai;")
    public static class10 field3985 = class44.method278("logo", -98);

    @OriginalMember(owner = "client!wf", name = "q", descriptor = "Lai;")
    public static class10 field3974 = field3987;

    @OriginalMember(owner = "client!wf", name = "x", descriptor = "Lai;")
    public static class10 field3981 = field3979;

    @OriginalMember(owner = "client!wf", name = "u", descriptor = "I")
    public static int field3978;

    @OriginalMember(owner = "client!wf", name = "z", descriptor = "I")
    public static int field3983;

    @OriginalMember(owner = "client!wf", name = "A", descriptor = "I")
    public static int field3984;

    @OriginalMember(owner = "client!wf", name = "C", descriptor = "I")
    public static int field3986;

    @OriginalMember(owner = "client!wf", name = "I", descriptor = "I")
    public static int field3992;

    @OriginalMember(owner = "client!wf", name = "J", descriptor = "I")
    public static int field3993;

    @OriginalMember(owner = "client!wf", name = "E", descriptor = "Ljc;")
    public static class85 field3988;

    @OriginalMember(owner = "client!wf", name = "G", descriptor = "[[Lwa;")
    public static class200[][] field3990;

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "(I)V")
    public static void method1321(int arg0) {
        field3991 = null;
        field3973 = null;
        field3988 = null;
        field3974 = null;
        field3979 = null;
        field3980 = null;
        field3985 = null;
        field3990 = null;
        field3981 = null;
        field3987 = null;
        if (arg0 != 0) {
            method1321(104);
        }
        field3977 = null;
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(ILwa;I)Lai;")
    public static final class10 method1322(int arg0, class200 arg1, int arg2) {
        field3992++;
        if (!class149.method1022(class203.method1318(arg2, arg1), arg0, arg2 ^ 0xFFFFFF8F) && arg1.field3762 == null) {
            return null;
        } else if (arg1.field3780 == null || arg1.field3780.length <= arg0 || arg1.field3780[arg0] == null || arg1.field3780[arg0].method68(-49).method40((byte) 107) == 0) {
            return class206.field4004 ? class67.method440(0, new class10[] { class159.field3066, class119.method846(0, arg0) }) : null;
        } else {
            return arg1.field3780[arg0];
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(IILc;ZII)V")
    public static final void method1323(int arg0, int arg1, class21 arg2, boolean arg3, int arg4, int arg5) {
        class6.field76 = arg5;
        field3978++;
        class75.field1290 = 1;
        class172.field3332 = arg3;
        class122.field2348 = arg4;
        class157.field3022 = arg1;
        class149.field2872 = arg0;
        class25.field387 = arg2;
    }

    @OriginalMember(owner = "client!wf", name = "<init>", descriptor = "(II)V")
    public class205(int arg0, int arg1) {
        this.field3975 = arg1;
        this.field3982 = arg0;
    }
}
