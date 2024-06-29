import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sj")
public class class218 {

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "Lfj;")
    private class3 field3511 = new class3((byte[]) null);

    @OriginalMember(owner = "client!sj", name = "b", descriptor = "[B")
    private static byte[] field3512 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!sj", name = "d", descriptor = "I")
    private int field3514;

    @OriginalMember(owner = "client!sj", name = "f", descriptor = "I")
    public int field3516;

    @OriginalMember(owner = "client!sj", name = "h", descriptor = "J")
    private long field3518;

    @OriginalMember(owner = "client!sj", name = "c", descriptor = "[I")
    public int[] field3513;

    @OriginalMember(owner = "client!sj", name = "e", descriptor = "[I")
    private int[] field3515;

    @OriginalMember(owner = "client!sj", name = "g", descriptor = "[I")
    private int[] field3517;

    @OriginalMember(owner = "client!sj", name = "i", descriptor = "[I")
    private int[] field3519;

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(I)I", line = 4)
    private final int method1373(int arg0) {
        byte var2 = this.field3511.field101[this.field3511.field44];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field3519[arg0] = var3;
            this.field3511.field44++;
        } else {
            var3 = this.field3519[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method1385(arg0, var3);
        }
        int var4 = this.field3511.method52(-97);
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field3511.field101[this.field3511.field44] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field3511.field44++;
                this.field3519[arg0] = var5;
                return this.method1385(arg0, var5);
            }
        }
        this.field3511.field44 += var4;
        return 0;
    }

    @OriginalMember(owner = "client!sj", name = "b", descriptor = "(I)V", line = 43)
    public final void method1374(int arg0) {
        this.field3515[arg0] = this.field3511.field44;
    }

    @OriginalMember(owner = "client!sj", name = "c", descriptor = "(I)I", line = 47)
    public final int method1375(int arg0) {
        return this.method1373(arg0);
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "()I", line = 53)
    public final int method1376() {
        return this.field3515.length;
    }

    @OriginalMember(owner = "client!sj", name = "b", descriptor = "()V", line = 60)
    public static void method1377() {
        field3512 = null;
    }

    @OriginalMember(owner = "client!sj", name = "d", descriptor = "(I)V", line = 65)
    public final void method1378(int arg0) {
        this.field3511.field44 = this.field3515[arg0];
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "([B)V", line = 68)
    public final void method1379(byte[] arg0) {
        this.field3511.field101 = arg0;
        this.field3511.field44 = 10;
        int var2 = this.field3511.method63((byte) 1);
        this.field3516 = this.field3511.method63((byte) 1);
        this.field3514 = 500000;
        this.field3517 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field3511.method71(-668527048);
            int var5 = this.field3511.method71(-668527048);
            if (var4 == 1297379947) {
                this.field3517[var3] = this.field3511.field44;
                var3++;
            }
            this.field3511.field44 += var5;
        }
        this.field3518 = 0L;
        this.field3515 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field3515[var6] = this.field3517[var6];
        }
        this.field3513 = new int[var2];
        this.field3519 = new int[var2];
    }

    @OriginalMember(owner = "client!sj", name = "<init>", descriptor = "()V", line = 261)
    public class218() {
    }

    @OriginalMember(owner = "client!sj", name = "<init>", descriptor = "([B)V", line = 264)
    public class218(byte[] arg0) {
        this.method1379(arg0);
    }

    @OriginalMember(owner = "client!sj", name = "c", descriptor = "()V", line = 126)
    public final void method1380() {
        this.field3511.field44 = -1;
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(J)V", line = 129)
    public final void method1381(long arg0) {
        this.field3518 = arg0;
        int var3 = this.field3515.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field3513[var4] = 0;
            this.field3519[var4] = 0;
            this.field3511.field44 = this.field3517[var4];
            this.method1387(var4);
            this.field3515[var4] = this.field3511.field44;
        }
    }

    @OriginalMember(owner = "client!sj", name = "e", descriptor = "(I)J", line = 149)
    public final long method1382(int arg0) {
        return (long) this.field3514 * (long) arg0 + this.field3518;
    }

    @OriginalMember(owner = "client!sj", name = "d", descriptor = "()Z", line = 152)
    public final boolean method1383() {
        return this.field3511.field101 != null;
    }

    @OriginalMember(owner = "client!sj", name = "e", descriptor = "()Z", line = 156)
    public final boolean method1384() {
        int var1 = this.field3515.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field3515[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(II)I", line = 170)
    private final int method1385(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field3512[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field3511.method64((byte) -85) << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field3511.method64((byte) 8) << 16;
            }
            return var8;
        }
        int var3 = this.field3511.method64((byte) 80);
        int var4 = this.field3511.method52(-114);
        if (var3 == 47) {
            this.field3511.field44 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field3511.method48(64);
            var4 -= 3;
            int var6 = this.field3513[arg0];
            this.field3518 += (long) (this.field3514 - var5) * (long) var6;
            this.field3514 = var5;
            this.field3511.field44 += var4;
            return 2;
        } else {
            this.field3511.field44 += var4;
            return 3;
        }
    }

    @OriginalMember(owner = "client!sj", name = "f", descriptor = "()V", line = 215)
    public final void method1386() {
        this.field3511.field101 = null;
        this.field3517 = null;
        this.field3515 = null;
        this.field3513 = null;
        this.field3519 = null;
    }

    @OriginalMember(owner = "client!sj", name = "f", descriptor = "(I)V", line = 226)
    public final void method1387(int arg0) {
        int var2 = this.field3511.method52(-81);
        this.field3513[arg0] += var2;
    }

    @OriginalMember(owner = "client!sj", name = "g", descriptor = "()I", line = 236)
    public final int method1388() {
        int var1 = this.field3515.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field3515[var4] >= 0 && this.field3513[var4] < var3) {
                var2 = var4;
                var3 = this.field3513[var4];
            }
        }
        return var2;
    }
}
