import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gb")
public class class212 {

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "Z")
    public boolean field2792 = false;

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "I")
    public static int field2793;

    @OriginalMember(owner = "client!gb", name = "c", descriptor = "I")
    public static int field2794;

    @OriginalMember(owner = "client!gb", name = "d", descriptor = "I")
    public static int field2795;

    @OriginalMember(owner = "client!gb", name = "f", descriptor = "I")
    public int field2797;

    @OriginalMember(owner = "client!gb", name = "g", descriptor = "I")
    public int field2798;

    @OriginalMember(owner = "client!gb", name = "h", descriptor = "I")
    public static int field2799;

    @OriginalMember(owner = "client!gb", name = "e", descriptor = "Laia;")
    public class226 field2796;

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(BLee;I)V", line = 3)
    private final void method1303(byte arg0, class675 arg1, int arg2) {
        field2795++;
        if (arg0 != 36) {
            this.field2796 = null;
        }
        if (arg2 == 1) {
            this.field2798 = arg1.method3757((byte) -65);
        } else if (arg2 == 2) {
            this.field2797 = arg1.method3756(false);
        } else if (arg2 == 3) {
            this.field2792 = true;
            return;
        } else if (arg2 == 4) {
            this.field2798 = -1;
            return;
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(Lee;I)V", line = 31)
    public final void method1304(class675 arg0, int arg1) {
        if (arg1 != 248098352) {
            this.method1306(false, -114, null, false);
        }
        field2794++;
        while (true) {
            int var3 = arg0.method3750((byte) 35);
            if (var3 == 0) {
                return;
            }
            this.method1303((byte) 36, arg0, var3);
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(I)Z", line = 60)
    public final boolean method1305(int arg0) {
        if (arg0 < 58) {
            return false;
        } else {
            field2793++;
            return this.field2796.field3046.method2088(this.field2798, 90);
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(ZILha;Z)Loia;", line = 76)
    public final class88 method1306(boolean arg0, int arg1, class58 arg2, boolean arg3) {
        field2799++;
        long var5 = (long) ((arg0 ? 262144 : 0) | this.field2798 | arg1 << 16 | arg2.field700 << 19);
        if (arg3) {
            this.method1306(false, 27, null, true);
        }
        class88 var7 = (class88) this.field2796.field3053.method4022(var5, (byte) 125);
        if (var7 != null) {
            return var7;
        } else if (this.field2796.field3046.method2088(this.field2798, 113)) {
            class204 var8 = class204.method1237(this.field2796.field3046, this.field2798, 0);
            if (var8 != null) {
                var8.field2663 = var8.field2662 = var8.field2658 = var8.field2659 = 0;
                if (arg0) {
                    var8.method1240();
                }
                for (int var9 = 0; var9 < arg1; var9++) {
                    var8.method1238();
                }
            }
            class88 var10 = arg2.method484(var8, true);
            if (var10 != null) {
                this.field2796.field3053.method4018((byte) 124, var10, var5);
            }
            return var10;
        } else {
            return null;
        }
    }
}
