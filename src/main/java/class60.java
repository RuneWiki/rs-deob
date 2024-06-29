import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sf")
public class class60 {

    @OriginalMember(owner = "client!sf", name = "d", descriptor = "I")
    public static int field1102 = -1;

    @OriginalMember(owner = "client!sf", name = "m", descriptor = "Lra;")
    public static class40 field1111 = new class40();

    @OriginalMember(owner = "client!sf", name = "p", descriptor = "Lrb;")
    public static class254 field1114 = new class254(64);

    @OriginalMember(owner = "client!sf", name = "r", descriptor = "I")
    public static int field1116 = -1;

    @OriginalMember(owner = "client!sf", name = "s", descriptor = "I")
    public static volatile int field1117 = 0;

    @OriginalMember(owner = "client!sf", name = "u", descriptor = "I")
    public static int field1119 = 0;

    @OriginalMember(owner = "client!sf", name = "t", descriptor = "[[I")
    public static int[][] field1118 = new int[][] { { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 }, { 12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3 }, { 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 }, { 3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12 } };

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "I")
    public static int field1099;

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "I")
    public static int field1100;

    @OriginalMember(owner = "client!sf", name = "c", descriptor = "I")
    public static int field1101;

    @OriginalMember(owner = "client!sf", name = "e", descriptor = "I")
    public static int field1103;

    @OriginalMember(owner = "client!sf", name = "f", descriptor = "I")
    public static int field1104;

    @OriginalMember(owner = "client!sf", name = "g", descriptor = "I")
    public static int field1105;

    @OriginalMember(owner = "client!sf", name = "h", descriptor = "I")
    public static int field1106;

    @OriginalMember(owner = "client!sf", name = "i", descriptor = "I")
    public static int field1107;

    @OriginalMember(owner = "client!sf", name = "j", descriptor = "I")
    public static int field1108;

    @OriginalMember(owner = "client!sf", name = "k", descriptor = "I")
    public static int field1109;

    @OriginalMember(owner = "client!sf", name = "o", descriptor = "J")
    public long field1113;

    @OriginalMember(owner = "client!sf", name = "q", descriptor = "Lgb;")
    public static class46 field1115;

    @OriginalMember(owner = "client!sf", name = "l", descriptor = "Lsf;")
    public class60 field1110;

    @OriginalMember(owner = "client!sf", name = "n", descriptor = "Lsf;")
    public class60 field1112;

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(IIILid;II)V")
    public static final void method363(int arg0, int arg1, int arg2, class238 arg3, int arg4, int arg5) {
        field1107++;
        if (arg3.field4139 == -1 && arg3.field4126 == null) {
            return;
        }
        int var6 = 0;
        if (arg5 > arg3.field4123) {
            var6 += arg5 - arg3.field4123;
        } else if (arg5 < arg3.field4128) {
            var6 += arg3.field4128 - arg5;
        }
        if (arg3.field4138 < arg1) {
            var6 += arg1 - arg3.field4138;
        } else if (arg3.field4127 > arg1) {
            var6 += arg3.field4127 - arg1;
        }
        if (arg2 > -61) {
            field1102 = -93;
        }
        if (arg3.field4130 == 0 || (var6 - 64) > arg3.field4130 || class248.field4311 == 0 || arg3.field4144 != arg0) {
            if (arg3.field4129 != null) {
                class94.field1627.method479(arg3.field4129);
                arg3.field4129 = null;
            }
            if (arg3.field4145 != null) {
                class94.field1627.method479(arg3.field4145);
                arg3.field4145 = null;
            }
            return;
        }
        var6 -= 64;
        if (var6 < 0) {
            var6 = 0;
        }
        int var7 = (arg3.field4130 - var6) * class248.field4311 / arg3.field4130;
        if (arg3.field4129 != null) {
            arg3.field4129.method1081(var7);
        } else if (arg3.field4139 >= 0) {
            class39 var8 = class39.method208(class95.field1648, arg3.field4139, 0);
            if (var8 != null) {
                class150 var9 = var8.method207().method950(class216.field3645);
                class170 var10 = class170.method1063(var9, 100, var7);
                var10.method1076(-1);
                class94.field1627.method480(var10);
                arg3.field4129 = var10;
            }
        }
        if (arg3.field4145 != null) {
            arg3.field4145.method1081(var7);
            if (arg3.field4145.method367((byte) 109)) {
                return;
            }
            arg3.field4145 = null;
        } else if (arg3.field4126 != null && (arg3.field4125 -= arg4) <= 0) {
            int var11 = (int) ((double) arg3.field4126.length * Math.random());
            class39 var12 = class39.method208(class95.field1648, arg3.field4126[var11], 0);
            if (var12 != null) {
                class150 var13 = var12.method207().method950(class216.field3645);
                class170 var14 = class170.method1063(var13, 100, var7);
                var14.method1076(0);
                class94.field1627.method480(var14);
                arg3.field4145 = var14;
                arg3.field4125 = (int) ((double) (arg3.field4141 - arg3.field4136) * Math.random()) + arg3.field4136;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(IIIIILnf;Lta;)V")
    public static final void method364(int arg0, int arg1, int arg2, int arg3, int arg4, class213 arg5, class105 arg6) {
        field1104++;
        if (arg5 == null) {
            return;
        }
        int var7 = class29.field476 + class254.field4462 & 0x7FF;
        if (arg1 <= 93) {
            field1118 = null;
        }
        int var8 = Math.max(arg6.field1977 / 2, arg6.field1952 / 2) + 10;
        int var9 = arg2 * arg2 + arg3 * arg3;
        if (var8 * var8 < var9) {
            return;
        }
        int var10 = class62.field1136[var7];
        int var11 = class62.field1143[var7];
        int var12 = var10 * 256 / (class91.field1559 + 256);
        int var13 = var11 * 256 / (class91.field1559 + 256);
        int var14 = arg3 * var13 - arg2 * var12 >> 16;
        int var15 = arg2 * var13 + arg3 * var12 >> 16;
        ((class163) arg5).method1001(arg6.field1977 / 2 + arg0 + var15 - (arg5.field3592 / 2), arg6.field1952 / 2 + arg4 + -(arg5.field3594 / 2) + -var14, arg6.field1859, arg6.field1843);
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(Z)V")
    public static void method365(boolean arg0) {
        field1114 = null;
        field1118 = null;
        field1115 = null;
        field1111 = null;
        if (!arg0) {
            field1118 = null;
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(B)V")
    public static final void method366(byte arg0) {
        for (int var1 = 0; var1 < 5; var1++) {
            class11.field222[var1] = false;
        }
        field1106++;
        client.field1447 = 1;
        if (arg0 < 116) {
            field1117 = 2;
        }
        class166.field2780 = -1;
        class77.field1340 = -1;
    }

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "(B)Z")
    public final boolean method367(byte arg0) {
        field1101++;
        if (this.field1112 == null) {
            return false;
        } else {
            if (arg0 < 40) {
                field1111 = null;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(BLn;)I")
    public static final int method368(byte arg0, class138 arg1) {
        if (arg0 != -116) {
            field1118 = null;
        }
        field1109++;
        int var2 = 0;
        if (arg1.method876(true, class83.field1453)) {
            var2++;
        }
        if (arg1.method876(true, class103.field1798)) {
            var2++;
        }
        if (arg1.method876(true, class31.field500)) {
            var2++;
        }
        if (arg1.method876(true, class180.field3088)) {
            var2++;
        }
        if (arg1.method876(true, class43.field713)) {
            var2++;
        }
        if (arg1.method876(true, class232.field4052)) {
            var2++;
        }
        if (arg1.method876(true, class40.field664)) {
            var2++;
        }
        if (arg1.method876(true, class64.field1178)) {
            var2++;
        }
        if (arg1.method876(true, class4.field42)) {
            var2++;
        }
        if (arg1.method876(true, class40.field655)) {
            var2++;
        }
        if (arg1.method876(true, class243.field4227)) {
            var2++;
        }
        if (arg1.method876(true, class216.field3642)) {
            var2++;
        }
        if (arg1.method876(true, field1105)) {
            var2++;
        }
        var2++;
        if (arg1.method876(true, class236.field4097)) {
            var2++;
        }
        if (arg1.method876(true, class2.field34)) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(I)V")
    public final void method369(int arg0) {
        field1103++;
        if (this.field1112 == null) {
            return;
        }
        this.field1112.field1110 = this.field1110;
        this.field1110.field1112 = this.field1112;
        this.field1110 = null;
        int var2 = -119 / ((arg0 - 61) / 63);
        this.field1112 = null;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(IB)V")
    public static final void method370(int arg0, byte arg1) {
        class218.field3651 = arg0;
        if (arg1 <= -70) {
            field1099++;
            class182.field3107 = 50;
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(IIILn;)[Lnf;")
    public static final class213[] method371(int arg0, int arg1, int arg2, class138 arg3) {
        field1108++;
        if (arg2 != 4) {
            field1114 = null;
        }
        return class123.method760(arg3, arg1, arg0, 123) ? class165.method1021(-77) : null;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(BI)V")
    public static final void method372(byte arg0, int arg1) {
        field1100++;
        if (arg1 == -1 || !class195.method1234(arg1, (byte) -110)) {
            return;
        }
        class105[] var2 = class102.field1792[arg1];
        int var3 = 0;
        if (arg0 >= -44) {
            method368((byte) -80, (class138) null);
        }
        while (var3 < var2.length) {
            class105 var4 = var2[var3];
            if (var4.field1889 != null) {
                class34 var5 = new class34();
                var5.field583 = var4;
                var5.field568 = var4.field1889;
                class166.method1024(var5, 2000000, 2147483642);
            }
            var3++;
        }
    }
}
