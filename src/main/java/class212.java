import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!th")
public class class212 {

    @OriginalMember(owner = "client!th", name = "a", descriptor = "Lkd;")
    private class112 field3878 = new class112(null);

    @OriginalMember(owner = "client!th", name = "d", descriptor = "[B")
    private static byte[] field3881 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!th", name = "e", descriptor = "I")
    public int field3882;

    @OriginalMember(owner = "client!th", name = "i", descriptor = "I")
    private int field3886;

    @OriginalMember(owner = "client!th", name = "b", descriptor = "J")
    private long field3879;

    @OriginalMember(owner = "client!th", name = "c", descriptor = "[I")
    private int[] field3880;

    @OriginalMember(owner = "client!th", name = "f", descriptor = "[I")
    private int[] field3883;

    @OriginalMember(owner = "client!th", name = "g", descriptor = "[I")
    public int[] field3884;

    @OriginalMember(owner = "client!th", name = "h", descriptor = "[I")
    private int[] field3885;

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(I)V")
    public final void method1313(int arg0) {
        this.field3878.field2133 = this.field3883[arg0];
    }

    @OriginalMember(owner = "client!th", name = "b", descriptor = "(I)V")
    public final void method1314(int arg0) {
        int var2 = this.field3878.method733((byte) 80);
        this.field3884[arg0] += var2;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "()Z")
    public final boolean method1315() {
        int var1 = this.field3883.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field3883[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!th", name = "b", descriptor = "()I")
    public final int method1316() {
        return this.field3883.length;
    }

    @OriginalMember(owner = "client!th", name = "c", descriptor = "(I)I")
    private final int method1317(int arg0) {
        byte var2 = this.field3878.field2157[this.field3878.field2133];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field3880[arg0] = var3;
            this.field3878.field2133++;
        } else {
            var3 = this.field3880[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method1318(arg0, var3);
        }
        int var4 = this.field3878.method733((byte) 88);
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field3878.field2157[this.field3878.field2133] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field3878.field2133++;
                this.field3880[arg0] = var5;
                return this.method1318(arg0, var5);
            }
        }
        this.field3878.field2133 += var4;
        return 0;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(II)I")
    private final int method1318(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field3881[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field3878.method716(-1308) << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field3878.method716(-1308) << 16;
            }
            return var8;
        }
        int var3 = this.field3878.method716(-1308);
        int var4 = this.field3878.method733((byte) 89);
        if (var3 == 47) {
            this.field3878.field2133 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field3878.method718(false);
            var4 -= 3;
            int var6 = this.field3884[arg0];
            this.field3879 += (long) (this.field3886 - var5) * (long) var6;
            this.field3886 = var5;
            this.field3878.field2133 += var4;
            return 2;
        } else {
            this.field3878.field2133 += var4;
            return 3;
        }
    }

    @OriginalMember(owner = "client!th", name = "c", descriptor = "()V")
    public static void method1319() {
        field3881 = null;
    }

    @OriginalMember(owner = "client!th", name = "d", descriptor = "()V")
    public final void method1320() {
        this.field3878.field2133 = -1;
    }

    @OriginalMember(owner = "client!th", name = "d", descriptor = "(I)V")
    public final void method1321(int arg0) {
        this.field3883[arg0] = this.field3878.field2133;
    }

    @OriginalMember(owner = "client!th", name = "e", descriptor = "()V")
    public final void method1322() {
        this.field3878.field2157 = null;
        this.field3885 = null;
        this.field3883 = null;
        this.field3884 = null;
        this.field3880 = null;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "([B)V")
    public final void method1323(byte[] arg0) {
        this.field3878.field2157 = arg0;
        this.field3878.field2133 = 10;
        int var2 = this.field3878.method739(124);
        this.field3882 = this.field3878.method739(121);
        this.field3886 = 500000;
        this.field3885 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var5 = this.field3878.method759(65);
            int var6 = this.field3878.method759(110);
            if (var5 == 1297379947) {
                this.field3885[var3] = this.field3878.field2133;
                var3++;
            }
            this.field3878.field2133 += var6;
        }
        this.field3879 = 0L;
        this.field3883 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            this.field3883[var4] = this.field3885[var4];
        }
        this.field3884 = new int[var2];
        this.field3880 = new int[var2];
    }

    @OriginalMember(owner = "client!th", name = "e", descriptor = "(I)J")
    public final long method1324(int arg0) {
        return (long) this.field3886 * (long) arg0 + this.field3879;
    }

    @OriginalMember(owner = "client!th", name = "f", descriptor = "()I")
    public final int method1325() {
        int var1 = this.field3883.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field3883[var4] >= 0 && this.field3884[var4] < var3) {
                var2 = var4;
                var3 = this.field3884[var4];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!th", name = "f", descriptor = "(I)I")
    public final int method1326(int arg0) {
        return this.method1317(arg0);
    }

    @OriginalMember(owner = "client!th", name = "g", descriptor = "()Z")
    public final boolean method1327() {
        return this.field3878.field2157 != null;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(J)V")
    public final void method1328(long arg0) {
        this.field3879 = arg0;
        int var3 = this.field3883.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field3884[var4] = 0;
            this.field3880[var4] = 0;
            this.field3878.field2133 = this.field3885[var4];
            this.method1314(var4);
            this.field3883[var4] = this.field3878.field2133;
        }
    }

    @OriginalMember(owner = "client!th", name = "<init>", descriptor = "()V")
    public class212() {
    }

    @OriginalMember(owner = "client!th", name = "<init>", descriptor = "([B)V")
    public class212(byte[] arg0) {
        this.method1323(arg0);
    }
}
