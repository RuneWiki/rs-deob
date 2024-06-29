import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lq")
public class class325 {

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "Lol;")
    private class431 field4602 = new class431(null);

    @OriginalMember(owner = "client!lq", name = "c", descriptor = "[B")
    private static byte[] field4604 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!lq", name = "h", descriptor = "I")
    private int field4609;

    @OriginalMember(owner = "client!lq", name = "i", descriptor = "I")
    public int field4610;

    @OriginalMember(owner = "client!lq", name = "e", descriptor = "J")
    private long field4606;

    @OriginalMember(owner = "client!lq", name = "b", descriptor = "[I")
    private int[] field4603;

    @OriginalMember(owner = "client!lq", name = "d", descriptor = "[I")
    private int[] field4605;

    @OriginalMember(owner = "client!lq", name = "f", descriptor = "[I")
    public int[] field4607;

    @OriginalMember(owner = "client!lq", name = "g", descriptor = "[I")
    private int[] field4608;

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(I)J", line = 3)
    public final long method1962(int arg0) {
        return (long) this.field4609 * (long) arg0 + this.field4606;
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "()V", line = 6)
    public final void method1963() {
        this.field4602.field6002 = null;
        this.field4608 = null;
        this.field4605 = null;
        this.field4607 = null;
        this.field4603 = null;
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(II)I", line = 16)
    private final int method1964(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field4604[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field4602.method2557(14929) << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field4602.method2557(14929) << 16;
            }
            return var8;
        }
        int var3 = this.field4602.method2557(14929);
        int var4 = this.field4602.method2569(127);
        if (var3 == 47) {
            this.field4602.field5983 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field4602.method2515(106);
            var4 -= 3;
            int var6 = this.field4607[arg0];
            this.field4606 += (long) (this.field4609 - var5) * (long) var6;
            this.field4609 = var5;
            this.field4602.field5983 += var4;
            return 2;
        } else {
            this.field4602.field5983 += var4;
            return 3;
        }
    }

    @OriginalMember(owner = "client!lq", name = "b", descriptor = "(I)I", line = 60)
    private final int method1965(int arg0) {
        byte var2 = this.field4602.field6002[this.field4602.field5983];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field4603[arg0] = var3;
            this.field4602.field5983++;
        } else {
            var3 = this.field4603[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method1964(arg0, var3);
        }
        int var4 = this.field4602.method2569(127);
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field4602.field6002[this.field4602.field5983] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field4602.field5983++;
                this.field4603[arg0] = var5;
                return this.method1964(arg0, var5);
            }
        }
        this.field4602.field5983 += var4;
        return 0;
    }

    @OriginalMember(owner = "client!lq", name = "c", descriptor = "(I)I", line = 99)
    public final int method1966(int arg0) {
        return this.method1965(arg0);
    }

    @OriginalMember(owner = "client!lq", name = "d", descriptor = "(I)V", line = 105)
    public final void method1967(int arg0) {
        this.field4602.field5983 = this.field4605[arg0];
    }

    @OriginalMember(owner = "client!lq", name = "b", descriptor = "()I", line = 108)
    public final int method1968() {
        return this.field4605.length;
    }

    @OriginalMember(owner = "client!lq", name = "c", descriptor = "()V", line = 111)
    public final void method1969() {
        this.field4602.field5983 = -1;
    }

    @OriginalMember(owner = "client!lq", name = "d", descriptor = "()V", line = 114)
    public static void method1970() {
        field4604 = null;
    }

    @OriginalMember(owner = "client!lq", name = "<init>", descriptor = "()V", line = 264)
    public class325() {
    }

    @OriginalMember(owner = "client!lq", name = "<init>", descriptor = "([B)V", line = 266)
    public class325(byte[] arg0) {
        this.method1973(arg0);
    }

    @OriginalMember(owner = "client!lq", name = "e", descriptor = "(I)V", line = 121)
    public final void method1971(int arg0) {
        this.field4605[arg0] = this.field4602.field5983;
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(J)V", line = 124)
    public final void method1972(long arg0) {
        this.field4606 = arg0;
        int var3 = this.field4605.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field4607[var4] = 0;
            this.field4603[var4] = 0;
            this.field4602.field5983 = this.field4608[var4];
            this.method1976(var4);
            this.field4605[var4] = this.field4602.field5983;
        }
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "([B)V", line = 143)
    public final void method1973(byte[] arg0) {
        this.field4602.field6002 = arg0;
        this.field4602.field5983 = 10;
        int var2 = this.field4602.method2565((byte) -120);
        this.field4610 = this.field4602.method2565((byte) -119);
        this.field4609 = 500000;
        this.field4608 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var5 = this.field4602.method2526(17);
            int var6 = this.field4602.method2526(17);
            if (var5 == 1297379947) {
                this.field4608[var3] = this.field4602.field5983;
                var3++;
            }
            this.field4602.field5983 += var6;
        }
        this.field4606 = 0L;
        this.field4605 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            this.field4605[var4] = this.field4608[var4];
        }
        this.field4607 = new int[var2];
        this.field4603 = new int[var2];
    }

    @OriginalMember(owner = "client!lq", name = "e", descriptor = "()I", line = 198)
    public final int method1974() {
        int var1 = this.field4605.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field4605[var4] >= 0 && this.field4607[var4] < var3) {
                var2 = var4;
                var3 = this.field4607[var4];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!lq", name = "f", descriptor = "()Z", line = 226)
    public final boolean method1975() {
        int var1 = this.field4605.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field4605[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!lq", name = "f", descriptor = "(I)V", line = 244)
    public final void method1976(int arg0) {
        int var2 = this.field4602.method2569(127);
        this.field4607[arg0] += var2;
    }

    @OriginalMember(owner = "client!lq", name = "g", descriptor = "()Z", line = 257)
    public final boolean method1977() {
        return this.field4602.field6002 != null;
    }
}
