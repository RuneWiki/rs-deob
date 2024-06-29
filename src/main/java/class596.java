import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!et")
public class class596 {

    @OriginalMember(owner = "client!et", name = "g", descriptor = "I")
    public int field8313;

    @OriginalMember(owner = "client!et", name = "b", descriptor = "I")
    public static int field8308;

    @OriginalMember(owner = "client!et", name = "c", descriptor = "I")
    public static int field8309;

    @OriginalMember(owner = "client!et", name = "d", descriptor = "I")
    public static int field8310;

    @OriginalMember(owner = "client!et", name = "e", descriptor = "I")
    public static int field8311;

    @OriginalMember(owner = "client!et", name = "f", descriptor = "I")
    public static int field8312;

    @OriginalMember(owner = "client!et", name = "h", descriptor = "I")
    public static int field8314;

    @OriginalMember(owner = "client!et", name = "a", descriptor = "Lnd;")
    public static class547 field8307;

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(I)[Lpv;")
    public static final class72[] method3374(int arg0) {
        if (class742.field10361 == null) {
            class72[] var1 = class299.method1787(true, class162.field2227);
            class72[] var2 = new class72[var1.length];
            int var3 = 0;
            int var4 = class748.field10451.field10425.method4035((byte) 56);
            label74: for (int var5 = 0; var5 < var1.length; var5++) {
                class72 var9 = var1[var5];
                if ((var9.field1001 <= 0 || var9.field1001 >= 24) && var9.field1004 >= 800 && var9.field1009 >= 600 && (var4 != 2 || var9.field1004 <= 800 && var9.field1009 <= 600) && (var4 != 1 || var9.field1004 <= 1024 && var9.field1009 <= 768)) {
                    for (int var10 = 0; var10 < var3; var10++) {
                        class72 var11 = var2[var10];
                        if (var9.field1004 == var11.field1004 && var9.field1009 == var11.field1009) {
                            if (var11.field1001 < var9.field1001) {
                                var2[var10] = var9;
                            }
                            continue label74;
                        }
                    }
                    var2[var3] = var9;
                    var3++;
                }
            }
            class742.field10361 = new class72[var3];
            class135.method993(var2, 0, class742.field10361, 0, var3);
            int[] var6 = new int[class742.field10361.length];
            for (int var7 = 0; var7 < class742.field10361.length; var7++) {
                class72 var8 = class742.field10361[var7];
                var6[var7] = var8.field1009 * var8.field1004;
            }
            class82.method687(class742.field10361, var6, -111);
        }
        field8314++;
        if (arg0 != -1025) {
            field8307 = null;
        }
        return class742.field10361;
    }

    @OriginalMember(owner = "client!et", name = "b", descriptor = "(I)V")
    public static void method3375(int arg0) {
        field8307 = null;
        if (arg0 != -8602) {
            method3377(-72, null, -29);
        }
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(B)I")
    public static final int method3376(byte arg0) {
        if (arg0 != -40) {
            method3379((byte) 55);
        }
        field8312++;
        return class409.field5185;
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(ILjava/util/Random;I)I")
    public static final int method3377(int arg0, Random arg1, int arg2) {
        if (arg2 >= -96) {
            field8307 = null;
        }
        field8309++;
        if (arg0 <= 0) {
            throw new IllegalArgumentException();
        } else if (class54.method400(5533, arg0)) {
            return (int) ((long) arg0 * ((long) arg1.nextInt() & 0xFFFFFFFFL) >> 32);
        } else {
            int var3 = Integer.MIN_VALUE - ((int) (4294967296L % (long) arg0));
            int var4;
            do {
                var4 = arg1.nextInt();
            } while (var4 >= var3);
            return class759.method4223(var4, arg0, -18845);
        }
    }

    @OriginalMember(owner = "client!et", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field8311++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(Lha;I)V")
    public static final void method3378(class60 arg0, int arg1) {
        field8308++;
        if (!(arg1 <= class159.field2181 || class8.field103) || class617.field8508 != null) {
            return;
        }
        String var2;
        if (class8.field103 && class159.field2181 < 2) {
            var2 = class551.field7704 + class454.field6035.method2547(-113, class243.field3143) + class731.field10176 + " ->";
        } else if (class599.field8344 && class349.field4502.method207(81, arg1 ^ 0x503F) && class159.field2181 > 2) {
            var2 = class699.method3929(class438.field5836, arg1 ^ 0xFFFFDE21);
        } else {
            class277 var3 = class438.field5836;
            if (var3 == null) {
                return;
            }
            var2 = class699.method3929(var3, -8669);
            int[] var4 = null;
            if (class36.method228(var3.field3478, 610)) {
                var4 = class21.field381.method1583(-90, (int) var3.field3480).field8817;
            } else if (var3.field3473 != -1) {
                var4 = class21.field381.method1583(arg1 ^ 0xFFFFFFC0, var3.field3473).field8817;
            } else if (class491.method2902(var3.field3478, 22)) {
                class592 var7 = (class592) class207.field2745.method1160((long) ((int) var3.field3480), 127);
                if (var7 != null) {
                    class733 var8 = var7.field8280;
                    class131 var9 = var8.field10192;
                    if (var9.field1899 != null) {
                        var9 = var9.method981(25, class516.field7236);
                    }
                    if (var9 != null) {
                        var4 = var9.field1863;
                    }
                }
            } else if (class473.method2693(arg1 ^ 0xFFFFFFCF, var3.field3478)) {
                Object var5 = null;
                class543 var6;
                if (var3.field3478 == 1003) {
                    var6 = client.field3995.method3384((int) var3.field3480, false);
                } else {
                    var6 = client.field3995.method3384((int) (var3.field3480 >>> 32 & 0x7FFFFFFFL), false);
                }
                if (var6.field7541 != null) {
                    var6 = var6.method3111(class516.field7236, -113);
                }
                if (var6 != null) {
                    var4 = var6.field7542;
                }
            }
            if (var4 != null) {
                var2 = var2 + class339.method1949(-77, var4);
            }
        }
        if (class159.field2181 > 2) {
            var2 = var2 + "<col=ffffff> / " + (class159.field2181 - 2) + class454.field6028.method2547(-56, class243.field3143);
        }
        if (class154.field2096 != null) {
            class61 var10 = class154.field2096.method1717(arg0, 29485);
            if (var10 == null) {
                var10 = class242.field3132;
            }
            var10.method554(class170.field2360, class679.field9480, class154.field2096.field3749, class326.field4189, class28.field503, class154.field2096.field3714, var2, class120.field1751, class653.field9089, class208.field2763, class154.field2096.field3729, class154.field2096.field3617, class154.field2096.field3671, true, class154.field2096.field3769);
            class167.method1169(class170.field2360[1], class170.field2360[2], class170.field2360[3], 16184, class170.field2360[0]);
        } else if (class753.field10505 != null && class293.field3867 == class211.field2791) {
            int var11 = class242.field3132.method568(class679.field9480, var2, class82.field1124 + 16, -26879, 16777215, class120.field1751, class653.field9089, class28.field503, 0, class185.field2559 + 4);
            class167.method1169(class82.field1124, class270.field3406.method1619(false, var2) + var11, 16, 16184, class185.field2559 + 4);
        }
    }

    @OriginalMember(owner = "client!et", name = "b", descriptor = "(B)V")
    public static final void method3379(byte arg0) {
        field8310++;
        class151.field2086 = false;
        class433.method2476(arg0 + 155);
        if (arg0 != -95) {
            method3379((byte) -10);
        }
    }

    @OriginalMember(owner = "client!et", name = "<init>", descriptor = "(I)V")
    public class596(int arg0) {
        this.field8313 = arg0;
    }
}
