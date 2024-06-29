import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jj")
public class class251 extends class81 {

    @OriginalMember(owner = "client!jj", name = "i", descriptor = "Lbaa;")
    public class620 field3183;

    @OriginalMember(owner = "client!jj", name = "g", descriptor = "I")
    public static int field3181;

    @OriginalMember(owner = "client!jj", name = "h", descriptor = "Lsl;")
    public static class92 field3182;

    @OriginalMember(owner = "client!jj", name = "b", descriptor = "(I)V", line = 6)
    public static void method1528(int arg0) {
        field3182 = null;
        if (arg0 != 0) {
            field3182 = null;
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(B)V", line = 19)
    public static final void method1529(byte arg0) {
        field3181++;
        int var1 = class627.field8745;
        int[] var2 = class274.field3465;
        for (int var3 = 0; var3 < var1; var3++) {
            class546 var9 = class447.field6287[var2[var3]];
            if (var9 != null && var9.field345 > 0) {
                var9.field345--;
                if (var9.field345 == 0) {
                    var9.field334 = null;
                }
            }
        }
        for (int var4 = 0; var4 < class443.field6200; var4++) {
            long var5 = (long) class61.field832[var4];
            class247 var7 = (class247) class563.field7875.method3248(var5, 0);
            if (var7 != null) {
                class124 var8 = var7.field3158;
                if (var8.field345 > 0) {
                    var8.field345--;
                    if (var8.field345 == 0) {
                        var8.field334 = null;
                    }
                }
            }
        }
        if (arg0 >= -16) {
            method1528(29);
        }
    }

    @OriginalMember(owner = "client!jj", name = "<init>", descriptor = "(Lbm;II[B)V", line = 79)
    public class251(class684 arg0, int arg1, int arg2, byte[] arg3) {
        this.field3183 = arg0.method3714(arg1, 0, arg2, arg3, false, class15.field215);
        this.field3183.method381(false, -13021, false);
    }

    @OriginalMember(owner = "client!jj", name = "<init>", descriptor = "(Lbm;II[I)V", line = 91)
    public class251(class684 arg0, int arg1, int arg2, int[] arg3) {
        this.field3183 = arg0.method3731(arg3, false, (byte) 83, arg1, arg2);
        this.field3183.method381(false, -13021, false);
    }
}
