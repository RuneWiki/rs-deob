import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kd")
public class class186 {

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "I")
    public static int field2423 = 1;

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "I")
    public int field2424;

    @OriginalMember(owner = "client!kd", name = "c", descriptor = "I")
    public int field2425;

    @OriginalMember(owner = "client!kd", name = "d", descriptor = "I")
    public static int field2426;

    @OriginalMember(owner = "client!kd", name = "e", descriptor = "I")
    public static int field2427;

    @OriginalMember(owner = "client!kd", name = "f", descriptor = "I")
    public static int field2428;

    @OriginalMember(owner = "client!kd", name = "g", descriptor = "I")
    public static int field2429;

    @OriginalMember(owner = "client!kd", name = "h", descriptor = "I")
    public int field2430;

    @OriginalMember(owner = "client!kd", name = "i", descriptor = "I")
    public static int field2431;

    @OriginalMember(owner = "client!kd", name = "l", descriptor = "I")
    public static int field2434;

    @OriginalMember(owner = "client!kd", name = "m", descriptor = "I")
    public int field2435;

    @OriginalMember(owner = "client!kd", name = "n", descriptor = "I")
    public int field2436;

    @OriginalMember(owner = "client!kd", name = "o", descriptor = "I")
    public int field2437;

    @OriginalMember(owner = "client!kd", name = "q", descriptor = "I")
    public int field2439;

    @OriginalMember(owner = "client!kd", name = "p", descriptor = "Lqn;")
    public static class47 field2438;

    @OriginalMember(owner = "client!kd", name = "j", descriptor = "[B")
    public byte[] field2432;

    @OriginalMember(owner = "client!kd", name = "k", descriptor = "[B")
    public byte[] field2433;

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(IIB)V", line = 8)
    public static final void method1166(int arg0, int arg1, byte arg2) {
        field2428++;
        if (class450.method2649(arg0, 21182)) {
            class505.method3035(class293.field3725[arg0], arg1, (byte) -125);
            int var3 = -28 / ((arg2 - 22) / 44);
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(I)V", line = 21)
    public static void method1167(int arg0) {
        if (arg0 != 2) {
            method1169(null, -67);
        }
        field2438 = null;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(IIZIBI)V", line = 33)
    public static final void method1168(int arg0, int arg1, boolean arg2, int arg3, byte arg4, int arg5) {
        field2426++;
        if (arg1 < 1) {
            arg1 = 1;
        }
        if (arg5 < 1) {
            arg5 = 1;
        }
        int var6 = arg5 - 334;
        if (var6 < 0) {
            var6 = 0;
        } else if (var6 > 100) {
            var6 = 100;
        }
        int var7 = (class282.field3586 - class24.field349) * var6 / 100 + class24.field349;
        if (class362.field4667 > var7) {
            var7 = class362.field4667;
        } else if (var7 > class109.field1477) {
            var7 = class109.field1477;
        }
        int var8 = arg5 * var7 * 512 / (arg1 * 334);
        if (var8 < class346.field4449) {
            short var12 = class346.field4449;
            var7 = arg1 * var12 * 334 / (arg5 * 512);
            if (class109.field1477 < var7) {
                var7 = class109.field1477;
                int var13 = var7 * 512 * arg5 / (var12 * 334);
                int var14 = (arg1 - var13) / 2;
                if (arg2) {
                    class33.field416.method318();
                    class33.field416.method364(var14, arg0, arg5, arg3, (byte) -48, -16777216);
                    class33.field416.method364(var14, arg0 - (var14 - arg1), arg5, arg3, (byte) -48, -16777216);
                }
                arg0 += var14;
                arg1 -= var14 * 2;
            }
        } else if (class453.field6538 < var8) {
            short var9 = class453.field6538;
            var7 = var9 * 334 * arg1 / (arg5 * 512);
            if (var7 < class362.field4667) {
                var7 = class362.field4667;
                int var10 = arg1 * var9 * 334 / (var7 * 512);
                int var11 = (arg5 - var10) / 2;
                if (arg2) {
                    class33.field416.method318();
                    class33.field416.method364(arg1, arg0, var11, arg3, (byte) -48, -16777216);
                    class33.field416.method364(arg1, arg0, var11, arg3 + arg5 - var11, (byte) -48, -16777216);
                }
                arg5 -= var11 * 2;
                arg3 += var11;
            }
        }
        class48.field612 = arg0;
        class380.field5001 = (short) arg5;
        class191.field2486 = (short) arg1;
        int var15 = -83 % ((arg4 + 74) / 46);
        class490.field7121 = arg3;
        class518.field7498 = arg5 * var7 / 334;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(Lqn;I)V", line = 126)
    public static final void method1169(class47 arg0, int arg1) {
        field2434++;
        if (arg1 < 19) {
            field2438 = null;
        }
        class151.field1898 = 0;
        class226.field2878 = 0;
        class46.field563 = new class365();
        class47.field576 = new class485[1024];
        class9.method67(86, arg0);
        class281.method1666(true, arg0);
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(IIILhd;)V", line = 150)
    public static final void method1170(int arg0, int arg1, int arg2, class523 arg3) {
        class168.field2162 = arg3;
        class348.field4489 = arg0;
        field2429++;
        if (arg1 == 24) {
            class466.field6719 = arg2;
        }
    }

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "(I)V", line = 166)
    public static final void method1171(int arg0) {
        field2431++;
        if (class464.field6695) {
            return;
        }
        if (arg0 < 44) {
            method1167(43);
        }
        class469.field6792 = true;
        class464.field6695 = true;
        if (class407.field5817.field3615) {
            class463.field6626 = ((int) class463.field6626 + 191 & 0xFFFFFF80);
        } else {
            class461.field6598 += (24.0F - class461.field6598) / 2.0F;
        }
    }
}
