import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cf")
public class class91 {

    @OriginalMember(owner = "client!cf", name = "m", descriptor = "I")
    public int field1724;

    @OriginalMember(owner = "client!cf", name = "q", descriptor = "[B")
    public byte[] field1728;

    @OriginalMember(owner = "client!cf", name = "i", descriptor = "[S")
    public short[] field1720;

    @OriginalMember(owner = "client!cf", name = "s", descriptor = "[I")
    public int[] field1730;

    @OriginalMember(owner = "client!cf", name = "r", descriptor = "[Lhj;")
    public class69[] field1729;

    @OriginalMember(owner = "client!cf", name = "f", descriptor = "[S")
    public short[] field1717;

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "Z")
    public static boolean field1712 = true;

    @OriginalMember(owner = "client!cf", name = "c", descriptor = "Lhj;")
    public static class69 field1714 = class181.method1318("::rect_debug", (byte) -124);

    @OriginalMember(owner = "client!cf", name = "j", descriptor = "Lhj;")
    public static class69 field1721 = class181.method1318("(U(Y", (byte) -110);

    @OriginalMember(owner = "client!cf", name = "o", descriptor = "I")
    public static int field1726 = 127;

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "I")
    public static int field1713 = 0;

    @OriginalMember(owner = "client!cf", name = "n", descriptor = "[I")
    public static int[] field1725 = new int[] { 2, 2, 4, 2, 1, 8, 4, 1, 4, 4, 2 };

    @OriginalMember(owner = "client!cf", name = "p", descriptor = "I")
    public static int field1727 = 0;

    @OriginalMember(owner = "client!cf", name = "d", descriptor = "I")
    public static int field1715;

    @OriginalMember(owner = "client!cf", name = "e", descriptor = "I")
    public static int field1716;

    @OriginalMember(owner = "client!cf", name = "g", descriptor = "I")
    public static int field1718;

    @OriginalMember(owner = "client!cf", name = "h", descriptor = "I")
    public static int field1719;

    @OriginalMember(owner = "client!cf", name = "k", descriptor = "I")
    public static int field1722;

    @OriginalMember(owner = "client!cf", name = "l", descriptor = "Lnc;")
    public static class83 field1723;

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(IB)Z")
    public final boolean method643(int arg0, byte arg1) {
        if (arg1 <= 55) {
            method645((class69) null, (byte) 25);
        }
        field1716++;
        return (this.field1728[arg0] & 0x4) != 0;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "([Lgi;BII)V")
    public static final void method644(class152[] arg0, byte arg1, int arg2, int arg3) {
        if (arg1 != 46) {
            return;
        }
        if (arg2 < arg3) {
            int var4 = arg2 - 1;
            int var5 = arg3 + 1;
            int var6 = (arg2 + arg3) / 2;
            class152 var7 = arg0[var6];
            arg0[var6] = arg0[arg2];
            arg0[arg2] = var7;
            while (var5 > var4) {
                boolean var8 = true;
                do {
                    var5--;
                    for (int var9 = 0; var9 < 4; var9++) {
                        int var10;
                        int var11;
                        if (class106.field2003[var9] == 2) {
                            var10 = arg0[var5].field2830;
                            var11 = var7.field2830;
                        } else if (class106.field2003[var9] == 1) {
                            var10 = arg0[var5].field2839;
                            if (var10 == -1 && class43.field621[var9] == 1) {
                                var10 = 2001;
                            }
                            var11 = var7.field2839;
                            if (var11 == -1 && class43.field621[var9] == 1) {
                                var11 = 2001;
                            }
                        } else if (class106.field2003[var9] == 3) {
                            var10 = arg0[var5].field2838 ? 1 : 0;
                            var11 = var7.field2838 ? 1 : 0;
                        } else {
                            var10 = arg0[var5].field2832;
                            var11 = var7.field2832;
                        }
                        if (var10 != var11) {
                            if ((class43.field621[var9] != 1 || var11 >= var10) && (class43.field621[var9] != 0 || var10 >= var11)) {
                                var8 = false;
                            }
                            break;
                        }
                        if (var9 == 3) {
                            var8 = false;
                        }
                    }
                } while (var8);
                boolean var12 = true;
                do {
                    var4++;
                    for (int var13 = 0; var13 < 4; var13++) {
                        int var14;
                        int var15;
                        if (class106.field2003[var13] == 2) {
                            var14 = arg0[var4].field2830;
                            var15 = var7.field2830;
                        } else if (class106.field2003[var13] == 1) {
                            var15 = var7.field2839;
                            var14 = arg0[var4].field2839;
                            if (var14 == -1 && class43.field621[var13] == 1) {
                                var14 = 2001;
                            }
                            if (var15 == -1 && class43.field621[var13] == 1) {
                                var15 = 2001;
                            }
                        } else if (class106.field2003[var13] == 3) {
                            var14 = arg0[var4].field2838 ? 1 : 0;
                            var15 = var7.field2838 ? 1 : 0;
                        } else {
                            var14 = arg0[var4].field2832;
                            var15 = var7.field2832;
                        }
                        if (var14 != var15) {
                            if ((class43.field621[var13] != 1 || var14 >= var15) && (class43.field621[var13] != 0 || var15 >= var14)) {
                                var12 = false;
                            }
                            break;
                        }
                        if (var13 == 3) {
                            var12 = false;
                        }
                    }
                } while (var12);
                if (var4 < var5) {
                    class152 var16 = arg0[var4];
                    arg0[var4] = arg0[var5];
                    arg0[var5] = var16;
                }
            }
            method644(arg0, (byte) 46, arg2, var5);
            method644(arg0, (byte) 46, var5 + 1, arg3);
        }
        field1715++;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(Lhj;B)V")
    public static final void method645(class69 arg0, byte arg1) {
        field1719++;
        int var2 = class3.method8(arg0, -1);
        if (var2 == -1) {
            return;
        }
        class4.field32 = class61.field1117.field1717[var2] - class250.field4539;
        class109.field2089 = -class61.field1117.field1720[var2] - (-class209.field3806 - (class22.field306 - 1));
        int var3 = (int) ((float) class157.field2918.field798 / class93.field1741) + class4.field32;
        int var4 = class109.field2089 - ((int) ((float) class157.field2918.field727 / class93.field1741));
        if (arg1 <= 81) {
            method646(-66, -112, -106, 79, -112, (byte[][][]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, -39, (byte) -6, -43, -115);
        }
        int var5 = (int) ((float) class157.field2918.field727 / class93.field1741) + class109.field2089;
        int var6 = class4.field32 - ((int) ((float) class157.field2918.field798 / class93.field1741));
        if (var6 < 0) {
            class4.field32 = (int) ((float) class157.field2918.field798 / class93.field1741);
        }
        if (var4 < 0) {
            class109.field2089 = (int) ((float) class157.field2918.field727 / class93.field1741);
        }
        if (var5 > class22.field306) {
            class109.field2089 = class22.field306 - (int) ((float) class157.field2918.field727 / class93.field1741);
        }
        if (var3 > class84.field1626) {
            class4.field32 = class84.field1626 - ((int) ((float) class157.field2918.field798 / class93.field1741));
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(IIIII[[[B[I[I[I[I[IIBII)V")
    public static final void method646(int arg0, int arg1, int arg2, int arg3, int arg4, byte[][][] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int arg11, byte arg12, int arg13, int arg14) {
        if (arg0 < 0) {
            arg0 = 0;
        } else if (arg0 >= class109.field2091 * 128) {
            arg0 = class109.field2091 * 128 - 1;
        }
        if (arg2 < 0) {
            arg2 = 0;
        } else if (arg2 >= class146.field2694 * 128) {
            arg2 = class146.field2694 * 128 - 1;
        }
        class48.field698 = class178.field3247[arg3];
        class80.field1532 = class178.field3232[arg3];
        class157.field2927 = class178.field3247[arg4];
        class130.field2421 = class178.field3232[arg4];
        class108.field2050 = arg0;
        class79.field1526 = arg1;
        class88.field1673 = arg2;
        class78.field1496 = arg0 / 128;
        class45.field646 = arg2 / 128;
        class217.field3926 = class78.field1496 - class53.field950;
        if (class217.field3926 < 0) {
            class217.field3926 = 0;
        }
        class268.field4772 = class45.field646 - class53.field950;
        if (class268.field4772 < 0) {
            class268.field4772 = 0;
        }
        class105.field1984 = class78.field1496 + class53.field950;
        if (class105.field1984 > class109.field2091) {
            class105.field1984 = class109.field2091;
        }
        class182.field3322 = class53.field950 + class45.field646;
        if (class182.field3322 > class146.field2694) {
            class182.field3322 = class146.field2694;
        }
        short var15 = 3500;
        for (int var16 = 0; var16 < class53.field950 + class53.field950 + 2; var16++) {
            for (int var19 = 0; var19 < class53.field950 + class53.field950 + 2; var19++) {
                int var20 = (var16 - class53.field950 << 7) - (class108.field2050 & 0x7F);
                int var21 = (var19 - class53.field950 << 7) - (class88.field1673 & 0x7F);
                int var22 = class78.field1496 + var16 - class53.field950;
                int var23 = class45.field646 + var19 - class53.field950;
                if (var22 >= 0 && var23 >= 0 && var22 < class109.field2091 && var23 < class146.field2694) {
                    int var24;
                    if (class263.field4673 == null) {
                        var24 = class31.field429[0][var22][var23] + 128 - class79.field1526;
                    } else {
                        var24 = class263.field4673[0][var22][var23] + 128 - class79.field1526;
                    }
                    int var25 = class31.field429[3][var22][var23] - class79.field1526 - 1000;
                    class181.field3296[var16][var19] = class3.method11(var20, var25, var24, var21, var15);
                } else {
                    class181.field3296[var16][var19] = false;
                }
            }
        }
        for (int var17 = 0; var17 < class53.field950 + class53.field950 + 1; var17++) {
            for (int var18 = 0; var18 < class53.field950 + class53.field950 + 1; var18++) {
                class186.field3348[var17][var18] = class181.field3296[var17][var18] || class181.field3296[var17 + 1][var18] || class181.field3296[var17][var18 + 1] || class181.field3296[var17 + 1][var18 + 1];
            }
        }
        class254.field4580 = arg6;
        class48.field702 = arg7;
        class224.field4077 = arg8;
        class163.field3013 = arg9;
        client.field2808 = arg10;
        class188.method1369();
        class104.method774(arg0, arg1, arg2, arg5, arg11, arg12, arg13, arg14);
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(B)V")
    public static void method647(byte arg0) {
        field1725 = null;
        if (arg0 != 124) {
            field1726 = 117;
        }
        field1721 = null;
        field1714 = null;
        field1723 = null;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(II)I")
    public final int method648(int arg0, int arg1) {
        if (arg1 != 13326) {
            field1714 = null;
        }
        field1722++;
        return this.field1728[arg0] & 0x3;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(Lhj;II)V")
    public static final void method649(class69 arg0, int arg1, int arg2) {
        class78.field1512++;
        class48.field692.method301(106, -104);
        field1718++;
        if (arg2 == 0) {
            class48.field692.method933(arg1, -20946);
            class48.field692.method958(-4907, arg0.method473((byte) 93));
        }
    }

    @OriginalMember(owner = "client!cf", name = "<init>", descriptor = "(I)V")
    public class91(int arg0) {
        this.field1724 = arg0;
        this.field1728 = new byte[this.field1724];
        this.field1720 = new short[this.field1724];
        this.field1730 = new int[this.field1724];
        this.field1729 = new class69[this.field1724];
        this.field1717 = new short[this.field1724];
    }
}
