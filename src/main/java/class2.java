import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aa")
public class class2 {

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "Ltc;")
    private class113 field22 = new class113(null);

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "[B")
    private static byte[] field21 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!aa", name = "d", descriptor = "I")
    public int field24;

    @OriginalMember(owner = "client!aa", name = "i", descriptor = "I")
    private int field29;

    @OriginalMember(owner = "client!aa", name = "f", descriptor = "J")
    private long field26;

    @OriginalMember(owner = "client!aa", name = "c", descriptor = "[I")
    private int[] field23;

    @OriginalMember(owner = "client!aa", name = "e", descriptor = "[I")
    private int[] field25;

    @OriginalMember(owner = "client!aa", name = "g", descriptor = "[I")
    public int[] field27;

    @OriginalMember(owner = "client!aa", name = "h", descriptor = "[I")
    private int[] field28;

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(I)V", line = 4)
    public final void method6(int arg0) {
        int var2 = this.field22.method832((byte) 41);
        this.field27[arg0] += var2;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "()Z", line = 9)
    public final boolean method7() {
        return this.field22.field2507 < 0;
    }

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "(I)V", line = 12)
    public final void method8(int arg0) {
        this.field25[arg0] = this.field22.field2507;
    }

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "()V", line = 15)
    public final void method9() {
        this.field22.field2512 = null;
        this.field28 = null;
        this.field25 = null;
        this.field27 = null;
        this.field23 = null;
    }

    @OriginalMember(owner = "client!aa", name = "c", descriptor = "(I)I", line = 26)
    private final int method10(int arg0) {
        byte var2 = this.field22.field2512[this.field22.field2507];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field23[arg0] = var3;
            this.field22.field2507++;
        } else {
            var3 = this.field23[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method21(arg0, var3);
        }
        int var4 = this.field22.method832((byte) 89);
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field22.field2512[this.field22.field2507] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field22.field2507++;
                this.field23[arg0] = var5;
                return this.method21(arg0, var5);
            }
        }
        this.field22.field2507 += var4;
        return 0;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "([B)V", line = 68)
    public final void method11(byte[] arg0) {
        this.field22.field2512 = arg0;
        this.field22.field2507 = 10;
        int var2 = this.field22.method870(-1);
        this.field24 = this.field22.method870(-1);
        this.field29 = 500000;
        this.field28 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field22.method822(-708753192);
            int var5 = this.field22.method822(-708753192);
            if (var4 == 1297379947) {
                this.field28[var3] = this.field22.field2507;
                var3++;
            }
            this.field22.field2507 += var5;
        }
        this.field25 = (int[]) this.field28.clone();
        this.field27 = new int[var2];
        this.field23 = new int[var2];
    }

    @OriginalMember(owner = "client!aa", name = "d", descriptor = "(I)V", line = 116)
    public final void method12(int arg0) {
        this.field22.field2507 = this.field25[arg0];
    }

    @OriginalMember(owner = "client!aa", name = "c", descriptor = "()Z", line = 126)
    public final boolean method13() {
        return this.field22.field2512 != null;
    }

    @OriginalMember(owner = "client!aa", name = "d", descriptor = "()V", line = 129)
    public final void method14() {
        this.field22.field2507 = -1;
    }

    @OriginalMember(owner = "client!aa", name = "e", descriptor = "(I)I", line = 133)
    public final int method15(int arg0) {
        return this.method10(arg0);
    }

    @OriginalMember(owner = "client!aa", name = "e", descriptor = "()V", line = 139)
    public static void method16() {
        field21 = null;
    }

    @OriginalMember(owner = "client!aa", name = "f", descriptor = "()Z", line = 143)
    public final boolean method17() {
        int var1 = this.field25.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field25[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!aa", name = "f", descriptor = "(I)J", line = 156)
    public final long method18(int arg0) {
        return (long) this.field29 * (long) arg0 + this.field26;
    }

    @OriginalMember(owner = "client!aa", name = "g", descriptor = "()I", line = 159)
    public final int method19() {
        return this.field25.length;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(J)V", line = 166)
    public final void method20(long arg0) {
        this.field26 = arg0;
        int var3 = this.field25.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field27[var4] = 0;
            this.field23[var4] = 0;
            this.field22.field2507 = this.field28[var4];
            this.method6(var4);
            this.field25[var4] = this.field22.field2507;
        }
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(II)I", line = 188)
    private final int method21(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field21[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field22.method821(true) << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field22.method821(true) << 16;
            }
            return var8;
        }
        int var3 = this.field22.method821(true);
        int var4 = this.field22.method832((byte) 104);
        if (var3 == 47) {
            this.field22.field2507 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field22.method848(16711680);
            var4 -= 3;
            int var6 = this.field27[arg0];
            this.field26 += (long) (this.field29 - var5) * (long) var6;
            this.field29 = var5;
            this.field22.field2507 += var4;
            return 2;
        } else {
            this.field22.field2507 += var4;
            return 3;
        }
    }

    @OriginalMember(owner = "client!aa", name = "h", descriptor = "()I", line = 232)
    public final int method22() {
        int var1 = this.field25.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field25[var4] >= 0 && this.field27[var4] < var3) {
                var2 = var4;
                var3 = this.field27[var4];
            }
        }
        return var2;
    }
}
