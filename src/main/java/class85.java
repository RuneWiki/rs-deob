import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vr")
public class class85 {

    @OriginalMember(owner = "client!vr", name = "l", descriptor = "Z")
    public boolean field1434 = true;

    @OriginalMember(owner = "client!vr", name = "c", descriptor = "[I")
    public static int[] field1425 = new int[14];

    @OriginalMember(owner = "client!vr", name = "d", descriptor = "[Lfn;")
    public static class87[] field1426 = new class87[14];

    @OriginalMember(owner = "client!vr", name = "h", descriptor = "C")
    private char field1430;

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "I")
    public int field1423;

    @OriginalMember(owner = "client!vr", name = "b", descriptor = "I")
    public static int field1424;

    @OriginalMember(owner = "client!vr", name = "e", descriptor = "I")
    public static int field1427;

    @OriginalMember(owner = "client!vr", name = "f", descriptor = "I")
    public static int field1428;

    @OriginalMember(owner = "client!vr", name = "g", descriptor = "I")
    public static int field1429;

    @OriginalMember(owner = "client!vr", name = "i", descriptor = "I")
    public static int field1431;

    @OriginalMember(owner = "client!vr", name = "j", descriptor = "I")
    public static int field1432;

    @OriginalMember(owner = "client!vr", name = "k", descriptor = "I")
    public static int field1433;

    @OriginalMember(owner = "client!vr", name = "o", descriptor = "I")
    public static int field1437;

    @OriginalMember(owner = "client!vr", name = "p", descriptor = "I")
    public static int field1438;

    @OriginalMember(owner = "client!vr", name = "m", descriptor = "Llt;")
    public static class458 field1435;

    @OriginalMember(owner = "client!vr", name = "n", descriptor = "Ljava/lang/String;")
    public String field1436;

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(I)V")
    public static void method597(int arg0) {
        field1435 = null;
        field1425 = null;
        if (arg0 > 122) {
            field1426 = null;
        }
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(IIIIB)V")
    public static final void method598(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        int var5 = -121 / ((-arg4 - 26) / 49);
        if (class451.field6946 == 1) {
            class7.field89[class35.field492 / 100].method994(class188.field2981 - 8, class62.field1036 + -8);
        }
        field1428++;
        if (class451.field6946 == 2) {
            class7.field89[class35.field492 / 100 + 4].method994(class188.field2981 - 8, class62.field1036 + -8);
        }
        class167.method1049(false);
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(IIIIIIIZI)V")
    public static final void method599(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8) {
        field1427++;
        if (class376.method2264((byte) -108, arg3)) {
            if (arg7) {
                field1435 = null;
            }
            if (class332.field4972[arg3] == null) {
                class202.method1256(arg5, -1, arg8, (byte) -42, arg0, arg2, arg1, arg4, arg6, class409.field5933[arg3]);
            } else {
                class202.method1256(arg5, -1, arg8, (byte) -120, arg0, arg2, arg1, arg4, arg6, class332.field4972[arg3]);
            }
        } else if (arg8 == -1) {
            for (int var9 = 0; var9 < 100; var9++) {
                class77.field1376[var9] = true;
            }
        } else {
            class77.field1376[arg8] = true;
        }
    }

    @OriginalMember(owner = "client!vr", name = "b", descriptor = "(I)V")
    public static final void method600(int arg0) {
        field1429++;
        if (class463.field7114 == -1 || class369.field5413 == -1) {
            return;
        }
        int var1 = ((class30.field394 - class119.field1971) * class33.field455 >> 16) + class119.field1971;
        class33.field455 += var1;
        if (class33.field455 < 65535) {
            class371.field5443 = false;
            class28.field354 = false;
        } else {
            if (class371.field5443) {
                class28.field354 = false;
            } else {
                class28.field354 = true;
            }
            class33.field455 = 65535;
            class371.field5443 = true;
        }
        float var2 = (float) class33.field455 / 65535.0F;
        float[] var3 = new float[3];
        int var4 = class1.field5 * 2;
        for (int var5 = 0; var5 < 3; var5++) {
            int var21 = class452.field6956[class463.field7114][var4][var5] * 3;
            int var22 = class452.field6956[class463.field7114][var4 + 1][var5] * 3;
            int var23 = (class452.field6956[class463.field7114][var4 + 2][var5] + class452.field6956[class463.field7114][var4 + 2][var5] - class452.field6956[class463.field7114][var4 + 3][var5]) * 3;
            int var24 = class452.field6956[class463.field7114][var4][var5];
            int var25 = var22 - var21;
            int var26 = var21 + var23 - var22 * 2;
            int var27 = class452.field6956[class463.field7114][var4 + 2][var5] + var22 - var24 - var23;
            var3[var5] = (((float) var27 * var2 + (float) var26) * var2 + (float) var25) * var2 + (float) var24;
        }
        class290.field4403 = (int) var3[2] - class320.field4827 * 128;
        class243.field3655 = (int) var3[0] - (class381.field5550 * 128);
        class288.field4373 = (int) var3[1] * -1;
        float[] var6 = new float[3];
        int var7 = class332.field4970 * 2;
        for (int var8 = 0; var8 < 3; var8++) {
            int var14 = class452.field6956[class369.field5413][var7][var8] * 3;
            int var15 = class452.field6956[class369.field5413][var7 + 1][var8] * 3;
            int var16 = (class452.field6956[class369.field5413][var7 + 2][var8] + class452.field6956[class369.field5413][var7 + 2][var8] - class452.field6956[class369.field5413][var7 + 3][var8]) * 3;
            int var17 = class452.field6956[class369.field5413][var7][var8];
            int var18 = var15 - var14;
            int var19 = var14 + var16 - var15 * 2;
            int var20 = class452.field6956[class369.field5413][var7 + 2][var8] + var15 - var17 - var16;
            var6[var8] = (((float) var20 * var2 + (float) var19) * var2 + (float) var18) * var2 + (float) var17;
        }
        float var9 = var6[0] - var3[0];
        if (arg0 <= 29) {
            method598(-21, 61, 35, 79, (byte) -98);
        }
        float var10 = (var6[1] - var3[1]) * -1.0F;
        float var11 = var6[2] - var3[2];
        double var12 = Math.sqrt((double) (var9 * var9 + var11 * var11));
        class456.field6999 = (int) (Math.atan2((double) var10, var12) * 2607.5945876176133D) & 0x3FFF;
        class16.field226 = (int) (-Math.atan2((double) var9, (double) var11) * 2607.5945876176133D) & 0x3FFF;
        class211.field3284 = ((class452.field6956[class463.field7114][var4 + 2][3] - class452.field6956[class463.field7114][var4][3]) * class33.field455 >> 16) + class452.field6956[class463.field7114][var4][3];
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(ILha;I)V")
    private final void method601(int arg0, class40 arg1, int arg2) {
        if (arg2 == 1) {
            this.field1430 = class349.method2126(-125, arg1.method262(-2));
        } else if (arg2 == 2) {
            this.field1423 = arg1.method255((byte) 96);
        } else if (arg2 == 4) {
            this.field1434 = false;
        } else if (arg2 == 5) {
            this.field1436 = arg1.method239(true);
        }
        int var4 = -111 / ((arg0 - 35) / 43);
        field1431++;
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(B)Z")
    public final boolean method602(byte arg0) {
        field1437++;
        if (arg0 <= 66) {
            return true;
        } else {
            return this.field1430 == 's';
        }
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(IILhf;Ljava/awt/Component;I)Lwl;")
    public static final class270 method603(int arg0, int arg1, class260 arg2, Component arg3, int arg4) {
        field1433++;
        if (class170.field2646 == 0) {
            throw new IllegalStateException();
        } else if (arg1 >= 0 && arg1 < 2) {
            if (arg0 < 256) {
                arg0 = 256;
            }
            try {
                class270 var5 = (class270) Class.forName("hh").getDeclaredConstructor().newInstance();
                var5.field4078 = new int[(class236.field3576 ? 2 : 1) * 256];
                var5.field4095 = arg0;
                var5.method581(arg3);
                var5.field4094 = (arg0 & 0xFFFFFC00) + 1024;
                if (var5.field4094 > 16384) {
                    var5.field4094 = 16384;
                }
                var5.method579(var5.field4094);
                if (class88.field1551 > 0 && class100.field1813 == null) {
                    class100.field1813 = new class99();
                    class100.field1813.field1795 = arg2;
                    arg2.method1579(class88.field1551, class100.field1813, 2);
                }
                if (class100.field1813 != null) {
                    if (class100.field1813.field1792[arg1] != null) {
                        throw new IllegalArgumentException();
                    }
                    class100.field1813.field1792[arg1] = var5;
                }
                return var5;
            } catch (Throwable var8) {
                try {
                    class428 var6 = new class428(arg2, arg1);
                    var6.field4078 = new int[(class236.field3576 ? 2 : 1) * 256];
                    var6.field4095 = arg0;
                    var6.method581(arg3);
                    var6.field4094 = 16384;
                    var6.method579(var6.field4094);
                    if (class88.field1551 > 0 && class100.field1813 == null) {
                        class100.field1813 = new class99();
                        class100.field1813.field1795 = arg2;
                        arg2.method1579(class88.field1551, class100.field1813, 2);
                    }
                    if (arg4 != 14405) {
                        method605((byte) 93);
                    }
                    if (class100.field1813 != null) {
                        if (class100.field1813.field1792[arg1] != null) {
                            throw new IllegalArgumentException();
                        }
                        class100.field1813.field1792[arg1] = var6;
                    }
                    return var6;
                } catch (Throwable var7) {
                    return new class270();
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(ILha;)V")
    public final void method604(int arg0, class40 arg1) {
        field1424++;
        if (arg0 != -15997) {
            field1426 = null;
        }
        while (true) {
            int var3 = arg1.method257((byte) 115);
            if (var3 == 0) {
                return;
            }
            this.method601(arg0 ^ 0x3E59, arg1, var3);
        }
    }

    @OriginalMember(owner = "client!vr", name = "b", descriptor = "(B)V")
    public static final void method605(byte arg0) {
        field1438++;
        class400.field5829.method13(false);
        for (class2 var1 = (class2) class329.field4932.method8((byte) -98); var1 != null; var1 = (class2) class329.field4932.method17((byte) 71)) {
            if (var1.field17 < 1000) {
                var1.method1121(false);
                class400.field5829.method4(1, var1);
            }
        }
        class400.field5829.method12(class329.field4932, -50);
        int var2 = -1;
        class112 var3 = (class112) class91.field1638.method8((byte) -98);
        if (var3 != null) {
            var2 = var3.method805(-4);
        }
        if (arg0 >= -48) {
            field1425 = null;
        }
        if (!class381.field5555) {
            if (var2 == 0 && (class343.field5109 == 1 && class330.field4948 > 2 || class51.method357(23951))) {
                var2 = 2;
            }
            if (var2 == 2 && class330.field4948 > 0 && var3 != null) {
                if (class450.field6931 == null && class170.field2653 == 0) {
                    class332.method2062(16, var3.method802(6), var3.method801(79));
                } else {
                    class481.field7350 = 2;
                }
            }
            if (var2 == 0 && class330.field4948 > 0) {
                class208.method1273(-91);
            }
            if (class450.field6931 != null || class170.field2653 != 0) {
                return;
            }
            class451.field6952 = null;
            class481.field7350 = 0;
            return;
        }
        if (var2 == -1) {
            int var4 = class251.field3835.method1686(25478);
            int var5 = class251.field3835.method1690(8);
            if ((class170.field2647 - 10) > var4 || class218.field3358 + class170.field2647 + 10 < var4 || (class120.field2001 - 10) > var5 || (class120.field2001 + class481.field7344 + 10) < var5) {
                class381.field5555 = false;
                class323.method2017(class120.field2001, class481.field7344, true, class218.field3358, class170.field2647);
            }
        }
        if (var2 != 0) {
            return;
        }
        int var6 = class170.field2647;
        int var7 = class120.field2001;
        int var8 = class218.field3358;
        int var9 = var3.method801(-114);
        int var10 = var3.method802(6);
        int var11 = -1;
        for (int var12 = 0; var12 < class330.field4948; var12++) {
            if (class504.field7624) {
                int var16 = (class330.field4948 - var12 - 1) * 16 + (var7 + 33);
                if (var6 < var9 && (var6 + var8) > var9 && (var16 - 13) < var10 && var16 + 4 > var10) {
                    var11 = var12;
                }
            } else {
                int var17 = var7 + ((class330.field4948 - (1 - -var12)) * 16) + 31;
                if (var6 < var9 && var9 < var6 + var8 && var17 - 13 < var10 && var10 < var17 + 3) {
                    var11 = var12;
                }
            }
        }
        if (var11 != -1) {
            int var13 = 0;
            class254 var14 = new class254(class329.field4932);
            for (class2 var15 = (class2) var14.method1527(-2); var15 != null; var15 = (class2) var14.method1525((byte) 45)) {
                if (var11 == var13) {
                    class475.method2857(var15, var10, var9, 1);
                }
                var13++;
            }
        }
        class381.field5555 = false;
        class323.method2017(class120.field2001, class481.field7344, true, class218.field3358, class170.field2647);
        return;
    }
}
