import java.awt.Component;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ud")
public class class143 {

    @OriginalMember(owner = "client!ud", name = "c", descriptor = "Lje;")
    public static class67 field3285 = class85.method592(255, "Sie k-Onnen sich selbst nicht auf Ihre Freunde)2Liste setzen(Q");

    @OriginalMember(owner = "client!ud", name = "g", descriptor = "Z")
    public static boolean field3289 = false;

    @OriginalMember(owner = "client!ud", name = "h", descriptor = "Lje;")
    public static class67 field3290 = class85.method592(255, ")4lang)4de");

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "Lje;")
    public static class67 field3284 = class85.method592(255, "runes");

    @OriginalMember(owner = "client!ud", name = "f", descriptor = "I")
    public static int field3288 = 0;

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "I")
    public static int field3283;

    @OriginalMember(owner = "client!ud", name = "d", descriptor = "I")
    public static int field3286;

    @OriginalMember(owner = "client!ud", name = "e", descriptor = "I")
    public static int field3287;

    @OriginalMember(owner = "client!ud", name = "i", descriptor = "I")
    public static int field3291;

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(B)V")
    public static void method1103(byte arg0) {
        field3290 = null;
        field3284 = null;
        if (arg0 < 82) {
            field3290 = null;
        }
        field3285 = null;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(II[BI)I")
    public static final int method1104(int arg0, int arg1, byte[] arg2, int arg3) {
        field3291++;
        int var4 = -1;
        int var5 = arg1;
        if (arg3 != 0) {
            method1107(-119, 26, -46, 8, -95, -122, 75, -87);
        }
        while (arg0 > var5) {
            var4 = class92.field2054[(var4 ^ arg2[var5]) & 0xFF] ^ var4 >>> 8;
            var5++;
        }
        return ~var4;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(II)V")
    public static final void method1105(int arg0, int arg1) {
        field3283++;
        if (class135.method1024(arg1, (byte) -15)) {
            int var2 = -85 % ((arg0 + 20) / 45);
            class24.method166(class55.field1062[arg1], -1, true);
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    public static final void method1106(Component arg0, int arg1) {
        Method var2 = class111.field2513;
        field3287++;
        if (var2 != null) {
            try {
                var2.invoke(arg0, Boolean.FALSE);
            } catch (Throwable var3) {
            }
        }
        arg0.addKeyListener(class64.field1263);
        arg0.addFocusListener(class64.field1263);
        if (arg1 != 255) {
            field3288 = 123;
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method1107(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field3286++;
        if (class135.method1024(arg7, (byte) -15)) {
            class67.method468(arg4, arg2, arg1, arg3, (byte) -115, arg0, arg5, arg6, class55.field1062[arg7]);
        }
    }
}
