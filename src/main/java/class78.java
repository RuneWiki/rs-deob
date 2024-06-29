import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mb")
public class class78 {

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "Lofa;")
    private class301 field1146 = new class301(null);

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "[B")
    private static byte[] field1147 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!mb", name = "c", descriptor = "I")
    public int field1148;

    @OriginalMember(owner = "client!mb", name = "e", descriptor = "I")
    private int field1150;

    @OriginalMember(owner = "client!mb", name = "g", descriptor = "J")
    private long field1152;

    @OriginalMember(owner = "client!mb", name = "d", descriptor = "[I")
    private int[] field1149;

    @OriginalMember(owner = "client!mb", name = "f", descriptor = "[I")
    public int[] field1151;

    @OriginalMember(owner = "client!mb", name = "h", descriptor = "[I")
    private int[] field1153;

    @OriginalMember(owner = "client!mb", name = "i", descriptor = "[I")
    private int[] field1154;

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "()Z")
    public final boolean method703() {
        return this.field1146.field4543 != null;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "([B)V")
    public final void method704(byte[] arg0) {
        this.field1146.field4543 = arg0;
        this.field1146.field4534 = 10;
        int var2 = this.field1146.method1989((byte) -121);
        this.field1148 = this.field1146.method1989((byte) -74);
        this.field1150 = 500000;
        this.field1154 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var5 = this.field1146.method1934(-2);
            int var6 = this.field1146.method1934(-2);
            if (var5 == 1297379947) {
                this.field1154[var3] = this.field1146.field4534;
                var3++;
            }
            this.field1146.field4534 += var6;
        }
        this.field1152 = 0L;
        this.field1153 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            this.field1153[var4] = this.field1154[var4];
        }
        this.field1151 = new int[var2];
        this.field1149 = new int[var2];
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(II)I")
    private final int method705(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field1147[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field1146.method1987(-58) << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field1146.method1987(-104) << 16;
            }
            return var8;
        }
        int var3 = this.field1146.method1987(-9);
        int var4 = this.field1146.method1960((byte) -125);
        if (var3 == 47) {
            this.field1146.field4534 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field1146.method1952(22085);
            var4 -= 3;
            int var6 = this.field1151[arg0];
            this.field1152 += (long) (this.field1150 - var5) * (long) var6;
            this.field1150 = var5;
            this.field1146.field4534 += var4;
            return 2;
        } else {
            this.field1146.field4534 += var4;
            return 3;
        }
    }

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "()I")
    public final int method706() {
        int var1 = this.field1153.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field1153[var4] >= 0 && this.field1151[var4] < var3) {
                var2 = var4;
                var3 = this.field1151[var4];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(I)J")
    public final long method707(int arg0) {
        return (long) this.field1150 * (long) arg0 + this.field1152;
    }

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "(I)V")
    public final void method708(int arg0) {
        this.field1153[arg0] = this.field1146.field4534;
    }

    @OriginalMember(owner = "client!mb", name = "c", descriptor = "()V")
    public static void method709() {
        field1147 = null;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(J)V")
    public final void method710(long arg0) {
        this.field1152 = arg0;
        int var3 = this.field1153.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field1151[var4] = 0;
            this.field1149[var4] = 0;
            this.field1146.field4534 = this.field1154[var4];
            this.method716(var4);
            this.field1153[var4] = this.field1146.field4534;
        }
    }

    @OriginalMember(owner = "client!mb", name = "c", descriptor = "(I)V")
    public final void method711(int arg0) {
        this.field1146.field4534 = this.field1153[arg0];
    }

    @OriginalMember(owner = "client!mb", name = "d", descriptor = "(I)I")
    private final int method712(int arg0) {
        byte var2 = this.field1146.field4543[this.field1146.field4534];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field1149[arg0] = var3;
            this.field1146.field4534++;
        } else {
            var3 = this.field1149[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method705(arg0, var3);
        }
        int var4 = this.field1146.method1960((byte) 48);
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field1146.field4543[this.field1146.field4534] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field1146.field4534++;
                this.field1149[arg0] = var5;
                return this.method705(arg0, var5);
            }
        }
        this.field1146.field4534 += var4;
        return 0;
    }

    @OriginalMember(owner = "client!mb", name = "d", descriptor = "()V")
    public final void method713() {
        this.field1146.field4543 = null;
        this.field1154 = null;
        this.field1153 = null;
        this.field1151 = null;
        this.field1149 = null;
    }

    @OriginalMember(owner = "client!mb", name = "e", descriptor = "()V")
    public final void method714() {
        this.field1146.field4534 = -1;
    }

    @OriginalMember(owner = "client!mb", name = "f", descriptor = "()I")
    public final int method715() {
        return this.field1153.length;
    }

    @OriginalMember(owner = "client!mb", name = "e", descriptor = "(I)V")
    public final void method716(int arg0) {
        int var2 = this.field1146.method1960((byte) 5);
        this.field1151[arg0] += var2;
    }

    @OriginalMember(owner = "client!mb", name = "g", descriptor = "()Z")
    public final boolean method717() {
        int var1 = this.field1153.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field1153[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!mb", name = "f", descriptor = "(I)I")
    public final int method718(int arg0) {
        return this.method712(arg0);
    }

    @OriginalMember(owner = "client!mb", name = "<init>", descriptor = "()V")
    public class78() {
    }

    @OriginalMember(owner = "client!mb", name = "<init>", descriptor = "([B)V")
    public class78(byte[] arg0) {
        this.method704(arg0);
    }
}
