import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fp")
public class class344 {

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "Les;")
    private class403 field4306 = new class403(null);

    @OriginalMember(owner = "client!fp", name = "b", descriptor = "[B")
    private static byte[] field4307 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!fp", name = "c", descriptor = "I")
    private int field4308;

    @OriginalMember(owner = "client!fp", name = "e", descriptor = "I")
    public int field4310;

    @OriginalMember(owner = "client!fp", name = "i", descriptor = "J")
    private long field4314;

    @OriginalMember(owner = "client!fp", name = "d", descriptor = "[I")
    private int[] field4309;

    @OriginalMember(owner = "client!fp", name = "f", descriptor = "[I")
    private int[] field4311;

    @OriginalMember(owner = "client!fp", name = "g", descriptor = "[I")
    private int[] field4312;

    @OriginalMember(owner = "client!fp", name = "h", descriptor = "[I")
    public int[] field4313;

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(I)I")
    public final int method2037(int arg0) {
        return this.method2046(arg0);
    }

    @OriginalMember(owner = "client!fp", name = "b", descriptor = "(I)V")
    public final void method2038(int arg0) {
        this.field4306.field5262 = this.field4312[arg0];
    }

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "([B)V")
    public final void method2039(byte[] arg0) {
        this.field4306.field5275 = arg0;
        this.field4306.field5262 = 10;
        int var2 = this.field4306.method2390((byte) 69);
        this.field4310 = this.field4306.method2390((byte) 80);
        this.field4308 = 500000;
        this.field4309 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var5 = this.field4306.method2381((byte) 97);
            int var6 = this.field4306.method2381((byte) 107);
            if (var5 == 1297379947) {
                this.field4309[var3] = this.field4306.field5262;
                var3++;
            }
            this.field4306.field5262 += var6;
        }
        this.field4314 = 0L;
        this.field4312 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            this.field4312[var4] = this.field4309[var4];
        }
        this.field4313 = new int[var2];
        this.field4311 = new int[var2];
    }

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "()V")
    public final void method2040() {
        this.field4306.field5275 = null;
        this.field4309 = null;
        this.field4312 = null;
        this.field4313 = null;
        this.field4311 = null;
    }

    @OriginalMember(owner = "client!fp", name = "b", descriptor = "()I")
    public final int method2041() {
        return this.field4312.length;
    }

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(II)I")
    private final int method2042(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field4307[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field4306.method2396((byte) -80) << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field4306.method2396((byte) 117) << 16;
            }
            return var8;
        }
        int var3 = this.field4306.method2396((byte) 13);
        int var4 = this.field4306.method2367(9);
        if (var3 == 47) {
            this.field4306.field5262 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field4306.method2358(100);
            var4 -= 3;
            int var6 = this.field4313[arg0];
            this.field4314 += (long) (this.field4308 - var5) * (long) var6;
            this.field4308 = var5;
            this.field4306.field5262 += var4;
            return 2;
        } else {
            this.field4306.field5262 += var4;
            return 3;
        }
    }

    @OriginalMember(owner = "client!fp", name = "c", descriptor = "()I")
    public final int method2043() {
        int var1 = this.field4312.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field4312[var4] >= 0 && this.field4313[var4] < var3) {
                var2 = var4;
                var3 = this.field4313[var4];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!fp", name = "d", descriptor = "()V")
    public static void method2044() {
        field4307 = null;
    }

    @OriginalMember(owner = "client!fp", name = "c", descriptor = "(I)J")
    public final long method2045(int arg0) {
        return (long) this.field4308 * (long) arg0 + this.field4314;
    }

    @OriginalMember(owner = "client!fp", name = "d", descriptor = "(I)I")
    private final int method2046(int arg0) {
        byte var2 = this.field4306.field5275[this.field4306.field5262];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field4311[arg0] = var3;
            this.field4306.field5262++;
        } else {
            var3 = this.field4311[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method2042(arg0, var3);
        }
        int var4 = this.field4306.method2367(22);
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field4306.field5275[this.field4306.field5262] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field4306.field5262++;
                this.field4311[arg0] = var5;
                return this.method2042(arg0, var5);
            }
        }
        this.field4306.field5262 += var4;
        return 0;
    }

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(J)V")
    public final void method2047(long arg0) {
        this.field4314 = arg0;
        int var3 = this.field4312.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field4313[var4] = 0;
            this.field4311[var4] = 0;
            this.field4306.field5262 = this.field4309[var4];
            this.method2048(var4);
            this.field4312[var4] = this.field4306.field5262;
        }
    }

    @OriginalMember(owner = "client!fp", name = "e", descriptor = "(I)V")
    public final void method2048(int arg0) {
        int var2 = this.field4306.method2367(32);
        this.field4313[arg0] += var2;
    }

    @OriginalMember(owner = "client!fp", name = "e", descriptor = "()Z")
    public final boolean method2049() {
        return this.field4306.field5275 != null;
    }

    @OriginalMember(owner = "client!fp", name = "f", descriptor = "(I)V")
    public final void method2050(int arg0) {
        this.field4312[arg0] = this.field4306.field5262;
    }

    @OriginalMember(owner = "client!fp", name = "f", descriptor = "()V")
    public final void method2051() {
        this.field4306.field5262 = -1;
    }

    @OriginalMember(owner = "client!fp", name = "<init>", descriptor = "()V")
    public class344() {
    }

    @OriginalMember(owner = "client!fp", name = "g", descriptor = "()Z")
    public final boolean method2052() {
        int var1 = this.field4312.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field4312[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!fp", name = "<init>", descriptor = "([B)V")
    public class344(byte[] arg0) {
        this.method2039(arg0);
    }
}
