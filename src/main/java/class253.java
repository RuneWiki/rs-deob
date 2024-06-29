import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jc")
public class class253 {

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "Lbk;")
    private class211 field3410 = new class211((byte[]) null);

    @OriginalMember(owner = "client!jc", name = "d", descriptor = "[B")
    private static byte[] field3413 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "I")
    private int field3411;

    @OriginalMember(owner = "client!jc", name = "e", descriptor = "I")
    public int field3414;

    @OriginalMember(owner = "client!jc", name = "f", descriptor = "J")
    private long field3415;

    @OriginalMember(owner = "client!jc", name = "c", descriptor = "[I")
    private int[] field3412;

    @OriginalMember(owner = "client!jc", name = "g", descriptor = "[I")
    private int[] field3416;

    @OriginalMember(owner = "client!jc", name = "h", descriptor = "[I")
    public int[] field3417;

    @OriginalMember(owner = "client!jc", name = "i", descriptor = "[I")
    private int[] field3418;

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "()V", line = 4)
    public final void method1580() {
        this.field3410.field2888 = -1;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(J)V", line = 7)
    public final void method1581(long arg0) {
        this.field3415 = arg0;
        int var3 = this.field3412.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field3417[var4] = 0;
            this.field3416[var4] = 0;
            this.field3410.field2888 = this.field3418[var4];
            this.method1583(var4);
            this.field3412[var4] = this.field3410.field2888;
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(I)J", line = 25)
    public final long method1582(int arg0) {
        return (long) this.field3411 * (long) arg0 + this.field3415;
    }

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "(I)V", line = 30)
    public final void method1583(int arg0) {
        int var2 = this.field3410.method1391(102);
        this.field3417[arg0] += var2;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(II)I", line = 34)
    private final int method1584(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field3413[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field3410.method1342((byte) -126) << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field3410.method1342((byte) -126) << 16;
            }
            return var8;
        }
        int var3 = this.field3410.method1342((byte) -127);
        int var4 = this.field3410.method1391(89);
        if (var3 == 47) {
            this.field3410.field2888 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field3410.method1353(84);
            var4 -= 3;
            int var6 = this.field3417[arg0];
            this.field3415 += (long) (this.field3411 - var5) * (long) var6;
            this.field3411 = var5;
            this.field3410.field2888 += var4;
            return 2;
        } else {
            this.field3410.field2888 += var4;
            return 3;
        }
    }

    @OriginalMember(owner = "client!jc", name = "c", descriptor = "(I)I", line = 78)
    public final int method1585(int arg0) {
        return this.method1595(arg0);
    }

    @OriginalMember(owner = "client!jc", name = "d", descriptor = "(I)V", line = 84)
    public final void method1586(int arg0) {
        this.field3412[arg0] = this.field3410.field2888;
    }

    @OriginalMember(owner = "client!jc", name = "e", descriptor = "(I)V", line = 87)
    public final void method1587(int arg0) {
        this.field3410.field2888 = this.field3412[arg0];
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "([B)V", line = 92)
    public final void method1588(byte[] arg0) {
        this.field3410.field2867 = arg0;
        this.field3410.field2888 = 10;
        int var2 = this.field3410.method1355(32136);
        this.field3414 = this.field3410.method1355(32136);
        this.field3411 = 500000;
        this.field3418 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var5 = this.field3410.method1336((byte) -121);
            int var6 = this.field3410.method1336((byte) -95);
            if (var5 == 1297379947) {
                this.field3418[var3] = this.field3410.field2888;
                var3++;
            }
            this.field3410.field2888 += var6;
        }
        this.field3415 = 0L;
        this.field3412 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            this.field3412[var4] = this.field3418[var4];
        }
        this.field3417 = new int[var2];
        this.field3416 = new int[var2];
    }

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "()Z", line = 146)
    public final boolean method1589() {
        int var1 = this.field3412.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field3412[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!jc", name = "c", descriptor = "()V", line = 160)
    public static void method1590() {
        field3413 = null;
    }

    @OriginalMember(owner = "client!jc", name = "d", descriptor = "()V", line = 163)
    public final void method1591() {
        this.field3410.field2867 = null;
        this.field3418 = null;
        this.field3412 = null;
        this.field3417 = null;
        this.field3416 = null;
    }

    @OriginalMember(owner = "client!jc", name = "e", descriptor = "()I", line = 177)
    public final int method1592() {
        int var1 = this.field3412.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field3412[var4] >= 0 && this.field3417[var4] < var3) {
                var2 = var4;
                var3 = this.field3417[var4];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!jc", name = "<init>", descriptor = "()V", line = 264)
    public class253() {
    }

    @OriginalMember(owner = "client!jc", name = "<init>", descriptor = "([B)V", line = 266)
    public class253(byte[] arg0) {
        this.method1588(arg0);
    }

    @OriginalMember(owner = "client!jc", name = "f", descriptor = "()Z", line = 214)
    public final boolean method1593() {
        return this.field3410.field2867 != null;
    }

    @OriginalMember(owner = "client!jc", name = "g", descriptor = "()I", line = 217)
    public final int method1594() {
        return this.field3412.length;
    }

    @OriginalMember(owner = "client!jc", name = "f", descriptor = "(I)I", line = 226)
    private final int method1595(int arg0) {
        byte var2 = this.field3410.field2867[this.field3410.field2888];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field3416[arg0] = var3;
            this.field3410.field2888++;
        } else {
            var3 = this.field3416[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method1584(arg0, var3);
        }
        int var4 = this.field3410.method1391(92);
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field3410.field2867[this.field3410.field2888] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field3410.field2888++;
                this.field3416[arg0] = var5;
                return this.method1584(arg0, var5);
            }
        }
        this.field3410.field2888 += var4;
        return 0;
    }
}
