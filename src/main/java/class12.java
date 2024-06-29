import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ds")
public class class12 {

    @OriginalMember(owner = "client!ds", name = "g", descriptor = "Ler;")
    private class157 field197 = new class157(64);

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "Lns;")
    private class438 field191;

    @OriginalMember(owner = "client!ds", name = "f", descriptor = "I")
    public int field196;

    @OriginalMember(owner = "client!ds", name = "e", descriptor = "I")
    public static int field195 = -1;

    @OriginalMember(owner = "client!ds", name = "i", descriptor = "I")
    public static int field199 = 0;

    @OriginalMember(owner = "client!ds", name = "j", descriptor = "Lcm;")
    public static class449 field200 = new class449(42, 3);

    @OriginalMember(owner = "client!ds", name = "k", descriptor = "I")
    public static int field201 = 0;

    @OriginalMember(owner = "client!ds", name = "b", descriptor = "I")
    public static int field192;

    @OriginalMember(owner = "client!ds", name = "c", descriptor = "I")
    public static int field193;

    @OriginalMember(owner = "client!ds", name = "d", descriptor = "I")
    public static int field194;

    @OriginalMember(owner = "client!ds", name = "h", descriptor = "I")
    public static int field198;

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(B)V")
    public final void method100(byte arg0) {
        field198++;
        if (arg0 != 8) {
            field200 = null;
        }
        class157 var2 = this.field197;
        synchronized (this.field197) {
            this.field197.method1022((byte) -34);
        }
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(IB)V")
    public final void method101(int arg0, byte arg1) {
        field192++;
        class157 var3 = this.field197;
        synchronized (this.field197) {
            this.field197.method1016(arg0, (byte) 124);
        }
        if (arg1 != 17) {
            this.field191 = null;
        }
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(II)Ldj;")
    public final class341 method102(int arg0, int arg1) {
        field194++;
        class157 var3 = this.field197;
        class341 var4;
        synchronized (this.field197) {
            var4 = (class341) this.field197.method1013((long) arg0, (byte) -106);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field191.method2650(arg0, -87, arg1);
        class341 var6 = new class341();
        if (var5 != null) {
            var6.method2197(arg1 ^ 0x10, new class91(var5));
        }
        class157 var7 = this.field197;
        synchronized (this.field197) {
            this.field197.method1012(-71, (long) arg0, var6);
            return var6;
        }
    }

    @OriginalMember(owner = "client!ds", name = "b", descriptor = "(B)V")
    public static void method103(byte arg0) {
        field200 = null;
        if (arg0 > -8) {
            field199 = 47;
        }
    }

    @OriginalMember(owner = "client!ds", name = "c", descriptor = "(B)V")
    public final void method104(byte arg0) {
        if (arg0 <= 58) {
            this.method101(-115, (byte) -13);
        }
        class157 var2 = this.field197;
        synchronized (this.field197) {
            this.field197.method1015((byte) 107);
        }
        field193++;
    }

    @OriginalMember(owner = "client!ds", name = "<init>", descriptor = "(Lgo;ILns;)V")
    public class12(class331 arg0, int arg1, class438 arg2) {
        this.field191 = arg2;
        if (this.field191 == null) {
            this.field196 = 0;
        } else {
            this.field196 = this.field191.method2645(1, 16);
        }
    }
}
