import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!de")
public class class108 {

    @OriginalMember(owner = "client!de", name = "g", descriptor = "Lbf;")
    public static class199 field1917 = new class199(64);

    @OriginalMember(owner = "client!de", name = "h", descriptor = "Lqk;")
    public static class207 field1918 = class24.method212(255, "welle:");

    @OriginalMember(owner = "client!de", name = "i", descriptor = "[I")
    public static int[] field1919 = new int[8];

    @OriginalMember(owner = "client!de", name = "c", descriptor = "F")
    public static float field1913;

    @OriginalMember(owner = "client!de", name = "a", descriptor = "I")
    public static int field1911;

    @OriginalMember(owner = "client!de", name = "b", descriptor = "I")
    public static int field1912;

    @OriginalMember(owner = "client!de", name = "d", descriptor = "I")
    public static int field1914;

    @OriginalMember(owner = "client!de", name = "e", descriptor = "I")
    public static int field1915;

    @OriginalMember(owner = "client!de", name = "f", descriptor = "I")
    public static int field1916;

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(I)V")
    public static final void method781(int arg0) {
        if (arg0 < 37) {
            method783((byte) -71, 27);
        }
        field1911++;
        boolean var1 = false;
        while (!var1) {
            var1 = true;
            for (int var2 = 0; var2 < class268.field4751 - 1; var2++) {
                if (class82.field1494[var2] < 1000 && class82.field1494[var2 + 1] > 1000) {
                    class207 var3 = class12.field167[var2];
                    var1 = false;
                    class12.field167[var2] = class12.field167[var2 + 1];
                    class12.field167[var2 + 1] = var3;
                    class207 var4 = class110.field1926[var2];
                    class110.field1926[var2] = class110.field1926[var2 + 1];
                    class110.field1926[var2 + 1] = var4;
                    int var5 = class85.field1551[var2];
                    class85.field1551[var2] = class85.field1551[var2 + 1];
                    class85.field1551[var2 + 1] = var5;
                    int var6 = class199.field3505[var2];
                    class199.field3505[var2] = class199.field3505[var2 + 1];
                    class199.field3505[var2 + 1] = var6;
                    int var7 = class131.field2273[var2];
                    class131.field2273[var2] = class131.field2273[var2 + 1];
                    class131.field2273[var2 + 1] = var7;
                    short var8 = class82.field1494[var2];
                    class82.field1494[var2] = class82.field1494[var2 + 1];
                    class82.field1494[var2 + 1] = var8;
                    long var9 = class282.field4960[var2];
                    class282.field4960[var2] = class282.field4960[var2 + 1];
                    class282.field4960[var2 + 1] = var9;
                }
            }
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(BII)Lmd;")
    public static final class220 method782(byte arg0, int arg1, int arg2) {
        field1912++;
        class220 var3 = class233.method1667(arg2, 16);
        if (arg1 == -1) {
            return var3;
        } else if (var3 == null || var3.field3959 == null || var3.field3959.length <= arg1) {
            return null;
        } else {
            int var4 = 81 % ((50 - arg0) / 47);
            return var3.field3959[arg1];
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(BI)V")
    public static final void method783(byte arg0, int arg1) {
        if (arg0 != 121) {
            method782((byte) -29, -65, 16);
        }
        field1914++;
        class90 var2 = class221.method1575(12, arg1, arg0 + 1651481831);
        var2.method651(-27655);
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(ILpk;)V")
    public static final void method784(int arg0, class99 arg1) {
        field1915++;
        if (arg0 != 0) {
            method781(-5);
        }
        class41.field827 = arg1;
    }

    @OriginalMember(owner = "client!de", name = "b", descriptor = "(I)V")
    public static void method785(int arg0) {
        if (arg0 != 1) {
            method781(-95);
        }
        field1919 = null;
        field1917 = null;
        field1918 = null;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(IZ)V")
    public static final void method786(int arg0, boolean arg1) {
        field1916++;
        if (arg0 != 11850) {
            field1919 = null;
        }
        byte[][] var2 = class207.field3680;
        byte var3 = 4;
        for (int var4 = 0; var4 < var3; var4++) {
            class21.method129((byte) 8);
            for (int var5 = 0; var5 < 13; var5++) {
                for (int var6 = 0; var6 < 13; var6++) {
                    int var7 = class281.field4933[var4][var5][var6];
                    if (var7 != -1) {
                        int var8 = var7 >> 24 & 0x3;
                        if (!arg1 || var8 == 0) {
                            int var9 = var7 >> 1 & 0x3;
                            int var10 = var7 >> 14 & 0x3FF;
                            int var11 = var7 >> 3 & 0x7FF;
                            int var12 = (var10 / 8 << 8) + var11 / 8;
                            for (int var13 = 0; var13 < class207.field3685.length; var13++) {
                                if (class207.field3685[var13] == var12 && var2[var13] != null) {
                                    class227.method1619(var4, (var11 & 0x7) * 8, var2[var13], var8, var9, var6 * 8, class133.field2303, arg1, 8, var5 * 8, (var10 & 0x7) * 8);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
