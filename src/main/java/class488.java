import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kb")
public class class488 {

    @OriginalMember(owner = "client!kb", name = "f", descriptor = "Ljk;")
    private class449 field7104 = new class449(64);

    @OriginalMember(owner = "client!kb", name = "c", descriptor = "Lqn;")
    private class47 field7101;

    @OriginalMember(owner = "client!kb", name = "j", descriptor = "I")
    public int field7108;

    @OriginalMember(owner = "client!kb", name = "h", descriptor = "Lap;")
    public static class335 field7106 = new class335("Loading textures - ", "Lade Texturen - ", "Chargement des textures - ", "Carregando texturas - ");

    @OriginalMember(owner = "client!kb", name = "k", descriptor = "I")
    public static int field7109 = 0;

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "I")
    public static int field7099;

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "I")
    public static int field7100;

    @OriginalMember(owner = "client!kb", name = "d", descriptor = "I")
    public static int field7102;

    @OriginalMember(owner = "client!kb", name = "e", descriptor = "I")
    public static int field7103;

    @OriginalMember(owner = "client!kb", name = "g", descriptor = "I")
    public static int field7105;

    @OriginalMember(owner = "client!kb", name = "i", descriptor = "I")
    public static int field7107;

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(I)V", line = 3)
    public static void method2958(int arg0) {
        if (arg0 <= -27) {
            field7106 = null;
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(II)V", line = 15)
    public final void method2959(int arg0, int arg1) {
        field7102++;
        class449 var3 = this.field7104;
        synchronized (this.field7104) {
            this.field7104.method2648(false, arg1);
        }
        if (arg0 != 16) {
            field7106 = null;
        }
    }

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "(I)V", line = 30)
    public final void method2960(int arg0) {
        class449 var2 = this.field7104;
        synchronized (this.field7104) {
            this.field7104.method2640(115);
            if (arg0 != 0) {
                field7109 = 33;
            }
        }
        field7103++;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(B)V", line = 46)
    public final void method2961(byte arg0) {
        field7099++;
        class449 var2 = this.field7104;
        synchronized (this.field7104) {
            this.field7104.method2642(0);
            int var3 = -85 / ((arg0 + 4) / 51);
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(IIIIII)V", line = 63)
    public static final void method2962(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field7105++;
        if (arg4 == arg5) {
            class176.method1123(arg3, arg4, (byte) 100, arg1, arg2);
            return;
        }
        if (class147.field1870 <= arg2 - arg4 && class237.field3019 >= arg2 + arg4 && (arg3 - arg5) >= class533.field7845 && class289.field3694 >= arg3 + arg5) {
            class297.method1754(arg2, arg4, arg1, -32672, arg3, arg5);
        } else {
            class147.method979(arg3, arg5, arg1, arg4, arg2, 0);
        }
        if (arg0 != 16) {
            method2958(14);
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(BI)Lwe;", line = 89)
    public final class281 method2963(byte arg0, int arg1) {
        if (arg0 != -61) {
            this.method2960(-18);
        }
        field7107++;
        class449 var3 = this.field7104;
        class281 var4;
        synchronized (this.field7104) {
            var4 = (class281) this.field7104.method2647(-116, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class47 var5 = this.field7101;
        byte[] var6;
        synchronized (this.field7101) {
            var6 = this.field7101.method481(16, arg1, -92);
        }
        class281 var7 = new class281();
        if (var6 != null) {
            var7.method1668(700, new class463(var6));
        }
        class449 var8 = this.field7104;
        synchronized (this.field7104) {
            this.field7104.method2635((long) arg1, -26591, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!kb", name = "<init>", descriptor = "(Lae;ILqn;)V", line = 128)
    public class488(class165 arg0, int arg1, class47 arg2) {
        this.field7101 = arg2;
        if (this.field7101 == null) {
            this.field7108 = 0;
        } else {
            this.field7108 = this.field7101.method469(30322, 16);
        }
    }
}
