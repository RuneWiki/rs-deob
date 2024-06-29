import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pj")
public class class128 {

    @OriginalMember(owner = "client!pj", name = "g", descriptor = "Lwf;")
    private class117 field1782 = new class117(256);

    @OriginalMember(owner = "client!pj", name = "h", descriptor = "Lkda;")
    private class328 field1783;

    @OriginalMember(owner = "client!pj", name = "b", descriptor = "F")
    public static float field1777;

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "I")
    public static int field1776;

    @OriginalMember(owner = "client!pj", name = "c", descriptor = "I")
    public static int field1778;

    @OriginalMember(owner = "client!pj", name = "d", descriptor = "I")
    public static int field1779;

    @OriginalMember(owner = "client!pj", name = "e", descriptor = "I")
    public static int field1780;

    @OriginalMember(owner = "client!pj", name = "f", descriptor = "I")
    public static int field1781;

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(B)V")
    public final void method900(byte arg0) {
        field1779++;
        class117 var2 = this.field1782;
        synchronized (this.field1782) {
            if (arg0 >= -97) {
                this.field1783 = null;
            }
            this.field1782.method846(0);
        }
    }

    @OriginalMember(owner = "client!pj", name = "b", descriptor = "(B)V")
    public final void method901(byte arg0) {
        if (arg0 <= 36) {
            return;
        }
        field1778++;
        class117 var2 = this.field1782;
        synchronized (this.field1782) {
            this.field1782.method837(127);
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(IIIILn;ILqa;)V")
    public static final void method902(int arg0, int arg1, int arg2, int arg3, class17 arg4, int arg5, class208 arg6) {
        if (class624.field9190 < 100) {
            class622.method3636(arg2 ^ 0xF, arg4, arg6);
        }
        field1780++;
        arg6.method510(arg3, arg1, arg0 + arg3, arg1 + arg5);
        if (arg2 > class624.field9190) {
            byte var7 = 20;
            int var8 = arg0 / 2 + arg3;
            arg6.method498(arg3, arg1, arg0, arg5, -16777216, 0);
            int var9 = arg5 / 2 + (arg1 - 18) - var7;
            arg6.method445(var8 - 152, var9, 304, 34, class554.field8244[class285.field3981].getRGB(), 0);
            arg6.method498(var8 - 150, var9 + 2, class624.field9190 * 3, 30, class463.field6518[class285.field3981].getRGB(), 0);
            class114.field1608.method734(var7 + var9, class140.field1986.method3408(arg2 + -1, class63.field795), 122, class204.field3007[class285.field3981].getRGB(), var8, -1);
            return;
        }
        int var10 = class607.field9016 - ((int) ((float) arg0 / class339.field4675));
        int var11 = class177.field2703 + ((int) ((float) arg5 / class339.field4675));
        int var12 = class607.field9016 + ((int) ((float) arg0 / class339.field4675));
        class537.field8007 = class607.field9016 - ((int) ((float) arg0 / class339.field4675));
        class291.field4026 = (int) ((float) (arg5 * 2) / class339.field4675);
        class224.field3242 = class177.field2703 - ((int) ((float) arg5 / class339.field4675));
        class322.field4444 = (int) ((float) (arg0 * 2) / class339.field4675);
        int var13 = class177.field2703 - ((int) ((float) arg5 / class339.field4675));
        class339.method2076(var10 + class339.field4685, class339.field4696 + var11, class339.field4685 + var12, var13 - -class339.field4696, arg3, arg1, arg0 + arg3, arg5 + 1 + arg1);
        class339.method2069(arg6);
        class19 var14 = class339.method2068(arg6);
        class432.method2526(arg6, var14, 0, 0, (byte) 106);
        if (class572.field8429 > 0) {
            class276.field3881--;
            if (class276.field3881 == 0) {
                class276.field3881 = 20;
                class572.field8429--;
            }
        }
        if (!class188.field2800) {
            return;
        }
        int var15 = arg0 + arg3 - 5;
        int var16 = arg1 + arg5 - 8;
        class465.field6539.method728("Fps:" + class36.field422, var16, false, -1, 16776960, var15);
        int var20 = var16 - 15;
        Runtime var17 = Runtime.getRuntime();
        int var18 = (int) ((var17.totalMemory() - var17.freeMemory()) / 1024L);
        int var19 = 16776960;
        if (var18 > 65536) {
            var19 = 16711680;
        }
        class465.field6539.method728("Mem:" + var18 + "k", var20, false, -1, var19, var15);
        var16 = var20 - 15;
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(IZ)V")
    public final void method903(int arg0, boolean arg1) {
        if (arg1) {
            this.field1783 = null;
        }
        field1781++;
        class117 var3 = this.field1782;
        synchronized (this.field1782) {
            this.field1782.method834(arg0, 0);
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(II)Ltd;")
    public final class387 method904(int arg0, int arg1) {
        field1776++;
        class117 var3 = this.field1782;
        class387 var4;
        synchronized (this.field1782) {
            var4 = (class387) this.field1782.method842(arg0 ^ arg0, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class328 var5 = this.field1783;
        byte[] var6;
        synchronized (this.field1783) {
            var6 = this.field1783.method1966(arg1, 26, true);
        }
        class387 var7 = new class387();
        if (var6 != null) {
            var7.method2303(true, new class148(var6));
        }
        class117 var8 = this.field1782;
        synchronized (this.field1782) {
            this.field1782.method835((byte) 123, (long) arg1, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!pj", name = "<init>", descriptor = "(Lbt;ILkda;)V")
    public class128(class39 arg0, int arg1, class328 arg2) {
        this.field1783 = arg2;
        this.field1783.method1975(97, 26);
    }
}
