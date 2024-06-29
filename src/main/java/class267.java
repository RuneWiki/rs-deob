import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jfa")
public class class267 {

    @OriginalMember(owner = "client!jfa", name = "d", descriptor = "I")
    private int field3703;

    @OriginalMember(owner = "client!jfa", name = "a", descriptor = "[Ldaa;")
    private class11[] field3700;

    @OriginalMember(owner = "client!jfa", name = "h", descriptor = "Ldb;")
    public static class298 field3707 = new class298(111, 3);

    @OriginalMember(owner = "client!jfa", name = "j", descriptor = "[I")
    public static int[] field3709 = new int[2];

    @OriginalMember(owner = "client!jfa", name = "i", descriptor = "Lcu;")
    public static class206 field3708 = new class206(74, -1);

    @OriginalMember(owner = "client!jfa", name = "c", descriptor = "I")
    public static int field3702;

    @OriginalMember(owner = "client!jfa", name = "e", descriptor = "I")
    public static int field3704;

    @OriginalMember(owner = "client!jfa", name = "f", descriptor = "I")
    public static int field3705;

    @OriginalMember(owner = "client!jfa", name = "b", descriptor = "J")
    private long field3701;

    @OriginalMember(owner = "client!jfa", name = "g", descriptor = "Ldaa;")
    private class11 field3706;

    @OriginalMember(owner = "client!jfa", name = "a", descriptor = "(JI)Ldaa;")
    public final class11 method1629(long arg0, int arg1) {
        field3704++;
        this.field3701 = arg0;
        if (arg1 != 3) {
            this.method1631(-95);
        }
        class11 var4 = this.field3700[(int) (arg0 & (long) (this.field3703 - 1))];
        for (this.field3706 = var4.field211; this.field3706 != var4; this.field3706 = this.field3706.field211) {
            if (this.field3706.field207 == arg0) {
                class11 var5 = this.field3706;
                this.field3706 = this.field3706.field211;
                return var5;
            }
        }
        this.field3706 = null;
        return null;
    }

    @OriginalMember(owner = "client!jfa", name = "a", descriptor = "(JLdaa;B)V")
    public final void method1630(long arg0, class11 arg1, byte arg2) {
        field3705++;
        if (arg1.field208 != null) {
            arg1.method131(123);
        }
        class11 var5 = this.field3700[(int) (arg0 & (long) (this.field3703 - 1))];
        arg1.field211 = var5;
        int var6 = -97 % ((41 - arg2) / 53);
        arg1.field208 = var5.field208;
        arg1.field208.field211 = arg1;
        arg1.field207 = arg0;
        arg1.field211.field208 = arg1;
    }

    @OriginalMember(owner = "client!jfa", name = "a", descriptor = "(I)Ldaa;")
    public final class11 method1631(int arg0) {
        field3702++;
        if (arg0 != 5166) {
            this.field3700 = null;
        }
        if (this.field3706 == null) {
            return null;
        }
        class11 var2 = this.field3700[(int) ((long) (this.field3703 - 1) & this.field3701)];
        while (this.field3706 != var2) {
            if (this.field3706.field207 == this.field3701) {
                class11 var3 = this.field3706;
                this.field3706 = this.field3706.field211;
                return var3;
            }
            this.field3706 = this.field3706.field211;
        }
        this.field3706 = null;
        return null;
    }

    @OriginalMember(owner = "client!jfa", name = "b", descriptor = "(I)V")
    public static void method1632(int arg0) {
        field3708 = null;
        field3707 = null;
        if (arg0 != 0) {
            field3707 = null;
        }
        field3709 = null;
    }

    @OriginalMember(owner = "client!jfa", name = "<init>", descriptor = "(I)V")
    public class267(int arg0) {
        this.field3703 = arg0;
        this.field3700 = new class11[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class11 var3 = this.field3700[var2] = new class11();
            var3.field208 = var3;
            var3.field211 = var3;
        }
    }
}
