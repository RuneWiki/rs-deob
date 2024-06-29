import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uaa")
public class class373 {

    @OriginalMember(owner = "client!uaa", name = "a", descriptor = "Ldc;")
    private class63 field5250 = new class63(null);

    @OriginalMember(owner = "client!uaa", name = "b", descriptor = "[B")
    private static byte[] field5251 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!uaa", name = "d", descriptor = "I")
    private int field5253;

    @OriginalMember(owner = "client!uaa", name = "f", descriptor = "I")
    public int field5255;

    @OriginalMember(owner = "client!uaa", name = "h", descriptor = "J")
    private long field5257;

    @OriginalMember(owner = "client!uaa", name = "c", descriptor = "[I")
    private int[] field5252;

    @OriginalMember(owner = "client!uaa", name = "e", descriptor = "[I")
    public int[] field5254;

    @OriginalMember(owner = "client!uaa", name = "g", descriptor = "[I")
    private int[] field5256;

    @OriginalMember(owner = "client!uaa", name = "i", descriptor = "[I")
    private int[] field5258;

    @OriginalMember(owner = "client!uaa", name = "a", descriptor = "()V")
    public static void method2331() {
        field5251 = null;
    }

    @OriginalMember(owner = "client!uaa", name = "a", descriptor = "(II)I")
    private final int method2332(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field5251[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field5250.method505((byte) -119) << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field5250.method505((byte) -119) << 16;
            }
            return var8;
        }
        int var3 = this.field5250.method505((byte) -119);
        int var4 = this.field5250.method495(true);
        if (var3 == 47) {
            this.field5250.field956 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field5250.method476((byte) -26);
            var4 -= 3;
            int var6 = this.field5254[arg0];
            this.field5257 += (long) (this.field5253 - var5) * (long) var6;
            this.field5253 = var5;
            this.field5250.field956 += var4;
            return 2;
        } else {
            this.field5250.field956 += var4;
            return 3;
        }
    }

    @OriginalMember(owner = "client!uaa", name = "a", descriptor = "(I)V")
    public final void method2333(int arg0) {
        int var2 = this.field5250.method495(true);
        this.field5254[arg0] += var2;
    }

    @OriginalMember(owner = "client!uaa", name = "a", descriptor = "([B)V")
    public final void method2334(byte[] arg0) {
        this.field5250.field954 = arg0;
        this.field5250.field956 = 10;
        int var2 = this.field5250.method482(-772591672);
        this.field5255 = this.field5250.method482(-772591672);
        this.field5253 = 500000;
        this.field5258 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var5 = this.field5250.method457(-14532);
            int var6 = this.field5250.method457(-14532);
            if (var5 == 1297379947) {
                this.field5258[var3] = this.field5250.field956;
                var3++;
            }
            this.field5250.field956 += var6;
        }
        this.field5257 = 0L;
        this.field5256 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            this.field5256[var4] = this.field5258[var4];
        }
        this.field5254 = new int[var2];
        this.field5252 = new int[var2];
    }

    @OriginalMember(owner = "client!uaa", name = "b", descriptor = "(I)V")
    public final void method2335(int arg0) {
        this.field5250.field956 = this.field5256[arg0];
    }

    @OriginalMember(owner = "client!uaa", name = "c", descriptor = "(I)J")
    public final long method2336(int arg0) {
        return (long) this.field5253 * (long) arg0 + this.field5257;
    }

    @OriginalMember(owner = "client!uaa", name = "d", descriptor = "(I)I")
    private final int method2337(int arg0) {
        byte var2 = this.field5250.field954[this.field5250.field956];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field5252[arg0] = var3;
            this.field5250.field956++;
        } else {
            var3 = this.field5252[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method2332(arg0, var3);
        }
        int var4 = this.field5250.method495(true);
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field5250.field954[this.field5250.field956] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field5250.field956++;
                this.field5252[arg0] = var5;
                return this.method2332(arg0, var5);
            }
        }
        this.field5250.field956 += var4;
        return 0;
    }

    @OriginalMember(owner = "client!uaa", name = "b", descriptor = "()Z")
    public final boolean method2338() {
        int var1 = this.field5256.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field5256[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!uaa", name = "c", descriptor = "()Z")
    public final boolean method2339() {
        return this.field5250.field954 != null;
    }

    @OriginalMember(owner = "client!uaa", name = "d", descriptor = "()I")
    public final int method2340() {
        int var1 = this.field5256.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field5256[var4] >= 0 && this.field5254[var4] < var3) {
                var2 = var4;
                var3 = this.field5254[var4];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!uaa", name = "e", descriptor = "(I)V")
    public final void method2341(int arg0) {
        this.field5256[arg0] = this.field5250.field956;
    }

    @OriginalMember(owner = "client!uaa", name = "a", descriptor = "(J)V")
    public final void method2342(long arg0) {
        this.field5257 = arg0;
        int var3 = this.field5256.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field5254[var4] = 0;
            this.field5252[var4] = 0;
            this.field5250.field956 = this.field5258[var4];
            this.method2333(var4);
            this.field5256[var4] = this.field5250.field956;
        }
    }

    @OriginalMember(owner = "client!uaa", name = "e", descriptor = "()V")
    public final void method2343() {
        this.field5250.field954 = null;
        this.field5258 = null;
        this.field5256 = null;
        this.field5254 = null;
        this.field5252 = null;
    }

    @OriginalMember(owner = "client!uaa", name = "f", descriptor = "()V")
    public final void method2344() {
        this.field5250.field956 = -1;
    }

    @OriginalMember(owner = "client!uaa", name = "g", descriptor = "()I")
    public final int method2345() {
        return this.field5256.length;
    }

    @OriginalMember(owner = "client!uaa", name = "<init>", descriptor = "()V")
    public class373() {
    }

    @OriginalMember(owner = "client!uaa", name = "f", descriptor = "(I)I")
    public final int method2346(int arg0) {
        return this.method2337(arg0);
    }

    @OriginalMember(owner = "client!uaa", name = "<init>", descriptor = "([B)V")
    public class373(byte[] arg0) {
        this.method2334(arg0);
    }
}
