import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("cc")
public class Wave {

    @OriginalMember(owner = "cc", name = "b", descriptor = "I")
    private int field899 = 922;

    @OriginalMember(owner = "cc", name = "g", descriptor = "[Ldc;")
    private Tone[] field904 = new Tone[10];

    @OriginalMember(owner = "cc", name = "c", descriptor = "[Lcc;")
    private static Wave[] field900 = new Wave[1000];

    @OriginalMember(owner = "cc", name = "d", descriptor = "[I")
    public static int[] field901 = new int[1000];

    @OriginalMember(owner = "cc", name = "a", descriptor = "I")
    private int field898;

    @OriginalMember(owner = "cc", name = "h", descriptor = "I")
    private int field905;

    @OriginalMember(owner = "cc", name = "i", descriptor = "I")
    private int field906;

    @OriginalMember(owner = "cc", name = "f", descriptor = "Lmb;")
    private static Packet field903;

    @OriginalMember(owner = "cc", name = "e", descriptor = "[B")
    private static byte[] field902;

    @OriginalMember(owner = "cc", name = "a", descriptor = "(ILmb;)V")
    public static final void method321(int arg0, Packet arg1) {
        field902 = new byte[441000];
        if (arg0 != 3) {
            return;
        }
        field903 = new Packet(field902, false);
        Tone.method327();
        while (true) {
            int var2 = arg1.method240();
            if (var2 == 65535) {
                return;
            }
            field900[var2] = new Wave();
            field900[var2].method323(true, arg1);
            field901[var2] = field900[var2].method324(true);
        }
    }

    @OriginalMember(owner = "cc", name = "a", descriptor = "(IIZ)Lmb;")
    public static final Packet method322(int arg0, int arg1, boolean arg2) {
        if (!arg2) {
            throw new NullPointerException();
        } else if (field900[arg0] == null) {
            return null;
        } else {
            Wave var3 = field900[arg0];
            return var3.method325(5, arg1);
        }
    }

    @OriginalMember(owner = "cc", name = "a", descriptor = "(ZLmb;)V")
    private final void method323(boolean arg0, Packet arg1) {
        for (int var3 = 0; var3 < 10; var3++) {
            int var4 = arg1.method238();
            if (var4 != 0) {
                arg1.field713--;
                this.field904[var3] = new Tone();
                this.field904[var3].method330(true, arg1);
            }
        }
        this.field905 = arg1.method240();
        this.field906 = arg1.method240();
        if (!arg0) {
            this.field899 = -486;
        }
    }

    @OriginalMember(owner = "cc", name = "a", descriptor = "(Z)I")
    private final int method324(boolean arg0) {
        int var2 = 9999999;
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field904[var3] != null && this.field904[var3].field924 / 20 < var2) {
                var2 = this.field904[var3].field924 / 20;
            }
        }
        if (this.field905 < this.field906 && this.field905 / 20 < var2) {
            var2 = this.field905 / 20;
        }
        if (var2 == 9999999 || var2 == 0) {
            return 0;
        }
        for (int var4 = 0; var4 < 10; var4++) {
            if (this.field904[var4] != null) {
                this.field904[var4].field924 -= var2 * 20;
            }
        }
        if (!arg0) {
            return this.field898;
        }
        if (this.field905 < this.field906) {
            this.field905 -= var2 * 20;
            this.field906 -= var2 * 20;
        }
        return var2;
    }

    @OriginalMember(owner = "cc", name = "a", descriptor = "(II)Lmb;")
    private final Packet method325(int arg0, int arg1) {
        int var3 = this.method326(arg1);
        field903.field713 = 0;
        field903.method232(1380533830);
        field903.method233(var3 + 36, (byte) 127);
        field903.method232(1463899717);
        field903.method232(1718449184);
        field903.method233(16, (byte) 127);
        field903.method230(1, 909);
        field903.method230(1, 909);
        field903.method233(22050, (byte) 127);
        field903.method233(22050, (byte) 127);
        field903.method230(1, 909);
        field903.method230(8, 909);
        field903.method232(1684108385);
        if (arg0 < 5 || arg0 > 5) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        field903.method233(var3, (byte) 127);
        field903.field713 += var3;
        return field903;
    }

    @OriginalMember(owner = "cc", name = "a", descriptor = "(I)I")
    private final int method326(int arg0) {
        int var2 = 0;
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field904[var3] != null && this.field904[var3].field924 + this.field904[var3].field923 > var2) {
                var2 = this.field904[var3].field924 + this.field904[var3].field923;
            }
        }
        if (var2 == 0) {
            return 0;
        }
        int var4 = var2 * 22050 / 1000;
        int var5 = this.field905 * 22050 / 1000;
        int var6 = this.field906 * 22050 / 1000;
        if (var5 < 0 || var5 > var4 || var6 < 0 || var6 > var4 || var5 >= var6) {
            arg0 = 0;
        }
        int var7 = (arg0 - 1) * (var6 - var5) + var4;
        for (int var8 = 44; var8 < var7 + 44; var8++) {
            field902[var8] = -128;
        }
        for (int var9 = 0; var9 < 10; var9++) {
            if (this.field904[var9] != null) {
                int var15 = this.field904[var9].field923 * 22050 / 1000;
                int var16 = this.field904[var9].field924 * 22050 / 1000;
                int[] var17 = this.field904[var9].method328(var15, this.field904[var9].field923);
                for (int var18 = 0; var18 < var15; var18++) {
                    field902[var16 + var18 + 44] += (byte) (var17[var18] >> 8);
                }
            }
        }
        if (arg0 > 1) {
            var5 += 44;
            var6 += 44;
            var4 += 44;
            var7 += 44;
            int var10 = var7 - var4;
            for (int var11 = var4 - 1; var11 >= var6; var11--) {
                field902[var10 + var11] = field902[var11];
            }
            for (int var12 = 1; var12 < arg0; var12++) {
                int var13 = (var6 - var5) * var12;
                for (int var14 = var5; var14 < var6; var14++) {
                    field902[var13 + var14] = field902[var14];
                }
            }
            var7 -= 44;
        }
        return var7;
    }
}
