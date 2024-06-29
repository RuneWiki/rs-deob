import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!s")
public class class30 {

    @OriginalMember(owner = "mapview!s", name = "g", descriptor = "[Lm;")
    private class23[] field329;

    @OriginalMember(owner = "mapview!s", name = "h", descriptor = "I")
    private int field330;

    @OriginalMember(owner = "mapview!s", name = "a", descriptor = "Lt;")
    public static class31 field323 = class14.method84(119, "Combat Training");

    @OriginalMember(owner = "mapview!s", name = "c", descriptor = "Lt;")
    public static class31 field325 = class14.method84(125, "???");

    @OriginalMember(owner = "mapview!s", name = "i", descriptor = "Lt;")
    public static class31 field331 = class14.method84(108, "underlay)3dat");

    @OriginalMember(owner = "mapview!s", name = "e", descriptor = "I")
    public static volatile int field327 = -1;

    @OriginalMember(owner = "mapview!s", name = "d", descriptor = "Lt;")
    public static class31 field326 = class14.method84(117, "Key");

    @OriginalMember(owner = "mapview!s", name = "k", descriptor = "Lt;")
    public static class31 field333 = class14.method84(122, "Archery Shop");

    @OriginalMember(owner = "mapview!s", name = "j", descriptor = "I")
    public static int field332;

    @OriginalMember(owner = "mapview!s", name = "f", descriptor = "J")
    private long field328;

    @OriginalMember(owner = "mapview!s", name = "b", descriptor = "Lm;")
    private class23 field324;

    @OriginalMember(owner = "mapview!s", name = "a", descriptor = "(IJ)Lm;", line = 11)
    public final class23 method176(int arg0, long arg1) {
        this.field328 = arg1;
        class23 var4 = this.field329[(int) ((long) (this.field330 + arg0) & arg1)];
        for (this.field324 = var4.field198; this.field324 != var4; this.field324 = this.field324.field198) {
            if (this.field324.field197 == arg1) {
                class23 var5 = this.field324;
                this.field324 = this.field324.field198;
                return var5;
            }
        }
        this.field324 = null;
        return null;
    }

    @OriginalMember(owner = "mapview!s", name = "a", descriptor = "(Z)Lm;", line = 61)
    public final class23 method177(boolean arg0) {
        if (this.field324 == null) {
            return null;
        }
        if (!arg0) {
            field323 = null;
        }
        class23 var2 = this.field329[(int) ((long) (this.field330 - 1) & this.field328)];
        while (this.field324 != var2) {
            if (this.field324.field197 == this.field328) {
                class23 var3 = this.field324;
                this.field324 = this.field324.field198;
                return var3;
            }
            this.field324 = this.field324.field198;
        }
        this.field324 = null;
        return null;
    }

    @OriginalMember(owner = "mapview!s", name = "<init>", descriptor = "(I)V", line = 101)
    public class30(int arg0) {
        this.field329 = new class23[arg0];
        this.field330 = arg0;
        for (int var2 = 0; var2 < arg0; var2++) {
            class23 var3 = this.field329[var2] = new class23();
            var3.field199 = var3;
            var3.field198 = var3;
        }
    }

    @OriginalMember(owner = "mapview!s", name = "a", descriptor = "(Lm;JI)V", line = 131)
    public final void method178(class23 arg0, long arg1, int arg2) {
        if (arg0.field199 != null) {
            arg0.method132(25914);
        }
        class23 var5 = this.field329[(int) (arg1 & (long) (this.field330 - arg2))];
        arg0.field198 = var5;
        arg0.field199 = var5.field199;
        arg0.field199.field198 = arg0;
        arg0.field198.field199 = arg0;
        arg0.field197 = arg1;
    }

    @OriginalMember(owner = "mapview!s", name = "a", descriptor = "(I)V", line = 148)
    public static void method179(int arg0) {
        field331 = null;
        if (arg0 != -1) {
            field326 = null;
        }
        field323 = null;
        field326 = null;
        field325 = null;
        field333 = null;
    }
}
