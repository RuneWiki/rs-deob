import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!od")
public class class470 {

    @OriginalMember(owner = "client!od", name = "g", descriptor = "Lmq;")
    private class472 field6567 = new class472(64);

    @OriginalMember(owner = "client!od", name = "m", descriptor = "Lmq;")
    public class472 field6573 = new class472(2);

    @OriginalMember(owner = "client!od", name = "b", descriptor = "Ljn;")
    private class668 field6562;

    @OriginalMember(owner = "client!od", name = "a", descriptor = "Ljn;")
    public class668 field6561;

    @OriginalMember(owner = "client!od", name = "e", descriptor = "Lgfa;")
    public static class696 field6565 = new class696(11, 0, 1, 2);

    @OriginalMember(owner = "client!od", name = "k", descriptor = "Z")
    public static boolean field6571 = false;

    @OriginalMember(owner = "client!od", name = "j", descriptor = "Lmf;")
    public static class385 field6570 = new class385(8);

    @OriginalMember(owner = "client!od", name = "c", descriptor = "I")
    public static int field6563;

    @OriginalMember(owner = "client!od", name = "d", descriptor = "I")
    public static int field6564;

    @OriginalMember(owner = "client!od", name = "f", descriptor = "I")
    public static int field6566;

    @OriginalMember(owner = "client!od", name = "h", descriptor = "I")
    public static int field6568;

    @OriginalMember(owner = "client!od", name = "i", descriptor = "I")
    public static int field6569;

    @OriginalMember(owner = "client!od", name = "l", descriptor = "Lwo;")
    public static class690 field6572;

    @OriginalMember(owner = "client!od", name = "a", descriptor = "([BI)Ljava/lang/String;", line = 3)
    public static final String method2758(byte[] arg0, int arg1) {
        if (arg1 == 33) {
            field6568++;
            return class66.method617(0, arg0.length, false, arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(I)V", line = 14)
    public static void method2759(int arg0) {
        field6570 = null;
        if (arg0 == -23306) {
            field6572 = null;
            field6565 = null;
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(II)V", line = 26)
    public final void method2760(int arg0, int arg1) {
        field6564++;
        class472 var3 = this.field6567;
        synchronized (this.field6567) {
            this.field6567.method2777(arg0, 41);
        }
        class472 var4 = this.field6573;
        synchronized (this.field6573) {
            this.field6573.method2777(arg0, arg1 ^ 0x20);
        }
        if (arg1 != 0) {
            this.method2762(-69);
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(B)V", line = 43)
    public final void method2761(byte arg0) {
        class472 var2 = this.field6567;
        synchronized (this.field6567) {
            this.field6567.method2778((byte) 107);
            int var3 = -120 / ((40 - arg0) / 63);
        }
        field6563++;
        class472 var4 = this.field6573;
        synchronized (this.field6573) {
            this.field6573.method2778((byte) 119);
        }
    }

    @OriginalMember(owner = "client!od", name = "b", descriptor = "(I)V", line = 60)
    public final void method2762(int arg0) {
        if (arg0 != -27411) {
            field6571 = false;
        }
        class472 var2 = this.field6567;
        synchronized (this.field6567) {
            this.field6567.method2776(false);
        }
        field6569++;
        class472 var3 = this.field6573;
        synchronized (this.field6573) {
            this.field6573.method2776(false);
        }
    }

    @OriginalMember(owner = "client!od", name = "b", descriptor = "(II)Lbaa;", line = 81)
    public final class485 method2763(int arg0, int arg1) {
        int var3 = -105 / ((arg1 + 7) / 46);
        field6566++;
        class472 var4 = this.field6567;
        class485 var5;
        synchronized (this.field6567) {
            var5 = (class485) this.field6567.method2766(-122, (long) arg0);
        }
        if (var5 != null) {
            return var5;
        }
        class668 var6 = this.field6562;
        byte[] var7;
        synchronized (this.field6562) {
            var7 = this.field6562.method3800(arg0, 33, (byte) -92);
        }
        class485 var8 = new class485();
        var8.field6794 = this;
        if (var7 != null) {
            var8.method2834(13443, new class389(var7));
        }
        class472 var9 = this.field6567;
        synchronized (this.field6567) {
            this.field6567.method2772(var8, true, (long) arg0);
            return var8;
        }
    }

    @OriginalMember(owner = "client!od", name = "<init>", descriptor = "(Ler;ILjn;Ljn;)V", line = 135)
    public class470(class90 arg0, int arg1, class668 arg2, class668 arg3) {
        this.field6562 = arg2;
        this.field6561 = arg3;
        this.field6562.method3805(33, false);
    }
}
