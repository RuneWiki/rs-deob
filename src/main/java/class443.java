import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pl")
public class class443 extends class86 {

    @OriginalMember(owner = "client!pl", name = "o", descriptor = "I")
    public int field6467;

    @OriginalMember(owner = "client!pl", name = "p", descriptor = "I")
    public int field6468;

    @OriginalMember(owner = "client!pl", name = "q", descriptor = "Lum;")
    public static class347 field6469 = new class347();

    @OriginalMember(owner = "client!pl", name = "u", descriptor = "Lpj;")
    public static class94 field6473 = new class94(2);

    @OriginalMember(owner = "client!pl", name = "r", descriptor = "I")
    public static int field6470;

    @OriginalMember(owner = "client!pl", name = "s", descriptor = "I")
    public static int field6471;

    @OriginalMember(owner = "client!pl", name = "t", descriptor = "I")
    public static int field6472;

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(I)V")
    public static void method2589(int arg0) {
        field6473 = null;
        if (arg0 == 0) {
            field6469 = null;
        }
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(IBII)I")
    public static final int method2590(int arg0, byte arg1, int arg2, int arg3) {
        field6471++;
        int var4 = arg3 & 0x3;
        if (arg1 != -112) {
            method2591(-41);
        }
        if (var4 == 0) {
            return arg2;
        } else if (var4 == 1) {
            return arg0;
        } else if (var4 == 2) {
            return 1023 - arg2;
        } else {
            return 1023 - arg0;
        }
    }

    @OriginalMember(owner = "client!pl", name = "c", descriptor = "(I)Ljq;")
    public static final class338 method2591(int arg0) {
        field6472++;
        if (arg0 < 73) {
            return null;
        }
        class338 var1 = (class338) class134.field1710.method2347((byte) -118);
        if (var1 != null) {
            var1.method536(false);
            var1.method589((byte) 51);
            return var1;
        }
        class338 var2;
        do {
            var2 = (class338) class151.field1952.method2347((byte) -112);
            if (var2 == null) {
                return null;
            }
            if (var2.method2051(0) > class109.method653(false)) {
                return null;
            }
            var2.method536(false);
            var2.method589((byte) 51);
        } while ((Long.MIN_VALUE & var2.field1291) == 0L);
        return var2;
    }

    @OriginalMember(owner = "client!pl", name = "<init>", descriptor = "(II)V")
    public class443(int arg0, int arg1) {
        this.field6467 = arg1;
        this.field6468 = arg0;
    }

    static {
        new class194("You have been temporarily muted due to breaking a rule.", "Aufgrund eines Regelverstoßes wurdest du vorübergehend stumm geschaltet.", "La messagerie instantanée a été temporairement bloquée suite à une infraction.", "Você foi temporariamente vetado por ter violado uma regra.");
    }
}
