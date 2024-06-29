import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!er")
public class class106 {

    @OriginalMember(owner = "client!er", name = "b", descriptor = "Lud;")
    private class35 field1755 = new class35(null);

    @OriginalMember(owner = "client!er", name = "a", descriptor = "[B")
    private static byte[] field1754 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!er", name = "d", descriptor = "I")
    private int field1757;

    @OriginalMember(owner = "client!er", name = "f", descriptor = "I")
    public int field1759;

    @OriginalMember(owner = "client!er", name = "g", descriptor = "J")
    private long field1760;

    @OriginalMember(owner = "client!er", name = "c", descriptor = "[I")
    private int[] field1756;

    @OriginalMember(owner = "client!er", name = "e", descriptor = "[I")
    public int[] field1758;

    @OriginalMember(owner = "client!er", name = "h", descriptor = "[I")
    private int[] field1761;

    @OriginalMember(owner = "client!er", name = "i", descriptor = "[I")
    private int[] field1762;

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(I)V", line = 4)
    public final void method910(int arg0) {
        int var2 = this.field1755.method282(-2);
        this.field1758[arg0] += var2;
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "()V", line = 9)
    public static void method911() {
        field1754 = null;
    }

    @OriginalMember(owner = "client!er", name = "b", descriptor = "()Z", line = 12)
    public final boolean method912() {
        return this.field1755.field483 != null;
    }

    @OriginalMember(owner = "client!er", name = "b", descriptor = "(I)V", line = 17)
    public final void method913(int arg0) {
        this.field1755.field469 = this.field1756[arg0];
    }

    @OriginalMember(owner = "client!er", name = "c", descriptor = "()I", line = 21)
    public final int method914() {
        int var1 = this.field1756.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field1756[var4] >= 0 && this.field1758[var4] < var3) {
                var2 = var4;
                var3 = this.field1758[var4];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!er", name = "d", descriptor = "()V", line = 46)
    public final void method915() {
        this.field1755.field483 = null;
        this.field1762 = null;
        this.field1756 = null;
        this.field1758 = null;
        this.field1761 = null;
    }

    @OriginalMember(owner = "client!er", name = "c", descriptor = "(I)J", line = 58)
    public final long method916(int arg0) {
        return (long) this.field1757 * (long) arg0 + this.field1760;
    }

    @OriginalMember(owner = "client!er", name = "d", descriptor = "(I)V", line = 61)
    public final void method917(int arg0) {
        this.field1756[arg0] = this.field1755.field469;
    }

    @OriginalMember(owner = "client!er", name = "e", descriptor = "(I)I", line = 65)
    private final int method918(int arg0) {
        byte var2 = this.field1755.field483[this.field1755.field469];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field1761[arg0] = var3;
            this.field1755.field469++;
        } else {
            var3 = this.field1761[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method921(arg0, var3);
        }
        int var4 = this.field1755.method282(-2);
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field1755.field483[this.field1755.field469] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field1755.field469++;
                this.field1761[arg0] = var5;
                return this.method921(arg0, var5);
            }
        }
        this.field1755.field469 += var4;
        return 0;
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "([B)V", line = 103)
    public final void method919(byte[] arg0) {
        this.field1755.field483 = arg0;
        this.field1755.field469 = 10;
        int var2 = this.field1755.method253(-13900);
        this.field1759 = this.field1755.method253(-13900);
        this.field1757 = 500000;
        this.field1762 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var5 = this.field1755.method234((byte) -94);
            int var6 = this.field1755.method234((byte) -123);
            if (var5 == 1297379947) {
                this.field1762[var3] = this.field1755.field469;
                var3++;
            }
            this.field1755.field469 += var6;
        }
        this.field1760 = 0L;
        this.field1756 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            this.field1756[var4] = this.field1762[var4];
        }
        this.field1758 = new int[var2];
        this.field1761 = new int[var2];
    }

    @OriginalMember(owner = "client!er", name = "e", descriptor = "()Z", line = 159)
    public final boolean method920() {
        int var1 = this.field1756.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field1756[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(II)I", line = 173)
    private final int method921(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field1754[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field1755.method273(255) << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field1755.method273(255) << 16;
            }
            return var8;
        }
        int var3 = this.field1755.method273(255);
        int var4 = this.field1755.method282(-2);
        if (var3 == 47) {
            this.field1755.field469 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field1755.method239(-114);
            var4 -= 3;
            int var6 = this.field1758[arg0];
            this.field1760 += (long) (this.field1757 - var5) * (long) var6;
            this.field1757 = var5;
            this.field1755.field469 += var4;
            return 2;
        } else {
            this.field1755.field469 += var4;
            return 3;
        }
    }

    @OriginalMember(owner = "client!er", name = "f", descriptor = "()V", line = 220)
    public final void method922() {
        this.field1755.field469 = -1;
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(J)V", line = 226)
    public final void method923(long arg0) {
        this.field1760 = arg0;
        int var3 = this.field1756.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field1758[var4] = 0;
            this.field1761[var4] = 0;
            this.field1755.field469 = this.field1762[var4];
            this.method910(var4);
            this.field1756[var4] = this.field1755.field469;
        }
    }

    @OriginalMember(owner = "client!er", name = "f", descriptor = "(I)I", line = 245)
    public final int method924(int arg0) {
        return this.method918(arg0);
    }

    @OriginalMember(owner = "client!er", name = "<init>", descriptor = "()V", line = 264)
    public class106() {
    }

    @OriginalMember(owner = "client!er", name = "<init>", descriptor = "([B)V", line = 266)
    public class106(byte[] arg0) {
        this.method919(arg0);
    }

    @OriginalMember(owner = "client!er", name = "g", descriptor = "()I", line = 257)
    public final int method925() {
        return this.field1756.length;
    }
}
