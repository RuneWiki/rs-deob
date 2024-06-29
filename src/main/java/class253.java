import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!df")
public class class253 {

    @OriginalMember(owner = "client!df", name = "a", descriptor = "I")
    public int field4098 = -1;

    @OriginalMember(owner = "client!df", name = "c", descriptor = "Z")
    public static boolean field4100 = true;

    @OriginalMember(owner = "client!df", name = "e", descriptor = "S")
    public static short field4102 = 205;

    @OriginalMember(owner = "client!df", name = "b", descriptor = "I")
    public static int field4099;

    @OriginalMember(owner = "client!df", name = "h", descriptor = "I")
    public static int field4105;

    @OriginalMember(owner = "client!df", name = "i", descriptor = "I")
    public static int field4106;

    @OriginalMember(owner = "client!df", name = "d", descriptor = "Laa;")
    public class57 field4101;

    @OriginalMember(owner = "client!df", name = "g", descriptor = "[I")
    public int[] field4104;

    @OriginalMember(owner = "client!df", name = "f", descriptor = "[Ljava/lang/String;")
    public String[] field4103;

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(IIIIZZI)V")
    public static final void method1740(int arg0, int arg1, int arg2, int arg3, boolean arg4, boolean arg5, int arg6) {
        if (arg3 != -13887) {
            return;
        }
        if (arg0 < arg6) {
            int var7 = (arg0 + arg6) / 2;
            int var8 = arg0;
            class68 var9 = class471.field7209[var7];
            class471.field7209[var7] = class471.field7209[arg6];
            class471.field7209[arg6] = var9;
            for (int var10 = arg0; var10 < arg6; var10++) {
                if (class147.method892(true, arg5, var9, class471.field7209[var10], arg2, arg1, arg4) <= 0) {
                    class68 var11 = class471.field7209[var10];
                    class471.field7209[var10] = class471.field7209[var8];
                    class471.field7209[var8++] = var11;
                }
            }
            class471.field7209[arg6] = class471.field7209[var8];
            class471.field7209[var8] = var9;
            method1740(arg0, arg1, arg2, -13887, arg4, arg5, var8 - 1);
            method1740(var8 + 1, arg1, arg2, -13887, arg4, arg5, arg6);
        }
        field4105++;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(B)V")
    public static final void method1741(byte arg0) {
        if (arg0 < 36) {
            method1740(-120, -30, 117, -115, false, false, 0);
        }
        for (int var1 = 0; var1 < 5; var1++) {
            class51.field689[var1] = false;
        }
        field4099++;
        class252.field4079 = class88.field1278;
        class155.field2061 = class371.field5703;
        class61.field954 = class163.field2367;
        class240.field3913 = 0;
        class322.field5008 = class387.field5912;
        class460.field7101 = 0;
        class132.field1797 = -1;
        class292.field4605 = -1;
        class357.field5536 = class220.field3723;
        class334.field5222 = 5;
        class231.field3817 = class98.field1404;
    }
}
