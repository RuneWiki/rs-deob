import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qga")
public class class193 {

    @OriginalMember(owner = "client!qga", name = "b", descriptor = "Lqg;")
    public static class216 field2235 = new class216("WTWIP", 3);

    @OriginalMember(owner = "client!qga", name = "a", descriptor = "I")
    public static int field2234;

    @OriginalMember(owner = "client!qga", name = "c", descriptor = "I")
    public static int field2236;

    @OriginalMember(owner = "client!qga", name = "a", descriptor = "(B)V", line = 3)
    public static void method1172(byte arg0) {
        field2235 = null;
        if (arg0 != -43) {
            method1173(null, null);
        }
    }

    @OriginalMember(owner = "client!qga", name = "a", descriptor = "(Lrb;[Leq;)V", line = 16)
    public static final void method1173(class383 arg0, class670[] arg1) {
        if (class472.field6806) {
            int var2 = arg0.method479(-26355, arg1);
            class568.field8078.method1020(var2, arg1);
        }
        if (class666.field9303 == class156.field1743) {
            boolean var3 = false;
            boolean var4 = false;
            int var5;
            int var6;
            if (arg0 instanceof class613) {
                var5 = ((class613) arg0).field8635;
                var6 = ((class613) arg0).field8627;
            } else {
                var5 = arg0.field5179 >> class559.field7984;
                var6 = arg0.field5176 >> class559.field7984;
            }
            class568.field8078.method1031(class385.field5193[0].method1610(arg0.field5179, 96, arg0.field5176), class87.method447(var5, var6), class542.method3051(var5, var6), class323.method1826(var5, var6));
        }
        class315 var7 = arg0.method182(class568.field8078, 0);
        if (var7 == null) {
            return;
        }
        var7.field3914 = arg0;
        if (class110.field1180) {
            class287 var8 = class517.field7362;
            synchronized (class517.field7362) {
                boolean var9 = false;
                for (class315 var10 = (class315) class517.field7362.method1672((byte) 107); var10 != null; var10 = (class315) class517.field7362.method1669(-2747)) {
                    if (arg0.field5168 >= var10.field3914.field5168) {
                        class314.method1806(var10, var7, 1);
                        var9 = true;
                        break;
                    }
                }
                if (!var9) {
                    class517.field7362.method1670((byte) -58, var7);
                }
                return;
            }
        }
        boolean var11 = false;
        for (class315 var12 = (class315) class517.field7362.method1672((byte) 104); var12 != null; var12 = (class315) class517.field7362.method1669(-2747)) {
            if (arg0.field5168 >= var12.field3914.field5168) {
                class314.method1806(var12, var7, 1);
                var11 = true;
                break;
            }
        }
        if (!var11) {
            class517.field7362.method1670((byte) -28, var7);
        }
    }

    @OriginalMember(owner = "client!qga", name = "a", descriptor = "(IZZII)V", line = 108)
    public static final void method1174(int arg0, boolean arg1, boolean arg2, int arg3, int arg4) {
        field2236++;
        class126.method718(arg4, 0, arg0, class114.field1202.length - 1, false, arg2, arg1);
        class347.field4655 = null;
        int var5 = -48 / ((-arg3 - 44) / 63);
        class359.field4828 = 0;
    }

    @OriginalMember(owner = "client!qga", name = "a", descriptor = "(IILtf;IIZ)V", line = 121)
    public static final void method1175(int arg0, int arg1, class701 arg2, int arg3, int arg4, boolean arg5) {
        class539.method3036((byte) -97, arg5, (long) arg0, arg3, arg2, arg1, arg4);
        field2234++;
    }
}
