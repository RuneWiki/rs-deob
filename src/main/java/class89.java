import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vj")
public class class89 {

    @OriginalMember(owner = "client!vj", name = "e", descriptor = "[I")
    private int[] field1611 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!vj", name = "c", descriptor = "Z")
    public boolean field1609 = false;

    @OriginalMember(owner = "client!vj", name = "n", descriptor = "I")
    public int field1620 = -1;

    @OriginalMember(owner = "client!vj", name = "i", descriptor = "[I")
    public static int[] field1615 = new int[50];

    @OriginalMember(owner = "client!vj", name = "m", descriptor = "Llc;")
    public static class143 field1619 = class66.method374("headicons_pk", -1);

    @OriginalMember(owner = "client!vj", name = "t", descriptor = "Llc;")
    public static class143 field1626 = class66.method374("::replacecanvas", -1);

    @OriginalMember(owner = "client!vj", name = "b", descriptor = "I")
    public static int field1608;

    @OriginalMember(owner = "client!vj", name = "d", descriptor = "I")
    public static int field1610;

    @OriginalMember(owner = "client!vj", name = "f", descriptor = "I")
    public static int field1612;

    @OriginalMember(owner = "client!vj", name = "g", descriptor = "I")
    public static int field1613;

    @OriginalMember(owner = "client!vj", name = "j", descriptor = "I")
    public static int field1616;

    @OriginalMember(owner = "client!vj", name = "p", descriptor = "I")
    public static int field1622;

    @OriginalMember(owner = "client!vj", name = "u", descriptor = "I")
    public static int field1627;

    @OriginalMember(owner = "client!vj", name = "h", descriptor = "Lgf;")
    public static class7 field1614;

    @OriginalMember(owner = "client!vj", name = "l", descriptor = "Lgf;")
    public static class7 field1618;

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "[I")
    public static int[] field1607;

    @OriginalMember(owner = "client!vj", name = "q", descriptor = "[I")
    private int[] field1623;

    @OriginalMember(owner = "client!vj", name = "k", descriptor = "[S")
    private short[] field1617;

    @OriginalMember(owner = "client!vj", name = "o", descriptor = "[S")
    private short[] field1621;

    @OriginalMember(owner = "client!vj", name = "r", descriptor = "[S")
    private short[] field1624;

    @OriginalMember(owner = "client!vj", name = "s", descriptor = "[S")
    private short[] field1625;

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(I)Lpk;")
    public final class94 method507(int arg0) {
        field1608++;
        if (this.field1623 == null) {
            return null;
        }
        class94[] var2 = new class94[this.field1623.length];
        for (int var3 = arg0; var3 < this.field1623.length; var3++) {
            var2[var3] = class94.method550(class264.field4756, this.field1623[var3], 0);
        }
        class94 var4;
        if (var2.length == 1) {
            var4 = var2[0];
        } else {
            var4 = new class94(var2, var2.length);
        }
        if (this.field1621 != null) {
            for (int var5 = 0; var5 < this.field1621.length; var5++) {
                var4.method545(this.field1621[var5], this.field1624[var5]);
            }
        }
        if (this.field1625 != null) {
            for (int var6 = 0; var6 < this.field1625.length; var6++) {
                var4.method528(this.field1625[var6], this.field1617[var6]);
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(Lgf;ILlc;)Lll;")
    public static final class135 method508(class7 arg0, int arg1, class143 arg2) {
        int var3 = arg0.method55(-1, arg2);
        field1610++;
        if (~var3 == arg1) {
            return new class135(0);
        }
        int[] var4 = arg0.method43(var3, (byte) -118);
        class135 var5 = new class135(var4.length);
        for (int var6 = 0; var6 < var5.field2376; var6++) {
            class190 var7 = new class190(arg0.method41(arg1 - 18328, var3, var4[var6]));
            var5.field2375[var6] = var7.method1270((byte) -128);
            var5.field2381[var6] = var7.method1234(false);
            var5.field2368[var6] = (short) var7.method1275(128);
            var5.field2378[var6] = (short) var7.method1275(128);
            var5.field2373[var6] = var7.method1269(47);
        }
        return var5;
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(IBLh;)V")
    private final void method509(int arg0, byte arg1, class190 arg2) {
        int var4 = -17 / ((arg1 - 44) / 43);
        if (arg0 == 1) {
            this.field1620 = arg2.method1265(127);
        } else if (arg0 == 2) {
            int var5 = arg2.method1265(122);
            this.field1623 = new int[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field1623[var6] = arg2.method1275(128);
            }
        } else if (arg0 == 3) {
            this.field1609 = true;
        } else if (arg0 == 40) {
            int var9 = arg2.method1265(124);
            this.field1621 = new short[var9];
            this.field1624 = new short[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field1621[var10] = (short) arg2.method1275(128);
                this.field1624[var10] = (short) arg2.method1275(128);
            }
        } else if (arg0 == 41) {
            int var7 = arg2.method1265(120);
            this.field1617 = new short[var7];
            this.field1625 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field1625[var8] = (short) arg2.method1275(128);
                this.field1617[var8] = (short) arg2.method1275(128);
            }
        } else if (arg0 >= 60 && arg0 < 70) {
            this.field1611[arg0 - 60] = arg2.method1275(128);
        }
        field1622++;
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(Z)Lpk;")
    public final class94 method510(boolean arg0) {
        field1616++;
        int var2 = 0;
        if (!arg0) {
            method511(117);
        }
        class94[] var3 = new class94[5];
        for (int var4 = 0; var4 < 5; var4++) {
            if (this.field1611[var4] != -1) {
                var3[var2++] = class94.method550(class264.field4756, this.field1611[var4], 0);
            }
        }
        class94 var5 = new class94(var3, var2);
        if (this.field1621 != null) {
            for (int var6 = 0; var6 < this.field1621.length; var6++) {
                var5.method545(this.field1621[var6], this.field1624[var6]);
            }
        }
        if (this.field1625 != null) {
            for (int var7 = 0; var7 < this.field1625.length; var7++) {
                var5.method528(this.field1625[var7], this.field1617[var7]);
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!vj", name = "b", descriptor = "(I)V")
    public static void method511(int arg0) {
        field1607 = null;
        field1618 = null;
        field1619 = null;
        if (arg0 != 5) {
            field1615 = null;
        }
        field1626 = null;
        field1615 = null;
        field1614 = null;
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(B)Z")
    public final boolean method512(byte arg0) {
        boolean var2 = true;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field1611[var3] != -1 && !class264.field4756.method53((byte) 29, this.field1611[var3], 0)) {
                var2 = false;
            }
        }
        int var4 = 19 / ((arg0 + 5) / 42);
        field1612++;
        return var2;
    }

    @OriginalMember(owner = "client!vj", name = "c", descriptor = "(I)Z")
    public final boolean method513(int arg0) {
        field1613++;
        if (this.field1623 == null) {
            return true;
        }
        if (arg0 != -1) {
            field1607 = null;
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < this.field1623.length; var3++) {
            if (!class264.field4756.method53((byte) 121, this.field1623[var3], 0)) {
                var2 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(III)Z")
    public static final boolean method514(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class90.field1630; var3++) {
            class223 var4 = class18.field319[var3];
            if (var4.field4044 == 1) {
                int var5 = var4.field4060 - arg0;
                if (var5 > 0) {
                    int var6 = (var4.field4061 * var5 >> 8) + var4.field4043;
                    int var7 = (var4.field4064 * var5 >> 8) + var4.field4057;
                    int var8 = (var4.field4054 * var5 >> 8) + var4.field4063;
                    int var9 = (var4.field4056 * var5 >> 8) + var4.field4048;
                    if (arg2 >= var6 && arg2 <= var7 && arg1 >= var8 && arg1 <= var9) {
                        return true;
                    }
                }
            } else if (var4.field4044 == 2) {
                int var10 = arg0 - var4.field4060;
                if (var10 > 0) {
                    int var11 = (var4.field4061 * var10 >> 8) + var4.field4043;
                    int var12 = (var4.field4064 * var10 >> 8) + var4.field4057;
                    int var13 = (var4.field4054 * var10 >> 8) + var4.field4063;
                    int var14 = (var4.field4056 * var10 >> 8) + var4.field4048;
                    if (arg2 >= var11 && arg2 <= var12 && arg1 >= var13 && arg1 <= var14) {
                        return true;
                    }
                }
            } else if (var4.field4044 == 3) {
                int var15 = var4.field4043 - arg2;
                if (var15 > 0) {
                    int var16 = (var4.field4041 * var15 >> 8) + var4.field4060;
                    int var17 = (var4.field4042 * var15 >> 8) + var4.field4055;
                    int var18 = (var4.field4054 * var15 >> 8) + var4.field4063;
                    int var19 = (var4.field4056 * var15 >> 8) + var4.field4048;
                    if (arg0 >= var16 && arg0 <= var17 && arg1 >= var18 && arg1 <= var19) {
                        return true;
                    }
                }
            } else if (var4.field4044 == 4) {
                int var20 = arg2 - var4.field4043;
                if (var20 > 0) {
                    int var21 = (var4.field4041 * var20 >> 8) + var4.field4060;
                    int var22 = (var4.field4042 * var20 >> 8) + var4.field4055;
                    int var23 = (var4.field4054 * var20 >> 8) + var4.field4063;
                    int var24 = (var4.field4056 * var20 >> 8) + var4.field4048;
                    if (arg0 >= var21 && arg0 <= var22 && arg1 >= var23 && arg1 <= var24) {
                        return true;
                    }
                }
            } else if (var4.field4044 == 5) {
                int var25 = arg1 - var4.field4063;
                if (var25 > 0) {
                    int var26 = (var4.field4041 * var25 >> 8) + var4.field4060;
                    int var27 = (var4.field4042 * var25 >> 8) + var4.field4055;
                    int var28 = (var4.field4061 * var25 >> 8) + var4.field4043;
                    int var29 = (var4.field4064 * var25 >> 8) + var4.field4057;
                    if (arg0 >= var26 && arg0 <= var27 && arg2 >= var28 && arg2 <= var29) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(Lh;B)V")
    public final void method515(class190 arg0, byte arg1) {
        field1627++;
        while (true) {
            int var3 = arg0.method1265(127);
            if (var3 == 0) {
                if (arg1 == 37) {
                    return;
                } else {
                    field1615 = null;
                    return;
                }
            }
            this.method509(var3, (byte) 106, arg0);
        }
    }
}
