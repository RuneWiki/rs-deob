import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!i")
public class class48 {

    @OriginalMember(owner = "client!i", name = "A", descriptor = "Lv;")
    private class120 field1164 = new class120();

    @OriginalMember(owner = "client!i", name = "F", descriptor = "Lmc;")
    private class75 field1169 = new class75();

    @OriginalMember(owner = "client!i", name = "G", descriptor = "I")
    private int field1170;

    @OriginalMember(owner = "client!i", name = "E", descriptor = "I")
    private int field1168;

    @OriginalMember(owner = "client!i", name = "H", descriptor = "Lqa;")
    private class96 field1171;

    @OriginalMember(owner = "client!i", name = "e", descriptor = "I")
    public static int field1142 = 0;

    @OriginalMember(owner = "client!i", name = "j", descriptor = "Lva;")
    public static class121 field1147 = class107.method797("headicons_prayer", -10983);

    @OriginalMember(owner = "client!i", name = "l", descriptor = "Z")
    public static volatile boolean field1149 = true;

    @OriginalMember(owner = "client!i", name = "p", descriptor = "Lva;")
    public static class121 field1153 = class107.method797("Side panel redrawn", -10983);

    @OriginalMember(owner = "client!i", name = "m", descriptor = "Lva;")
    private static class121 field1150 = class107.method797("This computers address has been blocked", -10983);

    @OriginalMember(owner = "client!i", name = "C", descriptor = "Lva;")
    private static class121 field1166 = class107.method797("Checking for updates )2 ", -10983);

    @OriginalMember(owner = "client!i", name = "z", descriptor = "Lva;")
    public static class121 field1163 = field1150;

    @OriginalMember(owner = "client!i", name = "B", descriptor = "Lva;")
    public static class121 field1165 = class107.method797("backhmid1", -10983);

    @OriginalMember(owner = "client!i", name = "v", descriptor = "Lva;")
    private static class121 field1159 = class107.method797("Loaded config", -10983);

    @OriginalMember(owner = "client!i", name = "k", descriptor = "Lva;")
    public static class121 field1148 = field1166;

    @OriginalMember(owner = "client!i", name = "r", descriptor = "Lva;")
    public static class121 field1155 = field1159;

    @OriginalMember(owner = "client!i", name = "D", descriptor = "Lva;")
    public static class121 field1167 = class107.method797("backleft1", -10983);

    @OriginalMember(owner = "client!i", name = "a", descriptor = "I")
    public static int field1138;

    @OriginalMember(owner = "client!i", name = "b", descriptor = "I")
    public static int field1139;

    @OriginalMember(owner = "client!i", name = "c", descriptor = "I")
    public static int field1140;

    @OriginalMember(owner = "client!i", name = "d", descriptor = "I")
    public static int field1141;

    @OriginalMember(owner = "client!i", name = "f", descriptor = "I")
    public static int field1143;

    @OriginalMember(owner = "client!i", name = "g", descriptor = "I")
    public static int field1144;

    @OriginalMember(owner = "client!i", name = "h", descriptor = "I")
    public static int field1145;

    @OriginalMember(owner = "client!i", name = "n", descriptor = "I")
    public static int field1151;

    @OriginalMember(owner = "client!i", name = "o", descriptor = "I")
    public static int field1152;

    @OriginalMember(owner = "client!i", name = "q", descriptor = "I")
    public static int field1154;

    @OriginalMember(owner = "client!i", name = "s", descriptor = "I")
    public static int field1156;

    @OriginalMember(owner = "client!i", name = "t", descriptor = "I")
    public static int field1157;

    @OriginalMember(owner = "client!i", name = "u", descriptor = "I")
    public static int field1158;

    @OriginalMember(owner = "client!i", name = "w", descriptor = "I")
    public static int field1160;

    @OriginalMember(owner = "client!i", name = "i", descriptor = "Lhb;")
    public static class44 field1146;

    @OriginalMember(owner = "client!i", name = "y", descriptor = "[B")
    public static byte[] field1162;

    @OriginalMember(owner = "client!i", name = "x", descriptor = "[[[B")
    public static byte[][][] field1161;

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IJ)V", line = 3)
    public final void method341(int arg0, long arg1) {
        field1144++;
        class120 var4 = (class120) this.field1171.method652(arg1, -128);
        if (var4 != null) {
            var4.method187((byte) 39);
            var4.method926(true);
            this.field1170++;
        }
        if (arg0 > -2) {
            this.field1171 = null;
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Ld;I)Z", line = 26)
    public static final boolean method342(class19 arg0, int arg1) {
        field1156++;
        if (arg0.field490 == null) {
            return false;
        }
        int var2 = -126 % ((-arg1 - 16) / 62);
        for (int var3 = 0; var3 < arg0.field490.length; var3++) {
            int var4 = class4.method30(arg0, 117, var3);
            int var5 = arg0.field456[var3];
            if (arg0.field490[var3] == 2) {
                if (var4 >= var5) {
                    return false;
                }
            } else if (arg0.field490[var3] == 3) {
                if (var5 >= var4) {
                    return false;
                }
            } else if (arg0.field490[var3] == 4) {
                if (var4 == var5) {
                    return false;
                }
            } else if (var4 != var5) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(ZI)V", line = 91)
    public static final void method343(boolean arg0, int arg1) {
        int var2 = 56 / ((59 - arg1) / 46);
        field1145++;
        for (int var3 = 0; var3 < class42.field965; var3++) {
            class50 var4 = class8.field110[class1.field7[var3]];
            int var5 = (class1.field7[var3] << 14) + 536870912;
            if (var4 != null && var4.method232(-251272184) && var4.field1183.field327 == arg0 && var4.field1183.method129(-1)) {
                int var6 = var4.field750 >> 7;
                int var7 = var4.field742 >> 7;
                if (var6 >= 0 && var6 < 104 && var7 >= 0 && var7 < 104) {
                    if (var4.field786 == 1 && (var4.field750 & 0x7F) == 64 && (var4.field742 & 0x7F) == 64) {
                        if (class61.field1455[var6][var7] == class121.field2782) {
                            continue;
                        }
                        class61.field1455[var6][var7] = class121.field2782;
                    }
                    if (!var4.field1183.field322) {
                        var5 += Integer.MIN_VALUE;
                    }
                    class58.field1348.method730(class121.field2807, var4.field750, var4.field742, class47.method340((var4.field786 - 1) * 64 + var4.field750, -6, class121.field2807, var4.field742 + (var4.field786 - 1) * 64), (var4.field786 - 1) * 64 + 60, var4, var4.field739, var5, var4.field782);
                }
            }
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Lcc;IIIB)V", line = 147)
    public static final void method344(class16 arg0, int arg1, int arg2, int arg3, byte arg4) {
        field1157++;
        if (class26.field654 >= 400) {
            return;
        }
        if (arg0.field311 != null) {
            arg0 = arg0.method131((byte) 2);
        }
        if (arg0 == null || !arg0.field322) {
            return;
        }
        class121 var5 = arg0.field339;
        if (arg0.field336 != 0) {
            var5 = class113.method866((byte) -92, new class121[] { var5, class47.method338(0, arg0.field336, class62.field1494.field1770), class84.field1942, class28.field712, class35.method242(arg0.field336, 10), class64.field1563 });
        }
        if (arg4 != -44) {
            field1153 = null;
        }
        if (class114.field2564 == 1) {
            class129.method1005(arg3, arg2, 1, arg1, class113.method866((byte) -126, new class121[] { class121.field2828, class27.field687, class45.field1054, class119.field2742, var5 }), -51);
            class15.field282++;
        } else if (class22.field573 != 1) {
            class121[] var6 = arg0.field320;
            if (class21.field558) {
                var6 = method346(105, var6);
            }
            class26.field660++;
            if (var6 != null) {
                for (int var7 = 4; var7 >= 0; var7--) {
                    if (var6[var7] != null && !var6[var7].method940(class45.field1039, (byte) -110)) {
                        class90.field2043++;
                        byte var8 = 0;
                        if (var7 == 0) {
                            var8 = 45;
                        }
                        if (var7 == 1) {
                            var8 = 9;
                        }
                        if (var7 == 2) {
                            var8 = 41;
                        }
                        if (var7 == 3) {
                            var8 = 39;
                        }
                        if (var7 == 4) {
                            var8 = 33;
                        }
                        class129.method1005(arg3, arg2, var8, arg1, class113.method866((byte) -90, new class121[] { var6[var7], class78.field1814, var5 }), -120);
                    }
                }
            }
            if (var6 != null) {
                for (int var9 = 4; var9 >= 0; var9--) {
                    if (var6[var9] != null && var6[var9].method940(class45.field1039, (byte) 116)) {
                        class127.field2933++;
                        short var10 = 0;
                        int var11 = 0;
                        if (class62.field1494.field1770 < arg0.field336) {
                            var10 = 2000;
                        }
                        if (var9 == 0) {
                            var11 = var10 + 45;
                        }
                        if (var9 == 1) {
                            var11 = var10 + 9;
                        }
                        if (var9 == 2) {
                            var11 = var10 + 41;
                        }
                        if (var9 == 3) {
                            var11 = var10 + 39;
                        }
                        if (var9 == 4) {
                            var11 = var10 + 33;
                        }
                        class129.method1005(arg3, arg2, var11, arg1, class113.method866((byte) -50, new class121[] { var6[var9], class78.field1814, var5 }), -121);
                    }
                }
            }
            class129.method1005(arg3, arg2, 1003, arg1, class113.method866((byte) -65, new class121[] { class64.field1570, class78.field1814, var5 }), -59);
        } else if ((class107.field2426 & 0x2) == 2) {
            class129.method1005(arg3, arg2, 50, arg1, class113.method866((byte) -96, new class121[] { class59.field1407, class119.field2742, var5 }), -80);
            class76.field1751++;
            return;
        }
    }

    @OriginalMember(owner = "client!i", name = "b", descriptor = "(IJ)Lv;", line = 292)
    public final class120 method345(int arg0, long arg1) {
        class120 var4 = (class120) this.field1171.method652(arg1, -119);
        field1151++;
        if (var4 != null) {
            this.field1169.method523(3, var4);
        }
        return arg0 <= 103 ? null : var4;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(I[Lva;)[Lva;", line = 317)
    public static final class121[] method346(int arg0, class121[] arg1) {
        field1141++;
        class121[] var2 = new class121[5];
        int var3 = -59 / ((7 - arg0) / 62);
        for (int var4 = 0; var4 < 5; var4++) {
            var2[var4] = class113.method866((byte) -70, new class121[] { class35.method242(var4, 10), class96.field2154 });
            if (arg1 != null && arg1[var4] != null) {
                var2[var4] = class113.method866((byte) -46, new class121[] { var2[var4], arg1[var4] });
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Z)V", line = 351)
    public final void method347(boolean arg0) {
        field1154++;
        while (true) {
            class120 var2 = this.field1169.method524(-95);
            if (var2 == null) {
                this.field1170 = this.field1168;
                if (arg0) {
                    return;
                } else {
                    method351(-26, (byte) 60, null, -89);
                    return;
                }
            }
            var2.method187((byte) 39);
            var2.method926(true);
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(BI)Lna;", line = 374)
    public static final class79 method348(byte arg0, int arg1) {
        if (arg0 > -62) {
            method349((byte) 16);
        }
        field1158++;
        class79 var2 = (class79) class126.field2877.method345(124, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class120.field2774.method315(14, true, arg1);
        class79 var4 = new class79();
        if (var3 != null) {
            var4.method544(new class113(var3), false);
        }
        class126.field2877.method350((byte) 123, var4, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(B)V", line = 408)
    public static final void method349(byte arg0) {
        if (arg0 > -43) {
            return;
        }
        field1140++;
        if (class38.field879 && class76.field1743 != class121.field2807) {
            class97.method659(class121.field2807, 0, class60.field1448, class62.field1494.field767[0], class100.field2221, class62.field1494.field730[0]);
        } else if (class21.field550 != class121.field2807) {
            class21.field550 = class121.field2807;
            class11.method91(class121.field2807, 1);
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(BLv;J)V", line = 455)
    public final void method350(byte arg0, class120 arg1, long arg2) {
        if (this.field1170 == 0) {
            class120 var5 = this.field1169.method524(-114);
            var5.method187((byte) 39);
            var5.method926(true);
            if (this.field1164 == var5) {
                class120 var6 = this.field1169.method524(-85);
                var6.method187((byte) 39);
                var6.method926(true);
            }
        } else {
            this.field1170--;
        }
        this.field1171.method654((byte) -110, arg1, arg2);
        field1139++;
        if (arg0 == 123) {
            this.field1169.method523(3, arg1);
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IBLbc;I)V", line = 485)
    public static final void method351(int arg0, byte arg1, class10 arg2, int arg3) {
        field1160++;
        if (arg2 == null || arg1 >= -14) {
            return;
        }
        int var4 = class96.field2149 + class69.field1633 & 0x7FF;
        int var5 = arg0 * arg0 + arg3 * arg3;
        if (var5 > 6400) {
            return;
        }
        int var6 = class102.field2321[var4];
        int var7 = var6 * 256 / (class28.field700 + 256);
        int var8 = class102.field2323[var4];
        int var9 = var8 * 256 / (class28.field700 + 256);
        int var10 = arg3 * var9 - arg0 * var7 >> 16;
        int var11 = arg0 * var9 + arg3 * var7 >> 16;
        if (var5 > 2500) {
            arg2.method72(class124.field2833, var11 + 94 + 4 - arg2.field161 / 2, -(arg2.field163 / 2) + -4 + -var10 + 83);
        } else {
            arg2.method71(var11 + 98 - arg2.field161 / 2, -(arg2.field163 / 2) + 83 + -var10 + -4);
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(I)V", line = 522)
    public static void method352(int arg0) {
        field1153 = null;
        field1161 = null;
        field1147 = null;
        field1166 = null;
        field1165 = null;
        field1162 = null;
        field1150 = null;
        if (arg0 != 256) {
            return;
        }
        field1159 = null;
        field1146 = null;
        field1148 = null;
        field1167 = null;
        field1163 = null;
        field1155 = null;
    }

    @OriginalMember(owner = "client!i", name = "<init>", descriptor = "(I)V", line = 584)
    public class48(int arg0) {
        this.field1170 = arg0;
        this.field1168 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field1171 = new class96(var2);
    }
}
