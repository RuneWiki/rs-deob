import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("yb")
public class Wave {

    @OriginalMember(owner = "yb", name = "a", descriptor = "Z")
    private boolean field764 = true;

    @OriginalMember(owner = "yb", name = "g", descriptor = "[Lzb;")
    private Tone[] field770 = new Tone[10];

    @OriginalMember(owner = "yb", name = "b", descriptor = "I")
    private static int field765 = 473;

    @OriginalMember(owner = "yb", name = "c", descriptor = "[Lyb;")
    private static Wave[] field766 = new Wave[1000];

    @OriginalMember(owner = "yb", name = "d", descriptor = "[I")
    public static int[] field767 = new int[1000];

    @OriginalMember(owner = "yb", name = "h", descriptor = "I")
    private int field771;

    @OriginalMember(owner = "yb", name = "i", descriptor = "I")
    private int field772;

    @OriginalMember(owner = "yb", name = "f", descriptor = "Lkb;")
    private static Packet field769;

    @OriginalMember(owner = "yb", name = "e", descriptor = "[B")
    private static byte[] field768;

    @OriginalMember(owner = "yb", name = "a", descriptor = "(Lkb;I)V")
    public static final void method270(Packet arg0, int arg1) {
        field768 = new byte[441000];
        field769 = new Packet(363, field768);
        int var2 = 87 / arg1;
        Tone.method276();
        while (true) {
            int var3 = arg0.method218();
            if (var3 == 65535) {
                return;
            }
            field766[var3] = new Wave();
            field766[var3].method272(false, arg0);
            field767[var3] = field766[var3].method273((byte) 7);
        }
    }

    @OriginalMember(owner = "yb", name = "a", descriptor = "(BII)Lkb;")
    public static final Packet method271(byte arg0, int arg1, int arg2) {
        if (arg0 != -16) {
            field765 = -83;
        }
        if (field766[arg2] == null) {
            return null;
        } else {
            Wave var3 = field766[arg2];
            return var3.method274(true, arg1);
        }
    }

    @OriginalMember(owner = "yb", name = "a", descriptor = "(ZLkb;)V")
    private final void method272(boolean arg0, Packet arg1) {
        for (int var3 = 0; var3 < 10; var3++) {
            int var4 = arg1.method216();
            if (var4 != 0) {
                arg1.field622--;
                this.field770[var3] = new Tone();
                this.field770[var3].method279(false, arg1);
            }
        }
        if (arg0) {
            field765 = -307;
        }
        this.field771 = arg1.method218();
        this.field772 = arg1.method218();
    }

    @OriginalMember(owner = "yb", name = "a", descriptor = "(B)I")
    private final int method273(byte arg0) {
        int var2 = 9999999;
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field770[var3] != null && this.field770[var3].field789 / 20 < var2) {
                var2 = this.field770[var3].field789 / 20;
            }
        }
        if (arg0 == 7) {
            boolean var4 = false;
        } else {
            field765 = -8;
        }
        if (this.field771 < this.field772 && this.field771 / 20 < var2) {
            var2 = this.field771 / 20;
        }
        if (var2 == 9999999 || var2 == 0) {
            return 0;
        }
        for (int var5 = 0; var5 < 10; var5++) {
            if (this.field770[var5] != null) {
                this.field770[var5].field789 -= var2 * 20;
            }
        }
        if (this.field771 < this.field772) {
            this.field771 -= var2 * 20;
            this.field772 -= var2 * 20;
        }
        return var2;
    }

    @OriginalMember(owner = "yb", name = "a", descriptor = "(ZI)Lkb;")
    private final Packet method274(boolean arg0, int arg1) {
        int var3 = this.method275(arg1);
        field769.field622 = 0;
        field769.method210(1380533830);
        field769.method211(false, var3 + 36);
        field769.method210(1463899717);
        field769.method210(1718449184);
        field769.method211(false, 16);
        if (!arg0) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        field769.method208(this.field764, 1);
        field769.method208(this.field764, 1);
        field769.method211(false, 22050);
        field769.method211(false, 22050);
        field769.method208(this.field764, 1);
        field769.method208(this.field764, 8);
        field769.method210(1684108385);
        field769.method211(false, var3);
        field769.field622 += var3;
        return field769;
    }

    @OriginalMember(owner = "yb", name = "a", descriptor = "(I)I")
    private final int method275(int arg0) {
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
                int[] var17 = this.field770[var9].method277(var15, this.field770[var9].field788);
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
