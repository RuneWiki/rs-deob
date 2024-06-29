import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!km")
public class class136 {

    @OriginalMember(owner = "client!km", name = "a", descriptor = "Ltl;")
    private class91 field1990 = new class91(null);

    @OriginalMember(owner = "client!km", name = "b", descriptor = "[B")
    private static byte[] field1991 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!km", name = "c", descriptor = "I")
    private int field1992;

    @OriginalMember(owner = "client!km", name = "e", descriptor = "I")
    public int field1994;

    @OriginalMember(owner = "client!km", name = "d", descriptor = "J")
    private long field1993;

    @OriginalMember(owner = "client!km", name = "f", descriptor = "[I")
    private int[] field1995;

    @OriginalMember(owner = "client!km", name = "g", descriptor = "[I")
    public int[] field1996;

    @OriginalMember(owner = "client!km", name = "h", descriptor = "[I")
    private int[] field1997;

    @OriginalMember(owner = "client!km", name = "i", descriptor = "[I")
    private int[] field1998;

    @OriginalMember(owner = "client!km", name = "a", descriptor = "()Z")
    public final boolean method898() {
        return this.field1990.field1277 != null;
    }

    @OriginalMember(owner = "client!km", name = "b", descriptor = "()V")
    public final void method899() {
        this.field1990.field1277 = null;
        this.field1995 = null;
        this.field1998 = null;
        this.field1996 = null;
        this.field1997 = null;
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(J)V")
    public final void method900(long arg0) {
        this.field1993 = arg0;
        int var3 = this.field1998.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field1996[var4] = 0;
            this.field1997[var4] = 0;
            this.field1990.field1292 = this.field1995[var4];
            this.method903(var4);
            this.field1998[var4] = this.field1990.field1292;
        }
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(I)I")
    public final int method901(int arg0) {
        return this.method907(arg0);
    }

    @OriginalMember(owner = "client!km", name = "c", descriptor = "()I")
    public final int method902() {
        int var1 = this.field1998.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field1998[var4] >= 0 && this.field1996[var4] < var3) {
                var2 = var4;
                var3 = this.field1996[var4];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!km", name = "b", descriptor = "(I)V")
    public final void method903(int arg0) {
        int var2 = this.field1990.method587((byte) -78);
        this.field1996[arg0] += var2;
    }

    @OriginalMember(owner = "client!km", name = "d", descriptor = "()V")
    public static void method904() {
        field1991 = null;
    }

    @OriginalMember(owner = "client!km", name = "e", descriptor = "()Z")
    public final boolean method905() {
        int var1 = this.field1998.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field1998[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!km", name = "c", descriptor = "(I)V")
    public final void method906(int arg0) {
        this.field1998[arg0] = this.field1990.field1292;
    }

    @OriginalMember(owner = "client!km", name = "d", descriptor = "(I)I")
    private final int method907(int arg0) {
        byte var2 = this.field1990.field1277[this.field1990.field1292];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field1997[arg0] = var3;
            this.field1990.field1292++;
        } else {
            var3 = this.field1997[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method908(arg0, var3);
        }
        int var4 = this.field1990.method587((byte) -78);
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field1990.field1277[this.field1990.field1292] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field1990.field1292++;
                this.field1997[arg0] = var5;
                return this.method908(arg0, var5);
            }
        }
        this.field1990.field1292 += var4;
        return 0;
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(II)I")
    private final int method908(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field1991[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field1990.method618((byte) 100) << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field1990.method618((byte) 100) << 16;
            }
            return var8;
        }
        int var3 = this.field1990.method618((byte) 100);
        int var4 = this.field1990.method587((byte) -78);
        if (var3 == 47) {
            this.field1990.field1292 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field1990.method641(32455);
            var4 -= 3;
            int var6 = this.field1996[arg0];
            this.field1993 += (long) (this.field1992 - var5) * (long) var6;
            this.field1992 = var5;
            this.field1990.field1292 += var4;
            return 2;
        } else {
            this.field1990.field1292 += var4;
            return 3;
        }
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "([B)V")
    public final void method909(byte[] arg0) {
        this.field1990.field1277 = arg0;
        this.field1990.field1292 = 10;
        int var2 = this.field1990.method631(10494);
        this.field1994 = this.field1990.method631(10494);
        this.field1992 = 500000;
        this.field1995 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var5 = this.field1990.method626((byte) 100);
            int var6 = this.field1990.method626((byte) 100);
            if (var5 == 1297379947) {
                this.field1995[var3] = this.field1990.field1292;
                var3++;
            }
            this.field1990.field1292 += var6;
        }
        this.field1993 = 0L;
        this.field1998 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            this.field1998[var4] = this.field1995[var4];
        }
        this.field1996 = new int[var2];
        this.field1997 = new int[var2];
    }

    @OriginalMember(owner = "client!km", name = "e", descriptor = "(I)J")
    public final long method910(int arg0) {
        return (long) this.field1992 * (long) arg0 + this.field1993;
    }

    @OriginalMember(owner = "client!km", name = "f", descriptor = "()I")
    public final int method911() {
        return this.field1998.length;
    }

    @OriginalMember(owner = "client!km", name = "g", descriptor = "()V")
    public final void method912() {
        this.field1990.field1292 = -1;
    }

    @OriginalMember(owner = "client!km", name = "f", descriptor = "(I)V")
    public final void method913(int arg0) {
        this.field1990.field1292 = this.field1998[arg0];
    }

    @OriginalMember(owner = "client!km", name = "<init>", descriptor = "()V")
    public class136() {
    }

    @OriginalMember(owner = "client!km", name = "<init>", descriptor = "([B)V")
    public class136(byte[] arg0) {
        this.method909(arg0);
    }
}
