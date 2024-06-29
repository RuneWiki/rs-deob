import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ik")
public class class79 extends class529 {

    @OriginalMember(owner = "client!ik", name = "r", descriptor = "S")
    public short field1183;

    @OriginalMember(owner = "client!ik", name = "p", descriptor = "Ljava/lang/Boolean;")
    public static Boolean field1181 = Boolean.FALSE;

    @OriginalMember(owner = "client!ik", name = "n", descriptor = "Ljc;")
    public static class361 field1179 = new class361(0, 0);

    @OriginalMember(owner = "client!ik", name = "l", descriptor = "I")
    public static int field1177;

    @OriginalMember(owner = "client!ik", name = "o", descriptor = "I")
    public static int field1180;

    @OriginalMember(owner = "client!ik", name = "q", descriptor = "I")
    public static int field1182;

    @OriginalMember(owner = "client!ik", name = "m", descriptor = "Lmn;")
    public static class162 field1178;

    // $FF: synthetic field
    @OriginalMember(owner = "client!ik", name = "s", descriptor = "Ljava/lang/Class;")
    public static Class field1184;

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(IIII)Z")
    public static final boolean method568(int arg0, int arg1, int arg2, int arg3) {
        field1182++;
        class267 var4 = (class267) class409.method2611(arg3, arg1, arg2);
        boolean var5 = true;
        if (var4 != null) {
            var5 &= class30.method196(var4, (byte) 68);
        }
        int var6 = -38 % ((arg0 + 42) / 43);
        class267 var7 = (class267) class49.method352(arg3, arg1, arg2, field1184 == null ? (field1184 = method571("jq")) : field1184);
        if (var7 != null) {
            var5 &= class30.method196(var7, (byte) 74);
        }
        class267 var8 = (class267) class76.method548(arg3, arg1, arg2);
        if (var8 != null) {
            var5 &= class30.method196(var8, (byte) 71);
        }
        return var5;
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(ZLjava/lang/String;)V")
    public static final void method569(boolean arg0, String arg1) {
        field1180++;
        if (arg1 == null) {
            return;
        }
        if (arg1.startsWith("*")) {
            arg1 = arg1.substring(1);
        }
        String var2 = class114.method736((byte) -61, arg1);
        if (var2 == null) {
            return;
        }
        if (arg0) {
            method568(-31, -72, -90, 124);
        }
        for (int var3 = 0; var3 < class358.field5566; var3++) {
            String var4 = class329.field5176[var3];
            if (var4.startsWith("*")) {
                var4 = var4.substring(1);
            }
            String var5 = class114.method736((byte) -61, var4);
            if (var5 != null && var5.equals(var2)) {
                class358.field5566--;
                for (int var6 = var3; var6 < class358.field5566; var6++) {
                    class329.field5176[var6] = class329.field5176[var6 + 1];
                    class449.field6965[var6] = class449.field6965[var6 + 1];
                    class12.field132[var6] = class12.field132[var6 + 1];
                    class326.field5127[var6] = class326.field5127[var6 + 1];
                    class276.field4382[var6] = class276.field4382[var6 + 1];
                }
                class76.field1138 = class387.field5910;
                class34.field351++;
                class81.method578((byte) 66, class215.field3655);
                class170.field2488.method1479((byte) -102, class147.method896(arg1, (byte) -99));
                class170.field2488.method1458(arg1, (byte) 78);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(I)V")
    public static void method570(int arg0) {
        if (arg0 != -1) {
            field1178 = null;
        }
        field1178 = null;
        field1181 = null;
        field1179 = null;
    }

    @OriginalMember(owner = "client!ik", name = "<init>", descriptor = "()V")
    public class79() {
    }

    @OriginalMember(owner = "client!ik", name = "<init>", descriptor = "(S)V")
    public class79(short arg0) {
        this.field1183 = arg0;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method571(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
