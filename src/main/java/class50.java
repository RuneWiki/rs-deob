import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ib")
public class class50 {

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "Lwd;")
    private class131 field1219 = new class131(null);

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "[B")
    private static byte[] field1218 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!ib", name = "e", descriptor = "I")
    private int field1222;

    @OriginalMember(owner = "client!ib", name = "h", descriptor = "I")
    public int field1225;

    @OriginalMember(owner = "client!ib", name = "i", descriptor = "J")
    private long field1226;

    @OriginalMember(owner = "client!ib", name = "c", descriptor = "[I")
    public int[] field1220;

    @OriginalMember(owner = "client!ib", name = "d", descriptor = "[I")
    private int[] field1221;

    @OriginalMember(owner = "client!ib", name = "f", descriptor = "[I")
    private int[] field1223;

    @OriginalMember(owner = "client!ib", name = "g", descriptor = "[I")
    private int[] field1224;

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "()Z", line = 5)
    public final boolean method464() {
        int var1 = this.field1223.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field1223[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "()V", line = 18)
    public final void method465() {
        this.field1219.field3172 = null;
        this.field1221 = null;
        this.field1223 = null;
        this.field1220 = null;
        this.field1224 = null;
    }

    @OriginalMember(owner = "client!ib", name = "c", descriptor = "()V", line = 27)
    public static void method466() {
        field1218 = null;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(II)I", line = 31)
    private final int method467(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field1218[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field1219.method971(true) << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field1219.method971(true) << 16;
            }
            return var8;
        }
        int var3 = this.field1219.method971(true);
        int var4 = this.field1219.method1004(1408652391);
        if (var3 == 47) {
            this.field1219.field3182 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field1219.method974(255);
            var4 -= 3;
            int var6 = this.field1220[arg0];
            this.field1226 += (long) (this.field1222 - var5) * (long) var6;
            this.field1222 = var5;
            this.field1219.field3182 += var4;
            return 2;
        } else {
            this.field1219.field3182 += var4;
            return 3;
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(I)I", line = 76)
    private final int method468(int arg0) {
        byte var2 = this.field1219.field3172[this.field1219.field3182];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field1224[arg0] = var3;
            this.field1219.field3182++;
        } else {
            var3 = this.field1224[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method467(arg0, var3);
        }
        int var4 = this.field1219.method1004(1408652391);
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field1219.field3172[this.field1219.field3182] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field1219.field3182++;
                this.field1224[arg0] = var5;
                return this.method467(arg0, var5);
            }
        }
        this.field1219.field3182 += var4;
        return 0;
    }

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "(I)J", line = 115)
    public final long method469(int arg0) {
        return (long) this.field1222 * (long) arg0 + this.field1226;
    }

    @OriginalMember(owner = "client!ib", name = "d", descriptor = "()I", line = 119)
    public final int method470() {
        int var1 = this.field1223.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field1223[var4] >= 0 && this.field1220[var4] < var3) {
                var2 = var4;
                var3 = this.field1220[var4];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!ib", name = "c", descriptor = "(I)V", line = 145)
    public final void method471(int arg0) {
        this.field1219.field3182 = this.field1223[arg0];
    }

    @OriginalMember(owner = "client!ib", name = "d", descriptor = "(I)V", line = 149)
    public final void method472(int arg0) {
        int var2 = this.field1219.method1004(1408652391);
        this.field1220[arg0] += var2;
    }

    @OriginalMember(owner = "client!ib", name = "e", descriptor = "()Z", line = 153)
    public final boolean method473() {
        return this.field1219.field3172 != null;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(J)V", line = 159)
    public final void method474(long arg0) {
        this.field1226 = arg0;
        int var3 = this.field1223.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field1220[var4] = 0;
            this.field1224[var4] = 0;
            this.field1219.field3182 = this.field1221[var4];
            this.method472(var4);
            this.field1223[var4] = this.field1219.field3182;
        }
    }

    @OriginalMember(owner = "client!ib", name = "f", descriptor = "()V", line = 177)
    public final void method475() {
        this.field1219.field3182 = -1;
    }

    @OriginalMember(owner = "client!ib", name = "e", descriptor = "(I)I", line = 182)
    public final int method476(int arg0) {
        return this.method468(arg0);
    }

    @OriginalMember(owner = "client!ib", name = "g", descriptor = "()Z", line = 192)
    public final boolean method477() {
        return this.field1219.field3182 < 0;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "([B)V", line = 199)
    public final void method478(byte[] arg0) {
        this.field1219.field3172 = arg0;
        this.field1219.field3182 = 10;
        int var2 = this.field1219.method1001(65280);
        this.field1225 = this.field1219.method1001(65280);
        this.field1222 = 500000;
        this.field1221 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field1219.method994((byte) 36);
            int var5 = this.field1219.method994((byte) 36);
            if (var4 == 1297379947) {
                this.field1221[var3] = this.field1219.field3182;
                var3++;
            }
            this.field1219.field3182 += var5;
        }
        this.field1223 = (int[]) this.field1221.clone();
        this.field1220 = new int[var2];
        this.field1224 = new int[var2];
    }

    @OriginalMember(owner = "client!ib", name = "h", descriptor = "()I", line = 251)
    public final int method479() {
        return this.field1223.length;
    }

    @OriginalMember(owner = "client!ib", name = "f", descriptor = "(I)V", line = 255)
    public final void method480(int arg0) {
        this.field1223[arg0] = this.field1219.field3182;
    }
}
