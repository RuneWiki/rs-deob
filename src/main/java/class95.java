import jaggl.memory.NativeHeap;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cw")
public class class95 extends class511 {

    @OriginalMember(owner = "client!cw", name = "x", descriptor = "Ljaggl/memory/NativeHeap;")
    public NativeHeap field1603;

    @OriginalMember(owner = "client!cw", name = "v", descriptor = "Lvi;")
    public static class206 field1601 = new class206("WIP", 2);

    @OriginalMember(owner = "client!cw", name = "w", descriptor = "[S")
    public static short[] field1602 = new short[] { 58, 6, 10, 13, 9, 8, 50, 44 };

    @OriginalMember(owner = "client!cw", name = "y", descriptor = "I")
    public static int field1604;

    @OriginalMember(owner = "client!cw", name = "z", descriptor = "I")
    public static int field1605;

    @OriginalMember(owner = "client!cw", name = "d", descriptor = "(I)V", line = 3)
    public final void method665(int arg0) {
        this.field1603.method104();
        field1604++;
        int var2 = 28 % ((-arg0 - 33) / 42);
    }

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "(ZIIII)V", line = 15)
    public static final void method666(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
        field1605++;
        if (arg0) {
            field1601 = null;
        }
        int var5 = 0;
        int var6 = arg2;
        int var7 = -arg2;
        int var8 = -1;
        int var9 = class52.method367(arg2 + arg3, class235.field4076, (byte) 125, class182.field2877);
        int var10 = class52.method367(arg3 - arg2, class235.field4076, (byte) 7, class182.field2877);
        class357.method2291(var10, arg1, class209.field3294[arg4], var9, -1);
        while (var5 < var6) {
            var8 += 2;
            var7 += var8;
            if (var7 > 0) {
                var6--;
                var7 -= var6 << 1;
                int var11 = arg4 - var6;
                int var12 = arg4 + var6;
                if (var12 >= class29.field460 && var11 <= class472.field6996) {
                    int var13 = class52.method367(arg3 + var5, class235.field4076, (byte) 120, class182.field2877);
                    int var14 = class52.method367(arg3 - var5, class235.field4076, (byte) 125, class182.field2877);
                    if (var12 <= class472.field6996) {
                        class357.method2291(var14, arg1, class209.field3294[var12], var13, -1);
                    }
                    if (class29.field460 <= var11) {
                        class357.method2291(var14, arg1, class209.field3294[var11], var13, -1);
                    }
                }
            }
            var5++;
            int var15 = arg4 - var5;
            int var16 = arg4 + var5;
            if (var16 >= class29.field460 && class472.field6996 >= var15) {
                int var17 = class52.method367(arg3 + var6, class235.field4076, (byte) 124, class182.field2877);
                int var18 = class52.method367(arg3 - var6, class235.field4076, (byte) 122, class182.field2877);
                if (var16 <= class472.field6996) {
                    class357.method2291(var18, arg1, class209.field3294[var16], var17, -1);
                }
                if (var15 >= class29.field460) {
                    class357.method2291(var18, arg1, class209.field3294[var15], var17, -1);
                }
            }
        }
    }

    @OriginalMember(owner = "client!cw", name = "<init>", descriptor = "(I)V", line = 96)
    public class95(int arg0) {
        this.field1603 = new NativeHeap(arg0);
    }

    @OriginalMember(owner = "client!cw", name = "e", descriptor = "(I)V", line = 105)
    public static void method667(int arg0) {
        field1601 = null;
        field1602 = null;
        if (arg0 != -18948) {
            method667(-1);
        }
    }
}
