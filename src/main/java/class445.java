import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jk")
public class class445 extends class439 {

    @OriginalMember(owner = "client!jk", name = "n", descriptor = "[I")
    private int[] field6527;

    @OriginalMember(owner = "client!jk", name = "t", descriptor = "[S")
    public short[] field6533;

    @OriginalMember(owner = "client!jk", name = "r", descriptor = "[B")
    public byte[] field6531;

    @OriginalMember(owner = "client!jk", name = "w", descriptor = "[B")
    public byte[] field6536;

    @OriginalMember(owner = "client!jk", name = "x", descriptor = "[Lbv;")
    public class199[] field6537;

    @OriginalMember(owner = "client!jk", name = "o", descriptor = "[Lmr;")
    public class95[] field6528;

    @OriginalMember(owner = "client!jk", name = "q", descriptor = "[B")
    public byte[] field6530;

    @OriginalMember(owner = "client!jk", name = "C", descriptor = "I")
    public int field6542;

    @OriginalMember(owner = "client!jk", name = "p", descriptor = "I")
    public static int field6529 = 0;

    @OriginalMember(owner = "client!jk", name = "u", descriptor = "I")
    public static int field6534 = 0;

    @OriginalMember(owner = "client!jk", name = "y", descriptor = "I")
    public static int field6538 = 64;

    @OriginalMember(owner = "client!jk", name = "B", descriptor = "Lob;")
    public static class516 field6541 = new class516("", 11);

    @OriginalMember(owner = "client!jk", name = "s", descriptor = "I")
    public static int field6532;

    @OriginalMember(owner = "client!jk", name = "v", descriptor = "I")
    public static int field6535;

    @OriginalMember(owner = "client!jk", name = "z", descriptor = "I")
    public static int field6539;

    @OriginalMember(owner = "client!jk", name = "E", descriptor = "I")
    public static int field6543;

    @OriginalMember(owner = "client!jk", name = "A", descriptor = "Lhh;")
    public static class84 field6540;

    static {
        new class180("You do not have permission to kick users in this channel.", "Du darfst keine Benutzer aus diesem Chatraum rauswerfen.", "Vous n'êtes pas autorisé à expulser des utilisateurs de ce canal.", "Você não tem permissão para expulsar usuários neste canal.");
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(BII)Z", line = 17)
    public static final boolean method2702(byte arg0, int arg1, int arg2) {
        if (arg0 > -42) {
            method2703(41);
        }
        field6539++;
        return class204.method1369(arg2, arg1, (byte) -107) & class398.method2484(arg2, arg1, 127);
    }

    @OriginalMember(owner = "client!jk", name = "c", descriptor = "(I)V", line = 31)
    public static void method2703(int arg0) {
        field6540 = null;
        if (arg0 != 0) {
            field6529 = -81;
        }
        field6541 = null;
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(I[I[BLuh;)Z", line = 47)
    public final boolean method2704(int arg0, int[] arg1, byte[] arg2, class112 arg3) {
        field6543++;
        boolean var5 = true;
        int var6 = 0;
        if (arg0 <= 70) {
            field6541 = null;
        }
        class199 var7 = null;
        for (int var8 = 0; var8 < 128; var8++) {
            if (arg2 == null || arg2[var8] != 0) {
                int var9 = this.field6527[var8];
                if (var9 != 0) {
                    if (var6 != var9) {
                        var6 = var9--;
                        if ((var9 & 0x1) == 0) {
                            var7 = arg3.method831(arg1, true, var9 >> 2);
                        } else {
                            var7 = arg3.method833(var9 >> 2, 8020, arg1);
                        }
                        if (var7 == null) {
                            var5 = false;
                        }
                    }
                    if (var7 != null) {
                        this.field6537[var8] = var7;
                        this.field6527[var8] = 0;
                    }
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!jk", name = "d", descriptor = "(I)V", line = 105)
    public final void method2705(int arg0) {
        this.field6527 = null;
        field6535++;
        if (arg0 != 0) {
            this.method2705(87);
        }
    }

    @OriginalMember(owner = "client!jk", name = "<init>", descriptor = "()V", line = 120)
    public class445() {
    }

    @OriginalMember(owner = "client!jk", name = "<init>", descriptor = "([B)V", line = 125)
    public class445(byte[] arg0) {
        this.field6527 = new int[128];
        this.field6533 = new short[128];
        this.field6531 = new byte[128];
        this.field6536 = new byte[128];
        this.field6537 = new class199[128];
        this.field6528 = new class95[128];
        this.field6530 = new byte[128];
        class303 var2 = new class303(arg0);
        int var3;
        for (var3 = 0; var2.field4326[var2.field4333 + var3] != 0; var3++) {
        }
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < var3; var5++) {
            var4[var5] = var2.method1899((byte) -127);
        }
        var3++;
        var2.field4333++;
        int var6 = var2.field4333;
        var2.field4333 += var3;
        int var7;
        for (var7 = 0; var2.field4326[var2.field4333 + var7] != 0; var7++) {
        }
        byte[] var8 = new byte[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = var2.method1899((byte) 62);
        }
        var7++;
        var2.field4333++;
        int var10 = var2.field4333;
        var2.field4333 += var7;
        int var11;
        for (var11 = 0; var2.field4326[var2.field4333 + var11] != 0; var11++) {
        }
        byte[] var12 = new byte[var11];
        for (int var13 = 0; var13 < var11; var13++) {
            var12[var13] = var2.method1899((byte) 114);
        }
        var11++;
        var2.field4333++;
        byte[] var14 = new byte[var11];
        int var15;
        if (var11 > 1) {
            var14[1] = 1;
            var15 = 2;
            int var16 = 1;
            for (int var17 = 2; var17 < var11; var17++) {
                int var18 = var2.method1918((byte) 117);
                if (var18 == 0) {
                    var16 = var15++;
                } else {
                    if (var16 >= var18) {
                        var18--;
                    }
                    var16 = var18;
                }
                var14[var17] = (byte) var16;
            }
        } else {
            var15 = var11;
        }
        class95[] var19 = new class95[var15];
        for (int var20 = 0; var20 < var19.length; var20++) {
            class95 var103 = var19[var20] = new class95();
            int var104 = var2.method1918((byte) -42);
            if (var104 > 0) {
                var103.field1553 = new byte[var104 * 2];
            }
            int var105 = var2.method1918((byte) 104);
            if (var105 > 0) {
                var103.field1550 = new byte[var105 * 2 + 2];
                var103.field1550[1] = 64;
            }
        }
        int var21 = var2.method1918((byte) 68);
        byte[] var22 = var21 <= 0 ? null : new byte[var21 * 2];
        int var23 = var2.method1918((byte) 87);
        byte[] var24 = var23 > 0 ? new byte[var23 * 2] : null;
        int var25;
        for (var25 = 0; var2.field4326[var2.field4333 + var25] != 0; var25++) {
        }
        byte[] var26 = new byte[var25];
        for (int var27 = 0; var27 < var25; var27++) {
            var26[var27] = var2.method1899((byte) 115);
        }
        var2.field4333++;
        var25++;
        int var28 = 0;
        for (int var29 = 0; var29 < 128; var29++) {
            var28 += var2.method1918((byte) -52);
            this.field6533[var29] = (short) var28;
        }
        int var30 = 0;
        for (int var31 = 0; var31 < 128; var31++) {
            var30 += var2.method1918((byte) -92);
            this.field6533[var31] = (short) (this.field6533[var31] + (var30 << 8));
        }
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        for (int var35 = 0; var35 < 128; var35++) {
            if (var32 == 0) {
                if (var33 >= var26.length) {
                    var32 = -1;
                } else {
                    var32 = var26[var33++];
                }
                var34 = var2.method1911(47);
            }
            this.field6533[var35] = (short) (this.field6533[var35] + class388.method2441(32768, var34 - 1 << 14));
            var32--;
            this.field6527[var35] = var34;
        }
        int var36 = 0;
        int var37 = 0;
        int var38 = 0;
        for (int var39 = 0; var39 < 128; var39++) {
            if (this.field6527[var39] != 0) {
                if (var36 == 0) {
                    if (var37 >= var4.length) {
                        var36 = -1;
                    } else {
                        var36 = var4[var37++];
                    }
                    var38 = var2.field4326[var6++] - 1;
                }
                this.field6530[var39] = (byte) var38;
                var36--;
            }
        }
        int var40 = 0;
        int var41 = 0;
        int var42 = 0;
        for (int var43 = 0; var43 < 128; var43++) {
            if (this.field6527[var43] != 0) {
                if (var40 == 0) {
                    var42 = var2.field4326[var10++] + 16 << 2;
                    if (var8.length > var41) {
                        var40 = var8[var41++];
                    } else {
                        var40 = -1;
                    }
                }
                var40--;
                this.field6531[var43] = (byte) var42;
            }
        }
        int var44 = 0;
        int var45 = 0;
        class95 var46 = null;
        for (int var47 = 0; var47 < 128; var47++) {
            if (this.field6527[var47] != 0) {
                if (var44 == 0) {
                    var46 = var19[var14[var45]];
                    if (var12.length <= var45) {
                        var44 = -1;
                    } else {
                        var44 = var12[var45++];
                    }
                }
                var44--;
                this.field6528[var47] = var46;
            }
        }
        int var48 = 0;
        int var49 = 0;
        int var50 = 0;
        for (int var51 = 0; var51 < 128; var51++) {
            if (var49 == 0) {
                if (var26.length > var48) {
                    var49 = var26[var48++];
                } else {
                    var49 = -1;
                }
                if (this.field6527[var51] > 0) {
                    var50 = var2.method1918((byte) -122) + 1;
                }
            }
            var49--;
            this.field6536[var51] = (byte) var50;
        }
        this.field6542 = var2.method1918((byte) 99) + 1;
        for (int var52 = 0; var52 < var15; var52++) {
            class95 var100 = var19[var52];
            if (var100.field1553 != null) {
                for (int var101 = 1; var101 < var100.field1553.length; var101 += 2) {
                    var100.field1553[var101] = var2.method1899((byte) -89);
                }
            }
            if (var100.field1550 != null) {
                for (int var102 = 3; var102 < (var100.field1550.length - 2); var102 += 2) {
                    var100.field1550[var102] = var2.method1899((byte) -96);
                }
            }
        }
        if (var22 != null) {
            for (int var53 = 1; var53 < var22.length; var53 += 2) {
                var22[var53] = var2.method1899((byte) -86);
            }
        }
        if (var24 != null) {
            for (int var54 = 1; var54 < var24.length; var54 += 2) {
                var24[var54] = var2.method1899((byte) 85);
            }
        }
        for (int var55 = 0; var55 < var15; var55++) {
            class95 var97 = var19[var55];
            if (var97.field1550 != null) {
                int var98 = 0;
                for (int var99 = 2; var99 < var97.field1550.length; var99 += 2) {
                    var98 = var98 + var2.method1918((byte) 110) + 1;
                    var97.field1550[var99] = (byte) var98;
                }
            }
        }
        for (int var56 = 0; var56 < var15; var56++) {
            class95 var94 = var19[var56];
            if (var94.field1553 != null) {
                int var95 = 0;
                for (int var96 = 2; var96 < var94.field1553.length; var96 += 2) {
                    var95 = var95 + var2.method1918((byte) 85) + 1;
                    var94.field1553[var96] = (byte) var95;
                }
            }
        }
        if (var22 != null) {
            int var57 = var2.method1918((byte) -109);
            var22[0] = (byte) var57;
            for (int var58 = 2; var58 < var22.length; var58 += 2) {
                var57 -= -var2.method1918((byte) -86) - 1;
                var22[var58] = (byte) var57;
            }
            byte var59 = var22[0];
            byte var60 = var22[1];
            for (int var61 = 0; var61 < var59; var61++) {
                this.field6536[var61] = (byte) (this.field6536[var61] * var60 + 32 >> 6);
            }
            int var62 = 2;
            while (var62 < var22.length) {
                byte var65 = var22[var62];
                byte var66 = var22[var62 + 1];
                int var67 = (var65 - var59) * var60 + ((var65 - var59) / 2);
                for (int var68 = var59; var68 < var65; var68++) {
                    int var69 = class168.method1194(var67, var65 - var59, 9286);
                    var67 += var66 - var60;
                    this.field6536[var68] = (byte) (this.field6536[var68] * var69 + 32 >> 6);
                }
                var62 += 2;
                var60 = var66;
                var59 = var65;
            }
            for (int var63 = var59; var63 < 128; var63++) {
                this.field6536[var63] = (byte) (this.field6536[var63] * var60 + 32 >> 6);
            }
            Object var64 = null;
        }
        if (var24 != null) {
            int var70 = var2.method1918((byte) -81);
            var24[0] = (byte) var70;
            for (int var71 = 2; var71 < var24.length; var71 += 2) {
                var70 = var2.method1918((byte) -49) + var70 + 1;
                var24[var71] = (byte) var70;
            }
            byte var72 = var24[0];
            int var73 = var24[1] << 1;
            for (int var74 = 0; var74 < var72; var74++) {
                int var85 = (this.field6531[var74] & 0xFF) + var73;
                if (var85 < 0) {
                    var85 = 0;
                }
                if (var85 > 128) {
                    var85 = 128;
                }
                this.field6531[var74] = (byte) var85;
            }
            for (int var75 = 2; var75 < var24.length; var75 += 2) {
                byte var79 = var24[var75];
                int var80 = var24[var75 + 1] << 1;
                int var81 = (var79 - var72) / 2 + (var79 - var72) * var73;
                for (int var82 = var72; var82 < var79; var82++) {
                    int var83 = class168.method1194(var81, var79 - var72, 9286);
                    int var84 = (this.field6531[var82] & 0xFF) + var83;
                    if (var84 < 0) {
                        var84 = 0;
                    }
                    if (var84 > 128) {
                        var84 = 128;
                    }
                    var81 += var80 - var73;
                    this.field6531[var82] = (byte) var84;
                }
                var73 = var80;
                var72 = var79;
            }
            Object var76 = null;
            for (int var77 = var72; var77 < 128; var77++) {
                int var78 = (this.field6531[var77] & 0xFF) + var73;
                if (var78 < 0) {
                    var78 = 0;
                }
                if (var78 > 128) {
                    var78 = 128;
                }
                this.field6531[var77] = (byte) var78;
            }
        }
        for (int var86 = 0; var86 < var15; var86++) {
            var19[var86].field1546 = var2.method1918((byte) 104);
        }
        for (int var87 = 0; var87 < var15; var87++) {
            class95 var93 = var19[var87];
            if (var93.field1553 != null) {
                var93.field1547 = var2.method1918((byte) 117);
            }
            if (var93.field1550 != null) {
                var93.field1548 = var2.method1918((byte) 112);
            }
            if (var93.field1546 > 0) {
                var93.field1551 = var2.method1918((byte) -54);
            }
        }
        for (int var88 = 0; var88 < var15; var88++) {
            var19[var88].field1555 = var2.method1918((byte) -114);
        }
        for (int var89 = 0; var89 < var15; var89++) {
            class95 var92 = var19[var89];
            if (var92.field1555 > 0) {
                var92.field1552 = var2.method1918((byte) 68);
            }
        }
        for (int var90 = 0; var90 < var15; var90++) {
            class95 var91 = var19[var90];
            if (var91.field1552 > 0) {
                var91.field1549 = var2.method1918((byte) 69);
            }
        }
    }
}
