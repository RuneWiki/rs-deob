import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lg")
public class class384 {

    @OriginalMember(owner = "client!lg", name = "l", descriptor = "S")
    public short field4939;

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "I")
    public int field4929;

    @OriginalMember(owner = "client!lg", name = "k", descriptor = "I")
    public int field4938;

    @OriginalMember(owner = "client!lg", name = "c", descriptor = "B")
    public byte field4930;

    @OriginalMember(owner = "client!lg", name = "i", descriptor = "I")
    public int field4936;

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "S")
    public short field4928;

    @OriginalMember(owner = "client!lg", name = "g", descriptor = "I")
    public int field4934;

    @OriginalMember(owner = "client!lg", name = "f", descriptor = "Z")
    public boolean field4933;

    @OriginalMember(owner = "client!lg", name = "h", descriptor = "S")
    public short field4935;

    @OriginalMember(owner = "client!lg", name = "j", descriptor = "I")
    public int field4937;

    @OriginalMember(owner = "client!lg", name = "d", descriptor = "Z")
    public static boolean field4931 = false;

    @OriginalMember(owner = "client!lg", name = "e", descriptor = "I")
    public static int field4932;

    @OriginalMember(owner = "client!lg", name = "m", descriptor = "I")
    public static int field4940;

    @OriginalMember(owner = "client!lg", name = "n", descriptor = "I")
    public static int field4941;

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(B)V")
    public static final void method2205(byte arg0) {
        field4941++;
        class307.field3884.method1601(4096);
        class113.field1423.method1070(-20355);
        class455.field5687.method1202((byte) 67);
        class472.field5828.setBackground(Color.black);
        class211.field2496 = -1;
        if (arg0 >= 77) {
            class307.field3884 = class113.method780(class472.field5828, (byte) 11);
            class113.field1423 = class539.method2895(-14069, true, class472.field5828);
        }
    }

    @OriginalMember(owner = "client!lg", name = "<init>", descriptor = "(IIIIIIIIIZZI)V")
    public class384(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, boolean arg10, int arg11) {
        this.field4939 = (short) arg4;
        this.field4929 = arg1;
        this.field4938 = arg2;
        this.field4930 = (byte) arg8;
        this.field4936 = arg11;
        this.field4928 = (short) arg6;
        this.field4934 = arg3;
        this.field4933 = arg10;
        this.field4935 = (short) arg5;
        this.field4937 = arg0;
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(IILta;Lrr;ILub;Ljava/lang/String;IIILfa;B)V")
    public static final void method2206(int arg0, int arg1, class201 arg2, class337 arg3, int arg4, class20 arg5, String arg6, int arg7, int arg8, int arg9, class219 arg10, byte arg11) {
        field4940++;
        int var12;
        if (class385.field4946 == 4) {
            var12 = (int) class689.field9561 & 0x3FFF;
        } else {
            var12 = (int) class689.field9561 + class290.field3661 & 0x3FFF;
        }
        int var13 = Math.max(arg3.field4309 / 2, arg3.field4211 / 2) + 10;
        int var14 = arg8 * arg8 + arg9 * arg9;
        if (var14 > (var13 * var13)) {
            return;
        }
        int var15 = class243.field3129[var12];
        int var16 = class243.field3128[var12];
        if (class385.field4946 != 4) {
            var16 = var16 * 256 / (class352.field4559 + 256);
            var15 = var15 * 256 / (class352.field4559 + 256);
        }
        int var17 = arg8 * var16 + arg9 * var15 >> 14;
        if (arg11 != -105) {
            method2207(-44, 40, -48);
        }
        int var18 = arg9 * var16 - (arg8 * var15) >> 14;
        int var19 = arg5.method120((byte) 126, 100, arg6, null);
        int var20 = var17 - var19 / 2;
        int var21 = arg5.method119(0, 100, arg6, null, arg11 + 105);
        if (var20 >= -arg3.field4309 && var20 <= arg3.field4309 && -arg3.field4211 <= var18 && var18 <= arg3.field4211) {
            arg2.method1175(arg1, arg4, arg6, 50, 0, null, (byte) -34, arg3.field4309 / 2 + var20 + arg4, null, 0, arg3.field4211 / 2 + (-var18 - arg7) + arg0 - var21, var19, 1, arg0, 0, arg10);
        }
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(III)I")
    public static final int method2207(int arg0, int arg1, int arg2) {
        field4932++;
        if (arg1 != 1) {
            return 50;
        }
        int var3 = 0;
        while (arg2 > 0) {
            var3 = var3 << 1 | arg0 & 0x1;
            arg2--;
            arg0 >>>= 0x1;
        }
        return var3;
    }
}
