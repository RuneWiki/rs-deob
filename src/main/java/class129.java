import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lc")
public class class129 {

    @OriginalMember(owner = "client!lc", name = "z", descriptor = "I")
    public int field1715 = -1;

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "[I")
    public static int[] field1690 = new int[4096];

    @OriginalMember(owner = "client!lc", name = "x", descriptor = "[B")
    public static byte[] field1713;

    @OriginalMember(owner = "client!lc", name = "t", descriptor = "Lvq;")
    public static class24 field1709;

    @OriginalMember(owner = "client!lc", name = "D", descriptor = "Ltg;")
    public static class304 field1719;

    @OriginalMember(owner = "client!lc", name = "E", descriptor = "I")
    public static int field1720;

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "I")
    public static int field1691;

    @OriginalMember(owner = "client!lc", name = "d", descriptor = "I")
    public static int field1693;

    @OriginalMember(owner = "client!lc", name = "f", descriptor = "I")
    public static int field1695;

    @OriginalMember(owner = "client!lc", name = "h", descriptor = "I")
    public static int field1697;

    @OriginalMember(owner = "client!lc", name = "i", descriptor = "I")
    public static int field1698;

    @OriginalMember(owner = "client!lc", name = "j", descriptor = "I")
    public static int field1699;

    @OriginalMember(owner = "client!lc", name = "k", descriptor = "I")
    public static int field1700;

    @OriginalMember(owner = "client!lc", name = "q", descriptor = "I")
    public static int field1706;

    @OriginalMember(owner = "client!lc", name = "v", descriptor = "I")
    public static int field1711;

    @OriginalMember(owner = "client!lc", name = "F", descriptor = "Lct;")
    public static class104 field1721;

    @OriginalMember(owner = "client!lc", name = "u", descriptor = "Ldq;")
    private class90 field1710;

    @OriginalMember(owner = "client!lc", name = "n", descriptor = "Ljava/lang/String;")
    private String field1703;

    @OriginalMember(owner = "client!lc", name = "o", descriptor = "Ljava/lang/String;")
    private String field1704;

    @OriginalMember(owner = "client!lc", name = "G", descriptor = "Z")
    public static boolean field1722;

    @OriginalMember(owner = "client!lc", name = "c", descriptor = "[I")
    private int[] field1692;

    @OriginalMember(owner = "client!lc", name = "e", descriptor = "[I")
    private int[] field1694;

    @OriginalMember(owner = "client!lc", name = "l", descriptor = "[I")
    private int[] field1701;

    @OriginalMember(owner = "client!lc", name = "m", descriptor = "[I")
    private int[] field1702;

    @OriginalMember(owner = "client!lc", name = "p", descriptor = "[I")
    private int[] field1705;

    @OriginalMember(owner = "client!lc", name = "r", descriptor = "[I")
    private int[] field1707;

    @OriginalMember(owner = "client!lc", name = "A", descriptor = "[I")
    private int[] field1716;

    @OriginalMember(owner = "client!lc", name = "C", descriptor = "[I")
    private int[] field1718;

    @OriginalMember(owner = "client!lc", name = "s", descriptor = "[Ljava/lang/String;")
    private String[] field1708;

    @OriginalMember(owner = "client!lc", name = "y", descriptor = "[Ljava/lang/String;")
    private String[] field1714;

    @OriginalMember(owner = "client!lc", name = "g", descriptor = "[[I")
    private int[][] field1696;

    @OriginalMember(owner = "client!lc", name = "w", descriptor = "[[I")
    private int[][] field1712;

    @OriginalMember(owner = "client!lc", name = "B", descriptor = "[[I")
    private int[][] field1717;

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(I)V")
    public final void method861(int arg0) {
        if (this.field1704 == null) {
            this.field1704 = this.field1703;
        }
        if (arg0 == 3) {
            field1711++;
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(Z)V")
    public static final void method862(boolean arg0) {
        field1697++;
        if (class170.field2220 < 1024.0F) {
            class170.field2220 = 1024.0F;
        }
        while (class1.field19 >= 16384.0F) {
            class1.field19 -= 16384.0F;
        }
        if (class170.field2220 > 3072.0F) {
            class170.field2220 = 3072.0F;
        }
        while (class1.field19 < 0.0F) {
            class1.field19 += 16384.0F;
        }
        int var1 = class108.field1463 >> 7;
        int var2 = class171.field2236 >> 7;
        if (!arg0) {
            field1722 = false;
        }
        int var3 = class133.method889(class423.field6117, class108.field1463, class171.field2236, false);
        int var4 = 0;
        if (var1 > 3 && var2 > 3 && var1 < 100 && var2 < 100) {
            for (int var5 = var1 - 4; var5 <= var1 + 4; var5++) {
                for (int var6 = var2 - 4; var6 <= var2 + 4; var6++) {
                    int var7 = class423.field6117;
                    if (var7 < 3 && class274.method1872(false, var6, var5)) {
                        var7++;
                    }
                    int var8 = 0;
                    if (class157.field2114 != null && class157.field2114[var7] != null) {
                        var8 = (class157.field2114[var7][var5][var6] & 0xFF) * 8;
                    }
                    int var9 = var3 + (var8 - class215.field3069[var7].method1429(var5, var6));
                    if (var9 > var4) {
                        var4 = var9;
                    }
                }
            }
        }
        int var10 = var4 * 1536;
        if (var10 > 786432) {
            var10 = 786432;
        }
        if (var10 < 262144) {
            var10 = 262144;
        }
        if (var10 > class137.field1875) {
            class137.field1875 += (var10 - class137.field1875) / 24;
        } else if (class137.field1875 > var10) {
            class137.field1875 += (var10 - class137.field1875) / 80;
        }
    }

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "(I)V")
    public static final void method863(int arg0) {
        class278.field4104.method600(arg0 - 109);
        field1700++;
        if (arg0 != 2) {
            method870(118, 86, 126, -12, 67);
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(II)V")
    public static final void method864(int arg0, int arg1) {
        if (arg0 >= -39) {
            method862(true);
        }
        if (class11.field143 == null || class11.field143.length < arg1) {
            class11.field143 = new int[arg1];
        }
        field1706++;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(B)V")
    public static final void method865(byte arg0) {
        field1698++;
        class363 var1 = class298.field4339;
        synchronized (class298.field4339) {
            class298.field4339.method2307(30);
            if (arg0 != 127) {
                field1721 = null;
            }
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(Lat;I)V")
    public final void method866(class256 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method1738((byte) 90);
            if (var3 == 0) {
                field1693++;
                if (arg1 != -8245) {
                    this.field1705 = null;
                    return;
                }
                return;
            }
            this.method868(var3, -35, arg0);
        }
    }

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "(B)V")
    public static void method867(byte arg0) {
        field1721 = null;
        field1713 = null;
        if (arg0 > 21) {
            field1709 = null;
            field1690 = null;
            field1719 = null;
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(IILat;)V")
    private final void method868(int arg0, int arg1, class256 arg2) {
        if (arg0 == 1) {
            this.field1703 = arg2.method1737((byte) -127);
        } else if (arg0 == 2) {
            this.field1704 = arg2.method1737((byte) -67);
        } else if (arg0 == 3) {
            int var22 = arg2.method1738((byte) -87);
            this.field1712 = new int[var22][3];
            for (int var23 = 0; var23 < var22; var23++) {
                this.field1712[var23][0] = arg2.method1767(1930493576);
                this.field1712[var23][1] = arg2.method1746(20972);
                this.field1712[var23][2] = arg2.method1746(20972);
            }
        } else if (arg0 == 4) {
            int var20 = arg2.method1738((byte) -40);
            this.field1696 = new int[var20][3];
            for (int var21 = 0; var21 < var20; var21++) {
                this.field1696[var21][0] = arg2.method1767(1930493576);
                this.field1696[var21][1] = arg2.method1746(20972);
                this.field1696[var21][2] = arg2.method1746(20972);
            }
        } else if (arg0 == 5) {
            arg2.method1767(1930493576);
        } else if (arg0 == 6) {
            arg2.method1738((byte) -75);
        } else if (arg0 == 7) {
            arg2.method1738((byte) -95);
        } else if (arg0 != 8) {
            if (arg0 == 9) {
                arg2.method1738((byte) -89);
            } else if (arg0 == 10) {
                int var4 = arg2.method1738((byte) 109);
                this.field1716 = new int[var4];
                for (int var5 = 0; var5 < var4; var5++) {
                    this.field1716[var5] = arg2.method1746(20972);
                }
            } else if (arg0 == 12) {
                arg2.method1746(20972);
            } else if (arg0 == 13) {
                int var6 = arg2.method1738((byte) 82);
                this.field1718 = new int[var6];
                for (int var7 = 0; var7 < var6; var7++) {
                    this.field1718[var7] = arg2.method1767(1930493576);
                }
            } else if (arg0 == 14) {
                int var8 = arg2.method1738((byte) -55);
                this.field1717 = new int[var8][2];
                for (int var9 = 0; var9 < var8; var9++) {
                    this.field1717[var9][0] = arg2.method1738((byte) -42);
                    this.field1717[var9][1] = arg2.method1738((byte) -97);
                }
            } else if (arg0 == 15) {
                arg2.method1767(1930493576);
            } else if (arg0 == 17) {
                this.field1715 = arg2.method1767(1930493576);
            } else if (arg0 == 18) {
                int var10 = arg2.method1738((byte) 96);
                this.field1694 = new int[var10];
                this.field1692 = new int[var10];
                this.field1707 = new int[var10];
                this.field1714 = new String[var10];
                for (int var11 = 0; var11 < var10; var11++) {
                    this.field1707[var11] = arg2.method1746(20972);
                    this.field1694[var11] = arg2.method1746(20972);
                    this.field1692[var11] = arg2.method1746(20972);
                    this.field1714[var11] = arg2.method1715(true);
                }
            } else if (arg0 == 19) {
                int var12 = arg2.method1738((byte) -78);
                this.field1708 = new String[var12];
                this.field1705 = new int[var12];
                this.field1702 = new int[var12];
                this.field1701 = new int[var12];
                for (int var13 = 0; var13 < var12; var13++) {
                    this.field1702[var13] = arg2.method1746(20972);
                    this.field1705[var13] = arg2.method1746(20972);
                    this.field1701[var13] = arg2.method1746(20972);
                    this.field1708[var13] = arg2.method1715(true);
                }
            } else if (arg0 == 249) {
                int var14 = arg2.method1738((byte) -61);
                if (this.field1710 == null) {
                    int var15 = class289.method1938((byte) 78, var14);
                    this.field1710 = new class90(var15);
                }
                for (int var16 = 0; var16 < var14; var16++) {
                    boolean var17 = arg2.method1738((byte) -44) == 1;
                    int var18 = arg2.method1725((byte) 0);
                    class264 var19;
                    if (var17) {
                        var19 = new class82(arg2.method1715(true));
                    } else {
                        var19 = new class13(arg2.method1746(20972));
                    }
                    this.field1710.method606(1, var19, (long) var18);
                }
            }
        }
        field1695++;
        if (arg1 > -11) {
            method864(77, 76);
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(IILat;Lgt;)V")
    public static final void method869(int arg0, int arg1, class256 arg2, class341 arg3) {
        field1699++;
        if (arg0 != -29535) {
            field1713 = null;
        }
        class433 var4 = new class433();
        var4.field6303 = arg2.method1738((byte) 99);
        var4.field6306 = arg2.method1746(arg0 + 50507);
        var4.field6305 = new int[var4.field6303];
        var4.field6302 = new class350[var4.field6303];
        var4.field6310 = new int[var4.field6303];
        var4.field6307 = new class350[var4.field6303];
        var4.field6304 = new byte[var4.field6303][][];
        var4.field6301 = new int[var4.field6303];
        for (int var5 = 0; var5 < var4.field6303; var5++) {
            try {
                int var6 = arg2.method1738((byte) -55);
                if (var6 == 0 || var6 == 1 || var6 == 2) {
                    String var7 = arg2.method1715(true);
                    String var8 = arg2.method1715(true);
                    int var9 = 0;
                    if (var6 == 1) {
                        var9 = arg2.method1746(arg0 + 50507);
                    }
                    var4.field6301[var5] = var6;
                    var4.field6310[var5] = var9;
                    var4.field6307[var5] = arg3.method2220(class134.method895(arg0, -29535), var8, class320.method2106(-1, var7));
                } else if (var6 == 3 || var6 == 4) {
                    String var10 = arg2.method1715(true);
                    String var11 = arg2.method1715(true);
                    int var12 = arg2.method1738((byte) -44);
                    String[] var13 = new String[var12];
                    for (int var14 = 0; var14 < var12; var14++) {
                        var13[var14] = arg2.method1715(true);
                    }
                    byte[][] var15 = new byte[var12][];
                    if (var6 == 3) {
                        for (int var16 = 0; var16 < var12; var16++) {
                            int var17 = arg2.method1746(20972);
                            var15[var16] = new byte[var17];
                            arg2.method1710(var17, 0, var15[var16], arg0 + 29442);
                        }
                    }
                    var4.field6301[var5] = var6;
                    Class[] var18 = new Class[var12];
                    for (int var19 = 0; var19 < var12; var19++) {
                        var18[var19] = class320.method2106(arg0 + 29534, var13[var19]);
                    }
                    var4.field6302[var5] = arg3.method2215(0, var11, var18, class320.method2106(-1, var10));
                    var4.field6304[var5] = var15;
                }
            } catch (ClassNotFoundException var20) {
                var4.field6305[var5] = -1;
            } catch (SecurityException var21) {
                var4.field6305[var5] = -2;
            } catch (NullPointerException var22) {
                var4.field6305[var5] = -3;
            } catch (Exception var23) {
                var4.field6305[var5] = -4;
            } catch (Throwable var24) {
                var4.field6305[var5] = -5;
            }
        }
        class146.field1975.method2484(0, var4);
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(IIIII)V")
    public static final void method870(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg3 != 262144) {
            method865((byte) -105);
        }
        field1691++;
        if (arg0 >= class9.field128 && arg0 <= class63.field838) {
            int var5 = class382.method2423(arg4, class146.field1978, 45, class248.field3659);
            int var6 = class382.method2423(arg2, class146.field1978, 83, class248.field3659);
            class196.method1365(true, arg1, var6, arg0, var5);
        }
    }

    static {
        for (int var0 = 0; var0 < 4096; var0++) {
            field1690[var0] = class75.method527((byte) -40, var0);
        }
        field1713 = new byte[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };
        field1709 = new class24(47, -1);
        field1719 = new class304();
        field1720 = 1400;
    }
}
