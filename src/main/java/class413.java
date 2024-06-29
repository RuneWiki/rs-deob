import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pf")
public class class413 extends class68 {

    @OriginalMember(owner = "client!pf", name = "k", descriptor = "I")
    public int field5882;

    @OriginalMember(owner = "client!pf", name = "l", descriptor = "I")
    public int field5883;

    @OriginalMember(owner = "client!pf", name = "m", descriptor = "I")
    public static int field5884;

    @OriginalMember(owner = "client!pf", name = "n", descriptor = "I")
    public int field5885;

    @OriginalMember(owner = "client!pf", name = "p", descriptor = "I")
    public int field5887;

    @OriginalMember(owner = "client!pf", name = "q", descriptor = "I")
    public static int field5888;

    @OriginalMember(owner = "client!pf", name = "r", descriptor = "I")
    public static int field5889;

    @OriginalMember(owner = "client!pf", name = "o", descriptor = "Lbf;")
    public class375 field5886;

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(IZIII)V")
    public static final void method2443(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        field5884++;
        if (!arg1) {
            method2443(-103, false, -59, 92, -62);
        }
        if (arg2 >= class533.field7845 && arg2 <= class289.field3694) {
            int var5 = class33.method242(arg4, class147.field1870, class237.field3019, (byte) -128);
            int var6 = class33.method242(arg3, class147.field1870, class237.field3019, (byte) -128);
            class168.method1081(arg0, true, var5, arg2, var6);
        }
    }

    @OriginalMember(owner = "client!pf", name = "b", descriptor = "(Z)V")
    public static final void method2444(boolean arg0) {
        class40.field511.field6631 = 0;
        field5889++;
        class85.field1068 = null;
        class181.field2394 = null;
        class507.field7292 = 0;
        class301.field3870 = null;
        class306.field3903 = 0;
        class525.field7765 = null;
        class312.field3986 = 0;
        class513.field7443.field6631 = 0;
        class489.method2967(0);
        class475.method2866((byte) -64);
        for (int var1 = 0; var1 < 2048; var1++) {
            class387.field5107[var1] = null;
        }
        if (!arg0) {
            return;
        }
        class23.field336 = null;
        for (int var2 = 0; var2 < class187.field2446.length; var2++) {
            class295 var4 = class187.field2446[var2];
            if (var4 != null) {
                var4.field4895 = -1;
            }
        }
        class489.method2966((byte) -124);
        class142.field1835 = 1;
        class284.method1677(-20429, 9);
        for (int var3 = 0; var3 < 100; var3++) {
            class229.field2928[var3] = true;
        }
        class498.method3002(0);
        class469.field6813 = 0L;
        class404.field5755 = null;
    }
}
