import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oda")
public class class559 {

    @OriginalMember(owner = "client!oda", name = "b", descriptor = "Ljava/lang/String;")
    public String field8299;

    @OriginalMember(owner = "client!oda", name = "d", descriptor = "I")
    public int field8301;

    @OriginalMember(owner = "client!oda", name = "g", descriptor = "I")
    public static int field8304 = 0;

    @OriginalMember(owner = "client!oda", name = "h", descriptor = "[I")
    public static int[] field8305 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

    @OriginalMember(owner = "client!oda", name = "a", descriptor = "I")
    public static int field8298;

    @OriginalMember(owner = "client!oda", name = "c", descriptor = "I")
    public static int field8300;

    @OriginalMember(owner = "client!oda", name = "e", descriptor = "I")
    public static int field8302;

    @OriginalMember(owner = "client!oda", name = "f", descriptor = "I")
    public static int field8303;

    @OriginalMember(owner = "client!oda", name = "a", descriptor = "(IIILdda;)Lbt;")
    public static final class114 method3271(int arg0, int arg1, int arg2, class597 arg3) {
        field8298++;
        byte[] var4 = arg3.method3486((byte) -125, arg1, arg2);
        if (arg0 == 80) {
            return var4 == null ? null : new class114(var4);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!oda", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field8302++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!oda", name = "a", descriptor = "(II)V")
    public static final void method3272(int arg0, int arg1) {
        class634.field9256 = arg1;
        field8300++;
        class325 var2 = class19.field173;
        synchronized (class19.field173) {
            if (arg0 != 80) {
                return;
            }
            class19.field173.method2037(true);
        }
        class325 var3 = class161.field2155;
        synchronized (class161.field2155) {
            class161.field2155.method2037(true);
        }
    }

    @OriginalMember(owner = "client!oda", name = "a", descriptor = "(III)Z")
    public static final boolean method3273(int arg0, int arg1, int arg2) {
        if (arg0 == 27834) {
            field8303++;
            return (class206.method1342(arg0 ^ 0x5A60, arg1, arg2) | class221.method1452(arg1, arg2, arg0 - 27834) | class420.method2500(arg2, 255, arg1)) & class474.method2885(-27, arg1, arg2);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!oda", name = "a", descriptor = "(I)V")
    public static void method3274(int arg0) {
        if (arg0 != 48) {
            field8304 = -94;
        }
        field8305 = null;
    }

    @OriginalMember(owner = "client!oda", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
    public class559(String arg0, int arg1) {
        this.field8299 = arg0;
        this.field8301 = arg1;
    }
}
