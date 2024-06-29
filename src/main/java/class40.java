import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!df")
public class class40 {

    @OriginalMember(owner = "client!df", name = "b", descriptor = "Lea;")
    private class46 field701 = new class46(null);

    @OriginalMember(owner = "client!df", name = "a", descriptor = "[B")
    private static byte[] field700 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!df", name = "f", descriptor = "I")
    private int field705;

    @OriginalMember(owner = "client!df", name = "g", descriptor = "I")
    public int field706;

    @OriginalMember(owner = "client!df", name = "h", descriptor = "J")
    private long field707;

    @OriginalMember(owner = "client!df", name = "c", descriptor = "[I")
    private int[] field702;

    @OriginalMember(owner = "client!df", name = "d", descriptor = "[I")
    private int[] field703;

    @OriginalMember(owner = "client!df", name = "e", descriptor = "[I")
    public int[] field704;

    @OriginalMember(owner = "client!df", name = "i", descriptor = "[I")
    private int[] field708;

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(I)V")
    public final void method259(int arg0) {
        this.field708[arg0] = this.field701.field831;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "()Z")
    public final boolean method260() {
        int var1 = this.field708.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field708[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!df", name = "b", descriptor = "(I)V")
    public final void method261(int arg0) {
        this.field701.field831 = this.field708[arg0];
    }

    @OriginalMember(owner = "client!df", name = "c", descriptor = "(I)J")
    public final long method262(int arg0) {
        return (long) this.field705 * (long) arg0 + this.field707;
    }

    @OriginalMember(owner = "client!df", name = "b", descriptor = "()Z")
    public final boolean method263() {
        return this.field701.field842 != null;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(J)V")
    public final void method264(long arg0) {
        this.field707 = arg0;
        int var3 = this.field708.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field704[var4] = 0;
            this.field702[var4] = 0;
            this.field701.field831 = this.field703[var4];
            this.method274(var4);
            this.field708[var4] = this.field701.field831;
        }
    }

    @OriginalMember(owner = "client!df", name = "c", descriptor = "()V")
    public final void method265() {
        this.field701.field842 = null;
        this.field703 = null;
        this.field708 = null;
        this.field704 = null;
        this.field702 = null;
    }

    @OriginalMember(owner = "client!df", name = "d", descriptor = "()I")
    public final int method266() {
        return this.field708.length;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(II)I")
    private final int method267(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field700[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field701.method347(26119) << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field701.method347(26119) << 16;
            }
            return var8;
        }
        int var3 = this.field701.method347(26119);
        int var4 = this.field701.method317((byte) -39);
        if (var3 == 47) {
            this.field701.field831 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field701.method304(-29629);
            var4 -= 3;
            int var6 = this.field704[arg0];
            this.field707 += (long) (this.field705 - var5) * (long) var6;
            this.field705 = var5;
            this.field701.field831 += var4;
            return 2;
        } else {
            this.field701.field831 += var4;
            return 3;
        }
    }

    @OriginalMember(owner = "client!df", name = "e", descriptor = "()V")
    public static void method268() {
        field700 = null;
    }

    @OriginalMember(owner = "client!df", name = "d", descriptor = "(I)I")
    private final int method269(int arg0) {
        byte var2 = this.field701.field842[this.field701.field831];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field702[arg0] = var3;
            this.field701.field831++;
        } else {
            var3 = this.field702[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method267(arg0, var3);
        }
        int var4 = this.field701.method317((byte) -39);
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field701.field842[this.field701.field831] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field701.field831++;
                this.field702[arg0] = var5;
                return this.method267(arg0, var5);
            }
        }
        this.field701.field831 += var4;
        return 0;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "([B)V")
    public final void method270(byte[] arg0) {
        this.field701.field842 = arg0;
        this.field701.field831 = 10;
        int var2 = this.field701.method301(80);
        this.field706 = this.field701.method301(109);
        this.field705 = 500000;
        this.field703 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var5 = this.field701.method323((byte) -111);
            int var6 = this.field701.method323((byte) -34);
            if (var5 == 1297379947) {
                this.field703[var3] = this.field701.field831;
                var3++;
            }
            this.field701.field831 += var6;
        }
        this.field707 = 0L;
        this.field708 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            this.field708[var4] = this.field703[var4];
        }
        this.field704 = new int[var2];
        this.field702 = new int[var2];
    }

    @OriginalMember(owner = "client!df", name = "e", descriptor = "(I)I")
    public final int method271(int arg0) {
        return this.method269(arg0);
    }

    @OriginalMember(owner = "client!df", name = "f", descriptor = "()I")
    public final int method272() {
        int var1 = this.field708.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field708[var4] >= 0 && this.field704[var4] < var3) {
                var2 = var4;
                var3 = this.field704[var4];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!df", name = "g", descriptor = "()V")
    public final void method273() {
        this.field701.field831 = -1;
    }

    @OriginalMember(owner = "client!df", name = "f", descriptor = "(I)V")
    public final void method274(int arg0) {
        int var2 = this.field701.method317((byte) -39);
        this.field704[arg0] += var2;
    }

    @OriginalMember(owner = "client!df", name = "<init>", descriptor = "()V")
    public class40() {
    }

    @OriginalMember(owner = "client!df", name = "<init>", descriptor = "([B)V")
    public class40(byte[] arg0) {
        this.method270(arg0);
    }
}
