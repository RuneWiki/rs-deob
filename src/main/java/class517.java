import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bn")
public class class517 {

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "I")
    public int field7106;

    @OriginalMember(owner = "client!bn", name = "c", descriptor = "Lsv;")
    public static class570 field7108 = new class570(13, -1);

    @OriginalMember(owner = "client!bn", name = "e", descriptor = "[I")
    public static int[] field7110 = new int[1];

    @OriginalMember(owner = "client!bn", name = "d", descriptor = "I")
    public static int field7109;

    @OriginalMember(owner = "client!bn", name = "f", descriptor = "I")
    public static int field7111;

    @OriginalMember(owner = "client!bn", name = "b", descriptor = "Lgga;")
    public static class513 field7107;

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(I)V", line = 3)
    public static void method3028(int arg0) {
        field7108 = null;
        field7110 = null;
        if (arg0 < -49) {
            field7107 = null;
        }
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(IIBI)I", line = 18)
    public static final int method3029(int arg0, int arg1, byte arg2, int arg3) {
        field7109++;
        int var4 = arg3 / arg1;
        int var5 = arg1 - 1 & arg3;
        int var6 = arg0 / arg1;
        int var7 = arg1 - 1 & arg0;
        int var8 = class510.method2980(var6, -108, var4);
        int var9 = class510.method2980(var6, arg2 - 182, var4 + 1);
        int var10 = class510.method2980(var6 + 1, -101, var4);
        int var11 = class510.method2980(var6 + 1, -115, var4 - -1);
        int var12 = class427.method2503(var8, arg1, var9, var5, false);
        if (arg2 != 74) {
            method3029(80, -123, (byte) -57, -94);
        }
        int var13 = class427.method2503(var10, arg1, var11, var5, false);
        return class427.method2503(var12, arg1, var13, var7, false);
    }

    @OriginalMember(owner = "client!bn", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", line = 49)
    public class517(String arg0, String arg1, String arg2, int arg3) {
        this.field7106 = arg3;
    }

    @OriginalMember(owner = "client!bn", name = "toString", descriptor = "()Ljava/lang/String;", line = 67)
    public final String toString() {
        field7111++;
        throw new IllegalStateException();
    }
}
