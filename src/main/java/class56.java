import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!i")
public class class56 {

    @OriginalMember(owner = "client!i", name = "b", descriptor = "Lrd;")
    private class122 field1345 = new class122(null);

    @OriginalMember(owner = "client!i", name = "a", descriptor = "[B")
    private static byte[] field1344 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!i", name = "c", descriptor = "I")
    public int field1346;

    @OriginalMember(owner = "client!i", name = "e", descriptor = "I")
    private int field1348;

    @OriginalMember(owner = "client!i", name = "d", descriptor = "J")
    private long field1347;

    @OriginalMember(owner = "client!i", name = "f", descriptor = "[I")
    private int[] field1349;

    @OriginalMember(owner = "client!i", name = "g", descriptor = "[I")
    private int[] field1350;

    @OriginalMember(owner = "client!i", name = "h", descriptor = "[I")
    private int[] field1351;

    @OriginalMember(owner = "client!i", name = "i", descriptor = "[I")
    public int[] field1352;

    @OriginalMember(owner = "client!i", name = "a", descriptor = "()I")
    public final int method446() {
        return this.field1351.length;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(I)V")
    public final void method447(int arg0) {
        int var2 = this.field1345.method949(255);
        this.field1352[arg0] += var2;
    }

    @OriginalMember(owner = "client!i", name = "b", descriptor = "()Z")
    public final boolean method448() {
        return this.field1345.field2895 != null;
    }

    @OriginalMember(owner = "client!i", name = "b", descriptor = "(I)V")
    public final void method449(int arg0) {
        this.field1345.field2903 = this.field1351[arg0];
    }

    @OriginalMember(owner = "client!i", name = "c", descriptor = "(I)I")
    public final int method450(int arg0) {
        return this.method452(arg0);
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(II)I")
    private final int method451(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field1344[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field1345.method931((byte) 124) << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field1345.method931((byte) 124) << 16;
            }
            return var8;
        }
        int var3 = this.field1345.method931((byte) 124);
        int var4 = this.field1345.method949(255);
        if (var3 == 47) {
            this.field1345.field2903 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field1345.method953(89);
            var4 -= 3;
            int var6 = this.field1352[arg0];
            this.field1347 += (long) (this.field1348 - var5) * (long) var6;
            this.field1348 = var5;
            this.field1345.field2903 += var4;
            return 2;
        } else {
            this.field1345.field2903 += var4;
            return 3;
        }
    }

    @OriginalMember(owner = "client!i", name = "d", descriptor = "(I)I")
    private final int method452(int arg0) {
        byte var2 = this.field1345.field2895[this.field1345.field2903];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field1349[arg0] = var3;
            this.field1345.field2903++;
        } else {
            var3 = this.field1349[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method451(arg0, var3);
        }
        int var4 = this.field1345.method949(255);
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field1345.field2895[this.field1345.field2903] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field1345.field2903++;
                this.field1349[arg0] = var5;
                return this.method451(arg0, var5);
            }
        }
        this.field1345.field2903 += var4;
        return 0;
    }

    @OriginalMember(owner = "client!i", name = "c", descriptor = "()V")
    public final void method453() {
        this.field1345.field2895 = null;
        this.field1350 = null;
        this.field1351 = null;
        this.field1352 = null;
        this.field1349 = null;
    }

    @OriginalMember(owner = "client!i", name = "d", descriptor = "()I")
    public final int method454() {
        int var1 = this.field1351.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field1351[var4] >= 0 && this.field1352[var4] < var3) {
                var2 = var4;
                var3 = this.field1352[var4];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!i", name = "e", descriptor = "(I)J")
    public final long method455(int arg0) {
        return (long) this.field1348 * (long) arg0 + this.field1347;
    }

    @OriginalMember(owner = "client!i", name = "e", descriptor = "()Z")
    public final boolean method456() {
        int var1 = this.field1351.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field1351[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(J)V")
    public final void method457(long arg0) {
        this.field1347 = arg0;
        int var3 = this.field1351.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field1352[var4] = 0;
            this.field1349[var4] = 0;
            this.field1345.field2903 = this.field1350[var4];
            this.method447(var4);
            this.field1351[var4] = this.field1345.field2903;
        }
    }

    @OriginalMember(owner = "client!i", name = "f", descriptor = "()V")
    public final void method458() {
        this.field1345.field2903 = -1;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "([B)V")
    public final void method459(byte[] arg0) {
        this.field1345.field2895 = arg0;
        this.field1345.field2903 = 10;
        int var2 = this.field1345.method965(false);
        this.field1346 = this.field1345.method965(false);
        this.field1348 = 500000;
        this.field1350 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var5 = this.field1345.method972(106);
            int var6 = this.field1345.method972(65);
            if (var5 == 1297379947) {
                this.field1350[var3] = this.field1345.field2903;
                var3++;
            }
            this.field1345.field2903 += var6;
        }
        this.field1347 = 0L;
        this.field1351 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            this.field1351[var4] = this.field1350[var4];
        }
        this.field1352 = new int[var2];
        this.field1349 = new int[var2];
    }

    @OriginalMember(owner = "client!i", name = "f", descriptor = "(I)V")
    public final void method460(int arg0) {
        this.field1351[arg0] = this.field1345.field2903;
    }

    @OriginalMember(owner = "client!i", name = "g", descriptor = "()V")
    public static void method461() {
        field1344 = null;
    }

    @OriginalMember(owner = "client!i", name = "<init>", descriptor = "()V")
    public class56() {
    }

    @OriginalMember(owner = "client!i", name = "<init>", descriptor = "([B)V")
    public class56(byte[] arg0) {
        this.method459(arg0);
    }
}
