import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gj")
public class class659 {

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "I")
    public static int field9272;

    @OriginalMember(owner = "client!gj", name = "b", descriptor = "I")
    public static int field9273;

    @OriginalMember(owner = "client!gj", name = "c", descriptor = "I")
    public static int field9274;

    @OriginalMember(owner = "client!gj", name = "d", descriptor = "I")
    public static int field9275;

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(B)Z", line = 3)
    public static final boolean method3764(byte arg0) {
        field9273++;
        boolean var1 = true;
        if (arg0 > -15) {
            return false;
        }
        if (class758.field10462 == null) {
            if (class491.field6972.method3131(121, class115.field1447)) {
                class758.field10462 = class625.method3587(class491.field6972, class115.field1447);
            } else {
                var1 = false;
            }
        }
        if (class134.field1742 == null) {
            if (class491.field6972.method3131(-43, class656.field9248)) {
                class134.field1742 = class625.method3587(class491.field6972, class656.field9248);
            } else {
                var1 = false;
            }
        }
        if (class419.field5901 == null) {
            if (class491.field6972.method3131(-96, class304.field4552)) {
                class419.field5901 = class625.method3587(class491.field6972, class304.field4552);
            } else {
                var1 = false;
            }
        }
        if (class414.field5851 == null) {
            if (class7.field79.method3131(98, class164.field2414)) {
                class414.field5851 = class96.method677(class7.field79, class164.field2414, (byte) -125);
            } else {
                var1 = false;
            }
        }
        if (class609.field8597 == null) {
            if (class491.field6972.method3131(109, class164.field2414)) {
                class609.field8597 = class625.method3581(class491.field6972, class164.field2414);
            } else {
                var1 = false;
            }
        }
        return var1;
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(Lhk;ZZ)V", line = 75)
    public static final void method3765(class110 arg0, boolean arg1, boolean arg2) {
        class262.field3703.method1649(-25, arg0);
        field9272++;
        if (arg2) {
            class99.method696(-6, class346.field5086, class641.field9035, class84.field1103, class262.field3703, arg0);
        }
        if (!arg1) {
            method3766(-60, 10, -55, -125);
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(IIII)V", line = 89)
    public static final void method3766(int arg0, int arg1, int arg2, int arg3) {
        field9275++;
        int var4 = arg3 * class145.field1852.field9012.method978((byte) -46) >> 8;
        if (arg2 == var4 || arg1 == -1) {
            return;
        }
        if (!class709.field9995 && class433.field6161 != -1 && class628.method3595(0) && !class430.method2591(true)) {
            class31.field420 = class149.method1029(43);
            class110 var5 = class405.method2439(true, class31.field420);
            method3765(var5, true, true);
        }
        class452.method2719(class76.field1026, 0, false, 0, var4, arg1);
        class595.method3447((byte) 95, -1, 255);
        class709.field9995 = true;
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "([SII)[S", line = 116)
    public static final short[] method3767(short[] arg0, int arg1, int arg2) {
        field9274++;
        short[] var3 = new short[arg1];
        class42.method287(arg0, arg2, var3, 0, arg1);
        return var3;
    }
}
