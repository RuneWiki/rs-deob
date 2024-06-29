import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jk")
public class class256 {

    @OriginalMember(owner = "client!jk", name = "c", descriptor = "I")
    public static int field3995 = 0;

    @OriginalMember(owner = "client!jk", name = "d", descriptor = "[S")
    public static short[] field3996 = new short[256];

    @OriginalMember(owner = "client!jk", name = "b", descriptor = "I")
    public static int field3994 = 0;

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "I")
    public static int field3993;

    @OriginalMember(owner = "client!jk", name = "e", descriptor = "I")
    public static int field3997;

    @OriginalMember(owner = "client!jk", name = "f", descriptor = "[Lng;")
    public static class245[] field3998;

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/Class;", line = 5)
    public static final Class method1721(String arg0, int arg1) throws ClassNotFoundException {
        field3993++;
        if (arg0.equals("B")) {
            return Byte.TYPE;
        } else if (arg0.equals("I")) {
            return Integer.TYPE;
        } else {
            if (arg1 != 0) {
                field3996 = (short[]) null;
            }
            if (arg0.equals("S")) {
                return Short.TYPE;
            } else if (arg0.equals("J")) {
                return Long.TYPE;
            } else if (arg0.equals("Z")) {
                return Boolean.TYPE;
            } else if (arg0.equals("F")) {
                return Float.TYPE;
            } else if (arg0.equals("D")) {
                return Double.TYPE;
            } else if (arg0.equals("C")) {
                return Character.TYPE;
            } else {
                return Class.forName(arg0);
            }
        }
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(I)V", line = 49)
    public static void method1722(int arg0) {
        field3998 = null;
        if (arg0 == 27297) {
            field3996 = null;
        }
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(Z)V", line = 74)
    public static final void method1723(boolean arg0) {
        class142.field2248 = 0;
        class4.field54 = 0;
        class161.method1109(arg0);
        field3997++;
        class248.method1687(63);
        class88.method609(127);
        for (int var1 = 0; var1 < class4.field54; var1++) {
            int var2 = class101.field1572[var1];
            if (class343.field5341 != class208.field3313[var2].field527) {
                if (class208.field3313[var2].field1178.method1953(0)) {
                    class235.method1602(class208.field3313[var2], 106);
                }
                class208.field3313[var2].method554((class298) null, 113);
                class208.field3313[var2] = null;
            }
        }
        if (class85.field1284 != class230.field3713.field4679) {
            throw new RuntimeException("gnp1 pos:" + class230.field3713.field4679 + " psize:" + class85.field1284);
        }
        for (int var3 = 0; var3 < class155.field2439; var3++) {
            if (class208.field3313[class144.field2286[var3]] == null) {
                throw new RuntimeException("gnp2 pos:" + var3 + " size:" + class155.field2439);
            }
        }
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(IIII)Z", line = 124)
    public static final boolean method1724(int arg0, int arg1, int arg2, int arg3) {
        if (class187.method1286(arg0, arg1, arg2)) {
            int var4 = arg1 << 7;
            int var5 = arg2 << 7;
            return class89.method610(var4 + 1, client.field2034[arg0][arg1][arg2] + arg3, var5 + 1) && class89.method610(var4 + 128 - 1, client.field2034[arg0][arg1 + 1][arg2] + arg3, var5 + 1) && class89.method610(var4 + 128 - 1, client.field2034[arg0][arg1 + 1][arg2 + 1] + arg3, var5 + 128 - 1) && class89.method610(var4 + 1, client.field2034[arg0][arg1][arg2 + 1] + arg3, var5 + 128 - 1);
        } else {
            return false;
        }
    }
}
