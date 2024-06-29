import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!od")
public class class677 extends class619 {

    @OriginalMember(owner = "client!od", name = "f", descriptor = "Lqaa;")
    public class309 field9337;

    @OriginalMember(owner = "client!od", name = "j", descriptor = "Lra;")
    public static class361 field9341 = new class361(110, 5);

    @OriginalMember(owner = "client!od", name = "l", descriptor = "[I")
    public static int[] field9343 = new int[14];

    @OriginalMember(owner = "client!od", name = "m", descriptor = "I")
    public static int field9344 = 0;

    @OriginalMember(owner = "client!od", name = "e", descriptor = "I")
    public static int field9336;

    @OriginalMember(owner = "client!od", name = "g", descriptor = "I")
    public static int field9338;

    @OriginalMember(owner = "client!od", name = "h", descriptor = "I")
    public static int field9339;

    @OriginalMember(owner = "client!od", name = "i", descriptor = "I")
    public static int field9340;

    @OriginalMember(owner = "client!od", name = "k", descriptor = "I")
    public static int field9342;

    @OriginalMember(owner = "client!od", name = "b", descriptor = "(Z)Ljba;")
    public static final class138 method3721(boolean arg0) {
        class636.field8842 = 0;
        field9338++;
        if (!arg0) {
            field9343 = null;
        }
        return class368.method2120(false);
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(II)I")
    public static final int method3722(int arg0, int arg1) {
        field9342++;
        int var2 = (arg1 & arg0) + (arg0 >>> 1 & 0xD5555555);
        int var3 = ((var2 & 0xCCCCCCCE) >>> 2) + (var2 & 0x33333333);
        int var4 = (var3 >>> 4) + var3 & 0xF0F0F0F;
        int var5 = (var4 >>> 8) + var4;
        int var6 = (var5 >>> 16) + var5;
        return var6 & 0xFF;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(IIILtc;)V")
    public static final void method3723(int arg0, int arg1, int arg2, class477 arg3) {
        field9336++;
        if (~arg3.field6288 == arg0) {
            arg3.field6303 = arg3.field6349;
        } else if (arg3.field6288 == 1) {
            arg3.field6303 = (arg1 - arg3.field6224) / 2 + arg3.field6349;
        } else if (arg3.field6288 == 2) {
            arg3.field6303 = arg1 - arg3.field6349 - arg3.field6224;
        } else if (arg3.field6288 == 3) {
            arg3.field6303 = arg3.field6349 * arg1 >> 14;
        } else if (arg3.field6288 == 4) {
            arg3.field6303 = (arg3.field6349 * arg1 >> 14) + (arg1 - arg3.field6224) / 2;
        } else {
            arg3.field6303 = arg1 - arg3.field6224 - (arg3.field6349 * arg1 >> 14);
        }
        if (arg3.field6243 == 0) {
            arg3.field6286 = arg3.field6238;
        } else if (arg3.field6243 == 1) {
            arg3.field6286 = (arg2 - arg3.field6372) / 2 + arg3.field6238;
        } else if (arg3.field6243 == 2) {
            arg3.field6286 = arg2 - arg3.field6372 - arg3.field6238;
        } else if (arg3.field6243 == 3) {
            arg3.field6286 = arg3.field6238 * arg2 >> 14;
        } else if (arg3.field6243 == 4) {
            arg3.field6286 = (arg3.field6238 * arg2 >> 14) + (arg2 - arg3.field6372) / 2;
        } else {
            arg3.field6286 = arg2 - (arg3.field6238 * arg2 >> 14) - arg3.field6372;
        }
        if (!class100.field1336 || client.method696(arg3).field2020 == 0 && arg3.field6312 != 0) {
            return;
        }
        if (arg3.field6286 < 0) {
            arg3.field6286 = 0;
        } else if (arg2 < arg3.field6372 + arg3.field6286) {
            arg3.field6286 = arg2 - arg3.field6372;
        }
        if (arg3.field6303 < 0) {
            arg3.field6303 = 0;
        } else if (arg3.field6303 + arg3.field6224 > arg1) {
            arg3.field6303 = arg1 - arg3.field6224;
            return;
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(B)V")
    public static void method3724(byte arg0) {
        field9341 = null;
        int var1 = -22 % ((45 - arg0) / 35);
        field9343 = null;
    }

    @OriginalMember(owner = "client!od", name = "<init>", descriptor = "(Lfc;II[B)V")
    public class677(class575 arg0, int arg1, int arg2, byte[] arg3) {
        this.field9337 = arg0.method3139(arg1, arg3, (byte) 33, false, arg2, class228.field3042);
        this.field9337.method1133(false, false, 19263);
    }

    @OriginalMember(owner = "client!od", name = "<init>", descriptor = "(Lfc;II[I)V")
    public class677(class575 arg0, int arg1, int arg2, int[] arg3) {
        this.field9337 = arg0.method3078(arg3, arg2, 82, arg1, false);
        this.field9337.method1133(false, false, 19263);
    }
}
