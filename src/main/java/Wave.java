import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("cc")
public class Wave {

    @OriginalMember(owner = "cc", name = "a", descriptor = "I")
    private int field909 = -325;

    @OriginalMember(owner = "cc", name = "c", descriptor = "I")
    private int field911 = -47;

    @OriginalMember(owner = "cc", name = "d", descriptor = "Z")
    private boolean field912 = false;

    @OriginalMember(owner = "cc", name = "e", descriptor = "Z")
    private boolean field913 = false;

    @OriginalMember(owner = "cc", name = "j", descriptor = "[Ldc;")
    private Tone[] field918 = new Tone[10];

    @OriginalMember(owner = "cc", name = "b", descriptor = "Z")
    private static boolean field910 = true;

    @OriginalMember(owner = "cc", name = "f", descriptor = "[Lcc;")
    private static Wave[] field914 = new Wave[5000];

    @OriginalMember(owner = "cc", name = "g", descriptor = "[I")
    public static int[] field915 = new int[5000];

    @OriginalMember(owner = "cc", name = "k", descriptor = "I")
    private int field919;

    @OriginalMember(owner = "cc", name = "l", descriptor = "I")
    private int field920;

    @OriginalMember(owner = "cc", name = "i", descriptor = "Llb;")
    private static Packet field917;

    @OriginalMember(owner = "cc", name = "h", descriptor = "[B")
    private static byte[] field916;

    @OriginalMember(owner = "cc", name = "<init>", descriptor = "(Z)V")
    private Wave(boolean arg0) {
        if (!arg0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
    }

    @OriginalMember(owner = "cc", name = "a", descriptor = "(ILlb;)V")
    public static final void method318(int arg0, Packet arg1) {
        field916 = new byte[441000];
        field917 = new Packet(false, field916);
        if (arg0 != 35102) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        Tone.method324();
        while (true) {
            int var3 = arg1.method231();
            if (var3 == 65535) {
                return;
            }
            field914[var3] = new Wave(field910);
            field914[var3].method320(arg1, false);
            field915[var3] = field914[var3].method321(false);
        }
    }

    @OriginalMember(owner = "cc", name = "a", descriptor = "(III)Llb;")
    public static final Packet method319(int arg0, int arg1, int arg2) {
        if (arg1 != 0) {
            throw new NullPointerException();
        } else if (field914[arg0] == null) {
            return null;
        } else {
            Wave var3 = field914[arg0];
            return var3.method322(arg2, (byte) 121);
        }
    }

    @OriginalMember(owner = "cc", name = "a", descriptor = "(Llb;Z)V")
    private final void method320(Packet arg0, boolean arg1) {
        if (arg1) {
            this.field911 = -82;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            int var4 = arg0.method229();
            if (var4 != 0) {
                arg0.field716--;
                this.field918[var3] = new Tone();
                this.field918[var3].method327(arg0, false);
            }
        }
        this.field919 = arg0.method231();
        this.field920 = arg0.method231();
    }

    @OriginalMember(owner = "cc", name = "a", descriptor = "(Z)I")
    private final int method321(boolean arg0) {
        int var2 = 9999999;
        if (arg0) {
            this.field913 = !this.field913;
        }
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field918[var3] != null && this.field918[var3].field938 / 20 < var2) {
                var2 = this.field918[var3].field938 / 20;
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
                this.field918[var4].field938 -= var2 * 20;
            }
        }
        if (this.field919 < this.field920) {
            this.field919 -= var2 * 20;
            this.field920 -= var2 * 20;
        }
        return var2;
    }

    @OriginalMember(owner = "cc", name = "a", descriptor = "(IB)Llb;")
    private final Packet method322(int arg0, byte arg1) {
        int var3 = this.method323(arg0);
        field917.field716 = 0;
        field917.method223(1380533830);
        field917.method224(this.field909, var3 + 36);
        field917.method223(1463899717);
        field917.method223(1718449184);
        field917.method224(this.field909, 16);
        field917.method221(1, true);
        if (arg1 != 121) {
            this.field911 = 67;
        }
        field917.method221(1, true);
        field917.method224(this.field909, 22050);
        field917.method224(this.field909, 22050);
        field917.method221(1, true);
        field917.method221(8, true);
        field917.method223(1684108385);
        field917.method224(this.field909, var3);
        field917.field716 += var3;
        return field917;
    }

    @OriginalMember(owner = "cc", name = "a", descriptor = "(I)I")
    private final int method323(int arg0) {
        int var2 = 0;
        for (int var3 = 0; var3 < 10; var3++) {
            if (this.field918[var3] != null && this.field918[var3].field938 + this.field918[var3].field937 > var2) {
                var2 = this.field918[var3].field938 + this.field918[var3].field937;
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
                int var15 = this.field918[var9].field937 * 22050 / 1000;
                int var16 = this.field918[var9].field938 * 22050 / 1000;
                int[] var17 = this.field918[var9].method325(var15, this.field918[var9].field937);
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
