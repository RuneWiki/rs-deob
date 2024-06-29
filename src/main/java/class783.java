import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mo")
public class class783 {

    @OriginalMember(owner = "client!mo", name = "B", descriptor = "Lwca;")
    private class708 field11433 = new class708();

    @OriginalMember(owner = "client!mo", name = "y", descriptor = "Lwca;")
    private class708 field11435 = new class708();

    @OriginalMember(owner = "client!mo", name = "s", descriptor = "Lwca;")
    private class708 field11439 = new class708();

    @OriginalMember(owner = "client!mo", name = "r", descriptor = "Lwca;")
    private class708 field11440 = new class708();

    @OriginalMember(owner = "client!mo", name = "e", descriptor = "Lwq;")
    private class176 field11444 = new class176(4);

    @OriginalMember(owner = "client!mo", name = "j", descriptor = "I")
    public volatile int field11447 = 0;

    @OriginalMember(owner = "client!mo", name = "k", descriptor = "I")
    public volatile int field11446 = 0;

    @OriginalMember(owner = "client!mo", name = "c", descriptor = "B")
    private byte field11448 = 0;

    @OriginalMember(owner = "client!mo", name = "z", descriptor = "Lwq;")
    private class176 field11445 = new class176(8);

    @OriginalMember(owner = "client!mo", name = "C", descriptor = "[Ljava/lang/String;")
    private static final String[] field11450 = new String[] { method5636(method5635("LN9=k")), method5636(method5635("LN99k")), method5636(method5635("LN97k")), method5636(method5635("LN9:k")), method5636(method5635("LN9;k")), method5636(method5635("LN9?k")), method5636(method5635("LN98k")), method5636(method5635("LN91k")), method5636(method5635("LN9>k")), method5636(method5635("LN96k")), method5636(method5635("Z\u000f9\\>")), method5636(method5635("LN93k")), method5636(method5635("OT{\u001e")), method5636(method5635("LN9<k")), method5636(method5635("LN90k")), method5636(method5635("LN95k")), method5636(method5635("LN94k")) };

    @OriginalMember(owner = "client!mo", name = "f", descriptor = "[I")
    public static int[] field11429 = new int[2];

    @OriginalMember(owner = "client!mo", name = "d", descriptor = "I")
    public static int field11422;

    @OriginalMember(owner = "client!mo", name = "p", descriptor = "I")
    public static int field11423;

    @OriginalMember(owner = "client!mo", name = "n", descriptor = "I")
    public static int field11424;

    @OriginalMember(owner = "client!mo", name = "i", descriptor = "I")
    public static int field11425;

    @OriginalMember(owner = "client!mo", name = "g", descriptor = "I")
    public static int field11426;

    @OriginalMember(owner = "client!mo", name = "u", descriptor = "I")
    public static int field11427;

    @OriginalMember(owner = "client!mo", name = "b", descriptor = "I")
    public static int field11428;

    @OriginalMember(owner = "client!mo", name = "t", descriptor = "I")
    public static int field11430;

    @OriginalMember(owner = "client!mo", name = "m", descriptor = "I")
    public static int field11431;

    @OriginalMember(owner = "client!mo", name = "x", descriptor = "I")
    public static int field11432;

    @OriginalMember(owner = "client!mo", name = "A", descriptor = "I")
    public static int field11434;

    @OriginalMember(owner = "client!mo", name = "w", descriptor = "I")
    public static int field11436;

    @OriginalMember(owner = "client!mo", name = "q", descriptor = "I")
    public static int field11437;

    @OriginalMember(owner = "client!mo", name = "l", descriptor = "I")
    public static int field11438;

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "I")
    private int field11441;

    @OriginalMember(owner = "client!mo", name = "o", descriptor = "J")
    private long field11443;

    @OriginalMember(owner = "client!mo", name = "v", descriptor = "Lgl;")
    private class627 field11442;

    @OriginalMember(owner = "client!mo", name = "h", descriptor = "Lsv;")
    private class689 field11449;

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(BZ)V")
    public final void method5620(byte arg0, boolean arg1) {
        try {
            field11426++;
            if (this.field11442 != null) {
                try {
                    this.field11444.field2799 = 0;
                    this.field11444.method1678(arg1 ? 2 : 3, 65280);
                    this.field11444.method1671(-128, 0);
                    this.field11442.method4569(0, this.field11444.field2805, 4, 63);
                    if (arg0 != 48) {
                        this.field11443 = -104L;
                    }
                } catch (IOException var5) {
                    try {
                        this.field11442.method4570(0);
                    } catch (Exception var4) {
                    }
                    this.field11447++;
                    this.field11446 = -2;
                    this.field11442 = null;
                }
            }
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field11450[14] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(IZLgl;)V")
    public final void method5621(int arg0, boolean arg1, class627 arg2) {
        try {
            if (this.field11442 != null) {
                try {
                    this.field11442.method4570(0);
                } catch (Exception var9) {
                }
                this.field11442 = null;
            }
            if (arg0 == 4121) {
                field11436++;
                this.field11442 = arg2;
                this.method5628(arg0 ^ 0x1066);
                this.method5620((byte) 48, arg1);
                this.field11445.field2799 = 0;
                this.field11449 = null;
                while (true) {
                    class689 var4 = (class689) this.field11435.method5149((byte) 52);
                    if (var4 == null) {
                        while (true) {
                            class689 var5 = (class689) this.field11440.method5149((byte) 52);
                            if (var5 == null) {
                                if (this.field11448 != 0) {
                                    try {
                                        this.field11444.field2799 = 0;
                                        this.field11444.method1678(4, 65280);
                                        this.field11444.method1678(this.field11448, 65280);
                                        this.field11444.method1650((byte) -95, 0);
                                        this.field11442.method4569(0, this.field11444.field2805, 4, -99);
                                    } catch (IOException var8) {
                                        try {
                                            this.field11442.method4570(arg0 - 4121);
                                        } catch (Exception var7) {
                                        }
                                        this.field11447++;
                                        this.field11442 = null;
                                        this.field11446 = -2;
                                    }
                                }
                                this.field11441 = 0;
                                this.field11443 = class712.method5167(-2334);
                                return;
                            }
                            this.field11439.method5142(var5, (byte) -63);
                        }
                    }
                    this.field11433.method5142(var4, (byte) -63);
                }
            }
        } catch (RuntimeException var10) {
            throw class590.method4333(var10, field11450[11] + arg0 + ',' + arg1 + ',' + (arg2 == null ? field11450[12] : field11450[10]) + ')');
        }
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(Ljava/lang/String;Z)V")
    public static final void method5622(String arg0, boolean arg1) {
        try {
            field11423++;
            if (arg0 != null) {
                if (!arg1) {
                    method5622(null, true);
                }
                String var2 = class788.method5662((byte) 127, arg0);
                if (var2 != null) {
                    for (int var3 = 0; var3 < class198.field3145; var3++) {
                        String var4 = class129.field1846[var3];
                        String var5 = class788.method5662((byte) 97, var4);
                        if (class334.method2818(true, arg0, var4, var5, var2)) {
                            class198.field3145--;
                            for (int var6 = var3; var6 < class198.field3145; var6++) {
                                class129.field1846[var6] = class129.field1846[var6 + 1];
                                class449.field6963[var6] = class449.field6963[var6 + 1];
                                class129.field1847[var6] = class129.field1847[var6 + 1];
                                class184.field2930[var6] = class184.field2930[var6 + 1];
                                class142.field2020[var6] = class142.field2020[var6 + 1];
                                class409.field6533[var6] = class409.field6533[var6 + 1];
                            }
                            class361.field5817 = class318.field5182;
                            class116.field1693++;
                            class164 var7 = class193.method1785(!arg1);
                            class487 var8 = class618.method4519(60, class687.field9922, var7.field2659);
                            var8.field7362.method1678(class126.method1216(101, arg0), 65280);
                            var8.field7362.method1681(arg0, 23137);
                            var7.method1546(var8, 1);
                            return;
                        }
                    }
                }
            }
        } catch (RuntimeException var10) {
            throw class590.method4333(var10, field11450[16] + (arg0 == null ? field11450[12] : field11450[10]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(IIBIZ)Lsv;")
    public final class689 method5623(int arg0, int arg1, byte arg2, int arg3, boolean arg4) {
        try {
            field11434++;
            if (arg1 != 6) {
                this.method5624(42);
            }
            long var6 = (long) ((arg0 << 16) + arg3);
            class689 var8 = new class689();
            var8.field7075 = var6;
            var8.field9945 = arg2;
            var8.field11244 = arg4;
            if (arg4) {
                if (this.method5632(78) >= 20) {
                    throw new RuntimeException();
                }
                this.field11433.method5142(var8, (byte) -63);
            } else if (this.method5627(-128) < 20) {
                this.field11439.method5142(var8, (byte) -63);
            } else {
                throw new RuntimeException();
            }
            return var8;
        } catch (RuntimeException var10) {
            throw class590.method4333(var10, field11450[7] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!mo", name = "b", descriptor = "(I)V")
    public final void method5624(int arg0) {
        try {
            if (this.field11442 != null) {
                this.field11442.method4573(-20471);
            }
            field11428++;
            if (arg0 < 31) {
                this.method5625(57);
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field11450[15] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!mo", name = "h", descriptor = "(I)Z")
    public final boolean method5625(int arg0) {
        try {
            field11430++;
            if (this.field11442 != null) {
                long var2 = class712.method5167(-2334);
                int var4 = (int) (var2 - this.field11443);
                this.field11443 = var2;
                if (var4 > 200) {
                    var4 = 200;
                }
                this.field11441 += var4;
                if (this.field11441 > 30000) {
                    try {
                        this.field11442.method4570(0);
                    } catch (Exception var29) {
                    }
                    this.field11442 = null;
                }
            }
            if (this.field11442 == null) {
                return this.method5632(94) == 0 && this.method5627(-128) == 0;
            }
            try {
                this.field11442.method4572((byte) 103);
                for (class689 var5 = (class689) this.field11433.method5147((byte) -68); var5 != null; var5 = (class689) this.field11433.method5144(256)) {
                    this.field11444.field2799 = 0;
                    this.field11444.method1678(1, 65280);
                    this.field11444.method1671(-116, (int) var5.field7075);
                    this.field11442.method4569(0, this.field11444.field2805, 4, 29);
                    this.field11435.method5142(var5, (byte) -63);
                }
                int var6 = -105 / ((-arg0 - 80) / 35);
                for (class689 var7 = (class689) this.field11439.method5147((byte) -83); var7 != null; var7 = (class689) this.field11439.method5144(256)) {
                    this.field11444.field2799 = 0;
                    this.field11444.method1678(0, 65280);
                    this.field11444.method1671(-110, (int) var7.field7075);
                    this.field11442.method4569(0, this.field11444.field2805, 4, 83);
                    this.field11440.method5142(var7, (byte) -63);
                }
                for (int var8 = 0; var8 < 100; var8++) {
                    int var9 = this.field11442.method4568(31879);
                    if (var9 < 0) {
                        throw new IOException();
                    }
                    if (var9 == 0) {
                        break;
                    }
                    this.field11441 = 0;
                    byte var10 = 0;
                    if (this.field11449 == null) {
                        var10 = 8;
                    } else if (this.field11449.field9944 == 0) {
                        var10 = 1;
                    }
                    if (var10 > 0) {
                        int var11 = var10 - this.field11445.field2799;
                        if (var9 < var11) {
                            var11 = var9;
                        }
                        this.field11442.method4574(var11, this.field11445.field2805, this.field11445.field2799, 0);
                        if (this.field11448 != 0) {
                            for (int var12 = 0; var12 < var11; var12++) {
                                this.field11445.field2805[this.field11445.field2799 + var12] = (byte) class251.method2133(this.field11445.field2805[this.field11445.field2799 + var12], this.field11448);
                            }
                        }
                        this.field11445.field2799 += var11;
                        if (var10 <= this.field11445.field2799) {
                            if (this.field11449 == null) {
                                this.field11445.field2799 = 0;
                                int var13 = this.field11445.method1645((byte) -105);
                                int var14 = this.field11445.method1687((byte) -96);
                                int var15 = this.field11445.method1645((byte) -76);
                                int var16 = this.field11445.method1622(-18712);
                                int var17 = var15 & 0x7F;
                                boolean var18 = (var15 & 0x80) != 0;
                                long var19 = (long) ((var13 << 16) + var14);
                                Object var21 = null;
                                class689 var22;
                                if (var18) {
                                    for (var22 = (class689) this.field11440.method5147((byte) 99); var22 != null && var22.field7075 != var19; var22 = (class689) this.field11440.method5144(256)) {
                                    }
                                } else {
                                    for (var22 = (class689) this.field11435.method5147((byte) -93); var22 != null && var22.field7075 != var19; var22 = (class689) this.field11435.method5144(256)) {
                                    }
                                }
                                if (var22 == null) {
                                    throw new IOException();
                                }
                                int var23 = var17 == 0 ? 5 : 9;
                                this.field11449 = var22;
                                this.field11449.field9947 = new class176(var16 + var23 + this.field11449.field9945);
                                this.field11449.field9947.method1678(var17, 65280);
                                this.field11449.field9947.method1641((byte) -108, var16);
                                this.field11445.field2799 = 0;
                                this.field11449.field9944 = 8;
                            } else if (this.field11449.field9944 != 0) {
                                throw new IOException();
                            } else if (this.field11445.field2805[0] == -1) {
                                this.field11445.field2799 = 0;
                                this.field11449.field9944 = 1;
                            } else {
                                this.field11449 = null;
                            }
                        }
                    } else {
                        int var24 = this.field11449.field9947.field2805.length - this.field11449.field9945;
                        int var25 = 512 - this.field11449.field9944;
                        if (var25 > var24 - this.field11449.field9947.field2799) {
                            var25 = var24 - this.field11449.field9947.field2799;
                        }
                        if (var25 > var9) {
                            var25 = var9;
                        }
                        this.field11442.method4574(var25, this.field11449.field9947.field2805, this.field11449.field9947.field2799, 0);
                        if (this.field11448 != 0) {
                            for (int var26 = 0; var26 < var25; var26++) {
                                this.field11449.field9947.field2805[this.field11449.field9947.field2799 + var26] = (byte) class251.method2133(this.field11449.field9947.field2805[this.field11449.field9947.field2799 + var26], this.field11448);
                            }
                        }
                        this.field11449.field9944 += var25;
                        this.field11449.field9947.field2799 += var25;
                        if (this.field11449.field9947.field2799 == var24) {
                            this.field11449.method3558((byte) 111);
                            this.field11449.field11246 = false;
                            this.field11449 = null;
                        } else if (this.field11449.field9944 == 512) {
                            this.field11449.field9944 = 0;
                        }
                    }
                }
                return true;
            } catch (IOException var30) {
                try {
                    this.field11442.method4570(0);
                } catch (Exception var28) {
                }
                this.field11442 = null;
                this.field11446 = -2;
                this.field11447++;
                return this.method5632(116) == 0 && this.method5627(-128) == 0;
            }
        } catch (RuntimeException var31) {
            throw class590.method4333(var31, field11450[13] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!mo", name = "j", descriptor = "(I)V")
    public static void method5626(int arg0) {
        try {
            if (arg0 != 16248) {
                method5622(null, false);
            }
            field11429 = null;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field11450[9] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!mo", name = "d", descriptor = "(I)I")
    private final int method5627(int arg0) {
        try {
            field11437++;
            if (arg0 > -127) {
                this.method5624(118);
            }
            return this.field11439.method5146(false) + this.field11440.method5146(false);
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field11450[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!mo", name = "g", descriptor = "(I)V")
    private final void method5628(int arg0) {
        try {
            field11438++;
            if (this.field11442 != null) {
                try {
                    this.field11444.field2799 = 0;
                    this.field11444.method1678(6, 65280);
                    this.field11444.method1671(-18, 3);
                    this.field11442.method4569(0, this.field11444.field2805, 4, -114);
                } catch (IOException var5) {
                    try {
                        this.field11442.method4570(0);
                    } catch (Exception var4) {
                    }
                    this.field11447++;
                    this.field11446 = -2;
                    this.field11442 = null;
                }
                int var2 = -68 / ((86 - arg0) / 38);
            }
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field11450[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!mo", name = "f", descriptor = "(I)V")
    public final void method5629(int arg0) {
        try {
            field11432++;
            if (this.field11442 != null) {
                this.field11442.method4570(0);
            }
            if (arg0 != 0) {
                this.method5629(-97);
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field11450[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!mo", name = "k", descriptor = "(I)Z")
    public final boolean method5630(int arg0) {
        try {
            if (arg0 == -29571) {
                field11422++;
                return this.method5632(108) >= 20;
            } else {
                return false;
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field11450[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!mo", name = "e", descriptor = "(I)Z")
    public final boolean method5631(int arg0) {
        try {
            if (arg0 != 16072) {
                this.method5625(-17);
            }
            field11427++;
            return this.method5627(-128) >= 20;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field11450[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!mo", name = "c", descriptor = "(I)I")
    public final int method5632(int arg0) {
        try {
            if (arg0 <= 66) {
                this.field11443 = -61L;
            }
            field11424++;
            return this.field11433.method5146(false) + this.field11435.method5146(false);
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field11450[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!mo", name = "i", descriptor = "(I)V")
    public final void method5633(int arg0) {
        try {
            field11425++;
            if (this.field11442 != null) {
                try {
                    this.field11444.field2799 = 0;
                    if (arg0 != -7144) {
                        this.field11442 = null;
                    }
                    this.field11444.method1678(7, 65280);
                    this.field11444.method1671(-119, 0);
                    this.field11442.method4569(0, this.field11444.field2805, 4, -123);
                } catch (IOException var4) {
                    try {
                        this.field11442.method4570(0);
                    } catch (Exception var3) {
                    }
                    this.field11447++;
                    this.field11446 = -2;
                    this.field11442 = null;
                }
            }
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field11450[8] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(I)V")
    public final void method5634(int arg0) {
        try {
            field11431++;
            try {
                this.field11442.method4570(0);
            } catch (Exception var3) {
            }
            this.field11446 = -1;
            this.field11442 = null;
            this.field11448 = (byte) ((int) (Math.random() * (double) arg0 + 1.0D));
            this.field11447++;
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field11450[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!mo", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method5635(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x43);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!mo", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method5636(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 33;
                    break;
                case 1:
                    var10005 = 33;
                    break;
                case 2:
                    var10005 = 23;
                    break;
                case 3:
                    var10005 = 114;
                    break;
                default:
                    var10005 = 67;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
