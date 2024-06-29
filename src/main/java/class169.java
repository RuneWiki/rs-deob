import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sf")
public class class169 extends class27 {

    @OriginalMember(owner = "client!sf", name = "P", descriptor = "I")
    private int field3361 = -1;

    @OriginalMember(owner = "client!sf", name = "Q", descriptor = "Lkb;")
    public static class93 field3362 = class76.method390("Zu viele Anmelde)2Versuche von Ihrer Adresse", 0);

    @OriginalMember(owner = "client!sf", name = "M", descriptor = "[[[Lnd;")
    public static class122[][][] field3358 = new class122[4][104][104];

    @OriginalMember(owner = "client!sf", name = "U", descriptor = "[I")
    public static int[] field3366 = new int[128];

    @OriginalMember(owner = "client!sf", name = "O", descriptor = "Z")
    public static boolean field3360 = false;

    @OriginalMember(owner = "client!sf", name = "R", descriptor = "Lkb;")
    public static class93 field3363 = class76.method390("<img=0>", 0);

    @OriginalMember(owner = "client!sf", name = "Z", descriptor = "J")
    public static volatile long field3371 = 0L;

    @OriginalMember(owner = "client!sf", name = "T", descriptor = "Lkb;")
    public static class93 field3365 = class76.method390("Wir vermuten)1 dass Ihr Konto gestohlen wurde", 0);

    @OriginalMember(owner = "client!sf", name = "Y", descriptor = "Lkb;")
    public static class93 field3370 = class76.method390("RuneScape wird geladen )2 bitte warten)3)3)3", 0);

    @OriginalMember(owner = "client!sf", name = "W", descriptor = "I")
    public static int field3368 = 99;

    @OriginalMember(owner = "client!sf", name = "S", descriptor = "I")
    public static int field3364;

    @OriginalMember(owner = "client!sf", name = "V", descriptor = "I")
    public static int field3367;

    @OriginalMember(owner = "client!sf", name = "X", descriptor = "I")
    public static int field3369;

    @OriginalMember(owner = "client!sf", name = "ab", descriptor = "I")
    public int field3372;

    @OriginalMember(owner = "client!sf", name = "bb", descriptor = "I")
    public static int field3373;

    @OriginalMember(owner = "client!sf", name = "cb", descriptor = "I")
    public int field3374;

    @OriginalMember(owner = "client!sf", name = "db", descriptor = "I")
    public static int field3375;

    @OriginalMember(owner = "client!sf", name = "N", descriptor = "[I")
    public int[] field3359;

    @OriginalMember(owner = "client!sf", name = "<init>", descriptor = "()V")
    public class169() {
        super(0, false);
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(II)[[I")
    public int[][] method19(int arg0, int arg1) {
        ++field3373;
        int[][] var3 = super.field436.method537(0, arg1);
        if (super.field436.field1771 && this.method1139(-111)) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            int var7 = this.field3372 * (class159.field3205 == this.field3374 ? arg1 : this.field3374 * arg1 / class159.field3205);
            if (class159.field3209 != this.field3372) {
                for (int var8 = 0; ~var8 > ~class159.field3209; ++var8) {
                    int var9 = this.field3372 * var8 / class159.field3209;
                    int var10 = this.field3359[var7 - -var9];
                    var6[var8] = class91.method479(4080, var10 << 4);
                    var5[var8] = class91.method479(65280, var10) >> 4;
                    var4[var8] = class91.method479(var10 >> 12, 4080);
                }
            } else {
                for (int var11 = 0; ~var11 > ~class159.field3209; ++var11) {
                    int var12 = this.field3359[var7++];
                    var6[var11] = class91.method479(4080, var12 << 4);
                    var5[var11] = class91.method479(4080, var12 >> 4);
                    var4[var11] = class91.method479(16711680, var12) >> 12;
                }
            }
        }
        int var13 = -55 / ((arg0 - 42) / 54);
        return var3;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(IIIII)V")
    public static final void method1138(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field3364;
        if (arg2 >= -118) {
            method1140(-17);
        }
        class36 var5 = (class36) client.field496.method616((long) arg1, -1);
        if (var5 == null) {
            var5 = new class36();
            client.field496.method617(0, (long) arg1, var5);
        }
        if (arg0 >= var5.field595.length) {
            int[] var6 = new int[arg0 + 1];
            int[] var7 = new int[arg0 + 1];
            for (int var8 = 0; var5.field595.length > var8; ++var8) {
                var6[var8] = var5.field595[var8];
                var7[var8] = var5.field594[var8];
            }
            for (int var9 = var5.field595.length; ~var9 > ~arg0; ++var9) {
                var6[var9] = -1;
                var7[var9] = 0;
            }
            var5.field594 = var7;
            var5.field595 = var6;
        }
        var5.field595[arg0] = arg3;
        var5.field594[arg0] = arg4;
    }

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "(Z)I")
    public final int method150(boolean arg0) {
        ++field3367;
        if (arg0) {
            field3360 = false;
        }
        return this.field3361;
    }

    @OriginalMember(owner = "client!sf", name = "d", descriptor = "(I)Z")
    public final boolean method1139(int arg0) {
        ++field3375;
        if (arg0 >= -88) {
            return true;
        } else if (this.field3359 != null) {
            return true;
        } else if (this.field3361 >= 0) {
            class129 var2 = class115.method637(this.field3361, (byte) -103, class159.field3208);
            var2.method735();
            this.field3374 = var2.field2451;
            this.field3372 = var2.field2446;
            this.field3359 = var2.field2450;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(BILrd;)V")
    public final void method15(byte arg0, int arg1, class158 arg2) {
        if (arg1 == 0) {
            this.field3361 = arg2.method1071(28101);
        }
        if (arg0 > 106) {
            ++field3369;
        }
    }

    @OriginalMember(owner = "client!sf", name = "e", descriptor = "(I)V")
    public static void method1140(int arg0) {
        field3365 = null;
        if (arg0 != -24718) {
            field3366 = null;
        }
        field3362 = null;
        field3358 = null;
        field3363 = null;
        field3366 = null;
        field3370 = null;
    }
}
