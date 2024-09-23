import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("cc")
public class Wave {

    @OriginalMember(owner = "cc", name = "b", descriptor = "I")
    private int field893 = 2;

    @OriginalMember(owner = "cc", name = "g", descriptor = "[Ldc;")
    private Tone[] field898 = new Tone[10];

    @OriginalMember(owner = "cc", name = "c", descriptor = "[Lcc;")
    private static Wave[] field894 = new Wave[1000];

    @OriginalMember(owner = "cc", name = "d", descriptor = "[I")
    public static int[] field895 = new int[1000];

    @OriginalMember(owner = "cc", name = "h", descriptor = "I")
    private int field899;

    @OriginalMember(owner = "cc", name = "i", descriptor = "I")
    private int field900;

    @OriginalMember(owner = "cc", name = "f", descriptor = "Lmb;")
    private static Packet field897;

    @OriginalMember(owner = "cc", name = "a", descriptor = "Z")
    private static boolean field892;

    @OriginalMember(owner = "cc", name = "e", descriptor = "[B")
    private static byte[] field896;

    @OriginalMember(owner = "cc", name = "<init>", descriptor = "(I)V")
    private Wave(int arg0) {
        if (arg0 < 1 || arg0 > 1) {
            throw new NullPointerException();
        }
    }

    @OriginalMember(owner = "cc", name = "a", descriptor = "(Lmb;Z)V")
    public static final void method322(Packet arg0, boolean arg1) {
        field896 = new byte[441000];
        field897 = new Packet(field896, 337);
        if (!arg1) {
            return;
        }
        Tone.method328();
        while (true) {
            int var2 = arg0.method241();
            if (var2 == 65535) {
                return;
            }
            field894[var2] = new Wave(1);
            field894[var2].method324(0, arg0);
            field895[var2] = field894[var2].method325(0);
        }
    }

    @OriginalMember(owner = "cc", name = "a", descriptor = "(III)Lmb;")
    public static final Packet method323(int arg0, int arg1, int arg2) {
        if (arg0 <= 0) {
            field892 = !field892;
        }
        if (field894[arg2] == null) {
            return null;
        } else {
            Wave var3 = field894[arg2];
            return var3.method326(-186, arg1);
        }
    }

    @OriginalMember(owner = "cc", name = "a", descriptor = "(ILmb;)V")
    private final void method324(int arg0, Packet arg1) {
        if (arg0 != 0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        for (int var4 = 0; var4 < 10; var4++) {
            int var5 = arg1.method239();
            if (var5 != 0) {
                arg1.field710--;
                this.field898[var4] = new Tone();
                this.field898[var4].method331(0, arg1);
            }
        }
        this.field899 = arg1.method241();
        this.field900 = arg1.method241();
    }

    @OriginalMember(owner = "cc", name = "a", descriptor = "(I)I")
    private final int method325(int arg0) {
        int var2 = 9999999;
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field898[var3] != null && this.field898[var3].field916 / 20 < var2) {
                var2 = this.field898[var3].field916 / 20;
            }
        }
        if (arg0 != 0) {
            return this.field893;
        }
        if (this.field899 < this.field900 && this.field899 / 20 < var2) {
            var2 = this.field899 / 20;
        }
        if (var2 == 9999999 || var2 == 0) {
            return 0;
        }
        for (int var4 = 0; var4 < 10; var4++) {
            if (this.field898[var4] != null) {
                this.field898[var4].field916 -= var2 * 20;
            }
        }
        if (this.field899 < this.field900) {
            this.field899 -= var2 * 20;
            this.field900 -= var2 * 20;
        }
        return var2;
    }

    @OriginalMember(owner = "cc", name = "a", descriptor = "(II)Lmb;")
    private final Packet method326(int arg0, int arg1) {
        int var3 = this.method327(arg1);
        field897.field710 = 0;
        field897.method233(1380533830);
        field897.method234(var3 + 36, -703);
        field897.method233(1463899717);
        if (arg0 >= 0) {
            throw new NullPointerException();
        }
        field897.method233(1718449184);
        field897.method234(16, -703);
        field897.method231((byte) 9, 1);
        field897.method231((byte) 9, 1);
        field897.method234(22050, -703);
        field897.method234(22050, -703);
        field897.method231((byte) 9, 1);
        field897.method231((byte) 9, 8);
        field897.method233(1684108385);
        field897.method234(var3, -703);
        field897.field710 += var3;
        return field897;
    }

    @OriginalMember(owner = "cc", name = "b", descriptor = "(I)I")
    private final int method327(int arg0) {
        int var2 = 0;
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field898[var3] != null && this.field898[var3].field916 + this.field898[var3].field915 > var2) {
                var2 = this.field898[var3].field916 + this.field898[var3].field915;
            }
        }
        if (var2 == 0) {
            return 0;
        }
        int var4 = var2 * 22050 / 1000;
        int var5 = this.field899 * 22050 / 1000;
        int var6 = this.field900 * 22050 / 1000;
        if (var5 < 0 || var5 > var4 || var6 < 0 || var6 > var4 || var5 >= var6) {
            arg0 = 0;
        }
        int var7 = (arg0 - 1) * (var6 - var5) + var4;
        for (int var8 = 44; var8 < var7 + 44; var8++) {
            field896[var8] = -128;
        }
        for (int var9 = 0; var9 < 10; var9++) {
            if (this.field898[var9] != null) {
                int var15 = this.field898[var9].field915 * 22050 / 1000;
                int var16 = this.field898[var9].field916 * 22050 / 1000;
                int[] var17 = this.field898[var9].method329(var15, this.field898[var9].field915);
                for (int var18 = 0; var18 < var15; var18++) {
                    field896[var16 + var18 + 44] += (byte) (var17[var18] >> 8);
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
                field896[var10 + var11] = field896[var11];
            }
            for (int var12 = 1; var12 < arg0; var12++) {
                int var13 = (var6 - var5) * var12;
                for (int var14 = var5; var14 < var6; var14++) {
                    field896[var13 + var14] = field896[var14];
                }
            }
            var7 -= 44;
        }
        return var7;
    }
}
