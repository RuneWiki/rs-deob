import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!q")
public abstract class class389 {

    @OriginalMember(owner = "client!q", name = "a", descriptor = "I")
    public static int field5191 = 0;

    @OriginalMember(owner = "client!q", name = "c", descriptor = "Lpca;")
    public static class653 field5193 = new class653(4);

    @OriginalMember(owner = "client!q", name = "g", descriptor = "I")
    public static int field5197 = -1;

    @OriginalMember(owner = "client!q", name = "f", descriptor = "F")
    public static float field5196;

    @OriginalMember(owner = "client!q", name = "b", descriptor = "I")
    public static int field5192;

    @OriginalMember(owner = "client!q", name = "d", descriptor = "I")
    public static int field5194;

    @OriginalMember(owner = "client!q", name = "h", descriptor = "I")
    public static int field5198;

    @OriginalMember(owner = "client!q", name = "e", descriptor = "Ljo;")
    public static class303 field5195;

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(B)V", line = 10)
    public static void method2127(byte arg0) {
        if (arg0 != 17) {
            field5196 = 0.011555368F;
        }
        field5193 = null;
        field5195 = null;
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(IIIJ)V", line = 22)
    public static final void method2128(int arg0, int arg1, int arg2, long arg3) {
        field5192++;
        int var5 = (int) arg3 >> 14 & 0x1F;
        int var6 = (int) arg3 >> 20 & 0x3;
        int var7 = -59 % ((-arg0 - 9) / 52);
        int var8 = Integer.MAX_VALUE & (int) (arg3 >>> 32);
        if (var5 != 10 && var5 != 11 && var5 != 22) {
            class671.method3764(0, 0, arg2, var6, 0, var5, arg1, true, (byte) -92);
            return;
        }
        class335 var9 = class195.field2339.method3729(var8, (byte) 109);
        int var10;
        int var11;
        if (var6 == 0 || var6 == 2) {
            var11 = var9.field4322;
            var10 = var9.field4410;
        } else {
            var10 = var9.field4322;
            var11 = var9.field4410;
        }
        int var12 = var9.field4391;
        if (var6 != 0) {
            var12 = (var12 << var6 & 0xF) + (var12 >> 4 - var6);
        }
        class671.method3764(var10, var11, arg2, 0, var12, 0, arg1, true, (byte) -97);
    }

    @OriginalMember(owner = "client!q", name = "ra", descriptor = "(I)V")
    public abstract void method231(int arg0);

    @OriginalMember(owner = "client!q", name = "a", descriptor = "()Lq;")
    public abstract class389 method224();

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(III[I)V")
    public abstract void method236(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!q", name = "P", descriptor = "(I)V")
    public abstract void method237(int arg0);

    @OriginalMember(owner = "client!q", name = "S", descriptor = "(I)V")
    public abstract void method229(int arg0);

    @OriginalMember(owner = "client!q", name = "Y", descriptor = "()V")
    public abstract void method232();

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(I)V")
    public abstract void method225(int arg0);

    @OriginalMember(owner = "client!q", name = "G", descriptor = "(III)V")
    public abstract void method235(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!q", name = "pa", descriptor = "(IIIIII)V")
    public abstract void method227(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!q", name = "O", descriptor = "([I)V")
    public abstract void method234(int[] arg0);

    @OriginalMember(owner = "client!q", name = "XA", descriptor = "(I)V")
    public abstract void method226(int arg0);

    @OriginalMember(owner = "client!q", name = "GA", descriptor = "(III)V")
    public abstract void method228(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!q", name = "R", descriptor = "(III[I)V")
    public abstract void method230(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!q", name = "la", descriptor = "(Lq;)V")
    public abstract void method233(class389 arg0);
}
