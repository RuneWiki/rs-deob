import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nd")
public class class270 extends class139 {

    @OriginalMember(owner = "client!nd", name = "G", descriptor = "Ljava/lang/String;")
    public static String field4362 = "cyan:";

    @OriginalMember(owner = "client!nd", name = "F", descriptor = "Ljava/lang/String;")
    public static String field4361 = "You can't add yourself to your own friend list.";

    @OriginalMember(owner = "client!nd", name = "H", descriptor = "I")
    public static int field4363 = 0;

    @OriginalMember(owner = "client!nd", name = "x", descriptor = "I")
    public static int field4353;

    @OriginalMember(owner = "client!nd", name = "y", descriptor = "I")
    public static int field4354;

    @OriginalMember(owner = "client!nd", name = "z", descriptor = "I")
    public static int field4355;

    @OriginalMember(owner = "client!nd", name = "A", descriptor = "I")
    public static int field4356;

    @OriginalMember(owner = "client!nd", name = "B", descriptor = "I")
    public static int field4357;

    @OriginalMember(owner = "client!nd", name = "C", descriptor = "I")
    public static int field4358;

    @OriginalMember(owner = "client!nd", name = "D", descriptor = "I")
    public static int field4359;

    @OriginalMember(owner = "client!nd", name = "E", descriptor = "I")
    public static int field4360;

    @OriginalMember(owner = "client!nd", name = "I", descriptor = "Lnj;")
    private class144 field4364;

    @OriginalMember(owner = "client!nd", name = "e", descriptor = "(I)[Lsi;")
    public static final class204[] method1870(int arg0) {
        class204[] var1 = new class204[class143.field2318];
        for (int var2 = arg0; var2 < class143.field2318; var2++) {
            int var3 = class201.field3220[var2] * class19.field214[var2];
            int[] var4 = new int[var3];
            byte[] var5 = class152.field2505[var2];
            for (int var6 = 0; var6 < var3; var6++) {
                var4[var6] = class101.field1476[class179.method1337(255, var5[var6])];
            }
            var1[var2] = new class140(class262.field4258, class62.field912, class217.field3457[var2], class272.field4377[var2], class19.field214[var2], class201.field3220[var2], var4);
        }
        class188.method1398((byte) 89);
        field4357++;
        return var1;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(ILjava/lang/String;I)Ljava/lang/String;")
    public final String method1871(int arg0, String arg1, int arg2) {
        field4360++;
        if (this.field4364 == null) {
            return arg1;
        }
        class276 var4 = (class276) this.field4364.method1034((long) arg0, (byte) 21);
        if (arg2 != 0) {
            method1870(110);
        }
        return var4 == null ? arg1 : var4.field4423;
    }

    @OriginalMember(owner = "client!nd", name = "f", descriptor = "(I)V")
    public static void method1872(int arg0) {
        field4362 = null;
        field4361 = null;
        if (arg0 <= 37) {
            field4363 = 66;
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(IZI)I")
    public final int method1873(int arg0, boolean arg1, int arg2) {
        field4359++;
        if (arg1) {
            this.method1871(-27, (String) null, -20);
        }
        if (this.field4364 == null) {
            return arg0;
        } else {
            class130 var4 = (class130) this.field4364.method1034((long) arg2, (byte) 21);
            return var4 == null ? arg0 : var4.field1989;
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(II)I")
    public static final int method1874(int arg0, int arg1) {
        if (class180.field2901 != null) {
            class180.field2901.method728((byte) 95);
            class180.field2901 = null;
        }
        field4355++;
        class156.field2562++;
        if (class156.field2562 > 4) {
            class182.field2939 = 0;
            class156.field2562 = 0;
            return arg0;
        }
        class182.field2939 = arg1;
        if (class256.field4223 == class205.field3287) {
            class205.field3287 = class159.field2610;
        } else {
            class205.field3287 = class256.field4223;
        }
        return -1;
    }

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "(II)Lel;")
    public static final class208 method1875(int arg0, int arg1) {
        field4358++;
        class208 var2 = (class208) class275.field4416.method1553((long) arg1, (byte) -102);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class274.field4401.method643(arg1, 4, false);
        class208 var4 = new class208();
        if (var3 != null) {
            var4.method1520(new class152(var3), arg1, arg0);
        }
        class275.field4416.method1551(var4, arg0, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(Lv;IB)V")
    private final void method1876(class152 arg0, int arg1, byte arg2) {
        field4356++;
        if (arg1 == 249) {
            int var4 = arg0.method1111(255);
            if (this.field4364 == null) {
                int var5 = class254.method1801(var4, (byte) 73);
                this.field4364 = new class144(var5);
            }
            for (int var6 = 0; var6 < var4; var6++) {
                boolean var7 = arg0.method1111(255) == 1;
                int var8 = arg0.method1128((byte) -118);
                class280 var9;
                if (var7) {
                    var9 = new class276(arg0.method1078(-1));
                } else {
                    var9 = new class130(arg0.method1097(126));
                }
                this.field4364.method1032(false, var9, (long) var8);
            }
        }
        int var10 = -2 / ((arg2 - 72) / 38);
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(ILv;)V")
    public final void method1877(int arg0, class152 arg1) {
        if (arg0 != 5613) {
            field4362 = null;
        }
        field4353++;
        while (true) {
            int var3 = arg1.method1111(255);
            if (var3 == 0) {
                return;
            }
            this.method1876(arg1, var3, (byte) 110);
        }
    }
}
