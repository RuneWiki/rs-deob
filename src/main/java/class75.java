import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("hf")
public class class75 {

    @OriginalMember(owner = "hf", name = "j", descriptor = "I")
    private int field1436 = 0;

    @OriginalMember(owner = "hf", name = "g", descriptor = "J")
    private long field1433 = -1L;

    @OriginalMember(owner = "hf", name = "n", descriptor = "J")
    private long field1440 = -1L;

    @OriginalMember(owner = "hf", name = "B", descriptor = "Lsa;")
    private class167 field1454;

    @OriginalMember(owner = "hf", name = "h", descriptor = "J")
    private long field1434;

    @OriginalMember(owner = "hf", name = "m", descriptor = "J")
    private long field1439;

    @OriginalMember(owner = "hf", name = "z", descriptor = "[B")
    private byte[] field1452;

    @OriginalMember(owner = "hf", name = "y", descriptor = "[B")
    private byte[] field1451;

    @OriginalMember(owner = "hf", name = "l", descriptor = "J")
    private long field1438;

    @OriginalMember(owner = "hf", name = "p", descriptor = "I")
    public static int field1442 = 1;

    @OriginalMember(owner = "hf", name = "x", descriptor = "[Llf;")
    public static class109[] field1450 = new class109[100];

    @OriginalMember(owner = "hf", name = "q", descriptor = "Llf;")
    public static class109 field1443 = class35.method275("Bitte versuchen Sie es erneut)3", 2);

    @OriginalMember(owner = "hf", name = "A", descriptor = "B")
    public static byte field1453 = 0;

    @OriginalMember(owner = "hf", name = "b", descriptor = "I")
    public static int field1428 = 0;

    @OriginalMember(owner = "hf", name = "a", descriptor = "I")
    public static int field1427;

    @OriginalMember(owner = "hf", name = "c", descriptor = "I")
    public static int field1429;

    @OriginalMember(owner = "hf", name = "e", descriptor = "I")
    public static int field1431;

    @OriginalMember(owner = "hf", name = "f", descriptor = "I")
    public static int field1432;

    @OriginalMember(owner = "hf", name = "i", descriptor = "I")
    public static int field1435;

    @OriginalMember(owner = "hf", name = "k", descriptor = "I")
    public static int field1437;

    @OriginalMember(owner = "hf", name = "o", descriptor = "I")
    public static int field1441;

    @OriginalMember(owner = "hf", name = "r", descriptor = "I")
    public static int field1444;

    @OriginalMember(owner = "hf", name = "s", descriptor = "I")
    private int field1445;

    @OriginalMember(owner = "hf", name = "t", descriptor = "I")
    public static int field1446;

    @OriginalMember(owner = "hf", name = "u", descriptor = "I")
    public static int field1447;

    @OriginalMember(owner = "hf", name = "v", descriptor = "I")
    public static int field1448;

    @OriginalMember(owner = "hf", name = "w", descriptor = "I")
    public static int field1449;

    @OriginalMember(owner = "hf", name = "d", descriptor = "J")
    private long field1430;

    @OriginalMember(owner = "hf", name = "a", descriptor = "(B)V")
    private final void method466(byte arg0) throws IOException {
        this.field1445 = 0;
        if (this.field1438 != this.field1430) {
            this.field1454.method1123(-29, this.field1438);
            this.field1430 = this.field1438;
        }
        if (arg0 != 60) {
            this.method472((byte) -34);
        }
        this.field1440 = this.field1438;
        field1444++;
        while (this.field1452.length > this.field1445) {
            int var2 = this.field1454.method1122(this.field1452.length - this.field1445, this.field1452, this.field1445, 1);
            if (var2 == -1) {
                break;
            }
            this.field1430 += var2;
            this.field1445 += var2;
        }
    }

    @OriginalMember(owner = "hf", name = "b", descriptor = "(B)V")
    public static void method467(byte arg0) {
        field1450 = null;
        field1443 = null;
        if (arg0 != 100) {
            field1453 = 50;
        }
    }

    @OriginalMember(owner = "hf", name = "a", descriptor = "(III[B)V")
    public final void method468(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        field1437++;
        try {
            if (arg3.length < arg1 + arg2) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg2 - arg3.length);
            }
            if (this.field1433 != -1L && this.field1438 >= this.field1433 && (long) this.field1436 + this.field1433 >= this.field1438 - -((long) arg2)) {
                class122.method878(this.field1451, (int) (this.field1438 - this.field1433), arg3, arg1, arg2);
                this.field1438 += arg2;
                return;
            }
            long var5 = this.field1438;
            int var7 = arg1;
            int var8 = arg2;
            if (this.field1438 >= this.field1440 && (long) this.field1445 + this.field1440 > this.field1438) {
                int var9 = (int) ((long) this.field1445 + this.field1440 - this.field1438);
                if (arg2 < var9) {
                    var9 = arg2;
                }
                arg2 -= var9;
                class122.method878(this.field1452, (int) (this.field1438 - this.field1440), arg3, arg1, var9);
                arg1 += var9;
                this.field1438 += var9;
            }
            if (this.field1452.length < arg2) {
                this.field1454.method1123(-96, this.field1438);
                this.field1430 = this.field1438;
                while (arg2 > 0) {
                    int var10 = this.field1454.method1122(arg2, arg3, arg1, 1);
                    if (var10 == -1) {
                        break;
                    }
                    arg1 += var10;
                    this.field1438 += var10;
                    arg2 -= var10;
                    this.field1430 += var10;
                }
            } else if (arg2 > 0) {
                this.method466((byte) 60);
                int var11 = arg2;
                if (this.field1445 < arg2) {
                    var11 = this.field1445;
                }
                arg2 -= var11;
                class122.method878(this.field1452, 0, arg3, arg1, var11);
                arg1 += var11;
                this.field1438 += var11;
            }
            if (this.field1433 != -1L) {
                if (this.field1438 < this.field1433 && arg2 > 0) {
                    int var12 = (int) (this.field1433 - this.field1438) + arg1;
                    if (arg1 + arg2 < var12) {
                        var12 = arg1 + arg2;
                    }
                    while (arg1 < var12) {
                        arg2--;
                        arg3[arg1++] = 0;
                        this.field1438++;
                    }
                }
                long var13 = -1L;
                if (this.field1433 >= var5 && this.field1433 < (long) var8 + var5) {
                    var13 = this.field1433;
                } else if (var5 >= this.field1433 && (long) this.field1436 + this.field1433 > var5) {
                    var13 = var5;
                }
                long var15 = -1L;
                if (this.field1433 + (long) this.field1436 > var5 && (long) var8 + var5 >= (long) this.field1436 + this.field1433) {
                    var15 = (long) this.field1436 + this.field1433;
                } else if (this.field1433 < (long) var8 + var5 && this.field1433 + (long) this.field1436 >= var5 - -((long) var8)) {
                    var15 = (long) var8 + var5;
                }
                if (var13 > -1L && var15 > var13) {
                    int var17 = (int) (var15 - var13);
                    class122.method878(this.field1451, (int) (var13 - this.field1433), arg3, (int) (var13 - var5) + var7, var17);
                    if (this.field1438 < var15) {
                        arg2 = (int) ((long) arg2 + this.field1438 - var15);
                        this.field1438 = var15;
                    }
                }
            }
            if (arg0 >= -124) {
                this.method472((byte) 116);
            }
        } catch (IOException var19) {
            this.field1430 = -1L;
            throw var19;
        }
        if (arg2 > 0) {
            throw new EOFException();
        }
    }

    @OriginalMember(owner = "hf", name = "a", descriptor = "(I)V")
    public final void method469(int arg0) throws IOException {
        field1431++;
        this.method479((byte) -32);
        if (arg0 != 2) {
            this.field1433 = 5L;
        }
        this.field1454.method1120((byte) 88);
    }

    @OriginalMember(owner = "hf", name = "a", descriptor = "(II)Z")
    public static final boolean method470(int arg0, int arg1) {
        if (arg0 != 48) {
            field1453 = -8;
        }
        field1446++;
        return arg1 >= 48 && arg1 <= 57;
    }

    @OriginalMember(owner = "hf", name = "a", descriptor = "([BZ)V")
    public final void method471(byte[] arg0, boolean arg1) throws IOException {
        field1448++;
        if (!arg1) {
            this.method468(-126, 0, arg0.length, arg0);
        }
    }

    @OriginalMember(owner = "hf", name = "c", descriptor = "(B)Ljava/io/File;")
    private final File method472(byte arg0) {
        if (arg0 >= -56) {
            return null;
        } else {
            field1435++;
            return this.field1454.method1124(false);
        }
    }

    @OriginalMember(owner = "hf", name = "a", descriptor = "([IIIIII)V")
    public static final void method473(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class3 var6 = class78.field1550[arg3][arg4][arg5];
        if (var6 == null) {
            return;
        }
        class127 var7 = var6.field35;
        if (var7 != null) {
            int var8 = var7.field2458;
            if (var8 != 0) {
                for (int var9 = 0; var9 < 4; var9++) {
                    arg0[arg1] = var8;
                    arg0[arg1 + 1] = var8;
                    arg0[arg1 + 2] = var8;
                    arg0[arg1 + 3] = var8;
                    arg1 += arg2;
                }
            }
            return;
        }
        class43 var10 = var6.field36;
        if (var10 == null) {
            return;
        }
        int var11 = var10.field905;
        int var12 = var10.field900;
        int var13 = var10.field888;
        int var14 = var10.field904;
        int[] var15 = class96.field1952[var11];
        int[] var16 = class93.field1910[var12];
        int var17 = 0;
        if (var13 != 0) {
            for (int var18 = 0; var18 < 4; var18++) {
                arg0[arg1] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg0[arg1 + 1] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg0[arg1 + 2] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg0[arg1 + 3] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg1 += arg2;
            }
            return;
        }
        for (int var19 = 0; var19 < 4; var19++) {
            if (var15[var16[var17++]] != 0) {
                arg0[arg1] = var14;
            }
            if (var15[var16[var17++]] != 0) {
                arg0[arg1 + 1] = var14;
            }
            if (var15[var16[var17++]] != 0) {
                arg0[arg1 + 2] = var14;
            }
            if (var15[var16[var17++]] != 0) {
                arg0[arg1 + 3] = var14;
            }
            arg1 += arg2;
        }
    }

    @OriginalMember(owner = "hf", name = "a", descriptor = "([BIBI)V")
    public final void method474(byte[] arg0, int arg1, byte arg2, int arg3) throws IOException {
        field1447++;
        try {
            if (arg2 != 19) {
                method475((byte) -8);
            }
            if (this.field1438 + (long) arg3 > this.field1439) {
                this.field1439 = (long) arg3 + this.field1438;
            }
            if (this.field1433 != -1L && (this.field1433 > this.field1438 || this.field1438 > (long) this.field1436 + this.field1433)) {
                this.method479((byte) -74);
            }
            if (this.field1433 != -1L && (long) this.field1451.length + this.field1433 < this.field1438 - -((long) arg3)) {
                int var5 = (int) (this.field1433 + (long) this.field1451.length - this.field1438);
                class122.method878(arg0, arg1, this.field1451, (int) (this.field1438 - this.field1433), var5);
                arg3 -= var5;
                arg1 += var5;
                this.field1438 += var5;
                this.field1436 = this.field1451.length;
                this.method479((byte) -85);
            }
            if (this.field1451.length < arg3) {
                long var6 = -1L;
                long var8 = -1L;
                if (this.field1438 != this.field1430) {
                    this.field1454.method1123(-107, this.field1438);
                    this.field1430 = this.field1438;
                }
                this.field1454.method1121(arg0, arg1, (byte) -7, arg3);
                if (this.field1440 < (long) arg3 + this.field1438 && this.field1440 + (long) this.field1445 >= (long) arg3 + this.field1438) {
                    var8 = this.field1438 + (long) arg3;
                } else if ((long) this.field1445 + this.field1440 > this.field1438 && this.field1438 + (long) arg3 >= (long) this.field1445 + this.field1440) {
                    var8 = (long) this.field1445 + this.field1440;
                }
                this.field1430 += arg3;
                if (this.field1440 <= this.field1438 && this.field1438 < this.field1440 + (long) this.field1445) {
                    var6 = this.field1438;
                } else if (this.field1438 <= this.field1440 && this.field1440 < (long) arg3 + this.field1438) {
                    var6 = this.field1440;
                }
                if (this.field1430 > this.field1434) {
                    this.field1434 = this.field1430;
                }
                if (var6 > -1L && var8 > var6) {
                    int var10 = (int) (var8 - var6);
                    class122.method878(arg0, (int) ((long) arg1 + var6 - this.field1438), this.field1452, (int) (var6 - this.field1440), var10);
                }
                this.field1438 += arg3;
            } else if (arg3 > 0) {
                if (this.field1433 == -1L) {
                    this.field1433 = this.field1438;
                }
                class122.method878(arg0, arg1, this.field1451, (int) (this.field1438 - this.field1433), arg3);
                this.field1438 += arg3;
                if ((long) this.field1436 < this.field1438 - this.field1433) {
                    this.field1436 = (int) (this.field1438 - this.field1433);
                }
            }
        } catch (IOException var12) {
            this.field1430 = -1L;
            throw var12;
        }
    }

    @OriginalMember(owner = "hf", name = "d", descriptor = "(B)Z")
    public static final boolean method475(byte arg0) {
        field1449++;
        int var1 = -112 % (arg0 / 50);
        return class84.field1711 == 0 ? class67.field1309.method1176(68) : true;
    }

    @OriginalMember(owner = "hf", name = "b", descriptor = "(I)J")
    public final long method476(int arg0) {
        if (arg0 >= -116) {
            this.method476(89);
        }
        field1432++;
        return this.field1439;
    }

    @OriginalMember(owner = "hf", name = "a", descriptor = "(JZ)V")
    public final void method477(long arg0, boolean arg1) throws IOException {
        field1427++;
        if (arg0 < 0L) {
            throw new IOException("Invalid seek to " + arg0 + " in file " + this.method472((byte) -77));
        }
        if (arg1) {
            this.field1452 = null;
        }
        this.field1438 = arg0;
    }

    @OriginalMember(owner = "hf", name = "a", descriptor = "(IIIIII)V")
    public static final void method478(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 < 0) {
            arg0 = 0;
        } else if (arg0 >= class103.field2036 * 128) {
            arg0 = class103.field2036 * 128 - 1;
        }
        if (arg2 < 0) {
            arg2 = 0;
        } else if (arg2 >= class65.field1245 * 128) {
            arg2 = class65.field1245 * 128 - 1;
        }
        class102.field2020++;
        class142.field2743 = class124.field2383[arg3];
        class118.field2330 = class124.field2387[arg3];
        class185.field3528 = class124.field2383[arg4];
        class50.field1023 = class124.field2387[arg4];
        class136.field2633 = class23.field522[(arg3 - 128) / 32][arg4 / 64];
        class18.field371 = arg0;
        class178.field3369 = arg1;
        class144.field2782 = arg2;
        class158.field2975 = arg0 / 128;
        class31.field735 = arg2 / 128;
        class209.field4076 = arg5;
        class5.field75 = class158.field2975 - class26.field549;
        if (class5.field75 < 0) {
            class5.field75 = 0;
        }
        class24.field533 = class31.field735 - class26.field549;
        if (class24.field533 < 0) {
            class24.field533 = 0;
        }
        class140.field2708 = class26.field549 + class158.field2975;
        if (class140.field2708 > class103.field2036) {
            class140.field2708 = class103.field2036;
        }
        class31.field731 = class31.field735 + class26.field549;
        if (class31.field731 > class65.field1245) {
            class31.field731 = class65.field1245;
        }
        class184.method1248();
        class36.field796 = 0;
        for (int var6 = class193.field3692; var6 < class44.field920; var6++) {
            class3[][] var31 = class78.field1550[var6];
            for (int var32 = class5.field75; var32 < class140.field2708; var32++) {
                for (int var33 = class24.field533; var33 < class31.field731; var33++) {
                    class3 var34 = var31[var32][var33];
                    if (var34 != null) {
                        if (var34.field23 <= arg5 && (class136.field2633[var32 + class26.field549 - class158.field2975][var33 + class26.field549 - class31.field735] || class29.field623[var6][var32][var33] - arg1 >= 2000)) {
                            var34.field25 = true;
                            var34.field33 = true;
                            if (var34.field13 > 0) {
                                var34.field18 = true;
                            } else {
                                var34.field18 = false;
                            }
                            class36.field796++;
                        } else {
                            var34.field25 = false;
                            var34.field33 = false;
                            var34.field22 = 0;
                        }
                    }
                }
            }
        }
        for (int var7 = class193.field3692; var7 < class44.field920; var7++) {
            class3[][] var20 = class78.field1550[var7];
            for (int var21 = -class26.field549; var21 <= 0; var21++) {
                int var22 = class158.field2975 + var21;
                int var23 = class158.field2975 - var21;
                if (var22 >= class5.field75 || var23 < class140.field2708) {
                    for (int var24 = -class26.field549; var24 <= 0; var24++) {
                        int var25 = class31.field735 + var24;
                        int var26 = class31.field735 - var24;
                        if (var22 >= class5.field75) {
                            if (var25 >= class24.field533) {
                                class3 var27 = var20[var22][var25];
                                if (var27 != null && var27.field25) {
                                    class163.method1105(var27, true);
                                }
                            }
                            if (var26 < class31.field731) {
                                class3 var28 = var20[var22][var26];
                                if (var28 != null && var28.field25) {
                                    class163.method1105(var28, true);
                                }
                            }
                        }
                        if (var23 < class140.field2708) {
                            if (var25 >= class24.field533) {
                                class3 var29 = var20[var23][var25];
                                if (var29 != null && var29.field25) {
                                    class163.method1105(var29, true);
                                }
                            }
                            if (var26 < class31.field731) {
                                class3 var30 = var20[var23][var26];
                                if (var30 != null && var30.field25) {
                                    class163.method1105(var30, true);
                                }
                            }
                        }
                        if (class36.field796 == 0) {
                            class128.field2485 = false;
                            return;
                        }
                    }
                }
            }
        }
        for (int var8 = class193.field3692; var8 < class44.field920; var8++) {
            class3[][] var9 = class78.field1550[var8];
            for (int var10 = -class26.field549; var10 <= 0; var10++) {
                int var11 = class158.field2975 + var10;
                int var12 = class158.field2975 - var10;
                if (var11 >= class5.field75 || var12 < class140.field2708) {
                    for (int var13 = -class26.field549; var13 <= 0; var13++) {
                        int var14 = class31.field735 + var13;
                        int var15 = class31.field735 - var13;
                        if (var11 >= class5.field75) {
                            if (var14 >= class24.field533) {
                                class3 var16 = var9[var11][var14];
                                if (var16 != null && var16.field25) {
                                    class163.method1105(var16, false);
                                }
                            }
                            if (var15 < class31.field731) {
                                class3 var17 = var9[var11][var15];
                                if (var17 != null && var17.field25) {
                                    class163.method1105(var17, false);
                                }
                            }
                        }
                        if (var12 < class140.field2708) {
                            if (var14 >= class24.field533) {
                                class3 var18 = var9[var12][var14];
                                if (var18 != null && var18.field25) {
                                    class163.method1105(var18, false);
                                }
                            }
                            if (var15 < class31.field731) {
                                class3 var19 = var9[var12][var15];
                                if (var19 != null && var19.field25) {
                                    class163.method1105(var19, false);
                                }
                            }
                        }
                        if (class36.field796 == 0) {
                            class128.field2485 = false;
                            return;
                        }
                    }
                }
            }
        }
        class128.field2485 = false;
    }

    @OriginalMember(owner = "hf", name = "e", descriptor = "(B)V")
    private final void method479(byte arg0) throws IOException {
        field1429++;
        if (this.field1433 != -1L) {
            long var2 = -1L;
            long var4 = -1L;
            if (this.field1433 != this.field1430) {
                this.field1454.method1123(-104, this.field1433);
                this.field1430 = this.field1433;
            }
            this.field1454.method1121(this.field1451, 0, (byte) -7, this.field1436);
            if (this.field1440 < this.field1433 + (long) this.field1436 && (long) this.field1445 + this.field1440 >= this.field1433 - -((long) this.field1436)) {
                var2 = (long) this.field1436 + this.field1433;
            } else if ((long) this.field1445 + this.field1440 > this.field1433 && (long) this.field1445 + this.field1440 <= (long) this.field1436 + this.field1433) {
                var2 = (long) this.field1445 + this.field1440;
            }
            if (this.field1440 <= this.field1433 && this.field1433 < (long) this.field1445 + this.field1440) {
                var4 = this.field1433;
            } else if (this.field1433 <= this.field1440 && (long) this.field1436 + this.field1433 > this.field1440) {
                var4 = this.field1440;
            }
            this.field1430 += this.field1436;
            if (this.field1430 > this.field1434) {
                this.field1434 = this.field1430;
            }
            if (var4 > -1L && var2 > var4) {
                int var6 = (int) (var2 - var4);
                class122.method878(this.field1451, (int) (var4 - this.field1433), this.field1452, (int) (var4 - this.field1440), var6);
            }
            this.field1433 = -1L;
            this.field1436 = 0;
        }
        int var7 = -86 % ((arg0 - 16) / 42);
    }

    @OriginalMember(owner = "hf", name = "<init>", descriptor = "(Lsa;II)V")
    public class75(class167 arg0, int arg1, int arg2) throws IOException {
        this.field1454 = arg0;
        this.field1439 = this.field1434 = arg0.method1125(-103);
        this.field1452 = new byte[arg1];
        this.field1451 = new byte[arg2];
        this.field1438 = 0L;
    }
}
