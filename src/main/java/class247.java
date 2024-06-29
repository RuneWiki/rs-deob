import java.awt.FontMetrics;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ud")
public class class247 {

    @OriginalMember(owner = "client!ud", name = "c", descriptor = "Lhc;")
    private class151 field3687 = new class151();

    @OriginalMember(owner = "client!ud", name = "x", descriptor = "Lhc;")
    private class151 field3708 = new class151();

    @OriginalMember(owner = "client!ud", name = "y", descriptor = "Lhc;")
    private class151 field3709 = new class151();

    @OriginalMember(owner = "client!ud", name = "A", descriptor = "Lhc;")
    private class151 field3711 = new class151();

    @OriginalMember(owner = "client!ud", name = "E", descriptor = "Lkl;")
    private class114 field3715 = new class114(4);

    @OriginalMember(owner = "client!ud", name = "G", descriptor = "I")
    public volatile int field3717 = 0;

    @OriginalMember(owner = "client!ud", name = "H", descriptor = "B")
    private byte field3718 = 0;

    @OriginalMember(owner = "client!ud", name = "I", descriptor = "I")
    public volatile int field3719 = 0;

    @OriginalMember(owner = "client!ud", name = "F", descriptor = "Lkl;")
    private class114 field3716 = new class114(8);

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "I")
    public static int field3685 = 1;

    @OriginalMember(owner = "client!ud", name = "v", descriptor = "I")
    public static int field3706 = 0;

    @OriginalMember(owner = "client!ud", name = "w", descriptor = "I")
    public static int field3707 = 0;

    @OriginalMember(owner = "client!ud", name = "q", descriptor = "I")
    public static int field3701 = -1;

    @OriginalMember(owner = "client!ud", name = "h", descriptor = "C")
    public static char field3692;

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "I")
    public static int field3686;

    @OriginalMember(owner = "client!ud", name = "d", descriptor = "I")
    public static int field3688;

    @OriginalMember(owner = "client!ud", name = "e", descriptor = "I")
    public static int field3689;

    @OriginalMember(owner = "client!ud", name = "f", descriptor = "I")
    public static int field3690;

    @OriginalMember(owner = "client!ud", name = "g", descriptor = "I")
    public static int field3691;

    @OriginalMember(owner = "client!ud", name = "i", descriptor = "I")
    public static int field3693;

    @OriginalMember(owner = "client!ud", name = "k", descriptor = "I")
    public static int field3695;

    @OriginalMember(owner = "client!ud", name = "l", descriptor = "I")
    public static int field3696;

    @OriginalMember(owner = "client!ud", name = "m", descriptor = "I")
    public static int field3697;

    @OriginalMember(owner = "client!ud", name = "n", descriptor = "I")
    public static int field3698;

    @OriginalMember(owner = "client!ud", name = "o", descriptor = "I")
    public static int field3699;

    @OriginalMember(owner = "client!ud", name = "p", descriptor = "I")
    public static int field3700;

    @OriginalMember(owner = "client!ud", name = "r", descriptor = "I")
    public static int field3702;

    @OriginalMember(owner = "client!ud", name = "s", descriptor = "I")
    public static int field3703;

    @OriginalMember(owner = "client!ud", name = "t", descriptor = "I")
    public static int field3704;

    @OriginalMember(owner = "client!ud", name = "u", descriptor = "I")
    public static int field3705;

    @OriginalMember(owner = "client!ud", name = "z", descriptor = "I")
    public static int field3710;

    @OriginalMember(owner = "client!ud", name = "C", descriptor = "I")
    private int field3713;

    @OriginalMember(owner = "client!ud", name = "D", descriptor = "J")
    private long field3714;

    @OriginalMember(owner = "client!ud", name = "J", descriptor = "Lmh;")
    private class118 field3720;

    @OriginalMember(owner = "client!ud", name = "B", descriptor = "Lbk;")
    private class54 field3712;

    @OriginalMember(owner = "client!ud", name = "j", descriptor = "Ljava/awt/FontMetrics;")
    public static FontMetrics field3694;

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(I)Z")
    public final boolean method1614(int arg0) {
        if (this.field3712 != null) {
            long var2 = class287.method1928(27332);
            int var4 = (int) (var2 - this.field3714);
            if (var4 > 200) {
                var4 = 200;
            }
            this.field3714 = var2;
            this.field3713 += var4;
            if (this.field3713 > 30000) {
                try {
                    this.field3712.method362(false);
                } catch (Exception var27) {
                }
                this.field3712 = null;
            }
        }
        field3698++;
        if (this.field3712 == null) {
            return this.method1627((byte) -103) == 0 && this.method1623((byte) 86) == 0;
        }
        try {
            this.field3712.method366(1);
            if (arg0 <= 24) {
                this.method1626((byte) 91, (class54) null, true);
            }
            for (class118 var5 = (class118) this.field3687.method1026((byte) 126); var5 != null; var5 = (class118) this.field3687.method1022(-9709)) {
                this.field3715.field1673 = 0;
                this.field3715.method775(1, -122);
                this.field3715.method776((int) var5.field1376, (byte) 64);
                this.field3712.method356((byte) 13, this.field3715.field1629, 0, 4);
                this.field3708.method1028(false, var5);
            }
            for (class118 var6 = (class118) this.field3709.method1026((byte) 127); var6 != null; var6 = (class118) this.field3709.method1022(-9709)) {
                this.field3715.field1673 = 0;
                this.field3715.method775(0, -122);
                this.field3715.method776((int) var6.field1376, (byte) 107);
                this.field3712.method356((byte) 13, this.field3715.field1629, 0, 4);
                this.field3711.method1028(false, var6);
            }
            for (int var7 = 0; var7 < 100; var7++) {
                int var8 = this.field3712.method357((byte) -118);
                if (var8 < 0) {
                    throw new IOException();
                }
                if (var8 == 0) {
                    break;
                }
                this.field3713 = 0;
                byte var9 = 0;
                if (this.field3720 == null) {
                    var9 = 8;
                } else if (this.field3720.field1743 == 0) {
                    var9 = 1;
                }
                if (var9 <= 0) {
                    int var10 = this.field3720.field1737.field1629.length - this.field3720.field1730;
                    int var11 = 512 - this.field3720.field1743;
                    if ((var10 - this.field3720.field1737.field1673) < var11) {
                        var11 = var10 - this.field3720.field1737.field1673;
                    }
                    if (var8 < var11) {
                        var11 = var8;
                    }
                    this.field3712.method363(this.field3720.field1737.field1629, -5942, var11, this.field3720.field1737.field1673);
                    if (this.field3718 != 0) {
                        for (int var12 = 0; var12 < var11; var12++) {
                            this.field3720.field1737.field1629[this.field3720.field1737.field1673 + var12] = (byte) class182.method1175(this.field3720.field1737.field1629[this.field3720.field1737.field1673 + var12], this.field3718);
                        }
                    }
                    this.field3720.field1743 += var11;
                    this.field3720.field1737.field1673 += var11;
                    if (this.field3720.field1737.field1673 == var10) {
                        this.field3720.method609(-15747);
                        this.field3720.field1339 = false;
                        this.field3720 = null;
                    } else if (this.field3720.field1743 == 512) {
                        this.field3720.field1743 = 0;
                    }
                } else {
                    int var13 = var9 - this.field3716.field1673;
                    if (var13 > var8) {
                        var13 = var8;
                    }
                    this.field3712.method363(this.field3716.field1629, -5942, var13, this.field3716.field1673);
                    if (this.field3718 != 0) {
                        for (int var14 = 0; var14 < var13; var14++) {
                            this.field3716.field1629[this.field3716.field1673 + var14] = (byte) class182.method1175(this.field3716.field1629[this.field3716.field1673 + var14], this.field3718);
                        }
                    }
                    this.field3716.field1673 += var13;
                    if (var9 <= this.field3716.field1673) {
                        if (this.field3720 == null) {
                            this.field3716.field1673 = 0;
                            Object var15 = null;
                            int var16 = this.field3716.method760(false);
                            int var17 = this.field3716.method756(-29901);
                            long var18 = (long) ((var16 << 16) + var17);
                            int var20 = this.field3716.method760(false);
                            int var21 = var20 & 0x7F;
                            int var22 = this.field3716.method759((byte) 121);
                            boolean var23 = (var20 & 0x80) != 0;
                            class118 var24;
                            if (var23) {
                                for (var24 = (class118) this.field3711.method1026((byte) 126); var24 != null && var24.field1376 != var18; var24 = (class118) this.field3711.method1022(-9709)) {
                                }
                            } else {
                                for (var24 = (class118) this.field3708.method1026((byte) 127); var24 != null && var24.field1376 != var18; var24 = (class118) this.field3708.method1022(-9709)) {
                                }
                            }
                            if (var24 == null) {
                                throw new IOException();
                            }
                            this.field3720 = var24;
                            int var25 = var21 == 0 ? 5 : 9;
                            this.field3720.field1737 = new class114(var25 + this.field3720.field1730 + var22);
                            this.field3720.field1737.method775(var21, -113);
                            this.field3720.field1737.method737(-2645, var22);
                            this.field3720.field1743 = 8;
                            this.field3716.field1673 = 0;
                        } else if (this.field3720.field1743 != 0) {
                            throw new IOException();
                        } else if (this.field3716.field1629[0] == -1) {
                            this.field3720.field1743 = 1;
                            this.field3716.field1673 = 0;
                        } else {
                            this.field3720 = null;
                        }
                    }
                }
            }
            return true;
        } catch (IOException var28) {
            try {
                this.field3712.method362(false);
            } catch (Exception var26) {
            }
            this.field3717++;
            this.field3719 = -2;
            this.field3712 = null;
            return this.method1627((byte) -120) == 0 && this.method1623((byte) 126) == 0;
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(BI)I")
    public static final int method1615(byte arg0, int arg1) {
        field3690++;
        if (arg1 < 0) {
            return 0;
        }
        class255 var2 = (class255) class168.field2428.method1218((long) arg1, 125);
        if (var2 == null) {
            return class228.method1489((byte) -79, arg1).field2619;
        }
        int var3 = 0;
        if (arg0 != -22) {
            method1631(9);
        }
        for (int var4 = 0; var4 < var2.field3867.length; var4++) {
            if (var2.field3867[var4] == -1) {
                var3++;
            }
        }
        return var3 + (class228.method1489((byte) -83, arg1).field2619 - var2.field3867.length);
    }

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "(I)V")
    public final void method1616(int arg0) {
        if (this.field3712 != null) {
            this.field3712.method364((byte) -50);
        }
        field3700++;
        if (arg0 != 0) {
            this.field3709 = null;
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(B)Z")
    public final boolean method1617(byte arg0) {
        field3702++;
        if (arg0 < 22) {
            this.method1616(-79);
        }
        return this.method1623((byte) 89) >= 20;
    }

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "(B)V")
    public static void method1618(byte arg0) {
        field3694 = null;
        if (arg0 != 100) {
            method1629((String) null, (String) null, (byte) 126, (String) null, 44);
        }
    }

    @OriginalMember(owner = "client!ud", name = "c", descriptor = "(B)V")
    public final void method1619(byte arg0) {
        if (arg0 != -107) {
            this.method1616(69);
        }
        if (this.field3712 != null) {
            this.field3712.method362(false);
        }
        field3688++;
    }

    @OriginalMember(owner = "client!ud", name = "c", descriptor = "(I)Z")
    public final boolean method1620(int arg0) {
        field3704++;
        if (arg0 >= -117) {
            this.field3712 = null;
        }
        return this.method1627((byte) -119) >= 20;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(BZIII)Lmh;")
    public final class118 method1621(byte arg0, boolean arg1, int arg2, int arg3, int arg4) {
        long var6 = (long) ((arg4 << 16) + arg3);
        field3693++;
        class118 var8 = new class118();
        var8.field1730 = arg0;
        var8.field1346 = arg1;
        var8.field1376 = var6;
        int var9 = -77 / ((-arg2 - 56) / 32);
        if (arg1) {
            if (this.method1627((byte) -114) >= 20) {
                throw new RuntimeException();
            }
            this.field3687.method1028(false, var8);
        } else if (this.method1623((byte) 106) < 20) {
            this.field3709.method1028(false, var8);
        } else {
            throw new RuntimeException();
        }
        return var8;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(IIIIIIIB)V")
    public static final void method1622(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte arg7) {
        field3695++;
        if (class159.method1072((byte) -14, arg1) && arg7 > 54) {
            client.method1436(class19.field268[arg1], -1, arg5, arg2, arg6, arg0, arg4, arg3);
        }
    }

    @OriginalMember(owner = "client!ud", name = "d", descriptor = "(B)I")
    private final int method1623(byte arg0) {
        if (arg0 <= 80) {
            return 62;
        } else {
            field3697++;
            return this.field3709.method1027((byte) -125) + this.field3711.method1027((byte) -120);
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(ZI)V")
    public final void method1624(boolean arg0, int arg1) {
        field3703++;
        if (this.field3712 == null) {
            return;
        }
        if (arg1 != -1942) {
            this.field3715 = null;
        }
        try {
            this.field3715.field1673 = 0;
            this.field3715.method775(arg0 ? 2 : 3, arg1 + 1830);
            this.field3715.method776(0, (byte) 53);
            this.field3712.method356((byte) 13, this.field3715.field1629, 0, 4);
        } catch (IOException var4) {
            try {
                this.field3712.method362(false);
            } catch (Exception var3) {
            }
            this.field3712 = null;
            this.field3717++;
            this.field3719 = -2;
        }
    }

    @OriginalMember(owner = "client!ud", name = "d", descriptor = "(I)V")
    public final void method1625(int arg0) {
        field3705++;
        if (this.field3712 == null) {
            return;
        }
        try {
            this.field3715.field1673 = 0;
            this.field3715.method775(7, -126);
            this.field3715.method776(0, (byte) 77);
            this.field3712.method356((byte) 13, this.field3715.field1629, 0, 4);
            if (arg0 != -5938) {
                this.field3712 = null;
            }
        } catch (IOException var3) {
            try {
                this.field3712.method362(false);
            } catch (Exception var2) {
            }
            this.field3717++;
            this.field3712 = null;
            this.field3719 = -2;
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(BLbk;Z)V")
    public final void method1626(byte arg0, class54 arg1, boolean arg2) {
        if (this.field3712 != null) {
            try {
                this.field3712.method362(false);
            } catch (Exception var9) {
            }
            this.field3712 = null;
        }
        int var4 = 107 / ((arg0 + 44) / 45);
        field3689++;
        this.field3712 = arg1;
        this.method1630((byte) 123);
        this.method1624(arg2, -1942);
        this.field3716.field1673 = 0;
        this.field3720 = null;
        while (true) {
            class118 var5 = (class118) this.field3708.method1023((byte) 54);
            if (var5 == null) {
                while (true) {
                    class118 var6 = (class118) this.field3711.method1023((byte) 54);
                    if (var6 == null) {
                        if (this.field3718 != 0) {
                            try {
                                this.field3715.field1673 = 0;
                                this.field3715.method775(4, -112);
                                this.field3715.method775(this.field3718, -124);
                                this.field3715.method794(0, (byte) -21);
                                this.field3712.method356((byte) 13, this.field3715.field1629, 0, 4);
                            } catch (IOException var8) {
                                try {
                                    this.field3712.method362(false);
                                } catch (Exception var7) {
                                }
                                this.field3712 = null;
                                this.field3717++;
                                this.field3719 = -2;
                            }
                        }
                        this.field3713 = 0;
                        this.field3714 = class287.method1928(27332);
                        return;
                    }
                    this.field3709.method1028(false, var6);
                }
            }
            this.field3687.method1028(false, var5);
        }
    }

    @OriginalMember(owner = "client!ud", name = "e", descriptor = "(B)I")
    public final int method1627(byte arg0) {
        field3710++;
        if (arg0 >= -92) {
            this.field3714 = 101L;
        }
        return this.field3687.method1027((byte) -94) + this.field3708.method1027((byte) -106);
    }

    @OriginalMember(owner = "client!ud", name = "e", descriptor = "(I)V")
    public final void method1628(int arg0) {
        try {
            this.field3712.method362(false);
        } catch (Exception var2) {
        }
        this.field3712 = null;
        this.field3719 = arg0;
        this.field3718 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
        this.field3717++;
        field3691++;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;BLjava/lang/String;I)V")
    public static final void method1629(String arg0, String arg1, byte arg2, String arg3, int arg4) {
        class178.method1155(arg1, arg0, arg3, 4096, -1, arg4);
        field3686++;
        int var5 = 60 / ((-arg2 - 4) / 56);
    }

    @OriginalMember(owner = "client!ud", name = "f", descriptor = "(B)V")
    private final void method1630(byte arg0) {
        field3699++;
        if (this.field3712 == null) {
            return;
        }
        try {
            this.field3715.field1673 = 0;
            this.field3715.method775(6, -116);
            this.field3715.method776(3, (byte) 99);
            this.field3712.method356((byte) 13, this.field3715.field1629, 0, 4);
        } catch (IOException var3) {
            try {
                this.field3712.method362(false);
            } catch (Exception var2) {
            }
            this.field3712 = null;
            this.field3719 = -2;
            this.field3717++;
        }
        if (arg0 != 123) {
            this.method1623((byte) 3);
        }
    }

    @OriginalMember(owner = "client!ud", name = "f", descriptor = "(I)V")
    public static final void method1631(int arg0) {
        field3696++;
        if (arg0 == -4938) {
            class225.field3382.method260(0);
        }
    }
}
