import jaclib.memory.Buffer;
import jaclib.memory.Source;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uw")
public class class440 extends class644 implements class612 {

    @OriginalMember(owner = "client!uw", name = "F", descriptor = "I")
    public static int field6186 = 0;

    @OriginalMember(owner = "client!uw", name = "z", descriptor = "B")
    private byte field6180;

    @OriginalMember(owner = "client!uw", name = "w", descriptor = "I")
    public static int field6177;

    @OriginalMember(owner = "client!uw", name = "x", descriptor = "I")
    public static int field6178;

    @OriginalMember(owner = "client!uw", name = "y", descriptor = "I")
    public static int field6179;

    @OriginalMember(owner = "client!uw", name = "A", descriptor = "I")
    public static int field6181;

    @OriginalMember(owner = "client!uw", name = "B", descriptor = "I")
    public static int field6182;

    @OriginalMember(owner = "client!uw", name = "C", descriptor = "I")
    public static int field6183;

    @OriginalMember(owner = "client!uw", name = "D", descriptor = "I")
    public static int field6184;

    @OriginalMember(owner = "client!uw", name = "E", descriptor = "I")
    public static int field6185;

    @OriginalMember(owner = "client!uw", name = "G", descriptor = "I")
    public static int field6187;

    @OriginalMember(owner = "client!uw", name = "H", descriptor = "I")
    public static int field6188;

    @OriginalMember(owner = "client!uw", name = "I", descriptor = "I")
    public static int field6189;

    @OriginalMember(owner = "client!uw", name = "J", descriptor = "I")
    public static int field6190;

    @OriginalMember(owner = "client!uw", name = "K", descriptor = "I")
    public static int field6191;

    @OriginalMember(owner = "client!uw", name = "a", descriptor = "(IIILjaclib/memory/Source;)Z")
    public final boolean method2639(int arg0, int arg1, int arg2, Source arg3) {
        ++field6182;
        this.field6180 = (byte) arg1;
        if (arg2 != -959) {
            return true;
        } else {
            super.method3575(arg0, arg3, false);
            return true;
        }
    }

    @OriginalMember(owner = "client!uw", name = "b", descriptor = "(I)Z")
    public final boolean method2640(int arg0) {
        if (arg0 != 10925) {
            this.method2646(true, false);
        }
        ++field6178;
        return super.method3578(false, super.field8946.field5786);
    }

    @OriginalMember(owner = "client!uw", name = "c", descriptor = "(I)V")
    public static final void method2641(int arg0) {
        if (arg0 < 74) {
            field6189 = -35;
        }
        class89.field1233.method1990(false);
        ++field6179;
        int var1 = class89.field1233.method1993(-1, 8);
        if (~var1 > ~class688.field9678) {
            for (int var2 = var1; ~class688.field9678 < ~var2; ++var2) {
                class734.field10177[class733.field10174++] = class382.field5588[var2];
            }
        }
        if (var1 > class688.field9678) {
            throw new RuntimeException("gnpov1");
        } else {
            class688.field9678 = 0;
            for (int var3 = 0; ~var1 < ~var3; ++var3) {
                int var4 = class382.field5588[var3];
                class192 var5 = ((class174) class234.field3169.method3953((long) var4, 14)).field2336;
                int var6 = class89.field1233.method1993(-1, 1);
                if (~var6 == -1) {
                    class382.field5588[class688.field9678++] = var4;
                    var5.field1844 = class499.field6889;
                } else {
                    int var7 = class89.field1233.method1993(-1, 2);
                    if (var7 == 0) {
                        class382.field5588[class688.field9678++] = var4;
                        var5.field1844 = class499.field6889;
                        class584.field7798[class667.field9214++] = var4;
                    } else if (var7 == 1) {
                        class382.field5588[class688.field9678++] = var4;
                        var5.field1844 = class499.field6889;
                        int var8 = class89.field1233.method1993(-1, 3);
                        var5.method1323(1, var8, -31084);
                        int var9 = class89.field1233.method1993(-1, 1);
                        if (~var9 == -2) {
                            class584.field7798[class667.field9214++] = var4;
                        }
                    } else if (var7 == 2) {
                        class382.field5588[class688.field9678++] = var4;
                        var5.field1844 = class499.field6889;
                        if (class89.field1233.method1993(-1, 1) != 1) {
                            int var10 = class89.field1233.method1993(-1, 3);
                            var5.method1323(0, var10, -31084);
                        } else {
                            int var11 = class89.field1233.method1993(-1, 3);
                            var5.method1323(2, var11, -31084);
                            int var12 = class89.field1233.method1993(-1, 3);
                            var5.method1323(2, var12, -31084);
                        }
                        int var13 = class89.field1233.method1993(-1, 1);
                        if (~var13 == -2) {
                            class584.field7798[class667.field9214++] = var4;
                        }
                    } else if (~var7 == -4) {
                        class734.field10177[class733.field10174++] = var4;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!uw", name = "a", descriptor = "(III)Z")
    public final boolean method2642(int arg0, int arg1, int arg2) {
        ++field6183;
        this.field6180 = (byte) arg1;
        super.method2615(arg0, (byte) -73);
        return arg2 != -10760 ? true : true;
    }

    @OriginalMember(owner = "client!uw", name = "a", descriptor = "(II)I")
    public static int method2643(int arg0, int arg1) {
        return arg0 & arg1;
    }

    @OriginalMember(owner = "client!uw", name = "g", descriptor = "(I)I")
    public final int method2644(int arg0) {
        ++field6191;
        return arg0 > -19 ? 112 : this.field6180;
    }

    @OriginalMember(owner = "client!uw", name = "a", descriptor = "(BLjava/lang/String;Ljava/lang/String;)V")
    public static final void method2645(byte arg0, String arg1, String arg2) {
        class397.field5830 = 1;
        ++field6185;
        if (arg0 <= 71) {
            field6186 = -63;
        }
        class39.field623 = -1;
        class187.method1298(arg1, false, 0, arg2, false);
    }

    @OriginalMember(owner = "client!uw", name = "a", descriptor = "(ZZ)Ljaclib/memory/Buffer;")
    public final Buffer method2646(boolean arg0, boolean arg1) {
        ++field6181;
        return !arg0 ? null : super.method3577(super.field8946.field5786, arg1, -9);
    }

    @OriginalMember(owner = "client!uw", name = "a", descriptor = "(Ljava/lang/String;ZLjava/lang/String;C)Ljava/lang/String;")
    public static final String method2647(String arg0, boolean arg1, String arg2, char arg3) {
        ++field6188;
        int var4 = arg0.length();
        int var5 = arg2.length();
        int var6 = var4;
        if (!arg1) {
            field6189 = -101;
        }
        int var7 = var5 - 1;
        if (~var7 != -1) {
            int var8 = 0;
            while (true) {
                var8 = arg0.indexOf(arg3, var8);
                if (~var8 > -1) {
                    break;
                }
                var6 += var7;
                ++var8;
            }
        }
        StringBuffer var9 = new StringBuffer(var6);
        int var10 = 0;
        while (true) {
            int var11 = arg0.indexOf(arg3, var10);
            if (~var11 > -1) {
                var9.append(arg0.substring(var10));
                return var9.toString();
            }
            var9.append(arg0.substring(var10, var11));
            var10 = var11 + 1;
            var9.append(arg2);
        }
    }

    @OriginalMember(owner = "client!uw", name = "a", descriptor = "(IZ)Lnd;")
    public static final class571 method2648(int arg0, boolean arg1) {
        ++field6184;
        class571 var2 = (class571) class523.field7171.method1541(-10, (long) arg0);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class302.field4359.method2095(arg0, 0, 1);
            class571 var4 = new class571();
            if (var3 != null) {
                var4.method3199((byte) -58, new class376(var3));
            }
            var4.method3197(1);
            if (arg1) {
                method2647((String) null, false, (String) null, '9');
            }
            class523.field7171.method1544(!arg1, var4, (long) arg0);
            return var4;
        }
    }

    @OriginalMember(owner = "client!uw", name = "a", descriptor = "(I)V")
    public final void method2614(int arg0) {
        super.method2614(arg0);
        ++field6177;
    }

    @OriginalMember(owner = "client!uw", name = "a", descriptor = "(B)I")
    public final int method2631(byte arg0) {
        ++field6190;
        return arg0 < 81 ? -90 : super.method2631((byte) 100);
    }

    @OriginalMember(owner = "client!uw", name = "b", descriptor = "(IB)V")
    public static final void method2649(int arg0, byte arg1) {
        ++field6187;
        int var2 = -class86.field1208 + class100.field1401;
        if (var2 >= 100) {
            class502.field6938 = 1;
            class704.field9868 = -1;
            class518.field7072 = -1;
        } else {
            int var3 = (int) class282.field4151;
            if (~(class363.field5289 >> 8) < ~var3) {
                var3 = class363.field5289 >> 8;
            }
            if (arg1 == 8) {
                if (class220.field2986[4] && var3 < class103.field1417[4] + 128) {
                    var3 = class103.field1417[4] + 128;
                }
                int var4 = (int) class135.field1974 + class344.field5063 & 16383;
                class445.method2670(class400.field5843, var4, -200 + class783.method4338(class610.field8296, class551.field7456.field2257, -12040, class551.field7456.field2259), var3, arg0, class262.field3888, (var3 >> 3) * 3 + 600 << 2, (byte) 87);
                float var5 = -((float) ((-var2 + 100) * (-var2 + 100) * (100 - var2)) / 1000000.0F) + 1.0F;
                class253.field3733 = (int) ((float) (-class629.field8803 + class253.field3733) * var5 + (float) class629.field8803);
                class634.field8856 = (int) ((float) (-class60.field822 + class634.field8856) * var5 + (float) class60.field822);
                class405.field5867 = (int) ((float) (class405.field5867 - class523.field7177) * var5 + (float) class523.field7177);
                class350.field5138 = (int) ((float) (-class743.field10254 + class350.field5138) * var5 + (float) class743.field10254);
                int var6 = class718.field10019 - class540.field7343;
                if (~var6 < -8193) {
                    var6 -= 16384;
                } else if (~var6 > 8191) {
                    var6 += 16384;
                }
                class718.field10019 = (int) ((float) var6 * var5 + (float) class540.field7343);
                class718.field10019 &= 16383;
            }
        }
    }

    @OriginalMember(owner = "client!uw", name = "<init>", descriptor = "(Lpa;Z)V")
    public class440(class391 arg0, boolean arg1) {
        super(arg0, 34962, arg1);
    }
}
