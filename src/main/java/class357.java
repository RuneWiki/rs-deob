import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dea")
public class class357 {

    @OriginalMember(owner = "client!dea", name = "e", descriptor = "Lgw;")
    private class690 field5124 = new class690(64);

    @OriginalMember(owner = "client!dea", name = "m", descriptor = "Lgw;")
    public class690 field5132 = new class690(2);

    @OriginalMember(owner = "client!dea", name = "i", descriptor = "Luu;")
    private class237 field5128;

    @OriginalMember(owner = "client!dea", name = "b", descriptor = "Luu;")
    public class237 field5121;

    @OriginalMember(owner = "client!dea", name = "c", descriptor = "[Ljava/lang/String;")
    public static String[] field5122 = new String[100];

    @OriginalMember(owner = "client!dea", name = "f", descriptor = "I")
    public static int field5125 = 0;

    @OriginalMember(owner = "client!dea", name = "j", descriptor = "I")
    public static int field5129 = -1;

    @OriginalMember(owner = "client!dea", name = "a", descriptor = "I")
    public static int field5120;

    @OriginalMember(owner = "client!dea", name = "d", descriptor = "I")
    public static int field5123;

    @OriginalMember(owner = "client!dea", name = "g", descriptor = "I")
    public static int field5126;

    @OriginalMember(owner = "client!dea", name = "h", descriptor = "I")
    public static int field5127;

    @OriginalMember(owner = "client!dea", name = "l", descriptor = "I")
    public static int field5131;

    @OriginalMember(owner = "client!dea", name = "k", descriptor = "Luu;")
    public static class237 field5130;

    @OriginalMember(owner = "client!dea", name = "a", descriptor = "(ZI)Lvw;")
    public final class561 method2284(boolean arg0, int arg1) {
        field5131++;
        class690 var3 = this.field5124;
        class561 var4;
        synchronized (this.field5124) {
            var4 = (class561) this.field5124.method3898((byte) -42, (long) arg1);
            if (!arg0) {
                this.method2284(false, -71);
            }
        }
        if (var4 != null) {
            return var4;
        }
        class237 var5 = this.field5128;
        byte[] var6;
        synchronized (this.field5128) {
            var6 = this.field5128.method1572(33, 0, arg1);
        }
        class561 var7 = new class561();
        var7.field7806 = this;
        if (var6 != null) {
            var7.method3299(14524, new class63(var6));
        }
        class690 var8 = this.field5124;
        synchronized (this.field5124) {
            this.field5124.method3899(116, var7, (long) arg1);
            return var7;
        }
    }

    @OriginalMember(owner = "client!dea", name = "a", descriptor = "(I)V")
    public static void method2285(int arg0) {
        int var1 = -95 / ((-arg0 - 45) / 59);
        field5130 = null;
        field5122 = null;
    }

    @OriginalMember(owner = "client!dea", name = "a", descriptor = "(BI)V")
    public final void method2286(byte arg0, int arg1) {
        class690 var3 = this.field5124;
        synchronized (this.field5124) {
            this.field5124.method3896(arg0 + 66, arg1);
        }
        field5127++;
        if (arg0 != -65) {
            this.field5124 = null;
        }
        class690 var4 = this.field5132;
        synchronized (this.field5132) {
            this.field5132.method3896(1, arg1);
        }
    }

    @OriginalMember(owner = "client!dea", name = "a", descriptor = "(B)V")
    public final void method2287(byte arg0) {
        field5126++;
        class690 var2 = this.field5124;
        synchronized (this.field5124) {
            this.field5124.method3906(-101);
        }
        if (arg0 > -81) {
            method2285(76);
        }
        class690 var3 = this.field5132;
        synchronized (this.field5132) {
            this.field5132.method3906(-127);
        }
    }

    @OriginalMember(owner = "client!dea", name = "b", descriptor = "(I)V")
    public final void method2288(int arg0) {
        class690 var2 = this.field5124;
        synchronized (this.field5124) {
            this.field5124.method3902(arg0 - 2);
        }
        if (arg0 != 2) {
            this.field5132 = null;
        }
        field5120++;
        class690 var3 = this.field5132;
        synchronized (this.field5132) {
            this.field5132.method3902(0);
        }
    }

    @OriginalMember(owner = "client!dea", name = "<init>", descriptor = "(Lgp;ILuu;Luu;)V")
    public class357(class553 arg0, int arg1, class237 arg2, class237 arg3) {
        this.field5128 = arg2;
        this.field5121 = arg3;
        this.field5128.method1597(33, 0);
    }
}
