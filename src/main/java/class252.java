import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tl")
public class class252 {

    @OriginalMember(owner = "client!tl", name = "m", descriptor = "Lr;")
    private class250 field4275 = new class250();

    @OriginalMember(owner = "client!tl", name = "y", descriptor = "Lr;")
    private class250 field4287 = new class250();

    @OriginalMember(owner = "client!tl", name = "A", descriptor = "I")
    private int field4289 = 0;

    @OriginalMember(owner = "client!tl", name = "z", descriptor = "Lr;")
    private class250 field4288 = new class250();

    @OriginalMember(owner = "client!tl", name = "B", descriptor = "Lr;")
    private class250 field4290 = new class250();

    @OriginalMember(owner = "client!tl", name = "D", descriptor = "I")
    private int field4292 = 0;

    @OriginalMember(owner = "client!tl", name = "E", descriptor = "Lmi;")
    private class92 field4293 = new class92(4);

    @OriginalMember(owner = "client!tl", name = "I", descriptor = "I")
    public volatile int field4297 = 0;

    @OriginalMember(owner = "client!tl", name = "J", descriptor = "B")
    private byte field4298 = 0;

    @OriginalMember(owner = "client!tl", name = "K", descriptor = "I")
    public volatile int field4299 = 0;

    @OriginalMember(owner = "client!tl", name = "H", descriptor = "Lmi;")
    private class92 field4296 = new class92(8);

    @OriginalMember(owner = "client!tl", name = "g", descriptor = "Lmh;")
    public static class62 field4269 = class201.method1405(true, " <col=ffffff>");

    @OriginalMember(owner = "client!tl", name = "w", descriptor = "Lmh;")
    private static class62 field4285 = class201.method1405(true, "http:)4)4advert)3runescape)3com)4banner)3ws?size=729");

    @OriginalMember(owner = "client!tl", name = "o", descriptor = "Lmh;")
    public static class62 field4277 = field4285;

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "I")
    public static int field4263;

    @OriginalMember(owner = "client!tl", name = "b", descriptor = "I")
    public static int field4264;

    @OriginalMember(owner = "client!tl", name = "c", descriptor = "I")
    public static int field4265;

    @OriginalMember(owner = "client!tl", name = "d", descriptor = "I")
    public static int field4266;

    @OriginalMember(owner = "client!tl", name = "e", descriptor = "I")
    public static int field4267;

    @OriginalMember(owner = "client!tl", name = "f", descriptor = "I")
    public static int field4268;

    @OriginalMember(owner = "client!tl", name = "i", descriptor = "I")
    public static int field4271;

    @OriginalMember(owner = "client!tl", name = "j", descriptor = "I")
    public static int field4272;

    @OriginalMember(owner = "client!tl", name = "k", descriptor = "I")
    public static int field4273;

    @OriginalMember(owner = "client!tl", name = "l", descriptor = "I")
    public static int field4274;

    @OriginalMember(owner = "client!tl", name = "n", descriptor = "I")
    public static int field4276;

    @OriginalMember(owner = "client!tl", name = "p", descriptor = "I")
    public static int field4278;

    @OriginalMember(owner = "client!tl", name = "q", descriptor = "I")
    public static int field4279;

    @OriginalMember(owner = "client!tl", name = "r", descriptor = "I")
    public static int field4280;

    @OriginalMember(owner = "client!tl", name = "s", descriptor = "I")
    public static int field4281;

    @OriginalMember(owner = "client!tl", name = "u", descriptor = "I")
    public static int field4283;

    @OriginalMember(owner = "client!tl", name = "v", descriptor = "I")
    public static int field4284;

    @OriginalMember(owner = "client!tl", name = "x", descriptor = "I")
    public static int field4286;

    @OriginalMember(owner = "client!tl", name = "F", descriptor = "I")
    private int field4294;

    @OriginalMember(owner = "client!tl", name = "C", descriptor = "J")
    private long field4291;

    @OriginalMember(owner = "client!tl", name = "G", descriptor = "Ljg;")
    private class165 field4295;

    @OriginalMember(owner = "client!tl", name = "h", descriptor = "Lli;")
    public static class226 field4270;

    @OriginalMember(owner = "client!tl", name = "L", descriptor = "Laa;")
    private class43 field4300;

    @OriginalMember(owner = "client!tl", name = "t", descriptor = "[I")
    public static int[] field4282;

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(IZ)V", line = 4)
    public final void method1748(int arg0, boolean arg1) {
        field4272++;
        if (this.field4295 == null) {
            return;
        }
        try {
            this.field4293.field1476 = arg0;
            this.field4293.method717(1, arg1 ? 2 : 3);
            this.field4293.method708(-33, 0);
            this.field4295.method1187(0, 4, arg0 ^ 0xFFFFFFA2, this.field4293.field1495);
        } catch (IOException var6) {
            try {
                this.field4295.method1193(-1);
            } catch (Exception var5) {
            }
            this.field4299++;
            this.field4295 = null;
        }
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(ZIBII)Laa;", line = 29)
    public final class43 method1749(boolean arg0, int arg1, byte arg2, int arg3, int arg4) {
        long var6 = (long) ((arg3 << 16) + arg1);
        class43 var8 = new class43();
        var8.field1703 = arg0;
        var8.field3426 = var6;
        var8.field649 = arg2;
        field4276++;
        if (arg4 != -4) {
            return (class43) null;
        }
        if (arg0) {
            if (this.field4289 >= 20) {
                throw new RuntimeException();
            }
            this.field4275.method1737(var8, -127);
            this.field4289++;
        } else if (this.field4292 < 20) {
            this.field4288.method1737(var8, arg4 ^ 0xFFFFFF93);
            this.field4292++;
        } else {
            throw new RuntimeException();
        }
        return var8;
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(B)Z", line = 73)
    public final boolean method1750(byte arg0) {
        field4264++;
        if (arg0 > -47) {
            return false;
        } else {
            return this.field4292 >= 20;
        }
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(I)V", line = 86)
    public final void method1751(int arg0) {
        if (this.field4295 != null) {
            this.field4295.method1193(-1);
        }
        field4286++;
        if (arg0 != 8) {
            method1753(false, false);
        }
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(III)V", line = 103)
    public static final void method1752(int arg0, int arg1, int arg2) {
        field4274++;
        if (arg1 != 9) {
            method1761(false);
        }
        class151 var3 = class165.method1194((byte) 1, 1, arg2);
        var3.method1088(126);
        var3.field2395 = arg0;
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(ZZ)V", line = 122)
    public static final void method1753(boolean arg0, boolean arg1) {
        field4266++;
        if (arg1) {
            class193.method1355((byte) -20, arg0, class306.field5258, class301.field5183, class60.field878);
        }
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(Z)V", line = 135)
    public final void method1754(boolean arg0) {
        field4265++;
        if (arg0) {
            this.field4298 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
            this.field4297++;
        }
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(IB)Lhg;", line = 149)
    public static final class216 method1755(int arg0, byte arg1) {
        field4267++;
        class216 var2 = (class216) class46.field688.method1396(0, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class105.field1724.method157(class17.method73((byte) 70, arg0), class69.method507(12720, arg0), (byte) 19);
        class216 var4 = new class216();
        var4.field3689 = arg0;
        if (var3 != null) {
            var4.method1523(new class92(var3), -129);
        }
        var4.method1535(70);
        if (arg1 > -25) {
            return (class216) null;
        }
        if (var4.field3665) {
            var4.field3706 = 0;
            var4.field3695 = false;
        }
        if (!class274.field4640 && var4.field3727) {
            var4.field3666 = null;
        }
        class46.field688.method1397((long) arg0, var4, true);
        return var4;
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(II)V", line = 193)
    public static final void method1756(int arg0, int arg1) {
        class42.field636.method1390(arg1, -54);
        field4281++;
        class165.field2677.method1390(arg1, -62);
        class294.field5004.method1390(arg1, -104);
        if (arg0 != -4) {
            method1764((byte) -50);
        }
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(Ljg;ZI)V", line = 206)
    public final void method1757(class165 arg0, boolean arg1, int arg2) {
        field4268++;
        if (this.field4295 != null) {
            try {
                this.field4295.method1193(-1);
            } catch (Exception var12) {
            }
            this.field4295 = null;
        }
        this.field4295 = arg0;
        this.method1759(false);
        this.method1748(0, arg1);
        this.field4300 = null;
        this.field4296.field1476 = 0;
        while (true) {
            class43 var5 = (class43) this.field4287.method1740((byte) -120);
            if (var5 == null) {
                while (true) {
                    class43 var6 = (class43) this.field4290.method1740((byte) -122);
                    if (var6 == null) {
                        if (this.field4298 != 0) {
                            try {
                                this.field4293.field1476 = 0;
                                this.field4293.method717(1, 4);
                                this.field4293.method717(1, this.field4298);
                                this.field4293.method738((byte) -61, 0);
                                this.field4295.method1187(0, 4, -114, this.field4293.field1495);
                            } catch (IOException var11) {
                                try {
                                    this.field4295.method1193(-1);
                                } catch (Exception var10) {
                                }
                                this.field4295 = null;
                                this.field4299++;
                            }
                        }
                        int var9 = 77 / ((arg2 - 16) / 44);
                        this.field4294 = 0;
                        this.field4291 = class293.method1985((byte) -71);
                        return;
                    }
                    this.field4288.method1737(var6, -67);
                }
            }
            this.field4275.method1737(var5, 118);
        }
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(ILhi;)V", line = 272)
    public static final void method1758(int arg0, class26 arg1) {
        if (arg0 >= 68) {
            field4278++;
            class49.field701 = arg1;
            class71.field1084 = class49.field701.method159(16, true);
        }
    }

    @OriginalMember(owner = "client!tl", name = "b", descriptor = "(Z)V", line = 284)
    private final void method1759(boolean arg0) {
        field4283++;
        if (this.field4295 == null) {
            return;
        }
        try {
            this.field4293.field1476 = 0;
            this.field4293.method717(1, 6);
            this.field4293.method708(-33, 3);
            this.field4295.method1187(0, 4, -90, this.field4293.field1495);
            if (arg0) {
                this.field4300 = (class43) null;
            }
        } catch (IOException var5) {
            try {
                this.field4295.method1193(-1);
            } catch (Exception var4) {
            }
            this.field4295 = null;
            this.field4299++;
        }
    }

    @OriginalMember(owner = "client!tl", name = "b", descriptor = "(B)Z", line = 315)
    public final boolean method1760(byte arg0) {
        if (arg0 > -109) {
            return true;
        } else {
            field4280++;
            return this.field4289 >= 20;
        }
    }

    @OriginalMember(owner = "client!tl", name = "c", descriptor = "(Z)V", line = 331)
    public static void method1761(boolean arg0) {
        field4269 = null;
        field4270 = null;
        field4285 = null;
        field4277 = null;
        if (arg0) {
            field4282 = (int[]) null;
        }
        field4282 = null;
    }

    @OriginalMember(owner = "client!tl", name = "b", descriptor = "(I)I", line = 345)
    public final int method1762(int arg0) {
        field4271++;
        return arg0 > -82 ? 9 : this.field4289;
    }

    @OriginalMember(owner = "client!tl", name = "c", descriptor = "(B)Z", line = 367)
    public final boolean method1763(byte arg0) {
        if (this.field4295 != null) {
            long var2 = class293.method1985((byte) -71);
            int var4 = (int) (var2 - this.field4291);
            this.field4291 = var2;
            if (var4 > 200) {
                var4 = 200;
            }
            this.field4294 += var4;
            if (this.field4294 > 30000) {
                try {
                    this.field4295.method1193(-1);
                } catch (Exception var31) {
                }
                this.field4295 = null;
            }
        }
        field4284++;
        if (this.field4295 == null) {
            return this.field4289 == 0 && this.field4292 == 0;
        }
        boolean var6 = false;
        try {
            class43 var7 = (class43) this.field4275.method1742(255);
            if (arg0 != 66) {
                return false;
            }
            while (var7 != null) {
                this.field4293.field1476 = 0;
                this.field4293.method717(1, 1);
                this.field4293.method708(-33, (int) var7.field3426);
                this.field4295.method1187(0, 4, -116, this.field4293.field1495);
                this.field4287.method1737(var7, arg0 ^ 0x33);
                var7 = (class43) this.field4275.method1739((byte) 46);
            }
            for (class43 var8 = (class43) this.field4288.method1742(255); var8 != null; var8 = (class43) this.field4288.method1739((byte) 58)) {
                this.field4293.field1476 = 0;
                this.field4293.method717(1, 0);
                this.field4293.method708(-33, (int) var8.field3426);
                this.field4295.method1187(0, 4, arg0 ^ 0xFFFFFFCD, this.field4293.field1495);
                this.field4290.method1737(var8, -8);
            }
            for (int var9 = 0; var9 < 100; var9++) {
                int var10 = this.field4295.method1185((byte) 42);
                if (var10 < 0) {
                    throw new IOException();
                }
                if (var10 == 0) {
                    break;
                }
                this.field4294 = 0;
                byte var11 = 0;
                if (this.field4300 == null) {
                    var11 = 8;
                } else if (this.field4300.field648 == 0) {
                    var11 = 1;
                }
                if (var11 <= 0) {
                    int var12 = this.field4300.field654.field1495.length - this.field4300.field649;
                    int var13 = 512 - this.field4300.field648;
                    if (var12 - this.field4300.field654.field1476 < var13) {
                        var13 = var12 - this.field4300.field654.field1476;
                    }
                    if (var10 < var13) {
                        var13 = var10;
                    }
                    this.field4295.method1192((byte) 127, this.field4300.field654.field1476, var13, this.field4300.field654.field1495);
                    if (this.field4298 != 0) {
                        for (int var14 = 0; var14 < var13; var14++) {
                            this.field4300.field654.field1495[this.field4300.field654.field1476 + var14] = (byte) class290.method1975(this.field4300.field654.field1495[this.field4300.field654.field1476 + var14], this.field4298);
                        }
                    }
                    this.field4300.field648 += var13;
                    this.field4300.field654.field1476 += var13;
                    if (this.field4300.field654.field1476 == var12) {
                        this.field4300.method1421(arg0 ^ 0x53);
                        if (this.field4300.field1703) {
                            this.field4289--;
                        } else {
                            this.field4292--;
                        }
                        this.field4300.field1706 = false;
                        this.field4300 = null;
                    } else if (this.field4300.field648 == 512) {
                        this.field4300.field648 = 0;
                    }
                } else {
                    int var15 = var11 - this.field4296.field1476;
                    if (var10 < var15) {
                        var15 = var10;
                    }
                    this.field4295.method1192((byte) 123, this.field4296.field1476, var15, this.field4296.field1495);
                    if (this.field4298 != 0) {
                        for (int var16 = 0; var16 < var15; var16++) {
                            this.field4296.field1495[this.field4296.field1476 + var16] = (byte) class290.method1975(this.field4296.field1495[this.field4296.field1476 + var16], this.field4298);
                        }
                    }
                    this.field4296.field1476 += var15;
                    if (var11 <= this.field4296.field1476) {
                        if (this.field4300 == null) {
                            this.field4296.field1476 = 0;
                            if (this.field4296.method690(arg0 ^ 0x3C) == -72057594037927937L) {
                                this.field4296.field1476 = 0;
                                var6 = true;
                            } else {
                                this.field4296.field1476 = 0;
                                int var17 = this.field4296.method702(-1);
                                int var18 = this.field4296.method721(82);
                                int var19 = this.field4296.method702(-1);
                                int var20 = var19 & 0x7F;
                                int var21 = this.field4296.method704(arg0 + 1509947726);
                                boolean var22 = (var19 & 0x80) != 0;
                                Object var23 = null;
                                long var24 = (long) ((var17 << 16) + var18);
                                class43 var26;
                                if (var22) {
                                    for (var26 = (class43) this.field4290.method1742(arg0 ^ 0xBD); var26 != null && var26.field3426 != var24; var26 = (class43) this.field4290.method1739((byte) 35)) {
                                    }
                                } else {
                                    for (var26 = (class43) this.field4287.method1742(255); var26 != null && var26.field3426 != var24; var26 = (class43) this.field4287.method1739((byte) 74)) {
                                    }
                                }
                                if (var26 == null) {
                                    throw new IOException();
                                }
                                this.field4300 = var26;
                                int var27 = var20 == 0 ? 5 : 9;
                                this.field4300.field654 = new class92(var21 + var27 + this.field4300.field649);
                                this.field4300.field654.method717(1, var20);
                                this.field4300.field654.method712(var21, -126);
                                this.field4300.field648 = 8;
                                this.field4296.field1476 = 0;
                            }
                        } else if (this.field4300.field648 != 0) {
                            throw new IOException();
                        } else if (this.field4296.field1495[0] == -1) {
                            this.field4296.field1476 = 0;
                            this.field4300.field648 = 1;
                        } else {
                            this.field4300 = null;
                        }
                    }
                }
            }
            if (var6) {
                this.field4293.field1476 = 0;
                this.field4293.method717(arg0 ^ 0x43, 5);
                this.field4295.method1187(0, 4, -83, this.field4293.field1495);
            }
            return true;
        } catch (IOException var32) {
            try {
                this.field4295.method1193(-1);
            } catch (Exception var30) {
            }
            this.field4299++;
            this.field4295 = null;
            return false;
        }
    }

    @OriginalMember(owner = "client!tl", name = "d", descriptor = "(B)V", line = 666)
    public static final void method1764(byte arg0) {
        field4263++;
        class75.field1223.method1695((byte) 102);
        int var1 = class75.field1223.method1687(8, (byte) 26);
        if (class133.field2163 > var1) {
            for (int var2 = var1; var2 < class133.field2163; var2++) {
                class97.field1597[class258.field4354++] = class288.field4914[var2];
            }
        }
        if (var1 > class133.field2163) {
            throw new RuntimeException("gnpov1");
        }
        class133.field2163 = 0;
        if (arg0 != -34) {
            method1756(58, -71);
        }
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = class288.field4914[var3];
            class204 var5 = class301.field5186[var4];
            int var6 = class75.field1223.method1687(1, (byte) 26);
            if (var6 == 0) {
                class288.field4914[class133.field2163++] = var4;
                var5.field3854 = class199.field3367;
            } else {
                int var7 = class75.field1223.method1687(2, (byte) 26);
                if (var7 == 0) {
                    class288.field4914[class133.field2163++] = var4;
                    var5.field3854 = class199.field3367;
                    class21.field224[class294.field5010++] = var4;
                } else if (var7 == 1) {
                    class288.field4914[class133.field2163++] = var4;
                    var5.field3854 = class199.field3367;
                    int var8 = class75.field1223.method1687(3, (byte) 26);
                    var5.method1580(false, (byte) -92, var8);
                    int var9 = class75.field1223.method1687(1, (byte) 26);
                    if (var9 == 1) {
                        class21.field224[class294.field5010++] = var4;
                    }
                } else if (var7 == 2) {
                    class288.field4914[class133.field2163++] = var4;
                    var5.field3854 = class199.field3367;
                    int var10 = class75.field1223.method1687(3, (byte) 26);
                    var5.method1580(true, (byte) -92, var10);
                    int var11 = class75.field1223.method1687(3, (byte) 26);
                    var5.method1580(true, (byte) -92, var11);
                    int var12 = class75.field1223.method1687(1, (byte) 26);
                    if (var12 == 1) {
                        class21.field224[class294.field5010++] = var4;
                    }
                } else if (var7 == 3) {
                    class97.field1597[class258.field4354++] = var4;
                }
            }
        }
    }
}
