import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!di")
public class class215 {

    @OriginalMember(owner = "client!di", name = "b", descriptor = "Lkh;")
    private class166 field3266 = new class166((byte[]) null);

    @OriginalMember(owner = "client!di", name = "a", descriptor = "[B")
    private static byte[] field3265 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!di", name = "c", descriptor = "I")
    public int field3267;

    @OriginalMember(owner = "client!di", name = "g", descriptor = "I")
    private int field3271;

    @OriginalMember(owner = "client!di", name = "f", descriptor = "J")
    private long field3270;

    @OriginalMember(owner = "client!di", name = "d", descriptor = "[I")
    private int[] field3268;

    @OriginalMember(owner = "client!di", name = "e", descriptor = "[I")
    private int[] field3269;

    @OriginalMember(owner = "client!di", name = "h", descriptor = "[I")
    public int[] field3272;

    @OriginalMember(owner = "client!di", name = "i", descriptor = "[I")
    private int[] field3273;

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(J)V", line = 4)
    public final void method1509(long arg0) {
        this.field3270 = arg0;
        int var3 = this.field3273.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field3272[var4] = 0;
            this.field3268[var4] = 0;
            this.field3266.field2532 = this.field3269[var4];
            this.method1511(var4);
            this.field3273[var4] = this.field3266.field2532;
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "()Z", line = 24)
    public final boolean method1510() {
        int var1 = this.field3273.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field3273[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(I)V", line = 40)
    public final void method1511(int arg0) {
        int var2 = this.field3266.method1127(124);
        this.field3272[arg0] += var2;
    }

    @OriginalMember(owner = "client!di", name = "b", descriptor = "()V", line = 50)
    public final void method1512() {
        this.field3266.field2532 = -1;
    }

    @OriginalMember(owner = "client!di", name = "b", descriptor = "(I)I", line = 54)
    private final int method1513(int arg0) {
        byte var2 = this.field3266.field2500[this.field3266.field2532];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field3268[arg0] = var3;
            this.field3266.field2532++;
        } else {
            var3 = this.field3268[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method1516(arg0, var3);
        }
        int var4 = this.field3266.method1127(123);
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field3266.field2500[this.field3266.field2532] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field3266.field2532++;
                this.field3268[arg0] = var5;
                return this.method1516(arg0, var5);
            }
        }
        this.field3266.field2532 += var4;
        return 0;
    }

    @OriginalMember(owner = "client!di", name = "c", descriptor = "(I)V", line = 92)
    public final void method1514(int arg0) {
        this.field3273[arg0] = this.field3266.field2532;
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "([B)V", line = 97)
    public final void method1515(byte[] arg0) {
        this.field3266.field2500 = arg0;
        this.field3266.field2532 = 10;
        int var2 = this.field3266.method1151(-61);
        this.field3267 = this.field3266.method1151(-95);
        this.field3271 = 500000;
        this.field3269 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field3266.method1137(76);
            int var5 = this.field3266.method1137(-31);
            if (var4 == 1297379947) {
                this.field3269[var3] = this.field3266.field2532;
                var3++;
            }
            this.field3266.field2532 += var5;
        }
        this.field3270 = 0L;
        this.field3273 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field3273[var6] = this.field3269[var6];
        }
        this.field3272 = new int[var2];
        this.field3268 = new int[var2];
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(II)I", line = 151)
    private final int method1516(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field3265[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field3266.method1178(0) << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field3266.method1178(0) << 16;
            }
            return var8;
        }
        int var3 = this.field3266.method1178(0);
        int var4 = this.field3266.method1127(127);
        if (var3 == 47) {
            this.field3266.field2532 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field3266.method1156((byte) 22);
            var4 -= 3;
            int var6 = this.field3272[arg0];
            this.field3270 += (long) (this.field3271 - var5) * (long) var6;
            this.field3271 = var5;
            this.field3266.field2532 += var4;
            return 2;
        } else {
            this.field3266.field2532 += var4;
            return 3;
        }
    }

    @OriginalMember(owner = "client!di", name = "c", descriptor = "()V", line = 193)
    public static void method1517() {
        field3265 = null;
    }

    @OriginalMember(owner = "client!di", name = "d", descriptor = "(I)V", line = 196)
    public final void method1518(int arg0) {
        this.field3266.field2532 = this.field3273[arg0];
    }

    @OriginalMember(owner = "client!di", name = "d", descriptor = "()I", line = 200)
    public final int method1519() {
        int var1 = this.field3273.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field3273[var4] >= 0 && this.field3272[var4] < var3) {
                var2 = var4;
                var3 = this.field3272[var4];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!di", name = "e", descriptor = "()I", line = 227)
    public final int method1520() {
        return this.field3273.length;
    }

    @OriginalMember(owner = "client!di", name = "e", descriptor = "(I)I", line = 231)
    public final int method1521(int arg0) {
        return this.method1513(arg0);
    }

    @OriginalMember(owner = "client!di", name = "f", descriptor = "(I)J", line = 237)
    public final long method1522(int arg0) {
        return (long) this.field3271 * (long) arg0 + this.field3270;
    }

    @OriginalMember(owner = "client!di", name = "f", descriptor = "()V", line = 242)
    public final void method1523() {
        this.field3266.field2500 = null;
        this.field3269 = null;
        this.field3273 = null;
        this.field3272 = null;
        this.field3268 = null;
    }

    @OriginalMember(owner = "client!di", name = "g", descriptor = "()Z", line = 251)
    public final boolean method1524() {
        return this.field3266.field2500 != null;
    }

    @OriginalMember(owner = "client!di", name = "<init>", descriptor = "()V", line = 264)
    public class215() {
    }

    @OriginalMember(owner = "client!di", name = "<init>", descriptor = "([B)V", line = 266)
    public class215(byte[] arg0) {
        this.method1515(arg0);
    }
}
