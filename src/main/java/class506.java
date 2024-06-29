import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kga")
public class class506 {

    @OriginalMember(owner = "client!kga", name = "a", descriptor = "Lie;")
    private class6 field7383 = new class6(null);

    @OriginalMember(owner = "client!kga", name = "f", descriptor = "[B")
    private static byte[] field7388 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!kga", name = "d", descriptor = "I")
    private int field7386;

    @OriginalMember(owner = "client!kga", name = "g", descriptor = "I")
    public int field7389;

    @OriginalMember(owner = "client!kga", name = "h", descriptor = "J")
    private long field7390;

    @OriginalMember(owner = "client!kga", name = "b", descriptor = "[I")
    private int[] field7384;

    @OriginalMember(owner = "client!kga", name = "c", descriptor = "[I")
    private int[] field7385;

    @OriginalMember(owner = "client!kga", name = "e", descriptor = "[I")
    private int[] field7387;

    @OriginalMember(owner = "client!kga", name = "i", descriptor = "[I")
    public int[] field7391;

    @OriginalMember(owner = "client!kga", name = "a", descriptor = "(I)I", line = 6)
    public final int method3063(int arg0) {
        return this.method3071(arg0);
    }

    @OriginalMember(owner = "client!kga", name = "b", descriptor = "(I)J", line = 13)
    public final long method3064(int arg0) {
        return (long) this.field7386 * (long) arg0 + this.field7390;
    }

    @OriginalMember(owner = "client!kga", name = "a", descriptor = "()V", line = 16)
    public static void method3065() {
        field7388 = null;
    }

    @OriginalMember(owner = "client!kga", name = "b", descriptor = "()Z", line = 19)
    public final boolean method3066() {
        return this.field7383.field96 != null;
    }

    @OriginalMember(owner = "client!kga", name = "c", descriptor = "(I)V", line = 22)
    public final void method3067(int arg0) {
        this.field7385[arg0] = this.field7383.field57;
    }

    @OriginalMember(owner = "client!kga", name = "d", descriptor = "(I)V", line = 28)
    public final void method3068(int arg0) {
        this.field7383.field57 = this.field7385[arg0];
    }

    @OriginalMember(owner = "client!kga", name = "c", descriptor = "()I", line = 31)
    public final int method3069() {
        return this.field7385.length;
    }

    @OriginalMember(owner = "client!kga", name = "d", descriptor = "()I", line = 35)
    public final int method3070() {
        int var1 = this.field7385.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field7385[var4] >= 0 && this.field7391[var4] < var3) {
                var2 = var4;
                var3 = this.field7391[var4];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!kga", name = "e", descriptor = "(I)I", line = 61)
    private final int method3071(int arg0) {
        byte var2 = this.field7383.field96[this.field7383.field57];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field7384[arg0] = var3;
            this.field7383.field57++;
        } else {
            var3 = this.field7384[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method3077(arg0, var3);
        }
        int var4 = this.field7383.method62((byte) -93);
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field7383.field96[this.field7383.field57] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field7383.field57++;
                this.field7384[arg0] = var5;
                return this.method3077(arg0, var5);
            }
        }
        this.field7383.field57 += var4;
        return 0;
    }

    @OriginalMember(owner = "client!kga", name = "a", descriptor = "(J)V", line = 101)
    public final void method3072(long arg0) {
        this.field7390 = arg0;
        int var3 = this.field7385.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field7391[var4] = 0;
            this.field7384[var4] = 0;
            this.field7383.field57 = this.field7387[var4];
            this.method3076(var4);
            this.field7385[var4] = this.field7383.field57;
        }
    }

    @OriginalMember(owner = "client!kga", name = "e", descriptor = "()V", line = 122)
    public final void method3073() {
        this.field7383.field57 = -1;
    }

    @OriginalMember(owner = "client!kga", name = "f", descriptor = "()Z", line = 126)
    public final boolean method3074() {
        int var1 = this.field7385.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field7385[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!kga", name = "<init>", descriptor = "()V", line = 255)
    public class506() {
    }

    @OriginalMember(owner = "client!kga", name = "<init>", descriptor = "([B)V", line = 257)
    public class506(byte[] arg0) {
        this.method3075(arg0);
    }

    @OriginalMember(owner = "client!kga", name = "a", descriptor = "([B)V", line = 142)
    public final void method3075(byte[] arg0) {
        this.field7383.field96 = arg0;
        this.field7383.field57 = 10;
        int var2 = this.field7383.method67(12021);
        this.field7389 = this.field7383.method67(12021);
        this.field7386 = 500000;
        this.field7387 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var5 = this.field7383.method72(-86);
            int var6 = this.field7383.method72(-28);
            if (var5 == 1297379947) {
                this.field7387[var3] = this.field7383.field57;
                var3++;
            }
            this.field7383.field57 += var6;
        }
        this.field7390 = 0L;
        this.field7385 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            this.field7385[var4] = this.field7387[var4];
        }
        this.field7391 = new int[var2];
        this.field7384 = new int[var2];
    }

    @OriginalMember(owner = "client!kga", name = "f", descriptor = "(I)V", line = 199)
    public final void method3076(int arg0) {
        int var2 = this.field7383.method62((byte) -93);
        this.field7391[arg0] += var2;
    }

    @OriginalMember(owner = "client!kga", name = "a", descriptor = "(II)I", line = 207)
    private final int method3077(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field7388[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field7383.method70(-9059) << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field7383.method70(-9059) << 16;
            }
            return var8;
        }
        int var3 = this.field7383.method70(-9059);
        int var4 = this.field7383.method62((byte) -93);
        if (var3 == 47) {
            this.field7383.field57 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field7383.method86(-109);
            var4 -= 3;
            int var6 = this.field7391[arg0];
            this.field7390 += (long) (this.field7386 - var5) * (long) var6;
            this.field7386 = var5;
            this.field7383.field57 += var4;
            return 2;
        } else {
            this.field7383.field57 += var4;
            return 3;
        }
    }

    @OriginalMember(owner = "client!kga", name = "g", descriptor = "()V", line = 261)
    public final void method3078() {
        this.field7383.field96 = null;
        this.field7387 = null;
        this.field7385 = null;
        this.field7391 = null;
        this.field7384 = null;
    }
}
