import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!im")
public class class353 {

    @OriginalMember(owner = "client!im", name = "f", descriptor = "I")
    public int field4947;

    @OriginalMember(owner = "client!im", name = "a", descriptor = "I")
    private int field4942;

    @OriginalMember(owner = "client!im", name = "b", descriptor = "I")
    public static int field4943;

    @OriginalMember(owner = "client!im", name = "d", descriptor = "I")
    public static int field4945;

    @OriginalMember(owner = "client!im", name = "e", descriptor = "I")
    public static int field4946;

    @OriginalMember(owner = "client!im", name = "g", descriptor = "I")
    public static int field4948;

    @OriginalMember(owner = "client!im", name = "i", descriptor = "I")
    public static int field4950;

    @OriginalMember(owner = "client!im", name = "c", descriptor = "Ljda;")
    public static class277 field4944;

    @OriginalMember(owner = "client!im", name = "h", descriptor = "[Lsa;")
    public static class544[] field4949;

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(III)V")
    public static final void method2201(int arg0, int arg1, int arg2) {
        field4948++;
        class632 var3 = class641.method3699(-112, 6, arg1);
        var3.method3656(0);
        var3.field9198 = arg0;
        if (arg2 <= 53) {
            method2201(-2, -1, 63);
        }
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(B)I")
    public final int method2202(byte arg0) {
        if (arg0 != 16) {
            field4949 = null;
        }
        field4945++;
        return this.field4942;
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(Ljq;BLjq;)V")
    public static final void method2203(class447 arg0, byte arg1, class447 arg2) {
        class118.method650(true, class513.field7142);
        class41.field609++;
        field4950++;
        class272.field3457.method3071(-61, arg0.field6229);
        class272.field3457.method3073(arg2.field6263, -21077);
        class272.field3457.method3089(arg2.field6229, 1972268936);
        class272.field3457.method3044(113, arg0.field6263);
        if (arg1 > -81) {
            method2205((byte) -103);
        }
        class272.field3457.method3044(117, arg2.field6317);
        class272.field3457.method3082(arg0.field6317, 128);
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(JI)V")
    public static final void method2204(long arg0, int arg1) {
        if (arg1 != 7806) {
            field4944 = null;
        }
        field4946++;
        if (arg0 <= 0L) {
            return;
        }
        if (arg0 % 10L == 0L) {
            class266.method1639(arg0 - 1L, arg1 + -7705);
            class266.method1639(1L, arg1 - 7893);
        } else {
            class266.method1639(arg0, -126);
        }
    }

    @OriginalMember(owner = "client!im", name = "<init>", descriptor = "(II)V")
    public class353(int arg0, int arg1) {
        this.field4947 = arg1;
        this.field4942 = arg0;
    }

    @OriginalMember(owner = "client!im", name = "b", descriptor = "(B)V")
    public static void method2205(byte arg0) {
        if (arg0 > 65) {
            field4944 = null;
            field4949 = null;
        }
    }

    @OriginalMember(owner = "client!im", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field4943++;
        throw new IllegalStateException();
    }
}
