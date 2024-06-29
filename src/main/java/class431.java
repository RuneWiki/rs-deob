import jaggl.memory.NativeBuffer;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gj")
public class class431 extends class346 implements class511 {

    @OriginalMember(owner = "client!gj", name = "d", descriptor = "I")
    private int field6328;

    @OriginalMember(owner = "client!gj", name = "g", descriptor = "[I")
    public static int[] field6331 = new int[] { 104, 120, 136, 168 };

    @OriginalMember(owner = "client!gj", name = "f", descriptor = "I")
    public static int field6330 = 0;

    @OriginalMember(owner = "client!gj", name = "k", descriptor = "[I")
    public static int[] field6335 = new int[8];

    @OriginalMember(owner = "client!gj", name = "c", descriptor = "I")
    public static int field6327;

    @OriginalMember(owner = "client!gj", name = "e", descriptor = "I")
    public static int field6329;

    @OriginalMember(owner = "client!gj", name = "h", descriptor = "I")
    public static int field6332;

    @OriginalMember(owner = "client!gj", name = "i", descriptor = "I")
    public static int field6333;

    @OriginalMember(owner = "client!gj", name = "j", descriptor = "I")
    public static int field6334;

    @OriginalMember(owner = "client!gj", name = "l", descriptor = "I")
    public static int field6336;

    @OriginalMember(owner = "client!gj", name = "m", descriptor = "I")
    public static int field6337;

    @OriginalMember(owner = "client!gj", name = "c", descriptor = "(I)V", line = 3)
    public static void method2558(int arg0) {
        field6335 = null;
        field6331 = null;
        if (arg0 != 120) {
            method2559(96, 89, -17, -88, 68, -126, -98, -35);
        }
    }

    @OriginalMember(owner = "client!gj", name = "<init>", descriptor = "(Lrl;I[BI)V", line = 19)
    public class431(class487 arg0, int arg1, byte[] arg2, int arg3) {
        super(arg0, arg2, arg3);
        this.field6328 = arg1;
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(II[BZ)V", line = 28)
    public final void method2187(int arg0, int arg1, byte[] arg2, boolean arg3) {
        this.method2083(arg2, arg0);
        if (arg3) {
            field6335 = null;
        }
        ++field6329;
        this.field6328 = arg1;
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(IIIIIIII)V", line = 40)
    public static final void method2559(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg2 != -16358) {
            field6335 = null;
        }
        if (~class473.field6839 >= ~arg0 && ~arg1 >= ~class63.field933 && ~arg5 <= ~class7.field131 && arg7 <= class92.field1252) {
            class193.method1214(-124, arg6, arg7, arg3, arg1, arg0, arg4, arg5);
        } else {
            class456.method2658((byte) 16, arg7, arg6, arg0, arg1, arg4, arg5, arg3);
        }
        ++field6333;
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(B)I", line = 59)
    public final int method2186(byte arg0) {
        if (arg0 != 74) {
            return 14;
        } else {
            ++field6337;
            return 0;
        }
    }

    @OriginalMember(owner = "client!gj", name = "b", descriptor = "(I)I", line = 78)
    public final int method2182(int arg0) {
        ++field6334;
        return arg0 != -20232 ? 49 : this.field6328;
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(IZ)V", line = 93)
    public static final void method2560(int arg0, boolean arg1) {
        class498.method2992(0);
        ++field6336;
        if (class323.field4729 == 30 || ~class323.field4729 == -26) {
            ++class34.field552;
            if (class34.field552 >= 50 || arg1) {
                class34.field552 = 0;
                if (arg0 != 7919) {
                    method2558(-62);
                }
                if (!class450.field6555 && class22.field294 != null) {
                    class386.method2321(true, class229.field3212);
                    ++class181.field2588;
                    try {
                        class22.field294.method2121(class79.field1108.field2018, class79.field1108.field2041, false, 0);
                        class79.field1108.field2018 = 0;
                    } catch (IOException var2) {
                        class450.field6555 = true;
                    }
                }
                class498.method2992(arg0 + -7919);
            }
        }
    }

    @OriginalMember(owner = "client!gj", name = "<init>", descriptor = "(Lrl;ILjaggl/memory/NativeBuffer;)V", line = 126)
    public class431(class487 arg0, int arg1, NativeBuffer arg2) {
        super(arg0, arg2);
        this.field6328 = arg1;
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(I)J", line = 134)
    public final long method2183(int arg0) {
        ++field6327;
        if (arg0 != 28914) {
            method2559(-39, 2, 66, -88, -85, 117, 95, 42);
        }
        return super.field4998.method2508();
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(BLae;)Ljava/lang/String;", line = 151)
    public static final String method2561(byte arg0, class156 arg1) {
        if (arg0 <= 118) {
            field6331 = null;
        }
        ++field6332;
        return class469.method2748(arg1, 32767, (byte) 113);
    }
}
