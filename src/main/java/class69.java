import java.awt.Component;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ee")
public class class69 {

    @OriginalMember(owner = "client!ee", name = "c", descriptor = "[B")
    public static byte[] field1165 = new byte[520];

    @OriginalMember(owner = "client!ee", name = "e", descriptor = "I")
    public static int field1167 = 0;

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "I")
    public static int field1163;

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "I")
    public static int field1164;

    @OriginalMember(owner = "client!ee", name = "d", descriptor = "I")
    public static int field1166;

    @OriginalMember(owner = "client!ee", name = "f", descriptor = "I")
    public static int field1168;

    @OriginalMember(owner = "client!ee", name = "g", descriptor = "I")
    public static int field1169;

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(Lkj;I)V")
    public static final void method537(class114 arg0, int arg1) {
        field1164++;
        if (arg1 != 0) {
            return;
        }
        class114 var2 = class28.method244(arg0, (byte) -122);
        int var3;
        int var4;
        if (var2 == null) {
            var3 = class137.field2301;
            var4 = class33.field557;
        } else {
            var4 = var2.field1919;
            var3 = var2.field1790;
        }
        class136.method1001(false, var3, var4, 2, arg0);
        class269.method1828((byte) 0, var3, arg0, var4);
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(ILjava/awt/Component;)V")
    public static final void method538(int arg0, Component arg1) {
        field1166++;
        Method var2 = class78.field1308;
        if (var2 != null) {
            try {
                var2.invoke(arg1, Boolean.FALSE);
            } catch (Throwable var3) {
            }
        }
        arg1.addKeyListener(class229.field3651);
        if (arg0 != -30739) {
            method537((class114) null, 88);
        }
        arg1.addFocusListener(class229.field3651);
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(I)V")
    public static void method539(int arg0) {
        field1165 = null;
        if (arg0 != -5584) {
            field1165 = null;
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(IIIIII)V")
    public static final void method540(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field1163++;
        int var6 = 0;
        int var7 = arg2 * arg2;
        int var8 = arg2;
        int var9 = arg1 * arg1;
        int var10 = var7 << 1;
        int var11 = var9 << 1;
        int var12 = arg2 << 1;
        int var13 = (1 - var12) * var9 + var10;
        int var14 = var7 << 2;
        if (arg4 != 520) {
            field1167 = -34;
        }
        int var15 = var7 - (var12 - 1) * var11;
        int var16 = ((var6 << 1) + 3) * var10;
        int var17 = var9 << 2;
        int var18 = ((arg2 << 1) - 3) * var11;
        if (arg0 >= class108.field1650 && arg0 <= class154.field2509) {
            int var19 = class32.method278(class32.field540, arg4 ^ 0x209, class61.field1034, arg3 + arg1);
            int var20 = class32.method278(class32.field540, 1, class61.field1034, arg3 - arg1);
            class224.method1504(arg5, var19, var20, class114.field1841[arg0], 7);
        }
        int var21 = (arg2 - 1) * var17;
        int var22 = (var6 + 1) * var14;
        while (var8 > 0) {
            var8--;
            if (var13 < 0) {
                while (var13 < 0) {
                    var6++;
                    var15 += var22;
                    var13 += var16;
                    var16 += var14;
                    var22 += var14;
                }
            }
            if (var15 < 0) {
                var6++;
                var13 += var16;
                var15 += var22;
                var22 += var14;
                var16 += var14;
            }
            int var23 = arg0 - var8;
            var13 += -var21;
            var21 -= var17;
            var15 += -var18;
            var18 -= var17;
            int var24 = arg0 + var8;
            if (var24 >= class108.field1650 && var23 <= class154.field2509) {
                int var25 = class32.method278(class32.field540, 1, class61.field1034, arg3 + var6);
                int var26 = class32.method278(class32.field540, 1, class61.field1034, arg3 - var6);
                if (class108.field1650 <= var23) {
                    class224.method1504(arg5, var25, var26, class114.field1841[var23], 7);
                }
                if (class154.field2509 >= var24) {
                    class224.method1504(arg5, var25, var26, class114.field1841[var24], arg4 ^ 0x20F);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(ILjava/lang/String;)I")
    public static final int method541(int arg0, String arg1) {
        field1168++;
        if (arg0 != 10743) {
            return -103;
        }
        for (int var2 = 0; var2 < class194.field3170.length; var2++) {
            if (class194.field3170[var2].equalsIgnoreCase(arg1)) {
                return var2;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(Lsb;B)V")
    public static final void method542(class124 arg0, byte arg1) {
        class196.field3210 = arg0;
        if (arg1 <= -96) {
            field1169++;
        }
    }
}
