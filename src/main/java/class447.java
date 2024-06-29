import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sn")
public class class447 {

    @OriginalMember(owner = "client!sn", name = "c", descriptor = "Lso;")
    private class330 field6504 = new class330();

    @OriginalMember(owner = "client!sn", name = "o", descriptor = "Lso;")
    private class330 field6516 = new class330();

    @OriginalMember(owner = "client!sn", name = "q", descriptor = "Lso;")
    private class330 field6518 = new class330();

    @OriginalMember(owner = "client!sn", name = "y", descriptor = "Lso;")
    private class330 field6526 = new class330();

    @OriginalMember(owner = "client!sn", name = "A", descriptor = "Lug;")
    private class396 field6528 = new class396(4);

    @OriginalMember(owner = "client!sn", name = "F", descriptor = "B")
    private byte field6533 = 0;

    @OriginalMember(owner = "client!sn", name = "E", descriptor = "I")
    public volatile int field6532 = 0;

    @OriginalMember(owner = "client!sn", name = "G", descriptor = "I")
    public volatile int field6534 = 0;

    @OriginalMember(owner = "client!sn", name = "D", descriptor = "Lug;")
    private class396 field6531 = new class396(8);

    @OriginalMember(owner = "client!sn", name = "k", descriptor = "[I")
    public static int[] field6512 = new int[1000];

    @OriginalMember(owner = "client!sn", name = "r", descriptor = "I")
    public static int field6519;

    @OriginalMember(owner = "client!sn", name = "u", descriptor = "[B")
    public static byte[] field6522;

    @OriginalMember(owner = "client!sn", name = "s", descriptor = "Z")
    public static boolean field6520;

    @OriginalMember(owner = "client!sn", name = "x", descriptor = "I")
    public static int field6525;

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "I")
    public static int field6502;

    @OriginalMember(owner = "client!sn", name = "b", descriptor = "I")
    public static int field6503;

    @OriginalMember(owner = "client!sn", name = "d", descriptor = "I")
    public static int field6505;

    @OriginalMember(owner = "client!sn", name = "e", descriptor = "I")
    public static int field6506;

    @OriginalMember(owner = "client!sn", name = "f", descriptor = "I")
    public static int field6507;

    @OriginalMember(owner = "client!sn", name = "g", descriptor = "I")
    public static int field6508;

    @OriginalMember(owner = "client!sn", name = "h", descriptor = "I")
    public static int field6509;

    @OriginalMember(owner = "client!sn", name = "i", descriptor = "I")
    public static int field6510;

    @OriginalMember(owner = "client!sn", name = "j", descriptor = "I")
    public static int field6511;

    @OriginalMember(owner = "client!sn", name = "l", descriptor = "I")
    public static int field6513;

    @OriginalMember(owner = "client!sn", name = "m", descriptor = "I")
    public static int field6514;

    @OriginalMember(owner = "client!sn", name = "n", descriptor = "I")
    public static int field6515;

    @OriginalMember(owner = "client!sn", name = "p", descriptor = "I")
    public static int field6517;

    @OriginalMember(owner = "client!sn", name = "t", descriptor = "I")
    public static int field6521;

    @OriginalMember(owner = "client!sn", name = "w", descriptor = "I")
    public static int field6524;

    @OriginalMember(owner = "client!sn", name = "B", descriptor = "I")
    private int field6529;

    @OriginalMember(owner = "client!sn", name = "z", descriptor = "J")
    private long field6527;

    @OriginalMember(owner = "client!sn", name = "H", descriptor = "Lul;")
    private class406 field6535;

    @OriginalMember(owner = "client!sn", name = "C", descriptor = "Lke;")
    private class426 field6530;

    @OriginalMember(owner = "client!sn", name = "v", descriptor = "[Lns;")
    public static class279[] field6523;

    static {
        new class305("To talk, start each line of chat with the / symbol.", "Leite eine Zeile mit / ein, um hier zu chatten.", "Pour parler, insérez le symbole / au début de chaque ligne.", "Para falar, comece cada linha de conversa com o símbolo /.");
        field6519 = 0;
        field6522 = new byte[2048];
        field6520 = false;
        field6525 = 0;
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(ZLke;B)V", line = 10)
    public final void method2758(boolean arg0, class426 arg1, byte arg2) {
        if (this.field6530 != null) {
            try {
                this.field6530.method2625(true);
            } catch (Exception var8) {
            }
            this.field6530 = null;
        }
        field6511++;
        this.field6530 = arg1;
        this.method2770(-123);
        this.method2768(arg0, -2075);
        this.field6531.field5729 = 0;
        this.field6535 = null;
        while (true) {
            class406 var4 = (class406) this.field6516.method1934((byte) -95);
            if (var4 == null) {
                if (arg2 != -10) {
                    this.method2759(3, 25, (byte) -98, (byte) 91, false);
                }
                while (true) {
                    class406 var5 = (class406) this.field6526.method1934((byte) 94);
                    if (var5 == null) {
                        if (this.field6533 != 0) {
                            try {
                                this.field6528.field5729 = 0;
                                this.field6528.method2449((byte) 126, 4);
                                this.field6528.method2449((byte) 116, this.field6533);
                                this.field6528.method2444((byte) 65, 0);
                                this.field6530.method2620(true, this.field6528.field5761, 0, 4);
                            } catch (IOException var7) {
                                try {
                                    this.field6530.method2625(true);
                                } catch (Exception var6) {
                                }
                                this.field6532++;
                                this.field6534 = -2;
                                this.field6530 = null;
                            }
                        }
                        this.field6529 = 0;
                        this.field6527 = class45.method252((byte) -8);
                        return;
                    }
                    this.field6518.method1938(true, var5);
                }
            }
            this.field6504.method1938(true, var4);
        }
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(IIBBZ)Lul;", line = 78)
    public final class406 method2759(int arg0, int arg1, byte arg2, byte arg3, boolean arg4) {
        field6524++;
        int var6 = 3 / ((-arg2 - 33) / 33);
        long var7 = (long) ((arg1 << 16) + arg0);
        class406 var9 = new class406();
        var9.field7348 = var7;
        var9.field1863 = arg4;
        var9.field5841 = arg3;
        if (arg4) {
            if (this.method2762((byte) 111) >= 20) {
                throw new RuntimeException();
            }
            this.field6504.method1938(true, var9);
        } else if (this.method2772(64) < 20) {
            this.field6518.method1938(true, var9);
        } else {
            throw new RuntimeException();
        }
        return var9;
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(B)Z", line = 119)
    public final boolean method2760(byte arg0) {
        field6507++;
        int var2 = 29 / ((arg0 + 35) / 53);
        return this.method2772(79) >= 20;
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(I)V", line = 130)
    public final void method2761(int arg0) {
        if (this.field6530 != null) {
            this.field6530.method2623((byte) -79);
        }
        field6510++;
        if (arg0 != -31774) {
            this.method2768(true, -69);
        }
    }

    @OriginalMember(owner = "client!sn", name = "b", descriptor = "(B)I", line = 148)
    public final int method2762(byte arg0) {
        field6502++;
        if (arg0 < 101) {
            this.field6518 = null;
        }
        return this.field6504.method1936((byte) 60) + this.field6516.method1936((byte) 103);
    }

    @OriginalMember(owner = "client!sn", name = "b", descriptor = "(I)V", line = 160)
    public final void method2763(int arg0) {
        if (this.field6530 != null) {
            this.field6530.method2625(true);
        }
        field6508++;
        if (arg0 != -26346) {
            this.method2758(true, null, (byte) 87);
        }
    }

    @OriginalMember(owner = "client!sn", name = "c", descriptor = "(B)Z", line = 174)
    public final boolean method2764(byte arg0) {
        field6517++;
        if (this.field6530 != null) {
            long var2 = class45.method252((byte) -8);
            int var4 = (int) (var2 - this.field6527);
            if (var4 > 200) {
                var4 = 200;
            }
            this.field6527 = var2;
            this.field6529 += var4;
            if (this.field6529 > 30000) {
                try {
                    this.field6530.method2625(true);
                } catch (Exception var28) {
                }
                this.field6530 = null;
            }
        }
        if (this.field6530 == null) {
            return this.method2762((byte) 117) == 0 && this.method2772(52) == 0;
        }
        try {
            this.field6530.method2622(3);
            for (class406 var5 = (class406) this.field6504.method1937(false); var5 != null; var5 = (class406) this.field6504.method1932(-2)) {
                this.field6528.field5729 = 0;
                this.field6528.method2449((byte) 122, 1);
                this.field6528.method2399(true, (int) var5.field7348);
                this.field6530.method2620(true, this.field6528.field5761, 0, 4);
                this.field6516.method1938(true, var5);
            }
            for (class406 var6 = (class406) this.field6518.method1937(false); var6 != null; var6 = (class406) this.field6518.method1932(-2)) {
                this.field6528.field5729 = 0;
                this.field6528.method2449((byte) 123, 0);
                this.field6528.method2399(true, (int) var6.field7348);
                this.field6530.method2620(true, this.field6528.field5761, 0, 4);
                this.field6526.method1938(true, var6);
            }
            for (int var7 = 0; var7 < 100; var7++) {
                int var8 = this.field6530.method2624(121);
                if (var8 < 0) {
                    throw new IOException();
                }
                if (var8 == 0) {
                    break;
                }
                this.field6529 = 0;
                byte var9 = 0;
                if (this.field6535 == null) {
                    var9 = 8;
                } else if (this.field6535.field5834 == 0) {
                    var9 = 1;
                }
                if (var9 > 0) {
                    int var10 = var9 - this.field6531.field5729;
                    if (var8 < var10) {
                        var10 = var8;
                    }
                    this.field6530.method2621(false, this.field6531.field5729, var10, this.field6531.field5761);
                    if (this.field6533 != 0) {
                        for (int var11 = 0; var11 < var10; var11++) {
                            this.field6531.field5761[this.field6531.field5729 + var11] = (byte) class335.method1958(this.field6531.field5761[this.field6531.field5729 + var11], this.field6533);
                        }
                    }
                    this.field6531.field5729 += var10;
                    if (this.field6531.field5729 >= var9) {
                        if (this.field6535 == null) {
                            this.field6531.field5729 = 0;
                            int var12 = this.field6531.method2388((byte) -115);
                            int var13 = this.field6531.method2386(-23648);
                            int var14 = this.field6531.method2388((byte) -111);
                            int var15 = this.field6531.method2406((byte) -67);
                            int var16 = var14 & 0x7F;
                            boolean var17 = (var14 & 0x80) != 0;
                            long var18 = (long) ((var12 << 16) + var13);
                            Object var20 = null;
                            class406 var21;
                            if (var17) {
                                for (var21 = (class406) this.field6526.method1937(false); var21 != null && var21.field7348 != var18; var21 = (class406) this.field6526.method1932(-2)) {
                                }
                            } else {
                                for (var21 = (class406) this.field6516.method1937(false); var21 != null && var21.field7348 != var18; var21 = (class406) this.field6516.method1932(-2)) {
                                }
                            }
                            if (var21 == null) {
                                throw new IOException();
                            }
                            int var22 = var16 == 0 ? 5 : 9;
                            this.field6535 = var21;
                            this.field6535.field5839 = new class396(this.field6535.field5841 + var15 + var22);
                            this.field6535.field5839.method2449((byte) 115, var16);
                            this.field6535.field5839.method2398(116, var15);
                            this.field6535.field5834 = 8;
                            this.field6531.field5729 = 0;
                        } else if (this.field6535.field5834 != 0) {
                            throw new IOException();
                        } else if (this.field6531.field5761[0] == -1) {
                            this.field6535.field5834 = 1;
                            this.field6531.field5729 = 0;
                        } else {
                            this.field6535 = null;
                        }
                    }
                } else {
                    int var23 = this.field6535.field5839.field5761.length - this.field6535.field5841;
                    int var24 = 512 - this.field6535.field5834;
                    if ((var23 - this.field6535.field5839.field5729) < var24) {
                        var24 = var23 - this.field6535.field5839.field5729;
                    }
                    if (var24 > var8) {
                        var24 = var8;
                    }
                    this.field6530.method2621(false, this.field6535.field5839.field5729, var24, this.field6535.field5839.field5761);
                    if (this.field6533 != 0) {
                        for (int var25 = 0; var25 < var24; var25++) {
                            this.field6535.field5839.field5761[this.field6535.field5839.field5729 + var25] = (byte) class335.method1958(this.field6535.field5839.field5761[this.field6535.field5839.field5729 + var25], this.field6533);
                        }
                    }
                    this.field6535.field5839.field5729 += var24;
                    this.field6535.field5834 += var24;
                    if (this.field6535.field5839.field5729 == var23) {
                        this.field6535.method3022((byte) 54);
                        this.field6535.field1861 = false;
                        this.field6535 = null;
                    } else if (this.field6535.field5834 == 512) {
                        this.field6535.field5834 = 0;
                    }
                }
            }
            int var26 = -44 % ((arg0 - 70) / 34);
            return true;
        } catch (IOException var29) {
            try {
                this.field6530.method2625(true);
            } catch (Exception var27) {
            }
            this.field6530 = null;
            this.field6532++;
            this.field6534 = -2;
            return this.method2762((byte) 106) == 0 && this.method2772(106) == 0;
        }
    }

    @OriginalMember(owner = "client!sn", name = "d", descriptor = "(B)V", line = 441)
    public final void method2765(byte arg0) {
        field6513++;
        if (this.field6530 == null) {
            return;
        }
        try {
            this.field6528.field5729 = 0;
            this.field6528.method2449((byte) 127, 7);
            this.field6528.method2399(true, 0);
            if (arg0 != 76) {
                this.method2763(-57);
            }
            this.field6530.method2620(true, this.field6528.field5761, 0, 4);
        } catch (IOException var3) {
            try {
                this.field6530.method2625(true);
            } catch (Exception var2) {
            }
            this.field6532++;
            this.field6534 = -2;
            this.field6530 = null;
        }
    }

    @OriginalMember(owner = "client!sn", name = "e", descriptor = "(B)V", line = 468)
    public static final void method2766(byte arg0) {
        field6505++;
        class334.field4414.method73(126);
        int var1 = class334.field4414.method80(8, arg0 + 205);
        if (var1 < class401.field5813) {
            for (int var2 = var1; var2 < class401.field5813; var2++) {
                class19.field174[class508.field7361++] = class337.field4465[var2];
            }
        }
        if (class401.field5813 < var1) {
            throw new RuntimeException("gnpov1");
        }
        class401.field5813 = 0;
        if (arg0 != 50) {
            field6519 = 42;
        }
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = class337.field4465[var3];
            class22 var5 = class339.field4484[var4];
            int var6 = class334.field4414.method80(1, 255);
            if (var6 == 0) {
                class337.field4465[class401.field5813++] = var4;
                var5.field1229 = class532.field7836;
            } else {
                int var7 = class334.field4414.method80(2, 255);
                if (var7 == 0) {
                    class337.field4465[class401.field5813++] = var4;
                    var5.field1229 = class532.field7836;
                    class298.field3923[class275.field3658++] = var4;
                } else if (var7 == 1) {
                    class337.field4465[class401.field5813++] = var4;
                    var5.field1229 = class532.field7836;
                    int var8 = class334.field4414.method80(3, 255);
                    var5.method129(var8, arg0 ^ 0xFFFFFFCD, 1);
                    int var9 = class334.field4414.method80(1, 255);
                    if (var9 == 1) {
                        class298.field3923[class275.field3658++] = var4;
                    }
                } else if (var7 == 2) {
                    class337.field4465[class401.field5813++] = var4;
                    var5.field1229 = class532.field7836;
                    if (class334.field4414.method80(1, 255) == 1) {
                        int var11 = class334.field4414.method80(3, arg0 + 205);
                        var5.method129(var11, -1, 2);
                        int var12 = class334.field4414.method80(3, 255);
                        var5.method129(var12, arg0 ^ 0xFFFFFFCD, 2);
                    } else {
                        int var10 = class334.field4414.method80(3, arg0 + 205);
                        var5.method129(var10, -1, 0);
                    }
                    int var13 = class334.field4414.method80(1, 255);
                    if (var13 == 1) {
                        class298.field3923[class275.field3658++] = var4;
                    }
                } else if (var7 == 3) {
                    class19.field174[class508.field7361++] = var4;
                }
            }
        }
    }

    @OriginalMember(owner = "client!sn", name = "f", descriptor = "(B)Z", line = 581)
    public final boolean method2767(byte arg0) {
        field6521++;
        if (arg0 == 123) {
            return this.method2762((byte) 103) >= 20;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(ZI)V", line = 594)
    public final void method2768(boolean arg0, int arg1) {
        field6503++;
        if (this.field6530 == null) {
            return;
        }
        try {
            this.field6528.field5729 = 0;
            this.field6528.method2449((byte) 118, arg0 ? 2 : 3);
            this.field6528.method2399(true, 0);
            if (arg1 != -2075) {
                this.method2765((byte) 100);
            }
            this.field6530.method2620(true, this.field6528.field5761, 0, 4);
        } catch (IOException var4) {
            try {
                this.field6530.method2625(true);
            } catch (Exception var3) {
            }
            this.field6532++;
            this.field6534 = -2;
            this.field6530 = null;
        }
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(Z)V", line = 625)
    public final void method2769(boolean arg0) {
        try {
            if (arg0) {
                return;
            }
            this.field6530.method2625(true);
        } catch (Exception var2) {
        }
        field6515++;
        this.field6533 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
        this.field6534 = -1;
        this.field6530 = null;
        this.field6532++;
    }

    @OriginalMember(owner = "client!sn", name = "c", descriptor = "(I)V", line = 643)
    private final void method2770(int arg0) {
        field6514++;
        if (this.field6530 == null) {
            return;
        }
        try {
            this.field6528.field5729 = 0;
            this.field6528.method2449((byte) 121, 6);
            if (arg0 > -1) {
                this.field6529 = -62;
            }
            this.field6528.method2399(true, 3);
            this.field6530.method2620(true, this.field6528.field5761, 0, 4);
        } catch (IOException var3) {
            try {
                this.field6530.method2625(true);
            } catch (Exception var2) {
            }
            this.field6532++;
            this.field6530 = null;
            this.field6534 = -2;
        }
    }

    @OriginalMember(owner = "client!sn", name = "d", descriptor = "(I)V", line = 676)
    public static void method2771(int arg0) {
        field6522 = null;
        if (arg0 >= -32) {
            method2771(-76);
        }
        field6523 = null;
        field6512 = null;
    }

    @OriginalMember(owner = "client!sn", name = "e", descriptor = "(I)I", line = 692)
    private final int method2772(int arg0) {
        int var2 = -125 % ((-arg0 - 2) / 46);
        field6506++;
        return this.field6518.method1936((byte) 47) + this.field6526.method1936((byte) 45);
    }
}
