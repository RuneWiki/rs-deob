import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sb")
public class class127 {

    @OriginalMember(owner = "client!sb", name = "u", descriptor = "I")
    private int field2886 = 0;

    @OriginalMember(owner = "client!sb", name = "m", descriptor = "I")
    private int field2878;

    @OriginalMember(owner = "client!sb", name = "j", descriptor = "[Lce;")
    private class20[] field2875;

    @OriginalMember(owner = "client!sb", name = "f", descriptor = "I")
    public static int field2871 = 0;

    @OriginalMember(owner = "client!sb", name = "e", descriptor = "Lsc;")
    private static class128 field2870 = class129.method1017(false, "Free world");

    @OriginalMember(owner = "client!sb", name = "i", descriptor = "Lsc;")
    public static class128 field2874 = class129.method1017(false, "scrollen:");

    @OriginalMember(owner = "client!sb", name = "o", descriptor = "Lsc;")
    private static class128 field2880 = class129.method1017(false, "Existing User");

    @OriginalMember(owner = "client!sb", name = "s", descriptor = "I")
    public static int field2884 = -1;

    @OriginalMember(owner = "client!sb", name = "r", descriptor = "Lsc;")
    public static class128 field2883 = class129.method1017(false, "me");

    @OriginalMember(owner = "client!sb", name = "t", descriptor = "Lsc;")
    public static class128 field2885 = field2870;

    @OriginalMember(owner = "client!sb", name = "d", descriptor = "Lsc;")
    public static class128 field2869 = field2880;

    @OriginalMember(owner = "client!sb", name = "l", descriptor = "I")
    public static int field2877 = 0;

    @OriginalMember(owner = "client!sb", name = "n", descriptor = "I")
    public static int field2879 = 0;

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "I")
    public static int field2867;

    @OriginalMember(owner = "client!sb", name = "c", descriptor = "I")
    public static int field2868;

    @OriginalMember(owner = "client!sb", name = "h", descriptor = "I")
    public static int field2873;

    @OriginalMember(owner = "client!sb", name = "k", descriptor = "I")
    public static int field2876;

    @OriginalMember(owner = "client!sb", name = "p", descriptor = "I")
    public static int field2881;

    @OriginalMember(owner = "client!sb", name = "q", descriptor = "I")
    public static int field2882;

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "J")
    private long field2866;

    @OriginalMember(owner = "client!sb", name = "g", descriptor = "Lce;")
    private class20 field2872;

    @OriginalMember(owner = "client!sb", name = "v", descriptor = "Lce;")
    private class20 field2887;

    @OriginalMember(owner = "client!sb", name = "w", descriptor = "Ljava/awt/Canvas;")
    public static Canvas field2888;

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(ZLce;J)V")
    public final void method964(boolean arg0, class20 arg1, long arg2) {
        field2867++;
        if (arg1.field372 != null) {
            arg1.method172(-2658);
        }
        class20 var5 = this.field2875[(int) ((long) (this.field2878 - 1) & arg2)];
        arg1.field372 = var5.field372;
        arg1.field365 = arg2;
        arg1.field368 = var5;
        arg1.field372.field368 = arg1;
        arg1.field368.field372 = arg1;
        if (arg0) {
            method967((byte) 38);
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(IIIII)I")
    public static final int method965(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2868++;
        int var5 = 65536 - class114.field2557[arg3 * 1024 / arg1] >> 1;
        if (arg4 != 30590) {
            field2870 = null;
        }
        return ((65536 - var5) * arg2 >> 16) + (arg0 * var5 >> 16);
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(I)Lce;")
    public final class20 method966(int arg0) {
        field2876++;
        if (this.field2872 == null) {
            return null;
        }
        if (arg0 >= -122) {
            this.method969(115L, 7);
        }
        class20 var2 = this.field2875[(int) (this.field2866 & (long) (this.field2878 - 1))];
        while (this.field2872 != var2) {
            if (this.field2872.field365 == this.field2866) {
                class20 var3 = this.field2872;
                this.field2872 = this.field2872.field368;
                return var3;
            }
            this.field2872 = this.field2872.field368;
        }
        this.field2872 = null;
        return null;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(B)V")
    public static void method967(byte arg0) {
        field2874 = null;
        field2880 = null;
        field2888 = null;
        field2883 = null;
        field2870 = null;
        int var1 = -18 % ((58 - arg0) / 40);
        field2869 = null;
        field2885 = null;
    }

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "(I)Lce;")
    public final class20 method968(int arg0) {
        int var2 = 97 % ((arg0 - 3) / 62);
        field2873++;
        if (this.field2886 > 0 && this.field2875[this.field2886 - 1] != this.field2887) {
            class20 var3 = this.field2887;
            this.field2887 = var3.field368;
            return var3;
        }
        while (this.field2886 < this.field2878) {
            class20 var4 = this.field2875[this.field2886++].field368;
            if (this.field2875[this.field2886 - 1] != var4) {
                this.field2887 = var4.field368;
                return var4;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!sb", name = "<init>", descriptor = "(I)V")
    public class127(int arg0) {
        this.field2878 = arg0;
        this.field2875 = new class20[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class20 var3 = this.field2875[var2] = new class20();
            var3.field368 = var3;
            var3.field372 = var3;
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(JI)Lce;")
    public final class20 method969(long arg0, int arg1) {
        field2881++;
        this.field2866 = arg0;
        if (arg1 >= -57) {
            field2884 = -71;
        }
        class20 var4 = this.field2875[(int) (arg0 & (long) (this.field2878 - 1))];
        for (this.field2872 = var4.field368; this.field2872 != var4; this.field2872 = this.field2872.field368) {
            if (this.field2872.field365 == arg0) {
                class20 var5 = this.field2872;
                this.field2872 = this.field2872.field368;
                return var5;
            }
        }
        this.field2872 = null;
        return null;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(Z)Lce;")
    public final class20 method970(boolean arg0) {
        if (!arg0) {
            this.field2866 = 35L;
        }
        this.field2886 = 0;
        field2882++;
        return this.method968(75);
    }
}
