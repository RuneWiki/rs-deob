import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tg")
public class class510 {

    @OriginalMember(owner = "client!tg", name = "n", descriptor = "B")
    public byte field7489 = 0;

    @OriginalMember(owner = "client!tg", name = "m", descriptor = "S")
    public short field7488;

    @OriginalMember(owner = "client!tg", name = "i", descriptor = "B")
    public byte field7484;

    @OriginalMember(owner = "client!tg", name = "y", descriptor = "B")
    public byte field7500;

    @OriginalMember(owner = "client!tg", name = "k", descriptor = "S")
    public short field7486;

    @OriginalMember(owner = "client!tg", name = "c", descriptor = "Lpi;")
    public static class340 field7478 = new class340(30, -2);

    @OriginalMember(owner = "client!tg", name = "o", descriptor = "Loi;")
    public static class169 field7490 = new class169(" is already on your friend list.", " steht bereits auf deiner Freunde-Liste!", " est déjà dans votre liste d'amis.", " já está na sua lista de amigos.");

    @OriginalMember(owner = "client!tg", name = "g", descriptor = "B")
    public byte field7482;

    @OriginalMember(owner = "client!tg", name = "t", descriptor = "B")
    public byte field7495;

    @OriginalMember(owner = "client!tg", name = "w", descriptor = "B")
    public byte field7498;

    @OriginalMember(owner = "client!tg", name = "B", descriptor = "B")
    public byte field7503;

    @OriginalMember(owner = "client!tg", name = "b", descriptor = "I")
    public static int field7477;

    @OriginalMember(owner = "client!tg", name = "d", descriptor = "I")
    public static int field7479;

    @OriginalMember(owner = "client!tg", name = "e", descriptor = "I")
    public static int field7480;

    @OriginalMember(owner = "client!tg", name = "p", descriptor = "I")
    public static int field7491;

    @OriginalMember(owner = "client!tg", name = "x", descriptor = "Lnm;")
    public class270 field7499;

    @OriginalMember(owner = "client!tg", name = "A", descriptor = "Lnm;")
    public class270 field7502;

    @OriginalMember(owner = "client!tg", name = "z", descriptor = "Liv;")
    public class287 field7501;

    @OriginalMember(owner = "client!tg", name = "j", descriptor = "Lrr;")
    public class303 field7485;

    @OriginalMember(owner = "client!tg", name = "v", descriptor = "Lrr;")
    public class303 field7497;

    @OriginalMember(owner = "client!tg", name = "s", descriptor = "Lpd;")
    public class319 field7494;

    @OriginalMember(owner = "client!tg", name = "q", descriptor = "Lmu;")
    public class338 field7492;

    @OriginalMember(owner = "client!tg", name = "u", descriptor = "Lus;")
    public class428 field7496;

    @OriginalMember(owner = "client!tg", name = "h", descriptor = "Ltg;")
    public class510 field7483;

    @OriginalMember(owner = "client!tg", name = "f", descriptor = "S")
    public short field7481;

    @OriginalMember(owner = "client!tg", name = "l", descriptor = "Z")
    public boolean field7487;

    @OriginalMember(owner = "client!tg", name = "r", descriptor = "Z")
    public boolean field7493;

    @OriginalMember(owner = "client!tg", name = "C", descriptor = "Z")
    public boolean field7504;

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "[I")
    public static int[] field7476;

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(IIIII)V")
    public static final void method3026(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field7491++;
        if (arg2 < 30) {
            method3026(-88, -90, 83, 119, 5);
        }
        if (class21.field407 == 1) {
            class517.field7622[class267.field3382 / 100].method2406(class159.field2091 - 8, class423.field5829 + -8);
        }
        if (class21.field407 == 2) {
            class517.field7622[class267.field3382 / 100 + 4].method2406(class159.field2091 - 8, class423.field5829 + -8);
        }
        class46.method291(5);
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(I)V")
    public final void method3027(int arg0) {
        if (arg0 < 106) {
            method3026(-43, -80, -20, 13, -115);
        }
        field7477++;
        while (this.field7494 != null) {
            class319 var2 = this.field7494.field4102;
            this.field7494.method1898(0);
            this.field7494 = var2;
        }
        this.field7489 = 0;
    }

    @OriginalMember(owner = "client!tg", name = "b", descriptor = "(I)V")
    public static void method3028(int arg0) {
        int var1 = -93 / ((-arg0 - 18) / 46);
        field7478 = null;
        field7490 = null;
        field7476 = null;
    }

    @OriginalMember(owner = "client!tg", name = "c", descriptor = "(I)V")
    public static final void method3029(int arg0) {
        field7480++;
        class415.method2440(10, class465.field6838);
        class161.field2099++;
        if (class218.field2785 && class141.field1871) {
            int var1 = class268.field3397.method717((byte) 82);
            int var2 = class268.field3397.method721((byte) 74);
            int var3 = var2 - class227.field2929;
            int var4 = var1 - class108.field1479;
            if (var4 < class108.field1480) {
                var4 = class108.field1480;
            }
            if ((class108.field1480 + class12.field198.field5735) < (var4 + class465.field6838.field5735)) {
                var4 = class108.field1480 + class12.field198.field5735 - class465.field6838.field5735;
            }
            if (var3 < class219.field2814) {
                var3 = class219.field2814;
            }
            if (arg0 == -8) {
                if (class465.field6838.field5726 + var3 > class219.field2814 - -class12.field198.field5726) {
                    var3 = class219.field2814 + class12.field198.field5726 - class465.field6838.field5726;
                }
                int var5 = class12.field198.field5678 + var4 - class108.field1480;
                int var6 = class12.field198.field5686 + var3 - class219.field2814;
                if (class268.field3397.method1354(10158)) {
                    if (class161.field2099 > class465.field6838.field5714) {
                        int var7 = var4 - class89.field1241;
                        int var8 = var3 - class20.field345;
                        if (class465.field6838.field5702 < var7 || (-class465.field6838.field5702) > var7 || class465.field6838.field5702 < var8 || var8 < (-class465.field6838.field5702)) {
                            class188.field2470 = true;
                        }
                    }
                    if (class465.field6838.field5725 != null && class188.field2470) {
                        class195 var9 = new class195();
                        var9.field2521 = var5;
                        var9.field2523 = class465.field6838.field5725;
                        var9.field2516 = class465.field6838;
                        var9.field2530 = var6;
                        class490.method2928(var9);
                        return;
                    }
                } else {
                    if (class188.field2470) {
                        class356.method2082(-1);
                        if (class465.field6838.field5692 != null) {
                            class195 var10 = new class195();
                            var10.field2518 = class502.field7383;
                            var10.field2530 = var6;
                            var10.field2516 = class465.field6838;
                            var10.field2523 = class465.field6838.field5692;
                            var10.field2521 = var5;
                            class490.method2928(var10);
                        }
                        if (class502.field7383 != null && client.method3032(class465.field6838) != null) {
                            class218.method1392(12574, class465.field6838, class502.field7383);
                        }
                    } else if ((class353.field4531 == 1 || class203.method1331((byte) 93)) && class271.field3433 > 2) {
                        class179.method1156(class89.field1241 + class108.field1479, 33, class227.field2929 + class20.field345);
                    } else if (class328.method1951(false)) {
                        class179.method1156(class89.field1241 + class108.field1479, 33, class227.field2929 + class20.field345);
                    }
                    class465.field6838 = null;
                }
            }
        } else if (class161.field2099 > 1) {
            class465.field6838 = null;
        }
    }

    @OriginalMember(owner = "client!tg", name = "<init>", descriptor = "(III)V")
    public class510(int arg0, int arg1, int arg2) {
        this.field7488 = (short) arg1;
        this.field7500 = this.field7484 = (byte) arg0;
        this.field7486 = (short) arg2;
    }

    @OriginalMember(owner = "client!tg", name = "b", descriptor = "(IIIII)V")
    public static final void method3030(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = 121 % ((arg0 + 2) / 41);
        if (class65.field827 <= arg4 && class281.field3589 >= arg4) {
            int var6 = class141.method970(arg2, class456.field6365, 1150002076, class418.field5559);
            int var7 = class141.method970(arg3, class456.field6365, 1150002076, class418.field5559);
            class372.method2167(var6, arg4, var7, 5, arg1);
        }
        field7479++;
    }
}
