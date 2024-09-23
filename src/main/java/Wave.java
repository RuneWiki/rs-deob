import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("cc")
public class Wave {

    @OriginalMember(owner = "cc", name = "b", descriptor = "Z")
    private boolean field870 = true;

    @OriginalMember(owner = "cc", name = "d", descriptor = "B")
    private byte field872 = 33;

    @OriginalMember(owner = "cc", name = "i", descriptor = "[Ldc;")
    private Tone[] field877 = new Tone[10];

    @OriginalMember(owner = "cc", name = "c", descriptor = "I")
    private static int field871 = 309;

    @OriginalMember(owner = "cc", name = "e", descriptor = "[Lcc;")
    private static Wave[] field873 = new Wave[1000];

    @OriginalMember(owner = "cc", name = "f", descriptor = "[I")
    public static int[] field874 = new int[1000];

    @OriginalMember(owner = "cc", name = "j", descriptor = "I")
    private int field878;

    @OriginalMember(owner = "cc", name = "k", descriptor = "I")
    private int field879;

    @OriginalMember(owner = "cc", name = "h", descriptor = "Lmb;")
    private static Packet field876;

    @OriginalMember(owner = "cc", name = "a", descriptor = "Z")
    private static boolean field869;

    @OriginalMember(owner = "cc", name = "g", descriptor = "[B")
    private static byte[] field875;

    @OriginalMember(owner = "cc", name = "a", descriptor = "(Lmb;B)V")
    public static final void method308(Packet arg0, byte arg1) {
        field875 = new byte[441000];
        field876 = new Packet(699, field875);
        if (arg1 == 7) {
            boolean var2 = false;
        } else {
            field871 = 383;
        }
        Tone.method314();
        while (true) {
            int var3 = arg0.method233();
            if (var3 == 65535) {
                return;
            }
            field873[var3] = new Wave();
            field873[var3].method310(false, arg0);
            field874[var3] = field873[var3].method311((byte) 33);
        }
    }

    @OriginalMember(owner = "cc", name = "a", descriptor = "(III)Lmb;")
    public static final Packet method309(int arg0, int arg1, int arg2) {
        while (arg1 >= 0) {
        }
        if (field873[arg2] == null) {
            return null;
        } else {
            Wave var3 = field873[arg2];
            return var3.method312(true, arg0);
        }
    }

    @OriginalMember(owner = "cc", name = "a", descriptor = "(ZLmb;)V")
    private final void method310(boolean arg0, Packet arg1) {
        for (int var3 = 0; var3 < 10; var3++) {
            int var4 = arg1.method231();
            if (var4 != 0) {
                arg1.field694--;
                this.field877[var3] = new Tone();
                this.field877[var3].method317(false, arg1);
            }
        }
        if (arg0) {
            this.field870 = !this.field870;
        }
        this.field878 = arg1.method233();
        this.field879 = arg1.method233();
    }

    @OriginalMember(owner = "cc", name = "a", descriptor = "(B)I")
    private final int method311(byte arg0) {
        int var2 = 9999999;
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field877[var3] != null && this.field877[var3].field895 / 20 < var2) {
                var2 = this.field877[var3].field895 / 20;
            }
        }
        if (this.field872 != arg0) {
            field869 = true;
        }
        if (this.field878 < this.field879 && this.field878 / 20 < var2) {
            var2 = this.field878 / 20;
        }
        if (var2 == 9999999 || var2 == 0) {
            return 0;
        }
        for (int var4 = 0; var4 < 10; var4++) {
            if (this.field877[var4] != null) {
                this.field877[var4].field895 -= var2 * 20;
            }
        }
        if (this.field878 < this.field879) {
            this.field878 -= var2 * 20;
            this.field879 -= var2 * 20;
        }
        return var2;
    }

    @OriginalMember(owner = "cc", name = "a", descriptor = "(ZI)Lmb;")
    private final Packet method312(boolean arg0, int arg1) {
        int var3 = this.method313(arg1);
        field876.field694 = 0;
        field876.method225(1380533830);
        field876.method226(var3 + 36, 6);
        field876.method225(1463899717);
        field876.method225(1718449184);
        field876.method226(16, 6);
        field876.method223((byte) 4, 1);
        field876.method223((byte) 4, 1);
        field876.method226(22050, 6);
        field876.method226(22050, 6);
        if (!arg0) {
            throw new NullPointerException();
        }
        field876.method223((byte) 4, 1);
        field876.method223((byte) 4, 8);
        field876.method225(1684108385);
        field876.method226(var3, 6);
        field876.field694 += var3;
        return field876;
    }

    @OriginalMember(owner = "cc", name = "a", descriptor = "(I)I")
    private final int method313(int arg0) {
        int var2 = 0;
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field877[var3] != null && this.field877[var3].field895 + this.field877[var3].field894 > var2) {
                var2 = this.field877[var3].field895 + this.field877[var3].field894;
            }
        }
        if (var2 == 0) {
            return 0;
        }
        int var4 = var2 * 22050 / 1000;
        int var5 = this.field878 * 22050 / 1000;
        int var6 = this.field879 * 22050 / 1000;
        if (var5 < 0 || var5 > var4 || var6 < 0 || var6 > var4 || var5 >= var6) {
            arg0 = 0;
        }
        int var7 = (arg0 - 1) * (var6 - var5) + var4;
        for (int var8 = 44; var8 < var7 + 44; var8++) {
            field875[var8] = -128;
        }
        for (int var9 = 0; var9 < 10; var9++) {
            if (this.field877[var9] != null) {
                int var15 = this.field877[var9].field894 * 22050 / 1000;
                int var16 = this.field877[var9].field895 * 22050 / 1000;
                int[] var17 = this.field877[var9].method315(var15, this.field877[var9].field894);
                for (int var18 = 0; var18 < var15; var18++) {
                    field875[var16 + var18 + 44] += (byte) (var17[var18] >> 8);
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
                field875[var10 + var11] = field875[var11];
            }
            for (int var12 = 1; var12 < arg0; var12++) {
                int var13 = (var6 - var5) * var12;
                for (int var14 = var5; var14 < var6; var14++) {
                    field875[var13 + var14] = field875[var14];
                }
            }
            var7 -= 44;
        }
        return var7;
    }
}
