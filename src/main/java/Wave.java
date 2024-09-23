import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("cc")
public class Wave {

    @OriginalMember(owner = "cc", name = "a", descriptor = "I")
    private int field877 = 20776;

    @OriginalMember(owner = "cc", name = "b", descriptor = "Z")
    private boolean field878 = true;

    @OriginalMember(owner = "cc", name = "g", descriptor = "[Ldc;")
    private Tone[] field883 = new Tone[10];

    @OriginalMember(owner = "cc", name = "c", descriptor = "[Lcc;")
    private static Wave[] field879 = new Wave[1000];

    @OriginalMember(owner = "cc", name = "d", descriptor = "[I")
    public static int[] field880 = new int[1000];

    @OriginalMember(owner = "cc", name = "h", descriptor = "I")
    private int field884;

    @OriginalMember(owner = "cc", name = "i", descriptor = "I")
    private int field885;

    @OriginalMember(owner = "cc", name = "f", descriptor = "Lmb;")
    private static Packet field882;

    @OriginalMember(owner = "cc", name = "e", descriptor = "[B")
    private static byte[] field881;

    @OriginalMember(owner = "cc", name = "a", descriptor = "(Lmb;I)V")
    public static final void method312(Packet arg0, int arg1) {
        int var2 = 67 / arg1;
        field881 = new byte[441000];
        field882 = new Packet(field881, true);
        Tone.method318();
        while (true) {
            int var3 = arg0.method233();
            if (var3 == 65535) {
                return;
            }
            field879[var3] = new Wave();
            field879[var3].method314(3251, arg0);
            field880[var3] = field879[var3].method315(8);
        }
    }

    @OriginalMember(owner = "cc", name = "a", descriptor = "(III)Lmb;")
    public static final Packet method313(int arg0, int arg1, int arg2) {
        if (arg2 != 3) {
            throw new NullPointerException();
        } else if (field879[arg1] == null) {
            return null;
        } else {
            Wave var3 = field879[arg1];
            return var3.method316((byte) 115, arg0);
        }
    }

    @OriginalMember(owner = "cc", name = "a", descriptor = "(ILmb;)V")
    private final void method314(int arg0, Packet arg1) {
        for (int var3 = 0; var3 < 10; var3++) {
            int var4 = arg1.method231();
            if (var4 != 0) {
                arg1.field698--;
                this.field883[var3] = new Tone();
                this.field883[var3].method321(3251, arg1);
            }
        }
        if (arg0 != 3251) {
            throw new NullPointerException();
        }
        this.field884 = arg1.method233();
        this.field885 = arg1.method233();
    }

    @OriginalMember(owner = "cc", name = "a", descriptor = "(I)I")
    private final int method315(int arg0) {
        int var2 = 9999999;
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field883[var3] != null && this.field883[var3].field900 / 20 < var2) {
                var2 = this.field883[var3].field900 / 20;
            }
        }
        if (arg0 < 8 || arg0 > 8) {
            this.field878 = !this.field878;
        }
        if (this.field884 < this.field885 && this.field884 / 20 < var2) {
            var2 = this.field884 / 20;
        }
        if (var2 == 9999999 || var2 == 0) {
            return 0;
        }
        for (int var4 = 0; var4 < 10; var4++) {
            if (this.field883[var4] != null) {
                this.field883[var4].field900 -= var2 * 20;
            }
        }
        if (this.field884 < this.field885) {
            this.field884 -= var2 * 20;
            this.field885 -= var2 * 20;
        }
        return var2;
    }

    @OriginalMember(owner = "cc", name = "a", descriptor = "(BI)Lmb;")
    private final Packet method316(byte arg0, int arg1) {
        int var3 = this.method317(arg1);
        if (arg0 != 115) {
            throw new NullPointerException();
        }
        field882.field698 = 0;
        field882.method225(1380533830);
        field882.method226(false, var3 + 36);
        field882.method225(1463899717);
        field882.method225(1718449184);
        field882.method226(false, 16);
        field882.method223(1, this.field877);
        field882.method223(1, this.field877);
        field882.method226(false, 22050);
        field882.method226(false, 22050);
        field882.method223(1, this.field877);
        field882.method223(8, this.field877);
        field882.method225(1684108385);
        field882.method226(false, var3);
        field882.field698 += var3;
        return field882;
    }

    @OriginalMember(owner = "cc", name = "b", descriptor = "(I)I")
    private final int method317(int arg0) {
        int var2 = 0;
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field883[var3] != null && this.field883[var3].field900 + this.field883[var3].field899 > var2) {
                var2 = this.field883[var3].field900 + this.field883[var3].field899;
            }
        }
        if (var2 == 0) {
            return 0;
        }
        int var4 = var2 * 22050 / 1000;
        int var5 = this.field884 * 22050 / 1000;
        int var6 = this.field885 * 22050 / 1000;
        if (var5 < 0 || var5 > var4 || var6 < 0 || var6 > var4 || var5 >= var6) {
            arg0 = 0;
        }
        int var7 = (arg0 - 1) * (var6 - var5) + var4;
        for (int var8 = 44; var8 < var7 + 44; var8++) {
            field881[var8] = -128;
        }
        for (int var9 = 0; var9 < 10; var9++) {
            if (this.field883[var9] != null) {
                int var15 = this.field883[var9].field899 * 22050 / 1000;
                int var16 = this.field883[var9].field900 * 22050 / 1000;
                int[] var17 = this.field883[var9].method319(var15, this.field883[var9].field899);
                for (int var18 = 0; var18 < var15; var18++) {
                    field881[var16 + var18 + 44] += (byte) (var17[var18] >> 8);
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
                field881[var10 + var11] = field881[var11];
            }
            for (int var12 = 1; var12 < arg0; var12++) {
                int var13 = (var6 - var5) * var12;
                for (int var14 = var5; var14 < var6; var14++) {
                    field881[var13 + var14] = field881[var14];
                }
            }
            var7 -= 44;
        }
        return var7;
    }
}
