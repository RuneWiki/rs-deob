import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sg")
public class class195 {

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "[I")
    public static int[] field3152 = new int[14];

    @OriginalMember(owner = "client!sg", name = "e", descriptor = "[Z")
    public static boolean[] field3155 = new boolean[5];

    @OriginalMember(owner = "client!sg", name = "j", descriptor = "[I")
    public static int[] field3160 = new int[2500];

    @OriginalMember(owner = "client!sg", name = "g", descriptor = "I")
    public static int field3157 = 10;

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "Lqd;")
    public static class173 field3151 = new class173(200);

    @OriginalMember(owner = "client!sg", name = "m", descriptor = "I")
    public static int field3163 = 0;

    @OriginalMember(owner = "client!sg", name = "c", descriptor = "I")
    public static int field3153;

    @OriginalMember(owner = "client!sg", name = "d", descriptor = "I")
    public static int field3154;

    @OriginalMember(owner = "client!sg", name = "f", descriptor = "I")
    public static int field3156;

    @OriginalMember(owner = "client!sg", name = "i", descriptor = "I")
    public static int field3159;

    @OriginalMember(owner = "client!sg", name = "k", descriptor = "I")
    public static int field3161;

    @OriginalMember(owner = "client!sg", name = "h", descriptor = "Ldk;")
    public static class251 field3158;

    @OriginalMember(owner = "client!sg", name = "l", descriptor = "Ldk;")
    public static class251 field3162;

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(B)V")
    public static void method1366(byte arg0) {
        field3160 = null;
        field3155 = null;
        field3158 = null;
        field3162 = null;
        field3151 = null;
        field3152 = null;
        if (arg0 > -107) {
            method1369((class211[]) null, -126, (byte) -46);
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(ILdk;Ldk;Ldk;)V")
    public static final void method1367(int arg0, class251 arg1, class251 arg2, class251 arg3) {
        class203.field3244 = arg1;
        int var4 = 57 / ((arg0 - 72) / 35);
        class1.field20 = arg3;
        class245.field3894 = arg2;
        field3153++;
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(IB)Lmk;")
    public static final class228 method1368(int arg0, byte arg1) {
        if (arg1 != -95) {
            method1370(false, (class251) null);
        }
        class228 var2 = (class228) class63.field1048.method694((long) arg0, false);
        field3154++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class10.field105.method1680(0, arg0, -78);
        if (var3 == null || var3.length <= 1) {
            return null;
        } else {
            class228 var4 = class236.method1604(var3, (byte) 127);
            class63.field1048.method693((long) arg0, -108, var4);
            return var4;
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "([Lag;IB)V")
    public static final void method1369(class211[] arg0, int arg1, byte arg2) {
        field3159++;
        for (int var3 = 0; var3 < arg0.length; var3++) {
            class211 var4 = arg0[var3];
            if (var4 != null) {
                if (var4.field3385 == 0) {
                    if (var4.field3352 != null) {
                        method1369(var4.field3352, arg1, (byte) -113);
                    }
                    class97 var5 = (class97) class244.field3880.method1059(0, (long) var4.field3375);
                    if (var5 != null) {
                        class258.method1733((byte) 95, var5.field1556, arg1);
                    }
                }
                if (arg1 == 0 && var4.field3484 != null) {
                    class126 var6 = new class126();
                    var6.field1989 = var4.field3484;
                    var6.field2000 = var4;
                    class137.method960(200000, var6);
                }
                if (arg1 == 1 && var4.field3481 != null) {
                    if (var4.field3413 >= 0) {
                        class211 var7 = class17.method87(var4.field3375, -20055);
                        if (var7 == null || var7.field3352 == null || var4.field3413 >= var7.field3352.length || var7.field3352[var4.field3413] != var4) {
                            continue;
                        }
                    }
                    class126 var8 = new class126();
                    var8.field2000 = var4;
                    var8.field1989 = var4.field3481;
                    class137.method960(200000, var8);
                }
            }
        }
        if (arg2 >= -112) {
            field3157 = 83;
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(ZLdk;)V")
    public static final void method1370(boolean arg0, class251 arg1) {
        field3156++;
        if (!arg0) {
            class181.field2954 = arg1;
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(Lam;Ldk;ILdk;Ldk;)Z")
    public static final boolean method1371(class314 arg0, class251 arg1, int arg2, class251 arg3, class251 arg4) {
        class84.field1392 = arg0;
        class46.field785 = arg3;
        class11.field119 = arg1;
        field3161++;
        class307.field4920 = arg4;
        if (arg2 <= 47) {
            method1366((byte) -28);
        }
        return true;
    }
}
