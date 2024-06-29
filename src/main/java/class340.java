import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mj")
public class class340 {

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "Leba;")
    public static class550 field4571 = new class550(61, 8);

    @OriginalMember(owner = "client!mj", name = "d", descriptor = "F")
    public static float field4574 = 0.0F;

    @OriginalMember(owner = "client!mj", name = "e", descriptor = "Z")
    public static volatile boolean field4575 = true;

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "I")
    public static int field4572;

    @OriginalMember(owner = "client!mj", name = "f", descriptor = "I")
    public static int field4576;

    @OriginalMember(owner = "client!mj", name = "g", descriptor = "I")
    public static int field4577;

    @OriginalMember(owner = "client!mj", name = "c", descriptor = "Lqfa;")
    public static class368 field4573;

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(JZ)Ljava/lang/String;", line = 3)
    public static final String method1985(long arg0, boolean arg1) {
        field4572++;
        class427.field5754.setTime(new Date(arg0));
        int var3 = class427.field5754.get(7);
        if (!arg1) {
            field4574 = 0.36800918F;
        }
        int var4 = class427.field5754.get(5);
        int var5 = class427.field5754.get(2);
        int var6 = class427.field5754.get(1);
        int var7 = class427.field5754.get(11);
        int var8 = class427.field5754.get(12);
        int var9 = class427.field5754.get(13);
        return class685.field9685[var3 - 1] + ", " + var4 / 10 + var4 % 10 + "-" + class492.field6793[var5] + "-" + var6 + " " + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10 + " GMT";
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(I)V", line = 31)
    public static void method1986(int arg0) {
        if (arg0 != 61) {
            field4576 = -20;
        }
        field4571 = null;
        field4573 = null;
    }
}
