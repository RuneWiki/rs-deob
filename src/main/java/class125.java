import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!om")
public class class125 {

    @OriginalMember(owner = "client!om", name = "a", descriptor = "I")
    public int field1681 = 2;

    @OriginalMember(owner = "client!om", name = "h", descriptor = "I")
    public int field1688 = -1;

    @OriginalMember(owner = "client!om", name = "d", descriptor = "I")
    public int field1684 = 5;

    @OriginalMember(owner = "client!om", name = "p", descriptor = "I")
    public int field1696 = 99;

    @OriginalMember(owner = "client!om", name = "e", descriptor = "Z")
    public boolean field1685 = false;

    @OriginalMember(owner = "client!om", name = "o", descriptor = "Z")
    public boolean field1695 = false;

    @OriginalMember(owner = "client!om", name = "k", descriptor = "I")
    public int field1691 = -1;

    @OriginalMember(owner = "client!om", name = "C", descriptor = "I")
    public int field1709 = -1;

    @OriginalMember(owner = "client!om", name = "G", descriptor = "Z")
    public boolean field1713 = false;

    @OriginalMember(owner = "client!om", name = "v", descriptor = "Z")
    public boolean field1702 = false;

    @OriginalMember(owner = "client!om", name = "K", descriptor = "I")
    public int field1717 = -1;

    @OriginalMember(owner = "client!om", name = "g", descriptor = "I")
    public int field1687 = -1;

    @OriginalMember(owner = "client!om", name = "t", descriptor = "I")
    public static int field1700 = 0;

    @OriginalMember(owner = "client!om", name = "E", descriptor = "Z")
    public static boolean field1711 = true;

    @OriginalMember(owner = "client!om", name = "s", descriptor = "[I")
    public static int[] field1699 = new int[50];

    @OriginalMember(owner = "client!om", name = "b", descriptor = "I")
    public static int field1682;

    @OriginalMember(owner = "client!om", name = "c", descriptor = "I")
    public static int field1683;

    @OriginalMember(owner = "client!om", name = "f", descriptor = "I")
    public int field1686;

    @OriginalMember(owner = "client!om", name = "i", descriptor = "I")
    public static int field1689;

    @OriginalMember(owner = "client!om", name = "j", descriptor = "I")
    public static int field1690;

    @OriginalMember(owner = "client!om", name = "l", descriptor = "I")
    public static int field1692;

    @OriginalMember(owner = "client!om", name = "n", descriptor = "I")
    public static int field1694;

    @OriginalMember(owner = "client!om", name = "u", descriptor = "I")
    public static int field1701;

    @OriginalMember(owner = "client!om", name = "w", descriptor = "I")
    public static int field1703;

    @OriginalMember(owner = "client!om", name = "y", descriptor = "I")
    public static int field1705;

    @OriginalMember(owner = "client!om", name = "B", descriptor = "I")
    public static int field1708;

    @OriginalMember(owner = "client!om", name = "D", descriptor = "I")
    public static int field1710;

    @OriginalMember(owner = "client!om", name = "F", descriptor = "I")
    public static int field1712;

    @OriginalMember(owner = "client!om", name = "H", descriptor = "I")
    public static int field1714;

    @OriginalMember(owner = "client!om", name = "I", descriptor = "I")
    public static int field1715;

    @OriginalMember(owner = "client!om", name = "L", descriptor = "I")
    public static int field1718;

    @OriginalMember(owner = "client!om", name = "q", descriptor = "Lo;")
    public static class285 field1697;

    @OriginalMember(owner = "client!om", name = "r", descriptor = "[I")
    private int[] field1698;

    @OriginalMember(owner = "client!om", name = "z", descriptor = "[I")
    public int[] field1706;

    @OriginalMember(owner = "client!om", name = "A", descriptor = "[I")
    public int[] field1707;

    @OriginalMember(owner = "client!om", name = "x", descriptor = "[Z")
    public boolean[] field1704;

    @OriginalMember(owner = "client!om", name = "J", descriptor = "[[I")
    public int[][] field1716;

    @OriginalMember(owner = "client!om", name = "m", descriptor = "[[Ltk;")
    public static class268[][] field1693;

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;I)V", line = 5)
    public static final void method896(int arg0, String arg1, String arg2, int arg3) {
        class141.field1921 = arg2;
        if (arg0 != -223082608) {
            method908(112);
        }
        field1705++;
        class142.field1942 = arg3;
        class131.field1797 = arg1;
        if (class141.field1921.equals("") || class131.field1797.equals("")) {
            class68.field939 = 3;
        } else if (class199.field2838 == -1) {
            class168.field2289 = 0;
            class126.field1735 = 0;
            class185.field2545 = 1;
            class68.field939 = -3;
            class316 var4 = new class316(128);
            var4.method2184((byte) 89, 10);
            var4.method2188(arg0 ^ 0xF2B4076F, (int) (Math.random() * 9.9999999E7D));
            var4.method2202(class77.method584(class141.field1921, 95), -122);
            var4.method2188(255, (int) (Math.random() * 9.9999999E7D));
            var4.method2157((byte) -94, class131.field1797);
            var4.method2188(arg0 + 223082863, (int) (Math.random() * 9.9999999E7D));
            var4.method2216(class338.field5079, true, class39.field436);
            class90.field1264.field4777 = 0;
            class90.field1264.method2184((byte) 89, 24);
            class90.field1264.method2184((byte) 89, var4.field4777 + 2);
            class90.field1264.method2189(arg0 + 223082607, 541);
            class90.field1264.method2218(arg0 + 223082604, 0, var4.field4777, var4.field4798);
        } else {
            class312.method2140(-109);
        }
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(BIILq;II)Lq;", line = 61)
    public final class345 method897(byte arg0, int arg1, int arg2, class345 arg3, int arg4, int arg5) {
        field1690++;
        int var7 = this.field1706[arg5];
        if (arg0 >= -17) {
            return (class345) null;
        }
        int var8 = this.field1707[arg5];
        class52 var9 = class168.method1189(1, var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            return arg3.method338(true, true, true);
        }
        int var11 = arg1 & 0x3;
        class52 var12 = null;
        if ((this.field1685 || class101.field1396) && arg4 != -1 && arg4 < this.field1707.length) {
            int var13 = this.field1707[arg4];
            var12 = class168.method1189(1, var13 >> 16);
            arg4 = var13 & 0xFFFF;
        }
        class345 var14;
        if (var12 == null) {
            var14 = arg3.method338(!var9.method359(var10, -12124), !var9.method357(-1, var10), !this.field1713);
        } else {
            var14 = arg3.method338(!var9.method359(var10, -12124) & !var12.method359(arg4, -12124), !var9.method357(-1, var10) & !var12.method357(-1, arg4), !this.field1713);
        }
        if (this.field1713 && class67.field908) {
            if (var11 == 1) {
                ((class267) var14).method1837();
            } else if (var11 == 2) {
                ((class267) var14).method1840();
            } else if (var11 == 3) {
                ((class267) var14).method1812();
            }
        } else if (var11 == 1) {
            var14.method315();
        } else if (var11 == 2) {
            var14.method348();
        } else if (var11 == 3) {
            var14.method324();
        }
        var14.method2383(var9, var10, var12, arg4, arg2 - 1, var7, this.field1713);
        if (this.field1713 && class67.field908) {
            if (var11 == 1) {
                ((class267) var14).method1812();
            } else if (var11 == 2) {
                ((class267) var14).method1840();
            } else if (var11 == 3) {
                ((class267) var14).method1837();
            }
        } else if (var11 == 1) {
            var14.method324();
        } else if (var11 == 2) {
            var14.method348();
        } else if (var11 == 3) {
            var14.method315();
        }
        return var14;
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(I)V", line = 169)
    public final void method898(int arg0) {
        if (arg0 != -4) {
            this.field1698 = (int[]) null;
        }
        if (this.field1709 == -1) {
            if (this.field1704 == null) {
                this.field1709 = 0;
            } else {
                this.field1709 = 2;
            }
        }
        field1712++;
        if (this.field1717 != -1) {
            return;
        }
        if (this.field1704 == null) {
            this.field1717 = 0;
        } else {
            this.field1717 = 2;
        }
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(IZIILq;)Lq;", line = 197)
    public final class345 method899(int arg0, boolean arg1, int arg2, int arg3, class345 arg4) {
        field1708++;
        int var6 = this.field1707[arg3];
        int var7 = this.field1706[arg3];
        class52 var8 = class168.method1189(1, var6 >> 16);
        int var9 = var6 & 0xFFFF;
        if (var8 == null) {
            return arg4.method338(true, true, true);
        }
        class52 var10 = null;
        if ((this.field1685 || class101.field1396) && arg0 != -1 && this.field1707.length > arg0) {
            int var11 = this.field1707[arg0];
            var10 = class168.method1189(1, var11 >> 16);
            arg0 = var11 & 0xFFFF;
        }
        class52 var12 = null;
        class52 var13 = null;
        int var14 = 0;
        int var15 = 0;
        if (this.field1698 != null) {
            if (this.field1698.length > arg3) {
                var14 = this.field1698[arg3];
                if (var14 != 65535) {
                    var12 = class168.method1189(1, var14 >> 16);
                    var14 &= 0xFFFF;
                }
            }
            if ((this.field1685 || class101.field1396) && arg0 != -1 && arg0 < this.field1698.length) {
                var15 = this.field1698[arg0];
                if (var15 != 65535) {
                    var13 = class168.method1189(1, var15 >> 16);
                    var15 &= 0xFFFF;
                }
            }
        }
        boolean var16 = !var8.method359(var9, -12124);
        boolean var17 = !var8.method357(-1, var9);
        if (var12 != null) {
            var16 &= !var12.method359(var14, -12124);
            var17 &= !var12.method357(-1, var14);
        }
        if (var10 != null) {
            var16 &= !var10.method359(arg0, -12124);
            var17 &= !var10.method357(-1, arg0);
        }
        if (!arg1) {
            return (class345) null;
        }
        if (var13 != null) {
            var16 &= !var13.method359(var15, -12124);
            var17 &= !var13.method357(-1, var15);
        }
        class345 var18 = arg4.method338(var16, var17, !this.field1713);
        var18.method2383(var8, var9, var10, arg0, arg2 - 1, var7, this.field1713);
        if (var12 != null) {
            var18.method2383(var12, var14, var13, var15, arg2 - 1, var7, this.field1713);
        }
        return var18;
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(Lkm;Lkm;Lgn;ILkm;)Z", line = 296)
    public static final boolean method900(class133 arg0, class133 arg1, class77 arg2, int arg3, class133 arg4) {
        if (arg3 != 1) {
            return true;
        }
        field1689++;
        class230.field3258 = arg1;
        class141.field1927 = arg2;
        class240.field3408 = arg0;
        class194.field2700 = arg4;
        return true;
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(ZI)Lfa;", line = 319)
    public static final class259 method901(boolean arg0, int arg1) {
        if (!arg0) {
            field1697 = (class285) null;
        }
        field1718++;
        return class101.field1395 && class65.field853 <= arg1 && class318.field4855 >= arg1 ? class226.field3238[arg1 - class65.field853] : null;
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(ILq;IIZ)Lq;", line = 341)
    public final class345 method902(int arg0, class345 arg1, int arg2, int arg3, boolean arg4) {
        field1701++;
        int var6 = this.field1706[arg2];
        int var7 = this.field1707[arg2];
        class52 var8 = class168.method1189(1, var7 >> 16);
        if (!arg4) {
            this.field1691 = -86;
        }
        int var9 = var7 & 0xFFFF;
        if (var8 == null) {
            return arg1.method323(true, true, true);
        }
        class52 var10 = null;
        if ((this.field1685 || class101.field1396) && arg0 != -1 && this.field1707.length > arg0) {
            int var11 = this.field1707[arg0];
            var10 = class168.method1189(1, var11 >> 16);
            arg0 = var11 & 0xFFFF;
        }
        class345 var12;
        if (var10 == null) {
            var12 = arg1.method323(!var8.method359(var9, -12124), !var8.method357(-1, var9), !this.field1713);
        } else {
            var12 = arg1.method323(!var8.method359(var9, -12124) & !var10.method359(arg0, -12124), !var8.method357(-1, var9) & !var10.method357(-1, arg0), !this.field1713);
        }
        var12.method2383(var8, var9, var10, arg0, arg3 - 1, var6, this.field1713);
        return var12;
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(IILq;IIB)Lq;", line = 381)
    public final class345 method903(int arg0, int arg1, class345 arg2, int arg3, int arg4, byte arg5) {
        field1710++;
        int var7 = this.field1706[arg4];
        int var8 = this.field1707[arg4];
        class52 var9 = class168.method1189(1, var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            return arg2.method328(true, true, true);
        }
        class52 var11 = null;
        if ((this.field1685 || class101.field1396) && arg1 != -1 && this.field1707.length > arg1) {
            int var12 = this.field1707[arg1];
            var11 = class168.method1189(arg5 + 54, var12 >> 16);
            arg1 = var12 & 0xFFFF;
        }
        if (arg5 != -53) {
            return (class345) null;
        }
        class345 var13;
        if (var11 == null) {
            var13 = arg2.method328(!var9.method359(var10, -12124), !var9.method357(-1, var10), !this.field1713);
        } else {
            var13 = arg2.method328(!var9.method359(var10, -12124) & !var11.method359(arg1, arg5 ^ 0x2F6F), !var9.method357(-1, var10) & !var11.method357(-1, arg1), !this.field1713);
        }
        int var14 = arg3 & 0x3;
        if (class67.field908 && this.field1713) {
            if (var14 == 1) {
                ((class267) var13).method1837();
            } else if (var14 == 2) {
                ((class267) var13).method1840();
            } else if (var14 == 3) {
                ((class267) var13).method1812();
            }
        } else if (var14 == 1) {
            var13.method315();
        } else if (var14 == 2) {
            var13.method348();
        } else if (var14 == 3) {
            var13.method324();
        }
        var13.method2383(var9, var10, var11, arg1, arg0 - 1, var7, this.field1713);
        if (class67.field908 && this.field1713) {
            if (var14 == 1) {
                ((class267) var13).method1812();
            } else if (var14 == 2) {
                ((class267) var13).method1840();
            } else if (var14 == 3) {
                ((class267) var13).method1837();
            }
        } else if (var14 == 1) {
            var13.method324();
        } else if (var14 == 2) {
            var13.method348();
        } else if (var14 == 3) {
            var13.method315();
        }
        return var13;
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(Lcg;II)V", line = 481)
    private final void method904(class316 arg0, int arg1, int arg2) {
        if (arg2 != -21014) {
            return;
        }
        field1683++;
        if (arg1 == 1) {
            int var13 = arg0.method2220((byte) 42);
            this.field1706 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field1706[var14] = arg0.method2220((byte) 72);
            }
            this.field1707 = new int[var13];
            for (int var15 = 0; var15 < var13; var15++) {
                this.field1707[var15] = arg0.method2220((byte) 91);
            }
            for (int var16 = 0; var16 < var13; var16++) {
                this.field1707[var16] += arg0.method2220((byte) 58) << 16;
            }
        } else if (arg1 == 2) {
            this.field1687 = arg0.method2220((byte) 76);
        } else if (arg1 == 3) {
            this.field1704 = new boolean[256];
            int var4 = arg0.method2219(16448);
            for (int var5 = 0; var5 < var4; var5++) {
                this.field1704[arg0.method2219(16448)] = true;
            }
        } else if (arg1 == 4) {
            this.field1695 = true;
        } else if (arg1 == 5) {
            this.field1684 = arg0.method2219(arg2 + 37462);
        } else if (arg1 == 6) {
            this.field1691 = arg0.method2220((byte) 70);
        } else if (arg1 == 7) {
            this.field1688 = arg0.method2220((byte) 72);
        } else if (arg1 == 8) {
            this.field1696 = arg0.method2219(16448);
        } else if (arg1 == 9) {
            this.field1717 = arg0.method2219(16448);
        } else if (arg1 == 10) {
            this.field1709 = arg0.method2219(arg2 ^ 0xFFFFEDAA);
        } else if (arg1 == 11) {
            this.field1681 = arg0.method2219(16448);
        } else if (arg1 == 12) {
            int var6 = arg0.method2219(16448);
            this.field1698 = new int[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field1698[var7] = arg0.method2220((byte) 116);
            }
            for (int var8 = 0; var8 < var6; var8++) {
                this.field1698[var8] += arg0.method2220((byte) 108) << 16;
            }
        } else if (arg1 == 13) {
            int var9 = arg0.method2220((byte) 90);
            this.field1716 = new int[var9][];
            for (int var10 = 0; var10 < var9; var10++) {
                int var11 = arg0.method2219(16448);
                if (var11 > 0) {
                    this.field1716[var10] = new int[var11];
                    this.field1716[var10][0] = arg0.method2210((byte) -5);
                    for (int var12 = 1; var12 < var11; var12++) {
                        this.field1716[var10][var12] = arg0.method2220((byte) 45);
                    }
                }
            }
        } else if (arg1 == 14) {
            this.field1713 = true;
        } else if (arg1 == 15) {
            this.field1685 = true;
        } else if (arg1 == 16) {
            this.field1702 = true;
        }
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(ZII)I", line = 647)
    public static final int method905(boolean arg0, int arg1, int arg2) {
        field1703++;
        class113 var3 = (class113) class255.field3648.method111(21, (long) arg2);
        if (var3 == null) {
            return -1;
        } else if (arg1 >= 0 && arg1 < var3.field1541.length) {
            if (!arg0) {
                field1693 = (class268[][]) ((class268[][]) null);
            }
            return var3.field1541[arg1];
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!om", name = "b", descriptor = "(ZI)V", line = 669)
    public static final void method906(boolean arg0, int arg1) {
        field1714++;
        class43.field516 = 1000 / arg1;
        if (!arg0) {
            field1697 = (class285) null;
        }
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(Lcg;I)V", line = 681)
    public final void method907(class316 arg0, int arg1) {
        field1715++;
        while (true) {
            int var3 = arg0.method2219(16448);
            if (var3 == 0) {
                if (arg1 != 1000) {
                    method905(true, -95, 3);
                }
                return;
            }
            this.method904(arg0, var3, -21014);
        }
    }

    @OriginalMember(owner = "client!om", name = "b", descriptor = "(I)V", line = 720)
    public static final void method908(int arg0) {
        if (arg0 >= -66) {
            field1700 = -42;
        }
        field1694++;
        class153.field2126.method724(0);
    }

    @OriginalMember(owner = "client!om", name = "c", descriptor = "(I)V", line = 731)
    public static void method909(int arg0) {
        field1697 = null;
        if (arg0 == 3) {
            field1699 = null;
            field1693 = (class268[][]) null;
        }
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(IB)V", line = 760)
    public static final void method910(int arg0, byte arg1) {
        class148.field2053.method720(arg0, 1088);
        class257.field3796.method720(arg0, 1088);
        if (arg1 <= 68) {
            field1699 = (int[]) null;
        }
        field1682++;
    }
}
