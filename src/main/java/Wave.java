import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("cc")
public class Wave {

    @OriginalMember(owner = "cc", name = "f", descriptor = "[Ldc;")
    private Tone[] field897 = new Tone[10];

    @OriginalMember(owner = "cc", name = "b", descriptor = "[Lcc;")
    private static Wave[] field893 = new Wave[1000];

    @OriginalMember(owner = "cc", name = "c", descriptor = "[I")
    public static int[] field894 = new int[1000];

    @OriginalMember(owner = "cc", name = "a", descriptor = "I")
    private static int field892;

    @OriginalMember(owner = "cc", name = "g", descriptor = "I")
    private int field898;

    @OriginalMember(owner = "cc", name = "h", descriptor = "I")
    private int field899;

    @OriginalMember(owner = "cc", name = "e", descriptor = "Lmb;")
    private static Packet field896;

    @OriginalMember(owner = "cc", name = "d", descriptor = "[B")
    private static byte[] field895;

    @OriginalMember(owner = "cc", name = "<init>", descriptor = "(I)V")
    private Wave(int arg0) {
        if (arg0 != 0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
    }

    @OriginalMember(owner = "cc", name = "a", descriptor = "(ZLmb;)V")
    public static final void method322(boolean arg0, Packet arg1) {
        field895 = new byte[441000];
        field896 = new Packet(field895, (byte) 3);
        Tone.method328();
        if (!arg0) {
            field892 = 84;
        }
        while (true) {
            int var2 = arg1.method241();
            if (var2 == 65535) {
                return;
            }
            field893[var2] = new Wave(0);
            field893[var2].method324(9, arg1);
            field894[var2] = field893[var2].method325(0);
        }
    }

    @OriginalMember(owner = "cc", name = "a", descriptor = "(IIB)Lmb;")
    public static final Packet method323(int arg0, int arg1, byte arg2) {
        if (arg2 != -74) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        if (field893[arg1] == null) {
            return null;
        } else {
            Wave var4 = field893[arg1];
            return var4.method326(-10189, arg0);
        }
    }

    @OriginalMember(owner = "cc", name = "a", descriptor = "(ILmb;)V")
    private final void method324(int arg0, Packet arg1) {
        for (int var3 = 0; var3 < 10; var3++) {
            int var5 = arg1.method239();
            if (var5 != 0) {
                arg1.field711--;
                this.field897[var3] = new Tone();
                this.field897[var3].method331(9, arg1);
            }
        }
        if (arg0 < 9 || arg0 > 9) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        this.field898 = arg1.method241();
        this.field899 = arg1.method241();
    }

    @OriginalMember(owner = "cc", name = "a", descriptor = "(I)I")
    private final int method325(int arg0) {
        int var2 = 9999999;
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field897[var3] != null && this.field897[var3].field916 / 20 < var2) {
                var2 = this.field897[var3].field916 / 20;
            }
        }
        if (arg0 != 0) {
            field892 = -275;
        }
        if (this.field898 < this.field899 && this.field898 / 20 < var2) {
            var2 = this.field898 / 20;
        }
        if (var2 == 9999999 || var2 == 0) {
            return 0;
        }
        for (int var4 = 0; var4 < 10; var4++) {
            if (this.field897[var4] != null) {
                this.field897[var4].field916 -= var2 * 20;
            }
        }
        if (this.field898 < this.field899) {
            this.field898 -= var2 * 20;
            this.field899 -= var2 * 20;
        }
        return var2;
    }

    @OriginalMember(owner = "cc", name = "a", descriptor = "(II)Lmb;")
    private final Packet method326(int arg0, int arg1) {
        int var3 = this.method327(arg1);
        field896.field711 = 0;
        field896.method233(1380533830);
        field896.method234(var3 + 36, (byte) 116);
        field896.method233(1463899717);
        field896.method233(1718449184);
        field896.method234(16, (byte) 116);
        if (arg0 != -10189) {
            field892 = 466;
        }
        field896.method231(1, 1);
        field896.method231(1, 1);
        field896.method234(22050, (byte) 116);
        field896.method234(22050, (byte) 116);
        field896.method231(1, 1);
        field896.method231(8, 1);
        field896.method233(1684108385);
        field896.method234(var3, (byte) 116);
        field896.field711 += var3;
        return field896;
    }

    @OriginalMember(owner = "cc", name = "b", descriptor = "(I)I")
    private final int method327(int arg0) {
        int var2 = 0;
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field897[var3] != null && this.field897[var3].field916 + this.field897[var3].field915 > var2) {
                var2 = this.field897[var3].field916 + this.field897[var3].field915;
            }
        }
        if (var2 == 0) {
            return 0;
        }
        int var4 = var2 * 22050 / 1000;
        int var5 = this.field898 * 22050 / 1000;
        int var6 = this.field899 * 22050 / 1000;
        if (var5 < 0 || var5 > var4 || var6 < 0 || var6 > var4 || var5 >= var6) {
            arg0 = 0;
        }
        int var7 = (arg0 - 1) * (var6 - var5) + var4;
        for (int var8 = 44; var8 < var7 + 44; var8++) {
            field895[var8] = -128;
        }
        for (int var9 = 0; var9 < 10; var9++) {
            if (this.field897[var9] != null) {
                int var15 = this.field897[var9].field915 * 22050 / 1000;
                int var16 = this.field897[var9].field916 * 22050 / 1000;
                int[] var17 = this.field897[var9].method329(var15, this.field897[var9].field915);
                for (int var18 = 0; var18 < var15; var18++) {
                    field895[var16 + var18 + 44] += (byte) (var17[var18] >> 8);
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
                field895[var10 + var11] = field895[var11];
            }
            for (int var12 = 1; var12 < arg0; var12++) {
                int var13 = (var6 - var5) * var12;
                for (int var14 = var5; var14 < var6; var14++) {
                    field895[var13 + var14] = field895[var14];
                }
            }
            var7 -= 44;
        }
        return var7;
    }
}
