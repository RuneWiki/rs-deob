import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vg")
public class class38 {

    @OriginalMember(owner = "client!vg", name = "b", descriptor = "Lcu;")
    private class145 field710 = new class145(null);

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "[B")
    private static byte[] field709 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!vg", name = "g", descriptor = "I")
    public int field715;

    @OriginalMember(owner = "client!vg", name = "i", descriptor = "I")
    private int field717;

    @OriginalMember(owner = "client!vg", name = "f", descriptor = "J")
    private long field714;

    @OriginalMember(owner = "client!vg", name = "c", descriptor = "[I")
    public int[] field711;

    @OriginalMember(owner = "client!vg", name = "d", descriptor = "[I")
    private int[] field712;

    @OriginalMember(owner = "client!vg", name = "e", descriptor = "[I")
    private int[] field713;

    @OriginalMember(owner = "client!vg", name = "h", descriptor = "[I")
    private int[] field716;

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(I)I", line = 6)
    public final int method388(int arg0) {
        return this.method398(arg0);
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "()V", line = 15)
    public final void method389() {
        this.field710.field2270 = null;
        this.field716 = null;
        this.field712 = null;
        this.field711 = null;
        this.field713 = null;
    }

    @OriginalMember(owner = "client!vg", name = "b", descriptor = "()V", line = 24)
    public static void method390() {
        field709 = null;
    }

    @OriginalMember(owner = "client!vg", name = "c", descriptor = "()Z", line = 29)
    public final boolean method391() {
        int var1 = this.field712.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field712[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(II)I", line = 42)
    private final int method392(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field709[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field710.method1063((byte) 106) << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field710.method1063((byte) -116) << 16;
            }
            return var8;
        }
        int var3 = this.field710.method1063((byte) 126);
        int var4 = this.field710.method1081(false);
        if (var3 == 47) {
            this.field710.field2289 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field710.method1085(118);
            var4 -= 3;
            int var6 = this.field711[arg0];
            this.field714 += (long) (this.field717 - var5) * (long) var6;
            this.field717 = var5;
            this.field710.field2289 += var4;
            return 2;
        } else {
            this.field710.field2289 += var4;
            return 3;
        }
    }

    @OriginalMember(owner = "client!vg", name = "b", descriptor = "(I)J", line = 84)
    public final long method393(int arg0) {
        return (long) this.field717 * (long) arg0 + this.field714;
    }

    @OriginalMember(owner = "client!vg", name = "d", descriptor = "()I", line = 89)
    public final int method394() {
        return this.field712.length;
    }

    @OriginalMember(owner = "client!vg", name = "e", descriptor = "()Z", line = 92)
    public final boolean method395() {
        return this.field710.field2270 != null;
    }

    @OriginalMember(owner = "client!vg", name = "f", descriptor = "()V", line = 100)
    public final void method396() {
        this.field710.field2289 = -1;
    }

    @OriginalMember(owner = "client!vg", name = "<init>", descriptor = "()V", line = 202)
    public class38() {
    }

    @OriginalMember(owner = "client!vg", name = "<init>", descriptor = "([B)V", line = 204)
    public class38(byte[] arg0) {
        this.method403(arg0);
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(J)V", line = 107)
    public final void method397(long arg0) {
        this.field714 = arg0;
        int var3 = this.field712.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field711[var4] = 0;
            this.field713[var4] = 0;
            this.field710.field2289 = this.field716[var4];
            this.method400(var4);
            this.field712[var4] = this.field710.field2289;
        }
    }

    @OriginalMember(owner = "client!vg", name = "c", descriptor = "(I)I", line = 130)
    private final int method398(int arg0) {
        byte var2 = this.field710.field2270[this.field710.field2289];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field713[arg0] = var3;
            this.field710.field2289++;
        } else {
            var3 = this.field713[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method392(arg0, var3);
        }
        int var4 = this.field710.method1081(false);
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field710.field2270[this.field710.field2289] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field710.field2289++;
                this.field713[arg0] = var5;
                return this.method392(arg0, var5);
            }
        }
        this.field710.field2289 += var4;
        return 0;
    }

    @OriginalMember(owner = "client!vg", name = "g", descriptor = "()I", line = 170)
    public final int method399() {
        int var1 = this.field712.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field712[var4] >= 0 && this.field711[var4] < var3) {
                var2 = var4;
                var3 = this.field711[var4];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!vg", name = "d", descriptor = "(I)V", line = 197)
    public final void method400(int arg0) {
        int var2 = this.field710.method1081(false);
        this.field711[arg0] += var2;
    }

    @OriginalMember(owner = "client!vg", name = "e", descriptor = "(I)V", line = 208)
    public final void method401(int arg0) {
        this.field712[arg0] = this.field710.field2289;
    }

    @OriginalMember(owner = "client!vg", name = "f", descriptor = "(I)V", line = 214)
    public final void method402(int arg0) {
        this.field710.field2289 = this.field712[arg0];
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "([B)V", line = 217)
    public final void method403(byte[] arg0) {
        this.field710.field2270 = arg0;
        this.field710.field2289 = 10;
        int var2 = this.field710.method1069((byte) -26);
        this.field715 = this.field710.method1069((byte) -103);
        this.field717 = 500000;
        this.field716 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var5 = this.field710.method1070(-32387);
            int var6 = this.field710.method1070(-32387);
            if (var5 == 1297379947) {
                this.field716[var3] = this.field710.field2289;
                var3++;
            }
            this.field710.field2289 += var6;
        }
        this.field714 = 0L;
        this.field712 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            this.field712[var4] = this.field716[var4];
        }
        this.field711 = new int[var2];
        this.field713 = new int[var2];
    }
}
