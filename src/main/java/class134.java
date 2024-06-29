import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hf")
public class class134 extends class107 {

    @OriginalMember(owner = "client!hf", name = "P", descriptor = "I")
    public static int field2339;

    @OriginalMember(owner = "client!hf", name = "Q", descriptor = "I")
    public static int field2340;

    @OriginalMember(owner = "client!hf", name = "R", descriptor = "I")
    public static int field2341;

    @OriginalMember(owner = "client!hf", name = "T", descriptor = "I")
    public static int field2343;

    @OriginalMember(owner = "client!hf", name = "S", descriptor = "[I")
    public static int[] field2342;

    @OriginalMember(owner = "client!hf", name = "d", descriptor = "(B)V")
    public static void method932(byte arg0) {
        int var1 = 0 / ((arg0 - 20) / 59);
        field2342 = null;
    }

    @OriginalMember(owner = "client!hf", name = "<init>", descriptor = "()V")
    public class134() {
        super(0, true);
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(Ljava/awt/Component;IBLaf;I)Loj;")
    public static final class156 method933(Component arg0, int arg1, byte arg2, class67 arg3, int arg4) {
        if (arg2 != 93) {
            method933((Component) null, -67, (byte) -115, (class67) null, 105);
        }
        ++field2339;
        if (class255.field4372 == 0) {
            throw new IllegalStateException();
        } else if (arg1 >= 0 && arg1 < 2) {
            if (~arg4 > -257) {
                arg4 = 256;
            }
            try {
                class156 var5 = (class156) Class.forName("d").newInstance();
                var5.field2772 = new int[(!class268.field4571 ? 1 : 2) * 256];
                var5.field2781 = arg4;
                var5.method1086(arg0);
                var5.field2786 = (-1024 & arg4) - -1024;
                if (~var5.field2786 < -16385) {
                    var5.field2786 = 16384;
                }
                var5.method1072(var5.field2786);
                if (~class47.field1023 < -1 && class183.field3214 == null) {
                    class183.field3214 = new class33();
                    class183.field3214.field700 = arg3;
                    arg3.method542(class183.field3214, 0, class47.field1023);
                }
                if (class183.field3214 != null) {
                    if (class183.field3214.field699[arg1] != null) {
                        throw new IllegalArgumentException();
                    }
                    class183.field3214.field699[arg1] = var5;
                }
                return var5;
            } catch (Throwable var8) {
                try {
                    class251 var6 = new class251(arg3, arg1);
                    var6.field2772 = new int[(class268.field4571 ? 2 : 1) * 256];
                    var6.field2781 = arg4;
                    var6.method1086(arg0);
                    var6.field2786 = 16384;
                    var6.method1072(var6.field2786);
                    if (~class47.field1023 < -1 && class183.field3214 == null) {
                        class183.field3214 = new class33();
                        class183.field3214.field700 = arg3;
                        arg3.method542(class183.field3214, arg2 ^ 93, class47.field1023);
                    }
                    if (class183.field3214 != null) {
                        if (class183.field3214.field699[arg1] != null) {
                            throw new IllegalArgumentException();
                        }
                        class183.field3214.field699[arg1] = var6;
                    }
                    return var6;
                } catch (Throwable var7) {
                    return new class156();
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "(BI)[I")
    public final int[] method123(byte arg0, int arg1) {
        int[] var3 = super.field1921.method1388(arg1, (byte) -26);
        if (arg0 != -17) {
            method932((byte) 54);
        }
        if (super.field1921.field3539) {
            class171.method1186(var3, 0, class106.field1862, class185.field3233[arg1]);
        }
        ++field2343;
        return var3;
    }
}
