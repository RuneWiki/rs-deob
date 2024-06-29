import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cc")
public class class16 {

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "Lfe;")
    private class36 field445 = new class36(null);

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "[B")
    private static byte[] field446 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!cc", name = "h", descriptor = "I")
    public int field452;

    @OriginalMember(owner = "client!cc", name = "i", descriptor = "I")
    private int field453;

    @OriginalMember(owner = "client!cc", name = "c", descriptor = "J")
    private long field447;

    @OriginalMember(owner = "client!cc", name = "d", descriptor = "[I")
    private int[] field448;

    @OriginalMember(owner = "client!cc", name = "e", descriptor = "[I")
    public int[] field449;

    @OriginalMember(owner = "client!cc", name = "f", descriptor = "[I")
    private int[] field450;

    @OriginalMember(owner = "client!cc", name = "g", descriptor = "[I")
    private int[] field451;

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(I)V", line = 5)
    public final void method119(int arg0) {
        int var2 = this.field445.method327(-114);
        this.field449[arg0] += var2;
    }

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "(I)V", line = 9)
    public final void method120(int arg0) {
        this.field445.field1057 = this.field451[arg0];
    }

    @OriginalMember(owner = "client!cc", name = "c", descriptor = "(I)I", line = 15)
    private final int method121(int arg0) {
        byte var2 = this.field445.field1067[this.field445.field1057];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field448[arg0] = var3;
            this.field445.field1057++;
        } else {
            var3 = this.field448[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method123(arg0, var3);
        }
        int var4 = this.field445.method327(-113);
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field445.field1067[this.field445.field1057] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field445.field1057++;
                this.field448[arg0] = var5;
                return this.method123(arg0, var5);
            }
        }
        this.field445.field1057 += var4;
        return 0;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "()Z", line = 54)
    public final boolean method122() {
        int var1 = this.field451.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field451[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(II)I", line = 67)
    private final int method123(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field446[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field445.method365((byte) -128) << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field445.method365((byte) -124) << 16;
            }
            return var8;
        }
        int var3 = this.field445.method365((byte) -124);
        int var4 = this.field445.method327(-122);
        if (var3 == 47) {
            this.field445.field1057 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field445.method343((byte) 5);
            var4 -= 3;
            int var6 = this.field449[arg0];
            this.field447 += (long) (this.field453 - var5) * (long) var6;
            this.field453 = var5;
            this.field445.field1057 += var4;
            return 2;
        } else {
            this.field445.field1057 += var4;
            return 3;
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(J)V", line = 109)
    public final void method124(long arg0) {
        this.field447 = arg0;
        int var3 = this.field451.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field449[var4] = 0;
            this.field448[var4] = 0;
            this.field445.field1057 = this.field450[var4];
            this.method119(var4);
            this.field451[var4] = this.field445.field1057;
        }
    }

    @OriginalMember(owner = "client!cc", name = "d", descriptor = "(I)J", line = 129)
    public final long method125(int arg0) {
        return (long) this.field453 * (long) arg0 + this.field447;
    }

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "()Z", line = 133)
    public final boolean method126() {
        return this.field445.field1057 < 0;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "([B)V", line = 136)
    public final void method127(byte[] arg0) {
        this.field445.field1067 = arg0;
        this.field445.field1057 = 10;
        int var2 = this.field445.method351((byte) -127);
        this.field452 = this.field445.method351((byte) -123);
        this.field453 = 500000;
        this.field450 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field445.method361((byte) 114);
            int var5 = this.field445.method361((byte) 115);
            if (var4 == 1297379947) {
                this.field450[var3] = this.field445.field1057;
                var3++;
            }
            this.field445.field1057 += var5;
        }
        this.field451 = (int[]) this.field450.clone();
        this.field449 = new int[var2];
        this.field448 = new int[var2];
    }

    @OriginalMember(owner = "client!cc", name = "c", descriptor = "()V", line = 181)
    public final void method128() {
        this.field445.field1057 = -1;
    }

    @OriginalMember(owner = "client!cc", name = "d", descriptor = "()V", line = 184)
    public final void method129() {
        this.field445.field1067 = null;
        this.field450 = null;
        this.field451 = null;
        this.field449 = null;
        this.field448 = null;
    }

    @OriginalMember(owner = "client!cc", name = "e", descriptor = "()Z", line = 193)
    public final boolean method130() {
        return this.field445.field1067 != null;
    }

    @OriginalMember(owner = "client!cc", name = "f", descriptor = "()I", line = 207)
    public final int method131() {
        return this.field451.length;
    }

    @OriginalMember(owner = "client!cc", name = "g", descriptor = "()I", line = 213)
    public final int method132() {
        int var1 = this.field451.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field451[var4] >= 0 && this.field449[var4] < var3) {
                var2 = var4;
                var3 = this.field449[var4];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!cc", name = "e", descriptor = "(I)V", line = 241)
    public final void method133(int arg0) {
        this.field451[arg0] = this.field445.field1057;
    }

    @OriginalMember(owner = "client!cc", name = "f", descriptor = "(I)I", line = 245)
    public final int method134(int arg0) {
        return this.method121(arg0);
    }

    @OriginalMember(owner = "client!cc", name = "h", descriptor = "()V", line = 252)
    public static void method135() {
        field446 = null;
    }
}
