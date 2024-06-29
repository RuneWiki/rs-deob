import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pfa")
public class class279 {

    @OriginalMember(owner = "client!pfa", name = "o", descriptor = "I")
    public int field3693 = class100.method564(105);

    @OriginalMember(owner = "client!pfa", name = "n", descriptor = "Ljava/lang/String;")
    public String field3692;

    @OriginalMember(owner = "client!pfa", name = "a", descriptor = "I")
    public int field3679;

    @OriginalMember(owner = "client!pfa", name = "k", descriptor = "I")
    public int field3689;

    @OriginalMember(owner = "client!pfa", name = "b", descriptor = "I")
    public int field3680;

    @OriginalMember(owner = "client!pfa", name = "d", descriptor = "Ljava/lang/String;")
    public String field3682;

    @OriginalMember(owner = "client!pfa", name = "f", descriptor = "Ljava/lang/String;")
    public String field3684;

    @OriginalMember(owner = "client!pfa", name = "e", descriptor = "Ljava/lang/String;")
    public String field3683;

    @OriginalMember(owner = "client!pfa", name = "m", descriptor = "Ljava/lang/String;")
    public String field3691;

    @OriginalMember(owner = "client!pfa", name = "h", descriptor = "I")
    public int field3686;

    @OriginalMember(owner = "client!pfa", name = "g", descriptor = "I")
    public static int field3685 = -2;

    @OriginalMember(owner = "client!pfa", name = "i", descriptor = "Leba;")
    public static class550 field3687 = new class550(55, 8);

    @OriginalMember(owner = "client!pfa", name = "c", descriptor = "I")
    public static int field3681;

    @OriginalMember(owner = "client!pfa", name = "j", descriptor = "I")
    public static int field3688;

    @OriginalMember(owner = "client!pfa", name = "l", descriptor = "I")
    public static int field3690;

    @OriginalMember(owner = "client!pfa", name = "a", descriptor = "(Ljava/lang/String;IILjava/lang/String;ILjava/lang/String;Ljava/lang/String;BLjava/lang/String;)V")
    public final void method1663(String arg0, int arg1, int arg2, String arg3, int arg4, String arg5, String arg6, byte arg7, String arg8) {
        field3690++;
        this.field3693 = class100.method564(3);
        this.field3689 = arg2;
        this.field3686 = class327.field4404;
        this.field3683 = arg0;
        this.field3680 = arg1;
        this.field3692 = arg5;
        this.field3691 = arg6;
        this.field3682 = arg3;
        if (arg7 < 50) {
            method1664((byte) -22, null);
        }
        this.field3684 = arg8;
        this.field3679 = arg4;
    }

    @OriginalMember(owner = "client!pfa", name = "a", descriptor = "(B[B)V")
    public static final void method1664(byte arg0, byte[] arg1) {
        if (arg0 != 40) {
            return;
        }
        field3688++;
        class157 var2 = new class157(arg1);
        while (true) {
            while (true) {
                int var3 = var2.method930(255);
                if (var3 == 0) {
                    return;
                }
                if (var3 == 1) {
                    int[] var4 = class5.field56 = new int[6];
                    var4[0] = var2.method963(arg0 - 163);
                    var4[1] = var2.method963(class50.method268(arg0, -95));
                    var4[2] = var2.method963(-127);
                    var4[3] = var2.method963(-120);
                    var4[4] = var2.method963(-119);
                    var4[5] = var2.method963(class50.method268(arg0, -84));
                } else if (var3 == 4) {
                    int var5 = var2.method930(arg0 ^ 0xD7);
                    class407.field5362 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        class407.field5362[var6] = var2.method963(-127);
                        if (class407.field5362[var6] == 65535) {
                            class407.field5362[var6] = -1;
                        }
                    }
                } else if (var3 == 5) {
                    int var7 = var2.method930(255);
                    class662.field9440 = new int[var7];
                    for (int var8 = 0; var8 < var7; var8++) {
                        class662.field9440[var8] = var2.method963(-123);
                        if (class662.field9440[var8] == 65535) {
                            class662.field9440[var8] = -1;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!pfa", name = "a", descriptor = "(I)V")
    public static void method1665(int arg0) {
        field3687 = null;
        if (arg0 != 1) {
            field3685 = -43;
        }
    }

    @OriginalMember(owner = "client!pfa", name = "<init>", descriptor = "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V")
    public class279(int arg0, int arg1, String arg2, String arg3, String arg4, String arg5, int arg6, String arg7) {
        this.field3692 = arg2;
        this.field3679 = arg1;
        this.field3689 = arg6;
        this.field3680 = arg0;
        this.field3682 = arg7;
        this.field3684 = arg4;
        this.field3683 = arg5;
        this.field3691 = arg3;
        this.field3686 = class327.field4404;
    }
}
