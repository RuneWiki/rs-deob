import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("cc")
public class Wave {

    @OriginalMember(owner = "cc", name = "d", descriptor = "I")
    private int field913 = 47044;

    @OriginalMember(owner = "cc", name = "i", descriptor = "[Ldc;")
    private Tone[] field918 = new Tone[10];

    @OriginalMember(owner = "cc", name = "b", descriptor = "Z")
    private static boolean field911 = true;

    @OriginalMember(owner = "cc", name = "c", descriptor = "I")
    private static int field912 = 8;

    @OriginalMember(owner = "cc", name = "e", descriptor = "[Lcc;")
    private static Wave[] field914 = new Wave[5000];

    @OriginalMember(owner = "cc", name = "f", descriptor = "[I")
    public static int[] field915 = new int[5000];

    @OriginalMember(owner = "cc", name = "j", descriptor = "I")
    private int field919;

    @OriginalMember(owner = "cc", name = "k", descriptor = "I")
    private int field920;

    @OriginalMember(owner = "cc", name = "h", descriptor = "Llb;")
    private static Packet field917;

    @OriginalMember(owner = "cc", name = "a", descriptor = "Z")
    private static boolean field910;

    @OriginalMember(owner = "cc", name = "g", descriptor = "[B")
    private static byte[] field916;

    @OriginalMember(owner = "cc", name = "<init>", descriptor = "(Z)V")
    private Wave(boolean arg0) {
        if (!arg0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
    }

    @OriginalMember(owner = "cc", name = "a", descriptor = "(Llb;I)V")
    public static final void method318(Packet arg0, int arg1) {
        field916 = new byte[441000];
        field917 = new Packet(field916, field910);
        Tone.method324();
        if (arg1 != 5) {
            return;
        }
        while (true) {
            int var2 = arg0.method231();
            if (var2 == 65535) {
                return;
            }
            field914[var2] = new Wave(true);
            field914[var2].method320(false, arg0);
            field915[var2] = field914[var2].method321(true);
        }
    }

    @OriginalMember(owner = "cc", name = "a", descriptor = "(III)Llb;")
    public static final Packet method319(int arg0, int arg1, int arg2) {
        if (field912 != arg2) {
            field911 = !field911;
        }
        if (field914[arg1] == null) {
            return null;
        } else {
            Wave var3 = field914[arg1];
            return var3.method322(arg0, true);
        }
    }

    @OriginalMember(owner = "cc", name = "a", descriptor = "(ZLlb;)V")
    private final void method320(boolean arg0, Packet arg1) {
        for (int var3 = 0; var3 < 10; var3++) {
            int var4 = arg1.method229();
            if (var4 != 0) {
                arg1.field712--;
                this.field918[var3] = new Tone();
                this.field918[var3].method327(false, arg1);
            }
        }
        this.field919 = arg1.method231();
        if (arg0) {
            throw new NullPointerException();
        }
        this.field920 = arg1.method231();
    }

    @OriginalMember(owner = "cc", name = "a", descriptor = "(Z)I")
    private final int method321(boolean arg0) {
        int var2 = 9999999;
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field918[var3] != null && this.field918[var3].field939 / 20 < var2) {
                var2 = this.field918[var3].field939 / 20;
            }
        }
        if (!arg0) {
            return 3;
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
        if (this.field919 < this.field920) {
            this.field919 -= var2 * 20;
            this.field920 -= var2 * 20;
        }
        return var2;
    }

    @OriginalMember(owner = "cc", name = "a", descriptor = "(IZ)Llb;")
    private final Packet method322(int arg0, boolean arg1) {
        int var3 = this.method323(arg0);
        field917.field712 = 0;
        field917.method223(1380533830);
        field917.method224(var3 + 36, false);
        field917.method223(1463899717);
        field917.method223(1718449184);
        field917.method224(16, false);
        field917.method221(1, 0);
        field917.method221(1, 0);
        if (!arg1) {
            throw new NullPointerException();
        }
        field917.method224(22050, false);
        field917.method224(22050, false);
        field917.method221(1, 0);
        field917.method221(8, 0);
        field917.method223(1684108385);
        field917.method224(var3, false);
        field917.field712 += var3;
        return field917;
    }

    @OriginalMember(owner = "cc", name = "a", descriptor = "(I)I")
    private final int method323(int arg0) {
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
                int[] var17 = this.field918[var9].method325(var15, this.field918[var9].field938);
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
