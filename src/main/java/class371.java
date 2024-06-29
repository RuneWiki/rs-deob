import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ns")
public class class371 {

    @OriginalMember(owner = "client!ns", name = "b", descriptor = "Lun;")
    private class389 field4990 = new class389(null);

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "[B")
    private static byte[] field4989 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!ns", name = "d", descriptor = "I")
    public int field4992;

    @OriginalMember(owner = "client!ns", name = "f", descriptor = "I")
    private int field4994;

    @OriginalMember(owner = "client!ns", name = "h", descriptor = "J")
    private long field4996;

    @OriginalMember(owner = "client!ns", name = "c", descriptor = "[I")
    private int[] field4991;

    @OriginalMember(owner = "client!ns", name = "e", descriptor = "[I")
    private int[] field4993;

    @OriginalMember(owner = "client!ns", name = "g", descriptor = "[I")
    public int[] field4995;

    @OriginalMember(owner = "client!ns", name = "i", descriptor = "[I")
    private int[] field4997;

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(J)V", line = 3)
    public final void method2149(long arg0) {
        this.field4996 = arg0;
        int var3 = this.field4993.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field4995[var4] = 0;
            this.field4991[var4] = 0;
            this.field4990.field5195 = this.field4997[var4];
            this.method2156(var4);
            this.field4993[var4] = this.field4990.field5195;
        }
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "()V", line = 21)
    public final void method2150() {
        this.field4990.field5205 = null;
        this.field4997 = null;
        this.field4993 = null;
        this.field4995 = null;
        this.field4991 = null;
    }

    @OriginalMember(owner = "client!ns", name = "b", descriptor = "()I", line = 31)
    public final int method2151() {
        return this.field4993.length;
    }

    @OriginalMember(owner = "client!ns", name = "c", descriptor = "()V", line = 35)
    public final void method2152() {
        this.field4990.field5195 = -1;
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(I)V", line = 38)
    public final void method2153(int arg0) {
        this.field4993[arg0] = this.field4990.field5195;
    }

    @OriginalMember(owner = "client!ns", name = "d", descriptor = "()Z", line = 42)
    public final boolean method2154() {
        return this.field4990.field5205 != null;
    }

    @OriginalMember(owner = "client!ns", name = "b", descriptor = "(I)I", line = 50)
    public final int method2155(int arg0) {
        return this.method2158(arg0);
    }

    @OriginalMember(owner = "client!ns", name = "c", descriptor = "(I)V", line = 60)
    public final void method2156(int arg0) {
        int var2 = this.field4990.method2245(-31438);
        this.field4995[arg0] += var2;
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(II)I", line = 64)
    private final int method2157(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field4989[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field4990.method2229(255) << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field4990.method2229(255) << 16;
            }
            return var8;
        }
        int var3 = this.field4990.method2229(255);
        int var4 = this.field4990.method2245(-31438);
        if (var3 == 47) {
            this.field4990.field5195 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field4990.method2258(-3);
            var4 -= 3;
            int var6 = this.field4995[arg0];
            this.field4996 += (long) (this.field4994 - var5) * (long) var6;
            this.field4994 = var5;
            this.field4990.field5195 += var4;
            return 2;
        } else {
            this.field4990.field5195 += var4;
            return 3;
        }
    }

    @OriginalMember(owner = "client!ns", name = "d", descriptor = "(I)I", line = 107)
    private final int method2158(int arg0) {
        byte var2 = this.field4990.field5205[this.field4990.field5195];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field4991[arg0] = var3;
            this.field4990.field5195++;
        } else {
            var3 = this.field4991[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method2157(arg0, var3);
        }
        int var4 = this.field4990.method2245(-31438);
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field4990.field5205[this.field4990.field5195] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field4990.field5195++;
                this.field4991[arg0] = var5;
                return this.method2157(arg0, var5);
            }
        }
        this.field4990.field5195 += var4;
        return 0;
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "([B)V", line = 145)
    public final void method2159(byte[] arg0) {
        this.field4990.field5205 = arg0;
        this.field4990.field5195 = 10;
        int var2 = this.field4990.method2260(-33);
        this.field4992 = this.field4990.method2260(-32);
        this.field4994 = 500000;
        this.field4997 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var5 = this.field4990.method2255(255);
            int var6 = this.field4990.method2255(255);
            if (var5 == 1297379947) {
                this.field4997[var3] = this.field4990.field5195;
                var3++;
            }
            this.field4990.field5195 += var6;
        }
        this.field4996 = 0L;
        this.field4993 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            this.field4993[var4] = this.field4997[var4];
        }
        this.field4995 = new int[var2];
        this.field4991 = new int[var2];
    }

    @OriginalMember(owner = "client!ns", name = "e", descriptor = "()I", line = 199)
    public final int method2160() {
        int var1 = this.field4993.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field4993[var4] >= 0 && this.field4995[var4] < var3) {
                var2 = var4;
                var3 = this.field4995[var4];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!ns", name = "e", descriptor = "(I)V", line = 225)
    public final void method2161(int arg0) {
        this.field4990.field5195 = this.field4993[arg0];
    }

    @OriginalMember(owner = "client!ns", name = "f", descriptor = "()V", line = 231)
    public static void method2162() {
        field4989 = null;
    }

    @OriginalMember(owner = "client!ns", name = "g", descriptor = "()Z", line = 238)
    public final boolean method2163() {
        int var1 = this.field4993.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field4993[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!ns", name = "<init>", descriptor = "()V", line = 264)
    public class371() {
    }

    @OriginalMember(owner = "client!ns", name = "<init>", descriptor = "([B)V", line = 266)
    public class371(byte[] arg0) {
        this.method2159(arg0);
    }

    @OriginalMember(owner = "client!ns", name = "f", descriptor = "(I)J", line = 260)
    public final long method2164(int arg0) {
        return (long) this.field4994 * (long) arg0 + this.field4996;
    }
}
