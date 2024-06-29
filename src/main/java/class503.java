import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oc")
public class class503 {

    @OriginalMember(owner = "client!oc", name = "c", descriptor = "Ljava/lang/String;")
    private String field6989 = "null";

    @OriginalMember(owner = "client!oc", name = "n", descriptor = "I")
    public static int field7000 = 0;

    @OriginalMember(owner = "client!oc", name = "q", descriptor = "Z")
    public static volatile boolean field7003 = true;

    @OriginalMember(owner = "client!oc", name = "r", descriptor = "C")
    public char field7004;

    @OriginalMember(owner = "client!oc", name = "s", descriptor = "C")
    public char field7005;

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "I")
    public static int field6987;

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "I")
    public static int field6988;

    @OriginalMember(owner = "client!oc", name = "e", descriptor = "I")
    public static int field6991;

    @OriginalMember(owner = "client!oc", name = "f", descriptor = "I")
    public static int field6992;

    @OriginalMember(owner = "client!oc", name = "h", descriptor = "I")
    private int field6994;

    @OriginalMember(owner = "client!oc", name = "i", descriptor = "I")
    public static int field6995;

    @OriginalMember(owner = "client!oc", name = "j", descriptor = "I")
    public static int field6996;

    @OriginalMember(owner = "client!oc", name = "l", descriptor = "I")
    public static int field6998;

    @OriginalMember(owner = "client!oc", name = "m", descriptor = "I")
    public static int field6999;

    @OriginalMember(owner = "client!oc", name = "o", descriptor = "I")
    public static int field7001;

    @OriginalMember(owner = "client!oc", name = "p", descriptor = "I")
    public static int field7002;

    @OriginalMember(owner = "client!oc", name = "d", descriptor = "Lba;")
    private class607 field6990;

    @OriginalMember(owner = "client!oc", name = "g", descriptor = "Lba;")
    public class607 field6993;

    @OriginalMember(owner = "client!oc", name = "k", descriptor = "[[I")
    public static int[][] field6997;

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(ZI)I")
    public final int method2805(boolean arg0, int arg1) {
        field6988++;
        if (this.field6993 == null) {
            return this.field6994;
        }
        class147 var3 = (class147) this.field6993.method3476((long) arg1, (byte) 28);
        if (var3 == null) {
            return this.field6994;
        } else {
            if (!arg0) {
                this.field6990 = null;
            }
            return var3.field1902;
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(IIIIII)V")
    public static final void method2806(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class520.field7247 = arg1;
        class345.field4781 = arg0;
        class351.field4941 = arg4;
        class84.field1139 = arg5;
        if (arg2 != 256) {
            method2814(true, 58);
        }
        class6.field58 = arg3;
        field6996++;
        if (class520.field7247 >= 100) {
            int var6 = class351.field4941 * 512 + 256;
            int var7 = class6.field58 * 512 + 256;
            int var8 = class341.method2147(class187.field2407, var6, arg2 - 256, var7) - class84.field1139;
            int var9 = var6 - class196.field2555;
            int var10 = var8 - class186.field2364;
            int var11 = var7 - class434.field5901;
            int var12 = (int) Math.sqrt((double) (var9 * var9 + (var11 * var11)));
            class627.field9131 = (int) (Math.atan2((double) var10, (double) var12) * 2607.5945876176133D) & 0x3FFF;
            class60.field838 = (int) (-2607.5945876176133D * Math.atan2((double) var9, (double) var11)) & 0x3FFF;
            class392.field5439 = 0;
            if (class627.field9131 < 1024) {
                class627.field9131 = 1024;
            }
            if (class627.field9131 > 3072) {
                class627.field9131 = 3072;
            }
        }
        class621.field8952 = 2;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(ILge;I)V")
    private final void method2807(int arg0, class551 arg1, int arg2) {
        if (arg2 < 15) {
            this.field6993 = null;
        }
        field6987++;
        if (arg0 == 1) {
            this.field7005 = class515.method2865(0, arg1.method3051((byte) 121));
        } else if (arg0 == 2) {
            this.field7004 = class515.method2865(0, arg1.method3051((byte) 96));
        } else if (arg0 == 3) {
            this.field6989 = arg1.method3077(-20739);
        } else if (arg0 == 4) {
            this.field6994 = arg1.method3048(-4);
        } else if (arg0 == 5 || arg0 == 6) {
            int var4 = arg1.method3090(-114);
            this.field6993 = new class607(class468.method2685(var4, false));
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg1.method3048(-4);
                class108 var7;
                if (arg0 == 5) {
                    var7 = new class63(arg1.method3077(-20739));
                } else {
                    var7 = new class147(arg1.method3048(-4));
                }
                this.field6993.method3475(-94, var7, (long) var6);
            }
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(BI)Z")
    public final boolean method2808(byte arg0, int arg1) {
        field6995++;
        if (this.field6993 == null) {
            return false;
        }
        if (this.field6990 == null) {
            this.method2809((byte) -99);
        }
        class147 var3 = (class147) this.field6990.method3476((long) arg1, (byte) 28);
        if (arg0 != 98) {
            this.method2810((byte) -102);
        }
        return var3 != null;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(B)V")
    private final void method2809(byte arg0) {
        field6992++;
        this.field6990 = new class607(this.field6993.method3474((byte) 108));
        int var2 = -85 / ((arg0 + 44) / 55);
        for (class147 var3 = (class147) this.field6993.method3473(-27089); var3 != null; var3 = (class147) this.field6993.method3478((byte) 5)) {
            class147 var4 = new class147((int) var3.field1401);
            this.field6990.method3475(-123, var4, (long) var3.field1902);
        }
    }

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "(B)V")
    private final void method2810(byte arg0) {
        this.field6990 = new class607(this.field6993.method3474((byte) -98));
        if (arg0 <= 116) {
            this.field6994 = 23;
        }
        field6991++;
        for (class63 var2 = (class63) this.field6993.method3473(-27089); var2 != null; var2 = (class63) this.field6993.method3478((byte) 5)) {
            class548 var3 = new class548(var2.field862, (int) var2.field1401);
            this.field6990.method3475(-125, var3, class373.method2273(var2.field862, 124));
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(BLge;)V")
    public final void method2811(byte arg0, class551 arg1) {
        field7001++;
        while (true) {
            int var3 = arg1.method3045(-128);
            if (var3 == 0) {
                if (arg0 >= -89) {
                    method2806(110, -27, -68, -43, -62, -15);
                    return;
                } else {
                    return;
                }
            }
            this.method2807(var3, arg1, 29);
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(Ljava/lang/String;I)Z")
    public final boolean method2812(String arg0, int arg1) {
        field6999++;
        if (this.field6993 == null) {
            return false;
        } else if (arg1 == -6438) {
            if (this.field6990 == null) {
                this.method2810((byte) 118);
            }
            for (class548 var3 = (class548) this.field6990.method3476(class373.method2273(arg0, 89), (byte) 28); var3 != null; var3 = (class548) this.field6990.method3481(arg1 ^ 0xFFFFE693)) {
                if (var3.field7624.equals(arg0)) {
                    return true;
                }
            }
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "(ZI)Ljava/lang/String;")
    public final String method2813(boolean arg0, int arg1) {
        field7002++;
        if (this.field6993 == null) {
            return this.field6989;
        }
        class63 var3 = (class63) this.field6993.method3476((long) arg1, (byte) 28);
        if (arg0) {
            return var3 == null ? this.field6989 : var3.field862;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!oc", name = "c", descriptor = "(ZI)Z")
    public static final boolean method2814(boolean arg0, int arg1) {
        field6998++;
        if (arg1 != -12070) {
            method2806(88, -30, 124, 103, 61, -121);
        }
        boolean var2 = class301.field3918.method912();
        if (arg0 == var2) {
            return true;
        }
        if (!arg0) {
            class301.field3918.method994();
        } else if (!class301.field3918.method915()) {
            arg0 = false;
        }
        if (var2 == arg0) {
            return false;
        } else {
            class501.field6954.field7864 = arg0;
            class501.field6954.method3537(76, class31.field488);
            return true;
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(I)V")
    public static void method2815(int arg0) {
        if (arg0 != 1024) {
            field7000 = 27;
        }
        field6997 = null;
    }
}
