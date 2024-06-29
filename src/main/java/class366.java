import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hl")
public class class366 extends class3 implements class142 {

    @OriginalMember(owner = "client!hl", name = "f", descriptor = "I")
    private int field4950;

    @OriginalMember(owner = "client!hl", name = "h", descriptor = "I")
    public static int field4952 = 0;

    @OriginalMember(owner = "client!hl", name = "j", descriptor = "Lcr;")
    public static class403 field4954 = null;

    @OriginalMember(owner = "client!hl", name = "k", descriptor = "Lcu;")
    public static class145 field4955 = new class145(42, 4);

    @OriginalMember(owner = "client!hl", name = "o", descriptor = "Z")
    public static volatile boolean field4959 = true;

    @OriginalMember(owner = "client!hl", name = "c", descriptor = "I")
    public static int field4947;

    @OriginalMember(owner = "client!hl", name = "d", descriptor = "I")
    public static int field4948;

    @OriginalMember(owner = "client!hl", name = "e", descriptor = "I")
    public static int field4949;

    @OriginalMember(owner = "client!hl", name = "g", descriptor = "I")
    public static int field4951;

    @OriginalMember(owner = "client!hl", name = "i", descriptor = "I")
    public static int field4953;

    @OriginalMember(owner = "client!hl", name = "m", descriptor = "I")
    public static int field4957;

    @OriginalMember(owner = "client!hl", name = "n", descriptor = "I")
    public static int field4958;

    @OriginalMember(owner = "client!hl", name = "l", descriptor = "Lpc;")
    public static class473 field4956;

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "([BIII)V", line = 5)
    public final void method996(byte[] arg0, int arg1, int arg2, int arg3) {
        this.method21(arg0, arg2);
        ++field4949;
        this.field4950 = arg3;
        if (arg1 != -30832) {
            field4959 = false;
        }
    }

    @OriginalMember(owner = "client!hl", name = "b", descriptor = "(B)V", line = 21)
    public static void method2132(byte arg0) {
        if (arg0 != 26) {
            method2133(48, -101, -65, 89, -123);
        }
        field4956 = null;
        field4955 = null;
        field4954 = null;
    }

    @OriginalMember(owner = "client!hl", name = "b", descriptor = "(I)I", line = 33)
    public final int method998(int arg0) {
        ++field4951;
        return arg0 != -20737 ? -86 : this.field4950;
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(I)J", line = 44)
    public final long method997(int arg0) {
        ++field4957;
        if (arg0 != -19471) {
            this.method998(-16);
        }
        return super.field108.method2520();
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(IIIII)V", line = 61)
    public static final void method2133(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field4958;
        int var5 = -29 / ((arg1 - -12) / 37);
        int var6 = 0;
        int var7 = arg3;
        int var8 = -arg3;
        int var9 = -1;
        class427.method2465(class457.field6299[arg0], arg4 - -arg3, -arg3 + arg4, -7, arg2);
        while (var6 < var7) {
            var9 += 2;
            var8 += var9;
            ++var6;
            if (var8 >= 0) {
                --var7;
                var8 -= var7 << 1;
                int[] var10 = class457.field6299[arg0 + var7];
                int[] var11 = class457.field6299[-var7 + arg0];
                int var12 = arg4 + var6;
                int var13 = -var6 + arg4;
                class427.method2465(var10, var12, var13, -7, arg2);
                class427.method2465(var11, var12, var13, -7, arg2);
            }
            int var14 = arg4 + var7;
            int var15 = -var7 + arg4;
            int[] var16 = class457.field6299[arg0 + var6];
            int[] var17 = class457.field6299[arg0 - var6];
            class427.method2465(var16, var14, var15, -7, arg2);
            class427.method2465(var17, var14, var15, -7, arg2);
        }
    }

    @OriginalMember(owner = "client!hl", name = "b", descriptor = "(IIIII)V", line = 112)
    public static final void method2134(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field4948;
        for (int var5 = arg0; ~var5 > ~class210.field2871; ++var5) {
            Rectangle var6 = class108.field1564[var5];
            if (arg1 < var6.x - -var6.width && ~(arg1 - -arg2) < ~var6.x && ~(var6.y + var6.height) < ~arg3 && ~(arg3 + arg4) < ~var6.y) {
                class204.field2824[var5] = true;
            }
        }
    }

    @OriginalMember(owner = "client!hl", name = "<init>", descriptor = "(Lbo;I[BI)V", line = 141)
    public class366(class511 arg0, int arg1, byte[] arg2, int arg3) {
        super(arg0, arg2, arg3);
        this.field4950 = arg1;
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(B)I", line = 150)
    public final int method995(byte arg0) {
        ++field4947;
        return arg0 != -40 ? 100 : 0;
    }
}
