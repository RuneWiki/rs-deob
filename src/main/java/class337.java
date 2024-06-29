import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!en")
public abstract class class337 {

    @OriginalMember(owner = "client!en", name = "b", descriptor = "Z")
    public static boolean field4726 = false;

    @OriginalMember(owner = "client!en", name = "e", descriptor = "[I")
    public static int[] field4729 = new int[] { 32, 39, 44, 47 };

    @OriginalMember(owner = "client!en", name = "a", descriptor = "I")
    public static int field4725;

    @OriginalMember(owner = "client!en", name = "c", descriptor = "I")
    public static int field4727;

    @OriginalMember(owner = "client!en", name = "d", descriptor = "I")
    public static int field4728;

    @OriginalMember(owner = "client!en", name = "f", descriptor = "I")
    public static int field4730;

    @OriginalMember(owner = "client!en", name = "g", descriptor = "I")
    public static int field4731;

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(BZ)Z", line = 7)
    public static final boolean method2134(byte arg0, boolean arg1) {
        field4728++;
        int var2 = arg0 & 0xFF;
        if (arg1) {
            return true;
        } else if (var2 == 0) {
            return false;
        } else {
            return var2 < 128 || var2 >= 160 || class242.field3616[var2 - 128] != '\u0000';
        }
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(I)V", line = 45)
    public static final void method2136(int arg0) {
        field4727++;
        if (!class691.field9660) {
            return;
        }
        class451 var1 = class63.method422(class714.field9898, 17492, class497.field7084);
        if (arg0 != -161) {
            method2139((byte) 12, -122, -33);
        }
        if (var1 != null && var1.field6229 != null) {
            class166 var2 = new class166();
            var2.field2619 = var1.field6229;
            var2.field2627 = var1;
            class379.method2349(var2);
        }
        class275.field3980 = -1;
        class629.field8818 = -1;
        class691.field9660 = false;
        if (var1 != null) {
            class564.method3329(var1, arg0 + 8356);
        }
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(BII)Z", line = 80)
    public static final boolean method2139(byte arg0, int arg1, int arg2) {
        if (arg0 != 53) {
            field4726 = false;
        }
        field4725++;
        return class169.method1253(arg1, (byte) 105, arg2) | (arg2 & 0x70000) != 0 || class147.method1033((byte) 27, arg1, arg2);
    }

    @OriginalMember(owner = "client!en", name = "c", descriptor = "(I)V", line = 93)
    public static void method2141(int arg0) {
        field4729 = null;
        if (arg0 != 10520) {
            field4729 = null;
        }
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(B)V", line = 109)
    public static final void method2142(byte arg0) {
        field4730++;
        class393.method2430((byte) -94);
        class195.field2997 = false;
        int var1 = -121 % ((arg0 - 76) / 34);
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(Z)V")
    public abstract void method2135(boolean arg0);

    @OriginalMember(owner = "client!en", name = "b", descriptor = "(I)V")
    public abstract void method2137(int arg0);

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(II)Z")
    public abstract boolean method2138(int arg0, int arg1);

    @OriginalMember(owner = "client!en", name = "b", descriptor = "(Z)Lfo;")
    public abstract class542 method2140(boolean arg0);
}
