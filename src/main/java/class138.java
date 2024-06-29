import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dj")
public abstract class class138 {

    @OriginalMember(owner = "client!dj", name = "j", descriptor = "S")
    public static short field2251 = 1;

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "I")
    public static int field2242;

    @OriginalMember(owner = "client!dj", name = "b", descriptor = "I")
    public static int field2243;

    @OriginalMember(owner = "client!dj", name = "d", descriptor = "I")
    public static int field2245;

    @OriginalMember(owner = "client!dj", name = "e", descriptor = "I")
    public static int field2246;

    @OriginalMember(owner = "client!dj", name = "f", descriptor = "I")
    public int field2247;

    @OriginalMember(owner = "client!dj", name = "g", descriptor = "I")
    public static int field2248;

    @OriginalMember(owner = "client!dj", name = "h", descriptor = "I")
    public int field2249;

    @OriginalMember(owner = "client!dj", name = "i", descriptor = "I")
    public int field2250;

    @OriginalMember(owner = "client!dj", name = "k", descriptor = "I")
    public static int field2252;

    @OriginalMember(owner = "client!dj", name = "l", descriptor = "I")
    public int field2253;

    @OriginalMember(owner = "client!dj", name = "n", descriptor = "I")
    public int field2255;

    @OriginalMember(owner = "client!dj", name = "o", descriptor = "I")
    public static int field2256;

    @OriginalMember(owner = "client!dj", name = "p", descriptor = "I")
    public static int field2257;

    @OriginalMember(owner = "client!dj", name = "q", descriptor = "I")
    public int field2258;

    @OriginalMember(owner = "client!dj", name = "c", descriptor = "Llc;")
    public static class270 field2244;

    @OriginalMember(owner = "client!dj", name = "m", descriptor = "[I")
    public static int[] field2254;

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(Z)V")
    public static final void method1040(boolean arg0) {
        field2246++;
        if (arg0) {
            field2243 = -127;
        }
        class139.field2259.method1420((byte) -124);
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(II)V")
    public abstract void method1041(int arg0, int arg1);

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(III)V")
    public abstract void method1042(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!dj", name = "b", descriptor = "(II)V")
    public static final void method1043(int arg0, int arg1) {
        field2257++;
        class39.field521 = -1;
        if (arg1 <= 4) {
            field2244 = null;
        }
        class270.field4342 = -1;
        class30.field319 = arg0;
        class82.method619(-1);
    }

    @OriginalMember(owner = "client!dj", name = "b", descriptor = "(Z)V")
    public static final void method1044(boolean arg0) {
        field2256++;
        if (class171.field2581) {
            return;
        }
        if (class299.field4829) {
            class102.field1736 = (float) ((int) class102.field1736 - 65 & 0xFFFFFF80);
        } else {
            class280.field4521 += (-class280.field4521 - 24.0F) / 2.0F;
        }
        class180.field2709 = true;
        class171.field2581 = arg0;
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(I)V")
    public static final void method1045(int arg0) {
        field2245++;
        class256.field3877 = null;
        if (arg0 != -8510) {
            method1045(44);
        }
        class85.method634(class137.field2230, class179.field2677, 0, -1, 48, 0, 0, class1.field17, 0);
        if (class256.field3877 != null) {
            class303.method2066(class179.field2677, -1412584499, 0, 0, class170.field2577, class287.field4603, class137.field2230, -11580, class132.field2178.field4200, class256.field3877);
            class256.field3877 = null;
        }
    }

    @OriginalMember(owner = "client!dj", name = "a", descriptor = "(B)V")
    public static void method1046(byte arg0) {
        field2254 = null;
        if (arg0 <= -13) {
            field2244 = null;
        }
    }
}
