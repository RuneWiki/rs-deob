import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public class class579 extends class321 {

    @OriginalMember(owner = "client!ab", name = "C", descriptor = "Lwu;")
    public static class149 field8409 = new class149(2);

    @OriginalMember(owner = "client!ab", name = "t", descriptor = "I")
    public static int field8400;

    @OriginalMember(owner = "client!ab", name = "u", descriptor = "I")
    public static int field8401;

    @OriginalMember(owner = "client!ab", name = "v", descriptor = "I")
    public static int field8402;

    @OriginalMember(owner = "client!ab", name = "z", descriptor = "I")
    public static int field8406;

    @OriginalMember(owner = "client!ab", name = "A", descriptor = "I")
    public static int field8407;

    @OriginalMember(owner = "client!ab", name = "D", descriptor = "I")
    public static int field8410;

    @OriginalMember(owner = "client!ab", name = "E", descriptor = "I")
    public static int field8411;

    @OriginalMember(owner = "client!ab", name = "G", descriptor = "I")
    public static int field8413;

    @OriginalMember(owner = "client!ab", name = "F", descriptor = "Ljava/lang/String;")
    public String field8412;

    @OriginalMember(owner = "client!ab", name = "w", descriptor = "[C")
    public char[] field8403;

    @OriginalMember(owner = "client!ab", name = "x", descriptor = "[C")
    public char[] field8404;

    @OriginalMember(owner = "client!ab", name = "y", descriptor = "[I")
    public int[] field8405;

    @OriginalMember(owner = "client!ab", name = "B", descriptor = "[I")
    public int[] field8408;

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(I[B)Llc;")
    public static final class653 method3323(int arg0, byte[] arg1) {
        if (arg0 >= -71) {
            method3324(-2, -41, -119, -122, false, 107, 96, 95);
        }
        field8411++;
        class653 var2 = new class653();
        class540 var3 = new class540(arg1);
        var3.field7956 = var3.field7952.length - 2;
        int var4 = var3.method3169(26488);
        int var5 = var3.field7952.length - (var4 + 12) - 2;
        var3.field7956 = var5;
        int var6 = var3.method3160(false);
        var2.field9347 = var3.method3169(26488);
        var2.field9341 = var3.method3169(26488);
        var2.field9338 = var3.method3169(26488);
        var2.field9337 = var3.method3169(26488);
        int var7 = var3.method3115(29871);
        if (var7 > 0) {
            var2.field9345 = new class322[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                int var9 = var3.method3169(26488);
                class322 var10 = new class322(class240.method1478(-28325, var9));
                var2.field9345[var8] = var10;
                while ((var9--) > 0) {
                    int var11 = var3.method3160(false);
                    int var12 = var3.method3160(false);
                    var10.method2001(30, new class258(var12), (long) var11);
                }
            }
        }
        var3.field7956 = 0;
        var2.field9350 = var3.method3130(-99);
        var2.field9342 = new int[var6];
        var2.field9344 = new int[var6];
        var2.field9343 = new String[var6];
        int var13 = 0;
        while (var5 > var3.field7956) {
            int var14 = var3.method3169(26488);
            if (var14 == 3) {
                var2.field9343[var13] = var3.method3145((byte) -121).intern();
            } else if (var14 >= 100 || var14 == 21 || var14 == 38 || var14 == 39) {
                var2.field9342[var13] = var3.method3115(29871);
            } else {
                var2.field9342[var13] = var3.method3160(false);
            }
            var2.field9344[var13++] = var14;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(IIIIZIII)V")
    public static final void method3324(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7) {
        field8407++;
        int var8 = arg0 - arg7;
        int var9 = arg5 + arg7;
        for (int var10 = arg5; var10 < var9; var10++) {
            class41.method235(arg3, class565.field8253[var10], 0, arg6, arg2);
        }
        for (int var11 = arg0; var11 > var8; var11--) {
            class41.method235(arg3, class565.field8253[var11], 0, arg6, arg2);
        }
        int var12 = arg3 + arg7;
        int var13 = arg6 - arg7;
        if (arg4) {
            method3325((byte) -63);
        }
        for (int var14 = var9; var14 <= var8; var14++) {
            int[] var15 = class565.field8253[var14];
            class41.method235(arg3, var15, 0, var12, arg2);
            class41.method235(var12, var15, 0, var13, arg1);
            class41.method235(var13, var15, 0, arg6, arg2);
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(B)V")
    public static void method3325(byte arg0) {
        if (arg0 == 59) {
            field8409 = null;
        }
    }

    @OriginalMember(owner = "client!ab", name = "e", descriptor = "(I)V")
    public final void method3326(int arg0) {
        if (this.field8405 != null) {
            for (int var2 = 0; var2 < this.field8405.length; var2++) {
                this.field8405[var2] = class151.method1076(this.field8405[var2], 32768);
            }
        }
        if (arg0 != 0) {
            this.field8403 = null;
        }
        field8410++;
        if (this.field8408 != null) {
            for (int var3 = 0; var3 < this.field8408.length; var3++) {
                this.field8408[var3] = class151.method1076(this.field8408[var3], 32768);
            }
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(ZC)I")
    public final int method3327(boolean arg0, char arg1) {
        if (arg0) {
            method3324(50, 30, 25, 120, false, 55, -107, -27);
        }
        field8402++;
        if (this.field8405 == null) {
            return -1;
        }
        for (int var3 = 0; var3 < this.field8405.length; var3++) {
            if (this.field8404[var3] == arg1) {
                return this.field8405[var3];
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(BC)I")
    public final int method3328(byte arg0, char arg1) {
        field8400++;
        if (arg0 <= 10) {
            this.method3327(true, '~');
        }
        if (this.field8408 == null) {
            return -1;
        }
        for (int var3 = 0; var3 < this.field8408.length; var3++) {
            if (this.field8403[var3] == arg1) {
                return this.field8408[var3];
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(Lgk;B)V")
    public final void method3329(class540 arg0, byte arg1) {
        while (true) {
            int var3 = arg0.method3115(arg1 ^ 0xFFFF8B69);
            if (var3 == 0) {
                field8401++;
                if (arg1 != -58) {
                    this.field8403 = null;
                    return;
                }
                return;
            }
            this.method3330(arg0, -48, var3);
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(Lgk;II)V")
    private final void method3330(class540 arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            this.field8412 = arg0.method3145((byte) -121);
        } else if (arg2 == 2) {
            int var7 = arg0.method3115(29871);
            this.field8408 = new int[var7];
            this.field8403 = new char[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field8408[var8] = arg0.method3169(26488);
                byte var9 = arg0.method3128(32767);
                this.field8403[var8] = var9 == 0 ? 0 : class36.method214(var9, -129);
            }
        } else if (arg2 == 3) {
            int var4 = arg0.method3115(29871);
            this.field8404 = new char[var4];
            this.field8405 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field8405[var5] = arg0.method3169(26488);
                byte var6 = arg0.method3128(32767);
                this.field8404[var5] = var6 == 0 ? 0 : class36.method214(var6, -129);
            }
        }
        if (arg1 >= -46) {
            field8413 = 69;
        }
        field8406++;
    }
}
