import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fh")
public class class676 extends class165 {

    @OriginalMember(owner = "client!fh", name = "u", descriptor = "Ljava/lang/String;")
    public static String field9624 = "";

    @OriginalMember(owner = "client!fh", name = "p", descriptor = "I")
    public static int field9619;

    @OriginalMember(owner = "client!fh", name = "q", descriptor = "I")
    public static int field9620;

    @OriginalMember(owner = "client!fh", name = "r", descriptor = "I")
    private int field9621;

    @OriginalMember(owner = "client!fh", name = "s", descriptor = "I")
    public static int field9622;

    @OriginalMember(owner = "client!fh", name = "t", descriptor = "I")
    private int field9623;

    @OriginalMember(owner = "client!fh", name = "v", descriptor = "I")
    public static int field9625;

    @OriginalMember(owner = "client!fh", name = "w", descriptor = "I")
    private int field9626;

    @OriginalMember(owner = "client!fh", name = "x", descriptor = "I")
    public static int field9627;

    @OriginalMember(owner = "client!fh", name = "y", descriptor = "I")
    public static int field9628;

    @OriginalMember(owner = "client!fh", name = "A", descriptor = "I")
    private int field9630;

    @OriginalMember(owner = "client!fh", name = "z", descriptor = "[I")
    public static int[] field9629;

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(IIBILjava/lang/String;Lha;II)V")
    public static final void method3827(int arg0, int arg1, byte arg2, int arg3, String arg4, class66 arg5, int arg6, int arg7) {
        field9619++;
        if (arg2 >= -19) {
            return;
        }
        if (class651.field9158 == null || class516.field7384 == null) {
            if (class491.field6972.method3131(-42, class690.field9766) && class491.field6972.method3131(117, class123.field1607)) {
                class651.field9158 = arg5.method482(class625.method3580(class491.field6972, class690.field9766, 0), true);
                class625 var8 = class625.method3580(class491.field6972, class123.field1607, 0);
                class516.field7384 = arg5.method482(var8, true);
                var8.method3585();
                class725.field10177 = arg5.method482(var8, true);
            } else {
                arg5.method474(arg7, arg1, arg6, arg0, class161.field2377 | 255 - class231.field3358 << 24, 1);
            }
        }
        if (class651.field9158 != null && class516.field7384 != null) {
            int var9 = (arg6 - class516.field7384.method777() * 2) / class651.field9158.method777();
            for (int var10 = 0; var10 < var9; var10++) {
                class651.field9158.method785(arg7 + class516.field7384.method777() + (var10 * class651.field9158.method777()), arg1);
            }
            class516.field7384.method785(arg7, arg1);
            class725.field10177.method785(arg6 + arg7 - class725.field10177.method777(), arg1);
        }
        class546.field7704.method529(arg1 + 14, arg4, (byte) -82, arg7 + 3, -1, -16777216 | class229.field3331);
        arg5.method474(arg7, arg0 + arg1, arg6, arg3 - arg0, class161.field2377 | -class231.field3358 + 255 << 24, 1);
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(ILmia;)V")
    public final void method612(int arg0, class69 arg1) {
        arg1.method553(this.field9626, this.field9630, (byte) 108, this.field9621, this.field9623);
        if (arg0 > -100) {
            field9624 = null;
        }
        field9627++;
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(I[BII)[B")
    public static final byte[] method3828(int arg0, byte[] arg1, int arg2, int arg3) {
        field9622++;
        if (arg3 != -15033) {
            method3828(126, null, 40, 111);
        }
        byte[] var4 = new byte[arg2];
        class42.method288(arg1, arg0, var4, 0, arg2);
        return var4;
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(I)V")
    public static void method3829(int arg0) {
        field9629 = null;
        if (arg0 < 92) {
            method3827(124, 102, (byte) 36, -33, null, null, 0, 61);
        }
        field9624 = null;
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(Lrv;I)V")
    public final void method614(class120 arg0, int arg1) {
        this.field9626 = arg0.method871(23995);
        field9620++;
        if (arg1 != 1070) {
            this.field9626 = -39;
        }
        this.field9630 = arg0.method871(arg1 ^ 0x5995);
        this.field9623 = arg0.method842(2384);
        this.field9621 = arg0.method842(2384);
    }
}
