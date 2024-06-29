import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ae")
public class class160 extends class245 {

    @OriginalMember(owner = "client!ae", name = "y", descriptor = "[I")
    private int[] field2085 = new int[this.field3454];

    @OriginalMember(owner = "client!ae", name = "v", descriptor = "I")
    public static int field2082 = 0;

    @OriginalMember(owner = "client!ae", name = "C", descriptor = "Lsj;")
    public static class248 field2089 = null;

    @OriginalMember(owner = "client!ae", name = "s", descriptor = "I")
    public static int field2079;

    @OriginalMember(owner = "client!ae", name = "x", descriptor = "I")
    public static int field2084;

    @OriginalMember(owner = "client!ae", name = "z", descriptor = "I")
    public static int field2086;

    @OriginalMember(owner = "client!ae", name = "A", descriptor = "I")
    private int field2087;

    @OriginalMember(owner = "client!ae", name = "B", descriptor = "I")
    public static int field2088;

    @OriginalMember(owner = "client!ae", name = "D", descriptor = "I")
    private int field2090;

    @OriginalMember(owner = "client!ae", name = "E", descriptor = "I")
    public static int field2091;

    @OriginalMember(owner = "client!ae", name = "F", descriptor = "I")
    public static int field2092;

    @OriginalMember(owner = "client!ae", name = "G", descriptor = "I")
    public static int field2093;

    @OriginalMember(owner = "client!ae", name = "H", descriptor = "I")
    public static int field2094;

    @OriginalMember(owner = "client!ae", name = "t", descriptor = "Las;")
    public static class359 field2080;

    @OriginalMember(owner = "client!ae", name = "u", descriptor = "[B")
    private byte[] field2081;

    @OriginalMember(owner = "client!ae", name = "w", descriptor = "[Ll;")
    public static class315[] field2083;

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(IB)V", line = 3)
    public void method1074(int arg0, byte arg1) {
        ++field2091;
        this.field2081[this.field2087++] = (byte) ((class394.method2529(arg1, 255) >> 1) + 127);
    }

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "(B)V", line = 14)
    public final void method892(byte arg0) {
        ++field2084;
        this.field2090 = Math.abs(this.field2090);
        if (~this.field2090 <= -4097) {
            this.field2090 = 4095;
        }
        this.method1074(this.field2087++, (byte) (this.field2090 >> 4));
        if (arg0 > -24) {
            this.method896((byte) -77, -15, -51);
        }
        this.field2090 = 0;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(II)I", line = 31)
    public static final int method1075(int arg0, int arg1) {
        if (arg0 != 0) {
            return 6;
        } else {
            ++field2086;
            return 255 & arg1;
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(B)V", line = 43)
    public final void method891(byte arg0) {
        ++field2079;
        if (arg0 > 83) {
            this.field2090 = 0;
            this.field2087 = 0;
        }
    }

    @OriginalMember(owner = "client!ae", name = "<init>", descriptor = "(IIIIIF)V", line = 59)
    public class160(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4);
        for (int var7 = 0; ~var7 > ~super.field3454; ++var7) {
            this.field2085[var7] = (short) ((int) (4096.0D * Math.pow((double) arg5, (double) var7)));
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(BII)V", line = 80)
    public final void method896(byte arg0, int arg1, int arg2) {
        ++field2088;
        this.field2090 += this.field2085[arg2] * arg1 >> 12;
        int var4 = 110 / ((arg0 - -28) / 55);
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(ILjava/lang/String;ZZJIILjava/lang/String;IZI)V", line = 99)
    public static final void method1076(int arg0, String arg1, boolean arg2, boolean arg3, long arg4, int arg5, int arg6, String arg7, int arg8, boolean arg9, int arg10) {
        ++field2092;
        int[] var12 = new int[4];
        for (int var13 = 0; ~var13 > -4; ++var13) {
            var12[var13] = (int) (Math.random() * 9.9999999E7D);
        }
        class341 var14 = new class341(128);
        var14.method2204(10, 8);
        var14.method2250(false, (!arg9 ? 0 : 1) | (arg3 ? 2 : 0) | (arg2 ? 4 : 0));
        var14.method2258(25445, arg4);
        var14.method2240((byte) -88, var12[0]);
        var14.method2214(arg1, -85);
        var14.method2240((byte) -88, var12[1]);
        var14.method2250(false, class430.field6250);
        var14.method2204(arg6, arg0 ^ 23942);
        var14.method2204(arg5, arg0 + -23942);
        var14.method2240((byte) -88, var12[2]);
        var14.method2250(false, arg10);
        var14.method2250(false, arg8);
        var14.method2240((byte) -88, var12[3]);
        var14.method2216(false, class281.field4136, class36.field556);
        class341 var15 = new class341(350);
        if (arg0 != 23950) {
            field2093 = 42;
        }
        var15.method2214(arg7, -120);
        int var16 = 8 + -(class9.method61((byte) -117, arg7) % 8);
        for (int var17 = 0; ~var16 < ~var17; ++var17) {
            var15.method2204((int) (Math.random() * 255.0D), 8);
        }
        var15.method2244(var12, 12532);
        class140.field1797.field5049 = 0;
        class140.field1797.method2204(22, 8);
        class140.field1797.method2250(false, var14.field5049 + 2 - -var15.field5049);
        class140.field1797.method2250(false, 556);
        class140.field1797.method2252(0, -847501448, var14.field5049, var14.field5042);
        class140.field1797.method2252(0, arg0 ^ -847480074, var15.field5049, var15.field5042);
        class40.field603 = 0;
        class86.field1195 = 0;
        class8.field111 = -3;
        class17.field279 = 1;
    }

    @OriginalMember(owner = "client!ae", name = "c", descriptor = "(I)V", line = 159)
    public static void method1077(int arg0) {
        field2080 = null;
        field2083 = null;
        field2089 = null;
        if (arg0 != 2) {
            field2093 = -33;
        }
    }
}
