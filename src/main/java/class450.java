import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jp")
public class class450 extends class346 {

    @OriginalMember(owner = "client!jp", name = "N", descriptor = "I")
    private int field6456 = 0;

    @OriginalMember(owner = "client!jp", name = "K", descriptor = "I")
    private int field6453 = 4096;

    @OriginalMember(owner = "client!jp", name = "J", descriptor = "Ljava/lang/String;")
    public static String field6452 = "Loading fonts - ";

    @OriginalMember(owner = "client!jp", name = "H", descriptor = "I")
    public static int field6450;

    @OriginalMember(owner = "client!jp", name = "I", descriptor = "I")
    public static int field6451;

    @OriginalMember(owner = "client!jp", name = "L", descriptor = "I")
    public static int field6454;

    @OriginalMember(owner = "client!jp", name = "M", descriptor = "I")
    public static int field6455;

    @OriginalMember(owner = "client!jp", name = "O", descriptor = "I")
    public static int field6457;

    @OriginalMember(owner = "client!jp", name = "P", descriptor = "I")
    public static int field6458;

    @OriginalMember(owner = "client!jp", name = "Q", descriptor = "Ljava/awt/Image;")
    public static Image field6459;

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(IBI)I", line = 8)
    public static final int method2778(int arg0, byte arg1, int arg2) {
        if (arg1 != 72) {
            method2780((byte) 124);
        }
        ++field6454;
        class387 var3 = (class387) class67.field982.method2826(false, (long) arg0);
        if (var3 == null) {
            return -1;
        } else {
            return arg2 >= 0 && var3.field5658.length > arg2 ? var3.field5658[arg2] : -1;
        }
    }

    @OriginalMember(owner = "client!jp", name = "<init>", descriptor = "()V", line = 28)
    public class450() {
        super(1, true);
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(IIIIIIII)V", line = 31)
    public static final void method2779(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field6457;
        int var8 = class400.method2567(class157.field1981, class312.field4602, (byte) 126, arg2);
        int var9 = class400.method2567(class157.field1981, class312.field4602, (byte) 126, arg0);
        int var10 = class400.method2567(class240.field3368, class136.field1769, (byte) 126, arg5);
        int var11 = class400.method2567(class240.field3368, class136.field1769, (byte) -18, arg7);
        int var12 = class400.method2567(class157.field1981, class312.field4602, (byte) -26, arg2 + arg4);
        int var13 = class400.method2567(class157.field1981, class312.field4602, (byte) 127, -arg4 + arg0);
        if (arg3 == 127) {
            for (int var14 = var8; var12 > var14; ++var14) {
                class351.method2317(false, var11, class444.field6416[var14], var10, arg6);
            }
            for (int var15 = var9; var13 < var15; --var15) {
                class351.method2317(false, var11, class444.field6416[var15], var10, arg6);
            }
            int var16 = class400.method2567(class240.field3368, class136.field1769, (byte) -81, arg5 - -arg4);
            int var17 = class400.method2567(class240.field3368, class136.field1769, (byte) 126, arg7 - arg4);
            for (int var18 = var12; ~var13 <= ~var18; ++var18) {
                int[] var19 = class444.field6416[var18];
                class351.method2317(false, var16, var19, var10, arg6);
                class351.method2317(false, var17, var19, var16, arg1);
                class351.method2317(false, var11, var19, var17, arg6);
            }
        }
    }

    @OriginalMember(owner = "client!jp", name = "d", descriptor = "(B)V", line = 85)
    public static void method2780(byte arg0) {
        field6459 = null;
        field6452 = null;
        if (arg0 != 116) {
            method2780((byte) -13);
        }
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(Lfb;ZI)V", line = 100)
    public final void method38(class341 arg0, boolean arg1, int arg2) {
        if (arg2 != 0) {
            if (~arg2 == -2) {
                this.field6453 = arg0.method2239(-1076227960);
            }
        } else {
            this.field6456 = arg0.method2239(-1076227960);
        }
        if (arg1) {
            method2781(false);
        }
        ++field6450;
    }

    @OriginalMember(owner = "client!jp", name = "b", descriptor = "(II)[I", line = 135)
    public final int[] method45(int arg0, int arg1) {
        ++field6455;
        int[] var3 = super.field5152.method1409((byte) 48, arg0);
        if (super.field5152.field3004) {
            int[] var4 = this.method2294((byte) 54, arg0, 0);
            for (int var5 = 0; ~class134.field1753 < ~var5; ++var5) {
                int var6 = var4[var5];
                var3[var5] = this.field6456 <= var6 && this.field6453 >= var6 ? 4096 : 0;
            }
        }
        return arg1 != 3 ? null : var3;
    }

    @OriginalMember(owner = "client!jp", name = "d", descriptor = "(Z)V", line = 175)
    public static final void method2781(boolean arg0) {
        if (arg0) {
            ++field6451;
            class117 var1 = class254.field3706;
            synchronized (class254.field3706) {
                class255.field3722 = class296.field4459;
                ++class395.field5755;
                if (class274.field4033 >= 0) {
                    while (class72.field1022 != class274.field4033) {
                        int var2 = class388.field5675[class72.field1022];
                        class72.field1022 = 127 & class72.field1022 + 1;
                        if (~var2 <= -1) {
                            class277.field4063[var2] = true;
                        } else {
                            class277.field4063[~var2] = false;
                        }
                    }
                } else {
                    for (int var3 = 0; ~var3 > -113; ++var3) {
                        class277.field4063[var3] = false;
                    }
                    class274.field4033 = class72.field1022;
                }
                class296.field4459 = client.field846;
            }
        }
    }
}
