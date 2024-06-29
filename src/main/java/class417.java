import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kp")
public class class417 {

    @OriginalMember(owner = "client!kp", name = "c", descriptor = "I")
    public static int field5647;

    @OriginalMember(owner = "client!kp", name = "e", descriptor = "I")
    public static int field5649;

    @OriginalMember(owner = "client!kp", name = "f", descriptor = "I")
    public static int field5650;

    @OriginalMember(owner = "client!kp", name = "h", descriptor = "I")
    public static int field5652;

    @OriginalMember(owner = "client!kp", name = "g", descriptor = "J")
    public long field5651;

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "Lkp;")
    public class417 field5645;

    @OriginalMember(owner = "client!kp", name = "d", descriptor = "Lkp;")
    public class417 field5648;

    @OriginalMember(owner = "client!kp", name = "b", descriptor = "[I")
    public static int[] field5646;

    @OriginalMember(owner = "client!kp", name = "d", descriptor = "(I)Z", line = 8)
    public final boolean method2453(int arg0) {
        field5650++;
        if (arg0 == 64) {
            return this.field5648 != null;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!kp", name = "e", descriptor = "(I)V", line = 23)
    public static void method2454(int arg0) {
        if (arg0 != 63) {
            field5646 = null;
        }
        field5646 = null;
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(II)V", line = 35)
    public static final void method2455(int arg0, int arg1) {
        field5649++;
        if (arg0 != arg1 && class438.field5854[arg1]) {
            class169.field2636.method1993((byte) 50, arg1);
            class302.field4135[arg1] = null;
            class484.field6903[arg1] = null;
            class438.field5854[arg1] = false;
        }
    }

    @OriginalMember(owner = "client!kp", name = "b", descriptor = "(II)S", line = 54)
    public static final short method2456(int arg0, int arg1) {
        field5647++;
        int var2 = arg0 >> 10 & 0x3F;
        int var3 = (arg0 & 0x386) >> 3;
        int var4 = arg0 & 0x7F;
        int var5 = var4 > 64 ? (127 - var4) * var3 >> 7 : var3 * var4 >> 7;
        int var6 = 36 / ((arg1 + 80) / 32);
        int var7 = var4 + var5;
        int var8;
        if (var7 == 0) {
            var8 = var5 << 1;
        } else {
            var8 = (var5 << 8) / var7;
        }
        return (short) (var7 | var8 >> 4 << 7 | var2 << 10);
    }

    @OriginalMember(owner = "client!kp", name = "f", descriptor = "(I)V", line = 84)
    public final void method2457(int arg0) {
        field5652++;
        if (this.field5648 == null) {
            return;
        }
        this.field5648.field5645 = this.field5645;
        if (arg0 == -8422) {
            this.field5645.field5648 = this.field5648;
            this.field5645 = null;
            this.field5648 = null;
        }
    }
}
