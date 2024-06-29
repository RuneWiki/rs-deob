import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!h")
public class class94 {

    @OriginalMember(owner = "client!h", name = "a", descriptor = "Lca;")
    private class54 field1394 = new class54((byte[]) null);

    @OriginalMember(owner = "client!h", name = "d", descriptor = "[B")
    private static byte[] field1397 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!h", name = "b", descriptor = "I")
    private int field1395;

    @OriginalMember(owner = "client!h", name = "f", descriptor = "I")
    public int field1399;

    @OriginalMember(owner = "client!h", name = "e", descriptor = "J")
    private long field1398;

    @OriginalMember(owner = "client!h", name = "c", descriptor = "[I")
    private int[] field1396;

    @OriginalMember(owner = "client!h", name = "g", descriptor = "[I")
    private int[] field1400;

    @OriginalMember(owner = "client!h", name = "h", descriptor = "[I")
    public int[] field1401;

    @OriginalMember(owner = "client!h", name = "i", descriptor = "[I")
    private int[] field1402;

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(I)V")
    public final void method697(int arg0) {
        int var2 = this.field1394.method405((byte) -122);
        this.field1401[arg0] += var2;
    }

    @OriginalMember(owner = "client!h", name = "b", descriptor = "(I)I")
    private final int method698(int arg0) {
        byte var2 = this.field1394.field848[this.field1394.field887];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field1400[arg0] = var3;
            this.field1394.field887++;
        } else {
            var3 = this.field1400[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method712(arg0, var3);
        }
        int var4 = this.field1394.method405((byte) -122);
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field1394.field848[this.field1394.field887] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field1394.field887++;
                this.field1400[arg0] = var5;
                return this.method712(arg0, var5);
            }
        }
        this.field1394.field887 += var4;
        return 0;
    }

    @OriginalMember(owner = "client!h", name = "c", descriptor = "(I)V")
    public final void method699(int arg0) {
        this.field1396[arg0] = this.field1394.field887;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "()I")
    public final int method700() {
        int var1 = this.field1396.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field1396[var4] >= 0 && this.field1401[var4] < var3) {
                var2 = var4;
                var3 = this.field1401[var4];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!h", name = "b", descriptor = "()V")
    public final void method701() {
        this.field1394.field848 = null;
        this.field1402 = null;
        this.field1396 = null;
        this.field1401 = null;
        this.field1400 = null;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(J)V")
    public final void method702(long arg0) {
        this.field1398 = arg0;
        int var3 = this.field1396.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field1401[var4] = 0;
            this.field1400[var4] = 0;
            this.field1394.field887 = this.field1402[var4];
            this.method697(var4);
            this.field1396[var4] = this.field1394.field887;
        }
    }

    @OriginalMember(owner = "client!h", name = "d", descriptor = "(I)J")
    public final long method703(int arg0) {
        return (long) this.field1395 * (long) arg0 + this.field1398;
    }

    @OriginalMember(owner = "client!h", name = "e", descriptor = "(I)V")
    public final void method704(int arg0) {
        this.field1394.field887 = this.field1396[arg0];
    }

    @OriginalMember(owner = "client!h", name = "c", descriptor = "()V")
    public static void method705() {
        field1397 = null;
    }

    @OriginalMember(owner = "client!h", name = "d", descriptor = "()Z")
    public final boolean method706() {
        int var1 = this.field1396.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field1396[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "([B)V")
    public final void method707(byte[] arg0) {
        this.field1394.field848 = arg0;
        this.field1394.field887 = 10;
        int var2 = this.field1394.method423(77);
        this.field1399 = this.field1394.method423(116);
        this.field1395 = 500000;
        this.field1402 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var5 = this.field1394.method420((byte) 66);
            int var6 = this.field1394.method420((byte) 76);
            if (var5 == 1297379947) {
                this.field1402[var3] = this.field1394.field887;
                var3++;
            }
            this.field1394.field887 += var6;
        }
        this.field1398 = 0L;
        this.field1396 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            this.field1396[var4] = this.field1402[var4];
        }
        this.field1401 = new int[var2];
        this.field1400 = new int[var2];
    }

    @OriginalMember(owner = "client!h", name = "e", descriptor = "()V")
    public final void method708() {
        this.field1394.field887 = -1;
    }

    @OriginalMember(owner = "client!h", name = "f", descriptor = "(I)I")
    public final int method709(int arg0) {
        return this.method698(arg0);
    }

    @OriginalMember(owner = "client!h", name = "f", descriptor = "()I")
    public final int method710() {
        return this.field1396.length;
    }

    @OriginalMember(owner = "client!h", name = "g", descriptor = "()Z")
    public final boolean method711() {
        return this.field1394.field848 != null;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(II)I")
    private final int method712(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field1397[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field1394.method407(255) << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field1394.method407(255) << 16;
            }
            return var8;
        }
        int var3 = this.field1394.method407(255);
        int var4 = this.field1394.method405((byte) -122);
        if (var3 == 47) {
            this.field1394.field887 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field1394.method408(8);
            var4 -= 3;
            int var6 = this.field1401[arg0];
            this.field1398 += (long) (this.field1395 - var5) * (long) var6;
            this.field1395 = var5;
            this.field1394.field887 += var4;
            return 2;
        } else {
            this.field1394.field887 += var4;
            return 3;
        }
    }

    @OriginalMember(owner = "client!h", name = "<init>", descriptor = "()V")
    public class94() {
    }

    @OriginalMember(owner = "client!h", name = "<init>", descriptor = "([B)V")
    public class94(byte[] arg0) {
        this.method707(arg0);
    }
}
