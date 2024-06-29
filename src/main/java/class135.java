import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mg")
public class class135 {

    @OriginalMember(owner = "client!mg", name = "h", descriptor = "I")
    private int field1523 = 0;

    @OriginalMember(owner = "client!mg", name = "j", descriptor = "B")
    public byte field1525 = 0;

    @OriginalMember(owner = "client!mg", name = "p", descriptor = "I")
    private int field1531 = 128;

    @OriginalMember(owner = "client!mg", name = "f", descriptor = "I")
    private int field1521 = 128;

    @OriginalMember(owner = "client!mg", name = "r", descriptor = "I")
    private int field1533 = -1;

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "I")
    public int field1516 = -1;

    @OriginalMember(owner = "client!mg", name = "e", descriptor = "Z")
    public boolean field1520 = false;

    @OriginalMember(owner = "client!mg", name = "A", descriptor = "I")
    private int field1542 = 0;

    @OriginalMember(owner = "client!mg", name = "D", descriptor = "I")
    private int field1544 = 0;

    @OriginalMember(owner = "client!mg", name = "k", descriptor = "Z")
    public static boolean field1526 = false;

    @OriginalMember(owner = "client!mg", name = "t", descriptor = "[I")
    public static int[] field1535 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!mg", name = "y", descriptor = "I")
    public static int field1540 = 0;

    @OriginalMember(owner = "client!mg", name = "s", descriptor = "F")
    public static float field1534;

    @OriginalMember(owner = "client!mg", name = "z", descriptor = "F")
    public static float field1541;

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "I")
    public int field1517;

    @OriginalMember(owner = "client!mg", name = "c", descriptor = "I")
    public static int field1518;

    @OriginalMember(owner = "client!mg", name = "d", descriptor = "I")
    private int field1519;

    @OriginalMember(owner = "client!mg", name = "i", descriptor = "I")
    public static int field1524;

    @OriginalMember(owner = "client!mg", name = "m", descriptor = "I")
    public static int field1528;

    @OriginalMember(owner = "client!mg", name = "o", descriptor = "I")
    public static int field1530;

    @OriginalMember(owner = "client!mg", name = "u", descriptor = "I")
    public static int field1536;

    @OriginalMember(owner = "client!mg", name = "w", descriptor = "I")
    public static int field1538;

    @OriginalMember(owner = "client!mg", name = "x", descriptor = "I")
    public static int field1539;

    @OriginalMember(owner = "client!mg", name = "l", descriptor = "Ljo;")
    public static class303 field1527;

    @OriginalMember(owner = "client!mg", name = "v", descriptor = "Lrm;")
    public class373 field1537;

    @OriginalMember(owner = "client!mg", name = "g", descriptor = "[S")
    private short[] field1522;

    @OriginalMember(owner = "client!mg", name = "n", descriptor = "[S")
    private short[] field1529;

    @OriginalMember(owner = "client!mg", name = "q", descriptor = "[S")
    private short[] field1532;

    @OriginalMember(owner = "client!mg", name = "B", descriptor = "[S")
    private short[] field1543;

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(Ld;Loa;ILir;IIZILd;IIII)Lba;")
    public final class350 method752(class137 arg0, class635 arg1, int arg2, class25 arg3, int arg4, int arg5, boolean arg6, int arg7, class137 arg8, int arg9, int arg10, int arg11, int arg12) {
        field1538++;
        if (arg11 > -76) {
            this.field1516 = -28;
        }
        return this.method757(arg10, (byte) 117, arg1, arg3, arg0, arg2, (byte) 2, arg8, arg5, arg6, arg12, arg4, arg7, arg9);
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(I)V")
    public static final void method753(int arg0) {
        if (arg0 != -17032) {
            field1541 = -0.8783606F;
        }
        for (int var1 = 0; var1 < class337.field4413.length; var1++) {
            for (int var2 = 0; var2 < class337.field4413[var1].length; var2++) {
                class337.field4413[var1][var2] = class587.field8341;
            }
        }
        field1539++;
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(ILiaa;B)V")
    private final void method754(int arg0, class452 arg1, byte arg2) {
        if (arg0 == 1) {
            this.field1519 = arg1.method2574(-1758460248);
        } else if (arg0 == 2) {
            this.field1516 = arg1.method2574(-1758460248);
        } else if (arg0 == 4) {
            this.field1531 = arg1.method2574(-1758460248);
        } else if (arg0 == 5) {
            this.field1521 = arg1.method2574(-1758460248);
        } else if (arg0 == 6) {
            this.field1523 = arg1.method2574(-1758460248);
        } else if (arg0 == 7) {
            this.field1544 = arg1.method2541(89);
        } else if (arg0 == 8) {
            this.field1542 = arg1.method2541(104);
        } else if (arg0 == 9) {
            this.field1533 = 8224;
            this.field1525 = 3;
        } else if (arg0 == 10) {
            this.field1520 = true;
        } else if (arg0 == 11) {
            this.field1525 = 1;
        } else if (arg0 == 12) {
            this.field1525 = 4;
        } else if (arg0 == 13) {
            this.field1525 = 5;
        } else if (arg0 == 14) {
            this.field1525 = 2;
            this.field1533 = arg1.method2541(100) * 256;
        } else if (arg0 == 15) {
            this.field1525 = 3;
            this.field1533 = arg1.method2574(-1758460248);
        } else if (arg0 == 16) {
            this.field1525 = 3;
            this.field1533 = arg1.method2575((byte) -48);
        } else if (arg0 == 40) {
            int var6 = arg1.method2541(55);
            this.field1529 = new short[var6];
            this.field1532 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field1529[var7] = (short) arg1.method2574(-1758460248);
                this.field1532[var7] = (short) arg1.method2574(-1758460248);
            }
        } else if (arg0 == 41) {
            int var4 = arg1.method2541(93);
            this.field1522 = new short[var4];
            this.field1543 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field1522[var5] = (short) arg1.method2574(-1758460248);
                this.field1543[var5] = (short) arg1.method2574(-1758460248);
            }
        }
        field1530++;
        int var8 = -111 % ((-arg2 - 8) / 62);
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(B)V")
    public static void method755(byte arg0) {
        field1527 = null;
        if (arg0 > -109) {
            field1526 = true;
        }
        field1535 = null;
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(ILiaa;)V")
    public final void method756(int arg0, class452 arg1) {
        while (true) {
            int var3 = arg1.method2541(arg0 ^ 0xFFFFFF81);
            if (var3 == 0) {
                field1518++;
                if (arg0 != -1) {
                    this.method752(null, null, 65, null, -113, -71, true, 83, null, 56, -56, 98, 54);
                    return;
                }
                return;
            }
            this.method754(var3, arg1, (byte) -124);
        }
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(IBLoa;Lir;Ld;IBLd;IZIIII)Lba;")
    private final class350 method757(int arg0, byte arg1, class635 arg2, class25 arg3, class137 arg4, int arg5, byte arg6, class137 arg7, int arg8, boolean arg9, int arg10, int arg11, int arg12, int arg13) {
        field1536++;
        int var15 = arg5;
        class576 var16 = this.field1516 == -1 || arg12 == -1 ? null : arg3.method124(24006, this.field1516);
        boolean var17 = arg9 & this.field1525 != 0;
        if (var16 != null) {
            var15 = arg5 | var16.method3255(arg12, 9306, false, arg8);
        }
        if (var17) {
            var15 |= this.field1525 == 3 ? 7 : 2;
        }
        if (this.field1521 != 128) {
            var15 |= 0x2;
        }
        if (this.field1531 != 128 || this.field1523 != 0) {
            var15 |= 0x5;
        }
        class653 var18 = this.field1537.field4854;
        class350 var19;
        synchronized (this.field1537.field4854) {
            var19 = (class350) this.field1537.field4854.method3690((byte) 117, (long) (this.field1517 |= arg2.field8985 << 29));
        }
        if (var19 == null || arg2.method312(var19.method902(), var15) != 0) {
            if (var19 != null) {
                var15 = arg2.method372(var15, var19.method902());
            }
            int var20 = var15;
            if (this.field1529 != null) {
                var20 = var15 | 0x4000;
            }
            if (this.field1522 != null) {
                var20 |= 0x8000;
            }
            class90 var21 = class189.method1098(this.field1519, 0, 1, this.field1537.field4847);
            if (var21 == null) {
                return null;
            }
            if (var21.field984 < 13) {
                var21.method561(2, 1);
            }
            var19 = arg2.method375(var21, var20, this.field1537.field4855, this.field1544 + 64, this.field1542 + 850);
            if (this.field1529 != null) {
                for (int var22 = 0; var22 < this.field1529.length; var22++) {
                    var19.method863(this.field1529[var22], this.field1532[var22]);
                }
            }
            if (this.field1522 != null) {
                for (int var23 = 0; var23 < this.field1522.length; var23++) {
                    var19.method916(this.field1522[var23], this.field1543[var23]);
                }
            }
            var19.method874(var15);
            class653 var24 = this.field1537.field4854;
            synchronized (this.field1537.field4854) {
                this.field1537.field4854.method3683(var19, (byte) 101, (long) (this.field1517 |= arg2.field8985 << 29));
            }
        }
        class350 var25 = var16 == null ? var19.method602(arg6, var15, true) : var16.method3258(arg6, var19, 0, arg13, var15, 32, arg8, arg12);
        if (this.field1531 != 128 || this.field1521 != 128) {
            var25.method860(this.field1531, this.field1521, this.field1531);
        }
        if (this.field1523 != 0) {
            if (this.field1523 == 90) {
                var25.method903(4096);
            }
            if (this.field1523 == 180) {
                var25.method903(8192);
            }
            if (this.field1523 == 270) {
                var25.method903(12288);
            }
        }
        if (arg1 < 105) {
            this.field1525 = 59;
        }
        if (var17) {
            var25.method884(this.field1525, this.field1533, arg7, arg4, arg11, arg10, arg0);
        }
        var25.method874(arg5);
        return var25;
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(ILoa;IILir;II)Lba;")
    public final class350 method758(int arg0, class635 arg1, int arg2, int arg3, class25 arg4, int arg5, int arg6) {
        if (arg3 == 0) {
            field1524++;
            return this.method757(0, (byte) 110, arg1, arg4, null, arg5, (byte) 2, null, arg6, false, 0, 0, arg0, arg2);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(Lir;IIILoa;II)Lba;")
    public final class350 method759(class25 arg0, int arg1, int arg2, int arg3, class635 arg4, int arg5, int arg6) {
        field1528++;
        if (arg1 >= -26) {
            this.field1537 = null;
        }
        return this.method757(0, (byte) 124, arg4, arg0, null, arg5, (byte) 5, null, arg3, false, 0, 0, arg6, arg2);
    }
}
