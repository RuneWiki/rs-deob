import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gb")
public class class45 {

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "Lwd;")
    private class157 field1145 = new class157(null);

    @OriginalMember(owner = "client!gb", name = "i", descriptor = "[B")
    private static byte[] field1153 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!gb", name = "e", descriptor = "I")
    private int field1149;

    @OriginalMember(owner = "client!gb", name = "h", descriptor = "I")
    public int field1152;

    @OriginalMember(owner = "client!gb", name = "d", descriptor = "J")
    private long field1148;

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "[I")
    private int[] field1146;

    @OriginalMember(owner = "client!gb", name = "c", descriptor = "[I")
    private int[] field1147;

    @OriginalMember(owner = "client!gb", name = "f", descriptor = "[I")
    public int[] field1150;

    @OriginalMember(owner = "client!gb", name = "g", descriptor = "[I")
    private int[] field1151;

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "()V")
    public final void method339() {
        this.field1145.field3457 = -1;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(J)V")
    public final void method340(long arg0) {
        this.field1148 = arg0;
        int var3 = this.field1147.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field1150[var4] = 0;
            this.field1151[var4] = 0;
            this.field1145.field3457 = this.field1146[var4];
            this.method350(var4);
            this.field1147[var4] = this.field1145.field3457;
        }
    }

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "()V")
    public final void method341() {
        this.field1145.field3473 = null;
        this.field1146 = null;
        this.field1147 = null;
        this.field1150 = null;
        this.field1151 = null;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(II)I")
    private final int method342(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field1153[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field1145.method1194(false) << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field1145.method1194(false) << 16;
            }
            return var8;
        }
        int var3 = this.field1145.method1194(false);
        int var4 = this.field1145.method1179(-117);
        if (var3 == 47) {
            this.field1145.field3457 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field1145.method1207((byte) 124);
            var4 -= 3;
            int var6 = this.field1150[arg0];
            this.field1148 += (long) (this.field1149 - var5) * (long) var6;
            this.field1149 = var5;
            this.field1145.field3457 += var4;
            return 2;
        } else {
            this.field1145.field3457 += var4;
            return 3;
        }
    }

    @OriginalMember(owner = "client!gb", name = "c", descriptor = "()V")
    public static void method343() {
        field1153 = null;
    }

    @OriginalMember(owner = "client!gb", name = "d", descriptor = "()I")
    public final int method344() {
        return this.field1147.length;
    }

    @OriginalMember(owner = "client!gb", name = "e", descriptor = "()Z")
    public final boolean method345() {
        return this.field1145.field3473 != null;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(I)I")
    private final int method346(int arg0) {
        byte var2 = this.field1145.field3473[this.field1145.field3457];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field1151[arg0] = var3;
            this.field1145.field3457++;
        } else {
            var3 = this.field1151[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method342(arg0, var3);
        }
        int var4 = this.field1145.method1179(-34);
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field1145.field3473[this.field1145.field3457] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field1145.field3457++;
                this.field1151[arg0] = var5;
                return this.method342(arg0, var5);
            }
        }
        this.field1145.field3457 += var4;
        return 0;
    }

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "(I)J")
    public final long method347(int arg0) {
        return (long) this.field1149 * (long) arg0 + this.field1148;
    }

    @OriginalMember(owner = "client!gb", name = "f", descriptor = "()I")
    public final int method348() {
        int var1 = this.field1147.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field1147[var4] >= 0 && this.field1150[var4] < var3) {
                var2 = var4;
                var3 = this.field1150[var4];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!gb", name = "c", descriptor = "(I)V")
    public final void method349(int arg0) {
        this.field1145.field3457 = this.field1147[arg0];
    }

    @OriginalMember(owner = "client!gb", name = "d", descriptor = "(I)V")
    public final void method350(int arg0) {
        int var2 = this.field1145.method1179(-91);
        this.field1150[arg0] += var2;
    }

    @OriginalMember(owner = "client!gb", name = "e", descriptor = "(I)V")
    public final void method351(int arg0) {
        this.field1147[arg0] = this.field1145.field3457;
    }

    @OriginalMember(owner = "client!gb", name = "g", descriptor = "()Z")
    public final boolean method352() {
        int var1 = this.field1147.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field1147[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "([B)V")
    public final void method353(byte[] arg0) {
        this.field1145.field3473 = arg0;
        this.field1145.field3457 = 10;
        int var2 = this.field1145.method1161((byte) 60);
        this.field1152 = this.field1145.method1161((byte) 60);
        this.field1149 = 500000;
        this.field1146 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var5 = this.field1145.method1175((byte) -119);
            int var6 = this.field1145.method1175((byte) -105);
            if (var5 == 1297379947) {
                this.field1146[var3] = this.field1145.field3457;
                var3++;
            }
            this.field1145.field3457 += var6;
        }
        this.field1148 = 0L;
        this.field1147 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            this.field1147[var4] = this.field1146[var4];
        }
        this.field1150 = new int[var2];
        this.field1151 = new int[var2];
    }

    @OriginalMember(owner = "client!gb", name = "f", descriptor = "(I)I")
    public final int method354(int arg0) {
        return this.method346(arg0);
    }

    @OriginalMember(owner = "client!gb", name = "<init>", descriptor = "()V")
    public class45() {
    }

    @OriginalMember(owner = "client!gb", name = "<init>", descriptor = "([B)V")
    public class45(byte[] arg0) {
        this.method353(arg0);
    }
}
