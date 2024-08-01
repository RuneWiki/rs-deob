import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("qf")
public class class154 {

    @OriginalMember(owner = "qf", name = "b", descriptor = "Lja;")
    private class86 field2922 = new class86(null);

    @OriginalMember(owner = "qf", name = "a", descriptor = "[B")
    private static byte[] field2921 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "qf", name = "e", descriptor = "I")
    public int field2925;

    @OriginalMember(owner = "qf", name = "h", descriptor = "I")
    private int field2928;

    @OriginalMember(owner = "qf", name = "c", descriptor = "J")
    private long field2923;

    @OriginalMember(owner = "qf", name = "d", descriptor = "[I")
    private int[] field2924;

    @OriginalMember(owner = "qf", name = "f", descriptor = "[I")
    public int[] field2926;

    @OriginalMember(owner = "qf", name = "g", descriptor = "[I")
    private int[] field2927;

    @OriginalMember(owner = "qf", name = "i", descriptor = "[I")
    private int[] field2929;

    @OriginalMember(owner = "qf", name = "a", descriptor = "()V")
    public final void method1051() {
        this.field2922.field1808 = null;
        this.field2929 = null;
        this.field2927 = null;
        this.field2926 = null;
        this.field2924 = null;
    }

    @OriginalMember(owner = "qf", name = "a", descriptor = "(I)I")
    public final int method1052(int arg0) {
        return this.method1061(arg0);
    }

    @OriginalMember(owner = "qf", name = "a", descriptor = "(J)V")
    public final void method1053(long arg0) {
        this.field2923 = arg0;
        int var3 = this.field2927.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2926[var4] = 0;
            this.field2924[var4] = 0;
            this.field2922.field1773 = this.field2929[var4];
            this.method1055(var4);
            this.field2927[var4] = this.field2922.field1773;
        }
    }

    @OriginalMember(owner = "qf", name = "a", descriptor = "(II)I")
    private final int method1054(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field2921[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field2922.method598((byte) 86) << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field2922.method598((byte) 87) << 16;
            }
            return var8;
        }
        int var3 = this.field2922.method598((byte) 87);
        int var4 = this.field2922.method555(103);
        if (var3 == 47) {
            this.field2922.field1773 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field2922.method578((byte) 59);
            var4 -= 3;
            int var6 = this.field2926[arg0];
            this.field2923 += (long) (this.field2928 - var5) * (long) var6;
            this.field2928 = var5;
            this.field2922.field1773 += var4;
            return 2;
        } else {
            this.field2922.field1773 += var4;
            return 3;
        }
    }

    @OriginalMember(owner = "qf", name = "b", descriptor = "(I)V")
    public final void method1055(int arg0) {
        int var2 = this.field2922.method555(109);
        this.field2926[arg0] += var2;
    }

    @OriginalMember(owner = "qf", name = "b", descriptor = "()V")
    public static void method1056() {
        field2921 = null;
    }

    @OriginalMember(owner = "qf", name = "c", descriptor = "()I")
    public final int method1057() {
        int var1 = this.field2927.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field2927[var4] >= 0 && this.field2926[var4] < var3) {
                var2 = var4;
                var3 = this.field2926[var4];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "qf", name = "d", descriptor = "()I")
    public final int method1058() {
        return this.field2927.length;
    }

    @OriginalMember(owner = "qf", name = "c", descriptor = "(I)V")
    public final void method1059(int arg0) {
        this.field2922.field1773 = this.field2927[arg0];
    }

    @OriginalMember(owner = "qf", name = "d", descriptor = "(I)V")
    public final void method1060(int arg0) {
        this.field2927[arg0] = this.field2922.field1773;
    }

    @OriginalMember(owner = "qf", name = "e", descriptor = "(I)I")
    private final int method1061(int arg0) {
        byte var2 = this.field2922.field1808[this.field2922.field1773];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field2924[arg0] = var3;
            this.field2922.field1773++;
        } else {
            var3 = this.field2924[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method1054(arg0, var3);
        }
        int var4 = this.field2922.method555(127);
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field2922.field1808[this.field2922.field1773] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field2922.field1773++;
                this.field2924[arg0] = var5;
                return this.method1054(arg0, var5);
            }
        }
        this.field2922.field1773 += var4;
        return 0;
    }

    @OriginalMember(owner = "qf", name = "e", descriptor = "()V")
    public final void method1062() {
        this.field2922.field1773 = -1;
    }

    @OriginalMember(owner = "qf", name = "f", descriptor = "(I)J")
    public final long method1063(int arg0) {
        return (long) this.field2928 * (long) arg0 + this.field2923;
    }

    @OriginalMember(owner = "qf", name = "a", descriptor = "([B)V")
    public final void method1064(byte[] arg0) {
        this.field2922.field1808 = arg0;
        this.field2922.field1773 = 10;
        int var2 = this.field2922.method569(true);
        this.field2925 = this.field2922.method569(true);
        this.field2928 = 500000;
        this.field2929 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var5 = this.field2922.method582(15);
            int var6 = this.field2922.method582(15);
            if (var5 == 1297379947) {
                this.field2929[var3] = this.field2922.field1773;
                var3++;
            }
            this.field2922.field1773 += var6;
        }
        this.field2923 = 0L;
        this.field2927 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            this.field2927[var4] = this.field2929[var4];
        }
        this.field2926 = new int[var2];
        this.field2924 = new int[var2];
    }

    @OriginalMember(owner = "qf", name = "f", descriptor = "()Z")
    public final boolean method1065() {
        return this.field2922.field1808 != null;
    }

    @OriginalMember(owner = "qf", name = "g", descriptor = "()Z")
    public final boolean method1066() {
        int var1 = this.field2927.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field2927[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "qf", name = "<init>", descriptor = "()V")
    public class154() {
    }

    @OriginalMember(owner = "qf", name = "<init>", descriptor = "([B)V")
    public class154(byte[] arg0) {
        this.method1064(arg0);
    }
}
