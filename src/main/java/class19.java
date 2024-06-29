import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!he")
public class class19 extends class64 {

    @OriginalMember(owner = "client!he", name = "t", descriptor = "[I")
    public int[] field286 = new int[1];

    @OriginalMember(owner = "client!he", name = "x", descriptor = "[I")
    public int[] field290 = new int[] { -1 };

    @OriginalMember(owner = "client!he", name = "w", descriptor = "Lve;")
    public static class189 field289 = new class189(64);

    @OriginalMember(owner = "client!he", name = "q", descriptor = "I")
    public static int field283;

    @OriginalMember(owner = "client!he", name = "r", descriptor = "I")
    public static int field284;

    @OriginalMember(owner = "client!he", name = "s", descriptor = "I")
    public static int field285;

    @OriginalMember(owner = "client!he", name = "u", descriptor = "I")
    public static int field287;

    @OriginalMember(owner = "client!he", name = "v", descriptor = "I")
    public static int field288;

    @OriginalMember(owner = "client!he", name = "y", descriptor = "Lal;")
    public static class230 field291;

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(Ljava/lang/String;I)V")
    public static final void method106(String arg0, int arg1) {
        System.out.println("Error: " + class159.method1145("\n", "%0a", arg0, arg1 ^ 0x2B45));
        if (arg1 == -11068) {
            field285++;
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(IB)V")
    public static final void method107(int arg0, byte arg1) {
        field287++;
        int var2 = -43 / (-arg1 / 43);
        class9.field118.method1289(arg0, 91);
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(IIIIZZI)V")
    public static final void method108(int arg0, int arg1, int arg2, int arg3, boolean arg4, boolean arg5, int arg6) {
        field283++;
        if (arg0 == 3) {
            method108(class169.field3137, 34, -1, arg3, true, true, -1);
            return;
        }
        Container var7;
        if (class47.field756 != null) {
            var7 = class47.field756;
        } else if (class69.field1203 == null) {
            var7 = class272.field4900.field436;
        } else {
            var7 = class69.field1203;
        }
        class35.field530 = var7.getSize().width;
        class273.field4910 = var7.getSize().height;
        if (class69.field1203 == var7) {
            Insets var8 = class69.field1203.getInsets();
            class35.field530 -= var8.right + var8.left;
            class273.field4910 -= var8.top + var8.bottom;
        }
        if (arg1 != 34) {
            method110(72L, 22);
        }
        if (arg0 < 2) {
            class112.field1926 = 0;
            class240.field4197 = 503;
            class213.field3772 = (class35.field530 - 765) / 2;
            class218.field3851 = 765;
        } else {
            class218.field3851 = class35.field530;
            class213.field3772 = 0;
            class112.field1926 = 0;
            class240.field4197 = class273.field4910;
        }
        if (arg5) {
            class37.method220(-1, class244.field4295);
            class108.method751(class244.field4295, 0);
            if (class25.field381 != null) {
                class25.field381.method251((byte) 52, class244.field4295);
            }
            class140.field2578.method1950((byte) -127);
            class247.method1721((byte) 112, class244.field4295);
            class75.method538(0, class244.field4295);
            if (class25.field381 != null) {
                class25.field381.method248(false, class244.field4295);
            }
        } else {
            class244.field4295.setSize(class218.field3851, class240.field4197);
            if (class69.field1203 == var7) {
                Insets var9 = class69.field1203.getInsets();
                class244.field4295.setLocation(class213.field3772 + var9.left, class112.field1926 + var9.top);
            } else {
                class244.field4295.setLocation(class213.field3772, class112.field1926);
            }
        }
        if (arg0 > 0) {
            method108(0, 34, -1, arg3, true, true, -1);
            return;
        }
        class279.field4985 = !class123.method869(true);
        if (class11.field161 != -1) {
            class259.method1783(true, false);
        }
        if (class164.field3047 != null && (class107.field1845 == 30 || class107.field1845 == 25)) {
            class147.method1008((byte) -102);
        }
        for (int var10 = 0; var10 < 100; var10++) {
            class94.field1664[var10] = true;
        }
        class218.field3852 = true;
    }

    @OriginalMember(owner = "client!he", name = "c", descriptor = "(B)V")
    public static void method109(byte arg0) {
        int var1 = 69 % ((arg0 - 64) / 54);
        field291 = null;
        field289 = null;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(JI)V")
    public static final void method110(long arg0, int arg1) {
        field284++;
        if ((long) arg1 == arg0) {
            return;
        }
        if (class16.field229 >= 100) {
            class264.method1841(true, class271.field4885, class171.field3158, 0);
            return;
        }
        class149 var3 = class258.method1780((byte) -72, arg0).method1022(0);
        for (int var4 = 0; var4 < class16.field229; var4++) {
            if (class139.field2545[var4] == arg0) {
                class264.method1841(true, class237.method1603(new class149[] { var3, class173.field3195 }, -94), class171.field3158, 0);
                return;
            }
        }
        for (int var5 = 0; var5 < class49.field892; var5++) {
            if (class87.field1589[var5] == arg0) {
                class264.method1841(true, class237.method1603(new class149[] { class244.field4284, var3, class98.field1742 }, -96), class171.field3158, 0);
                return;
            }
        }
        if (var3.method1041((byte) -62, class77.field1449.field2243)) {
            class264.method1841(true, class126.field2208, class171.field3158, 0);
            return;
        }
        class233.field4106++;
        class139.field2545[class16.field229] = arg0;
        class31.field457[class16.field229++] = class258.method1780((byte) -72, arg0);
        class38.field562 = class90.field1606;
        class208.field3720.method162(arg1 + 2, 34);
        class208.field3720.method496(2, arg0);
    }
}
