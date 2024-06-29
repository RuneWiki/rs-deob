import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wn")
public class class548 extends class623 {

    @OriginalMember(owner = "client!wn", name = "E", descriptor = "I")
    public static int field7736 = -1;

    @OriginalMember(owner = "client!wn", name = "C", descriptor = "I")
    public static int field7734 = 0;

    @OriginalMember(owner = "client!wn", name = "s", descriptor = "I")
    public static int field7724;

    @OriginalMember(owner = "client!wn", name = "t", descriptor = "I")
    public int field7725;

    @OriginalMember(owner = "client!wn", name = "u", descriptor = "I")
    public int field7726;

    @OriginalMember(owner = "client!wn", name = "w", descriptor = "I")
    public int field7728;

    @OriginalMember(owner = "client!wn", name = "x", descriptor = "I")
    public static int field7729;

    @OriginalMember(owner = "client!wn", name = "y", descriptor = "I")
    public static int field7730;

    @OriginalMember(owner = "client!wn", name = "A", descriptor = "I")
    public static int field7732;

    @OriginalMember(owner = "client!wn", name = "B", descriptor = "I")
    public static int field7733;

    @OriginalMember(owner = "client!wn", name = "D", descriptor = "I")
    public static int field7735;

    @OriginalMember(owner = "client!wn", name = "z", descriptor = "Lkha;")
    public static class687 field7731;

    @OriginalMember(owner = "client!wn", name = "v", descriptor = "Ljava/lang/String;")
    public String field7727;

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(III)Ltd;", line = 5)
    public static final class525 method3123(int arg0, int arg1, int arg2) {
        class73 var3 = class495.field7002[arg0][arg1][arg2];
        return var3 == null ? null : var3.field973;
    }

    @OriginalMember(owner = "client!wn", name = "b", descriptor = "(I)I", line = 13)
    public final int method3124(int arg0) {
        if (arg0 != -9816) {
            this.field7728 = -81;
        }
        ++field7733;
        return (int) super.field8746;
    }

    @OriginalMember(owner = "client!wn", name = "c", descriptor = "(I)V", line = 25)
    public static void method3125(int arg0) {
        if (arg0 < -123) {
            field7731 = null;
        }
    }

    @OriginalMember(owner = "client!wn", name = "b", descriptor = "(B)J", line = 41)
    public final long method3126(byte arg0) {
        ++field7730;
        if (arg0 != 14) {
            this.method3129(99);
        }
        return super.field8700 & Long.MAX_VALUE;
    }

    @OriginalMember(owner = "client!wn", name = "<init>", descriptor = "(II)V", line = 51)
    public class548(int arg0, int arg1) {
        super.field8746 = (long) arg0 << 32 | (long) arg1;
    }

    @OriginalMember(owner = "client!wn", name = "e", descriptor = "(B)V", line = 60)
    public final void method3127(byte arg0) {
        int var2 = -57 / ((arg0 - 65) / 53);
        ++field7724;
        super.field8700 = super.field8700 & Long.MIN_VALUE | 500L + class97.method654((byte) 118);
        class508.field7176.method2564(this, (byte) -123);
    }

    @OriginalMember(owner = "client!wn", name = "e", descriptor = "(I)V", line = 72)
    public static final void method3128(int arg0) {
        if (arg0 < 94) {
            method3123(-118, -80, 99);
        }
        class421.field5993.method776((byte) -126);
        ++field7729;
    }

    @OriginalMember(owner = "client!wn", name = "f", descriptor = "(I)I", line = 83)
    public final int method3129(int arg0) {
        ++field7732;
        if (arg0 != 2053437664) {
            this.field7727 = null;
        }
        return (int) (255L & super.field8746 >>> 32);
    }

    @OriginalMember(owner = "client!wn", name = "g", descriptor = "(I)V", line = 101)
    public final void method3130(int arg0) {
        ++field7735;
        super.field8700 |= Long.MIN_VALUE;
        if (arg0 <= 52) {
            this.method3129(58);
        }
        if (this.method3126((byte) 14) == 0L) {
            class56.field803.method2564(this, (byte) -123);
        }
    }
}
