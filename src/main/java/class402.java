import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kq")
public class class402 {

    @OriginalMember(owner = "client!kq", name = "b", descriptor = "Lae;")
    private class156 field5924 = new class156(null);

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "[B")
    private static byte[] field5923 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!kq", name = "g", descriptor = "I")
    public int field5929;

    @OriginalMember(owner = "client!kq", name = "h", descriptor = "I")
    private int field5930;

    @OriginalMember(owner = "client!kq", name = "e", descriptor = "J")
    private long field5927;

    @OriginalMember(owner = "client!kq", name = "c", descriptor = "[I")
    private int[] field5925;

    @OriginalMember(owner = "client!kq", name = "d", descriptor = "[I")
    private int[] field5926;

    @OriginalMember(owner = "client!kq", name = "f", descriptor = "[I")
    private int[] field5928;

    @OriginalMember(owner = "client!kq", name = "i", descriptor = "[I")
    public int[] field5931;

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "()V", line = 3)
    public final void method2401() {
        this.field5924.field2018 = -1;
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(I)I", line = 10)
    private final int method2402(int arg0) {
        byte var2 = this.field5924.field2041[this.field5924.field2018];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field5926[arg0] = var3;
            this.field5924.field2018++;
        } else {
            var3 = this.field5926[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method2413(arg0, var3);
        }
        int var4 = this.field5924.method968(-1);
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field5924.field2041[this.field5924.field2018] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field5924.field2018++;
                this.field5926[arg0] = var5;
                return this.method2413(arg0, var5);
            }
        }
        this.field5924.field2018 += var4;
        return 0;
    }

    @OriginalMember(owner = "client!kq", name = "b", descriptor = "(I)V", line = 48)
    public final void method2403(int arg0) {
        this.field5925[arg0] = this.field5924.field2018;
    }

    @OriginalMember(owner = "client!kq", name = "c", descriptor = "(I)V", line = 52)
    public final void method2404(int arg0) {
        int var2 = this.field5924.method968(-1);
        this.field5931[arg0] += var2;
    }

    @OriginalMember(owner = "client!kq", name = "d", descriptor = "(I)V", line = 56)
    public final void method2405(int arg0) {
        this.field5924.field2018 = this.field5925[arg0];
    }

    @OriginalMember(owner = "client!kq", name = "b", descriptor = "()Z", line = 60)
    public final boolean method2406() {
        int var1 = this.field5925.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field5925[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "([B)V", line = 75)
    public final void method2407(byte[] arg0) {
        this.field5924.field2041 = arg0;
        this.field5924.field2018 = 10;
        int var2 = this.field5924.method993((byte) -110);
        this.field5929 = this.field5924.method993((byte) -107);
        this.field5930 = 500000;
        this.field5928 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var5 = this.field5924.method950(186);
            int var6 = this.field5924.method950(186);
            if (var5 == 1297379947) {
                this.field5928[var3] = this.field5924.field2018;
                var3++;
            }
            this.field5924.field2018 += var6;
        }
        this.field5927 = 0L;
        this.field5925 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            this.field5925[var4] = this.field5928[var4];
        }
        this.field5931 = new int[var2];
        this.field5926 = new int[var2];
    }

    @OriginalMember(owner = "client!kq", name = "e", descriptor = "(I)J", line = 129)
    public final long method2408(int arg0) {
        return (long) this.field5930 * (long) arg0 + this.field5927;
    }

    @OriginalMember(owner = "client!kq", name = "c", descriptor = "()I", line = 134)
    public final int method2409() {
        int var1 = this.field5925.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field5925[var4] >= 0 && this.field5931[var4] < var3) {
                var2 = var4;
                var3 = this.field5931[var4];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!kq", name = "d", descriptor = "()I", line = 159)
    public final int method2410() {
        return this.field5925.length;
    }

    @OriginalMember(owner = "client!kq", name = "f", descriptor = "(I)I", line = 163)
    public final int method2411(int arg0) {
        return this.method2402(arg0);
    }

    @OriginalMember(owner = "client!kq", name = "e", descriptor = "()Z", line = 169)
    public final boolean method2412() {
        return this.field5924.field2041 != null;
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(II)I", line = 175)
    private final int method2413(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field5923[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field5924.method941((byte) 127) << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field5924.method941((byte) 127) << 16;
            }
            return var8;
        }
        int var3 = this.field5924.method941((byte) 125);
        int var4 = this.field5924.method968(-1);
        if (var3 == 47) {
            this.field5924.field2018 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field5924.method943(1295851312);
            var4 -= 3;
            int var6 = this.field5931[arg0];
            this.field5927 += (long) (this.field5930 - var5) * (long) var6;
            this.field5930 = var5;
            this.field5924.field2018 += var4;
            return 2;
        } else {
            this.field5924.field2018 += var4;
            return 3;
        }
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(J)V", line = 219)
    public final void method2414(long arg0) {
        this.field5927 = arg0;
        int var3 = this.field5925.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field5931[var4] = 0;
            this.field5926[var4] = 0;
            this.field5924.field2018 = this.field5928[var4];
            this.method2404(var4);
            this.field5925[var4] = this.field5924.field2018;
        }
    }

    @OriginalMember(owner = "client!kq", name = "f", descriptor = "()V", line = 238)
    public static void method2415() {
        field5923 = null;
    }

    @OriginalMember(owner = "client!kq", name = "g", descriptor = "()V", line = 245)
    public final void method2416() {
        this.field5924.field2041 = null;
        this.field5928 = null;
        this.field5925 = null;
        this.field5931 = null;
        this.field5926 = null;
    }

    @OriginalMember(owner = "client!kq", name = "<init>", descriptor = "()V", line = 264)
    public class402() {
    }

    @OriginalMember(owner = "client!kq", name = "<init>", descriptor = "([B)V", line = 266)
    public class402(byte[] arg0) {
        this.method2407(arg0);
    }
}
