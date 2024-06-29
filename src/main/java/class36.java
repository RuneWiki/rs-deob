import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wq")
public class class36 {

    @OriginalMember(owner = "client!wq", name = "c", descriptor = "[Lre;")
    public static class388[] field442 = new class388[5];

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "I")
    public int field440;

    @OriginalMember(owner = "client!wq", name = "b", descriptor = "I")
    public static int field441;

    @OriginalMember(owner = "client!wq", name = "d", descriptor = "I")
    public int field443;

    @OriginalMember(owner = "client!wq", name = "e", descriptor = "I")
    public static int field444;

    @OriginalMember(owner = "client!wq", name = "f", descriptor = "I")
    public static int field445;

    @OriginalMember(owner = "client!wq", name = "g", descriptor = "I")
    public static int field446;

    @OriginalMember(owner = "client!wq", name = "i", descriptor = "I")
    public static int field448;

    @OriginalMember(owner = "client!wq", name = "j", descriptor = "I")
    public int field449;

    @OriginalMember(owner = "client!wq", name = "h", descriptor = "[Ljava/lang/String;")
    public static String[] field447;

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(ILvt;Z)V")
    private final void method182(int arg0, class179 arg1, boolean arg2) {
        if (!arg2) {
            this.method183(false, (class179) null);
        }
        field444++;
        if (arg0 == 1) {
            this.field443 = arg1.method916(21933);
            this.field449 = arg1.method895((byte) -97);
            this.field440 = arg1.method895((byte) -99);
        }
    }

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(ZLvt;)V")
    public final void method183(boolean arg0, class179 arg1) {
        if (!arg0) {
            method186((byte) 30);
        }
        field448++;
        while (true) {
            int var3 = arg1.method895((byte) -91);
            if (var3 == 0) {
                return;
            }
            this.method182(var3, arg1, true);
        }
    }

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(Loj;Lg;I)V")
    public static final void method184(class280 arg0, class470 arg1, int arg2) {
        field446++;
        if (class206.field2836) {
            return;
        }
        arg0.method1444(0);
        class94.field1180 = arg0.method1426(class473.method2797(arg1, class20.field280), true);
        class94.field1180.method2363((class110.field1336 - class94.field1180.method216()) / 2, (class464.field6541 - class94.field1180.method222()) / 2);
        class68.field848 = arg0.method1426(class473.method2797(arg1, class58.field735), true);
        class68.field848.method2363((class110.field1336 - class68.field848.method216()) / arg2, 18);
        class206.field2836 = true;
    }

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(Z)V")
    public static final void method185(boolean arg0) {
        if (arg0) {
            method184((class280) null, (class470) null, 44);
        }
        field445++;
        if (class471.field6644) {
            return;
        }
        class83.field1010 = true;
        if (class92.field1146) {
            class31.field389 = (float) ((int) class31.field389 - 17 & 0xFFFFFFF0);
        } else {
            class195.field2667 += (-12.0F - class195.field2667) / 2.0F;
        }
        class471.field6644 = true;
    }

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(B)V")
    public static void method186(byte arg0) {
        field447 = null;
        field442 = null;
        if (arg0 != 36) {
            method184((class280) null, (class470) null, 18);
        }
    }

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(IIILjava/lang/String;I)V")
    public static final void method187(int arg0, int arg1, int arg2, String arg3, int arg4) {
        field441++;
        class256 var5 = class66.method339(arg4, 0, arg1);
        if (var5 == null) {
            return;
        }
        if (var5.field3631 != null) {
            class35 var6 = new class35();
            var6.field419 = arg0;
            var6.field429 = var5;
            var6.field425 = arg3;
            var6.field435 = var5.field3631;
            class396.method2371(var6);
        }
        boolean var7 = true;
        if (var5.field3591 != 0) {
            var7 = class199.method1086(var5, (byte) 44);
        }
        if (!var7 || !client.method1660(var5).method1764(arg0 - 1, (byte) 123)) {
            return;
        }
        if (arg0 == 1) {
            class244.method1332((byte) -120, class93.field1156);
            class282.field4103++;
            class432.method2585(arg1, -1516, arg4, var5.field3585);
        }
        if (arg0 == 2) {
            class244.method1332((byte) 124, class217.field3053);
            class285.field4186++;
            class432.method2585(arg1, -1516, arg4, var5.field3585);
        }
        if (arg0 == 3) {
            class244.method1332((byte) -59, class249.field3502);
            class22.field306++;
            class432.method2585(arg1, -1516, arg4, var5.field3585);
        }
        if (arg0 == 4) {
            class244.method1332((byte) 125, class159.field1896);
            class360.field5186++;
            class432.method2585(arg1, -1516, arg4, var5.field3585);
        }
        if (arg0 == 5) {
            class237.field3280++;
            class244.method1332((byte) 127, class186.field2446);
            class432.method2585(arg1, -1516, arg4, var5.field3585);
        }
        if (arg0 == 6) {
            class259.field3737++;
            class244.method1332((byte) 126, class218.field3066);
            class432.method2585(arg1, -1516, arg4, var5.field3585);
        }
        if (arg0 == 7) {
            class244.method1332((byte) 124, class217.field2993);
            class45.field581++;
            class432.method2585(arg1, -1516, arg4, var5.field3585);
        }
        if (arg0 == 8) {
            class421.field6068++;
            class244.method1332((byte) -56, class83.field1006);
            class432.method2585(arg1, -1516, arg4, var5.field3585);
        }
        if (arg2 < 33) {
            return;
        }
        if (arg0 == 9) {
            class244.method1332((byte) 126, class249.field3492);
            class223.field3094++;
            class432.method2585(arg1, -1516, arg4, var5.field3585);
        }
        if (arg0 == 10) {
            class244.method1332((byte) -17, class186.field2443);
            class361.field5196++;
            class432.method2585(arg1, -1516, arg4, var5.field3585);
        }
    }

    static {
        for (int var0 = 0; var0 < field442.length; var0++) {
            field442[var0] = new class388();
        }
    }
}
