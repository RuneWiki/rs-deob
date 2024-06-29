import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rj")
public class class17 extends class206 {

    @OriginalMember(owner = "client!rj", name = "p", descriptor = "[B")
    public byte[] field218;

    @OriginalMember(owner = "client!rj", name = "I", descriptor = "[I")
    private int[] field237;

    @OriginalMember(owner = "client!rj", name = "H", descriptor = "[S")
    public short[] field236;

    @OriginalMember(owner = "client!rj", name = "D", descriptor = "[Ltd;")
    public class227[] field232;

    @OriginalMember(owner = "client!rj", name = "C", descriptor = "[Lgf;")
    public class7[] field231;

    @OriginalMember(owner = "client!rj", name = "t", descriptor = "[B")
    public byte[] field222;

    @OriginalMember(owner = "client!rj", name = "q", descriptor = "[B")
    public byte[] field219;

    @OriginalMember(owner = "client!rj", name = "w", descriptor = "I")
    public int field225;

    @OriginalMember(owner = "client!rj", name = "s", descriptor = "I")
    public static int field221 = 127;

    @OriginalMember(owner = "client!rj", name = "r", descriptor = "Z")
    public static volatile boolean field220 = false;

    @OriginalMember(owner = "client!rj", name = "E", descriptor = "I")
    public static int field233 = 0;

    @OriginalMember(owner = "client!rj", name = "G", descriptor = "Lwa;")
    public static class75 field235 = class66.method560("Fps:", false);

    @OriginalMember(owner = "client!rj", name = "u", descriptor = "I")
    public static int field223;

    @OriginalMember(owner = "client!rj", name = "v", descriptor = "I")
    public static int field224;

    @OriginalMember(owner = "client!rj", name = "x", descriptor = "I")
    public static int field226;

    @OriginalMember(owner = "client!rj", name = "y", descriptor = "I")
    public static int field227;

    @OriginalMember(owner = "client!rj", name = "z", descriptor = "I")
    public static int field228;

    @OriginalMember(owner = "client!rj", name = "A", descriptor = "I")
    public static int field229;

    @OriginalMember(owner = "client!rj", name = "B", descriptor = "I")
    public static int field230;

    @OriginalMember(owner = "client!rj", name = "F", descriptor = "I")
    public static int field234;

    @OriginalMember(owner = "client!rj", name = "J", descriptor = "I")
    public static int field238;

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(IB)V", line = 37)
    public static final void method98(int arg0, byte arg1) {
        field238++;
        class187.method1416(2);
        if (arg1 != 108) {
            field223 = 21;
        }
        class260.method1859(arg1 ^ 0xFFFFBB48);
        int var2 = class39.method261(arg0, 16).field1746;
        if (var2 == 0) {
            return;
        }
        int var3 = class286.field4920[arg0];
        if (var2 == 6) {
            class270.field4656 = var3;
        }
        if (var2 == 5) {
            class275.field4735 = var3;
        }
        if (var2 == 9) {
            class95.field1540 = var3;
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(B)V", line = 68)
    public final void method99(byte arg0) {
        this.field237 = null;
        field227++;
        if (arg0 != -107) {
            this.field218 = (byte[]) null;
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(Ljava/lang/Throwable;ILjava/lang/String;)V", line = 87)
    public static final void method100(Throwable arg0, int arg1, String arg2) {
        field228++;
        try {
            String var3 = "";
            if (arg0 != null) {
                var3 = class291.method2030(true, arg0);
            }
            if (arg1 != -14020) {
                field235 = (class75) null;
            }
            if (arg2 != null) {
                if (arg0 != null) {
                    var3 = var3 + " | ";
                }
                var3 = var3 + arg2;
            }
            System.out.println("Error: " + var3);
            String var4 = var3.replace(':', '.');
            String var5 = var4.replace('@', '_');
            String var6 = var5.replace('&', '_');
            String var7 = var6.replace('#', '_');
            if (class126.field2193.field2072 == null) {
                return;
            }
            class77 var8 = class126.field2193.method950(new URL(class126.field2193.field2072.getCodeBase(), "clienterror.ws?c=" + class279.field4836 + "&u=" + class166.field2792 + "&v1=" + class124.field2080 + "&v2=" + class124.field2066 + "&e=" + var7), (byte) 127);
            while (var8.field1330 == 0) {
                class235.method1708(88, 1L);
            }
            if (var8.field1330 == 1) {
                DataInputStream var9 = (DataInputStream) var8.field1329;
                var9.read();
                var9.close();
            }
        } catch (Exception var11) {
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(II)Z", line = 138)
    public static final boolean method101(int arg0, int arg1) {
        if (arg1 != 1) {
            method98(23, (byte) -111);
        }
        field234++;
        return (arg0 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(Lfb;[I[BI)Z", line = 151)
    public final boolean method102(class55 arg0, int[] arg1, byte[] arg2, int arg3) {
        field224++;
        boolean var5 = true;
        class227 var6 = null;
        int var7 = 0;
        for (int var8 = 0; var8 < 128; var8++) {
            if (arg2 == null || arg2[var8] != 0) {
                int var9 = this.field237[var8];
                if (var9 != 0) {
                    if (var7 != var9) {
                        var7 = var9--;
                        if ((var9 & 0x1) == 0) {
                            var6 = arg0.method401(arg1, (byte) -99, var9 >> 2);
                        } else {
                            var6 = arg0.method397(arg1, (byte) -70, var9 >> 2);
                        }
                        if (var6 == null) {
                            var5 = false;
                        }
                    }
                    if (var6 != null) {
                        this.field232[var8] = var6;
                        this.field237[var8] = 0;
                    }
                }
            }
        }
        if (arg3 != 29128) {
            this.field225 = -94;
        }
        return var5;
    }

    @OriginalMember(owner = "client!rj", name = "b", descriptor = "(B)V", line = 208)
    public static final void method103(byte arg0) {
        class290.field4981 &= 0x7FF;
        if (arg0 != -127) {
            field221 = 15;
        }
        if (class95.field1547 < 128) {
            class95.field1547 = 128;
        }
        if (class95.field1547 > 383) {
            class95.field1547 = 383;
        }
        field226++;
        int var1 = class190.field3163 >> 7;
        int var2 = 0;
        int var3 = class180.field3026 >> 7;
        int var4 = class32.method217(class190.field3163, class180.field3026, true, class67.field1174);
        if (var1 > 3 && var3 > 3 && var1 < 100 && var3 < 100) {
            for (int var5 = var1 - 4; var5 <= var1 + 4; var5++) {
                for (int var6 = var3 - 4; var6 <= var3 + 4; var6++) {
                    int var7 = class67.field1174;
                    if (var7 < 3 && (class204.field3459[1][var5][var6] & 0x2) == 2) {
                        var7++;
                    }
                    int var8 = var4 - class53.field879[var7][var5][var6];
                    if (var2 < var8) {
                        var2 = var8;
                    }
                }
            }
        }
        int var9 = var2 * 192;
        if (var9 > 98048) {
            var9 = 98048;
        }
        if (var9 < 32768) {
            var9 = 32768;
        }
        if (class73.field1226 < var9) {
            class73.field1226 += (var9 - class73.field1226) / 24;
        } else if (var9 < class73.field1226) {
            class73.field1226 += (var9 - class73.field1226) / 80;
        }
    }

    @OriginalMember(owner = "client!rj", name = "d", descriptor = "(I)V", line = 290)
    public static void method104(int arg0) {
        int var1 = 115 % ((52 - arg0) / 36);
        field235 = null;
    }

    @OriginalMember(owner = "client!rj", name = "e", descriptor = "(I)I", line = 310)
    public static final int method105(int arg0) {
        field230++;
        if (arg0 != 2) {
            method105(22);
        }
        return class203.field3439;
    }

    @OriginalMember(owner = "client!rj", name = "b", descriptor = "(IB)V", line = 321)
    public static final void method106(int arg0, byte arg1) {
        class274.field4730.method1199(arg0, 121);
        field229++;
        int var2 = -15 % ((arg1 + 46) / 45);
    }

    @OriginalMember(owner = "client!rj", name = "<init>", descriptor = "()V", line = 330)
    public class17() {
    }

    @OriginalMember(owner = "client!rj", name = "<init>", descriptor = "([B)V", line = 334)
    public class17(byte[] arg0) {
        this.field218 = new byte[128];
        this.field237 = new int[128];
        this.field236 = new short[128];
        this.field232 = new class227[128];
        this.field231 = new class7[128];
        this.field222 = new byte[128];
        this.field219 = new byte[128];
        class60 var2 = new class60(arg0);
        int var3;
        for (var3 = 0; var2.field997[var2.field1012 + var3] != 0; var3++) {
        }
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < var3; var5++) {
            var4[var5] = var2.method511(-116);
        }
        var2.field1012++;
        var3++;
        int var6 = var2.field1012;
        var2.field1012 += var3;
        int var7;
        for (var7 = 0; var2.field997[var2.field1012 + var7] != 0; var7++) {
        }
        byte[] var8 = new byte[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = var2.method511(-114);
        }
        var2.field1012++;
        int var10 = var2.field1012;
        var7++;
        int var11 = 0;
        var2.field1012 += var7;
        while (var2.field997[var2.field1012 + var11] != 0) {
            var11++;
        }
        byte[] var12 = new byte[var11];
        for (int var13 = 0; var13 < var11; var13++) {
            var12[var13] = var2.method511(-114);
        }
        var11++;
        var2.field1012++;
        byte[] var14 = new byte[var11];
        int var15;
        if (var11 <= 1) {
            var15 = var11;
        } else {
            var14[1] = 1;
            var15 = 2;
            int var16 = 1;
            for (int var17 = 2; var17 < var11; var17++) {
                int var18 = var2.method501(0);
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
        }
        class7[] var19 = new class7[var15];
        for (int var20 = 0; var20 < var19.length; var20++) {
            class7 var21 = var19[var20] = new class7();
            int var22 = var2.method501(0);
            if (var22 > 0) {
                var21.field99 = new byte[var22 * 2];
            }
            int var23 = var2.method501(0);
            if (var23 > 0) {
                var21.field95 = new byte[var23 * 2 + 2];
                var21.field95[1] = 64;
            }
        }
        int var24 = var2.method501(0);
        byte[] var25 = var24 > 0 ? new byte[var24 * 2] : null;
        int var26 = 0;
        int var27 = var2.method501(0);
        byte[] var28 = var27 > 0 ? new byte[var27 * 2] : null;
        while (var2.field997[var2.field1012 + var26] != 0) {
            var26++;
        }
        byte[] var29 = new byte[var26];
        for (int var30 = 0; var30 < var26; var30++) {
            var29[var30] = var2.method511(-118);
        }
        var2.field1012++;
        var26++;
        int var31 = 0;
        for (int var32 = 0; var32 < 128; var32++) {
            var31 += var2.method501(0);
            this.field236[var32] = (short) var31;
        }
        int var33 = 0;
        for (int var34 = 0; var34 < 128; var34++) {
            var33 += var2.method501(0);
            this.field236[var34] = (short) (this.field236[var34] + (var33 << 8));
        }
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        for (int var38 = 0; var38 < 128; var38++) {
            if (var36 == 0) {
                if (var37 >= var29.length) {
                    var36 = -1;
                } else {
                    var36 = var29[var37++];
                }
                var35 = var2.method525(2);
            }
            this.field236[var38] = (short) (this.field236[var38] + class235.method1710(var35 - 1 << 14, 32768));
            this.field237[var38] = var35;
            var36--;
        }
        int var39 = 0;
        int var40 = 0;
        int var41 = 0;
        for (int var42 = 0; var42 < 128; var42++) {
            if (this.field237[var42] != 0) {
                if (var39 == 0) {
                    var41 = var2.field997[var6++] - 1;
                    if (var4.length <= var40) {
                        var39 = -1;
                    } else {
                        var39 = var4[var40++];
                    }
                }
                var39--;
                this.field219[var42] = (byte) var41;
            }
        }
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        for (int var46 = 0; var46 < 128; var46++) {
            if (this.field237[var46] != 0) {
                if (var43 == 0) {
                    if (var44 < var8.length) {
                        var43 = var8[var44++];
                    } else {
                        var43 = -1;
                    }
                    var45 = var2.field997[var10++] + 16 << 2;
                }
                var43--;
                this.field222[var46] = (byte) var45;
            }
        }
        int var47 = 0;
        int var48 = 0;
        class7 var49 = null;
        for (int var50 = 0; var50 < 128; var50++) {
            if (this.field237[var50] != 0) {
                if (var47 == 0) {
                    var49 = var19[var14[var48]];
                    if (var12.length > var48) {
                        var47 = var12[var48++];
                    } else {
                        var47 = -1;
                    }
                }
                this.field231[var50] = var49;
                var47--;
            }
        }
        int var51 = 0;
        int var52 = 0;
        int var53 = 0;
        for (int var54 = 0; var54 < 128; var54++) {
            if (var53 == 0) {
                if (var51 >= var29.length) {
                    var53 = -1;
                } else {
                    var53 = var29[var51++];
                }
                if (this.field237[var54] > 0) {
                    var52 = var2.method501(0) + 1;
                }
            }
            var53--;
            this.field218[var54] = (byte) var52;
        }
        this.field225 = var2.method501(0) + 1;
        for (int var55 = 0; var55 < var15; var55++) {
            class7 var56 = var19[var55];
            if (var56.field99 != null) {
                for (int var57 = 1; var57 < var56.field99.length; var57 += 2) {
                    var56.field99[var57] = var2.method511(-121);
                }
            }
            if (var56.field95 != null) {
                for (int var58 = 3; var58 < (var56.field95.length - 2); var58 += 2) {
                    var56.field95[var58] = var2.method511(-125);
                }
            }
        }
        if (var25 != null) {
            for (int var59 = 1; var59 < var25.length; var59 += 2) {
                var25[var59] = var2.method511(-115);
            }
        }
        if (var28 != null) {
            for (int var60 = 1; var60 < var28.length; var60 += 2) {
                var28[var60] = var2.method511(-116);
            }
        }
        for (int var61 = 0; var61 < var15; var61++) {
            class7 var62 = var19[var61];
            if (var62.field95 != null) {
                int var63 = 0;
                for (int var64 = 2; var64 < var62.field95.length; var64 += 2) {
                    var63 = var2.method501(0) + (var63 + 1);
                    var62.field95[var64] = (byte) var63;
                }
            }
        }
        for (int var65 = 0; var65 < var15; var65++) {
            class7 var66 = var19[var65];
            if (var66.field99 != null) {
                int var67 = 0;
                for (int var68 = 2; var68 < var66.field99.length; var68 += 2) {
                    var67 = var2.method501(0) + var67 + 1;
                    var66.field99[var68] = (byte) var67;
                }
            }
        }
        if (var25 != null) {
            int var69 = var2.method501(0);
            var25[0] = (byte) var69;
            for (int var70 = 2; var70 < var25.length; var70 += 2) {
                var69 += var2.method501(0) + 1;
                var25[var70] = (byte) var69;
            }
            byte var71 = var25[0];
            byte var72 = var25[1];
            for (int var73 = 0; var73 < var71; var73++) {
                this.field218[var73] = (byte) (this.field218[var73] * var72 + 32 >> 6);
            }
            int var74 = 2;
            while (var25.length > var74) {
                byte var75 = var25[var74];
                byte var76 = var25[var74 + 1];
                var74 += 2;
                int var77 = (var75 - var71) / 2 + (var75 - var71) * var72;
                for (int var78 = var71; var78 < var75; var78++) {
                    int var79 = class258.method1838(var77, (byte) -85, var75 - var71);
                    this.field218[var78] = (byte) (this.field218[var78] * var79 + 32 >> 6);
                    var77 += var76 - var72;
                }
                var71 = var75;
                var72 = var76;
            }
            for (int var80 = var71; var80 < 128; var80++) {
                this.field218[var80] = (byte) (this.field218[var80] * var72 + 32 >> 6);
            }
            Object var81 = null;
        }
        if (var28 != null) {
            int var82 = var2.method501(0);
            var28[0] = (byte) var82;
            for (int var83 = 2; var83 < var28.length; var83 += 2) {
                var82 = var82 + var2.method501(0) + 1;
                var28[var83] = (byte) var82;
            }
            byte var84 = var28[0];
            int var85 = var28[1] << 1;
            for (int var86 = 0; var86 < var84; var86++) {
                int var87 = (this.field222[var86] & 0xFF) + var85;
                if (var87 < 0) {
                    var87 = 0;
                }
                if (var87 > 128) {
                    var87 = 128;
                }
                this.field222[var86] = (byte) var87;
            }
            int var88 = 2;
            while (var88 < var28.length) {
                byte var89 = var28[var88];
                int var90 = (var89 - var84) * var85 + ((var89 - var84) / 2);
                int var91 = var28[var88 + 1] << 1;
                for (int var92 = var84; var92 < var89; var92++) {
                    int var93 = class258.method1838(var90, (byte) -100, var89 - var84);
                    var90 += var91 - var85;
                    int var94 = (this.field222[var92] & 0xFF) + var93;
                    if (var94 < 0) {
                        var94 = 0;
                    }
                    if (var94 > 128) {
                        var94 = 128;
                    }
                    this.field222[var92] = (byte) var94;
                }
                var88 += 2;
                var84 = var89;
                var85 = var91;
            }
            for (int var95 = var84; var95 < 128; var95++) {
                int var96 = (this.field222[var95] & 0xFF) + var85;
                if (var96 < 0) {
                    var96 = 0;
                }
                if (var96 > 128) {
                    var96 = 128;
                }
                this.field222[var95] = (byte) var96;
            }
            Object var97 = null;
        }
        for (int var98 = 0; var98 < var15; var98++) {
            var19[var98].field94 = var2.method501(0);
        }
        for (int var99 = 0; var99 < var15; var99++) {
            class7 var100 = var19[var99];
            if (var100.field99 != null) {
                var100.field82 = var2.method501(0);
            }
            if (var100.field95 != null) {
                var100.field88 = var2.method501(0);
            }
            if (var100.field94 > 0) {
                var100.field91 = var2.method501(0);
            }
        }
        for (int var101 = 0; var101 < var15; var101++) {
            var19[var101].field100 = var2.method501(0);
        }
        for (int var102 = 0; var102 < var15; var102++) {
            class7 var103 = var19[var102];
            if (var103.field100 > 0) {
                var103.field85 = var2.method501(0);
            }
        }
        for (int var104 = 0; var104 < var15; var104++) {
            class7 var105 = var19[var104];
            if (var105.field85 > 0) {
                var105.field98 = var2.method501(0);
            }
        }
    }
}
