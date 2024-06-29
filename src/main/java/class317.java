import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public class class317 {

    @OriginalMember(owner = "client!ne", name = "h", descriptor = "I")
    public int field4500 = 2048;

    @OriginalMember(owner = "client!ne", name = "d", descriptor = "I")
    public int field4496 = 0;

    @OriginalMember(owner = "client!ne", name = "f", descriptor = "I")
    public int field4498 = 0;

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "I")
    public int field4495 = 2048;

    @OriginalMember(owner = "client!ne", name = "k", descriptor = "I")
    public static int field4503 = 0;

    @OriginalMember(owner = "client!ne", name = "j", descriptor = "I")
    public static int field4502 = 0;

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "I")
    public static int field4493;

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "I")
    public static int field4494;

    @OriginalMember(owner = "client!ne", name = "e", descriptor = "I")
    public static int field4497;

    @OriginalMember(owner = "client!ne", name = "i", descriptor = "I")
    public static int field4501;

    @OriginalMember(owner = "client!ne", name = "l", descriptor = "I")
    public static int field4504;

    @OriginalMember(owner = "client!ne", name = "m", descriptor = "I")
    public static int field4505;

    @OriginalMember(owner = "client!ne", name = "n", descriptor = "I")
    public static int field4506;

    @OriginalMember(owner = "client!ne", name = "g", descriptor = "Ljava/lang/Object;")
    public static Object field4499;

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(Lud;B)V")
    public final void method2037(class35 arg0, byte arg1) {
        while (true) {
            int var3 = arg0.method273(255);
            if (var3 == 0) {
                int var4 = -56 % ((arg1 + 23) / 46);
                field4494++;
                return;
            }
            this.method2043(var3, (byte) 62, arg0);
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(IC)Z")
    public static final boolean method2038(int arg0, char arg1) {
        field4493++;
        if (arg0 != 122) {
            field4503 = -85;
        }
        return arg1 >= '0' && arg1 <= '9' || arg1 >= 'A' && arg1 <= 'Z' || arg1 >= 'a' && arg1 <= 'z';
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(IIII)I")
    public static final int method2039(int arg0, int arg1, int arg2, int arg3) {
        field4501++;
        int var4 = arg2 & 0x3;
        if (arg3 != -2) {
            field4503 = 60;
        }
        if (var4 == 0) {
            return arg1;
        } else if (var4 == 1) {
            return 7 - arg0;
        } else if (var4 == 2) {
            return 7 - arg1;
        } else {
            return arg0;
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(BIIIIIII)V")
    public static final void method2040(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field4505++;
        int var8 = class498.method3000(false, class748.field10458, arg5, class558.field7940);
        int var9 = class498.method3000(false, class748.field10458, arg6, class558.field7940);
        int var10 = 127 % ((15 - arg0) / 52);
        int var11 = class498.method3000(false, class612.field8854, arg4, class156.field2337);
        int var12 = class498.method3000(false, class612.field8854, arg1, class156.field2337);
        int var13 = class498.method3000(false, class748.field10458, arg3 + arg5, class558.field7940);
        int var14 = class498.method3000(false, class748.field10458, arg6 - arg3, class558.field7940);
        for (int var15 = var8; var15 < var13; var15++) {
            class399.method2472(27113, var11, var12, arg2, class329.field4651[var15]);
        }
        for (int var16 = var9; var16 > var14; var16--) {
            class399.method2472(27113, var11, var12, arg2, class329.field4651[var16]);
        }
        int var17 = class498.method3000(false, class612.field8854, arg3 + arg4, class156.field2337);
        int var18 = class498.method3000(false, class612.field8854, arg1 - arg3, class156.field2337);
        for (int var19 = var13; var19 <= var14; var19++) {
            int[] var20 = class329.field4651[var19];
            class399.method2472(27113, var11, var17, arg2, var20);
            class399.method2472(27113, var17, var18, arg7, var20);
            class399.method2472(27113, var18, var12, arg2, var20);
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(ILdm;)Ljava/lang/String;")
    public static final String method2041(int arg0, class50 arg1) {
        field4506++;
        if (arg0 < 68) {
            field4504 = 111;
        }
        if (client.method1943(arg1).method2118(true) == 0) {
            return null;
        } else if (arg1.field743 == null || arg1.field743.trim().length() == 0) {
            return class588.field8274 ? "Hidden-use" : null;
        } else {
            return arg1.field743;
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(I)V")
    public static void method2042(int arg0) {
        if (arg0 > 43) {
            field4499 = null;
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(IBLud;)V")
    private final void method2043(int arg0, byte arg1, class35 arg2) {
        if (arg0 == 1) {
            this.field4498 = arg2.method273(255);
        } else if (arg0 == 2) {
            this.field4500 = arg2.method253(-13900);
        } else if (arg0 == 3) {
            this.field4495 = arg2.method253(-13900);
        } else if (arg0 == 4) {
            this.field4496 = arg2.method225((byte) 64);
        }
        field4497++;
        if (arg1 < 24) {
            this.field4498 = -109;
        }
    }
}
