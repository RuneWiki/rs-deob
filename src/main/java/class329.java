import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jp")
public class class329 extends class127 {

    @OriginalMember(owner = "client!jp", name = "J", descriptor = "Leb;")
    public static class584 field4527 = new class584();

    @OriginalMember(owner = "client!jp", name = "M", descriptor = "[I")
    public static int[] field4530 = new int[250];

    @OriginalMember(owner = "client!jp", name = "G", descriptor = "I")
    public static int field4524;

    @OriginalMember(owner = "client!jp", name = "H", descriptor = "I")
    public static int field4525;

    @OriginalMember(owner = "client!jp", name = "I", descriptor = "I")
    public static int field4526;

    @OriginalMember(owner = "client!jp", name = "L", descriptor = "I")
    public static int field4529;

    @OriginalMember(owner = "client!jp", name = "N", descriptor = "I")
    public static int field4531;

    @OriginalMember(owner = "client!jp", name = "K", descriptor = "[B")
    private byte[] field4528;

    @OriginalMember(owner = "client!jp", name = "b", descriptor = "(III)I", line = 3)
    public static final int method1963(int arg0, int arg1, int arg2) {
        field4524++;
        int var3 = (arg2 & 0x7F) * arg0 >> 7;
        if (arg1 != -680993689) {
            method1964((byte) -127, -102);
        }
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return (arg2 & 0xFF80) + var3;
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(BI)Ltga;", line = 22)
    public static final class54 method1964(byte arg0, int arg1) {
        field4526++;
        class54[] var2 = class173.method1174((byte) 56);
        for (int var3 = 0; var3 < var2.length; var3++) {
            class54 var5 = var2[var3];
            if (var5.field738 == arg1) {
                return var5;
            }
        }
        int var4 = 35 / ((58 - arg0) / 55);
        return null;
    }

    @OriginalMember(owner = "client!jp", name = "b", descriptor = "(Z)V", line = 47)
    public static void method1965(boolean arg0) {
        field4530 = null;
        field4527 = null;
        if (!arg0) {
            method1964((byte) -116, 92);
        }
    }

    @OriginalMember(owner = "client!jp", name = "<init>", descriptor = "()V", line = 59)
    public class329() {
        super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
    }

    @OriginalMember(owner = "client!jp", name = "c", descriptor = "(B)Z", line = 65)
    public static final boolean method1966(byte arg0) {
        field4525++;
        int var1 = 86 / ((arg0 + 46) / 52);
        if (class292.field4152) {
            try {
                class594.method3267("showVideoAd", -17670, class486.field6574);
                return true;
            } catch (Throwable var2) {
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(IIII)[B", line = 84)
    public final byte[] method1967(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 == 16384) {
            this.field4528 = new byte[arg0 * arg1 * arg3 * 2];
            field4531++;
            this.method3463(arg3, true, arg0, arg1);
            return this.field4528;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(IIB)V", line = 102)
    public final void method979(int arg0, int arg1, byte arg2) {
        field4529++;
        if (arg1 != -1) {
            this.method1967(127, -109, 98, -16);
        }
        int var4 = arg0 * 2;
        int var5 = arg2 & 0xFF;
        int var6 = var4 + 1;
        this.field4528[var4] = (byte) (var5 * 3 >> 5);
        this.field4528[var6] = (byte) (var5 * 3 >> 5);
    }
}
