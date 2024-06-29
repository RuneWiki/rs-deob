import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kc")
public class class92 {

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "Lva;")
    private class189 field1953 = new class189(null);

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "[B")
    private static byte[] field1952 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!kc", name = "d", descriptor = "I")
    public int field1955;

    @OriginalMember(owner = "client!kc", name = "e", descriptor = "I")
    private int field1956;

    @OriginalMember(owner = "client!kc", name = "h", descriptor = "J")
    private long field1959;

    @OriginalMember(owner = "client!kc", name = "c", descriptor = "[I")
    private int[] field1954;

    @OriginalMember(owner = "client!kc", name = "f", descriptor = "[I")
    private int[] field1957;

    @OriginalMember(owner = "client!kc", name = "g", descriptor = "[I")
    public int[] field1958;

    @OriginalMember(owner = "client!kc", name = "i", descriptor = "[I")
    private int[] field1960;

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(II)I")
    private final int method592(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field1952[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field1953.method1202(-20) << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field1953.method1202(-77) << 16;
            }
            return var8;
        }
        int var3 = this.field1953.method1202(-47);
        int var4 = this.field1953.method1178(2002251056);
        if (var3 == 47) {
            this.field1953.field3752 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field1953.method1177(true);
            var4 -= 3;
            int var6 = this.field1958[arg0];
            this.field1959 += (long) (this.field1956 - var5) * (long) var6;
            this.field1956 = var5;
            this.field1953.field3752 += var4;
            return 2;
        } else {
            this.field1953.field3752 += var4;
            return 3;
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "()Z")
    public final boolean method593() {
        return this.field1953.field3753 != null;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(I)I")
    public final int method594(int arg0) {
        return this.method607(arg0);
    }

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "()V")
    public static void method595() {
        field1952 = null;
    }

    @OriginalMember(owner = "client!kc", name = "c", descriptor = "()V")
    public final void method596() {
        this.field1953.field3753 = null;
        this.field1954 = null;
        this.field1960 = null;
        this.field1958 = null;
        this.field1957 = null;
    }

    @OriginalMember(owner = "client!kc", name = "d", descriptor = "()Z")
    public final boolean method597() {
        int var1 = this.field1960.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field1960[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!kc", name = "e", descriptor = "()I")
    public final int method598() {
        return this.field1960.length;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(J)V")
    public final void method599(long arg0) {
        this.field1959 = arg0;
        int var3 = this.field1960.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field1958[var4] = 0;
            this.field1957[var4] = 0;
            this.field1953.field3752 = this.field1954[var4];
            this.method606(var4);
            this.field1960[var4] = this.field1953.field3752;
        }
    }

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "(I)J")
    public final long method600(int arg0) {
        return (long) this.field1956 * (long) arg0 + this.field1959;
    }

    @OriginalMember(owner = "client!kc", name = "f", descriptor = "()V")
    public final void method601() {
        this.field1953.field3752 = -1;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "([B)V")
    public final void method602(byte[] arg0) {
        this.field1953.field3753 = arg0;
        this.field1953.field3752 = 10;
        int var2 = this.field1953.method1197(-1);
        this.field1955 = this.field1953.method1197(-1);
        this.field1956 = 500000;
        this.field1954 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var5 = this.field1953.method1190(-4);
            int var6 = this.field1953.method1190(-4);
            if (var5 == 1297379947) {
                this.field1954[var3] = this.field1953.field3752;
                var3++;
            }
            this.field1953.field3752 += var6;
        }
        this.field1959 = 0L;
        this.field1960 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            this.field1960[var4] = this.field1954[var4];
        }
        this.field1958 = new int[var2];
        this.field1957 = new int[var2];
    }

    @OriginalMember(owner = "client!kc", name = "g", descriptor = "()I")
    public final int method603() {
        int var1 = this.field1960.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field1960[var4] >= 0 && this.field1958[var4] < var3) {
                var2 = var4;
                var3 = this.field1958[var4];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!kc", name = "c", descriptor = "(I)V")
    public final void method604(int arg0) {
        this.field1960[arg0] = this.field1953.field3752;
    }

    @OriginalMember(owner = "client!kc", name = "d", descriptor = "(I)V")
    public final void method605(int arg0) {
        this.field1953.field3752 = this.field1960[arg0];
    }

    @OriginalMember(owner = "client!kc", name = "e", descriptor = "(I)V")
    public final void method606(int arg0) {
        int var2 = this.field1953.method1178(2002251056);
        this.field1958[arg0] += var2;
    }

    @OriginalMember(owner = "client!kc", name = "f", descriptor = "(I)I")
    private final int method607(int arg0) {
        byte var2 = this.field1953.field3753[this.field1953.field3752];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field1957[arg0] = var3;
            this.field1953.field3752++;
        } else {
            var3 = this.field1957[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method592(arg0, var3);
        }
        int var4 = this.field1953.method1178(2002251056);
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field1953.field3753[this.field1953.field3752] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field1953.field3752++;
                this.field1957[arg0] = var5;
                return this.method592(arg0, var5);
            }
        }
        this.field1953.field3752 += var4;
        return 0;
    }

    @OriginalMember(owner = "client!kc", name = "<init>", descriptor = "()V")
    public class92() {
    }

    @OriginalMember(owner = "client!kc", name = "<init>", descriptor = "([B)V")
    public class92(byte[] arg0) {
        this.method602(arg0);
    }
}
