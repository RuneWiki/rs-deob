import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aa")
public class class16 extends class80 {

    @OriginalMember(owner = "client!aa", name = "H", descriptor = "[Llj;")
    public class44[] field220 = new class44[5];

    @OriginalMember(owner = "client!aa", name = "B", descriptor = "[I")
    public int[] field214 = new int[5];

    @OriginalMember(owner = "client!aa", name = "D", descriptor = "I")
    public int field216 = 0;

    @OriginalMember(owner = "client!aa", name = "R", descriptor = "I")
    public int field230;

    @OriginalMember(owner = "client!aa", name = "y", descriptor = "I")
    public int field211;

    @OriginalMember(owner = "client!aa", name = "C", descriptor = "I")
    public int field215;

    @OriginalMember(owner = "client!aa", name = "A", descriptor = "I")
    public int field213;

    @OriginalMember(owner = "client!aa", name = "p", descriptor = "[Lr;")
    public static class66[] field202 = new class66[200];

    @OriginalMember(owner = "client!aa", name = "q", descriptor = "[Llh;")
    public static class249[] field203 = new class249[2048];

    @OriginalMember(owner = "client!aa", name = "w", descriptor = "Lr;")
    public static class66 field209 = class93.method641(43, "Cabbage");

    @OriginalMember(owner = "client!aa", name = "r", descriptor = "I")
    public static int field204;

    @OriginalMember(owner = "client!aa", name = "v", descriptor = "I")
    public static int field208;

    @OriginalMember(owner = "client!aa", name = "x", descriptor = "I")
    public static int field210;

    @OriginalMember(owner = "client!aa", name = "G", descriptor = "I")
    public int field219;

    @OriginalMember(owner = "client!aa", name = "I", descriptor = "I")
    public int field221;

    @OriginalMember(owner = "client!aa", name = "J", descriptor = "I")
    public int field222;

    @OriginalMember(owner = "client!aa", name = "K", descriptor = "I")
    public static int field223;

    @OriginalMember(owner = "client!aa", name = "L", descriptor = "I")
    public int field224;

    @OriginalMember(owner = "client!aa", name = "N", descriptor = "I")
    public int field226;

    @OriginalMember(owner = "client!aa", name = "z", descriptor = "Lmk;")
    public class127 field212;

    @OriginalMember(owner = "client!aa", name = "u", descriptor = "Lje;")
    public class140 field207;

    @OriginalMember(owner = "client!aa", name = "t", descriptor = "Laj;")
    public class162 field206;

    @OriginalMember(owner = "client!aa", name = "P", descriptor = "Laa;")
    public class16 field228;

    @OriginalMember(owner = "client!aa", name = "O", descriptor = "Lna;")
    public class213 field227;

    @OriginalMember(owner = "client!aa", name = "s", descriptor = "Lkk;")
    public class47 field205;

    @OriginalMember(owner = "client!aa", name = "M", descriptor = "Lhd;")
    public class90 field225;

    @OriginalMember(owner = "client!aa", name = "E", descriptor = "Z")
    public boolean field217;

    @OriginalMember(owner = "client!aa", name = "F", descriptor = "Z")
    public boolean field218;

    @OriginalMember(owner = "client!aa", name = "Q", descriptor = "Z")
    public boolean field229;

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(IIIIIIIIIIIIIIIIIIII)V")
    public static final void method64(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18, int arg19) {
        if (arg3 == 0) {
            class162 var20 = new class162(arg10, arg11, arg12, arg13, -1, arg18, false);
            for (int var21 = arg0; var21 >= 0; var21--) {
                if (class110.field2124[var21][arg1][arg2] == null) {
                    class110.field2124[var21][arg1][arg2] = new class16(var21, arg1, arg2);
                }
            }
            class110.field2124[arg0][arg1][arg2].field206 = var20;
        } else if (arg3 == 1) {
            class162 var22 = new class162(arg14, arg15, arg16, arg17, arg5, arg19, arg6 == arg7 && arg6 == arg8 && arg6 == arg9);
            for (int var23 = arg0; var23 >= 0; var23--) {
                if (class110.field2124[var23][arg1][arg2] == null) {
                    class110.field2124[var23][arg1][arg2] = new class16(var23, arg1, arg2);
                }
            }
            class110.field2124[arg0][arg1][arg2].field206 = var22;
        } else {
            class213 var24 = new class213(arg3, arg4, arg5, arg1, arg2, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19);
            for (int var25 = arg0; var25 >= 0; var25--) {
                if (class110.field2124[var25][arg1][arg2] == null) {
                    class110.field2124[var25][arg1][arg2] = new class16(var25, arg1, arg2);
                }
            }
            class110.field2124[arg0][arg1][arg2].field227 = var24;
        }
    }

    @OriginalMember(owner = "client!aa", name = "<init>", descriptor = "(III)V")
    public class16(int arg0, int arg1, int arg2) {
        this.field230 = arg2;
        this.field211 = arg1;
        this.field213 = this.field215 = arg0;
    }

    @OriginalMember(owner = "client!aa", name = "d", descriptor = "(I)V")
    public static void method65(int arg0) {
        field202 = null;
        field209 = null;
        if (arg0 == 0) {
            field203 = null;
        }
    }
}
