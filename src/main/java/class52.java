import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ld")
public class class52 extends class197 {

    @OriginalMember(owner = "client!ld", name = "O", descriptor = "Loh;")
    public static class258 field831 = class153.method1046("(U0a )2 via: ", 113);

    @OriginalMember(owner = "client!ld", name = "U", descriptor = "I")
    public static int field837 = 0;

    @OriginalMember(owner = "client!ld", name = "V", descriptor = "Loh;")
    public static class258 field838 = class153.method1046("weiss:", 112);

    @OriginalMember(owner = "client!ld", name = "T", descriptor = "Loh;")
    private static class258 field836 = class153.method1046("Loading interfaces )2 ", 94);

    @OriginalMember(owner = "client!ld", name = "R", descriptor = "Loh;")
    public static class258 field834 = field836;

    @OriginalMember(owner = "client!ld", name = "M", descriptor = "I")
    public static int field829;

    @OriginalMember(owner = "client!ld", name = "N", descriptor = "I")
    public static int field830;

    @OriginalMember(owner = "client!ld", name = "P", descriptor = "I")
    public static int field832;

    @OriginalMember(owner = "client!ld", name = "S", descriptor = "I")
    public static int field835;

    @OriginalMember(owner = "client!ld", name = "X", descriptor = "I")
    public static int field840;

    @OriginalMember(owner = "client!ld", name = "Y", descriptor = "I")
    public static int field841;

    @OriginalMember(owner = "client!ld", name = "W", descriptor = "J")
    public static long field839;

    @OriginalMember(owner = "client!ld", name = "Q", descriptor = "[Lv;")
    private class72[] field833;

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "(I)V", line = 14)
    public static void method416(int arg0) {
        if (arg0 != -23688) {
            method416(-17);
        }
        field836 = null;
        field838 = null;
        field831 = null;
        field834 = null;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(ILva;I)V", line = 33)
    public final void method98(int arg0, class235 arg1, int arg2) {
        if (arg2 == 0) {
            this.field833 = new class72[arg1.method1589(113)];
            for (int var4 = 0; var4 < this.field833.length; var4++) {
                int var5 = arg1.method1589(arg0 ^ 0x1F5D);
                if (var5 == 0) {
                    this.field833[var4] = class271.method1910((byte) -84, arg1);
                } else if (var5 == 1) {
                    this.field833[var4] = class117.method865(arg1, (byte) -24);
                } else if (var5 == 2) {
                    this.field833[var4] = class184.method1245(true, arg1);
                } else if (var5 == 3) {
                    this.field833[var4] = class19.method129(-105, arg1);
                }
            }
        } else if (arg2 == 1) {
            this.field3462 = arg1.method1589(67) == 1;
        }
        field832++;
        if (arg0 != 7955) {
            field836 = (class258) null;
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(IIZII)V", line = 105)
    public static final void method417(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
        field829++;
        if (class92.method685(-1, arg4)) {
            class58.method446(arg2, arg1 - 15036, arg1, class23.field290[arg4], arg0, arg3);
        }
    }

    @OriginalMember(owner = "client!ld", name = "<init>", descriptor = "()V", line = 115)
    public class52() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(I[[I)V", line = 122)
    private final void method418(int arg0, int[][] arg1) {
        if (arg0 <= 65) {
            return;
        }
        int var3 = class190.field3362;
        field835++;
        int var4 = class214.field3723;
        class272.method1920((byte) -3, arg1);
        class228.method1523(class155.field2662, 0, 0, 746471655, class48.field723);
        if (this.field833 == null) {
            return;
        }
        for (int var5 = 0; var5 < this.field833.length; var5++) {
            class72 var6 = this.field833[var5];
            int var7 = var6.field1267;
            int var8 = var6.field1269;
            if (var7 < 0) {
                if (var8 >= 0) {
                    var6.method494(var4, 17898, var3);
                }
            } else if (var8 < 0) {
                var6.method492(var3, var4, (byte) -125);
            } else {
                var6.method495(var4, var3, 512);
            }
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(II)[I", line = 176)
    public final int[] method96(int arg0, int arg1) {
        int[] var3 = this.field3456.method2104(arg1, 0);
        if (this.field3456.field5115) {
            this.method418(78, this.field3456.method2108(false));
        }
        field830++;
        if (arg0 != -16221) {
            this.method96(-46, -28);
        }
        return var3;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(IB)[[I", line = 210)
    public final int[][] method101(int arg0, byte arg1) {
        field840++;
        int[][] var3 = this.field3461.method1936(arg0, 17174);
        int var4 = -16 / ((1 - arg1) / 37);
        if (this.field3461.field4765) {
            int var5 = class190.field3362;
            int var6 = class214.field3723;
            int[][] var7 = new int[var6][var5];
            int[][][] var8 = this.field3461.method1939(false);
            this.method418(100, var7);
            for (int var9 = 0; var9 < class214.field3723; var9++) {
                int[] var10 = var7[var9];
                int[][] var11 = var8[var9];
                int[] var12 = var11[2];
                int[] var13 = var11[0];
                int[] var14 = var11[1];
                for (int var15 = 0; var15 < class190.field3362; var15++) {
                    int var16 = var10[var15];
                    var12[var15] = class2.method15(var16, 255) << 4;
                    var14[var15] = class2.method15(var16 >> 4, 4080);
                    var13[var15] = class2.method15(var16, 16711680) >> 12;
                }
            }
        }
        return var3;
    }
}
