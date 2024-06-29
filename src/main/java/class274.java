import java.awt.Component;
import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ms")
public class class274 {

    @OriginalMember(owner = "client!ms", name = "f", descriptor = "Ljava/lang/String;")
    public static String field4027 = "Loading title screen - ";

    @OriginalMember(owner = "client!ms", name = "e", descriptor = "Z")
    public static boolean field4026 = false;

    @OriginalMember(owner = "client!ms", name = "l", descriptor = "I")
    public static int field4033 = 0;

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "I")
    public static int field4022;

    @OriginalMember(owner = "client!ms", name = "c", descriptor = "I")
    public static int field4024;

    @OriginalMember(owner = "client!ms", name = "h", descriptor = "I")
    public static int field4029;

    @OriginalMember(owner = "client!ms", name = "i", descriptor = "I")
    public static int field4030;

    @OriginalMember(owner = "client!ms", name = "j", descriptor = "I")
    public static int field4031;

    @OriginalMember(owner = "client!ms", name = "k", descriptor = "I")
    public static int field4032;

    @OriginalMember(owner = "client!ms", name = "g", descriptor = "J")
    public static long field4028;

    @OriginalMember(owner = "client!ms", name = "b", descriptor = "Lir;")
    public static class185 field4023;

    @OriginalMember(owner = "client!ms", name = "d", descriptor = "Ljava/util/zip/Inflater;")
    private Inflater field4025;

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    public static final void method1810(Component arg0, int arg1) {
        field4030++;
        arg0.removeMouseListener(class410.field5954);
        arg0.removeMouseMotionListener(class410.field5954);
        arg0.removeFocusListener(class410.field5954);
        class118.field1530 = arg1;
    }

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(Z)V")
    public static void method1811(boolean arg0) {
        if (arg0) {
            field4028 = 19L;
        }
        field4027 = null;
        field4023 = null;
    }

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(I)V")
    public static final void method1812(int arg0) {
        field4029++;
        for (int var1 = 0; var1 < 100; var1++) {
            class33.field536[var1] = true;
        }
        if (arg0 != -1695) {
            method1814((class248) null, 70);
        }
    }

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(I[BLfb;)V")
    public final void method1813(int arg0, byte[] arg1, class341 arg2) {
        if (arg0 != 116) {
            return;
        }
        field4022++;
        if (arg2.field5042[arg2.field5049] != 31 || arg2.field5042[arg2.field5049 + 1] != -117) {
            throw new RuntimeException("Invalid GZIP header!");
        }
        if (this.field4025 == null) {
            this.field4025 = new Inflater(true);
        }
        try {
            this.field4025.setInput(arg2.field5042, arg2.field5049 + 10, -arg2.field5049 - 18 + arg2.field5042.length);
            this.field4025.inflate(arg1);
        } catch (Exception var4) {
            this.field4025.reset();
            throw new RuntimeException("Invalid GZIP compressed data!");
        }
        this.field4025.reset();
    }

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(Lsj;I)Z")
    public static final boolean method1814(class248 arg0, int arg1) {
        if (arg1 >= -109) {
            method1811(false);
        }
        field4032++;
        if (arg0.field3595 == null) {
            return false;
        }
        for (int var2 = 0; var2 < arg0.field3595.length; var2++) {
            int var3 = class72.method589(var2, 20377, arg0);
            int var4 = arg0.field3540[var2];
            if (arg0.field3595[var2] == 2) {
                if (var3 >= var4) {
                    return false;
                }
            } else if (arg0.field3595[var2] == 3) {
                if (var4 >= var3) {
                    return false;
                }
            } else if (arg0.field3595[var2] == 4) {
                if (var3 == var4) {
                    return false;
                }
            } else if (var3 != var4) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!ms", name = "<init>", descriptor = "()V")
    public class274() {
        this(-1, 1000000, 1000000);
    }

    @OriginalMember(owner = "client!ms", name = "<init>", descriptor = "(III)V")
    private class274(int arg0, int arg1, int arg2) {
    }
}
