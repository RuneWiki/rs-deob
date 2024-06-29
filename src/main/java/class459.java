import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bl")
public class class459 {

    @OriginalMember(owner = "client!bl", name = "b", descriptor = "Llh;")
    private class365 field6690 = new class365(null);

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "[B")
    private static byte[] field6689 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!bl", name = "d", descriptor = "I")
    private int field6692;

    @OriginalMember(owner = "client!bl", name = "h", descriptor = "I")
    public int field6696;

    @OriginalMember(owner = "client!bl", name = "c", descriptor = "J")
    private long field6691;

    @OriginalMember(owner = "client!bl", name = "e", descriptor = "[I")
    public int[] field6693;

    @OriginalMember(owner = "client!bl", name = "f", descriptor = "[I")
    private int[] field6694;

    @OriginalMember(owner = "client!bl", name = "g", descriptor = "[I")
    private int[] field6695;

    @OriginalMember(owner = "client!bl", name = "i", descriptor = "[I")
    private int[] field6697;

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(I)V")
    public final void method2696(int arg0) {
        this.field6690.field5069 = this.field6695[arg0];
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "()V")
    public static void method2697() {
        field6689 = null;
    }

    @OriginalMember(owner = "client!bl", name = "b", descriptor = "()V")
    public final void method2698() {
        this.field6690.field5069 = -1;
    }

    @OriginalMember(owner = "client!bl", name = "b", descriptor = "(I)V")
    public final void method2699(int arg0) {
        int var2 = this.field6690.method2077(-1);
        this.field6693[arg0] += var2;
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(J)V")
    public final void method2700(long arg0) {
        this.field6691 = arg0;
        int var3 = this.field6695.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field6693[var4] = 0;
            this.field6697[var4] = 0;
            this.field6690.field5069 = this.field6694[var4];
            this.method2699(var4);
            this.field6695[var4] = this.field6690.field5069;
        }
    }

    @OriginalMember(owner = "client!bl", name = "c", descriptor = "()Z")
    public final boolean method2701() {
        int var1 = this.field6695.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field6695[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!bl", name = "d", descriptor = "()Z")
    public final boolean method2702() {
        return this.field6690.field5073 != null;
    }

    @OriginalMember(owner = "client!bl", name = "e", descriptor = "()V")
    public final void method2703() {
        this.field6690.field5073 = null;
        this.field6694 = null;
        this.field6695 = null;
        this.field6693 = null;
        this.field6697 = null;
    }

    @OriginalMember(owner = "client!bl", name = "c", descriptor = "(I)I")
    public final int method2704(int arg0) {
        return this.method2706(arg0);
    }

    @OriginalMember(owner = "client!bl", name = "f", descriptor = "()I")
    public final int method2705() {
        int var1 = this.field6695.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field6695[var4] >= 0 && this.field6693[var4] < var3) {
                var2 = var4;
                var3 = this.field6693[var4];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!bl", name = "d", descriptor = "(I)I")
    private final int method2706(int arg0) {
        byte var2 = this.field6690.field5073[this.field6690.field5069];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field6697[arg0] = var3;
            this.field6690.field5069++;
        } else {
            var3 = this.field6697[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method2708(arg0, var3);
        }
        int var4 = this.field6690.method2077(-1);
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field6690.field5073[this.field6690.field5069] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field6690.field5069++;
                this.field6697[arg0] = var5;
                return this.method2708(arg0, var5);
            }
        }
        this.field6690.field5069 += var4;
        return 0;
    }

    @OriginalMember(owner = "client!bl", name = "e", descriptor = "(I)J")
    public final long method2707(int arg0) {
        return (long) this.field6692 * (long) arg0 + this.field6691;
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(II)I")
    private final int method2708(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field6689[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field6690.method2099(255) << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field6690.method2099(255) << 16;
            }
            return var8;
        }
        int var3 = this.field6690.method2099(255);
        int var4 = this.field6690.method2077(-1);
        if (var3 == 47) {
            this.field6690.field5069 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field6690.method2111(-2);
            var4 -= 3;
            int var6 = this.field6693[arg0];
            this.field6691 += (long) (this.field6692 - var5) * (long) var6;
            this.field6692 = var5;
            this.field6690.field5069 += var4;
            return 2;
        } else {
            this.field6690.field5069 += var4;
            return 3;
        }
    }

    @OriginalMember(owner = "client!bl", name = "g", descriptor = "()I")
    public final int method2709() {
        return this.field6695.length;
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "([B)V")
    public final void method2710(byte[] arg0) {
        this.field6690.field5073 = arg0;
        this.field6690.field5069 = 10;
        int var2 = this.field6690.method2062((byte) 14);
        this.field6696 = this.field6690.method2062((byte) 14);
        this.field6692 = 500000;
        this.field6694 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var5 = this.field6690.method2056((byte) 77);
            int var6 = this.field6690.method2056((byte) 76);
            if (var5 == 1297379947) {
                this.field6694[var3] = this.field6690.field5069;
                var3++;
            }
            this.field6690.field5069 += var6;
        }
        this.field6691 = 0L;
        this.field6695 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            this.field6695[var4] = this.field6694[var4];
        }
        this.field6693 = new int[var2];
        this.field6697 = new int[var2];
    }

    @OriginalMember(owner = "client!bl", name = "f", descriptor = "(I)V")
    public final void method2711(int arg0) {
        this.field6695[arg0] = this.field6690.field5069;
    }

    @OriginalMember(owner = "client!bl", name = "<init>", descriptor = "()V")
    public class459() {
    }

    @OriginalMember(owner = "client!bl", name = "<init>", descriptor = "([B)V")
    public class459(byte[] arg0) {
        this.method2710(arg0);
    }
}
