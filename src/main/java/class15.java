import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oh")
public class class15 extends class23 {

    @OriginalMember(owner = "client!oh", name = "gb", descriptor = "I")
    private int field250;

    @OriginalMember(owner = "client!oh", name = "Y", descriptor = "[Lqd;")
    public static class40[] field242 = new class40[200];

    @OriginalMember(owner = "client!oh", name = "ab", descriptor = "I")
    public static int field244 = 0;

    @OriginalMember(owner = "client!oh", name = "Z", descriptor = "Lqd;")
    public static class40 field243 = class147.method1106(")2", (byte) -54);

    @OriginalMember(owner = "client!oh", name = "jb", descriptor = "S")
    public static short field253 = 256;

    @OriginalMember(owner = "client!oh", name = "bb", descriptor = "I")
    public static int field245;

    @OriginalMember(owner = "client!oh", name = "cb", descriptor = "I")
    public static int field246;

    @OriginalMember(owner = "client!oh", name = "db", descriptor = "I")
    public static int field247;

    @OriginalMember(owner = "client!oh", name = "eb", descriptor = "I")
    public static int field248;

    @OriginalMember(owner = "client!oh", name = "fb", descriptor = "I")
    public static int field249;

    @OriginalMember(owner = "client!oh", name = "ib", descriptor = "I")
    public static int field252;

    @OriginalMember(owner = "client!oh", name = "hb", descriptor = "[Lda;")
    public static class114[] field251;

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(Lce;III)Lmb;", line = 6)
    public static final class99 method86(class239 arg0, int arg1, int arg2, int arg3) {
        field249++;
        int var4 = 48 / ((arg3 + 30) / 56);
        return class272.method1881(arg0, arg2, arg1, 929) ? class109.method825(0) : null;
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(ILce;)V", line = 21)
    public static final void method87(int arg0, class239 arg1) {
        class22.field388 = class43.method391(-125, arg1, class228.field3773);
        class150.field2522 = new int[256];
        int var2 = 0;
        if (arg0 != -26836) {
            method89(42);
        }
        while (var2 < 3) {
            float var3 = (float) ((class264.field4420[var2] & 0xFF0000) >> 16);
            float var4 = (float) (class264.field4420[var2] >> 8 & 0xFF);
            int var5 = class264.field4420[var2 + 1] >> 16 & 0xFF;
            int var6 = class264.field4420[var2 + 1] >> 8 & 0xFF;
            float var7 = ((float) var5 - var3) / 64.0F;
            float var8 = ((float) var6 - var4) / 64.0F;
            int var9 = class264.field4420[var2 + 1] & 0xFF;
            float var10 = (float) (class264.field4420[var2] & 0xFF);
            float var11 = ((float) var9 - var10) / 64.0F;
            for (int var12 = 0; var12 < 64; var12++) {
                class150.field2522[var2 * 64 + var12] = class11.method71((int) var10, class11.method71((int) var3 << 16, (int) var4 << 8));
                var10 += var11;
                var4 += var8;
                var3 += var7;
            }
            var2++;
        }
        for (int var13 = 192; var13 < 255; var13++) {
            class150.field2522[var13] = class264.field4420[3];
        }
        class298.field4982 = new int[32768];
        field246++;
        class290.field4854 = new int[32768];
        class104.method778((class114) null, (byte) 86);
        class174.field2828 = new int[32768];
        class286.field4819 = new int[32768];
        if (class21.field350) {
            class243.field4011 = new class141(128, 254);
        } else {
            class243.field4011 = new class99(128, 254);
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(IZ)I", line = 90)
    public static final int method88(int arg0, boolean arg1) {
        double var2 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
        field252++;
        double var4 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
        double var6 = (double) (arg0 & 0xFF) / 256.0D;
        if (arg1) {
            method90(110);
        }
        double var8 = var2;
        double var10 = var2;
        if (var4 > var2) {
            var10 = var4;
        }
        double var12 = 0.0D;
        if (var2 > var4) {
            var8 = var4;
        }
        if (var6 > var10) {
            var10 = var6;
        }
        if (var8 > var6) {
            var8 = var6;
        }
        double var14 = 0.0D;
        double var16 = (var8 + var10) / 2.0D;
        if (var8 != var10) {
            if (var2 == var10) {
                var12 = (var4 - var6) / (var10 - var8);
            } else if (var4 == var10) {
                var12 = (var6 - var2) / (var10 - var8) + 2.0D;
            } else if (var6 == var10) {
                var12 = (var2 - var4) / (var10 - var8) + 4.0D;
            }
            if (var16 < 0.5D) {
                var14 = (var10 - var8) / (var8 + var10);
            }
            if (var16 >= 0.5D) {
                var14 = (var10 - var8) / (2.0D - var10 - var8);
            }
        }
        int var18 = (int) (var14 * 256.0D);
        if (var18 < 0) {
            var18 = 0;
        } else if (var18 > 255) {
            var18 = 255;
        }
        int var19 = (int) (var16 * 256.0D);
        double var20 = var12 / 6.0D;
        int var22 = (int) (var20 * 256.0D);
        if (var19 < 0) {
            var19 = 0;
        } else if (var19 > 255) {
            var19 = 255;
        }
        if (var19 > 243) {
            var18 >>= 0x4;
        } else if (var19 > 217) {
            var18 >>= 0x3;
        } else if (var19 > 192) {
            var18 >>= 0x2;
        } else if (var19 > 179) {
            var18 >>= 0x1;
        }
        return (var18 >> 5 << 7) + (var22 >> 2 << 10) + (var19 >> 1);
    }

    @OriginalMember(owner = "client!oh", name = "g", descriptor = "(I)V", line = 190)
    public static final void method89(int arg0) {
        if (arg0 != 4096) {
            field244 = 13;
        }
        field245++;
        class177.field2906.method1399((byte) -4);
        class222.field3683.method56((byte) 93);
        class218.field3634.method56((byte) 95);
    }

    @OriginalMember(owner = "client!oh", name = "<init>", descriptor = "()V", line = 204)
    public class15() {
        this(4096);
    }

    @OriginalMember(owner = "client!oh", name = "<init>", descriptor = "(I)V", line = 207)
    private class15(int arg0) {
        super(0, true);
        this.field250 = 4096;
        this.field250 = arg0;
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(IILsd;)V", line = 225)
    public final void method23(int arg0, int arg1, class26 arg2) {
        field248++;
        if (arg1 != 0) {
            this.field250 = -62;
        }
        if (arg0 == 0) {
            this.field250 = (arg2.method226(255) << 12) / 255;
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(BI)[I", line = 251)
    public final int[] method32(byte arg0, int arg1) {
        field247++;
        int[] var3 = this.field403.method724((byte) -109, arg1);
        if (arg0 == -94) {
            if (this.field403.field1760) {
                class234.method1625(var3, 0, class52.field1007, this.field250);
            }
            return var3;
        } else {
            return (int[]) null;
        }
    }

    @OriginalMember(owner = "client!oh", name = "h", descriptor = "(I)V", line = 275)
    public static void method90(int arg0) {
        field243 = null;
        if (arg0 != 1307538946) {
            method88(-58, true);
        }
        field251 = null;
        field242 = null;
    }
}
