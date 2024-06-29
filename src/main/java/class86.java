import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kd")
public class class86 {

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "Lre;")
    public class303 field1370;

    @OriginalMember(owner = "client!kd", name = "d", descriptor = "I")
    public int field1373;

    @OriginalMember(owner = "client!kd", name = "i", descriptor = "I")
    public static int field1378 = -2;

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "I")
    public static int field1371;

    @OriginalMember(owner = "client!kd", name = "c", descriptor = "I")
    public static int field1372;

    @OriginalMember(owner = "client!kd", name = "f", descriptor = "I")
    public static int field1375;

    @OriginalMember(owner = "client!kd", name = "g", descriptor = "I")
    public static int field1376;

    @OriginalMember(owner = "client!kd", name = "h", descriptor = "I")
    public static int field1377;

    @OriginalMember(owner = "client!kd", name = "e", descriptor = "Lcg;")
    public static class49 field1374;

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(Lwk;IIIIIIZ)V", line = 9)
    public static final void method766(class192 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        int var8 = arg0.field3219.length;
        for (int var9 = 0; var9 < var8; var9++) {
            int var10 = arg0.field3219[var9] - class233.field3870;
            int var11 = arg0.field3207[var9] - class205.field3502;
            int var12 = arg0.field3218[var9] - class75.field1226;
            int var13 = arg3 * var12 + arg4 * var10 >> 16;
            int var14 = arg4 * var12 - arg3 * var10 >> 16;
            int var16 = arg2 * var11 - arg1 * var14 >> 16;
            int var17 = arg1 * var11 + arg2 * var14 >> 16;
            if (var17 < 50) {
                return;
            }
            if (arg0.field3209 != null) {
                class192.field3222[var9] = var13;
                class192.field3226[var9] = var16;
                class192.field3220[var9] = var17;
            }
            class192.field3216[var9] = (var13 << 9) / var17 + class62.field951;
            class192.field3213[var9] = (var16 << 9) / var17 + class62.field960;
        }
        class62.field954 = 0;
        int var19 = arg0.field3208.length;
        for (int var20 = 0; var20 < var19; var20++) {
            int var21 = arg0.field3208[var20];
            int var22 = arg0.field3223[var20];
            int var23 = arg0.field3217[var20];
            int var24 = class192.field3216[var21];
            int var25 = class192.field3216[var22];
            int var26 = class192.field3216[var23];
            int var27 = class192.field3213[var21];
            int var28 = class192.field3213[var22];
            int var29 = class192.field3213[var23];
            if ((var24 - var25) * (var29 - var28) - (var26 - var25) * (var27 - var28) > 0) {
                if (class50.field785 && class77.method703(class62.field951 + class160.field2841, class62.field960 + class158.field2805, var27, var28, var29, var24, var25, var26)) {
                    class97.field1565 = arg5;
                    class290.field4628 = arg6;
                }
                if (!class43.field680 && !arg7) {
                    class62.field950 = false;
                    if (var24 < 0 || var25 < 0 || var26 < 0 || var24 > class62.field952 || var25 > class62.field952 || var26 > class62.field952) {
                        class62.field950 = true;
                    }
                    if (arg0.field3209 == null || arg0.field3209[var20] == -1) {
                        if (arg0.field3211[var20] != 12345678) {
                            class62.method587(var27, var28, var29, var24, var25, var26, arg0.field3211[var20], arg0.field3215[var20], arg0.field3214[var20]);
                        }
                    } else if (!class95.field1487) {
                        int var30 = class62.field953.method1220(arg0.field3209[var20], -99);
                        class62.method587(var27, var28, var29, var24, var25, var26, class78.method714(var30, arg0.field3211[var20]), class78.method714(var30, arg0.field3215[var20]), class78.method714(var30, arg0.field3214[var20]));
                    } else if (arg0.field3221) {
                        class62.method571(var27, var28, var29, var24, var25, var26, arg0.field3211[var20], arg0.field3215[var20], arg0.field3214[var20], class192.field3222[0], class192.field3222[1], class192.field3222[3], class192.field3226[0], class192.field3226[1], class192.field3226[3], class192.field3220[0], class192.field3220[1], class192.field3220[3], arg0.field3209[var20]);
                    } else {
                        class62.method571(var27, var28, var29, var24, var25, var26, arg0.field3211[var20], arg0.field3215[var20], arg0.field3214[var20], class192.field3222[var21], class192.field3222[var22], class192.field3222[var23], class192.field3226[var21], class192.field3226[var22], class192.field3226[var23], class192.field3220[var21], class192.field3220[var22], class192.field3220[var23], arg0.field3209[var20]);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(B)V", line = 121)
    public static void method767(byte arg0) {
        field1374 = null;
        if (arg0 <= 49) {
            field1377 = 82;
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(ZII)V", line = 142)
    public static final void method768(boolean arg0, int arg1, int arg2) {
        class334.field5302[arg1] = arg2;
        class132 var3 = (class132) class104.field1741.method732((long) arg1, true);
        field1371++;
        if (var3 == null) {
            class132 var4 = new class132(4611686018427387905L);
            class104.field1741.method725((long) arg1, var4, 1);
        } else if (var3.field2266 != 4611686018427387905L) {
            var3.field2266 = class306.method2102(-289) + 500L | 0x4000000000000000L;
        }
        if (arg0) {
            method768(false, -42, 17);
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(IB)V", line = 167)
    public static final void method769(int arg0, byte arg1) {
        field1375++;
        if (arg0 == -1 || !class272.method1863(-671591600, arg0)) {
            return;
        }
        if (arg1 <= 53) {
            field1378 = -50;
        }
        class137[] var2 = class109.field1852[arg0];
        for (int var3 = 0; var3 < var2.length; var3++) {
            class137 var4 = var2[var3];
            if (var4.field2401 != null) {
                class258 var5 = new class258();
                var5.field4168 = var4;
                var5.field4173 = var4.field2401;
                class77.method704(true, 2000000, var5);
            }
        }
    }

    @OriginalMember(owner = "client!kd", name = "<init>", descriptor = "(II)V", line = 208)
    public class86(int arg0, int arg1) {
        this.field1370 = class166.method1303(1, arg0);
        this.field1373 = arg1;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(SLjava/lang/String;Ljava/lang/String;IIJII)V", line = 218)
    public static final void method770(short arg0, String arg1, String arg2, int arg3, int arg4, long arg5, int arg6, int arg7) {
        field1372++;
        if (class207.field3515) {
            return;
        }
        if (arg3 < 24) {
            field1378 = 67;
        }
        if (class293.field4708 >= 500) {
            return;
        }
        class166.field2909[class293.field4708] = arg2;
        class241.field3944[class293.field4708] = arg1;
        class221.field3691[class293.field4708] = arg4 == -1 ? class321.field5075 : arg4;
        class276.field4401[class293.field4708] = arg0;
        class110.field1868[class293.field4708] = arg5;
        class161.field2863[class293.field4708] = arg7;
        class70.field1135[class293.field4708] = arg6;
        class293.field4708++;
    }

    @OriginalMember(owner = "client!kd", name = "<init>", descriptor = "(Lre;I)V", line = 241)
    public class86(class303 arg0, int arg1) {
        this.field1373 = arg1;
        this.field1370 = arg0;
    }
}
