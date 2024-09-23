import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("yb")
public class Wave {

    @OriginalMember(owner = "yb", name = "g", descriptor = "[Lzb;")
    private Tone[] field751 = new Tone[10];

    @OriginalMember(owner = "yb", name = "a", descriptor = "I")
    private static int field745 = 3;

    @OriginalMember(owner = "yb", name = "b", descriptor = "Z")
    private static boolean field746 = true;

    @OriginalMember(owner = "yb", name = "c", descriptor = "[Lyb;")
    private static Wave[] field747 = new Wave[1000];

    @OriginalMember(owner = "yb", name = "d", descriptor = "[I")
    public static int[] field748 = new int[1000];

    @OriginalMember(owner = "yb", name = "h", descriptor = "I")
    private int field752;

    @OriginalMember(owner = "yb", name = "i", descriptor = "I")
    private int field753;

    @OriginalMember(owner = "yb", name = "f", descriptor = "Lkb;")
    private static Packet field750;

    @OriginalMember(owner = "yb", name = "e", descriptor = "[B")
    private static byte[] field749;

    @OriginalMember(owner = "yb", name = "a", descriptor = "(ILkb;)V")
    public static final void method263(int arg0, Packet arg1) {
        field749 = new byte[441000];
        field750 = new Packet(575, field749);
        if (arg0 < 9 || arg0 > 9) {
            field746 = !field746;
        }
        Tone.method269();
        while (true) {
            int var2 = arg1.method211();
            if (var2 == 65535) {
                return;
            }
            field747[var2] = new Wave();
            field747[var2].method265(arg1, (byte) 6);
            field748[var2] = field747[var2].method266((byte) 4);
        }
    }

    @OriginalMember(owner = "yb", name = "a", descriptor = "(III)Lkb;")
    public static final Packet method264(int arg0, int arg1, int arg2) {
        if (field745 != arg1) {
            field745 = 128;
        }
        if (field747[arg2] == null) {
            return null;
        } else {
            Wave var3 = field747[arg2];
            return var3.method267((byte) 5, arg0);
        }
    }

    @OriginalMember(owner = "yb", name = "a", descriptor = "(Lkb;B)V")
    private final void method265(Packet arg0, byte arg1) {
        for (int var3 = 0; var3 < 10; var3++) {
            int var4 = arg0.method209();
            if (var4 != 0) {
                arg0.field612--;
                this.field751[var3] = new Tone();
                this.field751[var3].method272(arg0, (byte) 6);
            }
        }
        this.field752 = arg0.method211();
        if (arg1 != 6) {
            field746 = !field746;
        }
        this.field753 = arg0.method211();
    }

    @OriginalMember(owner = "yb", name = "a", descriptor = "(B)I")
    private final int method266(byte arg0) {
        int var2 = 9999999;
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field751[var3] != null && this.field751[var3].field769 / 20 < var2) {
                var2 = this.field751[var3].field769 / 20;
            }
        }
        if (this.field752 < this.field753 && this.field752 / 20 < var2) {
            var2 = this.field752 / 20;
        }
        if (var2 == 9999999 || var2 == 0) {
            return 0;
        }
        for (int var4 = 0; var4 < 10; var4++) {
            if (this.field751[var4] != null) {
                this.field751[var4].field769 -= var2 * 20;
            }
        }
        if (arg0 == 4) {
            boolean var5 = false;
        } else {
            field745 = 188;
        }
        if (this.field752 < this.field753) {
            this.field752 -= var2 * 20;
            this.field753 -= var2 * 20;
        }
        return var2;
    }

    @OriginalMember(owner = "yb", name = "a", descriptor = "(BI)Lkb;")
    private final Packet method267(byte arg0, int arg1) {
        int var3 = this.method268(arg1);
        field750.field612 = 0;
        field750.method203(1380533830);
        field750.method204(false, var3 + 36);
        if (arg0 != 5) {
            throw new NullPointerException();
        }
        boolean var4 = false;
        field750.method203(1463899717);
        field750.method203(1718449184);
        field750.method204(false, 16);
        field750.method201(1, 102);
        field750.method201(1, 102);
        field750.method204(false, 22050);
        field750.method204(false, 22050);
        field750.method201(1, 102);
        field750.method201(8, 102);
        field750.method203(1684108385);
        field750.method204(false, var3);
        field750.field612 += var3;
        return field750;
    }

    @OriginalMember(owner = "yb", name = "a", descriptor = "(I)I")
    private final int method268(int arg0) {
        int var2 = 0;
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field751[var3] != null && this.field751[var3].field769 + this.field751[var3].field768 > var2) {
                var2 = this.field751[var3].field769 + this.field751[var3].field768;
            }
        }
        if (var2 == 0) {
            return 0;
        }
        int var4 = var2 * 22050 / 1000;
        int var5 = this.field752 * 22050 / 1000;
        int var6 = this.field753 * 22050 / 1000;
        if (var5 < 0 || var5 > var4 || var6 < 0 || var6 > var4 || var5 >= var6) {
            arg0 = 0;
        }
        int var7 = (arg0 - 1) * (var6 - var5) + var4;
        for (int var8 = 44; var8 < var7 + 44; var8++) {
            field749[var8] = -128;
        }
        for (int var9 = 0; var9 < 10; var9++) {
            if (this.field751[var9] != null) {
                int var15 = this.field751[var9].field768 * 22050 / 1000;
                int var16 = this.field751[var9].field769 * 22050 / 1000;
                int[] var17 = this.field751[var9].method270(var15, this.field751[var9].field768);
                for (int var18 = 0; var18 < var15; var18++) {
                    field749[var16 + var18 + 44] += (byte) (var17[var18] >> 8);
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
                field749[var10 + var11] = field749[var11];
            }
            for (int var12 = 1; var12 < arg0; var12++) {
                int var13 = (var6 - var5) * var12;
                for (int var14 = var5; var14 < var6; var14++) {
                    field749[var13 + var14] = field749[var14];
                }
            }
            var7 -= 44;
        }
        return var7;
    }
}
