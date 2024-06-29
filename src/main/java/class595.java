import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ag")
public class class595 extends class199 {

    @OriginalMember(owner = "client!ag", name = "j", descriptor = "[I")
    public int[] field8691;

    @OriginalMember(owner = "client!ag", name = "f", descriptor = "[I")
    public int[] field8687;

    @OriginalMember(owner = "client!ag", name = "g", descriptor = "Lea;")
    public static class474 field8688 = new class474("Starting 3D Library", "Starte 3D-Softwarebibliothek.", "Démarrage de la librairie 3D", "Iniciando biblioteca 3D");

    @OriginalMember(owner = "client!ag", name = "o", descriptor = "Ljava/lang/String;")
    public static String field8696 = "";

    @OriginalMember(owner = "client!ag", name = "p", descriptor = "I")
    public static int field8697 = -1;

    @OriginalMember(owner = "client!ag", name = "h", descriptor = "I")
    public static int field8689;

    @OriginalMember(owner = "client!ag", name = "i", descriptor = "I")
    public static int field8690;

    @OriginalMember(owner = "client!ag", name = "m", descriptor = "Lti;")
    public static class377 field8694;

    @OriginalMember(owner = "client!ag", name = "k", descriptor = "[I")
    public static int[] field8692;

    @OriginalMember(owner = "client!ag", name = "n", descriptor = "[I")
    public static int[] field8695;

    @OriginalMember(owner = "client!ag", name = "l", descriptor = "[Lxa;")
    public static class433[] field8693;

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(BI)I")
    public static final int method3471(byte arg0, int arg1) {
        int var2 = 36 / ((71 - arg0) / 41);
        field8690++;
        return arg1 & 0x7F;
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(B)V")
    public static void method3472(byte arg0) {
        if (arg0 != 18) {
            return;
        }
        field8695 = null;
        field8693 = null;
        field8694 = null;
        field8692 = null;
        field8688 = null;
        field8696 = null;
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(II)Lgk;")
    public static final class409 method3473(int arg0, int arg1) {
        field8689++;
        class409 var2 = (class409) class343.field4891.method1801(arg1 ^ arg1, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class321.field4649.method1286(arg0, 0, (byte) -49);
        class409 var4 = new class409();
        if (var3 != null) {
            var4.method2591(arg1 ^ 0xFFFFFF97, new class194(var3));
        }
        var4.method2588(-1);
        class343.field4891.method1808((long) arg0, var4, (byte) -105);
        return var4;
    }

    @OriginalMember(owner = "client!ag", name = "<init>", descriptor = "(II[I[I)V")
    public class595(int arg0, int arg1, int[] arg2, int[] arg3) {
        this.field8691 = arg3;
        this.field8687 = arg2;
    }
}
