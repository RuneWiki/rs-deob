import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jm")
public class class688 implements class300 {

    @OriginalMember(owner = "client!jm", name = "b", descriptor = "Lfp;")
    private class323 field9396;

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "Ljava/lang/String;")
    private String field9395;

    @OriginalMember(owner = "client!jm", name = "c", descriptor = "D")
    public static double field9397 = -1.0D;

    @OriginalMember(owner = "client!jm", name = "d", descriptor = "I")
    public static int field9398;

    @OriginalMember(owner = "client!jm", name = "e", descriptor = "I")
    public static int field9399;

    @OriginalMember(owner = "client!jm", name = "f", descriptor = "I")
    public static int field9400;

    @OriginalMember(owner = "client!jm", name = "g", descriptor = "I")
    public static int field9401;

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(I)I", line = 7)
    public final int method146(int arg0) {
        field9399++;
        if (this.field9396.method2091(this.field9395, -2)) {
            return 100;
        } else if (arg0 == 6340) {
            return this.field9396.method2078(this.field9395, (byte) 91);
        } else {
            return 43;
        }
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(IILip;I)J", line = 21)
    public static final long method3845(int arg0, int arg1, class706 arg2, int arg3) {
        field9401++;
        long var4 = 4194304L;
        if (arg0 >= -39) {
            method3846(119, 71, 61, 30);
        }
        long var6 = Long.MIN_VALUE;
        class10 var8 = class612.field8588.method558((byte) 110, arg2.method861((byte) -17));
        long var9 = (long) (arg2.method868((byte) -10) << 14 | arg3 << 7 | arg1 | arg2.method865(30374) << 20 | 0x40000000);
        if (var8.field207 == 0) {
            var9 |= var6;
        }
        if (var8.field203 == 1) {
            var9 |= var4;
        }
        return var9 | (long) arg2.method861((byte) -17) << 32;
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(IIII)V", line = 48)
    public static final void method3846(int arg0, int arg1, int arg2, int arg3) {
        field9398++;
        String var4 = "tele " + arg3 + "," + (arg2 >> 6) + "," + (arg0 >> 6) + "," + (arg2 & 0x3F) + "," + (arg0 & 0x3F);
        System.out.println(var4);
        if (arg1 > -65) {
            method3846(25, 89, 82, -27);
        }
        class150.method1022(var4, true, false, -116);
    }

    @OriginalMember(owner = "client!jm", name = "b", descriptor = "(I)Ldn;", line = 62)
    public final class516 method149(int arg0) {
        int var2 = -88 % ((arg0 + 19) / 60);
        field9400++;
        return class516.field7356;
    }

    @OriginalMember(owner = "client!jm", name = "<init>", descriptor = "(Lfp;Ljava/lang/String;)V", line = 78)
    public class688(class323 arg0, String arg1) {
        this.field9396 = arg0;
        this.field9395 = arg1;
    }
}
