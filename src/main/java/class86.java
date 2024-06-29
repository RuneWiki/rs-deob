import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ig")
public class class86 {

    @OriginalMember(owner = "client!ig", name = "h", descriptor = "Loe;")
    public static class139 field1701 = new class139(260);

    @OriginalMember(owner = "client!ig", name = "u", descriptor = "Ljd;")
    public static class92 field1714 = null;

    @OriginalMember(owner = "client!ig", name = "x", descriptor = "Ljd;")
    private static class92 field1717 = class202.method1325((byte) 90, "Please reload this page)3");

    @OriginalMember(owner = "client!ig", name = "m", descriptor = "Ljd;")
    public static class92 field1706 = field1717;

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "I")
    public static int field1694;

    @OriginalMember(owner = "client!ig", name = "b", descriptor = "I")
    public static int field1695;

    @OriginalMember(owner = "client!ig", name = "c", descriptor = "I")
    public static int field1696;

    @OriginalMember(owner = "client!ig", name = "d", descriptor = "I")
    public static int field1697;

    @OriginalMember(owner = "client!ig", name = "g", descriptor = "I")
    public static int field1700;

    @OriginalMember(owner = "client!ig", name = "j", descriptor = "I")
    public static int field1703;

    @OriginalMember(owner = "client!ig", name = "k", descriptor = "I")
    public static int field1704;

    @OriginalMember(owner = "client!ig", name = "l", descriptor = "I")
    public static int field1705;

    @OriginalMember(owner = "client!ig", name = "n", descriptor = "I")
    public static int field1707;

    @OriginalMember(owner = "client!ig", name = "o", descriptor = "I")
    public static int field1708;

    @OriginalMember(owner = "client!ig", name = "p", descriptor = "I")
    public static int field1709;

    @OriginalMember(owner = "client!ig", name = "q", descriptor = "I")
    private int field1710;

    @OriginalMember(owner = "client!ig", name = "r", descriptor = "I")
    public static int field1711;

    @OriginalMember(owner = "client!ig", name = "v", descriptor = "I")
    public static int field1715;

    @OriginalMember(owner = "client!ig", name = "w", descriptor = "I")
    public static int field1716;

    @OriginalMember(owner = "client!ig", name = "f", descriptor = "J")
    private long field1699;

    @OriginalMember(owner = "client!ig", name = "i", descriptor = "J")
    private long field1702;

    @OriginalMember(owner = "client!ig", name = "t", descriptor = "Z")
    public boolean field1713;

    @OriginalMember(owner = "client!ig", name = "e", descriptor = "[I")
    private int[] field1698;

    @OriginalMember(owner = "client!ig", name = "s", descriptor = "[I")
    private int[] field1712;

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(Lh;I)V")
    public final void method570(class70 arg0, int arg1) {
        field1705++;
        arg0.method428(this.field1713 ? 1 : 0, 126);
        for (int var3 = 0; var3 < 7; var3++) {
            int var6 = this.field1712[class59.field1224[var3]];
            if ((var6 & Integer.MIN_VALUE) == 0) {
                arg0.method458(65535, 9345);
            } else {
                arg0.method458(var6 & 0x3FFFFFFF, 9345);
            }
        }
        int var4 = -23 / ((arg1 + 45) / 43);
        for (int var5 = 0; var5 < 5; var5++) {
            arg0.method428(this.field1698[var5], 103);
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(BZ)V")
    public final void method571(byte arg0, boolean arg1) {
        field1716++;
        if (arg0 == 93) {
            this.field1713 = arg1;
            this.method577(false);
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(Lca;ZI)Ldg;")
    public final class38 method572(class22 arg0, boolean arg1, int arg2) {
        field1711++;
        if (arg1) {
            return null;
        } else if (this.field1710 == -1) {
            class38 var4 = (class38) class158.field3136.method930(66, this.field1702);
            if (var4 == null) {
                boolean var5 = false;
                for (int var6 = 0; var6 < 12; var6++) {
                    int var15 = this.field1712[var6];
                    if ((var15 & 0x40000000) == 0) {
                        if ((Integer.MIN_VALUE & var15) != 0 && !class89.method590(3, var15 & 0x3FFFFFFF).method68(-119)) {
                            var5 = true;
                        }
                    } else if (!class92.method626((byte) 59, var15 & 0x3FFFFFFF).method733(this.field1713, false)) {
                        var5 = true;
                    }
                }
                if (var5) {
                    return null;
                }
                int var7 = 0;
                class57[] var8 = new class57[12];
                for (int var9 = 0; var9 < 12; var9++) {
                    int var12 = this.field1712[var9];
                    if ((var12 & 0x40000000) != 0) {
                        class57 var13 = class92.method626((byte) 59, var12 & 0x3FFFFFFF).method728(this.field1713, -12606);
                        if (var13 != null) {
                            var8[var7++] = var13;
                        }
                    } else if ((Integer.MIN_VALUE & var12) != 0) {
                        class57 var14 = class89.method590(3, var12 & 0x3FFFFFFF).method69(true);
                        if (var14 != null) {
                            var8[var7++] = var14;
                        }
                    }
                }
                class57 var10 = new class57(var8, var7);
                for (int var11 = 0; var11 < 5; var11++) {
                    if (this.field1698[var11] < class207.field3985[var11].length) {
                        var10.method349(class118.field2385[var11], class207.field3985[var11][this.field1698[var11]]);
                    }
                    if (this.field1698[var11] < class40.field908[var11].length) {
                        var10.method349(class88.field1743[var11], class40.field908[var11][this.field1698[var11]]);
                    }
                }
                var4 = var10.method345(64, 768, -50, -10, -50, true, true);
                class158.field3136.method927(24744, var4, this.field1702);
            }
            if (arg0 != null) {
                var4 = arg0.method141((byte) 126, arg2, var4);
            }
            return var4;
        } else {
            return class117.method786((byte) 120, this.field1710).method683(arg2, -1, arg0);
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(ZII)V")
    public final void method573(boolean arg0, int arg1, int arg2) {
        field1696++;
        if (arg1 == 1 && this.field1713) {
            return;
        }
        int var4 = this.field1712[class59.field1224[arg1]];
        if (arg2 < 0 || var4 == 0) {
            return;
        }
        int var5 = var4 & 0x3FFFFFFF;
        class10 var6;
        do {
            if (arg0) {
                var5++;
                if (var5 >= class146.field2899) {
                    var5 = 0;
                }
            } else {
                var5--;
                if (var5 < 0) {
                    var5 = class146.field2899 - 1;
                }
            }
            var6 = class89.method590(3, var5);
        } while (var6 == null || var6.field355 || var6.field353 != (this.field1713 ? 7 : 0) + arg1);
        this.field1712[class59.field1224[arg1]] = class67.method396(Integer.MIN_VALUE, var5);
        this.method577(false);
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(BIZ)V")
    public final void method574(byte arg0, int arg1, boolean arg2) {
        field1707++;
        int var4 = this.field1698[arg1];
        if (arg2) {
            var4++;
            if (class207.field3985[arg1].length <= var4) {
                var4 = 0;
            }
        } else {
            var4--;
            if (var4 < 0) {
                var4 = class207.field3985[arg1].length - 1;
            }
        }
        this.field1698[arg1] = var4;
        this.method577(false);
        if (arg0 != -14) {
            this.method570(null, 32);
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(BLnh;Lnh;)I")
    public static final int method575(byte arg0, class133 arg1, class133 arg2) {
        int var3 = 0;
        field1704++;
        if (arg2.method885(-2, class47.field1026)) {
            var3++;
        }
        if (arg1.method885(-2, class209.field4017)) {
            var3++;
        }
        if (arg1.method885(arg0 ^ 0x41, class81.field1633)) {
            var3++;
        }
        if (arg1.method885(arg0 ^ 0x41, class208.field3998)) {
            var3++;
        }
        if (arg1.method885(-2, class107.field2204)) {
            var3++;
        }
        if (arg1.method885(-2, class80.field1628)) {
            var3++;
        }
        if (arg0 != -65) {
            return 24;
        }
        arg1.method885(-2, class89.field1761);
        arg1.method885(-2, class40.field906);
        arg1.method885(arg0 ^ 0x41, class4.field265);
        arg1.method885(-2, class133.field2651);
        arg1.method885(-2, class156.field3109);
        return var3;
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(III)V")
    public final void method576(int arg0, int arg1, int arg2) {
        this.field1698[arg2] = arg1;
        this.method577(false);
        field1694++;
        if (arg0 != 0) {
            this.method573(true, -69, -56);
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(Z)V")
    private final void method577(boolean arg0) {
        field1700++;
        long var2 = this.field1702;
        this.field1702 = -1L;
        long[] var4 = class21.field499;
        if (arg0) {
            return;
        }
        for (int var5 = 0; var5 < 12; var5++) {
            this.field1702 = this.field1702 >>> 8 ^ var4[(int) (((long) (this.field1712[var5] >> 24) ^ this.field1702) & 0xFFL)];
            this.field1702 = this.field1702 >>> 8 ^ var4[(int) ((this.field1702 ^ (long) (this.field1712[var5] >> 16)) & 0xFFL)];
            this.field1702 = var4[(int) ((this.field1702 ^ (long) (this.field1712[var5] >> 8)) & 0xFFL)] ^ this.field1702 >>> 8;
            this.field1702 = this.field1702 >>> 8 ^ var4[(int) ((this.field1702 ^ (long) this.field1712[var5]) & 0xFFL)];
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field1702 = var4[(int) ((this.field1702 ^ (long) this.field1698[var6]) & 0xFFL)] ^ this.field1702 >>> 8;
        }
        this.field1702 = var4[(int) ((this.field1702 ^ (long) (this.field1713 ? 1 : 0)) & 0xFFL)] ^ this.field1702 >>> 8;
        if (var2 != 0L && this.field1702 != var2) {
            field1701.method925((byte) -30, var2);
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(Z[II[II)V")
    public final void method578(boolean arg0, int[] arg1, int arg2, int[] arg3, int arg4) {
        if (arg1 == null) {
            arg1 = new int[12];
            for (int var6 = 0; var6 < 7; var6++) {
                for (int var7 = 0; var7 < class146.field2899; var7++) {
                    class10 var8 = class89.method590(3, var7);
                    if (var8 != null && !var8.field355 && var6 + (arg0 ? 7 : 0) == var8.field353) {
                        arg1[class59.field1224[var6]] = class67.method396(Integer.MIN_VALUE, var7);
                        break;
                    }
                }
            }
        }
        this.field1698 = arg3;
        this.field1713 = arg0;
        this.field1710 = arg4;
        field1695++;
        if (arg2 == 32490) {
            this.field1712 = arg1;
            this.method577(false);
        }
    }

    @OriginalMember(owner = "client!ig", name = "b", descriptor = "(III)V")
    public final void method579(int arg0, int arg1, int arg2) {
        field1697++;
        if (arg0 != -29382) {
            return;
        }
        int var4 = class59.field1224[arg1];
        if (this.field1712[var4] != 0 && class89.method590(3, arg2) != null) {
            this.field1712[var4] = class67.method396(Integer.MIN_VALUE, arg2);
            this.method577(false);
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(IZ)V")
    public static final void method580(int arg0, boolean arg1) {
        field1709++;
        if (!arg1) {
            method581(false);
        }
        if (class79.field1619 == 0) {
            class198.field3871.method1233(arg0, -15561);
        } else {
            class110.field2245 = arg0;
        }
    }

    @OriginalMember(owner = "client!ig", name = "b", descriptor = "(Z)V")
    public static void method581(boolean arg0) {
        field1714 = null;
        field1701 = null;
        field1717 = null;
        field1706 = null;
        if (arg0) {
            method581(false);
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(I)I")
    public final int method582(int arg0) {
        field1715++;
        if (arg0 > -96) {
            this.method582(-8);
        }
        return this.field1710 == -1 ? (this.field1698[4] << 20) + (this.field1712[8] << 10) + (this.field1712[0] << 15) + (this.field1698[0] << 25) + (this.field1712[11] << 5) + this.field1712[1] : 305419896 - -class117.method786((byte) 125, this.field1710).field1959;
    }

    @OriginalMember(owner = "client!ig", name = "b", descriptor = "(IZ)V")
    public final void method583(int arg0, boolean arg1) {
        field1703++;
        if (arg1 != this.field1713) {
            this.method578(arg1, null, 32490, this.field1698, -1);
            if (arg0 != 1073741824) {
                method580(-22, true);
            }
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(ILca;ILca;B)Ldg;")
    public final class38 method584(int arg0, class22 arg1, int arg2, class22 arg3, byte arg4) {
        field1708++;
        if (this.field1710 != -1) {
            return class117.method786((byte) 94, this.field1710).method679(arg3, arg2, arg0, arg4 - 80, arg1);
        }
        long var6 = this.field1702;
        int[] var8 = this.field1712;
        if (arg3 != null && (arg3.field535 >= 0 || arg3.field532 >= 0)) {
            var8 = new int[12];
            for (int var9 = 0; var9 < 12; var9++) {
                var8[var9] = this.field1712[var9];
            }
            if (arg3.field535 >= 0) {
                if (arg3.field535 == 65535) {
                    var6 ^= 0xFFFFFFFF00000000L;
                    var8[5] = 0;
                } else {
                    var8[5] = class67.method396(arg3.field535, 1073741824);
                    var6 ^= (long) var8[5] << 32;
                }
            }
            if (arg3.field532 >= 0) {
                if (arg3.field532 == 65535) {
                    var8[3] = 0;
                    var6 ^= 0xFFFFFFFFL;
                } else {
                    var8[3] = class67.method396(1073741824, arg3.field532);
                    var6 ^= var8[3];
                }
            }
        }
        if (arg4 != -49) {
            return null;
        }
        class38 var10 = (class38) field1701.method930(97, var6);
        if (var10 == null) {
            boolean var11 = false;
            for (int var12 = 0; var12 < 12; var12++) {
                int var21 = var8[var12];
                if ((var21 & 0x40000000) == 0) {
                    if ((var21 & Integer.MIN_VALUE) != 0 && !class89.method590(3, var21 & 0x3FFFFFFF).method70(-26025)) {
                        var11 = true;
                    }
                } else if (!class92.method626((byte) 59, var21 & 0x3FFFFFFF).method729(this.field1713, false)) {
                    var11 = true;
                }
            }
            if (var11) {
                if (this.field1699 != -1L) {
                    var10 = (class38) field1701.method930(109, this.field1699);
                }
                if (var10 == null) {
                    return null;
                }
            }
            if (var10 == null) {
                class57[] var13 = new class57[12];
                int var14 = 0;
                for (int var15 = 0; var15 < 12; var15++) {
                    int var18 = var8[var15];
                    if ((var18 & 0x40000000) != 0) {
                        class57 var19 = class92.method626((byte) 59, var18 & 0x3FFFFFFF).method734(124, this.field1713);
                        if (var19 != null) {
                            var13[var14++] = var19;
                        }
                    } else if ((var18 & Integer.MIN_VALUE) != 0) {
                        class57 var20 = class89.method590(3, var18 & 0x3FFFFFFF).method67(false);
                        if (var20 != null) {
                            var13[var14++] = var20;
                        }
                    }
                }
                class57 var16 = new class57(var13, var14);
                for (int var17 = 0; var17 < 5; var17++) {
                    if (this.field1698[var17] < class207.field3985[var17].length) {
                        var16.method349(class118.field2385[var17], class207.field3985[var17][this.field1698[var17]]);
                    }
                    if (class40.field908[var17].length > this.field1698[var17]) {
                        var16.method349(class88.field1743[var17], class40.field908[var17][this.field1698[var17]]);
                    }
                }
                var10 = var16.method345(64, 850, -30, -50, -30, true, true);
                field1701.method927(24744, var10, var6);
                this.field1699 = var6;
            }
        }
        if (arg3 == null && arg1 == null) {
            return var10;
        }
        class38 var22;
        if (arg3 != null && arg1 != null) {
            var22 = arg3.method140(arg1, 2, arg0, var10, arg2);
        } else if (arg3 == null) {
            var22 = arg1.method136(123, var10, arg2);
        } else {
            var22 = arg3.method136(127, var10, arg0);
        }
        return var22;
    }
}
