import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wb")
public class class287 {

    @OriginalMember(owner = "client!wb", name = "c", descriptor = "I")
    public int field4448;

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "I")
    public int field4446;

    @OriginalMember(owner = "client!wb", name = "h", descriptor = "I")
    public int field4453;

    @OriginalMember(owner = "client!wb", name = "m", descriptor = "Lso;")
    public class121 field4458;

    @OriginalMember(owner = "client!wb", name = "g", descriptor = "Z")
    public static boolean field4452 = false;

    @OriginalMember(owner = "client!wb", name = "i", descriptor = "I")
    public static int field4454 = 127;

    @OriginalMember(owner = "client!wb", name = "l", descriptor = "Ljava/lang/String;")
    public static String field4457 = "K";

    @OriginalMember(owner = "client!wb", name = "k", descriptor = "I")
    public static int field4456 = 0;

    @OriginalMember(owner = "client!wb", name = "d", descriptor = "I")
    public static int field4449;

    @OriginalMember(owner = "client!wb", name = "e", descriptor = "I")
    public static int field4450;

    @OriginalMember(owner = "client!wb", name = "f", descriptor = "I")
    public static int field4451;

    @OriginalMember(owner = "client!wb", name = "j", descriptor = "I")
    public static int field4455;

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "Z")
    public static boolean field4447;

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(IILrg;ZI)V", line = 7)
    public static final void method2075(int arg0, int arg1, class342 arg2, boolean arg3, int arg4) {
        field4455++;
        int var5 = arg2.field5374;
        if (arg0 != -27006) {
            return;
        }
        int var6 = arg2.field5339;
        if (arg2.field5347 == 0) {
            arg2.field5374 = arg2.field5355;
        } else if (arg2.field5347 == 1) {
            arg2.field5374 = arg4 - arg2.field5355;
        } else if (arg2.field5347 == 2) {
            arg2.field5374 = arg2.field5355 * arg4 >> 14;
        } else if (arg2.field5347 == 3) {
            if (arg2.field5279 == 2) {
                arg2.field5374 = (arg2.field5355 - 1) * arg2.field5286 + arg2.field5355 * 32;
            } else if (arg2.field5279 == 7) {
                arg2.field5374 = (arg2.field5355 - 1) * arg2.field5286 + arg2.field5355 * 115;
            }
        }
        if (arg2.field5348 == 0) {
            arg2.field5339 = arg2.field5413;
        } else if (arg2.field5348 == 1) {
            arg2.field5339 = arg1 - arg2.field5413;
        } else if (arg2.field5348 == 2) {
            arg2.field5339 = arg2.field5413 * arg1 >> 14;
        } else if (arg2.field5348 == 3) {
            if (arg2.field5279 == 2) {
                arg2.field5339 = (arg2.field5413 - 1) * arg2.field5370 + arg2.field5413 * 32;
            } else if (arg2.field5279 == 7) {
                arg2.field5339 = (arg2.field5413 - 1) * arg2.field5370 + arg2.field5413 * 12;
            }
        }
        if (arg2.field5347 == 4) {
            arg2.field5374 = arg2.field5409 * arg2.field5339 / arg2.field5353;
        }
        if (arg2.field5348 == 4) {
            arg2.field5339 = arg2.field5374 * arg2.field5353 / arg2.field5409;
        }
        if (class18.field290 && (client.method1022(arg2).field3544 != 0 || arg2.field5279 == 0)) {
            if (arg2.field5339 < 5 && arg2.field5374 < 5) {
                arg2.field5339 = 5;
                arg2.field5374 = 5;
            } else {
                if (arg2.field5374 <= 0) {
                    arg2.field5374 = 5;
                }
                if (arg2.field5339 <= 0) {
                    arg2.field5339 = 5;
                }
            }
        }
        if (arg2.field5427 == 1337) {
            class85.field1220 = arg2;
        }
        if (arg3 && arg2.field5281 != null && (arg2.field5374 != var5 || arg2.field5339 != var6)) {
            class112 var7 = new class112();
            var7.field1706 = arg2;
            var7.field1711 = arg2.field5281;
            class197.field3073.method2245(var7, arg0 ^ 0xFFFF96A7);
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(II)V", line = 116)
    public static final void method2076(int arg0, int arg1) {
        class203.field3133.method649((byte) 75, arg1);
        int var2 = 118 % ((35 - arg0) / 45);
        field4451++;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(BIJIZ)Ljava/lang/String;", line = 131)
    public static final String method2077(byte arg0, int arg1, long arg2, int arg3, boolean arg4) {
        char var6 = ',';
        char var7 = '.';
        field4449++;
        boolean var8 = false;
        if (arg2 < 0L) {
            arg2 = -arg2;
            var8 = true;
        }
        if (arg1 == 0) {
            var7 = ',';
            var6 = '.';
        }
        if (arg1 == 2) {
            var7 = ' ';
        }
        StringBuffer var9 = new StringBuffer(26);
        if (arg3 > 0) {
            for (int var10 = 0; var10 < arg3; var10++) {
                int var11 = (int) arg2;
                arg2 /= 10L;
                var9.append((char) (var11 + 48 - ((int) arg2 * 10)));
            }
            var9.append(var6);
        }
        int var12 = 0;
        int var13 = -57 / ((-arg0 - 73) / 47);
        while (true) {
            int var14 = (int) arg2;
            arg2 /= 10L;
            var9.append((char) (var14 + 48 - ((int) arg2 * 10)));
            if (arg2 == 0L) {
                if (var8) {
                    var9.append('-');
                }
                return var9.reverse().toString();
            }
            if (arg4) {
                var12++;
                if (var12 % 3 == 0) {
                    var9.append(var7);
                }
            }
        }
    }

    @OriginalMember(owner = "client!wb", name = "<init>", descriptor = "(IIII)V", line = 215)
    public class287(int arg0, int arg1, int arg2, int arg3) {
        class121 var5 = class243.method1833(true, arg0);
        this.field4448 = arg3;
        this.field4446 = arg2;
        this.field4453 = arg1;
        if (class240.field3737 || var5.field1936 == -1) {
            this.field4458 = var5;
        } else {
            this.field4458 = class243.method1833(true, var5.field1936);
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(B)V", line = 236)
    public static void method2078(byte arg0) {
        if (arg0 == -63) {
            field4457 = null;
        }
    }

    @OriginalMember(owner = "client!wb", name = "<init>", descriptor = "(Lso;III)V", line = 244)
    public class287(class121 arg0, int arg1, int arg2, int arg3) {
        this.field4446 = arg2;
        this.field4448 = arg3;
        this.field4453 = arg1;
        this.field4458 = arg0;
    }
}
