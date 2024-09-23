import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("cc")
public class Wave {

    @OriginalMember(owner = "cc", name = "d", descriptor = "B")
    private byte field904 = -17;

    @OriginalMember(owner = "cc", name = "i", descriptor = "[Ldc;")
    private Tone[] field909 = new Tone[10];

    @OriginalMember(owner = "cc", name = "c", descriptor = "I")
    private static int field903 = -474;

    @OriginalMember(owner = "cc", name = "e", descriptor = "[Lcc;")
    private static Wave[] field905 = new Wave[1000];

    @OriginalMember(owner = "cc", name = "f", descriptor = "[I")
    public static int[] field906 = new int[1000];

    @OriginalMember(owner = "cc", name = "a", descriptor = "I")
    private int field901;

    @OriginalMember(owner = "cc", name = "j", descriptor = "I")
    private int field910;

    @OriginalMember(owner = "cc", name = "k", descriptor = "I")
    private int field911;

    @OriginalMember(owner = "cc", name = "h", descriptor = "Llb;")
    private static Packet field908;

    @OriginalMember(owner = "cc", name = "b", descriptor = "Z")
    private static boolean field902;

    @OriginalMember(owner = "cc", name = "g", descriptor = "[B")
    private static byte[] field907;

    @OriginalMember(owner = "cc", name = "<init>", descriptor = "(B)V")
    private Wave(byte arg0) {
        if (arg0 != 5) {
            throw new NullPointerException();
        }
    }

    @OriginalMember(owner = "cc", name = "a", descriptor = "(Llb;I)V")
    public static final void method314(Packet arg0, int arg1) {
        field907 = new byte[441000];
        field908 = new Packet(field907, 185);
        Tone.method320();
        if (arg1 >= 0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        while (true) {
            int var3 = arg0.method227();
            if (var3 == 65535) {
                return;
            }
            field905[var3] = new Wave((byte) 5);
            field905[var3].method316(arg0, (byte) 81);
            field906[var3] = field905[var3].method317((byte) -17);
        }
    }

    @OriginalMember(owner = "cc", name = "a", descriptor = "(III)Llb;")
    public static final Packet method315(int arg0, int arg1, int arg2) {
        if (arg0 != -42410) {
            field902 = !field902;
        }
        if (field905[arg1] == null) {
            return null;
        } else {
            Wave var3 = field905[arg1];
            return var3.method318(-11766, arg2);
        }
    }

    @OriginalMember(owner = "cc", name = "a", descriptor = "(Llb;B)V")
    private final void method316(Packet arg0, byte arg1) {
        for (int var3 = 0; var3 < 10; var3++) {
            int var4 = arg0.method225();
            if (var4 != 0) {
                arg0.field708--;
                this.field909[var3] = new Tone();
                this.field909[var3].method323(arg0, (byte) 81);
            }
        }
        this.field910 = arg0.method227();
        this.field911 = arg0.method227();
        if (arg1 != 81) {
            field903 = 210;
        }
    }

    @OriginalMember(owner = "cc", name = "a", descriptor = "(B)I")
    private final int method317(byte arg0) {
        int var2 = 9999999;
        if (this.field904 != arg0) {
            return 1;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field909[var3] != null && this.field909[var3].field928 / 20 < var2) {
                var2 = this.field909[var3].field928 / 20;
            }
        }
        if (this.field910 < this.field911 && this.field910 / 20 < var2) {
            var2 = this.field910 / 20;
        }
        if (var2 == 9999999 || var2 == 0) {
            return 0;
        }
        for (int var4 = 0; var4 < 10; var4++) {
            if (this.field909[var4] != null) {
                this.field909[var4].field928 -= var2 * 20;
            }
        }
        if (this.field910 < this.field911) {
            this.field910 -= var2 * 20;
            this.field911 -= var2 * 20;
        }
        return var2;
    }

    @OriginalMember(owner = "cc", name = "a", descriptor = "(II)Llb;")
    private final Packet method318(int arg0, int arg1) {
        int var3 = this.method319(arg1);
        field908.field708 = 0;
        field908.method219(1380533830);
        field908.method220(4, var3 + 36);
        field908.method219(1463899717);
        field908.method219(1718449184);
        field908.method220(4, 16);
        if (arg0 != -11766) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        field908.method217(1, this.field901);
        field908.method217(1, this.field901);
        field908.method220(4, 22050);
        field908.method220(4, 22050);
        field908.method217(1, this.field901);
        field908.method217(8, this.field901);
        field908.method219(1684108385);
        field908.method220(4, var3);
        field908.field708 += var3;
        return field908;
    }

    @OriginalMember(owner = "cc", name = "a", descriptor = "(I)I")
    private final int method319(int arg0) {
        int var2 = 0;
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field909[var3] != null && this.field909[var3].field928 + this.field909[var3].field927 > var2) {
                var2 = this.field909[var3].field928 + this.field909[var3].field927;
            }
        }
        if (var2 == 0) {
            return 0;
        }
        int var4 = var2 * 22050 / 1000;
        int var5 = this.field910 * 22050 / 1000;
        int var6 = this.field911 * 22050 / 1000;
        if (var5 < 0 || var5 > var4 || var6 < 0 || var6 > var4 || var5 >= var6) {
            arg0 = 0;
        }
        int var7 = (arg0 - 1) * (var6 - var5) + var4;
        for (int var8 = 44; var8 < var7 + 44; var8++) {
            field907[var8] = -128;
        }
        for (int var9 = 0; var9 < 10; var9++) {
            if (this.field909[var9] != null) {
                int var15 = this.field909[var9].field927 * 22050 / 1000;
                int var16 = this.field909[var9].field928 * 22050 / 1000;
                int[] var17 = this.field909[var9].method321(var15, this.field909[var9].field927);
                for (int var18 = 0; var18 < var15; var18++) {
                    field907[var16 + var18 + 44] += (byte) (var17[var18] >> 8);
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
                field907[var10 + var11] = field907[var11];
            }
            for (int var12 = 1; var12 < arg0; var12++) {
                int var13 = (var6 - var5) * var12;
                for (int var14 = var5; var14 < var6; var14++) {
                    field907[var13 + var14] = field907[var14];
                }
            }
            var7 -= 44;
        }
        return var7;
    }
}
