import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rc")
public class class120 extends class512 {

    @OriginalMember(owner = "client!rc", name = "J", descriptor = "Z")
    private boolean field2113 = true;

    @OriginalMember(owner = "client!rc", name = "L", descriptor = "Z")
    private boolean field2115 = true;

    @OriginalMember(owner = "client!rc", name = "M", descriptor = "Lvv;")
    public static class313 field2116 = new class313(25, 8);

    @OriginalMember(owner = "client!rc", name = "N", descriptor = "Llo;")
    public static class306 field2117 = new class306(" has logged out.", " loggt sich aus.", " s'est déconnecté.", " saiu do jogo.");

    @OriginalMember(owner = "client!rc", name = "G", descriptor = "I")
    public static int field2110;

    @OriginalMember(owner = "client!rc", name = "H", descriptor = "I")
    public static int field2111;

    @OriginalMember(owner = "client!rc", name = "I", descriptor = "I")
    public static int field2112;

    @OriginalMember(owner = "client!rc", name = "K", descriptor = "I")
    public static int field2114;

    @OriginalMember(owner = "client!rc", name = "<init>", descriptor = "()V")
    public class120() {
        super(1, false);
    }

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "(II)[[I")
    public final int[][] method278(int arg0, int arg1) {
        int var3 = 73 / ((arg0 - -40) / 47);
        ++field2111;
        int[][] var4 = super.field7496.method2777(arg1, 0);
        if (super.field7496.field6942) {
            int[][] var5 = this.method3012(!this.field2113 ? arg1 : -arg1 + class270.field4492, 94, 0);
            int[] var6 = var5[0];
            int[] var7 = var5[1];
            int[] var8 = var5[2];
            int[] var9 = var4[0];
            int[] var10 = var4[1];
            int[] var11 = var4[2];
            if (!this.field2115) {
                for (int var12 = 0; class402.field6113 > var12; ++var12) {
                    var9[var12] = var6[var12];
                    var10[var12] = var7[var12];
                    var11[var12] = var8[var12];
                }
            } else {
                for (int var13 = 0; ~class402.field6113 < ~var13; ++var13) {
                    var9[var13] = var6[-var13 + class269.field4478];
                    var10[var13] = var7[class269.field4478 - var13];
                    var11[var13] = var8[-var13 + class269.field4478];
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!rc", name = "f", descriptor = "(I)V")
    public static void method948(int arg0) {
        field2116 = null;
        field2117 = null;
        if (arg0 != 8) {
            field2116 = null;
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(IIIIIII)V")
    public static final void method949(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field2114;
        if (arg3 == 2) {
            int var7 = class52.method367(arg5, class472.field6996, (byte) -58, class29.field460);
            int var8 = class52.method367(arg6, class472.field6996, (byte) -117, class29.field460);
            int var9 = class52.method367(arg2, class235.field4076, (byte) 116, class182.field2877);
            int var10 = class52.method367(arg0, class235.field4076, (byte) -92, class182.field2877);
            int var11 = class52.method367(arg1 + arg5, class472.field6996, (byte) -108, class29.field460);
            int var12 = class52.method367(arg6 - arg1, class472.field6996, (byte) 123, class29.field460);
            for (int var13 = var7; var13 < var11; ++var13) {
                class357.method2291(var9, arg4, class209.field3294[var13], var10, -1);
            }
            for (int var14 = var8; var12 < var14; --var14) {
                class357.method2291(var9, arg4, class209.field3294[var14], var10, -1);
            }
            int var15 = class52.method367(arg1 + arg2, class235.field4076, (byte) -88, class182.field2877);
            int var16 = class52.method367(-arg1 + arg0, class235.field4076, (byte) -40, class182.field2877);
            for (int var17 = var11; var17 <= var12; ++var17) {
                int[] var18 = class209.field3294[var17];
                class357.method2291(var9, arg4, var18, var15, -1);
                class357.method2291(var16, arg4, var18, var10, -1);
            }
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(ZILia;)V")
    public final void method71(boolean arg0, int arg1, class23 arg2) {
        ++field2110;
        if (arg0) {
            if (arg1 != 0) {
                if (arg1 != 1) {
                    if (~arg1 == -3) {
                        super.field7491 = arg2.method126((byte) -116) == 1;
                    }
                } else {
                    this.field2113 = arg2.method126((byte) -112) == 1;
                }
            } else {
                this.field2115 = arg2.method126((byte) -110) == 1;
            }
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(IB)[I")
    public final int[] method75(int arg0, byte arg1) {
        ++field2112;
        int var3 = 10 / ((arg1 - 43) / 48);
        int[] var4 = super.field7494.method232(arg0, true);
        if (super.field7494.field474) {
            int[] var5 = this.method3013(false, 0, !this.field2113 ? arg0 : -arg0 + class270.field4492);
            if (this.field2115) {
                for (int var6 = 0; ~var6 > ~class402.field6113; ++var6) {
                    var4[var6] = var5[-var6 + class269.field4478];
                }
            } else {
                class85.method612(var5, 0, var4, 0, class402.field6113);
            }
        }
        return var4;
    }
}
