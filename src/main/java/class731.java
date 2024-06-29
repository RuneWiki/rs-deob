import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fc")
public class class731 extends class513 {

    @OriginalMember(owner = "client!fc", name = "o", descriptor = "Lfha;")
    public class522 field10232 = new class522();

    @OriginalMember(owner = "client!fc", name = "n", descriptor = "[I")
    public static int[] field10231 = new int[1024];

    @OriginalMember(owner = "client!fc", name = "k", descriptor = "I")
    public static int field10228;

    @OriginalMember(owner = "client!fc", name = "l", descriptor = "I")
    public static int field10229;

    @OriginalMember(owner = "client!fc", name = "m", descriptor = "I")
    public static int field10230;

    @OriginalMember(owner = "client!fc", name = "p", descriptor = "I")
    public static int field10233;

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(III)Z")
    public static final boolean method4068(int arg0, int arg1, int arg2) {
        field10233++;
        if (arg1 != -210571632) {
            method4068(116, 80, -81);
        }
        return (class311.method1818(arg0, arg2, false) | class644.method3732(arg2, arg0, true) | class175.method1102(arg2, 0, arg0)) & class40.method267(arg2, arg1 ^ 0xF372EE90, arg0);
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(ILow;ZI)Lnfa;")
    public static final class228 method4069(int arg0, class747 arg1, boolean arg2, int arg3) {
        field10230++;
        int var4 = arg0 << 10 | arg1.field10405;
        class228 var5 = (class228) class8.field80.method2761((byte) 88, (long) var4 << 16);
        if (var5 != null) {
            return var5;
        } else if (arg2) {
            return null;
        } else {
            byte[] var6 = class300.field3919.method3318(8941, class300.field3919.method3339(var4, (byte) 120));
            if (var6 == null) {
                int var9 = arg1.field10405 | arg3 + 65536 << 10;
                class228 var10 = (class228) class8.field80.method2761((byte) 101, (long) var9 << 16);
                if (var10 != null) {
                    return var10;
                }
                byte[] var11 = class300.field3919.method3318(8941, class300.field3919.method3339(var9, (byte) 9));
                if (var11 == null) {
                    int var14 = arg1.field10405 | 0x3FFFC00;
                    class228 var15 = (class228) class8.field80.method2761((byte) 109, (long) var14 << 16);
                    if (var15 != null) {
                        return var15;
                    }
                    byte[] var16 = class300.field3919.method3318(8941, class300.field3919.method3339(var14, (byte) 31));
                    if (var16 == null) {
                        return null;
                    } else if (var16.length <= 1) {
                        return null;
                    } else {
                        class228 var17;
                        try {
                            var17 = class621.method3635(-40, var16);
                        } catch (Exception var21) {
                            throw new RuntimeException(var21.getMessage() + " S: " + var14);
                        }
                        var17.field3172 = arg1;
                        class8.field80.method2764((long) var14 << 16, var17, -4900);
                        return var17;
                    }
                } else if (var11.length <= 1) {
                    return null;
                } else {
                    class228 var12;
                    try {
                        var12 = class621.method3635(-40, var11);
                    } catch (Exception var20) {
                        throw new RuntimeException(var20.getMessage() + " S: " + var9);
                    }
                    var12.field3172 = arg1;
                    class8.field80.method2764((long) var9 << 16, var12, -4900);
                    return var12;
                }
            } else if (var6.length <= 1) {
                return null;
            } else {
                class228 var7;
                try {
                    var7 = class621.method3635(-40, var6);
                } catch (Exception var19) {
                    throw new RuntimeException(var19.getMessage() + " S: " + var4);
                }
                var7.field3172 = arg1;
                class8.field80.method2764((long) var4 << 16, var7, -4900);
                return var7;
            }
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(Z)V")
    public static void method4070(boolean arg0) {
        field10231 = null;
        if (!arg0) {
            method4069(83, null, true, 58);
        }
    }
}
