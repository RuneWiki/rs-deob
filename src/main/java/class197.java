import java.io.IOException;
import java.net.Socket;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ov")
public class class197 extends class372 {

    @OriginalMember(owner = "client!ov", name = "E", descriptor = "[[B")
    private byte[][] field3132 = new byte[10][];

    @OriginalMember(owner = "client!ov", name = "D", descriptor = "Lwq;")
    private class176 field3130 = new class176(null);

    @OriginalMember(owner = "client!ov", name = "Q", descriptor = "Lwq;")
    private class176 field3136 = new class176(null);

    @OriginalMember(owner = "client!ov", name = "M", descriptor = "Lgda;")
    private class58 field3131;

    @OriginalMember(owner = "client!ov", name = "H", descriptor = "I")
    private int field3126;

    @OriginalMember(owner = "client!ov", name = "R", descriptor = "[Ljava/lang/String;")
    private static final String[] field3138 = new String[] { method1812(method1811("pM7]]\u007fC\"H")), method1812(method1811("v_'YG:\\?Z\u000f")), method1812(method1811("`M ")), method1812(method1811("uZ~{\u001d")), method1812(method1811("x@1G^4[#")), method1812(method1811("v_'Y\u0015jC#\u0013")), method1812(method1811("nN9")), method1812(method1811(":\\#@O\u007f\u0016")), method1812(method1811("oB*HE")), method1812(method1811("vC7NP~E>")), method1812(method1811("u\\5GFt")), method1812(method1811("tY<E")), method1812(method1811("a\u0002~\u0007H")), method1812(method1811("uZ~\u0015\\tE$\u0017\u001d")), method1812(method1811("uZ~z\u001d")), method1812(method1811("uZ~a\u001d")), method1812(method1811("uZ~}\u001d")) };

    @OriginalMember(owner = "client!ov", name = "L", descriptor = "I")
    public static int field3128 = 0;

    @OriginalMember(owner = "client!ov", name = "K", descriptor = "Lwh;")
    public static class155 field3129 = new class155(2, 2);

    @OriginalMember(owner = "client!ov", name = "I", descriptor = "I")
    public static int field3137 = -1;

    @OriginalMember(owner = "client!ov", name = "J", descriptor = "I")
    public static int field3124;

    @OriginalMember(owner = "client!ov", name = "O", descriptor = "I")
    private int field3125;

    @OriginalMember(owner = "client!ov", name = "N", descriptor = "I")
    public static int field3133;

    @OriginalMember(owner = "client!ov", name = "G", descriptor = "I")
    public static int field3134;

    @OriginalMember(owner = "client!ov", name = "F", descriptor = "Lvb;")
    public static class205 field3135;

    @OriginalMember(owner = "client!ov", name = "P", descriptor = "[I")
    private int[] field3127;

    @OriginalMember(owner = "client!ov", name = "<init>", descriptor = "(ILgda;I)V", line = 5)
    public class197(int arg0, class58 arg1, int arg2) {
        super(arg0);
        try {
            this.field3131 = arg1;
            this.field3126 = arg2;
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field3138[13] + arg0 + ',' + (arg1 == null ? field3138[11] : field3138[12]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!ov", name = "a", descriptor = "(I[B)I", line = 17)
    public final int method1807(int arg0, byte[] arg1) throws IOException {
        try {
            field3124++;
            if (this.field3127 == null) {
                if (!this.field3131.method586(this.field3126, -25034, 0)) {
                    return 0;
                }
                byte[] var3 = this.field3131.method604((byte) 92, 0, this.field3126);
                if (var3 == null) {
                    throw new IllegalStateException("");
                }
                this.field3136.field2805 = var3;
                this.field3136.field2799 = 0;
                int var4 = var3.length >> 1;
                this.field3127 = new int[var4];
                for (int var5 = 0; var5 < var4; var5++) {
                    this.field3127[var5] = this.field3136.method1687((byte) -45);
                }
            }
            if (this.field3127.length <= this.field3125) {
                return -1;
            }
            this.method1810((byte) -112);
            this.field3136.field2805 = arg1;
            this.field3136.field2799 = 0;
            do {
                if (this.field3136.field2805.length <= this.field3136.field2799) {
                    if (arg0 != 2) {
                        method1808(false);
                    }
                    this.field3136.field2805 = null;
                    return arg1.length;
                }
                if (this.field3130.field2805 == null) {
                    if (this.field3132[0] == null) {
                        this.field3136.field2805 = null;
                        return this.field3136.field2799;
                    }
                    this.field3130.field2805 = this.field3132[0];
                }
                int var6 = this.field3136.field2805.length - this.field3136.field2799;
                int var7 = this.field3130.field2805.length - this.field3130.field2799;
                if (var7 > var6) {
                    this.field3130.method1651(this.field3136.field2805, 128, this.field3136.field2799, var6);
                    this.field3136.field2805 = null;
                    return arg1.length;
                }
                this.field3136.method1667(this.field3130.field2799, var7, -109, this.field3130.field2805);
                this.field3130.field2799 = 0;
                this.field3130.field2805 = null;
                this.field3125++;
                for (int var8 = 0; var8 < 9; var8++) {
                    this.field3132[var8] = this.field3132[var8 + 1];
                }
                this.field3132[9] = null;
            } while (this.field3127.length > this.field3125);
            this.field3136.field2805 = null;
            return this.field3136.field2799;
        } catch (RuntimeException var10) {
            throw class590.method4333(var10, field3138[15] + arg0 + ',' + (arg1 == null ? field3138[11] : field3138[12]) + ')');
        }
    }

    @OriginalMember(owner = "client!ov", name = "c", descriptor = "(Z)V", line = 111)
    public static void method1808(boolean arg0) {
        try {
            if (arg0) {
                field3135 = null;
            }
            field3129 = null;
            field3135 = null;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field3138[16] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ov", name = "h", descriptor = "(I)V", line = 131)
    public static final void method1809(int arg0) {
        try {
            field3134++;
            if (class9.field104 != 0 && class9.field104 != 10) {
                try {
                    short var1;
                    if (class570.field8270 == 0) {
                        var1 = 250;
                    } else {
                        var1 = 2000;
                    }
                    if (class327.field5371 && class9.field104 >= 6) {
                        var1 = 6000;
                    }
                    if (class193.field3048 != 2 || class9.field104 != 20 && class632.field9086 != 42) {
                        class68.field965++;
                    }
                    if (class68.field965 > var1) {
                        class683.field9892.method1540(-91);
                        if (class570.field8270 >= 3) {
                            class9.field104 = 0;
                            class252.method2140(-5, -128);
                            return;
                        }
                        if (class193.field3048 == 2) {
                            class640.field9183.method3884(true);
                        } else {
                            class88.field1319.method3884(true);
                        }
                        class9.field104 = 1;
                        class570.field8270++;
                        class68.field965 = 0;
                    }
                    if (class9.field104 == 1) {
                        if (class193.field3048 == 2) {
                            class683.field9892.field2647 = class640.field9183.method3887(class393.field6256, arg0 ^ 0xFFFF99BA);
                        } else {
                            class683.field9892.field2647 = class88.field1319.method3887(class393.field6256, 32380);
                        }
                        class9.field104 = 2;
                    }
                    if (class9.field104 == 2) {
                        if (class683.field9892.field2647.field3402 == 2) {
                            throw new IOException();
                        }
                        if (class683.field9892.field2647.field3402 != 1) {
                            return;
                        }
                        class683.field9892.field2644 = class523.method3912(15000, (Socket) class683.field9892.field2647.field3407, 0);
                        class683.field9892.field2647 = null;
                        class683.field9892.method1544((byte) 43);
                        class487 var2 = class411.method3295(false);
                        if (class327.field5371) {
                            var2.field7362.method1678(class245.field3790.field3568, 65280);
                            var2.field7362.method1650((byte) -95, 0);
                            int var3 = var2.field7362.field2799;
                            var2.field7362.method1641((byte) -108, 656);
                            if (class193.field3048 == 2) {
                                var2.field7362.method1678(class315.field5127 == 14 ? 1 : 0, 65280);
                            }
                            class176 var4 = class471.method3622(1);
                            var4.method1678(class222.field3490, 65280);
                            var4.method1650((byte) -95, (int) (Math.random() * 9.9999999E7D));
                            var4.method1678(class795.field11624, arg0 ^ 0xFFFF18C6);
                            var4.method1641((byte) -108, class734.field10757);
                            for (int var5 = 0; var5 < 6; var5++) {
                                var4.method1641((byte) -108, (int) (Math.random() * 9.9999999E7D));
                            }
                            var4.method1683(class648.field9292, 109);
                            var4.method1678(class305.field4924.field8482, arg0 + 71482);
                            var4.method1678((int) (Math.random() * 9.9999999E7D), arg0 + 71482);
                            var4.method1659(arg0 + 6202, class85.field1279, class326.field5328);
                            var2.field7362.method1667(0, var4.field2799, 96, var4.field2805);
                            var2.field7362.method1662(arg0 ^ 0xFFFFE7CE, var2.field7362.field2799 - var3);
                        } else {
                            var2.field7362.method1678(class245.field3774.field3568, 65280);
                        }
                        class683.field9892.method1546(var2, 1);
                        class683.field9892.method1545(86);
                        class9.field104 = 3;
                    }
                    if (class9.field104 == 3) {
                        if (!class683.field9892.field2644.method2171((byte) -90, 1)) {
                            return;
                        }
                        class683.field9892.field2644.method2172(class683.field9892.field2660.field2805, -16392, 1, 0);
                        int var6 = class683.field9892.field2660.field2805[0] & 0xFF;
                        if (var6 != 0) {
                            class9.field104 = 0;
                            class252.method2140(var6, -128);
                            class683.field9892.method1540(arg0 ^ 0x184A);
                            class796.method5715((byte) 114);
                            return;
                        }
                        if (class327.field5371) {
                            class9.field104 = 4;
                        } else {
                            class9.field104 = 8;
                        }
                    }
                    if (class9.field104 == 4) {
                        if (!class683.field9892.field2644.method2171((byte) -115, 2)) {
                            return;
                        }
                        class683.field9892.field2644.method2172(class683.field9892.field2660.field2805, -16392, 2, 0);
                        class683.field9892.field2660.field2799 = 0;
                        class683.field9892.field2660.field2799 = class683.field9892.field2660.method1687((byte) -115);
                        class9.field104 = 5;
                    }
                    if (class9.field104 == 5) {
                        if (!class683.field9892.field2644.method2171((byte) -127, class683.field9892.field2660.field2799)) {
                            return;
                        }
                        class683.field9892.field2644.method2172(class683.field9892.field2660.field2805, -16392, class683.field9892.field2660.field2799, 0);
                        class683.field9892.field2660.method1624(class717.field10467, (byte) -79);
                        class683.field9892.field2660.field2799 = 0;
                        String var7 = class683.field9892.field2660.method1629(0);
                        class683.field9892.field2660.field2799 = 0;
                        String var8 = field3138[10];
                        if (!class40.field466 || class360.method2976(true, var7, var8, 1, class393.field6256).field3402 == 2) {
                            class115.method1143(var7, class393.field6256, class623.field8996.field6379.method4132(true) == 1, (byte) -106, true, var8);
                        }
                        class9.field104 = 6;
                    }
                    if (class9.field104 == 6) {
                        if (!class683.field9892.field2644.method2171((byte) -124, 1)) {
                            return;
                        }
                        class683.field9892.field2644.method2172(class683.field9892.field2660.field2805, -16392, 1, 0);
                        if ((class683.field9892.field2660.field2805[0] & 0xFF) == 1) {
                            class9.field104 = 7;
                        }
                    }
                    if (class9.field104 == 7) {
                        if (!class683.field9892.field2644.method2171((byte) -117, 16)) {
                            return;
                        }
                        class683.field9892.field2644.method2172(class683.field9892.field2660.field2805, -16392, 16, 0);
                        class683.field9892.field2660.field2799 = 16;
                        class683.field9892.field2660.method1624(class717.field10467, (byte) -79);
                        class683.field9892.field2660.field2799 = 0;
                        class89.field1328 = class748.field11039 = class566.method4161(class683.field9892.field2660.method1658(arg0 - 18660), -15453);
                        class748.field11043 = class683.field9892.field2660.method1658(-24862);
                        class9.field104 = 8;
                    }
                    if (class9.field104 == 8) {
                        class683.field9892.field2660.field2799 = 0;
                        class683.field9892.method1544((byte) 43);
                        class487 var9 = class411.method3295(false);
                        class117 var10 = var9.field7362;
                        if (class193.field3048 == 2) {
                            class230 var11;
                            if (class327.field5371) {
                                var11 = class245.field3791;
                            } else {
                                var11 = class245.field3780;
                            }
                            var10.method1678(var11.field3568, 65280);
                            var10.method1650((byte) -95, 0);
                            int var12 = var10.field2799;
                            int var13 = var10.field2799;
                            if (!class327.field5371) {
                                var10.method1641((byte) -108, 656);
                                var10.method1678(class315.field5127 == 14 ? 1 : 0, 65280);
                                int var14 = var10.field2799;
                                class176 var15 = class748.method5439(arg0 + 6192);
                                var10.method1667(0, var15.field2799, arg0 + 6089, var15.field2805);
                                var13 = var10.field2799;
                                var10.method1681(class89.field1328, 23137);
                            }
                            var10.method1678(class42.field477, 65280);
                            var10.method1678(class466.method3598(arg0 + 6203), 65280);
                            var10.method1650((byte) -95, class64.field881);
                            var10.method1650((byte) -95, class333.field5444);
                            var10.method1678(class623.field8996.field6352.method3687(true), arg0 + 71482);
                            class647.method4712(arg0 + 30561, var10);
                            var10.method1681(class431.field6777, 23137);
                            var10.method1641((byte) -108, class734.field10757);
                            class176 var16 = class623.field8996.method3241(-2);
                            var10.method1678(var16.field2799, 65280);
                            var10.method1667(0, var16.field2799, arg0 + 6090, var16.field2805);
                            class746.field10999 = true;
                            class176 var17 = new class176(class372.field6038.method5434(-19));
                            class372.field6038.method5431(20, var17);
                            var10.method1667(0, var17.field2805.length, 117, var17.field2805);
                            var10.method1641((byte) -108, class765.field11213);
                            var10.method1683(class596.field8629, 123);
                            var10.method1678(class595.field8593 == null ? 0 : 1, 65280);
                            if (class595.field8593 != null) {
                                var10.method1681(class595.field8593, 23137);
                            }
                            var10.method1678(class389.method3167(field3138[0], -38) ? 1 : 0, 65280);
                            var10.method1678(class40.field466 ? 1 : 0, 65280);
                            class464.method3584(13309, var10);
                            var10.method1679(class717.field10467, var13, var10.field2799, -612867131);
                            var10.method1662(8, var10.field2799 - var12);
                        } else {
                            class230 var18;
                            if (class327.field5371) {
                                var18 = class245.field3791;
                            } else {
                                var18 = class245.field3783;
                            }
                            var10.method1678(var18.field3568, 65280);
                            var10.method1650((byte) -95, 0);
                            int var19 = var10.field2799;
                            int var20 = var10.field2799;
                            if (!class327.field5371) {
                                var10.method1641((byte) -108, 656);
                                class176 var21 = class748.method5439(-10);
                                var10.method1667(0, var21.field2799, 96, var21.field2805);
                                var20 = var10.field2799;
                                var10.method1681(class89.field1328, 23137);
                            }
                            var10.method1678(class305.field4924.field8482, 65280);
                            var10.method1678(class795.field11624, 65280);
                            class647.method4712(24359, var10);
                            var10.method1681(class431.field6777, 23137);
                            var10.method1641((byte) -108, class734.field10757);
                            class464.method3584(13309, var10);
                            var10.method1679(class717.field10467, var20, var10.field2799, arg0 - 612860929);
                            var10.method1662(8, var10.field2799 - var19);
                        }
                        class683.field9892.method1546(var9, 1);
                        class683.field9892.method1545(87);
                        class683.field9892.field2659 = new class296(class717.field10467);
                        for (int var22 = 0; var22 < 4; var22++) {
                            class717.field10467[var22] += 50;
                        }
                        class683.field9892.field2660.method1165(class717.field10467, (byte) -127);
                        class717.field10467 = null;
                        class9.field104 = 9;
                    }
                    if (class9.field104 == 9) {
                        if (!class683.field9892.field2644.method2171((byte) -99, 1)) {
                            return;
                        }
                        class683.field9892.field2644.method2172(class683.field9892.field2660.field2805, -16392, 1, 0);
                        int var23 = class683.field9892.field2660.field2805[0] & 0xFF;
                        if (var23 == 21) {
                            class9.field104 = 12;
                        } else if (var23 == 29 || var23 == 45) {
                            class742.field10922 = var23;
                            class9.field104 = 18;
                        } else if (var23 == 1) {
                            class9.field104 = 10;
                            class252.method2140(var23, -128);
                            return;
                        } else if (var23 == 2) {
                            class9.field104 = 13;
                        } else if (var23 == 15) {
                            class9.field104 = 19;
                            class683.field9892.field2663 = -2;
                        } else if (var23 == 23 && class570.field8270 < 3) {
                            class9.field104 = 1;
                            class570.field8270++;
                            class68.field965 = 0;
                            class683.field9892.field2644.method2170(arg0 + 6088);
                            class683.field9892.field2644 = null;
                            return;
                        } else if (var23 == 42) {
                            class9.field104 = 20;
                            class252.method2140(var23, arg0 ^ 0x1846);
                            return;
                        } else if (!class374.field6060 || class327.field5371 || class222.field3490 == -1 || var23 != 35) {
                            class9.field104 = 0;
                            class252.method2140(var23, -128);
                            class683.field9892.field2644.method2170(-128);
                            class683.field9892.field2644 = null;
                            class796.method5715((byte) 116);
                            return;
                        } else {
                            class9.field104 = 1;
                            class68.field965 = 0;
                            class327.field5371 = true;
                            class683.field9892.field2644.method2170(-123);
                            class683.field9892.field2644 = null;
                            return;
                        }
                    }
                    if (class9.field104 == 11) {
                        class683.field9892.method1544((byte) 43);
                        class487 var24 = class411.method3295(false);
                        class117 var25 = var24.field7362;
                        var25.method1155(arg0 ^ 0x1846, class683.field9892.field2659);
                        var25.method1154(class245.field3787.field3568, 2);
                        class683.field9892.method1546(var24, 1);
                        class683.field9892.method1545(96);
                        class9.field104 = 9;
                    } else if (class9.field104 != 12) {
                        if (arg0 != -6202) {
                            field3128 = 40;
                        }
                        if (class9.field104 == 20) {
                            if (class683.field9892.field2644.method2171((byte) -91, 2)) {
                                class683.field9892.field2644.method2172(class683.field9892.field2660.field2805, arg0 ^ 0x583E, 2, 0);
                                class705.field10118 = (class683.field9892.field2660.field2805[0] & 0xFF << 8) + (class683.field9892.field2660.field2805[1] & 0xFF);
                                class9.field104 = 9;
                            }
                        } else if (class9.field104 == 18) {
                            if (class683.field9892.field2644.method2171((byte) -94, 1)) {
                                class683.field9892.field2644.method2172(class683.field9892.field2660.field2805, -16392, 1, 0);
                                class539.field7917 = class683.field9892.field2660.field2805[0] & 0xFF;
                                class9.field104 = 0;
                                class252.method2140(class742.field10922, -128);
                                class683.field9892.field2644.method2170(-122);
                                class683.field9892.field2644 = null;
                                class796.method5715((byte) 120);
                            }
                        } else if (class9.field104 != 13) {
                            if (class9.field104 == 14) {
                                class117 var27 = class683.field9892.field2660;
                                if (class193.field3048 == 2) {
                                    if (!class683.field9892.field2644.method2171((byte) -99, class97.field1435)) {
                                        return;
                                    }
                                    class683.field9892.field2644.method2172(var27.field2805, -16392, class97.field1435, 0);
                                    var27.field2799 = 0;
                                    class264.field4283 = var27.method1645((byte) -76);
                                    class482.field7330 = var27.method1645((byte) -113);
                                    class211.field3348 = var27.method1645((byte) -91) == 1;
                                    class16.field181 = var27.method1645((byte) -124) == 1;
                                    class451.field6985 = var27.method1645((byte) -70) == 1;
                                    class127.field1836 = var27.method1645((byte) -118) == 1;
                                    class356.field5733 = var27.method1687((byte) -43);
                                    class229.field3564 = var27.method1645((byte) -122) == 1;
                                    class321.field5220 = var27.method1623(arg0 + 6457);
                                    class115.field1686 = var27.method1645((byte) -95) == 1;
                                    class370.field5999.method4004(class115.field1686, (byte) -32);
                                    class229.field3563.method530((byte) -125, class115.field1686);
                                    class395.field6267.method3134(class115.field1686, (byte) -93);
                                } else if (class683.field9892.field2644.method2171((byte) -99, class97.field1435)) {
                                    class683.field9892.field2644.method2172(var27.field2805, -16392, class97.field1435, 0);
                                    var27.field2799 = 0;
                                    class264.field4283 = var27.method1645((byte) -103);
                                    class482.field7330 = var27.method1645((byte) -72);
                                    class211.field3348 = var27.method1645((byte) -115) == 1;
                                    class16.field181 = var27.method1645((byte) -99) == 1;
                                    class451.field6985 = var27.method1645((byte) -119) == 1;
                                    class269.field4331 = var27.method1658(-24862);
                                    class131.field1861 = -class712.method5167(-2334) + (class269.field4331 - var27.method1665(1879634592));
                                    int var28 = var27.method1645((byte) -124);
                                    class229.field3564 = (var28 & 0x1) != 0;
                                    class361.field5827 = (var28 & 0x2) != 0;
                                    class227.field3550 = var27.method1622(arg0 ^ 0x512E);
                                    class663.field9440 = var27.method1645((byte) -100) == 1;
                                    class731.field10703 = var27.method1622(arg0 - 12510);
                                    class368.field5981 = var27.method1687((byte) -127);
                                    class617.field8916 = var27.method1687((byte) -108);
                                    class468.field7181 = var27.method1687((byte) -74);
                                    class739.field10876 = var27.method1622(-18712);
                                    class757.field11118 = class393.field6256.method644(0, class739.field10876);
                                    class108.field1538 = var27.method1645((byte) -107);
                                    class684.field9899 = var27.method1687((byte) -87);
                                    class124.field1810 = var27.method1687((byte) -50);
                                    class157.field2170 = var27.method1645((byte) -88) == 1;
                                    class438.field6846.field10821 = class438.field6846.field10813 = class740.field10907 = var27.method1629(0);
                                    class459.field7077 = var27.method1645((byte) -93);
                                    class614.field8820 = var27.method1622(-18712);
                                    class647.field9284 = var27.method1645((byte) -122) == 1;
                                    class530.field7797 = new class518();
                                    class530.field7797.field7676 = var27.method1687((byte) -78);
                                    if (class530.field7797.field7676 == 65535) {
                                        class530.field7797.field7676 = -1;
                                    }
                                    class530.field7797.field7671 = var27.method1629(0);
                                    if (class710.field10281 != class417.field6596) {
                                        class530.field7797.field7675 = class530.field7797.field7676 + 40000;
                                        class530.field7797.field7674 = class530.field7797.field7676 + 50000;
                                    }
                                    if (class495.field7438 != class417.field6596 && (class545.field8024 != class417.field6596 || class264.field4283 < 2) && (class640.field9183.method3886(class13.field156, (byte) -82) || class640.field9183.method3886(class492.field7415, (byte) -81))) {
                                        class355.method2940(arg0 ^ 0x6F0A);
                                    }
                                } else {
                                    return;
                                }
                                if ((!class211.field3348 || class451.field6985) && !class229.field3564) {
                                    try {
                                        class470.method3617((byte) 9, class476.field7255, field3138[8]);
                                    } catch (Throwable var34) {
                                    }
                                } else {
                                    try {
                                        class470.method3617((byte) -116, class476.field7255, field3138[2]);
                                    } catch (Throwable var36) {
                                        if (class768.field11245) {
                                            try {
                                                class476.field7255.getAppletContext().showDocument(new URL(class476.field7255.getCodeBase(), field3138[4]), field3138[6]);
                                            } catch (Exception var35) {
                                            }
                                        }
                                    }
                                }
                                if (class710.field10281 == class417.field6596) {
                                    try {
                                        class470.method3617((byte) -112, class476.field7255, field3138[9]);
                                    } catch (Throwable var33) {
                                    }
                                }
                                if (class193.field3048 != 2) {
                                    class9.field104 = 0;
                                    class252.method2140(2, -128);
                                    class622.method4545(86);
                                    class302.method2598(7, -3);
                                    class683.field9892.field2670 = null;
                                    return;
                                }
                                class9.field104 = 16;
                            }
                            if (class9.field104 == 16) {
                                if (!class683.field9892.field2644.method2171((byte) -88, 3)) {
                                    return;
                                }
                                class683.field9892.field2644.method2172(class683.field9892.field2660.field2805, -16392, 3, 0);
                                class9.field104 = 17;
                            }
                            if (class9.field104 == 17) {
                                class117 var29 = class683.field9892.field2660;
                                var29.field2799 = 0;
                                if (var29.method1157(arg0 ^ 0xC59DA94E)) {
                                    if (!class683.field9892.field2644.method2171((byte) -94, 1)) {
                                        return;
                                    }
                                    class683.field9892.field2644.method2172(var29.field2805, -16392, 1, 3);
                                }
                                class683.field9892.field2670 = class787.method5656((byte) -58)[var29.method1158(-117)];
                                class683.field9892.field2663 = var29.method1687((byte) -96);
                                class9.field104 = 15;
                            }
                            if (class9.field104 == 15) {
                                if (class683.field9892.field2644.method2171((byte) -117, class683.field9892.field2663)) {
                                    class683.field9892.field2644.method2172(class683.field9892.field2660.field2805, -16392, class683.field9892.field2663, 0);
                                    class683.field9892.field2660.field2799 = 0;
                                    int var30 = class683.field9892.field2663;
                                    class9.field104 = 0;
                                    class252.method2140(2, arg0 ^ 0x1846);
                                    class648.method4723(arg0 ^ 0xFFFFE7A4);
                                    class715.method5181(class683.field9892.field2660, -4);
                                    class586.field8499 = -1;
                                    if (class181.field2886 == class683.field9892.field2670) {
                                        class768.method5533((byte) 46);
                                    } else {
                                        class32.method335(83);
                                    }
                                    if (class683.field9892.field2660.field2799 != var30) {
                                        throw new RuntimeException(field3138[5] + class683.field9892.field2660.field2799 + field3138[7] + var30);
                                    }
                                    class683.field9892.field2670 = null;
                                }
                            } else if (class9.field104 == 19) {
                                if (class683.field9892.field2663 == -2) {
                                    if (!class683.field9892.field2644.method2171((byte) -94, 2)) {
                                        return;
                                    }
                                    class683.field9892.field2644.method2172(class683.field9892.field2660.field2805, -16392, 2, 0);
                                    class683.field9892.field2660.field2799 = 0;
                                    class683.field9892.field2663 = class683.field9892.field2660.method1687((byte) -49);
                                }
                                if (class683.field9892.field2644.method2171((byte) -123, class683.field9892.field2663)) {
                                    class683.field9892.field2644.method2172(class683.field9892.field2660.field2805, -16392, class683.field9892.field2663, 0);
                                    class683.field9892.field2660.field2799 = 0;
                                    int var31 = class683.field9892.field2663;
                                    class9.field104 = 0;
                                    class252.method2140(15, -128);
                                    class101.method952(-1);
                                    class715.method5181(class683.field9892.field2660, -4);
                                    if (class683.field9892.field2660.field2799 != var31) {
                                        throw new RuntimeException(field3138[1] + class683.field9892.field2660.field2799 + field3138[7] + var31);
                                    }
                                    class683.field9892.field2670 = null;
                                }
                            }
                        } else if (class683.field9892.field2644.method2171((byte) -123, 1)) {
                            class683.field9892.field2644.method2172(class683.field9892.field2660.field2805, arg0 ^ 0x583E, 1, 0);
                            class9.field104 = 14;
                            class97.field1435 = class683.field9892.field2660.field2805[0] & 0xFF;
                        }
                    } else if (class683.field9892.field2644.method2171((byte) -94, 1)) {
                        class683.field9892.field2644.method2172(class683.field9892.field2660.field2805, arg0 ^ 0x583E, 1, 0);
                        int var26 = class683.field9892.field2660.field2805[0] & 0xFF;
                        class9.field104 = 0;
                        class293.field4705 = var26 * 50;
                        class252.method2140(21, -128);
                        class683.field9892.field2644.method2170(-124);
                        class683.field9892.field2644 = null;
                        class796.method5715((byte) 112);
                    }
                } catch (IOException var37) {
                    class683.field9892.method1540(-98);
                    if (class570.field8270 < 3) {
                        if (class193.field3048 == 2) {
                            class640.field9183.method3884(true);
                        } else {
                            class88.field1319.method3884(true);
                        }
                        class570.field8270++;
                        class9.field104 = 1;
                        class68.field965 = 0;
                    } else {
                        class9.field104 = 0;
                        class252.method2140(-4, -128);
                        class796.method5715((byte) 124);
                    }
                }
            }
        } catch (RuntimeException var38) {
            throw class590.method4333(var38, field3138[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ov", name = "e", descriptor = "(B)V", line = 878)
    public final void method1810(byte arg0) {
        try {
            if (arg0 != -112) {
                this.field3126 = 66;
            }
            field3133++;
            if (this.field3127 != null) {
                for (int var2 = 0; var2 < 10; var2++) {
                    if (this.field3125 + var2 >= this.field3127.length) {
                        return;
                    }
                    if (this.field3132[var2] == null && this.field3131.method586(this.field3127[this.field3125 + var2], -25034, 0)) {
                        this.field3132[var2] = this.field3131.method604((byte) -128, 0, this.field3127[this.field3125 + var2]);
                    }
                }
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field3138[14] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ov", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1811(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x35);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!ov", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1812(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 26;
                    break;
                case 1:
                    var10005 = 44;
                    break;
                case 2:
                    var10005 = 80;
                    break;
                case 3:
                    var10005 = 41;
                    break;
                default:
                    var10005 = 53;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
