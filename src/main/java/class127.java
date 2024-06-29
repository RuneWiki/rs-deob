import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!o")
public class class127 {

    @OriginalMember(owner = "client!o", name = "a", descriptor = "Lme;")
    private class114 field2409 = new class114(null);

    @OriginalMember(owner = "client!o", name = "i", descriptor = "[B")
    private static byte[] field2417 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!o", name = "g", descriptor = "I")
    public int field2415;

    @OriginalMember(owner = "client!o", name = "h", descriptor = "I")
    private int field2416;

    @OriginalMember(owner = "client!o", name = "d", descriptor = "J")
    private long field2412;

    @OriginalMember(owner = "client!o", name = "b", descriptor = "[I")
    public int[] field2410;

    @OriginalMember(owner = "client!o", name = "c", descriptor = "[I")
    private int[] field2411;

    @OriginalMember(owner = "client!o", name = "e", descriptor = "[I")
    private int[] field2413;

    @OriginalMember(owner = "client!o", name = "f", descriptor = "[I")
    private int[] field2414;

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(I)V")
    public final void method875(int arg0) {
        this.field2413[arg0] = this.field2409.field2170;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(II)I")
    private final int method876(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field2417[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field2409.method767(true) << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field2409.method767(true) << 16;
            }
            return var8;
        }
        int var3 = this.field2409.method767(true);
        int var4 = this.field2409.method792(true);
        if (var3 == 47) {
            this.field2409.field2170 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field2409.method771(121);
            var4 -= 3;
            int var6 = this.field2410[arg0];
            this.field2412 += (long) (this.field2416 - var5) * (long) var6;
            this.field2416 = var5;
            this.field2409.field2170 += var4;
            return 2;
        } else {
            this.field2409.field2170 += var4;
            return 3;
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "()V")
    public static void method877() {
        field2417 = null;
    }

    @OriginalMember(owner = "client!o", name = "b", descriptor = "(I)V")
    public final void method878(int arg0) {
        int var2 = this.field2409.method792(true);
        this.field2410[arg0] += var2;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(J)V")
    public final void method879(long arg0) {
        this.field2412 = arg0;
        int var3 = this.field2413.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2410[var4] = 0;
            this.field2411[var4] = 0;
            this.field2409.field2170 = this.field2414[var4];
            this.method878(var4);
            this.field2413[var4] = this.field2409.field2170;
        }
    }

    @OriginalMember(owner = "client!o", name = "b", descriptor = "()V")
    public final void method880() {
        this.field2409.field2160 = null;
        this.field2414 = null;
        this.field2413 = null;
        this.field2410 = null;
        this.field2411 = null;
    }

    @OriginalMember(owner = "client!o", name = "c", descriptor = "(I)I")
    public final int method881(int arg0) {
        return this.method886(arg0);
    }

    @OriginalMember(owner = "client!o", name = "c", descriptor = "()I")
    public final int method882() {
        return this.field2413.length;
    }

    @OriginalMember(owner = "client!o", name = "d", descriptor = "()V")
    public final void method883() {
        this.field2409.field2170 = -1;
    }

    @OriginalMember(owner = "client!o", name = "e", descriptor = "()Z")
    public final boolean method884() {
        int var1 = this.field2413.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field2413[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!o", name = "f", descriptor = "()Z")
    public final boolean method885() {
        return this.field2409.field2160 != null;
    }

    @OriginalMember(owner = "client!o", name = "d", descriptor = "(I)I")
    private final int method886(int arg0) {
        byte var2 = this.field2409.field2160[this.field2409.field2170];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field2411[arg0] = var3;
            this.field2409.field2170++;
        } else {
            var3 = this.field2411[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method876(arg0, var3);
        }
        int var4 = this.field2409.method792(true);
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field2409.field2160[this.field2409.field2170] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field2409.field2170++;
                this.field2411[arg0] = var5;
                return this.method876(arg0, var5);
            }
        }
        this.field2409.field2170 += var4;
        return 0;
    }

    @OriginalMember(owner = "client!o", name = "e", descriptor = "(I)J")
    public final long method887(int arg0) {
        return (long) this.field2416 * (long) arg0 + this.field2412;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "([B)V")
    public final void method888(byte[] arg0) {
        this.field2409.field2160 = arg0;
        this.field2409.field2170 = 10;
        int var2 = this.field2409.method762((byte) 121);
        this.field2415 = this.field2409.method762((byte) 103);
        this.field2416 = 500000;
        this.field2414 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var5 = this.field2409.method761(255);
            int var6 = this.field2409.method761(255);
            if (var5 == 1297379947) {
                this.field2414[var3] = this.field2409.field2170;
                var3++;
            }
            this.field2409.field2170 += var6;
        }
        this.field2412 = 0L;
        this.field2413 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            this.field2413[var4] = this.field2414[var4];
        }
        this.field2410 = new int[var2];
        this.field2411 = new int[var2];
    }

    @OriginalMember(owner = "client!o", name = "g", descriptor = "()I")
    public final int method889() {
        int var1 = this.field2413.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field2413[var4] >= 0 && this.field2410[var4] < var3) {
                var2 = var4;
                var3 = this.field2410[var4];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!o", name = "f", descriptor = "(I)V")
    public final void method890(int arg0) {
        this.field2409.field2170 = this.field2413[arg0];
    }

    @OriginalMember(owner = "client!o", name = "<init>", descriptor = "()V")
    public class127() {
    }

    @OriginalMember(owner = "client!o", name = "<init>", descriptor = "([B)V")
    public class127(byte[] arg0) {
        this.method888(arg0);
    }
}
