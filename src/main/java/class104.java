import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qg")
public class class104 {

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "I")
    public static int field1602 = 0;

    @OriginalMember(owner = "client!qg", name = "i", descriptor = "I")
    public static int field1610 = 0;

    @OriginalMember(owner = "client!qg", name = "e", descriptor = "I")
    public static int field1606 = 0;

    @OriginalMember(owner = "client!qg", name = "c", descriptor = "I")
    public static int field1604;

    @OriginalMember(owner = "client!qg", name = "d", descriptor = "I")
    public static int field1605;

    @OriginalMember(owner = "client!qg", name = "f", descriptor = "I")
    public static int field1607;

    @OriginalMember(owner = "client!qg", name = "h", descriptor = "I")
    public static int field1609;

    @OriginalMember(owner = "client!qg", name = "j", descriptor = "I")
    public static int field1611;

    @OriginalMember(owner = "client!qg", name = "b", descriptor = "Ldl;")
    public static class123 field1603;

    @OriginalMember(owner = "client!qg", name = "g", descriptor = "[[Lef;")
    public static class214[][] field1608;

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(III)Ltb;")
    public static final class69 method684(int arg0, int arg1, int arg2) {
        class49 var3 = class90.field1382[arg0][arg1][arg2];
        return var3 == null ? null : var3.field627;
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(B)Z")
    public static final boolean method685(byte arg0) {
        field1609++;
        try {
            if (arg0 >= -22) {
                method684(-66, -123, -9);
            }
            return class93.method625((byte) 113);
        } catch (IOException var4) {
            class103.method681((byte) -107);
            return true;
        } catch (Exception var5) {
            String var2 = "T2 - " + class262.field4233 + "," + class100.field1565 + "," + class95.field1470 + " - " + class179.field2793 + "," + (class126.field1869 + class149.field2227.field1257[0]) + "," + (class246.field3943 + class149.field2227.field1272[0]) + " - ";
            for (int var3 = 0; class179.field2793 > var3 && var3 < 50; var3++) {
                var2 = var2 + class235.field3766.field339[var3] + ",";
            }
            class48.method359(1, var5, var2);
            class147.method984((byte) -10);
            return true;
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(I)V")
    public static void method686(int arg0) {
        field1603 = null;
        if (arg0 == -51) {
            field1608 = null;
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(IIIILhi;IJIIII)Z")
    public static final boolean method687(int arg0, int arg1, int arg2, int arg3, class219 arg4, int arg5, long arg6, int arg7, int arg8, int arg9, int arg10) {
        return arg4 == null ? true : class3.method9(arg0, arg7, arg8, arg9 + 1 - arg7, arg10 - arg8 + 1, arg1, arg2, arg3, arg4, arg5, true, arg6);
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(II)Lsi;")
    public static final class198 method688(int arg0, int arg1) {
        field1604++;
        class198 var2 = (class198) class190.field2998.method1428((long) arg0, (byte) -103);
        if (arg1 != 30091) {
            method685((byte) -34);
        }
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class276.field4392.method807((byte) 112, class73.method501(arg0, 21717), class130.method884((byte) -7, arg0));
        class198 var4 = new class198();
        var4.field3087 = arg0;
        if (var3 != null) {
            var4.method1369(new class25(var3), -412836336);
        }
        var4.method1371((byte) 75);
        class190.field2998.method1424((long) arg0, var4, -2003648287);
        return var4;
    }
}
