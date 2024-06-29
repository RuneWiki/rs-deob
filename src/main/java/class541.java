import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mh")
public class class541 extends class11 {

    @OriginalMember(owner = "client!mh", name = "Gb", descriptor = "Lcba;")
    public static class471 field7535 = new class471(61, -1);

    @OriginalMember(owner = "client!mh", name = "Hb", descriptor = "Lej;")
    public static class104 field7536 = new class104("K", "T", "K", "K");

    @OriginalMember(owner = "client!mh", name = "Ib", descriptor = "[I")
    public static int[] field7537 = new int[4];

    @OriginalMember(owner = "client!mh", name = "P", descriptor = "I")
    public static int field7531;

    @OriginalMember(owner = "client!mh", name = "Db", descriptor = "I")
    public static int field7532;

    @OriginalMember(owner = "client!mh", name = "Eb", descriptor = "I")
    public static int field7533;

    @OriginalMember(owner = "client!mh", name = "Fb", descriptor = "I")
    public static int field7534;

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(FI)V")
    public final void method3100(float arg0, int arg1) {
        ++field7533;
        int var3 = Stream.floatToRawIntBits(arg0);
        super.field138[super.field165++] = (byte) (var3 >> 24);
        super.field138[super.field165++] = (byte) (var3 >> 16);
        if (arg1 != -794787512) {
            field7537 = null;
        }
        super.field138[super.field165++] = (byte) (var3 >> 8);
        super.field138[super.field165++] = (byte) var3;
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(BF)V")
    public final void method3101(byte arg0, float arg1) {
        ++field7531;
        int var3 = Stream.floatToRawIntBits(arg1);
        super.field138[super.field165++] = (byte) var3;
        super.field138[super.field165++] = (byte) (var3 >> 8);
        super.field138[super.field165++] = (byte) (var3 >> 16);
        super.field138[super.field165++] = (byte) (var3 >> 24);
        if (arg0 < 45) {
            field7536 = null;
        }
    }

    @OriginalMember(owner = "client!mh", name = "w", descriptor = "(I)V")
    public static void method3102(int arg0) {
        field7537 = null;
        field7536 = null;
        if (arg0 != 1) {
            method3103((String) null, (byte) -54);
        }
        field7535 = null;
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(Ljava/lang/String;B)Z")
    public static final boolean method3103(String arg0, byte arg1) {
        ++field7532;
        if (arg0 == null) {
            return false;
        } else {
            if (arg1 <= 66) {
                method3102(93);
            }
            for (int var2 = 0; ~var2 > ~class536.field7488; ++var2) {
                if (arg0.equalsIgnoreCase(class471.field6623[var2])) {
                    return true;
                }
                if (arg0.equalsIgnoreCase(class507.field7088[var2])) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(IIBI)V")
    public static final void method3104(int arg0, int arg1, byte arg2, int arg3) {
        if (~arg1 == -1) {
            ++class205.field2882;
            class351.method2108(class471.field6622, -10511);
        }
        ++field7534;
        if (arg2 != 98) {
            field7536 = null;
        }
        if (arg1 == 1) {
            class351.method2108(class119.field1955, -10511);
            ++class188.field2633;
        }
        class479.field6754.method76(class6.field80 + arg0, (byte) 60);
        class479.field6754.method91((byte) 88, arg3 - -class519.field7304);
        class479.field6754.method61((byte) 54, class316.field4245.method2691(82, arg2 + 19423) ? 1 : 0);
        class76.field1205 = false;
        class118.field1943 = arg0;
        class145.field2248 = arg3;
        class117.method825(27503);
    }

    @OriginalMember(owner = "client!mh", name = "<init>", descriptor = "(I)V")
    public class541(int arg0) {
        super(arg0);
    }
}
