import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dm")
public class class349 {

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "Lqm;")
    private class227 field5539 = new class227((byte[]) null);

    @OriginalMember(owner = "client!dm", name = "b", descriptor = "[B")
    private static byte[] field5540 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!dm", name = "f", descriptor = "I")
    private int field5544;

    @OriginalMember(owner = "client!dm", name = "i", descriptor = "I")
    public int field5547;

    @OriginalMember(owner = "client!dm", name = "c", descriptor = "J")
    private long field5541;

    @OriginalMember(owner = "client!dm", name = "d", descriptor = "[I")
    private int[] field5542;

    @OriginalMember(owner = "client!dm", name = "e", descriptor = "[I")
    public int[] field5543;

    @OriginalMember(owner = "client!dm", name = "g", descriptor = "[I")
    private int[] field5545;

    @OriginalMember(owner = "client!dm", name = "h", descriptor = "[I")
    private int[] field5546;

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(II)I", line = 3)
    private final int method2442(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field5540[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field5539.method1720((byte) -20) << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field5539.method1720((byte) -98) << 16;
            }
            return var8;
        }
        int var3 = this.field5539.method1720((byte) -124);
        int var4 = this.field5539.method1711(true);
        if (var3 == 47) {
            this.field5539.field3760 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field5539.method1736(255);
            var4 -= 3;
            int var6 = this.field5543[arg0];
            this.field5541 += (long) (this.field5544 - var5) * (long) var6;
            this.field5544 = var5;
            this.field5539.field3760 += var4;
            return 2;
        } else {
            this.field5539.field3760 += var4;
            return 3;
        }
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(I)V", line = 46)
    public final void method2443(int arg0) {
        int var2 = this.field5539.method1711(true);
        this.field5543[arg0] += var2;
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "()I", line = 50)
    public final int method2444() {
        return this.field5545.length;
    }

    @OriginalMember(owner = "client!dm", name = "b", descriptor = "()I", line = 54)
    public final int method2445() {
        int var1 = this.field5545.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field5545[var4] >= 0 && this.field5543[var4] < var3) {
                var2 = var4;
                var3 = this.field5543[var4];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!dm", name = "b", descriptor = "(I)I", line = 80)
    private final int method2446(int arg0) {
        byte var2 = this.field5539.field3793[this.field5539.field3760];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field5546[arg0] = var3;
            this.field5539.field3760++;
        } else {
            var3 = this.field5546[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method2442(arg0, var3);
        }
        int var4 = this.field5539.method1711(true);
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field5539.field3793[this.field5539.field3760] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field5539.field3760++;
                this.field5546[arg0] = var5;
                return this.method2442(arg0, var5);
            }
        }
        this.field5539.field3760 += var4;
        return 0;
    }

    @OriginalMember(owner = "client!dm", name = "c", descriptor = "()V", line = 119)
    public final void method2447() {
        this.field5539.field3760 = -1;
    }

    @OriginalMember(owner = "client!dm", name = "d", descriptor = "()V", line = 122)
    public static void method2448() {
        field5540 = null;
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(J)V", line = 125)
    public final void method2449(long arg0) {
        this.field5541 = arg0;
        int var3 = this.field5545.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field5543[var4] = 0;
            this.field5546[var4] = 0;
            this.field5539.field3760 = this.field5542[var4];
            this.method2443(var4);
            this.field5545[var4] = this.field5539.field3760;
        }
    }

    @OriginalMember(owner = "client!dm", name = "c", descriptor = "(I)I", line = 145)
    public final int method2450(int arg0) {
        return this.method2446(arg0);
    }

    @OriginalMember(owner = "client!dm", name = "d", descriptor = "(I)V", line = 153)
    public final void method2451(int arg0) {
        this.field5539.field3760 = this.field5545[arg0];
    }

    @OriginalMember(owner = "client!dm", name = "<init>", descriptor = "()V", line = 264)
    public class349() {
    }

    @OriginalMember(owner = "client!dm", name = "<init>", descriptor = "([B)V", line = 266)
    public class349(byte[] arg0) {
        this.method2455(arg0);
    }

    @OriginalMember(owner = "client!dm", name = "e", descriptor = "()V", line = 160)
    public final void method2452() {
        this.field5539.field3793 = null;
        this.field5542 = null;
        this.field5545 = null;
        this.field5543 = null;
        this.field5546 = null;
    }

    @OriginalMember(owner = "client!dm", name = "e", descriptor = "(I)V", line = 169)
    public final void method2453(int arg0) {
        this.field5545[arg0] = this.field5539.field3760;
    }

    @OriginalMember(owner = "client!dm", name = "f", descriptor = "(I)J", line = 176)
    public final long method2454(int arg0) {
        return (long) this.field5544 * (long) arg0 + this.field5541;
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "([B)V", line = 182)
    public final void method2455(byte[] arg0) {
        this.field5539.field3793 = arg0;
        this.field5539.field3760 = 10;
        int var2 = this.field5539.method1765(true);
        this.field5547 = this.field5539.method1765(true);
        this.field5544 = 500000;
        this.field5542 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field5539.method1715((byte) 122);
            int var5 = this.field5539.method1715((byte) 46);
            if (var4 == 1297379947) {
                this.field5542[var3] = this.field5539.field3760;
                var3++;
            }
            this.field5539.field3760 += var5;
        }
        this.field5541 = 0L;
        this.field5545 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field5545[var6] = this.field5542[var6];
        }
        this.field5543 = new int[var2];
        this.field5546 = new int[var2];
    }

    @OriginalMember(owner = "client!dm", name = "f", descriptor = "()Z", line = 241)
    public final boolean method2456() {
        int var1 = this.field5545.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field5545[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!dm", name = "g", descriptor = "()Z", line = 261)
    public final boolean method2457() {
        return this.field5539.field3793 != null;
    }
}
