import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hh")
public class class207 {

    @OriginalMember(owner = "client!hh", name = "d", descriptor = "I")
    public static int field3664 = 0;

    @OriginalMember(owner = "client!hh", name = "c", descriptor = "[I")
    public static int[] field3663 = new int[128];

    @OriginalMember(owner = "client!hh", name = "g", descriptor = "Lud;")
    public static class279 field3667 = class130.method1024("S-Blectionner", 255);

    @OriginalMember(owner = "client!hh", name = "e", descriptor = "Lud;")
    public static class279 field3665 = class130.method1024("::pcachesize", 255);

    @OriginalMember(owner = "client!hh", name = "f", descriptor = "I")
    public static int field3666 = 0;

    @OriginalMember(owner = "client!hh", name = "n", descriptor = "Lud;")
    private static class279 field3674 = class130.method1024("Please wait )2 attempting to reestablish)3", 255);

    @OriginalMember(owner = "client!hh", name = "l", descriptor = "Lud;")
    public static class279 field3672 = field3674;

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "I")
    public static int field3662;

    @OriginalMember(owner = "client!hh", name = "h", descriptor = "I")
    public static int field3668;

    @OriginalMember(owner = "client!hh", name = "j", descriptor = "I")
    public static int field3670;

    @OriginalMember(owner = "client!hh", name = "k", descriptor = "I")
    public static int field3671;

    @OriginalMember(owner = "client!hh", name = "m", descriptor = "I")
    public static int field3673;

    @OriginalMember(owner = "client!hh", name = "i", descriptor = "Lok;")
    public static class149 field3669;

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "Lgk;")
    public static class7 field3661;

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(ILgf;)V", line = 16)
    public static final void method1526(int arg0, class8 arg1) {
        field3662++;
        class8 var2 = class322.method2270(-15288, arg1);
        int var3 = 28 % ((arg0 + 39) / 45);
        int var4;
        int var5;
        if (var2 == null) {
            var5 = class176.field3150;
            var4 = class221.field3899;
        } else {
            var4 = var2.field220;
            var5 = var2.field297;
        }
        class109.method899(var4, arg1, var5, false, 0);
        class117.method940(var4, arg1, var5, -98);
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(B)V", line = 55)
    public static void method1527(byte arg0) {
        field3674 = null;
        if (arg0 <= 36) {
            return;
        }
        field3663 = null;
        field3667 = null;
        field3665 = null;
        field3669 = null;
        field3661 = null;
        field3672 = null;
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "([SB[Lud;II)V", line = 92)
    public static final void method1528(short[] arg0, byte arg1, class279[] arg2, int arg3, int arg4) {
        if (arg1 != 49) {
            method1526(85, (class8) null);
        }
        if (arg4 > arg3) {
            int var5 = (arg3 + arg4) / 2;
            int var6 = arg3;
            class279 var7 = arg2[var5];
            arg2[var5] = arg2[arg4];
            arg2[arg4] = var7;
            short var8 = arg0[var5];
            arg0[var5] = arg0[arg4];
            arg0[arg4] = var8;
            for (int var9 = arg3; var9 < arg4; var9++) {
                if (var7 == null || arg2[var9] != null && arg2[var9].method1995((byte) -123, var7) < (var9 & 0x1)) {
                    class279 var10 = arg2[var9];
                    arg2[var9] = arg2[var6];
                    arg2[var6] = var10;
                    short var11 = arg0[var9];
                    arg0[var9] = arg0[var6];
                    arg0[var6++] = var11;
                }
            }
            arg2[arg4] = arg2[var6];
            arg2[var6] = var7;
            arg0[arg4] = arg0[var6];
            arg0[var6] = var8;
            method1528(arg0, (byte) 49, arg2, arg3, var6 - 1);
            method1528(arg0, (byte) 49, arg2, var6 + 1, arg4);
        }
        field3670++;
    }
}
