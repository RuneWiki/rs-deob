import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hk")
public class class261 {

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "Ljd;")
    private class118 field4631 = new class118((byte[]) null);

    @OriginalMember(owner = "client!hk", name = "f", descriptor = "[B")
    private static byte[] field4636 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!hk", name = "b", descriptor = "I")
    private int field4632;

    @OriginalMember(owner = "client!hk", name = "d", descriptor = "I")
    public int field4634;

    @OriginalMember(owner = "client!hk", name = "e", descriptor = "J")
    private long field4635;

    @OriginalMember(owner = "client!hk", name = "c", descriptor = "[I")
    public int[] field4633;

    @OriginalMember(owner = "client!hk", name = "g", descriptor = "[I")
    private int[] field4637;

    @OriginalMember(owner = "client!hk", name = "h", descriptor = "[I")
    private int[] field4638;

    @OriginalMember(owner = "client!hk", name = "i", descriptor = "[I")
    private int[] field4639;

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "()Z")
    public final boolean method1773() {
        int var1 = this.field4638.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field4638[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(II)I")
    private final int method1774(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field4636[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field4631.method867(false) << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field4631.method867(false) << 16;
            }
            return var8;
        }
        int var3 = this.field4631.method867(false);
        int var4 = this.field4631.method839(17760);
        if (var3 == 47) {
            this.field4631.field2155 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field4631.method873((byte) -108);
            var4 -= 3;
            int var6 = this.field4633[arg0];
            this.field4635 += (long) (this.field4632 - var5) * (long) var6;
            this.field4632 = var5;
            this.field4631.field2155 += var4;
            return 2;
        } else {
            this.field4631.field2155 += var4;
            return 3;
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(I)I")
    private final int method1775(int arg0) {
        byte var2 = this.field4631.field2115[this.field4631.field2155];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field4637[arg0] = var3;
            this.field4631.field2155++;
        } else {
            var3 = this.field4637[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method1774(arg0, var3);
        }
        int var4 = this.field4631.method839(17760);
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field4631.field2115[this.field4631.field2155] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field4631.field2155++;
                this.field4637[arg0] = var5;
                return this.method1774(arg0, var5);
            }
        }
        this.field4631.field2155 += var4;
        return 0;
    }

    @OriginalMember(owner = "client!hk", name = "b", descriptor = "()I")
    public final int method1776() {
        return this.field4638.length;
    }

    @OriginalMember(owner = "client!hk", name = "b", descriptor = "(I)V")
    public final void method1777(int arg0) {
        int var2 = this.field4631.method839(17760);
        this.field4633[arg0] += var2;
    }

    @OriginalMember(owner = "client!hk", name = "c", descriptor = "(I)V")
    public final void method1778(int arg0) {
        this.field4638[arg0] = this.field4631.field2155;
    }

    @OriginalMember(owner = "client!hk", name = "d", descriptor = "(I)V")
    public final void method1779(int arg0) {
        this.field4631.field2155 = this.field4638[arg0];
    }

    @OriginalMember(owner = "client!hk", name = "e", descriptor = "(I)J")
    public final long method1780(int arg0) {
        return (long) this.field4632 * (long) arg0 + this.field4635;
    }

    @OriginalMember(owner = "client!hk", name = "c", descriptor = "()Z")
    public final boolean method1781() {
        return this.field4631.field2115 != null;
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(J)V")
    public final void method1782(long arg0) {
        this.field4635 = arg0;
        int var3 = this.field4638.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field4633[var4] = 0;
            this.field4637[var4] = 0;
            this.field4631.field2155 = this.field4639[var4];
            this.method1777(var4);
            this.field4638[var4] = this.field4631.field2155;
        }
    }

    @OriginalMember(owner = "client!hk", name = "d", descriptor = "()V")
    public final void method1783() {
        this.field4631.field2115 = null;
        this.field4639 = null;
        this.field4638 = null;
        this.field4633 = null;
        this.field4637 = null;
    }

    @OriginalMember(owner = "client!hk", name = "e", descriptor = "()V")
    public final void method1784() {
        this.field4631.field2155 = -1;
    }

    @OriginalMember(owner = "client!hk", name = "f", descriptor = "()I")
    public final int method1785() {
        int var1 = this.field4638.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field4638[var4] >= 0 && this.field4633[var4] < var3) {
                var2 = var4;
                var3 = this.field4633[var4];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!hk", name = "g", descriptor = "()V")
    public static void method1786() {
        field4636 = null;
    }

    @OriginalMember(owner = "client!hk", name = "<init>", descriptor = "()V")
    public class261() {
    }

    @OriginalMember(owner = "client!hk", name = "f", descriptor = "(I)I")
    public final int method1787(int arg0) {
        return this.method1775(arg0);
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "([B)V")
    public final void method1788(byte[] arg0) {
        this.field4631.field2115 = arg0;
        this.field4631.field2155 = 10;
        int var2 = this.field4631.method827(255);
        this.field4634 = this.field4631.method827(255);
        this.field4632 = 500000;
        this.field4639 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var5 = this.field4631.method875((byte) 68);
            int var6 = this.field4631.method875((byte) 87);
            if (var5 == 1297379947) {
                this.field4639[var3] = this.field4631.field2155;
                var3++;
            }
            this.field4631.field2155 += var6;
        }
        this.field4635 = 0L;
        this.field4638 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            this.field4638[var4] = this.field4639[var4];
        }
        this.field4633 = new int[var2];
        this.field4637 = new int[var2];
    }

    @OriginalMember(owner = "client!hk", name = "<init>", descriptor = "([B)V")
    public class261(byte[] arg0) {
        this.method1788(arg0);
    }
}
