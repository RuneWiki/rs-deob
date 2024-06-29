import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dc")
public class class33 extends class130 {

    @OriginalMember(owner = "client!dc", name = "R", descriptor = "[Lrf;")
    public class159[] field803;

    @OriginalMember(owner = "client!dc", name = "E", descriptor = "Lgg;")
    private static class63 field791 = class116.method911(43, "Your ignore list is full)3 Max of 100 users)3");

    @OriginalMember(owner = "client!dc", name = "H", descriptor = "Lgg;")
    private static class63 field794 = class116.method911(43, "Loaded title screen");

    @OriginalMember(owner = "client!dc", name = "N", descriptor = "I")
    public static int field800 = 0;

    @OriginalMember(owner = "client!dc", name = "G", descriptor = "I")
    public static int field793 = -1;

    @OriginalMember(owner = "client!dc", name = "M", descriptor = "Lgg;")
    public static class63 field799 = field791;

    @OriginalMember(owner = "client!dc", name = "T", descriptor = "Lgg;")
    public static class63 field805 = class116.method911(43, "Cabbage");

    @OriginalMember(owner = "client!dc", name = "S", descriptor = "Lgg;")
    public static class63 field804 = field794;

    @OriginalMember(owner = "client!dc", name = "U", descriptor = "[Lgf;")
    public static class62[] field806 = new class62[2048];

    @OriginalMember(owner = "client!dc", name = "F", descriptor = "I")
    public static int field792;

    @OriginalMember(owner = "client!dc", name = "I", descriptor = "I")
    public static int field795;

    @OriginalMember(owner = "client!dc", name = "J", descriptor = "I")
    public static int field796;

    @OriginalMember(owner = "client!dc", name = "K", descriptor = "I")
    public static int field797;

    @OriginalMember(owner = "client!dc", name = "L", descriptor = "I")
    public static int field798;

    @OriginalMember(owner = "client!dc", name = "P", descriptor = "I")
    public static int field801;

    @OriginalMember(owner = "client!dc", name = "Q", descriptor = "I")
    public static int field802;

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "(B)V")
    public static final void method317(byte arg0) {
        if (arg0 != -43) {
            field794 = null;
        }
        field796++;
        if (class158.field3275 != null) {
            class158.field3275.method509(true);
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(IBIIIII)I")
    public static final int method318(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if ((arg0 & 0x1) == 1) {
            int var7 = arg2;
            arg2 = arg5;
            arg5 = var7;
        }
        field802++;
        int var8 = arg6 & 0x3;
        if (var8 == 0) {
            return arg4;
        } else if (var8 == 1) {
            return arg3;
        } else if (var8 == 2) {
            return 1 + 7 - arg2 - arg4;
        } else {
            if (arg1 != -57) {
                field793 = 49;
            }
            return 7 + 1 - arg3 - arg5;
        }
    }

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "(I)V")
    public static void method319(int arg0) {
        field799 = null;
        field794 = null;
        field805 = null;
        field804 = null;
        field806 = null;
        if (arg0 != 59786504) {
            field794 = null;
        }
        field791 = null;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(IIIII)V")
    public static final void method320(int arg0, int arg1, int arg2, int arg3, int arg4) {
        for (int var5 = arg1; var5 <= arg0 + arg1; var5++) {
            for (int var6 = arg4; var6 <= arg3 + arg4; var6++) {
                if (var6 >= 0 && var6 < 104 && var5 >= 0 && var5 < 104) {
                    class71.field1790[0][var6][var5] = 127;
                    if (arg4 == var6 && var6 > 0) {
                        class81.field1948[0][var6][var5] = class81.field1948[0][var6 - 1][var5];
                    }
                    if (arg3 + arg4 == var6 && var6 < 103) {
                        class81.field1948[0][var6][var5] = class81.field1948[0][var6 + 1][var5];
                    }
                    if (arg1 == var5 && var5 > 0) {
                        class81.field1948[0][var6][var5] = class81.field1948[0][var6][var5 - 1];
                    }
                    if (arg0 + arg1 == var5 && var5 < 103) {
                        class81.field1948[0][var6][var5] = class81.field1948[0][var6][var5 + 1];
                    }
                }
            }
        }
        field795++;
        if (arg2 != 0) {
            method319(112);
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(BLff;)Lff;")
    public static final class54 method321(byte arg0, class54 arg1) {
        if (arg0 != -106) {
            return null;
        }
        field798++;
        class54 var2 = class157.method1089(true, arg1);
        if (var2 == null) {
            var2 = arg1.field1410;
        }
        return var2;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(II)Z")
    public final boolean method322(int arg0, int arg1) {
        field797++;
        if (arg0 != -73) {
            method321((byte) -53, null);
        }
        return this.field803[arg1].field3284;
    }

    @OriginalMember(owner = "client!dc", name = "<init>", descriptor = "(Ljc;Ljc;IZ)V")
    public class33(class85 arg0, class85 arg1, int arg2, boolean arg3) {
        class148 var5 = new class148();
        int var6 = arg0.method759(arg2, false);
        this.field803 = new class159[var6];
        int[] var7 = arg0.method754((byte) 92, arg2);
        for (int var8 = 0; var8 < var7.length; var8++) {
            byte[] var9 = arg0.method745(arg2, var7[var8], 0);
            class170 var10 = null;
            int var11 = var9[1] & 0xFF | (var9[0] & 0xFF) << 8;
            for (class170 var12 = (class170) var5.method1033(0); var12 != null; var12 = (class170) var5.method1035(0)) {
                if (var12.field3499 == var11) {
                    var10 = var12;
                    break;
                }
            }
            if (var10 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method744((byte) 52, var11, 0);
                } else {
                    var13 = arg1.method744((byte) 103, 0, var11);
                }
                var10 = new class170(var11, var13);
                var5.method1034(0, var10);
            }
            this.field803[var7[var8]] = new class159(var9, var10);
        }
    }
}
