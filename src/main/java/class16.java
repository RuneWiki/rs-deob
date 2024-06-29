import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kv")
public class class16 {

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "I")
    public int field250 = -1;

    @OriginalMember(owner = "client!kv", name = "e", descriptor = "[Ljava/awt/Color;")
    public static Color[] field254 = new Color[] { new Color(9179409), new Color(16777215) };

    @OriginalMember(owner = "client!kv", name = "f", descriptor = "[I")
    public static int[] field255 = new int[14];

    @OriginalMember(owner = "client!kv", name = "h", descriptor = "Ljava/lang/String;")
    public static String field257 = null;

    @OriginalMember(owner = "client!kv", name = "b", descriptor = "I")
    public static int field251;

    @OriginalMember(owner = "client!kv", name = "d", descriptor = "I")
    public static int field253;

    @OriginalMember(owner = "client!kv", name = "i", descriptor = "Lvfa;")
    public class438 field258;

    @OriginalMember(owner = "client!kv", name = "c", descriptor = "[I")
    public int[] field252;

    @OriginalMember(owner = "client!kv", name = "g", descriptor = "[Ljava/lang/String;")
    public String[] field256;

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(II)V")
    public static final void method193(int arg0, int arg1) {
        class345.field4882 = -1;
        class434.field6249 = arg1;
        class160.field2599 = -1;
        class484.field6903 = null;
        field253++;
        class309.field4295 = 0;
        class568.field8311 = arg0;
        class586.field8566 = null;
        class277.field3927 = false;
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(Z)V")
    public static void method194(boolean arg0) {
        field257 = null;
        field254 = null;
        field255 = null;
        if (!arg0) {
            field254 = null;
        }
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(IIBILkfa;IZ[B)Lbb;")
    public static final class196 method195(int arg0, int arg1, byte arg2, int arg3, class382 arg4, int arg5, boolean arg6, byte[] arg7) {
        field251++;
        if (arg2 != -27) {
            field257 = null;
        }
        if (!arg4.field5507 && (!class452.method2633(arg1, (byte) 127) || !class452.method2633(arg5, (byte) 127))) {
            return arg4.field5528 ? new class196(arg4, 34037, arg3, arg1, arg5, arg6, arg7, arg0) : new class196(arg4, arg3, arg1, arg5, class99.method830(arg1, false), class99.method830(arg5, false), arg7, arg0);
        } else {
            return new class196(arg4, 3553, arg3, arg1, arg5, arg6, arg7, arg0);
        }
    }
}
