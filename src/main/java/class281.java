import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mu")
public class class281 {

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "Lek;")
    private class465 field3943 = new class465(null);

    @OriginalMember(owner = "client!mu", name = "b", descriptor = "[B")
    private static byte[] field3944 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!mu", name = "e", descriptor = "I")
    public int field3947;

    @OriginalMember(owner = "client!mu", name = "g", descriptor = "I")
    private int field3949;

    @OriginalMember(owner = "client!mu", name = "d", descriptor = "J")
    private long field3946;

    @OriginalMember(owner = "client!mu", name = "c", descriptor = "[I")
    public int[] field3945;

    @OriginalMember(owner = "client!mu", name = "f", descriptor = "[I")
    private int[] field3948;

    @OriginalMember(owner = "client!mu", name = "h", descriptor = "[I")
    private int[] field3950;

    @OriginalMember(owner = "client!mu", name = "i", descriptor = "[I")
    private int[] field3951;

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "()I")
    public final int method1733() {
        int var1 = this.field3951.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field3951[var4] >= 0 && this.field3945[var4] < var3) {
                var2 = var4;
                var3 = this.field3945[var4];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(II)I")
    private final int method1734(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field3944[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field3943.method2705(-53) << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field3943.method2705(-89) << 16;
            }
            return var8;
        }
        int var3 = this.field3943.method2705(-119);
        int var4 = this.field3943.method2713((byte) 96);
        if (var3 == 47) {
            this.field3943.field6710 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field3943.method2714(true);
            var4 -= 3;
            int var6 = this.field3945[arg0];
            this.field3946 += (long) (this.field3949 - var5) * (long) var6;
            this.field3949 = var5;
            this.field3943.field6710 += var4;
            return 2;
        } else {
            this.field3943.field6710 += var4;
            return 3;
        }
    }

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(I)I")
    public final int method1735(int arg0) {
        return this.method1743(arg0);
    }

    @OriginalMember(owner = "client!mu", name = "b", descriptor = "()V")
    public static void method1736() {
        field3944 = null;
    }

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(J)V")
    public final void method1737(long arg0) {
        this.field3946 = arg0;
        int var3 = this.field3951.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field3945[var4] = 0;
            this.field3950[var4] = 0;
            this.field3943.field6710 = this.field3948[var4];
            this.method1741(var4);
            this.field3951[var4] = this.field3943.field6710;
        }
    }

    @OriginalMember(owner = "client!mu", name = "c", descriptor = "()I")
    public final int method1738() {
        return this.field3951.length;
    }

    @OriginalMember(owner = "client!mu", name = "b", descriptor = "(I)J")
    public final long method1739(int arg0) {
        return (long) this.field3949 * (long) arg0 + this.field3946;
    }

    @OriginalMember(owner = "client!mu", name = "d", descriptor = "()Z")
    public final boolean method1740() {
        int var1 = this.field3951.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field3951[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!mu", name = "c", descriptor = "(I)V")
    public final void method1741(int arg0) {
        int var2 = this.field3943.method2713((byte) 96);
        this.field3945[arg0] += var2;
    }

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "([B)V")
    public final void method1742(byte[] arg0) {
        this.field3943.field6719 = arg0;
        this.field3943.field6710 = 10;
        int var2 = this.field3943.method2755((byte) -45);
        this.field3947 = this.field3943.method2755((byte) -75);
        this.field3949 = 500000;
        this.field3948 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var5 = this.field3943.method2691((byte) -67);
            int var6 = this.field3943.method2691((byte) -67);
            if (var5 == 1297379947) {
                this.field3948[var3] = this.field3943.field6710;
                var3++;
            }
            this.field3943.field6710 += var6;
        }
        this.field3946 = 0L;
        this.field3951 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            this.field3951[var4] = this.field3948[var4];
        }
        this.field3945 = new int[var2];
        this.field3950 = new int[var2];
    }

    @OriginalMember(owner = "client!mu", name = "d", descriptor = "(I)I")
    private final int method1743(int arg0) {
        byte var2 = this.field3943.field6719[this.field3943.field6710];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field3950[arg0] = var3;
            this.field3943.field6710++;
        } else {
            var3 = this.field3950[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method1734(arg0, var3);
        }
        int var4 = this.field3943.method2713((byte) 96);
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field3943.field6719[this.field3943.field6710] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field3943.field6710++;
                this.field3950[arg0] = var5;
                return this.method1734(arg0, var5);
            }
        }
        this.field3943.field6710 += var4;
        return 0;
    }

    @OriginalMember(owner = "client!mu", name = "e", descriptor = "(I)V")
    public final void method1744(int arg0) {
        this.field3943.field6710 = this.field3951[arg0];
    }

    @OriginalMember(owner = "client!mu", name = "e", descriptor = "()Z")
    public final boolean method1745() {
        return this.field3943.field6719 != null;
    }

    @OriginalMember(owner = "client!mu", name = "f", descriptor = "(I)V")
    public final void method1746(int arg0) {
        this.field3951[arg0] = this.field3943.field6710;
    }

    @OriginalMember(owner = "client!mu", name = "f", descriptor = "()V")
    public final void method1747() {
        this.field3943.field6710 = -1;
    }

    @OriginalMember(owner = "client!mu", name = "g", descriptor = "()V")
    public final void method1748() {
        this.field3943.field6719 = null;
        this.field3948 = null;
        this.field3951 = null;
        this.field3945 = null;
        this.field3950 = null;
    }

    @OriginalMember(owner = "client!mu", name = "<init>", descriptor = "()V")
    public class281() {
    }

    @OriginalMember(owner = "client!mu", name = "<init>", descriptor = "([B)V")
    public class281(byte[] arg0) {
        this.method1742(arg0);
    }
}
