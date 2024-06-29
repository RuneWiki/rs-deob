import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fr")
public class class498 {

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "Lsv;")
    private class319 field7283 = new class319(null);

    @OriginalMember(owner = "client!fr", name = "g", descriptor = "[B")
    private static byte[] field7289 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!fr", name = "c", descriptor = "I")
    public int field7285;

    @OriginalMember(owner = "client!fr", name = "i", descriptor = "I")
    private int field7291;

    @OriginalMember(owner = "client!fr", name = "b", descriptor = "J")
    private long field7284;

    @OriginalMember(owner = "client!fr", name = "d", descriptor = "[I")
    private int[] field7286;

    @OriginalMember(owner = "client!fr", name = "e", descriptor = "[I")
    private int[] field7287;

    @OriginalMember(owner = "client!fr", name = "f", descriptor = "[I")
    private int[] field7288;

    @OriginalMember(owner = "client!fr", name = "h", descriptor = "[I")
    public int[] field7290;

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "()V")
    public static void method2953() {
        field7289 = null;
    }

    @OriginalMember(owner = "client!fr", name = "b", descriptor = "()Z")
    public final boolean method2954() {
        int var1 = this.field7286.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field7286[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!fr", name = "c", descriptor = "()I")
    public final int method2955() {
        int var1 = this.field7286.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field7286[var4] >= 0 && this.field7290[var4] < var3) {
                var2 = var4;
                var3 = this.field7290[var4];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(I)J")
    public final long method2956(int arg0) {
        return (long) this.field7291 * (long) arg0 + this.field7284;
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "([B)V")
    public final void method2957(byte[] arg0) {
        this.field7283.field4336 = arg0;
        this.field7283.field4360 = 10;
        int var2 = this.field7283.method1844(-111);
        this.field7285 = this.field7283.method1844(-125);
        this.field7291 = 500000;
        this.field7287 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var5 = this.field7283.method1863(-1);
            int var6 = this.field7283.method1863(-1);
            if (var5 == 1297379947) {
                this.field7287[var3] = this.field7283.field4360;
                var3++;
            }
            this.field7283.field4360 += var6;
        }
        this.field7284 = 0L;
        this.field7286 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            this.field7286[var4] = this.field7287[var4];
        }
        this.field7290 = new int[var2];
        this.field7288 = new int[var2];
    }

    @OriginalMember(owner = "client!fr", name = "b", descriptor = "(I)V")
    public final void method2958(int arg0) {
        this.field7286[arg0] = this.field7283.field4360;
    }

    @OriginalMember(owner = "client!fr", name = "d", descriptor = "()V")
    public final void method2959() {
        this.field7283.field4360 = -1;
    }

    @OriginalMember(owner = "client!fr", name = "e", descriptor = "()Z")
    public final boolean method2960() {
        return this.field7283.field4336 != null;
    }

    @OriginalMember(owner = "client!fr", name = "c", descriptor = "(I)I")
    public final int method2961(int arg0) {
        return this.method2968(arg0);
    }

    @OriginalMember(owner = "client!fr", name = "d", descriptor = "(I)V")
    public final void method2962(int arg0) {
        int var2 = this.field7283.method1860(4);
        this.field7290[arg0] += var2;
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(II)I")
    private final int method2963(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field7289[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field7283.method1869(-70) << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field7283.method1869(-69) << 16;
            }
            return var8;
        }
        int var3 = this.field7283.method1869(-83);
        int var4 = this.field7283.method1860(4);
        if (var3 == 47) {
            this.field7283.field4360 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field7283.method1852(1086280488);
            var4 -= 3;
            int var6 = this.field7290[arg0];
            this.field7284 += (long) (this.field7291 - var5) * (long) var6;
            this.field7291 = var5;
            this.field7283.field4360 += var4;
            return 2;
        } else {
            this.field7283.field4360 += var4;
            return 3;
        }
    }

    @OriginalMember(owner = "client!fr", name = "e", descriptor = "(I)V")
    public final void method2964(int arg0) {
        this.field7283.field4360 = this.field7286[arg0];
    }

    @OriginalMember(owner = "client!fr", name = "f", descriptor = "()I")
    public final int method2965() {
        return this.field7286.length;
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(J)V")
    public final void method2966(long arg0) {
        this.field7284 = arg0;
        int var3 = this.field7286.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field7290[var4] = 0;
            this.field7288[var4] = 0;
            this.field7283.field4360 = this.field7287[var4];
            this.method2962(var4);
            this.field7286[var4] = this.field7283.field4360;
        }
    }

    @OriginalMember(owner = "client!fr", name = "g", descriptor = "()V")
    public final void method2967() {
        this.field7283.field4336 = null;
        this.field7287 = null;
        this.field7286 = null;
        this.field7290 = null;
        this.field7288 = null;
    }

    @OriginalMember(owner = "client!fr", name = "f", descriptor = "(I)I")
    private final int method2968(int arg0) {
        byte var2 = this.field7283.field4336[this.field7283.field4360];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field7288[arg0] = var3;
            this.field7283.field4360++;
        } else {
            var3 = this.field7288[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method2963(arg0, var3);
        }
        int var4 = this.field7283.method1860(4);
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field7283.field4336[this.field7283.field4360] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field7283.field4360++;
                this.field7288[arg0] = var5;
                return this.method2963(arg0, var5);
            }
        }
        this.field7283.field4360 += var4;
        return 0;
    }

    @OriginalMember(owner = "client!fr", name = "<init>", descriptor = "()V")
    public class498() {
    }

    @OriginalMember(owner = "client!fr", name = "<init>", descriptor = "([B)V")
    public class498(byte[] arg0) {
        this.method2957(arg0);
    }
}
