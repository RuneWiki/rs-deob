import java.io.File;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dd")
public class class733 extends class782 {

    @OriginalMember(owner = "client!dd", name = "e", descriptor = "I")
    private int field10107;

    @OriginalMember(owner = "client!dd", name = "j", descriptor = "I")
    private int field10112;

    @OriginalMember(owner = "client!dd", name = "l", descriptor = "I")
    private int field10114;

    @OriginalMember(owner = "client!dd", name = "i", descriptor = "I")
    private int field10111;

    @OriginalMember(owner = "client!dd", name = "o", descriptor = "[[Z")
    public static boolean[][] field10117 = new boolean[][] { new boolean[4], { false, true, true, false }, { true, false, true, false }, { true, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, { true, true, false, false }, new boolean[4], { false, true, false, true }, new boolean[4] };

    @OriginalMember(owner = "client!dd", name = "f", descriptor = "Lfja;")
    public static class783 field10108 = new class783(85, 8);

    @OriginalMember(owner = "client!dd", name = "p", descriptor = "Lsj;")
    public static class486 field10118 = new class486(14, 0);

    @OriginalMember(owner = "client!dd", name = "q", descriptor = "Lsj;")
    public static class486 field10119 = new class486(15, 4);

    @OriginalMember(owner = "client!dd", name = "r", descriptor = "Lsj;")
    public static class486 field10120 = new class486(16, -2);

    @OriginalMember(owner = "client!dd", name = "s", descriptor = "Lsj;")
    public static class486 field10121 = new class486(17, 0);

    @OriginalMember(owner = "client!dd", name = "t", descriptor = "Lsj;")
    public static class486 field10122 = new class486(18, -2);

    @OriginalMember(owner = "client!dd", name = "u", descriptor = "Lsj;")
    public static class486 field10123 = new class486(19, -2);

    @OriginalMember(owner = "client!dd", name = "v", descriptor = "Lsj;")
    public static class486 field10124 = new class486(22, -2);

    @OriginalMember(owner = "client!dd", name = "w", descriptor = "Lsj;")
    public static class486 field10125 = new class486(23, 4);

    @OriginalMember(owner = "client!dd", name = "x", descriptor = "Lsj;")
    public static class486 field10126 = new class486(24, -1);

    @OriginalMember(owner = "client!dd", name = "y", descriptor = "Lsj;")
    public static class486 field10127 = new class486(26, 0);

    @OriginalMember(owner = "client!dd", name = "z", descriptor = "Lsj;")
    public static class486 field10128 = new class486(27, 0);

    @OriginalMember(owner = "client!dd", name = "A", descriptor = "Lsj;")
    public static class486 field10129 = new class486(28, -2);

    @OriginalMember(owner = "client!dd", name = "B", descriptor = "[Lsj;")
    private static class486[] field10130 = new class486[32];

    @OriginalMember(owner = "client!dd", name = "g", descriptor = "I")
    public static int field10109;

    @OriginalMember(owner = "client!dd", name = "h", descriptor = "I")
    public static int field10110;

    @OriginalMember(owner = "client!dd", name = "k", descriptor = "I")
    public static int field10113;

    @OriginalMember(owner = "client!dd", name = "m", descriptor = "I")
    public static int field10115;

    @OriginalMember(owner = "client!dd", name = "n", descriptor = "I")
    public static int field10116;

    @OriginalMember(owner = "client!dd", name = "C", descriptor = "I")
    public static int field10131;

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(BLjava/lang/String;)I")
    public static final int method4070(byte arg0, String arg1) {
        ++field10113;
        if (!class322.field4420.field10241) {
            return -1;
        } else if (class488.field6591.containsKey(arg1)) {
            return 100;
        } else if (arg0 > -30) {
            return -7;
        } else {
            String var2 = class135.method1115(-67, arg1);
            if (var2 == null) {
                return -1;
            } else {
                String var3 = class593.field8327 + var2;
                if (!class120.field2187.method3729("", -1, var3)) {
                    return -1;
                } else if (!class120.field2187.method3725(-12831, var3)) {
                    return class120.field2187.method3728(var3, (byte) 53);
                } else {
                    byte[] var4 = class120.field2187.method3726(-124, var3, "");
                    Object var5 = null;
                    File var6;
                    try {
                        var6 = class587.method3374(79, var2);
                    } catch (RuntimeException var10) {
                        return -1;
                    }
                    if (var4 != null && var6 != null) {
                        boolean var7 = true;
                        byte[] var8 = class390.method2366(var6, 22946);
                        if (var8 != null && var4.length == var8.length) {
                            for (int var9 = 0; ~var9 > ~var8.length; ++var9) {
                                if (var4[var9] != var8[var9]) {
                                    var7 = false;
                                    break;
                                }
                            }
                        } else {
                            var7 = false;
                        }
                        try {
                            if (!var7) {
                                class322.field4420.method4106(var4, (byte) 119, var6);
                            }
                        } catch (Throwable var11) {
                            return -1;
                        }
                        class514.method2945(var6, 0, arg1);
                        return 100;
                    } else {
                        return -1;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(Lgj;B)V")
    public static final void method4071(class662 arg0, byte arg1) {
        ++field10109;
        if (arg1 < 79) {
            field10126 = null;
        }
        class142.field2416 = arg0;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(III)V")
    public final void method1938(int arg0, int arg1, int arg2) {
        ++field10115;
        int var4 = this.field10114 * arg2 >> 12;
        int var5 = this.field10112 * arg2 >> 12;
        if (arg0 <= 109) {
            field10125 = null;
        }
        int var6 = this.field10111 * arg1 >> 12;
        int var7 = this.field10107 * arg1 >> 12;
        class286.method1828(var4, var7, var5, var6, 854952684, super.field10752);
    }

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "(IBI)V")
    public final void method1941(int arg0, byte arg1, int arg2) {
        ++field10116;
        int var4 = 121 / ((-62 - arg1) / 56);
    }

    @OriginalMember(owner = "client!dd", name = "<init>", descriptor = "(IIIIII)V")
    public class733(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(-1, arg4, arg5);
        this.field10107 = arg3;
        this.field10112 = arg2;
        this.field10114 = arg0;
        this.field10111 = arg1;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(B)V")
    public static void method4072(byte arg0) {
        field10126 = null;
        field10119 = null;
        field10121 = null;
        field10117 = null;
        field10118 = null;
        field10130 = null;
        field10124 = null;
        if (arg0 > -80) {
            field10131 = -44;
        }
        field10120 = null;
        field10123 = null;
        field10127 = null;
        field10108 = null;
        field10128 = null;
        field10125 = null;
        field10122 = null;
        field10129 = null;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(IBI)V")
    public final void method1935(int arg0, byte arg1, int arg2) {
        if (arg1 >= -110) {
            field10130 = null;
        }
        ++field10110;
    }

    static {
        class486[] var0 = class255.method1674(87);
        for (int var1 = 0; var0.length > var1; ++var1) {
            field10130[var0[var1].field6570] = var0[var1];
        }
    }
}
