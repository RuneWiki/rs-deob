import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ce")
public class class168 {

    @OriginalMember(owner = "client!ce", name = "e", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field2399 = new CRC32();

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "I")
    public static int field2395;

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "I")
    public static int field2396;

    @OriginalMember(owner = "client!ce", name = "c", descriptor = "I")
    public static int field2397;

    @OriginalMember(owner = "client!ce", name = "d", descriptor = "I")
    public static int field2398;

    @OriginalMember(owner = "client!ce", name = "f", descriptor = "I")
    public static int field2400;

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(B)V", line = 8)
    public static final void method1136(byte arg0) {
        class261.field3576 = null;
        field2396++;
        class378.field5394 = false;
        class247.field3423 = null;
        class184.field2570 = null;
        class294.field4059 = null;
        if (arg0 == -17) {
            class309.field4241 = null;
            class210.method1362(17612);
        }
    }

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "(B)V", line = 26)
    public static void method1137(byte arg0) {
        field2399 = null;
        if (arg0 != 33) {
            method1136((byte) -52);
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(IIILt;ZI)V", line = 36)
    public static final void method1138(int arg0, int arg1, int arg2, class398 arg3, boolean arg4, int arg5) {
        field2398++;
        if (arg3.field5817 == -1 && arg3.field5809 == null) {
            return;
        }
        int var6 = 0;
        if (!arg4) {
            field2400 = 46;
        }
        int var7 = class406.field5895 * arg3.field5797 >> 8;
        if (arg0 > arg3.field5814) {
            var6 += arg0 - arg3.field5814;
        } else if (arg3.field5823 > arg0) {
            var6 += arg3.field5823 - arg0;
        }
        if (arg3.field5813 < arg2) {
            var6 += arg2 - arg3.field5813;
        } else if (arg3.field5796 > arg2) {
            var6 += arg3.field5796 - arg2;
        }
        if (arg3.field5807 == 0 || arg3.field5807 < (var6 - 64) || class406.field5895 == 0 || arg3.field5819 != arg1) {
            if (arg3.field5799 != null) {
                class252.field3467.method852(arg3.field5799);
                arg3.field5799 = null;
            }
            if (arg3.field5820 != null) {
                class252.field3467.method852(arg3.field5820);
                arg3.field5820 = null;
            }
            return;
        }
        var6 -= 64;
        if (var6 < 0) {
            var6 = 0;
        }
        int var8 = (arg3.field5807 - var6) * var7 / arg3.field5807;
        if (arg3.field5799 != null) {
            arg3.field5799.method666(var8);
        } else if (arg3.field5817 >= 0) {
            class114 var9 = class114.method752(class367.field5152, arg3.field5817, 0);
            if (var9 != null) {
                class56 var10 = var9.method755().method374(class300.field4158);
                class96 var11 = class96.method645(var10, 100, var8);
                var11.method673(-1);
                class252.field3467.method857(var11);
                arg3.field5799 = var11;
            }
        }
        if (arg3.field5820 != null) {
            arg3.field5820.method666(var8);
            if (arg3.field5820.method2460(123)) {
                return;
            }
            arg3.field5820 = null;
        } else if (arg3.field5809 != null && (arg3.field5795 -= arg5) <= 0) {
            int var12 = (int) (Math.random() * (double) arg3.field5809.length);
            class114 var13 = class114.method752(class367.field5152, arg3.field5809[var12], 0);
            if (var13 != null) {
                class56 var14 = var13.method755().method374(class300.field4158);
                class96 var15 = class96.method645(var14, 100, var8);
                var15.method673(0);
                class252.field3467.method857(var15);
                arg3.field5820 = var15;
                arg3.field5795 = arg3.field5805 + ((int) ((double) (arg3.field5821 - arg3.field5805) * Math.random()));
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ce", name = "c", descriptor = "(B)V", line = 165)
    public static final void method1139(byte arg0) {
        field2397++;
        class446.field6433.method1249(arg0 + 86);
        if (arg0 != -85) {
            field2400 = -121;
        }
    }
}
