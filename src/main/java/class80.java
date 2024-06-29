import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ik")
public class class80 {

    @OriginalMember(owner = "client!ik", name = "b", descriptor = "Lhc;")
    private class53 field1281 = new class53((byte[]) null);

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "[B")
    private static byte[] field1280 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!ik", name = "d", descriptor = "I")
    public int field1283;

    @OriginalMember(owner = "client!ik", name = "e", descriptor = "I")
    private int field1284;

    @OriginalMember(owner = "client!ik", name = "f", descriptor = "J")
    private long field1285;

    @OriginalMember(owner = "client!ik", name = "c", descriptor = "[I")
    private int[] field1282;

    @OriginalMember(owner = "client!ik", name = "g", descriptor = "[I")
    public int[] field1286;

    @OriginalMember(owner = "client!ik", name = "h", descriptor = "[I")
    private int[] field1287;

    @OriginalMember(owner = "client!ik", name = "i", descriptor = "[I")
    private int[] field1288;

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "()I")
    public final int method589() {
        return this.field1287.length;
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(I)V")
    public final void method590(int arg0) {
        int var2 = this.field1281.method367(1090211239);
        this.field1286[arg0] += var2;
    }

    @OriginalMember(owner = "client!ik", name = "b", descriptor = "(I)J")
    public final long method591(int arg0) {
        return (long) this.field1284 * (long) arg0 + this.field1285;
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(II)I")
    private final int method592(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field1280[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field1281.method366(-16505) << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field1281.method366(-16505) << 16;
            }
            return var8;
        }
        int var3 = this.field1281.method366(-16505);
        int var4 = this.field1281.method367(1090211239);
        if (var3 == 47) {
            this.field1281.field735 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field1281.method362(-4);
            var4 -= 3;
            int var6 = this.field1286[arg0];
            this.field1285 += (long) (this.field1284 - var5) * (long) var6;
            this.field1284 = var5;
            this.field1281.field735 += var4;
            return 2;
        } else {
            this.field1281.field735 += var4;
            return 3;
        }
    }

    @OriginalMember(owner = "client!ik", name = "c", descriptor = "(I)I")
    public final int method593(int arg0) {
        return this.method597(arg0);
    }

    @OriginalMember(owner = "client!ik", name = "b", descriptor = "()V")
    public final void method594() {
        this.field1281.field735 = -1;
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(J)V")
    public final void method595(long arg0) {
        this.field1285 = arg0;
        int var3 = this.field1287.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field1286[var4] = 0;
            this.field1282[var4] = 0;
            this.field1281.field735 = this.field1288[var4];
            this.method590(var4);
            this.field1287[var4] = this.field1281.field735;
        }
    }

    @OriginalMember(owner = "client!ik", name = "c", descriptor = "()I")
    public final int method596() {
        int var1 = this.field1287.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field1287[var4] >= 0 && this.field1286[var4] < var3) {
                var2 = var4;
                var3 = this.field1286[var4];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!ik", name = "d", descriptor = "(I)I")
    private final int method597(int arg0) {
        byte var2 = this.field1281.field758[this.field1281.field735];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field1282[arg0] = var3;
            this.field1281.field735++;
        } else {
            var3 = this.field1282[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method592(arg0, var3);
        }
        int var4 = this.field1281.method367(1090211239);
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field1281.field758[this.field1281.field735] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field1281.field735++;
                this.field1282[arg0] = var5;
                return this.method592(arg0, var5);
            }
        }
        this.field1281.field735 += var4;
        return 0;
    }

    @OriginalMember(owner = "client!ik", name = "e", descriptor = "(I)V")
    public final void method598(int arg0) {
        this.field1281.field735 = this.field1287[arg0];
    }

    @OriginalMember(owner = "client!ik", name = "d", descriptor = "()Z")
    public final boolean method599() {
        return this.field1281.field758 != null;
    }

    @OriginalMember(owner = "client!ik", name = "f", descriptor = "(I)V")
    public final void method600(int arg0) {
        this.field1287[arg0] = this.field1281.field735;
    }

    @OriginalMember(owner = "client!ik", name = "e", descriptor = "()Z")
    public final boolean method601() {
        int var1 = this.field1287.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field1287[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "([B)V")
    public final void method602(byte[] arg0) {
        this.field1281.field758 = arg0;
        this.field1281.field735 = 10;
        int var2 = this.field1281.method331(-82);
        this.field1283 = this.field1281.method331(-66);
        this.field1284 = 500000;
        this.field1288 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var5 = this.field1281.method340(-128);
            int var6 = this.field1281.method340(-112);
            if (var5 == 1297379947) {
                this.field1288[var3] = this.field1281.field735;
                var3++;
            }
            this.field1281.field735 += var6;
        }
        this.field1285 = 0L;
        this.field1287 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            this.field1287[var4] = this.field1288[var4];
        }
        this.field1286 = new int[var2];
        this.field1282 = new int[var2];
    }

    @OriginalMember(owner = "client!ik", name = "f", descriptor = "()V")
    public final void method603() {
        this.field1281.field758 = null;
        this.field1288 = null;
        this.field1287 = null;
        this.field1286 = null;
        this.field1282 = null;
    }

    @OriginalMember(owner = "client!ik", name = "<init>", descriptor = "()V")
    public class80() {
    }

    @OriginalMember(owner = "client!ik", name = "g", descriptor = "()V")
    public static void method604() {
        field1280 = null;
    }

    @OriginalMember(owner = "client!ik", name = "<init>", descriptor = "([B)V")
    public class80(byte[] arg0) {
        this.method602(arg0);
    }
}
