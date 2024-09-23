import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("cc")
public class Wave {

    @OriginalMember(owner = "cc", name = "b", descriptor = "Z")
    private boolean field898 = true;

    @OriginalMember(owner = "cc", name = "c", descriptor = "I")
    private int field899 = -47594;

    @OriginalMember(owner = "cc", name = "d", descriptor = "Z")
    private boolean field900 = false;

    @OriginalMember(owner = "cc", name = "i", descriptor = "[Ldc;")
    private Tone[] field905 = new Tone[10];

    @OriginalMember(owner = "cc", name = "a", descriptor = "I")
    private static int field897 = 1000;

    @OriginalMember(owner = "cc", name = "e", descriptor = "[Lcc;")
    private static Wave[] field901 = new Wave[5000];

    @OriginalMember(owner = "cc", name = "f", descriptor = "[I")
    public static int[] field902 = new int[5000];

    @OriginalMember(owner = "cc", name = "j", descriptor = "I")
    private int field906;

    @OriginalMember(owner = "cc", name = "k", descriptor = "I")
    private int field907;

    @OriginalMember(owner = "cc", name = "h", descriptor = "Llb;")
    private static Packet field904;

    @OriginalMember(owner = "cc", name = "g", descriptor = "[B")
    private static byte[] field903;

    @OriginalMember(owner = "cc", name = "<init>", descriptor = "(I)V")
    private Wave(int arg0) {
        if (arg0 != 0) {
            this.field900 = !this.field900;
        }
    }

    @OriginalMember(owner = "cc", name = "a", descriptor = "(Llb;I)V")
    public static final void method318(Packet arg0, int arg1) {
        field903 = new byte[441000];
        field904 = new Packet(field897, field903);
        Tone.method324();
        if (arg1 < 0 || arg1 > 0) {
            return;
        }
        while (true) {
            int var2 = arg0.method231();
            if (var2 == 65535) {
                return;
            }
            field901[var2] = new Wave(0);
            field901[var2].method320(8, arg0);
            field902[var2] = field901[var2].method321((byte) -13);
        }
    }

    @OriginalMember(owner = "cc", name = "a", descriptor = "(IBI)Llb;")
    public static final Packet method319(int arg0, byte arg1, int arg2) {
        if (arg1 == 6) {
            boolean var3 = false;
        } else {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        if (field901[arg0] == null) {
            return null;
        } else {
            Wave var5 = field901[arg0];
            return var5.method322(arg2, 11970);
        }
    }

    @OriginalMember(owner = "cc", name = "a", descriptor = "(ILlb;)V")
    private final void method320(int arg0, Packet arg1) {
        for (int var3 = 0; var3 < 10; var3++) {
            int var4 = arg1.method229();
            if (var4 != 0) {
                arg1.field703--;
                this.field905[var3] = new Tone();
                this.field905[var3].method327(8, arg1);
            }
        }
        this.field906 = arg1.method231();
        this.field907 = arg1.method231();
        if (arg0 != 8) {
            throw new NullPointerException();
        }
    }

    @OriginalMember(owner = "cc", name = "a", descriptor = "(B)I")
    private final int method321(byte arg0) {
        int var2 = 9999999;
        if (arg0 != -13) {
            field897 = 347;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field905[var3] != null && this.field905[var3].field924 / 20 < var2) {
                var2 = this.field905[var3].field924 / 20;
            }
        }
        if (this.field906 < this.field907 && this.field906 / 20 < var2) {
            var2 = this.field906 / 20;
        }
        if (var2 == 9999999 || var2 == 0) {
            return 0;
        }
        for (int var4 = 0; var4 < 10; var4++) {
            if (this.field905[var4] != null) {
                this.field905[var4].field924 -= var2 * 20;
            }
        }
        if (this.field906 < this.field907) {
            this.field906 -= var2 * 20;
            this.field907 -= var2 * 20;
        }
        return var2;
    }

    @OriginalMember(owner = "cc", name = "a", descriptor = "(II)Llb;")
    private final Packet method322(int arg0, int arg1) {
        int var3 = this.method323(arg0);
        field904.field703 = 0;
        field904.method223(1380533830);
        field904.method224(var3 + 36, 9);
        field904.method223(1463899717);
        field904.method223(1718449184);
        field904.method224(16, 9);
        field904.method221(1, -327);
        field904.method221(1, -327);
        field904.method224(22050, 9);
        field904.method224(22050, 9);
        field904.method221(1, -327);
        field904.method221(8, -327);
        field904.method223(1684108385);
        field904.method224(var3, 9);
        if (arg1 != 11970) {
            this.field899 = 401;
        }
        field904.field703 += var3;
        return field904;
    }

    @OriginalMember(owner = "cc", name = "a", descriptor = "(I)I")
    private final int method323(int arg0) {
        int var2 = 0;
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field905[var3] != null && this.field905[var3].field924 + this.field905[var3].field923 > var2) {
                var2 = this.field905[var3].field924 + this.field905[var3].field923;
            }
        }
        if (var2 == 0) {
            return 0;
        }
        int var4 = var2 * 22050 / 1000;
        int var5 = this.field906 * 22050 / 1000;
        int var6 = this.field907 * 22050 / 1000;
        if (var5 < 0 || var5 > var4 || var6 < 0 || var6 > var4 || var5 >= var6) {
            arg0 = 0;
        }
        int var7 = (arg0 - 1) * (var6 - var5) + var4;
        for (int var8 = 44; var8 < var7 + 44; var8++) {
            field903[var8] = -128;
        }
        for (int var9 = 0; var9 < 10; var9++) {
            if (this.field905[var9] != null) {
                int var15 = this.field905[var9].field923 * 22050 / 1000;
                int var16 = this.field905[var9].field924 * 22050 / 1000;
                int[] var17 = this.field905[var9].method325(var15, this.field905[var9].field923);
                for (int var18 = 0; var18 < var15; var18++) {
                    field903[var16 + var18 + 44] += (byte) (var17[var18] >> 8);
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
                field903[var10 + var11] = field903[var11];
            }
            for (int var12 = 1; var12 < arg0; var12++) {
                int var13 = (var6 - var5) * var12;
                for (int var14 = var5; var14 < var6; var14++) {
                    field903[var13 + var14] = field903[var14];
                }
            }
            var7 -= 44;
        }
        return var7;
    }
}
