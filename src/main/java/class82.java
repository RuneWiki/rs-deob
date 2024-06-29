import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nd")
public class class82 {

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "Lg;")
    private class39 field2166 = new class39(null);

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "[B")
    private static byte[] field2165 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!nd", name = "d", descriptor = "I")
    private int field2168;

    @OriginalMember(owner = "client!nd", name = "e", descriptor = "I")
    public int field2169;

    @OriginalMember(owner = "client!nd", name = "g", descriptor = "J")
    private long field2171;

    @OriginalMember(owner = "client!nd", name = "c", descriptor = "[I")
    private int[] field2167;

    @OriginalMember(owner = "client!nd", name = "f", descriptor = "[I")
    private int[] field2170;

    @OriginalMember(owner = "client!nd", name = "h", descriptor = "[I")
    public int[] field2172;

    @OriginalMember(owner = "client!nd", name = "i", descriptor = "[I")
    private int[] field2173;

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "()I", line = 5)
    public final int method716() {
        int var1 = this.field2170.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field2170[var4] >= 0 && this.field2172[var4] < var3) {
                var2 = var4;
                var3 = this.field2172[var4];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(I)V", line = 31)
    public final void method717(int arg0) {
        this.field2170[arg0] = this.field2166.field998;
    }

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "()V", line = 36)
    public static void method718() {
        field2165 = null;
    }

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "(I)V", line = 40)
    public final void method719(int arg0) {
        int var2 = this.field2166.method332((byte) 82);
        this.field2172[arg0] += var2;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(II)I", line = 44)
    private final int method720(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field2165[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field2166.method334(124) << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field2166.method334(115) << 16;
            }
            return var8;
        }
        int var3 = this.field2166.method334(107);
        int var4 = this.field2166.method332((byte) 109);
        if (var3 == 47) {
            this.field2166.field998 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field2166.method308((byte) -118);
            var4 -= 3;
            int var6 = this.field2172[arg0];
            this.field2171 += (long) (this.field2168 - var5) * (long) var6;
            this.field2168 = var5;
            this.field2166.field998 += var4;
            return 2;
        } else {
            this.field2166.field998 += var4;
            return 3;
        }
    }

    @OriginalMember(owner = "client!nd", name = "c", descriptor = "()Z", line = 90)
    public final boolean method721() {
        int var1 = this.field2170.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field2170[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!nd", name = "d", descriptor = "()I", line = 103)
    public final int method722() {
        return this.field2170.length;
    }

    @OriginalMember(owner = "client!nd", name = "e", descriptor = "()V", line = 107)
    public final void method723() {
        this.field2166.field994 = null;
        this.field2173 = null;
        this.field2170 = null;
        this.field2172 = null;
        this.field2167 = null;
    }

    @OriginalMember(owner = "client!nd", name = "c", descriptor = "(I)V", line = 120)
    public final void method724(int arg0) {
        this.field2166.field998 = this.field2170[arg0];
    }

    @OriginalMember(owner = "client!nd", name = "d", descriptor = "(I)J", line = 123)
    public final long method725(int arg0) {
        return (long) this.field2168 * (long) arg0 + this.field2171;
    }

    @OriginalMember(owner = "client!nd", name = "e", descriptor = "(I)I", line = 127)
    public final int method726(int arg0) {
        return this.method731(arg0);
    }

    @OriginalMember(owner = "client!nd", name = "f", descriptor = "()Z", line = 133)
    public final boolean method727() {
        return this.field2166.field994 != null;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(J)V", line = 136)
    public final void method728(long arg0) {
        this.field2171 = arg0;
        int var3 = this.field2170.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2172[var4] = 0;
            this.field2167[var4] = 0;
            this.field2166.field998 = this.field2173[var4];
            this.method719(var4);
            this.field2170[var4] = this.field2166.field998;
        }
    }

    @OriginalMember(owner = "client!nd", name = "g", descriptor = "()V", line = 155)
    public final void method729() {
        this.field2166.field998 = -1;
    }

    @OriginalMember(owner = "client!nd", name = "h", descriptor = "()Z", line = 158)
    public final boolean method730() {
        return this.field2166.field998 < 0;
    }

    @OriginalMember(owner = "client!nd", name = "f", descriptor = "(I)I", line = 162)
    private final int method731(int arg0) {
        byte var2 = this.field2166.field994[this.field2166.field998];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field2167[arg0] = var3;
            this.field2166.field998++;
        } else {
            var3 = this.field2167[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method720(arg0, var3);
        }
        int var4 = this.field2166.method332((byte) 118);
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field2166.field994[this.field2166.field998] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field2166.field998++;
                this.field2167[arg0] = var5;
                return this.method720(arg0, var5);
            }
        }
        this.field2166.field998 += var4;
        return 0;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "([B)V", line = 200)
    public final void method732(byte[] arg0) {
        this.field2166.field994 = arg0;
        this.field2166.field998 = 10;
        int var2 = this.field2166.method326(255);
        this.field2169 = this.field2166.method326(255);
        this.field2168 = 500000;
        this.field2173 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field2166.method329(144752608);
            int var5 = this.field2166.method329(144752608);
            if (var4 == 1297379947) {
                this.field2173[var3] = this.field2166.field998;
                var3++;
            }
            this.field2166.field998 += var5;
        }
        this.field2170 = (int[]) this.field2173.clone();
        this.field2172 = new int[var2];
        this.field2167 = new int[var2];
    }
}
