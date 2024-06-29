import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rh")
public class class280 {

    @OriginalMember(owner = "client!rh", name = "x", descriptor = "I")
    public int field3878 = 0;

    @OriginalMember(owner = "client!rh", name = "o", descriptor = "I")
    public int field3869 = -1;

    @OriginalMember(owner = "client!rh", name = "r", descriptor = "I")
    public int field3872 = -1;

    @OriginalMember(owner = "client!rh", name = "K", descriptor = "Ljava/lang/String;")
    public String field3891 = null;

    @OriginalMember(owner = "client!rh", name = "N", descriptor = "Ljia;")
    public static class645 field3893 = new class645();

    @OriginalMember(owner = "client!rh", name = "Q", descriptor = "Z")
    public static boolean field3896 = false;

    @OriginalMember(owner = "client!rh", name = "j", descriptor = "B")
    public byte field3864;

    @OriginalMember(owner = "client!rh", name = "l", descriptor = "B")
    public byte field3866;

    @OriginalMember(owner = "client!rh", name = "p", descriptor = "B")
    public byte field3870;

    @OriginalMember(owner = "client!rh", name = "R", descriptor = "B")
    public byte field3897;

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "I")
    public static int field3855;

    @OriginalMember(owner = "client!rh", name = "c", descriptor = "I")
    public static int field3857;

    @OriginalMember(owner = "client!rh", name = "e", descriptor = "I")
    public static int field3859;

    @OriginalMember(owner = "client!rh", name = "f", descriptor = "I")
    public static int field3860;

    @OriginalMember(owner = "client!rh", name = "i", descriptor = "I")
    public static int field3863;

    @OriginalMember(owner = "client!rh", name = "k", descriptor = "I")
    public static int field3865;

    @OriginalMember(owner = "client!rh", name = "m", descriptor = "I")
    public static int field3867;

    @OriginalMember(owner = "client!rh", name = "n", descriptor = "I")
    public static int field3868;

    @OriginalMember(owner = "client!rh", name = "q", descriptor = "I")
    public static int field3871;

    @OriginalMember(owner = "client!rh", name = "s", descriptor = "I")
    public static int field3873;

    @OriginalMember(owner = "client!rh", name = "v", descriptor = "I")
    public static int field3876;

    @OriginalMember(owner = "client!rh", name = "y", descriptor = "I")
    public static int field3879;

    @OriginalMember(owner = "client!rh", name = "z", descriptor = "I")
    public static int field3880;

    @OriginalMember(owner = "client!rh", name = "A", descriptor = "I")
    public static int field3881;

    @OriginalMember(owner = "client!rh", name = "B", descriptor = "I")
    public static int field3882;

    @OriginalMember(owner = "client!rh", name = "C", descriptor = "I")
    public static int field3883;

    @OriginalMember(owner = "client!rh", name = "E", descriptor = "I")
    public static int field3885;

    @OriginalMember(owner = "client!rh", name = "F", descriptor = "I")
    public static int field3886;

    @OriginalMember(owner = "client!rh", name = "H", descriptor = "I")
    public static int field3888;

    @OriginalMember(owner = "client!rh", name = "I", descriptor = "I")
    public static int field3889;

    @OriginalMember(owner = "client!rh", name = "J", descriptor = "I")
    public int field3890;

    @OriginalMember(owner = "client!rh", name = "P", descriptor = "I")
    public int field3895;

    @OriginalMember(owner = "client!rh", name = "d", descriptor = "J")
    public long field3858;

    @OriginalMember(owner = "client!rh", name = "M", descriptor = "Lcja;")
    private class46 field3892;

    @OriginalMember(owner = "client!rh", name = "h", descriptor = "Z")
    private boolean field3862;

    @OriginalMember(owner = "client!rh", name = "G", descriptor = "Z")
    private boolean field3887;

    @OriginalMember(owner = "client!rh", name = "O", descriptor = "Z")
    public boolean field3894;

    @OriginalMember(owner = "client!rh", name = "u", descriptor = "[B")
    public byte[] field3875;

    @OriginalMember(owner = "client!rh", name = "t", descriptor = "[I")
    private int[] field3874;

    @OriginalMember(owner = "client!rh", name = "b", descriptor = "[J")
    private long[] field3856;

    @OriginalMember(owner = "client!rh", name = "w", descriptor = "[J")
    private long[] field3877;

    @OriginalMember(owner = "client!rh", name = "g", descriptor = "[Ljava/lang/String;")
    public String[] field3861;

    @OriginalMember(owner = "client!rh", name = "D", descriptor = "[Ljava/lang/String;")
    public String[] field3884;

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(IIJ)Z")
    public final boolean method1791(int arg0, int arg1, long arg2) {
        field3860++;
        if (this.field3892 == null) {
            this.field3892 = new class46(4);
        } else {
            class154 var5 = this.field3892.method337((long) arg0, 1);
            if (var5 != null) {
                if (var5 instanceof class665) {
                    class665 var6 = (class665) var5;
                    if (var6.field9234 == arg2) {
                        return false;
                    }
                    var6.field9234 = arg2;
                    return true;
                }
                var5.method1207(103);
            }
        }
        this.field3892.method341((long) arg0, new class665(arg2), (byte) 44);
        if (arg1 != 1) {
            this.method1805(-77, 38);
        }
        return true;
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(I)V")
    private final void method1792(int arg0) {
        if (arg0 != 17086) {
            this.field3887 = false;
        }
        field3876++;
        if (this.field3895 == 0) {
            this.field3869 = -1;
            this.field3872 = -1;
            return;
        }
        this.field3872 = -1;
        this.field3869 = -1;
        int var2 = 0;
        byte var3 = this.field3875[0];
        for (int var4 = 1; var4 < this.field3895; var4++) {
            if (var3 < this.field3875[var4]) {
                var3 = this.field3875[var4];
                var2 = var4;
            } else if (this.field3872 == -1 && this.field3875[var4] == 125) {
                this.field3872 = var4;
            }
        }
        this.field3869 = var2;
        if (this.field3869 != -1) {
            this.field3875[this.field3869] = 126;
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(ILfca;)V")
    private final void method1793(int arg0, class93 arg1) {
        field3883++;
        int var3 = arg1.method793((byte) 58);
        if (var3 < 1 || var3 > 3) {
            throw new RuntimeException("Unsupported ClanSettings version: " + var3);
        }
        int var4 = arg1.method793((byte) 78);
        if ((var4 & 0x2) != 0) {
            this.field3862 = true;
        }
        if ((var4 & 0x1) != 0) {
            this.field3887 = true;
        }
        if (!this.field3862) {
            this.field3884 = null;
            this.field3861 = null;
        }
        if (!this.field3887) {
            this.field3877 = null;
            this.field3856 = null;
        }
        this.field3878 = arg1.method773(3);
        int var5 = -19 / ((arg0 + 42) / 60);
        arg1.method773(3);
        this.field3895 = arg1.method763(107);
        this.field3890 = arg1.method793((byte) 82);
        this.field3891 = arg1.method752(0);
        this.field3894 = arg1.method793((byte) 123) == 1;
        this.field3897 = arg1.method766((byte) 122);
        this.field3864 = arg1.method766((byte) 122);
        this.field3866 = arg1.method766((byte) 122);
        this.field3870 = arg1.method766((byte) 122);
        if (this.field3895 > 0) {
            if (this.field3887 && (this.field3877 == null || this.field3877.length < this.field3895)) {
                this.field3877 = new long[this.field3895];
            }
            if (this.field3862 && (this.field3884 == null || this.field3884.length < this.field3895)) {
                this.field3884 = new String[this.field3895];
            }
            if (this.field3875 == null || this.field3895 > this.field3875.length) {
                this.field3875 = new byte[this.field3895];
            }
            if (this.field3874 == null || this.field3874.length < this.field3895) {
                this.field3874 = new int[this.field3895];
            }
            for (int var6 = 0; var6 < this.field3895; var6++) {
                if (this.field3887) {
                    this.field3877[var6] = arg1.method770((byte) 65);
                }
                if (this.field3862) {
                    this.field3884[var6] = arg1.method802(false);
                }
                this.field3875[var6] = arg1.method766((byte) 122);
                if (var3 >= 2) {
                    this.field3874[var6] = arg1.method773(3);
                }
            }
            this.method1792(17086);
        }
        if (this.field3890 > 0) {
            if (this.field3887 && (this.field3856 == null || this.field3856.length < this.field3890)) {
                this.field3856 = new long[this.field3890];
            }
            if (this.field3862 && (this.field3861 == null || this.field3861.length < this.field3890)) {
                this.field3861 = new String[this.field3890];
            }
            for (int var7 = 0; var7 < this.field3890; var7++) {
                if (this.field3887) {
                    this.field3856[var7] = arg1.method770((byte) 72);
                }
                if (this.field3862) {
                    this.field3861[var7] = arg1.method802(false);
                }
            }
        }
        if (var3 < 3) {
            return;
        }
        int var8 = arg1.method763(86);
        if (var8 <= 0) {
            return;
        }
        this.field3892 = new class46(var8 < 16 ? class241.method1609((byte) -106, var8) : 16);
        while ((var8--) > 0) {
            int var9 = arg1.method773(3);
            int var10 = var9 & 0x3FFFFFFF;
            int var11 = var9 >>> 30;
            if (var11 == 0) {
                int var15 = arg1.method773(3);
                this.field3892.method341((long) var10, new class345(var15), (byte) 47);
            } else if (var11 == 1) {
                long var13 = arg1.method770((byte) 99);
                this.field3892.method341((long) var10, new class665(var13), (byte) 74);
            } else if (var11 == 2) {
                String var12 = arg1.method752(0);
                this.field3892.method341((long) var10, new class682(var12), (byte) 89);
            }
        }
        return;
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(Ljava/lang/String;JB)V")
    public final void method1794(String arg0, long arg1, byte arg2) {
        field3867++;
        if (arg0 != null && arg0.length() == 0) {
            arg0 = null;
        }
        if (arg1 <= 0L == this.field3887) {
            throw new RuntimeException("Invalid UserHash arg to this method - useUserHashes:" + this.field3887 + " but userhash:" + arg1);
        } else if (this.field3862 == (arg0 == null)) {
            throw new RuntimeException("Invalid DisplayName arg to this method - useDisplayNames:" + this.field3862 + " but displayname:" + arg0);
        } else {
            if (arg1 > 0L && (this.field3856 == null || this.field3890 >= this.field3856.length) || arg0 != null && (this.field3861 == null || this.field3861.length <= this.field3890)) {
                this.method1799(30221, this.field3890 + 5);
            }
            if (this.field3856 != null) {
                this.field3856[this.field3890] = arg1;
            }
            if (arg2 == 8) {
                if (this.field3861 != null) {
                    this.field3861[this.field3890] = arg0;
                }
                this.field3890++;
            }
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(IIIBI)I")
    public final int method1795(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        field3865++;
        if (arg3 < 6) {
            this.field3892 = null;
        }
        int var6 = (0x1 << arg4) - 1;
        int var7 = arg2 == 31 ? -1 : (0x1 << arg2 + 1) - 1;
        int var8 = arg0 << arg4;
        int var9 = var6 ^ var7;
        int var10 = var8 & var9;
        int var11 = this.field3874[arg1];
        if ((var11 & var9) == var10) {
            return -1;
        } else {
            int var12 = var11 & ~var9;
            this.field3874[arg1] = class530.method3011(var12, var10);
            return arg1;
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(II[BIII)Z")
    public static final boolean method1796(int arg0, int arg1, byte[] arg2, int arg3, int arg4, int arg5) {
        field3868++;
        if (arg4 <= 82) {
            field3893 = null;
        }
        boolean var6 = true;
        class93 var7 = new class93(arg2);
        int var8 = -1;
        label72: while (true) {
            int var9 = var7.method761((byte) 121);
            if (var9 == 0) {
                return var6;
            }
            var8 += var9;
            int var10 = 0;
            boolean var11 = false;
            while (true) {
                int var15;
                class445 var18;
                do {
                    int var16;
                    int var17;
                    do {
                        do {
                            do {
                                do {
                                    while (var11) {
                                        int var19 = var7.method746(false);
                                        if (var19 == 0) {
                                            continue label72;
                                        }
                                        var7.method793((byte) 28);
                                    }
                                    int var12 = var7.method746(false);
                                    if (var12 == 0) {
                                        continue label72;
                                    }
                                    var10 += var12 - 1;
                                    int var13 = var10 & 0x3F;
                                    int var14 = (var10 & 0xFD7) >> 6;
                                    var15 = var7.method793((byte) 91) >> 2;
                                    var16 = arg1 + var14;
                                    var17 = arg3 + var13;
                                } while (var16 <= 0);
                            } while (var17 <= 0);
                        } while (var16 >= arg0 - 1);
                    } while (var17 >= arg5 - 1);
                    var18 = class414.field5670.method2319(var8, false);
                } while (var15 == 22 && class111.field1911.field6716.method3547((byte) 103) == 0 && var18.field6050 == 0 && var18.field6041 != 1 && !var18.field6064);
                var11 = true;
                if (!var18.method2592(-127)) {
                    class56.field799++;
                    var6 = false;
                }
            }
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(III)Z")
    public final boolean method1797(int arg0, int arg1, int arg2) {
        field3855++;
        if (this.field3892 == null) {
            this.field3892 = new class46(4);
        } else {
            class154 var4 = this.field3892.method337((long) arg1, 1);
            if (var4 != null) {
                if (var4 instanceof class345) {
                    class345 var5 = (class345) var4;
                    if (var5.field4640 == arg2) {
                        return false;
                    }
                    var5.field4640 = arg2;
                    return true;
                }
                var4.method1207(82);
            }
        }
        if (arg0 < 3) {
            return false;
        } else {
            this.field3892.method341((long) arg1, new class345(arg2), (byte) 114);
            return true;
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(IZ)V")
    public final void method1798(int arg0, boolean arg1) {
        if (!arg1) {
            this.method1794(null, -71L, (byte) 35);
        }
        field3880++;
        if (arg0 < 0 || this.field3895 <= arg0) {
            throw new RuntimeException("Invalid pos in doDeleteMember - pos:" + arg0 + " memberCount:" + this.field3895);
        }
        this.field3895--;
        if (this.field3895 == 0) {
            this.field3872 = -1;
            this.field3874 = null;
            this.field3869 = -1;
            this.field3877 = null;
            this.field3875 = null;
            this.field3884 = null;
            return;
        }
        class275.method1771(this.field3875, arg0 + 1, this.field3875, arg0, this.field3895 - arg0);
        class275.method1770(this.field3874, arg0 + 1, this.field3874, arg0, this.field3895 - arg0);
        if (this.field3877 != null) {
            class275.method1775(this.field3877, arg0 + 1, this.field3877, arg0, this.field3895 - arg0);
        }
        if (this.field3884 != null) {
            class275.method1769(this.field3884, arg0 + 1, this.field3884, arg0, this.field3895 - arg0);
        }
        if (this.field3869 == arg0 || this.field3872 == arg0) {
            this.method1792(17086);
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(II)V")
    private final void method1799(int arg0, int arg1) {
        if (arg0 != 30221) {
            this.field3866 = -54;
        }
        if (this.field3887) {
            if (this.field3856 == null) {
                this.field3856 = new long[arg1];
            } else {
                class275.method1775(this.field3856, 0, this.field3856 = new long[arg1], 0, this.field3890);
            }
        }
        field3885++;
        if (!this.field3862) {
            return;
        }
        if (this.field3861 == null) {
            this.field3861 = new String[arg1];
        } else {
            class275.method1769(this.field3861, 0, this.field3861 = new String[arg1], 0, this.field3890);
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(BBI)I")
    public final int method1800(byte arg0, byte arg1, int arg2) {
        field3879++;
        if (arg1 != 94) {
            return 110;
        } else if (arg0 == 126 || arg0 == 127) {
            return -1;
        } else if (this.field3869 == arg2 && (this.field3872 == -1 || this.field3875[this.field3872] < 125)) {
            return -1;
        } else if (this.field3875[arg2] == arg0) {
            return -1;
        } else {
            this.field3875[arg2] = arg0;
            this.method1792(17086);
            return arg2;
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(IB)V")
    public final void method1801(int arg0, byte arg1) {
        field3873++;
        this.field3890--;
        if (arg1 != -117) {
            this.method1805(37, -110);
        }
        if (this.field3890 == 0) {
            this.field3861 = null;
            this.field3856 = null;
            return;
        }
        if (this.field3856 != null) {
            class275.method1775(this.field3856, arg0 + 1, this.field3856, arg0, this.field3890 - arg0);
        }
        if (this.field3861 != null) {
            class275.method1769(this.field3861, arg0 + 1, this.field3861, arg0, this.field3890 - arg0);
            return;
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(IBLjava/lang/String;)Z")
    public final boolean method1802(int arg0, byte arg1, String arg2) {
        if (arg1 >= -4) {
            return false;
        }
        if (arg2 == null) {
            arg2 = "";
        } else if (arg2.length() > 80) {
            arg2 = arg2.substring(0, 80);
        }
        field3871++;
        if (this.field3892 == null) {
            this.field3892 = new class46(4);
        } else {
            class154 var4 = this.field3892.method337((long) arg0, 1);
            if (var4 != null) {
                if (var4 instanceof class682) {
                    class682 var5 = (class682) var4;
                    if (var5.field9498.equals(arg2)) {
                        return false;
                    }
                    var5.field9498 = arg2;
                    return true;
                }
                var4.method1207(94);
            }
        }
        this.field3892.method341((long) arg0, new class682(arg2), (byte) 92);
        return true;
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(IIIII)Z")
    public final boolean method1803(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3881++;
        int var6 = (0x1 << arg0) - 1;
        int var7 = arg1 == 31 ? -1 : (0x1 << arg1 + 1) - 1;
        int var8 = var7 ^ var6;
        int var9 = arg3 << arg0;
        if (arg4 != -32088) {
            return false;
        }
        int var10 = var9 & var8;
        if (this.field3892 == null) {
            this.field3892 = new class46(4);
        } else {
            class154 var11 = this.field3892.method337((long) arg2, arg4 + 32089);
            if (var11 != null) {
                if (var11 instanceof class345) {
                    class345 var12 = (class345) var11;
                    if ((var12.field4640 & var8) == var10) {
                        return false;
                    }
                    var12.field4640 &= ~var8;
                    var12.field4640 |= var10;
                    return true;
                }
                var11.method1207(arg4 + 32170);
            }
        }
        this.field3892.method341((long) arg2, new class345(var10), (byte) 29);
        return true;
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(B)V")
    public static void method1804(byte arg0) {
        field3893 = null;
        if (arg0 < 95) {
            field3896 = false;
        }
    }

    @OriginalMember(owner = "client!rh", name = "b", descriptor = "(II)Ljava/lang/String;")
    public final String method1805(int arg0, int arg1) {
        field3889++;
        if (this.field3892 == null) {
            return null;
        } else if (arg1 == 0) {
            class154 var3 = this.field3892.method337((long) arg0, 1);
            return var3 != null && var3 instanceof class682 ? ((class682) var3).field9498 : null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!rh", name = "c", descriptor = "(II)Ljava/lang/Long;")
    public final Long method1806(int arg0, int arg1) {
        field3859++;
        if (arg1 < 103) {
            this.method1803(-117, 25, -13, -124, -98);
        }
        if (this.field3892 == null) {
            return null;
        } else {
            class154 var3 = this.field3892.method337((long) arg0, 1);
            return var3 != null && var3 instanceof class665 ? Long.valueOf(((class665) var3).field9234) : null;
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(IIII)I")
    public final int method1807(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 >= -46) {
            this.field3866 = -84;
        }
        field3886++;
        int var5 = arg0 == 31 ? -1 : (0x1 << arg0 + 1) - 1;
        return (var5 & this.field3874[arg2]) >>> arg3;
    }

    @OriginalMember(owner = "client!rh", name = "b", descriptor = "(IIII)Ljava/lang/Integer;")
    public final Integer method1808(int arg0, int arg1, int arg2, int arg3) {
        field3857++;
        if (this.field3892 == null) {
            return null;
        } else if (arg1 >= -32) {
            return null;
        } else {
            class154 var5 = this.field3892.method337((long) arg2, 1);
            if (var5 != null && var5 instanceof class345) {
                int var6 = arg0 == 31 ? -1 : (0x1 << arg0 + 1) - 1;
                return Integer.valueOf((((class345) var5).field4640 & var6) >>> arg3);
            } else {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(BLjava/lang/String;J)V")
    public final void method1809(byte arg0, String arg1, long arg2) {
        field3888++;
        if (arg1 != null && arg1.length() == 0) {
            arg1 = null;
        }
        if (this.field3887 != arg2 > 0L) {
            throw new RuntimeException("Invalid UserHash arg to this method - useUserHashes:" + this.field3887 + " but userhash:" + arg2);
        } else if (this.field3862 == (arg1 != null)) {
            if (arg2 > 0L && (this.field3877 == null || this.field3877.length <= this.field3895) || arg1 != null && (this.field3884 == null || this.field3895 >= this.field3884.length)) {
                this.method1810(this.field3895 + 5, 3879);
            }
            if (this.field3877 != null) {
                this.field3877[this.field3895] = arg2;
            }
            if (this.field3884 != null) {
                this.field3884[this.field3895] = arg1;
            }
            if (this.field3869 == -1) {
                this.field3869 = this.field3895;
                this.field3875[this.field3895] = 126;
            } else {
                this.field3875[this.field3895] = 0;
            }
            this.field3874[this.field3895] = 0;
            if (arg0 > -97) {
                this.method1807(53, 62, -101, -78);
            }
            this.field3895++;
        } else {
            throw new RuntimeException("Invalid DisplayName arg to this method - useDisplayNames:" + this.field3862 + " but displayname:" + arg1);
        }
    }

    @OriginalMember(owner = "client!rh", name = "d", descriptor = "(II)V")
    private final void method1810(int arg0, int arg1) {
        if (this.field3887) {
            if (this.field3877 == null) {
                this.field3877 = new long[arg0];
            } else {
                class275.method1775(this.field3877, 0, this.field3877 = new long[arg0], 0, this.field3895);
            }
        }
        field3882++;
        if (arg1 != 3879) {
            return;
        }
        if (this.field3862) {
            if (this.field3884 == null) {
                this.field3884 = new String[arg0];
            } else {
                class275.method1769(this.field3884, 0, this.field3884 = new String[arg0], 0, this.field3895);
            }
        }
        if (this.field3875 == null) {
            this.field3875 = new byte[arg0];
        } else {
            class275.method1771(this.field3875, 0, this.field3875 = new byte[arg0], 0, this.field3895);
        }
        if (this.field3874 == null) {
            this.field3874 = new int[arg0];
        } else {
            class275.method1770(this.field3874, 0, this.field3874 = new int[arg0], 0, this.field3895);
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(BI)Ljava/lang/Integer;")
    public final Integer method1811(byte arg0, int arg1) {
        int var3 = 32 % ((-arg0 - 23) / 48);
        field3863++;
        if (this.field3892 == null) {
            return null;
        } else {
            class154 var4 = this.field3892.method337((long) arg1, 1);
            return var4 != null && var4 instanceof class345 ? Integer.valueOf(((class345) var4).field4640) : null;
        }
    }

    @OriginalMember(owner = "client!rh", name = "<init>", descriptor = "(Lfca;)V")
    public class280(class93 arg0) {
        this.method1793(39, arg0);
    }

    @OriginalMember(owner = "client!rh", name = "<init>", descriptor = "()V")
    private class280() {
    }
}
