import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kh")
public class class14 extends class290 {

    @OriginalMember(owner = "client!kh", name = "F", descriptor = "Z")
    private boolean field172 = false;

    @OriginalMember(owner = "client!kh", name = "L", descriptor = "I")
    private int field177 = -32768;

    @OriginalMember(owner = "client!kh", name = "K", descriptor = "Z")
    public boolean field176 = false;

    @OriginalMember(owner = "client!kh", name = "Q", descriptor = "I")
    private int field181 = 0;

    @OriginalMember(owner = "client!kh", name = "C", descriptor = "I")
    private int field169 = 0;

    @OriginalMember(owner = "client!kh", name = "U", descriptor = "I")
    private int field185;

    @OriginalMember(owner = "client!kh", name = "v", descriptor = "I")
    public int field162;

    @OriginalMember(owner = "client!kh", name = "W", descriptor = "I")
    public int field187;

    @OriginalMember(owner = "client!kh", name = "D", descriptor = "I")
    public int field170;

    @OriginalMember(owner = "client!kh", name = "A", descriptor = "I")
    public int field167;

    @OriginalMember(owner = "client!kh", name = "x", descriptor = "I")
    public int field164;

    @OriginalMember(owner = "client!kh", name = "G", descriptor = "Ljh;")
    private class272 field173;

    @OriginalMember(owner = "client!kh", name = "y", descriptor = "Lsf;")
    public static class108 field165 = class140.method973(255, "clignotant3:");

    @OriginalMember(owner = "client!kh", name = "z", descriptor = "[[I")
    public static int[][] field166 = new int[][] { { 0, 128, 0, 0, 128, 0, 128, 128 }, { 0, 128, 0, 0, 128, 0 }, { 0, 0, 64, 128, 0, 128 }, { 128, 128, 64, 128, 128, 0 }, { 0, 0, 128, 0, 128, 128, 64, 128 }, { 0, 128, 0, 0, 128, 0, 64, 128 }, { 64, 128, 0, 128, 0, 0, 64, 0 }, { 0, 0, 64, 0, 0, 64 }, { 128, 0, 128, 128, 0, 128, 0, 64, 64, 0 }, { 0, 128, 0, 0, 32, 64, 64, 96, 128, 128 }, { 0, 0, 128, 0, 128, 128, 64, 96, 32, 64 }, { 0, 0, 128, 0, 96, 32, 32, 32 } };

    @OriginalMember(owner = "client!kh", name = "B", descriptor = "[Lsf;")
    public static class108[] field168 = new class108[200];

    @OriginalMember(owner = "client!kh", name = "O", descriptor = "Lsf;")
    public static class108 field179 = class140.method973(255, "null");

    @OriginalMember(owner = "client!kh", name = "s", descriptor = "I")
    public static int field159;

    @OriginalMember(owner = "client!kh", name = "t", descriptor = "I")
    public static int field160;

    @OriginalMember(owner = "client!kh", name = "w", descriptor = "I")
    public static int field163;

    @OriginalMember(owner = "client!kh", name = "E", descriptor = "I")
    public static int field171;

    @OriginalMember(owner = "client!kh", name = "H", descriptor = "I")
    public static int field174;

    @OriginalMember(owner = "client!kh", name = "J", descriptor = "I")
    public static int field175;

    @OriginalMember(owner = "client!kh", name = "N", descriptor = "I")
    public static int field178;

    @OriginalMember(owner = "client!kh", name = "R", descriptor = "I")
    public static int field182;

    @OriginalMember(owner = "client!kh", name = "S", descriptor = "I")
    public static int field183;

    @OriginalMember(owner = "client!kh", name = "T", descriptor = "I")
    public static int field184;

    @OriginalMember(owner = "client!kh", name = "X", descriptor = "I")
    public static int field188;

    @OriginalMember(owner = "client!kh", name = "P", descriptor = "Lac;")
    private class165 field180;

    @OriginalMember(owner = "client!kh", name = "u", descriptor = "Lii;")
    public static class216 field161;

    @OriginalMember(owner = "client!kh", name = "V", descriptor = "[Lca;")
    public static class98[] field186;

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(IIIIIIII)Z", line = 4)
    public static final boolean method89(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg1 < arg2 && arg1 < arg3 && arg1 < arg4) {
            return false;
        } else if (arg1 > arg2 && arg1 > arg3 && arg1 > arg4) {
            return false;
        } else if (arg0 < arg5 && arg0 < arg6 && arg0 < arg7) {
            return false;
        } else if (arg0 > arg5 && arg0 > arg6 && arg0 > arg7) {
            return false;
        } else {
            int var8 = (arg1 - arg2) * (arg6 - arg5) - (arg0 - arg5) * (arg3 - arg2);
            int var9 = (arg1 - arg4) * (arg5 - arg7) - (arg0 - arg7) * (arg2 - arg4);
            int var10 = (arg1 - arg3) * (arg7 - arg6) - (arg0 - arg6) * (arg4 - arg3);
            return var8 * var10 > 0 && var9 * var10 > 0;
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(ILke;)V", line = 32)
    private final void method90(int arg0, class113 arg1) {
        if (arg0 > -38) {
            this.field187 = -64;
        }
        field163++;
        if (class231.field4051) {
            class148 var3 = (class148) arg1;
            if ((this.field180 == null || this.field180.field2946) && (var3.field2678 != null || var3.field2658 != null)) {
                this.field180 = new class165(class116.field2000, 1, 1);
            }
            if (this.field180 != null) {
                this.field180.method1141(var3.field2678, var3.field2658, false, var3.field2679, var3.field2692, var3.field2674);
            }
        } else {
            class44 var4 = (class44) arg1;
            if ((this.field180 == null || this.field180.field2946) && (var4.field598 != null || var4.field600 != null)) {
                this.field180 = new class165(class116.field2000, 1, 1);
            }
            if (this.field180 != null) {
                this.field180.method1141(var4.field598, var4.field600, false, var4.field586, var4.field574, var4.field599);
            }
        }
        this.field172 = true;
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(B)Lke;", line = 69)
    private final class113 method91(byte arg0) {
        field183++;
        class305 var2 = class152.method1074((byte) 126, this.field185);
        int var3 = 61 % ((arg0 + 50) / 32);
        class113 var4;
        if (this.field176) {
            var4 = var2.method2144(25, -1);
        } else {
            var4 = var2.method2144(117, this.field169);
        }
        return var4 == null ? null : var4;
    }

    @OriginalMember(owner = "client!kh", name = "b", descriptor = "(I)V", line = 90)
    public static final void method92(int arg0) {
        field175++;
        class259.field4572 = arg0;
        class312.field5400 = 0;
        class173.method1230(true);
        class27.method178(49);
        class34.method236((byte) 56);
        for (int var1 = 0; var1 < class259.field4572; var1++) {
            int var2 = class26.field409[var1];
            if (class116.field2000 != class159.field2863[var2].field4459) {
                if (class159.field2863[var2].field646.method935((byte) 98)) {
                    class320.method2218(class159.field2863[var2], (byte) 66);
                }
                class159.field2863[var2].method317(0, (class136) null);
                class159.field2863[var2] = null;
            }
        }
        if (class191.field3471 != class293.field5127.field4314) {
            throw new RuntimeException("gnp1 pos:" + class293.field5127.field4314 + " psize:" + class191.field3471);
        }
        for (int var3 = 0; var3 < class61.field969; var3++) {
            if (class159.field2863[class168.field3020[var3]] == null) {
                throw new RuntimeException("gnp2 pos:" + var3 + " size:" + class61.field969);
            }
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(Llj;IIII)V", line = 146)
    public static final void method93(class51 arg0, int arg1, int arg2, int arg3, int arg4) {
        field159++;
        if (class95.field1513 == arg0 || ~class311.field5374 <= arg3) {
            return;
        }
        class108 var10;
        if (arg0.field732 == 0) {
            boolean var5 = true;
            if (class95.field1513.field736 != -1 && arg0.field736 != -1) {
                int var6 = class95.field1513.field720 > arg0.field720 ? class95.field1513.field720 : arg0.field720;
                int var7 = class95.field1513.field736 < arg0.field736 ? class95.field1513.field736 : arg0.field736;
                int var8 = var6 * 10 / 100 + var7 + 5;
                int var9 = class95.field1513.field720 - arg0.field720;
                if (var9 < 0) {
                    var9 = -var9;
                }
                if (var9 > var8) {
                    var5 = false;
                }
            }
            if (arg0.field730 <= arg0.field720) {
                var10 = class117.method833(new class108[] { arg0.method359(12), var5 ? class290.method2073(class95.field1513.field720, (byte) 114, arg0.field720) : class282.field4941, class305.field5316, class117.field2035, class79.method518(false, arg0.field720), class303.field5258 }, false);
            } else {
                var10 = class117.method833(new class108[] { arg0.method359(arg3 + 413), var5 ? class290.method2073(class95.field1513.field720, (byte) 120, arg0.field720) : class282.field4941, class305.field5316, class117.field2035, class79.method518(false, arg0.field720), class289.field5057, class79.method518(false, arg0.field730 - arg0.field720), class303.field5258 }, false);
            }
        } else {
            var10 = class117.method833(new class108[] { arg0.method359(arg3 ^ 0xFFFFFE63), class305.field5316, class255.field4438, class79.method518(false, arg0.field732), class303.field5258 }, false);
        }
        if (class84.field1347 == 1) {
            class298.field5186++;
            class62.method428(arg2, arg3 + 282, class288.field5045, class117.method833(new class108[] { class331.field5662, class117.field2027, var10 }, false), (long) arg1, (short) 22, arg4);
        } else if (!class172.field3132) {
            for (int var11 = 7; var11 >= 0; var11--) {
                if (class285.field4990[var11] != null) {
                    class242.field4215++;
                    short var12 = 0;
                    if (class223.field3947 == 0 && class285.field4990[var11].method781(class92.field1453, -26321)) {
                        if (class95.field1513.field720 < arg0.field720) {
                            var12 = 2000;
                        }
                        if (class95.field1513.field723 != 0 && arg0.field723 != 0) {
                            if (class95.field1513.field723 == arg0.field723) {
                                var12 = 2000;
                            } else {
                                var12 = 0;
                            }
                        }
                    } else if (class207.field3707[var11]) {
                        var12 = 2000;
                    }
                    boolean var13 = false;
                    short var14 = class109.field1914[var11];
                    short var15 = (short) (var12 + var14);
                    class62.method428(arg2, -118, class285.field4990[var11], class117.method833(new class108[] { class282.field4941, var10 }, false), (long) arg1, var15, arg4);
                }
            }
        } else if ((class21.field324 & 0x8) == 8) {
            class255.field4427++;
            class62.method428(arg2, arg3 ^ 0x1E0, class72.field1103, class117.method833(new class108[] { class131.field2248, class117.field2027, var10 }, false), (long) arg1, (short) 7, arg4);
        }
        for (int var16 = 0; var16 < class311.field5374; var16++) {
            if (class305.field5299[var16] == 17) {
                class317.field5454[var16] = class117.method833(new class108[] { class282.field4941, var10 }, false);
                break;
            }
        }
    }

    @OriginalMember(owner = "client!kh", name = "b", descriptor = "(B)V", line = 283)
    public static void method94(byte arg0) {
        int var1 = -21 % ((67 - arg0) / 48);
        field165 = null;
        field168 = null;
        field161 = null;
        field166 = (int[][]) null;
        field186 = null;
        field179 = null;
    }

    @OriginalMember(owner = "client!kh", name = "<init>", descriptor = "(IIIIIII)V", line = 437)
    public class14(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field185 = arg0;
        this.field162 = arg1;
        this.field187 = arg3;
        this.field170 = arg2;
        this.field167 = arg4;
        this.field164 = arg5 + arg6;
        int var8 = class152.method1074((byte) 117, this.field185).field5308;
        if (var8 == -1) {
            this.field176 = true;
        } else {
            this.field176 = false;
            this.field173 = class149.method1063(var8, -18767);
        }
    }

    @OriginalMember(owner = "client!kh", name = "b", descriptor = "()I", line = 299)
    public final int method95() {
        field174++;
        return this.field177;
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(Lik;I)V", line = 324)
    public static final void method96(class262 arg0, int arg1) {
        class328.field5604 = arg0.method1887(-1, class74.field1128);
        class170.field3047 = arg0.method1887(-1, class22.field361);
        if (arg1 != -31118) {
            method93((class51) null, 98, 105, 42, -60);
        }
        field184++;
    }

    @OriginalMember(owner = "client!kh", name = "b", descriptor = "(BI)V", line = 337)
    public final void method97(byte arg0, int arg1) {
        if (arg0 != -13) {
            this.method98(-121, -58, -54, 30, 93, -60, -84, -58, -116L, -79, (class165) null);
        }
        field171++;
        if (this.field176) {
            return;
        }
        this.field181 += arg1;
        while (this.field173.field4764[this.field169] < this.field181) {
            this.field181 -= this.field173.field4764[this.field169];
            this.field169++;
            if (this.field173.field4774.length <= this.field169) {
                this.field176 = true;
                break;
            }
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(IIIIIIIIJILac;)V", line = 363)
    public final void method98(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class165 arg10) {
        field182++;
        class113 var13 = this.method91((byte) -99);
        if (var13 != null) {
            this.method90(-88, var13);
            var13.method98(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field180);
            this.field177 = var13.method95();
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(IIIII)V", line = 384)
    public final void method99(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field178++;
        if (!this.field172) {
            class113 var6 = this.method91((byte) -114);
            if (var6 == null) {
                return;
            }
            this.method90(-60, var6);
        }
        if (this.field180 != null) {
            this.field180.method1157(arg0, arg1, arg3, arg2, arg4);
        }
    }
}
