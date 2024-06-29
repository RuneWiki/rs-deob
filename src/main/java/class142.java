import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public abstract class class142 extends class176 {

    @OriginalMember(owner = "client!hc", name = "D", descriptor = "S")
    public short field1827;

    @OriginalMember(owner = "client!hc", name = "B", descriptor = "Llga;")
    public static class712 field1825 = new class712(61, -1);

    @OriginalMember(owner = "client!hc", name = "A", descriptor = "I")
    public static int field1824;

    @OriginalMember(owner = "client!hc", name = "C", descriptor = "I")
    public static int field1826;

    @OriginalMember(owner = "client!hc", name = "F", descriptor = "I")
    public static int field1828;

    @OriginalMember(owner = "client!hc", name = "G", descriptor = "I")
    public static int field1829;

    @OriginalMember(owner = "client!hc", name = "H", descriptor = "Lhv;")
    public static class519 field1830;

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(I[Lcba;)I")
    public final int method881(int arg0, class551[] arg1) {
        ++field1826;
        int var3 = -33 % ((29 - arg0) / 62);
        return this.method1009(super.field2170 >> class443.field6172, false, arg1, super.field2165 >> class443.field6172);
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(Lha;B)Z")
    public final boolean method882(class60 arg0, byte arg1) {
        ++field1828;
        return arg1 != 77 ? true : class161.method954((byte) 62, super.field2167, super.field2165 >> class443.field6172, super.field2170 >> class443.field6172);
    }

    @OriginalMember(owner = "client!hc", name = "i", descriptor = "(I)V")
    public static void method883(int arg0) {
        field1825 = null;
        if (arg0 == 288450632) {
            field1830 = null;
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(IIBI)V")
    public static final void method884(int arg0, int arg1, byte arg2, int arg3) {
        int var4 = arg1 * class11.field68.field5540.method750((byte) 126) >> 8;
        ++field1824;
        if (arg2 != -83) {
            method886(-90, 54, -126, (class744) null, (class744) null);
        }
        if (~arg0 == 0 && !class31.field270) {
            class658.method3723(31585);
        } else if (~arg0 != 0 && (~class555.field7831 != ~arg0 || !class600.method3324(false)) && var4 != 0 && !class31.field270) {
            class200.method1106(var4, 0, arg0, class727.field10149, arg3, false, (byte) -86);
            class444.method2492((byte) 111);
        }
        if (~class555.field7831 != ~arg0) {
            class443.field6170 = null;
        }
        class555.field7831 = arg0;
    }

    @OriginalMember(owner = "client!hc", name = "<init>", descriptor = "(IIIIII)V")
    public class142(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field1827 = (short) arg5;
        super.field2170 = arg0;
        super.field2167 = (byte) arg4;
        super.field2175 = (byte) arg3;
        super.field2178 = arg1;
        super.field2165 = arg2;
    }

    @OriginalMember(owner = "client!hc", name = "d", descriptor = "(Z)Z")
    public final boolean method885(boolean arg0) {
        ++field1829;
        if (arg0) {
            field1825 = null;
        }
        return class423.field5940[(super.field2170 >> class443.field6172) + class118.field1562 - class610.field8512][(super.field2165 >> class443.field6172) + -class39.field407 + class118.field1562];
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(IIILwo;Lwo;)V")
    public static final void method886(int arg0, int arg1, int arg2, class744 arg3, class744 arg4) {
        class624 var5 = class76.method565(arg0, arg1, arg2);
        if (var5 != null) {
            var5.field8738 = arg3;
            var5.field8730 = arg4;
            int var6 = class25.field188 == class143.field1850 ? 1 : 0;
            if (arg3.method123(-124)) {
                if (arg3.method126(6540)) {
                    arg3.field2179 = class43.field467[var6];
                    class43.field467[var6] = arg3;
                } else {
                    arg3.field2179 = class732.field10200[var6];
                    class732.field10200[var6] = arg3;
                    class315.field4252 = true;
                }
            } else {
                arg3.field2179 = class707.field9896[var6];
                class707.field9896[var6] = arg3;
            }
            if (arg4 != null) {
                if (arg4.method123(-7)) {
                    if (arg4.method126(6540)) {
                        arg4.field2179 = class43.field467[var6];
                        class43.field467[var6] = arg4;
                        return;
                    }
                    arg4.field2179 = class732.field10200[var6];
                    class732.field10200[var6] = arg4;
                    class315.field4252 = true;
                    return;
                }
                arg4.field2179 = class707.field9896[var6];
                class707.field9896[var6] = arg4;
            }
        }
    }
}
