import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!p")
public class class120 {

    @OriginalMember(owner = "client!p", name = "g", descriptor = "[I")
    private int[] field1703;

    @OriginalMember(owner = "client!p", name = "m", descriptor = "[I")
    private int[] field1709;

    @OriginalMember(owner = "client!p", name = "p", descriptor = "I")
    public static int field1712 = 0;

    @OriginalMember(owner = "client!p", name = "a", descriptor = "Lng;")
    public static class190 field1697 = new class190(4);

    @OriginalMember(owner = "client!p", name = "r", descriptor = "I")
    public static int field1714 = 0;

    @OriginalMember(owner = "client!p", name = "b", descriptor = "I")
    public static int field1698;

    @OriginalMember(owner = "client!p", name = "c", descriptor = "I")
    public static int field1699;

    @OriginalMember(owner = "client!p", name = "e", descriptor = "I")
    private int field1701;

    @OriginalMember(owner = "client!p", name = "f", descriptor = "I")
    private int field1702;

    @OriginalMember(owner = "client!p", name = "h", descriptor = "I")
    public static int field1704;

    @OriginalMember(owner = "client!p", name = "i", descriptor = "I")
    public static int field1705;

    @OriginalMember(owner = "client!p", name = "j", descriptor = "I")
    public static int field1706;

    @OriginalMember(owner = "client!p", name = "k", descriptor = "I")
    public static int field1707;

    @OriginalMember(owner = "client!p", name = "l", descriptor = "I")
    private int field1708;

    @OriginalMember(owner = "client!p", name = "n", descriptor = "I")
    public static int field1710;

    @OriginalMember(owner = "client!p", name = "o", descriptor = "I")
    private int field1711;

    @OriginalMember(owner = "client!p", name = "q", descriptor = "I")
    public static int field1713;

    @OriginalMember(owner = "client!p", name = "d", descriptor = "Lqj;")
    public static class296 field1700;

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(Z)V", line = 3)
    private final void method810(boolean arg0) {
        field1707++;
        this.field1711 += ++this.field1701;
        int var2 = 0;
        if (!arg0) {
            method817((class281) null, (byte) 91);
        }
        while (var2 < 256) {
            int var3 = this.field1709[var2];
            if ((var2 & 0x2) == 0) {
                if ((var2 & 0x1) == 0) {
                    this.field1702 ^= this.field1702 << 13;
                } else {
                    this.field1702 ^= this.field1702 >>> 6;
                }
            } else if ((var2 & 0x1) == 0) {
                this.field1702 ^= this.field1702 << 2;
            } else {
                this.field1702 ^= this.field1702 >>> 16;
            }
            this.field1702 += this.field1709[var2 + 128 & 0xFF];
            int var4;
            this.field1709[var2] = var4 = this.field1709[class318.method2028(1020, var3) >> 2] - (-this.field1711 - this.field1702);
            this.field1703[var2] = this.field1711 = this.field1709[class318.method2028(255, var4 >> 8 >> 2)] + var3;
            var2++;
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(IIII)V", line = 56)
    public static final void method811(int arg0, int arg1, int arg2, int arg3) {
        field1706++;
        if (arg3 == 0) {
            class442.field6400.method158((byte) 7, 215);
            class270.field3682++;
        }
        if (arg3 == 1) {
            class442.field6400.method158((byte) 7, 10);
            class245.field3403++;
        }
        class442.field6400.method2438(arg0 ^ 0x63, class354.field4981 + arg1);
        class442.field6400.method2384(class293.field4056[82] ? 1 : 0, true);
        class442.field6400.method2428(class449.field6509 + arg2, 121);
        class46.field714 = false;
        class184.field2575 = arg1;
        class394.field5764 = arg2;
        if (arg0 == 0) {
            class77.method548(arg0 + 119);
        }
    }

    @OriginalMember(owner = "client!p", name = "b", descriptor = "(Z)V", line = 85)
    public static void method812(boolean arg0) {
        field1700 = null;
        field1697 = null;
        if (!arg0) {
            field1712 = 103;
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(ILaa;IZ[Lie;Lsm;)V", line = 97)
    public static final void method813(int arg0, class281 arg1, int arg2, boolean arg3, class4[] arg4, class156 arg5) {
        field1699++;
        if (!arg3) {
            for (int var6 = 0; var6 < 4; var6++) {
                for (int var7 = 0; var7 < class432.field6220; var7++) {
                    for (int var8 = 0; var8 < class267.field3646; var8++) {
                        if ((class221.field2910[var6][var7][var8] & 0x1) != 0) {
                            int var9 = var6;
                            if ((class221.field2910[1][var7][var8] & 0x2) != 0) {
                                var9 = var6 - 1;
                            }
                            if (var9 >= 0) {
                                arg4[var9].method19(var7, var8, 93);
                            }
                        }
                    }
                }
            }
        }
        int[][] var10 = new int[class432.field6220][class267.field3646];
        for (int var11 = arg2; var11 < arg0; var11++) {
            for (int var13 = 0; var13 < class267.field3646; var13++) {
                class166.field2368[var13] = 0;
                class346.field4844[var13] = 0;
                class310.field4243[var13] = 0;
                class390.field5738[var13] = 0;
                class429.field6174[var13] = 0;
            }
            for (int var14 = -5; var14 < class432.field6220; var14++) {
                for (int var15 = 0; var15 < class267.field3646; var15++) {
                    int var24 = var14 + 5;
                    int var10002;
                    if (class432.field6220 > var24) {
                        int var25 = class399.field5841[var11][var24][var15] & 0xFF;
                        if (var25 > 0) {
                            class170 var26 = class223.method1415(var25 - 1, (byte) -88);
                            class166.field2368[var15] += var26.field2415;
                            class346.field4844[var15] += var26.field2422;
                            class310.field4243[var15] += var26.field2421;
                            class390.field5738[var15] += var26.field2419;
                            var10002 = class429.field6174[var15]++;
                        }
                    }
                    int var27 = var14 - 5;
                    if (var27 >= 0) {
                        int var28 = class399.field5841[var11][var27][var15] & 0xFF;
                        if (var28 > 0) {
                            class170 var29 = class223.method1415(var28 - 1, (byte) -88);
                            class166.field2368[var15] -= var29.field2415;
                            class346.field4844[var15] -= var29.field2422;
                            class310.field4243[var15] -= var29.field2421;
                            class390.field5738[var15] -= var29.field2419;
                            var10002 = class429.field6174[var15]--;
                        }
                    }
                }
                if (var14 >= 0) {
                    int var16 = 0;
                    int var17 = 0;
                    int var18 = 0;
                    int var19 = 0;
                    int var20 = 0;
                    for (int var21 = -5; var21 < class267.field3646; var21++) {
                        int var22 = var21 + 5;
                        if (var22 < class267.field3646) {
                            var19 += class390.field5738[var22];
                            var16 += class166.field2368[var22];
                            var17 += class346.field4844[var22];
                            var20 += class429.field6174[var22];
                            var18 += class310.field4243[var22];
                        }
                        int var23 = var21 - 5;
                        if (var23 >= 0) {
                            var17 -= class346.field4844[var23];
                            var16 -= class166.field2368[var23];
                            var19 -= class390.field5738[var23];
                            var20 -= class429.field6174[var23];
                            var18 -= class310.field4243[var23];
                        }
                        if (var21 >= 0 && var19 > 0 && var20 > 0) {
                            var10[var14][var21] = class40.method282(var17 / var20, false, var18 / var20, var16 * 256 / var19);
                        }
                    }
                }
            }
            class126.method842(var10, arg1, class267.field3646, var11, class361.field5069[var11], arg5, class249.field3456[var11], arg3, class432.field6220, -2509, class399.field5841[var11], class140.field2006[var11], class68.field1065[var11]);
            class399.field5841[var11] = null;
            class68.field1065[var11] = null;
            class361.field5069[var11] = null;
            class140.field2006[var11] = null;
        }
        if (!arg3) {
            if (class412.field5977) {
                class57.method376();
            }
            if (class410.field5956 != 0) {
                class167.method1135();
            }
        }
        for (int var12 = 0; var12 < arg0; var12++) {
            class249.field3456[var12].method280();
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(Ljava/lang/Throwable;I)Ljava/lang/String;", line = 302)
    public static final String method814(Throwable arg0, int arg1) throws IOException {
        field1710++;
        String var2;
        if ((arg0 instanceof class126)) {
            class126 var3 = (class126) arg0;
            arg0 = var3.field1772;
            var2 = var3.field1774 + " | ";
        } else {
            var2 = "";
        }
        StringWriter var4 = new StringWriter();
        PrintWriter var5 = new PrintWriter(var4);
        if (arg1 != 9) {
            field1700 = null;
        }
        arg0.printStackTrace(var5);
        var5.close();
        String var6 = var4.toString();
        BufferedReader var7 = new BufferedReader(new StringReader(var6));
        String var8 = var7.readLine();
        while (true) {
            String var9 = var7.readLine();
            if (var9 == null) {
                return var2 + "| " + var8;
            }
            int var10 = var9.indexOf(40);
            int var11 = var9.indexOf(41, var10 + 1);
            String var12;
            if (var10 == -1) {
                var12 = var9;
            } else {
                var12 = var9.substring(0, var10);
            }
            String var13 = var12.trim();
            String var14 = var13.substring(var13.lastIndexOf(32) + 1);
            String var15 = var14.substring(var14.lastIndexOf(9) + 1);
            String var16 = var2 + var15;
            if (var10 != -1 && var11 != -1) {
                int var17 = var9.indexOf(".java:", var10);
                if (var17 >= 0) {
                    var16 = var16 + var9.substring(var17 + 5, var11);
                }
            }
            var2 = var16 + ' ';
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(B)V", line = 379)
    private final void method815(byte arg0) {
        field1704++;
        int var2 = -1640531527;
        int var3 = -1640531527;
        int var4 = -1640531527;
        int var5 = -1640531527;
        int var6 = -1640531527;
        int var7 = -1640531527;
        int var8 = -1640531527;
        int var9 = -1640531527;
        for (int var10 = 0; var10 < 4; var10++) {
            int var61 = var9 ^ var8 << 11;
            int var62 = var6 + var61;
            int var63 = var7 + var8;
            int var64 = var63 ^ var7 >>> 2;
            int var65 = var5 + var64;
            int var66 = var7 + var62;
            int var67 = var66 ^ var62 << 8;
            int var68 = var4 + var67;
            int var69 = var62 + var65;
            var6 = var69 ^ var65 >>> 16;
            int var70 = var3 + var6;
            int var71 = var65 + var68;
            var5 = var71 ^ var68 << 10;
            int var72 = var2 + var5;
            int var73 = var68 + var70;
            var4 = var73 ^ var70 >>> 4;
            int var74 = var70 + var72;
            int var75 = var4 + var61;
            var3 = var74 ^ var72 << 8;
            int var76 = var72 + var75;
            var8 = var3 + var64;
            var2 = var76 ^ var75 >>> 9;
            var7 = var2 + var67;
            var9 = var8 + var75;
        }
        for (int var11 = 0; var11 < 256; var11 += 8) {
            int var37 = this.field1703[var11 + 7] + var2;
            int var38 = this.field1703[var11 + 4] + var5;
            int var39 = this.field1703[var11 + 2] + var7;
            int var40 = this.field1703[var11 + 6] + var3;
            int var41 = this.field1703[var11 + 1] + var8;
            int var42 = this.field1703[var11] + var9;
            int var43 = this.field1703[var11 + 3] + var6;
            int var44 = this.field1703[var11 + 5] + var4;
            int var45 = var42 ^ var41 << 11;
            int var46 = var43 + var45;
            int var47 = var39 + var41;
            int var48 = var47 ^ var39 >>> 2;
            int var49 = var38 + var48;
            int var50 = var39 + var46;
            int var51 = var50 ^ var46 << 8;
            int var52 = var46 + var49;
            int var53 = var44 + var51;
            var6 = var52 ^ var49 >>> 16;
            int var54 = var6 + var40;
            int var55 = var49 + var53;
            var5 = var55 ^ var53 << 10;
            int var56 = var53 + var54;
            int var57 = var5 + var37;
            var4 = var56 ^ var54 >>> 4;
            int var58 = var54 + var57;
            int var59 = var4 + var45;
            var3 = var58 ^ var57 << 8;
            int var60 = var57 + var59;
            var8 = var3 + var48;
            var2 = var60 ^ var59 >>> 9;
            var7 = var2 + var51;
            var9 = var8 + var59;
            this.field1709[var11] = var9;
            this.field1709[var11 + 1] = var8;
            this.field1709[var11 + 2] = var7;
            this.field1709[var11 + 3] = var6;
            this.field1709[var11 + 4] = var5;
            this.field1709[var11 + 5] = var4;
            this.field1709[var11 + 6] = var3;
            this.field1709[var11 + 7] = var2;
        }
        for (int var12 = 0; var12 < 256; var12 += 8) {
            int var13 = this.field1709[var12 + 7] + var2;
            int var14 = this.field1709[var12 + 2] + var7;
            int var15 = this.field1709[var12] + var9;
            int var16 = this.field1709[var12 + 5] + var4;
            int var17 = this.field1709[var12 + 1] + var8;
            int var18 = this.field1709[var12 + 3] + var6;
            int var19 = this.field1709[var12 + 6] + var3;
            int var20 = this.field1709[var12 + 4] + var5;
            int var21 = var15 ^ var17 << 11;
            int var22 = var18 + var21;
            int var23 = var14 + var17;
            int var24 = var23 ^ var14 >>> 2;
            int var25 = var14 + var22;
            int var26 = var20 + var24;
            int var27 = var25 ^ var22 << 8;
            int var28 = var16 + var27;
            int var29 = var22 + var26;
            var6 = var29 ^ var26 >>> 16;
            int var30 = var26 + var28;
            int var31 = var6 + var19;
            var5 = var30 ^ var28 << 10;
            int var32 = var28 + var31;
            int var33 = var5 + var13;
            var4 = var32 ^ var31 >>> 4;
            int var34 = var4 + var21;
            int var35 = var31 + var33;
            var3 = var35 ^ var33 << 8;
            int var36 = var33 + var34;
            var8 = var3 + var24;
            var2 = var36 ^ var34 >>> 9;
            var9 = var8 + var34;
            var7 = var2 + var27;
            this.field1709[var12] = var9;
            this.field1709[var12 + 1] = var8;
            this.field1709[var12 + 2] = var7;
            this.field1709[var12 + 3] = var6;
            this.field1709[var12 + 4] = var5;
            this.field1709[var12 + 5] = var4;
            this.field1709[var12 + 6] = var3;
            this.field1709[var12 + 7] = var2;
        }
        this.method810(true);
        if (arg0 > -60) {
            this.method815((byte) 85);
        }
        this.field1708 = 256;
    }

    @OriginalMember(owner = "client!p", name = "b", descriptor = "(B)I", line = 528)
    public final int method816(byte arg0) {
        int var2 = -62 % ((arg0 + 39) / 51);
        field1705++;
        if ((this.field1708--) == 0) {
            this.method810(true);
            this.field1708 = 255;
        }
        return this.field1703[this.field1708];
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(Laa;B)V", line = 553)
    public static final void method817(class281 arg0, byte arg1) {
        if (arg1 != -29) {
            method813(7, (class281) null, 73, false, (class4[]) null, (class156) null);
        }
        field1698++;
        if (class349.field4882) {
            class340.method2182(arg0, -1);
        } else {
            class2.method8(false, arg0);
        }
    }

    @OriginalMember(owner = "client!p", name = "<init>", descriptor = "()V", line = 567)
    private class120() {
    }

    @OriginalMember(owner = "client!p", name = "<init>", descriptor = "([I)V", line = 569)
    public class120(int[] arg0) {
        this.field1703 = new int[256];
        this.field1709 = new int[256];
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.field1703[var2] = arg0[var2];
        }
        this.method815((byte) -68);
    }
}
