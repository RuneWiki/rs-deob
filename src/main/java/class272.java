import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cq")
public class class272 {

    @OriginalMember(owner = "client!cq", name = "m", descriptor = "Ler;")
    private class54 field4365 = new class54();

    @OriginalMember(owner = "client!cq", name = "s", descriptor = "Ler;")
    private class54 field4371 = new class54();

    @OriginalMember(owner = "client!cq", name = "u", descriptor = "Ler;")
    private class54 field4373 = new class54();

    @OriginalMember(owner = "client!cq", name = "x", descriptor = "Ler;")
    private class54 field4376 = new class54();

    @OriginalMember(owner = "client!cq", name = "F", descriptor = "Ljg;")
    private class186 field4383 = new class186(4);

    @OriginalMember(owner = "client!cq", name = "I", descriptor = "I")
    public volatile int field4386 = 0;

    @OriginalMember(owner = "client!cq", name = "H", descriptor = "I")
    public volatile int field4385 = 0;

    @OriginalMember(owner = "client!cq", name = "J", descriptor = "B")
    private byte field4387 = 0;

    @OriginalMember(owner = "client!cq", name = "G", descriptor = "Ljg;")
    private class186 field4384 = new class186(8);

    @OriginalMember(owner = "client!cq", name = "o", descriptor = "Lal;")
    public static class52 field4367 = new class52(8);

    @OriginalMember(owner = "client!cq", name = "v", descriptor = "Ljava/lang/String;")
    public static String field4374 = "Loading title screen - ";

    @OriginalMember(owner = "client!cq", name = "z", descriptor = "Ljava/lang/String;")
    public static String field4378 = " from your friend list first.";

    @OriginalMember(owner = "client!cq", name = "w", descriptor = "Ljava/lang/String;")
    public static String field4375 = "Connecting to update server";

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "I")
    public static int field4353;

    @OriginalMember(owner = "client!cq", name = "b", descriptor = "I")
    public static int field4354;

    @OriginalMember(owner = "client!cq", name = "c", descriptor = "I")
    public static int field4355;

    @OriginalMember(owner = "client!cq", name = "d", descriptor = "I")
    public static int field4356;

    @OriginalMember(owner = "client!cq", name = "e", descriptor = "I")
    public static int field4357;

    @OriginalMember(owner = "client!cq", name = "f", descriptor = "I")
    public static int field4358;

    @OriginalMember(owner = "client!cq", name = "g", descriptor = "I")
    public static int field4359;

    @OriginalMember(owner = "client!cq", name = "h", descriptor = "I")
    public static int field4360;

    @OriginalMember(owner = "client!cq", name = "i", descriptor = "I")
    public static int field4361;

    @OriginalMember(owner = "client!cq", name = "j", descriptor = "I")
    public static int field4362;

    @OriginalMember(owner = "client!cq", name = "k", descriptor = "I")
    public static int field4363;

    @OriginalMember(owner = "client!cq", name = "l", descriptor = "I")
    public static int field4364;

    @OriginalMember(owner = "client!cq", name = "n", descriptor = "I")
    public static int field4366;

    @OriginalMember(owner = "client!cq", name = "p", descriptor = "I")
    public static int field4368;

    @OriginalMember(owner = "client!cq", name = "q", descriptor = "I")
    public static int field4369;

    @OriginalMember(owner = "client!cq", name = "r", descriptor = "I")
    public static int field4370;

    @OriginalMember(owner = "client!cq", name = "A", descriptor = "I")
    public static int field4379;

    @OriginalMember(owner = "client!cq", name = "D", descriptor = "I")
    private int field4382;

    @OriginalMember(owner = "client!cq", name = "C", descriptor = "J")
    private long field4381;

    @OriginalMember(owner = "client!cq", name = "B", descriptor = "Lol;")
    private class156 field4380;

    @OriginalMember(owner = "client!cq", name = "K", descriptor = "Lur;")
    private class315 field4388;

    @OriginalMember(owner = "client!cq", name = "t", descriptor = "Lug;")
    public static class333 field4372;

    @OriginalMember(owner = "client!cq", name = "y", descriptor = "[I")
    public static int[] field4377;

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(B)V", line = 3)
    public final void method1836(byte arg0) {
        if (arg0 >= -10) {
            this.method1839(-120);
        }
        field4358++;
        if (this.field4380 != null) {
            this.field4380.method1098((byte) 74);
        }
    }

    @OriginalMember(owner = "client!cq", name = "b", descriptor = "(B)V", line = 16)
    public final void method1837(byte arg0) {
        field4368++;
        if (this.field4380 != null) {
            this.field4380.method1096(-15279);
        }
        int var2 = -110 % ((-arg0 - 62) / 37);
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(I)Z", line = 36)
    public final boolean method1838(int arg0) {
        field4360++;
        if (this.field4380 != null) {
            long var2 = class46.method297(27104);
            int var4 = (int) (var2 - this.field4381);
            this.field4381 = var2;
            if (var4 > 200) {
                var4 = 200;
            }
            this.field4382 += var4;
            if (this.field4382 > 30000) {
                try {
                    this.field4380.method1098((byte) 106);
                } catch (Exception var27) {
                }
                this.field4380 = null;
            }
        }
        if (this.field4380 == null) {
            return this.method1853(-91) == 0 && this.method1841((byte) -50) == 0;
        }
        try {
            this.field4380.method1104((byte) -128);
            for (class315 var5 = (class315) this.field4365.method364(0); var5 != null; var5 = (class315) this.field4365.method361(39)) {
                this.field4383.field3044 = 0;
                this.field4383.method1312(1, -121);
                this.field4383.method1300(false, (int) var5.field86);
                this.field4380.method1101(this.field4383.field3066, 0, 4, 3);
                this.field4371.method363(true, var5);
            }
            for (class315 var6 = (class315) this.field4373.method364(0); var6 != null; var6 = (class315) this.field4373.method361(91)) {
                this.field4383.field3044 = 0;
                this.field4383.method1312(0, -79);
                this.field4383.method1300(false, (int) var6.field86);
                this.field4380.method1101(this.field4383.field3066, 0, 4, arg0 + 2);
                this.field4376.method363(true, var6);
            }
            for (int var7 = 0; var7 < 100; var7++) {
                int var8 = this.field4380.method1102(arg0 + 29999);
                if (var8 < 0) {
                    throw new IOException();
                }
                if (var8 == 0) {
                    break;
                }
                this.field4382 = 0;
                byte var9 = 0;
                if (this.field4388 == null) {
                    var9 = 8;
                } else if (this.field4388.field4953 == 0) {
                    var9 = 1;
                }
                if (var9 > 0) {
                    int var10 = var9 - this.field4384.field3044;
                    if (var10 > var8) {
                        var10 = var8;
                    }
                    this.field4380.method1103(arg0 ^ 0x1, this.field4384.field3066, var10, this.field4384.field3044);
                    if (this.field4387 != 0) {
                        for (int var11 = 0; var11 < var10; var11++) {
                            this.field4384.field3066[this.field4384.field3044 + var11] = (byte) class121.method873(this.field4384.field3066[this.field4384.field3044 + var11], this.field4387);
                        }
                    }
                    this.field4384.field3044 += var10;
                    if (this.field4384.field3044 >= var9) {
                        if (this.field4388 == null) {
                            this.field4384.field3044 = 0;
                            int var12 = this.field4384.method1322(false);
                            int var13 = this.field4384.method1272((byte) -117);
                            int var14 = this.field4384.method1322(false);
                            int var15 = this.field4384.method1284(8388607);
                            int var16 = var14 & 0x7F;
                            boolean var17 = (var14 & 0x80) != 0;
                            long var18 = (long) ((var12 << 16) + var13);
                            Object var20 = null;
                            class315 var21;
                            if (var17) {
                                for (var21 = (class315) this.field4376.method364(0); var21 != null && var21.field86 != var18; var21 = (class315) this.field4376.method361(45)) {
                                }
                            } else {
                                for (var21 = (class315) this.field4371.method364(0); var21 != null && var21.field86 != var18; var21 = (class315) this.field4371.method361(arg0 ^ 0x3D)) {
                                }
                            }
                            if (var21 == null) {
                                throw new IOException();
                            }
                            int var22 = var16 == 0 ? 5 : 9;
                            this.field4388 = var21;
                            this.field4388.field4949 = new class186(var15 + var22 + this.field4388.field4948);
                            this.field4388.field4949.method1312(var16, arg0 - 113);
                            this.field4388.field4949.method1315(var15, (byte) 98);
                            this.field4388.field4953 = 8;
                            this.field4384.field3044 = 0;
                        } else if (this.field4388.field4953 != 0) {
                            throw new IOException();
                        } else if (this.field4384.field3066[0] == -1) {
                            this.field4384.field3044 = 0;
                            this.field4388.field4953 = 1;
                        } else {
                            this.field4388 = null;
                        }
                    }
                } else {
                    int var23 = this.field4388.field4949.field3066.length - this.field4388.field4948;
                    int var24 = 512 - this.field4388.field4953;
                    if (var24 > (var23 - this.field4388.field4949.field3044)) {
                        var24 = var23 - this.field4388.field4949.field3044;
                    }
                    if (var8 < var24) {
                        var24 = var8;
                    }
                    this.field4380.method1103(0, this.field4388.field4949.field3066, var24, this.field4388.field4949.field3044);
                    if (this.field4387 != 0) {
                        for (int var25 = 0; var25 < var24; var25++) {
                            this.field4388.field4949.field3066[this.field4388.field4949.field3044 + var25] = (byte) class121.method873(this.field4388.field4949.field3066[this.field4388.field4949.field3044 + var25], this.field4387);
                        }
                    }
                    this.field4388.field4949.field3044 += var24;
                    this.field4388.field4953 += var24;
                    if (this.field4388.field4949.field3044 == var23) {
                        this.field4388.method90((byte) -53);
                        this.field4388.field4129 = false;
                        this.field4388 = null;
                    } else if (this.field4388.field4953 == 512) {
                        this.field4388.field4953 = 0;
                    }
                }
            }
            if (arg0 != 1) {
                this.field4365 = null;
            }
            return true;
        } catch (IOException var28) {
            try {
                this.field4380.method1098((byte) 78);
            } catch (Exception var26) {
            }
            this.field4385 = -2;
            this.field4380 = null;
            this.field4386++;
            return this.method1853(arg0 ^ 0xFFFFFF83) == 0 && this.method1841((byte) -51) == 0;
        }
    }

    @OriginalMember(owner = "client!cq", name = "b", descriptor = "(I)V", line = 312)
    public final void method1839(int arg0) {
        try {
            if (arg0 != 128) {
                return;
            }
            this.field4380.method1098((byte) 100);
        } catch (Exception var2) {
        }
        field4359++;
        this.field4386++;
        this.field4380 = null;
        this.field4387 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
        this.field4385 = -1;
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(IZ)V", line = 335)
    public final void method1840(int arg0, boolean arg1) {
        field4354++;
        if (this.field4380 == null) {
            return;
        }
        try {
            this.field4383.field3044 = 0;
            if (arg0 != 128) {
                this.field4380 = null;
            }
            this.field4383.method1312(arg1 ? 2 : 3, -91);
            this.field4383.method1300(false, 0);
            this.field4380.method1101(this.field4383.field3066, 0, 4, arg0 - 125);
        } catch (IOException var4) {
            try {
                this.field4380.method1098((byte) 53);
            } catch (Exception var3) {
            }
            this.field4385 = -2;
            this.field4380 = null;
            this.field4386++;
        }
    }

    @OriginalMember(owner = "client!cq", name = "c", descriptor = "(B)I", line = 367)
    private final int method1841(byte arg0) {
        int var2 = -17 / ((37 - arg0) / 59);
        field4369++;
        return this.field4373.method356(0) + this.field4376.method356(0);
    }

    @OriginalMember(owner = "client!cq", name = "c", descriptor = "(I)Z", line = 378)
    public final boolean method1842(int arg0) {
        if (arg0 != -21) {
            method1846(-39, -75, 69, -9, 78, 53, 113, -116);
        }
        field4356++;
        return this.method1841((byte) 98) >= 20;
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(IIILaq;Laq;)V", line = 389)
    public static final void method1843(int arg0, int arg1, int arg2, class89 arg3, class89 arg4) {
        if (class423.field6252[arg0][arg1][arg2] == null) {
            class362.method2345(arg0, arg1, arg2);
        }
        class423.field6252[arg0][arg1][arg2].field3873 = arg3;
        class423.field6252[arg0][arg1][arg2].field3872 = arg4;
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(ZLmo;Lmo;)V", line = 401)
    public static final void method1844(boolean arg0, class447 arg1, class447 arg2) {
        field4366++;
        class287.field4607 = arg2;
        class351.field5427 = arg1;
        if (!arg0) {
            field4372 = null;
        }
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(Ljava/lang/Throwable;ILjava/lang/String;)V", line = 415)
    public static final void method1845(Throwable arg0, int arg1, String arg2) {
        field4361++;
        try {
            String var3 = "";
            if (arg0 != null) {
                var3 = class185.method1263(arg0, 32);
            }
            if (arg2 != null) {
                if (arg0 != null) {
                    var3 = var3 + " | ";
                }
                var3 = var3 + arg2;
            }
            class208.method1462(var3, (byte) 40);
            if (arg1 <= 119) {
                field4379 = 62;
            }
            String var4 = class230.method1634("%3a", var3, 0, ":");
            String var5 = class230.method1634("%40", var4, 0, "@");
            String var6 = class230.method1634("%26", var5, 0, "&");
            String var7 = class230.method1634("%23", var6, 0, "#");
            if (class379.field5742.field4464 != null) {
                class26 var8 = class379.field5742.method1882(new URL(class379.field5742.field4464.getCodeBase(), "clienterror.ws?c=" + class409.field6058 + "&u=" + class198.field3196 + "&v1=" + class279.field4458 + "&v2=" + class279.field4457 + "&e=" + var7), 18);
                while (var8.field304 == 0) {
                    class84.method517((byte) 126, 1L);
                }
                if (var8.field304 == 1) {
                    DataInputStream var9 = (DataInputStream) var8.field305;
                    var9.read();
                    var9.close();
                }
            }
        } catch (Exception var10) {
        }
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(IIIIIIII)V", line = 469)
    public static final void method1846(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field4363++;
        if (arg4 <= 82) {
            field4367 = null;
        }
        int var8 = class21.method153(arg0, (byte) -80, class396.field5925, class99.field1378);
        int var9 = class21.method153(arg3, (byte) -119, class396.field5925, class99.field1378);
        int var10 = class21.method153(arg7, (byte) -113, class185.field3005, class406.field6033);
        int var11 = class21.method153(arg5, (byte) -82, class185.field3005, class406.field6033);
        int var12 = class21.method153(arg0 + arg1, (byte) -120, class396.field5925, class99.field1378);
        int var13 = class21.method153(arg3 - arg1, (byte) -69, class396.field5925, class99.field1378);
        for (int var14 = var8; var14 < var12; var14++) {
            class256.method1769(var11, class277.field4414[var14], (byte) 82, arg2, var10);
        }
        for (int var15 = var9; var15 > var13; var15--) {
            class256.method1769(var11, class277.field4414[var15], (byte) 76, arg2, var10);
        }
        int var16 = class21.method153(arg7 + arg1, (byte) -114, class185.field3005, class406.field6033);
        int var17 = class21.method153(arg5 - arg1, (byte) -87, class185.field3005, class406.field6033);
        for (int var18 = var12; var18 <= var13; var18++) {
            int[] var19 = class277.field4414[var18];
            class256.method1769(var16, var19, (byte) 102, arg2, var10);
            class256.method1769(var17, var19, (byte) 124, arg6, var16);
            class256.method1769(var11, var19, (byte) 67, arg2, var17);
        }
    }

    @OriginalMember(owner = "client!cq", name = "d", descriptor = "(I)V", line = 522)
    public final void method1847(int arg0) {
        field4362++;
        if (this.field4380 == null) {
            return;
        }
        try {
            if (arg0 == 3393) {
                this.field4383.field3044 = 0;
                this.field4383.method1312(7, arg0 ^ 0xFFFFF2E2);
                this.field4383.method1300(false, 0);
                this.field4380.method1101(this.field4383.field3066, 0, 4, 3);
            }
        } catch (IOException var3) {
            try {
                this.field4380.method1098((byte) 89);
            } catch (Exception var2) {
            }
            this.field4380 = null;
            this.field4385 = -2;
            this.field4386++;
        }
    }

    @OriginalMember(owner = "client!cq", name = "e", descriptor = "(I)V", line = 552)
    private final void method1848(int arg0) {
        field4357++;
        if (this.field4380 == null) {
            return;
        }
        try {
            if (arg0 != -14784) {
                this.field4380 = null;
            }
            this.field4383.field3044 = 0;
            this.field4383.method1312(6, -23);
            this.field4383.method1300(false, 3);
            this.field4380.method1101(this.field4383.field3066, 0, 4, arg0 ^ 0xFFFFC643);
        } catch (IOException var3) {
            try {
                this.field4380.method1098((byte) 110);
            } catch (Exception var2) {
            }
            this.field4385 = -2;
            this.field4386++;
            this.field4380 = null;
        }
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(Z)Z", line = 582)
    public final boolean method1849(boolean arg0) {
        if (arg0) {
            return true;
        } else {
            field4355++;
            return this.method1853(-114) >= 20;
        }
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(BIZII)Lur;", line = 593)
    public final class315 method1850(byte arg0, int arg1, boolean arg2, int arg3, int arg4) {
        if (arg4 != -6832) {
            this.method1853(-125);
        }
        field4353++;
        long var6 = (long) ((arg3 << 16) + arg1);
        class315 var8 = new class315();
        var8.field4948 = arg0;
        var8.field86 = var6;
        var8.field4127 = arg2;
        if (arg2) {
            if (this.method1853(-92) >= 20) {
                throw new RuntimeException();
            }
            this.field4365.method363(true, var8);
        } else if (this.method1841((byte) -101) < 20) {
            this.field4373.method363(true, var8);
        } else {
            throw new RuntimeException();
        }
        return var8;
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(BZLol;)V", line = 636)
    public final void method1851(byte arg0, boolean arg1, class156 arg2) {
        field4370++;
        if (this.field4380 != null) {
            try {
                this.field4380.method1098((byte) 89);
            } catch (Exception var8) {
            }
            this.field4380 = null;
        }
        this.field4380 = arg2;
        this.method1848(arg0 - 14686);
        this.method1840(arg0 + 226, arg1);
        this.field4384.field3044 = 0;
        this.field4388 = null;
        while (true) {
            class315 var4 = (class315) this.field4371.method358(arg0 + 98);
            if (var4 == null) {
                while (true) {
                    class315 var5 = (class315) this.field4376.method358(0);
                    if (var5 == null) {
                        if (arg0 != -98) {
                            this.field4365 = null;
                        }
                        if (this.field4387 != 0) {
                            try {
                                this.field4383.field3044 = 0;
                                this.field4383.method1312(4, -22);
                                this.field4383.method1312(this.field4387, -108);
                                this.field4383.method1283(8, 0);
                                this.field4380.method1101(this.field4383.field3066, 0, 4, 3);
                            } catch (IOException var7) {
                                try {
                                    this.field4380.method1098((byte) 100);
                                } catch (Exception var6) {
                                }
                                this.field4380 = null;
                                this.field4385 = -2;
                                this.field4386++;
                            }
                        }
                        this.field4382 = 0;
                        this.field4381 = class46.method297(27104);
                        return;
                    }
                    this.field4373.method363(true, var5);
                }
            }
            this.field4365.method363(true, var4);
        }
    }

    @OriginalMember(owner = "client!cq", name = "f", descriptor = "(I)V", line = 704)
    public static void method1852(int arg0) {
        int var1 = 61 % ((arg0 + 75) / 50);
        field4367 = null;
        field4377 = null;
        field4375 = null;
        field4374 = null;
        field4372 = null;
        field4378 = null;
    }

    @OriginalMember(owner = "client!cq", name = "g", descriptor = "(I)I", line = 722)
    public final int method1853(int arg0) {
        field4364++;
        if (arg0 > -83) {
            this.method1840(-124, true);
        }
        return this.field4365.method356(0) + this.field4371.method356(0);
    }
}
