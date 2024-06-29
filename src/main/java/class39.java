import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!me")
public class class39 extends class144 {

    @OriginalMember(owner = "client!me", name = "I", descriptor = "Lrc;")
    public static class9 field466 = new class9(260);

    @OriginalMember(owner = "client!me", name = "N", descriptor = "[Ljava/lang/String;")
    public static String[] field471 = new String[100];

    @OriginalMember(owner = "client!me", name = "J", descriptor = "I")
    public static int field467;

    @OriginalMember(owner = "client!me", name = "K", descriptor = "I")
    public static int field468;

    @OriginalMember(owner = "client!me", name = "L", descriptor = "I")
    public static int field469;

    @OriginalMember(owner = "client!me", name = "O", descriptor = "I")
    public static int field472;

    @OriginalMember(owner = "client!me", name = "P", descriptor = "I")
    public static int field473;

    @OriginalMember(owner = "client!me", name = "M", descriptor = "[I")
    public static int[] field470;

    @OriginalMember(owner = "client!me", name = "b", descriptor = "(II)[I")
    public final int[] method12(int arg0, int arg1) {
        ++field468;
        int[] var3 = super.field2069.method425(true, arg0);
        if (super.field2069.field820) {
            int[][] var4 = this.method927(arg0, true, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[2];
            int[] var7 = var4[1];
            for (int var8 = 0; class104.field1411 > var8; ++var8) {
                var3[var8] = (var5[var8] + var6[var8] - -var7[var8]) / 3;
            }
        }
        if (arg1 != 255) {
            this.method12(-103, -69);
        }
        return var3;
    }

    @OriginalMember(owner = "client!me", name = "<init>", descriptor = "()V")
    public class39() {
        super(1, true);
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(ZLjava/lang/String;C)[Ljava/lang/String;")
    public static final String[] method244(boolean arg0, String arg1, char arg2) {
        ++field473;
        int var3 = class173.method1130(arg1, (byte) -77, arg2);
        int var4 = 0;
        String[] var5 = new String[var3 - -1];
        int var6 = 0;
        if (!arg0) {
            method247(123);
        }
        for (int var7 = 0; var3 > var7; ++var7) {
            int var8;
            for (var8 = var6; ~arg2 != ~arg1.charAt(var8); ++var8) {
            }
            var5[var4++] = arg1.substring(var6, var8);
            var6 = var8 - -1;
        }
        var5[var3] = arg1.substring(var6);
        return var5;
    }

    @OriginalMember(owner = "client!me", name = "g", descriptor = "(I)V")
    public static void method245(int arg0) {
        if (arg0 != 2) {
            field471 = null;
        }
        field471 = null;
        field466 = null;
        field470 = null;
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(IIIIIIIII)V")
    public static final void method246(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        ++field467;
        if (class238.method1549((byte) -97, arg6)) {
            class35.method218(arg7, arg4, arg1, class123.field1767[arg6], -1, arg2, 105, arg0, arg8, arg5);
            if (arg3 > -113) {
                field466 = null;
            }
        } else if (~arg5 != 0) {
            class129.field1862[arg5] = true;
        } else {
            for (int var9 = 0; var9 < 100; ++var9) {
                class129.field1862[var9] = true;
            }
        }
    }

    @OriginalMember(owner = "client!me", name = "h", descriptor = "(I)V")
    public static final void method247(int arg0) {
        class95.field1274 = null;
        ++field469;
        class53.field602 = null;
        class263.field3812 = null;
        class287.field4478 = null;
        class143.field2044 = null;
        class4.field57 = null;
        field470 = null;
        class44.field525 = null;
        if (arg0 == -1) {
            class204.field2909 = null;
            class27.field324 = null;
            class93.field1254 = null;
            class64.field751 = null;
        }
    }
}
