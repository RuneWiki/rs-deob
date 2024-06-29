import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ki")
public class class157 extends class232 {

    @OriginalMember(owner = "client!ki", name = "M", descriptor = "Lli;")
    public static class213 field2644 = new class213(0, 0);

    @OriginalMember(owner = "client!ki", name = "Q", descriptor = "Lbl;")
    public static class305 field2648 = new class305();

    @OriginalMember(owner = "client!ki", name = "S", descriptor = "Lok;")
    public static class146 field2650 = class235.method1724(-12908, "Liste des mises -9 jour charg-Be");

    @OriginalMember(owner = "client!ki", name = "U", descriptor = "I")
    public static int field2652 = -1;

    @OriginalMember(owner = "client!ki", name = "T", descriptor = "[I")
    public static int[] field2651 = new int[1000];

    @OriginalMember(owner = "client!ki", name = "V", descriptor = "Z")
    public static boolean field2653 = false;

    @OriginalMember(owner = "client!ki", name = "W", descriptor = "Z")
    public static boolean field2654 = true;

    @OriginalMember(owner = "client!ki", name = "X", descriptor = "Lok;")
    public static class146 field2655 = class235.method1724(-12908, "scrollen:");

    @OriginalMember(owner = "client!ki", name = "F", descriptor = "I")
    public static int field2637;

    @OriginalMember(owner = "client!ki", name = "G", descriptor = "I")
    public static int field2638;

    @OriginalMember(owner = "client!ki", name = "H", descriptor = "I")
    public static int field2639;

    @OriginalMember(owner = "client!ki", name = "I", descriptor = "I")
    public static int field2640;

    @OriginalMember(owner = "client!ki", name = "J", descriptor = "I")
    public static int field2641;

    @OriginalMember(owner = "client!ki", name = "K", descriptor = "I")
    public static int field2642;

    @OriginalMember(owner = "client!ki", name = "L", descriptor = "I")
    public static int field2643;

    @OriginalMember(owner = "client!ki", name = "O", descriptor = "I")
    public static int field2646;

    @OriginalMember(owner = "client!ki", name = "P", descriptor = "I")
    public static int field2647;

    @OriginalMember(owner = "client!ki", name = "R", descriptor = "I")
    public static int field2649;

    @OriginalMember(owner = "client!ki", name = "N", descriptor = "Lld;")
    private class118 field2645;

    @OriginalMember(owner = "client!ki", name = "e", descriptor = "(I)I", line = 7)
    public static final int method1228(int arg0) {
        field2642++;
        if (arg0 != 1) {
            method1233(41);
        }
        if (class18.field358 != null) {
            return 3;
        } else if (class271.field4640 && class115.field1846) {
            return 2;
        } else if (class271.field4640 && !class115.field1846) {
            return 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(IIBZJ)Lok;", line = 29)
    public static final class146 method1229(int arg0, int arg1, byte arg2, boolean arg3, long arg4) {
        field2641++;
        class146 var6 = class114.method776(-75, 0);
        if (arg4 < 0L) {
            arg4 = -arg4;
            var6.method1082(class152.field2582, false);
        }
        class146 var7 = class218.field3598;
        class146 var8 = class81.field1296;
        if (arg1 == 1) {
            var8 = class218.field3598;
            var7 = class81.field1296;
        }
        if (arg2 > -122) {
            return (class146) null;
        }
        if (arg1 == 2) {
            var7 = class81.field1296;
            var8 = class57.field1007;
        }
        if (arg1 == 3) {
            var8 = class218.field3598;
            var7 = class81.field1296;
        }
        class146 var9 = class114.method776(68, 0);
        class146 var10 = class114.method776(79, 0);
        for (int var11 = 0; var11 < arg0; var11++) {
            var10.method1082(class82.method585(14744, (int) (arg4 % 10L)), false);
            arg4 /= 10L;
        }
        if (arg4 == 0L) {
            var9 = class55.field978;
        }
        int var12 = 0;
        while (arg4 > 0L) {
            if (arg3 && var12 != 0 && (var12 % 3) == 0) {
                var9.method1082(var8, false);
            }
            var12++;
            var9.method1082(class82.method585(14744, (int) (arg4 % 10L)), false);
            arg4 /= 10L;
        }
        if (var10.method1094((byte) -58) > 0) {
            var10.method1082(var7, false);
        }
        return class112.method758(119, new class146[] { var6, var9.method1124(4486), var10.method1124(4486) });
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(ZII)I", line = 112)
    public final int method1230(boolean arg0, int arg1, int arg2) {
        field2643++;
        if (this.field2645 == null) {
            return arg2;
        }
        class101 var4 = (class101) this.field2645.method810((byte) -122, (long) arg1);
        if (arg0) {
            method1233(-59);
        }
        return var4 == null ? arg2 : var4.field1627;
    }

    @OriginalMember(owner = "client!ki", name = "d", descriptor = "(B)V", line = 134)
    public static final void method1231(byte arg0) {
        if (arg0 != -84) {
            field2650 = (class146) null;
        }
        field2640++;
        class296.field5035.method793((byte) -111);
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(Lwe;BI)V", line = 146)
    private final void method1232(class47 arg0, byte arg1, int arg2) {
        int var4 = 3 % ((arg1 + 37) / 57);
        field2646++;
        if (arg2 != 249) {
            return;
        }
        int var5 = arg0.method368(-101);
        if (this.field2645 == null) {
            int var6 = class272.method1993(var5, 127);
            this.field2645 = new class118(var6);
        }
        for (int var7 = 0; var7 < var5; var7++) {
            boolean var8 = arg0.method368(55) == 1;
            int var9 = arg0.method389((byte) 38);
            class171 var10;
            if (var8) {
                var10 = new class97(arg0.method337(-1));
            } else {
                var10 = new class101(arg0.method373((byte) 36));
            }
            this.field2645.method805(var10, (long) var9, 122);
        }
    }

    @OriginalMember(owner = "client!ki", name = "f", descriptor = "(I)V", line = 190)
    public static void method1233(int arg0) {
        field2650 = null;
        field2648 = null;
        field2644 = null;
        field2651 = null;
        if (arg0 <= 21) {
            method1228(-23);
        }
        field2655 = null;
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(ILok;I)Lok;", line = 208)
    public final class146 method1234(int arg0, class146 arg1, int arg2) {
        field2639++;
        if (this.field2645 == null) {
            return arg1;
        }
        class97 var4 = (class97) this.field2645.method810((byte) -92, (long) arg0);
        if (arg2 < 71) {
            field2653 = true;
        }
        return var4 == null ? arg1 : var4.field1580;
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(Lwe;Z)V", line = 244)
    public final void method1235(class47 arg0, boolean arg1) {
        field2638++;
        while (true) {
            int var3 = arg0.method368(-117);
            if (var3 == 0) {
                if (!arg1) {
                    field2653 = false;
                }
                return;
            }
            this.method1232(arg0, (byte) 125, var3);
        }
    }
}
