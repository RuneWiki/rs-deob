import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dg")
public class class139 {

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "Llj;")
    private class25 field2421 = new class25((byte[]) null);

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "[B")
    private static byte[] field2420 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!dg", name = "h", descriptor = "I")
    private int field2427;

    @OriginalMember(owner = "client!dg", name = "i", descriptor = "I")
    public int field2428;

    @OriginalMember(owner = "client!dg", name = "g", descriptor = "J")
    private long field2426;

    @OriginalMember(owner = "client!dg", name = "c", descriptor = "[I")
    private int[] field2422;

    @OriginalMember(owner = "client!dg", name = "d", descriptor = "[I")
    public int[] field2423;

    @OriginalMember(owner = "client!dg", name = "e", descriptor = "[I")
    private int[] field2424;

    @OriginalMember(owner = "client!dg", name = "f", descriptor = "[I")
    private int[] field2425;

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "()Z")
    public final boolean method956() {
        int var1 = this.field2422.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field2422[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(I)I")
    public final int method957(int arg0) {
        return this.method970(arg0);
    }

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "(I)V")
    public final void method958(int arg0) {
        int var2 = this.field2421.method185(57);
        this.field2423[arg0] += var2;
    }

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "()Z")
    public final boolean method959() {
        return this.field2421.field475 != null;
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(J)V")
    public final void method960(long arg0) {
        this.field2426 = arg0;
        int var3 = this.field2422.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2423[var4] = 0;
            this.field2425[var4] = 0;
            this.field2421.field481 = this.field2424[var4];
            this.method958(var4);
            this.field2422[var4] = this.field2421.field481;
        }
    }

    @OriginalMember(owner = "client!dg", name = "c", descriptor = "()I")
    public final int method961() {
        return this.field2422.length;
    }

    @OriginalMember(owner = "client!dg", name = "c", descriptor = "(I)J")
    public final long method962(int arg0) {
        return (long) this.field2427 * (long) arg0 + this.field2426;
    }

    @OriginalMember(owner = "client!dg", name = "d", descriptor = "(I)V")
    public final void method963(int arg0) {
        this.field2422[arg0] = this.field2421.field481;
    }

    @OriginalMember(owner = "client!dg", name = "d", descriptor = "()V")
    public static void method964() {
        field2420 = null;
    }

    @OriginalMember(owner = "client!dg", name = "e", descriptor = "()V")
    public final void method965() {
        this.field2421.field481 = -1;
    }

    @OriginalMember(owner = "client!dg", name = "f", descriptor = "()V")
    public final void method966() {
        this.field2421.field475 = null;
        this.field2424 = null;
        this.field2422 = null;
        this.field2423 = null;
        this.field2425 = null;
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "([B)V")
    public final void method967(byte[] arg0) {
        this.field2421.field475 = arg0;
        this.field2421.field481 = 10;
        int var2 = this.field2421.method193((byte) 77);
        this.field2428 = this.field2421.method193((byte) 77);
        this.field2427 = 500000;
        this.field2424 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var5 = this.field2421.method199((byte) -85);
            int var6 = this.field2421.method199((byte) -85);
            if (var5 == 1297379947) {
                this.field2424[var3] = this.field2421.field481;
                var3++;
            }
            this.field2421.field481 += var6;
        }
        this.field2426 = 0L;
        this.field2422 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            this.field2422[var4] = this.field2424[var4];
        }
        this.field2423 = new int[var2];
        this.field2425 = new int[var2];
    }

    @OriginalMember(owner = "client!dg", name = "g", descriptor = "()I")
    public final int method968() {
        int var1 = this.field2422.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field2422[var4] >= 0 && this.field2423[var4] < var3) {
                var2 = var4;
                var3 = this.field2423[var4];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!dg", name = "e", descriptor = "(I)V")
    public final void method969(int arg0) {
        this.field2421.field481 = this.field2422[arg0];
    }

    @OriginalMember(owner = "client!dg", name = "f", descriptor = "(I)I")
    private final int method970(int arg0) {
        byte var2 = this.field2421.field475[this.field2421.field481];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field2425[arg0] = var3;
            this.field2421.field481++;
        } else {
            var3 = this.field2425[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method971(arg0, var3);
        }
        int var4 = this.field2421.method185(86);
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field2421.field475[this.field2421.field481] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field2421.field481++;
                this.field2425[arg0] = var5;
                return this.method971(arg0, var5);
            }
        }
        this.field2421.field481 += var4;
        return 0;
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(II)I")
    private final int method971(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field2420[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field2421.method189((byte) -103) << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field2421.method189((byte) -103) << 16;
            }
            return var8;
        }
        int var3 = this.field2421.method189((byte) -103);
        int var4 = this.field2421.method185(118);
        if (var3 == 47) {
            this.field2421.field481 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field2421.method230(15046);
            var4 -= 3;
            int var6 = this.field2423[arg0];
            this.field2426 += (long) (this.field2427 - var5) * (long) var6;
            this.field2427 = var5;
            this.field2421.field481 += var4;
            return 2;
        } else {
            this.field2421.field481 += var4;
            return 3;
        }
    }

    @OriginalMember(owner = "client!dg", name = "<init>", descriptor = "()V")
    public class139() {
    }

    @OriginalMember(owner = "client!dg", name = "<init>", descriptor = "([B)V")
    public class139(byte[] arg0) {
        this.method967(arg0);
    }
}
