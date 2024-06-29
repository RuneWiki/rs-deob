import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!va")
public class class140 extends RuntimeException {

    @OriginalMember(owner = "client!va", name = "i", descriptor = "Ljava/lang/Throwable;")
    public Throwable field2371;

    @OriginalMember(owner = "client!va", name = "a", descriptor = "Ljava/lang/String;")
    public String field2363;

    @OriginalMember(owner = "client!va", name = "h", descriptor = "I")
    public static int field2370 = 0;

    @OriginalMember(owner = "client!va", name = "c", descriptor = "I")
    public static int field2365;

    @OriginalMember(owner = "client!va", name = "e", descriptor = "I")
    public static int field2367;

    @OriginalMember(owner = "client!va", name = "j", descriptor = "I")
    public static int field2372;

    @OriginalMember(owner = "client!va", name = "k", descriptor = "I")
    public static int field2373;

    @OriginalMember(owner = "client!va", name = "l", descriptor = "I")
    public static int field2374;

    @OriginalMember(owner = "client!va", name = "g", descriptor = "Lsa;")
    public static class104 field2369;

    @OriginalMember(owner = "client!va", name = "b", descriptor = "Lce;")
    public static class239 field2364;

    @OriginalMember(owner = "client!va", name = "f", descriptor = "Lce;")
    public static class239 field2368;

    @OriginalMember(owner = "client!va", name = "d", descriptor = "[Lcm;")
    public static class185[] field2366;

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(I)V", line = 5)
    public static void method1034(int arg0) {
        field2368 = null;
        field2369 = null;
        field2366 = null;
        field2364 = null;
        if (arg0 <= 95) {
            method1036(-109, -59, (byte) -120, 60);
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(III)I", line = 19)
    public static final int method1035(int arg0, int arg1, int arg2) {
        field2365++;
        int var3 = 83 / ((arg1 - 12) / 59);
        class164 var4 = (class164) class48.field934.method1405((byte) 115, (long) arg2);
        if (var4 == null) {
            return 0;
        } else if (arg0 == -1) {
            return 0;
        } else {
            int var5 = 0;
            for (int var6 = 0; var6 < var4.field2725.length; var6++) {
                if (var4.field2717[var6] == arg0) {
                    var5 += var4.field2725[var6];
                }
            }
            return var5;
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(IIBI)I", line = 54)
    public static final int method1036(int arg0, int arg1, byte arg2, int arg3) {
        int var4 = arg1 & 0x3;
        field2374++;
        if (var4 == 0) {
            return arg0;
        } else if (var4 == 1) {
            return arg3;
        } else if (arg2 == -10) {
            return var4 == 2 ? 1023 - arg0 : 1023 - arg3;
        } else {
            return 33;
        }
    }

    @OriginalMember(owner = "client!va", name = "b", descriptor = "(I)I", line = 86)
    public static final int method1037(int arg0) {
        field2372++;
        if (arg0 <= 49) {
            field2368 = (class239) null;
        }
        return class14.field241;
    }

    @OriginalMember(owner = "client!va", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V", line = 105)
    public class140(Throwable arg0, String arg1) {
        this.field2371 = arg0;
        this.field2363 = arg1;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(I[[IIIII)I", line = 120)
    public static final int method1038(int arg0, int[][] arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = (128 - arg0) * arg1[arg5][arg4] + arg1[arg5 + 1][arg4] * arg0 >> 7;
        field2373++;
        if (arg2 != 0) {
            field2369 = (class104) null;
        }
        int var7 = (128 - arg0) * arg1[arg5][arg4 + 1] + arg1[arg5 + 1][arg4 + 1] * arg0 >> 7;
        return (128 - arg3) * var6 + arg3 * var7 >> 7;
    }
}
