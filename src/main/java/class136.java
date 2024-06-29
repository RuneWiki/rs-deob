import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!td")
public class class136 {

    @OriginalMember(owner = "client!td", name = "b", descriptor = "Lna;")
    private class91 field3077 = new class91(null);

    @OriginalMember(owner = "client!td", name = "a", descriptor = "[B")
    private static byte[] field3076 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!td", name = "g", descriptor = "I")
    public int field3082;

    @OriginalMember(owner = "client!td", name = "h", descriptor = "I")
    private int field3083;

    @OriginalMember(owner = "client!td", name = "d", descriptor = "J")
    private long field3079;

    @OriginalMember(owner = "client!td", name = "c", descriptor = "[I")
    private int[] field3078;

    @OriginalMember(owner = "client!td", name = "e", descriptor = "[I")
    private int[] field3080;

    @OriginalMember(owner = "client!td", name = "f", descriptor = "[I")
    private int[] field3081;

    @OriginalMember(owner = "client!td", name = "i", descriptor = "[I")
    public int[] field3084;

    @OriginalMember(owner = "client!td", name = "a", descriptor = "([B)V")
    public final void method1026(byte[] arg0) {
        this.field3077.field1991 = arg0;
        this.field3077.field2043 = 10;
        int var2 = this.field3077.method641(255);
        this.field3082 = this.field3077.method641(255);
        this.field3083 = 500000;
        this.field3078 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var5 = this.field3077.method631(-96);
            int var6 = this.field3077.method631(-80);
            if (var5 == 1297379947) {
                this.field3078[var3] = this.field3077.field2043;
                var3++;
            }
            this.field3077.field2043 += var6;
        }
        this.field3079 = 0L;
        this.field3081 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            this.field3081[var4] = this.field3078[var4];
        }
        this.field3084 = new int[var2];
        this.field3080 = new int[var2];
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(I)V")
    public final void method1027(int arg0) {
        this.field3081[arg0] = this.field3077.field2043;
    }

    @OriginalMember(owner = "client!td", name = "b", descriptor = "(I)J")
    public final long method1028(int arg0) {
        return (long) this.field3083 * (long) arg0 + this.field3079;
    }

    @OriginalMember(owner = "client!td", name = "c", descriptor = "(I)I")
    private final int method1029(int arg0) {
        byte var2 = this.field3077.field1991[this.field3077.field2043];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field3080[arg0] = var3;
            this.field3077.field2043++;
        } else {
            var3 = this.field3080[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method1034(arg0, var3);
        }
        int var4 = this.field3077.method620((byte) 78);
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field3077.field1991[this.field3077.field2043] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field3077.field2043++;
                this.field3080[arg0] = var5;
                return this.method1034(arg0, var5);
            }
        }
        this.field3077.field2043 += var4;
        return 0;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "()V")
    public final void method1030() {
        this.field3077.field2043 = -1;
    }

    @OriginalMember(owner = "client!td", name = "b", descriptor = "()I")
    public final int method1031() {
        return this.field3081.length;
    }

    @OriginalMember(owner = "client!td", name = "c", descriptor = "()Z")
    public final boolean method1032() {
        int var1 = this.field3081.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field3081[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!td", name = "d", descriptor = "(I)V")
    public final void method1033(int arg0) {
        int var2 = this.field3077.method620((byte) -45);
        this.field3084[arg0] += var2;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(II)I")
    private final int method1034(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field3076[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field3077.method649(false) << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field3077.method649(false) << 16;
            }
            return var8;
        }
        int var3 = this.field3077.method649(false);
        int var4 = this.field3077.method620((byte) -58);
        if (var3 == 47) {
            this.field3077.field2043 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field3077.method637(61);
            var4 -= 3;
            int var6 = this.field3084[arg0];
            this.field3079 += (long) (this.field3083 - var5) * (long) var6;
            this.field3083 = var5;
            this.field3077.field2043 += var4;
            return 2;
        } else {
            this.field3077.field2043 += var4;
            return 3;
        }
    }

    @OriginalMember(owner = "client!td", name = "d", descriptor = "()V")
    public final void method1035() {
        this.field3077.field1991 = null;
        this.field3078 = null;
        this.field3081 = null;
        this.field3084 = null;
        this.field3080 = null;
    }

    @OriginalMember(owner = "client!td", name = "e", descriptor = "()Z")
    public final boolean method1036() {
        return this.field3077.field1991 != null;
    }

    @OriginalMember(owner = "client!td", name = "e", descriptor = "(I)V")
    public final void method1037(int arg0) {
        this.field3077.field2043 = this.field3081[arg0];
    }

    @OriginalMember(owner = "client!td", name = "f", descriptor = "()V")
    public static void method1038() {
        field3076 = null;
    }

    @OriginalMember(owner = "client!td", name = "f", descriptor = "(I)I")
    public final int method1039(int arg0) {
        return this.method1029(arg0);
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(J)V")
    public final void method1040(long arg0) {
        this.field3079 = arg0;
        int var3 = this.field3081.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field3084[var4] = 0;
            this.field3080[var4] = 0;
            this.field3077.field2043 = this.field3078[var4];
            this.method1033(var4);
            this.field3081[var4] = this.field3077.field2043;
        }
    }

    @OriginalMember(owner = "client!td", name = "g", descriptor = "()I")
    public final int method1041() {
        int var1 = this.field3081.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field3081[var4] >= 0 && this.field3084[var4] < var3) {
                var2 = var4;
                var3 = this.field3084[var4];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!td", name = "<init>", descriptor = "()V")
    public class136() {
    }

    @OriginalMember(owner = "client!td", name = "<init>", descriptor = "([B)V")
    public class136(byte[] arg0) {
        this.method1026(arg0);
    }
}
