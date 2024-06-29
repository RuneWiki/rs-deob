import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cea")
public class class194 {

    @OriginalMember(owner = "client!cea", name = "b", descriptor = "Lmo;")
    private class695 field2785 = new class695(null);

    @OriginalMember(owner = "client!cea", name = "a", descriptor = "[B")
    private static byte[] field2784 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!cea", name = "g", descriptor = "I")
    private int field2790;

    @OriginalMember(owner = "client!cea", name = "i", descriptor = "I")
    public int field2792;

    @OriginalMember(owner = "client!cea", name = "c", descriptor = "J")
    private long field2786;

    @OriginalMember(owner = "client!cea", name = "d", descriptor = "[I")
    private int[] field2787;

    @OriginalMember(owner = "client!cea", name = "e", descriptor = "[I")
    private int[] field2788;

    @OriginalMember(owner = "client!cea", name = "f", descriptor = "[I")
    public int[] field2789;

    @OriginalMember(owner = "client!cea", name = "h", descriptor = "[I")
    private int[] field2791;

    @OriginalMember(owner = "client!cea", name = "a", descriptor = "(I)V")
    public final void method1303(int arg0) {
        this.field2791[arg0] = this.field2785.field9761;
    }

    @OriginalMember(owner = "client!cea", name = "b", descriptor = "(I)J")
    public final long method1304(int arg0) {
        return (long) this.field2790 * (long) arg0 + this.field2786;
    }

    @OriginalMember(owner = "client!cea", name = "a", descriptor = "()I")
    public final int method1305() {
        return this.field2791.length;
    }

    @OriginalMember(owner = "client!cea", name = "b", descriptor = "()V")
    public final void method1306() {
        this.field2785.field9796 = null;
        this.field2788 = null;
        this.field2791 = null;
        this.field2789 = null;
        this.field2787 = null;
    }

    @OriginalMember(owner = "client!cea", name = "a", descriptor = "([B)V")
    public final void method1307(byte[] arg0) {
        this.field2785.field9796 = arg0;
        this.field2785.field9761 = 10;
        int var2 = this.field2785.method3847((byte) 118);
        this.field2792 = this.field2785.method3847((byte) 118);
        this.field2790 = 500000;
        this.field2788 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var5 = this.field2785.method3880(8);
            int var6 = this.field2785.method3880(8);
            if (var5 == 1297379947) {
                this.field2788[var3] = this.field2785.field9761;
                var3++;
            }
            this.field2785.field9761 += var6;
        }
        this.field2786 = 0L;
        this.field2791 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            this.field2791[var4] = this.field2788[var4];
        }
        this.field2789 = new int[var2];
        this.field2787 = new int[var2];
    }

    @OriginalMember(owner = "client!cea", name = "c", descriptor = "()I")
    public final int method1308() {
        int var1 = this.field2791.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field2791[var4] >= 0 && this.field2789[var4] < var3) {
                var2 = var4;
                var3 = this.field2789[var4];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!cea", name = "c", descriptor = "(I)V")
    public final void method1309(int arg0) {
        int var2 = this.field2785.method3820(false);
        this.field2789[arg0] += var2;
    }

    @OriginalMember(owner = "client!cea", name = "d", descriptor = "(I)V")
    public final void method1310(int arg0) {
        this.field2785.field9761 = this.field2791[arg0];
    }

    @OriginalMember(owner = "client!cea", name = "d", descriptor = "()Z")
    public final boolean method1311() {
        return this.field2785.field9796 != null;
    }

    @OriginalMember(owner = "client!cea", name = "a", descriptor = "(II)I")
    private final int method1312(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field2784[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field2785.method3826(false) << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field2785.method3826(false) << 16;
            }
            return var8;
        }
        int var3 = this.field2785.method3826(false);
        int var4 = this.field2785.method3820(false);
        if (var3 == 47) {
            this.field2785.field9761 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field2785.method3873(255);
            var4 -= 3;
            int var6 = this.field2789[arg0];
            this.field2786 += (long) (this.field2790 - var5) * (long) var6;
            this.field2790 = var5;
            this.field2785.field9761 += var4;
            return 2;
        } else {
            this.field2785.field9761 += var4;
            return 3;
        }
    }

    @OriginalMember(owner = "client!cea", name = "e", descriptor = "()V")
    public final void method1313() {
        this.field2785.field9761 = -1;
    }

    @OriginalMember(owner = "client!cea", name = "f", descriptor = "()Z")
    public final boolean method1314() {
        int var1 = this.field2791.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field2791[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!cea", name = "e", descriptor = "(I)I")
    private final int method1315(int arg0) {
        byte var2 = this.field2785.field9796[this.field2785.field9761];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field2787[arg0] = var3;
            this.field2785.field9761++;
        } else {
            var3 = this.field2787[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method1312(arg0, var3);
        }
        int var4 = this.field2785.method3820(false);
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field2785.field9796[this.field2785.field9761] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field2785.field9761++;
                this.field2787[arg0] = var5;
                return this.method1312(arg0, var5);
            }
        }
        this.field2785.field9761 += var4;
        return 0;
    }

    @OriginalMember(owner = "client!cea", name = "g", descriptor = "()V")
    public static void method1316() {
        field2784 = null;
    }

    @OriginalMember(owner = "client!cea", name = "f", descriptor = "(I)I")
    public final int method1317(int arg0) {
        return this.method1315(arg0);
    }

    @OriginalMember(owner = "client!cea", name = "a", descriptor = "(J)V")
    public final void method1318(long arg0) {
        this.field2786 = arg0;
        int var3 = this.field2791.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2789[var4] = 0;
            this.field2787[var4] = 0;
            this.field2785.field9761 = this.field2788[var4];
            this.method1309(var4);
            this.field2791[var4] = this.field2785.field9761;
        }
    }

    @OriginalMember(owner = "client!cea", name = "<init>", descriptor = "()V")
    public class194() {
    }

    @OriginalMember(owner = "client!cea", name = "<init>", descriptor = "([B)V")
    public class194(byte[] arg0) {
        this.method1307(arg0);
    }
}
