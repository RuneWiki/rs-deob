import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!i")
public class class27 {

    @OriginalMember(owner = "client!i", name = "b", descriptor = "[Z")
    public static boolean[] field310 = new boolean[100];

    @OriginalMember(owner = "client!i", name = "j", descriptor = "I")
    public static int field318 = -1;

    @OriginalMember(owner = "client!i", name = "f", descriptor = "I")
    public static int field314 = 64;

    @OriginalMember(owner = "client!i", name = "c", descriptor = "I")
    public static int field311;

    @OriginalMember(owner = "client!i", name = "d", descriptor = "I")
    public static int field312;

    @OriginalMember(owner = "client!i", name = "e", descriptor = "I")
    public static int field313;

    @OriginalMember(owner = "client!i", name = "g", descriptor = "I")
    public static int field315;

    @OriginalMember(owner = "client!i", name = "h", descriptor = "I")
    public static int field316;

    @OriginalMember(owner = "client!i", name = "a", descriptor = "Lmo;")
    public static class447 field309;

    @OriginalMember(owner = "client!i", name = "i", descriptor = "[Lsk;")
    public static class369[] field317;

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(III)I")
    public static final int method177(int arg0, int arg1, int arg2) {
        field316++;
        if (arg1 == -1) {
            return 12345678;
        }
        int var3 = (arg1 & 0x7F) * arg0 >> 7;
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        if (arg2 != 126748167) {
            method178((byte) -107);
        }
        return (arg1 & 0xFF80) + var3;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(B)V")
    public static void method178(byte arg0) {
        field317 = null;
        field309 = null;
        field310 = null;
        if (arg0 != -48) {
            method179((class186) null, -30);
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Ljg;I)V")
    public static final void method179(class186 arg0, int arg1) {
        if (arg1 >= -123) {
            method177(-64, -47, 66);
        }
        field311++;
        byte[] var2 = new byte[24];
        if (class212.field3404 != null) {
            try {
                class212.field3404.method2564(0L, 0);
                class212.field3404.method2570(-119, var2);
                int var3;
                for (var3 = 0; var3 < 24 && var2[var3] == 0; var3++) {
                }
                if (var3 >= 24) {
                    throw new IOException();
                }
            } catch (Exception var5) {
                for (int var4 = 0; var4 < 24; var4++) {
                    var2[var4] = -1;
                }
            }
        }
        arg0.method1269(false, 0, var2, 24);
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(II)I")
    public static final int method180(int arg0, int arg1) {
        field313++;
        return arg1 == -19505 ? arg0 >>> 8 : -66;
    }
}
