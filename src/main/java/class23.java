import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dr")
public class class23 {

    @OriginalMember(owner = "client!dr", name = "d", descriptor = "Lmr;")
    public static class611 field214 = new class611();

    @OriginalMember(owner = "client!dr", name = "f", descriptor = "[S")
    public static short[] field216 = new short[256];

    @OriginalMember(owner = "client!dr", name = "e", descriptor = "Lui;")
    public static class308 field215 = new class308();

    @OriginalMember(owner = "client!dr", name = "g", descriptor = "Llc;")
    public static class435 field217 = new class435(18, 0);

    @OriginalMember(owner = "client!dr", name = "h", descriptor = "[I")
    public static int[] field218 = new int[3];

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "I")
    public static int field211;

    @OriginalMember(owner = "client!dr", name = "b", descriptor = "I")
    public static int field212;

    @OriginalMember(owner = "client!dr", name = "c", descriptor = "I")
    public static int field213;

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(B)V", line = 6)
    public static final void method102(byte arg0) {
        field213++;
        class322 var1 = null;
        try {
            class432 var2 = class345.field4749.method1876(-13918, true, "");
            while (var2.field6198 == 0) {
                class363.method2283(1L, -24244);
            }
            if (arg0 != -74) {
                method104(-97, -4, -21, 74, null, 68);
            }
            if (var2.field6198 == 1) {
                var1 = (class322) var2.field6200;
                class479 var3 = class243.field3580.method3305((byte) -113);
                var1.method2002(var3.field6864, true, 0, var3.field6800);
            }
        } catch (Exception var5) {
        }
        try {
            if (var1 != null) {
                var1.method2000((byte) 33);
            }
        } catch (Exception var4) {
        }
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(Z)V", line = 44)
    public static void method103(boolean arg0) {
        field216 = null;
        field214 = null;
        if (!arg0) {
            method103(false);
        }
        field217 = null;
        field215 = null;
        field218 = null;
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(IIIILha;I)V", line = 65)
    public static final void method104(int arg0, int arg1, int arg2, int arg3, class543 arg4, int arg5) {
        class301.field4129 = arg4;
        field211++;
        if (arg0 > -70) {
            field217 = null;
        }
        class487.field7023 = class301.field4129.method348();
        class469.field6680 = class301.field4129.method348();
        class710.field10013 = class301.field4129.method348();
        class577.field8283 = null;
        class678.field9625 = arg5;
        class572.field8257 = arg1;
        class270.field3833 = 0;
        class571.field8229 = null;
        class56.method545(arg2, arg3, 0);
        class662.field9461 = -1;
        class365.field5334 = -1;
        class405.field5774 = -1;
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(ZII)Z", line = 88)
    public static final boolean method105(boolean arg0, int arg1, int arg2) {
        if (arg0) {
            field216 = null;
        }
        field212++;
        return (arg1 & 0x22) != 0;
    }
}
