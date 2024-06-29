import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lea")
public class class327 {

    @OriginalMember(owner = "client!lea", name = "b", descriptor = "[I")
    public static int[] field4007 = new int[8];

    @OriginalMember(owner = "client!lea", name = "a", descriptor = "I")
    public static int field4006;

    @OriginalMember(owner = "client!lea", name = "c", descriptor = "I")
    public static int field4008;

    @OriginalMember(owner = "client!lea", name = "d", descriptor = "Ljava/lang/String;")
    public static String field4009;

    @OriginalMember(owner = "client!lea", name = "a", descriptor = "(DZ)V")
    public static final void method1840(double arg0, boolean arg1) {
        field4008++;
        if (arg1) {
            method1842((byte) 30);
        }
        if (class333.field4182 == arg0) {
            return;
        }
        for (int var3 = 0; var3 < 256; var3++) {
            int var4 = (int) (Math.pow((double) var3 / 255.0D, arg0) * 255.0D);
            class494.field7159[var3] = var4 > 255 ? 255 : var4;
        }
        class333.field4182 = arg0;
    }

    @OriginalMember(owner = "client!lea", name = "a", descriptor = "(Ljava/awt/Component;Lpi;BII)Lcv;")
    public static final class632 method1841(Component arg0, class464 arg1, byte arg2, int arg3, int arg4) {
        field4006++;
        if (class224.field2776 == 0) {
            throw new IllegalStateException();
        } else if (arg3 >= 0 && arg3 < 2) {
            if (arg4 < 256) {
                arg4 = 256;
            }
            try {
                class632 var5 = (class632) Class.forName("oda").getDeclaredConstructor().newInstance();
                var5.field8895 = new int[(class60.field614 ? 2 : 1) * 256];
                var5.field8916 = arg4;
                var5.method211(arg0);
                var5.field8914 = (arg4 & 0xFFFFFC00) + 1024;
                if (var5.field8914 > 16384) {
                    var5.field8914 = 16384;
                }
                var5.method212(var5.field8914);
                if (class142.field1570 > 0 && class107.field1161 == null) {
                    class107.field1161 = new class35();
                    class107.field1161.field349 = arg1;
                    arg1.method2668(class107.field1161, class142.field1570, arg2 - 39);
                }
                if (class107.field1161 != null) {
                    if (class107.field1161.field346[arg3] != null) {
                        throw new IllegalArgumentException();
                    }
                    class107.field1161.field346[arg3] = var5;
                }
                return var5;
            } catch (Throwable var8) {
                try {
                    class40 var6 = new class40(arg1, arg3);
                    var6.field8916 = arg4;
                    var6.field8895 = new int[(class60.field614 ? 2 : 1) * 256];
                    var6.method211(arg0);
                    var6.field8914 = 16384;
                    if (arg2 != 54) {
                        method1842((byte) 124);
                    }
                    var6.method212(var6.field8914);
                    if (class142.field1570 > 0 && class107.field1161 == null) {
                        class107.field1161 = new class35();
                        class107.field1161.field349 = arg1;
                        arg1.method2668(class107.field1161, class142.field1570, arg2 - 55);
                    }
                    if (class107.field1161 != null) {
                        if (class107.field1161.field346[arg3] != null) {
                            throw new IllegalArgumentException();
                        }
                        class107.field1161.field346[arg3] = var6;
                    }
                    return var6;
                } catch (Throwable var7) {
                    return new class632();
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!lea", name = "a", descriptor = "(B)V")
    public static void method1842(byte arg0) {
        field4009 = null;
        field4007 = null;
        if (arg0 != -17) {
            field4007 = null;
        }
    }
}
