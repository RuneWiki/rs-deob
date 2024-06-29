import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nr")
public class class53 {

    @OriginalMember(owner = "client!nr", name = "c", descriptor = "Lmq;")
    private class472 field851 = new class472(64);

    @OriginalMember(owner = "client!nr", name = "p", descriptor = "Lmq;")
    public class472 field864 = new class472(64);

    @OriginalMember(owner = "client!nr", name = "i", descriptor = "Ljn;")
    public class668 field857;

    @OriginalMember(owner = "client!nr", name = "d", descriptor = "Ljn;")
    private class668 field852;

    @OriginalMember(owner = "client!nr", name = "g", descriptor = "I")
    public static int field855 = 500;

    @OriginalMember(owner = "client!nr", name = "m", descriptor = "[[B")
    public static byte[][] field861 = new byte[50][];

    @OriginalMember(owner = "client!nr", name = "q", descriptor = "I")
    public static int field865 = 0;

    @OriginalMember(owner = "client!nr", name = "b", descriptor = "I")
    public static int field850;

    @OriginalMember(owner = "client!nr", name = "e", descriptor = "I")
    public static int field853;

    @OriginalMember(owner = "client!nr", name = "f", descriptor = "I")
    public static int field854;

    @OriginalMember(owner = "client!nr", name = "h", descriptor = "I")
    public static int field856;

    @OriginalMember(owner = "client!nr", name = "j", descriptor = "I")
    public static int field858;

    @OriginalMember(owner = "client!nr", name = "k", descriptor = "I")
    public static int field859;

    @OriginalMember(owner = "client!nr", name = "l", descriptor = "I")
    public static int field860;

    @OriginalMember(owner = "client!nr", name = "n", descriptor = "I")
    public static int field862;

    @OriginalMember(owner = "client!nr", name = "o", descriptor = "I")
    public static int field863;

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "Lwd;")
    public static class248 field849;

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(ZLjava/lang/String;)I", line = 4)
    public static final int method559(boolean arg0, String arg1) {
        field859++;
        if (arg1 == null) {
            return -1;
        }
        int var2 = 0;
        if (arg0) {
            field861 = null;
        }
        while (var2 < class700.field9897) {
            if (arg1.equalsIgnoreCase(class529.field7730[var2])) {
                return var2;
            }
            var2++;
        }
        return -1;
    }

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(II)V", line = 33)
    public final void method560(int arg0, int arg1) {
        class472 var3 = this.field851;
        synchronized (this.field851) {
            this.field851.method2777(arg0, 61);
        }
        field858++;
        class472 var4 = this.field864;
        synchronized (this.field864) {
            if (arg1 <= -100) {
                this.field864.method2777(arg0, 119);
            }
        }
    }

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(IZI)V", line = 52)
    public final void method561(int arg0, boolean arg1, int arg2) {
        this.field851 = new class472(arg2);
        field863++;
        this.field864 = new class472(arg0);
        if (arg1) {
            this.method561(-42, false, -65);
        }
    }

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(I)V", line = 64)
    public final void method562(int arg0) {
        field862++;
        class472 var2 = this.field851;
        synchronized (this.field851) {
            this.field851.method2778((byte) 122);
            if (arg0 != -1812) {
                field849 = null;
            }
        }
        class472 var3 = this.field864;
        synchronized (this.field864) {
            this.field864.method2778((byte) 120);
        }
    }

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(B)V", line = 86)
    public static void method563(byte arg0) {
        if (arg0 != 80) {
            method566(-66);
        }
        field849 = null;
        field861 = null;
    }

    @OriginalMember(owner = "client!nr", name = "b", descriptor = "(B)V", line = 97)
    public final void method564(byte arg0) {
        class472 var2 = this.field851;
        synchronized (this.field851) {
            this.field851.method2776(false);
        }
        field854++;
        class472 var3 = this.field864;
        synchronized (this.field864) {
            if (arg0 > -39) {
                method563((byte) -120);
            }
            this.field864.method2776(false);
        }
    }

    @OriginalMember(owner = "client!nr", name = "b", descriptor = "(II)Lrn;", line = 118)
    public final class244 method565(int arg0, int arg1) {
        field850++;
        class472 var3 = this.field851;
        class244 var4;
        synchronized (this.field851) {
            var4 = (class244) this.field851.method2766(-127, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class668 var5 = this.field852;
        byte[] var6;
        synchronized (this.field852) {
            var6 = this.field852.method3800(arg1, 34, (byte) -92);
        }
        class244 var7 = new class244();
        if (arg0 <= 35) {
            return null;
        }
        var7.field3337 = this;
        if (var6 != null) {
            var7.method1478(new class389(var6), 1255404496);
        }
        class472 var8 = this.field851;
        synchronized (this.field851) {
            this.field851.method2772(var7, true, (long) arg1);
            return var7;
        }
    }

    @OriginalMember(owner = "client!nr", name = "b", descriptor = "(I)V", line = 153)
    public static final void method566(int arg0) {
        class261.field3588 = new class377(class424.field6042.method2561(class370.field4980, 0), "", class10.field99, 1003, -1, 0L, 0, 0, true, false);
        field853++;
        if (arg0 < 112) {
            field861 = null;
        }
    }

    @OriginalMember(owner = "client!nr", name = "<init>", descriptor = "(Ler;ILjn;Ljn;)V", line = 184)
    public class53(class90 arg0, int arg1, class668 arg2, class668 arg3) {
        this.field857 = arg3;
        this.field852 = arg2;
        this.field852.method3805(34, false);
    }
}
