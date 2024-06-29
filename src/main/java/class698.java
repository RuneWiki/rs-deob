import java.io.File;
import java.lang.reflect.Method;
import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dl")
public class class698 {

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "I")
    public static int field9743;

    @OriginalMember(owner = "client!dl", name = "b", descriptor = "I")
    public static int field9744;

    @OriginalMember(owner = "client!dl", name = "c", descriptor = "I")
    public static int field9745;

    @OriginalMember(owner = "client!dl", name = "d", descriptor = "I")
    public static int field9746;

    @OriginalMember(owner = "client!dl", name = "e", descriptor = "I")
    public static int field9747;

    @OriginalMember(owner = "client!dl", name = "f", descriptor = "I")
    public static int field9748;

    @OriginalMember(owner = "client!dl", name = "h", descriptor = "I")
    public static int field9750;

    // $FF: synthetic field
    @OriginalMember(owner = "client!dl", name = "i", descriptor = "Ljava/lang/Class;")
    public static Class field9751;

    @OriginalMember(owner = "client!dl", name = "g", descriptor = "Ljava/util/zip/Inflater;")
    private Inflater field9749;

    // $FF: synthetic method
    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method3947(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Class;I)Z", line = 11)
    public static final boolean method3941(String arg0, Class arg1, int arg2) {
        if (arg2 >= -33) {
            return false;
        }
        field9750++;
        Class var3 = (Class) class581.field7957.get(arg0);
        if (var3 != null) {
            return var3.getClassLoader() == arg1.getClassLoader();
        }
        File var4 = null;
        if (var4 == null) {
            var4 = (File) class380.field5454.get(arg0);
        }
        if (var4 != null) {
            try {
                var4 = new File(var4.getCanonicalPath());
                Class var5 = Class.forName("java.lang.Runtime");
                Class var6 = Class.forName("java.lang.reflect.AccessibleObject");
                Method var7 = var6.getDeclaredMethod("setAccessible", Boolean.TYPE);
                Method var8 = var5.getDeclaredMethod("load0", Class.forName("java.lang.Class"), Class.forName("java.lang.String"));
                var7.invoke(var8, Boolean.TRUE);
                var8.invoke(Runtime.getRuntime(), arg1, var4.getPath());
                var7.invoke(var8, Boolean.FALSE);
                class581.field7957.put(arg0, arg1);
                return true;
            } catch (NoSuchMethodException var9) {
                System.load(var4.getPath());
                class581.field7957.put(arg0, field9751 == null ? (field9751 = method3947("eea")) : field9751);
                return true;
            } catch (Throwable var10) {
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(I)V", line = 86)
    public static final void method3942(int arg0) {
        field9747++;
        int var1 = 119 / ((4 - arg0) / 44);
        class443.method2709(5660);
        class402.method2512((byte) 123, 2, class332.field4707.field4778.method2193(0) == 1, 22050);
        class221.field2991 = class489.method2965((byte) 113, class570.field7875, 0, 22050, class159.field2227);
        class714.method4013(class38.method203(112, null), 512, true);
        class264.field3869 = class489.method2965((byte) 88, class570.field7875, 1, 2048, class159.field2227);
        class264.field3869.method3157(class483.field6739, 256);
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(II)I", line = 101)
    public static final int method3943(int arg0, int arg1) {
        field9748++;
        byte var2;
        if (arg1 > 12000) {
            var2 = 4;
            class320.method2066((byte) -127);
        } else if (arg1 > 5000) {
            var2 = 3;
            class699.method3950((byte) -123);
        } else if (arg1 > 2000) {
            var2 = 2;
            class710.method3995((byte) -125);
        } else {
            class611.method3466((byte) 4, true);
            var2 = 1;
        }
        if (class332.field4707.field4789.method963(arg0 ^ arg0) != 2) {
            class332.field4707.method2158(2, class332.field4707.field4753, -15);
            class393.method2459(2, false, 1);
        }
        class263.method1802(-2);
        return var2;
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "([BIB)[B", line = 145)
    public static final byte[] method3944(byte[] arg0, int arg1, byte arg2) {
        if (arg2 < 92) {
            method3941(null, null, 109);
        }
        field9745++;
        byte[] var3 = new byte[arg1];
        class245.method1646(arg0, 0, var3, 0, arg1);
        return var3;
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "([BI)[B", line = 160)
    public final byte[] method3945(byte[] arg0, int arg1) {
        field9743++;
        class63 var3 = new class63(arg0);
        if (arg1 != -26956) {
            method3942(-33);
        }
        var3.field956 = arg0.length - 4;
        int var4 = var3.method472(arg1 - 884480972);
        var3.field956 = 0;
        byte[] var5 = new byte[var4];
        this.method3946(var5, 124, var3);
        return var5;
    }

    @OriginalMember(owner = "client!dl", name = "<init>", descriptor = "()V", line = 181)
    public class698() {
        this(-1, 1000000, 1000000);
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "([BILdc;)V", line = 185)
    public final void method3946(byte[] arg0, int arg1, class63 arg2) {
        field9744++;
        if (arg2.field954[arg2.field956] != 31 || arg2.field954[arg2.field956 + 1] != -117) {
            throw new RuntimeException("Invalid GZIP header!");
        }
        if (this.field9749 == null) {
            this.field9749 = new Inflater(true);
        }
        try {
            int var4 = -23 / ((arg1 - 49) / 62);
            this.field9749.setInput(arg2.field954, arg2.field956 + 10, -arg2.field956 - (18 - arg2.field954.length));
            this.field9749.inflate(arg0);
        } catch (Exception var5) {
            this.field9749.reset();
            throw new RuntimeException("Invalid GZIP compressed data!");
        }
        this.field9749.reset();
    }

    @OriginalMember(owner = "client!dl", name = "<init>", descriptor = "(III)V", line = 207)
    private class698(int arg0, int arg1, int arg2) {
    }
}
