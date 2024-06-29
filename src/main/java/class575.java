import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cr")
public class class575 {

    @OriginalMember(owner = "client!cr", name = "b", descriptor = "Z")
    private boolean field8132 = true;

    @OriginalMember(owner = "client!cr", name = "i", descriptor = "I")
    public int field8139 = 443;

    @OriginalMember(owner = "client!cr", name = "f", descriptor = "I")
    public int field8136 = 43594;

    @OriginalMember(owner = "client!cr", name = "n", descriptor = "Z")
    private boolean field8144 = false;

    @OriginalMember(owner = "client!cr", name = "e", descriptor = "Z")
    public static boolean field8135 = false;

    @OriginalMember(owner = "client!cr", name = "m", descriptor = "Lqe;")
    public static class469 field8143 = new class469(7, 0);

    @OriginalMember(owner = "client!cr", name = "p", descriptor = "[[Z")
    public static boolean[][] field8146 = new boolean[][] { new boolean[4], { false, true, true, false }, { true, false, true, false }, { true, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, { true, true, false, false }, new boolean[4], { false, true, false, true }, new boolean[4] };

    @OriginalMember(owner = "client!cr", name = "o", descriptor = "Lio;")
    public static class439 field8145 = new class439(6, 1);

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "I")
    public int field8131;

    @OriginalMember(owner = "client!cr", name = "c", descriptor = "I")
    public static int field8133;

    @OriginalMember(owner = "client!cr", name = "d", descriptor = "I")
    public static int field8134;

    @OriginalMember(owner = "client!cr", name = "g", descriptor = "I")
    public static int field8137;

    @OriginalMember(owner = "client!cr", name = "j", descriptor = "I")
    public static int field8140;

    @OriginalMember(owner = "client!cr", name = "k", descriptor = "I")
    public static int field8141;

    @OriginalMember(owner = "client!cr", name = "h", descriptor = "Ljava/lang/String;")
    public String field8138;

    @OriginalMember(owner = "client!cr", name = "l", descriptor = "[I")
    public static int[] field8142;

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(Z)V", line = 3)
    public static void method3331(boolean arg0) {
        field8146 = null;
        field8142 = null;
        if (!arg0) {
            field8145 = null;
        }
        field8145 = null;
        field8143 = null;
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(I)V", line = 17)
    public final void method3332(int arg0) {
        if (arg0 != -12506) {
            this.field8131 = 63;
        }
        field8134++;
        if (!this.field8132) {
            this.field8144 = true;
            this.field8132 = true;
        } else if (this.field8144) {
            this.field8144 = false;
        } else {
            this.field8132 = false;
        }
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(IIII)I", line = 46)
    public static final int method3333(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg0 & 0x3;
        field8133++;
        if (arg3 != -29237) {
            return 45;
        } else if (var4 == 0) {
            return arg1;
        } else if (var4 == 1) {
            return arg2;
        } else if (var4 == 2) {
            return 7 - arg1;
        } else {
            return 7 - arg2;
        }
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(Lge;Z)Ltj;", line = 79)
    public final class197 method3334(class711 arg0, boolean arg1) {
        if (arg1) {
            this.field8136 = 13;
        }
        field8137++;
        return arg0.method4047(65535, this.field8138, this.field8144, this.field8132 ? this.field8139 : this.field8136);
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(ILcr;)Z", line = 95)
    public final boolean method3335(int arg0, class575 arg1) {
        field8140++;
        if (arg0 <= 90) {
            method3336(53, (byte) -10);
        }
        if (arg1 == null) {
            return false;
        } else {
            return this.field8131 == arg1.field8131 && this.field8138.equals(arg1.field8138);
        }
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(IB)V", line = 115)
    public static final void method3336(int arg0, byte arg1) {
        field8141++;
        if (arg1 != -30) {
            field8145 = null;
        }
        class150 var2 = class676.method3885(arg1 ^ 0xFFFFFC0A, 5, arg0);
        var2.method1115(true);
    }
}
