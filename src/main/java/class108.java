import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pk")
public class class108 extends class255 {

    @OriginalMember(owner = "client!pk", name = "I", descriptor = "I")
    public static int field1509 = 0;

    @OriginalMember(owner = "client!pk", name = "O", descriptor = "Ljava/lang/String;")
    public static String field1515 = "skill: ";

    @OriginalMember(owner = "client!pk", name = "L", descriptor = "I")
    public static int field1512 = 0;

    @OriginalMember(owner = "client!pk", name = "S", descriptor = "I")
    public static volatile int field1519 = 0;

    @OriginalMember(owner = "client!pk", name = "M", descriptor = "[[Z")
    public static boolean[][] field1513 = new boolean[][] { { true, true, true, true, true, true, true, true, true, true, true, true, true }, { true, true, true, false, false, false, true, true, false, false, false, false, true }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, true, false, false, false, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { false, true, true, true, true, true, true, true, false, false, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, true, true, false, false, false, false, false, false, false, true, true, false }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13] };

    @OriginalMember(owner = "client!pk", name = "G", descriptor = "I")
    public static int field1507;

    @OriginalMember(owner = "client!pk", name = "K", descriptor = "I")
    public static int field1511;

    @OriginalMember(owner = "client!pk", name = "N", descriptor = "I")
    public int field1514;

    @OriginalMember(owner = "client!pk", name = "P", descriptor = "I")
    public static int field1516;

    @OriginalMember(owner = "client!pk", name = "Q", descriptor = "I")
    public static int field1517;

    @OriginalMember(owner = "client!pk", name = "R", descriptor = "I")
    public static int field1518;

    @OriginalMember(owner = "client!pk", name = "H", descriptor = "Lug;")
    public class333 field1508;

    @OriginalMember(owner = "client!pk", name = "J", descriptor = "[B")
    public byte[] field1510;

    @OriginalMember(owner = "client!pk", name = "d", descriptor = "(B)V")
    public static void method811(byte arg0) {
        field1515 = null;
        field1513 = null;
        if (arg0 >= -58) {
            method813((class324) null, (class148) null, false, (class312) null, -81, -110, (class222) null, 34);
        }
    }

    @OriginalMember(owner = "client!pk", name = "f", descriptor = "(I)I")
    public final int method812(int arg0) {
        int var2 = 46 % ((66 - arg0) / 56);
        ++field1518;
        return super.field4129 ? 0 : 100;
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(Lel;Lwd;ZLe;IILbr;I)V")
    public static final void method813(class324 arg0, class148 arg1, boolean arg2, class312 arg3, int arg4, int arg5, class222 arg6, int arg7) {
        ++field1517;
        int var8 = -(arg4 / 2) + arg6.field3693 - 5;
        if (arg2) {
            int var9 = arg5 - -2;
            if (arg0.field5056 != 0) {
                arg3.method2086(arg4 - -10, var8, -var9 + arg5 + 1 - -(arg1.method1060() * arg7), arg0.field5056, -765, var9);
            }
            if (~arg0.field5066 != -1) {
                arg3.method2083(108, var9, -var9 + 1 + (arg5 - -(arg7 * arg1.method1060())), var8, arg0.field5066, arg4 + 10);
            }
            int var10 = arg0.field5061;
            if (arg6.field3697 && ~arg0.field5080 != 0) {
                var10 = arg0.field5080;
            }
            for (int var11 = 0; arg7 > var11; ++var11) {
                String var12 = class9.field111[var11];
                if (~var11 > ~(arg7 - 1)) {
                    var12 = var12.substring(0, -4 + var12.length());
                }
                arg1.method1057(arg3, var12, arg6.field3693, arg5, var10, true);
                arg5 += arg1.method1060();
            }
        }
    }

    @OriginalMember(owner = "client!pk", name = "g", descriptor = "(I)[B")
    public final byte[] method814(int arg0) {
        if (arg0 != -30235) {
            field1513 = null;
        }
        ++field1511;
        if (super.field4129) {
            throw new RuntimeException();
        } else {
            return this.field1510;
        }
    }
}
