import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qo")
public class class19 {

    @OriginalMember(owner = "client!qo", name = "b", descriptor = "Loe;")
    public static class127 field250 = new class127(93, 12);

    @OriginalMember(owner = "client!qo", name = "d", descriptor = "Loe;")
    public static class127 field252 = new class127(36, -1);

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "I")
    public static int field249;

    @OriginalMember(owner = "client!qo", name = "c", descriptor = "I")
    public static int field251;

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(I)V")
    public static void method98(int arg0) {
        if (arg0 == -26) {
            field252 = null;
            field250 = null;
        }
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(Lpi;IIII)V")
    public static final void method99(class329 arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 == 1 && arg3 > 0) {
            class28.method142(arg0, arg2, arg3 - 1, arg4);
        } else if (arg1 == 4 && arg3 <= class377.field5492) {
            class28.method142(arg0, arg2, arg3 + 1, arg4);
        } else if (arg1 == 8 && arg4 > 0) {
            class28.method142(arg0, arg2, arg3, arg4 - 1);
        } else if (arg1 == 2 && arg4 <= class347.field5132) {
            class28.method142(arg0, arg2, arg3, arg4 + 1);
        } else if (arg1 == 16 && arg3 > 0 && arg4 <= class347.field5132) {
            class28.method142(arg0, arg2, arg3 - 1, arg4 + 1);
        } else if (arg1 == 32 && arg3 <= class377.field5492 && arg4 <= class347.field5132) {
            class28.method142(arg0, arg2, arg3 + 1, arg4 + 1);
        } else if (arg1 == 128 && arg3 > 0 && arg4 > 0) {
            class28.method142(arg0, arg2, arg3 - 1, arg4 - 1);
        } else if (arg1 == 64 && arg3 <= class377.field5492 && arg4 > 0) {
            class28.method142(arg0, arg2, arg3 + 1, arg4 - 1);
        } else {
            throw new RuntimeException("Unsupported wall shape " + arg1 + " in world2.setclosestlights_wall");
        }
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(ZILjava/awt/Component;)Liq;")
    public static final class414 method100(boolean arg0, int arg1, Component arg2) {
        if (arg1 != 0) {
            method99(null, 25, 105, -126, 126);
        }
        field249++;
        return new class277(arg2, arg0);
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(BI)V")
    public static final void method101(byte arg0, int arg1) {
        if (arg0 != -21) {
            return;
        }
        field251++;
        if (!class376.method2264((byte) -108, arg1)) {
            return;
        }
        class427[] var2 = class409.field5933[arg1];
        for (int var3 = 0; var3 < var2.length; var3++) {
            class427 var4 = var2[var3];
            if (var4 != null) {
                var4.field6290 = 0;
                var4.field6217 = 0;
                var4.field6235 = 1;
            }
        }
    }
}
