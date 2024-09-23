import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("yb")
public class Wave {

    @OriginalMember(owner = "yb", name = "c", descriptor = "I")
    private int field764 = -865;

    @OriginalMember(owner = "yb", name = "i", descriptor = "[Lzb;")
    private Tone[] field770 = new Tone[10];

    @OriginalMember(owner = "yb", name = "a", descriptor = "B")
    private static byte field762 = 6;

    @OriginalMember(owner = "yb", name = "b", descriptor = "Z")
    private static boolean field763 = true;

    @OriginalMember(owner = "yb", name = "d", descriptor = "Z")
    private static boolean field765 = true;

    @OriginalMember(owner = "yb", name = "e", descriptor = "[Lyb;")
    private static Wave[] field766 = new Wave[1000];

    @OriginalMember(owner = "yb", name = "f", descriptor = "[I")
    public static int[] field767 = new int[1000];

    @OriginalMember(owner = "yb", name = "j", descriptor = "I")
    private int field771;

    @OriginalMember(owner = "yb", name = "k", descriptor = "I")
    private int field772;

    @OriginalMember(owner = "yb", name = "h", descriptor = "Lkb;")
    private static Packet field769;

    @OriginalMember(owner = "yb", name = "g", descriptor = "[B")
    private static byte[] field768;

    @OriginalMember(owner = "yb", name = "a", descriptor = "(ILkb;)V")
    public static final void method262(int arg0, Packet arg1) {
        field768 = new byte[441000];
        if (arg0 != 0) {
            return;
        }
        field769 = new Packet(field768, field763);
        Tone.method268();
        while (true) {
            int var2 = arg1.method210();
            if (var2 == 65535) {
                return;
            }
            field766[var2] = new Wave();
            field766[var2].method264(field762, arg1);
            field767[var2] = field766[var2].method265(field765);
        }
    }

    @OriginalMember(owner = "yb", name = "a", descriptor = "(III)Lkb;")
    public static final Packet method263(int arg0, int arg1, int arg2) {
        if (arg1 != 0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        if (field766[arg0] == null) {
            return null;
        } else {
            Wave var4 = field766[arg0];
            return var4.method266(arg2, (byte) 124);
        }
    }

    @OriginalMember(owner = "yb", name = "a", descriptor = "(BLkb;)V")
    private final void method264(byte arg0, Packet arg1) {
        for (int var3 = 0; var3 < 10; var3++) {
            int var5 = arg1.method208();
            if (var5 != 0) {
                arg1.field622--;
                this.field770[var3] = new Tone();
                this.field770[var3].method271(field762, arg1);
            }
        }
        this.field771 = arg1.method210();
        this.field772 = arg1.method210();
        if (arg0 != 6) {
            throw new NullPointerException();
        }
        boolean var4 = false;
    }

    @OriginalMember(owner = "yb", name = "a", descriptor = "(Z)I")
    private final int method265(boolean arg0) {
        int var2 = 9999999;
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field770[var3] != null && this.field770[var3].field789 / 20 < var2) {
                var2 = this.field770[var3].field789 / 20;
            }
        }
        if (this.field771 < this.field772 && this.field771 / 20 < var2) {
            var2 = this.field771 / 20;
        }
        if (var2 == 9999999 || var2 == 0) {
            return 0;
        }
        for (int var4 = 0; var4 < 10; var4++) {
            if (this.field770[var4] != null) {
                this.field770[var4].field789 -= var2 * 20;
            }
        }
        if (!arg0) {
            return 3;
        }
        if (this.field771 < this.field772) {
            this.field771 -= var2 * 20;
            this.field772 -= var2 * 20;
        }
        return var2;
    }

    @OriginalMember(owner = "yb", name = "a", descriptor = "(IB)Lkb;")
    private final Packet method266(int arg0, byte arg1) {
        int var3 = this.method267(arg0);
        field769.field622 = 0;
        field769.method202(1380533830);
        field769.method203(var3 + 36, this.field764);
        field769.method202(1463899717);
        field769.method202(1718449184);
        field769.method203(16, this.field764);
        field769.method200(837, 1);
        field769.method200(837, 1);
        if (arg1 != 124) {
            field763 = !field763;
        }
        field769.method203(22050, this.field764);
        field769.method203(22050, this.field764);
        field769.method200(837, 1);
        field769.method200(837, 8);
        field769.method202(1684108385);
        field769.method203(var3, this.field764);
        field769.field622 += var3;
        return field769;
    }

    @OriginalMember(owner = "yb", name = "a", descriptor = "(I)I")
    private final int method267(int arg0) {
        int var2 = 0;
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field770[var3] != null && this.field770[var3].field789 + this.field770[var3].field788 > var2) {
                var2 = this.field770[var3].field789 + this.field770[var3].field788;
            }
        }
        if (var2 == 0) {
            return 0;
        }
        int var4 = var2 * 22050 / 1000;
        int var5 = this.field771 * 22050 / 1000;
        int var6 = this.field772 * 22050 / 1000;
        if (var5 < 0 || var5 > var4 || var6 < 0 || var6 > var4 || var5 >= var6) {
            arg0 = 0;
        }
        int var7 = (arg0 - 1) * (var6 - var5) + var4;
        for (int var8 = 44; var8 < var7 + 44; var8++) {
            field768[var8] = -128;
        }
        for (int var9 = 0; var9 < 10; var9++) {
            if (this.field770[var9] != null) {
                int var15 = this.field770[var9].field788 * 22050 / 1000;
                int var16 = this.field770[var9].field789 * 22050 / 1000;
                int[] var17 = this.field770[var9].method269(var15, this.field770[var9].field788);
                for (int var18 = 0; var18 < var15; var18++) {
                    field768[var16 + var18 + 44] += (byte) (var17[var18] >> 8);
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
                field768[var10 + var11] = field768[var11];
            }
            for (int var12 = 1; var12 < arg0; var12++) {
                int var13 = (var6 - var5) * var12;
                for (int var14 = var5; var14 < var6; var14++) {
                    field768[var13 + var14] = field768[var14];
                }
            }
            var7 -= 44;
        }
        return var7;
    }
}
