import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ge")
public class class173 {

    @OriginalMember(owner = "client!ge", name = "e", descriptor = "Ljava/lang/String;")
    public static String field2875 = "Continue";

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "Z")
    public static boolean field2871 = true;

    @OriginalMember(owner = "client!ge", name = "d", descriptor = "Lsf;")
    public static class124 field2874 = new class124(128);

    @OriginalMember(owner = "client!ge", name = "k", descriptor = "I")
    public static int field2881 = 0;

    @OriginalMember(owner = "client!ge", name = "j", descriptor = "I")
    public static int field2880 = 0;

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "I")
    public static int field2872;

    @OriginalMember(owner = "client!ge", name = "c", descriptor = "I")
    public static int field2873;

    @OriginalMember(owner = "client!ge", name = "f", descriptor = "I")
    public static int field2876;

    @OriginalMember(owner = "client!ge", name = "h", descriptor = "I")
    public static int field2878;

    @OriginalMember(owner = "client!ge", name = "i", descriptor = "I")
    public static int field2879;

    @OriginalMember(owner = "client!ge", name = "g", descriptor = "Lje;")
    public static class84 field2877;

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(ILek;II)[Lbn;", line = 4)
    public static final class75[] method1227(int arg0, class206 arg1, int arg2, int arg3) {
        field2873++;
        if (arg0 != 9773) {
            method1232(-112, 19, -77);
        }
        return class76.method581(arg1, arg0 ^ 0x2657, arg2, arg3) ? class207.method1438(true) : null;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(II)V", line = 19)
    public static final void method1228(int arg0, int arg1) {
        class312 var2 = class353.field5644[0][arg0][arg1];
        for (int var3 = 0; var3 < 3; var3++) {
            class312 var4 = class353.field5644[var3][arg0][arg1] = class353.field5644[var3 + 1][arg0][arg1];
            if (var4 != null) {
                var4.field5091--;
                for (int var5 = 0; var5 < var4.field5078; var5++) {
                    class278 var6 = var4.field5089[var5];
                    if ((var6.field4527 >> 29 & 0x3L) == 2L && var6.field4523 == arg0 && var6.field4530 == arg1) {
                        var6.field4532--;
                    }
                }
            }
        }
        if (class353.field5644[0][arg0][arg1] == null) {
            class353.field5644[0][arg0][arg1] = new class312(0, arg0, arg1);
        }
        class353.field5644[0][arg0][arg1].field5079 = var2;
        class353.field5644[3][arg0][arg1] = null;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(I)V", line = 59)
    public static void method1229(int arg0) {
        field2874 = null;
        field2875 = null;
        field2877 = null;
        if (arg0 != 2) {
            method1233(-25);
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(ZIIILjava/lang/String;ZLjava/lang/String;IZJZ)V", line = 72)
    public static final void method1230(boolean arg0, int arg1, int arg2, int arg3, String arg4, boolean arg5, String arg6, int arg7, boolean arg8, long arg9, boolean arg10) {
        field2872++;
        int[] var12 = new int[4];
        for (int var13 = 0; var13 < 3; var13++) {
            var12[var13] = (int) (Math.random() * 9.9999999E7D);
        }
        if (!arg0) {
            field2875 = (String) null;
        }
        class146 var14 = new class146(128);
        var14.method1027(10, -20374);
        var14.method1002((byte) -106, (arg10 ? 4 : 0) | (arg8 ? 2 : 0) | (arg5 ? 1 : 0));
        var14.method1003((byte) -15, arg9);
        var14.method1045((byte) -10, var12[0]);
        var14.method1012(arg4, (byte) 56);
        var14.method1045((byte) 117, var12[1]);
        var14.method1002((byte) -96, class363.field5745);
        var14.method1027(arg2, -20374);
        var14.method1027(arg3, -20374);
        var14.method1045((byte) -67, var12[2]);
        var14.method1002((byte) -118, arg1);
        var14.method1002((byte) -121, arg7);
        var14.method1045((byte) -119, var12[3]);
        var14.method995(-1, class135.field2317, class81.field1413);
        class146 var15 = new class146(350);
        var15.method1012(arg6, (byte) 45);
        int var16 = 8 - (class148.method1066(arg6, (byte) 57) % 8);
        for (int var17 = 0; var17 < var16; var17++) {
            var15.method1027((int) (Math.random() * 255.0D), -20374);
        }
        var15.method1038(var12, (byte) -84);
        class51.field1038.field2435 = 0;
        class51.field1038.method1027(22, -20374);
        class51.field1038.method1002((byte) -84, var15.field2435 + var14.field2435 + 2);
        class51.field1038.method1002((byte) -95, 553);
        class51.field1038.method1037(var14.field2496, 0, -111, var14.field2435);
        class51.field1038.method1037(var15.field2496, 0, 37, var15.field2435);
        field2881 = 0;
        class208.field3481 = 0;
        class46.field927 = -3;
        class65.field1234 = 1;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(ZII)Lig;", line = 138)
    public static final class199 method1231(boolean arg0, int arg1, int arg2) {
        field2879++;
        class199 var3 = (class199) class85.field1465.method2344(-1, (long) arg1 << 32 | (long) arg2);
        if (arg0) {
            field2871 = true;
        }
        if (var3 == null) {
            var3 = new class199(arg1, arg2);
            class85.field1465.method2337(var3, 709, var3.field1291);
        }
        return var3;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(III)Z", line = 157)
    public static final boolean method1232(int arg0, int arg1, int arg2) {
        field2876++;
        if (!class5.field87) {
            return false;
        }
        int var3 = arg0 >> 16;
        int var4 = 112 % ((arg1 + 75) / 36);
        int var5 = arg0 & 0xFFFF;
        if (class178.field2938[var3] == null || class178.field2938[var3][var5] == null) {
            return false;
        }
        class181 var6 = class178.field2938[var3][var5];
        if (arg2 == -1 && var6.field3098 == 0) {
            for (int var7 = 0; var7 < class137.field2343; var7++) {
                if (class107.field1938[var7] == 11 || class107.field1938[var7] == 1011 || class107.field1938[var7] == 20 || class107.field1938[var7] == 41 || class107.field1938[var7] == 12) {
                    for (class181 var8 = class224.method1564(-116, class317.field5172[var7]); var8 != null; var8 = class328.method2339(-109, var8)) {
                        if (var6.field3103 == var8.field3103) {
                            return true;
                        }
                    }
                }
            }
        } else {
            for (int var9 = 0; var9 < class137.field2343; var9++) {
                if (class206.field3450[var9] == arg2 && class317.field5172[var9] == var6.field3103 && (class107.field1938[var9] == 11 || class107.field1938[var9] == 1011 || class107.field1938[var9] == 20 || class107.field1938[var9] == 41 || class107.field1938[var9] == 12)) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "(I)Loe;", line = 227)
    public static final class146 method1233(int arg0) {
        field2878++;
        class146 var1 = new class146(34);
        var1.method1027(11, arg0 - 52957);
        var1.method1027(class152.field2601, -20374);
        var1.method1027(class207.field3462 ? 1 : 0, -20374);
        var1.method1027(class166.field2784 ? 1 : 0, arg0 - 52957);
        var1.method1027(class349.field5590 ? 1 : 0, -20374);
        var1.method1027(class136.field2333 ? 1 : 0, -20374);
        var1.method1027(class53.field1060 ? 1 : 0, -20374);
        var1.method1027(class359.field5723 ? 1 : 0, -20374);
        var1.method1027(class358.field5697 ? 1 : 0, -20374);
        var1.method1027(class252.field4143 ? 1 : 0, -20374);
        var1.method1027(class111.field2032, arg0 - 52957);
        var1.method1027(class281.field4606 ? 1 : 0, -20374);
        var1.method1027(class68.field1254 ? 1 : 0, arg0 - 52957);
        var1.method1027(class264.field4330 ? 1 : 0, -20374);
        var1.method1027(class178.field2937, arg0 ^ 0xFFFFCF2D);
        var1.method1027(class277.field4519 ? 1 : 0, -20374);
        var1.method1027(class8.field268, -20374);
        var1.method1027(class52.field1045, -20374);
        var1.method1027(class30.field706, -20374);
        var1.method1002((byte) -107, class217.field3616);
        var1.method1002((byte) -94, class146.field2459);
        if (arg0 != 32583) {
            return (class146) null;
        }
        var1.method1027(class214.method1489(), -20374);
        var1.method1045((byte) 118, class97.field1761);
        var1.method1027(class135.field2318, -20374);
        var1.method1027(class171.field2832 ? 1 : 0, arg0 ^ 0xFFFFCF2D);
        var1.method1027(class151.field2559 ? 1 : 0, arg0 - 52957);
        var1.method1027(class248.field4071, -20374);
        var1.method1027(class133.field2281 ? 1 : 0, -20374);
        var1.method1027(class115.field2080 ? 1 : 0, -20374);
        return var1;
    }
}
