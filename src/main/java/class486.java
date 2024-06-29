import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ke")
public class class486 {

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "Lad;")
    private class19 field6993 = new class19(64);

    @OriginalMember(owner = "client!ke", name = "g", descriptor = "Ltf;")
    private class701 field6998;

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "Lcq;")
    public static class110 field6992 = new class110(110, 3);

    @OriginalMember(owner = "client!ke", name = "j", descriptor = "[I")
    public static int[] field7001 = new int[200];

    @OriginalMember(owner = "client!ke", name = "c", descriptor = "I")
    public static int field6994;

    @OriginalMember(owner = "client!ke", name = "d", descriptor = "I")
    public static int field6995;

    @OriginalMember(owner = "client!ke", name = "e", descriptor = "I")
    public static int field6996;

    @OriginalMember(owner = "client!ke", name = "f", descriptor = "I")
    public static int field6997;

    @OriginalMember(owner = "client!ke", name = "h", descriptor = "I")
    public static int field6999;

    @OriginalMember(owner = "client!ke", name = "i", descriptor = "I")
    public static int field7000;

    @OriginalMember(owner = "client!ke", name = "k", descriptor = "I")
    public static int field7002;

    @OriginalMember(owner = "client!ke", name = "l", descriptor = "I")
    public static int field7003;

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(B)V", line = 3)
    public final void method2799(byte arg0) {
        class19 var2 = this.field6993;
        synchronized (this.field6993) {
            if (arg0 > -95) {
                return;
            }
            this.field6993.method88(77);
        }
        field6999++;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(Z)V", line = 17)
    public static final void method2800(boolean arg0) {
        field6996++;
        class517.field7368 = null;
        if (!arg0) {
            method2800(false);
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(I)V", line = 31)
    public final void method2801(int arg0) {
        if (arg0 != -17079) {
            this.field6993 = null;
        }
        field6997++;
        class19 var2 = this.field6993;
        synchronized (this.field6993) {
            this.field6993.method80((byte) 115);
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(IIII)I", line = 45)
    public static final int method2802(int arg0, int arg1, int arg2, int arg3) {
        field6995++;
        int var4 = arg3 & 0x3;
        if (var4 == 0) {
            return arg0;
        } else if (arg1 != 451) {
            return -3;
        } else if (var4 == 1) {
            return arg2;
        } else if (var4 == 2) {
            return 7 - arg0;
        } else {
            return 7 - arg2;
        }
    }

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "(I)V", line = 69)
    public static void method2803(int arg0) {
        int var1 = -87 % ((arg0 + 8) / 45);
        field7001 = null;
        field6992 = null;
    }

    @OriginalMember(owner = "client!ke", name = "<init>", descriptor = "(Lqh;ILtf;)V", line = 139)
    public class486(class320 arg0, int arg1, class701 arg2) {
        this.field6998 = arg2;
        this.field6998.method3883(31, 0);
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(II)V", line = 93)
    public final void method2804(int arg0, int arg1) {
        if (arg1 != 512) {
            return;
        }
        class19 var3 = this.field6993;
        synchronized (this.field6993) {
            this.field6993.method83((byte) -2, arg0);
        }
        field7002++;
    }

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "(II)Lri;", line = 107)
    public final class635 method2805(int arg0, int arg1) {
        field7000++;
        class19 var3 = this.field6993;
        class635 var4;
        synchronized (this.field6993) {
            var4 = (class635) this.field6993.method78(0, (long) arg1);
        }
        if (arg0 != 200) {
            this.method2801(67);
        }
        if (var4 != null) {
            return var4;
        }
        class701 var5 = this.field6998;
        byte[] var6;
        synchronized (this.field6998) {
            var6 = this.field6998.method3854((byte) 81, 31, arg1);
        }
        class635 var7 = new class635();
        if (var6 != null) {
            var7.method3569(0, new class115(var6));
        }
        class19 var8 = this.field6993;
        synchronized (this.field6993) {
            this.field6993.method92(1, (long) arg1, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "(Z)V", line = 154)
    public static final void method2806(boolean arg0) {
        field7003++;
        for (class658 var1 = (class658) class375.field5107.method3434((byte) 2); var1 != null; var1 = (class658) class375.field5107.method3430(true)) {
            class618 var2 = var1.field9244;
            if (var2.field8744 < class678.field9539) {
                var1.method1922(86);
                var2.method3451((byte) 21);
            } else if (class678.field9539 >= var2.field8707) {
                if (var2.field8723 > 0) {
                    class214 var3 = (class214) class274.field3433.method3669((long) (var2.field8723 - 1), -1);
                    if (var3 != null) {
                        class600 var4 = var3.field2601;
                        if (var4.field5179 >= 0 && (class142.field1574 * 512) > var4.field5179 && var4.field5176 >= 0 && var4.field5176 < (class140.field1550 * 512)) {
                            var2.method3450(var4.field5176, var4.field5179, class593.method3335(var4.field5176, var2.field5166, 27648, var4.field5179) - var2.field8720, class678.field9539, (byte) -83);
                        }
                    }
                }
                if (var2.field8723 < 0) {
                    int var5 = -var2.field8723 - 1;
                    class236 var6;
                    if (class392.field5314 == var5) {
                        var6 = class362.field4859;
                    } else {
                        var6 = class139.field1540[var5];
                    }
                    if (var6 != null && var6.field5179 >= 0 && var6.field5179 < (class142.field1574 * 512) && var6.field5176 >= 0 && var6.field5176 < class140.field1550 * 512) {
                        var2.method3450(var6.field5176, var6.field5179, class593.method3335(var6.field5176, var2.field5166, 27648, var6.field5179) - var2.field8720, class678.field9539, (byte) -116);
                    }
                }
                var2.method3447(class569.field8088, 59);
                class631.method3538(var2, true);
            }
        }
        if (!arg0) {
            field6992 = null;
        }
    }
}
