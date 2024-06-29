import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jf")
public class class8 {

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "Lqi;")
    private class216 field101 = new class216((byte[]) null);

    @OriginalMember(owner = "client!jf", name = "e", descriptor = "[B")
    private static byte[] field105 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!jf", name = "c", descriptor = "I")
    public int field103;

    @OriginalMember(owner = "client!jf", name = "g", descriptor = "I")
    private int field107;

    @OriginalMember(owner = "client!jf", name = "d", descriptor = "J")
    private long field104;

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "[I")
    private int[] field102;

    @OriginalMember(owner = "client!jf", name = "f", descriptor = "[I")
    public int[] field106;

    @OriginalMember(owner = "client!jf", name = "h", descriptor = "[I")
    private int[] field108;

    @OriginalMember(owner = "client!jf", name = "i", descriptor = "[I")
    private int[] field109;

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "()V")
    public static void method44() {
        field105 = null;
    }

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "()I")
    public final int method45() {
        int var1 = this.field108.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field108[var4] >= 0 && this.field106[var4] < var3) {
                var2 = var4;
                var3 = this.field106[var4];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(I)I")
    private final int method46(int arg0) {
        byte var2 = this.field101.field3030[this.field101.field3021];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field109[arg0] = var3;
            this.field101.field3021++;
        } else {
            var3 = this.field109[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method47(arg0, var3);
        }
        int var4 = this.field101.method1396((byte) -115);
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field101.field3030[this.field101.field3021] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field101.field3021++;
                this.field109[arg0] = var5;
                return this.method47(arg0, var5);
            }
        }
        this.field101.field3021 += var4;
        return 0;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(II)I")
    private final int method47(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field105[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field101.method1407(105) << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field101.method1407(105) << 16;
            }
            return var8;
        }
        int var3 = this.field101.method1407(107);
        int var4 = this.field101.method1396((byte) -115);
        if (var3 == 47) {
            this.field101.field3021 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field101.method1382(-105);
            var4 -= 3;
            int var6 = this.field106[arg0];
            this.field104 += (long) (this.field107 - var5) * (long) var6;
            this.field107 = var5;
            this.field101.field3021 += var4;
            return 2;
        } else {
            this.field101.field3021 += var4;
            return 3;
        }
    }

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "(I)V")
    public final void method48(int arg0) {
        int var2 = this.field101.method1396((byte) -115);
        this.field106[arg0] += var2;
    }

    @OriginalMember(owner = "client!jf", name = "c", descriptor = "(I)V")
    public final void method49(int arg0) {
        this.field101.field3021 = this.field108[arg0];
    }

    @OriginalMember(owner = "client!jf", name = "d", descriptor = "(I)J")
    public final long method50(int arg0) {
        return (long) this.field107 * (long) arg0 + this.field104;
    }

    @OriginalMember(owner = "client!jf", name = "c", descriptor = "()V")
    public final void method51() {
        this.field101.field3030 = null;
        this.field102 = null;
        this.field108 = null;
        this.field106 = null;
        this.field109 = null;
    }

    @OriginalMember(owner = "client!jf", name = "e", descriptor = "(I)I")
    public final int method52(int arg0) {
        return this.method46(arg0);
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(J)V")
    public final void method53(long arg0) {
        this.field104 = arg0;
        int var3 = this.field108.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field106[var4] = 0;
            this.field109[var4] = 0;
            this.field101.field3021 = this.field102[var4];
            this.method48(var4);
            this.field108[var4] = this.field101.field3021;
        }
    }

    @OriginalMember(owner = "client!jf", name = "f", descriptor = "(I)V")
    public final void method54(int arg0) {
        this.field108[arg0] = this.field101.field3021;
    }

    @OriginalMember(owner = "client!jf", name = "d", descriptor = "()Z")
    public final boolean method55() {
        int var1 = this.field108.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field108[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!jf", name = "e", descriptor = "()I")
    public final int method56() {
        return this.field108.length;
    }

    @OriginalMember(owner = "client!jf", name = "f", descriptor = "()V")
    public final void method57() {
        this.field101.field3021 = -1;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "([B)V")
    public final void method58(byte[] arg0) {
        this.field101.field3030 = arg0;
        this.field101.field3021 = 10;
        int var2 = this.field101.method1380(true);
        this.field103 = this.field101.method1380(true);
        this.field107 = 500000;
        this.field102 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var5 = this.field101.method1358(75);
            int var6 = this.field101.method1358(98);
            if (var5 == 1297379947) {
                this.field102[var3] = this.field101.field3021;
                var3++;
            }
            this.field101.field3021 += var6;
        }
        this.field104 = 0L;
        this.field108 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            this.field108[var4] = this.field102[var4];
        }
        this.field106 = new int[var2];
        this.field109 = new int[var2];
    }

    @OriginalMember(owner = "client!jf", name = "<init>", descriptor = "()V")
    public class8() {
    }

    @OriginalMember(owner = "client!jf", name = "<init>", descriptor = "([B)V")
    public class8(byte[] arg0) {
        this.method58(arg0);
    }

    @OriginalMember(owner = "client!jf", name = "g", descriptor = "()Z")
    public final boolean method59() {
        return this.field101.field3030 != null;
    }
}
