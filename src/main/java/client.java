import jagex3.jagmisc.jagmisc;
import java.awt.Container;
import java.awt.Frame;
import java.awt.Image;
import java.awt.Insets;
import java.awt.Rectangle;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.Socket;
import java.util.GregorianCalendar;
import java.util.Vector;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!client")
public class client extends class530 {

    @OriginalMember(owner = "client!client", name = "fb", descriptor = "Lla;")
    public static class319 field2673 = new class319(62, -2);

    @OriginalMember(owner = "client!client", name = "hb", descriptor = "Lof;")
    public static class446 field2675 = new class446(" ", ": ", " ", " ");

    @OriginalMember(owner = "client!client", name = "jb", descriptor = "I")
    public static int field2677 = -1;

    @OriginalMember(owner = "client!client", name = "kb", descriptor = "I")
    public static int field2678 = 0;

    @OriginalMember(owner = "client!client", name = "lb", descriptor = "Lps;")
    public static class63 field2679;

    @OriginalMember(owner = "client!client", name = "mb", descriptor = "Lla;")
    public static class319 field2680;

    @OriginalMember(owner = "client!client", name = "P", descriptor = "I")
    public static int field2657;

    @OriginalMember(owner = "client!client", name = "Q", descriptor = "I")
    public static int field2658;

    @OriginalMember(owner = "client!client", name = "R", descriptor = "I")
    public static int field2659;

    @OriginalMember(owner = "client!client", name = "S", descriptor = "I")
    public static int field2660;

    @OriginalMember(owner = "client!client", name = "T", descriptor = "I")
    public static int field2661;

    @OriginalMember(owner = "client!client", name = "U", descriptor = "I")
    public static int field2662;

    @OriginalMember(owner = "client!client", name = "V", descriptor = "I")
    public static int field2663;

    @OriginalMember(owner = "client!client", name = "W", descriptor = "I")
    public static int field2664;

    @OriginalMember(owner = "client!client", name = "X", descriptor = "I")
    public static int field2665;

    @OriginalMember(owner = "client!client", name = "Y", descriptor = "I")
    public static int field2666;

    @OriginalMember(owner = "client!client", name = "Z", descriptor = "I")
    public static int field2667;

    @OriginalMember(owner = "client!client", name = "ab", descriptor = "I")
    public static int field2668;

    @OriginalMember(owner = "client!client", name = "bb", descriptor = "I")
    public static int field2669;

    @OriginalMember(owner = "client!client", name = "cb", descriptor = "I")
    public static int field2670;

    @OriginalMember(owner = "client!client", name = "db", descriptor = "I")
    public static int field2671;

    @OriginalMember(owner = "client!client", name = "eb", descriptor = "I")
    public static int field2672;

    @OriginalMember(owner = "client!client", name = "gb", descriptor = "I")
    public static int field2674;

    @OriginalMember(owner = "client!client", name = "ib", descriptor = "Ljava/awt/Image;")
    public static Image field2676;

    // $FF: synthetic field
    @OriginalMember(owner = "client!client", name = "nb", descriptor = "Ljava/lang/Class;")
    public static Class field2681;

    @OriginalMember(owner = "client!client", name = "ob", descriptor = "Z")
    public static boolean field2682;

    // $FF: synthetic method
    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method1355(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    static {
        new class446("Sending request to leave channel...", "Chatraum wird verlassen...", "Envoi de la demande de sortie du canal...", "Enviando solicitação para deixar o canal...");
        field2679 = new class63();
        field2680 = new class319(1, 2);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "()V", line = 8)
    public static final void method1329() {
        int var0 = class20.field310;
        int[] var1 = class55.field778;
        int var2 = class429.field6521 ? var0 : class333.field5187 + var0;
        for (int var3 = 0; var3 < var2; var3++) {
            class275 var4;
            if (var3 < var0) {
                var4 = class241.field3398[var1[var3]];
            } else {
                var4 = ((class24) class406.field6158.method1747((long) class224.field3114[var3 - var0], false)).field348;
            }
            if (var4.field3853 >= 0) {
                int var5 = var4.method637((byte) -12);
                if ((var5 & 0x1) == 0) {
                    if ((var4.field1867 & 0x7F) == 0 && (var4.field1862 & 0x7F) == 0) {
                        continue;
                    }
                } else if ((var4.field1867 & 0x7F) == 64 && (var4.field1862 & 0x7F) == 64) {
                    continue;
                }
                if (var4 instanceof class96 && var4.field3909 != null && class393.field6017 >= var4.field3909.field4180 && class393.field6017 < var4.field3909.field4188) {
                    ((class96) var4).field1415 = false;
                }
                var4.field1873 = class352.method2264(-111, var4.field1866, var4.field1862, var4.field1867);
                class525.method3110(var4, true);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Lga;)Z", line = 53)
    public static final boolean method1330(class282 arg0) {
        if (class215.field3038) {
            if (method1348(arg0).field6684 != 0) {
                return false;
            }
            if (arg0.field4103 == 0) {
                return false;
            }
        }
        return arg0.field4020;
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "()V", line = 68)
    public static final void method1331() {
        int var0 = class20.field310;
        int[] var1 = class55.field778;
        boolean var2 = class203.field2716.field1163 == 1 && var0 > 200 || class203.field2716.field1163 == 0 && var0 > 50;
        for (int var3 = 0; var3 < var0; var3++) {
            class96 var13 = class241.field3398[var1[var3]];
            if (var13.method634(22386)) {
                var13.method938((byte) -47);
                if (var13.field1868 >= 0 && var13.field1863 >= 0 && var13.field1871 < class398.field6071 && var13.field1874 < class528.field7734) {
                    var13.field1415 = var13.field3829 ? var2 : false;
                    if (class56.field800 == var13) {
                        var13.field3853 = Integer.MAX_VALUE;
                    } else {
                        int var14 = 0;
                        if (!var13.field3884) {
                            var14++;
                        }
                        if (var13.field3865 > class393.field6017) {
                            var14 += 2;
                        }
                        int var15 = var14 + (5 - var13.method637((byte) -125) << 2);
                        if (var13.field1388) {
                            var15 += 512;
                        } else {
                            if (class475.field7044 == 0) {
                                var15 += 32;
                            } else {
                                var15 += 128;
                            }
                            var15 += 256;
                        }
                        var13.field3853 = var15 + 1;
                    }
                } else {
                    var13.field3853 = -1;
                }
            } else {
                var13.field3853 = -1;
            }
        }
        for (int var4 = 0; var4 < class333.field5187; var4++) {
            class17 var10 = ((class24) class406.field6158.method1747((long) class224.field3114[var4], false)).field348;
            if (var10.method172(22386) && var10.field274.method1664((byte) 79, class288.field4208)) {
                var10.method938((byte) -47);
                if (var10.field1868 >= 0 && var10.field1863 >= 0 && var10.field1871 < class398.field6071 && var10.field1874 < class528.field7734) {
                    int var11 = 0;
                    if (!var10.field3884) {
                        var11++;
                    }
                    if (var10.field3865 > class393.field6017) {
                        var11 += 2;
                    }
                    int var12 = var11 + (5 - var10.method637((byte) 104) << 2);
                    if (class475.field7044 == 0) {
                        if (var10.field274.field3589) {
                            var12 += 64;
                        } else {
                            var12 += 128;
                        }
                    } else if (class475.field7044 == 1) {
                        if (var10.field274.field3589) {
                            var12 += 32;
                        } else {
                            var12 += 64;
                        }
                    }
                    if (var10.field274.field3603) {
                        var12 += 1024;
                    } else if (!var10.field274.field3625) {
                        var12 += 256;
                    }
                    var10.field3853 = var12 + 1;
                } else {
                    var10.field3853 = -1;
                }
            } else {
                var10.field3853 = -1;
            }
        }
        for (int var5 = 0; var5 < class361.field5531.length; var5++) {
            class519 var6 = class361.field5531[var5];
            if (var6 != null) {
                if (var6.field7630 == 1) {
                    class24 var7 = (class24) class406.field6158.method1747((long) var6.field7629, false);
                    if (var7 != null) {
                        class17 var8 = var7.field348;
                        if (var8.field3853 >= 0) {
                            var8.field3853 += 2048;
                        }
                    }
                } else if (var6.field7630 == 10) {
                    class96 var9 = class241.field3398[var6.field7629];
                    if (var9 != null && class56.field800 != var9 && var9.field3853 >= 0) {
                        var9.field3853 += 2048;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(BI)V", line = 232)
    private final void method1332(byte arg0, int arg1) {
        class278.field3953 = 0;
        if (arg0 >= -103) {
            field2675 = null;
        }
        class230.field3285 = null;
        class360.field5526 = null;
        class13.field258.field1777++;
        class13.field258.field1778 = arg1;
        field2670++;
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V", line = 249)
    private final void method1333(byte arg0) {
        if (!class203.field2716.field1146) {
            for (int var2 = 0; var2 < class508.field7478; var2++) {
                if (class492.field7261[var2].method345(-20326) == 's' || class492.field7261[var2].method345(-20326) == 'S') {
                    class203.field2716.field1146 = true;
                    break;
                }
            }
        }
        field2658++;
        if (arg0 <= 39) {
            this.method1353(7);
        }
        if (class144.field1925 == 0) {
            Runtime var3 = Runtime.getRuntime();
            int var4 = (int) ((var3.totalMemory() - var3.freeMemory()) / 1024L);
            long var5 = class58.method427((byte) -19);
            if (class102.field1480 == 0L) {
                class102.field1480 = var5;
            }
            if (var4 > 16384 && (var5 - class102.field1480) < 5000L) {
                if ((var5 - class398.field6070) > 1000L) {
                    System.gc();
                    class398.field6070 = var5;
                }
                class528.field7739 = class80.field1142.method2705((byte) 69, class257.field3556);
                class362.field5561 = 5;
            } else {
                class528.field7739 = class462.field6906.method2705((byte) 69, class257.field3556);
                class144.field1925 = 10;
                class362.field5561 = 5;
            }
        } else if (class144.field1925 == 10) {
            for (int var7 = 0; var7 < 4; var7++) {
                class9.field174[var7] = class156.method1007(class528.field7734, false, class398.field6071);
            }
            class528.field7739 = class92.field1351.method2705((byte) 69, class257.field3556);
            class144.field1925 = 20;
            class362.field5561 = 10;
        } else if (class144.field1925 == 20) {
            if (class175.field2340 == null) {
                class175.field2340 = new class502(class13.field258, class291.field4260);
            }
            if (class175.field2340.method3007(0)) {
                class293.field4270 = class316.method1985(false, 0, 93, 1, true);
                class339.field5257 = class316.method1985(false, 1, 113, 1, true);
                class315.field4587 = class316.method1985(false, 2, 124, 1, true);
                class247.field3447 = class316.method1985(false, 3, 106, 1, true);
                class149.field1964 = class316.method1985(false, 4, 120, 1, true);
                class79.field1131 = class316.method1985(true, 5, 94, 1, true);
                class162.field2111 = class316.method1985(true, 6, 112, 1, false);
                class288.field4210 = class316.method1985(false, 7, 118, 1, true);
                class266.field3709 = class316.method1985(false, 8, 103, 1, true);
                class229.field3273 = class316.method1985(false, 9, 116, 1, true);
                class22.field327 = class316.method1985(false, 10, 126, 1, true);
                class41.field612 = class316.method1985(false, 11, 96, 1, true);
                class350.field5399 = class316.method1985(false, 12, 122, 1, true);
                class381.field5811 = class316.method1985(false, 13, 94, 1, true);
                class359.field5511 = class316.method1985(false, 14, 110, 1, false);
                class256.field3536 = class316.method1985(false, 15, 113, 1, true);
                class467.field6983 = class316.method1985(false, 16, 91, 1, true);
                class532.field7829 = class316.method1985(false, 17, 104, 1, true);
                class126.field1714 = class316.method1985(false, 18, 121, 1, true);
                class502.field7407 = class316.method1985(false, 19, 117, 1, true);
                class273.field3801 = class316.method1985(false, 20, 97, 1, true);
                class304.field4439 = class316.method1985(false, 21, 102, 1, true);
                class63.field895 = class316.method1985(false, 22, 86, 1, true);
                class502.field7409 = class316.method1985(true, 23, 116, 1, true);
                class359.field5509 = class316.method1985(false, 24, 110, 1, true);
                class21.field324 = class316.method1985(false, 25, 124, 1, true);
                class474.field7041 = class316.method1985(true, 26, 89, 1, true);
                class526.field7722 = class316.method1985(false, 27, 89, 1, true);
                class359.field5514 = class316.method1985(true, 28, 100, 1, true);
                class103.field1486 = class316.method1985(false, 29, 108, 1, true);
                class528.field7739 = class401.field6109.method2705((byte) 69, class257.field3556);
                class362.field5561 = 15;
                class144.field1925 = 30;
            } else {
                class528.field7739 = class180.field2425.method2705((byte) 69, class257.field3556);
                class362.field5561 = 12;
            }
        } else if (class144.field1925 == 30) {
            int var8 = 0;
            for (int var9 = 0; var9 < 30; var9++) {
                var8 += class254.field3525[var9].method3084(-14586) * class46.field656[var9] / 100;
            }
            if (var8 == 100) {
                class528.field7739 = class308.field4461.method2705((byte) 69, class257.field3556);
                class362.field5561 = 20;
                class138.method926(38, class266.field3709);
                class410.method2531(-5426, class266.field3709);
                class144.field1925 = 40;
            } else {
                if (var8 != 0) {
                    class528.field7739 = class46.field661.method2705((byte) 69, class257.field3556) + var8 + "%";
                }
                class362.field5561 = 20;
            }
        } else if (class144.field1925 == 40) {
            if (class359.field5514.method1295(-60)) {
                this.method1343(class359.field5514.method1289(1, 120), 5);
                class528.field7739 = class329.field5126.method2705((byte) 69, class257.field3556);
                class362.field5561 = 25;
                class144.field1925 = 50;
            } else {
                class528.field7739 = class350.field5401.method2705((byte) 69, class257.field3556) + class359.field5514.method1283((byte) 121) + "%";
                class362.field5561 = 25;
            }
        } else if (class144.field1925 == 50) {
            class423.method2581(false);
            class528.field7739 = class309.field4505.method2705((byte) 69, class257.field3556);
            class362.field5561 = 30;
            class144.field1925 = 60;
        } else if (class144.field1925 == 60) {
            int var10 = class490.method2927(18628, class266.field3709, class381.field5811);
            int var11 = class388.method2434((byte) 104);
            if (var10 < var11) {
                class528.field7739 = class490.field7243.method2705((byte) 69, class257.field3556) + var10 * 100 / var11 + "%";
                class362.field5561 = 35;
            } else {
                class528.field7739 = class340.field5259.method2705((byte) 69, class257.field3556);
                class362.field5561 = 35;
                class144.field1925 = 70;
            }
        } else if (class144.field1925 == 70) {
            int var12 = class43.method343(class266.field3709, (byte) 6);
            int var13 = class101.method658((byte) 87);
            if (var12 < var13) {
                class528.field7739 = class213.field3015.method2705((byte) 69, class257.field3556) + var12 * 100 / var13 + "%";
                class362.field5561 = 40;
            } else {
                class528.field7739 = class125.field1704.method2705((byte) 69, class257.field3556);
                class362.field5561 = 40;
                class144.field1925 = 80;
            }
        } else if (class144.field1925 == 80) {
            if (class474.field7041.method1295(-96)) {
                class56.field816 = new class350(class474.field7041, class229.field3273, class266.field3709);
                class528.field7739 = class402.field6120.method2705((byte) 69, class257.field3556);
                class362.field5561 = 45;
                class144.field1925 = 90;
            } else {
                class528.field7739 = class162.field2112.method2705((byte) 69, class257.field3556) + class474.field7041.method1283((byte) -69) + "%";
                class362.field5561 = 45;
            }
        } else if (class144.field1925 == 90) {
            class528.field7739 = class24.field352.method2705((byte) 69, class257.field3556);
            class362.field5561 = 50;
            class144.field1925 = 95;
        } else if (class144.field1925 == 95) {
            if (class203.field2716.field1146) {
                class203.field2716.field1175 = 0;
                class203.field2716.field1177 = 0;
                class203.field2716.field1161 = 1;
                class203.field2716.field1150 = 0;
                class203.field2716.field1171 = 0;
            }
            class203.field2716.field1146 = true;
            class203.field2716.method20(class312.field4572, 1);
            class503.method3015(0, false, class203.field2716.field1177);
            class528.field7739 = class370.field5653.method2705((byte) 69, class257.field3556);
            class144.field1925 = 100;
            class362.field5561 = 55;
        } else if (class144.field1925 == 100) {
            method1335(class266.field3709, class381.field5811, class400.field6090, (byte) 0);
            class528.field7739 = class233.field3319.method2705((byte) 69, class257.field3556);
            class362.field5561 = 60;
            class134.method908(1, 2);
            class144.field1925 = 110;
        } else if (class144.field1925 == 110) {
            byte var14 = 0;
            class315.field4587.method1295(-60);
            int var15 = var14 + class315.field4587.method1283((byte) 122);
            class467.field6983.method1295(-39);
            int var16 = var15 + class467.field6983.method1283((byte) 125);
            class532.field7829.method1295(-81);
            int var17 = var16 + class532.field7829.method1283((byte) -42);
            class126.field1714.method1295(-65);
            int var18 = var17 + class126.field1714.method1283((byte) -109);
            class502.field7407.method1295(-127);
            int var19 = var18 + class502.field7407.method1283((byte) 122);
            class273.field3801.method1295(-97);
            int var20 = var19 + class273.field3801.method1283((byte) 120);
            class304.field4439.method1295(-41);
            int var21 = var20 + class304.field4439.method1283((byte) -87);
            class63.field895.method1295(-116);
            int var22 = var21 + class63.field895.method1283((byte) 124);
            class359.field5509.method1295(-79);
            int var23 = var22 + class359.field5509.method1283((byte) 37);
            class21.field324.method1295(-106);
            int var24 = var23 + class21.field324.method1283((byte) 124);
            class526.field7722.method1295(-106);
            int var25 = var24 + class526.field7722.method1283((byte) 119);
            class103.field1486.method1295(-121);
            int var26 = var25 + class103.field1486.method1283((byte) 125);
            if (var26 < 1200) {
                class528.field7739 = class330.field5157.method2705((byte) 69, class257.field3556) + var26 / 12 + "%";
                class362.field5561 = 65;
            } else {
                class83.field1218 = new class527(class67.field957, class257.field3556, class315.field4587);
                class509.field7483 = new class233(class67.field957, class257.field3556, class315.field4587);
                class77.field1120 = new class496(class67.field957, class257.field3556, class315.field4587, class266.field3709);
                class496.field7314 = new class139(class67.field957, class257.field3556, class532.field7829);
                class225.field3116 = new class134(class67.field957, class257.field3556, class315.field4587);
                class306.field4441 = new class144(class67.field957, class257.field3556, class315.field4587);
                class183.field2487 = new class208(class67.field957, class257.field3556, class315.field4587, class288.field4210);
                class313.field4574 = new class214(class67.field957, class257.field3556, class315.field4587);
                class448.field6743 = new class336(class67.field957, class257.field3556, class315.field4587);
                class432.field6575 = new class293(class67.field957, class257.field3556, true, class467.field6983, class288.field4210);
                class509.field7484 = new class289(class67.field957, class257.field3556, class315.field4587, class266.field3709);
                class244.field3413 = new class147(class67.field957, class257.field3556, class315.field4587, class266.field3709);
                class137.field1834 = new class251(class67.field957, class257.field3556, true, class126.field1714, class288.field4210);
                class103.field1489 = new class244(class67.field957, class257.field3556, true, class83.field1218, class502.field7407, class288.field4210);
                class529.field7758 = new class240(class67.field957, class257.field3556, class315.field4587);
                class201.field2707 = new class70(class67.field957, class257.field3556, class273.field3801, class293.field4270, class339.field5257);
                class332.field5172 = new class342(class67.field957, class257.field3556, class315.field4587);
                class182.field2469 = new class355(class67.field957, class257.field3556, class315.field4587);
                class239.field3360 = new class475(class67.field957, class257.field3556, class304.field4439, class288.field4210);
                class319.field4623 = new class126(class67.field957, class257.field3556, class315.field4587);
                class41.field606 = new class359(class67.field957, class257.field3556, class315.field4587);
                class99.field1447 = new class61(class67.field957, class257.field3556, class315.field4587);
                class102.field1481 = new class21(class67.field957, class257.field3556, class63.field895);
                class431.field6567 = new class20(class67.field957, class257.field3556, class315.field4587);
                class35.method311(107, class266.field3709, class288.field4210, class381.field5811, class247.field3447);
                class281.method1801(class103.field1486, -106);
                class82.field1190 = new class493(class257.field3556, class359.field5509, class21.field324);
                class321.field4650 = new class152(class257.field3556, class359.field5509, class21.field324, new class215());
                class528.field7739 = class346.field5336.method2705((byte) 69, class257.field3556);
                class362.field5561 = 65;
                class470.method2818((byte) -56);
                class432.field6575.method1867(!class203.field2716.method15(class378.field5771, 0), 50);
                class288.field4208 = new class83();
                class201.method1360(false);
                class471.method2821(class526.field7722, 1024);
                class315.method1980(class56.field816, 91, class288.field4210);
                class144.field1925 = 120;
            }
        } else if (class144.field1925 == 120) {
            int var27 = class273.method1754(false, class266.field3709);
            int var28 = class366.method2333((byte) 64);
            if (var28 > var27) {
                class528.field7739 = class523.field7689.method2705((byte) 69, class257.field3556) + var27 * 100 / var28 + "%";
                class362.field5561 = 70;
            } else {
                class150.method985(13515, class400.field6090, class266.field3709);
                class528.method3126(class434.field6586, (byte) 121);
                class528.field7739 = class195.field2605.method2705((byte) 69, class257.field3556);
                class144.field1925 = 130;
                class362.field5561 = 70;
            }
        } else if (class144.field1925 == 130) {
            if (class22.field327.method1275("huffman", "", (byte) 120)) {
                class80 var29 = new class80(class22.field327.method1270(-124, "", "huffman"));
                class430.method2628(var29, -31);
                class528.field7739 = class111.field1558.method2705((byte) 69, class257.field3556);
                class144.field1925 = 140;
                class362.field5561 = 75;
            } else {
                class528.field7739 = class405.field6153.method2705((byte) 69, class257.field3556) + "0%";
                class362.field5561 = 75;
            }
        } else if (class144.field1925 == 140) {
            if (class247.field3447.method1295(-119)) {
                class528.field7739 = class525.field7713.method2705((byte) 69, class257.field3556);
                class362.field5561 = 80;
                class144.field1925 = 150;
            } else {
                class528.field7739 = class496.field7313.method2705((byte) 69, class257.field3556) + class247.field3447.method1283((byte) -6) + "%";
                class362.field5561 = 80;
            }
        } else if (class144.field1925 == 150) {
            if (class350.field5399.method1295(-34)) {
                class528.field7739 = class222.field3103.method2705((byte) 69, class257.field3556);
                class144.field1925 = 160;
                class362.field5561 = 82;
            } else {
                class528.field7739 = class24.field349.method2705((byte) 69, class257.field3556) + class350.field5399.method1283((byte) 119) + "%";
                class362.field5561 = 82;
            }
        } else if (class144.field1925 == 160) {
            if (class381.field5811.method1295(-78)) {
                class528.field7739 = class272.field3772.method2705((byte) 69, class257.field3556);
                class144.field1925 = 170;
                class362.field5561 = 85;
            } else {
                class528.field7739 = class272.field3772.method2705((byte) 69, class257.field3556) + class381.field5811.method1283((byte) -75) + "%";
                class362.field5561 = 85;
            }
        } else if (class144.field1925 == 170) {
            if (class502.field7409.method1285("details", 1)) {
                class12.method114(class502.field7409, class225.field3116, class306.field4441, class432.field6575, class509.field7484, class244.field3413, class288.field4208);
                class528.field7739 = class344.field5309.method2705((byte) 69, class257.field3556);
                class144.field1925 = 190;
                class362.field5561 = 89;
            } else {
                class528.field7739 = class388.field5934.method2705((byte) 69, class257.field3556) + class502.field7409.method1278("details", 0) + "%";
                class362.field5561 = 87;
            }
        } else if (class144.field1925 == 190) {
            class331.field5170 = new int[class99.field1447.field875];
            class534.field7852 = new boolean[class99.field1447.field875];
            class429.field6543 = new String[class41.field606.field5510];
            for (int var30 = 0; var30 < class99.field1447.field875; var30++) {
                if (class99.field1447.method440(var30, 13367).field1930 == 0) {
                    class534.field7852[var30] = true;
                    class381.field5804++;
                }
                class331.field5170[var30] = -1;
            }
            class109.method690((byte) -125);
            class236.field3342 = class247.field3447.method1265("loginscreen", 45);
            class340.field5264 = class247.field3447.method1265("lobbyscreen", 124);
            class79.field1131.method1279(0, true, false);
            class162.field2111.method1279(0, true, true);
            class266.field3709.method1279(0, true, true);
            class381.field5811.method1279(0, true, true);
            class22.field327.method1279(0, true, true);
            class247.field3447.method1279(0, true, true);
            class315.field4587.field2559 = 2;
            class206.field2774 = true;
            class532.field7829.field2559 = 2;
            class467.field6983.field2559 = 2;
            class126.field1714.field2559 = 2;
            class502.field7407.field2559 = 2;
            class273.field3801.field2559 = 2;
            class304.field4439.field2559 = 2;
            class310.method1945(-1, class203.field2716.field1161, -1, 0, false);
            class528.field7739 = class509.field7486.method2705((byte) 69, class257.field3556);
            class144.field1925 = 200;
            class362.field5561 = 95;
        } else if (class144.field1925 == 200) {
            class134.method908(2, 2);
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Z)V", line = 765)
    public final void method1334(boolean arg0) {
        field2659++;
        if (class378.field5771 == 2) {
            try {
                this.method1338((byte) 33);
            } catch (Throwable var3) {
                class395.method2457(var3.getMessage() + " (Recovered) " + this.method1350(32), var3, 1);
                class170.method1152(-59, 0);
            }
        } else {
            this.method1338((byte) -123);
        }
        if (!arg0) {
            this.method1332((byte) 107, 67);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Luu;Luu;Lqa;B)V", line = 788)
    public static final void method1335(class191 arg0, class191 arg1, class165 arg2, byte arg3) {
        class55.field768 = class7.method92(arg1, 0, -15471, class73.field1013);
        field2662++;
        class536.field7867 = arg2.method839(class55.field768, class252.method1638(arg0, class73.field1013, 0), true);
        class263.field3684 = class7.method92(arg1, 0, -15471, class84.field1221);
        class94.field1380 = arg2.method839(class263.field3684, class252.method1638(arg0, class84.field1221, 0), true);
        class175.field2338 = class7.method92(arg1, 0, -15471, class526.field7720);
        class199.field2653 = arg2.method839(class175.field2338, class252.method1638(arg0, class526.field7720, 0), true);
        if (arg3 != 0) {
            method1348(null);
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V", line = 804)
    private final void method1336(byte arg0) {
        field2669++;
        if (arg0 <= 106) {
            field2679 = null;
        }
        if (class209.field2948 < class13.field258.field1777) {
            class139.field1851.field2608 = !class139.field1851.field2608;
            class91.field1317 = (class13.field258.field1777 - 1) * 50 * 5;
            if (class91.field1317 > 3000) {
                class91.field1317 = 3000;
            }
            if (class13.field258.field1777 >= 2 && class13.field258.field1778 == 6) {
                this.method3139("js5connect_outofdate", (byte) 83);
                class435.field6596 = 13;
                return;
            }
            if (class13.field258.field1777 >= 4 && class13.field258.field1778 == -1) {
                this.method3139("js5crc", (byte) 83);
                class435.field6596 = 13;
                return;
            }
            if (class13.field258.field1777 >= 4 && class2.method10(class435.field6596, (byte) -71)) {
                if (class13.field258.field1778 == 7 || class13.field258.field1778 == 9) {
                    this.method3139("js5connect_full", (byte) 83);
                } else if (class13.field258.field1778 > 0) {
                    this.method3139("js5connect", (byte) 83);
                } else {
                    this.method3139("js5io", (byte) 83);
                }
                class435.field6596 = 13;
                return;
            }
        }
        class209.field2948 = class13.field258.field1777;
        if (class91.field1317 > 0) {
            class91.field1317--;
            return;
        }
        try {
            if (class278.field3953 == 0) {
                class230.field3285 = class312.field4572.method2991(class139.field1851.method1315(-104), class139.field1851.field2603, 1);
                class278.field3953++;
            }
            if (class278.field3953 == 1) {
                if (class230.field3285.field3322 == 2) {
                    this.method1332((byte) -119, 1000);
                    return;
                }
                if (class230.field3285.field3322 == 1) {
                    class278.field3953++;
                }
            }
            if (class278.field3953 == 2) {
                class360.field5526 = new class125((Socket) class230.field3285.field3324, class312.field4572);
                class164 var2 = new class164(5);
                var2.method1072((byte) 102, class198.field2624.field6547);
                var2.method1073(326170192, 603);
                class360.field5526.method856(0, 5000, 5, var2.field2219);
                class278.field3953++;
                class444.field6678 = class58.method427((byte) -19);
            }
            if (class278.field3953 == 3) {
                if (class2.method10(class435.field6596, (byte) -71) || class360.field5526.method853(true) > 0) {
                    int var3 = class360.field5526.method858(0);
                    if (var3 != 0) {
                        this.method1332((byte) -124, var3);
                        return;
                    }
                    class278.field3953++;
                } else if (class58.method427((byte) -19) - class444.field6678 > 30000L) {
                    this.method1332((byte) -108, 1001);
                    return;
                }
            }
            if (class278.field3953 == 4) {
                boolean var4 = class435.field6596 == 1 || class92.method621(class435.field6596, -4) || class404.method2491(class435.field6596, -9);
                class13.field258.method886(!var4, class360.field5526, (byte) -53);
                class278.field3953 = 0;
                class360.field5526 = null;
                class230.field3285 = null;
            }
        } catch (IOException var5) {
            this.method1332((byte) -105, 1002);
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "()V", line = 947)
    public static final void method1337() {
        class178.field2376 = 0;
        for (int var0 = 0; var0 < class333.field5187; var0++) {
            class17 var1 = ((class24) class406.field6158.method1747((long) class224.field3114[var0], false)).field348;
            if (var1.field3884 && var1.method177(false) != -1) {
                int var2 = (var1.method637((byte) 120) - 1) * 64 + 60;
                int var3 = var1.field1867 - var2 >> 7;
                int var4 = var1.field1862 - var2 >> 7;
                class275 var5 = class82.method561(var4, var1.field1866, var3, (byte) 114);
                if (var5 != null) {
                    int var6 = var5.field3882;
                    if (var5 instanceof class17) {
                        var6 += 2048;
                    }
                    if (var5.field3900 == 0 && var5.method177(false) != -1) {
                        class539.field7904[class178.field2376] = var6;
                        class225.field3118[class178.field2376] = var6;
                        class178.field2376++;
                        var5.field3900++;
                    }
                    class539.field7904[class178.field2376] = var6;
                    class225.field3118[class178.field2376] = var1.field3882 + 2048;
                    class178.field2376++;
                    var5.field3900++;
                }
            }
        }
        class257.method1656(class539.field7904, true, class178.field2376 - 1, 0, class225.field3118);
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V", line = 995)
    private final void method1338(byte arg0) {
        field2665++;
        if (class435.field6596 == 13) {
            return;
        }
        long var2 = class63.method459((byte) 101) / 1000000L - class205.field2735;
        class205.field2735 = class63.method459((byte) 101) / 1000000L;
        boolean var4 = class23.method207(true);
        if (var4 && class539.field7905 && class85.field1240 != null) {
            class85.field1240.method401(false);
        }
        if (class143.method955(-7, class435.field6596)) {
            if (class26.field383 != 0L && class58.method427((byte) -19) > class26.field383) {
                class310.method1945(class203.field2716.field1158, class325.method2014((byte) 92), class203.field2716.field1154, 0, false);
            } else if (!class400.field6090.method778() && class400.field6095) {
                class127.method871((byte) -123);
            }
        }
        int var5 = 111 / ((-arg0 - 67) / 54);
        if (class461.field6896 == null) {
            Container var6;
            if (class286.field4195 == null) {
                var6 = class312.field4572.field7381;
            } else {
                var6 = class286.field4195;
            }
            int var7 = var6.getSize().width;
            int var8 = var6.getSize().height;
            if (class286.field4195 == var6) {
                Insets var9 = class286.field4195.getInsets();
                var7 -= var9.right + var9.left;
                var8 -= var9.top + var9.bottom;
            }
            if (class164.field2221 != var7 || class360.field5522 != var8) {
                if (class400.field6090 == null || class400.field6090.method803()) {
                    class498.method2970((byte) -83);
                } else {
                    class164.field2221 = var7;
                    class360.field5522 = var8;
                }
                class26.field383 = class58.method427((byte) -19) + 500L;
            }
        }
        if (class461.field6896 != null && !class519.field7632 && class143.method955(-7, class435.field6596)) {
            class310.method1945(-1, class203.field2716.field1161, -1, 0, false);
        }
        boolean var10 = false;
        if (class264.field3703) {
            var10 = true;
            class264.field3703 = false;
        }
        if (var10) {
            class164.method1105(255);
        }
        if (class400.field6090 != null && class400.field6090.method778() || class325.method2014((byte) 74) != 1) {
            class141.method950(0);
        }
        if (class435.field6596 == 0) {
            class383.method2402(var10, class354.field5481[class525.field7712], class322.field4670[class525.field7712], class528.field7739, class80.field1141[class525.field7712], class362.field5561, 17);
        } else if (class435.field6596 == 1) {
            class56.method415(class400.field6090.method778() | var10, class322.field4670[class525.field7712].getRGB(), class199.field2653, class354.field5481[class525.field7712].getRGB(), class400.field6090, class80.field1141[class525.field7712].getRGB(), (byte) 84);
        } else if (class140.method935((byte) 115, class435.field6596)) {
            class405.method2495(121);
        } else if (class506.method3034(80, class435.field6596)) {
            class405.method2495(-52);
        } else if (class180.method1207(class435.field6596, -256)) {
            if (class281.field3982 == 1) {
                if (class199.field2655 > class463.field6920) {
                    class463.field6920 = class199.field2655;
                }
                int var12 = (class463.field6920 - class199.field2655) * 50 / class463.field6920;
                class536.method3166(class86.field1253.method2705((byte) 69, class257.field3556) + "<br>(" + var12 + "%)", true, class94.field1380, 2);
            } else if (class281.field3982 == 2) {
                if (class448.field6750 < class29.field448) {
                    class448.field6750 = class29.field448;
                }
                int var11 = (class448.field6750 - class29.field448) * 50 / class448.field6750 + 50;
                class536.method3166(class86.field1253.method2705((byte) 69, class257.field3556) + "<br>(" + var11 + "%)", true, class94.field1380, 2);
            } else {
                class536.method3166(class86.field1253.method2705((byte) 69, class257.field3556), true, class94.field1380, 2);
            }
        } else if (class435.field6596 == 9) {
            class195.method1314(var2, (byte) -112);
        } else if (class435.field6596 == 12) {
            class536.method3166(class46.field654.method2705((byte) 69, class257.field3556) + "<br>" + class345.field5329.method2705((byte) 69, class257.field3556), true, class94.field1380, 2);
        }
        if (class486.field7200 == 3) {
            for (int var13 = 0; var13 < class428.field6506; var13++) {
                Rectangle var14 = class375.field5701[var13];
                if (class447.field6721[var13]) {
                    class400.field6090.method1117(var14.height, var14.y, -1996553985, var14.x, var14.width, (byte) 73);
                } else if (class106.field1497[var13]) {
                    class400.field6090.method1117(var14.height, var14.y, -1996554240, var14.x, var14.width, (byte) 73);
                }
            }
        }
        if (class195.method1313(-2)) {
            class394.method2451(class400.field6090, 350);
        }
        if (class143.method955(-7, class435.field6596) && class486.field7200 == 0 && class325.method2014((byte) 73) == 1 && !var10 && class500.field7367.equals("1.1")) {
            int var15 = 0;
            for (int var16 = 0; var16 < class428.field6506; var16++) {
                if (class106.field1497[var16]) {
                    class106.field1497[var16] = false;
                    class365.field5603[var15++] = class375.field5701[var16];
                }
            }
            class400.field6090.method851(class365.field5603, var15);
        } else if (class435.field6596 != 0) {
            class400.field6090.method757();
            for (int var17 = 0; var17 < class428.field6506; var17++) {
                class106.field1497[var17] = false;
            }
        }
        if (class203.field2716.field1170 == 0) {
            class388.method2433(15L, -123);
        } else if (class203.field2716.field1170 == 1) {
            class388.method2433(10L, 62);
        } else if (class203.field2716.field1170 == 2) {
            class388.method2433(5L, -69);
        } else if (class203.field2716.field1170 == 3) {
            class388.method2433(2L, 70);
        }
        if (class206.field2774) {
            class436.method2650(-30848);
        }
        if (class203.field2716.field1146 && class435.field6596 == 2 && class337.field5232 != -1) {
            class203.field2716.field1146 = false;
            class203.field2716.method20(class312.field4572, 1);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(B)V", line = 1231)
    public final void method1339(byte arg0) {
        field2663++;
        if (class298.field4388) {
            class141.method943(arg0 - 48);
        }
        if (class400.field6090 != null) {
            class400.field6090.method1120((byte) 43);
        }
        if (class461.field6896 != null) {
            class91.method612(0, class312.field4572, class461.field6896);
            class461.field6896 = null;
        }
        if (arg0 != 48) {
            this.method1350(1);
        }
        if (class374.field5695 != null) {
            class374.field5695.method1934((byte) -105);
            class374.field5695 = null;
        }
        class373.method2354((byte) 114);
        class13.field258.method900(arg0 - 49);
        class291.field4260.method3149((byte) 60);
        if (class150.field1972 != null) {
            class150.field1972.method2631(false);
            class150.field1972 = null;
        }
    }

    @OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V", line = 1274)
    private final void method1340(int arg0) {
        if (class435.field6596 == 6 && class380.field5793 == 0) {
            if (class485.field7175 > 1) {
                class485.field7175--;
                class402.field6122 = class145.field1932;
            }
            if (!class139.field1850) {
                class47.method368((byte) -106);
            }
            for (int var2 = 0; var2 < 100 && class116.method716(14815); var2++) {
            }
        }
        field2671++;
        class205.field2728++;
        class385.method2407(null, -1, -1, (byte) 83);
        class453.method2763(-1, 4, -1, null);
        class482.method2895(0);
        class145.field1932++;
        for (int var3 = 0; var3 < class515.field7566; var3++) {
            class17 var4 = class480.field7090[var3].field348;
            if (var4 != null) {
                byte var5 = var4.field274.field3583;
                if ((var5 & 0x1) != 0) {
                    int var6 = var4.method637((byte) -121);
                    if ((var5 & 0x2) != 0 && var4.field3918 == 0 && Math.random() * 1000.0D < 10.0D) {
                        int var7 = (int) Math.round(Math.random() * 10.0D - 5.0D);
                        int var8 = (int) Math.round(Math.random() * 10.0D - 5.0D);
                        if (var7 != 0 || var8 != 0) {
                            int var9 = var4.field3917[0] + var7;
                            if (var9 < 0) {
                                var9 = 0;
                            } else if (class398.field6071 - var6 - 1 < var9) {
                                var9 = class398.field6071 - var6 - 1;
                            }
                            int var10 = var4.field3915[0] + var8;
                            if (var10 < 0) {
                                var10 = 0;
                            } else if ((class528.field7734 - var6 - 1) < var10) {
                                var10 = class528.field7734 - var6 - 1;
                            }
                            int var11 = class275.method1769(class166.field2252, var6, var4.field3915[0], var6, 0, -1, var10, true, var6, var9, class466.field6948, class9.field174[var4.field1866], 0, 99999999, var4.field3917[0]);
                            if (var11 > 0) {
                                if (var11 > 9) {
                                    var11 = 9;
                                }
                                for (int var12 = 0; var12 < var11; var12++) {
                                    var4.field3917[var12] = class466.field6948[var11 - var12 - 1];
                                    var4.field3915[var12] = class166.field2252[var11 - var12 - 1];
                                    var4.field3908[var12] = 1;
                                }
                                var4.field3918 = var11;
                            }
                        }
                    }
                    class84.method578(true, var4, true);
                    int var13 = class307.method1924((byte) -118, var4);
                    class40.method328(var4, class235.field3331, true, class103.field1484, var13);
                    class184.method1249(var4, (byte) 79);
                }
            }
        }
        if (class380.field5793 == 0 && class351.field5430 == 0) {
            if (class340.field5269 == 2) {
                class177.method1192((byte) -38);
            } else {
                class297.method1897(-66);
            }
            if ((class199.field2646 >> 7) < 14 || class199.field2646 >> 7 >= class398.field6071 - 14 || class140.field1869 >> 7 < 14 || (class140.field1869 >> 7) >= (class528.field7734 - 14)) {
                class88.method593(false);
            }
        }
        while (true) {
            class143 var14;
            class282 var15;
            class282 var16;
            do {
                var14 = (class143) class48.field694.method447(arg0 + 7);
                if (var14 == null) {
                    while (true) {
                        class143 var17;
                        class282 var18;
                        class282 var19;
                        do {
                            var17 = (class143) class389.field5942.method447(8);
                            if (var17 == null) {
                                while (true) {
                                    class143 var20;
                                    class282 var21;
                                    class282 var22;
                                    do {
                                        var20 = (class143) class518.field7619.method447(8);
                                        if (var20 == null) {
                                            if (arg0 != 1) {
                                                method1335(null, null, null, (byte) -106);
                                            }
                                            if (class466.field6949 != null) {
                                                class201.method1361(true);
                                            }
                                            if (class393.field6017 % 1500 == 0) {
                                                class318.method1990(-11739);
                                            }
                                            if (class435.field6596 == 6 && class380.field5793 == 0) {
                                                class455.method2769((byte) 113);
                                            }
                                            class283.method1819(32767);
                                            if (class298.field4388 && class439.field6627 < (class58.method427((byte) -19) - 60000L)) {
                                                class141.method943(0);
                                            }
                                            for (class75 var23 = (class75) class345.field5327.method3040(false); var23 != null; var23 = (class75) class345.field5327.method3043((byte) -125)) {
                                                if (((long) var23.field1097) < (class58.method427((byte) -19) / 1000L - 5L)) {
                                                    if (var23.field1100 > 0) {
                                                        class71.method494(0, "", 5, (byte) 95, "", var23.field1104 + class24.field350.method2705((byte) 69, class257.field3556));
                                                    }
                                                    if (var23.field1100 == 0) {
                                                        class71.method494(0, "", 5, (byte) 99, "", var23.field1104 + class501.field7396.method2705((byte) 69, class257.field3556));
                                                    }
                                                    var23.method1184(arg0 ^ 0xFFFFFFB6);
                                                }
                                            }
                                            if (class435.field6596 == 6 && class380.field5793 == 0) {
                                                if (class374.field5695 == null) {
                                                    class420.method2566(-5, false);
                                                    return;
                                                }
                                                class106.field1498++;
                                                if (class106.field1498 > 50) {
                                                    class118.field1627++;
                                                    class424.method2582(class199.field2652, -1);
                                                }
                                                try {
                                                    if (class374.field5695 != null && class538.field7879.field2185 > 0) {
                                                        class132.field1786 += class538.field7879.field2185;
                                                        class374.field5695.method1936(class538.field7879.field2185, true, class538.field7879.field2219, 0);
                                                        class106.field1498 = 0;
                                                        class538.field7879.field2185 = 0;
                                                        return;
                                                    }
                                                } catch (IOException var24) {
                                                    class420.method2566(arg0 ^ 0xFFFFFFFA, false);
                                                    return;
                                                }
                                            }
                                            return;
                                        }
                                        var21 = var20.field1903;
                                        if (var21.field4031 < 0) {
                                            break;
                                        }
                                        var22 = class21.method194(-110, var21.field4122);
                                    } while (var22 == null || var22.field4108 == null || var22.field4108.length <= var21.field4031 || var22.field4108[var21.field4031] != var21);
                                    class343.method2227(var20);
                                }
                            }
                            var18 = var17.field1903;
                            if (var18.field4031 < 0) {
                                break;
                            }
                            var19 = class21.method194(-108, var18.field4122);
                        } while (var19 == null || var19.field4108 == null || var19.field4108.length <= var18.field4031 || var19.field4108[var18.field4031] != var18);
                        class343.method2227(var17);
                    }
                }
                var15 = var14.field1903;
                if (var15.field4031 < 0) {
                    break;
                }
                var16 = class21.method194(arg0 - 121, var15.field4122);
            } while (var16 == null || var16.field4108 == null || var16.field4108.length <= var15.field4031 || var16.field4108[var15.field4031] != var15);
            class343.method2227(var14);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "([Lga;IIIIIIIII)V", line = 1564)
    public static final void method1341(class282[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        for (int var10 = 0; var10 < arg0.length; var10++) {
            class282 var11 = arg0[var10];
            if (var11 != null && var11.field4122 == arg1) {
                int var12 = var11.field4032 + arg6;
                int var13 = var11.field4010 + arg7;
                int var14;
                int var15;
                int var16;
                int var17;
                if (var11.field4103 == 2) {
                    var14 = arg2;
                    var15 = arg3;
                    var16 = arg4;
                    var17 = arg5;
                } else {
                    int var18 = var11.field3991 + var12;
                    int var19 = var11.field4043 + var13;
                    if (var11.field4103 == 9) {
                        var18++;
                        var19++;
                    }
                    var14 = var12 > arg2 ? var12 : arg2;
                    var15 = var13 > arg3 ? var13 : arg3;
                    var16 = var18 < arg4 ? var18 : arg4;
                    var17 = var19 < arg5 ? var19 : arg5;
                }
                if (var11.field4103 == 0 || var11.field4152 || method1348(var11).field6684 != 0 || class269.field3744 == var11 || class385.field5854 == var11.field4014) {
                    if (!method1330(var11)) {
                        if (class466.field6949 == var11) {
                            class384.field5829 = true;
                            class94.field1379 = var12;
                            class72.field998 = var13;
                        }
                        if (var11.field4097 || var14 < var16 && var15 < var17) {
                            if (var11.field4013 && arg8 >= var14 && arg9 >= var15 && arg8 < var16 && arg9 < var17) {
                                for (class143 var20 = (class143) class518.field7619.method445(33); var20 != null; var20 = (class143) class518.field7619.method451(false)) {
                                    if (var20.field1904) {
                                        var20.method25(-13489);
                                        var20.field1903.field4112 = false;
                                    }
                                }
                                if (class132.field1787 == 0) {
                                    class466.field6949 = null;
                                    class269.field3744 = null;
                                }
                                class268.field3734 = 0;
                                class222.field3108 = false;
                                class208.field2874 = false;
                                if (!class139.field1850) {
                                    class47.method368((byte) -106);
                                }
                            }
                            boolean var21;
                            if (class502.field7404.method2323((byte) -101) >= var14 && class502.field7404.method2325(40) >= var15 && class502.field7404.method2323((byte) -117) < var16 && class502.field7404.method2325(-120) < var17) {
                                var21 = true;
                            } else {
                                var21 = false;
                            }
                            if (!class44.field641 && var21) {
                                if (var11.field4088 >= 0) {
                                    class449.field6752 = var11.field4088;
                                } else if (var11.field4013) {
                                    class449.field6752 = -1;
                                }
                            }
                            if (!class139.field1850 && arg8 >= var14 && arg9 >= var15 && arg8 < var16 && arg9 < var17) {
                                class249.method1617((byte) -109, arg9 - var13, arg8 - var12, var11);
                            }
                            boolean var22 = false;
                            if (class502.field7404.method2322(-28950) && var21) {
                                var22 = true;
                            }
                            boolean var23 = false;
                            class245 var24 = (class245) class212.field3001.method445(33);
                            if (var24 != null && var24.method1569(3) == 0 && var24.method1571(true) >= var14 && var24.method1567(-20707) >= var15 && var24.method1571(true) < var16 && var24.method1567(-20707) < var17) {
                                var23 = true;
                            }
                            if (var11.field4124 != null) {
                                for (int var25 = 0; var25 < var11.field4124.length; var25++) {
                                    if (class35.field515.method1970(true, var11.field4124[var25])) {
                                        if (var11.field4078 == null || class393.field6017 >= var11.field4078[var25]) {
                                            byte var26 = var11.field4070[var25];
                                            if (var26 == 0 || ((var26 & 0x8) == 0 || !class35.field515.method1970(true, 86) && !class35.field515.method1970(true, 82) && !class35.field515.method1970(true, 81)) && ((var26 & 0x2) == 0 || class35.field515.method1970(true, 86)) && ((var26 & 0x1) == 0 || class35.field515.method1970(true, 82)) && ((var26 & 0x4) == 0 || class35.field515.method1970(true, 81))) {
                                                if (var25 < 10) {
                                                    class257.method1654(var11.field4029, "", (byte) 104, var25 + 1, -1);
                                                } else if (var25 == 10) {
                                                    class306.method1922(-1);
                                                    class445 var27 = method1348(var11);
                                                    class136.method917(-85, var27.method2699(1661101682), var11, var27.field6681);
                                                    class468.field7001 = class470.method2819((byte) 126, var11);
                                                    if (class468.field7001 == null) {
                                                        class468.field7001 = "Null";
                                                    }
                                                    class466.field6947 = var11.field4116 + "<col=ffffff>";
                                                }
                                                int var28 = var11.field4000[var25];
                                                if (var11.field4078 == null) {
                                                    var11.field4078 = new int[var11.field4124.length];
                                                }
                                                if (var28 == 0) {
                                                    var11.field4078[var25] = Integer.MAX_VALUE;
                                                } else {
                                                    var11.field4078[var25] = class393.field6017 + var28;
                                                }
                                            }
                                        }
                                    } else if (var11.field4078 != null) {
                                        var11.field4078[var25] = 0;
                                    }
                                }
                            }
                            if (var23) {
                                class391.method2443(var11, 0, var24.method1571(true) - var12, var24.method1567(-20707) - var13);
                            }
                            if (class466.field6949 != null && class466.field6949 != var11 && var21 && method1348(var11).method2696(1)) {
                                class179.field2389 = var11;
                            }
                            if (class269.field3744 == var11) {
                                class291.field4257 = true;
                                class444.field6674 = var12;
                                class221.field3078 = var13;
                            }
                            if (var11.field4152 || var11.field4014 != 0) {
                                if (var21 && class322.field4674 != 0 && var11.field4099 != null) {
                                    class143 var29 = new class143();
                                    var29.field1904 = true;
                                    var29.field1903 = var11;
                                    var29.field1902 = class322.field4674;
                                    var29.field1912 = var11.field4099;
                                    class518.field7619.method453((byte) 116, var29);
                                }
                                if (class466.field6949 != null || class139.field1850 || class226.field3209 != var11.field4014 && class268.field3734 > 0) {
                                    var23 = false;
                                    var22 = false;
                                    var21 = false;
                                }
                                if (var11.field4014 != 0) {
                                    if (class385.field5850 == var11.field4014 || class320.field4639 == var11.field4014) {
                                        class80.field1139 = var11;
                                        if (class121.field1655 != null) {
                                            class121.field1655.method483(var11.field4043, 44, class400.field6090);
                                        }
                                        if (class385.field5850 == var11.field4014) {
                                            if (!class139.field1850 && arg8 >= var14 && arg9 >= var15 && arg8 < var16 && arg9 < var17) {
                                                class295.method1884(arg8, class400.field6090, -47, arg9);
                                                for (class318 var30 = (class318) class347.field5356.method3040(false); var30 != null; var30 = (class318) class347.field5356.method3043((byte) -125)) {
                                                    if (arg8 >= var30.field4613 && arg8 < var30.field4610 && arg9 >= var30.field4614 && arg9 < var30.field4609) {
                                                        class47.method368((byte) -106);
                                                        class420.method2567(var30.field4611, (byte) -18);
                                                    }
                                                }
                                            }
                                            class385.method2407(var11, var12, var13, (byte) 83);
                                            continue;
                                        }
                                    }
                                    if (class385.field5854 == var11.field4014) {
                                        if (var11.method1812((byte) 103, class400.field6090) == null || class207.field2819 != 0 && class207.field2819 != 3 || class139.field1850 || arg8 < var14 || arg9 < var15 || arg8 >= var16 || arg9 >= var17) {
                                            continue;
                                        }
                                        int var31 = arg8 - var12;
                                        int var32 = arg9 - var13;
                                        int var33 = var11.field4118[var32];
                                        if (var31 < var33 || var31 > var11.field4047[var32] + var33) {
                                            continue;
                                        }
                                        int var34 = var31 - var11.field3991 / 2;
                                        int var35 = var32 - var11.field4043 / 2;
                                        int var36;
                                        if (class340.field5269 == 4) {
                                            var36 = (int) class53.field744 & 0x3FFF;
                                        } else {
                                            var36 = (int) class53.field744 + class303.field4433 & 0x3FFF;
                                        }
                                        int var37 = class428.field6502[var36];
                                        int var38 = class428.field6501[var36];
                                        if (class340.field5269 != 4) {
                                            var37 = (class514.field7549 + 256) * var37 >> 8;
                                            var38 = (class514.field7549 + 256) * var38 >> 8;
                                        }
                                        int var39 = var34 * var38 + var35 * var37 >> 15;
                                        int var40 = var35 * var38 - var34 * var37 >> 15;
                                        int var41;
                                        int var42;
                                        if (class340.field5269 == 4) {
                                            var41 = (class62.field883 >> 7) + (var39 >> 2);
                                            var42 = (class21.field320 >> 7) - (var40 >> 2);
                                        } else {
                                            int var43 = (class56.field800.method637((byte) 124) - 1) * 64;
                                            var41 = (class56.field800.field1867 - var43 >> 7) + (var39 >> 2);
                                            var42 = (class56.field800.field1862 - var43 >> 7) - (var40 >> 2);
                                        }
                                        if (class44.field641 && (class144.field1922 & 0x40) != 0) {
                                            class282 var44 = class178.method1197(class497.field7333, class63.field894, 49);
                                            if (var44 == null) {
                                                class306.method1922(-1);
                                            } else {
                                                class24.method227(false, 50, var42, (byte) -104, true, " ->", var11.field4012, class48.field691, class468.field7001, 1L, var41);
                                            }
                                            continue;
                                        }
                                        if (class67.field957 == class249.field3474) {
                                            class24.method227(false, 9, var42, (byte) -76, true, "", -1, -1, class279.field3963.method2705((byte) 69, class257.field3556), 1L, var41);
                                        }
                                        class24.method227(false, 8, var42, (byte) -62, true, "", -1, class400.field6096, class179.field2410, 1L, var41);
                                        continue;
                                    }
                                    if (class226.field3209 == var11.field4014) {
                                        class120.field1643 = var11;
                                        if (var21) {
                                            class222.field3108 = true;
                                        }
                                        if (var23) {
                                            int var45 = (int) ((double) (var24.method1571(true) - var12 - var11.field3991 / 2) * 2.0D / (double) class12.field223);
                                            int var46 = (int) (-((double) (var24.method1567(-20707) - var13 - var11.field4043 / 2) * 2.0D / (double) class12.field223));
                                            int var47 = class267.field3712 + var45 + class12.field247;
                                            int var48 = class253.field3514 + var46 + class12.field245;
                                            class441 var49 = class28.method258((byte) 120);
                                            if (var49 == null) {
                                                continue;
                                            }
                                            int[] var50 = new int[3];
                                            var49.method2673(107, var48, var50, var47);
                                            if (var50 != null) {
                                                if (class35.field515.method1970(true, 82) && class257.field3562 > 0) {
                                                    class72.method501((byte) 110, var50[1], var50[2], var50[0]);
                                                    continue;
                                                }
                                                class208.field2874 = true;
                                                class406.field6160 = var50[0];
                                                class112.field1567 = var50[1];
                                                class81.field1185 = var50[2];
                                            }
                                            class268.field3734 = 1;
                                            class92.field1366 = false;
                                            class290.field4238 = class502.field7404.method2323((byte) -97);
                                            class350.field5395 = class502.field7404.method2325(112);
                                            continue;
                                        }
                                        if (var22 && class268.field3734 > 0) {
                                            if (class268.field3734 == 1 && (class290.field4238 != class502.field7404.method2323((byte) -107) || class350.field5395 != class502.field7404.method2325(110))) {
                                                class49.field699 = class267.field3712;
                                                class315.field4590 = class253.field3514;
                                                class268.field3734 = 2;
                                            }
                                            if (class268.field3734 == 2) {
                                                class92.field1366 = true;
                                                class337.method2178(-1, class49.field699 + (int) ((double) (class290.field4238 - class502.field7404.method2323((byte) -99)) * 2.0D / (double) class12.field224));
                                                class113.method701(class315.field4590 - (int) ((double) (class350.field5395 - class502.field7404.method2325(-113)) * 2.0D / (double) class12.field224), (byte) 1);
                                            }
                                            continue;
                                        }
                                        if (class268.field3734 > 0 && !class92.field1366) {
                                            if ((class259.field3661 == 1 || class301.method1909(-74)) && class367.field5621 > 2) {
                                                class482.method2896(class290.field4238, class350.field5395, 24177);
                                            } else if (class301.method1912(2)) {
                                                class482.method2896(class290.field4238, class350.field5395, 24177);
                                            }
                                        }
                                        class268.field3734 = 0;
                                        continue;
                                    }
                                    if (class480.field7091 == var11.field4014) {
                                        if (var22) {
                                            class536.method3169((byte) -42, class502.field7404.method2325(-115) - var13, class502.field7404.method2323((byte) -103) - var12, var11.field3991, var11.field4043);
                                        }
                                        continue;
                                    }
                                    if (class139.field1855 == var11.field4014) {
                                        class453.method2763(var13, 4, var12, var11);
                                        continue;
                                    }
                                }
                                if (!var11.field4026 && var23) {
                                    var11.field4026 = true;
                                    if (var11.field4111 != null) {
                                        class143 var51 = new class143();
                                        var51.field1904 = true;
                                        var51.field1903 = var11;
                                        var51.field1905 = var24.method1571(true) - var12;
                                        var51.field1902 = var24.method1567(-20707) - var13;
                                        var51.field1912 = var11.field4111;
                                        class518.field7619.method453((byte) 111, var51);
                                    }
                                }
                                if (var11.field4026 && var22 && var11.field4055 != null) {
                                    class143 var52 = new class143();
                                    var52.field1904 = true;
                                    var52.field1903 = var11;
                                    var52.field1905 = class502.field7404.method2323((byte) -90) - var12;
                                    var52.field1902 = class502.field7404.method2325(-107) - var13;
                                    var52.field1912 = var11.field4055;
                                    class518.field7619.method453((byte) 109, var52);
                                }
                                if (var11.field4026 && !var22) {
                                    var11.field4026 = false;
                                    if (var11.field4030 != null) {
                                        class143 var53 = new class143();
                                        var53.field1904 = true;
                                        var53.field1903 = var11;
                                        var53.field1905 = class502.field7404.method2323((byte) -92) - var12;
                                        var53.field1902 = class502.field7404.method2325(-109) - var13;
                                        var53.field1912 = var11.field4030;
                                        class389.field5942.method453((byte) 114, var53);
                                    }
                                }
                                if (var22 && var11.field4076 != null) {
                                    class143 var54 = new class143();
                                    var54.field1904 = true;
                                    var54.field1903 = var11;
                                    var54.field1905 = class502.field7404.method2323((byte) -118) - var12;
                                    var54.field1902 = class502.field7404.method2325(-110) - var13;
                                    var54.field1912 = var11.field4076;
                                    class518.field7619.method453((byte) 122, var54);
                                }
                                if (!var11.field4112 && var21) {
                                    var11.field4112 = true;
                                    if (var11.field4107 != null) {
                                        class143 var55 = new class143();
                                        var55.field1904 = true;
                                        var55.field1903 = var11;
                                        var55.field1905 = class502.field7404.method2323((byte) -99) - var12;
                                        var55.field1902 = class502.field7404.method2325(85) - var13;
                                        var55.field1912 = var11.field4107;
                                        class518.field7619.method453((byte) 127, var55);
                                    }
                                }
                                if (var11.field4112 && var21 && var11.field3998 != null) {
                                    class143 var56 = new class143();
                                    var56.field1904 = true;
                                    var56.field1903 = var11;
                                    var56.field1905 = class502.field7404.method2323((byte) -90) - var12;
                                    var56.field1902 = class502.field7404.method2325(-109) - var13;
                                    var56.field1912 = var11.field3998;
                                    class518.field7619.method453((byte) 104, var56);
                                }
                                if (var11.field4112 && !var21) {
                                    var11.field4112 = false;
                                    if (var11.field4145 != null) {
                                        class143 var57 = new class143();
                                        var57.field1904 = true;
                                        var57.field1903 = var11;
                                        var57.field1905 = class502.field7404.method2323((byte) -84) - var12;
                                        var57.field1902 = class502.field7404.method2325(-108) - var13;
                                        var57.field1912 = var11.field4145;
                                        class389.field5942.method453((byte) 113, var57);
                                    }
                                }
                                if (var11.field4087 != null) {
                                    class143 var58 = new class143();
                                    var58.field1903 = var11;
                                    var58.field1912 = var11.field4087;
                                    class48.field694.method453((byte) 119, var58);
                                }
                                if (var11.field4019 != null && class256.field3540 > var11.field3990) {
                                    if (var11.field4049 == null || class256.field3540 - var11.field3990 > 32) {
                                        class143 var63 = new class143();
                                        var63.field1903 = var11;
                                        var63.field1912 = var11.field4019;
                                        class518.field7619.method453((byte) 116, var63);
                                    } else {
                                        label691: for (int var59 = var11.field3990; var59 < class256.field3540; var59++) {
                                            int var60 = class250.field3475[var59 & 0x1F];
                                            for (int var61 = 0; var61 < var11.field4049.length; var61++) {
                                                if (var11.field4049[var61] == var60) {
                                                    class143 var62 = new class143();
                                                    var62.field1903 = var11;
                                                    var62.field1912 = var11.field4019;
                                                    class518.field7619.method453((byte) 107, var62);
                                                    break label691;
                                                }
                                            }
                                        }
                                    }
                                    var11.field3990 = class256.field3540;
                                }
                                if (var11.field4037 != null && class235.field3330 > var11.field4054) {
                                    if (var11.field4106 == null || class235.field3330 - var11.field4054 > 32) {
                                        class143 var68 = new class143();
                                        var68.field1903 = var11;
                                        var68.field1912 = var11.field4037;
                                        class518.field7619.method453((byte) 121, var68);
                                    } else {
                                        label667: for (int var64 = var11.field4054; var64 < class235.field3330; var64++) {
                                            int var65 = class174.field2335[var64 & 0x1F];
                                            for (int var66 = 0; var66 < var11.field4106.length; var66++) {
                                                if (var11.field4106[var66] == var65) {
                                                    class143 var67 = new class143();
                                                    var67.field1903 = var11;
                                                    var67.field1912 = var11.field4037;
                                                    class518.field7619.method453((byte) 124, var67);
                                                    break label667;
                                                }
                                            }
                                        }
                                    }
                                    var11.field4054 = class235.field3330;
                                }
                                if (var11.field4147 != null && class221.field3084 > var11.field4023) {
                                    if (var11.field4094 == null || class221.field3084 - var11.field4023 > 32) {
                                        class143 var73 = new class143();
                                        var73.field1903 = var11;
                                        var73.field1912 = var11.field4147;
                                        class518.field7619.method453((byte) 105, var73);
                                    } else {
                                        label643: for (int var69 = var11.field4023; var69 < class221.field3084; var69++) {
                                            int var70 = class283.field4157[var69 & 0x1F];
                                            for (int var71 = 0; var71 < var11.field4094.length; var71++) {
                                                if (var11.field4094[var71] == var70) {
                                                    class143 var72 = new class143();
                                                    var72.field1903 = var11;
                                                    var72.field1912 = var11.field4147;
                                                    class518.field7619.method453((byte) 112, var72);
                                                    break label643;
                                                }
                                            }
                                        }
                                    }
                                    var11.field4023 = class221.field3084;
                                }
                                if (var11.field3999 != null && class246.field3446 > var11.field4052) {
                                    if (var11.field4008 == null || class246.field3446 - var11.field4052 > 32) {
                                        class143 var78 = new class143();
                                        var78.field1903 = var11;
                                        var78.field1912 = var11.field3999;
                                        class518.field7619.method453((byte) 104, var78);
                                    } else {
                                        label619: for (int var74 = var11.field4052; var74 < class246.field3446; var74++) {
                                            int var75 = class313.field4573[var74 & 0x1F];
                                            for (int var76 = 0; var76 < var11.field4008.length; var76++) {
                                                if (var11.field4008[var76] == var75) {
                                                    class143 var77 = new class143();
                                                    var77.field1903 = var11;
                                                    var77.field1912 = var11.field3999;
                                                    class518.field7619.method453((byte) 112, var77);
                                                    break label619;
                                                }
                                            }
                                        }
                                    }
                                    var11.field4052 = class246.field3446;
                                }
                                if (var11.field4064 != null && class514.field7553 > var11.field4072) {
                                    if (var11.field4036 == null || class514.field7553 - var11.field4072 > 32) {
                                        class143 var83 = new class143();
                                        var83.field1903 = var11;
                                        var83.field1912 = var11.field4064;
                                        class518.field7619.method453((byte) 117, var83);
                                    } else {
                                        label595: for (int var79 = var11.field4072; var79 < class514.field7553; var79++) {
                                            int var80 = class443.field6673[var79 & 0x1F];
                                            for (int var81 = 0; var81 < var11.field4036.length; var81++) {
                                                if (var11.field4036[var81] == var80) {
                                                    class143 var82 = new class143();
                                                    var82.field1903 = var11;
                                                    var82.field1912 = var11.field4064;
                                                    class518.field7619.method453((byte) 111, var82);
                                                    break label595;
                                                }
                                            }
                                        }
                                    }
                                    var11.field4072 = class514.field7553;
                                }
                                if (class139.field1854 > var11.field4062 && var11.field4056 != null) {
                                    class143 var84 = new class143();
                                    var84.field1903 = var11;
                                    var84.field1912 = var11.field4056;
                                    class518.field7619.method453((byte) 106, var84);
                                }
                                if (class114.field1586 > var11.field4062 && var11.field4082 != null) {
                                    class143 var85 = new class143();
                                    var85.field1903 = var11;
                                    var85.field1912 = var11.field4082;
                                    class518.field7619.method453((byte) 118, var85);
                                }
                                if (class156.field2026 > var11.field4062 && var11.field4089 != null) {
                                    class143 var86 = new class143();
                                    var86.field1903 = var11;
                                    var86.field1912 = var11.field4089;
                                    class518.field7619.method453((byte) 112, var86);
                                }
                                if (class273.field3802 > var11.field4062 && var11.field4048 != null) {
                                    class143 var87 = new class143();
                                    var87.field1903 = var11;
                                    var87.field1912 = var11.field4048;
                                    class518.field7619.method453((byte) 110, var87);
                                }
                                if (class402.field6122 > var11.field4062 && var11.field4027 != null) {
                                    class143 var88 = new class143();
                                    var88.field1903 = var11;
                                    var88.field1912 = var11.field4027;
                                    class518.field7619.method453((byte) 108, var88);
                                }
                                var11.field4062 = class145.field1932;
                                if (var11.field4083 != null) {
                                    for (int var89 = 0; var89 < class508.field7478; var89++) {
                                        class143 var90 = new class143();
                                        var90.field1903 = var11;
                                        var90.field1909 = class492.field7261[var89].method348((byte) 120);
                                        var90.field1900 = class492.field7261[var89].method345(-20326);
                                        var90.field1912 = var11.field4083;
                                        class518.field7619.method453((byte) 106, var90);
                                    }
                                }
                                if (class385.field5849 && var11.field4057 != null) {
                                    class143 var91 = new class143();
                                    var91.field1903 = var11;
                                    var91.field1912 = var11.field4057;
                                    class518.field7619.method453((byte) 110, var91);
                                }
                            }
                            if (var11.field4103 == 5 && var11.field4117 != -1) {
                                var11.method1818(class332.field5172, class182.field2469, -1523973488).method483(var11.field4043, 42, class400.field6090);
                            }
                            class539.method3183(var11, 5);
                            if (var11.field4103 == 0) {
                                method1341(arg0, var11.field4029, var14, var15, var16, var17, var12 - var11.field4091, var13 - var11.field4129, arg8, arg9);
                                if (var11.field4108 != null) {
                                    method1341(var11.field4108, var11.field4029, var14, var15, var16, var17, var12 - var11.field4091, var13 - var11.field4129, arg8, arg9);
                                }
                                class436 var92 = (class436) class312.field4570.method1747((long) var11.field4029, false);
                                if (var92 != null) {
                                    if (class67.field957 == class41.field603 && var92.field6603 == 0 && !class139.field1850 && var21 && !class215.field3038) {
                                        class47.method368((byte) -106);
                                    }
                                    class412.method2537(var17, var13, var15, var16, arg8, arg9, var92.field6598, var14, (byte) -127, var12);
                                }
                            }
                        }
                    }
                } else if (var14 < var16 && var15 < var17) {
                    class539.method3183(var11, 5);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Lga;)Lga;", line = 2467)
    public static final class282 method1342(class282 arg0) {
        int var1 = method1348(arg0).method2700(2063986);
        if (var1 == 0) {
            return null;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            arg0 = class21.method194(-123, arg0.field4122);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "([BI)V", line = 2489)
    private final void method1343(byte[] arg0, int arg1) {
        if (arg1 != 5) {
            field2675 = null;
        }
        field2666++;
        class164 var3 = new class164(arg0);
        while (true) {
            while (true) {
                while (true) {
                    int var4 = var3.method1087(false);
                    if (var4 == 0) {
                        return;
                    }
                    if (var4 == 1) {
                        int[] var9 = class394.field6030 = new int[6];
                        var9[0] = var3.method1074(-635989152);
                        var9[1] = var3.method1074(-635989152);
                        var9[2] = var3.method1074(arg1 - 635989157);
                        var9[3] = var3.method1074(class28.method251(arg1, -635989147));
                        var9[4] = var3.method1074(-635989152);
                        var9[5] = var3.method1074(-635989152);
                    } else if (var4 == 4) {
                        int var5 = var3.method1087(false);
                        class75.field1096 = new int[var5];
                        for (int var6 = 0; var6 < var5; var6++) {
                            class75.field1096[var6] = var3.method1074(-635989152);
                            if (class75.field1096[var6] == 65535) {
                                class75.field1096[var6] = -1;
                            }
                        }
                    } else if (var4 == 5) {
                        int var7 = var3.method1087(false);
                        class492.field7256 = new int[var7];
                        for (int var8 = 0; var8 < var7; var8++) {
                            class492.field7256[var8] = var3.method1074(-635989152);
                            if (class492.field7256[var8] == 65535) {
                                class492.field7256[var8] = -1;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V", line = 2569)
    public static final void method1344(int arg0) {
        int var1 = class20.field310;
        int[] var2 = class55.field778;
        int var3 = class429.field6521 ? var1 : class333.field5187 + var1;
        for (int var4 = 0; var4 < var3; var4++) {
            class275 var5;
            if (var4 < var1) {
                var5 = class241.field3398[var2[var4]];
            } else {
                var5 = ((class24) class406.field6158.method1747((long) class224.field3114[var4 - var1], false)).field348;
            }
            if (var5.field1866 == arg0) {
                var5.field3900 = 0;
                if (var5.field3853 < 0) {
                    var5.field3884 = false;
                } else {
                    int var6 = var5.method637((byte) -104);
                    if ((var6 & 0x1) == 0) {
                        if ((var5.field1867 & 0x7F) != 0 || (var5.field1862 & 0x7F) != 0) {
                            var5.field3884 = false;
                            continue;
                        }
                    } else if ((var5.field1867 & 0x7F) != 64 || (var5.field1862 & 0x7F) != 64) {
                        var5.field3884 = false;
                        continue;
                    }
                    int var10002;
                    if (var6 == 1) {
                        int var7 = var5.field1867 >> 7;
                        int var8 = var5.field1862 >> 7;
                        if (class309.field4506[var7][var8] != var5.field3853) {
                            var5.field3884 = true;
                            continue;
                        }
                        if (class73.field1008[var7][var8] > 1) {
                            var10002 = class73.field1008[var7][var8]--;
                            var5.field3884 = true;
                            continue;
                        }
                    } else {
                        int var9 = (var6 - 1) * 64 + 60;
                        int var10 = var5.field1867 - var9 >> 7;
                        int var11 = var5.field1862 - var9 >> 7;
                        int var12 = var5.field1867 + var9 >> 7;
                        int var13 = var5.field1862 + var9 >> 7;
                        if (!class10.method101(var12, var10, var13, var11, (byte) -111, var5.field3853)) {
                            for (int var14 = var10; var14 <= var12; var14++) {
                                for (int var15 = var11; var15 <= var13; var15++) {
                                    if (class309.field4506[var14][var15] == var5.field3853) {
                                        var10002 = class73.field1008[var14][var15]--;
                                    }
                                }
                            }
                            var5.field3884 = true;
                            continue;
                        }
                    }
                    if (var5 instanceof class96 && var5.field3909 != null && class393.field6017 >= var5.field3909.field4180 && class393.field6017 < var5.field3909.field4188) {
                        ((class96) var5).field1415 = false;
                    }
                    var5.field3884 = false;
                    var5.field1873 = class352.method2264(-100, var5.field1866, var5.field1862, var5.field1867);
                    class525.method3110(var5, true);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V", line = 2687)
    public static final void method1345(int arg0) {
        int var1 = class20.field310;
        int[] var2 = class55.field778;
        for (int var3 = 0; var3 < class333.field5187 + var1; var3++) {
            class275 var4;
            if (var3 < var1) {
                var4 = class241.field3398[var2[var3]];
            } else {
                var4 = ((class24) class406.field6158.method1747((long) class224.field3114[var3 - var1], false)).field348;
            }
            if (var4.field1866 == arg0 && var4.field3853 >= 0) {
                int var5 = var4.method637((byte) -108);
                if ((var5 & 0x1) == 0) {
                    if ((var4.field1867 & 0x7F) != 0 || (var4.field1862 & 0x7F) != 0) {
                        continue;
                    }
                } else if ((var4.field1867 & 0x7F) != 64 || (var4.field1862 & 0x7F) != 64) {
                    continue;
                }
                int var10002;
                if (var5 == 1) {
                    int var6 = var4.field1867 >> 7;
                    int var7 = var4.field1862 >> 7;
                    if (var4.field3853 > class309.field4506[var6][var7]) {
                        class309.field4506[var6][var7] = var4.field3853;
                        class73.field1008[var6][var7] = 1;
                    } else if (class309.field4506[var6][var7] == var4.field3853) {
                        var10002 = class73.field1008[var6][var7]++;
                    }
                } else {
                    int var8 = (var5 - 1) * 64 + 60;
                    int var9 = var4.field1867 - var8 >> 7;
                    int var10 = var4.field1862 - var8 >> 7;
                    int var11 = var4.field1867 + var8 >> 7;
                    int var12 = var4.field1862 + var8 >> 7;
                    for (int var13 = var9; var13 <= var11; var13++) {
                        for (int var14 = var10; var14 <= var12; var14++) {
                            if (var4.field3853 > class309.field4506[var13][var14]) {
                                class309.field4506[var13][var14] = var4.field3853;
                                class73.field1008[var13][var14] = 1;
                            } else if (class309.field4506[var13][var14] == var4.field3853) {
                                var10002 = class73.field1008[var13][var14]++;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "l", descriptor = "(I)V", line = 2784)
    private final void method1346(int arg0) {
        field2674++;
        if (arg0 == -23343) {
            boolean var2 = class13.field258.method888(51);
            if (!var2) {
                this.method1336((byte) 118);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "init", descriptor = "()V", line = 2802)
    public final void init() {
        field2664++;
        if (!this.method3136(-1)) {
            return;
        }
        class506.field7448 = new class195();
        class506.field7448.field2602 = Integer.parseInt(this.getParameter("worldid"));
        class355.field5495 = new class195();
        class355.field5495.field2602 = Integer.parseInt(this.getParameter("lobbyid"));
        class355.field5495.field2603 = this.getParameter("lobbyaddress");
        class501.field7397 = new class195();
        class501.field7397.field2602 = Integer.parseInt(this.getParameter("demoid"));
        class501.field7397.field2603 = this.getParameter("demoaddress");
        class116.field1601 = class502.method3009(false, Integer.parseInt(this.getParameter("modewhere")));
        if (!class33.method287(122, class116.field1601) && class476.field7072 != class116.field1601) {
            class116.field1601 = class476.field7072;
        }
        class154.field2011 = class524.method3109(0, Integer.parseInt(this.getParameter("modewhat")));
        if (class154.field2011 != class112.field1566 && class226.field3200 != class154.field2011 && class154.field2011 != class131.field1768) {
            class154.field2011 = class131.field1768;
        }
        try {
            class257.field3556 = Integer.parseInt(this.getParameter("lang"));
        } catch (Exception var9) {
            class257.field3556 = 0;
        }
        String var1 = this.getParameter("objecttag");
        if (var1 != null && var1.equals("1")) {
            class37.field529 = true;
        } else {
            class37.field529 = false;
        }
        String var2 = this.getParameter("js");
        if (var2 != null && var2.equals("1")) {
            class211.field2989 = true;
        } else {
            class211.field2989 = false;
        }
        String var3 = this.getParameter("advert");
        if (var3 != null && var3.equals("1")) {
            class322.field4669 = true;
        } else {
            class322.field4669 = false;
        }
        String var4 = this.getParameter("game");
        if (var4 != null) {
            if (var4.equals("0")) {
                class67.field957 = class41.field603;
            } else if (var4.equals("1")) {
                class67.field957 = class249.field3474;
            }
        }
        try {
            class331.field5167 = Integer.parseInt(this.getParameter("affid"));
        } catch (Exception var8) {
            class331.field5167 = 0;
        }
        class448.field6747 = this.getParameter("quiturl");
        class407.field6188 = this.getParameter("settings");
        if (class407.field6188 == null) {
            class407.field6188 = "";
        }
        String var5 = this.getParameter("country");
        if (var5 != null) {
            try {
                class56.field804 = Integer.parseInt(var5);
            } catch (Exception var7) {
                class56.field804 = 0;
            }
        }
        class525.field7712 = Integer.parseInt(this.getParameter("colourid"));
        if (class525.field7712 < 0 || class525.field7712 >= class322.field4670.length) {
            class525.field7712 = 0;
        }
        if (Integer.parseInt(this.getParameter("sitesettings_member")) == 1) {
            class136.field1818 = true;
            class335.field5203 = true;
        }
        String var6 = this.getParameter("frombilling");
        if (var6 != null && var6.equals("true")) {
            class89.field1287 = true;
        }
        if (class67.field957 == class41.field603) {
            class162.field2117 = 765;
            class533.field7843 = 503;
        } else if (class67.field957 == class249.field3474) {
            class162.field2117 = 640;
            class533.field7843 = 480;
        }
        class168.field2261 = this;
        this.method3134((byte) 86, class533.field7843, class154.field2011.method660(65) + 32, 603, class162.field2117);
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Z)V", line = 2917)
    public static void method1347(boolean arg0) {
        field2673 = null;
        field2675 = null;
        field2676 = null;
        field2680 = null;
        if (!arg0) {
            field2676 = null;
        }
        field2679 = null;
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Lga;)Ltl;", line = 2935)
    public static final class445 method1348(class282 arg0) {
        class445 var1 = (class445) class385.field5845.method1747(((long) arg0.field4029 << 32) + (long) arg0.field4031, false);
        return var1 == null ? arg0.field4028 : var1;
    }

    @OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V", line = 2940)
    public static final void main(String[] arg0) {
        field2657++;
        try {
            if (arg0.length != 6) {
                class268.method1724("Argument count", (byte) -58);
            }
            class506.field7448 = new class195();
            class506.field7448.field2602 = Integer.parseInt(arg0[0]);
            class355.field5495 = new class195();
            class355.field5495.field2602 = Integer.parseInt(arg0[1]);
            class501.field7397 = new class195();
            class501.field7397.field2602 = Integer.parseInt(arg0[2]);
            class116.field1601 = class351.field5406;
            if (arg0[3].equals("live")) {
                class154.field2011 = class131.field1768;
            } else if (arg0[3].equals("rc")) {
                class154.field2011 = class226.field3200;
            } else if (arg0[3].equals("wip")) {
                class154.field2011 = class112.field1566;
            } else {
                class268.method1724("modewhat", (byte) -58);
            }
            class257.field3556 = class522.method3099(arg0[4], 0);
            if (class257.field3556 == -1) {
                if (arg0[4].equals("english")) {
                    class257.field3556 = 0;
                } else if (arg0[4].equals("german")) {
                    class257.field3556 = 1;
                } else {
                    class268.method1724("language", (byte) -58);
                }
            }
            class211.field2989 = false;
            class37.field529 = false;
            if (arg0[5].equals("game0")) {
                class67.field957 = class41.field603;
            } else if (arg0[5].equals("game1")) {
                class67.field957 = class249.field3474;
            } else {
                class268.method1724("game", (byte) -58);
            }
            class407.field6188 = "";
            class331.field5167 = 0;
            class136.field1818 = true;
            class335.field5203 = true;
            class56.field804 = 0;
            class525.field7712 = class67.field957.field930;
            class89.field1287 = false;
            client var1 = new client();
            class168.field2261 = var1;
            var1.method3132(class154.field2011.method660(47) + 32, 768, -113, 1024, class67.field957.field933, 603, 30, false);
            class286.field4195.setLocation(40, 40);
        } catch (Exception var3) {
            class395.method2457(null, var3, 1);
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V", line = 3012)
    public final void method1349(int arg0) {
        field2667++;
        if (class378.field5771 == 2) {
            try {
                this.method1353(-168);
            } catch (Throwable var3) {
                class395.method2457(var3.getMessage() + " (Recovered) " + this.method1350(32), var3, 1);
                class170.method1152(106, 0);
            }
        } else {
            this.method1353(-168);
        }
        if (arg0 >= -63) {
            field2673 = null;
        }
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(I)Ljava/lang/String;", line = 3035)
    public final String method1350(int arg0) {
        field2660++;
        String var2 = null;
        try {
            var2 = "[1)" + class331.field5162 + "," + class328.field5099 + "," + class398.field6071 + "," + class528.field7734 + "|";
            if (class56.field800 != null) {
                var2 = var2 + "2)" + class367.field5618 + "," + (class56.field800.field3917[0] + class331.field5162) + "," + (class56.field800.field3915[0] + class328.field5099) + "|";
            }
            var2 = var2 + "3)" + class378.field5771 + "|4)" + class203.field2716.field1150 + "|5)" + class325.method2014((byte) 68) + "|6)" + class147.field1961 + "," + class107.field1525 + "|";
            var2 = var2 + "7)" + class203.field2716.method549((byte) -123, class378.field5771) + "|";
            var2 = var2 + "8)" + class203.field2716.method552(-4, class378.field5771) + "|";
            var2 = var2 + "9)" + class203.field2716.field1165 + "|";
            var2 = var2 + "10)" + class203.field2716.field1181 + "|";
            var2 = var2 + "11)" + class203.field2716.field1149 + "|";
            var2 = var2 + "12)" + class203.field2716.method15(class378.field5771, arg0 - 32) + "|";
            var2 = var2 + "13)" + class230.field3289 + "|";
            var2 = var2 + "14)" + class435.field6596;
            try {
                var2 = var2 + "|15)" + jagmisc.getTotalPhysicalMemory();
            } catch (Throwable var15) {
            }
            try {
                if (arg0 != 32) {
                    return null;
                }
                if (class378.field5771 == 2) {
                    Class var3 = Class.forName("java.lang.ClassLoader");
                    Field var4 = var3.getDeclaredField("nativeLibraries");
                    Class var5 = Class.forName("java.lang.reflect.AccessibleObject");
                    Method var6 = var5.getDeclaredMethod("setAccessible", Boolean.TYPE);
                    var6.invoke(var4, Boolean.TRUE);
                    Vector var7 = (Vector) var4.get((field2681 == null ? (field2681 = method1355("client")) : field2681).getClassLoader());
                    for (int var8 = 0; var7.size() > var8; var8++) {
                        try {
                            Object var9 = var7.elementAt(var8);
                            Field var10 = var9.getClass().getDeclaredField("name");
                            var6.invoke(var10, Boolean.TRUE);
                            try {
                                String var11 = (String) var10.get(var9);
                                if (var11 != null && var11.indexOf("sw3d.dll") != -1) {
                                    Field var12 = var9.getClass().getDeclaredField("handle");
                                    var6.invoke(var12, Boolean.TRUE);
                                    var2 = var2 + "|16)" + Long.toHexString(var12.getLong(var9));
                                    var6.invoke(var12, Boolean.FALSE);
                                }
                            } catch (Throwable var13) {
                            }
                            var6.invoke(var10, Boolean.FALSE);
                        } catch (Throwable var14) {
                        }
                    }
                }
            } catch (Throwable var16) {
            }
            var2 = var2 + "]";
        } catch (Throwable var17) {
        }
        return var2;
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(I)V", line = 3119)
    public final void method1351(int arg0) {
        method1347(true);
        field2661++;
        class526.method3115((byte) 23);
        class509.method3050((byte) 88);
        class177.method1187((byte) -122);
        class446.method2704(-93);
        class257.method1652(-26944);
        class313.method1974(100);
        class448.method2738((byte) -2);
        class259.method1670(1);
        class114.method704((byte) 104);
        class5.method23(5867);
        class428.method2610(-11117);
        class272.method1746((byte) -117);
        class530.method3131(-15604);
        class424.method2584(0);
        class101.method661((byte) -115);
        class77.method536(31640);
        class65.method464(false);
        class14.method144(789221);
        class165.method1127((byte) 119);
        class4.method17(127);
        class83.method570((byte) -59);
        class63.method454((byte) 119);
        class125.method861((byte) -20);
        class131.method898((byte) -110);
        class532.method3147((byte) 29);
        class502.method3010((byte) -103);
        class516.method3085(-2);
        class211.method1455(4);
        class330.method2141(0);
        class233.method1558((byte) -37);
        class496.method2965(false);
        class139.method934((byte) -48);
        class134.method912(false);
        class144.method961(-80);
        class208.method1429(3);
        class214.method1471(858993459);
        class336.method2174((byte) -100);
        class293.method1870(-86);
        class289.method1854((byte) -113);
        class147.method978(-24081);
        class251.method1624(0);
        class244.method1594((byte) 120);
        class240.method1582(19);
        class70.method488(150);
        class342.method2210(0);
        class355.method2280(125);
        class475.method2829(false);
        class126.method863((byte) 62);
        class359.method2296(124);
        class61.method436(false);
        class21.method196(-1116);
        class493.method2939(false);
        class152.method992((byte) 31);
        class24.method225(-30814);
        class443.method2691((byte) 90);
        class141.method948(-59);
        class319.method1994((byte) -23);
        class431.method2636((byte) 103);
        class365.method2329(194);
        class181.method1218((byte) -62);
        class441.method2667(59);
        class146.method969((byte) -27);
        class507.method3042(3);
        class282.method1816((byte) 127);
        class62.method443((byte) 73);
        class96.method638(-31821);
        class221.method1490(true);
        class476.method2838(6017);
        class212.method1460(true);
        class164.method1107(-120);
        class275.method1765((byte) 72);
        class268.method1716(true);
        class452.method2755(29898);
        class254.method1647(30);
        class119.method730((byte) 30);
        class274.method1758(-128);
        class17.method169((byte) 72);
        class436.method2651((byte) -20);
        class445.method2695(-127);
        class367.method2338((byte) 90);
        class132.method903((byte) 11);
        class133.method905(31931);
        class306.method1921(26005);
        class199.method1324(4);
        class225.method1507(115);
        class176.method1182(-81);
        class203.method1376((byte) 82);
        class427.method2605((byte) -112);
        class478.method2844((byte) -69);
        class224.method1506((byte) -84);
        class412.method2539(0);
        class250.method1619(87);
        class195.method1318(20634);
        class78.method537(-3);
        class304.method1917(11014);
        class135.method913(-111);
        class457.method2774((byte) -69);
        class67.method477(false);
        class81.method548((byte) -47);
        class405.method2505(125);
        class425.method2592((byte) 114);
        class91.method613((byte) -103);
        class389.method2437(-1);
        class334.method2162(28755);
        class151.method986(1011);
        class539.method3184(-10);
        class522.method3101(7);
        class387.method2418((byte) 4);
        class404.method2489(6);
        class23.method214((byte) -108);
        class74.method517(15812);
        class30.method265((byte) 126);
        class198.method1321(15);
        class82.method555(false);
        class137.method924(128);
        class315.method1981(1);
        class206.method1410(32537);
        class55.method406(256);
        class153.method996(16);
        class525.method3112(-26);
        class150.method984(-1293);
        class375.method2362(27338);
        class449.method2741((byte) 21);
        class37.method316((byte) 61);
        class540.method3189(true);
        class95.method633(255);
        class323.method2009(11077);
        class9.method99(53);
        class140.method939(5);
        class444.method2694(false);
        class437.method2655((byte) -67);
        class156.method1004(29753);
        class228.method1535();
        class286.method1837(true);
        class178.method1198(-1);
        class241.method1585((byte) 124);
        class390.method2439(115);
        class426.method2601((byte) 98);
        class106.method680(125);
        class343.method2225();
        class12.method123();
        class72.method499((byte) 91);
        class484.method2902(true);
        class117.method724();
        class162.method1044(-115);
        class38.method327((byte) 99);
        class430.method2627(100);
        class175.method1179((byte) 124);
        class350.method2254(68);
        class487.method2914((byte) 25);
        class107.method686(0);
        class180.method1203((byte) 119);
        class205.method1381(5);
        class136.method918((byte) -15);
        class380.method2385((byte) -120);
        class459.method2782(8836);
        class47.method365(9);
        class333.method2151(45);
        class120.method734((byte) 106);
        class310.method1943((byte) -54);
        class347.method2243(0);
        class85.method584(-101);
        class506.method3035((byte) 111);
        class11.method106((byte) 118);
        class515.method3077((byte) 126);
        class145.method964(false);
        class324.method2011(true);
        class174.method1176(true);
        class461.method2786(-45091101);
        class215.method1476(-25067);
        class84.method579((byte) -102);
        class182.method1231(0);
        class187.method1254(-32297);
        class10.method103(8);
        class480.method2849(-30452);
        class169.method1143();
        class36.method315((byte) 30);
        class80.method546(-1);
        class18.method183(-12054);
        class454.method2764(false);
        class186.method1252((byte) 124);
        class143.method957((byte) 26);
        class508.method3049((byte) 73);
        class346.method2241((byte) 22);
        class295.method1885(-27832);
        class370.method2347(10);
        class394.method2452((byte) -107);
        class113.method703(121);
        class535.method3163((byte) -70);
        class222.method1501(true);
        class384.method2404(-1);
        class166.method1131(99);
        class423.method2580((byte) 114);
        class167.method1132((byte) -15);
        class172.method1168(2);
        class94.method628((byte) 71);
        class492.method2935(122);
        class179.method1199(-19495);
        class284.method1824(-83);
        class291.method1863(true);
        class317.method1988(-300);
        class296.method1891(-58);
        class8.method95(-1);
        class514.method3068((byte) -72);
        class2.method7(-1);
        class402.method2482(-18341);
        class279.method1791((byte) 61);
        class318.method1989(27477);
        class467.method2805(0);
        class311.method1962(76);
        class400.method2477((byte) -31);
        class247.method1607(true);
        class90.method608((byte) -97);
        class13.method139(0);
        class521.method3096(-113);
        class33.method286((byte) 53);
        class520.method3094((byte) 113);
        class41.method335(14145);
        class501.method3004(0);
        class455.method2770(0);
        class393.method2450(106);
        class161.method1040();
        class392.method2444(-15784);
        class531.method3142((byte) 17);
        class451.method2751(0);
        class429.method2620(2);
        class271.method1740((byte) -114);
        class280.method1794((byte) 29);
        class102.method667(32018);
        class458.method2775(-1180);
        class239.method1573(0);
        class434.method2644(true);
        class495.method2957();
        class309.method1937((byte) -101);
        class294.method1878(35);
        class292.method1866(8839);
        class518.method3090((byte) 72);
        class308.method1933((byte) 95);
        class64.method460(-31996);
        class163.method1049(131072);
        class391.method2442((byte) -96);
        class159.method1033(false);
        class200.method1358(-1);
        class52.method387((byte) -100);
        class109.method689(0);
        class361.method2305(false);
        class322.method2006(false);
        class345.method2233(0);
        class160.method1039(63);
        class344.method2228((byte) 119);
        class331.method2144((byte) 39);
        class406.method2507(-51);
        class35.method308((byte) -95);
        class398.method2465(-27958);
        class422.method2579(2);
        int var2 = -17 / ((arg0 + 55) / 46);
        class157.method1013();
        class482.method2894(121);
        class118.method726(-83);
        class494.method2940();
        class59.method431();
        class260.method1687();
        class537.method3171(8);
        class471.method2822(true);
        class262.method1693();
        class339.method2195(true);
        class462.method2795(4);
        class456.method2772(0);
        class285.method1826();
        class524.method3108(-90);
        class354.method2278((byte) 46);
        class409.method2521((byte) -109);
        class377.method2367(-1365235420);
        class48.method372((byte) 125);
        class383.method2401(124);
        class468.method2813(4964);
        class489.method2925(-10314);
        class56.method423(0);
        class154.method1000(30777);
        class269.method1729(1254335756);
        class183.method1242(-104);
        class325.method2016(-8082);
        class73.method504(false);
        class276.method1778(0);
        class89.method601((byte) -20);
        class381.method2398(-126);
        class416.method2549(-8208);
        class71.method495(0);
        class351.method2259(33985);
        class447.method2709(36160);
        class538.method3173(-1);
        class25.method228((byte) 122);
        class201.method1363((byte) -78);
        class116.method715(28034);
        class226.method1513(2);
        class129.method876(1);
        class283.method1820(60);
        class1.method3((byte) 26);
        class220.method1484();
        class112.method700((byte) 69);
        class523.method3106((byte) 66);
        class288.method1846((byte) 23);
        class204.method1377(true);
        class421.method2577((byte) 106);
        class374.method2357(81);
        class329.method2122(true);
        class127.method870(106);
        class301.method1910((byte) -11);
        class232.method1554((byte) 87);
        class465.method2799(0);
        class298.method1900((byte) -50);
        class332.method2147((byte) -91);
        class290.method1858(126);
        class149.method981(-93);
        class369.method2346(false);
        class388.method2436(true);
        class235.method1563((byte) -87);
        class45.method353(4096);
        class432.method2639(-103);
        class281.method1802((byte) 120);
        class321.method2002(126);
        class364.method2328((byte) 0);
        class88.method594((byte) 119);
        class92.method623((byte) -42);
        class263.method1697(-116);
        class31.method267((byte) 89);
        class46.method360((byte) 83);
        class513.method3063(0);
        class216.method1479(true);
        class511.method3056(-118);
        class420.method2564(false);
        class399.method2472();
        class6.method82();
        class270.method1736(51);
        class499.method2973(103);
        class99.method653((byte) 98);
        class414.method2547(0);
        class419.method2560(-31800);
        class395.method2454(false);
        class213.method1467(false);
        class300.method1907(5990);
        class142.method953(12);
        class439.method2659((byte) 87);
        class60.method435(true);
        class533.method3154(0);
        class86.method588(false);
        class373.method2356(-15417);
        class230.method1547(10148);
        class312.method1965((byte) 69);
        class168.method1139(-1);
        class184.method1243(1195);
        class111.method698(-24);
        class261.method1691(0);
        class110.method696((byte) 97);
        class407.method2517(120);
        class49.method376((byte) -86);
        class340.method2197(3);
        class278.method1788(2499);
        class397.method2461(74);
        class466.method2804(100);
        class352.method2261(35044);
        class66.method476((byte) 96);
        class26.method240(true);
        class385.method2408(1337);
        class410.method2528(-24);
        class348.method2248(1);
        class528.method3125((byte) 124);
        class44.method350(121);
        class418.method2558((byte) -97);
        class411.method2535(928);
        class273.method1752(-100);
        class473.method2825((byte) -95);
        class121.method736(-1);
        class7.method91(0);
        class103.method672(122);
        class173.method1173((byte) -21);
        class534.method3158(0);
        class453.method2759(0);
        class433.method2642((byte) -128);
        class491.method2932(25081);
        class510.method3052(true);
        class229.method1545(119);
        class529.method3128(false);
        class417.method2555(0);
        class536.method3168((byte) 101);
        class372.method2351(7);
        class490.method2928(-5);
        class75.method530(7055);
        class357.method2289((byte) 124);
        class266.method1704(false);
        class245.method1606(-22185);
        class264.method1702(94);
        class76.method533((byte) 126);
        class54.method396(121);
        class43.method349(54);
        class320.method1998(-68);
        class362.method2308(1);
        class249.method1612(1);
        class79.method541(15507);
        class360.method2298(false);
        class303.method1916(92);
        class382.method2400((byte) -27);
        class460.method2785((byte) -34);
        class22.method206((byte) 0);
        class256.method1650(-116);
        class474.method2828(113);
        class470.method2817(-1);
        class542.method3195(16);
        class236.method1566(-6522);
        class401.method2478(-105);
        class138.method929((byte) 48);
        class463.method2797((byte) -115);
        class248.method1610(false);
        class194.method1305((byte) -73);
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "()V", line = 3545)
    public static final void method1352() {
        for (int var0 = 0; var0 < class398.field6071; var0++) {
            int[] var1 = class309.field4506[var0];
            for (int var2 = 0; var2 < class528.field7734; var2++) {
                var1[var2] = 0;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "m", descriptor = "(I)V", line = 3564)
    private final void method1353(int arg0) {
        field2672++;
        if (class435.field6596 == 13) {
            return;
        }
        class393.field6017++;
        if (class393.field6017 % 1000 == 1) {
            GregorianCalendar var2 = new GregorianCalendar();
            class540.field7918 = var2.get(11) * 600 + var2.get(12) * 10 + var2.get(13) / 6;
            class286.field4197.setSeed((long) class540.field7918);
        }
        if ((class393.field6017 % 50) == 0) {
            class235.field3329 = class132.field1786;
            class352.field5445 = class184.field2500;
            class132.field1786 = 0;
            class184.field2500 = 0;
        }
        this.method1346(-23343);
        if (class175.field2340 != null) {
            class175.field2340.method3011((byte) 12);
        }
        class177.method1185(-112);
        class35.field515.method1972((byte) 26);
        class502.field7404.method2321(69);
        if (arg0 != -168) {
            field2676 = null;
        }
        if (class400.field6090 != null) {
            class400.field6090.method766((int) class58.method427((byte) -19));
        }
        class421.method2573(false);
        class508.field7478 = 0;
        class328.field5110 = 0;
        for (class438 var3 = class35.field515.method1969(32); var3 != null; var3 = class35.field515.method1969(32)) {
            int var6 = var3.method344((byte) -120);
            if (var6 == 2 || var6 == 3) {
                char var7 = var3.method345(-20326);
                if (class268.method1719(true) && (var7 == '`' || var7 == '§')) {
                    if (class195.method1313(arg0 + 166)) {
                        class289.method1855(9);
                    } else {
                        class205.method1380((byte) -126);
                    }
                } else if (class508.field7478 < 128) {
                    class492.field7261[class508.field7478] = var3;
                    class508.field7478++;
                }
            } else if (var6 == 0 && class328.field5110 < 75) {
                class460.field6890[class328.field5110] = var3;
                class328.field5110++;
            }
        }
        class322.field4674 = 0;
        for (class245 var4 = class502.field7404.method2319((byte) -72); var4 != null; var4 = class502.field7404.method2319((byte) 127)) {
            int var5 = var4.method1569(arg0 + 171);
            if (var5 == -1) {
                class324.field4684.method453((byte) 120, var4);
            } else if (var5 == 6) {
                class322.field4674 += var4.method1570(3);
            } else if (class339.method2193(var5, (byte) 50)) {
                class212.field3001.method453((byte) 118, var4);
                if (class212.field3001.method446(4090) > 10) {
                    class212.field3001.method447(8);
                }
            }
        }
        if (class195.method1313(-2)) {
            class345.method2237(arg0 ^ 0xFFFFFF58);
        }
        if (class435.field6596 == 0) {
            this.method1333((byte) 88);
            class140.method937(117);
        } else if (class435.field6596 == 1) {
            this.method1333((byte) 65);
            class140.method937(arg0 ^ 0xFFFFFF3A);
        } else if (class180.method1207(class435.field6596, -256)) {
            class308.method1932(0);
        }
        if (class92.method621(class435.field6596, -4) && !class180.method1207(class435.field6596, -256)) {
            this.method1340(1);
            class534.method3159(arg0 + 40);
            class301.method1908((byte) -10);
        } else if (class404.method2491(class435.field6596, -9) && !class180.method1207(class435.field6596, -256)) {
            this.method1340(1);
            class301.method1908((byte) -10);
        } else if (class435.field6596 == 11) {
            class301.method1908((byte) -10);
        } else if (class444.method2693(class435.field6596, false) && !class180.method1207(class435.field6596, -256)) {
            class55.method408(false);
        } else if (class435.field6596 == 12) {
            class301.method1908((byte) -10);
            if (class250.field3478 != -3 && class250.field3478 != 2 && class250.field3478 != 15) {
                class420.method2566(arg0 + 163, false);
            }
        }
        class233.method1559(89, class400.field6090);
        class212.field3001.method447(arg0 ^ 0xFFFFFF50);
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(B)V", line = 3734)
    public final void method1354(byte arg0) {
        if (arg0 <= 40) {
            field2680 = null;
        }
        field2668++;
        Frame var2 = new Frame("Jagex");
        var2.pack();
        var2.dispose();
        class498.method2970((byte) -62);
        class291.field4260 = new class532(class312.field4572);
        class13.field258 = new class131();
        if (class476.field7072 != class116.field1601) {
            class381.field5818 = new byte[50][];
        }
        class203.field2716 = new class4(class312.field4572);
        if (class476.field7072 == class116.field1601) {
            class506.field7448.field2603 = this.getCodeBase().getHost();
        } else if (class33.method287(93, class116.field1601)) {
            class506.field7448.field2603 = this.getCodeBase().getHost();
            class506.field7448.field2606 = class506.field7448.field2602 + 40000;
            class355.field5495.field2606 = class355.field5495.field2602 + 40000;
            class501.field7397.field2606 = class501.field7397.field2602 + 40000;
            class506.field7448.field2611 = class506.field7448.field2602 + 50000;
            class355.field5495.field2611 = class355.field5495.field2602 + 50000;
            class501.field7397.field2611 = class501.field7397.field2602 + 50000;
        } else if (class351.field5406 == class116.field1601) {
            class506.field7448.field2603 = "127.0.0.1";
            class355.field5495.field2603 = "127.0.0.1";
            class506.field7448.field2606 = class506.field7448.field2602 + 40000;
            class501.field7397.field2603 = "127.0.0.1";
            class355.field5495.field2606 = class355.field5495.field2602 + 40000;
            class506.field7448.field2611 = class506.field7448.field2602 + 50000;
            class501.field7397.field2606 = class501.field7397.field2602 + 40000;
            class355.field5495.field2611 = class355.field5495.field2602 + 50000;
            class501.field7397.field2611 = class501.field7397.field2602 + 50000;
        }
        if (class67.field957 == class249.field3474) {
            class410.field6229 = class38.field565;
            class147.field1952 = true;
            class1.field7 = 16777215;
            class509.field7487 = class275.field3828;
            class538.field7885 = class151.field1974;
            class1.field9 = class21.field322;
            class27.field385 = 0;
        } else {
            class509.field7487 = class72.field1001;
            class410.field6229 = class361.field5558;
            class538.field7885 = class473.field7033;
            class1.field9 = class224.field3110;
        }
        class88.field1275 = class52.field720 = class280.field3973 = class490.field7244 = new short[256];
        if (class67.field957 == class41.field603) {
            class369.field5631 = false;
        }
        class139.field1851 = class506.field7448;
        class35.field515 = class348.method2250((byte) -122, class85.field1245);
        class502.field7404 = class436.method2648(true, class85.field1245, true);
        class80.field1134 = class500.field7379;
        try {
            if (class312.field4572.field7372 != null) {
                class387.field5925 = new class170(class312.field4572.field7372, 5200, 0);
                for (int var3 = 0; var3 < 30; var3++) {
                    class137.field1832[var3] = new class170(class312.field4572.field7387[var3], 6000, 0);
                }
                class342.field5278 = new class170(class312.field4572.field7371, 6000, 0);
                class492.field7255 = new class211(255, class387.field5925, class342.field5278, 500000);
                class88.field1269 = new class170(class312.field4572.field7382, 24, 0);
                class312.field4572.field7371 = null;
                class312.field4572.field7372 = null;
                class312.field4572.field7387 = null;
                class312.field4572.field7382 = null;
            }
        } catch (IOException var4) {
            class492.field7255 = null;
            class387.field5925 = null;
            class342.field5278 = null;
            class88.field1269 = null;
        }
        if (class476.field7072 != class116.field1601) {
            class32.field469 = true;
        }
        if (class67.field957 == class41.field603) {
            class303.field4435 = class10.field180.method2705((byte) 69, class257.field3556);
        } else if (class67.field957 == class249.field3474) {
            class303.field4435 = class420.field6389.method2705((byte) 69, class257.field3556);
            return;
        }
    }
}
