import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nu")
public class class258 {

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "B")
    public byte field3498;

    @OriginalMember(owner = "client!nu", name = "i", descriptor = "I")
    public int field3506;

    @OriginalMember(owner = "client!nu", name = "f", descriptor = "B")
    public byte field3503;

    @OriginalMember(owner = "client!nu", name = "b", descriptor = "S")
    public short field3499;

    @OriginalMember(owner = "client!nu", name = "h", descriptor = "S")
    public short field3505;

    @OriginalMember(owner = "client!nu", name = "c", descriptor = "Z")
    public boolean field3500;

    @OriginalMember(owner = "client!nu", name = "e", descriptor = "S")
    public short field3502;

    @OriginalMember(owner = "client!nu", name = "k", descriptor = "Lhi;")
    public static class45 field3508 = new class45(52, 4);

    @OriginalMember(owner = "client!nu", name = "d", descriptor = "I")
    public static int field3501;

    @OriginalMember(owner = "client!nu", name = "g", descriptor = "I")
    public static int field3504;

    @OriginalMember(owner = "client!nu", name = "j", descriptor = "I")
    public static int field3507;

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "(IIIII)Lnu;", line = 3)
    public final class258 method1532(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3501++;
        int var6 = 7 % ((arg3 - 73) / 46);
        return new class258(arg1, arg2, arg4, arg0, this.field3502, this.field3505, this.field3499, this.field3498, this.field3503, this.field3500);
    }

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "(I)V", line = 17)
    public static final void method1533(int arg0) {
        field3504++;
        if (class26.field358 != null) {
            return;
        }
        Container var1;
        if (class391.field5642 == null) {
            var1 = class346.field4985.field2623;
        } else {
            var1 = class391.field5642;
        }
        class233.field3246 = var1.getSize().width;
        class389.field5618 = var1.getSize().height;
        if (class391.field5642 == var1) {
            Insets var2 = class391.field5642.getInsets();
            class233.field3246 -= var2.right + var2.left;
            class389.field5618 -= var2.top + var2.bottom;
        }
        if (arg0 >= -72) {
            field3508 = null;
        }
        if (class75.method586((byte) 72) == 1) {
            class348.field5033 = class3.field38;
            class74.field1046 = 0;
            class122.field1894 = (class233.field3246 - class109.field1768) / 2;
            class66.field953 = class109.field1768;
        } else if (class20.field294 < 96 && class195.field2849 == 0) {
            int var3 = class233.field3246 > 1024 ? 1024 : class233.field3246;
            int var4 = class389.field5618 > 768 ? 768 : class389.field5618;
            class66.field953 = var3;
            class122.field1894 = (class233.field3246 - var3) / 2;
            class74.field1046 = 0;
            class348.field5033 = var4;
        } else {
            class74.field1046 = 0;
            class122.field1894 = 0;
            class66.field953 = class233.field3246;
            class348.field5033 = class389.field5618;
        }
        if (class81.field1144 != class523.field7659) {
            boolean var10000;
            if (class66.field953 < 1024 && class348.field5033 < 768) {
                var10000 = true;
            } else {
                var10000 = false;
            }
        }
        class415.field6025.setSize(class66.field953, class348.field5033);
        if (class275.field3737 != null) {
            class275.field3737.method454(class415.field6025);
        }
        if (class391.field5642 == var1) {
            Insets var5 = class391.field5642.getInsets();
            class415.field6025.setLocation(class122.field1894 + var5.left, class74.field1046 + var5.top);
        } else {
            class415.field6025.setLocation(class122.field1894, class74.field1046);
        }
        if (class236.field3268 != -1) {
            class454.method2663(true, true);
        }
        class366.method2191(0);
    }

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "(ZLza;J)V", line = 113)
    public static final void method1534(boolean arg0, class295 arg1, long arg2) {
        class182.field2702 = class197.field2894;
        field3507++;
        class228.field3203 = 0;
        if (!arg0) {
            method1535(-77, 92, -58, null, null);
        }
        class197.field2894 = 0;
        long var4 = class254.method1522((byte) -51);
        for (class471 var6 = (class471) class32.field475.method2600((byte) -79); var6 != null; var6 = (class471) class32.field475.method2601(114)) {
            if (var6.method2728(arg1, arg2)) {
                class228.field3203++;
            }
        }
        if (class421.field6110 && arg2 % 100L == 0L) {
            System.out.println("Particle system count: " + class32.field475.method2602((byte) -31) + ", running: " + class228.field3203 + ". Particles: " + class197.field2894 + ". Time taken: " + (class254.method1522((byte) -51) - var4) + "ms");
        }
    }

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "(IIILbp;Lbp;)V", line = 147)
    public static final void method1535(int arg0, int arg1, int arg2, class63 arg3, class63 arg4) {
        class532 var5 = class307.method1778(arg0, arg1, arg2);
        if (var5 != null) {
            var5.field7833 = arg3;
            var5.field7835 = arg4;
        }
    }

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "(B)V", line = 157)
    public static void method1536(byte arg0) {
        if (arg0 <= -43) {
            field3508 = null;
        }
    }

    @OriginalMember(owner = "client!nu", name = "<init>", descriptor = "(IIIIIIIIIZ)V", line = 175)
    public class258(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9) {
        this.field3498 = (byte) arg7;
        this.field3506 = arg0;
        this.field3503 = (byte) arg8;
        this.field3499 = (short) arg6;
        this.field3505 = (short) arg5;
        this.field3500 = arg9;
        this.field3502 = (short) arg4;
    }
}
