import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ca")
public class class113 extends class306 {

    @OriginalMember(owner = "client!ca", name = "J", descriptor = "I")
    private int field1573;

    @OriginalMember(owner = "client!ca", name = "G", descriptor = "I")
    public static int field1570;

    @OriginalMember(owner = "client!ca", name = "H", descriptor = "I")
    public static int field1571;

    @OriginalMember(owner = "client!ca", name = "I", descriptor = "I")
    public static int field1572;

    @OriginalMember(owner = "client!ca", name = "K", descriptor = "I")
    public static int field1574;

    @OriginalMember(owner = "client!ca", name = "L", descriptor = "I")
    public static int field1575;

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(II)[I", line = 9)
    public final int[] method47(int arg0, int arg1) {
        int[] var3 = this.field4757.method903(arg0, -91);
        if (arg1 != -1546337535) {
            return (int[]) null;
        }
        field1575++;
        if (this.field4757.field1898) {
            class8.method49(var3, 0, class31.field367, this.field1573);
        }
        return var3;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(III)J", line = 28)
    public static final long method730(int arg0, int arg1, int arg2) {
        class196 var3 = class194.field2947[arg0][arg1][arg2];
        return var3 == null || var3.field2999 == null ? 0L : var3.field2999.field1702;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(ILlf;I)V", line = 42)
    public final void method45(int arg0, class143 arg1, int arg2) {
        if (arg2 == 0) {
            this.field1573 = (arg1.method1043(true) << 12) / 255;
        }
        if (arg0 == -15334) {
            field1574++;
        }
    }

    @OriginalMember(owner = "client!ca", name = "<init>", descriptor = "(I)V", line = 63)
    public class113(int arg0) {
        super(0, true);
        this.field1573 = 4096;
        this.field1573 = arg0;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(IIFIIZII)[I", line = 76)
    public static final int[] method731(int arg0, int arg1, float arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7) {
        int[] var8 = new int[arg3];
        field1570++;
        if (arg7 != 4891) {
            return (int[]) null;
        }
        class101 var9 = new class101();
        var9.field1359 = arg0;
        var9.field1367 = (int) (arg2 * 4096.0F);
        var9.field1374 = arg1;
        var9.field1353 = arg6;
        var9.field1364 = arg5;
        var9.field1356 = arg4;
        var9.method43((byte) -120);
        class91.method572(1, -114, arg3);
        var9.method641(0, var8, -14118);
        return var8;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(IIIIIZILhi;)V", line = 108)
    public static final void method732(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, class323 arg7) {
        field1572++;
        if (class303.field4727) {
            class256.field4051 = 32;
        } else {
            class256.field4051 = 0;
        }
        class303.field4727 = arg5;
        if (class312.field4891 != 0) {
            if (arg4 >= arg1 && arg1 + 16 > arg4 && arg0 <= arg2 && arg0 + 16 > arg2) {
                arg7.field5188 -= 4;
                class107.method693(arg7, 6);
            } else if (arg1 <= arg4 && arg4 < (arg1 + 16) && (arg0 + arg3 - 16) <= arg2 && (arg0 + arg3) > arg2) {
                arg7.field5188 += 4;
                class107.method693(arg7, 6);
            } else if ((arg1 - class256.field4051) <= arg4 && arg4 < arg1 + class256.field4051 + 16 && (arg0 + 16) <= arg2 && arg2 < (arg0 + arg3 - 16)) {
                int var8 = (arg3 - 32) * arg3 / arg6;
                if (var8 < 8) {
                    var8 = 8;
                }
                int var9 = arg3 - var8 - 32;
                int var10 = arg2 - (var8 / 2) - arg0 - 16;
                arg7.field5188 = (arg6 - arg3) * var10 / var9;
                class107.method693(arg7, 6);
                class303.field4727 = true;
            }
        }
        if (class228.field3468 == 0) {
            return;
        }
        int var11 = arg7.field5169;
        if (arg4 >= (arg1 - var11) && arg0 <= arg2 && (arg1 + 16) > arg4 && arg0 + arg3 >= arg2) {
            arg7.field5188 += class228.field3468 * 45;
            class107.method693(arg7, 6);
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(IZ)Ls;", line = 173)
    public static final class303 method733(int arg0, boolean arg1) {
        field1571++;
        class303 var2 = (class303) class127.field1845.method1998(-1114531641, (long) arg0);
        if (var2 != null) {
            return var2;
        } else if (arg1) {
            byte[] var3 = class90.field1187.method100(11, arg0, (byte) -107);
            class303 var4 = new class303();
            if (var3 != null) {
                var4.method2136((byte) 90, new class143(var3));
            }
            class127.field1845.method2000(var4, (byte) -107, (long) arg0);
            return var4;
        } else {
            return (class303) null;
        }
    }

    @OriginalMember(owner = "client!ca", name = "<init>", descriptor = "()V", line = 197)
    public class113() {
        this(4096);
    }
}
