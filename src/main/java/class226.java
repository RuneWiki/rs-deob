import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ew")
public class class226 extends class201 {

    @OriginalMember(owner = "client!ew", name = "N", descriptor = "B")
    public byte field3374;

    @OriginalMember(owner = "client!ew", name = "I", descriptor = "I")
    public static int field3369;

    @OriginalMember(owner = "client!ew", name = "K", descriptor = "I")
    public int field3371;

    @OriginalMember(owner = "client!ew", name = "L", descriptor = "I")
    public static int field3372;

    @OriginalMember(owner = "client!ew", name = "M", descriptor = "I")
    public static int field3373;

    @OriginalMember(owner = "client!ew", name = "O", descriptor = "I")
    public static int field3375;

    @OriginalMember(owner = "client!ew", name = "J", descriptor = "Lek;")
    public class465 field3370;

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "(I)[B")
    public final byte[] method1400(int arg0) {
        if (arg0 != 32) {
            field3375 = 82;
        }
        ++field3369;
        if (!super.field3107 && this.field3370.field6719.length - this.field3374 <= this.field3370.field6710) {
            return this.field3370.field6719;
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "()V")
    public static final void method1490() {
        for (int var0 = 0; var0 < class136.field2197; ++var0) {
            class144 var1 = class88.field1308[var0];
            class450.method2626(var1, true);
            class88.field1308[var0] = null;
        }
        class136.field2197 = 0;
    }

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "(IIII)I")
    public static final int method1491(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg1 & 3;
        ++field3372;
        if (var4 == 0) {
            return arg2;
        } else if (arg0 != 16836) {
            return 112;
        } else if (~var4 == -2) {
            return -arg3 + 4095;
        } else {
            return var4 == 2 ? -arg2 + 4095 : arg3;
        }
    }

    @OriginalMember(owner = "client!ew", name = "d", descriptor = "(I)I")
    public final int method1402(int arg0) {
        ++field3373;
        if (arg0 != 100) {
            this.field3374 = 11;
        }
        return this.field3370 == null ? 0 : this.field3370.field6710 * 100 / (this.field3370.field6719.length + -this.field3374);
    }
}
