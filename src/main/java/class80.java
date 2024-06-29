import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ld")
public class class80 {

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "Lbe;")
    private class13 field1665 = new class13(null);

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "[B")
    private static byte[] field1666 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!ld", name = "c", descriptor = "I")
    public int field1667;

    @OriginalMember(owner = "client!ld", name = "d", descriptor = "I")
    private int field1668;

    @OriginalMember(owner = "client!ld", name = "e", descriptor = "J")
    private long field1669;

    @OriginalMember(owner = "client!ld", name = "f", descriptor = "[I")
    private int[] field1670;

    @OriginalMember(owner = "client!ld", name = "g", descriptor = "[I")
    private int[] field1671;

    @OriginalMember(owner = "client!ld", name = "h", descriptor = "[I")
    public int[] field1672;

    @OriginalMember(owner = "client!ld", name = "i", descriptor = "[I")
    private int[] field1673;

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(I)V")
    public final void method637(int arg0) {
        this.field1671[arg0] = this.field1665.field309;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "([B)V")
    public final void method638(byte[] arg0) {
        this.field1665.field279 = arg0;
        this.field1665.field309 = 10;
        int var2 = this.field1665.method105(1375221240);
        this.field1667 = this.field1665.method105(1375221240);
        this.field1668 = 500000;
        this.field1670 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var5 = this.field1665.method112(false);
            int var6 = this.field1665.method112(false);
            if (var5 == 1297379947) {
                this.field1670[var3] = this.field1665.field309;
                var3++;
            }
            this.field1665.field309 += var6;
        }
        this.field1669 = 0L;
        this.field1671 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            this.field1671[var4] = this.field1670[var4];
        }
        this.field1672 = new int[var2];
        this.field1673 = new int[var2];
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "()V")
    public static void method639() {
        field1666 = null;
    }

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "(I)I")
    public final int method640(int arg0) {
        return this.method650(arg0);
    }

    @OriginalMember(owner = "client!ld", name = "c", descriptor = "(I)V")
    public final void method641(int arg0) {
        int var2 = this.field1665.method133(-9959);
        this.field1672[arg0] += var2;
    }

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "()Z")
    public final boolean method642() {
        return this.field1665.field279 != null;
    }

    @OriginalMember(owner = "client!ld", name = "c", descriptor = "()Z")
    public final boolean method643() {
        int var1 = this.field1671.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field1671[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!ld", name = "d", descriptor = "(I)J")
    public final long method644(int arg0) {
        return (long) this.field1668 * (long) arg0 + this.field1669;
    }

    @OriginalMember(owner = "client!ld", name = "d", descriptor = "()V")
    public final void method645() {
        this.field1665.field279 = null;
        this.field1670 = null;
        this.field1671 = null;
        this.field1672 = null;
        this.field1673 = null;
    }

    @OriginalMember(owner = "client!ld", name = "e", descriptor = "()I")
    public final int method646() {
        int var1 = this.field1671.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field1671[var4] >= 0 && this.field1672[var4] < var3) {
                var2 = var4;
                var3 = this.field1672[var4];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!ld", name = "f", descriptor = "()V")
    public final void method647() {
        this.field1665.field309 = -1;
    }

    @OriginalMember(owner = "client!ld", name = "e", descriptor = "(I)V")
    public final void method648(int arg0) {
        this.field1665.field309 = this.field1671[arg0];
    }

    @OriginalMember(owner = "client!ld", name = "g", descriptor = "()I")
    public final int method649() {
        return this.field1671.length;
    }

    @OriginalMember(owner = "client!ld", name = "f", descriptor = "(I)I")
    private final int method650(int arg0) {
        byte var2 = this.field1665.field279[this.field1665.field309];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field1673[arg0] = var3;
            this.field1665.field309++;
        } else {
            var3 = this.field1673[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method651(arg0, var3);
        }
        int var4 = this.field1665.method133(-9959);
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field1665.field279[this.field1665.field309] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field1665.field309++;
                this.field1673[arg0] = var5;
                return this.method651(arg0, var5);
            }
        }
        this.field1665.field309 += var4;
        return 0;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(II)I")
    private final int method651(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field1666[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field1665.method142(27467) << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field1665.method142(27467) << 16;
            }
            return var8;
        }
        int var3 = this.field1665.method142(27467);
        int var4 = this.field1665.method133(-9959);
        if (var3 == 47) {
            this.field1665.field309 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field1665.method149(true);
            var4 -= 3;
            int var6 = this.field1672[arg0];
            this.field1669 += (long) (this.field1668 - var5) * (long) var6;
            this.field1668 = var5;
            this.field1665.field309 += var4;
            return 2;
        } else {
            this.field1665.field309 += var4;
            return 3;
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(J)V")
    public final void method652(long arg0) {
        this.field1669 = arg0;
        int var3 = this.field1671.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field1672[var4] = 0;
            this.field1673[var4] = 0;
            this.field1665.field309 = this.field1670[var4];
            this.method641(var4);
            this.field1671[var4] = this.field1665.field309;
        }
    }

    @OriginalMember(owner = "client!ld", name = "<init>", descriptor = "()V")
    public class80() {
    }

    @OriginalMember(owner = "client!ld", name = "<init>", descriptor = "([B)V")
    public class80(byte[] arg0) {
        this.method638(arg0);
    }
}
