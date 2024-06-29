import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!id")
public class class60 {

    @OriginalMember(owner = "client!id", name = "b", descriptor = "Lm;")
    private class83 field1491 = new class83(null);

    @OriginalMember(owner = "client!id", name = "a", descriptor = "[B")
    private static byte[] field1490 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!id", name = "e", descriptor = "I")
    public int field1494;

    @OriginalMember(owner = "client!id", name = "f", descriptor = "I")
    private int field1495;

    @OriginalMember(owner = "client!id", name = "d", descriptor = "J")
    private long field1493;

    @OriginalMember(owner = "client!id", name = "c", descriptor = "[I")
    private int[] field1492;

    @OriginalMember(owner = "client!id", name = "g", descriptor = "[I")
    public int[] field1496;

    @OriginalMember(owner = "client!id", name = "h", descriptor = "[I")
    private int[] field1497;

    @OriginalMember(owner = "client!id", name = "i", descriptor = "[I")
    private int[] field1498;

    @OriginalMember(owner = "client!id", name = "a", descriptor = "()V")
    public final void method468() {
        this.field1491.field2076 = -1;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "([B)V")
    public final void method469(byte[] arg0) {
        this.field1491.field2055 = arg0;
        this.field1491.field2076 = 10;
        int var2 = this.field1491.method631((byte) -101);
        this.field1494 = this.field1491.method631((byte) -101);
        this.field1495 = 500000;
        this.field1497 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var5 = this.field1491.method641((byte) 73);
            int var6 = this.field1491.method641((byte) 73);
            if (var5 == 1297379947) {
                this.field1497[var3] = this.field1491.field2076;
                var3++;
            }
            this.field1491.field2076 += var6;
        }
        this.field1493 = 0L;
        this.field1498 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            this.field1498[var4] = this.field1497[var4];
        }
        this.field1496 = new int[var2];
        this.field1492 = new int[var2];
    }

    @OriginalMember(owner = "client!id", name = "b", descriptor = "()Z")
    public final boolean method470() {
        int var1 = this.field1498.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field1498[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(I)J")
    public final long method471(int arg0) {
        return (long) this.field1495 * (long) arg0 + this.field1493;
    }

    @OriginalMember(owner = "client!id", name = "b", descriptor = "(I)V")
    public final void method472(int arg0) {
        int var2 = this.field1491.method650(0);
        this.field1496[arg0] += var2;
    }

    @OriginalMember(owner = "client!id", name = "c", descriptor = "(I)V")
    public final void method473(int arg0) {
        this.field1498[arg0] = this.field1491.field2076;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(J)V")
    public final void method474(long arg0) {
        this.field1493 = arg0;
        int var3 = this.field1498.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field1496[var4] = 0;
            this.field1492[var4] = 0;
            this.field1491.field2076 = this.field1497[var4];
            this.method472(var4);
            this.field1498[var4] = this.field1491.field2076;
        }
    }

    @OriginalMember(owner = "client!id", name = "d", descriptor = "(I)I")
    private final int method475(int arg0) {
        byte var2 = this.field1491.field2055[this.field1491.field2076];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field1492[arg0] = var3;
            this.field1491.field2076++;
        } else {
            var3 = this.field1492[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method480(arg0, var3);
        }
        int var4 = this.field1491.method650(0);
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field1491.field2055[this.field1491.field2076] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field1491.field2076++;
                this.field1492[arg0] = var5;
                return this.method480(arg0, var5);
            }
        }
        this.field1491.field2076 += var4;
        return 0;
    }

    @OriginalMember(owner = "client!id", name = "c", descriptor = "()V")
    public static void method476() {
        field1490 = null;
    }

    @OriginalMember(owner = "client!id", name = "d", descriptor = "()Z")
    public final boolean method477() {
        return this.field1491.field2055 != null;
    }

    @OriginalMember(owner = "client!id", name = "e", descriptor = "()I")
    public final int method478() {
        return this.field1498.length;
    }

    @OriginalMember(owner = "client!id", name = "f", descriptor = "()I")
    public final int method479() {
        int var1 = this.field1498.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field1498[var4] >= 0 && this.field1496[var4] < var3) {
                var2 = var4;
                var3 = this.field1496[var4];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(II)I")
    private final int method480(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field1490[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field1491.method638(0) << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field1491.method638(0) << 16;
            }
            return var8;
        }
        int var3 = this.field1491.method638(0);
        int var4 = this.field1491.method650(0);
        if (var3 == 47) {
            this.field1491.field2076 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field1491.method670(false);
            var4 -= 3;
            int var6 = this.field1496[arg0];
            this.field1493 += (long) (this.field1495 - var5) * (long) var6;
            this.field1495 = var5;
            this.field1491.field2076 += var4;
            return 2;
        } else {
            this.field1491.field2076 += var4;
            return 3;
        }
    }

    @OriginalMember(owner = "client!id", name = "g", descriptor = "()V")
    public final void method481() {
        this.field1491.field2055 = null;
        this.field1497 = null;
        this.field1498 = null;
        this.field1496 = null;
        this.field1492 = null;
    }

    @OriginalMember(owner = "client!id", name = "e", descriptor = "(I)I")
    public final int method482(int arg0) {
        return this.method475(arg0);
    }

    @OriginalMember(owner = "client!id", name = "f", descriptor = "(I)V")
    public final void method483(int arg0) {
        this.field1491.field2076 = this.field1498[arg0];
    }

    @OriginalMember(owner = "client!id", name = "<init>", descriptor = "()V")
    public class60() {
    }

    @OriginalMember(owner = "client!id", name = "<init>", descriptor = "([B)V")
    public class60(byte[] arg0) {
        this.method469(arg0);
    }
}
