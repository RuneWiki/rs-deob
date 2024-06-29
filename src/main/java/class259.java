import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qi")
public class class259 {

    @OriginalMember(owner = "client!qi", name = "g", descriptor = "Lhh;")
    private class177 field4451 = new class177();

    @OriginalMember(owner = "client!qi", name = "q", descriptor = "Lhh;")
    private class177 field4461 = new class177();

    @OriginalMember(owner = "client!qi", name = "x", descriptor = "Lhh;")
    private class177 field4468 = new class177();

    @OriginalMember(owner = "client!qi", name = "z", descriptor = "Lhh;")
    private class177 field4470 = new class177();

    @OriginalMember(owner = "client!qi", name = "A", descriptor = "Lng;")
    private class135 field4471 = new class135(4);

    @OriginalMember(owner = "client!qi", name = "G", descriptor = "B")
    private byte field4477 = 0;

    @OriginalMember(owner = "client!qi", name = "H", descriptor = "I")
    public volatile int field4478 = 0;

    @OriginalMember(owner = "client!qi", name = "F", descriptor = "I")
    public volatile int field4476 = 0;

    @OriginalMember(owner = "client!qi", name = "E", descriptor = "Lng;")
    private class135 field4475 = new class135(8);

    @OriginalMember(owner = "client!qi", name = "k", descriptor = "Lvf;")
    private static class265 field4455 = class87.method582(-46, "Loading config )2 ");

    @OriginalMember(owner = "client!qi", name = "w", descriptor = "Lvf;")
    public static class265 field4467 = field4455;

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "I")
    public static int field4445;

    @OriginalMember(owner = "client!qi", name = "b", descriptor = "I")
    public static int field4446;

    @OriginalMember(owner = "client!qi", name = "c", descriptor = "I")
    public static int field4447;

    @OriginalMember(owner = "client!qi", name = "d", descriptor = "I")
    public static int field4448;

    @OriginalMember(owner = "client!qi", name = "e", descriptor = "I")
    public static int field4449;

    @OriginalMember(owner = "client!qi", name = "f", descriptor = "I")
    public static int field4450;

    @OriginalMember(owner = "client!qi", name = "h", descriptor = "I")
    public static int field4452;

    @OriginalMember(owner = "client!qi", name = "i", descriptor = "I")
    public static int field4453;

    @OriginalMember(owner = "client!qi", name = "j", descriptor = "I")
    public static int field4454;

    @OriginalMember(owner = "client!qi", name = "l", descriptor = "I")
    public static int field4456;

    @OriginalMember(owner = "client!qi", name = "m", descriptor = "I")
    public static int field4457;

    @OriginalMember(owner = "client!qi", name = "n", descriptor = "I")
    public static int field4458;

    @OriginalMember(owner = "client!qi", name = "o", descriptor = "I")
    public static int field4459;

    @OriginalMember(owner = "client!qi", name = "p", descriptor = "I")
    public static int field4460;

    @OriginalMember(owner = "client!qi", name = "r", descriptor = "I")
    public static int field4462;

    @OriginalMember(owner = "client!qi", name = "s", descriptor = "I")
    public static int field4463;

    @OriginalMember(owner = "client!qi", name = "t", descriptor = "I")
    public static int field4464;

    @OriginalMember(owner = "client!qi", name = "u", descriptor = "I")
    public static int field4465;

    @OriginalMember(owner = "client!qi", name = "v", descriptor = "I")
    public static int field4466;

    @OriginalMember(owner = "client!qi", name = "y", descriptor = "I")
    public static int field4469;

    @OriginalMember(owner = "client!qi", name = "B", descriptor = "I")
    private int field4472;

    @OriginalMember(owner = "client!qi", name = "C", descriptor = "J")
    private long field4473;

    @OriginalMember(owner = "client!qi", name = "D", descriptor = "Lgb;")
    private class143 field4474;

    @OriginalMember(owner = "client!qi", name = "I", descriptor = "Lqb;")
    private class84 field4479;

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(I)Z")
    public final boolean method1709(int arg0) {
        field4452++;
        if (arg0 != 20) {
            this.method1716((class143) null, 106, false);
        }
        return this.method1724(2442) >= 20;
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(B)Z")
    public final boolean method1710(byte arg0) {
        if (arg0 <= 61) {
            this.field4479 = null;
        }
        field4454++;
        return this.method1713((byte) 102) >= 20;
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(II)V")
    public static final void method1711(int arg0, int arg1) {
        field4447++;
        if (arg1 == -3) {
            class23.field679.method1891(arg1 - 23546, arg0);
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(ZB)V")
    public final void method1712(boolean arg0, byte arg1) {
        field4466++;
        if (this.field4474 == null) {
            return;
        }
        try {
            this.field4471.field2449 = 0;
            int var3 = 16 % ((arg1 - 22) / 41);
            this.field4471.method903((byte) 36, arg0 ? 2 : 3);
            this.field4471.method937(0, (byte) -112);
            this.field4474.method982(0, true, this.field4471.field2483, 4);
        } catch (IOException var5) {
            try {
                this.field4474.method990(4);
            } catch (Exception var4) {
            }
            this.field4474 = null;
            this.field4476 = -2;
            this.field4478++;
        }
    }

    @OriginalMember(owner = "client!qi", name = "b", descriptor = "(B)I")
    private final int method1713(byte arg0) {
        field4458++;
        if (arg0 != 102) {
            this.field4476 = 92;
        }
        return this.field4468.method1151(0) + this.field4470.method1151(0);
    }

    @OriginalMember(owner = "client!qi", name = "b", descriptor = "(II)V")
    public static final void method1714(int arg0, int arg1) {
        field4460++;
        int var2 = 125 / ((arg0 + 65) / 43);
        if (class202.method1390(2, arg1)) {
            class275.method1882(7602, -1, class178.field3174[arg1]);
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(IIZZB)Lqb;")
    public final class84 method1715(int arg0, int arg1, boolean arg2, boolean arg3, byte arg4) {
        if (!arg3) {
            return null;
        }
        field4446++;
        long var6 = (long) ((arg1 << 16) + arg0);
        class84 var8 = new class84();
        var8.field727 = var6;
        var8.field1314 = arg2;
        var8.field1575 = arg4;
        if (arg2) {
            if (this.method1724(2442) >= 20) {
                throw new RuntimeException();
            }
            this.field4451.method1154(var8, -31849);
        } else if (this.method1713((byte) 102) < 20) {
            this.field4468.method1154(var8, -31849);
        } else {
            throw new RuntimeException();
        }
        return var8;
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(Lgb;IZ)V")
    public final void method1716(class143 arg0, int arg1, boolean arg2) {
        field4445++;
        if (this.field4474 != null) {
            try {
                this.field4474.method990(4);
            } catch (Exception var8) {
            }
            this.field4474 = null;
        }
        this.field4474 = arg0;
        this.method1717((byte) -87);
        this.method1712(arg2, (byte) -29);
        this.field4475.field2449 = 0;
        this.field4479 = null;
        if (arg1 < 116) {
            return;
        }
        while (true) {
            class84 var4 = (class84) this.field4461.method1147(false);
            if (var4 == null) {
                while (true) {
                    class84 var5 = (class84) this.field4470.method1147(false);
                    if (var5 == null) {
                        if (this.field4477 != 0) {
                            try {
                                this.field4471.field2449 = 0;
                                this.field4471.method903((byte) 36, 4);
                                this.field4471.method903((byte) 36, this.field4477);
                                this.field4471.method921(102, 0);
                                this.field4474.method982(0, true, this.field4471.field2483, 4);
                            } catch (IOException var7) {
                                try {
                                    this.field4474.method990(4);
                                } catch (Exception var6) {
                                }
                                this.field4474 = null;
                                this.field4476 = -2;
                                this.field4478++;
                            }
                        }
                        this.field4472 = 0;
                        this.field4473 = class136.method950(8954);
                        return;
                    }
                    this.field4468.method1154(var5, -31849);
                }
            }
            this.field4451.method1154(var4, -31849);
        }
    }

    @OriginalMember(owner = "client!qi", name = "c", descriptor = "(B)V")
    private final void method1717(byte arg0) {
        field4465++;
        if (this.field4474 == null) {
            return;
        }
        try {
            this.field4471.field2449 = 0;
            this.field4471.method903((byte) 36, 6);
            if (arg0 != -87) {
                this.field4475 = null;
            }
            this.field4471.method937(3, (byte) -112);
            this.field4474.method982(0, true, this.field4471.field2483, 4);
        } catch (IOException var3) {
            try {
                this.field4474.method990(4);
            } catch (Exception var2) {
            }
            this.field4474 = null;
            this.field4476 = -2;
            this.field4478++;
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(Z)V")
    public final void method1718(boolean arg0) {
        field4462++;
        if (this.field4474 == null) {
            return;
        }
        try {
            this.field4471.field2449 = 0;
            this.field4471.method903((byte) 36, 7);
            this.field4471.method937(0, (byte) -112);
            this.field4474.method982(0, arg0, this.field4471.field2483, 4);
        } catch (IOException var3) {
            try {
                this.field4474.method990(4);
            } catch (Exception var2) {
            }
            this.field4474 = null;
            this.field4476 = -2;
            this.field4478++;
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(ILng;)V")
    public static final void method1719(int arg0, class135 arg1) {
        field4448++;
        if (arg1.field2483.length - arg1.field2449 < 1) {
            return;
        }
        int var2 = arg1.method920((byte) 25);
        if (var2 < 0 || var2 > 11) {
            return;
        }
        byte var3;
        if (var2 == 11) {
            var3 = 33;
        } else if (var2 == 10) {
            var3 = 32;
        } else if (var2 == 9) {
            var3 = 31;
        } else if (var2 == 8) {
            var3 = 30;
        } else if (var2 == 7) {
            var3 = 29;
        } else if (var2 == 6) {
            var3 = 28;
        } else if (var2 == 5) {
            var3 = 28;
        } else if (var2 == 4) {
            var3 = 24;
        } else if (var2 == 3) {
            var3 = 23;
        } else if (var2 == 2) {
            var3 = 22;
        } else if (var2 == 1) {
            var3 = 23;
        } else {
            var3 = 19;
        }
        if (arg1.field2483.length - arg1.field2449 < var3) {
            return;
        }
        class124.field2227 = arg1.method920((byte) 33);
        if (class124.field2227 < 1) {
            class124.field2227 = 1;
        } else if (class124.field2227 > 4) {
            class124.field2227 = 4;
        }
        class162.method1072(-54, arg1.method920((byte) 43) == 1);
        class117.field2077 = arg1.method920((byte) 82) == 1;
        client.field3855 = arg1.method920((byte) 60) == 1;
        class19.field498 = arg1.method920((byte) 94) == 1;
        class61.field1219 = arg1.method920((byte) 46) == 1;
        class70.field1360 = arg1.method920((byte) 126) == 1;
        class196.field3505 = arg1.method920((byte) 50) == 1;
        class214.field3830 = arg1.method920((byte) 101) == 1;
        class107.field1895 = arg1.method920((byte) 127);
        if (class107.field1895 > 2) {
            class107.field1895 = 2;
        }
        if (var2 < 2) {
            class258.field4428 = arg1.method920((byte) 47) == 1;
            arg1.method920((byte) 82);
        } else {
            class258.field4428 = arg1.method920((byte) 120) == 1;
        }
        class23.field688 = arg1.method920((byte) 56) == 1;
        class245.field4270 = arg1.method920((byte) 66) == 1;
        class54.field1119 = arg1.method920((byte) 115);
        if (class54.field1119 > 2) {
            class54.field1119 = 2;
        }
        class243.field4246 = class54.field1119;
        class127.field2273 = arg1.method920((byte) 26) == 1;
        class43.field959 = arg1.method920((byte) 53);
        if (class43.field959 > 127) {
            class43.field959 = 127;
        }
        class105.field1868 = arg1.method920((byte) 91);
        class172.field3095 = arg1.method920((byte) 78);
        if (class172.field3095 > 127) {
            class172.field3095 = 127;
        }
        if (var2 >= 1) {
            class283.field4990 = arg1.method927(127);
            class10.field341 = arg1.method927(125);
        }
        if (var2 >= 3 && var2 < 6) {
            arg1.method920((byte) 81);
        }
        if (var2 >= 4) {
            int var4 = arg1.method920((byte) 126);
            if (class105.field1851 < 96) {
                var4 = 0;
            }
            class255.method1679(var4);
        }
        if (var2 >= 5) {
            class77.field1469 = arg1.method949(3933);
        }
        if (var2 >= 6) {
            class50.field1058 = arg1.method920((byte) 91);
        }
        if (var2 >= 7) {
            class100.field1774 = arg1.method920((byte) 103) == 1;
        }
        if (~var2 <= arg0) {
            class253.field4359 = arg1.method920((byte) 45) == 1;
        }
        if (var2 >= 9) {
            class221.field3970 = arg1.method920((byte) 31);
        }
        if (var2 >= 10) {
            class186.field3373 = arg1.method920((byte) 68) != 0;
        }
        if (var2 >= 11) {
            class110.field1924 = arg1.method920((byte) 53) != 0;
        }
    }

    @OriginalMember(owner = "client!qi", name = "b", descriptor = "(I)V")
    public static void method1720(int arg0) {
        if (arg0 != 19562) {
            field4463 = 103;
        }
        field4467 = null;
        field4455 = null;
    }

    @OriginalMember(owner = "client!qi", name = "b", descriptor = "(Z)V")
    public final void method1721(boolean arg0) {
        if (this.field4474 != null) {
            this.field4474.method988(-4020);
        }
        if (!arg0) {
            field4453++;
        }
    }

    @OriginalMember(owner = "client!qi", name = "c", descriptor = "(Z)V")
    public final void method1722(boolean arg0) {
        field4450++;
        try {
            this.field4474.method990(4);
        } catch (Exception var2) {
        }
        this.field4478++;
        this.field4476 = -1;
        this.field4474 = null;
        if (!arg0) {
            this.method1718(false);
        }
        this.field4477 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
    }

    @OriginalMember(owner = "client!qi", name = "c", descriptor = "(I)V")
    public final void method1723(int arg0) {
        field4469++;
        if (arg0 >= 35 && this.field4474 != null) {
            this.field4474.method990(4);
        }
    }

    @OriginalMember(owner = "client!qi", name = "d", descriptor = "(I)I")
    public final int method1724(int arg0) {
        if (arg0 != 2442) {
            this.method1723(3);
        }
        field4459++;
        return this.field4451.method1151(arg0 ^ 0x98A) + this.field4461.method1151(0);
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(ILvf;ILvf;)V")
    public static final void method1725(int arg0, class265 arg1, int arg2, class265 arg3) {
        if (arg0 >= -54) {
            method1714(-42, -95);
        }
        field4464++;
        client.method1468(arg3, -1, (class265) null, -98, arg1, arg2);
    }

    @OriginalMember(owner = "client!qi", name = "c", descriptor = "(II)Z")
    public static final boolean method1726(int arg0, int arg1) {
        if (arg1 == -12) {
            field4449++;
            return (arg0 >> 31 & 0x1) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!qi", name = "e", descriptor = "(I)Z")
    public final boolean method1727(int arg0) {
        if (this.field4474 != null) {
            long var2 = class136.method950(8954);
            int var4 = (int) (var2 - this.field4473);
            this.field4473 = var2;
            if (var4 > 200) {
                var4 = 200;
            }
            this.field4472 += var4;
            if (this.field4472 > 30000) {
                try {
                    this.field4474.method990(4);
                } catch (Exception var27) {
                }
                this.field4474 = null;
            }
        }
        field4456++;
        if (this.field4474 == null) {
            return this.method1724(2442) == 0 && this.method1713((byte) 102) == 0;
        }
        try {
            this.field4474.method983(8);
            for (class84 var5 = (class84) this.field4451.method1148(-124); var5 != null; var5 = (class84) this.field4451.method1153(arg0 ^ 0x64)) {
                this.field4471.field2449 = 0;
                this.field4471.method903((byte) 36, 1);
                this.field4471.method937((int) var5.field727, (byte) -112);
                this.field4474.method982(0, true, this.field4471.field2483, 4);
                this.field4461.method1154(var5, -31849);
            }
            for (class84 var6 = (class84) this.field4468.method1148(-127); var6 != null; var6 = (class84) this.field4468.method1153(100)) {
                this.field4471.field2449 = 0;
                this.field4471.method903((byte) 36, 0);
                this.field4471.method937((int) var6.field727, (byte) -112);
                this.field4474.method982(0, true, this.field4471.field2483, 4);
                this.field4470.method1154(var6, -31849);
            }
            for (int var7 = arg0; var7 < 100; var7++) {
                int var8 = this.field4474.method987((byte) 53);
                if (var8 < 0) {
                    throw new IOException();
                }
                if (var8 == 0) {
                    break;
                }
                this.field4472 = 0;
                byte var9 = 0;
                if (this.field4479 == null) {
                    var9 = 8;
                } else if (this.field4479.field1573 == 0) {
                    var9 = 1;
                }
                if (var9 <= 0) {
                    int var10 = this.field4479.field1568.field2483.length - this.field4479.field1575;
                    int var11 = 512 - this.field4479.field1573;
                    if (var10 - this.field4479.field1568.field2449 < var11) {
                        var11 = var10 - this.field4479.field1568.field2449;
                    }
                    if (var8 < var11) {
                        var11 = var8;
                    }
                    this.field4474.method986(var11, this.field4479.field1568.field2449, this.field4479.field1568.field2483, 13418);
                    if (this.field4477 != 0) {
                        for (int var12 = 0; var12 < var11; var12++) {
                            this.field4479.field1568.field2483[this.field4479.field1568.field2449 + var12] = (byte) class100.method662(this.field4479.field1568.field2483[this.field4479.field1568.field2449 + var12], this.field4477);
                        }
                    }
                    this.field4479.field1573 += var11;
                    this.field4479.field1568.field2449 += var11;
                    if (this.field4479.field1568.field2449 == var10) {
                        this.field4479.method238((byte) 65);
                        this.field4479.field1315 = false;
                        this.field4479 = null;
                    } else if (this.field4479.field1573 == 512) {
                        this.field4479.field1573 = 0;
                    }
                } else {
                    int var13 = var9 - this.field4475.field2449;
                    if (var13 > var8) {
                        var13 = var8;
                    }
                    this.field4474.method986(var13, this.field4475.field2449, this.field4475.field2483, 13418);
                    if (this.field4477 != 0) {
                        for (int var14 = 0; var14 < var13; var14++) {
                            this.field4475.field2483[this.field4475.field2449 + var14] = (byte) class100.method662(this.field4475.field2483[this.field4475.field2449 + var14], this.field4477);
                        }
                    }
                    this.field4475.field2449 += var13;
                    if (var9 <= this.field4475.field2449) {
                        if (this.field4479 == null) {
                            this.field4475.field2449 = 0;
                            int var15 = this.field4475.method920((byte) 92);
                            int var16 = this.field4475.method927(126);
                            int var17 = this.field4475.method920((byte) 80);
                            int var18 = var17 & 0x7F;
                            boolean var19 = (var17 & 0x80) != 0;
                            long var20 = (long) ((var15 << 16) + var16);
                            int var22 = this.field4475.method949(3933);
                            Object var23 = null;
                            class84 var24;
                            if (var19) {
                                for (var24 = (class84) this.field4470.method1148(-128); var24 != null && var24.field727 != var20; var24 = (class84) this.field4470.method1153(arg0 ^ 0x64)) {
                                }
                            } else {
                                for (var24 = (class84) this.field4461.method1148(7); var24 != null && var24.field727 != var20; var24 = (class84) this.field4461.method1153(100)) {
                                }
                            }
                            if (var24 == null) {
                                throw new IOException();
                            }
                            this.field4479 = var24;
                            int var25 = var18 == 0 ? 5 : 9;
                            this.field4479.field1568 = new class135(this.field4479.field1575 + var25 + var22);
                            this.field4479.field1568.method903((byte) 36, var18);
                            this.field4479.field1568.method898((byte) 120, var22);
                            this.field4475.field2449 = 0;
                            this.field4479.field1573 = 8;
                        } else if (this.field4479.field1573 != 0) {
                            throw new IOException();
                        } else if (this.field4475.field2483[0] == -1) {
                            this.field4479.field1573 = 1;
                            this.field4475.field2449 = 0;
                        } else {
                            this.field4479 = null;
                        }
                    }
                }
            }
            return true;
        } catch (IOException var28) {
            try {
                this.field4474.method990(4);
            } catch (Exception var26) {
            }
            this.field4478++;
            this.field4474 = null;
            this.field4476 = -2;
            return this.method1724(2442) == 0 && this.method1713((byte) 102) == 0;
        }
    }
}
