import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pia")
public class class56 {

    @OriginalMember(owner = "client!pia", name = "b", descriptor = "I")
    public static int field783 = 13156520;

    @OriginalMember(owner = "client!pia", name = "a", descriptor = "I")
    public static int field782;

    @OriginalMember(owner = "client!pia", name = "c", descriptor = "I")
    public static int field784;

    @OriginalMember(owner = "client!pia", name = "d", descriptor = "I")
    public static int field785;

    @OriginalMember(owner = "client!pia", name = "a", descriptor = "(I)V", line = 3)
    public static final void method381(int arg0) {
        if (arg0 != -12764) {
            field783 = -120;
        }
        if (class562.field7995 != null) {
            class562.field7995.method1572((byte) -5);
        }
        field782++;
        if (class494.field6942 == null) {
            return;
        }
        while (true) {
            try {
                class494.field6942.join();
                return;
            } catch (InterruptedException var1) {
            }
        }
    }

    @OriginalMember(owner = "client!pia", name = "a", descriptor = "(ZZIZIII)V", line = 34)
    public static final void method382(boolean arg0, boolean arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6) {
        if (arg2 < arg4) {
            int var7 = (arg2 + arg4) / 2;
            int var8 = arg2;
            class183 var9 = class571.field8083[var7];
            class571.field8083[var7] = class571.field8083[arg4];
            class571.field8083[arg4] = var9;
            for (int var10 = arg2; var10 < arg4; var10++) {
                if (class49.method336(var9, arg5, class571.field8083[var10], arg1, 29, arg6, arg3) <= 0) {
                    class183 var11 = class571.field8083[var10];
                    class571.field8083[var10] = class571.field8083[var8];
                    class571.field8083[var8++] = var11;
                }
            }
            class571.field8083[arg4] = class571.field8083[var8];
            class571.field8083[var8] = var9;
            method382(true, arg1, arg2, arg3, var8 - 1, arg5, arg6);
            method382(true, arg1, var8 + 1, arg3, arg4, arg5, arg6);
        }
        if (arg0) {
            field784++;
        }
    }

    @OriginalMember(owner = "client!pia", name = "a", descriptor = "(ILkc;)V", line = 84)
    public static final void method383(int arg0, class655 arg1) {
        field785++;
        if (arg0 != 13156520) {
            method383(-77, null);
        }
        class67 var2 = (class67) class393.field5473.method1381(true, (long) arg1.field8344);
        if (var2 == null) {
            class143.method937(arg1.field8414[0], null, arg1.field9501, 19126, null, arg1.field8421[0], 0, arg1);
        } else {
            var2.method437((byte) 123);
        }
    }
}
