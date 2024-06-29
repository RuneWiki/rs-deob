import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ec")
public class class32 {

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "Ldc;")
    private class25 field878 = new class25(null);

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "[B")
    private static byte[] field877 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!ec", name = "c", descriptor = "I")
    public int field879;

    @OriginalMember(owner = "client!ec", name = "e", descriptor = "I")
    private int field881;

    @OriginalMember(owner = "client!ec", name = "f", descriptor = "J")
    private long field882;

    @OriginalMember(owner = "client!ec", name = "d", descriptor = "[I")
    public int[] field880;

    @OriginalMember(owner = "client!ec", name = "g", descriptor = "[I")
    private int[] field883;

    @OriginalMember(owner = "client!ec", name = "h", descriptor = "[I")
    private int[] field884;

    @OriginalMember(owner = "client!ec", name = "i", descriptor = "[I")
    private int[] field885;

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(I)V", line = 3)
    public final void method372(int arg0) {
        this.field878.field710 = this.field883[arg0];
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "()Z", line = 7)
    public final boolean method373() {
        return this.field878.field711 != null;
    }

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "(I)V", line = 11)
    public final void method374(int arg0) {
        int var2 = this.field878.method294((byte) 29);
        this.field880[arg0] += var2;
    }

    @OriginalMember(owner = "client!ec", name = "c", descriptor = "(I)J", line = 16)
    public final long method375(int arg0) {
        return (long) this.field881 * (long) arg0 + this.field882;
    }

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "()I", line = 20)
    public final int method376() {
        int var1 = this.field883.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field883[var4] >= 0 && this.field880[var4] < var3) {
                var2 = var4;
                var3 = this.field880[var4];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!ec", name = "d", descriptor = "(I)I", line = 47)
    public final int method377(int arg0) {
        return this.method387(arg0);
    }

    @OriginalMember(owner = "client!ec", name = "c", descriptor = "()Z", line = 54)
    public final boolean method378() {
        int var1 = this.field883.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field883[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!ec", name = "d", descriptor = "()V", line = 68)
    public final void method379() {
        this.field878.field710 = -1;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(J)V", line = 71)
    public final void method380(long arg0) {
        this.field882 = arg0;
        int var3 = this.field883.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field880[var4] = 0;
            this.field884[var4] = 0;
            this.field878.field710 = this.field885[var4];
            this.method374(var4);
            this.field883[var4] = this.field878.field710;
        }
    }

    @OriginalMember(owner = "client!ec", name = "e", descriptor = "(I)V", line = 89)
    public final void method381(int arg0) {
        this.field883[arg0] = this.field878.field710;
    }

    @OriginalMember(owner = "client!ec", name = "e", descriptor = "()V", line = 92)
    public final void method382() {
        this.field878.field711 = null;
        this.field885 = null;
        this.field883 = null;
        this.field880 = null;
        this.field884 = null;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "([B)V", line = 104)
    public final void method383(byte[] arg0) {
        this.field878.field711 = arg0;
        this.field878.field710 = 10;
        int var2 = this.field878.method301(-4853);
        this.field879 = this.field878.method301(-4853);
        this.field881 = 500000;
        this.field885 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var5 = this.field878.method313((byte) -96);
            int var6 = this.field878.method313((byte) 47);
            if (var5 == 1297379947) {
                this.field885[var3] = this.field878.field710;
                var3++;
            }
            this.field878.field710 += var6;
        }
        this.field882 = 0L;
        this.field883 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            this.field883[var4] = this.field885[var4];
        }
        this.field880 = new int[var2];
        this.field884 = new int[var2];
    }

    @OriginalMember(owner = "client!ec", name = "f", descriptor = "()V", line = 159)
    public static void method384() {
        field877 = null;
    }

    @OriginalMember(owner = "client!ec", name = "g", descriptor = "()I", line = 164)
    public final int method385() {
        return this.field883.length;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(II)I", line = 167)
    private final int method386(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field877[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field878.method322((byte) -50) << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field878.method322((byte) -50) << 16;
            }
            return var8;
        }
        int var3 = this.field878.method322((byte) -50);
        int var4 = this.field878.method294((byte) 16);
        if (var3 == 47) {
            this.field878.field710 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field878.method310(true);
            var4 -= 3;
            int var6 = this.field880[arg0];
            this.field882 += (long) (this.field881 - var5) * (long) var6;
            this.field881 = var5;
            this.field878.field710 += var4;
            return 2;
        } else {
            this.field878.field710 += var4;
            return 3;
        }
    }

    @OriginalMember(owner = "client!ec", name = "<init>", descriptor = "()V", line = 263)
    public class32() {
    }

    @OriginalMember(owner = "client!ec", name = "<init>", descriptor = "([B)V", line = 265)
    public class32(byte[] arg0) {
        this.method383(arg0);
    }

    @OriginalMember(owner = "client!ec", name = "f", descriptor = "(I)I", line = 217)
    private final int method387(int arg0) {
        byte var2 = this.field878.field711[this.field878.field710];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field884[arg0] = var3;
            this.field878.field710++;
        } else {
            var3 = this.field884[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method386(arg0, var3);
        }
        int var4 = this.field878.method294((byte) 64);
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field878.field711[this.field878.field710] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field878.field710++;
                this.field884[arg0] = var5;
                return this.method386(arg0, var5);
            }
        }
        this.field878.field710 += var4;
        return 0;
    }
}
