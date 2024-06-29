import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tj")
public class class170 {

    @OriginalMember(owner = "client!tj", name = "f", descriptor = "Lwf;")
    private class117 field2647 = new class117(256);

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "Lte;")
    private class527 field2642;

    @OriginalMember(owner = "client!tj", name = "e", descriptor = "Ln;")
    private class17 field2646;

    @OriginalMember(owner = "client!tj", name = "h", descriptor = "Lada;")
    public static class144 field2649 = new class144(110, 8);

    @OriginalMember(owner = "client!tj", name = "k", descriptor = "Lh;")
    public static class572 field2652 = new class572("Loading JACLIB - ", "Lade JACLIB - ", "Chargement JACLIB - ", "Carregando JACLIB - ");

    @OriginalMember(owner = "client!tj", name = "l", descriptor = "Lsl;")
    public static class391 field2653 = new class391("", 13);

    @OriginalMember(owner = "client!tj", name = "b", descriptor = "I")
    public static int field2643;

    @OriginalMember(owner = "client!tj", name = "c", descriptor = "I")
    public static int field2644;

    @OriginalMember(owner = "client!tj", name = "d", descriptor = "I")
    public static int field2645;

    @OriginalMember(owner = "client!tj", name = "g", descriptor = "I")
    public static int field2648;

    @OriginalMember(owner = "client!tj", name = "i", descriptor = "I")
    public static int field2650;

    @OriginalMember(owner = "client!tj", name = "j", descriptor = "I")
    public static int field2651;

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(I)V", line = 3)
    public final void method1206(int arg0) {
        if (arg0 != 64) {
            this.method1211(66);
        }
        field2644++;
        this.field2647.method837(126);
    }

    @OriginalMember(owner = "client!tj", name = "b", descriptor = "(I)Lrm;", line = 18)
    public static final class349 method1207(int arg0) {
        field2643++;
        try {
            return new class298();
        } catch (Throwable var2) {
            if (arg0 != 110) {
                return null;
            }
            try {
                return (class349) Class.forName("ng").getDeclaredConstructor().newInstance();
            } catch (Throwable var1) {
                return new class273();
            }
        }
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(B)V", line = 42)
    public static void method1208(byte arg0) {
        field2649 = null;
        field2653 = null;
        if (arg0 != -103) {
            field2653 = null;
        }
        field2652 = null;
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(II)Lea;", line = 59)
    public final class468 method1209(int arg0, int arg1) {
        field2645++;
        Object var3 = this.field2647.method842(0, (long) arg0);
        if (var3 != null) {
            return (class468) var3;
        } else if (!this.field2646.method109(arg0, 1680)) {
            return null;
        } else if (arg1 < 95) {
            return null;
        } else {
            class471 var4 = this.field2646.method110(arg0, (byte) 119);
            int var5 = var4.field6651 ? 64 : this.field2642.field7732;
            class468 var7;
            if (var4.field6644 && this.field2642.method423()) {
                float[] var6 = this.field2646.method108(arg0, 0.7F, var5, false, false, var5);
                var7 = new class468(this.field2642, 3553, 34842, var5, var5, var4.field6647 != 0, var6, 6408);
            } else {
                int[] var8;
                if (var4.field6645) {
                    var8 = this.field2646.method111(var5, false, var5, 6925, arg0, 0.7F);
                } else {
                    var8 = this.field2646.method113(var5, true, -4074, var5, 0.7F, arg0);
                }
                var7 = new class468(this.field2642, 3553, 6408, var5, var5, var4.field6647 != 0, var8, false);
            }
            var7.method2824((byte) -126, var4.field6654, var4.field6655);
            this.field2647.method835((byte) 117, (long) arg0, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(IILpc;)Lkr;", line = 108)
    public static final class636 method1210(int arg0, int arg1, class577 arg2) {
        if (arg0 != 8) {
            return null;
        }
        field2650++;
        class636 var3;
        if (class394.field5424 == null) {
            var3 = new class636();
        } else {
            var3 = class394.field5424;
            class394.field5424 = class394.field5424.field9302;
            class212.field3122--;
            var3.field9302 = null;
        }
        var3.field9299 = arg2;
        var3.field9301 = arg1;
        return var3;
    }

    @OriginalMember(owner = "client!tj", name = "c", descriptor = "(I)V", line = 138)
    public final void method1211(int arg0) {
        this.field2647.method834(5, arg0 - 1975);
        field2651++;
        if (arg0 != 1975) {
            this.field2646 = null;
        }
    }

    @OriginalMember(owner = "client!tj", name = "<init>", descriptor = "(Lte;Ln;)V", line = 156)
    public class170(class527 arg0, class17 arg1) {
        this.field2642 = arg0;
        this.field2646 = arg1;
    }
}
