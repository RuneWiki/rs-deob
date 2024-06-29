import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ed")
public abstract class class42 extends class19 {

    @OriginalMember(owner = "client!ed", name = "Y", descriptor = "S")
    public short field756 = -32768;

    @OriginalMember(owner = "client!ed", name = "Q", descriptor = "Lsd;")
    private static class166 field748 = class135.method935("Connection lost)3", 0);

    @OriginalMember(owner = "client!ed", name = "M", descriptor = "I")
    public static int field744 = 0;

    @OriginalMember(owner = "client!ed", name = "P", descriptor = "Lsd;")
    public static class166 field747 = field748;

    @OriginalMember(owner = "client!ed", name = "W", descriptor = "Lsd;")
    private static class166 field754 = class135.method935("Press (Wchange your password(W on front page)3", 0);

    @OriginalMember(owner = "client!ed", name = "V", descriptor = "Lsd;")
    public static class166 field753 = field754;

    @OriginalMember(owner = "client!ed", name = "T", descriptor = "I")
    public static int field751 = 0;

    @OriginalMember(owner = "client!ed", name = "ab", descriptor = "Lsd;")
    public static class166 field758 = class135.method935("<br>", 0);

    @OriginalMember(owner = "client!ed", name = "N", descriptor = "I")
    public static int field745;

    @OriginalMember(owner = "client!ed", name = "R", descriptor = "I")
    public static int field749;

    @OriginalMember(owner = "client!ed", name = "U", descriptor = "I")
    public static int field752;

    @OriginalMember(owner = "client!ed", name = "X", descriptor = "I")
    public static int field755;

    @OriginalMember(owner = "client!ed", name = "Z", descriptor = "I")
    public static int field757;

    @OriginalMember(owner = "client!ed", name = "S", descriptor = "J")
    public static long field750;

    @OriginalMember(owner = "client!ed", name = "O", descriptor = "Lkf;")
    public static class96 field746;

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(ILud;)V")
    public static final void method289(int arg0, class184 arg1) {
        field757++;
        arg1.field3491 = arg1.field3507;
        if (arg1.field3514 == 0) {
            arg1.field3540 = 0;
            return;
        }
        if (arg1.field3543 != -1 && arg1.field3530 == 0) {
            class62 var2 = class110.method798(arg1.field3543, 12);
            if (arg1.field3483 > 0 && var2.field1271 == 0) {
                arg1.field3540++;
                return;
            }
            if (arg1.field3483 <= 0 && var2.field1291 == 0) {
                arg1.field3540++;
                return;
            }
        }
        int var3 = arg1.field3526;
        int var4 = arg1.field3554[arg1.field3514 - 1] * 128 + arg1.field3490 * 64;
        int var5 = arg1.field3513;
        int var6 = arg1.field3521[arg1.field3514 - 1] * 128 + arg1.field3490 * 64;
        if (var4 - var3 > 256 || var4 - var3 < -256 || var6 - var5 > 256 || var6 - var5 < -256) {
            arg1.field3526 = var4;
            arg1.field3513 = var6;
            return;
        }
        int var7 = arg1.field3516;
        if (var3 >= var4) {
            if (var4 >= var3) {
                if (var6 > var5) {
                    arg1.field3489 = 1024;
                } else if (var5 > var6) {
                    arg1.field3489 = 0;
                }
            } else if (var5 < var6) {
                arg1.field3489 = 768;
            } else if (var5 > var6) {
                arg1.field3489 = 256;
            } else {
                arg1.field3489 = 512;
            }
        } else if (var5 < var6) {
            arg1.field3489 = 1280;
        } else if (var6 < var5) {
            arg1.field3489 = 1792;
        } else {
            arg1.field3489 = 1536;
        }
        int var8 = arg1.field3489 - arg1.field3488 & 0x7FF;
        int var9 = 4;
        if (var8 > 1024) {
            var8 -= 2048;
        }
        if (var8 >= -256 && var8 <= 256) {
            var7 = arg1.field3508;
        } else if (var8 >= 256 && var8 < 768) {
            var7 = arg1.field3539;
        } else if (var8 >= -768 && var8 <= -256) {
            var7 = arg1.field3496;
        }
        if (var7 == -1) {
            var7 = arg1.field3508;
        }
        arg1.field3491 = var7;
        boolean var10 = true;
        if (arg1 instanceof class154) {
            var10 = ((class154) arg1).field2958.field1585;
        }
        if (var10) {
            if (arg1.field3489 != arg1.field3488 && arg1.field3497 == -1 && arg1.field3528 != 0) {
                var9 = 2;
            }
            if (arg1.field3514 > 2) {
                var9 = 6;
            }
            if (arg1.field3514 > 3) {
                var9 = 8;
            }
            if (arg1.field3540 > 0 && arg1.field3514 > 1) {
                var9 = 8;
                arg1.field3540--;
            }
        } else {
            if (arg1.field3514 > 1) {
                var9 = 6;
            }
            if (arg1.field3514 > 2) {
                var9 = 8;
            }
            if (arg1.field3540 > 0 && arg1.field3514 > 1) {
                var9 = 8;
                arg1.field3540--;
            }
        }
        if (arg1.field3552[arg1.field3514 - 1]) {
            var9 <<= 0x1;
        }
        if (var6 > var5) {
            arg1.field3513 += var9;
            if (var6 < arg1.field3513) {
                arg1.field3513 = var6;
            }
        } else if (var5 > var6) {
            arg1.field3513 -= var9;
            if (var6 > arg1.field3513) {
                arg1.field3513 = var6;
            }
        }
        if (var9 >= 8 && arg1.field3508 == arg1.field3491 && arg1.field3542 != -1) {
            arg1.field3491 = arg1.field3542;
        }
        if (var4 > var3) {
            arg1.field3526 += var9;
            if (var4 < arg1.field3526) {
                arg1.field3526 = var4;
            }
        } else if (var3 > var4) {
            arg1.field3526 -= var9;
            if (arg1.field3526 < var4) {
                arg1.field3526 = var4;
            }
        }
        if (arg1.field3526 == var4 && arg1.field3513 == var6) {
            arg1.field3514--;
            if (arg1.field3483 > 0) {
                arg1.field3483--;
            }
        }
        if (arg0 <= 115) {
            method289(-82, null);
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(IIIIIIIII)V")
    public void method290(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field752++;
        class126 var10 = this.method111(10);
        if (var10 != null) {
            var10.method290(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
            this.field756 = var10.field756;
        }
    }

    @OriginalMember(owner = "client!ed", name = "i", descriptor = "(I)Lo;")
    public class126 method111(int arg0) {
        field755++;
        return arg0 < 8 ? null : null;
    }

    @OriginalMember(owner = "client!ed", name = "j", descriptor = "(I)V")
    public static final void method291(int arg0) {
        for (int var1 = -1; var1 < class6.field131; var1++) {
            int var5;
            if (var1 == -1) {
                var5 = 2047;
            } else {
                var5 = class53.field967[var1];
            }
            class123 var6 = class182.field3451[var5];
            if (var6 != null && var6.field3527 > 0) {
                var6.field3527--;
                if (var6.field3527 == 0) {
                    var6.field3495 = null;
                }
            }
        }
        for (int var2 = arg0; var2 < class98.field1880; var2++) {
            int var3 = class58.field1186[var2];
            class154 var4 = class124.field2434[var3];
            if (var4 != null && var4.field3527 > 0) {
                var4.field3527--;
                if (var4.field3527 == 0) {
                    var4.field3495 = null;
                }
            }
        }
        field749++;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(B)V")
    public static void method292(byte arg0) {
        field754 = null;
        int var1 = -100 / ((arg0 - 57) / 60);
        field753 = null;
        field748 = null;
        field747 = null;
        field746 = null;
        field758 = null;
    }
}
