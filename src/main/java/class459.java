import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tc")
public class class459 {

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "Lfh;")
    private class194 field6796 = new class194(null);

    @OriginalMember(owner = "client!tc", name = "g", descriptor = "[B")
    private static byte[] field6802 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "I")
    private int field6797;

    @OriginalMember(owner = "client!tc", name = "c", descriptor = "I")
    public int field6798;

    @OriginalMember(owner = "client!tc", name = "h", descriptor = "J")
    private long field6803;

    @OriginalMember(owner = "client!tc", name = "d", descriptor = "[I")
    private int[] field6799;

    @OriginalMember(owner = "client!tc", name = "e", descriptor = "[I")
    private int[] field6800;

    @OriginalMember(owner = "client!tc", name = "f", descriptor = "[I")
    private int[] field6801;

    @OriginalMember(owner = "client!tc", name = "i", descriptor = "[I")
    public int[] field6804;

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "()Z")
    public final boolean method2800() {
        return this.field6796.field2973 != null;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(I)V")
    public final void method2801(int arg0) {
        this.field6801[arg0] = this.field6796.field2982;
    }

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "(I)V")
    public final void method2802(int arg0) {
        this.field6796.field2982 = this.field6801[arg0];
    }

    @OriginalMember(owner = "client!tc", name = "c", descriptor = "(I)V")
    public final void method2803(int arg0) {
        int var2 = this.field6796.method1372(false);
        this.field6804[arg0] += var2;
    }

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "()I")
    public final int method2804() {
        return this.field6801.length;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "([B)V")
    public final void method2805(byte[] arg0) {
        this.field6796.field2973 = arg0;
        this.field6796.field2982 = 10;
        int var2 = this.field6796.method1396(-122);
        this.field6798 = this.field6796.method1396(114);
        this.field6797 = 500000;
        this.field6800 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var5 = this.field6796.method1401(-126);
            int var6 = this.field6796.method1401(-74);
            if (var5 == 1297379947) {
                this.field6800[var3] = this.field6796.field2982;
                var3++;
            }
            this.field6796.field2982 += var6;
        }
        this.field6803 = 0L;
        this.field6801 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            this.field6801[var4] = this.field6800[var4];
        }
        this.field6804 = new int[var2];
        this.field6799 = new int[var2];
    }

    @OriginalMember(owner = "client!tc", name = "d", descriptor = "(I)J")
    public final long method2806(int arg0) {
        return (long) this.field6797 * (long) arg0 + this.field6803;
    }

    @OriginalMember(owner = "client!tc", name = "e", descriptor = "(I)I")
    private final int method2807(int arg0) {
        byte var2 = this.field6796.field2973[this.field6796.field2982];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field6799[arg0] = var3;
            this.field6796.field2982++;
        } else {
            var3 = this.field6799[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method2808(arg0, var3);
        }
        int var4 = this.field6796.method1372(false);
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field6796.field2973[this.field6796.field2982] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field6796.field2982++;
                this.field6799[arg0] = var5;
                return this.method2808(arg0, var5);
            }
        }
        this.field6796.field2982 += var4;
        return 0;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(II)I")
    private final int method2808(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field6802[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field6796.method1337((byte) 44) << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field6796.method1337((byte) 85) << 16;
            }
            return var8;
        }
        int var3 = this.field6796.method1337((byte) -127);
        int var4 = this.field6796.method1372(false);
        if (var3 == 47) {
            this.field6796.field2982 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field6796.method1339(-32768);
            var4 -= 3;
            int var6 = this.field6804[arg0];
            this.field6803 += (long) (this.field6797 - var5) * (long) var6;
            this.field6797 = var5;
            this.field6796.field2982 += var4;
            return 2;
        } else {
            this.field6796.field2982 += var4;
            return 3;
        }
    }

    @OriginalMember(owner = "client!tc", name = "f", descriptor = "(I)I")
    public final int method2809(int arg0) {
        return this.method2807(arg0);
    }

    @OriginalMember(owner = "client!tc", name = "c", descriptor = "()I")
    public final int method2810() {
        int var1 = this.field6801.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field6801[var4] >= 0 && this.field6804[var4] < var3) {
                var2 = var4;
                var3 = this.field6804[var4];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!tc", name = "d", descriptor = "()V")
    public final void method2811() {
        this.field6796.field2982 = -1;
    }

    @OriginalMember(owner = "client!tc", name = "e", descriptor = "()Z")
    public final boolean method2812() {
        int var1 = this.field6801.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field6801[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!tc", name = "f", descriptor = "()V")
    public final void method2813() {
        this.field6796.field2973 = null;
        this.field6800 = null;
        this.field6801 = null;
        this.field6804 = null;
        this.field6799 = null;
    }

    @OriginalMember(owner = "client!tc", name = "<init>", descriptor = "()V")
    public class459() {
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(J)V")
    public final void method2814(long arg0) {
        this.field6803 = arg0;
        int var3 = this.field6801.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field6804[var4] = 0;
            this.field6799[var4] = 0;
            this.field6796.field2982 = this.field6800[var4];
            this.method2803(var4);
            this.field6801[var4] = this.field6796.field2982;
        }
    }

    @OriginalMember(owner = "client!tc", name = "g", descriptor = "()V")
    public static void method2815() {
        field6802 = null;
    }

    @OriginalMember(owner = "client!tc", name = "<init>", descriptor = "([B)V")
    public class459(byte[] arg0) {
        this.method2805(arg0);
    }
}
