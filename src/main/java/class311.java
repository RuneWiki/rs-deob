import jaclib.memory.Buffer;
import jaclib.memory.Source;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hd")
public class class311 extends class422 implements class269 {

    @OriginalMember(owner = "client!hd", name = "y", descriptor = "Lme;")
    public static class668 field4034 = new class668(10);

    @OriginalMember(owner = "client!hd", name = "D", descriptor = "Lra;")
    public static class361 field4039 = new class361(9, 5);

    @OriginalMember(owner = "client!hd", name = "v", descriptor = "I")
    public static int field4031;

    @OriginalMember(owner = "client!hd", name = "w", descriptor = "I")
    public static int field4032;

    @OriginalMember(owner = "client!hd", name = "x", descriptor = "I")
    public static int field4033;

    @OriginalMember(owner = "client!hd", name = "z", descriptor = "I")
    public static int field4035;

    @OriginalMember(owner = "client!hd", name = "A", descriptor = "I")
    public static int field4036;

    @OriginalMember(owner = "client!hd", name = "B", descriptor = "I")
    public static int field4037;

    @OriginalMember(owner = "client!hd", name = "C", descriptor = "I")
    public static int field4038;

    @OriginalMember(owner = "client!hd", name = "F", descriptor = "I")
    public static int field4041;

    @OriginalMember(owner = "client!hd", name = "E", descriptor = "[I")
    public static int[] field4040;

    @OriginalMember(owner = "client!hd", name = "<init>", descriptor = "(Lia;Z)V", line = 3)
    public class311(class27 arg0, boolean arg1) {
        super(arg0, 34962, arg1);
    }

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "(I)Z", line = 7)
    public final boolean method646(int arg0) {
        field4041++;
        return arg0 >= -100 ? true : super.method646(-121);
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(IILjaclib/memory/Source;I)Z", line = 20)
    public final boolean method643(int arg0, int arg1, Source arg2, int arg3) {
        field4033++;
        if (arg1 == 2106) {
            super.method2432(arg0, arg2, true);
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(ZZ)Ljaclib/memory/Buffer;", line = 36)
    public final Buffer method647(boolean arg0, boolean arg1) {
        if (arg0) {
            field4034 = null;
        }
        field4038++;
        return super.method647(false, arg1);
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(IZII)I", line = 49)
    public static final int method1809(int arg0, boolean arg1, int arg2, int arg3) {
        if (arg0 > 243) {
            arg2 >>= 0x4;
        } else if (arg0 > 217) {
            arg2 >>= 0x3;
        } else if (arg0 > 192) {
            arg2 >>= 0x2;
        } else if (arg0 > 179) {
            arg2 >>= 0x1;
        }
        if (arg1) {
            return -61;
        } else {
            field4031++;
            return (arg0 >> 1) + ((arg3 & 0xFF) >> 2 << 10) + (arg2 >> 5 << 7);
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(BII)Z", line = 79)
    public final boolean method649(byte arg0, int arg1, int arg2) {
        super.method2429(arg2, (byte) -48);
        field4035++;
        if (arg0 < 83) {
            field4039 = null;
        }
        return true;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(Z)I", line = 96)
    public final int method648(boolean arg0) {
        if (arg0) {
            field4037++;
            return super.method648(true);
        } else {
            return -100;
        }
    }

    @OriginalMember(owner = "client!hd", name = "c", descriptor = "(I)V", line = 108)
    public static void method1810(int arg0) {
        field4040 = null;
        if (arg0 != -28627) {
            method1809(-37, false, -14, -98);
        }
        field4034 = null;
        field4039 = null;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(IIIIIIII)V", line = 126)
    public static final void method1811(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field4036++;
        int var8 = arg2 - 334;
        if (arg6 <= 121) {
            field4039 = null;
        }
        if (var8 < 0) {
            var8 = 0;
        } else if (var8 > 100) {
            var8 = 100;
        }
        int var9 = class93.field1236 + ((class119.field1546 - class93.field1236) * var8 / 100);
        int var10 = arg4 * var9 >> 8;
        int var11 = 16384 - arg3 & 0x3FFF;
        int var12 = 16384 - arg5 & 0x3FFF;
        int var13 = 0;
        int var14 = 0;
        int var15 = var10;
        if (var11 != 0) {
            var14 = class237.field3193[var11] * -var10 >> 14;
            var15 = class237.field3196[var11] * var10 >> 14;
        }
        if (var12 != 0) {
            var13 = class237.field3193[var12] * var15 >> 14;
            var15 = class237.field3196[var12] * var15 >> 14;
        }
        class499.field6555 = arg1 - var13;
        class358.field4639 = arg5;
        class549.field7132 = arg7 - var15;
        class470.field6146 = 0;
        class299.field3911 = arg3;
        class655.field9120 = arg0 - var14;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(I)V", line = 183)
    public final void method645(int arg0) {
        super.method645(-128);
        int var2 = -95 / ((arg0 - 37) / 36);
        field4032++;
    }
}
