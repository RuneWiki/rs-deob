import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pba")
public class class59 {

    @OriginalMember(owner = "client!pba", name = "c", descriptor = "Lqk;")
    public static class1 field683 = new class1(46, 3);

    @OriginalMember(owner = "client!pba", name = "d", descriptor = "Lqk;")
    public static class1 field684 = new class1(76, 3);

    @OriginalMember(owner = "client!pba", name = "g", descriptor = "J")
    public static volatile long field687 = 0L;

    @OriginalMember(owner = "client!pba", name = "a", descriptor = "I")
    public static int field681;

    @OriginalMember(owner = "client!pba", name = "b", descriptor = "I")
    public static int field682;

    @OriginalMember(owner = "client!pba", name = "e", descriptor = "I")
    public static int field685;

    @OriginalMember(owner = "client!pba", name = "f", descriptor = "[Lho;")
    public static class318[] field686;

    @OriginalMember(owner = "client!pba", name = "h", descriptor = "[[[Lug;")
    public static class472[][][] field688;

    @OriginalMember(owner = "client!pba", name = "a", descriptor = "(III)V")
    public static final void method480(int arg0, int arg1, int arg2) {
        field682++;
        int var3 = class705.field9812.method1953(class712.field9877.method3999(class553.field7667, (byte) -106), (byte) -53);
        int var5;
        if (class48.field577) {
            for (class498 var4 = (class498) class362.field5218.method1140(-112); var4 != null; var4 = (class498) class362.field5218.method1138(112)) {
                int var6;
                if (var4.field6833 == 1) {
                    var6 = class140.method928(-1, (class171) var4.field6826.field2266.field591);
                } else {
                    var6 = class483.method2872(var4, arg2);
                }
                if (var3 < var6) {
                    var3 = var6;
                }
            }
            var3 += 8;
            var5 = class367.field5278 * 16 + 21;
            class625.field8753 = class367.field5278 * 16 + (class474.field6578 ? 26 : 22);
        } else {
            for (class171 var7 = (class171) class646.field9038.method1041(arg2 ^ 0x100100); var7 != null; var7 = (class171) class646.field9038.method1033(arg2 - 1)) {
                int var10 = class140.method928(~arg2, var7);
                if (var3 < var10) {
                    var3 = var10;
                }
            }
            class625.field8753 = (class474.field6578 ? 26 : 22) + class640.field8992 * 16;
            var3 += 8;
            var5 = class640.field8992 * 16 + 21;
        }
        int var8 = arg1 - (var3 / 2);
        if (class742.field10226 < var3 + var8) {
            var8 = class742.field10226 - var3;
        }
        if (var8 < 0) {
            var8 = 0;
        }
        int var9 = arg0;
        if (var5 + arg0 > class249.field3700) {
            var9 = class249.field3700 - var5;
        }
        if (var9 < arg2) {
            var9 = 0;
        }
        class689.field9609 = var8;
        class221.field3026 = var9;
        class788.field10819 = var3;
        class263.field3850 = true;
    }

    @OriginalMember(owner = "client!pba", name = "a", descriptor = "(Z)V")
    public static void method481(boolean arg0) {
        field686 = null;
        field684 = null;
        field683 = null;
        if (!arg0) {
            field688 = null;
        }
    }
}
