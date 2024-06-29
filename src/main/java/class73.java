import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ls")
public class class73 extends class98 {

    @OriginalMember(owner = "client!ls", name = "P", descriptor = "Liq;")
    public static class362 field875 = new class362("Connected to update server", "Verbindung zum Update-Server hergestellt.", "Connecté au serveur de mise à jour", "Conectado ao servidor de atualização");

    @OriginalMember(owner = "client!ls", name = "L", descriptor = "I")
    public static int field871;

    @OriginalMember(owner = "client!ls", name = "M", descriptor = "I")
    public static int field872;

    @OriginalMember(owner = "client!ls", name = "N", descriptor = "I")
    public static int field873;

    @OriginalMember(owner = "client!ls", name = "R", descriptor = "I")
    public static int field877;

    @OriginalMember(owner = "client!ls", name = "S", descriptor = "I")
    public static int field878;

    @OriginalMember(owner = "client!ls", name = "O", descriptor = "Lsj;")
    public static class266 field874;

    @OriginalMember(owner = "client!ls", name = "T", descriptor = "Lqs;")
    public static class360 field879;

    @OriginalMember(owner = "client!ls", name = "Q", descriptor = "Lgj;")
    public static class381 field876;

    @OriginalMember(owner = "client!ls", name = "f", descriptor = "(B)V", line = 5)
    public static final void method411(byte arg0) {
        ++field873;
        class178.method1210(25, -101);
        if (arg0 > -117) {
            field876 = null;
        }
        class56.method324(true);
        System.gc();
    }

    @OriginalMember(owner = "client!ls", name = "g", descriptor = "(B)V", line = 20)
    public static void method412(byte arg0) {
        int var1 = 48 / ((arg0 - 14) / 62);
        field875 = null;
        field879 = null;
        field876 = null;
        field874 = null;
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(IIILmj;Lmj;)V", line = 32)
    public static final void method413(int arg0, int arg1, int arg2, class394 arg3, class394 arg4) {
        if (class250.field3570[arg0][arg1][arg2] == null) {
            class313.method2069(arg0, arg1, arg2);
        }
        class250.field3570[arg0][arg1][arg2].field2784 = arg3;
        class250.field3570[arg0][arg1][arg2].field2771 = arg4;
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(II)[I", line = 44)
    public final int[] method83(int arg0, int arg1) {
        if (arg0 != 0) {
            return null;
        } else {
            ++field871;
            int[] var3 = super.field1177.method820(arg1, true);
            if (super.field1177.field1610) {
                class316.method2073(var3, 0, class268.field3811, class163.field2285[arg1]);
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(Lgk;B)V", line = 67)
    public static final void method414(class278 arg0, byte arg1) {
        arg0.field3937 = null;
        if (arg1 > 0) {
            field879 = null;
        }
        ++field872;
        if (~class3.field23 > -21) {
            class153.field1895.method2511(19, arg0);
            ++class3.field23;
        }
    }

    @OriginalMember(owner = "client!ls", name = "<init>", descriptor = "()V", line = 91)
    public class73() {
        super(0, true);
    }
}
