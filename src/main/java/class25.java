import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dc")
public class class25 extends class71 {

    @OriginalMember(owner = "client!dc", name = "E", descriptor = "Ljd;")
    public class66 field606 = new class66();

    @OriginalMember(owner = "client!dc", name = "M", descriptor = "Luc;")
    public class142 field614 = new class142();

    @OriginalMember(owner = "client!dc", name = "F", descriptor = "Lbf;")
    private class14 field607;

    @OriginalMember(owner = "client!dc", name = "G", descriptor = "I")
    public static int field608 = 0;

    @OriginalMember(owner = "client!dc", name = "J", descriptor = "Lid;")
    public static class60 field611 = class11.method72("Anmelde)2Zeitlimit -Uberschritten)3", (byte) 102);

    @OriginalMember(owner = "client!dc", name = "I", descriptor = "Ljd;")
    public static class66 field610 = new class66();

    @OriginalMember(owner = "client!dc", name = "P", descriptor = "Lid;")
    public static class60 field617 = class11.method72("Ihre Ignorieren)2Liste ist voll)1 Sie k-Onnen nur 100 Spieler darauf eintragen)3", (byte) 112);

    @OriginalMember(owner = "client!dc", name = "R", descriptor = "[I")
    public static int[] field619 = new int[] { 0, 1, 2, 3 };

    @OriginalMember(owner = "client!dc", name = "Q", descriptor = "I")
    public static int field618 = 0;

    @OriginalMember(owner = "client!dc", name = "S", descriptor = "Lid;")
    public static class60 field620 = class11.method72("ams", (byte) 99);

    @OriginalMember(owner = "client!dc", name = "y", descriptor = "I")
    public static int field600;

    @OriginalMember(owner = "client!dc", name = "z", descriptor = "I")
    public static int field601;

    @OriginalMember(owner = "client!dc", name = "A", descriptor = "I")
    public static int field602;

    @OriginalMember(owner = "client!dc", name = "B", descriptor = "I")
    public static int field603;

    @OriginalMember(owner = "client!dc", name = "C", descriptor = "I")
    public static int field604;

    @OriginalMember(owner = "client!dc", name = "D", descriptor = "I")
    public static int field605;

    @OriginalMember(owner = "client!dc", name = "H", descriptor = "I")
    public static int field609;

    @OriginalMember(owner = "client!dc", name = "L", descriptor = "I")
    public static int field613;

    @OriginalMember(owner = "client!dc", name = "O", descriptor = "I")
    public static int field616;

    @OriginalMember(owner = "client!dc", name = "K", descriptor = "[Lae;")
    public static class6[] field612;

    @OriginalMember(owner = "client!dc", name = "N", descriptor = "[Lae;")
    public static class6[] field615;

    @OriginalMember(owner = "client!dc", name = "c", descriptor = "(I)V")
    public final void method104(int arg0) {
        field604++;
        this.field614.method104(arg0);
        for (class52 var2 = (class52) this.field606.method496(10153); var2 != null; var2 = (class52) this.field606.method500(-1)) {
            if (!this.field607.method92((byte) 71, var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field1310) {
                        this.method191(var3, -26467, var2);
                        var2.field1310 -= var3;
                        break;
                    }
                    this.method191(var2.field1310, -26467, var2);
                    var3 -= var2.field1310;
                } while (!this.field607.method105(var2, 125, null, 0, var3));
            }
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(IILhc;)V")
    private final void method191(int arg0, int arg1, class52 arg2) {
        field605++;
        if (arg1 != -26467) {
            this.method194(null, 78, -10, -77, 83, null);
        }
        if ((this.field607.field283[arg2.field1319] & 0x4) != 0 && arg2.field1321 < 0) {
            int var4 = this.field607.field310[arg2.field1319] / class14.field318;
            int var5 = (var4 + 1048575 - arg2.field1323) / var4;
            arg2.field1323 = arg0 * var4 + arg2.field1323 & 0xFFFFF;
            if (arg0 >= var5) {
                if (this.field607.field304[arg2.field1319] == 0) {
                    arg2.field1312 = class79.method649(arg2.field1326, arg2.field1312.method654(), arg2.field1312.method653(), arg2.field1312.method662());
                } else {
                    arg2.field1312 = class79.method649(arg2.field1326, arg2.field1312.method654(), 0, arg2.field1312.method662());
                    this.field607.method94(arg2, 112, arg2.field1316.field578[arg2.field1309] < 0);
                }
                if (arg2.field1316.field578[arg2.field1309] < 0) {
                    arg2.field1312.method663(-1);
                }
                arg0 = arg2.field1323 / var4;
            }
        }
        arg2.field1312.method104(arg0);
    }

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "([III)V")
    public final void method120(int[] arg0, int arg1, int arg2) {
        this.field614.method120(arg0, arg1, arg2);
        field616++;
        for (class52 var4 = (class52) this.field606.method496(10153); var4 != null; var4 = (class52) this.field606.method500(-1)) {
            if (!this.field607.method92((byte) 98, var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field1310) {
                        this.method194(var4, var5, var6, 70, var5 + var6, arg0);
                        var4.field1310 -= var6;
                        break;
                    }
                    this.method194(var4, var5, var4.field1310, 112, var5 + var6, arg0);
                    var5 += var4.field1310;
                    var6 -= var4.field1310;
                } while (!this.field607.method105(var4, 119, arg0, var5, var6));
            }
        }
    }

    @OriginalMember(owner = "client!dc", name = "d", descriptor = "(I)V")
    public static void method192(int arg0) {
        field620 = null;
        field612 = null;
        field615 = null;
        field619 = null;
        if (arg0 == 5) {
            field610 = null;
            field617 = null;
            field611 = null;
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(BLte;)V")
    public static final void method193(byte arg0, class137 arg1) {
        field603++;
        if (class129.field2937) {
            class72.method547(arg1, (byte) -124);
            return;
        }
        if (class60.field1466 == 1 && class140.field3185 >= 715 && class139.field3174 >= 453) {
            class31.field725 = !class31.field725;
            if (class31.field725) {
                class113.method906(arg0 - 108);
            } else {
                class98.method772(class28.field661, (byte) -100, false, 255, class141.field3219, class35.field883);
            }
        }
        if (arg0 != 11 || class48.field1265 == 5) {
            return;
        }
        class93.field2296++;
        if (class48.field1265 != 10) {
            return;
        }
        if (class101.field2468 != 2 && class145.field3273 == 0) {
            if (class60.field1466 == 1) {
                byte var2 = 5;
                byte var3 = 100;
                short var4 = 463;
                byte var5 = 35;
                if (var2 <= class140.field3185 && class140.field3185 <= var2 + var3 && class139.field3174 >= var4 && var4 + var5 >= class139.field3174) {
                    class24.method184(false);
                    return;
                }
            }
            if (class60.field1470 != null) {
                class24.method184(false);
            }
        }
        int var6 = class140.field3185;
        int var7 = class139.field3174;
        int var8 = class60.field1466;
        if (class89.field2221 == 0) {
            short var9 = 291;
            short var10 = 302;
            if (var8 == 1 && var6 >= var10 - 75 && var6 <= var10 + 75 && var7 >= var9 - 20 && var7 <= var9 + 20) {
                class89.field2221 = 3;
                class32.field744 = 0;
            }
            short var11 = 462;
            if (var8 == 1 && var11 - 75 <= var6 && var6 <= var11 + 75 && var7 >= var9 - 20 && var7 <= var9 + 20) {
                class141.field3220 = class80.field1950;
                class32.field744 = 0;
                class141.field3210 = class152.field3416;
                class89.field2221 = 2;
                class141.field3205 = class80.field1989;
            }
        } else if (class89.field2221 == 2) {
            short var12 = 231;
            short var13 = 302;
            int var20 = var12 + 30;
            if (var8 == 1 && var7 >= var20 - 15 && var20 > var7) {
                class32.field744 = 0;
            }
            var20 += 15;
            short var14 = 321;
            if (var8 == 1 && var7 >= var20 - 15 && var7 < var20) {
                class32.field744 = 1;
            }
            var20 += 15;
            if (var8 == 1 && var13 - 75 <= var6 && var13 + 75 >= var6 && var14 - 20 <= var7 && var7 <= var14 + 20) {
                class141.field3209 = class141.field3209.method431(97).method434((byte) 97);
                if (class141.field3209.method447((byte) 39) == 0) {
                    class16.method126((byte) 126, class80.field1987, class52.field1307, class80.field1944);
                } else if (class141.field3218.method447((byte) 39) == 0) {
                    class16.method126((byte) -120, class80.field1969, class124.field2861, class80.field1946);
                } else {
                    class16.method126((byte) -121, class80.field1951, class53.field1348, class80.field1968);
                    class45.method348((byte) -94, 20);
                }
            } else {
                short var15 = 462;
                if (var8 == 1 && var6 >= var15 - 75 && var15 + 75 >= var6 && var14 - 20 <= var7 && var7 <= var14 + 20) {
                    class141.field3209 = class141.field3219;
                    class89.field2221 = 0;
                    class141.field3218 = class141.field3219;
                }
                while (true) {
                    while (class22.method178((byte) 108)) {
                        boolean var16 = false;
                        for (int var17 = 0; var17 < class45.field1174.method447((byte) 39); var17++) {
                            if (class152.field3414 == class45.field1174.method418(var17, (byte) 123)) {
                                var16 = true;
                                break;
                            }
                        }
                        if (class32.field744 == 0) {
                            if (class136.field3095 == 85 && class141.field3209.method447((byte) 39) > 0) {
                                class141.field3209 = class141.field3209.method427(class141.field3209.method447((byte) 39) - 1, -103, 0);
                            }
                            if (class136.field3095 == 84 || class136.field3095 == 80) {
                                class32.field744 = 1;
                            }
                            if (var16 && class141.field3209.method447((byte) 39) < 12) {
                                class141.field3209 = class141.field3209.method455(class152.field3414, 20676);
                            }
                        } else if (class32.field744 == 1) {
                            if (class136.field3095 == 85 && class141.field3218.method447((byte) 39) > 0) {
                                class141.field3218 = class141.field3218.method427(class141.field3218.method447((byte) 39) - 1, -120, 0);
                            }
                            if (class136.field3095 == 84 || class136.field3095 == 80) {
                                class32.field744 = 0;
                            }
                            if (class34.field785 == 2 && class136.field3095 == 84) {
                                class141.field3209 = class141.field3209.method431(97).method434((byte) 72);
                                if (class141.field3209.method447((byte) 39) == 0) {
                                    class16.method126((byte) -122, class80.field1987, class52.field1307, class80.field1944);
                                    return;
                                }
                                if (class141.field3218.method447((byte) 39) == 0) {
                                    class16.method126((byte) -127, class80.field1969, class124.field2861, class80.field1946);
                                    return;
                                }
                                class16.method126((byte) 111, class80.field1951, class53.field1348, class80.field1968);
                                class45.method348((byte) -83, 20);
                                return;
                            }
                            if (var16 && class141.field3218.method447((byte) 39) < 20) {
                                class141.field3218 = class141.field3218.method455(class152.field3414, 20676);
                            }
                        }
                    }
                    return;
                }
            }
        } else if (class89.field2221 == 3) {
            short var18 = 382;
            short var19 = 321;
            if (var8 == 1 && var18 - 75 <= var6 && var6 <= var18 + 75 && var19 - 20 <= var7 && var19 + 20 >= var7) {
                class89.field2221 = 0;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(Lhc;IIII[I)V")
    private final void method194(class52 arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5) {
        if (arg3 <= 26) {
            this.method191(-112, 97, null);
        }
        field602++;
        if ((this.field607.field283[arg0.field1319] & 0x4) != 0 && arg0.field1321 < 0) {
            int var7 = this.field607.field310[arg0.field1319] / class14.field318;
            while (true) {
                int var8 = (var7 + 1048575 - arg0.field1323) / var7;
                if (arg2 < var8) {
                    arg0.field1323 += arg2 * var7;
                    break;
                }
                arg2 -= var8;
                arg0.field1312.method120(arg5, arg1, var8);
                arg1 += var8;
                int var9 = class14.field318 / 100;
                int var10 = 262144 / var7;
                if (var10 < var9) {
                    var9 = var10;
                }
                arg0.field1323 += var7 * var8 - 1048576;
                class79 var11 = arg0.field1312;
                if (this.field607.field304[arg0.field1319] == 0) {
                    arg0.field1312 = class79.method649(arg0.field1326, var11.method654(), var11.method653(), var11.method662());
                } else {
                    arg0.field1312 = class79.method649(arg0.field1326, var11.method654(), 0, var11.method662());
                    this.field607.method94(arg0, 114, arg0.field1316.field578[arg0.field1309] < 0);
                    arg0.field1312.method650(var9, var11.method653());
                }
                if (arg0.field1316.field578[arg0.field1309] < 0) {
                    arg0.field1312.method663(-1);
                }
                var11.method677(var9);
                var11.method120(arg5, arg1, arg4 - arg1);
                if (var11.method665()) {
                    this.field614.method1106(var11);
                }
            }
        }
        arg0.field1312.method120(arg5, arg1, arg2);
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "()Lkb;")
    public final class71 method109() {
        field613++;
        class52 var1;
        do {
            var1 = (class52) this.field606.method500(-1);
            if (var1 == null) {
                return null;
            }
        } while (var1.field1312 == null);
        return var1.field1312;
    }

    @OriginalMember(owner = "client!dc", name = "c", descriptor = "()I")
    public final int method113() {
        field600++;
        return 0;
    }

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "()Lkb;")
    public final class71 method87() {
        class52 var1 = (class52) this.field606.method496(10153);
        field601++;
        if (var1 == null) {
            return null;
        } else if (var1.field1312 == null) {
            return this.method109();
        } else {
            return var1.field1312;
        }
    }

    @OriginalMember(owner = "client!dc", name = "<init>", descriptor = "(Lbf;)V")
    public class25(class14 arg0) {
        this.field607 = arg0;
    }
}
