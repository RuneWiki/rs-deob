import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!de")
public class class107 {

    @OriginalMember(owner = "client!de", name = "d", descriptor = "Ljd;")
    public static class86 field2054 = class122.method868("Loaded titlescreen)3", true);

    @OriginalMember(owner = "client!de", name = "k", descriptor = "Z")
    public static boolean field2061 = true;

    @OriginalMember(owner = "client!de", name = "m", descriptor = "Ljd;")
    public static class86 field2063 = class122.method868("gr-Un:", true);

    @OriginalMember(owner = "client!de", name = "b", descriptor = "I")
    public static int field2052;

    @OriginalMember(owner = "client!de", name = "c", descriptor = "I")
    public static int field2053;

    @OriginalMember(owner = "client!de", name = "f", descriptor = "I")
    public static int field2056;

    @OriginalMember(owner = "client!de", name = "g", descriptor = "I")
    public static int field2057;

    @OriginalMember(owner = "client!de", name = "h", descriptor = "I")
    public int field2058;

    @OriginalMember(owner = "client!de", name = "i", descriptor = "I")
    public static int field2059;

    @OriginalMember(owner = "client!de", name = "j", descriptor = "I")
    public static int field2060;

    @OriginalMember(owner = "client!de", name = "l", descriptor = "I")
    public static int field2062;

    @OriginalMember(owner = "client!de", name = "n", descriptor = "I")
    public int field2064;

    @OriginalMember(owner = "client!de", name = "p", descriptor = "I")
    public int field2066;

    @OriginalMember(owner = "client!de", name = "q", descriptor = "I")
    public static int field2067;

    @OriginalMember(owner = "client!de", name = "r", descriptor = "I")
    public static int field2068;

    @OriginalMember(owner = "client!de", name = "o", descriptor = "J")
    public long field2065;

    @OriginalMember(owner = "client!de", name = "e", descriptor = "Lpc;")
    public static class21 field2055;

    @OriginalMember(owner = "client!de", name = "a", descriptor = "Leh;")
    public class80 field2051;

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(I)V")
    public static void method760(int arg0) {
        int var1 = -73 % ((arg0 + 65) / 58);
        field2063 = null;
        field2055 = null;
        field2054 = null;
    }

    @OriginalMember(owner = "client!de", name = "b", descriptor = "(I)V")
    public static final void method761(int arg0) {
        field2057++;
        if (arg0 == 8091) {
            class215.field3880.method703((byte) 122);
        }
    }

    @OriginalMember(owner = "client!de", name = "c", descriptor = "(I)[Lqc;")
    public static final class62[] method762(int arg0) {
        field2062++;
        class62[] var1 = new class62[class64.field1270];
        for (int var2 = arg0; var2 < class64.field1270; var2++) {
            var1[var2] = new class101(class70.field1438, class169.field3121, class138.field2628[var2], class1.field6[var2], class24.field592[var2], class191.field3393[var2], class213.field3857[var2], class268.field4718);
        }
        class127.method894((byte) 20);
        return var1;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(IIIIII)V")
    public static final void method763(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field2052++;
        int var6 = arg3;
        int var7 = arg2 * arg2;
        int var8 = arg0;
        int var9 = arg0 << 1;
        int var10 = arg0 * arg0;
        int var11 = var10 << 1;
        int var12 = (1 - var9) * var7 + var11;
        int var13 = var7 << 1;
        int var14 = var7 << 2;
        int var15 = var10 - ((var9 - 1) * var13);
        int var16 = var10 << 2;
        int var17 = ((arg3 << 1) + 3) * var11;
        int var18 = (arg3 + 1) * var16;
        int var19 = ((arg0 << 1) - 3) * var13;
        int var20 = (arg0 - 1) * var14;
        if (class50.field1050 <= arg5 && arg5 <= class56.field1143) {
            int var21 = class171.method1221(class129.field2473, class49.field1044, 21419, arg2 + arg4);
            int var22 = class171.method1221(class129.field2473, class49.field1044, 21419, arg4 - arg2);
            class56.method412(arg1, (byte) -121, var21, class249.field4420[arg5], var22);
        }
        while (var8 > 0) {
            var8--;
            int var23 = arg5 - var8;
            if (var12 < 0) {
                while (var12 < 0) {
                    var12 += var17;
                    var6++;
                    var17 += var16;
                    var15 += var18;
                    var18 += var16;
                }
            }
            if (var15 < 0) {
                var6++;
                var12 += var17;
                var15 += var18;
                var18 += var16;
                var17 += var16;
            }
            var12 += -var20;
            var20 -= var14;
            var15 += -var19;
            var19 -= var14;
            int var24 = arg5 + var8;
            if (var24 >= class50.field1050 && var23 <= class56.field1143) {
                int var25 = class171.method1221(class129.field2473, class49.field1044, arg3 ^ 0x53AB, arg4 + var6);
                int var26 = class171.method1221(class129.field2473, class49.field1044, arg3 ^ 0x53AB, arg4 - var6);
                if (var23 >= class50.field1050) {
                    class56.method412(arg1, (byte) -103, var25, class249.field4420[var23], var26);
                }
                if (var24 <= class56.field1143) {
                    class56.method412(arg1, (byte) -99, var25, class249.field4420[var24], var26);
                }
            }
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(IJ)V")
    public static final void method764(int arg0, long arg1) {
        class36.field809.field3565 = arg0;
        class36.field809.method1388(-52, 216);
        class36.field809.method1399((byte) -115, arg1);
        class253.field4497 = 0;
        field2060++;
        class195.field3489 = 1;
        class138.field2633 = 0;
        class153.field2890 = -3;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(BI)[B")
    public static final byte[] method765(byte arg0, int arg1) {
        field2067++;
        if (arg0 != -110) {
            field2054 = null;
        }
        class60 var2 = (class60) class221.field3968.method395((long) arg1, (byte) 119);
        if (var2 == null) {
            byte[] var3 = new byte[512];
            Random var4 = new Random((long) arg1);
            for (int var5 = 0; var5 < 255; var5++) {
                var3[var5] = (byte) var5;
            }
            for (int var6 = 0; var6 < 255; var6++) {
                int var7 = 255 - var6;
                int var8 = class30.method197(31, var7, var4);
                byte var9 = var3[var8];
                var3[var8] = var3[var7];
                var3[var7] = var3[511 - var6] = var9;
            }
            var2 = new class60(var3);
            class221.field3968.method398((long) arg1, (byte) 116, var2);
        }
        return var2.field1197;
    }

    @OriginalMember(owner = "client!de", name = "d", descriptor = "(I)V")
    public static final void method766(int arg0) {
        int var1 = class257.field4569.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (class257.field4569[var2] != null) {
                int var3 = -1;
                for (int var4 = 0; var4 < class54.field1106; var4++) {
                    if (class247.field4388[var4] == class168.field3103[var2]) {
                        var3 = var4;
                        break;
                    }
                }
                if (var3 == -1) {
                    class247.field4388[class54.field1106] = class168.field3103[var2];
                    var3 = class54.field1106++;
                }
                int var5 = 0;
                class200 var6 = new class200(class257.field4569[var2]);
                while (class257.field4569[var2].length > var6.field3565 && var5 < 511) {
                    int var7 = var3 | var5++ << 6;
                    int var8 = var6.method1410(-105);
                    int var9 = (var8 & 0x1F9B) >> 7;
                    int var10 = var8 & 0x3F;
                    int var11 = var8 >> 14;
                    int var12 = (class168.field3103[var2] >> 8) * 64 + var9 - class252.field4481;
                    int var13 = (class168.field3103[var2] & 0xFF) * 64 + var10 - class79.field1554;
                    class11 var14 = class178.method1251(var6.method1410(-53), (byte) -68);
                    if (class233.field4217[var7] == null && (var14.field387 & 0x1) > 0 && class6.field235 == var11 && var12 >= 0 && var12 + var14.field333 < 104 && var13 >= 0 && (var14.field333 + var13) < 104) {
                        class233.field4217[var7] = new class170();
                        class170 var15 = class233.field4217[var7];
                        class189.field3350[class61.field1207++] = var7;
                        var15.field3130 = var14;
                        var15.field702 = class236.field4265;
                        var15.method246(var15.field3130.field333, arg0 - 64);
                        var15.field718 = var15.field3130.field335;
                        var15.field692 = var15.field3130.field370;
                        var15.field739 = var15.field3130.field388;
                        var15.field750 = var15.field3130.field369;
                        var15.field730 = var15.field3130.field376;
                        var15.field675 = var15.field3130.field351;
                        var15.field688 = var15.field3130.field328;
                        if (var15.field675 == 0) {
                            var15.field700 = 0;
                        }
                        var15.field729 = var15.field3130.field345;
                        var15.method243(var13, var12, true, var15.method240((byte) 46), (byte) -92);
                    }
                }
            }
        }
        if (arg0 == 63) {
            field2053++;
        }
    }
}
