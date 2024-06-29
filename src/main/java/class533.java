import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lo")
public class class533 {

    @OriginalMember(owner = "client!lo", name = "e", descriptor = "I")
    public int field7734 = -1;

    @OriginalMember(owner = "client!lo", name = "n", descriptor = "B")
    public byte field7743 = 0;

    @OriginalMember(owner = "client!lo", name = "z", descriptor = "I")
    private int field7755 = 0;

    @OriginalMember(owner = "client!lo", name = "h", descriptor = "I")
    private int field7737 = 128;

    @OriginalMember(owner = "client!lo", name = "s", descriptor = "I")
    private int field7748 = -1;

    @OriginalMember(owner = "client!lo", name = "B", descriptor = "I")
    private int field7757 = 0;

    @OriginalMember(owner = "client!lo", name = "A", descriptor = "I")
    private int field7756 = 0;

    @OriginalMember(owner = "client!lo", name = "q", descriptor = "I")
    private int field7746 = 128;

    @OriginalMember(owner = "client!lo", name = "i", descriptor = "Z")
    public boolean field7738 = false;

    @OriginalMember(owner = "client!lo", name = "p", descriptor = "Lgh;")
    public static class388 field7745 = null;

    @OriginalMember(owner = "client!lo", name = "r", descriptor = "[I")
    public static int[] field7747 = new int[32];

    @OriginalMember(owner = "client!lo", name = "c", descriptor = "I")
    public int field7732;

    @OriginalMember(owner = "client!lo", name = "d", descriptor = "I")
    public static int field7733;

    @OriginalMember(owner = "client!lo", name = "f", descriptor = "I")
    public static int field7735;

    @OriginalMember(owner = "client!lo", name = "g", descriptor = "I")
    public static int field7736;

    @OriginalMember(owner = "client!lo", name = "k", descriptor = "I")
    public static int field7740;

    @OriginalMember(owner = "client!lo", name = "l", descriptor = "I")
    private int field7741;

    @OriginalMember(owner = "client!lo", name = "o", descriptor = "I")
    public static int field7744;

    @OriginalMember(owner = "client!lo", name = "t", descriptor = "I")
    public static int field7749;

    @OriginalMember(owner = "client!lo", name = "v", descriptor = "I")
    public static int field7751;

    @OriginalMember(owner = "client!lo", name = "w", descriptor = "I")
    public static int field7752;

    @OriginalMember(owner = "client!lo", name = "y", descriptor = "I")
    public static int field7754;

    @OriginalMember(owner = "client!lo", name = "C", descriptor = "I")
    public static int field7758;

    @OriginalMember(owner = "client!lo", name = "m", descriptor = "Lvp;")
    public static class126 field7742;

    @OriginalMember(owner = "client!lo", name = "u", descriptor = "Lhk;")
    public class68 field7750;

    @OriginalMember(owner = "client!lo", name = "b", descriptor = "[S")
    private short[] field7731;

    @OriginalMember(owner = "client!lo", name = "j", descriptor = "[S")
    private short[] field7739;

    @OriginalMember(owner = "client!lo", name = "x", descriptor = "[S")
    private short[] field7753;

    @OriginalMember(owner = "client!lo", name = "D", descriptor = "[S")
    private short[] field7759;

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "[[B")
    public static byte[][] field7730;

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(B)V", line = 8)
    public static final void method3141(byte arg0) {
        field7752++;
        if (arg0 >= -119) {
            field7747 = null;
        }
        client.field3213.method363(class329.field4996, class151.field2494, class362.field5295);
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(II)I", line = 23)
    public static final int method3142(int arg0, int arg1) {
        field7751++;
        if (arg1 != 822) {
            method3142(-116, 120);
        }
        int var2 = arg0 & 0x3F;
        int var3 = (arg0 & 0xCB) >> 6;
        if (var2 == 18) {
            if (var3 == 0) {
                return 1;
            }
            if (var3 == 1) {
                return 2;
            }
            if (var3 == 2) {
                return 4;
            }
            if (var3 == 3) {
                return 8;
            }
        } else if (var2 == 19 || var2 == 21) {
            if (var3 == 0) {
                return 16;
            }
            if (var3 == 1) {
                return 32;
            }
            if (var3 == 2) {
                return 64;
            }
            if (var3 == 3) {
                return 128;
            }
        }
        return 0;
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(ILgs;BIIILza;)Le;", line = 76)
    public final class374 method3143(int arg0, class34 arg1, byte arg2, int arg3, int arg4, int arg5, class288 arg6) {
        field7744++;
        if (arg2 < 61) {
            method3141((byte) -125);
        }
        return this.method3147(null, null, arg0, (byte) 2, 0, arg3, arg1, 0, arg4, true, arg5, arg6, 0, false);
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(ILnn;B)V", line = 90)
    private final void method3144(int arg0, class289 arg1, byte arg2) {
        field7740++;
        if (arg2 >= -112) {
            this.method3147(null, null, -104, (byte) -124, 108, -9, null, 23, 89, true, 39, null, 126, true);
        }
        if (arg0 == 1) {
            this.field7741 = arg1.method1841((byte) 68);
        } else if (arg0 == 2) {
            this.field7734 = arg1.method1841((byte) -126);
        } else if (arg0 == 4) {
            this.field7737 = arg1.method1841((byte) -121);
        } else if (arg0 == 5) {
            this.field7746 = arg1.method1841((byte) 42);
        } else if (arg0 == 6) {
            this.field7755 = arg1.method1841((byte) -119);
        } else if (arg0 == 7) {
            this.field7757 = arg1.method1858(-3256);
        } else if (arg0 == 8) {
            this.field7756 = arg1.method1858(-3256);
        } else if (arg0 == 9) {
            this.field7748 = 8224;
            this.field7743 = 3;
        } else if (arg0 == 10) {
            this.field7738 = true;
        } else if (arg0 == 11) {
            this.field7743 = 1;
        } else if (arg0 == 12) {
            this.field7743 = 4;
        } else if (arg0 == 13) {
            this.field7743 = 5;
        } else if (arg0 == 14) {
            this.field7743 = 2;
            this.field7748 = arg1.method1858(-3256) * 256;
        } else if (arg0 == 15) {
            this.field7743 = 3;
            this.field7748 = arg1.method1841((byte) 65);
        } else if (arg0 == 16) {
            this.field7743 = 3;
            this.field7748 = arg1.method1815((byte) -93);
        } else if (arg0 == 40) {
            int var4 = arg1.method1858(-3256);
            this.field7739 = new short[var4];
            this.field7731 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field7739[var5] = (short) arg1.method1841((byte) 14);
                this.field7731[var5] = (short) arg1.method1841((byte) -124);
            }
            return;
        } else if (arg0 == 41) {
            int var6 = arg1.method1858(-3256);
            this.field7759 = new short[var6];
            this.field7753 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field7759[var7] = (short) arg1.method1841((byte) 42);
                this.field7753[var7] = (short) arg1.method1841((byte) -119);
            }
            return;
        }
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(IIZLya;IIIILza;Lya;Lgs;II)Le;", line = 213)
    public final class374 method3145(int arg0, int arg1, boolean arg2, class38 arg3, int arg4, int arg5, int arg6, int arg7, class288 arg8, class38 arg9, class34 arg10, int arg11, int arg12) {
        field7754++;
        if (arg6 != -31180) {
            this.field7756 = -105;
        }
        return this.method3147(arg9, arg3, arg0, (byte) 2, arg11, arg1, arg10, arg12, arg7, true, arg5, arg8, arg4, arg2);
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(Z)V", line = 233)
    public static void method3146(boolean arg0) {
        field7747 = null;
        field7742 = null;
        field7745 = null;
        field7730 = null;
        if (!arg0) {
            field7745 = null;
        }
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(Lya;Lya;IBIILgs;IIZILza;IZ)Le;", line = 262)
    private final class374 method3147(class38 arg0, class38 arg1, int arg2, byte arg3, int arg4, int arg5, class34 arg6, int arg7, int arg8, boolean arg9, int arg10, class288 arg11, int arg12, boolean arg13) {
        field7736++;
        int var15 = arg5;
        class57 var16 = this.field7734 == -1 || arg10 == -1 ? null : arg6.method236(this.field7734, (byte) -99);
        boolean var17 = arg13 & this.field7743 != 0;
        if (var16 != null) {
            var15 = arg5 | var16.method518(arg10, 105, arg2, false);
        }
        if (var17) {
            var15 |= this.field7743 == 3 ? 7 : 2;
        }
        if (this.field7746 != 128) {
            var15 |= 0x2;
        }
        if (this.field7737 != 128 || this.field7755 != 0) {
            var15 |= 0x5;
        }
        class399 var18 = this.field7750.field1386;
        class374 var19;
        synchronized (this.field7750.field1386) {
            var19 = (class374) this.field7750.field1386.method2478(1, (long) (this.field7732 |= arg11.field4361 << 29));
        }
        if (var19 == null || arg11.method394(var19.method768(), var15) != 0) {
            if (var19 != null) {
                var15 = arg11.method271(var15, var19.method768());
            }
            int var20 = var15;
            if (this.field7739 != null) {
                var20 = var15 | 0x4000;
            }
            if (this.field7759 != null) {
                var20 |= 0x8000;
            }
            class528 var21 = class299.method1926(0, this.field7750.field1383, 0, this.field7741);
            if (var21 == null) {
                return null;
            }
            if (var21.field7668 < 13) {
                var21.method3135((byte) -103, 0);
            }
            var19 = arg11.method297(var21, var20, this.field7750.field1387, this.field7757 + 64, this.field7756 - -850);
            if (this.field7739 != null) {
                for (int var22 = 0; var22 < this.field7739.length; var22++) {
                    var19.method755(this.field7739[var22], this.field7731[var22]);
                }
            }
            if (this.field7759 != null) {
                for (int var23 = 0; var23 < this.field7759.length; var23++) {
                    var19.method717(this.field7759[var23], this.field7753[var23]);
                }
            }
            var19.method732(var15);
            class399 var24 = this.field7750.field1386;
            synchronized (this.field7750.field1386) {
                this.field7750.field1386.method2472(-77, var19, (long) (this.field7732 |= arg11.field4361 << 29));
            }
        }
        class374 var25 = var16 == null ? var19.method746(arg3, var15, true) : var16.method516(arg10, arg2, 32, arg3, 0, arg8, var19, var15);
        if (this.field7737 != 128 || this.field7746 != 128) {
            var25.method738(this.field7737, this.field7746, this.field7737);
        }
        if (this.field7755 != 0) {
            if (this.field7755 == 90) {
                var25.method769(4096);
            }
            if (this.field7755 == 180) {
                var25.method769(8192);
            }
            if (this.field7755 == 270) {
                var25.method769(12288);
            }
        }
        if (var17) {
            var25.method764(this.field7743, this.field7748, arg0, arg1, arg4, arg7, arg12);
        }
        var25.method732(arg5);
        if (!arg9) {
            this.field7748 = -102;
        }
        return var25;
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(IILza;IIILgs;)Le;", line = 380)
    public final class374 method3148(int arg0, int arg1, class288 arg2, int arg3, int arg4, int arg5, class34 arg6) {
        if (arg1 != -2539) {
            method3146(false);
        }
        field7735++;
        return this.method3147(null, null, arg5, (byte) 5, 0, arg0, arg6, 0, arg3, true, arg4, arg2, 0, false);
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(IIIBII)V", line = 394)
    public static final void method3149(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5) {
        field7758++;
        if (arg4 == arg5) {
            class492.method2971((byte) 121, arg2, arg4, arg1, arg0);
            return;
        }
        if (arg3 <= 12) {
            method3149(35, 40, -6, (byte) 49, 48, -6);
        }
        if (class467.field6940 <= (arg2 - arg4) && class43.field600 >= arg2 + arg4 && arg0 - arg5 >= class372.field5455 && class216.field3415 >= arg0 + arg5) {
            class432.method2598(arg0, arg5, arg2, arg1, (byte) -109, arg4);
        } else {
            class114.method948(arg0, (byte) -127, arg2, arg5, arg4, arg1);
        }
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(Lnn;I)V", line = 436)
    public final void method3150(class289 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method1858(arg1 + 12017);
            if (var3 == 0) {
                field7749++;
                if (arg1 != -15273) {
                    method3149(-124, -45, -71, (byte) 97, -60, -46);
                    return;
                }
                return;
            }
            this.method3144(var3, arg0, (byte) -123);
        }
    }
}
