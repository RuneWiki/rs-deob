import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dq")
public class class698 extends class3 {

    @OriginalMember(owner = "client!dq", name = "m", descriptor = "I")
    private int field9434;

    @OriginalMember(owner = "client!dq", name = "l", descriptor = "I")
    private int field9433;

    @OriginalMember(owner = "client!dq", name = "s", descriptor = "I")
    private int field9440;

    @OriginalMember(owner = "client!dq", name = "k", descriptor = "I")
    private int field9432;

    @OriginalMember(owner = "client!dq", name = "q", descriptor = "I")
    private int field9438;

    @OriginalMember(owner = "client!dq", name = "h", descriptor = "I")
    private int field9429;

    @OriginalMember(owner = "client!dq", name = "o", descriptor = "Lqo;")
    private class22 field9436;

    @OriginalMember(owner = "client!dq", name = "r", descriptor = "F")
    public static float field9439;

    @OriginalMember(owner = "client!dq", name = "i", descriptor = "I")
    public static int field9430;

    @OriginalMember(owner = "client!dq", name = "n", descriptor = "I")
    public static int field9435;

    @OriginalMember(owner = "client!dq", name = "p", descriptor = "J")
    public static long field9437;

    @OriginalMember(owner = "client!dq", name = "j", descriptor = "Lq;")
    private class429 field9431;

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(B)Lq;")
    public final class429 method9(byte arg0) {
        field9435++;
        if (arg0 != -121) {
            this.method9((byte) 33);
        }
        if (this.field9431 == null) {
            class152 var2 = this.field9436.field1170;
            class373.field5297[3] = this.field9433;
            class373.field5297[4] = this.field9429;
            class373.field5297[2] = this.field9434;
            class373.field5297[5] = this.field9440;
            class373.field5297[1] = this.field9438;
            class373.field5297[0] = this.field9432;
            boolean var3 = false;
            int var4 = 0;
            for (int var5 = 0; var5 < 6; var5++) {
                if (!var2.method1181(arg0 ^ 0x1F68, class373.field5297[var5])) {
                    return null;
                }
                class739 var7 = var2.method1180(class373.field5297[var5], -6662);
                int var8 = var7.field9941 ? 64 : 128;
                if (var4 < var8) {
                    var4 = var8;
                }
                if (var7.field9947 > 0) {
                    var3 = true;
                }
            }
            for (int var6 = 0; var6 < 6; var6++) {
                class236.field3435[var6] = var2.method1182(false, class373.field5297[var6], 1.0F, var4, var4, arg0 + 192);
            }
            this.field9431 = new class429(this.field9436, 6407, var4, var3, class236.field3435);
        }
        return this.field9431;
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(IIJIZLin;BI)V")
    public static final void method3901(int arg0, int arg1, long arg2, int arg3, boolean arg4, class91 arg5, byte arg6, int arg7) {
        class394.field5789 = 10000;
        class37.field915 = arg5;
        class273.field3839 = arg7;
        class708.field9601 = arg0;
        class185.field2789 = arg4;
        class539.field7455 = null;
        class726.field9825 = arg1;
        field9430++;
        class640.field8801 = arg2;
        class326.field4513 = 1;
        class383.field5557 = arg3;
        if (arg6 < 54) {
            method3901(36, 99, 61L, 90, false, null, (byte) 126, -67);
        }
    }

    @OriginalMember(owner = "client!dq", name = "<init>", descriptor = "(Lqo;IIIIII)V")
    public class698(class22 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field9434 = arg3;
        this.field9433 = arg4;
        this.field9440 = arg6;
        this.field9432 = arg1;
        this.field9438 = arg2;
        this.field9429 = arg5;
        this.field9436 = arg0;
    }
}
