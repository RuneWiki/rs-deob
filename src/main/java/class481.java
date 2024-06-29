import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gq")
public abstract class class481 extends class11 {

    @OriginalMember(owner = "client!gq", name = "v", descriptor = "Z")
    public volatile boolean field6415 = true;

    @OriginalMember(owner = "client!gq", name = "t", descriptor = "Z")
    public static boolean field6413 = false;

    @OriginalMember(owner = "client!gq", name = "x", descriptor = "I")
    public static int field6417;

    @OriginalMember(owner = "client!gq", name = "u", descriptor = "Z")
    public boolean field6414;

    @OriginalMember(owner = "client!gq", name = "w", descriptor = "Z")
    public boolean field6416;

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(Lii;IILjava/awt/Component;I)Lsr;", line = 3)
    public static final class234 method2683(class519 arg0, int arg1, int arg2, Component arg3, int arg4) {
        field6417++;
        if (class443.field6071 == 0) {
            throw new IllegalStateException();
        } else if (arg1 >= 0 && arg1 < 2) {
            if (arg2 < 256) {
                arg2 = 256;
            }
            try {
                class234 var5 = (class234) Class.forName("wp").getDeclaredConstructor().newInstance();
                var5.field3308 = arg2;
                var5.field3293 = new int[(class79.field1234 ? 2 : 1) * 256];
                var5.method1144(arg3);
                var5.field3306 = (arg2 & 0xFFFFFC00) + 1024;
                if (var5.field3306 > 16384) {
                    var5.field3306 = 16384;
                }
                var5.method1142(var5.field3306);
                if (class100.field1496 > 0 && class117.field1995 == null) {
                    class117.field1995 = new class700();
                    class117.field1995.field9854 = arg0;
                    arg0.method2904(class117.field1995, class100.field1496, (byte) 112);
                }
                if (class117.field1995 != null) {
                    if (class117.field1995.field9852[arg1] != null) {
                        throw new IllegalArgumentException();
                    }
                    class117.field1995.field9852[arg1] = var5;
                }
                return var5;
            } catch (Throwable var8) {
                try {
                    class652 var6 = new class652(arg0, arg1);
                    var6.field3293 = new int[(class79.field1234 ? 2 : 1) * 256];
                    var6.field3308 = arg2;
                    var6.method1144(arg3);
                    var6.field3306 = arg4;
                    var6.method1142(var6.field3306);
                    if (class100.field1496 > 0 && class117.field1995 == null) {
                        class117.field1995 = new class700();
                        class117.field1995.field9854 = arg0;
                        arg0.method2904(class117.field1995, class100.field1496, (byte) 103);
                    }
                    if (class117.field1995 != null) {
                        if (class117.field1995.field9852[arg1] != null) {
                            throw new IllegalArgumentException();
                        }
                        class117.field1995.field9852[arg1] = var6;
                    }
                    return var6;
                } catch (Throwable var7) {
                    return new class234();
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(I)[B")
    public abstract byte[] method2645(int arg0);

    @OriginalMember(owner = "client!gq", name = "c", descriptor = "(I)I")
    public abstract int method2646(int arg0);
}
