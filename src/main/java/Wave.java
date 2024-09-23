import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("yb")
public class Wave {

    @OriginalMember(owner = "yb", name = "h", descriptor = "[Lzb;")
    private Tone[] field771 = new Tone[10];

    @OriginalMember(owner = "yb", name = "b", descriptor = "I")
    private static int field765 = 3;

    @OriginalMember(owner = "yb", name = "c", descriptor = "I")
    private static int field766 = 754;

    @OriginalMember(owner = "yb", name = "d", descriptor = "[Lyb;")
    private static Wave[] field767 = new Wave[1000];

    @OriginalMember(owner = "yb", name = "e", descriptor = "[I")
    public static int[] field768 = new int[1000];

    @OriginalMember(owner = "yb", name = "i", descriptor = "I")
    private int field772;

    @OriginalMember(owner = "yb", name = "j", descriptor = "I")
    private int field773;

    @OriginalMember(owner = "yb", name = "g", descriptor = "Lkb;")
    private static Packet field770;

    @OriginalMember(owner = "yb", name = "a", descriptor = "Z")
    private static boolean field764;

    @OriginalMember(owner = "yb", name = "f", descriptor = "[B")
    private static byte[] field769;

    @OriginalMember(owner = "yb", name = "a", descriptor = "(Lkb;I)V")
    public static final void method263(Packet arg0, int arg1) {
        field769 = new byte[441000];
        field770 = new Packet(0, field769);
        Tone.method269();
        if (arg1 < field765 || arg1 > field765) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        while (true) {
            int var3 = arg0.method211();
            if (var3 == 65535) {
                return;
            }
            field767[var3] = new Wave();
            field767[var3].method265(arg0, 0);
            field768[var3] = field767[var3].method266((byte) 3);
        }
    }

    @OriginalMember(owner = "yb", name = "a", descriptor = "(III)Lkb;")
    public static final Packet method264(int arg0, int arg1, int arg2) {
        if (arg2 <= 0) {
            field764 = !field764;
        }
        if (field767[arg0] == null) {
            return null;
        } else {
            Wave var3 = field767[arg0];
            return var3.method267(-32269, arg1);
        }
    }

    @OriginalMember(owner = "yb", name = "b", descriptor = "(Lkb;I)V")
    private final void method265(Packet arg0, int arg1) {
        for (int var3 = 0; var3 < 10; var3++) {
            int var5 = arg0.method209();
            if (var5 != 0) {
                arg0.field621--;
                this.field771[var3] = new Tone();
                this.field771[var3].method272(arg0, 0);
            }
        }
        this.field772 = arg0.method211();
        if (arg1 != 0) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        this.field773 = arg0.method211();
    }

    @OriginalMember(owner = "yb", name = "a", descriptor = "(B)I")
    private final int method266(byte arg0) {
        int var2 = 9999999;
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field771[var3] != null && this.field771[var3].field790 / 20 < var2) {
                var2 = this.field771[var3].field790 / 20;
            }
        }
        if (this.field772 < this.field773 && this.field772 / 20 < var2) {
            var2 = this.field772 / 20;
        }
        if (var2 == 9999999 || var2 == 0) {
            return 0;
        }
        for (int var4 = 0; var4 < 10; var4++) {
            if (this.field771[var4] != null) {
                this.field771[var4].field790 -= var2 * 20;
            }
        }
        if (arg0 != 3) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        if (this.field772 < this.field773) {
            this.field772 -= var2 * 20;
            this.field773 -= var2 * 20;
        }
        return var2;
    }

    @OriginalMember(owner = "yb", name = "a", descriptor = "(II)Lkb;")
    private final Packet method267(int arg0, int arg1) {
        int var3 = this.method268(arg1);
        field770.field621 = 0;
        field770.method203(1380533830);
        field770.method204((byte) 114, var3 + 36);
        field770.method203(1463899717);
        field770.method203(1718449184);
        field770.method204((byte) 114, 16);
        field770.method201((byte) 29, 1);
        field770.method201((byte) 29, 1);
        field770.method204((byte) 114, 22050);
        field770.method204((byte) 114, 22050);
        field770.method201((byte) 29, 1);
        field770.method201((byte) 29, 8);
        if (arg0 != -32269) {
            throw new NullPointerException();
        }
        field770.method203(1684108385);
        field770.method204((byte) 114, var3);
        field770.field621 += var3;
        return field770;
    }

    @OriginalMember(owner = "yb", name = "a", descriptor = "(I)I")
    private final int method268(int arg0) {
        int var2 = 0;
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field771[var3] != null && this.field771[var3].field790 + this.field771[var3].field789 > var2) {
                var2 = this.field771[var3].field790 + this.field771[var3].field789;
            }
        }
        if (var2 == 0) {
            return 0;
        }
        int var4 = var2 * 22050 / 1000;
        int var5 = this.field772 * 22050 / 1000;
        int var6 = this.field773 * 22050 / 1000;
        if (var5 < 0 || var5 > var4 || var6 < 0 || var6 > var4 || var5 >= var6) {
            arg0 = 0;
        }
        int var7 = (arg0 - 1) * (var6 - var5) + var4;
        for (int var8 = 44; var8 < var7 + 44; var8++) {
            field769[var8] = -128;
        }
        for (int var9 = 0; var9 < 10; var9++) {
            if (this.field771[var9] != null) {
                int var15 = this.field771[var9].field789 * 22050 / 1000;
                int var16 = this.field771[var9].field790 * 22050 / 1000;
                int[] var17 = this.field771[var9].method270(var15, this.field771[var9].field789);
                for (int var18 = 0; var18 < var15; var18++) {
                    field769[var16 + var18 + 44] += (byte) (var17[var18] >> 8);
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
                field769[var10 + var11] = field769[var11];
            }
            for (int var12 = 1; var12 < arg0; var12++) {
                int var13 = (var6 - var5) * var12;
                for (int var14 = var5; var14 < var6; var14++) {
                    field769[var13 + var14] = field769[var14];
                }
            }
            var7 -= 44;
        }
        return var7;
    }
}
