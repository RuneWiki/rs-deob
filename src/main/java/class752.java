import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rl")
public class class752 extends class618 {

    @OriginalMember(owner = "client!rl", name = "l", descriptor = "[Lwk;")
    public class152[] field10399;

    @OriginalMember(owner = "client!rl", name = "n", descriptor = "Luh;")
    public static class176 field10401 = new class176(13, 0, 1, 0);

    @OriginalMember(owner = "client!rl", name = "k", descriptor = "I")
    public static int field10398;

    @OriginalMember(owner = "client!rl", name = "m", descriptor = "I")
    public static int field10400;

    @OriginalMember(owner = "client!rl", name = "o", descriptor = "I")
    public static int field10402;

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(I)V")
    public static void method4186(int arg0) {
        if (arg0 > -83) {
            method4186(-1);
        }
        field10401 = null;
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(B[Ljava/lang/String;)V")
    public static final void method4187(byte arg0, String[] arg1) {
        field10400++;
        if (arg1.length <= 1) {
            class46.field578 = class46.field578 + arg1[0];
            class284.field4199 += arg1[0].length();
        } else {
            for (int var2 = 0; var2 < arg1.length; var2++) {
                if (arg1[var2].startsWith("pause")) {
                    int var3 = 5;
                    try {
                        var3 = Integer.parseInt(arg1[var2].substring(6));
                    } catch (Exception var4) {
                    }
                    class587.method3423("Pausing for " + var3 + " seconds...", -119);
                    class551.field7916 = var2 + 1;
                    class21.field352 = arg1;
                    class732.field10137 = (long) (var3 * 1000) + class459.method2731(126);
                    return;
                }
                class46.field578 = arg1[var2];
                class234.method1568(-128, false);
            }
        }
        if (arg0 != 97) {
            method4187((byte) 61, null);
        }
    }

    @OriginalMember(owner = "client!rl", name = "<init>", descriptor = "([Lwk;)V")
    public class752(class152[] arg0) {
        this.field10399 = arg0;
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method4188(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field10402++;
        class506 var8 = null;
        for (class506 var9 = (class506) class240.field3597.method1731((byte) -120); var9 != null; var9 = (class506) class240.field3597.method1724(0)) {
            if (var9.field7201 == arg6 && var9.field7189 == arg4 && var9.field7192 == arg5 && var9.field7200 == arg3) {
                var8 = var9;
                break;
            }
        }
        if (var8 == null) {
            var8 = new class506();
            var8.field7200 = arg3;
            var8.field7192 = arg5;
            var8.field7201 = arg6;
            var8.field7189 = arg4;
            if (arg4 >= 0 && arg5 >= 0 && arg4 < class768.field10571 && class350.field4898 > arg5) {
                class49.method349((byte) -96, var8);
            }
            class240.field3597.method1727(var8, (byte) 70);
        }
        var8.field7199 = arg1;
        var8.field7194 = false;
        var8.field7202 = arg0;
        var8.field7190 = arg2;
        if (arg7 != 5175) {
            method4187((byte) -62, null);
        }
        var8.field7197 = true;
    }
}
