import jaggl.memory.NativeBuffer;
import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uq")
public class class114 extends class102 implements class118 {

    @OriginalMember(owner = "client!uq", name = "q", descriptor = "I")
    private int field2055;

    @OriginalMember(owner = "client!uq", name = "z", descriptor = "[Z")
    public static boolean[] field2064 = new boolean[200];

    @OriginalMember(owner = "client!uq", name = "y", descriptor = "I")
    public static int field2063 = 0;

    @OriginalMember(owner = "client!uq", name = "A", descriptor = "I")
    public static int field2065 = -1;

    @OriginalMember(owner = "client!uq", name = "p", descriptor = "I")
    public static int field2054;

    @OriginalMember(owner = "client!uq", name = "r", descriptor = "I")
    public static int field2056;

    @OriginalMember(owner = "client!uq", name = "s", descriptor = "I")
    public static int field2057;

    @OriginalMember(owner = "client!uq", name = "t", descriptor = "I")
    public static int field2058;

    @OriginalMember(owner = "client!uq", name = "u", descriptor = "I")
    public static int field2059;

    @OriginalMember(owner = "client!uq", name = "v", descriptor = "I")
    public static int field2060;

    @OriginalMember(owner = "client!uq", name = "w", descriptor = "I")
    public static int field2061;

    @OriginalMember(owner = "client!uq", name = "x", descriptor = "I")
    public static int field2062;

    @OriginalMember(owner = "client!uq", name = "g", descriptor = "(I)V")
    public static void method946(int arg0) {
        field2064 = null;
        if (arg0 != 34962) {
            field2065 = 117;
        }
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(ILlt;ILjava/awt/Canvas;Ll;)Lza;")
    public static final class288 method947(int arg0, class480 arg1, int arg2, Canvas arg3, class16 arg4) {
        ++field2056;
        if (arg2 != 631718081) {
            method947(50, (class480) null, 94, (Canvas) null, (class16) null);
        }
        return new class197(arg0, arg3, arg4, arg1);
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(IBIIII)V")
    public static final void method948(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field2054;
        int var6 = 0;
        int var7 = arg3;
        int var8 = arg4 * arg4;
        int var9 = arg3 * arg3;
        int var10 = var9 << 1;
        int var11 = var8 << 1;
        int var12 = arg3 << 1;
        int var13 = (-var12 + 1) * var8 - -var10;
        int var14 = -((var12 - 1) * var11) + var9;
        int var15 = var8 << 2;
        int var16 = var9 << 2;
        int var17 = ((var6 << 1) + 3) * var10;
        int var18 = ((arg3 << 1) + -3) * var11;
        int var19 = (var6 + 1) * var16;
        if (arg1 == -127) {
            int var20 = (arg3 - 1) * var15;
            if (~arg0 <= ~class372.field5455 && ~arg0 >= ~class216.field3415) {
                int var21 = class73.method640(class43.field600, (byte) -82, class467.field6940, arg2 - -arg4);
                int var22 = class73.method640(class43.field600, (byte) -127, class467.field6940, arg2 - arg4);
                class503.method3027(var22, (byte) 127, var21, arg5, class316.field4797[arg0]);
            }
            while (~var7 < -1) {
                if (var13 < 0) {
                    while (~var13 > -1) {
                        var14 += var19;
                        var13 += var17;
                        var17 += var16;
                        var19 += var16;
                        ++var6;
                    }
                }
                if (~var14 > -1) {
                    var14 += var19;
                    var13 += var17;
                    ++var6;
                    var19 += var16;
                    var17 += var16;
                }
                var14 += -var18;
                var13 += -var20;
                --var7;
                var20 -= var15;
                var18 -= var15;
                int var23 = arg0 - var7;
                int var24 = arg0 + var7;
                if (~class372.field5455 >= ~var24 && ~class216.field3415 <= ~var23) {
                    int var25 = class73.method640(class43.field600, (byte) -121, class467.field6940, arg2 + var6);
                    int var26 = class73.method640(class43.field600, (byte) -115, class467.field6940, arg2 - var6);
                    if (~var23 <= ~class372.field5455) {
                        class503.method3027(var26, (byte) 127, var25, arg5, class316.field4797[var23]);
                    }
                    if (~class216.field3415 <= ~var24) {
                        class503.method3027(var26, (byte) 127, var25, arg5, class316.field4797[var24]);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(BLsb;Lza;)I")
    public static final int method949(byte arg0, class193 arg1, class288 arg2) {
        if (arg0 <= 17) {
            method947(27, (class480) null, -62, (Canvas) null, (class16) null);
        }
        ++field2061;
        if (~arg1.field3109 == 0) {
            if (arg1.field3121 != -1) {
                class486 var3 = arg2.field4358.method105(-126, arg2.method421() ? arg1.field3121 : arg1.field3115);
                if (!var3.field7149) {
                    return var3.field7152;
                }
            }
            return arg1.field3114;
        } else {
            return arg1.field3109;
        }
    }

    @OriginalMember(owner = "client!uq", name = "f", descriptor = "(I)V")
    public final void method897(int arg0) {
        super.field1939.method319(this, (byte) -28);
        if (arg0 >= -85) {
            field2065 = 20;
        }
        ++field2058;
    }

    @OriginalMember(owner = "client!uq", name = "c", descriptor = "(I)J")
    public final long method950(int arg0) {
        if (arg0 != 29002) {
            field2064 = null;
        }
        ++field2060;
        return 0L;
    }

    @OriginalMember(owner = "client!uq", name = "<init>", descriptor = "(Lda;ILjaggl/memory/NativeBuffer;IZ)V")
    public class114(class44 arg0, int arg1, NativeBuffer arg2, int arg3, boolean arg4) {
        super(arg0, 34962, arg2, arg3, arg4);
        this.field2055 = arg1;
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "([BIII)V")
    public final void method951(byte[] arg0, int arg1, int arg2, int arg3) {
        this.method894(arg0, arg1 + -16821, arg2);
        ++field2062;
        if (arg1 != 16700) {
            this.field2055 = 7;
        }
        this.field2055 = arg3;
    }

    @OriginalMember(owner = "client!uq", name = "<init>", descriptor = "(Lda;I[BIZ)V")
    public class114(class44 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        super(arg0, 34962, arg2, arg3, arg4);
        this.field2055 = arg1;
    }

    @OriginalMember(owner = "client!uq", name = "b", descriptor = "(I)I")
    public final int method952(int arg0) {
        if (arg0 != 22081) {
            return -28;
        } else {
            ++field2059;
            return this.field2055;
        }
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(I)I")
    public final int method953(int arg0) {
        ++field2057;
        if (arg0 != -28043) {
            this.method951((byte[]) null, 49, 113, 22);
        }
        return super.field1935;
    }
}
