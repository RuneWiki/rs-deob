import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lc")
public class class645 {

    @OriginalMember(owner = "client!lc", name = "i", descriptor = "Z")
    public boolean field9223 = false;

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "I")
    public static int field9215;

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "I")
    public int field9216;

    @OriginalMember(owner = "client!lc", name = "c", descriptor = "I")
    public int field9217;

    @OriginalMember(owner = "client!lc", name = "d", descriptor = "I")
    public static int field9218;

    @OriginalMember(owner = "client!lc", name = "e", descriptor = "I")
    public static int field9219;

    @OriginalMember(owner = "client!lc", name = "g", descriptor = "I")
    public static int field9221;

    @OriginalMember(owner = "client!lc", name = "h", descriptor = "I")
    public static int field9222;

    @OriginalMember(owner = "client!lc", name = "j", descriptor = "I")
    public static int field9224;

    @OriginalMember(owner = "client!lc", name = "f", descriptor = "Ldda;")
    public class381 field9220;

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(Lig;Z)V", line = 3)
    public final void method3669(class244 arg0, boolean arg1) {
        while (true) {
            int var3 = arg0.method1423(-69);
            if (var3 == 0) {
                field9219++;
                if (!arg1) {
                    this.field9216 = -10;
                    return;
                }
                return;
            }
            this.method3673(var3, -27856, arg0);
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(Ljava/lang/String;II)V", line = 29)
    public static final void method3670(String arg0, int arg1, int arg2) {
        field9224++;
        if (arg2 != -2) {
            field9218 = 92;
        }
        class314.field3920++;
        class249 var3 = class289.method1715(class299.field3720, arg2 ^ 0xFFFFFF82, class41.field470);
        var3.field3016.method1460(class729.method4063(arg2 ^ 0x1, arg0) + 1, arg2 ^ 0xFFFF9F78);
        var3.field3016.method1480(arg0, false);
        var3.field3016.method1460(arg1, arg2 ^ 0xFFFF9F78);
        class510.method3017(var3, arg2 + 125);
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(Lha;ZIZ)Lhu;", line = 49)
    public final class131 method3671(class58 arg0, boolean arg1, int arg2, boolean arg3) {
        field9221++;
        long var5 = (long) (arg2 << 16 | this.field9216 | (arg1 ? 262144 : 0) | arg0.field581 << 19);
        class131 var7 = (class131) this.field9220.field5220.method3538(var5, 0);
        if (var7 != null) {
            return var7;
        } else if (this.field9220.field5218.method2463((byte) 109, this.field9216)) {
            class155 var8 = class155.method953(this.field9220.field5218, this.field9216, 0);
            if (var8 != null) {
                var8.field1705 = var8.field1709 = var8.field1704 = var8.field1703 = 0;
                if (arg1) {
                    var8.method955();
                }
                for (int var9 = 0; var9 < arg2; var9++) {
                    var8.method949();
                }
            }
            class131 var10 = arg0.method434(var8, true);
            if (arg3) {
                return null;
            } else {
                if (var10 != null) {
                    this.field9220.field5220.method3537(-126, var5, var10);
                }
                return var10;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(I)Z", line = 93)
    public final boolean method3672(int arg0) {
        if (arg0 != 1) {
            this.method3669(null, true);
        }
        field9222++;
        return this.field9220.field5218.method2463((byte) 111, this.field9216);
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(IILig;)V", line = 106)
    private final void method3673(int arg0, int arg1, class244 arg2) {
        if (arg0 == 1) {
            this.field9216 = arg2.method1476(87);
        } else if (arg0 == 2) {
            this.field9217 = arg2.method1458((byte) -127);
        } else if (arg0 == 3) {
            this.field9223 = true;
        } else if (arg0 == 4) {
            this.field9216 = -1;
        }
        if (arg1 != -27856) {
            this.method3672(126);
        }
        field9215++;
    }
}
