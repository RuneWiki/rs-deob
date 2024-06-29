import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lk")
public class class272 {

    @OriginalMember(owner = "client!lk", name = "c", descriptor = "I")
    public static int field3507 = 0;

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "I")
    public static int field3505 = -1;

    @OriginalMember(owner = "client!lk", name = "d", descriptor = "Z")
    public static boolean field3508 = true;

    @OriginalMember(owner = "client!lk", name = "k", descriptor = "I")
    public static int field3515 = 0;

    @OriginalMember(owner = "client!lk", name = "b", descriptor = "Lcq;")
    public static class72 field3506 = new class72("Starting 3d Library", "Starte 3D-Softwarebibliothek.", "Démarrage de la librairie 3D", "Iniciando biblioteca 3D");

    @OriginalMember(owner = "client!lk", name = "l", descriptor = "I")
    public static int field3516 = 0;

    @OriginalMember(owner = "client!lk", name = "e", descriptor = "I")
    public static int field3509;

    @OriginalMember(owner = "client!lk", name = "f", descriptor = "I")
    public int field3510;

    @OriginalMember(owner = "client!lk", name = "g", descriptor = "I")
    public static int field3511;

    @OriginalMember(owner = "client!lk", name = "i", descriptor = "I")
    public static int field3513;

    @OriginalMember(owner = "client!lk", name = "m", descriptor = "I")
    public static int field3517;

    @OriginalMember(owner = "client!lk", name = "h", descriptor = "Lfe;")
    public class133 field3512;

    @OriginalMember(owner = "client!lk", name = "j", descriptor = "Llk;")
    public class272 field3514;

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(IIIIII)Z")
    public static final boolean method1713(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 != arg2 || arg3 != arg4) {
            for (int var8 = arg1; var8 <= arg2; var8++) {
                for (int var14 = arg3; var14 <= arg4; var14++) {
                    if (class354.field4820[arg0][var8][var14] == -class49.field566) {
                        return false;
                    }
                }
            }
            int var9 = (arg1 << 7) + 1;
            int var10 = (arg3 << 7) + 2;
            int var11 = class304.field4096[arg0].method1050(arg1, arg3) + arg5;
            if (!class423.method2593(var9, var11, var10)) {
                return false;
            }
            int var12 = (arg2 << 7) - 1;
            if (!class423.method2593(var12, var11, var10)) {
                return false;
            }
            int var13 = (arg4 << 7) - 1;
            if (!class423.method2593(var9, var11, var13)) {
                return false;
            } else if (class423.method2593(var12, var11, var13)) {
                return true;
            } else {
                return false;
            }
        } else if (class361.method2272(arg0, arg1, arg3)) {
            int var6 = arg1 << 7;
            int var7 = arg3 << 7;
            return class423.method2593(var6 + 1, class304.field4096[arg0].method1050(arg1, arg3) + arg5, var7 + 1) && class423.method2593(var6 + 128 - 1, class304.field4096[arg0].method1050(arg1 + 1, arg3) + arg5, var7 + 1) && class423.method2593(var6 + 128 - 1, class304.field4096[arg0].method1050(arg1 + 1, arg3 + 1) + arg5, var7 + 128 - 1) && class423.method2593(var6 + 1, class304.field4096[arg0].method1050(arg1, arg3 + 1) + arg5, var7 + 128 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(I)V")
    public static void method1714(int arg0) {
        field3506 = null;
        if (arg0 != 1) {
            method1713(23, -123, -117, 105, -34, 0);
        }
    }

    @OriginalMember(owner = "client!lk", name = "b", descriptor = "(I)V")
    public final void method1715(int arg0) {
        field3517++;
        if (class453.field6356 >= 500) {
            return;
        }
        this.field3514 = class228.field2880;
        if (arg0 >= 21) {
            this.field3512 = null;
            this.field3510 = 0;
            class228.field2880 = this;
            class453.field6356++;
        }
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(IIIIIZ)V")
    public static final void method1716(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        field3511++;
        if (!arg5) {
            return;
        }
        if (class295.field3937 <= arg4 && class427.field5844 >= arg1 && arg0 >= class53.field624 && class118.field1356 >= arg3) {
            class203.method1245(arg2, arg0, arg1, (byte) -68, arg3, arg4);
        } else {
            class304.method1929(arg3, arg4, (byte) -105, arg2, arg1, arg0);
        }
    }
}
