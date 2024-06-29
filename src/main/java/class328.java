import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qi")
public class class328 extends class313 {

    @OriginalMember(owner = "client!qi", name = "N", descriptor = "I")
    private int field5220;

    @OriginalMember(owner = "client!qi", name = "J", descriptor = "Z")
    public static boolean field5216 = true;

    @OriginalMember(owner = "client!qi", name = "U", descriptor = "[I")
    public static int[] field5227 = new int[100];

    @OriginalMember(owner = "client!qi", name = "I", descriptor = "I")
    public static int field5215;

    @OriginalMember(owner = "client!qi", name = "K", descriptor = "I")
    public static int field5217;

    @OriginalMember(owner = "client!qi", name = "L", descriptor = "I")
    public static int field5218;

    @OriginalMember(owner = "client!qi", name = "M", descriptor = "I")
    public static int field5219;

    @OriginalMember(owner = "client!qi", name = "O", descriptor = "I")
    public static int field5221;

    @OriginalMember(owner = "client!qi", name = "Q", descriptor = "I")
    public static int field5223;

    @OriginalMember(owner = "client!qi", name = "R", descriptor = "I")
    public static int field5224;

    @OriginalMember(owner = "client!qi", name = "T", descriptor = "Lnn;")
    public static class45 field5226;

    @OriginalMember(owner = "client!qi", name = "P", descriptor = "[Lgh;")
    public static class250[] field5222;

    @OriginalMember(owner = "client!qi", name = "S", descriptor = "[S")
    public static short[] field5225;

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(IILpi;)V", line = 4)
    public final void method185(int arg0, int arg1, class336 arg2) {
        if (arg1 != -17848) {
            method2276((byte) -108, 61L);
        }
        field5219++;
        if (arg0 == 0) {
            this.field5220 = (arg2.method2364(arg1 + 8779) << 12) / 255;
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(BJ)V", line = 38)
    public static final void method2276(byte arg0, long arg1) {
        field5218++;
        try {
            if (arg0 >= -87) {
                return;
            }
            Thread.sleep(arg1);
        } catch (InterruptedException var4) {
        }
    }

    @OriginalMember(owner = "client!qi", name = "b", descriptor = "(II)[I", line = 55)
    public final int[] method111(int arg0, int arg1) {
        field5215++;
        if (arg0 != 4) {
            method2278(-92, -111);
        }
        int[] var3 = this.field4961.method1520(-1908965694, arg1);
        if (this.field4961.field3451) {
            class345.method2422(var3, 0, class133.field2269, this.field5220);
        }
        return var3;
    }

    @OriginalMember(owner = "client!qi", name = "b", descriptor = "(Z)V", line = 77)
    public static void method2277(boolean arg0) {
        field5222 = null;
        field5226 = null;
        if (arg0) {
            method2276((byte) -44, 55L);
        }
        field5225 = null;
        field5227 = null;
    }

    @OriginalMember(owner = "client!qi", name = "<init>", descriptor = "(I)V", line = 94)
    public class328(int arg0) {
        super(0, true);
        this.field5220 = 4096;
        this.field5220 = arg0;
    }

    @OriginalMember(owner = "client!qi", name = "<init>", descriptor = "()V", line = 107)
    public class328() {
        this(4096);
    }

    @OriginalMember(owner = "client!qi", name = "c", descriptor = "(II)I", line = 111)
    public static final int method2278(int arg0, int arg1) {
        field5224++;
        if (arg0 != 255) {
            field5225 = (short[]) null;
        }
        return arg1 & 0xFF;
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(IIIIIIIIIIBII)V", line = 123)
    public static final void method2279(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, byte arg10, int arg11, int arg12) {
        field5217++;
        class121 var13 = new class121();
        var13.field2103 = arg3;
        var13.field2104 = arg2;
        var13.field2108 = arg0;
        if (arg10 != -14) {
            method2278(54, -36);
        }
        var13.field2095 = arg6;
        var13.field2107 = arg11;
        var13.field2106 = arg5;
        var13.field2101 = arg9;
        var13.field2111 = arg7;
        var13.field2113 = arg12;
        var13.field2097 = arg4;
        var13.field2114 = arg8;
        var13.field2102 = arg1;
        class85.field1366.method2303((byte) -124, var13);
    }
}
