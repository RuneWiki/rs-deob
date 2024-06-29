import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sc")
public class class192 {

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "Ljg;")
    private class186 field3121 = new class186((byte[]) null);

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "[B")
    private static byte[] field3122 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!sc", name = "d", descriptor = "I")
    private int field3124;

    @OriginalMember(owner = "client!sc", name = "e", descriptor = "I")
    public int field3125;

    @OriginalMember(owner = "client!sc", name = "f", descriptor = "J")
    private long field3126;

    @OriginalMember(owner = "client!sc", name = "c", descriptor = "[I")
    private int[] field3123;

    @OriginalMember(owner = "client!sc", name = "g", descriptor = "[I")
    private int[] field3127;

    @OriginalMember(owner = "client!sc", name = "h", descriptor = "[I")
    public int[] field3128;

    @OriginalMember(owner = "client!sc", name = "i", descriptor = "[I")
    private int[] field3129;

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(I)V")
    public final void method1339(int arg0) {
        this.field3123[arg0] = this.field3121.field3044;
    }

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "(I)V")
    public final void method1340(int arg0) {
        int var2 = this.field3121.method1271(121);
        this.field3128[arg0] += var2;
    }

    @OriginalMember(owner = "client!sc", name = "c", descriptor = "(I)I")
    private final int method1341(int arg0) {
        byte var2 = this.field3121.field3066[this.field3121.field3044];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field3127[arg0] = var3;
            this.field3121.field3044++;
        } else {
            var3 = this.field3127[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method1351(arg0, var3);
        }
        int var4 = this.field3121.method1271(116);
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field3121.field3066[this.field3121.field3044] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field3121.field3044++;
                this.field3127[arg0] = var5;
                return this.method1351(arg0, var5);
            }
        }
        this.field3121.field3044 += var4;
        return 0;
    }

    @OriginalMember(owner = "client!sc", name = "d", descriptor = "(I)V")
    public final void method1342(int arg0) {
        this.field3121.field3044 = this.field3123[arg0];
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "()V")
    public final void method1343() {
        this.field3121.field3066 = null;
        this.field3129 = null;
        this.field3123 = null;
        this.field3128 = null;
        this.field3127 = null;
    }

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "()Z")
    public final boolean method1344() {
        return this.field3121.field3066 != null;
    }

    @OriginalMember(owner = "client!sc", name = "e", descriptor = "(I)I")
    public final int method1345(int arg0) {
        return this.method1341(arg0);
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(J)V")
    public final void method1346(long arg0) {
        this.field3126 = arg0;
        int var3 = this.field3123.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field3128[var4] = 0;
            this.field3127[var4] = 0;
            this.field3121.field3044 = this.field3129[var4];
            this.method1340(var4);
            this.field3123[var4] = this.field3121.field3044;
        }
    }

    @OriginalMember(owner = "client!sc", name = "c", descriptor = "()V")
    public final void method1347() {
        this.field3121.field3044 = -1;
    }

    @OriginalMember(owner = "client!sc", name = "d", descriptor = "()I")
    public final int method1348() {
        return this.field3123.length;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "([B)V")
    public final void method1349(byte[] arg0) {
        this.field3121.field3066 = arg0;
        this.field3121.field3044 = 10;
        int var2 = this.field3121.method1272((byte) -57);
        this.field3125 = this.field3121.method1272((byte) -61);
        this.field3124 = 500000;
        this.field3129 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var5 = this.field3121.method1284(8388607);
            int var6 = this.field3121.method1284(8388607);
            if (var5 == 1297379947) {
                this.field3129[var3] = this.field3121.field3044;
                var3++;
            }
            this.field3121.field3044 += var6;
        }
        this.field3126 = 0L;
        this.field3123 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            this.field3123[var4] = this.field3129[var4];
        }
        this.field3128 = new int[var2];
        this.field3127 = new int[var2];
    }

    @OriginalMember(owner = "client!sc", name = "e", descriptor = "()I")
    public final int method1350() {
        int var1 = this.field3123.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field3123[var4] >= 0 && this.field3128[var4] < var3) {
                var2 = var4;
                var3 = this.field3128[var4];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(II)I")
    private final int method1351(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field3122[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field3121.method1322(false) << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field3121.method1322(false) << 16;
            }
            return var8;
        }
        int var3 = this.field3121.method1322(false);
        int var4 = this.field3121.method1271(126);
        if (var3 == 47) {
            this.field3121.field3044 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field3121.method1275(-1);
            var4 -= 3;
            int var6 = this.field3128[arg0];
            this.field3126 += (long) (this.field3124 - var5) * (long) var6;
            this.field3124 = var5;
            this.field3121.field3044 += var4;
            return 2;
        } else {
            this.field3121.field3044 += var4;
            return 3;
        }
    }

    @OriginalMember(owner = "client!sc", name = "f", descriptor = "(I)J")
    public final long method1352(int arg0) {
        return (long) this.field3124 * (long) arg0 + this.field3126;
    }

    @OriginalMember(owner = "client!sc", name = "f", descriptor = "()Z")
    public final boolean method1353() {
        int var1 = this.field3123.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field3123[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!sc", name = "g", descriptor = "()V")
    public static void method1354() {
        field3122 = null;
    }

    @OriginalMember(owner = "client!sc", name = "<init>", descriptor = "()V")
    public class192() {
    }

    @OriginalMember(owner = "client!sc", name = "<init>", descriptor = "([B)V")
    public class192(byte[] arg0) {
        this.method1349(arg0);
    }
}
