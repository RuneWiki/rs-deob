import jagex3.jagmisc.jagmisc;
import java.awt.Container;
import java.awt.Frame;
import java.awt.Insets;
import java.awt.Rectangle;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.Socket;
import java.util.GregorianCalendar;
import java.util.Vector;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!client")
public class client extends class229 {

    @OriginalMember(owner = "client!client", name = "cb", descriptor = "Lnd;")
    public static class464 field3203 = new class464(0, 0);

    @OriginalMember(owner = "client!client", name = "qb", descriptor = "Lvj;")
    public static class373 field3217;

    @OriginalMember(owner = "client!client", name = "S", descriptor = "I")
    public static int field3194;

    @OriginalMember(owner = "client!client", name = "T", descriptor = "I")
    public static int field3195;

    @OriginalMember(owner = "client!client", name = "U", descriptor = "I")
    public static int field3196;

    @OriginalMember(owner = "client!client", name = "W", descriptor = "I")
    public static int field3197;

    @OriginalMember(owner = "client!client", name = "X", descriptor = "I")
    public static int field3198;

    @OriginalMember(owner = "client!client", name = "Y", descriptor = "I")
    public static int field3199;

    @OriginalMember(owner = "client!client", name = "Z", descriptor = "I")
    public static int field3200;

    @OriginalMember(owner = "client!client", name = "ab", descriptor = "I")
    public static int field3201;

    @OriginalMember(owner = "client!client", name = "bb", descriptor = "I")
    public static int field3202;

    @OriginalMember(owner = "client!client", name = "db", descriptor = "I")
    public static int field3204;

    @OriginalMember(owner = "client!client", name = "eb", descriptor = "I")
    public static int field3205;

    @OriginalMember(owner = "client!client", name = "fb", descriptor = "I")
    public static int field3206;

    @OriginalMember(owner = "client!client", name = "gb", descriptor = "I")
    public static int field3207;

    @OriginalMember(owner = "client!client", name = "hb", descriptor = "I")
    public static int field3208;

    @OriginalMember(owner = "client!client", name = "ib", descriptor = "I")
    public static int field3209;

    @OriginalMember(owner = "client!client", name = "jb", descriptor = "I")
    public static int field3210;

    @OriginalMember(owner = "client!client", name = "kb", descriptor = "I")
    public static int field3211;

    @OriginalMember(owner = "client!client", name = "lb", descriptor = "I")
    public static int field3212;

    @OriginalMember(owner = "client!client", name = "mb", descriptor = "I")
    public static int field3213;

    @OriginalMember(owner = "client!client", name = "nb", descriptor = "I")
    public static int field3214;

    @OriginalMember(owner = "client!client", name = "pb", descriptor = "I")
    public static int field3216;

    @OriginalMember(owner = "client!client", name = "ob", descriptor = "Lha;")
    public static class52 field3215;

    // $FF: synthetic field
    @OriginalMember(owner = "client!client", name = "rb", descriptor = "Ljava/lang/Class;")
    public static Class field3218;

    // $FF: synthetic field
    @OriginalMember(owner = "client!client", name = "sb", descriptor = "Ljava/lang/Class;")
    public static Class field3219;

    @OriginalMember(owner = "client!client", name = "tb", descriptor = "Z")
    public static boolean field3220;

    // $FF: synthetic method
    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method1420(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    static {
        new class180("You have been removed from this channel.", "Du wurdest aus dem Chatraum entfernt.", "Vous avez été supprimé de ce canal.", "Você foi retirado desse canal.");
        field3217 = new class373(111, 1);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ZILjava/io/File;)[B", line = 3)
    public static final byte[] method1398(boolean arg0, int arg1, File arg2) {
        field3194++;
        try {
            if (!arg0) {
                field3203 = null;
            }
            byte[] var3 = new byte[arg1];
            class457.method2666(arg1, var3, arg2, 0);
            return var3;
        } catch (IOException var4) {
            return null;
        }
    }

    @OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V", line = 21)
    public static void method1399(int arg0) {
        if (arg0 != 2) {
            field3216 = 69;
        }
        field3203 = null;
        field3217 = null;
        field3215 = null;
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(B)V", line = 34)
    private final void method1400(byte arg0) {
        field3195++;
        if (class137.field1671 == 6 && class197.field2381 == 0) {
            if (class59.field577 > 1) {
                class388.field5128 = class519.field7305;
                class59.field577--;
            }
            if (!class473.field6634) {
                class9.method46(arg0 ^ 0x4B);
            }
            for (int var2 = 0; var2 < 100 && class195.method1062((byte) 62); var2++) {
            }
        }
        class590.field8557++;
        class355.method1996(-1, false, -1, null);
        class415.method2371(null, -1, arg0 ^ 0xC2, -1);
        class376.method2191((byte) 52);
        class519.field7305++;
        for (int var3 = 0; var3 < class98.field1215; var3++) {
            class459 var4 = class393.field5189[var3].field5390;
            if (var4 != null) {
                byte var5 = var4.field6334.field807;
                if ((var5 & 0x1) != 0) {
                    int var6 = var4.method2694(arg0 + 28085);
                    if ((var5 & 0x2) != 0 && var4.field6486 == 0 && Math.random() * 1000.0D < 10.0D) {
                        int var7 = (int) Math.round(Math.random() * 10.0D - 5.0D);
                        int var8 = (int) Math.round(Math.random() * 10.0D - 5.0D);
                        if (var7 != 0 || var8 != 0) {
                            int var9 = var4.field6483[0] + var7;
                            int var10 = var4.field6491[0] + var8;
                            if (var9 < 0) {
                                var9 = 0;
                            } else if (var9 > class106.field1289 - var6 - 1) {
                                var9 = class106.field1289 - var6 - 1;
                            }
                            if (var10 < 0) {
                                var10 = 0;
                            } else if (class422.field5452 - var6 - 1 < var10) {
                                var10 = class422.field5452 - var6 - 1;
                            }
                            int var11 = class279.method1591(var6, var4.field6483[0], class545.field7996, -1, 0, var4.field6491[0], class309.field3939[var4.field8660], class602.field8696, var10, var6, arg0 ^ 0xFFFFFFFD, var9, 0, var6, true);
                            if (var11 > 0) {
                                if (var11 > 9) {
                                    var11 = 9;
                                }
                                for (int var12 = 0; var12 < var11; var12++) {
                                    var4.field6483[var12] = class602.field8696[var11 - var12 - 1];
                                    var4.field6491[var12] = class545.field7996[var11 - var12 - 1];
                                    var4.field6482[var12] = 1;
                                }
                                var4.field6486 = var11;
                            }
                        }
                    }
                    class75.method434(var4, -108, true);
                    int var13 = class271.method1518(-75, var4);
                    class504.method2908(var4, class288.field3745, true, class474.field6644, var13);
                    class157.method866(arg0 - 62, var4);
                }
            }
        }
        if (class197.field2381 == 0 && class137.field1672 == 0) {
            if (class617.field8931 == 2) {
                class204.method1095((byte) 126);
            } else {
                class84.method497((byte) -119);
            }
            if (class286.field3729 >> 7 < 14 || class106.field1289 - 14 <= class286.field3729 >> 7 || (class39.field303 >> 7) < 14 || class422.field5452 - 14 <= class39.field303 >> 7) {
                class240.method1359(true);
            }
        }
        while (true) {
            class503 var14;
            class509 var15;
            class509 var16;
            do {
                var14 = (class503) class91.field1122.method1054((byte) -105);
                if (var14 == null) {
                    while (true) {
                        class503 var17;
                        class509 var18;
                        class509 var19;
                        do {
                            var17 = (class503) class105.field1273.method1054((byte) -105);
                            if (var17 == null) {
                                while (true) {
                                    class503 var20;
                                    class509 var21;
                                    class509 var22;
                                    do {
                                        var20 = (class503) class119.field1503.method1054((byte) -105);
                                        if (var20 == null) {
                                            if (class289.field3757 != null) {
                                                class118.method697((byte) 113);
                                            }
                                            if (class335.field4358 % 1500 == 0) {
                                                class163.method891(124);
                                            }
                                            if (class137.field1671 == 6 && class197.field2381 == 0) {
                                                class175.method973((byte) -125);
                                            }
                                            class46.method247(-23300);
                                            if (class352.field4542 && (class190.method1030(false) - 60000L) > class634.field9125) {
                                                class474.method2759((byte) -120);
                                            }
                                            if (arg0 != 61) {
                                                this.method1405((byte) 8, -27);
                                            }
                                            for (class299 var23 = (class299) class43.field347.method1987(true); var23 != null; var23 = (class299) class43.field347.method1994(6408)) {
                                                if ((long) var23.field3840 < class190.method1030(false) / 1000L - 5L) {
                                                    if (var23.field3837 > 0) {
                                                        class589.method3415(var23.field3839 + class62.field620.method987(class31.field247, 22), 5, "", 0, false, "");
                                                    }
                                                    if (var23.field3837 == 0) {
                                                        class589.method3415(var23.field3839 + class570.field8371.method987(class31.field247, arg0 - 39), 5, "", 0, false, "");
                                                    }
                                                    var23.method610((byte) -125);
                                                }
                                            }
                                            if (class137.field1671 == 6 && class197.field2381 == 0) {
                                                if (class597.field8642 == null) {
                                                    class542.method3152(false, -14485);
                                                    return;
                                                }
                                                class472.field6609++;
                                                if (class472.field6609 > 50) {
                                                    class578.field8434++;
                                                    class418.method2378(17984, class61.field594);
                                                }
                                                try {
                                                    if (class597.field8642 != null && class136.field1663.field4966 > 0) {
                                                        class224.field2753 += class136.field1663.field4966;
                                                        class597.field8642.method2264(0, 0, class136.field1663.field4929, class136.field1663.field4966);
                                                        class472.field6609 = 0;
                                                        class136.field1663.field4966 = 0;
                                                        return;
                                                    }
                                                } catch (IOException var24) {
                                                    class542.method3152(false, -14485);
                                                    return;
                                                }
                                            }
                                            return;
                                        }
                                        var21 = var20.field6973;
                                        if (var21.field7086 < 0) {
                                            break;
                                        }
                                        var22 = class61.method348(var21.field7054, true);
                                    } while (var22 == null || var22.field7101 == null || var21.field7086 >= var22.field7101.length || var22.field7101[var21.field7086] != var21);
                                    class630.method3608(var20);
                                }
                            }
                            var18 = var17.field6973;
                            if (var18.field7086 < 0) {
                                break;
                            }
                            var19 = class61.method348(var18.field7054, true);
                        } while (var19 == null || var19.field7101 == null || var18.field7086 >= var19.field7101.length || var19.field7101[var18.field7086] != var18);
                        class630.method3608(var17);
                    }
                }
                var15 = var14.field6973;
                if (var15.field7086 < 0) {
                    break;
                }
                var16 = class61.method348(var15.field7054, true);
            } while (var16 == null || var16.field7101 == null || var16.field7101.length <= var15.field7086 || var16.field7101[var15.field7086] != var15);
            class630.method3608(var14);
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V", line = 325)
    private final void method1401(byte arg0) {
        if (!class565.field8299.field2176) {
            for (int var2 = 0; var2 < class300.field3853; var2++) {
                if (class294.field3802[var2].method1514(16729) == 's' || class294.field3802[var2].method1514(16729) == 'S') {
                    class565.field8299.field2176 = true;
                    break;
                }
            }
        }
        field3205++;
        if (class141.field1707 == 0) {
            Runtime var3 = Runtime.getRuntime();
            int var4 = (int) ((var3.totalMemory() - var3.freeMemory()) / 1024L);
            long var5 = class190.method1030(false);
            if (class114.field1429 == 0L) {
                class114.field1429 = var5;
            }
            if (var4 > 16384 && (var5 - class114.field1429) < 5000L) {
                if ((var5 - class518.field7297) > 1000L) {
                    System.gc();
                    class518.field7297 = var5;
                }
                class183.field2221 = class376.field5008.method987(class31.field247, 22);
                class183.field2223 = 5;
            } else {
                class183.field2221 = class548.field8060.method987(class31.field247, 22);
                class183.field2223 = 5;
                class141.field1707 = 10;
            }
        } else if (class141.field1707 == 10) {
            for (int var7 = 0; var7 < 4; var7++) {
                class309.field3939[var7] = class4.method25(-128, class422.field5452, class106.field1289);
            }
            class183.field2221 = class299.field3843.method987(class31.field247, 22);
            class141.field1707 = 20;
            class183.field2223 = 10;
        } else if (class141.field1707 == 20) {
            if (class114.field1413 == null) {
                class114.field1413 = new class383(class232.field2861, class468.field6547, class117.field1473, class357.field4689);
            }
            if (class114.field1413.method2213(65)) {
                class601.field8674 = class565.method3295(true, 1000000, 0, false, 1);
                class566.field8314 = class565.method3295(true, 1000000, 1, false, 1);
                class489.field6828 = class565.method3295(true, 1000000, 2, false, 1);
                class280.field3679 = class565.method3295(true, 1000000, 3, false, 1);
                class173.field2110 = class565.method3295(true, 1000000, 4, false, 1);
                class368.field4834 = class565.method3295(true, 1000000, 5, true, 1);
                class282.field3709 = class565.method3295(false, 1000000, 6, true, 1);
                class377.field5020 = class565.method3295(true, 1000000, 7, false, 1);
                class39.field299 = class565.method3295(true, 1000000, 8, false, 1);
                class315.field4016 = class565.method3295(true, 1000000, 9, false, 1);
                class596.field8637 = class565.method3295(true, 1000000, 10, false, 1);
                class531.field7458 = class565.method3295(true, 1000000, 11, false, 1);
                class48.field401 = class565.method3295(true, 1000000, 12, false, 1);
                class593.field8621 = class565.method3295(true, 1000000, 13, false, 1);
                class479.field6729 = class565.method3295(false, 1000000, 14, false, 1);
                class92.field1132 = class565.method3295(true, 1000000, 15, false, 1);
                class106.field1286 = class565.method3295(true, 1000000, 16, false, 1);
                class507.field7035 = class565.method3295(true, 1000000, 17, false, 1);
                class584.field8484 = class565.method3295(true, 1000000, 18, false, 1);
                class200.field2405 = class565.method3295(true, 1000000, 19, false, 1);
                class44.field372 = class565.method3295(true, 1000000, 20, false, 1);
                class319.field4071 = class565.method3295(true, 1000000, 21, false, 1);
                class420.field5435 = class565.method3295(true, 1000000, 22, false, 1);
                class584.field8486 = class565.method3295(true, 1000000, 23, true, 1);
                class245.field3143 = class565.method3295(true, 1000000, 24, false, 1);
                class185.field2237 = class565.method3295(true, 1000000, 25, false, 1);
                class66.field645 = class565.method3295(true, 1000000, 26, true, 1);
                class418.field5428 = class565.method3295(true, 1000000, 27, false, 1);
                class104.field1266 = class565.method3295(true, 1000000, 28, true, 1);
                class300.field3851 = class565.method3295(true, 1000000, 29, false, 1);
                class645.field9391 = class565.method3295(true, 1000000, 30, true, 1);
                class516.field7285 = class565.method3295(true, 1000000, 31, true, 1);
                class183.field2221 = class92.field1128.method987(class31.field247, 22);
                class141.field1707 = 30;
                class183.field2223 = 15;
            } else {
                class183.field2221 = class322.field4089.method987(class31.field247, 22);
                class183.field2223 = 12;
            }
        } else if (class141.field1707 == 30) {
            int var8 = 0;
            for (int var9 = 0; var9 < 32; var9++) {
                var8 += class533.field7490[var9].method3627(83) * class529.field7433[var9] / 100;
            }
            if (var8 == 100) {
                class183.field2221 = class502.field6961.method987(class31.field247, 22);
                class183.field2223 = 20;
                class79.method457(-1175, class39.field299);
                class310.method1718(class39.field299, -1);
                class141.field1707 = 35;
            } else {
                if (var8 != 0) {
                    class183.field2221 = class262.field3380.method987(class31.field247, 22) + var8 + "%";
                }
                class183.field2223 = 20;
            }
        } else if (class141.field1707 == 35) {
            class219.method1265(class74.field873, -1, class645.field9391);
            class183.field2221 = class140.field1696.method987(class31.field247, 22);
            class183.field2223 = 20;
            class141.field1707 = 40;
        } else if (class141.field1707 == 40) {
            if (class104.field1266.method2574(-84)) {
                this.method1411(class104.field1266.method2560(1, -6914), 9);
                this.method1418(class104.field1266.method2560(3, -6914), false);
                if (class281.field3691 == -1 || class377.field5020.method2563(class281.field3691, (byte) 100, 0)) {
                    class183.field2221 = class323.field4095.method987(class31.field247, 22);
                    class141.field1707 = 41;
                    class183.field2223 = 25;
                }
            } else {
                class183.field2221 = class354.field4640.method987(class31.field247, 22) + class104.field1266.method2572(1726) + "%";
                class183.field2223 = 25;
            }
        } else if (class141.field1707 == 41) {
            int var10 = class70.method389(29266, "jaggl");
            if (var10 >= 0 && var10 < 100) {
                class183.field2221 = class308.field3934.method987(class31.field247, 22) + var10 + "%";
                class183.field2223 = 25;
            } else {
                class183.field2221 = class104.field1268.method987(class31.field247, 22);
                class183.field2223 = 25;
                class141.field1707 = 42;
            }
        } else if (class141.field1707 == 42) {
            int var11 = class70.method389(29266, "jagdx");
            if (var11 >= 0 && var11 < 100) {
                class183.field2221 = class396.field5227.method987(class31.field247, 22) + var11 + "%";
                class183.field2223 = 25;
            } else {
                class183.field2221 = class480.field6742.method987(class31.field247, 22);
                class183.field2223 = 25;
                class141.field1707 = 43;
            }
        } else if (class141.field1707 == 43) {
            int var12 = class70.method389(29266, "jagmisc");
            if (var12 >= 0 && var12 < 100) {
                class183.field2221 = class466.field6522.method987(class31.field247, 22) + var12 + "%";
                class183.field2223 = 25;
            } else {
                if (var12 == 100) {
                    this.method1315(91);
                }
                class183.field2221 = class284.field3723.method987(class31.field247, 22);
                class141.field1707 = 44;
                class183.field2223 = 25;
            }
        } else if (class141.field1707 == 44) {
            int var13 = class70.method389(29266, "sw3d");
            if (var13 >= 0 && var13 < 100) {
                class183.field2221 = class74.field870.method987(class31.field247, 22) + var13 + "%";
                class183.field2223 = 25;
            } else {
                class183.field2221 = class525.field7352.method987(class31.field247, 22);
                class141.field1707 = 45;
                class183.field2223 = 25;
            }
        } else if (class141.field1707 == 45) {
            int var14 = class70.method389(29266, "jaclib");
            if (var14 >= 0 && var14 < 100) {
                class183.field2221 = class277.field3644.method987(class31.field247, 22) + var14 + "%";
                class183.field2223 = 25;
            } else {
                if (var14 == 100) {
                    this.method1305(-1);
                }
                class183.field2221 = class148.field1769.method987(class31.field247, 22);
                class141.field1707 = 46;
                class183.field2223 = 25;
            }
        } else if (class141.field1707 == 46) {
            int var15 = class70.method389(29266, "hw3d");
            if (var15 >= 0 && var15 < 100) {
                class183.field2221 = class347.field4467.method987(class31.field247, 22) + var15 + "%";
                class183.field2223 = 25;
            } else {
                class183.field2221 = class480.field6739.method987(class31.field247, 22);
                class183.field2223 = 25;
                class141.field1707 = 47;
            }
        } else if (class141.field1707 != 47) {
            int var16 = 126 / ((27 - arg0) / 61);
            if (class141.field1707 == 50) {
                class538.method3143((byte) 118);
                class183.field2221 = class356.field4682.method987(class31.field247, 22);
                class183.field2223 = 30;
                class141.field1707 = 60;
            } else if (class141.field1707 == 60) {
                int var17 = class117.method689(class593.field8621, class39.field299, 71);
                int var18 = class411.method2348(6);
                if (var18 > var17) {
                    class183.field2221 = class133.field1638.method987(class31.field247, 22) + var17 * 100 / var18 + "%";
                    class183.field2223 = 35;
                } else {
                    class183.field2221 = class300.field3850.method987(class31.field247, 22);
                    class183.field2223 = 35;
                    class141.field1707 = 70;
                }
            } else if (class141.field1707 == 70) {
                int var19 = class82.method491(class39.field299, (byte) -61);
                int var20 = class283.method1600(2);
                if (var19 < var20) {
                    class183.field2221 = class283.field3715.method987(class31.field247, 22) + var19 * 100 / var20 + "%";
                    class183.field2223 = 40;
                } else {
                    class183.field2221 = class257.field3298.method987(class31.field247, 22);
                    class183.field2223 = 40;
                    class141.field1707 = 80;
                }
            } else if (class141.field1707 == 80) {
                if (class66.field645.method2574(-48)) {
                    class491.field6848 = new class312(class66.field645, class315.field4016, class39.field299);
                    class183.field2221 = class598.field8664.method987(class31.field247, 22);
                    class183.field2223 = 45;
                    class141.field1707 = 90;
                } else {
                    class183.field2221 = class314.field4008.method987(class31.field247, 22) + class66.field645.method2572(1726) + "%";
                    class183.field2223 = 45;
                }
            } else if (class141.field1707 == 90) {
                class183.field2221 = class563.field8278.method987(class31.field247, 22);
                class183.field2223 = 50;
                class141.field1707 = 95;
            } else if (class141.field1707 == 95) {
                if (class565.field8299.field2176) {
                    class565.field8299.field2175 = 0;
                    class565.field8299.field2188 = 0;
                    class565.field8299.field2170 = 0;
                    class565.field8299.field2168 = 1;
                    class565.field8299.field2166 = 0;
                }
                class565.field8299.field2176 = true;
                class565.field8299.method3585(true, class74.field873);
                class499.method2883(false, false, class565.field8299.field2188);
                class183.field2221 = class528.field7393.method987(class31.field247, 22);
                class183.field2223 = 55;
                class141.field1707 = 100;
            } else if (class141.field1707 == 100) {
                class219.method1263(class39.field299, class593.field8621, class210.field2560, -21120);
                class183.field2221 = class184.field2227.method987(class31.field247, 22);
                class183.field2223 = 60;
                class35.method200(1, 2);
                class141.field1707 = 110;
            } else if (class141.field1707 == 110) {
                byte var21 = 0;
                class489.field6828.method2574(-98);
                int var22 = var21 + class489.field6828.method2572(1726);
                class106.field1286.method2574(-51);
                int var23 = var22 + class106.field1286.method2572(1726);
                class507.field7035.method2574(-93);
                int var24 = var23 + class507.field7035.method2572(1726);
                class584.field8484.method2574(-117);
                int var25 = var24 + class584.field8484.method2572(1726);
                class200.field2405.method2574(-123);
                int var26 = var25 + class200.field2405.method2572(1726);
                class44.field372.method2574(-114);
                int var27 = var26 + class44.field372.method2572(1726);
                class319.field4071.method2574(-54);
                int var28 = var27 + class319.field4071.method2572(1726);
                class420.field5435.method2574(-82);
                int var29 = var28 + class420.field5435.method2572(1726);
                class245.field3143.method2574(-113);
                int var30 = var29 + class245.field3143.method2572(1726);
                class185.field2237.method2574(-65);
                int var31 = var30 + class185.field2237.method2572(1726);
                class418.field5428.method2574(-62);
                int var32 = var31 + class418.field5428.method2572(1726);
                class300.field3851.method2574(-46);
                int var33 = var32 + class300.field3851.method2572(1726);
                if (var33 < 1200) {
                    class183.field2221 = class384.field5075.method987(class31.field247, 22) + var33 / 12 + "%";
                    class183.field2223 = 65;
                } else {
                    class290.field3771 = new class478(class341.field4399, class31.field247, class489.field6828);
                    class16.field125 = new class629(class341.field4399, class31.field247, class489.field6828);
                    class290.field3765 = new class364(class341.field4399, class31.field247, class489.field6828, class39.field299);
                    class565.field8298 = new class384(class341.field4399, class31.field247, class507.field7035);
                    class106.field1298 = new class81(class341.field4399, class31.field247, class489.field6828);
                    class299.field3844 = new class40(class341.field4399, class31.field247, class489.field6828);
                    class368.field4857 = new class471(class341.field4399, class31.field247, class489.field6828, class377.field5020);
                    class66.field638 = new class224(class341.field4399, class31.field247, class489.field6828);
                    class76.field887 = new class390(class341.field4399, class31.field247, class489.field6828);
                    class16.field126 = new class316(class341.field4399, class31.field247, true, class106.field1286, class377.field5020);
                    class450.field6233 = new class554(class341.field4399, class31.field247, class489.field6828, class39.field299);
                    class284.field3721 = new class590(class341.field4399, class31.field247, class489.field6828, class39.field299);
                    class518.field7296 = new class24(class341.field4399, class31.field247, true, class584.field8484, class377.field5020);
                    class449.field6217 = new class360(class341.field4399, class31.field247, true, class290.field3771, class200.field2405, class377.field5020);
                    class240.field3001 = new class593(class341.field4399, class31.field247, class489.field6828);
                    class393.field5190 = new class138(class341.field4399, class31.field247, class44.field372, class601.field8674, class566.field8314);
                    class562.field8276 = new class525(class341.field4399, class31.field247, class489.field6828);
                    class643.field9362 = new class148(class341.field4399, class31.field247, class489.field6828);
                    class344.field4461 = new class247(class341.field4399, class31.field247, class319.field4071, class377.field5020);
                    class503.field6971 = new class604(class341.field4399, class31.field247, class489.field6828);
                    class258.field3325 = new class96(class341.field4399, class31.field247, class489.field6828);
                    class255.field3276 = new class236(class341.field4399, class31.field247, class489.field6828);
                    class530.field7446 = new class367(class341.field4399, class31.field247, class420.field5435);
                    class29.field203 = new class614(class341.field4399, class31.field247, class489.field6828);
                    class280.method1594(class593.field8621, (byte) 58, class377.field5020, class39.field299, class280.field3679);
                    class442.method2593((byte) 90, class300.field3851);
                    class369.field4864 = new class618(class31.field247, class245.field3143, class185.field2237);
                    class191.field2300 = new class251(class31.field247, class245.field3143, class185.field2237, new class507());
                    class183.field2221 = class377.field5024.method987(class31.field247, 22);
                    class183.field2223 = 65;
                    class33.method191(1070578988);
                    class16.field126.method1755(!class565.field8299.method3590(class529.field7429, -2), (byte) 29);
                    class281.field3700 = new class292();
                    class529.method3013(4);
                    class620.method3563(class418.field5428, (byte) -90);
                    class366.method2049(class491.field6848, 23197, class377.field5020);
                    class141.field1707 = 120;
                }
            } else if (class141.field1707 == 120) {
                int var34 = class119.method698((byte) 116, class39.field299);
                int var35 = class310.method1723(115);
                if (var34 < var35) {
                    class183.field2221 = class106.field1293.method987(class31.field247, 22) + var34 * 100 / var35 + "%";
                    class183.field2223 = 70;
                } else {
                    class347.method1936(class210.field2560, class39.field299, (byte) 2);
                    class350.method1950(class547.field8049, 10);
                    class183.field2221 = class209.field2555.method987(class31.field247, 22);
                    class183.field2223 = 70;
                    class141.field1707 = 130;
                }
            } else if (class141.field1707 == 130) {
                if (class596.field8637.method2582("huffman", "", -125)) {
                    class493 var36 = new class493(class596.field8637.method2570((byte) 82, "", "huffman"));
                    class91.method554(-128, var36);
                    class183.field2221 = class54.field455.method987(class31.field247, 22);
                    class183.field2223 = 75;
                    class141.field1707 = 140;
                } else {
                    class183.field2221 = class632.field9110.method987(class31.field247, 22) + "0%";
                    class183.field2223 = 75;
                }
            } else if (class141.field1707 == 140) {
                if (class280.field3679.method2574(-66)) {
                    class183.field2221 = class492.field6866.method987(class31.field247, 22);
                    class141.field1707 = 150;
                    class183.field2223 = 80;
                } else {
                    class183.field2221 = class354.field4641.method987(class31.field247, 22) + class280.field3679.method2572(1726) + "%";
                    class183.field2223 = 80;
                }
            } else if (class141.field1707 == 150) {
                if (class48.field401.method2574(-45)) {
                    class183.field2221 = class442.field6108.method987(class31.field247, 22);
                    class183.field2223 = 82;
                    class141.field1707 = 160;
                } else {
                    class183.field2221 = class196.field2376.method987(class31.field247, 22) + class48.field401.method2572(1726) + "%";
                    class183.field2223 = 82;
                }
            } else if (class141.field1707 == 160) {
                if (class593.field8621.method2574(-101)) {
                    class183.field2221 = class150.field1793.method987(class31.field247, 22);
                    class141.field1707 = 170;
                    class183.field2223 = 85;
                } else {
                    class183.field2221 = class150.field1793.method987(class31.field247, 22) + class593.field8621.method2572(1726) + "%";
                    class183.field2223 = 85;
                }
            } else if (class141.field1707 == 170) {
                if (class584.field8486.method2578(-117, "details")) {
                    class353.method1969(class584.field8486, class106.field1298, class299.field3844, class16.field126, class450.field6233, class284.field3721, class281.field3700);
                    class183.field2221 = class240.field2994.method987(class31.field247, 22);
                    class183.field2223 = 89;
                    class141.field1707 = 190;
                } else {
                    class183.field2221 = class53.field450.method987(class31.field247, 22) + class584.field8486.method2577("details", 0) + "%";
                    class183.field2223 = 87;
                }
            } else if (class141.field1707 == 190) {
                class386.field5085 = new int[class255.field3276.field2887];
                class118.field1486 = new boolean[class255.field3276.field2887];
                class267.field3471 = new String[class258.field3325.field1192];
                for (int var37 = 0; var37 < class255.field3276.field2887; var37++) {
                    if (class255.field3276.method1341(var37, (byte) -1).field2739 == 0) {
                        class118.field1486[var37] = true;
                        class563.field8281++;
                    }
                    class386.field5085[var37] = -1;
                }
                class182.method997((byte) 37);
                class314.field4002 = class280.field3679.method2579(-1, "loginscreen");
                class443.field6122 = class280.field3679.method2579(-1, "lobbyscreen");
                class368.field4834.method2564(0, false, true);
                class282.field3709.method2564(0, true, true);
                class39.field299.method2564(0, true, true);
                class593.field8621.method2564(0, true, true);
                class596.field8637.method2564(0, true, true);
                class280.field3679.method2564(0, true, true);
                class489.field6828.field6068 = 2;
                class87.field1048 = true;
                class507.field7035.field6068 = 2;
                class106.field1286.field6068 = 2;
                class584.field8484.field6068 = 2;
                class200.field2405.field6068 = 2;
                class44.field372.field6068 = 2;
                class319.field4071.field6068 = 2;
                class196.method1066(class565.field8299.field2168, (byte) 83, -1, -1, false);
                class183.field2221 = class381.field5046.method987(class31.field247, 22);
                class141.field1707 = 200;
                class183.field2223 = 95;
            } else if (class141.field1707 == 200) {
                class35.method200(2, 2);
            }
        } else if (class516.field7285.method2574(-57)) {
            class183.field2221 = class592.field8587.method987(class31.field247, 22);
            class141.field1707 = 50;
            class183.field2223 = 25;
        } else {
            class183.field2221 = class206.field2471.method987(class31.field247, 22);
            class183.field2223 = 25;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "()V", line = 989)
    public static final void method1402() {
        for (int var0 = 0; var0 < class106.field1289; var0++) {
            int[] var1 = class405.field5331[var0];
            for (int var2 = 0; var2 < class422.field5452; var2++) {
                var1[var2] = 0;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V", line = 1007)
    public final void method1316(int arg0) {
        field3200++;
        if (~class529.field7429 != arg0) {
            this.method1409(32);
            return;
        }
        try {
            this.method1409(32);
        } catch (Throwable var3) {
            class443.method2597(var3, var3.getMessage() + " (Recovered) " + this.method1304((byte) -121), (byte) 107);
            class24.method144(-2, 0);
        }
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V", line = 1028)
    public final void method1312(int arg0) {
        if (class529.field7429 == arg0) {
            try {
                this.method1413(19711);
            } catch (Throwable var3) {
                class443.method2597(var3, var3.getMessage() + " (Recovered) " + this.method1304((byte) -123), (byte) 101);
                class24.method144(-2, 0);
            }
        } else {
            this.method1413(19711);
        }
        field3206++;
    }

    @OriginalMember(owner = "client!client", name = "l", descriptor = "(I)V", line = 1049)
    public static final void method1403(int arg0) {
        int var1 = class370.field4878;
        int[] var2 = class519.field7302;
        int var3 = class58.field544 ? var1 : class474.field6637 + var1;
        for (int var4 = 0; var4 < var3; var4++) {
            class463 var5;
            if (var4 < var1) {
                var5 = class459.field6329[var2[var4]];
            } else {
                var5 = ((class415) class309.field3938.method2645((long) class194.field2345[var4 - var1], (byte) -106)).field5390;
            }
            if (var5.field8660 == arg0) {
                var5.field6431 = 0;
                if (var5.field6472 < 0) {
                    var5.field6451 = false;
                } else {
                    int var6 = var5.method2694(28146);
                    if ((var6 & 0x1) == 0) {
                        if ((var5.field8661 & 0x7F) != 0 || (var5.field8652 & 0x7F) != 0) {
                            var5.field6451 = false;
                            continue;
                        }
                    } else if ((var5.field8661 & 0x7F) != 64 || (var5.field8652 & 0x7F) != 64) {
                        var5.field6451 = false;
                        continue;
                    }
                    int var10002;
                    if (var6 == 1) {
                        int var7 = var5.field8661 >> 7;
                        int var8 = var5.field8652 >> 7;
                        if (class405.field5331[var7][var8] != var5.field6472) {
                            var5.field6451 = true;
                            continue;
                        }
                        if (class457.field6296[var7][var8] > 1) {
                            var10002 = class457.field6296[var7][var8]--;
                            var5.field6451 = true;
                            continue;
                        }
                    } else {
                        int var9 = (var6 - 1) * 64 + 60;
                        int var10 = var5.field8661 - var9 >> 7;
                        int var11 = var5.field8652 - var9 >> 7;
                        int var12 = var5.field8661 + var9 >> 7;
                        int var13 = var5.field8652 + var9 >> 7;
                        if (!class161.method883(var11, var5.field6472, 1, var12, var10, var13)) {
                            for (int var14 = var10; var14 <= var12; var14++) {
                                for (int var15 = var11; var15 <= var13; var15++) {
                                    if (class405.field5331[var14][var15] == var5.field6472) {
                                        var10002 = class457.field6296[var14][var15]--;
                                    }
                                }
                            }
                            var5.field6451 = true;
                            continue;
                        }
                    }
                    if (var5 instanceof class545 && var5.field6484 != null && class335.field4358 >= var5.field6484.field5887 && class335.field4358 < var5.field6484.field5892) {
                        ((class545) var5).field7975 = false;
                    }
                    var5.field6451 = false;
                    var5.field8649 = class426.method2400(-1, var5.field8652, var5.field8661, var5.field8660);
                    class380.method2203(var5, true);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "init", descriptor = "()V", line = 1170)
    public final void init() {
        field3209++;
        if (!this.method1303(true)) {
            return;
        }
        class457.field6292 = new class220();
        class457.field6292.field2715 = Integer.parseInt(this.getParameter("worldid"));
        class592.field8605 = new class220();
        class592.field8605.field2715 = Integer.parseInt(this.getParameter("lobbyid"));
        class592.field8605.field2713 = this.getParameter("lobbyaddress");
        class644.field9387 = new class220();
        class644.field9387.field2715 = Integer.parseInt(this.getParameter("demoid"));
        class644.field9387.field2713 = this.getParameter("demoaddress");
        class36.field282 = class314.method1741(Integer.parseInt(this.getParameter("modewhere")), 22);
        if (!class10.method54((byte) -119, class36.field282) && class507.field7033 != class36.field282) {
            class36.field282 = class507.field7033;
        }
        class309.field3940 = class241.method1362(Integer.parseInt(this.getParameter("modewhat")), (byte) 99);
        if (class97.field1195 != class309.field3940 && class434.field5896 != class309.field3940 && class309.field3940 != class208.field2501) {
            class309.field3940 = class208.field2501;
        }
        try {
            class31.field247 = Integer.parseInt(this.getParameter("lang"));
        } catch (Exception var12) {
            class31.field247 = 0;
        }
        String var1 = this.getParameter("objecttag");
        if (var1 != null && var1.equals("1")) {
            class199.field2396 = true;
        } else {
            class199.field2396 = false;
        }
        String var2 = this.getParameter("js");
        if (var2 != null && var2.equals("1")) {
            class545.field8022 = true;
        } else {
            class545.field8022 = false;
        }
        String var3 = this.getParameter("advert");
        if (var3 != null && var3.equals("1")) {
            class136.field1664 = true;
        } else {
            class136.field1664 = false;
        }
        String var4 = this.getParameter("game");
        if (var4 != null) {
            if (var4.equals("0")) {
                class341.field4399 = class486.field6795;
            } else if (var4.equals("1")) {
                class341.field4399 = class320.field4082;
            }
        }
        try {
            class95.field1177 = Integer.parseInt(this.getParameter("affid"));
        } catch (Exception var11) {
            class95.field1177 = 0;
        }
        class355.field4650 = this.getParameter("quiturl");
        class22.field153 = this.getParameter("settings");
        if (class22.field153 == null) {
            class22.field153 = "";
        }
        String var5 = this.getParameter("country");
        if (var5 != null) {
            try {
                class562.field8277 = Integer.parseInt(var5);
            } catch (Exception var10) {
                class562.field8277 = 0;
            }
        }
        class341.field4402 = Integer.parseInt(this.getParameter("colourid"));
        if (class341.field4402 < 0 || class414.field5375.length <= class341.field4402) {
            class341.field4402 = 0;
        }
        if (Integer.parseInt(this.getParameter("sitesettings_member")) == 1) {
            class379.field5037 = true;
            class556.field8169 = true;
        }
        String var6 = this.getParameter("frombilling");
        if (var6 != null && var6.equals("true")) {
            class351.field4536 = true;
        }
        class59.field562 = this.getParameter("sskey");
        if (class59.field562 != null && class59.field562.length() < 2) {
            class59.field562 = null;
        }
        String var7 = this.getParameter("force64mb");
        if (var7 != null && var7.equals("true")) {
            class545.field7989 = true;
        }
        String var8 = this.getParameter("worldflags");
        if (var8 != null) {
            try {
                class641.field9242 = Integer.parseInt(var8);
            } catch (Exception var9) {
            }
        }
        class216.field2633 = this;
        if (class486.field6795 == class341.field4399) {
            class168.field2051 = 765;
            class381.field5050 = 503;
        } else if (class341.field4399 == class320.field4082) {
            class168.field2051 = 640;
            class381.field5050 = 480;
        }
        this.method1308(class309.field3940.method3230(13) + 32, 605, class168.field2051, -12435, class381.field5050);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIILqa;III)V", line = 1305)
    public static final void method1404(int arg0, int arg1, int arg2, int arg3, int arg4, class206 arg5, int arg6, int arg7, int arg8) {
        field3202++;
        class269 var9 = (class269) class19.method124(arg6, arg0, arg1);
        if (var9 != null) {
            class437 var10 = class16.field126.method1759(false, var9.method342(-2329));
            int var11 = var9.method333((byte) 70) & 0x3;
            int var12 = var9.method337(true);
            if (var10.field5943 == -1) {
                int var13 = arg3;
                if (var10.field5972 > 0) {
                    var13 = arg8;
                }
                if (var12 == 0 || var12 == 2) {
                    if (var11 == 0) {
                        arg5.method1195(arg4 ^ 0x1, arg7, 4, var13, arg2);
                    } else if (var11 == 1) {
                        arg5.method1115(4, var13, arg2, arg7, true);
                    } else if (var11 == 2) {
                        arg5.method1195(1, arg7 + 3, 4, var13, arg2);
                    } else if (var11 == 3) {
                        arg5.method1115(4, var13, arg2 + 3, arg7, true);
                    }
                }
                if (var12 == 3) {
                    if (var11 == 0) {
                        arg5.method1118(var13, (byte) 78, 1, arg7, arg2, 1);
                    } else if (var11 == 1) {
                        arg5.method1118(var13, (byte) 117, 1, arg7 + 3, arg2, 1);
                    } else if (var11 == 2) {
                        arg5.method1118(var13, (byte) 88, 1, arg7 + 3, arg2 + 3, 1);
                    } else if (var11 == 3) {
                        arg5.method1118(var13, (byte) 116, 1, arg7, arg2 + 3, 1);
                    }
                }
                if (var12 == 2) {
                    if (var11 == 0) {
                        arg5.method1115(4, var13, arg2, arg7, true);
                    } else if (var11 == 1) {
                        arg5.method1195(1, arg7 + 3, 4, var13, arg2);
                    } else if (var11 == 2) {
                        arg5.method1115(4, var13, arg2 + 3, arg7, true);
                    } else if (var11 == 3) {
                        arg5.method1195(1, arg7, 4, var13, arg2);
                    }
                }
            } else {
                class251.method1423(arg2, var11, arg5, arg7, (byte) -125, var10);
            }
        }
        if (arg4 != 0) {
            method1407(null);
        }
        class269 var14 = (class269) class198.method1072(arg6, arg0, arg1, field3218 == null ? (field3218 = method1420("fp")) : field3218);
        if (var14 != null) {
            class437 var15 = class16.field126.method1759(false, var14.method342(-2329));
            int var16 = var14.method333((byte) 70) & 0x3;
            int var17 = var14.method337(true);
            if (var15.field5943 != -1) {
                class251.method1423(arg2, var16, arg5, arg7, (byte) -81, var15);
            } else if (var17 == 9) {
                int var18 = -1118482;
                if (var15.field5972 > 0) {
                    var18 = -1179648;
                }
                if (var16 == 0 || var16 == 2) {
                    arg5.method1154(arg7, var18, arg7 + 3, true, arg2, arg2 + 3);
                } else {
                    arg5.method1154(arg7, var18, arg7 + 3, true, arg2 + 3, arg2);
                }
            }
        }
        class269 var19 = (class269) class543.method3171(arg6, arg0, arg1);
        if (var19 == null) {
            return;
        }
        class437 var20 = class16.field126.method1759(false, var19.method342(-2329));
        int var21 = var19.method333((byte) 70) & 0x3;
        if (var20.field5943 != -1) {
            class251.method1423(arg2, var21, arg5, arg7, (byte) 90, var20);
            return;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(BI)V", line = 1442)
    private final void method1405(byte arg0, int arg1) {
        class124.field1526 = 0;
        class232.field2861.field5935 = arg1;
        if (arg0 <= 112) {
            field3203 = null;
        }
        class13.field100 = null;
        class173.field2108 = null;
        class232.field2861.field5936++;
        field3199++;
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "()V", line = 1460)
    public static final void method1406() {
        int var0 = class370.field4878;
        int[] var1 = class519.field7302;
        int var2 = class58.field544 ? var0 : class474.field6637 + var0;
        for (int var3 = 0; var3 < var2; var3++) {
            class463 var4;
            if (var3 < var0) {
                var4 = class459.field6329[var1[var3]];
            } else {
                var4 = ((class415) class309.field3938.method2645((long) class194.field2345[var3 - var0], (byte) -85)).field5390;
            }
            if (var4.field6472 >= 0) {
                int var5 = var4.method2694(28146);
                if ((var5 & 0x1) == 0) {
                    if ((var4.field8661 & 0x7F) == 0 && (var4.field8652 & 0x7F) == 0) {
                        continue;
                    }
                } else if ((var4.field8661 & 0x7F) == 64 && (var4.field8652 & 0x7F) == 64) {
                    continue;
                }
                if (var4 instanceof class545 && var4.field6484 != null && class335.field4358 >= var4.field6484.field5887 && class335.field4358 < var4.field6484.field5892) {
                    ((class545) var4).field7975 = false;
                }
                var4.field8649 = class426.method2400(-1, var4.field8652, var4.field8661, var4.field8660);
                class380.method2203(var4, true);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Let;)Z", line = 1505)
    public static final boolean method1407(class509 arg0) {
        if (class2.field8) {
            if (method1412(arg0).field3493 != 0) {
                return false;
            }
            if (arg0.field7197 == 0) {
                return false;
            }
        }
        return arg0.field7125;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(I)V", line = 1522)
    public final void method1302(int arg0) {
        method1399(2);
        field3211++;
        class512.method2941(-96);
        class564.method3293(109);
        class557.method3259(51);
        class180.method988(-17464);
        class32.method184((byte) 92);
        class330.method1857((byte) 92);
        class475.method2773(17375);
        class9.method49((byte) 127);
        class544.method3188(-29311);
        class369.method2065(6);
        class552.method3231(116);
        class7.method39(116);
        class515.method2953(-128);
        class206.method1170(-75);
        class625.method3588(-119);
        class458.method2669(-9321);
        class292.method1637(false);
        class193.method1052(16);
        class391.method2246(1);
        class436.method2525(true);
        class201.method1085((byte) 41);
        class383.method2210(-89);
        class631.method3626((byte) -78);
        class438.method2550((byte) 125);
        class320.method1764((byte) -99);
        class629.method3606(false);
        class364.method2040(-1003);
        class384.method2216(103);
        class81.method472(-82);
        class40.method212(-93);
        class471.method2749(20468);
        class224.method1286(-92);
        class390.method2240(-1522074006);
        class316.method1748((byte) -125);
        class554.method3247(-112);
        class590.method3424(0);
        class24.method152(350);
        class360.method2020(-27591);
        class478.method2792((byte) -48);
        class593.method3443(2);
        class138.method771((byte) -97);
        class525.method2981((byte) 79);
        class148.method815(8076);
        class604.method3471(-120);
        class236.method1340((byte) -114);
        class367.method2060(-123);
        class614.method3524((byte) 33);
        class618.method3551((byte) -102);
        class415.method2369((byte) -22);
        class504.method2909((byte) -96);
        class484.method2810(false);
        class373.method2081(3);
        class413.method2357(true);
        class284.method1603(-1);
        class542.method3155((byte) -87);
        class308.method1707(-128);
        class98.method602(-81);
        class342.method1909(24);
        class601.method3463((byte) -87);
        class354.method1992(5743);
        class509.method2931(0);
        class536.method3054(-12);
        class545.method3197(-102);
        class10.method53(-127);
        class355.method1999(113);
        class441.method2585(-1);
        class374.method2095((byte) 0);
        class463.method2697(256);
        class90.method552(-81);
        class185.method1011(-122);
        class541.method3150(false);
        class197.method1068(72);
        class459.method2681(true);
        class565.method3294(0);
        class268.method1503((byte) 102);
        class548.method3215((byte) -103);
        class188.method1026((byte) -102);
        class230.method1319(-32019);
        class639.method3662((byte) -23);
        class13.method110(6407);
        class101.method611((byte) -39);
        class265.method1482(0);
        class412.method2352((byte) 109);
        class283.method1602(95);
        class613.method3522(7);
        class29.method164(90);
        class22.method138(true);
        class220.method1271(0);
        class418.method2379((byte) 57);
        class399.method2288(-126);
        class534.method3051((byte) 78);
        class46.method242((byte) 113);
        class181.method994(-4469);
        class498.method2875((byte) 45);
        class183.method1001(true);
        class502.method2901(false);
        class172.method960((byte) -124);
        class157.method868(true);
        class159.method874(-110);
        class313.method1737(255);
        class129.method730(-138105567);
        class437.method2539((byte) 106);
        class152.method839(-1);
        class174.method970(29306);
        class74.method429(64);
        class607.method3493(-59);
        class448.method2624((byte) -28);
        class309.method1715(103);
        class64.method368((byte) -48);
        class216.method1237((byte) 105);
        class469.method2732(-1);
        class11.method56(-108);
        class274.method1555(-85);
        class218.method1254((byte) -107);
        class93.method563(false);
        class114.method679((byte) -125);
        class130.method735(122);
        class184.method1010((byte) -92);
        class381.method2207((byte) -6);
        class636.method3650(500);
        class585.method3401(0);
        class150.method820((byte) 93);
        class264.method1478(true);
        class42.method221(false);
        class598.method3458(6235);
        class170.method950(2);
        class318.method1761((byte) 8);
        class398.method2286(-101);
        class173.method965((byte) -124);
        class455.method2659();
        class434.method2508((byte) 72);
        class352.method1961(92);
        class191.method1031(0);
        class127.method721((byte) -44);
        class595.method3450(28933);
        class288.method1618(47);
        class67.method375(-121);
        class630.method3610();
        class353.method1968();
        class258.method1450(53);
        class287.method1611();
        class580.method3380(96);
        class107.method622(-75);
        class255.method1442(56);
        class306.method1693(-20866);
        class567.method3306((byte) 122);
        class486.method2824(69);
        class312.method1735(-1);
        class118.method693((byte) -42);
        class217.method1248(false);
        class497.method2870(6133);
        class66.method372((byte) -128);
        class395.method2278((byte) 104);
        class279.method1588(11384);
        class259.method1455((byte) 77);
        class414.method2361(false);
        class562.method3286(121);
        class533.method3046(29729);
        class524.method2979((byte) -3);
        class615.method3538(-1);
        class531.method3031(-18188);
        class433.method2507(82);
        class605.method3480(28117);
        class405.method2312(63);
        class356.method2008(51);
        class450.method2632(0);
        class445.method2605((byte) -123);
        class377.method2196(14);
        class45.method241(45);
        class507.method2913((byte) 127);
        class62.method353((byte) -97);
        class137.method763((byte) -67);
        class196.method1065((byte) 102);
        class587.method3406((byte) -90);
        class465.method2713();
        class370.method2074((byte) 90);
        class493.method2846(false);
        class431.method2495(19649);
        class108.method632(43);
        class402.method2298((byte) -42);
        class503.method2903((byte) 92);
        class92.method557((byte) -112);
        class126.method720((byte) -113);
        class232.method1332((byte) -113);
        class249.method1397(false);
        class328.method1850(31);
        class31.method180((byte) -126);
        class202.method1086(82);
        class241.method1363(-14514);
        class61.method350(false);
        class329.method1852((byte) 42);
        class483.method2803((byte) 43);
        class645.method3725(57);
        class55.method310(true);
        class347.method1938(1103);
        class147.method811((byte) -95);
        class424.method2393();
        class85.method502((byte) -102);
        class326.method1785((byte) 117);
        class416.method2372(3767);
        class622.method3566(120);
        class200.method1079(-22561);
        class253.method1433(255);
        class237.method1343(126);
        class198.method1071(41);
        class518.method2961(true);
        class262.method1466(1);
        class245.method1385(false);
        class115.method681(50);
        class141.method781((byte) 42);
        class103.method614(-124);
        class319.method1763(false);
        class57.method323(-8192);
        class350.method1949(0);
        class36.method202(50);
        class280.method1593(-1021);
        class117.method688(0);
        class479.method2796((byte) -103);
        class640.method3672(false);
        class365.method2043(6972);
        class473.method2756(65535);
        class59.method344(523);
        class382.method2209(1);
        class528.method3005(false);
        class485.method2820(false);
        class30.method165(0);
        class569.method3319((byte) -123);
        class547.method3210(8);
        class91.method556(31540);
        class194.method1056(-16250);
        class295.method1647(false);
        class566.method3302(-84);
        class334.method1870(14083);
        class124.method709(21738);
        class500.method2891();
        class189.method1028(true);
        class555.method3249((byte) -98);
        class617.method3548(-52);
        class394.method2265(-14416);
        class513.method2944(128);
        class529.method3011((byte) -100);
        class550.method3220((byte) -94);
        class638.method3659(false);
        class79.method459((byte) -34);
        class556.method3254(0);
        class58.method334((byte) -33);
        class551.method3227(-1);
        class80.method464(true);
        class646.method3727(-18510);
        class225.method1289(true);
        class19.method131(94);
        class429.method2489(-107);
        class301.method1666(false);
        class420.method2386((byte) -120);
        class94.method575();
        class307.method1697(-1);
        class294.method1641(128);
        class568.method3317();
        class132.method742();
        class214.method1226();
        class411.method2351(false);
        class388.method2233(-99);
        class273.method1526();
        class322.method1774(-1570736702);
        class89.method533((byte) 45);
        class272.method1519((byte) -40);
        class344.method1926(1172067312);
        class102.method613((byte) -59);
        class186.method1013();
        class97.method597(27100);
        class82.method490(-54);
        class359.method2017((byte) 125);
        class543.method3176(true);
        class276.method1569(0);
        class462.method2689(1742436164);
        class105.method619(-1);
        class39.method208(10);
        class133.method745(83);
        class588.method3411(58);
        class386.method2226(112);
        class571.method3326((byte) -18);
        class323.method1778(30385);
        class578.method3363(-105);
        class50.method266((byte) 17);
        class558.method3268(0);
        class263.method1474(4);
        class537.method3121(1);
        class380.method2204(-119);
        class387.method2232(-5);
        class95.method583((byte) -42);
        class376.method2190(0);
        class113.method658((byte) 70);
        class583.method3391((byte) 115);
        class162.method889(3355);
        class88.method518(false);
        class238.method1354(true);
        class303.method1670(-81);
        class208.method1200(0);
        class632.method3632(-1883);
        class242.method1376((byte) -124);
        class2.method8(54);
        class385.method2219(99);
        class428.method2446(-10594);
        class44.method232(-98);
        class160.method878((byte) 51);
        class468.method2728(-120);
        class597.method3454((byte) -111);
        class4.method24(55);
        class520.method2967((byte) 33);
        class521.method2969(-118);
        class480.method2798(-23428);
        class634.method3644(-30179);
        class116.method684(62);
        class643.method3708(0);
        class393.method2263((byte) -6);
        class314.method1740((byte) -107);
        class297.method1651(39);
        class290.method1629(32);
        class608.method3502((byte) -128);
        class610.method3508();
        class461.method2684((byte) 118);
        class456.method2664(0);
        class205.method1099(false);
        class425.method2394(-16294);
        class244.method1384((byte) -118);
        class589.method3414((byte) -114);
        class611.method3513(-17303);
        class457.method2665(2);
        class110.method639((byte) 114);
        class289.method1627((byte) 118);
        class530.method3020(3);
        class472.method2751(0);
        class286.method1608(-4262);
        class83.method493(84);
        class315.method1744(-85);
        class539.method3147((byte) -109);
        class240.method1360(true);
        class333.method1866(1);
        class341.method1907((byte) 60);
        class435.method2515((byte) -18);
        class586.method3405(91);
        class602.method3466((byte) -32);
        class145.method797(-2);
        class228.method1301(34);
        class281.method1596(-25194);
        int var2 = 26 % ((arg0 - 81) / 44);
        class466.method2721(255);
        class106.method620((byte) 119);
        class378.method2198(768);
        class368.method2064(-13328);
        class427.method2402(-1350635487);
        class219.method1264(4096);
        class76.method436(-4096);
        class195.method1060((byte) -100);
        class351.method1951(126);
        class73.method396();
        class311.method1725((byte) 32);
        class41.method220(12547);
        class211.method1213(116);
        class176.method978();
        class300.method1662(false);
        class43.method225(14);
        class442.method2594(-128);
        class491.method2837(-106);
        class644.method3720(3);
        class570.method3322(0);
        class260.method1460((byte) -52);
        class5.method28(-106);
        class482.method2801(-17145);
        class209.method1206(-18596);
        class422.method2392(-1);
        class447.method2620((byte) -126);
        class151.method824(-109);
        class167.method935((byte) -128);
        class337.method1899(55);
        class535.method3052(128);
        class592.method3438(-11876);
        class559.method3270((byte) 90);
        class366.method2045(128);
        class343.method1911(-1);
        class538.method3142((byte) -31);
        class546.method3202((byte) 50);
        class250.method1421(24768);
        class596.method3451(8048);
        class522.method2971(false);
        class516.method2958(-5979);
        class128.method729((byte) -48);
        class637.method3653(true);
        class357.method2011((byte) 91);
        class246.method1388(-7);
        class252.method1432(true);
        class60.method347(100);
        class389.method2236(-93);
        class48.method255((byte) -93);
        class362.method2033(3168);
        class603.method3469(true);
        class430.method2490(896);
        class187.method1023((byte) 19);
        class563.method3288(127);
        class177.method981(3);
        class6.method37(51);
        class396.method2280((byte) 89);
        class257.method1449(-59);
        class426.method2397(3863);
        class34.method193((byte) 51);
        class358.method2013(0);
        class204.method1092(-8099);
        class325.method1780(73);
        class143.method790(true);
        class532.method3043(1);
        class474.method2760(105);
        class78.method451((byte) 13);
        class136.method759(-1);
        class298.method1657((byte) 110);
        class489.method2831(4096);
        class266.method1486(false);
        class104.method617(15373);
        class131.method737(83);
        class267.method1489(255);
        class403.method2301((byte) -88);
        class53.method301(-86);
        class561.method3276((byte) 103);
        class63.method366(2);
        class140.method779((byte) -87);
        class443.method2599(-31277);
        class612.method3517(-1);
        class75.method433((byte) 77);
        class523.method2975(103);
        class340.method1902(0);
        class14.method111(-2);
        class492.method2841((byte) -107);
        class86.method505(7);
        class175.method977(-7319);
        class161.method880(52);
        class299.method1660(31816);
        class16.method114(20696);
        class633.method3640((byte) -63);
        class379.method2200(123);
        class584.method3396(65);
        class156.method859((byte) -103);
        class207.method1199(8);
        class99.method606(3162);
        class271.method1511((byte) 122);
        class119.method699(-32113);
        class404.method2308(-1);
        class476.method2782((byte) 80);
        class37.method204((byte) -112);
        class511.method2940(54);
        class519.method2962((byte) -126);
        class71.method391(-8256);
        class464.method2709(true);
        class54.method308(255);
        class178.method984(17372);
        class210.method1207(87);
        class371.method2077((byte) 117);
        class467.method2726((byte) -47);
        class410.method2346(18228);
        class51.method279(120);
        class449.method2627((byte) 79);
        class69.method382(56);
        class164.method892((byte) -11);
        class527.method3004(-108);
        class439.method2583(54);
        class514.method2949(false);
        class277.method1572((byte) 119);
        class282.method1599(16777215);
        class560.method3273(true);
        class199.method1074((byte) 88);
        if (class229.field2843) {
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V", line = 1999)
    public final void method1309(int arg0) {
        if (class545.field7989) {
            class252.field3258 = 64;
        }
        field3212++;
        Frame var2 = new Frame("Jagex");
        var2.pack();
        if (arg0 != 0) {
            method1412(null);
        }
        var2.dispose();
        class314.method1739(arg0 ^ 0x2);
        class468.field6547 = new class201(class74.field873);
        class232.field2861 = new class436();
        if (class507.field7033 != class36.field282) {
            class358.field4717 = new byte[50][];
        }
        class565.field8299 = new class625(class74.field873);
        if (class507.field7033 == class36.field282) {
            class457.field6292.field2713 = this.getCodeBase().getHost();
        } else if (class10.method54((byte) 117, class36.field282)) {
            class457.field6292.field2713 = this.getCodeBase().getHost();
            class457.field6292.field2710 = class457.field6292.field2715 + 40000;
            class592.field8605.field2710 = class592.field8605.field2715 + 40000;
            class457.field6292.field2711 = class457.field6292.field2715 + 50000;
            class644.field9387.field2710 = class644.field9387.field2715 + 40000;
            class592.field8605.field2711 = class592.field8605.field2715 + 50000;
            class644.field9387.field2711 = class644.field9387.field2715 + 50000;
        } else if (class578.field8435 == class36.field282) {
            class457.field6292.field2713 = "127.0.0.1";
            class592.field8605.field2713 = "127.0.0.1";
            class457.field6292.field2710 = class457.field6292.field2715 + 40000;
            class644.field9387.field2713 = "127.0.0.1";
            class592.field8605.field2710 = class592.field8605.field2715 + 40000;
            class457.field6292.field2711 = class457.field6292.field2715 + 50000;
            class644.field9387.field2710 = class644.field9387.field2715 + 40000;
            class592.field8605.field2711 = class592.field8605.field2715 + 50000;
            class644.field9387.field2711 = class644.field9387.field2715 + 50000;
        }
        if (class341.field4399 == class320.field4082) {
            class236.field2894 = true;
            class369.field4865 = class520.field7310;
            class175.field2134 = 16777215;
            class171.field2082 = 0;
            class80.field963 = class365.field4789;
            class379.field5035 = class504.field6991;
            class578.field8430 = class531.field7472;
        } else {
            class379.field5035 = class156.field1897;
            class80.field963 = class148.field1767;
            class369.field4865 = class414.field5383;
            class578.field8430 = class44.field371;
        }
        if (class486.field6795 == class341.field4399) {
            class387.field5117 = false;
        }
        class450.field6230 = class340.field4390 = class14.field110 = class30.field224 = new short[256];
        class237.field2960 = class457.field6292;
        class443.field6109 = class9.method45((byte) 28, class41.field331);
        class368.field4859 = class479.method2794((byte) -91, true, class41.field331);
        class117.field1476 = class165.field2028;
        try {
            if (class74.field873.field2021 != null) {
                class587.field8516 = new class213(class74.field873.field2021, 5200, 0);
                for (int var3 = 0; var3 < 32; var3++) {
                    class253.field3272[var3] = new class213(class74.field873.field2025[var3], 6000, 0);
                }
                class124.field1529 = new class213(class74.field873.field2029, 6000, 0);
                class202.field2424 = new class320(255, class587.field8516, class124.field1529, 500000);
                class228.field2801 = new class213(class74.field873.field2019, 24, 0);
                class74.field873.field2021 = null;
                class74.field873.field2019 = null;
                class74.field873.field2029 = null;
                class74.field873.field2025 = null;
            }
        } catch (IOException var4) {
            class587.field8516 = null;
            class124.field1529 = null;
            class202.field2424 = null;
            class228.field2801 = null;
        }
        if (class507.field7033 != class36.field282) {
            class252.field3260 = true;
        }
        if (class486.field6795 == class341.field4399) {
            class79.field941 = class89.field1092.method987(class31.field247, 22);
        } else if (class341.field4399 == class320.field4082) {
            class79.field941 = class91.field1125.method987(class31.field247, 22);
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Let;)Let;", line = 2128)
    public static final class509 method1408(class509 arg0) {
        int var1 = method1412(arg0).method1504((byte) 108);
        if (var1 == 0) {
            return null;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            arg0 = class61.method348(arg0.field7054, true);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @OriginalMember(owner = "client!client", name = "m", descriptor = "(I)V", line = 2150)
    private final void method1409(int arg0) {
        field3210++;
        if (class137.field1671 == 13) {
            return;
        }
        class335.field4358++;
        if (class335.field4358 % 1000 == 1) {
            GregorianCalendar var2 = new GregorianCalendar();
            class271.field3524 = var2.get(11) * 600 + var2.get(12) * 10 + var2.get(13) / 6;
            class614.field8898.setSeed((long) class271.field3524);
        }
        if (class335.field4358 % 50 == 0) {
            class310.field3942 = class224.field2753;
            class119.field1509 = class83.field1008;
            class224.field2753 = 0;
            class83.field1008 = 0;
        }
        this.method1416((byte) 83);
        if (class114.field1413 != null) {
            class114.field1413.method2211(arg0 - 149);
        }
        class622.method3567((byte) -59);
        class443.field6109.method187((byte) 121);
        class368.field4859.method168((byte) -25);
        if (class210.field2560 != null) {
            class210.field2560.method1138((int) class190.method1030(false));
        }
        class529.method3015((byte) 96);
        class311.field3978 = 0;
        class300.field3853 = 0;
        for (class397 var3 = class443.field6109.method183((byte) 45); var3 != null; var3 = class443.field6109.method183((byte) 61)) {
            int var6 = var3.method1513((byte) -47);
            if (var6 == 2 || var6 == 3) {
                char var7 = var3.method1514(16729);
                if (class127.method724(-8) && (var7 == '`' || var7 == '§')) {
                    if (class355.method2000(false)) {
                        class34.method197(11161);
                    } else {
                        class45.method237(true);
                    }
                } else if (class300.field3853 < 128) {
                    class294.field3802[class300.field3853] = var3;
                    class300.field3853++;
                }
            } else if (var6 == 0 && class311.field3978 < 75) {
                class265.field3448[class311.field3978] = var3;
                class311.field3978++;
            }
        }
        class549.field8067 = 0;
        for (class379 var4 = class368.field4859.method178((byte) 79); var4 != null; var4 = class368.field4859.method178((byte) 33)) {
            int var5 = var4.method700((byte) 126);
            if (var5 == -1) {
                class479.field6733.method1040(var4, arg0 ^ 0xFFFFFFAE);
            } else if (var5 == 6) {
                class549.field8067 += var4.method703(3);
            } else if (class340.method1903(var5, 2)) {
                class5.field43.method1040(var4, -122);
                if (class5.field43.method1055(0) > 10) {
                    class5.field43.method1054((byte) -105);
                }
            }
        }
        if (arg0 != 32) {
            this.method1312(-38);
        }
        if (class355.method2000(false)) {
            class607.method3497((byte) -66);
        }
        if (class137.field1671 == 0) {
            this.method1401((byte) 108);
            class310.method1719(2);
        } else if (class137.field1671 == 1) {
            this.method1401((byte) -44);
            class310.method1719(2);
        } else if (class171.method957((byte) 7, class137.field1671)) {
            class529.method3009((byte) 22);
        }
        if (class70.method384(class137.field1671, 0) && !class171.method957((byte) 7, class137.field1671)) {
            this.method1400((byte) 61);
            class257.method1448(-16805);
            class389.method2234(arg0 - 142);
        } else if (class362.method2032(arg0 ^ 0x30, class137.field1671) && !class171.method957((byte) 7, class137.field1671)) {
            this.method1400((byte) 61);
            class389.method2234(-107);
        } else if (class137.field1671 == 11) {
            class389.method2234(-126);
        } else if (class524.method2978(class137.field1671, arg0 ^ 0xFFFFFFEC) && !class171.method957((byte) 7, class137.field1671)) {
            class277.method1571(-551697684);
        } else if (class137.field1671 == 12) {
            class389.method2234(-125);
            if (class518.field7295 != -3 && class518.field7295 != 2 && class518.field7295 != 15) {
                class542.method3152(false, -14485);
            }
        }
        class75.method432((byte) -63, class210.field2560);
        class5.field43.method1054((byte) -105);
    }

    @OriginalMember(owner = "client!client", name = "n", descriptor = "(I)V", line = 2323)
    public static final void method1410(int arg0) {
        int var1 = class370.field4878;
        int[] var2 = class519.field7302;
        for (int var3 = 0; var3 < class474.field6637 + var1; var3++) {
            class463 var4;
            if (var3 < var1) {
                var4 = class459.field6329[var2[var3]];
            } else {
                var4 = ((class415) class309.field3938.method2645((long) class194.field2345[var3 - var1], (byte) -104)).field5390;
            }
            if (var4.field8660 == arg0 && var4.field6472 >= 0) {
                int var5 = var4.method2694(28146);
                if ((var5 & 0x1) == 0) {
                    if ((var4.field8661 & 0x7F) != 0 || (var4.field8652 & 0x7F) != 0) {
                        continue;
                    }
                } else if ((var4.field8661 & 0x7F) != 64 || (var4.field8652 & 0x7F) != 64) {
                    continue;
                }
                int var10002;
                if (var5 == 1) {
                    int var6 = var4.field8661 >> 7;
                    int var7 = var4.field8652 >> 7;
                    if (var4.field6472 > class405.field5331[var6][var7]) {
                        class405.field5331[var6][var7] = var4.field6472;
                        class457.field6296[var6][var7] = 1;
                    } else if (class405.field5331[var6][var7] == var4.field6472) {
                        var10002 = class457.field6296[var6][var7]++;
                    }
                } else {
                    int var8 = (var5 - 1) * 64 + 60;
                    int var9 = var4.field8661 - var8 >> 7;
                    int var10 = var4.field8652 - var8 >> 7;
                    int var11 = var4.field8661 + var8 >> 7;
                    int var12 = var4.field8652 + var8 >> 7;
                    for (int var13 = var9; var13 <= var11; var13++) {
                        for (int var14 = var10; var14 <= var12; var14++) {
                            if (var4.field6472 > class405.field5331[var13][var14]) {
                                class405.field5331[var13][var14] = var4.field6472;
                                class457.field6296[var13][var14] = 1;
                            } else if (class405.field5331[var13][var14] == var4.field6472) {
                                var10002 = class457.field6296[var13][var14]++;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "([BI)V", line = 2420)
    private final void method1411(byte[] arg0, int arg1) {
        if (arg1 != 9) {
            return;
        }
        field3201++;
        class374 var3 = new class374(arg0);
        while (true) {
            while (true) {
                int var4 = var3.method2129(-123);
                if (var4 == 0) {
                    return;
                }
                if (var4 == 1) {
                    int[] var5 = class225.field2764 = new int[6];
                    var5[0] = var3.method2136(false);
                    var5[1] = var3.method2136(false);
                    var5[2] = var3.method2136(false);
                    var5[3] = var3.method2136(false);
                    var5[4] = var3.method2136(false);
                    var5[5] = var3.method2136(false);
                } else if (var4 == 4) {
                    int var6 = var3.method2129(-90);
                    class59.field566 = new int[var6];
                    for (int var7 = 0; var7 < var6; var7++) {
                        class59.field566[var7] = var3.method2136(false);
                        if (class59.field566[var7] == 65535) {
                            class59.field566[var7] = -1;
                        }
                    }
                } else if (var4 == 5) {
                    int var8 = var3.method2129(-115);
                    class143.field1711 = new int[var8];
                    for (int var9 = 0; var9 < var8; var9++) {
                        class143.field1711[var9] = var3.method2136(false);
                        if (class143.field1711[var9] == 65535) {
                            class143.field1711[var9] = -1;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Let;)Ldb;", line = 2498)
    public static final class268 method1412(class509 arg0) {
        class268 var1 = (class268) class173.field2105.method2645(((long) arg0.field7045 << 32) + (long) arg0.field7086, (byte) -95);
        return var1 == null ? arg0.field7186 : var1;
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V", line = 2502)
    public final void method1311(int arg0) {
        field3196++;
        if (class352.field4542) {
            class474.method2759((byte) -120);
        }
        if (class210.field2560 != null) {
            class210.field2560.method1103((byte) 94);
        }
        if (class110.field1367 != null) {
            class643.method3703(class74.field873, class110.field1367, (byte) 98);
            class110.field1367 = null;
        }
        if (class597.field8642 != null) {
            class597.field8642.method2266((byte) -108);
            class597.field8642 = null;
        }
        if (arg0 != 2) {
            return;
        }
        class528.method3006(-3083);
        class232.field2861.method2518(arg0 ^ 0xFFFFFFFD);
        class468.field6547.method1081(-4);
        if (class399.field5251 != null) {
            class399.field5251.method2359(60);
            class399.field5251 = null;
        }
    }

    @OriginalMember(owner = "client!client", name = "o", descriptor = "(I)V", line = 2544)
    private final void method1413(int arg0) {
        field3198++;
        if (class137.field1671 == 13) {
            return;
        }
        long var2 = class138.method767((byte) 69) / 1000000L - class119.field1496;
        class119.field1496 = class138.method767((byte) 69) / 1000000L;
        boolean var4 = class475.method2766(-3);
        if (var4 && class157.field1921 && class382.field5052 != null) {
            class382.field5052.method1249((byte) 119);
        }
        if (class549.method3217(class137.field1671, (byte) 125)) {
            if (class615.field8919 != 0L && class190.method1030(false) > class615.field8919) {
                class196.method1066(class99.method608(false), (byte) 83, class565.field8299.field2179, class565.field8299.field2174, false);
            } else if (!class210.field2560.method1173() && class130.field1593) {
                class81.method473(arg0 + 1149);
            }
        }
        if (class110.field1367 == null) {
            Container var5;
            if (class431.field5843 == null) {
                var5 = class74.field873.field2014;
            } else {
                var5 = class431.field5843;
            }
            int var6 = var5.getSize().width;
            int var7 = var5.getSize().height;
            if (class431.field5843 == var5) {
                Insets var8 = class431.field5843.getInsets();
                var6 -= var8.left + var8.right;
                var7 -= var8.top + var8.bottom;
            }
            if (class7.field56 != var6 || class202.field2423 != var7) {
                if (class210.field2560 == null || class210.field2560.method1135()) {
                    class314.method1739(2);
                } else {
                    class202.field2423 = var7;
                    class7.field56 = var6;
                }
                class615.field8919 = class190.method1030(false) + 500L;
            }
        }
        if (class110.field1367 != null && !class55.field481 && class549.method3217(class137.field1671, (byte) 127)) {
            class196.method1066(class565.field8299.field2168, (byte) 83, -1, -1, false);
        }
        boolean var9 = false;
        if (class191.field2306) {
            var9 = true;
            class191.field2306 = false;
        }
        if (var9) {
            class416.method2373(0);
        }
        if (class210.field2560 != null && class210.field2560.method1173() || class99.method608(false) != 1) {
            class562.method3279((byte) -117);
        }
        if (class137.field1671 == 0) {
            class552.method3232(class412.field5358[class341.field4402], var9, arg0 - 19711, class183.field2223, class414.field5375[class341.field4402], class32.field250[class341.field4402], class183.field2221);
        } else if (class137.field1671 == 1) {
            class597.method3452(class414.field5375[class341.field4402].getRGB(), class210.field2560, class459.field6320, true, class210.field2560.method1173() | var9, class412.field5358[class341.field4402].getRGB(), class32.field250[class341.field4402].getRGB());
        } else if (class588.method3413(class137.field1671, (byte) -100)) {
            class588.method3410((byte) 104);
        } else if (class497.method2872(class137.field1671, 122)) {
            class588.method3410((byte) 115);
        } else if (class171.method957((byte) 7, class137.field1671)) {
            if (class561.field8252 == 1) {
                if (class114.field1430 < class116.field1454) {
                    class114.field1430 = class116.field1454;
                }
                int var11 = (class114.field1430 - class116.field1454) * 50 / class114.field1430;
                class164.method893(class326.field4163.method987(class31.field247, 22) + "<br>(" + var11 + "%)", true, class137.field1673, arg0 ^ 0x7F9);
            } else if (class561.field8252 == 2) {
                if (class101.field1250 > class467.field6535) {
                    class467.field6535 = class101.field1250;
                }
                int var10 = (class467.field6535 - class101.field1250) * 50 / class467.field6535 + 50;
                class164.method893(class326.field4163.method987(class31.field247, 22) + "<br>(" + var10 + "%)", true, class137.field1673, arg0 - 505);
            } else {
                class164.method893(class326.field4163.method987(class31.field247, 22), true, class137.field1673, 19206);
            }
        } else if (class137.field1671 == 9) {
            class640.method3679(-11922, var2);
        } else if (class137.field1671 == 12) {
            class164.method893(class414.field5386.method987(class31.field247, arg0 - 19689) + "<br>" + class629.field9029.method987(class31.field247, 22), true, class137.field1673, 19206);
        }
        if (class241.field3010 == 3) {
            for (int var12 = 0; var12 < class315.field4023; var12++) {
                Rectangle var13 = class250.field3224[var12];
                if (class200.field2400[var12]) {
                    class210.field2560.method1118(-1996553985, (byte) 61, var13.width, var13.x, var13.y, var13.height);
                } else if (class468.field6543[var12]) {
                    class210.field2560.method1118(-1996554240, (byte) 105, var13.width, var13.x, var13.y, var13.height);
                }
            }
        }
        if (class355.method2000(false)) {
            class24.method142(class210.field2560, false);
        }
        if (arg0 != 19711) {
            field3215 = null;
        }
        if (class549.method3217(class137.field1671, (byte) 126) && class241.field3010 == 0 && class99.method608(false) == 1 && !var9 && class165.field2030.equals("1.1")) {
            int var14 = 0;
            for (int var15 = 0; var15 < class315.field4023; var15++) {
                if (class468.field6543[var15]) {
                    class468.field6543[var15] = false;
                    class277.field3654[var14++] = class250.field3224[var15];
                }
            }
            class210.field2560.method1139(class277.field3654, var14);
        } else if (class137.field1671 != 0) {
            class210.field2560.method1123();
            for (int var16 = 0; var16 < class315.field4023; var16++) {
                class468.field6543[var16] = false;
            }
        }
        if (class565.field8299.field2207 == 0) {
            class462.method2688(15L, (byte) 110);
        } else if (class565.field8299.field2207 == 1) {
            class462.method2688(10L, (byte) 110);
        } else if (class565.field8299.field2207 == 2) {
            class462.method2688(5L, (byte) 110);
        } else if (class565.field8299.field2207 == 3) {
            class462.method2688(2L, (byte) 110);
        }
        if (class87.field1048) {
            class298.method1658(arg0 - 40043);
        }
        if (class565.field8299.field2176 && class137.field1671 == 2 && class599.field8668 != -1) {
            class565.field8299.field2176 = false;
            class565.field8299.method3585(true, class74.field873);
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "()V", line = 2785)
    public static final void method1414() {
        int var0 = class370.field4878;
        int[] var1 = class519.field7302;
        boolean var2 = class565.field8299.field2173 == 1 && var0 > 200 || class565.field8299.field2173 == 0 && var0 > 50;
        for (int var3 = 0; var3 < var0; var3++) {
            class545 var13 = class459.field6329[var1[var3]];
            if (var13.method3195(false)) {
                var13.method321((byte) 63);
                if (var13.field8653 >= 0 && var13.field8650 >= 0 && var13.field8663 < class106.field1289 && var13.field8654 < class422.field5452) {
                    var13.field7975 = var13.field6430 ? var2 : false;
                    if (class103.field1265 == var13) {
                        var13.field6472 = Integer.MAX_VALUE;
                    } else {
                        int var14 = 0;
                        if (!var13.field6451) {
                            var14++;
                        }
                        if (var13.field6414 > class335.field4358) {
                            var14 += 2;
                        }
                        int var15 = var14 + (5 - var13.method2694(28146) << 2);
                        if (var13.field7986) {
                            var15 += 512;
                        } else {
                            if (class192.field2324 == 0) {
                                var15 += 32;
                            } else {
                                var15 += 128;
                            }
                            var15 += 256;
                        }
                        var13.field6472 = var15 + 1;
                    }
                } else {
                    var13.field6472 = -1;
                }
            } else {
                var13.field6472 = -1;
            }
        }
        for (int var4 = 0; var4 < class474.field6637; var4++) {
            class459 var10 = ((class415) class309.field3938.method2645((long) class194.field2345[var4], (byte) -110)).field5390;
            if (var10.method2673(false) && var10.field6334.method427(-13453, class281.field3700)) {
                var10.method321((byte) 74);
                if (var10.field8653 >= 0 && var10.field8650 >= 0 && var10.field8663 < class106.field1289 && var10.field8654 < class422.field5452) {
                    int var11 = 0;
                    if (!var10.field6451) {
                        var11++;
                    }
                    if (var10.field6414 > class335.field4358) {
                        var11 += 2;
                    }
                    int var12 = var11 + (5 - var10.method2694(28146) << 2);
                    if (class192.field2324 == 0) {
                        if (var10.field6334.field867) {
                            var12 += 64;
                        } else {
                            var12 += 128;
                        }
                    } else if (class192.field2324 == 1) {
                        if (var10.field6334.field867) {
                            var12 += 32;
                        } else {
                            var12 += 64;
                        }
                    }
                    if (var10.field6334.field851) {
                        var12 += 1024;
                    } else if (!var10.field6334.field848) {
                        var12 += 256;
                    }
                    var10.field6472 = var12 + 1;
                } else {
                    var10.field6472 = -1;
                }
            } else {
                var10.field6472 = -1;
            }
        }
        for (int var5 = 0; var5 < class225.field2765.length; var5++) {
            class458 var6 = class225.field2765[var5];
            if (var6 != null) {
                if (var6.field6309 == 1) {
                    class415 var7 = (class415) class309.field3938.method2645((long) var6.field6303, (byte) -112);
                    if (var7 != null) {
                        class459 var8 = var7.field5390;
                        if (var8.field6472 >= 0) {
                            var8.field6472 += 2048;
                        }
                    }
                } else if (var6.field6309 == 10) {
                    class545 var9 = class459.field6329[var6.field6303];
                    if (var9 != null && class103.field1265 != var9 && var9.field6472 >= 0) {
                        var9.field6472 += 2048;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "([Let;IIIIIIIII)V", line = 2950)
    public static final void method1415(class509[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        for (int var10 = 0; var10 < arg0.length; var10++) {
            class509 var11 = arg0[var10];
            if (var11 != null && var11.field7054 == arg1) {
                int var12 = var11.field7139 + arg6;
                int var13 = var11.field7110 + arg7;
                int var14;
                int var15;
                int var16;
                int var17;
                if (var11.field7197 == 2) {
                    var14 = arg2;
                    var15 = arg3;
                    var16 = arg4;
                    var17 = arg5;
                } else {
                    int var18 = var11.field7094 + var12;
                    int var19 = var11.field7059 + var13;
                    if (var11.field7197 == 9) {
                        var18++;
                        var19++;
                    }
                    var14 = var12 > arg2 ? var12 : arg2;
                    var15 = var13 > arg3 ? var13 : arg3;
                    var16 = var18 < arg4 ? var18 : arg4;
                    var17 = var19 < arg5 ? var19 : arg5;
                }
                if (var11.field7197 == 0 || var11.field7122 || method1412(var11).field3493 != 0 || class40.field312 == var11 || class467.field6532 == var11.field7154) {
                    if (!method1407(var11)) {
                        if (class289.field3757 == var11 && class193.method1049(-118, class289.field3757) != null) {
                            class390.field5151 = true;
                            class592.field8608 = var12;
                            class242.field3113 = var13;
                        }
                        if (var11.field7183 || var14 < var16 && var15 < var17) {
                            if (var11.field7105 && arg8 >= var14 && arg9 >= var15 && arg8 < var16 && arg9 < var17) {
                                for (class503 var20 = (class503) class119.field1503.method1050((byte) 73); var20 != null; var20 = (class503) class119.field1503.method1047(-7962)) {
                                    if (var20.field6985) {
                                        var20.method3187(true);
                                        var20.field6973.field7162 = false;
                                    }
                                }
                                if (class395.field5221 == 0) {
                                    class289.field3757 = null;
                                    class40.field312 = null;
                                }
                                class141.field1705 = 0;
                                class570.field8372 = false;
                                class567.field8325 = false;
                                if (!class473.field6634) {
                                    class9.method46(118);
                                }
                            }
                            boolean var21;
                            if (class368.field4859.method167(64) >= var14 && class368.field4859.method169(63) >= var15 && class368.field4859.method167(64) < var16 && class368.field4859.method169(92) < var17) {
                                var21 = true;
                            } else {
                                var21 = false;
                            }
                            if (!class449.field6225 && var21) {
                                if (var11.field7131 >= 0) {
                                    class71.field684 = var11.field7131;
                                } else if (var11.field7105) {
                                    class71.field684 = -1;
                                }
                            }
                            if (!class473.field6634 && arg8 >= var14 && arg9 >= var15 && arg8 < var16 && arg9 < var17) {
                                class533.method3048(var11, arg9 - var13, arg8 - var12, true);
                            }
                            boolean var22 = false;
                            if (class368.field4859.method175(20) && var21) {
                                var22 = true;
                            }
                            boolean var23 = false;
                            class379 var24 = (class379) class5.field43.method1050((byte) 73);
                            if (var24 != null && var24.method700((byte) -126) == 0 && var24.method701(5) >= var14 && var24.method705(5) >= var15 && var24.method701(5) < var16 && var24.method705(5) < var17) {
                                var23 = true;
                            }
                            if (var11.field7152 != null) {
                                for (int var25 = 0; var25 < var11.field7152.length; var25++) {
                                    if (class443.field6109.method185(53, var11.field7152[var25])) {
                                        if (var11.field7092 == null || class335.field4358 >= var11.field7092[var25]) {
                                            byte var26 = var11.field7165[var25];
                                            if (var26 == 0 || ((var26 & 0x8) == 0 || !class443.field6109.method185(53, 86) && !class443.field6109.method185(53, 82) && !class443.field6109.method185(53, 81)) && ((var26 & 0x2) == 0 || class443.field6109.method185(53, 86)) && ((var26 & 0x1) == 0 || class443.field6109.method185(53, 82)) && ((var26 & 0x4) == 0 || class443.field6109.method185(53, 81))) {
                                                if (var25 < 10) {
                                                    class543.method3180(var25 + 1, "", var11.field7045, -1, true);
                                                } else if (var25 == 10) {
                                                    class281.method1595(25098);
                                                    class268 var27 = method1412(var11);
                                                    class406.method2314(var27.method1499(0), -83, var27.field3500, var11);
                                                    class208.field2503 = class210.method1208(var11, (byte) 42);
                                                    if (class208.field2503 == null) {
                                                        class208.field2503 = "Null";
                                                    }
                                                    class472.field6608 = var11.field7184 + "<col=ffffff>";
                                                }
                                                int var28 = var11.field7057[var25];
                                                if (var11.field7092 == null) {
                                                    var11.field7092 = new int[var11.field7152.length];
                                                }
                                                if (var28 == 0) {
                                                    var11.field7092[var25] = Integer.MAX_VALUE;
                                                } else {
                                                    var11.field7092[var25] = class335.field4358 + var28;
                                                }
                                            }
                                        }
                                    } else if (var11.field7092 != null) {
                                        var11.field7092[var25] = 0;
                                    }
                                }
                            }
                            if (var23) {
                                class108.method630(var24.method705(5) - var13, 0, var24.method701(5) - var12, var11);
                            }
                            if (class289.field3757 != null && class289.field3757 != var11 && var21 && method1412(var11).method1501(0)) {
                                class195.field2369 = var11;
                            }
                            if (class40.field312 == var11) {
                                class521.field7315 = true;
                                class229.field2842 = var12;
                                class491.field6853 = var13;
                            }
                            if (var11.field7122 || var11.field7154 != 0) {
                                if (var21 && class549.field8067 != 0 && var11.field7172 != null) {
                                    class503 var29 = new class503();
                                    var29.field6985 = true;
                                    var29.field6973 = var11;
                                    var29.field6981 = class549.field8067;
                                    var29.field6975 = var11.field7172;
                                    class119.field1503.method1040(var29, -106);
                                }
                                if (class289.field3757 != null || class473.field6634 || class524.field7340 != var11.field7154 && class141.field1705 > 0) {
                                    var23 = false;
                                    var22 = false;
                                    var21 = false;
                                }
                                if (var11.field7154 != 0) {
                                    if (class369.field4875 == var11.field7154 || class447.field6192 == var11.field7154) {
                                        class124.field1530 = var11;
                                        if (class259.field3340 != null) {
                                            class259.field3340.method3464(class210.field2560, (byte) -121, var11.field7059);
                                        }
                                        if (class369.field4875 == var11.field7154) {
                                            if (!class473.field6634 && arg8 >= var14 && arg9 >= var15 && arg8 < var16 && arg9 < var17) {
                                                class393.method2262(arg8, 0, arg9, class210.field2560);
                                                for (class319 var30 = (class319) class364.field4781.method1987(true); var30 != null; var30 = (class319) class364.field4781.method1994(6408)) {
                                                    if (arg8 >= var30.field4067 && arg8 < var30.field4069 && arg9 >= var30.field4062 && arg9 < var30.field4063) {
                                                        class9.method46(118);
                                                        class196.method1067(var30.field4064, 24392);
                                                    }
                                                }
                                            }
                                            class355.method1996(var13, false, var12, var11);
                                            continue;
                                        }
                                    }
                                    if (class467.field6532 == var11.field7154) {
                                        if (var11.method2930(0, class210.field2560) == null || class275.field3625 != 0 && class275.field3625 != 3 || class473.field6634 || arg8 < var14 || arg9 < var15 || arg8 >= var16 || arg9 >= var17) {
                                            continue;
                                        }
                                        int var31 = arg8 - var12;
                                        int var32 = arg9 - var13;
                                        int var33 = var11.field7177[var32];
                                        if (var31 < var33 || var31 > var11.field7091[var32] + var33) {
                                            continue;
                                        }
                                        int var34 = var31 - var11.field7094 / 2;
                                        int var35 = var32 - var11.field7059 / 2;
                                        int var36;
                                        if (class617.field8931 == 4) {
                                            var36 = (int) class558.field8223 & 0x3FFF;
                                        } else {
                                            var36 = (int) class558.field8223 + class335.field4369 & 0x3FFF;
                                        }
                                        int var37 = class442.field6100[var36];
                                        int var38 = class442.field6101[var36];
                                        if (class617.field8931 != 4) {
                                            var37 = (class194.field2354 + 256) * var37 >> 8;
                                            var38 = (class194.field2354 + 256) * var38 >> 8;
                                        }
                                        int var39 = var34 * var38 + var35 * var37 >> 15;
                                        int var40 = var35 * var38 - var34 * var37 >> 15;
                                        int var41;
                                        int var42;
                                        if (class617.field8931 == 4) {
                                            var41 = (class429.field5826 >> 7) + (var39 >> 2);
                                            var42 = (class449.field6219 >> 7) - (var40 >> 2);
                                        } else {
                                            int var43 = (class103.field1265.method2694(28146) - 1) * 64;
                                            var41 = (class103.field1265.field8661 - var43 >> 7) + (var39 >> 2);
                                            var42 = (class103.field1265.field8652 - var43 >> 7) - (var40 >> 2);
                                        }
                                        if (class449.field6225 && (class117.field1477 & 0x40) != 0) {
                                            class509 var44 = class369.method2071(class588.field8538, class592.field8606, -20190);
                                            if (var44 == null) {
                                                class281.method1595(25098);
                                            } else {
                                                class22.method139(15, true, var42, (byte) 65, class468.field6542, var41, " ->", class208.field2503, 1L, false, var11.field7082);
                                            }
                                            continue;
                                        }
                                        if (class341.field4399 == class320.field4082) {
                                            class22.method139(51, true, var42, (byte) 65, -1, var41, "", class195.field2371.method987(class31.field247, 22), 1L, false, -1);
                                        }
                                        class22.method139(11, true, var42, (byte) 65, class13.field107, var41, "", class162.field1975, 1L, false, -1);
                                        continue;
                                    }
                                    if (class524.field7340 == var11.field7154) {
                                        class552.field8122 = var11;
                                        if (var21) {
                                            class570.field8372 = true;
                                        }
                                        if (var23) {
                                            int var45 = (int) ((double) (var24.method701(5) - var12 - var11.field7094 / 2) * 2.0D / (double) class353.field4602);
                                            int var46 = (int) (-((double) (var24.method705(5) - var13 - var11.field7059 / 2) * 2.0D / (double) class353.field4602));
                                            int var47 = class619.field8945 + var45 + class353.field4621;
                                            int var48 = class34.field273 + var46 + class353.field4607;
                                            class98 var49 = class95.method593((byte) 34);
                                            if (var49 == null) {
                                                continue;
                                            }
                                            int[] var50 = new int[3];
                                            var49.method599(var50, 6378, var47, var48);
                                            if (var50 != null) {
                                                if (class443.field6109.method185(53, 82) && class633.field9120 > 0) {
                                                    class438.method2569(var50[1], true, var50[0], var50[2]);
                                                    continue;
                                                }
                                                class567.field8325 = true;
                                                class169.field2062 = var50[0];
                                                class218.field2671 = var50[1];
                                                class268.field3502 = var50[2];
                                            }
                                            class141.field1705 = 1;
                                            class611.field8869 = false;
                                            class98.field1220 = class368.field4859.method167(64);
                                            class197.field2382 = class368.field4859.method169(-116);
                                            continue;
                                        }
                                        if (var22 && class141.field1705 > 0) {
                                            if (class141.field1705 == 1 && (class98.field1220 != class368.field4859.method167(64) || class197.field2382 != class368.field4859.method169(-79))) {
                                                class642.field9264 = class619.field8945;
                                                class42.field333 = class34.field273;
                                                class141.field1705 = 2;
                                            }
                                            if (class141.field1705 == 2) {
                                                class611.field8869 = true;
                                                class80.method462(class642.field9264 + (int) ((double) (class98.field1220 - class368.field4859.method167(64)) * 2.0D / (double) class353.field4605), true);
                                                class542.method3170(class42.field333 - (int) ((double) (class197.field2382 - class368.field4859.method169(119)) * 2.0D / (double) class353.field4605), (byte) -68);
                                            }
                                            continue;
                                        }
                                        if (class141.field1705 > 0 && !class611.field8869) {
                                            if ((class157.field1913 == 1 || class210.method1209(-95)) && class199.field2397 > 2) {
                                                class351.method1952(false, class197.field2382, class98.field1220);
                                            } else if (class260.method1461((byte) -17)) {
                                                class351.method1952(false, class197.field2382, class98.field1220);
                                            }
                                        }
                                        class141.field1705 = 0;
                                        continue;
                                    }
                                    if (class199.field2390 == var11.field7154) {
                                        if (var22) {
                                            class194.method1058(-1, var11.field7059, var11.field7094, class368.field4859.method167(64) - var12, class368.field4859.method169(28) - var13);
                                        }
                                        continue;
                                    }
                                    if (class203.field2433 == var11.field7154) {
                                        class415.method2371(var11, var13, 255, var12);
                                        continue;
                                    }
                                }
                                if (!var11.field7160 && var23) {
                                    var11.field7160 = true;
                                    if (var11.field7146 != null) {
                                        class503 var51 = new class503();
                                        var51.field6985 = true;
                                        var51.field6973 = var11;
                                        var51.field6976 = var24.method701(5) - var12;
                                        var51.field6981 = var24.method705(5) - var13;
                                        var51.field6975 = var11.field7146;
                                        class119.field1503.method1040(var51, -115);
                                    }
                                }
                                if (var11.field7160 && var22 && var11.field7056 != null) {
                                    class503 var52 = new class503();
                                    var52.field6985 = true;
                                    var52.field6973 = var11;
                                    var52.field6976 = class368.field4859.method167(64) - var12;
                                    var52.field6981 = class368.field4859.method169(92) - var13;
                                    var52.field6975 = var11.field7056;
                                    class119.field1503.method1040(var52, -113);
                                }
                                if (var11.field7160 && !var22) {
                                    var11.field7160 = false;
                                    if (var11.field7203 != null) {
                                        class503 var53 = new class503();
                                        var53.field6985 = true;
                                        var53.field6973 = var11;
                                        var53.field6976 = class368.field4859.method167(64) - var12;
                                        var53.field6981 = class368.field4859.method169(-90) - var13;
                                        var53.field6975 = var11.field7203;
                                        class105.field1273.method1040(var53, -96);
                                    }
                                }
                                if (var22 && var11.field7170 != null) {
                                    class503 var54 = new class503();
                                    var54.field6985 = true;
                                    var54.field6973 = var11;
                                    var54.field6976 = class368.field4859.method167(64) - var12;
                                    var54.field6981 = class368.field4859.method169(-102) - var13;
                                    var54.field6975 = var11.field7170;
                                    class119.field1503.method1040(var54, -114);
                                }
                                if (!var11.field7162 && var21) {
                                    var11.field7162 = true;
                                    if (var11.field7075 != null) {
                                        class503 var55 = new class503();
                                        var55.field6985 = true;
                                        var55.field6973 = var11;
                                        var55.field6976 = class368.field4859.method167(64) - var12;
                                        var55.field6981 = class368.field4859.method169(71) - var13;
                                        var55.field6975 = var11.field7075;
                                        class119.field1503.method1040(var55, -120);
                                    }
                                }
                                if (var11.field7162 && var21 && var11.field7159 != null) {
                                    class503 var56 = new class503();
                                    var56.field6985 = true;
                                    var56.field6973 = var11;
                                    var56.field6976 = class368.field4859.method167(64) - var12;
                                    var56.field6981 = class368.field4859.method169(53) - var13;
                                    var56.field6975 = var11.field7159;
                                    class119.field1503.method1040(var56, -101);
                                }
                                if (var11.field7162 && !var21) {
                                    var11.field7162 = false;
                                    if (var11.field7182 != null) {
                                        class503 var57 = new class503();
                                        var57.field6985 = true;
                                        var57.field6973 = var11;
                                        var57.field6976 = class368.field4859.method167(64) - var12;
                                        var57.field6981 = class368.field4859.method169(69) - var13;
                                        var57.field6975 = var11.field7182;
                                        class105.field1273.method1040(var57, -99);
                                    }
                                }
                                if (var11.field7145 != null) {
                                    class503 var58 = new class503();
                                    var58.field6973 = var11;
                                    var58.field6975 = var11.field7145;
                                    class91.field1122.method1040(var58, -90);
                                }
                                if (var11.field7038 != null && class222.field2732 > var11.field7130) {
                                    if (var11.field7114 == null || class222.field2732 - var11.field7130 > 32) {
                                        class503 var63 = new class503();
                                        var63.field6973 = var11;
                                        var63.field6975 = var11.field7038;
                                        class119.field1503.method1040(var63, -117);
                                    } else {
                                        label693: for (int var59 = var11.field7130; var59 < class222.field2732; var59++) {
                                            int var60 = class631.field9096[var59 & 0x1F];
                                            for (int var61 = 0; var61 < var11.field7114.length; var61++) {
                                                if (var11.field7114[var61] == var60) {
                                                    class503 var62 = new class503();
                                                    var62.field6973 = var11;
                                                    var62.field6975 = var11.field7038;
                                                    class119.field1503.method1040(var62, -128);
                                                    break label693;
                                                }
                                            }
                                        }
                                    }
                                    var11.field7130 = class222.field2732;
                                }
                                if (var11.field7140 != null && class297.field3825 > var11.field7106) {
                                    if (var11.field7108 == null || class297.field3825 - var11.field7106 > 32) {
                                        class503 var68 = new class503();
                                        var68.field6973 = var11;
                                        var68.field6975 = var11.field7140;
                                        class119.field1503.method1040(var68, -125);
                                    } else {
                                        label669: for (int var64 = var11.field7106; var64 < class297.field3825; var64++) {
                                            int var65 = class509.field7064[var64 & 0x1F];
                                            for (int var66 = 0; var66 < var11.field7108.length; var66++) {
                                                if (var11.field7108[var66] == var65) {
                                                    class503 var67 = new class503();
                                                    var67.field6973 = var11;
                                                    var67.field6975 = var11.field7140;
                                                    class119.field1503.method1040(var67, -126);
                                                    break label669;
                                                }
                                            }
                                        }
                                    }
                                    var11.field7106 = class297.field3825;
                                }
                                if (var11.field7050 != null && class641.field9243 > var11.field7080) {
                                    if (var11.field7039 == null || class641.field9243 - var11.field7080 > 32) {
                                        class503 var73 = new class503();
                                        var73.field6973 = var11;
                                        var73.field6975 = var11.field7050;
                                        class119.field1503.method1040(var73, -119);
                                    } else {
                                        label645: for (int var69 = var11.field7080; var69 < class641.field9243; var69++) {
                                            int var70 = class286.field3730[var69 & 0x1F];
                                            for (int var71 = 0; var71 < var11.field7039.length; var71++) {
                                                if (var11.field7039[var71] == var70) {
                                                    class503 var72 = new class503();
                                                    var72.field6973 = var11;
                                                    var72.field6975 = var11.field7050;
                                                    class119.field1503.method1040(var72, -113);
                                                    break label645;
                                                }
                                            }
                                        }
                                    }
                                    var11.field7080 = class641.field9243;
                                }
                                if (var11.field7135 != null && class108.field1348 > var11.field7070) {
                                    if (var11.field7193 == null || class108.field1348 - var11.field7070 > 32) {
                                        class503 var78 = new class503();
                                        var78.field6973 = var11;
                                        var78.field6975 = var11.field7135;
                                        class119.field1503.method1040(var78, -126);
                                    } else {
                                        label621: for (int var74 = var11.field7070; var74 < class108.field1348; var74++) {
                                            int var75 = class373.field4903[var74 & 0x1F];
                                            for (int var76 = 0; var76 < var11.field7193.length; var76++) {
                                                if (var11.field7193[var76] == var75) {
                                                    class503 var77 = new class503();
                                                    var77.field6973 = var11;
                                                    var77.field6975 = var11.field7135;
                                                    class119.field1503.method1040(var77, -113);
                                                    break label621;
                                                }
                                            }
                                        }
                                    }
                                    var11.field7070 = class108.field1348;
                                }
                                if (var11.field7196 != null && class362.field4769 > var11.field7181) {
                                    if (var11.field7072 == null || class362.field4769 - var11.field7181 > 32) {
                                        class503 var83 = new class503();
                                        var83.field6973 = var11;
                                        var83.field6975 = var11.field7196;
                                        class119.field1503.method1040(var83, -107);
                                    } else {
                                        label597: for (int var79 = var11.field7181; var79 < class362.field4769; var79++) {
                                            int var80 = class308.field3928[var79 & 0x1F];
                                            for (int var81 = 0; var81 < var11.field7072.length; var81++) {
                                                if (var11.field7072[var81] == var80) {
                                                    class503 var82 = new class503();
                                                    var82.field6973 = var11;
                                                    var82.field6975 = var11.field7196;
                                                    class119.field1503.method1040(var82, -114);
                                                    break label597;
                                                }
                                            }
                                        }
                                    }
                                    var11.field7181 = class362.field4769;
                                }
                                if (class354.field4642 > var11.field7061 && var11.field7129 != null) {
                                    class503 var84 = new class503();
                                    var84.field6973 = var11;
                                    var84.field6975 = var11.field7129;
                                    class119.field1503.method1040(var84, -108);
                                }
                                if (class349.field4501 > var11.field7061 && var11.field7142 != null) {
                                    class503 var85 = new class503();
                                    var85.field6973 = var11;
                                    var85.field6975 = var11.field7142;
                                    class119.field1503.method1040(var85, -102);
                                }
                                if (class283.field3714 > var11.field7061 && var11.field7194 != null) {
                                    class503 var86 = new class503();
                                    var86.field6973 = var11;
                                    var86.field6975 = var11.field7194;
                                    class119.field1503.method1040(var86, -92);
                                }
                                if (class277.field3653 > var11.field7061 && var11.field7060 != null) {
                                    class503 var87 = new class503();
                                    var87.field6973 = var11;
                                    var87.field6975 = var11.field7060;
                                    class119.field1503.method1040(var87, -108);
                                }
                                if (class388.field5128 > var11.field7061 && var11.field7149 != null) {
                                    class503 var88 = new class503();
                                    var88.field6973 = var11;
                                    var88.field6975 = var11.field7149;
                                    class119.field1503.method1040(var88, -98);
                                }
                                var11.field7061 = class519.field7305;
                                if (var11.field7148 != null) {
                                    for (int var89 = 0; var89 < class300.field3853; var89++) {
                                        class503 var90 = new class503();
                                        var90.field6973 = var11;
                                        var90.field6984 = class294.field3802[var89].method1516(-95);
                                        var90.field6982 = class294.field3802[var89].method1514(16729);
                                        var90.field6975 = var11.field7148;
                                        class119.field1503.method1040(var90, -109);
                                    }
                                }
                                if (class447.field6203 && var11.field7088 != null) {
                                    class503 var91 = new class503();
                                    var91.field6973 = var11;
                                    var91.field6975 = var11.field7088;
                                    class119.field1503.method1040(var91, -106);
                                }
                            }
                            if (var11.field7197 == 5 && var11.field7127 != -1) {
                                var11.method2915(class643.field9362, -17217, class562.field8276).method3464(class210.field2560, (byte) -46, var11.field7059);
                            }
                            class473.method2755((byte) 81, var11);
                            if (var11.field7197 == 0) {
                                method1415(arg0, var11.field7045, var14, var15, var16, var17, var12 - var11.field7190, var13 - var11.field7104, arg8, arg9);
                                if (var11.field7101 != null) {
                                    method1415(var11.field7101, var11.field7045, var14, var15, var16, var17, var12 - var11.field7190, var13 - var11.field7104, arg8, arg9);
                                }
                                class565 var92 = (class565) class309.field3937.method2645((long) var11.field7045, (byte) -99);
                                if (var92 != null) {
                                    if (class486.field6795 == class341.field4399 && var92.field8293 == 0 && !class473.field6634 && var21 && !class2.field8) {
                                        class9.method46(125);
                                    }
                                    class307.method1700(var17, var15, var12, arg9, arg8, -1, var92.field8297, var16, var14, var13);
                                }
                            }
                        }
                    }
                } else if (var14 < var16 && var15 < var17) {
                    class473.method2755((byte) -117, var11);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V", line = 3851)
    public static final void main(String[] arg0) {
        try {
            if (arg0.length != 6) {
                class264.method1479(true, "Argument count");
            }
            class457.field6292 = new class220();
            class457.field6292.field2715 = Integer.parseInt(arg0[0]);
            class592.field8605 = new class220();
            class592.field8605.field2715 = Integer.parseInt(arg0[1]);
            class644.field9387 = new class220();
            class644.field9387.field2715 = Integer.parseInt(arg0[2]);
            class36.field282 = class578.field8435;
            if (arg0[3].equals("live")) {
                class309.field3940 = class208.field2501;
            } else if (arg0[3].equals("rc")) {
                class309.field3940 = class434.field5896;
            } else if (arg0[3].equals("wip")) {
                class309.field3940 = class97.field1195;
            } else {
                class264.method1479(true, "modewhat");
            }
            class31.field247 = class519.method2964(arg0[4], (byte) 64);
            if (class31.field247 == -1) {
                if (arg0[4].equals("english")) {
                    class31.field247 = 0;
                } else if (arg0[4].equals("german")) {
                    class31.field247 = 1;
                } else {
                    class264.method1479(true, "language");
                }
            }
            class545.field8022 = false;
            class199.field2396 = false;
            if (arg0[5].equals("game0")) {
                class341.field4399 = class486.field6795;
            } else if (arg0[5].equals("game1")) {
                class341.field4399 = class320.field4082;
            } else {
                class264.method1479(true, "game");
            }
            class379.field5037 = true;
            class556.field8169 = true;
            class351.field4536 = false;
            class22.field153 = "";
            class641.field9242 = 0;
            class562.field8277 = 0;
            class341.field4402 = class341.field4399.field7268;
            class95.field1177 = 0;
            class59.field562 = null;
            class545.field7989 = false;
            client var1 = new client();
            class216.field2633 = var1;
            var1.method1317(768, class309.field3940.method3230(13) + 32, false, class341.field4399.field7274, 605, 1024, false, 32);
            class431.field5843.setLocation(40, 40);
        } catch (Exception var3) {
            class443.method2597(var3, null, (byte) 101);
        }
        field3204++;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(B)Ljava/lang/String;", line = 3927)
    public final String method1304(byte arg0) {
        field3207++;
        String var2 = null;
        try {
            var2 = "[1)" + class632.field9113 + "," + class119.field1504 + "," + class106.field1289 + "," + class422.field5452 + "|";
            if (class103.field1265 != null) {
                var2 = var2 + "2)" + class442.field6099 + "," + (class103.field1265.field6483[0] + class632.field9113) + "," + (class103.field1265.field6491[0] + class119.field1504) + "|";
            }
            var2 = var2 + "3)" + class529.field7429 + "|4)" + class565.field8299.field2170 + "|5)" + class99.method608(false) + "|6)" + class185.field2239 + "," + class426.field5495 + "|";
            if (arg0 > -108) {
                field3217 = null;
            }
            var2 = var2 + "7)" + class565.field8299.method993(class529.field7429, -106) + "|";
            var2 = var2 + "8)" + class565.field8299.method990(class529.field7429, -1) + "|";
            var2 = var2 + "9)" + class565.field8299.field2189 + "|";
            var2 = var2 + "10)" + class565.field8299.field2183 + "|";
            var2 = var2 + "11)" + class565.field8299.field2169 + "|";
            var2 = var2 + "12)" + class565.field8299.method3590(class529.field7429, -2) + "|";
            var2 = var2 + "13)" + class252.field3258 + "|";
            var2 = var2 + "14)" + class137.field1671;
            try {
                var2 = var2 + "|15)" + jagmisc.getTotalPhysicalMemory();
            } catch (Throwable var15) {
            }
            try {
                if (class529.field7429 == 2) {
                    Class var3 = Class.forName("java.lang.ClassLoader");
                    Field var4 = var3.getDeclaredField("nativeLibraries");
                    Class var5 = Class.forName("java.lang.reflect.AccessibleObject");
                    Method var6 = var5.getDeclaredMethod("setAccessible", Boolean.TYPE);
                    var6.invoke(var4, Boolean.TRUE);
                    Vector var7 = (Vector) var4.get((field3219 == null ? (field3219 = method1420("client")) : field3219).getClassLoader());
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

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V", line = 4011)
    private final void method1416(byte arg0) {
        field3197++;
        boolean var2 = class232.field2861.method2530(-77);
        if (!var2) {
            this.method1417((byte) 64);
        }
        if (arg0 != 83) {
            this.method1309(-64);
        }
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V", line = 4026)
    private final void method1417(byte arg0) {
        field3214++;
        if (class564.field8289 < class232.field2861.field5936) {
            class237.field2960.field2719 = !class237.field2960.field2719;
            class294.field3797 = (class232.field2861.field5936 * 50 - 50) * 5;
            if (class294.field3797 > 3000) {
                class294.field3797 = 3000;
            }
            if (class232.field2861.field5936 >= 2 && class232.field2861.field5935 == 6) {
                this.method1306(false, "js5connect_outofdate");
                class137.field1671 = 13;
                return;
            }
            if (class232.field2861.field5936 >= 4 && class232.field2861.field5935 == -1) {
                this.method1306(false, "js5crc");
                class137.field1671 = 13;
                return;
            }
            if (class232.field2861.field5936 >= 4 && class358.method2014(class137.field1671, (byte) -6)) {
                if (class232.field2861.field5935 == 7 || class232.field2861.field5935 == 9) {
                    this.method1306(false, "js5connect_full");
                } else if (class232.field2861.field5935 <= 0) {
                    this.method1306(false, "js5io");
                } else {
                    this.method1306(false, "js5connect");
                }
                class137.field1671 = 13;
                return;
            }
        }
        class564.field8289 = class232.field2861.field5936;
        if (class294.field3797 > 0) {
            class294.field3797--;
            return;
        }
        try {
            if (class124.field1526 == 0) {
                class173.field2108 = class74.field873.method924(class237.field2960.method1268(false), class237.field2960.field2713, arg0 ^ 0x41);
                class124.field1526++;
            }
            if (class124.field1526 == 1) {
                if (class173.field2108.field7031 == 2) {
                    this.method1405((byte) 117, 1000);
                    return;
                }
                if (class173.field2108.field7031 == 1) {
                    class124.field1526++;
                }
            }
            if (class124.field1526 == 2) {
                class13.field100 = new class391((Socket) class173.field2108.field7030, class74.field873);
                class374 var2 = new class374(5);
                var2.method2093(class368.field4842.field3279, -124);
                var2.method2131(605, arg0 ^ 0xA6E1B488);
                class13.field100.method2251(var2.field4929, 5, -26995, 0);
                class124.field1526++;
                class247.field3170 = class190.method1030(false);
            }
            if (class124.field1526 == 3) {
                if (class358.method2014(class137.field1671, (byte) -6) || class13.field100.method2249((byte) 4) > 0) {
                    int var3 = class13.field100.method2253(1675886592);
                    if (var3 != 0) {
                        this.method1405((byte) 122, var3);
                        return;
                    }
                    class124.field1526++;
                } else if ((class190.method1030(false) - class247.field3170) > 30000L) {
                    this.method1405((byte) 126, 1001);
                    return;
                }
            }
            if (class124.field1526 == 4) {
                boolean var4 = class137.field1671 == 1 || class70.method384(class137.field1671, 0) || class362.method2032(102, class137.field1671);
                class232.field2861.method2524(!var4, class13.field100, (byte) 34);
                class13.field100 = null;
                class124.field1526 = 0;
                class173.field2108 = null;
            }
        } catch (IOException var5) {
            this.method1405((byte) 127, 1002);
        }
        if (arg0 != 64) {
            field3215 = null;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "([BZ)V", line = 4174)
    private final void method1418(byte[] arg0, boolean arg1) {
        field3213++;
        class374 var3 = new class374(arg0);
        if (arg1) {
            field3215 = null;
        }
        while (true) {
            int var4 = var3.method2129(-73);
            if (var4 == 0) {
                return;
            }
            if (var4 == 2) {
                class281.field3691 = var3.method2136(false);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "()V", line = 4207)
    public static final void method1419() {
        class295.field3806 = 0;
        for (int var0 = 0; var0 < class474.field6637; var0++) {
            class459 var1 = ((class415) class309.field3938.method2645((long) class194.field2345[var0], (byte) -105)).field5390;
            if (var1.field6451 && var1.method2671(122) != -1) {
                int var2 = (var1.method2694(28146) - 1) * 64 + 60;
                int var3 = var1.field8661 - var2 >> 7;
                int var4 = var1.field8652 - var2 >> 7;
                class463 var5 = class137.method762(var3, false, var4, var1.field8660);
                if (var5 != null) {
                    int var6 = var5.field6399;
                    if (var5 instanceof class459) {
                        var6 += 2048;
                    }
                    if (var5.field6431 == 0 && var5.method2671(97) != -1) {
                        class220.field2720[class295.field3806] = var6;
                        class431.field5846[class295.field3806] = var6;
                        class295.field3806++;
                        var5.field6431++;
                    }
                    class220.field2720[class295.field3806] = var6;
                    class431.field5846[class295.field3806] = var1.field6399 + 2048;
                    class295.field3806++;
                    var5.field6431++;
                }
            }
        }
        class222.method1277(class431.field5846, 0, -8720, class220.field2720, class295.field3806 - 1);
    }
}
