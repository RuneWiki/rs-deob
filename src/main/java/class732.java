import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bo")
public class class732 implements class192 {

    @OriginalMember(owner = "client!bo", name = "c", descriptor = "Lcha;")
    public static class220 field10184 = new class220(12, -1);

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "I")
    public static int field10182;

    @OriginalMember(owner = "client!bo", name = "b", descriptor = "I")
    public static int field10183;

    @OriginalMember(owner = "client!bo", name = "e", descriptor = "I")
    public static int field10186;

    @OriginalMember(owner = "client!bo", name = "f", descriptor = "I")
    public static int field10187;

    @OriginalMember(owner = "client!bo", name = "g", descriptor = "I")
    public static int field10188;

    @OriginalMember(owner = "client!bo", name = "d", descriptor = "Lls;")
    public static class142 field10185;

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(BI[B)[B")
    public static final byte[] method4084(byte arg0, int arg1, byte[] arg2) {
        if (arg0 == -101) {
            field10187++;
            byte[] var3 = new byte[arg1];
            class135.method999(arg2, 0, var3, 0, arg1);
            return var3;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(JLfia;I[I)Ljava/lang/String;")
    public final String method1285(long arg0, class577 arg1, int arg2, int[] arg3) {
        field10182++;
        if (class638.field8800 == arg1) {
            class111 var6 = class180.field2529.method4027(-30, arg3[0]);
            return var6.method878((byte) -116, (int) arg0);
        } else if (class165.field2310 == arg1 || class244.field3154 == arg1) {
            class639 var7 = class21.field381.method1583(-126, (int) arg0);
            return var7.field8881;
        } else if (class603.field8372 == arg1 || class339.field4290 == arg1 || class69.field974 == arg1) {
            return class180.field2529.method4027(-64, arg3[0]).method878((byte) 96, (int) arg0);
        } else if (arg2 <= 50) {
            return null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(I)V")
    public static void method4085(int arg0) {
        field10184 = null;
        field10185 = null;
        if (arg0 != -14603) {
            field10188 = -32;
        }
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(B)V")
    public static final void method4086(byte arg0) {
        field10186++;
        if (class748.field10451.field10393.method1631((byte) -97) != 2) {
            return;
        }
        int var1 = 33 % ((-arg0 - 60) / 48);
        byte var2 = (byte) (class762.field10618 - 4 & 0xFF);
        int var3 = class762.field10618 % class409.field5183;
        for (int var4 = 0; var4 < 4; var4++) {
            for (int var19 = 0; var19 < class543.field7597; var19++) {
                class232.field3052[var4][var3][var19] = var2;
            }
        }
        if (class472.field6329 == 3) {
            return;
        }
        for (int var5 = 0; var5 < 2; var5++) {
            class741.field10342[var5] = -1000000;
            class702.field9764[var5] = 1000000;
            class609.field8449[var5] = 0;
            class85.field1180[var5] = 1000000;
            class449.field5944[var5] = 0;
        }
        int var6 = class380.field4847.field5801;
        int var7 = class380.field4847.field5797;
        if (class650.field9023 != 1 && class746.field10437 == -1) {
            int var8 = class225.method1448(class472.field6329, class450.field5953, class318.field4121, (byte) 28);
            if (var8 - class66.field954 < 3200 && (class305.field4001[class472.field6329][class450.field5953 >> 9][class318.field4121 >> 9] & 0x4) != 0) {
                class358.method2079(class197.field2689, false, class450.field5953 >> 9, class318.field4121 >> 9, 1, 5373952);
                return;
            }
            return;
        }
        if (class650.field9023 != 1) {
            var7 = class35.field560;
            var6 = class746.field10437;
        }
        if ((class305.field4001[class472.field6329][var6 >> 9][var7 >> 9] & 0x4) != 0) {
            class358.method2079(class197.field2689, false, var6 >> 9, var7 >> 9, 0, 5373952);
        }
        if (class33.field544 >= 2560) {
            return;
        }
        int var9 = class450.field5953 >> 9;
        int var10 = class318.field4121 >> 9;
        int var11 = var6 >> 9;
        int var12 = var7 >> 9;
        int var13;
        if (var11 <= var9) {
            var13 = var9 - var11;
        } else {
            var13 = var11 - var9;
        }
        int var14;
        if (var12 <= var10) {
            var14 = var10 - var12;
        } else {
            var14 = var12 - var10;
        }
        if (var13 == 0 && var14 == 0 || -class409.field5183 >= var13 || class409.field5183 <= var13 || var14 <= -class543.field7597 || var14 >= class543.field7597) {
            class684.method3842(1, null, "RC: " + var9 + "," + var10 + " " + var11 + "," + var12 + " " + class332.field4232 + "," + class447.field5936);
            return;
        }
        if (var13 <= var14) {
            int var15 = var13 * 65536 / var14;
            int var16 = 32768;
            while (var10 != var12) {
                if (var12 > var10) {
                    var10++;
                } else if (var10 > var12) {
                    var10--;
                }
                if ((class305.field4001[class472.field6329][var9][var10] & 0x4) != 0) {
                    class358.method2079(class197.field2689, false, var9, var10, 1, 5373952);
                    return;
                }
                var16 += var15;
                if (var16 >= 65536) {
                    if (var11 > var9) {
                        var9++;
                    } else if (var11 < var9) {
                        var9--;
                    }
                    var16 -= 65536;
                    if ((class305.field4001[class472.field6329][var9][var10] & 0x4) != 0) {
                        class358.method2079(class197.field2689, false, var9, var10, 1, 5373952);
                        return;
                    }
                }
            }
            return;
        }
        int var17 = var14 * 65536 / var13;
        int var18 = 32768;
        while (var9 != var11) {
            if (var11 > var9) {
                var9++;
            } else if (var9 > var11) {
                var9--;
            }
            if ((class305.field4001[class472.field6329][var9][var10] & 0x4) != 0) {
                class358.method2079(class197.field2689, false, var9, var10, 1, 5373952);
                return;
            }
            var18 += var17;
            if (var18 >= 65536) {
                var18 -= 65536;
                if (var10 < var12) {
                    var10++;
                } else if (var10 > var12) {
                    var10--;
                }
                if ((class305.field4001[class472.field6329][var9][var10] & 0x4) != 0) {
                    class358.method2079(class197.field2689, false, var9, var10, 1, 5373952);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(IIII)V")
    public static final void method4087(int arg0, int arg1, int arg2, int arg3) {
        field10183++;
        if (class542.field7499 == arg2 && class289.field3788 == arg0 && class713.field9903 == arg3) {
            return;
        }
        class542.field7499 = arg2;
        class713.field9903 = arg3;
        class563.field7924 = true;
        class289.field3788 = arg0;
        double var4 = -((double) (arg2 * 2) * 3.141592653589793D) / 16384.0D;
        double var6 = -((double) (arg0 * 2) * 3.141592653589793D) / 16384.0D;
        double var8 = Math.cos(var6);
        double var10 = Math.sin(var6);
        double var12 = Math.cos(var4);
        double var14 = Math.sin(var4);
        class7.field79 = var8 * var12;
        class39.field602 = 0.0D;
        class334.field4251 = var14;
        class746.field10388 = -var8 * var14;
        class111.field1607 = var8;
        class643.field8916 = var10;
        if (arg1 <= 117) {
            field10184 = null;
        }
        class198.field2705 = -var10 * var12;
        class615.field8489 = var12;
        class106.field1524 = var10 * var14;
    }
}
