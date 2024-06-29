import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dga")
public class class231 {

    @OriginalMember(owner = "client!dga", name = "d", descriptor = "Lgd;")
    private class346 field3416 = new class346();

    @OriginalMember(owner = "client!dga", name = "m", descriptor = "Lgd;")
    private class346 field3425 = new class346();

    @OriginalMember(owner = "client!dga", name = "s", descriptor = "Lgd;")
    private class346 field3431 = new class346();

    @OriginalMember(owner = "client!dga", name = "t", descriptor = "Lgd;")
    private class346 field3432 = new class346();

    @OriginalMember(owner = "client!dga", name = "u", descriptor = "Lek;")
    private class465 field3433 = new class465(4);

    @OriginalMember(owner = "client!dga", name = "z", descriptor = "B")
    private byte field3438 = 0;

    @OriginalMember(owner = "client!dga", name = "C", descriptor = "I")
    public volatile int field3440 = 0;

    @OriginalMember(owner = "client!dga", name = "D", descriptor = "I")
    public volatile int field3441 = 0;

    @OriginalMember(owner = "client!dga", name = "B", descriptor = "Lek;")
    private class465 field3439 = new class465(8);

    @OriginalMember(owner = "client!dga", name = "n", descriptor = "I")
    public static int field3426 = 0;

    @OriginalMember(owner = "client!dga", name = "a", descriptor = "I")
    public static int field3413;

    @OriginalMember(owner = "client!dga", name = "b", descriptor = "I")
    public static int field3414;

    @OriginalMember(owner = "client!dga", name = "c", descriptor = "I")
    public static int field3415;

    @OriginalMember(owner = "client!dga", name = "e", descriptor = "I")
    public static int field3417;

    @OriginalMember(owner = "client!dga", name = "f", descriptor = "I")
    public static int field3418;

    @OriginalMember(owner = "client!dga", name = "g", descriptor = "I")
    public static int field3419;

    @OriginalMember(owner = "client!dga", name = "h", descriptor = "I")
    public static int field3420;

    @OriginalMember(owner = "client!dga", name = "i", descriptor = "I")
    public static int field3421;

    @OriginalMember(owner = "client!dga", name = "j", descriptor = "I")
    public static int field3422;

    @OriginalMember(owner = "client!dga", name = "k", descriptor = "I")
    public static int field3423;

    @OriginalMember(owner = "client!dga", name = "l", descriptor = "I")
    public static int field3424;

    @OriginalMember(owner = "client!dga", name = "o", descriptor = "I")
    public static int field3427;

    @OriginalMember(owner = "client!dga", name = "p", descriptor = "I")
    public static int field3428;

    @OriginalMember(owner = "client!dga", name = "q", descriptor = "I")
    public static int field3429;

    @OriginalMember(owner = "client!dga", name = "r", descriptor = "I")
    public static int field3430;

    @OriginalMember(owner = "client!dga", name = "v", descriptor = "I")
    private int field3434;

    @OriginalMember(owner = "client!dga", name = "y", descriptor = "I")
    public static int field3437;

    @OriginalMember(owner = "client!dga", name = "x", descriptor = "J")
    private long field3436;

    @OriginalMember(owner = "client!dga", name = "F", descriptor = "Lew;")
    private class226 field3442;

    @OriginalMember(owner = "client!dga", name = "w", descriptor = "Lfaa;")
    private class425 field3435;

    @OriginalMember(owner = "client!dga", name = "a", descriptor = "(I)V", line = 5)
    public final void method1510(int arg0) {
        field3414++;
        if (this.field3435 == null) {
            return;
        }
        try {
            if (arg0 != -513) {
                this.field3433 = null;
            }
            this.field3433.field6710 = 0;
            this.field3433.method2753((byte) 58, 7);
            this.field3433.method2698(0, 1426909800);
            this.field3435.method2505(arg0 + 427, this.field3433.field6719, 4, 0);
        } catch (IOException var3) {
            try {
                this.field3435.method2501(-2);
            } catch (Exception var2) {
            }
            this.field3441 = -2;
            this.field3440++;
            this.field3435 = null;
        }
    }

    @OriginalMember(owner = "client!dga", name = "a", descriptor = "(IBIZI)Lew;", line = 33)
    public final class226 method1511(int arg0, byte arg1, int arg2, boolean arg3, int arg4) {
        field3418++;
        long var6 = (long) ((arg2 << 16) + arg0);
        class226 var8 = new class226();
        var8.field3100 = arg3;
        if (arg4 != -756730288) {
            return null;
        }
        var8.field2469 = var6;
        var8.field3374 = arg1;
        if (arg3) {
            if (this.method1521((byte) -6) >= 20) {
                throw new RuntimeException();
            }
            this.field3416.method2107(true, var8);
        } else if (this.method1520((byte) -1) < 20) {
            this.field3431.method2107(true, var8);
        } else {
            throw new RuntimeException();
        }
        return var8;
    }

    @OriginalMember(owner = "client!dga", name = "a", descriptor = "(B)V", line = 75)
    public final void method1512(byte arg0) {
        field3415++;
        if (this.field3435 != null) {
            this.field3435.method2500(true);
        }
        if (arg0 != -99) {
            this.field3438 = 76;
        }
    }

    @OriginalMember(owner = "client!dga", name = "b", descriptor = "(B)V", line = 92)
    private final void method1513(byte arg0) {
        field3421++;
        if (this.field3435 == null) {
            return;
        }
        try {
            int var2 = 125 % ((-arg0 - 44) / 43);
            this.field3433.field6710 = 0;
            this.field3433.method2753((byte) 122, 6);
            this.field3433.method2698(3, 1426909800);
            this.field3435.method2505(-93, this.field3433.field6719, 4, 0);
        } catch (IOException var4) {
            try {
                this.field3435.method2501(-2);
            } catch (Exception var3) {
            }
            this.field3435 = null;
            this.field3441 = -2;
            this.field3440++;
        }
    }

    @OriginalMember(owner = "client!dga", name = "a", descriptor = "(IB)Lkd;", line = 119)
    public static final class700 method1514(int arg0, byte arg1) {
        field3427++;
        class700[] var2 = class234.method1533(4096);
        if (arg1 > -80) {
            return null;
        }
        for (int var3 = 0; var3 < var2.length; var3++) {
            class700 var4 = var2[var3];
            if (var4.field9920 == arg0) {
                return var4;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!dga", name = "a", descriptor = "(ILfaa;Z)V", line = 149)
    public final void method1515(int arg0, class425 arg1, boolean arg2) {
        field3423++;
        if (this.field3435 != null) {
            try {
                this.field3435.method2501(arg0 ^ 0x1);
            } catch (Exception var8) {
            }
            this.field3435 = null;
        }
        this.field3435 = arg1;
        this.method1513((byte) -107);
        this.method1519(arg2, (byte) 105);
        this.field3442 = null;
        this.field3439.field6710 = 0;
        while (true) {
            class226 var4 = (class226) this.field3425.method2105(-4488);
            if (var4 == null) {
                while (true) {
                    class226 var5 = (class226) this.field3432.method2105(-4488);
                    if (var5 == null) {
                        if (~this.field3438 != arg0) {
                            try {
                                this.field3433.field6710 = 0;
                                this.field3433.method2753((byte) 68, 4);
                                this.field3433.method2753((byte) 99, this.field3438);
                                this.field3433.method2739((byte) -86, 0);
                                this.field3435.method2505(-28, this.field3433.field6719, 4, 0);
                            } catch (IOException var7) {
                                try {
                                    this.field3435.method2501(-2);
                                } catch (Exception var6) {
                                }
                                this.field3441 = -2;
                                this.field3435 = null;
                                this.field3440++;
                            }
                        }
                        this.field3434 = 0;
                        this.field3436 = class254.method1619(true);
                        return;
                    }
                    this.field3431.method2107(true, var5);
                }
            }
            this.field3416.method2107(true, var4);
        }
    }

    @OriginalMember(owner = "client!dga", name = "c", descriptor = "(B)V", line = 219)
    public final void method1516(byte arg0) {
        try {
            this.field3435.method2501(-2);
        } catch (Exception var2) {
        }
        field3428++;
        this.field3440++;
        if (arg0 != 15) {
            this.field3435 = null;
        }
        this.field3435 = null;
        this.field3438 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
        this.field3441 = -1;
    }

    @OriginalMember(owner = "client!dga", name = "a", descriptor = "(Z)Z", line = 237)
    public final boolean method1517(boolean arg0) {
        if (arg0) {
            this.method1511(-79, (byte) 58, -33, false, -72);
        }
        field3420++;
        return this.method1520((byte) -1) >= 20;
    }

    @OriginalMember(owner = "client!dga", name = "a", descriptor = "(III)Z", line = 249)
    public static final boolean method1518(int arg0, int arg1, int arg2) {
        if (arg1 != 0) {
            field3426 = -35;
        }
        field3417++;
        return class312.method1885(arg2, arg0, true) | (arg0 & 0x70000) != 0 || class619.method3497(arg0, arg2, arg1);
    }

    @OriginalMember(owner = "client!dga", name = "a", descriptor = "(ZB)V", line = 267)
    public final void method1519(boolean arg0, byte arg1) {
        field3419++;
        if (this.field3435 == null) {
            return;
        }
        try {
            this.field3433.field6710 = 0;
            this.field3433.method2753((byte) 122, arg0 ? 2 : 3);
            this.field3433.method2698(0, 1426909800);
            this.field3435.method2505(-40, this.field3433.field6719, 4, 0);
        } catch (IOException var4) {
            try {
                this.field3435.method2501(-2);
            } catch (Exception var3) {
            }
            this.field3435 = null;
            this.field3440++;
            this.field3441 = -2;
        }
        if (arg1 <= 100) {
            this.method1519(true, (byte) 37);
        }
    }

    @OriginalMember(owner = "client!dga", name = "d", descriptor = "(B)I", line = 295)
    private final int method1520(byte arg0) {
        field3430++;
        if (arg0 != -1) {
            this.method1515(67, null, true);
        }
        return this.field3431.method2111((byte) 31) + this.field3432.method2111((byte) 31);
    }

    @OriginalMember(owner = "client!dga", name = "e", descriptor = "(B)I", line = 306)
    public final int method1521(byte arg0) {
        if (arg0 != -6) {
            this.method1510(1);
        }
        field3437++;
        return this.field3416.method2111((byte) 31) + this.field3425.method2111((byte) 31);
    }

    @OriginalMember(owner = "client!dga", name = "b", descriptor = "(Z)Z", line = 321)
    public final boolean method1522(boolean arg0) {
        field3422++;
        if (this.field3435 != null) {
            long var2 = class254.method1619(true);
            int var4 = (int) (var2 - this.field3436);
            this.field3436 = var2;
            if (var4 > 200) {
                var4 = 200;
            }
            this.field3434 += var4;
            if (this.field3434 > 30000) {
                try {
                    this.field3435.method2501(-2);
                } catch (Exception var27) {
                }
                this.field3435 = null;
            }
        }
        if (this.field3435 == null) {
            return this.method1521((byte) -6) == 0 && this.method1520((byte) -1) == 0;
        }
        try {
            this.field3435.method2504((byte) 119);
            if (arg0) {
                this.method1515(-123, null, true);
            }
            for (class226 var5 = (class226) this.field3416.method2112((byte) 125); var5 != null; var5 = (class226) this.field3416.method2109(-124)) {
                this.field3433.field6710 = 0;
                this.field3433.method2753((byte) 106, 1);
                this.field3433.method2698((int) var5.field2469, 1426909800);
                this.field3435.method2505(-40, this.field3433.field6719, 4, 0);
                this.field3425.method2107(true, var5);
            }
            for (class226 var6 = (class226) this.field3431.method2112((byte) 121); var6 != null; var6 = (class226) this.field3431.method2109(-112)) {
                this.field3433.field6710 = 0;
                this.field3433.method2753((byte) 92, 0);
                this.field3433.method2698((int) var6.field2469, 1426909800);
                this.field3435.method2505(100, this.field3433.field6719, 4, 0);
                this.field3432.method2107(true, var6);
            }
            for (int var7 = 0; var7 < 100; var7++) {
                int var8 = this.field3435.method2506((byte) -104);
                if (var8 < 0) {
                    throw new IOException();
                }
                if (var8 == 0) {
                    break;
                }
                this.field3434 = 0;
                byte var9 = 0;
                if (this.field3442 == null) {
                    var9 = 8;
                } else if (this.field3442.field3371 == 0) {
                    var9 = 1;
                }
                if (var9 > 0) {
                    int var10 = var9 - this.field3439.field6710;
                    if (var8 < var10) {
                        var10 = var8;
                    }
                    this.field3435.method2502(-93, var10, this.field3439.field6710, this.field3439.field6719);
                    if (this.field3438 != 0) {
                        for (int var11 = 0; var11 < var10; var11++) {
                            this.field3439.field6719[this.field3439.field6710 + var11] = (byte) class565.method3310(this.field3439.field6719[this.field3439.field6710 + var11], this.field3438);
                        }
                    }
                    this.field3439.field6710 += var10;
                    if (var9 <= this.field3439.field6710) {
                        if (this.field3442 == null) {
                            this.field3439.field6710 = 0;
                            int var12 = this.field3439.method2705(-68);
                            int var13 = this.field3439.method2755((byte) -105);
                            int var14 = this.field3439.method2705(-127);
                            int var15 = this.field3439.method2691((byte) -67);
                            int var16 = var14 & 0x7F;
                            boolean var17 = (var14 & 0x80) != 0;
                            long var18 = (long) ((var12 << 16) + var13);
                            Object var20 = null;
                            class226 var21;
                            if (var17) {
                                for (var21 = (class226) this.field3432.method2112((byte) 121); var21 != null && var21.field2469 != var18; var21 = (class226) this.field3432.method2109(-80)) {
                                }
                            } else {
                                for (var21 = (class226) this.field3425.method2112((byte) 124); var21 != null && var21.field2469 != var18; var21 = (class226) this.field3425.method2109(-82)) {
                                }
                            }
                            if (var21 == null) {
                                throw new IOException();
                            }
                            this.field3442 = var21;
                            int var22 = var16 == 0 ? 5 : 9;
                            this.field3442.field3370 = new class465(this.field3442.field3374 + var15 + var22);
                            this.field3442.field3370.method2753((byte) 125, var16);
                            this.field3442.field3370.method2733(false, var15);
                            this.field3442.field3371 = 8;
                            this.field3439.field6710 = 0;
                        } else if (this.field3442.field3371 != 0) {
                            throw new IOException();
                        } else if (this.field3439.field6719[0] == -1) {
                            this.field3442.field3371 = 1;
                            this.field3439.field6710 = 0;
                        } else {
                            this.field3442 = null;
                        }
                    }
                } else {
                    int var23 = this.field3442.field3370.field6719.length - this.field3442.field3374;
                    int var24 = 512 - this.field3442.field3371;
                    if (var23 - this.field3442.field3370.field6710 < var24) {
                        var24 = var23 - this.field3442.field3370.field6710;
                    }
                    if (var8 < var24) {
                        var24 = var8;
                    }
                    this.field3435.method2502(-66, var24, this.field3442.field3370.field6710, this.field3442.field3370.field6719);
                    if (this.field3438 != 0) {
                        for (int var25 = 0; var25 < var24; var25++) {
                            this.field3442.field3370.field6719[this.field3442.field3370.field6710 + var25] = (byte) class565.method3310(this.field3442.field3370.field6719[this.field3442.field3370.field6710 + var25], this.field3438);
                        }
                    }
                    this.field3442.field3370.field6710 += var24;
                    this.field3442.field3371 += var24;
                    if (this.field3442.field3370.field6710 == var23) {
                        this.field3442.method1113(32730);
                        this.field3442.field3107 = false;
                        this.field3442 = null;
                    } else if (this.field3442.field3371 == 512) {
                        this.field3442.field3371 = 0;
                    }
                }
            }
            return true;
        } catch (IOException var28) {
            try {
                this.field3435.method2501(-2);
            } catch (Exception var26) {
            }
            this.field3440++;
            this.field3435 = null;
            this.field3441 = -2;
            return this.method1521((byte) -6) == 0 && this.method1520((byte) -1) == 0;
        }
    }

    @OriginalMember(owner = "client!dga", name = "a", descriptor = "(II)V", line = 599)
    public static final void method1523(int arg0, int arg1) {
        field3429++;
        class449 var2 = class611.method3463(arg1, (byte) -114, 11);
        var2.method2614(97);
        int var3 = 121 % ((26 - arg0) / 34);
    }

    @OriginalMember(owner = "client!dga", name = "b", descriptor = "(I)V", line = 612)
    public final void method1524(int arg0) {
        field3424++;
        if (arg0 != 4) {
            this.method1516((byte) -22);
        }
        if (this.field3435 != null) {
            this.field3435.method2501(-2);
        }
    }

    @OriginalMember(owner = "client!dga", name = "f", descriptor = "(B)Z", line = 627)
    public final boolean method1525(byte arg0) {
        int var2 = 31 % ((arg0 + 34) / 42);
        field3413++;
        return this.method1521((byte) -6) >= 20;
    }
}
