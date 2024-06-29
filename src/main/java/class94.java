import java.awt.Font;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ec")
public abstract class class94 {

    @OriginalMember(owner = "client!ec", name = "e", descriptor = "I")
    public static int field1109 = -1;

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "I")
    public static int field1105 = 0;

    @OriginalMember(owner = "client!ec", name = "f", descriptor = "[I")
    public static int[] field1110 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "I")
    public static int field1106;

    @OriginalMember(owner = "client!ec", name = "c", descriptor = "I")
    public static int field1107;

    @OriginalMember(owner = "client!ec", name = "g", descriptor = "I")
    public static int field1111;

    @OriginalMember(owner = "client!ec", name = "h", descriptor = "I")
    public static int field1112;

    @OriginalMember(owner = "client!ec", name = "i", descriptor = "I")
    public static int field1113;

    @OriginalMember(owner = "client!ec", name = "d", descriptor = "Ljava/awt/Font;")
    public static Font field1108;

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(I)Lop;")
    public abstract class258 method583(int arg0);

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(IZ)I")
    public abstract int method584(int arg0, boolean arg1);

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(BI)V")
    public abstract void method585(byte arg0, int arg1);

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(IIIIIIIIZII)Z")
    public static final boolean method586(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, int arg9, int arg10) {
        field1106++;
        int var11 = class218.method1327(arg6, class355.field4824, arg10, arg8, -9, arg4, arg5, class266.field3431, arg3, class156.field1815[class43.field513], arg9, class143.field1684.method841(true), arg2, arg0, arg7);
        if (var11 < 1) {
            return false;
        }
        class90.field1043 = class355.field4824[var11 - 1];
        class249.field3276 = class266.field3431[var11 - arg1];
        class319.field4292 = false;
        class57.method315((byte) 85);
        return true;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(B)V")
    public static void method587(byte arg0) {
        field1108 = null;
        field1110 = null;
        if (arg0 != 122) {
            method589(-124);
        }
    }

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "(I)V")
    public static final void method588(int arg0) {
        int var1 = -17 % ((-arg0 - 44) / 40);
        class365 var2 = class108.field1288;
        synchronized (class108.field1288) {
            class108.field1288.method2298(0);
        }
        field1113++;
    }

    @OriginalMember(owner = "client!ec", name = "c", descriptor = "(I)V")
    public static final void method589(int arg0) {
        if (class424.field5811 != null) {
            class424.field5811.method1114(12863);
        }
        field1107++;
        if (class252.field3301 != null) {
            class252.field3301.method1114(12863);
        }
        if (arg0 > -115) {
            field1109 = 22;
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(II)Z")
    public static final boolean method590(int arg0, int arg1) {
        field1111++;
        if (arg0 == 12 || arg0 == 11 || arg0 == 45 || arg0 == 47 || arg0 == 46) {
            return true;
        } else if (arg0 == 6 || arg0 == 1009) {
            return true;
        } else {
            return arg1 != 45;
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(Lfe;Z)Z")
    public static final boolean method591(class133 arg0, boolean arg1) {
        boolean var2 = class75.field915 == class304.field4096;
        int var3 = 0;
        arg0.method240((byte) -59);
        if (arg0.field1512 < 0 || arg0.field1518 < 0 || arg0.field1510 >= class43.field512 || arg0.field1517 >= class262.field3367) {
            return false;
        }
        for (int var4 = arg0.field1512; var4 <= arg0.field1510; var4++) {
            for (int var7 = arg0.field1518; var7 <= arg0.field1517; var7++) {
                int var8 = 0;
                if (var4 > arg0.field1512) {
                    var8++;
                }
                if (var4 < arg0.field1510) {
                    var8 += 4;
                }
                if (var7 > arg0.field1518) {
                    var8 += 8;
                }
                if (var7 < arg0.field1517) {
                    var8 += 2;
                }
                class75.method443(arg0.field1528, var4, var7);
                class316 var9 = class347.field4722[arg0.field1528][var4][var7];
                class272 var10 = class275.method1725(var8, 0, arg0);
                class272 var11 = var9.field4256;
                if (var11 == null) {
                    var9.field4256 = var10;
                } else {
                    while (var11.field3514 != null) {
                        var11 = var11.field3514;
                    }
                    var11.field3514 = var10;
                }
                var9.field4264 = (byte) (var9.field4264 | var8);
                if (var2 && class134.field1536[var4][var7] != 0) {
                    var3 = class134.field1536[var4][var7];
                }
            }
        }
        if (var2 && var3 != 0) {
            for (int var5 = arg0.field1512; var5 <= arg0.field1510; var5++) {
                for (int var6 = arg0.field1518; var6 <= arg0.field1517; var6++) {
                    if (class134.field1536[var5][var6] == 0) {
                        class134.field1536[var5][var6] = var3;
                    }
                }
            }
        }
        if (arg1) {
            class46.field526[class125.field1398++] = arg0;
        }
        return true;
    }

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "(II)[B")
    public abstract byte[] method592(int arg0, int arg1);
}
