import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bda")
public class class505 {

    @OriginalMember(owner = "client!bda", name = "b", descriptor = "I")
    public int field7239;

    @OriginalMember(owner = "client!bda", name = "a", descriptor = "I")
    public static int field7238;

    @OriginalMember(owner = "client!bda", name = "c", descriptor = "I")
    public static int field7240;

    @OriginalMember(owner = "client!bda", name = "e", descriptor = "I")
    public static int field7242;

    @OriginalMember(owner = "client!bda", name = "f", descriptor = "I")
    public static int field7243;

    @OriginalMember(owner = "client!bda", name = "g", descriptor = "I")
    public static int field7244;

    @OriginalMember(owner = "client!bda", name = "d", descriptor = "Lda;")
    public static class59 field7241;

    @OriginalMember(owner = "client!bda", name = "a", descriptor = "(Ljava/lang/String;I)I")
    public static final int method2988(String arg0, int arg1) {
        if (arg1 != 0) {
            method2989(null, true);
        }
        field7240++;
        return arg0.length() + 1;
    }

    @OriginalMember(owner = "client!bda", name = "<init>", descriptor = "(I)V")
    public class505(int arg0) {
        this.field7239 = arg0;
    }

    @OriginalMember(owner = "client!bda", name = "a", descriptor = "(Lum;Z)Z")
    public static final boolean method2989(class524 arg0, boolean arg1) {
        boolean var2 = class459.field6474 == class135.field1969;
        int var3 = 0;
        short var4 = 0;
        byte var5 = 0;
        arg0.method1153(true);
        if (arg0.field7415 < 0 || arg0.field7418 < 0 || arg0.field7413 >= class492.field6939 || arg0.field7409 >= class365.field5171) {
            return false;
        }
        short var6 = 0;
        for (int var7 = arg0.field7415; var7 <= arg0.field7413; var7++) {
            for (int var11 = arg0.field7418; var11 <= arg0.field7409; var11++) {
                class165 var12 = class307.method2008(arg0.field1266, var7, var11);
                if (var12 != null) {
                    class356 var13 = class240.method1531(-78, arg0);
                    class356 var14 = var12.field2270;
                    if (var14 == null) {
                        var12.field2270 = var13;
                    } else {
                        while (var14.field5066 != null) {
                            var14 = var14.field5066;
                        }
                        var14.field5066 = var13;
                    }
                    if (var2 && (class200.field2636[var7][var11] & 0xFF000000) != 0) {
                        var3 = class200.field2636[var7][var11];
                        var4 = class130.field1565[var7][var11];
                        var5 = class414.field5823[var7][var11];
                    }
                    if (!arg1 && var12.field2266 != null && var12.field2266.field7425 > var6) {
                        var6 = var12.field2266.field7425;
                    }
                }
            }
        }
        if (var2 && (var3 & 0xFF000000) != 0) {
            for (int var8 = arg0.field7415; var8 <= arg0.field7413; var8++) {
                for (int var9 = arg0.field7418; var9 <= arg0.field7409; var9++) {
                    if ((class200.field2636[var8][var9] & 0xFF000000) == 0) {
                        class200.field2636[var8][var9] = var3;
                        class130.field1565[var8][var9] = var4;
                        class414.field5823[var8][var9] = var5;
                    }
                }
            }
        }
        if (arg1) {
            class448.field6355[class581.field8200++] = arg0;
        } else {
            int var10 = class459.field6474 == class135.field1969 ? 1 : 0;
            if (!arg0.method746(-113)) {
                arg0.field1251 = class321.field4433[var10];
                class321.field4433[var10] = arg0;
            } else if (arg0.method751(false)) {
                arg0.field1251 = class373.field5234[var10];
                class373.field5234[var10] = arg0;
            } else {
                arg0.field1251 = class710.field9861[var10];
                class710.field9861[var10] = arg0;
                class230.field3098 = true;
            }
        }
        if (arg1) {
            arg0.field1255 -= var6;
        }
        return true;
    }

    @OriginalMember(owner = "client!bda", name = "a", descriptor = "(I)I")
    public static final int method2990(int arg0) {
        int var1 = -1;
        for (int var2 = 0; var2 < class470.field6674 - 1; var2++) {
            if (arg0 < class552.field7766[var2] + class549.field7663[var2]) {
                var1 = var2;
                break;
            }
        }
        if (var1 == -1) {
            var1 = class470.field6674 - 1;
        }
        return var1;
    }

    @OriginalMember(owner = "client!bda", name = "a", descriptor = "(Ljb;II)I")
    public static final int method2991(class493 arg0, int arg1, int arg2) {
        field7244++;
        if (!client.method1950(arg0).method2850(-125, arg2) && arg0.field7040 == null) {
            return -1;
        } else {
            if (arg1 != 19161) {
                field7241 = null;
            }
            return arg0.field7015 == null || arg0.field7015.length <= arg2 ? -1 : arg0.field7015[arg2];
        }
    }

    @OriginalMember(owner = "client!bda", name = "a", descriptor = "(B)V")
    public static void method2992(byte arg0) {
        field7241 = null;
        int var1 = 41 % ((-arg0 - 1) / 50);
    }

    @OriginalMember(owner = "client!bda", name = "a", descriptor = "()V")
    public static final void method2993() {
        if (class656.field8999 != null) {
            for (int var0 = 0; var0 < class656.field8999.length; var0++) {
                for (int var1 = 0; var1 < class492.field6939; var1++) {
                    for (int var2 = 0; var2 < class365.field5171; var2++) {
                        if (class656.field8999[var0][var1][var2] != null) {
                            class656.field8999[var0][var1][var2].method1082((byte) 46);
                        }
                        class656.field8999[var0][var1][var2] = null;
                    }
                }
            }
        }
        class656.field8999 = null;
        class588.field8292 = null;
        if (class480.field6790 != null) {
            for (int var3 = 0; var3 < class480.field6790.length; var3++) {
                for (int var4 = 0; var4 < class492.field6939; var4++) {
                    for (int var5 = 0; var5 < class365.field5171; var5++) {
                        if (class480.field6790[var3][var4][var5] != null) {
                            class480.field6790[var3][var4][var5].method1082((byte) 46);
                        }
                        class480.field6790[var3][var4][var5] = null;
                    }
                }
            }
        }
        class480.field6790 = null;
        class135.field1969 = null;
        class553.field7776 = null;
        class459.field6474 = null;
        class589.field8299 = null;
        class178.field2384 = null;
        class679.field9321 = null;
        class373.field5239 = null;
        class43.field527 = null;
        class96.method706((byte) 96);
        if (class448.field6355 != null) {
            for (int var6 = 0; var6 < class581.field8200; var6++) {
                class448.field6355[var6] = null;
            }
            class581.field8200 = 0;
        }
        class710.field9861 = null;
        class373.field5234 = null;
        class321.field4433 = null;
        if (class110.field1336 != null) {
            for (int var7 = 0; var7 < class110.field1336.length; var7++) {
                class110.field1336[var7] = null;
            }
            class278.field3928 = 0;
        }
        if (class499.field7163 != null) {
            for (int var8 = 0; var8 < class499.field7163.length; var8++) {
                class499.field7163[var8] = null;
            }
            class347.field4911 = 0;
        }
        if (class290.field4085 != null) {
            for (int var9 = 0; var9 < class101.field1208; var9++) {
                class290.field4085[var9] = null;
            }
            for (int var10 = 0; var10 < class634.field8744; var10++) {
                for (int var11 = 0; var11 < class492.field6939; var11++) {
                    for (int var12 = 0; var12 < class365.field5171; var12++) {
                        class488.field6906[var10][var11][var12] = 0L;
                    }
                }
            }
            class101.field1208 = 0;
        }
        class652.method3590(0);
        class471.field6690 = class471.field6691;
        class471.field6690.method2781(32);
        class414.field5823 = null;
        class200.field2636 = null;
        class130.field1565 = null;
        if (class682.field9362 != null) {
            class109.method771();
            class362.field5135.method402(1);
            class362.field5135.method443(0);
        }
        if (class668.field9078 != null) {
            class668.field9078 = null;
        }
        class362.field5135 = null;
    }

    @OriginalMember(owner = "client!bda", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field7243++;
        throw new IllegalStateException();
    }
}
