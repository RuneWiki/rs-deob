import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ob")
public class class737 extends class164 {

    @OriginalMember(owner = "client!ob", name = "o", descriptor = "I")
    public static int field10263;

    @OriginalMember(owner = "client!ob", name = "p", descriptor = "I")
    public static int field10264;

    @OriginalMember(owner = "client!ob", name = "q", descriptor = "I")
    public static int field10265;

    @OriginalMember(owner = "client!ob", name = "s", descriptor = "I")
    public static int field10267;

    @OriginalMember(owner = "client!ob", name = "t", descriptor = "I")
    public static int field10268;

    @OriginalMember(owner = "client!ob", name = "u", descriptor = "I")
    public static int field10269;

    @OriginalMember(owner = "client!ob", name = "r", descriptor = "Loia;")
    private class88 field10266;

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(I)Z")
    public final boolean method49(int arg0) {
        ++field10264;
        if (arg0 != -32252) {
            this.field10266 = null;
        }
        return !super.method49(arg0) ? false : super.field2249.method2088(((class242) super.field2256).field3235, 115);
    }

    @OriginalMember(owner = "client!ob", name = "<init>", descriptor = "(Lfp;Lfp;Luha;)V")
    public class737(class323 arg0, class323 arg1, class242 arg2) {
        super(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "(I)V")
    public final void method55(int arg0) {
        ++field10267;
        super.method55(arg0);
        this.field10266 = class674.method3686(-20770, super.field2249, ((class242) super.field2256).field3235);
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(IIZB)V")
    public final void method52(int arg0, int arg1, boolean arg2, byte arg3) {
        ++field10269;
        if (arg3 <= -88) {
            int var5 = this.method1081(2) * super.field2256.field2873 / 10000;
            int[] var6 = new int[4];
            class268.field3831.method398(var6);
            class268.field3831.method469(arg1, arg0 + 2, arg1 + var5, super.field2256.field2874 + arg0);
            this.field10266.method666(arg1, arg0 + 2, super.field2256.field2873, super.field2256.field2874);
            class268.field3831.method469(var6[0], var6[1], var6[2], var6[3]);
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(ZIJBIILfp;)V")
    public static final void method4122(boolean arg0, int arg1, long arg2, byte arg3, int arg4, int arg5, class323 arg6) {
        ++field10265;
        class326.method2125(0, arg4, arg1, arg5, true, arg2, arg6, arg0);
        if (arg3 < -15) {
            ;
        }
    }

    @OriginalMember(owner = "client!ob", name = "d", descriptor = "(I)V")
    public static final void method4123(int arg0) {
        ++field10263;
        if (arg0 >= 94) {
            class589.field8306.method1519((byte) 97);
            class530.field7470.method1096(-1);
            class499.field7161.method1951(-15671);
            class366.field5196.setBackground(Color.black);
            class649.field8922 = -1;
            class589.field8306 = class143.method994(class366.field5196, 13764);
            class530.field7470 = class293.method1904(-2451, true, class366.field5196);
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(ZIBI)V")
    public final void method51(boolean arg0, int arg1, byte arg2, int arg3) {
        ++field10268;
        class268.field3831.method445(arg1 + -2, arg3, super.field2256.field2873 + 4, super.field2256.field2874 + 2, ((class242) super.field2256).field3238, 0);
        class268.field3831.method445(arg1 + -1, arg3 + 1, super.field2256.field2873 + 2, super.field2256.field2874, 0, 0);
        if (arg2 != -104) {
            this.field10266 = null;
        }
    }
}
