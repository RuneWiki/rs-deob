import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wf")
public class class146 {

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "Ldt;")
    private class254 field1971 = new class254(null);

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "[B")
    private static byte[] field1972 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!wf", name = "d", descriptor = "I")
    private int field1974;

    @OriginalMember(owner = "client!wf", name = "f", descriptor = "I")
    public int field1976;

    @OriginalMember(owner = "client!wf", name = "h", descriptor = "J")
    private long field1978;

    @OriginalMember(owner = "client!wf", name = "c", descriptor = "[I")
    private int[] field1973;

    @OriginalMember(owner = "client!wf", name = "e", descriptor = "[I")
    private int[] field1975;

    @OriginalMember(owner = "client!wf", name = "g", descriptor = "[I")
    public int[] field1977;

    @OriginalMember(owner = "client!wf", name = "i", descriptor = "[I")
    private int[] field1979;

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(I)I", line = 5)
    private final int method1017(int arg0) {
        byte var2 = this.field1971.field3789[this.field1971.field3725];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field1979[arg0] = var3;
            this.field1971.field3725++;
        } else {
            var3 = this.field1979[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method1020(arg0, var3);
        }
        int var4 = this.field1971.method1702(true);
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field1971.field3789[this.field1971.field3725] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field1971.field3725++;
                this.field1979[arg0] = var5;
                return this.method1020(arg0, var5);
            }
        }
        this.field1971.field3725 += var4;
        return 0;
    }

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "(I)V", line = 45)
    public final void method1018(int arg0) {
        int var2 = this.field1971.method1702(true);
        this.field1977[arg0] += var2;
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "([B)V", line = 50)
    public final void method1019(byte[] arg0) {
        this.field1971.field3789 = arg0;
        this.field1971.field3725 = 10;
        int var2 = this.field1971.method1728((byte) 51);
        this.field1976 = this.field1971.method1728((byte) 15);
        this.field1974 = 500000;
        this.field1973 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var5 = this.field1971.method1672(-16516);
            int var6 = this.field1971.method1672(-16516);
            if (var5 == 1297379947) {
                this.field1973[var3] = this.field1971.field3725;
                var3++;
            }
            this.field1971.field3725 += var6;
        }
        this.field1978 = 0L;
        this.field1975 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            this.field1975[var4] = this.field1973[var4];
        }
        this.field1977 = new int[var2];
        this.field1979 = new int[var2];
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(II)I", line = 104)
    private final int method1020(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field1972[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field1971.method1731((byte) 64) << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field1971.method1731((byte) 64) << 16;
            }
            return var8;
        }
        int var3 = this.field1971.method1731((byte) 64);
        int var4 = this.field1971.method1702(true);
        if (var3 == 47) {
            this.field1971.field3725 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field1971.method1722(false);
            var4 -= 3;
            int var6 = this.field1977[arg0];
            this.field1978 += (long) (this.field1974 - var5) * (long) var6;
            this.field1974 = var5;
            this.field1971.field3725 += var4;
            return 2;
        } else {
            this.field1971.field3725 += var4;
            return 3;
        }
    }

    @OriginalMember(owner = "client!wf", name = "c", descriptor = "(I)J", line = 146)
    public final long method1021(int arg0) {
        return (long) this.field1974 * (long) arg0 + this.field1978;
    }

    @OriginalMember(owner = "client!wf", name = "d", descriptor = "(I)V", line = 151)
    public final void method1022(int arg0) {
        this.field1975[arg0] = this.field1971.field3725;
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(J)V", line = 155)
    public final void method1023(long arg0) {
        this.field1978 = arg0;
        int var3 = this.field1975.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field1977[var4] = 0;
            this.field1979[var4] = 0;
            this.field1971.field3725 = this.field1973[var4];
            this.method1018(var4);
            this.field1975[var4] = this.field1971.field3725;
        }
    }

    @OriginalMember(owner = "client!wf", name = "<init>", descriptor = "()V", line = 264)
    public class146() {
    }

    @OriginalMember(owner = "client!wf", name = "<init>", descriptor = "([B)V", line = 266)
    public class146(byte[] arg0) {
        this.method1019(arg0);
    }

    @OriginalMember(owner = "client!wf", name = "e", descriptor = "(I)V", line = 179)
    public final void method1024(int arg0) {
        this.field1971.field3725 = this.field1975[arg0];
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "()Z", line = 185)
    public final boolean method1025() {
        int var1 = this.field1975.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field1975[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "()V", line = 198)
    public final void method1026() {
        this.field1971.field3789 = null;
        this.field1973 = null;
        this.field1975 = null;
        this.field1977 = null;
        this.field1979 = null;
    }

    @OriginalMember(owner = "client!wf", name = "f", descriptor = "(I)I", line = 214)
    public final int method1027(int arg0) {
        return this.method1017(arg0);
    }

    @OriginalMember(owner = "client!wf", name = "c", descriptor = "()Z", line = 220)
    public final boolean method1028() {
        return this.field1971.field3789 != null;
    }

    @OriginalMember(owner = "client!wf", name = "d", descriptor = "()I", line = 226)
    public final int method1029() {
        return this.field1975.length;
    }

    @OriginalMember(owner = "client!wf", name = "e", descriptor = "()V", line = 229)
    public final void method1030() {
        this.field1971.field3725 = -1;
    }

    @OriginalMember(owner = "client!wf", name = "f", descriptor = "()I", line = 237)
    public final int method1031() {
        int var1 = this.field1975.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field1975[var4] >= 0 && this.field1977[var4] < var3) {
                var2 = var4;
                var3 = this.field1977[var4];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!wf", name = "g", descriptor = "()V", line = 262)
    public static void method1032() {
        field1972 = null;
    }
}
