import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qe")
public class class211 {

    @OriginalMember(owner = "client!qe", name = "i", descriptor = "I")
    public int field3244 = 0;

    @OriginalMember(owner = "client!qe", name = "e", descriptor = "I")
    public static int field3240 = 0;

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "Ljava/lang/String;")
    public static String field3236 = "K";

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "I")
    public static int field3237;

    @OriginalMember(owner = "client!qe", name = "c", descriptor = "I")
    public static int field3238;

    @OriginalMember(owner = "client!qe", name = "d", descriptor = "I")
    public static int field3239;

    @OriginalMember(owner = "client!qe", name = "f", descriptor = "I")
    public static int field3241;

    @OriginalMember(owner = "client!qe", name = "g", descriptor = "I")
    public static int field3242;

    @OriginalMember(owner = "client!qe", name = "h", descriptor = "I")
    public static int field3243;

    @OriginalMember(owner = "client!qe", name = "j", descriptor = "I")
    public static int field3245;

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(ILjd;)V", line = 4)
    public static final void method1507(int arg0, class95 arg1) {
        class39.field580 = arg1;
        if (arg0 != 9) {
            field3245 = 86;
        }
        field3239++;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(Lmn;B)V", line = 16)
    public static final void method1508(class161 arg0, byte arg1) {
        if (arg1 != 100) {
            return;
        }
        field3237++;
        class161 var2 = class171.method1294(arg0, 10);
        int var3;
        int var4;
        if (var2 == null) {
            var4 = class215.field3300;
            var3 = class151.field2281;
        } else {
            var3 = var2.field2619;
            var4 = var2.field2490;
        }
        class144.method1096(-27744, false, arg0, var4, var3);
        class269.method1881(arg0, var3, false, var4);
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(B)V", line = 43)
    public static void method1509(byte arg0) {
        if (arg0 != 120) {
            field3245 = -53;
        }
        field3236 = null;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(II)V", line = 54)
    public static final void method1510(int arg0, int arg1) {
        field3243++;
        class100.field1448.method741(arg0, (byte) -69);
        if (arg1 != 0) {
            field3240 = -107;
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(IIIII)Z", line = 70)
    public static final boolean method1511(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = class75.field1090 * arg3 + class176.field2819 * arg0 >> 16;
        int var6 = class176.field2819 * arg3 - class75.field1090 * arg0 >> 16;
        int var7 = class28.field340 * arg1 + class157.field2384 * var6 >> 16;
        int var8 = class157.field2384 * arg1 - class28.field340 * var6 >> 16;
        if (var7 < 1) {
            var7 = 1;
        }
        int var9 = (var5 << 9) / var7;
        int var10 = (var8 << 9) / var7;
        int var11 = class28.field340 * arg2 + class157.field2384 * var6 >> 16;
        int var12 = class157.field2384 * arg2 - class28.field340 * var6 >> 16;
        if (var11 < 1) {
            var11 = 1;
        }
        int var13 = (var5 << 9) / var11;
        int var14 = (var12 << 9) / var11;
        if (var7 < 50 && var11 < 50) {
            return false;
        } else if (var7 > arg4 && var11 > arg4) {
            return false;
        } else if (var9 < class250.field3768 && var13 < class250.field3768) {
            return false;
        } else if (var9 > class231.field3524 && var13 > class231.field3524) {
            return false;
        } else if (var10 < class38.field565 && var14 < class38.field565) {
            return false;
        } else {
            return var10 <= class201.field3100 || var14 <= class201.field3100;
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(Lwm;IB)V", line = 117)
    private final void method1512(class254 arg0, int arg1, byte arg2) {
        if (arg1 == 5) {
            this.field3244 = arg0.method1755(false);
        }
        field3241++;
        if (arg2 < 31) {
            field3236 = (String) null;
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(IIIIB)I", line = 138)
    public static final int method1513(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        int var5 = -87 % ((-arg4 - 37) / 35);
        field3242++;
        int var6 = arg2 & 0xF;
        int var7 = var6 >= 4 ? (var6 == 12 || var6 == 14 ? arg0 : arg3) : arg1;
        int var8 = var6 >= 8 ? arg1 : arg0;
        return ((var6 & 0x2) == 0 ? var7 : -var7) + ((var6 & 0x1) == 0 ? var8 : -var8);
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(Lwm;B)V", line = 165)
    public final void method1514(class254 arg0, byte arg1) {
        field3238++;
        while (true) {
            int var3 = arg0.method1774((byte) -115);
            if (var3 == 0) {
                if (arg1 != -120) {
                    this.method1512((class254) null, 122, (byte) -32);
                }
                return;
            }
            this.method1512(arg0, var3, (byte) 126);
        }
    }
}
