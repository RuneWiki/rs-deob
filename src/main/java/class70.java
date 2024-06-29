import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mj")
public abstract class class70 extends class49 {

    @OriginalMember(owner = "client!mj", name = "h", descriptor = "I")
    public int field971;

    @OriginalMember(owner = "client!mj", name = "c", descriptor = "I")
    public int field966;

    @OriginalMember(owner = "client!mj", name = "d", descriptor = "I")
    public int field967;

    @OriginalMember(owner = "client!mj", name = "e", descriptor = "I")
    public int field968;

    @OriginalMember(owner = "client!mj", name = "f", descriptor = "[I")
    public static int[] field969 = new int[14];

    @OriginalMember(owner = "client!mj", name = "g", descriptor = "I")
    public static int field970;

    @OriginalMember(owner = "client!mj", name = "i", descriptor = "I")
    public static int field972;

    @OriginalMember(owner = "client!mj", name = "j", descriptor = "Lns;")
    public static class438 field973;

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(Lns;I)V", line = 7)
    public static final void method479(class438 arg0, int arg1) {
        int var2 = 41 % ((33 - arg1) / 49);
        field970++;
        class85.field1161 = arg0;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(Lns;Lns;Lns;Lns;B)V", line = 18)
    public static final void method480(class438 arg0, class438 arg1, class438 arg2, class438 arg3, byte arg4) {
        field973 = arg3;
        if (arg4 != 71) {
            method481(-34);
        }
        class97.field1407 = arg1;
        class69.field957 = arg0;
        field972++;
        class94.field1371 = arg2;
        class59.field791 = new class499[field973.method2649(arg4)][];
        class270.field3738 = new boolean[field973.method2649(-90)];
    }

    @OriginalMember(owner = "client!mj", name = "f", descriptor = "(I)V", line = 34)
    public static void method481(int arg0) {
        int var1 = -124 % ((3 - arg0) / 63);
        field973 = null;
        field969 = null;
    }

    @OriginalMember(owner = "client!mj", name = "<init>", descriptor = "(IIII)V", line = 45)
    public class70(int arg0, int arg1, int arg2, int arg3) {
        this.field971 = arg1;
        this.field966 = arg0;
        this.field967 = arg3;
        this.field968 = arg2;
    }
}
