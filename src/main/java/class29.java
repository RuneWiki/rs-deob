import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ta")
public class class29 extends class724 implements class445 {

    @OriginalMember(owner = "client!ta", name = "D", descriptor = "[Ljava/lang/String;")
    public static String[] field262 = new String[100];

    @OriginalMember(owner = "client!ta", name = "y", descriptor = "Lkka;")
    public static class542 field257 = new class542();

    @OriginalMember(owner = "client!ta", name = "E", descriptor = "I")
    public static int field263 = 1409;

    @OriginalMember(owner = "client!ta", name = "G", descriptor = "Lefa;")
    public static class553 field265 = null;

    @OriginalMember(owner = "client!ta", name = "u", descriptor = "I")
    public static int field253;

    @OriginalMember(owner = "client!ta", name = "w", descriptor = "I")
    public static int field255;

    @OriginalMember(owner = "client!ta", name = "x", descriptor = "I")
    public static int field256;

    @OriginalMember(owner = "client!ta", name = "z", descriptor = "I")
    public static int field258;

    @OriginalMember(owner = "client!ta", name = "A", descriptor = "I")
    public static int field259;

    @OriginalMember(owner = "client!ta", name = "B", descriptor = "I")
    public static int field260;

    @OriginalMember(owner = "client!ta", name = "C", descriptor = "I")
    public static int field261;

    @OriginalMember(owner = "client!ta", name = "F", descriptor = "Lqu;")
    public static class235 field264;

    @OriginalMember(owner = "client!ta", name = "v", descriptor = "Lwm;")
    public static class30 field254;

    @OriginalMember(owner = "client!ta", name = "<init>", descriptor = "(Ljc;IZ[[I)V")
    public class29(class179 arg0, int arg1, boolean arg2, int[][] arg3) {
        super(arg0, 34067, class417.field5505, class73.field990, arg1 * 6 * arg1, arg2);
        super.field9498.method3756(10, this);
        if (arg2) {
            for (int var5 = 0; var5 < 6; ++var5) {
                this.method3874(arg1, -128, var5 + 34069, arg1, arg3[var5]);
            }
        } else {
            for (int var6 = 0; var6 < 6; ++var6) {
                OpenGL.glTexImage2Di(var6 + 34069, 0, this.method3878(255), arg1, arg1, 0, class735.method3999((byte) -85, super.field9499), super.field9498.field2454, arg3[var6], 0);
            }
        }
    }

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "(B)V")
    public static final void method120(byte arg0) {
        class449.field5854 = 0;
        ++field253;
        int var1 = class356.field4337.method1531((byte) -2);
        boolean var2 = ~class356.field4337.method1492(-43) == -2;
        int var3 = class356.field4337.method1492(-52);
        int var4 = class356.field4337.method1489(2);
        class333.method1925(0);
        class413.method2393((byte) 98, var3);
        int var5 = (-class356.field4337.field3133 + class199.field2766) / 16;
        class382.field4782 = new int[var5][4];
        for (int var6 = 0; var6 < var5; ++var6) {
            for (int var10 = 0; var10 < 4; ++var10) {
                class382.field4782[var6][var10] = class356.field4337.method1497((byte) 68);
            }
        }
        class279.field3625 = new byte[var5][];
        class55.field712 = null;
        class448.field5848 = new int[var5];
        class459.field5994 = new int[var5];
        class195.field2709 = new int[var5];
        class256.field3474 = new byte[var5][];
        class92.field1263 = new byte[var5][];
        if (arg0 < 90) {
            method122(-1.6857162805135941D, -31);
        }
        class484.field6249 = new int[var5];
        class702.field9287 = new byte[var5][];
        class644.field8240 = new int[var5];
        class439.field5768 = null;
        int var7 = 0;
        for (int var8 = (-(class240.field3280 >> 4) + var1) / 8; ((class240.field3280 >> 4) + var1) / 8 >= var8; ++var8) {
            for (int var9 = (-(class276.field3602 >> 4) + var4) / 8; var9 <= (var4 - -(class276.field3602 >> 4)) / 8; ++var9) {
                class644.field8240[var7] = (var8 << 8) + var9;
                class195.field2709[var7] = class650.field8282.method135(0, "m" + var8 + "_" + var9);
                class459.field5994[var7] = class650.field8282.method135(0, "l" + var8 + "_" + var9);
                class448.field5848[var7] = class650.field8282.method135(0, "um" + var8 + "_" + var9);
                class484.field6249[var7] = class650.field8282.method135(0, "ul" + var8 + "_" + var9);
                ++var7;
            }
        }
        class166.method1057(var1, var2, var4, 11, 111);
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "([BZII[BIIII)V")
    public static final void method121(byte[] arg0, boolean arg1, int arg2, int arg3, byte[] arg4, int arg5, int arg6, int arg7, int arg8) {
        ++field258;
        int var9 = -(arg5 >> 2);
        int var10 = -(3 & arg5);
        if (arg1) {
            field262 = null;
        }
        for (int var11 = -arg3; ~var11 > -1; ++var11) {
            int var10001;
            for (int var12 = var9; var12 < 0; ++var12) {
                var10001 = arg8++;
                arg4[var10001] += arg0[arg6++];
                int var14 = arg8++;
                arg4[var14] += arg0[arg6++];
                int var15 = arg8++;
                arg4[var15] += arg0[arg6++];
                int var16 = arg8++;
                arg4[var16] += arg0[arg6++];
            }
            for (int var13 = var10; var13 < 0; ++var13) {
                var10001 = arg8++;
                arg4[var10001] += arg0[arg6++];
            }
            arg6 += arg2;
            arg8 += arg7;
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(DI)V")
    public static final void method122(double arg0, int arg1) {
        if (arg1 < 76) {
            method123(true, 16);
        }
        ++field261;
        if (class790.field10829 != arg0) {
            for (int var3 = 0; ~var3 > -257; ++var3) {
                int var4 = (int) (Math.pow((double) var3 / 255.0D, arg0) * 255.0D);
                class455.field5965[var3] = ~var4 < -256 ? 255 : var4;
            }
            class790.field10829 = arg0;
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(ZI)V")
    public static final void method123(boolean arg0, int arg1) {
        ++field260;
        class111.field1487 = arg1;
        class536 var2 = class628.field7980;
        synchronized (class628.field7980) {
            if (!arg0) {
                method121((byte[]) null, true, -30, -120, (byte[]) null, -55, -6, 90, 103);
            }
            class628.field7980.method2919(0);
        }
    }

    @OriginalMember(owner = "client!ta", name = "c", descriptor = "(Z)V")
    public static void method124(boolean arg0) {
        field264 = null;
        field257 = null;
        field262 = null;
        field254 = null;
        if (!arg0) {
            method122(0.20405051730836363D, 108);
        }
    }
}
