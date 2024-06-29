import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uq")
public class class161 extends class601 {

    @OriginalMember(owner = "client!uq", name = "f", descriptor = "Ldh;")
    public static class320 field1794 = new class320(41, 3);

    @OriginalMember(owner = "client!uq", name = "k", descriptor = "[Ljava/lang/String;")
    public static String[] field1799 = new String[200];

    @OriginalMember(owner = "client!uq", name = "d", descriptor = "I")
    public static int field1792;

    @OriginalMember(owner = "client!uq", name = "e", descriptor = "I")
    public static int field1793;

    @OriginalMember(owner = "client!uq", name = "g", descriptor = "I")
    public static int field1795;

    @OriginalMember(owner = "client!uq", name = "h", descriptor = "I")
    public static int field1796;

    @OriginalMember(owner = "client!uq", name = "i", descriptor = "I")
    public static int field1797;

    @OriginalMember(owner = "client!uq", name = "j", descriptor = "I")
    public static int field1798;

    @OriginalMember(owner = "client!uq", name = "l", descriptor = "I")
    public static int field1800;

    @OriginalMember(owner = "client!uq", name = "m", descriptor = "I")
    public static int field1801;

    @OriginalMember(owner = "client!uq", name = "o", descriptor = "I")
    public static int field1803;

    @OriginalMember(owner = "client!uq", name = "n", descriptor = "Z")
    public static boolean field1802;

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(B)V")
    public final void method35(byte arg0) {
        ++field1793;
        if (arg0 > -37) {
            this.method34(9, -55);
        }
        if (~super.field8565 != -2 && ~super.field8565 != -1) {
            super.field8565 = this.method39((byte) -17);
        }
    }

    @OriginalMember(owner = "client!uq", name = "<init>", descriptor = "(ILgn;)V")
    public class161(int arg0, class699 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(I)V")
    public static void method996(int arg0) {
        field1794 = null;
        field1799 = null;
        if (arg0 != -1) {
            method996(-2);
        }
    }

    @OriginalMember(owner = "client!uq", name = "b", descriptor = "(II)I")
    public final int method34(int arg0, int arg1) {
        ++field1796;
        if (arg1 != 15706) {
            method998(true);
        }
        return 1;
    }

    @OriginalMember(owner = "client!uq", name = "b", descriptor = "(B)I")
    public final int method39(byte arg0) {
        ++field1795;
        return arg0 != -17 ? -19 : 1;
    }

    @OriginalMember(owner = "client!uq", name = "b", descriptor = "(I)V")
    public static final void method997(int arg0) {
        ++field1797;
        if (class370.field4740 == null) {
            if (arg0 != 0) {
                method1000((String) null, (byte[]) null, 118, (byte) 37);
            }
            int var1 = class93.field979;
            int var2 = class504.field7104;
            int var3 = -class705.field9926 + class71.field758 + -var1;
            int var4 = -class476.field6777 + class217.field2523 + -var2;
            if (~var1 < -1 || ~var3 < -1 || var2 > 0 || var4 > 0) {
                try {
                    Container var5;
                    if (class537.field7761 != null) {
                        var5 = class537.field7761;
                    } else if (class255.field3123 == null) {
                        var5 = class471.field6735;
                    } else {
                        var5 = class255.field3123;
                    }
                    int var6 = 0;
                    int var7 = 0;
                    if (class537.field7761 == var5) {
                        Insets var8 = class537.field7761.getInsets();
                        var7 = var8.top;
                        var6 = var8.left;
                    }
                    Graphics var9 = var5.getGraphics();
                    var9.setColor(Color.black);
                    if (var1 > 0) {
                        var9.fillRect(var6, var7, var1, class217.field2523);
                    }
                    if (var2 > 0) {
                        var9.fillRect(var6, var7, class71.field758, var2);
                    }
                    if (var3 > 0) {
                        var9.fillRect(-var3 + var6 - -class71.field758, var7, var3, class217.field2523);
                    }
                    if (~var4 < -1) {
                        var9.fillRect(var6, class217.field2523 + var7 + -var4, class71.field758, var4);
                        return;
                    }
                } catch (Exception var10) {
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(Z)V")
    public static final void method998(boolean arg0) {
        class265.method1598(-23030);
        ++field1803;
        int var1 = class654.field9334.field9872.method2432(67);
        if (var1 != 2) {
            if (~var1 == -4) {
                class463.method2815(class275.field3370, class160.field1782, 2, class705.field9926, class743.field10375, 2, (byte) -90, class476.field6777);
            }
        } else {
            class512.method3025(class275.field3370, 100, (byte) 99, 100, class705.field9926, class476.field6777);
        }
        if (class654.field9334.field9872.method2435(arg0)) {
            class578.method3335(class618.field8849, true);
        }
        if (class275.field3370 != null) {
            class374.method2182((byte) 11);
        }
        class626.field8994 = ~class654.field9334.field9872.method2432(81) != -1;
        class397.field5443 = class654.field9334.field9872.method2435(arg0);
    }

    @OriginalMember(owner = "client!uq", name = "<init>", descriptor = "(Lgn;)V")
    public class161(class699 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(IZ)V")
    public final void method40(int arg0, boolean arg1) {
        super.field8565 = arg0;
        ++field1792;
        if (arg1) {
            field1802 = true;
        }
    }

    @OriginalMember(owner = "client!uq", name = "c", descriptor = "(I)I")
    public final int method999(int arg0) {
        ++field1800;
        int var2 = -26 / ((arg0 - -59) / 61);
        return super.field8565;
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(Ljava/lang/String;[BIB)I")
    public static final int method1000(String arg0, byte[] arg1, int arg2, byte arg3) {
        ++field1801;
        int var4 = arg2;
        int var5 = arg0.length();
        for (int var6 = 0; var5 > var6; var6 += 4) {
            int var7 = class591.method3383((byte) -7, arg0.charAt(var6));
            int var8 = var5 > var6 - -1 ? class591.method3383((byte) -7, arg0.charAt(var6 - -1)) : -1;
            int var9 = var6 + 2 < var5 ? class591.method3383((byte) -7, arg0.charAt(var6 + 2)) : -1;
            int var10 = var6 + 3 >= var5 ? -1 : class591.method3383((byte) -7, arg0.charAt(var6 + 3));
            arg1[arg2++] = (byte) class695.method3919(var7 << 2, var8 >>> 4);
            if (var9 == -1) {
                break;
            }
            arg1[arg2++] = (byte) class695.method3919(var9 >>> 2, class327.method1956(var8 << 4, 240));
            if (var10 == -1) {
                break;
            }
            arg1[arg2++] = (byte) class695.method3919(class327.method1956(3, var9) << 6, var10);
        }
        int var11 = 127 / ((arg3 - -68) / 56);
        return -var4 + arg2;
    }

    @OriginalMember(owner = "client!uq", name = "c", descriptor = "(II)Z")
    public static final boolean method1001(int arg0, int arg1) {
        ++field1798;
        if (arg1 != 2524) {
            field1802 = true;
        }
        for (class649 var2 = (class649) class265.field3289.method1719(65280); var2 != null; var2 = (class649) class265.field3289.method1723(-20665)) {
            if (class411.method2523(115, var2.field9270) && ~((long) arg0) == ~var2.field9272) {
                return true;
            }
        }
        return false;
    }
}
