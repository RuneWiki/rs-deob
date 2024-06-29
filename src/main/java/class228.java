import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vd")
public class class228 {

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "Lra;")
    private class185 field4214 = new class185(null);

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "[B")
    private static byte[] field4213 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!vd", name = "f", descriptor = "I")
    public int field4218;

    @OriginalMember(owner = "client!vd", name = "h", descriptor = "I")
    private int field4220;

    @OriginalMember(owner = "client!vd", name = "e", descriptor = "J")
    private long field4217;

    @OriginalMember(owner = "client!vd", name = "c", descriptor = "[I")
    public int[] field4215;

    @OriginalMember(owner = "client!vd", name = "d", descriptor = "[I")
    private int[] field4216;

    @OriginalMember(owner = "client!vd", name = "g", descriptor = "[I")
    private int[] field4219;

    @OriginalMember(owner = "client!vd", name = "i", descriptor = "[I")
    private int[] field4221;

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(I)V")
    public final void method1489(int arg0) {
        this.field4214.field3432 = this.field4221[arg0];
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "()Z")
    public final boolean method1490() {
        int var1 = this.field4221.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field4221[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "()I")
    public final int method1491() {
        return this.field4221.length;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(II)I")
    private final int method1492(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field4213[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field4214.method1243(3) << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field4214.method1243(3) << 16;
            }
            return var8;
        }
        int var3 = this.field4214.method1243(3);
        int var4 = this.field4214.method1218(-108);
        if (var3 == 47) {
            this.field4214.field3432 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field4214.method1244(-27523);
            var4 -= 3;
            int var6 = this.field4215[arg0];
            this.field4217 += (long) (this.field4220 - var5) * (long) var6;
            this.field4220 = var5;
            this.field4214.field3432 += var4;
            return 2;
        } else {
            this.field4214.field3432 += var4;
            return 3;
        }
    }

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "(I)I")
    private final int method1493(int arg0) {
        byte var2 = this.field4214.field3397[this.field4214.field3432];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field4216[arg0] = var3;
            this.field4214.field3432++;
        } else {
            var3 = this.field4216[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method1492(arg0, var3);
        }
        int var4 = this.field4214.method1218(-115);
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field4214.field3397[this.field4214.field3432] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field4214.field3432++;
                this.field4216[arg0] = var5;
                return this.method1492(arg0, var5);
            }
        }
        this.field4214.field3432 += var4;
        return 0;
    }

    @OriginalMember(owner = "client!vd", name = "c", descriptor = "()Z")
    public final boolean method1494() {
        return this.field4214.field3397 != null;
    }

    @OriginalMember(owner = "client!vd", name = "c", descriptor = "(I)I")
    public final int method1495(int arg0) {
        return this.method1493(arg0);
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "([B)V")
    public final void method1496(byte[] arg0) {
        this.field4214.field3397 = arg0;
        this.field4214.field3432 = 10;
        int var2 = this.field4214.method1252(2);
        this.field4218 = this.field4214.method1252(2);
        this.field4220 = 500000;
        this.field4219 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var5 = this.field4214.method1231(-4898);
            int var6 = this.field4214.method1231(-4898);
            if (var5 == 1297379947) {
                this.field4219[var3] = this.field4214.field3432;
                var3++;
            }
            this.field4214.field3432 += var6;
        }
        this.field4217 = 0L;
        this.field4221 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            this.field4221[var4] = this.field4219[var4];
        }
        this.field4215 = new int[var2];
        this.field4216 = new int[var2];
    }

    @OriginalMember(owner = "client!vd", name = "d", descriptor = "()I")
    public final int method1497() {
        int var1 = this.field4221.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field4221[var4] >= 0 && this.field4215[var4] < var3) {
                var2 = var4;
                var3 = this.field4215[var4];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(J)V")
    public final void method1498(long arg0) {
        this.field4217 = arg0;
        int var3 = this.field4221.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field4215[var4] = 0;
            this.field4216[var4] = 0;
            this.field4214.field3432 = this.field4219[var4];
            this.method1500(var4);
            this.field4221[var4] = this.field4214.field3432;
        }
    }

    @OriginalMember(owner = "client!vd", name = "d", descriptor = "(I)V")
    public final void method1499(int arg0) {
        this.field4221[arg0] = this.field4214.field3432;
    }

    @OriginalMember(owner = "client!vd", name = "e", descriptor = "(I)V")
    public final void method1500(int arg0) {
        int var2 = this.field4214.method1218(-96);
        this.field4215[arg0] += var2;
    }

    @OriginalMember(owner = "client!vd", name = "e", descriptor = "()V")
    public final void method1501() {
        this.field4214.field3397 = null;
        this.field4219 = null;
        this.field4221 = null;
        this.field4215 = null;
        this.field4216 = null;
    }

    @OriginalMember(owner = "client!vd", name = "f", descriptor = "()V")
    public final void method1502() {
        this.field4214.field3432 = -1;
    }

    @OriginalMember(owner = "client!vd", name = "g", descriptor = "()V")
    public static void method1503() {
        field4213 = null;
    }

    @OriginalMember(owner = "client!vd", name = "<init>", descriptor = "()V")
    public class228() {
    }

    @OriginalMember(owner = "client!vd", name = "f", descriptor = "(I)J")
    public final long method1504(int arg0) {
        return (long) this.field4220 * (long) arg0 + this.field4217;
    }

    @OriginalMember(owner = "client!vd", name = "<init>", descriptor = "([B)V")
    public class228(byte[] arg0) {
        this.method1496(arg0);
    }
}
