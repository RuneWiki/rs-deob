import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tc")
public class class37 {

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "Lim;")
    private class170 field445 = new class170((byte[]) null);

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "[B")
    private static byte[] field444 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!tc", name = "d", descriptor = "I")
    public int field447;

    @OriginalMember(owner = "client!tc", name = "g", descriptor = "I")
    private int field450;

    @OriginalMember(owner = "client!tc", name = "h", descriptor = "J")
    private long field451;

    @OriginalMember(owner = "client!tc", name = "c", descriptor = "[I")
    private int[] field446;

    @OriginalMember(owner = "client!tc", name = "e", descriptor = "[I")
    private int[] field448;

    @OriginalMember(owner = "client!tc", name = "f", descriptor = "[I")
    public int[] field449;

    @OriginalMember(owner = "client!tc", name = "i", descriptor = "[I")
    private int[] field452;

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(I)V")
    public final void method198(int arg0) {
        this.field446[arg0] = this.field445.field2676;
    }

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "(I)V")
    public final void method199(int arg0) {
        int var2 = this.field445.method1220(-26360);
        this.field449[arg0] += var2;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "()V")
    public final void method200() {
        this.field445.field2650 = null;
        this.field448 = null;
        this.field446 = null;
        this.field449 = null;
        this.field452 = null;
    }

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "()I")
    public final int method201() {
        int var1 = this.field446.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field446[var4] >= 0 && this.field449[var4] < var3) {
                var2 = var4;
                var3 = this.field449[var4];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!tc", name = "c", descriptor = "()I")
    public final int method202() {
        return this.field446.length;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(J)V")
    public final void method203(long arg0) {
        this.field451 = arg0;
        int var3 = this.field446.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field449[var4] = 0;
            this.field452[var4] = 0;
            this.field445.field2676 = this.field448[var4];
            this.method199(var4);
            this.field446[var4] = this.field445.field2676;
        }
    }

    @OriginalMember(owner = "client!tc", name = "c", descriptor = "(I)J")
    public final long method204(int arg0) {
        return (long) this.field450 * (long) arg0 + this.field451;
    }

    @OriginalMember(owner = "client!tc", name = "d", descriptor = "()V")
    public final void method205() {
        this.field445.field2676 = -1;
    }

    @OriginalMember(owner = "client!tc", name = "e", descriptor = "()Z")
    public final boolean method206() {
        return this.field445.field2650 != null;
    }

    @OriginalMember(owner = "client!tc", name = "f", descriptor = "()Z")
    public final boolean method207() {
        int var1 = this.field446.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field446[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!tc", name = "d", descriptor = "(I)I")
    public final int method208(int arg0) {
        return this.method212(arg0);
    }

    @OriginalMember(owner = "client!tc", name = "g", descriptor = "()V")
    public static void method209() {
        field444 = null;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(II)I")
    private final int method210(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field444[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field445.method1218(-100) << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field445.method1218(91) << 16;
            }
            return var8;
        }
        int var3 = this.field445.method1218(-27);
        int var4 = this.field445.method1220(-26360);
        if (var3 == 47) {
            this.field445.field2676 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field445.method1212(460736848);
            var4 -= 3;
            int var6 = this.field449[arg0];
            this.field451 += (long) (this.field450 - var5) * (long) var6;
            this.field450 = var5;
            this.field445.field2676 += var4;
            return 2;
        } else {
            this.field445.field2676 += var4;
            return 3;
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "([B)V")
    public final void method211(byte[] arg0) {
        this.field445.field2650 = arg0;
        this.field445.field2676 = 10;
        int var2 = this.field445.method1186((byte) -56);
        this.field447 = this.field445.method1186((byte) -42);
        this.field450 = 500000;
        this.field448 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var5 = this.field445.method1190(6345);
            int var6 = this.field445.method1190(6345);
            if (var5 == 1297379947) {
                this.field448[var3] = this.field445.field2676;
                var3++;
            }
            this.field445.field2676 += var6;
        }
        this.field451 = 0L;
        this.field446 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            this.field446[var4] = this.field448[var4];
        }
        this.field449 = new int[var2];
        this.field452 = new int[var2];
    }

    @OriginalMember(owner = "client!tc", name = "e", descriptor = "(I)I")
    private final int method212(int arg0) {
        byte var2 = this.field445.field2650[this.field445.field2676];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field452[arg0] = var3;
            this.field445.field2676++;
        } else {
            var3 = this.field452[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method210(arg0, var3);
        }
        int var4 = this.field445.method1220(-26360);
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field445.field2650[this.field445.field2676] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field445.field2676++;
                this.field452[arg0] = var5;
                return this.method210(arg0, var5);
            }
        }
        this.field445.field2676 += var4;
        return 0;
    }

    @OriginalMember(owner = "client!tc", name = "f", descriptor = "(I)V")
    public final void method213(int arg0) {
        this.field445.field2676 = this.field446[arg0];
    }

    @OriginalMember(owner = "client!tc", name = "<init>", descriptor = "()V")
    public class37() {
    }

    @OriginalMember(owner = "client!tc", name = "<init>", descriptor = "([B)V")
    public class37(byte[] arg0) {
        this.method211(arg0);
    }
}
