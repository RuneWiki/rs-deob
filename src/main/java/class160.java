import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rh")
public abstract class class160 {

    @OriginalMember(owner = "client!rh", name = "b", descriptor = "[Lfh;")
    public static class54[] field3337 = new class54[4];

    @OriginalMember(owner = "client!rh", name = "d", descriptor = "[I")
    public static int[] field3339 = new int[25];

    @OriginalMember(owner = "client!rh", name = "g", descriptor = "Lea;")
    private static class38 field3342 = class9.method46((byte) 122, "Welcome to RuneScape");

    @OriginalMember(owner = "client!rh", name = "c", descriptor = "Lea;")
    public static class38 field3338 = field3342;

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "I")
    public static int field3336;

    @OriginalMember(owner = "client!rh", name = "e", descriptor = "I")
    public static int field3340;

    @OriginalMember(owner = "client!rh", name = "f", descriptor = "I")
    public static int field3341;

    @OriginalMember(owner = "client!rh", name = "h", descriptor = "I")
    public static int field3343;

    @OriginalMember(owner = "client!rh", name = "i", descriptor = "[[I")
    public static int[][] field3344;

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(IIILr;Z)V")
    public static final void method1154(int arg0, int arg1, int arg2, class152 arg3, boolean arg4) {
        field3341++;
        if (class94.field2121 >= 400) {
            return;
        }
        if (arg3.field3139 != null) {
            arg3 = arg3.method1068((byte) 89);
        }
        if (arg3 == null || (arg4 || !arg3.field3126)) {
            return;
        }
        class38 var5 = arg3.field3167;
        if (arg3.field3134 != 0) {
            var5 = class163.method1168(106, new class38[] { var5, class130.method960(-3, arg3.field3134, class195.field3842.field3007), class151.field3118, class185.field3682, class151.method1059(arg3.field3134, (byte) -114), class63.field1539 });
        }
        if (class114.field2529 == 1) {
            class17.method101(33, arg2, class163.field3384, arg1, true, class163.method1168(119, new class38[] { class154.field3210, class185.field3678, var5 }), arg0);
            class109.field2445++;
        } else if (!class23.field489) {
            class38[] var6 = arg3.field3176;
            class170.field3485++;
            if (class86.field2009) {
                var6 = class135.method983(var6, 5);
            }
            if (var6 != null) {
                for (int var7 = 4; var7 >= 0; var7--) {
                    if (var6[var7] != null && !var6[var7].method263(class43.field941, (byte) 89)) {
                        class199.field3934++;
                        byte var8 = 0;
                        if (var7 == 0) {
                            var8 = 51;
                        }
                        if (var7 == 1) {
                            var8 = 26;
                        }
                        if (var7 == 2) {
                            var8 = 1;
                        }
                        if (var7 == 3) {
                            var8 = 9;
                        }
                        if (var7 == 4) {
                            var8 = 8;
                        }
                        class17.method101(var8, arg2, var6[var7], arg1, true, class163.method1168(-5, new class38[] { class28.field568, var5 }), arg0);
                    }
                }
            }
            if (var6 != null) {
                for (int var9 = 4; var9 >= 0; var9--) {
                    if (var6[var9] != null && var6[var9].method263(class43.field941, (byte) 53)) {
                        short var10 = 0;
                        if (arg3.field3134 > class195.field3842.field3007) {
                            var10 = 2000;
                        }
                        class16.field341++;
                        int var11 = 0;
                        if (var9 == 0) {
                            var11 = var10 + 51;
                        }
                        if (var9 == 1) {
                            var11 = var10 + 26;
                        }
                        if (var9 == 2) {
                            var11 = var10 + 1;
                        }
                        if (var9 == 3) {
                            var11 = var10 + 9;
                        }
                        if (var9 == 4) {
                            var11 = var10 + 8;
                        }
                        class17.method101(var11, arg2, var6[var9], arg1, !arg4, class163.method1168(112, new class38[] { class28.field568, var5 }), arg0);
                    }
                }
            }
            class17.method101(1007, arg2, class176.field3561, arg1, true, class163.method1168(125, new class38[] { class28.field568, var5 }), arg0);
        } else if ((class140.field2917 & 0x2) == 2) {
            class17.method101(6, arg2, class10.field220, arg1, true, class163.method1168(113, new class38[] { class146.field3040, class185.field3678, var5 }), arg0);
            class97.field2170++;
            return;
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(BI)I")
    public static final int method1155(byte arg0, int arg1) {
        field3340++;
        int var2 = 0;
        if (arg1 < 0 || arg1 >= 65536) {
            var2 += 16;
            arg1 >>>= 0x10;
        }
        if (arg1 >= 256) {
            var2 += 8;
            arg1 >>>= 0x8;
        }
        if (arg1 >= 16) {
            arg1 >>>= 0x4;
            var2 += 4;
        }
        if (arg0 != 24) {
            return 30;
        }
        if (arg1 >= 4) {
            arg1 >>>= 0x2;
            var2 += 2;
        }
        if (arg1 >= 1) {
            var2++;
            arg1 >>>= 0x1;
        }
        return arg1 + var2;
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(B)V")
    public static void method1156(byte arg0) {
        field3337 = null;
        field3344 = null;
        field3338 = null;
        if (arg0 == 124) {
            field3342 = null;
            field3339 = null;
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(I)[B")
    public abstract byte[] method703(int arg0);

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(Lhc;ZI)Lea;")
    public static final class38 method1157(class66 arg0, boolean arg1, int arg2) {
        field3343++;
        try {
            if (arg1) {
                field3339 = null;
            }
            class38 var3 = new class38();
            var3.field802 = arg0.method492(255);
            if (arg2 < var3.field802) {
                var3.field802 = arg2;
            }
            var3.field821 = new byte[var3.field802];
            arg0.field1620 += class127.field2720.method186(var3.field821, arg0.field1620, -128, arg0.field1627, var3.field802, 0);
            return var3;
        } catch (Exception var4) {
            return class112.field2498;
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "([BB)V")
    public abstract void method704(byte[] arg0, byte arg1);
}
