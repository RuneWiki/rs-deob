import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hj")
public class class73 {

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "I")
    public static int field1227 = 0;

    @OriginalMember(owner = "client!hj", name = "d", descriptor = "I")
    public static int field1230 = 0;

    @OriginalMember(owner = "client!hj", name = "b", descriptor = "I")
    public static int field1228;

    @OriginalMember(owner = "client!hj", name = "c", descriptor = "I")
    public static int field1229;

    @OriginalMember(owner = "client!hj", name = "e", descriptor = "I")
    public static int field1231;

    @OriginalMember(owner = "client!hj", name = "f", descriptor = "I")
    public static int field1232;

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(BI)Lpe;")
    public static final class252 method529(byte arg0, int arg1) {
        field1228++;
        class252 var2 = (class252) class217.field3355.method1887(0, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class236.field3832.method1590(0, (byte) -25, arg1);
        class252 var4 = new class252(var3);
        var4.method1660(class132.field2071, (int[]) null);
        class217.field3355.method1886(-121, (long) arg1, var4);
        if (arg0 != -91) {
            field1230 = -72;
        }
        return var4;
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(ZI)V")
    public static final void method530(boolean arg0, int arg1) {
        field1231++;
        class241.field3922.method1897(arg0, arg1);
        class112.field1835.method1897(arg0, arg1);
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(BLna;)V")
    public static final void method531(byte arg0, class32 arg1) {
        field1232++;
        class124 var2 = null;
        try {
            class76 var3 = arg1.method256(12, "runescape");
            while (var3.field1255 == 0) {
                class150.method1011((byte) 41, 1L);
            }
            if (var3.field1255 == 1) {
                var2 = (class124) var3.field1258;
                class88 var4 = class70.method505((byte) 110);
                var2.method864(false, var4.field1535, var4.field1471, 0);
            }
        } catch (Exception var6) {
        }
        if (arg0 != 8) {
            method529((byte) -84, 66);
        }
        try {
            if (var2 != null) {
                var2.method863((byte) 123);
            }
        } catch (Exception var5) {
        }
    }
}
