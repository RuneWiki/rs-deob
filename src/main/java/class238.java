import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gf")
public class class238 {

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "I")
    public int field3807 = 0;

    @OriginalMember(owner = "client!gf", name = "c", descriptor = "Lok;")
    public static class41 field3808 = class137.method956(")1a2)1m", 45);

    @OriginalMember(owner = "client!gf", name = "h", descriptor = "[Z")
    public static boolean[] field3813 = new boolean[200];

    @OriginalMember(owner = "client!gf", name = "e", descriptor = "F")
    public static float field3810;

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "I")
    public static int field3806;

    @OriginalMember(owner = "client!gf", name = "d", descriptor = "I")
    public static int field3809;

    @OriginalMember(owner = "client!gf", name = "f", descriptor = "I")
    public static int field3811;

    @OriginalMember(owner = "client!gf", name = "g", descriptor = "I")
    public static int field3812;

    @OriginalMember(owner = "client!gf", name = "i", descriptor = "I")
    public static int field3814;

    @OriginalMember(owner = "client!gf", name = "j", descriptor = "I")
    public static int field3815;

    @OriginalMember(owner = "client!gf", name = "k", descriptor = "I")
    public static int field3816;

    @OriginalMember(owner = "client!gf", name = "l", descriptor = "Ljava/awt/Frame;")
    public static Frame field3817;

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(ZI)Z", line = 9)
    public static final boolean method1702(boolean arg0, int arg1) {
        field3811++;
        if (arg1 < 32) {
            return false;
        } else if (arg1 == 127) {
            return false;
        } else if (arg1 >= 129 && arg1 <= 159) {
            return false;
        } else {
            if (!arg0) {
                field3810 = -0.52374697F;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(ZIII)V", line = 31)
    public static final void method1703(boolean arg0, int arg1, int arg2, int arg3) {
        class46 var4 = class195.method1396(11, arg2, arg0);
        var4.method337(0);
        var4.field719 = arg1;
        if (arg0) {
            field3816 = 97;
        }
        var4.field721 = arg3;
        field3809++;
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(I)V", line = 59)
    public static void method1704(int arg0) {
        field3817 = null;
        if (arg0 == 200) {
            field3808 = null;
            field3813 = null;
        }
    }

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "(I)V", line = 73)
    public static final void method1705(int arg0) {
        field3806++;
        if (class118.field1724 != null) {
            class118.field1724.method1570((byte) -98);
            class118.field1724 = null;
        }
        class235.method1693((byte) -114);
        class213.method1505();
        for (int var1 = 0; var1 < 4; var1++) {
            class222.field3548[var1].method1609(16777215);
        }
        class57.method401((byte) 79);
        int var2 = 70 % ((arg0 + 11) / 54);
        System.gc();
        class162.method1143(125, 2);
        class237.field3805 = -1;
        class265.field4193 = false;
        class176.method1258(true, (byte) -101);
        class122.field1813 = false;
        class88.field1300 = 0;
        class55.field809 = 0;
        for (int var3 = 0; var3 < class35.field529.length; var3++) {
            class35.field529[var3] = null;
        }
        class97.field1419 = 0;
        class85.field1248 = 0;
        for (int var4 = 0; var4 < 2048; var4++) {
            class246.field3955[var4] = null;
            class50.field766[var4] = null;
        }
        for (int var5 = 0; var5 < 32768; var5++) {
            class216.field3471[var5] = null;
        }
        for (int var6 = 0; var6 < 4; var6++) {
            for (int var7 = 0; var7 < 104; var7++) {
                for (int var8 = 0; var8 < 104; var8++) {
                    class81.field1199[var6][var7][var8] = null;
                }
            }
        }
        class226.method1624(-7844);
        class313.field5287 = 0;
        class51.method355((byte) -119);
        class146.method1007(false, true);
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(ZLlb;)V", line = 176)
    public final void method1706(boolean arg0, class112 arg1) {
        while (true) {
            int var3 = arg1.method792(2);
            if (var3 == 0) {
                field3815++;
                if (!arg0) {
                    this.field3807 = -89;
                }
                return;
            }
            this.method1708(var3, 0, arg1);
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(Lqi;)V", line = 207)
    public static final void method1707(class232 arg0) {
        for (int var1 = arg0.field3668; var1 <= arg0.field3673; var1++) {
            for (int var2 = arg0.field3665; var2 <= arg0.field3676; var2++) {
                class308 var3 = class205.field3312[arg0.field3667][var1][var2];
                if (var3 != null) {
                    for (int var4 = 0; var4 < var3.field5193; var4++) {
                        if (var3.field5201[var4] == arg0) {
                            var3.field5193--;
                            for (int var5 = var4; var5 < var3.field5193; var5++) {
                                var3.field5201[var5] = var3.field5201[var5 + 1];
                                var3.field5195[var5] = var3.field5195[var5 + 1];
                            }
                            var3.field5201[var3.field5193] = null;
                            break;
                        }
                    }
                    var3.field5191 = 0;
                    for (int var6 = 0; var6 < var3.field5193; var6++) {
                        var3.field5191 |= var3.field5195[var6];
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(IILlb;)V", line = 269)
    private final void method1708(int arg0, int arg1, class112 arg2) {
        if (arg1 != 0) {
            method1702(true, -94);
        }
        if (arg0 == 5) {
            this.field3807 = arg2.method759((byte) -107);
        }
        field3814++;
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(IIIIILth;IJZ)Z", line = 285)
    public static final boolean method1709(int arg0, int arg1, int arg2, int arg3, int arg4, class126 arg5, int arg6, long arg7, boolean arg8) {
        if (arg5 == null) {
            return true;
        }
        int var10 = arg1 - arg4;
        int var11 = arg2 - arg4;
        int var12 = arg1 + arg4;
        int var13 = arg2 + arg4;
        if (arg8) {
            if (arg6 > 640 && arg6 < 1408) {
                var13 += 128;
            }
            if (arg6 > 1152 && arg6 < 1920) {
                var12 += 128;
            }
            if (arg6 > 1664 || arg6 < 384) {
                var11 -= 128;
            }
            if (arg6 > 128 && arg6 < 896) {
                var10 -= 128;
            }
        }
        int var14 = var10 / 128;
        int var15 = var11 / 128;
        int var16 = var12 / 128;
        int var17 = var13 / 128;
        return class314.method2174(arg0, var14, var15, var16 + 1 - var14, var17 - var15 + 1, arg1, arg2, arg3, arg5, arg6, true, arg7);
    }
}
