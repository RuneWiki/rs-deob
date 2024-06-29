import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ff")
public class class479 extends class551 {

    @OriginalMember(owner = "client!ff", name = "z", descriptor = "[B")
    public byte[] field7275;

    @OriginalMember(owner = "client!ff", name = "s", descriptor = "Ljava/lang/String;")
    public static String field7268 = null;

    @OriginalMember(owner = "client!ff", name = "u", descriptor = "Ljava/lang/String;")
    public static String field7270 = null;

    @OriginalMember(owner = "client!ff", name = "t", descriptor = "I")
    public static int field7269;

    @OriginalMember(owner = "client!ff", name = "v", descriptor = "I")
    public static int field7271;

    @OriginalMember(owner = "client!ff", name = "w", descriptor = "I")
    public static int field7272;

    @OriginalMember(owner = "client!ff", name = "x", descriptor = "I")
    public static int field7273;

    @OriginalMember(owner = "client!ff", name = "y", descriptor = "I")
    public static int field7274;

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(Z)V")
    public static final void method2904(boolean arg0) {
        if (class538.field7973 > 0) {
            int var1 = 0;
            for (int var2 = 0; var2 < class59.field709.length; var2++) {
                if (class59.field709[var2].startsWith("--> ")) {
                    var1++;
                    if (class538.field7973 == var1) {
                        class545.field8138 = class59.field709[var2].substring(4);
                        break;
                    }
                }
            }
        } else {
            class545.field8138 = "";
        }
        field7273++;
        if (!arg0) {
            field7268 = null;
        }
    }

    @OriginalMember(owner = "client!ff", name = "g", descriptor = "(I)V")
    public static void method2905(int arg0) {
        field7270 = null;
        if (arg0 < 41) {
            method2908((byte) 115, -71);
        }
        field7268 = null;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(IIIIZIII)V")
    public static final void method2906(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7) {
        if (arg0 >= class130.field1712 && arg1 <= class401.field5755 && class483.field7334 <= arg5 && arg6 <= class202.field3021) {
            class25.method116(arg2, arg3, arg6, arg5, arg1, arg0, arg7, true);
        } else {
            class147.method871(arg0, arg3, -28853, arg5, arg7, arg1, arg6, arg2);
        }
        if (!arg4) {
            method2907((byte) 44);
        }
        field7271++;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(B)V")
    public static final void method2907(byte arg0) {
        field7274++;
        if (class353.field5140 != 3 && class46.field548.field6633 != -1) {
            class395.method2377(class46.field548.field6633, class46.field548.field6630, arg0 + 27);
        }
        if (arg0 != -29) {
            method2906(-64, -89, -28, 48, true, -77, -43, 120);
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(BI)I")
    public static final int method2908(byte arg0, int arg1) {
        field7272++;
        int var7 = arg1 - 1;
        if (arg0 != -99) {
            method2904(true);
        }
        int var2 = var7 | var7 >>> 1;
        int var3 = var2 | var2 >>> 2;
        int var4 = var3 | var3 >>> 4;
        int var5 = var4 | var4 >>> 8;
        int var6 = var5 | var5 >>> 16;
        return var6 + 1;
    }

    @OriginalMember(owner = "client!ff", name = "<init>", descriptor = "([B)V")
    public class479(byte[] arg0) {
        this.field7275 = arg0;
    }
}
