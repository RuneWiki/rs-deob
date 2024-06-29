import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!c")
public abstract class class123 {

    @OriginalMember(owner = "client!c", name = "c", descriptor = "Lae;")
    public static class165 field1653 = new class165("runescape", 0);

    @OriginalMember(owner = "client!c", name = "d", descriptor = "[I")
    public static int[] field1654 = new int[8];

    @OriginalMember(owner = "client!c", name = "b", descriptor = "I")
    public static int field1652;

    @OriginalMember(owner = "client!c", name = "a", descriptor = "Lpc;")
    public static class476 field1651;

    @OriginalMember(owner = "client!c", name = "e", descriptor = "Lqn;")
    public static class47 field1655;

    @OriginalMember(owner = "client!c", name = "f", descriptor = "Ljava/awt/Frame;")
    public static Frame field1656;

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(B)V", line = 18)
    public static void method872(byte arg0) {
        field1654 = null;
        int var1 = 77 / ((66 - arg0) / 59);
        field1653 = null;
        field1651 = null;
        field1656 = null;
        field1655 = null;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(IIBILbf;ILbf;III)V", line = 41)
    public static final void method873(int arg0, int arg1, byte arg2, int arg3, class375 arg4, int arg5, class375 arg6, int arg7, int arg8, int arg9) {
        if (arg2 != 72) {
            method873(-123, 92, (byte) 80, -81, null, -6, null, -105, 92, 120);
        }
        field1652++;
        int var10 = arg4.method1364((byte) 24);
        if (var10 == -1) {
            return;
        }
        Object var11 = null;
        class16 var12 = (class16) class505.field7279.method2647(-117, (long) var10);
        if (var12 == null) {
            class311[] var13 = class311.method1819(class448.field6413, var10, 0);
            if (var13 == null) {
                return;
            }
            var12 = class33.field416.method345(var13[0], true);
            class505.field7279.method2635((long) var10, arg2 ^ 0xFFFF9869, var12);
        }
        class409.method2431(arg6.field2666, arg0, arg8, arg5 >> 1, 0, arg7 >> 1, arg6.method1366((byte) -112) * 64, arg6.field2676, true, arg6.field2677);
        int var14 = arg9 + class46.field558[0] - 18;
        int var15 = class46.field558[1] + arg3 - 16 - 54;
        int var16 = arg1 / 4 * 18 + var14;
        int var17 = arg1 % 4 * 18 + var15;
        var12.method130(var16, var17);
        if (arg4 == arg6) {
            class33.field416.method326(1, var16 - 1, 18, -256, 18, var17 - 1);
        }
        class413 var18 = class4.method19((byte) -97);
        var18.field5883 = var16;
        var18.field5885 = var17 + 16;
        var18.field5882 = var17;
        var18.field5887 = var16 + 16;
        var18.field5886 = arg4;
        class45.field540.method2099(var18, 57);
    }

    @OriginalMember(owner = "client!c", name = "ra", descriptor = "(I)V")
    public abstract void method233(int arg0);

    @OriginalMember(owner = "client!c", name = "p", descriptor = "(III[I)V")
    public abstract void method228(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!c", name = "s", descriptor = "(IIIIII)V")
    public abstract void method224(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!c", name = "a", descriptor = "()Lc;")
    public abstract class123 method230();

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(III[I)V")
    public abstract void method236(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!c", name = "o", descriptor = "(III)V")
    public abstract void method231(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!c", name = "ja", descriptor = "(I)V")
    public abstract void method226(int arg0);

    @OriginalMember(owner = "client!c", name = "O", descriptor = "(I)V")
    public abstract void method225(int arg0);

    @OriginalMember(owner = "client!c", name = "j", descriptor = "(III)V")
    public abstract void method229(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!c", name = "m", descriptor = "([I)V")
    public abstract void method238(int[] arg0);

    @OriginalMember(owner = "client!c", name = "za", descriptor = "(Lc;)V")
    public abstract void method237(class123 arg0);

    @OriginalMember(owner = "client!c", name = "ka", descriptor = "(I)V")
    public abstract void method234(int arg0);

    @OriginalMember(owner = "client!c", name = "N", descriptor = "(I)V")
    public abstract void method232(int arg0);

    @OriginalMember(owner = "client!c", name = "xa", descriptor = "()V")
    public abstract void method223();
}
