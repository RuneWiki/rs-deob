import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("cc")
public class Wave {

    @OriginalMember(owner = "cc", name = "b", descriptor = "I")
    private int field917 = -798;

    @OriginalMember(owner = "cc", name = "g", descriptor = "[Ldc;")
    private Tone[] field922 = new Tone[10];

    @OriginalMember(owner = "cc", name = "a", descriptor = "Z")
    private static boolean field916 = true;

    @OriginalMember(owner = "cc", name = "c", descriptor = "[Lcc;")
    private static Wave[] field918 = new Wave[5000];

    @OriginalMember(owner = "cc", name = "d", descriptor = "[I")
    public static int[] field919 = new int[5000];

    @OriginalMember(owner = "cc", name = "h", descriptor = "I")
    private int field923;

    @OriginalMember(owner = "cc", name = "i", descriptor = "I")
    private int field924;

    @OriginalMember(owner = "cc", name = "f", descriptor = "Llb;")
    private static Packet field921;

    @OriginalMember(owner = "cc", name = "e", descriptor = "[B")
    private static byte[] field920;

    @OriginalMember(owner = "cc", name = "<init>", descriptor = "(B)V")
    private Wave(byte arg0) {
        if (arg0 != 3) {
            throw new NullPointerException();
        }
    }

    @OriginalMember(owner = "cc", name = "a", descriptor = "(ZLlb;)V")
    public static final void method318(boolean arg0, Packet arg1) {
        if (arg0) {
            field916 = !field916;
        }
        field920 = new byte[441000];
        field921 = new Packet(field920, (byte) -93);
        Tone.method324();
        while (true) {
            int var2 = arg1.method231();
            if (var2 == 65535) {
                return;
            }
            field918[var2] = new Wave((byte) 3);
            field918[var2].method320(210, arg1);
            field919[var2] = field918[var2].method321(-183);
        }
    }

    @OriginalMember(owner = "cc", name = "a", descriptor = "(IZI)Llb;")
    public static final Packet method319(int arg0, boolean arg1, int arg2) {
        if (arg1) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        if (field918[arg2] == null) {
            return null;
        } else {
            Wave var4 = field918[arg2];
            return var4.method322(arg0, 422);
        }
    }

    @OriginalMember(owner = "cc", name = "a", descriptor = "(ILlb;)V")
    private final void method320(int arg0, Packet arg1) {
        for (int var3 = 0; var3 < 10; var3++) {
            int var5 = arg1.method229();
            if (var5 != 0) {
                arg1.field713--;
                this.field922[var3] = new Tone();
                this.field922[var3].method327(210, arg1);
            }
        }
        this.field923 = arg1.method231();
        this.field924 = arg1.method231();
        if (arg0 <= 0) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
    }

    @OriginalMember(owner = "cc", name = "a", descriptor = "(I)I")
    private final int method321(int arg0) {
        if (arg0 >= 0) {
            return this.field917;
        }
        int var2 = 9999999;
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field922[var3] != null && this.field922[var3].field941 / 20 < var2) {
                var2 = this.field922[var3].field941 / 20;
            }
        }
        if (this.field923 < this.field924 && this.field923 / 20 < var2) {
            var2 = this.field923 / 20;
        }
        if (var2 == 9999999 || var2 == 0) {
            return 0;
        }
        for (int var4 = 0; var4 < 10; var4++) {
            if (this.field922[var4] != null) {
                this.field922[var4].field941 -= var2 * 20;
            }
        }
        if (this.field923 < this.field924) {
            this.field923 -= var2 * 20;
            this.field924 -= var2 * 20;
        }
        return var2;
    }

    @OriginalMember(owner = "cc", name = "a", descriptor = "(II)Llb;")
    private final Packet method322(int arg0, int arg1) {
        int var3 = this.method323(arg0);
        field921.field713 = 0;
        field921.method223(1380533830);
        field921.method224(0, var3 + 36);
        field921.method223(1463899717);
        field921.method223(1718449184);
        field921.method224(0, 16);
        field921.method221(1, 9);
        field921.method221(1, 9);
        if (arg1 <= 0) {
            throw new NullPointerException();
        }
        field921.method224(0, 22050);
        field921.method224(0, 22050);
        field921.method221(1, 9);
        field921.method221(8, 9);
        field921.method223(1684108385);
        field921.method224(0, var3);
        field921.field713 += var3;
        return field921;
    }

    @OriginalMember(owner = "cc", name = "b", descriptor = "(I)I")
    private final int method323(int arg0) {
        int var2 = 0;
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field922[var3] != null && this.field922[var3].field941 + this.field922[var3].field940 > var2) {
                var2 = this.field922[var3].field941 + this.field922[var3].field940;
            }
        }
        if (var2 == 0) {
            return 0;
        }
        int var4 = var2 * 22050 / 1000;
        int var5 = this.field923 * 22050 / 1000;
        int var6 = this.field924 * 22050 / 1000;
        if (var5 < 0 || var5 > var4 || var6 < 0 || var6 > var4 || var5 >= var6) {
            arg0 = 0;
        }
        int var7 = (arg0 - 1) * (var6 - var5) + var4;
        for (int var8 = 44; var8 < var7 + 44; var8++) {
            field920[var8] = -128;
        }
        for (int var9 = 0; var9 < 10; var9++) {
            if (this.field922[var9] != null) {
                int var15 = this.field922[var9].field940 * 22050 / 1000;
                int var16 = this.field922[var9].field941 * 22050 / 1000;
                int[] var17 = this.field922[var9].method325(var15, this.field922[var9].field940);
                for (int var18 = 0; var18 < var15; var18++) {
                    field920[var16 + var18 + 44] += (byte) (var17[var18] >> 8);
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
                field920[var10 + var11] = field920[var11];
            }
            for (int var12 = 1; var12 < arg0; var12++) {
                int var13 = (var6 - var5) * var12;
                for (int var14 = var5; var14 < var6; var14++) {
                    field920[var13 + var14] = field920[var14];
                }
            }
            var7 -= 44;
        }
        return var7;
    }
}
