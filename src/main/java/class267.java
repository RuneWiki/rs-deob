import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ik")
public class class267 {

    @OriginalMember(owner = "client!ik", name = "b", descriptor = "Lql;")
    private class224 field4093 = new class224((byte[]) null);

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "[B")
    private static byte[] field4092 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!ik", name = "f", descriptor = "I")
    public int field4097;

    @OriginalMember(owner = "client!ik", name = "g", descriptor = "I")
    private int field4098;

    @OriginalMember(owner = "client!ik", name = "h", descriptor = "J")
    private long field4099;

    @OriginalMember(owner = "client!ik", name = "c", descriptor = "[I")
    public int[] field4094;

    @OriginalMember(owner = "client!ik", name = "d", descriptor = "[I")
    private int[] field4095;

    @OriginalMember(owner = "client!ik", name = "e", descriptor = "[I")
    private int[] field4096;

    @OriginalMember(owner = "client!ik", name = "i", descriptor = "[I")
    private int[] field4100;

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "([B)V")
    public final void method1751(byte[] arg0) {
        this.field4093.field3336 = arg0;
        this.field4093.field3402 = 10;
        int var2 = this.field4093.method1445(false);
        this.field4097 = this.field4093.method1445(false);
        this.field4098 = 500000;
        this.field4095 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var5 = this.field4093.method1483((byte) 46);
            int var6 = this.field4093.method1483((byte) 46);
            if (var5 == 1297379947) {
                this.field4095[var3] = this.field4093.field3402;
                var3++;
            }
            this.field4093.field3402 += var6;
        }
        this.field4099 = 0L;
        this.field4100 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            this.field4100[var4] = this.field4095[var4];
        }
        this.field4094 = new int[var2];
        this.field4096 = new int[var2];
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(I)J")
    public final long method1752(int arg0) {
        return (long) this.field4098 * (long) arg0 + this.field4099;
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "()V")
    public final void method1753() {
        this.field4093.field3402 = -1;
    }

    @OriginalMember(owner = "client!ik", name = "b", descriptor = "(I)I")
    public final int method1754(int arg0) {
        return this.method1755(arg0);
    }

    @OriginalMember(owner = "client!ik", name = "c", descriptor = "(I)I")
    private final int method1755(int arg0) {
        byte var2 = this.field4093.field3336[this.field4093.field3402];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field4096[arg0] = var3;
            this.field4093.field3402++;
        } else {
            var3 = this.field4096[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method1757(arg0, var3);
        }
        int var4 = this.field4093.method1449(26861);
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field4093.field3336[this.field4093.field3402] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field4093.field3402++;
                this.field4096[arg0] = var5;
                return this.method1757(arg0, var5);
            }
        }
        this.field4093.field3402 += var4;
        return 0;
    }

    @OriginalMember(owner = "client!ik", name = "d", descriptor = "(I)V")
    public final void method1756(int arg0) {
        this.field4100[arg0] = this.field4093.field3402;
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(II)I")
    private final int method1757(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field4092[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field4093.method1453((byte) -128) << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field4093.method1453((byte) -127) << 16;
            }
            return var8;
        }
        int var3 = this.field4093.method1453((byte) -127);
        int var4 = this.field4093.method1449(26861);
        if (var3 == 47) {
            this.field4093.field3402 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field4093.method1454(116);
            var4 -= 3;
            int var6 = this.field4094[arg0];
            this.field4099 += (long) (this.field4098 - var5) * (long) var6;
            this.field4098 = var5;
            this.field4093.field3402 += var4;
            return 2;
        } else {
            this.field4093.field3402 += var4;
            return 3;
        }
    }

    @OriginalMember(owner = "client!ik", name = "b", descriptor = "()Z")
    public final boolean method1758() {
        return this.field4093.field3336 != null;
    }

    @OriginalMember(owner = "client!ik", name = "e", descriptor = "(I)V")
    public final void method1759(int arg0) {
        int var2 = this.field4093.method1449(26861);
        this.field4094[arg0] += var2;
    }

    @OriginalMember(owner = "client!ik", name = "c", descriptor = "()I")
    public final int method1760() {
        int var1 = this.field4100.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field4100[var4] >= 0 && this.field4094[var4] < var3) {
                var2 = var4;
                var3 = this.field4094[var4];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!ik", name = "d", descriptor = "()I")
    public final int method1761() {
        return this.field4100.length;
    }

    @OriginalMember(owner = "client!ik", name = "e", descriptor = "()Z")
    public final boolean method1762() {
        int var1 = this.field4100.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field4100[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!ik", name = "f", descriptor = "()V")
    public final void method1763() {
        this.field4093.field3336 = null;
        this.field4095 = null;
        this.field4100 = null;
        this.field4094 = null;
        this.field4096 = null;
    }

    @OriginalMember(owner = "client!ik", name = "g", descriptor = "()V")
    public static void method1764() {
        field4092 = null;
    }

    @OriginalMember(owner = "client!ik", name = "f", descriptor = "(I)V")
    public final void method1765(int arg0) {
        this.field4093.field3402 = this.field4100[arg0];
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(J)V")
    public final void method1766(long arg0) {
        this.field4099 = arg0;
        int var3 = this.field4100.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field4094[var4] = 0;
            this.field4096[var4] = 0;
            this.field4093.field3402 = this.field4095[var4];
            this.method1759(var4);
            this.field4100[var4] = this.field4093.field3402;
        }
    }

    @OriginalMember(owner = "client!ik", name = "<init>", descriptor = "()V")
    public class267() {
    }

    @OriginalMember(owner = "client!ik", name = "<init>", descriptor = "([B)V")
    public class267(byte[] arg0) {
        this.method1751(arg0);
    }
}
