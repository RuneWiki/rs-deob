import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ua")
public abstract class class591 {

    @OriginalMember(owner = "client!ua", name = "c", descriptor = "Lvg;")
    public static class622 field8589 = new class622(69, 5);

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "I")
    public static int field8588;

    @OriginalMember(owner = "client!ua", name = "e", descriptor = "I")
    public static int field8591;

    @OriginalMember(owner = "client!ua", name = "f", descriptor = "Lmv;")
    public static class295 field8592;

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "[I")
    public static int[] field8587;

    @OriginalMember(owner = "client!ua", name = "d", descriptor = "[[[Lms;")
    public static class44[][][] field8590;

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(Lwo;Z)Z", line = 4)
    public static final boolean method3367(class293 arg0, boolean arg1) {
        boolean var2 = class383.field5753 == class178.field2480;
        int var3 = 0;
        short var4 = 0;
        byte var5 = 0;
        arg0.method1803((byte) -76);
        if (arg0.field4299 < 0 || arg0.field4300 < 0 || arg0.field4294 >= class91.field1390 || arg0.field4305 >= class575.field8372) {
            return false;
        }
        short var6 = 0;
        for (int var7 = arg0.field4299; var7 <= arg0.field4294; var7++) {
            for (int var11 = arg0.field4300; var11 <= arg0.field4305; var11++) {
                class44 var12 = class471.method2715(arg0.field7905, var7, var11);
                if (var12 != null) {
                    class361 var13 = class654.method3698((byte) 92, arg0);
                    class361 var14 = var12.field667;
                    if (var14 == null) {
                        var12.field667 = var13;
                    } else {
                        while (var14.field5299 != null) {
                            var14 = var14.field5299;
                        }
                        var14.field5299 = var13;
                    }
                    if (var2 && (class697.field9813[var7][var11] & 0xFF000000) != 0) {
                        var3 = class697.field9813[var7][var11];
                        var4 = class267.field3482[var7][var11];
                        var5 = class319.field4644[var7][var11];
                    }
                    if (!arg1 && var12.field672 != null && var12.field672.field7270 > var6) {
                        var6 = var12.field672.field7270;
                    }
                }
            }
        }
        if (var2 && (var3 & 0xFF000000) != 0) {
            for (int var8 = arg0.field4299; var8 <= arg0.field4294; var8++) {
                for (int var9 = arg0.field4300; var9 <= arg0.field4305; var9++) {
                    if ((class697.field9813[var8][var9] & 0xFF000000) == 0) {
                        class697.field9813[var8][var9] = var3;
                        class267.field3482[var8][var9] = var4;
                        class319.field4644[var8][var9] = var5;
                    }
                }
            }
        }
        if (arg1) {
            class117.field1753[class296.field4366++] = arg0;
        } else {
            int var10 = class383.field5753 == class178.field2480 ? 1 : 0;
            if (!arg0.method270(-66)) {
                class153.field2152[var10][class464.field6700[var10]++] = arg0;
            } else if (arg0.method274(-1510217528)) {
                class403.field6051[var10][class48.field760[var10]++] = arg0;
            } else {
                class313.field4591[var10][class311.field4576[var10]++] = arg0;
            }
        }
        if (arg1) {
            arg0.field7894 -= var6;
        }
        return true;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(II)Z", line = 115)
    public static final boolean method3368(int arg0, int arg1) {
        if (arg1 != 26386) {
            field8592 = null;
        }
        field8588++;
        return arg0 == 3 || arg0 == 4 || arg0 == 5 || arg0 == 6;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(Z)V", line = 135)
    public static void method3369(boolean arg0) {
        field8590 = null;
        field8592 = null;
        field8587 = null;
        if (!arg0) {
            method3367(null, false);
        }
        field8589 = null;
    }
}
