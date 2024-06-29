import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!at")
public class class257 extends class383 {

    @OriginalMember(owner = "client!at", name = "l", descriptor = "I")
    public int field3270;

    @OriginalMember(owner = "client!at", name = "m", descriptor = "I")
    public int field3271;

    @OriginalMember(owner = "client!at", name = "k", descriptor = "[I")
    public static int[] field3269 = new int[32];

    @OriginalMember(owner = "client!at", name = "j", descriptor = "I")
    public static int field3268 = -1;

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(I)V")
    public static void method1543(int arg0) {
        if (arg0 != 32) {
            field3269 = null;
        }
        field3269 = null;
    }

    @OriginalMember(owner = "client!at", name = "<init>", descriptor = "(II)V")
    public class257(int arg0, int arg1) {
        this.field3270 = arg0;
        this.field3271 = arg1;
    }

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(Lvn;)V")
    public static final void method1544(class205 arg0) {
        for (int var1 = arg0.field2673; var1 <= arg0.field2681; var1++) {
            for (int var2 = arg0.field2671; var2 <= arg0.field2670; var2++) {
                class490 var3 = class125.field1664[arg0.field2676][var1][var2];
                if (var3 != null) {
                    class376 var4 = var3.field7127;
                    class376 var5 = null;
                    while (var4 != null) {
                        if (var4.field4953 == arg0) {
                            if (var5 == null) {
                                var3.field7127 = var4.field4952;
                            } else {
                                var5.field4952 = var4.field4952;
                            }
                            var4.method2137(-122);
                            break;
                        }
                        var5 = var4;
                        var4 = var4.field4952;
                    }
                    var3.field7123 = 0;
                    for (class376 var6 = var3.field7127; var6 != null; var6 = var6.field4952) {
                        var3.field7123 = (byte) (var3.field7123 | var6.field4948);
                    }
                }
            }
        }
    }

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field3269[var1] = var0 - 1;
            var0 += var0;
        }
    }
}
