import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!r")
public class class154 {

    @OriginalMember(owner = "client!r", name = "b", descriptor = "Lpg;")
    private class81 field2877 = new class81((byte[]) null);

    @OriginalMember(owner = "client!r", name = "a", descriptor = "[B")
    private static byte[] field2876 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!r", name = "f", descriptor = "I")
    private int field2881;

    @OriginalMember(owner = "client!r", name = "h", descriptor = "I")
    public int field2883;

    @OriginalMember(owner = "client!r", name = "e", descriptor = "J")
    private long field2880;

    @OriginalMember(owner = "client!r", name = "c", descriptor = "[I")
    private int[] field2878;

    @OriginalMember(owner = "client!r", name = "d", descriptor = "[I")
    private int[] field2879;

    @OriginalMember(owner = "client!r", name = "g", descriptor = "[I")
    public int[] field2882;

    @OriginalMember(owner = "client!r", name = "i", descriptor = "[I")
    private int[] field2884;

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(I)J")
    public final long method1135(int arg0) {
        return (long) this.field2881 * (long) arg0 + this.field2880;
    }

    @OriginalMember(owner = "client!r", name = "b", descriptor = "(I)V")
    public final void method1136(int arg0) {
        int var2 = this.field2877.method644(-95749960);
        this.field2882[arg0] += var2;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "()I")
    public final int method1137() {
        int var1 = this.field2884.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field2884[var4] >= 0 && this.field2882[var4] < var3) {
                var2 = var4;
                var3 = this.field2882[var4];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(II)I")
    private final int method1138(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field2876[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field2877.method622(true) << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field2877.method622(true) << 16;
            }
            return var8;
        }
        int var3 = this.field2877.method622(true);
        int var4 = this.field2877.method644(-95749960);
        if (var3 == 47) {
            this.field2877.field1541 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field2877.method615(-120);
            var4 -= 3;
            int var6 = this.field2882[arg0];
            this.field2880 += (long) (this.field2881 - var5) * (long) var6;
            this.field2881 = var5;
            this.field2877.field1541 += var4;
            return 2;
        } else {
            this.field2877.field1541 += var4;
            return 3;
        }
    }

    @OriginalMember(owner = "client!r", name = "c", descriptor = "(I)V")
    public final void method1139(int arg0) {
        this.field2884[arg0] = this.field2877.field1541;
    }

    @OriginalMember(owner = "client!r", name = "d", descriptor = "(I)V")
    public final void method1140(int arg0) {
        this.field2877.field1541 = this.field2884[arg0];
    }

    @OriginalMember(owner = "client!r", name = "b", descriptor = "()I")
    public final int method1141() {
        return this.field2884.length;
    }

    @OriginalMember(owner = "client!r", name = "e", descriptor = "(I)I")
    public final int method1142(int arg0) {
        return this.method1145(arg0);
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "([B)V")
    public final void method1143(byte[] arg0) {
        this.field2877.field1562 = arg0;
        this.field2877.field1541 = 10;
        int var2 = this.field2877.method658(102);
        this.field2883 = this.field2877.method658(-97);
        this.field2881 = 500000;
        this.field2878 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var5 = this.field2877.method620((byte) -82);
            int var6 = this.field2877.method620((byte) -82);
            if (var5 == 1297379947) {
                this.field2878[var3] = this.field2877.field1541;
                var3++;
            }
            this.field2877.field1541 += var6;
        }
        this.field2880 = 0L;
        this.field2884 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            this.field2884[var4] = this.field2878[var4];
        }
        this.field2882 = new int[var2];
        this.field2879 = new int[var2];
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(J)V")
    public final void method1144(long arg0) {
        this.field2880 = arg0;
        int var3 = this.field2884.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2882[var4] = 0;
            this.field2879[var4] = 0;
            this.field2877.field1541 = this.field2878[var4];
            this.method1136(var4);
            this.field2884[var4] = this.field2877.field1541;
        }
    }

    @OriginalMember(owner = "client!r", name = "f", descriptor = "(I)I")
    private final int method1145(int arg0) {
        byte var2 = this.field2877.field1562[this.field2877.field1541];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field2879[arg0] = var3;
            this.field2877.field1541++;
        } else {
            var3 = this.field2879[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method1138(arg0, var3);
        }
        int var4 = this.field2877.method644(-95749960);
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field2877.field1562[this.field2877.field1541] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field2877.field1541++;
                this.field2879[arg0] = var5;
                return this.method1138(arg0, var5);
            }
        }
        this.field2877.field1541 += var4;
        return 0;
    }

    @OriginalMember(owner = "client!r", name = "c", descriptor = "()Z")
    public final boolean method1146() {
        int var1 = this.field2884.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field2884[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!r", name = "d", descriptor = "()V")
    public final void method1147() {
        this.field2877.field1541 = -1;
    }

    @OriginalMember(owner = "client!r", name = "e", descriptor = "()V")
    public final void method1148() {
        this.field2877.field1562 = null;
        this.field2878 = null;
        this.field2884 = null;
        this.field2882 = null;
        this.field2879 = null;
    }

    @OriginalMember(owner = "client!r", name = "f", descriptor = "()Z")
    public final boolean method1149() {
        return this.field2877.field1562 != null;
    }

    @OriginalMember(owner = "client!r", name = "g", descriptor = "()V")
    public static void method1150() {
        field2876 = null;
    }

    @OriginalMember(owner = "client!r", name = "<init>", descriptor = "()V")
    public class154() {
    }

    @OriginalMember(owner = "client!r", name = "<init>", descriptor = "([B)V")
    public class154(byte[] arg0) {
        this.method1143(arg0);
    }
}
