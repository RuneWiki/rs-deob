import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vq")
public class class320 extends class234 {

    @OriginalMember(owner = "client!vq", name = "v", descriptor = "I")
    public int field4425 = -1;

    @OriginalMember(owner = "client!vq", name = "r", descriptor = "Z")
    public static boolean field4421 = true;

    @OriginalMember(owner = "client!vq", name = "u", descriptor = "I")
    public static int field4424 = -2;

    @OriginalMember(owner = "client!vq", name = "z", descriptor = "Llg;")
    public static class284 field4429 = new class284(9, 7);

    @OriginalMember(owner = "client!vq", name = "A", descriptor = "Lub;")
    public static class18 field4430 = new class18("RC", 1);

    @OriginalMember(owner = "client!vq", name = "q", descriptor = "I")
    public static int field4420;

    @OriginalMember(owner = "client!vq", name = "s", descriptor = "I")
    public static int field4422;

    @OriginalMember(owner = "client!vq", name = "t", descriptor = "I")
    public static int field4423;

    @OriginalMember(owner = "client!vq", name = "w", descriptor = "I")
    public static int field4426;

    @OriginalMember(owner = "client!vq", name = "y", descriptor = "I")
    public int field4428;

    @OriginalMember(owner = "client!vq", name = "x", descriptor = "Ljava/lang/String;")
    public String field4427;

    @OriginalMember(owner = "client!vq", name = "B", descriptor = "Ljava/lang/String;")
    public String field4431;

    @OriginalMember(owner = "client!vq", name = "b", descriptor = "(I)V")
    public static void method1808(int arg0) {
        field4430 = null;
        field4429 = null;
        if (arg0 > -93) {
            field4429 = null;
        }
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(BI)I")
    public static final int method1809(byte arg0, int arg1) {
        ++field4420;
        int var2 = (arg1 * arg1 >> 12) * arg1 >> 12;
        int var3 = arg1 * 6 + -61440;
        int var4 = -103 % ((arg0 - 29) / 47);
        int var5 = (arg1 * var3 >> 12) + 40960;
        return var2 * var5 >> 12;
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(Lkj;ILjava/awt/Component;II)Lhv;")
    public static final class359 method1810(class397 arg0, int arg1, Component arg2, int arg3, int arg4) {
        ++field4422;
        if (~class12.field141 == -1) {
            throw new IllegalStateException();
        } else if (arg3 >= arg1 && arg3 < 2) {
            if (~arg4 > -257) {
                arg4 = 256;
            }
            try {
                class359 var5 = (class359) Class.forName("kb").newInstance();
                var5.field4913 = new int[256 * (class149.field2109 ? 2 : 1)];
                var5.field4920 = arg4;
                var5.method1993(arg2);
                var5.field4914 = (arg4 & -1024) - -1024;
                if (~var5.field4914 < -16385) {
                    var5.field4914 = 16384;
                }
                var5.method1984(var5.field4914);
                if (~class166.field2354 < -1 && class1.field1 == null) {
                    class1.field1 = new class96();
                    class1.field1.field1331 = arg0;
                    arg0.method2296(class166.field2354, class1.field1, (byte) 32);
                }
                if (class1.field1 != null) {
                    if (class1.field1.field1335[arg3] != null) {
                        throw new IllegalArgumentException();
                    }
                    class1.field1.field1335[arg3] = var5;
                }
                return var5;
            } catch (Throwable var8) {
                try {
                    class375 var6 = new class375(arg0, arg3);
                    var6.field4920 = arg4;
                    var6.field4913 = new int[(class149.field2109 ? 2 : 1) * 256];
                    var6.method1993(arg2);
                    var6.field4914 = 16384;
                    var6.method1984(var6.field4914);
                    if (class166.field2354 > 0 && class1.field1 == null) {
                        class1.field1 = new class96();
                        class1.field1.field1331 = arg0;
                        arg0.method2296(class166.field2354, class1.field1, (byte) 32);
                    }
                    if (class1.field1 != null) {
                        if (class1.field1.field1335[arg3] != null) {
                            throw new IllegalArgumentException();
                        }
                        class1.field1.field1335[arg3] = var6;
                    }
                    return var6;
                } catch (Throwable var7) {
                    return new class359();
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(B)Lal;")
    public final class65 method1811(byte arg0) {
        if (arg0 <= 53) {
            this.field4428 = 103;
        }
        ++field4423;
        return class309.field4236[super.field3237];
    }
}
