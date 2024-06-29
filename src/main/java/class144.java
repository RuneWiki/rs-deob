import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dd")
public class class144 {

    @OriginalMember(owner = "client!dd", name = "g", descriptor = "I")
    public int field1959;

    @OriginalMember(owner = "client!dd", name = "i", descriptor = "I")
    public int field1961;

    @OriginalMember(owner = "client!dd", name = "d", descriptor = "I")
    public int field1956;

    @OriginalMember(owner = "client!dd", name = "c", descriptor = "I")
    public int field1955;

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "I")
    public static int field1953;

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "I")
    public static int field1954;

    @OriginalMember(owner = "client!dd", name = "e", descriptor = "I")
    public static int field1957;

    @OriginalMember(owner = "client!dd", name = "f", descriptor = "I")
    public static int field1958;

    @OriginalMember(owner = "client!dd", name = "h", descriptor = "[Lpaa;")
    public static class710[] field1960;

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(Lsl;B)Lqa;")
    public static final class147 method1007(class479 arg0, byte arg1) {
        if (arg1 >= -109) {
            field1960 = null;
        }
        field1953++;
        int var2 = arg0.method2886(true);
        class14 var3 = class176.method1266(24)[arg0.method2886(true)];
        class141 var4 = class501.method3050(true)[arg0.method2886(true)];
        int var5 = arg0.method2870(-11395);
        int var6 = arg0.method2870(-11395);
        int var7 = arg0.method2882(-1);
        int var8 = arg0.method2882(-1);
        int var9 = arg0.method2868(-71);
        int var10 = arg0.method2868(-93);
        int var11 = arg0.method2868(-107);
        boolean var12 = arg0.method2886(true) == 1;
        return new class147(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12);
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(B)Ldk;")
    public static final class88 method1008(byte arg0) {
        field1954++;
        if (arg0 < 51) {
            method1009(-21, 34, 52);
        }
        class88 var1 = class482.method2938(67783);
        var1.field1258 = null;
        var1.field1257 = 0;
        var1.field1260 = new class168(5000);
        return var1;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(III)I")
    public static final int method1009(int arg0, int arg1, int arg2) {
        field1957++;
        if (arg2 != 2) {
            field1960 = null;
        }
        int var3 = (arg1 & 0x7F) * arg0 >> 7;
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return (arg1 & 0xFF80) + var3;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(Z)V")
    public static void method1010(boolean arg0) {
        if (!arg0) {
            field1960 = null;
        }
        field1960 = null;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(ZI)Ldd;")
    public final class144 method1011(boolean arg0, int arg1) {
        field1958++;
        return arg0 ? new class144(this.field1961, arg1, this.field1959, this.field1956) : null;
    }

    @OriginalMember(owner = "client!dd", name = "<init>", descriptor = "(IIII)V")
    public class144(int arg0, int arg1, int arg2, int arg3) {
        this.field1959 = arg2;
        this.field1961 = arg0;
        this.field1956 = arg3;
        this.field1955 = arg1;
    }
}
