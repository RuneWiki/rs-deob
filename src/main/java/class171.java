import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pd")
public class class171 {

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "Lug;")
    private class396 field2199 = new class396(null);

    @OriginalMember(owner = "client!pd", name = "g", descriptor = "[B")
    private static byte[] field2205 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!pd", name = "h", descriptor = "I")
    public int field2206;

    @OriginalMember(owner = "client!pd", name = "i", descriptor = "I")
    private int field2207;

    @OriginalMember(owner = "client!pd", name = "c", descriptor = "J")
    private long field2201;

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "[I")
    private int[] field2200;

    @OriginalMember(owner = "client!pd", name = "d", descriptor = "[I")
    private int[] field2202;

    @OriginalMember(owner = "client!pd", name = "e", descriptor = "[I")
    private int[] field2203;

    @OriginalMember(owner = "client!pd", name = "f", descriptor = "[I")
    public int[] field2204;

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(I)V", line = 5)
    public final void method998(int arg0) {
        this.field2202[arg0] = this.field2199.field5729;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "()Z", line = 8)
    public final boolean method999() {
        return this.field2199.field5761 != null;
    }

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "(I)V", line = 12)
    public final void method1000(int arg0) {
        int var2 = this.field2199.method2445(0);
        this.field2204[arg0] += var2;
    }

    @OriginalMember(owner = "client!pd", name = "c", descriptor = "(I)J", line = 16)
    public final long method1001(int arg0) {
        return (long) this.field2207 * (long) arg0 + this.field2201;
    }

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "()V", line = 20)
    public final void method1002() {
        this.field2199.field5729 = -1;
    }

    @OriginalMember(owner = "client!pd", name = "d", descriptor = "(I)V", line = 23)
    public final void method1003(int arg0) {
        this.field2199.field5729 = this.field2202[arg0];
    }

    @OriginalMember(owner = "client!pd", name = "c", descriptor = "()Z", line = 27)
    public final boolean method1004() {
        int var1 = this.field2202.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field2202[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "([B)V", line = 41)
    public final void method1005(byte[] arg0) {
        this.field2199.field5761 = arg0;
        this.field2199.field5729 = 10;
        int var2 = this.field2199.method2386(-23648);
        this.field2206 = this.field2199.method2386(-23648);
        this.field2207 = 500000;
        this.field2200 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var5 = this.field2199.method2406((byte) -105);
            int var6 = this.field2199.method2406((byte) -80);
            if (var5 == 1297379947) {
                this.field2200[var3] = this.field2199.field5729;
                var3++;
            }
            this.field2199.field5729 += var6;
        }
        this.field2201 = 0L;
        this.field2202 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            this.field2202[var4] = this.field2200[var4];
        }
        this.field2204 = new int[var2];
        this.field2203 = new int[var2];
    }

    @OriginalMember(owner = "client!pd", name = "e", descriptor = "(I)I", line = 96)
    public final int method1006(int arg0) {
        return this.method1010(arg0);
    }

    @OriginalMember(owner = "client!pd", name = "d", descriptor = "()V", line = 103)
    public final void method1007() {
        this.field2199.field5761 = null;
        this.field2200 = null;
        this.field2202 = null;
        this.field2204 = null;
        this.field2203 = null;
    }

    @OriginalMember(owner = "client!pd", name = "e", descriptor = "()I", line = 114)
    public final int method1008() {
        int var1 = this.field2202.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field2202[var4] >= 0 && this.field2204[var4] < var3) {
                var2 = var4;
                var3 = this.field2204[var4];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!pd", name = "<init>", descriptor = "()V", line = 264)
    public class171() {
    }

    @OriginalMember(owner = "client!pd", name = "<init>", descriptor = "([B)V", line = 266)
    public class171(byte[] arg0) {
        this.method1005(arg0);
    }

    @OriginalMember(owner = "client!pd", name = "f", descriptor = "()V", line = 147)
    public static void method1009() {
        field2205 = null;
    }

    @OriginalMember(owner = "client!pd", name = "f", descriptor = "(I)I", line = 152)
    private final int method1010(int arg0) {
        byte var2 = this.field2199.field5761[this.field2199.field5729];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field2203[arg0] = var3;
            this.field2199.field5729++;
        } else {
            var3 = this.field2203[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method1011(arg0, var3);
        }
        int var4 = this.field2199.method2445(0);
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field2199.field5761[this.field2199.field5729] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field2199.field5729++;
                this.field2203[arg0] = var5;
                return this.method1011(arg0, var5);
            }
        }
        this.field2199.field5729 += var4;
        return 0;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(II)I", line = 190)
    private final int method1011(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field2205[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field2199.method2388((byte) -116) << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field2199.method2388((byte) -127) << 16;
            }
            return var8;
        }
        int var3 = this.field2199.method2388((byte) -124);
        int var4 = this.field2199.method2445(0);
        if (var3 == 47) {
            this.field2199.field5729 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field2199.method2396((byte) -27);
            var4 -= 3;
            int var6 = this.field2204[arg0];
            this.field2201 += (long) (this.field2207 - var5) * (long) var6;
            this.field2207 = var5;
            this.field2199.field5729 += var4;
            return 2;
        } else {
            this.field2199.field5729 += var4;
            return 3;
        }
    }

    @OriginalMember(owner = "client!pd", name = "g", descriptor = "()I", line = 234)
    public final int method1012() {
        return this.field2202.length;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(J)V", line = 240)
    public final void method1013(long arg0) {
        this.field2201 = arg0;
        int var3 = this.field2202.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2204[var4] = 0;
            this.field2203[var4] = 0;
            this.field2199.field5729 = this.field2200[var4];
            this.method1000(var4);
            this.field2202[var4] = this.field2199.field5729;
        }
    }
}
