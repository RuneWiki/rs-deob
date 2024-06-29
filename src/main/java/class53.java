import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tk")
public class class53 {

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "I")
    public static int field711 = 0;

    @OriginalMember(owner = "client!tk", name = "f", descriptor = "I")
    public static int field716 = 0;

    @OriginalMember(owner = "client!tk", name = "c", descriptor = "[I")
    public static int[] field713 = new int[2048];

    @OriginalMember(owner = "client!tk", name = "i", descriptor = "[I")
    public static int[] field719 = new int[200];

    @OriginalMember(owner = "client!tk", name = "b", descriptor = "I")
    public static int field712;

    @OriginalMember(owner = "client!tk", name = "d", descriptor = "I")
    public static int field714;

    @OriginalMember(owner = "client!tk", name = "e", descriptor = "I")
    public static int field715;

    @OriginalMember(owner = "client!tk", name = "g", descriptor = "I")
    public static int field717;

    @OriginalMember(owner = "client!tk", name = "j", descriptor = "I")
    public static int field720;

    @OriginalMember(owner = "client!tk", name = "h", descriptor = "[I")
    public static int[] field718;

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(B)V")
    public static final void method317(byte arg0) {
        while (true) {
            if (class192.field3042.method1396(class20.field272, 127) >= 27) {
                int var1 = class192.field3042.method1394((byte) 98, 15);
                if (var1 != 32767) {
                    boolean var2 = false;
                    if (class76.field1188[var1] == null) {
                        var2 = true;
                        class76.field1188[var1] = new class35();
                    }
                    class35 var3 = class76.field1188[var1];
                    class76.field1189[class14.field195++] = var1;
                    var3.field860 = class4.field32;
                    if (var3.field442 != null && var3.field442.method690(0)) {
                        class48.method299(65, var3);
                    }
                    int var4 = class192.field3042.method1394((byte) 104, 5);
                    int var5 = class192.field3042.method1394((byte) 87, 1);
                    if (var5 == 1) {
                        class208.field3323[class70.field1018++] = var1;
                    }
                    if (var4 > 15) {
                        var4 -= 32;
                    }
                    var3.method214(class145.method974(-87, class192.field3042.method1394((byte) 123, 14)), (byte) -39);
                    int var6 = class192.field3042.method1394((byte) 81, 5);
                    if (var6 > 15) {
                        var6 -= 32;
                    }
                    int var7 = class164.field2588[class192.field3042.method1394((byte) 126, 3)];
                    if (var2) {
                        var3.field802 = var3.field855 = var7;
                    }
                    int var8 = class192.field3042.method1394((byte) 94, 1);
                    var3.method365(var3.field442.field1591, -17145);
                    var3.field841 = var3.field442.field1644;
                    if (var3.field841 == 0) {
                        var3.field855 = 0;
                    }
                    var3.field807 = var3.field442.field1603;
                    var3.method357(var8 == 1, var3.method362(25892), (byte) -107, class309.field5006.field849[0] + var4, class309.field5006.field804[0] - -var6);
                    if (var3.field442.method690(0)) {
                        class16.method103(0, (class208) null, var3.field849[0], class165.field2600, var3.field804[0], 0, (class74) null, 128, var3);
                    }
                    continue;
                }
            }
            int var9 = 2 / ((-arg0 - 16) / 37);
            field712++;
            class192.field3042.method1389(8);
            return;
        }
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(Z)V")
    public static void method318(boolean arg0) {
        field718 = null;
        field713 = null;
        field719 = null;
        if (arg0) {
            field713 = null;
        }
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(ZLti;)V")
    public static final void method319(boolean arg0, class5 arg1) {
        field714++;
        for (int var2 = 0; var2 < class258.field4248.length; var2++) {
            class258.field4248[var2] = 0;
        }
        short var3 = 256;
        if (arg0) {
            method320(-121, -70, true, 38, 72, 8, -7, -91);
        }
        for (int var4 = 0; var4 < 5000; var4++) {
            int var16 = (int) ((double) var3 * Math.random() * 128.0D);
            class258.field4248[var16] = (int) (Math.random() * 284.0D);
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var12 = 1; var12 < (var3 - 1); var12++) {
                for (int var14 = 1; var14 < 127; var14++) {
                    int var15 = (var12 << 7) + var14;
                    class10.field126[var15] = (class258.field4248[var15 + 128] + class258.field4248[var15 - 1] + class258.field4248[var15 + 1] + class258.field4248[var15 - 128]) / 4;
                }
            }
            int[] var13 = class258.field4248;
            class258.field4248 = class10.field126;
            class10.field126 = var13;
        }
        if (arg1 == null) {
            return;
        }
        int var6 = 0;
        for (int var7 = 0; var7 < arg1.field1672; var7++) {
            for (int var8 = 0; var8 < arg1.field1681; var8++) {
                if (arg1.field47[var6++] != 0) {
                    int var9 = arg1.field1677 + var8 + 16;
                    int var10 = var7 + arg1.field1674 + 16;
                    int var11 = (var10 << 7) + var9;
                    class258.field4248[var11] = 0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(IIZIIIII)V")
    public static final void method320(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field720++;
        if (arg2) {
            return;
        }
        int var8 = arg0 - 334;
        if (var8 < 0) {
            var8 = 0;
        } else if (var8 > 100) {
            var8 = 100;
        }
        int var9 = (class4.field30 - class132.field2092) * var8 / 100 + class132.field2092;
        int var10 = 2048 - arg1 & 0x7FF;
        int var11 = 2048 - arg4 & 0x7FF;
        int var12 = 0;
        int var13 = arg5 * var9 >> 8;
        int var14 = 0;
        int var15 = var13;
        if (var11 != 0) {
            int var16 = class172.field2669[var11];
            var14 = -var13 * var16 >> 16;
            int var17 = class172.field2658[var11];
            var15 = var13 * var17 >> 16;
        }
        if (var10 != 0) {
            int var18 = class172.field2658[var10];
            int var19 = class172.field2669[var10];
            var12 = var15 * var19 >> 16;
            var15 = var15 * var18 >> 16;
        }
        field715 = arg6 - var12;
        class262.field4326 = arg3 - var14;
        class174.field2724 = arg7 - var15;
        class132.field2037 = arg4;
        class100.field1514 = arg1;
    }
}
