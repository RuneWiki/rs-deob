import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ca")
public class class20 {

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "Lhc;")
    private class66 field443 = new class66(null);

    @OriginalMember(owner = "client!ca", name = "d", descriptor = "[B")
    private static byte[] field446 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!ca", name = "c", descriptor = "I")
    public int field445;

    @OriginalMember(owner = "client!ca", name = "e", descriptor = "I")
    private int field447;

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "J")
    private long field444;

    @OriginalMember(owner = "client!ca", name = "f", descriptor = "[I")
    private int[] field448;

    @OriginalMember(owner = "client!ca", name = "g", descriptor = "[I")
    private int[] field449;

    @OriginalMember(owner = "client!ca", name = "h", descriptor = "[I")
    private int[] field450;

    @OriginalMember(owner = "client!ca", name = "i", descriptor = "[I")
    public int[] field451;

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(J)V")
    public final void method113(long arg0) {
        this.field444 = arg0;
        int var3 = this.field448.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field451[var4] = 0;
            this.field449[var4] = 0;
            this.field443.field1620 = this.field450[var4];
            this.method125(var4);
            this.field448[var4] = this.field443.field1620;
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(I)J")
    public final long method114(int arg0) {
        return (long) this.field447 * (long) arg0 + this.field444;
    }

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "(I)I")
    public final int method115(int arg0) {
        return this.method124(arg0);
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "([B)V")
    public final void method116(byte[] arg0) {
        this.field443.field1627 = arg0;
        this.field443.field1620 = 10;
        int var2 = this.field443.method511(-121);
        this.field445 = this.field443.method511(12);
        this.field447 = 500000;
        this.field450 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var5 = this.field443.method464(-89);
            int var6 = this.field443.method464(-40);
            if (var5 == 1297379947) {
                this.field450[var3] = this.field443.field1620;
                var3++;
            }
            this.field443.field1620 += var6;
        }
        this.field444 = 0L;
        this.field448 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            this.field448[var4] = this.field450[var4];
        }
        this.field451 = new int[var2];
        this.field449 = new int[var2];
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(II)I")
    private final int method117(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field446[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field443.method509(127) << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field443.method509(120) << 16;
            }
            return var8;
        }
        int var3 = this.field443.method509(118);
        int var4 = this.field443.method505((byte) -89);
        if (var3 == 47) {
            this.field443.field1620 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field443.method466(-26256544);
            var4 -= 3;
            int var6 = this.field451[arg0];
            this.field444 += (long) (this.field447 - var5) * (long) var6;
            this.field447 = var5;
            this.field443.field1620 += var4;
            return 2;
        } else {
            this.field443.field1620 += var4;
            return 3;
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "()V")
    public final void method118() {
        this.field443.field1627 = null;
        this.field450 = null;
        this.field448 = null;
        this.field451 = null;
        this.field449 = null;
    }

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "()Z")
    public final boolean method119() {
        int var1 = this.field448.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field448[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!ca", name = "c", descriptor = "(I)V")
    public final void method120(int arg0) {
        this.field448[arg0] = this.field443.field1620;
    }

    @OriginalMember(owner = "client!ca", name = "c", descriptor = "()V")
    public static void method121() {
        field446 = null;
    }

    @OriginalMember(owner = "client!ca", name = "d", descriptor = "(I)V")
    public final void method122(int arg0) {
        this.field443.field1620 = this.field448[arg0];
    }

    @OriginalMember(owner = "client!ca", name = "d", descriptor = "()I")
    public final int method123() {
        return this.field448.length;
    }

    @OriginalMember(owner = "client!ca", name = "e", descriptor = "(I)I")
    private final int method124(int arg0) {
        byte var2 = this.field443.field1627[this.field443.field1620];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field449[arg0] = var3;
            this.field443.field1620++;
        } else {
            var3 = this.field449[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method117(arg0, var3);
        }
        int var4 = this.field443.method505((byte) -109);
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field443.field1627[this.field443.field1620] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field443.field1620++;
                this.field449[arg0] = var5;
                return this.method117(arg0, var5);
            }
        }
        this.field443.field1620 += var4;
        return 0;
    }

    @OriginalMember(owner = "client!ca", name = "f", descriptor = "(I)V")
    public final void method125(int arg0) {
        int var2 = this.field443.method505((byte) -101);
        this.field451[arg0] += var2;
    }

    @OriginalMember(owner = "client!ca", name = "e", descriptor = "()V")
    public final void method126() {
        this.field443.field1620 = -1;
    }

    @OriginalMember(owner = "client!ca", name = "f", descriptor = "()Z")
    public final boolean method127() {
        return this.field443.field1627 != null;
    }

    @OriginalMember(owner = "client!ca", name = "g", descriptor = "()I")
    public final int method128() {
        int var1 = this.field448.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field448[var4] >= 0 && this.field451[var4] < var3) {
                var2 = var4;
                var3 = this.field451[var4];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!ca", name = "<init>", descriptor = "()V")
    public class20() {
    }

    @OriginalMember(owner = "client!ca", name = "<init>", descriptor = "([B)V")
    public class20(byte[] arg0) {
        this.method116(arg0);
    }
}
