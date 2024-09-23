import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("cc")
public class Wave {

    @OriginalMember(owner = "cc", name = "a", descriptor = "B")
    private byte field901 = 117;

    @OriginalMember(owner = "cc", name = "b", descriptor = "Z")
    private boolean field902 = false;

    @OriginalMember(owner = "cc", name = "h", descriptor = "[Ldc;")
    private Tone[] field908 = new Tone[10];

    @OriginalMember(owner = "cc", name = "d", descriptor = "[Lcc;")
    private static Wave[] field904 = new Wave[1000];

    @OriginalMember(owner = "cc", name = "e", descriptor = "[I")
    public static int[] field905 = new int[1000];

    @OriginalMember(owner = "cc", name = "c", descriptor = "I")
    private int field903;

    @OriginalMember(owner = "cc", name = "i", descriptor = "I")
    private int field909;

    @OriginalMember(owner = "cc", name = "j", descriptor = "I")
    private int field910;

    @OriginalMember(owner = "cc", name = "g", descriptor = "Llb;")
    private static Packet field907;

    @OriginalMember(owner = "cc", name = "f", descriptor = "[B")
    private static byte[] field906;

    @OriginalMember(owner = "cc", name = "<init>", descriptor = "(I)V")
    private Wave(int arg0) {
        int var2 = 55 / arg0;
    }

    @OriginalMember(owner = "cc", name = "a", descriptor = "(ILlb;)V")
    public static final void method313(int arg0, Packet arg1) {
        field906 = new byte[441000];
        int var2 = 73 / arg0;
        field907 = new Packet((byte) 3, field906);
        Tone.method319();
        while (true) {
            int var3 = arg1.method226();
            if (var3 == 65535) {
                return;
            }
            field904[var3] = new Wave(685);
            field904[var3].method315(arg1, -32477);
            field905[var3] = field904[var3].method316(false);
        }
    }

    @OriginalMember(owner = "cc", name = "a", descriptor = "(ZII)Llb;")
    public static final Packet method314(boolean arg0, int arg1, int arg2) {
        if (arg0) {
            throw new NullPointerException();
        } else if (field904[arg1] == null) {
            return null;
        } else {
            Wave var3 = field904[arg1];
            return var3.method317(true, arg2);
        }
    }

    @OriginalMember(owner = "cc", name = "a", descriptor = "(Llb;I)V")
    private final void method315(Packet arg0, int arg1) {
        if (arg1 != -32477) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        for (int var4 = 0; var4 < 10; var4++) {
            int var5 = arg0.method224();
            if (var5 != 0) {
                arg0.field702--;
                this.field908[var4] = new Tone();
                this.field908[var4].method322(arg0, -32477);
            }
        }
        this.field909 = arg0.method226();
        this.field910 = arg0.method226();
    }

    @OriginalMember(owner = "cc", name = "a", descriptor = "(Z)I")
    private final int method316(boolean arg0) {
        if (arg0) {
            this.field903 = -393;
        }
        int var2 = 9999999;
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field908[var3] != null && this.field908[var3].field929 / 20 < var2) {
                var2 = this.field908[var3].field929 / 20;
            }
        }
        if (this.field909 < this.field910 && this.field909 / 20 < var2) {
            var2 = this.field909 / 20;
        }
        if (var2 == 9999999 || var2 == 0) {
            return 0;
        }
        for (int var4 = 0; var4 < 10; var4++) {
            if (this.field908[var4] != null) {
                this.field908[var4].field929 -= var2 * 20;
            }
        }
        if (this.field909 < this.field910) {
            this.field909 -= var2 * 20;
            this.field910 -= var2 * 20;
        }
        return var2;
    }

    @OriginalMember(owner = "cc", name = "a", descriptor = "(ZI)Llb;")
    private final Packet method317(boolean arg0, int arg1) {
        int var3 = this.method318(arg1);
        field907.field702 = 0;
        field907.method218(1380533830);
        if (!arg0) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        field907.method219(var3 + 36, this.field901);
        field907.method218(1463899717);
        field907.method218(1718449184);
        field907.method219(16, this.field901);
        field907.method216(39096, 1);
        field907.method216(39096, 1);
        field907.method219(22050, this.field901);
        field907.method219(22050, this.field901);
        field907.method216(39096, 1);
        field907.method216(39096, 8);
        field907.method218(1684108385);
        field907.method219(var3, this.field901);
        field907.field702 += var3;
        return field907;
    }

    @OriginalMember(owner = "cc", name = "a", descriptor = "(I)I")
    private final int method318(int arg0) {
        int var2 = 0;
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field908[var3] != null && this.field908[var3].field929 + this.field908[var3].field928 > var2) {
                var2 = this.field908[var3].field929 + this.field908[var3].field928;
            }
        }
        if (var2 == 0) {
            return 0;
        }
        int var4 = var2 * 22050 / 1000;
        int var5 = this.field909 * 22050 / 1000;
        int var6 = this.field910 * 22050 / 1000;
        if (var5 < 0 || var5 > var4 || var6 < 0 || var6 > var4 || var5 >= var6) {
            arg0 = 0;
        }
        int var7 = (arg0 - 1) * (var6 - var5) + var4;
        for (int var8 = 44; var8 < var7 + 44; var8++) {
            field906[var8] = -128;
        }
        for (int var9 = 0; var9 < 10; var9++) {
            if (this.field908[var9] != null) {
                int var15 = this.field908[var9].field928 * 22050 / 1000;
                int var16 = this.field908[var9].field929 * 22050 / 1000;
                int[] var17 = this.field908[var9].method320(var15, this.field908[var9].field928);
                for (int var18 = 0; var18 < var15; var18++) {
                    field906[var16 + var18 + 44] += (byte) (var17[var18] >> 8);
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
                field906[var10 + var11] = field906[var11];
            }
            for (int var12 = 1; var12 < arg0; var12++) {
                int var13 = (var6 - var5) * var12;
                for (int var14 = var5; var14 < var6; var14++) {
                    field906[var13 + var14] = field906[var14];
                }
            }
            var7 -= 44;
        }
        return var7;
    }
}
