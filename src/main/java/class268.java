import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tr")
public class class268 {

    @OriginalMember(owner = "client!tr", name = "f", descriptor = "Lbm;")
    private class98 field4358 = new class98();

    @OriginalMember(owner = "client!tr", name = "i", descriptor = "Lce;")
    private class283 field4361 = new class283();

    @OriginalMember(owner = "client!tr", name = "l", descriptor = "I")
    private int field4364;

    @OriginalMember(owner = "client!tr", name = "j", descriptor = "I")
    private int field4362;

    @OriginalMember(owner = "client!tr", name = "k", descriptor = "Lsba;")
    private class200 field4363;

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "Lhga;")
    public static class158 field4353 = new class158(70, 19);

    @OriginalMember(owner = "client!tr", name = "m", descriptor = "[I")
    public static int[] field4365 = new int[4];

    @OriginalMember(owner = "client!tr", name = "b", descriptor = "I")
    public static int field4354;

    @OriginalMember(owner = "client!tr", name = "c", descriptor = "I")
    public static int field4355;

    @OriginalMember(owner = "client!tr", name = "d", descriptor = "I")
    public static int field4356;

    @OriginalMember(owner = "client!tr", name = "e", descriptor = "I")
    public static int field4357;

    @OriginalMember(owner = "client!tr", name = "h", descriptor = "I")
    public static int field4360;

    @OriginalMember(owner = "client!tr", name = "g", descriptor = "Lk;")
    public static class525 field4359;

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(IJ)Lbm;")
    public final class98 method1899(int arg0, long arg1) {
        int var4 = -35 / ((arg0 - 35) / 58);
        field4356++;
        class98 var5 = (class98) this.field4363.method1558(arg1, (byte) -93);
        if (var5 != null) {
            this.field4361.method2015(var5, -50);
        }
        return var5;
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(I)V")
    public static final void method1900(int arg0) {
        if (class627.field8857 != null) {
            class485.field7108.method2749(-19473);
            class259.method1833();
            class145.method1234(-24329);
            class487.method2984((byte) 17);
            class229.method1685(arg0 ^ 0xFF008B08);
            class194.method1537((byte) 120);
            if (class581.field8273 != null) {
                class581.field8273.method1148(0);
            }
            class355.method2383((byte) -76);
            class66.method705(0);
            class466.method2905(0);
            class131.method1138(arg0 + 29718);
            class373.method2453(false, -106);
            for (int var1 = 0; var1 < 2048; var1++) {
                class304 var5 = class597.field8465[var1];
                if (var5 != null) {
                    for (int var6 = 0; var6 < var5.field4266.length; var6++) {
                        var5.field4266[var6] = null;
                    }
                }
            }
            for (int var2 = 0; var2 < class289.field4581; var2++) {
                class589 var3 = class613.field8707[var2].field5577;
                if (var3 != null) {
                    for (int var4 = 0; var4 < var3.field4266.length; var4++) {
                        var3.field4266[var4] = null;
                    }
                }
            }
            class240.field3805 = null;
            class183.field3093 = null;
            class627.field8857.method1349(1);
            class627.field8857 = null;
        }
        if (arg0 != -29705) {
            field4353 = null;
        }
        field4360++;
    }

    @OriginalMember(owner = "client!tr", name = "b", descriptor = "(I)V")
    public final void method1901(int arg0) {
        this.field4361.method2010(-54);
        field4357++;
        if (arg0 != 0) {
            this.method1902(46, 124L, null);
        }
        this.field4363.method1562((byte) 108);
        this.field4358 = new class98();
        this.field4362 = this.field4364;
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(IJLbm;)V")
    public final void method1902(int arg0, long arg1, class98 arg2) {
        field4355++;
        if (this.field4362 == 0) {
            class98 var5 = this.field4361.method2012(false);
            var5.method707((byte) -35);
            var5.method958((byte) 69);
            if (this.field4358 == var5) {
                class98 var6 = this.field4361.method2012(false);
                var6.method707((byte) -77);
                var6.method958((byte) 69);
            }
        } else {
            this.field4362--;
        }
        this.field4363.method1564(arg1, arg2, (byte) 81);
        this.field4361.method2015(arg2, -39);
        if (arg0 != -19867) {
            this.field4362 = 91;
        }
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(IIIIIII)V")
    public static final void method1903(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field4354++;
        int var7 = arg3 - arg0;
        int var8 = arg5 + arg0;
        for (int var9 = arg5; var9 < var8; var9++) {
            class367.method2427(3803, arg2, arg4, class39.field527[var9], arg6);
        }
        for (int var10 = arg3; var10 > var7; var10--) {
            class367.method2427(3803, arg2, arg4, class39.field527[var10], arg6);
        }
        int var11 = arg4 - arg0;
        int var12 = arg0 + arg6;
        int var13 = var8;
        if (arg1 != -18359) {
            field4353 = null;
        }
        while (var7 >= var13) {
            int[] var14 = class39.field527[var13];
            class367.method2427(3803, arg2, var12, var14, arg6);
            class367.method2427(3803, arg2, arg4, var14, var11);
            var13++;
        }
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(Z)V")
    public static void method1904(boolean arg0) {
        field4353 = null;
        if (!arg0) {
            field4359 = null;
        }
        field4365 = null;
        field4359 = null;
    }

    @OriginalMember(owner = "client!tr", name = "<init>", descriptor = "(I)V")
    public class268(int arg0) {
        this.field4364 = arg0;
        this.field4362 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field4363 = new class200(var2);
    }
}
