import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bs")
public class class447 extends class272 {

    @OriginalMember(owner = "client!bs", name = "q", descriptor = "Lgd;")
    public static class206 field6083 = new class206("level: ", "Stufe: ", "niveau ", "nível: ");

    @OriginalMember(owner = "client!bs", name = "s", descriptor = "Lh;")
    public static class434 field6085 = new class434(74, 4);

    @OriginalMember(owner = "client!bs", name = "t", descriptor = "I")
    public static int field6086 = -1;

    @OriginalMember(owner = "client!bs", name = "i", descriptor = "I")
    public static int field6075;

    @OriginalMember(owner = "client!bs", name = "j", descriptor = "I")
    public static int field6076;

    @OriginalMember(owner = "client!bs", name = "k", descriptor = "I")
    public static int field6077;

    @OriginalMember(owner = "client!bs", name = "l", descriptor = "I")
    public static int field6078;

    @OriginalMember(owner = "client!bs", name = "n", descriptor = "I")
    public static int field6080;

    @OriginalMember(owner = "client!bs", name = "o", descriptor = "I")
    public static int field6081;

    @OriginalMember(owner = "client!bs", name = "p", descriptor = "I")
    public static int field6082;

    @OriginalMember(owner = "client!bs", name = "u", descriptor = "I")
    public static int field6087;

    @OriginalMember(owner = "client!bs", name = "m", descriptor = "Lbs;")
    public class447 field6079;

    @OriginalMember(owner = "client!bs", name = "r", descriptor = "Lbs;")
    public class447 field6084;

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(ILjava/lang/String;ILjava/lang/String;ILjava/lang/String;)V")
    public static final void method2624(int arg0, String arg1, int arg2, String arg3, int arg4, String arg5) {
        field6078++;
        if (arg0 >= 32) {
            class323.method1795(arg2, (String) null, 72, arg3, -1, arg4, arg5, arg1);
        }
    }

    @OriginalMember(owner = "client!bs", name = "b", descriptor = "(I)I")
    public static final int method2625(int arg0) {
        field6077++;
        if (arg0 <= 10) {
            return 33;
        }
        if (class385.field5314 == null) {
            if (!class385.field5334 && class475.field6540 > 0) {
                if (class266.field3517 && class449.field6111.method882((byte) -74, 81) && class475.field6540 > 2) {
                    return ((class395) class450.field6121.field1573.field6048.field6048).field5476;
                }
                return ((class395) class450.field6121.field1573.field6048).field5476;
            }
            int var1 = class34.field523.method1916((byte) -21);
            int var2 = class34.field523.method1925(50);
            int var3 = class2.field40;
            int var4 = class94.field1390;
            int var5 = class97.field1419;
            if (var3 < var1 && var1 < var3 + var5) {
                int var6 = -1;
                for (int var7 = 0; var7 < class475.field6540; var7++) {
                    if (class316.field4178) {
                        int var11 = (class475.field6540 - var7 - 1) * 16 + var4 + 33;
                        if ((var11 - 13) < var2 && (var11 + 3) >= var2) {
                            var6 = var7;
                        }
                    } else {
                        int var12 = var4 + ((-var7 + -1 + class475.field6540) * 16) + 31;
                        if (var2 > (var12 - 13) && var12 + 3 >= var2) {
                            var6 = var7;
                        }
                    }
                }
                if (var6 != -1) {
                    int var8 = 0;
                    class260 var9 = new class260(class450.field6121);
                    for (class395 var10 = (class395) var9.method1466((byte) -118); var10 != null; var10 = (class395) var9.method1463(34)) {
                        if (var6 == (var8++)) {
                            return var10.field5476;
                        }
                    }
                }
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(BI)V")
    public static final void method2626(byte arg0, int arg1) {
        class76 var2 = class480.field6631;
        synchronized (class480.field6631) {
            class480.field6631.method496(arg1, arg0 ^ 0x2E);
        }
        field6082++;
        if (arg0 != -126) {
            method2627(-30, -54, 20, -84, -118, -98);
        }
    }

    @OriginalMember(owner = "client!bs", name = "b", descriptor = "(IIIIII)V")
    public static final void method2627(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = -119 % ((45 - arg3) / 44);
        field6081++;
        class40.field576 = arg2;
        class464.field6420 = arg0;
        class153.field2148 = arg5;
        class252.field3361 = arg1;
        field6087 = arg4;
        if (field6087 >= 100) {
            int var7 = class153.field2148 * 128 + 64;
            int var8 = class40.field576 * 128 + 64;
            int var9 = class247.method1385(-123, var7, var8, class373.field5104) - class252.field3361;
            int var10 = var7 - class197.field2680;
            int var11 = var9 - class195.field2638;
            int var12 = var8 - class412.field5637;
            int var13 = (int) Math.sqrt((double) (var10 * var10 + var12 * var12));
            class155.field2171 = (int) (Math.atan2((double) var11, (double) var13) * 2607.5945876176133D) & 0x3FFF;
            class348.field4796 = (int) (-2607.5945876176133D * Math.atan2((double) var10, (double) var12)) & 0x3FFF;
            class176.field2398 = 0;
            if (class155.field2171 < 1024) {
                class155.field2171 = 1024;
            }
            if (class155.field2171 > 3072) {
                class155.field2171 = 3072;
            }
        }
        class56.field772 = 2;
    }

    @OriginalMember(owner = "client!bs", name = "c", descriptor = "(I)V")
    public static void method2628(int arg0) {
        field6085 = null;
        field6083 = null;
        if (arg0 != 33) {
            field6083 = null;
        }
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(IIIIIII)I")
    public static final int method2629(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field6075++;
        if ((arg1 & 0x1) == 1) {
            int var7 = arg4;
            arg4 = arg6;
            arg6 = var7;
        }
        int var8 = arg0 & 0x3;
        if (var8 == 0) {
            return arg5;
        } else if (var8 == 1) {
            return 7 + 1 - arg4 - arg2;
        } else if (arg3 == -31724) {
            return var8 == 2 ? 7 - arg5 - (arg6 - 1) : arg2;
        } else {
            return -106;
        }
    }

    @OriginalMember(owner = "client!bs", name = "b", descriptor = "(B)V")
    public final void method2630(byte arg0) {
        field6076++;
        if (this.field6084 == null) {
            return;
        }
        this.field6084.field6079 = this.field6079;
        this.field6079.field6084 = this.field6084;
        this.field6079 = null;
        this.field6084 = null;
        int var2 = -69 % ((arg0 + 7) / 51);
    }

    @OriginalMember(owner = "client!bs", name = "d", descriptor = "(I)V")
    public static final void method2631(int arg0) {
        field6080++;
        if (arg0 != 25050) {
            return;
        }
        int var1 = 0;
        for (int var2 = 0; var2 < class295.field3947; var2++) {
            for (int var3 = 0; var3 < class39.field567; var3++) {
                if (class354.method2181(class289.field3897, true, arg0 ^ 0x5838, var2, var3, var1)) {
                    var1++;
                }
                if (var1 >= 512) {
                    return;
                }
            }
        }
    }
}
