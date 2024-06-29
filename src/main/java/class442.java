import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rf")
public class class442 {

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "Lec;")
    private class37 field6415 = new class37((byte[]) null);

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "[B")
    private static byte[] field6414 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!rf", name = "c", descriptor = "I")
    private int field6416;

    @OriginalMember(owner = "client!rf", name = "h", descriptor = "I")
    public int field6421;

    @OriginalMember(owner = "client!rf", name = "i", descriptor = "J")
    private long field6422;

    @OriginalMember(owner = "client!rf", name = "d", descriptor = "[I")
    private int[] field6417;

    @OriginalMember(owner = "client!rf", name = "e", descriptor = "[I")
    private int[] field6418;

    @OriginalMember(owner = "client!rf", name = "f", descriptor = "[I")
    public int[] field6419;

    @OriginalMember(owner = "client!rf", name = "g", descriptor = "[I")
    private int[] field6420;

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(II)I")
    private final int method2752(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field6414[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field6415.method271((byte) 114) << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field6415.method271((byte) 108) << 16;
            }
            return var8;
        }
        int var3 = this.field6415.method271((byte) 122);
        int var4 = this.field6415.method281(0);
        if (var3 == 47) {
            this.field6415.field565 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field6415.method295(true);
            var4 -= 3;
            int var6 = this.field6419[arg0];
            this.field6422 += (long) (this.field6416 - var5) * (long) var6;
            this.field6416 = var5;
            this.field6415.field565 += var4;
            return 2;
        } else {
            this.field6415.field565 += var4;
            return 3;
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "()I")
    public final int method2753() {
        return this.field6417.length;
    }

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "()V")
    public static void method2754() {
        field6414 = null;
    }

    @OriginalMember(owner = "client!rf", name = "c", descriptor = "()V")
    public final void method2755() {
        this.field6415.field578 = null;
        this.field6418 = null;
        this.field6417 = null;
        this.field6419 = null;
        this.field6420 = null;
    }

    @OriginalMember(owner = "client!rf", name = "d", descriptor = "()Z")
    public final boolean method2756() {
        int var1 = this.field6417.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field6417[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!rf", name = "e", descriptor = "()Z")
    public final boolean method2757() {
        return this.field6415.field578 != null;
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(I)V")
    public final void method2758(int arg0) {
        this.field6417[arg0] = this.field6415.field565;
    }

    @OriginalMember(owner = "client!rf", name = "f", descriptor = "()V")
    public final void method2759() {
        this.field6415.field565 = -1;
    }

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "(I)V")
    public final void method2760(int arg0) {
        int var2 = this.field6415.method281(0);
        this.field6419[arg0] += var2;
    }

    @OriginalMember(owner = "client!rf", name = "c", descriptor = "(I)J")
    public final long method2761(int arg0) {
        return (long) this.field6416 * (long) arg0 + this.field6422;
    }

    @OriginalMember(owner = "client!rf", name = "d", descriptor = "(I)V")
    public final void method2762(int arg0) {
        this.field6415.field565 = this.field6417[arg0];
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(J)V")
    public final void method2763(long arg0) {
        this.field6422 = arg0;
        int var3 = this.field6417.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field6419[var4] = 0;
            this.field6420[var4] = 0;
            this.field6415.field565 = this.field6418[var4];
            this.method2760(var4);
            this.field6417[var4] = this.field6415.field565;
        }
    }

    @OriginalMember(owner = "client!rf", name = "e", descriptor = "(I)I")
    private final int method2764(int arg0) {
        byte var2 = this.field6415.field578[this.field6415.field565];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field6420[arg0] = var3;
            this.field6415.field565++;
        } else {
            var3 = this.field6420[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method2752(arg0, var3);
        }
        int var4 = this.field6415.method281(0);
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field6415.field578[this.field6415.field565] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field6415.field565++;
                this.field6420[arg0] = var5;
                return this.method2752(arg0, var5);
            }
        }
        this.field6415.field565 += var4;
        return 0;
    }

    @OriginalMember(owner = "client!rf", name = "f", descriptor = "(I)I")
    public final int method2765(int arg0) {
        return this.method2764(arg0);
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "([B)V")
    public final void method2766(byte[] arg0) {
        this.field6415.field578 = arg0;
        this.field6415.field565 = 10;
        int var2 = this.field6415.method320((byte) -87);
        this.field6421 = this.field6415.method320((byte) -87);
        this.field6416 = 500000;
        this.field6418 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var5 = this.field6415.method278(-117);
            int var6 = this.field6415.method278(120);
            if (var5 == 1297379947) {
                this.field6418[var3] = this.field6415.field565;
                var3++;
            }
            this.field6415.field565 += var6;
        }
        this.field6422 = 0L;
        this.field6417 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            this.field6417[var4] = this.field6418[var4];
        }
        this.field6419 = new int[var2];
        this.field6420 = new int[var2];
    }

    @OriginalMember(owner = "client!rf", name = "g", descriptor = "()I")
    public final int method2767() {
        int var1 = this.field6417.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field6417[var4] >= 0 && this.field6419[var4] < var3) {
                var2 = var4;
                var3 = this.field6419[var4];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!rf", name = "<init>", descriptor = "()V")
    public class442() {
    }

    @OriginalMember(owner = "client!rf", name = "<init>", descriptor = "([B)V")
    public class442(byte[] arg0) {
        this.method2766(arg0);
    }
}
