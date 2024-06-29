import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!i")
public class class27 {

    @OriginalMember(owner = "client!i", name = "d", descriptor = "I")
    public static int field260 = -1;

    @OriginalMember(owner = "client!i", name = "a", descriptor = "I")
    public static int field257;

    @OriginalMember(owner = "client!i", name = "b", descriptor = "I")
    public static int field258;

    @OriginalMember(owner = "client!i", name = "c", descriptor = "I")
    public static int field259;

    @OriginalMember(owner = "client!i", name = "e", descriptor = "I")
    public static int field261;

    @OriginalMember(owner = "client!i", name = "f", descriptor = "I")
    public static int field262;

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IIBII)V")
    public static final void method159(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        field262++;
        int var5 = 0;
        if (arg2 != -109) {
            method161(61);
        }
        int var6 = arg4;
        int var7 = -arg4;
        int var8 = -1;
        class105.method564(arg1, arg0 - arg4, 0, class318.field4522[arg3], arg0 + arg4);
        while (var5 < var6) {
            var8 += 2;
            var7 += var8;
            var5++;
            if (var7 >= 0) {
                var6--;
                var7 -= var6 << 1;
                int[] var9 = class318.field4522[arg3 + var6];
                int[] var10 = class318.field4522[arg3 - var6];
                int var11 = arg0 + var5;
                int var12 = arg0 - var5;
                class105.method564(arg1, var12, 0, var9, var11);
                class105.method564(arg1, var12, arg2 + 109, var10, var11);
            }
            int var13 = arg0 + var6;
            int var14 = arg0 - var6;
            int[] var15 = class318.field4522[arg3 + var5];
            int[] var16 = class318.field4522[arg3 - var5];
            class105.method564(arg1, var14, 0, var15, var13);
            class105.method564(arg1, var14, 0, var16, var13);
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(I)V")
    public static final void method160(int arg0) {
        class169.field2360.method809(arg0, arg0 - 28061);
        field259++;
        class355.field5203++;
        class169.field2360.method1396(21375, class23.method151((byte) -75));
        class169.field2360.method1380(class38.field389, (byte) -8);
        class169.field2360.method1380(class222.field3039, (byte) -8);
        class169.field2360.method1396(21375, class384.field5630);
    }

    @OriginalMember(owner = "client!i", name = "b", descriptor = "(I)V")
    public static final void method161(int arg0) {
        field257++;
        class148 var1 = class134.field1864;
        synchronized (class134.field1864) {
            class134.field1864.method879((byte) 89);
        }
        if (arg0 != -1) {
            field258 = -19;
        }
    }
}
