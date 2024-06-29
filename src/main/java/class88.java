import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ue")
public class class88 {

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "Lee;")
    private class280 field1569 = new class280((byte[]) null);

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "[B")
    private static byte[] field1568 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!ue", name = "c", descriptor = "I")
    public int field1570;

    @OriginalMember(owner = "client!ue", name = "f", descriptor = "I")
    private int field1573;

    @OriginalMember(owner = "client!ue", name = "g", descriptor = "J")
    private long field1574;

    @OriginalMember(owner = "client!ue", name = "d", descriptor = "[I")
    private int[] field1571;

    @OriginalMember(owner = "client!ue", name = "e", descriptor = "[I")
    private int[] field1572;

    @OriginalMember(owner = "client!ue", name = "h", descriptor = "[I")
    private int[] field1575;

    @OriginalMember(owner = "client!ue", name = "i", descriptor = "[I")
    public int[] field1576;

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(I)V")
    public final void method597(int arg0) {
        int var2 = this.field1569.method1883((byte) -94);
        this.field1576[arg0] += var2;
    }

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "(I)I")
    private final int method598(int arg0) {
        byte var2 = this.field1569.field5011[this.field1569.field5027];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field1575[arg0] = var3;
            this.field1569.field5027++;
        } else {
            var3 = this.field1575[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method601(arg0, var3);
        }
        int var4 = this.field1569.method1883((byte) -94);
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field1569.field5011[this.field1569.field5027] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field1569.field5027++;
                this.field1575[arg0] = var5;
                return this.method601(arg0, var5);
            }
        }
        this.field1569.field5027 += var4;
        return 0;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "()I")
    public final int method599() {
        return this.field1571.length;
    }

    @OriginalMember(owner = "client!ue", name = "c", descriptor = "(I)V")
    public final void method600(int arg0) {
        this.field1571[arg0] = this.field1569.field5027;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(II)I")
    private final int method601(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field1568[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field1569.method1907(16832) << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field1569.method1907(16832) << 16;
            }
            return var8;
        }
        int var3 = this.field1569.method1907(16832);
        int var4 = this.field1569.method1883((byte) -94);
        if (var3 == 47) {
            this.field1569.field5027 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field1569.method1893((byte) -113);
            var4 -= 3;
            int var6 = this.field1576[arg0];
            this.field1574 += (long) (this.field1573 - var5) * (long) var6;
            this.field1573 = var5;
            this.field1569.field5027 += var4;
            return 2;
        } else {
            this.field1569.field5027 += var4;
            return 3;
        }
    }

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "()Z")
    public final boolean method602() {
        int var1 = this.field1571.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field1571[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!ue", name = "d", descriptor = "(I)J")
    public final long method603(int arg0) {
        return (long) this.field1573 * (long) arg0 + this.field1574;
    }

    @OriginalMember(owner = "client!ue", name = "c", descriptor = "()V")
    public final void method604() {
        this.field1569.field5011 = null;
        this.field1572 = null;
        this.field1571 = null;
        this.field1576 = null;
        this.field1575 = null;
    }

    @OriginalMember(owner = "client!ue", name = "d", descriptor = "()V")
    public final void method605() {
        this.field1569.field5027 = -1;
    }

    @OriginalMember(owner = "client!ue", name = "e", descriptor = "()V")
    public static void method606() {
        field1568 = null;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "([B)V")
    public final void method607(byte[] arg0) {
        this.field1569.field5011 = arg0;
        this.field1569.field5027 = 10;
        int var2 = this.field1569.method1891(-122);
        this.field1570 = this.field1569.method1891(-127);
        this.field1573 = 500000;
        this.field1572 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var5 = this.field1569.method1872(102);
            int var6 = this.field1569.method1872(121);
            if (var5 == 1297379947) {
                this.field1572[var3] = this.field1569.field5027;
                var3++;
            }
            this.field1569.field5027 += var6;
        }
        this.field1574 = 0L;
        this.field1571 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            this.field1571[var4] = this.field1572[var4];
        }
        this.field1576 = new int[var2];
        this.field1575 = new int[var2];
    }

    @OriginalMember(owner = "client!ue", name = "e", descriptor = "(I)I")
    public final int method608(int arg0) {
        return this.method598(arg0);
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(J)V")
    public final void method609(long arg0) {
        this.field1574 = arg0;
        int var3 = this.field1571.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field1576[var4] = 0;
            this.field1575[var4] = 0;
            this.field1569.field5027 = this.field1572[var4];
            this.method597(var4);
            this.field1571[var4] = this.field1569.field5027;
        }
    }

    @OriginalMember(owner = "client!ue", name = "f", descriptor = "()Z")
    public final boolean method610() {
        return this.field1569.field5011 != null;
    }

    @OriginalMember(owner = "client!ue", name = "f", descriptor = "(I)V")
    public final void method611(int arg0) {
        this.field1569.field5027 = this.field1571[arg0];
    }

    @OriginalMember(owner = "client!ue", name = "g", descriptor = "()I")
    public final int method612() {
        int var1 = this.field1571.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field1571[var4] >= 0 && this.field1576[var4] < var3) {
                var2 = var4;
                var3 = this.field1576[var4];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!ue", name = "<init>", descriptor = "()V")
    public class88() {
    }

    @OriginalMember(owner = "client!ue", name = "<init>", descriptor = "([B)V")
    public class88(byte[] arg0) {
        this.method607(arg0);
    }
}
