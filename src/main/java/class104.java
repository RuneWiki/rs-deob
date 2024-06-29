import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kh")
public class class104 {

    @OriginalMember(owner = "client!kh", name = "b", descriptor = "Lka;")
    private class97 field1896 = new class97(null);

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "[B")
    private static byte[] field1895 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!kh", name = "f", descriptor = "I")
    public int field1900;

    @OriginalMember(owner = "client!kh", name = "h", descriptor = "I")
    private int field1902;

    @OriginalMember(owner = "client!kh", name = "c", descriptor = "J")
    private long field1897;

    @OriginalMember(owner = "client!kh", name = "d", descriptor = "[I")
    private int[] field1898;

    @OriginalMember(owner = "client!kh", name = "e", descriptor = "[I")
    private int[] field1899;

    @OriginalMember(owner = "client!kh", name = "g", descriptor = "[I")
    private int[] field1901;

    @OriginalMember(owner = "client!kh", name = "i", descriptor = "[I")
    public int[] field1903;

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "()I")
    public final int method638() {
        int var1 = this.field1898.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field1898[var4] >= 0 && this.field1903[var4] < var3) {
                var2 = var4;
                var3 = this.field1903[var4];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(I)V")
    public final void method639(int arg0) {
        int var2 = this.field1896.method562(255);
        this.field1903[arg0] += var2;
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(J)V")
    public final void method640(long arg0) {
        this.field1897 = arg0;
        int var3 = this.field1898.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field1903[var4] = 0;
            this.field1901[var4] = 0;
            this.field1896.field1834 = this.field1899[var4];
            this.method639(var4);
            this.field1898[var4] = this.field1896.field1834;
        }
    }

    @OriginalMember(owner = "client!kh", name = "b", descriptor = "()Z")
    public final boolean method641() {
        return this.field1896.field1809 != null;
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(II)I")
    private final int method642(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field1895[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field1896.method588((byte) -96) << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field1896.method588((byte) -108) << 16;
            }
            return var8;
        }
        int var3 = this.field1896.method588((byte) -56);
        int var4 = this.field1896.method562(255);
        if (var3 == 47) {
            this.field1896.field1834 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field1896.method568((byte) -96);
            var4 -= 3;
            int var6 = this.field1903[arg0];
            this.field1897 += (long) (this.field1902 - var5) * (long) var6;
            this.field1902 = var5;
            this.field1896.field1834 += var4;
            return 2;
        } else {
            this.field1896.field1834 += var4;
            return 3;
        }
    }

    @OriginalMember(owner = "client!kh", name = "c", descriptor = "()V")
    public final void method643() {
        this.field1896.field1809 = null;
        this.field1899 = null;
        this.field1898 = null;
        this.field1903 = null;
        this.field1901 = null;
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "([B)V")
    public final void method644(byte[] arg0) {
        this.field1896.field1809 = arg0;
        this.field1896.field1834 = 10;
        int var2 = this.field1896.method611(false);
        this.field1900 = this.field1896.method611(false);
        this.field1902 = 500000;
        this.field1899 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var5 = this.field1896.method599(-16003);
            int var6 = this.field1896.method599(-16003);
            if (var5 == 1297379947) {
                this.field1899[var3] = this.field1896.field1834;
                var3++;
            }
            this.field1896.field1834 += var6;
        }
        this.field1897 = 0L;
        this.field1898 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            this.field1898[var4] = this.field1899[var4];
        }
        this.field1903 = new int[var2];
        this.field1901 = new int[var2];
    }

    @OriginalMember(owner = "client!kh", name = "d", descriptor = "()I")
    public final int method645() {
        return this.field1898.length;
    }

    @OriginalMember(owner = "client!kh", name = "b", descriptor = "(I)V")
    public final void method646(int arg0) {
        this.field1896.field1834 = this.field1898[arg0];
    }

    @OriginalMember(owner = "client!kh", name = "e", descriptor = "()V")
    public static void method647() {
        field1895 = null;
    }

    @OriginalMember(owner = "client!kh", name = "f", descriptor = "()V")
    public final void method648() {
        this.field1896.field1834 = -1;
    }

    @OriginalMember(owner = "client!kh", name = "c", descriptor = "(I)V")
    public final void method649(int arg0) {
        this.field1898[arg0] = this.field1896.field1834;
    }

    @OriginalMember(owner = "client!kh", name = "d", descriptor = "(I)I")
    private final int method650(int arg0) {
        byte var2 = this.field1896.field1809[this.field1896.field1834];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field1901[arg0] = var3;
            this.field1896.field1834++;
        } else {
            var3 = this.field1901[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method642(arg0, var3);
        }
        int var4 = this.field1896.method562(255);
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field1896.field1809[this.field1896.field1834] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field1896.field1834++;
                this.field1901[arg0] = var5;
                return this.method642(arg0, var5);
            }
        }
        this.field1896.field1834 += var4;
        return 0;
    }

    @OriginalMember(owner = "client!kh", name = "e", descriptor = "(I)J")
    public final long method651(int arg0) {
        return (long) this.field1902 * (long) arg0 + this.field1897;
    }

    @OriginalMember(owner = "client!kh", name = "f", descriptor = "(I)I")
    public final int method652(int arg0) {
        return this.method650(arg0);
    }

    @OriginalMember(owner = "client!kh", name = "g", descriptor = "()Z")
    public final boolean method653() {
        int var1 = this.field1898.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field1898[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!kh", name = "<init>", descriptor = "()V")
    public class104() {
    }

    @OriginalMember(owner = "client!kh", name = "<init>", descriptor = "([B)V")
    public class104(byte[] arg0) {
        this.method644(arg0);
    }
}
