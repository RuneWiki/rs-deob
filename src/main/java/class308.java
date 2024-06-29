import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ve")
public class class308 {

    @OriginalMember(owner = "client!ve", name = "c", descriptor = "[I")
    public static int[] field4399 = new int[13];

    @OriginalMember(owner = "client!ve", name = "e", descriptor = "[Lep;")
    public static class146[] field4401 = new class146[5];

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "J")
    public static long field4397 = 0L;

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "I")
    public static int field4398;

    @OriginalMember(owner = "client!ve", name = "d", descriptor = "I")
    public static int field4400;

    @OriginalMember(owner = "client!ve", name = "f", descriptor = "I")
    public static int field4402;

    @OriginalMember(owner = "client!ve", name = "g", descriptor = "I")
    public static int field4403;

    @OriginalMember(owner = "client!ve", name = "h", descriptor = "Lls;")
    public static class297 field4404;

    static {
        for (int var0 = 0; var0 < field4401.length; var0++) {
            field4401[var0] = new class146();
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(IIIIIIIIIIZ)Z", line = 6)
    public static final boolean method1928(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, boolean arg10) {
        field4402++;
        int var11 = class205.method1291(arg7, arg2, arg6, arg8, class49.field691, arg10, -12757, class231.field3266, arg5, class100.field1350.method130((byte) -51), arg4, arg0, arg1, arg9, class119.field1605[class193.field2688]);
        if (var11 < 1) {
            return false;
        }
        class82.field1154 = class49.field691[var11 - 1];
        class70.field967 = class231.field3266[var11 - 1];
        class405.field6086 = false;
        class203.method1281((byte) -117);
        int var12 = -96 / ((50 - arg3) / 35);
        return true;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(ILqj;)V", line = 28)
    public static final void method1929(int arg0, class238 arg1) {
        if (arg0 != 1) {
            return;
        }
        class27.field483 = arg1.method1467(110, "p11_full");
        field4400++;
        class247.field3443 = arg1.method1467(97, "p12_full");
        class81.field1132 = arg1.method1467(112, "b12_full");
        class402.field5981 = arg1.method1467(113, "hitmarks");
        class306.field4373 = arg1.method1467(99, "hitbar_default");
        class425.field6319 = arg1.method1467(arg0 + 109, "timerbar_default");
        class165.field2143 = arg1.method1467(126, "headicons_pk");
        class219.field3102 = arg1.method1467(108, "headicons_prayer");
        class213.field3021 = arg1.method1467(95, "hint_headicons");
        class169.field2217 = arg1.method1467(120, "hint_mapmarkers");
        class232.field3278 = arg1.method1467(124, "mapflag");
        class106.field1423 = arg1.method1467(arg0 + 120, "cross");
        class91.field1265 = arg1.method1467(98, "mapdots");
        class119.field1603 = arg1.method1467(113, "scrollbar");
        class125.field1659 = arg1.method1467(arg0 ^ 0x7C, "name_icons");
        class259.field3769 = arg1.method1467(110, "floorshadows");
        class132.field1774 = arg1.method1467(107, "compass");
        class437.field6412 = arg1.method1467(112, "hint_mapedge");
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(I)V", line = 56)
    public static void method1930(int arg0) {
        if (arg0 != -23369) {
            field4401 = null;
        }
        field4404 = null;
        field4399 = null;
        field4401 = null;
    }
}
