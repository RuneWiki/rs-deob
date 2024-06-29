import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sw")
public class class790 {

    @OriginalMember(owner = "client!sw", name = "h", descriptor = "Lwq;")
    private class176 field11533 = new class176(null);

    @OriginalMember(owner = "client!sw", name = "d", descriptor = "[B")
    private static byte[] field11536 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!sw", name = "c", descriptor = "I")
    public int field11538;

    @OriginalMember(owner = "client!sw", name = "f", descriptor = "I")
    private int field11539;

    @OriginalMember(owner = "client!sw", name = "a", descriptor = "J")
    private long field11535;

    @OriginalMember(owner = "client!sw", name = "g", descriptor = "[I")
    private int[] field11534;

    @OriginalMember(owner = "client!sw", name = "e", descriptor = "[I")
    private int[] field11537;

    @OriginalMember(owner = "client!sw", name = "b", descriptor = "[I")
    private int[] field11540;

    @OriginalMember(owner = "client!sw", name = "i", descriptor = "[I")
    public int[] field11541;

    @OriginalMember(owner = "client!sw", name = "a", descriptor = "([B)V")
    public final void method5671(byte[] arg0) {
        this.field11533.field2805 = arg0;
        this.field11533.field2799 = 10;
        int var2 = this.field11533.method1687((byte) -85);
        this.field11538 = this.field11533.method1687((byte) -127);
        this.field11539 = 500000;
        this.field11534 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var5 = this.field11533.method1622(-18712);
            int var6 = this.field11533.method1622(-18712);
            if (var5 == 1297379947) {
                this.field11534[var3] = this.field11533.field2799;
                var3++;
            }
            this.field11533.field2799 += var6;
        }
        this.field11535 = 0L;
        this.field11537 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            this.field11537[var4] = this.field11534[var4];
        }
        this.field11541 = new int[var2];
        this.field11540 = new int[var2];
    }

    @OriginalMember(owner = "client!sw", name = "d", descriptor = "()Z")
    public final boolean method5672() {
        return this.field11533.field2805 != null;
    }

    @OriginalMember(owner = "client!sw", name = "b", descriptor = "(I)I")
    private final int method5673(int arg0) {
        byte var2 = this.field11533.field2805[this.field11533.field2799];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field11540[arg0] = var3;
            this.field11533.field2799++;
        } else {
            var3 = this.field11540[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method5681(arg0, var3);
        }
        int var4 = this.field11533.method1648(-112);
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field11533.field2805[this.field11533.field2799] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field11533.field2799++;
                this.field11540[arg0] = var5;
                return this.method5681(arg0, var5);
            }
        }
        this.field11533.field2799 += var4;
        return 0;
    }

    @OriginalMember(owner = "client!sw", name = "f", descriptor = "(I)V")
    public final void method5674(int arg0) {
        this.field11537[arg0] = this.field11533.field2799;
    }

    @OriginalMember(owner = "client!sw", name = "c", descriptor = "(I)V")
    public final void method5675(int arg0) {
        int var2 = this.field11533.method1648(-121);
        this.field11541[arg0] += var2;
    }

    @OriginalMember(owner = "client!sw", name = "a", descriptor = "(J)V")
    public final void method5676(long arg0) {
        this.field11535 = arg0;
        int var3 = this.field11537.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field11541[var4] = 0;
            this.field11540[var4] = 0;
            this.field11533.field2799 = this.field11534[var4];
            this.method5675(var4);
            this.field11537[var4] = this.field11533.field2799;
        }
    }

    @OriginalMember(owner = "client!sw", name = "e", descriptor = "()V")
    public static void method5677() {
        field11536 = null;
    }

    @OriginalMember(owner = "client!sw", name = "f", descriptor = "()I")
    public final int method5678() {
        int var1 = this.field11537.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field11537[var4] >= 0 && this.field11541[var4] < var3) {
                var2 = var4;
                var3 = this.field11541[var4];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!sw", name = "d", descriptor = "(I)V")
    public final void method5679(int arg0) {
        this.field11533.field2799 = this.field11537[arg0];
    }

    @OriginalMember(owner = "client!sw", name = "a", descriptor = "()I")
    public final int method5680() {
        return this.field11537.length;
    }

    @OriginalMember(owner = "client!sw", name = "a", descriptor = "(II)I")
    private final int method5681(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field11536[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field11533.method1645((byte) -88) << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field11533.method1645((byte) -92) << 16;
            }
            return var8;
        }
        int var3 = this.field11533.method1645((byte) -85);
        int var4 = this.field11533.method1648(107);
        if (var3 == 47) {
            this.field11533.field2799 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field11533.method1685(false);
            var4 -= 3;
            int var6 = this.field11541[arg0];
            this.field11535 += (long) (this.field11539 - var5) * (long) var6;
            this.field11539 = var5;
            this.field11533.field2799 += var4;
            return 2;
        } else {
            this.field11533.field2799 += var4;
            return 3;
        }
    }

    @OriginalMember(owner = "client!sw", name = "g", descriptor = "()V")
    public final void method5682() {
        this.field11533.field2805 = null;
        this.field11534 = null;
        this.field11537 = null;
        this.field11541 = null;
        this.field11540 = null;
    }

    @OriginalMember(owner = "client!sw", name = "c", descriptor = "()Z")
    public final boolean method5683() {
        int var1 = this.field11537.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field11537[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!sw", name = "a", descriptor = "(I)I")
    public final int method5684(int arg0) {
        return this.method5673(arg0);
    }

    @OriginalMember(owner = "client!sw", name = "e", descriptor = "(I)J")
    public final long method5685(int arg0) {
        return (long) this.field11539 * (long) arg0 + this.field11535;
    }

    @OriginalMember(owner = "client!sw", name = "b", descriptor = "()V")
    public final void method5686() {
        this.field11533.field2799 = -1;
    }

    @OriginalMember(owner = "client!sw", name = "<init>", descriptor = "()V")
    public class790() {
    }

    @OriginalMember(owner = "client!sw", name = "<init>", descriptor = "([B)V")
    public class790(byte[] arg0) {
        this.method5671(arg0);
    }
}
