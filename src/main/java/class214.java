import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hd")
public class class214 {

    @OriginalMember(owner = "client!hd", name = "p", descriptor = "I")
    private int field3691 = 0;

    @OriginalMember(owner = "client!hd", name = "j", descriptor = "[Lrb;")
    private class41[] field3685;

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "I")
    private int field3677;

    @OriginalMember(owner = "client!hd", name = "g", descriptor = "I")
    public static int field3682 = 0;

    @OriginalMember(owner = "client!hd", name = "h", descriptor = "I")
    public static int field3683 = 0;

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "I")
    public static int field3676;

    @OriginalMember(owner = "client!hd", name = "c", descriptor = "I")
    public static int field3678;

    @OriginalMember(owner = "client!hd", name = "e", descriptor = "I")
    public static int field3680;

    @OriginalMember(owner = "client!hd", name = "i", descriptor = "I")
    public static int field3684;

    @OriginalMember(owner = "client!hd", name = "k", descriptor = "I")
    public static int field3686;

    @OriginalMember(owner = "client!hd", name = "l", descriptor = "I")
    public static int field3687;

    @OriginalMember(owner = "client!hd", name = "n", descriptor = "I")
    public static int field3689;

    @OriginalMember(owner = "client!hd", name = "q", descriptor = "I")
    public static int field3692;

    @OriginalMember(owner = "client!hd", name = "d", descriptor = "J")
    private long field3679;

    @OriginalMember(owner = "client!hd", name = "f", descriptor = "Lni;")
    public static class118 field3681;

    @OriginalMember(owner = "client!hd", name = "m", descriptor = "Lrb;")
    private class41 field3688;

    @OriginalMember(owner = "client!hd", name = "o", descriptor = "Lrb;")
    private class41 field3690;

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(Z)V")
    public static void method1417(boolean arg0) {
        if (arg0) {
            field3681 = null;
        }
        field3681 = null;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(I)Lrb;")
    public final class41 method1418(int arg0) {
        field3687++;
        this.field3691 = arg0;
        return this.method1421(false);
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(B)I")
    public final int method1419(byte arg0) {
        field3680++;
        int var2 = 83 / ((1 - arg0) / 50);
        return this.field3677;
    }

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "(I)V")
    public final void method1420(int arg0) {
        field3684++;
        for (int var2 = 0; var2 < this.field3677; var2++) {
            class41 var3 = this.field3685[var2];
            while (true) {
                class41 var4 = var3.field605;
                if (var3 == var4) {
                    break;
                }
                var4.method290((byte) -48);
            }
        }
        this.field3688 = null;
        this.field3690 = null;
        if (arg0 != 5125) {
            this.field3690 = null;
        }
    }

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "(Z)Lrb;")
    public final class41 method1421(boolean arg0) {
        if (arg0) {
            return null;
        }
        field3676++;
        if (this.field3691 > 0 && this.field3685[this.field3691 - 1] != this.field3690) {
            class41 var2 = this.field3690;
            this.field3690 = var2.field605;
            return var2;
        }
        while (this.field3691 < this.field3677) {
            class41 var3 = this.field3685[this.field3691++].field605;
            if (this.field3685[this.field3691 - 1] != var3) {
                this.field3690 = var3.field605;
                return var3;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(JLrb;I)V")
    public final void method1422(long arg0, class41 arg1, int arg2) {
        if (arg1.field618 != null) {
            arg1.method290((byte) -48);
        }
        class41 var5 = this.field3685[(int) ((long) (this.field3677 + arg2) & arg0)];
        field3692++;
        arg1.field618 = var5.field618;
        arg1.field605 = var5;
        arg1.field618.field605 = arg1;
        arg1.field605.field618 = arg1;
        arg1.field606 = arg0;
    }

    @OriginalMember(owner = "client!hd", name = "c", descriptor = "(Z)Lrb;")
    public final class41 method1423(boolean arg0) {
        field3678++;
        if (arg0) {
            this.method1422(0L, (class41) null, -36);
        }
        if (this.field3688 == null) {
            return null;
        }
        class41 var2 = this.field3685[(int) ((long) (this.field3677 - 1) & this.field3679)];
        while (this.field3688 != var2) {
            if (this.field3688.field606 == this.field3679) {
                class41 var3 = this.field3688;
                this.field3688 = this.field3688.field605;
                return var3;
            }
            this.field3688 = this.field3688.field605;
        }
        this.field3688 = null;
        return null;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(ZJ)Lrb;")
    public final class41 method1424(boolean arg0, long arg1) {
        field3689++;
        this.field3679 = arg1;
        class41 var4 = this.field3685[(int) ((long) (this.field3677 - 1) & arg1)];
        for (this.field3688 = var4.field605; this.field3688 != var4; this.field3688 = this.field3688.field605) {
            if (this.field3688.field606 == arg1) {
                class41 var5 = this.field3688;
                this.field3688 = this.field3688.field605;
                return var5;
            }
        }
        if (arg0) {
            this.field3688 = null;
            return null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!hd", name = "<init>", descriptor = "(I)V")
    public class214(int arg0) {
        this.field3685 = new class41[arg0];
        this.field3677 = arg0;
        for (int var2 = 0; var2 < arg0; var2++) {
            class41 var3 = this.field3685[var2] = new class41();
            var3.field605 = var3;
            var3.field618 = var3;
        }
    }
}
