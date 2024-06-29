import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wfa")
public class class153 {

    @OriginalMember(owner = "client!wfa", name = "s", descriptor = "Lau;")
    private class692 field2170 = new class692(64);

    @OriginalMember(owner = "client!wfa", name = "t", descriptor = "Lau;")
    public class692 field2171 = new class692(50);

    @OriginalMember(owner = "client!wfa", name = "v", descriptor = "Lau;")
    public class692 field2173 = new class692(5);

    @OriginalMember(owner = "client!wfa", name = "q", descriptor = "Lmv;")
    private class295 field2168;

    @OriginalMember(owner = "client!wfa", name = "c", descriptor = "Lmv;")
    public class295 field2154;

    @OriginalMember(owner = "client!wfa", name = "b", descriptor = "Z")
    public boolean field2153;

    @OriginalMember(owner = "client!wfa", name = "r", descriptor = "Lsea;")
    public class373 field2169;

    @OriginalMember(owner = "client!wfa", name = "f", descriptor = "[Lvba;")
    public static class374[] field2157 = null;

    @OriginalMember(owner = "client!wfa", name = "n", descriptor = "[I")
    public static int[] field2165 = new int[3];

    @OriginalMember(owner = "client!wfa", name = "d", descriptor = "I")
    public static int field2155;

    @OriginalMember(owner = "client!wfa", name = "e", descriptor = "I")
    public static int field2156;

    @OriginalMember(owner = "client!wfa", name = "g", descriptor = "I")
    public static int field2158;

    @OriginalMember(owner = "client!wfa", name = "h", descriptor = "I")
    public static int field2159;

    @OriginalMember(owner = "client!wfa", name = "i", descriptor = "I")
    public static int field2160;

    @OriginalMember(owner = "client!wfa", name = "j", descriptor = "I")
    public static int field2161;

    @OriginalMember(owner = "client!wfa", name = "k", descriptor = "I")
    public static int field2162;

    @OriginalMember(owner = "client!wfa", name = "l", descriptor = "I")
    public static int field2163;

    @OriginalMember(owner = "client!wfa", name = "m", descriptor = "I")
    public static int field2164;

    @OriginalMember(owner = "client!wfa", name = "o", descriptor = "I")
    public static int field2166;

    @OriginalMember(owner = "client!wfa", name = "p", descriptor = "I")
    public static int field2167;

    @OriginalMember(owner = "client!wfa", name = "u", descriptor = "I")
    public static int field2172;

    @OriginalMember(owner = "client!wfa", name = "w", descriptor = "I")
    public int field2174;

    @OriginalMember(owner = "client!wfa", name = "a", descriptor = "[[Lcaa;")
    public static class538[][] field2152;

    @OriginalMember(owner = "client!wfa", name = "a", descriptor = "(ZB)V")
    public static final void method1086(boolean arg0, byte arg1) {
        field2167++;
        if (arg0) {
            if (class567.field8270 != -1) {
                class233.method1441(class567.field8270, (byte) -120);
            }
            for (class200 var2 = (class200) class318.field4623.method1993(-110); var2 != null; var2 = (class200) class318.field4623.method1997(arg1 + 9915)) {
                if (!var2.method2359(1578141260)) {
                    var2 = (class200) class318.field4623.method1993(-71);
                    if (var2 == null) {
                        break;
                    }
                }
                class522.method2950(-3223, false, var2, true);
            }
            class567.field8270 = -1;
            class318.field4623 = new class322(8);
            class261.method1575(arg1 ^ 0x53);
            class567.field8270 = class537.field7871;
            class537.method3101(false, arg1 ^ 0xFFFFF267);
            class12.method83((byte) -122);
            class195.method1273(class567.field8270);
        }
        if (arg1 != -84) {
            method1096(-66);
        }
        class239.field3137 = "";
        class11.field278 = "";
        class317.field4617 = false;
        class478.method2744(-1);
        class222.field2943 = -1;
        class481.method2753((byte) 119, class676.field9528);
        class321.field4681 = new class71();
        class321.field4681.field7430[0] = class72.field1144 / 2;
        class321.field4681.field7895 = class72.field1144 * 512 / 2;
        class321.field4681.field7896 = class668.field9444 * 512 / 2;
        class321.field4681.field7429[0] = class668.field9444 / 2;
        class603.field8702 = 0;
        class306.field4529 = 0;
        if (class684.field9659 == 2) {
            class603.field8702 = class346.field5107 << 9;
            class306.field4529 = class229.field3040 << 9;
        } else {
            class519.method2933((byte) 103);
        }
        class456.method2668(255);
    }

    @OriginalMember(owner = "client!wfa", name = "a", descriptor = "(I)V")
    public static final void method1087(int arg0) {
        field2164++;
        if (class436.field6358 == class215.field2882) {
            return;
        }
        try {
            class101.method727("tbrefresh", -112, class420.field6187);
        } catch (Throwable var1) {
        }
        if (arg0 != -16823) {
            field2165 = null;
        }
    }

    @OriginalMember(owner = "client!wfa", name = "a", descriptor = "(Z)V")
    public final void method1088(boolean arg0) {
        if (arg0) {
            this.field2173 = null;
        }
        class692 var2 = this.field2170;
        synchronized (this.field2170) {
            this.field2170.method3891(13747);
        }
        field2160++;
        class692 var3 = this.field2171;
        synchronized (this.field2171) {
            this.field2171.method3891(13747);
        }
        class692 var4 = this.field2173;
        synchronized (this.field2173) {
            this.field2173.method3891(13747);
        }
    }

    @OriginalMember(owner = "client!wfa", name = "a", descriptor = "(IZ)Lrda;")
    public final class76 method1089(int arg0, boolean arg1) {
        field2161++;
        class692 var3 = this.field2170;
        class76 var4;
        synchronized (this.field2170) {
            var4 = (class76) this.field2170.method3901((long) arg0, -108);
        }
        if (var4 != null) {
            return var4;
        }
        class295 var5 = this.field2168;
        byte[] var6;
        synchronized (this.field2168) {
            var6 = this.field2168.method1844(class677.method3802((byte) 120, arg0), 31330, class557.method3233(true, arg0));
            if (arg1) {
                this.method1090((byte) -40);
            }
        }
        class76 var7 = new class76();
        var7.field1240 = this;
        var7.field1178 = arg0;
        if (var6 != null) {
            var7.method438(new class540(var6), (byte) -119);
        }
        var7.method437(-66);
        class692 var8 = this.field2170;
        synchronized (this.field2170) {
            this.field2170.method3894(var7, (byte) 60, (long) arg0);
            return var7;
        }
    }

    @OriginalMember(owner = "client!wfa", name = "a", descriptor = "(B)V")
    public final void method1090(byte arg0) {
        field2155++;
        if (arg0 != 78) {
            this.field2153 = false;
        }
        class692 var2 = this.field2170;
        synchronized (this.field2170) {
            this.field2170.method3890(-1);
        }
        class692 var3 = this.field2171;
        synchronized (this.field2171) {
            this.field2171.method3890(-1);
        }
        class692 var4 = this.field2173;
        synchronized (this.field2173) {
            this.field2173.method3890(-1);
        }
    }

    @OriginalMember(owner = "client!wfa", name = "b", descriptor = "(I)V")
    public final void method1091(int arg0) {
        field2166++;
        class692 var2 = this.field2171;
        synchronized (this.field2171) {
            this.field2171.method3890(-1);
        }
        class692 var3 = this.field2173;
        synchronized (this.field2173) {
            this.field2173.method3890(-1);
            if (arg0 != 512) {
                method1094(117, false, null, null, -52, 71);
            }
        }
    }

    @OriginalMember(owner = "client!wfa", name = "a", descriptor = "(II)V")
    public final void method1092(int arg0, int arg1) {
        field2156++;
        class692 var3 = this.field2170;
        synchronized (this.field2170) {
            this.field2170.method3900(arg1, arg0);
        }
        class692 var4 = this.field2171;
        synchronized (this.field2171) {
            this.field2171.method3900(arg1, arg0);
        }
        class692 var5 = this.field2173;
        synchronized (this.field2173) {
            this.field2173.method3900(arg1, 0);
        }
    }

    @OriginalMember(owner = "client!wfa", name = "b", descriptor = "(II)V")
    public final void method1093(int arg0, int arg1) {
        if (arg1 < 4) {
            return;
        }
        field2162++;
        this.field2174 = arg0;
        class692 var3 = this.field2171;
        synchronized (this.field2171) {
            this.field2171.method3890(-1);
        }
        class692 var4 = this.field2173;
        synchronized (this.field2173) {
            this.field2173.method3890(-1);
        }
    }

    @OriginalMember(owner = "client!wfa", name = "a", descriptor = "(IZLr;Llt;II)V")
    public static final void method1094(int arg0, boolean arg1, class98 arg2, class289 arg3, int arg4, int arg5) {
        field2159++;
        class673 var6 = class652.field9331.method227(arg3.field4246, -127);
        if (var6.field9458 == -1) {
            return;
        }
        int var8;
        if (arg3.field4258) {
            int var7 = arg3.field4272 + arg0;
            var8 = var7 & 0x3;
        } else {
            var8 = 0;
        }
        class256 var9 = var6.method3779(arg3.field4257, var8, 124, arg2);
        if (var9 == null) {
            return;
        }
        if (arg1) {
            field2165 = null;
        }
        int var10 = arg3.field4269;
        int var11 = arg3.field4197;
        if ((var8 & 0x1) == 1) {
            var11 = arg3.field4269;
            var10 = arg3.field4197;
        }
        int var12 = var9.method50();
        int var13 = var9.method43();
        if (var6.field9461) {
            var13 = var11 * 4;
            var12 = var10 * 4;
        }
        if (var6.field9464 == 0) {
            var9.method1535(arg4, arg5 - ((var11 - 1) * 4), var12, var13);
        } else {
            var9.method1532(arg4, arg5 - ((var11 - 1) * 4), var12, var13, 0, var6.field9464 | 0xFF000000, 1);
        }
    }

    @OriginalMember(owner = "client!wfa", name = "a", descriptor = "(ZZ)V")
    public final void method1095(boolean arg0, boolean arg1) {
        field2158++;
        if (arg1 == this.field2153) {
            return;
        }
        this.field2153 = arg1;
        this.method1090((byte) 78);
        if (!arg0) {
            this.method1092(-23, -109);
        }
    }

    @OriginalMember(owner = "client!wfa", name = "c", descriptor = "(I)V")
    public static void method1096(int arg0) {
        field2152 = null;
        int var1 = 127 / ((71 - arg0) / 53);
        field2157 = null;
        field2165 = null;
    }

    @OriginalMember(owner = "client!wfa", name = "<init>", descriptor = "(Lsea;IZLmv;Lmv;)V")
    public class153(class373 arg0, int arg1, boolean arg2, class295 arg3, class295 arg4) {
        this.field2168 = arg3;
        this.field2154 = arg4;
        this.field2153 = arg2;
        this.field2169 = arg0;
        if (this.field2168 != null) {
            int var6 = this.field2168.method1816(-124) - 1;
            this.field2168.method1845(var6, true);
        }
    }
}
