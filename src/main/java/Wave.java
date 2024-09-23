import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("cc")
public class Wave {

    @OriginalMember(owner = "cc", name = "b", descriptor = "B")
    private byte field906 = 5;

    @OriginalMember(owner = "cc", name = "h", descriptor = "[Ldc;")
    private Tone[] field912 = new Tone[10];

    @OriginalMember(owner = "cc", name = "a", descriptor = "I")
    private int field905;

    @OriginalMember(owner = "cc", name = "d", descriptor = "[Lcc;")
    private static Wave[] field908 = new Wave[1000];

    @OriginalMember(owner = "cc", name = "e", descriptor = "[I")
    public static int[] field909 = new int[1000];

    @OriginalMember(owner = "cc", name = "i", descriptor = "I")
    private int field913;

    @OriginalMember(owner = "cc", name = "j", descriptor = "I")
    private int field914;

    @OriginalMember(owner = "cc", name = "g", descriptor = "Llb;")
    private static Packet field911;

    @OriginalMember(owner = "cc", name = "c", descriptor = "Z")
    private static boolean field907;

    @OriginalMember(owner = "cc", name = "f", descriptor = "[B")
    private static byte[] field910;

    @OriginalMember(owner = "cc", name = "<init>", descriptor = "(I)V")
    private Wave(int arg0) {
        if (arg0 != -46900) {
            this.field905 = 126;
        }
    }

    @OriginalMember(owner = "cc", name = "a", descriptor = "(ZLlb;)V")
    public static final void method313(boolean arg0, Packet arg1) {
        if (arg0) {
            field907 = !field907;
        }
        field910 = new byte[441000];
        field911 = new Packet(field910, (byte) 1);
        Tone.method319();
        while (true) {
            int var2 = arg1.method226();
            if (var2 == 65535) {
                return;
            }
            field908[var2] = new Wave(-46900);
            field908[var2].method315((byte) 2, arg1);
            field909[var2] = field908[var2].method316(788);
        }
    }

    @OriginalMember(owner = "cc", name = "a", descriptor = "(IIB)Llb;")
    public static final Packet method314(int arg0, int arg1, byte arg2) {
        if (arg2 != 5) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        if (field908[arg0] == null) {
            return null;
        } else {
            Wave var4 = field908[arg0];
            return var4.method317(arg1, (byte) 5);
        }
    }

    @OriginalMember(owner = "cc", name = "a", descriptor = "(BLlb;)V")
    private final void method315(byte arg0, Packet arg1) {
        for (int var3 = 0; var3 < 10; var3++) {
            int var5 = arg1.method224();
            if (var5 != 0) {
                arg1.field709--;
                this.field912[var3] = new Tone();
                this.field912[var3].method322((byte) 2, arg1);
            }
        }
        if (arg0 == 2) {
            boolean var4 = false;
        } else {
            this.field905 = -185;
        }
        this.field913 = arg1.method226();
        this.field914 = arg1.method226();
    }

    @OriginalMember(owner = "cc", name = "a", descriptor = "(I)I")
    private final int method316(int arg0) {
        if (arg0 <= 0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        int var3 = 9999999;
        for (int var4 = 0; var4 < 10; var4++) {
            if (this.field912[var4] != null && this.field912[var4].field933 / 20 < var3) {
                var3 = this.field912[var4].field933 / 20;
            }
        }
        if (this.field913 < this.field914 && this.field913 / 20 < var3) {
            var3 = this.field913 / 20;
        }
        if (var3 == 9999999 || var3 == 0) {
            return 0;
        }
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field912[var5] != null) {
                this.field912[var5].field933 -= var3 * 20;
            }
        }
        if (this.field913 < this.field914) {
            this.field913 -= var3 * 20;
            this.field914 -= var3 * 20;
        }
        return var3;
    }

    @OriginalMember(owner = "cc", name = "a", descriptor = "(IB)Llb;")
    private final Packet method317(int arg0, byte arg1) {
        int var3 = this.method318(arg0);
        field911.field709 = 0;
        field911.method218(1380533830);
        field911.method219(true, var3 + 36);
        field911.method218(1463899717);
        field911.method218(1718449184);
        field911.method219(true, 16);
        field911.method216(false, 1);
        field911.method216(false, 1);
        field911.method219(true, 22050);
        field911.method219(true, 22050);
        field911.method216(false, 1);
        field911.method216(false, 8);
        field911.method218(1684108385);
        field911.method219(true, var3);
        if (this.field906 != arg1) {
            throw new NullPointerException();
        }
        field911.field709 += var3;
        return field911;
    }

    @OriginalMember(owner = "cc", name = "b", descriptor = "(I)I")
    private final int method318(int arg0) {
        int var2 = 0;
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field912[var3] != null && this.field912[var3].field933 + this.field912[var3].field932 > var2) {
                var2 = this.field912[var3].field933 + this.field912[var3].field932;
            }
        }
        if (var2 == 0) {
            return 0;
        }
        int var4 = var2 * 22050 / 1000;
        int var5 = this.field913 * 22050 / 1000;
        int var6 = this.field914 * 22050 / 1000;
        if (var5 < 0 || var5 > var4 || var6 < 0 || var6 > var4 || var5 >= var6) {
            arg0 = 0;
        }
        int var7 = (arg0 - 1) * (var6 - var5) + var4;
        for (int var8 = 44; var8 < var7 + 44; var8++) {
            field910[var8] = -128;
        }
        for (int var9 = 0; var9 < 10; var9++) {
            if (this.field912[var9] != null) {
                int var15 = this.field912[var9].field932 * 22050 / 1000;
                int var16 = this.field912[var9].field933 * 22050 / 1000;
                int[] var17 = this.field912[var9].method320(var15, this.field912[var9].field932);
                for (int var18 = 0; var18 < var15; var18++) {
                    field910[var16 + var18 + 44] += (byte) (var17[var18] >> 8);
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
                field910[var10 + var11] = field910[var11];
            }
            for (int var12 = 1; var12 < arg0; var12++) {
                int var13 = (var6 - var5) * var12;
                for (int var14 = var5; var14 < var6; var14++) {
                    field910[var13 + var14] = field910[var14];
                }
            }
            var7 -= 44;
        }
        return var7;
    }
}
