import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bo")
public class class347 {

    @OriginalMember(owner = "client!bo", name = "r", descriptor = "Lea;")
    private class227 field5548 = new class227();

    @OriginalMember(owner = "client!bo", name = "u", descriptor = "Lea;")
    private class227 field5551 = new class227();

    @OriginalMember(owner = "client!bo", name = "v", descriptor = "Lea;")
    private class227 field5552 = new class227();

    @OriginalMember(owner = "client!bo", name = "w", descriptor = "Lea;")
    private class227 field5553 = new class227();

    @OriginalMember(owner = "client!bo", name = "A", descriptor = "Loe;")
    private class146 field5557 = new class146(4);

    @OriginalMember(owner = "client!bo", name = "B", descriptor = "B")
    private byte field5558 = 0;

    @OriginalMember(owner = "client!bo", name = "D", descriptor = "I")
    public volatile int field5560 = 0;

    @OriginalMember(owner = "client!bo", name = "C", descriptor = "I")
    public volatile int field5559 = 0;

    @OriginalMember(owner = "client!bo", name = "E", descriptor = "Loe;")
    private class146 field5561 = new class146(8);

    @OriginalMember(owner = "client!bo", name = "e", descriptor = "I")
    public static int field5535 = 0;

    @OriginalMember(owner = "client!bo", name = "l", descriptor = "Lsf;")
    public static class124 field5542 = new class124(64);

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "I")
    public static int field5531;

    @OriginalMember(owner = "client!bo", name = "b", descriptor = "I")
    public static int field5532;

    @OriginalMember(owner = "client!bo", name = "c", descriptor = "I")
    public static int field5533;

    @OriginalMember(owner = "client!bo", name = "d", descriptor = "I")
    public static int field5534;

    @OriginalMember(owner = "client!bo", name = "f", descriptor = "I")
    public static int field5536;

    @OriginalMember(owner = "client!bo", name = "g", descriptor = "I")
    public static int field5537;

    @OriginalMember(owner = "client!bo", name = "h", descriptor = "I")
    public static int field5538;

    @OriginalMember(owner = "client!bo", name = "i", descriptor = "I")
    public static int field5539;

    @OriginalMember(owner = "client!bo", name = "j", descriptor = "I")
    public static int field5540;

    @OriginalMember(owner = "client!bo", name = "k", descriptor = "I")
    public static int field5541;

    @OriginalMember(owner = "client!bo", name = "m", descriptor = "I")
    public static int field5543;

    @OriginalMember(owner = "client!bo", name = "n", descriptor = "I")
    public static int field5544;

    @OriginalMember(owner = "client!bo", name = "o", descriptor = "I")
    public static int field5545;

    @OriginalMember(owner = "client!bo", name = "p", descriptor = "I")
    public static int field5546;

    @OriginalMember(owner = "client!bo", name = "s", descriptor = "I")
    public static int field5549;

    @OriginalMember(owner = "client!bo", name = "t", descriptor = "I")
    public static int field5550;

    @OriginalMember(owner = "client!bo", name = "z", descriptor = "I")
    private int field5556;

    @OriginalMember(owner = "client!bo", name = "y", descriptor = "J")
    private long field5555;

    @OriginalMember(owner = "client!bo", name = "x", descriptor = "Ldk;")
    private class237 field5554;

    @OriginalMember(owner = "client!bo", name = "F", descriptor = "Lcg;")
    private class50 field5562;

    @OriginalMember(owner = "client!bo", name = "q", descriptor = "Z")
    public static boolean field5547;

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(I)V", line = 4)
    public static void method2470(int arg0) {
        if (arg0 >= -107) {
            field5542 = (class124) null;
        }
        field5542 = null;
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(B)V", line = 14)
    public final void method2471(byte arg0) {
        if (arg0 > 16) {
            if (this.field5554 != null) {
                this.field5554.method1646((byte) 87);
            }
            field5544++;
        }
    }

    @OriginalMember(owner = "client!bo", name = "b", descriptor = "(I)Z", line = 40)
    public final boolean method2472(int arg0) {
        int var2 = -88 % ((arg0 - 19) / 63);
        field5541++;
        return this.method2476(5) >= 20;
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(Z)Z", line = 49)
    public final boolean method2473(boolean arg0) {
        field5537++;
        if (this.field5554 != null) {
            long var2 = class218.method1520((byte) 54);
            int var4 = (int) (var2 - this.field5555);
            this.field5555 = var2;
            if (var4 > 200) {
                var4 = 200;
            }
            this.field5556 += var4;
            if (this.field5556 > 30000) {
                try {
                    this.field5554.method1646((byte) 76);
                } catch (Exception var30) {
                }
                this.field5554 = null;
            }
        }
        if (this.field5554 == null) {
            return this.method2480(128) == 0 && this.method2476(5) == 0;
        }
        if (!arg0) {
            field5547 = true;
        }
        try {
            this.field5554.method1641(0);
            for (class50 var6 = (class50) this.field5548.method1580((byte) -127); var6 != null; var6 = (class50) this.field5548.method1586((byte) 50)) {
                this.field5557.field2435 = 0;
                this.field5557.method1027(1, -20374);
                this.field5557.method1049(-114, (int) var6.field4902);
                this.field5554.method1645(this.field5557.field2496, 4, -20326, 0);
                this.field5551.method1585(var6, (byte) -12);
            }
            for (class50 var7 = (class50) this.field5552.method1580((byte) -119); var7 != null; var7 = (class50) this.field5552.method1586((byte) 50)) {
                this.field5557.field2435 = 0;
                this.field5557.method1027(0, -20374);
                this.field5557.method1049(113, (int) var7.field4902);
                this.field5554.method1645(this.field5557.field2496, 4, -20326, 0);
                this.field5553.method1585(var7, (byte) -12);
            }
            for (int var8 = 0; var8 < 100; var8++) {
                int var9 = this.field5554.method1642((byte) -89);
                if (var9 < 0) {
                    throw new IOException();
                }
                if (var9 == 0) {
                    break;
                }
                this.field5556 = 0;
                byte var10 = 0;
                if (this.field5562 == null) {
                    var10 = 8;
                } else if (this.field5562.field1029 == 0) {
                    var10 = 1;
                }
                if (var10 > 0) {
                    int var11 = var10 - this.field5561.field2435;
                    if (var11 > var9) {
                        var11 = var9;
                    }
                    this.field5554.method1643(this.field5561.field2435, var11, (byte) -87, this.field5561.field2496);
                    if (this.field5558 != 0) {
                        for (int var12 = 0; var12 < var11; var12++) {
                            this.field5561.field2496[this.field5561.field2435 + var12] = (byte) class115.method856(this.field5561.field2496[this.field5561.field2435 + var12], this.field5558);
                        }
                    }
                    this.field5561.field2435 += var11;
                    if (this.field5561.field2435 >= var10) {
                        if (this.field5562 == null) {
                            this.field5561.field2435 = 0;
                            int var13 = this.field5561.method1005((byte) 122);
                            int var14 = this.field5561.method989(71);
                            int var15 = this.field5561.method1005((byte) 122);
                            boolean var16 = (var15 & 0x80) != 0;
                            int var17 = this.field5561.method1004(3);
                            long var18 = (long) ((var13 << 16) + var14);
                            int var20 = var15 & 0x7F;
                            Object var21 = null;
                            class50 var22;
                            if (var16) {
                                for (var22 = (class50) this.field5553.method1580((byte) -121); var22 != null && var22.field4902 != var18; var22 = (class50) this.field5553.method1586((byte) 50)) {
                                }
                            } else {
                                for (var22 = (class50) this.field5551.method1580((byte) -120); var22 != null && var22.field4902 != var18; var22 = (class50) this.field5551.method1586((byte) 50)) {
                                }
                            }
                            if (var22 == null) {
                                throw new IOException();
                            }
                            int var23 = var20 == 0 ? 5 : 9;
                            this.field5562 = var22;
                            this.field5562.field1030 = new class146(var17 + this.field5562.field1028 + var23);
                            this.field5562.field1030.method1027(var20, -20374);
                            this.field5562.field1030.method1045((byte) -33, var17);
                            this.field5562.field1029 = 8;
                            this.field5561.field2435 = 0;
                        } else if (this.field5562.field1029 != 0) {
                            throw new IOException();
                        } else if (this.field5561.field2496[0] == -1) {
                            this.field5562.field1029 = 1;
                            this.field5561.field2435 = 0;
                        } else {
                            this.field5562 = null;
                        }
                    }
                } else {
                    int var24 = 512 - this.field5562.field1029;
                    int var25 = this.field5562.field1030.field2496.length - this.field5562.field1028;
                    if (var24 > (var25 - this.field5562.field1030.field2435)) {
                        var24 = var25 - this.field5562.field1030.field2435;
                    }
                    if (var9 < var24) {
                        var24 = var9;
                    }
                    this.field5554.method1643(this.field5562.field1030.field2435, var24, (byte) -113, this.field5562.field1030.field2496);
                    if (this.field5558 != 0) {
                        for (int var26 = 0; var26 < var24; var26++) {
                            this.field5562.field1030.field2496[this.field5562.field1030.field2435 + var26] = (byte) class115.method856(this.field5562.field1030.field2496[this.field5562.field1030.field2435 + var26], this.field5558);
                        }
                    }
                    this.field5562.field1030.field2435 += var24;
                    this.field5562.field1029 += var24;
                    if (this.field5562.field1030.field2435 == var25) {
                        this.field5562.method2152((byte) 127);
                        this.field5562.field1243 = false;
                        this.field5562 = null;
                    } else if (this.field5562.field1029 == 512) {
                        this.field5562.field1029 = 0;
                    }
                }
            }
            return true;
        } catch (IOException var31) {
            try {
                this.field5554.method1646((byte) 124);
            } catch (Exception var29) {
            }
            this.field5560++;
            this.field5554 = null;
            this.field5559 = -2;
            return this.method2480(128) == 0 && this.method2476(5) == 0;
        }
    }

    @OriginalMember(owner = "client!bo", name = "b", descriptor = "(B)V", line = 332)
    public static final void method2474(byte arg0) {
        field5539++;
        if (class295.field4818 || arg0 > -125) {
            return;
        }
        class312.field5074 = true;
        if (class151.field2559) {
            class87.field1523 = (float) ((int) class87.field1523 + 47 & 0xFFFFFFF0);
        } else {
            class335.field5335 += (12.0F - class335.field5335) / 2.0F;
        }
        class295.field4818 = true;
    }

    @OriginalMember(owner = "client!bo", name = "c", descriptor = "(I)V", line = 359)
    public final void method2475(int arg0) {
        field5532++;
        if (this.field5554 == null) {
            return;
        }
        try {
            this.field5557.field2435 = 0;
            this.field5557.method1027(7, -20374);
            if (arg0 > -64) {
                this.field5553 = (class227) null;
            }
            this.field5557.method1049(122, 0);
            this.field5554.method1645(this.field5557.field2496, 4, -20326, 0);
        } catch (IOException var5) {
            try {
                this.field5554.method1646((byte) 91);
            } catch (Exception var4) {
            }
            this.field5554 = null;
            this.field5560++;
            this.field5559 = -2;
        }
    }

    @OriginalMember(owner = "client!bo", name = "d", descriptor = "(I)I", line = 388)
    private final int method2476(int arg0) {
        if (arg0 != 5) {
            method2474((byte) 24);
        }
        field5545++;
        return this.field5552.method1584((byte) 5) + this.field5553.method1584((byte) 5);
    }

    @OriginalMember(owner = "client!bo", name = "e", descriptor = "(I)V", line = 400)
    public final void method2477(int arg0) {
        try {
            if (arg0 != -13850) {
                field5535 = 102;
            }
            this.field5554.method1646((byte) 100);
        } catch (Exception var3) {
        }
        field5538++;
        this.field5554 = null;
        this.field5558 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
        this.field5559 = -1;
        this.field5560++;
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(ZILdk;)V", line = 419)
    public final void method2478(boolean arg0, int arg1, class237 arg2) {
        if (this.field5554 != null) {
            try {
                this.field5554.method1646((byte) 99);
            } catch (Exception var11) {
            }
            this.field5554 = null;
        }
        this.field5554 = arg2;
        this.method2483(-2);
        this.method2484(2, arg0);
        if (arg1 != -30821) {
            field5542 = (class124) null;
        }
        this.field5562 = null;
        field5549++;
        this.field5561.field2435 = 0;
        while (true) {
            class50 var5 = (class50) this.field5551.method1587(0);
            if (var5 == null) {
                while (true) {
                    class50 var6 = (class50) this.field5553.method1587(arg1 ^ 0xFFFF879B);
                    if (var6 == null) {
                        if (this.field5558 != 0) {
                            try {
                                this.field5557.field2435 = 0;
                                this.field5557.method1027(4, arg1 ^ 0x37F1);
                                this.field5557.method1027(this.field5558, -20374);
                                this.field5557.method1002((byte) -113, 0);
                                this.field5554.method1645(this.field5557.field2496, 4, -20326, 0);
                            } catch (IOException var10) {
                                try {
                                    this.field5554.method1646((byte) 106);
                                } catch (Exception var9) {
                                }
                                this.field5560++;
                                this.field5559 = -2;
                                this.field5554 = null;
                            }
                        }
                        this.field5556 = 0;
                        this.field5555 = class218.method1520((byte) 34);
                        return;
                    }
                    this.field5552.method1585(var6, (byte) -12);
                }
            }
            this.field5548.method1585(var5, (byte) -12);
        }
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(ZBLmi;III)V", line = 490)
    public static final void method2479(boolean arg0, byte arg1, class300 arg2, int arg3, int arg4, int arg5) {
        field5534++;
        if (class271.field4414 >= 50 || arg2 == null || arg2.field4874 == null || arg3 >= arg2.field4874.length || arg2.field4874[arg3] == null) {
            return;
        }
        int var6 = arg2.field4874[arg3][0];
        int var7 = var6 >> 8;
        if (arg2.field4874[arg3].length > 1) {
            int var8 = (int) (Math.random() * (double) arg2.field4874[arg3].length);
            if (var8 > 0) {
                var7 = arg2.field4874[arg3][var8];
            }
        }
        int var9 = var6 & 0x1F;
        int var10 = (var6 & 0xF1) >> 5;
        if (arg1 >= -45) {
            field5535 = -107;
        }
        if (var9 == 0) {
            if (arg0) {
                class23.method195(46, var7, var10, 255, 0);
            }
        } else if (class30.field706 != 0) {
            class1.field9[class271.field4414] = var7;
            int var11 = (arg4 - 64) / 128;
            int var12 = (arg5 - 64) / 128;
            class36.field794[class271.field4414] = var10;
            class25.field649[class271.field4414] = 0;
            class222.field3672[class271.field4414] = null;
            class338.field5353[class271.field4414] = 255;
            class22.field554[class271.field4414] = (var11 << 16) + (var12 << 8) + var9;
            class271.field4414++;
        }
    }

    @OriginalMember(owner = "client!bo", name = "f", descriptor = "(I)I", line = 549)
    public final int method2480(int arg0) {
        field5550++;
        return arg0 == 128 ? this.field5548.method1584((byte) 5) + this.field5551.method1584((byte) 5) : -95;
    }

    @OriginalMember(owner = "client!bo", name = "c", descriptor = "(B)V", line = 560)
    public final void method2481(byte arg0) {
        field5531++;
        if (arg0 != -79) {
            field5547 = false;
        }
        if (this.field5554 != null) {
            this.field5554.method1644(-26255);
        }
    }

    @OriginalMember(owner = "client!bo", name = "g", descriptor = "(I)Z", line = 582)
    public final boolean method2482(int arg0) {
        if (arg0 != 512) {
            this.method2484(-36, true);
        }
        field5546++;
        return this.method2480(arg0 ^ 0x280) >= 20;
    }

    @OriginalMember(owner = "client!bo", name = "h", descriptor = "(I)V", line = 593)
    private final void method2483(int arg0) {
        if (arg0 != -2) {
            this.field5552 = (class227) null;
        }
        field5540++;
        if (this.field5554 == null) {
            return;
        }
        try {
            this.field5557.field2435 = 0;
            this.field5557.method1027(6, arg0 - 20372);
            this.field5557.method1049(113, 3);
            this.field5554.method1645(this.field5557.field2496, 4, -20326, 0);
        } catch (IOException var5) {
            try {
                this.field5554.method1646((byte) 105);
            } catch (Exception var4) {
            }
            this.field5559 = -2;
            this.field5560++;
            this.field5554 = null;
        }
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(IZ)V", line = 623)
    public final void method2484(int arg0, boolean arg1) {
        field5533++;
        if (this.field5554 == null) {
            return;
        }
        try {
            this.field5557.field2435 = 0;
            this.field5557.method1027(arg1 ? 2 : 3, -20374);
            this.field5557.method1049(-87, 0);
            this.field5554.method1645(this.field5557.field2496, 4, -20326, 0);
        } catch (IOException var6) {
            try {
                this.field5554.method1646((byte) 85);
            } catch (Exception var5) {
            }
            this.field5554 = null;
            this.field5559 = -2;
            this.field5560++;
        }
        if (arg0 != 2) {
            method2474((byte) 103);
        }
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(IBIIZ)Lcg;", line = 653)
    public final class50 method2485(int arg0, byte arg1, int arg2, int arg3, boolean arg4) {
        long var6 = (long) ((arg3 << 16) + arg2);
        field5543++;
        class50 var8 = new class50();
        var8.field4902 = var6;
        var8.field1242 = arg4;
        var8.field1028 = arg1;
        if (arg4) {
            if (this.method2480(arg0 ^ 0x80) >= 20) {
                throw new RuntimeException();
            }
            this.field5548.method1585(var8, (byte) -12);
        } else if (this.method2476(5) < 20) {
            this.field5552.method1585(var8, (byte) -12);
        } else {
            throw new RuntimeException();
        }
        if (arg0 != 0) {
            this.field5558 = 82;
        }
        return var8;
    }
}
