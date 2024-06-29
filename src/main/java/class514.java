import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fm")
public class class514 extends class388 {

    @OriginalMember(owner = "client!fm", name = "r", descriptor = "Lvf;")
    public static class103 field7572 = new class103(14, 1);

    @OriginalMember(owner = "client!fm", name = "u", descriptor = "Lvf;")
    public static class103 field7575 = new class103(15, 4);

    @OriginalMember(owner = "client!fm", name = "v", descriptor = "Lvf;")
    public static class103 field7576 = new class103(16, -2);

    @OriginalMember(owner = "client!fm", name = "w", descriptor = "Lvf;")
    public static class103 field7577 = new class103(17, 0);

    @OriginalMember(owner = "client!fm", name = "x", descriptor = "Lvf;")
    public static class103 field7578 = new class103(18, -2);

    @OriginalMember(owner = "client!fm", name = "y", descriptor = "Lvf;")
    public static class103 field7579 = new class103(20, 6);

    @OriginalMember(owner = "client!fm", name = "z", descriptor = "Lvf;")
    public static class103 field7580 = new class103(21, 8);

    @OriginalMember(owner = "client!fm", name = "A", descriptor = "Lvf;")
    public static class103 field7581 = new class103(22, -2);

    @OriginalMember(owner = "client!fm", name = "B", descriptor = "Lvf;")
    public static class103 field7582 = new class103(23, 4);

    @OriginalMember(owner = "client!fm", name = "C", descriptor = "Lvf;")
    public static class103 field7583 = new class103(24, -1);

    @OriginalMember(owner = "client!fm", name = "D", descriptor = "[Lvf;")
    private static class103[] field7584 = new class103[32];

    @OriginalMember(owner = "client!fm", name = "E", descriptor = "Lff;")
    public static class9 field7585;

    @OriginalMember(owner = "client!fm", name = "I", descriptor = "I")
    public static int field7589;

    @OriginalMember(owner = "client!fm", name = "G", descriptor = "I")
    public static int field7587;

    @OriginalMember(owner = "client!fm", name = "j", descriptor = "I")
    public static int field7564;

    @OriginalMember(owner = "client!fm", name = "k", descriptor = "I")
    public int field7565;

    @OriginalMember(owner = "client!fm", name = "l", descriptor = "I")
    public int field7566;

    @OriginalMember(owner = "client!fm", name = "n", descriptor = "I")
    public static int field7568;

    @OriginalMember(owner = "client!fm", name = "o", descriptor = "I")
    public int field7569;

    @OriginalMember(owner = "client!fm", name = "p", descriptor = "I")
    public static int field7570;

    @OriginalMember(owner = "client!fm", name = "q", descriptor = "I")
    public static int field7571;

    @OriginalMember(owner = "client!fm", name = "s", descriptor = "I")
    public static int field7573;

    @OriginalMember(owner = "client!fm", name = "t", descriptor = "I")
    public static int field7574;

    @OriginalMember(owner = "client!fm", name = "K", descriptor = "I")
    public static int field7591;

    @OriginalMember(owner = "client!fm", name = "m", descriptor = "Leq;")
    public class140 field7567;

    @OriginalMember(owner = "client!fm", name = "M", descriptor = "Lfr;")
    public static class282 field7592;

    @OriginalMember(owner = "client!fm", name = "F", descriptor = "Loa;")
    public static class489 field7586;

    @OriginalMember(owner = "client!fm", name = "i", descriptor = "[Lfo;")
    public class357[] field7563;

    @OriginalMember(owner = "client!fm", name = "J", descriptor = "[Lf;")
    public static class529[] field7590;

    @OriginalMember(owner = "client!fm", name = "H", descriptor = "[S")
    public static short[] field7588;

    @OriginalMember(owner = "client!fm", name = "b", descriptor = "(I)V")
    public static void method3022(int arg0) {
        field7586 = null;
        field7580 = null;
        field7585 = null;
        field7590 = null;
        field7572 = null;
        field7583 = null;
        field7588 = null;
        field7581 = null;
        if (arg0 > -104) {
            method3025(-72, 87, -7, 34, (byte) 59, -52);
        }
        field7576 = null;
        field7592 = null;
        field7575 = null;
        field7584 = null;
        field7578 = null;
        field7579 = null;
        field7582 = null;
        field7577 = null;
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(IBLqa;I)Z")
    public final boolean method3023(int arg0, byte arg1, class162 arg2, int arg3) {
        field7571++;
        if (this.field7563 != null) {
            for (int var5 = 0; var5 < this.field7563.length; var5++) {
                if (this.field7563[var5].method2088(arg0, arg3) && this.field7567.method343(-1, arg3, arg2, arg0)) {
                    return true;
                }
            }
        }
        int var6 = -9 % ((arg1 + 70) / 37);
        return false;
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(IIB)Z")
    public static final boolean method3024(int arg0, int arg1, byte arg2) {
        if (arg2 < 79) {
            field7577 = null;
        }
        field7570++;
        return (arg1 & 0x180) != 0;
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(IIIIBI)V")
    public static final void method3025(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5) {
        field7564++;
        int var6 = class99.method710(arg3, (byte) -29, class300.field3971, class353.field4777);
        int var7 = class99.method710(arg0, (byte) -29, class300.field3971, class353.field4777);
        int var8 = class99.method710(arg2, (byte) -29, class71.field1077, class308.field4055);
        int var9 = -78 % ((arg4 - 32) / 32);
        int var10 = class99.method710(arg5, (byte) -29, class71.field1077, class308.field4055);
        for (int var11 = var6; var11 <= var7; var11++) {
            class427.method2465(class457.field6299[var11], var10, var8, -7, arg1);
        }
    }

    @OriginalMember(owner = "client!fm", name = "c", descriptor = "(I)V")
    public static final void method3026(int arg0) {
        int var1 = -27 / ((-arg0 - 20) / 54);
        class412.method2378(class484.field6735, (byte) -120);
        field7568++;
        class176.field2567++;
        if (class334.field4377 && class129.field1883) {
            int var2 = class267.field3526.method1302(-4362);
            int var3 = class267.field3526.method1297(true);
            int var4 = var2 - class37.field583;
            int var5 = var3 - class18.field311;
            if (class426.field5823 > var4) {
                var4 = class426.field5823;
            }
            if (var5 < class236.field3173) {
                var5 = class236.field3173;
            }
            if ((class426.field5823 + class393.field5317.field5450) < (class484.field6735.field5450 + var4)) {
                var4 = class426.field5823 + class393.field5317.field5450 - class484.field6735.field5450;
            }
            if ((class484.field6735.field5404 + var5) > (class236.field3173 + class393.field5317.field5404)) {
                var5 = class236.field3173 + class393.field5317.field5404 - class484.field6735.field5404;
            }
            int var6 = var4 + class393.field5317.field5520 - class426.field5823;
            int var7 = class393.field5317.field5442 + var5 - class236.field3173;
            if (class267.field3526.method1300((byte) 99)) {
                if (class176.field2567 > class484.field6735.field5463) {
                    int var9 = var4 - class211.field2875;
                    int var10 = var5 - class9.field214;
                    if (var9 > class484.field6735.field5542 || var9 < -class484.field6735.field5542 || var10 > class484.field6735.field5542 || var10 < (-class484.field6735.field5542)) {
                        class270.field3544 = true;
                    }
                }
                if (class484.field6735.field5446 != null && class270.field3544) {
                    class353 var11 = new class353();
                    var11.field4770 = class484.field6735;
                    var11.field4775 = var6;
                    var11.field4772 = class484.field6735.field5446;
                    var11.field4768 = var7;
                    class122.method893(var11);
                }
            } else {
                if (class270.field3544) {
                    class506.method2892(65535);
                    if (class484.field6735.field5551 != null) {
                        class353 var8 = new class353();
                        var8.field4772 = class484.field6735.field5551;
                        var8.field4775 = var6;
                        var8.field4770 = class484.field6735;
                        var8.field4768 = var7;
                        var8.field4764 = class366.field4954;
                        class122.method893(var8);
                    }
                    if (class366.field4954 != null && client.method1264(class484.field6735) != null) {
                        class233.method1451(100, class484.field6735, class366.field4954);
                    }
                } else if ((class513.field7561 == 1 || class277.method1649(-2001)) && class412.field5693 > 2) {
                    class191.method1233(true, class37.field583 + class211.field2875, class9.field214 + class18.field311);
                } else if (class252.method1514(-1)) {
                    class191.method1233(true, class37.field583 + class211.field2875, class9.field214 + class18.field311);
                }
                class484.field6735 = null;
            }
        } else if (class176.field2567 > 1) {
            class484.field6735 = null;
        }
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(IZIII)V")
    public static final void method3027(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        field7574++;
        float var5 = (float) class6.field174 / (float) class6.field189;
        int var6 = arg3;
        int var7 = arg0;
        if ((var5 < 1.0F)) {
            var7 = (int) ((float) arg3 * var5);
        } else {
            var6 = (int) ((float) arg0 / var5);
        }
        int var8 = arg4 - (arg0 - var7) / 2;
        int var9 = arg2 - (arg3 - var6) / 2;
        if (arg1) {
            return;
        }
        class391.field5300 = class6.field174 - class6.field174 * var8 / var7;
        class250.field3323 = -1;
        class5.field152 = class6.field189 * var9 / var6;
        class412.field5694 = -1;
        class268.method1614(1604);
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(IIIIII)V")
    public static final void method3028(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field7573++;
        int var6 = arg3 - arg4;
        int var7 = arg5 - arg0;
        if (arg2 >= -125) {
            method3024(100, 102, (byte) -95);
        }
        if (var6 == 0) {
            if (var7 != 0) {
                class200.method1280((byte) 70, arg5, arg4, arg1, arg0);
            }
        } else if (var7 == 0) {
            class316.method1827(arg1, (byte) 127, arg4, arg3, arg0);
        } else {
            int var8 = (var7 << 12) / var6;
            int var9 = arg0 - (arg4 * var8 >> 12);
            int var10;
            int var11;
            if (class308.field4055 > arg3) {
                var10 = class308.field4055;
                var11 = var9 + (class308.field4055 * var8 >> 12);
            } else if (class71.field1077 >= arg3) {
                var10 = arg3;
                var11 = arg5;
            } else {
                var10 = class71.field1077;
                var11 = var9 + (class71.field1077 * var8 >> 12);
            }
            int var12;
            int var13;
            if (arg4 < class308.field4055) {
                var13 = (class308.field4055 * var8 >> 12) + var9;
                var12 = class308.field4055;
            } else if (arg4 <= class71.field1077) {
                var12 = arg4;
                var13 = arg0;
            } else {
                var13 = (class71.field1077 * var8 >> 12) + var9;
                var12 = class71.field1077;
            }
            if (var13 < class353.field4777) {
                var12 = (class353.field4777 - var9 << 12) / var8;
                var13 = class353.field4777;
            } else if (var13 > class300.field3971) {
                var13 = class300.field3971;
                var12 = (class300.field3971 - var9 << 12) / var8;
            }
            if (class353.field4777 > var11) {
                var10 = (class353.field4777 - var9 << 12) / var8;
                var11 = class353.field4777;
            } else if (class300.field3971 < var11) {
                var11 = class300.field3971;
                var10 = (class300.field3971 - var9 << 12) / var8;
            }
            class347.method2009(-1, var12, var11, var10, var13, arg1);
        }
    }

    static {
        class103[] var0 = class414.method2405(false);
        for (int var1 = 0; var1 < var0.length; var1++) {
            field7584[var0[var1].field1514] = var0[var1];
        }
        field7585 = new class9(40, -1);
        field7589 = 0;
        field7587 = 0;
    }
}
