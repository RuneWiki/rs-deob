import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ij")
public class class274 {

    @OriginalMember(owner = "client!ij", name = "g", descriptor = "Lqd;")
    public static class173 field4404 = new class173(64);

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "I")
    public static int field4398;

    @OriginalMember(owner = "client!ij", name = "b", descriptor = "I")
    public static int field4399;

    @OriginalMember(owner = "client!ij", name = "d", descriptor = "I")
    public static int field4401;

    @OriginalMember(owner = "client!ij", name = "e", descriptor = "I")
    public static int field4402;

    @OriginalMember(owner = "client!ij", name = "f", descriptor = "I")
    public static int field4403;

    @OriginalMember(owner = "client!ij", name = "h", descriptor = "I")
    public static int field4405;

    @OriginalMember(owner = "client!ij", name = "c", descriptor = "Lag;")
    public static class211 field4400;

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(I)Lwd;")
    public static final class162 method1834(int arg0) {
        field4402++;
        class162 var1 = new class162(34);
        var1.method1108(11, true);
        var1.method1108(class77.field1289, true);
        var1.method1108(class26.field328 ? 1 : 0, true);
        var1.method1108(class86.field1419 ? 1 : 0, true);
        var1.method1108(class100.field1609 ? 1 : 0, true);
        var1.method1108(class1.field15 ? 1 : 0, true);
        var1.method1108(class100.field1624 ? 1 : 0, true);
        var1.method1108(class42.field610 ? 1 : 0, true);
        var1.method1108(class262.field4210 ? 1 : 0, true);
        var1.method1108(class165.field2656 ? 1 : 0, true);
        var1.method1108(class188.field3051, true);
        var1.method1108(class126.field1996 ? 1 : 0, true);
        var1.method1108(class66.field1101 ? 1 : 0, true);
        var1.method1108(class239.field3831 ? 1 : 0, true);
        var1.method1108(class206.field3282, true);
        var1.method1108(class247.field3931 ? 1 : 0, true);
        var1.method1108(class183.field3011, true);
        if (arg0 != 1) {
            method1835((class203) null, (byte) 96, -128, false, true, (class203) null, 125);
        }
        var1.method1108(class214.field3548, true);
        var1.method1108(class32.field481, true);
        var1.method1120(class34.field518, true);
        var1.method1120(class123.field1959, true);
        var1.method1108(class171.method1244(), true);
        var1.method1125(class145.field2293, 255);
        var1.method1108(class229.field3704, true);
        var1.method1108(class294.field4713 ? 1 : 0, true);
        var1.method1108(class144.field2281 ? 1 : 0, true);
        var1.method1108(class312.field4979, true);
        var1.method1108(class51.field858 ? 1 : 0, true);
        var1.method1108(class47.field786 ? 1 : 0, true);
        return var1;
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(Lsk;BIZZLsk;I)I")
    public static final int method1835(class203 arg0, byte arg1, int arg2, boolean arg3, boolean arg4, class203 arg5, int arg6) {
        field4405++;
        int var7 = class265.method1787(arg6, arg0, arg5, (byte) -109, arg4);
        if (var7 != 0) {
            return arg4 ? -var7 : var7;
        } else if (arg2 == -1) {
            return 0;
        } else {
            if (arg1 != -97) {
                field4400 = null;
            }
            int var8 = class265.method1787(arg2, arg0, arg5, (byte) -109, arg3);
            return arg3 ? -var8 : var8;
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(Ljava/lang/String;I)V")
    public static final void method1836(String arg0, int arg1) {
        field4398++;
        if (arg0 == null) {
            return;
        }
        String var2 = class310.method2071(arg1 - 43070, arg0);
        if (var2 == null) {
            return;
        }
        for (int var3 = 0; var3 < class169.field2755; var3++) {
            String var4 = class310.method2071(-28047, class263.field4224[var3]);
            if (var4 != null && var4.equals(var2)) {
                class304.field4871++;
                class169.field2755--;
                for (int var5 = var3; var5 < class169.field2755; var5++) {
                    class263.field4224[var5] = class263.field4224[var5 + 1];
                    class79.field1314[var5] = class79.field1314[var5 + 1];
                    class214.field3549[var5] = class214.field3549[var5 + 1];
                }
                class205.field3264 = class74.field1237;
                class314.field5061.method828(arg1 - 14901, 121);
                class314.field5061.method1108(class230.method1551(arg0, (byte) -87), true);
                class314.field5061.method1148((byte) -99, arg0);
                break;
            }
        }
        if (arg1 != 15023) {
            method1837((byte) 58);
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(B)V")
    public static void method1837(byte arg0) {
        if (arg0 == -58) {
            field4404 = null;
            field4400 = null;
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(IZLlc;IBI)V")
    public static final void method1838(int arg0, boolean arg1, class307 arg2, int arg3, byte arg4, int arg5) {
        field4399++;
        if (class195.field3163 >= 50) {
            return;
        }
        if (arg4 >= -104) {
            method1838(-92, false, (class307) null, 91, (byte) -37, 33);
        }
        if (arg2 == null || arg2.field4899 == null || arg3 >= arg2.field4899.length || arg2.field4899[arg3] == null) {
            return;
        }
        int var6 = arg2.field4899[arg3][0];
        int var7 = var6 >> 8;
        int var8 = var6 >> 5 & 0x7;
        int var9 = var6 & 0x1F;
        if (arg2.field4899[arg3].length > 1) {
            int var10 = (int) ((double) arg2.field4899[arg3].length * Math.random());
            if (var10 > 0) {
                var7 = arg2.field4899[arg3][var10];
            }
        }
        if (var9 == 0) {
            if (arg1) {
                class272.method1818(68, 0, 255, var7, var8);
            }
        } else if (class32.field481 != 0) {
            class199.field3203[class195.field3163] = var7;
            class4.field47[class195.field3163] = var8;
            int var11 = (arg5 - 64) / 128;
            class291.field4678[class195.field3163] = 0;
            class30.field371[class195.field3163] = null;
            class126.field1995[class195.field3163] = 255;
            int var12 = (arg0 - 64) / 128;
            class11.field118[class195.field3163] = (var11 << 16) + (var12 << 8) + var9;
            class195.field3163++;
        }
    }
}
