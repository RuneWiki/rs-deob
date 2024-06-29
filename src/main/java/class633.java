import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jm")
public class class633 {

    @OriginalMember(owner = "client!jm", name = "e", descriptor = "Z")
    public boolean field8861 = false;

    @OriginalMember(owner = "client!jm", name = "b", descriptor = "Z")
    public static boolean field8858 = false;

    @OriginalMember(owner = "client!jm", name = "l", descriptor = "[I")
    public static int[] field8868 = new int[200];

    @OriginalMember(owner = "client!jm", name = "h", descriptor = "I")
    public static int field8864 = 0;

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "I")
    public static int field8857;

    @OriginalMember(owner = "client!jm", name = "c", descriptor = "I")
    public int field8859;

    @OriginalMember(owner = "client!jm", name = "f", descriptor = "I")
    public int field8862;

    @OriginalMember(owner = "client!jm", name = "g", descriptor = "I")
    public static int field8863;

    @OriginalMember(owner = "client!jm", name = "i", descriptor = "I")
    public static int field8865;

    @OriginalMember(owner = "client!jm", name = "j", descriptor = "I")
    public static int field8866;

    @OriginalMember(owner = "client!jm", name = "k", descriptor = "I")
    public static int field8867;

    @OriginalMember(owner = "client!jm", name = "m", descriptor = "I")
    public static int field8869;

    @OriginalMember(owner = "client!jm", name = "d", descriptor = "Lrf;")
    public class75 field8860;

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(ZLoa;ZI)Lxa;")
    public final class461 method3515(boolean arg0, class638 arg1, boolean arg2, int arg3) {
        field8866++;
        long var5 = (long) (arg1.field9051 << 19 | (arg2 ? 262144 : 0) | this.field8859 | arg3 << 16);
        class461 var7 = (class461) this.field8860.field1038.method1986((byte) -109, var5);
        if (var7 != null) {
            return var7;
        } else if (!this.field8860.field1037.method947(-110, this.field8859)) {
            return null;
        } else if (arg0) {
            return null;
        } else {
            class543 var8 = class543.method2990(this.field8860.field1037, this.field8859, 0);
            if (var8 != null) {
                var8.field7379 = var8.field7375 = var8.field7381 = var8.field7374 = 0;
                if (arg2) {
                    var8.method2980();
                }
                for (int var9 = 0; var9 < arg3; var9++) {
                    var8.method2987();
                }
            }
            class461 var10 = arg1.method412(var8, true);
            if (var10 != null) {
                this.field8860.field1038.method1985(var10, var5, (byte) -102);
            }
            return var10;
        }
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(I)V")
    public static void method3516(int arg0) {
        field8868 = null;
        int var1 = 48 / ((arg0 - 20) / 62);
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(Ljr;I)V")
    public final void method3517(class96 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method718(arg1 - 29504);
            if (var3 == 0) {
                if (arg1 != 29452) {
                    field8864 = -6;
                }
                field8863++;
                return;
            }
            this.method3519(-107, arg0, var3);
        }
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(ZII)Liaa;")
    public static final class455 method3518(boolean arg0, int arg1, int arg2) {
        field8869++;
        class455 var3 = new class455();
        var3.field6344 = -1;
        var3.field6356 = arg2 + 1 + 5;
        var3.field6352 = arg1 + 1 + 5;
        var3.field6355 = -1;
        var3.field6346 = new int[var3.field6352][var3.field6356];
        if (!arg0) {
            field8864 = 81;
        }
        var3.method2612((byte) -122);
        return var3;
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(ILjr;I)V")
    private final void method3519(int arg0, class96 arg1, int arg2) {
        field8867++;
        int var4 = 28 % (arg0 / 45);
        if (arg2 == 1) {
            this.field8859 = arg1.method743((byte) -118);
        } else if (arg2 == 2) {
            this.field8862 = arg1.method736(-125);
            return;
        } else if (arg2 == 3) {
            this.field8861 = true;
            return;
        } else if (arg2 == 4) {
            this.field8859 = -1;
            return;
        }
    }

    @OriginalMember(owner = "client!jm", name = "b", descriptor = "(I)Z")
    public final boolean method3520(int arg0) {
        field8857++;
        if (arg0 != -25614) {
            this.method3517(null, 88);
        }
        return this.field8860.field1037.method947(-119, this.field8859);
    }
}
