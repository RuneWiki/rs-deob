import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cm")
public class class183 extends class165 {

    @OriginalMember(owner = "client!cm", name = "I", descriptor = "[Lcd;")
    public static class64[] field3131 = new class64[200];

    @OriginalMember(owner = "client!cm", name = "K", descriptor = "Lja;")
    public static class60 field3133 = null;

    @OriginalMember(owner = "client!cm", name = "L", descriptor = "Lcd;")
    public static class64 field3134 = class44.method335((byte) 71, "scrollbar");

    @OriginalMember(owner = "client!cm", name = "J", descriptor = "Lcd;")
    public static class64 field3132 = class44.method335((byte) 71, ": ");

    @OriginalMember(owner = "client!cm", name = "P", descriptor = "I")
    public static int field3138 = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "client!cm", name = "M", descriptor = "I")
    public static int field3135;

    @OriginalMember(owner = "client!cm", name = "N", descriptor = "I")
    public static int field3136;

    @OriginalMember(owner = "client!cm", name = "O", descriptor = "I")
    public static int field3137;

    @OriginalMember(owner = "client!cm", name = "Q", descriptor = "I")
    public static int field3139;

    @OriginalMember(owner = "client!cm", name = "R", descriptor = "I")
    public static int field3140;

    @OriginalMember(owner = "client!cm", name = "H", descriptor = "Lsb;")
    public static class104 field3130;

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(B)V", line = 4)
    public static void method1292(byte arg0) {
        field3132 = null;
        int var1 = -84 / ((arg0 - 35) / 57);
        field3134 = null;
        field3131 = null;
        field3133 = null;
        field3130 = null;
    }

    @OriginalMember(owner = "client!cm", name = "a", descriptor = "(IIIILte;I)Ljava/awt/Frame;", line = 35)
    public static final Frame method1293(int arg0, int arg1, int arg2, int arg3, class282 arg4, int arg5) {
        if (arg2 >= -25) {
            field3139 = -36;
        }
        field3136++;
        if (!arg4.method1961(10869)) {
            return null;
        }
        if (arg3 == 0) {
            class289[] var6 = class275.method1905(arg4, -1);
            if (var6 == null) {
                return null;
            }
            boolean var7 = false;
            for (int var8 = 0; var8 < var6.length; var8++) {
                if (var6[var8].field4943 == arg1 && var6[var8].field4944 == arg0 && (arg5 == 0 || var6[var8].field4935 == arg5) && (!var7 || arg3 < var6[var8].field4938)) {
                    arg3 = var6[var8].field4938;
                    var7 = true;
                }
            }
            if (!var7) {
                return null;
            }
        }
        class22 var9 = arg4.method1960(arg0, arg3, (byte) -108, arg1, arg5);
        while (var9.field375 == 0) {
            class267.method1871(10, 10L);
        }
        Frame var10 = (Frame) var9.field377;
        if (var10 == null) {
            return null;
        } else if (var9.field375 == 2) {
            class274.method1901(var10, 10, arg4);
            return null;
        } else {
            return var10;
        }
    }
}
