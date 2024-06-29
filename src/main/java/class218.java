import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!js")
public abstract class class218 {

    @OriginalMember(owner = "client!js", name = "c", descriptor = "[[I")
    public static int[][] field2782 = new int[][] { { 6, 6 }, { 6, 6 }, { 6, 5, 5 }, { 5, 6, 5 }, { 5, 5, 6 }, { 6, 5, 5 }, { 5, 0, 4, 1 }, { 7, 7, 1, 2 }, { 7, 1, 2, 7 }, { 8, 9, 4, 0, 8, 9 }, { 0, 8, 9, 8, 9, 4 }, { 11, 0, 10, 11, 4, 2 }, { 6, 6 }, { 7, 7, 1, 2 }, { 7, 7, 1, 2 } };

    @OriginalMember(owner = "client!js", name = "a", descriptor = "Lkg;")
    public static class179 field2780 = new class179(69, 8);

    @OriginalMember(owner = "client!js", name = "f", descriptor = "I")
    public static int field2785 = 0;

    @OriginalMember(owner = "client!js", name = "b", descriptor = "I")
    public static int field2781;

    @OriginalMember(owner = "client!js", name = "d", descriptor = "I")
    public static int field2783;

    @OriginalMember(owner = "client!js", name = "e", descriptor = "Lni;")
    public static class363 field2784;

    @OriginalMember(owner = "client!js", name = "g", descriptor = "[S")
    public static short[] field2786;

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(B)V", line = 12)
    public static void method1338(byte arg0) {
        field2782 = null;
        field2786 = null;
        field2784 = null;
        int var1 = 77 / ((arg0 + 28) / 40);
        field2780 = null;
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(IIIB)V", line = 26)
    public static final void method1339(int arg0, int arg1, int arg2, byte arg3) {
        class379.field4998 = new byte[arg0][arg2][arg1];
        field2781++;
        int var4 = -93 / ((arg3 + 74) / 40);
    }

    @OriginalMember(owner = "client!js", name = "g", descriptor = "(I)Z", line = 48)
    public final boolean method1342(int arg0) {
        field2783++;
        if (arg0 != 1) {
            this.method1343((byte) 80);
        }
        return this.method1336(7) || this.method1334(5) || this.method1335(arg0 - 128);
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(I)I")
    public abstract int method1333(int arg0);

    @OriginalMember(owner = "client!js", name = "b", descriptor = "(I)Z")
    public abstract boolean method1334(int arg0);

    @OriginalMember(owner = "client!js", name = "c", descriptor = "(I)Z")
    public abstract boolean method1335(int arg0);

    @OriginalMember(owner = "client!js", name = "d", descriptor = "(I)Z")
    public abstract boolean method1336(int arg0);

    @OriginalMember(owner = "client!js", name = "e", descriptor = "(I)I")
    public abstract int method1337(int arg0);

    @OriginalMember(owner = "client!js", name = "b", descriptor = "(B)V")
    public abstract void method1340(byte arg0);

    @OriginalMember(owner = "client!js", name = "f", descriptor = "(I)Lic;")
    public abstract class494 method1341(int arg0);

    @OriginalMember(owner = "client!js", name = "c", descriptor = "(B)V")
    public abstract void method1343(byte arg0);
}
