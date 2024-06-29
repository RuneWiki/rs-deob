import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ik")
public class class528 {

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "Lbt;")
    private class88 field7792 = new class88(null);

    @OriginalMember(owner = "client!ik", name = "g", descriptor = "[B")
    private static byte[] field7798 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!ik", name = "b", descriptor = "I")
    private int field7793;

    @OriginalMember(owner = "client!ik", name = "i", descriptor = "I")
    public int field7800;

    @OriginalMember(owner = "client!ik", name = "d", descriptor = "J")
    private long field7795;

    @OriginalMember(owner = "client!ik", name = "c", descriptor = "[I")
    private int[] field7794;

    @OriginalMember(owner = "client!ik", name = "e", descriptor = "[I")
    public int[] field7796;

    @OriginalMember(owner = "client!ik", name = "f", descriptor = "[I")
    private int[] field7797;

    @OriginalMember(owner = "client!ik", name = "h", descriptor = "[I")
    private int[] field7799;

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(I)V", line = 3)
    public final void method3121(int arg0) {
        this.field7792.field1176 = this.field7797[arg0];
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "()V", line = 8)
    public final void method3122() {
        this.field7792.field1176 = -1;
    }

    @OriginalMember(owner = "client!ik", name = "<init>", descriptor = "()V", line = 263)
    public class528() {
    }

    @OriginalMember(owner = "client!ik", name = "<init>", descriptor = "([B)V", line = 265)
    public class528(byte[] arg0) {
        this.method3132(arg0);
    }

    @OriginalMember(owner = "client!ik", name = "b", descriptor = "()I", line = 14)
    public final int method3123() {
        return this.field7797.length;
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(J)V", line = 17)
    public final void method3124(long arg0) {
        this.field7795 = arg0;
        int var3 = this.field7797.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field7796[var4] = 0;
            this.field7799[var4] = 0;
            this.field7792.field1176 = this.field7794[var4];
            this.method3128(var4);
            this.field7797[var4] = this.field7792.field1176;
        }
    }

    @OriginalMember(owner = "client!ik", name = "c", descriptor = "()V", line = 36)
    public static void method3125() {
        field7798 = null;
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(II)I", line = 40)
    private final int method3126(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field7798[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field7792.method617(2) << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field7792.method617(2) << 16;
            }
            return var8;
        }
        int var3 = this.field7792.method617(2);
        int var4 = this.field7792.method592(-47);
        if (var3 == 47) {
            this.field7792.field1176 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field7792.method584(255);
            var4 -= 3;
            int var6 = this.field7796[arg0];
            this.field7795 += (long) (this.field7793 - var5) * (long) var6;
            this.field7793 = var5;
            this.field7792.field1176 += var4;
            return 2;
        } else {
            this.field7792.field1176 += var4;
            return 3;
        }
    }

    @OriginalMember(owner = "client!ik", name = "d", descriptor = "()Z", line = 86)
    public final boolean method3127() {
        int var1 = this.field7797.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field7797[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!ik", name = "b", descriptor = "(I)V", line = 100)
    public final void method3128(int arg0) {
        int var2 = this.field7792.method592(-57);
        this.field7796[arg0] += var2;
    }

    @OriginalMember(owner = "client!ik", name = "c", descriptor = "(I)I", line = 105)
    public final int method3129(int arg0) {
        return this.method3135(arg0);
    }

    @OriginalMember(owner = "client!ik", name = "d", descriptor = "(I)J", line = 117)
    public final long method3130(int arg0) {
        return (long) this.field7793 * (long) arg0 + this.field7795;
    }

    @OriginalMember(owner = "client!ik", name = "e", descriptor = "()Z", line = 120)
    public final boolean method3131() {
        return this.field7792.field1223 != null;
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "([B)V", line = 130)
    public final void method3132(byte[] arg0) {
        this.field7792.field1223 = arg0;
        this.field7792.field1176 = 10;
        int var2 = this.field7792.method568((byte) 110);
        this.field7800 = this.field7792.method568((byte) 110);
        this.field7793 = 500000;
        this.field7794 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var5 = this.field7792.method578(127);
            int var6 = this.field7792.method578(89);
            if (var5 == 1297379947) {
                this.field7794[var3] = this.field7792.field1176;
                var3++;
            }
            this.field7792.field1176 += var6;
        }
        this.field7795 = 0L;
        this.field7797 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            this.field7797[var4] = this.field7794[var4];
        }
        this.field7796 = new int[var2];
        this.field7799 = new int[var2];
    }

    @OriginalMember(owner = "client!ik", name = "f", descriptor = "()V", line = 183)
    public final void method3133() {
        this.field7792.field1223 = null;
        this.field7794 = null;
        this.field7797 = null;
        this.field7796 = null;
        this.field7799 = null;
    }

    @OriginalMember(owner = "client!ik", name = "e", descriptor = "(I)V", line = 192)
    public final void method3134(int arg0) {
        this.field7797[arg0] = this.field7792.field1176;
    }

    @OriginalMember(owner = "client!ik", name = "f", descriptor = "(I)I", line = 196)
    private final int method3135(int arg0) {
        byte var2 = this.field7792.field1223[this.field7792.field1176];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field7799[arg0] = var3;
            this.field7792.field1176++;
        } else {
            var3 = this.field7799[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method3126(arg0, var3);
        }
        int var4 = this.field7792.method592(99);
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field7792.field1223[this.field7792.field1176] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field7792.field1176++;
                this.field7799[arg0] = var5;
                return this.method3126(arg0, var5);
            }
        }
        this.field7792.field1176 += var4;
        return 0;
    }

    @OriginalMember(owner = "client!ik", name = "g", descriptor = "()I", line = 236)
    public final int method3136() {
        int var1 = this.field7797.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field7797[var4] >= 0 && this.field7796[var4] < var3) {
                var2 = var4;
                var3 = this.field7796[var4];
            }
        }
        return var2;
    }
}
