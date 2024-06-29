import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ke")
public class class112 {

    @OriginalMember(owner = "client!ke", name = "g", descriptor = "Lng;")
    private class79 field1716 = new class79();

    @OriginalMember(owner = "client!ke", name = "y", descriptor = "Lng;")
    private class79 field1734 = new class79();

    @OriginalMember(owner = "client!ke", name = "z", descriptor = "Lng;")
    private class79 field1735 = new class79();

    @OriginalMember(owner = "client!ke", name = "A", descriptor = "Lng;")
    private class79 field1736 = new class79();

    @OriginalMember(owner = "client!ke", name = "E", descriptor = "Lha;")
    private class31 field1740 = new class31(4);

    @OriginalMember(owner = "client!ke", name = "G", descriptor = "B")
    private byte field1742 = 0;

    @OriginalMember(owner = "client!ke", name = "H", descriptor = "I")
    public volatile int field1743 = 0;

    @OriginalMember(owner = "client!ke", name = "I", descriptor = "I")
    public volatile int field1744 = 0;

    @OriginalMember(owner = "client!ke", name = "F", descriptor = "Lha;")
    private class31 field1741 = new class31(8);

    @OriginalMember(owner = "client!ke", name = "j", descriptor = "Lpf;")
    public static class305 field1719 = new class305(16);

    @OriginalMember(owner = "client!ke", name = "r", descriptor = "I")
    public static int field1727 = 0;

    @OriginalMember(owner = "client!ke", name = "t", descriptor = "[Z")
    public static boolean[] field1729 = new boolean[100];

    @OriginalMember(owner = "client!ke", name = "x", descriptor = "Z")
    public static boolean field1733 = false;

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "I")
    public static int field1710;

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "I")
    public static int field1711;

    @OriginalMember(owner = "client!ke", name = "c", descriptor = "I")
    public static int field1712;

    @OriginalMember(owner = "client!ke", name = "d", descriptor = "I")
    public static int field1713;

    @OriginalMember(owner = "client!ke", name = "e", descriptor = "I")
    public static int field1714;

    @OriginalMember(owner = "client!ke", name = "f", descriptor = "I")
    public static int field1715;

    @OriginalMember(owner = "client!ke", name = "h", descriptor = "I")
    public static int field1717;

    @OriginalMember(owner = "client!ke", name = "i", descriptor = "I")
    public static int field1718;

    @OriginalMember(owner = "client!ke", name = "k", descriptor = "I")
    public static int field1720;

    @OriginalMember(owner = "client!ke", name = "l", descriptor = "I")
    public static int field1721;

    @OriginalMember(owner = "client!ke", name = "m", descriptor = "I")
    public static int field1722;

    @OriginalMember(owner = "client!ke", name = "n", descriptor = "I")
    public static int field1723;

    @OriginalMember(owner = "client!ke", name = "q", descriptor = "I")
    public static int field1726;

    @OriginalMember(owner = "client!ke", name = "s", descriptor = "I")
    public static int field1728;

    @OriginalMember(owner = "client!ke", name = "u", descriptor = "I")
    public static int field1730;

    @OriginalMember(owner = "client!ke", name = "v", descriptor = "I")
    public static int field1731;

    @OriginalMember(owner = "client!ke", name = "w", descriptor = "I")
    public static int field1732;

    @OriginalMember(owner = "client!ke", name = "C", descriptor = "I")
    private int field1738;

    @OriginalMember(owner = "client!ke", name = "D", descriptor = "J")
    private long field1739;

    @OriginalMember(owner = "client!ke", name = "B", descriptor = "Lbc;")
    private class182 field1737;

    @OriginalMember(owner = "client!ke", name = "o", descriptor = "Lef;")
    public static class227 field1724;

    @OriginalMember(owner = "client!ke", name = "J", descriptor = "Lim;")
    private class232 field1745;

    @OriginalMember(owner = "client!ke", name = "p", descriptor = "Lub;")
    public static class92 field1725;

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(IZZIB)Lim;")
    public final class232 method823(int arg0, boolean arg1, boolean arg2, int arg3, byte arg4) {
        long var6 = (long) ((arg3 << 16) + arg0);
        field1710++;
        class232 var8 = new class232();
        var8.field3237 = var6;
        var8.field3680 = arg4;
        var8.field1266 = arg1;
        if (arg1) {
            if (this.method835(-2) >= 20) {
                throw new RuntimeException();
            }
            this.field1716.method621(var8, (byte) -106);
        } else if (this.method833((byte) 27) < 20) {
            this.field1735.method621(var8, (byte) -44);
        } else {
            throw new RuntimeException();
        }
        if (arg2) {
            this.method826(27);
        }
        return var8;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(B)V")
    public final void method824(byte arg0) {
        if (arg0 != 38) {
            this.method828((byte) -44);
        }
        field1722++;
        if (this.field1737 != null) {
            this.field1737.method1308(770);
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(I)Z")
    public final boolean method825(int arg0) {
        field1720++;
        if (arg0 != 20) {
            field1721 = 8;
        }
        return this.method833((byte) 123) >= 20;
    }

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "(I)Z")
    public final boolean method826(int arg0) {
        if (this.field1737 != null) {
            long var2 = class242.method1650(119);
            int var4 = (int) (var2 - this.field1739);
            this.field1739 = var2;
            if (var4 > 200) {
                var4 = 200;
            }
            this.field1738 += var4;
            if (this.field1738 > 30000) {
                try {
                    this.field1737.method1306((byte) -101);
                } catch (Exception var27) {
                }
                this.field1737 = null;
            }
        }
        field1717++;
        if (this.field1737 == null) {
            return this.method835(-2) == 0 && this.method833((byte) -72) == 0;
        }
        try {
            this.field1737.method1305(true);
            for (class232 var5 = (class232) this.field1716.method620((byte) 91); var5 != null; var5 = (class232) this.field1716.method626((byte) 116)) {
                this.field1740.field541 = 0;
                this.field1740.method305(1, true);
                this.field1740.method268((int) var5.field3237, (byte) 69);
                this.field1737.method1299(0, 4, this.field1740.field560, (byte) 126);
                this.field1734.method621(var5, (byte) -101);
            }
            for (class232 var6 = (class232) this.field1735.method620((byte) 104); var6 != null; var6 = (class232) this.field1735.method626((byte) 116)) {
                this.field1740.field541 = 0;
                this.field1740.method305(0, true);
                this.field1740.method268((int) var6.field3237, (byte) 125);
                this.field1737.method1299(0, 4, this.field1740.field560, (byte) 125);
                this.field1736.method621(var6, (byte) -44);
            }
            int var7 = 0;
            if (arg0 < 115) {
                method834(59, (class222) null);
            }
            while (var7 < 100) {
                int var8 = this.field1737.method1302(108);
                if (var8 < 0) {
                    throw new IOException();
                }
                if (var8 == 0) {
                    break;
                }
                this.field1738 = 0;
                byte var9 = 0;
                if (this.field1745 == null) {
                    var9 = 8;
                } else if (this.field1745.field3671 == 0) {
                    var9 = 1;
                }
                if (var9 > 0) {
                    int var10 = var9 - this.field1741.field541;
                    if (var10 > var8) {
                        var10 = var8;
                    }
                    this.field1737.method1301(this.field1741.field541, -126, var10, this.field1741.field560);
                    if (this.field1742 != 0) {
                        for (int var11 = 0; var11 < var10; var11++) {
                            this.field1741.field560[this.field1741.field541 + var11] = (byte) class222.method1528(this.field1741.field560[this.field1741.field541 + var11], this.field1742);
                        }
                    }
                    this.field1741.field541 += var10;
                    if (this.field1741.field541 >= var9) {
                        if (this.field1745 == null) {
                            this.field1741.field541 = 0;
                            int var12 = this.field1741.method265(-94);
                            int var13 = this.field1741.method260((byte) -67);
                            long var14 = (long) ((var12 << 16) + var13);
                            int var16 = this.field1741.method265(-120);
                            int var17 = this.field1741.method300((byte) -30);
                            boolean var18 = (var16 & 0x80) != 0;
                            int var19 = var16 & 0x7F;
                            Object var20 = null;
                            class232 var21;
                            if (var18) {
                                for (var21 = (class232) this.field1736.method620((byte) 94); var21 != null && var21.field3237 != var14; var21 = (class232) this.field1736.method626((byte) 116)) {
                                }
                            } else {
                                for (var21 = (class232) this.field1734.method620((byte) 95); var21 != null && var21.field3237 != var14; var21 = (class232) this.field1734.method626((byte) 116)) {
                                }
                            }
                            if (var21 == null) {
                                throw new IOException();
                            }
                            this.field1745 = var21;
                            int var22 = var19 == 0 ? 5 : 9;
                            this.field1745.field3677 = new class31(var17 + var22 + this.field1745.field3680);
                            this.field1745.field3677.method305(var19, true);
                            this.field1745.field3677.method258(var17, -1527329320);
                            this.field1745.field3671 = 8;
                            this.field1741.field541 = 0;
                        } else if (this.field1745.field3671 != 0) {
                            throw new IOException();
                        } else if (this.field1741.field560[0] == -1) {
                            this.field1741.field541 = 0;
                            this.field1745.field3671 = 1;
                        } else {
                            this.field1745 = null;
                        }
                    }
                } else {
                    int var23 = 512 - this.field1745.field3671;
                    int var24 = this.field1745.field3677.field560.length - this.field1745.field3680;
                    if (var23 > (var24 - this.field1745.field3677.field541)) {
                        var23 = var24 - this.field1745.field3677.field541;
                    }
                    if (var8 < var23) {
                        var23 = var8;
                    }
                    this.field1737.method1301(this.field1745.field3677.field541, -115, var23, this.field1745.field3677.field560);
                    if (this.field1742 != 0) {
                        for (int var25 = 0; var25 < var23; var25++) {
                            this.field1745.field3677.field560[this.field1745.field3677.field541 + var25] = (byte) class222.method1528(this.field1745.field3677.field560[this.field1745.field3677.field541 + var25], this.field1742);
                        }
                    }
                    this.field1745.field3677.field541 += var23;
                    this.field1745.field3671 += var23;
                    if (this.field1745.field3677.field541 == var24) {
                        this.field1745.method1463((byte) -123);
                        this.field1745.field1264 = false;
                        this.field1745 = null;
                    } else if (this.field1745.field3671 == 512) {
                        this.field1745.field3671 = 0;
                    }
                }
                var7++;
            }
            return true;
        } catch (IOException var28) {
            try {
                this.field1737.method1306((byte) -64);
            } catch (Exception var26) {
            }
            this.field1744 = -2;
            this.field1743++;
            this.field1737 = null;
            return this.method835(-2) == 0 && this.method833((byte) 2) == 0;
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(ILbc;Z)V")
    public final void method827(int arg0, class182 arg1, boolean arg2) {
        if (arg0 <= 89) {
            return;
        }
        if (this.field1737 != null) {
            try {
                this.field1737.method1306((byte) -47);
            } catch (Exception var8) {
            }
            this.field1737 = null;
        }
        this.field1737 = arg1;
        field1712++;
        this.method837((byte) -99);
        this.method831((byte) 121, arg2);
        this.field1741.field541 = 0;
        this.field1745 = null;
        while (true) {
            class232 var4 = (class232) this.field1734.method617((byte) 114);
            if (var4 == null) {
                while (true) {
                    class232 var5 = (class232) this.field1736.method617((byte) 114);
                    if (var5 == null) {
                        if (this.field1742 != 0) {
                            try {
                                this.field1740.field541 = 0;
                                this.field1740.method305(4, true);
                                this.field1740.method305(this.field1742, true);
                                this.field1740.method281((byte) -115, 0);
                                this.field1737.method1299(0, 4, this.field1740.field560, (byte) 127);
                            } catch (IOException var7) {
                                try {
                                    this.field1737.method1306((byte) -63);
                                } catch (Exception var6) {
                                }
                                this.field1737 = null;
                                this.field1744 = -2;
                                this.field1743++;
                            }
                        }
                        this.field1738 = 0;
                        this.field1739 = class242.method1650(110);
                        return;
                    }
                    this.field1735.method621(var5, (byte) -47);
                }
            }
            this.field1716.method621(var4, (byte) -98);
        }
    }

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "(B)V")
    public final void method828(byte arg0) {
        field1726++;
        if (this.field1737 == null) {
            return;
        }
        try {
            this.field1740.field541 = 0;
            this.field1740.method305(7, true);
            this.field1740.method268(0, (byte) 122);
            this.field1737.method1299(0, 4, this.field1740.field560, (byte) 125);
        } catch (IOException var3) {
            try {
                this.field1737.method1306((byte) -47);
            } catch (Exception var2) {
            }
            this.field1737 = null;
            this.field1744 = -2;
            this.field1743++;
        }
        if (arg0 != -94) {
            this.field1736 = null;
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(III)V")
    public static final void method829(int arg0, int arg1, int arg2) {
        field1718++;
        if (class48.method401(127, arg2)) {
            int var3 = 16 % ((22 - arg0) / 50);
            class180.method1288(arg1, true, class8.field144[arg2]);
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(Z)V")
    public static void method830(boolean arg0) {
        field1719 = null;
        if (!arg0) {
            field1724 = null;
        }
        field1724 = null;
        field1729 = null;
        field1725 = null;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(BZ)V")
    public final void method831(byte arg0, boolean arg1) {
        field1732++;
        if (this.field1737 == null) {
            return;
        }
        if (arg0 < 118) {
            this.field1743 = -15;
        }
        try {
            this.field1740.field541 = 0;
            this.field1740.method305(arg1 ? 2 : 3, true);
            this.field1740.method268(0, (byte) 91);
            this.field1737.method1299(0, 4, this.field1740.field560, (byte) 125);
        } catch (IOException var4) {
            try {
                this.field1737.method1306((byte) -78);
            } catch (Exception var3) {
            }
            this.field1744 = -2;
            this.field1743++;
            this.field1737 = null;
        }
    }

    @OriginalMember(owner = "client!ke", name = "c", descriptor = "(B)V")
    public final void method832(byte arg0) {
        if (this.field1737 != null) {
            this.field1737.method1306((byte) -35);
        }
        if (arg0 == 9) {
            field1715++;
        }
    }

    @OriginalMember(owner = "client!ke", name = "d", descriptor = "(B)I")
    private final int method833(byte arg0) {
        int var2 = -18 % ((76 - arg0) / 45);
        field1713++;
        return this.field1735.method625((byte) -99) + this.field1736.method625((byte) -49);
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(ILcc;)Lcc;")
    public static final class222 method834(int arg0, class222 arg1) {
        field1728++;
        if (arg1.field3392 != -1) {
            return class169.method1217(arg1.field3392, arg0 + 12180);
        }
        int var2 = arg1.field3554 >>> 16;
        class273 var3 = new class273(class48.field787);
        for (class288 var4 = (class288) var3.method1868(arg0 ^ arg0); var4 != null; var4 = (class288) var3.method1866(121)) {
            if (var4.field4505 == var2) {
                return class169.method1217((int) var4.field2009, 12180);
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!ke", name = "c", descriptor = "(I)I")
    public final int method835(int arg0) {
        if (arg0 == -2) {
            field1723++;
            return this.field1716.method625((byte) -55) + this.field1734.method625((byte) -112);
        } else {
            return -97;
        }
    }

    @OriginalMember(owner = "client!ke", name = "d", descriptor = "(I)Z")
    public final boolean method836(int arg0) {
        field1731++;
        if (arg0 > -80) {
            this.method824((byte) 120);
        }
        return this.method835(-2) >= 20;
    }

    @OriginalMember(owner = "client!ke", name = "e", descriptor = "(B)V")
    private final void method837(byte arg0) {
        field1711++;
        if (arg0 != -99) {
            this.method826(-4);
        }
        if (this.field1737 == null) {
            return;
        }
        try {
            this.field1740.field541 = 0;
            this.field1740.method305(6, true);
            this.field1740.method268(3, (byte) 76);
            this.field1737.method1299(0, 4, this.field1740.field560, (byte) 127);
        } catch (IOException var3) {
            try {
                this.field1737.method1306((byte) -128);
            } catch (Exception var2) {
            }
            this.field1737 = null;
            this.field1743++;
            this.field1744 = -2;
        }
    }

    @OriginalMember(owner = "client!ke", name = "e", descriptor = "(I)V")
    public final void method838(int arg0) {
        field1714++;
        try {
            this.field1737.method1306((byte) -105);
        } catch (Exception var2) {
        }
        this.field1744 = -1;
        this.field1742 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
        if (arg0 != 0) {
            this.field1735 = null;
        }
        this.field1737 = null;
        this.field1743++;
    }
}
