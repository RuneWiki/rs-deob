import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!el")
public class class202 {

    @OriginalMember(owner = "client!el", name = "b", descriptor = "Lgd;")
    private class74 field3652 = new class74((byte[]) null);

    @OriginalMember(owner = "client!el", name = "a", descriptor = "[B")
    private static byte[] field3651 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!el", name = "d", descriptor = "I")
    private int field3654;

    @OriginalMember(owner = "client!el", name = "g", descriptor = "I")
    public int field3657;

    @OriginalMember(owner = "client!el", name = "i", descriptor = "J")
    private long field3659;

    @OriginalMember(owner = "client!el", name = "c", descriptor = "[I")
    private int[] field3653;

    @OriginalMember(owner = "client!el", name = "e", descriptor = "[I")
    private int[] field3655;

    @OriginalMember(owner = "client!el", name = "f", descriptor = "[I")
    public int[] field3656;

    @OriginalMember(owner = "client!el", name = "h", descriptor = "[I")
    private int[] field3658;

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(I)J")
    public final long method1376(int arg0) {
        return (long) this.field3654 * (long) arg0 + this.field3659;
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "()V")
    public final void method1377() {
        this.field3652.field1340 = -1;
    }

    @OriginalMember(owner = "client!el", name = "b", descriptor = "()V")
    public final void method1378() {
        this.field3652.field1321 = null;
        this.field3653 = null;
        this.field3655 = null;
        this.field3656 = null;
        this.field3658 = null;
    }

    @OriginalMember(owner = "client!el", name = "c", descriptor = "()V")
    public static void method1379() {
        field3651 = null;
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(II)I")
    private final int method1380(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field3651[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field3652.method489((byte) -94) << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field3652.method489((byte) 83) << 16;
            }
            return var8;
        }
        int var3 = this.field3652.method489((byte) -97);
        int var4 = this.field3652.method503((byte) -29);
        if (var3 == 47) {
            this.field3652.field1340 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field3652.method525(65280);
            var4 -= 3;
            int var6 = this.field3656[arg0];
            this.field3659 += (long) (this.field3654 - var5) * (long) var6;
            this.field3654 = var5;
            this.field3652.field1340 += var4;
            return 2;
        } else {
            this.field3652.field1340 += var4;
            return 3;
        }
    }

    @OriginalMember(owner = "client!el", name = "b", descriptor = "(I)V")
    public final void method1381(int arg0) {
        int var2 = this.field3652.method503((byte) -29);
        this.field3656[arg0] += var2;
    }

    @OriginalMember(owner = "client!el", name = "d", descriptor = "()I")
    public final int method1382() {
        return this.field3655.length;
    }

    @OriginalMember(owner = "client!el", name = "e", descriptor = "()Z")
    public final boolean method1383() {
        int var1 = this.field3655.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field3655[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!el", name = "f", descriptor = "()Z")
    public final boolean method1384() {
        return this.field3652.field1321 != null;
    }

    @OriginalMember(owner = "client!el", name = "c", descriptor = "(I)V")
    public final void method1385(int arg0) {
        this.field3655[arg0] = this.field3652.field1340;
    }

    @OriginalMember(owner = "client!el", name = "d", descriptor = "(I)I")
    private final int method1386(int arg0) {
        byte var2 = this.field3652.field1321[this.field3652.field1340];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field3658[arg0] = var3;
            this.field3652.field1340++;
        } else {
            var3 = this.field3658[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method1380(arg0, var3);
        }
        int var4 = this.field3652.method503((byte) -29);
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field3652.field1321[this.field3652.field1340] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field3652.field1340++;
                this.field3658[arg0] = var5;
                return this.method1380(arg0, var5);
            }
        }
        this.field3652.field1340 += var4;
        return 0;
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "([B)V")
    public final void method1387(byte[] arg0) {
        this.field3652.field1321 = arg0;
        this.field3652.field1340 = 10;
        int var2 = this.field3652.method485(-2386);
        this.field3657 = this.field3652.method485(-2386);
        this.field3654 = 500000;
        this.field3653 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var5 = this.field3652.method498((byte) 125);
            int var6 = this.field3652.method498((byte) 125);
            if (var5 == 1297379947) {
                this.field3653[var3] = this.field3652.field1340;
                var3++;
            }
            this.field3652.field1340 += var6;
        }
        this.field3659 = 0L;
        this.field3655 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            this.field3655[var4] = this.field3653[var4];
        }
        this.field3656 = new int[var2];
        this.field3658 = new int[var2];
    }

    @OriginalMember(owner = "client!el", name = "e", descriptor = "(I)I")
    public final int method1388(int arg0) {
        return this.method1386(arg0);
    }

    @OriginalMember(owner = "client!el", name = "g", descriptor = "()I")
    public final int method1389() {
        int var1 = this.field3655.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field3655[var4] >= 0 && this.field3656[var4] < var3) {
                var2 = var4;
                var3 = this.field3656[var4];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(J)V")
    public final void method1390(long arg0) {
        this.field3659 = arg0;
        int var3 = this.field3655.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field3656[var4] = 0;
            this.field3658[var4] = 0;
            this.field3652.field1340 = this.field3653[var4];
            this.method1381(var4);
            this.field3655[var4] = this.field3652.field1340;
        }
    }

    @OriginalMember(owner = "client!el", name = "f", descriptor = "(I)V")
    public final void method1391(int arg0) {
        this.field3652.field1340 = this.field3655[arg0];
    }

    @OriginalMember(owner = "client!el", name = "<init>", descriptor = "()V")
    public class202() {
    }

    @OriginalMember(owner = "client!el", name = "<init>", descriptor = "([B)V")
    public class202(byte[] arg0) {
        this.method1387(arg0);
    }
}
