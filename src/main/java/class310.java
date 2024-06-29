import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nu")
public class class310 {

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "Lia;")
    private class23 field4914 = new class23(null);

    @OriginalMember(owner = "client!nu", name = "b", descriptor = "[B")
    private static byte[] field4915 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!nu", name = "c", descriptor = "I")
    public int field4916;

    @OriginalMember(owner = "client!nu", name = "g", descriptor = "I")
    private int field4920;

    @OriginalMember(owner = "client!nu", name = "d", descriptor = "J")
    private long field4917;

    @OriginalMember(owner = "client!nu", name = "e", descriptor = "[I")
    private int[] field4918;

    @OriginalMember(owner = "client!nu", name = "f", descriptor = "[I")
    public int[] field4919;

    @OriginalMember(owner = "client!nu", name = "h", descriptor = "[I")
    private int[] field4921;

    @OriginalMember(owner = "client!nu", name = "i", descriptor = "[I")
    private int[] field4922;

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "()Z", line = 5)
    public final boolean method1968() {
        int var1 = this.field4921.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field4921[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "(I)V", line = 20)
    public final void method1969(int arg0) {
        int var2 = this.field4914.method169((byte) -70);
        this.field4919[arg0] += var2;
    }

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "(II)I", line = 24)
    private final int method1970(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field4915[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field4914.method126((byte) -116) << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field4914.method126((byte) -117) << 16;
            }
            return var8;
        }
        int var3 = this.field4914.method126((byte) -80);
        int var4 = this.field4914.method169((byte) -70);
        if (var3 == 47) {
            this.field4914.field301 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field4914.method181(103);
            var4 -= 3;
            int var6 = this.field4919[arg0];
            this.field4917 += (long) (this.field4920 - var5) * (long) var6;
            this.field4920 = var5;
            this.field4914.field301 += var4;
            return 2;
        } else {
            this.field4914.field301 += var4;
            return 3;
        }
    }

    @OriginalMember(owner = "client!nu", name = "b", descriptor = "()V", line = 66)
    public final void method1971() {
        this.field4914.field301 = -1;
    }

    @OriginalMember(owner = "client!nu", name = "<init>", descriptor = "()V", line = 245)
    public class310() {
    }

    @OriginalMember(owner = "client!nu", name = "<init>", descriptor = "([B)V", line = 266)
    public class310(byte[] arg0) {
        this.method1976(arg0);
    }

    @OriginalMember(owner = "client!nu", name = "b", descriptor = "(I)V", line = 74)
    public final void method1972(int arg0) {
        this.field4921[arg0] = this.field4914.field301;
    }

    @OriginalMember(owner = "client!nu", name = "c", descriptor = "()I", line = 77)
    public final int method1973() {
        return this.field4921.length;
    }

    @OriginalMember(owner = "client!nu", name = "d", descriptor = "()V", line = 81)
    public final void method1974() {
        this.field4914.field302 = null;
        this.field4918 = null;
        this.field4921 = null;
        this.field4919 = null;
        this.field4922 = null;
    }

    @OriginalMember(owner = "client!nu", name = "c", descriptor = "(I)J", line = 90)
    public final long method1975(int arg0) {
        return (long) this.field4920 * (long) arg0 + this.field4917;
    }

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "([B)V", line = 93)
    public final void method1976(byte[] arg0) {
        this.field4914.field302 = arg0;
        this.field4914.field301 = 10;
        int var2 = this.field4914.method132(74);
        this.field4916 = this.field4914.method132(41);
        this.field4920 = 500000;
        this.field4918 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var5 = this.field4914.method143(-3230);
            int var6 = this.field4914.method143(-3230);
            if (var5 == 1297379947) {
                this.field4918[var3] = this.field4914.field301;
                var3++;
            }
            this.field4914.field301 += var6;
        }
        this.field4917 = 0L;
        this.field4921 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            this.field4921[var4] = this.field4918[var4];
        }
        this.field4919 = new int[var2];
        this.field4922 = new int[var2];
    }

    @OriginalMember(owner = "client!nu", name = "d", descriptor = "(I)I", line = 150)
    private final int method1977(int arg0) {
        byte var2 = this.field4914.field302[this.field4914.field301];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field4922[arg0] = var3;
            this.field4914.field301++;
        } else {
            var3 = this.field4922[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method1970(arg0, var3);
        }
        int var4 = this.field4914.method169((byte) -70);
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field4914.field302[this.field4914.field301] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field4914.field301++;
                this.field4922[arg0] = var5;
                return this.method1970(arg0, var5);
            }
        }
        this.field4914.field301 += var4;
        return 0;
    }

    @OriginalMember(owner = "client!nu", name = "e", descriptor = "(I)V", line = 190)
    public final void method1978(int arg0) {
        this.field4914.field301 = this.field4921[arg0];
    }

    @OriginalMember(owner = "client!nu", name = "e", descriptor = "()V", line = 193)
    public static void method1979() {
        field4915 = null;
    }

    @OriginalMember(owner = "client!nu", name = "f", descriptor = "()Z", line = 203)
    public final boolean method1980() {
        return this.field4914.field302 != null;
    }

    @OriginalMember(owner = "client!nu", name = "f", descriptor = "(I)I", line = 210)
    public final int method1981(int arg0) {
        return this.method1977(arg0);
    }

    @OriginalMember(owner = "client!nu", name = "g", descriptor = "()I", line = 220)
    public final int method1982() {
        int var1 = this.field4921.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field4921[var4] >= 0 && this.field4919[var4] < var3) {
                var2 = var4;
                var3 = this.field4919[var4];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "(J)V", line = 248)
    public final void method1983(long arg0) {
        this.field4917 = arg0;
        int var3 = this.field4921.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field4919[var4] = 0;
            this.field4922[var4] = 0;
            this.field4914.field301 = this.field4918[var4];
            this.method1969(var4);
            this.field4921[var4] = this.field4914.field301;
        }
    }
}
