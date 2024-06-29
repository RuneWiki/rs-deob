import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dd")
public class class277 {

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "I")
    public static int field4353 = -1;

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "I")
    public static int field4354;

    @OriginalMember(owner = "client!dd", name = "c", descriptor = "I")
    public static int field4355;

    @OriginalMember(owner = "client!dd", name = "d", descriptor = "I")
    public static int field4356;

    @OriginalMember(owner = "client!dd", name = "e", descriptor = "I")
    public static int field4357;

    @OriginalMember(owner = "client!dd", name = "f", descriptor = "I")
    public static int field4358;

    @OriginalMember(owner = "client!dd", name = "g", descriptor = "I")
    public static int field4359;

    @OriginalMember(owner = "client!dd", name = "h", descriptor = "I")
    public static int field4360;

    @OriginalMember(owner = "client!dd", name = "i", descriptor = "I")
    public static int field4361;

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(Z)I", line = 4)
    public static final int method1978(boolean arg0) {
        field4357++;
        if (class31.field362 == 0) {
            return 0;
        } else if (arg0) {
            return class10.field94[class31.field362].method148();
        } else {
            return 110;
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;BILjava/lang/String;)V", line = 19)
    public static final void method1979(int arg0, String arg1, String arg2, byte arg3, int arg4, String arg5) {
        field4359++;
        if (arg3 >= -36) {
            return;
        }
        for (int var6 = 99; var6 > 0; var6--) {
            class182.field2737[var6] = class182.field2737[var6 - 1];
            class61.field724[var6] = class61.field724[var6 - 1];
            class252.field3998[var6] = class252.field3998[var6 - 1];
            class54.field617[var6] = class54.field617[var6 - 1];
            class254.field4025[var6] = class254.field4025[var6 - 1];
        }
        class64.field766++;
        class182.field2737[0] = arg4;
        class254.field4025[0] = arg0;
        class263.field4170 = class181.field2734;
        class61.field724[0] = arg1;
        class252.field3998[0] = arg5;
        class54.field617[0] = arg2;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(IIIIZIIIIII)V", line = 50)
    public static final void method1980(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        if (class11.field113.method412((byte) 79) == arg10) {
            class182.method1256(arg3, arg5, arg9, arg2, arg1, arg4, arg6, false, arg7, arg0, arg8);
        } else if (class11.field113.method412((byte) 96) > 2) {
            class300.method2119(arg1, arg4, arg3, arg5, arg9, arg2, arg0, class11.field113.method412((byte) 122), arg10 ^ 0xFFFFFF8B, arg6, arg8, arg7);
        } else {
            class347.method2407(arg8, arg10 ^ 0xFFFF93E9, arg4, arg2, arg3, arg0, arg1, arg5, arg9, arg7, arg6);
        }
        field4360++;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(Ljava/lang/String;Lnk;ZI)Lr;", line = 67)
    public static final class301 method1981(String arg0, class16 arg1, boolean arg2, int arg3) {
        if (arg3 > -91) {
            field4353 = 90;
        }
        field4354++;
        int var4 = arg1.method93(-118, arg0);
        if (var4 == -1) {
            return new class301(0);
        }
        int[] var5 = arg1.method120(var4, (byte) 120);
        class301 var6 = new class301(var5.length);
        int var7 = 0;
        int var8 = 0;
        while (true) {
            while (var7 < var6.field4701) {
                class143 var9 = new class143(arg1.method100(var4, var5[var8++], (byte) -107));
                int var10 = var9.method1057(-107);
                int var11 = var9.method1051(1);
                int var12 = var9.method1043(true);
                if (!arg2 && var12 == 1) {
                    var6.field4701--;
                } else {
                    var6.field4693[var7] = var10;
                    var6.field4697[var7] = new class182();
                    var6.field4697[var7].field2735 = var11;
                    var7++;
                }
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(IIIIII)V", line = 121)
    public static final void method1982(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = 0;
        field4361++;
        class278.method1986(arg4 - arg2, class347.field5501[arg1], arg5, arg2 + arg4, (byte) -100);
        int var7 = arg3;
        int var8 = arg2 * arg2;
        int var9 = arg3 * arg3;
        int var10 = var9 << 1;
        int var11 = var8 << 1;
        int var12 = arg3 << 1;
        if (arg0 != 7798) {
            method1982(35, -124, 50, 2, -49, -90);
        }
        int var13 = var9 - ((var12 - 1) * var11);
        int var14 = (1 - var12) * var8 + var10;
        int var15 = var8 << 2;
        int var16 = ((var6 << 1) + 3) * var10;
        int var17 = var9 << 2;
        int var18 = ((arg3 << 1) - 3) * var11;
        int var19 = (arg3 - 1) * var15;
        int var20 = (var6 + 1) * var17;
        while (var7 > 0) {
            var7--;
            if (var14 < 0) {
                while (var14 < 0) {
                    var13 += var20;
                    var6++;
                    var20 += var17;
                    var14 += var16;
                    var16 += var17;
                }
            }
            if (var13 < 0) {
                var14 += var16;
                var13 += var20;
                var20 += var17;
                var6++;
                var16 += var17;
            }
            var14 += -var19;
            var13 += -var18;
            int var21 = arg1 - var7;
            var19 -= var15;
            int var22 = arg1 + var7;
            var18 -= var15;
            int var23 = arg4 + var6;
            int var24 = arg4 - var6;
            class278.method1986(var24, class347.field5501[var21], arg5, var23, (byte) -62);
            class278.method1986(var24, class347.field5501[var22], arg5, var23, (byte) -80);
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(ILia;III)V", line = 213)
    public static final void method1983(int arg0, class234 arg1, int arg2, int arg3, int arg4) {
        field4358++;
        if (arg3 != 128) {
            method1982(27, -95, 0, -15, -14, -57);
        }
        for (class337 var5 = (class337) class250.field3968.method1812(arg3 ^ 0x81); var5 != null; var5 = (class337) class250.field3968.method1809(arg3)) {
            if (var5.field5394 == arg0 && (arg2 * 128) == var5.field5374 && (arg4 * 128) == var5.field5375 && var5.field5398.field3594 == arg1.field3594) {
                if (var5.field5386 != null) {
                    class20.field239.method2339(var5.field5386);
                    var5.field5386 = null;
                }
                if (var5.field5392 != null) {
                    class20.field239.method2339(var5.field5392);
                    var5.field5392 = null;
                }
                var5.method1290(97);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(BLhi;)V", line = 254)
    public static final void method1984(byte arg0, class323 arg1) {
        field4355++;
        if (arg0 != -116) {
            return;
        }
        class323 var2 = class76.method490(arg0 ^ 0x8ED6671C, arg1);
        int var3;
        int var4;
        if (var2 == null) {
            var3 = class165.field2546;
            var4 = class95.field1307;
        } else {
            var3 = var2.field5169;
            var4 = var2.field5174;
        }
        class281.method2034(var4, (byte) 96, var3, false, arg1);
        class324.method2256(arg1, 97, var3, var4);
    }
}
