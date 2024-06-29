import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nf")
public class class96 extends class123 {

    @OriginalMember(owner = "client!nf", name = "R", descriptor = "I")
    public int field2197;

    @OriginalMember(owner = "client!nf", name = "N", descriptor = "I")
    private int field2193;

    @OriginalMember(owner = "client!nf", name = "K", descriptor = "[[I")
    public int[][] field2190;

    @OriginalMember(owner = "client!nf", name = "L", descriptor = "[I")
    public int[] field2191;

    @OriginalMember(owner = "client!nf", name = "H", descriptor = "I")
    public static int field2187 = 0;

    @OriginalMember(owner = "client!nf", name = "P", descriptor = "I")
    public static int field2195 = -1;

    @OriginalMember(owner = "client!nf", name = "S", descriptor = "Z")
    public static boolean field2198 = false;

    @OriginalMember(owner = "client!nf", name = "I", descriptor = "Ln;")
    public static class90 field2188 = new class90(30);

    @OriginalMember(owner = "client!nf", name = "cb", descriptor = "Loa;")
    public static class98 field2208 = class38.method349(255, "Bitte versuchen Sie es in ");

    @OriginalMember(owner = "client!nf", name = "db", descriptor = "I")
    public static int field2209 = 0;

    @OriginalMember(owner = "client!nf", name = "Z", descriptor = "[I")
    public static int[] field2205 = new int[2048];

    @OriginalMember(owner = "client!nf", name = "X", descriptor = "Loa;")
    private static class98 field2203 = class38.method349(255, "flash1:");

    @OriginalMember(owner = "client!nf", name = "eb", descriptor = "Loa;")
    public static class98 field2210 = field2203;

    @OriginalMember(owner = "client!nf", name = "fb", descriptor = "Loa;")
    public static class98 field2211 = class38.method349(255, "(Y");

    @OriginalMember(owner = "client!nf", name = "V", descriptor = "I")
    public static int field2201 = -1;

    @OriginalMember(owner = "client!nf", name = "gb", descriptor = "Loa;")
    private static class98 field2212 = class38.method349(255, "scroll:");

    @OriginalMember(owner = "client!nf", name = "jb", descriptor = "Loa;")
    public static class98 field2215 = field2203;

    @OriginalMember(owner = "client!nf", name = "hb", descriptor = "Loa;")
    public static class98 field2213 = class38.method349(255, "Keine Antwort vom Anmelde)2Server)3");

    @OriginalMember(owner = "client!nf", name = "lb", descriptor = "Loa;")
    private static class98 field2217 = class38.method349(255, "Enter name of friend to delete from list");

    @OriginalMember(owner = "client!nf", name = "kb", descriptor = "Loa;")
    public static class98 field2216 = field2212;

    @OriginalMember(owner = "client!nf", name = "U", descriptor = "Loa;")
    public static class98 field2200 = field2217;

    @OriginalMember(owner = "client!nf", name = "ib", descriptor = "Loa;")
    public static class98 field2214 = field2212;

    @OriginalMember(owner = "client!nf", name = "G", descriptor = "I")
    public static int field2186;

    @OriginalMember(owner = "client!nf", name = "J", descriptor = "I")
    public static int field2189;

    @OriginalMember(owner = "client!nf", name = "M", descriptor = "I")
    public static int field2192;

    @OriginalMember(owner = "client!nf", name = "O", descriptor = "I")
    public static int field2194;

    @OriginalMember(owner = "client!nf", name = "Q", descriptor = "I")
    public static int field2196;

    @OriginalMember(owner = "client!nf", name = "T", descriptor = "I")
    public static int field2199;

    @OriginalMember(owner = "client!nf", name = "Y", descriptor = "I")
    public static int field2204;

    @OriginalMember(owner = "client!nf", name = "bb", descriptor = "I")
    public static int field2207;

    @OriginalMember(owner = "client!nf", name = "W", descriptor = "Ltb;")
    public static class130 field2202;

    @OriginalMember(owner = "client!nf", name = "mb", descriptor = "Lid;")
    public static class60 field2218;

    @OriginalMember(owner = "client!nf", name = "ab", descriptor = "Ljava/awt/Frame;")
    public static Frame field2206;

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(ZLoa;Loa;I)V")
    public static final void method766(boolean arg0, class98 arg1, class98 arg2, int arg3) {
        if (class97.field2220) {
            class21.method190((byte) -39);
            class97.field2220 = false;
            class123.method974((byte) 42);
            class120.method953(false);
            class6.method29(false);
            class55.method448(true);
            class10.method117(class80.field1749, class54.field1193, arg3 + 16711701, class67.field1433, class97.field2231);
            class83.method696(class52.field1163, class31.field709, -1, 0, class132.field3111 == -1);
            class114.field2580 = true;
            class79.field1736 = true;
            class73.field1524 = true;
        }
        short var4 = 151;
        if (arg3 != -21) {
            return;
        }
        int var6 = var4 - 3;
        class105.method888(46);
        field2192++;
        class97.field2231.method388(arg1, 257, var6, 0);
        class97.field2231.method388(arg1, 256, var6 - 1, 16777215);
        if (arg2 != null) {
            var6 += 15;
            if (arg0) {
                int var5 = class97.field2231.method398(arg2) + 4;
                class7.method41(257 - var5 / 2, var6 - 11, var5, 11, 0);
            }
            class97.field2231.method388(arg2, 257, var6, 0);
            class97.field2231.method388(arg2, 256, var6 - 1, 16777215);
        }
        class82.method659(123);
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(ILtb;Ltb;)V")
    public static final void method767(int arg0, class130 arg1, class130 arg2) {
        field2186++;
        class131.field3081 = arg2;
        class56.field1253 = arg1;
        if (arg0 < 49) {
            method767(-48, null, null);
        }
        class112.field2511 = class131.field3081.method1062(3, (byte) 59);
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(BI)V")
    public static final void method768(byte arg0, int arg1) {
        field2189++;
        if (class52.field1148 == arg1) {
            return;
        }
        if (class52.field1148 == 0) {
            class101.method839(arg0 ^ 0x63);
        }
        if (arg0 != 98) {
            return;
        }
        if (arg1 == 20 || arg1 == 40) {
            class114.field2577 = 0;
            class115.field2591 = 0;
            class83.field1931 = 0;
        }
        if (arg1 != 20 && arg1 != 40 && class56.field1254 != null) {
            class56.field1254.method283(-30232);
            class56.field1254 = null;
        }
        if (class52.field1148 == 25 || class52.field1148 == 40) {
            class105.method888(63);
            class7.method40();
        }
        if (class52.field1148 == 25) {
            class113.field2549 = 0;
            class64.field1367 = 1;
            class134.field3266 = 1;
            class1.field12 = 0;
            class37.field916 = 0;
        }
        if (arg1 == 0 || arg1 == 35) {
            class82.method672(92);
            class78.method632(1);
            if (class62.field1328 == null) {
                class62.field1328 = class14.method148(503, class73.field1506, 765, -27261);
            }
        }
        if (arg1 == 5 || arg1 == 10 || arg1 == 20) {
            class62.field1328 = null;
            class82.method672(arg0 - 32);
            class146.method1173(class135.field3290, class73.field1506, class132.field3170, 2);
        }
        if (arg1 == 25 || arg1 == 30 || arg1 == 40) {
            class62.field1328 = null;
            class78.method632(1);
            class6.method36(class73.field1506, class135.field3290, (byte) -72);
        }
        class97.field2220 = true;
        class52.field1148 = arg1;
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(III)I")
    public static final int method769(int arg0, int arg1, int arg2) {
        field2194++;
        if (arg1 == -2) {
            return 12345678;
        } else if (arg1 == -1) {
            if (arg2 < 0) {
                arg2 = 0;
            } else if (arg2 > 127) {
                arg2 = 127;
            }
            return 127 - arg2;
        } else {
            int var4 = (arg1 & 0x7F) * arg2 / 128;
            if (arg0 != 16777215) {
                return -20;
            }
            if (var4 < 2) {
                var4 = 2;
            } else if (var4 > 126) {
                var4 = 126;
            }
            return (arg1 & 0xFF80) + var4;
        }
    }

    @OriginalMember(owner = "client!nf", name = "c", descriptor = "(I)V")
    public static void method770(int arg0) {
        field2205 = null;
        field2206 = null;
        field2217 = null;
        if (arg0 != 15088) {
            field2213 = null;
        }
        field2214 = null;
        field2212 = null;
        field2208 = null;
        field2188 = null;
        field2213 = null;
        field2218 = null;
        field2203 = null;
        field2216 = null;
        field2215 = null;
        field2202 = null;
        field2211 = null;
        field2200 = null;
        field2210 = null;
    }

    @OriginalMember(owner = "client!nf", name = "d", descriptor = "(I)V")
    public static final void method771(int arg0) {
        class58.field1278 = 0;
        class74.field1603 = 0;
        class51.method428((byte) 122);
        class101.method835(-88);
        class141.method1130(4);
        field2196++;
        for (int var1 = arg0; var1 < class58.field1278; var1++) {
            int var3 = class8.field190[var1];
            if (class119.field2680 != class38.field935[var3].field3609) {
                class38.field935[var3].field3709 = null;
                class38.field935[var3] = null;
            }
        }
        if (class88.field2028 != class36.field890.field182) {
            throw new RuntimeException("gnp1 pos:" + class36.field890.field182 + " psize:" + class88.field2028);
        }
        for (int var2 = 0; var2 < class130.field3024; var2++) {
            if (class38.field935[class90.field2073[var2]] == null) {
                throw new RuntimeException("gnp2 pos:" + var2 + " size:" + class130.field3024);
            }
        }
    }

    @OriginalMember(owner = "client!nf", name = "<init>", descriptor = "(I[B)V")
    public class96(int arg0, byte[] arg1) {
        this.field2197 = arg0;
        class8 var3 = new class8(arg1);
        this.field2193 = var3.method62((byte) 117);
        this.field2190 = new int[this.field2193][];
        this.field2191 = new int[this.field2193];
        for (int var4 = 0; var4 < this.field2193; var4++) {
            this.field2191[var4] = var3.method62((byte) 80);
        }
        for (int var5 = 0; var5 < this.field2193; var5++) {
            this.field2190[var5] = new int[var3.method62((byte) 98)];
        }
        for (int var6 = 0; var6 < this.field2193; var6++) {
            for (int var7 = 0; var7 < this.field2190[var6].length; var7++) {
                this.field2190[var6][var7] = var3.method62((byte) 86);
            }
        }
    }
}
