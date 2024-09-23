import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("cc")
public class Wave {

    @OriginalMember(owner = "cc", name = "i", descriptor = "[Ldc;")
    private Tone[] field931 = new Tone[10];

    @OriginalMember(owner = "cc", name = "b", descriptor = "Z")
    private static boolean field924 = true;

    @OriginalMember(owner = "cc", name = "d", descriptor = "I")
    private static int field926 = -35541;

    @OriginalMember(owner = "cc", name = "e", descriptor = "[Lcc;")
    private static Wave[] field927 = new Wave[1000];

    @OriginalMember(owner = "cc", name = "f", descriptor = "[I")
    public static int[] field928 = new int[1000];

    @OriginalMember(owner = "cc", name = "a", descriptor = "I")
    private int field923;

    @OriginalMember(owner = "cc", name = "j", descriptor = "I")
    private int field932;

    @OriginalMember(owner = "cc", name = "k", descriptor = "I")
    private int field933;

    @OriginalMember(owner = "cc", name = "h", descriptor = "Lmb;")
    private static Packet field930;

    @OriginalMember(owner = "cc", name = "c", descriptor = "Z")
    private static boolean field925;

    @OriginalMember(owner = "cc", name = "g", descriptor = "[B")
    private static byte[] field929;

    @OriginalMember(owner = "cc", name = "<init>", descriptor = "(I)V")
    private Wave(int arg0) {
        if (arg0 != -35541) {
            field925 = true;
        }
    }

    @OriginalMember(owner = "cc", name = "a", descriptor = "(Lmb;I)V")
    public static final void method322(Packet arg0, int arg1) {
        field929 = new byte[441000];
        field930 = new Packet(45427, field929);
        Tone.method328();
        if (arg1 <= 0) {
            field924 = !field924;
        }
        while (true) {
            int var2 = arg0.method241();
            if (var2 == 65535) {
                return;
            }
            field927[var2] = new Wave(field926);
            field927[var2].method324(arg0, (byte) 66);
            field928[var2] = field927[var2].method325((byte) 8);
        }
    }

    @OriginalMember(owner = "cc", name = "a", descriptor = "(BII)Lmb;")
    public static final Packet method323(byte arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            boolean var3 = false;
        }
        if (field927[arg1] == null) {
            return null;
        } else {
            Wave var4 = field927[arg1];
            return var4.method326((byte) 0, arg2);
        }
    }

    @OriginalMember(owner = "cc", name = "a", descriptor = "(Lmb;B)V")
    private final void method324(Packet arg0, byte arg1) {
        if (arg1 != 66) {
            throw new NullPointerException();
        }
        for (int var3 = 0; var3 < 10; var3++) {
            int var4 = arg0.method239();
            if (var4 != 0) {
                arg0.field736--;
                this.field931[var3] = new Tone();
                this.field931[var3].method331(arg0, (byte) 66);
            }
        }
        this.field932 = arg0.method241();
        this.field933 = arg0.method241();
    }

    @OriginalMember(owner = "cc", name = "a", descriptor = "(B)I")
    private final int method325(byte arg0) {
        int var2 = 9999999;
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field931[var3] != null && this.field931[var3].field949 / 20 < var2) {
                var2 = this.field931[var3].field949 / 20;
            }
        }
        if (this.field932 < this.field933 && this.field932 / 20 < var2) {
            var2 = this.field932 / 20;
        }
        if (var2 == 9999999 || var2 == 0) {
            return 0;
        }
        for (int var4 = 0; var4 < 10; var4++) {
            if (this.field931[var4] != null) {
                this.field931[var4].field949 -= var2 * 20;
            }
        }
        if (arg0 != 8) {
            return 1;
        }
        boolean var5 = false;
        if (this.field932 < this.field933) {
            this.field932 -= var2 * 20;
            this.field933 -= var2 * 20;
        }
        return var2;
    }

    @OriginalMember(owner = "cc", name = "a", descriptor = "(BI)Lmb;")
    private final Packet method326(byte arg0, int arg1) {
        int var3 = this.method327(arg1);
        field930.field736 = 0;
        field930.method233(1380533830);
        field930.method234(var3 + 36, 1);
        field930.method233(1463899717);
        field930.method233(1718449184);
        field930.method234(16, 1);
        field930.method231(1, this.field923);
        field930.method231(1, this.field923);
        field930.method234(22050, 1);
        field930.method234(22050, 1);
        field930.method231(1, this.field923);
        if (arg0 != 0) {
            this.field923 = 151;
        }
        field930.method231(8, this.field923);
        field930.method233(1684108385);
        field930.method234(var3, 1);
        field930.field736 += var3;
        return field930;
    }

    @OriginalMember(owner = "cc", name = "a", descriptor = "(I)I")
    private final int method327(int arg0) {
        int var2 = 0;
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field931[var3] != null && this.field931[var3].field949 + this.field931[var3].field948 > var2) {
                var2 = this.field931[var3].field949 + this.field931[var3].field948;
            }
        }
        if (var2 == 0) {
            return 0;
        }
        int var4 = var2 * 22050 / 1000;
        int var5 = this.field932 * 22050 / 1000;
        int var6 = this.field933 * 22050 / 1000;
        if (var5 < 0 || var5 > var4 || var6 < 0 || var6 > var4 || var5 >= var6) {
            arg0 = 0;
        }
        int var7 = (arg0 - 1) * (var6 - var5) + var4;
        for (int var8 = 44; var8 < var7 + 44; var8++) {
            field929[var8] = -128;
        }
        for (int var9 = 0; var9 < 10; var9++) {
            if (this.field931[var9] != null) {
                int var15 = this.field931[var9].field948 * 22050 / 1000;
                int var16 = this.field931[var9].field949 * 22050 / 1000;
                int[] var17 = this.field931[var9].method329(var15, this.field931[var9].field948);
                for (int var18 = 0; var18 < var15; var18++) {
                    field929[var16 + var18 + 44] += (byte) (var17[var18] >> 8);
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
                field929[var10 + var11] = field929[var11];
            }
            for (int var12 = 1; var12 < arg0; var12++) {
                int var13 = (var6 - var5) * var12;
                for (int var14 = var5; var14 < var6; var14++) {
                    field929[var13 + var14] = field929[var14];
                }
            }
            var7 -= 44;
        }
        return var7;
    }
}
