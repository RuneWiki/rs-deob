import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ec")
public class class103 {

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "Lfh;")
    private class313 field1494 = new class313((byte[]) null);

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "[B")
    private static byte[] field1493 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!ec", name = "g", descriptor = "I")
    private int field1499;

    @OriginalMember(owner = "client!ec", name = "h", descriptor = "I")
    public int field1500;

    @OriginalMember(owner = "client!ec", name = "c", descriptor = "J")
    private long field1495;

    @OriginalMember(owner = "client!ec", name = "d", descriptor = "[I")
    private int[] field1496;

    @OriginalMember(owner = "client!ec", name = "e", descriptor = "[I")
    public int[] field1497;

    @OriginalMember(owner = "client!ec", name = "f", descriptor = "[I")
    private int[] field1498;

    @OriginalMember(owner = "client!ec", name = "i", descriptor = "[I")
    private int[] field1501;

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(I)J", line = 11)
    public final long method676(int arg0) {
        return (long) this.field1499 * (long) arg0 + this.field1495;
    }

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "(I)V", line = 14)
    public final void method677(int arg0) {
        this.field1496[arg0] = this.field1494.field5137;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "()V", line = 17)
    public static void method678() {
        field1493 = null;
    }

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "()V", line = 20)
    public final void method679() {
        this.field1494.field5124 = null;
        this.field1501 = null;
        this.field1496 = null;
        this.field1497 = null;
        this.field1498 = null;
    }

    @OriginalMember(owner = "client!ec", name = "c", descriptor = "(I)V", line = 29)
    public final void method680(int arg0) {
        this.field1494.field5137 = this.field1496[arg0];
    }

    @OriginalMember(owner = "client!ec", name = "d", descriptor = "(I)I", line = 34)
    private final int method681(int arg0) {
        byte var2 = this.field1494.field5124[this.field1494.field5137];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field1498[arg0] = var3;
            this.field1494.field5137++;
        } else {
            var3 = this.field1498[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method682(arg0, var3);
        }
        int var4 = this.field1494.method2234(false);
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field1494.field5124[this.field1494.field5137] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field1494.field5137++;
                this.field1498[arg0] = var5;
                return this.method682(arg0, var5);
            }
        }
        this.field1494.field5137 += var4;
        return 0;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(II)I", line = 73)
    private final int method682(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field1493[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field1494.method2224(-127) << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field1494.method2224(-123) << 16;
            }
            return var8;
        }
        int var3 = this.field1494.method2224(-119);
        int var4 = this.field1494.method2234(false);
        if (var3 == 47) {
            this.field1494.field5137 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field1494.method2249(-57);
            var4 -= 3;
            int var6 = this.field1497[arg0];
            this.field1495 += (long) (this.field1499 - var5) * (long) var6;
            this.field1499 = var5;
            this.field1494.field5137 += var4;
            return 2;
        } else {
            this.field1494.field5137 += var4;
            return 3;
        }
    }

    @OriginalMember(owner = "client!ec", name = "c", descriptor = "()Z", line = 115)
    public final boolean method683() {
        return this.field1494.field5124 != null;
    }

    @OriginalMember(owner = "client!ec", name = "e", descriptor = "(I)I", line = 124)
    public final int method684(int arg0) {
        return this.method681(arg0);
    }

    @OriginalMember(owner = "client!ec", name = "d", descriptor = "()V", line = 130)
    public final void method685() {
        this.field1494.field5137 = -1;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "([B)V", line = 133)
    public final void method686(byte[] arg0) {
        this.field1494.field5124 = arg0;
        this.field1494.field5137 = 10;
        int var2 = this.field1494.method2250(-1613178296);
        this.field1500 = this.field1494.method2250(-1613178296);
        this.field1499 = 500000;
        this.field1501 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field1494.method2231((byte) -126);
            int var5 = this.field1494.method2231((byte) -124);
            if (var4 == 1297379947) {
                this.field1501[var3] = this.field1494.field5137;
                var3++;
            }
            this.field1494.field5137 += var5;
        }
        this.field1495 = 0L;
        this.field1496 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field1496[var6] = this.field1501[var6];
        }
        this.field1497 = new int[var2];
        this.field1498 = new int[var2];
    }

    @OriginalMember(owner = "client!ec", name = "e", descriptor = "()Z", line = 187)
    public final boolean method687() {
        int var1 = this.field1496.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field1496[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(J)V", line = 200)
    public final void method688(long arg0) {
        this.field1495 = arg0;
        int var3 = this.field1496.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field1497[var4] = 0;
            this.field1498[var4] = 0;
            this.field1494.field5137 = this.field1501[var4];
            this.method691(var4);
            this.field1496[var4] = this.field1494.field5137;
        }
    }

    @OriginalMember(owner = "client!ec", name = "f", descriptor = "()I", line = 219)
    public final int method689() {
        return this.field1496.length;
    }

    @OriginalMember(owner = "client!ec", name = "g", descriptor = "()I", line = 223)
    public final int method690() {
        int var1 = this.field1496.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field1496[var4] >= 0 && this.field1497[var4] < var3) {
                var2 = var4;
                var3 = this.field1497[var4];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!ec", name = "<init>", descriptor = "()V", line = 264)
    public class103() {
    }

    @OriginalMember(owner = "client!ec", name = "<init>", descriptor = "([B)V", line = 266)
    public class103(byte[] arg0) {
        this.method686(arg0);
    }

    @OriginalMember(owner = "client!ec", name = "f", descriptor = "(I)V", line = 253)
    public final void method691(int arg0) {
        int var2 = this.field1494.method2234(false);
        this.field1497[arg0] += var2;
    }
}
