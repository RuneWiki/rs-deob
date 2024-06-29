import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ea")
public class class26 {

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "Lba;")
    private class8 field753 = new class8(null);

    @OriginalMember(owner = "client!ea", name = "g", descriptor = "[B")
    private static byte[] field759 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!ea", name = "h", descriptor = "I")
    private int field760;

    @OriginalMember(owner = "client!ea", name = "i", descriptor = "I")
    public int field761;

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "J")
    private long field754;

    @OriginalMember(owner = "client!ea", name = "c", descriptor = "[I")
    private int[] field755;

    @OriginalMember(owner = "client!ea", name = "d", descriptor = "[I")
    private int[] field756;

    @OriginalMember(owner = "client!ea", name = "e", descriptor = "[I")
    public int[] field757;

    @OriginalMember(owner = "client!ea", name = "f", descriptor = "[I")
    private int[] field758;

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "()I", line = 4)
    public final int method336() {
        int var1 = this.field755.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field755[var4] >= 0 && this.field757[var4] < var3) {
                var2 = var4;
                var3 = this.field757[var4];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(I)J", line = 29)
    public final long method337(int arg0) {
        return (long) this.field760 * (long) arg0 + this.field754;
    }

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "(I)I", line = 34)
    public final int method338(int arg0) {
        return this.method347(arg0);
    }

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "()I", line = 45)
    public final int method339() {
        return this.field755.length;
    }

    @OriginalMember(owner = "client!ea", name = "c", descriptor = "(I)V", line = 49)
    public final void method340(int arg0) {
        int var2 = this.field753.method177(68);
        this.field757[arg0] += var2;
    }

    @OriginalMember(owner = "client!ea", name = "c", descriptor = "()V", line = 53)
    public final void method341() {
        this.field753.field285 = null;
        this.field756 = null;
        this.field755 = null;
        this.field757 = null;
        this.field758 = null;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "([B)V", line = 64)
    public final void method342(byte[] arg0) {
        this.field753.field285 = arg0;
        this.field753.field268 = 10;
        int var2 = this.field753.method146(65280);
        this.field761 = this.field753.method146(65280);
        this.field760 = 500000;
        this.field756 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field753.method168(-4750);
            int var5 = this.field753.method168(-4750);
            if (var4 == 1297379947) {
                this.field756[var3] = this.field753.field268;
                var3++;
            }
            this.field753.field268 += var5;
        }
        this.field755 = (int[]) this.field756.clone();
        this.field757 = new int[var2];
        this.field758 = new int[var2];
    }

    @OriginalMember(owner = "client!ea", name = "d", descriptor = "()Z", line = 109)
    public final boolean method343() {
        return this.field753.field285 != null;
    }

    @OriginalMember(owner = "client!ea", name = "e", descriptor = "()Z", line = 112)
    public final boolean method344() {
        return this.field753.field268 < 0;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(J)V", line = 119)
    public final void method345(long arg0) {
        this.field754 = arg0;
        int var3 = this.field755.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field757[var4] = 0;
            this.field758[var4] = 0;
            this.field753.field268 = this.field756[var4];
            this.method340(var4);
            this.field755[var4] = this.field753.field268;
        }
    }

    @OriginalMember(owner = "client!ea", name = "d", descriptor = "(I)V", line = 137)
    public final void method346(int arg0) {
        this.field755[arg0] = this.field753.field268;
    }

    @OriginalMember(owner = "client!ea", name = "e", descriptor = "(I)I", line = 147)
    private final int method347(int arg0) {
        byte var2 = this.field753.field285[this.field753.field268];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field758[arg0] = var3;
            this.field753.field268++;
        } else {
            var3 = this.field758[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method348(arg0, var3);
        }
        int var4 = this.field753.method177(63);
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field753.field285[this.field753.field268] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field753.field268++;
                this.field758[arg0] = var5;
                return this.method348(arg0, var5);
            }
        }
        this.field753.field268 += var4;
        return 0;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(II)I", line = 185)
    private final int method348(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field759[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field753.method145(false) << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field753.method145(false) << 16;
            }
            return var8;
        }
        int var3 = this.field753.method145(false);
        int var4 = this.field753.method177(88);
        if (var3 == 47) {
            this.field753.field268 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field753.method165(true);
            var4 -= 3;
            int var6 = this.field757[arg0];
            this.field754 += (long) (this.field760 - var5) * (long) var6;
            this.field760 = var5;
            this.field753.field268 += var4;
            return 2;
        } else {
            this.field753.field268 += var4;
            return 3;
        }
    }

    @OriginalMember(owner = "client!ea", name = "f", descriptor = "()Z", line = 234)
    public final boolean method349() {
        int var1 = this.field755.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field755[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!ea", name = "g", descriptor = "()V", line = 247)
    public final void method350() {
        this.field753.field268 = -1;
    }

    @OriginalMember(owner = "client!ea", name = "f", descriptor = "(I)V", line = 252)
    public final void method351(int arg0) {
        this.field753.field268 = this.field755[arg0];
    }

    @OriginalMember(owner = "client!ea", name = "h", descriptor = "()V", line = 258)
    public static void method352() {
        field759 = null;
    }
}
