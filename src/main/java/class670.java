import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hn")
public class class670 {

    @OriginalMember(owner = "client!hn", name = "d", descriptor = "Lmq;")
    private class472 field9631 = new class472(128);

    @OriginalMember(owner = "client!hn", name = "m", descriptor = "Lmq;")
    public class472 field9640 = new class472(64);

    @OriginalMember(owner = "client!hn", name = "e", descriptor = "Ljn;")
    private class668 field9632;

    @OriginalMember(owner = "client!hn", name = "j", descriptor = "Ljn;")
    public class668 field9637;

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "Ljk;")
    public static class585 field9628 = new class585(16, 2);

    @OriginalMember(owner = "client!hn", name = "l", descriptor = "F")
    public static float field9639;

    @OriginalMember(owner = "client!hn", name = "b", descriptor = "I")
    public static int field9629;

    @OriginalMember(owner = "client!hn", name = "f", descriptor = "I")
    public static int field9633;

    @OriginalMember(owner = "client!hn", name = "g", descriptor = "I")
    public static int field9634;

    @OriginalMember(owner = "client!hn", name = "h", descriptor = "I")
    public static int field9635;

    @OriginalMember(owner = "client!hn", name = "i", descriptor = "I")
    public static int field9636;

    @OriginalMember(owner = "client!hn", name = "k", descriptor = "I")
    public static int field9638;

    @OriginalMember(owner = "client!hn", name = "c", descriptor = "Ljn;")
    public static class668 field9630;

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(III)V", line = 3)
    public final void method3815(int arg0, int arg1, int arg2) {
        this.field9631 = new class472(arg0);
        if (arg2 != -13841) {
            this.field9637 = null;
        }
        field9638++;
        this.field9640 = new class472(arg1);
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(II)Lvc;", line = 15)
    public final class289 method3816(int arg0, int arg1) {
        field9634++;
        class472 var3 = this.field9631;
        class289 var4;
        synchronized (this.field9631) {
            var4 = (class289) this.field9631.method2766(-123, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class668 var5 = this.field9632;
        byte[] var6;
        synchronized (this.field9632) {
            var6 = this.field9632.method3800(arg1, 36, (byte) -92);
        }
        class289 var7 = new class289();
        int var8 = -64 / ((-arg0 - 54) / 32);
        var7.field3915 = this;
        var7.field3923 = arg1;
        if (var6 != null) {
            var7.method1722(new class389(var6), true);
        }
        var7.method1717(21354);
        class472 var9 = this.field9631;
        synchronized (this.field9631) {
            this.field9631.method2772(var7, true, (long) arg1);
            return var7;
        }
    }

    @OriginalMember(owner = "client!hn", name = "b", descriptor = "(II)V", line = 49)
    public final void method3817(int arg0, int arg1) {
        field9629++;
        class472 var3 = this.field9631;
        synchronized (this.field9631) {
            this.field9631.method2777(arg1, 84);
        }
        class472 var4 = this.field9640;
        synchronized (this.field9640) {
            int var5 = 28 / ((-arg0 - 47) / 46);
            this.field9640.method2777(arg1, 101);
        }
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(I)V", line = 66)
    public final void method3818(int arg0) {
        class472 var2 = this.field9631;
        synchronized (this.field9631) {
            this.field9631.method2776(false);
        }
        field9633++;
        class472 var3 = this.field9640;
        synchronized (this.field9640) {
            this.field9640.method2776(false);
            if (arg0 != -23182) {
                this.field9632 = null;
            }
        }
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(B)V", line = 82)
    public final void method3819(byte arg0) {
        class472 var2 = this.field9631;
        synchronized (this.field9631) {
            this.field9631.method2778((byte) 125);
        }
        field9636++;
        if (arg0 != 82) {
            field9639 = 1.8433635F;
        }
        class472 var3 = this.field9640;
        synchronized (this.field9640) {
            this.field9640.method2778((byte) 106);
        }
    }

    @OriginalMember(owner = "client!hn", name = "b", descriptor = "(I)V", line = 106)
    public static void method3820(int arg0) {
        field9628 = null;
        if (arg0 > -58) {
            method3820(46);
        }
        field9630 = null;
    }

    @OriginalMember(owner = "client!hn", name = "<init>", descriptor = "(Ler;ILjn;Ljn;)V", line = 132)
    public class670(class90 arg0, int arg1, class668 arg2, class668 arg3) {
        this.field9632 = arg2;
        this.field9637 = arg3;
        this.field9632.method3805(36, false);
    }
}
