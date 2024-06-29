import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sm")
public class class178 implements Runnable {

    @OriginalMember(owner = "client!sm", name = "f", descriptor = "[Lem;")
    public volatile class14[] field2942 = new class14[2];

    @OriginalMember(owner = "client!sm", name = "j", descriptor = "Z")
    public volatile boolean field2946 = false;

    @OriginalMember(owner = "client!sm", name = "g", descriptor = "Z")
    public volatile boolean field2943 = false;

    @OriginalMember(owner = "client!sm", name = "e", descriptor = "I")
    public static int field2941 = -1;

    @OriginalMember(owner = "client!sm", name = "d", descriptor = "Z")
    public static boolean field2940 = false;

    @OriginalMember(owner = "client!sm", name = "i", descriptor = "[Ljava/lang/String;")
    public static String[] field2945 = new String[100];

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "I")
    public static int field2937 = 0;

    @OriginalMember(owner = "client!sm", name = "c", descriptor = "I")
    public static int field2939;

    @OriginalMember(owner = "client!sm", name = "h", descriptor = "I")
    public static int field2944;

    @OriginalMember(owner = "client!sm", name = "k", descriptor = "I")
    public static int field2947;

    @OriginalMember(owner = "client!sm", name = "m", descriptor = "Lla;")
    public class157 field2949;

    @OriginalMember(owner = "client!sm", name = "l", descriptor = "Lek;")
    public static class206 field2948;

    @OriginalMember(owner = "client!sm", name = "b", descriptor = "[[Lg;")
    public static class181[][] field2938;

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(B)V", line = 7)
    public static void method1258(byte arg0) {
        field2938 = (class181[][]) null;
        field2945 = null;
        int var1 = -79 / ((arg0 - 60) / 57);
        field2948 = null;
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(Lek;I)V", line = 20)
    public static final void method1259(class206 arg0, int arg1) {
        field2944++;
        class97.field1769 = arg0;
        if (arg1 >= -39) {
            method1260(false, -114);
        }
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(ZI)Lvn;", line = 35)
    public static final class362 method1260(boolean arg0, int arg1) {
        field2939++;
        class362 var2 = (class362) class23.field565.method893((long) arg1, 99);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class348.field5570.method1404(29, arg1, (byte) -89);
        class362 var4 = new class362();
        if (arg0) {
            return (class362) null;
        }
        if (var3 != null) {
            var4.method2544(0, new class146(var3), arg1);
        }
        class23.field565.method888((long) arg1, var4, 61);
        return var4;
    }

    @OriginalMember(owner = "client!sm", name = "run", descriptor = "()V", line = 76)
    public final void run() {
        this.field2943 = true;
        try {
            while (!this.field2946) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class14 var2 = this.field2942[var1];
                    if (var2 != null) {
                        var2.method151(false);
                    }
                }
                class122.method881(65, 10L);
                class363.method2547(0, (Object) null, this.field2949);
            }
        } catch (Exception var7) {
            class348.method2493(-26700, var7, (String) null);
        } finally {
            this.field2943 = false;
        }
        field2947++;
    }
}
