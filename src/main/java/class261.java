import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dea")
public class class261 {

    @OriginalMember(owner = "client!dea", name = "b", descriptor = "Lfca;")
    private class93 field3654 = new class93(null);

    @OriginalMember(owner = "client!dea", name = "a", descriptor = "[B")
    private static byte[] field3653 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!dea", name = "f", descriptor = "I")
    public int field3658;

    @OriginalMember(owner = "client!dea", name = "h", descriptor = "I")
    private int field3660;

    @OriginalMember(owner = "client!dea", name = "g", descriptor = "J")
    private long field3659;

    @OriginalMember(owner = "client!dea", name = "c", descriptor = "[I")
    public int[] field3655;

    @OriginalMember(owner = "client!dea", name = "d", descriptor = "[I")
    private int[] field3656;

    @OriginalMember(owner = "client!dea", name = "e", descriptor = "[I")
    private int[] field3657;

    @OriginalMember(owner = "client!dea", name = "i", descriptor = "[I")
    private int[] field3661;

    @OriginalMember(owner = "client!dea", name = "a", descriptor = "()V", line = 4)
    public static void method1694() {
        field3653 = null;
    }

    @OriginalMember(owner = "client!dea", name = "a", descriptor = "(I)V", line = 7)
    public final void method1695(int arg0) {
        this.field3654.field1442 = this.field3657[arg0];
    }

    @OriginalMember(owner = "client!dea", name = "a", descriptor = "([B)V", line = 11)
    public final void method1696(byte[] arg0) {
        this.field3654.field1413 = arg0;
        this.field3654.field1442 = 10;
        int var2 = this.field3654.method763(-106);
        this.field3658 = this.field3654.method763(-18);
        this.field3660 = 500000;
        this.field3656 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var5 = this.field3654.method773(3);
            int var6 = this.field3654.method773(3);
            if (var5 == 1297379947) {
                this.field3656[var3] = this.field3654.field1442;
                var3++;
            }
            this.field3654.field1442 += var6;
        }
        this.field3659 = 0L;
        this.field3657 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            this.field3657[var4] = this.field3656[var4];
        }
        this.field3655 = new int[var2];
        this.field3661 = new int[var2];
    }

    @OriginalMember(owner = "client!dea", name = "b", descriptor = "(I)I", line = 65)
    public final int method1697(int arg0) {
        return this.method1707(arg0);
    }

    @OriginalMember(owner = "client!dea", name = "a", descriptor = "(II)I", line = 73)
    private final int method1698(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field3653[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field3654.method793((byte) 68) << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field3654.method793((byte) 30) << 16;
            }
            return var8;
        }
        int var3 = this.field3654.method793((byte) 60);
        int var4 = this.field3654.method764(127);
        if (var3 == 47) {
            this.field3654.field1442 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field3654.method767((byte) -121);
            var4 -= 3;
            int var6 = this.field3655[arg0];
            this.field3659 += (long) (this.field3660 - var5) * (long) var6;
            this.field3660 = var5;
            this.field3654.field1442 += var4;
            return 2;
        } else {
            this.field3654.field1442 += var4;
            return 3;
        }
    }

    @OriginalMember(owner = "client!dea", name = "b", descriptor = "()V", line = 115)
    public final void method1699() {
        this.field3654.field1442 = -1;
    }

    @OriginalMember(owner = "client!dea", name = "c", descriptor = "(I)J", line = 122)
    public final long method1700(int arg0) {
        return (long) this.field3660 * (long) arg0 + this.field3659;
    }

    @OriginalMember(owner = "client!dea", name = "c", descriptor = "()Z", line = 125)
    public final boolean method1701() {
        return this.field3654.field1413 != null;
    }

    @OriginalMember(owner = "client!dea", name = "d", descriptor = "(I)V", line = 128)
    public final void method1702(int arg0) {
        this.field3657[arg0] = this.field3654.field1442;
    }

    @OriginalMember(owner = "client!dea", name = "d", descriptor = "()I", line = 131)
    public final int method1703() {
        return this.field3657.length;
    }

    @OriginalMember(owner = "client!dea", name = "e", descriptor = "()V", line = 134)
    public final void method1704() {
        this.field3654.field1413 = null;
        this.field3656 = null;
        this.field3657 = null;
        this.field3655 = null;
        this.field3661 = null;
    }

    @OriginalMember(owner = "client!dea", name = "f", descriptor = "()I", line = 145)
    public final int method1705() {
        int var1 = this.field3657.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field3657[var4] >= 0 && this.field3655[var4] < var3) {
                var2 = var4;
                var3 = this.field3655[var4];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!dea", name = "<init>", descriptor = "()V", line = 264)
    public class261() {
    }

    @OriginalMember(owner = "client!dea", name = "<init>", descriptor = "([B)V", line = 266)
    public class261(byte[] arg0) {
        this.method1696(arg0);
    }

    @OriginalMember(owner = "client!dea", name = "g", descriptor = "()Z", line = 177)
    public final boolean method1706() {
        int var1 = this.field3657.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field3657[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!dea", name = "e", descriptor = "(I)I", line = 194)
    private final int method1707(int arg0) {
        byte var2 = this.field3654.field1413[this.field3654.field1442];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field3661[arg0] = var3;
            this.field3654.field1442++;
        } else {
            var3 = this.field3661[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method1698(arg0, var3);
        }
        int var4 = this.field3654.method764(127);
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field3654.field1413[this.field3654.field1442] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field3654.field1442++;
                this.field3661[arg0] = var5;
                return this.method1698(arg0, var5);
            }
        }
        this.field3654.field1442 += var4;
        return 0;
    }

    @OriginalMember(owner = "client!dea", name = "a", descriptor = "(J)V", line = 236)
    public final void method1708(long arg0) {
        this.field3659 = arg0;
        int var3 = this.field3657.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field3655[var4] = 0;
            this.field3661[var4] = 0;
            this.field3654.field1442 = this.field3656[var4];
            this.method1709(var4);
            this.field3657[var4] = this.field3654.field1442;
        }
    }

    @OriginalMember(owner = "client!dea", name = "f", descriptor = "(I)V", line = 258)
    public final void method1709(int arg0) {
        int var2 = this.field3654.method764(127);
        this.field3655[arg0] += var2;
    }
}
