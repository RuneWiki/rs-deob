import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ck")
public class class8 extends class260 {

    @OriginalMember(owner = "client!ck", name = "m", descriptor = "I")
    private int field71;

    @OriginalMember(owner = "client!ck", name = "l", descriptor = "I")
    private int field70;

    @OriginalMember(owner = "client!ck", name = "n", descriptor = "I")
    private int field72;

    @OriginalMember(owner = "client!ck", name = "q", descriptor = "I")
    private int field75;

    @OriginalMember(owner = "client!ck", name = "r", descriptor = "Led;")
    public static class115 field76 = new class115();

    @OriginalMember(owner = "client!ck", name = "t", descriptor = "[I")
    public static int[] field78 = new int[4];

    @OriginalMember(owner = "client!ck", name = "u", descriptor = "Lbv;")
    public static class567 field79 = new class567("Loaded update list", "Update-Liste geladen.", "Liste des mises à jour chargée", "Lista de atualizações carregada");

    @OriginalMember(owner = "client!ck", name = "v", descriptor = "[Lbj;")
    public static class439[] field80 = new class439[14];

    @OriginalMember(owner = "client!ck", name = "i", descriptor = "I")
    public static int field67;

    @OriginalMember(owner = "client!ck", name = "j", descriptor = "I")
    public static int field68;

    @OriginalMember(owner = "client!ck", name = "k", descriptor = "I")
    public static int field69;

    @OriginalMember(owner = "client!ck", name = "o", descriptor = "I")
    public static int field73;

    @OriginalMember(owner = "client!ck", name = "p", descriptor = "I")
    public static int field74;

    @OriginalMember(owner = "client!ck", name = "w", descriptor = "I")
    public static int field81;

    @OriginalMember(owner = "client!ck", name = "s", descriptor = "Lgp;")
    public static class561 field77;

    // $FF: synthetic field
    @OriginalMember(owner = "client!ck", name = "x", descriptor = "Ljava/lang/Class;")
    public static Class field82;

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(III)V")
    public final void method30(int arg0, int arg1, int arg2) {
        if (arg2 == 0) {
            ++field69;
            int var4 = this.field72 * arg0 >> 12;
            int var5 = this.field75 * arg0 >> 12;
            int var6 = this.field71 * arg1 >> 12;
            int var7 = this.field70 * arg1 >> 12;
            class534.method3018(var5, super.field3783, (byte) 80, var7, var4, super.field3782, var6);
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(ZLjava/lang/String;)Z")
    public static final boolean method31(boolean arg0, String arg1) {
        ++field73;
        if (arg0) {
            field81 = -107;
        }
        return class82.method754(41, field82 != null ? field82 : (field82 = class260.method1653("cr")), arg1);
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(IBI)V")
    public final void method32(int arg0, byte arg1, int arg2) {
        ++field68;
        int var4 = this.field72 * arg0 >> 12;
        if (arg1 < 6) {
            field80 = null;
        }
        int var5 = this.field75 * arg0 >> 12;
        int var6 = this.field71 * arg2 >> 12;
        int var7 = this.field70 * arg2 >> 12;
        class420.method2524(super.field3782, 111, super.field3778, super.field3783, var5, var6, var7, var4);
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(ZII)V")
    public final void method33(boolean arg0, int arg1, int arg2) {
        ++field67;
        int var4 = this.field72 * arg1 >> 12;
        int var5 = this.field75 * arg1 >> 12;
        int var6 = this.field71 * arg2 >> 12;
        int var7 = this.field70 * arg2 >> 12;
        class261.method1664(arg0, var6, var4, super.field3778, var5, var7);
    }

    @OriginalMember(owner = "client!ck", name = "<init>", descriptor = "(IIIIIII)V")
    public class8(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field71 = arg1;
        this.field70 = arg3;
        this.field72 = arg0;
        this.field75 = arg2;
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(IIB)Z")
    public static final boolean method34(int arg0, int arg1, byte arg2) {
        ++field74;
        if (arg2 > -100) {
            method31(false, (String) null);
        }
        return (arg0 & 540800) != 0;
    }

    @OriginalMember(owner = "client!ck", name = "b", descriptor = "(I)V")
    public static void method35(int arg0) {
        if (arg0 == -1427967220) {
            field79 = null;
            field80 = null;
            field77 = null;
            field78 = null;
            field76 = null;
        }
    }
}
