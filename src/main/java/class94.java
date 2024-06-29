import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bm")
public class class94 {

    @OriginalMember(owner = "client!bm", name = "b", descriptor = "Los;")
    private class374 field1148 = new class374(null);

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "[B")
    private static byte[] field1147 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!bm", name = "e", descriptor = "I")
    private int field1151;

    @OriginalMember(owner = "client!bm", name = "f", descriptor = "I")
    public int field1152;

    @OriginalMember(owner = "client!bm", name = "d", descriptor = "J")
    private long field1150;

    @OriginalMember(owner = "client!bm", name = "c", descriptor = "[I")
    public int[] field1149;

    @OriginalMember(owner = "client!bm", name = "g", descriptor = "[I")
    private int[] field1153;

    @OriginalMember(owner = "client!bm", name = "h", descriptor = "[I")
    private int[] field1154;

    @OriginalMember(owner = "client!bm", name = "i", descriptor = "[I")
    private int[] field1155;

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(I)I")
    private final int method567(int arg0) {
        byte var2 = this.field1148.field4929[this.field1148.field4966];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field1154[arg0] = var3;
            this.field1148.field4966++;
        } else {
            var3 = this.field1154[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method569(arg0, var3);
        }
        int var4 = this.field1148.method2104(19644);
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field1148.field4929[this.field1148.field4966] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field1148.field4966++;
                this.field1154[arg0] = var5;
                return this.method569(arg0, var5);
            }
        }
        this.field1148.field4966 += var4;
        return 0;
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "()I")
    public final int method568() {
        return this.field1155.length;
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(II)I")
    private final int method569(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field1147[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field1148.method2129(-86) << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field1148.method2129(-73) << 16;
            }
            return var8;
        }
        int var3 = this.field1148.method2129(-106);
        int var4 = this.field1148.method2104(19644);
        if (var3 == 47) {
            this.field1148.field4966 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field1148.method2128(true);
            var4 -= 3;
            int var6 = this.field1149[arg0];
            this.field1150 += (long) (this.field1151 - var5) * (long) var6;
            this.field1151 = var5;
            this.field1148.field4966 += var4;
            return 2;
        } else {
            this.field1148.field4966 += var4;
            return 3;
        }
    }

    @OriginalMember(owner = "client!bm", name = "b", descriptor = "()V")
    public final void method570() {
        this.field1148.field4966 = -1;
    }

    @OriginalMember(owner = "client!bm", name = "b", descriptor = "(I)J")
    public final long method571(int arg0) {
        return (long) this.field1151 * (long) arg0 + this.field1150;
    }

    @OriginalMember(owner = "client!bm", name = "c", descriptor = "(I)V")
    public final void method572(int arg0) {
        this.field1148.field4966 = this.field1155[arg0];
    }

    @OriginalMember(owner = "client!bm", name = "c", descriptor = "()Z")
    public final boolean method573() {
        return this.field1148.field4929 != null;
    }

    @OriginalMember(owner = "client!bm", name = "d", descriptor = "()Z")
    public final boolean method574() {
        int var1 = this.field1155.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field1155[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!bm", name = "e", descriptor = "()V")
    public static void method575() {
        field1147 = null;
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "([B)V")
    public final void method576(byte[] arg0) {
        this.field1148.field4929 = arg0;
        this.field1148.field4966 = 10;
        int var2 = this.field1148.method2136(false);
        this.field1152 = this.field1148.method2136(false);
        this.field1151 = 500000;
        this.field1153 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var5 = this.field1148.method2123(false);
            int var6 = this.field1148.method2123(false);
            if (var5 == 1297379947) {
                this.field1153[var3] = this.field1148.field4966;
                var3++;
            }
            this.field1148.field4966 += var6;
        }
        this.field1150 = 0L;
        this.field1155 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            this.field1155[var4] = this.field1153[var4];
        }
        this.field1149 = new int[var2];
        this.field1154 = new int[var2];
    }

    @OriginalMember(owner = "client!bm", name = "f", descriptor = "()I")
    public final int method577() {
        int var1 = this.field1155.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field1155[var4] >= 0 && this.field1149[var4] < var3) {
                var2 = var4;
                var3 = this.field1149[var4];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!bm", name = "d", descriptor = "(I)V")
    public final void method578(int arg0) {
        int var2 = this.field1148.method2104(19644);
        this.field1149[arg0] += var2;
    }

    @OriginalMember(owner = "client!bm", name = "g", descriptor = "()V")
    public final void method579() {
        this.field1148.field4929 = null;
        this.field1153 = null;
        this.field1155 = null;
        this.field1149 = null;
        this.field1154 = null;
    }

    @OriginalMember(owner = "client!bm", name = "e", descriptor = "(I)I")
    public final int method580(int arg0) {
        return this.method567(arg0);
    }

    @OriginalMember(owner = "client!bm", name = "f", descriptor = "(I)V")
    public final void method581(int arg0) {
        this.field1155[arg0] = this.field1148.field4966;
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(J)V")
    public final void method582(long arg0) {
        this.field1150 = arg0;
        int var3 = this.field1155.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field1149[var4] = 0;
            this.field1154[var4] = 0;
            this.field1148.field4966 = this.field1153[var4];
            this.method578(var4);
            this.field1155[var4] = this.field1148.field4966;
        }
    }

    @OriginalMember(owner = "client!bm", name = "<init>", descriptor = "()V")
    public class94() {
    }

    @OriginalMember(owner = "client!bm", name = "<init>", descriptor = "([B)V")
    public class94(byte[] arg0) {
        this.method576(arg0);
    }
}
