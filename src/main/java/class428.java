import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sj")
public class class428 extends class664 implements class510 {

    @OriginalMember(owner = "client!sj", name = "h", descriptor = "I")
    private int field6171;

    @OriginalMember(owner = "client!sj", name = "c", descriptor = "I")
    public static int field6166;

    @OriginalMember(owner = "client!sj", name = "d", descriptor = "I")
    public static int field6167;

    @OriginalMember(owner = "client!sj", name = "g", descriptor = "I")
    public static int field6170;

    @OriginalMember(owner = "client!sj", name = "i", descriptor = "I")
    public static int field6172;

    @OriginalMember(owner = "client!sj", name = "j", descriptor = "I")
    public static int field6173;

    @OriginalMember(owner = "client!sj", name = "k", descriptor = "I")
    public static int field6174;

    @OriginalMember(owner = "client!sj", name = "l", descriptor = "I")
    public static int field6175;

    @OriginalMember(owner = "client!sj", name = "m", descriptor = "I")
    public static int field6176;

    @OriginalMember(owner = "client!sj", name = "e", descriptor = "Laa;")
    public static class454 field6168;

    @OriginalMember(owner = "client!sj", name = "f", descriptor = "Lri;")
    public static class97 field6169;

    @OriginalMember(owner = "client!sj", name = "b", descriptor = "(I)V")
    public static void method2604(int arg0) {
        if (arg0 == 65535) {
            field6168 = null;
            field6169 = null;
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(I)I")
    public final int method1997(int arg0) {
        int var2 = -123 % ((-74 - arg0) / 37);
        ++field6167;
        return this.field6171;
    }

    @OriginalMember(owner = "client!sj", name = "b", descriptor = "(B)I")
    public final int method1999(byte arg0) {
        ++field6176;
        if (arg0 != -71) {
            this.field6171 = -118;
        }
        return 0;
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(B)J")
    public final long method2001(byte arg0) {
        ++field6175;
        if (arg0 >= -97) {
            this.field6171 = -10;
        }
        return super.field9543.getAddress();
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIILjava/lang/String;)V")
    public static final void method2605(String arg0, String arg1, String arg2, int arg3, int arg4, int arg5, String arg6) {
        if (arg5 != 4096) {
            method2604(-43);
        }
        class569.method3285(false, arg0, -1, arg1, arg2, arg4, arg6, arg3, (String) null);
        ++field6173;
    }

    @OriginalMember(owner = "client!sj", name = "<init>", descriptor = "(Lus;I[BI)V")
    public class428(class1 arg0, int arg1, byte[] arg2, int arg3) {
        super(arg0, arg2, arg3);
        this.field6171 = arg1;
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "([BIIB)V")
    public final void method2000(byte[] arg0, int arg1, int arg2, byte arg3) {
        this.method3771(arg0, arg1);
        if (arg3 <= -55) {
            ++field6174;
            this.field6171 = arg2;
        }
    }

    @OriginalMember(owner = "client!sj", name = "<init>", descriptor = "(Lus;ILjaclib/memory/Buffer;)V")
    public class428(class1 arg0, int arg1, Buffer arg2) {
        super(arg0, arg2);
        this.field6171 = arg1;
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(JIILlk;Lua;IIII)V")
    public static final void method2606(long arg0, int arg1, int arg2, class545 arg3, class619 arg4, int arg5, int arg6, int arg7, int arg8) {
        ++field6170;
        int var10 = arg8 * arg8 - -(arg5 * arg5);
        if (~((long) var10) >= ~arg0) {
            int var11 = Math.min(arg3.field7718 / 2, arg3.field7652 / 2);
            if (~(var11 * var11) <= ~var10) {
                class36.method533(arg3, arg5, 15687, arg6, arg8, arg4, class598.field8574[arg7], arg2);
            } else {
                var11 -= 10;
                int var12;
                if (~class423.field6123 != -5) {
                    var12 = (int) class591.field8509 + class527.field7433 & 16383;
                } else {
                    var12 = 16383 & (int) class591.field8509;
                }
                int var13 = class509.field7210[var12];
                int var14 = class509.field7220[var12];
                if (class423.field6123 != 4) {
                    var14 = var14 * 256 / (class130.field2350 + 256);
                    var13 = var13 * 256 / (class130.field2350 + 256);
                }
                int var15 = arg5 * var13 + arg8 * var14 >> 14;
                int var16 = arg5 * var14 + -(arg8 * var13) >> 14;
                double var17 = Math.atan2((double) var15, (double) var16);
                int var19 = (int) ((double) var11 * Math.sin(var17));
                int var20 = (int) ((double) var11 * Math.cos(var17));
                class419.field6046[arg7].method3917((float) arg3.field7718 / 2.0F + (float) arg2 + (float) var19, (float) arg3.field7652 / 2.0F + (float) arg6 - (float) var20, 4096, (int) (-var17 / 6.283185307179586D * 65535.0D));
            }
            if (arg1 != 4096) {
                field6169 = null;
            }
        }
    }
}
