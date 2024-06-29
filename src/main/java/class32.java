import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ec")
public class class32 {

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "Lsb;")
    private class127 field729 = new class127(null);

    @OriginalMember(owner = "client!ec", name = "h", descriptor = "[B")
    private static byte[] field736 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "I")
    private int field730;

    @OriginalMember(owner = "client!ec", name = "c", descriptor = "I")
    public int field731;

    @OriginalMember(owner = "client!ec", name = "d", descriptor = "J")
    private long field732;

    @OriginalMember(owner = "client!ec", name = "e", descriptor = "[I")
    private int[] field733;

    @OriginalMember(owner = "client!ec", name = "f", descriptor = "[I")
    public int[] field734;

    @OriginalMember(owner = "client!ec", name = "g", descriptor = "[I")
    private int[] field735;

    @OriginalMember(owner = "client!ec", name = "i", descriptor = "[I")
    private int[] field737;

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "()I")
    public final int method275() {
        int var1 = this.field735.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field735[var4] >= 0 && this.field734[var4] < var3) {
                var2 = var4;
                var3 = this.field734[var4];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "()V")
    public static void method276() {
        field736 = null;
    }

    @OriginalMember(owner = "client!ec", name = "c", descriptor = "()I")
    public final int method277() {
        return this.field735.length;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(J)V")
    public final void method278(long arg0) {
        this.field732 = arg0;
        int var3 = this.field735.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field734[var4] = 0;
            this.field733[var4] = 0;
            this.field729.field2995 = this.field737[var4];
            this.method288(var4);
            this.field735[var4] = this.field729.field2995;
        }
    }

    @OriginalMember(owner = "client!ec", name = "d", descriptor = "()V")
    public final void method279() {
        this.field729.field2995 = -1;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(II)I")
    private final int method280(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field736[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field729.method1011(88) << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field729.method1011(52) << 16;
            }
            return var8;
        }
        int var3 = this.field729.method1011(114);
        int var4 = this.field729.method1041((byte) 91);
        if (var3 == 47) {
            this.field729.field2995 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field729.method1022(45);
            var4 -= 3;
            int var6 = this.field734[arg0];
            this.field732 += (long) (this.field730 - var5) * (long) var6;
            this.field730 = var5;
            this.field729.field2995 += var4;
            return 2;
        } else {
            this.field729.field2995 += var4;
            return 3;
        }
    }

    @OriginalMember(owner = "client!ec", name = "e", descriptor = "()Z")
    public final boolean method281() {
        int var1 = this.field735.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field735[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(I)I")
    public final int method282(int arg0) {
        return this.method289(arg0);
    }

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "(I)J")
    public final long method283(int arg0) {
        return (long) this.field730 * (long) arg0 + this.field732;
    }

    @OriginalMember(owner = "client!ec", name = "c", descriptor = "(I)V")
    public final void method284(int arg0) {
        this.field729.field2995 = this.field735[arg0];
    }

    @OriginalMember(owner = "client!ec", name = "f", descriptor = "()V")
    public final void method285() {
        this.field729.field2960 = null;
        this.field737 = null;
        this.field735 = null;
        this.field734 = null;
        this.field733 = null;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "([B)V")
    public final void method286(byte[] arg0) {
        this.field729.field2960 = arg0;
        this.field729.field2995 = 10;
        int var2 = this.field729.method1020(false);
        this.field731 = this.field729.method1020(false);
        this.field730 = 500000;
        this.field737 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var5 = this.field729.method986(78);
            int var6 = this.field729.method986(53);
            if (var5 == 1297379947) {
                this.field737[var3] = this.field729.field2995;
                var3++;
            }
            this.field729.field2995 += var6;
        }
        this.field732 = 0L;
        this.field735 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            this.field735[var4] = this.field737[var4];
        }
        this.field734 = new int[var2];
        this.field733 = new int[var2];
    }

    @OriginalMember(owner = "client!ec", name = "d", descriptor = "(I)V")
    public final void method287(int arg0) {
        this.field735[arg0] = this.field729.field2995;
    }

    @OriginalMember(owner = "client!ec", name = "e", descriptor = "(I)V")
    public final void method288(int arg0) {
        int var2 = this.field729.method1041((byte) 118);
        this.field734[arg0] += var2;
    }

    @OriginalMember(owner = "client!ec", name = "f", descriptor = "(I)I")
    private final int method289(int arg0) {
        byte var2 = this.field729.field2960[this.field729.field2995];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field733[arg0] = var3;
            this.field729.field2995++;
        } else {
            var3 = this.field733[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method280(arg0, var3);
        }
        int var4 = this.field729.method1041((byte) 112);
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field729.field2960[this.field729.field2995] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field729.field2995++;
                this.field733[arg0] = var5;
                return this.method280(arg0, var5);
            }
        }
        this.field729.field2995 += var4;
        return 0;
    }

    @OriginalMember(owner = "client!ec", name = "g", descriptor = "()Z")
    public final boolean method290() {
        return this.field729.field2960 != null;
    }

    @OriginalMember(owner = "client!ec", name = "<init>", descriptor = "()V")
    public class32() {
    }

    @OriginalMember(owner = "client!ec", name = "<init>", descriptor = "([B)V")
    public class32(byte[] arg0) {
        this.method286(arg0);
    }
}
