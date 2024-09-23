import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("cc")
public class Wave {

    @OriginalMember(owner = "cc", name = "b", descriptor = "I")
    private int field919 = 921;

    @OriginalMember(owner = "cc", name = "c", descriptor = "I")
    private int field920 = 18835;

    @OriginalMember(owner = "cc", name = "h", descriptor = "[Ldc;")
    private Tone[] field925 = new Tone[10];

    @OriginalMember(owner = "cc", name = "a", descriptor = "Z")
    private static boolean field918 = true;

    @OriginalMember(owner = "cc", name = "d", descriptor = "[Lcc;")
    private static Wave[] field921 = new Wave[5000];

    @OriginalMember(owner = "cc", name = "e", descriptor = "[I")
    public static int[] field922 = new int[5000];

    @OriginalMember(owner = "cc", name = "i", descriptor = "I")
    private int field926;

    @OriginalMember(owner = "cc", name = "j", descriptor = "I")
    private int field927;

    @OriginalMember(owner = "cc", name = "g", descriptor = "Llb;")
    private static Packet field924;

    @OriginalMember(owner = "cc", name = "f", descriptor = "[B")
    private static byte[] field923;

    @OriginalMember(owner = "cc", name = "<init>", descriptor = "(I)V")
    private Wave(int arg0) {
        if (arg0 >= 0) {
            throw new NullPointerException();
        }
    }

    @OriginalMember(owner = "cc", name = "a", descriptor = "(ILlb;)V")
    public static final void method318(int arg0, Packet arg1) {
        field923 = new byte[441000];
        if (arg0 != 0) {
            field918 = !field918;
        }
        field924 = new Packet(field923, -26728);
        Tone.method324();
        while (true) {
            int var2 = arg1.method231();
            if (var2 == 65535) {
                return;
            }
            field921[var2] = new Wave(-374);
            field921[var2].method320(arg1, 8);
            field922[var2] = field921[var2].method321(-36823);
        }
    }

    @OriginalMember(owner = "cc", name = "a", descriptor = "(ZII)Llb;")
    public static final Packet method319(boolean arg0, int arg1, int arg2) {
        if (!arg0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        if (field921[arg2] == null) {
            return null;
        } else {
            Wave var4 = field921[arg2];
            return var4.method322(arg1, -33430);
        }
    }

    @OriginalMember(owner = "cc", name = "a", descriptor = "(Llb;I)V")
    private final void method320(Packet arg0, int arg1) {
        for (int var3 = 0; var3 < 10; var3++) {
            int var4 = arg0.method229();
            if (var4 != 0) {
                arg0.field717--;
                this.field925[var3] = new Tone();
                this.field925[var3].method327(arg0, 8);
            }
        }
        if (arg1 != 8) {
            this.field919 = -128;
        }
        this.field926 = arg0.method231();
        this.field927 = arg0.method231();
    }

    @OriginalMember(owner = "cc", name = "a", descriptor = "(I)I")
    private final int method321(int arg0) {
        int var2 = 9999999;
        if (arg0 != -36823) {
            return this.field919;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field925[var3] != null && this.field925[var3].field945 / 20 < var2) {
                var2 = this.field925[var3].field945 / 20;
            }
        }
        if (this.field926 < this.field927 && this.field926 / 20 < var2) {
            var2 = this.field926 / 20;
        }
        if (var2 == 9999999 || var2 == 0) {
            return 0;
        }
        for (int var4 = 0; var4 < 10; var4++) {
            if (this.field925[var4] != null) {
                this.field925[var4].field945 -= var2 * 20;
            }
        }
        if (this.field926 < this.field927) {
            this.field926 -= var2 * 20;
            this.field927 -= var2 * 20;
        }
        return var2;
    }

    @OriginalMember(owner = "cc", name = "a", descriptor = "(II)Llb;")
    private final Packet method322(int arg0, int arg1) {
        int var3 = this.method323(arg0);
        field924.field717 = 0;
        field924.method223(1380533830);
        field924.method224((byte) 5, var3 + 36);
        field924.method223(1463899717);
        field924.method223(1718449184);
        field924.method224((byte) 5, 16);
        field924.method221(1, 0);
        field924.method221(1, 0);
        field924.method224((byte) 5, 22050);
        field924.method224((byte) 5, 22050);
        field924.method221(1, 0);
        field924.method221(8, 0);
        field924.method223(1684108385);
        field924.method224((byte) 5, var3);
        if (arg1 != -33430) {
            this.field920 = 337;
        }
        field924.field717 += var3;
        return field924;
    }

    @OriginalMember(owner = "cc", name = "b", descriptor = "(I)I")
    private final int method323(int arg0) {
        int var2 = 0;
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field925[var3] != null && this.field925[var3].field945 + this.field925[var3].field944 > var2) {
                var2 = this.field925[var3].field945 + this.field925[var3].field944;
            }
        }
        if (var2 == 0) {
            return 0;
        }
        int var4 = var2 * 22050 / 1000;
        int var5 = this.field926 * 22050 / 1000;
        int var6 = this.field927 * 22050 / 1000;
        if (var5 < 0 || var5 > var4 || var6 < 0 || var6 > var4 || var5 >= var6) {
            arg0 = 0;
        }
        int var7 = (arg0 - 1) * (var6 - var5) + var4;
        for (int var8 = 44; var8 < var7 + 44; var8++) {
            field923[var8] = -128;
        }
        for (int var9 = 0; var9 < 10; var9++) {
            if (this.field925[var9] != null) {
                int var15 = this.field925[var9].field944 * 22050 / 1000;
                int var16 = this.field925[var9].field945 * 22050 / 1000;
                int[] var17 = this.field925[var9].method325(var15, this.field925[var9].field944);
                for (int var18 = 0; var18 < var15; var18++) {
                    field923[var16 + var18 + 44] += (byte) (var17[var18] >> 8);
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
                field923[var10 + var11] = field923[var11];
            }
            for (int var12 = 1; var12 < arg0; var12++) {
                int var13 = (var6 - var5) * var12;
                for (int var14 = var5; var14 < var6; var14++) {
                    field923[var13 + var14] = field923[var14];
                }
            }
            var7 -= 44;
        }
        return var7;
    }
}
