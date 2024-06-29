import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rca")
public class class233 {

    @OriginalMember(owner = "client!rca", name = "a", descriptor = "Ldga;")
    private class138 field3025 = new class138(null);

    @OriginalMember(owner = "client!rca", name = "g", descriptor = "[B")
    private static byte[] field3031 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!rca", name = "d", descriptor = "I")
    public int field3028;

    @OriginalMember(owner = "client!rca", name = "i", descriptor = "I")
    private int field3033;

    @OriginalMember(owner = "client!rca", name = "c", descriptor = "J")
    private long field3027;

    @OriginalMember(owner = "client!rca", name = "b", descriptor = "[I")
    private int[] field3026;

    @OriginalMember(owner = "client!rca", name = "e", descriptor = "[I")
    private int[] field3029;

    @OriginalMember(owner = "client!rca", name = "f", descriptor = "[I")
    public int[] field3030;

    @OriginalMember(owner = "client!rca", name = "h", descriptor = "[I")
    private int[] field3032;

    @OriginalMember(owner = "client!rca", name = "a", descriptor = "(I)I", line = 8)
    private final int method1430(int arg0) {
        byte var2 = this.field3025.field1712[this.field3025.field1745];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field3026[arg0] = var3;
            this.field3025.field1745++;
        } else {
            var3 = this.field3026[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method1445(arg0, var3);
        }
        int var4 = this.field3025.method900(1514965415);
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field3025.field1712[this.field3025.field1745] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field3025.field1745++;
                this.field3026[arg0] = var5;
                return this.method1445(arg0, var5);
            }
        }
        this.field3025.field1745 += var4;
        return 0;
    }

    @OriginalMember(owner = "client!rca", name = "a", descriptor = "(J)V", line = 47)
    public final void method1431(long arg0) {
        this.field3027 = arg0;
        int var3 = this.field3032.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field3030[var4] = 0;
            this.field3026[var4] = 0;
            this.field3025.field1745 = this.field3029[var4];
            this.method1438(var4);
            this.field3032[var4] = this.field3025.field1745;
        }
    }

    @OriginalMember(owner = "client!rca", name = "a", descriptor = "()I", line = 65)
    public final int method1432() {
        return this.field3032.length;
    }

    @OriginalMember(owner = "client!rca", name = "<init>", descriptor = "()V", line = 264)
    public class233() {
    }

    @OriginalMember(owner = "client!rca", name = "<init>", descriptor = "([B)V", line = 266)
    public class233(byte[] arg0) {
        this.method1442(arg0);
    }

    @OriginalMember(owner = "client!rca", name = "b", descriptor = "()V", line = 71)
    public static void method1433() {
        field3031 = null;
    }

    @OriginalMember(owner = "client!rca", name = "c", descriptor = "()Z", line = 75)
    public final boolean method1434() {
        int var1 = this.field3032.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field3032[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!rca", name = "d", descriptor = "()Z", line = 89)
    public final boolean method1435() {
        return this.field3025.field1712 != null;
    }

    @OriginalMember(owner = "client!rca", name = "b", descriptor = "(I)J", line = 93)
    public final long method1436(int arg0) {
        return (long) this.field3033 * (long) arg0 + this.field3027;
    }

    @OriginalMember(owner = "client!rca", name = "c", descriptor = "(I)I", line = 97)
    public final int method1437(int arg0) {
        return this.method1430(arg0);
    }

    @OriginalMember(owner = "client!rca", name = "d", descriptor = "(I)V", line = 104)
    public final void method1438(int arg0) {
        int var2 = this.field3025.method900(1514965415);
        this.field3030[arg0] += var2;
    }

    @OriginalMember(owner = "client!rca", name = "e", descriptor = "(I)V", line = 108)
    public final void method1439(int arg0) {
        this.field3032[arg0] = this.field3025.field1745;
    }

    @OriginalMember(owner = "client!rca", name = "e", descriptor = "()V", line = 111)
    public final void method1440() {
        this.field3025.field1712 = null;
        this.field3029 = null;
        this.field3032 = null;
        this.field3030 = null;
        this.field3026 = null;
    }

    @OriginalMember(owner = "client!rca", name = "f", descriptor = "()V", line = 122)
    public final void method1441() {
        this.field3025.field1745 = -1;
    }

    @OriginalMember(owner = "client!rca", name = "a", descriptor = "([B)V", line = 127)
    public final void method1442(byte[] arg0) {
        this.field3025.field1712 = arg0;
        this.field3025.field1745 = 10;
        int var2 = this.field3025.method922((byte) -126);
        this.field3028 = this.field3025.method922((byte) -115);
        this.field3033 = 500000;
        this.field3029 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var5 = this.field3025.method943(-79);
            int var6 = this.field3025.method943(-121);
            if (var5 == 1297379947) {
                this.field3029[var3] = this.field3025.field1745;
                var3++;
            }
            this.field3025.field1745 += var6;
        }
        this.field3027 = 0L;
        this.field3032 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            this.field3032[var4] = this.field3029[var4];
        }
        this.field3030 = new int[var2];
        this.field3026 = new int[var2];
    }

    @OriginalMember(owner = "client!rca", name = "f", descriptor = "(I)V", line = 183)
    public final void method1443(int arg0) {
        this.field3025.field1745 = this.field3032[arg0];
    }

    @OriginalMember(owner = "client!rca", name = "g", descriptor = "()I", line = 188)
    public final int method1444() {
        int var1 = this.field3032.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field3032[var4] >= 0 && this.field3030[var4] < var3) {
                var2 = var4;
                var3 = this.field3030[var4];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!rca", name = "a", descriptor = "(II)I", line = 215)
    private final int method1445(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field3031[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field3025.method957((byte) -63) << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field3025.method957((byte) -62) << 16;
            }
            return var8;
        }
        int var3 = this.field3025.method957((byte) -84);
        int var4 = this.field3025.method900(1514965415);
        if (var3 == 47) {
            this.field3025.field1745 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field3025.method904(125);
            var4 -= 3;
            int var6 = this.field3030[arg0];
            this.field3027 += (long) (this.field3033 - var5) * (long) var6;
            this.field3033 = var5;
            this.field3025.field1745 += var4;
            return 2;
        } else {
            this.field3025.field1745 += var4;
            return 3;
        }
    }
}
