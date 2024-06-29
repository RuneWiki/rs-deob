import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kv")
public class class16 {

    @OriginalMember(owner = "client!kv", name = "h", descriptor = "Lme;")
    private class668 field186 = new class668(64);

    @OriginalMember(owner = "client!kv", name = "g", descriptor = "Lpe;")
    private class615 field185;

    @OriginalMember(owner = "client!kv", name = "b", descriptor = "I")
    public static int field180;

    @OriginalMember(owner = "client!kv", name = "c", descriptor = "I")
    public static int field181;

    @OriginalMember(owner = "client!kv", name = "d", descriptor = "I")
    public static int field182;

    @OriginalMember(owner = "client!kv", name = "e", descriptor = "I")
    public static int field183;

    @OriginalMember(owner = "client!kv", name = "f", descriptor = "I")
    public static int field184;

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "Lpe;")
    public static class615 field179;

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(IB)Ljh;", line = 5)
    public final class501 method92(int arg0, byte arg1) {
        field184++;
        class668 var3 = this.field186;
        class501 var4;
        synchronized (this.field186) {
            var4 = (class501) this.field186.method3655(-117, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        class615 var5 = this.field185;
        byte[] var6;
        synchronized (this.field185) {
            var6 = this.field185.method3346(-1, 32, arg0);
        }
        class501 var7 = new class501();
        if (var6 != null) {
            var7.method2709(0, new class418(var6));
        }
        class668 var8 = this.field186;
        synchronized (this.field186) {
            this.field186.method3650((long) arg0, -121, var7);
        }
        if (arg1 != 24) {
            this.method93(39);
        }
        return var7;
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(I)V", line = 37)
    public final void method93(int arg0) {
        field183++;
        if (arg0 != 32156) {
            this.method93(-14);
        }
        class668 var2 = this.field186;
        synchronized (this.field186) {
            this.field186.method3658(0);
        }
    }

    @OriginalMember(owner = "client!kv", name = "b", descriptor = "(I)V", line = 53)
    public static void method94(int arg0) {
        if (arg0 != 32486) {
            field179 = null;
        }
        field179 = null;
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(B)V", line = 64)
    public final void method95(byte arg0) {
        int var2 = -103 / ((-arg0 - 69) / 43);
        field182++;
        class668 var3 = this.field186;
        synchronized (this.field186) {
            this.field186.method3656((byte) 0);
        }
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(II)V", line = 79)
    public final void method96(int arg0, int arg1) {
        class668 var3 = this.field186;
        synchronized (this.field186) {
            this.field186.method3659(-97, arg0);
            if (arg1 != 5776) {
                this.field185 = null;
            }
        }
        field181++;
    }

    @OriginalMember(owner = "client!kv", name = "<init>", descriptor = "(Lvd;ILpe;)V", line = 96)
    public class16(class635 arg0, int arg1, class615 arg2) {
        this.field185 = arg2;
        this.field185.method3341(32, -19046);
    }
}
