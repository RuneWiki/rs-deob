import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ya")
public abstract class class38 {

    @OriginalMember(owner = "client!ya", name = "e", descriptor = "I")
    public int field391;

    @OriginalMember(owner = "client!ya", name = "h", descriptor = "I")
    public int field394;

    @OriginalMember(owner = "client!ya", name = "a", descriptor = "I")
    public int field387;

    @OriginalMember(owner = "client!ya", name = "f", descriptor = "I")
    public int field392;

    @OriginalMember(owner = "client!ya", name = "g", descriptor = "I")
    public static int field393 = 2;

    @OriginalMember(owner = "client!ya", name = "j", descriptor = "I")
    public static int field396;

    @OriginalMember(owner = "client!ya", name = "l", descriptor = "[Loj;")
    public static class260[] field398;

    @OriginalMember(owner = "client!ya", name = "b", descriptor = "I")
    public static int field388;

    @OriginalMember(owner = "client!ya", name = "c", descriptor = "I")
    public static int field389;

    @OriginalMember(owner = "client!ya", name = "d", descriptor = "I")
    public static int field390;

    @OriginalMember(owner = "client!ya", name = "i", descriptor = "I")
    public static int field395;

    @OriginalMember(owner = "client!ya", name = "k", descriptor = "I")
    public static int field397;

    static {
        new class305("You already sent an abuse report under 60 secs ago! Do not abuse this system!", "Du hast bereits vor weniger als 60 Sekunden einen Regelverstoß gemeldet!", "Vous avez déjà signalé un abus il y a moins d'une minute ! N'abusez pas du système !", "Você já enviou uma denúncia de abuso há menos de um minuto. Não abuse deste sistema!");
        field396 = -1;
        field398 = new class260[14];
    }

    @OriginalMember(owner = "client!ya", name = "a", descriptor = "(I)V", line = 20)
    public static void method213(int arg0) {
        field398 = null;
        if (arg0 != 6806) {
            method218(-104);
        }
    }

    @OriginalMember(owner = "client!ya", name = "b", descriptor = "(I)V", line = 36)
    public static final void method218(int arg0) {
        field390++;
        if (class401.field5807 == class264.field3547) {
            return;
        }
        try {
            if (arg0 != 1) {
                field396 = -100;
            }
            class400.method2475(class216.field2949, -115, "tbrefresh");
        } catch (Throwable var1) {
        }
    }

    @OriginalMember(owner = "client!ya", name = "a", descriptor = "([BI)Z", line = 56)
    public static final boolean method220(byte[] arg0, int arg1) {
        field388++;
        class396 var2 = new class396(arg0);
        int var3 = var2.method2388((byte) -114);
        if (arg1 != var3) {
            return false;
        }
        boolean var4 = var2.method2388((byte) -126) == 1;
        if (var4) {
            class85.method465(0, var2);
        }
        class342.method1988(-7210, var2);
        return true;
    }

    @OriginalMember(owner = "client!ya", name = "<init>", descriptor = "(III)V", line = 83)
    public class38(int arg0, int arg1, int arg2) {
        while (arg2 > 1) {
            this.field387++;
            arg2 >>= 0x1;
        }
        this.field391 = arg0;
        this.field394 = arg1;
        this.field392 = 0x1 << this.field387;
    }

    @OriginalMember(owner = "client!ya", name = "aa", descriptor = "()V")
    public abstract void method206();

    @OriginalMember(owner = "client!ya", name = "pa", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
    public abstract void method207(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13);

    @OriginalMember(owner = "client!ya", name = "a", descriptor = "(III[[ZZ)V")
    public abstract void method208(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4);

    @OriginalMember(owner = "client!ya", name = "ba", descriptor = "(Li;IIIIZ)V")
    public abstract void method209(class31 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!ya", name = "qa", descriptor = "(III)V")
    public abstract void method210(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ya", name = "a", descriptor = "(II)V")
    public abstract void method211(int arg0, int arg1);

    @OriginalMember(owner = "client!ya", name = "a", descriptor = "(Li;IIIIZ)Z")
    public abstract boolean method212(class31 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!ya", name = "H", descriptor = "(Li;IIIIZ)V")
    public abstract void method214(class31 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!ya", name = "a", descriptor = "(Lbn;[I)V")
    public abstract void method215(class309 arg0, int[] arg1);

    @OriginalMember(owner = "client!ya", name = "ca", descriptor = "(II)I")
    public abstract int method216(int arg0, int arg1);

    @OriginalMember(owner = "client!ya", name = "ua", descriptor = "(II)I")
    public abstract int method217(int arg0, int arg1);

    @OriginalMember(owner = "client!ya", name = "a", descriptor = "(IIIIIII[[Z)V")
    public abstract void method219(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7);

    @OriginalMember(owner = "client!ya", name = "OA", descriptor = "(IILi;)Li;")
    public abstract class31 method221(int arg0, int arg1, class31 arg2);

    @OriginalMember(owner = "client!ya", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
    public abstract void method222(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16);
}
