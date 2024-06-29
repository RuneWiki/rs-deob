import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kt")
public class class147 {

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "Lji;")
    private class572 field1753 = new class572(null);

    @OriginalMember(owner = "client!kt", name = "b", descriptor = "[B")
    private static byte[] field1754 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!kt", name = "e", descriptor = "I")
    private int field1757;

    @OriginalMember(owner = "client!kt", name = "h", descriptor = "I")
    public int field1760;

    @OriginalMember(owner = "client!kt", name = "g", descriptor = "J")
    private long field1759;

    @OriginalMember(owner = "client!kt", name = "c", descriptor = "[I")
    public int[] field1755;

    @OriginalMember(owner = "client!kt", name = "d", descriptor = "[I")
    private int[] field1756;

    @OriginalMember(owner = "client!kt", name = "f", descriptor = "[I")
    private int[] field1758;

    @OriginalMember(owner = "client!kt", name = "i", descriptor = "[I")
    private int[] field1761;

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(J)V", line = 6)
    public final void method913(long arg0) {
        this.field1759 = arg0;
        int var3 = this.field1761.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field1755[var4] = 0;
            this.field1758[var4] = 0;
            this.field1753.field7313 = this.field1756[var4];
            this.method920(var4);
            this.field1761[var4] = this.field1753.field7313;
        }
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "()V", line = 24)
    public static void method914() {
        field1754 = null;
    }

    @OriginalMember(owner = "client!kt", name = "<init>", descriptor = "()V", line = 264)
    public class147() {
    }

    @OriginalMember(owner = "client!kt", name = "<init>", descriptor = "([B)V", line = 266)
    public class147(byte[] arg0) {
        this.method915(arg0);
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "([B)V", line = 30)
    public final void method915(byte[] arg0) {
        this.field1753.field7318 = arg0;
        this.field1753.field7313 = 10;
        int var2 = this.field1753.method3031(-1);
        this.field1760 = this.field1753.method3031(-1);
        this.field1757 = 500000;
        this.field1756 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var5 = this.field1753.method3064(-2031091464);
            int var6 = this.field1753.method3064(-2031091464);
            if (var5 == 1297379947) {
                this.field1756[var3] = this.field1753.field7313;
                var3++;
            }
            this.field1753.field7313 += var6;
        }
        this.field1759 = 0L;
        this.field1761 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            this.field1761[var4] = this.field1756[var4];
        }
        this.field1755 = new int[var2];
        this.field1758 = new int[var2];
    }

    @OriginalMember(owner = "client!kt", name = "b", descriptor = "()Z", line = 84)
    public final boolean method916() {
        int var1 = this.field1761.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field1761[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(I)I", line = 98)
    private final int method917(int arg0) {
        byte var2 = this.field1753.field7318[this.field1753.field7313];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field1758[arg0] = var3;
            this.field1753.field7313++;
        } else {
            var3 = this.field1758[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method927(arg0, var3);
        }
        int var4 = this.field1753.method3055((byte) 97);
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field1753.field7318[this.field1753.field7313] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field1753.field7313++;
                this.field1758[arg0] = var5;
                return this.method927(arg0, var5);
            }
        }
        this.field1753.field7313 += var4;
        return 0;
    }

    @OriginalMember(owner = "client!kt", name = "c", descriptor = "()I", line = 137)
    public final int method918() {
        int var1 = this.field1761.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field1761[var4] >= 0 && this.field1755[var4] < var3) {
                var2 = var4;
                var3 = this.field1755[var4];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!kt", name = "d", descriptor = "()Z", line = 164)
    public final boolean method919() {
        return this.field1753.field7318 != null;
    }

    @OriginalMember(owner = "client!kt", name = "b", descriptor = "(I)V", line = 171)
    public final void method920(int arg0) {
        int var2 = this.field1753.method3055((byte) 114);
        this.field1755[arg0] += var2;
    }

    @OriginalMember(owner = "client!kt", name = "c", descriptor = "(I)V", line = 175)
    public final void method921(int arg0) {
        this.field1753.field7313 = this.field1761[arg0];
    }

    @OriginalMember(owner = "client!kt", name = "e", descriptor = "()V", line = 178)
    public final void method922() {
        this.field1753.field7318 = null;
        this.field1756 = null;
        this.field1761 = null;
        this.field1755 = null;
        this.field1758 = null;
    }

    @OriginalMember(owner = "client!kt", name = "d", descriptor = "(I)J", line = 196)
    public final long method923(int arg0) {
        return (long) this.field1757 * (long) arg0 + this.field1759;
    }

    @OriginalMember(owner = "client!kt", name = "e", descriptor = "(I)V", line = 199)
    public final void method924(int arg0) {
        this.field1761[arg0] = this.field1753.field7313;
    }

    @OriginalMember(owner = "client!kt", name = "f", descriptor = "(I)I", line = 203)
    public final int method925(int arg0) {
        return this.method917(arg0);
    }

    @OriginalMember(owner = "client!kt", name = "f", descriptor = "()V", line = 209)
    public final void method926() {
        this.field1753.field7313 = -1;
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(II)I", line = 215)
    private final int method927(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field1754[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field1753.method3097((byte) 12) << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field1753.method3097((byte) 12) << 16;
            }
            return var8;
        }
        int var3 = this.field1753.method3097((byte) 12);
        int var4 = this.field1753.method3055((byte) 108);
        if (var3 == 47) {
            this.field1753.field7313 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field1753.method3059(1);
            var4 -= 3;
            int var6 = this.field1755[arg0];
            this.field1759 += (long) (this.field1757 - var5) * (long) var6;
            this.field1757 = var5;
            this.field1753.field7313 += var4;
            return 2;
        } else {
            this.field1753.field7313 += var4;
            return 3;
        }
    }

    @OriginalMember(owner = "client!kt", name = "g", descriptor = "()I", line = 259)
    public final int method928() {
        return this.field1761.length;
    }
}
