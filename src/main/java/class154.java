import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ui")
public class class154 extends class166 implements Runnable {

    @OriginalMember(owner = "client!ui", name = "n", descriptor = "I")
    public int field2009 = -1;

    @OriginalMember(owner = "client!ui", name = "r", descriptor = "Z")
    private boolean field2013 = true;

    @OriginalMember(owner = "client!ui", name = "m", descriptor = "Ljv;")
    private class56 field2008;

    @OriginalMember(owner = "client!ui", name = "k", descriptor = "I")
    public static int field2006;

    @OriginalMember(owner = "client!ui", name = "l", descriptor = "I")
    public static int field2007;

    @OriginalMember(owner = "client!ui", name = "o", descriptor = "I")
    public static int field2010;

    @OriginalMember(owner = "client!ui", name = "q", descriptor = "I")
    public static int field2012;

    @OriginalMember(owner = "client!ui", name = "p", descriptor = "Lwh;")
    public static class101 field2011;

    @OriginalMember(owner = "client!ui", name = "s", descriptor = "[Ljava/lang/String;")
    public static String[] field2014;

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(BLjava/lang/String;)V")
    public static final void method997(byte arg0, String arg1) {
        if (arg0 != -19) {
            return;
        }
        field2006++;
        if (class5.field41 != null) {
            class424.method2582(class82.field1199, -1);
            class57.field831++;
            class538.field7879.method1072((byte) 102, class436.method2652(arg1, (byte) -75));
            class538.field7879.method1071(arg0 - 25624, arg1);
        }
    }

    @OriginalMember(owner = "client!ui", name = "run", descriptor = "()V")
    public final void run() {
        while (this.field2013) {
            this.field2008.method418((byte) 30, this);
        }
        field2010++;
    }

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "(I)V")
    public final void method998(int arg0) {
        field2007++;
        int var2 = 22 / ((13 - arg0) / 49);
        (new Thread(this, "a")).start();
    }

    @OriginalMember(owner = "client!ui", name = "c", descriptor = "(I)V")
    public final void method999(int arg0) {
        field2012++;
        this.field2013 = false;
        if (arg0 <= 86) {
            this.run();
        }
    }

    @OriginalMember(owner = "client!ui", name = "d", descriptor = "(I)V")
    public static void method1000(int arg0) {
        field2014 = null;
        field2011 = null;
        if (arg0 != 30777) {
            method1000(-35);
        }
    }

    @OriginalMember(owner = "client!ui", name = "<init>", descriptor = "(Ljv;)V")
    public class154(class56 arg0) {
        this.field2008 = arg0;
    }
}
