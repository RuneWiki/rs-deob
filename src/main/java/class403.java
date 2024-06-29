import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tl")
public class class403 {

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "[I")
    private int[] field5685;

    @OriginalMember(owner = "client!tl", name = "d", descriptor = "I")
    public static int field5688 = 0;

    @OriginalMember(owner = "client!tl", name = "e", descriptor = "Les;")
    public static class236 field5689 = new class236();

    @OriginalMember(owner = "client!tl", name = "b", descriptor = "I")
    public static int field5686;

    @OriginalMember(owner = "client!tl", name = "c", descriptor = "I")
    public static int field5687;

    @OriginalMember(owner = "client!tl", name = "f", descriptor = "I")
    public static int field5690;

    @OriginalMember(owner = "client!tl", name = "g", descriptor = "I")
    public static int field5691;

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(BLdt;)V")
    public static final void method2400(byte arg0, class145 arg1) {
        field5691++;
        class145 var2 = class157.method986(arg1, -24360);
        int var3;
        int var4;
        if (var2 == null) {
            var3 = class244.field3634;
            var4 = class144.field1900;
        } else {
            var4 = var2.field2010;
            var3 = var2.field2021;
        }
        if (arg0 <= 22) {
            method2401((String) null, 124);
        }
        class345.method2166(var3, var4, (byte) 102, arg1, false);
        class204.method1277(var4, arg1, -32368, var3);
    }

    @OriginalMember(owner = "client!tl", name = "<init>", descriptor = "([I)V")
    public class403(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= ((arg0.length >> 1) + arg0.length); var2 <<= 0x1) {
        }
        this.field5685 = new int[var2 + var2];
        for (int var3 = 0; var3 < var2 + var2; var3++) {
            this.field5685[var3] = -1;
        }
        int var4 = 0;
        while (arg0.length > var4) {
            int var5;
            for (var5 = var2 - 1 & arg0[var4]; this.field5685[var5 + var5 + 1] != -1; var5 = var5 + 1 & var2 + -1) {
            }
            this.field5685[var5 + var5] = arg0[var4];
            this.field5685[var5 + var5 + 1] = var4++;
        }
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(Ljava/lang/String;I)V")
    public static final void method2401(String arg0, int arg1) {
        field5690++;
        if (arg0 == null) {
            return;
        }
        if (arg0.startsWith("*")) {
            arg0 = arg0.substring(1);
        }
        String var2 = class191.method1180((byte) -94, arg0);
        if (var2 == null) {
            return;
        }
        for (int var3 = arg1; var3 < class237.field3564; var3++) {
            String var4 = class24.field310[var3];
            if (var4.startsWith("*")) {
                var4 = var4.substring(1);
            }
            String var5 = class191.method1180((byte) -123, var4);
            if (var5 != null && var5.equals(var2)) {
                class237.field3564--;
                for (int var6 = var3; var6 < class237.field3564; var6++) {
                    class24.field310[var6] = class24.field310[var6 + 1];
                    class116.field1477[var6] = class116.field1477[var6 + 1];
                    class243.field3624[var6] = class243.field3624[var6 + 1];
                    class26.field334[var6] = class26.field334[var6 + 1];
                    class237.field3558[var6] = class237.field3558[var6 + 1];
                    class225.field3416[var6] = class225.field3416[var6 + 1];
                }
                class99.field1271 = class27.field367;
                class118.field1497++;
                class15.method110(class222.field3367, arg1 - 128);
                class225.field3415.method1753(true, class89.method501(arg0, true));
                class225.field3415.method1730(-11508, arg0);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(II)I")
    public final int method2402(int arg0, int arg1) {
        field5686++;
        int var3 = (this.field5685.length >> 1) + arg1;
        int var4 = arg0 & var3;
        while (true) {
            int var5 = this.field5685[var4 + var4 + 1];
            if (var5 == -1) {
                return -1;
            }
            if (this.field5685[var4 + var4] == arg0) {
                return var5;
            }
            var4 = var4 + 1 & var3;
        }
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(B)V")
    public static void method2403(byte arg0) {
        if (arg0 < 95) {
            method2401((String) null, -55);
        }
        field5689 = null;
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(IILgg;I)J")
    public static final long method2404(int arg0, int arg1, class106 arg2, int arg3) {
        field5687++;
        long var4 = 4194304L;
        long var6 = 2147483648L;
        if (arg0 != -1560628959) {
            field5689 = null;
        }
        long var8 = Long.MIN_VALUE;
        class453 var10 = class156.field2325.method808(arg2.method106(arg0 + 1560641140), 0);
        long var11 = (long) (arg1 << 7 | arg3 | arg2.method119((byte) 103) << 14 | arg2.method104(31249) << 20 | 0x40000000);
        if (var10.field6366 == 0) {
            var11 |= var8;
        }
        if (var10.field6329 == 1) {
            var11 |= var4;
        }
        if (var10.field6321) {
            var11 |= var6;
        }
        return var11 | (long) arg2.method106(12181) << 32;
    }
}
