import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ef")
public class class220 {

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "Lai;")
    private class88 field3384 = new class88((byte[]) null);

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "[B")
    private static byte[] field3385 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!ef", name = "d", descriptor = "I")
    private int field3387;

    @OriginalMember(owner = "client!ef", name = "i", descriptor = "I")
    public int field3392;

    @OriginalMember(owner = "client!ef", name = "g", descriptor = "J")
    private long field3390;

    @OriginalMember(owner = "client!ef", name = "c", descriptor = "[I")
    private int[] field3386;

    @OriginalMember(owner = "client!ef", name = "e", descriptor = "[I")
    public int[] field3388;

    @OriginalMember(owner = "client!ef", name = "f", descriptor = "[I")
    private int[] field3389;

    @OriginalMember(owner = "client!ef", name = "h", descriptor = "[I")
    private int[] field3391;

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(I)V")
    public final void method1475(int arg0) {
        this.field3386[arg0] = this.field3384.field1535;
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "([B)V")
    public final void method1476(byte[] arg0) {
        this.field3384.field1471 = arg0;
        this.field3384.field1535 = 10;
        int var2 = this.field3384.method645(11596);
        this.field3392 = this.field3384.method645(11596);
        this.field3387 = 500000;
        this.field3391 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var5 = this.field3384.method641(-1);
            int var6 = this.field3384.method641(-1);
            if (var5 == 1297379947) {
                this.field3391[var3] = this.field3384.field1535;
                var3++;
            }
            this.field3384.field1535 += var6;
        }
        this.field3390 = 0L;
        this.field3386 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            this.field3386[var4] = this.field3391[var4];
        }
        this.field3388 = new int[var2];
        this.field3389 = new int[var2];
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "()Z")
    public final boolean method1477() {
        int var1 = this.field3386.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field3386[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "()V")
    public final void method1478() {
        this.field3384.field1471 = null;
        this.field3391 = null;
        this.field3386 = null;
        this.field3388 = null;
        this.field3389 = null;
    }

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "(I)V")
    public final void method1479(int arg0) {
        this.field3384.field1535 = this.field3386[arg0];
    }

    @OriginalMember(owner = "client!ef", name = "c", descriptor = "(I)V")
    public final void method1480(int arg0) {
        int var2 = this.field3384.method642(-1911818777);
        this.field3388[arg0] += var2;
    }

    @OriginalMember(owner = "client!ef", name = "d", descriptor = "(I)J")
    public final long method1481(int arg0) {
        return (long) this.field3387 * (long) arg0 + this.field3390;
    }

    @OriginalMember(owner = "client!ef", name = "c", descriptor = "()Z")
    public final boolean method1482() {
        return this.field3384.field1471 != null;
    }

    @OriginalMember(owner = "client!ef", name = "d", descriptor = "()I")
    public final int method1483() {
        int var1 = this.field3386.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field3386[var4] >= 0 && this.field3388[var4] < var3) {
                var2 = var4;
                var3 = this.field3388[var4];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!ef", name = "e", descriptor = "(I)I")
    public final int method1484(int arg0) {
        return this.method1487(arg0);
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(II)I")
    private final int method1485(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field3385[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field3384.method633(68) << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field3384.method633(63) << 16;
            }
            return var8;
        }
        int var3 = this.field3384.method633(124);
        int var4 = this.field3384.method642(-1911818777);
        if (var3 == 47) {
            this.field3384.field1535 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field3384.method671(116);
            var4 -= 3;
            int var6 = this.field3388[arg0];
            this.field3390 += (long) (this.field3387 - var5) * (long) var6;
            this.field3387 = var5;
            this.field3384.field1535 += var4;
            return 2;
        } else {
            this.field3384.field1535 += var4;
            return 3;
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(J)V")
    public final void method1486(long arg0) {
        this.field3390 = arg0;
        int var3 = this.field3386.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field3388[var4] = 0;
            this.field3389[var4] = 0;
            this.field3384.field1535 = this.field3391[var4];
            this.method1480(var4);
            this.field3386[var4] = this.field3384.field1535;
        }
    }

    @OriginalMember(owner = "client!ef", name = "f", descriptor = "(I)I")
    private final int method1487(int arg0) {
        byte var2 = this.field3384.field1471[this.field3384.field1535];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field3389[arg0] = var3;
            this.field3384.field1535++;
        } else {
            var3 = this.field3389[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method1485(arg0, var3);
        }
        int var4 = this.field3384.method642(-1911818777);
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field3384.field1471[this.field3384.field1535] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field3384.field1535++;
                this.field3389[arg0] = var5;
                return this.method1485(arg0, var5);
            }
        }
        this.field3384.field1535 += var4;
        return 0;
    }

    @OriginalMember(owner = "client!ef", name = "e", descriptor = "()V")
    public static void method1488() {
        field3385 = null;
    }

    @OriginalMember(owner = "client!ef", name = "f", descriptor = "()V")
    public final void method1489() {
        this.field3384.field1535 = -1;
    }

    @OriginalMember(owner = "client!ef", name = "g", descriptor = "()I")
    public final int method1490() {
        return this.field3386.length;
    }

    @OriginalMember(owner = "client!ef", name = "<init>", descriptor = "()V")
    public class220() {
    }

    @OriginalMember(owner = "client!ef", name = "<init>", descriptor = "([B)V")
    public class220(byte[] arg0) {
        this.method1476(arg0);
    }
}
