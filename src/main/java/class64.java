import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bj")
public class class64 extends class188 {

    @OriginalMember(owner = "client!bj", name = "r", descriptor = "[I")
    public int[] field773 = new int[] { -1 };

    @OriginalMember(owner = "client!bj", name = "m", descriptor = "[I")
    public int[] field768 = new int[] { 0 };

    @OriginalMember(owner = "client!bj", name = "k", descriptor = "I")
    public static int field766 = 0;

    @OriginalMember(owner = "client!bj", name = "q", descriptor = "I")
    public static int field772 = 0;

    @OriginalMember(owner = "client!bj", name = "p", descriptor = "I")
    public static int field771 = -1;

    @OriginalMember(owner = "client!bj", name = "l", descriptor = "I")
    public static int field767;

    @OriginalMember(owner = "client!bj", name = "n", descriptor = "I")
    public static int field769;

    @OriginalMember(owner = "client!bj", name = "o", descriptor = "I")
    public static int field770;

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "(B)V", line = 35)
    public static final void method391(byte arg0) {
        field767++;
        int var1 = -76 % ((69 - arg0) / 40);
        class352.field5612.method383((byte) -48);
        class252.field3986.method383((byte) -48);
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(IBIII)V", line = 46)
    public static final void method392(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        class278.method1986(arg0 - arg2, class347.field5501[arg4], arg3, arg0 + arg2, (byte) 67);
        int var5 = arg2;
        field770++;
        int var6 = 0;
        int var7 = -arg2;
        int var8 = -1;
        while (var6 < var5) {
            var8 += 2;
            var7 += var8;
            var6++;
            if (var7 >= 0) {
                var5--;
                var7 -= var5 << 1;
                int[] var9 = class347.field5501[arg4 + var5];
                int[] var10 = class347.field5501[arg4 - var5];
                int var11 = arg0 + var6;
                int var12 = arg0 - var6;
                class278.method1986(var12, var9, arg3, var11, (byte) 125);
                class278.method1986(var12, var10, arg3, var11, (byte) -82);
            }
            int var13 = arg0 + var5;
            int var14 = arg0 - var5;
            int[] var15 = class347.field5501[arg4 + var6];
            int[] var16 = class347.field5501[arg4 - var6];
            class278.method1986(var14, var15, arg3, var13, (byte) -116);
            class278.method1986(var14, var16, arg3, var13, (byte) -126);
        }
        if (arg1 != 121) {
            field766 = -20;
        }
    }
}
