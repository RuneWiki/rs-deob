import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mb")
public class class117 {

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "Lpi;")
    private class336 field2041 = new class336((byte[]) null);

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "[B")
    private static byte[] field2040 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!mb", name = "e", descriptor = "I")
    private int field2044;

    @OriginalMember(owner = "client!mb", name = "g", descriptor = "I")
    public int field2046;

    @OriginalMember(owner = "client!mb", name = "c", descriptor = "J")
    private long field2042;

    @OriginalMember(owner = "client!mb", name = "d", descriptor = "[I")
    private int[] field2043;

    @OriginalMember(owner = "client!mb", name = "f", descriptor = "[I")
    private int[] field2045;

    @OriginalMember(owner = "client!mb", name = "h", descriptor = "[I")
    private int[] field2047;

    @OriginalMember(owner = "client!mb", name = "i", descriptor = "[I")
    public int[] field2048;

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(I)I", line = 11)
    private final int method996(int arg0) {
        byte var2 = this.field2041.field5342[this.field2041.field5353];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field2043[arg0] = var3;
            this.field2041.field5353++;
        } else {
            var3 = this.field2043[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method1002(arg0, var3);
        }
        int var4 = this.field2041.method2331(288808016);
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field2041.field5342[this.field2041.field5353] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field2041.field5353++;
                this.field2043[arg0] = var5;
                return this.method1002(arg0, var5);
            }
        }
        this.field2041.field5353 += var4;
        return 0;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "()I", line = 50)
    public final int method997() {
        int var1 = this.field2045.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field2045[var4] >= 0 && this.field2048[var4] < var3) {
                var2 = var4;
                var3 = this.field2048[var4];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(J)V", line = 75)
    public final void method998(long arg0) {
        this.field2042 = arg0;
        int var3 = this.field2045.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2048[var4] = 0;
            this.field2043[var4] = 0;
            this.field2041.field5353 = this.field2047[var4];
            this.method1000(var4);
            this.field2045[var4] = this.field2041.field5353;
        }
    }

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "()V", line = 93)
    public static void method999() {
        field2040 = null;
    }

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "(I)V", line = 97)
    public final void method1000(int arg0) {
        int var2 = this.field2041.method2331(288808016);
        this.field2048[arg0] += var2;
    }

    @OriginalMember(owner = "client!mb", name = "c", descriptor = "(I)V", line = 102)
    public final void method1001(int arg0) {
        this.field2041.field5353 = this.field2045[arg0];
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(II)I", line = 105)
    private final int method1002(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field2040[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field2041.method2364(-9069) << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field2041.method2364(-9069) << 16;
            }
            return var8;
        }
        int var3 = this.field2041.method2364(-9069);
        int var4 = this.field2041.method2331(288808016);
        if (var3 == 47) {
            this.field2041.field5353 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field2041.method2317(21803);
            var4 -= 3;
            int var6 = this.field2048[arg0];
            this.field2042 += (long) (this.field2044 - var5) * (long) var6;
            this.field2044 = var5;
            this.field2041.field5353 += var4;
            return 2;
        } else {
            this.field2041.field5353 += var4;
            return 3;
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "([B)V", line = 148)
    public final void method1003(byte[] arg0) {
        this.field2041.field5342 = arg0;
        this.field2041.field5353 = 10;
        int var2 = this.field2041.method2339((byte) -46);
        this.field2046 = this.field2041.method2339((byte) -46);
        this.field2044 = 500000;
        this.field2047 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field2041.method2338((byte) 54);
            int var5 = this.field2041.method2338((byte) 45);
            if (var4 == 1297379947) {
                this.field2047[var3] = this.field2041.field5353;
                var3++;
            }
            this.field2041.field5353 += var5;
        }
        this.field2042 = 0L;
        this.field2045 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field2045[var6] = this.field2047[var6];
        }
        this.field2048 = new int[var2];
        this.field2043 = new int[var2];
    }

    @OriginalMember(owner = "client!mb", name = "d", descriptor = "(I)I", line = 204)
    public final int method1004(int arg0) {
        return this.method996(arg0);
    }

    @OriginalMember(owner = "client!mb", name = "c", descriptor = "()V", line = 212)
    public final void method1005() {
        this.field2041.field5342 = null;
        this.field2047 = null;
        this.field2045 = null;
        this.field2048 = null;
        this.field2043 = null;
    }

    @OriginalMember(owner = "client!mb", name = "d", descriptor = "()V", line = 221)
    public final void method1006() {
        this.field2041.field5353 = -1;
    }

    @OriginalMember(owner = "client!mb", name = "e", descriptor = "(I)J", line = 224)
    public final long method1007(int arg0) {
        return (long) this.field2044 * (long) arg0 + this.field2042;
    }

    @OriginalMember(owner = "client!mb", name = "<init>", descriptor = "()V", line = 261)
    public class117() {
    }

    @OriginalMember(owner = "client!mb", name = "<init>", descriptor = "([B)V", line = 266)
    public class117(byte[] arg0) {
        this.method1003(arg0);
    }

    @OriginalMember(owner = "client!mb", name = "e", descriptor = "()Z", line = 236)
    public final boolean method1008() {
        return this.field2041.field5342 != null;
    }

    @OriginalMember(owner = "client!mb", name = "f", descriptor = "(I)V", line = 240)
    public final void method1009(int arg0) {
        this.field2045[arg0] = this.field2041.field5353;
    }

    @OriginalMember(owner = "client!mb", name = "f", descriptor = "()Z", line = 248)
    public final boolean method1010() {
        int var1 = this.field2045.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field2045[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!mb", name = "g", descriptor = "()I", line = 264)
    public final int method1011() {
        return this.field2045.length;
    }
}
