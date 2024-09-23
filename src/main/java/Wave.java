import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("dc")
public class Wave {

    @OriginalMember(owner = "dc", name = "g", descriptor = "[Lec;")
    private Tone[] field918 = new Tone[10];

    @OriginalMember(owner = "dc", name = "a", descriptor = "I")
    private static int field912 = 6771;

    @OriginalMember(owner = "dc", name = "c", descriptor = "[Ldc;")
    private static Wave[] field914 = new Wave[1000];

    @OriginalMember(owner = "dc", name = "d", descriptor = "[I")
    public static int[] field915 = new int[1000];

    @OriginalMember(owner = "dc", name = "h", descriptor = "I")
    private int field919;

    @OriginalMember(owner = "dc", name = "i", descriptor = "I")
    private int field920;

    @OriginalMember(owner = "dc", name = "f", descriptor = "Lmb;")
    private static Packet field917;

    @OriginalMember(owner = "dc", name = "b", descriptor = "Z")
    private static boolean field913;

    @OriginalMember(owner = "dc", name = "e", descriptor = "[B")
    private static byte[] field916;

    @OriginalMember(owner = "dc", name = "<init>", descriptor = "(I)V")
    private Wave(int arg0) {
        while (arg0 >= 0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
    }

    @OriginalMember(owner = "dc", name = "a", descriptor = "(ILmb;)V")
    public static final void method317(int arg0, Packet arg1) {
        field916 = new byte[441000];
        field917 = new Packet(field916, true);
        if (field912 != arg0) {
            field913 = !field913;
        }
        Tone.method323();
        while (true) {
            int var2 = arg1.method230();
            if (var2 == 65535) {
                return;
            }
            field914[var2] = new Wave(-388);
            field914[var2].method319((byte) 44, arg1);
            field915[var2] = field914[var2].method320(false);
        }
    }

    @OriginalMember(owner = "dc", name = "a", descriptor = "(III)Lmb;")
    public static final Packet method318(int arg0, int arg1, int arg2) {
        if (arg1 >= 0) {
            throw new NullPointerException();
        } else if (field914[arg0] == null) {
            return null;
        } else {
            Wave var3 = field914[arg0];
            return var3.method321(arg2, 5);
        }
    }

    @OriginalMember(owner = "dc", name = "a", descriptor = "(BLmb;)V")
    private final void method319(byte arg0, Packet arg1) {
        for (int var3 = 0; var3 < 10; var3++) {
            int var4 = arg1.method228();
            if (var4 != 0) {
                arg1.field714--;
                this.field918[var3] = new Tone();
                this.field918[var3].method326((byte) 44, arg1);
            }
        }
        if (arg0 != 44) {
            throw new NullPointerException();
        }
        this.field919 = arg1.method230();
        this.field920 = arg1.method230();
    }

    @OriginalMember(owner = "dc", name = "a", descriptor = "(Z)I")
    private final int method320(boolean arg0) {
        int var2 = 9999999;
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field918[var3] != null && this.field918[var3].field939 / 20 < var2) {
                var2 = this.field918[var3].field939 / 20;
            }
        }
        if (this.field919 < this.field920 && this.field919 / 20 < var2) {
            var2 = this.field919 / 20;
        }
        if (var2 == 9999999 || var2 == 0) {
            return 0;
        }
        for (int var4 = 0; var4 < 10; var4++) {
            if (this.field918[var4] != null) {
                this.field918[var4].field939 -= var2 * 20;
            }
        }
        if (arg0) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        if (this.field919 < this.field920) {
            this.field919 -= var2 * 20;
            this.field920 -= var2 * 20;
        }
        return var2;
    }

    @OriginalMember(owner = "dc", name = "a", descriptor = "(II)Lmb;")
    private final Packet method321(int arg0, int arg1) {
        int var3 = this.method322(arg0);
        field917.field714 = 0;
        field917.method222(1380533830);
        field917.method223(var3 + 36, (byte) 3);
        field917.method222(1463899717);
        field917.method222(1718449184);
        field917.method223(16, (byte) 3);
        if (arg1 != 5) {
            field913 = !field913;
        }
        field917.method220(-813, 1);
        field917.method220(-813, 1);
        field917.method223(22050, (byte) 3);
        field917.method223(22050, (byte) 3);
        field917.method220(-813, 1);
        field917.method220(-813, 8);
        field917.method222(1684108385);
        field917.method223(var3, (byte) 3);
        field917.field714 += var3;
        return field917;
    }

    @OriginalMember(owner = "dc", name = "a", descriptor = "(I)I")
    private final int method322(int arg0) {
        int var2 = 0;
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field918[var3] != null && this.field918[var3].field939 + this.field918[var3].field938 > var2) {
                var2 = this.field918[var3].field939 + this.field918[var3].field938;
            }
        }
        if (var2 == 0) {
            return 0;
        }
        int var4 = var2 * 22050 / 1000;
        int var5 = this.field919 * 22050 / 1000;
        int var6 = this.field920 * 22050 / 1000;
        if (var5 < 0 || var5 > var4 || var6 < 0 || var6 > var4 || var5 >= var6) {
            arg0 = 0;
        }
        int var7 = (arg0 - 1) * (var6 - var5) + var4;
        for (int var8 = 44; var8 < var7 + 44; var8++) {
            field916[var8] = -128;
        }
        for (int var9 = 0; var9 < 10; var9++) {
            if (this.field918[var9] != null) {
                int var15 = this.field918[var9].field938 * 22050 / 1000;
                int var16 = this.field918[var9].field939 * 22050 / 1000;
                int[] var17 = this.field918[var9].method324(var15, this.field918[var9].field938);
                for (int var18 = 0; var18 < var15; var18++) {
                    field916[var16 + var18 + 44] += (byte) (var17[var18] >> 8);
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
                field916[var10 + var11] = field916[var11];
            }
            for (int var12 = 1; var12 < arg0; var12++) {
                int var13 = (var6 - var5) * var12;
                for (int var14 = var5; var14 < var6; var14++) {
                    field916[var13 + var14] = field916[var14];
                }
            }
            var7 -= 44;
        }
        return var7;
    }
}
