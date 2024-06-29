import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ih")
public class class28 extends class288 {

    @OriginalMember(owner = "client!ih", name = "J", descriptor = "[C")
    public static char[] field332 = new char[128];

    @OriginalMember(owner = "client!ih", name = "D", descriptor = "Lgg;")
    public static class61 field326 = new class61(512);

    @OriginalMember(owner = "client!ih", name = "M", descriptor = "[I")
    public static int[] field335 = new int[2048];

    @OriginalMember(owner = "client!ih", name = "P", descriptor = "[Ljava/lang/String;")
    public static String[] field338 = new String[200];

    @OriginalMember(owner = "client!ih", name = "Q", descriptor = "Z")
    public static boolean field339 = true;

    @OriginalMember(owner = "client!ih", name = "C", descriptor = "I")
    public static int field325;

    @OriginalMember(owner = "client!ih", name = "E", descriptor = "I")
    public static int field327;

    @OriginalMember(owner = "client!ih", name = "F", descriptor = "I")
    public static int field328;

    @OriginalMember(owner = "client!ih", name = "G", descriptor = "I")
    public static int field329;

    @OriginalMember(owner = "client!ih", name = "H", descriptor = "I")
    public static int field330;

    @OriginalMember(owner = "client!ih", name = "I", descriptor = "I")
    public static int field331;

    @OriginalMember(owner = "client!ih", name = "K", descriptor = "I")
    public static int field333;

    @OriginalMember(owner = "client!ih", name = "L", descriptor = "I")
    public static int field334;

    @OriginalMember(owner = "client!ih", name = "N", descriptor = "I")
    public static int field336;

    @OriginalMember(owner = "client!ih", name = "R", descriptor = "I")
    public static int field340;

    @OriginalMember(owner = "client!ih", name = "S", descriptor = "I")
    public static int field341;

    @OriginalMember(owner = "client!ih", name = "O", descriptor = "Ljj;")
    public static class134 field337;

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(Lvj;IIII)V")
    public static final void method186(class94 arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field331;
        if (arg1 != -8177) {
            method186((class94) null, 70, 51, 103, -128);
        }
        for (class54 var5 = (class54) class76.field1041.method365(3); var5 != null; var5 = (class54) class76.field1041.method372((byte) 7)) {
            if (var5.field755 == arg3 && arg4 * 128 == var5.field751 && ~(arg2 * 128) == ~var5.field752 && var5.field767.field1388 == arg0.field1388) {
                if (var5.field749 != null) {
                    class215.field3464.method454(var5.field749);
                    var5.field749 = null;
                }
                if (var5.field764 != null) {
                    class215.field3464.method454(var5.field764);
                    var5.field764 = null;
                }
                var5.method544(99);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ih", name = "b", descriptor = "(II)[[I")
    public final int[][] method34(int arg0, int arg1) {
        ++field333;
        if (arg0 != 1) {
            field338 = null;
        }
        int[][] var3 = super.field4598.method812(arg1, 65535);
        if (super.field4598.field1954) {
            int[][] var4 = this.method1930(0, arg1, (byte) -114);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[2];
            int[] var10 = var3[1];
            for (int var11 = 0; ~var11 > ~class186.field2986; ++var11) {
                var8[var11] = 4096 - var5[var11];
                var10[var11] = 4096 - var6[var11];
                var9[var11] = -var7[var11] + 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ih", name = "<init>", descriptor = "()V")
    public class28() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(Lhi;BI)V")
    public final void method20(class264 arg0, byte arg1, int arg2) {
        ++field328;
        if (arg1 != -19) {
            this.method20((class264) null, (byte) -117, -120);
        }
        if (arg2 == 0) {
            super.field4612 = arg0.method1779(-93) == 1;
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(Lil;I)V")
    public static final void method187(class49 arg0, int arg1) {
        if (~class9.field141 == ~arg0.field664 || ~arg0.field672 == 0 || arg0.field642 != 0 || arg0.field623 + 1 > class267.method1812((byte) 89, arg0.field672).field240[arg0.field681]) {
            int var2 = -arg0.field700 + arg0.field664;
            int var3 = class9.field141 - arg0.field700;
            int var4 = arg0.field652 * 128 - -(64 * arg0.method385((byte) 101));
            int var5 = arg0.field629 * 128 + arg0.method385((byte) 113) * 64;
            int var6 = arg0.field649 * 128 - -(arg0.method385((byte) -97) * 64);
            int var7 = arg0.field628 * 128 - -(64 * arg0.method385((byte) -54));
            arg0.field613 = ((-var3 + var2) * var5 + var3 * var7) / var2;
            arg0.field614 = ((var2 - var3) * var4 + var3 * var6) / var2;
        }
        if (~arg0.field650 == -1) {
            arg0.field691 = 1024;
        }
        ++field327;
        if (arg0.field650 == 1) {
            arg0.field691 = 1536;
        }
        arg0.field683 = 0;
        if (~arg0.field650 == -3) {
            arg0.field691 = 0;
        }
        if (arg0.field650 == 3) {
            arg0.field691 = 512;
        }
        if (arg1 == -10928) {
            arg0.field657 = arg0.field691;
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(II)[I")
    public final int[] method26(int arg0, int arg1) {
        ++field325;
        int[] var3 = super.field4609.method579((byte) -62, arg1);
        if (arg0 != 0) {
            return null;
        } else {
            if (super.field4609.field1059) {
                int[] var4 = this.method1931((byte) -117, 0, arg1);
                for (int var5 = 0; class186.field2986 > var5; ++var5) {
                    var3[var5] = -var4[var5] + 4096;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(ILjj;)V")
    public static final void method188(int arg0, class134 arg1) {
        ++field341;
        class227.field3589 = arg1;
        class94.field1356 = class227.field3589.method948((byte) -97, arg0);
    }

    @OriginalMember(owner = "client!ih", name = "d", descriptor = "(B)V")
    public static void method189(byte arg0) {
        field332 = null;
        field338 = null;
        field335 = null;
        field337 = null;
        field326 = null;
        int var1 = 113 % ((arg0 - 69) / 36);
    }

    @OriginalMember(owner = "client!ih", name = "f", descriptor = "(I)V")
    public static final void method190(int arg0) {
        if (arg0 != 2048) {
            method188(-58, (class134) null);
        }
        for (int var1 = 0; var1 < 100; ++var1) {
            class272.field4396[var1] = true;
        }
        ++field330;
    }
}
