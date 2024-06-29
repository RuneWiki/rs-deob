import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sr")
public class class429 {

    @OriginalMember(owner = "client!sr", name = "f", descriptor = "Luaa;")
    private class395 field6251 = new class395(64);

    @OriginalMember(owner = "client!sr", name = "p", descriptor = "Luaa;")
    public class395 field6261 = new class395(64);

    @OriginalMember(owner = "client!sr", name = "d", descriptor = "Lgp;")
    public class561 field6249;

    @OriginalMember(owner = "client!sr", name = "i", descriptor = "Lgp;")
    private class561 field6254;

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "I")
    public static int field6246 = 0;

    @OriginalMember(owner = "client!sr", name = "l", descriptor = "Z")
    public static boolean field6257 = false;

    @OriginalMember(owner = "client!sr", name = "b", descriptor = "Lbv;")
    public static class567 field6247 = new class567("Discard", "Ablegen", "Jeter", "Descartar");

    @OriginalMember(owner = "client!sr", name = "n", descriptor = "Lbv;")
    public static class567 field6259;

    @OriginalMember(owner = "client!sr", name = "o", descriptor = "F")
    public static float field6260;

    @OriginalMember(owner = "client!sr", name = "c", descriptor = "I")
    public static int field6248;

    @OriginalMember(owner = "client!sr", name = "e", descriptor = "I")
    public static int field6250;

    @OriginalMember(owner = "client!sr", name = "g", descriptor = "I")
    public static int field6252;

    @OriginalMember(owner = "client!sr", name = "h", descriptor = "I")
    public static int field6253;

    @OriginalMember(owner = "client!sr", name = "j", descriptor = "I")
    public static int field6255;

    @OriginalMember(owner = "client!sr", name = "k", descriptor = "I")
    public static int field6256;

    @OriginalMember(owner = "client!sr", name = "m", descriptor = "I")
    public static int field6258;

    static {
        new class567(" joined the channel.", " hat den Chatraum betreten.", " a rejoint le canal.", " entrou no canal.");
        new class567("Ok", "Okay", "OK", "Ok");
        field6259 = new class567("K", "T", "K", "K");
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(I)V", line = 4)
    public final void method2553(int arg0) {
        if (arg0 != 64) {
            method2554(-50);
        }
        class395 var2 = this.field6251;
        synchronized (this.field6251) {
            this.field6251.method2406(arg0 + 12);
        }
        field6255++;
        class395 var3 = this.field6261;
        synchronized (this.field6261) {
            this.field6261.method2406(-128);
        }
    }

    @OriginalMember(owner = "client!sr", name = "b", descriptor = "(I)V", line = 30)
    public static void method2554(int arg0) {
        if (arg0 == -1) {
            field6247 = null;
            field6259 = null;
        }
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(B)V", line = 45)
    public static final void method2555(byte arg0) {
        class555.field7857 = -1;
        int var1 = 103 % ((arg0 - 61) / 42);
        class531.field7382 = null;
        field6256++;
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(II)V", line = 56)
    public final void method2556(int arg0, int arg1) {
        field6258++;
        class395 var3 = this.field6251;
        synchronized (this.field6251) {
            if (arg1 != -21457) {
                method2554(-58);
            }
            this.field6251.method2397(arg0, (byte) -96);
        }
        class395 var4 = this.field6261;
        synchronized (this.field6261) {
            this.field6261.method2397(arg0, (byte) -70);
        }
    }

    @OriginalMember(owner = "client!sr", name = "b", descriptor = "(II)Lrt;", line = 72)
    public final class169 method2557(int arg0, int arg1) {
        field6248++;
        class395 var3 = this.field6251;
        class169 var4;
        synchronized (this.field6251) {
            var4 = (class169) this.field6251.method2407(false, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class561 var5 = this.field6254;
        byte[] var6;
        synchronized (this.field6254) {
            var6 = this.field6254.method3175(arg1, (byte) -53, arg0);
        }
        class169 var7 = new class169();
        var7.field2460 = this;
        if (var6 != null) {
            var7.method1171(-1, new class268(var6));
        }
        class395 var8 = this.field6251;
        synchronized (this.field6251) {
            this.field6251.method2408(var7, (long) arg1, -121);
            return var7;
        }
    }

    @OriginalMember(owner = "client!sr", name = "b", descriptor = "(B)V", line = 101)
    public final void method2558(byte arg0) {
        class395 var2 = this.field6251;
        synchronized (this.field6251) {
            this.field6251.method2404((byte) -74);
        }
        if (arg0 != -50) {
            return;
        }
        field6253++;
        class395 var3 = this.field6261;
        synchronized (this.field6261) {
            this.field6261.method2404((byte) -119);
        }
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(III)V", line = 144)
    public final void method2559(int arg0, int arg1, int arg2) {
        field6250++;
        this.field6251 = new class395(arg2);
        int var4 = 105 / ((-arg0 - 45) / 47);
        this.field6261 = new class395(arg1);
    }

    @OriginalMember(owner = "client!sr", name = "<init>", descriptor = "(Ljc;ILgp;Lgp;)V", line = 165)
    public class429(class584 arg0, int arg1, class561 arg2, class561 arg3) {
        this.field6249 = arg3;
        this.field6254 = arg2;
        this.field6254.method3164(34, true);
    }
}
