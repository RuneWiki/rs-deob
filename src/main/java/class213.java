import java.awt.Component;
import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uk")
public class class213 extends class120 {

    @OriginalMember(owner = "client!uk", name = "X", descriptor = "I")
    private int field3431 = 0;

    @OriginalMember(owner = "client!uk", name = "fb", descriptor = "I")
    private int field3439 = 4096;

    @OriginalMember(owner = "client!uk", name = "Z", descriptor = "Lok;")
    public static class41 field3433 = class137.method956("showingVideoAd", 45);

    @OriginalMember(owner = "client!uk", name = "eb", descriptor = "Lok;")
    public static class41 field3438 = class137.method956("loginscreen", 45);

    @OriginalMember(owner = "client!uk", name = "db", descriptor = "Lok;")
    public static class41 field3437 = class137.method956("Musik)2Engine vorbereitet)3", 45);

    @OriginalMember(owner = "client!uk", name = "hb", descriptor = "Lok;")
    public static class41 field3441 = class137.method956("null", 45);

    @OriginalMember(owner = "client!uk", name = "T", descriptor = "I")
    public static int field3427;

    @OriginalMember(owner = "client!uk", name = "U", descriptor = "I")
    public static int field3428;

    @OriginalMember(owner = "client!uk", name = "V", descriptor = "I")
    public static int field3429;

    @OriginalMember(owner = "client!uk", name = "W", descriptor = "I")
    public static int field3430;

    @OriginalMember(owner = "client!uk", name = "Y", descriptor = "I")
    public static int field3432;

    @OriginalMember(owner = "client!uk", name = "ab", descriptor = "I")
    public static int field3434;

    @OriginalMember(owner = "client!uk", name = "bb", descriptor = "I")
    public static int field3435;

    @OriginalMember(owner = "client!uk", name = "cb", descriptor = "I")
    public static int field3436;

    @OriginalMember(owner = "client!uk", name = "gb", descriptor = "I")
    public static int field3440;

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "()V", line = 6)
    public static final void method1505() {
        if (class97.field1425 != null) {
            for (int var0 = 0; var0 < class97.field1425.length; var0++) {
                for (int var1 = 0; var1 < class272.field4434; var1++) {
                    for (int var2 = 0; var2 < class65.field996; var2++) {
                        class97.field1425[var0][var1][var2] = null;
                    }
                }
            }
        }
        class236.field3791 = (class6[][]) null;
        if (class207.field3356 != null) {
            for (int var3 = 0; var3 < class207.field3356.length; var3++) {
                for (int var4 = 0; var4 < class272.field4434; var4++) {
                    for (int var5 = 0; var5 < class65.field996; var5++) {
                        class207.field3356[var3][var4][var5] = null;
                    }
                }
            }
        }
        class256.field4114 = (class6[][]) null;
        class236.field3793 = 0;
        if (class62.field920 != null) {
            for (int var6 = 0; var6 < class236.field3793; var6++) {
                class62.field920[var6] = null;
            }
        }
        if (class241.field3857 != null) {
            for (int var7 = 0; var7 < class234.field3732; var7++) {
                class241.field3857[var7] = null;
            }
            class234.field3732 = 0;
        }
        if (class310.field5226 != null) {
            for (int var8 = 0; var8 < class310.field5226.length; var8++) {
                class310.field5226[var8] = null;
            }
        }
    }

    @OriginalMember(owner = "client!uk", name = "f", descriptor = "(I)V", line = 111)
    public static void method1506(int arg0) {
        field3438 = null;
        field3433 = null;
        if (arg0 != 10) {
            field3441 = (class41) null;
        }
        field3437 = null;
        field3441 = null;
    }

    @OriginalMember(owner = "client!uk", name = "b", descriptor = "(IZ)[[I", line = 138)
    public final int[][] method168(int arg0, boolean arg1) {
        field3432++;
        int[][] var3 = this.field1764.method876(arg1, arg0);
        if (this.field1764.field1836) {
            int[][] var4 = this.method858(0, arg0, 121);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[1];
            int[] var9 = var3[2];
            int[] var10 = var3[0];
            for (int var11 = 0; var11 < class307.field5160; var11++) {
                int var12 = var6[var11];
                int var13 = var5[var11];
                int var14 = var7[var11];
                if (this.field3431 > var13) {
                    var10[var11] = this.field3431;
                } else if (this.field3439 < var13) {
                    var10[var11] = this.field3439;
                } else {
                    var10[var11] = var13;
                }
                if (this.field3431 > var12) {
                    var8[var11] = this.field3431;
                } else if (this.field3439 >= var12) {
                    var8[var11] = var12;
                } else {
                    var8[var11] = this.field3439;
                }
                if (this.field3431 > var14) {
                    var9[var11] = this.field3431;
                } else if (this.field3439 < var14) {
                    var9[var11] = this.field3439;
                } else {
                    var9[var11] = var14;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(II)[I", line = 216)
    public final int[] method14(int arg0, int arg1) {
        field3436++;
        int[] var3 = this.field1775.method863((byte) 34, arg0);
        if (arg1 != -14959) {
            method1508((byte) 109);
        }
        if (this.field1775.field1798) {
            int[] var4 = this.method854(0, arg0, -24059);
            for (int var5 = 0; var5 < class307.field5160; var5++) {
                int var6 = var4[var5];
                if (var6 < this.field3431) {
                    var3[var5] = this.field3431;
                } else if (var6 > this.field3439) {
                    var3[var5] = this.field3439;
                } else {
                    var3[var5] = var6;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!uk", name = "<init>", descriptor = "()V", line = 256)
    public class213() {
        super(1, false);
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(IIZ[B)Lok;", line = 272)
    public static final class41 method1507(int arg0, int arg1, boolean arg2, byte[] arg3) {
        class41 var4 = new class41();
        var4.field660 = new byte[arg0];
        field3434++;
        var4.field617 = 0;
        for (int var5 = arg1; var5 < (arg1 + arg0); var5++) {
            if (arg3[var5] != 0) {
                var4.field660[var4.field617++] = arg3[var5];
            }
        }
        if (arg2) {
            method1508((byte) -51);
        }
        return var4;
    }

    @OriginalMember(owner = "client!uk", name = "e", descriptor = "(B)V", line = 302)
    public static final void method1508(byte arg0) {
        field3429++;
        if (class259.field4132 == 0 || class259.field4132 == 5) {
            return;
        }
        try {
            if (++class62.field909 > 2000) {
                if (class118.field1724 != null) {
                    class118.field1724.method1570((byte) -96);
                    class118.field1724 = null;
                }
                if (class38.field596 >= 1) {
                    class259.field4132 = 0;
                    class134.field2001 = -5;
                    return;
                }
                class259.field4132 = 1;
                class62.field909 = 0;
                class38.field596++;
                if (class234.field3737 == class2.field32) {
                    class2.field32 = class63.field928;
                } else {
                    class2.field32 = class234.field3737;
                }
            }
            if (class259.field4132 == 1) {
                class278.field4550 = class138.field2065.method1483(-14479, class177.field2872, class2.field32);
                class259.field4132 = 2;
            }
            if (class259.field4132 == 2) {
                if (class278.field4550.field2948 == 2) {
                    throw new IOException();
                }
                if (class278.field4550.field2948 != 1) {
                    return;
                }
                class118.field1724 = new class218((Socket) class278.field4550.field2945, class138.field2065);
                class278.field4550 = null;
                long var1 = class205.field3324 = class266.field4236.method291((byte) 65);
                class285.field4642.field1640 = 0;
                class285.field4642.method797(14, -22096);
                int var3 = (int) (var1 >> 16 & 0x1FL);
                class285.field4642.method797(var3, -22096);
                class118.field1724.method1572(116, 2, 0, class285.field4642.field1607);
                if (class20.field313 != null) {
                    class20.field313.method243((byte) 118);
                }
                if (class77.field1145 != null) {
                    class77.field1145.method243((byte) 120);
                }
                int var4 = class118.field1724.method1567(-15806);
                if (class20.field313 != null) {
                    class20.field313.method243((byte) 123);
                }
                if (class77.field1145 != null) {
                    class77.field1145.method243((byte) 109);
                }
                if (var4 != 0) {
                    class134.field2001 = var4;
                    class259.field4132 = 0;
                    class118.field1724.method1570((byte) 123);
                    class118.field1724 = null;
                    return;
                }
                class259.field4132 = 3;
            }
            if (class259.field4132 == 3) {
                if (class118.field1724.method1571(-107) < 8) {
                    return;
                }
                int[] var5 = new int[4];
                class118.field1724.method1575(8, 14574, 0, class164.field2597.field1607);
                class164.field2597.field1640 = 0;
                class85.field1240 = class164.field2597.method768((byte) 92);
                class285.field4642.field1640 = 0;
                var5[1] = (int) (Math.random() * 9.9999999E7D);
                var5[3] = (int) class85.field1240;
                var5[0] = (int) (Math.random() * 9.9999999E7D);
                var5[2] = (int) (class85.field1240 >> 32);
                class285.field4642.method797(10, -22096);
                class285.field4642.method787(853918096, var5[0]);
                class285.field4642.method787(853918096, var5[1]);
                class285.field4642.method787(853918096, var5[2]);
                class285.field4642.method787(853918096, var5[3]);
                class285.field4642.method800(class266.field4236.method291((byte) 65), (byte) -113);
                class285.field4642.method776(341440880, class266.field4232);
                class285.field4642.method786(class210.field3378, class235.field3764, 0);
                class185.field3025.field1640 = 0;
                if (class94.field1377 == 40) {
                    class185.field3025.method797(18, -22096);
                } else {
                    class185.field3025.method797(16, -22096);
                }
                class185.field3025.method778(class285.field4642.field1640 + class188.method1351(class92.field1332, true) + 154, (byte) -4);
                class185.field3025.method787(853918096, 520);
                class185.field3025.method797(class124.field1837, -22096);
                class185.field3025.method797(class298.field4824 ? 1 : 0, -22096);
                class185.field3025.method797(1, -22096);
                class185.field3025.method797(class33.method228((byte) 125), -22096);
                class185.field3025.method778(class188.field3055, (byte) -4);
                class185.field3025.method778(class14.field182, (byte) -4);
                class171.method1229(-25, class185.field3025);
                class185.field3025.method776(341440880, class92.field1332);
                class185.field3025.method787(853918096, class255.field4096);
                class185.field3025.method787(853918096, class13.method57(6714));
                class36.field552 = true;
                class185.field3025.method778(class313.field5287, (byte) -4);
                class185.field3025.method787(853918096, class60.field884.method459(16));
                class185.field3025.method787(853918096, class63.field929.method459(16));
                class185.field3025.method787(853918096, class85.field1245.method459(16));
                class185.field3025.method787(853918096, class167.field2657.method459(16));
                class185.field3025.method787(853918096, class44.field693.method459(16));
                class185.field3025.method787(853918096, class245.field3938.method459(16));
                class185.field3025.method787(853918096, class294.field4763.method459(16));
                class185.field3025.method787(853918096, class45.field711.method459(16));
                class185.field3025.method787(853918096, class212.field3423.method459(16));
                class185.field3025.method787(853918096, class18.field232.method459(16));
                class185.field3025.method787(853918096, class201.field3220.method459(16));
                class185.field3025.method787(853918096, class81.field1201.method459(16));
                class185.field3025.method787(853918096, class113.field1670.method459(16));
                class185.field3025.method787(853918096, class181.field2937.method459(16));
                class185.field3025.method787(853918096, class13.field170.method459(16));
                class185.field3025.method787(853918096, class64.field947.method459(16));
                class185.field3025.method787(853918096, class16.field213.method459(16));
                class185.field3025.method787(853918096, class45.field706.method459(16));
                class185.field3025.method787(853918096, class173.field2807.method459(16));
                class185.field3025.method787(853918096, class314.field5289.method459(16));
                class185.field3025.method787(853918096, class272.field4427.method459(16));
                class185.field3025.method787(853918096, class298.field4820.method459(16));
                class185.field3025.method787(853918096, class216.field3473.method459(16));
                class185.field3025.method787(853918096, class3.field42.method459(16));
                class185.field3025.method787(853918096, class148.field2297.method459(16));
                class185.field3025.method787(853918096, class164.field2605.method459(16));
                class185.field3025.method787(853918096, class119.field1757.method459(16));
                class185.field3025.method813(class285.field4642.field1640, 0, class285.field4642.field1607, -1);
                class118.field1724.method1572(-106, class185.field3025.field1640, 0, class185.field3025.field1607);
                class285.field4642.method838(var5, false);
                for (int var6 = 0; var6 < 4; var6++) {
                    var5[var6] += 50;
                }
                class164.field2597.method838(var5, false);
                class259.field4132 = 4;
            }
            if (class259.field4132 == 4) {
                if (class118.field1724.method1571(38) < 1) {
                    return;
                }
                int var7 = class118.field1724.method1567(-15806);
                if (var7 == 21) {
                    class259.field4132 = 7;
                } else if (var7 == 29) {
                    class259.field4132 = 10;
                } else if (var7 == 1) {
                    class259.field4132 = 5;
                    class134.field2001 = var7;
                    return;
                } else if (var7 == 2) {
                    class259.field4132 = 8;
                } else if (var7 == 15) {
                    class134.field2001 = var7;
                    class259.field4132 = 0;
                    return;
                } else if (var7 == 23 && class38.field596 < 1) {
                    class38.field596++;
                    class62.field909 = 0;
                    class259.field4132 = 1;
                    class118.field1724.method1570((byte) 58);
                    class118.field1724 = null;
                    return;
                } else {
                    class134.field2001 = var7;
                    class259.field4132 = 0;
                    class118.field1724.method1570((byte) 106);
                    class118.field1724 = null;
                    return;
                }
            }
            if (class259.field4132 == 6) {
                class285.field4642.field1640 = 0;
                class285.field4642.method844(-4, 17);
                class118.field1724.method1572(97, class285.field4642.field1640, 0, class285.field4642.field1607);
                class259.field4132 = 4;
                return;
            }
            if (class259.field4132 == 7) {
                if (class118.field1724.method1571(87) >= 1) {
                    class178.field2883 = class118.field1724.method1567(-15806) * 60 + 180;
                    class259.field4132 = 0;
                    class134.field2001 = 21;
                    class118.field1724.method1570((byte) 26);
                    class118.field1724 = null;
                    return;
                }
                return;
            }
            int var8 = -84 / ((arg0 + 50) / 63);
            if (class259.field4132 == 10) {
                if (class118.field1724.method1571(66) >= 1) {
                    class164.field2606 = class118.field1724.method1567(-15806);
                    class134.field2001 = 29;
                    class259.field4132 = 0;
                    class118.field1724.method1570((byte) 93);
                    class118.field1724 = null;
                    return;
                }
                return;
            }
            if (class259.field4132 == 8) {
                if (class118.field1724.method1571(9) < 14) {
                    return;
                }
                class118.field1724.method1575(14, 14574, 0, class164.field2597.field1607);
                class164.field2597.field1640 = 0;
                class62.field919 = class164.field2597.method792(2);
                class121.field1796 = class164.field2597.method792(2);
                class164.field2595 = class164.field2597.method792(2) == 1;
                class62.field907 = class164.field2597.method792(2) == 1;
                class216.field3467 = class164.field2597.method792(2) == 1;
                class169.field2696 = class164.field2597.method792(2) == 1;
                class10.field136 = class164.field2597.method792(2) == 1;
                class204.field3300 = class164.field2597.method759((byte) -37);
                class275.field4507 = class164.field2597.method792(2) == 1;
                class230.field3649 = class164.field2597.method792(2) == 1;
                class64.method449(class230.field3649, (byte) 71);
                class266.method1882(-90, class230.field3649);
                if (!class298.field4824) {
                    if ((!class164.field2595 || class216.field3467) && !class275.field4507) {
                        try {
                            class128.field1906.method297(class138.field2065.field3390, -24900);
                        } catch (Throwable var13) {
                        }
                    } else {
                        try {
                            class235.field3768.method297(class138.field2065.field3390, -24900);
                        } catch (Throwable var12) {
                        }
                    }
                }
                class116.field1679 = class164.field2597.method846(500);
                class1.field7 = class164.field2597.method759((byte) -44);
                class259.field4132 = 9;
            }
            if (class259.field4132 == 9) {
                if (class118.field1724.method1571(-128) >= class1.field7) {
                    class164.field2597.field1640 = 0;
                    class118.field1724.method1575(class1.field7, 14574, 0, class164.field2597.field1607);
                    class259.field4132 = 0;
                    class134.field2001 = 2;
                    class10.method39(50);
                    class133.field1990 = -1;
                    class171.method1221((byte) 64, false);
                    class116.field1679 = -1;
                    return;
                }
                return;
            }
        } catch (IOException var14) {
            if (class118.field1724 != null) {
                class118.field1724.method1570((byte) -128);
                class118.field1724 = null;
            }
            if (class38.field596 < 1) {
                class38.field596++;
                class62.field909 = 0;
                if (class234.field3737 == class2.field32) {
                    class2.field32 = class63.field928;
                } else {
                    class2.field32 = class234.field3737;
                }
                class259.field4132 = 1;
            } else {
                class134.field2001 = -4;
                class259.field4132 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(ILjava/awt/Component;II)Lvj;", line = 680)
    public static final class188 method1509(int arg0, Component arg1, int arg2, int arg3) {
        field3440++;
        try {
            if (arg2 != 0) {
                method1505();
            }
            Class var4 = Class.forName("dh");
            class188 var5 = (class188) var4.getDeclaredConstructor().newInstance();
            var5.method176(arg3, (byte) -128, arg1, arg0);
            return var5;
        } catch (Throwable var8) {
            class27 var7 = new class27();
            var7.method176(arg3, (byte) -123, arg1, arg0);
            return var7;
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(Llb;II)V", line = 712)
    public final void method30(class112 arg0, int arg1, int arg2) {
        field3428++;
        if (arg1 != -1) {
            method1510(-1, -53, -26, 37, 115, 46, -103, 9, 23, 12);
        }
        if (arg2 == 0) {
            this.field3431 = arg0.method759((byte) -70);
        } else if (arg2 == 1) {
            this.field3439 = arg0.method759((byte) -70);
        } else if (arg2 == 2) {
            this.field1770 = arg0.method792(2) == 1;
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(IIIIIIIIII)V", line = 759)
    public static final void method1510(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg7 != 0) {
            field3433 = (class41) null;
        }
        if (class273.field4449 <= arg0 && class153.field2439 >= arg0 && arg4 >= class273.field4449 && arg4 <= class153.field2439 && class273.field4449 <= arg2 && arg2 <= class153.field2439 && class273.field4449 <= arg3 && class153.field2439 >= arg3 && class15.field192 <= arg8 && arg8 <= class237.field3801 && class15.field192 <= arg1 && class237.field3801 >= arg1 && arg9 >= class15.field192 && arg9 <= class237.field3801 && class15.field192 <= arg6 && arg6 <= class237.field3801) {
            class88.method628(arg0, arg1, arg3, arg9, arg2, 3, arg8, arg4, arg6, arg5);
        } else {
            class59.method413(arg8, arg4, arg1, arg0, arg9, arg5, arg3, arg6, (byte) -49, arg2);
        }
        field3427++;
    }
}
