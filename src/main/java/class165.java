import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!l")
public class class165 {

    @OriginalMember(owner = "client!l", name = "b", descriptor = "Lha;")
    private class31 field2490 = new class31((byte[]) null);

    @OriginalMember(owner = "client!l", name = "a", descriptor = "[B")
    private static byte[] field2489 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!l", name = "d", descriptor = "I")
    private int field2492;

    @OriginalMember(owner = "client!l", name = "h", descriptor = "I")
    public int field2496;

    @OriginalMember(owner = "client!l", name = "f", descriptor = "J")
    private long field2494;

    @OriginalMember(owner = "client!l", name = "c", descriptor = "[I")
    private int[] field2491;

    @OriginalMember(owner = "client!l", name = "e", descriptor = "[I")
    private int[] field2493;

    @OriginalMember(owner = "client!l", name = "g", descriptor = "[I")
    private int[] field2495;

    @OriginalMember(owner = "client!l", name = "i", descriptor = "[I")
    public int[] field2497;

    @OriginalMember(owner = "client!l", name = "a", descriptor = "()I")
    public final int method1188() {
        return this.field2491.length;
    }

    @OriginalMember(owner = "client!l", name = "b", descriptor = "()I")
    public final int method1189() {
        int var1 = this.field2491.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field2491[var4] >= 0 && this.field2497[var4] < var3) {
                var2 = var4;
                var3 = this.field2497[var4];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(J)V")
    public final void method1190(long arg0) {
        this.field2494 = arg0;
        int var3 = this.field2491.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2497[var4] = 0;
            this.field2495[var4] = 0;
            this.field2490.field541 = this.field2493[var4];
            this.method1203(var4);
            this.field2491[var4] = this.field2490.field541;
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(I)J")
    public final long method1191(int arg0) {
        return (long) this.field2492 * (long) arg0 + this.field2494;
    }

    @OriginalMember(owner = "client!l", name = "b", descriptor = "(I)I")
    public final int method1192(int arg0) {
        return this.method1193(arg0);
    }

    @OriginalMember(owner = "client!l", name = "c", descriptor = "(I)I")
    private final int method1193(int arg0) {
        byte var2 = this.field2490.field560[this.field2490.field541];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field2495[arg0] = var3;
            this.field2490.field541++;
        } else {
            var3 = this.field2495[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method1196(arg0, var3);
        }
        int var4 = this.field2490.method310(77);
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field2490.field560[this.field2490.field541] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field2490.field541++;
                this.field2495[arg0] = var5;
                return this.method1196(arg0, var5);
            }
        }
        this.field2490.field541 += var4;
        return 0;
    }

    @OriginalMember(owner = "client!l", name = "c", descriptor = "()Z")
    public final boolean method1194() {
        int var1 = this.field2491.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field2491[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!l", name = "d", descriptor = "()Z")
    public final boolean method1195() {
        return this.field2490.field560 != null;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(II)I")
    private final int method1196(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field2489[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field2490.method265(-110) << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field2490.method265(-104) << 16;
            }
            return var8;
        }
        int var3 = this.field2490.method265(-111);
        int var4 = this.field2490.method310(70);
        if (var3 == 47) {
            this.field2490.field541 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field2490.method304((byte) 84);
            var4 -= 3;
            int var6 = this.field2497[arg0];
            this.field2494 += (long) (this.field2492 - var5) * (long) var6;
            this.field2492 = var5;
            this.field2490.field541 += var4;
            return 2;
        } else {
            this.field2490.field541 += var4;
            return 3;
        }
    }

    @OriginalMember(owner = "client!l", name = "d", descriptor = "(I)V")
    public final void method1197(int arg0) {
        this.field2490.field541 = this.field2491[arg0];
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "([B)V")
    public final void method1198(byte[] arg0) {
        this.field2490.field560 = arg0;
        this.field2490.field541 = 10;
        int var2 = this.field2490.method260((byte) -67);
        this.field2496 = this.field2490.method260((byte) -67);
        this.field2492 = 500000;
        this.field2493 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var5 = this.field2490.method300((byte) -30);
            int var6 = this.field2490.method300((byte) -30);
            if (var5 == 1297379947) {
                this.field2493[var3] = this.field2490.field541;
                var3++;
            }
            this.field2490.field541 += var6;
        }
        this.field2494 = 0L;
        this.field2491 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            this.field2491[var4] = this.field2493[var4];
        }
        this.field2497 = new int[var2];
        this.field2495 = new int[var2];
    }

    @OriginalMember(owner = "client!l", name = "e", descriptor = "()V")
    public final void method1199() {
        this.field2490.field560 = null;
        this.field2493 = null;
        this.field2491 = null;
        this.field2497 = null;
        this.field2495 = null;
    }

    @OriginalMember(owner = "client!l", name = "e", descriptor = "(I)V")
    public final void method1200(int arg0) {
        this.field2491[arg0] = this.field2490.field541;
    }

    @OriginalMember(owner = "client!l", name = "f", descriptor = "()V")
    public static void method1201() {
        field2489 = null;
    }

    @OriginalMember(owner = "client!l", name = "g", descriptor = "()V")
    public final void method1202() {
        this.field2490.field541 = -1;
    }

    @OriginalMember(owner = "client!l", name = "f", descriptor = "(I)V")
    public final void method1203(int arg0) {
        int var2 = this.field2490.method310(26);
        this.field2497[arg0] += var2;
    }

    @OriginalMember(owner = "client!l", name = "<init>", descriptor = "()V")
    public class165() {
    }

    @OriginalMember(owner = "client!l", name = "<init>", descriptor = "([B)V")
    public class165(byte[] arg0) {
        this.method1198(arg0);
    }
}
