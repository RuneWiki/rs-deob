import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ke")
public class class65 {

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "Lpd;")
    private class94 field1360 = new class94(null);

    @OriginalMember(owner = "client!ke", name = "g", descriptor = "[B")
    private static byte[] field1366 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "I")
    private int field1361;

    @OriginalMember(owner = "client!ke", name = "i", descriptor = "I")
    public int field1368;

    @OriginalMember(owner = "client!ke", name = "d", descriptor = "J")
    private long field1363;

    @OriginalMember(owner = "client!ke", name = "c", descriptor = "[I")
    public int[] field1362;

    @OriginalMember(owner = "client!ke", name = "e", descriptor = "[I")
    private int[] field1364;

    @OriginalMember(owner = "client!ke", name = "f", descriptor = "[I")
    private int[] field1365;

    @OriginalMember(owner = "client!ke", name = "h", descriptor = "[I")
    private int[] field1367;

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(I)V")
    public final void method413(int arg0) {
        int var2 = this.field1360.method674(127);
        this.field1362[arg0] += var2;
    }

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "(I)J")
    public final long method414(int arg0) {
        return (long) this.field1361 * (long) arg0 + this.field1363;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "()V")
    public final void method415() {
        this.field1360.field2077 = null;
        this.field1364 = null;
        this.field1367 = null;
        this.field1362 = null;
        this.field1365 = null;
    }

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "()Z")
    public final boolean method416() {
        int var1 = this.field1367.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field1367[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(II)I")
    private final int method417(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field1366[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field1360.method703((byte) 91) << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field1360.method703((byte) -53) << 16;
            }
            return var8;
        }
        int var3 = this.field1360.method703((byte) -112);
        int var4 = this.field1360.method674(127);
        if (var3 == 47) {
            this.field1360.field2061 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field1360.method677(-127);
            var4 -= 3;
            int var6 = this.field1362[arg0];
            this.field1363 += (long) (this.field1361 - var5) * (long) var6;
            this.field1361 = var5;
            this.field1360.field2061 += var4;
            return 2;
        } else {
            this.field1360.field2061 += var4;
            return 3;
        }
    }

    @OriginalMember(owner = "client!ke", name = "c", descriptor = "(I)I")
    public final int method418(int arg0) {
        return this.method426(arg0);
    }

    @OriginalMember(owner = "client!ke", name = "c", descriptor = "()V")
    public static void method419() {
        field1366 = null;
    }

    @OriginalMember(owner = "client!ke", name = "d", descriptor = "(I)V")
    public final void method420(int arg0) {
        this.field1367[arg0] = this.field1360.field2061;
    }

    @OriginalMember(owner = "client!ke", name = "e", descriptor = "(I)V")
    public final void method421(int arg0) {
        this.field1360.field2061 = this.field1367[arg0];
    }

    @OriginalMember(owner = "client!ke", name = "d", descriptor = "()Z")
    public final boolean method422() {
        return this.field1360.field2077 != null;
    }

    @OriginalMember(owner = "client!ke", name = "e", descriptor = "()I")
    public final int method423() {
        return this.field1367.length;
    }

    @OriginalMember(owner = "client!ke", name = "f", descriptor = "()I")
    public final int method424() {
        int var1 = this.field1367.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field1367[var4] >= 0 && this.field1362[var4] < var3) {
                var2 = var4;
                var3 = this.field1362[var4];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "([B)V")
    public final void method425(byte[] arg0) {
        this.field1360.field2077 = arg0;
        this.field1360.field2061 = 10;
        int var2 = this.field1360.method665(8666);
        this.field1368 = this.field1360.method665(8666);
        this.field1361 = 500000;
        this.field1364 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field1360.method667(5811);
            int var5 = this.field1360.method667(5811);
            if (var4 == 1297379947) {
                this.field1364[var3] = this.field1360.field2061;
                var3++;
            }
            this.field1360.field2061 += var5;
        }
        this.field1367 = (int[]) this.field1364.clone();
        this.field1362 = new int[var2];
        this.field1365 = new int[var2];
    }

    @OriginalMember(owner = "client!ke", name = "f", descriptor = "(I)I")
    private final int method426(int arg0) {
        byte var2 = this.field1360.field2077[this.field1360.field2061];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field1365[arg0] = var3;
            this.field1360.field2061++;
        } else {
            var3 = this.field1365[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method417(arg0, var3);
        }
        int var4 = this.field1360.method674(127);
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field1360.field2077[this.field1360.field2061] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field1360.field2061++;
                this.field1365[arg0] = var5;
                return this.method417(arg0, var5);
            }
        }
        this.field1360.field2061 += var4;
        return 0;
    }

    @OriginalMember(owner = "client!ke", name = "g", descriptor = "()V")
    public final void method427() {
        this.field1360.field2061 = -1;
    }

    @OriginalMember(owner = "client!ke", name = "h", descriptor = "()Z")
    public final boolean method428() {
        return this.field1360.field2061 < 0;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(J)V")
    public final void method429(long arg0) {
        this.field1363 = arg0;
        int var3 = this.field1367.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field1362[var4] = 0;
            this.field1365[var4] = 0;
            this.field1360.field2061 = this.field1364[var4];
            this.method413(var4);
            this.field1367[var4] = this.field1360.field2061;
        }
    }
}
