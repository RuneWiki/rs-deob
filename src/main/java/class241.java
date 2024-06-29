import java.awt.Component;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ac")
public class class241 implements Runnable {

    @OriginalMember(owner = "client!ac", name = "e", descriptor = "[Lea;")
    public volatile class246[] field3758 = new class246[2];

    @OriginalMember(owner = "client!ac", name = "d", descriptor = "Z")
    public volatile boolean field3757 = false;

    @OriginalMember(owner = "client!ac", name = "i", descriptor = "Z")
    public volatile boolean field3762 = false;

    @OriginalMember(owner = "client!ac", name = "f", descriptor = "Lod;")
    public static class223 field3759 = new class223(16);

    @OriginalMember(owner = "client!ac", name = "j", descriptor = "B")
    public static byte field3763;

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "I")
    public static int field3755;

    @OriginalMember(owner = "client!ac", name = "c", descriptor = "I")
    public static int field3756;

    @OriginalMember(owner = "client!ac", name = "g", descriptor = "I")
    public static int field3760;

    @OriginalMember(owner = "client!ac", name = "k", descriptor = "I")
    public static int field3764;

    @OriginalMember(owner = "client!ac", name = "l", descriptor = "I")
    public static int field3765;

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "Lvc;")
    public class137 field3754;

    @OriginalMember(owner = "client!ac", name = "h", descriptor = "Lug;")
    public static class253 field3761;

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(Ljava/lang/String;IB)I", line = 7)
    public static final int method1718(String arg0, int arg1, byte arg2) {
        if (arg2 < 71) {
            field3763 = 113;
        }
        field3760++;
        return class63.method510(arg0, true, arg1, 2);
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(III)V", line = 18)
    public static final void method1719(int arg0, int arg1, int arg2) {
        field3756++;
        if (arg1 <= 79) {
            method1720(58);
        }
        class34 var3 = class91.method656(arg0, -2, 12);
        var3.method307(-19063);
        var3.field500 = arg2;
    }

    @OriginalMember(owner = "client!ac", name = "run", descriptor = "()V", line = 32)
    public final void run() {
        field3764++;
        this.field3762 = true;
        try {
            while (!this.field3757) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class246 var2 = this.field3758[var1];
                    if (var2 != null) {
                        var2.method1770(16384);
                    }
                }
                class272.method1918((byte) 22, 10L);
                class325.method2283((byte) -122, (Object) null, this.field3754);
            }
        } catch (Exception var7) {
            client.method949((String) null, var7, 24);
        } finally {
            this.field3762 = false;
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(I)V", line = 70)
    public static void method1720(int arg0) {
        if (arg0 != 31387) {
            field3761 = (class253) null;
        }
        field3759 = null;
        field3761 = null;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(ILjava/awt/Component;)V", line = 99)
    public static final void method1721(int arg0, Component arg1) {
        int var2 = -22 / ((arg0 - 44) / 32);
        Method var3 = class137.field2194;
        if (var3 != null) {
            try {
                var3.invoke(arg1, Boolean.FALSE);
            } catch (Throwable var5) {
            }
        }
        field3765++;
        arg1.addKeyListener(class81.field1099);
        arg1.addFocusListener(class81.field1099);
    }
}
