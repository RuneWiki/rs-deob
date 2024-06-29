import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mo")
public class class213 {

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "Lvt;")
    private class179 field2934 = new class179((byte[]) null);

    @OriginalMember(owner = "client!mo", name = "b", descriptor = "[B")
    private static byte[] field2935 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!mo", name = "e", descriptor = "I")
    public int field2938;

    @OriginalMember(owner = "client!mo", name = "i", descriptor = "I")
    private int field2942;

    @OriginalMember(owner = "client!mo", name = "c", descriptor = "J")
    private long field2936;

    @OriginalMember(owner = "client!mo", name = "d", descriptor = "[I")
    public int[] field2937;

    @OriginalMember(owner = "client!mo", name = "f", descriptor = "[I")
    private int[] field2939;

    @OriginalMember(owner = "client!mo", name = "g", descriptor = "[I")
    private int[] field2940;

    @OriginalMember(owner = "client!mo", name = "h", descriptor = "[I")
    private int[] field2941;

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "()I", line = 4)
    public final int method1184() {
        int var1 = this.field2939.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field2939[var4] >= 0 && this.field2937[var4] < var3) {
                var2 = var4;
                var3 = this.field2937[var4];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(I)V", line = 39)
    public final void method1185(int arg0) {
        int var2 = this.field2934.method932(96);
        this.field2937[arg0] += var2;
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(II)I", line = 44)
    private final int method1186(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field2935[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field2934.method895((byte) -98) << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field2934.method895((byte) -116) << 16;
            }
            return var8;
        }
        int var3 = this.field2934.method895((byte) -81);
        int var4 = this.field2934.method932(83);
        if (var3 == 47) {
            this.field2934.field2206 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field2934.method899((byte) -35);
            var4 -= 3;
            int var6 = this.field2937[arg0];
            this.field2936 += (long) (this.field2942 - var5) * (long) var6;
            this.field2942 = var5;
            this.field2934.field2206 += var4;
            return 2;
        } else {
            this.field2934.field2206 += var4;
            return 3;
        }
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(J)V", line = 86)
    public final void method1187(long arg0) {
        this.field2936 = arg0;
        int var3 = this.field2939.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field2937[var4] = 0;
            this.field2941[var4] = 0;
            this.field2934.field2206 = this.field2940[var4];
            this.method1185(var4);
            this.field2939[var4] = this.field2934.field2206;
        }
    }

    @OriginalMember(owner = "client!mo", name = "b", descriptor = "()V", line = 104)
    public final void method1188() {
        this.field2934.field2159 = null;
        this.field2940 = null;
        this.field2939 = null;
        this.field2937 = null;
        this.field2941 = null;
    }

    @OriginalMember(owner = "client!mo", name = "c", descriptor = "()I", line = 113)
    public final int method1189() {
        return this.field2939.length;
    }

    @OriginalMember(owner = "client!mo", name = "b", descriptor = "(I)I", line = 119)
    public final int method1190(int arg0) {
        return this.method1191(arg0);
    }

    @OriginalMember(owner = "client!mo", name = "<init>", descriptor = "()V", line = 263)
    public class213() {
    }

    @OriginalMember(owner = "client!mo", name = "<init>", descriptor = "([B)V", line = 266)
    public class213(byte[] arg0) {
        this.method1194(arg0);
    }

    @OriginalMember(owner = "client!mo", name = "c", descriptor = "(I)I", line = 130)
    private final int method1191(int arg0) {
        byte var2 = this.field2934.field2159[this.field2934.field2206];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field2941[arg0] = var3;
            this.field2934.field2206++;
        } else {
            var3 = this.field2941[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method1186(arg0, var3);
        }
        int var4 = this.field2934.method932(83);
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field2934.field2159[this.field2934.field2206] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field2934.field2206++;
                this.field2941[arg0] = var5;
                return this.method1186(arg0, var5);
            }
        }
        this.field2934.field2206 += var4;
        return 0;
    }

    @OriginalMember(owner = "client!mo", name = "d", descriptor = "(I)V", line = 168)
    public final void method1192(int arg0) {
        this.field2934.field2206 = this.field2939[arg0];
    }

    @OriginalMember(owner = "client!mo", name = "e", descriptor = "(I)V", line = 171)
    public final void method1193(int arg0) {
        this.field2939[arg0] = this.field2934.field2206;
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "([B)V", line = 176)
    public final void method1194(byte[] arg0) {
        this.field2934.field2159 = arg0;
        this.field2934.field2206 = 10;
        int var2 = this.field2934.method916(21933);
        this.field2938 = this.field2934.method916(21933);
        this.field2942 = 500000;
        this.field2940 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var5 = this.field2934.method939((byte) 54);
            int var6 = this.field2934.method939((byte) 52);
            if (var5 == 1297379947) {
                this.field2940[var3] = this.field2934.field2206;
                var3++;
            }
            this.field2934.field2206 += var6;
        }
        this.field2936 = 0L;
        this.field2939 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            this.field2939[var4] = this.field2940[var4];
        }
        this.field2937 = new int[var2];
        this.field2941 = new int[var2];
    }

    @OriginalMember(owner = "client!mo", name = "d", descriptor = "()Z", line = 231)
    public final boolean method1195() {
        int var1 = this.field2939.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field2939[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!mo", name = "e", descriptor = "()Z", line = 244)
    public final boolean method1196() {
        return this.field2934.field2159 != null;
    }

    @OriginalMember(owner = "client!mo", name = "f", descriptor = "()V", line = 251)
    public static void method1197() {
        field2935 = null;
    }

    @OriginalMember(owner = "client!mo", name = "g", descriptor = "()V", line = 254)
    public final void method1198() {
        this.field2934.field2206 = -1;
    }

    @OriginalMember(owner = "client!mo", name = "f", descriptor = "(I)J", line = 258)
    public final long method1199(int arg0) {
        return (long) this.field2942 * (long) arg0 + this.field2936;
    }
}
