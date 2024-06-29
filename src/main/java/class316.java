import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eg")
public class class316 {

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "Lim;")
    private class192 field4913 = new class192((byte[]) null);

    @OriginalMember(owner = "client!eg", name = "b", descriptor = "[B")
    private static byte[] field4914 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!eg", name = "e", descriptor = "I")
    public int field4917;

    @OriginalMember(owner = "client!eg", name = "f", descriptor = "I")
    private int field4918;

    @OriginalMember(owner = "client!eg", name = "c", descriptor = "J")
    private long field4915;

    @OriginalMember(owner = "client!eg", name = "d", descriptor = "[I")
    private int[] field4916;

    @OriginalMember(owner = "client!eg", name = "g", descriptor = "[I")
    private int[] field4919;

    @OriginalMember(owner = "client!eg", name = "h", descriptor = "[I")
    private int[] field4920;

    @OriginalMember(owner = "client!eg", name = "i", descriptor = "[I")
    public int[] field4921;

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "()Z", line = 3)
    public final boolean method2194() {
        return this.field4913.field3128 != null;
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(J)V", line = 6)
    public final void method2195(long arg0) {
        this.field4915 = arg0;
        int var3 = this.field4916.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field4921[var4] = 0;
            this.field4920[var4] = 0;
            this.field4913.field3129 = this.field4919[var4];
            this.method2207(var4);
            this.field4916[var4] = this.field4913.field3129;
        }
    }

    @OriginalMember(owner = "client!eg", name = "b", descriptor = "()V", line = 25)
    public final void method2196() {
        this.field4913.field3128 = null;
        this.field4919 = null;
        this.field4916 = null;
        this.field4921 = null;
        this.field4920 = null;
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(I)V", line = 34)
    public final void method2197(int arg0) {
        this.field4913.field3129 = this.field4916[arg0];
    }

    @OriginalMember(owner = "client!eg", name = "c", descriptor = "()V", line = 40)
    public static void method2198() {
        field4914 = null;
    }

    @OriginalMember(owner = "client!eg", name = "b", descriptor = "(I)I", line = 44)
    private final int method2199(int arg0) {
        byte var2 = this.field4913.field3128[this.field4913.field3129];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field4920[arg0] = var3;
            this.field4913.field3129++;
        } else {
            var3 = this.field4920[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method2200(arg0, var3);
        }
        int var4 = this.field4913.method1366((byte) -125);
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field4913.field3128[this.field4913.field3129] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field4913.field3129++;
                this.field4920[arg0] = var5;
                return this.method2200(arg0, var5);
            }
        }
        this.field4913.field3129 += var4;
        return 0;
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(II)I", line = 82)
    private final int method2200(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field4914[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field4913.method1399(-1172389784) << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field4913.method1399(-1172389784) << 16;
            }
            return var8;
        }
        int var3 = this.field4913.method1399(-1172389784);
        int var4 = this.field4913.method1366((byte) -128);
        if (var3 == 47) {
            this.field4913.field3129 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field4913.method1378(false);
            var4 -= 3;
            int var6 = this.field4921[arg0];
            this.field4915 += (long) (this.field4918 - var5) * (long) var6;
            this.field4918 = var5;
            this.field4913.field3129 += var4;
            return 2;
        } else {
            this.field4913.field3129 += var4;
            return 3;
        }
    }

    @OriginalMember(owner = "client!eg", name = "d", descriptor = "()I", line = 126)
    public final int method2201() {
        int var1 = this.field4916.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field4916[var4] >= 0 && this.field4921[var4] < var3) {
                var2 = var4;
                var3 = this.field4921[var4];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!eg", name = "c", descriptor = "(I)J", line = 151)
    public final long method2202(int arg0) {
        return (long) this.field4918 * (long) arg0 + this.field4915;
    }

    @OriginalMember(owner = "client!eg", name = "e", descriptor = "()V", line = 156)
    public final void method2203() {
        this.field4913.field3129 = -1;
    }

    @OriginalMember(owner = "client!eg", name = "d", descriptor = "(I)V", line = 159)
    public final void method2204(int arg0) {
        this.field4916[arg0] = this.field4913.field3129;
    }

    @OriginalMember(owner = "client!eg", name = "e", descriptor = "(I)I", line = 164)
    public final int method2205(int arg0) {
        return this.method2199(arg0);
    }

    @OriginalMember(owner = "client!eg", name = "f", descriptor = "()Z", line = 171)
    public final boolean method2206() {
        int var1 = this.field4916.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field4916[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!eg", name = "f", descriptor = "(I)V", line = 185)
    public final void method2207(int arg0) {
        int var2 = this.field4913.method1366((byte) -127);
        this.field4921[arg0] += var2;
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "([B)V", line = 189)
    public final void method2208(byte[] arg0) {
        this.field4913.field3128 = arg0;
        this.field4913.field3129 = 10;
        int var2 = this.field4913.method1396(-120);
        this.field4917 = this.field4913.method1396(-48);
        this.field4918 = 500000;
        this.field4919 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field4913.method1354((byte) -117);
            int var5 = this.field4913.method1354((byte) -121);
            if (var4 == 1297379947) {
                this.field4919[var3] = this.field4913.field3129;
                var3++;
            }
            this.field4913.field3129 += var5;
        }
        this.field4915 = 0L;
        this.field4916 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field4916[var6] = this.field4919[var6];
        }
        this.field4921 = new int[var2];
        this.field4920 = new int[var2];
    }

    @OriginalMember(owner = "client!eg", name = "<init>", descriptor = "()V", line = 264)
    public class316() {
    }

    @OriginalMember(owner = "client!eg", name = "<init>", descriptor = "([B)V", line = 266)
    public class316(byte[] arg0) {
        this.method2208(arg0);
    }

    @OriginalMember(owner = "client!eg", name = "g", descriptor = "()I", line = 259)
    public final int method2209() {
        return this.field4916.length;
    }
}
