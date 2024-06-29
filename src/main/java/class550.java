import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gp")
public class class550 implements class58 {

    @OriginalMember(owner = "client!gp", name = "n", descriptor = "Lla;")
    private class422 field7850;

    @OriginalMember(owner = "client!gp", name = "d", descriptor = "Lnda;")
    public class268 field7840;

    @OriginalMember(owner = "client!gp", name = "c", descriptor = "[Lct;")
    public static class97[] field7839 = new class97[6];

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "I")
    public static int field7837 = 0;

    @OriginalMember(owner = "client!gp", name = "h", descriptor = "S")
    public static short field7844 = 256;

    @OriginalMember(owner = "client!gp", name = "i", descriptor = "[J")
    public static long[] field7845 = new long[100];

    @OriginalMember(owner = "client!gp", name = "j", descriptor = "I")
    public static int field7846 = 0;

    @OriginalMember(owner = "client!gp", name = "k", descriptor = "Lraa;")
    public static class353 field7847 = null;

    @OriginalMember(owner = "client!gp", name = "e", descriptor = "I")
    public static int field7841;

    @OriginalMember(owner = "client!gp", name = "f", descriptor = "I")
    public static int field7842;

    @OriginalMember(owner = "client!gp", name = "g", descriptor = "I")
    public static int field7843;

    @OriginalMember(owner = "client!gp", name = "l", descriptor = "I")
    public static int field7848;

    @OriginalMember(owner = "client!gp", name = "m", descriptor = "I")
    public static int field7849;

    @OriginalMember(owner = "client!gp", name = "b", descriptor = "Lit;")
    public class34 field7838;

    @OriginalMember(owner = "client!gp", name = "b", descriptor = "(I)V", line = 6)
    public static void method3210(int arg0) {
        field7847 = null;
        if (arg0 != 256) {
            method3211(95, -26, false);
        }
        field7845 = null;
        field7839 = null;
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(IIZ)Z", line = 18)
    public static final boolean method3211(int arg0, int arg1, boolean arg2) {
        field7849++;
        if (arg2) {
            return (arg1 & 0xC580) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(B)Z", line = 29)
    public final boolean method574(byte arg0) {
        if (arg0 <= 96) {
            field7845 = null;
        }
        field7848++;
        return this.field7850.method2621(this.field7840.field4138, -28975);
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(IB)V", line = 58)
    public static final void method3212(int arg0, byte arg1) {
        field7842++;
        class118 var2 = class86.method755(true, 5, arg0);
        if (arg1 > -9) {
            field7839 = null;
        }
        var2.method936(0);
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(ZZ)V", line = 74)
    public void method575(boolean arg0, boolean arg1) {
        if (!arg0) {
            return;
        }
        field7841++;
        if (arg1) {
            int var3 = this.field7840.field4133.method3824(class335.field4917, (byte) -112, this.field7838.method177()) + this.field7840.field4134;
            int var4 = this.field7840.field4141.method2088(this.field7838.method184(), (byte) -119, class614.field8651) + this.field7840.field4142;
            this.field7838.method182(var3, var4);
        }
    }

    @OriginalMember(owner = "client!gp", name = "a", descriptor = "(I)V", line = 102)
    public final void method576(int arg0) {
        field7843++;
        this.field7838 = class451.method2768(this.field7850, -74, this.field7840.field4138);
        if (arg0 != -28886) {
            field7844 = -78;
        }
    }

    @OriginalMember(owner = "client!gp", name = "<init>", descriptor = "(Lla;Lnda;)V", line = 112)
    public class550(class422 arg0, class268 arg1) {
        this.field7850 = arg0;
        this.field7840 = arg1;
    }
}
