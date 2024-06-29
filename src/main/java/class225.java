import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uk")
public class class225 {

    @OriginalMember(owner = "client!uk", name = "b", descriptor = "I")
    public int field3045 = -1;

    @OriginalMember(owner = "client!uk", name = "f", descriptor = "I")
    public int field3049 = 64;

    @OriginalMember(owner = "client!uk", name = "j", descriptor = "I")
    public int field3053 = 2;

    @OriginalMember(owner = "client!uk", name = "n", descriptor = "Z")
    public boolean field3057 = false;

    @OriginalMember(owner = "client!uk", name = "i", descriptor = "I")
    public int field3052 = 1;

    @OriginalMember(owner = "client!uk", name = "l", descriptor = "I")
    public int field3055 = 64;

    @OriginalMember(owner = "client!uk", name = "h", descriptor = "Z")
    public boolean field3051 = false;

    @OriginalMember(owner = "client!uk", name = "g", descriptor = "Lrn;")
    public static class633 field3050 = new class633(34, 8);

    @OriginalMember(owner = "client!uk", name = "k", descriptor = "I")
    public static int field3054 = 0;

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "I")
    public static int field3044;

    @OriginalMember(owner = "client!uk", name = "c", descriptor = "I")
    public static int field3046;

    @OriginalMember(owner = "client!uk", name = "d", descriptor = "I")
    public static int field3047;

    @OriginalMember(owner = "client!uk", name = "e", descriptor = "I")
    public static int field3048;

    @OriginalMember(owner = "client!uk", name = "m", descriptor = "I")
    public static int field3056;

    @OriginalMember(owner = "client!uk", name = "p", descriptor = "I")
    public static int field3059;

    @OriginalMember(owner = "client!uk", name = "o", descriptor = "Lda;")
    public static class420 field3058;

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(CILjava/lang/String;)I")
    public static final int method1451(char arg0, int arg1, String arg2) {
        field3056++;
        int var3 = 0;
        int var4 = arg2.length();
        for (int var5 = arg1; var5 < var4; var5++) {
            if (arg0 == arg2.charAt(var5)) {
                var3++;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(Lwm;B)V")
    public static final void method1452(class30 arg0, byte arg1) {
        int var2 = 7 / ((-arg1 - 10) / 54);
        class405.field5379 = arg0;
        field3046++;
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(IIBII[B)V")
    public static final void method1453(int arg0, int arg1, byte arg2, int arg3, int arg4, byte[] arg5) {
        field3044++;
        if (arg1 <= arg4) {
            return;
        }
        int var6 = arg0 + arg4;
        int var7 = arg1 - arg4 >> 2;
        while (true) {
            var7--;
            if (var7 < 0) {
                int var8 = arg1 - arg4 & 0x3;
                if (arg2 < 61) {
                    return;
                }
                while (true) {
                    var8--;
                    if (var8 < 0) {
                        return;
                    }
                    arg5[var6++] = 1;
                }
            }
            arg5[var6++] = 1;
            arg5[var6++] = 1;
            arg5[var6++] = 1;
            arg5[var6++] = 1;
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(I)V")
    public static void method1454(int arg0) {
        if (arg0 == 0) {
            field3058 = null;
            field3050 = null;
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(IBLmc;I)V")
    private final void method1455(int arg0, byte arg1, class234 arg2, int arg3) {
        if (arg0 == 1) {
            this.field3045 = arg2.method1553((byte) -117);
            if (this.field3045 == 65535) {
                this.field3045 = -1;
            }
        } else if (arg0 == 2) {
            this.field3049 = arg2.method1553((byte) 1) + 1;
            this.field3055 = arg2.method1553((byte) 119) + 1;
        } else if (arg0 == 3) {
            arg2.method1554(27806);
        } else if (arg0 == 4) {
            this.field3053 = arg2.method1509(true);
        } else if (arg0 == 5) {
            this.field3052 = arg2.method1509(true);
        } else if (arg0 == 6) {
            this.field3057 = true;
        } else if (arg0 == 7) {
            this.field3051 = true;
        }
        field3048++;
        int var5 = -48 % ((72 - arg1) / 38);
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(ILmc;I)V")
    public final void method1456(int arg0, class234 arg1, int arg2) {
        int var4 = -100 % ((arg2 + 55) / 39);
        while (true) {
            int var5 = arg1.method1509(true);
            if (var5 == 0) {
                field3059++;
                return;
            }
            this.method1455(var5, (byte) -101, arg1, arg0);
        }
    }
}
