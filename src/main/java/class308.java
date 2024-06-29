import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ge")
public class class308 {

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "Lbb;")
    private class134 field5225 = new class134((byte[]) null);

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "[B")
    private static byte[] field5224 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!ge", name = "h", descriptor = "I")
    public int field5231;

    @OriginalMember(owner = "client!ge", name = "i", descriptor = "I")
    private int field5232;

    @OriginalMember(owner = "client!ge", name = "c", descriptor = "J")
    private long field5226;

    @OriginalMember(owner = "client!ge", name = "d", descriptor = "[I")
    public int[] field5227;

    @OriginalMember(owner = "client!ge", name = "e", descriptor = "[I")
    private int[] field5228;

    @OriginalMember(owner = "client!ge", name = "f", descriptor = "[I")
    private int[] field5229;

    @OriginalMember(owner = "client!ge", name = "g", descriptor = "[I")
    private int[] field5230;

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "()Z", line = 5)
    public final boolean method2094() {
        int var1 = this.field5228.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field5228[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "()I", line = 19)
    public final int method2095() {
        int var1 = this.field5228.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field5228[var4] >= 0 && this.field5227[var4] < var3) {
                var2 = var4;
                var3 = this.field5227[var4];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(J)V", line = 45)
    public final void method2096(long arg0) {
        this.field5226 = arg0;
        int var3 = this.field5228.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field5227[var4] = 0;
            this.field5230[var4] = 0;
            this.field5225.field2299 = this.field5229[var4];
            this.method2097(var4);
            this.field5228[var4] = this.field5225.field2299;
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(I)V", line = 65)
    public final void method2097(int arg0) {
        int var2 = this.field5225.method958(255);
        this.field5227[arg0] += var2;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(II)I", line = 72)
    private final int method2098(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field5224[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field5225.method948(-123) << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field5225.method948(-124) << 16;
            }
            return var8;
        }
        int var3 = this.field5225.method948(-122);
        int var4 = this.field5225.method958(255);
        if (var3 == 47) {
            this.field5225.field2299 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field5225.method949(20732);
            var4 -= 3;
            int var6 = this.field5227[arg0];
            this.field5226 += (long) (this.field5232 - var5) * (long) var6;
            this.field5232 = var5;
            this.field5225.field2299 += var4;
            return 2;
        } else {
            this.field5225.field2299 += var4;
            return 3;
        }
    }

    @OriginalMember(owner = "client!ge", name = "c", descriptor = "()V", line = 114)
    public static void method2099() {
        field5224 = null;
    }

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "(I)V", line = 120)
    public final void method2100(int arg0) {
        this.field5228[arg0] = this.field5225.field2299;
    }

    @OriginalMember(owner = "client!ge", name = "c", descriptor = "(I)I", line = 124)
    public final int method2101(int arg0) {
        return this.method2104(arg0);
    }

    @OriginalMember(owner = "client!ge", name = "d", descriptor = "(I)J", line = 130)
    public final long method2102(int arg0) {
        return (long) this.field5232 * (long) arg0 + this.field5226;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "([B)V", line = 133)
    public final void method2103(byte[] arg0) {
        this.field5225.field2282 = arg0;
        this.field5225.field2299 = 10;
        int var2 = this.field5225.method942(true);
        this.field5231 = this.field5225.method942(true);
        this.field5232 = 500000;
        this.field5229 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field5225.method957(496113200);
            int var5 = this.field5225.method957(496113200);
            if (var4 == 1297379947) {
                this.field5229[var3] = this.field5225.field2299;
                var3++;
            }
            this.field5225.field2299 += var5;
        }
        this.field5226 = 0L;
        this.field5228 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field5228[var6] = this.field5229[var6];
        }
        this.field5227 = new int[var2];
        this.field5230 = new int[var2];
    }

    @OriginalMember(owner = "client!ge", name = "e", descriptor = "(I)I", line = 187)
    private final int method2104(int arg0) {
        byte var2 = this.field5225.field2282[this.field5225.field2299];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field5230[arg0] = var3;
            this.field5225.field2299++;
        } else {
            var3 = this.field5230[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method2098(arg0, var3);
        }
        int var4 = this.field5225.method958(255);
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field5225.field2282[this.field5225.field2299] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field5225.field2299++;
                this.field5230[arg0] = var5;
                return this.method2098(arg0, var5);
            }
        }
        this.field5225.field2299 += var4;
        return 0;
    }

    @OriginalMember(owner = "client!ge", name = "d", descriptor = "()Z", line = 225)
    public final boolean method2105() {
        return this.field5225.field2282 != null;
    }

    @OriginalMember(owner = "client!ge", name = "e", descriptor = "()I", line = 231)
    public final int method2106() {
        return this.field5228.length;
    }

    @OriginalMember(owner = "client!ge", name = "f", descriptor = "()V", line = 236)
    public final void method2107() {
        this.field5225.field2282 = null;
        this.field5229 = null;
        this.field5228 = null;
        this.field5227 = null;
        this.field5230 = null;
    }

    @OriginalMember(owner = "client!ge", name = "f", descriptor = "(I)V", line = 245)
    public final void method2108(int arg0) {
        this.field5225.field2299 = this.field5228[arg0];
    }

    @OriginalMember(owner = "client!ge", name = "g", descriptor = "()V", line = 248)
    public final void method2109() {
        this.field5225.field2299 = -1;
    }

    @OriginalMember(owner = "client!ge", name = "<init>", descriptor = "()V", line = 264)
    public class308() {
    }

    @OriginalMember(owner = "client!ge", name = "<init>", descriptor = "([B)V", line = 266)
    public class308(byte[] arg0) {
        this.method2103(arg0);
    }
}
