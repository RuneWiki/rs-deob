import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qu")
public class class96 {

    @OriginalMember(owner = "client!qu", name = "b", descriptor = "I")
    public static int field1011 = 0;

    @OriginalMember(owner = "client!qu", name = "g", descriptor = "[I")
    public static int[] field1016 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client!qu", name = "c", descriptor = "I")
    public static int field1012 = 0;

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "F")
    public static float field1010;

    @OriginalMember(owner = "client!qu", name = "d", descriptor = "I")
    public int field1013;

    @OriginalMember(owner = "client!qu", name = "f", descriptor = "I")
    public static int field1015;

    @OriginalMember(owner = "client!qu", name = "i", descriptor = "I")
    public static int field1018;

    @OriginalMember(owner = "client!qu", name = "e", descriptor = "Lur;")
    public static class535 field1014;

    @OriginalMember(owner = "client!qu", name = "h", descriptor = "Ljava/lang/String;")
    public String field1017;

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(I)V", line = 6)
    public static void method682(int arg0) {
        field1014 = null;
        if (arg0 > -45) {
            method682(69);
        }
        field1016 = null;
    }

    @OriginalMember(owner = "client!qu", name = "a", descriptor = "(IZIIII)V", line = 17)
    public static final void method683(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg4 < 1) {
            arg4 = 1;
        }
        if (arg5 < 1) {
            arg5 = 1;
        }
        field1018++;
        int var6 = arg5 - 334;
        if (var6 < 0) {
            var6 = 0;
        } else if (var6 > 100) {
            var6 = 100;
        }
        int var7 = (class703.field9911 - class176.field2069) * var6 / 100 + class176.field2069;
        if (class556.field7976 > var7) {
            var7 = class556.field7976;
        } else if (var7 > class510.field7271) {
            var7 = class510.field7271;
        }
        int var8 = arg5 * 512 * var7 / (arg2 * arg4);
        if (class102.field1060 > var8) {
            short var9 = class102.field1060;
            var7 = var9 * 334 * arg4 / (arg5 * 512);
            if (var7 > class510.field7271) {
                var7 = class510.field7271;
                int var10 = arg5 * var7 * 512 / (var9 * 334);
                int var11 = (arg4 - var10) / 2;
                if (arg1) {
                    class275.field3370.method393();
                    class275.field3370.method410(-16777216, arg0, arg5, 98, arg3, var11);
                    class275.field3370.method410(-16777216, arg4 + arg0 - var11, arg5, 93, arg3, var11);
                }
                arg4 -= var11 * 2;
                arg0 += var11;
            }
        } else if (var8 > class310.field3855) {
            short var12 = class310.field3855;
            var7 = arg4 * var12 * 334 / (arg5 * 512);
            if (class556.field7976 > var7) {
                var7 = class556.field7976;
                int var13 = arg4 * 334 * var12 / (var7 * 512);
                int var14 = (arg5 - var13) / 2;
                if (arg1) {
                    class275.field3370.method393();
                    class275.field3370.method410(-16777216, arg0, var14, arg2 - 388, arg3, arg4);
                    class275.field3370.method410(-16777216, arg0, var14, arg2 - 443, arg3 - var14 + arg5, arg4);
                }
                arg3 += var14;
                arg5 -= var14 * 2;
            }
        }
        class227.field2594 = arg5 * var7 / 334;
        class440.field6390 = arg3;
        class429.field6240 = (short) arg4;
        class183.field2159 = (short) arg5;
        class519.field7377 = arg0;
    }
}
