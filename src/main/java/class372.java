import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vk")
public class class372 extends class631 {

    @OriginalMember(owner = "client!vk", name = "F", descriptor = "[I")
    public static int[] field5173 = new int[14];

    @OriginalMember(owner = "client!vk", name = "I", descriptor = "[[I")
    public static int[][] field5176 = new int[128][128];

    @OriginalMember(owner = "client!vk", name = "D", descriptor = "I")
    public static int field5171;

    @OriginalMember(owner = "client!vk", name = "E", descriptor = "I")
    public static int field5172;

    @OriginalMember(owner = "client!vk", name = "H", descriptor = "I")
    public static int field5175;

    @OriginalMember(owner = "client!vk", name = "G", descriptor = "Lid;")
    public static class586 field5174;

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(IIIII)V", line = 8)
    public final void method2181(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 == -3832) {
            ++field5172;
            int var6 = super.field8406.method1036();
            int var7 = ((class392) super.field584).field5482 * class251.method1537(-16632) / 10 % var6;
            super.field8406.method1049(arg4 + var7 + -var6, arg1, -var7 + arg3 + var6, arg2);
        }
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(IIIZBILwu;)V", line = 24)
    public static final void method2182(int arg0, int arg1, int arg2, boolean arg3, byte arg4, int arg5, class376 arg6) {
        class307.field4417 = arg3;
        class556.field7305 = arg6;
        class577.field7577 = null;
        class670.field9141 = arg2;
        class65.field803 = arg5;
        class172.field2631 = arg0;
        int var7 = -38 % ((arg4 - 27) / 52);
        class175.field2641 = arg1;
        ++field5171;
        class320.field4576 = 1;
    }

    @OriginalMember(owner = "client!vk", name = "<init>", descriptor = "(Lwu;Lwu;Lml;)V", line = 48)
    public class372(class376 arg0, class376 arg1, class392 arg2) {
        super(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!vk", name = "d", descriptor = "(B)V", line = 52)
    public static void method2183(byte arg0) {
        if (arg0 > 57) {
            field5174 = null;
            field5173 = null;
            field5176 = null;
        }
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(Lkf;III)V", line = 66)
    public static final void method2184(class256 arg0, int arg1, int arg2, int arg3) {
        if (arg2 < class735.field10163) {
            class701 var4 = class660.field8718[arg1][arg2 + 1][arg3];
            if (var4 != null && var4.field9738 != null && var4.field9738.method798(122)) {
                arg0.method807(var4.field9738, class184.field2781, class384.field5377, 126, 0, true, 0);
            }
        }
        if (arg3 < class735.field10163) {
            class701 var5 = class660.field8718[arg1][arg2][arg3 + 1];
            if (var5 != null && var5.field9738 != null && var5.field9738.method798(-94)) {
                arg0.method807(var5.field9738, class184.field2781, 0, 113, class384.field5377, true, 0);
            }
        }
        if (arg2 < class735.field10163 && arg3 < class143.field2290) {
            class701 var6 = class660.field8718[arg1][arg2 + 1][arg3 + 1];
            if (var6 != null && var6.field9738 != null && var6.field9738.method798(-18)) {
                arg0.method807(var6.field9738, class184.field2781, class384.field5377, 127, class384.field5377, true, 0);
            }
        }
        if (arg2 < class735.field10163 && arg3 > 0) {
            class701 var7 = class660.field8718[arg1][arg2 + 1][arg3 - 1];
            if (var7 != null && var7.field9738 != null && var7.field9738.method798(-119)) {
                arg0.method807(var7.field9738, class184.field2781, class384.field5377, 116, -class384.field5377, true, 0);
            }
        }
    }
}
