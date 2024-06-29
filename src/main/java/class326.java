import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rg")
public class class326 {

    @OriginalMember(owner = "client!rg", name = "c", descriptor = "Lqc;")
    public static class99 field4926 = new class99(500);

    @OriginalMember(owner = "client!rg", name = "f", descriptor = "[I")
    public static int[] field4929 = new int[256];

    @OriginalMember(owner = "client!rg", name = "h", descriptor = "I")
    public static int field4931;

    @OriginalMember(owner = "client!rg", name = "i", descriptor = "Lqc;")
    public static class99 field4932;

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "I")
    public static int field4924;

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "I")
    public static int field4925;

    @OriginalMember(owner = "client!rg", name = "d", descriptor = "I")
    public static int field4927;

    @OriginalMember(owner = "client!rg", name = "e", descriptor = "I")
    public static int field4928;

    @OriginalMember(owner = "client!rg", name = "g", descriptor = "I")
    public static int field4930;

    @OriginalMember(owner = "client!rg", name = "j", descriptor = "I")
    public static int field4933;

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(Lkm;ILkm;II)Lbn;", line = 4)
    public static final class9 method2279(class133 arg0, int arg1, class133 arg2, int arg3, int arg4) {
        if (arg1 != -1) {
            field4926 = (class99) null;
        }
        field4924++;
        return class129.method931(arg4, arg3, arg0, (byte) 107) ? class226.method1585(arg2.method955(arg3, arg4, arg1 - 21852), 64) : null;
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(I)V", line = 21)
    public static void method2280(int arg0) {
        field4932 = null;
        if (arg0 == 64) {
            field4926 = null;
            field4929 = null;
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(Ljava/lang/String;Lkm;I)Ljn;", line = 35)
    public static final class176 method2281(String arg0, class133 arg1, int arg2) {
        int var3 = arg1.method964(19, arg0);
        field4925++;
        if (arg2 < 58) {
            return (class176) null;
        } else if (var3 == -1) {
            return new class176(0);
        } else {
            int[] var4 = arg1.method954(0, var3);
            class176 var5 = new class176(var4.length);
            for (int var6 = 0; var6 < var5.field2397; var6++) {
                class316 var7 = new class316(arg1.method955(var3, var4[var6], -21853));
                var5.field2390[var6] = var7.method2158(-872702056);
                var5.field2399[var6] = var7.method2192(3);
                var5.field2389[var6] = var7.method2172((byte) 71);
                var5.field2401[var6] = var7.method2172((byte) 71);
            }
            return var5;
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(Z)V", line = 69)
    public static final void method2282(boolean arg0) {
        if (class173.field2356 != null && (class173.field2356.field3745 - (class173.field2356.method1653(-1) - 1) * 64 >> 7) == class167.field2278 && (class173.field2356.field3679 - ((class173.field2356.method1653(-1) - 1) * 64) >> 7) == class288.field4282) {
            class167.field2278 = 0;
        }
        for (int var1 = 0; var1 < 104; var1++) {
            for (int var2 = 0; var2 < 104; var2++) {
                class203.field2908[var1][var2] = 0;
            }
        }
        field4928++;
        for (int var3 = 0; var3 < class292.field4352; var3++) {
            class241 var4 = class169.field2306[class4.field35[var3]];
            if (var4 != null) {
                var4.field3733 = false;
            }
        }
        for (int var5 = 0; var5 < class338.field5084; var5++) {
            class329 var6 = class42.field484[class257.field3807[var5]];
            if (var6 != null) {
                var6.field3733 = false;
            }
        }
        if (!arg0) {
            field4932 = (class99) null;
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(IIIIII)V", line = 131)
    public static final void method2283(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field4927++;
        if (arg3 > -7) {
            method2281((String) null, (class133) null, 46);
        }
        if (arg1 >= class206.field2952 && arg2 <= class259.field3813 && arg5 >= class101.field1397 && arg4 <= class44.field536) {
            class250.method1706(arg0, arg2, arg1, arg5, (byte) 94, arg4);
        } else {
            class175.method1215(arg5, arg1, arg0, arg4, true, arg2);
        }
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            int var1 = var0;
            for (int var2 = 0; var2 < 8; var2++) {
                if ((var1 & 0x1) == 1) {
                    var1 = var1 >>> 1 ^ 0xEDB88320;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field4929[var0] = var1;
        }
        field4931 = 0;
        field4932 = new class99(64);
    }
}
