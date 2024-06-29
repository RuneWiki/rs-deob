import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pd")
public class class241 {

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "I")
    public static int field3114 = 0;

    @OriginalMember(owner = "client!pd", name = "d", descriptor = "Z")
    public static boolean field3117 = true;

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "I")
    public static int field3115;

    @OriginalMember(owner = "client!pd", name = "c", descriptor = "I")
    public static int field3116;

    @OriginalMember(owner = "client!pd", name = "e", descriptor = "I")
    public static int field3118;

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(Lji;I)Lmea;")
    public static final class398 method1444(class572 arg0, int arg1) {
        field3116++;
        String var2 = arg0.method3072(arg1 ^ 0xFFFFCFE3);
        class580 var3 = class682.method3772((byte) -113)[arg0.method3097((byte) 12)];
        class241 var4 = class457.method2517(false)[arg0.method3097((byte) 12)];
        int var5 = arg0.method3086(arg1 + 77796);
        int var6 = arg0.method3086(65280);
        int var7 = arg0.method3097((byte) 12);
        int var8 = arg0.method3097((byte) 12);
        if (arg1 != -12516) {
            method1444(null, 1);
        }
        int var9 = arg0.method3097((byte) 12);
        int var10 = arg0.method3031(-1);
        int var11 = arg0.method3031(-1);
        int var12 = arg0.method3064(-2031091464);
        int var13 = arg0.method3064(-2031091464);
        int var14 = arg0.method3064(-2031091464);
        return new class398(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14);
    }

    @OriginalMember(owner = "client!pd", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field3115++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(III)I")
    public final int method1445(int arg0, int arg1, int arg2) {
        if (arg0 != 2) {
            return -47;
        }
        field3118++;
        int var4 = arg1 >= class491.field6129 ? arg1 : class491.field6129;
        if (class514.field6536 == this) {
            return 0;
        } else if (class250.field3224 == this) {
            return var4 - arg2;
        } else if (class480.field5969 == this) {
            return (var4 - arg2) / 2;
        } else {
            return 0;
        }
    }
}
