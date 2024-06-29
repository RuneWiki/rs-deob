import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ka")
public class class419 extends class276 {

    @OriginalMember(owner = "client!ka", name = "T", descriptor = "Ljava/lang/Object;")
    private Object field6076;

    @OriginalMember(owner = "client!ka", name = "U", descriptor = "[Ljava/lang/String;")
    public static String[] field6077 = new String[200];

    @OriginalMember(owner = "client!ka", name = "O", descriptor = "I")
    public static int field6072 = 2;

    @OriginalMember(owner = "client!ka", name = "P", descriptor = "Lbn;")
    public static class160 field6073 = new class160(11, 16);

    @OriginalMember(owner = "client!ka", name = "V", descriptor = "[Ljava/lang/String;")
    public static String[] field6078 = new String[5];

    @OriginalMember(owner = "client!ka", name = "L", descriptor = "I")
    public static int field6069;

    @OriginalMember(owner = "client!ka", name = "M", descriptor = "I")
    public static int field6070;

    @OriginalMember(owner = "client!ka", name = "N", descriptor = "I")
    public static int field6071;

    @OriginalMember(owner = "client!ka", name = "Q", descriptor = "I")
    public static int field6074;

    @OriginalMember(owner = "client!ka", name = "R", descriptor = "I")
    public static int field6075;

    @OriginalMember(owner = "client!ka", name = "c", descriptor = "(Z)V", line = 3)
    public static void method2590(boolean arg0) {
        if (!arg0) {
            method2591((byte) -92);
        }
        field6078 = null;
        field6073 = null;
        field6077 = null;
    }

    @OriginalMember(owner = "client!ka", name = "d", descriptor = "(B)V", line = 15)
    public static final void method2591(byte arg0) {
        field6075++;
        class237.field3528.method302((byte) -64);
        for (int var1 = 0; var1 < 32; var1++) {
            class313.field4592[var1] = 0L;
        }
        int var2 = -11 % ((64 - arg0) / 34);
        for (int var3 = 0; var3 < 32; var3++) {
            class37.field522[var3] = 0L;
        }
        class404.field5850 = 0;
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IZ)Z", line = 44)
    public static final boolean method2592(int arg0, boolean arg1) {
        field6069++;
        if (arg0 != 32) {
            method2590(true);
        }
        boolean var2 = class74.field942.method168();
        if (var2 == arg1) {
            return true;
        }
        if (!arg1) {
            class74.field942.method102();
        } else if (!class74.field942.method159()) {
            arg1 = false;
        }
        if (arg1 == var2) {
            return false;
        } else {
            class436.field6366 = arg1;
            class53.method414(class267.field3963, true);
            return true;
        }
    }

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "(Z)Z", line = 80)
    public final boolean method1882(boolean arg0) {
        if (!arg0) {
            method2592(94, true);
        }
        field6074++;
        return false;
    }

    @OriginalMember(owner = "client!ka", name = "<init>", descriptor = "(Lur;Ljava/lang/Object;I)V", line = 94)
    public class419(class95 arg0, Object arg1, int arg2) {
        super(arg0, arg2);
        this.field6076 = arg1;
    }

    @OriginalMember(owner = "client!ka", name = "g", descriptor = "(I)Ljava/lang/Object;", line = 106)
    public final Object method1881(int arg0) {
        if (arg0 == 0) {
            field6071++;
            return this.field6076;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(ILjava/lang/String;)V", line = 122)
    public static final void method2593(int arg0, String arg1) {
        field6070++;
        if (class206.field2886 == null) {
            class322.method2117((byte) 120);
        }
        String[] var2 = class278.method1886('\n', -19369, arg1);
        if (arg0 != 30444) {
            return;
        }
        for (int var3 = 0; var3 < var2.length; var3++) {
            for (int var4 = class120.field1608; var4 > 0; var4--) {
                class206.field2886[var4] = class206.field2886[var4 - 1];
            }
            class206.field2886[0] = var2[var3];
            if (class120.field1608 < class206.field2886.length - 1) {
                class120.field1608++;
                if (class13.field222 > 0) {
                    class13.field222++;
                }
            }
        }
    }
}
