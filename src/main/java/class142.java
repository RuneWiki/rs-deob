import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!df")
public class class142 {

    @OriginalMember(owner = "client!df", name = "a", descriptor = "Lk;")
    private class152 field2497 = new class152((byte[]) null);

    @OriginalMember(owner = "client!df", name = "b", descriptor = "[B")
    private static byte[] field2498 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!df", name = "c", descriptor = "I")
    public int field2499;

    @OriginalMember(owner = "client!df", name = "g", descriptor = "I")
    private int field2503;

    @OriginalMember(owner = "client!df", name = "f", descriptor = "J")
    private long field2502;

    @OriginalMember(owner = "client!df", name = "d", descriptor = "[I")
    private int[] field2500;

    @OriginalMember(owner = "client!df", name = "e", descriptor = "[I")
    public int[] field2501;

    @OriginalMember(owner = "client!df", name = "h", descriptor = "[I")
    private int[] field2504;

    @OriginalMember(owner = "client!df", name = "i", descriptor = "[I")
    private int[] field2505;

    @OriginalMember(owner = "client!df", name = "a", descriptor = "()V")
    public final void method956() {
        this.field2497.field2638 = null;
        this.field2504 = null;
        this.field2500 = null;
        this.field2501 = null;
        this.field2505 = null;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(II)I")
    private final int method957(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field2498[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field2497.method1051((byte) 121) << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field2497.method1051((byte) 86) << 16;
            }
            return var8;
        }
        int var3 = this.field2497.method1051((byte) 126);
        int var4 = this.field2497.method1031(0);
        if (var3 == 47) {
            this.field2497.field2677 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field2497.method1064((byte) -121);
            var4 -= 3;
            int var6 = this.field2501[arg0];
            this.field2502 += (long) (this.field2503 - var5) * (long) var6;
            this.field2503 = var5;
            this.field2497.field2677 += var4;
            return 2;
        } else {
            this.field2497.field2677 += var4;
            return 3;
        }
    }

    @OriginalMember(owner = "client!df", name = "b", descriptor = "()I")
    public final int method958() {
        return this.field2500.length;
    }

    @OriginalMember(owner = "client!df", name = "c", descriptor = "()Z")
    public final boolean method959() {
        int var1 = this.field2500.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field2500[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "([B)V")
    public final void method960(byte[] arg0) {
        this.field2497.field2638 = arg0;
        this.field2497.field2677 = 10;
        int var2 = this.field2497.method1063(-17162);
        this.field2499 = this.field2497.method1063(-17162);
        this.field2503 = 500000;
        this.field2504 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var5 = this.field2497.method1042(124);
            int var6 = this.field2497.method1042(112);
            if (var5 == 1297379947) {
                this.field2504[var3] = this.field2497.field2677;
                var3++;
            }
            this.field2497.field2677 += var6;
        }
        this.field2502 = 0L;
        this.field2500 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            this.field2500[var4] = this.field2504[var4];
        }
        this.field2501 = new int[var2];
        this.field2505 = new int[var2];
    }

    @OriginalMember(owner = "client!df", name = "d", descriptor = "()V")
    public final void method961() {
        this.field2497.field2677 = -1;
    }

    @OriginalMember(owner = "client!df", name = "e", descriptor = "()Z")
    public final boolean method962() {
        return this.field2497.field2638 != null;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(I)I")
    public final int method963(int arg0) {
        return this.method969(arg0);
    }

    @OriginalMember(owner = "client!df", name = "f", descriptor = "()V")
    public static void method964() {
        field2498 = null;
    }

    @OriginalMember(owner = "client!df", name = "b", descriptor = "(I)J")
    public final long method965(int arg0) {
        return (long) this.field2503 * (long) arg0 + this.field2502;
    }

    @OriginalMember(owner = "client!df", name = "c", descriptor = "(I)V")
    public final void method966(int arg0) {
        int var2 = this.field2497.method1031(0);
        this.field2501[arg0] += var2;
    }

    @OriginalMember(owner = "client!df", name = "d", descriptor = "(I)V")
    public final void method967(int arg0) {
        this.field2497.field2677 = this.field2500[arg0];
    }

    @OriginalMember(owner = "client!df", name = "e", descriptor = "(I)V")
    public final void method968(int arg0) {
        this.field2500[arg0] = this.field2497.field2677;
    }

    @OriginalMember(owner = "client!df", name = "f", descriptor = "(I)I")
    private final int method969(int arg0) {
        byte var2 = this.field2497.field2638[this.field2497.field2677];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field2505[arg0] = var3;
            this.field2497.field2677++;
        } else {
            var3 = this.field2505[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method957(arg0, var3);
        }
        int var4 = this.field2497.method1031(0);
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field2497.field2638[this.field2497.field2677] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field2497.field2677++;
                this.field2505[arg0] = var5;
                return this.method957(arg0, var5);
            }
        }
        this.field2497.field2677 += var4;
        return 0;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(J)V")
    public final void method970(long arg0) {
        this.field2502 = arg0;
        int var3 = this.field2500.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2501[var4] = 0;
            this.field2505[var4] = 0;
            this.field2497.field2677 = this.field2504[var4];
            this.method966(var4);
            this.field2500[var4] = this.field2497.field2677;
        }
    }

    @OriginalMember(owner = "client!df", name = "g", descriptor = "()I")
    public final int method971() {
        int var1 = this.field2500.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field2500[var4] >= 0 && this.field2501[var4] < var3) {
                var2 = var4;
                var3 = this.field2501[var4];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!df", name = "<init>", descriptor = "()V")
    public class142() {
    }

    @OriginalMember(owner = "client!df", name = "<init>", descriptor = "([B)V")
    public class142(byte[] arg0) {
        this.method960(arg0);
    }
}
