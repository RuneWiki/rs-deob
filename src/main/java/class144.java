import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ok")
public class class144 {

    @OriginalMember(owner = "client!ok", name = "b", descriptor = "Lsd;")
    private class26 field2398 = new class26((byte[]) null);

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "[B")
    private static byte[] field2397 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!ok", name = "c", descriptor = "I")
    private int field2399;

    @OriginalMember(owner = "client!ok", name = "h", descriptor = "I")
    public int field2404;

    @OriginalMember(owner = "client!ok", name = "e", descriptor = "J")
    private long field2401;

    @OriginalMember(owner = "client!ok", name = "d", descriptor = "[I")
    private int[] field2400;

    @OriginalMember(owner = "client!ok", name = "f", descriptor = "[I")
    public int[] field2402;

    @OriginalMember(owner = "client!ok", name = "g", descriptor = "[I")
    private int[] field2403;

    @OriginalMember(owner = "client!ok", name = "i", descriptor = "[I")
    private int[] field2405;

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "()V", line = 5)
    public static void method1045() {
        field2397 = null;
    }

    @OriginalMember(owner = "client!ok", name = "b", descriptor = "()V", line = 9)
    public final void method1046() {
        this.field2398.field472 = null;
        this.field2403 = null;
        this.field2405 = null;
        this.field2402 = null;
        this.field2400 = null;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(I)I", line = 20)
    private final int method1047(int arg0) {
        byte var2 = this.field2398.field472[this.field2398.field478];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field2400[arg0] = var3;
            this.field2398.field478++;
        } else {
            var3 = this.field2400[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method1053(arg0, var3);
        }
        int var4 = this.field2398.method210((byte) 83);
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field2398.field472[this.field2398.field478] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field2398.field478++;
                this.field2400[arg0] = var5;
                return this.method1053(arg0, var5);
            }
        }
        this.field2398.field478 += var4;
        return 0;
    }

    @OriginalMember(owner = "client!ok", name = "c", descriptor = "()Z", line = 58)
    public final boolean method1048() {
        return this.field2398.field472 != null;
    }

    @OriginalMember(owner = "client!ok", name = "d", descriptor = "()I", line = 67)
    public final int method1049() {
        int var1 = this.field2405.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field2405[var4] >= 0 && this.field2402[var4] < var3) {
                var2 = var4;
                var3 = this.field2402[var4];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!ok", name = "b", descriptor = "(I)V", line = 97)
    public final void method1050(int arg0) {
        int var2 = this.field2398.method210((byte) 15);
        this.field2402[arg0] += var2;
    }

    @OriginalMember(owner = "client!ok", name = "e", descriptor = "()Z", line = 103)
    public final boolean method1051() {
        int var1 = this.field2405.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field2405[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!ok", name = "c", descriptor = "(I)I", line = 117)
    public final int method1052(int arg0) {
        return this.method1047(arg0);
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(II)I", line = 125)
    private final int method1053(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field2397[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field2398.method226(255) << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field2398.method226(255) << 16;
            }
            return var8;
        }
        int var3 = this.field2398.method226(255);
        int var4 = this.field2398.method210((byte) 96);
        if (var3 == 47) {
            this.field2398.field478 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field2398.method244(-26711);
            var4 -= 3;
            int var6 = this.field2402[arg0];
            this.field2401 += (long) (this.field2399 - var5) * (long) var6;
            this.field2399 = var5;
            this.field2398.field478 += var4;
            return 2;
        } else {
            this.field2398.field478 += var4;
            return 3;
        }
    }

    @OriginalMember(owner = "client!ok", name = "d", descriptor = "(I)J", line = 167)
    public final long method1054(int arg0) {
        return (long) this.field2399 * (long) arg0 + this.field2401;
    }

    @OriginalMember(owner = "client!ok", name = "f", descriptor = "()I", line = 170)
    public final int method1055() {
        return this.field2405.length;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "([B)V", line = 173)
    public final void method1056(byte[] arg0) {
        this.field2398.field472 = arg0;
        this.field2398.field478 = 10;
        int var2 = this.field2398.method197(-1);
        this.field2404 = this.field2398.method197(-1);
        this.field2399 = 500000;
        this.field2403 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field2398.method203(-22066);
            int var5 = this.field2398.method203(-22066);
            if (var4 == 1297379947) {
                this.field2403[var3] = this.field2398.field478;
                var3++;
            }
            this.field2398.field478 += var5;
        }
        this.field2401 = 0L;
        this.field2405 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field2405[var6] = this.field2403[var6];
        }
        this.field2402 = new int[var2];
        this.field2400 = new int[var2];
    }

    @OriginalMember(owner = "client!ok", name = "<init>", descriptor = "()V", line = 264)
    public class144() {
    }

    @OriginalMember(owner = "client!ok", name = "<init>", descriptor = "([B)V", line = 266)
    public class144(byte[] arg0) {
        this.method1056(arg0);
    }

    @OriginalMember(owner = "client!ok", name = "e", descriptor = "(I)V", line = 229)
    public final void method1057(int arg0) {
        this.field2398.field478 = this.field2405[arg0];
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(J)V", line = 232)
    public final void method1058(long arg0) {
        this.field2401 = arg0;
        int var3 = this.field2405.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2402[var4] = 0;
            this.field2400[var4] = 0;
            this.field2398.field478 = this.field2403[var4];
            this.method1050(var4);
            this.field2405[var4] = this.field2398.field478;
        }
    }

    @OriginalMember(owner = "client!ok", name = "f", descriptor = "(I)V", line = 252)
    public final void method1059(int arg0) {
        this.field2405[arg0] = this.field2398.field478;
    }

    @OriginalMember(owner = "client!ok", name = "g", descriptor = "()V", line = 257)
    public final void method1060() {
        this.field2398.field478 = -1;
    }
}
