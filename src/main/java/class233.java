import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!p")
public class class233 {

    @OriginalMember(owner = "client!p", name = "a", descriptor = "Lqc;")
    private class325 field3432 = new class325(64);

    @OriginalMember(owner = "client!p", name = "d", descriptor = "Ldda;")
    private class597 field3435;

    @OriginalMember(owner = "client!p", name = "e", descriptor = "Ldda;")
    private class597 field3436;

    @OriginalMember(owner = "client!p", name = "c", descriptor = "Lgu;")
    public static class126 field3434 = new class126();

    @OriginalMember(owner = "client!p", name = "b", descriptor = "I")
    public static int field3433;

    @OriginalMember(owner = "client!p", name = "g", descriptor = "I")
    public static int field3438;

    @OriginalMember(owner = "client!p", name = "h", descriptor = "I")
    public static int field3439;

    @OriginalMember(owner = "client!p", name = "f", descriptor = "[I")
    public static int[] field3437;

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(I)V", line = 13)
    public static void method1516(int arg0) {
        field3434 = null;
        if (arg0 >= 65) {
            field3437 = null;
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(ZI)Lce;", line = 25)
    public final class405 method1517(boolean arg0, int arg1) {
        field3433++;
        class405 var3 = (class405) this.field3432.method2025((long) arg1, 2);
        if (var3 != null) {
            return var3;
        }
        byte[] var4;
        if (arg1 >= 32768) {
            var4 = this.field3436.method3486((byte) -89, arg1 & 0x7FFF, 0);
        } else {
            var4 = this.field3435.method3486((byte) -107, arg1, 0);
        }
        class405 var5 = new class405();
        if (var4 != null) {
            var5.method2426(new class428(var4), (byte) -104);
        }
        if (!arg0) {
            method1519(-52, -104, (byte) -124);
        }
        if (arg1 >= 32768) {
            var5.method2429(-102);
        }
        this.field3432.method2029(false, var5, (long) arg1);
        return var5;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(Ljava/lang/String;B)I", line = 63)
    public static final int method1518(String arg0, byte arg1) {
        if (arg1 > -121) {
            field3437 = null;
        }
        field3438++;
        return class640.method3705(arg0, -91, true, 10);
    }

    @OriginalMember(owner = "client!p", name = "<init>", descriptor = "(ILdda;Ldda;)V", line = 156)
    public class233(int arg0, class597 arg1, class597 arg2) {
        this.field3435 = arg1;
        this.field3436 = arg2;
        if (this.field3435 != null) {
            this.field3435.method3462(0, -58);
        }
        if (this.field3436 != null) {
            this.field3436.method3462(0, -74);
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(IIB)Z", line = 89)
    public static final boolean method1519(int arg0, int arg1, byte arg2) {
        field3439++;
        if (!class139.field1826) {
            return false;
        }
        int var3 = arg0 >> 16;
        int var4 = arg0 & 0xFFFF;
        if (class251.field3650[var3] == null || class251.field3650[var3][var4] == null) {
            return false;
        }
        class311 var5 = class251.field3650[var3][var4];
        if (arg1 == -1 && var5.field4655 == 0) {
            for (class548 var6 = (class548) class272.field4014.method2496((byte) -103); var6 != null; var6 = (class548) class272.field4014.method2494(81)) {
                if (var6.field8163 == 15 || var6.field8163 == 1001 || var6.field8163 == 18 || var6.field8163 == 2 || var6.field8163 == 13) {
                    for (class311 var7 = class436.method2659(true, var6.field8166); var7 != null; var7 = class272.method1723(arg2 ^ 0xFFFFFFB8, var7)) {
                        if (var5.field4667 == var7.field4667) {
                            return true;
                        }
                    }
                }
            }
        } else {
            for (class548 var8 = (class548) class272.field4014.method2496((byte) -104); var8 != null; var8 = (class548) class272.field4014.method2494(125)) {
                if (var8.field8168 == arg1 && var5.field4667 == var8.field8166 && (var8.field8163 == 15 || var8.field8163 == 1001 || var8.field8163 == 18 || var8.field8163 == 2 || var8.field8163 == 13)) {
                    return true;
                }
            }
        }
        if (arg2 != 71) {
            field3437 = null;
        }
        return false;
    }
}
