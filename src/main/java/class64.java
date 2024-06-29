import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public abstract class class64 extends class176 {

    @OriginalMember(owner = "client!u", name = "q", descriptor = "I")
    public static int field1097 = 0;

    @OriginalMember(owner = "client!u", name = "n", descriptor = "Lej;")
    public static class104 field1094 = new class104("Examine", "Untersuchen", "Examiner", "Examinar");

    @OriginalMember(owner = "client!u", name = "r", descriptor = "Lcba;")
    public static class471 field1098 = new class471(113, 2);

    @OriginalMember(owner = "client!u", name = "m", descriptor = "I")
    public static int field1093;

    @OriginalMember(owner = "client!u", name = "o", descriptor = "I")
    public static int field1095;

    @OriginalMember(owner = "client!u", name = "p", descriptor = "I")
    public static int field1096;

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(IBI)Z")
    public static final boolean method541(int arg0, byte arg1, int arg2) {
        if (arg1 != 32) {
            method543(null, 82);
        }
        field1095++;
        return (arg0 & 0x60000) != 0 | class342.method2077(arg0, arg1 + 93, arg2) || class446.method2632(arg2, arg0, true);
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(I)V")
    public static void method542(int arg0) {
        field1098 = null;
        if (arg0 != 5123) {
            method543(null, 96);
        }
        field1094 = null;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(Lge;I)I")
    public static final int method543(class608 arg0, int arg1) {
        field1096++;
        if (class608.field8756 == arg0) {
            return 5120;
        } else if (class608.field8757 == arg0) {
            return 5122;
        } else if (class608.field8758 == arg0) {
            return 5124;
        } else if (class608.field8759 == arg0) {
            return 5121;
        } else if (class608.field8760 == arg0) {
            return 5123;
        } else if (class608.field8761 == arg0) {
            return 5125;
        } else if (class608.field8762 == arg0) {
            return 5131;
        } else if (class608.field8763 == arg0) {
            return 5126;
        } else if (arg1 == 113) {
            throw new IllegalArgumentException("");
        } else {
            return -25;
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(B)I")
    public static final int method544(byte arg0) {
        field1093++;
        if (class137.field2159 == null) {
            if (!class483.field6820 && class210.field2958 > 0) {
                if (class304.field4149 && class316.field4245.method2691(81, 19521) && class210.field2958 > 2) {
                    return ((class442) class448.field6352.field892.field2519.field2519).field6299;
                }
                return ((class442) class448.field6352.field892.field2519).field6299;
            }
            int var1 = class602.field8697.method2153((byte) 83);
            int var2 = class602.field8697.method2152(0);
            int var3 = class166.field2389;
            int var4 = class467.field6582;
            int var5 = class228.field3256;
            if (var3 < var1 && var1 < (var3 + var5)) {
                int var6 = -1;
                for (int var7 = 0; var7 < class210.field2958; var7++) {
                    if (class379.field5098) {
                        int var12 = var4 + ((class210.field2958 - var7 + -1) * 16) + 33;
                        if (var2 > (var12 - 13) && (var12 + 3) >= var2) {
                            var6 = var7;
                        }
                    } else {
                        int var11 = (class210.field2958 - var7 - 1) * 16 + var4 + 31;
                        if (var11 - 13 < var2 && (var11 + 3) >= var2) {
                            var6 = var7;
                        }
                    }
                }
                if (var6 != -1) {
                    int var8 = 0;
                    class591 var9 = new class591(class448.field6352);
                    for (class442 var10 = (class442) var9.method3464(-86); var10 != null; var10 = (class442) var9.method3466((byte) 53)) {
                        if (var6 == var8++) {
                            return var10.field6299;
                        }
                    }
                }
            }
        }
        return arg0 >= -61 ? 73 : -1;
    }
}
