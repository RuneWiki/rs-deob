import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wn")
public class class32 {

    @OriginalMember(owner = "client!wn", name = "f", descriptor = "Ljava/lang/String;")
    public static String field374 = "Your ignore list is full. Max of 100 users.";

    @OriginalMember(owner = "client!wn", name = "c", descriptor = "I")
    public static int field371;

    @OriginalMember(owner = "client!wn", name = "d", descriptor = "I")
    public static int field372;

    @OriginalMember(owner = "client!wn", name = "e", descriptor = "I")
    public static int field373;

    @OriginalMember(owner = "client!wn", name = "g", descriptor = "I")
    public static int field375;

    @OriginalMember(owner = "client!wn", name = "h", descriptor = "I")
    public static int field376;

    @OriginalMember(owner = "client!wn", name = "i", descriptor = "I")
    public static int field377;

    @OriginalMember(owner = "client!wn", name = "j", descriptor = "I")
    public static int field378;

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "Lwn;")
    public class32 field369;

    @OriginalMember(owner = "client!wn", name = "b", descriptor = "Lwn;")
    public class32 field370;

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(B)V", line = 17)
    public final void method222(byte arg0) {
        field373++;
        if (this.field370 == null) {
            return;
        }
        this.field370.field369 = this.field369;
        this.field369.field370 = this.field370;
        if (arg0 > -14) {
            field376 = 39;
        }
        this.field369 = null;
        this.field370 = null;
    }

    @OriginalMember(owner = "client!wn", name = "b", descriptor = "(B)V", line = 34)
    public static void method223(byte arg0) {
        if (arg0 >= -58) {
            field374 = (String) null;
        }
        field374 = null;
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(IIIIIIII)Z", line = 47)
    public static final boolean method224(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg1 < arg2 && arg1 < arg3 && arg1 < arg4) {
            return false;
        } else if (arg1 > arg2 && arg1 > arg3 && arg1 > arg4) {
            return false;
        } else if (arg0 < arg5 && arg0 < arg6 && arg0 < arg7) {
            return false;
        } else if (arg0 > arg5 && arg0 > arg6 && arg0 > arg7) {
            return false;
        } else {
            int var8 = (arg1 - arg2) * (arg6 - arg5) - (arg0 - arg5) * (arg3 - arg2);
            int var9 = (arg1 - arg4) * (arg5 - arg7) - (arg0 - arg7) * (arg2 - arg4);
            int var10 = (arg1 - arg3) * (arg7 - arg6) - (arg0 - arg6) * (arg4 - arg3);
            return var8 * var10 > 0 && var9 * var10 > 0;
        }
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(Lgh;B)V", line = 74)
    public static final void method225(class254 arg0, byte arg1) {
        long var2 = 0L;
        if (arg1 < 29) {
            method225((class254) null, (byte) -110);
        }
        field377++;
        if (arg0.field4016 == 0) {
            var2 = class113.method730(arg0.field4017, arg0.field4032, arg0.field4024);
        }
        int var4 = -1;
        if (arg0.field4016 == 1) {
            var2 = class68.method424(arg0.field4017, arg0.field4032, arg0.field4024);
        }
        if (arg0.field4016 == 2) {
            var2 = class181.method1248(arg0.field4017, arg0.field4032, arg0.field4024);
        }
        int var5 = 0;
        if (arg0.field4016 == 3) {
            var2 = class215.method1499(arg0.field4017, arg0.field4032, arg0.field4024);
        }
        int var6 = 0;
        if (var2 != 0L) {
            var4 = Integer.MAX_VALUE & (int) (var2 >>> 32);
            var6 = ((int) var2 & 0x35305F) >> 20;
            var5 = ((int) var2 & 0x7EEAB) >> 14;
        }
        arg0.field4020 = var5;
        arg0.field4029 = var6;
        arg0.field4019 = var4;
    }

    @OriginalMember(owner = "client!wn", name = "c", descriptor = "(B)J", line = 120)
    public static final long method226(byte arg0) {
        field378++;
        if (arg0 != -88) {
            field376 = -3;
        }
        return class45.field517.method249(0);
    }
}
