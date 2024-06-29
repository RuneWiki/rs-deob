import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!q")
public abstract class class151 {

    @OriginalMember(owner = "client!q", name = "b", descriptor = "[C")
    private static char[] field1931 = new char[64];

    @OriginalMember(owner = "client!q", name = "a", descriptor = "I")
    public static int field1930;

    @OriginalMember(owner = "client!q", name = "c", descriptor = "I")
    public static int field1932;

    @OriginalMember(owner = "client!q", name = "d", descriptor = "I")
    public static int field1933;

    @OriginalMember(owner = "client!q", name = "XA", descriptor = "(I)V")
    public abstract void method147(int arg0);

    @OriginalMember(owner = "client!q", name = "P", descriptor = "(I)V")
    public abstract void method136(int arg0);

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(III[B)[B")
    public static final byte[] method1104(int arg0, int arg1, int arg2, byte[] arg3) {
        field1930++;
        byte[] var4 = new byte[arg1];
        class443.method2514(arg3, arg0, var4, arg2, arg1);
        return var4;
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(III[I)V")
    public abstract void method145(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!q", name = "b", descriptor = "(I)V")
    public static void method1105(int arg0) {
        field1931 = null;
        if (arg0 != -53) {
            method1104(10, -112, 94, null);
        }
    }

    @OriginalMember(owner = "client!q", name = "O", descriptor = "([I)V")
    public abstract void method132(int[] arg0);

    @OriginalMember(owner = "client!q", name = "la", descriptor = "(Lq;)V")
    public abstract void method133(class151 arg0);

    @OriginalMember(owner = "client!q", name = "Y", descriptor = "()V")
    public abstract void method137();

    @OriginalMember(owner = "client!q", name = "a", descriptor = "()Lq;")
    public abstract class151 method131();

    @OriginalMember(owner = "client!q", name = "R", descriptor = "(III[I)V")
    public abstract void method134(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(I)V")
    public abstract void method138(int arg0);

    @OriginalMember(owner = "client!q", name = "G", descriptor = "(III)V")
    public abstract void method143(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!q", name = "pa", descriptor = "(IIIIII)V")
    public abstract void method144(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!q", name = "GA", descriptor = "(III)V")
    public abstract void method146(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!q", name = "S", descriptor = "(I)V")
    public abstract void method135(int arg0);

    @OriginalMember(owner = "client!q", name = "ra", descriptor = "(I)V")
    public abstract void method149(int arg0);

    static {
        for (int var0 = 0; var0 < 26; var0++) {
            field1931[var0] = (char) (var0 + 65);
        }
        for (int var1 = 26; var1 < 52; var1++) {
            field1931[var1] = (char) (var1 + 97 - 26);
        }
        for (int var2 = 52; var2 < 62; var2++) {
            field1931[var2] = (char) (var2 + 48 - 52);
        }
        field1931[63] = '/';
        field1931[62] = '+';
    }
}
