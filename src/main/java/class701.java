import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sw")
public abstract class class701 extends class215 {

    @OriginalMember(owner = "client!sw", name = "x", descriptor = "S")
    public short field9906;

    @OriginalMember(owner = "client!sw", name = "s", descriptor = "I")
    public static int field9901 = 0;

    @OriginalMember(owner = "client!sw", name = "y", descriptor = "Lrw;")
    public static class703 field9907 = new class703(8, 1);

    @OriginalMember(owner = "client!sw", name = "r", descriptor = "I")
    public static int field9900;

    @OriginalMember(owner = "client!sw", name = "t", descriptor = "I")
    public static int field9902;

    @OriginalMember(owner = "client!sw", name = "u", descriptor = "I")
    public static int field9903;

    @OriginalMember(owner = "client!sw", name = "v", descriptor = "I")
    public static int field9904;

    @OriginalMember(owner = "client!sw", name = "w", descriptor = "I")
    public static int field9905;

    @OriginalMember(owner = "client!sw", name = "a", descriptor = "(III)V")
    public static final void method3903(int arg0, int arg1, int arg2) {
        boolean var3 = class153.field2210[0][arg1][arg2] != null && class153.field2210[0][arg1][arg2].field668 != null;
        for (int var4 = arg0; var4 >= 0; --var4) {
            if (class153.field2210[var4][arg1][arg2] == null) {
                class40 var5 = class153.field2210[var4][arg1][arg2] = new class40(var4);
                if (var3) {
                    ++var5.field672;
                }
            }
        }
    }

    @OriginalMember(owner = "client!sw", name = "b", descriptor = "(Z)Z")
    public final boolean method948(boolean arg0) {
        ++field9904;
        if (!arg0) {
            this.method952(72);
        }
        return class260.field3949[(super.field3024 >> class310.field4593) + -class435.field6354 + class196.field2802][(super.field3029 >> class310.field4593) + -class612.field8575 + class196.field2802];
    }

    @OriginalMember(owner = "client!sw", name = "a", descriptor = "(Ljava/lang/String;I)V")
    public static final void method3904(String arg0, int arg1) {
        ++field9903;
        if (class564.field7965 != null) {
            ++class695.field9787;
            class135 var2 = class688.method3794(class27.field393, class583.field8198, (byte) 38);
            var2.field1978.method3853((byte) 51, class652.method3606(12351, arg0));
            var2.field1978.method3837(4102, arg0);
            class19.method223(var2, arg1);
        }
    }

    @OriginalMember(owner = "client!sw", name = "k", descriptor = "(I)Z")
    public final boolean method952(int arg0) {
        if (arg0 >= -10) {
            this.method950(-103, (class498[]) null);
        }
        ++field9905;
        return class252.method1682(super.field3023, super.field3024 >> class310.field4593, (byte) 7, super.field3029 >> class310.field4593);
    }

    @OriginalMember(owner = "client!sw", name = "a", descriptor = "(I[Lrc;)I")
    public final int method950(int arg0, class498[] arg1) {
        if (arg0 != 65535) {
            field9901 = -69;
        }
        ++field9902;
        return this.method1427(super.field3024 >> class310.field4593, arg1, arg0 ^ -65417, super.field3029 >> class310.field4593);
    }

    @OriginalMember(owner = "client!sw", name = "<init>", descriptor = "(IIIIII)V")
    public class701(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super.field3023 = (byte) arg4;
        super.field3024 = arg0;
        this.field9906 = (short) arg5;
        super.field3018 = arg1;
        super.field3029 = arg2;
        super.field3019 = (byte) arg3;
    }

    @OriginalMember(owner = "client!sw", name = "c", descriptor = "(B)V")
    public static void method3905(byte arg0) {
        int var1 = -46 / ((arg0 - 49) / 61);
        field9907 = null;
    }

    @OriginalMember(owner = "client!sw", name = "d", descriptor = "(B)V")
    public static final void method3906(byte arg0) {
        ++field9900;
        if (arg0 != 120) {
            method3903(-79, -30, 25);
        }
        if (class368.field5267.field49 && class254.field3900.field4938 != -1) {
            class669.method3710((byte) 112, class254.field3900.field4938, class254.field3900.field4948);
        }
    }
}
