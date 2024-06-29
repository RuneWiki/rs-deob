import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gw")
public class class156 implements class486 {

    @OriginalMember(owner = "client!gw", name = "h", descriptor = "Lli;")
    private class390 field1744 = new class390(256);

    @OriginalMember(owner = "client!gw", name = "d", descriptor = "Ljo;")
    private class303 field1740;

    @OriginalMember(owner = "client!gw", name = "o", descriptor = "Ljo;")
    private class303 field1751;

    @OriginalMember(owner = "client!gw", name = "k", descriptor = "I")
    private int field1747;

    @OriginalMember(owner = "client!gw", name = "n", descriptor = "[Ltd;")
    private class414[] field1750;

    @OriginalMember(owner = "client!gw", name = "t", descriptor = "[I")
    public static int[] field1756 = new int[8];

    @OriginalMember(owner = "client!gw", name = "c", descriptor = "Lgs;")
    public static class41 field1739 = new class41("WTWIP", 3);

    @OriginalMember(owner = "client!gw", name = "a", descriptor = "I")
    public static int field1737;

    @OriginalMember(owner = "client!gw", name = "b", descriptor = "I")
    public static int field1738;

    @OriginalMember(owner = "client!gw", name = "e", descriptor = "I")
    public static int field1741;

    @OriginalMember(owner = "client!gw", name = "f", descriptor = "I")
    public static int field1742;

    @OriginalMember(owner = "client!gw", name = "g", descriptor = "I")
    public static int field1743;

    @OriginalMember(owner = "client!gw", name = "i", descriptor = "I")
    public static int field1745;

    @OriginalMember(owner = "client!gw", name = "j", descriptor = "I")
    public static int field1746;

    @OriginalMember(owner = "client!gw", name = "l", descriptor = "I")
    public static int field1748;

    @OriginalMember(owner = "client!gw", name = "m", descriptor = "I")
    public static int field1749;

    @OriginalMember(owner = "client!gw", name = "p", descriptor = "I")
    public static int field1752;

    @OriginalMember(owner = "client!gw", name = "q", descriptor = "I")
    public static int field1753;

    @OriginalMember(owner = "client!gw", name = "r", descriptor = "I")
    public static int field1754;

    @OriginalMember(owner = "client!gw", name = "s", descriptor = "[[I")
    public static int[][] field1755;

    @OriginalMember(owner = "client!gw", name = "a", descriptor = "(II)Z", line = 3)
    public final boolean method843(int arg0, int arg1) {
        field1746++;
        class379 var3 = this.method849(true, arg0);
        if (arg1 == 31340) {
            return var3 != null && var3.method2074((byte) -62, this, this.field1740);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!gw", name = "a", descriptor = "(Lss;I)V", line = 17)
    public static final void method844(class393 arg0, int arg1) {
        if (arg1 >= -19) {
            return;
        }
        field1752++;
        arg0.field5230 = null;
        if (class559.field7963 < 20) {
            class44.field498.method87(111, arg0);
            class559.field7963++;
        }
    }

    @OriginalMember(owner = "client!gw", name = "a", descriptor = "(IFIZIZ)[I", line = 37)
    public final int[] method845(int arg0, float arg1, int arg2, boolean arg3, int arg4, boolean arg5) {
        field1754++;
        if (!arg3) {
            method852(null, 50, null);
        }
        return this.method849(true, arg0).method2079((double) arg1, this.field1750[arg0].field5493, this.field1740, arg2, (byte) 35, this, arg4);
    }

    @OriginalMember(owner = "client!gw", name = "a", descriptor = "(BI)Ltd;", line = 50)
    public final class414 method846(byte arg0, int arg1) {
        field1753++;
        if (arg0 > -101) {
            field1739 = null;
        }
        return this.field1750[arg1];
    }

    @OriginalMember(owner = "client!gw", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;)V", line = 65)
    public static final void method847(String arg0, int arg1, String arg2) {
        class347.field4526 = arg1;
        class19.field176 = 1;
        field1745++;
        class363.method1993(arg0, false, arg2, 90);
    }

    @OriginalMember(owner = "client!gw", name = "a", descriptor = "(I)V", line = 75)
    public static final void method848(int arg0) {
        field1738++;
        int var1 = 85 / ((25 - arg0) / 59);
        if (class267.field3364 == 0) {
            return;
        }
        try {
            if ((++class98.field1077) > 2000) {
                if (class170.field2043 != null) {
                    class170.field2043.method1642(-1);
                    class170.field2043 = null;
                }
                if (class664.field9436 >= 2) {
                    class377.field4898 = -5;
                    class267.field3364 = 0;
                    return;
                }
                class255.field3257.method1746(0);
                class98.field1077 = 0;
                class267.field3364 = 1;
                class664.field9436++;
            }
            if (class267.field3364 == 1) {
                class553.field7886 = class255.field3257.method1743((byte) -118, class623.field8837);
                class267.field3364 = 2;
            }
            if (class267.field3364 == 2) {
                if (class553.field7886.field2437 == 2) {
                    throw new IOException();
                }
                if (class553.field7886.field2437 != 1) {
                    return;
                }
                class170.field2043 = class57.method389(false, 5000, (Socket) class553.field7886.field2434);
                class553.field7886 = null;
                class170.field2043.method1641(-32754, 0, class334.field4314.field6215, class334.field4314.field6209);
                class267.field3364 = 4;
            }
            if (class267.field3364 == 4) {
                if (!class170.field2043.method1644(1, 12)) {
                    return;
                }
                class170.field2043.method1640(class680.field9630.field6209, 0, 1, 12);
                int var2 = class680.field9630.field6209[0] & 0xFF;
                if (var2 != 21) {
                    class267.field3364 = 0;
                    class377.field4898 = var2;
                    class170.field2043.method1642(-1);
                    class170.field2043 = null;
                    return;
                }
                class267.field3364 = 5;
            }
            if (class267.field3364 == 5) {
                if (!class170.field2043.method1644(1, 12)) {
                    return;
                }
                class170.field2043.method1640(class680.field9630.field6209, 0, 1, 12);
                class552.field7872 = new String[class680.field9630.field6209[0] & 0xFF];
                class267.field3364 = 6;
            }
            if (class267.field3364 == 6 && class170.field2043.method1644(class552.field7872.length * 8, 12)) {
                class680.field9630.field6215 = 0;
                class170.field2043.method1640(class680.field9630.field6209, 0, class552.field7872.length * 8, 12);
                for (int var3 = 0; var3 < class552.field7872.length; var3++) {
                    class552.field7872[var3] = class9.method53(34820, class680.field9630.method2510((byte) 38));
                }
                class267.field3364 = 0;
                class377.field4898 = 21;
                class170.field2043.method1642(-1);
                class170.field2043 = null;
            }
        } catch (IOException var4) {
            if (class170.field2043 != null) {
                class170.field2043.method1642(-1);
                class170.field2043 = null;
            }
            if (class664.field9436 >= 2) {
                class267.field3364 = 0;
                class377.field4898 = -4;
            } else {
                class255.field3257.method1746(0);
                class664.field9436++;
                class98.field1077 = 0;
                class267.field3364 = 1;
            }
        }
    }

    @OriginalMember(owner = "client!gw", name = "a", descriptor = "(ZI)Lnv;", line = 216)
    private final class379 method849(boolean arg0, int arg1) {
        field1749++;
        class356 var3 = this.field1744.method2134(-719, (long) arg1);
        if (var3 != null) {
            return (class379) var3;
        } else if (arg0) {
            byte[] var4 = this.field1751.method1722(arg1, 0);
            if (var4 == null) {
                return null;
            } else {
                class379 var5 = new class379(new class452(var4));
                this.field1744.method2129((byte) 110, var5, (long) arg1);
                return var5;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!gw", name = "a", descriptor = "(B)I", line = 241)
    public final int method850(byte arg0) {
        field1741++;
        int var2 = 92 % ((arg0 + 2) / 44);
        return this.field1747;
    }

    @OriginalMember(owner = "client!gw", name = "a", descriptor = "(ZFBIII)[F", line = 251)
    public final float[] method851(boolean arg0, float arg1, byte arg2, int arg3, int arg4, int arg5) {
        if (arg2 >= -69) {
            return null;
        } else {
            field1743++;
            return this.method849(true, arg3).method2075(this.field1750[arg3].field5493, arg5, arg4, this, this.field1740, -1576858206);
        }
    }

    @OriginalMember(owner = "client!gw", name = "a", descriptor = "([[BILnq;)V", line = 262)
    public static final void method852(byte[][] arg0, int arg1, class420 arg2) {
        field1737++;
        int var3 = class196.field2362.length;
        for (int var4 = 0; var4 < var3; var4++) {
            byte[] var5 = arg0[var4];
            if (var5 != null) {
                int var6 = (class287.field3696[var4] >> 8) * 64 - class682.field9685;
                int var7 = (class287.field3696[var4] & 0xFF) * 64 - class146.field1642;
                class73.method470((byte) 84);
                arg2.method2276(var6, class453.field6284, var5, class475.field6919, -1, var7);
            }
        }
        if (arg1 >= -101) {
            field1756 = null;
        }
    }

    @OriginalMember(owner = "client!gw", name = "b", descriptor = "(B)V", line = 301)
    public static void method853(byte arg0) {
        field1756 = null;
        if (arg0 == -36) {
            field1755 = null;
            field1739 = null;
        }
    }

    @OriginalMember(owner = "client!gw", name = "<init>", descriptor = "(Ljo;Ljo;Ljo;)V", line = 328)
    public class156(class303 arg0, class303 arg1, class303 arg2) {
        this.field1740 = arg2;
        this.field1751 = arg1;
        class452 var4 = new class452(arg0.method1719(0, 0, 4));
        this.field1747 = var4.method2574(-1758460248);
        this.field1750 = new class414[this.field1747];
        for (int var5 = 0; var5 < this.field1747; var5++) {
            if (var4.method2541(66) == 1) {
                this.field1750[var5] = new class414();
            }
        }
        for (int var6 = 0; var6 < this.field1747; var6++) {
            if (this.field1750[var6] != null) {
                this.field1750[var6].field5492 = var4.method2541(119) == 0;
            }
        }
        for (int var7 = 0; var7 < this.field1747; var7++) {
            if (this.field1750[var7] != null) {
                this.field1750[var7].field5481 = var4.method2541(64) == 1;
            }
        }
        for (int var8 = 0; var8 < this.field1747; var8++) {
            if (this.field1750[var8] != null) {
                this.field1750[var8].field5499 = var4.method2541(85) == 1;
            }
        }
        for (int var9 = 0; var9 < this.field1747; var9++) {
            if (this.field1750[var9] != null) {
                this.field1750[var9].field5498 = var4.method2541(87) == 1;
            }
        }
        for (int var10 = 0; var10 < this.field1747; var10++) {
            if (this.field1750[var10] != null) {
                this.field1750[var10].field5482 = var4.method2547(true);
            }
        }
        for (int var11 = 0; var11 < this.field1747; var11++) {
            if (this.field1750[var11] != null) {
                this.field1750[var11].field5484 = var4.method2547(true);
            }
        }
        for (int var12 = 0; var12 < this.field1747; var12++) {
            if (this.field1750[var12] != null) {
                this.field1750[var12].field5486 = var4.method2547(true);
            }
        }
        for (int var13 = 0; var13 < this.field1747; var13++) {
            if (this.field1750[var13] != null) {
                this.field1750[var13].field5483 = var4.method2547(true);
            }
        }
        for (int var14 = 0; var14 < this.field1747; var14++) {
            if (this.field1750[var14] != null) {
                this.field1750[var14].field5480 = (short) var4.method2574(-1758460248);
            }
        }
        for (int var15 = 0; var15 < this.field1747; var15++) {
            if (this.field1750[var15] != null) {
                this.field1750[var15].field5491 = var4.method2547(true);
            }
        }
        for (int var16 = 0; var16 < this.field1747; var16++) {
            if (this.field1750[var16] != null) {
                this.field1750[var16].field5501 = var4.method2547(true);
            }
        }
        for (int var17 = 0; var17 < this.field1747; var17++) {
            if (this.field1750[var17] != null) {
                this.field1750[var17].field5489 = var4.method2541(90) == 1;
            }
        }
        for (int var18 = 0; var18 < this.field1747; var18++) {
            if (this.field1750[var18] != null) {
                this.field1750[var18].field5493 = var4.method2541(113) == 1;
            }
        }
        for (int var19 = 0; var19 < this.field1747; var19++) {
            if (this.field1750[var19] != null) {
                this.field1750[var19].field5497 = var4.method2547(true);
            }
        }
        for (int var20 = 0; var20 < this.field1747; var20++) {
            if (this.field1750[var20] != null) {
                this.field1750[var20].field5494 = var4.method2541(93) == 1;
            }
        }
        for (int var21 = 0; var21 < this.field1747; var21++) {
            if (this.field1750[var21] != null) {
                this.field1750[var21].field5490 = var4.method2541(44) == 1;
            }
        }
        for (int var22 = 0; var22 < this.field1747; var22++) {
            if (this.field1750[var22] != null) {
                this.field1750[var22].field5485 = var4.method2541(113) == 1;
            }
        }
        for (int var23 = 0; var23 < this.field1747; var23++) {
            if (this.field1750[var23] != null) {
                this.field1750[var23].field5495 = var4.method2541(97);
            }
        }
        for (int var24 = 0; var24 < this.field1747; var24++) {
            if (this.field1750[var24] != null) {
                this.field1750[var24].field5488 = var4.method2575((byte) -48);
            }
        }
        for (int var25 = 0; var25 < this.field1747; var25++) {
            if (this.field1750[var25] != null) {
                this.field1750[var25].field5496 = var4.method2541(88) == 1;
            }
        }
    }

    @OriginalMember(owner = "client!gw", name = "a", descriptor = "(FIZIII)[I", line = 318)
    public final int[] method854(float arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
        field1742++;
        if (arg1 != -4476) {
            field1756 = null;
        }
        return this.method849(true, arg4).method2076((double) arg0, arg2, arg3, this, arg5, this.field1740, 255, this.field1750[arg4].field5493);
    }
}
