import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ao")
public class class130 extends class3 {

    @OriginalMember(owner = "client!ao", name = "O", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field1979 = new CRC32();

    @OriginalMember(owner = "client!ao", name = "R", descriptor = "I")
    public static int field1982 = 0;

    @OriginalMember(owner = "client!ao", name = "S", descriptor = "I")
    public static int field1983 = 0;

    @OriginalMember(owner = "client!ao", name = "T", descriptor = "[Lkl;")
    public static class39[] field1984 = new class39[2048];

    @OriginalMember(owner = "client!ao", name = "G", descriptor = "I")
    public static int field1971;

    @OriginalMember(owner = "client!ao", name = "H", descriptor = "I")
    public static int field1972;

    @OriginalMember(owner = "client!ao", name = "I", descriptor = "I")
    public static int field1973;

    @OriginalMember(owner = "client!ao", name = "J", descriptor = "I")
    public static int field1974;

    @OriginalMember(owner = "client!ao", name = "K", descriptor = "I")
    public static int field1975;

    @OriginalMember(owner = "client!ao", name = "M", descriptor = "I")
    public static int field1977;

    @OriginalMember(owner = "client!ao", name = "N", descriptor = "I")
    public static int field1978;

    @OriginalMember(owner = "client!ao", name = "P", descriptor = "I")
    public static int field1980;

    @OriginalMember(owner = "client!ao", name = "Q", descriptor = "Lnm;")
    public static class221 field1981;

    @OriginalMember(owner = "client!ao", name = "L", descriptor = "[Lom;")
    private class171[] field1976;

    @OriginalMember(owner = "client!ao", name = "e", descriptor = "(I)V", line = 7)
    public static void method842(int arg0) {
        field1981 = null;
        int var1 = 106 / ((18 - arg0) / 53);
        field1979 = null;
        field1984 = null;
    }

    @OriginalMember(owner = "client!ao", name = "f", descriptor = "(I)V", line = 22)
    public static final void method843(int arg0) {
        class153.field2485 = 0;
        if (arg0 >= -64) {
            method843(104);
        }
        field1977++;
        class99.field1440 = 0;
        class142.method1008(65536);
        class65.method458((byte) 127);
        class295.method2090(23);
        for (int var1 = 0; var1 < class153.field2485; var1++) {
            int var2 = class292.field4846[var1];
            if (class58.field875 != class329.field5377[var2].field4743) {
                if (class329.field5377[var2].field3702.method985((byte) -92)) {
                    class146.method1043(128, class329.field5377[var2]);
                }
                class329.field5377[var2].method1610(-14884, (class139) null);
                class329.field5377[var2] = null;
            }
        }
        if (class201.field3091 != class159.field2552.field5137) {
            throw new RuntimeException("gnp1 pos:" + class159.field2552.field5137 + " psize:" + class201.field3091);
        }
        for (int var3 = 0; var3 < class294.field4892; var3++) {
            if (class329.field5377[class243.field3843[var3]] == null) {
                throw new RuntimeException("gnp2 pos:" + var3 + " size:" + class294.field4892);
            }
        }
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(II)[[I", line = 75)
    public final int[][] method22(int arg0, int arg1) {
        field1972++;
        if (arg0 != -21194) {
            field1983 = 68;
        }
        int[][] var3 = this.field20.method2435(arg1, false);
        if (this.field20.field5556) {
            int var4 = class326.field5342;
            int var5 = class308.field5010;
            int[][] var6 = new int[var5][var4];
            int[][][] var7 = this.field20.method2439(0);
            this.method845(var6, (byte) -128);
            for (int var8 = 0; var8 < class308.field5010; var8++) {
                int[] var9 = var6[var8];
                int[][] var10 = var7[var8];
                int[] var11 = var10[0];
                int[] var12 = var10[2];
                int[] var13 = var10[1];
                for (int var14 = 0; var14 < class326.field5342; var14++) {
                    int var15 = var9[var14];
                    var12[var14] = class235.method1623(255, var15) << 4;
                    var13[var14] = class235.method1623(65280, var15) >> 4;
                    var11[var14] = class235.method1623(4080, var15 >> 12);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ao", name = "g", descriptor = "(I)V", line = 141)
    public static final void method844(int arg0) {
        if (arg0 > -37) {
            field1983 = 127;
        }
        field1975++;
        class8.field104.method644((byte) -92);
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(BI)[I", line = 153)
    public final int[] method25(byte arg0, int arg1) {
        field1971++;
        if (arg0 <= 57) {
            return (int[]) null;
        }
        int[] var3 = this.field21.method1258(arg1, 0);
        if (this.field21.field2808) {
            this.method845(this.field21.method1259(-96), (byte) -98);
        }
        return var3;
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "([[IB)V", line = 177)
    private final void method845(int[][] arg0, byte arg1) {
        int var3 = class308.field5010;
        field1974++;
        int var4 = class326.field5342;
        client.method902(arg0, -27476);
        if (arg1 >= -85) {
            return;
        }
        class109.method722(12420, class5.field70, 0, 0, class129.field1970);
        if (this.field1976 == null) {
            return;
        }
        for (int var5 = 0; var5 < this.field1976.length; var5++) {
            class171 var6 = this.field1976[var5];
            int var7 = var6.field2672;
            int var8 = var6.field2667;
            if (var8 < 0) {
                if (var7 >= 0) {
                    var6.method236(var4, true, var3);
                }
            } else if (var7 < 0) {
                var6.method244(var3, (byte) 116, var4);
            } else {
                var6.method242(var3, var4, (byte) -115);
            }
        }
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(ZLjava/lang/String;)V", line = 224)
    public static final void method846(boolean arg0, String arg1) {
        field1978++;
        class219.field3370 = arg1;
        if (class96.field1382.field4515 == null) {
            return;
        }
        try {
            String var2 = class96.field1382.field4515.getParameter("cookieprefix");
            if (arg0) {
                field1979 = (CRC32) null;
            }
            String var3 = class96.field1382.field4515.getParameter("cookiehost");
            String var4 = var2 + "settings=" + arg1 + "; version=1; path=/; domain=" + var3;
            String var5;
            if (arg1.length() == 0) {
                var5 = var4 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
            } else {
                var5 = var4 + "; Expires=" + class190.method1312((byte) 64, class19.method122(-12169) + 94608000000L) + "; Max-Age=" + 94608000L;
            }
            class73.method501("document.cookie=\"" + var5 + "\"", class96.field1382.field4515, 59);
        } catch (Throwable var7) {
        }
    }

    @OriginalMember(owner = "client!ao", name = "<init>", descriptor = "()V", line = 261)
    public class130() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ao", name = "b", descriptor = "(II)V", line = 270)
    public static final void method847(int arg0, int arg1) {
        int var2 = class74.field1117;
        int var3 = class41.field625;
        field1973++;
        int var4 = class259.field4098;
        int var5 = class54.field817;
        int var6 = (int) class355.field5628 + class120.field1784 & 0x7FF;
        int var7 = class147.field2369;
        int var8 = (int) class285.field4676;
        if (var8 < (class199.field3067 / 256)) {
            var8 = class199.field3067 / 256;
        }
        if (class217.field3346[4] && var8 < (class325.field5329[4] + 128)) {
            var8 = class325.field5329[4] + 128;
        }
        class189.method1306(var8 * 3 + 600, client.method889(class329.field5388.field4796, class120.field1779, class329.field5388.field4783, -126) + -50, -465145744, var6, class249.field3957, var8, class343.field5516, arg0);
        if (class41.field625 == var3 && class74.field1117 == var2 && class259.field4098 == var4 && class54.field817 == var5 && class147.field2369 == var7) {
            class269.field4427 = 1;
            return;
        }
        class206.field3132 = 10;
        class236.field3737 = 10;
        class39.field602 = 10;
        if (class54.field817 > var5) {
            var5 += class39.field602 + ((class54.field817 - var5) * class206.field3132 / 1000);
            if (var5 < class54.field817) {
                class54.field817 = var5;
            }
        }
        if (var5 > class54.field817) {
            int var9 = var5 - (class39.field602 + ((var5 - class54.field817) * class206.field3132 / 1000));
            if (var9 > class54.field817) {
                class54.field817 = var9;
            }
        }
        class224.field3514 = 10;
        if (class74.field1117 > var2) {
            var2 += class224.field3514 + ((class74.field1117 - var2) * class236.field3737 / 1000);
            if (class74.field1117 > var2) {
                class74.field1117 = var2;
            }
        }
        int var10 = class147.field2369 - var7;
        if (var4 < class259.field4098) {
            var4 += (class259.field4098 - var4) * class236.field3737 / 1000 + class224.field3514;
            if (class259.field4098 > var4) {
                class259.field4098 = var4;
            }
        }
        if (var2 > class74.field1117) {
            int var11 = var2 - (class224.field3514 + ((var2 - class74.field1117) * class236.field3737 / 1000));
            if (var11 > class74.field1117) {
                class74.field1117 = var11;
            }
        }
        if (var4 > class259.field4098) {
            int var12 = var4 - ((var4 - class259.field4098) * class236.field3737 / 1000 + class224.field3514);
            if (var12 > class259.field4098) {
                class259.field4098 = var12;
            }
        }
        if (var3 < class41.field625) {
            var3 += class224.field3514 + ((class41.field625 - var3) * class236.field3737 / 1000);
            if (class41.field625 > var3) {
                class41.field625 = var3;
            }
        }
        if (var10 > 1024) {
            var10 -= 2048;
        }
        if (var3 > class41.field625) {
            int var13 = var3 - ((var3 - class41.field625) * class236.field3737 / 1000 + class224.field3514);
            if (var13 > class41.field625) {
                class41.field625 = var13;
            }
        }
        if (var10 < -1024) {
            var10 += 2048;
        }
        int var14 = -43 / ((63 - arg1) / 61);
        if (var10 > 0) {
            int var15 = class206.field3132 * var10 / 1000 + class39.field602 + var7;
            var7 = var15 & 0x7FF;
        }
        if (var10 < 0) {
            int var16 = var7 - (-var10 * class206.field3132 / 1000 + class39.field602);
            var7 = var16 & 0x7FF;
        }
        int var17 = class147.field2369 - var7;
        if (var17 > 1024) {
            var17 -= 2048;
        }
        if (var17 < -1024) {
            var17 += 2048;
        }
        if (var17 >= 0 || var10 <= 0 || var17 > 0 && var10 < 0) {
            class147.field2369 = var7;
        }
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(Lfh;IZ)V", line = 413)
    public final void method14(class313 arg0, int arg1, boolean arg2) {
        field1980++;
        if (arg1 == 0) {
            this.field1976 = new class171[arg0.method2224(-125)];
            for (int var4 = 0; var4 < this.field1976.length; var4++) {
                int var5 = arg0.method2224(-126);
                if (var5 == 0) {
                    this.field1976[var4] = class353.method2466((byte) -35, arg0);
                } else if (var5 == 1) {
                    this.field1976[var4] = class102.method666(arg0, (byte) 114);
                } else if (var5 == 2) {
                    this.field1976[var4] = class49.method361(-2, arg0);
                } else if (var5 == 3) {
                    this.field1976[var4] = class209.method1419(32767, arg0);
                }
            }
        } else if (arg1 == 1) {
            this.field34 = arg0.method2224(-120) == 1;
        }
        if (arg2) {
            field1984 = (class39[]) null;
        }
    }
}
