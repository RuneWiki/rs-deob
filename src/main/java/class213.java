import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kl")
public class class213 {

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "Llk;")
    private class425 field3009 = new class425((byte[]) null);

    @OriginalMember(owner = "client!kl", name = "b", descriptor = "[B")
    private static byte[] field3010 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!kl", name = "h", descriptor = "I")
    private int field3016;

    @OriginalMember(owner = "client!kl", name = "i", descriptor = "I")
    public int field3017;

    @OriginalMember(owner = "client!kl", name = "d", descriptor = "J")
    private long field3012;

    @OriginalMember(owner = "client!kl", name = "c", descriptor = "[I")
    private int[] field3011;

    @OriginalMember(owner = "client!kl", name = "e", descriptor = "[I")
    private int[] field3013;

    @OriginalMember(owner = "client!kl", name = "f", descriptor = "[I")
    private int[] field3014;

    @OriginalMember(owner = "client!kl", name = "g", descriptor = "[I")
    public int[] field3015;

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "()V", line = 3)
    public final void method1334() {
        this.field3009.field5886 = null;
        this.field3013 = null;
        this.field3011 = null;
        this.field3015 = null;
        this.field3014 = null;
    }

    @OriginalMember(owner = "client!kl", name = "b", descriptor = "()Z", line = 13)
    public final boolean method1335() {
        int var1 = this.field3011.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field3011[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!kl", name = "c", descriptor = "()V", line = 26)
    public static void method1336() {
        field3010 = null;
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(I)J", line = 32)
    public final long method1337(int arg0) {
        return (long) this.field3016 * (long) arg0 + this.field3012;
    }

    @OriginalMember(owner = "client!kl", name = "b", descriptor = "(I)I", line = 36)
    private final int method1338(int arg0) {
        byte var2 = this.field3009.field5886[this.field3009.field5830];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field3014[arg0] = var3;
            this.field3009.field5830++;
        } else {
            var3 = this.field3014[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method1348(arg0, var3);
        }
        int var4 = this.field3009.method2476((byte) -75);
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field3009.field5886[this.field3009.field5830] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field3009.field5830++;
                this.field3014[arg0] = var5;
                return this.method1348(arg0, var5);
            }
        }
        this.field3009.field5830 += var4;
        return 0;
    }

    @OriginalMember(owner = "client!kl", name = "d", descriptor = "()V", line = 74)
    public final void method1339() {
        this.field3009.field5830 = -1;
    }

    @OriginalMember(owner = "client!kl", name = "e", descriptor = "()Z", line = 77)
    public final boolean method1340() {
        return this.field3009.field5886 != null;
    }

    @OriginalMember(owner = "client!kl", name = "f", descriptor = "()I", line = 82)
    public final int method1341() {
        int var1 = this.field3011.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field3011[var4] >= 0 && this.field3015[var4] < var3) {
                var2 = var4;
                var3 = this.field3015[var4];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(J)V", line = 108)
    public final void method1342(long arg0) {
        this.field3012 = arg0;
        int var3 = this.field3011.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field3015[var4] = 0;
            this.field3014[var4] = 0;
            this.field3009.field5830 = this.field3013[var4];
            this.method1346(var4);
            this.field3011[var4] = this.field3009.field5830;
        }
    }

    @OriginalMember(owner = "client!kl", name = "c", descriptor = "(I)V", line = 129)
    public final void method1343(int arg0) {
        this.field3011[arg0] = this.field3009.field5830;
    }

    @OriginalMember(owner = "client!kl", name = "d", descriptor = "(I)V", line = 133)
    public final void method1344(int arg0) {
        this.field3009.field5830 = this.field3011[arg0];
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "([B)V", line = 137)
    public final void method1345(byte[] arg0) {
        this.field3009.field5886 = arg0;
        this.field3009.field5830 = 10;
        int var2 = this.field3009.method2508(true);
        this.field3017 = this.field3009.method2508(true);
        this.field3016 = 500000;
        this.field3013 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var5 = this.field3009.method2502((byte) -86);
            int var6 = this.field3009.method2502((byte) -86);
            if (var5 == 1297379947) {
                this.field3013[var3] = this.field3009.field5830;
                var3++;
            }
            this.field3009.field5830 += var6;
        }
        this.field3012 = 0L;
        this.field3011 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            this.field3011[var4] = this.field3013[var4];
        }
        this.field3015 = new int[var2];
        this.field3014 = new int[var2];
    }

    @OriginalMember(owner = "client!kl", name = "e", descriptor = "(I)V", line = 191)
    public final void method1346(int arg0) {
        int var2 = this.field3009.method2476((byte) 116);
        this.field3015[arg0] += var2;
    }

    @OriginalMember(owner = "client!kl", name = "g", descriptor = "()I", line = 196)
    public final int method1347() {
        return this.field3011.length;
    }

    @OriginalMember(owner = "client!kl", name = "<init>", descriptor = "()V", line = 264)
    public class213() {
    }

    @OriginalMember(owner = "client!kl", name = "<init>", descriptor = "([B)V", line = 266)
    public class213(byte[] arg0) {
        this.method1345(arg0);
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(II)I", line = 205)
    private final int method1348(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field3010[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field3009.method2503(true) << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field3009.method2503(true) << 16;
            }
            return var8;
        }
        int var3 = this.field3009.method2503(true);
        int var4 = this.field3009.method2476((byte) -52);
        if (var3 == 47) {
            this.field3009.field5830 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field3009.method2498(3);
            var4 -= 3;
            int var6 = this.field3015[arg0];
            this.field3012 += (long) (this.field3016 - var5) * (long) var6;
            this.field3016 = var5;
            this.field3009.field5830 += var4;
            return 2;
        } else {
            this.field3009.field5830 += var4;
            return 3;
        }
    }

    @OriginalMember(owner = "client!kl", name = "f", descriptor = "(I)I", line = 257)
    public final int method1349(int arg0) {
        return this.method1338(arg0);
    }
}
