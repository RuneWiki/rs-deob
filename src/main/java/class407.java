import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ke")
public class class407 {

    @OriginalMember(owner = "client!ke", name = "s", descriptor = "I")
    private int field5918 = 0;

    @OriginalMember(owner = "client!ke", name = "o", descriptor = "I")
    public int field5914;

    @OriginalMember(owner = "client!ke", name = "d", descriptor = "[Lol;")
    public class179[] field5903;

    @OriginalMember(owner = "client!ke", name = "j", descriptor = "I")
    public static int field5909 = -2;

    @OriginalMember(owner = "client!ke", name = "g", descriptor = "I")
    public static int field5906 = 1;

    @OriginalMember(owner = "client!ke", name = "r", descriptor = "F")
    public static float field5917 = 0.0F;

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "I")
    public static int field5900;

    @OriginalMember(owner = "client!ke", name = "c", descriptor = "I")
    public static int field5902;

    @OriginalMember(owner = "client!ke", name = "f", descriptor = "I")
    public static int field5905;

    @OriginalMember(owner = "client!ke", name = "h", descriptor = "I")
    public static int field5907;

    @OriginalMember(owner = "client!ke", name = "i", descriptor = "I")
    public static int field5908;

    @OriginalMember(owner = "client!ke", name = "k", descriptor = "I")
    public static int field5910;

    @OriginalMember(owner = "client!ke", name = "m", descriptor = "I")
    public static int field5912;

    @OriginalMember(owner = "client!ke", name = "n", descriptor = "I")
    public static int field5913;

    @OriginalMember(owner = "client!ke", name = "p", descriptor = "I")
    public static int field5915;

    @OriginalMember(owner = "client!ke", name = "q", descriptor = "I")
    public static int field5916;

    @OriginalMember(owner = "client!ke", name = "t", descriptor = "I")
    public static int field5919;

    @OriginalMember(owner = "client!ke", name = "e", descriptor = "J")
    private long field5904;

    @OriginalMember(owner = "client!ke", name = "l", descriptor = "Lol;")
    private class179 field5911;

    @OriginalMember(owner = "client!ke", name = "u", descriptor = "Lol;")
    private class179 field5920;

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "Ljava/awt/Image;")
    public static Image field5901;

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "([Lol;Z)I", line = 6)
    public final int method2406(class179[] arg0, boolean arg1) {
        if (!arg1) {
            this.method2409(true, 1L);
        }
        field5915++;
        int var3 = 0;
        for (int var4 = 0; var4 < this.field5914; var4++) {
            class179 var5 = this.field5903[var4];
            for (class179 var6 = var5.field2799; var6 != var5; var6 = var6.field2799) {
                arg0[var3++] = var6;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(I)I", line = 37)
    public final int method2407(int arg0) {
        field5910++;
        return arg0 == 0 ? this.field5914 : 17;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(B)Lco;", line = 49)
    public static final class72 method2408(byte arg0) {
        field5912++;
        int var1 = 21 % ((arg0 - 24) / 62);
        return class492.field7467;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(ZJ)Lol;", line = 62)
    public final class179 method2409(boolean arg0, long arg1) {
        field5902++;
        this.field5904 = arg1;
        class179 var4 = this.field5903[(int) (arg1 & (long) (this.field5914 - 1))];
        for (this.field5911 = var4.field2799; this.field5911 != var4; this.field5911 = this.field5911.field2799) {
            if (this.field5911.field2798 == arg1) {
                class179 var5 = this.field5911;
                this.field5911 = this.field5911.field2799;
                return var5;
            }
        }
        this.field5911 = null;
        if (arg0) {
            field5917 = 0.4714462F;
        }
        return null;
    }

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "(B)Lol;", line = 96)
    public final class179 method2410(byte arg0) {
        field5900++;
        if (this.field5911 == null) {
            return null;
        }
        if (arg0 <= 21) {
            this.field5903 = null;
        }
        class179 var2 = this.field5903[(int) (this.field5904 & (long) (this.field5914 - 1))];
        while (this.field5911 != var2) {
            if (this.field5911.field2798 == this.field5904) {
                class179 var3 = this.field5911;
                this.field5911 = this.field5911.field2799;
                return var3;
            }
            this.field5911 = this.field5911.field2799;
        }
        this.field5911 = null;
        return null;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(Z)I", line = 126)
    public final int method2411(boolean arg0) {
        field5907++;
        int var2 = 0;
        for (int var3 = 0; var3 < this.field5914; var3++) {
            class179 var4 = this.field5903[var3];
            class179 var5 = var4.field2799;
            while (var4 != var5) {
                var5 = var5.field2799;
                var2++;
            }
        }
        if (!arg0) {
            this.method2416((byte) 71);
        }
        return var2;
    }

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "(I)V", line = 165)
    public final void method2412(int arg0) {
        if (arg0 <= 97) {
            return;
        }
        field5919++;
        for (int var2 = 0; var2 < this.field5914; var2++) {
            class179 var3 = this.field5903[var2];
            while (true) {
                class179 var4 = var3.field2799;
                if (var3 == var4) {
                    break;
                }
                var4.method1121(false);
            }
        }
        this.field5911 = null;
        this.field5920 = null;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(JILol;)V", line = 200)
    public final void method2413(long arg0, int arg1, class179 arg2) {
        field5916++;
        if (arg2.field2795 != null) {
            arg2.method1121(false);
        }
        class179 var5 = this.field5903[(int) (arg0 & (long) (this.field5914 + arg1))];
        arg2.field2799 = var5;
        arg2.field2795 = var5.field2795;
        arg2.field2795.field2799 = arg2;
        arg2.field2799.field2795 = arg2;
        arg2.field2798 = arg0;
    }

    @OriginalMember(owner = "client!ke", name = "c", descriptor = "(B)V", line = 218)
    public static void method2414(byte arg0) {
        if (arg0 < 59) {
            method2408((byte) -68);
        }
        field5901 = null;
    }

    @OriginalMember(owner = "client!ke", name = "d", descriptor = "(B)Lol;", line = 229)
    public final class179 method2415(byte arg0) {
        field5908++;
        this.field5918 = 0;
        int var2 = -77 / ((arg0 + 33) / 34);
        return this.method2416((byte) -123);
    }

    @OriginalMember(owner = "client!ke", name = "e", descriptor = "(B)Lol;", line = 242)
    public final class179 method2416(byte arg0) {
        field5913++;
        if (arg0 > -117) {
            field5909 = -32;
        }
        if (this.field5918 > 0 && this.field5903[this.field5918 - 1] != this.field5920) {
            class179 var2 = this.field5920;
            this.field5920 = var2.field2799;
            return var2;
        }
        while (this.field5918 < this.field5914) {
            class179 var3 = this.field5903[this.field5918++].field2799;
            if (this.field5903[this.field5918 - 1] != var3) {
                this.field5920 = var3.field2799;
                return var3;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!ke", name = "<init>", descriptor = "(I)V", line = 279)
    public class407(int arg0) {
        this.field5914 = arg0;
        this.field5903 = new class179[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class179 var3 = this.field5903[var2] = new class179();
            var3.field2799 = var3;
            var3.field2795 = var3;
        }
    }
}
