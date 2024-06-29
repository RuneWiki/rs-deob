import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hb")
public class class79 {

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "I")
    private int field1515 = -1;

    @OriginalMember(owner = "client!hb", name = "q", descriptor = "I")
    private int field1531 = 0;

    @OriginalMember(owner = "client!hb", name = "g", descriptor = "Ls;")
    private class190 field1521 = new class190();

    @OriginalMember(owner = "client!hb", name = "x", descriptor = "Z")
    public boolean field1538 = false;

    @OriginalMember(owner = "client!hb", name = "n", descriptor = "I")
    private int field1528;

    @OriginalMember(owner = "client!hb", name = "t", descriptor = "I")
    private int field1534;

    @OriginalMember(owner = "client!hb", name = "i", descriptor = "[[I")
    private int[][] field1523;

    @OriginalMember(owner = "client!hb", name = "d", descriptor = "[Lvh;")
    private class228[] field1518;

    @OriginalMember(owner = "client!hb", name = "k", descriptor = "Ldj;")
    public static class44 field1525 = class89.method650(255, "<img=1>");

    @OriginalMember(owner = "client!hb", name = "j", descriptor = "Ldj;")
    private static class44 field1524 = class89.method650(255, "This world is full)3");

    @OriginalMember(owner = "client!hb", name = "h", descriptor = "Ldj;")
    public static class44 field1522 = class89.method650(255, "_");

    @OriginalMember(owner = "client!hb", name = "m", descriptor = "I")
    public static int field1527 = 0;

    @OriginalMember(owner = "client!hb", name = "v", descriptor = "Ldj;")
    public static class44 field1536 = class89.method650(255, "Starte 3D)2Softwarebibliothek");

    @OriginalMember(owner = "client!hb", name = "e", descriptor = "Ldj;")
    public static class44 field1519 = field1524;

    @OriginalMember(owner = "client!hb", name = "y", descriptor = "Ldj;")
    private static class44 field1539 = class89.method650(255, "wave:");

    @OriginalMember(owner = "client!hb", name = "l", descriptor = "Ldj;")
    public static class44 field1526 = field1539;

    @OriginalMember(owner = "client!hb", name = "s", descriptor = "Ldj;")
    public static class44 field1533 = field1539;

    @OriginalMember(owner = "client!hb", name = "p", descriptor = "Lri;")
    public static class189 field1530 = new class189(64);

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "I")
    public static int field1516;

    @OriginalMember(owner = "client!hb", name = "c", descriptor = "I")
    public static int field1517;

    @OriginalMember(owner = "client!hb", name = "f", descriptor = "I")
    public static int field1520;

    @OriginalMember(owner = "client!hb", name = "o", descriptor = "I")
    public static int field1529;

    @OriginalMember(owner = "client!hb", name = "r", descriptor = "I")
    public static int field1532;

    @OriginalMember(owner = "client!hb", name = "w", descriptor = "I")
    public static int field1537;

    @OriginalMember(owner = "client!hb", name = "z", descriptor = "I")
    public static int field1540;

    @OriginalMember(owner = "client!hb", name = "u", descriptor = "[[[B")
    public static byte[][][] field1535;

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(B)V")
    public static void method601(byte arg0) {
        field1524 = null;
        field1535 = null;
        field1530 = null;
        field1536 = null;
        field1522 = null;
        field1533 = null;
        field1539 = null;
        field1519 = null;
        if (arg0 <= 77) {
            method602(39, -32, 47, -23, 123, -89, (byte) -83);
        }
        field1526 = null;
        field1525 = null;
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(IIIIIIB)V")
    public static final void method602(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6) {
        field1516++;
        class168.method1069(arg1, 2);
        int var7 = 0;
        int var8 = arg1 - arg2;
        int var9 = arg1;
        if (var8 < 0) {
            var8 = 0;
        }
        int var10 = 106 / ((arg6 + 62) / 62);
        int var11 = -arg1;
        int var12 = var8;
        int var13 = -var8;
        int[] var14 = class108.field1979[arg4];
        int var15 = -1;
        int var16 = -1;
        int var17 = arg0 + var8;
        int var18 = arg0 - var8;
        class42.method290(var14, -7, arg0 - arg1, var18, arg5);
        class42.method290(var14, -7, var18, var17, arg3);
        class42.method290(var14, -7, var17, arg0 + arg1, arg5);
        while (var7 < var9) {
            var16 += 2;
            var15 += 2;
            var13 += var16;
            if (var13 >= 0 && var12 >= 1) {
                class219.field3970[var12] = var7;
                var12--;
                var13 -= var12 << 1;
            }
            var11 += var15;
            var7++;
            if (var11 >= 0) {
                var9--;
                if (var9 < var8) {
                    int[] var19 = class108.field1979[arg4 + var9];
                    int var20 = arg0 + var7;
                    int var21 = class219.field3970[var9];
                    int[] var22 = class108.field1979[arg4 - var9];
                    int var23 = arg0 + var21;
                    int var24 = arg0 - var7;
                    int var25 = arg0 - var21;
                    class42.method290(var19, -7, var24, var25, arg5);
                    class42.method290(var19, -7, var25, var23, arg3);
                    class42.method290(var19, -7, var23, var20, arg5);
                    class42.method290(var22, -7, var24, var25, arg5);
                    class42.method290(var22, -7, var25, var23, arg3);
                    class42.method290(var22, -7, var23, var20, arg5);
                } else {
                    int[] var26 = class108.field1979[arg4 + var9];
                    int[] var27 = class108.field1979[arg4 - var9];
                    int var28 = arg0 + var7;
                    int var29 = arg0 - var7;
                    class42.method290(var26, -7, var29, var28, arg5);
                    class42.method290(var27, -7, var29, var28, arg5);
                }
                var11 -= var9 << 1;
            }
            int[] var30 = class108.field1979[arg4 + var7];
            int[] var31 = class108.field1979[arg4 - var7];
            int var32 = arg0 + var9;
            int var33 = arg0 - var9;
            if (var7 >= var8) {
                class42.method290(var30, -7, var33, var32, arg5);
                class42.method290(var31, -7, var33, var32, arg5);
            } else {
                int var34 = var12 < var7 ? class219.field3970[var7] : var12;
                int var35 = arg0 - var34;
                int var36 = arg0 + var34;
                class42.method290(var30, -7, var33, var35, arg5);
                class42.method290(var30, -7, var35, var36, arg3);
                class42.method290(var30, -7, var36, var32, arg5);
                class42.method290(var31, -7, var33, var35, arg5);
                class42.method290(var31, -7, var35, var36, arg3);
                class42.method290(var31, -7, var36, var32, arg5);
            }
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(ZI)[I")
    public final int[] method603(boolean arg0, int arg1) {
        field1520++;
        if (!arg0) {
            this.method607((byte) -54);
        }
        if (this.field1534 == this.field1528) {
            this.field1538 = this.field1518[arg1] == null;
            this.field1518[arg1] = class208.field3729;
            return this.field1523[arg1];
        } else if (this.field1534 == 1) {
            this.field1538 = this.field1515 != arg1;
            this.field1515 = arg1;
            return this.field1523[0];
        } else {
            class228 var3 = this.field1518[arg1];
            if (var3 == null) {
                this.field1538 = true;
                if (this.field1534 > this.field1531) {
                    var3 = new class228(arg1, this.field1531);
                    this.field1531++;
                } else {
                    class228 var4 = (class228) this.field1521.method1190(true);
                    var3 = new class228(arg1, var4.field4276);
                    this.field1518[var4.field4283] = null;
                    var4.method1148(-13215);
                }
                this.field1518[arg1] = var3;
            } else {
                this.field1538 = false;
            }
            this.field1521.method1186(var3, 126);
            return this.field1523[var3.field4276];
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(I)[[I")
    public final int[][] method604(int arg0) {
        field1532++;
        if (this.field1534 != this.field1528) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        for (int var2 = arg0; var2 < this.field1534; var2++) {
            this.field1518[var2] = class208.field3729;
        }
        return this.field1523;
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(BI)I")
    public static final int method605(byte arg0, int arg1) {
        field1537++;
        return arg0 == -17 ? arg1 >>> 8 : -82;
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(II)Lba;")
    public static final class13 method606(int arg0, int arg1) {
        field1529++;
        class13 var2 = (class13) field1530.method1178((long) arg0, 14176);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class201.field3562.method1466(class83.method621(arg0, true), class171.method1088(arg0, (byte) 83), (byte) -122);
        class13 var4 = new class13();
        var4.field253 = arg0;
        if (var3 != null) {
            var4.method119((byte) -85, new class66(var3));
        }
        if (arg1 == -1830) {
            field1530.method1183((byte) 125, var4, (long) arg0);
            return var4;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!hb", name = "b", descriptor = "(B)V")
    public final void method607(byte arg0) {
        field1517++;
        for (int var2 = 0; var2 < this.field1534; var2++) {
            this.field1523[var2] = null;
        }
        this.field1523 = null;
        this.field1518 = null;
        if (arg0 == -7) {
            this.field1521.method1193((byte) 26);
            this.field1521 = null;
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(ZLjj;I)V")
    public static final void method608(boolean arg0, class108 arg1, int arg2) {
        int var3 = 46 / ((-arg2 - 18) / 47);
        if (class120.field2139 != null) {
            try {
                class120.field2139.method778((byte) -118);
            } catch (Exception var9) {
            }
            class120.field2139 = null;
        }
        field1540++;
        class120.field2139 = arg1;
        class173.method1102(arg0, (byte) -90);
        class198.field3505.field1195 = 0;
        class94.field1743 = null;
        class184.field3196 = 0;
        class235.field4361 = null;
        while (true) {
            class236 var4 = (class236) class200.field3544.method832(-80);
            if (var4 == null) {
                while (true) {
                    class236 var5 = (class236) class116.field2072.method832(-54);
                    if (var5 == null) {
                        if (class57.field1074 != 0) {
                            try {
                                class66 var6 = new class66(4);
                                var6.method488(122, 4);
                                var6.method488(126, class57.field1074);
                                var6.method510((byte) 123, 0);
                                class120.field2139.method782(120, var6.field1219, 4, 0);
                            } catch (IOException var8) {
                                try {
                                    class120.field2139.method778((byte) 66);
                                } catch (Exception var7) {
                                }
                                class54.field999++;
                                class120.field2139 = null;
                            }
                        }
                        class77.field1497 = 0;
                        class151.field2627 = class27.method193((byte) 71);
                        return;
                    }
                    class87.field1664.method846(var5, 47);
                    class88.field1675.method830(var5, var5.field3186, 1);
                    class54.field991++;
                    class207.field3720--;
                }
            }
            class186.field3215.method830(var4, var4.field3186, 1);
            class163.field2819--;
            class3.field44++;
        }
    }

    @OriginalMember(owner = "client!hb", name = "<init>", descriptor = "(III)V")
    public class79(int arg0, int arg1, int arg2) {
        this.field1528 = arg1;
        this.field1534 = arg0;
        this.field1523 = new int[this.field1534][arg2];
        this.field1518 = new class228[this.field1528];
    }
}
