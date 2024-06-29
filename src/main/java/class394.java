import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ps")
public class class394 {

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "Ltq;")
    private class250 field5671 = new class250((byte[]) null);

    @OriginalMember(owner = "client!ps", name = "b", descriptor = "[B")
    private static byte[] field5672 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!ps", name = "e", descriptor = "I")
    private int field5675;

    @OriginalMember(owner = "client!ps", name = "f", descriptor = "I")
    public int field5676;

    @OriginalMember(owner = "client!ps", name = "h", descriptor = "J")
    private long field5678;

    @OriginalMember(owner = "client!ps", name = "c", descriptor = "[I")
    public int[] field5673;

    @OriginalMember(owner = "client!ps", name = "d", descriptor = "[I")
    private int[] field5674;

    @OriginalMember(owner = "client!ps", name = "g", descriptor = "[I")
    private int[] field5677;

    @OriginalMember(owner = "client!ps", name = "i", descriptor = "[I")
    private int[] field5679;

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "([B)V", line = 4)
    public final void method2450(byte[] arg0) {
        this.field5671.field3406 = arg0;
        this.field5671.field3389 = 10;
        int var2 = this.field5671.method1374(-2);
        this.field5676 = this.field5671.method1374(-2);
        this.field5675 = 500000;
        this.field5679 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var5 = this.field5671.method1359(255);
            int var6 = this.field5671.method1359(255);
            if (var5 == 1297379947) {
                this.field5679[var3] = this.field5671.field3389;
                var3++;
            }
            this.field5671.field3389 += var6;
        }
        this.field5678 = 0L;
        this.field5677 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            this.field5677[var4] = this.field5679[var4];
        }
        this.field5673 = new int[var2];
        this.field5674 = new int[var2];
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(II)I", line = 61)
    private final int method2451(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field5672[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field5671.method1350(31351) << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field5671.method1350(31351) << 16;
            }
            return var8;
        }
        int var3 = this.field5671.method1350(31351);
        int var4 = this.field5671.method1329((byte) -34);
        if (var3 == 47) {
            this.field5671.field3389 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field5671.method1372(-2);
            var4 -= 3;
            int var6 = this.field5673[arg0];
            this.field5678 += (long) (this.field5675 - var5) * (long) var6;
            this.field5675 = var5;
            this.field5671.field3389 += var4;
            return 2;
        } else {
            this.field5671.field3389 += var4;
            return 3;
        }
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "()Z", line = 105)
    public final boolean method2452() {
        int var1 = this.field5677.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field5677[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!ps", name = "b", descriptor = "()V", line = 119)
    public final void method2453() {
        this.field5671.field3389 = -1;
    }

    @OriginalMember(owner = "client!ps", name = "c", descriptor = "()V", line = 122)
    public final void method2454() {
        this.field5671.field3406 = null;
        this.field5679 = null;
        this.field5677 = null;
        this.field5673 = null;
        this.field5674 = null;
    }

    @OriginalMember(owner = "client!ps", name = "d", descriptor = "()Z", line = 131)
    public final boolean method2455() {
        return this.field5671.field3406 != null;
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(J)V", line = 135)
    public final void method2456(long arg0) {
        this.field5678 = arg0;
        int var3 = this.field5677.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field5673[var4] = 0;
            this.field5674[var4] = 0;
            this.field5671.field3389 = this.field5679[var4];
            this.method2458(var4);
            this.field5677[var4] = this.field5671.field3389;
        }
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(I)V", line = 154)
    public final void method2457(int arg0) {
        this.field5677[arg0] = this.field5671.field3389;
    }

    @OriginalMember(owner = "client!ps", name = "b", descriptor = "(I)V", line = 158)
    public final void method2458(int arg0) {
        int var2 = this.field5671.method1329((byte) -94);
        this.field5673[arg0] += var2;
    }

    @OriginalMember(owner = "client!ps", name = "e", descriptor = "()I", line = 163)
    public final int method2459() {
        int var1 = this.field5677.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field5677[var4] >= 0 && this.field5673[var4] < var3) {
                var2 = var4;
                var3 = this.field5673[var4];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!ps", name = "f", descriptor = "()V", line = 188)
    public static void method2460() {
        field5672 = null;
    }

    @OriginalMember(owner = "client!ps", name = "c", descriptor = "(I)V", line = 191)
    public final void method2461(int arg0) {
        this.field5671.field3389 = this.field5677[arg0];
    }

    @OriginalMember(owner = "client!ps", name = "d", descriptor = "(I)I", line = 197)
    private final int method2462(int arg0) {
        byte var2 = this.field5671.field3406[this.field5671.field3389];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field5674[arg0] = var3;
            this.field5671.field3389++;
        } else {
            var3 = this.field5674[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method2451(arg0, var3);
        }
        int var4 = this.field5671.method1329((byte) -128);
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field5671.field3406[this.field5671.field3389] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field5671.field3389++;
                this.field5674[arg0] = var5;
                return this.method2451(arg0, var5);
            }
        }
        this.field5671.field3389 += var4;
        return 0;
    }

    @OriginalMember(owner = "client!ps", name = "<init>", descriptor = "()V", line = 255)
    public class394() {
    }

    @OriginalMember(owner = "client!ps", name = "<init>", descriptor = "([B)V", line = 265)
    public class394(byte[] arg0) {
        this.method2450(arg0);
    }

    @OriginalMember(owner = "client!ps", name = "g", descriptor = "()I", line = 239)
    public final int method2463() {
        return this.field5677.length;
    }

    @OriginalMember(owner = "client!ps", name = "e", descriptor = "(I)J", line = 246)
    public final long method2464(int arg0) {
        return (long) this.field5675 * (long) arg0 + this.field5678;
    }

    @OriginalMember(owner = "client!ps", name = "f", descriptor = "(I)I", line = 260)
    public final int method2465(int arg0) {
        return this.method2462(arg0);
    }
}
