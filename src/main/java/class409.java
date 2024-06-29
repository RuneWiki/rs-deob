import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mf")
public class class409 {

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "[Ljava/lang/String;")
    public static String[] field5848 = new String[100];

    @OriginalMember(owner = "client!mf", name = "d", descriptor = "Leda;")
    public static class116 field5851 = new class116(43, 6);

    @OriginalMember(owner = "client!mf", name = "h", descriptor = "[I")
    public static int[] field5855 = new int[1000];

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "I")
    public static int field5849;

    @OriginalMember(owner = "client!mf", name = "c", descriptor = "I")
    public static int field5850;

    @OriginalMember(owner = "client!mf", name = "e", descriptor = "I")
    public static int field5852;

    @OriginalMember(owner = "client!mf", name = "f", descriptor = "I")
    public static int field5853;

    @OriginalMember(owner = "client!mf", name = "g", descriptor = "I")
    public static int field5854;

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(I)V")
    public static void method2444(int arg0) {
        field5851 = null;
        if (arg0 <= 70) {
            method2445(false, 124, 90, -108, -35, 32);
        }
        field5855 = null;
        field5848 = null;
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(ZIIIII)V")
    public static final void method2445(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field5850++;
        int var6 = arg1 - arg5;
        int var7 = arg2 - arg4;
        if (arg0) {
            return;
        }
        if (var6 == 0) {
            if (var7 != 0) {
                class621.method3502(arg2, arg3, arg5, arg4, (byte) 77);
            }
        } else if (var7 == 0) {
            class133.method1026(arg1, arg4, arg3, (byte) 125, arg5);
        } else {
            int var8 = (var7 << 12) / var6;
            int var9 = arg4 - (arg5 * var8 >> 12);
            int var10;
            int var11;
            if (arg5 < class512.field7620) {
                var10 = var9 + (class512.field7620 * var8 >> 12);
                var11 = class512.field7620;
            } else if (arg5 <= class94.field1398) {
                var11 = arg5;
                var10 = arg4;
            } else {
                var11 = class94.field1398;
                var10 = (class94.field1398 * var8 >> 12) + var9;
            }
            int var12;
            int var13;
            if (arg1 < class512.field7620) {
                var12 = (class512.field7620 * var8 >> 12) + var9;
                var13 = class512.field7620;
            } else if (arg1 <= class94.field1398) {
                var13 = arg1;
                var12 = arg2;
            } else {
                var12 = (class94.field1398 * var8 >> 12) + var9;
                var13 = class94.field1398;
            }
            if (var12 < class198.field3084) {
                var13 = (class198.field3084 - var9 << 12) / var8;
                var12 = class198.field3084;
            } else if (var12 > class627.field8931) {
                var13 = (class627.field8931 - var9 << 12) / var8;
                var12 = class627.field8931;
            }
            if (var10 < class198.field3084) {
                var11 = (class198.field3084 - var9 << 12) / var8;
                var10 = class198.field3084;
            } else if (var10 > class627.field8931) {
                var10 = class627.field8931;
                var11 = (class627.field8931 - var9 << 12) / var8;
            }
            class580.method3362(arg3, var12, -13865, var10, var13, var11);
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(BI)C")
    public static final char method2446(byte arg0, int arg1) {
        field5854++;
        int var2 = arg0 & 0xFF;
        if (arg1 != -18082) {
            return (char) 65417;
        } else if (var2 == 0) {
            throw new IllegalArgumentException("Non cp1252 character 0x" + Integer.toString(var2, 16) + " provided");
        } else {
            if (var2 >= 128 && var2 < 160) {
                char var3 = class516.field7644[var2 - 128];
                if (var3 == '\u0000') {
                    var3 = '?';
                }
                var2 = var3;
            }
            return (char) var2;
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(III)I")
    public final int method2447(int arg0, int arg1, int arg2) {
        field5853++;
        int var4 = arg1 >= class597.field8633 ? arg1 : class597.field8633;
        if (class370.field5123 == this) {
            return 0;
        } else if (class10.field128 == this) {
            return var4 - arg2;
        } else {
            if (arg0 != -1464849236) {
                field5848 = null;
            }
            return class234.field3469 == this ? (var4 - arg2) / 2 : 0;
        }
    }

    @OriginalMember(owner = "client!mf", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field5849++;
        throw new IllegalStateException();
    }
}
