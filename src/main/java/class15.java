import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cc")
public class class15 {

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "Luc;")
    private class122 field374 = new class122(null);

    @OriginalMember(owner = "client!cc", name = "e", descriptor = "[B")
    private static byte[] field378 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "I")
    public int field375;

    @OriginalMember(owner = "client!cc", name = "c", descriptor = "I")
    private int field376;

    @OriginalMember(owner = "client!cc", name = "g", descriptor = "J")
    private long field380;

    @OriginalMember(owner = "client!cc", name = "d", descriptor = "[I")
    public int[] field377;

    @OriginalMember(owner = "client!cc", name = "f", descriptor = "[I")
    private int[] field379;

    @OriginalMember(owner = "client!cc", name = "h", descriptor = "[I")
    private int[] field381;

    @OriginalMember(owner = "client!cc", name = "i", descriptor = "[I")
    private int[] field382;

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(J)V", line = 3)
    public final void method86(long arg0) {
        this.field380 = arg0;
        int var3 = this.field381.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field377[var4] = 0;
            this.field379[var4] = 0;
            this.field374.field3047 = this.field382[var4];
            this.method102(var4);
            this.field381[var4] = this.field374.field3047;
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(I)V", line = 21)
    public final void method87(int arg0) {
        this.field381[arg0] = this.field374.field3047;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "()V", line = 25)
    public static void method88() {
        field378 = null;
    }

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "(I)J", line = 28)
    public final long method89(int arg0) {
        return (long) this.field376 * (long) arg0 + this.field380;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "([B)V", line = 32)
    public final void method90(byte[] arg0) {
        this.field374.field3074 = arg0;
        this.field374.field3047 = 10;
        int var2 = this.field374.method938((byte) 126);
        this.field375 = this.field374.method938((byte) -101);
        this.field376 = 500000;
        this.field382 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var5 = this.field374.method952(false);
            int var6 = this.field374.method952(false);
            if (var5 == 1297379947) {
                this.field382[var3] = this.field374.field3047;
                var3++;
            }
            this.field374.field3047 += var6;
        }
        this.field381 = new int[this.field382.length];
        for (int var4 = 0; var4 < this.field381.length; var4++) {
            this.field381[var4] = this.field382[var4];
        }
        this.field377 = new int[var2];
        this.field379 = new int[var2];
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(II)I", line = 84)
    private final int method91(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field378[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field374.method943(-1025) << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field374.method943(-1025) << 16;
            }
            return var8;
        }
        int var3 = this.field374.method943(-1025);
        int var4 = this.field374.method926(2827);
        if (var3 == 47) {
            this.field374.field3047 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field374.method935((byte) -128);
            var4 -= 3;
            int var6 = this.field377[arg0];
            this.field380 += (long) (this.field376 - var5) * (long) var6;
            this.field376 = var5;
            this.field374.field3047 += var4;
            return 2;
        } else {
            this.field374.field3047 += var4;
            return 3;
        }
    }

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "()Z", line = 128)
    public final boolean method92() {
        return this.field374.field3047 < 0;
    }

    @OriginalMember(owner = "client!cc", name = "c", descriptor = "(I)I", line = 132)
    public final int method93(int arg0) {
        return this.method99(arg0);
    }

    @OriginalMember(owner = "client!cc", name = "c", descriptor = "()I", line = 140)
    public final int method94() {
        return this.field381.length;
    }

    @OriginalMember(owner = "client!cc", name = "d", descriptor = "()Z", line = 145)
    public final boolean method95() {
        int var1 = this.field381.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field381[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!cc", name = "e", descriptor = "()Z", line = 158)
    public final boolean method96() {
        return this.field374.field3074 != null;
    }

    @OriginalMember(owner = "client!cc", name = "f", descriptor = "()V", line = 161)
    public final void method97() {
        this.field374.field3047 = -1;
    }

    @OriginalMember(owner = "client!cc", name = "g", descriptor = "()V", line = 164)
    public final void method98() {
        this.field374.field3074 = null;
        this.field382 = null;
        this.field381 = null;
        this.field377 = null;
        this.field379 = null;
    }

    @OriginalMember(owner = "client!cc", name = "d", descriptor = "(I)I", line = 174)
    private final int method99(int arg0) {
        byte var2 = this.field374.field3074[this.field374.field3047];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field379[arg0] = var3;
            this.field374.field3047++;
        } else {
            var3 = this.field379[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method91(arg0, var3);
        }
        int var4 = this.field374.method926(2827);
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field374.field3074[this.field374.field3047] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field374.field3047++;
                this.field379[arg0] = var5;
                return this.method91(arg0, var5);
            }
        }
        this.field374.field3047 += var4;
        return 0;
    }

    @OriginalMember(owner = "client!cc", name = "e", descriptor = "(I)V", line = 217)
    public final void method100(int arg0) {
        this.field374.field3047 = this.field381[arg0];
    }

    @OriginalMember(owner = "client!cc", name = "h", descriptor = "()I", line = 224)
    public final int method101() {
        int var1 = this.field381.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field381[var4] >= 0 && this.field377[var4] < var3) {
                var2 = var4;
                var3 = this.field377[var4];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!cc", name = "f", descriptor = "(I)V", line = 257)
    public final void method102(int arg0) {
        int var2 = this.field374.method926(2827);
        this.field377[arg0] += var2;
    }
}
