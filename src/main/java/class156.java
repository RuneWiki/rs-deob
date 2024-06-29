import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oh")
public class class156 extends class237 {

    @OriginalMember(owner = "client!oh", name = "r", descriptor = "I")
    public static int field2508 = 0;

    @OriginalMember(owner = "client!oh", name = "u", descriptor = "Lj;")
    public static class209 field2511 = new class209(128);

    @OriginalMember(owner = "client!oh", name = "C", descriptor = "[Lri;")
    public static class39[] field2518 = new class39[14];

    @OriginalMember(owner = "client!oh", name = "p", descriptor = "I")
    public int field2506;

    @OriginalMember(owner = "client!oh", name = "s", descriptor = "I")
    public int field2509;

    @OriginalMember(owner = "client!oh", name = "t", descriptor = "I")
    public static int field2510;

    @OriginalMember(owner = "client!oh", name = "w", descriptor = "I")
    public static int field2513;

    @OriginalMember(owner = "client!oh", name = "x", descriptor = "I")
    public int field2514;

    @OriginalMember(owner = "client!oh", name = "y", descriptor = "I")
    public int field2515;

    @OriginalMember(owner = "client!oh", name = "A", descriptor = "I")
    public int field2517;

    @OriginalMember(owner = "client!oh", name = "D", descriptor = "I")
    public static int field2519;

    @OriginalMember(owner = "client!oh", name = "F", descriptor = "I")
    public static int field2521;

    @OriginalMember(owner = "client!oh", name = "G", descriptor = "I")
    public static int field2522;

    @OriginalMember(owner = "client!oh", name = "q", descriptor = "Lwb;")
    public class123 field2507;

    @OriginalMember(owner = "client!oh", name = "z", descriptor = "Lwb;")
    public class123 field2516;

    @OriginalMember(owner = "client!oh", name = "n", descriptor = "Ljava/lang/String;")
    public String field2504;

    @OriginalMember(owner = "client!oh", name = "o", descriptor = "Z")
    public boolean field2505;

    @OriginalMember(owner = "client!oh", name = "E", descriptor = "[I")
    public static int[] field2520;

    @OriginalMember(owner = "client!oh", name = "v", descriptor = "[Ljava/lang/Object;")
    public Object[] field2512;

    @OriginalMember(owner = "client!oh", name = "d", descriptor = "(I)V")
    public static void method1096(int arg0) {
        field2518 = null;
        field2520 = null;
        field2511 = null;
        if (arg0 != 128) {
            field2518 = null;
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "([BIII)Ljava/lang/String;")
    public static final String method1097(byte[] arg0, int arg1, int arg2, int arg3) {
        int var4 = 0;
        char[] var5 = new char[arg3];
        if (arg2 != -1) {
            return null;
        }
        for (int var6 = 0; var6 < arg3; var6++) {
            int var7 = arg0[arg1 + var6] & 0xFF;
            if (var7 != 0) {
                if (var7 >= 128 && var7 < 160) {
                    char var8 = class170.field2695[var7 - 128];
                    if (var8 == '\u0000') {
                        var8 = '?';
                    }
                    var7 = var8;
                }
                var5[var4++] = (char) var7;
            }
        }
        field2522++;
        return new String(var5, 0, var4);
    }

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "(II)V")
    public static final void method1098(int arg0, int arg1) {
        if (arg1 >= 0) {
            method1098(92, 114);
        }
        class15.field196.method1695(arg0, 0);
        field2510++;
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(III)Lvd;")
    public static final class19 method1099(int arg0, int arg1, int arg2) {
        class246 var3 = class46.field585[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        }
        for (int var4 = 0; var4 < var3.field4044; var4++) {
            class19 var5 = var3.field4038[var4];
            if ((var5.field244 >> 29 & 0x3L) == 2L && var5.field240 == arg1 && var5.field235 == arg2) {
                class138.method959(var5);
                return var5;
            }
        }
        return null;
    }
}
