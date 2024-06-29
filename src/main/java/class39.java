import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fc")
public class class39 {

    @OriginalMember(owner = "client!fc", name = "f", descriptor = "I")
    private int field886 = 0;

    @OriginalMember(owner = "client!fc", name = "e", descriptor = "J")
    private long field885 = -1L;

    @OriginalMember(owner = "client!fc", name = "h", descriptor = "J")
    private long field888 = -1L;

    @OriginalMember(owner = "client!fc", name = "i", descriptor = "Laf;")
    private class7 field889;

    @OriginalMember(owner = "client!fc", name = "s", descriptor = "J")
    private long field899;

    @OriginalMember(owner = "client!fc", name = "c", descriptor = "J")
    private long field883;

    @OriginalMember(owner = "client!fc", name = "A", descriptor = "[B")
    private byte[] field907;

    @OriginalMember(owner = "client!fc", name = "m", descriptor = "[B")
    private byte[] field893;

    @OriginalMember(owner = "client!fc", name = "t", descriptor = "J")
    private long field900;

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "Lu;")
    private static class135 field882 = class87.method676((byte) -60, "Remove");

    @OriginalMember(owner = "client!fc", name = "l", descriptor = "I")
    public static int field892 = 127;

    @OriginalMember(owner = "client!fc", name = "v", descriptor = "Lu;")
    public static class135 field902 = class87.method676((byte) -127, "Begeben Sie sich in ein freies Gebiet)1 um");

    @OriginalMember(owner = "client!fc", name = "y", descriptor = "Lu;")
    public static class135 field905 = class87.method676((byte) -105, "");

    @OriginalMember(owner = "client!fc", name = "D", descriptor = "Lu;")
    public static class135 field910 = class87.method676((byte) -78, "b12_full");

    @OriginalMember(owner = "client!fc", name = "C", descriptor = "Lu;")
    public static class135 field909 = field882;

    @OriginalMember(owner = "client!fc", name = "E", descriptor = "Lu;")
    public static class135 field911 = class87.method676((byte) -40, "(X");

    @OriginalMember(owner = "client!fc", name = "o", descriptor = "Loe;")
    public static class102 field895 = new class102(32);

    @OriginalMember(owner = "client!fc", name = "H", descriptor = "Lu;")
    private static class135 field913 = class87.method676((byte) -107, "red:");

    @OriginalMember(owner = "client!fc", name = "I", descriptor = "Lu;")
    public static class135 field914 = field913;

    @OriginalMember(owner = "client!fc", name = "F", descriptor = "Lu;")
    public static class135 field912 = class87.method676((byte) -117, ",Zffentlicher Chat");

    @OriginalMember(owner = "client!fc", name = "J", descriptor = "Lu;")
    public static class135 field915 = field913;

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "I")
    public static int field881;

    @OriginalMember(owner = "client!fc", name = "d", descriptor = "I")
    public static int field884;

    @OriginalMember(owner = "client!fc", name = "g", descriptor = "I")
    public static int field887;

    @OriginalMember(owner = "client!fc", name = "j", descriptor = "I")
    public static int field890;

    @OriginalMember(owner = "client!fc", name = "n", descriptor = "I")
    public static int field894;

    @OriginalMember(owner = "client!fc", name = "p", descriptor = "I")
    public static int field896;

    @OriginalMember(owner = "client!fc", name = "q", descriptor = "I")
    public static int field897;

    @OriginalMember(owner = "client!fc", name = "r", descriptor = "I")
    public static int field898;

    @OriginalMember(owner = "client!fc", name = "u", descriptor = "I")
    public static int field901;

    @OriginalMember(owner = "client!fc", name = "x", descriptor = "I")
    public static int field904;

    @OriginalMember(owner = "client!fc", name = "z", descriptor = "I")
    public static int field906;

    @OriginalMember(owner = "client!fc", name = "B", descriptor = "I")
    private int field908;

    @OriginalMember(owner = "client!fc", name = "w", descriptor = "J")
    private long field903;

    @OriginalMember(owner = "client!fc", name = "k", descriptor = "Lrd;")
    public static class121 field891;

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(I)V")
    private final void method291(int arg0) throws IOException {
        this.field908 = arg0;
        if (this.field903 != this.field900) {
            this.field889.method35(this.field900, arg0 + 1);
            this.field903 = this.field900;
        }
        this.field888 = this.field900;
        field884++;
        while (this.field908 < this.field907.length) {
            int var2 = this.field889.method36(this.field908, this.field907, this.field907.length - this.field908, (byte) -72);
            if (var2 == -1) {
                break;
            }
            this.field908 += var2;
            this.field903 += var2;
        }
    }

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "(I)V")
    public final void method292(int arg0) throws IOException {
        this.method296((byte) 93);
        this.field889.method37((byte) 55);
        if (arg0 != -207) {
            this.method298(true);
        }
        field896++;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(II[BB)V")
    public final void method293(int arg0, int arg1, byte[] arg2, byte arg3) throws IOException {
        field887++;
        try {
            if (arg2.length < arg0 + arg1) {
                throw new ArrayIndexOutOfBoundsException(arg0 + arg1 - arg2.length);
            }
            if (this.field885 != -1L && this.field885 <= this.field900 && (long) this.field886 + this.field885 >= this.field900 - -((long) arg1)) {
                class71.method575(this.field893, (int) (this.field900 - this.field885), arg2, arg0, arg1);
                this.field900 += arg1;
                return;
            }
            long var5 = this.field900;
            if (arg3 <= 90) {
                return;
            }
            int var7 = arg0;
            int var8 = arg1;
            if (this.field900 >= this.field888 && this.field900 < this.field888 + (long) this.field908) {
                int var9 = (int) (this.field888 + (long) this.field908 - this.field900);
                if (var9 > arg1) {
                    var9 = arg1;
                }
                class71.method575(this.field907, (int) (this.field900 - this.field888), arg2, arg0, var9);
                arg1 -= var9;
                this.field900 += var9;
                arg0 += var9;
            }
            if (arg1 > this.field907.length) {
                this.field889.method35(this.field900, 1);
                this.field903 = this.field900;
                while (arg1 > 0) {
                    int var10 = this.field889.method36(arg0, arg2, arg1, (byte) -94);
                    if (var10 == -1) {
                        break;
                    }
                    arg0 += var10;
                    this.field903 += var10;
                    arg1 -= var10;
                    this.field900 += var10;
                }
            } else if (arg1 > 0) {
                this.method291(0);
                int var11 = arg1;
                if (arg1 > this.field908) {
                    var11 = this.field908;
                }
                class71.method575(this.field907, 0, arg2, arg0, var11);
                arg1 -= var11;
                this.field900 += var11;
                arg0 += var11;
            }
            if (this.field885 != -1L) {
                if (this.field885 > this.field900 && arg1 > 0) {
                    int var12 = (int) (this.field885 - this.field900) + arg0;
                    if (var12 > arg0 + arg1) {
                        var12 = arg0 + arg1;
                    }
                    while (arg0 < var12) {
                        arg2[arg0++] = 0;
                        this.field900++;
                        arg1--;
                    }
                }
                long var13 = -1L;
                if ((long) this.field886 + this.field885 > var5 && (long) this.field886 + this.field885 <= (long) var8 + var5) {
                    var13 = (long) this.field886 + this.field885;
                } else if ((long) var8 + var5 > this.field885 && (long) var8 + var5 <= (long) this.field886 + this.field885) {
                    var13 = (long) var8 + var5;
                }
                long var15 = -1L;
                if (var5 <= this.field885 && this.field885 < (long) var8 + var5) {
                    var15 = this.field885;
                } else if (var5 >= this.field885 && this.field885 + (long) this.field886 > var5) {
                    var15 = var5;
                }
                if (var15 > -1L && var15 < var13) {
                    int var17 = (int) (var13 - var15);
                    class71.method575(this.field893, (int) (var15 - this.field885), arg2, (int) (var15 - var5) + var7, var17);
                    if (var13 > this.field900) {
                        arg1 = (int) ((long) arg1 + this.field900 - var13);
                        this.field900 = var13;
                    }
                }
            }
        } catch (IOException var19) {
            this.field903 = -1L;
            throw var19;
        }
        if (arg1 > 0) {
            throw new EOFException();
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(Z)V")
    public static final void method294(boolean arg0) {
        field904++;
        if (class26.field642 > 0) {
            class26.field642--;
        }
        if (class63.field1586 > 1) {
            class63.field1586--;
        }
        if (class49.field1172) {
            class49.field1172 = false;
            class95.method779(124);
            return;
        }
        for (int var1 = 0; var1 < 100 && class77.method613(20635); var1++) {
        }
        if (class83.field1963 != 30 && class83.field1963 != 35) {
            return;
        }
        if (class124.field2947 && class83.field1963 == 30) {
            class60.field1520 = 0;
            class48.field1151 = 0;
            while (class122.method965(-20)) {
            }
            for (int var2 = 0; var2 < class94.field2218.length; var2++) {
                class94.field2218[var2] = false;
            }
        }
        class126.method987(47, class152.field3751, 47);
        Object var3 = class46.field1097.field1864;
        synchronized (class46.field1097.field1864) {
            if (!class141.field3472) {
                class46.field1097.field1867 = 0;
            } else if (class48.field1151 != 0 || class46.field1097.field1867 >= 40) {
                class108.field2615++;
                class152.field3751.method929(91, -14044);
                class152.field3751.method452(0, 255);
                int var4 = 0;
                int var5 = class152.field3751.field1485;
                for (int var6 = 0; class46.field1097.field1867 > var6 && class152.field3751.field1485 - var5 < 240; var6++) {
                    int var7 = class46.field1097.field1868[var6];
                    var4++;
                    int var8 = class46.field1097.field1869[var6];
                    if (var8 < 0) {
                        var8 = 0;
                    } else if (var8 > 502) {
                        var8 = 502;
                    }
                    if (var7 < 0) {
                        var7 = 0;
                    } else if (var7 > 764) {
                        var7 = 764;
                    }
                    int var9 = var8 * 765 + var7;
                    if (class46.field1097.field1869[var6] == -1 && class46.field1097.field1868[var6] == -1) {
                        var9 = 524287;
                        var7 = -1;
                        var8 = -1;
                    }
                    if (class138.field3344 != var7 || class102.field2485 != var8) {
                        int var10 = var7 - class138.field3344;
                        class138.field3344 = var7;
                        int var11 = var8 - class102.field2485;
                        class102.field2485 = var8;
                        if (class85.field2043 < 8 && var10 >= -32 && var10 <= 31 && var11 >= -32 && var11 <= 31) {
                            var10 += 32;
                            var11 += 32;
                            class152.field3751.method451((class85.field2043 << 12) + (var10 << 6) + var11, (byte) 28);
                            class85.field2043 = 0;
                        } else if (class85.field2043 < 8) {
                            class152.field3751.method478(true, (class85.field2043 << 19) + var9 + 8388608);
                            class85.field2043 = 0;
                        } else {
                            class152.field3751.method463(81, var9 + (class85.field2043 << 19) - 1073741824);
                            class85.field2043 = 0;
                        }
                    } else if (class85.field2043 < 2047) {
                        class85.field2043++;
                    }
                }
                class152.field3751.method476(class152.field3751.field1485 - var5, arg0);
                if (var4 < class46.field1097.field1867) {
                    class46.field1097.field1867 -= var4;
                    for (int var12 = 0; var12 < class46.field1097.field1867; var12++) {
                        class46.field1097.field1868[var12] = class46.field1097.field1868[var4 + var12];
                        class46.field1097.field1869[var12] = class46.field1097.field1869[var4 + var12];
                    }
                } else {
                    class46.field1097.field1867 = 0;
                }
            }
        }
        if (class48.field1151 != 0) {
            long var13 = (class10.field262 - class125.field2977) / 50L;
            class86.field2050++;
            class125.field2977 = class10.field262;
            if (var13 > 4095L) {
                var13 = 4095L;
            }
            int var15 = class20.field470;
            if (var15 < 0) {
                var15 = 0;
            } else if (var15 > 502) {
                var15 = 502;
            }
            int var16 = class139.field3389;
            int var17 = (int) var13;
            if (var16 < 0) {
                var16 = 0;
            } else if (var16 > 764) {
                var16 = 764;
            }
            byte var18 = 0;
            if (class48.field1151 == 2) {
                var18 = 1;
            }
            int var19 = var15 * 765 + var16;
            class152.field3751.method929(246, -14044);
            class152.field3751.method458(127, (var17 << 20) + (var18 << 19) + var19);
        }
        if (class80.field1912 > 0) {
            class80.field1912--;
        }
        if (class94.field2218[96] || class94.field2218[97] || class94.field2218[98] || class94.field2218[99]) {
            class151.field3730 = true;
        }
        if (class151.field3730 && class80.field1912 <= 0) {
            class151.field3730 = false;
            class115.field2748++;
            class80.field1912 = 20;
            class152.field3751.method929(1, -14044);
            class152.field3751.method448(class102.field2465, true);
            class152.field3751.method448(class22.field550, true);
        }
        if (class96.field2331 && !class26.field624) {
            class26.field624 = true;
            class123.field2937++;
            class152.field3751.method929(141, -14044);
            class152.field3751.method452(1, 255);
        }
        if (!class96.field2331 && class26.field624) {
            class26.field624 = false;
            class152.field3751.method929(141, -14044);
            class123.field2937++;
            class152.field3751.method452(0, 255);
        }
        class82.method643(12523);
        if (class83.field1963 != 30 && class83.field1963 != 35) {
            return;
        }
        class62.method513(-124);
        class68.method549(-92);
        class35.field815++;
        if (class35.field815 > 750) {
            class95.method779(120);
            return;
        }
        class104.method848(!arg0);
        class55.method416((byte) 59);
        class63.method523((byte) -38);
        if (class148.field3692 != 0) {
            class44.field1069 += 20;
            if (class44.field1069 >= 400) {
                class148.field3692 = 0;
            }
        }
        class20.field452++;
        if (class107.field2568 != 0) {
            class83.field1977++;
            if (class83.field1977 >= 15) {
                if (class107.field2568 == 3) {
                    class65.field1634 = true;
                }
                if (class107.field2568 == 2) {
                    class135.field3239 = true;
                }
                class107.field2568 = 0;
            }
        }
        if (class32.field760 != 0) {
            if (class53.field1278 > class68.field1656 + 5 || class68.field1656 - 5 > class53.field1278 || class76.field1798 > class69.field1695 + 5 || class69.field1695 - 5 > class76.field1798) {
                class32.field753 = true;
            }
            class14.field314++;
            if (class60.field1520 == 0) {
                if (class32.field760 == 3) {
                    class65.field1634 = true;
                }
                if (class32.field760 == 2) {
                    class135.field3239 = true;
                }
                class32.field760 = 0;
                if (class32.field753 && class14.field314 >= 5) {
                    class152.field3743 = -1;
                    class77.method619((byte) 22);
                    if (class32.field749 == class152.field3743 && class125.field2991 != class12.field293) {
                        class146 var20 = class48.method360(-97, class32.field749);
                        class9.field219++;
                        byte var21 = 0;
                        if (class111.field2699 == 1 && var20.field3601 == 206) {
                            var21 = 1;
                        }
                        if (var20.field3597[class125.field2991] <= 0) {
                            var21 = 0;
                        }
                        if (class96.method792(class23.method196(var20, (byte) -125), 708440092)) {
                            int var22 = class125.field2991;
                            int var23 = class12.field293;
                            var20.field3597[var22] = var20.field3597[var23];
                            var20.field3657[var22] = var20.field3657[var23];
                            var20.field3597[var23] = -1;
                            var20.field3657[var23] = 0;
                        } else if (var21 == 1) {
                            int var24 = class12.field293;
                            int var25 = class125.field2991;
                            while (var24 != var25) {
                                if (var24 > var25) {
                                    var20.method1199(var24 - 1, (byte) 124, var24);
                                    var24--;
                                } else if (var25 > var24) {
                                    var20.method1199(var24 + 1, (byte) 120, var24);
                                    var24++;
                                }
                            }
                        } else {
                            var20.method1199(class125.field2991, (byte) 127, class12.field293);
                        }
                        class152.field3751.method929(34, -14044);
                        class152.field3751.method470((byte) -103, class12.field293);
                        class152.field3751.method452(var21, 255);
                        class152.field3751.method451(class125.field2991, (byte) 28);
                        class152.field3751.method458(127, class32.field749);
                    }
                } else if ((class152.field3747 == 1 || class8.method40(class131.field3135 - 1, -35)) && class131.field3135 > 2) {
                    class122.method963(0);
                } else if (class131.field3135 > 0) {
                    class34.method271((byte) 102, class131.field3135 - 1);
                }
                class83.field1977 = 10;
                class48.field1151 = 0;
            }
        }
        byte var26 = 34;
        if (class19.field425 == -1) {
            if (class106.field2552 != -1) {
                class96.method789(class106.field2552, 338, 4, var26, 4, 255, 0, 516);
            } else if (class95.field2294 != -1) {
                class96.method789(class95.field2294, 338, 4, var26, 4, 255, 0, 516);
            }
            if (class80.field1900 != -1) {
                class96.method789(class80.field1900, 466, 553, var26, 205, 255, 1, 743);
            } else if (class21.field491[class49.field1167] != -1) {
                class96.method789(class21.field491[class49.field1167], 466, 553, var26, 205, 255, 1, 743);
            }
            if (class49.field1174 != -1) {
                class96.method789(class49.field1174, 453, 17, var26, 357, 255, 2, 496);
            } else if (class99.field2384 != -1) {
                class96.method789(class99.field2384, 453, 17, var26, 357, 255, 2, 496);
            }
        } else {
            class96.method789(class19.field425, 503, 0, var26, 0, 255, 3, 765);
            if (class115.field2752 != -1) {
                class96.method789(class115.field2752, 503, 0, var26, 0, 255, 3, 765);
            }
        }
        if (class19.field425 == -1) {
            if (class106.field2552 != -1) {
                class96.method789(class106.field2552, 338, 4, ~var26, 4, 255, 0, 516);
            } else if (class95.field2294 != -1) {
                class96.method789(class95.field2294, 338, 4, ~var26, 4, 255, 0, 516);
            }
            if (class80.field1900 != -1) {
                class96.method789(class80.field1900, 466, 553, ~var26, 205, 255, 1, 743);
            } else if (class21.field491[class49.field1167] != -1) {
                class96.method789(class21.field491[class49.field1167], 466, 553, ~var26, 205, 255, 1, 743);
            }
            if (class49.field1174 != -1) {
                class96.method789(class49.field1174, 453, 17, ~var26, 357, 255, 2, 496);
            } else if (class99.field2384 != -1) {
                class96.method789(class99.field2384, 453, 17, ~var26, 357, 255, 2, 496);
            }
        } else {
            class96.method789(class19.field425, 503, 0, ~var26, 0, 255, 3, 765);
            if (class115.field2752 != -1) {
                class96.method789(class115.field2752, 503, 0, ~var26, 0, 255, 3, 765);
            }
        }
        class98.method803(2);
        if (class127.field3053 != -1) {
            int var27 = class127.field3053;
            int var28 = class127.field3037;
            boolean var29 = class56.method432(0, 0, true, 0, var28, 0, var27, 0, 0, class116.field2789.field162[0], true, class116.field2789.field192[0]);
            class127.field3053 = -1;
            if (var29) {
                class90.field2116 = class139.field3389;
                class148.field3692 = 1;
                class44.field1069 = 0;
                class145.field3517 = class20.field470;
            }
        }
        if (class48.field1151 == 1 && class21.field487 != null) {
            class21.field487 = null;
            class65.field1634 = true;
            class48.field1151 = 0;
        }
        class77.method616(-126);
        if (class19.field425 == -1) {
            class4.method15(true);
            class108.method871(87);
            class107.method863(false);
        }
        if (class60.field1520 == 1 || class48.field1151 == 1) {
            class125.field2986++;
        }
        if (class22.field538 == -1 && class44.field1074 == -1 && class42.field996 == -1) {
            if (class60.field1533 > 0) {
                class60.field1533--;
            }
        } else if (class52.field1231 > class60.field1533) {
            class60.field1533++;
            if (class60.field1533 == class52.field1231) {
                if (class44.field1074 != -1) {
                    class135.field3239 = true;
                }
                if (class22.field538 != -1) {
                    class65.field1634 = true;
                }
            }
        }
        class141.method1137(-69);
        if (class106.field2548) {
            class12.method88(117);
        }
        for (int var30 = 0; var30 < 5; var30++) {
            int var10002 = class125.field2978[var30]++;
        }
        class37.method285((byte) 118);
        int var31 = class62.method515(arg0);
        int var32 = class15.method99(-105);
        if (var31 > 4500 && var32 > 4500) {
            class26.field642 = 250;
            class80.field1892++;
            class111.method912(4000, (byte) 119);
            class152.field3751.method929(10, -14044);
        }
        class117.field2816++;
        if (class117.field2816 > 500) {
            class117.field2816 = 0;
            int var33 = (int) (Math.random() * 8.0D);
            if ((var33 & 0x4) == 4) {
                class47.field1119 += class123.field2945;
            }
            if ((var33 & 0x2) == 2) {
                class46.field1099 += class120.field2908;
            }
            if ((var33 & 0x1) == 1) {
                class5.field127 += class75.field1752;
            }
        }
        class23.field567++;
        class97.field2342++;
        if (class47.field1119 < -40) {
            class123.field2945 = 1;
        }
        if (class47.field1119 > 40) {
            class123.field2945 = -1;
        }
        if (class5.field127 < -50) {
            class75.field1752 = 2;
        }
        if (class46.field1099 < -55) {
            class120.field2908 = 2;
        }
        if (class46.field1099 > 55) {
            class120.field2908 = -2;
        }
        if (class5.field127 > 50) {
            class75.field1752 = -2;
        }
        if (class97.field2342 > 500) {
            int var34 = (int) (Math.random() * 8.0D);
            class97.field2342 = 0;
            if ((var34 & 0x2) == 2) {
                class48.field1143 += class17.field381;
            }
            if ((var34 & 0x1) == 1) {
                class5.field126 += class38.field872;
            }
        }
        if (class48.field1143 < -20) {
            class17.field381 = 1;
        }
        if (class5.field126 < -60) {
            class38.field872 = 2;
        }
        if (class5.field126 > 60) {
            class38.field872 = -2;
        }
        if (class48.field1143 > 10) {
            class17.field381 = -1;
        }
        if (class23.field567 > 50) {
            class152.field3751.method929(119, -14044);
            class87.field2074++;
        }
        try {
            if (class104.field2501 != null && class152.field3751.field1485 > 0) {
                class104.field2501.method870(class152.field3751.field1485, 0, 0, class152.field3751.field1495);
                class152.field3751.field1485 = 0;
                class23.field567 = 0;
            }
        } catch (IOException var35) {
            class95.method779(-34);
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(I[BII)V")
    public final void method295(int arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        field894++;
        try {
            if (arg2 != 20) {
                this.method299(-110L, -119);
            }
            if (this.field883 < (long) arg0 + this.field900) {
                this.field883 = (long) arg0 + this.field900;
            }
            if (this.field885 != -1L && (this.field900 < this.field885 || this.field885 + (long) this.field886 < this.field900)) {
                this.method296((byte) 93);
            }
            if (this.field885 != -1L && (long) arg0 + this.field900 > (long) this.field893.length + this.field885) {
                int var5 = (int) (this.field885 + (long) this.field893.length - this.field900);
                arg0 -= var5;
                class71.method575(arg1, arg3, this.field893, (int) (this.field900 - this.field885), var5);
                arg3 += var5;
                this.field900 += var5;
                this.field886 = this.field893.length;
                this.method296((byte) 93);
            }
            if (arg0 > this.field893.length) {
                long var6 = -1L;
                if (this.field903 != this.field900) {
                    this.field889.method35(this.field900, 1);
                    this.field903 = this.field900;
                }
                this.field889.method34(arg1, arg0, arg3, -16047);
                if (this.field888 <= this.field900 && this.field900 < this.field888 + (long) this.field908) {
                    var6 = this.field900;
                } else if (this.field888 >= this.field900 && this.field888 < (long) arg0 + this.field900) {
                    var6 = this.field888;
                }
                long var8 = -1L;
                if (this.field888 < (long) arg0 + this.field900 && (long) arg0 + this.field900 <= this.field888 - -((long) this.field908)) {
                    var8 = this.field900 + (long) arg0;
                } else if (this.field900 < (long) this.field908 + this.field888 && (long) arg0 + this.field900 >= (long) this.field908 + this.field888) {
                    var8 = (long) this.field908 + this.field888;
                }
                this.field903 += arg0;
                if (this.field903 > this.field899) {
                    this.field899 = this.field903;
                }
                if (var6 > -1L && var8 > var6) {
                    int var10 = (int) (var8 - var6);
                    class71.method575(arg1, (int) ((long) arg3 + var6 - this.field900), this.field907, (int) (var6 - this.field888), var10);
                }
                this.field900 += arg0;
            } else if (arg0 > 0) {
                if (this.field885 == -1L) {
                    this.field885 = this.field900;
                }
                class71.method575(arg1, arg3, this.field893, (int) (this.field900 - this.field885), arg0);
                this.field900 += arg0;
                if ((long) this.field886 < this.field900 - this.field885) {
                    this.field886 = (int) (this.field900 - this.field885);
                }
            }
        } catch (IOException var12) {
            this.field903 = -1L;
            throw var12;
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(B)V")
    private final void method296(byte arg0) throws IOException {
        field898++;
        if (this.field885 != -1L) {
            if (this.field903 != this.field885) {
                this.field889.method35(this.field885, 1);
                this.field903 = this.field885;
            }
            long var2 = -1L;
            this.field889.method34(this.field893, this.field886, 0, -16047);
            if (this.field888 <= this.field885 && this.field885 < this.field888 + (long) this.field908) {
                var2 = this.field885;
            } else if (this.field885 <= this.field888 && this.field888 < (long) this.field886 + this.field885) {
                var2 = this.field888;
            }
            long var4 = -1L;
            this.field903 += this.field886;
            if (this.field899 < this.field903) {
                this.field899 = this.field903;
            }
            if ((long) this.field886 + this.field885 > this.field888 && (long) this.field886 + this.field885 <= (long) this.field908 + this.field888) {
                var4 = (long) this.field886 + this.field885;
            } else if (this.field885 < this.field888 + (long) this.field908 && this.field888 + (long) this.field908 <= (long) this.field886 + this.field885) {
                var4 = (long) this.field908 + this.field888;
            }
            if (var2 > -1L && var2 < var4) {
                int var6 = (int) (var4 - var2);
                class71.method575(this.field893, (int) (var2 - this.field885), this.field907, (int) (var2 - this.field888), var6);
            }
            this.field885 = -1L;
            this.field886 = 0;
        }
        if (arg0 != 93) {
            this.method299(37L, -8);
        }
    }

    @OriginalMember(owner = "client!fc", name = "c", descriptor = "(I)V")
    public static void method297(int arg0) {
        if (arg0 != 23753) {
            method297(120);
        }
        field915 = null;
        field895 = null;
        field914 = null;
        field902 = null;
        field882 = null;
        field905 = null;
        field913 = null;
        field912 = null;
        field910 = null;
        field891 = null;
        field911 = null;
        field909 = null;
    }

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "(Z)J")
    public final long method298(boolean arg0) {
        field881++;
        if (!arg0) {
            field914 = null;
        }
        return this.field883;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(JI)V")
    public final void method299(long arg0, int arg1) {
        int var4 = 109 / ((-arg1 - 18) / 44);
        field906++;
        if (arg0 >= 0L) {
            this.field900 = arg0;
        }
    }

    @OriginalMember(owner = "client!fc", name = "<init>", descriptor = "(Laf;II)V")
    public class39(class7 arg0, int arg1, int arg2) throws IOException {
        this.field889 = arg0;
        this.field883 = this.field899 = arg0.method32((byte) 43);
        this.field907 = new byte[arg1];
        this.field893 = new byte[arg2];
        this.field900 = 0L;
    }
}
