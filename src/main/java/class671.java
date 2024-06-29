import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pca")
public class class671 {

    @OriginalMember(owner = "client!pca", name = "h", descriptor = "Ljava/lang/String;")
    public String field9511;

    @OriginalMember(owner = "client!pca", name = "e", descriptor = "I")
    public int field9508;

    @OriginalMember(owner = "client!pca", name = "c", descriptor = "I")
    public static int field9506 = 2;

    @OriginalMember(owner = "client!pca", name = "a", descriptor = "I")
    public static int field9504;

    @OriginalMember(owner = "client!pca", name = "b", descriptor = "I")
    public static int field9505;

    @OriginalMember(owner = "client!pca", name = "d", descriptor = "I")
    public static int field9507;

    @OriginalMember(owner = "client!pca", name = "f", descriptor = "I")
    public static int field9509;

    @OriginalMember(owner = "client!pca", name = "g", descriptor = "I")
    public static int field9510;

    @OriginalMember(owner = "client!pca", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field9507++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!pca", name = "a", descriptor = "(I)V")
    public static final void method3759(int arg0) {
        field9509++;
        class619.method3389(-116, false);
        class525.field6998 = 0;
        boolean var1 = true;
        for (int var2 = 0; var2 < class426.field5860.length; var2++) {
            if (class373.field5046[var2] != -1 && class426.field5860[var2] == null) {
                class426.field5860[var2] = class243.field3403.method2537(false, class373.field5046[var2], 0);
                if (class426.field5860[var2] == null) {
                    class525.field6998++;
                    var1 = false;
                }
            }
            if (class120.field2025[var2] != -1 && class502.field6717[var2] == null) {
                class502.field6717[var2] = class243.field3403.method2551(0, class120.field2025[var2], 0, class559.field7419[var2]);
                if (class502.field6717[var2] == null) {
                    var1 = false;
                    class525.field6998++;
                }
            }
            if (class3.field40[var2] != -1 && class214.field3061[var2] == null) {
                class214.field3061[var2] = class243.field3403.method2537(false, class3.field40[var2], 0);
                if (class214.field3061[var2] == null) {
                    var1 = false;
                    class525.field6998++;
                }
            }
            if (class454.field6186[var2] != -1 && class63.field965[var2] == null) {
                class63.field965[var2] = class243.field3403.method2537(false, class454.field6186[var2], 0);
                if (class63.field965[var2] == null) {
                    var1 = false;
                    class525.field6998++;
                }
            }
            if (class91.field1386 != null && class204.field2954[var2] == null && class91.field1386[var2] != -1) {
                class204.field2954[var2] = class243.field3403.method2551(0, class91.field1386[var2], 0, class559.field7419[var2]);
                if (class204.field2954[var2] == null) {
                    var1 = false;
                    class525.field6998++;
                }
            }
        }
        if (class304.field4221 == null) {
            if (class529.field7057 == null || !class559.field7425.method2539((byte) 18, class529.field7057.field460 + "_staticelements")) {
                class304.field4221 = new class164(0);
            } else if (class559.field7425.method2522(class529.field7057.field460 + "_staticelements", (byte) -33)) {
                class304.field4221 = class84.method691(0, class529.field7057.field460 + "_staticelements", class559.field7425, class127.field2140);
            } else {
                var1 = false;
                class525.field6998++;
            }
        }
        if (!var1) {
            class558.field7405 = 1;
            return;
        }
        class687.field9654 = 0;
        boolean var3 = true;
        for (int var4 = 0; var4 < class426.field5860.length; var4++) {
            byte[] var21 = class502.field6717[var4];
            if (var21 != null) {
                int var22 = (class376.field5072[var4] >> 8) * 64 - class473.field6334;
                int var23 = (class376.field5072[var4] & 0xFF) * 64 - class233.field3269;
                if (class409.field5528 != 0) {
                    var22 = 10;
                    var23 = 10;
                }
                var3 &= class362.method2142(class34.field530, var22, class34.field531, var23, var21, -1);
            }
            byte[] var24 = class63.field965[var4];
            if (var24 != null) {
                int var25 = (class376.field5072[var4] >> 8) * 64 - class473.field6334;
                int var26 = (class376.field5072[var4] & 0xFF) * 64 - class233.field3269;
                if (class409.field5528 != 0) {
                    var26 = 10;
                    var25 = 10;
                }
                var3 &= class362.method2142(class34.field530, var25, class34.field531, var26, var24, -1);
            }
        }
        if (!var3) {
            class558.field7405 = 2;
            return;
        }
        if (class558.field7405 != 0) {
            class172.method1166((byte) -50, class72.field1076.method546(class516.field6892, (byte) -35) + "<br>(100%)", true, class10.field197, class188.field2788, class665.field9437);
        }
        class381.method2226((byte) 105);
        class465.method2628((byte) -94);
        boolean var5 = false;
        if (class10.field197.method390() && class344.field4718.field5422) {
            for (int var6 = 0; var6 < class426.field5860.length; var6++) {
                if (class63.field965[var6] != null || class214.field3061[var6] != null) {
                    var5 = true;
                    break;
                }
            }
        }
        int var7;
        if (class344.field4718.field5448) {
            var7 = class112.field1955[class464.field6266];
        } else {
            var7 = class515.field6873[class464.field6266];
        }
        if (class10.field197.method416()) {
            var7++;
        }
        class364.method2149(9, 4, class34.field530, class34.field531, var7, var5, class10.field197.method454() > 0);
        for (int var8 = 0; var8 < 4; var8++) {
            class591.field7820[var8].method3703((byte) 116);
        }
        class314.method1874(true);
        class421.method2418(false, -26907);
        class46.method321(false);
        class376.field5070 = false;
        class111.field1784 = null;
        class381.method2226((byte) 117);
        System.gc();
        class619.method3389(10, true);
        class372.method2190(0);
        class276.field3865 = class344.field4718.method2329(108, class571.field7587);
        class527.field7016 = class344.field4718.field5422;
        class328.field4521 = class660.field9362 >= 96;
        class100.field1498 = class344.field4718.method2330(-20622, class571.field7587);
        class584.field7748 = !class344.field4718.field5415;
        class97.field1468 = class344.field4718.method1553(class571.field7587, -2058) ? -1 : class669.field9491;
        class393.field5171 = class625.method3412(false, class571.field7587) || class344.field4718.field5428;
        class481.field6413 = class344.field4718.field5459;
        class505.field6732 = new class90(4, class34.field530, class34.field531, false);
        if (class409.field5528 == 0) {
            class120.method938(class505.field6732, class426.field5860, true);
        } else {
            class675.method3770(class426.field5860, -2, class505.field6732);
        }
        class115.method918(class34.field530 >> 4, class34.field531 >> 4, 109);
        class627.method3454(13133);
        if (var5) {
            class229.method1427(true);
            class316.field4344 = new class90(1, class34.field530, class34.field531, true);
            if (class409.field5528 == 0) {
                class120.method938(class316.field4344, class214.field3061, true);
                class619.method3389(-122, true);
            } else {
                class675.method3770(class214.field3061, -2, class316.field4344);
                class619.method3389(-35, true);
            }
            class316.field4344.method1536(0, class505.field6732.field3489[0], false);
            class316.field4344.method1544(null, -7784, null, class10.field197);
            class229.method1427(false);
        }
        if (arg0 > -52) {
            return;
        }
        class505.field6732.method1544(class591.field7820, -7784, var5 ? class316.field4344.field3489 : null, class10.field197);
        if (class409.field5528 == 0) {
            class619.method3389(115, true);
            class87.method699((byte) 124, class502.field6717, class505.field6732);
            if (class204.field2954 != null) {
                class472.method2659(3);
            }
        } else {
            class619.method3389(-36, true);
            class133.method998(class502.field6717, (byte) -77, class505.field6732);
        }
        class465.method2628((byte) -24);
        if (class660.field9362 < 96) {
            class677.method3788((byte) 67);
        }
        class619.method3389(-25, true);
        class505.field6732.method1545(false, var5 ? class467.field6283[0] : null, null, class10.field197);
        class505.field6732.method715((byte) -38, class10.field197);
        class619.method3389(-127, true);
        if (var5) {
            class229.method1427(true);
            class619.method3389(-121, true);
            if (class409.field5528 == 0) {
                class87.method699((byte) 76, class63.field965, class316.field4344);
            } else {
                class133.method998(class63.field965, (byte) -104, class316.field4344);
            }
            class465.method2628((byte) -31);
            class619.method3389(29, true);
            class316.field4344.method1545(false, null, class684.field9625[0], class10.field197);
            class316.field4344.method715((byte) 124, class10.field197);
            class619.method3389(95, true);
            class229.method1427(false);
        }
        class204.method1332((byte) 20);
        int var9 = class505.field6732.field1371;
        if (class29.field476 < var9) {
            var9 = class29.field476;
        }
        if (var9 < class29.field476 - 1) {
            var9 = class29.field476 - 1;
        }
        if (class344.field4718.method1553(class571.field7587, -2058)) {
            class264.method1612(0);
        } else {
            class264.method1612(var9);
        }
        for (int var10 = 0; var10 < 4; var10++) {
            for (int var19 = 0; var19 < class34.field530; var19++) {
                for (int var20 = 0; var20 < class34.field531; var20++) {
                    class454.method2593(var19, var20, 126, var10);
                }
            }
        }
        class518.method2887(109);
        class381.method2226((byte) -111);
        class587.method3233(-18117);
        class465.method2628((byte) -111);
        class569.method3133((byte) -114);
        if (class490.field6611 != null && class370.field4996 != null && class32.field525 == 11) {
            class409.field5526++;
            class402 var11 = class390.method2252(class190.field2799, -124, class262.field3644);
            var11.field5354.method1982(1057001181, (byte) 63);
            class36.method278(0, var11);
        }
        if (class409.field5528 == 0) {
            int var12 = (class466.field6278 - (class34.field530 >> 4)) / 8;
            int var13 = (class466.field6278 + (class34.field530 >> 4)) / 8;
            int var14 = (class571.field7588 - (class34.field531 >> 4)) / 8;
            int var15 = ((class34.field531 >> 4) + class571.field7588) / 8;
            for (int var16 = var12 - 1; var16 <= (var13 + 1); var16++) {
                for (int var17 = var14 - 1; var17 <= var15 + 1; var17++) {
                    if (var16 < var12 || var13 < var16 || var14 > var17 || var15 < var17) {
                        class243.field3403.method2528("m" + var16 + "_" + var17, 12738);
                        class243.field3403.method2528("l" + var16 + "_" + var17, 12738);
                    }
                }
            }
        }
        if (class32.field525 == 4) {
            class472.method2658(19093, 3);
        } else if (class32.field525 == 8) {
            class472.method2658(19093, 7);
        } else {
            class472.method2658(19093, 10);
            if (class370.field4996 != null) {
                class402 var18 = class390.method2252(class369.field4992, -91, class262.field3644);
                class36.method278(0, var18);
            }
        }
        class197.method1278(-1);
        class381.method2226((byte) 107);
        class689.method3827(-93);
    }

    @OriginalMember(owner = "client!pca", name = "a", descriptor = "(IILst;IB)V")
    public static final void method3760(int arg0, int arg1, class403 arg2, int arg3, byte arg4) {
        field9504++;
        int var5 = arg2.field5643[arg0];
        int var6 = arg2.field5649[0];
        if (var5 < 0 || var5 >= class34.field530 || var6 < 0 || var6 >= class34.field531 || arg1 < 0 || class34.field530 <= arg1 || arg3 < 0 || class34.field531 <= arg3) {
            return;
        }
        int var7 = class119.method933(var5, 0, arg1, true, var6, 0, 2, class591.field7820[arg2.field8609], arg2.method2317((byte) 40), 0, arg3, 0, -4, class204.field2953, class629.field8482);
        if (var7 >= 1 && var7 <= 3) {
            for (int var8 = 0; var8 < (var7 - 1); var8++) {
                arg2.method2307(class204.field2953[var8], class629.field8482[var8], (byte) -117, arg4);
            }
        }
    }

    @OriginalMember(owner = "client!pca", name = "b", descriptor = "(I)V")
    public static final void method3761(int arg0) {
        field9510++;
        if (!class400.field5305 || arg0 != 1) {
            return;
        }
        class625 var1 = class457.method2609(class255.field3536, class522.field6979, (byte) -121);
        if (var1 != null && var1.field8404 != null) {
            class48 var2 = new class48();
            var2.field681 = var1.field8404;
            var2.field692 = var1;
            class544.method3013(var2);
        }
        class37.field563 = -1;
        class428.field5883 = -1;
        class400.field5305 = false;
        if (var1 != null) {
            class463.method2624(false, var1);
        }
    }

    @OriginalMember(owner = "client!pca", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
    public class671(String arg0, int arg1) {
        this.field9511 = arg0;
        this.field9508 = arg1;
    }
}
