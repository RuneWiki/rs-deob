import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qha")
public class class232 {

    @OriginalMember(owner = "client!qha", name = "a", descriptor = "Lsl;")
    private class479 field3478 = new class479(null);

    @OriginalMember(owner = "client!qha", name = "b", descriptor = "[B")
    private static byte[] field3479 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!qha", name = "c", descriptor = "I")
    private int field3480;

    @OriginalMember(owner = "client!qha", name = "d", descriptor = "I")
    public int field3481;

    @OriginalMember(owner = "client!qha", name = "e", descriptor = "J")
    private long field3482;

    @OriginalMember(owner = "client!qha", name = "f", descriptor = "[I")
    private int[] field3483;

    @OriginalMember(owner = "client!qha", name = "g", descriptor = "[I")
    private int[] field3484;

    @OriginalMember(owner = "client!qha", name = "h", descriptor = "[I")
    private int[] field3485;

    @OriginalMember(owner = "client!qha", name = "i", descriptor = "[I")
    public int[] field3486;

    @OriginalMember(owner = "client!qha", name = "a", descriptor = "(I)I", line = 5)
    private final int method1607(int arg0) {
        byte var2 = this.field3478.field6800[this.field3478.field6864];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field3483[arg0] = var3;
            this.field3478.field6864++;
        } else {
            var3 = this.field3483[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method1613(arg0, var3);
        }
        int var4 = this.field3478.method2880(-7277);
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field3478.field6800[this.field3478.field6864] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field3478.field6864++;
                this.field3483[arg0] = var5;
                return this.method1613(arg0, var5);
            }
        }
        this.field3478.field6864 += var4;
        return 0;
    }

    @OriginalMember(owner = "client!qha", name = "a", descriptor = "()V", line = 43)
    public final void method1608() {
        this.field3478.field6800 = null;
        this.field3484 = null;
        this.field3485 = null;
        this.field3486 = null;
        this.field3483 = null;
    }

    @OriginalMember(owner = "client!qha", name = "b", descriptor = "(I)V", line = 53)
    public final void method1609(int arg0) {
        int var2 = this.field3478.method2880(-7277);
        this.field3486[arg0] += var2;
    }

    @OriginalMember(owner = "client!qha", name = "c", descriptor = "(I)V", line = 58)
    public final void method1610(int arg0) {
        this.field3485[arg0] = this.field3478.field6864;
    }

    @OriginalMember(owner = "client!qha", name = "b", descriptor = "()V", line = 61)
    public static void method1611() {
        field3479 = null;
    }

    @OriginalMember(owner = "client!qha", name = "c", descriptor = "()I", line = 66)
    public final int method1612() {
        int var1 = this.field3485.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field3485[var4] >= 0 && this.field3486[var4] < var3) {
                var2 = var4;
                var3 = this.field3486[var4];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!qha", name = "a", descriptor = "(II)I", line = 91)
    private final int method1613(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field3479[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field3478.method2886(true) << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field3478.method2886(true) << 16;
            }
            return var8;
        }
        int var3 = this.field3478.method2886(true);
        int var4 = this.field3478.method2880(-7277);
        if (var3 == 47) {
            this.field3478.field6864 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field3478.method2865(255);
            var4 -= 3;
            int var6 = this.field3486[arg0];
            this.field3482 += (long) (this.field3480 - var5) * (long) var6;
            this.field3480 = var5;
            this.field3478.field6864 += var4;
            return 2;
        } else {
            this.field3478.field6864 += var4;
            return 3;
        }
    }

    @OriginalMember(owner = "client!qha", name = "d", descriptor = "(I)V", line = 135)
    public final void method1614(int arg0) {
        this.field3478.field6864 = this.field3485[arg0];
    }

    @OriginalMember(owner = "client!qha", name = "d", descriptor = "()V", line = 138)
    public final void method1615() {
        this.field3478.field6864 = -1;
    }

    @OriginalMember(owner = "client!qha", name = "a", descriptor = "(J)V", line = 142)
    public final void method1616(long arg0) {
        this.field3482 = arg0;
        int var3 = this.field3485.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field3486[var4] = 0;
            this.field3483[var4] = 0;
            this.field3478.field6864 = this.field3484[var4];
            this.method1609(var4);
            this.field3485[var4] = this.field3478.field6864;
        }
    }

    @OriginalMember(owner = "client!qha", name = "a", descriptor = "([B)V", line = 160)
    public final void method1617(byte[] arg0) {
        this.field3478.field6800 = arg0;
        this.field3478.field6864 = 10;
        int var2 = this.field3478.method2882(-1);
        this.field3481 = this.field3478.method2882(-1);
        this.field3480 = 500000;
        this.field3484 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var5 = this.field3478.method2868(-103);
            int var6 = this.field3478.method2868(-41);
            if (var5 == 1297379947) {
                this.field3484[var3] = this.field3478.field6864;
                var3++;
            }
            this.field3478.field6864 += var6;
        }
        this.field3482 = 0L;
        this.field3485 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            this.field3485[var4] = this.field3484[var4];
        }
        this.field3486 = new int[var2];
        this.field3483 = new int[var2];
    }

    @OriginalMember(owner = "client!qha", name = "e", descriptor = "()I", line = 213)
    public final int method1618() {
        return this.field3485.length;
    }

    @OriginalMember(owner = "client!qha", name = "e", descriptor = "(I)I", line = 222)
    public final int method1619(int arg0) {
        return this.method1607(arg0);
    }

    @OriginalMember(owner = "client!qha", name = "f", descriptor = "()Z", line = 229)
    public final boolean method1620() {
        int var1 = this.field3485.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field3485[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!qha", name = "g", descriptor = "()Z", line = 242)
    public final boolean method1621() {
        return this.field3478.field6800 != null;
    }

    @OriginalMember(owner = "client!qha", name = "f", descriptor = "(I)J", line = 247)
    public final long method1622(int arg0) {
        return (long) this.field3480 * (long) arg0 + this.field3482;
    }

    @OriginalMember(owner = "client!qha", name = "<init>", descriptor = "()V", line = 264)
    public class232() {
    }

    @OriginalMember(owner = "client!qha", name = "<init>", descriptor = "([B)V", line = 266)
    public class232(byte[] arg0) {
        this.method1617(arg0);
    }
}
