import java.io.File;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hu")
public class class668 extends class673 {

    @OriginalMember(owner = "client!hu", name = "E", descriptor = "Ljava/lang/Object;")
    private Object field9497;

    @OriginalMember(owner = "client!hu", name = "B", descriptor = "Ltk;")
    public static class73 field9495 = new class73();

    @OriginalMember(owner = "client!hu", name = "J", descriptor = "I")
    public static int field9502 = 1337;

    @OriginalMember(owner = "client!hu", name = "K", descriptor = "I")
    public static int field9503 = 1;

    @OriginalMember(owner = "client!hu", name = "C", descriptor = "I")
    public static int field9496;

    @OriginalMember(owner = "client!hu", name = "F", descriptor = "I")
    public static int field9498;

    @OriginalMember(owner = "client!hu", name = "G", descriptor = "I")
    public static int field9499;

    @OriginalMember(owner = "client!hu", name = "H", descriptor = "I")
    public static int field9500;

    @OriginalMember(owner = "client!hu", name = "I", descriptor = "I")
    public static int field9501;

    @OriginalMember(owner = "client!hu", name = "L", descriptor = "I")
    public static int field9504;

    @OriginalMember(owner = "client!hu", name = "h", descriptor = "(I)[Lbc;")
    public static final class607[] method3703(int arg0) {
        field9504++;
        return arg0 <= 101 ? null : new class607[] { class169.field2113, class380.field5454, class489.field6601 };
    }

    @OriginalMember(owner = "client!hu", name = "g", descriptor = "(I)Z")
    public final boolean method2206(int arg0) {
        field9496++;
        if (arg0 != -1842) {
            method3706(-123);
        }
        return false;
    }

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(Lmaa;Llb;BLoa;)V")
    public static final void method3704(class588 arg0, class679 arg1, byte arg2, class689 arg3) {
        field9499++;
        class424 var4 = arg1.method3754(arg3, (byte) -126);
        if (var4 == null) {
            return;
        }
        int var5 = var4.method1159();
        if (var4.method1154() > var5) {
            var5 = var4.method1154();
        }
        byte var6 = 10;
        int var7 = arg0.field8077;
        int var8 = arg0.field8081;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        if (arg1.field9633 != null) {
            var9 = class641.field8904.method3311(arg1.field9633, class411.field5759, null, null, 102);
            for (int var12 = 0; var12 < var9; var12++) {
                String var13 = class411.field5759[var12];
                if (var12 < var9 - 1) {
                    var13 = var13.substring(0, var13.length() - 4);
                }
                int var14 = class426.field5925.method3046(var13);
                if (var10 < var14) {
                    var10 = var14;
                }
            }
            var11 = class426.field5925.method3041() * var9 + class426.field5925.method3044() / 2;
        }
        int var15 = var5 / 2 + arg0.field8077;
        int var16 = arg0.field8081;
        if ((class561.field7663 + var5) > var7) {
            var15 = var10 / 2 + var5 / 2 + class561.field7663 + var6 + 5;
            var7 = class561.field7663;
        } else if (class561.field7664 - var5 < var7) {
            var15 = class561.field7664 - (var5 / 2) - (var10 / 2) - var6 - 5;
            var7 = class561.field7664 - var5;
        }
        if ((class561.field7670 + var5) > var8) {
            var16 = var5 / 2 + class561.field7670 + var6;
            var8 = class561.field7670;
        } else if (var8 > (class561.field7660 - var5)) {
            var16 = class561.field7660 - (var5 / 2) - var6 - var11;
            var8 = class561.field7660 - var5;
        }
        int var17 = (int) ((Math.atan2((double) (var7 - arg0.field8077), (double) (var8 - arg0.field8081)) / 3.141592653589793D) * 32767.0D) & 0xFFFF;
        var4.method2448((float) var5 / 2.0F + (float) var7, (float) var5 / 2.0F + (float) var8, 4096, var17);
        int var18 = 74 % ((-arg2 - 4) / 40);
        int var19 = -2;
        int var20 = -2;
        int var21 = -2;
        int var22 = -2;
        if (arg1.field9633 != null) {
            var20 = var16;
            var19 = var15 - (var10 / 2) - 5;
            var21 = var19 - (-var10 - 10);
            var22 = var16 + class426.field5925.method3041() * var9 + 3;
            if (arg1.field9637 != 0) {
                arg3.method3811(var16, var21 - var19, var22 - var16, var19, arg1.field9637, 77);
            }
            if (arg1.field9636 != 0) {
                arg3.method3819(var21 - var19, -4, var16, arg1.field9636, var19, var22 - var16);
            }
            for (int var23 = 0; var23 < var9; var23++) {
                String var24 = class411.field5759[var23];
                if (var23 < (var9 - 1)) {
                    var24 = var24.substring(0, var24.length() - 4);
                }
                class426.field5925.method3042(arg3, var24, var15, var16, arg1.field9619, true);
                var16 += class426.field5925.method3041();
            }
        }
        if (arg1.field9626 == -1 && arg1.field9633 == null) {
            return;
        }
        int var25 = var5 >> 1;
        class91 var26 = new class91(arg0);
        var26.field1119 = var20;
        var26.field1121 = var8 - var25;
        var26.field1120 = var7 + var25;
        var26.field1125 = var19;
        var26.field1122 = var8 + var25;
        var26.field1124 = var21;
        var26.field1110 = var7 - var25;
        var26.field1118 = var22;
        class626.field8524.method378(var26, 31316);
    }

    @OriginalMember(owner = "client!hu", name = "<init>", descriptor = "(Lrl;Ljava/lang/Object;I)V")
    public class668(class153 arg0, Object arg1, int arg2) {
        super(arg0, arg2);
        this.field9497 = arg1;
    }

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(IZ)Z")
    public static final boolean method3705(int arg0, boolean arg1) {
        field9498++;
        if (arg0 == 12 || arg0 == 60 || arg0 == 13 || arg0 == 51 || arg0 == 49) {
            return true;
        } else {
            if (arg1) {
                method3707(null, 39, null);
            }
            return arg0 == 57 || arg0 == 1004;
        }
    }

    @OriginalMember(owner = "client!hu", name = "c", descriptor = "(B)Ljava/lang/Object;")
    public final Object method2207(byte arg0) {
        field9500++;
        int var2 = 49 % ((arg0 - 1) / 54);
        return this.field9497;
    }

    @OriginalMember(owner = "client!hu", name = "i", descriptor = "(I)V")
    public static void method3706(int arg0) {
        if (arg0 != -5) {
            method3707(null, 70, null);
        }
        field9495 = null;
    }

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(Ljava/lang/String;ILjava/io/File;)V")
    public static final void method3707(String arg0, int arg1, File arg2) {
        field9501++;
        if (arg1 == 2) {
            class285.field3858.put(arg0, arg2);
        }
    }
}
