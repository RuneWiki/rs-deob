import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hn")
public class class255 {

    @OriginalMember(owner = "client!hn", name = "c", descriptor = "I")
    public int field3688 = 0;

    @OriginalMember(owner = "client!hn", name = "g", descriptor = "Ljava/lang/String;")
    public static String field3692 = "Prepared sound engine";

    @OriginalMember(owner = "client!hn", name = "d", descriptor = "I")
    public static int field3689 = -1;

    @OriginalMember(owner = "client!hn", name = "h", descriptor = "Lvq;")
    public static class22 field3693 = new class22();

    @OriginalMember(owner = "client!hn", name = "l", descriptor = "[Z")
    public static boolean[] field3697 = new boolean[100];

    @OriginalMember(owner = "client!hn", name = "k", descriptor = "[[I")
    public static int[][] field3696 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 4 }, { 6, 0, 2 }, { 2, 6, 0 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 2, 4, 4 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 2, 2 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 4, 6, 6 }, { 0, 2, 4, 6 } };

    @OriginalMember(owner = "client!hn", name = "j", descriptor = "Lln;")
    public static class252 field3695 = class63.method488((byte) 123);

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "I")
    public static int field3686;

    @OriginalMember(owner = "client!hn", name = "b", descriptor = "I")
    public static int field3687;

    @OriginalMember(owner = "client!hn", name = "f", descriptor = "I")
    public static int field3691;

    @OriginalMember(owner = "client!hn", name = "i", descriptor = "I")
    public static int field3694;

    @OriginalMember(owner = "client!hn", name = "e", descriptor = "Lfh;")
    public static class210 field3690;

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(Z)V", line = 3)
    public static final void method1844(boolean arg0) {
        if (!arg0) {
            method1846(105);
        }
        field3687++;
        class334.field4792 = 0;
        int var1 = (class86.field1394.field6520 >> 7) + class379.field5384;
        int var2 = (class86.field1394.field6519 >> 7) + class294.field4362;
        if (var1 >= 3053 && var1 <= 3156 && var2 >= 3056 && var2 <= 3136) {
            class334.field4792 = 1;
        }
        if (var1 >= 3072 && var1 <= 3118 && var2 >= 9492 && var2 <= 9535) {
            class334.field4792 = 1;
        }
        if (class334.field4792 == 1 && var1 >= 3139 && var1 <= 3199 && var2 >= 3008 && var2 <= 3062) {
            class334.field4792 = 0;
        }
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(IILec;)V", line = 28)
    private final void method1845(int arg0, int arg1, class37 arg2) {
        if (arg0 != 4) {
            this.method1847((class37) null, 19);
        }
        if (arg1 == 5) {
            this.field3688 = arg2.method320((byte) -87);
        }
        field3686++;
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(I)V", line = 53)
    public static void method1846(int arg0) {
        field3696 = null;
        if (arg0 > -124) {
            field3696 = null;
        }
        field3693 = null;
        field3692 = null;
        field3695 = null;
        field3690 = null;
        field3697 = null;
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(Lec;I)V", line = 83)
    public final void method1847(class37 arg0, int arg1) {
        if (arg1 >= -6) {
            return;
        }
        field3694++;
        while (true) {
            int var3 = arg0.method271((byte) 109);
            if (var3 == 0) {
                return;
            }
            this.method1845(4, var3, arg0);
        }
    }
}
