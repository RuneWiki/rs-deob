import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!b")
public class class11 {

    @OriginalMember(owner = "client!b", name = "b", descriptor = "Lm;")
    private class77 field212 = new class77(null);

    @OriginalMember(owner = "client!b", name = "a", descriptor = "[B")
    private static byte[] field211 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!b", name = "e", descriptor = "I")
    private int field215;

    @OriginalMember(owner = "client!b", name = "h", descriptor = "I")
    public int field218;

    @OriginalMember(owner = "client!b", name = "c", descriptor = "J")
    private long field213;

    @OriginalMember(owner = "client!b", name = "d", descriptor = "[I")
    private int[] field214;

    @OriginalMember(owner = "client!b", name = "f", descriptor = "[I")
    private int[] field216;

    @OriginalMember(owner = "client!b", name = "g", descriptor = "[I")
    private int[] field217;

    @OriginalMember(owner = "client!b", name = "i", descriptor = "[I")
    public int[] field219;

    @OriginalMember(owner = "client!b", name = "a", descriptor = "()I", line = 3)
    public final int method108() {
        return this.field214.length;
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(I)I", line = 8)
    private final int method109(int arg0) {
        byte var2 = this.field212.field1858[this.field212.field1821];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field217[arg0] = var3;
            this.field212.field1821++;
        } else {
            var3 = this.field217[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method120(arg0, var3);
        }
        int var4 = this.field212.method634(-110);
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field212.field1858[this.field212.field1821] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field212.field1821++;
                this.field217[arg0] = var5;
                return this.method120(arg0, var5);
            }
        }
        this.field212.field1821 += var4;
        return 0;
    }

    @OriginalMember(owner = "client!b", name = "b", descriptor = "(I)I", line = 47)
    public final int method110(int arg0) {
        return this.method109(arg0);
    }

    @OriginalMember(owner = "client!b", name = "b", descriptor = "()V", line = 56)
    public final void method111() {
        this.field212.field1858 = null;
        this.field216 = null;
        this.field214 = null;
        this.field219 = null;
        this.field217 = null;
    }

    @OriginalMember(owner = "client!b", name = "c", descriptor = "()Z", line = 65)
    public final boolean method112() {
        return this.field212.field1821 < 0;
    }

    @OriginalMember(owner = "client!b", name = "d", descriptor = "()I", line = 72)
    public final int method113() {
        int var1 = this.field214.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field214[var4] >= 0 && this.field219[var4] < var3) {
                var2 = var4;
                var3 = this.field219[var4];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!b", name = "e", descriptor = "()Z", line = 101)
    public final boolean method114() {
        int var1 = this.field214.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field214[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!b", name = "f", descriptor = "()V", line = 114)
    public static void method115() {
        field211 = null;
    }

    @OriginalMember(owner = "client!b", name = "c", descriptor = "(I)V", line = 117)
    public final void method116(int arg0) {
        this.field214[arg0] = this.field212.field1821;
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "([B)V", line = 121)
    public final void method117(byte[] arg0) {
        this.field212.field1858 = arg0;
        this.field212.field1821 = 10;
        int var2 = this.field212.method636(118);
        this.field218 = this.field212.method636(113);
        this.field215 = 500000;
        this.field216 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var5 = this.field212.method647((byte) -72);
            int var6 = this.field212.method647((byte) -72);
            if (var5 == 1297379947) {
                this.field216[var3] = this.field212.field1821;
                var3++;
            }
            this.field212.field1821 += var6;
        }
        this.field214 = new int[this.field216.length];
        for (int var4 = 0; var4 < this.field214.length; var4++) {
            this.field214[var4] = this.field216[var4];
        }
        this.field219 = new int[var2];
        this.field217 = new int[var2];
    }

    @OriginalMember(owner = "client!b", name = "d", descriptor = "(I)V", line = 175)
    public final void method118(int arg0) {
        int var2 = this.field212.method634(-93);
        this.field219[arg0] += var2;
    }

    @OriginalMember(owner = "client!b", name = "e", descriptor = "(I)V", line = 180)
    public final void method119(int arg0) {
        this.field212.field1821 = this.field214[arg0];
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(II)I", line = 184)
    private final int method120(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field211[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field212.method620((byte) -8) << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field212.method620((byte) -8) << 16;
            }
            return var8;
        }
        int var3 = this.field212.method620((byte) -8);
        int var4 = this.field212.method634(-97);
        if (var3 == 47) {
            this.field212.field1821 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field212.method629((byte) -62);
            var4 -= 3;
            int var6 = this.field219[arg0];
            this.field213 += (long) (this.field215 - var5) * (long) var6;
            this.field215 = var5;
            this.field212.field1821 += var4;
            return 2;
        } else {
            this.field212.field1821 += var4;
            return 3;
        }
    }

    @OriginalMember(owner = "client!b", name = "g", descriptor = "()V", line = 226)
    public final void method121() {
        this.field212.field1821 = -1;
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(J)V", line = 230)
    public final void method122(long arg0) {
        this.field213 = arg0;
        int var3 = this.field214.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field219[var4] = 0;
            this.field217[var4] = 0;
            this.field212.field1821 = this.field216[var4];
            this.method118(var4);
            this.field214[var4] = this.field212.field1821;
        }
    }

    @OriginalMember(owner = "client!b", name = "f", descriptor = "(I)J", line = 253)
    public final long method123(int arg0) {
        return (long) this.field215 * (long) arg0 + this.field213;
    }

    @OriginalMember(owner = "client!b", name = "h", descriptor = "()Z", line = 260)
    public final boolean method124() {
        return this.field212.field1858 != null;
    }
}
