import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bk")
public class class342 {

    @OriginalMember(owner = "client!bk", name = "f", descriptor = "[I")
    public static int[] field4964 = new int[] { 3, 7, 15 };

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "I")
    public int field4959;

    @OriginalMember(owner = "client!bk", name = "b", descriptor = "I")
    public static int field4960;

    @OriginalMember(owner = "client!bk", name = "c", descriptor = "I")
    public int field4961;

    @OriginalMember(owner = "client!bk", name = "d", descriptor = "I")
    public static int field4962;

    @OriginalMember(owner = "client!bk", name = "g", descriptor = "I")
    private int field4965;

    @OriginalMember(owner = "client!bk", name = "h", descriptor = "I")
    public static int field4966;

    @OriginalMember(owner = "client!bk", name = "i", descriptor = "I")
    public static int field4967;

    @OriginalMember(owner = "client!bk", name = "e", descriptor = "Lpk;")
    public class180 field4963;

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(Ljr;II)V")
    private final void method2045(class96 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field4965 = arg0.method743((byte) -113);
        } else if (arg1 == 2) {
            this.field4959 = arg0.method718(89);
            this.field4961 = arg0.method718(113);
        }
        if (arg2 > -18) {
            this.field4959 = -118;
        }
        field4960++;
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(B)Lkq;")
    public final synchronized class543 method2046(byte arg0) {
        if (arg0 < 62) {
            method2047(-94);
        }
        field4962++;
        class543 var2 = (class543) this.field4963.field2667.method1986((byte) -123, (long) this.field4965);
        if (var2 != null) {
            return var2;
        }
        class543 var3 = class543.method2990(this.field4963.field2658, this.field4965, 0);
        if (var3 != null) {
            this.field4963.field2667.method1985(var3, (long) this.field4965, (byte) -102);
        }
        return var3;
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(I)V")
    public static void method2047(int arg0) {
        if (arg0 <= -104) {
            field4964 = null;
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(Ljr;Z)V")
    public final void method2048(class96 arg0, boolean arg1) {
        field4967++;
        while (true) {
            int var3 = arg0.method718(-72);
            if (var3 == 0) {
                if (arg1) {
                    this.field4961 = -62;
                    return;
                } else {
                    return;
                }
            }
            this.method2045(arg0, var3, -99);
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(JB)V")
    public static final void method2049(long arg0, byte arg1) {
        int var3 = -110 % ((arg1 - 36) / 35);
        class288.field4014.field1301 = 0;
        field4966++;
        class288.field4014.method746((byte) -112, class599.field8318.field2617);
        class288.field4014.method725((byte) 36, arg0);
        class288.field4014.method746((byte) -104, class666.field9377);
        class179.field2650 = 0;
        class394.field5486 = 0;
        class595.field8273 = 1;
        class17.field262 = -3;
    }
}
