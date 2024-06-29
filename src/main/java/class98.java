import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qca")
public class class98 {

    @OriginalMember(owner = "client!qca", name = "b", descriptor = "[I")
    private int[] field1143;

    @OriginalMember(owner = "client!qca", name = "e", descriptor = "[I")
    private int[] field1146;

    @OriginalMember(owner = "client!qca", name = "m", descriptor = "Lig;")
    public static class206 field1154 = new class206(10, -1);

    @OriginalMember(owner = "client!qca", name = "a", descriptor = "I")
    public static int field1142;

    @OriginalMember(owner = "client!qca", name = "c", descriptor = "I")
    private int field1144;

    @OriginalMember(owner = "client!qca", name = "d", descriptor = "I")
    private int field1145;

    @OriginalMember(owner = "client!qca", name = "f", descriptor = "I")
    public static int field1147;

    @OriginalMember(owner = "client!qca", name = "g", descriptor = "I")
    private int field1148;

    @OriginalMember(owner = "client!qca", name = "h", descriptor = "I")
    public static int field1149;

    @OriginalMember(owner = "client!qca", name = "i", descriptor = "I")
    public static int field1150;

    @OriginalMember(owner = "client!qca", name = "j", descriptor = "I")
    public static int field1151;

    @OriginalMember(owner = "client!qca", name = "k", descriptor = "I")
    private int field1152;

    @OriginalMember(owner = "client!qca", name = "l", descriptor = "I")
    public static int field1153;

    @OriginalMember(owner = "client!qca", name = "n", descriptor = "Lkea;")
    public static class203 field1155;

    @OriginalMember(owner = "client!qca", name = "o", descriptor = "[Lxa;")
    public static class433[] field1156;

    @OriginalMember(owner = "client!qca", name = "a", descriptor = "(I)V")
    private final void method607(int arg0) {
        field1151++;
        this.field1152 += ++this.field1145;
        for (int var2 = arg0; var2 < 256; var2++) {
            int var3 = this.field1146[var2];
            if ((var2 & 0x2) == 0) {
                if ((var2 & 0x1) == 0) {
                    this.field1144 ^= this.field1144 << 13;
                } else {
                    this.field1144 ^= this.field1144 >>> 6;
                }
            } else if ((var2 & 0x1) == 0) {
                this.field1144 ^= this.field1144 << 2;
            } else {
                this.field1144 ^= this.field1144 >>> 16;
            }
            this.field1144 += this.field1146[var2 + 128 & 0xFF];
            int var4;
            this.field1146[var2] = var4 = this.field1146[class643.method3659(1020, var3) >> 2] + this.field1144 + this.field1152;
            this.field1143[var2] = this.field1152 = this.field1146[class643.method3659(255, var4 >> 8 >> 2)] + var3;
        }
    }

    @OriginalMember(owner = "client!qca", name = "a", descriptor = "(B[S)[S")
    public static final short[] method608(byte arg0, short[] arg1) {
        field1149++;
        if (arg1 == null) {
            return null;
        }
        short[] var2 = new short[arg1.length];
        class210.method1329(arg1, 0, var2, 0, arg1.length);
        if (arg0 != -110) {
            method611((byte) 59);
        }
        return var2;
    }

    @OriginalMember(owner = "client!qca", name = "b", descriptor = "(I)I")
    public final int method609(int arg0) {
        field1153++;
        if (this.field1148 == 0) {
            this.method607(0);
            this.field1148 = 256;
        }
        return arg0 == 256 ? this.field1143[--this.field1148] : -121;
    }

    @OriginalMember(owner = "client!qca", name = "a", descriptor = "()V")
    public static final void method610() {
        class467.field6928 = 0;
        label212: for (int var0 = 0; var0 < class126.field1564; var0++) {
            class262 var1 = class92.field1069[var0];
            if (class595.field8695 != null) {
                for (int var2 = 0; var2 < class595.field8695.length; var2++) {
                    if (class595.field8695[var2] != -1000000 && (var1.field3720 <= class595.field8695[var2] || var1.field3721 <= class595.field8695[var2]) && (var1.field3724 <= class368.field5561[var2] || var1.field3730 <= class368.field5561[var2]) && (var1.field3724 >= class595.field8692[var2] || var1.field3730 >= class595.field8692[var2]) && (var1.field3719 <= class426.field6343[var2] || var1.field3732 <= class426.field6343[var2]) && (var1.field3719 >= class299.field4415[var2] || var1.field3732 >= class299.field4415[var2])) {
                        continue label212;
                    }
                }
            }
            if (var1.field3733 == 1) {
                int var3 = var1.field3731 + class224.field3164 - class550.field7844;
                if (var3 >= 0 && var3 <= class224.field3164 + class224.field3164) {
                    int var4 = var1.field3716 + class224.field3164 - class650.field9385;
                    if (var4 < 0) {
                        var4 = 0;
                    } else if (var4 > class224.field3164 + class224.field3164) {
                        continue;
                    }
                    int var5 = var1.field3726 + class224.field3164 - class650.field9385;
                    if (var5 > class224.field3164 + class224.field3164) {
                        var5 = class224.field3164 + class224.field3164;
                    } else if (var5 < 0) {
                        continue;
                    }
                    boolean var6 = false;
                    while (var4 <= var5) {
                        if (class437.field6505[var3][var4++]) {
                            var6 = true;
                            break;
                        }
                    }
                    if (var6) {
                        int var7 = class625.field9043 - var1.field3724;
                        if (var7 > class564.field8047) {
                            var1.field3729 = 1;
                        } else {
                            if (var7 >= -class564.field8047) {
                                continue;
                            }
                            var1.field3729 = 2;
                            var7 = -var7;
                        }
                        var1.field3728 = (var1.field3719 - class560.field7982 << 8) / var7;
                        var1.field3717 = (var1.field3732 - class560.field7982 << 8) / var7;
                        var1.field3722 = (var1.field3720 - class603.field8813 << 8) / var7;
                        var1.field3723 = (var1.field3721 - class603.field8813 << 8) / var7;
                        class490.field7147[class467.field6928++] = var1;
                    }
                }
            } else if (var1.field3733 == 2) {
                int var8 = var1.field3716 + class224.field3164 - class650.field9385;
                if (var8 >= 0 && var8 <= class224.field3164 + class224.field3164) {
                    int var9 = var1.field3731 + class224.field3164 - class550.field7844;
                    if (var9 < 0) {
                        var9 = 0;
                    } else if (var9 > class224.field3164 + class224.field3164) {
                        continue;
                    }
                    int var10 = var1.field3725 + class224.field3164 - class550.field7844;
                    if (var10 > class224.field3164 + class224.field3164) {
                        var10 = class224.field3164 + class224.field3164;
                    } else if (var10 < 0) {
                        continue;
                    }
                    boolean var11 = false;
                    while (var9 <= var10) {
                        if (class437.field6505[var9++][var8]) {
                            var11 = true;
                            break;
                        }
                    }
                    if (var11) {
                        int var12 = class560.field7982 - var1.field3719;
                        if (var12 > class564.field8047) {
                            var1.field3729 = 3;
                        } else {
                            if (var12 >= -class564.field8047) {
                                continue;
                            }
                            var1.field3729 = 4;
                            var12 = -var12;
                        }
                        var1.field3715 = (var1.field3724 - class625.field9043 << 8) / var12;
                        var1.field3714 = (var1.field3730 - class625.field9043 << 8) / var12;
                        var1.field3722 = (var1.field3720 - class603.field8813 << 8) / var12;
                        var1.field3723 = (var1.field3721 - class603.field8813 << 8) / var12;
                        class490.field7147[class467.field6928++] = var1;
                    }
                }
            } else if (var1.field3733 == 4) {
                int var13 = var1.field3720 - class603.field8813;
                if (var13 > class103.field1229) {
                    int var14 = var1.field3716 + class224.field3164 - class650.field9385;
                    if (var14 < 0) {
                        var14 = 0;
                    } else if (var14 > class224.field3164 + class224.field3164) {
                        continue;
                    }
                    int var15 = var1.field3726 + class224.field3164 - class650.field9385;
                    if (var15 > class224.field3164 + class224.field3164) {
                        var15 = class224.field3164 + class224.field3164;
                    } else if (var15 < 0) {
                        continue;
                    }
                    int var16 = var1.field3731 + class224.field3164 - class550.field7844;
                    if (var16 < 0) {
                        var16 = 0;
                    } else if (var16 > class224.field3164 + class224.field3164) {
                        continue;
                    }
                    int var17 = var1.field3725 + class224.field3164 - class550.field7844;
                    if (var17 > class224.field3164 + class224.field3164) {
                        var17 = class224.field3164 + class224.field3164;
                    } else if (var17 < 0) {
                        continue;
                    }
                    boolean var18 = false;
                    label184: for (int var19 = var16; var19 <= var17; var19++) {
                        for (int var20 = var14; var20 <= var15; var20++) {
                            if (class437.field6505[var19][var20]) {
                                var18 = true;
                                break label184;
                            }
                        }
                    }
                    if (var18) {
                        var1.field3729 = 5;
                        var1.field3715 = (var1.field3724 - class625.field9043 << 8) / var13;
                        var1.field3714 = (var1.field3730 - class625.field9043 << 8) / var13;
                        var1.field3728 = (var1.field3719 - class560.field7982 << 8) / var13;
                        var1.field3717 = (var1.field3732 - class560.field7982 << 8) / var13;
                        class490.field7147[class467.field6928++] = var1;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!qca", name = "a", descriptor = "(B)V")
    public static void method611(byte arg0) {
        field1154 = null;
        field1156 = null;
        field1155 = null;
        if (arg0 <= 53) {
            field1156 = null;
        }
    }

    @OriginalMember(owner = "client!qca", name = "c", descriptor = "(I)V")
    private final void method612(int arg0) {
        field1147++;
        if (arg0 != -1746504600) {
            this.field1148 = 13;
        }
        int var2 = -1640531527;
        int var3 = -1640531527;
        int var4 = -1640531527;
        int var5 = -1640531527;
        int var6 = -1640531527;
        int var7 = -1640531527;
        int var8 = -1640531527;
        int var9 = -1640531527;
        for (int var10 = 0; var10 < 4; var10++) {
            int var61 = var9 ^ var8 << 11;
            int var62 = var6 + var61;
            int var63 = var7 + var8;
            int var64 = var63 ^ var7 >>> 2;
            int var65 = var7 + var62;
            int var66 = var5 + var64;
            int var67 = var65 ^ var62 << 8;
            int var68 = var62 + var66;
            int var69 = var4 + var67;
            var6 = var68 ^ var66 >>> 16;
            int var70 = var3 + var6;
            int var71 = var66 + var69;
            var5 = var71 ^ var69 << 10;
            int var72 = var2 + var5;
            int var73 = var69 + var70;
            var4 = var73 ^ var70 >>> 4;
            int var74 = var70 + var72;
            int var75 = var4 + var61;
            var3 = var74 ^ var72 << 8;
            var8 = var3 + var64;
            int var76 = var72 + var75;
            var2 = var76 ^ var75 >>> 9;
            var9 = var8 + var75;
            var7 = var2 + var67;
        }
        for (int var11 = 0; var11 < 256; var11 += 8) {
            int var37 = this.field1143[var11 + 3] + var6;
            int var38 = this.field1143[var11 + 6] + var3;
            int var39 = this.field1143[var11 + 1] + var8;
            int var40 = this.field1143[var11 + 7] + var2;
            int var41 = this.field1143[var11 + 5] + var4;
            int var42 = this.field1143[var11 + 2] + var7;
            int var43 = this.field1143[var11 + 4] + var5;
            int var44 = this.field1143[var11] + var9;
            int var45 = var44 ^ var39 << 11;
            int var46 = var37 + var45;
            int var47 = var39 + var42;
            int var48 = var47 ^ var42 >>> 2;
            int var49 = var43 + var48;
            int var50 = var42 + var46;
            int var51 = var50 ^ var46 << 8;
            int var52 = var46 + var49;
            int var53 = var41 + var51;
            var6 = var52 ^ var49 >>> 16;
            int var54 = var49 + var53;
            int var55 = var6 + var38;
            var5 = var54 ^ var53 << 10;
            int var56 = var53 + var55;
            int var57 = var5 + var40;
            var4 = var56 ^ var55 >>> 4;
            int var58 = var55 + var57;
            int var59 = var4 + var45;
            var3 = var58 ^ var57 << 8;
            var8 = var3 + var48;
            int var60 = var57 + var59;
            var2 = var60 ^ var59 >>> 9;
            var9 = var8 + var59;
            var7 = var2 + var51;
            this.field1146[var11] = var9;
            this.field1146[var11 + 1] = var8;
            this.field1146[var11 + 2] = var7;
            this.field1146[var11 + 3] = var6;
            this.field1146[var11 + 4] = var5;
            this.field1146[var11 + 5] = var4;
            this.field1146[var11 + 6] = var3;
            this.field1146[var11 + 7] = var2;
        }
        for (int var12 = 0; var12 < 256; var12 += 8) {
            int var13 = this.field1146[var12 + 4] + var5;
            int var14 = this.field1146[var12 + 1] + var8;
            int var15 = this.field1146[var12 + 5] + var4;
            int var16 = this.field1146[var12] + var9;
            int var17 = this.field1146[var12 + 6] + var3;
            int var18 = this.field1146[var12 + 2] + var7;
            int var19 = this.field1146[var12 + 7] + var2;
            int var20 = this.field1146[var12 + 3] + var6;
            int var21 = var16 ^ var14 << 11;
            int var22 = var14 + var18;
            int var23 = var20 + var21;
            int var24 = var22 ^ var18 >>> 2;
            int var25 = var18 + var23;
            int var26 = var13 + var24;
            int var27 = var25 ^ var23 << 8;
            int var28 = var23 + var26;
            int var29 = var15 + var27;
            var6 = var28 ^ var26 >>> 16;
            int var30 = var26 + var29;
            int var31 = var6 + var17;
            var5 = var30 ^ var29 << 10;
            int var32 = var29 + var31;
            int var33 = var5 + var19;
            var4 = var32 ^ var31 >>> 4;
            int var34 = var31 + var33;
            int var35 = var4 + var21;
            var3 = var34 ^ var33 << 8;
            var8 = var3 + var24;
            int var36 = var33 + var35;
            var2 = var36 ^ var35 >>> 9;
            var7 = var2 + var27;
            var9 = var8 + var35;
            this.field1146[var12] = var9;
            this.field1146[var12 + 1] = var8;
            this.field1146[var12 + 2] = var7;
            this.field1146[var12 + 3] = var6;
            this.field1146[var12 + 4] = var5;
            this.field1146[var12 + 5] = var4;
            this.field1146[var12 + 6] = var3;
            this.field1146[var12 + 7] = var2;
        }
        this.method607(arg0 + 1746504600);
        this.field1148 = 256;
    }

    @OriginalMember(owner = "client!qca", name = "b", descriptor = "(B)I")
    public final int method613(byte arg0) {
        field1142++;
        if (arg0 >= -1) {
            return -19;
        }
        if (this.field1148 == 0) {
            this.method607(0);
            this.field1148 = 256;
        }
        return this.field1143[this.field1148 - 1];
    }

    @OriginalMember(owner = "client!qca", name = "<init>", descriptor = "()V")
    private class98() {
    }

    @OriginalMember(owner = "client!qca", name = "<init>", descriptor = "([I)V")
    public class98(int[] arg0) {
        this.field1143 = new int[256];
        this.field1146 = new int[256];
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.field1143[var2] = arg0[var2];
        }
        this.method612(-1746504600);
    }

    @OriginalMember(owner = "client!qca", name = "a", descriptor = "(IZZ)V")
    public static final void method614(int arg0, boolean arg1, boolean arg2) {
        field1150++;
        if (arg2) {
            class141.field1734--;
            if (class141.field1734 == 0) {
                class348.field4972 = null;
            }
        }
        if (arg0 != 1) {
            method610();
        }
        if (!arg1) {
            return;
        }
        class364.field5519--;
        if (class364.field5519 == 0) {
            class403.field6100 = null;
            return;
        }
    }
}
