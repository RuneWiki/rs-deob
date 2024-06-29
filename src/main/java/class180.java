import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!el")
public class class180 extends class294 {

    @OriginalMember(owner = "client!el", name = "x", descriptor = "[I")
    public static int[] field2527 = new int[14];

    @OriginalMember(owner = "client!el", name = "s", descriptor = "Lmo;")
    public static class361 field2522 = new class361("LIVE", 0);

    @OriginalMember(owner = "client!el", name = "C", descriptor = "[I")
    public static int[] field2532 = new int[] { 0, 1, 2, 2, 1, 1, 2, 3, 1, 3, 3, 4, 2, 0, 4 };

    @OriginalMember(owner = "client!el", name = "B", descriptor = "I")
    public static int field2531 = -50;

    @OriginalMember(owner = "client!el", name = "k", descriptor = "I")
    public static int field2514;

    @OriginalMember(owner = "client!el", name = "l", descriptor = "I")
    public static int field2515;

    @OriginalMember(owner = "client!el", name = "m", descriptor = "I")
    public static int field2516;

    @OriginalMember(owner = "client!el", name = "n", descriptor = "I")
    public static int field2517;

    @OriginalMember(owner = "client!el", name = "o", descriptor = "I")
    public static int field2518;

    @OriginalMember(owner = "client!el", name = "p", descriptor = "I")
    public static int field2519;

    @OriginalMember(owner = "client!el", name = "q", descriptor = "I")
    public int field2520;

    @OriginalMember(owner = "client!el", name = "r", descriptor = "I")
    public static int field2521;

    @OriginalMember(owner = "client!el", name = "u", descriptor = "I")
    public static int field2524;

    @OriginalMember(owner = "client!el", name = "v", descriptor = "I")
    public static int field2525;

    @OriginalMember(owner = "client!el", name = "w", descriptor = "I")
    public int field2526;

    @OriginalMember(owner = "client!el", name = "y", descriptor = "I")
    public int field2528;

    @OriginalMember(owner = "client!el", name = "z", descriptor = "I")
    public static int field2529;

    @OriginalMember(owner = "client!el", name = "A", descriptor = "I")
    public int field2530;

    @OriginalMember(owner = "client!el", name = "t", descriptor = "J")
    public long field2523;

    @OriginalMember(owner = "client!el", name = "b", descriptor = "(I)V")
    public static void method1205(int arg0) {
        field2527 = null;
        if (arg0 != 1) {
            method1205(-70);
        }
        field2522 = null;
        field2532 = null;
    }

    @OriginalMember(owner = "client!el", name = "b", descriptor = "(Z)I")
    public final int method450(boolean arg0) {
        field2515++;
        if (!arg0) {
            method1209(null, -96, (byte) 82, 97, null);
        }
        return this.field2526;
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "()V")
    public static final void method1206() {
        if (class543.field7437 != null) {
            for (int var0 = 0; var0 < class543.field7437.length; var0++) {
                for (int var1 = 0; var1 < class329.field4421; var1++) {
                    for (int var2 = 0; var2 < class641.field8846; var2++) {
                        if (class543.field7437[var0][var1][var2] != null) {
                            class543.field7437[var0][var1][var2].method1315(-1);
                        }
                        class543.field7437[var0][var1][var2] = null;
                    }
                }
            }
        }
        class543.field7437 = null;
        class454.field5981 = null;
        if (class631.field8736 != null) {
            for (int var3 = 0; var3 < class631.field8736.length; var3++) {
                for (int var4 = 0; var4 < class329.field4421; var4++) {
                    for (int var5 = 0; var5 < class641.field8846; var5++) {
                        if (class631.field8736[var3][var4][var5] != null) {
                            class631.field8736[var3][var4][var5].method1315(-1);
                        }
                        class631.field8736[var3][var4][var5] = null;
                    }
                }
            }
        }
        class631.field8736 = null;
        class446.field5914 = null;
        class153.field2168 = null;
        class246.field3214 = null;
        class165.field2371 = null;
        class595.field8207 = null;
        class591.field8150 = null;
        class420.field5518 = null;
        class462.method2585((byte) -65);
        if (class420.field5512 != null) {
            for (int var6 = 0; var6 < class392.field5241; var6++) {
                class420.field5512[var6] = null;
            }
            class392.field5241 = 0;
        }
        if (class150.field2058 != null) {
            for (int var7 = 0; var7 < class57.field730[0]; var7++) {
                class150.field2058[0][var7] = null;
            }
            for (int var8 = 0; var8 < class57.field730[1]; var8++) {
                class150.field2058[1][var8] = null;
            }
            class57.field730 = new int[2];
        }
        if (class648.field8957 != null) {
            for (int var9 = 0; var9 < class629.field8709[0]; var9++) {
                class648.field8957[0][var9] = null;
            }
            for (int var10 = 0; var10 < class629.field8709[1]; var10++) {
                class648.field8957[1][var10] = null;
            }
            class629.field8709 = new int[2];
        }
        if (class100.field1206 != null) {
            for (int var11 = 0; var11 < class189.field2627[0]; var11++) {
                class100.field1206[0][var11] = null;
            }
            for (int var12 = 0; var12 < class189.field2627[1]; var12++) {
                class100.field1206[1][var12] = null;
            }
            class189.field2627 = new int[2];
        }
        if (class692.field9757 != null) {
            for (int var13 = 0; var13 < class692.field9757.length; var13++) {
                class692.field9757[var13] = null;
            }
            class53.field697 = 0;
        }
        if (class351.field4681 != null) {
            for (int var14 = 0; var14 < class351.field4681.length; var14++) {
                class351.field4681[var14] = null;
            }
            class108.field1277 = 0;
        }
        if (class141.field1915 != null) {
            for (int var15 = 0; var15 < class645.field8927; var15++) {
                class141.field1915[var15] = null;
            }
            for (int var16 = 0; var16 < class171.field2428; var16++) {
                for (int var17 = 0; var17 < class329.field4421; var17++) {
                    for (int var18 = 0; var18 < class641.field8846; var18++) {
                        class257.field3366[var16][var17][var18] = 0L;
                    }
                }
            }
            class645.field8927 = 0;
        }
        class3.method12(false);
        class694.field9791.method1306((byte) -128);
        class190.field2637 = null;
        class582.field7958 = null;
        class400.field5303 = null;
        if (class595.field8212 != null) {
            class475.method2739();
            class377.field4985.method1038(1);
            class377.field4985.method1081(0);
        }
        if (class99.field1197 != null) {
            class99.field1197 = null;
        }
        class377.field4985 = null;
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(Z)I")
    public final int method452(boolean arg0) {
        field2518++;
        return arg0 ? -110 : this.field2528;
    }

    @OriginalMember(owner = "client!el", name = "c", descriptor = "(B)J")
    public final long method453(byte arg0) {
        field2516++;
        if (arg0 != -61) {
            method1207(-107, (byte) 84);
        }
        return this.field2523;
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(IB)Z")
    public static final boolean method1207(int arg0, byte arg1) {
        int var2 = 95 % ((-arg1 - 39) / 63);
        field2524++;
        return arg0 >= 4 && arg0 <= 8;
    }

    @OriginalMember(owner = "client!el", name = "b", descriptor = "(B)I")
    public final int method451(byte arg0) {
        if (arg0 >= -52) {
            return -17;
        } else {
            field2525++;
            return this.field2530;
        }
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(CI)C")
    public static final char method1208(char arg0, int arg1) {
        field2521++;
        if (arg1 != -250) {
            field2527 = null;
        }
        if (arg0 == ' ' || arg0 == ' ' || arg0 == '_' || arg0 == '-') {
            return '_';
        } else if (arg0 == '[' || arg0 == ']' || arg0 == '#') {
            return arg0;
        } else if (arg0 == 'à' || arg0 == 'á' || arg0 == 'â' || arg0 == 'ä' || arg0 == 'ã' || arg0 == 'À' || arg0 == 'Á' || arg0 == 'Â' || arg0 == 'Ä' || arg0 == 'Ã') {
            return 'a';
        } else if (arg0 == 'è' || arg0 == 'é' || arg0 == 'ê' || arg0 == 'ë' || arg0 == 'È' || arg0 == 'É' || arg0 == 'Ê' || arg0 == 'Ë') {
            return 'e';
        } else if (arg0 == 'í' || arg0 == 'î' || arg0 == 'ï' || arg0 == 'Í' || arg0 == 'Î' || arg0 == 'Ï') {
            return 'i';
        } else if (arg0 == 'ò' || arg0 == 'ó' || arg0 == 'ô' || arg0 == 'ö' || arg0 == 'õ' || arg0 == 'Ò' || arg0 == 'Ó' || arg0 == 'Ô' || arg0 == 'Ö' || arg0 == 'Õ') {
            return 'o';
        } else if (arg0 == 'ù' || arg0 == 'ú' || arg0 == 'û' || arg0 == 'ü' || arg0 == 'Ù' || arg0 == 'Ú' || arg0 == 'Û' || arg0 == 'Ü') {
            return 'u';
        } else if (arg0 == 'ç' || arg0 == 'Ç') {
            return 'c';
        } else if (arg0 == 'ÿ' || arg0 == 'Ÿ') {
            return 'y';
        } else if (arg0 == 'ñ' || arg0 == 'Ñ') {
            return 'n';
        } else if (arg0 == 'ß') {
            return 'b';
        } else {
            return Character.toLowerCase(arg0);
        }
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(I)I")
    public final int method454(int arg0) {
        if (arg0 == -3) {
            field2517++;
            return this.field2520;
        } else {
            return -11;
        }
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "([IIBI[J)V")
    public static final void method1209(int[] arg0, int arg1, byte arg2, int arg3, long[] arg4) {
        field2529++;
        if (arg3 < arg1) {
            int var5 = (arg3 + arg1) / 2;
            int var6 = arg3;
            long var7 = arg4[var5];
            arg4[var5] = arg4[arg1];
            arg4[arg1] = var7;
            int var9 = arg0[var5];
            arg0[var5] = arg0[arg1];
            arg0[arg1] = var9;
            int var10 = var7 == Long.MAX_VALUE ? 0 : 1;
            for (int var11 = arg3; var11 < arg1; var11++) {
                if (arg4[var11] < ((long) (var10 & var11) + var7)) {
                    long var12 = arg4[var11];
                    arg4[var11] = arg4[var6];
                    arg4[var6] = var12;
                    int var14 = arg0[var11];
                    arg0[var11] = arg0[var6];
                    arg0[var6++] = var14;
                }
            }
            arg4[arg1] = arg4[var6];
            arg4[var6] = var7;
            arg0[arg1] = arg0[var6];
            arg0[var6] = var9;
            method1209(arg0, var6 - 1, (byte) -11, arg3, arg4);
            method1209(arg0, arg1, (byte) -11, var6 + 1, arg4);
        }
        if (arg2 != -11) {
            method1205(37);
        }
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(ILfa;Lr;)V")
    public static final void method1210(int arg0, class522 arg1, class562 arg2) {
        field2514++;
        if (class672.field9548 == null) {
            return;
        }
        if (arg0 != -252) {
            method1207(124, (byte) 51);
        }
        if (class630.field8726 < 10) {
            if (!class672.field9551.method1961(class672.field9548.field3814, false)) {
                class630.field8726 = class688.field9713.method1964(class672.field9548.field3814, (byte) -113) / 10;
                return;
            }
            class208.method1321(61);
            class630.field8726 = 10;
        }
        if (class630.field8726 == 10) {
            class672.field9587 = class672.field9548.field3809 >> 6 << 6;
            class672.field9567 = class672.field9548.field3818 >> 6 << 6;
            class672.field9586 = (class672.field9548.field3824 >> 6 << 6) + 64 - class672.field9567;
            class672.field9571 = (class672.field9548.field3817 >> 6 << 6) - (class672.field9587 - 64);
            int[] var3 = new int[3];
            int var4 = -1;
            int var5 = -1;
            if (class672.field9548.method1713((class408.field5369.field397 >> 9) + class4.field23, var3, class125.field1745 + (class408.field5369.field398 >> 9), class408.field5369.field385, (byte) 66)) {
                var4 = var3[1] - class672.field9567;
                var5 = var3[2] - class672.field9587;
            }
            if (!class389.field5224 && var4 >= 0 && class672.field9586 > var4 && var5 >= 0 && class672.field9571 > var5) {
                int var6 = var5 + (int) (Math.random() * 10.0D) - 5;
                int var7 = var4 + (int) (Math.random() * 10.0D) - 5;
                class698.field9854 = var7;
                class424.field5722 = var6;
            } else if (class383.field5059 == -1 || class225.field2933 == -1) {
                class672.field9548.method1714(var3, true, class672.field9548.field3811 & 0x3FFF, (class672.field9548.field3811 & 0xFFFFBCD) >> 14);
                class698.field9854 = var3[1] - class672.field9567;
                class424.field5722 = var3[2] - class672.field9587;
            } else {
                class672.field9548.method1714(var3, true, class225.field2933, class383.field5059);
                class225.field2933 = -1;
                class383.field5059 = -1;
                if (var3 != null) {
                    class698.field9854 = var3[1] - class672.field9567;
                    class424.field5722 = var3[2] - class672.field9587;
                }
                class389.field5224 = false;
            }
            if (class672.field9548.field3815 == 37) {
                class672.field9558 = 3.0F;
                class672.field9562 = 3.0F;
            } else if (class672.field9548.field3815 == 50) {
                class672.field9558 = 4.0F;
                class672.field9562 = 4.0F;
            } else if (class672.field9548.field3815 == 75) {
                class672.field9558 = 6.0F;
                class672.field9562 = 6.0F;
            } else if (class672.field9548.field3815 == 100) {
                class672.field9558 = 8.0F;
                class672.field9562 = 8.0F;
            } else if (class672.field9548.field3815 == 200) {
                class672.field9558 = 16.0F;
                class672.field9562 = 16.0F;
            } else {
                class672.field9558 = 8.0F;
                class672.field9562 = 8.0F;
            }
            class672.field9559 = (int) class672.field9558 >> 1;
            class672.field9560 = class524.method2972(class672.field9559, 99);
            class310.method1827((byte) -28);
            class672.method3820();
            class533.field7329 = new class445();
            class672.field9566 += (int) (Math.random() * 5.0D) - 2;
            if (class672.field9566 < -8) {
                class672.field9566 = -8;
            }
            if (class672.field9566 > 8) {
                class672.field9566 = 8;
            }
            class672.field9565 += (int) (Math.random() * 5.0D) - 2;
            if (class672.field9565 < -16) {
                class672.field9565 = -16;
            }
            if (class672.field9565 > 16) {
                class672.field9565 = 16;
            }
            class672.method3823(arg1, class672.field9566 >> 2 << 10, class672.field9565 >> 1);
            class672.field9554.method2155(256, 1024, (byte) 36);
            class672.field9552.method1015((byte) -72, 256, 256);
            class672.field9555.method3917((byte) 123, 4096);
            class632.field8745.method2759((byte) 52, 256);
            class630.field8726 = 20;
        } else if (class630.field8726 == 20) {
            class208.method1319(arg0 - 21054, true);
            class672.method3822(arg2, class672.field9566, class672.field9565);
            class630.field8726 = 60;
            class208.method1319(arg0 ^ 0x53C2, true);
            class49.method259(85);
        } else if (class630.field8726 == 60) {
            if (class672.field9551.method1943(class672.field9548.field3814 + "_staticelements", -1)) {
                if (!class672.field9551.method1961(class672.field9548.field3814 + "_staticelements", false)) {
                    return;
                }
                class672.field9557 = class461.method2577(class414.field5431, 0, class672.field9548.field3814 + "_staticelements", class672.field9551);
            } else {
                class672.field9557 = new class592(0);
            }
            class672.method3815();
            class630.field8726 = 70;
            class208.method1319(-21306, true);
            class49.method259(arg0 + 363);
        } else if (class630.field8726 == 70) {
            class46.field553 = new class437(arg2, 11, true, class583.field7996);
            class630.field8726 = 73;
            class208.method1319(-21306, true);
            class49.method259(86);
        } else if (class630.field8726 == 73) {
            class545.field7458 = new class437(arg2, 12, true, class583.field7996);
            class630.field8726 = 76;
            class208.method1319(-21306, true);
            class49.method259(95);
        } else if (class630.field8726 == 76) {
            class428.field5770 = new class437(arg2, 14, true, class583.field7996);
            class630.field8726 = 79;
            class208.method1319(-21306, true);
            class49.method259(101);
        } else if (class630.field8726 == 79) {
            class565.field7710 = new class437(arg2, 17, true, class583.field7996);
            class630.field8726 = 82;
            class208.method1319(-21306, true);
            class49.method259(-104);
        } else if (class630.field8726 == 82) {
            class24.field287 = new class437(arg2, 19, true, class583.field7996);
            class630.field8726 = 85;
            class208.method1319(-21306, true);
            class49.method259(arg0 ^ 0xFFFFFF69);
        } else if (class630.field8726 == 85) {
            class200.field2711 = new class437(arg2, 22, true, class583.field7996);
            class630.field8726 = 88;
            class208.method1319(arg0 - 21054, true);
            class49.method259(-127);
        } else if (class630.field8726 == 88) {
            class209.field2790 = new class437(arg2, 26, true, class583.field7996);
            class630.field8726 = 91;
            class208.method1319(arg0 ^ 0x53C2, true);
            class49.method259(-46);
        } else {
            class235.field3119 = new class437(arg2, 30, true, class583.field7996);
            class630.field8726 = 100;
            class208.method1319(-21306, true);
            class49.method259(-104);
            System.gc();
        }
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(IZII)I")
    public static final int method1211(int arg0, boolean arg1, int arg2, int arg3) {
        field2519++;
        if (class246.field3214 == null) {
            return 0;
        }
        int var4 = arg2 >> 9;
        int var5 = arg3 >> 9;
        if (var4 < 0 || var5 < 0 || (class703.field9886 - 1) < var4 || var5 > (class431.field5789 - 1)) {
            return 0;
        } else if (arg1) {
            int var6 = arg0;
            if (arg0 < 3 && (class31.field440[1][var4][var5] & 0x2) != 0) {
                var6 = arg0 + 1;
            }
            return class246.field3214[var6].method1609(arg2, arg3, 23);
        } else {
            return 68;
        }
    }
}
