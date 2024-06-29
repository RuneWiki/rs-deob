import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bk")
public class class158 {

    @OriginalMember(owner = "client!bk", name = "b", descriptor = "Lbc;")
    private class153 field2741 = new class153((byte[]) null);

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "[B")
    private static byte[] field2740 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!bk", name = "c", descriptor = "I")
    public int field2742;

    @OriginalMember(owner = "client!bk", name = "h", descriptor = "I")
    private int field2747;

    @OriginalMember(owner = "client!bk", name = "f", descriptor = "J")
    private long field2745;

    @OriginalMember(owner = "client!bk", name = "d", descriptor = "[I")
    public int[] field2743;

    @OriginalMember(owner = "client!bk", name = "e", descriptor = "[I")
    private int[] field2744;

    @OriginalMember(owner = "client!bk", name = "g", descriptor = "[I")
    private int[] field2746;

    @OriginalMember(owner = "client!bk", name = "i", descriptor = "[I")
    private int[] field2748;

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "([B)V", line = 4)
    public final void method1133(byte[] arg0) {
        this.field2741.field2598 = arg0;
        this.field2741.field2611 = 10;
        int var2 = this.field2741.method1090(false);
        this.field2742 = this.field2741.method1090(false);
        this.field2747 = 500000;
        this.field2746 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field2741.method1097((byte) -118);
            int var5 = this.field2741.method1097((byte) -74);
            if (var4 == 1297379947) {
                this.field2746[var3] = this.field2741.field2611;
                var3++;
            }
            this.field2741.field2611 += var5;
        }
        this.field2745 = 0L;
        this.field2748 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field2748[var6] = this.field2746[var6];
        }
        this.field2743 = new int[var2];
        this.field2744 = new int[var2];
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(J)V", line = 58)
    public final void method1134(long arg0) {
        this.field2745 = arg0;
        int var3 = this.field2748.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2743[var4] = 0;
            this.field2744[var4] = 0;
            this.field2741.field2611 = this.field2746[var4];
            this.method1140(var4);
            this.field2748[var4] = this.field2741.field2611;
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "()V", line = 78)
    public static void method1135() {
        field2740 = null;
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(I)J", line = 81)
    public final long method1136(int arg0) {
        return (long) this.field2747 * (long) arg0 + this.field2745;
    }

    @OriginalMember(owner = "client!bk", name = "b", descriptor = "(I)I", line = 85)
    public final int method1137(int arg0) {
        return this.method1144(arg0);
    }

    @OriginalMember(owner = "client!bk", name = "b", descriptor = "()Z", line = 96)
    public final boolean method1138() {
        int var1 = this.field2748.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field2748[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(II)I", line = 109)
    private final int method1139(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field2740[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field2741.method1082(-121) << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field2741.method1082(-91) << 16;
            }
            return var8;
        }
        int var3 = this.field2741.method1082(-77);
        int var4 = this.field2741.method1080(-113);
        if (var3 == 47) {
            this.field2741.field2611 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field2741.method1107((byte) 82);
            var4 -= 3;
            int var6 = this.field2743[arg0];
            this.field2745 += (long) (this.field2747 - var5) * (long) var6;
            this.field2747 = var5;
            this.field2741.field2611 += var4;
            return 2;
        } else {
            this.field2741.field2611 += var4;
            return 3;
        }
    }

    @OriginalMember(owner = "client!bk", name = "c", descriptor = "(I)V", line = 152)
    public final void method1140(int arg0) {
        int var2 = this.field2741.method1080(-108);
        this.field2743[arg0] += var2;
    }

    @OriginalMember(owner = "client!bk", name = "c", descriptor = "()Z", line = 156)
    public final boolean method1141() {
        return this.field2741.field2598 != null;
    }

    @OriginalMember(owner = "client!bk", name = "d", descriptor = "()V", line = 159)
    public final void method1142() {
        this.field2741.field2611 = -1;
    }

    @OriginalMember(owner = "client!bk", name = "e", descriptor = "()I", line = 163)
    public final int method1143() {
        return this.field2748.length;
    }

    @OriginalMember(owner = "client!bk", name = "d", descriptor = "(I)I", line = 167)
    private final int method1144(int arg0) {
        byte var2 = this.field2741.field2598[this.field2741.field2611];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field2744[arg0] = var3;
            this.field2741.field2611++;
        } else {
            var3 = this.field2744[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method1139(arg0, var3);
        }
        int var4 = this.field2741.method1080(-125);
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field2741.field2598[this.field2741.field2611] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field2741.field2611++;
                this.field2744[arg0] = var5;
                return this.method1139(arg0, var5);
            }
        }
        this.field2741.field2611 += var4;
        return 0;
    }

    @OriginalMember(owner = "client!bk", name = "e", descriptor = "(I)V", line = 205)
    public final void method1145(int arg0) {
        this.field2748[arg0] = this.field2741.field2611;
    }

    @OriginalMember(owner = "client!bk", name = "f", descriptor = "()V", line = 209)
    public final void method1146() {
        this.field2741.field2598 = null;
        this.field2746 = null;
        this.field2748 = null;
        this.field2743 = null;
        this.field2744 = null;
    }

    @OriginalMember(owner = "client!bk", name = "g", descriptor = "()I", line = 223)
    public final int method1147() {
        int var1 = this.field2748.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field2748[var4] >= 0 && this.field2743[var4] < var3) {
                var2 = var4;
                var3 = this.field2743[var4];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!bk", name = "f", descriptor = "(I)V", line = 248)
    public final void method1148(int arg0) {
        this.field2741.field2611 = this.field2748[arg0];
    }

    @OriginalMember(owner = "client!bk", name = "<init>", descriptor = "()V", line = 264)
    public class158() {
    }

    @OriginalMember(owner = "client!bk", name = "<init>", descriptor = "([B)V", line = 266)
    public class158(byte[] arg0) {
        this.method1133(arg0);
    }
}
