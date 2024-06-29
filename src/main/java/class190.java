import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ta")
public abstract class class190 {

    @OriginalMember(owner = "client!ta", name = "e", descriptor = "Lrd;")
    public static class173 field3715 = class133.method843("da dieser Computer gegen unsere ", 85);

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "Laf;")
    public static class7 field3711 = new class7(64);

    @OriginalMember(owner = "client!ta", name = "h", descriptor = "Lrd;")
    public static class173 field3718 = class133.method843("Ung-Ultige Verbindung mit einem Anmelde)2Server)3", 96);

    @OriginalMember(owner = "client!ta", name = "i", descriptor = "Lrd;")
    private static class173 field3719 = class133.method843("Could not complete login)3", -113);

    @OriginalMember(owner = "client!ta", name = "j", descriptor = "Lrd;")
    public static class173 field3720 = class133.method843("headicons_prayer", -114);

    @OriginalMember(owner = "client!ta", name = "k", descriptor = "[S")
    public static short[] field3721 = new short[] { 6798, 8741, 25238, 4626, 4550 };

    @OriginalMember(owner = "client!ta", name = "m", descriptor = "Lrd;")
    public static class173 field3723 = field3719;

    @OriginalMember(owner = "client!ta", name = "o", descriptor = "Lrd;")
    public static class173 field3725 = class133.method843("und die Schaltfl-=che (WSpielkonto erstellen(W am", 36);

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "I")
    public static int field3712;

    @OriginalMember(owner = "client!ta", name = "c", descriptor = "I")
    public static int field3713;

    @OriginalMember(owner = "client!ta", name = "d", descriptor = "I")
    public static int field3714;

    @OriginalMember(owner = "client!ta", name = "f", descriptor = "I")
    public static int field3716;

    @OriginalMember(owner = "client!ta", name = "g", descriptor = "I")
    public static int field3717;

    @OriginalMember(owner = "client!ta", name = "n", descriptor = "I")
    public static int field3724;

    @OriginalMember(owner = "client!ta", name = "l", descriptor = "Lbc;")
    public static class14 field3722;

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IB)Z")
    public static final boolean method1267(int arg0, byte arg1) {
        if (arg1 != -119) {
            field3725 = null;
        }
        field3712++;
        return (arg0 >> 29 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    public abstract void method338(Component arg0, int arg1);

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "([IIIIII)V")
    public static final void method1268(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class105 var6 = class208.field4055[arg3][arg4][arg5];
        if (var6 == null) {
            return;
        }
        class52 var7 = var6.field1965;
        if (var7 != null) {
            int var8 = var7.field1064;
            if (var8 != 0) {
                for (int var9 = 0; var9 < 4; var9++) {
                    arg0[arg1] = var8;
                    arg0[arg1 + 1] = var8;
                    arg0[arg1 + 2] = var8;
                    arg0[arg1 + 3] = var8;
                    arg1 += arg2;
                }
            }
            return;
        }
        class132 var10 = var6.field1964;
        if (var10 == null) {
            return;
        }
        int var11 = var10.field2485;
        int var12 = var10.field2494;
        int var13 = var10.field2492;
        int var14 = var10.field2490;
        int[] var15 = class68.field1314[var11];
        int[] var16 = class78.field1531[var12];
        int var17 = 0;
        if (var13 != 0) {
            for (int var18 = 0; var18 < 4; var18++) {
                arg0[arg1] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg0[arg1 + 1] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg0[arg1 + 2] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg0[arg1 + 3] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg1 += arg2;
            }
            return;
        }
        for (int var19 = 0; var19 < 4; var19++) {
            if (var15[var16[var17++]] != 0) {
                arg0[arg1] = var14;
            }
            if (var15[var16[var17++]] != 0) {
                arg0[arg1 + 1] = var14;
            }
            if (var15[var16[var17++]] != 0) {
                arg0[arg1 + 2] = var14;
            }
            if (var15[var16[var17++]] != 0) {
                arg0[arg1 + 3] = var14;
            }
            arg1 += arg2;
        }
    }

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "(Ljava/awt/Component;I)V")
    public abstract void method339(Component arg0, int arg1);

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IILac;III)V")
    public static final void method1269(int arg0, int arg1, class4 arg2, int arg3, int arg4, int arg5) {
        field3716++;
        class87 var6 = new class87();
        var6.field1700 = arg4;
        var6.field1697 = arg2.field101;
        var6.field1680 = arg2.field55;
        var6.field1683 = arg5 * 128;
        var6.field1702 = arg2.field64;
        var6.field1687 = arg1 * 128;
        int var7 = arg2.field61;
        var6.field1679 = arg2.field39 * 128;
        var6.field1681 = arg2.field75;
        int var8 = arg2.field67;
        if (arg0 == 1 || arg0 == 3) {
            var7 = arg2.field67;
            var8 = arg2.field61;
        }
        var6.field1678 = (arg1 + var8) * 128;
        var6.field1701 = (arg5 + var7) * arg3;
        if (arg2.field84 != null) {
            var6.field1691 = arg2;
            var6.method560(128);
        }
        class35.field757.method920(false, var6);
        if (var6.field1697 != null) {
            var6.field1689 = (int) ((double) (var6.field1681 - var6.field1702) * Math.random()) + var6.field1702;
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(I)V")
    public static final void method1270(int arg0) {
        System.out.println("Usage: worldid, [live/office/local], [live/rc/wip], [lowmem/highmem], [free/members], [english/german], [game0/game1]");
        System.exit(arg0);
        field3724++;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(B)V")
    public static void method1271(byte arg0) {
        field3718 = null;
        field3715 = null;
        field3722 = null;
        field3719 = null;
        field3723 = null;
        field3725 = null;
        field3721 = null;
        if (arg0 > 39) {
            field3720 = null;
            field3711 = null;
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IBZI)Lrd;")
    public static final class173 method1272(int arg0, byte arg1, boolean arg2, int arg3) {
        field3713++;
        if (arg3 < 2 || arg3 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg3);
        }
        int var4 = 1;
        int var5 = arg0 / arg3;
        if (arg1 >= -52) {
            field3725 = null;
        }
        while (var5 != 0) {
            var5 /= arg3;
            var4++;
        }
        int var6 = var4;
        if (arg0 < 0 || arg2) {
            var6 = var4 + 1;
        }
        byte[] var7 = new byte[var6];
        if (arg0 < 0) {
            var7[0] = 45;
        } else if (arg2) {
            var7[0] = 43;
        }
        for (int var8 = 0; var8 < var4; var8++) {
            int var10 = arg0 % arg3;
            if (var10 < 0) {
                var10 = -var10;
            }
            if (var10 > 9) {
                var10 += 39;
            }
            arg0 /= arg3;
            var7[var6 - var8 - 1] = (byte) (var10 + 48);
        }
        class173 var9 = new class173();
        var9.field3415 = var7;
        var9.field3379 = var6;
        return var9;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(Z)I")
    public abstract int method340(boolean arg0);
}
