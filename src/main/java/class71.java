import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!td")
public class class71 {

    @OriginalMember(owner = "client!td", name = "a", descriptor = "Lqk;")
    private class200 field1450 = new class200((byte[]) null);

    @OriginalMember(owner = "client!td", name = "b", descriptor = "[B")
    private static byte[] field1451 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!td", name = "f", descriptor = "I")
    private int field1455;

    @OriginalMember(owner = "client!td", name = "i", descriptor = "I")
    public int field1458;

    @OriginalMember(owner = "client!td", name = "h", descriptor = "J")
    private long field1457;

    @OriginalMember(owner = "client!td", name = "c", descriptor = "[I")
    private int[] field1452;

    @OriginalMember(owner = "client!td", name = "d", descriptor = "[I")
    private int[] field1453;

    @OriginalMember(owner = "client!td", name = "e", descriptor = "[I")
    public int[] field1454;

    @OriginalMember(owner = "client!td", name = "g", descriptor = "[I")
    private int[] field1456;

    @OriginalMember(owner = "client!td", name = "a", descriptor = "()V")
    public final void method514() {
        this.field1450.field3547 = null;
        this.field1452 = null;
        this.field1453 = null;
        this.field1454 = null;
        this.field1456 = null;
    }

    @OriginalMember(owner = "client!td", name = "b", descriptor = "()Z")
    public final boolean method515() {
        return this.field1450.field3547 != null;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(I)J")
    public final long method516(int arg0) {
        return (long) this.field1455 * (long) arg0 + this.field1457;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "([B)V")
    public final void method517(byte[] arg0) {
        this.field1450.field3547 = arg0;
        this.field1450.field3565 = 10;
        int var2 = this.field1450.method1410(-72);
        this.field1458 = this.field1450.method1410(-123);
        this.field1455 = 500000;
        this.field1452 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var5 = this.field1450.method1386(-4603);
            int var6 = this.field1450.method1386(-4603);
            if (var5 == 1297379947) {
                this.field1452[var3] = this.field1450.field3565;
                var3++;
            }
            this.field1450.field3565 += var6;
        }
        this.field1457 = 0L;
        this.field1453 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            this.field1453[var4] = this.field1452[var4];
        }
        this.field1454 = new int[var2];
        this.field1456 = new int[var2];
    }

    @OriginalMember(owner = "client!td", name = "c", descriptor = "()I")
    public final int method518() {
        return this.field1453.length;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(II)I")
    private final int method519(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field1451[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field1450.method1408((byte) -57) << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field1450.method1408((byte) -90) << 16;
            }
            return var8;
        }
        int var3 = this.field1450.method1408((byte) -53);
        int var4 = this.field1450.method1387((byte) -12);
        if (var3 == 47) {
            this.field1450.field3565 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field1450.method1405(-3);
            var4 -= 3;
            int var6 = this.field1454[arg0];
            this.field1457 += (long) (this.field1455 - var5) * (long) var6;
            this.field1455 = var5;
            this.field1450.field3565 += var4;
            return 2;
        } else {
            this.field1450.field3565 += var4;
            return 3;
        }
    }

    @OriginalMember(owner = "client!td", name = "d", descriptor = "()V")
    public final void method520() {
        this.field1450.field3565 = -1;
    }

    @OriginalMember(owner = "client!td", name = "b", descriptor = "(I)I")
    private final int method521(int arg0) {
        byte var2 = this.field1450.field3547[this.field1450.field3565];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field1456[arg0] = var3;
            this.field1450.field3565++;
        } else {
            var3 = this.field1456[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method519(arg0, var3);
        }
        int var4 = this.field1450.method1387((byte) -12);
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field1450.field3547[this.field1450.field3565] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field1450.field3565++;
                this.field1456[arg0] = var5;
                return this.method519(arg0, var5);
            }
        }
        this.field1450.field3565 += var4;
        return 0;
    }

    @OriginalMember(owner = "client!td", name = "c", descriptor = "(I)V")
    public final void method522(int arg0) {
        this.field1450.field3565 = this.field1453[arg0];
    }

    @OriginalMember(owner = "client!td", name = "e", descriptor = "()V")
    public static void method523() {
        field1451 = null;
    }

    @OriginalMember(owner = "client!td", name = "f", descriptor = "()I")
    public final int method524() {
        int var1 = this.field1453.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field1453[var4] >= 0 && this.field1454[var4] < var3) {
                var2 = var4;
                var3 = this.field1454[var4];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!td", name = "d", descriptor = "(I)I")
    public final int method525(int arg0) {
        return this.method521(arg0);
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(J)V")
    public final void method526(long arg0) {
        this.field1457 = arg0;
        int var3 = this.field1453.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field1454[var4] = 0;
            this.field1456[var4] = 0;
            this.field1450.field3565 = this.field1452[var4];
            this.method529(var4);
            this.field1453[var4] = this.field1450.field3565;
        }
    }

    @OriginalMember(owner = "client!td", name = "g", descriptor = "()Z")
    public final boolean method527() {
        int var1 = this.field1453.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field1453[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!td", name = "e", descriptor = "(I)V")
    public final void method528(int arg0) {
        this.field1453[arg0] = this.field1450.field3565;
    }

    @OriginalMember(owner = "client!td", name = "f", descriptor = "(I)V")
    public final void method529(int arg0) {
        int var2 = this.field1450.method1387((byte) -65);
        this.field1454[arg0] += var2;
    }

    @OriginalMember(owner = "client!td", name = "<init>", descriptor = "()V")
    public class71() {
    }

    @OriginalMember(owner = "client!td", name = "<init>", descriptor = "([B)V")
    public class71(byte[] arg0) {
        this.method517(arg0);
    }
}
