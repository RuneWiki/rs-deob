import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fk")
public class class50 {

    @OriginalMember(owner = "client!fk", name = "b", descriptor = "I")
    public static int field569;

    @OriginalMember(owner = "client!fk", name = "c", descriptor = "I")
    public int field570;

    @OriginalMember(owner = "client!fk", name = "d", descriptor = "I")
    public static int field571;

    @OriginalMember(owner = "client!fk", name = "e", descriptor = "I")
    public static int field572;

    @OriginalMember(owner = "client!fk", name = "f", descriptor = "I")
    public static int field573;

    @OriginalMember(owner = "client!fk", name = "g", descriptor = "I")
    public int field574;

    @OriginalMember(owner = "client!fk", name = "i", descriptor = "I")
    public int field576;

    @OriginalMember(owner = "client!fk", name = "h", descriptor = "J")
    public long field575;

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "Lca;")
    public class131 field568;

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "([BI)[B")
    public static final byte[] method302(byte[] arg0, int arg1) {
        class216 var2 = new class216(arg0);
        field569++;
        if (arg1 != -2) {
            field571 = 18;
        }
        int var3 = var2.method1407(117);
        int var4 = var2.method1358(91);
        if (var4 < 0 || !(class205.field2911 == 0 || var4 <= class205.field2911)) {
            throw new RuntimeException();
        } else if (var3 == 0) {
            byte[] var7 = new byte[var4];
            var2.method1374(var7, 0, var4, (byte) -79);
            return var7;
        } else {
            int var5 = var2.method1358(93);
            if (var5 < 0 || !(class205.field2911 == 0 || var5 <= class205.field2911)) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var3 == 1) {
                class92.method562(var6, var5, arg0, var4, 9);
            } else {
                class46.field542.method1956(-16850, var6, var2);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(BI)V")
    public static final void method303(byte arg0, int arg1) {
        class57 var2 = class75.field899;
        synchronized (class75.field899) {
            class26.field310 = arg1;
        }
        if (arg0 != -28) {
            method303((byte) -48, -47);
        }
        field572++;
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(ILbc;)V")
    public static final void method304(int arg0, class282 arg1) {
        field573++;
        class141.field2032 = arg1;
        int var2 = -125 % ((arg0 + 31) / 63);
    }
}
