import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qk")
public class class12 {

    @OriginalMember(owner = "client!qk", name = "i", descriptor = "Luaa;")
    private class395 field125 = new class395(128);

    @OriginalMember(owner = "client!qk", name = "o", descriptor = "Luaa;")
    public class395 field131 = new class395(64);

    @OriginalMember(owner = "client!qk", name = "h", descriptor = "Lgp;")
    public class561 field124;

    @OriginalMember(owner = "client!qk", name = "k", descriptor = "Lgp;")
    private class561 field127;

    @OriginalMember(owner = "client!qk", name = "b", descriptor = "Lpca;")
    public static class362 field118 = new class362();

    @OriginalMember(owner = "client!qk", name = "d", descriptor = "F")
    public static float field120;

    @OriginalMember(owner = "client!qk", name = "g", descriptor = "F")
    public static float field123;

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "I")
    public static int field117;

    @OriginalMember(owner = "client!qk", name = "c", descriptor = "I")
    public static int field119;

    @OriginalMember(owner = "client!qk", name = "e", descriptor = "I")
    public static int field121;

    @OriginalMember(owner = "client!qk", name = "f", descriptor = "I")
    public static int field122;

    @OriginalMember(owner = "client!qk", name = "l", descriptor = "I")
    public static int field128;

    @OriginalMember(owner = "client!qk", name = "m", descriptor = "I")
    public static int field129;

    @OriginalMember(owner = "client!qk", name = "n", descriptor = "Lhu;")
    public static class484 field130;

    @OriginalMember(owner = "client!qk", name = "j", descriptor = "[I")
    public static int[] field126;

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(III)V", line = 16)
    public final void method67(int arg0, int arg1, int arg2) {
        this.field125 = new class395(arg0);
        if (arg1 == 128) {
            field122++;
            this.field131 = new class395(arg2);
        }
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(II)V", line = 28)
    public final void method68(int arg0, int arg1) {
        field117++;
        if (arg0 <= 19) {
            method72(-64);
        }
        class395 var3 = this.field125;
        synchronized (this.field125) {
            this.field125.method2397(arg1, (byte) -63);
        }
        class395 var4 = this.field131;
        synchronized (this.field131) {
            this.field131.method2397(arg1, (byte) -79);
        }
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(Z)V", line = 46)
    public final void method69(boolean arg0) {
        class395 var2 = this.field125;
        synchronized (this.field125) {
            this.field125.method2406(97);
        }
        field128++;
        class395 var3 = this.field131;
        synchronized (this.field131) {
            this.field131.method2406(-117);
            if (arg0) {
                field130 = null;
            }
        }
    }

    @OriginalMember(owner = "client!qk", name = "b", descriptor = "(II)Lfm;", line = 62)
    public final class192 method70(int arg0, int arg1) {
        field121++;
        class395 var3 = this.field125;
        class192 var4;
        synchronized (this.field125) {
            var4 = (class192) this.field125.method2407(false, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        class561 var5 = this.field127;
        byte[] var6;
        synchronized (this.field127) {
            var6 = this.field127.method3175(arg0, (byte) -53, 36);
        }
        class192 var7 = new class192();
        var7.field2770 = this;
        var7.field2734 = arg0;
        if (var6 != null) {
            var7.method1276(-1, new class268(var6));
        }
        var7.method1275((byte) -4);
        class395 var8 = this.field125;
        synchronized (this.field125) {
            this.field125.method2408(var7, (long) arg0, -113);
        }
        if (arg1 <= 78) {
            this.method71((byte) 47);
        }
        return var7;
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(B)V", line = 96)
    public final void method71(byte arg0) {
        class395 var2 = this.field125;
        synchronized (this.field125) {
            this.field125.method2404((byte) -93);
        }
        if (arg0 > -61) {
            return;
        }
        field119++;
        class395 var3 = this.field131;
        synchronized (this.field131) {
            this.field131.method2404((byte) -108);
        }
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(I)V", line = 114)
    public static void method72(int arg0) {
        field130 = null;
        field118 = null;
        if (arg0 != 36) {
            field118 = null;
        }
        field126 = null;
    }

    @OriginalMember(owner = "client!qk", name = "<init>", descriptor = "(Ljc;ILgp;Lgp;)V", line = 138)
    public class12(class584 arg0, int arg1, class561 arg2, class561 arg3) {
        this.field124 = arg3;
        this.field127 = arg2;
        this.field127.method3164(36, true);
    }
}
