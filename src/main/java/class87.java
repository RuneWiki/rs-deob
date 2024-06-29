import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aha")
public class class87 {

    @OriginalMember(owner = "client!aha", name = "a", descriptor = "I")
    public static int field1254;

    @OriginalMember(owner = "client!aha", name = "b", descriptor = "I")
    public static int field1255;

    @OriginalMember(owner = "client!aha", name = "a", descriptor = "(IIB)Z")
    public static final boolean method688(int arg0, int arg1, byte arg2) {
        field1254++;
        if (arg2 != 34) {
            method688(70, 40, (byte) -50);
        }
        return (arg0 & 0x84080) != 0;
    }

    @OriginalMember(owner = "client!aha", name = "a", descriptor = "(Ljw;IIIII)V")
    public static final void method689(class280 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var6 = true;
        int var7 = arg2;
        int var8 = arg2 + arg4;
        int var9 = arg3 - 1;
        int var10 = arg3 + arg5;
        for (int var11 = arg1; var11 <= arg1 + 1; var11++) {
            if (class433.field6202 != var11) {
                for (int var12 = var7; var12 <= var8; var12++) {
                    if (var12 >= 0 && var12 < class439.field6264) {
                        for (int var13 = var9; var13 <= var10; var13++) {
                            if (var13 >= 0 && var13 < class408.field5806 && (!var6 || var12 >= var8 || var13 >= var10 || var13 < arg3 && arg2 != var12)) {
                                class375 var14 = class565.field8185[var11][var12][var13];
                                if (var14 != null) {
                                    int var15 = (class95.field1372[var11].method2087(45, var12, var13) + class95.field1372[var11].method2087(106, var12 + 1, var13) + class95.field1372[var11].method2087(96, var12, var13 + 1) + class95.field1372[var11].method2087(66, var12 + 1, var13 + 1)) / 4 - (class95.field1372[arg1].method2087(54, arg2, arg3) + class95.field1372[arg1].method2087(62, arg2 + 1, arg3) + class95.field1372[arg1].method2087(43, arg2, arg3 + 1) + class95.field1372[arg1].method2087(118, arg2 + 1, arg3 + 1)) / 4;
                                    class19 var16 = var14.field5431;
                                    class19 var17 = var14.field5427;
                                    if (var16 != null && var16.method715(-12888)) {
                                        arg0.method711((var12 - arg2) * class150.field2190 + (1 - arg4) * class231.field3477, var16, class391.field5644, (byte) 101, var15, var6, (var13 - arg3) * class150.field2190 + (1 - arg5) * class231.field3477);
                                    }
                                    if (var17 != null && var17.method715(-12888)) {
                                        arg0.method711((var12 - arg2) * class150.field2190 + (1 - arg4) * class231.field3477, var17, class391.field5644, (byte) 39, var15, var6, (var13 - arg3) * class150.field2190 + (1 - arg5) * class231.field3477);
                                    }
                                    for (class208 var18 = var14.field5425; var18 != null; var18 = var18.field3146) {
                                        class638 var19 = var18.field3144;
                                        if (var19 != null && var19.method715(-12888) && (var19.field9038 == var12 || var7 == var12) && (var19.field9035 == var13 || var9 == var13)) {
                                            int var20 = var19.field9036 + 1 - var19.field9038;
                                            int var21 = var19.field9042 + 1 - var19.field9035;
                                            arg0.method711((var19.field9038 - arg2) * class150.field2190 + (var20 - arg4) * class231.field3477, var19, class391.field5644, (byte) 121, var15, var6, (var19.field9035 - arg3) * class150.field2190 + (var21 - arg5) * class231.field3477);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                var7--;
                var6 = false;
            }
        }
    }

    @OriginalMember(owner = "client!aha", name = "a", descriptor = "(ZII)Z")
    public static final boolean method690(boolean arg0, int arg1, int arg2) {
        if (arg0) {
            return true;
        }
        field1255++;
        class482 var3 = class375.field5421.method2680(arg1, (byte) 123);
        if (arg2 == 11) {
            arg2 = 10;
        }
        if (arg2 >= 5 && arg2 <= 8) {
            arg2 = 4;
        }
        return var3.method2944(78, arg2);
    }
}
