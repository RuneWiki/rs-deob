import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jd")
public class class58 {

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "Lud;")
    private class119 field1314 = new class119(null);

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "[B")
    private static byte[] field1315 = new byte[] { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!jd", name = "c", descriptor = "I")
    public int field1316;

    @OriginalMember(owner = "client!jd", name = "f", descriptor = "I")
    private int field1319;

    @OriginalMember(owner = "client!jd", name = "i", descriptor = "J")
    private long field1322;

    @OriginalMember(owner = "client!jd", name = "d", descriptor = "[I")
    private int[] field1317;

    @OriginalMember(owner = "client!jd", name = "e", descriptor = "[I")
    public int[] field1318;

    @OriginalMember(owner = "client!jd", name = "g", descriptor = "[I")
    private int[] field1320;

    @OriginalMember(owner = "client!jd", name = "h", descriptor = "[I")
    private int[] field1321;

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "()I")
    public final int method460() {
        return this.field1321.length;
    }

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "()V")
    public final void method461() {
        this.field1314.field2531 = null;
        this.field1320 = null;
        this.field1321 = null;
        this.field1318 = null;
        this.field1317 = null;
    }

    @OriginalMember(owner = "client!jd", name = "c", descriptor = "()Z")
    public final boolean method462() {
        return this.field1314.field2531 != null;
    }

    @OriginalMember(owner = "client!jd", name = "d", descriptor = "()V")
    public static void method463() {
        field1315 = null;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(I)V")
    public final void method464(int arg0) {
        this.field1314.field2554 = this.field1321[arg0];
    }

    @OriginalMember(owner = "client!jd", name = "e", descriptor = "()V")
    public final void method465() {
        this.field1314.field2554 = -1;
    }

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "(I)J")
    public final long method466(int arg0) {
        return (long) this.field1319 * (long) arg0 + this.field1322;
    }

    @OriginalMember(owner = "client!jd", name = "c", descriptor = "(I)I")
    public final int method467(int arg0) {
        return this.method470(arg0);
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(II)I")
    private final int method468(int arg0, int arg1) {
        if (arg1 != 255) {
            byte var7 = field1315[arg1 - 128];
            int var8 = arg1;
            if (var7 >= 1) {
                var8 = arg1 | this.field1314.method879((byte) 45) << 8;
            }
            if (var7 >= 2) {
                var8 |= this.field1314.method879((byte) 45) << 16;
            }
            return var8;
        }
        int var3 = this.field1314.method879((byte) 45);
        int var4 = this.field1314.method863(-91);
        if (var3 == 47) {
            this.field1314.field2554 += var4;
            return 1;
        } else if (var3 == 81) {
            int var5 = this.field1314.method869(114);
            var4 -= 3;
            int var6 = this.field1318[arg0];
            this.field1322 += (long) (this.field1319 - var5) * (long) var6;
            this.field1319 = var5;
            this.field1314.field2554 += var4;
            return 2;
        } else {
            this.field1314.field2554 += var4;
            return 3;
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "([B)V")
    public final void method469(byte[] arg0) {
        this.field1314.field2531 = arg0;
        this.field1314.field2554 = 10;
        int var2 = this.field1314.method903(2);
        this.field1316 = this.field1314.method903(2);
        this.field1319 = 500000;
        this.field1320 = new int[var2];
        int var3 = 0;
        while (var3 < var2) {
            int var4 = this.field1314.method882(127);
            int var5 = this.field1314.method882(-113);
            if (var4 == 1297379947) {
                this.field1320[var3] = this.field1314.field2554;
                var3++;
            }
            this.field1314.field2554 += var5;
        }
        this.field1321 = (int[]) this.field1320.clone();
        this.field1318 = new int[var2];
        this.field1317 = new int[var2];
    }

    @OriginalMember(owner = "client!jd", name = "d", descriptor = "(I)I")
    private final int method470(int arg0) {
        byte var2 = this.field1314.field2531[this.field1314.field2554];
        int var3;
        if (var2 < 0) {
            var3 = var2 & 0xFF;
            this.field1317[arg0] = var3;
            this.field1314.field2554++;
        } else {
            var3 = this.field1317[arg0];
        }
        if (var3 != 240 && var3 != 247) {
            return this.method468(arg0, var3);
        }
        int var4 = this.field1314.method863(-124);
        if (var3 == 247 && var4 > 0) {
            int var5 = this.field1314.field2531[this.field1314.field2554] & 0xFF;
            if (var5 >= 241 && var5 <= 243 || var5 == 246 || var5 == 248 || var5 >= 250 && var5 <= 252 || var5 == 254) {
                this.field1314.field2554++;
                this.field1317[arg0] = var5;
                return this.method468(arg0, var5);
            }
        }
        this.field1314.field2554 += var4;
        return 0;
    }

    @OriginalMember(owner = "client!jd", name = "f", descriptor = "()Z")
    public final boolean method471() {
        int var1 = this.field1321.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (this.field1321[var2] >= 0) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!jd", name = "e", descriptor = "(I)V")
    public final void method472(int arg0) {
        int var2 = this.field1314.method863(-112);
        this.field1318[arg0] += var2;
    }

    @OriginalMember(owner = "client!jd", name = "g", descriptor = "()I")
    public final int method473() {
        int var1 = this.field1321.length;
        int var2 = -1;
        int var3 = Integer.MAX_VALUE;
        for (int var4 = 0; var4 < var1; var4++) {
            if (this.field1321[var4] >= 0 && this.field1318[var4] < var3) {
                var2 = var4;
                var3 = this.field1318[var4];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!jd", name = "f", descriptor = "(I)V")
    public final void method474(int arg0) {
        this.field1321[arg0] = this.field1314.field2554;
    }

    @OriginalMember(owner = "client!jd", name = "h", descriptor = "()Z")
    public final boolean method475() {
        return this.field1314.field2554 < 0;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(J)V")
    public final void method476(long arg0) {
        this.field1322 = arg0;
        int var3 = this.field1321.length;
        for (int var4 = 0; var4 < var3; var4++) {
            this.field1318[var4] = 0;
            this.field1317[var4] = 0;
            this.field1314.field2554 = this.field1320[var4];
            this.method472(var4);
            this.field1321[var4] = this.field1314.field2554;
        }
    }
}
