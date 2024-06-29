import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bs")
public class class465 {

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "Lha;")
    private class40 field7133 = new class40(null);

    @OriginalMember(owner = "client!bs", name = "b", descriptor = "[B")
    private static byte[] field7134 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!bs", name = "c", descriptor = "I")
    public int field7135;

    @OriginalMember(owner = "client!bs", name = "g", descriptor = "I")
    private int field7139;

    @OriginalMember(owner = "client!bs", name = "d", descriptor = "J")
    private long field7136;

    @OriginalMember(owner = "client!bs", name = "e", descriptor = "[I")
    private int[] field7137;

    @OriginalMember(owner = "client!bs", name = "f", descriptor = "[I")
    public int[] field7138;

    @OriginalMember(owner = "client!bs", name = "h", descriptor = "[I")
    private int[] field7140;

    @OriginalMember(owner = "client!bs", name = "i", descriptor = "[I")
    private int[] field7141;

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(I)V", line = 5)
    public final void method2803(int arg0) {
        int var2 = this.field7133.method269((byte) -69);
        this.field7138[arg0] += var2;
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "()V", line = 10)
    public final void method2804() {
        this.field7133.field585 = -1;
    }

    @OriginalMember(owner = "client!bs", name = "b", descriptor = "(I)J", line = 13)
    public final long method2805(int arg0) {
        return (long) this.field7139 * (long) arg0 + this.field7136;
    }

    @OriginalMember(owner = "client!bs", name = "b", descriptor = "()V", line = 16)
    public static void method2806() {
        field7134 = null;
    }

    @OriginalMember(owner = "client!bs", name = "c", descriptor = "()I", line = 20)
    public final int method2807() {
        int var1 = this.field7141.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field7141[var4] >= 0 && this.field7138[var4] < var3) {
                var2 = var4;
                var3 = this.field7138[var4];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!bs", name = "c", descriptor = "(I)I", line = 48)
    private final int method2808(int arg0) {
        byte var2 = this.field7133.field536[this.field7133.field585];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field7140[arg0] = var3;
            this.field7133.field585++;
        } else {
            var3 = this.field7140[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method2818(arg0, var3);
        }
        int var4 = this.field7133.method269((byte) -63);
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field7133.field536[this.field7133.field585] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field7133.field585++;
                this.field7140[arg0] = var5;
                return this.method2818(arg0, var5);
            }
        }
        this.field7133.field585 += var4;
        return 0;
    }

    @OriginalMember(owner = "client!bs", name = "<init>", descriptor = "()V", line = 263)
    public class465() {
    }

    @OriginalMember(owner = "client!bs", name = "<init>", descriptor = "([B)V", line = 265)
    public class465(byte[] arg0) {
        this.method2817(arg0);
    }

    @OriginalMember(owner = "client!bs", name = "d", descriptor = "()I", line = 91)
    public final int method2809() {
        return this.field7141.length;
    }

    @OriginalMember(owner = "client!bs", name = "d", descriptor = "(I)I", line = 97)
    public final int method2810(int arg0) {
        return this.method2808(arg0);
    }

    @OriginalMember(owner = "client!bs", name = "e", descriptor = "(I)V", line = 103)
    public final void method2811(int arg0) {
        this.field7133.field585 = this.field7141[arg0];
    }

    @OriginalMember(owner = "client!bs", name = "e", descriptor = "()V", line = 106)
    public final void method2812() {
        this.field7133.field536 = null;
        this.field7137 = null;
        this.field7141 = null;
        this.field7138 = null;
        this.field7140 = null;
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(J)V", line = 116)
    public final void method2813(long arg0) {
        this.field7136 = arg0;
        int var3 = this.field7141.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field7138[var4] = 0;
            this.field7140[var4] = 0;
            this.field7133.field585 = this.field7137[var4];
            this.method2803(var4);
            this.field7141[var4] = this.field7133.field585;
        }
    }

    @OriginalMember(owner = "client!bs", name = "f", descriptor = "()Z", line = 134)
    public final boolean method2814() {
        return this.field7133.field536 != null;
    }

    @OriginalMember(owner = "client!bs", name = "g", descriptor = "()Z", line = 139)
    public final boolean method2815() {
        int var1 = this.field7141.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field7141[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!bs", name = "f", descriptor = "(I)V", line = 152)
    public final void method2816(int arg0) {
        this.field7141[arg0] = this.field7133.field585;
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "([B)V", line = 155)
    public final void method2817(byte[] arg0) {
        this.field7133.field536 = arg0;
        this.field7133.field585 = 10;
        int var2 = this.field7133.method254((byte) -64);
        this.field7135 = this.field7133.method254((byte) -42);
        this.field7139 = 500000;
        this.field7137 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var5 = this.field7133.method255((byte) 96);
            int var6 = this.field7133.method255((byte) 96);
            if (var5 == 1297379947) {
                this.field7137[var3] = this.field7133.field585;
                var3++;
            }
            this.field7133.field585 += var6;
        }
        this.field7136 = 0L;
        this.field7141 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            this.field7141[var4] = this.field7137[var4];
        }
        this.field7138 = new int[var2];
        this.field7140 = new int[var2];
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(II)I", line = 217)
    private final int method2818(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field7134[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field7133.method257((byte) 48) << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field7133.method257((byte) 69) << 16;
            }
            return var8;
        }
        int var3 = this.field7133.method257((byte) 28);
        int var4 = this.field7133.method269((byte) -95);
        if (var3 == 47) {
            this.field7133.field585 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field7133.method224(-2);
            var4 -= 3;
            int var6 = this.field7138[arg0];
            this.field7136 += (long) (this.field7139 - var5) * (long) var6;
            this.field7139 = var5;
            this.field7133.field585 += var4;
            return 2;
        } else {
            this.field7133.field585 += var4;
            return 3;
        }
    }
}
