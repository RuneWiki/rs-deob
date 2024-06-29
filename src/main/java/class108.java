import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uh")
public class class108 {

    @OriginalMember(owner = "client!uh", name = "f", descriptor = "Lbl;")
    private class442 field1877;

    @OriginalMember(owner = "client!uh", name = "b", descriptor = "J")
    public long field1873;

    @OriginalMember(owner = "client!uh", name = "i", descriptor = "I")
    public static int field1880 = 10;

    @OriginalMember(owner = "client!uh", name = "e", descriptor = "Lsk;")
    public static class423 field1876 = new class423("Connected to update server", "Verbindung zum Update-Server hergestellt.", "Connecté au serveur de mise à jour", "Conectado ao servidor de atualização");

    @OriginalMember(owner = "client!uh", name = "k", descriptor = "Loq;")
    public static class231 field1882 = new class231("", 12);

    @OriginalMember(owner = "client!uh", name = "l", descriptor = "Lsk;")
    public static class423 field1883 = new class423("Starting 3d Library", "Starte 3D-Softwarebibliothek.", "Démarrage de la librairie 3D", "Iniciando biblioteca 3D");

    @OriginalMember(owner = "client!uh", name = "m", descriptor = "Lsk;")
    public static class423 field1884 = new class423("Loaded sprites", "Sprites geladen.", "Sprites chargés", "Sprites carregados");

    @OriginalMember(owner = "client!uh", name = "n", descriptor = "I")
    public static int field1885 = 0;

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "I")
    public static int field1872;

    @OriginalMember(owner = "client!uh", name = "c", descriptor = "I")
    public static int field1874;

    @OriginalMember(owner = "client!uh", name = "d", descriptor = "I")
    public static int field1875;

    @OriginalMember(owner = "client!uh", name = "g", descriptor = "I")
    public static int field1878;

    @OriginalMember(owner = "client!uh", name = "h", descriptor = "I")
    public static int field1879;

    @OriginalMember(owner = "client!uh", name = "j", descriptor = "I")
    public static int field1881;

    @OriginalMember(owner = "client!uh", name = "finalize", descriptor = "()V", line = 3)
    protected final void finalize() throws Throwable {
        field1879++;
        this.field1877.method2579(this.field1873, (byte) 121);
        super.finalize();
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(ILuj;)I", line = 12)
    public static final int method782(int arg0, class249 arg1) {
        field1881++;
        class245 var2 = arg1.field3819;
        if (var2.field3703 != null) {
            var2 = var2.method1477(class273.field4144, -12819);
            if (var2 == null) {
                return -1;
            }
        }
        if (arg0 != -1) {
            method782(-88, null);
        }
        int var3 = var2.field3722;
        class14 var4 = arg1.method892((byte) -110);
        if (arg1.field2196) {
            var3 = var2.field3723;
        } else if (arg1.field2201 == var4.field173 || arg1.field2201 == var4.field201 || arg1.field2201 == var4.field168 || arg1.field2201 == var4.field151) {
            var3 = var2.field3727;
        } else if (arg1.field2201 == var4.field190 || arg1.field2201 == var4.field169 || arg1.field2201 == var4.field187 || arg1.field2201 == var4.field172) {
            var3 = var2.field3731;
        }
        return var3;
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(IIIB)I", line = 50)
    public static final int method783(int arg0, int arg1, int arg2, byte arg3) {
        int var4 = arg0 & 0x3;
        field1875++;
        if (arg3 != -113) {
            return 117;
        } else if (var4 == 0) {
            return arg1;
        } else if (var4 == 1) {
            return 1023 - arg2;
        } else if (var4 == 2) {
            return 1023 - arg1;
        } else {
            return arg2;
        }
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(I)V", line = 71)
    public static final void method784(int arg0) {
        field1874++;
        class394.field5752.method1761(-115);
        if (arg0 > -48) {
            method783(-1, 123, -53, (byte) 7);
        }
    }

    @OriginalMember(owner = "client!uh", name = "b", descriptor = "(I)V", line = 89)
    public static void method785(int arg0) {
        field1883 = null;
        if (arg0 != 3) {
            field1880 = -123;
        }
        field1884 = null;
        field1882 = null;
        field1876 = null;
    }

    @OriginalMember(owner = "client!uh", name = "<init>", descriptor = "(Lbl;JI)V", line = 105)
    public class108(class442 arg0, long arg1, int arg2) {
        this.field1877 = arg0;
        this.field1873 = arg1;
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(II)Z", line = 124)
    public static final boolean method786(int arg0, int arg1) {
        if (arg1 <= 59) {
            field1880 = -112;
        }
        field1872++;
        return arg0 >= 0 && arg0 <= 3 || arg0 == 9;
    }
}
