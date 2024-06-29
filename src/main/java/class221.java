import java.awt.Point;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fi")
public class class221 {

    @OriginalMember(owner = "client!fi", name = "c", descriptor = "Z")
    public static boolean field4019 = false;

    @OriginalMember(owner = "client!fi", name = "f", descriptor = "I")
    public static int field4022 = 0;

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "I")
    public static int field4017;

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "I")
    public static int field4018;

    @OriginalMember(owner = "client!fi", name = "d", descriptor = "I")
    public static int field4020;

    @OriginalMember(owner = "client!fi", name = "e", descriptor = "I")
    public static int field4021;

    @OriginalMember(owner = "client!fi", name = "g", descriptor = "I")
    public static int field4023;

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(IZ)V")
    public static final void method1527(int arg0, boolean arg1) {
        if (!class73.field1277) {
            arg0 = -1;
        }
        field4020++;
        if (!arg1) {
            field4022 = 30;
        }
        if (class250.field4441 == arg0) {
            return;
        }
        if (arg0 != -1) {
            class119 var2 = class229.method1586(arg0, -32637);
            class101 var3 = var2.method884(0);
            if (var3 == null) {
                arg0 = -1;
            } else {
                class124.field2238.method1164(var3.field3859, new Point(var2.field2180, var2.field2171), var3.method708(), class30.field500, (byte) 117, var3.field3852);
                class250.field4441 = arg0;
            }
        }
        if (arg0 == -1 && class250.field4441 != -1) {
            class124.field2238.method1164(-1, new Point(), (int[]) null, class30.field500, (byte) 104, -1);
            class250.field4441 = -1;
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(B)V")
    public static final void method1528(byte arg0) {
        field4021++;
        int var1 = class240.field4292.length;
        int var2 = 0;
        int var3 = 38 / ((arg0 - 2) / 57);
        while (var1 > var2) {
            if (class240.field4292[var2] != null) {
                int var4 = -1;
                for (int var5 = 0; var5 < class13.field233; var5++) {
                    if (class141.field2640[var2] == class134.field2447[var5]) {
                        var4 = var5;
                        break;
                    }
                }
                if (var4 == -1) {
                    class134.field2447[class13.field233] = class141.field2640[var2];
                    var4 = class13.field233++;
                }
                class118 var6 = new class118(class240.field4292[var2]);
                int var7 = 0;
                while (var6.field2155 < class240.field4292[var2].length && var7 < 511) {
                    int var8 = var4 | var7++ << 6;
                    int var9 = var6.method827(255);
                    int var10 = var9 & 0x3F;
                    int var11 = var9 >> 14;
                    int var12 = (class141.field2640[var2] & 0xFF) * 64 + var10 - class107.field1933;
                    int var13 = (var9 & 0x1FA7) >> 7;
                    int var14 = (class141.field2640[var2] >> 8) * 64 + var13 - class77.field1339;
                    class81 var15 = class269.method1828(2, var6.method827(255));
                    if (class87.field1712[var8] == null && (var15.field1422 & 0x1) > 0 && class111.field2009 == var11 && var14 >= 0 && (var14 + var15.field1452) < 104 && var12 >= 0 && var15.field1452 + var12 < 104) {
                        class87.field1712[var8] = new class71();
                        class71 var16 = class87.field1712[var8];
                        class97.field1811[class108.field1943++] = var8;
                        var16.field2710 = class211.field3851;
                        var16.method467(var15, 24);
                        var16.method1015(var16.field1236.field1452, 10672);
                        var16.field2683 = var16.field2695 = class174.field3193[var16.field1236.field1458];
                        var16.field2648 = var16.field1236.field1406;
                        var16.field2666 = var16.field1236.field1473;
                        var16.field2700 = var16.field1236.field1467;
                        var16.field2705 = var16.field1236.field1421;
                        if (var16.field2705 == 0) {
                            var16.field2695 = 0;
                        }
                        var16.field2693 = var16.field1236.field1468;
                        var16.field2699 = var16.field1236.field1440;
                        var16.field2719 = var16.field1236.field1424;
                        var16.field2716 = var16.field1236.field1437;
                        var16.method1018(true, var16.method1014(-1), var12, var14, -12477);
                    }
                }
            }
            var2++;
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(IIIIIIB)V")
    public static final void method1529(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6) {
        if ((arg5 - arg2) >= class207.field3810 && class66.field1163 >= arg2 + arg5 && class216.field3964 <= arg3 - arg2 && (arg2 + arg3) <= class113.field2040) {
            class249.method1670(arg5, arg2, true, arg1, arg0, arg4, arg3);
        } else {
            class138.method992(arg1, 0, arg5, arg4, arg3, arg2, arg0);
        }
        if (arg6 >= -72) {
            method1528((byte) 47);
        }
        field4018++;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(ILli;)I")
    public static final int method1530(int arg0, class185 arg1) {
        field4023++;
        if (class215.field3955 == null || arg1.method1311((byte) 49) == 0) {
            return -1;
        }
        for (int var2 = arg0; var2 < class215.field3955.field3133; var2++) {
            if (class215.field3955.field3136[var2].method1336((byte) -102, class118.field2161, class163.field3059).method1329(arg1, (byte) 22)) {
                return var2;
            }
        }
        return -1;
    }
}
