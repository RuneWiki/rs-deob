import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bf")
public class class14 {

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "Lla;")
    private class77 field196 = new class77(null);

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "[B")
    private static byte[] field197 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!bf", name = "d", descriptor = "I")
    private int field199;

    @OriginalMember(owner = "client!bf", name = "g", descriptor = "I")
    public int field202;

    @OriginalMember(owner = "client!bf", name = "i", descriptor = "J")
    private long field204;

    @OriginalMember(owner = "client!bf", name = "c", descriptor = "[I")
    public int[] field198;

    @OriginalMember(owner = "client!bf", name = "e", descriptor = "[I")
    private int[] field200;

    @OriginalMember(owner = "client!bf", name = "f", descriptor = "[I")
    private int[] field201;

    @OriginalMember(owner = "client!bf", name = "h", descriptor = "[I")
    private int[] field203;

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "()V")
    public final void method112() {
        this.field196.field1691 = -1;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(I)I")
    private final int method113(int arg0) {
        byte var2 = this.field196.field1748[this.field196.field1691];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field203[arg0] = var3;
            this.field196.field1691++;
        } else {
            var3 = this.field203[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method126(arg0, var3);
        }
        int var4 = this.field196.method566((byte) -24);
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field196.field1748[this.field196.field1691] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field196.field1691++;
                this.field203[arg0] = var5;
                return this.method126(arg0, var5);
            }
        }
        this.field196.field1691 += var4;
        return 0;
    }

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "(I)I")
    public final int method114(int arg0) {
        return this.method113(arg0);
    }

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "()I")
    public final int method115() {
        int var1 = this.field201.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field201[var4] >= 0 && this.field198[var4] < var3) {
                var2 = var4;
                var3 = this.field198[var4];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!bf", name = "c", descriptor = "(I)V")
    public final void method116(int arg0) {
        int var2 = this.field196.method566((byte) -24);
        this.field198[arg0] += var2;
    }

    @OriginalMember(owner = "client!bf", name = "c", descriptor = "()Z")
    public final boolean method117() {
        int var1 = this.field201.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field201[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!bf", name = "d", descriptor = "()V")
    public final void method118() {
        this.field196.field1748 = null;
        this.field200 = null;
        this.field201 = null;
        this.field198 = null;
        this.field203 = null;
    }

    @OriginalMember(owner = "client!bf", name = "d", descriptor = "(I)V")
    public final void method119(int arg0) {
        this.field201[arg0] = this.field196.field1691;
    }

    @OriginalMember(owner = "client!bf", name = "e", descriptor = "()I")
    public final int method120() {
        return this.field201.length;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "([B)V")
    public final void method121(byte[] arg0) {
        this.field196.field1748 = arg0;
        this.field196.field1691 = 10;
        int var2 = this.field196.method597(90);
        this.field202 = this.field196.method597(121);
        this.field199 = 500000;
        this.field200 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var5 = this.field196.method554((byte) -115);
            int var6 = this.field196.method554((byte) 43);
            if (var5 == 1297379947) {
                this.field200[var3] = this.field196.field1691;
                var3++;
            }
            this.field196.field1691 += var6;
        }
        this.field204 = 0L;
        this.field201 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            this.field201[var4] = this.field200[var4];
        }
        this.field198 = new int[var2];
        this.field203 = new int[var2];
    }

    @OriginalMember(owner = "client!bf", name = "e", descriptor = "(I)J")
    public final long method122(int arg0) {
        return (long) this.field199 * (long) arg0 + this.field204;
    }

    @OriginalMember(owner = "client!bf", name = "f", descriptor = "(I)V")
    public final void method123(int arg0) {
        this.field196.field1691 = this.field201[arg0];
    }

    @OriginalMember(owner = "client!bf", name = "f", descriptor = "()Z")
    public final boolean method124() {
        return this.field196.field1748 != null;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(J)V")
    public final void method125(long arg0) {
        this.field204 = arg0;
        int var3 = this.field201.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field198[var4] = 0;
            this.field203[var4] = 0;
            this.field196.field1691 = this.field200[var4];
            this.method116(var4);
            this.field201[var4] = this.field196.field1691;
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(II)I")
    private final int method126(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field197[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field196.method570((byte) 123) << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field196.method570((byte) 123) << 16;
            }
            return var8;
        }
        int var3 = this.field196.method570((byte) 123);
        int var4 = this.field196.method566((byte) -24);
        if (var3 == 47) {
            this.field196.field1691 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field196.method557((byte) -114);
            var4 -= 3;
            int var6 = this.field198[arg0];
            this.field204 += (long) (this.field199 - var5) * (long) var6;
            this.field199 = var5;
            this.field196.field1691 += var4;
            return 2;
        } else {
            this.field196.field1691 += var4;
            return 3;
        }
    }

    @OriginalMember(owner = "client!bf", name = "g", descriptor = "()V")
    public static void method127() {
        field197 = null;
    }

    @OriginalMember(owner = "client!bf", name = "<init>", descriptor = "()V")
    public class14() {
    }

    @OriginalMember(owner = "client!bf", name = "<init>", descriptor = "([B)V")
    public class14(byte[] arg0) {
        this.method121(arg0);
    }
}
