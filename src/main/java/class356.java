import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nl")
public class class356 extends class238 {

    @OriginalMember(owner = "client!nl", name = "m", descriptor = "[I")
    public static int[] field5141 = new int[14];

    @OriginalMember(owner = "client!nl", name = "o", descriptor = "Lo;")
    public static class24 field5143 = new class24("LIVE", 0);

    @OriginalMember(owner = "client!nl", name = "r", descriptor = "I")
    public static int field5146 = 0;

    @OriginalMember(owner = "client!nl", name = "n", descriptor = "I")
    public static int field5142;

    @OriginalMember(owner = "client!nl", name = "p", descriptor = "I")
    public static int field5144;

    @OriginalMember(owner = "client!nl", name = "s", descriptor = "I")
    public static int field5147;

    @OriginalMember(owner = "client!nl", name = "t", descriptor = "I")
    public static int field5148;

    @OriginalMember(owner = "client!nl", name = "u", descriptor = "I")
    public static int field5149;

    @OriginalMember(owner = "client!nl", name = "v", descriptor = "I")
    public static int field5150;

    @OriginalMember(owner = "client!nl", name = "q", descriptor = "Ltr;")
    public class176 field5145;

    @OriginalMember(owner = "client!nl", name = "l", descriptor = "Z")
    public boolean field5140;

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
    public static final String method2215(int arg0, String arg1) {
        field5148++;
        String var2 = class420.method2471(arg0 ^ 0x7, class240.method1523(arg1, (byte) 124));
        if (arg0 != 1) {
            method2217((byte[]) null, (byte) -109);
        }
        if (var2 == null) {
            var2 = "";
        }
        return var2;
    }

    @OriginalMember(owner = "client!nl", name = "b", descriptor = "(Z)V")
    public static void method2216(boolean arg0) {
        field5141 = null;
        if (!arg0) {
            field5143 = null;
        }
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "([BB)[B")
    public static final byte[] method2217(byte[] arg0, byte arg1) {
        field5144++;
        if (arg0 == null) {
            return null;
        }
        if (arg1 != -127) {
            field5146 = -94;
        }
        byte[] var2 = new byte[arg0.length];
        class415.method2448(arg0, 0, var2, 0, arg0.length);
        return var2;
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(Lb;II)Lrm;")
    public static final class259 method2218(class201 arg0, int arg1, int arg2) {
        field5142++;
        byte[] var3 = arg0.method1228(arg1, 114);
        if (var3 == null) {
            return null;
        } else {
            if (arg2 != 0) {
                field5141 = null;
            }
            return new class259(var3);
        }
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(IIII)V")
    public static final void method2219(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 == 0) {
            class131.field1715++;
            class15.method110(class240.field3592, -128);
        }
        field5149++;
        if (arg1 == 1) {
            class86.field1042++;
            class15.method110(class261.field3820, -125);
        }
        class225.field3415.method1718(class272.field3959.method2712(2, 82) ? 1 : 0, 32734);
        class225.field3415.method1694(class240.field3602 + arg0, 94);
        if (arg2 <= 55) {
            field5147 = 99;
        }
        class225.field3415.method1711(false, class360.field5180 + arg3);
        class359.field5161 = arg3;
        class118.field1493 = arg0;
        class326.field4710 = false;
        class401.method2394(0);
    }
}
