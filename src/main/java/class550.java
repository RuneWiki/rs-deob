import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sha")
public class class550 {

    @OriginalMember(owner = "client!sha", name = "e", descriptor = "Lgw;")
    private class690 field7645 = new class690(128);

    @OriginalMember(owner = "client!sha", name = "j", descriptor = "Luu;")
    private class237 field7650;

    @OriginalMember(owner = "client!sha", name = "c", descriptor = "I")
    public static int field7643 = 0;

    @OriginalMember(owner = "client!sha", name = "k", descriptor = "Lww;")
    public static class288 field7651 = new class288(5, 1);

    @OriginalMember(owner = "client!sha", name = "l", descriptor = "I")
    public static int field7652 = -1;

    @OriginalMember(owner = "client!sha", name = "a", descriptor = "F")
    public static float field7641;

    @OriginalMember(owner = "client!sha", name = "b", descriptor = "I")
    public static int field7642;

    @OriginalMember(owner = "client!sha", name = "d", descriptor = "I")
    public static int field7644;

    @OriginalMember(owner = "client!sha", name = "f", descriptor = "I")
    public static int field7646;

    @OriginalMember(owner = "client!sha", name = "g", descriptor = "I")
    public static int field7647;

    @OriginalMember(owner = "client!sha", name = "h", descriptor = "I")
    public static int field7648;

    @OriginalMember(owner = "client!sha", name = "i", descriptor = "[Ls;")
    public static class341[] field7649;

    @OriginalMember(owner = "client!sha", name = "a", descriptor = "(IBIIIILni;Lni;II)V")
    public static final void method3260(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, class515 arg6, class515 arg7, int arg8, int arg9) {
        field7644++;
        if (arg1 >= -79) {
            return;
        }
        int var10 = arg7.method654(false);
        if (var10 == -1) {
            return;
        }
        Object var11 = null;
        class298 var12 = (class298) class319.field4442.method3898((byte) -42, (long) var10);
        if (var12 == null) {
            class52[] var13 = class52.method381(class671.field9318, var10, 0);
            if (var13 == null) {
                return;
            }
            var12 = class129.field1802.method1496(var13[0], true);
            class319.field4442.method3899(-127, var12, (long) var10);
        }
        class275.method1846(arg6.field4418, (byte) -39, arg3 >> 1, 0, arg6.method662((byte) 15) * 256, arg6.field4410, arg9 >> 1, arg0, arg6.field4408, arg4);
        int var14 = arg5 + class185.field2530[0] - 18;
        int var15 = arg2 / 4 * 18 + var14;
        int var16 = arg8 - (-class185.field2530[1] + 54) - 16;
        int var17 = arg2 % 4 * 18 + var16;
        var12.method1970(var15, var17);
        if (arg6 == arg7) {
            class129.field1802.method3250(29600, 18, var15 - 1, 18, var17 - 1, -256);
        }
        class483.method2944(var15 + 18, var17 + 18, var15 - 1, var17 + -1, -1);
        class429 var18 = class207.method1243((byte) -83);
        var18.field6008 = var15;
        var18.field6011 = var17;
        var18.field6014 = var17 + 16;
        var18.field6012 = arg7;
        var18.field6009 = var15 + 16;
        class228.field3055.method1643(var18, -127);
    }

    @OriginalMember(owner = "client!sha", name = "a", descriptor = "(I)V")
    public static void method3261(int arg0) {
        field7651 = null;
        if (arg0 != 54) {
            field7652 = -126;
        }
        field7649 = null;
    }

    @OriginalMember(owner = "client!sha", name = "a", descriptor = "(BLdc;)Luw;")
    public static final class197 method3262(byte arg0, class63 arg1) {
        field7647++;
        int var2 = arg1.method505((byte) -119);
        class557 var3 = client.method2746(0)[arg1.method505((byte) -119)];
        class125 var4 = class146.method947(-118)[arg1.method505((byte) -119)];
        int var5 = arg1.method496(-112);
        int var6 = arg1.method496(-88);
        int var7 = arg1.method482(-772591672);
        int var8 = arg1.method482(-772591672);
        int var9 = arg1.method457(-14532);
        int var10 = arg1.method457(-14532);
        int var11 = arg1.method457(-14532);
        boolean var12 = arg1.method505((byte) -119) == 1;
        if (arg0 != -52) {
            method3261(-48);
        }
        return new class197(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12);
    }

    @OriginalMember(owner = "client!sha", name = "b", descriptor = "(I)V")
    public static final void method3263(int arg0) {
        field7642++;
        class491.field6905.method3906(arg0 ^ 0xFFFFFF99);
        class717.field9986.method3906(-98);
        class744.field10235.method3906(-110);
        if (arg0 != 18) {
            field7641 = 0.8434879F;
        }
        class545.field7565.method3906(-97);
    }

    @OriginalMember(owner = "client!sha", name = "a", descriptor = "(BI)Lhk;")
    public final class537 method3264(byte arg0, int arg1) {
        field7646++;
        class690 var3 = this.field7645;
        class537 var4;
        synchronized (this.field7645) {
            var4 = (class537) this.field7645.method3898((byte) -42, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field7650.method1572(class483.method2939(407500840, arg1), 0, class1.method1(arg1, 21045));
        class537 var6 = new class537();
        if (arg0 != 38) {
            method3262((byte) -53, null);
        }
        if (var5 != null) {
            var6.method3180(-114, new class63(var5));
        }
        class690 var7 = this.field7645;
        synchronized (this.field7645) {
            this.field7645.method3899(-58, var6, (long) arg1);
            return var6;
        }
    }

    @OriginalMember(owner = "client!sha", name = "c", descriptor = "(I)V")
    public static final void method3265(int arg0) {
        field7648++;
        for (class158 var1 = (class158) class24.field295.method3618(85); var1 != null; var1 = (class158) class24.field295.method3619(0)) {
            class694 var2 = var1.field2215;
            if (class483.field6741 > var2.field9651) {
                var1.method549(6410);
                var2.method3926((byte) -127);
            } else if (var2.field9645 <= class483.field6741) {
                var2.method3920(0);
                if (var2.field9630 > 0) {
                    class234 var3 = (class234) class372.field5245.method812(123, (long) (var2.field9630 - 1));
                    if (var3 != null) {
                        class679 var4 = var3.field3471;
                        if (var4.field4410 >= 0 && var4.field4410 < (class277.field4036 * 512) && var4.field4418 >= 0 && var4.field4418 < class667.field9202 * 512) {
                            var2.method3925(class737.method4102((byte) 19, var4.field4410, var4.field4418, var2.field4408) - var2.field9670, 126, var4.field4410, class483.field6741, var4.field4418);
                        }
                    }
                }
                if (var2.field9630 < 0) {
                    int var5 = -var2.field9630 - 1;
                    class96 var6;
                    if (class145.field2037 == var5) {
                        var6 = class388.field5601;
                    } else {
                        var6 = class251.field3675[var5];
                    }
                    if (var6 != null && var6.field4410 >= 0 && (class277.field4036 * 512) > var6.field4410 && var6.field4418 >= 0 && (class667.field9202 * 512) > var6.field4418) {
                        var2.method3925(class737.method4102((byte) 19, var6.field4410, var6.field4418, var2.field4408) - var2.field9670, 126, var6.field4410, class483.field6741, var6.field4418);
                    }
                }
                var2.method3923(true, class449.field6216);
                class117.method738(var2, true);
            }
        }
        if (arg0 >= -16) {
            field7643 = 107;
        }
    }

    @OriginalMember(owner = "client!sha", name = "<init>", descriptor = "(Lgp;ILuu;)V")
    public class550(class553 arg0, int arg1, class237 arg2) {
        this.field7650 = arg2;
        if (this.field7650 != null) {
            int var4 = this.field7650.method1584((byte) 71) - 1;
            this.field7650.method1597(var4, 0);
        }
    }
}
