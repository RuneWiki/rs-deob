import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ua")
public class class470 {

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "Lsi;")
    private class391 field6867 = new class391(null);

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "[B")
    private static byte[] field6866 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!ua", name = "e", descriptor = "I")
    public int field6870;

    @OriginalMember(owner = "client!ua", name = "h", descriptor = "I")
    private int field6873;

    @OriginalMember(owner = "client!ua", name = "i", descriptor = "J")
    private long field6874;

    @OriginalMember(owner = "client!ua", name = "c", descriptor = "[I")
    private int[] field6868;

    @OriginalMember(owner = "client!ua", name = "d", descriptor = "[I")
    private int[] field6869;

    @OriginalMember(owner = "client!ua", name = "f", descriptor = "[I")
    private int[] field6871;

    @OriginalMember(owner = "client!ua", name = "g", descriptor = "[I")
    public int[] field6872;

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "()V", line = 4)
    public static void method2753() {
        field6866 = null;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(I)J", line = 8)
    public final long method2754(int arg0) {
        return (long) this.field6873 * (long) arg0 + this.field6874;
    }

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "(I)I", line = 13)
    private final int method2755(int arg0) {
        byte var2 = this.field6867.field5678[this.field6867.field5719];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field6871[arg0] = var3;
            this.field6867.field5719++;
        } else {
            var3 = this.field6871[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method2764(arg0, var3);
        }
        int var4 = this.field6867.method2308((byte) 64);
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field6867.field5678[this.field6867.field5719] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field6867.field5719++;
                this.field6871[arg0] = var5;
                return this.method2764(arg0, var5);
            }
        }
        this.field6867.field5719 += var4;
        return 0;
    }

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "()I", line = 53)
    public final int method2756() {
        int var1 = this.field6868.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field6868[var4] >= 0 && this.field6872[var4] < var3) {
                var2 = var4;
                var3 = this.field6872[var4];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!ua", name = "c", descriptor = "()V", line = 80)
    public final void method2757() {
        this.field6867.field5719 = -1;
    }

    @OriginalMember(owner = "client!ua", name = "c", descriptor = "(I)I", line = 85)
    public final int method2758(int arg0) {
        return this.method2755(arg0);
    }

    @OriginalMember(owner = "client!ua", name = "d", descriptor = "()V", line = 91)
    public final void method2759() {
        this.field6867.field5678 = null;
        this.field6869 = null;
        this.field6868 = null;
        this.field6872 = null;
        this.field6871 = null;
    }

    @OriginalMember(owner = "client!ua", name = "e", descriptor = "()I", line = 100)
    public final int method2760() {
        return this.field6868.length;
    }

    @OriginalMember(owner = "client!ua", name = "d", descriptor = "(I)V", line = 103)
    public final void method2761(int arg0) {
        this.field6868[arg0] = this.field6867.field5719;
    }

    @OriginalMember(owner = "client!ua", name = "e", descriptor = "(I)V", line = 107)
    public final void method2762(int arg0) {
        int var2 = this.field6867.method2308((byte) 64);
        this.field6872[arg0] += var2;
    }

    @OriginalMember(owner = "client!ua", name = "f", descriptor = "()Z", line = 115)
    public final boolean method2763() {
        int var1 = this.field6868.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field6868[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(II)I", line = 131)
    private final int method2764(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field6866[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field6867.method2348(-2) << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field6867.method2348(-2) << 16;
            }
            return var8;
        }
        int var3 = this.field6867.method2348(-2);
        int var4 = this.field6867.method2308((byte) 64);
        if (var3 == 47) {
            this.field6867.field5719 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field6867.method2338(true);
            var4 -= 3;
            int var6 = this.field6872[arg0];
            this.field6874 += (long) (this.field6873 - var5) * (long) var6;
            this.field6873 = var5;
            this.field6867.field5719 += var4;
            return 2;
        } else {
            this.field6867.field5719 += var4;
            return 3;
        }
    }

    @OriginalMember(owner = "client!ua", name = "g", descriptor = "()Z", line = 173)
    public final boolean method2765() {
        return this.field6867.field5678 != null;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "([B)V", line = 176)
    public final void method2766(byte[] arg0) {
        this.field6867.field5678 = arg0;
        this.field6867.field5719 = 10;
        int var2 = this.field6867.method2353((byte) 122);
        this.field6870 = this.field6867.method2353((byte) 85);
        this.field6873 = 500000;
        this.field6869 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var5 = this.field6867.method2361((byte) -56);
            int var6 = this.field6867.method2361((byte) -56);
            if (var5 == 1297379947) {
                this.field6869[var3] = this.field6867.field5719;
                var3++;
            }
            this.field6867.field5719 += var6;
        }
        this.field6874 = 0L;
        this.field6868 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            this.field6868[var4] = this.field6869[var4];
        }
        this.field6872 = new int[var2];
        this.field6871 = new int[var2];
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(J)V", line = 232)
    public final void method2767(long arg0) {
        this.field6874 = arg0;
        int var3 = this.field6868.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field6872[var4] = 0;
            this.field6871[var4] = 0;
            this.field6867.field5719 = this.field6869[var4];
            this.method2762(var4);
            this.field6868[var4] = this.field6867.field5719;
        }
    }

    @OriginalMember(owner = "client!ua", name = "<init>", descriptor = "()V", line = 264)
    public class470() {
    }

    @OriginalMember(owner = "client!ua", name = "<init>", descriptor = "([B)V", line = 266)
    public class470(byte[] arg0) {
        this.method2766(arg0);
    }

    @OriginalMember(owner = "client!ua", name = "f", descriptor = "(I)V", line = 253)
    public final void method2768(int arg0) {
        this.field6867.field5719 = this.field6868[arg0];
    }
}
