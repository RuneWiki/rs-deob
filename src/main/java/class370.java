import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vi")
public class class370 extends class433 {

    @OriginalMember(owner = "client!vi", name = "r", descriptor = "I")
    public int field5225 = -1;

    @OriginalMember(owner = "client!vi", name = "u", descriptor = "Lef;")
    public static class263 field5228 = new class263();

    @OriginalMember(owner = "client!vi", name = "x", descriptor = "Z")
    public static boolean field5231 = false;

    @OriginalMember(owner = "client!vi", name = "o", descriptor = "I")
    public int field5222;

    @OriginalMember(owner = "client!vi", name = "p", descriptor = "I")
    public static int field5223;

    @OriginalMember(owner = "client!vi", name = "s", descriptor = "I")
    public static int field5226;

    @OriginalMember(owner = "client!vi", name = "t", descriptor = "I")
    public static int field5227;

    @OriginalMember(owner = "client!vi", name = "v", descriptor = "I")
    public static int field5229;

    @OriginalMember(owner = "client!vi", name = "n", descriptor = "Ljava/lang/String;")
    public String field5221;

    @OriginalMember(owner = "client!vi", name = "q", descriptor = "Ljava/lang/String;")
    public String field5224;

    @OriginalMember(owner = "client!vi", name = "y", descriptor = "[[B")
    public static byte[][] field5232;

    @OriginalMember(owner = "client!vi", name = "w", descriptor = "[[S")
    public static short[][] field5230;

    @OriginalMember(owner = "client!vi", name = "b", descriptor = "(Z)Lvba;", line = 11)
    public final class737 method2322(boolean arg0) {
        if (arg0) {
            return null;
        } else {
            ++field5227;
            return class184.field2528[super.field6047];
        }
    }

    @OriginalMember(owner = "client!vi", name = "e", descriptor = "(I)V", line = 29)
    public static void method2323(int arg0) {
        field5230 = null;
        field5232 = null;
        if (arg0 == -1) {
            field5228 = null;
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(ILuu;)V", line = 41)
    public static final void method2324(int arg0, class237 arg1) {
        class95.field1310 = arg1.method1598("hitmarks", false);
        ++field5226;
        class479.field6663 = arg1.method1598("hitbar_default", false);
        class717.field9984 = arg1.method1598("timerbar_default", false);
        class612.field8232 = arg1.method1598("headicons_pk", false);
        class483.field6738 = arg1.method1598("headicons_prayer", false);
        class577.field7931 = arg1.method1598("hint_headicons", false);
        class43.field527 = arg1.method1598("hint_mapmarkers", false);
        class323.field4477 = arg1.method1598("mapflag", false);
        class251.field3672 = arg1.method1598("cross", false);
        class23.field285 = arg1.method1598("mapdots", false);
        class140.field1994 = arg1.method1598("scrollbar", false);
        class279.field4066 = arg1.method1598("name_icons", false);
        class438.field6112 = arg1.method1598("floorshadows", false);
        int var2 = -46 / ((arg0 - -60) / 51);
        class15.field141 = arg1.method1598("compass", false);
        class85.field1217 = arg1.method1598("otherlevel", false);
        class340.field4812 = arg1.method1598("hint_mapedge", false);
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(Ljava/lang/String;B)I", line = 67)
    public static final int method2325(String arg0, byte arg1) {
        ++field5223;
        if (arg0 == null) {
            return -1;
        } else {
            for (int var2 = 0; ~class239.field3558 < ~var2; ++var2) {
                if (arg0.equalsIgnoreCase(class193.field2627[var2])) {
                    return var2;
                }
            }
            if (arg1 <= 59) {
                field5230 = null;
            }
            return -1;
        }
    }
}
