import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cu")
public abstract class class202 extends class654 {

    @OriginalMember(owner = "client!cu", name = "g", descriptor = "[I")
    public static int[] field3269 = new int[] { 2047, 16383, 65535 };

    @OriginalMember(owner = "client!cu", name = "h", descriptor = "I")
    public static int field3270;

    @OriginalMember(owner = "client!cu", name = "i", descriptor = "I")
    public static int field3271;

    @OriginalMember(owner = "client!cu", name = "j", descriptor = "I")
    public static int field3272;

    @OriginalMember(owner = "client!cu", name = "c", descriptor = "(I)V")
    public static void method1566(int arg0) {
        field3269 = null;
        if (arg0 != 16383) {
            method1569(-16);
        }
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(Lpn;Z[[[BIB)Z")
    public static final boolean method1567(class692 arg0, boolean arg1, byte[][][] arg2, int arg3, byte arg4) {
        if (!class454.field6813) {
            return false;
        }
        int var5 = arg0.field9696 >> class439.field6699;
        int var6 = arg0.field9705 >> class439.field6699;
        if (var5 < class197.field3230 || var5 >= class391.field6123 || var6 < class16.field223 || var6 >= class414.field6349) {
            return true;
        } else if ((arg2 == null || arg0.field9695 < arg3 || arg2[arg0.field9695][var5][var6] != arg4) && arg0.method1474(-1) && !arg0.method1472(-125)) {
            return false;
        } else {
            if (!arg1 && var5 >= class325.field5056 - 16 && var5 <= class325.field5056 + 16 && var6 >= class542.field7902 - 16 && var6 <= class542.field7902 + 16) {
                if (class413.field6343) {
                    class235.field3744[class73.field923++].method2426(arg0, 7775);
                    class73.field923 %= class180.field3034;
                } else {
                    arg0.method412(class595.field8435, false);
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(IIII)I")
    public static final int method1568(int arg0, int arg1, int arg2, int arg3) {
        field3270++;
        if (arg3 != 2) {
            return -74;
        } else if (class587.field8346 == null) {
            return 0;
        } else {
            int var4 = arg0 >> 9;
            int var5 = arg2 >> 9;
            if (var4 < 0 || var5 < 0 || class275.field4426 - 1 < var4 || var5 > class417.field6374 - 1) {
                return 0;
            }
            int var6 = arg1;
            if (arg1 < 3 && (class690.field9676[1][var4][var5] & 0x2) != 0) {
                var6 = arg1 + 1;
            }
            return class587.field8346[var6].method477(arg3 - 3, arg2, arg0);
        }
    }

    @OriginalMember(owner = "client!cu", name = "d", descriptor = "(I)Lqn;")
    public abstract class58 method196(int arg0);

    @OriginalMember(owner = "client!cu", name = "e", descriptor = "(I)V")
    public static final void method1569(int arg0) {
        field3271++;
        class441 var1 = null;
        try {
            class701 var2 = class402.field6207.method3169(0, "3", false);
            if (arg0 != 120) {
                return;
            }
            while (var2.field9884 == 0) {
                class549.method3313(1L, 127);
            }
            if (var2.field9884 == 2) {
                throw new RuntimeException("Error opening file");
            }
            var1 = (class441) var2.field9885;
            byte[] var3 = new byte[(int) var1.method2789(0)];
            if (var3.length == 0) {
                class650.field9102 = "";
                class129.field2116 = "";
            } else {
                int var5;
                for (int var4 = 0; var4 < var3.length; var4 += var5) {
                    var5 = var1.method2790(var4, arg0 ^ 0xFFFFFF87, var3.length - var4, var3);
                    if (var5 == -1) {
                        throw new IOException("EOF");
                    }
                }
                class6 var6 = new class6(var3);
                int var7 = var6.method70(-9059);
                if (var7 > 120) {
                    throw new RuntimeException("Bad length");
                }
                var6.field57 = var7 + 1;
                if (!var6.method35(0)) {
                    throw new RuntimeException("Invalid CRC");
                }
                var6.field57 = 1;
                int var8 = var6.method70(-9059);
                if (var8 > 3) {
                    throw new RuntimeException("Invalid version " + var8);
                }
                class650.field9102 = var6.method58(arg0 ^ 0xFFFFB75F);
                class129.field2116 = var6.method58(-18649);
                if (var8 < 1) {
                    class665.field9428 = class611.field8698;
                } else {
                    class665.field9428 = var6.method67(arg0 + 11901);
                }
                if (var8 >= 2) {
                    class572.field8176 = var6.method69(1282265952);
                } else {
                    class572.field8176 = class73.field920;
                }
                if (var8 < 3) {
                    class348.field5576 = class154.field2630;
                } else if (var6.method70(-9059) == 1) {
                    class348.field5576 = var6.method58(arg0 ^ 0xFFFFB75F);
                } else {
                    class348.field5576 = null;
                }
            }
        } catch (Exception var10) {
            class650.field9102 = "";
            class129.field2116 = "";
        }
        try {
            if (var1 != null) {
                var1.method2785(arg0 ^ 0xFFFFF8B8);
            }
        } catch (Exception var9) {
        }
    }
}
