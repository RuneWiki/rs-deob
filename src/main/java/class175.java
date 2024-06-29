import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ia")
public class class175 extends class73 {

    @OriginalMember(owner = "client!ia", name = "o", descriptor = "Lli;")
    public static class185 field3198 = class245.method1649("::mm", 122);

    @OriginalMember(owner = "client!ia", name = "u", descriptor = "Lli;")
    public static class185 field3204 = class245.method1649("::rect_debug", -2);

    @OriginalMember(owner = "client!ia", name = "t", descriptor = "Lli;")
    private static class185 field3203 = class245.method1649("Loaded interfaces", -4);

    @OriginalMember(owner = "client!ia", name = "y", descriptor = "Lli;")
    public static class185 field3208 = field3203;

    @OriginalMember(owner = "client!ia", name = "x", descriptor = "Lli;")
    public static class185 field3207 = class245.method1649("Librairie 3D d-Bmarr-Be", 127);

    @OriginalMember(owner = "client!ia", name = "w", descriptor = "B")
    public byte field3206;

    @OriginalMember(owner = "client!ia", name = "p", descriptor = "I")
    public static int field3199;

    @OriginalMember(owner = "client!ia", name = "q", descriptor = "I")
    public static int field3200;

    @OriginalMember(owner = "client!ia", name = "s", descriptor = "I")
    public static int field3202;

    @OriginalMember(owner = "client!ia", name = "v", descriptor = "I")
    public int field3205;

    @OriginalMember(owner = "client!ia", name = "z", descriptor = "I")
    public static int field3209;

    @OriginalMember(owner = "client!ia", name = "n", descriptor = "Lli;")
    public class185 field3197;

    @OriginalMember(owner = "client!ia", name = "r", descriptor = "Lli;")
    public class185 field3201;

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(B[B)Ltg;")
    public static final class270 method1240(byte arg0, byte[] arg1) {
        field3199++;
        if (arg1 == null) {
            return null;
        }
        class53 var2 = new class53(arg1, class145.field2766, class249.field4418, class55.field940, class258.field4591, class174.field3182);
        if (arg0 < 27) {
            field3207 = null;
        }
        class269.method1827((byte) -114);
        return var2;
    }

    @OriginalMember(owner = "client!ia", name = "c", descriptor = "(Z)Z")
    public static final boolean method1241(boolean arg0) {
        field3202++;
        if (class234.field4202) {
            try {
                if ((Boolean) class118.field2162.method1315(-59, class124.field2238.field3022)) {
                    return false;
                }
                return true;
            } catch (Throwable var1) {
            }
        }
        return arg0;
    }

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "(I)V")
    public static final void method1242(int arg0) {
        if (arg0 == 9868) {
            field3200++;
            class217.field3977.method86(0);
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(B)V")
    public static void method1243(byte arg0) {
        field3208 = null;
        int var1 = -22 % ((9 - arg0) / 51);
        field3204 = null;
        field3198 = null;
        field3207 = null;
        field3203 = null;
    }
}
