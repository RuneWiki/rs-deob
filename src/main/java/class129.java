import java.lang.reflect.Field;
import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jj")
public class class129 {

    @OriginalMember(owner = "client!jj", name = "d", descriptor = "I")
    public static int field1928 = 0;

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "I")
    public static int field1925;

    @OriginalMember(owner = "client!jj", name = "b", descriptor = "I")
    public static int field1926;

    @OriginalMember(owner = "client!jj", name = "c", descriptor = "I")
    public static int field1927;

    @OriginalMember(owner = "client!jj", name = "e", descriptor = "I")
    public static int field1929;

    // $FF: synthetic field
    @OriginalMember(owner = "client!jj", name = "g", descriptor = "Ljava/lang/Class;")
    public static Class field1931;

    // $FF: synthetic field
    @OriginalMember(owner = "client!jj", name = "h", descriptor = "Ljava/lang/Class;")
    public static Class field1932;

    @OriginalMember(owner = "client!jj", name = "f", descriptor = "Ljava/util/zip/Inflater;")
    private Inflater field1930;

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(I)I")
    public static final int method1040(int arg0) {
        if (arg0 != 1) {
            field1928 = 109;
        }
        field1927++;
        int var1 = 0;
        Field[] var2 = (field1931 == null ? (field1931 = method1044("fca")) : field1931).getDeclaredFields();
        Field[] var3 = var2;
        for (int var4 = 0; var4 < var3.length; var4++) {
            Field var5 = var3[var4];
            if ((field1932 == null ? (field1932 = method1044("dea")) : field1932).isAssignableFrom(var5.getType())) {
                var1++;
            }
        }
        return var1 + 1;
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "([BI)[B")
    public final byte[] method1041(byte[] arg0, int arg1) {
        field1929++;
        class376 var3 = new class376(arg0);
        var3.field5459 = arg0.length - 4;
        int var4 = var3.method2399((byte) 70);
        if (arg1 == 10) {
            byte[] var5 = new byte[var4];
            var3.field5459 = 0;
            this.method1042(true, var5, var3);
            return var5;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(Z[BLjp;)V")
    public final void method1042(boolean arg0, byte[] arg1, class376 arg2) {
        field1926++;
        if (arg2.field5518[arg2.field5459] != 31 || arg2.field5518[arg2.field5459 + 1] != -117) {
            throw new RuntimeException("Invalid GZIP header!");
        }
        if (this.field1930 == null) {
            this.field1930 = new Inflater(true);
        }
        try {
            this.field1930.setInput(arg2.field5518, arg2.field5459 + 10, arg2.field5518.length + -10 + -arg2.field5459 + -8);
            if (!arg0) {
                this.method1042(false, null, null);
            }
            this.field1930.inflate(arg1);
        } catch (Exception var4) {
            this.field1930.reset();
            throw new RuntimeException("Invalid GZIP compressed data!");
        }
        this.field1930.reset();
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(IILjava/lang/String;IZ)V")
    public static final void method1043(int arg0, int arg1, String arg2, int arg3, boolean arg4) {
        class344.method2185(null, arg4, 0, arg2, arg0, false, arg3);
        if (arg1 != 1) {
            field1928 = -95;
        }
        field1925++;
    }

    @OriginalMember(owner = "client!jj", name = "<init>", descriptor = "()V")
    public class129() {
        this(-1, 1000000, 1000000);
    }

    @OriginalMember(owner = "client!jj", name = "<init>", descriptor = "(III)V")
    private class129(int arg0, int arg1, int arg2) {
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1044(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
