import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mb")
public class class172 {

    @OriginalMember(owner = "client!mb", name = "o", descriptor = "Lha;")
    private class194 field3092 = new class194();

    @OriginalMember(owner = "client!mb", name = "k", descriptor = "I")
    private int field3088;

    @OriginalMember(owner = "client!mb", name = "e", descriptor = "I")
    private int field3082;

    @OriginalMember(owner = "client!mb", name = "j", descriptor = "Lfk;")
    private class144 field3087;

    @OriginalMember(owner = "client!mb", name = "f", descriptor = "Loh;")
    public static class258 field3083 = class153.method1046("cross", 107);

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "I")
    public static int field3078;

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "I")
    public static int field3079;

    @OriginalMember(owner = "client!mb", name = "c", descriptor = "I")
    public static int field3080;

    @OriginalMember(owner = "client!mb", name = "d", descriptor = "I")
    public static int field3081;

    @OriginalMember(owner = "client!mb", name = "g", descriptor = "I")
    public static int field3084;

    @OriginalMember(owner = "client!mb", name = "h", descriptor = "I")
    public static int field3085;

    @OriginalMember(owner = "client!mb", name = "i", descriptor = "I")
    public static int field3086;

    @OriginalMember(owner = "client!mb", name = "l", descriptor = "I")
    public static int field3089;

    @OriginalMember(owner = "client!mb", name = "m", descriptor = "I")
    public static int field3090;

    @OriginalMember(owner = "client!mb", name = "n", descriptor = "I")
    public static int field3091;

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(II)V", line = 4)
    public final void method1156(int arg0, int arg1) {
        if (class190.field3351 != null) {
            for (class280 var3 = (class280) this.field3092.method1308((byte) -100); var3 != null; var3 = (class280) this.field3092.method1309((byte) -124)) {
                if (var3.method960((byte) 102)) {
                    if (var3.method958((byte) 94) == null) {
                        var3.method1054((byte) 102);
                        var3.method1298(true);
                        this.field3082++;
                    }
                } else if ((++var3.field3397) > ((long) arg0)) {
                    class280 var4 = class190.field3351.method109(-21345, var3);
                    this.field3087.method984((byte) -99, var4, var3.field2642);
                    class258.method1767(var3, var4, 61);
                    var3.method1054((byte) 117);
                    var3.method1298(true);
                }
            }
        }
        if (arg1 == 0) {
            field3081++;
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(I)V", line = 60)
    public final void method1157(int arg0) {
        for (class280 var2 = (class280) this.field3092.method1308((byte) -100); var2 != null; var2 = (class280) this.field3092.method1309((byte) -122)) {
            if (var2.method960((byte) 103)) {
                var2.method1054((byte) 100);
                var2.method1298(true);
                this.field3082++;
            }
        }
        if (arg0 == 4) {
            field3078++;
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(III)J", line = 86)
    public static final long method1158(int arg0, int arg1, int arg2) {
        class228 var3 = class178.field3180[arg0][arg1][arg2];
        if (var3 == null) {
            return 0L;
        }
        for (int var4 = 0; var4 < var3.field3950; var4++) {
            class219 var5 = var3.field3932[var4];
            if ((var5.field3795 >> 29 & 0x3L) == 2L && var5.field3793 == arg1 && var5.field3797 == arg2) {
                return var5.field3795;
            }
        }
        return 0L;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(BJ)Ljava/lang/Object;", line = 107)
    public final Object method1159(byte arg0, long arg1) {
        if (arg0 < 120) {
            return (Object) null;
        }
        class280 var4 = (class280) this.field3087.method986(arg1, 0);
        field3090++;
        if (var4 == null) {
            return null;
        }
        Object var5 = var4.method958((byte) 103);
        if (var5 == null) {
            var4.method1054((byte) 116);
            var4.method1298(true);
            this.field3082++;
            return null;
        }
        if (var4.method960((byte) 122)) {
            class138 var6 = new class138(var5);
            this.field3087.method984((byte) -110, var6, var4.field2642);
            this.field3092.method1305(var6, 0);
            var6.field3397 = 0L;
            var4.method1054((byte) 119);
            var4.method1298(true);
        } else {
            this.field3092.method1305(var4, 0);
            var4.field3397 = 0L;
        }
        return var5;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "([IIIIII)V", line = 159)
    public static final void method1160(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class228 var6 = class178.field3180[arg3][arg4][arg5];
        if (var6 == null) {
            return;
        }
        class26 var7 = var6.field3945;
        if (var7 != null) {
            int var8 = var7.field307;
            if (var8 != 0) {
                for (int var9 = 0; var9 < 4; var9++) {
                    arg0[arg1] = var8;
                    arg0[arg1 + 1] = var8;
                    arg0[arg1 + 2] = var8;
                    arg0[arg1 + 3] = var8;
                    arg1 += arg2;
                }
            }
            return;
        }
        class67 var10 = var6.field3933;
        if (var10 == null) {
            return;
        }
        int var11 = var10.field1158;
        int var12 = var10.field1176;
        int var13 = var10.field1175;
        int var14 = var10.field1168;
        int[] var15 = class90.field1577[var11];
        int[] var16 = class166.field2811[var12];
        int var17 = 0;
        if (var13 != 0) {
            for (int var18 = 0; var18 < 4; var18++) {
                arg0[arg1] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg0[arg1 + 1] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg0[arg1 + 2] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg0[arg1 + 3] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg1 += arg2;
            }
            return;
        }
        for (int var19 = 0; var19 < 4; var19++) {
            if (var15[var16[var17++]] != 0) {
                arg0[arg1] = var14;
            }
            if (var15[var16[var17++]] != 0) {
                arg0[arg1 + 1] = var14;
            }
            if (var15[var16[var17++]] != 0) {
                arg0[arg1 + 2] = var14;
            }
            if (var15[var16[var17++]] != 0) {
                arg0[arg1 + 3] = var14;
            }
            arg1 += arg2;
        }
    }

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "(I)V", line = 256)
    public final void method1161(int arg0) {
        field3084++;
        int var2 = 99 % ((arg0) / 46);
        this.field3092.method1310((byte) 106);
        this.field3087.method981(32);
        this.field3082 = this.field3088;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(IJ)V", line = 269)
    public final void method1162(int arg0, long arg1) {
        class280 var4 = (class280) this.field3087.method986(arg1, 0);
        if (var4 != null) {
            var4.method1054((byte) 99);
            var4.method1298(true);
            this.field3082++;
        }
        if (arg0 < 37) {
            this.field3082 = -111;
        }
        field3079++;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(Ljava/lang/Object;IJ)V", line = 289)
    public final void method1163(Object arg0, int arg1, long arg2) {
        field3080++;
        this.method1162(arg1 ^ 0xFFFFFFAF, arg2);
        if (~this.field3082 == arg1) {
            class280 var5 = (class280) this.field3092.method1304(10);
            var5.method1054((byte) 91);
            var5.method1298(true);
        } else {
            this.field3082--;
        }
        class138 var6 = new class138(arg0);
        this.field3087.method984((byte) 100, var6, arg2);
        this.field3092.method1305(var6, 0);
        var6.field3397 = 0L;
    }

    @OriginalMember(owner = "client!mb", name = "c", descriptor = "(I)V", line = 319)
    public static final void method1164(int arg0) {
        field3089++;
        if (arg0 <= 13) {
            field3083 = (class258) null;
        }
        if (class152.field2602 != null) {
            class152.field2602.method1002(155);
        }
        if (class76.field1322 != null) {
            class76.field1322.method1002(155);
        }
    }

    @OriginalMember(owner = "client!mb", name = "d", descriptor = "(I)V", line = 336)
    public static void method1165(int arg0) {
        field3083 = null;
        if (arg0 != 0) {
            method1164(-18);
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(B)V", line = 358)
    public static final void method1166(byte arg0) {
        field3085++;
        class57.field901++;
        if (arg0 <= 118) {
            method1165(126);
        }
    }

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "(III)Lsd;", line = 369)
    public static final class125 method1167(int arg0, int arg1, int arg2) {
        field3086++;
        for (class125 var3 = (class125) class90.field1578.method83(-59); var3 != null; var3 = (class125) class90.field1578.method87((byte) -80)) {
            if (var3.field2232 && var3.method911(arg2, -1536, arg0)) {
                return var3;
            }
        }
        if (arg1 != 0) {
            field3083 = (class258) null;
        }
        return null;
    }

    @OriginalMember(owner = "client!mb", name = "c", descriptor = "(III)I", line = 393)
    public static final int method1168(int arg0, int arg1, int arg2) {
        field3091++;
        if (arg2 < arg1) {
            int var3 = arg2;
            arg2 = arg1;
            arg1 = var3;
        }
        while (arg1 != 0) {
            int var4 = arg2 % arg1;
            arg2 = arg1;
            arg1 = var4;
        }
        if (arg0 != -1) {
            method1165(53);
        }
        return arg2;
    }

    @OriginalMember(owner = "client!mb", name = "<init>", descriptor = "(I)V", line = 421)
    public class172(int arg0) {
        this.field3088 = arg0;
        this.field3082 = arg0;
        int var2;
        for (var2 = 1; arg0 > var2 + var2; var2 += var2) {
        }
        this.field3087 = new class144(var2);
    }
}
