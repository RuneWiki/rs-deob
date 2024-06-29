import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!th")
public class class421 {

    @OriginalMember(owner = "client!th", name = "g", descriptor = "Z")
    public boolean field6290 = false;

    @OriginalMember(owner = "client!th", name = "h", descriptor = "Z")
    public static boolean field6291 = true;

    @OriginalMember(owner = "client!th", name = "m", descriptor = "[[F")
    public static float[][] field6296;

    @OriginalMember(owner = "client!th", name = "l", descriptor = "F")
    public static float field6295;

    @OriginalMember(owner = "client!th", name = "a", descriptor = "I")
    public static int field6284;

    @OriginalMember(owner = "client!th", name = "b", descriptor = "I")
    public static int field6285;

    @OriginalMember(owner = "client!th", name = "c", descriptor = "I")
    public static int field6286;

    @OriginalMember(owner = "client!th", name = "d", descriptor = "I")
    public int field6287;

    @OriginalMember(owner = "client!th", name = "f", descriptor = "I")
    public int field6289;

    @OriginalMember(owner = "client!th", name = "i", descriptor = "I")
    public static int field6292;

    @OriginalMember(owner = "client!th", name = "j", descriptor = "I")
    public static int field6293;

    @OriginalMember(owner = "client!th", name = "k", descriptor = "I")
    public static int field6294;

    @OriginalMember(owner = "client!th", name = "e", descriptor = "Lnj;")
    public class161 field6288;

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(Lcu;II)V")
    private final void method2542(class145 arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            this.field6289 = arg0.method1069((byte) -60);
        } else if (arg2 == 2) {
            this.field6287 = arg0.method1085(-113);
        } else if (arg2 == 3) {
            this.field6290 = true;
        } else if (arg2 == 4) {
            this.field6289 = -1;
        }
        if (arg1 == 9257) {
            field6284++;
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(I)Z")
    public final boolean method2543(int arg0) {
        field6292++;
        if (arg0 <= 118) {
            this.field6290 = false;
        }
        return this.field6288.field2488.method129(true, this.field6289);
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(Lcu;I)V")
    public final void method2544(class145 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method1063((byte) 102);
            if (var3 == 0) {
                field6285++;
                if (arg1 != 19398) {
                    this.field6288 = null;
                    return;
                }
                return;
            }
            this.method2542(arg0, arg1 - 10141, var3);
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(ZIILqa;)Lf;")
    public final class529 method2545(boolean arg0, int arg1, int arg2, class162 arg3) {
        if (arg1 != 1) {
            method2548(-43, null);
        }
        field6286++;
        long var5 = (long) (arg3.field2502 << 19 | (arg0 ? 262144 : 0) | this.field6289 | arg2 << 16);
        class529 var7 = (class529) this.field6288.field2496.method494(0, var5);
        if (var7 != null) {
            return var7;
        } else if (this.field6288.field2488.method129(true, this.field6289)) {
            class279 var8 = class279.method1789(this.field6288.field2488, this.field6289, 0);
            if (var8 != null) {
                var8.field4010 = var8.field4007 = var8.field4009 = var8.field4008 = 0;
                if (arg0) {
                    var8.method1788();
                }
                for (int var9 = 0; var9 < arg2; var9++) {
                    var8.method1790();
                }
            }
            class529 var10 = arg3.method304(var8, true);
            if (var10 != null) {
                this.field6288.field2496.method485(var5, (byte) -125, var10);
            }
            return var10;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(IIIIIII)I")
    public static final int method2546(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field6293++;
        if ((arg5 & 0x1) == 1) {
            int var7 = arg1;
            arg1 = arg4;
            arg4 = var7;
        }
        int var8 = arg0 & 0x3;
        if (arg2 == var8) {
            return arg3;
        } else if (var8 == 1) {
            return arg6;
        } else if (var8 == 2) {
            return 1 + 7 - arg1 - arg3;
        } else {
            return 7 + 1 - arg6 - arg4;
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(B)V")
    public static void method2547(byte arg0) {
        field6296 = null;
        if (arg0 < 15) {
            field6295 = -1.9665577F;
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(I[[[Liq;)V")
    public static final void method2548(int arg0, class429[][][] arg1) {
        field6294++;
        for (int var2 = 0; var2 < arg1.length; var2++) {
            class429[][] var3 = arg1[var2];
            for (int var4 = 0; var4 < var3.length; var4++) {
                for (int var5 = 0; var5 < var3[var4].length; var5++) {
                    class429 var6 = var3[var4][var5];
                    if (var6 != null) {
                        if (var6.field6366 instanceof class248) {
                            ((class248) var6.field6366).method26(-122);
                        }
                        if (var6.field6380 instanceof class248) {
                            ((class248) var6.field6380).method26(90);
                        }
                        if (var6.field6367 instanceof class248) {
                            ((class248) var6.field6367).method26(2);
                        }
                        if (var6.field6370 instanceof class248) {
                            ((class248) var6.field6370).method26(9);
                        }
                        if (var6.field6365 instanceof class248) {
                            ((class248) var6.field6365).method26(-102);
                        }
                        for (class166 var7 = var6.field6364; var7 != null; var7 = var7.field2572) {
                            class417 var8 = var7.field2576;
                            if (var8 instanceof class248) {
                                ((class248) var8).method26(71);
                            }
                        }
                    }
                }
            }
        }
        if (arg0 >= -96) {
            field6296 = null;
        }
    }

    static {
        new class342("You do not have permission to kick users in this channel.", "Du darfst keine Benutzer aus diesem Chatraum rauswerfen.", "Vous n'êtes pas autorisé à expulser des utilisateurs de ce canal.", "Você não tem permissão para expulsar usuários neste canal.");
        field6296 = new float[][] { { -0.333333F, -0.333333F, -0.333333F }, { 0.333333F, -0.333333F, -0.333333F }, { -0.333333F, 0.333333F, -0.333333F }, { 0.333333F, 0.333333F, -0.333333F }, { -0.333333F, -0.333333F, 0.333333F }, { 0.333333F, -0.333333F, 0.333333F }, { -0.333333F, 0.333333F, 0.333333F }, { 0.333333F, 0.333333F, 0.333333F } };
    }
}
