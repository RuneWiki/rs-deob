import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vf")
public class class103 {

    @OriginalMember(owner = "client!vf", name = "j", descriptor = "Luj;")
    private class259 field1704 = new class259();

    @OriginalMember(owner = "client!vf", name = "s", descriptor = "Luj;")
    private class259 field1713 = new class259();

    @OriginalMember(owner = "client!vf", name = "t", descriptor = "Luj;")
    private class259 field1714 = new class259();

    @OriginalMember(owner = "client!vf", name = "u", descriptor = "Luj;")
    private class259 field1715 = new class259();

    @OriginalMember(owner = "client!vf", name = "v", descriptor = "Lcu;")
    private class145 field1716 = new class145(4);

    @OriginalMember(owner = "client!vf", name = "z", descriptor = "I")
    public volatile int field1720 = 0;

    @OriginalMember(owner = "client!vf", name = "B", descriptor = "I")
    public volatile int field1722 = 0;

    @OriginalMember(owner = "client!vf", name = "A", descriptor = "B")
    private byte field1721 = 0;

    @OriginalMember(owner = "client!vf", name = "C", descriptor = "Lcu;")
    private class145 field1723 = new class145(8);

    @OriginalMember(owner = "client!vf", name = "k", descriptor = "Lpi;")
    public static class342 field1705 = new class342("flash3:", "blinken3:", "clignotant3:", "brilho3:");

    @OriginalMember(owner = "client!vf", name = "o", descriptor = "[I")
    public static int[] field1709 = new int[] { 32, 39, 44, 47 };

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "I")
    public static int field1695;

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "I")
    public static int field1696;

    @OriginalMember(owner = "client!vf", name = "c", descriptor = "I")
    public static int field1697;

    @OriginalMember(owner = "client!vf", name = "d", descriptor = "I")
    public static int field1698;

    @OriginalMember(owner = "client!vf", name = "e", descriptor = "I")
    public static int field1699;

    @OriginalMember(owner = "client!vf", name = "f", descriptor = "I")
    public static int field1700;

    @OriginalMember(owner = "client!vf", name = "g", descriptor = "I")
    public static int field1701;

    @OriginalMember(owner = "client!vf", name = "h", descriptor = "I")
    public static int field1702;

    @OriginalMember(owner = "client!vf", name = "i", descriptor = "I")
    public static int field1703;

    @OriginalMember(owner = "client!vf", name = "l", descriptor = "I")
    public static int field1706;

    @OriginalMember(owner = "client!vf", name = "m", descriptor = "I")
    public static int field1707;

    @OriginalMember(owner = "client!vf", name = "n", descriptor = "I")
    public static int field1708;

    @OriginalMember(owner = "client!vf", name = "p", descriptor = "I")
    public static int field1710;

    @OriginalMember(owner = "client!vf", name = "q", descriptor = "I")
    public static int field1711;

    @OriginalMember(owner = "client!vf", name = "r", descriptor = "I")
    public static int field1712;

    @OriginalMember(owner = "client!vf", name = "w", descriptor = "I")
    private int field1717;

    @OriginalMember(owner = "client!vf", name = "y", descriptor = "J")
    private long field1719;

    @OriginalMember(owner = "client!vf", name = "x", descriptor = "Luu;")
    private class187 field1718;

    @OriginalMember(owner = "client!vf", name = "E", descriptor = "Lrp;")
    private class298 field1724;

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(I)V")
    private final void method767(int arg0) {
        field1702++;
        if (arg0 > -95) {
            this.field1716 = null;
        }
        if (this.field1718 == null) {
            return;
        }
        try {
            this.field1716.field2289 = 0;
            this.field1716.method1109(false, 6);
            this.field1716.method1083(3, 91);
            this.field1718.method1304(this.field1716.field2270, 0, 4, (byte) 95);
        } catch (IOException var3) {
            try {
                this.field1718.method1305((byte) 106);
            } catch (Exception var2) {
            }
            this.field1718 = null;
            this.field1720++;
            this.field1722 = -2;
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(B)Z")
    public final boolean method768(byte arg0) {
        field1699++;
        if (this.field1718 != null) {
            long var2 = class211.method1419(12921);
            int var4 = (int) (var2 - this.field1719);
            this.field1719 = var2;
            if (var4 > 200) {
                var4 = 200;
            }
            this.field1717 += var4;
            if (this.field1717 > 30000) {
                try {
                    this.field1718.method1305((byte) -11);
                } catch (Exception var27) {
                }
                this.field1718 = null;
            }
        }
        if (this.field1718 == null) {
            return this.method771(true) == 0 && this.method780((byte) -54) == 0;
        }
        try {
            this.field1718.method1302(arg0 ^ 0x78);
            class298 var5 = (class298) this.field1704.method1679(arg0 ^ 0x87);
            if (arg0 != 120) {
                return true;
            }
            while (var5 != null) {
                this.field1716.field2289 = 0;
                this.field1716.method1109(false, 1);
                this.field1716.method1083((int) var5.field2927, 120);
                this.field1718.method1304(this.field1716.field2270, 0, 4, (byte) 119);
                this.field1713.method1673(var5, 4304);
                var5 = (class298) this.field1704.method1671(-10033);
            }
            for (class298 var6 = (class298) this.field1714.method1679(255); var6 != null; var6 = (class298) this.field1714.method1671(-10033)) {
                this.field1716.field2289 = 0;
                this.field1716.method1109(false, 0);
                this.field1716.method1083((int) var6.field2927, 96);
                this.field1718.method1304(this.field1716.field2270, 0, 4, (byte) -99);
                this.field1715.method1673(var6, 4304);
            }
            for (int var7 = 0; var7 < 100; var7++) {
                int var8 = this.field1718.method1308(14971);
                if (var8 < 0) {
                    throw new IOException();
                }
                if (var8 == 0) {
                    break;
                }
                this.field1717 = 0;
                byte var9 = 0;
                if (this.field1724 == null) {
                    var9 = 8;
                } else if (this.field1724.field4252 == 0) {
                    var9 = 1;
                }
                if (var9 <= 0) {
                    int var10 = this.field1724.field4249.field2270.length - this.field1724.field4248;
                    int var11 = 512 - this.field1724.field4252;
                    if (var11 > var10 - this.field1724.field4249.field2289) {
                        var11 = var10 - this.field1724.field4249.field2289;
                    }
                    if (var11 > var8) {
                        var11 = var8;
                    }
                    this.field1718.method1306(this.field1724.field4249.field2289, 0, this.field1724.field4249.field2270, var11);
                    if (this.field1721 != 0) {
                        for (int var12 = 0; var12 < var11; var12++) {
                            this.field1724.field4249.field2270[this.field1724.field4249.field2289 + var12] = (byte) class125.method953(this.field1724.field4249.field2270[this.field1724.field4249.field2289 + var12], this.field1721);
                        }
                    }
                    this.field1724.field4249.field2289 += var11;
                    this.field1724.field4252 += var11;
                    if (this.field1724.field4249.field2289 == var10) {
                        this.field1724.method1382(7218);
                        this.field1724.field4053 = false;
                        this.field1724 = null;
                    } else if (this.field1724.field4252 == 512) {
                        this.field1724.field4252 = 0;
                    }
                } else {
                    int var13 = var9 - this.field1723.field2289;
                    if (var8 < var13) {
                        var13 = var8;
                    }
                    this.field1718.method1306(this.field1723.field2289, 0, this.field1723.field2270, var13);
                    if (this.field1721 != 0) {
                        for (int var14 = 0; var14 < var13; var14++) {
                            this.field1723.field2270[this.field1723.field2289 + var14] = (byte) class125.method953(this.field1723.field2270[this.field1723.field2289 + var14], this.field1721);
                        }
                    }
                    this.field1723.field2289 += var13;
                    if (this.field1723.field2289 >= var9) {
                        if (this.field1724 == null) {
                            this.field1723.field2289 = 0;
                            int var15 = this.field1723.method1063((byte) -93);
                            int var16 = this.field1723.method1069((byte) -110);
                            int var17 = this.field1723.method1063((byte) 102);
                            int var18 = this.field1723.method1070(-32387);
                            int var19 = var17 & 0x7F;
                            boolean var20 = (var17 & 0x80) != 0;
                            long var21 = (long) ((var15 << 16) + var16);
                            Object var23 = null;
                            class298 var24;
                            if (var20) {
                                for (var24 = (class298) this.field1715.method1679(arg0 ^ 0x87); var24 != null && var24.field2927 != var21; var24 = (class298) this.field1715.method1671(-10033)) {
                                }
                            } else {
                                for (var24 = (class298) this.field1713.method1679(255); var24 != null && var24.field2927 != var21; var24 = (class298) this.field1713.method1671(arg0 - 10153)) {
                                }
                            }
                            if (var24 == null) {
                                throw new IOException();
                            }
                            int var25 = var19 == 0 ? 5 : 9;
                            this.field1724 = var24;
                            this.field1724.field4249 = new class145(var18 + var25 + this.field1724.field4248);
                            this.field1724.field4249.method1109(false, var19);
                            this.field1724.field4249.method1117(var18, (byte) 12);
                            this.field1723.field2289 = 0;
                            this.field1724.field4252 = 8;
                        } else if (this.field1724.field4252 != 0) {
                            throw new IOException();
                        } else if (this.field1723.field2270[0] == -1) {
                            this.field1723.field2289 = 0;
                            this.field1724.field4252 = 1;
                        } else {
                            this.field1724 = null;
                        }
                    }
                }
            }
            return true;
        } catch (IOException var28) {
            try {
                this.field1718.method1305((byte) -104);
            } catch (Exception var26) {
            }
            this.field1720++;
            this.field1722 = -2;
            this.field1718 = null;
            return this.method771(true) == 0 && this.method780((byte) -54) == 0;
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(IZ)V")
    public final void method769(int arg0, boolean arg1) {
        field1700++;
        if (this.field1718 == null) {
            return;
        }
        if (arg0 != -32251) {
            this.field1714 = null;
        }
        try {
            this.field1716.field2289 = 0;
            this.field1716.method1109(false, arg1 ? 2 : 3);
            this.field1716.method1083(0, 88);
            this.field1718.method1304(this.field1716.field2270, 0, 4, (byte) -72);
        } catch (IOException var4) {
            try {
                this.field1718.method1305((byte) 125);
            } catch (Exception var3) {
            }
            this.field1720++;
            this.field1718 = null;
            this.field1722 = -2;
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(ZLuu;Z)V")
    public final void method770(boolean arg0, class187 arg1, boolean arg2) {
        field1710++;
        if (this.field1718 != null) {
            try {
                this.field1718.method1305((byte) -64);
            } catch (Exception var8) {
            }
            this.field1718 = null;
        }
        this.field1718 = arg1;
        this.method767(-105);
        this.method769(-32251, arg0);
        this.field1724 = null;
        this.field1723.field2289 = 0;
        if (!arg2) {
            return;
        }
        while (true) {
            class298 var4 = (class298) this.field1713.method1674((byte) -112);
            if (var4 == null) {
                while (true) {
                    class298 var5 = (class298) this.field1715.method1674((byte) -112);
                    if (var5 == null) {
                        if (this.field1721 != 0) {
                            try {
                                this.field1716.field2289 = 0;
                                this.field1716.method1109(!arg2, 4);
                                this.field1716.method1109(false, this.field1721);
                                this.field1716.method1094(1618659784, 0);
                                this.field1718.method1304(this.field1716.field2270, 0, 4, (byte) -90);
                            } catch (IOException var7) {
                                try {
                                    this.field1718.method1305((byte) -12);
                                } catch (Exception var6) {
                                }
                                this.field1722 = -2;
                                this.field1718 = null;
                                this.field1720++;
                            }
                        }
                        this.field1717 = 0;
                        this.field1719 = class211.method1419(12921);
                        return;
                    }
                    this.field1714.method1673(var5, 4304);
                }
            }
            this.field1704.method1673(var4, 4304);
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(Z)I")
    public final int method771(boolean arg0) {
        if (!arg0) {
            this.field1719 = 39L;
        }
        field1703++;
        return this.field1704.method1678(-8081) + this.field1713.method1678(-8081);
    }

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "(I)Z")
    public final boolean method772(int arg0) {
        if (arg0 != -21) {
            this.field1722 = -125;
        }
        field1696++;
        return this.method771(true) >= 20;
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(IBIZI)Lrp;")
    public final class298 method773(int arg0, byte arg1, int arg2, boolean arg3, int arg4) {
        field1712++;
        long var6 = (long) ((arg0 << 16) + arg4);
        class298 var8 = new class298();
        var8.field4248 = arg1;
        if (arg2 != 1) {
            this.method767(34);
        }
        var8.field4056 = arg3;
        var8.field2927 = var6;
        if (arg3) {
            if (this.method771(true) >= 20) {
                throw new RuntimeException();
            }
            this.field1704.method1673(var8, arg2 ^ 0x10D1);
        } else if (this.method780((byte) -54) < 20) {
            this.field1714.method1673(var8, 4304);
        } else {
            throw new RuntimeException();
        }
        return var8;
    }

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "(Z)V")
    public static void method774(boolean arg0) {
        if (!arg0) {
            method774(false);
        }
        field1705 = null;
        field1709 = null;
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(BLob;)V")
    public static final void method775(byte arg0, class517 arg1) {
        if (arg0 < 61) {
            return;
        }
        field1706++;
        int var2 = arg1.field7611 - class531.field7821;
        int var3 = arg1.field7648 * 128 + (arg1.method1654(118) * 64);
        int var4 = arg1.field7615 * 128 + arg1.method1654(111) * 64;
        arg1.field6228 += (var3 - arg1.field6228) / var2;
        arg1.field7695 = 0;
        arg1.field6233 += (var4 - arg1.field6233) / var2;
        if (arg1.field7671 == 0) {
            arg1.method3088(8192, -43);
        }
        if (arg1.field7671 == 1) {
            arg1.method3088(12288, -72);
        }
        if (arg1.field7671 == 2) {
            arg1.method3088(0, -93);
        }
        if (arg1.field7671 == 3) {
            arg1.method3088(4096, -88);
        }
    }

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "(B)V")
    public final void method776(byte arg0) {
        field1708++;
        if (this.field1718 != null) {
            this.field1718.method1305((byte) 109);
        }
        if (arg0 >= -58) {
            this.method771(true);
        }
    }

    @OriginalMember(owner = "client!vf", name = "c", descriptor = "(I)V")
    public final void method777(int arg0) {
        field1698++;
        if (this.field1718 == null) {
            return;
        }
        try {
            this.field1716.field2289 = 0;
            if (arg0 != 8192) {
                this.method770(false, null, true);
            }
            this.field1716.method1109(false, 7);
            this.field1716.method1083(0, arg0 - 8117);
            this.field1718.method1304(this.field1716.field2270, 0, 4, (byte) -99);
        } catch (IOException var3) {
            try {
                this.field1718.method1305((byte) 108);
            } catch (Exception var2) {
            }
            this.field1722 = -2;
            this.field1718 = null;
            this.field1720++;
        }
    }

    @OriginalMember(owner = "client!vf", name = "d", descriptor = "(I)V")
    public static final void method778(int arg0) {
        if (arg0 <= 119) {
            return;
        }
        field1695++;
        for (class236 var1 = (class236) class167.field2596.method2427(126); var1 != null; var1 = (class236) class167.field2596.method2422(-120)) {
            class441 var2 = var1.field3424;
            if (var2.field6605) {
                var1.method2090(-1);
                var2.method2648((byte) 29);
            } else if (var2.field6610 <= class531.field7821) {
                var2.method2644(class514.field7564, (byte) 106);
                if (var2.field6605) {
                    var1.method2090(-1);
                } else {
                    class84.method651(var2, true);
                }
            }
        }
    }

    @OriginalMember(owner = "client!vf", name = "c", descriptor = "(Z)V")
    public final void method779(boolean arg0) {
        if (!arg0) {
            this.method779(false);
        }
        if (this.field1718 != null) {
            this.field1718.method1301(16180);
        }
        field1697++;
    }

    @OriginalMember(owner = "client!vf", name = "c", descriptor = "(B)I")
    private final int method780(byte arg0) {
        if (arg0 == -54) {
            field1707++;
            return this.field1714.method1678(-8081) + this.field1715.method1678(-8081);
        } else {
            return 112;
        }
    }

    @OriginalMember(owner = "client!vf", name = "d", descriptor = "(B)Z")
    public final boolean method781(byte arg0) {
        field1701++;
        if (arg0 < 21) {
            this.field1722 = -99;
        }
        return this.method780((byte) -54) >= 20;
    }

    @OriginalMember(owner = "client!vf", name = "e", descriptor = "(B)V")
    public final void method782(byte arg0) {
        try {
            this.field1718.method1305((byte) -106);
        } catch (Exception var2) {
        }
        if (arg0 < 64) {
            method775((byte) -101, null);
        }
        field1711++;
        this.field1720++;
        this.field1721 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
        this.field1718 = null;
        this.field1722 = -1;
    }
}
