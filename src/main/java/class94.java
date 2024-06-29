import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!s")
public class class94 {

    @OriginalMember(owner = "client!s", name = "h", descriptor = "Lda;")
    public static class275 field1610 = class255.method1672(123, ":duelfriend:");

    @OriginalMember(owner = "client!s", name = "g", descriptor = "Lda;")
    public static class275 field1609 = class255.method1672(115, "hitbar_default");

    @OriginalMember(owner = "client!s", name = "i", descriptor = "I")
    public static int field1611 = 0;

    @OriginalMember(owner = "client!s", name = "m", descriptor = "Lda;")
    public static class275 field1615 = class255.method1672(104, "Lade Benutzeroberfl-=che )2 ");

    @OriginalMember(owner = "client!s", name = "o", descriptor = "I")
    public static int field1617 = 0;

    @OriginalMember(owner = "client!s", name = "f", descriptor = "I")
    public static int field1608 = 0;

    @OriginalMember(owner = "client!s", name = "a", descriptor = "I")
    public static int field1603;

    @OriginalMember(owner = "client!s", name = "b", descriptor = "I")
    public static int field1604;

    @OriginalMember(owner = "client!s", name = "d", descriptor = "I")
    public static int field1606;

    @OriginalMember(owner = "client!s", name = "e", descriptor = "I")
    public static int field1607;

    @OriginalMember(owner = "client!s", name = "j", descriptor = "I")
    public static int field1612;

    @OriginalMember(owner = "client!s", name = "k", descriptor = "I")
    public static int field1613;

    @OriginalMember(owner = "client!s", name = "l", descriptor = "I")
    public int field1614;

    @OriginalMember(owner = "client!s", name = "n", descriptor = "I")
    public int field1616;

    @OriginalMember(owner = "client!s", name = "p", descriptor = "I")
    public int field1618;

    @OriginalMember(owner = "client!s", name = "c", descriptor = "[Lrk;")
    public static class20[] field1605;

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(I)Z")
    public static final boolean method674(int arg0) {
        field1607++;
        class90 var1 = class91.field1548;
        synchronized (class91.field1548) {
            if (arg0 != 5953) {
                return true;
            } else if (class160.field2808 == class129.field2268) {
                return false;
            } else {
                class139.field2430 = class39.field655[class160.field2808];
                class192.field3315 = class152.field2652[class160.field2808];
                class160.field2808 = class160.field2808 + 1 & 0x7F;
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(ILij;)V")
    public final void method675(int arg0, class85 arg1) {
        field1606++;
        while (true) {
            int var3 = arg1.method564((byte) 77);
            if (var3 == 0) {
                if (arg0 == 27579) {
                    return;
                } else {
                    this.method680((class85) null, -17, -36);
                    return;
                }
            }
            this.method680(arg1, var3, 1);
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(B)V")
    public static final void method676(byte arg0) {
        if (arg0 != 12) {
            field1615 = null;
        }
        field1613++;
        class41.field685.method987((byte) -112);
        class113.field1989.method987((byte) -105);
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(IIIIII)V")
    public static final void method677(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = arg0 - arg3;
        field1604++;
        int var7 = arg2 - arg4;
        if (var6 == 0) {
            if (var7 != 0) {
                class131.method962(arg2, arg1, arg4, true, arg3);
            }
        } else if (var7 == 0) {
            class185.method1234(arg3, arg1, -110, arg0, arg4);
        } else if (arg5 <= -104) {
            int var8 = (var7 << 12) / var6;
            int var9 = arg4 - (arg3 * var8 >> 12);
            int var10;
            int var11;
            if (class246.field4355 > arg0) {
                var10 = class246.field4355;
                var11 = (class246.field4355 * var8 >> 12) + var9;
            } else if (arg0 > class96.field1632) {
                var11 = var9 + (class96.field1632 * var8 >> 12);
                var10 = class96.field1632;
            } else {
                var10 = arg0;
                var11 = arg2;
            }
            int var12;
            int var13;
            if (arg3 < class246.field4355) {
                var12 = class246.field4355;
                var13 = (class246.field4355 * var8 >> 12) + var9;
            } else if (class96.field1632 < arg3) {
                var12 = class96.field1632;
                var13 = (class96.field1632 * var8 >> 12) + var9;
            } else {
                var12 = arg3;
                var13 = arg4;
            }
            if (class149.field2603 > var11) {
                var10 = (class149.field2603 - var9 << 12) / var8;
                var11 = class149.field2603;
            } else if (var11 > class141.field2493) {
                var10 = (class141.field2493 - var9 << 12) / var8;
                var11 = class141.field2493;
            }
            if (class149.field2603 > var13) {
                var12 = (class149.field2603 - var9 << 12) / var8;
                var13 = class149.field2603;
            } else if (class141.field2493 < var13) {
                var13 = class141.field2493;
                var12 = (class141.field2493 - var9 << 12) / var8;
            }
            class108.method801(-93, arg1, var13, var10, var11, var12);
        }
    }

    @OriginalMember(owner = "client!s", name = "b", descriptor = "(ILij;)V")
    public static final void method678(int arg0, class85 arg1) {
        if (arg0 != -8) {
            method677(6, -11, 81, 111, 94, -112);
        }
        field1603++;
        while (true) {
            while (arg1.field1392 < arg1.field1381.length) {
                int var2 = 0;
                boolean var3 = false;
                int var4 = 0;
                if (arg1.method564((byte) 125) == 1) {
                    var3 = true;
                    var2 = arg1.method564((byte) 96);
                    var4 = arg1.method564((byte) 125);
                }
                int var5 = arg1.method564((byte) 55);
                int var6 = arg1.method564((byte) 91);
                int var7 = class5.field67 + class106.field1841 - (var6 * 64) - 1;
                int var8 = var5 * 64 - class18.field255;
                if (var8 >= 0 && (var7 - 63) >= 0 && (var8 + 63) < class255.field4497 && var7 < class5.field67) {
                    int var9 = var8 >> 6;
                    int var10 = var7 >> 6;
                    for (int var11 = 0; var11 < 64; var11++) {
                        for (int var12 = 0; var12 < 64; var12++) {
                            if (!var3 || var11 >= (var2 * 8) && var11 < var2 * 8 + 8 && var4 * 8 <= var12 && (var4 * 8 + 8) > var12) {
                                byte var13 = arg1.method581(8);
                                if (var13 != 0) {
                                    if (class123.field2207[var9][var10] == null) {
                                        class123.field2207[var9][var10] = new byte[4096];
                                    }
                                    class123.field2207[var9][var10][(63 - var12 << 6) + var11] = var13;
                                    byte var14 = arg1.method581(8);
                                    if (class144.field2526[var9][var10] == null) {
                                        class144.field2526[var9][var10] = new byte[4096];
                                    }
                                    class144.field2526[var9][var10][(63 - var12 << 6) + var11] = var14;
                                }
                            }
                        }
                    }
                } else {
                    for (int var15 = 0; var15 < (var3 ? 64 : 4096); var15++) {
                        byte var16 = arg1.method581(8);
                        if (var16 != 0) {
                            arg1.field1392++;
                        }
                    }
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!s", name = "b", descriptor = "(I)V")
    public static void method679(int arg0) {
        field1605 = null;
        field1610 = null;
        field1615 = null;
        if (arg0 > -35) {
            field1611 = 85;
        }
        field1609 = null;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(Lij;II)V")
    private final void method680(class85 arg0, int arg1, int arg2) {
        if (arg1 == arg2) {
            this.field1618 = arg0.method608(119);
            this.field1614 = arg0.method564((byte) 114);
            this.field1616 = arg0.method564((byte) 94);
        }
        field1612++;
    }
}
