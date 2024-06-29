import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ah")
public class class9 {

    @OriginalMember(owner = "client!ah", name = "w", descriptor = "I")
    private int field175 = 0;

    @OriginalMember(owner = "client!ah", name = "b", descriptor = "I")
    private int field154;

    @OriginalMember(owner = "client!ah", name = "d", descriptor = "[Lo;")
    private class132[] field156;

    @OriginalMember(owner = "client!ah", name = "h", descriptor = "I")
    public static int field160 = 2;

    @OriginalMember(owner = "client!ah", name = "l", descriptor = "Ltg;")
    public static class184 field164 = class135.method812("sl_flags", 3);

    @OriginalMember(owner = "client!ah", name = "m", descriptor = "[[I")
    public static int[][] field165 = new int[104][104];

    @OriginalMember(owner = "client!ah", name = "r", descriptor = "I")
    public static int field170 = 0;

    @OriginalMember(owner = "client!ah", name = "g", descriptor = "Lah;")
    public static class9 field159 = new class9(4096);

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "I")
    public static int field153;

    @OriginalMember(owner = "client!ah", name = "c", descriptor = "I")
    public static int field155;

    @OriginalMember(owner = "client!ah", name = "e", descriptor = "I")
    public static int field157;

    @OriginalMember(owner = "client!ah", name = "i", descriptor = "I")
    public static int field161;

    @OriginalMember(owner = "client!ah", name = "j", descriptor = "I")
    public static int field162;

    @OriginalMember(owner = "client!ah", name = "k", descriptor = "I")
    public static int field163;

    @OriginalMember(owner = "client!ah", name = "o", descriptor = "I")
    public static int field167;

    @OriginalMember(owner = "client!ah", name = "p", descriptor = "I")
    public static int field168;

    @OriginalMember(owner = "client!ah", name = "s", descriptor = "I")
    public static int field171;

    @OriginalMember(owner = "client!ah", name = "f", descriptor = "J")
    private long field158;

    @OriginalMember(owner = "client!ah", name = "q", descriptor = "Lo;")
    private class132 field169;

    @OriginalMember(owner = "client!ah", name = "t", descriptor = "Lo;")
    private class132 field172;

    @OriginalMember(owner = "client!ah", name = "v", descriptor = "Lsc;")
    public static class171 field174;

    @OriginalMember(owner = "client!ah", name = "u", descriptor = "Lvb;")
    public static class197 field173;

    @OriginalMember(owner = "client!ah", name = "n", descriptor = "[Loe;")
    public static class137[] field166;

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(I)Lo;")
    public final class132 method49(int arg0) {
        if (arg0 != 1) {
            return null;
        }
        field167++;
        if (this.field175 > 0 && this.field156[this.field175 - 1] != this.field172) {
            class132 var2 = this.field172;
            this.field172 = var2.field2397;
            return var2;
        }
        while (this.field154 > this.field175) {
            class132 var3 = this.field156[this.field175++].field2397;
            if (this.field156[this.field175 - 1] != var3) {
                this.field172 = var3.field2397;
                return var3;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(ZI)Z")
    public static final boolean method50(boolean arg0, int arg1) {
        field157++;
        if (arg0) {
            method50(true, 95);
        }
        return (arg1 >> 30 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(JI)Lo;")
    public final class132 method51(long arg0, int arg1) {
        this.field158 = arg0;
        field163++;
        class132 var4 = this.field156[(int) (arg0 & (long) (this.field154 - 1))];
        for (this.field169 = var4.field2397; this.field169 != var4; this.field169 = this.field169.field2397) {
            if (this.field169.field2393 == arg0) {
                class132 var6 = this.field169;
                this.field169 = this.field169.field2397;
                return var6;
            }
        }
        this.field169 = null;
        int var5 = -18 / ((arg1 + 33) / 62);
        return null;
    }

    @OriginalMember(owner = "client!ah", name = "b", descriptor = "(I)Lo;")
    public final class132 method52(int arg0) {
        field153++;
        if (this.field169 == null) {
            return null;
        }
        class132 var2 = this.field156[(int) ((long) (this.field154 - 1) & this.field158)];
        if (arg0 <= 34) {
            return null;
        }
        while (this.field169 != var2) {
            if (this.field169.field2393 == this.field158) {
                class132 var3 = this.field169;
                this.field169 = this.field169.field2397;
                return var3;
            }
            this.field169 = this.field169.field2397;
        }
        this.field169 = null;
        return null;
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "([Lo;I)I")
    public final int method53(class132[] arg0, int arg1) {
        int var3 = arg1;
        for (int var4 = 0; var4 < this.field154; var4++) {
            class132 var5 = this.field156[var4];
            for (class132 var6 = var5.field2397; var6 != var5; var6 = var6.field2397) {
                arg0[var3++] = var6;
            }
        }
        field171++;
        return var3;
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(Z)V")
    public static void method54(boolean arg0) {
        if (!arg0) {
            field173 = null;
        }
        field165 = null;
        field173 = null;
        field174 = null;
        field166 = null;
        field164 = null;
        field159 = null;
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(BLo;J)V")
    public final void method55(byte arg0, class132 arg1, long arg2) {
        if (arg1.field2398 != null) {
            arg1.method797((byte) -112);
        }
        if (arg0 >= -69) {
            return;
        }
        field162++;
        class132 var5 = this.field156[(int) ((long) (this.field154 - 1) & arg2)];
        arg1.field2397 = var5;
        arg1.field2393 = arg2;
        arg1.field2398 = var5.field2398;
        arg1.field2398.field2397 = arg1;
        arg1.field2397.field2398 = arg1;
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(B)I")
    public final int method56(byte arg0) {
        field168++;
        int var2 = -67 % ((arg0 + 14) / 42);
        int var3 = 0;
        for (int var4 = 0; var4 < this.field154; var4++) {
            class132 var5 = this.field156[var4];
            for (class132 var6 = var5.field2397; var6 != var5; var6 = var6.field2397) {
                var3++;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ah", name = "c", descriptor = "(I)Lo;")
    public final class132 method57(int arg0) {
        this.field175 = 0;
        field161++;
        return arg0 == -19654 ? this.method49(1) : null;
    }

    @OriginalMember(owner = "client!ah", name = "<init>", descriptor = "(I)V")
    public class9(int arg0) {
        this.field154 = arg0;
        this.field156 = new class132[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class132 var3 = this.field156[var2] = new class132();
            var3.field2397 = var3;
            var3.field2398 = var3;
        }
    }
}
