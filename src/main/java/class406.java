import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ns")
public class class406 {

    @OriginalMember(owner = "client!ns", name = "l", descriptor = "Ltm;")
    public class392 field5735 = new class392();

    @OriginalMember(owner = "client!ns", name = "f", descriptor = "I")
    public static int field5729 = 0;

    @OriginalMember(owner = "client!ns", name = "i", descriptor = "I")
    public static int field5732 = 0;

    @OriginalMember(owner = "client!ns", name = "g", descriptor = "F")
    public static float field5730;

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "I")
    public static int field5724;

    @OriginalMember(owner = "client!ns", name = "b", descriptor = "I")
    public static int field5725;

    @OriginalMember(owner = "client!ns", name = "c", descriptor = "I")
    public static int field5726;

    @OriginalMember(owner = "client!ns", name = "d", descriptor = "I")
    public static int field5727;

    @OriginalMember(owner = "client!ns", name = "e", descriptor = "I")
    public static int field5728;

    @OriginalMember(owner = "client!ns", name = "h", descriptor = "I")
    public static int field5731;

    @OriginalMember(owner = "client!ns", name = "j", descriptor = "I")
    public static int field5733;

    @OriginalMember(owner = "client!ns", name = "k", descriptor = "I")
    public static int field5734;

    @OriginalMember(owner = "client!ns", name = "m", descriptor = "Ltm;")
    private class392 field5736;

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(Ltm;I)V")
    public final void method2341(class392 arg0, int arg1) {
        field5731++;
        if (arg0.field5560 != null) {
            arg0.method2287((byte) -90);
        }
        arg0.field5555 = this.field5735;
        arg0.field5560 = this.field5735.field5560;
        arg0.field5560.field5555 = arg0;
        arg0.field5555.field5560 = arg0;
        if (arg1 >= -25) {
            this.method2345(-121);
        }
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(I)V")
    public final void method2342(int arg0) {
        field5734++;
        if (arg0 != 16711680) {
            this.field5736 = null;
        }
        while (true) {
            class392 var2 = this.field5735.field5555;
            if (this.field5735 == var2) {
                this.field5736 = null;
                return;
            }
            var2.method2287((byte) -90);
        }
    }

    @OriginalMember(owner = "client!ns", name = "b", descriptor = "(I)Ltm;")
    public final class392 method2343(int arg0) {
        if (arg0 != 0) {
            return null;
        }
        field5725++;
        class392 var2 = this.field5736;
        if (this.field5735 == var2) {
            this.field5736 = null;
            return null;
        } else {
            this.field5736 = var2.field5555;
            return var2;
        }
    }

    @OriginalMember(owner = "client!ns", name = "c", descriptor = "(I)I")
    public final int method2344(int arg0) {
        field5728++;
        int var2 = 0;
        if (arg0 > -108) {
            return 8;
        } else {
            for (class392 var3 = this.field5735.field5555; var3 != this.field5735; var3 = var3.field5555) {
                var2++;
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!ns", name = "d", descriptor = "(I)Ltm;")
    public final class392 method2345(int arg0) {
        if (arg0 != -16711936) {
            return null;
        }
        field5727++;
        class392 var2 = this.field5735.field5555;
        if (this.field5735 == var2) {
            return null;
        } else {
            var2.method2287((byte) -90);
            return var2;
        }
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(IIII)I")
    public static final int method2346(int arg0, int arg1, int arg2, int arg3) {
        field5724++;
        if (arg0 < 124) {
            return 75;
        } else {
            int var4 = ((arg3 & 0xFF00FF) * arg1 & 0xFF00FF00 | (arg3 & 0xFF00) * arg1 & 0xFF0000) >>> 8;
            int var5 = 255 - arg1;
            return (((arg2 & 0xFF00) * var5 & 0xFF0000 | (arg2 & 0xFF00FF) * var5 & 0xFF00FF00) >>> 8) + var4;
        }
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(B)V")
    public static final void method2347(byte arg0) {
        class488.field6688 = null;
        field5726++;
        if (class247.field3206 && class381.method2243((byte) 106) != 1) {
            class327.method1943(21337, 0, 0, class404.method2336(false), class713.field9949 == 3 || class713.field9949 == 7, class1.method3((byte) 60));
        }
        int var1 = 0;
        int var2 = 62 % ((arg0 - 29) / 42);
        int var3 = 0;
        if (class247.field3206) {
            var1 = class63.method488((byte) 42);
            var3 = class231.method1364(false);
        }
        class561.method3163(class512.field6932 + var3, -1, var3, class116.field1543, var3, var1, class546.field7710 + var1, (byte) 88, var1);
        if (class488.field6688 != null) {
            class507.method2821(-1412584499, true, class547.field7724, var1, var3, class63.field690.field2697, class488.field6688, class546.field7710 + var1, class512.field6932 + var3, true, class385.field5418);
            class488.field6688 = null;
        }
    }

    @OriginalMember(owner = "client!ns", name = "e", descriptor = "(I)Ltm;")
    public final class392 method2348(int arg0) {
        field5733++;
        class392 var2 = this.field5735.field5555;
        if (this.field5735 == var2) {
            this.field5736 = null;
            return null;
        }
        if (arg0 != -1) {
            field5729 = -120;
        }
        this.field5736 = var2.field5555;
        return var2;
    }

    @OriginalMember(owner = "client!ns", name = "<init>", descriptor = "()V")
    public class406() {
        this.field5735.field5560 = this.field5735;
        this.field5735.field5555 = this.field5735;
    }
}
