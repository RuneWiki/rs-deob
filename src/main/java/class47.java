import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gp")
public class class47 extends class623 {

    @OriginalMember(owner = "client!gp", name = "A", descriptor = "Z")
    public static boolean field512 = false;

    @OriginalMember(owner = "client!gp", name = "w", descriptor = "[I")
    public static int[] field508 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @OriginalMember(owner = "client!gp", name = "v", descriptor = "I")
    public int field507;

    @OriginalMember(owner = "client!gp", name = "x", descriptor = "I")
    public static int field509;

    @OriginalMember(owner = "client!gp", name = "y", descriptor = "I")
    public static int field510;

    @OriginalMember(owner = "client!gp", name = "C", descriptor = "I")
    public int field514;

    @OriginalMember(owner = "client!gp", name = "D", descriptor = "I")
    public static int field515;

    @OriginalMember(owner = "client!gp", name = "E", descriptor = "I")
    public static int field516;

    @OriginalMember(owner = "client!gp", name = "F", descriptor = "I")
    public static int field517;

    @OriginalMember(owner = "client!gp", name = "G", descriptor = "I")
    public static int field518;

    @OriginalMember(owner = "client!gp", name = "H", descriptor = "I")
    public int field519;

    @OriginalMember(owner = "client!gp", name = "I", descriptor = "I")
    public static int field520;

    @OriginalMember(owner = "client!gp", name = "J", descriptor = "I")
    public static int field521;

    @OriginalMember(owner = "client!gp", name = "K", descriptor = "I")
    public static int field522;

    @OriginalMember(owner = "client!gp", name = "z", descriptor = "Lur;")
    public static class535 field511;

    @OriginalMember(owner = "client!gp", name = "B", descriptor = "Ljava/lang/String;")
    public String field513;

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(IILwi;)Z", line = 4)
    public static final boolean method268(int arg0, int arg1, class464 arg2) {
        class477.field6791.method1030(arg2.field6627[arg1], arg2.field6625[arg1], arg2.field6635[arg1], class397.field5436);
        ++field518;
        if (arg0 != 67108863) {
            return true;
        } else {
            int var3 = class397.field5436[2];
            if (var3 < 50) {
                return false;
            } else {
                arg2.field6632[arg1] = (short) (class397.field5436[0] * class225.field2578 / var3 + class324.field4138);
                arg2.field6626[arg1] = (short) (class397.field5436[1] * class135.field1524 / var3 + class10.field75);
                arg2.field6628[arg1] = (short) var3;
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!gp", name = "b", descriptor = "(B)V", line = 33)
    public static void method269(byte arg0) {
        field508 = null;
        field511 = null;
        if (arg0 > -39) {
            field512 = true;
        }
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(ZIBIZ)V", line = 47)
    public static final void method270(boolean arg0, int arg1, byte arg2, int arg3, boolean arg4) {
        if (arg2 >= -119) {
            method269((byte) -115);
        }
        class396.method2426(79, 0, arg1, arg3, arg4, class476.field6778.length - 1, arg0);
        ++field521;
        class446.field6454 = 0;
        class515.field7345 = null;
    }

    @OriginalMember(owner = "client!gp", name = "c", descriptor = "(B)V", line = 65)
    public final void method271(byte arg0) {
        ++field520;
        if (arg0 < 122) {
            this.method275((byte) 123);
        }
        super.field8919 |= Long.MIN_VALUE;
        if (~this.method277((byte) 12) == -1L) {
            class348.field4496.method2068(-127, this);
        }
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(IIIIBILha;I)V", line = 87)
    public static final void method272(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, class58 arg6, int arg7) {
        arg6.method410(arg5, arg3, arg2, -61, arg0, arg1);
        if (arg4 >= -108) {
            method272(77, -10, 96, -107, (byte) -57, 66, (class58) null, -28);
        }
        ++field517;
        arg6.method410(arg7, arg3 + 1, 16, -83, arg0 - -1, arg1 + -2);
        arg6.method371(arg3 - -1, arg0 - -18, arg7, arg2 + -19, 1, arg1 - 2);
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(IBI)Z", line = 100)
    public static final boolean method273(int arg0, byte arg1, int arg2) {
        if (arg1 <= 81) {
            method268(-96, -119, (class464) null);
        }
        ++field509;
        return (arg0 & 458752) != 0 | class357.method2097(arg0, (byte) -109, arg2) || class78.method554(arg0, arg2, 0);
    }

    @OriginalMember(owner = "client!gp", name = "b", descriptor = "(Z)V", line = 111)
    public final void method274(boolean arg0) {
        if (!arg0) {
            super.field8919 = super.field8919 & Long.MIN_VALUE | class652.method3700(-1) + 500L;
            ++field516;
            class655.field9350.method2068(-127, this);
        }
    }

    @OriginalMember(owner = "client!gp", name = "<init>", descriptor = "(II)V", line = 122)
    public class47(int arg0, int arg1) {
        super.field1522 = (long) arg0 << 32 | (long) arg1;
    }

    @OriginalMember(owner = "client!gp", name = "d", descriptor = "(B)I", line = 130)
    public final int method275(byte arg0) {
        if (arg0 != 77) {
            field508 = null;
        }
        ++field510;
        return (int) super.field1522;
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(I)I", line = 141)
    public final int method276(int arg0) {
        if (arg0 <= 115) {
            method269((byte) 37);
        }
        ++field522;
        return (int) (255L & super.field1522 >>> 32);
    }

    @OriginalMember(owner = "client!gp", name = "e", descriptor = "(B)J", line = 152)
    public final long method277(byte arg0) {
        ++field515;
        if (arg0 != 12) {
            method270(true, -91, (byte) 96, -125, false);
        }
        return Long.MAX_VALUE & super.field8919;
    }
}
