import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qe")
public class class116 extends class145 {

    @OriginalMember(owner = "client!qe", name = "fb", descriptor = "Z")
    public boolean field2655 = false;

    @OriginalMember(owner = "client!qe", name = "nb", descriptor = "I")
    public int field2663 = 99;

    @OriginalMember(owner = "client!qe", name = "qb", descriptor = "I")
    public int field2666 = -1;

    @OriginalMember(owner = "client!qe", name = "kb", descriptor = "I")
    public int field2660 = -1;

    @OriginalMember(owner = "client!qe", name = "mb", descriptor = "I")
    public int field2662 = -1;

    @OriginalMember(owner = "client!qe", name = "wb", descriptor = "I")
    public int field2672 = 5;

    @OriginalMember(owner = "client!qe", name = "W", descriptor = "I")
    public int field2646 = -1;

    @OriginalMember(owner = "client!qe", name = "zb", descriptor = "I")
    public int field2675 = 2;

    @OriginalMember(owner = "client!qe", name = "sb", descriptor = "I")
    public int field2668 = -1;

    @OriginalMember(owner = "client!qe", name = "pb", descriptor = "Ltd;")
    public static class136 field2665 = class145.method1172("(U", 45);

    @OriginalMember(owner = "client!qe", name = "V", descriptor = "I")
    public static int field2645 = 0;

    @OriginalMember(owner = "client!qe", name = "ub", descriptor = "Ltd;")
    public static class136 field2670 = class145.method1172("Ung-Ultiges Anmelde)2Paket)3", 45);

    @OriginalMember(owner = "client!qe", name = "bb", descriptor = "Ltd;")
    public static class136 field2651 = class145.method1172(" )2> <col=ff9040>", 45);

    @OriginalMember(owner = "client!qe", name = "yb", descriptor = "[I")
    public static int[] field2674 = new int[5];

    @OriginalMember(owner = "client!qe", name = "U", descriptor = "I")
    public static int field2644;

    @OriginalMember(owner = "client!qe", name = "X", descriptor = "I")
    public static int field2647;

    @OriginalMember(owner = "client!qe", name = "Y", descriptor = "I")
    public static int field2648;

    @OriginalMember(owner = "client!qe", name = "Z", descriptor = "I")
    public static int field2649;

    @OriginalMember(owner = "client!qe", name = "cb", descriptor = "I")
    public static int field2652;

    @OriginalMember(owner = "client!qe", name = "eb", descriptor = "I")
    public static int field2654;

    @OriginalMember(owner = "client!qe", name = "hb", descriptor = "I")
    public static int field2657;

    @OriginalMember(owner = "client!qe", name = "ib", descriptor = "I")
    public static int field2658;

    @OriginalMember(owner = "client!qe", name = "jb", descriptor = "I")
    public static int field2659;

    @OriginalMember(owner = "client!qe", name = "lb", descriptor = "I")
    public static int field2661;

    @OriginalMember(owner = "client!qe", name = "ob", descriptor = "I")
    public static int field2664;

    @OriginalMember(owner = "client!qe", name = "tb", descriptor = "I")
    public static int field2669;

    @OriginalMember(owner = "client!qe", name = "db", descriptor = "Lbb;")
    public static class10 field2653;

    @OriginalMember(owner = "client!qe", name = "rb", descriptor = "Lcd;")
    public static class19 field2667;

    @OriginalMember(owner = "client!qe", name = "ab", descriptor = "[I")
    public int[] field2650;

    @OriginalMember(owner = "client!qe", name = "gb", descriptor = "[I")
    private int[] field2656;

    @OriginalMember(owner = "client!qe", name = "vb", descriptor = "[I")
    private int[] field2671;

    @OriginalMember(owner = "client!qe", name = "xb", descriptor = "[I")
    public int[] field2673;

    @OriginalMember(owner = "client!qe", name = "Ab", descriptor = "[I")
    public int[] field2676;

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(Lda;II)Lda;")
    public final class23 method910(class23 arg0, int arg1, int arg2) {
        field2669++;
        int var4 = this.field2676[arg2];
        class133 var5 = class38.method321(var4 >> 16, 500);
        int var6 = var4 & arg1;
        if (var5 == null) {
            return arg0.method192(true);
        }
        class133 var7 = null;
        int var8 = 0;
        if (this.field2656 != null && this.field2656.length > arg2) {
            int var9 = this.field2656[arg2];
            var7 = class38.method321(var9 >> 16, 500);
            var8 = var9 & 0xFFFF;
        }
        if (var7 == null || var8 == 65535) {
            class23 var11 = arg0.method192(!var5.method1075(var6, (byte) -98));
            var11.method194(var5, var6);
            return var11;
        } else {
            class23 var10 = arg0.method192(!var5.method1075(var6, (byte) 18) & !var7.method1075(var8, (byte) -127));
            var10.method194(var5, var6);
            var10.method194(var7, var8);
            return var10;
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(IZLda;)Lda;")
    public final class23 method911(int arg0, boolean arg1, class23 arg2) {
        int var4 = this.field2676[arg0];
        field2658++;
        if (arg1) {
            this.method917(null, -34);
        }
        class133 var5 = class38.method321(var4 >> 16, 500);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg2.method192(true);
        } else {
            class23 var7 = arg2.method192(!var5.method1075(var6, (byte) -112));
            var7.method194(var5, var6);
            return var7;
        }
    }

    @OriginalMember(owner = "client!qe", name = "d", descriptor = "(I)V")
    public final void method912(int arg0) {
        field2647++;
        if (this.field2660 == -1) {
            if (this.field2671 == null) {
                this.field2660 = 0;
            } else {
                this.field2660 = 2;
            }
        }
        if (arg0 < 81) {
            field2665 = null;
        }
        if (this.field2666 != -1) {
            return;
        }
        if (this.field2671 == null) {
            this.field2666 = 0;
        } else {
            this.field2666 = 2;
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(IILda;I)Lda;")
    public final class23 method913(int arg0, int arg1, class23 arg2, int arg3) {
        int var5 = this.field2676[arg3];
        field2654++;
        class133 var6 = class38.method321(var5 >> 16, 500);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg2.method192(true);
        }
        if (arg0 >= -76) {
            this.method915(false, -34, null);
        }
        int var8 = arg1 & 0x3;
        class23 var9 = arg2.method192(!var6.method1075(var7, (byte) 91));
        if (var8 == 1) {
            var9.method209();
        } else if (var8 == 2) {
            var9.method204();
        } else if (var8 == 3) {
            var9.method202();
        }
        var9.method194(var6, var7);
        if (var8 == 1) {
            var9.method202();
        } else if (var8 == 2) {
            var9.method204();
        } else if (var8 == 3) {
            var9.method209();
        }
        return var9;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(IBLqe;ILda;)Lda;")
    public final class23 method914(int arg0, byte arg1, class116 arg2, int arg3, class23 arg4) {
        field2659++;
        int var6 = this.field2676[arg0];
        int var7 = 31 % ((arg1 + 3) / 40);
        class133 var8 = class38.method321(var6 >> 16, 500);
        int var9 = var6 & 0xFFFF;
        if (var8 == null) {
            return arg2.method911(arg3, false, arg4);
        }
        int var10 = arg2.field2676[arg3];
        class133 var11 = class38.method321(var10 >> 16, 500);
        int var12 = var10 & 0xFFFF;
        if (var11 == null) {
            class23 var13 = arg4.method192(!var8.method1075(var9, (byte) -116));
            var13.method194(var8, var9);
            return var13;
        } else {
            class23 var14 = arg4.method192(!var8.method1075(var9, (byte) 60) & !var11.method1075(var12, (byte) 40));
            var14.method207(var8, var9, var11, var12, this.field2671);
            return var14;
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(ZILsb;)V")
    private final void method915(boolean arg0, int arg1, class127 arg2) {
        field2664++;
        if (arg1 == 1) {
            int var11 = arg2.method1020(false);
            this.field2650 = new int[var11];
            for (int var12 = 0; var12 < var11; var12++) {
                this.field2650[var12] = arg2.method1020(false);
            }
            this.field2676 = new int[var11];
            for (int var13 = 0; var13 < var11; var13++) {
                this.field2676[var13] = arg2.method1020(false);
            }
            for (int var14 = 0; var14 < var11; var14++) {
                this.field2676[var14] = (arg2.method1020(arg0) << 16) + this.field2676[var14];
            }
        } else if (arg1 == 2) {
            this.field2646 = arg2.method1020(false);
        } else if (arg1 == 3) {
            int var4 = arg2.method1011(120);
            this.field2671 = new int[var4 + 1];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field2671[var5] = arg2.method1011(73);
            }
            this.field2671[var4] = 9999999;
        } else if (arg1 == 4) {
            this.field2655 = true;
        } else if (arg1 == 5) {
            this.field2672 = arg2.method1011(63);
        } else if (arg1 == 6) {
            this.field2668 = arg2.method1020(false);
        } else if (arg1 == 7) {
            this.field2662 = arg2.method1020(false);
        } else if (arg1 == 8) {
            this.field2663 = arg2.method1011(96);
        } else if (arg1 == 9) {
            this.field2660 = arg2.method1011(93);
        } else if (arg1 == 10) {
            this.field2666 = arg2.method1011(18);
        } else if (arg1 == 11) {
            this.field2675 = arg2.method1011(122);
        } else if (arg1 == 12) {
            int var8 = arg2.method1011(22);
            this.field2656 = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field2656[var9] = arg2.method1020(false);
            }
            for (int var10 = 0; var10 < var8; var10++) {
                this.field2656[var10] = (arg2.method1020(false) << 16) + this.field2656[var10];
            }
        } else if (arg1 == 13) {
            int var6 = arg2.method1011(35);
            this.field2673 = new int[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field2673[var7] = arg2.method1022(-98);
            }
        }
        if (arg0) {
            this.field2663 = -81;
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(IZLsc;III)V")
    public static final void method916(int arg0, boolean arg1, class128 arg2, int arg3, int arg4, int arg5) {
        class43 var6 = new class43();
        var6.field1001 = arg2.field3063;
        var6.field996 = arg2.field3034;
        var6.field974 = arg2.field3050;
        field2649++;
        int var7 = arg2.field3076;
        var6.field1002 = arg2.field3024 * 128;
        if (arg1) {
            field2667 = null;
        }
        var6.field999 = arg2.field3027;
        var6.field986 = arg5 * 128;
        int var8 = arg2.field3071;
        var6.field1005 = arg4;
        if (arg0 == 1 || arg0 == 3) {
            var7 = arg2.field3071;
            var8 = arg2.field3076;
        }
        var6.field989 = (arg5 + var8) * 128;
        var6.field993 = arg3 * 128;
        var6.field981 = (arg3 + var7) * 128;
        if (arg2.field3065 != null) {
            var6.field984 = arg2;
            var6.method349((byte) 24);
        }
        class71.field1492.method509(1, var6);
        if (var6.field999 != null) {
            var6.field985 = (int) ((double) (var6.field996 - var6.field974) * Math.random()) + var6.field974;
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(Lsb;I)V")
    public final void method917(class127 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method1011(48);
            if (var3 == 0) {
                field2648++;
                if (arg1 != 0) {
                    this.field2675 = 14;
                    return;
                }
                return;
            }
            this.method915(false, var3, arg0);
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(IB)V")
    public static final void method918(int arg0, byte arg1) {
        field2652++;
        if (arg0 == -1) {
            return;
        }
        if (arg1 != 49) {
            method922(null, null, -19);
        }
        if (!class67.field1427[arg0]) {
            return;
        }
        class109.field2569.method661(arg0, -1);
        if (class94.field2201[arg0] == null) {
            return;
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < class94.field2201[arg0].length; var3++) {
            if (class94.field2201[arg0][var3] != null) {
                if (class94.field2201[arg0][var3].field1690 == 2) {
                    var2 = false;
                } else {
                    class94.field2201[arg0][var3] = null;
                }
            }
        }
        if (var2) {
            class94.field2201[arg0] = null;
        }
        class67.field1427[arg0] = false;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(ILda;I)Lda;")
    public final class23 method919(int arg0, class23 arg1, int arg2) {
        field2661++;
        if (arg0 != -7) {
            field2665 = null;
        }
        int var4 = this.field2676[arg2];
        class133 var5 = class38.method321(var4 >> 16, 500);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg1.method198(true);
        } else {
            class23 var7 = arg1.method198(!var5.method1075(var6, (byte) 104));
            var7.method194(var5, var6);
            return var7;
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(ZBZIZ)Lpd;")
    public static final class108 method920(boolean arg0, byte arg1, boolean arg2, int arg3, boolean arg4) {
        field2657++;
        class7 var5 = null;
        if (arg1 == -89) {
            if (class49.field1093 != null) {
                var5 = new class7(arg3, class49.field1093, class110.field2599[arg3], 1000000);
            }
            return new class108(var5, class89.field2102, arg3, arg0, arg2, arg4);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!qe", name = "c", descriptor = "(B)V")
    public static void method921(byte arg0) {
        field2665 = null;
        field2653 = null;
        field2651 = null;
        field2674 = null;
        field2667 = null;
        if (arg0 >= -82) {
            method921((byte) 117);
        }
        field2670 = null;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(Lmd;Lmd;I)V")
    public static final void method922(class87 arg0, class87 arg1, int arg2) {
        class63.field1339 = arg0;
        class63.field1359 = arg1;
        if (arg2 != 16057) {
            method922(null, null, -95);
        }
        class78.field1801 = class63.field1339.method666(0, 3);
        field2644++;
    }
}
