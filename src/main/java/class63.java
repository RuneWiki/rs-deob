import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fd")
public class class63 {

    @OriginalMember(owner = "client!fd", name = "n", descriptor = "Loe;")
    private class57 field1043 = new class57();

    @OriginalMember(owner = "client!fd", name = "t", descriptor = "Loe;")
    private class57 field1049 = new class57();

    @OriginalMember(owner = "client!fd", name = "v", descriptor = "Loe;")
    private class57 field1051 = new class57();

    @OriginalMember(owner = "client!fd", name = "x", descriptor = "Loe;")
    private class57 field1053 = new class57();

    @OriginalMember(owner = "client!fd", name = "y", descriptor = "Lwd;")
    private class162 field1054 = new class162(4);

    @OriginalMember(owner = "client!fd", name = "D", descriptor = "I")
    public volatile int field1058 = 0;

    @OriginalMember(owner = "client!fd", name = "F", descriptor = "I")
    public volatile int field1060 = 0;

    @OriginalMember(owner = "client!fd", name = "G", descriptor = "B")
    private byte field1061 = 0;

    @OriginalMember(owner = "client!fd", name = "E", descriptor = "Lwd;")
    private class162 field1059 = new class162(8);

    @OriginalMember(owner = "client!fd", name = "s", descriptor = "Loa;")
    public static class101 field1048 = new class101(128);

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "I")
    public static int field1030;

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "I")
    public static int field1031;

    @OriginalMember(owner = "client!fd", name = "c", descriptor = "I")
    public static int field1032;

    @OriginalMember(owner = "client!fd", name = "d", descriptor = "I")
    public static int field1033;

    @OriginalMember(owner = "client!fd", name = "e", descriptor = "I")
    public static int field1034;

    @OriginalMember(owner = "client!fd", name = "f", descriptor = "I")
    public static int field1035;

    @OriginalMember(owner = "client!fd", name = "g", descriptor = "I")
    public static int field1036;

    @OriginalMember(owner = "client!fd", name = "h", descriptor = "I")
    public static int field1037;

    @OriginalMember(owner = "client!fd", name = "i", descriptor = "I")
    public static int field1038;

    @OriginalMember(owner = "client!fd", name = "j", descriptor = "I")
    public static int field1039;

    @OriginalMember(owner = "client!fd", name = "k", descriptor = "I")
    public static int field1040;

    @OriginalMember(owner = "client!fd", name = "l", descriptor = "I")
    public static int field1041;

    @OriginalMember(owner = "client!fd", name = "m", descriptor = "I")
    public static int field1042;

    @OriginalMember(owner = "client!fd", name = "o", descriptor = "I")
    public static int field1044;

    @OriginalMember(owner = "client!fd", name = "p", descriptor = "I")
    public static int field1045;

    @OriginalMember(owner = "client!fd", name = "q", descriptor = "I")
    public static int field1046;

    @OriginalMember(owner = "client!fd", name = "r", descriptor = "I")
    public static int field1047;

    @OriginalMember(owner = "client!fd", name = "u", descriptor = "I")
    public static int field1050;

    @OriginalMember(owner = "client!fd", name = "w", descriptor = "I")
    public static int field1052;

    @OriginalMember(owner = "client!fd", name = "B", descriptor = "I")
    private int field1056;

    @OriginalMember(owner = "client!fd", name = "z", descriptor = "J")
    private long field1055;

    @OriginalMember(owner = "client!fd", name = "C", descriptor = "Lca;")
    private class139 field1057;

    @OriginalMember(owner = "client!fd", name = "H", descriptor = "Ljb;")
    private class225 field1062;

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(B)V")
    public static final void method427(byte arg0) {
        field1040++;
        if (arg0 != -100) {
            return;
        }
        while (class131.field2053.method824(0, class47.field793) >= 27) {
            int var1 = class131.field2053.method831(15, true);
            if (var1 == 32767) {
                break;
            }
            boolean var2 = false;
            if (class12.field127[var1] == null) {
                var2 = true;
                class12.field127[var1] = new class131();
            }
            class131 var3 = class12.field127[var1];
            class184.field3020[class246.field3912++] = var1;
            var3.field695 = class29.field360;
            if (var3.field2056 != null && var3.field2056.method1706((byte) -51)) {
                class298.method1971((byte) 35, var3);
            }
            var3.method927(true, class234.method1586(class131.field2053.method831(14, true), true));
            int var4 = class131.field2053.method831(1, true);
            int var5 = class131.field2053.method831(1, true);
            if (var5 == 1) {
                class40.field584[class69.field1145++] = var1;
            }
            int var6 = class131.field2053.method831(5, true);
            if (var6 > 15) {
                var6 -= 32;
            }
            int var7 = class70.field1157[class131.field2053.method831(3, true)];
            if (var2) {
                var3.field702 = var3.field652 = var7;
            }
            int var8 = class131.field2053.method831(5, true);
            var3.method280((byte) -63, var3.field2056.field4048);
            var3.field664 = var3.field2056.field4084;
            if (var3.field664 == 0) {
                var3.field652 = 0;
            }
            var3.field626 = var3.field2056.field4083;
            if (var8 > 15) {
                var8 -= 32;
            }
            var3.method278(var4 == 1, class239.field3829.field709[0] + var8, class239.field3829.field704[0] - -var6, (byte) -100, var3.method279(23397));
            if (var3.field2056.method1706((byte) 5)) {
                class267.method1797((byte) -122, 0, var3, class56.field941, var3.field704[0], var3.field709[0], (class299) null, (class158) null, 0);
            }
        }
        class131.field2053.method825(-38);
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(I)V")
    public final void method428(int arg0) {
        if (this.field1057 != null) {
            this.field1057.method974((byte) 121);
        }
        if (arg0 != 28449) {
            method440(true);
        }
        field1034++;
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(Z)I")
    public final int method429(boolean arg0) {
        if (arg0) {
            method433(105, -60, 14, 71);
        }
        field1030++;
        return this.field1043.method397(121) + this.field1049.method397(114);
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(ILca;Z)V")
    public final void method430(int arg0, class139 arg1, boolean arg2) {
        if (this.field1057 != null) {
            try {
                this.field1057.method974((byte) 117);
            } catch (Exception var8) {
            }
            this.field1057 = null;
        }
        field1042++;
        this.field1057 = arg1;
        this.method437(6);
        this.method444(arg2, (byte) -120);
        this.field1059.field2568 = 0;
        this.field1062 = null;
        if (arg0 != 25433) {
            method440(true);
        }
        while (true) {
            class225 var4 = (class225) this.field1049.method390(-84);
            if (var4 == null) {
                while (true) {
                    class225 var5 = (class225) this.field1053.method390(-90);
                    if (var5 == null) {
                        if (this.field1061 != 0) {
                            try {
                                this.field1054.field2568 = 0;
                                this.field1054.method1108(4, true);
                                this.field1054.method1108(this.field1061, true);
                                this.field1054.method1120(0, true);
                                this.field1057.method977(this.field1054.field2573, 4, 0, -27241);
                            } catch (IOException var7) {
                                try {
                                    this.field1057.method974((byte) 112);
                                } catch (Exception var6) {
                                }
                                this.field1058++;
                                this.field1060 = -2;
                                this.field1057 = null;
                            }
                        }
                        this.field1056 = 0;
                        this.field1055 = class191.method1350((byte) -14);
                        return;
                    }
                    this.field1051.method395(30985, var5);
                }
            }
            this.field1043.method395(30985, var4);
        }
    }

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "(B)I")
    private final int method431(byte arg0) {
        field1039++;
        return arg0 == 101 ? this.field1051.method397(114) + this.field1053.method397(arg0 ^ 0x19) : -53;
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(ZB)V")
    public static final void method432(boolean arg0, byte arg1) {
        if (arg1 != 56) {
            field1045 = -74;
        }
        byte var2 = 4;
        byte[][] var3 = class57.field956;
        int var4 = var3.length;
        for (int var5 = 0; var5 < var4; var5++) {
            int[] var11 = null;
            byte[] var12 = var3[var5];
            int var13 = class120.field1914[var5] & 0xFF;
            int var14 = var13 * 64 - class108.field1732;
            int var15 = class120.field1914[var5] >> 8;
            int var16 = var15 * 64 - class276.field4438;
            if (var12 != null) {
                class276.method1859((byte) 121);
                var11 = class42.method274(class131.field2065, var14, var12, class108.field1732, arg0, arg1 + 47, class276.field4438, var16);
            }
            if (!arg0 && (class19.field226 / 8) == var15 && (class48.field801 / 8) == var13) {
                if (var11 == null) {
                    class67.field1116 = -1;
                } else {
                    class255.field4118 = var11[3];
                    class67.field1116 = var11[0];
                    class163.field2648 = var11[4];
                    class175.field2866 = var11[1];
                    class206.field3284 = var11[2];
                }
            }
        }
        field1036++;
        for (int var6 = 0; var6 < var4; var6++) {
            int var7 = (class120.field1914[var6] >> 8) * 64 - class276.field4438;
            int var8 = (class120.field1914[var6] & 0xFF) * 64 - class108.field1732;
            byte[] var9 = var3[var6];
            if (var9 == null && class48.field801 < 800) {
                class276.method1859((byte) 109);
                for (int var10 = 0; var10 < var2; var10++) {
                    class192.method1358(var8, 64, var7, 64, (byte) -107, var10);
                }
            }
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(IIII)Z")
    public static final boolean method433(int arg0, int arg1, int arg2, int arg3) {
        if (!class287.method1913(arg0, arg1, arg2)) {
            return false;
        }
        int var4 = arg1 << 7;
        int var5 = arg2 << 7;
        int var6 = class267.field4304[arg0][arg1][arg2] - 1;
        int var7 = var6 - 120;
        int var8 = var6 - 230;
        int var9 = var6 - 238;
        if (arg3 < 16) {
            if (arg3 == 1) {
                if (var4 > class100.field1626) {
                    if (!class161.method1106(var4, var6, var5)) {
                        return false;
                    }
                    if (!class161.method1106(var4, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class161.method1106(var4, var7, var5)) {
                        return false;
                    }
                    if (!class161.method1106(var4, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class161.method1106(var4, var8, var5)) {
                    return false;
                }
                if (!class161.method1106(var4, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 2) {
                if (var5 < class238.field3823) {
                    if (!class161.method1106(var4, var6, var5 + 128)) {
                        return false;
                    }
                    if (!class161.method1106(var4 + 128, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class161.method1106(var4, var7, var5 + 128)) {
                        return false;
                    }
                    if (!class161.method1106(var4 + 128, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class161.method1106(var4, var8, var5 + 128)) {
                    return false;
                }
                if (!class161.method1106(var4 + 128, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 4) {
                if (var4 < class100.field1626) {
                    if (!class161.method1106(var4 + 128, var6, var5)) {
                        return false;
                    }
                    if (!class161.method1106(var4 + 128, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class161.method1106(var4 + 128, var7, var5)) {
                        return false;
                    }
                    if (!class161.method1106(var4 + 128, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class161.method1106(var4 + 128, var8, var5)) {
                    return false;
                }
                if (!class161.method1106(var4 + 128, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 8) {
                if (var5 > class238.field3823) {
                    if (!class161.method1106(var4, var6, var5)) {
                        return false;
                    }
                    if (!class161.method1106(var4 + 128, var6, var5)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class161.method1106(var4, var7, var5)) {
                        return false;
                    }
                    if (!class161.method1106(var4 + 128, var7, var5)) {
                        return false;
                    }
                }
                if (!class161.method1106(var4, var8, var5)) {
                    return false;
                }
                if (!class161.method1106(var4 + 128, var8, var5)) {
                    return false;
                }
                return true;
            }
        }
        if (!class161.method1106(var4 + 64, var9, var5 + 64)) {
            return false;
        } else if (arg3 == 16) {
            return class161.method1106(var4, var8, var5 + 128);
        } else if (arg3 == 32) {
            return class161.method1106(var4 + 128, var8, var5 + 128);
        } else if (arg3 == 64) {
            return class161.method1106(var4 + 128, var8, var5);
        } else if (arg3 == 128) {
            return class161.method1106(var4, var8, var5);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "(I)V")
    public final void method434(int arg0) {
        field1044++;
        if (this.field1057 == null) {
            return;
        }
        try {
            this.field1054.field2568 = 0;
            this.field1054.method1108(7, true);
            this.field1054.method1134(arg0, true);
            this.field1057.method977(this.field1054.field2573, 4, 0, arg0 - 27241);
        } catch (IOException var3) {
            try {
                this.field1057.method974((byte) 113);
            } catch (Exception var2) {
            }
            this.field1060 = -2;
            this.field1058++;
            this.field1057 = null;
        }
    }

    @OriginalMember(owner = "client!fd", name = "c", descriptor = "(B)V")
    public final void method435(byte arg0) {
        field1035++;
        try {
            this.field1057.method974((byte) 124);
        } catch (Exception var2) {
        }
        this.field1061 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
        if (arg0 < -100) {
            this.field1060 = -1;
            this.field1057 = null;
            this.field1058++;
        }
    }

    @OriginalMember(owner = "client!fd", name = "c", descriptor = "(I)Z")
    public final boolean method436(int arg0) {
        if (arg0 < 91) {
            return true;
        } else {
            field1046++;
            return this.method431((byte) 101) >= 20;
        }
    }

    @OriginalMember(owner = "client!fd", name = "d", descriptor = "(I)V")
    private final void method437(int arg0) {
        field1038++;
        if (this.field1057 == null) {
            return;
        }
        try {
            this.field1054.field2568 = 0;
            this.field1054.method1108(arg0, true);
            this.field1054.method1134(3, true);
            this.field1057.method977(this.field1054.field2573, 4, 0, -27241);
        } catch (IOException var3) {
            try {
                this.field1057.method974((byte) 113);
            } catch (Exception var2) {
            }
            this.field1060 = -2;
            this.field1057 = null;
            this.field1058++;
        }
    }

    @OriginalMember(owner = "client!fd", name = "e", descriptor = "(I)V")
    public final void method438(int arg0) {
        if (arg0 != -1) {
            this.field1049 = null;
        }
        if (this.field1057 != null) {
            this.field1057.method970((byte) 37);
        }
        field1033++;
    }

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "(Z)Z")
    public final boolean method439(boolean arg0) {
        if (this.field1057 != null) {
            long var2 = class191.method1350((byte) 113);
            int var4 = (int) (var2 - this.field1055);
            this.field1055 = var2;
            if (var4 > 200) {
                var4 = 200;
            }
            this.field1056 += var4;
            if (this.field1056 > 30000) {
                try {
                    this.field1057.method974((byte) 118);
                } catch (Exception var27) {
                }
                this.field1057 = null;
            }
        }
        field1050++;
        if (this.field1057 == null) {
            return this.method429(false) == 0 && this.method431((byte) 101) == 0;
        }
        try {
            this.field1057.method973(arg0);
            for (class225 var5 = (class225) this.field1043.method389(0); var5 != null; var5 = (class225) this.field1043.method396(0)) {
                this.field1054.field2568 = 0;
                this.field1054.method1108(1, true);
                this.field1054.method1134((int) var5.field2169, true);
                this.field1057.method977(this.field1054.field2573, 4, 0, -27241);
                this.field1049.method395(30985, var5);
            }
            for (class225 var6 = (class225) this.field1051.method389(0); var6 != null; var6 = (class225) this.field1051.method396(0)) {
                this.field1054.field2568 = 0;
                this.field1054.method1108(0, true);
                this.field1054.method1134((int) var6.field2169, true);
                this.field1057.method977(this.field1054.field2573, 4, 0, -27241);
                this.field1053.method395(30985, var6);
            }
            for (int var7 = 0; var7 < 100; var7++) {
                int var8 = this.field1057.method972(0);
                if (var8 < 0) {
                    throw new IOException();
                }
                if (var8 == 0) {
                    break;
                }
                byte var9 = 0;
                this.field1056 = 0;
                if (this.field1062 == null) {
                    var9 = 8;
                } else if (this.field1062.field3655 == 0) {
                    var9 = 1;
                }
                if (var9 > 0) {
                    int var10 = var9 - this.field1059.field2568;
                    if (var10 > var8) {
                        var10 = var8;
                    }
                    this.field1057.method979(this.field1059.field2573, -1, this.field1059.field2568, var10);
                    if (this.field1061 != 0) {
                        for (int var11 = 0; var11 < var10; var11++) {
                            this.field1059.field2573[this.field1059.field2568 + var11] = (byte) class98.method672(this.field1059.field2573[this.field1059.field2568 + var11], this.field1061);
                        }
                    }
                    this.field1059.field2568 += var10;
                    if (var9 <= this.field1059.field2568) {
                        if (this.field1062 == null) {
                            this.field1059.field2568 = 0;
                            int var12 = this.field1059.method1133((byte) 53);
                            int var13 = this.field1059.method1142(-18970);
                            int var14 = this.field1059.method1133((byte) 53);
                            int var15 = this.field1059.method1157(65280);
                            boolean var16 = (var14 & 0x80) != 0;
                            Object var17 = null;
                            int var18 = var14 & 0x7F;
                            long var19 = (long) ((var12 << 16) + var13);
                            class225 var21;
                            if (var16) {
                                for (var21 = (class225) this.field1053.method389(0); var21 != null && var21.field2169 != var19; var21 = (class225) this.field1053.method396(0)) {
                                }
                            } else {
                                for (var21 = (class225) this.field1049.method389(0); var21 != null && var21.field2169 != var19; var21 = (class225) this.field1049.method396(0)) {
                                }
                            }
                            if (var21 == null) {
                                throw new IOException();
                            }
                            this.field1062 = var21;
                            int var22 = var18 == 0 ? 5 : 9;
                            this.field1062.field3660 = new class162(var22 + this.field1062.field3654 + var15);
                            this.field1062.field3660.method1108(var18, true);
                            this.field1062.field3660.method1125(var15, 255);
                            this.field1062.field3655 = 8;
                            this.field1059.field2568 = 0;
                        } else if (this.field1062.field3655 != 0) {
                            throw new IOException();
                        } else if (this.field1059.field2573[0] == -1) {
                            this.field1062.field3655 = 1;
                            this.field1059.field2568 = 0;
                        } else {
                            this.field1062 = null;
                        }
                    }
                } else {
                    int var23 = this.field1062.field3660.field2573.length - this.field1062.field3654;
                    int var24 = 512 - this.field1062.field3655;
                    if (var24 > var23 - this.field1062.field3660.field2568) {
                        var24 = var23 - this.field1062.field3660.field2568;
                    }
                    if (var24 > var8) {
                        var24 = var8;
                    }
                    this.field1057.method979(this.field1062.field3660.field2573, -1, this.field1062.field3660.field2568, var24);
                    if (this.field1061 != 0) {
                        for (int var25 = 0; var25 < var24; var25++) {
                            this.field1062.field3660.field2573[this.field1062.field3660.field2568 + var25] = (byte) class98.method672(this.field1062.field3660.field2573[this.field1062.field3660.field2568 + var25], this.field1061);
                        }
                    }
                    this.field1062.field3655 += var24;
                    this.field1062.field3660.field2568 += var24;
                    if (this.field1062.field3660.field2568 == var23) {
                        this.field1062.method956(256);
                        this.field1062.field205 = false;
                        this.field1062 = null;
                    } else if (this.field1062.field3655 == 512) {
                        this.field1062.field3655 = 0;
                    }
                }
            }
            return true;
        } catch (IOException var28) {
            try {
                this.field1057.method974((byte) 110);
            } catch (Exception var26) {
            }
            this.field1060 = -2;
            this.field1057 = null;
            this.field1058++;
            return this.method429(!arg0) == 0 && this.method431((byte) 101) == 0;
        }
    }

    @OriginalMember(owner = "client!fd", name = "c", descriptor = "(Z)V")
    public static void method440(boolean arg0) {
        if (arg0) {
            method433(106, -14, 94, -86);
        }
        field1048 = null;
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(BZIIB)Ljb;")
    public final class225 method441(byte arg0, boolean arg1, int arg2, int arg3, byte arg4) {
        field1031++;
        if (arg4 <= 80) {
            this.method438(77);
        }
        class225 var6 = new class225();
        var6.field201 = arg1;
        long var7 = (long) ((arg3 << 16) + arg2);
        var6.field2169 = var7;
        var6.field3654 = arg0;
        if (arg1) {
            if (this.method429(false) >= 20) {
                throw new RuntimeException();
            }
            this.field1043.method395(30985, var6);
        } else if (this.method431((byte) 101) < 20) {
            this.field1051.method395(30985, var6);
        } else {
            throw new RuntimeException();
        }
        return var6;
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(III)I")
    public static final int method442(int arg0, int arg1, int arg2) {
        field1041++;
        if (arg1 == -1) {
            return 12345678;
        }
        if (arg0 > -71) {
            field1045 = 127;
        }
        int var3 = (arg1 & 0x7F) * arg2 >> 7;
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return (arg1 & 0xFF80) + var3;
    }

    @OriginalMember(owner = "client!fd", name = "f", descriptor = "(I)Z")
    public final boolean method443(int arg0) {
        field1032++;
        if (arg0 < 110) {
            this.field1051 = null;
        }
        return this.method429(false) >= 20;
    }

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "(ZB)V")
    public final void method444(boolean arg0, byte arg1) {
        field1047++;
        if (this.field1057 == null) {
            return;
        }
        try {
            int var3 = 27 % ((-arg1 - 55) / 47);
            this.field1054.field2568 = 0;
            this.field1054.method1108(arg0 ? 2 : 3, true);
            this.field1054.method1134(0, true);
            this.field1057.method977(this.field1054.field2573, 4, 0, -27241);
        } catch (IOException var5) {
            try {
                this.field1057.method974((byte) 120);
            } catch (Exception var4) {
            }
            this.field1060 = -2;
            this.field1057 = null;
            this.field1058++;
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(BC)C")
    public static final char method445(byte arg0, char arg1) {
        if (arg0 < 29) {
            return 'q';
        } else {
            field1037++;
            return arg1 == 'µ' || arg1 == 'ƒ' ? arg1 : Character.toTitleCase(arg1);
        }
    }
}
