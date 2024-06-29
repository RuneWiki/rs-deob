import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lj")
public class class59 {

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "Llf;")
    private class143 field687 = new class143((byte[]) null);

    @OriginalMember(owner = "client!lj", name = "b", descriptor = "[B")
    private static byte[] field688 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!lj", name = "d", descriptor = "I")
    public int field690;

    @OriginalMember(owner = "client!lj", name = "g", descriptor = "I")
    private int field693;

    @OriginalMember(owner = "client!lj", name = "h", descriptor = "J")
    private long field694;

    @OriginalMember(owner = "client!lj", name = "c", descriptor = "[I")
    private int[] field689;

    @OriginalMember(owner = "client!lj", name = "e", descriptor = "[I")
    private int[] field691;

    @OriginalMember(owner = "client!lj", name = "f", descriptor = "[I")
    public int[] field692;

    @OriginalMember(owner = "client!lj", name = "i", descriptor = "[I")
    private int[] field695;

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "()V", line = 4)
    public static void method349() {
        field688 = null;
    }

    @OriginalMember(owner = "client!lj", name = "b", descriptor = "()V", line = 8)
    public final void method350() {
        this.field687.field2260 = null;
        this.field695 = null;
        this.field689 = null;
        this.field692 = null;
        this.field691 = null;
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(II)I", line = 17)
    private final int method351(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field688[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field687.method1043(true) << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field687.method1043(true) << 16;
            }
            return var8;
        }
        int var3 = this.field687.method1043(true);
        int var4 = this.field687.method1015(true);
        if (var3 == 47) {
            this.field687.field2295 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field687.method1017((byte) 101);
            var4 -= 3;
            int var6 = this.field692[arg0];
            this.field694 += (long) (this.field693 - var5) * (long) var6;
            this.field693 = var5;
            this.field687.field2295 += var4;
            return 2;
        } else {
            this.field687.field2295 += var4;
            return 3;
        }
    }

    @OriginalMember(owner = "client!lj", name = "c", descriptor = "()V", line = 59)
    public final void method352() {
        this.field687.field2295 = -1;
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(I)V", line = 63)
    public final void method353(int arg0) {
        int var2 = this.field687.method1015(true);
        this.field692[arg0] += var2;
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "([B)V", line = 70)
    public final void method354(byte[] arg0) {
        this.field687.field2260 = arg0;
        this.field687.field2295 = 10;
        int var2 = this.field687.method1051(1);
        this.field690 = this.field687.method1051(1);
        this.field693 = 500000;
        this.field695 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field687.method1057(-124);
            int var5 = this.field687.method1057(-127);
            if (var4 == 1297379947) {
                this.field695[var3] = this.field687.field2295;
                var3++;
            }
            this.field687.field2295 += var5;
        }
        this.field694 = 0L;
        this.field689 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field689[var6] = this.field695[var6];
        }
        this.field692 = new int[var2];
        this.field691 = new int[var2];
    }

    @OriginalMember(owner = "client!lj", name = "b", descriptor = "(I)I", line = 127)
    public final int method355(int arg0) {
        return this.method359(arg0);
    }

    @OriginalMember(owner = "client!lj", name = "c", descriptor = "(I)V", line = 133)
    public final void method356(int arg0) {
        this.field689[arg0] = this.field687.field2295;
    }

    @OriginalMember(owner = "client!lj", name = "d", descriptor = "(I)J", line = 139)
    public final long method357(int arg0) {
        return (long) this.field693 * (long) arg0 + this.field694;
    }

    @OriginalMember(owner = "client!lj", name = "<init>", descriptor = "()V", line = 264)
    public class59() {
    }

    @OriginalMember(owner = "client!lj", name = "<init>", descriptor = "([B)V", line = 266)
    public class59(byte[] arg0) {
        this.method354(arg0);
    }

    @OriginalMember(owner = "client!lj", name = "d", descriptor = "()I", line = 150)
    public final int method358() {
        return this.field689.length;
    }

    @OriginalMember(owner = "client!lj", name = "e", descriptor = "(I)I", line = 154)
    private final int method359(int arg0) {
        byte var2 = this.field687.field2260[this.field687.field2295];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field691[arg0] = var3;
            this.field687.field2295++;
        } else {
            var3 = this.field691[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method351(arg0, var3);
        }
        int var4 = this.field687.method1015(true);
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field687.field2260[this.field687.field2295] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field687.field2295++;
                this.field691[arg0] = var5;
                return this.method351(arg0, var5);
            }
        }
        this.field687.field2295 += var4;
        return 0;
    }

    @OriginalMember(owner = "client!lj", name = "f", descriptor = "(I)V", line = 193)
    public final void method360(int arg0) {
        this.field687.field2295 = this.field689[arg0];
    }

    @OriginalMember(owner = "client!lj", name = "e", descriptor = "()Z", line = 198)
    public final boolean method361() {
        int var1 = this.field689.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field689[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(J)V", line = 211)
    public final void method362(long arg0) {
        this.field694 = arg0;
        int var3 = this.field689.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field692[var4] = 0;
            this.field691[var4] = 0;
            this.field687.field2295 = this.field695[var4];
            this.method353(var4);
            this.field689[var4] = this.field687.field2295;
        }
    }

    @OriginalMember(owner = "client!lj", name = "f", descriptor = "()I", line = 232)
    public final int method363() {
        int var1 = this.field689.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field689[var4] >= 0 && this.field692[var4] < var3) {
                var2 = var4;
                var3 = this.field692[var4];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!lj", name = "g", descriptor = "()Z", line = 258)
    public final boolean method364() {
        return this.field687.field2260 != null;
    }
}
