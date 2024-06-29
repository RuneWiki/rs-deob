import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!go")
public class class183 {

    @OriginalMember(owner = "client!go", name = "a", descriptor = "Lat;")
    private class256 field2566 = new class256((byte[]) null);

    @OriginalMember(owner = "client!go", name = "b", descriptor = "[B")
    private static byte[] field2567 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!go", name = "h", descriptor = "I")
    private int field2573;

    @OriginalMember(owner = "client!go", name = "i", descriptor = "I")
    public int field2574;

    @OriginalMember(owner = "client!go", name = "d", descriptor = "J")
    private long field2569;

    @OriginalMember(owner = "client!go", name = "c", descriptor = "[I")
    public int[] field2568;

    @OriginalMember(owner = "client!go", name = "e", descriptor = "[I")
    private int[] field2570;

    @OriginalMember(owner = "client!go", name = "f", descriptor = "[I")
    private int[] field2571;

    @OriginalMember(owner = "client!go", name = "g", descriptor = "[I")
    private int[] field2572;

    @OriginalMember(owner = "client!go", name = "a", descriptor = "()I", line = 4)
    public final int method1250() {
        return this.field2571.length;
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(I)V", line = 8)
    public final void method1251(int arg0) {
        int var2 = this.field2566.method1735((byte) 100);
        this.field2568[arg0] += var2;
    }

    @OriginalMember(owner = "client!go", name = "b", descriptor = "()V", line = 12)
    public final void method1252() {
        this.field2566.field3764 = null;
        this.field2572 = null;
        this.field2571 = null;
        this.field2568 = null;
        this.field2570 = null;
    }

    @OriginalMember(owner = "client!go", name = "b", descriptor = "(I)V", line = 22)
    public final void method1253(int arg0) {
        this.field2566.field3762 = this.field2571[arg0];
    }

    @OriginalMember(owner = "client!go", name = "c", descriptor = "()V", line = 26)
    public static void method1254() {
        field2567 = null;
    }

    @OriginalMember(owner = "client!go", name = "c", descriptor = "(I)V", line = 29)
    public final void method1255(int arg0) {
        this.field2571[arg0] = this.field2566.field3762;
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(II)I", line = 36)
    private final int method1256(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field2567[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field2566.method1738((byte) -116) << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field2566.method1738((byte) 90) << 16;
            }
            return var8;
        }
        int var3 = this.field2566.method1738((byte) -71);
        int var4 = this.field2566.method1735((byte) 100);
        if (var3 == 47) {
            this.field2566.field3762 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field2566.method1725((byte) 0);
            var4 -= 3;
            int var6 = this.field2568[arg0];
            this.field2569 += (long) (this.field2573 - var5) * (long) var6;
            this.field2573 = var5;
            this.field2566.field3762 += var4;
            return 2;
        } else {
            this.field2566.field3762 += var4;
            return 3;
        }
    }

    @OriginalMember(owner = "client!go", name = "d", descriptor = "()Z", line = 79)
    public final boolean method1257() {
        return this.field2566.field3764 != null;
    }

    @OriginalMember(owner = "client!go", name = "d", descriptor = "(I)I", line = 83)
    private final int method1258(int arg0) {
        byte var2 = this.field2566.field3764[this.field2566.field3762];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field2570[arg0] = var3;
            this.field2566.field3762++;
        } else {
            var3 = this.field2570[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method1256(arg0, var3);
        }
        int var4 = this.field2566.method1735((byte) 100);
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field2566.field3764[this.field2566.field3762] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field2566.field3762++;
                this.field2570[arg0] = var5;
                return this.method1256(arg0, var5);
            }
        }
        this.field2566.field3762 += var4;
        return 0;
    }

    @OriginalMember(owner = "client!go", name = "e", descriptor = "()Z", line = 122)
    public final boolean method1259() {
        int var1 = this.field2571.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field2571[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!go", name = "e", descriptor = "(I)I", line = 137)
    public final int method1260(int arg0) {
        return this.method1258(arg0);
    }

    @OriginalMember(owner = "client!go", name = "f", descriptor = "(I)J", line = 145)
    public final long method1261(int arg0) {
        return (long) this.field2573 * (long) arg0 + this.field2569;
    }

    @OriginalMember(owner = "client!go", name = "f", descriptor = "()V", line = 150)
    public final void method1262() {
        this.field2566.field3762 = -1;
    }

    @OriginalMember(owner = "client!go", name = "g", descriptor = "()I", line = 158)
    public final int method1263() {
        int var1 = this.field2571.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field2571[var4] >= 0 && this.field2568[var4] < var3) {
                var2 = var4;
                var3 = this.field2568[var4];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "([B)V", line = 183)
    public final void method1264(byte[] arg0) {
        this.field2566.field3764 = arg0;
        this.field2566.field3762 = 10;
        int var2 = this.field2566.method1767(1930493576);
        this.field2574 = this.field2566.method1767(1930493576);
        this.field2573 = 500000;
        this.field2572 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var5 = this.field2566.method1746(20972);
            int var6 = this.field2566.method1746(20972);
            if (var5 == 1297379947) {
                this.field2572[var3] = this.field2566.field3762;
                var3++;
            }
            this.field2566.field3762 += var6;
        }
        this.field2569 = 0L;
        this.field2571 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            this.field2571[var4] = this.field2572[var4];
        }
        this.field2568 = new int[var2];
        this.field2570 = new int[var2];
    }

    @OriginalMember(owner = "client!go", name = "<init>", descriptor = "()V", line = 264)
    public class183() {
    }

    @OriginalMember(owner = "client!go", name = "<init>", descriptor = "([B)V", line = 266)
    public class183(byte[] arg0) {
        this.method1264(arg0);
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(J)V", line = 246)
    public final void method1265(long arg0) {
        this.field2569 = arg0;
        int var3 = this.field2571.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2568[var4] = 0;
            this.field2570[var4] = 0;
            this.field2566.field3762 = this.field2572[var4];
            this.method1251(var4);
            this.field2571[var4] = this.field2566.field3762;
        }
    }
}
