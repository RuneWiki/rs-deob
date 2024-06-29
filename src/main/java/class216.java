import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hm")
public abstract class class216 extends class143 {

    @OriginalMember(owner = "client!hm", name = "H", descriptor = "Ler;")
    public class209 field3257;

    @OriginalMember(owner = "client!hm", name = "G", descriptor = "I")
    public int field3256;

    @OriginalMember(owner = "client!hm", name = "C", descriptor = "S")
    public static short field3252 = 32767;

    @OriginalMember(owner = "client!hm", name = "F", descriptor = "[I")
    public static int[] field3255 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!hm", name = "A", descriptor = "I")
    public static int field3250;

    @OriginalMember(owner = "client!hm", name = "B", descriptor = "I")
    public static int field3251;

    @OriginalMember(owner = "client!hm", name = "D", descriptor = "I")
    public static int field3253;

    @OriginalMember(owner = "client!hm", name = "E", descriptor = "I")
    public static int field3254;

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(IZLvo;ZIII)V", line = 5)
    public static final void method1458(int arg0, boolean arg1, class345 arg2, boolean arg3, int arg4, int arg5, int arg6) {
        if (arg1) {
            field3255 = null;
        }
        class434.field6249 = arg6;
        class345.field4882 = arg0;
        class586.field8566 = arg2;
        class484.field6903 = null;
        field3250++;
        class160.field2599 = arg5;
        class568.field8311 = 1;
        class277.field3927 = arg3;
        class309.field4295 = arg4;
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(ZII)Z", line = 25)
    public static final boolean method1459(boolean arg0, int arg1, int arg2) {
        if (arg0) {
            return false;
        } else {
            field3253++;
            return (arg2 & 0x34) != 0;
        }
    }

    @OriginalMember(owner = "client!hm", name = "c", descriptor = "(I)V", line = 44)
    public static void method1460(int arg0) {
        if (arg0 == 1) {
            field3255 = null;
        }
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;", line = 54)
    public static final String method1461(int arg0, String arg1) {
        if (arg0 != -7256) {
            return null;
        }
        field3251++;
        String var2 = class311.method1880(class294.method1798(true, arg1), -106);
        if (var2 == null) {
            var2 = "";
        }
        return var2;
    }

    @OriginalMember(owner = "client!hm", name = "<init>", descriptor = "(Ler;I)V", line = 80)
    public class216(class209 arg0, int arg1) {
        this.field3257 = arg0;
        this.field3256 = arg1;
    }

    @OriginalMember(owner = "client!hm", name = "f", descriptor = "(I)V", line = 89)
    public static final void method1462(int arg0) {
        if (arg0 != 8) {
            method1462(-22);
        }
        field3254++;
        class428.field6114 = new class105[50];
        class222.field3314 = 0;
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(I)Z")
    public abstract boolean method61(int arg0);

    @OriginalMember(owner = "client!hm", name = "d", descriptor = "(I)Ljava/lang/Object;")
    public abstract Object method59(int arg0);
}
