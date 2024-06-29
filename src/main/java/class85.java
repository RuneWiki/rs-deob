import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pd")
public class class85 extends class235 {

    @OriginalMember(owner = "client!pd", name = "B", descriptor = "[Z")
    public static boolean[] field1178 = new boolean[100];

    @OriginalMember(owner = "client!pd", name = "I", descriptor = "C")
    private char field1185;

    @OriginalMember(owner = "client!pd", name = "A", descriptor = "I")
    public static int field1177;

    @OriginalMember(owner = "client!pd", name = "C", descriptor = "I")
    public static int field1179;

    @OriginalMember(owner = "client!pd", name = "D", descriptor = "I")
    public static int field1180;

    @OriginalMember(owner = "client!pd", name = "E", descriptor = "I")
    public int field1181;

    @OriginalMember(owner = "client!pd", name = "F", descriptor = "I")
    public static int field1182;

    @OriginalMember(owner = "client!pd", name = "G", descriptor = "I")
    public static int field1183;

    @OriginalMember(owner = "client!pd", name = "J", descriptor = "I")
    public static int field1186;

    @OriginalMember(owner = "client!pd", name = "K", descriptor = "I")
    public static int field1187;

    @OriginalMember(owner = "client!pd", name = "L", descriptor = "I")
    public static int field1188;

    @OriginalMember(owner = "client!pd", name = "M", descriptor = "I")
    public static int field1189;

    @OriginalMember(owner = "client!pd", name = "H", descriptor = "Ljava/lang/String;")
    public String field1184;

    @OriginalMember(owner = "client!pd", name = "d", descriptor = "(B)Z", line = 3)
    public final boolean method526(byte arg0) {
        if (arg0 == -40) {
            field1188++;
            return this.field1185 == 's';
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(Lqj;BII)Lfi;", line = 15)
    public static final class165 method527(class238 arg0, byte arg1, int arg2, int arg3) {
        field1186++;
        byte[] var4 = arg0.method1472(arg2, arg3, 0);
        if (var4 == null) {
            return null;
        } else {
            if (arg1 != -35) {
                method532(12, 63, 23);
            }
            return new class165(var4);
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(ILil;Z)V", line = 41)
    private final void method528(int arg0, class265 arg1, boolean arg2) {
        field1179++;
        if (arg0 == 1) {
            this.field1185 = class24.method211(60, arg1.method1708((byte) 127));
        } else if (arg0 == 2) {
            this.field1181 = arg1.method1666(-2);
        } else if (arg0 == 5) {
            this.field1184 = arg1.method1712(false);
        }
        if (arg2) {
            this.field1184 = null;
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(Lil;B)V", line = 68)
    public final void method529(class265 arg0, byte arg1) {
        while (true) {
            int var3 = arg0.method1697(-72);
            if (var3 == 0) {
                if (arg1 < 109) {
                    method532(-87, -2, -108);
                }
                field1183++;
                return;
            }
            this.method528(var3, arg0, false);
        }
    }

    @OriginalMember(owner = "client!pd", name = "e", descriptor = "(B)V", line = 95)
    public static void method530(byte arg0) {
        if (arg0 <= -33) {
            field1178 = null;
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(IBLro;I)V", line = 113)
    public static final void method531(int arg0, byte arg1, class249 arg2, int arg3) {
        field1180++;
        class449 var4 = arg2.method1536(0, class35.field574);
        if (var4 == null || arg1 != -55) {
            return;
        }
        class35.field574.method2155(arg3, arg0, arg3 + arg2.field3578, arg2.field3604 + arg0);
        if (class169.field2214 >= 3) {
            class35.field574.method2106(-16777216, var4, arg3, arg0);
        } else {
            class115.field1563.method1500((float) arg2.field3578 / 2.0F + (float) arg3, (float) arg2.field3604 / 2.0F + (float) arg0, 4096, ((int) (-class170.field2244) & 0x3FFF) << 2, var4, arg3, arg0);
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(III)I", line = 137)
    public static final int method532(int arg0, int arg1, int arg2) {
        field1189++;
        int var3 = arg2;
        while (arg0 > 0) {
            var3 = arg1 & 0x1 | var3 << 1;
            arg1 >>>= 0x1;
            arg0--;
        }
        return var3;
    }
}
