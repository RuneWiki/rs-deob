import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ag")
public class class484 {

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "[Lug;")
    public static class396[] field7127 = new class396[2048];

    @OriginalMember(owner = "client!ag", name = "d", descriptor = "Ljc;")
    public static class305 field7130 = new class305("Started 3D Library", "3D-Softwarebibliothek gestartet.", "Librairie 3D démarrée", "Biblioteca 3D iniciada");

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "I")
    public static int field7128;

    @OriginalMember(owner = "client!ag", name = "f", descriptor = "I")
    public static int field7132;

    @OriginalMember(owner = "client!ag", name = "c", descriptor = "J")
    public static long field7129;

    @OriginalMember(owner = "client!ag", name = "e", descriptor = "[[[Lno;")
    public static class498[][][] field7131;

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(I)V", line = 4)
    public static void method2946(int arg0) {
        field7130 = null;
        field7127 = null;
        if (arg0 < -108) {
            field7131 = null;
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(BII)V", line = 23)
    public static final void method2947(byte arg0, int arg1, int arg2) {
        int var3 = 105 % ((36 - arg0) / 63);
        class508.field7367 = arg2 - class416.field6009;
        class178.field2308 = arg1 - class416.field6020;
        field7132++;
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(II)V", line = 39)
    public static final void method2948(int arg0, int arg1) {
        class142.field1893 = arg1;
        field7128++;
        class509 var2 = class374.field5067;
        synchronized (class374.field5067) {
            class374.field5067.method3045(48);
            if (arg0 >= -110) {
                field7129 = 89L;
            }
        }
    }
}
