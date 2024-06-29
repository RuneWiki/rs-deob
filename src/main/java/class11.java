import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!em")
public class class11 {

    @OriginalMember(owner = "client!em", name = "b", descriptor = "Lkh;")
    private class14 field130 = new class14((byte[]) null);

    @OriginalMember(owner = "client!em", name = "a", descriptor = "[B")
    private static byte[] field129 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!em", name = "e", descriptor = "I")
    private int field133;

    @OriginalMember(owner = "client!em", name = "h", descriptor = "I")
    public int field136;

    @OriginalMember(owner = "client!em", name = "c", descriptor = "J")
    private long field131;

    @OriginalMember(owner = "client!em", name = "d", descriptor = "[I")
    private int[] field132;

    @OriginalMember(owner = "client!em", name = "f", descriptor = "[I")
    private int[] field134;

    @OriginalMember(owner = "client!em", name = "g", descriptor = "[I")
    private int[] field135;

    @OriginalMember(owner = "client!em", name = "i", descriptor = "[I")
    public int[] field137;

    @OriginalMember(owner = "client!em", name = "a", descriptor = "()V", line = 3)
    public static void method59() {
        field129 = null;
    }

    @OriginalMember(owner = "client!em", name = "b", descriptor = "()V", line = 6)
    public final void method60() {
        this.field130.field195 = -1;
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(I)I", line = 11)
    public final int method61(int arg0) {
        return this.method72(arg0);
    }

    @OriginalMember(owner = "client!em", name = "c", descriptor = "()I", line = 18)
    public final int method62() {
        int var1 = this.field135.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field135[var4] >= 0 && this.field137[var4] < var3) {
                var2 = var4;
                var3 = this.field137[var4];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!em", name = "d", descriptor = "()I", line = 43)
    public final int method63() {
        return this.field135.length;
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "([B)V", line = 49)
    public final void method64(byte[] arg0) {
        this.field130.field174 = arg0;
        this.field130.field195 = 10;
        int var2 = this.field130.method116(-1);
        this.field136 = this.field130.method116(-1);
        this.field133 = 500000;
        this.field132 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field130.method128((byte) 4);
            int var5 = this.field130.method128((byte) 4);
            if (var4 == 1297379947) {
                this.field132[var3] = this.field130.field195;
                var3++;
            }
            this.field130.field195 += var5;
        }
        this.field131 = 0L;
        this.field135 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field135[var6] = this.field132[var6];
        }
        this.field137 = new int[var2];
        this.field134 = new int[var2];
    }

    @OriginalMember(owner = "client!em", name = "b", descriptor = "(I)V", line = 102)
    public final void method65(int arg0) {
        this.field135[arg0] = this.field130.field195;
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(II)I", line = 106)
    private final int method66(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field129[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field130.method93(false) << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field130.method93(false) << 16;
            }
            return var8;
        }
        int var3 = this.field130.method93(false);
        int var4 = this.field130.method141((byte) 123);
        if (var3 == 47) {
            this.field130.field195 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field130.method114(0);
            var4 -= 3;
            int var6 = this.field137[arg0];
            this.field131 += (long) (this.field133 - var5) * (long) var6;
            this.field133 = var5;
            this.field130.field195 += var4;
            return 2;
        } else {
            this.field130.field195 += var4;
            return 3;
        }
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(J)V", line = 149)
    public final void method67(long arg0) {
        this.field131 = arg0;
        int var3 = this.field135.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field137[var4] = 0;
            this.field134[var4] = 0;
            this.field130.field195 = this.field132[var4];
            this.method71(var4);
            this.field135[var4] = this.field130.field195;
        }
    }

    @OriginalMember(owner = "client!em", name = "e", descriptor = "()Z", line = 173)
    public final boolean method68() {
        int var1 = this.field135.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field135[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!em", name = "c", descriptor = "(I)V", line = 187)
    public final void method69(int arg0) {
        this.field130.field195 = this.field135[arg0];
    }

    @OriginalMember(owner = "client!em", name = "f", descriptor = "()Z", line = 191)
    public final boolean method70() {
        return this.field130.field174 != null;
    }

    @OriginalMember(owner = "client!em", name = "d", descriptor = "(I)V", line = 196)
    public final void method71(int arg0) {
        int var2 = this.field130.method141((byte) 124);
        this.field137[arg0] += var2;
    }

    @OriginalMember(owner = "client!em", name = "e", descriptor = "(I)I", line = 203)
    private final int method72(int arg0) {
        byte var2 = this.field130.field174[this.field130.field195];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field134[arg0] = var3;
            this.field130.field195++;
        } else {
            var3 = this.field134[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method66(arg0, var3);
        }
        int var4 = this.field130.method141((byte) 120);
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field130.field174[this.field130.field195] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field130.field195++;
                this.field134[arg0] = var5;
                return this.method66(arg0, var5);
            }
        }
        this.field130.field195 += var4;
        return 0;
    }

    @OriginalMember(owner = "client!em", name = "g", descriptor = "()V", line = 241)
    public final void method73() {
        this.field130.field174 = null;
        this.field132 = null;
        this.field135 = null;
        this.field137 = null;
        this.field134 = null;
    }

    @OriginalMember(owner = "client!em", name = "<init>", descriptor = "()V", line = 264)
    public class11() {
    }

    @OriginalMember(owner = "client!em", name = "<init>", descriptor = "([B)V", line = 266)
    public class11(byte[] arg0) {
        this.method64(arg0);
    }

    @OriginalMember(owner = "client!em", name = "f", descriptor = "(I)J", line = 255)
    public final long method74(int arg0) {
        return (long) this.field133 * (long) arg0 + this.field131;
    }
}
