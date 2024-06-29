import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bw")
public class class329 {

    @OriginalMember(owner = "client!bw", name = "i", descriptor = "Lad;")
    private class11 field4225 = new class11(64);

    @OriginalMember(owner = "client!bw", name = "m", descriptor = "Lad;")
    private class11 field4229 = new class11(100);

    @OriginalMember(owner = "client!bw", name = "c", descriptor = "Ldn;")
    private class201 field4219;

    @OriginalMember(owner = "client!bw", name = "j", descriptor = "Lgp;")
    public static class459 field4226 = new class459(7, 15);

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "I")
    public static int field4217;

    @OriginalMember(owner = "client!bw", name = "b", descriptor = "I")
    public static int field4218;

    @OriginalMember(owner = "client!bw", name = "d", descriptor = "I")
    public static int field4220;

    @OriginalMember(owner = "client!bw", name = "e", descriptor = "I")
    public static int field4221;

    @OriginalMember(owner = "client!bw", name = "f", descriptor = "I")
    public static int field4222;

    @OriginalMember(owner = "client!bw", name = "g", descriptor = "I")
    public static int field4223;

    @OriginalMember(owner = "client!bw", name = "h", descriptor = "I")
    public static int field4224;

    @OriginalMember(owner = "client!bw", name = "k", descriptor = "I")
    public static int field4227;

    @OriginalMember(owner = "client!bw", name = "l", descriptor = "I")
    public static int field4228;

    static {
        new class169("Unable to send message - system busy.", "Deine Nachricht konnte nicht verschickt werden, das System ist derzeit ausgelastet.", "Impossible d'envoyer un message - système occupé.", "Não foi possível enviar a mensagem. O sistema está ocupado.");
    }

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(II)Liu;", line = 10)
    public final class424 method1954(int arg0, int arg1) {
        field4228++;
        class11 var3 = this.field4229;
        class424 var4;
        synchronized (this.field4229) {
            var4 = (class424) this.field4229.method78((long) arg0, (byte) -110);
            if (var4 == null) {
                var4 = new class424(arg0);
                this.field4229.method88((long) arg0, 39, var4);
            }
        }
        synchronized (var4) {
            if (!var4.method2514(-20724)) {
                return null;
            }
        }
        if (arg1 >= -96) {
            this.field4229 = null;
        }
        return var4;
    }

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(B)V", line = 38)
    public static void method1955(byte arg0) {
        if (arg0 < 59) {
            field4217 = -120;
        }
        field4226 = null;
    }

    @OriginalMember(owner = "client!bw", name = "b", descriptor = "(B)V", line = 52)
    public static final void method1956(byte arg0) {
        field4224++;
        class359.field4648.method2088((byte) 116);
        if (arg0 != 7) {
            method1955((byte) 87);
        }
        class19.field328.method2088((byte) 116);
    }

    @OriginalMember(owner = "client!bw", name = "b", descriptor = "(II)V", line = 64)
    public final void method1957(int arg0, int arg1) {
        field4220++;
        if (arg0 != 7) {
            this.field4219 = null;
        }
        class11 var3 = this.field4225;
        synchronized (this.field4225) {
            this.field4225.method80(-64, arg1);
        }
        class11 var4 = this.field4229;
        synchronized (this.field4229) {
            this.field4229.method80(arg0 - 122, arg1);
        }
    }

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(Z)V", line = 80)
    public static final void method1958(boolean arg0) {
        field4223++;
        class296.field3842 = new class423[class47.field681.method1309((byte) 31)][];
        class221.field2855 = new class423[class47.field681.method1309((byte) 31)][];
        if (arg0) {
            class54.field737 = new boolean[class47.field681.method1309((byte) 31)];
        }
    }

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/Class;", line = 94)
    public static final Class method1959(int arg0, String arg1) throws ClassNotFoundException {
        field4221++;
        if (arg1.equals("B")) {
            return Byte.TYPE;
        } else if (arg1.equals("I")) {
            return Integer.TYPE;
        } else if (arg1.equals("S")) {
            return Short.TYPE;
        } else if (arg0 != 64) {
            return null;
        } else if (arg1.equals("J")) {
            return Long.TYPE;
        } else if (arg1.equals("Z")) {
            return Boolean.TYPE;
        } else if (arg1.equals("F")) {
            return Float.TYPE;
        } else if (arg1.equals("D")) {
            return Double.TYPE;
        } else if (arg1.equals("C")) {
            return Character.TYPE;
        } else {
            return Class.forName(arg1);
        }
    }

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(I)V", line = 133)
    public final void method1960(int arg0) {
        class11 var2 = this.field4225;
        synchronized (this.field4225) {
            this.field4225.method84(50);
        }
        field4222++;
        class11 var3 = this.field4229;
        synchronized (this.field4229) {
            this.field4229.method84(arg0 + 11);
            if (arg0 != 100) {
                method1958(false);
            }
        }
    }

    @OriginalMember(owner = "client!bw", name = "c", descriptor = "(B)V", line = 149)
    public final void method1961(byte arg0) {
        class11 var2 = this.field4225;
        synchronized (this.field4225) {
            this.field4225.method90((byte) -27);
        }
        field4227++;
        class11 var3 = this.field4229;
        synchronized (this.field4229) {
            if (arg0 <= -87) {
                this.field4229.method90((byte) -27);
            }
        }
    }

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(IZ)Lhi;", line = 167)
    public final class44 method1962(int arg0, boolean arg1) {
        field4218++;
        class11 var3 = this.field4225;
        class44 var4;
        synchronized (this.field4225) {
            var4 = (class44) this.field4225.method78((long) arg0, (byte) -114);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field4219.method1313((byte) -123, class370.method2157(arg0, (byte) 20), class335.method1987(arg0, 127));
        class44 var6 = new class44();
        var6.field650 = arg0;
        var6.field637 = this;
        if (var5 != null) {
            var6.method280(-124, new class88(var5));
        }
        var6.method282(arg1);
        class11 var7 = this.field4225;
        synchronized (this.field4225) {
            this.field4225.method88((long) arg0, 72, var6);
            return var6;
        }
    }

    @OriginalMember(owner = "client!bw", name = "<init>", descriptor = "(Lgt;ILdn;Ldn;Ldn;)V", line = 212)
    public class329(class65 arg0, int arg1, class201 arg2, class201 arg3, class201 arg4) {
        this.field4219 = arg2;
        if (this.field4219 != null) {
            int var6 = this.field4219.method1309((byte) 31) - 1;
            this.field4219.method1302(-112, var6);
        }
        class429.method2547(arg4, -114, arg3);
    }
}
