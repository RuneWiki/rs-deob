import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kt")
public class class110 {

    @OriginalMember(owner = "client!kt", name = "c", descriptor = "Lih;")
    private class503 field1494;

    @OriginalMember(owner = "client!kt", name = "b", descriptor = "J")
    public long field1493;

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "Ltn;")
    public static class60 field1492 = new class60(60, -1);

    @OriginalMember(owner = "client!kt", name = "g", descriptor = "Lkn;")
    public static class530 field1498 = new class530("Discard", "Ablegen", "Jeter", "Descartar");

    @OriginalMember(owner = "client!kt", name = "h", descriptor = "[I")
    public static int[] field1499;

    @OriginalMember(owner = "client!kt", name = "j", descriptor = "Z")
    public static boolean field1501;

    @OriginalMember(owner = "client!kt", name = "i", descriptor = "J")
    public static long field1500;

    @OriginalMember(owner = "client!kt", name = "d", descriptor = "I")
    public static int field1495;

    @OriginalMember(owner = "client!kt", name = "e", descriptor = "I")
    public static int field1496;

    @OriginalMember(owner = "client!kt", name = "f", descriptor = "I")
    public static int field1497;

    @OriginalMember(owner = "client!kt", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        field1496++;
        this.field1494.method2946(true, this.field1493);
        super.finalize();
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(B)V")
    public static void method752(byte arg0) {
        field1498 = null;
        if (arg0 < -124) {
            field1492 = null;
            field1499 = null;
        }
    }

    @OriginalMember(owner = "client!kt", name = "<init>", descriptor = "(Lih;JI)V")
    public class110(class503 arg0, long arg1, int arg2) {
        this.field1494 = arg0;
        this.field1493 = arg1;
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(I)V")
    public static final void method753(int arg0) {
        if (arg0 != 1) {
            return;
        }
        field1495++;
        class434.field6108 = null;
        class343.method2042(-86, class147.field1956, 0, class472.field6578, 0, 0, class273.field4048, 0, -1);
        if (class434.field6108 != null) {
            class10.method58(class147.field1965.field2145, class434.field6108, class288.field4206, -1412584499, arg0 - 31201, class131.field1728, class273.field4048, 0, class147.field1956, 0);
            class434.field6108 = null;
        }
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(IIZIIIIII)Z")
    public static final boolean method754(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg7 <= 61) {
            return false;
        }
        field1497++;
        int var9 = class246.field3587.field3368[0];
        int var10 = class246.field3587.field3378[0];
        if (var9 < 0 || class43.field494 <= var9 || var10 < 0 || var10 >= class500.field7068) {
            return false;
        } else if (arg8 >= 0 && arg8 < class43.field494 && arg5 >= 0 && class500.field7068 > arg5) {
            int var11 = class335.method2004(class143.field1877[class246.field3587.field1904], arg0, arg6, arg8, class246.field3587.method125((byte) -120), class165.field2428, arg2, arg1, var10, arg4, arg3, var9, class431.field6088, (byte) -65, arg5);
            if (var11 < 1) {
                return false;
            }
            class243.field3527 = class431.field6088[var11 - 1];
            class282.field4153 = class165.field2428[var11 - 1];
            class395.field5609 = false;
            class264.method1679(false);
            return true;
        } else {
            return false;
        }
    }

    static {
        new class530("If you are not, please change your password to something more obscure!", "nicht der Fall ist, ändere dein Passwort zu einem ungewöhnlicheren Begriff!", "Si ce n'est pas le cas, remplacez votre mot de passe par une formule moins évidente !", "Caso não esteja, altere sua senha para algo mais obscuro!");
        field1499 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };
        field1501 = false;
        field1500 = 0L;
    }
}
