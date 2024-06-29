import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public class class84 {

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "Llb;")
    private class112 field1214 = new class112((byte[]) null);

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "[B")
    private static byte[] field1213 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!ne", name = "d", descriptor = "I")
    private int field1216;

    @OriginalMember(owner = "client!ne", name = "i", descriptor = "I")
    public int field1221;

    @OriginalMember(owner = "client!ne", name = "e", descriptor = "J")
    private long field1217;

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "[I")
    public int[] field1215;

    @OriginalMember(owner = "client!ne", name = "f", descriptor = "[I")
    private int[] field1218;

    @OriginalMember(owner = "client!ne", name = "g", descriptor = "[I")
    private int[] field1219;

    @OriginalMember(owner = "client!ne", name = "h", descriptor = "[I")
    private int[] field1220;

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "()V", line = 5)
    public final void method589() {
        this.field1214.field1607 = null;
        this.field1219 = null;
        this.field1218 = null;
        this.field1215 = null;
        this.field1220 = null;
    }

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "()I", line = 16)
    public final int method590() {
        int var1 = this.field1218.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field1218[var4] >= 0 && this.field1215[var4] < var3) {
                var2 = var4;
                var3 = this.field1215[var4];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "([B)V", line = 41)
    public final void method591(byte[] arg0) {
        this.field1214.field1607 = arg0;
        this.field1214.field1640 = 10;
        int var2 = this.field1214.method759((byte) -102);
        this.field1221 = this.field1214.method759((byte) -77);
        this.field1216 = 500000;
        this.field1219 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field1214.method779(-27100);
            int var5 = this.field1214.method779(-27100);
            if (var4 == 1297379947) {
                this.field1219[var3] = this.field1214.field1640;
                var3++;
            }
            this.field1214.field1640 += var5;
        }
        this.field1217 = 0L;
        this.field1218 = new int[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            this.field1218[var6] = this.field1219[var6];
        }
        this.field1215 = new int[var2];
        this.field1220 = new int[var2];
    }

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "()Z", line = 95)
    public final boolean method592() {
        int var1 = this.field1218.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field1218[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(I)I", line = 118)
    public final int method593(int arg0) {
        return this.method598(arg0);
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(II)I", line = 125)
    private final int method594(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field1213[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field1214.method792(2) << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field1214.method792(2) << 16;
            }
            return var8;
        }
        int var3 = this.field1214.method792(2);
        int var4 = this.field1214.method772((byte) -109);
        if (var3 == 47) {
            this.field1214.field1640 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field1214.method757(11997);
            var4 -= 3;
            int var6 = this.field1215[arg0];
            this.field1217 += (long) (this.field1216 - var5) * (long) var6;
            this.field1216 = var5;
            this.field1214.field1640 += var4;
            return 2;
        } else {
            this.field1214.field1640 += var4;
            return 3;
        }
    }

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "(I)J", line = 169)
    public final long method595(int arg0) {
        return (long) this.field1216 * (long) arg0 + this.field1217;
    }

    @OriginalMember(owner = "client!ne", name = "<init>", descriptor = "()V", line = 264)
    public class84() {
    }

    @OriginalMember(owner = "client!ne", name = "<init>", descriptor = "([B)V", line = 266)
    public class84(byte[] arg0) {
        this.method591(arg0);
    }

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "(I)V", line = 176)
    public final void method596(int arg0) {
        this.field1218[arg0] = this.field1214.field1640;
    }

    @OriginalMember(owner = "client!ne", name = "d", descriptor = "(I)V", line = 179)
    public final void method597(int arg0) {
        this.field1214.field1640 = this.field1218[arg0];
    }

    @OriginalMember(owner = "client!ne", name = "e", descriptor = "(I)I", line = 184)
    private final int method598(int arg0) {
        byte var2 = this.field1214.field1607[this.field1214.field1640];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field1220[arg0] = var3;
            this.field1214.field1640++;
        } else {
            var3 = this.field1220[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method594(arg0, var3);
        }
        int var4 = this.field1214.method772((byte) -86);
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field1214.field1607[this.field1214.field1640] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field1214.field1640++;
                this.field1220[arg0] = var5;
                return this.method594(arg0, var5);
            }
        }
        this.field1214.field1640 += var4;
        return 0;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(J)V", line = 223)
    public final void method599(long arg0) {
        this.field1217 = arg0;
        int var3 = this.field1218.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field1215[var4] = 0;
            this.field1220[var4] = 0;
            this.field1214.field1640 = this.field1219[var4];
            this.method604(var4);
            this.field1218[var4] = this.field1214.field1640;
        }
    }

    @OriginalMember(owner = "client!ne", name = "d", descriptor = "()Z", line = 241)
    public final boolean method600() {
        return this.field1214.field1607 != null;
    }

    @OriginalMember(owner = "client!ne", name = "e", descriptor = "()I", line = 244)
    public final int method601() {
        return this.field1218.length;
    }

    @OriginalMember(owner = "client!ne", name = "f", descriptor = "()V", line = 247)
    public static void method602() {
        field1213 = null;
    }

    @OriginalMember(owner = "client!ne", name = "g", descriptor = "()V", line = 256)
    public final void method603() {
        this.field1214.field1640 = -1;
    }

    @OriginalMember(owner = "client!ne", name = "f", descriptor = "(I)V", line = 260)
    public final void method604(int arg0) {
        int var2 = this.field1214.method772((byte) -42);
        this.field1215[arg0] += var2;
    }
}
