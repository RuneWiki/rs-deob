import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jr")
public class class74 {

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "Lnn;")
    private class289 field1514 = new class289(null);

    @OriginalMember(owner = "client!jr", name = "d", descriptor = "[B")
    private static byte[] field1517 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!jr", name = "c", descriptor = "I")
    public int field1516;

    @OriginalMember(owner = "client!jr", name = "f", descriptor = "I")
    private int field1519;

    @OriginalMember(owner = "client!jr", name = "g", descriptor = "J")
    private long field1520;

    @OriginalMember(owner = "client!jr", name = "b", descriptor = "[I")
    private int[] field1515;

    @OriginalMember(owner = "client!jr", name = "e", descriptor = "[I")
    public int[] field1518;

    @OriginalMember(owner = "client!jr", name = "h", descriptor = "[I")
    private int[] field1521;

    @OriginalMember(owner = "client!jr", name = "i", descriptor = "[I")
    private int[] field1522;

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "()Z", line = 3)
    public final boolean method658() {
        return this.field1514.field4408 != null;
    }

    @OriginalMember(owner = "client!jr", name = "b", descriptor = "()V", line = 11)
    public final void method659() {
        this.field1514.field4399 = -1;
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(J)V", line = 14)
    public final void method660(long arg0) {
        this.field1520 = arg0;
        int var3 = this.field1522.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field1518[var4] = 0;
            this.field1521[var4] = 0;
            this.field1514.field4399 = this.field1515[var4];
            this.method668(var4);
            this.field1522[var4] = this.field1514.field4399;
        }
    }

    @OriginalMember(owner = "client!jr", name = "c", descriptor = "()V", line = 32)
    public final void method661() {
        this.field1514.field4408 = null;
        this.field1515 = null;
        this.field1522 = null;
        this.field1518 = null;
        this.field1521 = null;
    }

    @OriginalMember(owner = "client!jr", name = "d", descriptor = "()I", line = 42)
    public final int method662() {
        return this.field1522.length;
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(I)V", line = 46)
    public final void method663(int arg0) {
        this.field1514.field4399 = this.field1522[arg0];
    }

    @OriginalMember(owner = "client!jr", name = "e", descriptor = "()I", line = 51)
    public final int method664() {
        int var1 = this.field1522.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field1522[var4] >= 0 && this.field1518[var4] < var3) {
                var2 = var4;
                var3 = this.field1518[var4];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!jr", name = "f", descriptor = "()V", line = 79)
    public static void method665() {
        field1517 = null;
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(II)I", line = 82)
    private final int method666(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field1517[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field1514.method1858(-3256) << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field1514.method1858(-3256) << 16;
            }
            return var8;
        }
        int var3 = this.field1514.method1858(-3256);
        int var4 = this.field1514.method1836(65280);
        if (var3 == 47) {
            this.field1514.field4399 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field1514.method1863(-108);
            var4 -= 3;
            int var6 = this.field1518[arg0];
            this.field1520 += (long) (this.field1519 - var5) * (long) var6;
            this.field1519 = var5;
            this.field1514.field4399 += var4;
            return 2;
        } else {
            this.field1514.field4399 += var4;
            return 3;
        }
    }

    @OriginalMember(owner = "client!jr", name = "<init>", descriptor = "()V", line = 250)
    public class74() {
    }

    @OriginalMember(owner = "client!jr", name = "<init>", descriptor = "([B)V", line = 266)
    public class74(byte[] arg0) {
        this.method669(arg0);
    }

    @OriginalMember(owner = "client!jr", name = "b", descriptor = "(I)V", line = 129)
    public final void method667(int arg0) {
        this.field1522[arg0] = this.field1514.field4399;
    }

    @OriginalMember(owner = "client!jr", name = "c", descriptor = "(I)V", line = 133)
    public final void method668(int arg0) {
        int var2 = this.field1514.method1836(65280);
        this.field1518[arg0] += var2;
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "([B)V", line = 139)
    public final void method669(byte[] arg0) {
        this.field1514.field4408 = arg0;
        this.field1514.field4399 = 10;
        int var2 = this.field1514.method1841((byte) 20);
        this.field1516 = this.field1514.method1841((byte) 14);
        this.field1519 = 500000;
        this.field1515 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var5 = this.field1514.method1815((byte) -106);
            int var6 = this.field1514.method1815((byte) -105);
            if (var5 == 1297379947) {
                this.field1515[var3] = this.field1514.field4399;
                var3++;
            }
            this.field1514.field4399 += var6;
        }
        this.field1520 = 0L;
        this.field1522 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            this.field1522[var4] = this.field1515[var4];
        }
        this.field1518 = new int[var2];
        this.field1521 = new int[var2];
    }

    @OriginalMember(owner = "client!jr", name = "d", descriptor = "(I)I", line = 194)
    public final int method670(int arg0) {
        return this.method671(arg0);
    }

    @OriginalMember(owner = "client!jr", name = "e", descriptor = "(I)I", line = 205)
    private final int method671(int arg0) {
        byte var2 = this.field1514.field4408[this.field1514.field4399];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field1521[arg0] = var3;
            this.field1514.field4399++;
        } else {
            var3 = this.field1521[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method666(arg0, var3);
        }
        int var4 = this.field1514.method1836(65280);
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field1514.field4408[this.field1514.field4399] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field1514.field4399++;
                this.field1521[arg0] = var5;
                return this.method666(arg0, var5);
            }
        }
        this.field1514.field4399 += var4;
        return 0;
    }

    @OriginalMember(owner = "client!jr", name = "f", descriptor = "(I)J", line = 244)
    public final long method672(int arg0) {
        return (long) this.field1519 * (long) arg0 + this.field1520;
    }

    @OriginalMember(owner = "client!jr", name = "g", descriptor = "()Z", line = 254)
    public final boolean method673() {
        int var1 = this.field1522.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field1522[var2] >= 0) {
                return false;
            }
        }
        return true;
    }
}
