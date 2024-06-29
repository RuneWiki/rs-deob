import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!taa")
public class class147 {

    @OriginalMember(owner = "client!taa", name = "b", descriptor = "I")
    public int field1777;

    @OriginalMember(owner = "client!taa", name = "c", descriptor = "I")
    private int field1778;

    @OriginalMember(owner = "client!taa", name = "e", descriptor = "I")
    public static int field1780;

    @OriginalMember(owner = "client!taa", name = "f", descriptor = "I")
    public static int field1781;

    @OriginalMember(owner = "client!taa", name = "g", descriptor = "I")
    public int field1782;

    @OriginalMember(owner = "client!taa", name = "h", descriptor = "I")
    public static int field1783;

    @OriginalMember(owner = "client!taa", name = "j", descriptor = "I")
    public static int field1785;

    @OriginalMember(owner = "client!taa", name = "k", descriptor = "I")
    public static int field1786;

    @OriginalMember(owner = "client!taa", name = "l", descriptor = "I")
    public static int field1787;

    @OriginalMember(owner = "client!taa", name = "i", descriptor = "Lge;")
    public class17 field1784;

    @OriginalMember(owner = "client!taa", name = "a", descriptor = "Loq;")
    public static class218 field1776;

    @OriginalMember(owner = "client!taa", name = "d", descriptor = "[Lrha;")
    public static class434[] field1779;

    @OriginalMember(owner = "client!taa", name = "a", descriptor = "(B)V", line = 3)
    public static final void method919(byte arg0) {
        field1781++;
        client var1 = class612.field8463;
        synchronized (class612.field8463) {
            if (class627.field8740 == null) {
                int var2 = -24 % ((arg0 + 30) / 34);
                Container var3;
                if (class95.field1205 != null) {
                    var3 = class95.field1205;
                } else if (class745.field10393 == null) {
                    var3 = class689.field9789;
                } else {
                    var3 = class745.field10393;
                }
                class538.field7556 = var3.getSize().width;
                class706.field9947 = var3.getSize().height;
                if (class95.field1205 == var3) {
                    Insets var4 = class95.field1205.getInsets();
                    class538.field7556 -= var4.left + var4.right;
                    class706.field9947 -= var4.top + var4.bottom;
                }
                if (class126.method814((byte) 23) == 1) {
                    class599.field8320 = class303.field3896;
                    class204.field2591 = (class538.field7556 - class303.field3896) / 2;
                    class84.field1083 = class708.field9966;
                    class652.field8972 = 0;
                } else {
                    class708.method3914(2);
                }
                if (class323.field4120 != class171.field2248) {
                    boolean var10000;
                    if (class599.field8320 < 1024 && class84.field1083 < 768) {
                        var10000 = true;
                    } else {
                        var10000 = false;
                    }
                }
                class68.field939.setSize(class599.field8320, class84.field1083);
                if (class458.field6407 != null) {
                    if (class107.field1323) {
                        class125.method812(class68.field939, (byte) 127);
                    } else {
                        class458.field6407.method151(class68.field939, class599.field8320, class84.field1083);
                    }
                }
                if (class95.field1205 == var3) {
                    Insets var5 = class95.field1205.getInsets();
                    class68.field939.setLocation(class204.field2591 + var5.left, var5.top - -class652.field8972);
                } else {
                    class68.field939.setLocation(class204.field2591, class652.field8972);
                }
                if (class638.field8834 != -1) {
                    class504.method2911(true, false);
                }
                class452.method2653(256);
            }
        }
    }

    @OriginalMember(owner = "client!taa", name = "b", descriptor = "(B)V", line = 93)
    public static void method920(byte arg0) {
        field1776 = null;
        field1779 = null;
        if (arg0 <= 125) {
            method920((byte) -47);
        }
    }

    @OriginalMember(owner = "client!taa", name = "a", descriptor = "(BLtn;)V", line = 104)
    public final void method921(byte arg0, class179 arg1) {
        while (true) {
            int var3 = arg1.method1094(255);
            if (var3 == 0) {
                if (arg0 < 60) {
                    field1779 = null;
                }
                field1785++;
                return;
            }
            this.method924(var3, arg1, 115);
        }
    }

    @OriginalMember(owner = "client!taa", name = "a", descriptor = "(I)Lbe;", line = 127)
    public final synchronized class196 method922(int arg0) {
        field1787++;
        class196 var2 = (class196) this.field1784.field241.method778((long) this.field1778, 66);
        if (var2 != null) {
            return var2;
        }
        class196 var3 = class196.method1231(this.field1784.field229, this.field1778, 0);
        if (arg0 < 10) {
            this.method924(5, null, -120);
        }
        if (var3 != null) {
            this.field1784.field241.method774((long) this.field1778, -66, var3);
        }
        return var3;
    }

    @OriginalMember(owner = "client!taa", name = "a", descriptor = "(IIIIIIIIII)Z", line = 150)
    public static final boolean method923(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field1780++;
        if (!class680.method3657(arg5, arg4, (byte) -32, arg3)) {
            return false;
        }
        int var10 = class63.field850[1];
        int var11 = class63.field850[0];
        int var12 = class63.field850[2];
        if (!class680.method3657(arg2, arg6, (byte) -32, arg8)) {
            return false;
        }
        int var13 = class63.field850[2];
        int var14 = class63.field850[arg7];
        int var15 = class63.field850[1];
        if (class680.method3657(arg1, arg9, (byte) -32, arg0)) {
            int var16 = class63.field850[1];
            int var17 = class63.field850[0];
            int var18 = class63.field850[2];
            return class315.method1847(var15, var14, (byte) -120, var12, var17, var16, var18, var13, var11, var10);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!taa", name = "a", descriptor = "(ILtn;I)V", line = 179)
    private final void method924(int arg0, class179 arg1, int arg2) {
        if (arg2 <= 82) {
            return;
        }
        if (arg0 == 1) {
            this.field1778 = arg1.method1107(false);
        } else if (arg0 == 2) {
            this.field1777 = arg1.method1094(255);
            this.field1782 = arg1.method1094(255);
        }
        field1786++;
    }
}
