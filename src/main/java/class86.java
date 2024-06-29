import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bk")
public class class86 {

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "Lbg;")
    private class242 field992 = new class242((byte[]) null);

    @OriginalMember(owner = "client!bk", name = "i", descriptor = "[B")
    private static byte[] field1000 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!bk", name = "d", descriptor = "I")
    private int field995;

    @OriginalMember(owner = "client!bk", name = "h", descriptor = "I")
    public int field999;

    @OriginalMember(owner = "client!bk", name = "c", descriptor = "J")
    private long field994;

    @OriginalMember(owner = "client!bk", name = "b", descriptor = "[I")
    public int[] field993;

    @OriginalMember(owner = "client!bk", name = "e", descriptor = "[I")
    private int[] field996;

    @OriginalMember(owner = "client!bk", name = "f", descriptor = "[I")
    private int[] field997;

    @OriginalMember(owner = "client!bk", name = "g", descriptor = "[I")
    private int[] field998;

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(I)I")
    public final int method522(int arg0) {
        return this.method523(arg0);
    }

    @OriginalMember(owner = "client!bk", name = "b", descriptor = "(I)I")
    private final int method523(int arg0) {
        byte var2 = this.field992.field3188[this.field992.field3211];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field997[arg0] = var3;
            this.field992.field3211++;
        } else {
            var3 = this.field997[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method533(arg0, var3);
        }
        int var4 = this.field992.method1566((byte) -126);
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field992.field3188[this.field992.field3211] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field992.field3211++;
                this.field997[arg0] = var5;
                return this.method533(arg0, var5);
            }
        }
        this.field992.field3211 += var4;
        return 0;
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "()Z")
    public final boolean method524() {
        return this.field992.field3188 != null;
    }

    @OriginalMember(owner = "client!bk", name = "b", descriptor = "()V")
    public final void method525() {
        this.field992.field3188 = null;
        this.field998 = null;
        this.field996 = null;
        this.field993 = null;
        this.field997 = null;
    }

    @OriginalMember(owner = "client!bk", name = "c", descriptor = "()V")
    public static void method526() {
        field1000 = null;
    }

    @OriginalMember(owner = "client!bk", name = "d", descriptor = "()V")
    public final void method527() {
        this.field992.field3211 = -1;
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(J)V")
    public final void method528(long arg0) {
        this.field994 = arg0;
        int var3 = this.field996.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field993[var4] = 0;
            this.field997[var4] = 0;
            this.field992.field3211 = this.field998[var4];
            this.method534(var4);
            this.field996[var4] = this.field992.field3211;
        }
    }

    @OriginalMember(owner = "client!bk", name = "e", descriptor = "()I")
    public final int method529() {
        int var1 = this.field996.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field996[var4] >= 0 && this.field993[var4] < var3) {
                var2 = var4;
                var3 = this.field993[var4];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!bk", name = "c", descriptor = "(I)V")
    public final void method530(int arg0) {
        this.field996[arg0] = this.field992.field3211;
    }

    @OriginalMember(owner = "client!bk", name = "d", descriptor = "(I)V")
    public final void method531(int arg0) {
        this.field992.field3211 = this.field996[arg0];
    }

    @OriginalMember(owner = "client!bk", name = "f", descriptor = "()Z")
    public final boolean method532() {
        int var1 = this.field996.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field996[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(II)I")
    private final int method533(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field1000[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field992.method1563(-128) << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field992.method1563(-128) << 16;
            }
            return var8;
        }
        int var3 = this.field992.method1563(-128);
        int var4 = this.field992.method1566((byte) -67);
        if (var3 == 47) {
            this.field992.field3211 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field992.method1545(8);
            var4 -= 3;
            int var6 = this.field993[arg0];
            this.field994 += (long) (this.field995 - var5) * (long) var6;
            this.field995 = var5;
            this.field992.field3211 += var4;
            return 2;
        } else {
            this.field992.field3211 += var4;
            return 3;
        }
    }

    @OriginalMember(owner = "client!bk", name = "e", descriptor = "(I)V")
    public final void method534(int arg0) {
        int var2 = this.field992.method1566((byte) -70);
        this.field993[arg0] += var2;
    }

    @OriginalMember(owner = "client!bk", name = "g", descriptor = "()I")
    public final int method535() {
        return this.field996.length;
    }

    @OriginalMember(owner = "client!bk", name = "f", descriptor = "(I)J")
    public final long method536(int arg0) {
        return (long) this.field995 * (long) arg0 + this.field994;
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "([B)V")
    public final void method537(byte[] arg0) {
        this.field992.field3188 = arg0;
        this.field992.field3211 = 10;
        int var2 = this.field992.method1587((byte) -102);
        this.field999 = this.field992.method1587((byte) -102);
        this.field995 = 500000;
        this.field998 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var5 = this.field992.method1576((byte) 122);
            int var6 = this.field992.method1576((byte) 126);
            if (var5 == 1297379947) {
                this.field998[var3] = this.field992.field3211;
                var3++;
            }
            this.field992.field3211 += var6;
        }
        this.field994 = 0L;
        this.field996 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            this.field996[var4] = this.field998[var4];
        }
        this.field993 = new int[var2];
        this.field997 = new int[var2];
    }

    @OriginalMember(owner = "client!bk", name = "<init>", descriptor = "()V")
    public class86() {
    }

    @OriginalMember(owner = "client!bk", name = "<init>", descriptor = "([B)V")
    public class86(byte[] arg0) {
        this.method537(arg0);
    }
}
