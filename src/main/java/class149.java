import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ic")
public class class149 {

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "[Z")
    public static boolean[] field2324 = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false };

    @OriginalMember(owner = "client!ic", name = "f", descriptor = "I")
    public static int field2329 = 0;

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "I")
    public static int field2325;

    @OriginalMember(owner = "client!ic", name = "c", descriptor = "I")
    public static int field2326;

    @OriginalMember(owner = "client!ic", name = "e", descriptor = "I")
    public static int field2328;

    @OriginalMember(owner = "client!ic", name = "d", descriptor = "Lfa;")
    public static class273 field2327;

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(IZ)V")
    public static final void method986(int arg0, boolean arg1) {
        class16.field227.method147(arg0, (byte) -117);
        if (arg1) {
            method988(-11, -120);
        }
        field2326++;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(Z)V")
    public static void method987(boolean arg0) {
        if (!arg0) {
            method989((class273) null, (byte) -4, -3, 121);
        }
        field2327 = null;
        field2324 = null;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(II)V")
    public static final void method988(int arg0, int arg1) {
        field2328++;
        class36 var2 = class161.method1067(arg0, arg1, (byte) 81);
        var2.method220(124);
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(Lfa;BII)Lea;")
    public static final class38 method989(class273 arg0, byte arg1, int arg2, int arg3) {
        field2325++;
        if (class163.method1081(arg1 + 25, arg0, arg2, arg3)) {
            if (arg1 != -25) {
                method989((class273) null, (byte) -25, 121, -14);
            }
            return class182.method1211(95);
        } else {
            return null;
        }
    }
}
