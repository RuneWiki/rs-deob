import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ia")
public class class197 {

    @OriginalMember(owner = "client!ia", name = "e", descriptor = "J")
    public long field3362 = 0L;

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "Lbe;")
    public static class283 field3359 = class153.method941(126, "Mitglieder)2Welt");

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "I")
    public static int field3358 = 0;

    @OriginalMember(owner = "client!ia", name = "m", descriptor = "[[Lg;")
    public static class149[][] field3370 = new class149[13][13];

    @OriginalMember(owner = "client!ia", name = "c", descriptor = "I")
    public static int field3360;

    @OriginalMember(owner = "client!ia", name = "d", descriptor = "I")
    public static int field3361;

    @OriginalMember(owner = "client!ia", name = "f", descriptor = "I")
    public int field3363;

    @OriginalMember(owner = "client!ia", name = "g", descriptor = "I")
    public static int field3364;

    @OriginalMember(owner = "client!ia", name = "h", descriptor = "I")
    public int field3365;

    @OriginalMember(owner = "client!ia", name = "i", descriptor = "I")
    public int field3366;

    @OriginalMember(owner = "client!ia", name = "j", descriptor = "I")
    public int field3367;

    @OriginalMember(owner = "client!ia", name = "k", descriptor = "I")
    public static int field3368;

    @OriginalMember(owner = "client!ia", name = "l", descriptor = "I")
    public static int field3369;

    @OriginalMember(owner = "client!ia", name = "o", descriptor = "I")
    public static int field3372;

    @OriginalMember(owner = "client!ia", name = "p", descriptor = "I")
    public static int field3373;

    @OriginalMember(owner = "client!ia", name = "q", descriptor = "I")
    public static int field3374;

    @OriginalMember(owner = "client!ia", name = "t", descriptor = "I")
    public int field3377;

    @OriginalMember(owner = "client!ia", name = "u", descriptor = "I")
    public static int field3378;

    @OriginalMember(owner = "client!ia", name = "n", descriptor = "Lek;")
    public static class172 field3371;

    @OriginalMember(owner = "client!ia", name = "r", descriptor = "Lgf;")
    public class7 field3375;

    @OriginalMember(owner = "client!ia", name = "s", descriptor = "Lgf;")
    public class7 field3376;

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(IIIBII)V", line = 10)
    public static final void method1263(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5) {
        field3360++;
        int var6 = 24 / ((30 - arg3) / 47);
        int var7 = arg1;
        int var8 = 0;
        int var9 = arg1 * arg1;
        int var10 = var9 << 1;
        int var11 = arg4 * arg4;
        int var12 = var11 << 1;
        int var13 = arg1 << 1;
        int var14 = (1 - var13) * var11 + var10;
        int var15 = var9 - ((var13 - 1) * var12);
        int var16 = var11 << 2;
        int var17 = var9 << 2;
        int var18 = ((arg1 << 1) - 3) * var12;
        int var19 = ((var8 << 1) + 3) * var10;
        int var20 = (var8 + 1) * var17;
        int var21 = (arg1 - 1) * var16;
        if (arg2 >= class217.field3677 && class247.field4220 >= arg2) {
            int var22 = class44.method263(class166.field2765, arg4 + arg5, (byte) -95, class269.field4551);
            int var23 = class44.method263(class166.field2765, arg5 - arg4, (byte) -63, class269.field4551);
            class114.method742(30197, var23, class97.field1636[arg2], var22, arg0);
        }
        while (var7 > 0) {
            var7--;
            int var24 = arg2 - var7;
            int var25 = arg2 + var7;
            if (var14 < 0) {
                while (var14 < 0) {
                    var15 += var20;
                    var14 += var19;
                    var20 += var17;
                    var8++;
                    var19 += var17;
                }
            }
            if (var15 < 0) {
                var14 += var19;
                var8++;
                var19 += var17;
                var15 += var20;
                var20 += var17;
            }
            var14 += -var21;
            var21 -= var16;
            if (var25 >= class217.field3677 && class247.field4220 >= var24) {
                int var26 = class44.method263(class166.field2765, arg5 + var8, (byte) -65, class269.field4551);
                int var27 = class44.method263(class166.field2765, arg5 - var8, (byte) -82, class269.field4551);
                if (var24 >= class217.field3677) {
                    class114.method742(30197, var27, class97.field1636[var24], var26, arg0);
                }
                if (class247.field4220 >= var25) {
                    class114.method742(30197, var27, class97.field1636[var25], var26, arg0);
                }
            }
            var15 += -var18;
            var18 -= var16;
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(IZ)V", line = 109)
    public static final void method1264(int arg0, boolean arg1) {
        field3369++;
        if (!arg1) {
            class72 var2 = class25.method174(arg0, (byte) -71, 10);
            var2.method479(121);
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(ZLek;ZLek;)V", line = 124)
    public static final void method1265(boolean arg0, class172 arg1, boolean arg2, class172 arg3) {
        class119.field2008 = arg1;
        class48.field660 = arg3;
        class240.field4050 = arg2;
        field3368++;
        if (arg0) {
            method1268(4, (Component) null);
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(Z)V", line = 153)
    public static void method1266(boolean arg0) {
        if (arg0) {
            field3358 = 41;
        }
        field3371 = null;
        field3359 = null;
        field3370 = (class149[][]) null;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(IZIIIZZB)Lnh;", line = 166)
    public static final class107 method1267(int arg0, boolean arg1, int arg2, int arg3, int arg4, boolean arg5, boolean arg6, byte arg7) {
        field3364++;
        class304 var8 = class103.method676(arg3, -1);
        if (arg4 > 1 && var8.field5146 != null) {
            int var9 = -1;
            for (int var10 = 0; var10 < 10; var10++) {
                if (arg4 >= var8.field5193[var10] && var8.field5193[var10] != 0) {
                    var9 = var8.field5146[var10];
                }
            }
            if (var9 != -1) {
                var8 = class103.method676(var9, -1);
            }
        }
        class258 var11 = var8.method2059(92);
        if (var11 == null) {
            return null;
        }
        class204 var12 = null;
        if (var8.field5143 != -1) {
            var12 = (class204) method1267(0, true, 1, var8.field5131, 10, false, true, (byte) 60);
            if (var12 == null) {
                return null;
            }
        } else if (var8.field5135 != -1) {
            var12 = (class204) method1267(arg0, false, arg2, var8.field5185, arg4, false, true, (byte) 117);
            if (var12 == null) {
                return null;
            }
        }
        int var13 = class78.field1358;
        int var14 = class78.field1355;
        int[] var15 = new int[4];
        int[] var16 = class78.field1357;
        class78.method511(var15);
        class204 var17 = new class204(36, 32);
        class78.method512(var17.field3484, 36, 32);
        class139.method861();
        if (arg7 <= 57) {
            method1264(-89, false);
        }
        class139.method859(16, 16);
        int var18 = var8.field5134;
        class139.field2313 = false;
        if (arg1) {
            var18 = (int) ((double) var18 * 1.5D);
        } else if (arg2 == 2) {
            var18 = (int) ((double) var18 * 1.04D);
        }
        int var19 = class139.field2309[var8.field5150] * var18 >> 16;
        int var20 = class139.field2316[var8.field5150] * var18 >> 16;
        var11.method1344(0, var8.field5132, var8.field5169, var8.field5150, var8.field5163, (var19 + var8.field5196) - (var11.method40() / 2), var20 - -var8.field5196);
        if (arg2 >= 1) {
            var17.method1309(1);
            if (arg2 >= 2) {
                var17.method1309(16777215);
            }
            class78.method512(var17.field3484, 36, 32);
        }
        if (arg0 != 0) {
            var17.method1307(arg0);
        }
        if (var8.field5143 != -1) {
            var12.method711(0, 0);
        } else if (var8.field5135 != -1) {
            class78.method512(var12.field3484, 36, 32);
            var17.method711(0, 0);
            var17 = var12;
        }
        if (arg5 && (var8.field5162 == 1 || arg4 != 1) && arg4 != -1) {
            class225.field3766.method1643(class119.method763(arg4, 9), 0, 9, 16776960, 1);
        }
        class78.method512(var16, var13, var14);
        class78.method518(var15);
        class139.method861();
        class139.field2313 = true;
        return arg6 ? var17 : new class266(var17);
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(ILjava/awt/Component;)V", line = 312)
    public static final void method1268(int arg0, Component arg1) {
        arg1.removeMouseListener(class121.field2017);
        if (arg0 != 23725) {
            method1263(-40, 123, -78, (byte) 125, -9, 77);
        }
        field3378++;
        arg1.removeMouseMotionListener(class121.field2017);
        arg1.removeFocusListener(class121.field2017);
        class18.field215 = 0;
    }
}
