import jagex3.jagmisc.jagmisc;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tu")
public class class176 extends class325 {

    @OriginalMember(owner = "client!tu", name = "Y", descriptor = "Z")
    public boolean field2787 = false;

    @OriginalMember(owner = "client!tu", name = "mb", descriptor = "Z")
    public boolean field2801 = false;

    @OriginalMember(owner = "client!tu", name = "V", descriptor = "I")
    public static int field2784 = 50;

    @OriginalMember(owner = "client!tu", name = "X", descriptor = "I")
    public static int field2786 = 0;

    @OriginalMember(owner = "client!tu", name = "T", descriptor = "[I")
    public static int[] field2782 = new int[field2784];

    @OriginalMember(owner = "client!tu", name = "bb", descriptor = "[I")
    public static int[] field2790 = new int[field2784];

    @OriginalMember(owner = "client!tu", name = "A", descriptor = "[I")
    public static int[] field2780 = new int[field2784];

    @OriginalMember(owner = "client!tu", name = "kb", descriptor = "[I")
    public static int[] field2799 = new int[field2784];

    @OriginalMember(owner = "client!tu", name = "jb", descriptor = "[Ljava/lang/String;")
    public static String[] field2798 = new String[field2784];

    @OriginalMember(owner = "client!tu", name = "hb", descriptor = "[I")
    public static int[] field2796 = new int[field2784];

    @OriginalMember(owner = "client!tu", name = "lb", descriptor = "[I")
    public static int[] field2800 = new int[field2784];

    @OriginalMember(owner = "client!tu", name = "nb", descriptor = "I")
    public static int field2802;

    @OriginalMember(owner = "client!tu", name = "S", descriptor = "I")
    public static int field2781;

    @OriginalMember(owner = "client!tu", name = "U", descriptor = "I")
    public static int field2783;

    @OriginalMember(owner = "client!tu", name = "W", descriptor = "I")
    public static int field2785;

    @OriginalMember(owner = "client!tu", name = "Z", descriptor = "I")
    public static int field2788;

    @OriginalMember(owner = "client!tu", name = "ab", descriptor = "I")
    public static int field2789;

    @OriginalMember(owner = "client!tu", name = "cb", descriptor = "I")
    public static int field2791;

    @OriginalMember(owner = "client!tu", name = "db", descriptor = "I")
    public static int field2792;

    @OriginalMember(owner = "client!tu", name = "eb", descriptor = "I")
    public static int field2793;

    @OriginalMember(owner = "client!tu", name = "fb", descriptor = "I")
    public static int field2794;

    @OriginalMember(owner = "client!tu", name = "gb", descriptor = "I")
    public static int field2795;

    @OriginalMember(owner = "client!tu", name = "ib", descriptor = "I")
    public static int field2797;

    static {
        new class306("You are not currently in a channel.", "Du befindest dich derzeit nicht in einem Chatraum.", "Vous n'êtes dans aucun canal à l'heure actuelle.", "No momento você não está em um canal.");
        field2802 = -1;
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(Lia;I)V", line = 3)
    private final void method1184(class23 arg0, int arg1) {
        ++field2794;
        if (~(arg0.field302.length + -arg0.field301) <= -2) {
            int var3 = arg0.method126((byte) -78);
            if (~var3 <= -1 && var3 <= 17) {
                byte var4;
                if (~var3 != -18) {
                    if (var3 == 16) {
                        var4 = 38;
                    } else if (var3 != 15) {
                        if (var3 == 14) {
                            var4 = 36;
                        } else if (~var3 != -14) {
                            if (var3 != 12) {
                                if (~var3 != -12) {
                                    if (~var3 != -11) {
                                        if (~var3 != -10) {
                                            if (var3 == 8) {
                                                var4 = 30;
                                            } else if (var3 != 7) {
                                                if (var3 != 6) {
                                                    if (var3 == 5) {
                                                        var4 = 28;
                                                    } else if (~var3 == -5) {
                                                        var4 = 24;
                                                    } else if (var3 == 3) {
                                                        var4 = 23;
                                                    } else if (var3 == 2) {
                                                        var4 = 22;
                                                    } else if (~var3 != -2) {
                                                        var4 = 19;
                                                    } else {
                                                        var4 = 23;
                                                    }
                                                } else {
                                                    var4 = 28;
                                                }
                                            } else {
                                                var4 = 29;
                                            }
                                        } else {
                                            var4 = 31;
                                        }
                                    } else {
                                        var4 = 32;
                                    }
                                } else {
                                    var4 = 33;
                                }
                            } else {
                                var4 = 34;
                            }
                        } else {
                            var4 = 35;
                        }
                    } else {
                        var4 = 37;
                    }
                } else {
                    var4 = 40;
                }
                if (arg0.field302.length - arg0.field301 >= var4) {
                    super.field5108 = arg0.method126((byte) -81);
                    if (~super.field5108 <= -2) {
                        if (super.field5108 > 4) {
                            super.field5108 = 4;
                        }
                    } else {
                        super.field5108 = 1;
                    }
                    this.method1194(~arg0.method126((byte) -91) == -2, 92);
                    super.field5123 = arg0.method126((byte) -95) == 1;
                    super.field5118 = ~arg0.method126((byte) -100) == -2;
                    super.field5103 = ~arg0.method126((byte) -118) == -2;
                    super.field5106 = ~arg0.method126((byte) -70) != -2 ? 0 : 1;
                    super.field5122 = arg0.method126((byte) -103) == 1;
                    super.field5096 = ~arg0.method126((byte) -114) == -2;
                    super.field5112 = arg0.method126((byte) -115) == 1;
                    super.field5091 = arg0.method126((byte) -98);
                    if (~super.field5091 < -3) {
                        super.field5091 = 2;
                    }
                    if (var3 >= 17) {
                        super.field5086 = arg0.method126((byte) -101);
                    }
                    if (~var3 > -3) {
                        super.field5127 = ~arg0.method126((byte) -82) == -2;
                        arg0.method126((byte) -118);
                    } else {
                        super.field5127 = ~arg0.method126((byte) -127) == -2;
                        if (var3 >= 17) {
                            super.field5092 = ~arg0.method126((byte) -79) == -2;
                        }
                    }
                    super.field5111 = ~arg0.method126((byte) -113) == -2;
                    super.field5101 = arg0.method126((byte) -96) == 1;
                    super.field5124 = arg0.method126((byte) -120);
                    if (super.field5124 > 2) {
                        super.field5124 = 2;
                    }
                    super.field5093 = super.field5124;
                    super.field5094 = arg0.method126((byte) -71) == 1;
                    super.field5119 = arg0.method126((byte) -91);
                    if (super.field5119 > 127) {
                        super.field5119 = 127;
                    }
                    super.field5087 = arg0.method126((byte) -88);
                    super.field5121 = arg0.method126((byte) -85);
                    if (super.field5121 > 127) {
                        super.field5121 = 127;
                    }
                    if (var3 >= 1) {
                        super.field5089 = arg0.method132(35);
                        super.field5099 = arg0.method132(88);
                    }
                    if (~var3 <= -4 && ~var3 > -7) {
                        arg0.method126((byte) -121);
                    }
                    if (var3 >= 4) {
                        int var5 = arg0.method126((byte) -75);
                        if (~var5 > -1 || var5 > 2) {
                            var5 = 0;
                        }
                        if (~class101.field1668 > -97) {
                            var5 = 0;
                        }
                        class442.method2664(var5, 0);
                    }
                    if (~var3 <= -6) {
                        super.field5113 = arg0.method143(-3230);
                    }
                    int var6 = 0;
                    if (~var3 <= -7) {
                        super.field5120 = var6 = arg0.method126((byte) -95);
                    }
                    if (~super.field5120 != -2 && super.field5120 != 2) {
                        super.field5120 = 2;
                    }
                    if (~var3 <= -8) {
                        super.field5098 = arg0.method126((byte) -120) == 1;
                    }
                    if (var3 >= 8) {
                        super.field5116 = ~arg0.method126((byte) -107) == -2;
                    }
                    if (var3 >= 9) {
                        super.field5104 = arg0.method126((byte) -119);
                    }
                    if (~super.field5104 > -1 || super.field5104 > class455.method2731((byte) -90, class101.field1668)) {
                        super.field5104 = 0;
                    }
                    if (var3 >= 10) {
                        super.field5115 = arg0.method126((byte) -93) != 0;
                    }
                    if (var3 >= 11) {
                        super.field5109 = arg0.method126((byte) -99) != 0;
                    }
                    if (var3 >= 12) {
                        super.field5106 = arg0.method126((byte) -81);
                    }
                    if (super.field5106 < 0 || super.field5106 > 2) {
                        super.field5106 = 1;
                    }
                    if (var3 >= 13) {
                        super.field5100 = ~arg0.method126((byte) -76) == -2;
                    }
                    if (var3 >= 14) {
                        super.field5095 = arg0.method126((byte) -93);
                    } else if (var6 == 0) {
                        super.field5095 = 2;
                    } else {
                        super.field5095 = 1;
                    }
                    if (arg1 <= -56) {
                        if (super.field5095 < 0 || ~super.field5095 < -4) {
                            super.field5095 = 2;
                        }
                        if (var3 >= 15) {
                            super.field5114 = arg0.method126((byte) -104);
                            if (~super.field5114 > -1 || ~super.field5114 < -5) {
                                super.field5114 = ~class291.field4730 == -2 ? 2 : 4;
                            }
                        }
                        if (var3 >= 16) {
                            super.field5125 = ~arg0.method126((byte) -94) == -2;
                            try {
                                if (jagmisc.getTotalPhysicalMemory() <= 268435456L) {
                                    super.field5125 = false;
                                }
                            } catch (Throwable var7) {
                            }
                        }
                        if (~var3 > -18 && ~super.field5095 == -1) {
                            super.field5095 = 2;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(IBI)V", line = 276)
    public static final void method1185(int arg0, byte arg1, int arg2) {
        if (arg1 < -66) {
            ++field2795;
            int var3 = class84.field1467.method2085((byte) -91, class467.field6930.method1954(class300.field4813, -30366));
            for (class162 var4 = (class162) class108.field1934.method2538(-3); var4 != null; var4 = (class162) class108.field1934.method2535((byte) -77)) {
                int var8 = class238.method1634((byte) 76, var4);
                if (~var8 < ~var3) {
                    var3 = var8;
                }
            }
            var3 += 8;
            int var5 = class480.field7080 * 16 + 21;
            int var6 = -(var3 / 2) + arg0;
            if (~(var3 + var6) < ~class358.field5581) {
                var6 = class358.field5581 - var3;
            }
            if (~var6 > -1) {
                var6 = 0;
            }
            int var7 = arg2;
            if (class49.field825 < var5 + arg2) {
                var7 = -var5 + class49.field825;
            }
            class508.field7390 = var6;
            if (~var7 > -1) {
                var7 = 0;
            }
            class387.field5967 = true;
            class265.field4428 = var7;
            class128.field2195 = class480.field7080 * 16 - -(!class331.field5216 ? 22 : 26);
            class134.field2262 = var3;
        }
    }

    @OriginalMember(owner = "client!tu", name = "c", descriptor = "(II)Z", line = 329)
    public final boolean method1186(int arg0, int arg1) {
        int var3 = 24 % ((6 - arg1) / 43);
        ++field2783;
        return ~arg0 == -1 ? super.field5105 : true;
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(BI)I", line = 345)
    public final int method1187(byte arg0, int arg1) {
        ++field2792;
        if (this.field2787) {
            return 0;
        } else {
            int var3 = 29 / ((arg0 - -50) / 62);
            if (!this.method1188(arg1, -124)) {
                return 1;
            } else {
                return !super.field5123 ? 1 : 2;
            }
        }
    }

    @OriginalMember(owner = "client!tu", name = "d", descriptor = "(II)Z", line = 362)
    public final boolean method1188(int arg0, int arg1) {
        ++field2791;
        if (arg1 > -116) {
            this.method1186(35, -122);
        }
        return ~arg0 == -1 && !this.field2801 ? super.field5105 : true;
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(IBIII)V", line = 380)
    public static final void method1189(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        ++field2789;
        if (arg1 >= -42) {
            method1185(74, (byte) -16, 123);
        }
        if (~class525.field7722 == -2) {
            class175.field2779[class6.field74 / 100].method1039(class162.field2574 + -8, class332.field5226 + -8);
        }
        if (class525.field7722 == 2) {
            class175.field2779[class6.field74 / 100 + 4].method1039(class162.field2574 + -8, class332.field5226 + -8);
        }
        class35.method266(-3157);
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(Lnv;Z)V", line = 411)
    public final void method1190(class493 arg0, boolean arg1) {
        ++field2781;
        class62 var3 = null;
        try {
            class169 var4 = arg0.method2890(arg1, "", true);
            while (var4.field2692 == 0) {
                class444.method2667(-28210, 1L);
            }
            if (var4.field2692 == 1) {
                var3 = (class62) var4.field2695;
                class23 var5 = this.method1193((byte) 123);
                var3.method408(0, var5.field301, 0, var5.field302);
            }
        } catch (Exception var7) {
        }
        try {
            if (var3 != null) {
                var3.method410((byte) 71);
            }
        } catch (Exception var6) {
        }
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(B)V", line = 446)
    public static final void method1191(byte arg0) {
        int var1 = -43 % (arg0 / 48);
        ++field2793;
        class239.method1638(-120);
        class421.field6363 = null;
        class412.field6247 = null;
        class65.field975 = null;
        class463.field6884 = null;
        class533.field7842 = null;
    }

    @OriginalMember(owner = "client!tu", name = "<init>", descriptor = "(Lnv;)V", line = 581)
    public class176(class493 arg0) {
        super.field5108 = 3;
        this.method1194(true, 21);
        super.field5121 = 127;
        super.field5119 = 127;
        super.field5099 = 0;
        super.field5096 = true;
        super.field5123 = true;
        super.field5101 = true;
        super.field5094 = true;
        super.field5124 = 0;
        super.field5092 = false;
        super.field5089 = 0;
        super.field5118 = true;
        super.field5122 = true;
        super.field5086 = 0;
        super.field5127 = true;
        super.field5112 = true;
        super.field5103 = true;
        super.field5111 = true;
        super.field5093 = 0;
        super.field5087 = 255;
        super.field5091 = 2;
        super.field5106 = 1;
        if (class101.field1668 >= 96) {
            class442.method2664(2, 0);
        } else {
            class442.method2664(0, 0);
        }
        super.field5120 = 2;
        super.field5098 = false;
        super.field5095 = 2;
        super.field5109 = true;
        super.field5113 = 0;
        super.field5100 = true;
        super.field5116 = false;
        super.field5115 = false;
        super.field5114 = ~class291.field4730 == -2 ? 2 : 4;
        super.field5104 = 0;
        class62 var2 = null;
        try {
            class169 var3 = arg0.method2890(false, "", true);
            while (var3.field2692 == 0) {
                class444.method2667(-28210, 1L);
            }
            if (~var3.field2692 == -2) {
                var2 = (class62) var3.field2695;
                byte[] var4 = new byte[(int) var2.method411((byte) -118)];
                int var6;
                for (int var5 = 0; ~var5 > ~var4.length; var5 += var6) {
                    var6 = var2.method412(var4.length - var5, var5, var4, true);
                    if (~var6 == 0) {
                        throw new IOException("EOF");
                    }
                }
                this.method1184(new class23(var4), -69);
            }
        } catch (Exception var8) {
        }
        try {
            if (var2 != null) {
                var2.method410((byte) 30);
            }
        } catch (Exception var7) {
        }
    }

    @OriginalMember(owner = "client!tu", name = "b", descriptor = "(I)V", line = 473)
    public static void method1192(int arg0) {
        field2800 = null;
        field2796 = null;
        field2799 = null;
        if (arg0 < -22) {
            field2798 = null;
            field2782 = null;
            field2780 = null;
            field2790 = null;
        }
    }

    @OriginalMember(owner = "client!tu", name = "b", descriptor = "(B)Lia;", line = 492)
    public final class23 method1193(byte arg0) {
        ++field2785;
        class23 var2 = new class23(41);
        var2.method163(17, (byte) 49);
        var2.method163(super.field5108, (byte) 49);
        var2.method163(super.field5105 ? 1 : 0, (byte) 49);
        var2.method163(!super.field5123 ? 0 : 1, (byte) 49);
        var2.method163(!super.field5118 ? 0 : 1, (byte) 49);
        var2.method163(super.field5103 ? 1 : 0, (byte) 49);
        var2.method163(0, (byte) 49);
        var2.method163(!super.field5122 ? 0 : 1, (byte) 49);
        var2.method163(super.field5096 ? 1 : 0, (byte) 49);
        var2.method163(super.field5112 ? 1 : 0, (byte) 49);
        var2.method163(super.field5091, (byte) 49);
        var2.method163(super.field5086, (byte) 49);
        var2.method163(!super.field5127 ? 0 : 1, (byte) 49);
        var2.method163(!super.field5092 ? 0 : 1, (byte) 49);
        var2.method163(!super.field5111 ? 0 : 1, (byte) 49);
        var2.method163(super.field5101 ? 1 : 0, (byte) 49);
        var2.method163(super.field5124, (byte) 49);
        var2.method163(!super.field5094 ? 0 : 1, (byte) 49);
        var2.method163(super.field5119, (byte) 49);
        var2.method163(super.field5087, (byte) 49);
        if (arg0 <= 63) {
            return null;
        } else {
            var2.method163(super.field5121, (byte) 49);
            var2.method182(super.field5089, 17);
            var2.method182(super.field5099, -120);
            var2.method163(class39.method281(0), (byte) 49);
            var2.method152(super.field5113, (byte) -38);
            var2.method163(super.field5120, (byte) 49);
            var2.method163(super.field5098 ? 1 : 0, (byte) 49);
            var2.method163(!super.field5116 ? 0 : 1, (byte) 49);
            var2.method163(super.field5104, (byte) 49);
            var2.method163(!super.field5115 ? 0 : 1, (byte) 49);
            var2.method163(!super.field5109 ? 0 : 1, (byte) 49);
            var2.method163(super.field5106, (byte) 49);
            var2.method163(super.field5100 ? 1 : 0, (byte) 49);
            var2.method163(super.field5095, (byte) 49);
            var2.method163(super.field5114, (byte) 49);
            var2.method163(!super.field5125 ? 0 : 1, (byte) 49);
            return var2;
        }
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(ZI)V", line = 547)
    public final void method1194(boolean arg0, int arg1) {
        ++field2788;
        int var3 = -124 % ((54 - arg1) / 33);
        super.field5105 = arg0;
        if (class61.field928 != null) {
            class61.field928.method793(!this.method1188(class511.field7485, -125), 1);
        }
    }
}
