import java.awt.Color;
import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ak")
public abstract class class320 {

    @OriginalMember(owner = "client!ak", name = "b", descriptor = "Lrl;")
    public static class672 field5007 = new class672(69, 3);

    @OriginalMember(owner = "client!ak", name = "f", descriptor = "[Ljava/awt/Color;")
    public static Color[] field5011 = new Color[] { new Color(9179409), new Color(16777215) };

    @OriginalMember(owner = "client!ak", name = "i", descriptor = "I")
    public static int field5014 = 1;

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "I")
    public static int field5006;

    @OriginalMember(owner = "client!ak", name = "d", descriptor = "I")
    public static int field5009;

    @OriginalMember(owner = "client!ak", name = "e", descriptor = "I")
    public static int field5010;

    @OriginalMember(owner = "client!ak", name = "g", descriptor = "I")
    public int field5012;

    @OriginalMember(owner = "client!ak", name = "h", descriptor = "Lri;")
    public static class97 field5013;

    @OriginalMember(owner = "client!ak", name = "c", descriptor = "Ljava/lang/String;")
    public String field5008;

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(IIB)V", line = 5)
    public static final void method2174(int arg0, int arg1, byte arg2) {
        field5009++;
        class413 var3 = class674.method3852(14, arg1, 125);
        if (arg2 != 62) {
            method2175((byte) -37);
        }
        var3.method2633(16777215);
        var3.field6337 = arg0;
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(B)V", line = 22)
    public static void method2175(byte arg0) {
        field5013 = null;
        field5007 = null;
        field5011 = null;
        if (arg0 != 65) {
            field5007 = null;
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(Z)Ljava/net/Socket;", line = 40)
    public final Socket method2176(boolean arg0) throws IOException {
        if (arg0) {
            field5010++;
            return new Socket(this.field5008, this.field5012);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(II)Ljava/lang/String;", line = 55)
    public static final String method2177(int arg0, int arg1) {
        if (arg0 != 1) {
            method2174(51, 6, (byte) 65);
        }
        field5006++;
        return (arg1 >> 24 & 0xFF) + "." + (arg1 >> 16 & 0xFF) + "." + ((arg1 & 0xFF47) >> 8) + "." + (arg1 & 0xFF);
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(I)Ljava/net/Socket;")
    public abstract Socket method1604(int arg0) throws IOException;
}
