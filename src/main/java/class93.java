import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oc")
public class class93 extends class311 {

    @OriginalMember(owner = "client!oc", name = "q", descriptor = "J")
    public long field1295;

    @OriginalMember(owner = "client!oc", name = "p", descriptor = "I")
    public static int field1294 = -1;

    @OriginalMember(owner = "client!oc", name = "v", descriptor = "I")
    public static int field1300 = -1;

    @OriginalMember(owner = "client!oc", name = "x", descriptor = "[[I")
    public static int[][] field1302 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12, 12, 5 }, { 5, 5, 1, 1 }, { 5, 1, 1, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 12, 12, 12, 12, 12 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 3, 1, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 7, 3, 7 }, { 12, 12, 12, 12 } };

    @OriginalMember(owner = "client!oc", name = "y", descriptor = "Lhc;")
    public static class368 field1303;

    @OriginalMember(owner = "client!oc", name = "r", descriptor = "I")
    public static int field1296;

    @OriginalMember(owner = "client!oc", name = "s", descriptor = "I")
    public static int field1297;

    @OriginalMember(owner = "client!oc", name = "t", descriptor = "I")
    public static int field1298;

    @OriginalMember(owner = "client!oc", name = "u", descriptor = "I")
    public static int field1299;

    @OriginalMember(owner = "client!oc", name = "w", descriptor = "Lij;")
    public static class316 field1301;

    static {
        new class368("If you are not, please change your password to something more obscure!", "nicht der Fall ist, ändere dein Passwort zu einem ungewöhnlicheren Begriff!", "Si ce n'est pas le cas, remplacez votre mot de passe par une formule moins évidente !", "Caso não esteja, altere sua senha para algo mais obscuro!");
        field1303 = new class368(" more options", " weitere Optionen", " autres options", " mais opções");
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(ZI)Z", line = 8)
    public static final boolean method730(boolean arg0, int arg1) {
        field1299++;
        if (!arg0) {
            method732(-113, (byte) 119);
        }
        return (arg1 & -arg1) == arg1;
    }

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "(B)V", line = 19)
    public static final void method731(byte arg0) {
        class408 var1 = class55.field711;
        synchronized (class55.field711) {
            class55.field711.method2530((byte) -111);
        }
        field1298++;
        class408 var2 = class422.field5838;
        synchronized (class422.field5838) {
            class422.field5838.method2530((byte) -96);
            if (arg0 > -1) {
                method730(false, 106);
            }
        }
    }

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "(IB)C", line = 35)
    public static final char method732(int arg0, byte arg1) {
        field1296++;
        int var2 = arg1 & 0xFF;
        if (var2 == 0) {
            throw new IllegalArgumentException("Non cp1252 character 0x" + Integer.toString(var2, 16) + " provided");
        } else if (arg0 == 63) {
            if (var2 >= 128 && var2 < 160) {
                char var3 = class171.field2432[var2 - 128];
                if (var3 == '\u0000') {
                    var3 = '?';
                }
                var2 = var3;
            }
            return (char) var2;
        } else {
            return (char) 65436;
        }
    }

    @OriginalMember(owner = "client!oc", name = "c", descriptor = "(B)V", line = 65)
    public static void method733(byte arg0) {
        if (arg0 > 29) {
            field1303 = null;
            field1301 = null;
            field1302 = null;
        }
    }

    @OriginalMember(owner = "client!oc", name = "<init>", descriptor = "()V", line = 94)
    public class93() {
    }

    @OriginalMember(owner = "client!oc", name = "<init>", descriptor = "(J)V", line = 96)
    public class93(long arg0) {
        this.field1295 = arg0;
    }
}
