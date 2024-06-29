import java.lang.reflect.Method;
import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sb")
public class class278 {

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "I")
    public static int field4388;

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "I")
    public static int field4389;

    @OriginalMember(owner = "client!sb", name = "d", descriptor = "I")
    public static int field4391;

    @OriginalMember(owner = "client!sb", name = "e", descriptor = "I")
    public static int field4392;

    @OriginalMember(owner = "client!sb", name = "f", descriptor = "I")
    public static int field4393;

    @OriginalMember(owner = "client!sb", name = "g", descriptor = "I")
    public static int field4394;

    @OriginalMember(owner = "client!sb", name = "c", descriptor = "Lhq;")
    public static class36 field4390;

    // $FF: synthetic field
    @OriginalMember(owner = "client!sb", name = "i", descriptor = "Ljava/lang/Class;")
    public static Class field4396;

    @OriginalMember(owner = "client!sb", name = "h", descriptor = "Ljava/util/zip/Inflater;")
    private Inflater field4395;

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(I)V")
    public static void method1864(int arg0) {
        field4390 = null;
        if (arg0 > -38) {
            method1864(28);
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(B)V")
    public static final void method1865(byte arg0) {
        field4391++;
        if (class2.field15 == 2) {
            class491.field7438 = 96;
        } else {
            try {
                Method var1 = (field4396 == null ? (field4396 = method1870("java.lang.Runtime")) : field4396).getMethod("maxMemory");
                if (var1 != null) {
                    try {
                        Runtime var2 = Runtime.getRuntime();
                        Long var3 = (Long) var1.invoke(var2, (Object[]) null);
                        class491.field7438 = (int) (var3 / 1048576L) + 1;
                    } catch (Throwable var5) {
                    }
                }
            } catch (Exception var6) {
            }
        }
        int var4 = 12 % ((arg0 - 22) / 48);
    }

    @OriginalMember(owner = "client!sb", name = "<init>", descriptor = "()V")
    public class278() {
        this(-1, 1000000, 1000000);
    }

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "(B)V")
    public static final void method1866(byte arg0) {
        if (arg0 >= -88) {
            method1868(-12, -33);
        }
        class12.field123 = true;
        field4392++;
    }

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "(I)V")
    public static final void method1867(int arg0) {
        if (arg0 != 21029) {
            method1864(113);
        }
        field4393++;
        if (class205.field3137) {
            return;
        }
        class528.field7774 = true;
        class205.field3137 = true;
        if (class141.field1911.field6082) {
            class135.field1824 = ((int) class135.field1824 + 47 & 0xFFFFFFF0);
        } else {
            class131.field1781 += (12.0F - class131.field1781) / 2.0F;
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(II)I")
    public static final int method1868(int arg0, int arg1) {
        if (arg0 != 633944551) {
            field4388 = 90;
        }
        field4389++;
        return arg1 >>> 7;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(BLhw;[B)V")
    public final void method1869(byte arg0, class208 arg1, byte[] arg2) {
        field4394++;
        if (arg1.field3193[arg1.field3162] != 31 || arg1.field3193[arg1.field3162 + 1] != -117) {
            throw new RuntimeException("Invalid GZIP header!");
        }
        if (this.field4395 == null) {
            this.field4395 = new Inflater(true);
        }
        try {
            this.field4395.setInput(arg1.field3193, arg1.field3162 + 10, -10 - (8 - arg1.field3193.length + arg1.field3162));
            this.field4395.inflate(arg2);
            if (arg0 != 10) {
                method1865((byte) 41);
            }
        } catch (Exception var4) {
            this.field4395.reset();
            throw new RuntimeException("Invalid GZIP compressed data!");
        }
        this.field4395.reset();
    }

    @OriginalMember(owner = "client!sb", name = "<init>", descriptor = "(III)V")
    private class278(int arg0, int arg1, int arg2) {
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1870(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
