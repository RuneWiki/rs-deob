import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cc")
public abstract class class271 {

    @OriginalMember(owner = "client!cc", name = "c", descriptor = "I")
    public int field4714;

    @OriginalMember(owner = "client!cc", name = "g", descriptor = "I")
    public int field4718;

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "I")
    public int field4713;

    @OriginalMember(owner = "client!cc", name = "d", descriptor = "Lmb;")
    public static class96 field4715 = class243.method1708("Stufe: ", (byte) 103);

    @OriginalMember(owner = "client!cc", name = "f", descriptor = "[I")
    public static int[] field4717 = new int[100];

    @OriginalMember(owner = "client!cc", name = "e", descriptor = "I")
    public static int field4716;

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "Lff;")
    public static class3 field4712;

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(III)Lkh;")
    public static final class5 method1848(int arg0, int arg1, int arg2) {
        class187 var3 = class259.field4487[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class5 var4 = var3.field3279;
            var3.field3279 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(IBI)V")
    public abstract void method766(int arg0, byte arg1, int arg2);

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "(III)V")
    public abstract void method768(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(I)V")
    public static void method1849(int arg0) {
        if (arg0 != -18421) {
            field4715 = null;
        }
        field4717 = null;
        field4715 = null;
        field4712 = null;
    }

    @OriginalMember(owner = "client!cc", name = "c", descriptor = "(III)V")
    public abstract void method769(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lff;Lff;B)I")
    public static final int method1850(class3 arg0, class3 arg1, byte arg2) {
        field4716++;
        int var3 = 0;
        if (arg1.method15(127, class147.field2614)) {
            var3++;
        }
        if (arg1.method15(-105, class274.field4767)) {
            var3++;
        }
        if (arg2 >= -125) {
            return 82;
        }
        if (arg1.method15(-105, class138.field2472)) {
            var3++;
        }
        if (arg0.method15(126, class147.field2614)) {
            var3++;
        }
        if (arg0.method15(-101, class274.field4767)) {
            var3++;
        }
        if (arg0.method15(104, class138.field2472)) {
            var3++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!cc", name = "<init>", descriptor = "(III)V")
    public class271(int arg0, int arg1, int arg2) {
        this.field4714 = arg1;
        this.field4718 = arg0;
        this.field4713 = arg2;
    }
}
