import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aa")
public class class2 {

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "Lb;")
    private class7 field14 = new class7(null);

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "[B")
    private static byte[] field15 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!aa", name = "d", descriptor = "I")
    private int field17;

    @OriginalMember(owner = "client!aa", name = "h", descriptor = "I")
    public int field21;

    @OriginalMember(owner = "client!aa", name = "c", descriptor = "J")
    private long field16;

    @OriginalMember(owner = "client!aa", name = "e", descriptor = "[I")
    private int[] field18;

    @OriginalMember(owner = "client!aa", name = "f", descriptor = "[I")
    private int[] field19;

    @OriginalMember(owner = "client!aa", name = "g", descriptor = "[I")
    public int[] field20;

    @OriginalMember(owner = "client!aa", name = "i", descriptor = "[I")
    private int[] field22;

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "()I", line = 5)
    public final int method4() {
        return this.field19.length;
    }

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "()V", line = 8)
    public static void method5() {
        field15 = null;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(I)I", line = 12)
    private final int method6(int arg0) {
        byte var2 = this.field14.field117[this.field14.field143];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field18[arg0] = var3;
            this.field14.field143++;
        } else {
            var3 = this.field18[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method16(arg0, var3);
        }
        int var4 = this.field14.method105((byte) -125);
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field14.field117[this.field14.field143] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field14.field143++;
                this.field18[arg0] = var5;
                return this.method16(arg0, var5);
            }
        }
        this.field14.field143 += var4;
        return 0;
    }

    @OriginalMember(owner = "client!aa", name = "c", descriptor = "()V", line = 52)
    public final void method7() {
        this.field14.field143 = -1;
    }

    @OriginalMember(owner = "client!aa", name = "d", descriptor = "()V", line = 55)
    public final void method8() {
        this.field14.field117 = null;
        this.field22 = null;
        this.field19 = null;
        this.field20 = null;
        this.field18 = null;
    }

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "(I)J", line = 64)
    public final long method9(int arg0) {
        return (long) this.field17 * (long) arg0 + this.field16;
    }

    @OriginalMember(owner = "client!aa", name = "c", descriptor = "(I)I", line = 69)
    public final int method10(int arg0) {
        return this.method6(arg0);
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(J)V", line = 76)
    public final void method11(long arg0) {
        this.field16 = arg0;
        int var3 = this.field19.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field20[var4] = 0;
            this.field18[var4] = 0;
            this.field14.field143 = this.field22[var4];
            this.method13(var4);
            this.field19[var4] = this.field14.field143;
        }
    }

    @OriginalMember(owner = "client!aa", name = "e", descriptor = "()Z", line = 94)
    public final boolean method12() {
        return this.field14.field117 != null;
    }

    @OriginalMember(owner = "client!aa", name = "d", descriptor = "(I)V", line = 98)
    public final void method13(int arg0) {
        int var2 = this.field14.method105((byte) -92);
        this.field20[arg0] += var2;
    }

    @OriginalMember(owner = "client!aa", name = "e", descriptor = "(I)V", line = 102)
    public final void method14(int arg0) {
        this.field19[arg0] = this.field14.field143;
    }

    @OriginalMember(owner = "client!aa", name = "f", descriptor = "()Z", line = 105)
    public final boolean method15() {
        return this.field14.field143 < 0;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(II)I", line = 109)
    private final int method16(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field15[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field14.method96(27023) << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field14.method96(27023) << 16;
            }
            return var8;
        }
        int var3 = this.field14.method96(27023);
        int var4 = this.field14.method105((byte) -74);
        if (var3 == 47) {
            this.field14.field143 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field14.method84(75);
            var4 -= 3;
            int var6 = this.field20[arg0];
            this.field16 += (long) (this.field17 - var5) * (long) var6;
            this.field17 = var5;
            this.field14.field143 += var4;
            return 2;
        } else {
            this.field14.field143 += var4;
            return 3;
        }
    }

    @OriginalMember(owner = "client!aa", name = "g", descriptor = "()Z", line = 153)
    public final boolean method17() {
        int var1 = this.field19.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field19[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "([B)V", line = 167)
    public final void method18(byte[] arg0) {
        this.field14.field117 = arg0;
        this.field14.field143 = 10;
        int var2 = this.field14.method101(2);
        this.field21 = this.field14.method101(2);
        this.field17 = 500000;
        this.field22 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var5 = this.field14.method104(-1699);
            int var6 = this.field14.method104(-1699);
            if (var5 == 1297379947) {
                this.field22[var3] = this.field14.field143;
                var3++;
            }
            this.field14.field143 += var6;
        }
        this.field19 = new int[this.field22.length];
        for (int var4 = 0; var4 < this.field19.length; var4++) {
            this.field19[var4] = this.field22[var4];
        }
        this.field20 = new int[var2];
        this.field18 = new int[var2];
    }

    @OriginalMember(owner = "client!aa", name = "h", descriptor = "()I", line = 222)
    public final int method19() {
        int var1 = this.field19.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field19[var4] >= 0 && this.field20[var4] < var3) {
                var2 = var4;
                var3 = this.field20[var4];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!aa", name = "f", descriptor = "(I)V", line = 247)
    public final void method20(int arg0) {
        this.field14.field143 = this.field19[arg0];
    }
}
