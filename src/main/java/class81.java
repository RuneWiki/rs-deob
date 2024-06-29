import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!al")
public class class81 {

    @OriginalMember(owner = "client!al", name = "b", descriptor = "Lva;")
    private class235 field1374 = new class235((byte[]) null);

    @OriginalMember(owner = "client!al", name = "a", descriptor = "[B")
    private static byte[] field1373 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!al", name = "d", descriptor = "I")
    private int field1376;

    @OriginalMember(owner = "client!al", name = "f", descriptor = "I")
    public int field1378;

    @OriginalMember(owner = "client!al", name = "h", descriptor = "J")
    private long field1380;

    @OriginalMember(owner = "client!al", name = "c", descriptor = "[I")
    public int[] field1375;

    @OriginalMember(owner = "client!al", name = "e", descriptor = "[I")
    private int[] field1377;

    @OriginalMember(owner = "client!al", name = "g", descriptor = "[I")
    private int[] field1379;

    @OriginalMember(owner = "client!al", name = "i", descriptor = "[I")
    private int[] field1381;

    @OriginalMember(owner = "client!al", name = "a", descriptor = "()V", line = 4)
    public final void method578() {
        this.field1374.field4066 = null;
        this.field1379 = null;
        this.field1377 = null;
        this.field1375 = null;
        this.field1381 = null;
    }

    @OriginalMember(owner = "client!al", name = "b", descriptor = "()I", line = 13)
    public final int method579() {
        return this.field1377.length;
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(II)I", line = 17)
    private final int method580(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field1373[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field1374.method1589(110) << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field1374.method1589(126) << 16;
            }
            return var8;
        }
        int var3 = this.field1374.method1589(73);
        int var4 = this.field1374.method1595(0);
        if (var3 == 47) {
            this.field1374.field4051 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field1374.method1602(18160);
            var4 -= 3;
            int var6 = this.field1375[arg0];
            this.field1380 += (long) (this.field1376 - var5) * (long) var6;
            this.field1376 = var5;
            this.field1374.field4051 += var4;
            return 2;
        } else {
            this.field1374.field4051 += var4;
            return 3;
        }
    }

    @OriginalMember(owner = "client!al", name = "c", descriptor = "()V", line = 59)
    public final void method581() {
        this.field1374.field4051 = -1;
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(I)I", line = 66)
    private final int method582(int arg0) {
        byte var2 = this.field1374.field4066[this.field1374.field4051];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field1381[arg0] = var3;
            this.field1374.field4051++;
        } else {
            var3 = this.field1381[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method580(arg0, var3);
        }
        int var4 = this.field1374.method1595(0);
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field1374.field4066[this.field1374.field4051] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field1374.field4051++;
                this.field1381[arg0] = var5;
                return this.method580(arg0, var5);
            }
        }
        this.field1374.field4051 += var4;
        return 0;
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(J)V", line = 104)
    public final void method583(long arg0) {
        this.field1380 = arg0;
        int var3 = this.field1377.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field1375[var4] = 0;
            this.field1381[var4] = 0;
            this.field1374.field4051 = this.field1379[var4];
            this.method588(var4);
            this.field1377[var4] = this.field1374.field4051;
        }
    }

    @OriginalMember(owner = "client!al", name = "d", descriptor = "()I", line = 123)
    public final int method584() {
        int var1 = this.field1377.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field1377[var4] >= 0 && this.field1375[var4] < var3) {
                var2 = var4;
                var3 = this.field1375[var4];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!al", name = "e", descriptor = "()Z", line = 152)
    public final boolean method585() {
        int var1 = this.field1377.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field1377[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!al", name = "b", descriptor = "(I)V", line = 165)
    public final void method586(int arg0) {
        this.field1377[arg0] = this.field1374.field4051;
    }

    @OriginalMember(owner = "client!al", name = "c", descriptor = "(I)J", line = 169)
    public final long method587(int arg0) {
        return (long) this.field1376 * (long) arg0 + this.field1380;
    }

    @OriginalMember(owner = "client!al", name = "d", descriptor = "(I)V", line = 178)
    public final void method588(int arg0) {
        int var2 = this.field1374.method1595(0);
        this.field1375[arg0] += var2;
    }

    @OriginalMember(owner = "client!al", name = "e", descriptor = "(I)I", line = 183)
    public final int method589(int arg0) {
        return this.method582(arg0);
    }

    @OriginalMember(owner = "client!al", name = "<init>", descriptor = "()V", line = 261)
    public class81() {
    }

    @OriginalMember(owner = "client!al", name = "<init>", descriptor = "([B)V", line = 266)
    public class81(byte[] arg0) {
        this.method590(arg0);
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "([B)V", line = 195)
    public final void method590(byte[] arg0) {
        this.field1374.field4066 = arg0;
        this.field1374.field4051 = 10;
        int var2 = this.field1374.method1615(11);
        this.field1378 = this.field1374.method1615(-123);
        this.field1376 = 500000;
        this.field1379 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field1374.method1611(-91);
            int var5 = this.field1374.method1611(-76);
            if (var4 == 1297379947) {
                this.field1379[var3] = this.field1374.field4051;
                var3++;
            }
            this.field1374.field4051 += var5;
        }
        this.field1380 = 0L;
        this.field1377 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field1377[var6] = this.field1379[var6];
        }
        this.field1375 = new int[var2];
        this.field1381 = new int[var2];
    }

    @OriginalMember(owner = "client!al", name = "f", descriptor = "()Z", line = 253)
    public final boolean method591() {
        return this.field1374.field4066 != null;
    }

    @OriginalMember(owner = "client!al", name = "f", descriptor = "(I)V", line = 259)
    public final void method592(int arg0) {
        this.field1374.field4051 = this.field1377[arg0];
    }

    @OriginalMember(owner = "client!al", name = "g", descriptor = "()V", line = 264)
    public static void method593() {
        field1373 = null;
    }
}
