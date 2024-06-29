import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ka")
public class class107 {

    @OriginalMember(owner = "client!ka", name = "d", descriptor = "I")
    private int field1527 = 128;

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "I")
    private int field1525 = 128;

    @OriginalMember(owner = "client!ka", name = "h", descriptor = "I")
    private int field1531 = 0;

    @OriginalMember(owner = "client!ka", name = "q", descriptor = "I")
    public int field1540 = -1;

    @OriginalMember(owner = "client!ka", name = "r", descriptor = "Z")
    public boolean field1541 = false;

    @OriginalMember(owner = "client!ka", name = "t", descriptor = "Z")
    public boolean field1543 = false;

    @OriginalMember(owner = "client!ka", name = "u", descriptor = "I")
    private int field1544 = 0;

    @OriginalMember(owner = "client!ka", name = "g", descriptor = "I")
    private int field1530 = 0;

    @OriginalMember(owner = "client!ka", name = "j", descriptor = "Llf;")
    public static class260 field1533 = new class260(5000);

    @OriginalMember(owner = "client!ka", name = "x", descriptor = "I")
    public static int field1547 = 0;

    @OriginalMember(owner = "client!ka", name = "z", descriptor = "[I")
    public static int[] field1549 = new int[2];

    @OriginalMember(owner = "client!ka", name = "c", descriptor = "I")
    public static int field1526;

    @OriginalMember(owner = "client!ka", name = "e", descriptor = "I")
    public static int field1528;

    @OriginalMember(owner = "client!ka", name = "i", descriptor = "I")
    public int field1532;

    @OriginalMember(owner = "client!ka", name = "m", descriptor = "I")
    public static int field1536;

    @OriginalMember(owner = "client!ka", name = "n", descriptor = "I")
    public static int field1537;

    @OriginalMember(owner = "client!ka", name = "o", descriptor = "I")
    private int field1538;

    @OriginalMember(owner = "client!ka", name = "p", descriptor = "I")
    public static int field1539;

    @OriginalMember(owner = "client!ka", name = "s", descriptor = "I")
    public static int field1542;

    @OriginalMember(owner = "client!ka", name = "v", descriptor = "I")
    public static int field1545;

    @OriginalMember(owner = "client!ka", name = "w", descriptor = "I")
    public static int field1546;

    @OriginalMember(owner = "client!ka", name = "y", descriptor = "I")
    public static int field1548;

    @OriginalMember(owner = "client!ka", name = "B", descriptor = "I")
    public static int field1551;

    @OriginalMember(owner = "client!ka", name = "A", descriptor = "Lph;")
    public static class361 field1550;

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "[S")
    private short[] field1524;

    @OriginalMember(owner = "client!ka", name = "f", descriptor = "[S")
    private short[] field1529;

    @OriginalMember(owner = "client!ka", name = "k", descriptor = "[S")
    private short[] field1534;

    @OriginalMember(owner = "client!ka", name = "l", descriptor = "[S")
    private short[] field1535;

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lph;I)V", line = 9)
    public static final void method817(class361 arg0, int arg1) {
        field1537++;
        if (arg1 >= -53) {
            field1528 = 106;
        }
        class96.field1355 = arg0;
        class30.field420 = class96.field1355.method2539(true, 16);
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(II)V", line = 23)
    public static final void method818(int arg0, int arg1) {
        field1539++;
        if (arg1 != -15875) {
            field1549 = (int[]) null;
        }
        if (arg0 == 0) {
            return;
        }
        if (arg0 == 1) {
            class331.method2327(-3);
        } else if (arg0 == 2) {
            class309.method2175((byte) 67);
        } else if (arg0 == 3) {
            class37.method269(7403);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIII)Lhc;", line = 51)
    public final class151 method819(int arg0, int arg1, int arg2, int arg3) {
        field1526++;
        if (arg1 != 19852) {
            this.field1525 = 56;
        }
        class151 var5 = (class151) class248.field3688.method461((byte) 120, (long) this.field1532);
        if (var5 == null) {
            class46 var6 = class46.method377(class289.field4377, this.field1538, 0);
            if (var6 == null) {
                return null;
            }
            if (this.field1535 != null) {
                for (int var7 = 0; var7 < this.field1535.length; var7++) {
                    var6.method372(this.field1535[var7], this.field1534[var7]);
                }
            }
            if (this.field1529 != null) {
                for (int var8 = 0; var8 < this.field1529.length; var8++) {
                    var6.method369(this.field1529[var8], this.field1524[var8]);
                }
            }
            var5 = var6.method393(this.field1531 + 64, this.field1530 + 850, -30, -50, -30);
            class248.field3688.method460(var5, -26089, (long) this.field1532);
        }
        class151 var9;
        if (this.field1540 == -1 || arg3 == -1) {
            var9 = var5.method1082(true, true, true);
        } else {
            var9 = class119.method893(this.field1540, (byte) -41).method1824(arg2, arg3, var5, 8354, arg0);
        }
        if (this.field1527 != 128 || this.field1525 != 128) {
            var9.method1089(this.field1527, this.field1525, this.field1527);
        }
        if (this.field1544 != 0) {
            if (this.field1544 == 90) {
                var9.method1092();
            }
            if (this.field1544 == 180) {
                var9.method1069();
            }
            if (this.field1544 == 270) {
                var9.method1070();
            }
        }
        return var9;
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(ILsb;)V", line = 137)
    public final void method820(int arg0, class190 arg1) {
        field1536++;
        while (true) {
            int var3 = arg1.method1319(255);
            if (var3 == 0) {
                if (arg0 != 0) {
                    this.method820(-103, (class190) null);
                }
                return;
            }
            this.method824(arg1, 60, var3);
        }
    }

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "(Lph;I)V", line = 157)
    public static final void method821(class361 arg0, int arg1) {
        if (arg1 != 9001) {
            method821((class361) null, -26);
        }
        field1546++;
        class292.field4428 = arg0.method2505("runes", (byte) 66);
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIZ)I", line = 188)
    public static final int method822(int arg0, int arg1, boolean arg2) {
        if (arg1 < arg0) {
            int var3 = arg1;
            arg1 = arg0;
            arg0 = var3;
        }
        while (arg0 != 0) {
            int var4 = arg1 % arg0;
            arg1 = arg0;
            arg0 = var4;
        }
        if (!arg2) {
            field1548 = -113;
        }
        field1551++;
        return arg1;
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Z)V", line = 222)
    public static void method823(boolean arg0) {
        if (arg0) {
            method818(-112, 101);
        }
        field1550 = null;
        field1533 = null;
        field1549 = null;
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lsb;II)V", line = 248)
    private final void method824(class190 arg0, int arg1, int arg2) {
        if (arg1 < 19) {
            this.method819(83, 7, 36, 40);
        }
        field1545++;
        if (arg2 == 1) {
            this.field1538 = arg0.method1317((byte) 107);
        } else if (arg2 == 2) {
            this.field1540 = arg0.method1317((byte) 85);
        } else if (arg2 == 4) {
            this.field1527 = arg0.method1317((byte) 106);
        } else if (arg2 == 5) {
            this.field1525 = arg0.method1317((byte) 125);
        } else if (arg2 == 6) {
            this.field1544 = arg0.method1317((byte) 89);
        } else if (arg2 == 7) {
            this.field1531 = arg0.method1319(255);
        } else if (arg2 == 8) {
            this.field1530 = arg0.method1319(255);
        } else if (arg2 == 9) {
            this.field1541 = true;
        } else if (arg2 == 10) {
            this.field1543 = true;
        } else if (arg2 == 40) {
            int var4 = arg0.method1319(255);
            this.field1534 = new short[var4];
            this.field1535 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field1535[var5] = (short) arg0.method1317((byte) 63);
                this.field1534[var5] = (short) arg0.method1317((byte) 116);
            }
        } else if (arg2 == 41) {
            int var6 = arg0.method1319(255);
            this.field1524 = new short[var6];
            this.field1529 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field1529[var7] = (short) arg0.method1317((byte) 91);
                this.field1524[var7] = (short) arg0.method1317((byte) 14);
            }
        }
    }
}
