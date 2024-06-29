import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tc")
public class class37 {

    @OriginalMember(owner = "client!tc", name = "c", descriptor = "I")
    public static int field539 = 0;

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "Lbe;")
    public static class283 field537 = class153.method941(-47, "Verbindung abgebrochen)3");

    @OriginalMember(owner = "client!tc", name = "e", descriptor = "I")
    public static int field541 = 10;

    @OriginalMember(owner = "client!tc", name = "h", descriptor = "Lbe;")
    private static class283 field544 = class153.method941(127, "level)2");

    @OriginalMember(owner = "client!tc", name = "d", descriptor = "Lbe;")
    public static class283 field540 = field544;

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "I")
    public static int field538;

    @OriginalMember(owner = "client!tc", name = "f", descriptor = "I")
    public static int field542;

    @OriginalMember(owner = "client!tc", name = "g", descriptor = "Lgl;")
    public static class180 field543;

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(Lui;IIIII)Ljava/awt/Frame;", line = 34)
    public static final Frame method233(class251 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field542++;
        if (!arg0.method1708((byte) -58)) {
            return null;
        }
        if (arg2 == 0) {
            class113[] var6 = class262.method1774(4863, arg0);
            if (var6 == null) {
                return null;
            }
            boolean var7 = false;
            for (int var8 = 0; var8 < var6.length; var8++) {
                if (var6[var8].field1906 == arg5 && var6[var8].field1899 == arg4 && (arg1 == 0 || var6[var8].field1902 == arg1) && (!var7 || arg2 < var6[var8].field1908)) {
                    arg2 = var6[var8].field1908;
                    var7 = true;
                }
            }
            if (!var7) {
                return null;
            }
        }
        if (arg3 != -22013) {
            return (Frame) null;
        }
        class310 var9 = arg0.method1702(arg5, arg1, arg4, arg3 + 22792, arg2);
        while (var9.field5293 == 0) {
            class2.method11((byte) -20, 10L);
        }
        Frame var10 = (Frame) var9.field5296;
        if (var10 == null) {
            return null;
        } else if (var9.field5293 == 2) {
            class60.method396(var10, arg0, -29204);
            return null;
        } else {
            return var10;
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(B)V", line = 149)
    public static void method234(byte arg0) {
        field537 = null;
        field540 = null;
        field544 = null;
        if (arg0 > 123) {
            field543 = null;
        }
    }
}
