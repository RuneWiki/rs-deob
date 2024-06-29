import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bp")
public class class261 {

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "Llh;")
    private class364 field3762 = new class364(64);

    @OriginalMember(owner = "client!bp", name = "c", descriptor = "Lhh;")
    private class84 field3764;

    @OriginalMember(owner = "client!bp", name = "b", descriptor = "Z")
    public static boolean field3763 = false;

    @OriginalMember(owner = "client!bp", name = "k", descriptor = "[B")
    public static byte[] field3772 = new byte[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

    @OriginalMember(owner = "client!bp", name = "m", descriptor = "F")
    public static float field3774;

    @OriginalMember(owner = "client!bp", name = "d", descriptor = "I")
    public static int field3765;

    @OriginalMember(owner = "client!bp", name = "e", descriptor = "I")
    public static int field3766;

    @OriginalMember(owner = "client!bp", name = "f", descriptor = "I")
    public static int field3767;

    @OriginalMember(owner = "client!bp", name = "g", descriptor = "I")
    public static int field3768;

    @OriginalMember(owner = "client!bp", name = "h", descriptor = "I")
    public static int field3769;

    @OriginalMember(owner = "client!bp", name = "i", descriptor = "I")
    public static int field3770;

    @OriginalMember(owner = "client!bp", name = "j", descriptor = "I")
    public static int field3771;

    @OriginalMember(owner = "client!bp", name = "l", descriptor = "I")
    public static int field3773;

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(IIIILir;)V")
    public static final void method1659(int arg0, int arg1, int arg2, int arg3, class22 arg4) {
        field3771++;
        class441 var5 = arg4.method192(true);
        if (arg1 != 0) {
            field3763 = false;
        }
        int var6 = arg4.field357 - arg4.field338.field7089 & 0x3FFF;
        if (arg3 == -1) {
            if (var6 != 0 || arg4.field379 > 25) {
                if (arg2 < 0 && var5.field6430 != -1) {
                    arg4.field373 = var5.field6430;
                } else if (arg2 <= 0 || var5.field6447 == -1) {
                    arg4.field373 = var5.field6440;
                } else {
                    arg4.field373 = var5.field6447;
                }
                arg4.field393 = false;
            } else if (!arg4.field393 || !var5.method2680(arg4.field373, (byte) -97)) {
                arg4.field373 = var5.method2682(arg1 ^ 0x3F);
                arg4.field393 = arg4.field373 != -1;
            }
        } else if (arg4.field355 != -1 && (var6 >= 10240 || var6 <= 2048)) {
            int var7 = class310.field4447[arg0] - arg4.field338.field7089 & 0x3FFF;
            if (arg3 == 2 && var5.field6434 != -1) {
                if (var7 > 2048 && var7 <= 6144 && var5.field6461 != -1) {
                    arg4.field373 = var5.field6461;
                } else if (var7 >= 10240 && var7 < 14336 && var5.field6444 != -1) {
                    arg4.field373 = var5.field6444;
                } else if (var7 <= 6144 || var7 >= 10240 || var5.field6431 == -1) {
                    arg4.field373 = var5.field6434;
                } else {
                    arg4.field373 = var5.field6431;
                }
            } else if (arg3 == 0 && var5.field6469 != -1) {
                if (var7 > 2048 && var7 <= 6144 && var5.field6435 != -1) {
                    arg4.field373 = var5.field6435;
                } else if (var7 >= 10240 && var7 < 14336 && var5.field6468 != -1) {
                    arg4.field373 = var5.field6468;
                } else if (var7 <= 6144 || var7 >= 10240 || var5.field6432 == -1) {
                    arg4.field373 = var5.field6469;
                } else {
                    arg4.field373 = var5.field6432;
                }
            } else if (var7 > 2048 && var7 <= 6144 && var5.field6439 != -1) {
                arg4.field373 = var5.field6439;
            } else if (var7 >= 10240 && var7 < 14336 && var5.field6442 != -1) {
                arg4.field373 = var5.field6442;
            } else if (var7 <= 6144 || var7 >= 10240 || var5.field6429 == -1) {
                arg4.field373 = var5.field6440;
            } else {
                arg4.field373 = var5.field6429;
            }
            arg4.field393 = false;
        } else if (var6 == 0 && arg4.field379 <= 25) {
            if (arg3 == 2 && var5.field6434 != -1) {
                arg4.field373 = var5.field6434;
            } else if (arg3 == 0 && var5.field6469 != -1) {
                arg4.field373 = var5.field6469;
            } else {
                arg4.field373 = var5.field6440;
            }
            arg4.field393 = false;
        } else {
            arg4.field393 = false;
            if (arg3 == 2 && var5.field6434 != -1) {
                if (arg2 < 0 && var5.field6449 != -1) {
                    arg4.field373 = var5.field6449;
                } else if (arg2 <= 0 || var5.field6441 == -1) {
                    arg4.field373 = var5.field6434;
                } else {
                    arg4.field373 = var5.field6441;
                }
            } else if (arg3 == 0 && var5.field6469 != -1) {
                if (arg2 < 0 && var5.field6477 != -1) {
                    arg4.field373 = var5.field6477;
                } else if (arg2 <= 0 || var5.field6464 == -1) {
                    arg4.field373 = var5.field6469;
                } else {
                    arg4.field373 = var5.field6464;
                }
            } else if (arg2 < 0 && var5.field6475 != -1) {
                arg4.field373 = var5.field6475;
            } else if (arg2 <= 0 || var5.field6473 == -1) {
                arg4.field373 = var5.field6440;
            } else {
                arg4.field373 = var5.field6473;
            }
        }
    }

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(BLjava/lang/String;ZLci;Z)V")
    public static final void method1660(byte arg0, String arg1, boolean arg2, class312 arg3, boolean arg4) {
        field3768++;
        if (arg0 >= -25) {
            return;
        }
        if (!arg2) {
            class29.method237(3, arg3, 9767, arg1);
            return;
        }
        if (class312.field4472.startsWith("win") && class312.field4479 != 3) {
            String var5 = null;
            if (arg3.field4458 != null) {
                var5 = arg3.field4458.getParameter("haveie6");
            }
            if (var5 == null || !var5.equals("1")) {
                class100 var6 = class29.method237(0, arg3, 9767, arg1);
                class196.field2896 = var6;
                class318.field4555 = arg1;
                class458.field6761 = arg3;
                return;
            }
        }
        if (class312.field4472.startsWith("mac")) {
            String var7 = null;
            if (arg3.field4458 != null) {
                var7 = arg3.field4458.getParameter("havefirefox");
            }
            if (var7 != null && var7.equals("1") && arg4) {
                class29.method237(1, arg3, 9767, arg1);
                return;
            }
        }
        class29.method237(2, arg3, 9767, arg1);
    }

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(I)V")
    public static final void method1661(int arg0) {
        field3766++;
        int var1 = 0;
        int var2 = 0;
        if (arg0 != -1) {
            field3763 = false;
        }
        while (class237.field3436 > var2) {
            for (int var3 = 0; var3 < class83.field1366; var3++) {
                if (class413.method2550(false, class36.field545, var3, var2, true, var1)) {
                    var1++;
                }
                if (var1 >= 512) {
                    return;
                }
            }
            var2++;
        }
    }

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(B)V")
    public static void method1662(byte arg0) {
        field3772 = null;
        if (arg0 < 110) {
            field3774 = -0.36931852F;
        }
    }

    @OriginalMember(owner = "client!bp", name = "b", descriptor = "(B)V")
    public final void method1663(byte arg0) {
        class364 var2 = this.field3762;
        synchronized (this.field3762) {
            int var3 = 46 / ((-arg0 - 56) / 34);
            this.field3762.method2350((byte) 112);
        }
        field3769++;
    }

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(BI)V")
    public final void method1664(byte arg0, int arg1) {
        field3767++;
        if (arg0 != 89) {
            this.field3764 = null;
        }
        class364 var3 = this.field3762;
        synchronized (this.field3762) {
            this.field3762.method2348(arg1, -128);
        }
    }

    @OriginalMember(owner = "client!bp", name = "b", descriptor = "(I)V")
    public final void method1665(int arg0) {
        class364 var2 = this.field3762;
        synchronized (this.field3762) {
            this.field3762.method2349(0);
        }
        field3770++;
        if (arg0 != -28049) {
            this.field3762 = null;
        }
    }

    @OriginalMember(owner = "client!bp", name = "<init>", descriptor = "(Lmt;ILhh;)V")
    public class261(class271 arg0, int arg1, class84 arg2) {
        this.field3764 = arg2;
        if (this.field3764 != null) {
            this.field3764.method656((byte) 122, 35);
        }
    }

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(III)Z")
    public static final boolean method1666(int arg0, int arg1, int arg2) {
        if (arg0 != -1) {
            field3774 = 1.4369564F;
        }
        field3765++;
        return (arg1 & 0x70000) != 0 | class478.method2860(0, arg2, arg1) || class415.method2559(97, arg1, arg2);
    }

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(II)Lsi;")
    public final class390 method1667(int arg0, int arg1) {
        field3773++;
        class364 var3 = this.field3762;
        class390 var4;
        synchronized (this.field3762) {
            var4 = (class390) this.field3762.method2339(-63, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field3764.method683(35, arg1, 5);
        class390 var6 = new class390();
        if (var5 != null) {
            var6.method2448(-1, new class303(var5));
        }
        var6.method2450((byte) -115);
        class364 var7 = this.field3762;
        synchronized (this.field3762) {
            this.field3762.method2342((long) arg1, var6, 72);
            int var8 = 10 % ((arg0 - 64) / 48);
            return var6;
        }
    }
}
