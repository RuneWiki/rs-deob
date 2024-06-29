import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nc")
public class class23 extends class694 {

    @OriginalMember(owner = "client!nc", name = "H", descriptor = "Luc;")
    public static class27 field312 = new class27(26, 5);

    @OriginalMember(owner = "client!nc", name = "L", descriptor = "Lcc;")
    public static class670 field315 = new class670("WTQA", 2);

    @OriginalMember(owner = "client!nc", name = "N", descriptor = "I")
    public static int field317 = 0;

    @OriginalMember(owner = "client!nc", name = "M", descriptor = "Luc;")
    public static class27 field316 = new class27(49, 0);

    @OriginalMember(owner = "client!nc", name = "O", descriptor = "Lfc;")
    public static class235 field318 = new class235(45, -2);

    @OriginalMember(owner = "client!nc", name = "P", descriptor = "I")
    public static int field319 = 328;

    @OriginalMember(owner = "client!nc", name = "Q", descriptor = "Lbf;")
    public static class492 field320 = new class492();

    @OriginalMember(owner = "client!nc", name = "F", descriptor = "I")
    public static int field310;

    @OriginalMember(owner = "client!nc", name = "G", descriptor = "I")
    public static int field311;

    @OriginalMember(owner = "client!nc", name = "I", descriptor = "I")
    public static int field313;

    @OriginalMember(owner = "client!nc", name = "J", descriptor = "I")
    public static int field314;

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(II)[I")
    public final int[] method39(int arg0, int arg1) {
        ++field314;
        int[] var3 = super.field9751.method2712(arg1, (byte) 118);
        if (super.field9751.field6674) {
            int[] var4 = this.method3809(0, arg1, (byte) 35);
            for (int var5 = 0; ~var5 > ~class465.field6544; ++var5) {
                var3[var5] = -var4[var5] + 4096;
            }
        }
        if (arg0 <= 112) {
            method114(-69);
        }
        return var3;
    }

    @OriginalMember(owner = "client!nc", name = "<init>", descriptor = "()V")
    public class23() {
        super(1, false);
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(ILpj;Lpj;Lso;Lpj;)Z")
    public static final boolean method113(int arg0, class132 arg1, class132 arg2, class432 arg3, class132 arg4) {
        class230.field3284 = arg3;
        class433.field6134 = arg4;
        ++field313;
        if (arg0 < 108) {
            method114(38);
        }
        class210.field3100 = arg2;
        class42.field617 = arg1;
        return true;
    }

    @OriginalMember(owner = "client!nc", name = "i", descriptor = "(I)V")
    public static void method114(int arg0) {
        field312 = null;
        field320 = null;
        field315 = null;
        field318 = null;
        field316 = null;
        if (arg0 > -123) {
            field320 = null;
        }
    }

    @OriginalMember(owner = "client!nc", name = "c", descriptor = "(II)[[I")
    public final int[][] method15(int arg0, int arg1) {
        ++field311;
        int[][] var3 = super.field9740.method3483(arg1, true);
        if (arg0 != -22151) {
            field312 = null;
        }
        if (super.field9740.field8738) {
            int[][] var4 = this.method3812(arg1, 0, -14032);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; ~class465.field6544 < ~var11; ++var11) {
                var8[var11] = -var5[var11] + 4096;
                var9[var11] = 4096 - var6[var11];
                var10[var11] = -var7[var11] + 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(ILjr;B)V")
    public final void method19(int arg0, class96 arg1, byte arg2) {
        if (arg0 == 0) {
            super.field9744 = arg1.method718(84) == 1;
        }
        int var4 = -44 / ((arg2 - 58) / 63);
        ++field310;
    }
}
