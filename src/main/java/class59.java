import java.io.IOException;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oi")
public abstract class class59 {

    @OriginalMember(owner = "client!oi", name = "d", descriptor = "I")
    public int field946 = 4;

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "I")
    private int field943 = 4;

    @OriginalMember(owner = "client!oi", name = "p", descriptor = "I")
    private int field958 = 4;

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "[S")
    private short[] field944 = new short[512];

    @OriginalMember(owner = "client!oi", name = "i", descriptor = "I")
    private int field951 = 0;

    @OriginalMember(owner = "client!oi", name = "h", descriptor = "I")
    private int field950 = 4;

    @OriginalMember(owner = "client!oi", name = "o", descriptor = "I")
    public static int field957 = 100;

    @OriginalMember(owner = "client!oi", name = "t", descriptor = "[[[I")
    public static int[][][] field962 = new int[2][][];

    @OriginalMember(owner = "client!oi", name = "u", descriptor = "Lck;")
    public static class119 field963 = class298.method1987((byte) 12, "(Y<)4col>");

    @OriginalMember(owner = "client!oi", name = "w", descriptor = "[I")
    public static int[] field965 = new int[4096];

    @OriginalMember(owner = "client!oi", name = "c", descriptor = "I")
    public static int field945;

    @OriginalMember(owner = "client!oi", name = "e", descriptor = "I")
    public static int field947;

    @OriginalMember(owner = "client!oi", name = "f", descriptor = "I")
    public static int field948;

    @OriginalMember(owner = "client!oi", name = "g", descriptor = "I")
    public static int field949;

    @OriginalMember(owner = "client!oi", name = "j", descriptor = "I")
    public static int field952;

    @OriginalMember(owner = "client!oi", name = "k", descriptor = "I")
    public static int field953;

    @OriginalMember(owner = "client!oi", name = "l", descriptor = "I")
    public static int field954;

    @OriginalMember(owner = "client!oi", name = "n", descriptor = "I")
    public static int field956;

    @OriginalMember(owner = "client!oi", name = "q", descriptor = "I")
    public static int field959;

    @OriginalMember(owner = "client!oi", name = "s", descriptor = "I")
    public static int field961;

    @OriginalMember(owner = "client!oi", name = "v", descriptor = "I")
    public static int field964;

    @OriginalMember(owner = "client!oi", name = "r", descriptor = "[I")
    public static int[] field960;

    @OriginalMember(owner = "client!oi", name = "m", descriptor = "[S")
    private short[] field955;

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(BI)V", line = 23)
    public static final void method436(byte arg0, int arg1) {
        class142 var2 = (class142) class185.field2933.method1329((byte) 90, (long) arg1);
        if (arg0 == -47) {
            field964++;
            if (var2 != null) {
                var2.method552((byte) -128);
            }
        }
    }

    @OriginalMember(owner = "client!oi", name = "<init>", descriptor = "(IIIII)V", line = 1107)
    public class59(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field950 = arg3;
        this.field958 = arg2;
        this.field951 = arg0;
        this.field946 = arg1;
        this.field943 = arg4;
        this.method443(0);
        this.method446(78);
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(I)V", line = 52)
    public static void method437(int arg0) {
        field965 = null;
        field963 = null;
        field962 = (int[][][]) null;
        field960 = null;
        if (arg0 != 18616) {
            method441(-10);
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(IIZIII)V", line = 65)
    public static final void method438(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
        if (class79.field1226 <= arg1 && arg5 <= field957 && arg4 >= class108.field1650 && class236.field3800 >= arg0) {
            class94.method639(arg0, arg5, arg2, arg4, arg3, arg1);
        } else {
            class135.method899(arg0, (byte) -31, arg3, arg5, arg4, arg1);
        }
        field961++;
        if (arg2) {
            method436((byte) -113, 83);
        }
    }

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "(I)V", line = 84)
    public static final void method439(int arg0) {
        field954++;
        if (arg0 == 1) {
            class174.field2796 = true;
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "([BI)Lsd;", line = 97)
    public static final class278 method440(byte[] arg0, int arg1) {
        field948++;
        if (arg0 == null) {
            return null;
        } else {
            class122 var2 = new class122(arg0, class155.field2475, class7.field152, class232.field3741, class64.field1006, class247.field3989);
            int var3 = 62 / ((-arg1 - 17) / 32);
            class162.method1035(-20432);
            return var2;
        }
    }

    @OriginalMember(owner = "client!oi", name = "c", descriptor = "(I)V", line = 116)
    public static final void method441(int arg0) {
        if (class54.field865 > 1) {
            class54.field865--;
            class91.field1418 = class94.field1456;
        }
        if (class270.field4462 > 0) {
            class270.field4462--;
        }
        field947++;
        if (class63.field1003) {
            class63.field1003 = false;
            class88.method596(-24060);
            return;
        }
        for (int var1 = 0; var1 < 100 && class50.method377(false); var1++) {
        }
        if (class214.field3407 != 30) {
            return;
        }
        class189.method1197(236, (byte) -118, class6.field149);
        Object var2 = class111.field1705.field1519;
        synchronized (class111.field1705.field1519) {
            if (!class81.field1237) {
                class111.field1705.field1523 = 0;
            } else if (class296.field4938 != 0 || class111.field1705.field1523 >= 40) {
                class104.field1591++;
                class6.field149.method966(0, 102);
                class6.field149.method32(0, (byte) -99);
                int var3 = class6.field149.field44;
                int var4 = 0;
                for (int var5 = 0; class111.field1705.field1523 > var5 && class6.field149.field44 - var3 < 240; var5++) {
                    var4++;
                    int var6 = class111.field1705.field1521[var5];
                    if (var6 < 0) {
                        var6 = 0;
                    } else if (var6 > 65534) {
                        var6 = 65534;
                    }
                    int var7 = class111.field1705.field1522[var5];
                    if (var7 < 0) {
                        var7 = 0;
                    } else if (var7 > 65534) {
                        var7 = 65534;
                    }
                    boolean var8 = false;
                    if (class111.field1705.field1521[var5] == -1 && class111.field1705.field1522[var5] == -1) {
                        var8 = true;
                        var7 = -1;
                        var6 = -1;
                    }
                    if (class196.field3142 != var7 || class57.field924 != var6) {
                        int var9 = var6 - class57.field924;
                        int var10 = var7 - class196.field3142;
                        class57.field924 = var6;
                        class196.field3142 = var7;
                        if (class181.field2869 < 8 && var10 >= -32 && var10 <= 31 && var9 >= -32 && var9 <= 31) {
                            var9 += 32;
                            var10 += 32;
                            class6.field149.method40((class181.field2869 << 12) + (var10 << 6) + var9, -38);
                            class181.field2869 = 0;
                        } else if (class181.field2869 < 32 && var10 >= -128 && var10 <= 127 && var9 >= -128 && var9 <= 127) {
                            var9 += 128;
                            var10 += 128;
                            class6.field149.method32(class181.field2869 + 128, (byte) -99);
                            class6.field149.method40((var10 << 8) + var9, -70);
                            class181.field2869 = 0;
                        } else if (class181.field2869 >= 32) {
                            class6.field149.method40(class181.field2869 + 57344, 109);
                            if (var8) {
                                class6.field149.method26(Integer.MIN_VALUE, 82);
                            } else {
                                class6.field149.method26(var7 | var6 << 16, 42);
                            }
                            class181.field2869 = 0;
                        } else {
                            class6.field149.method32(class181.field2869 + 192, (byte) -99);
                            if (var8) {
                                class6.field149.method26(Integer.MIN_VALUE, 79);
                            } else {
                                class6.field149.method26(var6 << 16 | var7, 100);
                            }
                            class181.field2869 = 0;
                        }
                    } else if (class181.field2869 < 2047) {
                        class181.field2869++;
                    }
                }
                class6.field149.method39(class6.field149.field44 - var3, (byte) -128);
                if (class111.field1705.field1523 <= var4) {
                    class111.field1705.field1523 = 0;
                } else {
                    class111.field1705.field1523 -= var4;
                    for (int var11 = 0; var11 < class111.field1705.field1523; var11++) {
                        class111.field1705.field1522[var11] = class111.field1705.field1522[var4 + var11];
                        class111.field1705.field1521[var11] = class111.field1705.field1521[var4 + var11];
                    }
                }
            }
        }
        if (class296.field4938 != 0) {
            class224.field3601++;
            int var13 = class245.field3975;
            int var14 = class210.field3346;
            byte var15 = 0;
            if (class296.field4938 == 2) {
                var15 = 1;
            }
            long var16 = (class226.field3607 - class258.field4139) / 50L;
            if (var16 > 32767L) {
                var16 = 32767L;
            }
            if (var13 < 0) {
                var13 = 0;
            } else if (var13 > 65535) {
                var13 = 65535;
            }
            int var18 = (int) var16;
            if (var14 < 0) {
                var14 = 0;
            } else if (var14 > 65535) {
                var14 = 65535;
            }
            class258.field4139 = class226.field3607;
            class6.field149.method966(0, 241);
            class6.field149.method26(var14 << 16 | var13, 62);
            class6.field149.method72(-2031558584, var18 | var15 << 15);
        }
        if (class289.field4760[96] || class289.field4760[97] || class289.field4760[98] || class289.field4760[99]) {
            class203.field3225 = true;
        }
        if (arg0 >= -114) {
            method438(29, -102, false, 58, 73, -1);
        }
        if (class196.field3153 > 0) {
            class196.field3153--;
        }
        if (class203.field3225 && class196.field3153 <= 0) {
            class196.field3153 = 20;
            class203.field3225 = false;
            class6.field149.method966(0, 226);
            class241.field3868++;
            class6.field149.method72(-2031558584, class4.field114);
            class6.field149.method40(class140.field2253, 61);
        }
        if (class242.field3895 && !class295.field4909) {
            class295.field4909 = true;
            class6.field149.method966(0, 173);
            class6.field149.method32(1, (byte) -99);
            class204.field3242++;
        }
        if (!class242.field3895 && class295.field4909) {
            class295.field4909 = false;
            class204.field3242++;
            class6.field149.method966(0, 173);
            class6.field149.method32(0, (byte) -99);
        }
        if (!class295.field4914) {
            class150.field2389++;
            class6.field149.method966(0, 57);
            class6.field149.method42(class57.method426(119), -29548);
            class295.field4914 = true;
        }
        class63.method471(false);
        if (class214.field3407 != 30) {
            return;
        }
        class187.method1182(2524);
        class167.method1055((byte) 122);
        class144.field2288++;
        if (class144.field2288 > 750) {
            class88.method596(-24060);
            return;
        }
        class222.method1406((byte) -51);
        class88.method599(-18513);
        class157.method1006(0);
        if (class187.field2942 != null) {
            class177.method1129((byte) 52);
        }
        for (int var19 = class216.method1359(true, 0); var19 != -1; var19 = class216.method1359(false, 0)) {
            class220.method1398((byte) -56, var19);
            class1.field18[class19.method151(31, class13.field212++)] = var19;
        }
        for (class179 var20 = class164.method1044(false); var20 != null; var20 = class164.method1044(false)) {
            int var21 = var20.method1147(109);
            int var22 = var20.method1150(1);
            if (var21 == 1) {
                class179.field2856[var22] = var20.field2863;
                class205.field3244[class19.method151(31, class131.field2006++)] = var22;
            } else if (var21 == 2) {
                class221.field3553[var22] = var20.field2859;
                class26.field386[class19.method151(class139.field2224++, 31)] = var22;
            }
        }
        if (class268.field4419 != 0) {
            class10.field179 += 20;
            if (class10.field179 >= 400) {
                class268.field4419 = 0;
            }
        }
        class164.field2592++;
        if (class212.field3377 != null) {
            class120.field1886++;
            if (class120.field1886 >= 15) {
                class26.method194(class212.field3377, -107);
                class212.field3377 = null;
            }
        }
        if (class97.field1486 != null) {
            class26.method194(class97.field1486, -79);
            class23.field353++;
            if (class129.field1984 > class89.field1365 + 5 || class129.field1984 < class89.field1365 - 5 || class14.field222 + 5 < class65.field1024 || class65.field1024 < (class14.field222 - 5)) {
                class54.field866 = true;
            }
            if (class272.field4475 == 0) {
                if (class54.field866 && class23.field353 >= 5) {
                    if (class97.field1486 == class198.field3167 && class249.field4027 != class204.field3241) {
                        class49.field755++;
                        class134 var23 = class97.field1486;
                        byte var24 = 0;
                        if (class253.field4069 == 1 && var23.field2068 == 206) {
                            var24 = 1;
                        }
                        if (var23.field2042[class204.field3241] <= 0) {
                            var24 = 0;
                        }
                        if (class35.method253((byte) 33, client.method620(var23))) {
                            int var25 = class249.field4027;
                            int var26 = class204.field3241;
                            var23.field2042[var26] = var23.field2042[var25];
                            var23.field2054[var26] = var23.field2054[var25];
                            var23.field2042[var25] = -1;
                            var23.field2054[var25] = 0;
                        } else if (var24 == 1) {
                            int var27 = class204.field3241;
                            int var28 = class249.field4027;
                            while (var27 != var28) {
                                if (var27 < var28) {
                                    var23.method886(var28 - 1, -82, var28);
                                    var28--;
                                } else if (var27 > var28) {
                                    var23.method886(var28 + 1, -116, var28);
                                    var28++;
                                }
                            }
                        } else {
                            var23.method886(class204.field3241, -110, class249.field4027);
                        }
                        class6.field149.method966(0, 84);
                        class6.field149.method56(class97.field1486.field2120, (byte) -56);
                        class6.field149.method19((byte) 19, class204.field3241);
                        class6.field149.method40(class249.field4027, -22);
                        class6.field149.method32(var24, (byte) -99);
                    }
                } else if ((class238.field3815 == 1 || class293.method1948(true, class272.field4474 - 1)) && class272.field4474 > 2) {
                    class261.method1674(32);
                } else if (class272.field4474 > 0) {
                    class55.method406(false, class272.field4474 - 1);
                }
                class296.field4938 = 0;
                class97.field1486 = null;
                class120.field1886 = 10;
            }
        }
        class94.field1447 = false;
        class292.field4855 = null;
        class134 var29 = class93.field1439;
        class154.field2463 = false;
        class93.field1439 = null;
        class134 var30 = class78.field1197;
        class13.field215 = 0;
        class78.field1197 = null;
        while (class198.method1267((byte) 8) && class13.field215 < 128) {
            class35.field490[class13.field215] = class298.field5027;
            class87.field1321[class13.field215] = class156.field2491;
            class13.field215++;
        }
        class187.field2942 = null;
        if (class119.field1822 != -1) {
            class81.method557(0, class269.field4437, 0, 0, class131.field2000, (byte) 72, 0, class119.field1822);
        }
        class94.field1456++;
        while (true) {
            class1 var31;
            class134 var32;
            class134 var33;
            do {
                var31 = (class1) class209.field3342.method991(16771501);
                if (var31 == null) {
                    while (true) {
                        class1 var34;
                        class134 var35;
                        class134 var36;
                        do {
                            var34 = (class1) class163.field2569.method991(16771501);
                            if (var34 == null) {
                                while (true) {
                                    class1 var37;
                                    class134 var38;
                                    class134 var39;
                                    do {
                                        var37 = (class1) class120.field1893.method991(16771501);
                                        if (var37 == null) {
                                            if (class30.field431 && class187.field2942 == null) {
                                                class30.field431 = false;
                                            }
                                            if (class131.field2007 != null) {
                                                class270.method1795(27359);
                                            }
                                            if (class56.field917 != -1) {
                                                int var40 = class56.field917;
                                                int var41 = class110.field1682;
                                                boolean var42 = class173.method1104(var41, true, 0, 0, 0, 0, class124.field1917.field4973[0], var40, 0, (byte) 9, class124.field1917.field4963[0], 0);
                                                class56.field917 = -1;
                                                if (var42) {
                                                    class10.field191 = class210.field3346;
                                                    class268.field4419 = 1;
                                                    class10.field179 = 0;
                                                    class295.field4907 = class245.field3975;
                                                }
                                            }
                                            class140.method929(true);
                                            if (class93.field1439 != var29) {
                                                if (var29 != null) {
                                                    class26.method194(var29, -68);
                                                }
                                                if (class93.field1439 != null) {
                                                    class26.method194(class93.field1439, -70);
                                                }
                                            }
                                            if (class78.field1197 != var30 && class238.field3820 == class215.field3442) {
                                                if (var30 != null) {
                                                    class26.method194(var30, -87);
                                                }
                                                if (class78.field1197 != null) {
                                                    class26.method194(class78.field1197, -85);
                                                }
                                            }
                                            if (class78.field1197 == null) {
                                                if (class215.field3442 > 0) {
                                                    class215.field3442--;
                                                }
                                            } else if (class238.field3820 > class215.field3442) {
                                                class215.field3442++;
                                                if (class238.field3820 == class215.field3442) {
                                                    class26.method194(class78.field1197, -124);
                                                }
                                            }
                                            if (class68.field1063 == 1) {
                                                class113.method720(28203);
                                            } else if (class68.field1063 == 2) {
                                                class53.method395(2047);
                                            } else {
                                                class280.method1861(-105);
                                            }
                                            for (int var43 = 0; var43 < 5; var43++) {
                                                int var10002 = class150.field2377[var43]++;
                                            }
                                            int var44 = class94.method645(1023);
                                            int var45 = class56.method420((byte) -116);
                                            if (var44 > 4500 && var45 > 4500) {
                                                class212.field3376++;
                                                class270.field4462 = 250;
                                                class70.method507(4000, 0);
                                                class6.field149.method966(0, 208);
                                            }
                                            class44.field665++;
                                            class49.field760++;
                                            class72.field1126++;
                                            if (class72.field1126 > 500) {
                                                class72.field1126 = 0;
                                                int var46 = (int) (Math.random() * 8.0D);
                                                if ((var46 & 0x4) == 4) {
                                                    class30.field432 += class126.field1942;
                                                }
                                                if ((var46 & 0x2) == 2) {
                                                    class111.field1706 += class82.field1250;
                                                }
                                                if ((var46 & 0x1) == 1) {
                                                    class217.field3497 += class76.field1188;
                                                }
                                            }
                                            if (class30.field432 < -40) {
                                                class126.field1942 = 1;
                                            }
                                            if (class111.field1706 < -55) {
                                                class82.field1250 = 2;
                                            }
                                            if (class217.field3497 < -50) {
                                                class76.field1188 = 2;
                                            }
                                            if (class49.field760 > 500) {
                                                class49.field760 = 0;
                                                int var47 = (int) (Math.random() * 8.0D);
                                                if ((var47 & 0x2) == 2) {
                                                    class221.field3549 += class236.field3795;
                                                }
                                                if ((var47 & 0x1) == 1) {
                                                    class42.field651 += class106.field1631;
                                                }
                                            }
                                            if (class221.field3549 < -20) {
                                                class236.field3795 = 1;
                                            }
                                            if (class30.field432 > 40) {
                                                class126.field1942 = -1;
                                            }
                                            if (class217.field3497 > 50) {
                                                class76.field1188 = -2;
                                            }
                                            if (class42.field651 < -60) {
                                                class106.field1631 = 2;
                                            }
                                            if (class42.field651 > 60) {
                                                class106.field1631 = -2;
                                            }
                                            if (class111.field1706 > 55) {
                                                class82.field1250 = -2;
                                            }
                                            if (class221.field3549 > 10) {
                                                class236.field3795 = -1;
                                            }
                                            if (class44.field665 > 50) {
                                                class49.field764++;
                                                class6.field149.method966(0, 138);
                                            }
                                            class118.method741(105);
                                            try {
                                                if (class44.field660 != null && class6.field149.field44 > 0) {
                                                    class44.field660.method1630(0, class6.field149.field44, (byte) -70, class6.field149.field101);
                                                    class44.field665 = 0;
                                                    class6.field149.field44 = 0;
                                                }
                                            } catch (IOException var49) {
                                                class88.method596(-24060);
                                            }
                                            return;
                                        }
                                        var38 = var37.field8;
                                        if (var38.field2138 < 0) {
                                            break;
                                        }
                                        var39 = class20.method153(1, var38.field2024);
                                    } while (var39 == null || var39.field2061 == null || var39.field2061.length <= var38.field2138 || var39.field2061[var38.field2138] != var38);
                                    class184.method1170(var37, 84);
                                }
                            }
                            var35 = var34.field8;
                            if (var35.field2138 < 0) {
                                break;
                            }
                            var36 = class20.method153(1, var35.field2024);
                        } while (var36 == null || var36.field2061 == null || var36.field2061.length <= var35.field2138 || var36.field2061[var35.field2138] != var35);
                        class184.method1170(var34, 121);
                    }
                }
                var32 = var31.field8;
                if (var32.field2138 < 0) {
                    break;
                }
                var33 = class20.method153(1, var32.field2024);
            } while (var33 == null || var33.field2061 == null || var33.field2061.length <= var32.field2138 || var33.field2061[var32.field2138] != var32);
            class184.method1170(var31, 114);
        }
    }

    @OriginalMember(owner = "client!oi", name = "e", descriptor = "(I)V", line = 855)
    private final void method443(int arg0) {
        field956++;
        this.field955 = new short[this.field946];
        for (int var2 = arg0; var2 < this.field946; var2++) {
            this.field955[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(IIII)V", line = 894)
    public final void method444(int arg0, int arg1, int arg2, int arg3) {
        field952++;
        if (arg3 != -55) {
            field960 = (int[]) null;
        }
        int[] var5 = new int[arg0];
        int[] var6 = new int[arg2];
        int[] var7 = new int[arg1];
        for (int var8 = 0; var8 < arg1; var8++) {
            var7[var8] = (var8 << 12) / arg1;
        }
        for (int var9 = 0; var9 < arg2; var9++) {
            var6[var9] = (var9 << 12) / arg2;
        }
        for (int var10 = 0; var10 < arg0; var10++) {
            var5[var10] = (var10 << 12) / arg0;
        }
        this.method442(81);
        for (int var11 = 0; var11 < arg0; var11++) {
            for (int var12 = 0; var12 < arg2; var12++) {
                for (int var13 = 0; var13 < arg1; var13++) {
                    for (int var14 = 0; var14 < this.field946; var14++) {
                        int var15 = this.field955[var14] << 12;
                        int var16 = this.field943 * var15 >> 12;
                        int var17 = this.field958 * var15 >> 12;
                        int var18 = var6[var12] * var15 >> 12;
                        int var19 = this.field950 * var15 >> 12;
                        int var20 = var7[var13] * var15 >> 12;
                        int var21 = var5[var11] * var15 >> 12;
                        int var22 = this.field943 * var21;
                        int var23 = this.field958 * var20;
                        int var24 = this.field950 * var18;
                        int var25 = var22 >> 12;
                        int var26 = var22 & 0xFFF;
                        int var27 = var25 + 1;
                        int var28 = var25 & 0xFF;
                        short var29 = this.field944[var28];
                        int var30 = var23 >> 12;
                        int var31 = class6.field142[var26];
                        int var32 = var30 + 1;
                        int var33;
                        if (var32 >= var17) {
                            var33 = 0;
                        } else {
                            var33 = var32 & 0xFF;
                        }
                        int var34 = var23 & 0xFFF;
                        int var35 = class6.field142[var34];
                        int var36 = var26 - 4096;
                        int var37 = var34 - 4096;
                        int var38 = var24 >> 12;
                        int var39 = var38 + 1;
                        int var40 = var24 & 0xFFF;
                        int var41 = var38 & 0xFF;
                        int var42 = var40 - 4096;
                        int var43 = var30 & 0xFF;
                        int var44 = class6.field142[var40];
                        short var45 = this.field944[var41 + var29];
                        int var46;
                        if (var19 > var39) {
                            var46 = var39 & 0xFF;
                        } else {
                            var46 = 0;
                        }
                        int var47;
                        if (var16 <= var27) {
                            var47 = 0;
                        } else {
                            var47 = var27 & 0xFF;
                        }
                        short var48 = this.field944[var29 + var46];
                        short var49 = this.field944[var47];
                        short var50 = this.field944[var41 + var49];
                        short var51 = this.field944[var46 + var49];
                        int var52 = class54.method403((byte) -22, var34, this.field944[var43 + var45], var26, var40);
                        int var53 = class54.method403((byte) -104, var37, this.field944[var33 + var45], var26, var40);
                        int var54 = ((var53 - var52) * var35 >> 12) + var52;
                        int var55 = class54.method403((byte) -52, var34, this.field944[var43 + var48], var26, var42);
                        int var56 = class54.method403((byte) -103, var37, this.field944[var33 + var48], var26, var42);
                        int var57 = ((var56 - var55) * var35 >> 12) + var55;
                        int var58 = class54.method403((byte) -20, var34, this.field944[var43 + var50], var36, var40);
                        int var59 = ((var57 - var54) * var44 >> 12) + var54;
                        int var60 = class54.method403((byte) -14, var37, this.field944[var33 + var50], var36, var40);
                        int var61 = var58 + ((var60 - var58) * var35 >> 12);
                        int var62 = class54.method403((byte) -98, var34, this.field944[var43 + var51], var36, var42);
                        int var63 = class54.method403((byte) -125, var37, this.field944[var33 + var51], var36, var42);
                        int var64 = var62 + ((var63 - var62) * var35 >> 12);
                        int var65 = var61 + ((var64 - var61) * var44 >> 12);
                        this.method445(var14, var59 + ((var65 - var59) * var31 >> 12), false);
                    }
                    this.method435((byte) -84);
                }
            }
        }
    }

    @OriginalMember(owner = "client!oi", name = "f", descriptor = "(I)V", line = 1072)
    private final void method446(int arg0) {
        field953++;
        if (arg0 <= 29) {
            method439(79);
        }
        Random var2 = new Random((long) this.field951);
        for (int var3 = 0; var3 < 255; var3++) {
            this.field944[var3] = (short) var3;
        }
        for (int var4 = 0; var4 < 255; var4++) {
            int var5 = 255 - var4;
            int var6 = class44.method342(var5, var2, 0);
            short var7 = this.field944[var6];
            this.field944[var6] = this.field944[var5];
            this.field944[var5] = this.field944[var5 + 256] = var7;
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(B)V")
    public abstract void method435(byte arg0);

    @OriginalMember(owner = "client!oi", name = "d", descriptor = "(I)V")
    public abstract void method442(int arg0);

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(IIZ)V")
    public abstract void method445(int arg0, int arg1, boolean arg2);
}
