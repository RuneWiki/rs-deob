import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uk")
public class class100 extends class169 {

    @OriginalMember(owner = "client!uk", name = "t", descriptor = "I")
    public static int field1396 = 0;

    @OriginalMember(owner = "client!uk", name = "w", descriptor = "Ljava/lang/String;")
    public static String field1399 = "glow2:";

    @OriginalMember(owner = "client!uk", name = "y", descriptor = "I")
    public static int field1401 = 0;

    @OriginalMember(owner = "client!uk", name = "r", descriptor = "I")
    public static int field1394;

    @OriginalMember(owner = "client!uk", name = "s", descriptor = "I")
    public static int field1395;

    @OriginalMember(owner = "client!uk", name = "u", descriptor = "I")
    public static int field1397;

    @OriginalMember(owner = "client!uk", name = "v", descriptor = "I")
    public static int field1398;

    @OriginalMember(owner = "client!uk", name = "x", descriptor = "I")
    public static int field1400;

    @OriginalMember(owner = "client!uk", name = "b", descriptor = "(I)V")
    public static void method656(int arg0) {
        int var1 = 64 / ((arg0 - 40) / 57);
        field1399 = null;
    }

    @OriginalMember(owner = "client!uk", name = "c", descriptor = "(I)V")
    public static final void method657(int arg0) {
        field1394++;
        class50.field720.method546(-90762264);
        class240.field3663.method546(-90762264);
        if (arg0 != 0) {
            field1399 = null;
        }
        class208.field2942.method546(-90762264);
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(IIIIIII)V")
    public static final void method658(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1400++;
        int var7 = 0;
        if (arg4 > -19) {
            field1396 = 72;
        }
        class275[] var8 = class175.field2463;
        while (var8.length > var7) {
            class275 var9 = var8[var7];
            if (var9 != null && var9.field4262 == 2) {
                class16.method98((var9.field4251 - class37.field565 << 7) + var9.field4260, arg1 >> 1, (var9.field4255 - class216.field3255 << 7) + var9.field4259, arg6, -88, arg3 >> 1, var9.field4247 * 2, arg2);
                if (class236.field3595 > -1 && (class52.field740 % 20) < 10) {
                    class65.field882[var9.field4253].method710(class236.field3595 + arg5 - 12, arg0 + -28 + class151.field2081);
                }
            }
            var7++;
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(ZZ)V")
    public static final void method659(boolean arg0, boolean arg1) {
        field1397++;
        class156.method1038(arg1);
        if (class79.field1097 != 30 && class79.field1097 != 25) {
            return;
        }
        class178.field2488++;
        if (class178.field2488 < 50 && !arg0) {
            return;
        }
        class178.field2488 = 0;
        if (!class229.field3477 && class290.field4567 != null) {
            class226.field3434++;
            class281.field4359.method1864(116, (byte) -69);
            try {
                class290.field4567.method1967(class281.field4359.field3336, 0, class281.field4359.field3402, 0);
                class281.field4359.field3402 = 0;
            } catch (IOException var2) {
                class229.field3477 = true;
            }
        }
        class156.method1038(arg1);
    }
}
