import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gda")
public class class51 {

    @OriginalMember(owner = "client!gda", name = "a", descriptor = "B")
    public byte field709;

    @OriginalMember(owner = "client!gda", name = "c", descriptor = "B")
    public byte field711;

    @OriginalMember(owner = "client!gda", name = "f", descriptor = "S")
    public short field714;

    @OriginalMember(owner = "client!gda", name = "b", descriptor = "Lgb;")
    public class202 field710;

    @OriginalMember(owner = "client!gda", name = "d", descriptor = "Ldb;")
    public static class298 field712 = new class298(32, 8);

    @OriginalMember(owner = "client!gda", name = "i", descriptor = "Ldb;")
    public static class298 field717 = new class298(40, 0);

    @OriginalMember(owner = "client!gda", name = "j", descriptor = "[Lvt;")
    public static class280[] field718 = new class280[1024];

    @OriginalMember(owner = "client!gda", name = "e", descriptor = "I")
    public static int field713;

    @OriginalMember(owner = "client!gda", name = "g", descriptor = "I")
    public static int field715;

    @OriginalMember(owner = "client!gda", name = "h", descriptor = "I")
    public static int field716;

    @OriginalMember(owner = "client!gda", name = "k", descriptor = "I")
    public static int field719;

    @OriginalMember(owner = "client!gda", name = "a", descriptor = "(Z)V")
    public static final void method346(boolean arg0) {
        field715++;
        if (!arg0) {
            method346(true);
        }
        class398.field5290 = 0;
        class480.field6411.method3255((byte) -95);
        class480.field6411.method3265(class8.field192, (byte) -75);
        class398.field5290++;
    }

    @OriginalMember(owner = "client!gda", name = "a", descriptor = "(JI)V")
    public static final void method347(long arg0, int arg1) {
        try {
            if (arg1 < 4) {
                method348(-107);
            }
            Thread.sleep(arg0);
        } catch (InterruptedException var3) {
        }
        field716++;
    }

    @OriginalMember(owner = "client!gda", name = "a", descriptor = "(I)V")
    public static void method348(int arg0) {
        if (arg0 != -29682) {
            method347(-32L, -64);
        }
        field712 = null;
        field717 = null;
        field718 = null;
    }

    @OriginalMember(owner = "client!gda", name = "<init>", descriptor = "(Lgb;III)V")
    public class51(class202 arg0, int arg1, int arg2, int arg3) {
        this.field709 = (byte) arg2;
        this.field711 = (byte) arg3;
        this.field714 = (short) arg1;
        this.field710 = arg0;
    }
}
