import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!md")
public class class111 {

    @OriginalMember(owner = "client!md", name = "a", descriptor = "J")
    private long field2460 = -1L;

    @OriginalMember(owner = "client!md", name = "p", descriptor = "I")
    private int field2475 = 0;

    @OriginalMember(owner = "client!md", name = "q", descriptor = "J")
    private long field2476 = -1L;

    @OriginalMember(owner = "client!md", name = "o", descriptor = "Lsc;")
    private class164 field2474;

    @OriginalMember(owner = "client!md", name = "t", descriptor = "J")
    private long field2479;

    @OriginalMember(owner = "client!md", name = "B", descriptor = "J")
    private long field2487;

    @OriginalMember(owner = "client!md", name = "n", descriptor = "[B")
    private byte[] field2473;

    @OriginalMember(owner = "client!md", name = "i", descriptor = "[B")
    private byte[] field2468;

    @OriginalMember(owner = "client!md", name = "E", descriptor = "J")
    private long field2490;

    @OriginalMember(owner = "client!md", name = "h", descriptor = "Lea;")
    private static class38 field2467 = class9.method46((byte) 119, "Invalid loginserver requested)3");

    @OriginalMember(owner = "client!md", name = "e", descriptor = "Lea;")
    public static class38 field2464 = class9.method46((byte) 121, "<img=1>");

    @OriginalMember(owner = "client!md", name = "A", descriptor = "I")
    public static int field2486 = 0;

    @OriginalMember(owner = "client!md", name = "s", descriptor = "I")
    public static int field2478 = 0;

    @OriginalMember(owner = "client!md", name = "F", descriptor = "I")
    public static int field2491 = 99;

    @OriginalMember(owner = "client!md", name = "G", descriptor = "Lea;")
    public static class38 field2492 = class9.method46((byte) 114, "<img=1>");

    @OriginalMember(owner = "client!md", name = "C", descriptor = "Lea;")
    public static class38 field2488 = field2467;

    @OriginalMember(owner = "client!md", name = "x", descriptor = "Ld;")
    public static class28 field2483 = new class28(5000);

    @OriginalMember(owner = "client!md", name = "b", descriptor = "I")
    public static int field2461;

    @OriginalMember(owner = "client!md", name = "c", descriptor = "I")
    public static int field2462;

    @OriginalMember(owner = "client!md", name = "d", descriptor = "I")
    public static int field2463;

    @OriginalMember(owner = "client!md", name = "f", descriptor = "I")
    public static int field2465;

    @OriginalMember(owner = "client!md", name = "j", descriptor = "I")
    public static int field2469;

    @OriginalMember(owner = "client!md", name = "l", descriptor = "I")
    public static int field2471;

    @OriginalMember(owner = "client!md", name = "r", descriptor = "I")
    public static int field2477;

    @OriginalMember(owner = "client!md", name = "u", descriptor = "I")
    public static int field2480;

    @OriginalMember(owner = "client!md", name = "v", descriptor = "I")
    private int field2481;

    @OriginalMember(owner = "client!md", name = "w", descriptor = "I")
    public static int field2482;

    @OriginalMember(owner = "client!md", name = "y", descriptor = "I")
    public static int field2484;

    @OriginalMember(owner = "client!md", name = "H", descriptor = "I")
    public static int field2493;

    @OriginalMember(owner = "client!md", name = "I", descriptor = "I")
    public static int field2494;

    @OriginalMember(owner = "client!md", name = "J", descriptor = "I")
    public static int field2495;

    @OriginalMember(owner = "client!md", name = "z", descriptor = "J")
    private long field2485;

    @OriginalMember(owner = "client!md", name = "g", descriptor = "Ldd;")
    public static class32 field2466;

    @OriginalMember(owner = "client!md", name = "D", descriptor = "Lef;")
    public static class43 field2489;

    @OriginalMember(owner = "client!md", name = "m", descriptor = "Lfa;")
    public static class47 field2472;

    @OriginalMember(owner = "client!md", name = "k", descriptor = "Lk;")
    public static class89 field2470;

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(IBI)V")
    public static final void method875(int arg0, byte arg1, int arg2) {
        field2462++;
        if (arg1 == -126 && class136.field2865 == 2) {
            class83.method707(class108.field2434 * 2, (class101.field2272 - class135.field2845 << 7) + class145.field3030, (class166.field3432 - class127.field2712 << 7) - -class202.field3985, (byte) -109);
            if (class195.field3840 > -1 && class45.field1098 % 20 < 10) {
                class203.field4013[0].method755(class195.field3840 + arg2 - 12, class66.field1579 + arg0 + -28);
            }
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(IBI[B)V")
    public final void method876(int arg0, byte arg1, int arg2, byte[] arg3) throws IOException {
        field2480++;
        try {
            if (arg1 != 99) {
                this.method883((byte) 35);
            }
            if (arg3.length < arg0 + arg2) {
                throw new ArrayIndexOutOfBoundsException(arg2 + arg0 - arg3.length);
            }
            if (this.field2460 != -1L && this.field2460 <= this.field2490 && (long) arg2 + this.field2490 <= this.field2460 - -((long) this.field2475)) {
                class131.method964(this.field2473, (int) (this.field2490 - this.field2460), arg3, arg0, arg2);
                this.field2490 += arg2;
                return;
            }
            long var5 = this.field2490;
            int var7 = arg0;
            int var8 = arg2;
            if (this.field2490 >= this.field2476 && this.field2490 < (long) this.field2481 + this.field2476) {
                int var9 = (int) (this.field2476 + (long) this.field2481 - this.field2490);
                if (arg2 < var9) {
                    var9 = arg2;
                }
                arg2 -= var9;
                class131.method964(this.field2468, (int) (this.field2490 - this.field2476), arg3, arg0, var9);
                arg0 += var9;
                this.field2490 += var9;
            }
            if (arg2 > this.field2468.length) {
                this.field2474.method1170((byte) 17, this.field2490);
                this.field2485 = this.field2490;
                while (arg2 > 0) {
                    int var11 = this.field2474.method1171(arg0, arg2, (byte) -4, arg3);
                    if (var11 == -1) {
                        break;
                    }
                    arg2 -= var11;
                    arg0 += var11;
                    this.field2490 += var11;
                    this.field2485 += var11;
                }
            } else if (arg2 > 0) {
                this.method877(0);
                int var10 = arg2;
                if (arg2 > this.field2481) {
                    var10 = this.field2481;
                }
                arg2 -= var10;
                class131.method964(this.field2468, 0, arg3, arg0, var10);
                this.field2490 += var10;
                arg0 += var10;
            }
            if (this.field2460 != -1L) {
                if (this.field2460 > this.field2490 && arg2 > 0) {
                    int var12 = (int) (this.field2460 - this.field2490) + arg0;
                    if (arg0 + arg2 < var12) {
                        var12 = arg0 + arg2;
                    }
                    while (var12 > arg0) {
                        arg3[arg0++] = 0;
                        this.field2490++;
                        arg2--;
                    }
                }
                long var13 = -1L;
                if (this.field2460 >= var5 && this.field2460 < (long) var8 + var5) {
                    var13 = this.field2460;
                } else if (var5 >= this.field2460 && (long) this.field2475 + this.field2460 > var5) {
                    var13 = var5;
                }
                long var15 = -1L;
                if (var5 < this.field2460 + (long) this.field2475 && (long) this.field2475 + this.field2460 <= (long) var8 + var5) {
                    var15 = (long) this.field2475 + this.field2460;
                } else if (this.field2460 < (long) var8 + var5 && (long) var8 + var5 <= this.field2460 - -((long) this.field2475)) {
                    var15 = (long) var8 + var5;
                }
                if (var13 > -1L && var15 > var13) {
                    int var17 = (int) (var15 - var13);
                    class131.method964(this.field2473, (int) (var13 - this.field2460), arg3, (int) (var13 - var5) + var7, var17);
                    if (var15 > this.field2490) {
                        arg2 = (int) ((long) arg2 + this.field2490 - var15);
                        this.field2490 = var15;
                    }
                }
            }
        } catch (IOException var19) {
            this.field2485 = -1L;
            throw var19;
        }
        if (arg2 > 0) {
            throw new EOFException();
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(I)V")
    private final void method877(int arg0) throws IOException {
        this.field2481 = arg0;
        field2484++;
        if (this.field2490 != this.field2485) {
            this.field2474.method1170((byte) 17, this.field2490);
            this.field2485 = this.field2490;
        }
        this.field2476 = this.field2490;
        while (this.field2468.length > this.field2481) {
            int var2 = this.field2474.method1171(this.field2481, this.field2468.length - this.field2481, (byte) 25, this.field2468);
            if (var2 == -1) {
                break;
            }
            this.field2485 += var2;
            this.field2481 += var2;
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(II)Z")
    public static final boolean method878(int arg0, int arg1) {
        field2495++;
        if (arg0 != -32) {
            field2478 = 124;
        }
        return (arg1 >> 29 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!md", name = "b", descriptor = "(I)V")
    public final void method879(int arg0) throws IOException {
        if (arg0 != 0) {
            method878(-120, 40);
        }
        field2461++;
        this.method888(3994);
        this.field2474.method1173(arg0 ^ 0xFFFFFF84);
    }

    @OriginalMember(owner = "client!md", name = "c", descriptor = "(I)V")
    public static final void method880(int arg0) {
        field2463++;
        if (class106.field2396 > 0) {
            class106.field2396--;
        }
        if (class100.field2236 > 1) {
            class100.field2236--;
        }
        if (class135.field2846) {
            class135.field2846 = false;
            class125.method935(false);
            return;
        }
        for (int var1 = 0; var1 < 100 && class125.method932(-1); var1++) {
        }
        if (class86.field2005 != 30) {
            return;
        }
        class180.method1234(field2483, 149, -21);
        Object var2 = class163.field3397.field2828;
        synchronized (class163.field3397.field2828) {
            if (!class105.field2341) {
                class163.field3397.field2834 = 0;
            } else if (class165.field3424 != 0 || class163.field3397.field2834 >= 40) {
                field2483.method169(-1494101117, 121);
                class25.field507++;
                field2483.method495(104, 0);
                int var3 = field2483.field1620;
                int var4 = 0;
                for (int var5 = 0; var5 < class163.field3397.field2834 && field2483.field1620 - var3 < 240; var5++) {
                    var4++;
                    int var6 = class163.field3397.field2835[var5];
                    int var7 = class163.field3397.field2833[var5];
                    if (var7 < 0) {
                        var7 = 0;
                    } else if (var7 > 764) {
                        var7 = 764;
                    }
                    if (var6 < 0) {
                        var6 = 0;
                    } else if (var6 > 502) {
                        var6 = 502;
                    }
                    int var8 = var6 * 765 + var7;
                    if (class163.field3397.field2835[var5] == -1 && class163.field3397.field2833[var5] == -1) {
                        var6 = -1;
                        var8 = 524287;
                        var7 = -1;
                    }
                    if (class62.field1500 != var7 || class171.field3511 != var6) {
                        int var9 = var7 - class62.field1500;
                        class62.field1500 = var7;
                        int var10 = var6 - class171.field3511;
                        class171.field3511 = var6;
                        if (class100.field2227 < 8 && var9 >= -32 && var9 <= 31 && var10 >= -32 && var10 <= 31) {
                            var9 += 32;
                            var10 += 32;
                            field2483.method496(848881960, (var9 << 6) + ((class100.field2227 << 12) + var10));
                            class100.field2227 = 0;
                        } else if (class100.field2227 < 8) {
                            field2483.method461((class100.field2227 << 19) + var8 + 8388608, arg0 ^ 0xFFFFFF83);
                            class100.field2227 = 0;
                        } else {
                            field2483.method478((byte) 53, (class100.field2227 << 19) + var8 - 1073741824);
                            class100.field2227 = 0;
                        }
                    } else if (class100.field2227 < 2047) {
                        class100.field2227++;
                    }
                }
                field2483.method479(field2483.field1620 - var3, arg0 ^ 0x80);
                if (var4 < class163.field3397.field2834) {
                    class163.field3397.field2834 -= var4;
                    for (int var11 = 0; var11 < class163.field3397.field2834; var11++) {
                        class163.field3397.field2833[var11] = class163.field3397.field2833[var4 + var11];
                        class163.field3397.field2835[var11] = class163.field3397.field2835[var4 + var11];
                    }
                } else {
                    class163.field3397.field2834 = 0;
                }
            }
        }
        if (class165.field3424 != 0) {
            class48.field1170++;
            long var12 = (class204.field4023 - class125.field2677) / 50L;
            if (var12 > 4095L) {
                var12 = 4095L;
            }
            class125.field2677 = class204.field4023;
            int var14 = class105.field2345;
            if (var14 < 0) {
                var14 = 0;
            } else if (var14 > 502) {
                var14 = 502;
            }
            int var15 = class87.field2029;
            if (var15 < 0) {
                var15 = 0;
            } else if (var15 > 764) {
                var15 = 764;
            }
            int var16 = var14 * 765 + var15;
            byte var17 = 0;
            int var18 = (int) var12;
            if (class165.field3424 == 2) {
                var17 = 1;
            }
            field2483.method169(-1494101117, 167);
            field2483.method504((var18 << 20) + (var17 << 19) + var16, arg0 + -1629130328);
        }
        if (class113.field2521 > 0) {
            class113.field2521--;
        }
        if (class50.field1244[96] || class50.field1244[97] || class50.field1244[98] || class50.field1244[99]) {
            class165.field3406 = true;
        }
        if (class165.field3406 && class113.field2521 <= 0) {
            class30.field591++;
            class113.field2521 = 20;
            class165.field3406 = false;
            field2483.method169(-1494101117, 169);
            field2483.method493(class177.field3596, false);
            field2483.method493(class114.field2534, false);
        }
        if (class183.field3664 && !class169.field3479) {
            class169.field3479 = true;
            class139.field2887++;
            field2483.method169(-1494101117, 34);
            field2483.method495(120, 1);
        }
        if (!class183.field3664 && class169.field3479) {
            class139.field2887++;
            class169.field3479 = false;
            field2483.method169(-1494101117, 34);
            field2483.method495(arg0 + 119, 0);
        }
        class163.method1167(0);
        if (class86.field2005 != 30) {
            return;
        }
        class166.method1185((byte) 74);
        class94.method789(1);
        class171.field3512++;
        if (class171.field3512 > 750) {
            class125.method935(false);
            return;
        }
        class187.method1261(arg0 - 127);
        class144.method1035(false);
        class92.method768(arg0 ^ 0x1000);
        if (class50.field1250 != 0) {
            class70.field1743 += 20;
            if (class70.field1743 >= 400) {
                class50.field1250 = 0;
            }
        }
        class205.field4027++;
        if (class143.field2984 != null) {
            field2486++;
            if (field2486 >= 15) {
                class172.method1209(class143.field2984, -1);
                class143.field2984 = null;
            }
        }
        if (class203.field4007 != null) {
            class172.method1209(class203.field4007, arg0 - 1);
            class185.field3695++;
            if (class66.field1574 + 5 < class176.field3568 || class66.field1574 - 5 > class176.field3568 || class140.field2942 + 5 < class10.field222 || class140.field2942 - 5 > class10.field222) {
                class179.field3627 = true;
            }
            if (class146.field3038 == 0) {
                if (class179.field3627 && class185.field3695 >= 5) {
                    if (class203.field4007 == class12.field267 && class51.field1325 != class176.field3567) {
                        class114.field2531++;
                        byte var19 = 0;
                        class43 var20 = class203.field4007;
                        if (class83.field1961 == 1 && var20.field987 == 206) {
                            var19 = 1;
                        }
                        if (var20.field967[class176.field3567] <= 0) {
                            var19 = 0;
                        }
                        if (method878(-32, class40.method299(var20, 25))) {
                            int var23 = class176.field3567;
                            int var24 = class51.field1325;
                            var20.field967[var23] = var20.field967[var24];
                            var20.field1033[var23] = var20.field1033[var24];
                            var20.field967[var24] = -1;
                            var20.field1033[var24] = 0;
                        } else if (var19 == 1) {
                            int var21 = class51.field1325;
                            int var22 = class176.field3567;
                            while (var21 != var22) {
                                if (var21 > var22) {
                                    var20.method315(var21, (byte) 71, var21 - 1);
                                    var21--;
                                } else if (var22 > var21) {
                                    var20.method315(var21, (byte) 76, var21 + 1);
                                    var21++;
                                }
                            }
                        } else {
                            var20.method315(class51.field1325, (byte) 41, class176.field3567);
                        }
                        field2483.method169(-1494101117, 166);
                        field2483.method488(true, class176.field3567);
                        field2483.method477((byte) -85, var19);
                        field2483.method497(false, class203.field4007.field1013);
                        field2483.method493(class51.field1325, false);
                    }
                } else if ((class9.field206 == 1 || class202.method1326(class94.field2121 - 1, 2000)) && class94.field2121 > 2) {
                    class151.method1057(116);
                } else if (class94.field2121 > 0) {
                    class36.method240((byte) -87, class94.field2121 - 1);
                }
                class165.field3424 = 0;
                field2486 = 10;
                class203.field4007 = null;
            }
        }
        class103.field2322 = arg0;
        class140.field2931 = null;
        class86.field2011 = false;
        class43 var25 = field2489;
        class43 var26 = class50.field1251;
        field2489 = null;
        class62.field1504 = false;
        class50.field1251 = null;
        while (class117.method906(0) && class103.field2322 < 128) {
            class38.field811[class103.field2322] = class7.field181;
            class88.field2042[class103.field2322] = class202.field3986;
            class103.field2322++;
        }
        class3.method15(0, class86.field1998, 0, 0, 765, 0, arg0 ^ 0xFFFFFFA4, 503);
        class192.field3796++;
        while (true) {
            class48 var27;
            class43 var28;
            class43 var29;
            do {
                var27 = (class48) class84.field1975.method1026((byte) -112);
                if (var27 == null) {
                    while (true) {
                        class48 var30;
                        class43 var31;
                        class43 var32;
                        do {
                            var30 = (class48) class41.field899.method1026((byte) -127);
                            if (var30 == null) {
                                while (true) {
                                    class48 var33;
                                    class43 var34;
                                    class43 var35;
                                    do {
                                        var33 = (class48) class132.field2806.method1026((byte) -94);
                                        if (var33 == null) {
                                            if (class45.field1094 != null) {
                                                class32.method200(arg0);
                                            }
                                            if (class157.field3283 != -1) {
                                                int var36 = class157.field3283;
                                                int var37 = class157.field3271;
                                                boolean var38 = class14.method81(class195.field3842.field409[0], 0, var36, class195.field3842.field391[0], true, 0, 0, 0, 0, var37, 0, 0);
                                                class157.field3283 = -1;
                                                if (var38) {
                                                    class70.field1743 = 0;
                                                    class39.field846 = class87.field2029;
                                                    class50.field1250 = 1;
                                                    class68.field1719 = class105.field2345;
                                                }
                                            }
                                            class51.method370(arg0 - 2);
                                            if (field2489 != var25) {
                                                if (var25 != null) {
                                                    class172.method1209(var25, -1);
                                                }
                                                if (field2489 != null) {
                                                    class172.method1209(field2489, -1);
                                                }
                                            }
                                            if (class50.field1251 != var26 && class16.field339 == class155.field3233) {
                                                if (var26 != null) {
                                                    class172.method1209(var26, -1);
                                                }
                                                if (class50.field1251 != null) {
                                                    class172.method1209(class50.field1251, -1);
                                                }
                                            }
                                            if (class50.field1251 == null) {
                                                if (class16.field339 > 0) {
                                                    class16.field339--;
                                                }
                                            } else if (class155.field3233 > class16.field339) {
                                                class16.field339++;
                                                if (class16.field339 == class155.field3233) {
                                                    class172.method1209(class50.field1251, -1);
                                                }
                                            }
                                            class39.method293(false);
                                            if (class140.field2933) {
                                                class172.method1208(-1);
                                            }
                                            for (int var39 = 0; var39 < 5; var39++) {
                                                int var10002 = class141.field2970[var39]++;
                                            }
                                            int var40 = class98.method814(255);
                                            int var41 = class54.method389(-79);
                                            if (var40 > 4500 && var41 > 4500) {
                                                class106.field2396 = 250;
                                                class113.field2525++;
                                                class141.method1021(8, 4000);
                                                field2483.method169(-1494101117, 236);
                                            }
                                            class176.field3566++;
                                            class179.field3617++;
                                            if (class176.field3566 > 500) {
                                                class176.field3566 = 0;
                                                int var42 = (int) (Math.random() * 8.0D);
                                                if ((var42 & 0x1) == 1) {
                                                    class84.field1984 += class34.field716;
                                                }
                                                if ((var42 & 0x4) == 4) {
                                                    class192.field3799 += class197.field3883;
                                                }
                                                if ((var42 & 0x2) == 2) {
                                                    class148.field3081 += class101.field2258;
                                                }
                                            }
                                            if (class192.field3799 < -40) {
                                                class197.field3883 = 1;
                                            }
                                            if (class192.field3799 > 40) {
                                                class197.field3883 = -1;
                                            }
                                            if (class84.field1984 < -50) {
                                                class34.field716 = 2;
                                            }
                                            if (class179.field3617 > 500) {
                                                int var43 = (int) (Math.random() * 8.0D);
                                                class179.field3617 = 0;
                                                if ((var43 & 0x2) == 2) {
                                                    class183.field3658 += class125.field2675;
                                                }
                                                if ((var43 & 0x1) == 1) {
                                                    class205.field4028 += class73.field1769;
                                                }
                                            }
                                            if (class148.field3081 < -55) {
                                                class101.field2258 = 2;
                                            }
                                            if (class148.field3081 > 55) {
                                                class101.field2258 = -2;
                                            }
                                            if (class183.field3658 < -20) {
                                                class125.field2675 = 1;
                                            }
                                            class63.field1532++;
                                            if (class183.field3658 > 10) {
                                                class125.field2675 = -1;
                                            }
                                            if (class84.field1984 > 50) {
                                                class34.field716 = -2;
                                            }
                                            if (class205.field4028 < -60) {
                                                class73.field1769 = 2;
                                            }
                                            if (class205.field4028 > 60) {
                                                class73.field1769 = -2;
                                            }
                                            if (class63.field1532 > 50) {
                                                class120.field2596++;
                                                field2483.method169(-1494101117, 186);
                                            }
                                            try {
                                                if (class39.field876 != null && field2483.field1620 > 0) {
                                                    class39.field876.method361(0, (byte) 97, field2483.field1627, field2483.field1620);
                                                    class63.field1532 = 0;
                                                    field2483.field1620 = 0;
                                                    return;
                                                }
                                                return;
                                            } catch (IOException var44) {
                                                class125.method935(false);
                                                return;
                                            }
                                        }
                                        var34 = var33.field1153;
                                        if (var34.field945 < 0) {
                                            break;
                                        }
                                        var35 = class98.method813(var34.field1005, 4096);
                                    } while (var35 == null || var35.field1061 == null || var35.field1061.length <= var34.field945 || var35.field1061[var34.field945] != var34);
                                    class113.method894(var33, (byte) 58);
                                }
                            }
                            var31 = var30.field1153;
                            if (var31.field945 < 0) {
                                break;
                            }
                            var32 = class98.method813(var31.field1005, 4096);
                        } while (var32 == null || var32.field1061 == null || var32.field1061.length <= var31.field945 || var32.field1061[var31.field945] != var31);
                        class113.method894(var30, (byte) 121);
                    }
                }
                var28 = var27.field1153;
                if (var28.field945 < 0) {
                    break;
                }
                var29 = class98.method813(var28.field1005, 4096);
            } while (var29 == null || var29.field1061 == null || var29.field1061.length <= var28.field945 || var29.field1061[var28.field945] != var28);
            class113.method894(var27, (byte) 104);
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(JI)V")
    public final void method881(long arg0, int arg1) throws IOException {
        field2477++;
        if (arg1 != 0) {
            return;
        }
        if (arg0 < 0L) {
            throw new IOException("Invalid seek to " + arg0 + " in file " + this.method887(86));
        }
        this.field2490 = arg0;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "([BIII)V")
    public final void method882(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
        field2494++;
        try {
            if (arg2 >= -95) {
                method880(113);
            }
            if (this.field2487 < this.field2490 + (long) arg3) {
                this.field2487 = (long) arg3 + this.field2490;
            }
            if (this.field2460 != -1L && (this.field2460 > this.field2490 || (long) this.field2475 + this.field2460 < this.field2490)) {
                this.method888(3994);
            }
            if (this.field2460 != -1L && this.field2490 + (long) arg3 > (long) this.field2473.length + this.field2460) {
                int var5 = (int) ((long) this.field2473.length + this.field2460 - this.field2490);
                arg3 -= var5;
                class131.method964(arg0, arg1, this.field2473, (int) (this.field2490 - this.field2460), var5);
                this.field2490 += var5;
                arg1 += var5;
                this.field2475 = this.field2473.length;
                this.method888(3994);
            }
            if (this.field2473.length < arg3) {
                if (this.field2490 != this.field2485) {
                    this.field2474.method1170((byte) 17, this.field2490);
                    this.field2485 = this.field2490;
                }
                this.field2474.method1175(arg0, (byte) -91, arg1, arg3);
                long var6 = -1L;
                if (this.field2490 >= this.field2476 && (long) this.field2481 + this.field2476 > this.field2490) {
                    var6 = this.field2490;
                } else if (this.field2490 <= this.field2476 && (long) arg3 + this.field2490 > this.field2476) {
                    var6 = this.field2476;
                }
                this.field2485 += arg3;
                long var8 = -1L;
                if ((long) arg3 + this.field2490 > this.field2476 && (long) this.field2481 + this.field2476 >= (long) arg3 + this.field2490) {
                    var8 = (long) arg3 + this.field2490;
                } else if (this.field2476 + (long) this.field2481 > this.field2490 && (long) this.field2481 + this.field2476 <= (long) arg3 + this.field2490) {
                    var8 = (long) this.field2481 + this.field2476;
                }
                if (this.field2479 < this.field2485) {
                    this.field2479 = this.field2485;
                }
                if (var6 > -1L && var8 > var6) {
                    int var10 = (int) (var8 - var6);
                    class131.method964(arg0, (int) ((long) arg1 + var6 - this.field2490), this.field2468, (int) (var6 - this.field2476), var10);
                }
                this.field2490 += arg3;
            } else if (arg3 > 0) {
                if (this.field2460 == -1L) {
                    this.field2460 = this.field2490;
                }
                class131.method964(arg0, arg1, this.field2473, (int) (this.field2490 - this.field2460), arg3);
                this.field2490 += arg3;
                if (this.field2490 - this.field2460 > (long) this.field2475) {
                    this.field2475 = (int) (this.field2490 - this.field2460);
                }
            }
        } catch (IOException var12) {
            this.field2485 = -1L;
            throw var12;
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(B)J")
    public final long method883(byte arg0) {
        if (arg0 >= -48) {
            return 28L;
        } else {
            field2465++;
            return this.field2487;
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(BI)I")
    public static final int method884(byte arg0, int arg1) {
        int var2 = -126 % ((82 - arg0) / 34);
        field2469++;
        return arg1 >> 17 & 0x7;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "([BB)V")
    public final void method885(byte[] arg0, byte arg1) throws IOException {
        this.method876(0, (byte) 99, arg0.length, arg0);
        if (arg1 < 53) {
            this.field2479 = -45L;
        }
        field2471++;
    }

    @OriginalMember(owner = "client!md", name = "b", descriptor = "(B)V")
    public static void method886(byte arg0) {
        field2466 = null;
        field2467 = null;
        if (arg0 != -120) {
            field2488 = null;
        }
        field2489 = null;
        field2470 = null;
        field2464 = null;
        field2488 = null;
        field2472 = null;
        field2483 = null;
        field2492 = null;
    }

    @OriginalMember(owner = "client!md", name = "<init>", descriptor = "(Lsc;II)V")
    public class111(class164 arg0, int arg1, int arg2) throws IOException {
        this.field2474 = arg0;
        this.field2487 = this.field2479 = arg0.method1172(1);
        this.field2473 = new byte[arg2];
        this.field2468 = new byte[arg1];
        this.field2490 = 0L;
    }

    @OriginalMember(owner = "client!md", name = "d", descriptor = "(I)Ljava/io/File;")
    private final File method887(int arg0) {
        field2493++;
        if (arg0 < 63) {
            this.method883((byte) 2);
        }
        return this.field2474.method1174(0);
    }

    @OriginalMember(owner = "client!md", name = "e", descriptor = "(I)V")
    private final void method888(int arg0) throws IOException {
        field2482++;
        if (arg0 != 3994 || this.field2460 == -1L) {
            return;
        }
        if (this.field2485 != this.field2460) {
            this.field2474.method1170((byte) 17, this.field2460);
            this.field2485 = this.field2460;
        }
        this.field2474.method1175(this.field2473, (byte) -91, 0, this.field2475);
        this.field2485 += this.field2475;
        long var2 = -1L;
        long var4 = -1L;
        if (this.field2479 < this.field2485) {
            this.field2479 = this.field2485;
        }
        if (this.field2476 < (long) this.field2475 + this.field2460 && (long) this.field2475 + this.field2460 <= (long) this.field2481 + this.field2476) {
            var2 = this.field2460 + (long) this.field2475;
        } else if (this.field2460 < (long) this.field2481 + this.field2476 && this.field2460 + (long) this.field2475 >= (long) this.field2481 + this.field2476) {
            var2 = (long) this.field2481 + this.field2476;
        }
        if (this.field2460 >= this.field2476 && this.field2460 < (long) this.field2481 + this.field2476) {
            var4 = this.field2460;
        } else if (this.field2460 <= this.field2476 && this.field2476 < (long) this.field2475 + this.field2460) {
            var4 = this.field2476;
        }
        if (var4 > -1L && var2 > var4) {
            int var6 = (int) (var2 - var4);
            class131.method964(this.field2473, (int) (var4 - this.field2460), this.field2468, (int) (var4 - this.field2476), var6);
        }
        this.field2460 = -1L;
        this.field2475 = 0;
    }
}
