import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("cc")
public class Wave {

    @OriginalMember(owner = "cc", name = "a", descriptor = "Z")
    private boolean field908 = false;

    @OriginalMember(owner = "cc", name = "b", descriptor = "Z")
    private boolean field909 = false;

    @OriginalMember(owner = "cc", name = "c", descriptor = "Z")
    private boolean field910 = true;

    @OriginalMember(owner = "cc", name = "h", descriptor = "[Ldc;")
    private Tone[] field915 = new Tone[10];

    @OriginalMember(owner = "cc", name = "d", descriptor = "[Lcc;")
    private static Wave[] field911 = new Wave[1000];

    @OriginalMember(owner = "cc", name = "e", descriptor = "[I")
    public static int[] field912 = new int[1000];

    @OriginalMember(owner = "cc", name = "i", descriptor = "I")
    private int field916;

    @OriginalMember(owner = "cc", name = "j", descriptor = "I")
    private int field917;

    @OriginalMember(owner = "cc", name = "g", descriptor = "Llb;")
    private static Packet field914;

    @OriginalMember(owner = "cc", name = "f", descriptor = "[B")
    private static byte[] field913;

    @OriginalMember(owner = "cc", name = "<init>", descriptor = "(B)V")
    private Wave(byte arg0) {
        if (arg0 != 58) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
    }

    @OriginalMember(owner = "cc", name = "a", descriptor = "(ZLlb;)V")
    public static final void method316(boolean arg0, Packet arg1) {
        field913 = new byte[441000];
        if (!arg0) {
            return;
        }
        field914 = new Packet(field913, 15787);
        Tone.method322();
        while (true) {
            int var2 = arg1.method229();
            if (var2 == 65535) {
                return;
            }
            field911[var2] = new Wave((byte) 58);
            field911[var2].method318(false, arg1);
            field912[var2] = field911[var2].method319(368);
        }
    }

    @OriginalMember(owner = "cc", name = "a", descriptor = "(III)Llb;")
    public static final Packet method317(int arg0, int arg1, int arg2) {
        if (arg1 < 7 || arg1 > 7) {
            throw new NullPointerException();
        } else if (field911[arg2] == null) {
            return null;
        } else {
            Wave var3 = field911[arg2];
            return var3.method320(arg0, 873);
        }
    }

    @OriginalMember(owner = "cc", name = "b", descriptor = "(ZLlb;)V")
    private final void method318(boolean arg0, Packet arg1) {
        for (int var3 = 0; var3 < 10; var3++) {
            int var4 = arg1.method227();
            if (var4 != 0) {
                arg1.field710--;
                this.field915[var3] = new Tone();
                this.field915[var3].method325(false, arg1);
            }
        }
        if (arg0) {
            this.field910 = !this.field910;
        }
        this.field916 = arg1.method229();
        this.field917 = arg1.method229();
    }

    @OriginalMember(owner = "cc", name = "a", descriptor = "(I)I")
    private final int method319(int arg0) {
        int var2 = 9999999;
        if (arg0 <= 0) {
            this.field909 = !this.field909;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field915[var3] != null && this.field915[var3].field937 / 20 < var2) {
                var2 = this.field915[var3].field937 / 20;
            }
        }
        if (this.field916 < this.field917 && this.field916 / 20 < var2) {
            var2 = this.field916 / 20;
        }
        if (var2 == 9999999 || var2 == 0) {
            return 0;
        }
        for (int var4 = 0; var4 < 10; var4++) {
            if (this.field915[var4] != null) {
                this.field915[var4].field937 -= var2 * 20;
            }
        }
        if (this.field916 < this.field917) {
            this.field916 -= var2 * 20;
            this.field917 -= var2 * 20;
        }
        return var2;
    }

    @OriginalMember(owner = "cc", name = "a", descriptor = "(II)Llb;")
    private final Packet method320(int arg0, int arg1) {
        int var3 = this.method321(arg0);
        field914.field710 = 0;
        field914.method221(1380533830);
        field914.method222(26965, var3 + 36);
        field914.method221(1463899717);
        field914.method221(1718449184);
        field914.method222(26965, 16);
        field914.method219(1, false);
        field914.method219(1, false);
        field914.method222(26965, 22050);
        field914.method222(26965, 22050);
        int var4 = 98 / arg1;
        field914.method219(1, false);
        field914.method219(8, false);
        field914.method221(1684108385);
        field914.method222(26965, var3);
        field914.field710 += var3;
        return field914;
    }

    @OriginalMember(owner = "cc", name = "b", descriptor = "(I)I")
    private final int method321(int arg0) {
        int var2 = 0;
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field915[var3] != null && this.field915[var3].field937 + this.field915[var3].field936 > var2) {
                var2 = this.field915[var3].field937 + this.field915[var3].field936;
            }
        }
        if (var2 == 0) {
            return 0;
        }
        int var4 = var2 * 22050 / 1000;
        int var5 = this.field916 * 22050 / 1000;
        int var6 = this.field917 * 22050 / 1000;
        if (var5 < 0 || var5 > var4 || var6 < 0 || var6 > var4 || var5 >= var6) {
            arg0 = 0;
        }
        int var7 = (arg0 - 1) * (var6 - var5) + var4;
        for (int var8 = 44; var8 < var7 + 44; var8++) {
            field913[var8] = -128;
        }
        for (int var9 = 0; var9 < 10; var9++) {
            if (this.field915[var9] != null) {
                int var15 = this.field915[var9].field936 * 22050 / 1000;
                int var16 = this.field915[var9].field937 * 22050 / 1000;
                int[] var17 = this.field915[var9].method323(var15, this.field915[var9].field936);
                for (int var18 = 0; var18 < var15; var18++) {
                    field913[var16 + var18 + 44] += (byte) (var17[var18] >> 8);
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
                field913[var10 + var11] = field913[var11];
            }
            for (int var12 = 1; var12 < arg0; var12++) {
                int var13 = (var6 - var5) * var12;
                for (int var14 = var5; var14 < var6; var14++) {
                    field913[var13 + var14] = field913[var14];
                }
            }
            var7 -= 44;
        }
        return var7;
    }
}
