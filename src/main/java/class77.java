import java.awt.event.ActionEvent;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;
import java.util.Calendar;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!la")
public class class77 {

    @OriginalMember(owner = "client!la", name = "h", descriptor = "[B")
    private byte[] field1774 = new byte[4];

    @OriginalMember(owner = "client!la", name = "l", descriptor = "Ln;")
    private class90 field1778;

    @OriginalMember(owner = "client!la", name = "u", descriptor = "I")
    private int field1787;

    @OriginalMember(owner = "client!la", name = "p", descriptor = "J")
    private long field1782;

    @OriginalMember(owner = "client!la", name = "a", descriptor = "I")
    public static int field1767 = -1;

    @OriginalMember(owner = "client!la", name = "m", descriptor = "I")
    public static volatile int field1779 = 0;

    @OriginalMember(owner = "client!la", name = "t", descriptor = "Laf;")
    private static class7 field1786 = class48.method406(40, "Unable to find ");

    @OriginalMember(owner = "client!la", name = "v", descriptor = "Laf;")
    private static class7 field1788 = class48.method406(40, "Error connecting to server)3");

    @OriginalMember(owner = "client!la", name = "c", descriptor = "Laf;")
    public static class7 field1769 = field1788;

    @OriginalMember(owner = "client!la", name = "r", descriptor = "Laf;")
    public static class7 field1784 = field1786;

    @OriginalMember(owner = "client!la", name = "k", descriptor = "Ljava/util/Calendar;")
    public static Calendar field1777 = Calendar.getInstance();

    @OriginalMember(owner = "client!la", name = "B", descriptor = "I")
    public static int field1793 = 0;

    @OriginalMember(owner = "client!la", name = "b", descriptor = "I")
    private int field1768;

    @OriginalMember(owner = "client!la", name = "d", descriptor = "I")
    private int field1770;

    @OriginalMember(owner = "client!la", name = "e", descriptor = "I")
    public static int field1771;

    @OriginalMember(owner = "client!la", name = "f", descriptor = "I")
    public static int field1772;

    @OriginalMember(owner = "client!la", name = "g", descriptor = "I")
    public static int field1773;

    @OriginalMember(owner = "client!la", name = "i", descriptor = "I")
    public static int field1775;

    @OriginalMember(owner = "client!la", name = "o", descriptor = "I")
    public static int field1781;

    @OriginalMember(owner = "client!la", name = "q", descriptor = "I")
    public static int field1783;

    @OriginalMember(owner = "client!la", name = "w", descriptor = "I")
    public static int field1789;

    @OriginalMember(owner = "client!la", name = "x", descriptor = "I")
    public static int field1790;

    @OriginalMember(owner = "client!la", name = "y", descriptor = "I")
    public static int field1791;

    @OriginalMember(owner = "client!la", name = "j", descriptor = "Lof;")
    public static class103 field1776;

    @OriginalMember(owner = "client!la", name = "z", descriptor = "Lkb;")
    public static class71 field1792;

    @OriginalMember(owner = "client!la", name = "n", descriptor = "Ljava/io/DataInputStream;")
    private DataInputStream field1780;

    @OriginalMember(owner = "client!la", name = "s", descriptor = "[B")
    private byte[] field1785;

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(I)[B")
    public final byte[] method658(int arg0) throws IOException {
        field1772++;
        if (this.field1782 < class55.method445(0)) {
            throw new IOException("fdt");
        }
        if (this.field1787 == arg0) {
            if (this.field1778.field2087 == 2) {
                throw new IOException("fds");
            }
            if (this.field1778.field2087 == 1) {
                this.field1787 = 1;
                this.field1780 = (DataInputStream) this.field1778.field2090;
            }
        }
        if (this.field1787 == 1) {
            int var2 = this.field1780.available();
            if (var2 > 0) {
                if (this.field1770 + var2 > 4) {
                    var2 = 4 - this.field1770;
                }
                this.field1770 += this.field1780.read(this.field1774, this.field1770, var2);
                if (this.field1770 == 4) {
                    int var3 = (new class122(this.field1774)).method972(-100);
                    this.field1787 = 2;
                    this.field1785 = new byte[var3];
                }
            }
        }
        if (this.field1787 == 2) {
            int var4 = this.field1780.available();
            if (var4 > 0) {
                if (this.field1768 + var4 > this.field1785.length) {
                    var4 = this.field1785.length - this.field1768;
                }
                this.field1768 += this.field1780.read(this.field1785, this.field1768, var4);
                if (this.field1785.length == this.field1768) {
                    return this.field1785;
                }
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(III[Lof;IIZII)V")
    public static final void method659(int arg0, int arg1, int arg2, class103[] arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8) {
        field1773++;
        if (!arg6) {
            method659(33, 93, -108, null, -119, -29, false, 43, 127);
        }
        for (int var9 = 0; var9 < arg3.length; var9++) {
            class103 var10 = arg3[var9];
            if (var10 != null && (!var10.field2565 || var10.field2483 == 0 || var10.field2480 || class7.method98(26454, var10) != 0 || class73.field1695 == var10) && var10.field2516 == arg2 && (!var10.field2565 || !class24.method229(!arg6, var10))) {
                int var11 = var10.field2497 + arg1;
                int var12 = var10.field2473 + arg5;
                if (class81.field1865 == var10) {
                    class82.field1903 = var12;
                    class86.field2004 = true;
                    class21.field532 = var11;
                }
                int var13;
                int var14;
                int var15;
                int var16;
                if (var10.field2483 == 2) {
                    var13 = arg8;
                    var14 = arg4;
                    var15 = arg7;
                    var16 = arg0;
                } else if (var10.field2483 == 9) {
                    int var19 = var12;
                    int var20 = var11;
                    int var21 = var10.field2550 + var11;
                    if (var11 > var21) {
                        var20 = var21;
                        var21 = var11;
                    }
                    var21++;
                    int var23 = var10.field2517 + var12;
                    if (var12 > var23) {
                        var19 = var23;
                        var23 = var12;
                    }
                    var15 = arg7 >= var19 ? arg7 : var19;
                    var16 = var21 < arg0 ? var21 : arg0;
                    var23++;
                    var13 = var20 > arg8 ? var20 : arg8;
                    var14 = arg4 <= var23 ? arg4 : var23;
                } else {
                    var13 = var11 <= arg8 ? arg8 : var11;
                    var15 = var12 > arg7 ? var12 : arg7;
                    int var17 = var10.field2517 + var12;
                    var14 = var17 < arg4 ? var17 : arg4;
                    int var18 = var10.field2550 + var11;
                    var16 = arg0 > var18 ? var18 : arg0;
                }
                if (!var10.field2565 || var13 < var16 && var14 > var15) {
                    if (var10.field2512 == 1337) {
                        class141.method1151(15569, var10);
                    } else if (var10.field2512 == 1338) {
                        class50.method416(var11, var12, 5);
                    } else {
                        if (var10.field2483 == 0) {
                            if (!var10.field2565 && class24.method229(false, var10) && field1776 != var10) {
                                continue;
                            }
                            method659(var16, var11 - var10.field2437, var10.field2442, arg3, var14, var12 - var10.field2486, true, var15, var13);
                            if (var10.field2433 != null) {
                                method659(var16, var11 - var10.field2437, var10.field2442, var10.field2433, var14, var12 - var10.field2486, true, var15, var13);
                            }
                            class28 var25 = (class28) class75.field1748.method126((long) var10.field2442, (byte) 92);
                            if (var25 != null) {
                                class137.method1125(var15, var14, false, var16, var25.field734, var12, var11, var13);
                            }
                        }
                        if (var10.field2565) {
                            boolean var26;
                            if (var13 <= class113.field2709 && class111.field2681 >= var15 && class113.field2709 < var16 && var14 > class111.field2681) {
                                var26 = true;
                            } else {
                                var26 = false;
                            }
                            boolean var27 = false;
                            boolean var28 = false;
                            if (class13.field337 == 1 && class10.field267 >= var13 && var15 <= class111.field2668 && var16 > class10.field267 && var14 > class111.field2668) {
                                var27 = true;
                            }
                            if (class97.field2311 == 1 && var26) {
                                var28 = true;
                            }
                            if (var27) {
                                class80.method676(var10, class10.field267 - var11, 20881, class111.field2668 - var12);
                            }
                            if (class81.field1865 != null && class81.field1865 != var10 && var26 && class89.method734((byte) 88, class7.method98(26454, var10))) {
                                class4.field41 = var10;
                            }
                            if (class73.field1695 == var10) {
                                class127.field3061 = var12;
                                class39.field965 = var11;
                                class106.field2607 = true;
                            }
                            if (var10.field2480) {
                                if (var26 && class142.field3364 != 0 && var10.field2469 != null) {
                                    class39 var29 = new class39();
                                    var29.field962 = var10.field2469;
                                    var29.field964 = class142.field3364;
                                    var29.field967 = var10;
                                    class9.field219.method765(var29, 0);
                                }
                                if (class81.field1865 != null || class78.field1817) {
                                    var28 = false;
                                    var26 = false;
                                    var27 = false;
                                }
                                if (!var10.field2558 && var27) {
                                    var10.field2558 = true;
                                    if (var10.field2542 != null) {
                                        class39 var30 = new class39();
                                        var30.field964 = class111.field2668 - var12;
                                        var30.field962 = var10.field2542;
                                        var30.field972 = class10.field267 - var11;
                                        var30.field967 = var10;
                                        class9.field219.method765(var30, 0);
                                    }
                                }
                                if (var10.field2558 && var28 && var10.field2476 != null) {
                                    class39 var31 = new class39();
                                    var31.field962 = var10.field2476;
                                    var31.field972 = class113.field2709 - var11;
                                    var31.field967 = var10;
                                    var31.field964 = class111.field2681 - var12;
                                    class9.field219.method765(var31, 0);
                                }
                                if (var10.field2558 && !var28) {
                                    var10.field2558 = false;
                                    if (var10.field2534 != null) {
                                        class39 var32 = new class39();
                                        var32.field972 = class113.field2709 - var11;
                                        var32.field962 = var10.field2534;
                                        var32.field964 = class111.field2681 - var12;
                                        var32.field967 = var10;
                                        class12.field314.method765(var32, 0);
                                    }
                                }
                                if (var28 && var10.field2502 != null) {
                                    class39 var33 = new class39();
                                    var33.field964 = class111.field2681 - var12;
                                    var33.field967 = var10;
                                    var33.field962 = var10.field2502;
                                    var33.field972 = class113.field2709 - var11;
                                    class9.field219.method765(var33, 0);
                                }
                                if (!var10.field2514 && var26) {
                                    var10.field2514 = true;
                                    if (var10.field2529 != null) {
                                        class39 var34 = new class39();
                                        var34.field964 = class111.field2681 - var12;
                                        var34.field972 = class113.field2709 - var11;
                                        var34.field962 = var10.field2529;
                                        var34.field967 = var10;
                                        class9.field219.method765(var34, 0);
                                    }
                                }
                                if (var10.field2514 && var26 && var10.field2496 != null) {
                                    class39 var35 = new class39();
                                    var35.field967 = var10;
                                    var35.field972 = class113.field2709 - var11;
                                    var35.field962 = var10.field2496;
                                    var35.field964 = class111.field2681 - var12;
                                    class9.field219.method765(var35, 0);
                                }
                                if (var10.field2514 && !var26) {
                                    var10.field2514 = false;
                                    if (var10.field2456 != null) {
                                        class39 var36 = new class39();
                                        var36.field967 = var10;
                                        var36.field962 = var10.field2456;
                                        var36.field964 = class111.field2681 - var12;
                                        var36.field972 = class113.field2709 - var11;
                                        class12.field314.method765(var36, 0);
                                    }
                                }
                                if (var10.field2432 != null) {
                                    class39 var37 = new class39();
                                    var37.field967 = var10;
                                    var37.field962 = var10.field2432;
                                    class144.field3408.method765(var37, 0);
                                }
                                if (class23.field637 && var10.field2546 != null) {
                                    class39 var38 = new class39();
                                    var38.field967 = var10;
                                    var38.field962 = var10.field2546;
                                    class9.field219.method765(var38, 0);
                                }
                                if (var10.field2474 != null && class113.field2714 > var10.field2559) {
                                    if (var10.field2467 == null || class113.field2714 - var10.field2559 > 32) {
                                        class39 var43 = new class39();
                                        var43.field967 = var10;
                                        var43.field962 = var10.field2474;
                                        class9.field219.method765(var43, 0);
                                    } else {
                                        label404: for (int var39 = var10.field2559; var39 < class113.field2714; var39++) {
                                            int var40 = class116.field2770[var39 & 0x1F];
                                            for (int var41 = 0; var41 < var10.field2467.length; var41++) {
                                                if (var10.field2467[var41] == var40) {
                                                    class39 var42 = new class39();
                                                    var42.field967 = var10;
                                                    var42.field962 = var10.field2474;
                                                    class9.field219.method765(var42, 0);
                                                    break label404;
                                                }
                                            }
                                        }
                                    }
                                    var10.field2559 = class113.field2714;
                                }
                                if (var10.field2513 != null && class10.field274 > var10.field2458) {
                                    if (var10.field2452 == null || class10.field274 - var10.field2458 > 32) {
                                        class39 var48 = new class39();
                                        var48.field967 = var10;
                                        var48.field962 = var10.field2513;
                                        class9.field219.method765(var48, 0);
                                    } else {
                                        label380: for (int var44 = var10.field2458; var44 < class10.field274; var44++) {
                                            int var45 = class37.field924[var44 & 0x1F];
                                            for (int var46 = 0; var46 < var10.field2452.length; var46++) {
                                                if (var10.field2452[var46] == var45) {
                                                    class39 var47 = new class39();
                                                    var47.field962 = var10.field2513;
                                                    var47.field967 = var10;
                                                    class9.field219.method765(var47, 0);
                                                    break label380;
                                                }
                                            }
                                        }
                                    }
                                    var10.field2458 = class10.field274;
                                }
                                if (var10.field2453 != null && var10.field2439 < class136.field3248) {
                                    if (var10.field2533 == null || class136.field3248 - var10.field2439 > 32) {
                                        class39 var53 = new class39();
                                        var53.field962 = var10.field2453;
                                        var53.field967 = var10;
                                        class9.field219.method765(var53, 0);
                                    } else {
                                        label356: for (int var49 = var10.field2439; var49 < class136.field3248; var49++) {
                                            int var50 = class57.field1370[var49 & 0x1F];
                                            for (int var51 = 0; var51 < var10.field2533.length; var51++) {
                                                if (var10.field2533[var51] == var50) {
                                                    class39 var52 = new class39();
                                                    var52.field967 = var10;
                                                    var52.field962 = var10.field2453;
                                                    class9.field219.method765(var52, 0);
                                                    break label356;
                                                }
                                            }
                                        }
                                    }
                                    var10.field2439 = class136.field3248;
                                }
                                if (var10.field2468 < class68.field1485 && var10.field2536 != null) {
                                    class39 var54 = new class39();
                                    var54.field962 = var10.field2536;
                                    var54.field967 = var10;
                                    class9.field219.method765(var54, 0);
                                }
                                if (var10.field2468 < class95.field2260 && var10.field2544 != null) {
                                    class39 var55 = new class39();
                                    var55.field962 = var10.field2544;
                                    var55.field967 = var10;
                                    class9.field219.method765(var55, 0);
                                }
                                if (var10.field2468 < class142.field3366 && var10.field2485 != null) {
                                    class39 var56 = new class39();
                                    var56.field962 = var10.field2485;
                                    var56.field967 = var10;
                                    class9.field219.method765(var56, 0);
                                }
                                if (class151.field3527 > var10.field2468 && var10.field2545 != null) {
                                    class39 var57 = new class39();
                                    var57.field962 = var10.field2545;
                                    var57.field967 = var10;
                                    class9.field219.method765(var57, 0);
                                }
                                var10.field2468 = class69.field1508;
                                if (var10.field2479 != null) {
                                    for (int var58 = 0; var58 < class43.field1039; var58++) {
                                        class39 var59 = new class39();
                                        var59.field967 = var10;
                                        var59.field978 = class3.field40[var58];
                                        var59.field982 = class50.field1195[var58];
                                        var59.field962 = var10.field2479;
                                        class9.field219.method765(var59, 0);
                                    }
                                }
                            }
                        }
                        if (!var10.field2565) {
                            if ((var10.field2505 >= 0 || var10.field2484 != 0) && class113.field2709 >= var13 && var15 <= class111.field2681 && class113.field2709 < var16 && var14 > class111.field2681) {
                                if (var10.field2505 < 0) {
                                    field1776 = var10;
                                } else {
                                    field1776 = arg3[var10.field2505];
                                }
                            }
                            if (var10.field2483 == 8 && class113.field2709 >= var13 && class111.field2681 >= var15 && class113.field2709 < var16 && var14 > class111.field2681) {
                                class137.field3271 = var10;
                            }
                            if (var10.field2482 > var10.field2517) {
                                class99.method815(var10, var11 + var10.field2550, class111.field2681, var12, var10.field2482, var10.field2517, 104, class113.field2709);
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(Z)V")
    public static final void method660(boolean arg0) {
        for (int var1 = -1; var1 < class130.field3088; var1++) {
            int var2;
            if (var1 == -1) {
                var2 = 2047;
            } else {
                var2 = class87.field2046[var1];
            }
            class92 var3 = class18.field425[var2];
            if (var3 != null) {
                class37.method329(1, var3, (byte) 127);
            }
        }
        if (!arg0) {
            field1788 = null;
        }
        field1775++;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IB)Z")
    public static final boolean method661(int arg0, byte arg1) {
        field1789++;
        if (arg0 >= 97 && arg0 <= 122) {
            return true;
        }
        if (arg1 < 73) {
            method662(-87);
        }
        if (arg0 >= 65 && arg0 <= 90) {
            return true;
        } else {
            return arg0 >= 48 && arg0 <= 57;
        }
    }

    @OriginalMember(owner = "client!la", name = "b", descriptor = "(I)V")
    public static void method662(int arg0) {
        if (arg0 <= 124) {
            return;
        }
        field1776 = null;
        field1786 = null;
        field1784 = null;
        field1777 = null;
        field1788 = null;
        field1792 = null;
        field1769 = null;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(Loc;BLjava/lang/Object;)V")
    public static final void method663(class100 arg0, byte arg1, Object arg2) {
        field1790++;
        if (arg0.field2372 == null) {
            return;
        }
        for (int var3 = 0; var3 < 50 && arg0.field2372.peekEvent() != null; var3++) {
            class79.method673(2, 1L);
        }
        if (arg1 != 92) {
            field1791 = 95;
        }
        if (arg2 != null) {
            arg0.field2372.postEvent(new ActionEvent(arg2, 1001, "dummy"));
        }
    }

    @OriginalMember(owner = "client!la", name = "<init>", descriptor = "(Loc;Ljava/net/URL;)V")
    public class77(class100 arg0, URL arg1) {
        this.field1778 = arg0.method828(0, arg1);
        this.field1787 = 0;
        this.field1782 = class55.method445(0) + 30000L;
    }
}
