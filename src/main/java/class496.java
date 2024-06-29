import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!em")
public class class496 extends class115 {

    @OriginalMember(owner = "client!em", name = "k", descriptor = "I")
    public int field7356;

    @OriginalMember(owner = "client!em", name = "m", descriptor = "I")
    public int field7358;

    @OriginalMember(owner = "client!em", name = "j", descriptor = "Laa;")
    public static class76 field7355 = new class76(80, -1);

    @OriginalMember(owner = "client!em", name = "n", descriptor = "Luv;")
    public static class2 field7359 = new class2(38, 9);

    @OriginalMember(owner = "client!em", name = "p", descriptor = "Z")
    public static boolean field7361 = false;

    @OriginalMember(owner = "client!em", name = "i", descriptor = "I")
    public static int field7354;

    @OriginalMember(owner = "client!em", name = "l", descriptor = "I")
    public static int field7357;

    @OriginalMember(owner = "client!em", name = "o", descriptor = "Luv;")
    public static class2 field7360;

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(I)V")
    public static void method2944(int arg0) {
        field7359 = null;
        if (arg0 == -8) {
            field7360 = null;
            field7355 = null;
        }
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(IIIZI)V")
    public static final void method2945(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        field7354++;
        if (class503.field7411 == 1) {
            class76.field1074[class341.field5247 / 100].method936(class154.field2338 - 8, class90.field1410 + -8);
        }
        if (!arg3) {
            method2945(-90, 1, 7, false, 12);
        }
        if (class503.field7411 == 2) {
            class76.field1074[class341.field5247 / 100 + 4].method936(class154.field2338 - 8, class90.field1410 + -8);
        }
        class448.method2622(9492);
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(Z)Z")
    public static final boolean method2946(boolean arg0) {
        field7357++;
        try {
            return arg0 ? class461.method2670((byte) -115) : false;
        } catch (IOException var4) {
            class18.method207(-32);
            return true;
        } catch (Exception var5) {
            String var2 = "T2 - " + (class305.field4553 == null ? -1 : class305.field4553.method6(94)) + "," + (class400.field6033 == null ? -1 : class400.field6033.method6(97)) + "," + (class2.field16 == null ? -1 : class2.field16.method6(109)) + " - " + class158.field2386 + "," + (class410.field6198.field6065[0] + class267.field3979) + "," + (class410.field6198.field6068[0] + class241.field3358) + " - ";
            for (int var3 = 0; class158.field2386 > var3 && var3 < 50; var3++) {
                var2 = var2 + class400.field5966.field6868[var3] + ",";
            }
            class488.method2913(0, var5, var2);
            class457.method2654(false, 114);
            return true;
        }
    }

    @OriginalMember(owner = "client!em", name = "<init>", descriptor = "(II)V")
    public class496(int arg0, int arg1) {
        this.field7356 = arg1;
        this.field7358 = arg0;
    }
}
