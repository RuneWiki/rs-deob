import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dn")
public class class232 {

    @OriginalMember(owner = "client!dn", name = "i", descriptor = "Lcc;")
    private class252 field4094 = new class252();

    @OriginalMember(owner = "client!dn", name = "o", descriptor = "Lcc;")
    private class252 field4100 = new class252();

    @OriginalMember(owner = "client!dn", name = "v", descriptor = "Lcc;")
    private class252 field4107 = new class252();

    @OriginalMember(owner = "client!dn", name = "z", descriptor = "Lcc;")
    private class252 field4111 = new class252();

    @OriginalMember(owner = "client!dn", name = "C", descriptor = "Lrm;")
    private class249 field4114 = new class249(4);

    @OriginalMember(owner = "client!dn", name = "H", descriptor = "I")
    public volatile int field4119 = 0;

    @OriginalMember(owner = "client!dn", name = "G", descriptor = "I")
    public volatile int field4118 = 0;

    @OriginalMember(owner = "client!dn", name = "F", descriptor = "B")
    private byte field4117 = 0;

    @OriginalMember(owner = "client!dn", name = "E", descriptor = "Lrm;")
    private class249 field4116 = new class249(8);

    @OriginalMember(owner = "client!dn", name = "r", descriptor = "Lsf;")
    public static class108 field4103 = class140.method973(255, ")2");

    @OriginalMember(owner = "client!dn", name = "j", descriptor = "Lcc;")
    public static class252 field4095 = new class252();

    @OriginalMember(owner = "client!dn", name = "x", descriptor = "Lsf;")
    public static class108 field4109 = class140.method973(255, "Polices charg-Bes");

    @OriginalMember(owner = "client!dn", name = "w", descriptor = "I")
    public static volatile int field4108 = 0;

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "I")
    public static int field4086;

    @OriginalMember(owner = "client!dn", name = "b", descriptor = "I")
    public static int field4087;

    @OriginalMember(owner = "client!dn", name = "c", descriptor = "I")
    public static int field4088;

    @OriginalMember(owner = "client!dn", name = "d", descriptor = "I")
    public static int field4089;

    @OriginalMember(owner = "client!dn", name = "e", descriptor = "I")
    public static int field4090;

    @OriginalMember(owner = "client!dn", name = "f", descriptor = "I")
    public static int field4091;

    @OriginalMember(owner = "client!dn", name = "g", descriptor = "I")
    public static int field4092;

    @OriginalMember(owner = "client!dn", name = "h", descriptor = "I")
    public static int field4093;

    @OriginalMember(owner = "client!dn", name = "k", descriptor = "I")
    public static int field4096;

    @OriginalMember(owner = "client!dn", name = "l", descriptor = "I")
    public static int field4097;

    @OriginalMember(owner = "client!dn", name = "m", descriptor = "I")
    public static int field4098;

    @OriginalMember(owner = "client!dn", name = "n", descriptor = "I")
    public static int field4099;

    @OriginalMember(owner = "client!dn", name = "p", descriptor = "I")
    public static int field4101;

    @OriginalMember(owner = "client!dn", name = "q", descriptor = "I")
    public static int field4102;

    @OriginalMember(owner = "client!dn", name = "s", descriptor = "I")
    public static int field4104;

    @OriginalMember(owner = "client!dn", name = "t", descriptor = "I")
    public static int field4105;

    @OriginalMember(owner = "client!dn", name = "u", descriptor = "I")
    public static int field4106;

    @OriginalMember(owner = "client!dn", name = "y", descriptor = "I")
    public static int field4110;

    @OriginalMember(owner = "client!dn", name = "A", descriptor = "I")
    private int field4112;

    @OriginalMember(owner = "client!dn", name = "D", descriptor = "J")
    private long field4115;

    @OriginalMember(owner = "client!dn", name = "I", descriptor = "Lba;")
    private class169 field4120;

    @OriginalMember(owner = "client!dn", name = "B", descriptor = "Lii;")
    private class216 field4113;

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(I)V", line = 7)
    public final void method1607(int arg0) {
        if (arg0 >= -6) {
            this.method1620(false, -77, -107, -29, (byte) -50);
        }
        field4104++;
        if (this.field4113 != null) {
            this.field4113.method1487(13881);
        }
    }

    @OriginalMember(owner = "client!dn", name = "b", descriptor = "(I)I", line = 21)
    private final int method1608(int arg0) {
        if (arg0 != 0) {
            this.field4094 = (class252) null;
        }
        field4090++;
        return this.field4107.method1780(16777215) + this.field4111.method1780(arg0 ^ 0xFFFFFF);
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(B)V", line = 34)
    public final void method1609(byte arg0) {
        field4093++;
        try {
            this.field4113.method1487(13881);
        } catch (Exception var3) {
        }
        if (arg0 != 8) {
            this.field4100 = (class252) null;
        }
        this.field4119++;
        this.field4113 = null;
        this.field4118 = -1;
        this.field4117 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
    }

    @OriginalMember(owner = "client!dn", name = "c", descriptor = "(I)V", line = 54)
    public final void method1610(int arg0) {
        field4092++;
        if (this.field4113 == null) {
            return;
        }
        try {
            this.field4114.field4314 = 0;
            this.field4114.method1759(-32768, 7);
            this.field4114.method1757(arg0 - 122, arg0);
            this.field4113.method1483(4, 0, false, this.field4114.field4338);
        } catch (IOException var5) {
            try {
                this.field4113.method1487(13881);
            } catch (Exception var4) {
            }
            this.field4118 = -2;
            this.field4119++;
            this.field4113 = null;
        }
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(ZI)V", line = 78)
    public final void method1611(boolean arg0, int arg1) {
        field4110++;
        if (this.field4113 == null) {
            return;
        }
        try {
            this.field4114.field4314 = 0;
            if (arg1 != -19043) {
                return;
            }
            this.field4114.method1759(-32768, arg0 ? 2 : 3);
            this.field4114.method1757(-119, 0);
            this.field4113.method1483(4, 0, false, this.field4114.field4338);
        } catch (IOException var6) {
            try {
                this.field4113.method1487(13881);
            } catch (Exception var5) {
            }
            this.field4118 = -2;
            this.field4119++;
            this.field4113 = null;
        }
    }

    @OriginalMember(owner = "client!dn", name = "b", descriptor = "(B)Z", line = 111)
    public final boolean method1612(byte arg0) {
        if (arg0 != -38) {
            method1618(81);
        }
        field4097++;
        return this.method1608(0) >= 20;
    }

    @OriginalMember(owner = "client!dn", name = "d", descriptor = "(I)V", line = 124)
    public final void method1613(int arg0) {
        if (arg0 >= -33) {
            this.method1613(-100);
        }
        if (this.field4113 != null) {
            this.field4113.method1485(27319);
        }
        field4106++;
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(Z)V", line = 139)
    private final void method1614(boolean arg0) {
        field4089++;
        if (this.field4113 == null) {
            return;
        }
        try {
            this.field4114.field4314 = 0;
            this.field4114.method1759(-32768, 6);
            this.field4114.method1757(-114, 3);
            this.field4113.method1483(4, 0, arg0, this.field4114.field4338);
        } catch (IOException var5) {
            try {
                this.field4113.method1487(13881);
            } catch (Exception var4) {
            }
            this.field4118 = -2;
            this.field4119++;
            this.field4113 = null;
        }
    }

    @OriginalMember(owner = "client!dn", name = "b", descriptor = "(Z)Z", line = 165)
    public final boolean method1615(boolean arg0) {
        if (this.field4113 != null) {
            long var2 = class118.method835(-1272);
            int var4 = (int) (var2 - this.field4115);
            this.field4115 = var2;
            if (var4 > 200) {
                var4 = 200;
            }
            this.field4112 += var4;
            if (this.field4112 > 30000) {
                try {
                    this.field4113.method1487(13881);
                } catch (Exception var30) {
                }
                this.field4113 = null;
            }
        }
        field4105++;
        if (this.field4113 == null) {
            return this.method1621((byte) 79) == 0 && this.method1608(0) == 0;
        }
        if (arg0) {
            field4109 = (class108) null;
        }
        try {
            this.field4113.method1479((byte) -11);
            for (class169 var6 = (class169) this.field4094.method1778(-127); var6 != null; var6 = (class169) this.field4094.method1783(-27042)) {
                this.field4114.field4314 = 0;
                this.field4114.method1759(-32768, 1);
                this.field4114.method1757(-116, (int) var6.field1520);
                this.field4113.method1483(4, 0, false, this.field4114.field4338);
                this.field4100.method1784(var6, !arg0);
            }
            for (class169 var7 = (class169) this.field4107.method1778(-127); var7 != null; var7 = (class169) this.field4107.method1783(-27042)) {
                this.field4114.field4314 = 0;
                this.field4114.method1759(-32768, 0);
                this.field4114.method1757(-120, (int) var7.field1520);
                this.field4113.method1483(4, 0, false, this.field4114.field4338);
                this.field4111.method1784(var7, !arg0);
            }
            for (int var8 = 0; var8 < 100; var8++) {
                int var9 = this.field4113.method1486(7);
                if (var9 < 0) {
                    throw new IOException();
                }
                if (var9 == 0) {
                    break;
                }
                this.field4112 = 0;
                byte var10 = 0;
                if (this.field4120 == null) {
                    var10 = 8;
                } else if (this.field4120.field3030 == 0) {
                    var10 = 1;
                }
                if (var10 <= 0) {
                    int var11 = this.field4120.field3028.field4338.length - this.field4120.field3037;
                    int var12 = 512 - this.field4120.field3030;
                    if ((var11 - this.field4120.field3028.field4314) < var12) {
                        var12 = var11 - this.field4120.field3028.field4314;
                    }
                    if (var9 < var12) {
                        var12 = var9;
                    }
                    this.field4113.method1478(this.field4120.field3028.field4314, var12, false, this.field4120.field3028.field4338);
                    if (this.field4117 != 0) {
                        for (int var13 = 0; var13 < var12; var13++) {
                            this.field4120.field3028.field4338[this.field4120.field3028.field4314 + var13] = (byte) class84.method565(this.field4120.field3028.field4338[this.field4120.field3028.field4314 + var13], this.field4117);
                        }
                    }
                    this.field4120.field3030 += var12;
                    this.field4120.field3028.field4314 += var12;
                    if (this.field4120.field3028.field4314 == var11) {
                        this.field4120.method648(26562);
                        this.field4120.field986 = false;
                        this.field4120 = null;
                    } else if (this.field4120.field3030 == 512) {
                        this.field4120.field3030 = 0;
                    }
                } else {
                    int var14 = var10 - this.field4116.field4314;
                    if (var9 < var14) {
                        var14 = var9;
                    }
                    this.field4113.method1478(this.field4116.field4314, var14, arg0, this.field4116.field4338);
                    if (this.field4117 != 0) {
                        for (int var15 = 0; var15 < var14; var15++) {
                            this.field4116.field4338[this.field4116.field4314 + var15] = (byte) class84.method565(this.field4116.field4338[this.field4116.field4314 + var15], this.field4117);
                        }
                    }
                    this.field4116.field4314 += var14;
                    if (var10 <= this.field4116.field4314) {
                        if (this.field4120 == null) {
                            this.field4116.field4314 = 0;
                            int var16 = this.field4116.method1731(true);
                            int var17 = this.field4116.method1712(-1);
                            int var18 = this.field4116.method1731(!arg0);
                            int var19 = var18 & 0x7F;
                            boolean var20 = (var18 & 0x80) != 0;
                            long var21 = (long) ((var16 << 16) + var17);
                            int var23 = this.field4116.method1738(-1756395344);
                            Object var24 = null;
                            class169 var25;
                            if (var20) {
                                for (var25 = (class169) this.field4111.method1778(66); var25 != null && var25.field1520 != var21; var25 = (class169) this.field4111.method1783(-27042)) {
                                }
                            } else {
                                for (var25 = (class169) this.field4100.method1778(118); var25 != null && var25.field1520 != var21; var25 = (class169) this.field4100.method1783(-27042)) {
                                }
                            }
                            if (var25 == null) {
                                throw new IOException();
                            }
                            this.field4120 = var25;
                            int var26 = var19 == 0 ? 5 : 9;
                            this.field4120.field3028 = new class249(var23 + var26 + this.field4120.field3037);
                            this.field4120.field3028.method1759(-32768, var19);
                            this.field4120.field3028.method1741(var23, -1580277072);
                            this.field4120.field3030 = 8;
                            this.field4116.field4314 = 0;
                        } else if (this.field4120.field3030 != 0) {
                            throw new IOException();
                        } else if (this.field4116.field4338[0] == -1) {
                            this.field4116.field4314 = 0;
                            this.field4120.field3030 = 1;
                        } else {
                            this.field4120 = null;
                        }
                    }
                }
            }
            return true;
        } catch (IOException var31) {
            try {
                this.field4113.method1487(13881);
            } catch (Exception var29) {
            }
            this.field4113 = null;
            this.field4119++;
            this.field4118 = -2;
            return this.method1621((byte) 79) == 0 && this.method1608(0) == 0;
        }
    }

    @OriginalMember(owner = "client!dn", name = "e", descriptor = "(I)V", line = 444)
    public static final void method1616(int arg0) {
        if (arg0 != -5219) {
            method1618(103);
        }
        boolean var1 = false;
        while (!var1) {
            var1 = true;
            for (int var2 = 0; var2 < (class311.field5374 - 1); var2++) {
                if (class305.field5299[var2] < 1000 && class305.field5299[var2 + 1] > 1000) {
                    class108 var3 = class317.field5454[var2];
                    class317.field5454[var2] = class317.field5454[var2 + 1];
                    class317.field5454[var2 + 1] = var3;
                    class108 var4 = class186.field3411[var2];
                    class186.field3411[var2] = class186.field3411[var2 + 1];
                    var1 = false;
                    class186.field3411[var2 + 1] = var4;
                    int var5 = class313.field5405[var2];
                    class313.field5405[var2] = class313.field5405[var2 + 1];
                    class313.field5405[var2 + 1] = var5;
                    int var6 = class94.field1506[var2];
                    class94.field1506[var2] = class94.field1506[var2 + 1];
                    class94.field1506[var2 + 1] = var6;
                    short var7 = class305.field5299[var2];
                    class305.field5299[var2] = class305.field5299[var2 + 1];
                    class305.field5299[var2 + 1] = var7;
                    long var8 = class131.field2244[var2];
                    class131.field2244[var2] = class131.field2244[var2 + 1];
                    class131.field2244[var2 + 1] = var8;
                }
            }
        }
        field4091++;
    }

    @OriginalMember(owner = "client!dn", name = "c", descriptor = "(Z)Z", line = 498)
    public final boolean method1617(boolean arg0) {
        field4086++;
        if (arg0) {
            return true;
        } else {
            return this.method1621((byte) 79) >= 20;
        }
    }

    @OriginalMember(owner = "client!dn", name = "f", descriptor = "(I)V", line = 516)
    public static void method1618(int arg0) {
        field4109 = null;
        if (arg0 != 6) {
            field4095 = (class252) null;
        }
        field4095 = null;
        field4103 = null;
    }

    @OriginalMember(owner = "client!dn", name = "g", descriptor = "(I)V", line = 530)
    public static final void method1619(int arg0) {
        for (class158 var1 = (class158) class191.field3456.method1672(arg0); var1 != null; var1 = (class158) class191.field3456.method1678(arg0 ^ 0xFFFFFF81)) {
            int var2 = var1.field2845;
            if (class219.method1508(var2, -123)) {
                boolean var3 = true;
                class98[] var4 = class320.field5485[var2];
                for (int var5 = 0; var5 < var4.length; var5++) {
                    if (var4[var5] != null) {
                        var3 = var4[var5].field1640;
                        break;
                    }
                }
                if (!var3) {
                    int var6 = (int) var1.field3375;
                    class98 var7 = class168.method1173(var6, -1456948048);
                    if (var7 != null) {
                        class195.method1388(arg0 ^ 0xFFFFFFAE, var7);
                    }
                }
            }
        }
        field4096++;
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(ZIIIB)Lba;", line = 582)
    public final class169 method1620(boolean arg0, int arg1, int arg2, int arg3, byte arg4) {
        field4088++;
        long var6 = (long) ((arg3 << 16) + arg2);
        class169 var8 = new class169();
        var8.field999 = arg0;
        if (arg1 != 0) {
            return (class169) null;
        }
        var8.field3037 = arg4;
        var8.field1520 = var6;
        if (arg0) {
            if (this.method1621((byte) 79) >= 20) {
                throw new RuntimeException();
            }
            this.field4094.method1784(var8, true);
        } else if (this.method1608(0) < 20) {
            this.field4107.method1784(var8, true);
        } else {
            throw new RuntimeException();
        }
        return var8;
    }

    @OriginalMember(owner = "client!dn", name = "c", descriptor = "(B)I", line = 627)
    public final int method1621(byte arg0) {
        field4098++;
        return arg0 == 79 ? this.field4094.method1780(16777215) + this.field4100.method1780(arg0 ^ 0xFFFFB0) : -64;
    }

    @OriginalMember(owner = "client!dn", name = "d", descriptor = "(B)V", line = 639)
    public static final void method1622(byte arg0) {
        class59.method403(0, (byte) -65, 0);
        field4099++;
        if (arg0 >= -101) {
            field4109 = (class108) null;
        }
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(IZLii;)V", line = 664)
    public final void method1623(int arg0, boolean arg1, class216 arg2) {
        if (this.field4113 != null) {
            try {
                this.field4113.method1487(13881);
            } catch (Exception var11) {
            }
            this.field4113 = null;
        }
        this.field4113 = arg2;
        field4087++;
        if (arg0 != 0) {
            this.field4112 = -51;
        }
        this.method1614(false);
        this.method1611(arg1, -19043);
        this.field4116.field4314 = 0;
        this.field4120 = null;
        while (true) {
            class169 var5 = (class169) this.field4100.method1786(5807);
            if (var5 == null) {
                while (true) {
                    class169 var6 = (class169) this.field4111.method1786(5807);
                    if (var6 == null) {
                        if (this.field4117 != 0) {
                            try {
                                this.field4114.field4314 = 0;
                                this.field4114.method1759(arg0 ^ 0xFFFF8000, 4);
                                this.field4114.method1759(-32768, this.field4117);
                                this.field4114.method1724(false, 0);
                                this.field4113.method1483(4, 0, false, this.field4114.field4338);
                            } catch (IOException var10) {
                                try {
                                    this.field4113.method1487(13881);
                                } catch (Exception var9) {
                                }
                                this.field4113 = null;
                                this.field4119++;
                                this.field4118 = -2;
                            }
                        }
                        this.field4112 = 0;
                        this.field4115 = class118.method835(-1272);
                        return;
                    }
                    this.field4107.method1784(var6, true);
                }
            }
            this.field4094.method1784(var5, true);
        }
    }
}
