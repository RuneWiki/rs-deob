import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sl")
public class class99 extends class95 {

    @OriginalMember(owner = "client!sl", name = "R", descriptor = "Lsf;")
    private class108 field1745 = class14.field179;

    @OriginalMember(owner = "client!sl", name = "O", descriptor = "Lsf;")
    public static class108 field1742 = class140.method973(255, ":allyreq:");

    @OriginalMember(owner = "client!sl", name = "W", descriptor = "Lhe;")
    public static class94 field1750 = new class94(64);

    @OriginalMember(owner = "client!sl", name = "eb", descriptor = "Z")
    public static boolean field1758 = true;

    @OriginalMember(owner = "client!sl", name = "H", descriptor = "I")
    public static int field1736;

    @OriginalMember(owner = "client!sl", name = "I", descriptor = "I")
    public int field1737;

    @OriginalMember(owner = "client!sl", name = "K", descriptor = "I")
    public static int field1738;

    @OriginalMember(owner = "client!sl", name = "L", descriptor = "I")
    public static int field1739;

    @OriginalMember(owner = "client!sl", name = "N", descriptor = "I")
    public static int field1741;

    @OriginalMember(owner = "client!sl", name = "P", descriptor = "I")
    public static int field1743;

    @OriginalMember(owner = "client!sl", name = "Q", descriptor = "I")
    public static int field1744;

    @OriginalMember(owner = "client!sl", name = "S", descriptor = "I")
    public int field1746;

    @OriginalMember(owner = "client!sl", name = "T", descriptor = "I")
    public static int field1747;

    @OriginalMember(owner = "client!sl", name = "X", descriptor = "I")
    public static int field1751;

    @OriginalMember(owner = "client!sl", name = "Y", descriptor = "I")
    public static int field1752;

    @OriginalMember(owner = "client!sl", name = "Z", descriptor = "I")
    public static int field1753;

    @OriginalMember(owner = "client!sl", name = "ab", descriptor = "I")
    public static int field1754;

    @OriginalMember(owner = "client!sl", name = "bb", descriptor = "I")
    public static int field1755;

    @OriginalMember(owner = "client!sl", name = "cb", descriptor = "I")
    private int field1756;

    @OriginalMember(owner = "client!sl", name = "db", descriptor = "I")
    public static int field1757;

    @OriginalMember(owner = "client!sl", name = "V", descriptor = "Lvc;")
    public static class193 field1749;

    @OriginalMember(owner = "client!sl", name = "M", descriptor = "Lof;")
    private class242 field1740;

    @OriginalMember(owner = "client!sl", name = "U", descriptor = "Lof;")
    public class242 field1748;

    @OriginalMember(owner = "client!sl", name = "fb", descriptor = "[[[Lje;")
    public static class74[][][] field1759;

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(IB)Z", line = 4)
    public final boolean method681(int arg0, byte arg1) {
        field1738++;
        if (this.field1748 == null) {
            return false;
        } else if (arg1 < 116) {
            return true;
        } else {
            if (this.field1740 == null) {
                this.method694(99);
            }
            class236 var3 = (class236) this.field1740.method1676((long) arg0, (byte) -101);
            return var3 != null;
        }
    }

    @OriginalMember(owner = "client!sl", name = "c", descriptor = "(I)V", line = 28)
    public static final void method682(int arg0) {
        field1743++;
        if (arg0 != 0) {
            method691(-110, 74, (class98) null);
        }
        class13.field145.method639(-71);
        class74.field1115.method639(-117);
        class272.field4753.method639(-42);
    }

    @OriginalMember(owner = "client!sl", name = "c", descriptor = "(II)I", line = 43)
    public final int method683(int arg0, int arg1) {
        if (arg1 != 0) {
            this.field1756 = 9;
        }
        field1755++;
        if (this.field1748 == null) {
            return this.field1756;
        } else {
            class236 var3 = (class236) this.field1748.method1676((long) arg0, (byte) -103);
            return var3 == null ? this.field1756 : var3.field4144;
        }
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(Lqj;II)V", line = 66)
    public static final void method684(class256 arg0, int arg1, int arg2) {
        if (class116.field2000 < arg0.field4519) {
            class276.method1989(64, arg0);
        } else if (arg0.field4503 < class116.field2000) {
            class317.method2203(14, arg0);
        } else {
            class269.method1944((byte) 126, arg0);
        }
        field1747++;
        if (arg0.field4452 < 128 || arg0.field4457 < 128 || arg0.field4452 >= 13184 || arg0.field4457 >= 13184) {
            arg0.field4492 = -1;
            arg0.field4500 = -1;
            arg0.field4519 = 0;
            arg0.field4503 = 0;
            arg0.field4452 = arg0.field4498[0] * 128 + arg0.method363((byte) 121) * 64;
            arg0.field4457 = arg0.field4482[0] * 128 + arg0.method363((byte) -111) * 64;
            arg0.method1806((byte) 40);
        }
        if (class95.field1513 == arg0 && (arg0.field4452 < 1536 || arg0.field4457 < 1536 || arg0.field4452 >= 11776 || arg0.field4457 >= 11776)) {
            arg0.field4519 = 0;
            arg0.field4503 = 0;
            arg0.field4500 = -1;
            arg0.field4492 = -1;
            arg0.field4452 = arg0.field4498[0] * 128 + arg0.method363((byte) 81) * 64;
            arg0.field4457 = arg0.field4482[0] * 128 + arg0.method363((byte) -30) * 64;
            arg0.method1806((byte) 40);
        }
        if (arg2 != 12869) {
            method684((class256) null, 44, 33);
        }
        class38.method258(false, arg0);
        class121.method849((byte) -121, arg0);
    }

    @OriginalMember(owner = "client!sl", name = "d", descriptor = "(B)V", line = 119)
    public static void method685(byte arg0) {
        if (arg0 == -25) {
            field1759 = (class74[][][]) null;
            field1749 = null;
            field1742 = null;
            field1750 = null;
        }
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(Lrm;IZ)V", line = 133)
    private final void method686(class249 arg0, int arg1, boolean arg2) {
        field1736++;
        if (arg1 == 1) {
            this.field1737 = arg0.method1731(true);
        } else if (arg1 == 2) {
            this.field1746 = arg0.method1731(!arg2);
        } else if (arg1 == 3) {
            this.field1745 = arg0.method1740(true);
        } else if (arg1 == 4) {
            this.field1756 = arg0.method1738(-1756395344);
        } else if (arg1 == 5 || arg1 == 6) {
            int var4 = arg0.method1712(-1);
            this.field1748 = new class242(class117.method832(var4, (byte) 103));
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg0.method1738(-1756395344);
                class184 var7;
                if (arg1 == 5) {
                    var7 = new class324(arg0.method1740(true));
                } else {
                    var7 = new class236(arg0.method1738(-1756395344));
                }
                this.field1748.method1681(1, var7, (long) var6);
            }
        }
        if (arg2) {
            this.field1745 = (class108) null;
        }
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(ILrm;)V", line = 196)
    public final void method687(int arg0, class249 arg1) {
        while (true) {
            int var3 = arg1.method1731(true);
            if (var3 == 0) {
                if (arg0 != 1) {
                    method691(-100, -28, (class98) null);
                }
                field1752++;
                return;
            }
            this.method686(arg1, var3, false);
        }
    }

    @OriginalMember(owner = "client!sl", name = "d", descriptor = "(II)Lsf;", line = 214)
    public final class108 method688(int arg0, int arg1) {
        field1753++;
        if (this.field1748 == null) {
            return this.field1745;
        }
        class324 var3 = (class324) this.field1748.method1676((long) arg1, (byte) -64);
        if (var3 == null) {
            return this.field1745;
        } else {
            if (arg0 >= -4) {
                this.method687(-122, (class249) null);
            }
            return var3.field5532;
        }
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(IIIZ)Lsf;", line = 235)
    public static final class108 method689(int arg0, int arg1, int arg2, boolean arg3) {
        field1739++;
        if (arg0 < 2 || arg0 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg0);
        }
        int var4 = 1;
        int var5 = arg2 / arg0;
        while (var5 != 0) {
            var5 /= arg0;
            var4++;
        }
        int var6 = var4;
        if (arg2 < 0 || arg3) {
            var6 = var4 + 1;
        }
        byte[] var7 = new byte[var6];
        if (arg2 < 0) {
            var7[0] = 45;
        } else if (arg3) {
            var7[0] = 43;
        }
        if (arg1 > -68) {
            field1759 = (class74[][][]) ((class74[][][]) null);
        }
        for (int var8 = 0; var8 < var4; var8++) {
            int var9 = arg2 % arg0;
            arg2 /= arg0;
            if (var9 < 0) {
                var9 = -var9;
            }
            if (var9 > 9) {
                var9 += 39;
            }
            var7[var6 - var8 - 1] = (byte) (var9 + 48);
        }
        class108 var10 = new class108();
        var10.field1884 = var7;
        var10.field1870 = var6;
        return var10;
    }

    @OriginalMember(owner = "client!sl", name = "d", descriptor = "(I)V", line = 299)
    private final void method690(int arg0) {
        if (arg0 > -89) {
            this.method694(-78);
        }
        field1741++;
        this.field1740 = new class242(this.field1748.method1680(0));
        for (class324 var2 = (class324) this.field1748.method1672(0); var2 != null; var2 = (class324) this.field1748.method1678(-128)) {
            class198 var3 = new class198(var2.field5532, (int) var2.field3375);
            this.field1740.method1681(1, var3, var2.field5532.method773(true));
        }
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(IILca;)I", line = 322)
    public static final int method691(int arg0, int arg1, class98 arg2) {
        field1754++;
        if (arg2.field1642 == null || arg2.field1642.length <= arg1) {
            return -2;
        }
        try {
            int[] var3 = arg2.field1642[arg1];
            int var4 = 0;
            int var5 = arg0;
            byte var6 = 0;
            while (true) {
                int var7 = var3[var4++];
                int var8 = 0;
                byte var9 = 0;
                if (var7 == 0) {
                    return var5;
                }
                if (var7 == 15) {
                    var9 = 1;
                }
                if (var7 == 16) {
                    var9 = 2;
                }
                if (var7 == 1) {
                    var8 = class329.field5627[var3[var4++]];
                }
                if (var7 == 17) {
                    var9 = 3;
                }
                if (var7 == 2) {
                    var8 = class307.field5345[var3[var4++]];
                }
                if (var7 == 3) {
                    var8 = class299.field5199[var3[var4++]];
                }
                if (var7 == 4) {
                    int var10 = var3[var4++] << 16;
                    int var11 = var10 + var3[var4++];
                    class98 var12 = class168.method1173(var11, -1456948048);
                    int var13 = var3[var4++];
                    if (var13 != -1 && (!class144.method994(true, var13).field2583 || class293.field5130)) {
                        for (int var14 = 0; var14 < var12.field1575.length; var14++) {
                            if ((var13 + 1) == var12.field1575[var14]) {
                                var8 += var12.field1671[var14];
                            }
                        }
                    }
                }
                if (var7 == 5) {
                    var8 = class261.field4594[var3[var4++]];
                }
                if (var7 == 6) {
                    var8 = class283.field4945[class307.field5345[var3[var4++]] - 1];
                }
                if (var7 == 7) {
                    var8 = class261.field4594[var3[var4++]] * 100 / 46875;
                }
                if (var7 == 8) {
                    var8 = class95.field1513.field720;
                }
                if (var7 == 9) {
                    for (int var15 = 0; var15 < 25; var15++) {
                        if (class15.field192[var15]) {
                            var8 += class307.field5345[var15];
                        }
                    }
                }
                if (var7 == 10) {
                    int var16 = var3[var4++] << 16;
                    int var17 = var16 + var3[var4++];
                    class98 var18 = class168.method1173(var17, -1456948048);
                    int var19 = var3[var4++];
                    if (var19 != -1 && (!class144.method994(true, var19).field2583 || class293.field5130)) {
                        for (int var20 = 0; var20 < var18.field1575.length; var20++) {
                            if (var19 + 1 == var18.field1575[var20]) {
                                var8 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var7 == 11) {
                    var8 = class126.field2143;
                }
                if (var7 == 12) {
                    var8 = class239.field4167;
                }
                if (var7 == 13) {
                    int var21 = class261.field4594[var3[var4++]];
                    int var22 = var3[var4++];
                    var8 = (var21 & 0x1 << var22) == 0 ? 0 : 1;
                }
                if (var7 == 14) {
                    int var23 = var3[var4++];
                    var8 = class304.method2135(var23, 427495308);
                }
                if (var7 == 18) {
                    var8 = (class95.field1513.field4452 >> 7) + class305.field5295;
                }
                if (var7 == 19) {
                    var8 = (class95.field1513.field4457 >> 7) + class137.field2421;
                }
                if (var7 == 20) {
                    var8 = var3[var4++];
                }
                if (var9 == 0) {
                    if (var6 == 0) {
                        var5 += var8;
                    }
                    if (var6 == 1) {
                        var5 -= var8;
                    }
                    if (var6 == 2 && var8 != 0) {
                        var5 /= var8;
                    }
                    if (var6 == 3) {
                        var5 *= var8;
                    }
                    var6 = 0;
                } else {
                    var6 = var9;
                }
            }
        } catch (Exception var25) {
            return -1;
        }
    }

    @OriginalMember(owner = "client!sl", name = "e", descriptor = "(I)Z", line = 523)
    public static final boolean method692(int arg0) {
        field1744++;
        if (class305.field5312 == 0) {
            if (arg0 <= 114) {
                method685((byte) -43);
            }
            return class324.field5531.method1219(-58);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(ILsf;)Z", line = 549)
    public final boolean method693(int arg0, class108 arg1) {
        field1757++;
        if (this.field1748 == null) {
            return false;
        }
        if (this.field1740 == null) {
            this.method690(arg0 - 121);
        }
        if (arg0 != 0) {
            field1742 = (class108) null;
        }
        for (class198 var3 = (class198) this.field1740.method1676(arg1.method773(true), (byte) -87); var3 != null; var3 = (class198) this.field1740.method1677((byte) -117)) {
            if (var3.field3566.method779(arg1, 101)) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!sl", name = "f", descriptor = "(I)V", line = 581)
    private final void method694(int arg0) {
        if (arg0 <= 19) {
            this.field1740 = (class242) null;
        }
        this.field1740 = new class242(this.field1748.method1680(0));
        field1751++;
        for (class236 var2 = (class236) this.field1748.method1672(0); var2 != null; var2 = (class236) this.field1748.method1678(111)) {
            class236 var3 = new class236((int) var2.field3375);
            this.field1740.method1681(1, var3, (long) var2.field4144);
        }
    }
}
