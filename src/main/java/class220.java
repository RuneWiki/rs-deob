import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ya")
public abstract class class220 {

    @OriginalMember(owner = "client!ya", name = "a", descriptor = "I")
    public int field3797;

    @OriginalMember(owner = "client!ya", name = "e", descriptor = "I")
    public int field3801;

    @OriginalMember(owner = "client!ya", name = "g", descriptor = "I")
    public int field3803;

    @OriginalMember(owner = "client!ya", name = "f", descriptor = "I")
    public int field3802;

    @OriginalMember(owner = "client!ya", name = "b", descriptor = "Lbu;")
    public static class407 field3798 = new class407(16);

    @OriginalMember(owner = "client!ya", name = "d", descriptor = "Lvv;")
    public static class313 field3800 = new class313(99, -1);

    @OriginalMember(owner = "client!ya", name = "h", descriptor = "Llo;")
    public static class306 field3804 = new class306("Connecting to update server", "Verbindung mit Update-Server...", "Connexion au serveur de mise à jour en cours", "Conectando ao servidor de atualização");

    @OriginalMember(owner = "client!ya", name = "i", descriptor = "Lvv;")
    public static class313 field3805 = new class313(12, -2);

    @OriginalMember(owner = "client!ya", name = "c", descriptor = "I")
    public static int field3799;

    @OriginalMember(owner = "client!ya", name = "j", descriptor = "I")
    public static int field3806;

    @OriginalMember(owner = "client!ya", name = "H", descriptor = "(Li;IIIIZ)V")
    public abstract void method1509(class515 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!ya", name = "OA", descriptor = "(IILi;)Li;")
    public abstract class515 method1510(int arg0, int arg1, class515 arg2);

    @OriginalMember(owner = "client!ya", name = "qa", descriptor = "(III)V")
    public abstract void method1511(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ya", name = "a", descriptor = "(III[[ZZ)V")
    public abstract void method1512(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4);

    @OriginalMember(owner = "client!ya", name = "a", descriptor = "(Lja;[I)V")
    public abstract void method1513(class450 arg0, int[] arg1);

    @OriginalMember(owner = "client!ya", name = "a", descriptor = "(IIIIIII[[Z)V")
    public abstract void method1514(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7);

    @OriginalMember(owner = "client!ya", name = "a", descriptor = "(II)V")
    public abstract void method1515(int arg0, int arg1);

    @OriginalMember(owner = "client!ya", name = "ua", descriptor = "(II)I")
    public abstract int method1516(int arg0, int arg1);

    @OriginalMember(owner = "client!ya", name = "ca", descriptor = "(II)I")
    public abstract int method1517(int arg0, int arg1);

    @OriginalMember(owner = "client!ya", name = "ba", descriptor = "(Li;IIIIZ)V")
    public abstract void method1518(class515 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!ya", name = "a", descriptor = "(I)V")
    public static void method1519(int arg0) {
        field3798 = null;
        field3800 = null;
        field3804 = null;
        field3805 = null;
        if (arg0 != -11659) {
            method1519(13);
        }
    }

    @OriginalMember(owner = "client!ya", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
    public abstract void method1520(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16);

    @OriginalMember(owner = "client!ya", name = "a", descriptor = "(Li;IIIIZ)Z")
    public abstract boolean method1521(class515 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!ya", name = "a", descriptor = "(ZLjava/lang/String;)Ljava/lang/Class;")
    public static final Class method1522(boolean arg0, String arg1) throws ClassNotFoundException {
        if (!arg0) {
            field3798 = null;
        }
        field3799++;
        if (arg1.equals("B")) {
            return Byte.TYPE;
        } else if (arg1.equals("I")) {
            return Integer.TYPE;
        } else if (arg1.equals("S")) {
            return Short.TYPE;
        } else if (arg1.equals("J")) {
            return Long.TYPE;
        } else if (arg1.equals("Z")) {
            return Boolean.TYPE;
        } else if (arg1.equals("F")) {
            return Float.TYPE;
        } else if (arg1.equals("D")) {
            return Double.TYPE;
        } else if (arg1.equals("C")) {
            return Character.TYPE;
        } else {
            return Class.forName(arg1);
        }
    }

    @OriginalMember(owner = "client!ya", name = "<init>", descriptor = "(III)V")
    public class220(int arg0, int arg1, int arg2) {
        this.field3797 = arg1;
        while (arg2 > 1) {
            arg2 >>= 0x1;
            this.field3803++;
        }
        this.field3801 = arg0;
        this.field3802 = 0x1 << this.field3803;
    }

    @OriginalMember(owner = "client!ya", name = "pa", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
    public abstract void method1523(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13);

    @OriginalMember(owner = "client!ya", name = "aa", descriptor = "()V")
    public abstract void method1524();
}
