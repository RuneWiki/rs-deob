import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public class class69 {

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "Lb;")
    private class94 field1101 = new class94((byte[]) null);

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "[B")
    private static byte[] field1103 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!ne", name = "d", descriptor = "I")
    private int field1104;

    @OriginalMember(owner = "client!ne", name = "e", descriptor = "I")
    public int field1105;

    @OriginalMember(owner = "client!ne", name = "h", descriptor = "J")
    private long field1108;

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "[I")
    private int[] field1102;

    @OriginalMember(owner = "client!ne", name = "f", descriptor = "[I")
    private int[] field1106;

    @OriginalMember(owner = "client!ne", name = "g", descriptor = "[I")
    public int[] field1107;

    @OriginalMember(owner = "client!ne", name = "i", descriptor = "[I")
    private int[] field1109;

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "()I", line = 4)
    public final int method490() {
        int var1 = this.field1106.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field1106[var4] >= 0 && this.field1107[var4] < var3) {
                var2 = var4;
                var3 = this.field1107[var4];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(I)V", line = 29)
    public final void method491(int arg0) {
        this.field1101.field1653 = this.field1106[arg0];
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(J)V", line = 34)
    public final void method492(long arg0) {
        this.field1108 = arg0;
        int var3 = this.field1106.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field1107[var4] = 0;
            this.field1102[var4] = 0;
            this.field1101.field1653 = this.field1109[var4];
            this.method503(var4);
            this.field1106[var4] = this.field1101.field1653;
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(II)I", line = 55)
    private final int method493(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field1103[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field1101.method756(915905888) << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field1101.method756(915905888) << 16;
            }
            return var8;
        }
        int var3 = this.field1101.method756(915905888);
        int var4 = this.field1101.method743(-108);
        if (var3 == 47) {
            this.field1101.field1653 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field1101.method732(-1);
            var4 -= 3;
            int var6 = this.field1107[arg0];
            this.field1108 += (long) (this.field1104 - var5) * (long) var6;
            this.field1104 = var5;
            this.field1101.field1653 += var4;
            return 2;
        } else {
            this.field1101.field1653 += var4;
            return 3;
        }
    }

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "()V", line = 97)
    public final void method494() {
        this.field1101.field1653 = -1;
    }

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "()Z", line = 101)
    public final boolean method495() {
        int var1 = this.field1106.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field1106[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "(I)I", line = 118)
    public final int method496(int arg0) {
        return this.method505(arg0);
    }

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "(I)V", line = 125)
    public final void method497(int arg0) {
        this.field1106[arg0] = this.field1101.field1653;
    }

    @OriginalMember(owner = "client!ne", name = "d", descriptor = "()Z", line = 128)
    public final boolean method498() {
        return this.field1101.field1681 != null;
    }

    @OriginalMember(owner = "client!ne", name = "e", descriptor = "()V", line = 132)
    public static void method499() {
        field1103 = null;
    }

    @OriginalMember(owner = "client!ne", name = "<init>", descriptor = "()V", line = 264)
    public class69() {
    }

    @OriginalMember(owner = "client!ne", name = "<init>", descriptor = "([B)V", line = 266)
    public class69(byte[] arg0) {
        this.method501(arg0);
    }

    @OriginalMember(owner = "client!ne", name = "f", descriptor = "()I", line = 140)
    public final int method500() {
        return this.field1106.length;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "([B)V", line = 143)
    public final void method501(byte[] arg0) {
        this.field1101.field1681 = arg0;
        this.field1101.field1653 = 10;
        int var2 = this.field1101.method761((byte) 108);
        this.field1105 = this.field1101.method761((byte) 108);
        this.field1104 = 500000;
        this.field1109 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field1101.method747(false);
            int var5 = this.field1101.method747(false);
            if (var4 == 1297379947) {
                this.field1109[var3] = this.field1101.field1653;
                var3++;
            }
            this.field1101.field1653 += var5;
        }
        this.field1108 = 0L;
        this.field1106 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field1106[var6] = this.field1109[var6];
        }
        this.field1107 = new int[var2];
        this.field1102 = new int[var2];
    }

    @OriginalMember(owner = "client!ne", name = "d", descriptor = "(I)J", line = 197)
    public final long method502(int arg0) {
        return (long) this.field1104 * (long) arg0 + this.field1108;
    }

    @OriginalMember(owner = "client!ne", name = "e", descriptor = "(I)V", line = 206)
    public final void method503(int arg0) {
        int var2 = this.field1101.method743(-64);
        this.field1107[arg0] += var2;
    }

    @OriginalMember(owner = "client!ne", name = "g", descriptor = "()V", line = 211)
    public final void method504() {
        this.field1101.field1681 = null;
        this.field1109 = null;
        this.field1106 = null;
        this.field1107 = null;
        this.field1102 = null;
    }

    @OriginalMember(owner = "client!ne", name = "f", descriptor = "(I)I", line = 223)
    private final int method505(int arg0) {
        byte var2 = this.field1101.field1681[this.field1101.field1653];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field1102[arg0] = var3;
            this.field1101.field1653++;
        } else {
            var3 = this.field1102[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method493(arg0, var3);
        }
        int var4 = this.field1101.method743(-122);
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field1101.field1681[this.field1101.field1653] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field1101.field1653++;
                this.field1102[arg0] = var5;
                return this.method493(arg0, var5);
            }
        }
        this.field1101.field1653 += var4;
        return 0;
    }
}
