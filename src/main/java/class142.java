import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gb")
public class class142 {

    @OriginalMember(owner = "client!gb", name = "f", descriptor = "I")
    public static int field2124 = -1;

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "I")
    public static int field2119 = 2;

    @OriginalMember(owner = "client!gb", name = "c", descriptor = "I")
    public static int field2121;

    @OriginalMember(owner = "client!gb", name = "d", descriptor = "I")
    public static int field2122;

    @OriginalMember(owner = "client!gb", name = "e", descriptor = "I")
    public static int field2123;

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "Lap;")
    public class332 field2120;

    // $FF: synthetic field
    @OriginalMember(owner = "client!gb", name = "g", descriptor = "Ljava/lang/Class;")
    public static Class field2125;

    // $FF: synthetic method
    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method942(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIZI)Z", line = 3)
    public static final boolean method940(int arg0, int arg1, boolean arg2, int arg3) {
        field2122++;
        boolean var4 = arg2;
        class351 var5 = (class351) class426.method2557(arg1, arg0, arg3);
        if (var5 != null) {
            var4 = arg2 & class167.method1161(var5, -31794);
        }
        class351 var6 = (class351) class342.method2093(arg1, arg0, arg3, field2125 == null ? (field2125 = method942("mq")) : field2125);
        if (var6 != null) {
            var4 &= class167.method1161(var6, -31794);
        }
        class351 var7 = (class351) class196.method1340(arg1, arg0, arg3);
        if (var7 != null) {
            var4 &= class167.method1161(var7, -31794);
        }
        return var4;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "([BI)[B", line = 31)
    public static final byte[] method941(byte[] arg0, int arg1) {
        field2123++;
        if (arg1 < 56) {
            return null;
        }
        class209 var2 = new class209(arg0);
        int var3 = var2.method1428(32122);
        int var4 = var2.method1452(65280);
        if (var4 < 0 || !(class42.field635 == 0 || var4 <= class42.field635)) {
            throw new RuntimeException();
        } else if (var3 == 0) {
            byte[] var5 = new byte[var4];
            var2.method1436((byte) 116, 0, var5, var4);
            return var5;
        } else {
            int var6 = var2.method1452(65280);
            if (var6 < 0 || !(class42.field635 == 0 || var6 <= class42.field635)) {
                throw new RuntimeException();
            }
            byte[] var7 = new byte[var6];
            if (var3 == 1) {
                class124.method824(var7, var6, arg0, var4, 9);
            } else {
                class504.field7385.method2010(var2, 32, var7);
            }
            return var7;
        }
    }
}
