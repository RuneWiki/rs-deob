import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sj")
public class class419 implements class338 {

    @OriginalMember(owner = "client!sj", name = "h", descriptor = "Lut;")
    private class111 field5571;

    @OriginalMember(owner = "client!sj", name = "c", descriptor = "Llfa;")
    private class101 field5566;

    @OriginalMember(owner = "client!sj", name = "d", descriptor = "Ljava/lang/String;")
    public static String field5567 = null;

    @OriginalMember(owner = "client!sj", name = "k", descriptor = "I")
    public static int field5574 = 0;

    @OriginalMember(owner = "client!sj", name = "i", descriptor = "Lfv;")
    public static class108 field5572 = new class108(14, 0, 4, 1);

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "I")
    public static int field5564;

    @OriginalMember(owner = "client!sj", name = "b", descriptor = "I")
    public static int field5565;

    @OriginalMember(owner = "client!sj", name = "e", descriptor = "I")
    public static int field5568;

    @OriginalMember(owner = "client!sj", name = "f", descriptor = "I")
    public static int field5569;

    @OriginalMember(owner = "client!sj", name = "l", descriptor = "I")
    public static int field5575;

    @OriginalMember(owner = "client!sj", name = "m", descriptor = "I")
    public static int field5576;

    @OriginalMember(owner = "client!sj", name = "n", descriptor = "I")
    public static int field5577;

    @OriginalMember(owner = "client!sj", name = "o", descriptor = "I")
    public static int field5578;

    @OriginalMember(owner = "client!sj", name = "j", descriptor = "Lta;")
    public static class195 field5573;

    @OriginalMember(owner = "client!sj", name = "g", descriptor = "Lpr;")
    public static class407 field5570;

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(ZI)V", line = 4)
    public final void method725(boolean arg0, int arg1) {
        field5565++;
        if (arg1 != -2536) {
            return;
        }
        class182 var3 = this.field5571.method692(-1, this.field5566.field1106);
        if (var3 == null) {
            return;
        }
        int var4 = this.field5566.field1101.method1281((byte) -109, class466.field6460, this.field5566.field1095) + this.field5566.field1098;
        int var5 = this.field5566.field1096.method1586(class137.field1567, this.field5566.field1104, (byte) 119) + this.field5566.field1108;
        if (this.field5566.field1107) {
            class453.field6284.method334(var4, var5, this.field5566.field1095, this.field5566.field1104, this.field5566.field1097, 0);
        }
        int var6 = var5 + this.method2268(-114, var3.field2230, var4, var5, 5, class211.field2561) * 12;
        int var9 = var6 + 8;
        if (this.field5566.field1107) {
            class453.field6284.method353(var4, var9, this.field5566.field1095 + var4 - 1, var9, this.field5566.field1097, 0);
        }
        var6 = var9 + 1;
        int var7 = var6 + this.method2268(-124, var3.field2229, var4, var6, 5, class211.field2561) * 12;
        int var10 = var7 + 5;
        int var10000 = var10 + this.method2268(-117, var3.field2226, var4, var10, 5, class211.field2561) * 12;
    }

    @OriginalMember(owner = "client!sj", name = "c", descriptor = "(I)V", line = 38)
    public static void method2266(int arg0) {
        field5573 = null;
        field5572 = null;
        field5570 = null;
        if (arg0 != 0) {
            field5574 = 73;
        }
        field5567 = null;
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(BIIIIII)V", line = 54)
    public static final void method2267(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field5578++;
        int var7 = arg3 + arg5;
        int var8 = arg6 - arg3;
        for (int var9 = arg5; var9 < var7; var9++) {
            class445.method2463(arg4, arg0 - 19, arg1, arg2, class156.field1755[var9]);
        }
        int var10 = arg1 - arg3;
        if (arg0 != 117) {
            return;
        }
        for (int var11 = arg6; var11 > var8; var11--) {
            class445.method2463(arg4, 127, arg1, arg2, class156.field1755[var11]);
        }
        int var12 = arg4 + arg3;
        for (int var13 = var7; var13 <= var8; var13++) {
            int[] var14 = class156.field1755[var13];
            class445.method2463(arg4, 111, var12, arg2, var14);
            class445.method2463(var10, arg0 ^ 0x2, arg1, arg2, var14);
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(ILjava/lang/String;IIILta;)I", line = 100)
    private final int method2268(int arg0, String arg1, int arg2, int arg3, int arg4, class195 arg5) {
        int var7 = -41 / ((-arg0 - 52) / 34);
        field5564++;
        return arg5.method1127(0, arg3 + arg4, this.field5566.field1103, null, 0, 0, this.field5566.field1104 - (arg4 * 2), 0, arg2 + arg4, this.field5566.field1099, 0, arg1, this.field5566.field1095 - arg4 * 2, null, true, null);
    }

    @OriginalMember(owner = "client!sj", name = "b", descriptor = "(I)Z", line = 113)
    public final boolean method152(int arg0) {
        field5575++;
        return arg0 == -18257 ? this.field5571.method694(true) : true;
    }

    @OriginalMember(owner = "client!sj", name = "<init>", descriptor = "(Lut;Llfa;)V", line = 127)
    public class419(class111 arg0, class101 arg1) {
        this.field5571 = arg0;
        this.field5566 = arg1;
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(I)V", line = 136)
    public final void method149(int arg0) {
        if (arg0 != -29265) {
            method2267((byte) 77, 32, -29, 87, -77, -89, -126);
        }
        field5576++;
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(II)I", line = 150)
    public static final int method2269(int arg0, int arg1) {
        if (arg0 == 127) {
            field5569++;
            return arg1 & 0x7F;
        } else {
            return -49;
        }
    }
}
