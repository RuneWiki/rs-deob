import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wj")
public class class269 {

    @OriginalMember(owner = "client!wj", name = "b", descriptor = "Lti;")
    private class303 field3905 = new class303(null);

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "[B")
    private static byte[] field3904 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!wj", name = "c", descriptor = "I")
    private int field3906;

    @OriginalMember(owner = "client!wj", name = "e", descriptor = "I")
    public int field3908;

    @OriginalMember(owner = "client!wj", name = "d", descriptor = "J")
    private long field3907;

    @OriginalMember(owner = "client!wj", name = "f", descriptor = "[I")
    private int[] field3909;

    @OriginalMember(owner = "client!wj", name = "g", descriptor = "[I")
    private int[] field3910;

    @OriginalMember(owner = "client!wj", name = "h", descriptor = "[I")
    private int[] field3911;

    @OriginalMember(owner = "client!wj", name = "i", descriptor = "[I")
    public int[] field3912;

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(I)I", line = 5)
    public final int method1717(int arg0) {
        return this.method1723(arg0);
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(II)I", line = 12)
    private final int method1718(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field3904[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field3905.method1918((byte) 121) << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field3905.method1918((byte) 118) << 16;
            }
            return var8;
        }
        int var3 = this.field3905.method1918((byte) 76);
        int var4 = this.field3905.method1911(50);
        if (var3 == 47) {
            this.field3905.field4333 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field3905.method1866(false);
            var4 -= 3;
            int var6 = this.field3912[arg0];
            this.field3907 += (long) (this.field3906 - var5) * (long) var6;
            this.field3906 = var5;
            this.field3905.field4333 += var4;
            return 2;
        } else {
            this.field3905.field4333 += var4;
            return 3;
        }
    }

    @OriginalMember(owner = "client!wj", name = "b", descriptor = "(I)V", line = 54)
    public final void method1719(int arg0) {
        this.field3909[arg0] = this.field3905.field4333;
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "()V", line = 58)
    public final void method1720() {
        this.field3905.field4326 = null;
        this.field3910 = null;
        this.field3909 = null;
        this.field3912 = null;
        this.field3911 = null;
    }

    @OriginalMember(owner = "client!wj", name = "c", descriptor = "(I)J", line = 69)
    public final long method1721(int arg0) {
        return (long) this.field3906 * (long) arg0 + this.field3907;
    }

    @OriginalMember(owner = "client!wj", name = "b", descriptor = "()I", line = 72)
    public final int method1722() {
        return this.field3909.length;
    }

    @OriginalMember(owner = "client!wj", name = "d", descriptor = "(I)I", line = 76)
    private final int method1723(int arg0) {
        byte var2 = this.field3905.field4326[this.field3905.field4333];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field3911[arg0] = var3;
            this.field3905.field4333++;
        } else {
            var3 = this.field3911[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method1718(arg0, var3);
        }
        int var4 = this.field3905.method1911(109);
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field3905.field4326[this.field3905.field4333] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field3905.field4333++;
                this.field3911[arg0] = var5;
                return this.method1718(arg0, var5);
            }
        }
        this.field3905.field4333 += var4;
        return 0;
    }

    @OriginalMember(owner = "client!wj", name = "c", descriptor = "()I", line = 116)
    public final int method1724() {
        int var1 = this.field3909.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field3909[var4] >= 0 && this.field3912[var4] < var3) {
                var2 = var4;
                var3 = this.field3912[var4];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!wj", name = "d", descriptor = "()Z", line = 143)
    public final boolean method1725() {
        int var1 = this.field3909.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field3909[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!wj", name = "e", descriptor = "()V", line = 157)
    public final void method1726() {
        this.field3905.field4333 = -1;
    }

    @OriginalMember(owner = "client!wj", name = "e", descriptor = "(I)V", line = 165)
    public final void method1727(int arg0) {
        this.field3905.field4333 = this.field3909[arg0];
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "([B)V", line = 170)
    public final void method1728(byte[] arg0) {
        this.field3905.field4326 = arg0;
        this.field3905.field4333 = 10;
        int var2 = this.field3905.method1868(0);
        this.field3908 = this.field3905.method1868(0);
        this.field3906 = 500000;
        this.field3910 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var5 = this.field3905.method1870(-1945262512);
            int var6 = this.field3905.method1870(-1945262512);
            if (var5 == 1297379947) {
                this.field3910[var3] = this.field3905.field4333;
                var3++;
            }
            this.field3905.field4333 += var6;
        }
        this.field3907 = 0L;
        this.field3909 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            this.field3909[var4] = this.field3910[var4];
        }
        this.field3912 = new int[var2];
        this.field3911 = new int[var2];
    }

    @OriginalMember(owner = "client!wj", name = "f", descriptor = "()Z", line = 225)
    public final boolean method1729() {
        return this.field3905.field4326 != null;
    }

    @OriginalMember(owner = "client!wj", name = "<init>", descriptor = "()V", line = 264)
    public class269() {
    }

    @OriginalMember(owner = "client!wj", name = "<init>", descriptor = "([B)V", line = 266)
    public class269(byte[] arg0) {
        this.method1728(arg0);
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(J)V", line = 237)
    public final void method1730(long arg0) {
        this.field3907 = arg0;
        int var3 = this.field3909.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field3912[var4] = 0;
            this.field3911[var4] = 0;
            this.field3905.field4333 = this.field3910[var4];
            this.method1732(var4);
            this.field3909[var4] = this.field3905.field4333;
        }
    }

    @OriginalMember(owner = "client!wj", name = "g", descriptor = "()V", line = 256)
    public static void method1731() {
        field3904 = null;
    }

    @OriginalMember(owner = "client!wj", name = "f", descriptor = "(I)V", line = 260)
    public final void method1732(int arg0) {
        int var2 = this.field3905.method1911(72);
        this.field3912[arg0] += var2;
    }
}
