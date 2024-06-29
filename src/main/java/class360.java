import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rc")
public class class360 {

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "Loe;")
    public static class127 field5325 = new class127(94, -1);

    @OriginalMember(owner = "client!rc", name = "g", descriptor = "I")
    public static int field5330 = 0;

    @OriginalMember(owner = "client!rc", name = "i", descriptor = "[S")
    public static short[] field5332 = new short[] { 960, 957, -21568, -21571, 22464 };

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "I")
    public static int field5324;

    @OriginalMember(owner = "client!rc", name = "c", descriptor = "I")
    public int field5326;

    @OriginalMember(owner = "client!rc", name = "d", descriptor = "I")
    public int field5327;

    @OriginalMember(owner = "client!rc", name = "e", descriptor = "I")
    public int field5328;

    @OriginalMember(owner = "client!rc", name = "f", descriptor = "I")
    public int field5329;

    @OriginalMember(owner = "client!rc", name = "h", descriptor = "I")
    public static int field5331;

    // $FF: synthetic field
    @OriginalMember(owner = "client!rc", name = "j", descriptor = "Ljava/lang/Class;")
    public static Class field5333;

    // $FF: synthetic method
    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method2194(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(I)V", line = 8)
    public static void method2192(int arg0) {
        field5325 = null;
        field5332 = null;
        if (arg0 != 4) {
            method2193(-4, 4, -112, null, 17, -127, 46, -123, -118);
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(IIILqq;IIIII)V", line = 25)
    public static final void method2193(int arg0, int arg1, int arg2, class318 arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field5324++;
        class185 var9 = (class185) class307.method1842(arg4, arg5, arg0);
        int var10 = 52 % ((36 - arg2) / 48);
        if (var9 != null) {
            class56 var11 = class128.field2070.method916((byte) -15, var9.method174((byte) 115));
            int var12 = var9.method173(1438) & 0x3;
            int var13 = var9.method170(true);
            if (var11.field902 == -1) {
                int var14 = arg6;
                if (var11.field895 > 0) {
                    var14 = arg7;
                }
                if (var13 == 0 || var13 == 2) {
                    if (var12 == 0) {
                        arg3.method1946(arg1, arg8, var14, 123, 4);
                    } else if (var12 == 1) {
                        arg3.method1889(arg8, var14, -75, 4, arg1);
                    } else if (var12 == 2) {
                        arg3.method1946(arg1 + 3, arg8, var14, -93, 4);
                    } else if (var12 == 3) {
                        arg3.method1889(arg8 + 3, var14, -80, 4, arg1);
                    }
                }
                if (var13 == 3) {
                    if (var12 == 0) {
                        arg3.method1943(arg1, var14, arg8, 1, 1, 1);
                    } else if (var12 == 1) {
                        arg3.method1943(arg1 + 3, var14, arg8, 1, 1, 1);
                    } else if (var12 == 2) {
                        arg3.method1943(arg1 + 3, var14, arg8 + 3, 1, 1, 1);
                    } else if (var12 == 3) {
                        arg3.method1943(arg1, var14, arg8 + 3, 1, 1, 1);
                    }
                }
                if (var13 == 2) {
                    if (var12 == 0) {
                        arg3.method1889(arg8, var14, -41, 4, arg1);
                    } else if (var12 == 1) {
                        arg3.method1946(arg1 + 3, arg8, var14, 104, 4);
                    } else if (var12 == 2) {
                        arg3.method1889(arg8 + 3, var14, -47, 4, arg1);
                    } else if (var12 == 3) {
                        arg3.method1946(arg1, arg8, var14, -104, 4);
                    }
                }
            } else {
                class487.method2925(var11, -12565, arg8, arg1, var12, arg3);
            }
        }
        class185 var15 = (class185) class86.method607(arg4, arg5, arg0, field5333 == null ? (field5333 = method2194("tf")) : field5333);
        if (var15 != null) {
            class56 var16 = class128.field2070.method916((byte) -15, var15.method174((byte) 120));
            int var17 = var15.method173(1438) & 0x3;
            int var18 = var15.method170(true);
            if (var16.field902 != -1) {
                class487.method2925(var16, -12565, arg8, arg1, var17, arg3);
            } else if (var18 == 9) {
                int var19 = -1118482;
                if (var16.field895 > 0) {
                    var19 = -1179648;
                }
                if (var17 == 0 || var17 == 2) {
                    arg3.method1935(arg8 + 3, arg1 + 3, 1, arg8, var19, arg1);
                } else {
                    arg3.method1935(arg8, arg1 + 3, 1, arg8 + 3, var19, arg1);
                }
            }
        }
        class185 var20 = (class185) class368.method2232(arg4, arg5, arg0);
        if (var20 == null) {
            return;
        }
        class56 var21 = class128.field2070.method916((byte) -15, var20.method174((byte) 121));
        int var22 = var20.method173(1438) & 0x3;
        if (var21.field902 != -1) {
            class487.method2925(var21, -12565, arg8, arg1, var22, arg3);
            return;
        }
    }
}
