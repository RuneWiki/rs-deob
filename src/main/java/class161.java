import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ta")
public class class161 {

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "Laa;")
    private class8 field3019 = new class8((byte[]) null);

    @OriginalMember(owner = "client!ta", name = "g", descriptor = "[B")
    private static byte[] field3025 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!ta", name = "d", descriptor = "I")
    public int field3022;

    @OriginalMember(owner = "client!ta", name = "f", descriptor = "I")
    private int field3024;

    @OriginalMember(owner = "client!ta", name = "c", descriptor = "J")
    private long field3021;

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "[I")
    public int[] field3020;

    @OriginalMember(owner = "client!ta", name = "e", descriptor = "[I")
    private int[] field3023;

    @OriginalMember(owner = "client!ta", name = "h", descriptor = "[I")
    private int[] field3026;

    @OriginalMember(owner = "client!ta", name = "i", descriptor = "[I")
    private int[] field3027;

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "()I")
    public final int method1194() {
        return this.field3027.length;
    }

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "()I")
    public final int method1195() {
        int var1 = this.field3027.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field3027[var4] >= 0 && this.field3020[var4] < var3) {
                var2 = var4;
                var3 = this.field3020[var4];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!ta", name = "c", descriptor = "()V")
    public final void method1196() {
        this.field3019.field124 = null;
        this.field3026 = null;
        this.field3027 = null;
        this.field3020 = null;
        this.field3023 = null;
    }

    @OriginalMember(owner = "client!ta", name = "d", descriptor = "()Z")
    public final boolean method1197() {
        int var1 = this.field3027.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field3027[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(II)I")
    private final int method1198(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field3025[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field3019.method63((byte) 54) << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field3019.method63((byte) 116) << 16;
            }
            return var8;
        }
        int var3 = this.field3019.method63((byte) 90);
        int var4 = this.field3019.method93(-126);
        if (var3 == 47) {
            this.field3019.field146 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field3019.method60(23888);
            var4 -= 3;
            int var6 = this.field3020[arg0];
            this.field3021 += (long) (this.field3024 - var5) * (long) var6;
            this.field3024 = var5;
            this.field3019.field146 += var4;
            return 2;
        } else {
            this.field3019.field146 += var4;
            return 3;
        }
    }

    @OriginalMember(owner = "client!ta", name = "e", descriptor = "()Z")
    public final boolean method1199() {
        return this.field3019.field124 != null;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(I)V")
    public final void method1200(int arg0) {
        int var2 = this.field3019.method93(-20);
        this.field3020[arg0] += var2;
    }

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "(I)I")
    private final int method1201(int arg0) {
        byte var2 = this.field3019.field124[this.field3019.field146];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field3023[arg0] = var3;
            this.field3019.field146++;
        } else {
            var3 = this.field3023[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method1198(arg0, var3);
        }
        int var4 = this.field3019.method93(52);
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field3019.field124[this.field3019.field146] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field3019.field146++;
                this.field3023[arg0] = var5;
                return this.method1198(arg0, var5);
            }
        }
        this.field3019.field146 += var4;
        return 0;
    }

    @OriginalMember(owner = "client!ta", name = "f", descriptor = "()V")
    public static void method1202() {
        field3025 = null;
    }

    @OriginalMember(owner = "client!ta", name = "c", descriptor = "(I)V")
    public final void method1203(int arg0) {
        this.field3027[arg0] = this.field3019.field146;
    }

    @OriginalMember(owner = "client!ta", name = "d", descriptor = "(I)I")
    public final int method1204(int arg0) {
        return this.method1201(arg0);
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "([B)V")
    public final void method1205(byte[] arg0) {
        this.field3019.field124 = arg0;
        this.field3019.field146 = 10;
        int var2 = this.field3019.method65((byte) 120);
        this.field3022 = this.field3019.method65((byte) 107);
        this.field3024 = 500000;
        this.field3026 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var5 = this.field3019.method70(65280);
            int var6 = this.field3019.method70(65280);
            if (var5 == 1297379947) {
                this.field3026[var3] = this.field3019.field146;
                var3++;
            }
            this.field3019.field146 += var6;
        }
        this.field3021 = 0L;
        this.field3027 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            this.field3027[var4] = this.field3026[var4];
        }
        this.field3020 = new int[var2];
        this.field3023 = new int[var2];
    }

    @OriginalMember(owner = "client!ta", name = "g", descriptor = "()V")
    public final void method1206() {
        this.field3019.field146 = -1;
    }

    @OriginalMember(owner = "client!ta", name = "e", descriptor = "(I)J")
    public final long method1207(int arg0) {
        return (long) this.field3024 * (long) arg0 + this.field3021;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(J)V")
    public final void method1208(long arg0) {
        this.field3021 = arg0;
        int var3 = this.field3027.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field3020[var4] = 0;
            this.field3023[var4] = 0;
            this.field3019.field146 = this.field3026[var4];
            this.method1200(var4);
            this.field3027[var4] = this.field3019.field146;
        }
    }

    @OriginalMember(owner = "client!ta", name = "f", descriptor = "(I)V")
    public final void method1209(int arg0) {
        this.field3019.field146 = this.field3027[arg0];
    }

    @OriginalMember(owner = "client!ta", name = "<init>", descriptor = "()V")
    public class161() {
    }

    @OriginalMember(owner = "client!ta", name = "<init>", descriptor = "([B)V")
    public class161(byte[] arg0) {
        this.method1205(arg0);
    }
}
