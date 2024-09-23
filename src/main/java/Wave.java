import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("cc")
public class Wave {

    @OriginalMember(owner = "cc", name = "a", descriptor = "I")
    private int field898 = -996;

    @OriginalMember(owner = "cc", name = "b", descriptor = "I")
    private int field899 = 940;

    @OriginalMember(owner = "cc", name = "g", descriptor = "[Ldc;")
    private Tone[] field904 = new Tone[10];

    @OriginalMember(owner = "cc", name = "c", descriptor = "[Lcc;")
    private static Wave[] field900 = new Wave[1000];

    @OriginalMember(owner = "cc", name = "d", descriptor = "[I")
    public static int[] field901 = new int[1000];

    @OriginalMember(owner = "cc", name = "h", descriptor = "I")
    private int field905;

    @OriginalMember(owner = "cc", name = "i", descriptor = "I")
    private int field906;

    @OriginalMember(owner = "cc", name = "f", descriptor = "Lmb;")
    private static Packet field903;

    @OriginalMember(owner = "cc", name = "e", descriptor = "[B")
    private static byte[] field902;

    @OriginalMember(owner = "cc", name = "<init>", descriptor = "(I)V")
    private Wave(int arg0) {
        if (arg0 <= 0) {
            throw new NullPointerException();
        }
    }

    @OriginalMember(owner = "cc", name = "a", descriptor = "(ZLmb;)V")
    public static final void method322(boolean arg0, Packet arg1) {
        field902 = new byte[441000];
        if (!arg0) {
            return;
        }
        field903 = new Packet(16, field902);
        Tone.method328();
        while (true) {
            int var2 = arg1.method241();
            if (var2 == 65535) {
                return;
            }
            field900[var2] = new Wave(940);
            field900[var2].method324(891, arg1);
            field901[var2] = field900[var2].method325(805);
        }
    }

    @OriginalMember(owner = "cc", name = "a", descriptor = "(III)Lmb;")
    public static final Packet method323(int arg0, int arg1, int arg2) {
        if (arg0 != 0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        if (field900[arg2] == null) {
            return null;
        } else {
            Wave var4 = field900[arg2];
            return var4.method326(arg1, 18178);
        }
    }

    @OriginalMember(owner = "cc", name = "a", descriptor = "(ILmb;)V")
    private final void method324(int arg0, Packet arg1) {
        if (arg0 <= 0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        for (int var4 = 0; var4 < 10; var4++) {
            int var5 = arg1.method239();
            if (var5 != 0) {
                arg1.field717--;
                this.field904[var4] = new Tone();
                this.field904[var4].method331(891, arg1);
            }
        }
        this.field905 = arg1.method241();
        this.field906 = arg1.method241();
    }

    @OriginalMember(owner = "cc", name = "a", descriptor = "(I)I")
    private final int method325(int arg0) {
        int var2 = 9999999;
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field904[var3] != null && this.field904[var3].field921 / 20 < var2) {
                var2 = this.field904[var3].field921 / 20;
            }
        }
        if (arg0 <= 0) {
            return this.field898;
        }
        if (this.field905 < this.field906 && this.field905 / 20 < var2) {
            var2 = this.field905 / 20;
        }
        if (var2 == 9999999 || var2 == 0) {
            return 0;
        }
        for (int var4 = 0; var4 < 10; var4++) {
            if (this.field904[var4] != null) {
                this.field904[var4].field921 -= var2 * 20;
            }
        }
        if (this.field905 < this.field906) {
            this.field905 -= var2 * 20;
            this.field906 -= var2 * 20;
        }
        return var2;
    }

    @OriginalMember(owner = "cc", name = "a", descriptor = "(II)Lmb;")
    private final Packet method326(int arg0, int arg1) {
        int var3 = this.method327(arg0);
        field903.field717 = 0;
        field903.method233(1380533830);
        field903.method234(285, var3 + 36);
        field903.method233(1463899717);
        field903.method233(1718449184);
        field903.method234(285, 16);
        field903.method231(false, 1);
        field903.method231(false, 1);
        field903.method234(285, 22050);
        field903.method234(285, 22050);
        field903.method231(false, 1);
        field903.method231(false, 8);
        if (arg1 != 18178) {
            throw new NullPointerException();
        }
        field903.method233(1684108385);
        field903.method234(285, var3);
        field903.field717 += var3;
        return field903;
    }

    @OriginalMember(owner = "cc", name = "b", descriptor = "(I)I")
    private final int method327(int arg0) {
        int var2 = 0;
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field904[var3] != null && this.field904[var3].field921 + this.field904[var3].field920 > var2) {
                var2 = this.field904[var3].field921 + this.field904[var3].field920;
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
                int var15 = this.field904[var9].field920 * 22050 / 1000;
                int var16 = this.field904[var9].field921 * 22050 / 1000;
                int[] var17 = this.field904[var9].method329(var15, this.field904[var9].field920);
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
