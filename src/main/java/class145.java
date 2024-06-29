import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qm")
public class class145 extends class38 {

    @OriginalMember(owner = "client!qm", name = "D", descriptor = "I")
    private int field1929 = 4096;

    @OriginalMember(owner = "client!qm", name = "J", descriptor = "I")
    private int field1933 = 0;

    @OriginalMember(owner = "client!qm", name = "I", descriptor = "Loi;")
    public static class73 field1932 = new class73("", 10);

    @OriginalMember(owner = "client!qm", name = "M", descriptor = "I")
    public static int field1936 = 0;

    @OriginalMember(owner = "client!qm", name = "O", descriptor = "[I")
    public static int[] field1938 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

    @OriginalMember(owner = "client!qm", name = "L", descriptor = "F")
    public static float field1935;

    @OriginalMember(owner = "client!qm", name = "F", descriptor = "I")
    public static int field1930;

    @OriginalMember(owner = "client!qm", name = "H", descriptor = "I")
    public static int field1931;

    @OriginalMember(owner = "client!qm", name = "K", descriptor = "I")
    public static int field1934;

    @OriginalMember(owner = "client!qm", name = "N", descriptor = "Lda;")
    public static class61 field1937;

    // $FF: synthetic field
    @OriginalMember(owner = "client!qm", name = "P", descriptor = "Ljava/lang/Class;")
    public static Class field1939;

    @OriginalMember(owner = "client!qm", name = "b", descriptor = "(I)V")
    public static void method1013(int arg0) {
        field1938 = null;
        field1932 = null;
        int var1 = 110 / ((-71 - arg0) / 50);
        field1937 = null;
    }

    @OriginalMember(owner = "client!qm", name = "c", descriptor = "(I)V")
    public static final void method1014(int arg0) {
        int var1 = -56 / ((arg0 - 6) / 43);
        ++field1931;
        if (class179.field2759.field10022) {
            class265.field3794 = 96;
        } else {
            try {
                Method var2 = (field1939 != null ? field1939 : (field1939 = method1015("java.lang.Runtime"))).getMethod("maxMemory");
                if (var2 != null) {
                    try {
                        Runtime var3 = Runtime.getRuntime();
                        Long var4 = (Long) var2.invoke(var3, (Object[]) null);
                        class265.field3794 = 1 + (int) (var4 / 1048576L);
                    } catch (Throwable var5) {
                    }
                }
            } catch (Exception var6) {
            }
        }
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(BI)[I")
    public final int[] method199(byte arg0, int arg1) {
        ++field1930;
        int[] var3 = super.field397.method1376(arg1, (byte) -4);
        if (super.field397.field3005) {
            int[] var4 = this.method189(arg1, 0, (byte) -92);
            for (int var5 = 0; ~var5 > ~class729.field10216; ++var5) {
                int var6 = var4[var5];
                var3[var5] = var6 >= this.field1933 && ~this.field1929 <= ~var6 ? 4096 : 0;
            }
        }
        if (arg0 > -43) {
            this.field1933 = -59;
        }
        return var3;
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(IILrg;)V")
    public final void method190(int arg0, int arg1, class645 arg2) {
        ++field1934;
        if (~arg1 != -1) {
            if (arg1 == 1) {
                this.field1929 = arg2.method3712((byte) 61);
            }
        } else {
            this.field1933 = arg2.method3712((byte) 105);
        }
        if (arg0 <= 34) {
            this.field1929 = -69;
        }
    }

    @OriginalMember(owner = "client!qm", name = "<init>", descriptor = "()V")
    public class145() {
        super(1, true);
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1015(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
