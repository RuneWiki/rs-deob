import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ns")
public class class277 {

    @OriginalMember(owner = "client!ns", name = "d", descriptor = "I")
    public static int field3628 = 1405;

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "I")
    public static int field3625;

    @OriginalMember(owner = "client!ns", name = "b", descriptor = "I")
    public static int field3626;

    @OriginalMember(owner = "client!ns", name = "c", descriptor = "I")
    public static int field3627;

    @OriginalMember(owner = "client!ns", name = "e", descriptor = "Lqi;")
    public static class397 field3629;

    @OriginalMember(owner = "client!ns", name = "f", descriptor = "Lpc;")
    public static class473 field3630;

    @OriginalMember(owner = "client!ns", name = "g", descriptor = "Lpc;")
    public static class473 field3631;

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(I)V", line = 4)
    public static final void method1648(int arg0) {
        class148.field2109.method1458((byte) -78);
        field3625++;
        if (arg0 != 1007) {
            field3630 = null;
        }
    }

    @OriginalMember(owner = "client!ns", name = "b", descriptor = "(I)Z", line = 21)
    public static final boolean method1649(int arg0) {
        field3626++;
        class39 var1 = (class39) class415.field5733.field3684.field630;
        if (var1 == null || class415.field5733.field3684 == var1) {
            return false;
        } else {
            if (arg0 >= ~var1.field590) {
                var1.field590 -= 2000;
            }
            return var1.field590 == 1007;
        }
    }

    @OriginalMember(owner = "client!ns", name = "c", descriptor = "(I)V", line = 41)
    public static void method1650(int arg0) {
        field3629 = null;
        field3630 = null;
        if (arg0 <= 90) {
            field3628 = 91;
        }
        field3631 = null;
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(Lit;Z)V", line = 55)
    public static final void method1651(class455 arg0, boolean arg1) {
        field3627++;
        boolean var2 = false;
        if (class31.field516 == arg0.field6171 || arg0.field6185 == -1 || arg0.field6248 != 0) {
            var2 = true;
        } else {
            class5 var3 = class423.field5791.method1601(arg0.field6185, (byte) -121);
            if (var3.field149 || var3.field127[arg0.field6204] < (arg0.field6175 + 1)) {
                var2 = true;
            }
        }
        if (var2) {
            int var4 = arg0.field6171 - arg0.field6179;
            int var5 = class31.field516 - arg0.field6179;
            int var6 = arg0.field6221 * 128 + arg0.method2590(0) * 64;
            int var7 = arg0.field6223 * 128 + arg0.method2590(0) * 64;
            int var8 = arg0.field6168 * 128 + (arg0.method2590(0) * 64);
            int var9 = arg0.field6249 * 128 + (arg0.method2590(0) * 64);
            arg0.field574 = ((var4 - var5) * var7 + var5 * var9) / var4;
            arg0.field584 = ((var4 - var5) * var6 + var5 * var8) / var4;
        }
        arg0.field6263 = 0;
        if (arg0.field6225 == 0) {
            arg0.method2593(8192, false);
        }
        if (!arg1) {
            method1648(60);
        }
        if (arg0.field6225 == 1) {
            arg0.method2593(12288, false);
        }
        if (arg0.field6225 == 2) {
            arg0.method2593(0, false);
        }
        if (arg0.field6225 == 3) {
            arg0.method2593(4096, false);
        }
    }
}
