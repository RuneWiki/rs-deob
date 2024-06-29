import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cw")
public class class138 extends class623 {

    @OriginalMember(owner = "client!cw", name = "v", descriptor = "[I")
    public static int[] field1644 = new int[16384];

    @OriginalMember(owner = "client!cw", name = "w", descriptor = "[I")
    public static int[] field1645 = new int[16384];

    @OriginalMember(owner = "client!cw", name = "G", descriptor = "Lus;")
    public static class328 field1655;

    @OriginalMember(owner = "client!cw", name = "H", descriptor = "Z")
    public static boolean field1656;

    @OriginalMember(owner = "client!cw", name = "I", descriptor = "S")
    public static short field1657;

    @OriginalMember(owner = "client!cw", name = "s", descriptor = "I")
    public static int field1641;

    @OriginalMember(owner = "client!cw", name = "t", descriptor = "I")
    public static int field1642;

    @OriginalMember(owner = "client!cw", name = "x", descriptor = "I")
    public static int field1646;

    @OriginalMember(owner = "client!cw", name = "z", descriptor = "I")
    public static int field1648;

    @OriginalMember(owner = "client!cw", name = "A", descriptor = "I")
    public static int field1649;

    @OriginalMember(owner = "client!cw", name = "E", descriptor = "I")
    public static int field1653;

    @OriginalMember(owner = "client!cw", name = "C", descriptor = "Ljava/lang/String;")
    public String field1651;

    @OriginalMember(owner = "client!cw", name = "y", descriptor = "[C")
    public char[] field1647;

    @OriginalMember(owner = "client!cw", name = "B", descriptor = "[C")
    public char[] field1650;

    @OriginalMember(owner = "client!cw", name = "u", descriptor = "[I")
    public int[] field1643;

    @OriginalMember(owner = "client!cw", name = "F", descriptor = "[I")
    public int[] field1654;

    @OriginalMember(owner = "client!cw", name = "D", descriptor = "[Ldia;")
    public static class673[] field1652;

    static {
        double var0 = 3.834951969714103E-4D;
        for (int var2 = 0; var2 < 16384; var2++) {
            field1644[var2] = (int) (Math.sin((double) var2 * var0) * 16384.0D);
            field1645[var2] = (int) (Math.cos((double) var2 * var0) * 16384.0D);
        }
        field1655 = new class328(35, 3);
        field1656 = false;
        field1657 = 1;
    }

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "(CI)I", line = 4)
    public final int method858(char arg0, int arg1) {
        field1653++;
        if (this.field1654 == null) {
            return -1;
        }
        for (int var3 = 0; var3 < this.field1654.length; var3++) {
            if (this.field1650[var3] == arg0) {
                return this.field1654[var3];
            }
        }
        if (arg1 != -15460) {
            this.field1647 = null;
        }
        return -1;
    }

    @OriginalMember(owner = "client!cw", name = "b", descriptor = "(I)V", line = 31)
    public final void method859(int arg0) {
        if (this.field1654 != null) {
            for (int var2 = 0; var2 < this.field1654.length; var2++) {
                this.field1654[var2] = class216.method1308(this.field1654[var2], 32768);
            }
        }
        field1641++;
        if (this.field1643 != null) {
            for (int var3 = 0; var3 < this.field1643.length; var3++) {
                this.field1643[var3] = class216.method1308(this.field1643[var3], 32768);
            }
        }
        if (arg0 >= -117) {
            this.method861(-76, null);
        }
    }

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "(CB)I", line = 59)
    public final int method860(char arg0, byte arg1) {
        if (arg1 != -62) {
            this.method863(null, 71, false);
        }
        field1642++;
        if (this.field1643 == null) {
            return -1;
        }
        for (int var3 = 0; var3 < this.field1643.length; var3++) {
            if (this.field1647[var3] == arg0) {
                return this.field1643[var3];
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "(ILtn;)V", line = 92)
    public final void method861(int arg0, class179 arg1) {
        field1648++;
        int var3 = 14 % ((arg0 - 11) / 48);
        while (true) {
            int var4 = arg1.method1094(255);
            if (var4 == 0) {
                return;
            }
            this.method863(arg1, var4, true);
        }
    }

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "(ZIIIII)V", line = 115)
    public static final void method862(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (class627.field8740 != null && (arg2 != 3 || class667.field9127 != arg4 || class169.field2233 != arg5)) {
            class171.method1069(-127, class681.field9312, class627.field8740);
            class627.field8740 = null;
        }
        field1649++;
        if (arg2 == 3 && class627.field8740 == null) {
            class627.field8740 = class676.method3634(0, arg4, 0, (byte) -76, arg5, class681.field9312);
            if (class627.field8740 != null) {
                class169.field2233 = arg5;
                class667.field9127 = arg4;
                class252.method1530((byte) 104);
            }
        }
        if (arg2 == 3 && class627.field8740 == null) {
            method862(true, -1, class223.field2944.field617.method3243((byte) -120), arg3, -1, -1);
            return;
        }
        Container var7;
        if (class627.field8740 != null) {
            class706.field9947 = arg5;
            var7 = class627.field8740;
            class538.field7556 = arg4;
        } else if (class95.field1205 == null) {
            if (class745.field10393 == null) {
                var7 = class689.field9789;
            } else {
                var7 = class745.field10393;
            }
            class538.field7556 = var7.getSize().width;
            class706.field9947 = var7.getSize().height;
        } else {
            Insets var6 = class95.field1205.getInsets();
            int var10001 = var6.left + var6.right;
            class538.field7556 = class95.field1205.getSize().width - var10001;
            class706.field9947 = class95.field1205.getSize().height - var6.bottom - var6.top;
            var7 = class95.field1205;
        }
        if (arg2 == 1) {
            class652.field8972 = 0;
            class599.field8320 = class303.field3896;
            class204.field2591 = (class538.field7556 - class303.field3896) / 2;
            class84.field1083 = class708.field9966;
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
        if (arg0) {
            class217.method1315((byte) -101);
        } else {
            class68.field939.setSize(class599.field8320, class84.field1083);
            if (class107.field1323) {
                class125.method812(class68.field939, (byte) 127);
            } else {
                class458.field6407.method151(class68.field939, class599.field8320, class84.field1083);
            }
            if (class95.field1205 == var7) {
                Insets var8 = class95.field1205.getInsets();
                class68.field939.setLocation(var8.left + class204.field2591, class652.field8972 + var8.top);
            } else {
                class68.field939.setLocation(class204.field2591, class652.field8972);
            }
        }
        if (arg2 < 2) {
            class501.field7062 = false;
        } else {
            class501.field7062 = true;
        }
        if (class638.field8834 != arg1) {
            class504.method2911(true, false);
        }
        if (class426.field6057 != null && class64.method489((byte) 127, class668.field9150)) {
            class438.method2587((byte) 91);
        }
        for (int var9 = 0; var9 < 100; var9++) {
            class709.field9971[var9] = true;
        }
        class336.field4342 = true;
    }

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "(Ltn;IZ)V", line = 269)
    private final void method863(class179 arg0, int arg1, boolean arg2) {
        field1646++;
        if (arg1 == 1) {
            this.field1651 = arg0.method1106(-1);
        } else if (arg1 == 2) {
            int var4 = arg0.method1094(255);
            this.field1643 = new int[var4];
            this.field1647 = new char[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field1643[var5] = arg0.method1107(false);
                byte var6 = arg0.method1133(8);
                this.field1647[var5] = var6 == 0 ? 0 : class219.method1370(var6, -126);
            }
        } else if (arg1 == 3) {
            int var7 = arg0.method1094(255);
            this.field1654 = new int[var7];
            this.field1650 = new char[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field1654[var8] = arg0.method1107(false);
                byte var9 = arg0.method1133(8);
                this.field1650[var8] = var9 == 0 ? 0 : class219.method1370(var9, -118);
            }
        }
        if (!arg2) {
            this.method863(null, -115, false);
        }
    }

    @OriginalMember(owner = "client!cw", name = "c", descriptor = "(I)V", line = 332)
    public static void method864(int arg0) {
        field1644 = null;
        field1655 = null;
        field1645 = null;
        field1652 = null;
        if (arg0 != 29291) {
            method864(-79);
        }
    }
}
