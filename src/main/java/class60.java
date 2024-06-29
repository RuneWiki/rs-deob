import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nn")
public class class60 extends class619 {

    @OriginalMember(owner = "client!nn", name = "e", descriptor = "[I")
    public int[] field815;

    @OriginalMember(owner = "client!nn", name = "g", descriptor = "[I")
    public int[] field817;

    @OriginalMember(owner = "client!nn", name = "f", descriptor = "I")
    public static int field816 = 0;

    @OriginalMember(owner = "client!nn", name = "k", descriptor = "Luaa;")
    public static class405 field821 = new class405("WIP", 2);

    @OriginalMember(owner = "client!nn", name = "m", descriptor = "Z")
    public static boolean field823 = false;

    @OriginalMember(owner = "client!nn", name = "h", descriptor = "I")
    public static int field818;

    @OriginalMember(owner = "client!nn", name = "i", descriptor = "I")
    public static int field819;

    @OriginalMember(owner = "client!nn", name = "j", descriptor = "I")
    public static int field820;

    @OriginalMember(owner = "client!nn", name = "l", descriptor = "I")
    public static int field822;

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(Lxa;ILfa;ILtc;III)V", line = 3)
    public static final void method508(class511 arg0, int arg1, class619 arg2, int arg3, class477 arg4, int arg5, int arg6, int arg7) {
        field822++;
        if (arg0 == null) {
            return;
        }
        int var8;
        if (class704.field9810 == 4) {
            var8 = (int) class141.field1859 & 0x3FFF;
        } else {
            var8 = (int) class141.field1859 + class7.field56 & 0x3FFF;
        }
        int var9 = Math.max(arg4.field6372 / 2, arg4.field6224 / 2) + 10;
        int var10 = arg3 * arg3 + arg5 * arg5;
        if (var10 > var9 * var9) {
            return;
        }
        int var11 = class237.field3193[var8];
        int var12 = class237.field3196[var8];
        if (class704.field9810 != 4) {
            var11 = var11 * 256 / (class279.field3653 + 256);
            var12 = var12 * 256 / (class279.field3653 + 256);
        }
        int var13 = arg3 * var11 + arg5 * var12 >> 14;
        if (arg7 != -3468) {
            field823 = false;
        }
        int var14 = arg3 * var12 - (arg5 * var11) >> 14;
        arg0.method594(arg4.field6372 / 2 + var13 + (arg6 - arg0.method602() / 2), arg4.field6224 / 2 + arg1 + -var14 - arg0.method595() / 2, arg2, arg6, arg1);
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(Lpe;I)V", line = 50)
    public static final void method509(class615 arg0, int arg1) {
        field818++;
        class483.field6442 = arg0.method3359("p11_full", (byte) -122);
        class531.field6904 = arg0.method3359("p12_full", (byte) -112);
        class628.field8776 = arg0.method3359("b12_full", (byte) -111);
        if (arg1 != -7104) {
            method508(null, 64, null, -31, null, -55, 22, -70);
        }
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(IZI)V", line = 63)
    public static final void method510(int arg0, boolean arg1, int arg2) {
        field819++;
        class263 var3 = class265.method1643(false, arg1, arg0);
        if (var3 == null) {
            return;
        }
        if (arg2 != 13063) {
            method508(null, 14, null, 14, null, 47, 104, -98);
        }
        for (int var4 = 0; var4 < var3.field3523.length; var4++) {
            var3.field3523[var4] = -1;
            var3.field3525[var4] = 0;
        }
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(IIIIIII)I", line = 90)
    public static final int method511(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = arg6 & 0x3;
        field820++;
        if ((arg4 & 0x1) == 1) {
            int var8 = arg3;
            arg3 = arg0;
            arg0 = var8;
        }
        if (arg2 == var7) {
            return arg5;
        } else if (var7 == 1) {
            return 7 + 1 - arg1 - arg3;
        } else if (var7 == 2) {
            return 1 + 7 - arg0 - arg5;
        } else {
            return arg1;
        }
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(B)V", line = 118)
    public static void method512(byte arg0) {
        if (arg0 <= 82) {
            field816 = 30;
        }
        field821 = null;
    }

    @OriginalMember(owner = "client!nn", name = "<init>", descriptor = "(II[I[I)V", line = 132)
    public class60(int arg0, int arg1, int[] arg2, int[] arg3) {
        this.field815 = arg2;
        this.field817 = arg3;
    }
}
