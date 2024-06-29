import java.awt.Canvas;
import java.awt.event.FocusListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gn")
public class class5 extends Canvas implements FocusListener {

    @OriginalMember(owner = "client!gn", name = "d", descriptor = "Lu;")
    public static class259 field63 = new class259();

    @OriginalMember(owner = "client!gn", name = "g", descriptor = "[I")
    public static int[] field66 = new int[4096];

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "I")
    public static int field60;

    @OriginalMember(owner = "client!gn", name = "b", descriptor = "I")
    public static int field61;

    @OriginalMember(owner = "client!gn", name = "c", descriptor = "I")
    public static int field62;

    @OriginalMember(owner = "client!gn", name = "e", descriptor = "I")
    public static int field64;

    @OriginalMember(owner = "client!gn", name = "f", descriptor = "I")
    public static int field65;

    @OriginalMember(owner = "client!gn", name = "h", descriptor = "I")
    public static int field67;

    @OriginalMember(owner = "client!gn", name = "i", descriptor = "I")
    public static int field68;

    @OriginalMember(owner = "client!gn", name = "k", descriptor = "I")
    public static int field70;

    @OriginalMember(owner = "client!gn", name = "l", descriptor = "I")
    public static int field71;

    @OriginalMember(owner = "client!gn", name = "m", descriptor = "I")
    public static int field72;

    @OriginalMember(owner = "client!gn", name = "n", descriptor = "Lclient;")
    public static client field73;

    @OriginalMember(owner = "client!gn", name = "j", descriptor = "[[[B")
    public static byte[][][] field69;

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(I)V", line = 5)
    public static final void method34(int arg0) {
        if (arg0 != 0) {
            field68 = -108;
        }
        if (class229.field3987 != null) {
            class330 var1 = class229.field3987;
            synchronized (class229.field3987) {
                class229.field3987 = null;
            }
        }
        field71++;
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(ILca;)V", line = 23)
    public static final void method35(int arg0, class98 arg1) {
        field60++;
        if (arg0 != 4096) {
            field63 = (class259) null;
        }
        class98 var2 = class144.method998(18529, arg1);
        int var3;
        int var4;
        if (var2 == null) {
            var4 = class73.field1110;
            var3 = class21.field331;
        } else {
            var3 = var2.field1688;
            var4 = var2.field1673;
        }
        class39.method264(arg1, false, var3, arg0 - 4095, var4);
        class1.method8(var3, arg1, 67, var4);
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(B)V", line = 50)
    public static void method36(byte arg0) {
        field69 = (byte[][][]) null;
        field73 = null;
        field66 = null;
        int var1 = 110 % ((arg0 + 58) / 32);
        field63 = null;
    }
}
