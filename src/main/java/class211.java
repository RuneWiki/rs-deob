import java.awt.Component;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qg")
public class class211 {

    @OriginalMember(owner = "client!qg", name = "j", descriptor = "I")
    public static int field3039 = 0;

    @OriginalMember(owner = "client!qg", name = "b", descriptor = "I")
    public static int field3031;

    @OriginalMember(owner = "client!qg", name = "d", descriptor = "I")
    public static int field3033;

    @OriginalMember(owner = "client!qg", name = "g", descriptor = "I")
    public static int field3036;

    @OriginalMember(owner = "client!qg", name = "i", descriptor = "I")
    public static int field3038;

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "Lve;")
    public static class233 field3030;

    @OriginalMember(owner = "client!qg", name = "h", descriptor = "Lbk;")
    public static class54 field3037;

    @OriginalMember(owner = "client!qg", name = "e", descriptor = "Lij;")
    public static class69 field3034;

    @OriginalMember(owner = "client!qg", name = "c", descriptor = "Z")
    public static boolean field3032;

    @OriginalMember(owner = "client!qg", name = "f", descriptor = "[I")
    public static int[] field3035;

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "()V")
    public static final void method1345() {
        if (class17.field241 != null) {
            for (int var0 = 0; var0 < class17.field241.length; var0++) {
                for (int var1 = 0; var1 < class90.field1372; var1++) {
                    for (int var2 = 0; var2 < class225.field3383; var2++) {
                        class17.field241[var0][var1][var2] = null;
                    }
                }
            }
        }
        if (class264.field3985 != null) {
            for (int var3 = 0; var3 < class264.field3985.length; var3++) {
                for (int var4 = 0; var4 < class90.field1372; var4++) {
                    for (int var5 = 0; var5 < class225.field3383; var5++) {
                        class264.field3985[var3][var4][var5] = null;
                    }
                }
            }
        }
        class162.field2336 = 0;
        if (class54.field829 != null) {
            for (int var6 = 0; var6 < class162.field2336; var6++) {
                class54.field829[var6] = null;
            }
        }
        if (class268.field4197 != null) {
            for (int var7 = 0; var7 < class158.field2288; var7++) {
                class268.field4197[var7] = null;
            }
            class158.field2288 = 0;
        }
        if (class27.field401 != null) {
            for (int var8 = 0; var8 < class27.field401.length; var8++) {
                class27.field401[var8] = null;
            }
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(ILjava/awt/Component;)V")
    public static final void method1346(int arg0, Component arg1) {
        Method var2 = class83.field1290;
        field3036++;
        if (var2 != null) {
            try {
                var2.invoke(arg1, Boolean.FALSE);
            } catch (Throwable var3) {
            }
        }
        if (arg0 > 125) {
            arg1.addKeyListener(class107.field1553);
            arg1.addFocusListener(class107.field1553);
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(Lve;III)Lij;")
    public static final class69 method1347(class233 arg0, int arg1, int arg2, int arg3) {
        field3031++;
        if (class110.method718(arg0, (byte) -117, arg2, arg3)) {
            return arg1 == 0 ? class63.method443(false) : null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(III)V")
    public static final void method1348(int arg0, int arg1, int arg2) {
        field3033++;
        class270 var3 = class190.method1213(25702, arg0, arg2);
        var3.method1808((byte) 62);
        var3.field4226 = arg1;
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(Z)V")
    public static void method1349(boolean arg0) {
        field3030 = null;
        field3034 = null;
        field3035 = null;
        if (!arg0) {
            field3035 = null;
        }
        field3037 = null;
    }
}
