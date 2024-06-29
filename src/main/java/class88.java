import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ib")
public class class88 {

    @OriginalMember(owner = "client!ib", name = "k", descriptor = "Z")
    public boolean field1491 = false;

    @OriginalMember(owner = "client!ib", name = "m", descriptor = "I")
    public int field1493 = -1;

    @OriginalMember(owner = "client!ib", name = "n", descriptor = "[I")
    private int[] field1494 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!ib", name = "c", descriptor = "I")
    public static int field1483 = 0;

    @OriginalMember(owner = "client!ib", name = "p", descriptor = "I")
    public static int field1496 = 0;

    @OriginalMember(owner = "client!ib", name = "q", descriptor = "I")
    public static int field1497 = 0;

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "I")
    public static int field1481;

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "I")
    public static int field1482;

    @OriginalMember(owner = "client!ib", name = "e", descriptor = "I")
    public static int field1485;

    @OriginalMember(owner = "client!ib", name = "f", descriptor = "I")
    public static int field1486;

    @OriginalMember(owner = "client!ib", name = "h", descriptor = "I")
    public static int field1488;

    @OriginalMember(owner = "client!ib", name = "i", descriptor = "I")
    public static int field1489;

    @OriginalMember(owner = "client!ib", name = "j", descriptor = "I")
    public static int field1490;

    @OriginalMember(owner = "client!ib", name = "l", descriptor = "I")
    public static int field1492;

    @OriginalMember(owner = "client!ib", name = "o", descriptor = "I")
    public static int field1495;

    @OriginalMember(owner = "client!ib", name = "s", descriptor = "I")
    public static int field1499;

    @OriginalMember(owner = "client!ib", name = "u", descriptor = "I")
    public static int field1501;

    @OriginalMember(owner = "client!ib", name = "w", descriptor = "I")
    public static int field1503;

    @OriginalMember(owner = "client!ib", name = "d", descriptor = "[I")
    private int[] field1484;

    @OriginalMember(owner = "client!ib", name = "g", descriptor = "[S")
    private short[] field1487;

    @OriginalMember(owner = "client!ib", name = "r", descriptor = "[S")
    private short[] field1498;

    @OriginalMember(owner = "client!ib", name = "t", descriptor = "[S")
    private short[] field1500;

    @OriginalMember(owner = "client!ib", name = "v", descriptor = "[S")
    private short[] field1502;

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(Lfe;ZI)V", line = 5)
    private final void method564(class229 arg0, boolean arg1, int arg2) {
        if (arg2 == 1) {
            this.field1493 = arg0.method1535((byte) 98);
        } else if (arg2 == 2) {
            int var4 = arg0.method1535((byte) 102);
            this.field1484 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field1484[var5] = arg0.method1496(true);
            }
        } else if (arg2 == 3) {
            this.field1491 = true;
        } else if (arg2 == 40) {
            int var6 = arg0.method1535((byte) 89);
            this.field1487 = new short[var6];
            this.field1502 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field1502[var7] = (short) arg0.method1496(arg1);
                this.field1487[var7] = (short) arg0.method1496(true);
            }
        } else if (arg2 == 41) {
            int var8 = arg0.method1535((byte) 88);
            this.field1498 = new short[var8];
            this.field1500 = new short[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field1498[var9] = (short) arg0.method1496(arg1);
                this.field1500[var9] = (short) arg0.method1496(true);
            }
        } else if (arg2 >= 60 && arg2 < 70) {
            this.field1494[arg2 - 60] = arg0.method1496(true);
        }
        if (!arg1) {
            method566((byte) 84);
        }
        field1499++;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIIJ)Z", line = 82)
    public static final boolean method565(int arg0, int arg1, int arg2, long arg3) {
        class160 var5 = class86.field1459[arg0][arg1][arg2];
        if (var5 == null) {
            return false;
        } else if (var5.field2632 != null && var5.field2632.field3362 == arg3) {
            return true;
        } else if (var5.field2642 != null && var5.field2642.field4931 == arg3) {
            return true;
        } else if (var5.field2617 != null && var5.field2617.field1859 == arg3) {
            return true;
        } else {
            for (int var6 = 0; var6 < var5.field2627; var6++) {
                if (var5.field2623[var6].field379 == arg3) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(B)V", line = 110)
    public static final void method566(byte arg0) {
        field1481++;
        class66.field914.method1631(-27875);
        int var1 = -126 / ((arg0 - 64) / 40);
        class186.field3183.method1631(-27875);
    }

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "(B)Z", line = 130)
    public final boolean method567(byte arg0) {
        field1501++;
        if (this.field1484 == null) {
            return true;
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < this.field1484.length; var3++) {
            if (!class182.field3126.method1110(this.field1484[var3], -1, 0)) {
                var2 = false;
            }
        }
        int var4 = -75 / ((8 - arg0) / 53);
        return var2;
    }

    @OriginalMember(owner = "client!ib", name = "c", descriptor = "(B)Lkj;", line = 158)
    public final class165 method568(byte arg0) {
        field1488++;
        class165[] var2 = new class165[5];
        if (arg0 > -126) {
            method571(-2);
        }
        int var3 = 0;
        for (int var4 = 0; var4 < 5; var4++) {
            if (this.field1494[var4] != -1) {
                var2[var3++] = class165.method1018(class182.field3126, this.field1494[var4], 0);
            }
        }
        class165 var5 = new class165(var2, var3);
        if (this.field1502 != null) {
            for (int var6 = 0; var6 < this.field1502.length; var6++) {
                var5.method1003(this.field1502[var6], this.field1487[var6]);
            }
        }
        if (this.field1498 != null) {
            for (int var7 = 0; var7 < this.field1498.length; var7++) {
                var5.method1011(this.field1498[var7], this.field1500[var7]);
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(BI)V", line = 212)
    public static final void method569(byte arg0, int arg1) {
        if (arg0 != -43) {
            method571(-40);
        }
        field1485++;
        class72 var2 = class25.method174(arg1, (byte) -69, 8);
        var2.method479(arg0 + 168);
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(I)Lkj;", line = 224)
    public final class165 method570(int arg0) {
        field1492++;
        if (this.field1484 == null) {
            return null;
        }
        int var2 = -44 / ((arg0 - 18) / 54);
        class165[] var3 = new class165[this.field1484.length];
        for (int var4 = 0; var4 < this.field1484.length; var4++) {
            var3[var4] = class165.method1018(class182.field3126, this.field1484[var4], 0);
        }
        class165 var5;
        if (var3.length == 1) {
            var5 = var3[0];
        } else {
            var5 = new class165(var3, var3.length);
        }
        if (this.field1502 != null) {
            for (int var6 = 0; var6 < this.field1502.length; var6++) {
                var5.method1003(this.field1502[var6], this.field1487[var6]);
            }
        }
        if (this.field1498 != null) {
            for (int var7 = 0; var7 < this.field1498.length; var7++) {
                var5.method1011(this.field1498[var7], this.field1500[var7]);
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "(I)V", line = 281)
    public static final void method571(int arg0) {
        if (arg0 != -4) {
            method566((byte) 69);
        }
        class232.field3933 = null;
        class256.field4329 = (byte[][]) null;
        class202.field3451 = null;
        class296.field5018 = null;
        field1486++;
        class201.field3440 = null;
        class247.field4226 = null;
    }

    @OriginalMember(owner = "client!ib", name = "d", descriptor = "(B)Z", line = 303)
    public final boolean method572(byte arg0) {
        field1489++;
        boolean var2 = true;
        int var3 = 0;
        if (arg0 != 23) {
            return false;
        }
        while (var3 < 5) {
            if (this.field1494[var3] != -1 && !class182.field3126.method1110(this.field1494[var3], -1, 0)) {
                var2 = false;
            }
            var3++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(ILrb;)V", line = 336)
    public static final void method573(int arg0, class209 arg1) {
        field1490++;
        if (arg1.field3572 != null) {
            arg1.field3572.field3760 = 0;
        }
        arg1.field3573 = false;
        if (arg0 <= 78) {
            method571(58);
        }
        for (class209 var2 = arg1.method158(); var2 != null; var2 = arg1.method147()) {
            method573(103, var2);
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(Lfe;Z)V", line = 383)
    public final void method574(class229 arg0, boolean arg1) {
        if (arg1) {
            this.method568((byte) -21);
        }
        while (true) {
            int var3 = arg0.method1535((byte) 104);
            if (var3 == 0) {
                field1495++;
                return;
            }
            this.method564(arg0, true, var3);
        }
    }
}
