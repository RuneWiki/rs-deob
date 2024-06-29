import jaggl.OpenGL;
import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fda")
public class class362 {

    @OriginalMember(owner = "client!fda", name = "b", descriptor = "I")
    public int field4632;

    @OriginalMember(owner = "client!fda", name = "i", descriptor = "I")
    public int field4639;

    @OriginalMember(owner = "client!fda", name = "m", descriptor = "Lig;")
    public class674 field4643;

    @OriginalMember(owner = "client!fda", name = "d", descriptor = "I")
    public int field4634;

    @OriginalMember(owner = "client!fda", name = "o", descriptor = "I")
    public int field4645;

    @OriginalMember(owner = "client!fda", name = "f", descriptor = "I")
    public int field4636;

    @OriginalMember(owner = "client!fda", name = "c", descriptor = "I")
    public int field4633;

    @OriginalMember(owner = "client!fda", name = "l", descriptor = "B")
    public byte field4642;

    @OriginalMember(owner = "client!fda", name = "n", descriptor = "Z")
    public static boolean field4644 = false;

    @OriginalMember(owner = "client!fda", name = "g", descriptor = "I")
    public static int field4637;

    @OriginalMember(owner = "client!fda", name = "j", descriptor = "I")
    public static int field4640;

    @OriginalMember(owner = "client!fda", name = "p", descriptor = "I")
    public static int field4646;

    @OriginalMember(owner = "client!fda", name = "q", descriptor = "I")
    public static int field4647;

    @OriginalMember(owner = "client!fda", name = "h", descriptor = "Lqv;")
    public class110 field4638;

    @OriginalMember(owner = "client!fda", name = "e", descriptor = "Llu;")
    public class194 field4635;

    @OriginalMember(owner = "client!fda", name = "a", descriptor = "Leh;")
    public class258 field4631;

    @OriginalMember(owner = "client!fda", name = "k", descriptor = "Laaa;")
    public class25 field4641;

    @OriginalMember(owner = "client!fda", name = "a", descriptor = "(Ljava/awt/Canvas;Lwu;BILd;)Lha;", line = 7)
    public static final class545 method2038(Canvas arg0, class557 arg1, byte arg2, int arg3, class268 arg4) {
        field4640++;
        if (!class10.method48(-9457)) {
            throw new RuntimeException("");
        } else if (class389.method2365("jaggl", (byte) 58)) {
            OpenGL var5 = new OpenGL();
            long var6 = var5.init(arg0, 8, 8, 8, 24, 0, arg3);
            if (var6 == 0L) {
                throw new RuntimeException("");
            }
            class93 var8 = new class93(var5, arg0, var6, arg4, arg1, arg3);
            var8.method2877((byte) 125);
            return arg2 == 68 ? var8 : null;
        } else {
            throw new RuntimeException("");
        }
    }

    @OriginalMember(owner = "client!fda", name = "a", descriptor = "(ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;I)V", line = 35)
    public static final void method2039(int arg0, String arg1, int arg2, String arg3, String arg4, String arg5, int arg6, String arg7, int arg8) {
        field4637++;
        class330 var9 = class290.field3804[99];
        if (arg2 > -82) {
            field4646 = -52;
        }
        for (int var10 = 99; var10 > 0; var10--) {
            class290.field3804[var10] = class290.field3804[var10 - 1];
        }
        if (var9 == null) {
            var9 = new class330(arg8, arg0, arg5, arg4, arg1, arg7, arg6, arg3);
        } else {
            var9.method1919(arg4, arg8, arg7, arg5, arg1, arg3, 125, arg0, arg6);
        }
        class209.field2978++;
        class290.field3804[0] = var9;
        class31.field477 = class564.field8023;
    }

    @OriginalMember(owner = "client!fda", name = "a", descriptor = "(I)Z", line = 68)
    public final boolean method2040(int arg0) {
        if (arg0 != 0) {
            method2039(91, null, -79, null, null, null, -54, null, -37);
        }
        field4647++;
        return this.field4642 == 2 || this.field4642 == 3;
    }

    @OriginalMember(owner = "client!fda", name = "<init>", descriptor = "(BIIIIIILig;)V", line = 88)
    public class362(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class674 arg7) {
        this.field4632 = arg4;
        this.field4639 = arg2;
        this.field4643 = arg7;
        this.field4634 = arg6;
        this.field4645 = arg5;
        this.field4636 = arg3;
        this.field4633 = arg1;
        this.field4642 = arg0;
    }
}
