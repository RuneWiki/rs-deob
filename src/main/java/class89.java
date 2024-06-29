import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!be")
public class class89 {

    @OriginalMember(owner = "client!be", name = "b", descriptor = "Lmi;")
    private class92 field1408 = new class92((byte[]) null);

    @OriginalMember(owner = "client!be", name = "a", descriptor = "[B")
    private static byte[] field1407 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!be", name = "e", descriptor = "I")
    public int field1411;

    @OriginalMember(owner = "client!be", name = "f", descriptor = "I")
    private int field1412;

    @OriginalMember(owner = "client!be", name = "c", descriptor = "J")
    private long field1409;

    @OriginalMember(owner = "client!be", name = "d", descriptor = "[I")
    public int[] field1410;

    @OriginalMember(owner = "client!be", name = "g", descriptor = "[I")
    private int[] field1413;

    @OriginalMember(owner = "client!be", name = "h", descriptor = "[I")
    private int[] field1414;

    @OriginalMember(owner = "client!be", name = "i", descriptor = "[I")
    private int[] field1415;

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(I)J", line = 3)
    public final long method657(int arg0) {
        return (long) this.field1412 * (long) arg0 + this.field1409;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "()Z", line = 7)
    public final boolean method658() {
        int var1 = this.field1414.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field1414[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!be", name = "b", descriptor = "()V", line = 20)
    public final void method659() {
        this.field1408.field1495 = null;
        this.field1413 = null;
        this.field1414 = null;
        this.field1410 = null;
        this.field1415 = null;
    }

    @OriginalMember(owner = "client!be", name = "c", descriptor = "()V", line = 30)
    public final void method660() {
        this.field1408.field1476 = -1;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(J)V", line = 34)
    public final void method661(long arg0) {
        this.field1409 = arg0;
        int var3 = this.field1414.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field1410[var4] = 0;
            this.field1415[var4] = 0;
            this.field1408.field1476 = this.field1413[var4];
            this.method669(var4);
            this.field1414[var4] = this.field1408.field1476;
        }
    }

    @OriginalMember(owner = "client!be", name = "d", descriptor = "()I", line = 53)
    public final int method662() {
        int var1 = this.field1414.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field1414[var4] >= 0 && this.field1410[var4] < var3) {
                var2 = var4;
                var3 = this.field1410[var4];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(II)I", line = 78)
    private final int method663(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field1407[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field1408.method702(-1) << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field1408.method702(-1) << 16;
            }
            return var8;
        }
        int var3 = this.field1408.method702(-1);
        int var4 = this.field1408.method742(-123);
        if (var3 == 47) {
            this.field1408.field1476 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field1408.method737(-1);
            var4 -= 3;
            int var6 = this.field1410[arg0];
            this.field1409 += (long) (this.field1412 - var5) * (long) var6;
            this.field1412 = var5;
            this.field1408.field1476 += var4;
            return 2;
        } else {
            this.field1408.field1476 += var4;
            return 3;
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "([B)V", line = 124)
    public final void method664(byte[] arg0) {
        this.field1408.field1495 = arg0;
        this.field1408.field1476 = 10;
        int var2 = this.field1408.method721(41);
        this.field1411 = this.field1408.method721(41);
        this.field1412 = 500000;
        this.field1413 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field1408.method704(1509947792);
            int var5 = this.field1408.method704(1509947792);
            if (var4 == 1297379947) {
                this.field1413[var3] = this.field1408.field1476;
                var3++;
            }
            this.field1408.field1476 += var5;
        }
        this.field1409 = 0L;
        this.field1414 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field1414[var6] = this.field1413[var6];
        }
        this.field1410 = new int[var2];
        this.field1415 = new int[var2];
    }

    @OriginalMember(owner = "client!be", name = "<init>", descriptor = "()V", line = 261)
    public class89() {
    }

    @OriginalMember(owner = "client!be", name = "<init>", descriptor = "([B)V", line = 266)
    public class89(byte[] arg0) {
        this.method664(arg0);
    }

    @OriginalMember(owner = "client!be", name = "b", descriptor = "(I)I", line = 183)
    private final int method665(int arg0) {
        byte var2 = this.field1408.field1495[this.field1408.field1476];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field1415[arg0] = var3;
            this.field1408.field1476++;
        } else {
            var3 = this.field1415[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method663(arg0, var3);
        }
        int var4 = this.field1408.method742(-124);
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field1408.field1495[this.field1408.field1476] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field1408.field1476++;
                this.field1415[arg0] = var5;
                return this.method663(arg0, var5);
            }
        }
        this.field1408.field1476 += var4;
        return 0;
    }

    @OriginalMember(owner = "client!be", name = "c", descriptor = "(I)I", line = 224)
    public final int method666(int arg0) {
        return this.method665(arg0);
    }

    @OriginalMember(owner = "client!be", name = "d", descriptor = "(I)V", line = 233)
    public final void method667(int arg0) {
        this.field1414[arg0] = this.field1408.field1476;
    }

    @OriginalMember(owner = "client!be", name = "e", descriptor = "()I", line = 236)
    public final int method668() {
        return this.field1414.length;
    }

    @OriginalMember(owner = "client!be", name = "e", descriptor = "(I)V", line = 246)
    public final void method669(int arg0) {
        int var2 = this.field1408.method742(-127);
        this.field1410[arg0] += var2;
    }

    @OriginalMember(owner = "client!be", name = "f", descriptor = "(I)V", line = 250)
    public final void method670(int arg0) {
        this.field1408.field1476 = this.field1414[arg0];
    }

    @OriginalMember(owner = "client!be", name = "f", descriptor = "()Z", line = 255)
    public final boolean method671() {
        return this.field1408.field1495 != null;
    }

    @OriginalMember(owner = "client!be", name = "g", descriptor = "()V", line = 264)
    public static void method672() {
        field1407 = null;
    }
}
