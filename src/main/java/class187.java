import java.awt.event.ActionEvent;
import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qd")
public class class187 {

    @OriginalMember(owner = "client!qd", name = "c", descriptor = "Lce;")
    public static class126 field3230 = class206.method1445(-7923, "");

    @OriginalMember(owner = "client!qd", name = "d", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field3231 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

    @OriginalMember(owner = "client!qd", name = "h", descriptor = "Lce;")
    public static class126 field3235 = class206.method1445(-7923, "showVideoAd");

    @OriginalMember(owner = "client!qd", name = "j", descriptor = "Lce;")
    public static class126 field3237 = class206.method1445(-7923, "::errortest");

    @OriginalMember(owner = "client!qd", name = "i", descriptor = "Lce;")
    public static class126 field3236 = null;

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "I")
    public static int field3228;

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "I")
    public static int field3229;

    @OriginalMember(owner = "client!qd", name = "e", descriptor = "I")
    public static int field3232;

    @OriginalMember(owner = "client!qd", name = "f", descriptor = "I")
    public static int field3233;

    @OriginalMember(owner = "client!qd", name = "g", descriptor = "I")
    public static int field3234;

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "([SI)[S", line = 17)
    public static final short[] method1348(short[] arg0, int arg1) {
        field3234++;
        if (arg0 == null) {
            return null;
        } else {
            short[] var2 = new short[arg0.length];
            class230.method1564(arg0, arg1, var2, 0, arg0.length);
            return var2;
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(BLvh;Ljava/lang/Object;)V", line = 32)
    public static final void method1349(byte arg0, class147 arg1, Object arg2) {
        field3229++;
        if (arg1.field2716 == null) {
            return;
        }
        for (int var3 = 0; var3 < 50 && arg1.field2716.peekEvent() != null; var3++) {
            class313.method2158(1L, true);
        }
        if (arg0 < 61) {
            field3230 = (class126) null;
        }
        if (arg2 != null) {
            arg1.field2716.postEvent(new ActionEvent(arg2, 1001, "dummy"));
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(IIIIZ)V", line = 59)
    public static final void method1350(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field3233++;
        if (class13.method75(arg0, (byte) -118) && arg1 == 1) {
            class290.method1926(-1, arg3, arg4, class291.field4825[arg0], 119, arg2);
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(B)V", line = 73)
    public static void method1351(byte arg0) {
        field3230 = null;
        field3237 = null;
        field3231 = null;
        if (arg0 >= -72) {
            field3231 = (BigInteger) null;
        }
        field3235 = null;
        field3236 = null;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(IIIIIIII)V", line = 91)
    public static final void method1352(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field3232++;
        if (class13.method75(arg3, (byte) -116)) {
            client.method812(class291.field4825[arg3], arg4, arg1, arg7, arg2, arg5, arg6, arg0);
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(III)J", line = 113)
    public static final long method1353(int arg0, int arg1, int arg2) {
        class5 var3 = class297.field4940[arg0][arg1][arg2];
        return var3 == null || var3.field52 == null ? 0L : var3.field52.field101;
    }
}
