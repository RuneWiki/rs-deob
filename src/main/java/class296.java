import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fr")
public class class296 {

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "I")
    public int field4358;

    @OriginalMember(owner = "client!fr", name = "c", descriptor = "B")
    public byte field4360;

    @OriginalMember(owner = "client!fr", name = "f", descriptor = "S")
    public short field4363;

    @OriginalMember(owner = "client!fr", name = "e", descriptor = "B")
    public byte field4362;

    @OriginalMember(owner = "client!fr", name = "h", descriptor = "Z")
    public boolean field4365;

    @OriginalMember(owner = "client!fr", name = "j", descriptor = "S")
    public short field4367;

    @OriginalMember(owner = "client!fr", name = "b", descriptor = "I")
    public int field4359;

    @OriginalMember(owner = "client!fr", name = "g", descriptor = "S")
    public short field4364;

    @OriginalMember(owner = "client!fr", name = "i", descriptor = "I")
    public static int field4366 = 0;

    @OriginalMember(owner = "client!fr", name = "d", descriptor = "Ldc;")
    public static class302 field4361 = new class302();

    @OriginalMember(owner = "client!fr", name = "k", descriptor = "[I")
    public static int[] field4368 = new int[1];

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(Lwo;Z)V")
    public static final void method1851(class293 arg0, boolean arg1) {
        for (int var2 = arg0.field4299; var2 <= arg0.field4294; var2++) {
            for (int var3 = arg0.field4300; var3 <= arg0.field4305; var3++) {
                class44 var4 = class603.field8695[arg0.field7905][var2][var3];
                if (var4 != null) {
                    class361 var5 = var4.field667;
                    class361 var6 = null;
                    while (var5 != null) {
                        if (var5.field5301 == arg0) {
                            if (var6 == null) {
                                var4.field667 = var5.field5299;
                            } else {
                                var6.field5299 = var5.field5299;
                            }
                            var5.method2219((byte) -69);
                            break;
                        }
                        var6 = var5;
                        var5 = var5.field5299;
                    }
                }
            }
        }
        if (!arg1) {
            class355.method2197(arg0);
        }
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(Z)V")
    public static void method1852(boolean arg0) {
        field4368 = null;
        if (arg0) {
            field4366 = -1;
        }
        field4361 = null;
    }

    @OriginalMember(owner = "client!fr", name = "<init>", descriptor = "(IIIIIIIIIZI)V")
    public class296(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, int arg10) {
        this.field4358 = arg10;
        this.field4360 = (byte) arg8;
        this.field4363 = (short) arg6;
        this.field4362 = (byte) arg7;
        this.field4365 = arg9;
        this.field4367 = (short) arg5;
        this.field4359 = arg0;
        this.field4364 = (short) arg4;
    }
}
