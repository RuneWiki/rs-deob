import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mm")
public class class272 {

    @OriginalMember(owner = "client!mm", name = "c", descriptor = "Z")
    public static boolean field4269 = true;

    @OriginalMember(owner = "client!mm", name = "b", descriptor = "I")
    public static int field4268 = 0;

    @OriginalMember(owner = "client!mm", name = "e", descriptor = "F")
    public static float field4271 = 0.0F;

    @OriginalMember(owner = "client!mm", name = "g", descriptor = "I")
    public static int field4273 = 0;

    @OriginalMember(owner = "client!mm", name = "f", descriptor = "I")
    public static int field4272 = -2;

    @OriginalMember(owner = "client!mm", name = "k", descriptor = "J")
    public static long field4277 = 0L;

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "I")
    public static int field4267;

    @OriginalMember(owner = "client!mm", name = "h", descriptor = "I")
    public static int field4274;

    @OriginalMember(owner = "client!mm", name = "i", descriptor = "I")
    public static int field4275;

    @OriginalMember(owner = "client!mm", name = "j", descriptor = "I")
    public static int field4276;

    @OriginalMember(owner = "client!mm", name = "d", descriptor = "[[B")
    public static byte[][] field4270;

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(IIIIIILen;IJ)Z", line = 6)
    public static final boolean method1966(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class47 arg6, int arg7, long arg8) {
        if (arg6 == null) {
            return true;
        } else {
            int var10 = arg1 * 128 + arg4 * 64;
            int var11 = arg2 * 128 + arg5 * 64;
            return class331.method2282(arg0, arg1, arg2, arg4, arg5, var10, var11, arg3, arg6, arg7, false, arg8);
        }
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(Lp;ZI)V", line = 22)
    public static final void method1967(class107 arg0, boolean arg1, int arg2) {
        if (!arg1) {
            method1968(-75);
        }
        if (class89.field1115 != null) {
            try {
                class89.field1115.method301(0L, (byte) 45);
                class89.field1115.method310(arg0.field1388, 24, (byte) 93, arg2);
            } catch (Exception var4) {
            }
        }
        field4276++;
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(I)V", line = 53)
    public static void method1968(int arg0) {
        if (arg0 > 4) {
            field4270 = (byte[][]) null;
        }
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(ILlc;Llc;IB)Lkg;", line = 76)
    public static final class82 method1969(int arg0, class175 arg1, class175 arg2, int arg3, byte arg4) {
        if (arg4 >= -71) {
            method1971(103, (byte) 88);
        }
        field4274++;
        return class304.method2132((byte) -116, arg0, arg3, arg2) ? class98.method592(55, arg1.method1199(28815, arg3, arg0)) : null;
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(BLsi;Lsi;)V", line = 90)
    public static final void method1970(byte arg0, class332 arg1, class332 arg2) {
        if (arg2.field5067 != null) {
            arg2.method2285(true);
        }
        if (arg0 >= -46) {
            method1971(-60, (byte) 113);
        }
        arg2.field5067 = arg1.field5067;
        arg2.field5073 = arg1;
        arg2.field5067.field5073 = arg2;
        arg2.field5073.field5067 = arg2;
        field4275++;
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(IB)Ldm;", line = 111)
    public static final class300 method1971(int arg0, byte arg1) {
        field4267++;
        class300 var2 = (class300) class271.field4262.method1239((byte) -2, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class9.field130.method1199(28815, arg0, 4);
        class300 var4 = new class300();
        if (var3 != null) {
            var4.method2115(-16902, new class107(var3), arg0);
        }
        class271.field4262.method1243(var4, (long) arg0, -29282);
        if (arg1 != 96) {
            field4273 = 118;
        }
        return var4;
    }
}
