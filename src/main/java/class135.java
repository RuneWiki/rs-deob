import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rn")
public class class135 {

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "Lrg;")
    private class366 field2009 = new class366((byte[]) null);

    @OriginalMember(owner = "client!rn", name = "i", descriptor = "[B")
    private static byte[] field2017 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!rn", name = "b", descriptor = "I")
    private int field2010;

    @OriginalMember(owner = "client!rn", name = "d", descriptor = "I")
    public int field2012;

    @OriginalMember(owner = "client!rn", name = "f", descriptor = "J")
    private long field2014;

    @OriginalMember(owner = "client!rn", name = "c", descriptor = "[I")
    private int[] field2011;

    @OriginalMember(owner = "client!rn", name = "e", descriptor = "[I")
    private int[] field2013;

    @OriginalMember(owner = "client!rn", name = "g", descriptor = "[I")
    private int[] field2015;

    @OriginalMember(owner = "client!rn", name = "h", descriptor = "[I")
    public int[] field2016;

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "([B)V", line = 4)
    public final void method1000(byte[] arg0) {
        this.field2009.field5076 = arg0;
        this.field2009.field5048 = 10;
        int var2 = this.field2009.method2297(13352);
        this.field2012 = this.field2009.method2297(13352);
        this.field2010 = 500000;
        this.field2013 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var5 = this.field2009.method2258(1177515464);
            int var6 = this.field2009.method2258(1177515464);
            if (var5 == 1297379947) {
                this.field2013[var3] = this.field2009.field5048;
                var3++;
            }
            this.field2009.field5048 += var6;
        }
        this.field2014 = 0L;
        this.field2015 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            this.field2015[var4] = this.field2013[var4];
        }
        this.field2016 = new int[var2];
        this.field2011 = new int[var2];
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "()V", line = 64)
    public final void method1001() {
        this.field2009.field5048 = -1;
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(I)I", line = 68)
    private final int method1002(int arg0) {
        byte var2 = this.field2009.field5076[this.field2009.field5048];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field2011[arg0] = var3;
            this.field2009.field5048++;
        } else {
            var3 = this.field2011[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method1005(arg0, var3);
        }
        int var4 = this.field2009.method2253(2081600583);
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field2009.field5076[this.field2009.field5048] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field2009.field5048++;
                this.field2011[arg0] = var5;
                return this.method1005(arg0, var5);
            }
        }
        this.field2009.field5048 += var4;
        return 0;
    }

    @OriginalMember(owner = "client!rn", name = "b", descriptor = "()Z", line = 109)
    public final boolean method1003() {
        int var1 = this.field2015.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field2015[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!rn", name = "b", descriptor = "(I)I", line = 124)
    public final int method1004(int arg0) {
        return this.method1002(arg0);
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(II)I", line = 130)
    private final int method1005(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field2017[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field2009.method2306((byte) 25) << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field2009.method2306((byte) 85) << 16;
            }
            return var8;
        }
        int var3 = this.field2009.method2306((byte) 39);
        int var4 = this.field2009.method2253(2081600583);
        if (var3 == 47) {
            this.field2009.field5048 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field2009.method2263((byte) 10);
            var4 -= 3;
            int var6 = this.field2016[arg0];
            this.field2014 += (long) (this.field2010 - var5) * (long) var6;
            this.field2010 = var5;
            this.field2009.field5048 += var4;
            return 2;
        } else {
            this.field2009.field5048 += var4;
            return 3;
        }
    }

    @OriginalMember(owner = "client!rn", name = "c", descriptor = "()I", line = 173)
    public final int method1006() {
        return this.field2015.length;
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(J)V", line = 176)
    public final void method1007(long arg0) {
        this.field2014 = arg0;
        int var3 = this.field2015.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2016[var4] = 0;
            this.field2011[var4] = 0;
            this.field2009.field5048 = this.field2013[var4];
            this.method1010(var4);
            this.field2015[var4] = this.field2009.field5048;
        }
    }

    @OriginalMember(owner = "client!rn", name = "c", descriptor = "(I)V", line = 194)
    public final void method1008(int arg0) {
        this.field2009.field5048 = this.field2015[arg0];
    }

    @OriginalMember(owner = "client!rn", name = "d", descriptor = "(I)V", line = 197)
    public final void method1009(int arg0) {
        this.field2015[arg0] = this.field2009.field5048;
    }

    @OriginalMember(owner = "client!rn", name = "e", descriptor = "(I)V", line = 201)
    public final void method1010(int arg0) {
        int var2 = this.field2009.method2253(2081600583);
        this.field2016[arg0] += var2;
    }

    @OriginalMember(owner = "client!rn", name = "d", descriptor = "()I", line = 206)
    public final int method1011() {
        int var1 = this.field2015.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field2015[var4] >= 0 && this.field2016[var4] < var3) {
                var2 = var4;
                var3 = this.field2016[var4];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!rn", name = "f", descriptor = "(I)J", line = 231)
    public final long method1012(int arg0) {
        return (long) this.field2010 * (long) arg0 + this.field2014;
    }

    @OriginalMember(owner = "client!rn", name = "<init>", descriptor = "()V", line = 257)
    public class135() {
    }

    @OriginalMember(owner = "client!rn", name = "<init>", descriptor = "([B)V", line = 259)
    public class135(byte[] arg0) {
        this.method1000(arg0);
    }

    @OriginalMember(owner = "client!rn", name = "e", descriptor = "()V", line = 237)
    public final void method1013() {
        this.field2009.field5076 = null;
        this.field2013 = null;
        this.field2015 = null;
        this.field2016 = null;
        this.field2011 = null;
    }

    @OriginalMember(owner = "client!rn", name = "f", descriptor = "()V", line = 254)
    public static void method1014() {
        field2017 = null;
    }

    @OriginalMember(owner = "client!rn", name = "g", descriptor = "()Z", line = 267)
    public final boolean method1015() {
        return this.field2009.field5076 != null;
    }
}
