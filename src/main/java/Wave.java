import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("yb")
public class Wave {

    @OriginalMember(owner = "yb", name = "b", descriptor = "Z")
    private boolean field768 = false;

    @OriginalMember(owner = "yb", name = "g", descriptor = "I")
    private int field773 = 6;

    @OriginalMember(owner = "yb", name = "l", descriptor = "[Lzb;")
    private Tone[] field778 = new Tone[10];

    @OriginalMember(owner = "yb", name = "a", descriptor = "B")
    private static byte field767 = 8;

    @OriginalMember(owner = "yb", name = "c", descriptor = "I")
    private static int field769 = -37106;

    @OriginalMember(owner = "yb", name = "d", descriptor = "Z")
    private static boolean field770 = true;

    @OriginalMember(owner = "yb", name = "e", descriptor = "B")
    private static byte field771 = 119;

    @OriginalMember(owner = "yb", name = "f", descriptor = "I")
    private static int field772 = 6;

    @OriginalMember(owner = "yb", name = "h", descriptor = "[Lyb;")
    private static Wave[] field774 = new Wave[1000];

    @OriginalMember(owner = "yb", name = "i", descriptor = "[I")
    public static int[] field775 = new int[1000];

    @OriginalMember(owner = "yb", name = "m", descriptor = "I")
    private int field779;

    @OriginalMember(owner = "yb", name = "n", descriptor = "I")
    private int field780;

    @OriginalMember(owner = "yb", name = "k", descriptor = "Lkb;")
    private static Packet field777;

    @OriginalMember(owner = "yb", name = "j", descriptor = "[B")
    private static byte[] field776;

    @OriginalMember(owner = "yb", name = "a", descriptor = "(ILkb;)V")
    public static final void method263(int arg0, Packet arg1) {
        if (arg0 != 4) {
            field770 = !field770;
        }
        field776 = new byte[441000];
        field777 = new Packet(field776, 0);
        Tone.method269();
        while (true) {
            int var2 = arg1.method211();
            if (var2 == 65535) {
                return;
            }
            field774[var2] = new Wave();
            field774[var2].method265(field767, arg1);
            field775[var2] = field774[var2].method266(5);
        }
    }

    @OriginalMember(owner = "yb", name = "a", descriptor = "(IBI)Lkb;")
    public static final Packet method264(int arg0, byte arg1, int arg2) {
        if (field771 != arg1) {
            field769 = 0;
        }
        if (field774[arg0] == null) {
            return null;
        } else {
            Wave var3 = field774[arg0];
            return var3.method267(field772, arg2);
        }
    }

    @OriginalMember(owner = "yb", name = "a", descriptor = "(BLkb;)V")
    private final void method265(byte arg0, Packet arg1) {
        for (int var3 = 0; var3 < 10; var3++) {
            int var5 = arg1.method209();
            if (var5 != 0) {
                arg1.field623--;
                this.field778[var3] = new Tone();
                this.field778[var3].method272(field767, arg1);
            }
        }
        this.field779 = arg1.method211();
        this.field780 = arg1.method211();
        if (arg0 != 8) {
            throw new NullPointerException();
        }
        boolean var4 = false;
    }

    @OriginalMember(owner = "yb", name = "a", descriptor = "(I)I")
    private final int method266(int arg0) {
        int var2 = 9999999;
        if (arg0 != 5) {
            field770 = !field770;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field778[var3] != null && this.field778[var3].field798 / 20 < var2) {
                var2 = this.field778[var3].field798 / 20;
            }
        }
        if (this.field779 < this.field780 && this.field779 / 20 < var2) {
            var2 = this.field779 / 20;
        }
        if (var2 == 9999999 || var2 == 0) {
            return 0;
        }
        for (int var4 = 0; var4 < 10; var4++) {
            if (this.field778[var4] != null) {
                this.field778[var4].field798 -= var2 * 20;
            }
        }
        if (this.field779 < this.field780) {
            this.field779 -= var2 * 20;
            this.field780 -= var2 * 20;
        }
        return var2;
    }

    @OriginalMember(owner = "yb", name = "a", descriptor = "(II)Lkb;")
    private final Packet method267(int arg0, int arg1) {
        int var3 = this.method268(arg1);
        field777.field623 = 0;
        field777.method203(1380533830);
        field777.method204(0, var3 + 36);
        field777.method203(1463899717);
        field777.method203(1718449184);
        field777.method204(0, 16);
        field777.method201(1, false);
        field777.method201(1, false);
        if (this.field773 != arg0) {
            this.field768 = !this.field768;
        }
        field777.method204(0, 22050);
        field777.method204(0, 22050);
        field777.method201(1, false);
        field777.method201(8, false);
        field777.method203(1684108385);
        field777.method204(0, var3);
        field777.field623 += var3;
        return field777;
    }

    @OriginalMember(owner = "yb", name = "b", descriptor = "(I)I")
    private final int method268(int arg0) {
        int var2 = 0;
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field778[var3] != null && this.field778[var3].field798 + this.field778[var3].field797 > var2) {
                var2 = this.field778[var3].field798 + this.field778[var3].field797;
            }
        }
        if (var2 == 0) {
            return 0;
        }
        int var4 = var2 * 22050 / 1000;
        int var5 = this.field779 * 22050 / 1000;
        int var6 = this.field780 * 22050 / 1000;
        if (var5 < 0 || var5 > var4 || var6 < 0 || var6 > var4 || var5 >= var6) {
            arg0 = 0;
        }
        int var7 = (arg0 - 1) * (var6 - var5) + var4;
        for (int var8 = 44; var8 < var7 + 44; var8++) {
            field776[var8] = -128;
        }
        for (int var9 = 0; var9 < 10; var9++) {
            if (this.field778[var9] != null) {
                int var15 = this.field778[var9].field797 * 22050 / 1000;
                int var16 = this.field778[var9].field798 * 22050 / 1000;
                int[] var17 = this.field778[var9].method270(var15, this.field778[var9].field797);
                for (int var18 = 0; var18 < var15; var18++) {
                    field776[var16 + var18 + 44] += (byte) (var17[var18] >> 8);
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
                field776[var10 + var11] = field776[var11];
            }
            for (int var12 = 1; var12 < arg0; var12++) {
                int var13 = (var6 - var5) * var12;
                for (int var14 = var5; var14 < var6; var14++) {
                    field776[var13 + var14] = field776[var14];
                }
            }
            var7 -= 44;
        }
        return var7;
    }
}
