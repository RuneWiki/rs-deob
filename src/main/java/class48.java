import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!en")
public class class48 {

    @OriginalMember(owner = "client!en", name = "c", descriptor = "[I")
    public static int[] field732 = new int[256];

    @OriginalMember(owner = "client!en", name = "f", descriptor = "Z")
    public static boolean field735;

    @OriginalMember(owner = "client!en", name = "e", descriptor = "[I")
    public static int[] field734;

    @OriginalMember(owner = "client!en", name = "g", descriptor = "Lul;")
    public static class51 field736;

    @OriginalMember(owner = "client!en", name = "h", descriptor = "I")
    public static int field737;

    @OriginalMember(owner = "client!en", name = "a", descriptor = "I")
    public static int field730;

    @OriginalMember(owner = "client!en", name = "b", descriptor = "I")
    public static int field731;

    @OriginalMember(owner = "client!en", name = "d", descriptor = "I")
    public static int field733;

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(Lcg;Z)V", line = 8)
    public static final void method425(class49 arg0, boolean arg1) {
        field731++;
        class30.field444 = arg0;
        if (arg1) {
            method425((class49) null, true);
        }
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(ZB)V", line = 21)
    public static final void method426(boolean arg0, byte arg1) {
        field733++;
        class287.field4570 = arg0;
        class219.field3651 = !class56.method499(-2);
        if (arg1 < 35) {
            field737 = -85;
        }
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(II)I", line = 37)
    public static final int method427(int arg0, int arg1) {
        field730++;
        if (arg1 != -9) {
            field734 = (int[]) null;
        }
        int var2 = arg0 >>> 1;
        int var3 = var2 | var2 >>> 1;
        int var4 = var3 | var3 >>> 2;
        int var5 = var4 | var4 >>> 4;
        int var6 = var5 | var5 >>> 8;
        int var7 = var6 | var6 >>> 16;
        return ~var7 & arg0;
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            int var1 = var0;
            for (int var2 = 0; var2 < 8; var2++) {
                if ((var1 & 0x1) == 1) {
                    var1 = var1 >>> 1 ^ 0xEDB88320;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field732[var0] = var1;
        }
        field735 = true;
        field734 = new int[5];
        field736 = new class51(100);
        field737 = 0;
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(I)V", line = 59)
    public static void method428(int arg0) {
        field732 = null;
        field734 = null;
        field736 = null;
        if (arg0 != 28301) {
            field737 = -29;
        }
    }
}
