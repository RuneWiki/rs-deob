import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lk")
public class class423 extends class513 {

    @OriginalMember(owner = "client!lk", name = "G", descriptor = "Ljava/lang/Object;")
    private Object field5956;

    @OriginalMember(owner = "client!lk", name = "M", descriptor = "[F")
    public static float[] field5962 = new float[16384];

    @OriginalMember(owner = "client!lk", name = "N", descriptor = "[F")
    public static float[] field5963 = new float[16384];

    @OriginalMember(owner = "client!lk", name = "O", descriptor = "I")
    public static int field5964;

    @OriginalMember(owner = "client!lk", name = "H", descriptor = "I")
    public static int field5957;

    @OriginalMember(owner = "client!lk", name = "I", descriptor = "I")
    public static int field5958;

    @OriginalMember(owner = "client!lk", name = "J", descriptor = "I")
    public static int field5959;

    @OriginalMember(owner = "client!lk", name = "K", descriptor = "I")
    public static int field5960;

    @OriginalMember(owner = "client!lk", name = "L", descriptor = "I")
    public static int field5961;

    @OriginalMember(owner = "client!lk", name = "P", descriptor = "I")
    public static int field5965;

    static {
        double var0 = 3.834951969714103E-4D;
        for (int var2 = 0; var2 < 16384; var2++) {
            field5963[var2] = (float) Math.sin((double) var2 * var0);
            field5962[var2] = (float) Math.cos((double) var2 * var0);
        }
        field5964 = 503;
    }

    @OriginalMember(owner = "client!lk", name = "c", descriptor = "(B)V", line = 3)
    public static final void method2506(byte arg0) {
        if (arg0 != -105) {
            method2511((byte) 16);
        }
        field5957++;
        int var1 = class144.field1908;
        int[] var2 = class521.field7674;
        for (int var3 = 0; var3 < var1; var3++) {
            class22 var4 = class378.field5355[var2[var3]];
            if (var4 != null) {
                class165.method1046(var4.method125((byte) -128), var4, -119);
            }
        }
    }

    @OriginalMember(owner = "client!lk", name = "<init>", descriptor = "(Ljava/lang/Object;I)V", line = 32)
    public class423(Object arg0, int arg1) {
        super(arg1);
        this.field5956 = arg0;
    }

    @OriginalMember(owner = "client!lk", name = "h", descriptor = "(I)V", line = 40)
    public static final void method2507(int arg0) {
        int var1 = 117 / ((arg0 - 12) / 43);
        field5959++;
        if (!class103.method707(-3)) {
            return;
        }
        if (class133.field1752 == null) {
            class45.method259(41);
        }
        class535.field7837 = true;
        class421.field5931 = 0;
        try {
            class2.field61 = class534.field7831.getToolkit().getSystemClipboard();
        } catch (Exception var2) {
        }
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(I)Z", line = 63)
    public final boolean method2508(int arg0) {
        if (arg0 != 23800) {
            this.field5956 = null;
        }
        field5960++;
        return false;
    }

    @OriginalMember(owner = "client!lk", name = "b", descriptor = "(II)Lkf;", line = 77)
    public static final class170 method2509(int arg0, int arg1) {
        if (arg0 != 0) {
            field5963 = null;
        }
        field5958++;
        class477[] var2 = class38.field412;
        synchronized (class38.field412) {
            class170 var3;
            if (class38.field412.length <= arg1 || class38.field412[arg1].method2747((byte) -124)) {
                var3 = new class170();
                var3.field2475 = new class122[arg1];
                for (int var4 = 0; var4 < arg1; var4++) {
                    var3.field2475[var4] = new class122();
                }
            } else {
                var3 = (class170) class38.field412[arg1].method2752(false);
                var3.method1805((byte) 89);
                int var10002 = class516.field7602[arg1]--;
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(B)Ljava/lang/Object;", line = 112)
    public final Object method2510(byte arg0) {
        int var2 = 65 % ((13 - arg0) / 36);
        field5961++;
        return this.field5956;
    }

    @OriginalMember(owner = "client!lk", name = "e", descriptor = "(B)V", line = 123)
    public static void method2511(byte arg0) {
        field5963 = null;
        field5962 = null;
        if (arg0 <= 17) {
            method2511((byte) -29);
        }
    }
}
