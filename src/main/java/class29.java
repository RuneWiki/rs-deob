import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nl")
public class class29 {

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "Lfe;")
    private class229 field435 = new class229((byte[]) null);

    @OriginalMember(owner = "client!nl", name = "e", descriptor = "[B")
    private static byte[] field439 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!nl", name = "b", descriptor = "I")
    public int field436;

    @OriginalMember(owner = "client!nl", name = "h", descriptor = "I")
    private int field442;

    @OriginalMember(owner = "client!nl", name = "f", descriptor = "J")
    private long field440;

    @OriginalMember(owner = "client!nl", name = "c", descriptor = "[I")
    private int[] field437;

    @OriginalMember(owner = "client!nl", name = "d", descriptor = "[I")
    private int[] field438;

    @OriginalMember(owner = "client!nl", name = "g", descriptor = "[I")
    public int[] field441;

    @OriginalMember(owner = "client!nl", name = "i", descriptor = "[I")
    private int[] field443;

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "()I", line = 5)
    public final int method189() {
        int var1 = this.field438.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field438[var4] >= 0 && this.field441[var4] < var3) {
                var2 = var4;
                var3 = this.field441[var4];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!nl", name = "b", descriptor = "()V", line = 30)
    public static void method190() {
        field439 = null;
    }

    @OriginalMember(owner = "client!nl", name = "c", descriptor = "()V", line = 37)
    public final void method191() {
        this.field435.field3879 = null;
        this.field437 = null;
        this.field438 = null;
        this.field441 = null;
        this.field443 = null;
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(I)I", line = 48)
    private final int method192(int arg0) {
        byte var2 = this.field435.field3879[this.field435.field3905];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field443[arg0] = var3;
            this.field435.field3905++;
        } else {
            var3 = this.field443[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method198(arg0, var3);
        }
        int var4 = this.field435.method1553(-59);
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field435.field3879[this.field435.field3905] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field435.field3905++;
                this.field443[arg0] = var5;
                return this.method198(arg0, var5);
            }
        }
        this.field435.field3905 += var4;
        return 0;
    }

    @OriginalMember(owner = "client!nl", name = "d", descriptor = "()V", line = 86)
    public final void method193() {
        this.field435.field3905 = -1;
    }

    @OriginalMember(owner = "client!nl", name = "b", descriptor = "(I)V", line = 89)
    public final void method194(int arg0) {
        this.field435.field3905 = this.field438[arg0];
    }

    @OriginalMember(owner = "client!nl", name = "<init>", descriptor = "()V", line = 240)
    public class29() {
    }

    @OriginalMember(owner = "client!nl", name = "<init>", descriptor = "([B)V", line = 249)
    public class29(byte[] arg0) {
        this.method200(arg0);
    }

    @OriginalMember(owner = "client!nl", name = "c", descriptor = "(I)I", line = 99)
    public final int method195(int arg0) {
        return this.method192(arg0);
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(J)V", line = 105)
    public final void method196(long arg0) {
        this.field440 = arg0;
        int var3 = this.field438.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field441[var4] = 0;
            this.field443[var4] = 0;
            this.field435.field3905 = this.field437[var4];
            this.method199(var4);
            this.field438[var4] = this.field435.field3905;
        }
    }

    @OriginalMember(owner = "client!nl", name = "e", descriptor = "()Z", line = 125)
    public final boolean method197() {
        return this.field435.field3879 != null;
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(II)I", line = 132)
    private final int method198(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field439[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field435.method1535((byte) 117) << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field435.method1535((byte) 75) << 16;
            }
            return var8;
        }
        int var3 = this.field435.method1535((byte) 110);
        int var4 = this.field435.method1553(-46);
        if (var3 == 47) {
            this.field435.field3905 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field435.method1551(4);
            var4 -= 3;
            int var6 = this.field441[arg0];
            this.field440 += (long) (this.field442 - var5) * (long) var6;
            this.field442 = var5;
            this.field435.field3905 += var4;
            return 2;
        } else {
            this.field435.field3905 += var4;
            return 3;
        }
    }

    @OriginalMember(owner = "client!nl", name = "d", descriptor = "(I)V", line = 180)
    public final void method199(int arg0) {
        int var2 = this.field435.method1553(-104);
        this.field441[arg0] += var2;
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "([B)V", line = 184)
    public final void method200(byte[] arg0) {
        this.field435.field3879 = arg0;
        this.field435.field3905 = 10;
        int var2 = this.field435.method1496(true);
        this.field436 = this.field435.method1496(true);
        this.field442 = 500000;
        this.field437 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field435.method1528(true);
            int var5 = this.field435.method1528(true);
            if (var4 == 1297379947) {
                this.field437[var3] = this.field435.field3905;
                var3++;
            }
            this.field435.field3905 += var5;
        }
        this.field440 = 0L;
        this.field438 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field438[var6] = this.field437[var6];
        }
        this.field441 = new int[var2];
        this.field443 = new int[var2];
    }

    @OriginalMember(owner = "client!nl", name = "e", descriptor = "(I)V", line = 243)
    public final void method201(int arg0) {
        this.field438[arg0] = this.field435.field3905;
    }

    @OriginalMember(owner = "client!nl", name = "f", descriptor = "(I)J", line = 247)
    public final long method202(int arg0) {
        return (long) this.field442 * (long) arg0 + this.field440;
    }

    @OriginalMember(owner = "client!nl", name = "f", descriptor = "()I", line = 253)
    public final int method203() {
        return this.field438.length;
    }

    @OriginalMember(owner = "client!nl", name = "g", descriptor = "()Z", line = 257)
    public final boolean method204() {
        int var1 = this.field438.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field438[var2] >= 0) {
                return false;
            }
        }
        return true;
    }
}
