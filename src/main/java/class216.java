import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dk")
public class class216 {

    @OriginalMember(owner = "client!dk", name = "d", descriptor = "Lhi;")
    public static class82 field3763 = class95.method664((byte) -38, "Starte 3D)2Softwarebibliothek)3");

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "I")
    public static int field3760;

    @OriginalMember(owner = "client!dk", name = "b", descriptor = "I")
    public static int field3761;

    @OriginalMember(owner = "client!dk", name = "c", descriptor = "I")
    public static int field3762;

    @OriginalMember(owner = "client!dk", name = "e", descriptor = "I")
    public static int field3764;

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(IB)Lhk;", line = 9)
    public static final class40 method1539(int arg0, byte arg1) {
        field3760++;
        class40 var2 = (class40) class253.field4353.method2250((long) arg0, false);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class52.field846.method1577(arg0, 0, -29569);
        if (var3 == null) {
            return null;
        }
        if (arg1 != 89) {
            field3763 = (class82) null;
        }
        class40 var4 = new class40();
        class153 var5 = new class153(var3);
        var5.field2611 = var5.field2598.length - 2;
        int var6 = var5.method1090(false);
        int var7 = var5.field2598.length - var6 - 12 - 2;
        var5.field2611 = var7;
        int var8 = var5.method1097((byte) -77);
        var4.field688 = var5.method1090(false);
        var4.field691 = var5.method1090(false);
        var4.field707 = var5.method1090(false);
        var4.field698 = var5.method1090(false);
        int var9 = var5.method1082(arg1 - 151);
        if (var9 > 0) {
            var4.field706 = new class79[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                int var11 = var5.method1090(false);
                class79 var12 = new class79(class135.method922(21793, var11));
                var4.field706[var10] = var12;
                while (var11-- > 0) {
                    int var13 = var5.method1097((byte) -116);
                    int var14 = var5.method1097((byte) -96);
                    var12.method503((long) var13, arg1 ^ 0xFFFFFFD7, new class259(var14));
                }
            }
        }
        var5.field2611 = 0;
        var4.field704 = var5.method1088(0);
        var4.field693 = new class82[var8];
        var4.field689 = new int[var8];
        int var15 = 0;
        var4.field703 = new int[var8];
        while (var7 > var5.field2611) {
            int var16 = var5.method1090(false);
            if (var16 == 3) {
                var4.field693[var15] = var5.method1092((byte) 118);
            } else if (var16 >= 100 || var16 == 21 || var16 == 38 || var16 == 39) {
                var4.field689[var15] = var5.method1082(-102);
            } else {
                var4.field689[var15] = var5.method1097((byte) -71);
            }
            var4.field703[var15++] = var16;
        }
        class253.field4353.method2255(var4, (long) arg0, false);
        return var4;
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(Lfi;BIIII)V", line = 115)
    public static final void method1540(class241 arg0, byte arg1, int arg2, int arg3, int arg4, int arg5) {
        field3764++;
        if (arg0.field4178 == -1 && arg0.field4168 == null) {
            return;
        }
        int var6 = 0;
        if (arg0.field4184 < arg3) {
            var6 += arg3 - arg0.field4184;
        } else if (arg3 < arg0.field4192) {
            var6 += arg0.field4192 - arg3;
        }
        if (arg5 > arg0.field4193) {
            var6 += arg5 - arg0.field4193;
        } else if (arg5 < arg0.field4196) {
            var6 += arg0.field4196 - arg5;
        }
        if (arg0.field4172 == 0 || var6 - 64 > arg0.field4172 || class138.field2373 == 0 || arg0.field4180 != arg4) {
            if (arg0.field4181 != null) {
                class219.field3803.method882(arg0.field4181);
                arg0.field4181 = null;
            }
            if (arg0.field4187 != null) {
                class219.field3803.method882(arg0.field4187);
                arg0.field4187 = null;
            }
            return;
        }
        var6 -= 64;
        if (var6 < 0) {
            var6 = 0;
        }
        int var7 = (arg0.field4172 - var6) * class138.field2373 / arg0.field4172;
        if (arg0.field4181 != null) {
            arg0.field4181.method1720(var7);
        } else if (arg0.field4178 >= 0) {
            class96 var8 = class96.method668(class286.field4822, arg0.field4178, 0);
            if (var8 != null) {
                class154 var9 = var8.method669().method1108(class64.field992);
                class239 var10 = class239.method1723(var9, 100, var7);
                var10.method1711(-1);
                class219.field3803.method876(var10);
                arg0.field4181 = var10;
            }
        }
        if (arg0.field4187 != null) {
            arg0.field4187.method1720(var7);
            if (!arg0.field4187.method960(12498)) {
                arg0.field4187 = null;
            }
        } else if (arg0.field4168 != null && (arg0.field4175 -= arg2) <= 0) {
            int var11 = (int) ((double) arg0.field4168.length * Math.random());
            class96 var12 = class96.method668(class286.field4822, arg0.field4168[var11], 0);
            if (var12 != null) {
                class154 var13 = var12.method669().method1108(class64.field992);
                class239 var14 = class239.method1723(var13, 100, var7);
                var14.method1711(0);
                class219.field3803.method876(var14);
                arg0.field4175 = (int) ((double) (arg0.field4195 - arg0.field4185) * Math.random()) + arg0.field4185;
                arg0.field4187 = var14;
            }
        }
        int var15 = -20 % ((arg1 + 69) / 33);
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(Lbc;I)Lmb;", line = 243)
    public static final class109 method1541(class153 arg0, int arg1) {
        class109 var2 = new class109(arg0.method1092((byte) 118), arg0.method1092((byte) 118), arg0.method1090(false), arg0.method1090(false), arg0.method1097((byte) -81), arg0.method1082(arg1 + 12589) == 1);
        int var3 = arg0.method1082(-72);
        field3762++;
        if (arg1 != -12666) {
            method1540((class241) null, (byte) -16, -84, 94, -45, -127);
        }
        for (int var4 = 0; var4 < var3; var4++) {
            var2.field1938.method1940((byte) 120, new class235(arg0.method1090(false), arg0.method1090(false), arg0.method1090(false), arg0.method1090(false)));
        }
        var2.method751(12800);
        return var2;
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(IILuh;Luh;ZZB)I", line = 266)
    public static final int method1542(int arg0, int arg1, class67 arg2, class67 arg3, boolean arg4, boolean arg5, byte arg6) {
        field3761++;
        int var7 = class290.method2004(arg3, 82, arg4, arg1, arg2);
        if (var7 != 0) {
            return arg4 ? -var7 : var7;
        } else if (arg0 == -1) {
            return 0;
        } else if (arg6 <= 55) {
            return -56;
        } else {
            int var8 = class290.method2004(arg3, 113, arg5, arg0, arg2);
            return arg5 ? -var8 : var8;
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(I)V", line = 304)
    public static void method1543(int arg0) {
        field3763 = null;
        if (arg0 <= 35) {
            field3763 = (class82) null;
        }
    }
}
