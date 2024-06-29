import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ug")
public class class263 {

    @OriginalMember(owner = "client!ug", name = "l", descriptor = "I")
    public int field4672;

    @OriginalMember(owner = "client!ug", name = "k", descriptor = "I")
    public int field4671;

    @OriginalMember(owner = "client!ug", name = "f", descriptor = "I")
    public int field4666;

    @OriginalMember(owner = "client!ug", name = "i", descriptor = "I")
    public int field4669;

    @OriginalMember(owner = "client!ug", name = "h", descriptor = "Lli;")
    public static class185 field4668 = class245.method1649("loginscreen", 126);

    @OriginalMember(owner = "client!ug", name = "g", descriptor = "Lli;")
    public static class185 field4667 = class245.method1649("Regarder dans cette direction", 125);

    @OriginalMember(owner = "client!ug", name = "d", descriptor = "[I")
    public static int[] field4664 = new int[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

    @OriginalMember(owner = "client!ug", name = "j", descriptor = "Lli;")
    public static class185 field4670 = class245.method1649("Attaquer", -75);

    @OriginalMember(owner = "client!ug", name = "m", descriptor = "[[I")
    public static int[][] field4673 = new int[104][104];

    @OriginalMember(owner = "client!ug", name = "n", descriptor = "Lli;")
    public static class185 field4674 = class245.method1649("p11_full", 125);

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "I")
    public static int field4661;

    @OriginalMember(owner = "client!ug", name = "e", descriptor = "I")
    public static int field4665;

    @OriginalMember(owner = "client!ug", name = "c", descriptor = "Lp;")
    public static class82 field4663;

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "[I")
    public static int[] field4662;

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(I)V")
    public static final void method1794(int arg0) {
        if (arg0 == 30087) {
            class63.field1103.method86(arg0 - 30087);
            field4661++;
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(Lhi;ILhi;Lhi;Lhi;)V")
    public static final void method1795(class250 arg0, int arg1, class250 arg2, class250 arg3, class250 arg4) {
        field4665++;
        if (arg1 != -32050) {
            field4670 = null;
        }
        class48.field791 = arg0;
        class142.field2725 = arg2;
        class128.field2291 = arg3;
        class271.field4814 = arg4;
        class136.field2557 = new class82[class142.field2725.method1699((byte) 16)][];
        class27.field461 = new boolean[class142.field2725.method1699((byte) 16)];
    }

    @OriginalMember(owner = "client!ug", name = "<init>", descriptor = "()V")
    public class263() {
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(B)V")
    public static void method1796(byte arg0) {
        field4662 = null;
        field4664 = null;
        field4668 = null;
        field4663 = null;
        field4674 = null;
        field4670 = null;
        field4667 = null;
        field4673 = null;
        if (arg0 < 34) {
            method1795((class250) null, 125, (class250) null, (class250) null, (class250) null);
        }
    }

    @OriginalMember(owner = "client!ug", name = "<init>", descriptor = "(Lug;)V")
    public class263(class263 arg0) {
        this.field4672 = arg0.field4672;
        this.field4671 = arg0.field4671;
        this.field4666 = arg0.field4666;
        this.field4669 = arg0.field4669;
    }
}
