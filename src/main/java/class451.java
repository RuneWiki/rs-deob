import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sl")
public class class451 {

    @OriginalMember(owner = "client!sl", name = "h", descriptor = "Z")
    public boolean field6280 = false;

    @OriginalMember(owner = "client!sl", name = "e", descriptor = "I")
    public static int field6277 = 0;

    @OriginalMember(owner = "client!sl", name = "k", descriptor = "Lpi;")
    public static class340 field6283 = new class340(100, 12);

    @OriginalMember(owner = "client!sl", name = "l", descriptor = "Lhb;")
    public static class250 field6284 = new class250(7, 8);

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "I")
    public int field6273;

    @OriginalMember(owner = "client!sl", name = "b", descriptor = "I")
    public static int field6274;

    @OriginalMember(owner = "client!sl", name = "c", descriptor = "I")
    public static int field6275;

    @OriginalMember(owner = "client!sl", name = "d", descriptor = "I")
    public static int field6276;

    @OriginalMember(owner = "client!sl", name = "f", descriptor = "I")
    public int field6278;

    @OriginalMember(owner = "client!sl", name = "i", descriptor = "I")
    public static int field6281;

    @OriginalMember(owner = "client!sl", name = "j", descriptor = "I")
    public static int field6282;

    @OriginalMember(owner = "client!sl", name = "g", descriptor = "Lji;")
    public class249 field6279;

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(B)V")
    public static void method2669(byte arg0) {
        field6283 = null;
        field6284 = null;
        if (arg0 <= 76) {
            method2669((byte) 126);
        }
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(Lbt;IB)V")
    private final void method2670(class88 arg0, int arg1, byte arg2) {
        field6276++;
        if (arg1 == 1) {
            this.field6278 = arg0.method568((byte) 110);
        } else if (arg1 == 2) {
            this.field6273 = arg0.method584(255);
        } else if (arg1 == 3) {
            this.field6280 = true;
        } else if (arg1 == 4) {
            this.field6278 = -1;
        }
        if (arg2 >= -61) {
            field6283 = null;
        }
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(BLbt;)V")
    public final void method2671(byte arg0, class88 arg1) {
        while (true) {
            int var3 = arg1.method617(2);
            if (var3 == 0) {
                if (arg0 <= 10) {
                    method2669((byte) -110);
                }
                field6274++;
                return;
            }
            this.method2670(arg1, var3, (byte) -83);
        }
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(BIZLqa;)Lf;")
    public final class404 method2672(byte arg0, int arg1, boolean arg2, class129 arg3) {
        field6281++;
        long var5 = (long) (arg1 << 16 | this.field6278 | (arg2 ? 262144 : 0) | arg3.field1760 << 19);
        if (arg0 <= 48) {
            this.method2670(null, -52, (byte) -105);
        }
        class404 var7 = (class404) this.field6279.field3184.method78(var5, (byte) -107);
        if (var7 != null) {
            return var7;
        } else if (this.field6279.field3173.method1294(this.field6278, (byte) -126)) {
            class136 var8 = class136.method945(this.field6279.field3173, this.field6278, 0);
            if (var8 != null) {
                var8.field1836 = var8.field1835 = var8.field1838 = var8.field1834 = 0;
                if (arg2) {
                    var8.method949();
                }
                for (int var9 = 0; var9 < arg1; var9++) {
                    var8.method959();
                }
            }
            class404 var10 = arg3.method851(var8, true);
            if (var10 != null) {
                this.field6279.field3184.method88(var5, 125, var10);
            }
            return var10;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(I)Z")
    public final boolean method2673(int arg0) {
        field6275++;
        return arg0 == 0 ? this.field6279.field3173.method1294(this.field6278, (byte) -118) : false;
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(IIB)B")
    public static final byte method2674(int arg0, int arg1, byte arg2) {
        field6282++;
        int var3 = -67 / ((16 - arg2) / 60);
        if (arg1 == 9) {
            return (byte) ((arg0 & 0x1) == 0 ? 1 : 2);
        } else {
            return 0;
        }
    }
}
