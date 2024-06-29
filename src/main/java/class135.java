import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sg")
public class class135 extends class222 {

    @OriginalMember(owner = "client!sg", name = "cb", descriptor = "I")
    private int field2391;

    @OriginalMember(owner = "client!sg", name = "ab", descriptor = "Lsb;")
    private static class98 field2389 = class47.method368("skill)2", 0);

    @OriginalMember(owner = "client!sg", name = "eb", descriptor = "Lsb;")
    public static class98 field2393 = field2389;

    @OriginalMember(owner = "client!sg", name = "Y", descriptor = "Lvf;")
    public static class48 field2387 = new class48();

    @OriginalMember(owner = "client!sg", name = "gb", descriptor = "Lvf;")
    public static class48 field2395 = new class48();

    @OriginalMember(owner = "client!sg", name = "hb", descriptor = "I")
    public static int field2396 = 0;

    @OriginalMember(owner = "client!sg", name = "fb", descriptor = "F")
    public static float field2394;

    @OriginalMember(owner = "client!sg", name = "W", descriptor = "I")
    public static int field2385;

    @OriginalMember(owner = "client!sg", name = "X", descriptor = "I")
    public static int field2386;

    @OriginalMember(owner = "client!sg", name = "Z", descriptor = "I")
    public static int field2388;

    @OriginalMember(owner = "client!sg", name = "bb", descriptor = "I")
    public static int field2390;

    @OriginalMember(owner = "client!sg", name = "ib", descriptor = "Lhc;")
    public static class43 field2397;

    @OriginalMember(owner = "client!sg", name = "db", descriptor = "[[[B")
    public static byte[][][] field2392;

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(BLlj;)Laf;")
    public static final class150 method1015(byte arg0, class216 arg1) {
        ++field2388;
        class150 var2 = new class150(arg1.method1445(arg0 + 27), arg1.method1445(-3), arg1.method1487(51), arg1.method1487(72), arg1.method1442(-1330139880), ~arg1.method1446(5350) == -2);
        if (arg0 != -30) {
            field2387 = null;
        }
        int var3 = arg1.method1446(5350);
        for (int var4 = 0; ~var4 > ~var3; ++var4) {
            var2.field2776.method376((byte) 13, new class109(arg1.method1487(60), arg1.method1487(34), arg1.method1487(57), arg1.method1487(25)));
        }
        var2.method1107(12800);
        return var2;
    }

    @OriginalMember(owner = "client!sg", name = "<init>", descriptor = "()V")
    public class135() {
        this(4096);
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(Z)V")
    public static void method1016(boolean arg0) {
        field2392 = null;
        field2395 = null;
        field2397 = null;
        field2387 = null;
        field2389 = null;
        field2393 = null;
        if (!arg0) {
            method1017(40, -103, (byte) -5, 101, 49, -9, -74);
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(Llj;ZI)V")
    public final void method3(class216 arg0, boolean arg1, int arg2) {
        if (~arg2 == -1) {
            this.field2391 = (arg0.method1446(5350) << 12) / 255;
        }
        if (arg1) {
            method1015((byte) -99, (class216) null);
        }
        ++field2385;
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(IIBIIII)I")
    public static final int method1017(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6) {
        if ((arg4 & 1) == 1) {
            int var7 = arg0;
            arg0 = arg1;
            arg1 = var7;
        }
        ++field2390;
        int var8 = arg3 & 3;
        if (var8 == 0) {
            return arg6;
        } else if (~var8 == -2) {
            return arg5;
        } else if (~var8 == -3) {
            return -arg0 + -arg6 + 7 + 1;
        } else {
            return arg2 > -74 ? 6 : 7 - (arg1 + arg5) - -1;
        }
    }

    @OriginalMember(owner = "client!sg", name = "<init>", descriptor = "(I)V")
    private class135(int arg0) {
        super(0, true);
        this.field2391 = 4096;
        this.field2391 = arg0;
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(BI)[I")
    public final int[] method7(byte arg0, int arg1) {
        ++field2386;
        if (arg0 < 35) {
            field2396 = -102;
        }
        int[] var3 = super.field3844.method22(0, arg1);
        if (super.field3844.field61) {
            class66.method465(var3, 0, class13.field253, this.field2391);
        }
        return var3;
    }
}
