import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("yb")
public class Wave {

    @OriginalMember(owner = "yb", name = "g", descriptor = "[Lzb;")
    private Tone[] field768 = new Tone[10];

    @OriginalMember(owner = "yb", name = "a", descriptor = "Z")
    private static boolean field762 = true;

    @OriginalMember(owner = "yb", name = "c", descriptor = "[Lyb;")
    private static Wave[] field764 = new Wave[1000];

    @OriginalMember(owner = "yb", name = "d", descriptor = "[I")
    public static int[] field765 = new int[1000];

    @OriginalMember(owner = "yb", name = "b", descriptor = "I")
    private int field763;

    @OriginalMember(owner = "yb", name = "h", descriptor = "I")
    private int field769;

    @OriginalMember(owner = "yb", name = "i", descriptor = "I")
    private int field770;

    @OriginalMember(owner = "yb", name = "f", descriptor = "Lkb;")
    private static Packet field767;

    @OriginalMember(owner = "yb", name = "e", descriptor = "[B")
    private static byte[] field766;

    @OriginalMember(owner = "yb", name = "a", descriptor = "(ILkb;)V")
    public static final void method270(int arg0, Packet arg1) {
        field766 = new byte[441000];
        field767 = new Packet((byte) 64, field766);
        Tone.method276();
        if (arg0 != -5880) {
            field762 = !field762;
        }
        while (true) {
            int var2 = arg1.method218();
            if (var2 == 65535) {
                return;
            }
            field764[var2] = new Wave();
            field764[var2].method272(arg1, true);
            field765[var2] = field764[var2].method273(0);
        }
    }

    @OriginalMember(owner = "yb", name = "a", descriptor = "(ZII)Lkb;")
    public static final Packet method271(boolean arg0, int arg1, int arg2) {
        if (arg0) {
            throw new NullPointerException();
        } else if (field764[arg2] == null) {
            return null;
        } else {
            Wave var3 = field764[arg2];
            return var3.method274(arg1, 933);
        }
    }

    @OriginalMember(owner = "yb", name = "a", descriptor = "(Lkb;Z)V")
    private final void method272(Packet arg0, boolean arg1) {
        if (!arg1) {
            throw new NullPointerException();
        }
        for (int var3 = 0; var3 < 10; var3++) {
            int var4 = arg0.method216();
            if (var4 != 0) {
                arg0.field624--;
                this.field768[var3] = new Tone();
                this.field768[var3].method279(arg0, true);
            }
        }
        this.field769 = arg0.method218();
        this.field770 = arg0.method218();
    }

    @OriginalMember(owner = "yb", name = "a", descriptor = "(I)I")
    private final int method273(int arg0) {
        if (arg0 != 0) {
            this.field763 = 302;
        }
        int var2 = 9999999;
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field768[var3] != null && this.field768[var3].field786 / 20 < var2) {
                var2 = this.field768[var3].field786 / 20;
            }
        }
        if (this.field769 < this.field770 && this.field769 / 20 < var2) {
            var2 = this.field769 / 20;
        }
        if (var2 == 9999999 || var2 == 0) {
            return 0;
        }
        for (int var4 = 0; var4 < 10; var4++) {
            if (this.field768[var4] != null) {
                this.field768[var4].field786 -= var2 * 20;
            }
        }
        if (this.field769 < this.field770) {
            this.field769 -= var2 * 20;
            this.field770 -= var2 * 20;
        }
        return var2;
    }

    @OriginalMember(owner = "yb", name = "a", descriptor = "(II)Lkb;")
    private final Packet method274(int arg0, int arg1) {
        int var3 = this.method275(arg0);
        if (arg1 <= 0) {
            this.field763 = -333;
        }
        field767.field624 = 0;
        field767.method210(1380533830);
        field767.method211((byte) 86, var3 + 36);
        field767.method210(1463899717);
        field767.method210(1718449184);
        field767.method211((byte) 86, 16);
        field767.method208(true, 1);
        field767.method208(true, 1);
        field767.method211((byte) 86, 22050);
        field767.method211((byte) 86, 22050);
        field767.method208(true, 1);
        field767.method208(true, 8);
        field767.method210(1684108385);
        field767.method211((byte) 86, var3);
        field767.field624 += var3;
        return field767;
    }

    @OriginalMember(owner = "yb", name = "b", descriptor = "(I)I")
    private final int method275(int arg0) {
        int var2 = 0;
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field768[var3] != null && this.field768[var3].field786 + this.field768[var3].field785 > var2) {
                var2 = this.field768[var3].field786 + this.field768[var3].field785;
            }
        }
        if (var2 == 0) {
            return 0;
        }
        int var4 = var2 * 22050 / 1000;
        int var5 = this.field769 * 22050 / 1000;
        int var6 = this.field770 * 22050 / 1000;
        if (var5 < 0 || var5 > var4 || var6 < 0 || var6 > var4 || var5 >= var6) {
            arg0 = 0;
        }
        int var7 = (arg0 - 1) * (var6 - var5) + var4;
        for (int var8 = 44; var8 < var7 + 44; var8++) {
            field766[var8] = -128;
        }
        for (int var9 = 0; var9 < 10; var9++) {
            if (this.field768[var9] != null) {
                int var15 = this.field768[var9].field785 * 22050 / 1000;
                int var16 = this.field768[var9].field786 * 22050 / 1000;
                int[] var17 = this.field768[var9].method277(var15, this.field768[var9].field785);
                for (int var18 = 0; var18 < var15; var18++) {
                    field766[var16 + var18 + 44] += (byte) (var17[var18] >> 8);
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
                field766[var10 + var11] = field766[var11];
            }
            for (int var12 = 1; var12 < arg0; var12++) {
                int var13 = (var6 - var5) * var12;
                for (int var14 = var5; var14 < var6; var14++) {
                    field766[var13 + var14] = field766[var14];
                }
            }
            var7 -= 44;
        }
        return var7;
    }
}
