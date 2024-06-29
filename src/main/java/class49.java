import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ia")
public class class49 {

    @OriginalMember(owner = "client!ia", name = "q", descriptor = "I")
    private int field1138 = 0;

    @OriginalMember(owner = "client!ia", name = "e", descriptor = "Lld;")
    private class70 field1126 = new class70(4096);

    @OriginalMember(owner = "client!ia", name = "E", descriptor = "I")
    private int field1152 = 0;

    @OriginalMember(owner = "client!ia", name = "D", descriptor = "Lld;")
    private class70 field1151 = new class70(32);

    @OriginalMember(owner = "client!ia", name = "H", descriptor = "I")
    private int field1155 = 0;

    @OriginalMember(owner = "client!ia", name = "I", descriptor = "Lda;")
    private class20 field1156 = new class20();

    @OriginalMember(owner = "client!ia", name = "J", descriptor = "Lld;")
    private class70 field1157 = new class70(4096);

    @OriginalMember(owner = "client!ia", name = "K", descriptor = "I")
    private int field1158 = 0;

    @OriginalMember(owner = "client!ia", name = "L", descriptor = "Lld;")
    private class70 field1159 = new class70(4096);

    @OriginalMember(owner = "client!ia", name = "O", descriptor = "I")
    private int field1162 = 0;

    @OriginalMember(owner = "client!ia", name = "N", descriptor = "Lud;")
    private class119 field1161 = new class119(8);

    @OriginalMember(owner = "client!ia", name = "R", descriptor = "I")
    private int field1165 = 0;

    @OriginalMember(owner = "client!ia", name = "n", descriptor = "Lec;")
    private static class28 field1135 = class28.method210(-46, "Hidden");

    @OriginalMember(owner = "client!ia", name = "i", descriptor = "Lec;")
    public static class28 field1130 = class28.method210(-46, "@gre@Classic");

    @OriginalMember(owner = "client!ia", name = "m", descriptor = "Lec;")
    public static class28 field1134 = field1135;

    @OriginalMember(owner = "client!ia", name = "l", descriptor = "Lt;")
    public static class110 field1133 = new class110();

    @OriginalMember(owner = "client!ia", name = "t", descriptor = "Lec;")
    public static class28 field1141 = class28.method210(-46, "wave:");

    @OriginalMember(owner = "client!ia", name = "u", descriptor = "Lec;")
    public static class28 field1142 = class28.method210(-46, "Loaded interfaces");

    @OriginalMember(owner = "client!ia", name = "x", descriptor = "Lec;")
    public static class28 field1145 = class28.method210(-46, "Walk here @whi@");

    @OriginalMember(owner = "client!ia", name = "z", descriptor = "Lec;")
    public static class28 field1147 = class28.method210(-46, "Walk here");

    @OriginalMember(owner = "client!ia", name = "A", descriptor = "[I")
    public static int[] field1148 = new int[500];

    @OriginalMember(owner = "client!ia", name = "w", descriptor = "Ltb;")
    public static class112 field1144 = new class112();

    @OriginalMember(owner = "client!ia", name = "G", descriptor = "I")
    public static int field1154 = -1;

    @OriginalMember(owner = "client!ia", name = "F", descriptor = "Lec;")
    public static class28 field1153 = class28.method210(-46, "backtop1");

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "I")
    public static int field1122;

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "I")
    public static int field1123;

    @OriginalMember(owner = "client!ia", name = "c", descriptor = "I")
    public static int field1124;

    @OriginalMember(owner = "client!ia", name = "d", descriptor = "I")
    public static int field1125;

    @OriginalMember(owner = "client!ia", name = "g", descriptor = "I")
    public static int field1128;

    @OriginalMember(owner = "client!ia", name = "h", descriptor = "I")
    public static int field1129;

    @OriginalMember(owner = "client!ia", name = "j", descriptor = "I")
    public static int field1131;

    @OriginalMember(owner = "client!ia", name = "k", descriptor = "I")
    public static int field1132;

    @OriginalMember(owner = "client!ia", name = "o", descriptor = "I")
    public static int field1136;

    @OriginalMember(owner = "client!ia", name = "p", descriptor = "I")
    public static int field1137;

    @OriginalMember(owner = "client!ia", name = "r", descriptor = "I")
    public static int field1139;

    @OriginalMember(owner = "client!ia", name = "s", descriptor = "I")
    public static int field1140;

    @OriginalMember(owner = "client!ia", name = "v", descriptor = "I")
    public static int field1143;

    @OriginalMember(owner = "client!ia", name = "f", descriptor = "J")
    private long field1127;

    @OriginalMember(owner = "client!ia", name = "Q", descriptor = "Lud;")
    private class119 field1164;

    @OriginalMember(owner = "client!ia", name = "M", descriptor = "Lwa;")
    private class126 field1160;

    @OriginalMember(owner = "client!ia", name = "y", descriptor = "Lwc;")
    public static class128 field1146;

    @OriginalMember(owner = "client!ia", name = "B", descriptor = "Lce;")
    private class18 field1149;

    @OriginalMember(owner = "client!ia", name = "P", descriptor = "Z")
    private boolean field1163;

    @OriginalMember(owner = "client!ia", name = "C", descriptor = "[[[B")
    public static byte[][][] field1150;

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(I)V")
    public static final void method391(int arg0) {
        if (arg0 != -12513) {
            return;
        }
        for (int var1 = -1; var1 < class74.field1641; var1++) {
            int var5;
            if (var1 == -1) {
                var5 = 2047;
            } else {
                var5 = class4.field66[var1];
            }
            class43 var6 = class129.field2779[var5];
            if (var6 != null && var6.field1479 > 0) {
                var6.field1479--;
                if (var6.field1479 == 0) {
                    var6.field1435 = null;
                }
            }
        }
        field1122++;
        for (int var2 = 0; var2 < class64.field1430; var2++) {
            int var3 = class64.field1429[var2];
            class90 var4 = class88.field1956[var3];
            if (var4 != null && var4.field1479 > 0) {
                var4.field1479--;
                if (var4.field1479 == 0) {
                    var4.field1435 = null;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(IZ)V")
    public final void method392(int arg0, boolean arg1) {
        field1139++;
        if (this.field1149 == null) {
            return;
        }
        try {
            if (arg0 != 0) {
                method401(62, null);
            }
            class119 var3 = new class119(4);
            var3.method888(arg1 ? 2 : 3, -98);
            var3.method873((byte) -71, 0);
            this.field1149.method110(var3.field2531, 0, (byte) -88, 4);
        } catch (IOException var5) {
            try {
                this.field1149.method104(true);
            } catch (Exception var4) {
            }
            this.field1149 = null;
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(ILbb;B)I")
    public final int method393(int arg0, class9 arg1, byte arg2) {
        field1140++;
        if (arg2 != 47) {
            this.field1163 = true;
        }
        return this.field1160 != null && this.field1160.field2730 == arg1 && arg0 + 1 == this.field1160.field2728 ? this.field1164.field2554 * 99 / (this.field1164.field2531.length - (this.field1160.field2728 == 0 ? 0 : 2)) + 1 : 0;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(Z)Z")
    public final boolean method394(boolean arg0) {
        field1128++;
        long var2 = System.currentTimeMillis();
        int var4 = (int) (var2 - this.field1127);
        if (var4 > 200) {
            var4 = 200;
        }
        this.field1127 = var2;
        this.field1138 += var4;
        if (this.field1162 == 0 && this.field1155 == 0 && this.field1158 == 0 && this.field1152 == 0) {
            return true;
        } else if (this.field1149 == null) {
            return false;
        } else {
            try {
                if (this.field1138 > 30000) {
                    throw new IOException();
                }
                while (this.field1155 < 20 && this.field1152 > 0) {
                    class126 var5 = (class126) this.field1126.method549((byte) 124);
                    class119 var6 = new class119(4);
                    var6.method888(1, 85);
                    var6.method888(var5.field2730.field157, 54);
                    var6.method876((byte) -48, var5.field2728);
                    this.field1149.method110(var6.field2531, 0, (byte) -127, 4);
                    this.field1151.method548(123, var5.field869, var5);
                    this.field1152--;
                    this.field1155++;
                }
                if (!arg0) {
                    this.method397(false, false, false);
                }
                while (this.field1162 < 20 && this.field1158 > 0) {
                    class126 var7 = (class126) this.field1156.method136(-5431);
                    class119 var8 = new class119(4);
                    var8.method888(0, -96);
                    var8.method888(var7.field2730.field157, 89);
                    var8.method876((byte) -48, var7.field2728);
                    this.field1149.method110(var8.field2531, 0, (byte) -99, 4);
                    var7.method569(false);
                    this.field1159.method548(-88, var7.field869, var7);
                    this.field1158--;
                    this.field1162++;
                }
                for (int var9 = 0; var9 < 100; var9++) {
                    int var10 = this.field1149.method106(-1);
                    if (var10 < 0) {
                        throw new IOException();
                    }
                    if (var10 == 0) {
                        break;
                    }
                    this.field1138 = 0;
                    byte var11 = 0;
                    if (this.field1160 == null) {
                        var11 = 8;
                    } else if (this.field1165 == 0) {
                        var11 = 1;
                    }
                    if (var11 <= 0) {
                        int var12 = this.field1164.field2531.length - (this.field1160.field2728 == 0 ? 0 : 2);
                        int var13 = 512 - this.field1165;
                        if (var12 - this.field1164.field2554 < var13) {
                            var13 = var12 - this.field1164.field2554;
                        }
                        if (var13 > var10) {
                            var13 = var10;
                        }
                        this.field1149.method112(-1527, this.field1164.field2554, var13, this.field1164.field2531);
                        this.field1164.field2554 += var13;
                        this.field1165 += var13;
                        if (this.field1164.field2554 == var12) {
                            this.field1160.field2730.method49(this.field1164.field2531, this.field1160.field2728, this.field1163, 2);
                            this.field1160.method319((byte) 70);
                            if (this.field1163) {
                                this.field1155--;
                            } else {
                                this.field1162--;
                            }
                            this.field1164 = null;
                            this.field1165 = 0;
                            this.field1160 = null;
                        } else {
                            if (this.field1165 != 512) {
                                break;
                            }
                            this.field1165 = 0;
                        }
                    } else {
                        int var14 = var11 - this.field1161.field2554;
                        if (var10 < var14) {
                            var14 = var10;
                        }
                        this.field1149.method112(-1527, this.field1161.field2554, var14, this.field1161.field2531);
                        this.field1161.field2554 += var14;
                        if (this.field1161.field2554 < var11) {
                            break;
                        }
                        if (this.field1160 == null) {
                            this.field1161.field2554 = 0;
                            int var15 = this.field1161.method879((byte) 45);
                            int var16 = this.field1161.method903(2);
                            long var17 = (long) ((var15 << 24) + var16);
                            int var19 = this.field1161.method879((byte) 45);
                            int var20 = this.field1161.method882(122);
                            class126 var21 = (class126) this.field1151.method551(var17, 25238);
                            this.field1163 = true;
                            if (var21 == null) {
                                var21 = (class126) this.field1159.method551(var17, 25238);
                                this.field1163 = false;
                            }
                            if (var21 == null) {
                                throw new IOException();
                            }
                            this.field1160 = var21;
                            int var22 = var19 == 0 ? 5 : 9;
                            this.field1164 = new class119(var22 + var20 + (this.field1160.field2728 == 0 ? 0 : 2));
                            this.field1164.method888(var19, 124);
                            this.field1164.method898(var20, -1202576);
                            if (this.field1160.field2728 != 0) {
                                this.field1164.field2554 = var20 + var22;
                                this.field1164.method876((byte) -48, this.field1160.field2730.field2624[this.field1160.field2728 - 1]);
                                this.field1164.field2554 = 5;
                            }
                            this.field1161.field2554 = 0;
                            this.field1165 = 8;
                        } else if (this.field1165 == 0) {
                            if (this.field1161.field2531[0] == -1) {
                                this.field1165 = 1;
                                this.field1161.field2554 = 0;
                            } else {
                                this.field1160 = null;
                            }
                        }
                    }
                }
                return true;
            } catch (IOException var24) {
                try {
                    this.field1149.method104(true);
                } catch (Exception var23) {
                }
                this.field1149 = null;
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(B)V")
    public static void method395(byte arg0) {
        field1145 = null;
        field1141 = null;
        field1148 = null;
        field1153 = null;
        field1144 = null;
        field1146 = null;
        field1135 = null;
        field1134 = null;
        if (arg0 <= 112) {
            return;
        }
        field1142 = null;
        field1130 = null;
        field1150 = null;
        field1147 = null;
        field1133 = null;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(ZIILbb;)V")
    public final void method396(boolean arg0, int arg1, int arg2, class9 arg3) {
        field1124++;
        long var5 = (long) ((arg3.field157 << 24) + arg1);
        class126 var7 = (class126) this.field1126.method551(var5, 25238);
        if (var7 != null) {
            return;
        }
        class126 var8 = (class126) this.field1151.method551(var5, 25238);
        if (var8 != null) {
            return;
        }
        class126 var9 = (class126) this.field1157.method551(var5, 25238);
        if (arg2 <= 126) {
            this.field1127 = 126L;
        }
        if (var9 == null) {
            if (!arg0) {
                class126 var10 = (class126) this.field1159.method551(var5, 25238);
                if (var10 != null) {
                    return;
                }
            }
            class126 var11 = new class126();
            var11.field2730 = arg3;
            var11.field2728 = arg1;
            if (arg0) {
                this.field1126.method548(-81, var5, var11);
                this.field1152++;
            } else {
                this.field1156.method131(var11, 0);
                this.field1157.method548(120, var5, var11);
                this.field1158++;
            }
        } else if (arg0) {
            var9.method569(false);
            this.field1126.method548(116, var5, var9);
            this.field1158--;
            this.field1152++;
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(ZZZ)I")
    public final int method397(boolean arg0, boolean arg1, boolean arg2) {
        field1123++;
        int var4 = 0;
        if (arg1) {
            return -3;
        }
        if (arg0) {
            var4 += this.field1152 + this.field1155;
        }
        if (arg2) {
            var4 += this.field1162 + this.field1158;
        }
        return var4;
    }

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "(B)I")
    public static final int method398(byte arg0) {
        field1137++;
        int var1 = class18.method107(class94.field2079, class88.field1966, -2049, class122.field2657);
        if (arg0 != 54) {
            field1130 = null;
        }
        return var1 - class64.field1423 >= 800 || (class47.field1080[class122.field2657][class88.field1966 >> 7][class94.field2079 >> 7] & 0x4) == 0 ? 3 : class122.field2657;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(ZLce;B)V")
    public final void method399(boolean arg0, class18 arg1, byte arg2) {
        if (arg2 > -73) {
            this.method393(101, null, (byte) -1);
        }
        if (this.field1149 != null) {
            try {
                this.field1149.method104(true);
                this.field1149 = null;
            } catch (Exception var6) {
            }
        }
        field1131++;
        this.field1149 = arg1;
        this.method392(0, arg0);
        this.field1161.field2554 = 0;
        this.field1165 = 0;
        this.field1160 = null;
        this.field1164 = null;
        while (true) {
            class126 var4 = (class126) this.field1151.method549((byte) -86);
            if (var4 == null) {
                while (true) {
                    class126 var5 = (class126) this.field1159.method549((byte) 126);
                    if (var5 == null) {
                        this.field1138 = 0;
                        this.field1127 = System.currentTimeMillis();
                        return;
                    }
                    this.field1156.method134(var5, (byte) -124);
                    this.field1157.method548(-34, var5.field869, var5);
                    this.field1162--;
                    this.field1158++;
                }
            }
            this.field1126.method548(-14, var4.field869, var4);
            this.field1155--;
            this.field1152++;
        }
    }

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "(I)V")
    public final void method400(int arg0) {
        field1129++;
        if (arg0 != 1) {
            method398((byte) -101);
        }
        if (this.field1149 != null) {
            this.field1149.method104(true);
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(ILke;)V")
    public static final void method401(int arg0, class65 arg1) {
        arg1.field1462 = false;
        field1132++;
        if (arg1.field1470 != -1) {
            class13 var2 = class23.method166(0, arg1.field1470);
            arg1.field1499++;
            if (var2.field245.length > arg1.field1480 && arg1.field1499 > var2.field223[arg1.field1480]) {
                arg1.field1499 = 1;
                arg1.field1480++;
            }
            if (var2.field245.length <= arg1.field1480) {
                arg1.field1480 = 0;
                arg1.field1499 = 0;
            }
        }
        if (arg1.field1489 != -1 && class83.field1888 >= arg1.field1442) {
            if (arg1.field1491 < 0) {
                arg1.field1491 = 0;
            }
            int var3 = class32.method252(-15381, arg1.field1489).field2668;
            if (var3 == -1) {
                arg1.field1489 = -1;
            } else {
                class13 var4 = class23.method166(arg0 - 30535, var3);
                arg1.field1476++;
                if (arg1.field1491 < var4.field245.length && arg1.field1476 > var4.field223[arg1.field1491]) {
                    arg1.field1476 = 1;
                    arg1.field1491++;
                }
                if (var4.field245.length <= arg1.field1491 && (arg1.field1491 < 0 || arg1.field1491 >= var4.field245.length)) {
                    arg1.field1489 = -1;
                }
            }
        }
        if (arg0 != 30535) {
            return;
        }
        if (arg1.field1505 != -1 && arg1.field1482 <= 1) {
            class13 var5 = class23.method166(0, arg1.field1505);
            if (var5.field226 == 1 && arg1.field1444 > 0 && class83.field1888 >= arg1.field1450 && class83.field1888 > arg1.field1474) {
                arg1.field1482 = 1;
                return;
            }
        }
        if (arg1.field1505 != -1 && arg1.field1482 == 0) {
            class13 var6 = class23.method166(0, arg1.field1505);
            arg1.field1467++;
            if (var6.field245.length > arg1.field1498 && arg1.field1467 > var6.field223[arg1.field1498]) {
                arg1.field1467 = 1;
                arg1.field1498++;
            }
            if (arg1.field1498 >= var6.field245.length) {
                arg1.field1434++;
                arg1.field1498 -= var6.field228;
                if (arg1.field1434 >= var6.field241) {
                    arg1.field1505 = -1;
                }
                if (arg1.field1498 < 0 || var6.field245.length <= arg1.field1498) {
                    arg1.field1505 = -1;
                }
            }
            arg1.field1462 = var6.field248;
        }
        if (arg1.field1482 > 0) {
            arg1.field1482--;
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(ZLbb;I)V")
    public final void method402(boolean arg0, class9 arg1, int arg2) {
        field1125++;
        if (arg0) {
            return;
        }
        long var4 = (long) ((arg1.field157 << 24) + arg2);
        class126 var6 = (class126) this.field1157.method551(var4, 25238);
        if (var6 != null) {
            this.field1156.method134(var6, (byte) -108);
        }
    }
}
