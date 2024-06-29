import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lc")
public class class272 {

    @OriginalMember(owner = "client!lc", name = "i", descriptor = "I")
    private int field4743 = 0;

    @OriginalMember(owner = "client!lc", name = "m", descriptor = "I")
    private int field4747 = 0;

    @OriginalMember(owner = "client!lc", name = "u", descriptor = "I")
    private int field4755 = 128;

    @OriginalMember(owner = "client!lc", name = "y", descriptor = "Z")
    public boolean field4759 = false;

    @OriginalMember(owner = "client!lc", name = "k", descriptor = "I")
    public int field4745 = -1;

    @OriginalMember(owner = "client!lc", name = "D", descriptor = "I")
    private int field4764 = 0;

    @OriginalMember(owner = "client!lc", name = "w", descriptor = "I")
    private int field4757 = 128;

    @OriginalMember(owner = "client!lc", name = "v", descriptor = "S")
    public static short field4756 = 32767;

    @OriginalMember(owner = "client!lc", name = "x", descriptor = "I")
    public static int field4758 = -1;

    @OriginalMember(owner = "client!lc", name = "A", descriptor = "Lha;")
    public static class46 field4761 = class271.method1828(" weitere Optionen", -46);

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "I")
    public static int field4736;

    @OriginalMember(owner = "client!lc", name = "c", descriptor = "I")
    public static int field4737;

    @OriginalMember(owner = "client!lc", name = "d", descriptor = "I")
    public static int field4738;

    @OriginalMember(owner = "client!lc", name = "e", descriptor = "I")
    private int field4739;

    @OriginalMember(owner = "client!lc", name = "f", descriptor = "I")
    public static int field4740;

    @OriginalMember(owner = "client!lc", name = "h", descriptor = "I")
    public static int field4742;

    @OriginalMember(owner = "client!lc", name = "j", descriptor = "I")
    public static int field4744;

    @OriginalMember(owner = "client!lc", name = "l", descriptor = "I")
    public static int field4746;

    @OriginalMember(owner = "client!lc", name = "n", descriptor = "I")
    public int field4748;

    @OriginalMember(owner = "client!lc", name = "q", descriptor = "I")
    public static int field4751;

    @OriginalMember(owner = "client!lc", name = "s", descriptor = "I")
    public static int field4753;

    @OriginalMember(owner = "client!lc", name = "t", descriptor = "I")
    public static int field4754;

    @OriginalMember(owner = "client!lc", name = "B", descriptor = "I")
    public static int field4762;

    @OriginalMember(owner = "client!lc", name = "C", descriptor = "I")
    public static int field4763;

    @OriginalMember(owner = "client!lc", name = "p", descriptor = "Lpi;")
    public static class181 field4750;

    @OriginalMember(owner = "client!lc", name = "z", descriptor = "Lpi;")
    public static class181 field4760;

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "[S")
    private short[] field4735;

    @OriginalMember(owner = "client!lc", name = "g", descriptor = "[S")
    private short[] field4741;

    @OriginalMember(owner = "client!lc", name = "o", descriptor = "[S")
    private short[] field4749;

    @OriginalMember(owner = "client!lc", name = "r", descriptor = "[S")
    private short[] field4752;

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(BI)Lme;")
    public final class36 method1831(byte arg0, int arg1) {
        int var3 = -1 / ((68 - arg0) / 49);
        class36 var4 = (class36) class240.field4266.method86(7961, (long) this.field4748);
        field4763++;
        if (var4 == null) {
            class67 var5 = class67.method464(class238.field4221, this.field4739, 0);
            if (var5 == null) {
                return null;
            }
            if (this.field4735 != null) {
                for (int var6 = 0; var6 < this.field4735.length; var6++) {
                    var5.method480(this.field4735[var6], this.field4752[var6]);
                }
            }
            if (this.field4749 != null) {
                for (int var7 = 0; var7 < this.field4749.length; var7++) {
                    var5.method477(this.field4749[var7], this.field4741[var7]);
                }
            }
            var4 = var5.method490(this.field4747 + 64, this.field4764 + 850, -30, -50, -30);
            class240.field4266.method80(var4, (long) this.field4748, (byte) 67);
        }
        class36 var8;
        if (this.field4745 == -1 || arg1 == -1) {
            var8 = var4.method238(true, true);
        } else {
            var8 = class119.method951(0, this.field4745).method1214(65535, var4, arg1);
        }
        if (this.field4755 != 128 || this.field4757 != 128) {
            var8.method235(this.field4755, this.field4757, this.field4755);
        }
        if (this.field4743 != 0) {
            if (this.field4743 == 90) {
                var8.method237();
            }
            if (this.field4743 == 180) {
                var8.method233();
            }
            if (this.field4743 == 270) {
                var8.method227();
            }
        }
        return var8;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(IIIII)V")
    public static final void method1832(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field4740++;
        if (arg4 != -12732) {
            field4746 = -96;
        }
        if (class46.field764 < 100) {
            class109.method857(93);
        }
        class262.method1753(arg1, arg3, arg0 + arg1, arg3 - -arg2);
        if (class46.field764 < 100) {
            byte var5 = 20;
            int var6 = arg0 / 2 + arg1;
            int var7 = arg3 + (arg2 / 2) - var5 - 18;
            class262.method1762(arg1, arg3, arg0, arg2, 0);
            class262.method1769(var6 - 152, var7, 304, 34, 9179409);
            class262.method1769(var6 - 151, var7 + 1, 302, 32, 0);
            class262.method1762(var6 - 150, var7 + 2, class46.field764 * 3, 30, 9179409);
            class262.method1762(class46.field764 * 3 + var6 - 150, var7 + 2, 300 - (class46.field764 * 3), 30, 0);
            class190.field3384.method147(class197.field3514, var6, var5 + var7, 16777215, -1);
            return;
        }
        class49.field842 = (int) ((float) (arg2 * 2) / class45.field746);
        int var8 = class57.field950 - ((int) ((float) arg0 / class45.field746));
        class106.field1955 = class57.field950 - ((int) ((float) arg0 / class45.field746));
        int var9 = (int) ((float) arg2 / class45.field746) + class194.field3490;
        field4744 = class194.field3490 - ((int) ((float) arg2 / class45.field746));
        class155.field2755 = (int) ((float) (arg0 * 2) / class45.field746);
        int var10 = class194.field3490 - ((int) ((float) arg2 / class45.field746));
        int var11 = (int) ((float) arg0 / class45.field746) + class57.field950;
        class68.method494(var9, -32, arg1, var8, arg3, arg2 + arg3, arg0 + arg1, var10, var11);
        class32.method212(var11, var10, var8, arg3 + arg2, arg3, true, var9, arg0 + arg1, arg1);
        class214.method1504(arg4 ^ 0xFFFFB22E, var10, arg1, var9, arg3 + arg2, arg3, var8, arg0 + arg1, var11);
        if (class70.field1203 > 0) {
            class70.field1203--;
        }
        if (!class4.field74) {
            return;
        }
        int var12 = arg0 + arg1 - 5;
        int var13 = arg2 + arg3 - 8;
        class261.field4547.method139(class109.method855(0, new class46[] { class171.field3052, class115.method932(false, class3.field44) }), var12, var13, 16776960, -1);
        int var17 = var13 - 15;
        Runtime var14 = Runtime.getRuntime();
        int var15 = (int) ((var14.totalMemory() - var14.freeMemory()) / 1024L);
        int var16 = 16776960;
        if (var15 > 65536) {
            var16 = 16711680;
        }
        class261.field4547.method139(class109.method855(0, new class46[] { class56.field934, class115.method932(false, var15), class92.field1712 }), var12, var17, var16, -1);
        var13 = var17 - 15;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "([Lhi;IZ)V")
    public static final void method1833(class24[] arg0, int arg1, boolean arg2) {
        if (arg2) {
            field4746 = 126;
        }
        for (int var3 = 0; var3 < arg0.length; var3++) {
            class24 var4 = arg0[var3];
            if (var4 != null) {
                if (var4.field485 == 0) {
                    if (var4.field503 != null) {
                        method1833(var4.field503, arg1, false);
                    }
                    class31 var5 = (class31) class93.field1727.method1601(-103, (long) var4.field374);
                    if (var5 != null) {
                        class32.method211(arg1, var5.field582, 31083);
                    }
                }
                if (arg1 == 0 && var4.field444 != null) {
                    class275 var6 = new class275();
                    var6.field4796 = var4.field444;
                    var6.field4792 = var4;
                    class215.method1509(var6, 73);
                }
                if (arg1 == 1 && var4.field481 != null) {
                    if (var4.field436 >= 0) {
                        class24 var7 = class13.method73(1506528624, var4.field374);
                        if (var7 == null || var7.field503 == null || var7.field503.length <= var4.field436 || var7.field503[var4.field436] != var4) {
                            continue;
                        }
                    }
                    class275 var8 = new class275();
                    var8.field4796 = var4.field481;
                    var8.field4792 = var4;
                    class215.method1509(var8, 87);
                }
            }
        }
        field4751++;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(BIII)Lcb;")
    public static final class31 method1834(byte arg0, int arg1, int arg2, int arg3) {
        class31 var4 = new class31();
        field4737++;
        var4.field582 = arg3;
        var4.field591 = arg1;
        int var5 = -113 / ((arg0 - 8) / 39);
        class93.field1727.method1597((long) arg2, (byte) -126, var4);
        class137.method1053(-16384, arg3);
        class24 var6 = class13.method73(1506528624, arg2);
        if (var6 != null) {
            class226.method1549(false, var6);
        }
        if (class1.field13 != null) {
            class226.method1549(false, class1.field13);
            class1.field13 = null;
        }
        int var7 = class242.field4290;
        for (int var8 = 0; var8 < var7; var8++) {
            if (class261.method1746(class215.field3807[var8], (byte) -123)) {
                class2.method3(var8, 2638);
            }
        }
        if (class242.field4290 == 1) {
            class222.field3910 = false;
            class109.method861(0, class187.field3345, class270.field4707, class109.field2062, class248.field4378);
        } else {
            class109.method861(0, class187.field3345, class270.field4707, class109.field2062, class248.field4378);
            int var9 = class190.field3384.method153(class196.field3506);
            for (int var10 = 0; var10 < class242.field4290; var10++) {
                int var11 = class190.field3384.method153(class155.method1147((byte) 100, var10));
                if (var11 > var9) {
                    var9 = var11;
                }
            }
            class270.field4707 = class242.field4290 * 15 + 22;
            class248.field4378 = var9 + 8;
        }
        if (var6 != null) {
            class113.method922(false, var6, -115);
        }
        class269.method1806(arg3, 0);
        if (class114.field2157 != -1) {
            class32.method211(1, class114.field2157, 31083);
        }
        return var4;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(Ljava/lang/Throwable;ILjava/lang/String;)V")
    public static final void method1835(Throwable arg0, int arg1, String arg2) {
        field4736++;
        try {
            String var3 = "";
            if (arg0 != null) {
                var3 = class79.method630(arg0, 3);
            }
            if (arg2 != null) {
                if (arg0 != null) {
                    var3 = var3 + " | ";
                }
                var3 = var3 + arg2;
            }
            System.out.println("Error: " + var3);
            String var4 = var3.replace(':', '.');
            String var5 = var4.replace('@', '_');
            String var6 = var5.replace('&', '_');
            String var7 = var6.replace('#', '_');
            if (class47.field824.field143 != null) {
                class165 var8 = class47.field824.method47(new URL(class47.field824.field143.getCodeBase(), "clienterror.ws?c=" + class270.field4713 + "&u=" + class208.field3738 + "&v1=" + class9.field152 + "&v2=" + class9.field155 + "&e=" + var7), true);
                while (var8.field2925 == 0) {
                    class187.method1360((byte) -99, 1L);
                }
                if (arg1 > -15) {
                    field4750 = null;
                }
                if (var8.field2925 == 1) {
                    DataInputStream var9 = (DataInputStream) var8.field2921;
                    var9.read();
                    var9.close();
                }
            }
        } catch (Exception var10) {
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(BLee;)V")
    public static final void method1836(byte arg0, class64 arg1) {
        class109.field2061 = arg1;
        field4742++;
        if (arg0 != 18) {
            field4758 = 14;
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(Lwe;B)V")
    public final void method1837(class75 arg0, byte arg1) {
        field4753++;
        while (true) {
            int var3 = arg0.method558(1);
            if (var3 == 0) {
                if (arg1 == -19) {
                    return;
                } else {
                    this.field4739 = -68;
                    return;
                }
            }
            this.method1840(var3, true, arg0);
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(I)V")
    public static final void method1838(int arg0) {
        field4738++;
        if (arg0 >= -10) {
            method1835((Throwable) null, 73, (String) null);
        }
        int var1 = class258.method1737(3);
        if (var1 == 0) {
            class60.field1001 = null;
            class40.method272(0, 0);
        } else if (var1 == 1) {
            class115.method929((byte) 0, (byte) 21);
            class40.method272(0, 512);
            class106.method800((byte) -18);
        } else {
            class115.method929((byte) (class252.field4443 - 4 & 0xFF), (byte) 21);
            class40.method272(0, 2);
        }
    }

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "(I)V")
    public static void method1839(int arg0) {
        field4760 = null;
        if (arg0 <= 58) {
            method1839(101);
        }
        field4750 = null;
        field4761 = null;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(IZLwe;)V")
    private final void method1840(int arg0, boolean arg1, class75 arg2) {
        if (!arg1) {
            this.method1837((class75) null, (byte) -123);
        }
        if (arg0 == 1) {
            this.field4739 = arg2.method545((byte) -57);
        } else if (arg0 == 2) {
            this.field4745 = arg2.method545((byte) 54);
        } else if (arg0 == 4) {
            this.field4755 = arg2.method545((byte) -79);
        } else if (arg0 == 5) {
            this.field4757 = arg2.method545((byte) -61);
        } else if (arg0 == 6) {
            this.field4743 = arg2.method545((byte) 94);
        } else if (arg0 == 7) {
            this.field4747 = arg2.method558(1);
        } else if (arg0 == 8) {
            this.field4764 = arg2.method558(1);
        } else if (arg0 == 9) {
            this.field4759 = true;
        } else if (arg0 == 40) {
            int var6 = arg2.method558(1);
            this.field4735 = new short[var6];
            this.field4752 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field4735[var7] = (short) arg2.method545((byte) 69);
                this.field4752[var7] = (short) arg2.method545((byte) 61);
            }
        } else if (arg0 == 41) {
            int var4 = arg2.method558(1);
            this.field4741 = new short[var4];
            this.field4749 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field4749[var5] = (short) arg2.method545((byte) -95);
                this.field4741[var5] = (short) arg2.method545((byte) 42);
            }
        }
        field4754++;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(IB)I")
    public static final int method1841(int arg0, byte arg1) {
        int var2 = 16 / ((arg1 - 10) / 55);
        field4762++;
        return arg0 >>> 8;
    }
}
