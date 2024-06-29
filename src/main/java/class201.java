import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vh")
public class class201 extends class359 {

    @OriginalMember(owner = "client!vh", name = "i", descriptor = "[I")
    public static int[] field2770 = new int[1024];

    @OriginalMember(owner = "client!vh", name = "m", descriptor = "Lcs;")
    public static class189 field2774 = new class189(32);

    @OriginalMember(owner = "client!vh", name = "p", descriptor = "Lcs;")
    public static class189 field2777 = new class189(16);

    @OriginalMember(owner = "client!vh", name = "q", descriptor = "[[I")
    public static int[][] field2778 = new int[][] { { 0, 1, 2, 3 }, { 1, -1, -1, 0 }, { -1, 2, -1, 0 }, { -1, 0, -1, 2 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 3, 4, -1 }, { -1, 0, 2, -1 }, { -1, -1, 2, 0 }, { 0, 2, 5, 3 }, { 0, -1, 6, -1 }, { 0, 1, 2, 3 } };

    @OriginalMember(owner = "client!vh", name = "j", descriptor = "I")
    public int field2771;

    @OriginalMember(owner = "client!vh", name = "k", descriptor = "I")
    public static int field2772;

    @OriginalMember(owner = "client!vh", name = "l", descriptor = "I")
    public static int field2773;

    @OriginalMember(owner = "client!vh", name = "n", descriptor = "I")
    public static int field2775;

    @OriginalMember(owner = "client!vh", name = "o", descriptor = "I")
    public int field2776;

    @OriginalMember(owner = "client!vh", name = "c", descriptor = "(B)V", line = 6)
    public static void method1287(byte arg0) {
        field2778 = null;
        field2777 = null;
        field2770 = null;
        if (arg0 == -127) {
            field2774 = null;
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(IIB)I", line = 21)
    public static final int method1288(int arg0, int arg1, byte arg2) {
        field2772++;
        if (arg2 != -72) {
            field2773 = 49;
        }
        int var3 = arg1 * 57 + arg0;
        int var4 = var3 ^ var3 << 13;
        int var5 = (var4 * var4 * 15731 + 789221) * var4 + 1376312589 & Integer.MAX_VALUE;
        return (var5 & 0x7FBEB6D) >> 19;
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(IIIZII)V", line = 55)
    public static final void method1289(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        field2775++;
        if (arg3) {
            class32.method189(arg5 + 96);
        }
        if (arg5 != -97) {
            method1288(22, 55, (byte) -119);
        }
        if (class223.field3042 != null && (arg2 != 3 || class373.field5445 != arg4 || class430.field6235 != arg1)) {
            class19.method132(class223.field3042, class323.field4554, (byte) 27);
            class223.field3042 = null;
        }
        if (arg2 == 3 && class223.field3042 == null) {
            class223.field3042 = class188.method1200(class323.field4554, (byte) -118, 0, arg4, arg1, 0);
            if (class223.field3042 != null) {
                class373.field5445 = arg4;
                class430.field6235 = arg1;
                class193.method1232(27875, class323.field4554);
            }
        }
        if (arg2 == 3 && class223.field3042 == null) {
            method1289(arg0, -1, class288.field4081, true, -1, arg5);
            return;
        }
        Container var7;
        if (class223.field3042 != null) {
            class384.field5628 = arg1;
            class356.field5219 = arg4;
            var7 = class223.field3042;
        } else if (class252.field3406 == null) {
            var7 = class323.field4554.field5559;
            class356.field5219 = var7.getSize().width;
            class384.field5628 = var7.getSize().height;
        } else {
            Insets var6 = class252.field3406.getInsets();
            int var10001 = var6.left + var6.right;
            class356.field5219 = class252.field3406.getSize().width - var10001;
            int var12 = var6.top + var6.bottom;
            class384.field5628 = class252.field3406.getSize().height - var12;
            var7 = class252.field3406;
        }
        if (arg2 == 1) {
            class38.field389 = 765;
            class99.field1111 = (class356.field5219 - 765) / 2;
            class222.field3039 = 503;
            class375.field5479 = 0;
        } else if (class343.field5053 < 96 && class341.field5018 == 0) {
            int var8 = class356.field5219 > 1024 ? 1024 : class356.field5219;
            int var9 = class384.field5628 > 768 ? 768 : class384.field5628;
            class99.field1111 = (class356.field5219 - var8) / 2;
            class38.field389 = var8;
            class222.field3039 = var9;
            class375.field5479 = 0;
        } else {
            class375.field5479 = 0;
            class38.field389 = class356.field5219;
            class222.field3039 = class384.field5628;
            class99.field1111 = 0;
        }
        if (class213.field2908 != 0) {
            boolean var10000;
            if (class38.field389 < 1024 && class222.field3039 < 768) {
                var10000 = true;
            } else {
                var10000 = false;
            }
        }
        if (arg3) {
            client.method1065((byte) -77, class341.field5018);
        } else {
            class348.field5096.setSize(class38.field389, class222.field3039);
            if (class218.field2991 != null) {
                class218.field2991.method1006();
            }
            if (class252.field3406 == var7) {
                Insets var10 = class252.field3406.getInsets();
                class348.field5096.setLocation(class99.field1111 + var10.left, class375.field5479 + var10.top);
            } else {
                class348.field5096.setLocation(class99.field1111, class375.field5479);
            }
        }
        if (arg2 >= 2) {
            class364.field5294 = true;
        } else {
            class364.field5294 = false;
        }
        if (class424.field6086 != -1) {
            class151.method902(true, true);
        }
        if (class330.field4719 != null && (class105.field1191 == 30 || class105.field1191 == 25)) {
            class27.method160(39);
        }
        for (int var11 = 0; var11 < 100; var11++) {
            class266.field3723[var11] = true;
        }
        class162.field2285 = true;
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(Llj;III)V", line = 210)
    public static final void method1290(class362 arg0, int arg1, int arg2, int arg3) {
        int var4 = class124.field1648[arg1][arg2][arg3];
        int var5 = 0;
        arg0.field5282 = 0;
        while (var5 <= 24) {
            int var6 = var4 >> var5 & 0xFF;
            if (var6 <= 0) {
                break;
            }
            arg0.field5280[arg0.field5282++] = class256.field3438[var6 - 1];
            var5 += 8;
        }
        for (int var7 = arg0.field5282; var7 < 4; var7++) {
            arg0.field5280[var7] = null;
        }
    }
}
