import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("cc")
public class Wave {

    @OriginalMember(owner = "cc", name = "a", descriptor = "Z")
    private boolean field904 = true;

    @OriginalMember(owner = "cc", name = "h", descriptor = "[Ldc;")
    private Tone[] field911 = new Tone[10];

    @OriginalMember(owner = "cc", name = "b", descriptor = "B")
    private static byte field905 = -34;

    @OriginalMember(owner = "cc", name = "c", descriptor = "Z")
    private static boolean field906 = true;

    @OriginalMember(owner = "cc", name = "d", descriptor = "[Lcc;")
    private static Wave[] field907 = new Wave[5000];

    @OriginalMember(owner = "cc", name = "e", descriptor = "[I")
    public static int[] field908 = new int[5000];

    @OriginalMember(owner = "cc", name = "i", descriptor = "I")
    private int field912;

    @OriginalMember(owner = "cc", name = "j", descriptor = "I")
    private int field913;

    @OriginalMember(owner = "cc", name = "g", descriptor = "Llb;")
    private static Packet field910;

    @OriginalMember(owner = "cc", name = "f", descriptor = "[B")
    private static byte[] field909;

    @OriginalMember(owner = "cc", name = "<init>", descriptor = "(I)V")
    private Wave(int arg0) {
        while (arg0 >= 0) {
        }
    }

    @OriginalMember(owner = "cc", name = "a", descriptor = "(Llb;I)V")
    public static final void method318(Packet arg0, int arg1) {
        while (arg1 >= 0) {
        }
        field909 = new byte[441000];
        field910 = new Packet(field909, 58);
        Tone.method324();
        while (true) {
            int var2 = arg0.method231();
            if (var2 == 65535) {
                return;
            }
            field907[var2] = new Wave(-298);
            field907[var2].method320(arg0, 913);
            field908[var2] = field907[var2].method321(-42432);
        }
    }

    @OriginalMember(owner = "cc", name = "a", descriptor = "(IIB)Llb;")
    public static final Packet method319(int arg0, int arg1, byte arg2) {
        if (field905 != arg2) {
            throw new NullPointerException();
        } else if (field907[arg1] == null) {
            return null;
        } else {
            Wave var3 = field907[arg1];
            return var3.method322(arg0, (byte) 111);
        }
    }

    @OriginalMember(owner = "cc", name = "b", descriptor = "(Llb;I)V")
    private final void method320(Packet arg0, int arg1) {
        int var3 = 63 / arg1;
        for (int var4 = 0; var4 < 10; var4++) {
            int var5 = arg0.method229();
            if (var5 != 0) {
                arg0.field711--;
                this.field911[var4] = new Tone();
                this.field911[var4].method327(arg0, 913);
            }
        }
        this.field912 = arg0.method231();
        this.field913 = arg0.method231();
    }

    @OriginalMember(owner = "cc", name = "a", descriptor = "(I)I")
    private final int method321(int arg0) {
        int var2 = 9999999;
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field911[var3] != null && this.field911[var3].field932 / 20 < var2) {
                var2 = this.field911[var3].field932 / 20;
            }
        }
        if (arg0 != -42432) {
            this.field904 = !this.field904;
        }
        if (this.field912 < this.field913 && this.field912 / 20 < var2) {
            var2 = this.field912 / 20;
        }
        if (var2 == 9999999 || var2 == 0) {
            return 0;
        }
        for (int var4 = 0; var4 < 10; var4++) {
            if (this.field911[var4] != null) {
                this.field911[var4].field932 -= var2 * 20;
            }
        }
        if (this.field912 < this.field913) {
            this.field912 -= var2 * 20;
            this.field913 -= var2 * 20;
        }
        return var2;
    }

    @OriginalMember(owner = "cc", name = "a", descriptor = "(IB)Llb;")
    private final Packet method322(int arg0, byte arg1) {
        int var3 = this.method323(arg0);
        field910.field711 = 0;
        field910.method223(1380533830);
        field910.method224(var3 + 36, -2704);
        if (arg1 != 111) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        field910.method223(1463899717);
        field910.method223(1718449184);
        field910.method224(16, -2704);
        field910.method221(2, 1);
        field910.method221(2, 1);
        field910.method224(22050, -2704);
        field910.method224(22050, -2704);
        field910.method221(2, 1);
        field910.method221(2, 8);
        field910.method223(1684108385);
        field910.method224(var3, -2704);
        field910.field711 += var3;
        return field910;
    }

    @OriginalMember(owner = "cc", name = "b", descriptor = "(I)I")
    private final int method323(int arg0) {
        int var2 = 0;
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field911[var3] != null && this.field911[var3].field932 + this.field911[var3].field931 > var2) {
                var2 = this.field911[var3].field932 + this.field911[var3].field931;
            }
        }
        if (var2 == 0) {
            return 0;
        }
        int var4 = var2 * 22050 / 1000;
        int var5 = this.field912 * 22050 / 1000;
        int var6 = this.field913 * 22050 / 1000;
        if (var5 < 0 || var5 > var4 || var6 < 0 || var6 > var4 || var5 >= var6) {
            arg0 = 0;
        }
        int var7 = (arg0 - 1) * (var6 - var5) + var4;
        for (int var8 = 44; var8 < var7 + 44; var8++) {
            field909[var8] = -128;
        }
        for (int var9 = 0; var9 < 10; var9++) {
            if (this.field911[var9] != null) {
                int var15 = this.field911[var9].field931 * 22050 / 1000;
                int var16 = this.field911[var9].field932 * 22050 / 1000;
                int[] var17 = this.field911[var9].method325(var15, this.field911[var9].field931);
                for (int var18 = 0; var18 < var15; var18++) {
                    field909[var16 + var18 + 44] += (byte) (var17[var18] >> 8);
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
                field909[var10 + var11] = field909[var11];
            }
            for (int var12 = 1; var12 < arg0; var12++) {
                int var13 = (var6 - var5) * var12;
                for (int var14 = var5; var14 < var6; var14++) {
                    field909[var13 + var14] = field909[var14];
                }
            }
            var7 -= 44;
        }
        return var7;
    }
}
