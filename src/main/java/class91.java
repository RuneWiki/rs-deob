import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pj")
public class class91 {

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "Lwe;")
    private class75 field1703 = new class75((byte[]) null);

    @OriginalMember(owner = "client!pj", name = "d", descriptor = "[B")
    private static byte[] field1706 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!pj", name = "c", descriptor = "I")
    private int field1705;

    @OriginalMember(owner = "client!pj", name = "g", descriptor = "I")
    public int field1709;

    @OriginalMember(owner = "client!pj", name = "e", descriptor = "J")
    private long field1707;

    @OriginalMember(owner = "client!pj", name = "b", descriptor = "[I")
    private int[] field1704;

    @OriginalMember(owner = "client!pj", name = "f", descriptor = "[I")
    public int[] field1708;

    @OriginalMember(owner = "client!pj", name = "h", descriptor = "[I")
    private int[] field1710;

    @OriginalMember(owner = "client!pj", name = "i", descriptor = "[I")
    private int[] field1711;

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(I)V")
    public final void method701(int arg0) {
        int var2 = this.field1703.method585(60);
        this.field1708[arg0] += var2;
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "()Z")
    public final boolean method702() {
        int var1 = this.field1704.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field1704[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(II)I")
    private final int method703(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field1706[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field1703.method558(1) << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field1703.method558(1) << 16;
            }
            return var8;
        }
        int var3 = this.field1703.method558(1);
        int var4 = this.field1703.method585(124);
        if (var3 == 47) {
            this.field1703.field1380 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field1703.method559(-1);
            var4 -= 3;
            int var6 = this.field1708[arg0];
            this.field1707 += (long) (this.field1705 - var5) * (long) var6;
            this.field1705 = var5;
            this.field1703.field1380 += var4;
            return 2;
        } else {
            this.field1703.field1380 += var4;
            return 3;
        }
    }

    @OriginalMember(owner = "client!pj", name = "b", descriptor = "(I)V")
    public final void method704(int arg0) {
        this.field1703.field1380 = this.field1704[arg0];
    }

    @OriginalMember(owner = "client!pj", name = "b", descriptor = "()I")
    public final int method705() {
        int var1 = this.field1704.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field1704[var4] >= 0 && this.field1708[var4] < var3) {
                var2 = var4;
                var3 = this.field1708[var4];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!pj", name = "c", descriptor = "()V")
    public static void method706() {
        field1706 = null;
    }

    @OriginalMember(owner = "client!pj", name = "c", descriptor = "(I)I")
    private final int method707(int arg0) {
        byte var2 = this.field1703.field1368[this.field1703.field1380];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field1710[arg0] = var3;
            this.field1703.field1380++;
        } else {
            var3 = this.field1710[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method703(arg0, var3);
        }
        int var4 = this.field1703.method585(109);
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field1703.field1368[this.field1703.field1380] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field1703.field1380++;
                this.field1710[arg0] = var5;
                return this.method703(arg0, var5);
            }
        }
        this.field1703.field1380 += var4;
        return 0;
    }

    @OriginalMember(owner = "client!pj", name = "d", descriptor = "(I)I")
    public final int method708(int arg0) {
        return this.method707(arg0);
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "([B)V")
    public final void method709(byte[] arg0) {
        this.field1703.field1368 = arg0;
        this.field1703.field1380 = 10;
        int var2 = this.field1703.method545((byte) -85);
        this.field1709 = this.field1703.method545((byte) 127);
        this.field1705 = 500000;
        this.field1711 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var5 = this.field1703.method562((byte) -71);
            int var6 = this.field1703.method562((byte) -71);
            if (var5 == 1297379947) {
                this.field1711[var3] = this.field1703.field1380;
                var3++;
            }
            this.field1703.field1380 += var6;
        }
        this.field1707 = 0L;
        this.field1704 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            this.field1704[var4] = this.field1711[var4];
        }
        this.field1708 = new int[var2];
        this.field1710 = new int[var2];
    }

    @OriginalMember(owner = "client!pj", name = "d", descriptor = "()I")
    public final int method710() {
        return this.field1704.length;
    }

    @OriginalMember(owner = "client!pj", name = "e", descriptor = "()V")
    public final void method711() {
        this.field1703.field1368 = null;
        this.field1711 = null;
        this.field1704 = null;
        this.field1708 = null;
        this.field1710 = null;
    }

    @OriginalMember(owner = "client!pj", name = "f", descriptor = "()Z")
    public final boolean method712() {
        return this.field1703.field1368 != null;
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(J)V")
    public final void method713(long arg0) {
        this.field1707 = arg0;
        int var3 = this.field1704.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field1708[var4] = 0;
            this.field1710[var4] = 0;
            this.field1703.field1380 = this.field1711[var4];
            this.method701(var4);
            this.field1704[var4] = this.field1703.field1380;
        }
    }

    @OriginalMember(owner = "client!pj", name = "e", descriptor = "(I)J")
    public final long method714(int arg0) {
        return (long) this.field1705 * (long) arg0 + this.field1707;
    }

    @OriginalMember(owner = "client!pj", name = "g", descriptor = "()V")
    public final void method715() {
        this.field1703.field1380 = -1;
    }

    @OriginalMember(owner = "client!pj", name = "<init>", descriptor = "()V")
    public class91() {
    }

    @OriginalMember(owner = "client!pj", name = "<init>", descriptor = "([B)V")
    public class91(byte[] arg0) {
        this.method709(arg0);
    }

    @OriginalMember(owner = "client!pj", name = "f", descriptor = "(I)V")
    public final void method716(int arg0) {
        this.field1704[arg0] = this.field1703.field1380;
    }
}
