import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hd")
public class class319 extends class15 {

    @OriginalMember(owner = "client!hd", name = "cb", descriptor = "Lce;")
    private class126 field5479 = class102.field1635;

    @OriginalMember(owner = "client!hd", name = "J", descriptor = "Lce;")
    public static class126 field5460 = class206.method1445(-7923, "Sie k-Onnen sich selbst nicht auf Ihre Freunde)2Liste setzen(Q");

    @OriginalMember(owner = "client!hd", name = "V", descriptor = "Lce;")
    public static class126 field5472 = class206.method1445(-7923, " zuerst von Ihrer Freunde)2Liste(Q");

    @OriginalMember(owner = "client!hd", name = "W", descriptor = "Lce;")
    public static class126 field5473 = class206.method1445(-7923, "leuchten1:");

    @OriginalMember(owner = "client!hd", name = "M", descriptor = "I")
    public static int field5463;

    @OriginalMember(owner = "client!hd", name = "N", descriptor = "I")
    public static int field5464;

    @OriginalMember(owner = "client!hd", name = "O", descriptor = "I")
    public static int field5465;

    @OriginalMember(owner = "client!hd", name = "P", descriptor = "I")
    private int field5466;

    @OriginalMember(owner = "client!hd", name = "Q", descriptor = "I")
    public static int field5467;

    @OriginalMember(owner = "client!hd", name = "R", descriptor = "I")
    public static int field5468;

    @OriginalMember(owner = "client!hd", name = "S", descriptor = "I")
    public static int field5469;

    @OriginalMember(owner = "client!hd", name = "T", descriptor = "I")
    public int field5470;

    @OriginalMember(owner = "client!hd", name = "U", descriptor = "I")
    public static int field5471;

    @OriginalMember(owner = "client!hd", name = "X", descriptor = "I")
    public static int field5474;

    @OriginalMember(owner = "client!hd", name = "Z", descriptor = "I")
    public int field5476;

    @OriginalMember(owner = "client!hd", name = "ab", descriptor = "I")
    public static int field5477;

    @OriginalMember(owner = "client!hd", name = "bb", descriptor = "I")
    public static int field5478;

    @OriginalMember(owner = "client!hd", name = "L", descriptor = "Lsi;")
    public class237 field5462;

    @OriginalMember(owner = "client!hd", name = "Y", descriptor = "Lsi;")
    private class237 field5475;

    @OriginalMember(owner = "client!hd", name = "K", descriptor = "[[Lbi;")
    public static class201[][] field5461;

    @OriginalMember(owner = "client!hd", name = "c", descriptor = "(II)Z", line = 4)
    public final boolean method2217(int arg0, int arg1) {
        field5474++;
        if (this.field5462 == null) {
            return false;
        }
        if (this.field5475 == null) {
            this.method2227((byte) 68);
        }
        class27 var3 = (class27) this.field5475.method1631(false, (long) arg0);
        if (var3 == null) {
            return false;
        } else if (arg1 == -1) {
            return true;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(BI)I", line = 27)
    public final int method2218(byte arg0, int arg1) {
        field5467++;
        if (this.field5462 == null) {
            return this.field5466;
        }
        class27 var3 = (class27) this.field5462.method1631(false, (long) arg1);
        if (arg0 == 18) {
            return var3 == null ? this.field5466 : var3.field383;
        } else {
            return 29;
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(BLbb;)V", line = 51)
    public final void method2219(byte arg0, class134 arg1) {
        field5464++;
        if (arg0 < 106) {
            return;
        }
        while (true) {
            int var3 = arg1.method948(-123);
            if (var3 == 0) {
                return;
            }
            this.method2226(arg1, var3, (byte) -126);
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(BLce;)Z", line = 72)
    public final boolean method2220(byte arg0, class126 arg1) {
        field5469++;
        int var3 = -126 / ((-arg0 - 9) / 41);
        if (this.field5462 == null) {
            return false;
        }
        if (this.field5475 == null) {
            this.method2222((byte) -29);
        }
        for (class55 var4 = (class55) this.field5475.method1631(false, arg1.method840((byte) -40)); var4 != null; var4 = (class55) this.field5475.method1633(0)) {
            if (var4.field834.method872(arg1, 0)) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!hd", name = "d", descriptor = "(II)Lce;", line = 106)
    public final class126 method2221(int arg0, int arg1) {
        field5468++;
        if (this.field5462 == null) {
            return this.field5479;
        }
        class305 var3 = (class305) this.field5462.method1631(false, (long) arg0);
        if (arg1 < 64) {
            this.method2227((byte) 44);
        }
        return var3 == null ? this.field5479 : var3.field5125;
    }

    @OriginalMember(owner = "client!hd", name = "e", descriptor = "(B)V", line = 129)
    private final void method2222(byte arg0) {
        if (arg0 != -29) {
            this.field5470 = -77;
        }
        field5465++;
        this.field5475 = new class237(this.field5462.method1637(true));
        for (class305 var2 = (class305) this.field5462.method1630((byte) 56); var2 != null; var2 = (class305) this.field5462.method1632(arg0 - 74)) {
            class55 var3 = new class55(var2.field5125, (int) var2.field1117);
            this.field5475.method1636(11311, var3, var2.field5125.method840((byte) -40));
        }
    }

    @OriginalMember(owner = "client!hd", name = "c", descriptor = "(I)V", line = 153)
    public static void method2223(int arg0) {
        field5473 = null;
        field5472 = null;
        field5461 = (class201[][]) null;
        field5460 = null;
        if (arg0 != -1) {
            field5461 = (class201[][]) ((class201[][]) null);
        }
    }

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "(BLbb;)Ln;", line = 172)
    public static final class9 method2224(byte arg0, class134 arg1) {
        field5463++;
        if (arg0 < 49) {
            field5472 = (class126) null;
        }
        return new class9(arg1.method931((byte) 76), arg1.method931((byte) 110), arg1.method931((byte) 55), arg1.method931((byte) 105), arg1.method949(20732), arg1.method949(20732), arg1.method948(-123));
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(IIIBI)V", line = 188)
    public static final void method2225(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        class94.method647(class314.field5393[arg1], arg0 - arg2, -7, arg0 + arg2, arg4);
        if (arg3 != 1) {
            method2223(54);
        }
        field5477++;
        int var5 = 0;
        int var6 = -arg2;
        int var7 = arg2;
        int var8 = -1;
        while (var7 > var5) {
            var5++;
            var8 += 2;
            var6 += var8;
            if (var6 >= 0) {
                var7--;
                var6 -= var7 << 1;
                int[] var9 = class314.field5393[arg1 + var7];
                int var10 = arg0 + var5;
                int[] var11 = class314.field5393[arg1 - var7];
                int var12 = arg0 - var5;
                class94.method647(var9, var12, -7, var10, arg4);
                class94.method647(var11, var12, -7, var10, arg4);
            }
            int var13 = arg0 + var7;
            int[] var14 = class314.field5393[arg1 + var5];
            int var15 = arg0 - var7;
            int[] var16 = class314.field5393[arg1 - var5];
            class94.method647(var14, var15, -7, var13, arg4);
            class94.method647(var16, var15, -7, var13, arg4);
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(Lbb;IB)V", line = 264)
    private final void method2226(class134 arg0, int arg1, byte arg2) {
        if (arg1 == 1) {
            this.field5470 = arg0.method948(-123);
        } else if (arg1 == 2) {
            this.field5476 = arg0.method948(-127);
        } else if (arg1 == 3) {
            this.field5479 = arg0.method970(1);
        } else if (arg1 == 4) {
            this.field5466 = arg0.method957(496113200);
        } else if (arg1 == 5 || arg1 == 6) {
            int var4 = arg0.method942(true);
            this.field5462 = new class237(class301.method2026(var4, false));
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg0.method957(496113200);
                class68 var7;
                if (arg1 == 5) {
                    var7 = new class305(arg0.method970(1));
                } else {
                    var7 = new class27(arg0.method957(496113200));
                }
                this.field5462.method1636(11311, var7, (long) var6);
            }
        }
        if (arg2 < -37) {
            field5471++;
        }
    }

    @OriginalMember(owner = "client!hd", name = "f", descriptor = "(B)V", line = 319)
    private final void method2227(byte arg0) {
        this.field5475 = new class237(this.field5462.method1637(true));
        field5478++;
        for (class27 var2 = (class27) this.field5462.method1630((byte) 56); var2 != null; var2 = (class27) this.field5462.method1632(-115)) {
            class27 var3 = new class27((int) var2.field1117);
            this.field5475.method1636(11311, var3, (long) var2.field383);
        }
        int var4 = -128 / ((arg0 + 45) / 50);
    }
}
