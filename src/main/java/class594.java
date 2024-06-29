import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qi")
public class class594 extends class490 {

    @OriginalMember(owner = "client!qi", name = "k", descriptor = "I")
    private int field8072 = -1;

    @OriginalMember(owner = "client!qi", name = "j", descriptor = "Lhj;")
    public static class596 field8071 = new class596(16, 1);

    @OriginalMember(owner = "client!qi", name = "p", descriptor = "Lhj;")
    public static class596 field8077 = new class596(58, 7);

    @OriginalMember(owner = "client!qi", name = "q", descriptor = "J")
    public static volatile long field8078 = 0L;

    @OriginalMember(owner = "client!qi", name = "r", descriptor = "I")
    public static int field8079 = -1;

    @OriginalMember(owner = "client!qi", name = "i", descriptor = "I")
    public static int field8070;

    @OriginalMember(owner = "client!qi", name = "l", descriptor = "I")
    public static int field8073;

    @OriginalMember(owner = "client!qi", name = "m", descriptor = "I")
    public static int field8074;

    @OriginalMember(owner = "client!qi", name = "n", descriptor = "I")
    public static int field8075;

    @OriginalMember(owner = "client!qi", name = "o", descriptor = "I")
    public static int field8076;

    @OriginalMember(owner = "client!qi", name = "s", descriptor = "Lnh;")
    public static class778 field8080;

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(IIIBLha;ILd;)V", line = 4)
    public static final void method3403(int arg0, int arg1, int arg2, byte arg3, class66 arg4, int arg5, class162 arg6) {
        if (class121.field1557 < 100) {
            class301.method1757(arg4, 64, arg6);
        }
        field8073++;
        arg4.method556(arg1, arg2, arg0 + arg1, arg2 + arg5);
        if (class121.field1557 < 100) {
            byte var7 = 20;
            int var8 = arg0 / 2 + arg1;
            arg4.method645(arg1, arg2, arg0, arg5, -16777216, 0);
            int var9 = arg5 / 2 + arg2 - (18 - -var7);
            arg4.method633(var8 - 152, var9, 304, 34, class730.field10228[class86.field1152].getRGB(), 0);
            arg4.method645(var8 - 150, var9 + 2, class121.field1557 * 3, 30, class363.field4527[class86.field1152].getRGB(), 0);
            class452.field6380.method657(class637.field8693.method3584(class770.field10592, true), -16777216, -1, class666.field9149[class86.field1152].getRGB(), var7 + var9, var8);
            return;
        }
        if (arg3 != -57) {
            field8080 = null;
        }
        int var10 = class580.field7912 - ((int) ((float) arg0 / class9.field154));
        int var11 = (int) ((float) arg5 / class9.field154) + class62.field850;
        int var12 = (int) ((float) arg0 / class9.field154) + class580.field7912;
        int var13 = class62.field850 - ((int) ((float) arg5 / class9.field154));
        class336.field4157 = (int) ((float) (arg5 * 2) / class9.field154);
        class487.field6807 = class62.field850 - ((int) ((float) arg5 / class9.field154));
        class566.field7800 = class580.field7912 - ((int) ((float) arg0 / class9.field154));
        class47.field627 = (int) ((float) (arg0 * 2) / class9.field154);
        class9.method151(class9.field176 + var10, class9.field178 + var11, var12 + class9.field176, var13 - -class9.field178, arg1, arg2, arg1 + arg0, arg2 - -1 + arg5);
        class9.method165(arg4);
        class450 var14 = class9.method154(arg4);
        class14.method195(arg4, 0, var14, 1, 0);
        if (class446.field5988 > 0) {
            class720.field10105--;
            if (class720.field10105 == 0) {
                class720.field10105 = 20;
                class446.field5988--;
            }
        }
        if (!class23.field368) {
            return;
        }
        int var15 = arg1 + arg0 - 5;
        int var16 = arg2 + arg5 - 8;
        class708.field9946.method660("Fps:" + class496.field6902, var16, var15, 16776960, -1, -106);
        int var20 = var16 - 15;
        Runtime var17 = Runtime.getRuntime();
        int var18 = (int) ((var17.totalMemory() - var17.freeMemory()) / 1024L);
        int var19 = 16776960;
        if (var18 > 65536) {
            var19 = 16711680;
        }
        class708.field9946.method660("Mem:" + var18 + "k", var20, var15, var19, -1, -46);
        var16 = var20 - 15;
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(IIBILpc;I)Lqt;", line = 88)
    public static final class664 method3404(int arg0, int arg1, byte arg2, int arg3, class700 arg4, int arg5) {
        int var6 = -50 % ((-arg2 - 20) / 53);
        field8070++;
        if (!arg4.field9846 && (!class152.method1091(arg3, -115) || !class152.method1091(arg1, -13))) {
            return arg4.field9842 ? new class664(arg4, 34037, arg5, arg0, arg3, arg1, true) : new class664(arg4, arg5, arg0, arg3, arg1, class783.method4337(arg3, (byte) 22), class783.method4337(arg1, (byte) 116), true);
        } else {
            return new class664(arg4, 3553, arg5, arg0, arg3, arg1, true);
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(Les;I)V", line = 107)
    public final void method2457(class403 arg0, int arg1) {
        this.field8072 = arg0.method2390((byte) -97);
        field8074++;
        if (arg1 <= 118) {
            return;
        }
        arg0.method2396((byte) 80);
        if (arg0.method2396((byte) -97) != 255) {
            arg0.field5262--;
            arg0.method2361(57);
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(JI)V", line = 131)
    public static final void method3405(long arg0, int arg1) {
        if (arg1 != 16711680) {
            field8079 = 50;
        }
        field8076++;
        if (arg0 <= 0L) {
            return;
        }
        if (arg0 % 10L == 0L) {
            class66.method596(arg0 - 1L, 123);
            class66.method596(1L, arg1 ^ 0xFF007A);
        } else {
            class66.method596(arg0, 120);
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(B)V", line = 156)
    public static void method3406(byte arg0) {
        field8080 = null;
        if (arg0 == 30) {
            field8071 = null;
            field8077 = null;
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(Lwt;I)V", line = 169)
    public final void method2459(class330 arg0, int arg1) {
        arg0.method1960(this.field8072, (byte) -25);
        if (arg1 != 0) {
            method3404(115, -47, (byte) -58, 4, null, -80);
        }
        field8075++;
    }
}
