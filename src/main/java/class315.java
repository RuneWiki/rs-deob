import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ts")
public class class315 {

    @OriginalMember(owner = "client!ts", name = "b", descriptor = "Lkh;")
    private class11 field4305 = new class11((byte[]) null);

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "[B")
    private static byte[] field4304 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!ts", name = "e", descriptor = "I")
    public int field4308;

    @OriginalMember(owner = "client!ts", name = "f", descriptor = "I")
    private int field4309;

    @OriginalMember(owner = "client!ts", name = "c", descriptor = "J")
    private long field4306;

    @OriginalMember(owner = "client!ts", name = "d", descriptor = "[I")
    private int[] field4307;

    @OriginalMember(owner = "client!ts", name = "g", descriptor = "[I")
    public int[] field4310;

    @OriginalMember(owner = "client!ts", name = "h", descriptor = "[I")
    private int[] field4311;

    @OriginalMember(owner = "client!ts", name = "i", descriptor = "[I")
    private int[] field4312;

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "()Z")
    public final boolean method2031() {
        int var1 = this.field4311.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field4311[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(I)V")
    public final void method2032(int arg0) {
        int var2 = this.field4305.method193(-1);
        this.field4310[arg0] += var2;
    }

    @OriginalMember(owner = "client!ts", name = "b", descriptor = "(I)I")
    public final int method2033(int arg0) {
        return this.method2035(arg0);
    }

    @OriginalMember(owner = "client!ts", name = "b", descriptor = "()V")
    public final void method2034() {
        this.field4305.field230 = null;
        this.field4307 = null;
        this.field4311 = null;
        this.field4310 = null;
        this.field4312 = null;
    }

    @OriginalMember(owner = "client!ts", name = "c", descriptor = "(I)I")
    private final int method2035(int arg0) {
        byte var2 = this.field4305.field230[this.field4305.field191];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field4312[arg0] = var3;
            this.field4305.field191++;
        } else {
            var3 = this.field4312[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method2037(arg0, var3);
        }
        int var4 = this.field4305.method193(-1);
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field4305.field230[this.field4305.field191] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field4305.field191++;
                this.field4312[arg0] = var5;
                return this.method2037(arg0, var5);
            }
        }
        this.field4305.field191 += var4;
        return 0;
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(J)V")
    public final void method2036(long arg0) {
        this.field4306 = arg0;
        int var3 = this.field4311.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field4310[var4] = 0;
            this.field4312[var4] = 0;
            this.field4305.field191 = this.field4307[var4];
            this.method2032(var4);
            this.field4311[var4] = this.field4305.field191;
        }
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(II)I")
    private final int method2037(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field4304[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field4305.method172((byte) 52) << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field4305.method172((byte) 52) << 16;
            }
            return var8;
        }
        int var3 = this.field4305.method172((byte) 52);
        int var4 = this.field4305.method193(-1);
        if (var3 == 47) {
            this.field4305.field191 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field4305.method208(27308);
            var4 -= 3;
            int var6 = this.field4310[arg0];
            this.field4306 += (long) (this.field4309 - var5) * (long) var6;
            this.field4309 = var5;
            this.field4305.field191 += var4;
            return 2;
        } else {
            this.field4305.field191 += var4;
            return 3;
        }
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "([B)V")
    public final void method2038(byte[] arg0) {
        this.field4305.field230 = arg0;
        this.field4305.field191 = 10;
        int var2 = this.field4305.method174(255);
        this.field4308 = this.field4305.method174(255);
        this.field4309 = 500000;
        this.field4307 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var5 = this.field4305.method185(25239);
            int var6 = this.field4305.method185(25239);
            if (var5 == 1297379947) {
                this.field4307[var3] = this.field4305.field191;
                var3++;
            }
            this.field4305.field191 += var6;
        }
        this.field4306 = 0L;
        this.field4311 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            this.field4311[var4] = this.field4307[var4];
        }
        this.field4310 = new int[var2];
        this.field4312 = new int[var2];
    }

    @OriginalMember(owner = "client!ts", name = "c", descriptor = "()V")
    public final void method2039() {
        this.field4305.field191 = -1;
    }

    @OriginalMember(owner = "client!ts", name = "d", descriptor = "(I)V")
    public final void method2040(int arg0) {
        this.field4305.field191 = this.field4311[arg0];
    }

    @OriginalMember(owner = "client!ts", name = "e", descriptor = "(I)V")
    public final void method2041(int arg0) {
        this.field4311[arg0] = this.field4305.field191;
    }

    @OriginalMember(owner = "client!ts", name = "d", descriptor = "()V")
    public static void method2042() {
        field4304 = null;
    }

    @OriginalMember(owner = "client!ts", name = "e", descriptor = "()I")
    public final int method2043() {
        int var1 = this.field4311.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field4311[var4] >= 0 && this.field4310[var4] < var3) {
                var2 = var4;
                var3 = this.field4310[var4];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!ts", name = "f", descriptor = "()I")
    public final int method2044() {
        return this.field4311.length;
    }

    @OriginalMember(owner = "client!ts", name = "f", descriptor = "(I)J")
    public final long method2045(int arg0) {
        return (long) this.field4309 * (long) arg0 + this.field4306;
    }

    @OriginalMember(owner = "client!ts", name = "g", descriptor = "()Z")
    public final boolean method2046() {
        return this.field4305.field230 != null;
    }

    @OriginalMember(owner = "client!ts", name = "<init>", descriptor = "()V")
    public class315() {
    }

    @OriginalMember(owner = "client!ts", name = "<init>", descriptor = "([B)V")
    public class315(byte[] arg0) {
        this.method2038(arg0);
    }
}
