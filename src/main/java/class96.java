import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qh")
public class class96 {

    @OriginalMember(owner = "client!qh", name = "b", descriptor = "Ljj;")
    private class44 field1297 = new class44((byte[]) null);

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "[B")
    private static byte[] field1296 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!qh", name = "g", descriptor = "I")
    private int field1302;

    @OriginalMember(owner = "client!qh", name = "i", descriptor = "I")
    public int field1304;

    @OriginalMember(owner = "client!qh", name = "d", descriptor = "J")
    private long field1299;

    @OriginalMember(owner = "client!qh", name = "c", descriptor = "[I")
    public int[] field1298;

    @OriginalMember(owner = "client!qh", name = "e", descriptor = "[I")
    private int[] field1300;

    @OriginalMember(owner = "client!qh", name = "f", descriptor = "[I")
    private int[] field1301;

    @OriginalMember(owner = "client!qh", name = "h", descriptor = "[I")
    private int[] field1303;

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(I)J", line = 7)
    public final long method631(int arg0) {
        return (long) this.field1302 * (long) arg0 + this.field1299;
    }

    @OriginalMember(owner = "client!qh", name = "b", descriptor = "(I)I", line = 13)
    public final int method632(int arg0) {
        return this.method640(arg0);
    }

    @OriginalMember(owner = "client!qh", name = "c", descriptor = "(I)V", line = 20)
    public final void method633(int arg0) {
        this.field1300[arg0] = this.field1297.field586;
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "()V", line = 23)
    public final void method634() {
        this.field1297.field586 = -1;
    }

    @OriginalMember(owner = "client!qh", name = "b", descriptor = "()Z", line = 27)
    public final boolean method635() {
        int var1 = this.field1300.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field1300[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!qh", name = "c", descriptor = "()I", line = 41)
    public final int method636() {
        int var1 = this.field1300.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field1300[var4] >= 0 && this.field1298[var4] < var3) {
                var2 = var4;
                var3 = this.field1298[var4];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!qh", name = "d", descriptor = "()V", line = 66)
    public static void method637() {
        field1296 = null;
    }

    @OriginalMember(owner = "client!qh", name = "d", descriptor = "(I)V", line = 69)
    public final void method638(int arg0) {
        this.field1297.field586 = this.field1300[arg0];
    }

    @OriginalMember(owner = "client!qh", name = "e", descriptor = "()V", line = 72)
    public final void method639() {
        this.field1297.field573 = null;
        this.field1303 = null;
        this.field1300 = null;
        this.field1298 = null;
        this.field1301 = null;
    }

    @OriginalMember(owner = "client!qh", name = "e", descriptor = "(I)I", line = 83)
    private final int method640(int arg0) {
        byte var2 = this.field1297.field573[this.field1297.field586];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field1301[arg0] = var3;
            this.field1297.field586++;
        } else {
            var3 = this.field1301[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method643(arg0, var3);
        }
        int var4 = this.field1297.method223((byte) -106);
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field1297.field573[this.field1297.field586] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field1297.field586++;
                this.field1301[arg0] = var5;
                return this.method643(arg0, var5);
            }
        }
        this.field1297.field586 += var4;
        return 0;
    }

    @OriginalMember(owner = "client!qh", name = "f", descriptor = "(I)V", line = 122)
    public final void method641(int arg0) {
        int var2 = this.field1297.method223((byte) -106);
        this.field1298[arg0] += var2;
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "([B)V", line = 126)
    public final void method642(byte[] arg0) {
        this.field1297.field573 = arg0;
        this.field1297.field586 = 10;
        int var2 = this.field1297.method271(21081);
        this.field1304 = this.field1297.method271(21081);
        this.field1302 = 500000;
        this.field1303 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field1297.method238((byte) 82);
            int var5 = this.field1297.method238((byte) 82);
            if (var4 == 1297379947) {
                this.field1303[var3] = this.field1297.field586;
                var3++;
            }
            this.field1297.field586 += var5;
        }
        this.field1299 = 0L;
        this.field1300 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field1300[var6] = this.field1303[var6];
        }
        this.field1298 = new int[var2];
        this.field1301 = new int[var2];
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(II)I", line = 181)
    private final int method643(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field1296[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field1297.method286((byte) -67) << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field1297.method286((byte) -89) << 16;
            }
            return var8;
        }
        int var3 = this.field1297.method286((byte) -81);
        int var4 = this.field1297.method223((byte) -106);
        if (var3 == 47) {
            this.field1297.field586 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field1297.method273(-867673064);
            var4 -= 3;
            int var6 = this.field1298[arg0];
            this.field1299 += (long) (this.field1302 - var5) * (long) var6;
            this.field1302 = var5;
            this.field1297.field586 += var4;
            return 2;
        } else {
            this.field1297.field586 += var4;
            return 3;
        }
    }

    @OriginalMember(owner = "client!qh", name = "f", descriptor = "()I", line = 223)
    public final int method644() {
        return this.field1300.length;
    }

    @OriginalMember(owner = "client!qh", name = "g", descriptor = "()Z", line = 233)
    public final boolean method645() {
        return this.field1297.field573 != null;
    }

    @OriginalMember(owner = "client!qh", name = "<init>", descriptor = "()V", line = 264)
    public class96() {
    }

    @OriginalMember(owner = "client!qh", name = "<init>", descriptor = "([B)V", line = 266)
    public class96(byte[] arg0) {
        this.method642(arg0);
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(J)V", line = 241)
    public final void method646(long arg0) {
        this.field1299 = arg0;
        int var3 = this.field1300.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field1298[var4] = 0;
            this.field1301[var4] = 0;
            this.field1297.field586 = this.field1303[var4];
            this.method641(var4);
            this.field1300[var4] = this.field1297.field586;
        }
    }
}
