import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!d")
public class class19 extends class107 {

    @OriginalMember(owner = "client!d", name = "cb", descriptor = "I")
    private int field451 = 128;

    @OriginalMember(owner = "client!d", name = "gb", descriptor = "Z")
    public boolean field455 = true;

    @OriginalMember(owner = "client!d", name = "db", descriptor = "I")
    private int field452 = 0;

    @OriginalMember(owner = "client!d", name = "tb", descriptor = "I")
    public int field468 = -1;

    @OriginalMember(owner = "client!d", name = "Ab", descriptor = "I")
    private int field475 = -1;

    @OriginalMember(owner = "client!d", name = "fb", descriptor = "Lrc;")
    public class105 field454 = class133.field3227;

    @OriginalMember(owner = "client!d", name = "mb", descriptor = "I")
    public int field461 = 1;

    @OriginalMember(owner = "client!d", name = "xb", descriptor = "I")
    public int field472 = -1;

    @OriginalMember(owner = "client!d", name = "vb", descriptor = "I")
    public int field470 = -1;

    @OriginalMember(owner = "client!d", name = "Db", descriptor = "I")
    public int field478 = 32;

    @OriginalMember(owner = "client!d", name = "Mb", descriptor = "I")
    public int field487 = -1;

    @OriginalMember(owner = "client!d", name = "Nb", descriptor = "I")
    private int field488 = -1;

    @OriginalMember(owner = "client!d", name = "Qb", descriptor = "I")
    private int field491 = 128;

    @OriginalMember(owner = "client!d", name = "Kb", descriptor = "I")
    public int field485 = -1;

    @OriginalMember(owner = "client!d", name = "jb", descriptor = "Z")
    public boolean field458 = false;

    @OriginalMember(owner = "client!d", name = "Vb", descriptor = "I")
    private int field496 = 0;

    @OriginalMember(owner = "client!d", name = "Tb", descriptor = "I")
    public int field494 = -1;

    @OriginalMember(owner = "client!d", name = "Hb", descriptor = "I")
    public int field482 = -1;

    @OriginalMember(owner = "client!d", name = "Ub", descriptor = "Z")
    public boolean field495 = true;

    @OriginalMember(owner = "client!d", name = "eb", descriptor = "I")
    public int field453 = -1;

    @OriginalMember(owner = "client!d", name = "Yb", descriptor = "I")
    public int field499 = -1;

    @OriginalMember(owner = "client!d", name = "Zb", descriptor = "[Lrc;")
    public class105[] field500 = new class105[5];

    @OriginalMember(owner = "client!d", name = "rb", descriptor = "[Lta;")
    public static class115[] field466 = new class115[32768];

    @OriginalMember(owner = "client!d", name = "lb", descriptor = "Lrc;")
    public static class105 field460 = class43.method374("Duell akzeptieren", 0);

    @OriginalMember(owner = "client!d", name = "Jb", descriptor = "Lrc;")
    public static class105 field484 = class43.method374("Name des Gegenstands eingeben:", 0);

    @OriginalMember(owner = "client!d", name = "ib", descriptor = "Lrc;")
    private static class105 field457 = class43.method374("Starting game engine)3)3)3", 0);

    @OriginalMember(owner = "client!d", name = "yb", descriptor = "Lrc;")
    public static class105 field473 = field457;

    @OriginalMember(owner = "client!d", name = "Ob", descriptor = "Lrc;")
    public static class105 field489 = class43.method374("scrollbar", 0);

    @OriginalMember(owner = "client!d", name = "Gb", descriptor = "J")
    public static long field481 = 0L;

    @OriginalMember(owner = "client!d", name = "Pb", descriptor = "Lrc;")
    public static class105 field490 = class43.method374("@yel@", 0);

    @OriginalMember(owner = "client!d", name = "Wb", descriptor = "Lrc;")
    private static class105 field497 = class43.method374("Create a free account", 0);

    @OriginalMember(owner = "client!d", name = "zb", descriptor = "Lrc;")
    public static class105 field474 = class43.method374("Wir vermuten ihr Spielkonto wurde gestohlen", 0);

    @OriginalMember(owner = "client!d", name = "ub", descriptor = "Lrc;")
    public static class105 field469 = field497;

    @OriginalMember(owner = "client!d", name = "Z", descriptor = "I")
    public static int field448;

    @OriginalMember(owner = "client!d", name = "bb", descriptor = "I")
    public static int field450;

    @OriginalMember(owner = "client!d", name = "kb", descriptor = "I")
    public static int field459;

    @OriginalMember(owner = "client!d", name = "ob", descriptor = "I")
    public int field463;

    @OriginalMember(owner = "client!d", name = "pb", descriptor = "I")
    public static int field464;

    @OriginalMember(owner = "client!d", name = "sb", descriptor = "I")
    public static int field467;

    @OriginalMember(owner = "client!d", name = "Cb", descriptor = "I")
    public static int field477;

    @OriginalMember(owner = "client!d", name = "Eb", descriptor = "I")
    public static int field479;

    @OriginalMember(owner = "client!d", name = "Fb", descriptor = "I")
    public static int field480;

    @OriginalMember(owner = "client!d", name = "Ib", descriptor = "I")
    public static int field483;

    @OriginalMember(owner = "client!d", name = "Lb", descriptor = "I")
    public static int field486;

    @OriginalMember(owner = "client!d", name = "Rb", descriptor = "I")
    public static int field492;

    @OriginalMember(owner = "client!d", name = "Sb", descriptor = "I")
    public static int field493;

    @OriginalMember(owner = "client!d", name = "ac", descriptor = "I")
    public static int field501;

    @OriginalMember(owner = "client!d", name = "ab", descriptor = "Lbd;")
    public static class11 field449;

    @OriginalMember(owner = "client!d", name = "hb", descriptor = "Lpb;")
    public static class92 field456;

    @OriginalMember(owner = "client!d", name = "nb", descriptor = "[I")
    public int[] field462;

    @OriginalMember(owner = "client!d", name = "qb", descriptor = "[I")
    private int[] field465;

    @OriginalMember(owner = "client!d", name = "wb", descriptor = "[I")
    private int[] field471;

    @OriginalMember(owner = "client!d", name = "Bb", descriptor = "[I")
    private int[] field476;

    @OriginalMember(owner = "client!d", name = "Xb", descriptor = "[I")
    private int[] field498;

    @OriginalMember(owner = "client!d", name = "c", descriptor = "(B)V", line = 5)
    public static void method215(byte arg0) {
        if (arg0 <= 57) {
            return;
        }
        field456 = null;
        field489 = null;
        field497 = null;
        field460 = null;
        field490 = null;
        field474 = null;
        field473 = null;
        field457 = null;
        field484 = null;
        field469 = null;
        field466 = null;
        field449 = null;
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(Lb;Z)V", line = 26)
    public final void method216(class7 arg0, boolean arg1) {
        while (true) {
            int var3 = arg0.method96(27023);
            if (var3 == 0) {
                if (arg1) {
                    return;
                }
                field448++;
                return;
            }
            this.method217(var3, 24, arg0);
        }
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(IILb;)V", line = 46)
    private final void method217(int arg0, int arg1, class7 arg2) {
        if (arg0 == 1) {
            int var4 = arg2.method96(27023);
            this.field465 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field465[var5] = arg2.method101(2);
            }
        } else if (arg0 == 2) {
            this.field454 = arg2.method62((byte) 43);
        } else if (arg0 == 12) {
            this.field461 = arg2.method96(27023);
        } else if (arg0 == 13) {
            this.field453 = arg2.method101(2);
        } else if (arg0 == 14) {
            this.field494 = arg2.method101(2);
        } else if (arg0 == 15) {
            this.field470 = arg2.method101(2);
        } else if (arg0 == 16) {
            this.field472 = arg2.method101(2);
        } else if (arg0 == 17) {
            this.field494 = arg2.method101(2);
            this.field487 = arg2.method101(2);
            this.field468 = arg2.method101(2);
            this.field499 = arg2.method101(2);
        } else if (arg0 >= 30 && arg0 < 35) {
            this.field500[arg0 - 30] = arg2.method62((byte) 42);
            if (this.field500[arg0 - 30].method831(class10.field200, -21607)) {
                this.field500[arg0 - 30] = null;
            }
        } else if (arg0 == 40) {
            int var10 = arg2.method96(27023);
            this.field476 = new int[var10];
            this.field471 = new int[var10];
            for (int var11 = 0; var11 < var10; var11++) {
                this.field476[var11] = arg2.method101(2);
                this.field471[var11] = arg2.method101(2);
            }
        } else if (arg0 == 60) {
            int var6 = arg2.method96(27023);
            this.field498 = new int[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field498[var7] = arg2.method101(2);
            }
        } else if (arg0 == 93) {
            this.field455 = false;
        } else if (arg0 == 95) {
            this.field482 = arg2.method101(2);
        } else if (arg0 == 97) {
            this.field491 = arg2.method101(2);
        } else if (arg0 == 98) {
            this.field451 = arg2.method101(2);
        } else if (arg0 == 99) {
            this.field458 = true;
        } else if (arg0 == 100) {
            this.field496 = arg2.method85(-4794);
        } else if (arg0 == 101) {
            this.field452 = arg2.method85(-4794) * 5;
        } else if (arg0 == 102) {
            this.field485 = arg2.method101(2);
        } else if (arg0 == 103) {
            this.field478 = arg2.method101(2);
        } else if (arg0 == 106) {
            this.field475 = arg2.method101(2);
            if (this.field475 == 65535) {
                this.field475 = -1;
            }
            this.field488 = arg2.method101(2);
            if (this.field488 == 65535) {
                this.field488 = -1;
            }
            int var8 = arg2.method96(27023);
            this.field462 = new int[var8 + 1];
            for (int var9 = 0; var9 <= var8; var9++) {
                this.field462[var9] = arg2.method101(2);
                if (this.field462[var9] == 65535) {
                    this.field462[var9] = -1;
                }
            }
        } else if (arg0 == 107) {
            this.field495 = false;
        }
        int var12 = -5 / ((-arg1 - 39) / 49);
        field477++;
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(ILtb;IILtb;)Ljb;", line = 229)
    public final class56 method218(int arg0, class116 arg1, int arg2, int arg3, class116 arg4) {
        field450++;
        if (arg2 != 1762) {
            field481 = -120L;
        }
        if (this.field462 != null) {
            class19 var6 = this.method223(true);
            return var6 == null ? null : var6.method218(arg0, arg1, 1762, arg3, arg4);
        }
        class56 var7 = (class56) class55.field1099.method601((long) this.field463, (byte) 118);
        if (var7 == null) {
            boolean var8 = false;
            for (int var9 = 0; var9 < this.field465.length; var9++) {
                if (!class18.field419.method748(true, this.field465[var9], 0)) {
                    var8 = true;
                }
            }
            if (var8) {
                return null;
            }
            class56[] var10 = new class56[this.field465.length];
            for (int var11 = 0; var11 < this.field465.length; var11++) {
                var10[var11] = class56.method448(class18.field419, this.field465[var11], 0);
            }
            if (var10.length == 1) {
                var7 = var10[0];
            } else {
                var7 = new class56(var10, var10.length);
            }
            if (this.field476 != null) {
                for (int var12 = 0; var12 < this.field476.length; var12++) {
                    var7.method434(this.field476[var12], this.field471[var12]);
                }
            }
            var7.method452();
            var7.method438(this.field496 + 64, this.field452 + 850, -30, -50, -30, true);
            class55.field1099.method608((long) this.field463, var7, (byte) 125);
        }
        class56 var13;
        if (arg4 != null && arg1 != null) {
            var13 = arg4.method945((byte) -126, arg3, arg1, var7, arg0);
        } else if (arg4 != null) {
            var13 = arg4.method940(arg3, false, var7);
        } else if (arg1 == null) {
            var13 = var7.method439(true);
        } else {
            var13 = arg1.method940(arg0, false, var7);
        }
        if (this.field491 != 128 || this.field451 != 128) {
            var13.method430(this.field491, this.field451, this.field491);
        }
        return var13;
    }

    @OriginalMember(owner = "client!d", name = "d", descriptor = "(B)V", line = 333)
    public final void method219(byte arg0) {
        if (arg0 < 49) {
            this.method216(null, false);
        }
        field483++;
    }

    @OriginalMember(owner = "client!d", name = "e", descriptor = "(B)V", line = 346)
    public static final void method220(byte arg0) {
        if (arg0 != 47) {
            return;
        }
        field501++;
        try {
            if (class50.field1062 == 0) {
                if (class24.field576 != null) {
                    class24.field576.method1037(0);
                    class24.field576 = null;
                }
                class22.field541 = null;
                class100.field2284 = 0;
                class50.field1062 = 1;
                class7.field134 = false;
            }
            if (class50.field1062 == 1) {
                if (class22.field541 == null) {
                    class22.field541 = class122.field2991.method309(class6.field82, 27307);
                }
                if (class22.field541.field916 == 2) {
                    throw new IOException();
                }
                if (class22.field541.field916 == 1) {
                    class24.field576 = new class129((Socket) class22.field541.field918, class122.field2991);
                    class50.field1062 = 2;
                    class22.field541 = null;
                }
            }
            if (class50.field1062 == 2) {
                long var1 = class83.field1849 = class37.field855.method828(455);
                int var3 = (int) (var1 >> 16 & 0x1FL);
                class66.field1472.field143 = 0;
                class66.field1472.method102((byte) 123, 14);
                class66.field1472.method102((byte) 123, var3);
                class24.field576.method1034(0, class66.field1472.field117, -107, 2);
                class50.field1062 = 3;
                class18.field389.field143 = 0;
            }
            if (class50.field1062 == 3) {
                int var4 = class24.field576.method1033(arg0 - 47);
                if (var4 != 0) {
                    class83.method698(22, var4);
                    return;
                }
                class50.field1062 = 4;
                class18.field389.field143 = 0;
            }
            if (class50.field1062 == 4) {
                if (class18.field389.field143 < 8) {
                    int var5 = class24.field576.method1032((byte) 112);
                    if (var5 > 8 - class18.field389.field143) {
                        var5 = 8 - class18.field389.field143;
                    }
                    if (var5 > 0) {
                        class24.field576.method1040((byte) 89, class18.field389.field117, var5, class18.field389.field143);
                        class18.field389.field143 += var5;
                    }
                }
                if (class18.field389.field143 == 8) {
                    class18.field389.field143 = 0;
                    class89.field2046 = class18.field389.method71((byte) 74);
                    class50.field1062 = 5;
                }
            }
            if (class50.field1062 == 5) {
                int[] var6 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (class89.field2046 >> 32), (int) class89.field2046 };
                class66.field1472.field143 = 0;
                class66.field1472.method102((byte) 123, 10);
                class66.field1472.method100(var6[0], false);
                class66.field1472.method100(var6[1], false);
                class66.field1472.method100(var6[2], false);
                class66.field1472.method100(var6[3], false);
                class66.field1472.method100(class122.field2991.field768, false);
                class66.field1472.method64(class37.field855.method828(455), -75);
                class66.field1472.method94(false, class37.field850);
                class66.field1472.method89(class88.field2021, class134.field3253, (byte) 14);
                class96.field2211.field143 = 0;
                if (class78.field1761 == 40) {
                    class96.field2211.method102((byte) 123, 18);
                } else {
                    class96.field2211.method102((byte) 123, 16);
                }
                class96.field2211.method102((byte) 123, class66.field1472.field143 + 57);
                class96.field2211.method100(439, false);
                class96.field2211.method102((byte) 123, class109.field2520 ? 1 : 0);
                class96.field2211.method100(class106.field2439.field2130, false);
                class96.field2211.method100(class55.field1093.field2130, false);
                class96.field2211.method100(class107.field2465.field2130, false);
                class96.field2211.method100(class31.field737.field2130, false);
                class96.field2211.method100(class72.field1589.field2130, false);
                class96.field2211.method100(class14.field275.field2130, false);
                class96.field2211.method100(class57.field1203.field2130, false);
                class96.field2211.method100(class66.field1501.field2130, false);
                class96.field2211.method100(class111.field2591.field2130, false);
                class96.field2211.method100(class42.field945.field2130, false);
                class96.field2211.method100(class90.field2073.field2130, false);
                class96.field2211.method100(class130.field3163.field2130, false);
                class96.field2211.method100(class126.field3066.field2130, false);
                class96.field2211.method78(0, class66.field1472.field117, 29169, class66.field1472.field143);
                class24.field576.method1034(0, class96.field2211.field117, -127, class96.field2211.field143);
                class66.field1472.method788(110, var6);
                for (int var7 = 0; var7 < 4; var7++) {
                    var6[var7] += 50;
                }
                class18.field389.method788(40, var6);
                class50.field1062 = 6;
            }
            if (class50.field1062 == 6 && class24.field576.method1032((byte) 103) > 0) {
                int var8 = class24.field576.method1033(0);
                if (var8 == 21 && class78.field1761 == 20) {
                    class50.field1062 = 7;
                } else if (var8 == 2) {
                    class50.field1062 = 9;
                } else if (var8 == 15 && class78.field1761 == 40) {
                    class111.method912(0);
                    return;
                } else if (var8 == 23 && class58.field1294 < 1) {
                    class58.field1294++;
                    class50.field1062 = 0;
                } else {
                    class83.method698(22, var8);
                    return;
                }
            }
            if (class50.field1062 == 7 && class24.field576.method1032((byte) 93) > 0) {
                class132.field3173 = class24.field576.method1033(arg0 - 47) * 60 + 180;
                class50.field1062 = 8;
            }
            if (class50.field1062 == 8) {
                class100.field2284 = 0;
                class59.method472(class89.field2054, 0, class10.field190, class108.method878(new class105[] { class75.method637(class132.field3173 / 60, 8241), class58.field1224 }, 2867));
                if (--class132.field3173 <= 0) {
                    class50.field1062 = 0;
                }
            } else {
                if (class50.field1062 == 9 && class24.field576.method1032((byte) 56) >= 8) {
                    class110.field2560 = class24.field576.method1033(0);
                    class86.field1956 = class24.field576.method1033(0) == 1;
                    class55.field1112 = class24.field576.method1033(0);
                    class55.field1112 <<= 0x8;
                    class55.field1112 += class24.field576.method1033(0);
                    class72.field1591 = class24.field576.method1033(0);
                    class24.field576.method1040((byte) 107, class18.field389.field117, 1, 0);
                    class18.field389.field143 = 0;
                    class61.field1348 = class18.field389.method779(13270);
                    class24.field576.method1040((byte) 75, class18.field389.field117, 2, 0);
                    class18.field389.field143 = 0;
                    class80.field1794 = class18.field389.method101(arg0 ^ 0x2D);
                    class50.field1062 = 10;
                }
                if (class50.field1062 != 10) {
                    class100.field2284++;
                    if (class100.field2284 > 2000) {
                        if (class58.field1294 < 1) {
                            class50.field1062 = 0;
                            if (class6.field82 == class14.field281) {
                                class6.field82 = class127.field3075;
                            } else {
                                class6.field82 = class14.field281;
                            }
                            class58.field1294++;
                        } else {
                            class83.method698(22, -3);
                        }
                    }
                } else if (class24.field576.method1032((byte) 94) >= class80.field1794) {
                    class18.field389.field143 = 0;
                    class24.field576.method1040((byte) 114, class18.field389.field117, class80.field1794, 0);
                    class14.method162(0);
                    class45.field1019 = -1;
                    class61.method491(false, false);
                    class61.field1348 = -1;
                }
            }
        } catch (IOException var9) {
            if (class58.field1294 < 1) {
                class50.field1062 = 0;
                if (class6.field82 == class14.field281) {
                    class6.field82 = class127.field3075;
                } else {
                    class6.field82 = class14.field281;
                }
                class58.field1294++;
            } else {
                class83.method698(arg0 ^ 0x39, -2);
            }
        }
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(II)V", line = 688)
    public static final void method221(int arg0, int arg1) {
        if (arg0 >= -4) {
            field449 = null;
        }
        class120 var2 = (class120) class17.field349.method624((byte) 79, (long) arg1);
        field492++;
        if (var2 != null) {
            var2.method551(107);
        }
    }

    @OriginalMember(owner = "client!d", name = "f", descriptor = "(I)Z", line = 725)
    public final boolean method222(int arg0) {
        field486++;
        if (this.field462 == null) {
            return true;
        }
        int var2 = -1;
        if (~this.field475 != arg0) {
            var2 = class98.method805((byte) -106, this.field475);
        } else if (this.field488 != -1) {
            var2 = class16.field337[this.field488];
        }
        return var2 >= 0 && this.field462.length > var2 && this.field462[var2] != -1;
    }

    @OriginalMember(owner = "client!d", name = "b", descriptor = "(Z)Ld;", line = 764)
    public final class19 method223(boolean arg0) {
        field493++;
        if (!arg0) {
            return null;
        }
        int var2 = -1;
        if (this.field475 != -1) {
            var2 = class98.method805((byte) 119, this.field475);
        } else if (this.field488 != -1) {
            var2 = class16.field337[this.field488];
        }
        return var2 < 0 || var2 >= this.field462.length || this.field462[var2] == -1 ? null : class12.method142(100, this.field462[var2]);
    }

    @OriginalMember(owner = "client!d", name = "g", descriptor = "(I)Ljb;", line = 793)
    public final class56 method224(int arg0) {
        field464++;
        if (this.field462 != null) {
            class19 var2 = this.method223(true);
            return var2 == null ? null : var2.method224(91);
        } else if (this.field498 == null) {
            return null;
        } else {
            boolean var3 = false;
            if (arg0 <= 50) {
                return null;
            }
            for (int var4 = 0; var4 < this.field498.length; var4++) {
                if (!class18.field419.method748(true, this.field498[var4], 0)) {
                    var3 = true;
                }
            }
            if (var3) {
                return null;
            }
            class56[] var5 = new class56[this.field498.length];
            for (int var6 = 0; var6 < this.field498.length; var6++) {
                var5[var6] = class56.method448(class18.field419, this.field498[var6], 0);
            }
            class56 var7;
            if (var5.length == 1) {
                var7 = var5[0];
            } else {
                var7 = new class56(var5, var5.length);
            }
            if (this.field476 != null) {
                for (int var8 = 0; var8 < this.field476.length; var8++) {
                    var7.method434(this.field476[var8], this.field471[var8]);
                }
            }
            return var7;
        }
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/Throwable;)V", line = 882)
    public static final void method225(int arg0, String arg1, Throwable arg2) {
        try {
            String var3 = "";
            if (arg2 != null) {
                var3 = class90.method746(arg2, 41);
            }
            if (arg1 != null) {
                if (arg2 != null) {
                    var3 = var3 + " | ";
                }
                var3 = var3 + arg1;
            }
            System.out.println("Error: " + var3);
            String var4 = var3.replace(':', '.');
            String var5 = var4.replace('@', '_');
            String var6 = var5.replace('&', '_');
            String var7 = var6.replace('#', '_');
            if (arg0 != 0) {
                return;
            }
            class40 var8 = class18.field414.method314(new URL(class18.field414.field767.getCodeBase(), "clienterror.ws?c=" + class60.field1331 + "&u=" + class83.field1849 + "&v1=" + class33.field771 + "&v2=" + class33.field765 + "&e=" + var7), (byte) -60);
            while (var8.field916 == 0) {
                class75.method634(1L, arg0 + 20306);
            }
            if (var8.field916 == 1) {
                DataInputStream var9 = (DataInputStream) var8.field918;
                var9.read();
                var9.close();
            }
        } catch (Exception var10) {
        }
        field479++;
    }
}
