import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ud")
public class class185 {

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "Lrd;")
    private class158 field3639 = new class158(null);

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "[B")
    private static byte[] field3640 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!ud", name = "e", descriptor = "I")
    public int field3643;

    @OriginalMember(owner = "client!ud", name = "f", descriptor = "I")
    private int field3644;

    @OriginalMember(owner = "client!ud", name = "d", descriptor = "J")
    private long field3642;

    @OriginalMember(owner = "client!ud", name = "c", descriptor = "[I")
    public int[] field3641;

    @OriginalMember(owner = "client!ud", name = "g", descriptor = "[I")
    private int[] field3645;

    @OriginalMember(owner = "client!ud", name = "h", descriptor = "[I")
    private int[] field3646;

    @OriginalMember(owner = "client!ud", name = "i", descriptor = "[I")
    private int[] field3647;

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(I)V")
    public final void method1195(int arg0) {
        int var2 = this.field3639.method1032(2078277635);
        this.field3641[arg0] += var2;
    }

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "(I)I")
    private final int method1196(int arg0) {
        byte var2 = this.field3639.field3162[this.field3639.field3153];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field3647[arg0] = var3;
            this.field3639.field3153++;
        } else {
            var3 = this.field3647[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method1207(arg0, var3);
        }
        int var4 = this.field3639.method1032(2078277635);
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field3639.field3162[this.field3639.field3153] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field3639.field3153++;
                this.field3647[arg0] = var5;
                return this.method1207(arg0, var5);
            }
        }
        this.field3639.field3153 += var4;
        return 0;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "()I")
    public final int method1197() {
        int var1 = this.field3646.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field3646[var4] >= 0 && this.field3641[var4] < var3) {
                var2 = var4;
                var3 = this.field3641[var4];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(J)V")
    public final void method1198(long arg0) {
        this.field3642 = arg0;
        int var3 = this.field3646.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field3641[var4] = 0;
            this.field3647[var4] = 0;
            this.field3639.field3153 = this.field3645[var4];
            this.method1195(var4);
            this.field3646[var4] = this.field3639.field3153;
        }
    }

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "()V")
    public final void method1199() {
        this.field3639.field3153 = -1;
    }

    @OriginalMember(owner = "client!ud", name = "c", descriptor = "()V")
    public final void method1200() {
        this.field3639.field3162 = null;
        this.field3645 = null;
        this.field3646 = null;
        this.field3641 = null;
        this.field3647 = null;
    }

    @OriginalMember(owner = "client!ud", name = "c", descriptor = "(I)V")
    public final void method1201(int arg0) {
        this.field3639.field3153 = this.field3646[arg0];
    }

    @OriginalMember(owner = "client!ud", name = "d", descriptor = "()Z")
    public final boolean method1202() {
        int var1 = this.field3646.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field3646[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!ud", name = "e", descriptor = "()I")
    public final int method1203() {
        return this.field3646.length;
    }

    @OriginalMember(owner = "client!ud", name = "f", descriptor = "()V")
    public static void method1204() {
        field3640 = null;
    }

    @OriginalMember(owner = "client!ud", name = "d", descriptor = "(I)I")
    public final int method1205(int arg0) {
        return this.method1196(arg0);
    }

    @OriginalMember(owner = "client!ud", name = "e", descriptor = "(I)J")
    public final long method1206(int arg0) {
        return (long) this.field3644 * (long) arg0 + this.field3642;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(II)I")
    private final int method1207(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field3640[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field3639.method1054(128) << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field3639.method1054(128) << 16;
            }
            return var8;
        }
        int var3 = this.field3639.method1054(128);
        int var4 = this.field3639.method1032(2078277635);
        if (var3 == 47) {
            this.field3639.field3153 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field3639.method1060(255);
            var4 -= 3;
            int var6 = this.field3641[arg0];
            this.field3642 += (long) (this.field3644 - var5) * (long) var6;
            this.field3644 = var5;
            this.field3639.field3153 += var4;
            return 2;
        } else {
            this.field3639.field3153 += var4;
            return 3;
        }
    }

    @OriginalMember(owner = "client!ud", name = "f", descriptor = "(I)V")
    public final void method1208(int arg0) {
        this.field3646[arg0] = this.field3639.field3153;
    }

    @OriginalMember(owner = "client!ud", name = "g", descriptor = "()Z")
    public final boolean method1209() {
        return this.field3639.field3162 != null;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "([B)V")
    public final void method1210(byte[] arg0) {
        this.field3639.field3162 = arg0;
        this.field3639.field3153 = 10;
        int var2 = this.field3639.method1071(28101);
        this.field3643 = this.field3639.method1071(28101);
        this.field3644 = 500000;
        this.field3645 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var5 = this.field3639.method1076(24277);
            int var6 = this.field3639.method1076(24277);
            if (var5 == 1297379947) {
                this.field3645[var3] = this.field3639.field3153;
                var3++;
            }
            this.field3639.field3153 += var6;
        }
        this.field3642 = 0L;
        this.field3646 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            this.field3646[var4] = this.field3645[var4];
        }
        this.field3641 = new int[var2];
        this.field3647 = new int[var2];
    }

    @OriginalMember(owner = "client!ud", name = "<init>", descriptor = "()V")
    public class185() {
    }

    @OriginalMember(owner = "client!ud", name = "<init>", descriptor = "([B)V")
    public class185(byte[] arg0) {
        this.method1210(arg0);
    }
}
