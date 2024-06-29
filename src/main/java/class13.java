import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bb")
public class class13 extends class52 {

    @OriginalMember(owner = "client!bb", name = "W", descriptor = "I")
    private int field246;

    @OriginalMember(owner = "client!bb", name = "O", descriptor = "I")
    private int field238;

    @OriginalMember(owner = "client!bb", name = "V", descriptor = "I")
    private int field245;

    @OriginalMember(owner = "client!bb", name = "X", descriptor = "I")
    private int field247;

    @OriginalMember(owner = "client!bb", name = "U", descriptor = "I")
    private int field244;

    @OriginalMember(owner = "client!bb", name = "Y", descriptor = "I")
    private int field248;

    @OriginalMember(owner = "client!bb", name = "T", descriptor = "Lub;")
    private class188 field243;

    @OriginalMember(owner = "client!bb", name = "ab", descriptor = "I")
    private int field250;

    @OriginalMember(owner = "client!bb", name = "P", descriptor = "I")
    private int field239;

    @OriginalMember(owner = "client!bb", name = "N", descriptor = "Ltg;")
    public static class184 field237 = class135.method812("Ihre Ignorieren)2Liste ist voll)1 Sie k-Onnen nur 100 Spieler darauf eintragen)3", 3);

    @OriginalMember(owner = "client!bb", name = "S", descriptor = "I")
    public static int field242 = 0;

    @OriginalMember(owner = "client!bb", name = "Q", descriptor = "I")
    public static int field240;

    @OriginalMember(owner = "client!bb", name = "Z", descriptor = "I")
    public static int field249;

    @OriginalMember(owner = "client!bb", name = "R", descriptor = "Lb;")
    public static class11 field241;

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "(Z)V")
    public static void method84(boolean arg0) {
        field237 = null;
        if (arg0) {
            field241 = null;
        }
    }

    @OriginalMember(owner = "client!bb", name = "c", descriptor = "(III)Lre;")
    public static final class164 method85(int arg0, int arg1, int arg2) {
        class90 var3 = class190.field3704[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        }
        for (int var4 = 0; var4 < var3.field1680; var4++) {
            class164 var5 = var3.field1686[var4];
            if ((var5.field2934 >> 29 & 0x3L) == 2L && var5.field2954 == arg1 && var5.field2945 == arg2) {
                return var5;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!bb", name = "d", descriptor = "(B)V")
    public static final void method86(byte arg0) {
        field240++;
        if (!class209.field4013) {
            return;
        }
        class167 var1 = class189.method1199(class173.field3279, true, class79.field1434);
        if (var1 != null && var1.field3094 != null) {
            class5 var2 = new class5();
            var2.field101 = var1;
            var2.field96 = var1.field3094;
            class54.method293(var2, -116);
        }
        if (arg0 != -27) {
            method85(18, 26, 115);
        }
        class209.field4013 = false;
        class57.method305(-116, var1);
    }

    @OriginalMember(owner = "client!bb", name = "c", descriptor = "(I)Loh;")
    public final class140 method15(int arg0) {
        if (this.field243 != null) {
            int var2 = class161.field2903 - this.field250;
            if (var2 > 100 && this.field243.field3627 > 0) {
                var2 = 100;
            }
            label51: {
                do {
                    do {
                        if (var2 <= this.field243.field3638[this.field239]) {
                            break label51;
                        }
                        var2 -= this.field243.field3638[this.field239];
                        this.field239++;
                    } while (this.field239 < this.field243.field3645.length);
                    this.field239 -= this.field243.field3627;
                } while (this.field239 >= 0 && this.field239 < this.field243.field3645.length);
                this.field243 = null;
            }
            this.field250 = class161.field2903 - var2;
        }
        field249++;
        class58 var3 = class14.method88(arg0 ^ 0xFFFFFF97, this.field244);
        if (var3.field1083 != null) {
            var3 = var3.method316(-1);
        }
        if (var3 == null) {
            return null;
        }
        int var4;
        int var5;
        if (this.field245 == 1 || this.field245 == 3) {
            var5 = var3.field1027;
            var4 = var3.field1084;
        } else {
            var4 = var3.field1027;
            var5 = var3.field1084;
        }
        int var6 = (var4 >> 1) + this.field246;
        if (arg0 != 7) {
            this.field244 = 60;
        }
        int var7 = (var4 + 1 >> 1) + this.field246;
        int var8 = this.field248 + (var5 + 1 >> 1);
        int var9 = this.field248 + (var5 >> 1);
        int[][] var10 = class179.field3418[this.field238];
        int var11 = var10[var6][var8] + var10[var7][var8] + var10[var7][var9] + var10[var6][var9] >> 2;
        int var12 = (this.field246 << 7) + (var4 << 6);
        int var13 = (this.field248 << 7) + (var5 << 6);
        return var3.method317((byte) 104, this.field239, this.field243, var12, this.field247, var11, this.field245, var13, var10);
    }

    @OriginalMember(owner = "client!bb", name = "<init>", descriptor = "(IIIIIIIZLfb;)V")
    public class13(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class52 arg8) {
        this.field246 = arg4;
        this.field238 = arg3;
        this.field245 = arg2;
        this.field247 = arg1;
        this.field244 = arg0;
        this.field248 = arg5;
        if (arg6 != -1) {
            this.field243 = class83.method465(arg6, -1);
            this.field250 = class161.field2903 - 1;
            this.field239 = 0;
            if (this.field243.field3640 == 0 && arg8 != null && arg8 instanceof class13) {
                class13 var10 = (class13) arg8;
                if (this.field243 == var10.field243) {
                    this.field239 = var10.field239;
                    this.field250 = var10.field250;
                    return;
                }
            }
            if (arg7 && this.field243.field3627 != -1) {
                this.field239 = (int) (Math.random() * (double) this.field243.field3645.length);
                this.field250 -= (int) ((double) this.field243.field3638[this.field239] * Math.random());
                return;
            }
        }
    }
}
