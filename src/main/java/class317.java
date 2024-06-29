import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vi")
public class class317 extends class161 {

    @OriginalMember(owner = "client!vi", name = "l", descriptor = "J")
    public long field4968;

    @OriginalMember(owner = "client!vi", name = "n", descriptor = "I")
    public static int field4970 = 2;

    @OriginalMember(owner = "client!vi", name = "o", descriptor = "[Ljava/lang/String;")
    public static String[] field4971 = null;

    @OriginalMember(owner = "client!vi", name = "m", descriptor = "I")
    public static int field4969;

    @OriginalMember(owner = "client!vi", name = "p", descriptor = "I")
    public static int field4972;

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(IIII)I")
    public static final int method2109(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg3 & 0x3;
        field4969++;
        if (var4 == 0) {
            return arg2;
        }
        if (arg1 != 1023) {
            method2109(-17, 120, -18, 26);
        }
        if (var4 == 1) {
            return 1023 - arg0;
        } else if (var4 == 2) {
            return 1023 - arg2;
        } else {
            return arg0;
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(ZLjava/lang/String;)I")
    public static final int method2110(boolean arg0, String arg1) {
        if (arg0) {
            field4972++;
            return arg1.length() + 1;
        } else {
            return 35;
        }
    }

    @OriginalMember(owner = "client!vi", name = "<init>", descriptor = "()V")
    public class317() {
    }

    @OriginalMember(owner = "client!vi", name = "<init>", descriptor = "(J)V")
    public class317(long arg0) {
        this.field4968 = arg0;
    }

    @OriginalMember(owner = "client!vi", name = "d", descriptor = "(I)V")
    public static void method2111(int arg0) {
        if (arg0 <= 104) {
            method2111(-105);
        }
        field4971 = null;
    }
}
