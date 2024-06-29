import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ub")
public class class188 extends class101 {

    @OriginalMember(owner = "client!ub", name = "K", descriptor = "I")
    public int field3627 = -1;

    @OriginalMember(owner = "client!ub", name = "C", descriptor = "I")
    public int field3619 = 5;

    @OriginalMember(owner = "client!ub", name = "R", descriptor = "I")
    public int field3634 = -1;

    @OriginalMember(owner = "client!ub", name = "H", descriptor = "I")
    public int field3624 = 99;

    @OriginalMember(owner = "client!ub", name = "B", descriptor = "I")
    public int field3618 = -1;

    @OriginalMember(owner = "client!ub", name = "ab", descriptor = "I")
    public int field3643 = -1;

    @OriginalMember(owner = "client!ub", name = "X", descriptor = "I")
    public int field3640 = 2;

    @OriginalMember(owner = "client!ub", name = "eb", descriptor = "I")
    public int field3647 = -1;

    @OriginalMember(owner = "client!ub", name = "hb", descriptor = "Z")
    public boolean field3650 = false;

    @OriginalMember(owner = "client!ub", name = "M", descriptor = "Ltg;")
    public static class184 field3629 = class135.method812(" <col=ffffff>", 3);

    @OriginalMember(owner = "client!ub", name = "gb", descriptor = "Ltg;")
    public static class184 field3649 = class135.method812("", 3);

    @OriginalMember(owner = "client!ub", name = "I", descriptor = "Ltg;")
    public static class184 field3625 = field3649;

    @OriginalMember(owner = "client!ub", name = "D", descriptor = "Ltg;")
    public static class184 field3620 = field3649;

    @OriginalMember(owner = "client!ub", name = "J", descriptor = "Ltg;")
    public static class184 field3626 = field3649;

    @OriginalMember(owner = "client!ub", name = "ib", descriptor = "Ltg;")
    public static class184 field3651 = field3649;

    @OriginalMember(owner = "client!ub", name = "P", descriptor = "Ltg;")
    public static class184 field3632 = field3649;

    @OriginalMember(owner = "client!ub", name = "F", descriptor = "Ltg;")
    public static class184 field3622 = field3649;

    @OriginalMember(owner = "client!ub", name = "A", descriptor = "I")
    public static int field3617;

    @OriginalMember(owner = "client!ub", name = "E", descriptor = "I")
    public static int field3621;

    @OriginalMember(owner = "client!ub", name = "G", descriptor = "I")
    public static int field3623;

    @OriginalMember(owner = "client!ub", name = "N", descriptor = "I")
    public static int field3630;

    @OriginalMember(owner = "client!ub", name = "O", descriptor = "I")
    public static int field3631;

    @OriginalMember(owner = "client!ub", name = "Q", descriptor = "I")
    public static int field3633;

    @OriginalMember(owner = "client!ub", name = "T", descriptor = "I")
    public static int field3636;

    @OriginalMember(owner = "client!ub", name = "U", descriptor = "I")
    public static int field3637;

    @OriginalMember(owner = "client!ub", name = "Y", descriptor = "I")
    public static int field3641;

    @OriginalMember(owner = "client!ub", name = "Z", descriptor = "I")
    public static int field3642;

    @OriginalMember(owner = "client!ub", name = "bb", descriptor = "I")
    public static int field3644;

    @OriginalMember(owner = "client!ub", name = "db", descriptor = "I")
    public static int field3646;

    @OriginalMember(owner = "client!ub", name = "L", descriptor = "[I")
    public static int[] field3628;

    @OriginalMember(owner = "client!ub", name = "S", descriptor = "[I")
    public int[] field3635;

    @OriginalMember(owner = "client!ub", name = "V", descriptor = "[I")
    public int[] field3638;

    @OriginalMember(owner = "client!ub", name = "W", descriptor = "[I")
    private int[] field3639;

    @OriginalMember(owner = "client!ub", name = "cb", descriptor = "[I")
    public int[] field3645;

    @OriginalMember(owner = "client!ub", name = "fb", descriptor = "[I")
    private int[] field3648;

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(BILoh;)Loh;")
    public final class140 method1184(byte arg0, int arg1, class140 arg2) {
        int var4 = this.field3645[arg1];
        class54 var5 = class21.method129(var4 >> 16, 3);
        int var6 = var4 & 0xFFFF;
        field3621++;
        if (var5 == null) {
            return arg2.method546(true);
        }
        class140 var7 = arg2.method546(!var5.method292(var6, (byte) -6));
        var7.method548(var5, var6);
        if (arg0 > -29) {
            method1195(-95, 99, 0, 77, null, null, -81, -9, 98, -32, 105L);
        }
        return var7;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(Ltg;I)V")
    public static final void method1185(class184 arg0, int arg1) {
        field3630++;
        if (class186.field3606 == null) {
            return;
        }
        int var2 = 0;
        long var3 = arg0.method1160(0);
        if (var3 == 0L) {
            return;
        }
        while (var2 < class186.field3606.length && class186.field3606[var2].field2393 != var3) {
            var2++;
        }
        if (class186.field3606.length > var2 && class186.field3606[var2] != null) {
            int var5 = 34 / ((42 - arg1) / 32);
            class128.field2320++;
            class117.field2122.method106(9, -119);
            class117.field2122.method607(class186.field3606[var2].field2393, 65);
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(Loh;II)Loh;")
    public final class140 method1186(class140 arg0, int arg1, int arg2) {
        field3623++;
        int var4 = this.field3645[arg1];
        class54 var5 = class21.method129(var4 >> 16, 3);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method546(true);
        }
        class54 var7 = null;
        int var8 = 0;
        if (this.field3648 != null && this.field3648.length > arg1) {
            int var9 = this.field3648[arg1];
            var7 = class21.method129(var9 >> 16, 3);
            var8 = var9 & 0xFFFF;
        }
        if (var7 == null || var8 == 65535) {
            class140 var11 = arg0.method546(!var5.method292(var6, (byte) -6));
            var11.method548(var5, var6);
            return var11;
        }
        class140 var10 = arg0.method546(!var5.method292(var6, (byte) -6) & !var7.method292(var8, (byte) -6));
        var10.method548(var5, var6);
        var10.method548(var7, var8);
        if (arg2 != 9999999) {
            this.method1190(null, -74, -15, (byte) -78);
        }
        return var10;
    }

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "(Z)V")
    public static void method1187(boolean arg0) {
        field3649 = null;
        field3622 = null;
        field3628 = null;
        field3625 = null;
        if (arg0) {
            return;
        }
        field3651 = null;
        field3632 = null;
        field3620 = null;
        field3629 = null;
        field3626 = null;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(ILka;B)V")
    private final void method1188(int arg0, class97 arg1, byte arg2) {
        if (arg2 != -93) {
            this.field3634 = -17;
        }
        field3631++;
        if (arg0 == 1) {
            int var11 = arg1.method611(false);
            this.field3638 = new int[var11];
            for (int var12 = 0; var12 < var11; var12++) {
                this.field3638[var12] = arg1.method611(false);
            }
            this.field3645 = new int[var11];
            for (int var13 = 0; var13 < var11; var13++) {
                this.field3645[var13] = arg1.method611(false);
            }
            for (int var14 = 0; var14 < var11; var14++) {
                this.field3645[var14] = (arg1.method611(false) << 16) + this.field3645[var14];
            }
        } else if (arg0 == 2) {
            this.field3627 = arg1.method611(false);
        } else if (arg0 == 3) {
            int var9 = arg1.method588((byte) -66);
            this.field3639 = new int[var9 + 1];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field3639[var10] = arg1.method588((byte) -118);
            }
            this.field3639[var9] = 9999999;
        } else if (arg0 == 4) {
            this.field3650 = true;
        } else if (arg0 == 5) {
            this.field3619 = arg1.method588((byte) -31);
        } else if (arg0 == 6) {
            this.field3643 = arg1.method611(false);
        } else if (arg0 == 7) {
            this.field3634 = arg1.method611(false);
        } else if (arg0 == 8) {
            this.field3624 = arg1.method588((byte) -50);
        } else if (arg0 == 9) {
            this.field3618 = arg1.method588((byte) -93);
        } else if (arg0 == 10) {
            this.field3647 = arg1.method588((byte) -47);
        } else if (arg0 == 11) {
            this.field3640 = arg1.method588((byte) -56);
        } else if (arg0 == 12) {
            int var6 = arg1.method588((byte) -102);
            this.field3648 = new int[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field3648[var7] = arg1.method611(false);
            }
            for (int var8 = 0; var8 < var6; var8++) {
                this.field3648[var8] = (arg1.method611(false) << 16) + this.field3648[var8];
            }
        } else if (arg0 == 13) {
            int var4 = arg1.method588((byte) -92);
            this.field3635 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field3635[var5] = arg1.method568((byte) -111);
            }
            return;
        }
    }

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "(I)V")
    public static final void method1189(int arg0) {
        if (arg0 < 50) {
            return;
        }
        field3633++;
        boolean var1 = false;
        while (!var1) {
            var1 = true;
            for (int var2 = 0; var2 < class133.field2404 - 1; var2++) {
                if (class54.field960[var2] < 1000 && class54.field960[var2 + 1] > 1000) {
                    class184 var3 = class174.field3298[var2];
                    class174.field3298[var2] = class174.field3298[var2 + 1];
                    class174.field3298[var2 + 1] = var3;
                    class184 var4 = class38.field719[var2];
                    var1 = false;
                    class38.field719[var2] = class38.field719[var2 + 1];
                    class38.field719[var2 + 1] = var4;
                    int var5 = class164.field2958[var2];
                    class164.field2958[var2] = class164.field2958[var2 + 1];
                    class164.field2958[var2 + 1] = var5;
                    int var6 = class25.field444[var2];
                    class25.field444[var2] = class25.field444[var2 + 1];
                    class25.field444[var2 + 1] = var6;
                    short var7 = class54.field960[var2];
                    class54.field960[var2] = class54.field960[var2 + 1];
                    class54.field960[var2 + 1] = var7;
                    long var8 = class72.field1345[var2];
                    class72.field1345[var2] = class72.field1345[var2 + 1];
                    class72.field1345[var2 + 1] = var8;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(Loh;IIB)Loh;")
    public final class140 method1190(class140 arg0, int arg1, int arg2, byte arg3) {
        field3637++;
        int var5 = this.field3645[arg1];
        class54 var6 = class21.method129(var5 >> 16, 3);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg0.method546(true);
        }
        int var8 = arg2 & 0x3;
        if (arg3 != -11) {
            method1189(-121);
        }
        class140 var9 = arg0.method546(!var6.method292(var7, (byte) -6));
        if (var8 == 1) {
            var9.method865();
        } else if (var8 == 2) {
            var9.method866();
        } else if (var8 == 3) {
            var9.method864();
        }
        var9.method548(var6, var7);
        if (var8 == 1) {
            var9.method864();
        } else if (var8 == 2) {
            var9.method866();
        } else if (var8 == 3) {
            var9.method865();
        }
        return var9;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(BLrh;)I")
    public static final int method1191(byte arg0, class167 arg1) {
        class20 var2 = (class20) class205.field3948.method51(((long) arg1.field3069 << 32) + ((long) arg1.field2989), -112);
        field3641++;
        if (arg0 >= -35) {
            return -81;
        } else if (var2 == null) {
            return arg1.field3021;
        } else {
            return var2.field384;
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(ILka;)V")
    public final void method1192(int arg0, class97 arg1) {
        if (arg0 != -1) {
            return;
        }
        while (true) {
            int var3 = arg1.method588((byte) -114);
            if (var3 == 0) {
                field3642++;
                return;
            }
            this.method1188(var3, arg1, (byte) -93);
        }
    }

    @OriginalMember(owner = "client!ub", name = "c", descriptor = "(Z)V")
    public final void method1193(boolean arg0) {
        if (this.field3647 == -1) {
            if (this.field3639 == null) {
                this.field3647 = 0;
            } else {
                this.field3647 = 2;
            }
        }
        if (arg0) {
            field3628 = null;
        }
        field3644++;
        if (this.field3618 != -1) {
            return;
        }
        if (this.field3639 == null) {
            this.field3618 = 0;
        } else {
            this.field3618 = 2;
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(ILoh;B)Loh;")
    public final class140 method1194(int arg0, class140 arg1, byte arg2) {
        field3617++;
        int var4 = this.field3645[arg0];
        if (arg2 >= -85) {
            return null;
        }
        class54 var5 = class21.method129(var4 >> 16, 3);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg1.method549(true);
        } else {
            class140 var7 = arg1.method549(!var5.method292(var6, (byte) -6));
            var7.method548(var5, var6);
            return var7;
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(IIIILfb;Lfb;IIIIJ)V")
    public static final void method1195(int arg0, int arg1, int arg2, int arg3, class52 arg4, class52 arg5, int arg6, int arg7, int arg8, int arg9, long arg10) {
        if (arg4 == null) {
            return;
        }
        class134 var12 = new class134();
        var12.field2435 = arg10;
        var12.field2441 = arg1 * 128 + 64;
        var12.field2432 = arg2 * 128 + 64;
        var12.field2430 = arg3;
        var12.field2426 = arg4;
        var12.field2438 = arg5;
        var12.field2442 = arg6;
        var12.field2434 = arg7;
        var12.field2444 = arg8;
        var12.field2443 = arg9;
        for (int var13 = arg0; var13 >= 0; var13--) {
            if (class190.field3704[var13][arg1][arg2] == null) {
                class190.field3704[var13][arg1][arg2] = new class90(var13, arg1, arg2);
            }
        }
        class190.field3704[arg0][arg1][arg2].field1684 = var12;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(ILoh;IILub;)Loh;")
    public final class140 method1196(int arg0, class140 arg1, int arg2, int arg3, class188 arg4) {
        field3646++;
        int var6 = this.field3645[arg2];
        class54 var7 = class21.method129(var6 >> 16, 3);
        int var8 = var6 & 0xFFFF;
        if (var7 == null) {
            return arg4.method1184((byte) -103, arg3, arg1);
        }
        int var9 = arg4.field3645[arg3];
        class54 var10 = class21.method129(var9 >> 16, 3);
        int var11 = var9 & 0xFFFF;
        if (var10 == null) {
            class140 var12 = arg1.method546(!var7.method292(var8, (byte) -6));
            var12.method548(var7, var8);
            return var12;
        }
        class140 var13 = arg1.method546(!var7.method292(var8, (byte) -6) & !var10.method292(var11, (byte) -6));
        if (arg0 != -65536) {
            field3628 = null;
        }
        var13.method560(var7, var8, var10, var11, this.field3639);
        return var13;
    }
}
