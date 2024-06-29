import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ea")
public class class39 {

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "Loa;")
    private class127 field740 = new class127(null);

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "[B")
    private static byte[] field739 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!ea", name = "g", descriptor = "I")
    public int field745;

    @OriginalMember(owner = "client!ea", name = "i", descriptor = "I")
    private int field747;

    @OriginalMember(owner = "client!ea", name = "c", descriptor = "J")
    private long field741;

    @OriginalMember(owner = "client!ea", name = "d", descriptor = "[I")
    private int[] field742;

    @OriginalMember(owner = "client!ea", name = "e", descriptor = "[I")
    private int[] field743;

    @OriginalMember(owner = "client!ea", name = "f", descriptor = "[I")
    public int[] field744;

    @OriginalMember(owner = "client!ea", name = "h", descriptor = "[I")
    private int[] field746;

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "([B)V")
    public final void method247(byte[] arg0) {
        this.field740.field2325 = arg0;
        this.field740.field2346 = 10;
        int var2 = this.field740.method785(true);
        this.field745 = this.field740.method785(true);
        this.field747 = 500000;
        this.field743 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var5 = this.field740.method814(8);
            int var6 = this.field740.method814(8);
            if (var5 == 1297379947) {
                this.field743[var3] = this.field740.field2346;
                var3++;
            }
            this.field740.field2346 += var6;
        }
        this.field741 = 0L;
        this.field746 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            this.field746[var4] = this.field743[var4];
        }
        this.field744 = new int[var2];
        this.field742 = new int[var2];
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "()V")
    public static void method248() {
        field739 = null;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(I)I")
    public final int method249(int arg0) {
        return this.method254(arg0);
    }

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "()V")
    public final void method250() {
        this.field740.field2325 = null;
        this.field743 = null;
        this.field746 = null;
        this.field744 = null;
        this.field742 = null;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(II)I")
    private final int method251(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field739[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field740.method819((byte) 22) << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field740.method819((byte) 22) << 16;
            }
            return var8;
        }
        int var3 = this.field740.method819((byte) 22);
        int var4 = this.field740.method775(122);
        if (var3 == 47) {
            this.field740.field2346 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field740.method773((byte) -123);
            var4 -= 3;
            int var6 = this.field744[arg0];
            this.field741 += (long) (this.field747 - var5) * (long) var6;
            this.field747 = var5;
            this.field740.field2346 += var4;
            return 2;
        } else {
            this.field740.field2346 += var4;
            return 3;
        }
    }

    @OriginalMember(owner = "client!ea", name = "c", descriptor = "()I")
    public final int method252() {
        int var1 = this.field746.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field746[var4] >= 0 && this.field744[var4] < var3) {
                var2 = var4;
                var3 = this.field744[var4];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(J)V")
    public final void method253(long arg0) {
        this.field741 = arg0;
        int var3 = this.field746.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field744[var4] = 0;
            this.field742[var4] = 0;
            this.field740.field2346 = this.field743[var4];
            this.method261(var4);
            this.field746[var4] = this.field740.field2346;
        }
    }

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "(I)I")
    private final int method254(int arg0) {
        byte var2 = this.field740.field2325[this.field740.field2346];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field742[arg0] = var3;
            this.field740.field2346++;
        } else {
            var3 = this.field742[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method251(arg0, var3);
        }
        int var4 = this.field740.method775(112);
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field740.field2325[this.field740.field2346] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field740.field2346++;
                this.field742[arg0] = var5;
                return this.method251(arg0, var5);
            }
        }
        this.field740.field2346 += var4;
        return 0;
    }

    @OriginalMember(owner = "client!ea", name = "c", descriptor = "(I)J")
    public final long method255(int arg0) {
        return (long) this.field747 * (long) arg0 + this.field741;
    }

    @OriginalMember(owner = "client!ea", name = "d", descriptor = "(I)V")
    public final void method256(int arg0) {
        this.field746[arg0] = this.field740.field2346;
    }

    @OriginalMember(owner = "client!ea", name = "e", descriptor = "(I)V")
    public final void method257(int arg0) {
        this.field740.field2346 = this.field746[arg0];
    }

    @OriginalMember(owner = "client!ea", name = "d", descriptor = "()Z")
    public final boolean method258() {
        return this.field740.field2325 != null;
    }

    @OriginalMember(owner = "client!ea", name = "e", descriptor = "()Z")
    public final boolean method259() {
        int var1 = this.field746.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field746[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!ea", name = "f", descriptor = "()I")
    public final int method260() {
        return this.field746.length;
    }

    @OriginalMember(owner = "client!ea", name = "f", descriptor = "(I)V")
    public final void method261(int arg0) {
        int var2 = this.field740.method775(-67);
        this.field744[arg0] += var2;
    }

    @OriginalMember(owner = "client!ea", name = "g", descriptor = "()V")
    public final void method262() {
        this.field740.field2346 = -1;
    }

    @OriginalMember(owner = "client!ea", name = "<init>", descriptor = "()V")
    public class39() {
    }

    @OriginalMember(owner = "client!ea", name = "<init>", descriptor = "([B)V")
    public class39(byte[] arg0) {
        this.method247(arg0);
    }
}
