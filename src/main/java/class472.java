import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!le")
public class class472 {

    @OriginalMember(owner = "client!le", name = "a", descriptor = "I")
    public static int field6147 = 0;

    @OriginalMember(owner = "client!le", name = "b", descriptor = "I")
    public static int field6148;

    @OriginalMember(owner = "client!le", name = "c", descriptor = "I")
    public static int field6149;

    @OriginalMember(owner = "client!le", name = "e", descriptor = "I")
    public static int field6151;

    @OriginalMember(owner = "client!le", name = "d", descriptor = "Ltg;")
    public static class336 field6150;

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(Z)V")
    public static void method2613(boolean arg0) {
        field6150 = null;
        if (!arg0) {
            field6147 = -121;
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(ILufa;Ljava/lang/String;I)Ldn;")
    public static final class548 method2614(int arg0, class140 arg1, String arg2, int arg3) {
        field6148++;
        if (arg0 == 0) {
            return arg1.method1051(126, arg2);
        } else if (arg0 == 1) {
            try {
                class92.method690(new Object[] { (new URL(class348.field4462.getCodeBase(), arg2)).toString() }, "openjs", -2278, class348.field4462);
                class548 var4 = new class548();
                var4.field7108 = 1;
                return var4;
            } catch (Throwable var10) {
                class548 var5 = new class548();
                var5.field7108 = 2;
                return var5;
            }
        } else if (arg0 == 2) {
            try {
                class348.field4462.getAppletContext().showDocument(new URL(class348.field4462.getCodeBase(), arg2), "_blank");
                class548 var6 = new class548();
                var6.field7108 = 1;
                return var6;
            } catch (Exception var11) {
                class548 var7 = new class548();
                var7.field7108 = 2;
                return var7;
            }
        } else {
            if (arg3 != 31593) {
                method2614(-36, null, null, 25);
            }
            if (arg0 != 3) {
                throw new IllegalArgumentException();
            }
            try {
                class92.method688(arg3 ^ 0xFFFFB0D2, "loggedout", class348.field4462);
            } catch (Throwable var13) {
            }
            try {
                class348.field4462.getAppletContext().showDocument(new URL(class348.field4462.getCodeBase(), arg2), "_top");
                class548 var8 = new class548();
                var8.field7108 = 1;
                return var8;
            } catch (Exception var12) {
                class548 var9 = new class548();
                var9.field7108 = 2;
                return var9;
            }
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(IIZIII)V")
    public static final void method2615(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
        if (arg4 < 1) {
            arg4 = 1;
        }
        if (arg3 < 1) {
            arg3 = 1;
        }
        field6151++;
        int var6 = arg3 - 334;
        if (var6 < 0) {
            var6 = 0;
        } else if (var6 > 100) {
            var6 = 100;
        }
        int var7 = (class298.field3897 - class40.field572) * var6 / 100 + class40.field572;
        if (var7 < class684.field9397) {
            var7 = class684.field9397;
        } else if (var7 > class15.field163) {
            var7 = class15.field163;
        }
        int var8 = arg3 * 512 * var7 / (arg4 * 334);
        if (var8 < class301.field3919) {
            short var9 = class301.field3919;
            var7 = arg4 * var9 * 334 / (arg3 * 512);
            if (var7 > class15.field163) {
                var7 = class15.field163;
                int var10 = arg3 * 512 * var7 / (var9 * 334);
                int var11 = (arg4 - var10) / 2;
                if (arg2) {
                    class520.field6799.method396();
                    class520.field6799.method400(-16777216, arg5, arg3, (byte) 57, var11, arg1);
                    class520.field6799.method400(-16777216, arg5 + arg4 - var11, arg3, (byte) 81, var11, arg1);
                }
                arg4 -= var11 * 2;
                arg5 += var11;
            }
        } else if (class371.field4785 < var8) {
            short var12 = class371.field4785;
            var7 = arg4 * var12 * 334 / (arg3 * 512);
            if (class684.field9397 > var7) {
                var7 = class684.field9397;
                int var13 = arg4 * var12 * 334 / (var7 * 512);
                int var14 = (arg3 - var13) / 2;
                if (arg2) {
                    class520.field6799.method396();
                    class520.field6799.method400(-16777216, arg5, var14, (byte) 98, arg4, arg1);
                    class520.field6799.method400(-16777216, arg5, var14, (byte) 55, arg4, arg1 + arg3 - var14);
                }
                arg3 -= var14 * 2;
                arg1 += var14;
            }
        }
        class509.field6672 = arg1;
        class483.field6434 = arg5;
        class213.field2749 = arg3 * var7 / 334;
        if (arg0 == 15993) {
            class40.field568 = (short) arg3;
            class376.field4814 = (short) arg4;
        }
    }
}
