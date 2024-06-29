import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hf")
public class class143 {

    @OriginalMember(owner = "client!hf", name = "h", descriptor = "Lmb;")
    public static class96 field2539 = class243.method1708("Nehmen", (byte) 95);

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "Lmb;")
    public static class96 field2532 = class243.method1708("event_opbase", (byte) 113);

    @OriginalMember(owner = "client!hf", name = "j", descriptor = "Z")
    public static boolean field2541 = true;

    @OriginalMember(owner = "client!hf", name = "e", descriptor = "Lmb;")
    public static class96 field2536 = class243.method1708("<col=ffffff> )4 ", (byte) 117);

    @OriginalMember(owner = "client!hf", name = "f", descriptor = "Lmb;")
    public static class96 field2537 = class243.method1708("<br>(X100(U(Y", (byte) 124);

    @OriginalMember(owner = "client!hf", name = "i", descriptor = "B")
    public static byte field2540;

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "I")
    public static int field2533;

    @OriginalMember(owner = "client!hf", name = "c", descriptor = "I")
    public static int field2534;

    @OriginalMember(owner = "client!hf", name = "d", descriptor = "I")
    public static int field2535;

    @OriginalMember(owner = "client!hf", name = "k", descriptor = "I")
    public static int field2542;

    @OriginalMember(owner = "client!hf", name = "g", descriptor = "Lw;")
    public static class107 field2538;

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(B)V")
    public static void method1060(byte arg0) {
        field2538 = null;
        field2539 = null;
        field2536 = null;
        if (arg0 != -104) {
            field2532 = null;
        }
        field2537 = null;
        field2532 = null;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(II)Z")
    public static final boolean method1061(int arg0, int arg1) {
        class36 var2 = class71.method486(arg0, true);
        field2534++;
        if (var2 == null) {
            return false;
        } else if (class123.field2288 == 1 || class123.field2288 == 2 || class44.field755 == 2) {
            byte[] var3 = var2.field624.method709(-79);
            class207.field3575 = new String(var3, 0, var3.length);
            class235.field4032 = var2.field621;
            if (class44.field755 != 0) {
                class226.field3837 = class235.field4032 + 40000;
                class232.field3981 = class235.field4032 + 50000;
                class121.field2239 = class226.field3837;
            }
            return true;
        } else {
            class96 var4 = class268.field4661;
            if (class44.field755 != 0) {
                var4 = class36.method289(-5615, new class96[] { class218.field3735, class31.method205(var2.field621 + 7000, (byte) -78) });
            }
            class96 var5 = class268.field4661;
            if (class192.field3320 != null) {
                var5 = class36.method289(-5615, new class96[] { class19.field310, class192.field3320 });
            }
            class96 var6 = class36.method289(arg1 ^ 0xFFFFEA91, new class96[] { class233.field4000, var2.field624, var4, class36.field610, class31.method205(class156.field2722, (byte) -78), class14.field219, class31.method205(class73.field1255, (byte) -78), var5, class74.field1264, class134.field2412 ? class195.field3356 : class250.field4334, class19.field302, class5.field101 ? class195.field3356 : class250.field4334, class260.field4535, class254.field4390 ? class195.field3356 : class250.field4334 });
            if (arg1 != 128) {
                return true;
            }
            try {
                class242.field4209.getAppletContext().showDocument(var6.method677((byte) 92), "_self");
                return true;
            } catch (Exception var7) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(IIIIII)V")
    public static final void method1062(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class9.field155 = arg2;
        class268.field4665 = arg4;
        if (arg3 != 1557) {
            method1060((byte) 63);
        }
        class249.field4315 = arg5;
        field2535++;
        class200.field3467 = arg1;
        class49.field865 = arg0;
        if (class268.field4665 >= 100) {
            int var6 = class200.field3467 * 128 + 64;
            int var7 = class49.field865 * 128 + 64;
            int var8 = class137.method1025(class216.field3712, var7, var6, (byte) -94) - class249.field4315;
            int var9 = var8 - class105.field1767;
            int var10 = var7 - class22.field389;
            int var11 = var6 - class178.field3078;
            int var12 = (int) Math.sqrt((double) (var10 * var10 + var11 * var11));
            class140.field2501 = (int) (Math.atan2((double) var9, (double) var12) * 325.949D) & 0x7FF;
            class23.field392 = (int) (Math.atan2((double) var11, (double) var10) * -325.949D) & 0x7FF;
            if (class140.field2501 < 128) {
                class140.field2501 = 128;
            }
            if (class140.field2501 > 383) {
                class140.field2501 = 383;
            }
        }
        class179.field3095 = 2;
    }
}
