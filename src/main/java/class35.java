import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ef")
public class class35 {

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "Lhb;")
    private class51 field743 = new class51(null);

    @OriginalMember(owner = "client!ef", name = "h", descriptor = "[B")
    private static byte[] field750 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!ef", name = "f", descriptor = "I")
    public int field748;

    @OriginalMember(owner = "client!ef", name = "i", descriptor = "I")
    private int field751;

    @OriginalMember(owner = "client!ef", name = "c", descriptor = "J")
    private long field745;

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "[I")
    private int[] field744;

    @OriginalMember(owner = "client!ef", name = "d", descriptor = "[I")
    private int[] field746;

    @OriginalMember(owner = "client!ef", name = "e", descriptor = "[I")
    public int[] field747;

    @OriginalMember(owner = "client!ef", name = "g", descriptor = "[I")
    private int[] field749;

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "()V")
    public final void method247() {
        this.field743.field1128 = -1;
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(I)V")
    public final void method248(int arg0) {
        int var2 = this.field743.method371(92);
        this.field747[arg0] += var2;
    }

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "(I)J")
    public final long method249(int arg0) {
        return (long) this.field751 * (long) arg0 + this.field745;
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(II)I")
    private final int method250(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field750[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field743.method373(25094) << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field743.method373(25094) << 16;
            }
            return var8;
        }
        int var3 = this.field743.method373(25094);
        int var4 = this.field743.method371(53);
        if (var3 == 47) {
            this.field743.field1128 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field743.method374((byte) -47);
            var4 -= 3;
            int var6 = this.field747[arg0];
            this.field745 += (long) (this.field751 - var5) * (long) var6;
            this.field751 = var5;
            this.field743.field1128 += var4;
            return 2;
        } else {
            this.field743.field1128 += var4;
            return 3;
        }
    }

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "()V")
    public final void method251() {
        this.field743.field1084 = null;
        this.field746 = null;
        this.field749 = null;
        this.field747 = null;
        this.field744 = null;
    }

    @OriginalMember(owner = "client!ef", name = "c", descriptor = "(I)V")
    public final void method252(int arg0) {
        this.field749[arg0] = this.field743.field1128;
    }

    @OriginalMember(owner = "client!ef", name = "c", descriptor = "()Z")
    public final boolean method253() {
        return this.field743.field1084 != null;
    }

    @OriginalMember(owner = "client!ef", name = "d", descriptor = "(I)I")
    public final int method254(int arg0) {
        return this.method255(arg0);
    }

    @OriginalMember(owner = "client!ef", name = "e", descriptor = "(I)I")
    private final int method255(int arg0) {
        byte var2 = this.field743.field1084[this.field743.field1128];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field744[arg0] = var3;
            this.field743.field1128++;
        } else {
            var3 = this.field744[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method250(arg0, var3);
        }
        int var4 = this.field743.method371(64);
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field743.field1084[this.field743.field1128] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field743.field1128++;
                this.field744[arg0] = var5;
                return this.method250(arg0, var5);
            }
        }
        this.field743.field1128 += var4;
        return 0;
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(J)V")
    public final void method256(long arg0) {
        this.field745 = arg0;
        int var3 = this.field749.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field747[var4] = 0;
            this.field744[var4] = 0;
            this.field743.field1128 = this.field746[var4];
            this.method248(var4);
            this.field749[var4] = this.field743.field1128;
        }
    }

    @OriginalMember(owner = "client!ef", name = "d", descriptor = "()I")
    public final int method257() {
        int var1 = this.field749.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field749[var4] >= 0 && this.field747[var4] < var3) {
                var2 = var4;
                var3 = this.field747[var4];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!ef", name = "f", descriptor = "(I)V")
    public final void method258(int arg0) {
        this.field743.field1128 = this.field749[arg0];
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "([B)V")
    public final void method259(byte[] arg0) {
        this.field743.field1084 = arg0;
        this.field743.field1128 = 10;
        int var2 = this.field743.method383(-2056200760);
        this.field748 = this.field743.method383(-2056200760);
        this.field751 = 500000;
        this.field746 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var5 = this.field743.method399(-539722392);
            int var6 = this.field743.method399(-539722392);
            if (var5 == 1297379947) {
                this.field746[var3] = this.field743.field1128;
                var3++;
            }
            this.field743.field1128 += var6;
        }
        this.field745 = 0L;
        this.field749 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            this.field749[var4] = this.field746[var4];
        }
        this.field747 = new int[var2];
        this.field744 = new int[var2];
    }

    @OriginalMember(owner = "client!ef", name = "e", descriptor = "()I")
    public final int method260() {
        return this.field749.length;
    }

    @OriginalMember(owner = "client!ef", name = "f", descriptor = "()Z")
    public final boolean method261() {
        int var1 = this.field749.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field749[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!ef", name = "g", descriptor = "()V")
    public static void method262() {
        field750 = null;
    }

    @OriginalMember(owner = "client!ef", name = "<init>", descriptor = "()V")
    public class35() {
    }

    @OriginalMember(owner = "client!ef", name = "<init>", descriptor = "([B)V")
    public class35(byte[] arg0) {
        this.method259(arg0);
    }
}
