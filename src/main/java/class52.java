import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qe")
public class class52 extends class20 {

    @OriginalMember(owner = "client!qe", name = "y", descriptor = "I")
    private int field914 = 0;

    @OriginalMember(owner = "client!qe", name = "v", descriptor = "I")
    private int field911 = 0;

    @OriginalMember(owner = "client!qe", name = "G", descriptor = "I")
    private int field922 = -32768;

    @OriginalMember(owner = "client!qe", name = "I", descriptor = "Z")
    public boolean field924 = false;

    @OriginalMember(owner = "client!qe", name = "C", descriptor = "I")
    public int field918;

    @OriginalMember(owner = "client!qe", name = "J", descriptor = "I")
    public int field925;

    @OriginalMember(owner = "client!qe", name = "z", descriptor = "I")
    public int field915;

    @OriginalMember(owner = "client!qe", name = "H", descriptor = "I")
    private int field923;

    @OriginalMember(owner = "client!qe", name = "p", descriptor = "I")
    public int field905;

    @OriginalMember(owner = "client!qe", name = "B", descriptor = "I")
    public int field917;

    @OriginalMember(owner = "client!qe", name = "r", descriptor = "Luc;")
    private class224 field907;

    @OriginalMember(owner = "client!qe", name = "K", descriptor = "I")
    public static int field926 = -1;

    @OriginalMember(owner = "client!qe", name = "F", descriptor = "Ltg;")
    public static class215 field921 = new class215(16);

    @OriginalMember(owner = "client!qe", name = "M", descriptor = "[I")
    public static int[] field928 = new int[25];

    @OriginalMember(owner = "client!qe", name = "q", descriptor = "I")
    public static int field906;

    @OriginalMember(owner = "client!qe", name = "t", descriptor = "I")
    public static int field909;

    @OriginalMember(owner = "client!qe", name = "u", descriptor = "I")
    public static int field910;

    @OriginalMember(owner = "client!qe", name = "w", descriptor = "I")
    public static int field912;

    @OriginalMember(owner = "client!qe", name = "x", descriptor = "I")
    public static int field913;

    @OriginalMember(owner = "client!qe", name = "A", descriptor = "I")
    public static int field916;

    @OriginalMember(owner = "client!qe", name = "D", descriptor = "I")
    public static int field919;

    @OriginalMember(owner = "client!qe", name = "E", descriptor = "I")
    public static int field920;

    @OriginalMember(owner = "client!qe", name = "s", descriptor = "Lme;")
    public static class145 field908;

    @OriginalMember(owner = "client!qe", name = "L", descriptor = "Lha;")
    public static class63 field927;

    @OriginalMember(owner = "client!qe", name = "c", descriptor = "(I)V")
    public static void method356(int arg0) {
        field908 = null;
        field928 = null;
        field927 = null;
        if (arg0 != 2) {
            field928 = null;
        }
        field921 = null;
    }

    @OriginalMember(owner = "client!qe", name = "d", descriptor = "(I)V")
    public static final void method357(int arg0) {
        class90.field1747 = arg0;
        for (int var1 = 0; var1 < class40.field629; var1++) {
            for (int var2 = 0; var2 < class11.field136; var2++) {
                if (class110.field2124[arg0][var1][var2] == null) {
                    class110.field2124[arg0][var1][var2] = new class16(arg0, var1, var2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "()I")
    public final int method28() {
        field909++;
        return this.field922;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(IIIIIIIIJ)V")
    public final void method25(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        field910++;
        class262 var11 = this.method362(119);
        if (var11 != null) {
            var11.method25(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
            this.field922 = var11.method28();
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(IZ)V")
    public final void method358(int arg0, boolean arg1) {
        field906++;
        if (this.field924) {
            return;
        }
        this.field914 += arg0;
        if (arg1) {
            return;
        }
        while (this.field914 > this.field907.field3834[this.field911]) {
            this.field914 -= this.field907.field3834[this.field911];
            this.field911++;
            if (this.field907.field3811.length <= this.field911) {
                this.field924 = true;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(II)Lub;")
    public static final class231 method359(int arg0, int arg1) {
        field916++;
        class231 var2 = (class231) class30.field448.method1617(14366, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class43.field717.method135(class61.method396(arg1, false), 0, class151.method1023(28443, arg1));
        class231 var4 = new class231();
        var4.field4064 = arg1;
        if (var3 != null) {
            var4.method1516((byte) 29, new class249(var3));
        }
        var4.method1511(-129);
        if (!class219.field3763 && var4.field4011) {
            var4.field4039 = null;
        }
        if (var4.field4001) {
            var4.field4055 = 0;
            var4.field4063 = false;
        }
        class30.field448.method1615(var4, 110, (long) arg1);
        if (arg0 < 79) {
            field926 = -82;
        }
        return var4;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(Llh;B)V")
    public static final void method360(class249 arg0, byte arg1) {
        field920++;
        if (arg0.field4350.length - arg0.field4335 < 1) {
            return;
        }
        int var2 = arg0.method1677(-6677);
        if (var2 < 0 || var2 > 3) {
            return;
        }
        byte var3;
        if (var2 == 3) {
            var3 = 23;
        } else if (var2 == 2) {
            var3 = 22;
        } else if (var2 == 1) {
            var3 = 23;
        } else {
            var3 = 19;
        }
        if (var3 > arg0.field4350.length - arg0.field4335) {
            return;
        }
        class63.field1242 = arg0.method1677(-6677);
        if (class63.field1242 < 1) {
            class63.field1242 = 1;
        } else if (class63.field1242 > 4) {
            class63.field1242 = 4;
        }
        if (arg1 <= 89) {
            field928 = null;
        }
        class4.method17(arg0.method1677(-6677) == 1, 1);
        class198.field3421 = arg0.method1677(-6677) == 1;
        class64.field1265 = arg0.method1677(-6677) == 1;
        class7.field61 = arg0.method1677(-6677) == 1;
        class66.field1277 = arg0.method1677(-6677) == 1;
        class205.field3512 = arg0.method1677(-6677) == 1;
        class15.field200 = arg0.method1677(-6677) == 1;
        class212.field3647 = arg0.method1677(-6677) == 1;
        class124.field2334 = arg0.method1677(-6677);
        if (class124.field2334 > 2) {
            class124.field2334 = 2;
        }
        if (var2 < 2) {
            class43.field760 = arg0.method1677(-6677) == 1;
            arg0.method1677(-6677);
        } else {
            class43.field760 = arg0.method1677(-6677) == 1;
        }
        class33.field492 = arg0.method1677(-6677) == 1;
        class155.field2764 = arg0.method1677(-6677) == 1;
        class44.field782 = arg0.method1677(-6677);
        if (class44.field782 > 2) {
            class44.field782 = 2;
        }
        class250.field4401 = arg0.method1677(-6677) == 1;
        class61.field1030 = arg0.method1677(-6677);
        if (class61.field1030 > 127) {
            class61.field1030 = 127;
        }
        class164.field2936 = arg0.method1677(-6677);
        class54.field944 = arg0.method1677(-6677);
        if (class54.field944 > 127) {
            class54.field944 = 127;
        }
        if (var2 >= 1) {
            class131.field2438 = arg0.method1674(1355769544);
            class51.field901 = arg0.method1674(1355769544);
        }
        if (var2 >= 3) {
            class176.field3095 = arg0.method1677(-6677) == 1;
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(I[Lha;I)V")
    public static final void method361(int arg0, class63[] arg1, int arg2) {
        field919++;
        if (arg2 != 16) {
            field912 = -106;
        }
        for (int var3 = 0; var3 < arg1.length; var3++) {
            class63 var4 = arg1[var3];
            if (var4 != null) {
                if (var4.field1219 == 0) {
                    if (var4.field1092 != null) {
                        method361(arg0, var4.field1092, arg2);
                    }
                    class75 var5 = (class75) class230.field3981.method1381((long) var4.field1115, -63);
                    if (var5 != null) {
                        class244.method1607(113, var5.field1492, arg0);
                    }
                }
                if (arg0 == 0 && var4.field1220 != null) {
                    class237 var6 = new class237();
                    var6.field4120 = var4;
                    var6.field4118 = var4.field1220;
                    class8.method34(var6, 16);
                }
                if (arg0 == 1 && var4.field1093 != null) {
                    if (var4.field1190 >= 0) {
                        class63 var7 = class54.method367(var4.field1115, (byte) -80);
                        if (var7 == null || var7.field1092 == null || var7.field1092.length <= var4.field1190 || var7.field1092[var4.field1190] != var4) {
                            continue;
                        }
                    }
                    class237 var8 = new class237();
                    var8.field4118 = var4.field1093;
                    var8.field4120 = var4;
                    class8.method34(var8, 16);
                }
            }
        }
    }

    @OriginalMember(owner = "client!qe", name = "e", descriptor = "(I)Ljh;")
    private final class262 method362(int arg0) {
        field913++;
        if (arg0 <= 111) {
            field921 = null;
        }
        class73 var2 = class156.method1060(this.field923, 1);
        class262 var3;
        if (this.field924) {
            var3 = var2.method523(-1, -10);
        } else {
            var3 = var2.method523(this.field911, -10);
        }
        return var3 == null ? null : var3;
    }

    @OriginalMember(owner = "client!qe", name = "<init>", descriptor = "(IIIIIII)V")
    public class52(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field918 = arg1;
        this.field925 = arg2;
        this.field915 = arg6 + arg5;
        this.field923 = arg0;
        this.field905 = arg4;
        this.field917 = arg3;
        int var8 = class156.method1060(this.field923, 1).field1448;
        if (var8 == -1) {
            this.field924 = true;
        } else {
            this.field924 = false;
            this.field907 = class47.method335((byte) -36, var8);
        }
    }
}
