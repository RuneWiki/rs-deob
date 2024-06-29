import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ew")
public class class495 extends class490 {

    @OriginalMember(owner = "client!ew", name = "i", descriptor = "Lqd;")
    public class452 field6674;

    @OriginalMember(owner = "client!ew", name = "l", descriptor = "I")
    public static int field6677 = -1;

    @OriginalMember(owner = "client!ew", name = "m", descriptor = "Lkaa;")
    public static class47 field6678 = new class47(24, 2);

    @OriginalMember(owner = "client!ew", name = "j", descriptor = "I")
    public static int field6675;

    @OriginalMember(owner = "client!ew", name = "k", descriptor = "I")
    public static int field6676;

    @OriginalMember(owner = "client!ew", name = "n", descriptor = "I")
    public static int field6679;

    @OriginalMember(owner = "client!ew", name = "o", descriptor = "I")
    public static int field6680;

    @OriginalMember(owner = "client!ew", name = "c", descriptor = "(I)V", line = 4)
    public static void method2792(int arg0) {
        if (arg0 != -1) {
            field6677 = 43;
        }
        field6678 = null;
    }

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "(IIIBII)V", line = 16)
    public static final void method2793(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5) {
        if (arg3 <= 51) {
            field6678 = null;
        }
        field6676++;
        int var6 = arg0 - arg5;
        int var7 = arg4 - arg2;
        if (var6 == 0) {
            if (var7 != 0) {
                class712.method3997(arg4, arg5, arg1, (byte) -116, arg2);
            }
        } else if (var7 == 0) {
            class469.method2647(0, arg5, arg2, arg1, arg0);
        } else {
            int var8 = (var7 << 12) / var6;
            int var9 = arg2 - (arg5 * var8 >> 12);
            int var10;
            int var11;
            if (arg0 < class261.field3632) {
                var10 = (class261.field3632 * var8 >> 12) + var9;
                var11 = class261.field3632;
            } else if (arg0 > class209.field3090) {
                var10 = (class209.field3090 * var8 >> 12) + var9;
                var11 = class209.field3090;
            } else {
                var11 = arg0;
                var10 = arg4;
            }
            int var12;
            int var13;
            if (arg5 < class261.field3632) {
                var12 = (class261.field3632 * var8 >> 12) + var9;
                var13 = class261.field3632;
            } else if (class209.field3090 >= arg5) {
                var13 = arg5;
                var12 = arg2;
            } else {
                var13 = class209.field3090;
                var12 = (class209.field3090 * var8 >> 12) + var9;
            }
            if (var12 < class380.field5289) {
                var13 = (class380.field5289 - var9 << 12) / var8;
                var12 = class380.field5289;
            } else if (class431.field5944 < var12) {
                var13 = (class431.field5944 - var9 << 12) / var8;
                var12 = class431.field5944;
            }
            if (var10 < class380.field5289) {
                var11 = (class380.field5289 - var9 << 12) / var8;
                var10 = class380.field5289;
            } else if (class431.field5944 < var10) {
                var11 = (class431.field5944 - var9 << 12) / var8;
                var10 = class431.field5944;
            }
            class258.method1565(var12, var11, -21125, arg1, var10, var13);
        }
    }

    @OriginalMember(owner = "client!ew", name = "b", descriptor = "(III)Z", line = 126)
    public static final boolean method2794(int arg0, int arg1, int arg2) {
        field6675++;
        if (arg0 <= 90) {
            field6678 = null;
        }
        return (arg2 & 0x800) != 0;
    }

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "(ZI)V", line = 137)
    public static final void method2795(boolean arg0, int arg1) {
        if (arg0) {
            field6678 = null;
        }
        field6679++;
        class127 var2 = class760.method4231(arg1, -874792672, 1);
        var2.method1002(-78);
    }

    @OriginalMember(owner = "client!ew", name = "<init>", descriptor = "(Lrda;II[B)V", line = 149)
    public class495(class663 arg0, int arg1, int arg2, byte[] arg3) {
        this.field6674 = class519.method2882(false, arg3, arg0, 6406, 6406, arg2, arg1, -18);
        this.field6674.method4116((byte) -60, false, false);
    }

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "(Lkf;)V", line = 160)
    public static final void method2796(class256 arg0) {
        if (arg0 == null) {
            return;
        }
        for (int var1 = 0; var1 < 2; var1++) {
            class256 var2 = null;
            for (class256 var3 = class496.field6694[var1]; var3 != null; var3 = var3.field3513) {
                if (arg0 == var3) {
                    if (var2 == null) {
                        class496.field6694[var1] = var3.field3513;
                    } else {
                        var2.field3513 = var3.field3513;
                    }
                    class302.field4291 = true;
                    return;
                }
                var2 = var3;
            }
            class256 var4 = null;
            for (class256 var5 = class8.field162[var1]; var5 != null; var5 = var5.field3513) {
                if (arg0 == var5) {
                    if (var4 == null) {
                        class8.field162[var1] = var5.field3513;
                    } else {
                        var4.field3513 = var5.field3513;
                    }
                    class302.field4291 = true;
                    return;
                }
                var4 = var5;
            }
            class256 var6 = null;
            for (class256 var7 = class15.field214[var1]; var7 != null; var7 = var7.field3513) {
                if (arg0 == var7) {
                    if (var6 == null) {
                        class15.field214[var1] = var7.field3513;
                    } else {
                        var6.field3513 = var7.field3513;
                    }
                    class302.field4291 = true;
                    return;
                }
                var6 = var7;
            }
        }
    }
}
