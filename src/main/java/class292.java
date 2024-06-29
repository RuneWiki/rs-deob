import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sh")
public class class292 implements Runnable {

    @OriginalMember(owner = "client!sh", name = "f", descriptor = "Z")
    public boolean field5112 = true;

    @OriginalMember(owner = "client!sh", name = "c", descriptor = "Ljava/lang/Object;")
    public Object field5109 = new Object();

    @OriginalMember(owner = "client!sh", name = "j", descriptor = "I")
    public int field5116 = 0;

    @OriginalMember(owner = "client!sh", name = "i", descriptor = "[I")
    public int[] field5115 = new int[500];

    @OriginalMember(owner = "client!sh", name = "k", descriptor = "[I")
    public int[] field5117 = new int[500];

    @OriginalMember(owner = "client!sh", name = "d", descriptor = "[S")
    public static short[] field5110 = new short[256];

    @OriginalMember(owner = "client!sh", name = "h", descriptor = "Lsf;")
    public static class108 field5114 = class140.method973(255, "<img=0>");

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "Lsf;")
    public static class108 field5108 = class140.method973(255, " <col=00ff80>");

    @OriginalMember(owner = "client!sh", name = "g", descriptor = "[I")
    public static int[] field5113 = new int[128];

    @OriginalMember(owner = "client!sh", name = "m", descriptor = "Lsf;")
    public static class108 field5119 = class140.method973(255, "<col=ff0000>");

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "Lcd;")
    public static class69 field5107 = new class69(128);

    @OriginalMember(owner = "client!sh", name = "e", descriptor = "I")
    public static int field5111;

    @OriginalMember(owner = "client!sh", name = "n", descriptor = "I")
    public static int field5120;

    @OriginalMember(owner = "client!sh", name = "l", descriptor = "[S")
    public static short[] field5118;

    @OriginalMember(owner = "client!sh", name = "run", descriptor = "()V", line = 17)
    public final void run() {
        field5111++;
        while (this.field5112) {
            Object var1 = this.field5109;
            synchronized (this.field5109) {
                if (this.field5116 < 500) {
                    this.field5117[this.field5116] = class317.field5456;
                    this.field5115[this.field5116] = class171.field3116;
                    this.field5116++;
                }
            }
            class83.method556(50L, 126);
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/Class;", line = 38)
    public static final Class method2089(String arg0, int arg1) throws ClassNotFoundException {
        field5120++;
        if (arg0.equals("B")) {
            return Byte.TYPE;
        } else if (arg0.equals("I")) {
            return Integer.TYPE;
        } else if (arg0.equals("S")) {
            return Short.TYPE;
        } else if (arg0.equals("J")) {
            return Long.TYPE;
        } else if (arg1 != 500) {
            return (Class) null;
        } else if (arg0.equals("Z")) {
            return Boolean.TYPE;
        } else if (arg0.equals("F")) {
            return Float.TYPE;
        } else if (arg0.equals("D")) {
            return Double.TYPE;
        } else if (arg0.equals("C")) {
            return Character.TYPE;
        } else {
            return Class.forName(arg0);
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(I)V", line = 82)
    public static void method2090(int arg0) {
        field5107 = null;
        field5118 = null;
        field5119 = null;
        field5110 = null;
        if (arg0 != 0) {
            method2090(70);
        }
        field5114 = null;
        field5113 = null;
        field5108 = null;
    }
}
